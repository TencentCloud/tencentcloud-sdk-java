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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupScheduleInfo extends AbstractModel {

    /**
    * 迁移类型：
1-远端集群迁移；2-COS迁移
    */
    @SerializedName("BackupType")
    @Expose
    private Long BackupType;

    /**
    * 当前任务现存实例数
    */
    @SerializedName("ExistCount")
    @Expose
    private Long ExistCount;

    /**
    * cos信息
    */
    @SerializedName("CosSourceInfo")
    @Expose
    private String CosSourceInfo;

    /**
    * doris信息
    */
    @SerializedName("DorisSourceInfo")
    @Expose
    private String DorisSourceInfo;

    /**
    * 恢复类型
    */
    @SerializedName("RestoreType")
    @Expose
    private Long RestoreType;

    /**
    * 快照保留策略
    */
    @SerializedName("SnapshotRemainPolicy")
    @Expose
    private SnapshotRemainPolicy SnapshotRemainPolicy;

    /**
    * 远程备份地域
    */
    @SerializedName("DataRemoteRegion")
    @Expose
    private String DataRemoteRegion;

    /**
    * 是否在宽限期内
    */
    @SerializedName("IsWithinGracePeriod")
    @Expose
    private Boolean IsWithinGracePeriod;

    /**
    * 宽限期（天数）
    */
    @SerializedName("GracePeriod")
    @Expose
    private Long GracePeriod;

    /**
    * 宽限开始时间
    */
    @SerializedName("GraceStartTime")
    @Expose
    private String GraceStartTime;

    /**
    * 托管桶类型：standard-标准，多可用区-MAZ
    */
    @SerializedName("BucketType")
    @Expose
    private String BucketType;

    /**
    * 是否开启安全锁：0-未开启，1-已开启
    */
    @SerializedName("EnableSecurityLock")
    @Expose
    private Long EnableSecurityLock;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例状态
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * 实例状态描述
    */
    @SerializedName("InstanceStatusDesc")
    @Expose
    private String InstanceStatusDesc;

    /**
    * 桶加密状态信息
    */
    @SerializedName("BucketEncryption")
    @Expose
    private BucketEncryptionInfo BucketEncryption;

    /**
     * Get 迁移类型：
1-远端集群迁移；2-COS迁移 
     * @return BackupType 迁移类型：
1-远端集群迁移；2-COS迁移
     */
    public Long getBackupType() {
        return this.BackupType;
    }

    /**
     * Set 迁移类型：
1-远端集群迁移；2-COS迁移
     * @param BackupType 迁移类型：
1-远端集群迁移；2-COS迁移
     */
    public void setBackupType(Long BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get 当前任务现存实例数 
     * @return ExistCount 当前任务现存实例数
     */
    public Long getExistCount() {
        return this.ExistCount;
    }

    /**
     * Set 当前任务现存实例数
     * @param ExistCount 当前任务现存实例数
     */
    public void setExistCount(Long ExistCount) {
        this.ExistCount = ExistCount;
    }

    /**
     * Get cos信息 
     * @return CosSourceInfo cos信息
     */
    public String getCosSourceInfo() {
        return this.CosSourceInfo;
    }

    /**
     * Set cos信息
     * @param CosSourceInfo cos信息
     */
    public void setCosSourceInfo(String CosSourceInfo) {
        this.CosSourceInfo = CosSourceInfo;
    }

    /**
     * Get doris信息 
     * @return DorisSourceInfo doris信息
     */
    public String getDorisSourceInfo() {
        return this.DorisSourceInfo;
    }

    /**
     * Set doris信息
     * @param DorisSourceInfo doris信息
     */
    public void setDorisSourceInfo(String DorisSourceInfo) {
        this.DorisSourceInfo = DorisSourceInfo;
    }

    /**
     * Get 恢复类型 
     * @return RestoreType 恢复类型
     */
    public Long getRestoreType() {
        return this.RestoreType;
    }

    /**
     * Set 恢复类型
     * @param RestoreType 恢复类型
     */
    public void setRestoreType(Long RestoreType) {
        this.RestoreType = RestoreType;
    }

    /**
     * Get 快照保留策略 
     * @return SnapshotRemainPolicy 快照保留策略
     */
    public SnapshotRemainPolicy getSnapshotRemainPolicy() {
        return this.SnapshotRemainPolicy;
    }

    /**
     * Set 快照保留策略
     * @param SnapshotRemainPolicy 快照保留策略
     */
    public void setSnapshotRemainPolicy(SnapshotRemainPolicy SnapshotRemainPolicy) {
        this.SnapshotRemainPolicy = SnapshotRemainPolicy;
    }

    /**
     * Get 远程备份地域 
     * @return DataRemoteRegion 远程备份地域
     */
    public String getDataRemoteRegion() {
        return this.DataRemoteRegion;
    }

    /**
     * Set 远程备份地域
     * @param DataRemoteRegion 远程备份地域
     */
    public void setDataRemoteRegion(String DataRemoteRegion) {
        this.DataRemoteRegion = DataRemoteRegion;
    }

    /**
     * Get 是否在宽限期内 
     * @return IsWithinGracePeriod 是否在宽限期内
     */
    public Boolean getIsWithinGracePeriod() {
        return this.IsWithinGracePeriod;
    }

    /**
     * Set 是否在宽限期内
     * @param IsWithinGracePeriod 是否在宽限期内
     */
    public void setIsWithinGracePeriod(Boolean IsWithinGracePeriod) {
        this.IsWithinGracePeriod = IsWithinGracePeriod;
    }

    /**
     * Get 宽限期（天数） 
     * @return GracePeriod 宽限期（天数）
     */
    public Long getGracePeriod() {
        return this.GracePeriod;
    }

    /**
     * Set 宽限期（天数）
     * @param GracePeriod 宽限期（天数）
     */
    public void setGracePeriod(Long GracePeriod) {
        this.GracePeriod = GracePeriod;
    }

    /**
     * Get 宽限开始时间 
     * @return GraceStartTime 宽限开始时间
     */
    public String getGraceStartTime() {
        return this.GraceStartTime;
    }

    /**
     * Set 宽限开始时间
     * @param GraceStartTime 宽限开始时间
     */
    public void setGraceStartTime(String GraceStartTime) {
        this.GraceStartTime = GraceStartTime;
    }

    /**
     * Get 托管桶类型：standard-标准，多可用区-MAZ 
     * @return BucketType 托管桶类型：standard-标准，多可用区-MAZ
     */
    public String getBucketType() {
        return this.BucketType;
    }

    /**
     * Set 托管桶类型：standard-标准，多可用区-MAZ
     * @param BucketType 托管桶类型：standard-标准，多可用区-MAZ
     */
    public void setBucketType(String BucketType) {
        this.BucketType = BucketType;
    }

    /**
     * Get 是否开启安全锁：0-未开启，1-已开启 
     * @return EnableSecurityLock 是否开启安全锁：0-未开启，1-已开启
     */
    public Long getEnableSecurityLock() {
        return this.EnableSecurityLock;
    }

    /**
     * Set 是否开启安全锁：0-未开启，1-已开启
     * @param EnableSecurityLock 是否开启安全锁：0-未开启，1-已开启
     */
    public void setEnableSecurityLock(Long EnableSecurityLock) {
        this.EnableSecurityLock = EnableSecurityLock;
    }

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名 
     * @return InstanceName 实例名
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名
     * @param InstanceName 实例名
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例状态 
     * @return InstanceStatus 实例状态
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 实例状态
     * @param InstanceStatus 实例状态
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get 实例状态描述 
     * @return InstanceStatusDesc 实例状态描述
     */
    public String getInstanceStatusDesc() {
        return this.InstanceStatusDesc;
    }

    /**
     * Set 实例状态描述
     * @param InstanceStatusDesc 实例状态描述
     */
    public void setInstanceStatusDesc(String InstanceStatusDesc) {
        this.InstanceStatusDesc = InstanceStatusDesc;
    }

    /**
     * Get 桶加密状态信息 
     * @return BucketEncryption 桶加密状态信息
     */
    public BucketEncryptionInfo getBucketEncryption() {
        return this.BucketEncryption;
    }

    /**
     * Set 桶加密状态信息
     * @param BucketEncryption 桶加密状态信息
     */
    public void setBucketEncryption(BucketEncryptionInfo BucketEncryption) {
        this.BucketEncryption = BucketEncryption;
    }

    public BackupScheduleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupScheduleInfo(BackupScheduleInfo source) {
        if (source.BackupType != null) {
            this.BackupType = new Long(source.BackupType);
        }
        if (source.ExistCount != null) {
            this.ExistCount = new Long(source.ExistCount);
        }
        if (source.CosSourceInfo != null) {
            this.CosSourceInfo = new String(source.CosSourceInfo);
        }
        if (source.DorisSourceInfo != null) {
            this.DorisSourceInfo = new String(source.DorisSourceInfo);
        }
        if (source.RestoreType != null) {
            this.RestoreType = new Long(source.RestoreType);
        }
        if (source.SnapshotRemainPolicy != null) {
            this.SnapshotRemainPolicy = new SnapshotRemainPolicy(source.SnapshotRemainPolicy);
        }
        if (source.DataRemoteRegion != null) {
            this.DataRemoteRegion = new String(source.DataRemoteRegion);
        }
        if (source.IsWithinGracePeriod != null) {
            this.IsWithinGracePeriod = new Boolean(source.IsWithinGracePeriod);
        }
        if (source.GracePeriod != null) {
            this.GracePeriod = new Long(source.GracePeriod);
        }
        if (source.GraceStartTime != null) {
            this.GraceStartTime = new String(source.GraceStartTime);
        }
        if (source.BucketType != null) {
            this.BucketType = new String(source.BucketType);
        }
        if (source.EnableSecurityLock != null) {
            this.EnableSecurityLock = new Long(source.EnableSecurityLock);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.InstanceStatusDesc != null) {
            this.InstanceStatusDesc = new String(source.InstanceStatusDesc);
        }
        if (source.BucketEncryption != null) {
            this.BucketEncryption = new BucketEncryptionInfo(source.BucketEncryption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "ExistCount", this.ExistCount);
        this.setParamSimple(map, prefix + "CosSourceInfo", this.CosSourceInfo);
        this.setParamSimple(map, prefix + "DorisSourceInfo", this.DorisSourceInfo);
        this.setParamSimple(map, prefix + "RestoreType", this.RestoreType);
        this.setParamObj(map, prefix + "SnapshotRemainPolicy.", this.SnapshotRemainPolicy);
        this.setParamSimple(map, prefix + "DataRemoteRegion", this.DataRemoteRegion);
        this.setParamSimple(map, prefix + "IsWithinGracePeriod", this.IsWithinGracePeriod);
        this.setParamSimple(map, prefix + "GracePeriod", this.GracePeriod);
        this.setParamSimple(map, prefix + "GraceStartTime", this.GraceStartTime);
        this.setParamSimple(map, prefix + "BucketType", this.BucketType);
        this.setParamSimple(map, prefix + "EnableSecurityLock", this.EnableSecurityLock);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "InstanceStatusDesc", this.InstanceStatusDesc);
        this.setParamObj(map, prefix + "BucketEncryption.", this.BucketEncryption);

    }
}

