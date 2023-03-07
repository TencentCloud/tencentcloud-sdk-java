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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryCreditAllocationHistoryRequest extends AbstractModel{

    /**
    * 客户uin
    */
    @SerializedName("ClientUin")
    @Expose
    private Long ClientUin;

    /**
    * 翻页参数，所在页数
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 翻页参数，每页数据量
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 客户uin 
     * @return ClientUin 客户uin
     */
    public Long getClientUin() {
        return this.ClientUin;
    }

    /**
     * Set 客户uin
     * @param ClientUin 客户uin
     */
    public void setClientUin(Long ClientUin) {
        this.ClientUin = ClientUin;
    }

    /**
     * Get 翻页参数，所在页数 
     * @return Page 翻页参数，所在页数
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 翻页参数，所在页数
     * @param Page 翻页参数，所在页数
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 翻页参数，每页数据量 
     * @return PageSize 翻页参数，每页数据量
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 翻页参数，每页数据量
     * @param PageSize 翻页参数，每页数据量
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public QueryCreditAllocationHistoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryCreditAllocationHistoryRequest(QueryCreditAllocationHistoryRequest source) {
        if (source.ClientUin != null) {
            this.ClientUin = new Long(source.ClientUin);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientUin", this.ClientUin);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

