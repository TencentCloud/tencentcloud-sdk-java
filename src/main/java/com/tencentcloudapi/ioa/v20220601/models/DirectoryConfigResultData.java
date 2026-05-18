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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DirectoryConfigResultData extends AbstractModel {

    /**
    * <p>企业目录 ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>企业目录名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>身份源配置 ID</p>
    */
    @SerializedName("IdentifySourceId")
    @Expose
    private String IdentifySourceId;

    /**
    * <p>是否同步创建了认证配置</p>
    */
    @SerializedName("CreateAuthConfig")
    @Expose
    private Boolean CreateAuthConfig;

    /**
    * <p>认证源配置 ID</p>
    */
    @SerializedName("AuthSourceId")
    @Expose
    private String AuthSourceId;

    /**
    * <p>认证配置 ID</p>
    */
    @SerializedName("AuthConfigId")
    @Expose
    private Long AuthConfigId;

    /**
    * <p>认证策略 ID</p>
    */
    @SerializedName("AuthPolicyId")
    @Expose
    private Long AuthPolicyId;

    /**
    * <p>认证支持的平台, PC 或 Mobile</p>
    */
    @SerializedName("AuthSupportPlatforms")
    @Expose
    private String [] AuthSupportPlatforms;

    /**
    * <p>认证方式，授权认证/扫码认证 等</p>
    */
    @SerializedName("AuthMethods")
    @Expose
    private String [] AuthMethods;

    /**
     * Get <p>企业目录 ID</p> 
     * @return Id <p>企业目录 ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>企业目录 ID</p>
     * @param Id <p>企业目录 ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>企业目录名称</p> 
     * @return Name <p>企业目录名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>企业目录名称</p>
     * @param Name <p>企业目录名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>身份源配置 ID</p> 
     * @return IdentifySourceId <p>身份源配置 ID</p>
     */
    public String getIdentifySourceId() {
        return this.IdentifySourceId;
    }

    /**
     * Set <p>身份源配置 ID</p>
     * @param IdentifySourceId <p>身份源配置 ID</p>
     */
    public void setIdentifySourceId(String IdentifySourceId) {
        this.IdentifySourceId = IdentifySourceId;
    }

    /**
     * Get <p>是否同步创建了认证配置</p> 
     * @return CreateAuthConfig <p>是否同步创建了认证配置</p>
     */
    public Boolean getCreateAuthConfig() {
        return this.CreateAuthConfig;
    }

    /**
     * Set <p>是否同步创建了认证配置</p>
     * @param CreateAuthConfig <p>是否同步创建了认证配置</p>
     */
    public void setCreateAuthConfig(Boolean CreateAuthConfig) {
        this.CreateAuthConfig = CreateAuthConfig;
    }

    /**
     * Get <p>认证源配置 ID</p> 
     * @return AuthSourceId <p>认证源配置 ID</p>
     */
    public String getAuthSourceId() {
        return this.AuthSourceId;
    }

    /**
     * Set <p>认证源配置 ID</p>
     * @param AuthSourceId <p>认证源配置 ID</p>
     */
    public void setAuthSourceId(String AuthSourceId) {
        this.AuthSourceId = AuthSourceId;
    }

    /**
     * Get <p>认证配置 ID</p> 
     * @return AuthConfigId <p>认证配置 ID</p>
     */
    public Long getAuthConfigId() {
        return this.AuthConfigId;
    }

    /**
     * Set <p>认证配置 ID</p>
     * @param AuthConfigId <p>认证配置 ID</p>
     */
    public void setAuthConfigId(Long AuthConfigId) {
        this.AuthConfigId = AuthConfigId;
    }

    /**
     * Get <p>认证策略 ID</p> 
     * @return AuthPolicyId <p>认证策略 ID</p>
     */
    public Long getAuthPolicyId() {
        return this.AuthPolicyId;
    }

    /**
     * Set <p>认证策略 ID</p>
     * @param AuthPolicyId <p>认证策略 ID</p>
     */
    public void setAuthPolicyId(Long AuthPolicyId) {
        this.AuthPolicyId = AuthPolicyId;
    }

    /**
     * Get <p>认证支持的平台, PC 或 Mobile</p> 
     * @return AuthSupportPlatforms <p>认证支持的平台, PC 或 Mobile</p>
     */
    public String [] getAuthSupportPlatforms() {
        return this.AuthSupportPlatforms;
    }

    /**
     * Set <p>认证支持的平台, PC 或 Mobile</p>
     * @param AuthSupportPlatforms <p>认证支持的平台, PC 或 Mobile</p>
     */
    public void setAuthSupportPlatforms(String [] AuthSupportPlatforms) {
        this.AuthSupportPlatforms = AuthSupportPlatforms;
    }

    /**
     * Get <p>认证方式，授权认证/扫码认证 等</p> 
     * @return AuthMethods <p>认证方式，授权认证/扫码认证 等</p>
     */
    public String [] getAuthMethods() {
        return this.AuthMethods;
    }

    /**
     * Set <p>认证方式，授权认证/扫码认证 等</p>
     * @param AuthMethods <p>认证方式，授权认证/扫码认证 等</p>
     */
    public void setAuthMethods(String [] AuthMethods) {
        this.AuthMethods = AuthMethods;
    }

    public DirectoryConfigResultData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DirectoryConfigResultData(DirectoryConfigResultData source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IdentifySourceId != null) {
            this.IdentifySourceId = new String(source.IdentifySourceId);
        }
        if (source.CreateAuthConfig != null) {
            this.CreateAuthConfig = new Boolean(source.CreateAuthConfig);
        }
        if (source.AuthSourceId != null) {
            this.AuthSourceId = new String(source.AuthSourceId);
        }
        if (source.AuthConfigId != null) {
            this.AuthConfigId = new Long(source.AuthConfigId);
        }
        if (source.AuthPolicyId != null) {
            this.AuthPolicyId = new Long(source.AuthPolicyId);
        }
        if (source.AuthSupportPlatforms != null) {
            this.AuthSupportPlatforms = new String[source.AuthSupportPlatforms.length];
            for (int i = 0; i < source.AuthSupportPlatforms.length; i++) {
                this.AuthSupportPlatforms[i] = new String(source.AuthSupportPlatforms[i]);
            }
        }
        if (source.AuthMethods != null) {
            this.AuthMethods = new String[source.AuthMethods.length];
            for (int i = 0; i < source.AuthMethods.length; i++) {
                this.AuthMethods[i] = new String(source.AuthMethods[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IdentifySourceId", this.IdentifySourceId);
        this.setParamSimple(map, prefix + "CreateAuthConfig", this.CreateAuthConfig);
        this.setParamSimple(map, prefix + "AuthSourceId", this.AuthSourceId);
        this.setParamSimple(map, prefix + "AuthConfigId", this.AuthConfigId);
        this.setParamSimple(map, prefix + "AuthPolicyId", this.AuthPolicyId);
        this.setParamArraySimple(map, prefix + "AuthSupportPlatforms.", this.AuthSupportPlatforms);
        this.setParamArraySimple(map, prefix + "AuthMethods.", this.AuthMethods);

    }
}

