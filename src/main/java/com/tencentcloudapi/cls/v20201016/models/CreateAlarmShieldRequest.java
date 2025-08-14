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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAlarmShieldRequest extends AbstractModel {

    /**
    * 通知渠道组id。-通过[获取通知渠道组列表](https://cloud.tencent.com/document/product/614/56462)获取通知渠道组id
    */
    @SerializedName("AlarmNoticeId")
    @Expose
    private String AlarmNoticeId;

    /**
    * 屏蔽规则开始时间，秒级(s)时间戳。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 屏蔽规则结束时间，秒级(s)时间戳。结束时间需要大于当前时间
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
    * 屏蔽原因。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 屏蔽规则，当Type为2时必填。规则填写方式详见[产品文档](https://cloud.tencent.com/document/product/614/103178#rule)。
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
     * Get 通知渠道组id。-通过[获取通知渠道组列表](https://cloud.tencent.com/document/product/614/56462)获取通知渠道组id 
     * @return AlarmNoticeId 通知渠道组id。-通过[获取通知渠道组列表](https://cloud.tencent.com/document/product/614/56462)获取通知渠道组id
     */
    public String getAlarmNoticeId() {
        return this.AlarmNoticeId;
    }

    /**
     * Set 通知渠道组id。-通过[获取通知渠道组列表](https://cloud.tencent.com/document/product/614/56462)获取通知渠道组id
     * @param AlarmNoticeId 通知渠道组id。-通过[获取通知渠道组列表](https://cloud.tencent.com/document/product/614/56462)获取通知渠道组id
     */
    public void setAlarmNoticeId(String AlarmNoticeId) {
        this.AlarmNoticeId = AlarmNoticeId;
    }

    /**
     * Get 屏蔽规则开始时间，秒级(s)时间戳。 
     * @return StartTime 屏蔽规则开始时间，秒级(s)时间戳。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 屏蔽规则开始时间，秒级(s)时间戳。
     * @param StartTime 屏蔽规则开始时间，秒级(s)时间戳。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 屏蔽规则结束时间，秒级(s)时间戳。结束时间需要大于当前时间 
     * @return EndTime 屏蔽规则结束时间，秒级(s)时间戳。结束时间需要大于当前时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 屏蔽规则结束时间，秒级(s)时间戳。结束时间需要大于当前时间
     * @param EndTime 屏蔽规则结束时间，秒级(s)时间戳。结束时间需要大于当前时间
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

    public CreateAlarmShieldRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAlarmShieldRequest(CreateAlarmShieldRequest source) {
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
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmNoticeId", this.AlarmNoticeId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Rule", this.Rule);

    }
}

