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

public class AutonomyEventVo extends AbstractModel {

    /**
    * 自治事件ID。
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * 自治事件类型：支持RunningAutoRecovery，RedisAutoScale
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 自治事件状态：支持 RUNNING，FINISHED，TERMINATED
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 触发原因。	
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 自治任务触发时间。
    */
    @SerializedName("TriggerTime")
    @Expose
    private Long TriggerTime;

    /**
    * 自治任务最后触发时间。
    */
    @SerializedName("LastTriggerTime")
    @Expose
    private Long LastTriggerTime;

    /**
    * 自治任务创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 自治任务更新时间。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 自治任务完成时间；非结束状态的时候，该值无意义。
    */
    @SerializedName("FinishTime")
    @Expose
    private Long FinishTime;

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
     * Get 自治事件类型：支持RunningAutoRecovery，RedisAutoScale 
     * @return Type 自治事件类型：支持RunningAutoRecovery，RedisAutoScale
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 自治事件类型：支持RunningAutoRecovery，RedisAutoScale
     * @param Type 自治事件类型：支持RunningAutoRecovery，RedisAutoScale
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 自治事件状态：支持 RUNNING，FINISHED，TERMINATED 
     * @return Status 自治事件状态：支持 RUNNING，FINISHED，TERMINATED
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 自治事件状态：支持 RUNNING，FINISHED，TERMINATED
     * @param Status 自治事件状态：支持 RUNNING，FINISHED，TERMINATED
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get 自治任务触发时间。 
     * @return TriggerTime 自治任务触发时间。
     */
    public Long getTriggerTime() {
        return this.TriggerTime;
    }

    /**
     * Set 自治任务触发时间。
     * @param TriggerTime 自治任务触发时间。
     */
    public void setTriggerTime(Long TriggerTime) {
        this.TriggerTime = TriggerTime;
    }

    /**
     * Get 自治任务最后触发时间。 
     * @return LastTriggerTime 自治任务最后触发时间。
     */
    public Long getLastTriggerTime() {
        return this.LastTriggerTime;
    }

    /**
     * Set 自治任务最后触发时间。
     * @param LastTriggerTime 自治任务最后触发时间。
     */
    public void setLastTriggerTime(Long LastTriggerTime) {
        this.LastTriggerTime = LastTriggerTime;
    }

    /**
     * Get 自治任务创建时间。 
     * @return CreateTime 自治任务创建时间。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 自治任务创建时间。
     * @param CreateTime 自治任务创建时间。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 自治任务更新时间。 
     * @return UpdateTime 自治任务更新时间。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 自治任务更新时间。
     * @param UpdateTime 自治任务更新时间。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 自治任务完成时间；非结束状态的时候，该值无意义。 
     * @return FinishTime 自治任务完成时间；非结束状态的时候，该值无意义。
     */
    public Long getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 自治任务完成时间；非结束状态的时候，该值无意义。
     * @param FinishTime 自治任务完成时间；非结束状态的时候，该值无意义。
     */
    public void setFinishTime(Long FinishTime) {
        this.FinishTime = FinishTime;
    }

    public AutonomyEventVo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutonomyEventVo(AutonomyEventVo source) {
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.TriggerTime != null) {
            this.TriggerTime = new Long(source.TriggerTime);
        }
        if (source.LastTriggerTime != null) {
            this.LastTriggerTime = new Long(source.LastTriggerTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new Long(source.FinishTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "TriggerTime", this.TriggerTime);
        this.setParamSimple(map, prefix + "LastTriggerTime", this.LastTriggerTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);

    }
}

