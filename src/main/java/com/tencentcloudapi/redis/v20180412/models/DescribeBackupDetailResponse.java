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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupDetailResponse extends AbstractModel {

    /**
    * <p>备份 ID。</p>
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
    * <p>备份开始时间。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>备份结束时间。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>备份方式。 </p><ul><li>1：手动备份。</li><li>0：自动备份。</li></ul>
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * <p>备份状态。 </p><ul><li>1：备份被其它流程锁定。</li><li>2：备份正常，没有被任何流程锁定。</li><li>-1：备份已过期。</li><li>3：备份正在被导出。</li><li>4：备份导出成功。</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>备份的备注信息。</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>备份是否被锁定。</p><ul><li>0：未被锁定。</li><li>1：已被锁定。</li></ul>
    */
    @SerializedName("Locked")
    @Expose
    private Long Locked;

    /**
    * <p>备份文件大小。单位：Byte。</p>
    */
    @SerializedName("BackupSize")
    @Expose
    private Long BackupSize;

    /**
    * <p>实例类型。</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * <p>单分片内存规格大小，单位：MB。</p>
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * <p>分片数量。</p>
    */
    @SerializedName("ShardNum")
    @Expose
    private Long ShardNum;

    /**
    * <p>副本数量。</p>
    */
    @SerializedName("ReplicasNum")
    @Expose
    private Long ReplicasNum;

    /**
    * <p>是否已加密。</p><p>枚举值：</p><ul><li>true： 已加密</li><li>false： 未加密</li></ul>
    */
    @SerializedName("Encrypted")
    @Expose
    private Boolean Encrypted;

    /**
    * <p>解密密钥。</p>
    */
    @SerializedName("DecryptKey")
    @Expose
    private String DecryptKey;

    /**
    * <p>KMS的密钥ID。</p>
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
    * <p>加密该备份文件的加密算法。</p><p>枚举值：</p><ul><li>AES-256-CBC： 当前仅支持AES-256-CBC</li></ul>
    */
    @SerializedName("KeyAlgorithm")
    @Expose
    private String KeyAlgorithm;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>备份 ID。</p> 
     * @return BackupId <p>备份 ID。</p>
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * Set <p>备份 ID。</p>
     * @param BackupId <p>备份 ID。</p>
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get <p>备份开始时间。</p> 
     * @return StartTime <p>备份开始时间。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>备份开始时间。</p>
     * @param StartTime <p>备份开始时间。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>备份结束时间。</p> 
     * @return EndTime <p>备份结束时间。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>备份结束时间。</p>
     * @param EndTime <p>备份结束时间。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>备份方式。 </p><ul><li>1：手动备份。</li><li>0：自动备份。</li></ul> 
     * @return BackupType <p>备份方式。 </p><ul><li>1：手动备份。</li><li>0：自动备份。</li></ul>
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set <p>备份方式。 </p><ul><li>1：手动备份。</li><li>0：自动备份。</li></ul>
     * @param BackupType <p>备份方式。 </p><ul><li>1：手动备份。</li><li>0：自动备份。</li></ul>
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get <p>备份状态。 </p><ul><li>1：备份被其它流程锁定。</li><li>2：备份正常，没有被任何流程锁定。</li><li>-1：备份已过期。</li><li>3：备份正在被导出。</li><li>4：备份导出成功。</li></ul> 
     * @return Status <p>备份状态。 </p><ul><li>1：备份被其它流程锁定。</li><li>2：备份正常，没有被任何流程锁定。</li><li>-1：备份已过期。</li><li>3：备份正在被导出。</li><li>4：备份导出成功。</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>备份状态。 </p><ul><li>1：备份被其它流程锁定。</li><li>2：备份正常，没有被任何流程锁定。</li><li>-1：备份已过期。</li><li>3：备份正在被导出。</li><li>4：备份导出成功。</li></ul>
     * @param Status <p>备份状态。 </p><ul><li>1：备份被其它流程锁定。</li><li>2：备份正常，没有被任何流程锁定。</li><li>-1：备份已过期。</li><li>3：备份正在被导出。</li><li>4：备份导出成功。</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>备份的备注信息。</p> 
     * @return Remark <p>备份的备注信息。</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备份的备注信息。</p>
     * @param Remark <p>备份的备注信息。</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>备份是否被锁定。</p><ul><li>0：未被锁定。</li><li>1：已被锁定。</li></ul> 
     * @return Locked <p>备份是否被锁定。</p><ul><li>0：未被锁定。</li><li>1：已被锁定。</li></ul>
     */
    public Long getLocked() {
        return this.Locked;
    }

    /**
     * Set <p>备份是否被锁定。</p><ul><li>0：未被锁定。</li><li>1：已被锁定。</li></ul>
     * @param Locked <p>备份是否被锁定。</p><ul><li>0：未被锁定。</li><li>1：已被锁定。</li></ul>
     */
    public void setLocked(Long Locked) {
        this.Locked = Locked;
    }

    /**
     * Get <p>备份文件大小。单位：Byte。</p> 
     * @return BackupSize <p>备份文件大小。单位：Byte。</p>
     */
    public Long getBackupSize() {
        return this.BackupSize;
    }

    /**
     * Set <p>备份文件大小。单位：Byte。</p>
     * @param BackupSize <p>备份文件大小。单位：Byte。</p>
     */
    public void setBackupSize(Long BackupSize) {
        this.BackupSize = BackupSize;
    }

    /**
     * Get <p>实例类型。</p> 
     * @return InstanceType <p>实例类型。</p>
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例类型。</p>
     * @param InstanceType <p>实例类型。</p>
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>单分片内存规格大小，单位：MB。</p> 
     * @return MemSize <p>单分片内存规格大小，单位：MB。</p>
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set <p>单分片内存规格大小，单位：MB。</p>
     * @param MemSize <p>单分片内存规格大小，单位：MB。</p>
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get <p>分片数量。</p> 
     * @return ShardNum <p>分片数量。</p>
     */
    public Long getShardNum() {
        return this.ShardNum;
    }

    /**
     * Set <p>分片数量。</p>
     * @param ShardNum <p>分片数量。</p>
     */
    public void setShardNum(Long ShardNum) {
        this.ShardNum = ShardNum;
    }

    /**
     * Get <p>副本数量。</p> 
     * @return ReplicasNum <p>副本数量。</p>
     */
    public Long getReplicasNum() {
        return this.ReplicasNum;
    }

    /**
     * Set <p>副本数量。</p>
     * @param ReplicasNum <p>副本数量。</p>
     */
    public void setReplicasNum(Long ReplicasNum) {
        this.ReplicasNum = ReplicasNum;
    }

    /**
     * Get <p>是否已加密。</p><p>枚举值：</p><ul><li>true： 已加密</li><li>false： 未加密</li></ul> 
     * @return Encrypted <p>是否已加密。</p><p>枚举值：</p><ul><li>true： 已加密</li><li>false： 未加密</li></ul>
     */
    public Boolean getEncrypted() {
        return this.Encrypted;
    }

    /**
     * Set <p>是否已加密。</p><p>枚举值：</p><ul><li>true： 已加密</li><li>false： 未加密</li></ul>
     * @param Encrypted <p>是否已加密。</p><p>枚举值：</p><ul><li>true： 已加密</li><li>false： 未加密</li></ul>
     */
    public void setEncrypted(Boolean Encrypted) {
        this.Encrypted = Encrypted;
    }

    /**
     * Get <p>解密密钥。</p> 
     * @return DecryptKey <p>解密密钥。</p>
     */
    public String getDecryptKey() {
        return this.DecryptKey;
    }

    /**
     * Set <p>解密密钥。</p>
     * @param DecryptKey <p>解密密钥。</p>
     */
    public void setDecryptKey(String DecryptKey) {
        this.DecryptKey = DecryptKey;
    }

    /**
     * Get <p>KMS的密钥ID。</p> 
     * @return KmsKeyId <p>KMS的密钥ID。</p>
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set <p>KMS的密钥ID。</p>
     * @param KmsKeyId <p>KMS的密钥ID。</p>
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    /**
     * Get <p>加密该备份文件的加密算法。</p><p>枚举值：</p><ul><li>AES-256-CBC： 当前仅支持AES-256-CBC</li></ul> 
     * @return KeyAlgorithm <p>加密该备份文件的加密算法。</p><p>枚举值：</p><ul><li>AES-256-CBC： 当前仅支持AES-256-CBC</li></ul>
     */
    public String getKeyAlgorithm() {
        return this.KeyAlgorithm;
    }

    /**
     * Set <p>加密该备份文件的加密算法。</p><p>枚举值：</p><ul><li>AES-256-CBC： 当前仅支持AES-256-CBC</li></ul>
     * @param KeyAlgorithm <p>加密该备份文件的加密算法。</p><p>枚举值：</p><ul><li>AES-256-CBC： 当前仅支持AES-256-CBC</li></ul>
     */
    public void setKeyAlgorithm(String KeyAlgorithm) {
        this.KeyAlgorithm = KeyAlgorithm;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeBackupDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupDetailResponse(DescribeBackupDetailResponse source) {
        if (source.BackupId != null) {
            this.BackupId = new String(source.BackupId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Locked != null) {
            this.Locked = new Long(source.Locked);
        }
        if (source.BackupSize != null) {
            this.BackupSize = new Long(source.BackupSize);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.ShardNum != null) {
            this.ShardNum = new Long(source.ShardNum);
        }
        if (source.ReplicasNum != null) {
            this.ReplicasNum = new Long(source.ReplicasNum);
        }
        if (source.Encrypted != null) {
            this.Encrypted = new Boolean(source.Encrypted);
        }
        if (source.DecryptKey != null) {
            this.DecryptKey = new String(source.DecryptKey);
        }
        if (source.KmsKeyId != null) {
            this.KmsKeyId = new String(source.KmsKeyId);
        }
        if (source.KeyAlgorithm != null) {
            this.KeyAlgorithm = new String(source.KeyAlgorithm);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Locked", this.Locked);
        this.setParamSimple(map, prefix + "BackupSize", this.BackupSize);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "ShardNum", this.ShardNum);
        this.setParamSimple(map, prefix + "ReplicasNum", this.ReplicasNum);
        this.setParamSimple(map, prefix + "Encrypted", this.Encrypted);
        this.setParamSimple(map, prefix + "DecryptKey", this.DecryptKey);
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);
        this.setParamSimple(map, prefix + "KeyAlgorithm", this.KeyAlgorithm);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

