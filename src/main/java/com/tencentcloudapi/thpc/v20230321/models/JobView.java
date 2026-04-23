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
    * <p>作业ID</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>作业名称</p>
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * <p>作业描述</p>
    */
    @SerializedName("JobDescription")
    @Expose
    private String JobDescription;

    /**
    * <p>作业创建者</p>
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * <p>作业优先级</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * <p>作业状态，包括CREATED, QUEING, STARTNG, RUNING, TERMINATING, TERMINATED, SUCCESS,<br>FAILED</p>
    */
    @SerializedName("JobState")
    @Expose
    private String JobState;

    /**
    * <p>作业所属集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>作业所属队列名称</p>
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * <p>完成作业任务所需资源</p>
    */
    @SerializedName("OccupyResources")
    @Expose
    private String OccupyResources;

    /**
    * <p>作业任务创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>作业任务结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get <p>作业ID</p> 
     * @return JobId <p>作业ID</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>作业ID</p>
     * @param JobId <p>作业ID</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>作业名称</p> 
     * @return JobName <p>作业名称</p>
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set <p>作业名称</p>
     * @param JobName <p>作业名称</p>
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get <p>作业描述</p> 
     * @return JobDescription <p>作业描述</p>
     */
    public String getJobDescription() {
        return this.JobDescription;
    }

    /**
     * Set <p>作业描述</p>
     * @param JobDescription <p>作业描述</p>
     */
    public void setJobDescription(String JobDescription) {
        this.JobDescription = JobDescription;
    }

    /**
     * Get <p>作业创建者</p> 
     * @return Creator <p>作业创建者</p>
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>作业创建者</p>
     * @param Creator <p>作业创建者</p>
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get <p>作业优先级</p> 
     * @return Priority <p>作业优先级</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>作业优先级</p>
     * @param Priority <p>作业优先级</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get <p>作业状态，包括CREATED, QUEING, STARTNG, RUNING, TERMINATING, TERMINATED, SUCCESS,<br>FAILED</p> 
     * @return JobState <p>作业状态，包括CREATED, QUEING, STARTNG, RUNING, TERMINATING, TERMINATED, SUCCESS,<br>FAILED</p>
     */
    public String getJobState() {
        return this.JobState;
    }

    /**
     * Set <p>作业状态，包括CREATED, QUEING, STARTNG, RUNING, TERMINATING, TERMINATED, SUCCESS,<br>FAILED</p>
     * @param JobState <p>作业状态，包括CREATED, QUEING, STARTNG, RUNING, TERMINATING, TERMINATED, SUCCESS,<br>FAILED</p>
     */
    public void setJobState(String JobState) {
        this.JobState = JobState;
    }

    /**
     * Get <p>作业所属集群ID</p> 
     * @return ClusterId <p>作业所属集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>作业所属集群ID</p>
     * @param ClusterId <p>作业所属集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>作业所属队列名称</p> 
     * @return QueueName <p>作业所属队列名称</p>
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set <p>作业所属队列名称</p>
     * @param QueueName <p>作业所属队列名称</p>
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get <p>完成作业任务所需资源</p> 
     * @return OccupyResources <p>完成作业任务所需资源</p>
     */
    public String getOccupyResources() {
        return this.OccupyResources;
    }

    /**
     * Set <p>完成作业任务所需资源</p>
     * @param OccupyResources <p>完成作业任务所需资源</p>
     */
    public void setOccupyResources(String OccupyResources) {
        this.OccupyResources = OccupyResources;
    }

    /**
     * Get <p>作业任务创建时间</p> 
     * @return CreateTime <p>作业任务创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>作业任务创建时间</p>
     * @param CreateTime <p>作业任务创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>作业任务结束时间</p> 
     * @return EndTime <p>作业任务结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>作业任务结束时间</p>
     * @param EndTime <p>作业任务结束时间</p>
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
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
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
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "JobState", this.JobState);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "OccupyResources", this.OccupyResources);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

