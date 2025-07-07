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

public class SAMLIdentityProviderConfiguration extends AbstractModel {

    /**
    * IdP 标识。
    */
    @SerializedName("EntityId")
    @Expose
    private String EntityId;

    /**
    * SSO 登录的启用状态。取值：  Enabled：启用。 Disabled（默认值）：禁用。
    */
    @SerializedName("SSOStatus")
    @Expose
    private String SSOStatus;

    /**
    * IdP 元数据文档（Base64 编码）。
    */
    @SerializedName("EncodedMetadataDocument")
    @Expose
    private String EncodedMetadataDocument;

    /**
    * X509证书ID。
    */
    @SerializedName("CertificateIds")
    @Expose
    private String [] CertificateIds;

    /**
    * IdP 的登录地址。
    */
    @SerializedName("LoginUrl")
    @Expose
    private String LoginUrl;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

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
     * Get IdP 元数据文档（Base64 编码）。 
     * @return EncodedMetadataDocument IdP 元数据文档（Base64 编码）。
     */
    public String getEncodedMetadataDocument() {
        return this.EncodedMetadataDocument;
    }

    /**
     * Set IdP 元数据文档（Base64 编码）。
     * @param EncodedMetadataDocument IdP 元数据文档（Base64 编码）。
     */
    public void setEncodedMetadataDocument(String EncodedMetadataDocument) {
        this.EncodedMetadataDocument = EncodedMetadataDocument;
    }

    /**
     * Get X509证书ID。 
     * @return CertificateIds X509证书ID。
     */
    public String [] getCertificateIds() {
        return this.CertificateIds;
    }

    /**
     * Set X509证书ID。
     * @param CertificateIds X509证书ID。
     */
    public void setCertificateIds(String [] CertificateIds) {
        this.CertificateIds = CertificateIds;
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
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间。 
     * @return UpdateTime 更新时间。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间。
     * @param UpdateTime 更新时间。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public SAMLIdentityProviderConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SAMLIdentityProviderConfiguration(SAMLIdentityProviderConfiguration source) {
        if (source.EntityId != null) {
            this.EntityId = new String(source.EntityId);
        }
        if (source.SSOStatus != null) {
            this.SSOStatus = new String(source.SSOStatus);
        }
        if (source.EncodedMetadataDocument != null) {
            this.EncodedMetadataDocument = new String(source.EncodedMetadataDocument);
        }
        if (source.CertificateIds != null) {
            this.CertificateIds = new String[source.CertificateIds.length];
            for (int i = 0; i < source.CertificateIds.length; i++) {
                this.CertificateIds[i] = new String(source.CertificateIds[i]);
            }
        }
        if (source.LoginUrl != null) {
            this.LoginUrl = new String(source.LoginUrl);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EntityId", this.EntityId);
        this.setParamSimple(map, prefix + "SSOStatus", this.SSOStatus);
        this.setParamSimple(map, prefix + "EncodedMetadataDocument", this.EncodedMetadataDocument);
        this.setParamArraySimple(map, prefix + "CertificateIds.", this.CertificateIds);
        this.setParamSimple(map, prefix + "LoginUrl", this.LoginUrl);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

