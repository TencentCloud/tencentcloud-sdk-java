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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInvocationMetricDataDimensionRequest extends AbstractModel{

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 开始index
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页大小
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 聚合维度
    */
    @SerializedName("DimensionName")
    @Expose
    private String DimensionName;

    /**
    * 搜索关键字
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 维度
    */
    @SerializedName("MetricDimensionValues")
    @Expose
    private MetricDimensionValue [] MetricDimensionValues;

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
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 开始index 
     * @return Offset 开始index
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 开始index
     * @param Offset 开始index
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页大小 
     * @return Limit 分页大小
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页大小
     * @param Limit 分页大小
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 聚合维度 
     * @return DimensionName 聚合维度
     */
    public String getDimensionName() {
        return this.DimensionName;
    }

    /**
     * Set 聚合维度
     * @param DimensionName 聚合维度
     */
    public void setDimensionName(String DimensionName) {
        this.DimensionName = DimensionName;
    }

    /**
     * Get 搜索关键字 
     * @return SearchWord 搜索关键字
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 搜索关键字
     * @param SearchWord 搜索关键字
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get 维度 
     * @return MetricDimensionValues 维度
     */
    public MetricDimensionValue [] getMetricDimensionValues() {
        return this.MetricDimensionValues;
    }

    /**
     * Set 维度
     * @param MetricDimensionValues 维度
     */
    public void setMetricDimensionValues(MetricDimensionValue [] MetricDimensionValues) {
        this.MetricDimensionValues = MetricDimensionValues;
    }

    public DescribeInvocationMetricDataDimensionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInvocationMetricDataDimensionRequest(DescribeInvocationMetricDataDimensionRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.DimensionName != null) {
            this.DimensionName = new String(source.DimensionName);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.MetricDimensionValues != null) {
            this.MetricDimensionValues = new MetricDimensionValue[source.MetricDimensionValues.length];
            for (int i = 0; i < source.MetricDimensionValues.length; i++) {
                this.MetricDimensionValues[i] = new MetricDimensionValue(source.MetricDimensionValues[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "DimensionName", this.DimensionName);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamArrayObj(map, prefix + "MetricDimensionValues.", this.MetricDimensionValues);

    }
}

