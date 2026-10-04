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

public class ListWorkspacesRequest extends AbstractModel {

    /**
    * <p>工作空间ID精确匹配</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>工作空间名称模糊匹配</p>
    */
    @SerializedName("WorkspaceKeyword")
    @Expose
    private String WorkspaceKeyword;

    /**
    * <p>工作空间状态过滤（多选）：0=未指定 1=创建中 2=创建失败 3=正常运行中 4=已删除</p>
    */
    @SerializedName("StatusList")
    @Expose
    private Long [] StatusList;

    /**
    * <p>多字段排序，如 [{Name: 'CreateTime', Direction: 'Desc'}]；传入单个即单字段排序，默认按创建时间降序</p>
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
    * <p>每页大小，默认10，最小10，最大100</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>工作空间地域过滤（多选），如 ap-guangzhou</p>
    */
    @SerializedName("WorkspaceRegion")
    @Expose
    private String [] WorkspaceRegion;

    /**
    * <p>创建者UIN过滤（多选）</p>
    */
    @SerializedName("Creator")
    @Expose
    private String [] Creator;

    /**
     * Get <p>工作空间ID精确匹配</p> 
     * @return WorkspaceId <p>工作空间ID精确匹配</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>工作空间ID精确匹配</p>
     * @param WorkspaceId <p>工作空间ID精确匹配</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>工作空间名称模糊匹配</p> 
     * @return WorkspaceKeyword <p>工作空间名称模糊匹配</p>
     */
    public String getWorkspaceKeyword() {
        return this.WorkspaceKeyword;
    }

    /**
     * Set <p>工作空间名称模糊匹配</p>
     * @param WorkspaceKeyword <p>工作空间名称模糊匹配</p>
     */
    public void setWorkspaceKeyword(String WorkspaceKeyword) {
        this.WorkspaceKeyword = WorkspaceKeyword;
    }

    /**
     * Get <p>工作空间状态过滤（多选）：0=未指定 1=创建中 2=创建失败 3=正常运行中 4=已删除</p> 
     * @return StatusList <p>工作空间状态过滤（多选）：0=未指定 1=创建中 2=创建失败 3=正常运行中 4=已删除</p>
     */
    public Long [] getStatusList() {
        return this.StatusList;
    }

    /**
     * Set <p>工作空间状态过滤（多选）：0=未指定 1=创建中 2=创建失败 3=正常运行中 4=已删除</p>
     * @param StatusList <p>工作空间状态过滤（多选）：0=未指定 1=创建中 2=创建失败 3=正常运行中 4=已删除</p>
     */
    public void setStatusList(Long [] StatusList) {
        this.StatusList = StatusList;
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
     * Get <p>工作空间地域过滤（多选），如 ap-guangzhou</p> 
     * @return WorkspaceRegion <p>工作空间地域过滤（多选），如 ap-guangzhou</p>
     */
    public String [] getWorkspaceRegion() {
        return this.WorkspaceRegion;
    }

    /**
     * Set <p>工作空间地域过滤（多选），如 ap-guangzhou</p>
     * @param WorkspaceRegion <p>工作空间地域过滤（多选），如 ap-guangzhou</p>
     */
    public void setWorkspaceRegion(String [] WorkspaceRegion) {
        this.WorkspaceRegion = WorkspaceRegion;
    }

    /**
     * Get <p>创建者UIN过滤（多选）</p> 
     * @return Creator <p>创建者UIN过滤（多选）</p>
     */
    public String [] getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>创建者UIN过滤（多选）</p>
     * @param Creator <p>创建者UIN过滤（多选）</p>
     */
    public void setCreator(String [] Creator) {
        this.Creator = Creator;
    }

    public ListWorkspacesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListWorkspacesRequest(ListWorkspacesRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.WorkspaceKeyword != null) {
            this.WorkspaceKeyword = new String(source.WorkspaceKeyword);
        }
        if (source.StatusList != null) {
            this.StatusList = new Long[source.StatusList.length];
            for (int i = 0; i < source.StatusList.length; i++) {
                this.StatusList[i] = new Long(source.StatusList[i]);
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
        if (source.WorkspaceRegion != null) {
            this.WorkspaceRegion = new String[source.WorkspaceRegion.length];
            for (int i = 0; i < source.WorkspaceRegion.length; i++) {
                this.WorkspaceRegion[i] = new String(source.WorkspaceRegion[i]);
            }
        }
        if (source.Creator != null) {
            this.Creator = new String[source.Creator.length];
            for (int i = 0; i < source.Creator.length; i++) {
                this.Creator[i] = new String(source.Creator[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "WorkspaceKeyword", this.WorkspaceKeyword);
        this.setParamArraySimple(map, prefix + "StatusList.", this.StatusList);
        this.setParamArrayObj(map, prefix + "OrderBys.", this.OrderBys);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArraySimple(map, prefix + "WorkspaceRegion.", this.WorkspaceRegion);
        this.setParamArraySimple(map, prefix + "Creator.", this.Creator);

    }
}

