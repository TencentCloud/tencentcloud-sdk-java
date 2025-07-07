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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetExternalSAMLIdentityProviderRequest extends AbstractModel {

    /**
    * 空间ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * IdP 元数据文档（Base64 编码）。  由支持 SAML 2.0 协议的 IdP 提供。
    */
    @SerializedName("EncodedMetadataDocument")
    @Expose
    private String EncodedMetadataDocument;

    /**
    * SSO 登录的启用状态。取值：  Enabled：启用。 Disabled（默认值）：禁用。
    */
    @SerializedName("SSOStatus")
    @Expose
    private String SSOStatus;

    /**
    * IdP 标识。
    */
    @SerializedName("EntityId")
    @Expose
    private String EntityId;

    /**
    * IdP 的登录地址。
    */
    @SerializedName("LoginUrl")
    @Expose
    private String LoginUrl;

    /**
    * PEM 格式的 X509 证书。指定该参数会替换所有已经存在的证书。
    */
    @SerializedName("X509Certificate")
    @Expose
    private String X509Certificate;

    /**
     * Get 空间ID。 
     * @return ZoneId 空间ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 空间ID。
     * @param ZoneId 空间ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get IdP 元数据文档（Base64 编码）。  由支持 SAML 2.0 协议的 IdP 提供。 
     * @return EncodedMetadataDocument IdP 元数据文档（Base64 编码）。  由支持 SAML 2.0 协议的 IdP 提供。
     */
    public String getEncodedMetadataDocument() {
        return this.EncodedMetadataDocument;
    }

    /**
     * Set IdP 元数据文档（Base64 编码）。  由支持 SAML 2.0 协议的 IdP 提供。
     * @param EncodedMetadataDocument IdP 元数据文档（Base64 编码）。  由支持 SAML 2.0 协议的 IdP 提供。
     */
    public void setEncodedMetadataDocument(String EncodedMetadataDocument) {
        this.EncodedMetadataDocument = EncodedMetadataDocument;
    }

    /**
     * Get SSO 登录的启用状态。取值：  Enabled：启用。 Disabled（默认值）：禁用。 
     * @return SSOStatus SSO 登录的启用状态。取值：  Enabled：启用。 Disabled（默认值）：禁用。
     */
    public String getSSOStatus() {
        return this.SSOStatus;
    }

    /**
     * Set SSO 登录的启用状态。取值：  Enabled：启用。 Disabled（默认值）：禁用。
     * @param SSOStatus SSO 登录的启用状态。取值：  Enabled：启用。 Disabled（默认值）：禁用。
     */
    public void setSSOStatus(String SSOStatus) {
        this.SSOStatus = SSOStatus;
    }

    /**
     * Get IdP 标识。 
     * @return EntityId IdP 标识。
     */
    public String getEntityId() {
        return this.EntityId;
    }

    /**
     * Set IdP 标识。
     * @param EntityId IdP 标识。
     */
    public void setEntityId(String EntityId) {
        this.EntityId = EntityId;
    }

    /**
     * Get IdP 的登录地址。 
     * @return LoginUrl IdP 的登录地址。
     */
    public String getLoginUrl() {
        return this.LoginUrl;
    }

    /**
     * Set IdP 的登录地址。
     * @param LoginUrl IdP 的登录地址。
     */
    public void setLoginUrl(String LoginUrl) {
        this.LoginUrl = LoginUrl;
    }

    /**
     * Get PEM 格式的 X509 证书。指定该参数会替换所有已经存在的证书。 
     * @return X509Certificate PEM 格式的 X509 证书。指定该参数会替换所有已经存在的证书。
     */
    public String getX509Certificate() {
        return this.X509Certificate;
    }

    /**
     * Set PEM 格式的 X509 证书。指定该参数会替换所有已经存在的证书。
     * @param X509Certificate PEM 格式的 X509 证书。指定该参数会替换所有已经存在的证书。
     */
    public void setX509Certificate(String X509Certificate) {
        this.X509Certificate = X509Certificate;
    }

    public SetExternalSAMLIdentityProviderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetExternalSAMLIdentityProviderRequest(SetExternalSAMLIdentityProviderRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.EncodedMetadataDocument != null) {
            this.EncodedMetadataDocument = new String(source.EncodedMetadataDocument);
        }
        if (source.SSOStatus != null) {
            this.SSOStatus = new String(source.SSOStatus);
        }
        if (source.EntityId != null) {
            this.EntityId = new String(source.EntityId);
        }
        if (source.LoginUrl != null) {
            this.LoginUrl = new String(source.LoginUrl);
        }
        if (source.X509Certificate != null) {
            this.X509Certificate = new String(source.X509Certificate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "EncodedMetadataDocument", this.EncodedMetadataDocument);
        this.setParamSimple(map, prefix + "SSOStatus", this.SSOStatus);
        this.setParamSimple(map, prefix + "EntityId", this.EntityId);
        this.setParamSimple(map, prefix + "LoginUrl", this.LoginUrl);
        this.setParamSimple(map, prefix + "X509Certificate", this.X509Certificate);

    }
}

