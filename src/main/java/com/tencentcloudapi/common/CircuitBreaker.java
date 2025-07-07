/*
 * Copyright (c) 2018 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.tencentcloudapi.common;

/**
 * A circuit breaker implementation that protects against system failures
 * by temporarily blocking requests after a threshold of failures is reached.
 * <p>This class uses a state machine with three states: Closed, HalfOpen, and Open.</p>
 */
public class CircuitBreaker {

    /**
     * Settings for the circuit breaker (failure thresholds, timeouts, etc.).
     */
    private Setting setting;

    /**
     * The current state of the circuit breaker (Closed, HalfOpen, or Open).
     */
    private State state = State.Closed;

    /**
     * The current generation of the circuit breaker, used for versioning.
     */
    private long generation;

    /**
     * The time when the current state will expire (in milliseconds).
     */
    private long expiry;

    /**
     * The total number of requests since the last state change.
     */
    private int all;

    /**
     * The number of failed requests since the last state change.
     */
    private int failures;

    /**
     * The number of consecutive successful requests.
     */
    private int consecutiveSuccesses;

    /**
     * The number of consecutive failed requests.
     */
    private int consecutiveFailures;

    /**
     * Default constructor that uses the default settings.
     */
    public CircuitBreaker() {
        this(new Setting());
    }

    /**
     * Constructor that allows specifying custom settings.
     *
     * @param setting The settings to use for the circuit breaker.
     */
    public CircuitBreaker(Setting setting) {
        this.setting = setting;
    }

    /**
     * Attempt to allow a request based on the current state of the circuit breaker.
     *
     * @return A Token that indicates whether the request is allowed or not.
     */
    public Token allow() {
        synchronized (this) {
            long now = System.currentTimeMillis();
            StateResult result = currentState(now);
            if (result.state == State.Open) {
                return new Token(false, generation, this);
            }
            return new Token(true, generation, this);
        }
    }

    /**
     * Reports the outcome of a request to the circuit breaker (success or failure).
     *
     * @param beforeGeneration The generation of the circuit breaker before the request.
     * @param success          A boolean indicating whether the request was successful.
     */
    private void report(long beforeGeneration, boolean success) {
        synchronized (this) {
            long now = System.currentTimeMillis();
            StateResult result = currentState(now);
            if (result.generation != beforeGeneration) {
                return;
            }
            if (success) {
                onSuccess(result.state, now);
            } else {
                onFailure(result.state, now);
            }
        }
    }

    /**
     * Determines the current state of the circuit breaker and performs any necessary transitions.
     *
     * @param now The current time in milliseconds.
     * @return The current state of the circuit breaker.
     */
    private StateResult currentState(long now) {
        switch (state) {
            case Closed:
                if (expiry < now) {
                    toNewGeneration(now);
                }
                break;
            case Open:
                if (expiry < now) {
                    setState(State.HalfOpen, now);
                }
                break;
        }
        return new StateResult(state, generation);
    }

    /**
     * Starts a new generation, resets counters, and sets the expiry time based on the current state.
     *
     * @param now The current time in milliseconds.
     */
    private void toNewGeneration(long now) {
        generation++;
        all = 0;
        failures = 0;
        consecutiveSuccesses = 0;

        switch (state) {
            case Closed:
                expiry = now + setting.windowIntervalMs;
                break;
            case Open:
                expiry = now + setting.timeoutMs;
                break;
            case HalfOpen:
                expiry = 0;
                break;
        }
    }

    /**
     * Sets a new state for the circuit breaker and updates the generation and expiry time.
     *
     * @param newState The new state to set.
     * @param now      The current time in milliseconds.
     */
    private void setState(State newState, long now) {
        if (state == newState) {
            return;
        }

        state = newState;
        toNewGeneration(now);
    }

    /**
     * Handles a successful request and updates the circuit breaker's state accordingly.
     *
     * @param state The current state of the circuit breaker.
     * @param now   The current time in milliseconds.
     */
    private void onSuccess(State state, long now) {
        switch (state) {
            case Closed:
                all++;
                consecutiveSuccesses++;
                consecutiveFailures = 0;
                break;
            case HalfOpen:
                all++;
                consecutiveSuccesses++;
                consecutiveFailures = 0;
                if (all - failures > setting.maxRequests) {
                    setState(State.Closed, now);
                }
                break;
        }
    }

    /**
     * Handles a failed request and updates the circuit breaker's state accordingly.
     *
     * @param state The current state of the circuit breaker.
     * @param now   The current time in milliseconds.
     */
    private void onFailure(State state, long now) {
        switch (state) {
            case Closed:
                all++;
                failures++;
                consecutiveSuccesses = 0;
                consecutiveFailures = 0;
                if (readyToOpen()) {
                    setState(State.Open, now);
                }
                break;
            case HalfOpen:
                setState(State.Open, now);
                break;
        }
    }

    /**
     * Determines if the circuit breaker is ready to transition from Closed to Open based on the failure rate.
     *
     * @return True if the failure rate is above the threshold or there have been too many consecutive failures.
     */
    private boolean readyToOpen() {
        float failPre = (float) failures / (float) all;
        return (failures >= setting.maxFailNum && failPre >= setting.maxFailPercentage)
                || consecutiveFailures > 5;
    }

    /**
     * Enum representing the possible states of the circuit breaker.
     */
    private enum State {
        Closed, HalfOpen, Open,
    }

    /**
     * Settings class for the circuit breaker that defines its behavior.
     */
    public static class Setting {
        // Maximum number of failed requests before the circuit breaker opens.
        public int maxFailNum = 5;

        // Maximum failure percentage before the circuit breaker opens.
        public float maxFailPercentage = 0.75f;

        // Window interval in milliseconds, used to reset the failure counter.
        public long windowIntervalMs = 300 * 1000;

        // Timeout in milliseconds, after which the circuit breaker transitions from Open to HalfOpen.
        public long timeoutMs = 6 * 1000;

        // Maximum number of requests before transitioning from HalfOpen to Closed.
        public int maxRequests;
    }

    /**
     * A helper class to store the current state and generation of the circuit breaker.
     */
    private static class StateResult {
        public State state;
        public long generation;

        public StateResult(State state, long generation) {
            this.state = state;
            this.generation = generation;
        }
    }

    /**
     * A token returned by the circuit breaker to indicate whether a request is allowed.
     */
    public static class Token {
        public boolean allowed;
        private long generation;
        private CircuitBreaker circuitBreaker;

        private Token(boolean allowed, long generation, CircuitBreaker circuitBreaker) {
            this.allowed = allowed;
            this.generation = generation;
            this.circuitBreaker = circuitBreaker;
        }

        /**
         * Report the outcome of a request (success or failure) to the circuit breaker.
         *
         * @param success Whether the request was successful.
         */
        public void report(boolean success) {
            circuitBreaker.report(generation, success);
        }
    }
}
