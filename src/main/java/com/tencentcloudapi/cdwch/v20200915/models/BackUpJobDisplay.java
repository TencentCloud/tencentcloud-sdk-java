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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackUpJobDisplay extends AbstractModel{

    /**
    * 备份任务id
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * 备份任务名
    */
    @SerializedName("Snapshot")
    @Expose
    private String Snapshot;

    /**
    * 任务类型(元数据),(数据)
    */
    @SerializedName("BackUpType")
    @Expose
    private String BackUpType;

    /**
    * 备份数据量
    */
    @SerializedName("BackUpSize")
    @Expose
    private Long BackUpSize;

    /**
    * 任务创建时间
    */
    @SerializedName("BackUpTime")
    @Expose
    private String BackUpTime;

    /**
    * 任务过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 任务状态
    */
    @SerializedName("JobStatus")
    @Expose
    private String JobStatus;

    /**
     * Get 备份任务id 
     * @return JobId 备份任务id
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set 备份任务id
     * @param JobId 备份任务id
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 备份任务名 
     * @return Snapshot 备份任务名
     */
    public String getSnapshot() {
        return this.Snapshot;
    }

    /**
     * Set 备份任务名
     * @param Snapshot 备份任务名
     */
    public void setSnapshot(String Snapshot) {
        this.Snapshot = Snapshot;
    }

    /**
     * Get 任务类型(元数据),(数据) 
     * @return BackUpType 任务类型(元数据),(数据)
     */
    public String getBackUpType() {
        return this.BackUpType;
    }

    /**
     * Set 任务类型(元数据),(数据)
     * @param BackUpType 任务类型(元数据),(数据)
     */
    public void setBackUpType(String BackUpType) {
        this.BackUpType = BackUpType;
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
     * Get 任务创建时间 
     * @return BackUpTime 任务创建时间
     */
    public String getBackUpTime() {
        return this.BackUpTime;
    }

    /**
     * Set 任务创建时间
     * @param BackUpTime 任务创建时间
     */
    public void setBackUpTime(String BackUpTime) {
        this.BackUpTime = BackUpTime;
    }

    /**
     * Get 任务过期时间 
     * @return ExpireTime 任务过期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 任务过期时间
     * @param ExpireTime 任务过期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 任务状态 
     * @return JobStatus 任务状态
     */
    public String getJobStatus() {
        return this.JobStatus;
    }

    /**
     * Set 任务状态
     * @param JobStatus 任务状态
     */
    public void setJobStatus(String JobStatus) {
        this.JobStatus = JobStatus;
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
        if (source.BackUpType != null) {
            this.BackUpType = new String(source.BackUpType);
        }
        if (source.BackUpSize != null) {
            this.BackUpSize = new Long(source.BackUpSize);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "Snapshot", this.Snapshot);
        this.setParamSimple(map, prefix + "BackUpType", this.BackUpType);
        this.setParamSimple(map, prefix + "BackUpSize", this.BackUpSize);
        this.setParamSimple(map, prefix + "BackUpTime", this.BackUpTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "JobStatus", this.JobStatus);

    }
}

