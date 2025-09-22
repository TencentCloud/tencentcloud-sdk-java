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

public class DescribeApmServiceMetricRequest extends AbstractModel {

    /**
    * 业务系统ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 应用名
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 应用ID
    */
    @SerializedName("ServiceID")
    @Expose
    private String ServiceID;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 排序
    */
    @SerializedName("OrderBy")
    @Expose
    private OrderBy OrderBy;

    /**
    * 是否demo模式
    */
    @SerializedName("Demo")
    @Expose
    private Boolean Demo;

    /**
    * 应用状态筛选，可枚举的值为：health、warning、error。如果选中多个状态用逗号隔开，比如："warning,error"
    */
    @SerializedName("ServiceStatus")
    @Expose
    private String ServiceStatus;

    /**
    * 标签列表
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
    * 页码
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 过滤条件
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 业务系统ID 
     * @return InstanceId 业务系统ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 业务系统ID
     * @param InstanceId 业务系统ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 应用名 
     * @return ServiceName 应用名
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 应用名
     * @param ServiceName 应用名
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 应用ID 
     * @return ServiceID 应用ID
     */
    public String getServiceID() {
        return this.ServiceID;
    }

    /**
     * Set 应用ID
     * @param ServiceID 应用ID
     */
    public void setServiceID(String ServiceID) {
        this.ServiceID = ServiceID;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 排序 
     * @return OrderBy 排序
     */
    public OrderBy getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序
     * @param OrderBy 排序
     */
    public void setOrderBy(OrderBy OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 是否demo模式 
     * @return Demo 是否demo模式
     */
    public Boolean getDemo() {
        return this.Demo;
    }

    /**
     * Set 是否demo模式
     * @param Demo 是否demo模式
     */
    public void setDemo(Boolean Demo) {
        this.Demo = Demo;
    }

    /**
     * Get 应用状态筛选，可枚举的值为：health、warning、error。如果选中多个状态用逗号隔开，比如："warning,error" 
     * @return ServiceStatus 应用状态筛选，可枚举的值为：health、warning、error。如果选中多个状态用逗号隔开，比如："warning,error"
     */
    public String getServiceStatus() {
        return this.ServiceStatus;
    }

    /**
     * Set 应用状态筛选，可枚举的值为：health、warning、error。如果选中多个状态用逗号隔开，比如："warning,error"
     * @param ServiceStatus 应用状态筛选，可枚举的值为：health、warning、error。如果选中多个状态用逗号隔开，比如："warning,error"
     */
    public void setServiceStatus(String ServiceStatus) {
        this.ServiceStatus = ServiceStatus;
    }

    /**
     * Get 标签列表 
     * @return Tags 标签列表
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表
     * @param Tags 标签列表
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 页码 
     * @return Page 页码
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 页码
     * @param Page 页码
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 页大小 
     * @return PageSize 页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页大小
     * @param PageSize 页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
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

    public DescribeApmServiceMetricRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApmServiceMetricRequest(DescribeApmServiceMetricRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ServiceID != null) {
            this.ServiceID = new String(source.ServiceID);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new OrderBy(source.OrderBy);
        }
        if (source.Demo != null) {
            this.Demo = new Boolean(source.Demo);
        }
        if (source.ServiceStatus != null) {
            this.ServiceStatus = new String(source.ServiceStatus);
        }
        if (source.Tags != null) {
            this.Tags = new ApmTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ApmTag(source.Tags[i]);
            }
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ServiceID", this.ServiceID);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamObj(map, prefix + "OrderBy.", this.OrderBy);
        this.setParamSimple(map, prefix + "Demo", this.Demo);
        this.setParamSimple(map, prefix + "ServiceStatus", this.ServiceStatus);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

