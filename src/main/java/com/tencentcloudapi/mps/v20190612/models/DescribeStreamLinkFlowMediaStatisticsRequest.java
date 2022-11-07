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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStreamLinkFlowMediaStatisticsRequest extends AbstractModel{

    /**
    * 传输流ID。
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 输入或输出类型，可选[input|output]。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 输入或输出Id。
    */
    @SerializedName("InputOutputId")
    @Expose
    private String InputOutputId;

    /**
    * 主通道或备通道，可选[0|1]。
    */
    @SerializedName("Pipeline")
    @Expose
    private String Pipeline;

    /**
    * 查询间隔，可选[5s|1min|5min|15min]。
    */
    @SerializedName("Period")
    @Expose
    private String Period;

    /**
    * 统计的开始时间，默认为前一小时，最多支持查询近7天。
UTC时间，如'2020-01-01T12:00:00Z'。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 统计的结束时间，默认为StartTime后一小时，最多支持查询24小时的数据。
UTC时间，如'2020-01-01T12:00:00Z'。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 传输流ID。 
     * @return FlowId 传输流ID。
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 传输流ID。
     * @param FlowId 传输流ID。
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 输入或输出类型，可选[input|output]。 
     * @return Type 输入或输出类型，可选[input|output]。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 输入或输出类型，可选[input|output]。
     * @param Type 输入或输出类型，可选[input|output]。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 输入或输出Id。 
     * @return InputOutputId 输入或输出Id。
     */
    public String getInputOutputId() {
        return this.InputOutputId;
    }

    /**
     * Set 输入或输出Id。
     * @param InputOutputId 输入或输出Id。
     */
    public void setInputOutputId(String InputOutputId) {
        this.InputOutputId = InputOutputId;
    }

    /**
     * Get 主通道或备通道，可选[0|1]。 
     * @return Pipeline 主通道或备通道，可选[0|1]。
     */
    public String getPipeline() {
        return this.Pipeline;
    }

    /**
     * Set 主通道或备通道，可选[0|1]。
     * @param Pipeline 主通道或备通道，可选[0|1]。
     */
    public void setPipeline(String Pipeline) {
        this.Pipeline = Pipeline;
    }

    /**
     * Get 查询间隔，可选[5s|1min|5min|15min]。 
     * @return Period 查询间隔，可选[5s|1min|5min|15min]。
     */
    public String getPeriod() {
        return this.Period;
    }

    /**
     * Set 查询间隔，可选[5s|1min|5min|15min]。
     * @param Period 查询间隔，可选[5s|1min|5min|15min]。
     */
    public void setPeriod(String Period) {
        this.Period = Period;
    }

    /**
     * Get 统计的开始时间，默认为前一小时，最多支持查询近7天。
UTC时间，如'2020-01-01T12:00:00Z'。 
     * @return StartTime 统计的开始时间，默认为前一小时，最多支持查询近7天。
UTC时间，如'2020-01-01T12:00:00Z'。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 统计的开始时间，默认为前一小时，最多支持查询近7天。
UTC时间，如'2020-01-01T12:00:00Z'。
     * @param StartTime 统计的开始时间，默认为前一小时，最多支持查询近7天。
UTC时间，如'2020-01-01T12:00:00Z'。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 统计的结束时间，默认为StartTime后一小时，最多支持查询24小时的数据。
UTC时间，如'2020-01-01T12:00:00Z'。 
     * @return EndTime 统计的结束时间，默认为StartTime后一小时，最多支持查询24小时的数据。
UTC时间，如'2020-01-01T12:00:00Z'。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 统计的结束时间，默认为StartTime后一小时，最多支持查询24小时的数据。
UTC时间，如'2020-01-01T12:00:00Z'。
     * @param EndTime 统计的结束时间，默认为StartTime后一小时，最多支持查询24小时的数据。
UTC时间，如'2020-01-01T12:00:00Z'。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeStreamLinkFlowMediaStatisticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamLinkFlowMediaStatisticsRequest(DescribeStreamLinkFlowMediaStatisticsRequest source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.InputOutputId != null) {
            this.InputOutputId = new String(source.InputOutputId);
        }
        if (source.Pipeline != null) {
            this.Pipeline = new String(source.Pipeline);
        }
        if (source.Period != null) {
            this.Period = new String(source.Period);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "InputOutputId", this.InputOutputId);
        this.setParamSimple(map, prefix + "Pipeline", this.Pipeline);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

