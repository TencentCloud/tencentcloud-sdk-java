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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCategoryListRequest extends AbstractModel {

    /**
    * <p>所属知识库 ID</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>过滤条件（多个 Filter 之间为 AND 关系，同一 Filter 的多个 Values 为 OR 关系）：CategoryType-分类类型,枚举值,精确匹配(CATEGORY_TYPE_DOC=1/CATEGORY_TYPE_QA=2); ParentCategoryId-父分类ID,精确匹配</p>
    */
    @SerializedName("FilterList")
    @Expose
    private Filter [] FilterList;

    /**
    * <p>分页页码，从 0 开始</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页数量，默认 10，最大 100</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>关键词搜索</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p>开关配置</p>
    */
    @SerializedName("SummaryListSwitch")
    @Expose
    private SummaryListSwitch SummaryListSwitch;

    /**
     * Get <p>所属知识库 ID</p> 
     * @return KbId <p>所属知识库 ID</p>
     */
    public String getKbId() {
        return this.KbId;
    }

    /**
     * Set <p>所属知识库 ID</p>
     * @param KbId <p>所属知识库 ID</p>
     */
    public void setKbId(String KbId) {
        this.KbId = KbId;
    }

    /**
     * Get <p>过滤条件（多个 Filter 之间为 AND 关系，同一 Filter 的多个 Values 为 OR 关系）：CategoryType-分类类型,枚举值,精确匹配(CATEGORY_TYPE_DOC=1/CATEGORY_TYPE_QA=2); ParentCategoryId-父分类ID,精确匹配</p> 
     * @return FilterList <p>过滤条件（多个 Filter 之间为 AND 关系，同一 Filter 的多个 Values 为 OR 关系）：CategoryType-分类类型,枚举值,精确匹配(CATEGORY_TYPE_DOC=1/CATEGORY_TYPE_QA=2); ParentCategoryId-父分类ID,精确匹配</p>
     */
    public Filter [] getFilterList() {
        return this.FilterList;
    }

    /**
     * Set <p>过滤条件（多个 Filter 之间为 AND 关系，同一 Filter 的多个 Values 为 OR 关系）：CategoryType-分类类型,枚举值,精确匹配(CATEGORY_TYPE_DOC=1/CATEGORY_TYPE_QA=2); ParentCategoryId-父分类ID,精确匹配</p>
     * @param FilterList <p>过滤条件（多个 Filter 之间为 AND 关系，同一 Filter 的多个 Values 为 OR 关系）：CategoryType-分类类型,枚举值,精确匹配(CATEGORY_TYPE_DOC=1/CATEGORY_TYPE_QA=2); ParentCategoryId-父分类ID,精确匹配</p>
     */
    public void setFilterList(Filter [] FilterList) {
        this.FilterList = FilterList;
    }

    /**
     * Get <p>分页页码，从 0 开始</p> 
     * @return PageNumber <p>分页页码，从 0 开始</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>分页页码，从 0 开始</p>
     * @param PageNumber <p>分页页码，从 0 开始</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页数量，默认 10，最大 100</p> 
     * @return PageSize <p>每页数量，默认 10，最大 100</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页数量，默认 10，最大 100</p>
     * @param PageSize <p>每页数量，默认 10，最大 100</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>关键词搜索</p> 
     * @return Query <p>关键词搜索</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>关键词搜索</p>
     * @param Query <p>关键词搜索</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p>开关配置</p> 
     * @return SummaryListSwitch <p>开关配置</p>
     */
    public SummaryListSwitch getSummaryListSwitch() {
        return this.SummaryListSwitch;
    }

    /**
     * Set <p>开关配置</p>
     * @param SummaryListSwitch <p>开关配置</p>
     */
    public void setSummaryListSwitch(SummaryListSwitch SummaryListSwitch) {
        this.SummaryListSwitch = SummaryListSwitch;
    }

    public DescribeCategoryListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCategoryListRequest(DescribeCategoryListRequest source) {
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
        if (source.FilterList != null) {
            this.FilterList = new Filter[source.FilterList.length];
            for (int i = 0; i < source.FilterList.length; i++) {
                this.FilterList[i] = new Filter(source.FilterList[i]);
            }
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.SummaryListSwitch != null) {
            this.SummaryListSwitch = new SummaryListSwitch(source.SummaryListSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamArrayObj(map, prefix + "FilterList.", this.FilterList);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamObj(map, prefix + "SummaryListSwitch.", this.SummaryListSwitch);

    }
}

