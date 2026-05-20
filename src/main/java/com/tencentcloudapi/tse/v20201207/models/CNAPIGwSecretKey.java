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
    * 密钥id
    */
    @SerializedName("SecretKeyId")
    @Expose
    private String SecretKeyId;

    /**
    * 密钥名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 密钥类型：ApiKey/JWT
    */
    @SerializedName("SecretType")
    @Expose
    private String SecretType;

    /**
    * 状态:
- Enable: 启用
- Disable: 禁用
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 生成方式:KMS/System/Custom
    */
    @SerializedName("GenerateType")
    @Expose
    private String GenerateType;

    /**
    * 密钥值
    */
    @SerializedName("SecretValue")
    @Expose
    private String SecretValue;

    /**
    * KMS凭证名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KmsKeyName")
    @Expose
    private String KmsKeyName;

    /**
    * KMS凭证版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KmsKeyVersion")
    @Expose
    private String KmsKeyVersion;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 是否可以绑定
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CanBind")
    @Expose
    private Boolean CanBind;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 绑定数
    */
    @SerializedName("BindCount")
    @Expose
    private Long BindCount;

    /**
    * 资源类型：
- Consumer 消费者
- LLM 模型服务
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
     * Get 密钥id 
     * @return SecretKeyId 密钥id
     */
    public String getSecretKeyId() {
        return this.SecretKeyId;
    }

    /**
     * Set 密钥id
     * @param SecretKeyId 密钥id
     */
    public void setSecretKeyId(String SecretKeyId) {
        this.SecretKeyId = SecretKeyId;
    }

    /**
     * Get 密钥名字 
     * @return Name 密钥名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 密钥名字
     * @param Name 密钥名字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 密钥类型：ApiKey/JWT 
     * @return SecretType 密钥类型：ApiKey/JWT
     */
    public String getSecretType() {
        return this.SecretType;
    }

    /**
     * Set 密钥类型：ApiKey/JWT
     * @param SecretType 密钥类型：ApiKey/JWT
     */
    public void setSecretType(String SecretType) {
        this.SecretType = SecretType;
    }

    /**
     * Get 状态:
- Enable: 启用
- Disable: 禁用 
     * @return Status 状态:
- Enable: 启用
- Disable: 禁用
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态:
- Enable: 启用
- Disable: 禁用
     * @param Status 状态:
- Enable: 启用
- Disable: 禁用
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 生成方式:KMS/System/Custom 
     * @return GenerateType 生成方式:KMS/System/Custom
     */
    public String getGenerateType() {
        return this.GenerateType;
    }

    /**
     * Set 生成方式:KMS/System/Custom
     * @param GenerateType 生成方式:KMS/System/Custom
     */
    public void setGenerateType(String GenerateType) {
        this.GenerateType = GenerateType;
    }

    /**
     * Get 密钥值 
     * @return SecretValue 密钥值
     */
    public String getSecretValue() {
        return this.SecretValue;
    }

    /**
     * Set 密钥值
     * @param SecretValue 密钥值
     */
    public void setSecretValue(String SecretValue) {
        this.SecretValue = SecretValue;
    }

    /**
     * Get KMS凭证名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KmsKeyName KMS凭证名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKmsKeyName() {
        return this.KmsKeyName;
    }

    /**
     * Set KMS凭证名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param KmsKeyName KMS凭证名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKmsKeyName(String KmsKeyName) {
        this.KmsKeyName = KmsKeyName;
    }

    /**
     * Get KMS凭证版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KmsKeyVersion KMS凭证版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKmsKeyVersion() {
        return this.KmsKeyVersion;
    }

    /**
     * Set KMS凭证版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param KmsKeyVersion KMS凭证版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKmsKeyVersion(String KmsKeyVersion) {
        this.KmsKeyVersion = KmsKeyVersion;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 是否可以绑定
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CanBind 是否可以绑定
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCanBind() {
        return this.CanBind;
    }

    /**
     * Set 是否可以绑定
注意：此字段可能返回 null，表示取不到有效值。
     * @param CanBind 是否可以绑定
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCanBind(Boolean CanBind) {
        this.CanBind = CanBind;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间 
     * @return ModifyTime 修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
     * @param ModifyTime 修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 绑定数 
     * @return BindCount 绑定数
     */
    public Long getBindCount() {
        return this.BindCount;
    }

    /**
     * Set 绑定数
     * @param BindCount 绑定数
     */
    public void setBindCount(Long BindCount) {
        this.BindCount = BindCount;
    }

    /**
     * Get 资源类型：
- Consumer 消费者
- LLM 模型服务 
     * @return ResourceType 资源类型：
- Consumer 消费者
- LLM 模型服务
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型：
- Consumer 消费者
- LLM 模型服务
     * @param ResourceType 资源类型：
- Consumer 消费者
- LLM 模型服务
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

