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

import com.tencentcloudapi.common.exception.TencentCloudSDKException;

/**
 * Credential has many types in Tencent Cloud Access Management service.
 *
 * <p>We mainly use two of them:
 *
 * <p>Permanent credential: SecretId & SecretKey, can only be obtained from Tencent Cloud Management
 * Console, https://console.cloud.tencent.com/cam/capi.
 *
 * <p>Ephemeral credential, can be obtained from Security Token Service (STS), has three dimensions:
 * SecretId, SecretKey and Token. It will expire after a short time, hence you need to invoke STS
 * API to refresh it.
 *
 * <p><b>Thread-safety and atomicity.</b> The triple (secretId, secretKey, token) is only guaranteed
 * to be read atomically via {@link #getSnapshot()}. The individual {@code getSecretId()},
 * {@code getSecretKey()}, {@code getToken()} getters do NOT guarantee that two consecutive calls
 * observe a consistent triple — a refresh triggered between them may yield an id/key/token
 * mismatch. Any code path that consumes more than one of the three fields together (e.g. request
 * signing) should use {@link #getSnapshot()}.
 */
public class Credential {
    private String secretId;
    private String secretKey;
    private String token;
    private Updater updater;

    public Credential() {
    }

    public Credential(String secretId, String secretKey) {
        this(secretId, secretKey, "");
    }

    public Credential(String secretId, String secretKey, String token) {
        this.secretId = secretId;
        this.secretKey = secretKey;
        this.token = token;
    }

    public Credential(String secretId, String secretKey, String token, Updater updater) {
        this.secretId = secretId;
        this.secretKey = secretKey;
        this.token = token;
        this.updater = updater;
    }

    public Updater getUpdater() {
        return updater;
    }

    public void setUpdater(Updater updater) {
        this.updater = updater;
    }

    /**
     * Returns the secret id, triggering a refresh via the attached {@link Updater} if one is set.
     *
     * <p><b>Backward-compatibility note.</b> This getter calls {@link #tryUpdate()} outside of any
     * synchronization block. Two consequences follow from this:
     * <ol>
     *   <li>Concurrent threads can each enter {@code tryUpdate()} simultaneously, so the
     *       {@link Updater} may be invoked concurrently; well-behaved Updater implementations must
     *       guard against this themselves (e.g. via {@code needRefresh()} checks).</li>
     *   <li>An {@link Updater} that calls back into {@code getSecretId()}, {@code getSecretKey()},
     *       or {@code getToken()} on the same credential will recurse infinitely. Use
     *       {@link #setCredential} for writes inside {@code update()}, never the individual
     *       getters.</li>
     * </ol>
     * Both behaviours are retained for backward compatibility. For any code path that reads more
     * than one of the three fields together, use {@link #getSnapshot()} instead.
     */
    public String getSecretId() {
        tryUpdate();
        return this.secretId;
    }

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    /**
     * Returns the secret key, triggering a refresh via the attached {@link Updater} if one is set.
     *
     * <p>See {@link #getSecretId()} for the backward-compatibility caveats that apply to all three
     * individual getters. Prefer {@link #getSnapshot()} when reading multiple fields together.
     */
    public String getSecretKey() {
        tryUpdate();
        return this.secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    /**
     * Returns the session token, triggering a refresh via the attached {@link Updater} if one is
     * set.
     *
     * <p>See {@link #getSecretId()} for the backward-compatibility caveats that apply to all three
     * individual getters. Prefer {@link #getSnapshot()} when reading multiple fields together.
     */
    public String getToken() {
        tryUpdate();
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Atomically replaces the entire (secretId, secretKey, token) triple under the same monitor
     * used by {@link #getSnapshot()}.
     *
     * <p>Use this instead of three separate {@code setSecretId} / {@code setSecretKey} /
     * {@code setToken} calls whenever you need to publish a freshly-refreshed triple: concurrent
     * readers going through {@link #getSnapshot()} are guaranteed to observe either the old triple
     * or the new triple in its entirety, never a mix of the two. The individual setters do not
     * provide this guarantee and should only be used when no other thread is reading.
     *
     * <p>This method is the intended write-side companion to {@link #getSnapshot()}'s read-side
     * atomicity. {@link Updater} implementations that refresh the triple in place (rather than
     * constructing a new {@code Credential}) should call this method instead of the individual
     * setters.
     *
     * @param secretId  the new secret id.
     * @param secretKey the new secret key.
     * @param token     the new token, may be empty or {@code null} for permanent credentials.
     */
    public void setCredential(String secretId, String secretKey, String token) {
        synchronized (this) {
            this.secretId = secretId;
            this.secretKey = secretKey;
            this.token = token;
        }
    }

    /**
     * Returns a point-in-time, self-consistent copy of the (secretId, secretKey, token) triple.
     *
     * <p>This is the only thread-safe, atomic way to read the credential triple. The refresh hook
     * (if any) is invoked exactly once under a lock, and the three fields are then sampled together
     * into a new {@code Credential} that does not carry an {@link Updater}. Use this in any code
     * path that consumes more than one of the three fields together (e.g. request signing).
     *
     * <p>The returned object should be treated as read-only. It is a fresh instance and mutating it
     * via the setters has no effect on the source credential, but doing so will break the
     * consistency guarantee for the holder of the snapshot.
     *
     * @return a point-in-time copy of the credential triple, with no attached updater.
     */
    public Credential getSnapshot() {
        synchronized (this) {
            tryUpdate();
            return new Credential(secretId, secretKey, token);
        }
    }

    private void tryUpdate() {
        if (updater == null) {
            return;
        }

        try {
            updater.update(this);
        } catch (TencentCloudSDKException e) {
            // wrap as RuntimeException to keep API consistent
            throw new RuntimeException(e);
        }
    }

    public interface Updater {
        void update(Credential credential) throws TencentCloudSDKException;
    }
}
