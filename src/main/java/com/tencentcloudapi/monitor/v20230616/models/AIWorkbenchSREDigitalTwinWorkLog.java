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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIWorkbenchSREDigitalTwinWorkLog extends AbstractModel {

    /**
    * 唯一标识符
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 所属数字分身ID
    */
    @SerializedName("TwinID")
    @Expose
    private Long TwinID;

    /**
    * 所属数字分身任务ID
    */
    @SerializedName("TaskID")
    @Expose
    private Long TaskID;

    /**
    * 分析时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 分析状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 分析结果摘要
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 所属任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 所属任务类型
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
     * Get 唯一标识符 
     * @return ID 唯一标识符
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 唯一标识符
     * @param ID 唯一标识符
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 创建时间 
     * @return CreatedAt 创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
     * @param CreatedAt 创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 所属数字分身ID 
     * @return TwinID 所属数字分身ID
     */
    public Long getTwinID() {
        return this.TwinID;
    }

    /**
     * Set 所属数字分身ID
     * @param TwinID 所属数字分身ID
     */
    public void setTwinID(Long TwinID) {
        this.TwinID = TwinID;
    }

    /**
     * Get 所属数字分身任务ID 
     * @return TaskID 所属数字分身任务ID
     */
    public Long getTaskID() {
        return this.TaskID;
    }

    /**
     * Set 所属数字分身任务ID
     * @param TaskID 所属数字分身任务ID
     */
    public void setTaskID(Long TaskID) {
        this.TaskID = TaskID;
    }

    /**
     * Get 分析时间 
     * @return StartTime 分析时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 分析时间
     * @param StartTime 分析时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 分析状态 
     * @return Status 分析状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 分析状态
     * @param Status 分析状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 分析结果摘要 
     * @return Result 分析结果摘要
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 分析结果摘要
     * @param Result 分析结果摘要
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 所属任务名称 
     * @return TaskName 所属任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 所属任务名称
     * @param TaskName 所属任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 所属任务类型 
     * @return TaskType 所属任务类型
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 所属任务类型
     * @param TaskType 所属任务类型
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    public AIWorkbenchSREDigitalTwinWorkLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIWorkbenchSREDigitalTwinWorkLog(AIWorkbenchSREDigitalTwinWorkLog source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.TwinID != null) {
            this.TwinID = new Long(source.TwinID);
        }
        if (source.TaskID != null) {
            this.TaskID = new Long(source.TaskID);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "TwinID", this.TwinID);
        this.setParamSimple(map, prefix + "TaskID", this.TaskID);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);

    }
}

