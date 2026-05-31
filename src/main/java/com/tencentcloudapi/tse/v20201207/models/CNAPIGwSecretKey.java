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

    }
}

