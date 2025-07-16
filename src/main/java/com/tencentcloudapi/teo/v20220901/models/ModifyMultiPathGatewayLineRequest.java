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

public class ModifyMultiPathGatewayLineRequest extends AbstractModel {

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 多通道安全加速网关 ID 。
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 线路 ID ， 取值有:
<li> line-1： EdgeOne 四层代理线路，支持修改实例和规则，不支持删除；</li>
<li> line-2 及以上：EdgeOne 四层代理线路或者自定义线路，支持修改、删除实例和规则。</li>
    */
    @SerializedName("LineId")
    @Expose
    private String LineId;

    /**
    * 线路类型，取值有： 
<li>proxy ：EdgeOne 四层代理线路，支持修改实例和规则，不支持删除；</li> 
<li>custom ：自定义线路，支持编辑、删除实例和规则。</li>
    */
    @SerializedName("LineType")
    @Expose
    private String LineType;

    /**
    * 线路地址，格式为 host:port，直连线路（ LineType 取值为 direct ）不允许修改，其余类型支持修改。
    */
    @SerializedName("LineAddress")
    @Expose
    private String LineAddress;

    /**
    * 四层代理实例 ID  ，当线路类型 LineType  取值为 proxy（EdgeOne 四层代理）可传入，进行修改。
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * 转发规则 ID ，当线路类型 LineType 取值为 proxy（EdgeOne 四层代理）可传入，进行修改。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
     * Get 站点 ID。 
     * @return ZoneId 站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。
     * @param ZoneId 站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 多通道安全加速网关 ID 。 
     * @return GatewayId 多通道安全加速网关 ID 。
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 多通道安全加速网关 ID 。
     * @param GatewayId 多通道安全加速网关 ID 。
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 线路 ID ， 取值有:
<li> line-1： EdgeOne 四层代理线路，支持修改实例和规则，不支持删除；</li>
<li> line-2 及以上：EdgeOne 四层代理线路或者自定义线路，支持修改、删除实例和规则。</li> 
     * @return LineId 线路 ID ， 取值有:
<li> line-1： EdgeOne 四层代理线路，支持修改实例和规则，不支持删除；</li>
<li> line-2 及以上：EdgeOne 四层代理线路或者自定义线路，支持修改、删除实例和规则。</li>
     */
    public String getLineId() {
        return this.LineId;
    }

    /**
     * Set 线路 ID ， 取值有:
<li> line-1： EdgeOne 四层代理线路，支持修改实例和规则，不支持删除；</li>
<li> line-2 及以上：EdgeOne 四层代理线路或者自定义线路，支持修改、删除实例和规则。</li>
     * @param LineId 线路 ID ， 取值有:
<li> line-1： EdgeOne 四层代理线路，支持修改实例和规则，不支持删除；</li>
<li> line-2 及以上：EdgeOne 四层代理线路或者自定义线路，支持修改、删除实例和规则。</li>
     */
    public void setLineId(String LineId) {
        this.LineId = LineId;
    }

    /**
     * Get 线路类型，取值有： 
<li>proxy ：EdgeOne 四层代理线路，支持修改实例和规则，不支持删除；</li> 
<li>custom ：自定义线路，支持编辑、删除实例和规则。</li> 
     * @return LineType 线路类型，取值有： 
<li>proxy ：EdgeOne 四层代理线路，支持修改实例和规则，不支持删除；</li> 
<li>custom ：自定义线路，支持编辑、删除实例和规则。</li>
     */
    public String getLineType() {
        return this.LineType;
    }

    /**
     * Set 线路类型，取值有： 
<li>proxy ：EdgeOne 四层代理线路，支持修改实例和规则，不支持删除；</li> 
<li>custom ：自定义线路，支持编辑、删除实例和规则。</li>
     * @param LineType 线路类型，取值有： 
<li>proxy ：EdgeOne 四层代理线路，支持修改实例和规则，不支持删除；</li> 
<li>custom ：自定义线路，支持编辑、删除实例和规则。</li>
     */
    public void setLineType(String LineType) {
        this.LineType = LineType;
    }

    /**
     * Get 线路地址，格式为 host:port，直连线路（ LineType 取值为 direct ）不允许修改，其余类型支持修改。 
     * @return LineAddress 线路地址，格式为 host:port，直连线路（ LineType 取值为 direct ）不允许修改，其余类型支持修改。
     */
    public String getLineAddress() {
        return this.LineAddress;
    }

    /**
     * Set 线路地址，格式为 host:port，直连线路（ LineType 取值为 direct ）不允许修改，其余类型支持修改。
     * @param LineAddress 线路地址，格式为 host:port，直连线路（ LineType 取值为 direct ）不允许修改，其余类型支持修改。
     */
    public void setLineAddress(String LineAddress) {
        this.LineAddress = LineAddress;
    }

    /**
     * Get 四层代理实例 ID  ，当线路类型 LineType  取值为 proxy（EdgeOne 四层代理）可传入，进行修改。 
     * @return ProxyId 四层代理实例 ID  ，当线路类型 LineType  取值为 proxy（EdgeOne 四层代理）可传入，进行修改。
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set 四层代理实例 ID  ，当线路类型 LineType  取值为 proxy（EdgeOne 四层代理）可传入，进行修改。
     * @param ProxyId 四层代理实例 ID  ，当线路类型 LineType  取值为 proxy（EdgeOne 四层代理）可传入，进行修改。
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get 转发规则 ID ，当线路类型 LineType 取值为 proxy（EdgeOne 四层代理）可传入，进行修改。 
     * @return RuleId 转发规则 ID ，当线路类型 LineType 取值为 proxy（EdgeOne 四层代理）可传入，进行修改。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 转发规则 ID ，当线路类型 LineType 取值为 proxy（EdgeOne 四层代理）可传入，进行修改。
     * @param RuleId 转发规则 ID ，当线路类型 LineType 取值为 proxy（EdgeOne 四层代理）可传入，进行修改。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    public ModifyMultiPathGatewayLineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMultiPathGatewayLineRequest(ModifyMultiPathGatewayLineRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.LineId != null) {
            this.LineId = new String(source.LineId);
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
        this.setParamSimple(map, prefix + "LineId", this.LineId);
        this.setParamSimple(map, prefix + "LineType", this.LineType);
        this.setParamSimple(map, prefix + "LineAddress", this.LineAddress);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

