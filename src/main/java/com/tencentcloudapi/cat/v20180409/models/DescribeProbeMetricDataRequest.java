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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProbeMetricDataRequest extends AbstractModel{

    /**
    * 分析任务类型
    */
    @SerializedName("AnalyzeTaskType")
    @Expose
    private String AnalyzeTaskType;

    /**
    * 指标类型，counter 或者 gauge
    */
    @SerializedName("MetricType")
    @Expose
    private String MetricType;

    /**
    * 指标详细字段
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * 过滤条件
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
    * 聚合时间, 1m、1d、100d 等等
    */
    @SerializedName("GroupBy")
    @Expose
    private String GroupBy;

    /**
    * 过滤条件数组
    */
    @SerializedName("Filters")
    @Expose
    private String [] Filters;

    /**
     * Get 分析任务类型 
     * @return AnalyzeTaskType 分析任务类型
     */
    public String getAnalyzeTaskType() {
        return this.AnalyzeTaskType;
    }

    /**
     * Set 分析任务类型
     * @param AnalyzeTaskType 分析任务类型
     */
    public void setAnalyzeTaskType(String AnalyzeTaskType) {
        this.AnalyzeTaskType = AnalyzeTaskType;
    }

    /**
     * Get 指标类型，counter 或者 gauge 
     * @return MetricType 指标类型，counter 或者 gauge
     */
    public String getMetricType() {
        return this.MetricType;
    }

    /**
     * Set 指标类型，counter 或者 gauge
     * @param MetricType 指标类型，counter 或者 gauge
     */
    public void setMetricType(String MetricType) {
        this.MetricType = MetricType;
    }

    /**
     * Get 指标详细字段 
     * @return Field 指标详细字段
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set 指标详细字段
     * @param Field 指标详细字段
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get 过滤条件 
     * @return Filter 过滤条件
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set 过滤条件
     * @param Filter 过滤条件
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 聚合时间, 1m、1d、100d 等等 
     * @return GroupBy 聚合时间, 1m、1d、100d 等等
     */
    public String getGroupBy() {
        return this.GroupBy;
    }

    /**
     * Set 聚合时间, 1m、1d、100d 等等
     * @param GroupBy 聚合时间, 1m、1d、100d 等等
     */
    public void setGroupBy(String GroupBy) {
        this.GroupBy = GroupBy;
    }

    /**
     * Get 过滤条件数组 
     * @return Filters 过滤条件数组
     */
    public String [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件数组
     * @param Filters 过滤条件数组
     */
    public void setFilters(String [] Filters) {
        this.Filters = Filters;
    }

    public DescribeProbeMetricDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProbeMetricDataRequest(DescribeProbeMetricDataRequest source) {
        if (source.AnalyzeTaskType != null) {
            this.AnalyzeTaskType = new String(source.AnalyzeTaskType);
        }
        if (source.MetricType != null) {
            this.MetricType = new String(source.MetricType);
        }
        if (source.Field != null) {
            this.Field = new String(source.Field);
        }
        if (source.Filter != null) {
            this.Filter = new String(source.Filter);
        }
        if (source.GroupBy != null) {
            this.GroupBy = new String(source.GroupBy);
        }
        if (source.Filters != null) {
            this.Filters = new String[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new String(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AnalyzeTaskType", this.AnalyzeTaskType);
        this.setParamSimple(map, prefix + "MetricType", this.MetricType);
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamSimple(map, prefix + "Filter", this.Filter);
        this.setParamSimple(map, prefix + "GroupBy", this.GroupBy);
        this.setParamArraySimple(map, prefix + "Filters.", this.Filters);

    }
}

