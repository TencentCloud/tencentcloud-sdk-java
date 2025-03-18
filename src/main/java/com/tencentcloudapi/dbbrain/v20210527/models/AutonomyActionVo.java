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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutonomyActionVo extends AbstractModel {

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
    * 类型：支持RedisAutoScaleUp
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 自治任务触发时间。
    */
    @SerializedName("TriggerTime")
    @Expose
    private String TriggerTime;

    /**
    * 自治任务创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 自治任务更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 自治任务完成时间。
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
    */
    @SerializedName("Status")
    @Expose
    private String Status;

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
     * Get 自治任务触发时间。 
     * @return TriggerTime 自治任务触发时间。
     */
    public String getTriggerTime() {
        return this.TriggerTime;
    }

    /**
     * Set 自治任务触发时间。
     * @param TriggerTime 自治任务触发时间。
     */
    public void setTriggerTime(String TriggerTime) {
        this.TriggerTime = TriggerTime;
    }

    /**
     * Get 自治任务创建时间。 
     * @return CreateTime 自治任务创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 自治任务创建时间。
     * @param CreateTime 自治任务创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 自治任务更新时间 
     * @return UpdateTime 自治任务更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 自治任务更新时间
     * @param UpdateTime 自治任务更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 自治任务完成时间。 
     * @return FinishTime 自治任务完成时间。
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 自治任务完成时间。
     * @param FinishTime 自治任务完成时间。
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
     * @return Status 自治任务状态：支持 RUNNING，FINISHED，TERMINATED，CANCELLED
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 自治任务状态：支持 RUNNING，FINISHED，TERMINATED，CANCELLED
     * @param Status 自治任务状态：支持 RUNNING，FINISHED，TERMINATED，CANCELLED
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public AutonomyActionVo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutonomyActionVo(AutonomyActionVo source) {
        if (source.ActionId != null) {
            this.ActionId = new Long(source.ActionId);
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActionId", this.ActionId);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TriggerTime", this.TriggerTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

