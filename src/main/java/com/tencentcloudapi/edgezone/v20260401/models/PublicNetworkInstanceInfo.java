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
package com.tencentcloudapi.edgezone.v20260401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PublicNetworkInstanceInfo extends AbstractModel {

    /**
    * 公网实例ID
    */
    @SerializedName("NetworkInstanceId")
    @Expose
    private String NetworkInstanceId;

    /**
    * 可用区ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 公网实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkInstanceName")
    @Expose
    private String NetworkInstanceName;

    /**
    * 带宽，单位Mbps
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 线路信息
    */
    @SerializedName("Line")
    @Expose
    private String Line;

    /**
    * 路由模式，枚举值：STATIC、BGP、OSPF
    */
    @SerializedName("RouteMode")
    @Expose
    private String RouteMode;

    /**
    * 关联的物理服务器数量
    */
    @SerializedName("ServerCount")
    @Expose
    private Long ServerCount;

    /**
    * 已申请的Ipv4数量
    */
    @SerializedName("Ipv4Count")
    @Expose
    private Long Ipv4Count;

    /**
    * 已申请的Ipv6数量
    */
    @SerializedName("Ipv6Count")
    @Expose
    private Long Ipv6Count;

    /**
    * 关联的Ipv4网段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ipv4CidrSet")
    @Expose
    private PublicNetworkSegment [] Ipv4CidrSet;

    /**
    * 关联的Ipv6网段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ipv6CidrSet")
    @Expose
    private PublicNetworkSegment [] Ipv6CidrSet;

    /**
    * 公网实例创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 公网实例修改时间
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
     * Get 公网实例ID 
     * @return NetworkInstanceId 公网实例ID
     */
    public String getNetworkInstanceId() {
        return this.NetworkInstanceId;
    }

    /**
     * Set 公网实例ID
     * @param NetworkInstanceId 公网实例ID
     */
    public void setNetworkInstanceId(String NetworkInstanceId) {
        this.NetworkInstanceId = NetworkInstanceId;
    }

    /**
     * Get 可用区ID 
     * @return ZoneId 可用区ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区ID
     * @param ZoneId 可用区ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 公网实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkInstanceName 公网实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNetworkInstanceName() {
        return this.NetworkInstanceName;
    }

    /**
     * Set 公网实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkInstanceName 公网实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkInstanceName(String NetworkInstanceName) {
        this.NetworkInstanceName = NetworkInstanceName;
    }

    /**
     * Get 带宽，单位Mbps
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bandwidth 带宽，单位Mbps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 带宽，单位Mbps
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bandwidth 带宽，单位Mbps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 线路信息 
     * @return Line 线路信息
     */
    public String getLine() {
        return this.Line;
    }

    /**
     * Set 线路信息
     * @param Line 线路信息
     */
    public void setLine(String Line) {
        this.Line = Line;
    }

    /**
     * Get 路由模式，枚举值：STATIC、BGP、OSPF 
     * @return RouteMode 路由模式，枚举值：STATIC、BGP、OSPF
     */
    public String getRouteMode() {
        return this.RouteMode;
    }

    /**
     * Set 路由模式，枚举值：STATIC、BGP、OSPF
     * @param RouteMode 路由模式，枚举值：STATIC、BGP、OSPF
     */
    public void setRouteMode(String RouteMode) {
        this.RouteMode = RouteMode;
    }

    /**
     * Get 关联的物理服务器数量 
     * @return ServerCount 关联的物理服务器数量
     */
    public Long getServerCount() {
        return this.ServerCount;
    }

    /**
     * Set 关联的物理服务器数量
     * @param ServerCount 关联的物理服务器数量
     */
    public void setServerCount(Long ServerCount) {
        this.ServerCount = ServerCount;
    }

    /**
     * Get 已申请的Ipv4数量 
     * @return Ipv4Count 已申请的Ipv4数量
     */
    public Long getIpv4Count() {
        return this.Ipv4Count;
    }

    /**
     * Set 已申请的Ipv4数量
     * @param Ipv4Count 已申请的Ipv4数量
     */
    public void setIpv4Count(Long Ipv4Count) {
        this.Ipv4Count = Ipv4Count;
    }

    /**
     * Get 已申请的Ipv6数量 
     * @return Ipv6Count 已申请的Ipv6数量
     */
    public Long getIpv6Count() {
        return this.Ipv6Count;
    }

    /**
     * Set 已申请的Ipv6数量
     * @param Ipv6Count 已申请的Ipv6数量
     */
    public void setIpv6Count(Long Ipv6Count) {
        this.Ipv6Count = Ipv6Count;
    }

    /**
     * Get 关联的Ipv4网段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ipv4CidrSet 关联的Ipv4网段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PublicNetworkSegment [] getIpv4CidrSet() {
        return this.Ipv4CidrSet;
    }

    /**
     * Set 关联的Ipv4网段
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ipv4CidrSet 关联的Ipv4网段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpv4CidrSet(PublicNetworkSegment [] Ipv4CidrSet) {
        this.Ipv4CidrSet = Ipv4CidrSet;
    }

    /**
     * Get 关联的Ipv6网段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ipv6CidrSet 关联的Ipv6网段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PublicNetworkSegment [] getIpv6CidrSet() {
        return this.Ipv6CidrSet;
    }

    /**
     * Set 关联的Ipv6网段
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ipv6CidrSet 关联的Ipv6网段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpv6CidrSet(PublicNetworkSegment [] Ipv6CidrSet) {
        this.Ipv6CidrSet = Ipv6CidrSet;
    }

    /**
     * Get 公网实例创建时间 
     * @return CreatedAt 公网实例创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 公网实例创建时间
     * @param CreatedAt 公网实例创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 公网实例修改时间 
     * @return UpdatedAt 公网实例修改时间
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 公网实例修改时间
     * @param UpdatedAt 公网实例修改时间
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    public PublicNetworkInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PublicNetworkInstanceInfo(PublicNetworkInstanceInfo source) {
        if (source.NetworkInstanceId != null) {
            this.NetworkInstanceId = new String(source.NetworkInstanceId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.NetworkInstanceName != null) {
            this.NetworkInstanceName = new String(source.NetworkInstanceName);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.Line != null) {
            this.Line = new String(source.Line);
        }
        if (source.RouteMode != null) {
            this.RouteMode = new String(source.RouteMode);
        }
        if (source.ServerCount != null) {
            this.ServerCount = new Long(source.ServerCount);
        }
        if (source.Ipv4Count != null) {
            this.Ipv4Count = new Long(source.Ipv4Count);
        }
        if (source.Ipv6Count != null) {
            this.Ipv6Count = new Long(source.Ipv6Count);
        }
        if (source.Ipv4CidrSet != null) {
            this.Ipv4CidrSet = new PublicNetworkSegment[source.Ipv4CidrSet.length];
            for (int i = 0; i < source.Ipv4CidrSet.length; i++) {
                this.Ipv4CidrSet[i] = new PublicNetworkSegment(source.Ipv4CidrSet[i]);
            }
        }
        if (source.Ipv6CidrSet != null) {
            this.Ipv6CidrSet = new PublicNetworkSegment[source.Ipv6CidrSet.length];
            for (int i = 0; i < source.Ipv6CidrSet.length; i++) {
                this.Ipv6CidrSet[i] = new PublicNetworkSegment(source.Ipv6CidrSet[i]);
            }
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkInstanceId", this.NetworkInstanceId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "NetworkInstanceName", this.NetworkInstanceName);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Line", this.Line);
        this.setParamSimple(map, prefix + "RouteMode", this.RouteMode);
        this.setParamSimple(map, prefix + "ServerCount", this.ServerCount);
        this.setParamSimple(map, prefix + "Ipv4Count", this.Ipv4Count);
        this.setParamSimple(map, prefix + "Ipv6Count", this.Ipv6Count);
        this.setParamArrayObj(map, prefix + "Ipv4CidrSet.", this.Ipv4CidrSet);
        this.setParamArrayObj(map, prefix + "Ipv6CidrSet.", this.Ipv6CidrSet);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);

    }
}

