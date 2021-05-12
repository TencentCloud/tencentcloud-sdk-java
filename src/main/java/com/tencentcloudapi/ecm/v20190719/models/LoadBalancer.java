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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadBalancer extends AbstractModel{

    /**
    * 区域。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 位置信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Position")
    @Expose
    private Position Position;

    /**
    * 负载均衡实例 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 负载均衡实例的名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * 负载均衡实例的网络类型：OPEN：公网属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * 负载均衡实例的 VIP 列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoadBalancerVips")
    @Expose
    private String [] LoadBalancerVips;

    /**
    * 负载均衡实例的状态，包括
 0：创建中，1：正常运行。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 负载均衡实例的创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 负载均衡实例的上次状态转换时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusTime")
    @Expose
    private String StatusTime;

    /**
    * 私有网络的 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 负载均衡实例的标签信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * 负载均衡IP地址所属的ISP。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VipIsp")
    @Expose
    private String VipIsp;

    /**
    * 负载均衡实例的网络属性。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkAttributes")
    @Expose
    private LoadBalancerInternetAccessible NetworkAttributes;

    /**
    * 安全组。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecureGroups")
    @Expose
    private String [] SecureGroups;

    /**
    * 后端机器是否放通来自ELB的流量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoadBalancerPassToTarget")
    @Expose
    private Boolean LoadBalancerPassToTarget;

    /**
     * Get 区域。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 区域。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 区域。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 区域。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 位置信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Position 位置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Position getPosition() {
        return this.Position;
    }

    /**
     * Set 位置信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Position 位置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPosition(Position Position) {
        this.Position = Position;
    }

    /**
     * Get 负载均衡实例 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoadBalancerId 负载均衡实例 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoadBalancerId 负载均衡实例 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 负载均衡实例的名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoadBalancerName 负载均衡实例的名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set 负载均衡实例的名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoadBalancerName 负载均衡实例的名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get 负载均衡实例的网络类型：OPEN：公网属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoadBalancerType 负载均衡实例的网络类型：OPEN：公网属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set 负载均衡实例的网络类型：OPEN：公网属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoadBalancerType 负载均衡实例的网络类型：OPEN：公网属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get 负载均衡实例的 VIP 列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoadBalancerVips 负载均衡实例的 VIP 列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getLoadBalancerVips() {
        return this.LoadBalancerVips;
    }

    /**
     * Set 负载均衡实例的 VIP 列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoadBalancerVips 负载均衡实例的 VIP 列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoadBalancerVips(String [] LoadBalancerVips) {
        this.LoadBalancerVips = LoadBalancerVips;
    }

    /**
     * Get 负载均衡实例的状态，包括
 0：创建中，1：正常运行。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 负载均衡实例的状态，包括
 0：创建中，1：正常运行。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 负载均衡实例的状态，包括
 0：创建中，1：正常运行。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 负载均衡实例的状态，包括
 0：创建中，1：正常运行。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 负载均衡实例的创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 负载均衡实例的创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 负载均衡实例的创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 负载均衡实例的创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 负载均衡实例的上次状态转换时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusTime 负载均衡实例的上次状态转换时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusTime() {
        return this.StatusTime;
    }

    /**
     * Set 负载均衡实例的上次状态转换时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusTime 负载均衡实例的上次状态转换时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusTime(String StatusTime) {
        this.StatusTime = StatusTime;
    }

    /**
     * Get 私有网络的 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId 私有网络的 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络的 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 私有网络的 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 负载均衡实例的标签信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 负载均衡实例的标签信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 负载均衡实例的标签信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 负载均衡实例的标签信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 负载均衡IP地址所属的ISP。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VipIsp 负载均衡IP地址所属的ISP。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVipIsp() {
        return this.VipIsp;
    }

    /**
     * Set 负载均衡IP地址所属的ISP。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VipIsp 负载均衡IP地址所属的ISP。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVipIsp(String VipIsp) {
        this.VipIsp = VipIsp;
    }

    /**
     * Get 负载均衡实例的网络属性。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkAttributes 负载均衡实例的网络属性。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LoadBalancerInternetAccessible getNetworkAttributes() {
        return this.NetworkAttributes;
    }

    /**
     * Set 负载均衡实例的网络属性。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkAttributes 负载均衡实例的网络属性。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkAttributes(LoadBalancerInternetAccessible NetworkAttributes) {
        this.NetworkAttributes = NetworkAttributes;
    }

    /**
     * Get 安全组。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecureGroups 安全组。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSecureGroups() {
        return this.SecureGroups;
    }

    /**
     * Set 安全组。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecureGroups 安全组。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecureGroups(String [] SecureGroups) {
        this.SecureGroups = SecureGroups;
    }

    /**
     * Get 后端机器是否放通来自ELB的流量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoadBalancerPassToTarget 后端机器是否放通来自ELB的流量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getLoadBalancerPassToTarget() {
        return this.LoadBalancerPassToTarget;
    }

    /**
     * Set 后端机器是否放通来自ELB的流量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoadBalancerPassToTarget 后端机器是否放通来自ELB的流量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoadBalancerPassToTarget(Boolean LoadBalancerPassToTarget) {
        this.LoadBalancerPassToTarget = LoadBalancerPassToTarget;
    }

    public LoadBalancer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadBalancer(LoadBalancer source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Position != null) {
            this.Position = new Position(source.Position);
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.LoadBalancerType != null) {
            this.LoadBalancerType = new String(source.LoadBalancerType);
        }
        if (source.LoadBalancerVips != null) {
            this.LoadBalancerVips = new String[source.LoadBalancerVips.length];
            for (int i = 0; i < source.LoadBalancerVips.length; i++) {
                this.LoadBalancerVips[i] = new String(source.LoadBalancerVips[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.StatusTime != null) {
            this.StatusTime = new String(source.StatusTime);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.VipIsp != null) {
            this.VipIsp = new String(source.VipIsp);
        }
        if (source.NetworkAttributes != null) {
            this.NetworkAttributes = new LoadBalancerInternetAccessible(source.NetworkAttributes);
        }
        if (source.SecureGroups != null) {
            this.SecureGroups = new String[source.SecureGroups.length];
            for (int i = 0; i < source.SecureGroups.length; i++) {
                this.SecureGroups[i] = new String(source.SecureGroups[i]);
            }
        }
        if (source.LoadBalancerPassToTarget != null) {
            this.LoadBalancerPassToTarget = new Boolean(source.LoadBalancerPassToTarget);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamObj(map, prefix + "Position.", this.Position);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamArraySimple(map, prefix + "LoadBalancerVips.", this.LoadBalancerVips);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StatusTime", this.StatusTime);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "VipIsp", this.VipIsp);
        this.setParamObj(map, prefix + "NetworkAttributes.", this.NetworkAttributes);
        this.setParamArraySimple(map, prefix + "SecureGroups.", this.SecureGroups);
        this.setParamSimple(map, prefix + "LoadBalancerPassToTarget", this.LoadBalancerPassToTarget);

    }
}

