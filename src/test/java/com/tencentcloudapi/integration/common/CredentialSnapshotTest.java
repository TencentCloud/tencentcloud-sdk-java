package com.tencentcloudapi.integration.common;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.*;

/**
 * Unit tests for {@link Credential#getSnapshot()}.
 *
 * <p>These tests verify the atomicity and consistency guarantees of getSnapshot() both with and
 * without an attached (deprecated) Updater, including a concurrent-refresh scenario.
 */
public class CredentialSnapshotTest {

    @Test
    public void snapshotReturnsCurrentTriple() {
        Credential cred = new Credential("id-1", "key-1", "token-1");
        Credential snap = cred.getSnapshot();
        assertEquals("id-1", snap.getSecretId());
        assertEquals("key-1", snap.getSecretKey());
        assertEquals("token-1", snap.getToken());
    }

    @Test
    public void snapshotIsANewObject() {
        Credential cred = new Credential("id", "key", "token");
        Credential snap = cred.getSnapshot();
        assertNotSame(cred, snap);
    }

    @Test
    public void snapshotHasNoUpdater() {
        // Even if the source credential carries an Updater, the snapshot must not — otherwise
        // the snapshot would mutate on read and lose its point-in-time guarantee.
        Credential.Updater updater = new Credential.Updater() {
            @Override
            public void update(Credential c) throws TencentCloudSDKException {
                // no-op
            }
        };
        @SuppressWarnings("deprecation")
        Credential cred = new Credential("id", "key", "token", updater);
        assertNotNull(cred.getUpdater());
        Credential snap = cred.getSnapshot();
        assertNull(snap.getUpdater());
    }

    @Test
    public void snapshotIsIndependentOfSubsequentSourceMutation() {
        Credential cred = new Credential("id-1", "key-1", "token-1");
        Credential snap = cred.getSnapshot();
        cred.setSecretId("id-2");
        cred.setSecretKey("key-2");
        cred.setToken("token-2");
        // The snapshot must still reflect the values at the time it was taken.
        assertEquals("id-1", snap.getSecretId());
        assertEquals("key-1", snap.getSecretKey());
        assertEquals("token-1", snap.getToken());
    }

    /**
     * A counting Updater that, on each invocation, writes a fresh self-consistent triple into
     * the credential. Used to simulate refreshes driven by the deprecated Updater mechanism.
     */
    private static final class CountingUpdater implements Credential.Updater {
        final AtomicInteger callCount = new AtomicInteger(0);

        @Override
        public void update(Credential c) throws TencentCloudSDKException {
            int n = callCount.incrementAndGet();
            c.setSecretId("id-" + n);
            c.setSecretKey("key-" + n);
            c.setToken("token-" + n);
        }
    }

    @Test
    public void snapshotWithUpdaterTriggersRefreshOnce() {
        CountingUpdater updater = new CountingUpdater();
        @SuppressWarnings("deprecation")
        Credential cred = new Credential("", "", "", updater);
        Credential snap = cred.getSnapshot();
        assertEquals(1, updater.callCount.get());
        // The snapshot reflects the refreshed triple as a self-consistent unit.
        assertEquals("id-1", snap.getSecretId());
        assertEquals("key-1", snap.getSecretKey());
        assertEquals("token-1", snap.getToken());
    }

    /**
     * Concurrent stress test: N threads each call getSnapshot() many times. Every snapshot must
     * be self-consistent — the id/key/token suffix numbers must all match, since the Updater
     * writes them as a single triple under the source credential's monitor.
     *
     * <p>This test would fail for the plain getter sequence getSecretId(); getSecretKey();
     * getToken() under concurrency, because a refresh between two getters would yield e.g.
     * "id-3" + "key-4" + "token-4". getSnapshot() eliminates that race.
     */
    @Test
    public void snapshotConcurrentRefreshesYieldConsistentTriples() throws InterruptedException {
        final CountingUpdater updater = new CountingUpdater();
        @SuppressWarnings("deprecation")
        final Credential cred = new Credential("", "", "", updater);

        final int threads = 8;
        final int iterationsPerThread = 200;
        final ExecutorService pool = Executors.newFixedThreadPool(threads);
        final CountDownLatch done = new CountDownLatch(threads);
        final AtomicReference<String> failure = new AtomicReference<String>(null);

        for (int t = 0; t < threads; t++) {
            pool.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        for (int i = 0; i < iterationsPerThread; i++) {
                            Credential snap = cred.getSnapshot();
                            String id = snap.getSecretId();
                            String key = snap.getSecretKey();
                            String tok = snap.getToken();
                            // Each is of the form "<prefix>-<n>"; all three must share the same n.
                            String idN = id.substring(id.lastIndexOf('-') + 1);
                            String keyN = key.substring(key.lastIndexOf('-') + 1);
                            String tokN = tok.substring(tok.lastIndexOf('-') + 1);
                            if (!idN.equals(keyN) || !idN.equals(tokN)) {
                                failure.compareAndSet(null,
                                        "inconsistent triple: id=" + id + " key=" + key + " token=" + tok);
                                return;
                            }
                        }
                    } finally {
                        done.countDown();
                    }
                }
            });
        }

        pool.shutdown();
        assertTrue("threads did not finish in time",
                done.await(30, TimeUnit.SECONDS));
        assertNull("observed an inconsistent triple: " + failure.get(), failure.get());
        // The Updater must have been called at least once per thread (roughly), and at most
        // once per getSnapshot() call. We only assert the lower bound to keep the test stable
        // across schedulers.
        assertTrue("updater should have been invoked", updater.callCount.get() > 0);
    }
}
