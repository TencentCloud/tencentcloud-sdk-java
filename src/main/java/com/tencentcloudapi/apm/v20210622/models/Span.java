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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Span extends AbstractModel {

    /**
    * Trace ID
    */
    @SerializedName("TraceID")
    @Expose
    private String TraceID;

    /**
    * 日志
    */
    @SerializedName("Logs")
    @Expose
    private SpanLog [] Logs;

    /**
    * 标签
    */
    @SerializedName("Tags")
    @Expose
    private SpanTag [] Tags;

    /**
    * 上报应用服务信息
    */
    @SerializedName("Process")
    @Expose
    private SpanProcess Process;

    /**
    * 产生时间戳(毫秒)
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * Span 名称
    */
    @SerializedName("OperationName")
    @Expose
    private String OperationName;

    /**
    * 关联关系
    */
    @SerializedName("References")
    @Expose
    private SpanReference [] References;

    /**
    * 产生时间戳(微秒)
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 持续耗时(微妙)
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * Span ID
    */
    @SerializedName("SpanID")
    @Expose
    private String SpanID;

    /**
    * 产生时间戳(毫秒)
    */
    @SerializedName("StartTimeMillis")
    @Expose
    private Long StartTimeMillis;

    /**
    * Parent Span ID
    */
    @SerializedName("ParentSpanID")
    @Expose
    private String ParentSpanID;

    /**
     * Get Trace ID 
     * @return TraceID Trace ID
     */
    public String getTraceID() {
        return this.TraceID;
    }

    /**
     * Set Trace ID
     * @param TraceID Trace ID
     */
    public void setTraceID(String TraceID) {
        this.TraceID = TraceID;
    }

    /**
     * Get 日志 
     * @return Logs 日志
     */
    public SpanLog [] getLogs() {
        return this.Logs;
    }

    /**
     * Set 日志
     * @param Logs 日志
     */
    public void setLogs(SpanLog [] Logs) {
        this.Logs = Logs;
    }

    /**
     * Get 标签 
     * @return Tags 标签
     */
    public SpanTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
     * @param Tags 标签
     */
    public void setTags(SpanTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 上报应用服务信息 
     * @return Process 上报应用服务信息
     */
    public SpanProcess getProcess() {
        return this.Process;
    }

    /**
     * Set 上报应用服务信息
     * @param Process 上报应用服务信息
     */
    public void setProcess(SpanProcess Process) {
        this.Process = Process;
    }

    /**
     * Get 产生时间戳(毫秒) 
     * @return Timestamp 产生时间戳(毫秒)
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 产生时间戳(毫秒)
     * @param Timestamp 产生时间戳(毫秒)
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Span 名称 
     * @return OperationName Span 名称
     */
    public String getOperationName() {
        return this.OperationName;
    }

    /**
     * Set Span 名称
     * @param OperationName Span 名称
     */
    public void setOperationName(String OperationName) {
        this.OperationName = OperationName;
    }

    /**
     * Get 关联关系 
     * @return References 关联关系
     */
    public SpanReference [] getReferences() {
        return this.References;
    }

    /**
     * Set 关联关系
     * @param References 关联关系
     */
    public void setReferences(SpanReference [] References) {
        this.References = References;
    }

    /**
     * Get 产生时间戳(微秒) 
     * @return StartTime 产生时间戳(微秒)
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 产生时间戳(微秒)
     * @param StartTime 产生时间戳(微秒)
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 持续耗时(微妙) 
     * @return Duration 持续耗时(微妙)
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 持续耗时(微妙)
     * @param Duration 持续耗时(微妙)
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Span ID 
     * @return SpanID Span ID
     */
    public String getSpanID() {
        return this.SpanID;
    }

    /**
     * Set Span ID
     * @param SpanID Span ID
     */
    public void setSpanID(String SpanID) {
        this.SpanID = SpanID;
    }

    /**
     * Get 产生时间戳(毫秒) 
     * @return StartTimeMillis 产生时间戳(毫秒)
     */
    public Long getStartTimeMillis() {
        return this.StartTimeMillis;
    }

    /**
     * Set 产生时间戳(毫秒)
     * @param StartTimeMillis 产生时间戳(毫秒)
     */
    public void setStartTimeMillis(Long StartTimeMillis) {
        this.StartTimeMillis = StartTimeMillis;
    }

    /**
     * Get Parent Span ID 
     * @return ParentSpanID Parent Span ID
     */
    public String getParentSpanID() {
        return this.ParentSpanID;
    }

    /**
     * Set Parent Span ID
     * @param ParentSpanID Parent Span ID
     */
    public void setParentSpanID(String ParentSpanID) {
        this.ParentSpanID = ParentSpanID;
    }

    public Span() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Span(Span source) {
        if (source.TraceID != null) {
            this.TraceID = new String(source.TraceID);
        }
        if (source.Logs != null) {
            this.Logs = new SpanLog[source.Logs.length];
            for (int i = 0; i < source.Logs.length; i++) {
                this.Logs[i] = new SpanLog(source.Logs[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new SpanTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new SpanTag(source.Tags[i]);
            }
        }
        if (source.Process != null) {
            this.Process = new SpanProcess(source.Process);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.OperationName != null) {
            this.OperationName = new String(source.OperationName);
        }
        if (source.References != null) {
            this.References = new SpanReference[source.References.length];
            for (int i = 0; i < source.References.length; i++) {
                this.References[i] = new SpanReference(source.References[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.SpanID != null) {
            this.SpanID = new String(source.SpanID);
        }
        if (source.StartTimeMillis != null) {
            this.StartTimeMillis = new Long(source.StartTimeMillis);
        }
        if (source.ParentSpanID != null) {
            this.ParentSpanID = new String(source.ParentSpanID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TraceID", this.TraceID);
        this.setParamArrayObj(map, prefix + "Logs.", this.Logs);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "Process.", this.Process);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "OperationName", this.OperationName);
        this.setParamArrayObj(map, prefix + "References.", this.References);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "SpanID", this.SpanID);
        this.setParamSimple(map, prefix + "StartTimeMillis", this.StartTimeMillis);
        this.setParamSimple(map, prefix + "ParentSpanID", this.ParentSpanID);

    }
}

