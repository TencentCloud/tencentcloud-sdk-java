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

public class DescribeStreamLinkFlowLogsRequest extends AbstractModel{

    /**
    * 传输流Id。
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

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
    * 输入或输出类型，可选[input|output]。
    */
    @SerializedName("Type")
    @Expose
    private String [] Type;

    /**
    * 主通道或备通道，可选[0|1]。
    */
    @SerializedName("Pipeline")
    @Expose
    private String [] Pipeline;

    /**
    * 每页大小，默认100，范围为[1, 1000]。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 按Timestamp升序或降序排序，默认降序，可选[desc|asc]。
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
    * 页码，默认1，范围为[1, 1000]。
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
     * Get 传输流Id。 
     * @return FlowId 传输流Id。
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 传输流Id。
     * @param FlowId 传输流Id。
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
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

    /**
     * Get 输入或输出类型，可选[input|output]。 
     * @return Type 输入或输出类型，可选[input|output]。
     */
    public String [] getType() {
        return this.Type;
    }

    /**
     * Set 输入或输出类型，可选[input|output]。
     * @param Type 输入或输出类型，可选[input|output]。
     */
    public void setType(String [] Type) {
        this.Type = Type;
    }

    /**
     * Get 主通道或备通道，可选[0|1]。 
     * @return Pipeline 主通道或备通道，可选[0|1]。
     */
    public String [] getPipeline() {
        return this.Pipeline;
    }

    /**
     * Set 主通道或备通道，可选[0|1]。
     * @param Pipeline 主通道或备通道，可选[0|1]。
     */
    public void setPipeline(String [] Pipeline) {
        this.Pipeline = Pipeline;
    }

    /**
     * Get 每页大小，默认100，范围为[1, 1000]。 
     * @return PageSize 每页大小，默认100，范围为[1, 1000]。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页大小，默认100，范围为[1, 1000]。
     * @param PageSize 每页大小，默认100，范围为[1, 1000]。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 按Timestamp升序或降序排序，默认降序，可选[desc|asc]。 
     * @return SortType 按Timestamp升序或降序排序，默认降序，可选[desc|asc]。
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set 按Timestamp升序或降序排序，默认降序，可选[desc|asc]。
     * @param SortType 按Timestamp升序或降序排序，默认降序，可选[desc|asc]。
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    /**
     * Get 页码，默认1，范围为[1, 1000]。 
     * @return PageNum 页码，默认1，范围为[1, 1000]。
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 页码，默认1，范围为[1, 1000]。
     * @param PageNum 页码，默认1，范围为[1, 1000]。
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    public DescribeStreamLinkFlowLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamLinkFlowLogsRequest(DescribeStreamLinkFlowLogsRequest source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Type != null) {
            this.Type = new String[source.Type.length];
            for (int i = 0; i < source.Type.length; i++) {
                this.Type[i] = new String(source.Type[i]);
            }
        }
        if (source.Pipeline != null) {
            this.Pipeline = new String[source.Pipeline.length];
            for (int i = 0; i < source.Pipeline.length; i++) {
                this.Pipeline[i] = new String(source.Pipeline[i]);
            }
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "Type.", this.Type);
        this.setParamArraySimple(map, prefix + "Pipeline.", this.Pipeline);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);

    }
}

