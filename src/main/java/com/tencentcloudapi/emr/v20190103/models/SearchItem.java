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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchItem extends AbstractModel{

    /**
    * 支持搜索的类型
    */
    @SerializedName("SearchType")
    @Expose
    private String SearchType;

    /**
    * 支持搜索的值
    */
    @SerializedName("SearchValue")
    @Expose
    private String SearchValue;

    /**
     * Get 支持搜索的类型 
     * @return SearchType 支持搜索的类型
     */
    public String getSearchType() {
        return this.SearchType;
    }

    /**
     * Set 支持搜索的类型
     * @param SearchType 支持搜索的类型
     */
    public void setSearchType(String SearchType) {
        this.SearchType = SearchType;
    }

    /**
     * Get 支持搜索的值 
     * @return SearchValue 支持搜索的值
     */
    public String getSearchValue() {
        return this.SearchValue;
    }

    /**
     * Set 支持搜索的值
     * @param SearchValue 支持搜索的值
     */
    public void setSearchValue(String SearchValue) {
        this.SearchValue = SearchValue;
    }

    public SearchItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchItem(SearchItem source) {
        if (source.SearchType != null) {
            this.SearchType = new String(source.SearchType);
        }
        if (source.SearchValue != null) {
            this.SearchValue = new String(source.SearchValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SearchType", this.SearchType);
        this.setParamSimple(map, prefix + "SearchValue", this.SearchValue);

    }
}

