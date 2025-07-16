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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMultiPathGatewayLineRequest extends AbstractModel {

    /**
    * 站点 ID 。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 多通道安全网关 ID 。
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 线路类型，取值有：
 <li>direct ：直连线路，不支持修改和删除。</li> <li>proxy ：EdgeOne 四层代理线路，支持修改实例 ID 和规则 ID，不支持删除。</li> <li>custom ：自定义线路，支持修改、删除实例 ID 和规则 ID。</li>
    */
    @SerializedName("LineType")
    @Expose
    private String LineType;

    /**
    * 线路地址，格式为 ip:port。
    */
    @SerializedName("LineAddress")
    @Expose
    private String LineAddress;

    /**
    * 四层代理实例 ID，当线路类型 LineType 取值为 proxy（EdgeOne 四层代理）必传，可由接口 [DescribeL4Proxy](https://cloud.tencent.com/document/api/1552/103413) 获取。
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * 转发规则 ID ，当线路类型 LineType 取值为 proxy（EdgeOne 四层代理）必传，可以从接口 [DescribeL4ProxyRules](https://cloud.tencent.com/document/api/1552/103412) 获取。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
     * Get 站点 ID 。 
     * @return ZoneId 站点 ID 。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID 。
     * @param ZoneId 站点 ID 。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 多通道安全网关 ID 。 
     * @return GatewayId 多通道安全网关 ID 。
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 多通道安全网关 ID 。
     * @param GatewayId 多通道安全网关 ID 。
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 线路类型，取值有：
 <li>direct ：直连线路，不支持修改和删除。</li> <li>proxy ：EdgeOne 四层代理线路，支持修改实例 ID 和规则 ID，不支持删除。</li> <li>custom ：自定义线路，支持修改、删除实例 ID 和规则 ID。</li> 
     * @return LineType 线路类型，取值有：
 <li>direct ：直连线路，不支持修改和删除。</li> <li>proxy ：EdgeOne 四层代理线路，支持修改实例 ID 和规则 ID，不支持删除。</li> <li>custom ：自定义线路，支持修改、删除实例 ID 和规则 ID。</li>
     */
    public String getLineType() {
        return this.LineType;
    }

    /**
     * Set 线路类型，取值有：
 <li>direct ：直连线路，不支持修改和删除。</li> <li>proxy ：EdgeOne 四层代理线路，支持修改实例 ID 和规则 ID，不支持删除。</li> <li>custom ：自定义线路，支持修改、删除实例 ID 和规则 ID。</li>
     * @param LineType 线路类型，取值有：
 <li>direct ：直连线路，不支持修改和删除。</li> <li>proxy ：EdgeOne 四层代理线路，支持修改实例 ID 和规则 ID，不支持删除。</li> <li>custom ：自定义线路，支持修改、删除实例 ID 和规则 ID。</li>
     */
    public void setLineType(String LineType) {
        this.LineType = LineType;
    }

    /**
     * Get 线路地址，格式为 ip:port。 
     * @return LineAddress 线路地址，格式为 ip:port。
     */
    public String getLineAddress() {
        return this.LineAddress;
    }

    /**
     * Set 线路地址，格式为 ip:port。
     * @param LineAddress 线路地址，格式为 ip:port。
     */
    public void setLineAddress(String LineAddress) {
        this.LineAddress = LineAddress;
    }

    /**
     * Get 四层代理实例 ID，当线路类型 LineType 取值为 proxy（EdgeOne 四层代理）必传，可由接口 [DescribeL4Proxy](https://cloud.tencent.com/document/api/1552/103413) 获取。 
     * @return ProxyId 四层代理实例 ID，当线路类型 LineType 取值为 proxy（EdgeOne 四层代理）必传，可由接口 [DescribeL4Proxy](https://cloud.tencent.com/document/api/1552/103413) 获取。
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set 四层代理实例 ID，当线路类型 LineType 取值为 proxy（EdgeOne 四层代理）必传，可由接口 [DescribeL4Proxy](https://cloud.tencent.com/document/api/1552/103413) 获取。
     * @param ProxyId 四层代理实例 ID，当线路类型 LineType 取值为 proxy（EdgeOne 四层代理）必传，可由接口 [DescribeL4Proxy](https://cloud.tencent.com/document/api/1552/103413) 获取。
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get 转发规则 ID ，当线路类型 LineType 取值为 proxy（EdgeOne 四层代理）必传，可以从接口 [DescribeL4ProxyRules](https://cloud.tencent.com/document/api/1552/103412) 获取。 
     * @return RuleId 转发规则 ID ，当线路类型 LineType 取值为 proxy（EdgeOne 四层代理）必传，可以从接口 [DescribeL4ProxyRules](https://cloud.tencent.com/document/api/1552/103412) 获取。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 转发规则 ID ，当线路类型 LineType 取值为 proxy（EdgeOne 四层代理）必传，可以从接口 [DescribeL4ProxyRules](https://cloud.tencent.com/document/api/1552/103412) 获取。
     * @param RuleId 转发规则 ID ，当线路类型 LineType 取值为 proxy（EdgeOne 四层代理）必传，可以从接口 [DescribeL4ProxyRules](https://cloud.tencent.com/document/api/1552/103412) 获取。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    public CreateMultiPathGatewayLineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMultiPathGatewayLineRequest(CreateMultiPathGatewayLineRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.LineType != null) {
            this.LineType = new String(source.LineType);
        }
        if (source.LineAddress != null) {
            this.LineAddress = new String(source.LineAddress);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "LineType", this.LineType);
        this.setParamSimple(map, prefix + "LineAddress", this.LineAddress);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

