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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchConditionNew extends AbstractModel{

    /**
    * 查询框架，必选
    */
    @SerializedName("Instance")
    @Expose
    private SearchConditionInstanceNew Instance;

    /**
    * 查询关键字（任务Id精确匹配，任务名称模糊匹配），可选
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 排序顺序（asc，desc）
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * 排序列（costTime 运行耗时，startTime 开始时间，state 实例状态，curRunDate 数据时间）
    */
    @SerializedName("SortCol")
    @Expose
    private String SortCol;

    /**
     * Get 查询框架，必选 
     * @return Instance 查询框架，必选
     */
    public SearchConditionInstanceNew getInstance() {
        return this.Instance;
    }

    /**
     * Set 查询框架，必选
     * @param Instance 查询框架，必选
     */
    public void setInstance(SearchConditionInstanceNew Instance) {
        this.Instance = Instance;
    }

    /**
     * Get 查询关键字（任务Id精确匹配，任务名称模糊匹配），可选 
     * @return Keyword 查询关键字（任务Id精确匹配，任务名称模糊匹配），可选
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 查询关键字（任务Id精确匹配，任务名称模糊匹配），可选
     * @param Keyword 查询关键字（任务Id精确匹配，任务名称模糊匹配），可选
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 排序顺序（asc，desc） 
     * @return Sort 排序顺序（asc，desc）
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set 排序顺序（asc，desc）
     * @param Sort 排序顺序（asc，desc）
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 排序列（costTime 运行耗时，startTime 开始时间，state 实例状态，curRunDate 数据时间） 
     * @return SortCol 排序列（costTime 运行耗时，startTime 开始时间，state 实例状态，curRunDate 数据时间）
     */
    public String getSortCol() {
        return this.SortCol;
    }

    /**
     * Set 排序列（costTime 运行耗时，startTime 开始时间，state 实例状态，curRunDate 数据时间）
     * @param SortCol 排序列（costTime 运行耗时，startTime 开始时间，state 实例状态，curRunDate 数据时间）
     */
    public void setSortCol(String SortCol) {
        this.SortCol = SortCol;
    }

    public SearchConditionNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchConditionNew(SearchConditionNew source) {
        if (source.Instance != null) {
            this.Instance = new SearchConditionInstanceNew(source.Instance);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.SortCol != null) {
            this.SortCol = new String(source.SortCol);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Instance.", this.Instance);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "SortCol", this.SortCol);

    }
}

