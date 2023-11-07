/*
 * Copyright (c) 2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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


public class CircuitBreaker {
    private Setting setting;
    private State state = State.Closed;
    private long generation;
    private long expiry;
    private int failures;
    private int all;
    private int consecutiveSuccesses;
    private int consecutiveFailures;

    public CircuitBreaker() {
        this(new Setting());
    }
    public CircuitBreaker(Setting setting) {
        this.setting = setting;
    }

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

    private void setState(State newState, long now) {
        if (state == newState) {
            return;
        }

        state = newState;
        toNewGeneration(now);
    }

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

    private boolean readyToOpen() {
        float failPre = (float) failures / (float) all;
        return (failures >= setting.maxFailNum && failPre >= setting.maxFailPercentage)
                || consecutiveFailures > 5;
    }

    private enum State {
        Closed, HalfOpen, Open,
    }

    public static class Setting {
        // max fail nums
        // the default is 5
        public int maxFailNum = 5;
        // max fail percentage
        // the default is 75%
        public float maxFailPercentage = 0.75f;
        // windowIntervalMs decides when to reset counter if the state is StateClosed
        // the default is 5minutes
        public long windowIntervalMs = 300 * 1000;
        // timeout decides when to turn StateOpen to StateHalfOpen
        // the default is 60s
        public long timeoutMs = 6 * 1000;
        // maxRequests decides when to turn StateHalfOpen to StateClosed
        public int maxRequests;
    }

    private static class StateResult {
        public State state;
        public long generation;
        public StateResult(State state, long generation) {
            this.state = state;
            this.generation = generation;
        }
    }

    public static class Token {
        public boolean allowed;
        private long generation;
        private CircuitBreaker circuitBreaker;

        private Token(boolean allowed, long generation, CircuitBreaker circuitBreaker) {
            this.allowed = allowed;
            this.generation = generation;
            this.circuitBreaker = circuitBreaker;
        }

        public void report(boolean success) {
            circuitBreaker.report(generation, success);
        }
    }
}
