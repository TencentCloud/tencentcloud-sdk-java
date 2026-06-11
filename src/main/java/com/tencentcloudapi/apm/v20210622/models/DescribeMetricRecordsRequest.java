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

public class DescribeMetricRecordsRequest extends AbstractModel {

    /**
    * <p>业务系统 ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>指标列表</p>
    */
    @SerializedName("Metrics")
    @Expose
    private QueryMetricItem [] Metrics;

    /**
    * <p>开始时间（单位为秒）</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>结束时间（单位为秒）</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>聚合维度</p>
    */
    @SerializedName("GroupBy")
    @Expose
    private String [] GroupBy;

    /**
    * <p>过滤条件</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>Or 过滤条件</p>
    */
    @SerializedName("OrFilters")
    @Expose
    private Filter [] OrFilters;

    /**
    * <p>排序<br>现支持的 Key 有：</p><ul><li>startTime(开始时间)</li><li>endTime(结束时间)</li><li>duration(响应时间)</li></ul><p>现支持的 Value 有：</p><ul><li>desc(降序排序)</li><li>asc(升序排序)</li></ul>
    */
    @SerializedName("OrderBy")
    @Expose
    private OrderBy OrderBy;

    /**
    * <p>业务名称，控制台用户请填写taw。</p>
    */
    @SerializedName("BusinessName")
    @Expose
    private String BusinessName;

    /**
    * <p>特殊处理查询结果</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>每页大小，默认为1000，合法取值范围为0~1000</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页起始点</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>页码</p>
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * <p>页长</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>应用Id</p>
    */
    @SerializedName("ServiceID")
    @Expose
    private String ServiceID;

    /**
     * Get <p>业务系统 ID</p> 
     * @return InstanceId <p>业务系统 ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>业务系统 ID</p>
     * @param InstanceId <p>业务系统 ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>指标列表</p> 
     * @return Metrics <p>指标列表</p>
     */
    public QueryMetricItem [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set <p>指标列表</p>
     * @param Metrics <p>指标列表</p>
     */
    public void setMetrics(QueryMetricItem [] Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get <p>开始时间（单位为秒）</p> 
     * @return StartTime <p>开始时间（单位为秒）</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间（单位为秒）</p>
     * @param StartTime <p>开始时间（单位为秒）</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间（单位为秒）</p> 
     * @return EndTime <p>结束时间（单位为秒）</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间（单位为秒）</p>
     * @param EndTime <p>结束时间（单位为秒）</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>聚合维度</p> 
     * @return GroupBy <p>聚合维度</p>
     */
    public String [] getGroupBy() {
        return this.GroupBy;
    }

    /**
     * Set <p>聚合维度</p>
     * @param GroupBy <p>聚合维度</p>
     */
    public void setGroupBy(String [] GroupBy) {
        this.GroupBy = GroupBy;
    }

    /**
     * Get <p>过滤条件</p> 
     * @return Filters <p>过滤条件</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件</p>
     * @param Filters <p>过滤条件</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Or 过滤条件</p> 
     * @return OrFilters <p>Or 过滤条件</p>
     */
    public Filter [] getOrFilters() {
        return this.OrFilters;
    }

    /**
     * Set <p>Or 过滤条件</p>
     * @param OrFilters <p>Or 过滤条件</p>
     */
    public void setOrFilters(Filter [] OrFilters) {
        this.OrFilters = OrFilters;
    }

    /**
     * Get <p>排序<br>现支持的 Key 有：</p><ul><li>startTime(开始时间)</li><li>endTime(结束时间)</li><li>duration(响应时间)</li></ul><p>现支持的 Value 有：</p><ul><li>desc(降序排序)</li><li>asc(升序排序)</li></ul> 
     * @return OrderBy <p>排序<br>现支持的 Key 有：</p><ul><li>startTime(开始时间)</li><li>endTime(结束时间)</li><li>duration(响应时间)</li></ul><p>现支持的 Value 有：</p><ul><li>desc(降序排序)</li><li>asc(升序排序)</li></ul>
     */
    public OrderBy getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>排序<br>现支持的 Key 有：</p><ul><li>startTime(开始时间)</li><li>endTime(结束时间)</li><li>duration(响应时间)</li></ul><p>现支持的 Value 有：</p><ul><li>desc(降序排序)</li><li>asc(升序排序)</li></ul>
     * @param OrderBy <p>排序<br>现支持的 Key 有：</p><ul><li>startTime(开始时间)</li><li>endTime(结束时间)</li><li>duration(响应时间)</li></ul><p>现支持的 Value 有：</p><ul><li>desc(降序排序)</li><li>asc(升序排序)</li></ul>
     */
    public void setOrderBy(OrderBy OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>业务名称，控制台用户请填写taw。</p> 
     * @return BusinessName <p>业务名称，控制台用户请填写taw。</p>
     */
    public String getBusinessName() {
        return this.BusinessName;
    }

    /**
     * Set <p>业务名称，控制台用户请填写taw。</p>
     * @param BusinessName <p>业务名称，控制台用户请填写taw。</p>
     */
    public void setBusinessName(String BusinessName) {
        this.BusinessName = BusinessName;
    }

    /**
     * Get <p>特殊处理查询结果</p> 
     * @return Type <p>特殊处理查询结果</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>特殊处理查询结果</p>
     * @param Type <p>特殊处理查询结果</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>每页大小，默认为1000，合法取值范围为0~1000</p> 
     * @return Limit <p>每页大小，默认为1000，合法取值范围为0~1000</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页大小，默认为1000，合法取值范围为0~1000</p>
     * @param Limit <p>每页大小，默认为1000，合法取值范围为0~1000</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页起始点</p> 
     * @return Offset <p>分页起始点</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页起始点</p>
     * @param Offset <p>分页起始点</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>页码</p> 
     * @return PageIndex <p>页码</p>
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set <p>页码</p>
     * @param PageIndex <p>页码</p>
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get <p>页长</p> 
     * @return PageSize <p>页长</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>页长</p>
     * @param PageSize <p>页长</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>应用Id</p> 
     * @return ServiceID <p>应用Id</p>
     */
    public String getServiceID() {
        return this.ServiceID;
    }

    /**
     * Set <p>应用Id</p>
     * @param ServiceID <p>应用Id</p>
     */
    public void setServiceID(String ServiceID) {
        this.ServiceID = ServiceID;
    }

    public DescribeMetricRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMetricRecordsRequest(DescribeMetricRecordsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Metrics != null) {
            this.Metrics = new QueryMetricItem[source.Metrics.length];
            for (int i = 0; i < source.Metrics.length; i++) {
                this.Metrics[i] = new QueryMetricItem(source.Metrics[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.GroupBy != null) {
            this.GroupBy = new String[source.GroupBy.length];
            for (int i = 0; i < source.GroupBy.length; i++) {
                this.GroupBy[i] = new String(source.GroupBy[i]);
            }
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
        if (source.ServiceID != null) {
            this.ServiceID = new String(source.ServiceID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Metrics.", this.Metrics);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "GroupBy.", this.GroupBy);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "OrFilters.", this.OrFilters);
        this.setParamObj(map, prefix + "OrderBy.", this.OrderBy);
        this.setParamSimple(map, prefix + "BusinessName", this.BusinessName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ServiceID", this.ServiceID);

    }
}

