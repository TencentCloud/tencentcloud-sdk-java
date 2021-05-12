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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRulesRequest extends AbstractModel{

    /**
    * 当前页号，不传则返回第一页
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 单页大小，最大 30，不填默认30
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 查询类型（可选）：match表示通过matchCode或者matchName来搜索，rule表示通过ruleCode或者ruleName来搜索，其余类型不做过滤处理。
    */
    @SerializedName("SearchType")
    @Expose
    private String SearchType;

    /**
    * 查询关键词，针对SearchType进行具体过滤的内容。
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 标签列表，用于过滤。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 当前页号，不传则返回第一页 
     * @return PageNumber 当前页号，不传则返回第一页
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 当前页号，不传则返回第一页
     * @param PageNumber 当前页号，不传则返回第一页
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 单页大小，最大 30，不填默认30 
     * @return PageSize 单页大小，最大 30，不填默认30
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 单页大小，最大 30，不填默认30
     * @param PageSize 单页大小，最大 30，不填默认30
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 查询类型（可选）：match表示通过matchCode或者matchName来搜索，rule表示通过ruleCode或者ruleName来搜索，其余类型不做过滤处理。 
     * @return SearchType 查询类型（可选）：match表示通过matchCode或者matchName来搜索，rule表示通过ruleCode或者ruleName来搜索，其余类型不做过滤处理。
     */
    public String getSearchType() {
        return this.SearchType;
    }

    /**
     * Set 查询类型（可选）：match表示通过matchCode或者matchName来搜索，rule表示通过ruleCode或者ruleName来搜索，其余类型不做过滤处理。
     * @param SearchType 查询类型（可选）：match表示通过matchCode或者matchName来搜索，rule表示通过ruleCode或者ruleName来搜索，其余类型不做过滤处理。
     */
    public void setSearchType(String SearchType) {
        this.SearchType = SearchType;
    }

    /**
     * Get 查询关键词，针对SearchType进行具体过滤的内容。 
     * @return Keyword 查询关键词，针对SearchType进行具体过滤的内容。
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 查询关键词，针对SearchType进行具体过滤的内容。
     * @param Keyword 查询关键词，针对SearchType进行具体过滤的内容。
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 标签列表，用于过滤。 
     * @return Tags 标签列表，用于过滤。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表，用于过滤。
     * @param Tags 标签列表，用于过滤。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public DescribeRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRulesRequest(DescribeRulesRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.SearchType != null) {
            this.SearchType = new String(source.SearchType);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "SearchType", this.SearchType);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

