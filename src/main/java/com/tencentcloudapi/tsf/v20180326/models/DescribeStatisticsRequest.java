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

public class DescribeStatisticsRequest extends AbstractModel{

    /**
    * 类型：Interface、Service、Group、Instance、SQL、NoSQL
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 步长，单位s：60、3600、86400
    */
    @SerializedName("TimeStep")
    @Expose
    private Long TimeStep;

    /**
    * 偏移量，取值范围大于等于0，默认值为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 单页请求配置数量，取值范围[1, 50]，默认值为10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 命名空间Id
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 排序字段:AvgTimeConsuming[默认]、RequestCount、ErrorRate。实例监控还支持 CpuPercent
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序方式：ASC:0、DESC:1
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * 开始时间：年月日 时分秒2020-05-12 14:43:12
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 开始时间：年月日 时分秒2020-05-12 14:43:12
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 服务名称
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 搜索关键词
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
    * 聚合关键词
    */
    @SerializedName("BucketKey")
    @Expose
    private String BucketKey;

    /**
    * 数据库
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
     * Get 类型：Interface、Service、Group、Instance、SQL、NoSQL 
     * @return Type 类型：Interface、Service、Group、Instance、SQL、NoSQL
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型：Interface、Service、Group、Instance、SQL、NoSQL
     * @param Type 类型：Interface、Service、Group、Instance、SQL、NoSQL
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 步长，单位s：60、3600、86400 
     * @return TimeStep 步长，单位s：60、3600、86400
     */
    public Long getTimeStep() {
        return this.TimeStep;
    }

    /**
     * Set 步长，单位s：60、3600、86400
     * @param TimeStep 步长，单位s：60、3600、86400
     */
    public void setTimeStep(Long TimeStep) {
        this.TimeStep = TimeStep;
    }

    /**
     * Get 偏移量，取值范围大于等于0，默认值为0 
     * @return Offset 偏移量，取值范围大于等于0，默认值为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，取值范围大于等于0，默认值为0
     * @param Offset 偏移量，取值范围大于等于0，默认值为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 单页请求配置数量，取值范围[1, 50]，默认值为10 
     * @return Limit 单页请求配置数量，取值范围[1, 50]，默认值为10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单页请求配置数量，取值范围[1, 50]，默认值为10
     * @param Limit 单页请求配置数量，取值范围[1, 50]，默认值为10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 命名空间Id 
     * @return NamespaceId 命名空间Id
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间Id
     * @param NamespaceId 命名空间Id
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 排序字段:AvgTimeConsuming[默认]、RequestCount、ErrorRate。实例监控还支持 CpuPercent 
     * @return OrderBy 排序字段:AvgTimeConsuming[默认]、RequestCount、ErrorRate。实例监控还支持 CpuPercent
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段:AvgTimeConsuming[默认]、RequestCount、ErrorRate。实例监控还支持 CpuPercent
     * @param OrderBy 排序字段:AvgTimeConsuming[默认]、RequestCount、ErrorRate。实例监控还支持 CpuPercent
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序方式：ASC:0、DESC:1 
     * @return OrderType 排序方式：ASC:0、DESC:1
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 排序方式：ASC:0、DESC:1
     * @param OrderType 排序方式：ASC:0、DESC:1
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 开始时间：年月日 时分秒2020-05-12 14:43:12 
     * @return EndTime 开始时间：年月日 时分秒2020-05-12 14:43:12
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 开始时间：年月日 时分秒2020-05-12 14:43:12
     * @param EndTime 开始时间：年月日 时分秒2020-05-12 14:43:12
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 开始时间：年月日 时分秒2020-05-12 14:43:12 
     * @return StartTime 开始时间：年月日 时分秒2020-05-12 14:43:12
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间：年月日 时分秒2020-05-12 14:43:12
     * @param StartTime 开始时间：年月日 时分秒2020-05-12 14:43:12
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 服务名称 
     * @return ServiceName 服务名称
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 服务名称
     * @param ServiceName 服务名称
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 搜索关键词 
     * @return SearchWord 搜索关键词
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 搜索关键词
     * @param SearchWord 搜索关键词
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

    /**
     * Get 聚合关键词 
     * @return BucketKey 聚合关键词
     */
    public String getBucketKey() {
        return this.BucketKey;
    }

    /**
     * Set 聚合关键词
     * @param BucketKey 聚合关键词
     */
    public void setBucketKey(String BucketKey) {
        this.BucketKey = BucketKey;
    }

    /**
     * Get 数据库 
     * @return DbName 数据库
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 数据库
     * @param DbName 数据库
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    public DescribeStatisticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStatisticsRequest(DescribeStatisticsRequest source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TimeStep != null) {
            this.TimeStep = new Long(source.TimeStep);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
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
        if (source.BucketKey != null) {
            this.BucketKey = new String(source.BucketKey);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TimeStep", this.TimeStep);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamArrayObj(map, prefix + "MetricDimensionValues.", this.MetricDimensionValues);
        this.setParamSimple(map, prefix + "BucketKey", this.BucketKey);
        this.setParamSimple(map, prefix + "DbName", this.DbName);

    }
}

