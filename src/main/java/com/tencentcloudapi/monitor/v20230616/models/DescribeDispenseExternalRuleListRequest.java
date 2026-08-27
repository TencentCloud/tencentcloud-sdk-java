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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDispenseExternalRuleListRequest extends AbstractModel {

    /**
    * 页数
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 页面大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 转发部署地域
    */
    @SerializedName("DispenseRegions")
    @Expose
    private String [] DispenseRegions;

    /**
    * 关键字搜索规则名
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get 页数 
     * @return Page 页数
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 页数
     * @param Page 页数
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 页面大小 
     * @return PageSize 页面大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页面大小
     * @param PageSize 页面大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 转发部署地域 
     * @return DispenseRegions 转发部署地域
     */
    public String [] getDispenseRegions() {
        return this.DispenseRegions;
    }

    /**
     * Set 转发部署地域
     * @param DispenseRegions 转发部署地域
     */
    public void setDispenseRegions(String [] DispenseRegions) {
        this.DispenseRegions = DispenseRegions;
    }

    /**
     * Get 关键字搜索规则名 
     * @return Keyword 关键字搜索规则名
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 关键字搜索规则名
     * @param Keyword 关键字搜索规则名
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public DescribeDispenseExternalRuleListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDispenseExternalRuleListRequest(DescribeDispenseExternalRuleListRequest source) {
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.DispenseRegions != null) {
            this.DispenseRegions = new String[source.DispenseRegions.length];
            for (int i = 0; i < source.DispenseRegions.length; i++) {
                this.DispenseRegions[i] = new String(source.DispenseRegions[i]);
            }
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArraySimple(map, prefix + "DispenseRegions.", this.DispenseRegions);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

