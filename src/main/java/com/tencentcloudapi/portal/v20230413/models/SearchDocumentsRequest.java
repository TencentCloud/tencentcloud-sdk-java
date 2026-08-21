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
package com.tencentcloudapi.portal.v20230413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchDocumentsRequest extends AbstractModel {

    /**
    * <p>搜索关键词</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p>页码</p><p>取值范围：[1, 99]</p>
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * <p>每页条数</p><p>取值范围：[1, 20]</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>产品名称</p>
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
     * Get <p>搜索关键词</p> 
     * @return Query <p>搜索关键词</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>搜索关键词</p>
     * @param Query <p>搜索关键词</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p>页码</p><p>取值范围：[1, 99]</p> 
     * @return Page <p>页码</p><p>取值范围：[1, 99]</p>
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set <p>页码</p><p>取值范围：[1, 99]</p>
     * @param Page <p>页码</p><p>取值范围：[1, 99]</p>
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get <p>每页条数</p><p>取值范围：[1, 20]</p> 
     * @return PageSize <p>每页条数</p><p>取值范围：[1, 20]</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页条数</p><p>取值范围：[1, 20]</p>
     * @param PageSize <p>每页条数</p><p>取值范围：[1, 20]</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>产品名称</p> 
     * @return ProductName <p>产品名称</p>
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set <p>产品名称</p>
     * @param ProductName <p>产品名称</p>
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public SearchDocumentsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchDocumentsRequest(SearchDocumentsRequest source) {
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);

    }
}

