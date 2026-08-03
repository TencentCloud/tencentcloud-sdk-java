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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListExamplesRequest extends AbstractModel {

    /**
    * <p>分类</p>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>关键词</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>标签数组，多个标签 AND 关系；与 Category/Keyword 之间也是 AND</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>DEFAULT（sort_order ASC, create_time DESC）/ POPULARITY（按热度降序），非法值降级为 DEFAULT</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>当前页码（从1开始）</p>
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * <p>页数</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get <p>分类</p> 
     * @return Category <p>分类</p>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>分类</p>
     * @param Category <p>分类</p>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>关键词</p> 
     * @return Keyword <p>关键词</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>关键词</p>
     * @param Keyword <p>关键词</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>标签数组，多个标签 AND 关系；与 Category/Keyword 之间也是 AND</p> 
     * @return Tags <p>标签数组，多个标签 AND 关系；与 Category/Keyword 之间也是 AND</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签数组，多个标签 AND 关系；与 Category/Keyword 之间也是 AND</p>
     * @param Tags <p>标签数组，多个标签 AND 关系；与 Category/Keyword 之间也是 AND</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>DEFAULT（sort_order ASC, create_time DESC）/ POPULARITY（按热度降序），非法值降级为 DEFAULT</p> 
     * @return OrderBy <p>DEFAULT（sort_order ASC, create_time DESC）/ POPULARITY（按热度降序），非法值降级为 DEFAULT</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>DEFAULT（sort_order ASC, create_time DESC）/ POPULARITY（按热度降序），非法值降级为 DEFAULT</p>
     * @param OrderBy <p>DEFAULT（sort_order ASC, create_time DESC）/ POPULARITY（按热度降序），非法值降级为 DEFAULT</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>当前页码（从1开始）</p> 
     * @return Page <p>当前页码（从1开始）</p>
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set <p>当前页码（从1开始）</p>
     * @param Page <p>当前页码（从1开始）</p>
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get <p>页数</p> 
     * @return PageSize <p>页数</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>页数</p>
     * @param PageSize <p>页数</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public ListExamplesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListExamplesRequest(ListExamplesRequest source) {
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

