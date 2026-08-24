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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBackupVaultRequest extends AbstractModel {

    /**
    * 备份库名称
    */
    @SerializedName("VaultName")
    @Expose
    private String VaultName;

    /**
    * 备份库描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 加密方式: NONE/SSE-COS/SSE-KMS
    */
    @SerializedName("EncryptType")
    @Expose
    private String EncryptType;

    /**
    * KMS密钥ID（SSE-KMS时使用）
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
     * Get 备份库名称 
     * @return VaultName 备份库名称
     */
    public String getVaultName() {
        return this.VaultName;
    }

    /**
     * Set 备份库名称
     * @param VaultName 备份库名称
     */
    public void setVaultName(String VaultName) {
        this.VaultName = VaultName;
    }

    /**
     * Get 备份库描述 
     * @return Description 备份库描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 备份库描述
     * @param Description 备份库描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 加密方式: NONE/SSE-COS/SSE-KMS 
     * @return EncryptType 加密方式: NONE/SSE-COS/SSE-KMS
     */
    public String getEncryptType() {
        return this.EncryptType;
    }

    /**
     * Set 加密方式: NONE/SSE-COS/SSE-KMS
     * @param EncryptType 加密方式: NONE/SSE-COS/SSE-KMS
     */
    public void setEncryptType(String EncryptType) {
        this.EncryptType = EncryptType;
    }

    /**
     * Get KMS密钥ID（SSE-KMS时使用） 
     * @return KmsKeyId KMS密钥ID（SSE-KMS时使用）
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set KMS密钥ID（SSE-KMS时使用）
     * @param KmsKeyId KMS密钥ID（SSE-KMS时使用）
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    public CreateBackupVaultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBackupVaultRequest(CreateBackupVaultRequest source) {
        if (source.VaultName != null) {
            this.VaultName = new String(source.VaultName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EncryptType != null) {
            this.EncryptType = new String(source.EncryptType);
        }
        if (source.KmsKeyId != null) {
            this.KmsKeyId = new String(source.KmsKeyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VaultName", this.VaultName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "EncryptType", this.EncryptType);
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);

    }
}

