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
package com.tencentcloudapi.iap.v20240713.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIAPUserOIDCConfigResponse extends AbstractModel {

    /**
    * 身份提供商类型。 13：IAP用户OIDC身份提供商
    */
    @SerializedName("ProviderType")
    @Expose
    private Long ProviderType;

    /**
    * 身份提供商URL
    */
    @SerializedName("IdentityUrl")
    @Expose
    private String IdentityUrl;

    /**
    * 签名公钥
    */
    @SerializedName("IdentityKey")
    @Expose
    private String IdentityKey;

    /**
    * 客户端id
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * 状态：0:未设置，11:已开启，2:已禁用
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * HTTPS CA证书的验证指纹，允许英文字母和数字，每个指纹长度为40个字符，最多5个指纹。
    */
    @SerializedName("Fingerprints")
    @Expose
    private String [] Fingerprints;

    /**
    * 是否需要开启自动使用OIDC签名公钥，1:需要，2:不需要，默认不需要
    */
    @SerializedName("EnableAutoPublicKey")
    @Expose
    private Long EnableAutoPublicKey;

    /**
    * 授权请求Endpoint
    */
    @SerializedName("AuthorizationEndpoint")
    @Expose
    private String AuthorizationEndpoint;

    /**
    * 授权请求Scope
    */
    @SerializedName("Scope")
    @Expose
    private String [] Scope;

    /**
    * 授权请求Response type
    */
    @SerializedName("ResponseType")
    @Expose
    private String ResponseType;

    /**
    * 授权请求Response mode
    */
    @SerializedName("ResponseMode")
    @Expose
    private String ResponseMode;

    /**
    * 映射字段名称
    */
    @SerializedName("MappingFiled")
    @Expose
    private String MappingFiled;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 身份提供商类型。 13：IAP用户OIDC身份提供商 
     * @return ProviderType 身份提供商类型。 13：IAP用户OIDC身份提供商
     */
    public Long getProviderType() {
        return this.ProviderType;
    }

    /**
     * Set 身份提供商类型。 13：IAP用户OIDC身份提供商
     * @param ProviderType 身份提供商类型。 13：IAP用户OIDC身份提供商
     */
    public void setProviderType(Long ProviderType) {
        this.ProviderType = ProviderType;
    }

    /**
     * Get 身份提供商URL 
     * @return IdentityUrl 身份提供商URL
     */
    public String getIdentityUrl() {
        return this.IdentityUrl;
    }

    /**
     * Set 身份提供商URL
     * @param IdentityUrl 身份提供商URL
     */
    public void setIdentityUrl(String IdentityUrl) {
        this.IdentityUrl = IdentityUrl;
    }

    /**
     * Get 签名公钥 
     * @return IdentityKey 签名公钥
     */
    public String getIdentityKey() {
        return this.IdentityKey;
    }

    /**
     * Set 签名公钥
     * @param IdentityKey 签名公钥
     */
    public void setIdentityKey(String IdentityKey) {
        this.IdentityKey = IdentityKey;
    }

    /**
     * Get 客户端id 
     * @return ClientId 客户端id
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set 客户端id
     * @param ClientId 客户端id
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get 状态：0:未设置，11:已开启，2:已禁用 
     * @return Status 状态：0:未设置，11:已开启，2:已禁用
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态：0:未设置，11:已开启，2:已禁用
     * @param Status 状态：0:未设置，11:已开启，2:已禁用
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get HTTPS CA证书的验证指纹，允许英文字母和数字，每个指纹长度为40个字符，最多5个指纹。 
     * @return Fingerprints HTTPS CA证书的验证指纹，允许英文字母和数字，每个指纹长度为40个字符，最多5个指纹。
     */
    public String [] getFingerprints() {
        return this.Fingerprints;
    }

    /**
     * Set HTTPS CA证书的验证指纹，允许英文字母和数字，每个指纹长度为40个字符，最多5个指纹。
     * @param Fingerprints HTTPS CA证书的验证指纹，允许英文字母和数字，每个指纹长度为40个字符，最多5个指纹。
     */
    public void setFingerprints(String [] Fingerprints) {
        this.Fingerprints = Fingerprints;
    }

    /**
     * Get 是否需要开启自动使用OIDC签名公钥，1:需要，2:不需要，默认不需要 
     * @return EnableAutoPublicKey 是否需要开启自动使用OIDC签名公钥，1:需要，2:不需要，默认不需要
     */
    public Long getEnableAutoPublicKey() {
        return this.EnableAutoPublicKey;
    }

    /**
     * Set 是否需要开启自动使用OIDC签名公钥，1:需要，2:不需要，默认不需要
     * @param EnableAutoPublicKey 是否需要开启自动使用OIDC签名公钥，1:需要，2:不需要，默认不需要
     */
    public void setEnableAutoPublicKey(Long EnableAutoPublicKey) {
        this.EnableAutoPublicKey = EnableAutoPublicKey;
    }

    /**
     * Get 授权请求Endpoint 
     * @return AuthorizationEndpoint 授权请求Endpoint
     */
    public String getAuthorizationEndpoint() {
        return this.AuthorizationEndpoint;
    }

    /**
     * Set 授权请求Endpoint
     * @param AuthorizationEndpoint 授权请求Endpoint
     */
    public void setAuthorizationEndpoint(String AuthorizationEndpoint) {
        this.AuthorizationEndpoint = AuthorizationEndpoint;
    }

    /**
     * Get 授权请求Scope 
     * @return Scope 授权请求Scope
     */
    public String [] getScope() {
        return this.Scope;
    }

    /**
     * Set 授权请求Scope
     * @param Scope 授权请求Scope
     */
    public void setScope(String [] Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 授权请求Response type 
     * @return ResponseType 授权请求Response type
     */
    public String getResponseType() {
        return this.ResponseType;
    }

    /**
     * Set 授权请求Response type
     * @param ResponseType 授权请求Response type
     */
    public void setResponseType(String ResponseType) {
        this.ResponseType = ResponseType;
    }

    /**
     * Get 授权请求Response mode 
     * @return ResponseMode 授权请求Response mode
     */
    public String getResponseMode() {
        return this.ResponseMode;
    }

    /**
     * Set 授权请求Response mode
     * @param ResponseMode 授权请求Response mode
     */
    public void setResponseMode(String ResponseMode) {
        this.ResponseMode = ResponseMode;
    }

    /**
     * Get 映射字段名称 
     * @return MappingFiled 映射字段名称
     */
    public String getMappingFiled() {
        return this.MappingFiled;
    }

    /**
     * Set 映射字段名称
     * @param MappingFiled 映射字段名称
     */
    public void setMappingFiled(String MappingFiled) {
        this.MappingFiled = MappingFiled;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeIAPUserOIDCConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIAPUserOIDCConfigResponse(DescribeIAPUserOIDCConfigResponse source) {
        if (source.ProviderType != null) {
            this.ProviderType = new Long(source.ProviderType);
        }
        if (source.IdentityUrl != null) {
            this.IdentityUrl = new String(source.IdentityUrl);
        }
        if (source.IdentityKey != null) {
            this.IdentityKey = new String(source.IdentityKey);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Fingerprints != null) {
            this.Fingerprints = new String[source.Fingerprints.length];
            for (int i = 0; i < source.Fingerprints.length; i++) {
                this.Fingerprints[i] = new String(source.Fingerprints[i]);
            }
        }
        if (source.EnableAutoPublicKey != null) {
            this.EnableAutoPublicKey = new Long(source.EnableAutoPublicKey);
        }
        if (source.AuthorizationEndpoint != null) {
            this.AuthorizationEndpoint = new String(source.AuthorizationEndpoint);
        }
        if (source.Scope != null) {
            this.Scope = new String[source.Scope.length];
            for (int i = 0; i < source.Scope.length; i++) {
                this.Scope[i] = new String(source.Scope[i]);
            }
        }
        if (source.ResponseType != null) {
            this.ResponseType = new String(source.ResponseType);
        }
        if (source.ResponseMode != null) {
            this.ResponseMode = new String(source.ResponseMode);
        }
        if (source.MappingFiled != null) {
            this.MappingFiled = new String(source.MappingFiled);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProviderType", this.ProviderType);
        this.setParamSimple(map, prefix + "IdentityUrl", this.IdentityUrl);
        this.setParamSimple(map, prefix + "IdentityKey", this.IdentityKey);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Fingerprints.", this.Fingerprints);
        this.setParamSimple(map, prefix + "EnableAutoPublicKey", this.EnableAutoPublicKey);
        this.setParamSimple(map, prefix + "AuthorizationEndpoint", this.AuthorizationEndpoint);
        this.setParamArraySimple(map, prefix + "Scope.", this.Scope);
        this.setParamSimple(map, prefix + "ResponseType", this.ResponseType);
        this.setParamSimple(map, prefix + "ResponseMode", this.ResponseMode);
        this.setParamSimple(map, prefix + "MappingFiled", this.MappingFiled);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

