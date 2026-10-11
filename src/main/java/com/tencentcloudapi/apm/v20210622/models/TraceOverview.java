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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TraceOverview extends AbstractModel {

    /**
    * <p>traceID调用状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>TraceId查询</p>
    */
    @SerializedName("TraceID")
    @Expose
    private String TraceID;

    /**
    * <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * <p>服务名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>耗时</p>
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * <p>接口名</p>
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * <p>开始时间（微秒）</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>应用数</p>
    */
    @SerializedName("ApplicationCount")
    @Expose
    private Long ApplicationCount;

    /**
    * <p>异常Span列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorSpans")
    @Expose
    private ErrorSpan [] ErrorSpans;

    /**
     * Get <p>traceID调用状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>traceID调用状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>traceID调用状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>traceID调用状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>TraceId查询</p> 
     * @return TraceID <p>TraceId查询</p>
     */
    public String getTraceID() {
        return this.TraceID;
    }

    /**
     * Set <p>TraceId查询</p>
     * @param TraceID <p>TraceId查询</p>
     */
    public void setTraceID(String TraceID) {
        this.TraceID = TraceID;
    }

    /**
     * Get <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMsg <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMsg <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get <p>服务名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceName <p>服务名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>服务名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceName <p>服务名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get <p>耗时</p> 
     * @return Duration <p>耗时</p>
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>耗时</p>
     * @param Duration <p>耗时</p>
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>接口名</p> 
     * @return Operation <p>接口名</p>
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set <p>接口名</p>
     * @param Operation <p>接口名</p>
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get <p>开始时间（微秒）</p> 
     * @return StartTime <p>开始时间（微秒）</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间（微秒）</p>
     * @param StartTime <p>开始时间（微秒）</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>应用数</p> 
     * @return ApplicationCount <p>应用数</p>
     */
    public Long getApplicationCount() {
        return this.ApplicationCount;
    }

    /**
     * Set <p>应用数</p>
     * @param ApplicationCount <p>应用数</p>
     */
    public void setApplicationCount(Long ApplicationCount) {
        this.ApplicationCount = ApplicationCount;
    }

    /**
     * Get <p>异常Span列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorSpans <p>异常Span列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ErrorSpan [] getErrorSpans() {
        return this.ErrorSpans;
    }

    /**
     * Set <p>异常Span列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorSpans <p>异常Span列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorSpans(ErrorSpan [] ErrorSpans) {
        this.ErrorSpans = ErrorSpans;
    }

    public TraceOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TraceOverview(TraceOverview source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.TraceID != null) {
            this.TraceID = new String(source.TraceID);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.ApplicationCount != null) {
            this.ApplicationCount = new Long(source.ApplicationCount);
        }
        if (source.ErrorSpans != null) {
            this.ErrorSpans = new ErrorSpan[source.ErrorSpans.length];
            for (int i = 0; i < source.ErrorSpans.length; i++) {
                this.ErrorSpans[i] = new ErrorSpan(source.ErrorSpans[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TraceID", this.TraceID);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "ApplicationCount", this.ApplicationCount);
        this.setParamArrayObj(map, prefix + "ErrorSpans.", this.ErrorSpans);

    }
}

