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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadBalancer extends AbstractModel{

    /**
    * 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
只读。
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * 负载均衡实例所在的子网（仅对内网VPC型LB有意义），只读。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * TRAFFIC_POSTPAID_BY_HOUR 按流量按小时后计费 ; BANDWIDTH_POSTPAID_BY_HOUR 按带宽按小时后计费;只读。
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * 最大出带宽，单位Mbps，仅对公网属性的LB生效，默认值 10
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * 可用区 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneID")
    @Expose
    private String ZoneID;

    /**
    * 运营商类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VipIsp")
    @Expose
    private String VipIsp;

    /**
    * TGW Group 名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TgwGroupName")
    @Expose
    private String TgwGroupName;

    /**
    * IP 类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddressIPVersion")
    @Expose
    private String AddressIPVersion;

    /**
    * 标签列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 内网独占集群配置列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtensiveClusters")
    @Expose
    private ExtensiveClusters ExtensiveClusters;

    /**
    * 负载均衡跨地域配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CrossRegionConfig")
    @Expose
    private CrossRegionConfig CrossRegionConfig;

    /**
     * Get 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
只读。 
     * @return LoadBalancerType 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
只读。
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
只读。
     * @param LoadBalancerType 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
只读。
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get 负载均衡实例所在的子网（仅对内网VPC型LB有意义），只读。 
     * @return SubnetId 负载均衡实例所在的子网（仅对内网VPC型LB有意义），只读。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 负载均衡实例所在的子网（仅对内网VPC型LB有意义），只读。
     * @param SubnetId 负载均衡实例所在的子网（仅对内网VPC型LB有意义），只读。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get TRAFFIC_POSTPAID_BY_HOUR 按流量按小时后计费 ; BANDWIDTH_POSTPAID_BY_HOUR 按带宽按小时后计费;只读。 
     * @return InternetChargeType TRAFFIC_POSTPAID_BY_HOUR 按流量按小时后计费 ; BANDWIDTH_POSTPAID_BY_HOUR 按带宽按小时后计费;只读。
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set TRAFFIC_POSTPAID_BY_HOUR 按流量按小时后计费 ; BANDWIDTH_POSTPAID_BY_HOUR 按带宽按小时后计费;只读。
     * @param InternetChargeType TRAFFIC_POSTPAID_BY_HOUR 按流量按小时后计费 ; BANDWIDTH_POSTPAID_BY_HOUR 按带宽按小时后计费;只读。
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Get 最大出带宽，单位Mbps，仅对公网属性的LB生效，默认值 10 
     * @return InternetMaxBandwidthOut 最大出带宽，单位Mbps，仅对公网属性的LB生效，默认值 10
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 最大出带宽，单位Mbps，仅对公网属性的LB生效，默认值 10
     * @param InternetMaxBandwidthOut 最大出带宽，单位Mbps，仅对公网属性的LB生效，默认值 10
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get 可用区 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneID 可用区 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZoneID() {
        return this.ZoneID;
    }

    /**
     * Set 可用区 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneID 可用区 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneID(String ZoneID) {
        this.ZoneID = ZoneID;
    }

    /**
     * Get 运营商类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VipIsp 运营商类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVipIsp() {
        return this.VipIsp;
    }

    /**
     * Set 运营商类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param VipIsp 运营商类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVipIsp(String VipIsp) {
        this.VipIsp = VipIsp;
    }

    /**
     * Get TGW Group 名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TgwGroupName TGW Group 名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTgwGroupName() {
        return this.TgwGroupName;
    }

    /**
     * Set TGW Group 名
注意：此字段可能返回 null，表示取不到有效值。
     * @param TgwGroupName TGW Group 名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTgwGroupName(String TgwGroupName) {
        this.TgwGroupName = TgwGroupName;
    }

    /**
     * Get IP 类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddressIPVersion IP 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddressIPVersion() {
        return this.AddressIPVersion;
    }

    /**
     * Set IP 类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddressIPVersion IP 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddressIPVersion(String AddressIPVersion) {
        this.AddressIPVersion = AddressIPVersion;
    }

    /**
     * Get 标签列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 内网独占集群配置列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtensiveClusters 内网独占集群配置列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExtensiveClusters getExtensiveClusters() {
        return this.ExtensiveClusters;
    }

    /**
     * Set 内网独占集群配置列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtensiveClusters 内网独占集群配置列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtensiveClusters(ExtensiveClusters ExtensiveClusters) {
        this.ExtensiveClusters = ExtensiveClusters;
    }

    /**
     * Get 负载均衡跨地域配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CrossRegionConfig 负载均衡跨地域配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CrossRegionConfig getCrossRegionConfig() {
        return this.CrossRegionConfig;
    }

    /**
     * Set 负载均衡跨地域配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param CrossRegionConfig 负载均衡跨地域配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCrossRegionConfig(CrossRegionConfig CrossRegionConfig) {
        this.CrossRegionConfig = CrossRegionConfig;
    }

    public LoadBalancer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadBalancer(LoadBalancer source) {
        if (source.LoadBalancerType != null) {
            this.LoadBalancerType = new String(source.LoadBalancerType);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.InternetChargeType != null) {
            this.InternetChargeType = new String(source.InternetChargeType);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.ZoneID != null) {
            this.ZoneID = new String(source.ZoneID);
        }
        if (source.VipIsp != null) {
            this.VipIsp = new String(source.VipIsp);
        }
        if (source.TgwGroupName != null) {
            this.TgwGroupName = new String(source.TgwGroupName);
        }
        if (source.AddressIPVersion != null) {
            this.AddressIPVersion = new String(source.AddressIPVersion);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.ExtensiveClusters != null) {
            this.ExtensiveClusters = new ExtensiveClusters(source.ExtensiveClusters);
        }
        if (source.CrossRegionConfig != null) {
            this.CrossRegionConfig = new CrossRegionConfig(source.CrossRegionConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "InternetChargeType", this.InternetChargeType);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "ZoneID", this.ZoneID);
        this.setParamSimple(map, prefix + "VipIsp", this.VipIsp);
        this.setParamSimple(map, prefix + "TgwGroupName", this.TgwGroupName);
        this.setParamSimple(map, prefix + "AddressIPVersion", this.AddressIPVersion);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "ExtensiveClusters.", this.ExtensiveClusters);
        this.setParamObj(map, prefix + "CrossRegionConfig.", this.CrossRegionConfig);

    }
}

