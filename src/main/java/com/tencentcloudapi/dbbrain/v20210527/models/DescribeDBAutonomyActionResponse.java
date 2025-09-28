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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBAutonomyActionResponse extends AbstractModel {

    /**
    * 自治任务ID。
    */
    @SerializedName("ActionId")
    @Expose
    private Long ActionId;

    /**
    * 自治事件ID。
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * 任务ID。
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 类型：支持RedisAutoScaleUp
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 自治任务触发时间。格式: "yyyy-MM-dd HH:mm:ss"
    */
    @SerializedName("TriggerTime")
    @Expose
    private String TriggerTime;

    /**
    * 自治任务创建时间。格式: "yyyy-MM-dd HH:mm:ss"
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 自治任务更新时间。格式: "yyyy-MM-dd HH:mm:ss"
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 自治任务完成时间。格式: "yyyy-MM-dd HH:mm:ss"
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * 剩余时间，单位：秒。
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 触发原因。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 自治任务状态：支持 RUNNING，FINISHED，TERMINATED，CANCELLED
其中：
RUNNING    - 运行中  
FINISHED   - 已完成  
TERMINATED - 已终止  
CANCELLED  - 已取消  

    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务相关的图表等信息。
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 自治任务ID。 
     * @return ActionId 自治任务ID。
     */
    public Long getActionId() {
        return this.ActionId;
    }

    /**
     * Set 自治任务ID。
     * @param ActionId 自治任务ID。
     */
    public void setActionId(Long ActionId) {
        this.ActionId = ActionId;
    }

    /**
     * Get 自治事件ID。 
     * @return EventId 自治事件ID。
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set 自治事件ID。
     * @param EventId 自治事件ID。
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 任务ID。 
     * @return TaskId 任务ID。
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID。
     * @param TaskId 任务ID。
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 类型：支持RedisAutoScaleUp 
     * @return Type 类型：支持RedisAutoScaleUp
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型：支持RedisAutoScaleUp
     * @param Type 类型：支持RedisAutoScaleUp
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 自治任务触发时间。格式: "yyyy-MM-dd HH:mm:ss" 
     * @return TriggerTime 自治任务触发时间。格式: "yyyy-MM-dd HH:mm:ss"
     */
    public String getTriggerTime() {
        return this.TriggerTime;
    }

    /**
     * Set 自治任务触发时间。格式: "yyyy-MM-dd HH:mm:ss"
     * @param TriggerTime 自治任务触发时间。格式: "yyyy-MM-dd HH:mm:ss"
     */
    public void setTriggerTime(String TriggerTime) {
        this.TriggerTime = TriggerTime;
    }

    /**
     * Get 自治任务创建时间。格式: "yyyy-MM-dd HH:mm:ss" 
     * @return CreateTime 自治任务创建时间。格式: "yyyy-MM-dd HH:mm:ss"
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 自治任务创建时间。格式: "yyyy-MM-dd HH:mm:ss"
     * @param CreateTime 自治任务创建时间。格式: "yyyy-MM-dd HH:mm:ss"
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 自治任务更新时间。格式: "yyyy-MM-dd HH:mm:ss" 
     * @return UpdateTime 自治任务更新时间。格式: "yyyy-MM-dd HH:mm:ss"
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 自治任务更新时间。格式: "yyyy-MM-dd HH:mm:ss"
     * @param UpdateTime 自治任务更新时间。格式: "yyyy-MM-dd HH:mm:ss"
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 自治任务完成时间。格式: "yyyy-MM-dd HH:mm:ss" 
     * @return FinishTime 自治任务完成时间。格式: "yyyy-MM-dd HH:mm:ss"
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 自治任务完成时间。格式: "yyyy-MM-dd HH:mm:ss"
     * @param FinishTime 自治任务完成时间。格式: "yyyy-MM-dd HH:mm:ss"
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get 剩余时间，单位：秒。 
     * @return ExpireTime 剩余时间，单位：秒。
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 剩余时间，单位：秒。
     * @param ExpireTime 剩余时间，单位：秒。
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 触发原因。 
     * @return Reason 触发原因。
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 触发原因。
     * @param Reason 触发原因。
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 自治任务状态：支持 RUNNING，FINISHED，TERMINATED，CANCELLED
其中：
RUNNING    - 运行中  
FINISHED   - 已完成  
TERMINATED - 已终止  
CANCELLED  - 已取消  
 
     * @return Status 自治任务状态：支持 RUNNING，FINISHED，TERMINATED，CANCELLED
其中：
RUNNING    - 运行中  
FINISHED   - 已完成  
TERMINATED - 已终止  
CANCELLED  - 已取消  

     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 自治任务状态：支持 RUNNING，FINISHED，TERMINATED，CANCELLED
其中：
RUNNING    - 运行中  
FINISHED   - 已完成  
TERMINATED - 已终止  
CANCELLED  - 已取消  

     * @param Status 自治任务状态：支持 RUNNING，FINISHED，TERMINATED，CANCELLED
其中：
RUNNING    - 运行中  
FINISHED   - 已完成  
TERMINATED - 已终止  
CANCELLED  - 已取消  

     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务相关的图表等信息。 
     * @return Info 任务相关的图表等信息。
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set 任务相关的图表等信息。
     * @param Info 任务相关的图表等信息。
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDBAutonomyActionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBAutonomyActionResponse(DescribeDBAutonomyActionResponse source) {
        if (source.ActionId != null) {
            this.ActionId = new Long(source.ActionId);
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TriggerTime != null) {
            this.TriggerTime = new String(source.TriggerTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Info != null) {
            this.Info = new String(source.Info);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActionId", this.ActionId);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TriggerTime", this.TriggerTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Info", this.Info);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

