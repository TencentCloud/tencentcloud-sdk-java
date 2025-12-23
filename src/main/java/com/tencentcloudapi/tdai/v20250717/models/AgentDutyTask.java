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
package com.tencentcloudapi.tdai.v20250717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentDutyTask extends AbstractModel {

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务开始运行时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 任务结束时间
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * 任务状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 对外展示的Extra信息
    */
    @SerializedName("ResultExtraKey")
    @Expose
    private String [] ResultExtraKey;

    /**
    * 业务的额外敏感信息
    */
    @SerializedName("Extra")
    @Expose
    private ExtraInfo [] Extra;

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
     * Get 任务开始运行时间 
     * @return StartTime 任务开始运行时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务开始运行时间
     * @param StartTime 任务开始运行时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务结束时间 
     * @return FinishTime 任务结束时间
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 任务结束时间
     * @param FinishTime 任务结束时间
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get 任务状态 
     * @return Status 任务状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态
     * @param Status 任务状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 对外展示的Extra信息 
     * @return ResultExtraKey 对外展示的Extra信息
     */
    public String [] getResultExtraKey() {
        return this.ResultExtraKey;
    }

    /**
     * Set 对外展示的Extra信息
     * @param ResultExtraKey 对外展示的Extra信息
     */
    public void setResultExtraKey(String [] ResultExtraKey) {
        this.ResultExtraKey = ResultExtraKey;
    }

    /**
     * Get 业务的额外敏感信息 
     * @return Extra 业务的额外敏感信息
     */
    public ExtraInfo [] getExtra() {
        return this.Extra;
    }

    /**
     * Set 业务的额外敏感信息
     * @param Extra 业务的额外敏感信息
     */
    public void setExtra(ExtraInfo [] Extra) {
        this.Extra = Extra;
    }

    public AgentDutyTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentDutyTask(AgentDutyTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ResultExtraKey != null) {
            this.ResultExtraKey = new String[source.ResultExtraKey.length];
            for (int i = 0; i < source.ResultExtraKey.length; i++) {
                this.ResultExtraKey[i] = new String(source.ResultExtraKey[i]);
            }
        }
        if (source.Extra != null) {
            this.Extra = new ExtraInfo[source.Extra.length];
            for (int i = 0; i < source.Extra.length; i++) {
                this.Extra[i] = new ExtraInfo(source.Extra[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "ResultExtraKey.", this.ResultExtraKey);
        this.setParamArrayObj(map, prefix + "Extra.", this.Extra);

    }
}

