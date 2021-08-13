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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNatFwVpcDnsLstRequest extends AbstractModel{

    /**
    * natfw 防火墙实例id
    */
    @SerializedName("NatFwInsId")
    @Expose
    private String NatFwInsId;

    /**
    * natfw 过滤，以','分隔
    */
    @SerializedName("NatInsIdFilter")
    @Expose
    private String NatInsIdFilter;

    /**
    * 分页页数
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页最多个数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get natfw 防火墙实例id 
     * @return NatFwInsId natfw 防火墙实例id
     */
    public String getNatFwInsId() {
        return this.NatFwInsId;
    }

    /**
     * Set natfw 防火墙实例id
     * @param NatFwInsId natfw 防火墙实例id
     */
    public void setNatFwInsId(String NatFwInsId) {
        this.NatFwInsId = NatFwInsId;
    }

    /**
     * Get natfw 过滤，以','分隔 
     * @return NatInsIdFilter natfw 过滤，以','分隔
     */
    public String getNatInsIdFilter() {
        return this.NatInsIdFilter;
    }

    /**
     * Set natfw 过滤，以','分隔
     * @param NatInsIdFilter natfw 过滤，以','分隔
     */
    public void setNatInsIdFilter(String NatInsIdFilter) {
        this.NatInsIdFilter = NatInsIdFilter;
    }

    /**
     * Get 分页页数 
     * @return Offset 分页页数
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页页数
     * @param Offset 分页页数
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页最多个数 
     * @return Limit 每页最多个数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页最多个数
     * @param Limit 每页最多个数
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

