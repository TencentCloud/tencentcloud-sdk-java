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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventInfo extends AbstractModel{

    /**
    * 事件 ID 。
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * 诊断类型。
    */
    @SerializedName("DiagType")
    @Expose
    private String DiagType;

    /**
    * 开始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 概要。
    */
    @SerializedName("Outline")
    @Expose
    private String Outline;

    /**
    * 严重程度。严重程度分为5级，按影响程度从高至低分别为：1：致命，2：严重，3：告警，4：提示，5：健康。
    */
    @SerializedName("Severity")
    @Expose
    private Long Severity;

    /**
    * 扣分。
    */
    @SerializedName("ScoreLost")
    @Expose
    private Long ScoreLost;

    /**
    * 保留字段。
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 告警数目。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 事件 ID 。 
     * @return EventId 事件 ID 。
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件 ID 。
     * @param EventId 事件 ID 。
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 诊断类型。 
     * @return DiagType 诊断类型。
     */
    public String getDiagType() {
        return this.DiagType;
    }

    /**
     * Set 诊断类型。
     * @param DiagType 诊断类型。
     */
    public void setDiagType(String DiagType) {
        this.DiagType = DiagType;
    }

    /**
     * Get 开始时间。 
     * @return StartTime 开始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间。
     * @param StartTime 开始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间。 
     * @return EndTime 结束时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间。
     * @param EndTime 结束时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 概要。 
     * @return Outline 概要。
     */
    public String getOutline() {
        return this.Outline;
    }

    /**
     * Set 概要。
     * @param Outline 概要。
     */
    public void setOutline(String Outline) {
        this.Outline = Outline;
    }

    /**
     * Get 严重程度。严重程度分为5级，按影响程度从高至低分别为：1：致命，2：严重，3：告警，4：提示，5：健康。 
     * @return Severity 严重程度。严重程度分为5级，按影响程度从高至低分别为：1：致命，2：严重，3：告警，4：提示，5：健康。
     */
    public Long getSeverity() {
        return this.Severity;
    }

    /**
     * Set 严重程度。严重程度分为5级，按影响程度从高至低分别为：1：致命，2：严重，3：告警，4：提示，5：健康。
     * @param Severity 严重程度。严重程度分为5级，按影响程度从高至低分别为：1：致命，2：严重，3：告警，4：提示，5：健康。
     */
    public void setSeverity(Long Severity) {
        this.Severity = Severity;
    }

    /**
     * Get 扣分。 
     * @return ScoreLost 扣分。
     */
    public Long getScoreLost() {
        return this.ScoreLost;
    }

    /**
     * Set 扣分。
     * @param ScoreLost 扣分。
     */
    public void setScoreLost(Long ScoreLost) {
        this.ScoreLost = ScoreLost;
    }

    /**
     * Get 保留字段。 
     * @return Metric 保留字段。
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 保留字段。
     * @param Metric 保留字段。
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 告警数目。 
     * @return Count 告警数目。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 告警数目。
     * @param Count 告警数目。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public EventInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventInfo(EventInfo source) {
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.DiagType != null) {
            this.DiagType = new String(source.DiagType);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Outline != null) {
            this.Outline = new String(source.Outline);
        }
        if (source.Severity != null) {
            this.Severity = new Long(source.Severity);
        }
        if (source.ScoreLost != null) {
            this.ScoreLost = new Long(source.ScoreLost);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "DiagType", this.DiagType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Outline", this.Outline);
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamSimple(map, prefix + "ScoreLost", this.ScoreLost);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

