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

public class DescribeHostsRequest extends AbstractModel {

    /**
    * 防护域名，如果是要查询某一具体的防护域名则传入此参数，要求是准确的域名，此参数不支持模糊搜索
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 防护域名ID，如果是要查询某一具体的防护域名则传入此参数，要求是准确的域名ID，此参数不支持模糊搜索
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * 搜索条件，根据此参数对域名做模糊搜索
    */
    @SerializedName("Search")
    @Expose
    private String Search;

    /**
    * 复杂的搜索条件
    */
    @SerializedName("Item")
    @Expose
    private SearchItem Item;

    /**
    * 实例id
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
     * Get 防护域名，如果是要查询某一具体的防护域名则传入此参数，要求是准确的域名，此参数不支持模糊搜索 
     * @return Domain 防护域名，如果是要查询某一具体的防护域名则传入此参数，要求是准确的域名，此参数不支持模糊搜索
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 防护域名，如果是要查询某一具体的防护域名则传入此参数，要求是准确的域名，此参数不支持模糊搜索
     * @param Domain 防护域名，如果是要查询某一具体的防护域名则传入此参数，要求是准确的域名，此参数不支持模糊搜索
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 防护域名ID，如果是要查询某一具体的防护域名则传入此参数，要求是准确的域名ID，此参数不支持模糊搜索 
     * @return DomainId 防护域名ID，如果是要查询某一具体的防护域名则传入此参数，要求是准确的域名ID，此参数不支持模糊搜索
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 防护域名ID，如果是要查询某一具体的防护域名则传入此参数，要求是准确的域名ID，此参数不支持模糊搜索
     * @param DomainId 防护域名ID，如果是要查询某一具体的防护域名则传入此参数，要求是准确的域名ID，此参数不支持模糊搜索
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 搜索条件，根据此参数对域名做模糊搜索 
     * @return Search 搜索条件，根据此参数对域名做模糊搜索
     */
    public String getSearch() {
        return this.Search;
    }

    /**
     * Set 搜索条件，根据此参数对域名做模糊搜索
     * @param Search 搜索条件，根据此参数对域名做模糊搜索
     */
    public void setSearch(String Search) {
        this.Search = Search;
    }

    /**
     * Get 复杂的搜索条件 
     * @return Item 复杂的搜索条件
     */
    public SearchItem getItem() {
        return this.Item;
    }

    /**
     * Set 复杂的搜索条件
     * @param Item 复杂的搜索条件
     */
    public void setItem(SearchItem Item) {
        this.Item = Item;
    }

    /**
     * Get 实例id 
     * @return InstanceID 实例id
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 实例id
     * @param InstanceID 实例id
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    public DescribeHostsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHostsRequest(DescribeHostsRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.Search != null) {
            this.Search = new String(source.Search);
        }
        if (source.Item != null) {
            this.Item = new SearchItem(source.Item);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "Search", this.Search);
        this.setParamObj(map, prefix + "Item.", this.Item);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);

    }
}

