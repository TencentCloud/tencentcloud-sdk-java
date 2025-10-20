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

public class RoutePolicyEntry extends AbstractModel {

    /**
    * 路由策略条目IPv4唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoutePolicyEntryId")
    @Expose
    private String RoutePolicyEntryId;

    /**
    * 目标网段。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * 路由策略规则描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 路由类型。
USER：用户自定义类型。
NETD：网络探测下发的路由。
CCN：云联网路由。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RouteType")
    @Expose
    private String RouteType;

    /**
    * 下一跳类型。目前我们支持的类型有：
CVM：公网网关类型的云服务器；
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
HAVIP：高可用虚拟IP；
NAT：NAT网关; 
EIP：云服务器的公网IP；
LOCAL_GATEWAY：本地网关;
PVGW：PVGW网关。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GatewayType")
    @Expose
    private String GatewayType;

    /**
    * 网关唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 优先级。数值越小，优先级越高。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 动作。
DROP：丢弃。
DISABLE：接收且禁用。
ACCEPT：接收且启用。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 地域。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get 路由策略条目IPv4唯一ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoutePolicyEntryId 路由策略条目IPv4唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoutePolicyEntryId() {
        return this.RoutePolicyEntryId;
    }

    /**
     * Set 路由策略条目IPv4唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoutePolicyEntryId 路由策略条目IPv4唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoutePolicyEntryId(String RoutePolicyEntryId) {
        this.RoutePolicyEntryId = RoutePolicyEntryId;
    }

    /**
     * Get 目标网段。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CidrBlock 目标网段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set 目标网段。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CidrBlock 目标网段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get 路由策略规则描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 路由策略规则描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 路由策略规则描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 路由策略规则描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 路由类型。
USER：用户自定义类型。
NETD：网络探测下发的路由。
CCN：云联网路由。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RouteType 路由类型。
USER：用户自定义类型。
NETD：网络探测下发的路由。
CCN：云联网路由。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRouteType() {
        return this.RouteType;
    }

    /**
     * Set 路由类型。
USER：用户自定义类型。
NETD：网络探测下发的路由。
CCN：云联网路由。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RouteType 路由类型。
USER：用户自定义类型。
NETD：网络探测下发的路由。
CCN：云联网路由。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRouteType(String RouteType) {
        this.RouteType = RouteType;
    }

    /**
     * Get 下一跳类型。目前我们支持的类型有：
CVM：公网网关类型的云服务器；
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
HAVIP：高可用虚拟IP；
NAT：NAT网关; 
EIP：云服务器的公网IP；
LOCAL_GATEWAY：本地网关;
PVGW：PVGW网关。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GatewayType 下一跳类型。目前我们支持的类型有：
CVM：公网网关类型的云服务器；
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
HAVIP：高可用虚拟IP；
NAT：NAT网关; 
EIP：云服务器的公网IP；
LOCAL_GATEWAY：本地网关;
PVGW：PVGW网关。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set 下一跳类型。目前我们支持的类型有：
CVM：公网网关类型的云服务器；
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
HAVIP：高可用虚拟IP；
NAT：NAT网关; 
EIP：云服务器的公网IP；
LOCAL_GATEWAY：本地网关;
PVGW：PVGW网关。
注意：此字段可能返回 null，表示取不到有效值。
     * @param GatewayType 下一跳类型。目前我们支持的类型有：
CVM：公网网关类型的云服务器；
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
HAVIP：高可用虚拟IP；
NAT：NAT网关; 
EIP：云服务器的公网IP；
LOCAL_GATEWAY：本地网关;
PVGW：PVGW网关。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGatewayType(String GatewayType) {
        this.GatewayType = GatewayType;
    }

    /**
     * Get 网关唯一ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GatewayId 网关唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param GatewayId 网关唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 优先级。数值越小，优先级越高。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Priority 优先级。数值越小，优先级越高。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 优先级。数值越小，优先级越高。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Priority 优先级。数值越小，优先级越高。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 动作。
DROP：丢弃。
DISABLE：接收且禁用。
ACCEPT：接收且启用。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Action 动作。
DROP：丢弃。
DISABLE：接收且禁用。
ACCEPT：接收且启用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 动作。
DROP：丢弃。
DISABLE：接收且禁用。
ACCEPT：接收且启用。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Action 动作。
DROP：丢弃。
DISABLE：接收且禁用。
ACCEPT：接收且启用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 地域。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public RoutePolicyEntry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoutePolicyEntry(RoutePolicyEntry source) {
        if (source.RoutePolicyEntryId != null) {
            this.RoutePolicyEntryId = new String(source.RoutePolicyEntryId);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RouteType != null) {
            this.RouteType = new String(source.RouteType);
        }
        if (source.GatewayType != null) {
            this.GatewayType = new String(source.GatewayType);
        }
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoutePolicyEntryId", this.RoutePolicyEntryId);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RouteType", this.RouteType);
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

