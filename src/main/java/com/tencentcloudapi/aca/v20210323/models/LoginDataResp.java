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
package com.tencentcloudapi.aca.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginDataResp extends AbstractModel {

    /**
    * token
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * 过期时间
    */
    @SerializedName("ExpiresIn")
    @Expose
    private Long ExpiresIn;

    /**
    * 服务端时间戳，时间戳校验失败时返回
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
     * Get token 
     * @return Token token
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set token
     * @param Token token
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get 过期时间 
     * @return ExpiresIn 过期时间
     */
    public Long getExpiresIn() {
        return this.ExpiresIn;
    }

    /**
     * Set 过期时间
     * @param ExpiresIn 过期时间
     */
    public void setExpiresIn(Long ExpiresIn) {
        this.ExpiresIn = ExpiresIn;
    }

    /**
     * Get 服务端时间戳，时间戳校验失败时返回 
     * @return Timestamp 服务端时间戳，时间戳校验失败时返回
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 服务端时间戳，时间戳校验失败时返回
     * @param Timestamp 服务端时间戳，时间戳校验失败时返回
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    public LoginDataResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoginDataResp(LoginDataResp source) {
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.ExpiresIn != null) {
            this.ExpiresIn = new Long(source.ExpiresIn);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "ExpiresIn", this.ExpiresIn);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);

    }
}

