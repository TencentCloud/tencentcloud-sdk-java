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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskOutput extends AbstractModel{

    /**
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 状态描述
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 状态值，SUCCESS/FAILED/OPERATING
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务提交时间
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 任务结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 操作名
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
     * Get 任务id 
     * @return TaskId 任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
     * @param TaskId 任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 状态描述 
     * @return Message 状态描述
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 状态描述
     * @param Message 状态描述
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 状态值，SUCCESS/FAILED/OPERATING 
     * @return Status 状态值，SUCCESS/FAILED/OPERATING
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态值，SUCCESS/FAILED/OPERATING
     * @param Status 状态值，SUCCESS/FAILED/OPERATING
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务提交时间 
     * @return AddTime 任务提交时间
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set 任务提交时间
     * @param AddTime 任务提交时间
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get 任务结束时间 
     * @return EndTime 任务结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 任务结束时间
     * @param EndTime 任务结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 操作名 
     * @return Operation 操作名
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名
     * @param Operation 操作名
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    public TaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskOutput(TaskOutput source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Operation", this.Operation);

    }
}

