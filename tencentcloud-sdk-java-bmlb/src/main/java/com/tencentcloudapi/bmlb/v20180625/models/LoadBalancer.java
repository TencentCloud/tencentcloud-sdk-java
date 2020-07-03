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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadBalancer extends AbstractModel{

    /**
    * 负载均衡器ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 项目ID，通过v2/DescribeProject 接口获得
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 负载均衡器名称
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * 负载均衡的类型 : open表示公网负载均衡类型，internal表示内网负载均衡类型
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * 是否筛选独占集群，0表示非独占集群，1表示四层独占集群，2表示七层独占集群，3表示四层和七层独占集群，4表示共享容灾
    */
    @SerializedName("Exclusive")
    @Expose
    private Long Exclusive;

    /**
    * 该负载均衡对应的tgw集群（fullnat,tunnel,dnat）
    */
    @SerializedName("TgwSetType")
    @Expose
    private String TgwSetType;

    /**
    * 负载均衡域名。规则：1-60个小写英文字母、数字、点号“.”或连接线“-”。内网类型的负载均衡不能配置该字段
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 该负载均衡对应的所在的VpcId
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 该负载均衡对应的所在的SubnetId
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 无
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 无
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 无
    */
    @SerializedName("LatestPayMode")
    @Expose
    private String LatestPayMode;

    /**
    * 无
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 无
    */
    @SerializedName("StatusTime")
    @Expose
    private String StatusTime;

    /**
    * 私有网络名称。
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 私有网络Cidr。
    */
    @SerializedName("VpcCidrBlock")
    @Expose
    private String VpcCidrBlock;

    /**
    * 负载均衡的IPV4的VIP。
    */
    @SerializedName("LoadBalancerVips")
    @Expose
    private String [] LoadBalancerVips;

    /**
    * 无
    */
    @SerializedName("SupportListenerTypes")
    @Expose
    private String [] SupportListenerTypes;

    /**
    * 无
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 负载均衡个性化配置ID
    */
    @SerializedName("ConfId")
    @Expose
    private String ConfId;

    /**
    * 无
    */
    @SerializedName("ConfName")
    @Expose
    private String ConfName;

    /**
    * 负载均衡的IPV6的VIP。
    */
    @SerializedName("LoadBalancerVipv6s")
    @Expose
    private String [] LoadBalancerVipv6s;

    /**
    * 负载均衡IP协议类型。ipv4或者ipv6。
    */
    @SerializedName("IpProtocolType")
    @Expose
    private String IpProtocolType;

    /**
    * 保障型网关计费形式
    */
    @SerializedName("BzPayMode")
    @Expose
    private String BzPayMode;

    /**
    * 保障型网关四层计费指标
    */
    @SerializedName("BzL4Metrics")
    @Expose
    private String BzL4Metrics;

    /**
    * 保障型网关七层计费指标
    */
    @SerializedName("BzL7Metrics")
    @Expose
    private String BzL7Metrics;

    /**
    * 该负载均衡对应的所在的整形类型的VpcId
    */
    @SerializedName("IntVpcId")
    @Expose
    private Long IntVpcId;

    /**
    * 负载均衡的IPV6或者IPV4的VIP。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurVips")
    @Expose
    private String [] CurVips;

    /**
     * Get 负载均衡器ID 
     * @return LoadBalancerId 负载均衡器ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡器ID
     * @param LoadBalancerId 负载均衡器ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 项目ID，通过v2/DescribeProject 接口获得 
     * @return ProjectId 项目ID，通过v2/DescribeProject 接口获得
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID，通过v2/DescribeProject 接口获得
     * @param ProjectId 项目ID，通过v2/DescribeProject 接口获得
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 负载均衡器名称 
     * @return LoadBalancerName 负载均衡器名称
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set 负载均衡器名称
     * @param LoadBalancerName 负载均衡器名称
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get 负载均衡的类型 : open表示公网负载均衡类型，internal表示内网负载均衡类型 
     * @return LoadBalancerType 负载均衡的类型 : open表示公网负载均衡类型，internal表示内网负载均衡类型
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set 负载均衡的类型 : open表示公网负载均衡类型，internal表示内网负载均衡类型
     * @param LoadBalancerType 负载均衡的类型 : open表示公网负载均衡类型，internal表示内网负载均衡类型
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get 是否筛选独占集群，0表示非独占集群，1表示四层独占集群，2表示七层独占集群，3表示四层和七层独占集群，4表示共享容灾 
     * @return Exclusive 是否筛选独占集群，0表示非独占集群，1表示四层独占集群，2表示七层独占集群，3表示四层和七层独占集群，4表示共享容灾
     */
    public Long getExclusive() {
        return this.Exclusive;
    }

    /**
     * Set 是否筛选独占集群，0表示非独占集群，1表示四层独占集群，2表示七层独占集群，3表示四层和七层独占集群，4表示共享容灾
     * @param Exclusive 是否筛选独占集群，0表示非独占集群，1表示四层独占集群，2表示七层独占集群，3表示四层和七层独占集群，4表示共享容灾
     */
    public void setExclusive(Long Exclusive) {
        this.Exclusive = Exclusive;
    }

    /**
     * Get 该负载均衡对应的tgw集群（fullnat,tunnel,dnat） 
     * @return TgwSetType 该负载均衡对应的tgw集群（fullnat,tunnel,dnat）
     */
    public String getTgwSetType() {
        return this.TgwSetType;
    }

    /**
     * Set 该负载均衡对应的tgw集群（fullnat,tunnel,dnat）
     * @param TgwSetType 该负载均衡对应的tgw集群（fullnat,tunnel,dnat）
     */
    public void setTgwSetType(String TgwSetType) {
        this.TgwSetType = TgwSetType;
    }

    /**
     * Get 负载均衡域名。规则：1-60个小写英文字母、数字、点号“.”或连接线“-”。内网类型的负载均衡不能配置该字段 
     * @return Domain 负载均衡域名。规则：1-60个小写英文字母、数字、点号“.”或连接线“-”。内网类型的负载均衡不能配置该字段
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 负载均衡域名。规则：1-60个小写英文字母、数字、点号“.”或连接线“-”。内网类型的负载均衡不能配置该字段
     * @param Domain 负载均衡域名。规则：1-60个小写英文字母、数字、点号“.”或连接线“-”。内网类型的负载均衡不能配置该字段
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 该负载均衡对应的所在的VpcId 
     * @return VpcId 该负载均衡对应的所在的VpcId
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 该负载均衡对应的所在的VpcId
     * @param VpcId 该负载均衡对应的所在的VpcId
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 该负载均衡对应的所在的SubnetId 
     * @return SubnetId 该负载均衡对应的所在的SubnetId
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 该负载均衡对应的所在的SubnetId
     * @param SubnetId 该负载均衡对应的所在的SubnetId
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 无 
     * @return Status 无
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 无
     * @param Status 无
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 无 
     * @return PayMode 无
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 无
     * @param PayMode 无
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 无 
     * @return LatestPayMode 无
     */
    public String getLatestPayMode() {
        return this.LatestPayMode;
    }

    /**
     * Set 无
     * @param LatestPayMode 无
     */
    public void setLatestPayMode(String LatestPayMode) {
        this.LatestPayMode = LatestPayMode;
    }

    /**
     * Get 无 
     * @return CreateTime 无
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 无
     * @param CreateTime 无
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 无 
     * @return StatusTime 无
     */
    public String getStatusTime() {
        return this.StatusTime;
    }

    /**
     * Set 无
     * @param StatusTime 无
     */
    public void setStatusTime(String StatusTime) {
        this.StatusTime = StatusTime;
    }

    /**
     * Get 私有网络名称。 
     * @return VpcName 私有网络名称。
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set 私有网络名称。
     * @param VpcName 私有网络名称。
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get 私有网络Cidr。 
     * @return VpcCidrBlock 私有网络Cidr。
     */
    public String getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * Set 私有网络Cidr。
     * @param VpcCidrBlock 私有网络Cidr。
     */
    public void setVpcCidrBlock(String VpcCidrBlock) {
        this.VpcCidrBlock = VpcCidrBlock;
    }

    /**
     * Get 负载均衡的IPV4的VIP。 
     * @return LoadBalancerVips 负载均衡的IPV4的VIP。
     */
    public String [] getLoadBalancerVips() {
        return this.LoadBalancerVips;
    }

    /**
     * Set 负载均衡的IPV4的VIP。
     * @param LoadBalancerVips 负载均衡的IPV4的VIP。
     */
    public void setLoadBalancerVips(String [] LoadBalancerVips) {
        this.LoadBalancerVips = LoadBalancerVips;
    }

    /**
     * Get 无 
     * @return SupportListenerTypes 无
     */
    public String [] getSupportListenerTypes() {
        return this.SupportListenerTypes;
    }

    /**
     * Set 无
     * @param SupportListenerTypes 无
     */
    public void setSupportListenerTypes(String [] SupportListenerTypes) {
        this.SupportListenerTypes = SupportListenerTypes;
    }

    /**
     * Get 无 
     * @return Bandwidth 无
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 无
     * @param Bandwidth 无
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 负载均衡个性化配置ID 
     * @return ConfId 负载均衡个性化配置ID
     */
    public String getConfId() {
        return this.ConfId;
    }

    /**
     * Set 负载均衡个性化配置ID
     * @param ConfId 负载均衡个性化配置ID
     */
    public void setConfId(String ConfId) {
        this.ConfId = ConfId;
    }

    /**
     * Get 无 
     * @return ConfName 无
     */
    public String getConfName() {
        return this.ConfName;
    }

    /**
     * Set 无
     * @param ConfName 无
     */
    public void setConfName(String ConfName) {
        this.ConfName = ConfName;
    }

    /**
     * Get 负载均衡的IPV6的VIP。 
     * @return LoadBalancerVipv6s 负载均衡的IPV6的VIP。
     */
    public String [] getLoadBalancerVipv6s() {
        return this.LoadBalancerVipv6s;
    }

    /**
     * Set 负载均衡的IPV6的VIP。
     * @param LoadBalancerVipv6s 负载均衡的IPV6的VIP。
     */
    public void setLoadBalancerVipv6s(String [] LoadBalancerVipv6s) {
        this.LoadBalancerVipv6s = LoadBalancerVipv6s;
    }

    /**
     * Get 负载均衡IP协议类型。ipv4或者ipv6。 
     * @return IpProtocolType 负载均衡IP协议类型。ipv4或者ipv6。
     */
    public String getIpProtocolType() {
        return this.IpProtocolType;
    }

    /**
     * Set 负载均衡IP协议类型。ipv4或者ipv6。
     * @param IpProtocolType 负载均衡IP协议类型。ipv4或者ipv6。
     */
    public void setIpProtocolType(String IpProtocolType) {
        this.IpProtocolType = IpProtocolType;
    }

    /**
     * Get 保障型网关计费形式 
     * @return BzPayMode 保障型网关计费形式
     */
    public String getBzPayMode() {
        return this.BzPayMode;
    }

    /**
     * Set 保障型网关计费形式
     * @param BzPayMode 保障型网关计费形式
     */
    public void setBzPayMode(String BzPayMode) {
        this.BzPayMode = BzPayMode;
    }

    /**
     * Get 保障型网关四层计费指标 
     * @return BzL4Metrics 保障型网关四层计费指标
     */
    public String getBzL4Metrics() {
        return this.BzL4Metrics;
    }

    /**
     * Set 保障型网关四层计费指标
     * @param BzL4Metrics 保障型网关四层计费指标
     */
    public void setBzL4Metrics(String BzL4Metrics) {
        this.BzL4Metrics = BzL4Metrics;
    }

    /**
     * Get 保障型网关七层计费指标 
     * @return BzL7Metrics 保障型网关七层计费指标
     */
    public String getBzL7Metrics() {
        return this.BzL7Metrics;
    }

    /**
     * Set 保障型网关七层计费指标
     * @param BzL7Metrics 保障型网关七层计费指标
     */
    public void setBzL7Metrics(String BzL7Metrics) {
        this.BzL7Metrics = BzL7Metrics;
    }

    /**
     * Get 该负载均衡对应的所在的整形类型的VpcId 
     * @return IntVpcId 该负载均衡对应的所在的整形类型的VpcId
     */
    public Long getIntVpcId() {
        return this.IntVpcId;
    }

    /**
     * Set 该负载均衡对应的所在的整形类型的VpcId
     * @param IntVpcId 该负载均衡对应的所在的整形类型的VpcId
     */
    public void setIntVpcId(Long IntVpcId) {
        this.IntVpcId = IntVpcId;
    }

    /**
     * Get 负载均衡的IPV6或者IPV4的VIP。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurVips 负载均衡的IPV6或者IPV4的VIP。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCurVips() {
        return this.CurVips;
    }

    /**
     * Set 负载均衡的IPV6或者IPV4的VIP。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurVips 负载均衡的IPV6或者IPV4的VIP。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurVips(String [] CurVips) {
        this.CurVips = CurVips;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamSimple(map, prefix + "Exclusive", this.Exclusive);
        this.setParamSimple(map, prefix + "TgwSetType", this.TgwSetType);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "LatestPayMode", this.LatestPayMode);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StatusTime", this.StatusTime);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "VpcCidrBlock", this.VpcCidrBlock);
        this.setParamArraySimple(map, prefix + "LoadBalancerVips.", this.LoadBalancerVips);
        this.setParamArraySimple(map, prefix + "SupportListenerTypes.", this.SupportListenerTypes);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "ConfId", this.ConfId);
        this.setParamSimple(map, prefix + "ConfName", this.ConfName);
        this.setParamArraySimple(map, prefix + "LoadBalancerVipv6s.", this.LoadBalancerVipv6s);
        this.setParamSimple(map, prefix + "IpProtocolType", this.IpProtocolType);
        this.setParamSimple(map, prefix + "BzPayMode", this.BzPayMode);
        this.setParamSimple(map, prefix + "BzL4Metrics", this.BzL4Metrics);
        this.setParamSimple(map, prefix + "BzL7Metrics", this.BzL7Metrics);
        this.setParamSimple(map, prefix + "IntVpcId", this.IntVpcId);
        this.setParamArraySimple(map, prefix + "CurVips.", this.CurVips);

    }
}

