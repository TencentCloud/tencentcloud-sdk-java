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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListScdnDomainsRequest extends AbstractModel{

    /**
    * 分页起始地址
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 列表分页记录条数，最大1000
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 域名信息
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * Get 分页起始地址 
     * @return Offset 分页起始地址
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页起始地址
     * @param Offset 分页起始地址
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 列表分页记录条数，最大1000 
     * @return Limit 列表分页记录条数，最大1000
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 列表分页记录条数，最大1000
     * @param Limit 列表分页记录条数，最大1000
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 域名信息 
     * @return Domain 域名信息
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名信息
     * @param Domain 域名信息
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public ListScdnDomainsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListScdnDomainsRequest(ListScdnDomainsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

