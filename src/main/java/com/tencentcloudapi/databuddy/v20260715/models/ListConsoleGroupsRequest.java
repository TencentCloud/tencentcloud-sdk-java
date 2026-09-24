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

public class ListConsoleGroupsRequest extends AbstractModel {

    /**
    * <p>页码，从1开始，默认1</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页大小，默认10，最小10，最大100</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>通过用户组 ID 批量查询</p>
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
    * <p>多字段排序，如 [{Name: &#39;CreateTime&#39;, Direction: &#39;Desc&#39;}, {Name: &#39;UserName&#39;, Direction: &#39;Asc&#39;}]，默认按创建时间降序</p>
    */
    @SerializedName("OrderBys")
    @Expose
    private OrderBy [] OrderBys;

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
     * Get <p>每页大小，默认10，最小10，最大100</p> 
     * @return PageSize <p>每页大小，默认10，最小10，最大100</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页大小，默认10，最小10，最大100</p>
     * @param PageSize <p>每页大小，默认10，最小10，最大100</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>通过用户组 ID 批量查询</p> 
     * @return GroupIds <p>通过用户组 ID 批量查询</p>
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set <p>通过用户组 ID 批量查询</p>
     * @param GroupIds <p>通过用户组 ID 批量查询</p>
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
     * Get <p>多字段排序，如 [{Name: &#39;CreateTime&#39;, Direction: &#39;Desc&#39;}, {Name: &#39;UserName&#39;, Direction: &#39;Asc&#39;}]，默认按创建时间降序</p> 
     * @return OrderBys <p>多字段排序，如 [{Name: &#39;CreateTime&#39;, Direction: &#39;Desc&#39;}, {Name: &#39;UserName&#39;, Direction: &#39;Asc&#39;}]，默认按创建时间降序</p>
     */
    public OrderBy [] getOrderBys() {
        return this.OrderBys;
    }

    /**
     * Set <p>多字段排序，如 [{Name: &#39;CreateTime&#39;, Direction: &#39;Desc&#39;}, {Name: &#39;UserName&#39;, Direction: &#39;Asc&#39;}]，默认按创建时间降序</p>
     * @param OrderBys <p>多字段排序，如 [{Name: &#39;CreateTime&#39;, Direction: &#39;Desc&#39;}, {Name: &#39;UserName&#39;, Direction: &#39;Asc&#39;}]，默认按创建时间降序</p>
     */
    public void setOrderBys(OrderBy [] OrderBys) {
        this.OrderBys = OrderBys;
    }

    public ListConsoleGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListConsoleGroupsRequest(ListConsoleGroupsRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
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
        if (source.OrderBys != null) {
            this.OrderBys = new OrderBy[source.OrderBys.length];
            for (int i = 0; i < source.OrderBys.length; i++) {
                this.OrderBys[i] = new OrderBy(source.OrderBys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamSimple(map, prefix + "GroupKeyword", this.GroupKeyword);
        this.setParamArrayObj(map, prefix + "OrderBys.", this.OrderBys);

    }
}

