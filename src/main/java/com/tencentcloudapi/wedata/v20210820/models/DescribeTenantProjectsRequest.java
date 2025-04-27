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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTenantProjectsRequest extends AbstractModel {

    /**
    * 第几页
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 一页几条
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 是否展示关联执行组的信息。正常应该不是从项目列表里获取
    */
    @SerializedName("DescribeExecutors")
    @Expose
    private Boolean DescribeExecutors;

    /**
    * 是否展示项目管理员信息，减少默认返回的请求内容
    */
    @SerializedName("DescribeAdminUsers")
    @Expose
    private Boolean DescribeAdminUsers;

    /**
    * 统计项目人员数量。数据地图需求
    */
    @SerializedName("DescribeMemberCount")
    @Expose
    private Boolean DescribeMemberCount;

    /**
    * 自定义条件查询
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 排序字段
    */
    @SerializedName("OrderFields")
    @Expose
    private OrderField [] OrderFields;

    /**
    * 默认不提供创建者信息，该参数与CAM交互比较耗时
    */
    @SerializedName("DescribeCreator")
    @Expose
    private Boolean DescribeCreator;

    /**
    * 是否展示关联资源池信息
    */
    @SerializedName("DescribeResourcePools")
    @Expose
    private Boolean DescribeResourcePools;

    /**
     * Get 第几页 
     * @return PageNumber 第几页
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 第几页
     * @param PageNumber 第几页
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 一页几条 
     * @return PageSize 一页几条
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 一页几条
     * @param PageSize 一页几条
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 是否展示关联执行组的信息。正常应该不是从项目列表里获取 
     * @return DescribeExecutors 是否展示关联执行组的信息。正常应该不是从项目列表里获取
     */
    public Boolean getDescribeExecutors() {
        return this.DescribeExecutors;
    }

    /**
     * Set 是否展示关联执行组的信息。正常应该不是从项目列表里获取
     * @param DescribeExecutors 是否展示关联执行组的信息。正常应该不是从项目列表里获取
     */
    public void setDescribeExecutors(Boolean DescribeExecutors) {
        this.DescribeExecutors = DescribeExecutors;
    }

    /**
     * Get 是否展示项目管理员信息，减少默认返回的请求内容 
     * @return DescribeAdminUsers 是否展示项目管理员信息，减少默认返回的请求内容
     */
    public Boolean getDescribeAdminUsers() {
        return this.DescribeAdminUsers;
    }

    /**
     * Set 是否展示项目管理员信息，减少默认返回的请求内容
     * @param DescribeAdminUsers 是否展示项目管理员信息，减少默认返回的请求内容
     */
    public void setDescribeAdminUsers(Boolean DescribeAdminUsers) {
        this.DescribeAdminUsers = DescribeAdminUsers;
    }

    /**
     * Get 统计项目人员数量。数据地图需求 
     * @return DescribeMemberCount 统计项目人员数量。数据地图需求
     */
    public Boolean getDescribeMemberCount() {
        return this.DescribeMemberCount;
    }

    /**
     * Set 统计项目人员数量。数据地图需求
     * @param DescribeMemberCount 统计项目人员数量。数据地图需求
     */
    public void setDescribeMemberCount(Boolean DescribeMemberCount) {
        this.DescribeMemberCount = DescribeMemberCount;
    }

    /**
     * Get 自定义条件查询 
     * @return Filters 自定义条件查询
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 自定义条件查询
     * @param Filters 自定义条件查询
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序字段 
     * @return OrderFields 排序字段
     */
    public OrderField [] getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set 排序字段
     * @param OrderFields 排序字段
     */
    public void setOrderFields(OrderField [] OrderFields) {
        this.OrderFields = OrderFields;
    }

    /**
     * Get 默认不提供创建者信息，该参数与CAM交互比较耗时 
     * @return DescribeCreator 默认不提供创建者信息，该参数与CAM交互比较耗时
     */
    public Boolean getDescribeCreator() {
        return this.DescribeCreator;
    }

    /**
     * Set 默认不提供创建者信息，该参数与CAM交互比较耗时
     * @param DescribeCreator 默认不提供创建者信息，该参数与CAM交互比较耗时
     */
    public void setDescribeCreator(Boolean DescribeCreator) {
        this.DescribeCreator = DescribeCreator;
    }

    /**
     * Get 是否展示关联资源池信息 
     * @return DescribeResourcePools 是否展示关联资源池信息
     */
    public Boolean getDescribeResourcePools() {
        return this.DescribeResourcePools;
    }

    /**
     * Set 是否展示关联资源池信息
     * @param DescribeResourcePools 是否展示关联资源池信息
     */
    public void setDescribeResourcePools(Boolean DescribeResourcePools) {
        this.DescribeResourcePools = DescribeResourcePools;
    }

    public DescribeTenantProjectsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTenantProjectsRequest(DescribeTenantProjectsRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.DescribeExecutors != null) {
            this.DescribeExecutors = new Boolean(source.DescribeExecutors);
        }
        if (source.DescribeAdminUsers != null) {
            this.DescribeAdminUsers = new Boolean(source.DescribeAdminUsers);
        }
        if (source.DescribeMemberCount != null) {
            this.DescribeMemberCount = new Boolean(source.DescribeMemberCount);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.OrderFields != null) {
            this.OrderFields = new OrderField[source.OrderFields.length];
            for (int i = 0; i < source.OrderFields.length; i++) {
                this.OrderFields[i] = new OrderField(source.OrderFields[i]);
            }
        }
        if (source.DescribeCreator != null) {
            this.DescribeCreator = new Boolean(source.DescribeCreator);
        }
        if (source.DescribeResourcePools != null) {
            this.DescribeResourcePools = new Boolean(source.DescribeResourcePools);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "DescribeExecutors", this.DescribeExecutors);
        this.setParamSimple(map, prefix + "DescribeAdminUsers", this.DescribeAdminUsers);
        this.setParamSimple(map, prefix + "DescribeMemberCount", this.DescribeMemberCount);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "OrderFields.", this.OrderFields);
        this.setParamSimple(map, prefix + "DescribeCreator", this.DescribeCreator);
        this.setParamSimple(map, prefix + "DescribeResourcePools", this.DescribeResourcePools);

    }
}

