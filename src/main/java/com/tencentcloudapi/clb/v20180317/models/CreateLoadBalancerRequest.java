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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLoadBalancerRequest extends AbstractModel{

    /**
    * 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * 负载均衡实例的类型。1：通用的负载均衡实例，目前只支持传入1。
    */
    @SerializedName("Forward")
    @Expose
    private Long Forward;

    /**
    * 负载均衡实例的名称，只在创建一个实例的时候才会生效。规则：1-60 个英文、汉字、数字、连接线“-”或下划线“_”。
注意：如果名称与系统中已有负载均衡实例的名称相同，则系统将会自动生成此次创建的负载均衡实例的名称。
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * 负载均衡后端目标设备所属的网络 ID，如vpc-12345678，可以通过 [DescribeVpcEx](https://cloud.tencent.com/document/product/215/1372) 接口获取。 不填此参数则默认为DefaultVPC。创建内网负载均衡实例时，此参数必填。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 在私有网络内购买内网负载均衡实例的情况下，必须指定子网 ID，内网负载均衡实例的 VIP 将从这个子网中产生。创建内网负载均衡实例时，此参数必填。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 负载均衡实例所属的项目 ID，可以通过 [DescribeProject](https://cloud.tencent.com/document/product/378/4400) 接口获取。不填此参数则视为默认项目。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 仅适用于公网负载均衡。IP版本，可取值：IPV4、IPV6、IPv6FullChain，默认值 IPV4。说明：取值为IPV6表示为IPV6 NAT64版本；取值为IPv6FullChain，表示为IPv6版本。
    */
    @SerializedName("AddressIPVersion")
    @Expose
    private String AddressIPVersion;

    /**
    * 创建负载均衡的个数，默认值 1。
    */
    @SerializedName("Number")
    @Expose
    private Long Number;

    /**
    * 仅适用于公网负载均衡。设置跨可用区容灾时的主可用区ID，例如 100001 或 ap-guangzhou-1
注：主可用区是需要承载流量的可用区，备可用区默认不承载流量，主可用区不可用时才使用备可用区，平台将为您自动选择最佳备可用区。可通过 [DescribeResources](https://cloud.tencent.com/document/api/214/70213) 接口查询一个地域的主可用区的列表。
    */
    @SerializedName("MasterZoneId")
    @Expose
    private String MasterZoneId;

    /**
    * 仅适用于公网负载均衡。可用区ID，指定可用区以创建负载均衡实例。如：ap-guangzhou-1。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 仅适用于公网负载均衡。负载均衡的网络计费模式。
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * 仅适用于公网负载均衡。CMCC | CTCC | CUCC，分别对应 移动 | 电信 | 联通，如果不指定本参数，则默认使用BGP。可通过 DescribeSingleIsp 接口查询一个地域所支持的Isp。如果指定运营商，则网络计费式只能使用按带宽包计费(BANDWIDTH_PACKAGE)。
    */
    @SerializedName("VipIsp")
    @Expose
    private String VipIsp;

    /**
    * 购买负载均衡的同时，给负载均衡打上标签。
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * 指定VIP申请负载均衡。指定此参数后：
<ul><li>若创建共享型集群的公网负载均衡实例，则上述的VpcId选填，若实例是IPv6类型的，则SubnetId必填；若是IPv4、IPv6 NAT64类型，则SubnetId不填。</li>
<li>若创建独占型集群的公网负载均衡实例，则上述的VpcId选填，若实例是IPv6类型的，则SubnetId必填；若是IPv4、IPv6 NAT64类型，则SubnetId不填。
</li></ul>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 带宽包ID，指定此参数时，网络计费方式（InternetAccessible.InternetChargeType）只支持按带宽包计费（BANDWIDTH_PACKAGE）。
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * 独占集群信息。若创建独占集群负载均衡实例，则此参数必填。
    */
    @SerializedName("ExclusiveCluster")
    @Expose
    private ExclusiveCluster ExclusiveCluster;

    /**
    * 创建性能容量型 CLB 实例。
<ul><li>若需要创建性能容量型 CLB 实例，则此参数必填，且取值为：SLA，表示创建按量计费模式下的默认性能保障规格的性能容量型实例。</li>
<li>若需要创建共享型 CLB 实例，则无需填写此参数。</li></ul>
    */
    @SerializedName("SlaType")
    @Expose
    private String SlaType;

    /**
    * 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 是否支持绑定跨地域/跨Vpc绑定IP的功能。
    */
    @SerializedName("SnatPro")
    @Expose
    private Boolean SnatPro;

    /**
    * 开启绑定跨地域/跨Vpc绑定IP的功能后，创建SnatIp。
    */
    @SerializedName("SnatIps")
    @Expose
    private SnatIp [] SnatIps;

    /**
    * Stgw独占集群的标签。
    */
    @SerializedName("ClusterTag")
    @Expose
    private String ClusterTag;

    /**
    * 仅适用于公网负载均衡。设置跨可用区容灾时的备可用区ID，例如 100001 或 ap-guangzhou-1
注：备可用区是主可用区故障后，需要承载流量的可用区。可通过 [DescribeResources](https://cloud.tencent.com/document/api/214/70213) 接口查询一个地域的主/备可用区的列表。
    */
    @SerializedName("SlaveZoneId")
    @Expose
    private String SlaveZoneId;

    /**
    * EIP 的唯一 ID，形如：eip-11112222，仅适用于内网负载均衡绑定EIP。
    */
    @SerializedName("EipAddressId")
    @Expose
    private String EipAddressId;

    /**
    * Target是否放通来自CLB的流量。开启放通（true）：只验证CLB上的安全组；不开启放通（false）：需同时验证CLB和后端实例上的安全组。
    */
    @SerializedName("LoadBalancerPassToTarget")
    @Expose
    private Boolean LoadBalancerPassToTarget;

    /**
     * Get 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。 
     * @return LoadBalancerType 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
     * @param LoadBalancerType 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get 负载均衡实例的类型。1：通用的负载均衡实例，目前只支持传入1。 
     * @return Forward 负载均衡实例的类型。1：通用的负载均衡实例，目前只支持传入1。
     */
    public Long getForward() {
        return this.Forward;
    }

    /**
     * Set 负载均衡实例的类型。1：通用的负载均衡实例，目前只支持传入1。
     * @param Forward 负载均衡实例的类型。1：通用的负载均衡实例，目前只支持传入1。
     */
    public void setForward(Long Forward) {
        this.Forward = Forward;
    }

    /**
     * Get 负载均衡实例的名称，只在创建一个实例的时候才会生效。规则：1-60 个英文、汉字、数字、连接线“-”或下划线“_”。
注意：如果名称与系统中已有负载均衡实例的名称相同，则系统将会自动生成此次创建的负载均衡实例的名称。 
     * @return LoadBalancerName 负载均衡实例的名称，只在创建一个实例的时候才会生效。规则：1-60 个英文、汉字、数字、连接线“-”或下划线“_”。
注意：如果名称与系统中已有负载均衡实例的名称相同，则系统将会自动生成此次创建的负载均衡实例的名称。
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set 负载均衡实例的名称，只在创建一个实例的时候才会生效。规则：1-60 个英文、汉字、数字、连接线“-”或下划线“_”。
注意：如果名称与系统中已有负载均衡实例的名称相同，则系统将会自动生成此次创建的负载均衡实例的名称。
     * @param LoadBalancerName 负载均衡实例的名称，只在创建一个实例的时候才会生效。规则：1-60 个英文、汉字、数字、连接线“-”或下划线“_”。
注意：如果名称与系统中已有负载均衡实例的名称相同，则系统将会自动生成此次创建的负载均衡实例的名称。
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get 负载均衡后端目标设备所属的网络 ID，如vpc-12345678，可以通过 [DescribeVpcEx](https://cloud.tencent.com/document/product/215/1372) 接口获取。 不填此参数则默认为DefaultVPC。创建内网负载均衡实例时，此参数必填。 
     * @return VpcId 负载均衡后端目标设备所属的网络 ID，如vpc-12345678，可以通过 [DescribeVpcEx](https://cloud.tencent.com/document/product/215/1372) 接口获取。 不填此参数则默认为DefaultVPC。创建内网负载均衡实例时，此参数必填。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 负载均衡后端目标设备所属的网络 ID，如vpc-12345678，可以通过 [DescribeVpcEx](https://cloud.tencent.com/document/product/215/1372) 接口获取。 不填此参数则默认为DefaultVPC。创建内网负载均衡实例时，此参数必填。
     * @param VpcId 负载均衡后端目标设备所属的网络 ID，如vpc-12345678，可以通过 [DescribeVpcEx](https://cloud.tencent.com/document/product/215/1372) 接口获取。 不填此参数则默认为DefaultVPC。创建内网负载均衡实例时，此参数必填。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 在私有网络内购买内网负载均衡实例的情况下，必须指定子网 ID，内网负载均衡实例的 VIP 将从这个子网中产生。创建内网负载均衡实例时，此参数必填。 
     * @return SubnetId 在私有网络内购买内网负载均衡实例的情况下，必须指定子网 ID，内网负载均衡实例的 VIP 将从这个子网中产生。创建内网负载均衡实例时，此参数必填。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 在私有网络内购买内网负载均衡实例的情况下，必须指定子网 ID，内网负载均衡实例的 VIP 将从这个子网中产生。创建内网负载均衡实例时，此参数必填。
     * @param SubnetId 在私有网络内购买内网负载均衡实例的情况下，必须指定子网 ID，内网负载均衡实例的 VIP 将从这个子网中产生。创建内网负载均衡实例时，此参数必填。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 负载均衡实例所属的项目 ID，可以通过 [DescribeProject](https://cloud.tencent.com/document/product/378/4400) 接口获取。不填此参数则视为默认项目。 
     * @return ProjectId 负载均衡实例所属的项目 ID，可以通过 [DescribeProject](https://cloud.tencent.com/document/product/378/4400) 接口获取。不填此参数则视为默认项目。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 负载均衡实例所属的项目 ID，可以通过 [DescribeProject](https://cloud.tencent.com/document/product/378/4400) 接口获取。不填此参数则视为默认项目。
     * @param ProjectId 负载均衡实例所属的项目 ID，可以通过 [DescribeProject](https://cloud.tencent.com/document/product/378/4400) 接口获取。不填此参数则视为默认项目。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 仅适用于公网负载均衡。IP版本，可取值：IPV4、IPV6、IPv6FullChain，默认值 IPV4。说明：取值为IPV6表示为IPV6 NAT64版本；取值为IPv6FullChain，表示为IPv6版本。 
     * @return AddressIPVersion 仅适用于公网负载均衡。IP版本，可取值：IPV4、IPV6、IPv6FullChain，默认值 IPV4。说明：取值为IPV6表示为IPV6 NAT64版本；取值为IPv6FullChain，表示为IPv6版本。
     */
    public String getAddressIPVersion() {
        return this.AddressIPVersion;
    }

    /**
     * Set 仅适用于公网负载均衡。IP版本，可取值：IPV4、IPV6、IPv6FullChain，默认值 IPV4。说明：取值为IPV6表示为IPV6 NAT64版本；取值为IPv6FullChain，表示为IPv6版本。
     * @param AddressIPVersion 仅适用于公网负载均衡。IP版本，可取值：IPV4、IPV6、IPv6FullChain，默认值 IPV4。说明：取值为IPV6表示为IPV6 NAT64版本；取值为IPv6FullChain，表示为IPv6版本。
     */
    public void setAddressIPVersion(String AddressIPVersion) {
        this.AddressIPVersion = AddressIPVersion;
    }

    /**
     * Get 创建负载均衡的个数，默认值 1。 
     * @return Number 创建负载均衡的个数，默认值 1。
     */
    public Long getNumber() {
        return this.Number;
    }

    /**
     * Set 创建负载均衡的个数，默认值 1。
     * @param Number 创建负载均衡的个数，默认值 1。
     */
    public void setNumber(Long Number) {
        this.Number = Number;
    }

    /**
     * Get 仅适用于公网负载均衡。设置跨可用区容灾时的主可用区ID，例如 100001 或 ap-guangzhou-1
注：主可用区是需要承载流量的可用区，备可用区默认不承载流量，主可用区不可用时才使用备可用区，平台将为您自动选择最佳备可用区。可通过 [DescribeResources](https://cloud.tencent.com/document/api/214/70213) 接口查询一个地域的主可用区的列表。 
     * @return MasterZoneId 仅适用于公网负载均衡。设置跨可用区容灾时的主可用区ID，例如 100001 或 ap-guangzhou-1
注：主可用区是需要承载流量的可用区，备可用区默认不承载流量，主可用区不可用时才使用备可用区，平台将为您自动选择最佳备可用区。可通过 [DescribeResources](https://cloud.tencent.com/document/api/214/70213) 接口查询一个地域的主可用区的列表。
     */
    public String getMasterZoneId() {
        return this.MasterZoneId;
    }

    /**
     * Set 仅适用于公网负载均衡。设置跨可用区容灾时的主可用区ID，例如 100001 或 ap-guangzhou-1
注：主可用区是需要承载流量的可用区，备可用区默认不承载流量，主可用区不可用时才使用备可用区，平台将为您自动选择最佳备可用区。可通过 [DescribeResources](https://cloud.tencent.com/document/api/214/70213) 接口查询一个地域的主可用区的列表。
     * @param MasterZoneId 仅适用于公网负载均衡。设置跨可用区容灾时的主可用区ID，例如 100001 或 ap-guangzhou-1
注：主可用区是需要承载流量的可用区，备可用区默认不承载流量，主可用区不可用时才使用备可用区，平台将为您自动选择最佳备可用区。可通过 [DescribeResources](https://cloud.tencent.com/document/api/214/70213) 接口查询一个地域的主可用区的列表。
     */
    public void setMasterZoneId(String MasterZoneId) {
        this.MasterZoneId = MasterZoneId;
    }

    /**
     * Get 仅适用于公网负载均衡。可用区ID，指定可用区以创建负载均衡实例。如：ap-guangzhou-1。 
     * @return ZoneId 仅适用于公网负载均衡。可用区ID，指定可用区以创建负载均衡实例。如：ap-guangzhou-1。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 仅适用于公网负载均衡。可用区ID，指定可用区以创建负载均衡实例。如：ap-guangzhou-1。
     * @param ZoneId 仅适用于公网负载均衡。可用区ID，指定可用区以创建负载均衡实例。如：ap-guangzhou-1。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 仅适用于公网负载均衡。负载均衡的网络计费模式。 
     * @return InternetAccessible 仅适用于公网负载均衡。负载均衡的网络计费模式。
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set 仅适用于公网负载均衡。负载均衡的网络计费模式。
     * @param InternetAccessible 仅适用于公网负载均衡。负载均衡的网络计费模式。
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get 仅适用于公网负载均衡。CMCC | CTCC | CUCC，分别对应 移动 | 电信 | 联通，如果不指定本参数，则默认使用BGP。可通过 DescribeSingleIsp 接口查询一个地域所支持的Isp。如果指定运营商，则网络计费式只能使用按带宽包计费(BANDWIDTH_PACKAGE)。 
     * @return VipIsp 仅适用于公网负载均衡。CMCC | CTCC | CUCC，分别对应 移动 | 电信 | 联通，如果不指定本参数，则默认使用BGP。可通过 DescribeSingleIsp 接口查询一个地域所支持的Isp。如果指定运营商，则网络计费式只能使用按带宽包计费(BANDWIDTH_PACKAGE)。
     */
    public String getVipIsp() {
        return this.VipIsp;
    }

    /**
     * Set 仅适用于公网负载均衡。CMCC | CTCC | CUCC，分别对应 移动 | 电信 | 联通，如果不指定本参数，则默认使用BGP。可通过 DescribeSingleIsp 接口查询一个地域所支持的Isp。如果指定运营商，则网络计费式只能使用按带宽包计费(BANDWIDTH_PACKAGE)。
     * @param VipIsp 仅适用于公网负载均衡。CMCC | CTCC | CUCC，分别对应 移动 | 电信 | 联通，如果不指定本参数，则默认使用BGP。可通过 DescribeSingleIsp 接口查询一个地域所支持的Isp。如果指定运营商，则网络计费式只能使用按带宽包计费(BANDWIDTH_PACKAGE)。
     */
    public void setVipIsp(String VipIsp) {
        this.VipIsp = VipIsp;
    }

    /**
     * Get 购买负载均衡的同时，给负载均衡打上标签。 
     * @return Tags 购买负载均衡的同时，给负载均衡打上标签。
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 购买负载均衡的同时，给负载均衡打上标签。
     * @param Tags 购买负载均衡的同时，给负载均衡打上标签。
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 指定VIP申请负载均衡。指定此参数后：
<ul><li>若创建共享型集群的公网负载均衡实例，则上述的VpcId选填，若实例是IPv6类型的，则SubnetId必填；若是IPv4、IPv6 NAT64类型，则SubnetId不填。</li>
<li>若创建独占型集群的公网负载均衡实例，则上述的VpcId选填，若实例是IPv6类型的，则SubnetId必填；若是IPv4、IPv6 NAT64类型，则SubnetId不填。
</li></ul> 
     * @return Vip 指定VIP申请负载均衡。指定此参数后：
<ul><li>若创建共享型集群的公网负载均衡实例，则上述的VpcId选填，若实例是IPv6类型的，则SubnetId必填；若是IPv4、IPv6 NAT64类型，则SubnetId不填。</li>
<li>若创建独占型集群的公网负载均衡实例，则上述的VpcId选填，若实例是IPv6类型的，则SubnetId必填；若是IPv4、IPv6 NAT64类型，则SubnetId不填。
</li></ul>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 指定VIP申请负载均衡。指定此参数后：
<ul><li>若创建共享型集群的公网负载均衡实例，则上述的VpcId选填，若实例是IPv6类型的，则SubnetId必填；若是IPv4、IPv6 NAT64类型，则SubnetId不填。</li>
<li>若创建独占型集群的公网负载均衡实例，则上述的VpcId选填，若实例是IPv6类型的，则SubnetId必填；若是IPv4、IPv6 NAT64类型，则SubnetId不填。
</li></ul>
     * @param Vip 指定VIP申请负载均衡。指定此参数后：
<ul><li>若创建共享型集群的公网负载均衡实例，则上述的VpcId选填，若实例是IPv6类型的，则SubnetId必填；若是IPv4、IPv6 NAT64类型，则SubnetId不填。</li>
<li>若创建独占型集群的公网负载均衡实例，则上述的VpcId选填，若实例是IPv6类型的，则SubnetId必填；若是IPv4、IPv6 NAT64类型，则SubnetId不填。
</li></ul>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 带宽包ID，指定此参数时，网络计费方式（InternetAccessible.InternetChargeType）只支持按带宽包计费（BANDWIDTH_PACKAGE）。 
     * @return BandwidthPackageId 带宽包ID，指定此参数时，网络计费方式（InternetAccessible.InternetChargeType）只支持按带宽包计费（BANDWIDTH_PACKAGE）。
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set 带宽包ID，指定此参数时，网络计费方式（InternetAccessible.InternetChargeType）只支持按带宽包计费（BANDWIDTH_PACKAGE）。
     * @param BandwidthPackageId 带宽包ID，指定此参数时，网络计费方式（InternetAccessible.InternetChargeType）只支持按带宽包计费（BANDWIDTH_PACKAGE）。
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Get 独占集群信息。若创建独占集群负载均衡实例，则此参数必填。 
     * @return ExclusiveCluster 独占集群信息。若创建独占集群负载均衡实例，则此参数必填。
     */
    public ExclusiveCluster getExclusiveCluster() {
        return this.ExclusiveCluster;
    }

    /**
     * Set 独占集群信息。若创建独占集群负载均衡实例，则此参数必填。
     * @param ExclusiveCluster 独占集群信息。若创建独占集群负载均衡实例，则此参数必填。
     */
    public void setExclusiveCluster(ExclusiveCluster ExclusiveCluster) {
        this.ExclusiveCluster = ExclusiveCluster;
    }

    /**
     * Get 创建性能容量型 CLB 实例。
<ul><li>若需要创建性能容量型 CLB 实例，则此参数必填，且取值为：SLA，表示创建按量计费模式下的默认性能保障规格的性能容量型实例。</li>
<li>若需要创建共享型 CLB 实例，则无需填写此参数。</li></ul> 
     * @return SlaType 创建性能容量型 CLB 实例。
<ul><li>若需要创建性能容量型 CLB 实例，则此参数必填，且取值为：SLA，表示创建按量计费模式下的默认性能保障规格的性能容量型实例。</li>
<li>若需要创建共享型 CLB 实例，则无需填写此参数。</li></ul>
     */
    public String getSlaType() {
        return this.SlaType;
    }

    /**
     * Set 创建性能容量型 CLB 实例。
<ul><li>若需要创建性能容量型 CLB 实例，则此参数必填，且取值为：SLA，表示创建按量计费模式下的默认性能保障规格的性能容量型实例。</li>
<li>若需要创建共享型 CLB 实例，则无需填写此参数。</li></ul>
     * @param SlaType 创建性能容量型 CLB 实例。
<ul><li>若需要创建性能容量型 CLB 实例，则此参数必填，且取值为：SLA，表示创建按量计费模式下的默认性能保障规格的性能容量型实例。</li>
<li>若需要创建共享型 CLB 实例，则无需填写此参数。</li></ul>
     */
    public void setSlaType(String SlaType) {
        this.SlaType = SlaType;
    }

    /**
     * Get 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。 
     * @return ClientToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
     * @param ClientToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get 是否支持绑定跨地域/跨Vpc绑定IP的功能。 
     * @return SnatPro 是否支持绑定跨地域/跨Vpc绑定IP的功能。
     */
    public Boolean getSnatPro() {
        return this.SnatPro;
    }

    /**
     * Set 是否支持绑定跨地域/跨Vpc绑定IP的功能。
     * @param SnatPro 是否支持绑定跨地域/跨Vpc绑定IP的功能。
     */
    public void setSnatPro(Boolean SnatPro) {
        this.SnatPro = SnatPro;
    }

    /**
     * Get 开启绑定跨地域/跨Vpc绑定IP的功能后，创建SnatIp。 
     * @return SnatIps 开启绑定跨地域/跨Vpc绑定IP的功能后，创建SnatIp。
     */
    public SnatIp [] getSnatIps() {
        return this.SnatIps;
    }

    /**
     * Set 开启绑定跨地域/跨Vpc绑定IP的功能后，创建SnatIp。
     * @param SnatIps 开启绑定跨地域/跨Vpc绑定IP的功能后，创建SnatIp。
     */
    public void setSnatIps(SnatIp [] SnatIps) {
        this.SnatIps = SnatIps;
    }

    /**
     * Get Stgw独占集群的标签。 
     * @return ClusterTag Stgw独占集群的标签。
     */
    public String getClusterTag() {
        return this.ClusterTag;
    }

    /**
     * Set Stgw独占集群的标签。
     * @param ClusterTag Stgw独占集群的标签。
     */
    public void setClusterTag(String ClusterTag) {
        this.ClusterTag = ClusterTag;
    }

    /**
     * Get 仅适用于公网负载均衡。设置跨可用区容灾时的备可用区ID，例如 100001 或 ap-guangzhou-1
注：备可用区是主可用区故障后，需要承载流量的可用区。可通过 [DescribeResources](https://cloud.tencent.com/document/api/214/70213) 接口查询一个地域的主/备可用区的列表。 
     * @return SlaveZoneId 仅适用于公网负载均衡。设置跨可用区容灾时的备可用区ID，例如 100001 或 ap-guangzhou-1
注：备可用区是主可用区故障后，需要承载流量的可用区。可通过 [DescribeResources](https://cloud.tencent.com/document/api/214/70213) 接口查询一个地域的主/备可用区的列表。
     */
    public String getSlaveZoneId() {
        return this.SlaveZoneId;
    }

    /**
     * Set 仅适用于公网负载均衡。设置跨可用区容灾时的备可用区ID，例如 100001 或 ap-guangzhou-1
注：备可用区是主可用区故障后，需要承载流量的可用区。可通过 [DescribeResources](https://cloud.tencent.com/document/api/214/70213) 接口查询一个地域的主/备可用区的列表。
     * @param SlaveZoneId 仅适用于公网负载均衡。设置跨可用区容灾时的备可用区ID，例如 100001 或 ap-guangzhou-1
注：备可用区是主可用区故障后，需要承载流量的可用区。可通过 [DescribeResources](https://cloud.tencent.com/document/api/214/70213) 接口查询一个地域的主/备可用区的列表。
     */
    public void setSlaveZoneId(String SlaveZoneId) {
        this.SlaveZoneId = SlaveZoneId;
    }

    /**
     * Get EIP 的唯一 ID，形如：eip-11112222，仅适用于内网负载均衡绑定EIP。 
     * @return EipAddressId EIP 的唯一 ID，形如：eip-11112222，仅适用于内网负载均衡绑定EIP。
     */
    public String getEipAddressId() {
        return this.EipAddressId;
    }

    /**
     * Set EIP 的唯一 ID，形如：eip-11112222，仅适用于内网负载均衡绑定EIP。
     * @param EipAddressId EIP 的唯一 ID，形如：eip-11112222，仅适用于内网负载均衡绑定EIP。
     */
    public void setEipAddressId(String EipAddressId) {
        this.EipAddressId = EipAddressId;
    }

    /**
     * Get Target是否放通来自CLB的流量。开启放通（true）：只验证CLB上的安全组；不开启放通（false）：需同时验证CLB和后端实例上的安全组。 
     * @return LoadBalancerPassToTarget Target是否放通来自CLB的流量。开启放通（true）：只验证CLB上的安全组；不开启放通（false）：需同时验证CLB和后端实例上的安全组。
     */
    public Boolean getLoadBalancerPassToTarget() {
        return this.LoadBalancerPassToTarget;
    }

    /**
     * Set Target是否放通来自CLB的流量。开启放通（true）：只验证CLB上的安全组；不开启放通（false）：需同时验证CLB和后端实例上的安全组。
     * @param LoadBalancerPassToTarget Target是否放通来自CLB的流量。开启放通（true）：只验证CLB上的安全组；不开启放通（false）：需同时验证CLB和后端实例上的安全组。
     */
    public void setLoadBalancerPassToTarget(Boolean LoadBalancerPassToTarget) {
        this.LoadBalancerPassToTarget = LoadBalancerPassToTarget;
    }

    public CreateLoadBalancerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLoadBalancerRequest(CreateLoadBalancerRequest source) {
        if (source.LoadBalancerType != null) {
            this.LoadBalancerType = new String(source.LoadBalancerType);
        }
        if (source.Forward != null) {
            this.Forward = new Long(source.Forward);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.AddressIPVersion != null) {
            this.AddressIPVersion = new String(source.AddressIPVersion);
        }
        if (source.Number != null) {
            this.Number = new Long(source.Number);
        }
        if (source.MasterZoneId != null) {
            this.MasterZoneId = new String(source.MasterZoneId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.InternetAccessible != null) {
            this.InternetAccessible = new InternetAccessible(source.InternetAccessible);
        }
        if (source.VipIsp != null) {
            this.VipIsp = new String(source.VipIsp);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.BandwidthPackageId != null) {
            this.BandwidthPackageId = new String(source.BandwidthPackageId);
        }
        if (source.ExclusiveCluster != null) {
            this.ExclusiveCluster = new ExclusiveCluster(source.ExclusiveCluster);
        }
        if (source.SlaType != null) {
            this.SlaType = new String(source.SlaType);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.SnatPro != null) {
            this.SnatPro = new Boolean(source.SnatPro);
        }
        if (source.SnatIps != null) {
            this.SnatIps = new SnatIp[source.SnatIps.length];
            for (int i = 0; i < source.SnatIps.length; i++) {
                this.SnatIps[i] = new SnatIp(source.SnatIps[i]);
            }
        }
        if (source.ClusterTag != null) {
            this.ClusterTag = new String(source.ClusterTag);
        }
        if (source.SlaveZoneId != null) {
            this.SlaveZoneId = new String(source.SlaveZoneId);
        }
        if (source.EipAddressId != null) {
            this.EipAddressId = new String(source.EipAddressId);
        }
        if (source.LoadBalancerPassToTarget != null) {
            this.LoadBalancerPassToTarget = new Boolean(source.LoadBalancerPassToTarget);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamSimple(map, prefix + "Forward", this.Forward);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AddressIPVersion", this.AddressIPVersion);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "MasterZoneId", this.MasterZoneId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamSimple(map, prefix + "VipIsp", this.VipIsp);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);
        this.setParamObj(map, prefix + "ExclusiveCluster.", this.ExclusiveCluster);
        this.setParamSimple(map, prefix + "SlaType", this.SlaType);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "SnatPro", this.SnatPro);
        this.setParamArrayObj(map, prefix + "SnatIps.", this.SnatIps);
        this.setParamSimple(map, prefix + "ClusterTag", this.ClusterTag);
        this.setParamSimple(map, prefix + "SlaveZoneId", this.SlaveZoneId);
        this.setParamSimple(map, prefix + "EipAddressId", this.EipAddressId);
        this.setParamSimple(map, prefix + "LoadBalancerPassToTarget", this.LoadBalancerPassToTarget);

    }
}

