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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchAttackLogRequest extends AbstractModel {

    /**
    * 查询的域名，所有域名使用all
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 查询起始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 接口升级，这个字段传空字符串,翻页使用Page字段
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * Lucene语法
    */
    @SerializedName("QueryString")
    @Expose
    private String QueryString;

    /**
    * 查询的数量，默认10条，最多100条
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 默认为desc，可以取值desc和asc
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * 第几页，从0开始
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
     * Get 查询的域名，所有域名使用all 
     * @return Domain 查询的域名，所有域名使用all
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 查询的域名，所有域名使用all
     * @param Domain 查询的域名，所有域名使用all
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 查询起始时间 
     * @return StartTime 查询起始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询起始时间
     * @param StartTime 查询起始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束时间 
     * @return EndTime 查询结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间
     * @param EndTime 查询结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 接口升级，这个字段传空字符串,翻页使用Page字段 
     * @return Context 接口升级，这个字段传空字符串,翻页使用Page字段
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 接口升级，这个字段传空字符串,翻页使用Page字段
     * @param Context 接口升级，这个字段传空字符串,翻页使用Page字段
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get Lucene语法 
     * @return QueryString Lucene语法
     */
    public String getQueryString() {
        return this.QueryString;
    }

    /**
     * Set Lucene语法
     * @param QueryString Lucene语法
     */
    public void setQueryString(String QueryString) {
        this.QueryString = QueryString;
    }

    /**
     * Get 查询的数量，默认10条，最多100条 
     * @return Count 查询的数量，默认10条，最多100条
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 查询的数量，默认10条，最多100条
     * @param Count 查询的数量，默认10条，最多100条
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 默认为desc，可以取值desc和asc 
     * @return Sort 默认为desc，可以取值desc和asc
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set 默认为desc，可以取值desc和asc
     * @param Sort 默认为desc，可以取值desc和asc
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 第几页，从0开始 
     * @return Page 第几页，从0开始
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 第几页，从0开始
     * @param Page 第几页，从0开始
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    public SearchAttackLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchAttackLogRequest(SearchAttackLogRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.QueryString != null) {
            this.QueryString = new String(source.QueryString);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "QueryString", this.QueryString);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Page", this.Page);

    }
}

