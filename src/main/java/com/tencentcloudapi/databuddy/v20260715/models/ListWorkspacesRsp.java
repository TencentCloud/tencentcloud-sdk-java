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

public class ListWorkspacesRsp extends AbstractModel {

    /**
    * <p>工作空间列表</p>
    */
    @SerializedName("Items")
    @Expose
    private WorkspaceInfo [] Items;

    /**
    * <p>当前页码</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页大小</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>总记录数</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>总页数</p>
    */
    @SerializedName("TotalPageNumber")
    @Expose
    private Long TotalPageNumber;

    /**
    * <p>是否控制台管理员</p>
    */
    @SerializedName("IsConsoleAdmin")
    @Expose
    private Boolean IsConsoleAdmin;

    /**
     * Get <p>工作空间列表</p> 
     * @return Items <p>工作空间列表</p>
     */
    public WorkspaceInfo [] getItems() {
        return this.Items;
    }

    /**
     * Set <p>工作空间列表</p>
     * @param Items <p>工作空间列表</p>
     */
    public void setItems(WorkspaceInfo [] Items) {
        this.Items = Items;
    }

    /**
     * Get <p>当前页码</p> 
     * @return PageNumber <p>当前页码</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>当前页码</p>
     * @param PageNumber <p>当前页码</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页大小</p> 
     * @return PageSize <p>每页大小</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页大小</p>
     * @param PageSize <p>每页大小</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>总记录数</p> 
     * @return TotalCount <p>总记录数</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>总记录数</p>
     * @param TotalCount <p>总记录数</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>总页数</p> 
     * @return TotalPageNumber <p>总页数</p>
     */
    public Long getTotalPageNumber() {
        return this.TotalPageNumber;
    }

    /**
     * Set <p>总页数</p>
     * @param TotalPageNumber <p>总页数</p>
     */
    public void setTotalPageNumber(Long TotalPageNumber) {
        this.TotalPageNumber = TotalPageNumber;
    }

    /**
     * Get <p>是否控制台管理员</p> 
     * @return IsConsoleAdmin <p>是否控制台管理员</p>
     */
    public Boolean getIsConsoleAdmin() {
        return this.IsConsoleAdmin;
    }

    /**
     * Set <p>是否控制台管理员</p>
     * @param IsConsoleAdmin <p>是否控制台管理员</p>
     */
    public void setIsConsoleAdmin(Boolean IsConsoleAdmin) {
        this.IsConsoleAdmin = IsConsoleAdmin;
    }

    public ListWorkspacesRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListWorkspacesRsp(ListWorkspacesRsp source) {
        if (source.Items != null) {
            this.Items = new WorkspaceInfo[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new WorkspaceInfo(source.Items[i]);
            }
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TotalPageNumber != null) {
            this.TotalPageNumber = new Long(source.TotalPageNumber);
        }
        if (source.IsConsoleAdmin != null) {
            this.IsConsoleAdmin = new Boolean(source.IsConsoleAdmin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalPageNumber", this.TotalPageNumber);
        this.setParamSimple(map, prefix + "IsConsoleAdmin", this.IsConsoleAdmin);

    }
}

