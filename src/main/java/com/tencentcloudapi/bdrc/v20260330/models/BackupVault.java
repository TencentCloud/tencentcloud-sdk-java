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

public class BackupVault extends AbstractModel {

    /**
    * 备份库ID
    */
    @SerializedName("VaultId")
    @Expose
    private String VaultId;

    /**
    * 备份库名称
    */
    @SerializedName("VaultName")
    @Expose
    private String VaultName;

    /**
    * 备份库描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 备份库状态：READ_WRITE / READ_ONLY / UNAVAILABLE / DELETING
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 加密方式：NONE / SSE-COS / SSE-KMS
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EncryptType")
    @Expose
    private String EncryptType;

    /**
    * KMS密钥ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
    * 备份库类型：COMMON
    */
    @SerializedName("VaultType")
    @Expose
    private String VaultType;

    /**
    * 关联的备份策略按类型统计
    */
    @SerializedName("BackupPolicySet")
    @Expose
    private TypeCount [] BackupPolicySet;

    /**
    * 备份点按类型统计（不含已删除）
    */
    @SerializedName("BackupSet")
    @Expose
    private TypeCount [] BackupSet;

    /**
    * 地域信息
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 源端数据量
    */
    @SerializedName("SourceDataSize")
    @Expose
    private Long SourceDataSize;

    /**
    * 存储库数据量
    */
    @SerializedName("VaultDataSize")
    @Expose
    private Long VaultDataSize;

    /**
     * Get 备份库ID 
     * @return VaultId 备份库ID
     */
    public String getVaultId() {
        return this.VaultId;
    }

    /**
     * Set 备份库ID
     * @param VaultId 备份库ID
     */
    public void setVaultId(String VaultId) {
        this.VaultId = VaultId;
    }

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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 备份库描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 备份库描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 备份库描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 备份库状态：READ_WRITE / READ_ONLY / UNAVAILABLE / DELETING 
     * @return Status 备份库状态：READ_WRITE / READ_ONLY / UNAVAILABLE / DELETING
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 备份库状态：READ_WRITE / READ_ONLY / UNAVAILABLE / DELETING
     * @param Status 备份库状态：READ_WRITE / READ_ONLY / UNAVAILABLE / DELETING
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 加密方式：NONE / SSE-COS / SSE-KMS
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EncryptType 加密方式：NONE / SSE-COS / SSE-KMS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEncryptType() {
        return this.EncryptType;
    }

    /**
     * Set 加密方式：NONE / SSE-COS / SSE-KMS
注意：此字段可能返回 null，表示取不到有效值。
     * @param EncryptType 加密方式：NONE / SSE-COS / SSE-KMS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncryptType(String EncryptType) {
        this.EncryptType = EncryptType;
    }

    /**
     * Get KMS密钥ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KmsKeyId KMS密钥ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set KMS密钥ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param KmsKeyId KMS密钥ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    /**
     * Get 备份库类型：COMMON 
     * @return VaultType 备份库类型：COMMON
     */
    public String getVaultType() {
        return this.VaultType;
    }

    /**
     * Set 备份库类型：COMMON
     * @param VaultType 备份库类型：COMMON
     */
    public void setVaultType(String VaultType) {
        this.VaultType = VaultType;
    }

    /**
     * Get 关联的备份策略按类型统计 
     * @return BackupPolicySet 关联的备份策略按类型统计
     */
    public TypeCount [] getBackupPolicySet() {
        return this.BackupPolicySet;
    }

    /**
     * Set 关联的备份策略按类型统计
     * @param BackupPolicySet 关联的备份策略按类型统计
     */
    public void setBackupPolicySet(TypeCount [] BackupPolicySet) {
        this.BackupPolicySet = BackupPolicySet;
    }

    /**
     * Get 备份点按类型统计（不含已删除） 
     * @return BackupSet 备份点按类型统计（不含已删除）
     */
    public TypeCount [] getBackupSet() {
        return this.BackupSet;
    }

    /**
     * Set 备份点按类型统计（不含已删除）
     * @param BackupSet 备份点按类型统计（不含已删除）
     */
    public void setBackupSet(TypeCount [] BackupSet) {
        this.BackupSet = BackupSet;
    }

    /**
     * Get 地域信息 
     * @return Region 地域信息
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域信息
     * @param Region 地域信息
     */
    public void setRegion(String Region) {
        this.Region = Region;
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
     * Get 源端数据量 
     * @return SourceDataSize 源端数据量
     */
    public Long getSourceDataSize() {
        return this.SourceDataSize;
    }

    /**
     * Set 源端数据量
     * @param SourceDataSize 源端数据量
     */
    public void setSourceDataSize(Long SourceDataSize) {
        this.SourceDataSize = SourceDataSize;
    }

    /**
     * Get 存储库数据量 
     * @return VaultDataSize 存储库数据量
     */
    public Long getVaultDataSize() {
        return this.VaultDataSize;
    }

    /**
     * Set 存储库数据量
     * @param VaultDataSize 存储库数据量
     */
    public void setVaultDataSize(Long VaultDataSize) {
        this.VaultDataSize = VaultDataSize;
    }

    public BackupVault() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupVault(BackupVault source) {
        if (source.VaultId != null) {
            this.VaultId = new String(source.VaultId);
        }
        if (source.VaultName != null) {
            this.VaultName = new String(source.VaultName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.EncryptType != null) {
            this.EncryptType = new String(source.EncryptType);
        }
        if (source.KmsKeyId != null) {
            this.KmsKeyId = new String(source.KmsKeyId);
        }
        if (source.VaultType != null) {
            this.VaultType = new String(source.VaultType);
        }
        if (source.BackupPolicySet != null) {
            this.BackupPolicySet = new TypeCount[source.BackupPolicySet.length];
            for (int i = 0; i < source.BackupPolicySet.length; i++) {
                this.BackupPolicySet[i] = new TypeCount(source.BackupPolicySet[i]);
            }
        }
        if (source.BackupSet != null) {
            this.BackupSet = new TypeCount[source.BackupSet.length];
            for (int i = 0; i < source.BackupSet.length; i++) {
                this.BackupSet[i] = new TypeCount(source.BackupSet[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.SourceDataSize != null) {
            this.SourceDataSize = new Long(source.SourceDataSize);
        }
        if (source.VaultDataSize != null) {
            this.VaultDataSize = new Long(source.VaultDataSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VaultId", this.VaultId);
        this.setParamSimple(map, prefix + "VaultName", this.VaultName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EncryptType", this.EncryptType);
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);
        this.setParamSimple(map, prefix + "VaultType", this.VaultType);
        this.setParamArrayObj(map, prefix + "BackupPolicySet.", this.BackupPolicySet);
        this.setParamArrayObj(map, prefix + "BackupSet.", this.BackupSet);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SourceDataSize", this.SourceDataSize);
        this.setParamSimple(map, prefix + "VaultDataSize", this.VaultDataSize);

    }
}

