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

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for {@link CircuitBreaker} state-machine branches not covered by
 * the basic smoke tests in
 * {@code integration/common/CircuitBreakerTest.java}.
 *
 * <p>Covers: failure-percentage threshold, consecutive-failure threshold,
 * HalfOpen success path, stale-generation report discarding, window-interval
 * counter reset, custom {@link CircuitBreaker.Setting} combinations, and
 * {@link EndpointFailoverInterceptor#breakerFor(String)} inheriting the region
 * breaker's settings.
 */
public class CircuitBreakerUnitTest {

    // =================================================================
    //  readyToOpen: maxFailPercentage threshold
    // =================================================================

    /**
     * {@code readyToOpen()} fires when {@code failures >= maxFailNum && failPre
     * >= maxFailPercentage}. To isolate the percentage branch from the
     * consecutive-failure branch (consecutiveFailures > 5) and from the pure
     * count branch, use maxFailNum=6 so the count alone wouldn't fire at 5
     * failures but the conjunction does once both thresholds are met.
     *
     * <p>Sequence with maxFailNum=6, maxFailPercentage=0.75 (default):
     * 3 failures + 1 success + 3 failures = failures=6, all=7, failPre=6/7≈0.857
     * ≥ 0.75 and failures=6 >= 6 → opens. The success keeps consecutiveFailures
     * at 3 on the final failure, so the consecutive branch (consecutiveFailures > 5)
     * does not fire first.
     */
    @Test
    public void testOpensOnFailurePercentageThreshold() {
        CircuitBreaker.Setting setting = new CircuitBreaker.Setting();
        setting.maxFailNum = 6;  // count branch alone needs >= 6
        CircuitBreaker cb = new CircuitBreaker(setting);
        CircuitBreaker.Token t;

        // 3 failures (consecutiveFailures=3, failures=3, all=3).
        for (int i = 0; i < 3; i++) {
            t = cb.allow();
            Assert.assertTrue("call " + (i + 1) + " should be allowed", t.allowed);
            t.report(false);
        }

        // 1 success resets consecutiveFailures but keeps failures=3, all=4.
        t = cb.allow();
        Assert.assertTrue(t.allowed);
        t.report(true);

        // 2 more failures: failures=5, all=6, failPre=5/6≈0.83 ≥ 0.75 but
        // failures=5 < 6 → not open yet (count branch not satisfied).
        for (int i = 0; i < 2; i++) {
            t = cb.allow();
            Assert.assertTrue("failure " + (i + 1) + " should be allowed", t.allowed);
            t.report(false);
        }

        // 3rd failure after success: failures=6 >= 6 and failPre=6/7≈0.857
        // ≥ 0.75 → opens. consecutiveFailures=3 so the consecutive branch
        // is not the trigger.
        t = cb.allow();
        Assert.assertTrue(t.allowed);
        t.report(false);

        t = cb.allow();
        Assert.assertFalse(
                "percentage branch should have opened the breaker", t.allowed);
    }

    // =================================================================
    //  readyToOpen: consecutiveFailures > 5 threshold
    // =================================================================

    /**
     * {@code readyToOpen()}'s second condition: {@code consecutiveFailures > 5}
     * opens the breaker regardless of failure count or percentage. With 5
     * consecutive failures {@code consecutiveFailures == 5} (not > 5), so the
     * breaker stays closed; the 6th consecutive failure trips it.
     */
    @Test
    public void testOpensOnSixConsecutiveFailures() {
        CircuitBreaker cb = new CircuitBreaker();
        CircuitBreaker.Token t;

        // 5 consecutive failures — fails the percentage branch check too
        // (failures=5 >= 5, failPre=1.0 >= 0.75), so this actually opens at 5.
        // To isolate the consecutiveFailures branch we must keep failPre low,
        // but maxFailNum=5 dominates once reached. Use a custom setting where
        // maxFailNum is high so only the consecutive branch can fire.
        CircuitBreaker.Setting setting = new CircuitBreaker.Setting();
        setting.maxFailNum = 100;          // disable the count branch
        setting.maxFailPercentage = 1.0f;  // disable the percentage branch
        cb = new CircuitBreaker(setting);

        // 5 consecutive failures: consecutiveFailures=5, not > 5 → stays closed.
        for (int i = 0; i < 5; i++) {
            t = cb.allow();
            Assert.assertTrue("call " + (i + 1) + " should be allowed", t.allowed);
            t.report(false);
        }

        // Insert a success to prove consecutiveFailures is the trigger, not
        // total failures: reset consecutiveFailures, then accumulate again.
        t = cb.allow();
        Assert.assertTrue(t.allowed);
        t.report(true);

        // 5 more consecutive failures — consecutiveFailures=5 again, still closed.
        for (int i = 0; i < 5; i++) {
            t = cb.allow();
            Assert.assertTrue("call " + (i + 1) + " after reset should be allowed", t.allowed);
            t.report(false);
        }

        // 6th consecutive failure (consecutiveFailures=6 > 5) → opens.
        t = cb.allow();
        Assert.assertTrue(t.allowed);
        t.report(false);

        t = cb.allow();
        Assert.assertFalse("breaker should be open on 6th consecutive failure", t.allowed);
    }

    // =================================================================
    //  HalfOpen success → Closed
    // =================================================================

    /**
     * {@code onSuccess(State.HalfOpen, ...)} transitions to Closed when
     * {@code all - failures > maxRequests}. With default maxRequests=0, the
     * first HalfOpen success (all=1, failures=0, 1-0>0) closes the breaker.
     * This complements {@code integration} testFail5Recover2 which only
     * covers the HalfOpen-failure → re-Open path.
     */
    @Test
    public void testHalfOpenSuccessClosesBreaker() throws InterruptedException {
        CircuitBreaker.Setting setting = new CircuitBreaker.Setting();
        setting.timeoutMs = 100;
        CircuitBreaker cb = new CircuitBreaker(setting);
        CircuitBreaker.Token t;

        // 5 failures → Open.
        for (int i = 0; i < 5; i++) {
            t = cb.allow();
            Assert.assertTrue(t.allowed);
            t.report(false);
        }
        t = cb.allow();
        Assert.assertFalse(t.allowed);

        // Wait past Open timeout → HalfOpen.
        Thread.sleep(setting.timeoutMs + 20);

        // First HalfOpen probe succeeds → Closed.
        t = cb.allow();
        Assert.assertTrue("HalfOpen probe should be allowed", t.allowed);
        t.report(true);

        // Now Closed: subsequent calls are allowed and a fresh failure does
        // not immediately re-open (consecutiveFailures=1, not > 5; failures=1
        // < 5).
        t = cb.allow();
        Assert.assertTrue("Closed after HalfOpen success", t.allowed);
        t.report(false);
        t = cb.allow();
        Assert.assertTrue("single failure in fresh Closed window should not re-open", t.allowed);
    }

    // =================================================================
    //  Stale-generation report is discarded
    // =================================================================

    /**
     * {@code report()} returns early when {@code result.generation !=
     * beforeGeneration}. A token captured before a state-transition-induced
     * generation bump must not affect the new generation's counters.
     *
     * <p>Sequence: 5 failures → Open (gen=1). Capture a token (gen=1) but do
     * not report. Sleep past Open timeout → HalfOpen (gen=2). Reporting the
     * stale gen=1 token with failure must NOT trip HalfOpen back to Open —
     * the next allow must still be permitted (HalfOpen).
     */
    @Test
    public void testStaleGenerationReportIsDiscarded() throws InterruptedException {
        CircuitBreaker.Setting setting = new CircuitBreaker.Setting();
        setting.timeoutMs = 100;
        CircuitBreaker cb = new CircuitBreaker(setting);
        CircuitBreaker.Token t;

        for (int i = 0; i < 5; i++) {
            t = cb.allow();
            Assert.assertTrue(t.allowed);
            t.report(false);
        }
        // Open — capture a token but hold it without reporting.
        CircuitBreaker.Token staleToken = cb.allow();
        Assert.assertFalse(staleToken.allowed);

        // Sleep into HalfOpen (new generation).
        Thread.sleep(setting.timeoutMs + 20);
        CircuitBreaker.Token halfOpenToken = cb.allow();
        Assert.assertTrue("should be in HalfOpen", halfOpenToken.allowed);

        // Report the stale token as a failure — must be discarded.
        staleToken.report(false);

        // The HalfOpen probe should still be viable: reporting it as success
        // should close the breaker. If the stale report had been applied,
        // HalfOpen would have flipped back to Open and the success report
        // would land on a new generation and be discarded, leaving the next
        // allow() rejected.
        halfOpenToken.report(true);
        CircuitBreaker.Token after = cb.allow();
        Assert.assertTrue(
                "stale failure report must not have flipped HalfOpen back to Open",
                after.allowed);
    }

    // =================================================================
    //  windowIntervalMs resets Closed counters
    // =================================================================

    /**
     * In Closed state, when {@code expiry < now} the breaker calls
     * {@code toNewGeneration}, zeroing {@code failures} and {@code all} (but
     * NOT {@code consecutiveFailures} — that field is only reset by a success
     * or a state transition). Verify the window reset by showing that a fresh
     * failure burst opens the breaker later than it would if the counters had
     * carried over.
     *
     * <p>With maxFailNum=5, maxFailPercentage=0.75: 3 failures + 1 success
     * (resets consecutiveFailures) + window expiry + 5 failures. With reset,
     * failures climbs 1..5 and opens on the 5th (failures=5 >= 5, failPre=1.0
     * >= 0.75, consecutiveFailures=5, not > 5). Without reset, failures would
     * be 3+2=5 on the 2nd post-window failure and open early.
     */
    @Test
    public void testWindowIntervalResetsClosedCounters() throws InterruptedException {
        CircuitBreaker.Setting setting = new CircuitBreaker.Setting();
        setting.windowIntervalMs = 200;
        setting.timeoutMs = 200;
        CircuitBreaker cb = new CircuitBreaker(setting);
        CircuitBreaker.Token t;

        // 3 failures (failures=3, all=3, consecutiveFailures=3).
        for (int i = 0; i < 3; i++) {
            t = cb.allow();
            Assert.assertTrue(t.allowed);
            t.report(false);
        }

        // 1 success: consecutiveFailures=0, failures=3, all=4.
        t = cb.allow();
        Assert.assertTrue(t.allowed);
        t.report(true);

        // Wait past the Closed window so the next allow() starts a new
        // generation with zeroed failures/all.
        Thread.sleep(setting.windowIntervalMs + 100);

        // 4 post-window failures: with reset, failures=4 < 5 → still closed.
        // (consecutiveFailures=4, not > 5.) Without reset, failures would be
        // 3+4=7 and the breaker would have opened at the 2nd failure here.
        for (int i = 0; i < 4; i++) {
            t = cb.allow();
            Assert.assertTrue(
                    "failure " + (i + 1) + " after reset should be allowed", t.allowed);
            t.report(false);
        }

        // 5th post-window failure: failures=5 >= 5, failPre=5/5=1.0 >= 0.75 → opens.
        t = cb.allow();
        Assert.assertTrue(t.allowed);
        t.report(false);

        t = cb.allow();
        Assert.assertFalse(
                "breaker should open once failures re-accumulates past threshold",
                t.allowed);
    }

    // =================================================================
    //  Custom Setting combinations
    // =================================================================

    /**
     * Exercises non-default {@link CircuitBreaker.Setting} values together:
     * maxFailNum=3 lowers the count threshold; maxFailPercentage=0.5 lowers
     * the percentage threshold; maxRequests=2 requires more than 2
     * HalfOpen successes (with no failures) before closing.
     */
    @Test
    public void testCustomSettingCombination() throws InterruptedException {
        CircuitBreaker.Setting setting = new CircuitBreaker.Setting();
        setting.maxFailNum = 3;
        setting.maxFailPercentage = 0.5f;
        setting.timeoutMs = 100;
        setting.maxRequests = 2;
        CircuitBreaker cb = new CircuitBreaker(setting);
        CircuitBreaker.Token t;

        // 3 failures, failPre=1.0 >= 0.5 and failures=3 >= 3 → opens on 3rd.
        for (int i = 0; i < 3; i++) {
            t = cb.allow();
            Assert.assertTrue(t.allowed);
            t.report(false);
        }
        t = cb.allow();
        Assert.assertFalse("custom maxFailNum=3 should open after 3 failures", t.allowed);

        // Sleep into HalfOpen.
        Thread.sleep(setting.timeoutMs + 20);

        // maxRequests=2: need all - failures > 2, i.e. at least 3 successes.
        // 2 successes → all=2, failures=0, 2-0=2 not > 2 → stays HalfOpen.
        for (int i = 0; i < 2; i++) {
            t = cb.allow();
            Assert.assertTrue("HalfOpen probe " + (i + 1) + " should be allowed", t.allowed);
            t.report(true);
        }
        // 3rd success → all=3, 3-0=3 > 2 → Closed.
        t = cb.allow();
        Assert.assertTrue("HalfOpen probe 3 should be allowed", t.allowed);
        t.report(true);

        // Closed again — fresh allow must succeed and a single failure must
        // not re-open (failures=1 < 3).
        t = cb.allow();
        Assert.assertTrue("should be Closed after 3 HalfOpen successes", t.allowed);
        t.report(false);
        t = cb.allow();
        Assert.assertTrue("single failure should not re-open custom-threshold breaker", t.allowed);
    }

    // =================================================================
    //  EndpointFailoverInterceptor.newBreaker inherits regionBreaker setting
    // =================================================================

    /**
     * {@link EndpointFailoverInterceptor#breakerFor(String)} calls
     * {@code newBreaker()}, which — when a region breaker has been set —
     * constructs the per-host breaker with {@code regionBreaker.getSetting()}
     * instead of the default. Verify the inherited setting takes effect by
     * checking the per-host breaker opens after the region breaker's custom
     * maxFailNum, not the default 5.
     */
    @Test
    public void testNewBreakerInheritsRegionBreakerSetting() throws Exception {
        // Build an interceptor via reflection: the constructor needs an
        // AbstractClient, but newBreaker()/breakerFor()/setRegionBreaker()
        // only read client.getClientProfile().getBackupEndpoint() in the
        // constructor. Use a real CvmClient with a default profile.
        com.tencentcloudapi.common.profile.ClientProfile profile =
                new com.tencentcloudapi.common.profile.ClientProfile();
        com.tencentcloudapi.cvm.v20170312.CvmClient client =
                new com.tencentcloudapi.cvm.v20170312.CvmClient(
                        new Credential("AKIDTEST", "SKTEST"), "ap-guangzhou", profile);

        EndpointFailoverInterceptor interceptor =
                new EndpointFailoverInterceptor(client);

        CircuitBreaker.Setting regionSetting = new CircuitBreaker.Setting();
        regionSetting.maxFailNum = 3;
        regionSetting.maxFailPercentage = 1.0f; // isolate the count branch
        CircuitBreaker regionBreaker = new CircuitBreaker(regionSetting);
        interceptor.setRegionBreaker(regionBreaker);

        // Trigger creation of a per-host breaker.
        String host = "cvm.tencentcloudapi.com";
        CircuitBreaker perHost = interceptor.breakerFor(host);

        // The new breaker should share the region breaker's Setting instance
        // (newBreaker returns new CircuitBreaker(regionBreaker.getSetting())).
        Assert.assertSame(
                "per-host breaker should inherit regionBreaker's Setting instance",
                regionSetting, perHost.getSetting());

        // Behavioural check: opens after 3 failures (region's maxFailNum),
        // not 5 (default). With maxFailPercentage=1.0f the percentage branch
        // never fires, so only the count branch (failures >= 3) can open it.
        CircuitBreaker.Token t;
        for (int i = 0; i < 3; i++) {
            t = perHost.allow();
            Assert.assertTrue("failure " + (i + 1) + " should be allowed", t.allowed);
            t.report(false);
        }
        t = perHost.allow();
        Assert.assertFalse(
                "inherited maxFailNum=3 should open after 3 failures", t.allowed);
    }
}
