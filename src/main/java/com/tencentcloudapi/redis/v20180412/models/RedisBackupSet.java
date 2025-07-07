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
    * 备份开始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 备份任务ID。
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
    * 备份类型。
- 1：凌晨系统发起的自动备份。
- 0：用户发起的手动备份。
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * 备份状态。 
- 1：备份被其它流程锁定。
- 2：备份正常，没有被任何流程锁定。
- -1：备份已过期。
- 3：备份正在被导出。
- 4：备份导出成功。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 备份的备注信息。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 备份是否被锁定。
- 0：未被锁定。
- 1：已被锁定。
    */
    @SerializedName("Locked")
    @Expose
    private Long Locked;

    /**
    * 内部字段，用户可忽略。
    */
    @SerializedName("BackupSize")
    @Expose
    private Long BackupSize;

    /**
    * 内部字段，用户可忽略。
    */
    @SerializedName("FullBackup")
    @Expose
    private Long FullBackup;

    /**
    * 内部字段，用户可忽略。
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * 实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 本地备份所在地域。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 备份结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 备份文件类型。
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 备份文件过期时间。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get 备份开始时间。 
     * @return StartTime 备份开始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 备份开始时间。
     * @param StartTime 备份开始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 备份任务ID。 
     * @return BackupId 备份任务ID。
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * Set 备份任务ID。
     * @param BackupId 备份任务ID。
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get 备份类型。
- 1：凌晨系统发起的自动备份。
- 0：用户发起的手动备份。 
     * @return BackupType 备份类型。
- 1：凌晨系统发起的自动备份。
- 0：用户发起的手动备份。
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set 备份类型。
- 1：凌晨系统发起的自动备份。
- 0：用户发起的手动备份。
     * @param BackupType 备份类型。
- 1：凌晨系统发起的自动备份。
- 0：用户发起的手动备份。
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get 备份状态。 
- 1：备份被其它流程锁定。
- 2：备份正常，没有被任何流程锁定。
- -1：备份已过期。
- 3：备份正在被导出。
- 4：备份导出成功。 
     * @return Status 备份状态。 
- 1：备份被其它流程锁定。
- 2：备份正常，没有被任何流程锁定。
- -1：备份已过期。
- 3：备份正在被导出。
- 4：备份导出成功。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 备份状态。 
- 1：备份被其它流程锁定。
- 2：备份正常，没有被任何流程锁定。
- -1：备份已过期。
- 3：备份正在被导出。
- 4：备份导出成功。
     * @param Status 备份状态。 
- 1：备份被其它流程锁定。
- 2：备份正常，没有被任何流程锁定。
- -1：备份已过期。
- 3：备份正在被导出。
- 4：备份导出成功。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 备份的备注信息。 
     * @return Remark 备份的备注信息。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备份的备注信息。
     * @param Remark 备份的备注信息。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 备份是否被锁定。
- 0：未被锁定。
- 1：已被锁定。 
     * @return Locked 备份是否被锁定。
- 0：未被锁定。
- 1：已被锁定。
     */
    public Long getLocked() {
        return this.Locked;
    }

    /**
     * Set 备份是否被锁定。
- 0：未被锁定。
- 1：已被锁定。
     * @param Locked 备份是否被锁定。
- 0：未被锁定。
- 1：已被锁定。
     */
    public void setLocked(Long Locked) {
        this.Locked = Locked;
    }

    /**
     * Get 内部字段，用户可忽略。 
     * @return BackupSize 内部字段，用户可忽略。
     */
    public Long getBackupSize() {
        return this.BackupSize;
    }

    /**
     * Set 内部字段，用户可忽略。
     * @param BackupSize 内部字段，用户可忽略。
     */
    public void setBackupSize(Long BackupSize) {
        this.BackupSize = BackupSize;
    }

    /**
     * Get 内部字段，用户可忽略。 
     * @return FullBackup 内部字段，用户可忽略。
     */
    public Long getFullBackup() {
        return this.FullBackup;
    }

    /**
     * Set 内部字段，用户可忽略。
     * @param FullBackup 内部字段，用户可忽略。
     */
    public void setFullBackup(Long FullBackup) {
        this.FullBackup = FullBackup;
    }

    /**
     * Get 内部字段，用户可忽略。 
     * @return InstanceType 内部字段，用户可忽略。
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 内部字段，用户可忽略。
     * @param InstanceType 内部字段，用户可忽略。
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例 ID。 
     * @return InstanceId 实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。
     * @param InstanceId 实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称。 
     * @return InstanceName 实例名称。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称。
     * @param InstanceName 实例名称。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 本地备份所在地域。 
     * @return Region 本地备份所在地域。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 本地备份所在地域。
     * @param Region 本地备份所在地域。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 备份结束时间。 
     * @return EndTime 备份结束时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 备份结束时间。
     * @param EndTime 备份结束时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 备份文件类型。 
     * @return FileType 备份文件类型。
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 备份文件类型。
     * @param FileType 备份文件类型。
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 备份文件过期时间。 
     * @return ExpireTime 备份文件过期时间。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 备份文件过期时间。
     * @param ExpireTime 备份文件过期时间。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
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

    }
}

