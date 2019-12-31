/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecretMetadata extends AbstractModel{

    /**
    * 凭据名称。
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * 凭据的描述信息。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 用于加密凭据的KMS KeyId。
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
    * 创建者UIN。
    */
    @SerializedName("CreateUin")
    @Expose
    private Long CreateUin;

    /**
    * 凭据状态：Enabled、Disabled、PendingDelete
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 凭据删除日期，对于status为PendingDelete 的有效，unix时间戳。
    */
    @SerializedName("DeleteTime")
    @Expose
    private Long DeleteTime;

    /**
    * 凭据创建时间，unix时间戳。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 用于加密凭据的KMS CMK类型，DEFAULT 表示SecretsManager 创建的默认密钥， CUSTOMER 表示用户指定的密钥。
    */
    @SerializedName("KmsKeyType")
    @Expose
    private String KmsKeyType;

    /**
     * Get 凭据名称。 
     * @return SecretName 凭据名称。
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set 凭据名称。
     * @param SecretName 凭据名称。
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get 凭据的描述信息。 
     * @return Description 凭据的描述信息。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 凭据的描述信息。
     * @param Description 凭据的描述信息。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 用于加密凭据的KMS KeyId。 
     * @return KmsKeyId 用于加密凭据的KMS KeyId。
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set 用于加密凭据的KMS KeyId。
     * @param KmsKeyId 用于加密凭据的KMS KeyId。
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    /**
     * Get 创建者UIN。 
     * @return CreateUin 创建者UIN。
     */
    public Long getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set 创建者UIN。
     * @param CreateUin 创建者UIN。
     */
    public void setCreateUin(Long CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get 凭据状态：Enabled、Disabled、PendingDelete 
     * @return Status 凭据状态：Enabled、Disabled、PendingDelete
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 凭据状态：Enabled、Disabled、PendingDelete
     * @param Status 凭据状态：Enabled、Disabled、PendingDelete
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 凭据删除日期，对于status为PendingDelete 的有效，unix时间戳。 
     * @return DeleteTime 凭据删除日期，对于status为PendingDelete 的有效，unix时间戳。
     */
    public Long getDeleteTime() {
        return this.DeleteTime;
    }

    /**
     * Set 凭据删除日期，对于status为PendingDelete 的有效，unix时间戳。
     * @param DeleteTime 凭据删除日期，对于status为PendingDelete 的有效，unix时间戳。
     */
    public void setDeleteTime(Long DeleteTime) {
        this.DeleteTime = DeleteTime;
    }

    /**
     * Get 凭据创建时间，unix时间戳。 
     * @return CreateTime 凭据创建时间，unix时间戳。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 凭据创建时间，unix时间戳。
     * @param CreateTime 凭据创建时间，unix时间戳。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 用于加密凭据的KMS CMK类型，DEFAULT 表示SecretsManager 创建的默认密钥， CUSTOMER 表示用户指定的密钥。 
     * @return KmsKeyType 用于加密凭据的KMS CMK类型，DEFAULT 表示SecretsManager 创建的默认密钥， CUSTOMER 表示用户指定的密钥。
     */
    public String getKmsKeyType() {
        return this.KmsKeyType;
    }

    /**
     * Set 用于加密凭据的KMS CMK类型，DEFAULT 表示SecretsManager 创建的默认密钥， CUSTOMER 表示用户指定的密钥。
     * @param KmsKeyType 用于加密凭据的KMS CMK类型，DEFAULT 表示SecretsManager 创建的默认密钥， CUSTOMER 表示用户指定的密钥。
     */
    public void setKmsKeyType(String KmsKeyType) {
        this.KmsKeyType = KmsKeyType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DeleteTime", this.DeleteTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "KmsKeyType", this.KmsKeyType);

    }
}

