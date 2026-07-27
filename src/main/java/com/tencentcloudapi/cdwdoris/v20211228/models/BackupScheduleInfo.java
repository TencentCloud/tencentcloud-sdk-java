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
    * <p>迁移类型：<br>1-远端集群迁移；2-COS迁移</p>
    */
    @SerializedName("BackupType")
    @Expose
    private Long BackupType;

    /**
    * <p>当前任务现存实例数</p>
    */
    @SerializedName("ExistCount")
    @Expose
    private Long ExistCount;

    /**
    * <p>cos信息</p>
    */
    @SerializedName("CosSourceInfo")
    @Expose
    private String CosSourceInfo;

    /**
    * <p>doris信息</p>
    */
    @SerializedName("DorisSourceInfo")
    @Expose
    private String DorisSourceInfo;

    /**
    * <p>恢复类型</p>
    */
    @SerializedName("RestoreType")
    @Expose
    private Long RestoreType;

    /**
    * <p>快照保留策略</p>
    */
    @SerializedName("SnapshotRemainPolicy")
    @Expose
    private SnapshotRemainPolicy SnapshotRemainPolicy;

    /**
    * <p>远程备份地域</p>
    */
    @SerializedName("DataRemoteRegion")
    @Expose
    private String DataRemoteRegion;

    /**
    * <p>是否在宽限期内</p>
    */
    @SerializedName("IsWithinGracePeriod")
    @Expose
    private Boolean IsWithinGracePeriod;

    /**
    * <p>宽限期（天数）</p>
    */
    @SerializedName("GracePeriod")
    @Expose
    private Long GracePeriod;

    /**
    * <p>宽限开始时间</p>
    */
    @SerializedName("GraceStartTime")
    @Expose
    private String GraceStartTime;

    /**
    * <p>托管桶类型：standard-标准，多可用区-MAZ</p>
    */
    @SerializedName("BucketType")
    @Expose
    private String BucketType;

    /**
    * <p>是否开启安全锁：0-未开启，1-已开启</p>
    */
    @SerializedName("EnableSecurityLock")
    @Expose
    private Long EnableSecurityLock;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>实例状态</p>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * <p>实例状态描述</p>
    */
    @SerializedName("InstanceStatusDesc")
    @Expose
    private String InstanceStatusDesc;

    /**
    * <p>桶加密状态信息</p>
    */
    @SerializedName("BucketEncryption")
    @Expose
    private BucketEncryptionInfo BucketEncryption;

    /**
     * Get <p>迁移类型：<br>1-远端集群迁移；2-COS迁移</p> 
     * @return BackupType <p>迁移类型：<br>1-远端集群迁移；2-COS迁移</p>
     */
    public Long getBackupType() {
        return this.BackupType;
    }

    /**
     * Set <p>迁移类型：<br>1-远端集群迁移；2-COS迁移</p>
     * @param BackupType <p>迁移类型：<br>1-远端集群迁移；2-COS迁移</p>
     */
    public void setBackupType(Long BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get <p>当前任务现存实例数</p> 
     * @return ExistCount <p>当前任务现存实例数</p>
     */
    public Long getExistCount() {
        return this.ExistCount;
    }

    /**
     * Set <p>当前任务现存实例数</p>
     * @param ExistCount <p>当前任务现存实例数</p>
     */
    public void setExistCount(Long ExistCount) {
        this.ExistCount = ExistCount;
    }

    /**
     * Get <p>cos信息</p> 
     * @return CosSourceInfo <p>cos信息</p>
     */
    public String getCosSourceInfo() {
        return this.CosSourceInfo;
    }

    /**
     * Set <p>cos信息</p>
     * @param CosSourceInfo <p>cos信息</p>
     */
    public void setCosSourceInfo(String CosSourceInfo) {
        this.CosSourceInfo = CosSourceInfo;
    }

    /**
     * Get <p>doris信息</p> 
     * @return DorisSourceInfo <p>doris信息</p>
     */
    public String getDorisSourceInfo() {
        return this.DorisSourceInfo;
    }

    /**
     * Set <p>doris信息</p>
     * @param DorisSourceInfo <p>doris信息</p>
     */
    public void setDorisSourceInfo(String DorisSourceInfo) {
        this.DorisSourceInfo = DorisSourceInfo;
    }

    /**
     * Get <p>恢复类型</p> 
     * @return RestoreType <p>恢复类型</p>
     */
    public Long getRestoreType() {
        return this.RestoreType;
    }

    /**
     * Set <p>恢复类型</p>
     * @param RestoreType <p>恢复类型</p>
     */
    public void setRestoreType(Long RestoreType) {
        this.RestoreType = RestoreType;
    }

    /**
     * Get <p>快照保留策略</p> 
     * @return SnapshotRemainPolicy <p>快照保留策略</p>
     */
    public SnapshotRemainPolicy getSnapshotRemainPolicy() {
        return this.SnapshotRemainPolicy;
    }

    /**
     * Set <p>快照保留策略</p>
     * @param SnapshotRemainPolicy <p>快照保留策略</p>
     */
    public void setSnapshotRemainPolicy(SnapshotRemainPolicy SnapshotRemainPolicy) {
        this.SnapshotRemainPolicy = SnapshotRemainPolicy;
    }

    /**
     * Get <p>远程备份地域</p> 
     * @return DataRemoteRegion <p>远程备份地域</p>
     */
    public String getDataRemoteRegion() {
        return this.DataRemoteRegion;
    }

    /**
     * Set <p>远程备份地域</p>
     * @param DataRemoteRegion <p>远程备份地域</p>
     */
    public void setDataRemoteRegion(String DataRemoteRegion) {
        this.DataRemoteRegion = DataRemoteRegion;
    }

    /**
     * Get <p>是否在宽限期内</p> 
     * @return IsWithinGracePeriod <p>是否在宽限期内</p>
     */
    public Boolean getIsWithinGracePeriod() {
        return this.IsWithinGracePeriod;
    }

    /**
     * Set <p>是否在宽限期内</p>
     * @param IsWithinGracePeriod <p>是否在宽限期内</p>
     */
    public void setIsWithinGracePeriod(Boolean IsWithinGracePeriod) {
        this.IsWithinGracePeriod = IsWithinGracePeriod;
    }

    /**
     * Get <p>宽限期（天数）</p> 
     * @return GracePeriod <p>宽限期（天数）</p>
     */
    public Long getGracePeriod() {
        return this.GracePeriod;
    }

    /**
     * Set <p>宽限期（天数）</p>
     * @param GracePeriod <p>宽限期（天数）</p>
     */
    public void setGracePeriod(Long GracePeriod) {
        this.GracePeriod = GracePeriod;
    }

    /**
     * Get <p>宽限开始时间</p> 
     * @return GraceStartTime <p>宽限开始时间</p>
     */
    public String getGraceStartTime() {
        return this.GraceStartTime;
    }

    /**
     * Set <p>宽限开始时间</p>
     * @param GraceStartTime <p>宽限开始时间</p>
     */
    public void setGraceStartTime(String GraceStartTime) {
        this.GraceStartTime = GraceStartTime;
    }

    /**
     * Get <p>托管桶类型：standard-标准，多可用区-MAZ</p> 
     * @return BucketType <p>托管桶类型：standard-标准，多可用区-MAZ</p>
     */
    public String getBucketType() {
        return this.BucketType;
    }

    /**
     * Set <p>托管桶类型：standard-标准，多可用区-MAZ</p>
     * @param BucketType <p>托管桶类型：standard-标准，多可用区-MAZ</p>
     */
    public void setBucketType(String BucketType) {
        this.BucketType = BucketType;
    }

    /**
     * Get <p>是否开启安全锁：0-未开启，1-已开启</p> 
     * @return EnableSecurityLock <p>是否开启安全锁：0-未开启，1-已开启</p>
     */
    public Long getEnableSecurityLock() {
        return this.EnableSecurityLock;
    }

    /**
     * Set <p>是否开启安全锁：0-未开启，1-已开启</p>
     * @param EnableSecurityLock <p>是否开启安全锁：0-未开启，1-已开启</p>
     */
    public void setEnableSecurityLock(Long EnableSecurityLock) {
        this.EnableSecurityLock = EnableSecurityLock;
    }

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例名</p> 
     * @return InstanceName <p>实例名</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名</p>
     * @param InstanceName <p>实例名</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>实例状态</p> 
     * @return InstanceStatus <p>实例状态</p>
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>实例状态</p>
     * @param InstanceStatus <p>实例状态</p>
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get <p>实例状态描述</p> 
     * @return InstanceStatusDesc <p>实例状态描述</p>
     */
    public String getInstanceStatusDesc() {
        return this.InstanceStatusDesc;
    }

    /**
     * Set <p>实例状态描述</p>
     * @param InstanceStatusDesc <p>实例状态描述</p>
     */
    public void setInstanceStatusDesc(String InstanceStatusDesc) {
        this.InstanceStatusDesc = InstanceStatusDesc;
    }

    /**
     * Get <p>桶加密状态信息</p> 
     * @return BucketEncryption <p>桶加密状态信息</p>
     */
    public BucketEncryptionInfo getBucketEncryption() {
        return this.BucketEncryption;
    }

    /**
     * Set <p>桶加密状态信息</p>
     * @param BucketEncryption <p>桶加密状态信息</p>
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

