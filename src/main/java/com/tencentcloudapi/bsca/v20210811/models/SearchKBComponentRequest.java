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
package com.tencentcloudapi.bsca.v20210811.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchKBComponentRequest extends AbstractModel{

    /**
    * 需要搜索的组件名
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 需要搜索的组件类型
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 分页参数，从 0 开始
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 分页参数，设置每页返回的结果数量
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 需要搜索的组件名 
     * @return Query 需要搜索的组件名
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 需要搜索的组件名
     * @param Query 需要搜索的组件名
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 需要搜索的组件类型 
     * @return Protocol 需要搜索的组件类型
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 需要搜索的组件类型
     * @param Protocol 需要搜索的组件类型
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 分页参数，从 0 开始 
     * @return PageNumber 分页参数，从 0 开始
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页参数，从 0 开始
     * @param PageNumber 分页参数，从 0 开始
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 分页参数，设置每页返回的结果数量 
     * @return PageSize 分页参数，设置每页返回的结果数量
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页参数，设置每页返回的结果数量
     * @param PageSize 分页参数，设置每页返回的结果数量
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public SearchKBComponentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchKBComponentRequest(SearchKBComponentRequest source) {
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

