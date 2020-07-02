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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRepositoriesRequest extends AbstractModel{

    /**
    * 查询关键字（按照仓库名称搜索）
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 查询起始偏移
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量限制
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 仓库类型（默认仓库：default，私有仓库：private）
    */
    @SerializedName("RepositoryType")
    @Expose
    private String RepositoryType;

    /**
     * Get 查询关键字（按照仓库名称搜索） 
     * @return SearchWord 查询关键字（按照仓库名称搜索）
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 查询关键字（按照仓库名称搜索）
     * @param SearchWord 查询关键字（按照仓库名称搜索）
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get 查询起始偏移 
     * @return Offset 查询起始偏移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询起始偏移
     * @param Offset 查询起始偏移
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量限制 
     * @return Limit 返回数量限制
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量限制
     * @param Limit 返回数量限制
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 仓库类型（默认仓库：default，私有仓库：private） 
     * @return RepositoryType 仓库类型（默认仓库：default，私有仓库：private）
     */
    public String getRepositoryType() {
        return this.RepositoryType;
    }

    /**
     * Set 仓库类型（默认仓库：default，私有仓库：private）
     * @param RepositoryType 仓库类型（默认仓库：default，私有仓库：private）
     */
    public void setRepositoryType(String RepositoryType) {
        this.RepositoryType = RepositoryType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "RepositoryType", this.RepositoryType);

    }
}

