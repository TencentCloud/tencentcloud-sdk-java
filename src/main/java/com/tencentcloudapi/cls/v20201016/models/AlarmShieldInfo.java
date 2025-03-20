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

public class AlarmShieldInfo extends AbstractModel {

    /**
    * 通知渠道组Id
    */
    @SerializedName("AlarmNoticeId")
    @Expose
    private String AlarmNoticeId;

    /**
    * 屏蔽规则id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

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
    * 规则创建来源。
1. 控制台，2.api，3.告警通知
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * 操作者。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 规则状态。
0：暂未生效，1：生效中，2：已失效
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 规则创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 规则更新时间。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get 通知渠道组Id 
     * @return AlarmNoticeId 通知渠道组Id
     */
    public String getAlarmNoticeId() {
        return this.AlarmNoticeId;
    }

    /**
     * Set 通知渠道组Id
     * @param AlarmNoticeId 通知渠道组Id
     */
    public void setAlarmNoticeId(String AlarmNoticeId) {
        this.AlarmNoticeId = AlarmNoticeId;
    }

    /**
     * Get 屏蔽规则id 
     * @return TaskId 屏蔽规则id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 屏蔽规则id
     * @param TaskId 屏蔽规则id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
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
     * Get 规则创建来源。
1. 控制台，2.api，3.告警通知 
     * @return Source 规则创建来源。
1. 控制台，2.api，3.告警通知
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 规则创建来源。
1. 控制台，2.api，3.告警通知
     * @param Source 规则创建来源。
1. 控制台，2.api，3.告警通知
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get 操作者。 
     * @return Operator 操作者。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者。
     * @param Operator 操作者。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 规则状态。
0：暂未生效，1：生效中，2：已失效 
     * @return Status 规则状态。
0：暂未生效，1：生效中，2：已失效
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规则状态。
0：暂未生效，1：生效中，2：已失效
     * @param Status 规则状态。
0：暂未生效，1：生效中，2：已失效
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 规则创建时间。 
     * @return CreateTime 规则创建时间。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 规则创建时间。
     * @param CreateTime 规则创建时间。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 规则更新时间。 
     * @return UpdateTime 规则更新时间。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 规则更新时间。
     * @param UpdateTime 规则更新时间。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public AlarmShieldInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmShieldInfo(AlarmShieldInfo source) {
        if (source.AlarmNoticeId != null) {
            this.AlarmNoticeId = new String(source.AlarmNoticeId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
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
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmNoticeId", this.AlarmNoticeId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

