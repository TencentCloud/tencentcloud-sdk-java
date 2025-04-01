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

public class DescribeRoleListRequest extends AbstractModel {

    /**
    * 返回所有角色。
    */
    @SerializedName("ShowAllRoles")
    @Expose
    private Boolean ShowAllRoles;

    /**
    * 需要返回的角色类型(system,tenant,project)
    */
    @SerializedName("IncludeRoleTypes")
    @Expose
    private String [] IncludeRoleTypes;

    /**
    * 返回角色绑定人员统计，仅私有化版本支持
    */
    @SerializedName("DescribeMemberCount")
    @Expose
    private Boolean DescribeMemberCount;

    /**
    * 返回操作者信息，私有化多租户版本
    */
    @SerializedName("DescribeOperator")
    @Expose
    private Boolean DescribeOperator;

    /**
    * 系统角色
    */
    @SerializedName("DescribeSystemRoleOnly")
    @Expose
    private Boolean DescribeSystemRoleOnly;

    /**
    * 自定义角色
    */
    @SerializedName("DescribeCustomRoleOnly")
    @Expose
    private Boolean DescribeCustomRoleOnly;

    /**
    * 查看权限
    */
    @SerializedName("DescribePrivileges")
    @Expose
    private Boolean DescribePrivileges;

    /**
    * 筛选角色id
    */
    @SerializedName("RoleIds")
    @Expose
    private String [] RoleIds;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 页码
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 分页信息
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 查询字段
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 排序字段
    */
    @SerializedName("OrderFields")
    @Expose
    private OrderFields [] OrderFields;

    /**
     * Get 返回所有角色。 
     * @return ShowAllRoles 返回所有角色。
     */
    public Boolean getShowAllRoles() {
        return this.ShowAllRoles;
    }

    /**
     * Set 返回所有角色。
     * @param ShowAllRoles 返回所有角色。
     */
    public void setShowAllRoles(Boolean ShowAllRoles) {
        this.ShowAllRoles = ShowAllRoles;
    }

    /**
     * Get 需要返回的角色类型(system,tenant,project) 
     * @return IncludeRoleTypes 需要返回的角色类型(system,tenant,project)
     */
    public String [] getIncludeRoleTypes() {
        return this.IncludeRoleTypes;
    }

    /**
     * Set 需要返回的角色类型(system,tenant,project)
     * @param IncludeRoleTypes 需要返回的角色类型(system,tenant,project)
     */
    public void setIncludeRoleTypes(String [] IncludeRoleTypes) {
        this.IncludeRoleTypes = IncludeRoleTypes;
    }

    /**
     * Get 返回角色绑定人员统计，仅私有化版本支持 
     * @return DescribeMemberCount 返回角色绑定人员统计，仅私有化版本支持
     */
    public Boolean getDescribeMemberCount() {
        return this.DescribeMemberCount;
    }

    /**
     * Set 返回角色绑定人员统计，仅私有化版本支持
     * @param DescribeMemberCount 返回角色绑定人员统计，仅私有化版本支持
     */
    public void setDescribeMemberCount(Boolean DescribeMemberCount) {
        this.DescribeMemberCount = DescribeMemberCount;
    }

    /**
     * Get 返回操作者信息，私有化多租户版本 
     * @return DescribeOperator 返回操作者信息，私有化多租户版本
     */
    public Boolean getDescribeOperator() {
        return this.DescribeOperator;
    }

    /**
     * Set 返回操作者信息，私有化多租户版本
     * @param DescribeOperator 返回操作者信息，私有化多租户版本
     */
    public void setDescribeOperator(Boolean DescribeOperator) {
        this.DescribeOperator = DescribeOperator;
    }

    /**
     * Get 系统角色 
     * @return DescribeSystemRoleOnly 系统角色
     */
    public Boolean getDescribeSystemRoleOnly() {
        return this.DescribeSystemRoleOnly;
    }

    /**
     * Set 系统角色
     * @param DescribeSystemRoleOnly 系统角色
     */
    public void setDescribeSystemRoleOnly(Boolean DescribeSystemRoleOnly) {
        this.DescribeSystemRoleOnly = DescribeSystemRoleOnly;
    }

    /**
     * Get 自定义角色 
     * @return DescribeCustomRoleOnly 自定义角色
     */
    public Boolean getDescribeCustomRoleOnly() {
        return this.DescribeCustomRoleOnly;
    }

    /**
     * Set 自定义角色
     * @param DescribeCustomRoleOnly 自定义角色
     */
    public void setDescribeCustomRoleOnly(Boolean DescribeCustomRoleOnly) {
        this.DescribeCustomRoleOnly = DescribeCustomRoleOnly;
    }

    /**
     * Get 查看权限 
     * @return DescribePrivileges 查看权限
     */
    public Boolean getDescribePrivileges() {
        return this.DescribePrivileges;
    }

    /**
     * Set 查看权限
     * @param DescribePrivileges 查看权限
     */
    public void setDescribePrivileges(Boolean DescribePrivileges) {
        this.DescribePrivileges = DescribePrivileges;
    }

    /**
     * Get 筛选角色id 
     * @return RoleIds 筛选角色id
     */
    public String [] getRoleIds() {
        return this.RoleIds;
    }

    /**
     * Set 筛选角色id
     * @param RoleIds 筛选角色id
     */
    public void setRoleIds(String [] RoleIds) {
        this.RoleIds = RoleIds;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 页码 
     * @return PageNumber 页码
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码
     * @param PageNumber 页码
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 分页信息 
     * @return PageSize 分页信息
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页信息
     * @param PageSize 分页信息
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 查询字段 
     * @return Filters 查询字段
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 查询字段
     * @param Filters 查询字段
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序字段 
     * @return OrderFields 排序字段
     */
    public OrderFields [] getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set 排序字段
     * @param OrderFields 排序字段
     */
    public void setOrderFields(OrderFields [] OrderFields) {
        this.OrderFields = OrderFields;
    }

    public DescribeRoleListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoleListRequest(DescribeRoleListRequest source) {
        if (source.ShowAllRoles != null) {
            this.ShowAllRoles = new Boolean(source.ShowAllRoles);
        }
        if (source.IncludeRoleTypes != null) {
            this.IncludeRoleTypes = new String[source.IncludeRoleTypes.length];
            for (int i = 0; i < source.IncludeRoleTypes.length; i++) {
                this.IncludeRoleTypes[i] = new String(source.IncludeRoleTypes[i]);
            }
        }
        if (source.DescribeMemberCount != null) {
            this.DescribeMemberCount = new Boolean(source.DescribeMemberCount);
        }
        if (source.DescribeOperator != null) {
            this.DescribeOperator = new Boolean(source.DescribeOperator);
        }
        if (source.DescribeSystemRoleOnly != null) {
            this.DescribeSystemRoleOnly = new Boolean(source.DescribeSystemRoleOnly);
        }
        if (source.DescribeCustomRoleOnly != null) {
            this.DescribeCustomRoleOnly = new Boolean(source.DescribeCustomRoleOnly);
        }
        if (source.DescribePrivileges != null) {
            this.DescribePrivileges = new Boolean(source.DescribePrivileges);
        }
        if (source.RoleIds != null) {
            this.RoleIds = new String[source.RoleIds.length];
            for (int i = 0; i < source.RoleIds.length; i++) {
                this.RoleIds[i] = new String(source.RoleIds[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
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
        if (source.OrderFields != null) {
            this.OrderFields = new OrderFields[source.OrderFields.length];
            for (int i = 0; i < source.OrderFields.length; i++) {
                this.OrderFields[i] = new OrderFields(source.OrderFields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShowAllRoles", this.ShowAllRoles);
        this.setParamArraySimple(map, prefix + "IncludeRoleTypes.", this.IncludeRoleTypes);
        this.setParamSimple(map, prefix + "DescribeMemberCount", this.DescribeMemberCount);
        this.setParamSimple(map, prefix + "DescribeOperator", this.DescribeOperator);
        this.setParamSimple(map, prefix + "DescribeSystemRoleOnly", this.DescribeSystemRoleOnly);
        this.setParamSimple(map, prefix + "DescribeCustomRoleOnly", this.DescribeCustomRoleOnly);
        this.setParamSimple(map, prefix + "DescribePrivileges", this.DescribePrivileges);
        this.setParamArraySimple(map, prefix + "RoleIds.", this.RoleIds);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "OrderFields.", this.OrderFields);

    }
}

