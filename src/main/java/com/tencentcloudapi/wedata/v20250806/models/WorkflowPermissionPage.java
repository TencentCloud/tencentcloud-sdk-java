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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowPermissionPage extends AbstractModel {

    /**
    * 数据页数，大于等于1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页显示的数据条数，最小为10条，最大为200 条
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 授权数据总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 总页数
    */
    @SerializedName("TotalPageNumber")
    @Expose
    private Long TotalPageNumber;

    /**
    * 授权信息列表
    */
    @SerializedName("Items")
    @Expose
    private WorkflowPermission [] Items;

    /**
     * Get 数据页数，大于等于1 
     * @return PageNumber 数据页数，大于等于1
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 数据页数，大于等于1
     * @param PageNumber 数据页数，大于等于1
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页显示的数据条数，最小为10条，最大为200 条 
     * @return PageSize 每页显示的数据条数，最小为10条，最大为200 条
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页显示的数据条数，最小为10条，最大为200 条
     * @param PageSize 每页显示的数据条数，最小为10条，最大为200 条
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 授权数据总数 
     * @return TotalCount 授权数据总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 授权数据总数
     * @param TotalCount 授权数据总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 总页数 
     * @return TotalPageNumber 总页数
     */
    public Long getTotalPageNumber() {
        return this.TotalPageNumber;
    }

    /**
     * Set 总页数
     * @param TotalPageNumber 总页数
     */
    public void setTotalPageNumber(Long TotalPageNumber) {
        this.TotalPageNumber = TotalPageNumber;
    }

    /**
     * Get 授权信息列表 
     * @return Items 授权信息列表
     */
    public WorkflowPermission [] getItems() {
        return this.Items;
    }

    /**
     * Set 授权信息列表
     * @param Items 授权信息列表
     */
    public void setItems(WorkflowPermission [] Items) {
        this.Items = Items;
    }

    public WorkflowPermissionPage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowPermissionPage(WorkflowPermissionPage source) {
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
        if (source.Items != null) {
            this.Items = new WorkflowPermission[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new WorkflowPermission(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalPageNumber", this.TotalPageNumber);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

