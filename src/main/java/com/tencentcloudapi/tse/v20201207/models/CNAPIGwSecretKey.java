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

public class CNAPIGwSecretKey extends AbstractModel {

    /**
    * <p>密钥id</p>
    */
    @SerializedName("SecretKeyId")
    @Expose
    private String SecretKeyId;

    /**
    * <p>密钥名字</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>密钥协议类型。</p>
    */
    @SerializedName("SecretType")
    @Expose
    private String SecretType;

    /**
    * <p>状态。</p><p>枚举值：</p><ul><li>Enable： 启用</li><li>Disable： 禁用</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>密钥生成方式。</p><p>枚举值：</p><ul><li>System： 系统自动生成</li><li>Custom： 用户自定义</li><li>KMS： 使用 KMS 密钥</li></ul>
    */
    @SerializedName("GenerateType")
    @Expose
    private String GenerateType;

    /**
    * <p>密钥明文</p>
    */
    @SerializedName("SecretValue")
    @Expose
    private String SecretValue;

    /**
    * <p>KMS凭证名字</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KmsKeyName")
    @Expose
    private String KmsKeyName;

    /**
    * <p>KMS凭证版本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KmsKeyVersion")
    @Expose
    private String KmsKeyVersion;

    /**
    * <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>是否可以绑定</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CanBind")
    @Expose
    private Boolean CanBind;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>修改时间</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>绑定数</p>
    */
    @SerializedName("BindCount")
    @Expose
    private Long BindCount;

    /**
    * <p>密钥归属资源类型。</p><p>枚举值：</p><ul><li>Consumer： 消费者</li><li>ModelService： 模型服务</li></ul>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * <p>JWT凭证配置</p>
    */
    @SerializedName("JWTCredentialConfig")
    @Expose
    private AIGWJWTCredentialConfig JWTCredentialConfig;

    /**
    * <p>OAuth凭证配置</p>
    */
    @SerializedName("OAuthCredentialConfig")
    @Expose
    private AIGWOAuthCredentialConfig OAuthCredentialConfig;

    /**
    * <p>OIDC凭证配置</p>
    */
    @SerializedName("OIDCCredentialConfig")
    @Expose
    private AIGWOIDCCredentialConfig OIDCCredentialConfig;

    /**
    * <p>secret key provider方</p><p>枚举值：</p><ul><li>Dify： Dify</li></ul>
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>AK/SK凭证配置</p>
    */
    @SerializedName("AKSKCredentialConfig")
    @Expose
    private AIGWAKSKCredentialConfig AKSKCredentialConfig;

    /**
    * <p>CAM凭证配置</p>
    */
    @SerializedName("CAMCredentialConfig")
    @Expose
    private AIGWCAMCredentialConfig CAMCredentialConfig;

    /**
    * <p>Bearer Token凭证配置</p>
    */
    @SerializedName("BearerTokenCredentialConfig")
    @Expose
    private AIGWBearerTokenCredentialConfig BearerTokenCredentialConfig;

    /**
    * <p>Basic Auth凭证配置</p>
    */
    @SerializedName("BasicCredentialConfig")
    @Expose
    private AIGWBasicCredentialConfig BasicCredentialConfig;

    /**
    * <p>自定义Header凭证配置</p>
    */
    @SerializedName("CustomHeaderCredentialConfig")
    @Expose
    private AIGWCustomHeaderCredentialConfig CustomHeaderCredentialConfig;

    /**
    * <p>自定义Query参数凭证配置</p>
    */
    @SerializedName("QueryParamCredentialConfig")
    @Expose
    private AIGWQueryParamCredentialConfig QueryParamCredentialConfig;

    /**
    * <p>同步状态</p>
    */
    @SerializedName("SyncStatus")
    @Expose
    private String SyncStatus;

    /**
    * <p>来源类型</p>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * <p>已同步版本</p>
    */
    @SerializedName("SyncedVersion")
    @Expose
    private String SyncedVersion;

    /**
     * Get <p>密钥id</p> 
     * @return SecretKeyId <p>密钥id</p>
     */
    public String getSecretKeyId() {
        return this.SecretKeyId;
    }

    /**
     * Set <p>密钥id</p>
     * @param SecretKeyId <p>密钥id</p>
     */
    public void setSecretKeyId(String SecretKeyId) {
        this.SecretKeyId = SecretKeyId;
    }

    /**
     * Get <p>密钥名字</p> 
     * @return Name <p>密钥名字</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>密钥名字</p>
     * @param Name <p>密钥名字</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>密钥协议类型。</p> 
     * @return SecretType <p>密钥协议类型。</p>
     */
    public String getSecretType() {
        return this.SecretType;
    }

    /**
     * Set <p>密钥协议类型。</p>
     * @param SecretType <p>密钥协议类型。</p>
     */
    public void setSecretType(String SecretType) {
        this.SecretType = SecretType;
    }

    /**
     * Get <p>状态。</p><p>枚举值：</p><ul><li>Enable： 启用</li><li>Disable： 禁用</li></ul> 
     * @return Status <p>状态。</p><p>枚举值：</p><ul><li>Enable： 启用</li><li>Disable： 禁用</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态。</p><p>枚举值：</p><ul><li>Enable： 启用</li><li>Disable： 禁用</li></ul>
     * @param Status <p>状态。</p><p>枚举值：</p><ul><li>Enable： 启用</li><li>Disable： 禁用</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>密钥生成方式。</p><p>枚举值：</p><ul><li>System： 系统自动生成</li><li>Custom： 用户自定义</li><li>KMS： 使用 KMS 密钥</li></ul> 
     * @return GenerateType <p>密钥生成方式。</p><p>枚举值：</p><ul><li>System： 系统自动生成</li><li>Custom： 用户自定义</li><li>KMS： 使用 KMS 密钥</li></ul>
     */
    public String getGenerateType() {
        return this.GenerateType;
    }

    /**
     * Set <p>密钥生成方式。</p><p>枚举值：</p><ul><li>System： 系统自动生成</li><li>Custom： 用户自定义</li><li>KMS： 使用 KMS 密钥</li></ul>
     * @param GenerateType <p>密钥生成方式。</p><p>枚举值：</p><ul><li>System： 系统自动生成</li><li>Custom： 用户自定义</li><li>KMS： 使用 KMS 密钥</li></ul>
     */
    public void setGenerateType(String GenerateType) {
        this.GenerateType = GenerateType;
    }

    /**
     * Get <p>密钥明文</p> 
     * @return SecretValue <p>密钥明文</p>
     */
    public String getSecretValue() {
        return this.SecretValue;
    }

    /**
     * Set <p>密钥明文</p>
     * @param SecretValue <p>密钥明文</p>
     */
    public void setSecretValue(String SecretValue) {
        this.SecretValue = SecretValue;
    }

    /**
     * Get <p>KMS凭证名字</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KmsKeyName <p>KMS凭证名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKmsKeyName() {
        return this.KmsKeyName;
    }

    /**
     * Set <p>KMS凭证名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KmsKeyName <p>KMS凭证名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKmsKeyName(String KmsKeyName) {
        this.KmsKeyName = KmsKeyName;
    }

    /**
     * Get <p>KMS凭证版本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KmsKeyVersion <p>KMS凭证版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKmsKeyVersion() {
        return this.KmsKeyVersion;
    }

    /**
     * Set <p>KMS凭证版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KmsKeyVersion <p>KMS凭证版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKmsKeyVersion(String KmsKeyVersion) {
        this.KmsKeyVersion = KmsKeyVersion;
    }

    /**
     * Get <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>是否可以绑定</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CanBind <p>是否可以绑定</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCanBind() {
        return this.CanBind;
    }

    /**
     * Set <p>是否可以绑定</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CanBind <p>是否可以绑定</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCanBind(Boolean CanBind) {
        this.CanBind = CanBind;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>修改时间</p> 
     * @return ModifyTime <p>修改时间</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>修改时间</p>
     * @param ModifyTime <p>修改时间</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>绑定数</p> 
     * @return BindCount <p>绑定数</p>
     */
    public Long getBindCount() {
        return this.BindCount;
    }

    /**
     * Set <p>绑定数</p>
     * @param BindCount <p>绑定数</p>
     */
    public void setBindCount(Long BindCount) {
        this.BindCount = BindCount;
    }

    /**
     * Get <p>密钥归属资源类型。</p><p>枚举值：</p><ul><li>Consumer： 消费者</li><li>ModelService： 模型服务</li></ul> 
     * @return ResourceType <p>密钥归属资源类型。</p><p>枚举值：</p><ul><li>Consumer： 消费者</li><li>ModelService： 模型服务</li></ul>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>密钥归属资源类型。</p><p>枚举值：</p><ul><li>Consumer： 消费者</li><li>ModelService： 模型服务</li></ul>
     * @param ResourceType <p>密钥归属资源类型。</p><p>枚举值：</p><ul><li>Consumer： 消费者</li><li>ModelService： 模型服务</li></ul>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>JWT凭证配置</p> 
     * @return JWTCredentialConfig <p>JWT凭证配置</p>
     */
    public AIGWJWTCredentialConfig getJWTCredentialConfig() {
        return this.JWTCredentialConfig;
    }

    /**
     * Set <p>JWT凭证配置</p>
     * @param JWTCredentialConfig <p>JWT凭证配置</p>
     */
    public void setJWTCredentialConfig(AIGWJWTCredentialConfig JWTCredentialConfig) {
        this.JWTCredentialConfig = JWTCredentialConfig;
    }

    /**
     * Get <p>OAuth凭证配置</p> 
     * @return OAuthCredentialConfig <p>OAuth凭证配置</p>
     */
    public AIGWOAuthCredentialConfig getOAuthCredentialConfig() {
        return this.OAuthCredentialConfig;
    }

    /**
     * Set <p>OAuth凭证配置</p>
     * @param OAuthCredentialConfig <p>OAuth凭证配置</p>
     */
    public void setOAuthCredentialConfig(AIGWOAuthCredentialConfig OAuthCredentialConfig) {
        this.OAuthCredentialConfig = OAuthCredentialConfig;
    }

    /**
     * Get <p>OIDC凭证配置</p> 
     * @return OIDCCredentialConfig <p>OIDC凭证配置</p>
     */
    public AIGWOIDCCredentialConfig getOIDCCredentialConfig() {
        return this.OIDCCredentialConfig;
    }

    /**
     * Set <p>OIDC凭证配置</p>
     * @param OIDCCredentialConfig <p>OIDC凭证配置</p>
     */
    public void setOIDCCredentialConfig(AIGWOIDCCredentialConfig OIDCCredentialConfig) {
        this.OIDCCredentialConfig = OIDCCredentialConfig;
    }

    /**
     * Get <p>secret key provider方</p><p>枚举值：</p><ul><li>Dify： Dify</li></ul> 
     * @return Provider <p>secret key provider方</p><p>枚举值：</p><ul><li>Dify： Dify</li></ul>
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set <p>secret key provider方</p><p>枚举值：</p><ul><li>Dify： Dify</li></ul>
     * @param Provider <p>secret key provider方</p><p>枚举值：</p><ul><li>Dify： Dify</li></ul>
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get <p>AK/SK凭证配置</p> 
     * @return AKSKCredentialConfig <p>AK/SK凭证配置</p>
     */
    public AIGWAKSKCredentialConfig getAKSKCredentialConfig() {
        return this.AKSKCredentialConfig;
    }

    /**
     * Set <p>AK/SK凭证配置</p>
     * @param AKSKCredentialConfig <p>AK/SK凭证配置</p>
     */
    public void setAKSKCredentialConfig(AIGWAKSKCredentialConfig AKSKCredentialConfig) {
        this.AKSKCredentialConfig = AKSKCredentialConfig;
    }

    /**
     * Get <p>CAM凭证配置</p> 
     * @return CAMCredentialConfig <p>CAM凭证配置</p>
     */
    public AIGWCAMCredentialConfig getCAMCredentialConfig() {
        return this.CAMCredentialConfig;
    }

    /**
     * Set <p>CAM凭证配置</p>
     * @param CAMCredentialConfig <p>CAM凭证配置</p>
     */
    public void setCAMCredentialConfig(AIGWCAMCredentialConfig CAMCredentialConfig) {
        this.CAMCredentialConfig = CAMCredentialConfig;
    }

    /**
     * Get <p>Bearer Token凭证配置</p> 
     * @return BearerTokenCredentialConfig <p>Bearer Token凭证配置</p>
     */
    public AIGWBearerTokenCredentialConfig getBearerTokenCredentialConfig() {
        return this.BearerTokenCredentialConfig;
    }

    /**
     * Set <p>Bearer Token凭证配置</p>
     * @param BearerTokenCredentialConfig <p>Bearer Token凭证配置</p>
     */
    public void setBearerTokenCredentialConfig(AIGWBearerTokenCredentialConfig BearerTokenCredentialConfig) {
        this.BearerTokenCredentialConfig = BearerTokenCredentialConfig;
    }

    /**
     * Get <p>Basic Auth凭证配置</p> 
     * @return BasicCredentialConfig <p>Basic Auth凭证配置</p>
     */
    public AIGWBasicCredentialConfig getBasicCredentialConfig() {
        return this.BasicCredentialConfig;
    }

    /**
     * Set <p>Basic Auth凭证配置</p>
     * @param BasicCredentialConfig <p>Basic Auth凭证配置</p>
     */
    public void setBasicCredentialConfig(AIGWBasicCredentialConfig BasicCredentialConfig) {
        this.BasicCredentialConfig = BasicCredentialConfig;
    }

    /**
     * Get <p>自定义Header凭证配置</p> 
     * @return CustomHeaderCredentialConfig <p>自定义Header凭证配置</p>
     */
    public AIGWCustomHeaderCredentialConfig getCustomHeaderCredentialConfig() {
        return this.CustomHeaderCredentialConfig;
    }

    /**
     * Set <p>自定义Header凭证配置</p>
     * @param CustomHeaderCredentialConfig <p>自定义Header凭证配置</p>
     */
    public void setCustomHeaderCredentialConfig(AIGWCustomHeaderCredentialConfig CustomHeaderCredentialConfig) {
        this.CustomHeaderCredentialConfig = CustomHeaderCredentialConfig;
    }

    /**
     * Get <p>自定义Query参数凭证配置</p> 
     * @return QueryParamCredentialConfig <p>自定义Query参数凭证配置</p>
     */
    public AIGWQueryParamCredentialConfig getQueryParamCredentialConfig() {
        return this.QueryParamCredentialConfig;
    }

    /**
     * Set <p>自定义Query参数凭证配置</p>
     * @param QueryParamCredentialConfig <p>自定义Query参数凭证配置</p>
     */
    public void setQueryParamCredentialConfig(AIGWQueryParamCredentialConfig QueryParamCredentialConfig) {
        this.QueryParamCredentialConfig = QueryParamCredentialConfig;
    }

    /**
     * Get <p>同步状态</p> 
     * @return SyncStatus <p>同步状态</p>
     */
    public String getSyncStatus() {
        return this.SyncStatus;
    }

    /**
     * Set <p>同步状态</p>
     * @param SyncStatus <p>同步状态</p>
     */
    public void setSyncStatus(String SyncStatus) {
        this.SyncStatus = SyncStatus;
    }

    /**
     * Get <p>来源类型</p> 
     * @return SourceType <p>来源类型</p>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>来源类型</p>
     * @param SourceType <p>来源类型</p>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>已同步版本</p> 
     * @return SyncedVersion <p>已同步版本</p>
     */
    public String getSyncedVersion() {
        return this.SyncedVersion;
    }

    /**
     * Set <p>已同步版本</p>
     * @param SyncedVersion <p>已同步版本</p>
     */
    public void setSyncedVersion(String SyncedVersion) {
        this.SyncedVersion = SyncedVersion;
    }

    public CNAPIGwSecretKey() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CNAPIGwSecretKey(CNAPIGwSecretKey source) {
        if (source.SecretKeyId != null) {
            this.SecretKeyId = new String(source.SecretKeyId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SecretType != null) {
            this.SecretType = new String(source.SecretType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.GenerateType != null) {
            this.GenerateType = new String(source.GenerateType);
        }
        if (source.SecretValue != null) {
            this.SecretValue = new String(source.SecretValue);
        }
        if (source.KmsKeyName != null) {
            this.KmsKeyName = new String(source.KmsKeyName);
        }
        if (source.KmsKeyVersion != null) {
            this.KmsKeyVersion = new String(source.KmsKeyVersion);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CanBind != null) {
            this.CanBind = new Boolean(source.CanBind);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.BindCount != null) {
            this.BindCount = new Long(source.BindCount);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.JWTCredentialConfig != null) {
            this.JWTCredentialConfig = new AIGWJWTCredentialConfig(source.JWTCredentialConfig);
        }
        if (source.OAuthCredentialConfig != null) {
            this.OAuthCredentialConfig = new AIGWOAuthCredentialConfig(source.OAuthCredentialConfig);
        }
        if (source.OIDCCredentialConfig != null) {
            this.OIDCCredentialConfig = new AIGWOIDCCredentialConfig(source.OIDCCredentialConfig);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.AKSKCredentialConfig != null) {
            this.AKSKCredentialConfig = new AIGWAKSKCredentialConfig(source.AKSKCredentialConfig);
        }
        if (source.CAMCredentialConfig != null) {
            this.CAMCredentialConfig = new AIGWCAMCredentialConfig(source.CAMCredentialConfig);
        }
        if (source.BearerTokenCredentialConfig != null) {
            this.BearerTokenCredentialConfig = new AIGWBearerTokenCredentialConfig(source.BearerTokenCredentialConfig);
        }
        if (source.BasicCredentialConfig != null) {
            this.BasicCredentialConfig = new AIGWBasicCredentialConfig(source.BasicCredentialConfig);
        }
        if (source.CustomHeaderCredentialConfig != null) {
            this.CustomHeaderCredentialConfig = new AIGWCustomHeaderCredentialConfig(source.CustomHeaderCredentialConfig);
        }
        if (source.QueryParamCredentialConfig != null) {
            this.QueryParamCredentialConfig = new AIGWQueryParamCredentialConfig(source.QueryParamCredentialConfig);
        }
        if (source.SyncStatus != null) {
            this.SyncStatus = new String(source.SyncStatus);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.SyncedVersion != null) {
            this.SyncedVersion = new String(source.SyncedVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretKeyId", this.SecretKeyId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SecretType", this.SecretType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "GenerateType", this.GenerateType);
        this.setParamSimple(map, prefix + "SecretValue", this.SecretValue);
        this.setParamSimple(map, prefix + "KmsKeyName", this.KmsKeyName);
        this.setParamSimple(map, prefix + "KmsKeyVersion", this.KmsKeyVersion);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CanBind", this.CanBind);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "BindCount", this.BindCount);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamObj(map, prefix + "JWTCredentialConfig.", this.JWTCredentialConfig);
        this.setParamObj(map, prefix + "OAuthCredentialConfig.", this.OAuthCredentialConfig);
        this.setParamObj(map, prefix + "OIDCCredentialConfig.", this.OIDCCredentialConfig);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamObj(map, prefix + "AKSKCredentialConfig.", this.AKSKCredentialConfig);
        this.setParamObj(map, prefix + "CAMCredentialConfig.", this.CAMCredentialConfig);
        this.setParamObj(map, prefix + "BearerTokenCredentialConfig.", this.BearerTokenCredentialConfig);
        this.setParamObj(map, prefix + "BasicCredentialConfig.", this.BasicCredentialConfig);
        this.setParamObj(map, prefix + "CustomHeaderCredentialConfig.", this.CustomHeaderCredentialConfig);
        this.setParamObj(map, prefix + "QueryParamCredentialConfig.", this.QueryParamCredentialConfig);
        this.setParamSimple(map, prefix + "SyncStatus", this.SyncStatus);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SyncedVersion", this.SyncedVersion);

    }
}

