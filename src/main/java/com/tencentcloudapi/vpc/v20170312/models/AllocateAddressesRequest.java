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

public class AllocateAddressesRequest extends AbstractModel {

    /**
    * EIP数量。可申请的数量限制参考：[EIP 配额限制](https://cloud.tencent.com/document/product/1199/41648)。默认值：1。
    */
    @SerializedName("AddressCount")
    @Expose
    private Long AddressCount;

    /**
    * EIP线路类型。各种线路类型详情可参考：[EIP 的 IP 地址类型](https://cloud.tencent.com/document/product/1199/41646)。默认值：BGP。
<ul style="margin:0"><li>BGP：常规 BGP 线路</li>
<li>已开通静态单线IP白名单的用户，可选值：<ul><li>CMCC：中国移动</li>
<li>CTCC：中国电信</li>
<li>CUCC：中国联通</li></ul></li>注意：仅部分地域支持静态单线IP。</ul>

    */
    @SerializedName("InternetServiceProvider")
    @Expose
    private String InternetServiceProvider;

    /**
    * EIP计费方式。
<ul style="margin:0"><li>标准账户类型，可选值：<ul><li>BANDWIDTH_PACKAGE：[共享带宽包](https://cloud.tencent.com/document/product/684/15255)付费</li>
<li>BANDWIDTH_POSTPAID_BY_HOUR：带宽按小时后付费</li>
<li>BANDWIDTH_PREPAID_BY_MONTH：包月按带宽预付费</li>
<li>TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费</li></ul>默认值：TRAFFIC_POSTPAID_BY_HOUR。</li>
<li>传统账户类型，无需传递此参数，EIP计费方式与其绑定的实例的计费方式一致，无需传递此参数。</li></ul>
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * EIP出带宽上限，单位：Mbps。
<ul style="margin:0"><li>标准账户类型EIP出带宽上限，可选值范围取决于EIP计费方式：<ul><li>BANDWIDTH_PACKAGE：1 Mbps 至 2000 Mbps</li>
<li>BANDWIDTH_POSTPAID_BY_HOUR：1 Mbps 至 100 Mbps</li>
<li>BANDWIDTH_PREPAID_BY_MONTH：1 Mbps 至 200 Mbps</li>
<li>TRAFFIC_POSTPAID_BY_HOUR：1 Mbps 至 100 Mbps</li></ul>默认值：1 Mbps。</li>
<li>传统账户类型无需传递此参数，EIP出带宽上限取决于与其绑定的实例的公网出带宽上限，无需传递此参数。</li></ul>
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * 包月按带宽预付费EIP的计费参数。EIP为包月按带宽预付费时，该参数必传，其余场景不需传递
    */
    @SerializedName("AddressChargePrepaid")
    @Expose
    private AddressChargePrepaid AddressChargePrepaid;

    /**
    * EIP类型。各种EIP类型详情可参考：[EIP 的 IP 地址类型](https://cloud.tencent.com/document/product/1199/41646)。默认值：EIP。
<li>EIP：弹性公网 IP。 </li>
<li>AnycastEIP：加速 IP，已开通 [Anycast 公网加速](https://cloud.tencent.com/document/product/644)白名单的用户可选。仅部分地域支持加速IP，详情可见Anycast公网加速[购买指南](https://cloud.tencent.com/document/product/644/12617)。</li>
<li>HighQualityEIP：精品 IP。仅新加坡和中国香港支持精品IP。</li>
<li>AntiDDoSEIP：高防 IP。仅部分地域支持高防IP，详情可见弹性公网IP[产品概述](https://cloud.tencent.com/document/product/1199/41646)。</li>
    */
    @SerializedName("AddressType")
    @Expose
    private String AddressType;

    /**
    * Anycast发布域。
<ul style="margin:0"><li>已开通Anycast公网加速白名单的用户，可选值：<ul><li>ANYCAST_ZONE_GLOBAL：全球发布域（需要额外开通Anycast全球加速白名单）</li><li>ANYCAST_ZONE_OVERSEAS：境外发布域</li></ul>默认值：ANYCAST_ZONE_OVERSEAS。</li></ul>
    */
    @SerializedName("AnycastZone")
    @Expose
    private String AnycastZone;

    /**
    * 指定IP地址申请EIP，每个账户每个月只有三次配额
    */
    @SerializedName("VipCluster")
    @Expose
    private String [] VipCluster;

    /**
    * <b>[已废弃]</b> AnycastEIP不再区分是否负载均衡。原参数说明如下：
AnycastEIP是否用于绑定负载均衡。
<ul style="margin:0"><li>已开通Anycast公网加速白名单的用户，可选值：<ul><li>TRUE：AnycastEIP可绑定对象为负载均衡</li>
<li>FALSE：AnycastEIP可绑定对象为云服务器、NAT网关、高可用虚拟IP等</li></ul>默认值：FALSE。</li></ul>
    */
    @SerializedName("ApplicableForCLB")
    @Expose
    private Boolean ApplicableForCLB;

    /**
    * 需要关联的标签列表。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * BGP带宽包唯一ID参数。设定该参数且InternetChargeType为BANDWIDTH_PACKAGE，则表示创建的EIP加入该BGP带宽包并采用带宽包计费
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * EIP名称，用于申请EIP时用户自定义该EIP的个性化名称，默认值：未命名
    */
    @SerializedName("AddressName")
    @Expose
    private String AddressName;

    /**
    * CDC唯一ID
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
    * 是否使用独占资源池，默认值：True
- True：表示使用独占资源池
- False：表示使用共享资源池

说明：如需使用独占资源池，请 提交工单(https://console.cloud.tencent.com/workorder/category) 咨询，具体费用请咨询商务经理。
    */
    @SerializedName("IsDedicatedAddressPool")
    @Expose
    private Boolean IsDedicatedAddressPool;

    /**
    * 网络出口，当前仅支持精品BGP、静态单线，这2种IP 地址类型的指定出口传入，默认值：center_egress1，其它可选值：center_egress2、center_egress3
    */
    @SerializedName("Egress")
    @Expose
    private String Egress;

    /**
    * 高防包ID， 申请高防IP时，该字段必传。
    */
    @SerializedName("AntiDDoSPackageId")
    @Expose
    private String AntiDDoSPackageId;

    /**
    * 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
     * Get EIP数量。可申请的数量限制参考：[EIP 配额限制](https://cloud.tencent.com/document/product/1199/41648)。默认值：1。 
     * @return AddressCount EIP数量。可申请的数量限制参考：[EIP 配额限制](https://cloud.tencent.com/document/product/1199/41648)。默认值：1。
     */
    public Long getAddressCount() {
        return this.AddressCount;
    }

    /**
     * Set EIP数量。可申请的数量限制参考：[EIP 配额限制](https://cloud.tencent.com/document/product/1199/41648)。默认值：1。
     * @param AddressCount EIP数量。可申请的数量限制参考：[EIP 配额限制](https://cloud.tencent.com/document/product/1199/41648)。默认值：1。
     */
    public void setAddressCount(Long AddressCount) {
        this.AddressCount = AddressCount;
    }

    /**
     * Get EIP线路类型。各种线路类型详情可参考：[EIP 的 IP 地址类型](https://cloud.tencent.com/document/product/1199/41646)。默认值：BGP。
<ul style="margin:0"><li>BGP：常规 BGP 线路</li>
<li>已开通静态单线IP白名单的用户，可选值：<ul><li>CMCC：中国移动</li>
<li>CTCC：中国电信</li>
<li>CUCC：中国联通</li></ul></li>注意：仅部分地域支持静态单线IP。</ul>
 
     * @return InternetServiceProvider EIP线路类型。各种线路类型详情可参考：[EIP 的 IP 地址类型](https://cloud.tencent.com/document/product/1199/41646)。默认值：BGP。
<ul style="margin:0"><li>BGP：常规 BGP 线路</li>
<li>已开通静态单线IP白名单的用户，可选值：<ul><li>CMCC：中国移动</li>
<li>CTCC：中国电信</li>
<li>CUCC：中国联通</li></ul></li>注意：仅部分地域支持静态单线IP。</ul>

     */
    public String getInternetServiceProvider() {
        return this.InternetServiceProvider;
    }

    /**
     * Set EIP线路类型。各种线路类型详情可参考：[EIP 的 IP 地址类型](https://cloud.tencent.com/document/product/1199/41646)。默认值：BGP。
<ul style="margin:0"><li>BGP：常规 BGP 线路</li>
<li>已开通静态单线IP白名单的用户，可选值：<ul><li>CMCC：中国移动</li>
<li>CTCC：中国电信</li>
<li>CUCC：中国联通</li></ul></li>注意：仅部分地域支持静态单线IP。</ul>

     * @param InternetServiceProvider EIP线路类型。各种线路类型详情可参考：[EIP 的 IP 地址类型](https://cloud.tencent.com/document/product/1199/41646)。默认值：BGP。
<ul style="margin:0"><li>BGP：常规 BGP 线路</li>
<li>已开通静态单线IP白名单的用户，可选值：<ul><li>CMCC：中国移动</li>
<li>CTCC：中国电信</li>
<li>CUCC：中国联通</li></ul></li>注意：仅部分地域支持静态单线IP。</ul>

     */
    public void setInternetServiceProvider(String InternetServiceProvider) {
        this.InternetServiceProvider = InternetServiceProvider;
    }

    /**
     * Get EIP计费方式。
<ul style="margin:0"><li>标准账户类型，可选值：<ul><li>BANDWIDTH_PACKAGE：[共享带宽包](https://cloud.tencent.com/document/product/684/15255)付费</li>
<li>BANDWIDTH_POSTPAID_BY_HOUR：带宽按小时后付费</li>
<li>BANDWIDTH_PREPAID_BY_MONTH：包月按带宽预付费</li>
<li>TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费</li></ul>默认值：TRAFFIC_POSTPAID_BY_HOUR。</li>
<li>传统账户类型，无需传递此参数，EIP计费方式与其绑定的实例的计费方式一致，无需传递此参数。</li></ul> 
     * @return InternetChargeType EIP计费方式。
<ul style="margin:0"><li>标准账户类型，可选值：<ul><li>BANDWIDTH_PACKAGE：[共享带宽包](https://cloud.tencent.com/document/product/684/15255)付费</li>
<li>BANDWIDTH_POSTPAID_BY_HOUR：带宽按小时后付费</li>
<li>BANDWIDTH_PREPAID_BY_MONTH：包月按带宽预付费</li>
<li>TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费</li></ul>默认值：TRAFFIC_POSTPAID_BY_HOUR。</li>
<li>传统账户类型，无需传递此参数，EIP计费方式与其绑定的实例的计费方式一致，无需传递此参数。</li></ul>
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set EIP计费方式。
<ul style="margin:0"><li>标准账户类型，可选值：<ul><li>BANDWIDTH_PACKAGE：[共享带宽包](https://cloud.tencent.com/document/product/684/15255)付费</li>
<li>BANDWIDTH_POSTPAID_BY_HOUR：带宽按小时后付费</li>
<li>BANDWIDTH_PREPAID_BY_MONTH：包月按带宽预付费</li>
<li>TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费</li></ul>默认值：TRAFFIC_POSTPAID_BY_HOUR。</li>
<li>传统账户类型，无需传递此参数，EIP计费方式与其绑定的实例的计费方式一致，无需传递此参数。</li></ul>
     * @param InternetChargeType EIP计费方式。
<ul style="margin:0"><li>标准账户类型，可选值：<ul><li>BANDWIDTH_PACKAGE：[共享带宽包](https://cloud.tencent.com/document/product/684/15255)付费</li>
<li>BANDWIDTH_POSTPAID_BY_HOUR：带宽按小时后付费</li>
<li>BANDWIDTH_PREPAID_BY_MONTH：包月按带宽预付费</li>
<li>TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费</li></ul>默认值：TRAFFIC_POSTPAID_BY_HOUR。</li>
<li>传统账户类型，无需传递此参数，EIP计费方式与其绑定的实例的计费方式一致，无需传递此参数。</li></ul>
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Get EIP出带宽上限，单位：Mbps。
<ul style="margin:0"><li>标准账户类型EIP出带宽上限，可选值范围取决于EIP计费方式：<ul><li>BANDWIDTH_PACKAGE：1 Mbps 至 2000 Mbps</li>
<li>BANDWIDTH_POSTPAID_BY_HOUR：1 Mbps 至 100 Mbps</li>
<li>BANDWIDTH_PREPAID_BY_MONTH：1 Mbps 至 200 Mbps</li>
<li>TRAFFIC_POSTPAID_BY_HOUR：1 Mbps 至 100 Mbps</li></ul>默认值：1 Mbps。</li>
<li>传统账户类型无需传递此参数，EIP出带宽上限取决于与其绑定的实例的公网出带宽上限，无需传递此参数。</li></ul> 
     * @return InternetMaxBandwidthOut EIP出带宽上限，单位：Mbps。
<ul style="margin:0"><li>标准账户类型EIP出带宽上限，可选值范围取决于EIP计费方式：<ul><li>BANDWIDTH_PACKAGE：1 Mbps 至 2000 Mbps</li>
<li>BANDWIDTH_POSTPAID_BY_HOUR：1 Mbps 至 100 Mbps</li>
<li>BANDWIDTH_PREPAID_BY_MONTH：1 Mbps 至 200 Mbps</li>
<li>TRAFFIC_POSTPAID_BY_HOUR：1 Mbps 至 100 Mbps</li></ul>默认值：1 Mbps。</li>
<li>传统账户类型无需传递此参数，EIP出带宽上限取决于与其绑定的实例的公网出带宽上限，无需传递此参数。</li></ul>
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set EIP出带宽上限，单位：Mbps。
<ul style="margin:0"><li>标准账户类型EIP出带宽上限，可选值范围取决于EIP计费方式：<ul><li>BANDWIDTH_PACKAGE：1 Mbps 至 2000 Mbps</li>
<li>BANDWIDTH_POSTPAID_BY_HOUR：1 Mbps 至 100 Mbps</li>
<li>BANDWIDTH_PREPAID_BY_MONTH：1 Mbps 至 200 Mbps</li>
<li>TRAFFIC_POSTPAID_BY_HOUR：1 Mbps 至 100 Mbps</li></ul>默认值：1 Mbps。</li>
<li>传统账户类型无需传递此参数，EIP出带宽上限取决于与其绑定的实例的公网出带宽上限，无需传递此参数。</li></ul>
     * @param InternetMaxBandwidthOut EIP出带宽上限，单位：Mbps。
<ul style="margin:0"><li>标准账户类型EIP出带宽上限，可选值范围取决于EIP计费方式：<ul><li>BANDWIDTH_PACKAGE：1 Mbps 至 2000 Mbps</li>
<li>BANDWIDTH_POSTPAID_BY_HOUR：1 Mbps 至 100 Mbps</li>
<li>BANDWIDTH_PREPAID_BY_MONTH：1 Mbps 至 200 Mbps</li>
<li>TRAFFIC_POSTPAID_BY_HOUR：1 Mbps 至 100 Mbps</li></ul>默认值：1 Mbps。</li>
<li>传统账户类型无需传递此参数，EIP出带宽上限取决于与其绑定的实例的公网出带宽上限，无需传递此参数。</li></ul>
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get 包月按带宽预付费EIP的计费参数。EIP为包月按带宽预付费时，该参数必传，其余场景不需传递 
     * @return AddressChargePrepaid 包月按带宽预付费EIP的计费参数。EIP为包月按带宽预付费时，该参数必传，其余场景不需传递
     */
    public AddressChargePrepaid getAddressChargePrepaid() {
        return this.AddressChargePrepaid;
    }

    /**
     * Set 包月按带宽预付费EIP的计费参数。EIP为包月按带宽预付费时，该参数必传，其余场景不需传递
     * @param AddressChargePrepaid 包月按带宽预付费EIP的计费参数。EIP为包月按带宽预付费时，该参数必传，其余场景不需传递
     */
    public void setAddressChargePrepaid(AddressChargePrepaid AddressChargePrepaid) {
        this.AddressChargePrepaid = AddressChargePrepaid;
    }

    /**
     * Get EIP类型。各种EIP类型详情可参考：[EIP 的 IP 地址类型](https://cloud.tencent.com/document/product/1199/41646)。默认值：EIP。
<li>EIP：弹性公网 IP。 </li>
<li>AnycastEIP：加速 IP，已开通 [Anycast 公网加速](https://cloud.tencent.com/document/product/644)白名单的用户可选。仅部分地域支持加速IP，详情可见Anycast公网加速[购买指南](https://cloud.tencent.com/document/product/644/12617)。</li>
<li>HighQualityEIP：精品 IP。仅新加坡和中国香港支持精品IP。</li>
<li>AntiDDoSEIP：高防 IP。仅部分地域支持高防IP，详情可见弹性公网IP[产品概述](https://cloud.tencent.com/document/product/1199/41646)。</li> 
     * @return AddressType EIP类型。各种EIP类型详情可参考：[EIP 的 IP 地址类型](https://cloud.tencent.com/document/product/1199/41646)。默认值：EIP。
<li>EIP：弹性公网 IP。 </li>
<li>AnycastEIP：加速 IP，已开通 [Anycast 公网加速](https://cloud.tencent.com/document/product/644)白名单的用户可选。仅部分地域支持加速IP，详情可见Anycast公网加速[购买指南](https://cloud.tencent.com/document/product/644/12617)。</li>
<li>HighQualityEIP：精品 IP。仅新加坡和中国香港支持精品IP。</li>
<li>AntiDDoSEIP：高防 IP。仅部分地域支持高防IP，详情可见弹性公网IP[产品概述](https://cloud.tencent.com/document/product/1199/41646)。</li>
     */
    public String getAddressType() {
        return this.AddressType;
    }

    /**
     * Set EIP类型。各种EIP类型详情可参考：[EIP 的 IP 地址类型](https://cloud.tencent.com/document/product/1199/41646)。默认值：EIP。
<li>EIP：弹性公网 IP。 </li>
<li>AnycastEIP：加速 IP，已开通 [Anycast 公网加速](https://cloud.tencent.com/document/product/644)白名单的用户可选。仅部分地域支持加速IP，详情可见Anycast公网加速[购买指南](https://cloud.tencent.com/document/product/644/12617)。</li>
<li>HighQualityEIP：精品 IP。仅新加坡和中国香港支持精品IP。</li>
<li>AntiDDoSEIP：高防 IP。仅部分地域支持高防IP，详情可见弹性公网IP[产品概述](https://cloud.tencent.com/document/product/1199/41646)。</li>
     * @param AddressType EIP类型。各种EIP类型详情可参考：[EIP 的 IP 地址类型](https://cloud.tencent.com/document/product/1199/41646)。默认值：EIP。
<li>EIP：弹性公网 IP。 </li>
<li>AnycastEIP：加速 IP，已开通 [Anycast 公网加速](https://cloud.tencent.com/document/product/644)白名单的用户可选。仅部分地域支持加速IP，详情可见Anycast公网加速[购买指南](https://cloud.tencent.com/document/product/644/12617)。</li>
<li>HighQualityEIP：精品 IP。仅新加坡和中国香港支持精品IP。</li>
<li>AntiDDoSEIP：高防 IP。仅部分地域支持高防IP，详情可见弹性公网IP[产品概述](https://cloud.tencent.com/document/product/1199/41646)。</li>
     */
    public void setAddressType(String AddressType) {
        this.AddressType = AddressType;
    }

    /**
     * Get Anycast发布域。
<ul style="margin:0"><li>已开通Anycast公网加速白名单的用户，可选值：<ul><li>ANYCAST_ZONE_GLOBAL：全球发布域（需要额外开通Anycast全球加速白名单）</li><li>ANYCAST_ZONE_OVERSEAS：境外发布域</li></ul>默认值：ANYCAST_ZONE_OVERSEAS。</li></ul> 
     * @return AnycastZone Anycast发布域。
<ul style="margin:0"><li>已开通Anycast公网加速白名单的用户，可选值：<ul><li>ANYCAST_ZONE_GLOBAL：全球发布域（需要额外开通Anycast全球加速白名单）</li><li>ANYCAST_ZONE_OVERSEAS：境外发布域</li></ul>默认值：ANYCAST_ZONE_OVERSEAS。</li></ul>
     */
    public String getAnycastZone() {
        return this.AnycastZone;
    }

    /**
     * Set Anycast发布域。
<ul style="margin:0"><li>已开通Anycast公网加速白名单的用户，可选值：<ul><li>ANYCAST_ZONE_GLOBAL：全球发布域（需要额外开通Anycast全球加速白名单）</li><li>ANYCAST_ZONE_OVERSEAS：境外发布域</li></ul>默认值：ANYCAST_ZONE_OVERSEAS。</li></ul>
     * @param AnycastZone Anycast发布域。
<ul style="margin:0"><li>已开通Anycast公网加速白名单的用户，可选值：<ul><li>ANYCAST_ZONE_GLOBAL：全球发布域（需要额外开通Anycast全球加速白名单）</li><li>ANYCAST_ZONE_OVERSEAS：境外发布域</li></ul>默认值：ANYCAST_ZONE_OVERSEAS。</li></ul>
     */
    public void setAnycastZone(String AnycastZone) {
        this.AnycastZone = AnycastZone;
    }

    /**
     * Get 指定IP地址申请EIP，每个账户每个月只有三次配额 
     * @return VipCluster 指定IP地址申请EIP，每个账户每个月只有三次配额
     */
    public String [] getVipCluster() {
        return this.VipCluster;
    }

    /**
     * Set 指定IP地址申请EIP，每个账户每个月只有三次配额
     * @param VipCluster 指定IP地址申请EIP，每个账户每个月只有三次配额
     */
    public void setVipCluster(String [] VipCluster) {
        this.VipCluster = VipCluster;
    }

    /**
     * Get <b>[已废弃]</b> AnycastEIP不再区分是否负载均衡。原参数说明如下：
AnycastEIP是否用于绑定负载均衡。
<ul style="margin:0"><li>已开通Anycast公网加速白名单的用户，可选值：<ul><li>TRUE：AnycastEIP可绑定对象为负载均衡</li>
<li>FALSE：AnycastEIP可绑定对象为云服务器、NAT网关、高可用虚拟IP等</li></ul>默认值：FALSE。</li></ul> 
     * @return ApplicableForCLB <b>[已废弃]</b> AnycastEIP不再区分是否负载均衡。原参数说明如下：
AnycastEIP是否用于绑定负载均衡。
<ul style="margin:0"><li>已开通Anycast公网加速白名单的用户，可选值：<ul><li>TRUE：AnycastEIP可绑定对象为负载均衡</li>
<li>FALSE：AnycastEIP可绑定对象为云服务器、NAT网关、高可用虚拟IP等</li></ul>默认值：FALSE。</li></ul>
     * @deprecated
     */
    @Deprecated
    public Boolean getApplicableForCLB() {
        return this.ApplicableForCLB;
    }

    /**
     * Set <b>[已废弃]</b> AnycastEIP不再区分是否负载均衡。原参数说明如下：
AnycastEIP是否用于绑定负载均衡。
<ul style="margin:0"><li>已开通Anycast公网加速白名单的用户，可选值：<ul><li>TRUE：AnycastEIP可绑定对象为负载均衡</li>
<li>FALSE：AnycastEIP可绑定对象为云服务器、NAT网关、高可用虚拟IP等</li></ul>默认值：FALSE。</li></ul>
     * @param ApplicableForCLB <b>[已废弃]</b> AnycastEIP不再区分是否负载均衡。原参数说明如下：
AnycastEIP是否用于绑定负载均衡。
<ul style="margin:0"><li>已开通Anycast公网加速白名单的用户，可选值：<ul><li>TRUE：AnycastEIP可绑定对象为负载均衡</li>
<li>FALSE：AnycastEIP可绑定对象为云服务器、NAT网关、高可用虚拟IP等</li></ul>默认值：FALSE。</li></ul>
     * @deprecated
     */
    @Deprecated
    public void setApplicableForCLB(Boolean ApplicableForCLB) {
        this.ApplicableForCLB = ApplicableForCLB;
    }

    /**
     * Get 需要关联的标签列表。 
     * @return Tags 需要关联的标签列表。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 需要关联的标签列表。
     * @param Tags 需要关联的标签列表。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get BGP带宽包唯一ID参数。设定该参数且InternetChargeType为BANDWIDTH_PACKAGE，则表示创建的EIP加入该BGP带宽包并采用带宽包计费 
     * @return BandwidthPackageId BGP带宽包唯一ID参数。设定该参数且InternetChargeType为BANDWIDTH_PACKAGE，则表示创建的EIP加入该BGP带宽包并采用带宽包计费
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set BGP带宽包唯一ID参数。设定该参数且InternetChargeType为BANDWIDTH_PACKAGE，则表示创建的EIP加入该BGP带宽包并采用带宽包计费
     * @param BandwidthPackageId BGP带宽包唯一ID参数。设定该参数且InternetChargeType为BANDWIDTH_PACKAGE，则表示创建的EIP加入该BGP带宽包并采用带宽包计费
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Get EIP名称，用于申请EIP时用户自定义该EIP的个性化名称，默认值：未命名 
     * @return AddressName EIP名称，用于申请EIP时用户自定义该EIP的个性化名称，默认值：未命名
     */
    public String getAddressName() {
        return this.AddressName;
    }

    /**
     * Set EIP名称，用于申请EIP时用户自定义该EIP的个性化名称，默认值：未命名
     * @param AddressName EIP名称，用于申请EIP时用户自定义该EIP的个性化名称，默认值：未命名
     */
    public void setAddressName(String AddressName) {
        this.AddressName = AddressName;
    }

    /**
     * Get CDC唯一ID 
     * @return DedicatedClusterId CDC唯一ID
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set CDC唯一ID
     * @param DedicatedClusterId CDC唯一ID
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    /**
     * Get 是否使用独占资源池，默认值：True
- True：表示使用独占资源池
- False：表示使用共享资源池

说明：如需使用独占资源池，请 提交工单(https://console.cloud.tencent.com/workorder/category) 咨询，具体费用请咨询商务经理。 
     * @return IsDedicatedAddressPool 是否使用独占资源池，默认值：True
- True：表示使用独占资源池
- False：表示使用共享资源池

说明：如需使用独占资源池，请 提交工单(https://console.cloud.tencent.com/workorder/category) 咨询，具体费用请咨询商务经理。
     */
    public Boolean getIsDedicatedAddressPool() {
        return this.IsDedicatedAddressPool;
    }

    /**
     * Set 是否使用独占资源池，默认值：True
- True：表示使用独占资源池
- False：表示使用共享资源池

说明：如需使用独占资源池，请 提交工单(https://console.cloud.tencent.com/workorder/category) 咨询，具体费用请咨询商务经理。
     * @param IsDedicatedAddressPool 是否使用独占资源池，默认值：True
- True：表示使用独占资源池
- False：表示使用共享资源池

说明：如需使用独占资源池，请 提交工单(https://console.cloud.tencent.com/workorder/category) 咨询，具体费用请咨询商务经理。
     */
    public void setIsDedicatedAddressPool(Boolean IsDedicatedAddressPool) {
        this.IsDedicatedAddressPool = IsDedicatedAddressPool;
    }

    /**
     * Get 网络出口，当前仅支持精品BGP、静态单线，这2种IP 地址类型的指定出口传入，默认值：center_egress1，其它可选值：center_egress2、center_egress3 
     * @return Egress 网络出口，当前仅支持精品BGP、静态单线，这2种IP 地址类型的指定出口传入，默认值：center_egress1，其它可选值：center_egress2、center_egress3
     */
    public String getEgress() {
        return this.Egress;
    }

    /**
     * Set 网络出口，当前仅支持精品BGP、静态单线，这2种IP 地址类型的指定出口传入，默认值：center_egress1，其它可选值：center_egress2、center_egress3
     * @param Egress 网络出口，当前仅支持精品BGP、静态单线，这2种IP 地址类型的指定出口传入，默认值：center_egress1，其它可选值：center_egress2、center_egress3
     */
    public void setEgress(String Egress) {
        this.Egress = Egress;
    }

    /**
     * Get 高防包ID， 申请高防IP时，该字段必传。 
     * @return AntiDDoSPackageId 高防包ID， 申请高防IP时，该字段必传。
     */
    public String getAntiDDoSPackageId() {
        return this.AntiDDoSPackageId;
    }

    /**
     * Set 高防包ID， 申请高防IP时，该字段必传。
     * @param AntiDDoSPackageId 高防包ID， 申请高防IP时，该字段必传。
     */
    public void setAntiDDoSPackageId(String AntiDDoSPackageId) {
        this.AntiDDoSPackageId = AntiDDoSPackageId;
    }

    /**
     * Get 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。 
     * @return ClientToken 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。
     * @param ClientToken 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    public AllocateAddressesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocateAddressesRequest(AllocateAddressesRequest source) {
        if (source.AddressCount != null) {
            this.AddressCount = new Long(source.AddressCount);
        }
        if (source.InternetServiceProvider != null) {
            this.InternetServiceProvider = new String(source.InternetServiceProvider);
        }
        if (source.InternetChargeType != null) {
            this.InternetChargeType = new String(source.InternetChargeType);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.AddressChargePrepaid != null) {
            this.AddressChargePrepaid = new AddressChargePrepaid(source.AddressChargePrepaid);
        }
        if (source.AddressType != null) {
            this.AddressType = new String(source.AddressType);
        }
        if (source.AnycastZone != null) {
            this.AnycastZone = new String(source.AnycastZone);
        }
        if (source.VipCluster != null) {
            this.VipCluster = new String[source.VipCluster.length];
            for (int i = 0; i < source.VipCluster.length; i++) {
                this.VipCluster[i] = new String(source.VipCluster[i]);
            }
        }
        if (source.ApplicableForCLB != null) {
            this.ApplicableForCLB = new Boolean(source.ApplicableForCLB);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.BandwidthPackageId != null) {
            this.BandwidthPackageId = new String(source.BandwidthPackageId);
        }
        if (source.AddressName != null) {
            this.AddressName = new String(source.AddressName);
        }
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
        if (source.IsDedicatedAddressPool != null) {
            this.IsDedicatedAddressPool = new Boolean(source.IsDedicatedAddressPool);
        }
        if (source.Egress != null) {
            this.Egress = new String(source.Egress);
        }
        if (source.AntiDDoSPackageId != null) {
            this.AntiDDoSPackageId = new String(source.AntiDDoSPackageId);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressCount", this.AddressCount);
        this.setParamSimple(map, prefix + "InternetServiceProvider", this.InternetServiceProvider);
        this.setParamSimple(map, prefix + "InternetChargeType", this.InternetChargeType);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamObj(map, prefix + "AddressChargePrepaid.", this.AddressChargePrepaid);
        this.setParamSimple(map, prefix + "AddressType", this.AddressType);
        this.setParamSimple(map, prefix + "AnycastZone", this.AnycastZone);
        this.setParamArraySimple(map, prefix + "VipCluster.", this.VipCluster);
        this.setParamSimple(map, prefix + "ApplicableForCLB", this.ApplicableForCLB);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);
        this.setParamSimple(map, prefix + "AddressName", this.AddressName);
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);
        this.setParamSimple(map, prefix + "IsDedicatedAddressPool", this.IsDedicatedAddressPool);
        this.setParamSimple(map, prefix + "Egress", this.Egress);
        this.setParamSimple(map, prefix + "AntiDDoSPackageId", this.AntiDDoSPackageId);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);

    }
}

