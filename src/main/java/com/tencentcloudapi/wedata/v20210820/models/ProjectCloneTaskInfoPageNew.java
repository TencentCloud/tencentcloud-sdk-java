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

public class ProjectCloneTaskInfoPageNew extends AbstractModel {

    /**
    * item 总数量
    */
    @SerializedName("TotalItems")
    @Expose
    private Long TotalItems;

    /**
    * 总页数
    */
    @SerializedName("TotalPages")
    @Expose
    private Long TotalPages;

    /**
    * 当前页码
    */
    @SerializedName("CurrentPage")
    @Expose
    private Long CurrentPage;

    /**
    * 每页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 当前页实际 item 数量
    */
    @SerializedName("CurrentPageItems")
    @Expose
    private Long CurrentPageItems;

    /**
    * 任务列表信息-项目克隆
    */
    @SerializedName("Items")
    @Expose
    private ProjectCloneTaskInfo [] Items;

    /**
     * Get item 总数量 
     * @return TotalItems item 总数量
     */
    public Long getTotalItems() {
        return this.TotalItems;
    }

    /**
     * Set item 总数量
     * @param TotalItems item 总数量
     */
    public void setTotalItems(Long TotalItems) {
        this.TotalItems = TotalItems;
    }

    /**
     * Get 总页数 
     * @return TotalPages 总页数
     */
    public Long getTotalPages() {
        return this.TotalPages;
    }

    /**
     * Set 总页数
     * @param TotalPages 总页数
     */
    public void setTotalPages(Long TotalPages) {
        this.TotalPages = TotalPages;
    }

    /**
     * Get 当前页码 
     * @return CurrentPage 当前页码
     */
    public Long getCurrentPage() {
        return this.CurrentPage;
    }

    /**
     * Set 当前页码
     * @param CurrentPage 当前页码
     */
    public void setCurrentPage(Long CurrentPage) {
        this.CurrentPage = CurrentPage;
    }

    /**
     * Get 每页大小 
     * @return PageSize 每页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页大小
     * @param PageSize 每页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 当前页实际 item 数量 
     * @return CurrentPageItems 当前页实际 item 数量
     */
    public Long getCurrentPageItems() {
        return this.CurrentPageItems;
    }

    /**
     * Set 当前页实际 item 数量
     * @param CurrentPageItems 当前页实际 item 数量
     */
    public void setCurrentPageItems(Long CurrentPageItems) {
        this.CurrentPageItems = CurrentPageItems;
    }

    /**
     * Get 任务列表信息-项目克隆 
     * @return Items 任务列表信息-项目克隆
     */
    public ProjectCloneTaskInfo [] getItems() {
        return this.Items;
    }

    /**
     * Set 任务列表信息-项目克隆
     * @param Items 任务列表信息-项目克隆
     */
    public void setItems(ProjectCloneTaskInfo [] Items) {
        this.Items = Items;
    }

    public ProjectCloneTaskInfoPageNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProjectCloneTaskInfoPageNew(ProjectCloneTaskInfoPageNew source) {
        if (source.TotalItems != null) {
            this.TotalItems = new Long(source.TotalItems);
        }
        if (source.TotalPages != null) {
            this.TotalPages = new Long(source.TotalPages);
        }
        if (source.CurrentPage != null) {
            this.CurrentPage = new Long(source.CurrentPage);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.CurrentPageItems != null) {
            this.CurrentPageItems = new Long(source.CurrentPageItems);
        }
        if (source.Items != null) {
            this.Items = new ProjectCloneTaskInfo[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new ProjectCloneTaskInfo(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalItems", this.TotalItems);
        this.setParamSimple(map, prefix + "TotalPages", this.TotalPages);
        this.setParamSimple(map, prefix + "CurrentPage", this.CurrentPage);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "CurrentPageItems", this.CurrentPageItems);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

