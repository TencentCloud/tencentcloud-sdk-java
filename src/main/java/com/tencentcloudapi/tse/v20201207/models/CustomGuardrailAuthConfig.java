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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomGuardrailAuthConfig extends AbstractModel {

    /**
    * <p>网关访问审核引擎的鉴权方式：none 无鉴权（创建默认值）；api_key 在指定 HTTP Header 中发送凭据。与客户端访问 AI 网关时使用的鉴权相互独立。none 模式不应携带 HeaderName 或 ApiKey。</p>
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * <p>api_key 模式的鉴权 Header 名，例如 X-Audit-Key 或 Authorization。需为有效 Header 名；不能使用 Content-Type、Accept 或 x-cngw-audit- 前缀的保留名称。不建议使用 Host、Content-Length 等会影响 HTTP 协议语义的头。</p>
    */
    @SerializedName("HeaderName")
    @Expose
    private String HeaderName;

    /**
    * <p>只读：是否已保存审核引擎鉴权密钥。不会返回密钥本身；修改时无需回传此字段。</p>
    */
    @SerializedName("HasApiKey")
    @Expose
    private Boolean HasApiKey;

    /**
     * Get <p>网关访问审核引擎的鉴权方式：none 无鉴权（创建默认值）；api_key 在指定 HTTP Header 中发送凭据。与客户端访问 AI 网关时使用的鉴权相互独立。none 模式不应携带 HeaderName 或 ApiKey。</p> 
     * @return AuthType <p>网关访问审核引擎的鉴权方式：none 无鉴权（创建默认值）；api_key 在指定 HTTP Header 中发送凭据。与客户端访问 AI 网关时使用的鉴权相互独立。none 模式不应携带 HeaderName 或 ApiKey。</p>
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set <p>网关访问审核引擎的鉴权方式：none 无鉴权（创建默认值）；api_key 在指定 HTTP Header 中发送凭据。与客户端访问 AI 网关时使用的鉴权相互独立。none 模式不应携带 HeaderName 或 ApiKey。</p>
     * @param AuthType <p>网关访问审核引擎的鉴权方式：none 无鉴权（创建默认值）；api_key 在指定 HTTP Header 中发送凭据。与客户端访问 AI 网关时使用的鉴权相互独立。none 模式不应携带 HeaderName 或 ApiKey。</p>
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get <p>api_key 模式的鉴权 Header 名，例如 X-Audit-Key 或 Authorization。需为有效 Header 名；不能使用 Content-Type、Accept 或 x-cngw-audit- 前缀的保留名称。不建议使用 Host、Content-Length 等会影响 HTTP 协议语义的头。</p> 
     * @return HeaderName <p>api_key 模式的鉴权 Header 名，例如 X-Audit-Key 或 Authorization。需为有效 Header 名；不能使用 Content-Type、Accept 或 x-cngw-audit- 前缀的保留名称。不建议使用 Host、Content-Length 等会影响 HTTP 协议语义的头。</p>
     */
    public String getHeaderName() {
        return this.HeaderName;
    }

    /**
     * Set <p>api_key 模式的鉴权 Header 名，例如 X-Audit-Key 或 Authorization。需为有效 Header 名；不能使用 Content-Type、Accept 或 x-cngw-audit- 前缀的保留名称。不建议使用 Host、Content-Length 等会影响 HTTP 协议语义的头。</p>
     * @param HeaderName <p>api_key 模式的鉴权 Header 名，例如 X-Audit-Key 或 Authorization。需为有效 Header 名；不能使用 Content-Type、Accept 或 x-cngw-audit- 前缀的保留名称。不建议使用 Host、Content-Length 等会影响 HTTP 协议语义的头。</p>
     */
    public void setHeaderName(String HeaderName) {
        this.HeaderName = HeaderName;
    }

    /**
     * Get <p>只读：是否已保存审核引擎鉴权密钥。不会返回密钥本身；修改时无需回传此字段。</p> 
     * @return HasApiKey <p>只读：是否已保存审核引擎鉴权密钥。不会返回密钥本身；修改时无需回传此字段。</p>
     */
    public Boolean getHasApiKey() {
        return this.HasApiKey;
    }

    /**
     * Set <p>只读：是否已保存审核引擎鉴权密钥。不会返回密钥本身；修改时无需回传此字段。</p>
     * @param HasApiKey <p>只读：是否已保存审核引擎鉴权密钥。不会返回密钥本身；修改时无需回传此字段。</p>
     */
    public void setHasApiKey(Boolean HasApiKey) {
        this.HasApiKey = HasApiKey;
    }

    public CustomGuardrailAuthConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomGuardrailAuthConfig(CustomGuardrailAuthConfig source) {
        if (source.AuthType != null) {
            this.AuthType = new String(source.AuthType);
        }
        if (source.HeaderName != null) {
            this.HeaderName = new String(source.HeaderName);
        }
        if (source.HasApiKey != null) {
            this.HasApiKey = new Boolean(source.HasApiKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "HeaderName", this.HeaderName);
        this.setParamSimple(map, prefix + "HasApiKey", this.HasApiKey);

    }
}

