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

public class DescribePluginInstancesRequest extends AbstractModel{

    /**
    * 分组或者API的ID
    */
    @SerializedName("ScopeValue")
    @Expose
    private String ScopeValue;

    /**
    * 绑定: true; 未绑定: false
    */
    @SerializedName("Bound")
    @Expose
    private Boolean Bound;

    /**
    * 翻页偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页展示的条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 插件类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 搜索关键字
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
     * Get 分组或者API的ID 
     * @return ScopeValue 分组或者API的ID
     */
    public String getScopeValue() {
        return this.ScopeValue;
    }

    /**
     * Set 分组或者API的ID
     * @param ScopeValue 分组或者API的ID
     */
    public void setScopeValue(String ScopeValue) {
        this.ScopeValue = ScopeValue;
    }

    /**
     * Get 绑定: true; 未绑定: false 
     * @return Bound 绑定: true; 未绑定: false
     */
    public Boolean getBound() {
        return this.Bound;
    }

    /**
     * Set 绑定: true; 未绑定: false
     * @param Bound 绑定: true; 未绑定: false
     */
    public void setBound(Boolean Bound) {
        this.Bound = Bound;
    }

    /**
     * Get 翻页偏移量 
     * @return Offset 翻页偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 翻页偏移量
     * @param Offset 翻页偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页展示的条数 
     * @return Limit 每页展示的条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页展示的条数
     * @param Limit 每页展示的条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 插件类型 
     * @return Type 插件类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 插件类型
     * @param Type 插件类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 搜索关键字 
     * @return SearchWord 搜索关键字
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 搜索关键字
     * @param SearchWord 搜索关键字
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    public DescribePluginInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePluginInstancesRequest(DescribePluginInstancesRequest source) {
        if (source.ScopeValue != null) {
            this.ScopeValue = new String(source.ScopeValue);
        }
        if (source.Bound != null) {
            this.Bound = new Boolean(source.Bound);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScopeValue", this.ScopeValue);
        this.setParamSimple(map, prefix + "Bound", this.Bound);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);

    }
}

