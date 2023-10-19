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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCCRuleRequest extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 页码
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 页的数目
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序参数
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * clb-waf 或者 sparta-waf
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * 过滤条件
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 页码 
     * @return Offset 页码
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页码
     * @param Offset 页码
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 页的数目 
     * @return Limit 页的数目
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 页的数目
     * @param Limit 页的数目
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序参数 
     * @return Sort 排序参数
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set 排序参数
     * @param Sort 排序参数
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get clb-waf 或者 sparta-waf 
     * @return Edition clb-waf 或者 sparta-waf
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set clb-waf 或者 sparta-waf
     * @param Edition clb-waf 或者 sparta-waf
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get 过滤条件 
     * @return Name 过滤条件
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 过滤条件
     * @param Name 过滤条件
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public DescribeCCRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCCRuleRequest(DescribeCCRuleRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

