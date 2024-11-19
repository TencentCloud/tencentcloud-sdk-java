/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.vod.v20240718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Credentials extends AbstractModel {

    /**
    * 访问凭证 ID。
    */
    @SerializedName("AccessKeyId")
    @Expose
    private String AccessKeyId;

    /**
    * 访问凭证 Key。
    */
    @SerializedName("SecretAccessKey")
    @Expose
    private String SecretAccessKey;

    /**
    * 访问凭证 Token，长度和绑定的策略有关，最长不超过 4096 字节。
    */
    @SerializedName("SessionToken")
    @Expose
    private String SessionToken;

    /**
    * 访问凭证的过期时间。
    */
    @SerializedName("Expiration")
    @Expose
    private String Expiration;

    /**
     * Get 访问凭证 ID。 
     * @return AccessKeyId 访问凭证 ID。
     */
    public String getAccessKeyId() {
        return this.AccessKeyId;
    }

    /**
     * Set 访问凭证 ID。
     * @param AccessKeyId 访问凭证 ID。
     */
    public void setAccessKeyId(String AccessKeyId) {
        this.AccessKeyId = AccessKeyId;
    }

    /**
     * Get 访问凭证 Key。 
     * @return SecretAccessKey 访问凭证 Key。
     */
    public String getSecretAccessKey() {
        return this.SecretAccessKey;
    }

    /**
     * Set 访问凭证 Key。
     * @param SecretAccessKey 访问凭证 Key。
     */
    public void setSecretAccessKey(String SecretAccessKey) {
        this.SecretAccessKey = SecretAccessKey;
    }

    /**
     * Get 访问凭证 Token，长度和绑定的策略有关，最长不超过 4096 字节。 
     * @return SessionToken 访问凭证 Token，长度和绑定的策略有关，最长不超过 4096 字节。
     */
    public String getSessionToken() {
        return this.SessionToken;
    }

    /**
     * Set 访问凭证 Token，长度和绑定的策略有关，最长不超过 4096 字节。
     * @param SessionToken 访问凭证 Token，长度和绑定的策略有关，最长不超过 4096 字节。
     */
    public void setSessionToken(String SessionToken) {
        this.SessionToken = SessionToken;
    }

    /**
     * Get 访问凭证的过期时间。 
     * @return Expiration 访问凭证的过期时间。
     */
    public String getExpiration() {
        return this.Expiration;
    }

    /**
     * Set 访问凭证的过期时间。
     * @param Expiration 访问凭证的过期时间。
     */
    public void setExpiration(String Expiration) {
        this.Expiration = Expiration;
    }

    public Credentials() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Credentials(Credentials source) {
        if (source.AccessKeyId != null) {
            this.AccessKeyId = new String(source.AccessKeyId);
        }
        if (source.SecretAccessKey != null) {
            this.SecretAccessKey = new String(source.SecretAccessKey);
        }
        if (source.SessionToken != null) {
            this.SessionToken = new String(source.SessionToken);
        }
        if (source.Expiration != null) {
            this.Expiration = new String(source.Expiration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessKeyId", this.AccessKeyId);
        this.setParamSimple(map, prefix + "SecretAccessKey", this.SecretAccessKey);
        this.setParamSimple(map, prefix + "SessionToken", this.SessionToken);
        this.setParamSimple(map, prefix + "Expiration", this.Expiration);

    }
}

