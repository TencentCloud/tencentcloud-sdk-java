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

public class CreateCloudNativeAPIGatewaySecretKeyRequest extends AbstractModel {

    /**
    * 实例 ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 密钥类型： ApiKey
    */
    @SerializedName("SecretType")
    @Expose
    private String SecretType;

    /**
    * 密钥名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 生成方式：  

密钥类型 Consumer 时选项：  

- KMS
- System 系统  
- Custom  自定义  

密钥类型是 LLM 时选项 

- KMS 
- Custom  自定义 
    */
    @SerializedName("GenerateType")
    @Expose
    private String GenerateType;

    /**
    * 资源类型：
- Consumer 消费者
- LLM 模型服务
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * KMS 的凭证名字， GenerateType 时 kms 必填
    */
    @SerializedName("KmsKeyName")
    @Expose
    private String KmsKeyName;

    /**
    * KMS 的凭证版本， GenerateType 时 kms 必填
    */
    @SerializedName("KmsKeyVersion")
    @Expose
    private String KmsKeyVersion;

    /**
    * GenerateType 等于 Custom 是必填
    */
    @SerializedName("SecretValue")
    @Expose
    private String SecretValue;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 实例 ID 
     * @return GatewayId 实例 ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 实例 ID
     * @param GatewayId 实例 ID
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 密钥类型： ApiKey 
     * @return SecretType 密钥类型： ApiKey
     */
    public String getSecretType() {
        return this.SecretType;
    }

    /**
     * Set 密钥类型： ApiKey
     * @param SecretType 密钥类型： ApiKey
     */
    public void setSecretType(String SecretType) {
        this.SecretType = SecretType;
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
     * Get 生成方式：  

密钥类型 Consumer 时选项：  

- KMS
- System 系统  
- Custom  自定义  

密钥类型是 LLM 时选项 

- KMS 
- Custom  自定义  
     * @return GenerateType 生成方式：  

密钥类型 Consumer 时选项：  

- KMS
- System 系统  
- Custom  自定义  

密钥类型是 LLM 时选项 

- KMS 
- Custom  自定义 
     */
    public String getGenerateType() {
        return this.GenerateType;
    }

    /**
     * Set 生成方式：  

密钥类型 Consumer 时选项：  

- KMS
- System 系统  
- Custom  自定义  

密钥类型是 LLM 时选项 

- KMS 
- Custom  自定义 
     * @param GenerateType 生成方式：  

密钥类型 Consumer 时选项：  

- KMS
- System 系统  
- Custom  自定义  

密钥类型是 LLM 时选项 

- KMS 
- Custom  自定义 
     */
    public void setGenerateType(String GenerateType) {
        this.GenerateType = GenerateType;
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

    /**
     * Get KMS 的凭证名字， GenerateType 时 kms 必填 
     * @return KmsKeyName KMS 的凭证名字， GenerateType 时 kms 必填
     */
    public String getKmsKeyName() {
        return this.KmsKeyName;
    }

    /**
     * Set KMS 的凭证名字， GenerateType 时 kms 必填
     * @param KmsKeyName KMS 的凭证名字， GenerateType 时 kms 必填
     */
    public void setKmsKeyName(String KmsKeyName) {
        this.KmsKeyName = KmsKeyName;
    }

    /**
     * Get KMS 的凭证版本， GenerateType 时 kms 必填 
     * @return KmsKeyVersion KMS 的凭证版本， GenerateType 时 kms 必填
     */
    public String getKmsKeyVersion() {
        return this.KmsKeyVersion;
    }

    /**
     * Set KMS 的凭证版本， GenerateType 时 kms 必填
     * @param KmsKeyVersion KMS 的凭证版本， GenerateType 时 kms 必填
     */
    public void setKmsKeyVersion(String KmsKeyVersion) {
        this.KmsKeyVersion = KmsKeyVersion;
    }

    /**
     * Get GenerateType 等于 Custom 是必填 
     * @return SecretValue GenerateType 等于 Custom 是必填
     */
    public String getSecretValue() {
        return this.SecretValue;
    }

    /**
     * Set GenerateType 等于 Custom 是必填
     * @param SecretValue GenerateType 等于 Custom 是必填
     */
    public void setSecretValue(String SecretValue) {
        this.SecretValue = SecretValue;
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

    public CreateCloudNativeAPIGatewaySecretKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudNativeAPIGatewaySecretKeyRequest(CreateCloudNativeAPIGatewaySecretKeyRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.SecretType != null) {
            this.SecretType = new String(source.SecretType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.GenerateType != null) {
            this.GenerateType = new String(source.GenerateType);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.KmsKeyName != null) {
            this.KmsKeyName = new String(source.KmsKeyName);
        }
        if (source.KmsKeyVersion != null) {
            this.KmsKeyVersion = new String(source.KmsKeyVersion);
        }
        if (source.SecretValue != null) {
            this.SecretValue = new String(source.SecretValue);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "SecretType", this.SecretType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "GenerateType", this.GenerateType);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "KmsKeyName", this.KmsKeyName);
        this.setParamSimple(map, prefix + "KmsKeyVersion", this.KmsKeyVersion);
        this.setParamSimple(map, prefix + "SecretValue", this.SecretValue);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

