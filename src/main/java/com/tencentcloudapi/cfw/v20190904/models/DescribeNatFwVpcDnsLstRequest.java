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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNatFwVpcDnsLstRequest extends AbstractModel {

    /**
    * <p>natfw 防火墙实例id</p>
    */
    @SerializedName("NatFwInsId")
    @Expose
    private String NatFwInsId;

    /**
    * <p>natfw 过滤，以&#39;,&#39;分隔</p>
    */
    @SerializedName("NatInsIdFilter")
    @Expose
    private String NatInsIdFilter;

    /**
    * <p>分页页数</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>每页最多个数</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>natfw 防火墙实例id</p> 
     * @return NatFwInsId <p>natfw 防火墙实例id</p>
     */
    public String getNatFwInsId() {
        return this.NatFwInsId;
    }

    /**
     * Set <p>natfw 防火墙实例id</p>
     * @param NatFwInsId <p>natfw 防火墙实例id</p>
     */
    public void setNatFwInsId(String NatFwInsId) {
        this.NatFwInsId = NatFwInsId;
    }

    /**
     * Get <p>natfw 过滤，以&#39;,&#39;分隔</p> 
     * @return NatInsIdFilter <p>natfw 过滤，以&#39;,&#39;分隔</p>
     */
    public String getNatInsIdFilter() {
        return this.NatInsIdFilter;
    }

    /**
     * Set <p>natfw 过滤，以&#39;,&#39;分隔</p>
     * @param NatInsIdFilter <p>natfw 过滤，以&#39;,&#39;分隔</p>
     */
    public void setNatInsIdFilter(String NatInsIdFilter) {
        this.NatInsIdFilter = NatInsIdFilter;
    }

    /**
     * Get <p>分页页数</p> 
     * @return Offset <p>分页页数</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页页数</p>
     * @param Offset <p>分页页数</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>每页最多个数</p> 
     * @return Limit <p>每页最多个数</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页最多个数</p>
     * @param Limit <p>每页最多个数</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeNatFwVpcDnsLstRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatFwVpcDnsLstRequest(DescribeNatFwVpcDnsLstRequest source) {
        if (source.NatFwInsId != null) {
            this.NatFwInsId = new String(source.NatFwInsId);
        }
        if (source.NatInsIdFilter != null) {
            this.NatInsIdFilter = new String(source.NatInsIdFilter);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatFwInsId", this.NatFwInsId);
        this.setParamSimple(map, prefix + "NatInsIdFilter", this.NatInsIdFilter);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

