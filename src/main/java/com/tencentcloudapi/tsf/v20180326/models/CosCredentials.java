/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosCredentials extends AbstractModel {

    /**
    * 会话Token
    */
    @SerializedName("SessionToken")
    @Expose
    private String SessionToken;

    /**
    * 临时应用ID
    */
    @SerializedName("TmpAppId")
    @Expose
    private String TmpAppId;

    /**
    * 临时调用者身份ID
    */
    @SerializedName("TmpSecretId")
    @Expose
    private String TmpSecretId;

    /**
    * 临时密钥
    */
    @SerializedName("TmpSecretKey")
    @Expose
    private String TmpSecretKey;

    /**
    * 过期时间
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
    * 所在域
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * Get 会话Token 
     * @return SessionToken 会话Token
     */
    public String getSessionToken() {
        return this.SessionToken;
    }

    /**
     * Set 会话Token
     * @param SessionToken 会话Token
     */
    public void setSessionToken(String SessionToken) {
        this.SessionToken = SessionToken;
    }

    /**
     * Get 临时应用ID 
     * @return TmpAppId 临时应用ID
     */
    public String getTmpAppId() {
        return this.TmpAppId;
    }

    /**
     * Set 临时应用ID
     * @param TmpAppId 临时应用ID
     */
    public void setTmpAppId(String TmpAppId) {
        this.TmpAppId = TmpAppId;
    }

    /**
     * Get 临时调用者身份ID 
     * @return TmpSecretId 临时调用者身份ID
     */
    public String getTmpSecretId() {
        return this.TmpSecretId;
    }

    /**
     * Set 临时调用者身份ID
     * @param TmpSecretId 临时调用者身份ID
     */
    public void setTmpSecretId(String TmpSecretId) {
        this.TmpSecretId = TmpSecretId;
    }

    /**
     * Get 临时密钥 
     * @return TmpSecretKey 临时密钥
     */
    public String getTmpSecretKey() {
        return this.TmpSecretKey;
    }

    /**
     * Set 临时密钥
     * @param TmpSecretKey 临时密钥
     */
    public void setTmpSecretKey(String TmpSecretKey) {
        this.TmpSecretKey = TmpSecretKey;
    }

    /**
     * Get 过期时间 
     * @return ExpiredTime 过期时间
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 过期时间
     * @param ExpiredTime 过期时间
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get 所在域 
     * @return Domain 所在域
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 所在域
     * @param Domain 所在域
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public CosCredentials() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosCredentials(CosCredentials source) {
        if (source.SessionToken != null) {
            this.SessionToken = new String(source.SessionToken);
        }
        if (source.TmpAppId != null) {
            this.TmpAppId = new String(source.TmpAppId);
        }
        if (source.TmpSecretId != null) {
            this.TmpSecretId = new String(source.TmpSecretId);
        }
        if (source.TmpSecretKey != null) {
            this.TmpSecretKey = new String(source.TmpSecretKey);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new Long(source.ExpiredTime);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionToken", this.SessionToken);
        this.setParamSimple(map, prefix + "TmpAppId", this.TmpAppId);
        this.setParamSimple(map, prefix + "TmpSecretId", this.TmpSecretId);
        this.setParamSimple(map, prefix + "TmpSecretKey", this.TmpSecretKey);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

