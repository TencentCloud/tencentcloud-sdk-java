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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Route extends AbstractModel {

    /**
    * 创建IPv4目的网段，取值不能在私有网络网段内，例如：112.20.51.0/24。
    */
    @SerializedName("DestinationCidrBlock")
    @Expose
    private String DestinationCidrBlock;

    /**
    * 下一跳类型，目前我们支持的类型有：
CVM：公网网关类型的云服务器；
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
HAVIP：高可用虚拟IP；
NAT：公网NAT网关; 
NORMAL_CVM：普通云服务器；
EIP：云服务器的公网IP；
LOCAL_GATEWAY：CDC本地网关；
INTRANAT：私网NAT网关；
USER_CCN；云联网（自定义路由）。

    */
    @SerializedName("GatewayType")
    @Expose
    private String GatewayType;

    /**
    * 下一跳地址，这里只需要指定不同下一跳类型的网关ID，系统会自动匹配到下一跳地址。
特殊说明：
GatewayType为NORMAL_CVM时，GatewayId填写实例的内网IP。
GatewayType为EIP时，GatewayId填写0。
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 路由策略ID。IPv4路由策略ID是有意义的值，IPv6路由策略是无意义的值0。后续建议完全使用字符串唯一ID `RouteItemId`操作路由策略。
该字段在删除时必填，其他字段无需填写。
    */
    @SerializedName("RouteId")
    @Expose
    private Long RouteId;

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
    * 路由表实例ID，例如：rtb-azd4dt1c。
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * 创建IPv6目的网段，取值不能在私有网络网段内，例如：2402:4e00:1000:810b::/64。
    */
    @SerializedName("DestinationIpv6CidrBlock")
    @Expose
    private String DestinationIpv6CidrBlock;

    /**
    * 路由唯一策略ID。
    */
    @SerializedName("RouteItemId")
    @Expose
    private String RouteItemId;

    /**
    * 路由策略是否发布到云联网。该字段仅做出参使用，作为入参字段时此参数不生效。
    */
    @SerializedName("PublishedToVbc")
    @Expose
    private Boolean PublishedToVbc;

    /**
    * 路由策略创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * CDC 集群唯一 ID。
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
     * Get 创建IPv4目的网段，取值不能在私有网络网段内，例如：112.20.51.0/24。 
     * @return DestinationCidrBlock 创建IPv4目的网段，取值不能在私有网络网段内，例如：112.20.51.0/24。
     */
    public String getDestinationCidrBlock() {
        return this.DestinationCidrBlock;
    }

    /**
     * Set 创建IPv4目的网段，取值不能在私有网络网段内，例如：112.20.51.0/24。
     * @param DestinationCidrBlock 创建IPv4目的网段，取值不能在私有网络网段内，例如：112.20.51.0/24。
     */
    public void setDestinationCidrBlock(String DestinationCidrBlock) {
        this.DestinationCidrBlock = DestinationCidrBlock;
    }

    /**
     * Get 下一跳类型，目前我们支持的类型有：
CVM：公网网关类型的云服务器；
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
HAVIP：高可用虚拟IP；
NAT：公网NAT网关; 
NORMAL_CVM：普通云服务器；
EIP：云服务器的公网IP；
LOCAL_GATEWAY：CDC本地网关；
INTRANAT：私网NAT网关；
USER_CCN；云联网（自定义路由）。
 
     * @return GatewayType 下一跳类型，目前我们支持的类型有：
CVM：公网网关类型的云服务器；
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
HAVIP：高可用虚拟IP；
NAT：公网NAT网关; 
NORMAL_CVM：普通云服务器；
EIP：云服务器的公网IP；
LOCAL_GATEWAY：CDC本地网关；
INTRANAT：私网NAT网关；
USER_CCN；云联网（自定义路由）。

     */
    public String getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set 下一跳类型，目前我们支持的类型有：
CVM：公网网关类型的云服务器；
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
HAVIP：高可用虚拟IP；
NAT：公网NAT网关; 
NORMAL_CVM：普通云服务器；
EIP：云服务器的公网IP；
LOCAL_GATEWAY：CDC本地网关；
INTRANAT：私网NAT网关；
USER_CCN；云联网（自定义路由）。

     * @param GatewayType 下一跳类型，目前我们支持的类型有：
CVM：公网网关类型的云服务器；
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
HAVIP：高可用虚拟IP；
NAT：公网NAT网关; 
NORMAL_CVM：普通云服务器；
EIP：云服务器的公网IP；
LOCAL_GATEWAY：CDC本地网关；
INTRANAT：私网NAT网关；
USER_CCN；云联网（自定义路由）。

     */
    public void setGatewayType(String GatewayType) {
        this.GatewayType = GatewayType;
    }

    /**
     * Get 下一跳地址，这里只需要指定不同下一跳类型的网关ID，系统会自动匹配到下一跳地址。
特殊说明：
GatewayType为NORMAL_CVM时，GatewayId填写实例的内网IP。
GatewayType为EIP时，GatewayId填写0。 
     * @return GatewayId 下一跳地址，这里只需要指定不同下一跳类型的网关ID，系统会自动匹配到下一跳地址。
特殊说明：
GatewayType为NORMAL_CVM时，GatewayId填写实例的内网IP。
GatewayType为EIP时，GatewayId填写0。
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 下一跳地址，这里只需要指定不同下一跳类型的网关ID，系统会自动匹配到下一跳地址。
特殊说明：
GatewayType为NORMAL_CVM时，GatewayId填写实例的内网IP。
GatewayType为EIP时，GatewayId填写0。
     * @param GatewayId 下一跳地址，这里只需要指定不同下一跳类型的网关ID，系统会自动匹配到下一跳地址。
特殊说明：
GatewayType为NORMAL_CVM时，GatewayId填写实例的内网IP。
GatewayType为EIP时，GatewayId填写0。
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 路由策略ID。IPv4路由策略ID是有意义的值，IPv6路由策略是无意义的值0。后续建议完全使用字符串唯一ID `RouteItemId`操作路由策略。
该字段在删除时必填，其他字段无需填写。 
     * @return RouteId 路由策略ID。IPv4路由策略ID是有意义的值，IPv6路由策略是无意义的值0。后续建议完全使用字符串唯一ID `RouteItemId`操作路由策略。
该字段在删除时必填，其他字段无需填写。
     */
    public Long getRouteId() {
        return this.RouteId;
    }

    /**
     * Set 路由策略ID。IPv4路由策略ID是有意义的值，IPv6路由策略是无意义的值0。后续建议完全使用字符串唯一ID `RouteItemId`操作路由策略。
该字段在删除时必填，其他字段无需填写。
     * @param RouteId 路由策略ID。IPv4路由策略ID是有意义的值，IPv6路由策略是无意义的值0。后续建议完全使用字符串唯一ID `RouteItemId`操作路由策略。
该字段在删除时必填，其他字段无需填写。
     */
    public void setRouteId(Long RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * Get 路由策略描述。 
     * @return RouteDescription 路由策略描述。
     */
    public String getRouteDescription() {
        return this.RouteDescription;
    }

    /**
     * Set 路由策略描述。
     * @param RouteDescription 路由策略描述。
     */
    public void setRouteDescription(String RouteDescription) {
        this.RouteDescription = RouteDescription;
    }

    /**
     * Get 是否启用 
     * @return Enabled 是否启用
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否启用
     * @param Enabled 是否启用
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 路由类型，目前我们支持的类型有：
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
     * Set 路由类型，目前我们支持的类型有：
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
     * Get 路由表实例ID，例如：rtb-azd4dt1c。 
     * @return RouteTableId 路由表实例ID，例如：rtb-azd4dt1c。
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set 路由表实例ID，例如：rtb-azd4dt1c。
     * @param RouteTableId 路由表实例ID，例如：rtb-azd4dt1c。
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * Get 创建IPv6目的网段，取值不能在私有网络网段内，例如：2402:4e00:1000:810b::/64。 
     * @return DestinationIpv6CidrBlock 创建IPv6目的网段，取值不能在私有网络网段内，例如：2402:4e00:1000:810b::/64。
     */
    public String getDestinationIpv6CidrBlock() {
        return this.DestinationIpv6CidrBlock;
    }

    /**
     * Set 创建IPv6目的网段，取值不能在私有网络网段内，例如：2402:4e00:1000:810b::/64。
     * @param DestinationIpv6CidrBlock 创建IPv6目的网段，取值不能在私有网络网段内，例如：2402:4e00:1000:810b::/64。
     */
    public void setDestinationIpv6CidrBlock(String DestinationIpv6CidrBlock) {
        this.DestinationIpv6CidrBlock = DestinationIpv6CidrBlock;
    }

    /**
     * Get 路由唯一策略ID。 
     * @return RouteItemId 路由唯一策略ID。
     */
    public String getRouteItemId() {
        return this.RouteItemId;
    }

    /**
     * Set 路由唯一策略ID。
     * @param RouteItemId 路由唯一策略ID。
     */
    public void setRouteItemId(String RouteItemId) {
        this.RouteItemId = RouteItemId;
    }

    /**
     * Get 路由策略是否发布到云联网。该字段仅做出参使用，作为入参字段时此参数不生效。 
     * @return PublishedToVbc 路由策略是否发布到云联网。该字段仅做出参使用，作为入参字段时此参数不生效。
     */
    public Boolean getPublishedToVbc() {
        return this.PublishedToVbc;
    }

    /**
     * Set 路由策略是否发布到云联网。该字段仅做出参使用，作为入参字段时此参数不生效。
     * @param PublishedToVbc 路由策略是否发布到云联网。该字段仅做出参使用，作为入参字段时此参数不生效。
     */
    public void setPublishedToVbc(Boolean PublishedToVbc) {
        this.PublishedToVbc = PublishedToVbc;
    }

    /**
     * Get 路由策略创建时间 
     * @return CreatedTime 路由策略创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 路由策略创建时间
     * @param CreatedTime 路由策略创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get CDC 集群唯一 ID。 
     * @return CdcId CDC 集群唯一 ID。
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set CDC 集群唯一 ID。
     * @param CdcId CDC 集群唯一 ID。
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    public Route() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Route(Route source) {
        if (source.DestinationCidrBlock != null) {
            this.DestinationCidrBlock = new String(source.DestinationCidrBlock);
        }
        if (source.GatewayType != null) {
            this.GatewayType = new String(source.GatewayType);
        }
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.RouteId != null) {
            this.RouteId = new Long(source.RouteId);
        }
        if (source.RouteDescription != null) {
            this.RouteDescription = new String(source.RouteDescription);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.RouteType != null) {
            this.RouteType = new String(source.RouteType);
        }
        if (source.RouteTableId != null) {
            this.RouteTableId = new String(source.RouteTableId);
        }
        if (source.DestinationIpv6CidrBlock != null) {
            this.DestinationIpv6CidrBlock = new String(source.DestinationIpv6CidrBlock);
        }
        if (source.RouteItemId != null) {
            this.RouteItemId = new String(source.RouteItemId);
        }
        if (source.PublishedToVbc != null) {
            this.PublishedToVbc = new Boolean(source.PublishedToVbc);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DestinationCidrBlock", this.DestinationCidrBlock);
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);
        this.setParamSimple(map, prefix + "RouteDescription", this.RouteDescription);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "RouteType", this.RouteType);
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamSimple(map, prefix + "DestinationIpv6CidrBlock", this.DestinationIpv6CidrBlock);
        this.setParamSimple(map, prefix + "RouteItemId", this.RouteItemId);
        this.setParamSimple(map, prefix + "PublishedToVbc", this.PublishedToVbc);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);

    }
}

