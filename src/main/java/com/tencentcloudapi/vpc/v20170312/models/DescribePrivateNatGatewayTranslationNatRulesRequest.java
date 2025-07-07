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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrivateNatGatewayTranslationNatRulesRequest extends AbstractModel {

    /**
    * 私网网关唯一`ID`，形如：`intranat-xxxxxxxx`。
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * 过滤条件。
<li>OriginalIp - String - 转换规则源`IP`。</li>
<li>TranslationIp - String - 转换`IP`。</li>
<li>VpcId - String - 私网网关所在`VpcId`。</li>
<li>Description - String - 转换规则描述</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量。默认值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量。默认值为20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 私网网关唯一`ID`，形如：`intranat-xxxxxxxx`。 
     * @return NatGatewayId 私网网关唯一`ID`，形如：`intranat-xxxxxxxx`。
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * Set 私网网关唯一`ID`，形如：`intranat-xxxxxxxx`。
     * @param NatGatewayId 私网网关唯一`ID`，形如：`intranat-xxxxxxxx`。
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * Get 过滤条件。
<li>OriginalIp - String - 转换规则源`IP`。</li>
<li>TranslationIp - String - 转换`IP`。</li>
<li>VpcId - String - 私网网关所在`VpcId`。</li>
<li>Description - String - 转换规则描述</li> 
     * @return Filters 过滤条件。
<li>OriginalIp - String - 转换规则源`IP`。</li>
<li>TranslationIp - String - 转换`IP`。</li>
<li>VpcId - String - 私网网关所在`VpcId`。</li>
<li>Description - String - 转换规则描述</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>OriginalIp - String - 转换规则源`IP`。</li>
<li>TranslationIp - String - 转换`IP`。</li>
<li>VpcId - String - 私网网关所在`VpcId`。</li>
<li>Description - String - 转换规则描述</li>
     * @param Filters 过滤条件。
<li>OriginalIp - String - 转换规则源`IP`。</li>
<li>TranslationIp - String - 转换`IP`。</li>
<li>VpcId - String - 私网网关所在`VpcId`。</li>
<li>Description - String - 转换规则描述</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量。默认值为0。 
     * @return Offset 偏移量。默认值为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量。默认值为0。
     * @param Offset 偏移量。默认值为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量。默认值为20。 
     * @return Limit 返回数量。默认值为20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量。默认值为20。
     * @param Limit 返回数量。默认值为20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribePrivateNatGatewayTranslationNatRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrivateNatGatewayTranslationNatRulesRequest(DescribePrivateNatGatewayTranslationNatRulesRequest source) {
        if (source.NatGatewayId != null) {
            this.NatGatewayId = new String(source.NatGatewayId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
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
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

