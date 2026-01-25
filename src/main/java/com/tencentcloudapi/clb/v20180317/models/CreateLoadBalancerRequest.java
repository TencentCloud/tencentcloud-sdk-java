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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLoadBalancerRequest extends AbstractModel {

    /**
    * <p>负载均衡实例的网络类型：<br>OPEN：公网属性， INTERNAL：内网属性。</p>
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * <p>负载均衡实例的类型。1：通用的负载均衡实例，目前只支持传入1。</p>
    */
    @SerializedName("Forward")
    @Expose
    private Long Forward;

    /**
    * <p>负载均衡实例的名称，只在创建一个实例的时候才会生效。规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。注意：如果名称与系统中已有负载均衡实例的名称相同，则系统将会自动生成此次创建的负载均衡实例的名称。</p>
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * <p>负载均衡后端目标设备所属的网络 ID，如vpc-12345678，可以通过 <a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a> 接口获取。 不填此参数则默认为DefaultVPC。创建内网负载均衡实例时，此参数必填。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>在私有网络内购买内网负载均衡实例的情况下，必须指定子网 ID，内网负载均衡实例的 VIP 将从这个子网中产生。创建内网负载均衡实例时，此参数必填，创建公网IPv4负载均衡实例时，不支持指定该参数。</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>负载均衡实例所属的项目 ID，默认项目 ID 为0。可以通过 <a href="https://cloud.tencent.com/document/api/651/78725">DescribeProject</a> 接口获取。不填此参数则视为默认项目。</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>仅适用于公网负载均衡。IP版本，可取值：IPV4、IPV6、IPv6FullChain，不区分大小写，默认值 IPV4。说明：取值为IPV6表示为IPV6 NAT64版本；取值为IPv6FullChain，表示为IPv6版本。</p>
    */
    @SerializedName("AddressIPVersion")
    @Expose
    private String AddressIPVersion;

    /**
    * <p>创建负载均衡的个数，默认值 1。创建个数不能超过账号所能创建的最大值，默认创建最大值为20。</p>
    */
    @SerializedName("Number")
    @Expose
    private Long Number;

    /**
    * <p>仅适用于公网且IP版本为IPv4的负载均衡。设置跨可用区容灾时的主可用区ID， 可用区 ID 和名称均支持，例如 100001 或 ap-guangzhou-1<br>注：主可用区是需要承载流量的可用区，备可用区默认不承载流量，主可用区不可用时才使用备可用区。</p>
    */
    @SerializedName("MasterZoneId")
    @Expose
    private String MasterZoneId;

    /**
    * <p>仅适用于公网且IP版本为IPv4的负载均衡。可用区ID，可用区 ID 和名称均支持，指定可用区以创建负载均衡实例。如：100001 或 ap-guangzhou-1。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>网络计费模式，最大出带宽。仅对内网属性的性能容量型实例和公网属性的所有实例生效。API接口购买包年包月实例还在灰度中，如您需要体验该功能，请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a></p>
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * <p>仅适用于公网负载均衡。目前仅广州、上海、南京、济南、杭州、福州、北京、石家庄、武汉、长沙、成都、重庆地域支持静态单线 IP 线路类型，如需体验，请联系商务经理申请。申请通过后，即可选择中国移动（CMCC）、中国联通（CUCC）或中国电信（CTCC）的运营商类型，网络计费模式只能使用按带宽包计费(BANDWIDTH_PACKAGE)。 如果不指定本参数，则默认使用BGP。可通过 <a href="https://cloud.tencent.com/document/api/214/70213">DescribeResources</a>  接口查询一个地域所支持的Isp。</p>
    */
    @SerializedName("VipIsp")
    @Expose
    private String VipIsp;

    /**
    * <p>购买负载均衡的同时，给负载均衡打上标签，最大支持20个标签键值对。</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * <p>指定VIP申请负载均衡。此参数选填，不填写此参数时自动分配VIP。IPv4和IPv6类型支持此参数，IPv6 NAT64类型不支持。<br>注意：当指定VIP创建内网实例、或公网IPv6 BGP实例时，若VIP不属于指定VPC子网的网段内时，会创建失败；若VIP已被占用，也会创建失败。</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>带宽包ID，可以通过 <a href="https://cloud.tencent.com/document/api/215/19209">DescribeBandwidthPackages</a> 接口获取。指定此参数时，网络计费方式（InternetAccessible.InternetChargeType）只支持按带宽包计费（BANDWIDTH_PACKAGE），带宽包的属性即为其结算方式。非上移用户购买的 IPv6 负载均衡实例，且运营商类型非 BGP 时 ，不支持指定具体带宽包id。</p>
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * <p>独占型实例信息。若创建独占型的内网负载均衡实例，则此参数必填。</p>
    */
    @SerializedName("ExclusiveCluster")
    @Expose
    private ExclusiveCluster ExclusiveCluster;

    /**
    * <p>性能容量型规格。</p><ul><li>若需要创建性能容量型实例，则此参数必填，取值范围：<ul><li> clb.c2.medium：标准型规格 </li><li> clb.c3.small：高阶型1规格 </li><li> clb.c3.medium：高阶型2规格 </li><li> clb.c4.small：超强型1规格 </li><li> clb.c4.medium：超强型2规格 </li><li> clb.c4.large：超强型3规格 </li><li> clb.c4.xlarge：超强型4规格 </li></ul></li><li>若需要创建共享型实例，则无需填写此参数。</li></ul>如需了解规格详情，请参见[实例规格对比](https://cloud.tencent.com/document/product/214/84689)。
    */
    @SerializedName("SlaType")
    @Expose
    private String SlaType;

    /**
    * <p>集群ID，集群标识，在需要配置公有云独占集群或本地专有集群时使用。公有云独占集群申请请<a href="https://console.cloud.tencent.com/workorder/category">提交工单</a>，本地专有集群请参考<a href="https://cloud.tencent.com/document/product/1346">本地专有集群</a>描述。</p>
    */
    @SerializedName("ClusterIds")
    @Expose
    private String [] ClusterIds;

    /**
    * <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>是否支持绑定跨地域/跨Vpc绑定IP的功能。</p>
    */
    @SerializedName("SnatPro")
    @Expose
    private Boolean SnatPro;

    /**
    * <p>开启绑定跨地域/跨Vpc绑定IP的功能后，创建SnatIp。</p>
    */
    @SerializedName("SnatIps")
    @Expose
    private SnatIp [] SnatIps;

    /**
    * <p>Stgw独占集群的标签。</p>
    */
    @SerializedName("ClusterTag")
    @Expose
    private String ClusterTag;

    /**
    * <p>仅适用于公网且IP版本为IPv4的负载均衡。设置跨可用区容灾时的备可用区ID，可用区 ID 和名称均支持，例如 100001 或 ap-guangzhou-1<br>注：备可用区是主可用区故障后，需要承载流量的可用区。可通过 <a href="https://cloud.tencent.com/document/api/214/70213">DescribeResources</a> 接口查询一个地域的主/备可用区的列表。【如果您需要体验该功能，请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a>】</p>
    */
    @SerializedName("SlaveZoneId")
    @Expose
    private String SlaveZoneId;

    /**
    * <p>EIP 的唯一 ID，可以通过 <a href="https://cloud.tencent.com/document/product/215/16702">DescribeAddresses</a> 接口查询。形如：eip-qhx8udkc，仅适用于内网负载均衡绑定EIP。</p>
    */
    @SerializedName("EipAddressId")
    @Expose
    private String EipAddressId;

    /**
    * <p>Target是否放通来自CLB的流量。开启放通（true）：只验证CLB上的安全组；不开启放通（false）：需同时验证CLB和后端实例上的安全组。IPv6 CLB安全组默认放通，不需要传此参数。</p>
    */
    @SerializedName("LoadBalancerPassToTarget")
    @Expose
    private Boolean LoadBalancerPassToTarget;

    /**
    * <p>创建域名化负载均衡。</p>
    */
    @SerializedName("DynamicVip")
    @Expose
    private Boolean DynamicVip;

    /**
    * <p>网络出口</p>
    */
    @SerializedName("Egress")
    @Expose
    private String Egress;

    /**
    * <p>负载均衡实例的预付费相关属性，API接口购买包年包月实例还在灰度中，如您需要体验该功能，请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a></p>
    */
    @SerializedName("LBChargePrepaid")
    @Expose
    private LBChargePrepaid LBChargePrepaid;

    /**
    * <p>负载均衡实例计费类型，取值：POSTPAID_BY_HOUR，PREPAID，默认是POSTPAID_BY_HOUR。API接口购买包年包月实例还在灰度中，如您需要体验该功能，请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a></p>
    */
    @SerializedName("LBChargeType")
    @Expose
    private String LBChargeType;

    /**
    * <p>七层访问日志主题ID</p>
    */
    @SerializedName("AccessLogTopicId")
    @Expose
    private String AccessLogTopicId;

    /**
    * <p>是否开启七层高级路由</p>
    */
    @SerializedName("AdvancedRoute")
    @Expose
    private Boolean AdvancedRoute;

    /**
     * Get <p>负载均衡实例的网络类型：<br>OPEN：公网属性， INTERNAL：内网属性。</p> 
     * @return LoadBalancerType <p>负载均衡实例的网络类型：<br>OPEN：公网属性， INTERNAL：内网属性。</p>
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set <p>负载均衡实例的网络类型：<br>OPEN：公网属性， INTERNAL：内网属性。</p>
     * @param LoadBalancerType <p>负载均衡实例的网络类型：<br>OPEN：公网属性， INTERNAL：内网属性。</p>
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get <p>负载均衡实例的类型。1：通用的负载均衡实例，目前只支持传入1。</p> 
     * @return Forward <p>负载均衡实例的类型。1：通用的负载均衡实例，目前只支持传入1。</p>
     */
    public Long getForward() {
        return this.Forward;
    }

    /**
     * Set <p>负载均衡实例的类型。1：通用的负载均衡实例，目前只支持传入1。</p>
     * @param Forward <p>负载均衡实例的类型。1：通用的负载均衡实例，目前只支持传入1。</p>
     */
    public void setForward(Long Forward) {
        this.Forward = Forward;
    }

    /**
     * Get <p>负载均衡实例的名称，只在创建一个实例的时候才会生效。规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。注意：如果名称与系统中已有负载均衡实例的名称相同，则系统将会自动生成此次创建的负载均衡实例的名称。</p> 
     * @return LoadBalancerName <p>负载均衡实例的名称，只在创建一个实例的时候才会生效。规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。注意：如果名称与系统中已有负载均衡实例的名称相同，则系统将会自动生成此次创建的负载均衡实例的名称。</p>
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set <p>负载均衡实例的名称，只在创建一个实例的时候才会生效。规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。注意：如果名称与系统中已有负载均衡实例的名称相同，则系统将会自动生成此次创建的负载均衡实例的名称。</p>
     * @param LoadBalancerName <p>负载均衡实例的名称，只在创建一个实例的时候才会生效。规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。注意：如果名称与系统中已有负载均衡实例的名称相同，则系统将会自动生成此次创建的负载均衡实例的名称。</p>
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get <p>负载均衡后端目标设备所属的网络 ID，如vpc-12345678，可以通过 <a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a> 接口获取。 不填此参数则默认为DefaultVPC。创建内网负载均衡实例时，此参数必填。</p> 
     * @return VpcId <p>负载均衡后端目标设备所属的网络 ID，如vpc-12345678，可以通过 <a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a> 接口获取。 不填此参数则默认为DefaultVPC。创建内网负载均衡实例时，此参数必填。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>负载均衡后端目标设备所属的网络 ID，如vpc-12345678，可以通过 <a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a> 接口获取。 不填此参数则默认为DefaultVPC。创建内网负载均衡实例时，此参数必填。</p>
     * @param VpcId <p>负载均衡后端目标设备所属的网络 ID，如vpc-12345678，可以通过 <a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a> 接口获取。 不填此参数则默认为DefaultVPC。创建内网负载均衡实例时，此参数必填。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>在私有网络内购买内网负载均衡实例的情况下，必须指定子网 ID，内网负载均衡实例的 VIP 将从这个子网中产生。创建内网负载均衡实例时，此参数必填，创建公网IPv4负载均衡实例时，不支持指定该参数。</p> 
     * @return SubnetId <p>在私有网络内购买内网负载均衡实例的情况下，必须指定子网 ID，内网负载均衡实例的 VIP 将从这个子网中产生。创建内网负载均衡实例时，此参数必填，创建公网IPv4负载均衡实例时，不支持指定该参数。</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>在私有网络内购买内网负载均衡实例的情况下，必须指定子网 ID，内网负载均衡实例的 VIP 将从这个子网中产生。创建内网负载均衡实例时，此参数必填，创建公网IPv4负载均衡实例时，不支持指定该参数。</p>
     * @param SubnetId <p>在私有网络内购买内网负载均衡实例的情况下，必须指定子网 ID，内网负载均衡实例的 VIP 将从这个子网中产生。创建内网负载均衡实例时，此参数必填，创建公网IPv4负载均衡实例时，不支持指定该参数。</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>负载均衡实例所属的项目 ID，默认项目 ID 为0。可以通过 <a href="https://cloud.tencent.com/document/api/651/78725">DescribeProject</a> 接口获取。不填此参数则视为默认项目。</p> 
     * @return ProjectId <p>负载均衡实例所属的项目 ID，默认项目 ID 为0。可以通过 <a href="https://cloud.tencent.com/document/api/651/78725">DescribeProject</a> 接口获取。不填此参数则视为默认项目。</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>负载均衡实例所属的项目 ID，默认项目 ID 为0。可以通过 <a href="https://cloud.tencent.com/document/api/651/78725">DescribeProject</a> 接口获取。不填此参数则视为默认项目。</p>
     * @param ProjectId <p>负载均衡实例所属的项目 ID，默认项目 ID 为0。可以通过 <a href="https://cloud.tencent.com/document/api/651/78725">DescribeProject</a> 接口获取。不填此参数则视为默认项目。</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>仅适用于公网负载均衡。IP版本，可取值：IPV4、IPV6、IPv6FullChain，不区分大小写，默认值 IPV4。说明：取值为IPV6表示为IPV6 NAT64版本；取值为IPv6FullChain，表示为IPv6版本。</p> 
     * @return AddressIPVersion <p>仅适用于公网负载均衡。IP版本，可取值：IPV4、IPV6、IPv6FullChain，不区分大小写，默认值 IPV4。说明：取值为IPV6表示为IPV6 NAT64版本；取值为IPv6FullChain，表示为IPv6版本。</p>
     */
    public String getAddressIPVersion() {
        return this.AddressIPVersion;
    }

    /**
     * Set <p>仅适用于公网负载均衡。IP版本，可取值：IPV4、IPV6、IPv6FullChain，不区分大小写，默认值 IPV4。说明：取值为IPV6表示为IPV6 NAT64版本；取值为IPv6FullChain，表示为IPv6版本。</p>
     * @param AddressIPVersion <p>仅适用于公网负载均衡。IP版本，可取值：IPV4、IPV6、IPv6FullChain，不区分大小写，默认值 IPV4。说明：取值为IPV6表示为IPV6 NAT64版本；取值为IPv6FullChain，表示为IPv6版本。</p>
     */
    public void setAddressIPVersion(String AddressIPVersion) {
        this.AddressIPVersion = AddressIPVersion;
    }

    /**
     * Get <p>创建负载均衡的个数，默认值 1。创建个数不能超过账号所能创建的最大值，默认创建最大值为20。</p> 
     * @return Number <p>创建负载均衡的个数，默认值 1。创建个数不能超过账号所能创建的最大值，默认创建最大值为20。</p>
     */
    public Long getNumber() {
        return this.Number;
    }

    /**
     * Set <p>创建负载均衡的个数，默认值 1。创建个数不能超过账号所能创建的最大值，默认创建最大值为20。</p>
     * @param Number <p>创建负载均衡的个数，默认值 1。创建个数不能超过账号所能创建的最大值，默认创建最大值为20。</p>
     */
    public void setNumber(Long Number) {
        this.Number = Number;
    }

    /**
     * Get <p>仅适用于公网且IP版本为IPv4的负载均衡。设置跨可用区容灾时的主可用区ID， 可用区 ID 和名称均支持，例如 100001 或 ap-guangzhou-1<br>注：主可用区是需要承载流量的可用区，备可用区默认不承载流量，主可用区不可用时才使用备可用区。</p> 
     * @return MasterZoneId <p>仅适用于公网且IP版本为IPv4的负载均衡。设置跨可用区容灾时的主可用区ID， 可用区 ID 和名称均支持，例如 100001 或 ap-guangzhou-1<br>注：主可用区是需要承载流量的可用区，备可用区默认不承载流量，主可用区不可用时才使用备可用区。</p>
     */
    public String getMasterZoneId() {
        return this.MasterZoneId;
    }

    /**
     * Set <p>仅适用于公网且IP版本为IPv4的负载均衡。设置跨可用区容灾时的主可用区ID， 可用区 ID 和名称均支持，例如 100001 或 ap-guangzhou-1<br>注：主可用区是需要承载流量的可用区，备可用区默认不承载流量，主可用区不可用时才使用备可用区。</p>
     * @param MasterZoneId <p>仅适用于公网且IP版本为IPv4的负载均衡。设置跨可用区容灾时的主可用区ID， 可用区 ID 和名称均支持，例如 100001 或 ap-guangzhou-1<br>注：主可用区是需要承载流量的可用区，备可用区默认不承载流量，主可用区不可用时才使用备可用区。</p>
     */
    public void setMasterZoneId(String MasterZoneId) {
        this.MasterZoneId = MasterZoneId;
    }

    /**
     * Get <p>仅适用于公网且IP版本为IPv4的负载均衡。可用区ID，可用区 ID 和名称均支持，指定可用区以创建负载均衡实例。如：100001 或 ap-guangzhou-1。</p> 
     * @return ZoneId <p>仅适用于公网且IP版本为IPv4的负载均衡。可用区ID，可用区 ID 和名称均支持，指定可用区以创建负载均衡实例。如：100001 或 ap-guangzhou-1。</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>仅适用于公网且IP版本为IPv4的负载均衡。可用区ID，可用区 ID 和名称均支持，指定可用区以创建负载均衡实例。如：100001 或 ap-guangzhou-1。</p>
     * @param ZoneId <p>仅适用于公网且IP版本为IPv4的负载均衡。可用区ID，可用区 ID 和名称均支持，指定可用区以创建负载均衡实例。如：100001 或 ap-guangzhou-1。</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>网络计费模式，最大出带宽。仅对内网属性的性能容量型实例和公网属性的所有实例生效。API接口购买包年包月实例还在灰度中，如您需要体验该功能，请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a></p> 
     * @return InternetAccessible <p>网络计费模式，最大出带宽。仅对内网属性的性能容量型实例和公网属性的所有实例生效。API接口购买包年包月实例还在灰度中，如您需要体验该功能，请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a></p>
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set <p>网络计费模式，最大出带宽。仅对内网属性的性能容量型实例和公网属性的所有实例生效。API接口购买包年包月实例还在灰度中，如您需要体验该功能，请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a></p>
     * @param InternetAccessible <p>网络计费模式，最大出带宽。仅对内网属性的性能容量型实例和公网属性的所有实例生效。API接口购买包年包月实例还在灰度中，如您需要体验该功能，请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a></p>
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get <p>仅适用于公网负载均衡。目前仅广州、上海、南京、济南、杭州、福州、北京、石家庄、武汉、长沙、成都、重庆地域支持静态单线 IP 线路类型，如需体验，请联系商务经理申请。申请通过后，即可选择中国移动（CMCC）、中国联通（CUCC）或中国电信（CTCC）的运营商类型，网络计费模式只能使用按带宽包计费(BANDWIDTH_PACKAGE)。 如果不指定本参数，则默认使用BGP。可通过 <a href="https://cloud.tencent.com/document/api/214/70213">DescribeResources</a>  接口查询一个地域所支持的Isp。</p> 
     * @return VipIsp <p>仅适用于公网负载均衡。目前仅广州、上海、南京、济南、杭州、福州、北京、石家庄、武汉、长沙、成都、重庆地域支持静态单线 IP 线路类型，如需体验，请联系商务经理申请。申请通过后，即可选择中国移动（CMCC）、中国联通（CUCC）或中国电信（CTCC）的运营商类型，网络计费模式只能使用按带宽包计费(BANDWIDTH_PACKAGE)。 如果不指定本参数，则默认使用BGP。可通过 <a href="https://cloud.tencent.com/document/api/214/70213">DescribeResources</a>  接口查询一个地域所支持的Isp。</p>
     */
    public String getVipIsp() {
        return this.VipIsp;
    }

    /**
     * Set <p>仅适用于公网负载均衡。目前仅广州、上海、南京、济南、杭州、福州、北京、石家庄、武汉、长沙、成都、重庆地域支持静态单线 IP 线路类型，如需体验，请联系商务经理申请。申请通过后，即可选择中国移动（CMCC）、中国联通（CUCC）或中国电信（CTCC）的运营商类型，网络计费模式只能使用按带宽包计费(BANDWIDTH_PACKAGE)。 如果不指定本参数，则默认使用BGP。可通过 <a href="https://cloud.tencent.com/document/api/214/70213">DescribeResources</a>  接口查询一个地域所支持的Isp。</p>
     * @param VipIsp <p>仅适用于公网负载均衡。目前仅广州、上海、南京、济南、杭州、福州、北京、石家庄、武汉、长沙、成都、重庆地域支持静态单线 IP 线路类型，如需体验，请联系商务经理申请。申请通过后，即可选择中国移动（CMCC）、中国联通（CUCC）或中国电信（CTCC）的运营商类型，网络计费模式只能使用按带宽包计费(BANDWIDTH_PACKAGE)。 如果不指定本参数，则默认使用BGP。可通过 <a href="https://cloud.tencent.com/document/api/214/70213">DescribeResources</a>  接口查询一个地域所支持的Isp。</p>
     */
    public void setVipIsp(String VipIsp) {
        this.VipIsp = VipIsp;
    }

    /**
     * Get <p>购买负载均衡的同时，给负载均衡打上标签，最大支持20个标签键值对。</p> 
     * @return Tags <p>购买负载均衡的同时，给负载均衡打上标签，最大支持20个标签键值对。</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>购买负载均衡的同时，给负载均衡打上标签，最大支持20个标签键值对。</p>
     * @param Tags <p>购买负载均衡的同时，给负载均衡打上标签，最大支持20个标签键值对。</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>指定VIP申请负载均衡。此参数选填，不填写此参数时自动分配VIP。IPv4和IPv6类型支持此参数，IPv6 NAT64类型不支持。<br>注意：当指定VIP创建内网实例、或公网IPv6 BGP实例时，若VIP不属于指定VPC子网的网段内时，会创建失败；若VIP已被占用，也会创建失败。</p> 
     * @return Vip <p>指定VIP申请负载均衡。此参数选填，不填写此参数时自动分配VIP。IPv4和IPv6类型支持此参数，IPv6 NAT64类型不支持。<br>注意：当指定VIP创建内网实例、或公网IPv6 BGP实例时，若VIP不属于指定VPC子网的网段内时，会创建失败；若VIP已被占用，也会创建失败。</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>指定VIP申请负载均衡。此参数选填，不填写此参数时自动分配VIP。IPv4和IPv6类型支持此参数，IPv6 NAT64类型不支持。<br>注意：当指定VIP创建内网实例、或公网IPv6 BGP实例时，若VIP不属于指定VPC子网的网段内时，会创建失败；若VIP已被占用，也会创建失败。</p>
     * @param Vip <p>指定VIP申请负载均衡。此参数选填，不填写此参数时自动分配VIP。IPv4和IPv6类型支持此参数，IPv6 NAT64类型不支持。<br>注意：当指定VIP创建内网实例、或公网IPv6 BGP实例时，若VIP不属于指定VPC子网的网段内时，会创建失败；若VIP已被占用，也会创建失败。</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>带宽包ID，可以通过 <a href="https://cloud.tencent.com/document/api/215/19209">DescribeBandwidthPackages</a> 接口获取。指定此参数时，网络计费方式（InternetAccessible.InternetChargeType）只支持按带宽包计费（BANDWIDTH_PACKAGE），带宽包的属性即为其结算方式。非上移用户购买的 IPv6 负载均衡实例，且运营商类型非 BGP 时 ，不支持指定具体带宽包id。</p> 
     * @return BandwidthPackageId <p>带宽包ID，可以通过 <a href="https://cloud.tencent.com/document/api/215/19209">DescribeBandwidthPackages</a> 接口获取。指定此参数时，网络计费方式（InternetAccessible.InternetChargeType）只支持按带宽包计费（BANDWIDTH_PACKAGE），带宽包的属性即为其结算方式。非上移用户购买的 IPv6 负载均衡实例，且运营商类型非 BGP 时 ，不支持指定具体带宽包id。</p>
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set <p>带宽包ID，可以通过 <a href="https://cloud.tencent.com/document/api/215/19209">DescribeBandwidthPackages</a> 接口获取。指定此参数时，网络计费方式（InternetAccessible.InternetChargeType）只支持按带宽包计费（BANDWIDTH_PACKAGE），带宽包的属性即为其结算方式。非上移用户购买的 IPv6 负载均衡实例，且运营商类型非 BGP 时 ，不支持指定具体带宽包id。</p>
     * @param BandwidthPackageId <p>带宽包ID，可以通过 <a href="https://cloud.tencent.com/document/api/215/19209">DescribeBandwidthPackages</a> 接口获取。指定此参数时，网络计费方式（InternetAccessible.InternetChargeType）只支持按带宽包计费（BANDWIDTH_PACKAGE），带宽包的属性即为其结算方式。非上移用户购买的 IPv6 负载均衡实例，且运营商类型非 BGP 时 ，不支持指定具体带宽包id。</p>
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Get <p>独占型实例信息。若创建独占型的内网负载均衡实例，则此参数必填。</p> 
     * @return ExclusiveCluster <p>独占型实例信息。若创建独占型的内网负载均衡实例，则此参数必填。</p>
     */
    public ExclusiveCluster getExclusiveCluster() {
        return this.ExclusiveCluster;
    }

    /**
     * Set <p>独占型实例信息。若创建独占型的内网负载均衡实例，则此参数必填。</p>
     * @param ExclusiveCluster <p>独占型实例信息。若创建独占型的内网负载均衡实例，则此参数必填。</p>
     */
    public void setExclusiveCluster(ExclusiveCluster ExclusiveCluster) {
        this.ExclusiveCluster = ExclusiveCluster;
    }

    /**
     * Get <p>性能容量型规格。</p><ul><li>若需要创建性能容量型实例，则此参数必填，取值范围：<ul><li> clb.c2.medium：标准型规格 </li><li> clb.c3.small：高阶型1规格 </li><li> clb.c3.medium：高阶型2规格 </li><li> clb.c4.small：超强型1规格 </li><li> clb.c4.medium：超强型2规格 </li><li> clb.c4.large：超强型3规格 </li><li> clb.c4.xlarge：超强型4规格 </li></ul></li><li>若需要创建共享型实例，则无需填写此参数。</li></ul>如需了解规格详情，请参见[实例规格对比](https://cloud.tencent.com/document/product/214/84689)。 
     * @return SlaType <p>性能容量型规格。</p><ul><li>若需要创建性能容量型实例，则此参数必填，取值范围：<ul><li> clb.c2.medium：标准型规格 </li><li> clb.c3.small：高阶型1规格 </li><li> clb.c3.medium：高阶型2规格 </li><li> clb.c4.small：超强型1规格 </li><li> clb.c4.medium：超强型2规格 </li><li> clb.c4.large：超强型3规格 </li><li> clb.c4.xlarge：超强型4规格 </li></ul></li><li>若需要创建共享型实例，则无需填写此参数。</li></ul>如需了解规格详情，请参见[实例规格对比](https://cloud.tencent.com/document/product/214/84689)。
     */
    public String getSlaType() {
        return this.SlaType;
    }

    /**
     * Set <p>性能容量型规格。</p><ul><li>若需要创建性能容量型实例，则此参数必填，取值范围：<ul><li> clb.c2.medium：标准型规格 </li><li> clb.c3.small：高阶型1规格 </li><li> clb.c3.medium：高阶型2规格 </li><li> clb.c4.small：超强型1规格 </li><li> clb.c4.medium：超强型2规格 </li><li> clb.c4.large：超强型3规格 </li><li> clb.c4.xlarge：超强型4规格 </li></ul></li><li>若需要创建共享型实例，则无需填写此参数。</li></ul>如需了解规格详情，请参见[实例规格对比](https://cloud.tencent.com/document/product/214/84689)。
     * @param SlaType <p>性能容量型规格。</p><ul><li>若需要创建性能容量型实例，则此参数必填，取值范围：<ul><li> clb.c2.medium：标准型规格 </li><li> clb.c3.small：高阶型1规格 </li><li> clb.c3.medium：高阶型2规格 </li><li> clb.c4.small：超强型1规格 </li><li> clb.c4.medium：超强型2规格 </li><li> clb.c4.large：超强型3规格 </li><li> clb.c4.xlarge：超强型4规格 </li></ul></li><li>若需要创建共享型实例，则无需填写此参数。</li></ul>如需了解规格详情，请参见[实例规格对比](https://cloud.tencent.com/document/product/214/84689)。
     */
    public void setSlaType(String SlaType) {
        this.SlaType = SlaType;
    }

    /**
     * Get <p>集群ID，集群标识，在需要配置公有云独占集群或本地专有集群时使用。公有云独占集群申请请<a href="https://console.cloud.tencent.com/workorder/category">提交工单</a>，本地专有集群请参考<a href="https://cloud.tencent.com/document/product/1346">本地专有集群</a>描述。</p> 
     * @return ClusterIds <p>集群ID，集群标识，在需要配置公有云独占集群或本地专有集群时使用。公有云独占集群申请请<a href="https://console.cloud.tencent.com/workorder/category">提交工单</a>，本地专有集群请参考<a href="https://cloud.tencent.com/document/product/1346">本地专有集群</a>描述。</p>
     */
    public String [] getClusterIds() {
        return this.ClusterIds;
    }

    /**
     * Set <p>集群ID，集群标识，在需要配置公有云独占集群或本地专有集群时使用。公有云独占集群申请请<a href="https://console.cloud.tencent.com/workorder/category">提交工单</a>，本地专有集群请参考<a href="https://cloud.tencent.com/document/product/1346">本地专有集群</a>描述。</p>
     * @param ClusterIds <p>集群ID，集群标识，在需要配置公有云独占集群或本地专有集群时使用。公有云独占集群申请请<a href="https://console.cloud.tencent.com/workorder/category">提交工单</a>，本地专有集群请参考<a href="https://cloud.tencent.com/document/product/1346">本地专有集群</a>描述。</p>
     */
    public void setClusterIds(String [] ClusterIds) {
        this.ClusterIds = ClusterIds;
    }

    /**
     * Get <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。</p> 
     * @return ClientToken <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。</p>
     * @param ClientToken <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get <p>是否支持绑定跨地域/跨Vpc绑定IP的功能。</p> 
     * @return SnatPro <p>是否支持绑定跨地域/跨Vpc绑定IP的功能。</p>
     */
    public Boolean getSnatPro() {
        return this.SnatPro;
    }

    /**
     * Set <p>是否支持绑定跨地域/跨Vpc绑定IP的功能。</p>
     * @param SnatPro <p>是否支持绑定跨地域/跨Vpc绑定IP的功能。</p>
     */
    public void setSnatPro(Boolean SnatPro) {
        this.SnatPro = SnatPro;
    }

    /**
     * Get <p>开启绑定跨地域/跨Vpc绑定IP的功能后，创建SnatIp。</p> 
     * @return SnatIps <p>开启绑定跨地域/跨Vpc绑定IP的功能后，创建SnatIp。</p>
     */
    public SnatIp [] getSnatIps() {
        return this.SnatIps;
    }

    /**
     * Set <p>开启绑定跨地域/跨Vpc绑定IP的功能后，创建SnatIp。</p>
     * @param SnatIps <p>开启绑定跨地域/跨Vpc绑定IP的功能后，创建SnatIp。</p>
     */
    public void setSnatIps(SnatIp [] SnatIps) {
        this.SnatIps = SnatIps;
    }

    /**
     * Get <p>Stgw独占集群的标签。</p> 
     * @return ClusterTag <p>Stgw独占集群的标签。</p>
     */
    public String getClusterTag() {
        return this.ClusterTag;
    }

    /**
     * Set <p>Stgw独占集群的标签。</p>
     * @param ClusterTag <p>Stgw独占集群的标签。</p>
     */
    public void setClusterTag(String ClusterTag) {
        this.ClusterTag = ClusterTag;
    }

    /**
     * Get <p>仅适用于公网且IP版本为IPv4的负载均衡。设置跨可用区容灾时的备可用区ID，可用区 ID 和名称均支持，例如 100001 或 ap-guangzhou-1<br>注：备可用区是主可用区故障后，需要承载流量的可用区。可通过 <a href="https://cloud.tencent.com/document/api/214/70213">DescribeResources</a> 接口查询一个地域的主/备可用区的列表。【如果您需要体验该功能，请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a>】</p> 
     * @return SlaveZoneId <p>仅适用于公网且IP版本为IPv4的负载均衡。设置跨可用区容灾时的备可用区ID，可用区 ID 和名称均支持，例如 100001 或 ap-guangzhou-1<br>注：备可用区是主可用区故障后，需要承载流量的可用区。可通过 <a href="https://cloud.tencent.com/document/api/214/70213">DescribeResources</a> 接口查询一个地域的主/备可用区的列表。【如果您需要体验该功能，请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a>】</p>
     */
    public String getSlaveZoneId() {
        return this.SlaveZoneId;
    }

    /**
     * Set <p>仅适用于公网且IP版本为IPv4的负载均衡。设置跨可用区容灾时的备可用区ID，可用区 ID 和名称均支持，例如 100001 或 ap-guangzhou-1<br>注：备可用区是主可用区故障后，需要承载流量的可用区。可通过 <a href="https://cloud.tencent.com/document/api/214/70213">DescribeResources</a> 接口查询一个地域的主/备可用区的列表。【如果您需要体验该功能，请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a>】</p>
     * @param SlaveZoneId <p>仅适用于公网且IP版本为IPv4的负载均衡。设置跨可用区容灾时的备可用区ID，可用区 ID 和名称均支持，例如 100001 或 ap-guangzhou-1<br>注：备可用区是主可用区故障后，需要承载流量的可用区。可通过 <a href="https://cloud.tencent.com/document/api/214/70213">DescribeResources</a> 接口查询一个地域的主/备可用区的列表。【如果您需要体验该功能，请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a>】</p>
     */
    public void setSlaveZoneId(String SlaveZoneId) {
        this.SlaveZoneId = SlaveZoneId;
    }

    /**
     * Get <p>EIP 的唯一 ID，可以通过 <a href="https://cloud.tencent.com/document/product/215/16702">DescribeAddresses</a> 接口查询。形如：eip-qhx8udkc，仅适用于内网负载均衡绑定EIP。</p> 
     * @return EipAddressId <p>EIP 的唯一 ID，可以通过 <a href="https://cloud.tencent.com/document/product/215/16702">DescribeAddresses</a> 接口查询。形如：eip-qhx8udkc，仅适用于内网负载均衡绑定EIP。</p>
     */
    public String getEipAddressId() {
        return this.EipAddressId;
    }

    /**
     * Set <p>EIP 的唯一 ID，可以通过 <a href="https://cloud.tencent.com/document/product/215/16702">DescribeAddresses</a> 接口查询。形如：eip-qhx8udkc，仅适用于内网负载均衡绑定EIP。</p>
     * @param EipAddressId <p>EIP 的唯一 ID，可以通过 <a href="https://cloud.tencent.com/document/product/215/16702">DescribeAddresses</a> 接口查询。形如：eip-qhx8udkc，仅适用于内网负载均衡绑定EIP。</p>
     */
    public void setEipAddressId(String EipAddressId) {
        this.EipAddressId = EipAddressId;
    }

    /**
     * Get <p>Target是否放通来自CLB的流量。开启放通（true）：只验证CLB上的安全组；不开启放通（false）：需同时验证CLB和后端实例上的安全组。IPv6 CLB安全组默认放通，不需要传此参数。</p> 
     * @return LoadBalancerPassToTarget <p>Target是否放通来自CLB的流量。开启放通（true）：只验证CLB上的安全组；不开启放通（false）：需同时验证CLB和后端实例上的安全组。IPv6 CLB安全组默认放通，不需要传此参数。</p>
     */
    public Boolean getLoadBalancerPassToTarget() {
        return this.LoadBalancerPassToTarget;
    }

    /**
     * Set <p>Target是否放通来自CLB的流量。开启放通（true）：只验证CLB上的安全组；不开启放通（false）：需同时验证CLB和后端实例上的安全组。IPv6 CLB安全组默认放通，不需要传此参数。</p>
     * @param LoadBalancerPassToTarget <p>Target是否放通来自CLB的流量。开启放通（true）：只验证CLB上的安全组；不开启放通（false）：需同时验证CLB和后端实例上的安全组。IPv6 CLB安全组默认放通，不需要传此参数。</p>
     */
    public void setLoadBalancerPassToTarget(Boolean LoadBalancerPassToTarget) {
        this.LoadBalancerPassToTarget = LoadBalancerPassToTarget;
    }

    /**
     * Get <p>创建域名化负载均衡。</p> 
     * @return DynamicVip <p>创建域名化负载均衡。</p>
     */
    public Boolean getDynamicVip() {
        return this.DynamicVip;
    }

    /**
     * Set <p>创建域名化负载均衡。</p>
     * @param DynamicVip <p>创建域名化负载均衡。</p>
     */
    public void setDynamicVip(Boolean DynamicVip) {
        this.DynamicVip = DynamicVip;
    }

    /**
     * Get <p>网络出口</p> 
     * @return Egress <p>网络出口</p>
     */
    public String getEgress() {
        return this.Egress;
    }

    /**
     * Set <p>网络出口</p>
     * @param Egress <p>网络出口</p>
     */
    public void setEgress(String Egress) {
        this.Egress = Egress;
    }

    /**
     * Get <p>负载均衡实例的预付费相关属性，API接口购买包年包月实例还在灰度中，如您需要体验该功能，请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a></p> 
     * @return LBChargePrepaid <p>负载均衡实例的预付费相关属性，API接口购买包年包月实例还在灰度中，如您需要体验该功能，请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a></p>
     */
    public LBChargePrepaid getLBChargePrepaid() {
        return this.LBChargePrepaid;
    }

    /**
     * Set <p>负载均衡实例的预付费相关属性，API接口购买包年包月实例还在灰度中，如您需要体验该功能，请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a></p>
     * @param LBChargePrepaid <p>负载均衡实例的预付费相关属性，API接口购买包年包月实例还在灰度中，如您需要体验该功能，请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a></p>
     */
    public void setLBChargePrepaid(LBChargePrepaid LBChargePrepaid) {
        this.LBChargePrepaid = LBChargePrepaid;
    }

    /**
     * Get <p>负载均衡实例计费类型，取值：POSTPAID_BY_HOUR，PREPAID，默认是POSTPAID_BY_HOUR。API接口购买包年包月实例还在灰度中，如您需要体验该功能，请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a></p> 
     * @return LBChargeType <p>负载均衡实例计费类型，取值：POSTPAID_BY_HOUR，PREPAID，默认是POSTPAID_BY_HOUR。API接口购买包年包月实例还在灰度中，如您需要体验该功能，请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a></p>
     */
    public String getLBChargeType() {
        return this.LBChargeType;
    }

    /**
     * Set <p>负载均衡实例计费类型，取值：POSTPAID_BY_HOUR，PREPAID，默认是POSTPAID_BY_HOUR。API接口购买包年包月实例还在灰度中，如您需要体验该功能，请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a></p>
     * @param LBChargeType <p>负载均衡实例计费类型，取值：POSTPAID_BY_HOUR，PREPAID，默认是POSTPAID_BY_HOUR。API接口购买包年包月实例还在灰度中，如您需要体验该功能，请通过 <a href="https://console.cloud.tencent.com/workorder/category">工单申请</a></p>
     */
    public void setLBChargeType(String LBChargeType) {
        this.LBChargeType = LBChargeType;
    }

    /**
     * Get <p>七层访问日志主题ID</p> 
     * @return AccessLogTopicId <p>七层访问日志主题ID</p>
     */
    public String getAccessLogTopicId() {
        return this.AccessLogTopicId;
    }

    /**
     * Set <p>七层访问日志主题ID</p>
     * @param AccessLogTopicId <p>七层访问日志主题ID</p>
     */
    public void setAccessLogTopicId(String AccessLogTopicId) {
        this.AccessLogTopicId = AccessLogTopicId;
    }

    /**
     * Get <p>是否开启七层高级路由</p> 
     * @return AdvancedRoute <p>是否开启七层高级路由</p>
     */
    public Boolean getAdvancedRoute() {
        return this.AdvancedRoute;
    }

    /**
     * Set <p>是否开启七层高级路由</p>
     * @param AdvancedRoute <p>是否开启七层高级路由</p>
     */
    public void setAdvancedRoute(Boolean AdvancedRoute) {
        this.AdvancedRoute = AdvancedRoute;
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
        if (source.ClusterIds != null) {
            this.ClusterIds = new String[source.ClusterIds.length];
            for (int i = 0; i < source.ClusterIds.length; i++) {
                this.ClusterIds[i] = new String(source.ClusterIds[i]);
            }
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
        if (source.DynamicVip != null) {
            this.DynamicVip = new Boolean(source.DynamicVip);
        }
        if (source.Egress != null) {
            this.Egress = new String(source.Egress);
        }
        if (source.LBChargePrepaid != null) {
            this.LBChargePrepaid = new LBChargePrepaid(source.LBChargePrepaid);
        }
        if (source.LBChargeType != null) {
            this.LBChargeType = new String(source.LBChargeType);
        }
        if (source.AccessLogTopicId != null) {
            this.AccessLogTopicId = new String(source.AccessLogTopicId);
        }
        if (source.AdvancedRoute != null) {
            this.AdvancedRoute = new Boolean(source.AdvancedRoute);
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
        this.setParamArraySimple(map, prefix + "ClusterIds.", this.ClusterIds);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "SnatPro", this.SnatPro);
        this.setParamArrayObj(map, prefix + "SnatIps.", this.SnatIps);
        this.setParamSimple(map, prefix + "ClusterTag", this.ClusterTag);
        this.setParamSimple(map, prefix + "SlaveZoneId", this.SlaveZoneId);
        this.setParamSimple(map, prefix + "EipAddressId", this.EipAddressId);
        this.setParamSimple(map, prefix + "LoadBalancerPassToTarget", this.LoadBalancerPassToTarget);
        this.setParamSimple(map, prefix + "DynamicVip", this.DynamicVip);
        this.setParamSimple(map, prefix + "Egress", this.Egress);
        this.setParamObj(map, prefix + "LBChargePrepaid.", this.LBChargePrepaid);
        this.setParamSimple(map, prefix + "LBChargeType", this.LBChargeType);
        this.setParamSimple(map, prefix + "AccessLogTopicId", this.AccessLogTopicId);
        this.setParamSimple(map, prefix + "AdvancedRoute", this.AdvancedRoute);

    }
}

