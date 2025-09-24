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

public class MultiPathGateway extends AbstractModel {

    /**
    * 网关 ID。
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 网关名。
    */
    @SerializedName("GatewayName")
    @Expose
    private String GatewayName;

    /**
    * 网关类型，取值有：
<li> cloud：云上网关，腾讯云创建和管理的网关。</li>
<li> private：自有网关，用户部署的私有网关。</li>
    */
    @SerializedName("GatewayType")
    @Expose
    private String GatewayType;

    /**
    * 网关端口，范围 1～65535（除去 8888 ）。
    */
    @SerializedName("GatewayPort")
    @Expose
    private Long GatewayPort;

    /**
    * 网关状态，取值有：
<li> creating : 创建中；</li>
<li> online : 在线；</li>
<li> offline : 离线；</li>
<li> disable : 已停用。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 网关 IP， 格式为 IPv4。
    */
    @SerializedName("GatewayIP")
    @Expose
    private String GatewayIP;

    /**
    * 网关地域 Id，可以从接口 DescribeMultiPathGatewayRegions 获取 RegionId 列表。
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * 线路信息，当查询网关信息详情 DescribeMultiPathGateway 的时候会返回，当查询网关列表 DescribeMultiPathGateways 的时候不会返回。
    */
    @SerializedName("Lines")
    @Expose
    private MultiPathGatewayLine [] Lines;

    /**
    * 网关回源 IP 列表发生了变化是否需要重新确认，取值有：<li>true：回源 IP 列表发生了变化，需要确认；</li><li>false：回源 IP 列表未发生变化，无需确认。</li>
    */
    @SerializedName("NeedConfirm")
    @Expose
    private String NeedConfirm;

    /**
     * Get 网关 ID。 
     * @return GatewayId 网关 ID。
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关 ID。
     * @param GatewayId 网关 ID。
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 网关名。 
     * @return GatewayName 网关名。
     */
    public String getGatewayName() {
        return this.GatewayName;
    }

    /**
     * Set 网关名。
     * @param GatewayName 网关名。
     */
    public void setGatewayName(String GatewayName) {
        this.GatewayName = GatewayName;
    }

    /**
     * Get 网关类型，取值有：
<li> cloud：云上网关，腾讯云创建和管理的网关。</li>
<li> private：自有网关，用户部署的私有网关。</li> 
     * @return GatewayType 网关类型，取值有：
<li> cloud：云上网关，腾讯云创建和管理的网关。</li>
<li> private：自有网关，用户部署的私有网关。</li>
     */
    public String getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set 网关类型，取值有：
<li> cloud：云上网关，腾讯云创建和管理的网关。</li>
<li> private：自有网关，用户部署的私有网关。</li>
     * @param GatewayType 网关类型，取值有：
<li> cloud：云上网关，腾讯云创建和管理的网关。</li>
<li> private：自有网关，用户部署的私有网关。</li>
     */
    public void setGatewayType(String GatewayType) {
        this.GatewayType = GatewayType;
    }

    /**
     * Get 网关端口，范围 1～65535（除去 8888 ）。 
     * @return GatewayPort 网关端口，范围 1～65535（除去 8888 ）。
     */
    public Long getGatewayPort() {
        return this.GatewayPort;
    }

    /**
     * Set 网关端口，范围 1～65535（除去 8888 ）。
     * @param GatewayPort 网关端口，范围 1～65535（除去 8888 ）。
     */
    public void setGatewayPort(Long GatewayPort) {
        this.GatewayPort = GatewayPort;
    }

    /**
     * Get 网关状态，取值有：
<li> creating : 创建中；</li>
<li> online : 在线；</li>
<li> offline : 离线；</li>
<li> disable : 已停用。</li> 
     * @return Status 网关状态，取值有：
<li> creating : 创建中；</li>
<li> online : 在线；</li>
<li> offline : 离线；</li>
<li> disable : 已停用。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 网关状态，取值有：
<li> creating : 创建中；</li>
<li> online : 在线；</li>
<li> offline : 离线；</li>
<li> disable : 已停用。</li>
     * @param Status 网关状态，取值有：
<li> creating : 创建中；</li>
<li> online : 在线；</li>
<li> offline : 离线；</li>
<li> disable : 已停用。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 网关 IP， 格式为 IPv4。 
     * @return GatewayIP 网关 IP， 格式为 IPv4。
     */
    public String getGatewayIP() {
        return this.GatewayIP;
    }

    /**
     * Set 网关 IP， 格式为 IPv4。
     * @param GatewayIP 网关 IP， 格式为 IPv4。
     */
    public void setGatewayIP(String GatewayIP) {
        this.GatewayIP = GatewayIP;
    }

    /**
     * Get 网关地域 Id，可以从接口 DescribeMultiPathGatewayRegions 获取 RegionId 列表。 
     * @return RegionId 网关地域 Id，可以从接口 DescribeMultiPathGatewayRegions 获取 RegionId 列表。
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 网关地域 Id，可以从接口 DescribeMultiPathGatewayRegions 获取 RegionId 列表。
     * @param RegionId 网关地域 Id，可以从接口 DescribeMultiPathGatewayRegions 获取 RegionId 列表。
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 线路信息，当查询网关信息详情 DescribeMultiPathGateway 的时候会返回，当查询网关列表 DescribeMultiPathGateways 的时候不会返回。 
     * @return Lines 线路信息，当查询网关信息详情 DescribeMultiPathGateway 的时候会返回，当查询网关列表 DescribeMultiPathGateways 的时候不会返回。
     */
    public MultiPathGatewayLine [] getLines() {
        return this.Lines;
    }

    /**
     * Set 线路信息，当查询网关信息详情 DescribeMultiPathGateway 的时候会返回，当查询网关列表 DescribeMultiPathGateways 的时候不会返回。
     * @param Lines 线路信息，当查询网关信息详情 DescribeMultiPathGateway 的时候会返回，当查询网关列表 DescribeMultiPathGateways 的时候不会返回。
     */
    public void setLines(MultiPathGatewayLine [] Lines) {
        this.Lines = Lines;
    }

    /**
     * Get 网关回源 IP 列表发生了变化是否需要重新确认，取值有：<li>true：回源 IP 列表发生了变化，需要确认；</li><li>false：回源 IP 列表未发生变化，无需确认。</li> 
     * @return NeedConfirm 网关回源 IP 列表发生了变化是否需要重新确认，取值有：<li>true：回源 IP 列表发生了变化，需要确认；</li><li>false：回源 IP 列表未发生变化，无需确认。</li>
     */
    public String getNeedConfirm() {
        return this.NeedConfirm;
    }

    /**
     * Set 网关回源 IP 列表发生了变化是否需要重新确认，取值有：<li>true：回源 IP 列表发生了变化，需要确认；</li><li>false：回源 IP 列表未发生变化，无需确认。</li>
     * @param NeedConfirm 网关回源 IP 列表发生了变化是否需要重新确认，取值有：<li>true：回源 IP 列表发生了变化，需要确认；</li><li>false：回源 IP 列表未发生变化，无需确认。</li>
     */
    public void setNeedConfirm(String NeedConfirm) {
        this.NeedConfirm = NeedConfirm;
    }

    public MultiPathGateway() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiPathGateway(MultiPathGateway source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.GatewayName != null) {
            this.GatewayName = new String(source.GatewayName);
        }
        if (source.GatewayType != null) {
            this.GatewayType = new String(source.GatewayType);
        }
        if (source.GatewayPort != null) {
            this.GatewayPort = new Long(source.GatewayPort);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.GatewayIP != null) {
            this.GatewayIP = new String(source.GatewayIP);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.Lines != null) {
            this.Lines = new MultiPathGatewayLine[source.Lines.length];
            for (int i = 0; i < source.Lines.length; i++) {
                this.Lines[i] = new MultiPathGatewayLine(source.Lines[i]);
            }
        }
        if (source.NeedConfirm != null) {
            this.NeedConfirm = new String(source.NeedConfirm);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "GatewayName", this.GatewayName);
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);
        this.setParamSimple(map, prefix + "GatewayPort", this.GatewayPort);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "GatewayIP", this.GatewayIP);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamArrayObj(map, prefix + "Lines.", this.Lines);
        this.setParamSimple(map, prefix + "NeedConfirm", this.NeedConfirm);

    }
}

