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

public class ListWorkspaceUsersRequest extends AbstractModel {

    /**
    * <p>工作空间ID</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>用户名称或 UIN 模糊匹配</p>
    */
    @SerializedName("UserKeyword")
    @Expose
    private String UserKeyword;

    /**
    * <p>角色ID列表，过滤角色关联的用户；可通过 ListWorkspaceRoles 接口获取</p>
    */
    @SerializedName("RoleIds")
    @Expose
    private String [] RoleIds;

    /**
    * <p>用户UIN列表，按UIN精确筛选</p>
    */
    @SerializedName("UserUins")
    @Expose
    private String [] UserUins;

    /**
    * <p>排序字段列表，如 [{Name: CreateTime, Direction: DESC}]；传入单个即单字段排序，默认按创建时间降序</p>
    */
    @SerializedName("OrderBys")
    @Expose
    private OrderBy [] OrderBys;

    /**
    * <p>页码，默认1，从1开始；小于1时按1处理</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页条数，默认10，取值范围为 [1,100]，越界时自动收敛到边界值</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>扩展信息（首次请求为空，翻页请求带响应中的ExtendInfo。连续翻页且item涉及权限过滤等场景，用于定位下次offset）</p>
    */
    @SerializedName("ExtendInfo")
    @Expose
    private String ExtendInfo;

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
     * Get <p>用户名称或 UIN 模糊匹配</p> 
     * @return UserKeyword <p>用户名称或 UIN 模糊匹配</p>
     */
    public String getUserKeyword() {
        return this.UserKeyword;
    }

    /**
     * Set <p>用户名称或 UIN 模糊匹配</p>
     * @param UserKeyword <p>用户名称或 UIN 模糊匹配</p>
     */
    public void setUserKeyword(String UserKeyword) {
        this.UserKeyword = UserKeyword;
    }

    /**
     * Get <p>角色ID列表，过滤角色关联的用户；可通过 ListWorkspaceRoles 接口获取</p> 
     * @return RoleIds <p>角色ID列表，过滤角色关联的用户；可通过 ListWorkspaceRoles 接口获取</p>
     */
    public String [] getRoleIds() {
        return this.RoleIds;
    }

    /**
     * Set <p>角色ID列表，过滤角色关联的用户；可通过 ListWorkspaceRoles 接口获取</p>
     * @param RoleIds <p>角色ID列表，过滤角色关联的用户；可通过 ListWorkspaceRoles 接口获取</p>
     */
    public void setRoleIds(String [] RoleIds) {
        this.RoleIds = RoleIds;
    }

    /**
     * Get <p>用户UIN列表，按UIN精确筛选</p> 
     * @return UserUins <p>用户UIN列表，按UIN精确筛选</p>
     */
    public String [] getUserUins() {
        return this.UserUins;
    }

    /**
     * Set <p>用户UIN列表，按UIN精确筛选</p>
     * @param UserUins <p>用户UIN列表，按UIN精确筛选</p>
     */
    public void setUserUins(String [] UserUins) {
        this.UserUins = UserUins;
    }

    /**
     * Get <p>排序字段列表，如 [{Name: CreateTime, Direction: DESC}]；传入单个即单字段排序，默认按创建时间降序</p> 
     * @return OrderBys <p>排序字段列表，如 [{Name: CreateTime, Direction: DESC}]；传入单个即单字段排序，默认按创建时间降序</p>
     */
    public OrderBy [] getOrderBys() {
        return this.OrderBys;
    }

    /**
     * Set <p>排序字段列表，如 [{Name: CreateTime, Direction: DESC}]；传入单个即单字段排序，默认按创建时间降序</p>
     * @param OrderBys <p>排序字段列表，如 [{Name: CreateTime, Direction: DESC}]；传入单个即单字段排序，默认按创建时间降序</p>
     */
    public void setOrderBys(OrderBy [] OrderBys) {
        this.OrderBys = OrderBys;
    }

    /**
     * Get <p>页码，默认1，从1开始；小于1时按1处理</p> 
     * @return PageNumber <p>页码，默认1，从1开始；小于1时按1处理</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页码，默认1，从1开始；小于1时按1处理</p>
     * @param PageNumber <p>页码，默认1，从1开始；小于1时按1处理</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页条数，默认10，取值范围为 [1,100]，越界时自动收敛到边界值</p> 
     * @return PageSize <p>每页条数，默认10，取值范围为 [1,100]，越界时自动收敛到边界值</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页条数，默认10，取值范围为 [1,100]，越界时自动收敛到边界值</p>
     * @param PageSize <p>每页条数，默认10，取值范围为 [1,100]，越界时自动收敛到边界值</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>扩展信息（首次请求为空，翻页请求带响应中的ExtendInfo。连续翻页且item涉及权限过滤等场景，用于定位下次offset）</p> 
     * @return ExtendInfo <p>扩展信息（首次请求为空，翻页请求带响应中的ExtendInfo。连续翻页且item涉及权限过滤等场景，用于定位下次offset）</p>
     */
    public String getExtendInfo() {
        return this.ExtendInfo;
    }

    /**
     * Set <p>扩展信息（首次请求为空，翻页请求带响应中的ExtendInfo。连续翻页且item涉及权限过滤等场景，用于定位下次offset）</p>
     * @param ExtendInfo <p>扩展信息（首次请求为空，翻页请求带响应中的ExtendInfo。连续翻页且item涉及权限过滤等场景，用于定位下次offset）</p>
     */
    public void setExtendInfo(String ExtendInfo) {
        this.ExtendInfo = ExtendInfo;
    }

    public ListWorkspaceUsersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListWorkspaceUsersRequest(ListWorkspaceUsersRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.UserKeyword != null) {
            this.UserKeyword = new String(source.UserKeyword);
        }
        if (source.RoleIds != null) {
            this.RoleIds = new String[source.RoleIds.length];
            for (int i = 0; i < source.RoleIds.length; i++) {
                this.RoleIds[i] = new String(source.RoleIds[i]);
            }
        }
        if (source.UserUins != null) {
            this.UserUins = new String[source.UserUins.length];
            for (int i = 0; i < source.UserUins.length; i++) {
                this.UserUins[i] = new String(source.UserUins[i]);
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
        if (source.ExtendInfo != null) {
            this.ExtendInfo = new String(source.ExtendInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "UserKeyword", this.UserKeyword);
        this.setParamArraySimple(map, prefix + "RoleIds.", this.RoleIds);
        this.setParamArraySimple(map, prefix + "UserUins.", this.UserUins);
        this.setParamArrayObj(map, prefix + "OrderBys.", this.OrderBys);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ExtendInfo", this.ExtendInfo);

    }
}

