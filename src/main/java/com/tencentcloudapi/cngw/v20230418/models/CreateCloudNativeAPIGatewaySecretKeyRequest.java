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
package com.tencentcloudapi.cngw.v20230418.models;

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
    * <p>密钥协议类型。</p><p>枚举值：</p><ul><li>ApiKey</li><li>Basic</li><li>Hmac</li><li>OAuth2</li><li>JWT</li></ul>
    */
    @SerializedName("SecretType")
    @Expose
    private String SecretType;

    /**
    * <p>密钥名称，2-60 字符。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>密钥生成方式。</p><p>枚举值：</p><ul><li>System：系统自动生成</li><li>Custom：用户自定义（需传 SecretValue）</li><li>KMS：使用 KMS 密钥（需传 KmsKeyName 与 KmsKeyVersion）</li></ul>
    */
    @SerializedName("GenerateType")
    @Expose
    private String GenerateType;

    /**
    * <p>密钥归属资源类型。</p><p>枚举值：</p><ul><li>Consumer：消费者</li><li>ModelService：模型服务</li></ul>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * <p>KMS 密钥名称。GenerateType=KMS 时必填。</p>
    */
    @SerializedName("KmsKeyName")
    @Expose
    private String KmsKeyName;

    /**
    * <p>KMS 密钥版本。GenerateType=KMS 时必填。</p>
    */
    @SerializedName("KmsKeyVersion")
    @Expose
    private String KmsKeyVersion;

    /**
    * <p>密钥值，长度 8-256。GenerateType=Custom 时必填。</p>
    */
    @SerializedName("SecretValue")
    @Expose
    private String SecretValue;

    /**
    * <p>密钥描述。最长 200 字符。</p>
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
     * Get <p>密钥协议类型。</p><p>枚举值：</p><ul><li>ApiKey</li><li>Basic</li><li>Hmac</li><li>OAuth2</li><li>JWT</li></ul> 
     * @return SecretType <p>密钥协议类型。</p><p>枚举值：</p><ul><li>ApiKey</li><li>Basic</li><li>Hmac</li><li>OAuth2</li><li>JWT</li></ul>
     */
    public String getSecretType() {
        return this.SecretType;
    }

    /**
     * Set <p>密钥协议类型。</p><p>枚举值：</p><ul><li>ApiKey</li><li>Basic</li><li>Hmac</li><li>OAuth2</li><li>JWT</li></ul>
     * @param SecretType <p>密钥协议类型。</p><p>枚举值：</p><ul><li>ApiKey</li><li>Basic</li><li>Hmac</li><li>OAuth2</li><li>JWT</li></ul>
     */
    public void setSecretType(String SecretType) {
        this.SecretType = SecretType;
    }

    /**
     * Get <p>密钥名称，2-60 字符。</p> 
     * @return Name <p>密钥名称，2-60 字符。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>密钥名称，2-60 字符。</p>
     * @param Name <p>密钥名称，2-60 字符。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>密钥生成方式。</p><p>枚举值：</p><ul><li>System：系统自动生成</li><li>Custom：用户自定义（需传 SecretValue）</li><li>KMS：使用 KMS 密钥（需传 KmsKeyName 与 KmsKeyVersion）</li></ul> 
     * @return GenerateType <p>密钥生成方式。</p><p>枚举值：</p><ul><li>System：系统自动生成</li><li>Custom：用户自定义（需传 SecretValue）</li><li>KMS：使用 KMS 密钥（需传 KmsKeyName 与 KmsKeyVersion）</li></ul>
     */
    public String getGenerateType() {
        return this.GenerateType;
    }

    /**
     * Set <p>密钥生成方式。</p><p>枚举值：</p><ul><li>System：系统自动生成</li><li>Custom：用户自定义（需传 SecretValue）</li><li>KMS：使用 KMS 密钥（需传 KmsKeyName 与 KmsKeyVersion）</li></ul>
     * @param GenerateType <p>密钥生成方式。</p><p>枚举值：</p><ul><li>System：系统自动生成</li><li>Custom：用户自定义（需传 SecretValue）</li><li>KMS：使用 KMS 密钥（需传 KmsKeyName 与 KmsKeyVersion）</li></ul>
     */
    public void setGenerateType(String GenerateType) {
        this.GenerateType = GenerateType;
    }

    /**
     * Get <p>密钥归属资源类型。</p><p>枚举值：</p><ul><li>Consumer：消费者</li><li>ModelService：模型服务</li></ul> 
     * @return ResourceType <p>密钥归属资源类型。</p><p>枚举值：</p><ul><li>Consumer：消费者</li><li>ModelService：模型服务</li></ul>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>密钥归属资源类型。</p><p>枚举值：</p><ul><li>Consumer：消费者</li><li>ModelService：模型服务</li></ul>
     * @param ResourceType <p>密钥归属资源类型。</p><p>枚举值：</p><ul><li>Consumer：消费者</li><li>ModelService：模型服务</li></ul>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>KMS 密钥名称。GenerateType=KMS 时必填。</p> 
     * @return KmsKeyName <p>KMS 密钥名称。GenerateType=KMS 时必填。</p>
     */
    public String getKmsKeyName() {
        return this.KmsKeyName;
    }

    /**
     * Set <p>KMS 密钥名称。GenerateType=KMS 时必填。</p>
     * @param KmsKeyName <p>KMS 密钥名称。GenerateType=KMS 时必填。</p>
     */
    public void setKmsKeyName(String KmsKeyName) {
        this.KmsKeyName = KmsKeyName;
    }

    /**
     * Get <p>KMS 密钥版本。GenerateType=KMS 时必填。</p> 
     * @return KmsKeyVersion <p>KMS 密钥版本。GenerateType=KMS 时必填。</p>
     */
    public String getKmsKeyVersion() {
        return this.KmsKeyVersion;
    }

    /**
     * Set <p>KMS 密钥版本。GenerateType=KMS 时必填。</p>
     * @param KmsKeyVersion <p>KMS 密钥版本。GenerateType=KMS 时必填。</p>
     */
    public void setKmsKeyVersion(String KmsKeyVersion) {
        this.KmsKeyVersion = KmsKeyVersion;
    }

    /**
     * Get <p>密钥值，长度 8-256。GenerateType=Custom 时必填。</p> 
     * @return SecretValue <p>密钥值，长度 8-256。GenerateType=Custom 时必填。</p>
     */
    public String getSecretValue() {
        return this.SecretValue;
    }

    /**
     * Set <p>密钥值，长度 8-256。GenerateType=Custom 时必填。</p>
     * @param SecretValue <p>密钥值，长度 8-256。GenerateType=Custom 时必填。</p>
     */
    public void setSecretValue(String SecretValue) {
        this.SecretValue = SecretValue;
    }

    /**
     * Get <p>密钥描述。最长 200 字符。</p> 
     * @return Description <p>密钥描述。最长 200 字符。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>密钥描述。最长 200 字符。</p>
     * @param Description <p>密钥描述。最长 200 字符。</p>
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

