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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Route  extends AbstractModel{

    /**
    * 目的网段，取值不能在私有网络网段内，例如：112.20.51.0/24。
    */
    @SerializedName("DestinationCidrBlock")
    @Expose
    private String DestinationCidrBlock;

    /**
    * 下一跳类型，目前我们支持的类型有：
CVM：公网网关类型的云主机；
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
SSLVPN：sslvpn网关；
NAT：NAT网关; 
NORMAL_CVM：普通云主机；
EIP：云主机的公网IP；
CCN：云联网。
    */
    @SerializedName("GatewayType")
    @Expose
    private String GatewayType;

    /**
    * 下一跳地址，这里只需要指定不同下一跳类型的网关ID，系统会自动匹配到下一跳地址。
特别注意：当 GatewayType 为 EIP 时，GatewayId 固定值 '0'
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 路由策略ID。
    */
    @SerializedName("RouteId")
    @Expose
    private Integer RouteId;

    /**
    * 路由策略描述。
    */
    @SerializedName("RouteDescription")
    @Expose
    private String RouteDescription;

    /**
    * 是否启用
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 路由类型，目前我们支持的类型有：
USER：用户路由；
NETD：网络探测路由，创建网络探测实例时，系统默认下发，不可编辑与删除；
CCN：云联网路由，系统默认下发，不可编辑与删除。
用户只能添加和操作 USER 类型的路由。
    */
    @SerializedName("RouteType")
    @Expose
    private String RouteType;

    /**
     * 获取目的网段，取值不能在私有网络网段内，例如：112.20.51.0/24。
     * @return DestinationCidrBlock 目的网段，取值不能在私有网络网段内，例如：112.20.51.0/24。
     */
    public String getDestinationCidrBlock() {
        return this.DestinationCidrBlock;
    }

    /**
     * 设置目的网段，取值不能在私有网络网段内，例如：112.20.51.0/24。
     * @param DestinationCidrBlock 目的网段，取值不能在私有网络网段内，例如：112.20.51.0/24。
     */
    public void setDestinationCidrBlock(String DestinationCidrBlock) {
        this.DestinationCidrBlock = DestinationCidrBlock;
    }

    /**
     * 获取下一跳类型，目前我们支持的类型有：
CVM：公网网关类型的云主机；
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
SSLVPN：sslvpn网关；
NAT：NAT网关; 
NORMAL_CVM：普通云主机；
EIP：云主机的公网IP；
CCN：云联网。
     * @return GatewayType 下一跳类型，目前我们支持的类型有：
CVM：公网网关类型的云主机；
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
SSLVPN：sslvpn网关；
NAT：NAT网关; 
NORMAL_CVM：普通云主机；
EIP：云主机的公网IP；
CCN：云联网。
     */
    public String getGatewayType() {
        return this.GatewayType;
    }

    /**
     * 设置下一跳类型，目前我们支持的类型有：
CVM：公网网关类型的云主机；
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
SSLVPN：sslvpn网关；
NAT：NAT网关; 
NORMAL_CVM：普通云主机；
EIP：云主机的公网IP；
CCN：云联网。
     * @param GatewayType 下一跳类型，目前我们支持的类型有：
CVM：公网网关类型的云主机；
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
SSLVPN：sslvpn网关；
NAT：NAT网关; 
NORMAL_CVM：普通云主机；
EIP：云主机的公网IP；
CCN：云联网。
     */
    public void setGatewayType(String GatewayType) {
        this.GatewayType = GatewayType;
    }

    /**
     * 获取下一跳地址，这里只需要指定不同下一跳类型的网关ID，系统会自动匹配到下一跳地址。
特别注意：当 GatewayType 为 EIP 时，GatewayId 固定值 '0'
     * @return GatewayId 下一跳地址，这里只需要指定不同下一跳类型的网关ID，系统会自动匹配到下一跳地址。
特别注意：当 GatewayType 为 EIP 时，GatewayId 固定值 '0'
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * 设置下一跳地址，这里只需要指定不同下一跳类型的网关ID，系统会自动匹配到下一跳地址。
特别注意：当 GatewayType 为 EIP 时，GatewayId 固定值 '0'
     * @param GatewayId 下一跳地址，这里只需要指定不同下一跳类型的网关ID，系统会自动匹配到下一跳地址。
特别注意：当 GatewayType 为 EIP 时，GatewayId 固定值 '0'
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * 获取路由策略ID。
     * @return RouteId 路由策略ID。
     */
    public Integer getRouteId() {
        return this.RouteId;
    }

    /**
     * 设置路由策略ID。
     * @param RouteId 路由策略ID。
     */
    public void setRouteId(Integer RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * 获取路由策略描述。
     * @return RouteDescription 路由策略描述。
     */
    public String getRouteDescription() {
        return this.RouteDescription;
    }

    /**
     * 设置路由策略描述。
     * @param RouteDescription 路由策略描述。
     */
    public void setRouteDescription(String RouteDescription) {
        this.RouteDescription = RouteDescription;
    }

    /**
     * 获取是否启用
     * @return Enabled 是否启用
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * 设置是否启用
     * @param Enabled 是否启用
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * 获取路由类型，目前我们支持的类型有：
USER：用户路由；
NETD：网络探测路由，创建网络探测实例时，系统默认下发，不可编辑与删除；
CCN：云联网路由，系统默认下发，不可编辑与删除。
用户只能添加和操作 USER 类型的路由。
     * @return RouteType 路由类型，目前我们支持的类型有：
USER：用户路由；
NETD：网络探测路由，创建网络探测实例时，系统默认下发，不可编辑与删除；
CCN：云联网路由，系统默认下发，不可编辑与删除。
用户只能添加和操作 USER 类型的路由。
     */
    public String getRouteType() {
        return this.RouteType;
    }

    /**
     * 设置路由类型，目前我们支持的类型有：
USER：用户路由；
NETD：网络探测路由，创建网络探测实例时，系统默认下发，不可编辑与删除；
CCN：云联网路由，系统默认下发，不可编辑与删除。
用户只能添加和操作 USER 类型的路由。
     * @param RouteType 路由类型，目前我们支持的类型有：
USER：用户路由；
NETD：网络探测路由，创建网络探测实例时，系统默认下发，不可编辑与删除；
CCN：云联网路由，系统默认下发，不可编辑与删除。
用户只能添加和操作 USER 类型的路由。
     */
    public void setRouteType(String RouteType) {
        this.RouteType = RouteType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DestinationCidrBlock", this.DestinationCidrBlock);
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);
        this.setParamSimple(map, prefix + "RouteDescription", this.RouteDescription);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "RouteType", this.RouteType);

    }
}

