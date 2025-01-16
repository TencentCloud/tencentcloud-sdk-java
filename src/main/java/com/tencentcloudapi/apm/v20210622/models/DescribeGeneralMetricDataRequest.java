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

public class DescribeGeneralMetricDataRequest extends AbstractModel {

    /**
    * 需要查询的指标名称，不可自定义输入，[详情请见。](https://cloud.tencent.com/document/product/248/101681)
    */
    @SerializedName("Metrics")
    @Expose
    private String [] Metrics;

    /**
    * 业务系统 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 视图名称，不可自定义输入。[详情请见。](https://cloud.tencent.com/document/product/248/101681)
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * 要过滤的维度信息，不同视图有对应的指标维度，[详情请见。](https://cloud.tencent.com/document/product/248/101681)
    */
    @SerializedName("Filters")
    @Expose
    private GeneralFilter [] Filters;

    /**
    * 聚合维度，不同视图有对应的指标维度，[详情请见。](https://cloud.tencent.com/document/product/248/101681)
    */
    @SerializedName("GroupBy")
    @Expose
    private String [] GroupBy;

    /**
    * 起始时间的时间戳，支持查询30天内的指标数据。（单位：秒）
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间的时间戳，支持查询30天内的指标数据。（单位：秒）
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 是否按固定时间跨度聚合，填入1及大于1的值按1处理，不填按0处理。
- 填入0，则计算开始时间到截止时间的指标数据。
- 填入1，则会按照开始时间到截止时间的时间跨度选择聚合粒度：
 - 时间跨度 (0,12) 小时，则按一分钟粒度聚合。
 - 时间跨度 [12,48] 小时，则按五分钟粒度聚合。
 - 时间跨度 (48, +∞) 小时，则按一小时粒度聚合。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 对查询指标进行排序：
Key 填写云 API 指标名称，[详情请见。](https://cloud.tencent.com/document/product/248/101681)
Value 填写排序方式：     
- asc：对查询指标进行升序排序
- desc：对查询指标进行降序排序
    */
    @SerializedName("OrderBy")
    @Expose
    private OrderBy OrderBy;

    /**
    * 查询指标的限制条数，目前最多展示50条数据，PageSize取值为1-50，上送PageSize则根据PageSize的值展示限制条数。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 需要查询的指标名称，不可自定义输入，[详情请见。](https://cloud.tencent.com/document/product/248/101681) 
     * @return Metrics 需要查询的指标名称，不可自定义输入，[详情请见。](https://cloud.tencent.com/document/product/248/101681)
     */
    public String [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set 需要查询的指标名称，不可自定义输入，[详情请见。](https://cloud.tencent.com/document/product/248/101681)
     * @param Metrics 需要查询的指标名称，不可自定义输入，[详情请见。](https://cloud.tencent.com/document/product/248/101681)
     */
    public void setMetrics(String [] Metrics) {
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
     * Get 视图名称，不可自定义输入。[详情请见。](https://cloud.tencent.com/document/product/248/101681) 
     * @return ViewName 视图名称，不可自定义输入。[详情请见。](https://cloud.tencent.com/document/product/248/101681)
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set 视图名称，不可自定义输入。[详情请见。](https://cloud.tencent.com/document/product/248/101681)
     * @param ViewName 视图名称，不可自定义输入。[详情请见。](https://cloud.tencent.com/document/product/248/101681)
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get 要过滤的维度信息，不同视图有对应的指标维度，[详情请见。](https://cloud.tencent.com/document/product/248/101681) 
     * @return Filters 要过滤的维度信息，不同视图有对应的指标维度，[详情请见。](https://cloud.tencent.com/document/product/248/101681)
     */
    public GeneralFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 要过滤的维度信息，不同视图有对应的指标维度，[详情请见。](https://cloud.tencent.com/document/product/248/101681)
     * @param Filters 要过滤的维度信息，不同视图有对应的指标维度，[详情请见。](https://cloud.tencent.com/document/product/248/101681)
     */
    public void setFilters(GeneralFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 聚合维度，不同视图有对应的指标维度，[详情请见。](https://cloud.tencent.com/document/product/248/101681) 
     * @return GroupBy 聚合维度，不同视图有对应的指标维度，[详情请见。](https://cloud.tencent.com/document/product/248/101681)
     */
    public String [] getGroupBy() {
        return this.GroupBy;
    }

    /**
     * Set 聚合维度，不同视图有对应的指标维度，[详情请见。](https://cloud.tencent.com/document/product/248/101681)
     * @param GroupBy 聚合维度，不同视图有对应的指标维度，[详情请见。](https://cloud.tencent.com/document/product/248/101681)
     */
    public void setGroupBy(String [] GroupBy) {
        this.GroupBy = GroupBy;
    }

    /**
     * Get 起始时间的时间戳，支持查询30天内的指标数据。（单位：秒） 
     * @return StartTime 起始时间的时间戳，支持查询30天内的指标数据。（单位：秒）
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间的时间戳，支持查询30天内的指标数据。（单位：秒）
     * @param StartTime 起始时间的时间戳，支持查询30天内的指标数据。（单位：秒）
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间的时间戳，支持查询30天内的指标数据。（单位：秒） 
     * @return EndTime 结束时间的时间戳，支持查询30天内的指标数据。（单位：秒）
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间的时间戳，支持查询30天内的指标数据。（单位：秒）
     * @param EndTime 结束时间的时间戳，支持查询30天内的指标数据。（单位：秒）
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 是否按固定时间跨度聚合，填入1及大于1的值按1处理，不填按0处理。
- 填入0，则计算开始时间到截止时间的指标数据。
- 填入1，则会按照开始时间到截止时间的时间跨度选择聚合粒度：
 - 时间跨度 (0,12) 小时，则按一分钟粒度聚合。
 - 时间跨度 [12,48] 小时，则按五分钟粒度聚合。
 - 时间跨度 (48, +∞) 小时，则按一小时粒度聚合。 
     * @return Period 是否按固定时间跨度聚合，填入1及大于1的值按1处理，不填按0处理。
- 填入0，则计算开始时间到截止时间的指标数据。
- 填入1，则会按照开始时间到截止时间的时间跨度选择聚合粒度：
 - 时间跨度 (0,12) 小时，则按一分钟粒度聚合。
 - 时间跨度 [12,48] 小时，则按五分钟粒度聚合。
 - 时间跨度 (48, +∞) 小时，则按一小时粒度聚合。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 是否按固定时间跨度聚合，填入1及大于1的值按1处理，不填按0处理。
- 填入0，则计算开始时间到截止时间的指标数据。
- 填入1，则会按照开始时间到截止时间的时间跨度选择聚合粒度：
 - 时间跨度 (0,12) 小时，则按一分钟粒度聚合。
 - 时间跨度 [12,48] 小时，则按五分钟粒度聚合。
 - 时间跨度 (48, +∞) 小时，则按一小时粒度聚合。
     * @param Period 是否按固定时间跨度聚合，填入1及大于1的值按1处理，不填按0处理。
- 填入0，则计算开始时间到截止时间的指标数据。
- 填入1，则会按照开始时间到截止时间的时间跨度选择聚合粒度：
 - 时间跨度 (0,12) 小时，则按一分钟粒度聚合。
 - 时间跨度 [12,48] 小时，则按五分钟粒度聚合。
 - 时间跨度 (48, +∞) 小时，则按一小时粒度聚合。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 对查询指标进行排序：
Key 填写云 API 指标名称，[详情请见。](https://cloud.tencent.com/document/product/248/101681)
Value 填写排序方式：     
- asc：对查询指标进行升序排序
- desc：对查询指标进行降序排序 
     * @return OrderBy 对查询指标进行排序：
Key 填写云 API 指标名称，[详情请见。](https://cloud.tencent.com/document/product/248/101681)
Value 填写排序方式：     
- asc：对查询指标进行升序排序
- desc：对查询指标进行降序排序
     */
    public OrderBy getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 对查询指标进行排序：
Key 填写云 API 指标名称，[详情请见。](https://cloud.tencent.com/document/product/248/101681)
Value 填写排序方式：     
- asc：对查询指标进行升序排序
- desc：对查询指标进行降序排序
     * @param OrderBy 对查询指标进行排序：
Key 填写云 API 指标名称，[详情请见。](https://cloud.tencent.com/document/product/248/101681)
Value 填写排序方式：     
- asc：对查询指标进行升序排序
- desc：对查询指标进行降序排序
     */
    public void setOrderBy(OrderBy OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 查询指标的限制条数，目前最多展示50条数据，PageSize取值为1-50，上送PageSize则根据PageSize的值展示限制条数。 
     * @return PageSize 查询指标的限制条数，目前最多展示50条数据，PageSize取值为1-50，上送PageSize则根据PageSize的值展示限制条数。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 查询指标的限制条数，目前最多展示50条数据，PageSize取值为1-50，上送PageSize则根据PageSize的值展示限制条数。
     * @param PageSize 查询指标的限制条数，目前最多展示50条数据，PageSize取值为1-50，上送PageSize则根据PageSize的值展示限制条数。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeGeneralMetricDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGeneralMetricDataRequest(DescribeGeneralMetricDataRequest source) {
        if (source.Metrics != null) {
            this.Metrics = new String[source.Metrics.length];
            for (int i = 0; i < source.Metrics.length; i++) {
                this.Metrics[i] = new String(source.Metrics[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ViewName != null) {
            this.ViewName = new String(source.ViewName);
        }
        if (source.Filters != null) {
            this.Filters = new GeneralFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new GeneralFilter(source.Filters[i]);
            }
        }
        if (source.GroupBy != null) {
            this.GroupBy = new String[source.GroupBy.length];
            for (int i = 0; i < source.GroupBy.length; i++) {
                this.GroupBy[i] = new String(source.GroupBy[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new OrderBy(source.OrderBy);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Metrics.", this.Metrics);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "GroupBy.", this.GroupBy);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamObj(map, prefix + "OrderBy.", this.OrderBy);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

