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

public class DescribeMetricRecordsRequest extends AbstractModel {

    /**
    * 指标列表
    */
    @SerializedName("Metrics")
    @Expose
    private QueryMetricItem [] Metrics;

    /**
    * 业务系统 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 开始时间（单位为秒）
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间（单位为秒）
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 过滤条件
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Or 过滤条件
    */
    @SerializedName("OrFilters")
    @Expose
    private Filter [] OrFilters;

    /**
    * 聚合维度
    */
    @SerializedName("GroupBy")
    @Expose
    private String [] GroupBy;

    /**
    * 排序
现支持的 Key 有：

- startTime(开始时间)
- endTime(结束时间)
- duration(响应时间)

现支持的 Value 有：

- desc(降序排序)
- asc(升序排序)
    */
    @SerializedName("OrderBy")
    @Expose
    private OrderBy OrderBy;

    /**
    * 业务名称，控制台用户请填写taw。
    */
    @SerializedName("BusinessName")
    @Expose
    private String BusinessName;

    /**
    * 特殊处理查询结果
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 每页大小，默认为1000，合法取值范围为0~1000
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页起始点
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 页码
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * 页长
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 指标列表 
     * @return Metrics 指标列表
     */
    public QueryMetricItem [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set 指标列表
     * @param Metrics 指标列表
     */
    public void setMetrics(QueryMetricItem [] Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get 业务系统 ID 
     * @return InstanceId 业务系统 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 业务系统 ID
     * @param InstanceId 业务系统 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 开始时间（单位为秒） 
     * @return StartTime 开始时间（单位为秒）
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间（单位为秒）
     * @param StartTime 开始时间（单位为秒）
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间（单位为秒） 
     * @return EndTime 结束时间（单位为秒）
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间（单位为秒）
     * @param EndTime 结束时间（单位为秒）
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 过滤条件 
     * @return Filters 过滤条件
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件
     * @param Filters 过滤条件
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Or 过滤条件 
     * @return OrFilters Or 过滤条件
     */
    public Filter [] getOrFilters() {
        return this.OrFilters;
    }

    /**
     * Set Or 过滤条件
     * @param OrFilters Or 过滤条件
     */
    public void setOrFilters(Filter [] OrFilters) {
        this.OrFilters = OrFilters;
    }

    /**
     * Get 聚合维度 
     * @return GroupBy 聚合维度
     */
    public String [] getGroupBy() {
        return this.GroupBy;
    }

    /**
     * Set 聚合维度
     * @param GroupBy 聚合维度
     */
    public void setGroupBy(String [] GroupBy) {
        this.GroupBy = GroupBy;
    }

    /**
     * Get 排序
现支持的 Key 有：

- startTime(开始时间)
- endTime(结束时间)
- duration(响应时间)

现支持的 Value 有：

- desc(降序排序)
- asc(升序排序) 
     * @return OrderBy 排序
现支持的 Key 有：

- startTime(开始时间)
- endTime(结束时间)
- duration(响应时间)

现支持的 Value 有：

- desc(降序排序)
- asc(升序排序)
     */
    public OrderBy getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序
现支持的 Key 有：

- startTime(开始时间)
- endTime(结束时间)
- duration(响应时间)

现支持的 Value 有：

- desc(降序排序)
- asc(升序排序)
     * @param OrderBy 排序
现支持的 Key 有：

- startTime(开始时间)
- endTime(结束时间)
- duration(响应时间)

现支持的 Value 有：

- desc(降序排序)
- asc(升序排序)
     */
    public void setOrderBy(OrderBy OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 业务名称，控制台用户请填写taw。 
     * @return BusinessName 业务名称，控制台用户请填写taw。
     */
    public String getBusinessName() {
        return this.BusinessName;
    }

    /**
     * Set 业务名称，控制台用户请填写taw。
     * @param BusinessName 业务名称，控制台用户请填写taw。
     */
    public void setBusinessName(String BusinessName) {
        this.BusinessName = BusinessName;
    }

    /**
     * Get 特殊处理查询结果 
     * @return Type 特殊处理查询结果
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 特殊处理查询结果
     * @param Type 特殊处理查询结果
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 每页大小，默认为1000，合法取值范围为0~1000 
     * @return Limit 每页大小，默认为1000，合法取值范围为0~1000
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页大小，默认为1000，合法取值范围为0~1000
     * @param Limit 每页大小，默认为1000，合法取值范围为0~1000
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页起始点 
     * @return Offset 分页起始点
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页起始点
     * @param Offset 分页起始点
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 页码 
     * @return PageIndex 页码
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set 页码
     * @param PageIndex 页码
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get 页长 
     * @return PageSize 页长
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页长
     * @param PageSize 页长
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeMetricRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMetricRecordsRequest(DescribeMetricRecordsRequest source) {
        if (source.Metrics != null) {
            this.Metrics = new QueryMetricItem[source.Metrics.length];
            for (int i = 0; i < source.Metrics.length; i++) {
                this.Metrics[i] = new QueryMetricItem(source.Metrics[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.OrFilters != null) {
            this.OrFilters = new Filter[source.OrFilters.length];
            for (int i = 0; i < source.OrFilters.length; i++) {
                this.OrFilters[i] = new Filter(source.OrFilters[i]);
            }
        }
        if (source.GroupBy != null) {
            this.GroupBy = new String[source.GroupBy.length];
            for (int i = 0; i < source.GroupBy.length; i++) {
                this.GroupBy[i] = new String(source.GroupBy[i]);
            }
        }
        if (source.OrderBy != null) {
            this.OrderBy = new OrderBy(source.OrderBy);
        }
        if (source.BusinessName != null) {
            this.BusinessName = new String(source.BusinessName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Metrics.", this.Metrics);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "OrFilters.", this.OrFilters);
        this.setParamArraySimple(map, prefix + "GroupBy.", this.GroupBy);
        this.setParamObj(map, prefix + "OrderBy.", this.OrderBy);
        this.setParamSimple(map, prefix + "BusinessName", this.BusinessName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

