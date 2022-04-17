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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainWhiteRulesRequest extends AbstractModel{

    /**
    * 需要查询的域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 请求的白名单匹配路径
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 翻到多少页
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 每页展示的条数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 排序方式
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
     * Get 需要查询的域名 
     * @return Domain 需要查询的域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 需要查询的域名
     * @param Domain 需要查询的域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 请求的白名单匹配路径 
     * @return Url 请求的白名单匹配路径
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 请求的白名单匹配路径
     * @param Url 请求的白名单匹配路径
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 翻到多少页 
     * @return Page 翻到多少页
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 翻到多少页
     * @param Page 翻到多少页
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 每页展示的条数 
     * @return Count 每页展示的条数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 每页展示的条数
     * @param Count 每页展示的条数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 排序方式 
     * @return Sort 排序方式
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set 排序方式
     * @param Sort 排序方式
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 规则ID 
     * @return RuleId 规则ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
     * @param RuleId 规则ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    public DescribeDomainWhiteRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainWhiteRulesRequest(DescribeDomainWhiteRulesRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

