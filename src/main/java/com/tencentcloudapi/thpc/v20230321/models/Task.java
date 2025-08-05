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

public class Task extends AbstractModel {

    /**
    * 作业任务的应用环境配置信息。
    */
    @SerializedName("Application")
    @Expose
    private Application Application;

    /**
    * 作业任务名称。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 作业任务所需的节点数/副本数。
    */
    @SerializedName("TaskInstanceNum")
    @Expose
    private Long TaskInstanceNum;

    /**
    * 任务超时时间(单位：秒)。
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
     * Get 作业任务的应用环境配置信息。 
     * @return Application 作业任务的应用环境配置信息。
     */
    public Application getApplication() {
        return this.Application;
    }

    /**
     * Set 作业任务的应用环境配置信息。
     * @param Application 作业任务的应用环境配置信息。
     */
    public void setApplication(Application Application) {
        this.Application = Application;
    }

    /**
     * Get 作业任务名称。 
     * @return TaskName 作业任务名称。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 作业任务名称。
     * @param TaskName 作业任务名称。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 作业任务所需的节点数/副本数。 
     * @return TaskInstanceNum 作业任务所需的节点数/副本数。
     */
    public Long getTaskInstanceNum() {
        return this.TaskInstanceNum;
    }

    /**
     * Set 作业任务所需的节点数/副本数。
     * @param TaskInstanceNum 作业任务所需的节点数/副本数。
     */
    public void setTaskInstanceNum(Long TaskInstanceNum) {
        this.TaskInstanceNum = TaskInstanceNum;
    }

    /**
     * Get 任务超时时间(单位：秒)。 
     * @return Timeout 任务超时时间(单位：秒)。
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 任务超时时间(单位：秒)。
     * @param Timeout 任务超时时间(单位：秒)。
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    public Task() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Task(Task source) {
        if (source.Application != null) {
            this.Application = new Application(source.Application);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskInstanceNum != null) {
            this.TaskInstanceNum = new Long(source.TaskInstanceNum);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Application.", this.Application);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskInstanceNum", this.TaskInstanceNum);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);

    }
}

