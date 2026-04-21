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

public class DescribeGeneralSpanListRequest extends AbstractModel {

    /**
    * <p>业务系统 ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Span 查询开始时间戳（单位：秒）</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>Span 查询结束时间戳（单位：秒）</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>通用过滤参数 支持的过滤key如service.name</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>排序<br>现支持的 Key 有：</p><ul><li>startTime(开始时间)</li><li>endTime(结束时间)</li><li>duration(响应时间)</li></ul><p>现支持的 Value 有：</p><ul><li>desc(降序排序)</li><li>asc(升序排序)</li></ul>
    */
    @SerializedName("OrderBy")
    @Expose
    private OrderBy OrderBy;

    /**
    * <p>业务自身服务名，控制台用户请填写taw</p>
    */
    @SerializedName("BusinessName")
    @Expose
    private String BusinessName;

    /**
    * <p>单页项目个数，默认为1000，合法取值范围为1～1000</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

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
     * Get <p>Span 查询开始时间戳（单位：秒）</p> 
     * @return StartTime <p>Span 查询开始时间戳（单位：秒）</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Span 查询开始时间戳（单位：秒）</p>
     * @param StartTime <p>Span 查询开始时间戳（单位：秒）</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>Span 查询结束时间戳（单位：秒）</p> 
     * @return EndTime <p>Span 查询结束时间戳（单位：秒）</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>Span 查询结束时间戳（单位：秒）</p>
     * @param EndTime <p>Span 查询结束时间戳（单位：秒）</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>通用过滤参数 支持的过滤key如service.name</p> 
     * @return Filters <p>通用过滤参数 支持的过滤key如service.name</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>通用过滤参数 支持的过滤key如service.name</p>
     * @param Filters <p>通用过滤参数 支持的过滤key如service.name</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
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
     * Get <p>业务自身服务名，控制台用户请填写taw</p> 
     * @return BusinessName <p>业务自身服务名，控制台用户请填写taw</p>
     */
    public String getBusinessName() {
        return this.BusinessName;
    }

    /**
     * Set <p>业务自身服务名，控制台用户请填写taw</p>
     * @param BusinessName <p>业务自身服务名，控制台用户请填写taw</p>
     */
    public void setBusinessName(String BusinessName) {
        this.BusinessName = BusinessName;
    }

    /**
     * Get <p>单页项目个数，默认为1000，合法取值范围为1～1000</p> 
     * @return Limit <p>单页项目个数，默认为1000，合法取值范围为1～1000</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>单页项目个数，默认为1000，合法取值范围为1～1000</p>
     * @param Limit <p>单页项目个数，默认为1000，合法取值范围为1～1000</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页</p> 
     * @return Offset <p>分页</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页</p>
     * @param Offset <p>分页</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeGeneralSpanListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGeneralSpanListRequest(DescribeGeneralSpanListRequest source) {
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
        if (source.OrderBy != null) {
            this.OrderBy = new OrderBy(source.OrderBy);
        }
        if (source.BusinessName != null) {
            this.BusinessName = new String(source.BusinessName);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamObj(map, prefix + "OrderBy.", this.OrderBy);
        this.setParamSimple(map, prefix + "BusinessName", this.BusinessName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

