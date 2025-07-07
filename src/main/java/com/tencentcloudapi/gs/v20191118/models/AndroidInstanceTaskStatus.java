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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AndroidInstanceTaskStatus extends AbstractModel {

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务状态：SUCCESS，FAILED，PROCESSING，PENDING,CANCELED
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 实例ID
    */
    @SerializedName("AndroidInstanceId")
    @Expose
    private String AndroidInstanceId;

    /**
    * 任务执行结果描述，针对某些任务，可以是可解析的 json
    */
    @SerializedName("TaskResult")
    @Expose
    private String TaskResult;

    /**
    * 任务类型
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 任务创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务完成时间
    */
    @SerializedName("CompleteTime")
    @Expose
    private String CompleteTime;

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务状态：SUCCESS，FAILED，PROCESSING，PENDING,CANCELED 
     * @return Status 任务状态：SUCCESS，FAILED，PROCESSING，PENDING,CANCELED
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态：SUCCESS，FAILED，PROCESSING，PENDING,CANCELED
     * @param Status 任务状态：SUCCESS，FAILED，PROCESSING，PENDING,CANCELED
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 实例ID 
     * @return AndroidInstanceId 实例ID
     */
    public String getAndroidInstanceId() {
        return this.AndroidInstanceId;
    }

    /**
     * Set 实例ID
     * @param AndroidInstanceId 实例ID
     */
    public void setAndroidInstanceId(String AndroidInstanceId) {
        this.AndroidInstanceId = AndroidInstanceId;
    }

    /**
     * Get 任务执行结果描述，针对某些任务，可以是可解析的 json 
     * @return TaskResult 任务执行结果描述，针对某些任务，可以是可解析的 json
     */
    public String getTaskResult() {
        return this.TaskResult;
    }

    /**
     * Set 任务执行结果描述，针对某些任务，可以是可解析的 json
     * @param TaskResult 任务执行结果描述，针对某些任务，可以是可解析的 json
     */
    public void setTaskResult(String TaskResult) {
        this.TaskResult = TaskResult;
    }

    /**
     * Get 任务类型 
     * @return TaskType 任务类型
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型
     * @param TaskType 任务类型
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务创建时间 
     * @return CreateTime 任务创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建时间
     * @param CreateTime 任务创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 任务完成时间 
     * @return CompleteTime 任务完成时间
     */
    public String getCompleteTime() {
        return this.CompleteTime;
    }

    /**
     * Set 任务完成时间
     * @param CompleteTime 任务完成时间
     */
    public void setCompleteTime(String CompleteTime) {
        this.CompleteTime = CompleteTime;
    }

    public AndroidInstanceTaskStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AndroidInstanceTaskStatus(AndroidInstanceTaskStatus source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.AndroidInstanceId != null) {
            this.AndroidInstanceId = new String(source.AndroidInstanceId);
        }
        if (source.TaskResult != null) {
            this.TaskResult = new String(source.TaskResult);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.CompleteTime != null) {
            this.CompleteTime = new String(source.CompleteTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AndroidInstanceId", this.AndroidInstanceId);
        this.setParamSimple(map, prefix + "TaskResult", this.TaskResult);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CompleteTime", this.CompleteTime);

    }
}

