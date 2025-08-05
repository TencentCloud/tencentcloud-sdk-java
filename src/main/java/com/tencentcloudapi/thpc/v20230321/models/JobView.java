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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JobView extends AbstractModel {

    /**
    * 作业ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 作业名称
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * 作业描述
    */
    @SerializedName("JobDescription")
    @Expose
    private String JobDescription;

    /**
    * 作业优先级
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 作业状态，包括CREATED, QUEING, STARTNG, RUNING, TERMINATING, TERMINATED, SUCCESS, 
FAILED

    */
    @SerializedName("JobState")
    @Expose
    private String JobState;

    /**
    * 作业所属集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 作业所属队列名称
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * 完成作业任务所需资源
    */
    @SerializedName("OccupyResources")
    @Expose
    private String OccupyResources;

    /**
    * 作业任务创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 作业任务结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 作业ID 
     * @return JobId 作业ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 作业ID
     * @param JobId 作业ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 作业名称 
     * @return JobName 作业名称
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set 作业名称
     * @param JobName 作业名称
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get 作业描述 
     * @return JobDescription 作业描述
     */
    public String getJobDescription() {
        return this.JobDescription;
    }

    /**
     * Set 作业描述
     * @param JobDescription 作业描述
     */
    public void setJobDescription(String JobDescription) {
        this.JobDescription = JobDescription;
    }

    /**
     * Get 作业优先级 
     * @return Priority 作业优先级
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 作业优先级
     * @param Priority 作业优先级
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 作业状态，包括CREATED, QUEING, STARTNG, RUNING, TERMINATING, TERMINATED, SUCCESS, 
FAILED
 
     * @return JobState 作业状态，包括CREATED, QUEING, STARTNG, RUNING, TERMINATING, TERMINATED, SUCCESS, 
FAILED

     */
    public String getJobState() {
        return this.JobState;
    }

    /**
     * Set 作业状态，包括CREATED, QUEING, STARTNG, RUNING, TERMINATING, TERMINATED, SUCCESS, 
FAILED

     * @param JobState 作业状态，包括CREATED, QUEING, STARTNG, RUNING, TERMINATING, TERMINATED, SUCCESS, 
FAILED

     */
    public void setJobState(String JobState) {
        this.JobState = JobState;
    }

    /**
     * Get 作业所属集群ID 
     * @return ClusterId 作业所属集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 作业所属集群ID
     * @param ClusterId 作业所属集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 作业所属队列名称 
     * @return QueueName 作业所属队列名称
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 作业所属队列名称
     * @param QueueName 作业所属队列名称
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get 完成作业任务所需资源 
     * @return OccupyResources 完成作业任务所需资源
     */
    public String getOccupyResources() {
        return this.OccupyResources;
    }

    /**
     * Set 完成作业任务所需资源
     * @param OccupyResources 完成作业任务所需资源
     */
    public void setOccupyResources(String OccupyResources) {
        this.OccupyResources = OccupyResources;
    }

    /**
     * Get 作业任务创建时间 
     * @return CreateTime 作业任务创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 作业任务创建时间
     * @param CreateTime 作业任务创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 作业任务结束时间 
     * @return EndTime 作业任务结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 作业任务结束时间
     * @param EndTime 作业任务结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public JobView() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JobView(JobView source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.JobDescription != null) {
            this.JobDescription = new String(source.JobDescription);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.JobState != null) {
            this.JobState = new String(source.JobState);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.OccupyResources != null) {
            this.OccupyResources = new String(source.OccupyResources);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "JobDescription", this.JobDescription);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "JobState", this.JobState);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "OccupyResources", this.OccupyResources);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

