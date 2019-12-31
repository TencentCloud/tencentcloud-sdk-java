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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBDiagEventResponse extends AbstractModel{

    /**
    * 诊断项。
    */
    @SerializedName("DiagItem")
    @Expose
    private String DiagItem;

    /**
    * 诊断类型。
    */
    @SerializedName("DiagType")
    @Expose
    private String DiagType;

    /**
    * 事件 ID 。
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * 事件详情。
    */
    @SerializedName("Explanation")
    @Expose
    private String Explanation;

    /**
    * 概要。
    */
    @SerializedName("Outline")
    @Expose
    private String Outline;

    /**
    * 诊断出的问题。
    */
    @SerializedName("Problem")
    @Expose
    private String Problem;

    /**
    * 严重程度。严重程度分为5级，按影响程度从高至低分别为：1：致命，2：严重，3：告警，4：提示，5：健康。
    */
    @SerializedName("Severity")
    @Expose
    private Long Severity;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 建议。
    */
    @SerializedName("Suggestions")
    @Expose
    private String Suggestions;

    /**
    * 保留字段。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 诊断项。 
     * @return DiagItem 诊断项。
     */
    public String getDiagItem() {
        return this.DiagItem;
    }

    /**
     * Set 诊断项。
     * @param DiagItem 诊断项。
     */
    public void setDiagItem(String DiagItem) {
        this.DiagItem = DiagItem;
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
     * Get 事件详情。 
     * @return Explanation 事件详情。
     */
    public String getExplanation() {
        return this.Explanation;
    }

    /**
     * Set 事件详情。
     * @param Explanation 事件详情。
     */
    public void setExplanation(String Explanation) {
        this.Explanation = Explanation;
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
     * Get 诊断出的问题。 
     * @return Problem 诊断出的问题。
     */
    public String getProblem() {
        return this.Problem;
    }

    /**
     * Set 诊断出的问题。
     * @param Problem 诊断出的问题。
     */
    public void setProblem(String Problem) {
        this.Problem = Problem;
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
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 建议。 
     * @return Suggestions 建议。
     */
    public String getSuggestions() {
        return this.Suggestions;
    }

    /**
     * Set 建议。
     * @param Suggestions 建议。
     */
    public void setSuggestions(String Suggestions) {
        this.Suggestions = Suggestions;
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
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiagItem", this.DiagItem);
        this.setParamSimple(map, prefix + "DiagType", this.DiagType);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "Explanation", this.Explanation);
        this.setParamSimple(map, prefix + "Outline", this.Outline);
        this.setParamSimple(map, prefix + "Problem", this.Problem);
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Suggestions", this.Suggestions);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

