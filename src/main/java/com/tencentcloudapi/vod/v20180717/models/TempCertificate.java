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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TempCertificate extends AbstractModel{

    /**
    * 临时安全证书 Id。
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * 临时安全证书 Key。
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * Token 值。
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * 证书无效的时间，返回 Unix 时间戳，精确到秒。
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
     * Get 临时安全证书 Id。 
     * @return SecretId 临时安全证书 Id。
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set 临时安全证书 Id。
     * @param SecretId 临时安全证书 Id。
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get 临时安全证书 Key。 
     * @return SecretKey 临时安全证书 Key。
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set 临时安全证书 Key。
     * @param SecretKey 临时安全证书 Key。
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get Token 值。 
     * @return Token Token 值。
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set Token 值。
     * @param Token Token 值。
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get 证书无效的时间，返回 Unix 时间戳，精确到秒。 
     * @return ExpiredTime 证书无效的时间，返回 Unix 时间戳，精确到秒。
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 证书无效的时间，返回 Unix 时间戳，精确到秒。
     * @param ExpiredTime 证书无效的时间，返回 Unix 时间戳，精确到秒。
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);

    }
}

