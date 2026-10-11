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

public class ListWorkspaceGroupUsersRequest extends AbstractModel {

    /**
    * <p>工作空间id</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>用户组ID，可通过 ListWorkspaceGroups 接口获取</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>关键字，支持按用户名模糊搜索</p>
    */
    @SerializedName("NameKeywords")
    @Expose
    private String NameKeywords;

    /**
    * <p>用户UIN列表，按UIN精确筛选</p>
    */
    @SerializedName("UserUins")
    @Expose
    private String [] UserUins;

    /**
    * <p>&quot;OrderBys&quot;: [{&quot;Name&quot;: &quot;CreateTime&quot;, &quot;Direction&quot;: &quot;DESC&quot; }]</p>
    */
    @SerializedName("OrderBys")
    @Expose
    private OrderBy [] OrderBys;

    /**
    * <p>页码，从1开始，默认1</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页大小</p><p>取值范围：[1, 100]</p><p>默认值：10</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get <p>工作空间id</p> 
     * @return WorkspaceId <p>工作空间id</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>工作空间id</p>
     * @param WorkspaceId <p>工作空间id</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>用户组ID，可通过 ListWorkspaceGroups 接口获取</p> 
     * @return GroupId <p>用户组ID，可通过 ListWorkspaceGroups 接口获取</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>用户组ID，可通过 ListWorkspaceGroups 接口获取</p>
     * @param GroupId <p>用户组ID，可通过 ListWorkspaceGroups 接口获取</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>关键字，支持按用户名模糊搜索</p> 
     * @return NameKeywords <p>关键字，支持按用户名模糊搜索</p>
     */
    public String getNameKeywords() {
        return this.NameKeywords;
    }

    /**
     * Set <p>关键字，支持按用户名模糊搜索</p>
     * @param NameKeywords <p>关键字，支持按用户名模糊搜索</p>
     */
    public void setNameKeywords(String NameKeywords) {
        this.NameKeywords = NameKeywords;
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
     * Get <p>&quot;OrderBys&quot;: [{&quot;Name&quot;: &quot;CreateTime&quot;, &quot;Direction&quot;: &quot;DESC&quot; }]</p> 
     * @return OrderBys <p>&quot;OrderBys&quot;: [{&quot;Name&quot;: &quot;CreateTime&quot;, &quot;Direction&quot;: &quot;DESC&quot; }]</p>
     */
    public OrderBy [] getOrderBys() {
        return this.OrderBys;
    }

    /**
     * Set <p>&quot;OrderBys&quot;: [{&quot;Name&quot;: &quot;CreateTime&quot;, &quot;Direction&quot;: &quot;DESC&quot; }]</p>
     * @param OrderBys <p>&quot;OrderBys&quot;: [{&quot;Name&quot;: &quot;CreateTime&quot;, &quot;Direction&quot;: &quot;DESC&quot; }]</p>
     */
    public void setOrderBys(OrderBy [] OrderBys) {
        this.OrderBys = OrderBys;
    }

    /**
     * Get <p>页码，从1开始，默认1</p> 
     * @return PageNumber <p>页码，从1开始，默认1</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页码，从1开始，默认1</p>
     * @param PageNumber <p>页码，从1开始，默认1</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页大小</p><p>取值范围：[1, 100]</p><p>默认值：10</p> 
     * @return PageSize <p>每页大小</p><p>取值范围：[1, 100]</p><p>默认值：10</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页大小</p><p>取值范围：[1, 100]</p><p>默认值：10</p>
     * @param PageSize <p>每页大小</p><p>取值范围：[1, 100]</p><p>默认值：10</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public ListWorkspaceGroupUsersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListWorkspaceGroupUsersRequest(ListWorkspaceGroupUsersRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.NameKeywords != null) {
            this.NameKeywords = new String(source.NameKeywords);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "NameKeywords", this.NameKeywords);
        this.setParamArraySimple(map, prefix + "UserUins.", this.UserUins);
        this.setParamArrayObj(map, prefix + "OrderBys.", this.OrderBys);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

