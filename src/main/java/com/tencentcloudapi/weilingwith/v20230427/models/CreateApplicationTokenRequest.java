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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateApplicationTokenRequest extends AbstractModel {

    /**
    * 应用id
    */
    @SerializedName("ApplicationId")
    @Expose
    private Long ApplicationId;

    /**
    * 一个随机数或者时间戳，用于防止重放攻击，每个请求唯一，建议用uuid
    */
    @SerializedName("Nonce")
    @Expose
    private String Nonce;

    /**
    * 租户id
    */
    @SerializedName("TenantId")
    @Expose
    private Long TenantId;

    /**
    * 请求时间，当前时间的unix毫秒时间戳
    */
    @SerializedName("RequestTime")
    @Expose
    private Long RequestTime;

    /**
    * 签名方法见用户使用文档
    */
    @SerializedName("Signature")
    @Expose
    private String Signature;

    /**
     * Get 应用id 
     * @return ApplicationId 应用id
     */
    public Long getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用id
     * @param ApplicationId 应用id
     */
    public void setApplicationId(Long ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 一个随机数或者时间戳，用于防止重放攻击，每个请求唯一，建议用uuid 
     * @return Nonce 一个随机数或者时间戳，用于防止重放攻击，每个请求唯一，建议用uuid
     */
    public String getNonce() {
        return this.Nonce;
    }

    /**
     * Set 一个随机数或者时间戳，用于防止重放攻击，每个请求唯一，建议用uuid
     * @param Nonce 一个随机数或者时间戳，用于防止重放攻击，每个请求唯一，建议用uuid
     */
    public void setNonce(String Nonce) {
        this.Nonce = Nonce;
    }

    /**
     * Get 租户id 
     * @return TenantId 租户id
     */
    public Long getTenantId() {
        return this.TenantId;
    }

    /**
     * Set 租户id
     * @param TenantId 租户id
     */
    public void setTenantId(Long TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get 请求时间，当前时间的unix毫秒时间戳 
     * @return RequestTime 请求时间，当前时间的unix毫秒时间戳
     */
    public Long getRequestTime() {
        return this.RequestTime;
    }

    /**
     * Set 请求时间，当前时间的unix毫秒时间戳
     * @param RequestTime 请求时间，当前时间的unix毫秒时间戳
     */
    public void setRequestTime(Long RequestTime) {
        this.RequestTime = RequestTime;
    }

    /**
     * Get 签名方法见用户使用文档 
     * @return Signature 签名方法见用户使用文档
     */
    public String getSignature() {
        return this.Signature;
    }

    /**
     * Set 签名方法见用户使用文档
     * @param Signature 签名方法见用户使用文档
     */
    public void setSignature(String Signature) {
        this.Signature = Signature;
    }

    public CreateApplicationTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApplicationTokenRequest(CreateApplicationTokenRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new Long(source.ApplicationId);
        }
        if (source.Nonce != null) {
            this.Nonce = new String(source.Nonce);
        }
        if (source.TenantId != null) {
            this.TenantId = new Long(source.TenantId);
        }
        if (source.RequestTime != null) {
            this.RequestTime = new Long(source.RequestTime);
        }
        if (source.Signature != null) {
            this.Signature = new String(source.Signature);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "Nonce", this.Nonce);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "RequestTime", this.RequestTime);
        this.setParamSimple(map, prefix + "Signature", this.Signature);

    }
}

