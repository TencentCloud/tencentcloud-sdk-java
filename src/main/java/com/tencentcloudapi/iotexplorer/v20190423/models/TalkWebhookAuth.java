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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TalkWebhookAuth extends AbstractModel {

    /**
    * 鉴权类型：none、hmac、static_headers、bearer
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * HMAC签名密钥，Type=hmac时必填
    */
    @SerializedName("SignKey")
    @Expose
    private String SignKey;

    /**
    * 静态鉴权请求头，JSON对象字符串，仅允许白名单header名
    */
    @SerializedName("Headers")
    @Expose
    private String Headers;

    /**
    * Bearer Token，Type=bearer时用于生成Authorization请求头
    */
    @SerializedName("BearerToken")
    @Expose
    private String BearerToken;

    /**
     * Get 鉴权类型：none、hmac、static_headers、bearer 
     * @return Type 鉴权类型：none、hmac、static_headers、bearer
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 鉴权类型：none、hmac、static_headers、bearer
     * @param Type 鉴权类型：none、hmac、static_headers、bearer
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get HMAC签名密钥，Type=hmac时必填 
     * @return SignKey HMAC签名密钥，Type=hmac时必填
     */
    public String getSignKey() {
        return this.SignKey;
    }

    /**
     * Set HMAC签名密钥，Type=hmac时必填
     * @param SignKey HMAC签名密钥，Type=hmac时必填
     */
    public void setSignKey(String SignKey) {
        this.SignKey = SignKey;
    }

    /**
     * Get 静态鉴权请求头，JSON对象字符串，仅允许白名单header名 
     * @return Headers 静态鉴权请求头，JSON对象字符串，仅允许白名单header名
     */
    public String getHeaders() {
        return this.Headers;
    }

    /**
     * Set 静态鉴权请求头，JSON对象字符串，仅允许白名单header名
     * @param Headers 静态鉴权请求头，JSON对象字符串，仅允许白名单header名
     */
    public void setHeaders(String Headers) {
        this.Headers = Headers;
    }

    /**
     * Get Bearer Token，Type=bearer时用于生成Authorization请求头 
     * @return BearerToken Bearer Token，Type=bearer时用于生成Authorization请求头
     */
    public String getBearerToken() {
        return this.BearerToken;
    }

    /**
     * Set Bearer Token，Type=bearer时用于生成Authorization请求头
     * @param BearerToken Bearer Token，Type=bearer时用于生成Authorization请求头
     */
    public void setBearerToken(String BearerToken) {
        this.BearerToken = BearerToken;
    }

    public TalkWebhookAuth() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TalkWebhookAuth(TalkWebhookAuth source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SignKey != null) {
            this.SignKey = new String(source.SignKey);
        }
        if (source.Headers != null) {
            this.Headers = new String(source.Headers);
        }
        if (source.BearerToken != null) {
            this.BearerToken = new String(source.BearerToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SignKey", this.SignKey);
        this.setParamSimple(map, prefix + "Headers", this.Headers);
        this.setParamSimple(map, prefix + "BearerToken", this.BearerToken);

    }
}

