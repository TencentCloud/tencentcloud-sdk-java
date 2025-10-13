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

public class ListCatalogPage extends AbstractModel {

    /**
    * 目录记录列表
    */
    @SerializedName("Items")
    @Expose
    private CatalogInfo [] Items;

    /**
    * 分页总页数
    */
    @SerializedName("PageCount")
    @Expose
    private Long PageCount;

    /**
    * 分页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 分页页码
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 记录总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get 目录记录列表 
     * @return Items 目录记录列表
     */
    public CatalogInfo [] getItems() {
        return this.Items;
    }

    /**
     * Set 目录记录列表
     * @param Items 目录记录列表
     */
    public void setItems(CatalogInfo [] Items) {
        this.Items = Items;
    }

    /**
     * Get 分页总页数 
     * @return PageCount 分页总页数
     */
    public Long getPageCount() {
        return this.PageCount;
    }

    /**
     * Set 分页总页数
     * @param PageCount 分页总页数
     */
    public void setPageCount(Long PageCount) {
        this.PageCount = PageCount;
    }

    /**
     * Get 分页大小 
     * @return PageSize 分页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小
     * @param PageSize 分页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 分页页码 
     * @return PageNumber 分页页码
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页页码
     * @param PageNumber 分页页码
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 记录总数 
     * @return TotalCount 记录总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 记录总数
     * @param TotalCount 记录总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public ListCatalogPage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListCatalogPage(ListCatalogPage source) {
        if (source.Items != null) {
            this.Items = new CatalogInfo[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new CatalogInfo(source.Items[i]);
            }
        }
        if (source.PageCount != null) {
            this.PageCount = new Long(source.PageCount);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "PageCount", this.PageCount);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

