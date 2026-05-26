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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSecretRequest extends AbstractModel {

    /**
    * <p>凭据名称，同一region内不可重复，最长128字节，使用字母、数字或者 - _ 的组合，第一个字符必须为字母或者数字。一旦创建不可修改。</p>
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * <p>凭据版本，查询凭据信息时需要根据SecretName 和 VersionId进行查询，最长64 字节，使用字母、数字或者 - _ . 的组合并且以字母或数字开头。若为空，则使用默认的初始凭据版本号。可选，若为空或该凭据为云产品类凭据，则该版本号默认为 SSM_Current。</p>
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * <p>描述信息，用于详细描述用途等，最大支持2048字节。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>指定对凭据进行加密的KMS CMK。如果为空则表示使用Secrets Manager为您默认创建的CMK进行加密。您也可以指定在同region 下自行创建的KMS CMK进行加密。</p>
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
    * <p>凭据类型，默认为0自定义凭据。</p>
    */
    @SerializedName("SecretType")
    @Expose
    private Long SecretType;

    /**
    * <p>二进制凭据信息base64编码后的明文。SecretBinary 和 SecretString 必须且只能设置一个，最大支持32KB字节。</p>
    */
    @SerializedName("SecretBinary")
    @Expose
    private String SecretBinary;

    /**
    * <p>文本类型凭据信息明文（不需要进行base64编码）。SecretBinary 和 SecretString 必须且只能设置一个，最大支持32KB字节。</p>
    */
    @SerializedName("SecretString")
    @Expose
    private String SecretString;

    /**
    * <p>JSON 格式字符串，用于指定特定凭据类型的额外配置。</p>
    */
    @SerializedName("AdditionalConfig")
    @Expose
    private String AdditionalConfig;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>KMS的独享集群的ID。当KmsKeyId为空,并且用户的KMS存在有效的HsmClusterId时有效。</p>
    */
    @SerializedName("KmsHsmClusterId")
    @Expose
    private String KmsHsmClusterId;

    /**
    * <p>凭据加密类型</p><p>枚举值：</p><ul><li>0： KMS 密钥加密</li><li>1： 软密钥加密</li></ul>
    */
    @SerializedName("EncryptType")
    @Expose
    private Long EncryptType;

    /**
     * Get <p>凭据名称，同一region内不可重复，最长128字节，使用字母、数字或者 - _ 的组合，第一个字符必须为字母或者数字。一旦创建不可修改。</p> 
     * @return SecretName <p>凭据名称，同一region内不可重复，最长128字节，使用字母、数字或者 - _ 的组合，第一个字符必须为字母或者数字。一旦创建不可修改。</p>
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set <p>凭据名称，同一region内不可重复，最长128字节，使用字母、数字或者 - _ 的组合，第一个字符必须为字母或者数字。一旦创建不可修改。</p>
     * @param SecretName <p>凭据名称，同一region内不可重复，最长128字节，使用字母、数字或者 - _ 的组合，第一个字符必须为字母或者数字。一旦创建不可修改。</p>
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get <p>凭据版本，查询凭据信息时需要根据SecretName 和 VersionId进行查询，最长64 字节，使用字母、数字或者 - _ . 的组合并且以字母或数字开头。若为空，则使用默认的初始凭据版本号。可选，若为空或该凭据为云产品类凭据，则该版本号默认为 SSM_Current。</p> 
     * @return VersionId <p>凭据版本，查询凭据信息时需要根据SecretName 和 VersionId进行查询，最长64 字节，使用字母、数字或者 - _ . 的组合并且以字母或数字开头。若为空，则使用默认的初始凭据版本号。可选，若为空或该凭据为云产品类凭据，则该版本号默认为 SSM_Current。</p>
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set <p>凭据版本，查询凭据信息时需要根据SecretName 和 VersionId进行查询，最长64 字节，使用字母、数字或者 - _ . 的组合并且以字母或数字开头。若为空，则使用默认的初始凭据版本号。可选，若为空或该凭据为云产品类凭据，则该版本号默认为 SSM_Current。</p>
     * @param VersionId <p>凭据版本，查询凭据信息时需要根据SecretName 和 VersionId进行查询，最长64 字节，使用字母、数字或者 - _ . 的组合并且以字母或数字开头。若为空，则使用默认的初始凭据版本号。可选，若为空或该凭据为云产品类凭据，则该版本号默认为 SSM_Current。</p>
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get <p>描述信息，用于详细描述用途等，最大支持2048字节。</p> 
     * @return Description <p>描述信息，用于详细描述用途等，最大支持2048字节。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述信息，用于详细描述用途等，最大支持2048字节。</p>
     * @param Description <p>描述信息，用于详细描述用途等，最大支持2048字节。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>指定对凭据进行加密的KMS CMK。如果为空则表示使用Secrets Manager为您默认创建的CMK进行加密。您也可以指定在同region 下自行创建的KMS CMK进行加密。</p> 
     * @return KmsKeyId <p>指定对凭据进行加密的KMS CMK。如果为空则表示使用Secrets Manager为您默认创建的CMK进行加密。您也可以指定在同region 下自行创建的KMS CMK进行加密。</p>
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set <p>指定对凭据进行加密的KMS CMK。如果为空则表示使用Secrets Manager为您默认创建的CMK进行加密。您也可以指定在同region 下自行创建的KMS CMK进行加密。</p>
     * @param KmsKeyId <p>指定对凭据进行加密的KMS CMK。如果为空则表示使用Secrets Manager为您默认创建的CMK进行加密。您也可以指定在同region 下自行创建的KMS CMK进行加密。</p>
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    /**
     * Get <p>凭据类型，默认为0自定义凭据。</p> 
     * @return SecretType <p>凭据类型，默认为0自定义凭据。</p>
     */
    public Long getSecretType() {
        return this.SecretType;
    }

    /**
     * Set <p>凭据类型，默认为0自定义凭据。</p>
     * @param SecretType <p>凭据类型，默认为0自定义凭据。</p>
     */
    public void setSecretType(Long SecretType) {
        this.SecretType = SecretType;
    }

    /**
     * Get <p>二进制凭据信息base64编码后的明文。SecretBinary 和 SecretString 必须且只能设置一个，最大支持32KB字节。</p> 
     * @return SecretBinary <p>二进制凭据信息base64编码后的明文。SecretBinary 和 SecretString 必须且只能设置一个，最大支持32KB字节。</p>
     */
    public String getSecretBinary() {
        return this.SecretBinary;
    }

    /**
     * Set <p>二进制凭据信息base64编码后的明文。SecretBinary 和 SecretString 必须且只能设置一个，最大支持32KB字节。</p>
     * @param SecretBinary <p>二进制凭据信息base64编码后的明文。SecretBinary 和 SecretString 必须且只能设置一个，最大支持32KB字节。</p>
     */
    public void setSecretBinary(String SecretBinary) {
        this.SecretBinary = SecretBinary;
    }

    /**
     * Get <p>文本类型凭据信息明文（不需要进行base64编码）。SecretBinary 和 SecretString 必须且只能设置一个，最大支持32KB字节。</p> 
     * @return SecretString <p>文本类型凭据信息明文（不需要进行base64编码）。SecretBinary 和 SecretString 必须且只能设置一个，最大支持32KB字节。</p>
     */
    public String getSecretString() {
        return this.SecretString;
    }

    /**
     * Set <p>文本类型凭据信息明文（不需要进行base64编码）。SecretBinary 和 SecretString 必须且只能设置一个，最大支持32KB字节。</p>
     * @param SecretString <p>文本类型凭据信息明文（不需要进行base64编码）。SecretBinary 和 SecretString 必须且只能设置一个，最大支持32KB字节。</p>
     */
    public void setSecretString(String SecretString) {
        this.SecretString = SecretString;
    }

    /**
     * Get <p>JSON 格式字符串，用于指定特定凭据类型的额外配置。</p> 
     * @return AdditionalConfig <p>JSON 格式字符串，用于指定特定凭据类型的额外配置。</p>
     */
    public String getAdditionalConfig() {
        return this.AdditionalConfig;
    }

    /**
     * Set <p>JSON 格式字符串，用于指定特定凭据类型的额外配置。</p>
     * @param AdditionalConfig <p>JSON 格式字符串，用于指定特定凭据类型的额外配置。</p>
     */
    public void setAdditionalConfig(String AdditionalConfig) {
        this.AdditionalConfig = AdditionalConfig;
    }

    /**
     * Get <p>标签列表</p> 
     * @return Tags <p>标签列表</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表</p>
     * @param Tags <p>标签列表</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>KMS的独享集群的ID。当KmsKeyId为空,并且用户的KMS存在有效的HsmClusterId时有效。</p> 
     * @return KmsHsmClusterId <p>KMS的独享集群的ID。当KmsKeyId为空,并且用户的KMS存在有效的HsmClusterId时有效。</p>
     */
    public String getKmsHsmClusterId() {
        return this.KmsHsmClusterId;
    }

    /**
     * Set <p>KMS的独享集群的ID。当KmsKeyId为空,并且用户的KMS存在有效的HsmClusterId时有效。</p>
     * @param KmsHsmClusterId <p>KMS的独享集群的ID。当KmsKeyId为空,并且用户的KMS存在有效的HsmClusterId时有效。</p>
     */
    public void setKmsHsmClusterId(String KmsHsmClusterId) {
        this.KmsHsmClusterId = KmsHsmClusterId;
    }

    /**
     * Get <p>凭据加密类型</p><p>枚举值：</p><ul><li>0： KMS 密钥加密</li><li>1： 软密钥加密</li></ul> 
     * @return EncryptType <p>凭据加密类型</p><p>枚举值：</p><ul><li>0： KMS 密钥加密</li><li>1： 软密钥加密</li></ul>
     */
    public Long getEncryptType() {
        return this.EncryptType;
    }

    /**
     * Set <p>凭据加密类型</p><p>枚举值：</p><ul><li>0： KMS 密钥加密</li><li>1： 软密钥加密</li></ul>
     * @param EncryptType <p>凭据加密类型</p><p>枚举值：</p><ul><li>0： KMS 密钥加密</li><li>1： 软密钥加密</li></ul>
     */
    public void setEncryptType(Long EncryptType) {
        this.EncryptType = EncryptType;
    }

    public CreateSecretRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSecretRequest(CreateSecretRequest source) {
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.KmsKeyId != null) {
            this.KmsKeyId = new String(source.KmsKeyId);
        }
        if (source.SecretType != null) {
            this.SecretType = new Long(source.SecretType);
        }
        if (source.SecretBinary != null) {
            this.SecretBinary = new String(source.SecretBinary);
        }
        if (source.SecretString != null) {
            this.SecretString = new String(source.SecretString);
        }
        if (source.AdditionalConfig != null) {
            this.AdditionalConfig = new String(source.AdditionalConfig);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.KmsHsmClusterId != null) {
            this.KmsHsmClusterId = new String(source.KmsHsmClusterId);
        }
        if (source.EncryptType != null) {
            this.EncryptType = new Long(source.EncryptType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);
        this.setParamSimple(map, prefix + "SecretType", this.SecretType);
        this.setParamSimple(map, prefix + "SecretBinary", this.SecretBinary);
        this.setParamSimple(map, prefix + "SecretString", this.SecretString);
        this.setParamSimple(map, prefix + "AdditionalConfig", this.AdditionalConfig);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "KmsHsmClusterId", this.KmsHsmClusterId);
        this.setParamSimple(map, prefix + "EncryptType", this.EncryptType);

    }
}

