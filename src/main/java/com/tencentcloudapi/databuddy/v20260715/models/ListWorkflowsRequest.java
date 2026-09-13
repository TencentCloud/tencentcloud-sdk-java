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

public class ListWorkflowsRequest extends AbstractModel {

    /**
    * <p>工作空间ID，可通过 ListWorkspaces 获取。必填</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>分页页码，从 1 开始。非必填，默认 1</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页大小。非必填，默认 10，取值范围 [10, 200]</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>工作流名称关键字，对 WorkflowName 做模糊匹配。非必填，单值</p>
    */
    @SerializedName("WorkflowNameKeyword")
    @Expose
    private String WorkflowNameKeyword;

    /**
    * <p>工作流名称，精确匹配。非必填，多选（多个值之间为 OR 关系）</p>
    */
    @SerializedName("WorkflowNames")
    @Expose
    private String [] WorkflowNames;

    /**
    * <p>工作流ID，精确匹配。非必填，多选（多个值之间为 OR 关系）</p>
    */
    @SerializedName("WorkflowIds")
    @Expose
    private String [] WorkflowIds;

    /**
    * <p>工作流运行人UIN，精确匹配。非必填，多选（多个值之间为 OR 关系）</p>
    */
    @SerializedName("RunUserUins")
    @Expose
    private String [] RunUserUins;

    /**
    * <p>标签名称ID，精确匹配，可通过标签相关接口获取。非必填，多选（多个值之间为 OR 关系）</p>
    */
    @SerializedName("LabelKeyIds")
    @Expose
    private String [] LabelKeyIds;

    /**
    * <p>标签值ID，精确匹配，可通过标签相关接口获取。非必填，多选（多个值之间为 OR 关系）</p>
    */
    @SerializedName("LabelValueIds")
    @Expose
    private String [] LabelValueIds;

    /**
    * <p>快速筛选类型。非必填，单值</p><p>对齐老云 API（wedata/2025-10-10）文档示例值：</p><ul><li>MY_FAVORITE：我收藏的</li><li>MY_OWNER：我负责的</li><li>MY_AUTHORITY：我有权限</li><li>WorkflowId：支持多个工作流ID筛选</li></ul><p>后端实现现状：当前仅 MY_FAVORITE 生效（设置 favoriteUserUin 过滤当前用户收藏），MY_OWNER / MY_AUTHORITY 暂未在 Service 层实现，传入会被忽略（按全量返回）。</p>
    */
    @SerializedName("QuickSelectionType")
    @Expose
    private String QuickSelectionType;

    /**
    * <p>排序条件，多个之间按数组顺序表示优先级。非必填。<br>可排序字段白名单：CreateTime</p>
    */
    @SerializedName("OrderBys")
    @Expose
    private OrderBy [] OrderBys;

    /**
     * Get <p>工作空间ID，可通过 ListWorkspaces 获取。必填</p> 
     * @return WorkspaceId <p>工作空间ID，可通过 ListWorkspaces 获取。必填</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>工作空间ID，可通过 ListWorkspaces 获取。必填</p>
     * @param WorkspaceId <p>工作空间ID，可通过 ListWorkspaces 获取。必填</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>分页页码，从 1 开始。非必填，默认 1</p> 
     * @return PageNumber <p>分页页码，从 1 开始。非必填，默认 1</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>分页页码，从 1 开始。非必填，默认 1</p>
     * @param PageNumber <p>分页页码，从 1 开始。非必填，默认 1</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页大小。非必填，默认 10，取值范围 [10, 200]</p> 
     * @return PageSize <p>每页大小。非必填，默认 10，取值范围 [10, 200]</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页大小。非必填，默认 10，取值范围 [10, 200]</p>
     * @param PageSize <p>每页大小。非必填，默认 10，取值范围 [10, 200]</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>工作流名称关键字，对 WorkflowName 做模糊匹配。非必填，单值</p> 
     * @return WorkflowNameKeyword <p>工作流名称关键字，对 WorkflowName 做模糊匹配。非必填，单值</p>
     */
    public String getWorkflowNameKeyword() {
        return this.WorkflowNameKeyword;
    }

    /**
     * Set <p>工作流名称关键字，对 WorkflowName 做模糊匹配。非必填，单值</p>
     * @param WorkflowNameKeyword <p>工作流名称关键字，对 WorkflowName 做模糊匹配。非必填，单值</p>
     */
    public void setWorkflowNameKeyword(String WorkflowNameKeyword) {
        this.WorkflowNameKeyword = WorkflowNameKeyword;
    }

    /**
     * Get <p>工作流名称，精确匹配。非必填，多选（多个值之间为 OR 关系）</p> 
     * @return WorkflowNames <p>工作流名称，精确匹配。非必填，多选（多个值之间为 OR 关系）</p>
     */
    public String [] getWorkflowNames() {
        return this.WorkflowNames;
    }

    /**
     * Set <p>工作流名称，精确匹配。非必填，多选（多个值之间为 OR 关系）</p>
     * @param WorkflowNames <p>工作流名称，精确匹配。非必填，多选（多个值之间为 OR 关系）</p>
     */
    public void setWorkflowNames(String [] WorkflowNames) {
        this.WorkflowNames = WorkflowNames;
    }

    /**
     * Get <p>工作流ID，精确匹配。非必填，多选（多个值之间为 OR 关系）</p> 
     * @return WorkflowIds <p>工作流ID，精确匹配。非必填，多选（多个值之间为 OR 关系）</p>
     */
    public String [] getWorkflowIds() {
        return this.WorkflowIds;
    }

    /**
     * Set <p>工作流ID，精确匹配。非必填，多选（多个值之间为 OR 关系）</p>
     * @param WorkflowIds <p>工作流ID，精确匹配。非必填，多选（多个值之间为 OR 关系）</p>
     */
    public void setWorkflowIds(String [] WorkflowIds) {
        this.WorkflowIds = WorkflowIds;
    }

    /**
     * Get <p>工作流运行人UIN，精确匹配。非必填，多选（多个值之间为 OR 关系）</p> 
     * @return RunUserUins <p>工作流运行人UIN，精确匹配。非必填，多选（多个值之间为 OR 关系）</p>
     */
    public String [] getRunUserUins() {
        return this.RunUserUins;
    }

    /**
     * Set <p>工作流运行人UIN，精确匹配。非必填，多选（多个值之间为 OR 关系）</p>
     * @param RunUserUins <p>工作流运行人UIN，精确匹配。非必填，多选（多个值之间为 OR 关系）</p>
     */
    public void setRunUserUins(String [] RunUserUins) {
        this.RunUserUins = RunUserUins;
    }

    /**
     * Get <p>标签名称ID，精确匹配，可通过标签相关接口获取。非必填，多选（多个值之间为 OR 关系）</p> 
     * @return LabelKeyIds <p>标签名称ID，精确匹配，可通过标签相关接口获取。非必填，多选（多个值之间为 OR 关系）</p>
     */
    public String [] getLabelKeyIds() {
        return this.LabelKeyIds;
    }

    /**
     * Set <p>标签名称ID，精确匹配，可通过标签相关接口获取。非必填，多选（多个值之间为 OR 关系）</p>
     * @param LabelKeyIds <p>标签名称ID，精确匹配，可通过标签相关接口获取。非必填，多选（多个值之间为 OR 关系）</p>
     */
    public void setLabelKeyIds(String [] LabelKeyIds) {
        this.LabelKeyIds = LabelKeyIds;
    }

    /**
     * Get <p>标签值ID，精确匹配，可通过标签相关接口获取。非必填，多选（多个值之间为 OR 关系）</p> 
     * @return LabelValueIds <p>标签值ID，精确匹配，可通过标签相关接口获取。非必填，多选（多个值之间为 OR 关系）</p>
     */
    public String [] getLabelValueIds() {
        return this.LabelValueIds;
    }

    /**
     * Set <p>标签值ID，精确匹配，可通过标签相关接口获取。非必填，多选（多个值之间为 OR 关系）</p>
     * @param LabelValueIds <p>标签值ID，精确匹配，可通过标签相关接口获取。非必填，多选（多个值之间为 OR 关系）</p>
     */
    public void setLabelValueIds(String [] LabelValueIds) {
        this.LabelValueIds = LabelValueIds;
    }

    /**
     * Get <p>快速筛选类型。非必填，单值</p><p>对齐老云 API（wedata/2025-10-10）文档示例值：</p><ul><li>MY_FAVORITE：我收藏的</li><li>MY_OWNER：我负责的</li><li>MY_AUTHORITY：我有权限</li><li>WorkflowId：支持多个工作流ID筛选</li></ul><p>后端实现现状：当前仅 MY_FAVORITE 生效（设置 favoriteUserUin 过滤当前用户收藏），MY_OWNER / MY_AUTHORITY 暂未在 Service 层实现，传入会被忽略（按全量返回）。</p> 
     * @return QuickSelectionType <p>快速筛选类型。非必填，单值</p><p>对齐老云 API（wedata/2025-10-10）文档示例值：</p><ul><li>MY_FAVORITE：我收藏的</li><li>MY_OWNER：我负责的</li><li>MY_AUTHORITY：我有权限</li><li>WorkflowId：支持多个工作流ID筛选</li></ul><p>后端实现现状：当前仅 MY_FAVORITE 生效（设置 favoriteUserUin 过滤当前用户收藏），MY_OWNER / MY_AUTHORITY 暂未在 Service 层实现，传入会被忽略（按全量返回）。</p>
     */
    public String getQuickSelectionType() {
        return this.QuickSelectionType;
    }

    /**
     * Set <p>快速筛选类型。非必填，单值</p><p>对齐老云 API（wedata/2025-10-10）文档示例值：</p><ul><li>MY_FAVORITE：我收藏的</li><li>MY_OWNER：我负责的</li><li>MY_AUTHORITY：我有权限</li><li>WorkflowId：支持多个工作流ID筛选</li></ul><p>后端实现现状：当前仅 MY_FAVORITE 生效（设置 favoriteUserUin 过滤当前用户收藏），MY_OWNER / MY_AUTHORITY 暂未在 Service 层实现，传入会被忽略（按全量返回）。</p>
     * @param QuickSelectionType <p>快速筛选类型。非必填，单值</p><p>对齐老云 API（wedata/2025-10-10）文档示例值：</p><ul><li>MY_FAVORITE：我收藏的</li><li>MY_OWNER：我负责的</li><li>MY_AUTHORITY：我有权限</li><li>WorkflowId：支持多个工作流ID筛选</li></ul><p>后端实现现状：当前仅 MY_FAVORITE 生效（设置 favoriteUserUin 过滤当前用户收藏），MY_OWNER / MY_AUTHORITY 暂未在 Service 层实现，传入会被忽略（按全量返回）。</p>
     */
    public void setQuickSelectionType(String QuickSelectionType) {
        this.QuickSelectionType = QuickSelectionType;
    }

    /**
     * Get <p>排序条件，多个之间按数组顺序表示优先级。非必填。<br>可排序字段白名单：CreateTime</p> 
     * @return OrderBys <p>排序条件，多个之间按数组顺序表示优先级。非必填。<br>可排序字段白名单：CreateTime</p>
     */
    public OrderBy [] getOrderBys() {
        return this.OrderBys;
    }

    /**
     * Set <p>排序条件，多个之间按数组顺序表示优先级。非必填。<br>可排序字段白名单：CreateTime</p>
     * @param OrderBys <p>排序条件，多个之间按数组顺序表示优先级。非必填。<br>可排序字段白名单：CreateTime</p>
     */
    public void setOrderBys(OrderBy [] OrderBys) {
        this.OrderBys = OrderBys;
    }

    public ListWorkflowsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListWorkflowsRequest(ListWorkflowsRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.WorkflowNameKeyword != null) {
            this.WorkflowNameKeyword = new String(source.WorkflowNameKeyword);
        }
        if (source.WorkflowNames != null) {
            this.WorkflowNames = new String[source.WorkflowNames.length];
            for (int i = 0; i < source.WorkflowNames.length; i++) {
                this.WorkflowNames[i] = new String(source.WorkflowNames[i]);
            }
        }
        if (source.WorkflowIds != null) {
            this.WorkflowIds = new String[source.WorkflowIds.length];
            for (int i = 0; i < source.WorkflowIds.length; i++) {
                this.WorkflowIds[i] = new String(source.WorkflowIds[i]);
            }
        }
        if (source.RunUserUins != null) {
            this.RunUserUins = new String[source.RunUserUins.length];
            for (int i = 0; i < source.RunUserUins.length; i++) {
                this.RunUserUins[i] = new String(source.RunUserUins[i]);
            }
        }
        if (source.LabelKeyIds != null) {
            this.LabelKeyIds = new String[source.LabelKeyIds.length];
            for (int i = 0; i < source.LabelKeyIds.length; i++) {
                this.LabelKeyIds[i] = new String(source.LabelKeyIds[i]);
            }
        }
        if (source.LabelValueIds != null) {
            this.LabelValueIds = new String[source.LabelValueIds.length];
            for (int i = 0; i < source.LabelValueIds.length; i++) {
                this.LabelValueIds[i] = new String(source.LabelValueIds[i]);
            }
        }
        if (source.QuickSelectionType != null) {
            this.QuickSelectionType = new String(source.QuickSelectionType);
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
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "WorkflowNameKeyword", this.WorkflowNameKeyword);
        this.setParamArraySimple(map, prefix + "WorkflowNames.", this.WorkflowNames);
        this.setParamArraySimple(map, prefix + "WorkflowIds.", this.WorkflowIds);
        this.setParamArraySimple(map, prefix + "RunUserUins.", this.RunUserUins);
        this.setParamArraySimple(map, prefix + "LabelKeyIds.", this.LabelKeyIds);
        this.setParamArraySimple(map, prefix + "LabelValueIds.", this.LabelValueIds);
        this.setParamSimple(map, prefix + "QuickSelectionType", this.QuickSelectionType);
        this.setParamArrayObj(map, prefix + "OrderBys.", this.OrderBys);

    }
}

