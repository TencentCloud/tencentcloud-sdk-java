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
    * 备份实例id
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * 备份实例名
    */
    @SerializedName("Snapshot")
    @Expose
    private String Snapshot;

    /**
    * 备份数据量
    */
    @SerializedName("BackUpSize")
    @Expose
    private Long BackUpSize;

    /**
    * 备份单副本数据量
    */
    @SerializedName("BackUpSingleSize")
    @Expose
    private Long BackUpSingleSize;

    /**
    * 实例创建时间
    */
    @SerializedName("BackUpTime")
    @Expose
    private String BackUpTime;

    /**
    * 实例过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 实例状态
    */
    @SerializedName("JobStatus")
    @Expose
    private String JobStatus;

    /**
    * 0为默认。1时是对远端的doris进行备份，不周期，一次性
    */
    @SerializedName("BackupType")
    @Expose
    private Long BackupType;

    /**
    * 0为默认。1时是立即备份。2时是迁移
    */
    @SerializedName("BackupTimeType")
    @Expose
    private Long BackupTimeType;

    /**
    * 远端doris的连接信息
    */
    @SerializedName("DorisSourceInfo")
    @Expose
    private DorisSourceInfo DorisSourceInfo;

    /**
    * 实例状态对应的数值
    */
    @SerializedName("JobStatusNum")
    @Expose
    private Long JobStatusNum;

    /**
    * 备份实例中关于cos的信息	
    */
    @SerializedName("BackupCosInfo")
    @Expose
    private BackupCosInfo BackupCosInfo;

    /**
    * 是否使用的自定义桶
    */
    @SerializedName("IsUserDefineBucket")
    @Expose
    private Boolean IsUserDefineBucket;

    /**
    * 错误原因
    */
    @SerializedName("ErrorReason")
    @Expose
    private String ErrorReason;

    /**
    * 快照保留策略
    */
    @SerializedName("SnapshotRemainPolicy")
    @Expose
    private SnapshotRemainPolicy SnapshotRemainPolicy;

    /**
     * Get 备份实例id 
     * @return JobId 备份实例id
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set 备份实例id
     * @param JobId 备份实例id
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 备份实例名 
     * @return Snapshot 备份实例名
     */
    public String getSnapshot() {
        return this.Snapshot;
    }

    /**
     * Set 备份实例名
     * @param Snapshot 备份实例名
     */
    public void setSnapshot(String Snapshot) {
        this.Snapshot = Snapshot;
    }

    /**
     * Get 备份数据量 
     * @return BackUpSize 备份数据量
     */
    public Long getBackUpSize() {
        return this.BackUpSize;
    }

    /**
     * Set 备份数据量
     * @param BackUpSize 备份数据量
     */
    public void setBackUpSize(Long BackUpSize) {
        this.BackUpSize = BackUpSize;
    }

    /**
     * Get 备份单副本数据量 
     * @return BackUpSingleSize 备份单副本数据量
     */
    public Long getBackUpSingleSize() {
        return this.BackUpSingleSize;
    }

    /**
     * Set 备份单副本数据量
     * @param BackUpSingleSize 备份单副本数据量
     */
    public void setBackUpSingleSize(Long BackUpSingleSize) {
        this.BackUpSingleSize = BackUpSingleSize;
    }

    /**
     * Get 实例创建时间 
     * @return BackUpTime 实例创建时间
     */
    public String getBackUpTime() {
        return this.BackUpTime;
    }

    /**
     * Set 实例创建时间
     * @param BackUpTime 实例创建时间
     */
    public void setBackUpTime(String BackUpTime) {
        this.BackUpTime = BackUpTime;
    }

    /**
     * Get 实例过期时间 
     * @return ExpireTime 实例过期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 实例过期时间
     * @param ExpireTime 实例过期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 实例状态 
     * @return JobStatus 实例状态
     */
    public String getJobStatus() {
        return this.JobStatus;
    }

    /**
     * Set 实例状态
     * @param JobStatus 实例状态
     */
    public void setJobStatus(String JobStatus) {
        this.JobStatus = JobStatus;
    }

    /**
     * Get 0为默认。1时是对远端的doris进行备份，不周期，一次性 
     * @return BackupType 0为默认。1时是对远端的doris进行备份，不周期，一次性
     */
    public Long getBackupType() {
        return this.BackupType;
    }

    /**
     * Set 0为默认。1时是对远端的doris进行备份，不周期，一次性
     * @param BackupType 0为默认。1时是对远端的doris进行备份，不周期，一次性
     */
    public void setBackupType(Long BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get 0为默认。1时是立即备份。2时是迁移 
     * @return BackupTimeType 0为默认。1时是立即备份。2时是迁移
     */
    public Long getBackupTimeType() {
        return this.BackupTimeType;
    }

    /**
     * Set 0为默认。1时是立即备份。2时是迁移
     * @param BackupTimeType 0为默认。1时是立即备份。2时是迁移
     */
    public void setBackupTimeType(Long BackupTimeType) {
        this.BackupTimeType = BackupTimeType;
    }

    /**
     * Get 远端doris的连接信息 
     * @return DorisSourceInfo 远端doris的连接信息
     */
    public DorisSourceInfo getDorisSourceInfo() {
        return this.DorisSourceInfo;
    }

    /**
     * Set 远端doris的连接信息
     * @param DorisSourceInfo 远端doris的连接信息
     */
    public void setDorisSourceInfo(DorisSourceInfo DorisSourceInfo) {
        this.DorisSourceInfo = DorisSourceInfo;
    }

    /**
     * Get 实例状态对应的数值 
     * @return JobStatusNum 实例状态对应的数值
     */
    public Long getJobStatusNum() {
        return this.JobStatusNum;
    }

    /**
     * Set 实例状态对应的数值
     * @param JobStatusNum 实例状态对应的数值
     */
    public void setJobStatusNum(Long JobStatusNum) {
        this.JobStatusNum = JobStatusNum;
    }

    /**
     * Get 备份实例中关于cos的信息	 
     * @return BackupCosInfo 备份实例中关于cos的信息	
     */
    public BackupCosInfo getBackupCosInfo() {
        return this.BackupCosInfo;
    }

    /**
     * Set 备份实例中关于cos的信息	
     * @param BackupCosInfo 备份实例中关于cos的信息	
     */
    public void setBackupCosInfo(BackupCosInfo BackupCosInfo) {
        this.BackupCosInfo = BackupCosInfo;
    }

    /**
     * Get 是否使用的自定义桶 
     * @return IsUserDefineBucket 是否使用的自定义桶
     */
    public Boolean getIsUserDefineBucket() {
        return this.IsUserDefineBucket;
    }

    /**
     * Set 是否使用的自定义桶
     * @param IsUserDefineBucket 是否使用的自定义桶
     */
    public void setIsUserDefineBucket(Boolean IsUserDefineBucket) {
        this.IsUserDefineBucket = IsUserDefineBucket;
    }

    /**
     * Get 错误原因 
     * @return ErrorReason 错误原因
     */
    public String getErrorReason() {
        return this.ErrorReason;
    }

    /**
     * Set 错误原因
     * @param ErrorReason 错误原因
     */
    public void setErrorReason(String ErrorReason) {
        this.ErrorReason = ErrorReason;
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

    }
}

