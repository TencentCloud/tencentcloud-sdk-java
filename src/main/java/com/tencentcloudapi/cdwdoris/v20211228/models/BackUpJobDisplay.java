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

public class BackUpJobDisplay extends AbstractModel {

    /**
    * <p>备份实例id</p>
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * <p>备份实例名</p>
    */
    @SerializedName("Snapshot")
    @Expose
    private String Snapshot;

    /**
    * <p>备份数据量</p>
    */
    @SerializedName("BackUpSize")
    @Expose
    private Long BackUpSize;

    /**
    * <p>备份单副本数据量</p>
    */
    @SerializedName("BackUpSingleSize")
    @Expose
    private Long BackUpSingleSize;

    /**
    * <p>实例创建时间</p>
    */
    @SerializedName("BackUpTime")
    @Expose
    private String BackUpTime;

    /**
    * <p>实例过期时间</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>实例状态</p>
    */
    @SerializedName("JobStatus")
    @Expose
    private String JobStatus;

    /**
    * <p>0为默认。1时是对远端的doris进行备份，不周期，一次性</p>
    */
    @SerializedName("BackupType")
    @Expose
    private Long BackupType;

    /**
    * <p>0为默认。1时是立即备份。2时是迁移</p>
    */
    @SerializedName("BackupTimeType")
    @Expose
    private Long BackupTimeType;

    /**
    * <p>远端doris的连接信息</p>
    */
    @SerializedName("DorisSourceInfo")
    @Expose
    private DorisSourceInfo DorisSourceInfo;

    /**
    * <p>实例状态对应的数值</p>
    */
    @SerializedName("JobStatusNum")
    @Expose
    private Long JobStatusNum;

    /**
    * <p>备份实例中关于cos的信息</p>
    */
    @SerializedName("BackupCosInfo")
    @Expose
    private BackupCosInfo BackupCosInfo;

    /**
    * <p>是否使用的自定义桶</p>
    */
    @SerializedName("IsUserDefineBucket")
    @Expose
    private Boolean IsUserDefineBucket;

    /**
    * <p>错误原因</p>
    */
    @SerializedName("ErrorReason")
    @Expose
    private String ErrorReason;

    /**
    * <p>快照保留策略</p>
    */
    @SerializedName("SnapshotRemainPolicy")
    @Expose
    private SnapshotRemainPolicy SnapshotRemainPolicy;

    /**
    * <p>隔离次数</p>
    */
    @SerializedName("IsolationCount")
    @Expose
    private Long IsolationCount;

    /**
    * <p>是否开启安全锁</p>
    */
    @SerializedName("EnableSecurityLock")
    @Expose
    private Long EnableSecurityLock;

    /**
    * <p>宽限期天数</p>
    */
    @SerializedName("GracePeriod")
    @Expose
    private Long GracePeriod;

    /**
    * <p>宽限期开始时间</p>
    */
    @SerializedName("GraceStartTime")
    @Expose
    private String GraceStartTime;

    /**
    * <p>是否在宽限期内</p>
    */
    @SerializedName("IsWithinGracePeriod")
    @Expose
    private Boolean IsWithinGracePeriod;

    /**
    * <p>是否使用托管桶</p>
    */
    @SerializedName("UseManagedBucket")
    @Expose
    private Boolean UseManagedBucket;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称</p>
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
    * <p>备份远程桶地域</p>
    */
    @SerializedName("DataRemoteRegion")
    @Expose
    private String DataRemoteRegion;

    /**
    * <p>桶加密状态信息</p>
    */
    @SerializedName("BucketEncryption")
    @Expose
    private BucketEncryptionInfo BucketEncryption;

    /**
    * <p>备份任务创建时记录的加密类型：SSE-COS/SSE-KMS/disabled</p>
    */
    @SerializedName("Encryption")
    @Expose
    private String Encryption;

    /**
    * <p>是否开通加密存储：0-未开通，1-已开通</p>
    */
    @SerializedName("EncryptionEnabled")
    @Expose
    private Boolean EncryptionEnabled;

    /**
    * <p>任务调度id</p>
    */
    @SerializedName("ScheduleId")
    @Expose
    private Long ScheduleId;

    /**
    * <p>总任务数（库数）</p>
    */
    @SerializedName("TotalTasks")
    @Expose
    private Long TotalTasks;

    /**
    * <p>已完成任务数</p>
    */
    @SerializedName("CompletedTasks")
    @Expose
    private Long CompletedTasks;

    /**
    * <p>失败任务数</p>
    */
    @SerializedName("FailedTasks")
    @Expose
    private Long FailedTasks;

    /**
    * <p>备份进度描述，如 3/5</p>
    */
    @SerializedName("BackupProgress")
    @Expose
    private String BackupProgress;

    /**
     * Get <p>备份实例id</p> 
     * @return JobId <p>备份实例id</p>
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>备份实例id</p>
     * @param JobId <p>备份实例id</p>
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>备份实例名</p> 
     * @return Snapshot <p>备份实例名</p>
     */
    public String getSnapshot() {
        return this.Snapshot;
    }

    /**
     * Set <p>备份实例名</p>
     * @param Snapshot <p>备份实例名</p>
     */
    public void setSnapshot(String Snapshot) {
        this.Snapshot = Snapshot;
    }

    /**
     * Get <p>备份数据量</p> 
     * @return BackUpSize <p>备份数据量</p>
     */
    public Long getBackUpSize() {
        return this.BackUpSize;
    }

    /**
     * Set <p>备份数据量</p>
     * @param BackUpSize <p>备份数据量</p>
     */
    public void setBackUpSize(Long BackUpSize) {
        this.BackUpSize = BackUpSize;
    }

    /**
     * Get <p>备份单副本数据量</p> 
     * @return BackUpSingleSize <p>备份单副本数据量</p>
     */
    public Long getBackUpSingleSize() {
        return this.BackUpSingleSize;
    }

    /**
     * Set <p>备份单副本数据量</p>
     * @param BackUpSingleSize <p>备份单副本数据量</p>
     */
    public void setBackUpSingleSize(Long BackUpSingleSize) {
        this.BackUpSingleSize = BackUpSingleSize;
    }

    /**
     * Get <p>实例创建时间</p> 
     * @return BackUpTime <p>实例创建时间</p>
     */
    public String getBackUpTime() {
        return this.BackUpTime;
    }

    /**
     * Set <p>实例创建时间</p>
     * @param BackUpTime <p>实例创建时间</p>
     */
    public void setBackUpTime(String BackUpTime) {
        this.BackUpTime = BackUpTime;
    }

    /**
     * Get <p>实例过期时间</p> 
     * @return ExpireTime <p>实例过期时间</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>实例过期时间</p>
     * @param ExpireTime <p>实例过期时间</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>实例状态</p> 
     * @return JobStatus <p>实例状态</p>
     */
    public String getJobStatus() {
        return this.JobStatus;
    }

    /**
     * Set <p>实例状态</p>
     * @param JobStatus <p>实例状态</p>
     */
    public void setJobStatus(String JobStatus) {
        this.JobStatus = JobStatus;
    }

    /**
     * Get <p>0为默认。1时是对远端的doris进行备份，不周期，一次性</p> 
     * @return BackupType <p>0为默认。1时是对远端的doris进行备份，不周期，一次性</p>
     */
    public Long getBackupType() {
        return this.BackupType;
    }

    /**
     * Set <p>0为默认。1时是对远端的doris进行备份，不周期，一次性</p>
     * @param BackupType <p>0为默认。1时是对远端的doris进行备份，不周期，一次性</p>
     */
    public void setBackupType(Long BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get <p>0为默认。1时是立即备份。2时是迁移</p> 
     * @return BackupTimeType <p>0为默认。1时是立即备份。2时是迁移</p>
     */
    public Long getBackupTimeType() {
        return this.BackupTimeType;
    }

    /**
     * Set <p>0为默认。1时是立即备份。2时是迁移</p>
     * @param BackupTimeType <p>0为默认。1时是立即备份。2时是迁移</p>
     */
    public void setBackupTimeType(Long BackupTimeType) {
        this.BackupTimeType = BackupTimeType;
    }

    /**
     * Get <p>远端doris的连接信息</p> 
     * @return DorisSourceInfo <p>远端doris的连接信息</p>
     */
    public DorisSourceInfo getDorisSourceInfo() {
        return this.DorisSourceInfo;
    }

    /**
     * Set <p>远端doris的连接信息</p>
     * @param DorisSourceInfo <p>远端doris的连接信息</p>
     */
    public void setDorisSourceInfo(DorisSourceInfo DorisSourceInfo) {
        this.DorisSourceInfo = DorisSourceInfo;
    }

    /**
     * Get <p>实例状态对应的数值</p> 
     * @return JobStatusNum <p>实例状态对应的数值</p>
     */
    public Long getJobStatusNum() {
        return this.JobStatusNum;
    }

    /**
     * Set <p>实例状态对应的数值</p>
     * @param JobStatusNum <p>实例状态对应的数值</p>
     */
    public void setJobStatusNum(Long JobStatusNum) {
        this.JobStatusNum = JobStatusNum;
    }

    /**
     * Get <p>备份实例中关于cos的信息</p> 
     * @return BackupCosInfo <p>备份实例中关于cos的信息</p>
     */
    public BackupCosInfo getBackupCosInfo() {
        return this.BackupCosInfo;
    }

    /**
     * Set <p>备份实例中关于cos的信息</p>
     * @param BackupCosInfo <p>备份实例中关于cos的信息</p>
     */
    public void setBackupCosInfo(BackupCosInfo BackupCosInfo) {
        this.BackupCosInfo = BackupCosInfo;
    }

    /**
     * Get <p>是否使用的自定义桶</p> 
     * @return IsUserDefineBucket <p>是否使用的自定义桶</p>
     */
    public Boolean getIsUserDefineBucket() {
        return this.IsUserDefineBucket;
    }

    /**
     * Set <p>是否使用的自定义桶</p>
     * @param IsUserDefineBucket <p>是否使用的自定义桶</p>
     */
    public void setIsUserDefineBucket(Boolean IsUserDefineBucket) {
        this.IsUserDefineBucket = IsUserDefineBucket;
    }

    /**
     * Get <p>错误原因</p> 
     * @return ErrorReason <p>错误原因</p>
     */
    public String getErrorReason() {
        return this.ErrorReason;
    }

    /**
     * Set <p>错误原因</p>
     * @param ErrorReason <p>错误原因</p>
     */
    public void setErrorReason(String ErrorReason) {
        this.ErrorReason = ErrorReason;
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
     * Get <p>隔离次数</p> 
     * @return IsolationCount <p>隔离次数</p>
     */
    public Long getIsolationCount() {
        return this.IsolationCount;
    }

    /**
     * Set <p>隔离次数</p>
     * @param IsolationCount <p>隔离次数</p>
     */
    public void setIsolationCount(Long IsolationCount) {
        this.IsolationCount = IsolationCount;
    }

    /**
     * Get <p>是否开启安全锁</p> 
     * @return EnableSecurityLock <p>是否开启安全锁</p>
     */
    public Long getEnableSecurityLock() {
        return this.EnableSecurityLock;
    }

    /**
     * Set <p>是否开启安全锁</p>
     * @param EnableSecurityLock <p>是否开启安全锁</p>
     */
    public void setEnableSecurityLock(Long EnableSecurityLock) {
        this.EnableSecurityLock = EnableSecurityLock;
    }

    /**
     * Get <p>宽限期天数</p> 
     * @return GracePeriod <p>宽限期天数</p>
     */
    public Long getGracePeriod() {
        return this.GracePeriod;
    }

    /**
     * Set <p>宽限期天数</p>
     * @param GracePeriod <p>宽限期天数</p>
     */
    public void setGracePeriod(Long GracePeriod) {
        this.GracePeriod = GracePeriod;
    }

    /**
     * Get <p>宽限期开始时间</p> 
     * @return GraceStartTime <p>宽限期开始时间</p>
     */
    public String getGraceStartTime() {
        return this.GraceStartTime;
    }

    /**
     * Set <p>宽限期开始时间</p>
     * @param GraceStartTime <p>宽限期开始时间</p>
     */
    public void setGraceStartTime(String GraceStartTime) {
        this.GraceStartTime = GraceStartTime;
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
     * Get <p>是否使用托管桶</p> 
     * @return UseManagedBucket <p>是否使用托管桶</p>
     */
    public Boolean getUseManagedBucket() {
        return this.UseManagedBucket;
    }

    /**
     * Set <p>是否使用托管桶</p>
     * @param UseManagedBucket <p>是否使用托管桶</p>
     */
    public void setUseManagedBucket(Boolean UseManagedBucket) {
        this.UseManagedBucket = UseManagedBucket;
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
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
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
     * Get <p>备份远程桶地域</p> 
     * @return DataRemoteRegion <p>备份远程桶地域</p>
     */
    public String getDataRemoteRegion() {
        return this.DataRemoteRegion;
    }

    /**
     * Set <p>备份远程桶地域</p>
     * @param DataRemoteRegion <p>备份远程桶地域</p>
     */
    public void setDataRemoteRegion(String DataRemoteRegion) {
        this.DataRemoteRegion = DataRemoteRegion;
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

    /**
     * Get <p>备份任务创建时记录的加密类型：SSE-COS/SSE-KMS/disabled</p> 
     * @return Encryption <p>备份任务创建时记录的加密类型：SSE-COS/SSE-KMS/disabled</p>
     */
    public String getEncryption() {
        return this.Encryption;
    }

    /**
     * Set <p>备份任务创建时记录的加密类型：SSE-COS/SSE-KMS/disabled</p>
     * @param Encryption <p>备份任务创建时记录的加密类型：SSE-COS/SSE-KMS/disabled</p>
     */
    public void setEncryption(String Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get <p>是否开通加密存储：0-未开通，1-已开通</p> 
     * @return EncryptionEnabled <p>是否开通加密存储：0-未开通，1-已开通</p>
     */
    public Boolean getEncryptionEnabled() {
        return this.EncryptionEnabled;
    }

    /**
     * Set <p>是否开通加密存储：0-未开通，1-已开通</p>
     * @param EncryptionEnabled <p>是否开通加密存储：0-未开通，1-已开通</p>
     */
    public void setEncryptionEnabled(Boolean EncryptionEnabled) {
        this.EncryptionEnabled = EncryptionEnabled;
    }

    /**
     * Get <p>任务调度id</p> 
     * @return ScheduleId <p>任务调度id</p>
     */
    public Long getScheduleId() {
        return this.ScheduleId;
    }

    /**
     * Set <p>任务调度id</p>
     * @param ScheduleId <p>任务调度id</p>
     */
    public void setScheduleId(Long ScheduleId) {
        this.ScheduleId = ScheduleId;
    }

    /**
     * Get <p>总任务数（库数）</p> 
     * @return TotalTasks <p>总任务数（库数）</p>
     */
    public Long getTotalTasks() {
        return this.TotalTasks;
    }

    /**
     * Set <p>总任务数（库数）</p>
     * @param TotalTasks <p>总任务数（库数）</p>
     */
    public void setTotalTasks(Long TotalTasks) {
        this.TotalTasks = TotalTasks;
    }

    /**
     * Get <p>已完成任务数</p> 
     * @return CompletedTasks <p>已完成任务数</p>
     */
    public Long getCompletedTasks() {
        return this.CompletedTasks;
    }

    /**
     * Set <p>已完成任务数</p>
     * @param CompletedTasks <p>已完成任务数</p>
     */
    public void setCompletedTasks(Long CompletedTasks) {
        this.CompletedTasks = CompletedTasks;
    }

    /**
     * Get <p>失败任务数</p> 
     * @return FailedTasks <p>失败任务数</p>
     */
    public Long getFailedTasks() {
        return this.FailedTasks;
    }

    /**
     * Set <p>失败任务数</p>
     * @param FailedTasks <p>失败任务数</p>
     */
    public void setFailedTasks(Long FailedTasks) {
        this.FailedTasks = FailedTasks;
    }

    /**
     * Get <p>备份进度描述，如 3/5</p> 
     * @return BackupProgress <p>备份进度描述，如 3/5</p>
     */
    public String getBackupProgress() {
        return this.BackupProgress;
    }

    /**
     * Set <p>备份进度描述，如 3/5</p>
     * @param BackupProgress <p>备份进度描述，如 3/5</p>
     */
    public void setBackupProgress(String BackupProgress) {
        this.BackupProgress = BackupProgress;
    }

    public BackUpJobDisplay() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackUpJobDisplay(BackUpJobDisplay source) {
        if (source.JobId != null) {
            this.JobId = new Long(source.JobId);
        }
        if (source.Snapshot != null) {
            this.Snapshot = new String(source.Snapshot);
        }
        if (source.BackUpSize != null) {
            this.BackUpSize = new Long(source.BackUpSize);
        }
        if (source.BackUpSingleSize != null) {
            this.BackUpSingleSize = new Long(source.BackUpSingleSize);
        }
        if (source.BackUpTime != null) {
            this.BackUpTime = new String(source.BackUpTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.JobStatus != null) {
            this.JobStatus = new String(source.JobStatus);
        }
        if (source.BackupType != null) {
            this.BackupType = new Long(source.BackupType);
        }
        if (source.BackupTimeType != null) {
            this.BackupTimeType = new Long(source.BackupTimeType);
        }
        if (source.DorisSourceInfo != null) {
            this.DorisSourceInfo = new DorisSourceInfo(source.DorisSourceInfo);
        }
        if (source.JobStatusNum != null) {
            this.JobStatusNum = new Long(source.JobStatusNum);
        }
        if (source.BackupCosInfo != null) {
            this.BackupCosInfo = new BackupCosInfo(source.BackupCosInfo);
        }
        if (source.IsUserDefineBucket != null) {
            this.IsUserDefineBucket = new Boolean(source.IsUserDefineBucket);
        }
        if (source.ErrorReason != null) {
            this.ErrorReason = new String(source.ErrorReason);
        }
        if (source.SnapshotRemainPolicy != null) {
            this.SnapshotRemainPolicy = new SnapshotRemainPolicy(source.SnapshotRemainPolicy);
        }
        if (source.IsolationCount != null) {
            this.IsolationCount = new Long(source.IsolationCount);
        }
        if (source.EnableSecurityLock != null) {
            this.EnableSecurityLock = new Long(source.EnableSecurityLock);
        }
        if (source.GracePeriod != null) {
            this.GracePeriod = new Long(source.GracePeriod);
        }
        if (source.GraceStartTime != null) {
            this.GraceStartTime = new String(source.GraceStartTime);
        }
        if (source.IsWithinGracePeriod != null) {
            this.IsWithinGracePeriod = new Boolean(source.IsWithinGracePeriod);
        }
        if (source.UseManagedBucket != null) {
            this.UseManagedBucket = new Boolean(source.UseManagedBucket);
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
        if (source.DataRemoteRegion != null) {
            this.DataRemoteRegion = new String(source.DataRemoteRegion);
        }
        if (source.BucketEncryption != null) {
            this.BucketEncryption = new BucketEncryptionInfo(source.BucketEncryption);
        }
        if (source.Encryption != null) {
            this.Encryption = new String(source.Encryption);
        }
        if (source.EncryptionEnabled != null) {
            this.EncryptionEnabled = new Boolean(source.EncryptionEnabled);
        }
        if (source.ScheduleId != null) {
            this.ScheduleId = new Long(source.ScheduleId);
        }
        if (source.TotalTasks != null) {
            this.TotalTasks = new Long(source.TotalTasks);
        }
        if (source.CompletedTasks != null) {
            this.CompletedTasks = new Long(source.CompletedTasks);
        }
        if (source.FailedTasks != null) {
            this.FailedTasks = new Long(source.FailedTasks);
        }
        if (source.BackupProgress != null) {
            this.BackupProgress = new String(source.BackupProgress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "Snapshot", this.Snapshot);
        this.setParamSimple(map, prefix + "BackUpSize", this.BackUpSize);
        this.setParamSimple(map, prefix + "BackUpSingleSize", this.BackUpSingleSize);
        this.setParamSimple(map, prefix + "BackUpTime", this.BackUpTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "JobStatus", this.JobStatus);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "BackupTimeType", this.BackupTimeType);
        this.setParamObj(map, prefix + "DorisSourceInfo.", this.DorisSourceInfo);
        this.setParamSimple(map, prefix + "JobStatusNum", this.JobStatusNum);
        this.setParamObj(map, prefix + "BackupCosInfo.", this.BackupCosInfo);
        this.setParamSimple(map, prefix + "IsUserDefineBucket", this.IsUserDefineBucket);
        this.setParamSimple(map, prefix + "ErrorReason", this.ErrorReason);
        this.setParamObj(map, prefix + "SnapshotRemainPolicy.", this.SnapshotRemainPolicy);
        this.setParamSimple(map, prefix + "IsolationCount", this.IsolationCount);
        this.setParamSimple(map, prefix + "EnableSecurityLock", this.EnableSecurityLock);
        this.setParamSimple(map, prefix + "GracePeriod", this.GracePeriod);
        this.setParamSimple(map, prefix + "GraceStartTime", this.GraceStartTime);
        this.setParamSimple(map, prefix + "IsWithinGracePeriod", this.IsWithinGracePeriod);
        this.setParamSimple(map, prefix + "UseManagedBucket", this.UseManagedBucket);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "InstanceStatusDesc", this.InstanceStatusDesc);
        this.setParamSimple(map, prefix + "DataRemoteRegion", this.DataRemoteRegion);
        this.setParamObj(map, prefix + "BucketEncryption.", this.BucketEncryption);
        this.setParamSimple(map, prefix + "Encryption", this.Encryption);
        this.setParamSimple(map, prefix + "EncryptionEnabled", this.EncryptionEnabled);
        this.setParamSimple(map, prefix + "ScheduleId", this.ScheduleId);
        this.setParamSimple(map, prefix + "TotalTasks", this.TotalTasks);
        this.setParamSimple(map, prefix + "CompletedTasks", this.CompletedTasks);
        this.setParamSimple(map, prefix + "FailedTasks", this.FailedTasks);
        this.setParamSimple(map, prefix + "BackupProgress", this.BackupProgress);

    }
}

