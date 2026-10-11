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

public class SpanTreeView extends AbstractModel {

    /**
    * 树结构json串
    */
    @SerializedName("TreeData")
    @Expose
    private String TreeData;

    /**
    * 列表
    */
    @SerializedName("ChartData")
    @Expose
    private ChartData ChartData;

    /**
    * Trace概览信息
    */
    @SerializedName("TraceOverview")
    @Expose
    private TraceOverview TraceOverview;

    /**
    * 压缩编码后的树结构json串
    */
    @SerializedName("CompressedTreeData")
    @Expose
    private String CompressedTreeData;

    /**
    * 整条链路的 span 数量是否超过限制
    */
    @SerializedName("CntExceeded")
    @Expose
    private Boolean CntExceeded;

    /**
    * 是否有内部查询超时
    */
    @SerializedName("QueryTimeout")
    @Expose
    private Boolean QueryTimeout;

    /**
    * 链路中 span 总数量
    */
    @SerializedName("SpanTotalCnt")
    @Expose
    private Long SpanTotalCnt;

    /**
    * 过滤视图的标签值列表
    */
    @SerializedName("FilterViewTagValues")
    @Expose
    private TagValues [] FilterViewTagValues;

    /**
     * Get 树结构json串 
     * @return TreeData 树结构json串
     */
    public String getTreeData() {
        return this.TreeData;
    }

    /**
     * Set 树结构json串
     * @param TreeData 树结构json串
     */
    public void setTreeData(String TreeData) {
        this.TreeData = TreeData;
    }

    /**
     * Get 列表 
     * @return ChartData 列表
     */
    public ChartData getChartData() {
        return this.ChartData;
    }

    /**
     * Set 列表
     * @param ChartData 列表
     */
    public void setChartData(ChartData ChartData) {
        this.ChartData = ChartData;
    }

    /**
     * Get Trace概览信息 
     * @return TraceOverview Trace概览信息
     */
    public TraceOverview getTraceOverview() {
        return this.TraceOverview;
    }

    /**
     * Set Trace概览信息
     * @param TraceOverview Trace概览信息
     */
    public void setTraceOverview(TraceOverview TraceOverview) {
        this.TraceOverview = TraceOverview;
    }

    /**
     * Get 压缩编码后的树结构json串 
     * @return CompressedTreeData 压缩编码后的树结构json串
     */
    public String getCompressedTreeData() {
        return this.CompressedTreeData;
    }

    /**
     * Set 压缩编码后的树结构json串
     * @param CompressedTreeData 压缩编码后的树结构json串
     */
    public void setCompressedTreeData(String CompressedTreeData) {
        this.CompressedTreeData = CompressedTreeData;
    }

    /**
     * Get 整条链路的 span 数量是否超过限制 
     * @return CntExceeded 整条链路的 span 数量是否超过限制
     */
    public Boolean getCntExceeded() {
        return this.CntExceeded;
    }

    /**
     * Set 整条链路的 span 数量是否超过限制
     * @param CntExceeded 整条链路的 span 数量是否超过限制
     */
    public void setCntExceeded(Boolean CntExceeded) {
        this.CntExceeded = CntExceeded;
    }

    /**
     * Get 是否有内部查询超时 
     * @return QueryTimeout 是否有内部查询超时
     */
    public Boolean getQueryTimeout() {
        return this.QueryTimeout;
    }

    /**
     * Set 是否有内部查询超时
     * @param QueryTimeout 是否有内部查询超时
     */
    public void setQueryTimeout(Boolean QueryTimeout) {
        this.QueryTimeout = QueryTimeout;
    }

    /**
     * Get 链路中 span 总数量 
     * @return SpanTotalCnt 链路中 span 总数量
     */
    public Long getSpanTotalCnt() {
        return this.SpanTotalCnt;
    }

    /**
     * Set 链路中 span 总数量
     * @param SpanTotalCnt 链路中 span 总数量
     */
    public void setSpanTotalCnt(Long SpanTotalCnt) {
        this.SpanTotalCnt = SpanTotalCnt;
    }

    /**
     * Get 过滤视图的标签值列表 
     * @return FilterViewTagValues 过滤视图的标签值列表
     */
    public TagValues [] getFilterViewTagValues() {
        return this.FilterViewTagValues;
    }

    /**
     * Set 过滤视图的标签值列表
     * @param FilterViewTagValues 过滤视图的标签值列表
     */
    public void setFilterViewTagValues(TagValues [] FilterViewTagValues) {
        this.FilterViewTagValues = FilterViewTagValues;
    }

    public SpanTreeView() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpanTreeView(SpanTreeView source) {
        if (source.TreeData != null) {
            this.TreeData = new String(source.TreeData);
        }
        if (source.ChartData != null) {
            this.ChartData = new ChartData(source.ChartData);
        }
        if (source.TraceOverview != null) {
            this.TraceOverview = new TraceOverview(source.TraceOverview);
        }
        if (source.CompressedTreeData != null) {
            this.CompressedTreeData = new String(source.CompressedTreeData);
        }
        if (source.CntExceeded != null) {
            this.CntExceeded = new Boolean(source.CntExceeded);
        }
        if (source.QueryTimeout != null) {
            this.QueryTimeout = new Boolean(source.QueryTimeout);
        }
        if (source.SpanTotalCnt != null) {
            this.SpanTotalCnt = new Long(source.SpanTotalCnt);
        }
        if (source.FilterViewTagValues != null) {
            this.FilterViewTagValues = new TagValues[source.FilterViewTagValues.length];
            for (int i = 0; i < source.FilterViewTagValues.length; i++) {
                this.FilterViewTagValues[i] = new TagValues(source.FilterViewTagValues[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TreeData", this.TreeData);
        this.setParamObj(map, prefix + "ChartData.", this.ChartData);
        this.setParamObj(map, prefix + "TraceOverview.", this.TraceOverview);
        this.setParamSimple(map, prefix + "CompressedTreeData", this.CompressedTreeData);
        this.setParamSimple(map, prefix + "CntExceeded", this.CntExceeded);
        this.setParamSimple(map, prefix + "QueryTimeout", this.QueryTimeout);
        this.setParamSimple(map, prefix + "SpanTotalCnt", this.SpanTotalCnt);
        this.setParamArrayObj(map, prefix + "FilterViewTagValues.", this.FilterViewTagValues);

    }
}

