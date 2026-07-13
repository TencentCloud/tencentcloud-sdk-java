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

public class RedisBackupSet extends AbstractModel {

    /**
    * <p>备份开始时间。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>备份任务ID。</p>
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
    * <p>备份类型。</p><ul><li>1：凌晨系统发起的自动备份。</li><li>0：用户发起的手动备份。</li></ul>
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
    * <p>内部字段，用户可忽略。</p>
    */
    @SerializedName("BackupSize")
    @Expose
    private Long BackupSize;

    /**
    * <p>内部字段，用户可忽略。</p>
    */
    @SerializedName("FullBackup")
    @Expose
    private Long FullBackup;

    /**
    * <p>内部字段，用户可忽略。</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * <p>实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称。</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>本地备份所在地域。</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>备份结束时间。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>备份文件类型。</p>
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>备份文件过期时间。</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>备份文件是否加密</p>
    */
    @SerializedName("Encrypted")
    @Expose
    private Boolean Encrypted;

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
     * Get <p>备份任务ID。</p> 
     * @return BackupId <p>备份任务ID。</p>
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * Set <p>备份任务ID。</p>
     * @param BackupId <p>备份任务ID。</p>
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get <p>备份类型。</p><ul><li>1：凌晨系统发起的自动备份。</li><li>0：用户发起的手动备份。</li></ul> 
     * @return BackupType <p>备份类型。</p><ul><li>1：凌晨系统发起的自动备份。</li><li>0：用户发起的手动备份。</li></ul>
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set <p>备份类型。</p><ul><li>1：凌晨系统发起的自动备份。</li><li>0：用户发起的手动备份。</li></ul>
     * @param BackupType <p>备份类型。</p><ul><li>1：凌晨系统发起的自动备份。</li><li>0：用户发起的手动备份。</li></ul>
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
     * Get <p>内部字段，用户可忽略。</p> 
     * @return BackupSize <p>内部字段，用户可忽略。</p>
     */
    public Long getBackupSize() {
        return this.BackupSize;
    }

    /**
     * Set <p>内部字段，用户可忽略。</p>
     * @param BackupSize <p>内部字段，用户可忽略。</p>
     */
    public void setBackupSize(Long BackupSize) {
        this.BackupSize = BackupSize;
    }

    /**
     * Get <p>内部字段，用户可忽略。</p> 
     * @return FullBackup <p>内部字段，用户可忽略。</p>
     */
    public Long getFullBackup() {
        return this.FullBackup;
    }

    /**
     * Set <p>内部字段，用户可忽略。</p>
     * @param FullBackup <p>内部字段，用户可忽略。</p>
     */
    public void setFullBackup(Long FullBackup) {
        this.FullBackup = FullBackup;
    }

    /**
     * Get <p>内部字段，用户可忽略。</p> 
     * @return InstanceType <p>内部字段，用户可忽略。</p>
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>内部字段，用户可忽略。</p>
     * @param InstanceType <p>内部字段，用户可忽略。</p>
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>实例 ID。</p> 
     * @return InstanceId <p>实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID。</p>
     * @param InstanceId <p>实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例名称。</p> 
     * @return InstanceName <p>实例名称。</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称。</p>
     * @param InstanceName <p>实例名称。</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>本地备份所在地域。</p> 
     * @return Region <p>本地备份所在地域。</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>本地备份所在地域。</p>
     * @param Region <p>本地备份所在地域。</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
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
     * Get <p>备份文件类型。</p> 
     * @return FileType <p>备份文件类型。</p>
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>备份文件类型。</p>
     * @param FileType <p>备份文件类型。</p>
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>备份文件过期时间。</p> 
     * @return ExpireTime <p>备份文件过期时间。</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>备份文件过期时间。</p>
     * @param ExpireTime <p>备份文件过期时间。</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>备份文件是否加密</p> 
     * @return Encrypted <p>备份文件是否加密</p>
     */
    public Boolean getEncrypted() {
        return this.Encrypted;
    }

    /**
     * Set <p>备份文件是否加密</p>
     * @param Encrypted <p>备份文件是否加密</p>
     */
    public void setEncrypted(Boolean Encrypted) {
        this.Encrypted = Encrypted;
    }

    public RedisBackupSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RedisBackupSet(RedisBackupSet source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.BackupId != null) {
            this.BackupId = new String(source.BackupId);
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
        if (source.FullBackup != null) {
            this.FullBackup = new Long(source.FullBackup);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Encrypted != null) {
            this.Encrypted = new Boolean(source.Encrypted);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Locked", this.Locked);
        this.setParamSimple(map, prefix + "BackupSize", this.BackupSize);
        this.setParamSimple(map, prefix + "FullBackup", this.FullBackup);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Encrypted", this.Encrypted);

    }
}

