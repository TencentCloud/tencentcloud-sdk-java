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

public class DiagHistoryEventItem extends AbstractModel{

    /**
    * 诊断类型。
    */
    @SerializedName("DiagType")
    @Expose
    private String DiagType;

    /**
    * 结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 开始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 事件唯一ID 。
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * 严重程度。严重程度分为5级，按影响程度从高至低分别为：1：致命，2：严重，3：告警，4：提示，5：健康。
    */
    @SerializedName("Severity")
    @Expose
    private Long Severity;

    /**
    * 诊断概要。
    */
    @SerializedName("Outline")
    @Expose
    private String Outline;

    /**
    * 诊断项说明。
    */
    @SerializedName("DiagItem")
    @Expose
    private String DiagItem;

    /**
    * 实例 ID 。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 保留字段。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 地域。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

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
     * Get 事件唯一ID 。 
     * @return EventId 事件唯一ID 。
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件唯一ID 。
     * @param EventId 事件唯一ID 。
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
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
     * Get 诊断概要。 
     * @return Outline 诊断概要。
     */
    public String getOutline() {
        return this.Outline;
    }

    /**
     * Set 诊断概要。
     * @param Outline 诊断概要。
     */
    public void setOutline(String Outline) {
        this.Outline = Outline;
    }

    /**
     * Get 诊断项说明。 
     * @return DiagItem 诊断项说明。
     */
    public String getDiagItem() {
        return this.DiagItem;
    }

    /**
     * Set 诊断项说明。
     * @param DiagItem 诊断项说明。
     */
    public void setDiagItem(String DiagItem) {
        this.DiagItem = DiagItem;
    }

    /**
     * Get 实例 ID 。 
     * @return InstanceId 实例 ID 。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID 。
     * @param InstanceId 实例 ID 。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 保留字段。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Metric 保留字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 保留字段。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Metric 保留字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 地域。 
     * @return Region 地域。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域。
     * @param Region 地域。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public DiagHistoryEventItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiagHistoryEventItem(DiagHistoryEventItem source) {
        if (source.DiagType != null) {
            this.DiagType = new String(source.DiagType);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.Severity != null) {
            this.Severity = new Long(source.Severity);
        }
        if (source.Outline != null) {
            this.Outline = new String(source.Outline);
        }
        if (source.DiagItem != null) {
            this.DiagItem = new String(source.DiagItem);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiagType", this.DiagType);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamSimple(map, prefix + "Outline", this.Outline);
        this.setParamSimple(map, prefix + "DiagItem", this.DiagItem);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

