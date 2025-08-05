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

public class Job extends AbstractModel {

    /**
    * 任务配置信息。
    */
    @SerializedName("Tasks")
    @Expose
    private Task [] Tasks;

    /**
    * 作业名称。
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * 作业描述。
    */
    @SerializedName("JobDescription")
    @Expose
    private String JobDescription;

    /**
    * 作业优先级，数值越大，优先级越高，数值范围1～100。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 描述任务的依赖关系，DAG有向无环图。
    */
    @SerializedName("TaskDependencies")
    @Expose
    private TaskDependence [] TaskDependencies;

    /**
     * Get 任务配置信息。 
     * @return Tasks 任务配置信息。
     */
    public Task [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 任务配置信息。
     * @param Tasks 任务配置信息。
     */
    public void setTasks(Task [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get 作业名称。 
     * @return JobName 作业名称。
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set 作业名称。
     * @param JobName 作业名称。
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get 作业描述。 
     * @return JobDescription 作业描述。
     */
    public String getJobDescription() {
        return this.JobDescription;
    }

    /**
     * Set 作业描述。
     * @param JobDescription 作业描述。
     */
    public void setJobDescription(String JobDescription) {
        this.JobDescription = JobDescription;
    }

    /**
     * Get 作业优先级，数值越大，优先级越高，数值范围1～100。 
     * @return Priority 作业优先级，数值越大，优先级越高，数值范围1～100。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 作业优先级，数值越大，优先级越高，数值范围1～100。
     * @param Priority 作业优先级，数值越大，优先级越高，数值范围1～100。
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 描述任务的依赖关系，DAG有向无环图。 
     * @return TaskDependencies 描述任务的依赖关系，DAG有向无环图。
     */
    public TaskDependence [] getTaskDependencies() {
        return this.TaskDependencies;
    }

    /**
     * Set 描述任务的依赖关系，DAG有向无环图。
     * @param TaskDependencies 描述任务的依赖关系，DAG有向无环图。
     */
    public void setTaskDependencies(TaskDependence [] TaskDependencies) {
        this.TaskDependencies = TaskDependencies;
    }

    public Job() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Job(Job source) {
        if (source.Tasks != null) {
            this.Tasks = new Task[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new Task(source.Tasks[i]);
            }
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
        if (source.TaskDependencies != null) {
            this.TaskDependencies = new TaskDependence[source.TaskDependencies.length];
            for (int i = 0; i < source.TaskDependencies.length; i++) {
                this.TaskDependencies[i] = new TaskDependence(source.TaskDependencies[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "JobDescription", this.JobDescription);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamArrayObj(map, prefix + "TaskDependencies.", this.TaskDependencies);

    }
}

