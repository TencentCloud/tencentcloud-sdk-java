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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeJobSubmitInfoResponse extends AbstractModel{

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
    * 作业优先级，任务（Task）和任务实例（TaskInstance）会继承作业优先级
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 任务信息
    */
    @SerializedName("Tasks")
    @Expose
    private Task [] Tasks;

    /**
    * 依赖信息
    */
    @SerializedName("Dependences")
    @Expose
    private Dependence [] Dependences;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get 作业优先级，任务（Task）和任务实例（TaskInstance）会继承作业优先级 
     * @return Priority 作业优先级，任务（Task）和任务实例（TaskInstance）会继承作业优先级
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 作业优先级，任务（Task）和任务实例（TaskInstance）会继承作业优先级
     * @param Priority 作业优先级，任务（Task）和任务实例（TaskInstance）会继承作业优先级
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 任务信息 
     * @return Tasks 任务信息
     */
    public Task [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 任务信息
     * @param Tasks 任务信息
     */
    public void setTasks(Task [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get 依赖信息 
     * @return Dependences 依赖信息
     */
    public Dependence [] getDependences() {
        return this.Dependences;
    }

    /**
     * Set 依赖信息
     * @param Dependences 依赖信息
     */
    public void setDependences(Dependence [] Dependences) {
        this.Dependences = Dependences;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "JobDescription", this.JobDescription);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamArrayObj(map, prefix + "Dependences.", this.Dependences);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

