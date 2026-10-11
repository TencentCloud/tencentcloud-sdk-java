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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListWorkspaceGroupsRequest extends AbstractModel {

    /**
    * <p>工作空间ID</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>通过用户组ID批量查询；用户组ID可通过 ListWorkspaceGroups 接口获取</p>
    */
    @SerializedName("GroupIds")
    @Expose
    private String [] GroupIds;

    /**
    * <p>用户组名称模糊匹配</p>
    */
    @SerializedName("GroupKeyword")
    @Expose
    private String GroupKeyword;

    /**
    * <p>用于过滤角色关联的用户组；可通过 ListWorkspaceRoles 接口获取</p>
    */
    @SerializedName("RoleIds")
    @Expose
    private String [] RoleIds;

    /**
    * <p>多字段排序，如 [{Name: 'CreateTime', Direction: 'Desc'}]；传入单个即单字段排序，默认按创建时间降序</p>
    */
    @SerializedName("OrderBys")
    @Expose
    private OrderBy [] OrderBys;

    /**
    * <p>页码，从1开始，默认1；小于1时按1处理</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页大小，默认10，取值范围为 [1,100]，越界时自动收敛到边界值</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>用户组类型筛选。取值为枚举数值的字符串形式："0"=控制台系统类型（包含全部user）、"1"=控制台自定义类型、"2"=工作空间系统类型（包含工作空间全部user）、"3"=工作空间自定义类型</p>
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
     * Get <p>工作空间ID</p> 
     * @return WorkspaceId <p>工作空间ID</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>工作空间ID</p>
     * @param WorkspaceId <p>工作空间ID</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>通过用户组ID批量查询；用户组ID可通过 ListWorkspaceGroups 接口获取</p> 
     * @return GroupIds <p>通过用户组ID批量查询；用户组ID可通过 ListWorkspaceGroups 接口获取</p>
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set <p>通过用户组ID批量查询；用户组ID可通过 ListWorkspaceGroups 接口获取</p>
     * @param GroupIds <p>通过用户组ID批量查询；用户组ID可通过 ListWorkspaceGroups 接口获取</p>
     */
    public void setGroupIds(String [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get <p>用户组名称模糊匹配</p> 
     * @return GroupKeyword <p>用户组名称模糊匹配</p>
     */
    public String getGroupKeyword() {
        return this.GroupKeyword;
    }

    /**
     * Set <p>用户组名称模糊匹配</p>
     * @param GroupKeyword <p>用户组名称模糊匹配</p>
     */
    public void setGroupKeyword(String GroupKeyword) {
        this.GroupKeyword = GroupKeyword;
    }

    /**
     * Get <p>用于过滤角色关联的用户组；可通过 ListWorkspaceRoles 接口获取</p> 
     * @return RoleIds <p>用于过滤角色关联的用户组；可通过 ListWorkspaceRoles 接口获取</p>
     */
    public String [] getRoleIds() {
        return this.RoleIds;
    }

    /**
     * Set <p>用于过滤角色关联的用户组；可通过 ListWorkspaceRoles 接口获取</p>
     * @param RoleIds <p>用于过滤角色关联的用户组；可通过 ListWorkspaceRoles 接口获取</p>
     */
    public void setRoleIds(String [] RoleIds) {
        this.RoleIds = RoleIds;
    }

    /**
     * Get <p>多字段排序，如 [{Name: 'CreateTime', Direction: 'Desc'}]；传入单个即单字段排序，默认按创建时间降序</p> 
     * @return OrderBys <p>多字段排序，如 [{Name: 'CreateTime', Direction: 'Desc'}]；传入单个即单字段排序，默认按创建时间降序</p>
     */
    public OrderBy [] getOrderBys() {
        return this.OrderBys;
    }

    /**
     * Set <p>多字段排序，如 [{Name: 'CreateTime', Direction: 'Desc'}]；传入单个即单字段排序，默认按创建时间降序</p>
     * @param OrderBys <p>多字段排序，如 [{Name: 'CreateTime', Direction: 'Desc'}]；传入单个即单字段排序，默认按创建时间降序</p>
     */
    public void setOrderBys(OrderBy [] OrderBys) {
        this.OrderBys = OrderBys;
    }

    /**
     * Get <p>页码，从1开始，默认1；小于1时按1处理</p> 
     * @return PageNumber <p>页码，从1开始，默认1；小于1时按1处理</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页码，从1开始，默认1；小于1时按1处理</p>
     * @param PageNumber <p>页码，从1开始，默认1；小于1时按1处理</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页大小，默认10，取值范围为 [1,100]，越界时自动收敛到边界值</p> 
     * @return PageSize <p>每页大小，默认10，取值范围为 [1,100]，越界时自动收敛到边界值</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页大小，默认10，取值范围为 [1,100]，越界时自动收敛到边界值</p>
     * @param PageSize <p>每页大小，默认10，取值范围为 [1,100]，越界时自动收敛到边界值</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>用户组类型筛选。取值为枚举数值的字符串形式："0"=控制台系统类型（包含全部user）、"1"=控制台自定义类型、"2"=工作空间系统类型（包含工作空间全部user）、"3"=工作空间自定义类型</p> 
     * @return GroupType <p>用户组类型筛选。取值为枚举数值的字符串形式："0"=控制台系统类型（包含全部user）、"1"=控制台自定义类型、"2"=工作空间系统类型（包含工作空间全部user）、"3"=工作空间自定义类型</p>
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set <p>用户组类型筛选。取值为枚举数值的字符串形式："0"=控制台系统类型（包含全部user）、"1"=控制台自定义类型、"2"=工作空间系统类型（包含工作空间全部user）、"3"=工作空间自定义类型</p>
     * @param GroupType <p>用户组类型筛选。取值为枚举数值的字符串形式："0"=控制台系统类型（包含全部user）、"1"=控制台自定义类型、"2"=工作空间系统类型（包含工作空间全部user）、"3"=工作空间自定义类型</p>
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    public ListWorkspaceGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListWorkspaceGroupsRequest(ListWorkspaceGroupsRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.GroupIds != null) {
            this.GroupIds = new String[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new String(source.GroupIds[i]);
            }
        }
        if (source.GroupKeyword != null) {
            this.GroupKeyword = new String(source.GroupKeyword);
        }
        if (source.RoleIds != null) {
            this.RoleIds = new String[source.RoleIds.length];
            for (int i = 0; i < source.RoleIds.length; i++) {
                this.RoleIds[i] = new String(source.RoleIds[i]);
            }
        }
        if (source.OrderBys != null) {
            this.OrderBys = new OrderBy[source.OrderBys.length];
            for (int i = 0; i < source.OrderBys.length; i++) {
                this.OrderBys[i] = new OrderBy(source.OrderBys[i]);
            }
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamSimple(map, prefix + "GroupKeyword", this.GroupKeyword);
        this.setParamArraySimple(map, prefix + "RoleIds.", this.RoleIds);
        this.setParamArrayObj(map, prefix + "OrderBys.", this.OrderBys);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);

    }
}

