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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAlarmShieldRequest extends AbstractModel {

    /**
    * 屏蔽规则ID。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 通知渠道组id。
    */
    @SerializedName("AlarmNoticeId")
    @Expose
    private String AlarmNoticeId;

    /**
    * 屏蔽开始时间（秒级时间戳）。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 屏蔽结束时间（秒级时间戳）。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 屏蔽类型。1：屏蔽所有通知，2：按照Rule参数屏蔽匹配规则的通知。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 屏蔽规则，当Type为2时必填。规则填写方式详见[产品文档](https://cloud.tencent.com/document/product/614/103178#rule)。
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * 屏蔽原因。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 规则状态。只有规则状态为生效中（status:1）时，才能将其修改为已失效（status:2）。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 屏蔽规则ID。 
     * @return TaskId 屏蔽规则ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 屏蔽规则ID。
     * @param TaskId 屏蔽规则ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 通知渠道组id。 
     * @return AlarmNoticeId 通知渠道组id。
     */
    public String getAlarmNoticeId() {
        return this.AlarmNoticeId;
    }

    /**
     * Set 通知渠道组id。
     * @param AlarmNoticeId 通知渠道组id。
     */
    public void setAlarmNoticeId(String AlarmNoticeId) {
        this.AlarmNoticeId = AlarmNoticeId;
    }

    /**
     * Get 屏蔽开始时间（秒级时间戳）。 
     * @return StartTime 屏蔽开始时间（秒级时间戳）。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 屏蔽开始时间（秒级时间戳）。
     * @param StartTime 屏蔽开始时间（秒级时间戳）。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 屏蔽结束时间（秒级时间戳）。 
     * @return EndTime 屏蔽结束时间（秒级时间戳）。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 屏蔽结束时间（秒级时间戳）。
     * @param EndTime 屏蔽结束时间（秒级时间戳）。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 屏蔽类型。1：屏蔽所有通知，2：按照Rule参数屏蔽匹配规则的通知。 
     * @return Type 屏蔽类型。1：屏蔽所有通知，2：按照Rule参数屏蔽匹配规则的通知。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 屏蔽类型。1：屏蔽所有通知，2：按照Rule参数屏蔽匹配规则的通知。
     * @param Type 屏蔽类型。1：屏蔽所有通知，2：按照Rule参数屏蔽匹配规则的通知。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 屏蔽规则，当Type为2时必填。规则填写方式详见[产品文档](https://cloud.tencent.com/document/product/614/103178#rule)。 
     * @return Rule 屏蔽规则，当Type为2时必填。规则填写方式详见[产品文档](https://cloud.tencent.com/document/product/614/103178#rule)。
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set 屏蔽规则，当Type为2时必填。规则填写方式详见[产品文档](https://cloud.tencent.com/document/product/614/103178#rule)。
     * @param Rule 屏蔽规则，当Type为2时必填。规则填写方式详见[产品文档](https://cloud.tencent.com/document/product/614/103178#rule)。
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * Get 屏蔽原因。 
     * @return Reason 屏蔽原因。
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 屏蔽原因。
     * @param Reason 屏蔽原因。
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 规则状态。只有规则状态为生效中（status:1）时，才能将其修改为已失效（status:2）。 
     * @return Status 规则状态。只有规则状态为生效中（status:1）时，才能将其修改为已失效（status:2）。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规则状态。只有规则状态为生效中（status:1）时，才能将其修改为已失效（status:2）。
     * @param Status 规则状态。只有规则状态为生效中（status:1）时，才能将其修改为已失效（status:2）。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ModifyAlarmShieldRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAlarmShieldRequest(ModifyAlarmShieldRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.AlarmNoticeId != null) {
            this.AlarmNoticeId = new String(source.AlarmNoticeId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "AlarmNoticeId", this.AlarmNoticeId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

