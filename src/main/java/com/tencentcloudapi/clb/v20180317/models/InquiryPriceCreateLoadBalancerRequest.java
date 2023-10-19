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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceCreateLoadBalancerRequest extends AbstractModel {

    /**
    * 询价的负载均衡类型，OPEN为公网类型，INTERNAL为内网类型
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * 询价的收费类型，POSTPAID为按量计费，"PREPAID"为预付费包年包月
    */
    @SerializedName("LoadBalancerChargeType")
    @Expose
    private String LoadBalancerChargeType;

    /**
    * 询价的收费周期
    */
    @SerializedName("LoadBalancerChargePrepaid")
    @Expose
    private LBChargePrepaid LoadBalancerChargePrepaid;

    /**
    * 询价的网络计费方式
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * 询价的负载均衡实例个数，默认为1
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * 指定可用区询价。如：ap-guangzhou-1
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 包年包月询价时传性能容量型规格，如：clb.c3.small。按量付费询价时传SLA
    */
    @SerializedName("SlaType")
    @Expose
    private String SlaType;

    /**
    * IP版本，可取值：IPV4、IPV6、IPv6FullChain，不区分大小写，默认值 IPV4。说明：取值为IPV6表示为IPV6 NAT64版本；取值为IPv6FullChain，表示为IPv6版本。
    */
    @SerializedName("AddressIPVersion")
    @Expose
    private String AddressIPVersion;

    /**
    * 仅适用于公网负载均衡。CMCC | CTCC | CUCC，分别对应 移动 | 电信 | 联通，如果不指定本参数，则默认使用BGP。
    */
    @SerializedName("VipIsp")
    @Expose
    private String VipIsp;

    /**
     * Get 询价的负载均衡类型，OPEN为公网类型，INTERNAL为内网类型 
     * @return LoadBalancerType 询价的负载均衡类型，OPEN为公网类型，INTERNAL为内网类型
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set 询价的负载均衡类型，OPEN为公网类型，INTERNAL为内网类型
     * @param LoadBalancerType 询价的负载均衡类型，OPEN为公网类型，INTERNAL为内网类型
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get 询价的收费类型，POSTPAID为按量计费，"PREPAID"为预付费包年包月 
     * @return LoadBalancerChargeType 询价的收费类型，POSTPAID为按量计费，"PREPAID"为预付费包年包月
     */
    public String getLoadBalancerChargeType() {
        return this.LoadBalancerChargeType;
    }

    /**
     * Set 询价的收费类型，POSTPAID为按量计费，"PREPAID"为预付费包年包月
     * @param LoadBalancerChargeType 询价的收费类型，POSTPAID为按量计费，"PREPAID"为预付费包年包月
     */
    public void setLoadBalancerChargeType(String LoadBalancerChargeType) {
        this.LoadBalancerChargeType = LoadBalancerChargeType;
    }

    /**
     * Get 询价的收费周期 
     * @return LoadBalancerChargePrepaid 询价的收费周期
     */
    public LBChargePrepaid getLoadBalancerChargePrepaid() {
        return this.LoadBalancerChargePrepaid;
    }

    /**
     * Set 询价的收费周期
     * @param LoadBalancerChargePrepaid 询价的收费周期
     */
    public void setLoadBalancerChargePrepaid(LBChargePrepaid LoadBalancerChargePrepaid) {
        this.LoadBalancerChargePrepaid = LoadBalancerChargePrepaid;
    }

    /**
     * Get 询价的网络计费方式 
     * @return InternetAccessible 询价的网络计费方式
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set 询价的网络计费方式
     * @param InternetAccessible 询价的网络计费方式
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get 询价的负载均衡实例个数，默认为1 
     * @return GoodsNum 询价的负载均衡实例个数，默认为1
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 询价的负载均衡实例个数，默认为1
     * @param GoodsNum 询价的负载均衡实例个数，默认为1
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get 指定可用区询价。如：ap-guangzhou-1 
     * @return ZoneId 指定可用区询价。如：ap-guangzhou-1
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 指定可用区询价。如：ap-guangzhou-1
     * @param ZoneId 指定可用区询价。如：ap-guangzhou-1
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 包年包月询价时传性能容量型规格，如：clb.c3.small。按量付费询价时传SLA 
     * @return SlaType 包年包月询价时传性能容量型规格，如：clb.c3.small。按量付费询价时传SLA
     */
    public String getSlaType() {
        return this.SlaType;
    }

    /**
     * Set 包年包月询价时传性能容量型规格，如：clb.c3.small。按量付费询价时传SLA
     * @param SlaType 包年包月询价时传性能容量型规格，如：clb.c3.small。按量付费询价时传SLA
     */
    public void setSlaType(String SlaType) {
        this.SlaType = SlaType;
    }

    /**
     * Get IP版本，可取值：IPV4、IPV6、IPv6FullChain，不区分大小写，默认值 IPV4。说明：取值为IPV6表示为IPV6 NAT64版本；取值为IPv6FullChain，表示为IPv6版本。 
     * @return AddressIPVersion IP版本，可取值：IPV4、IPV6、IPv6FullChain，不区分大小写，默认值 IPV4。说明：取值为IPV6表示为IPV6 NAT64版本；取值为IPv6FullChain，表示为IPv6版本。
     */
    public String getAddressIPVersion() {
        return this.AddressIPVersion;
    }

    /**
     * Set IP版本，可取值：IPV4、IPV6、IPv6FullChain，不区分大小写，默认值 IPV4。说明：取值为IPV6表示为IPV6 NAT64版本；取值为IPv6FullChain，表示为IPv6版本。
     * @param AddressIPVersion IP版本，可取值：IPV4、IPV6、IPv6FullChain，不区分大小写，默认值 IPV4。说明：取值为IPV6表示为IPV6 NAT64版本；取值为IPv6FullChain，表示为IPv6版本。
     */
    public void setAddressIPVersion(String AddressIPVersion) {
        this.AddressIPVersion = AddressIPVersion;
    }

    /**
     * Get 仅适用于公网负载均衡。CMCC | CTCC | CUCC，分别对应 移动 | 电信 | 联通，如果不指定本参数，则默认使用BGP。 
     * @return VipIsp 仅适用于公网负载均衡。CMCC | CTCC | CUCC，分别对应 移动 | 电信 | 联通，如果不指定本参数，则默认使用BGP。
     */
    public String getVipIsp() {
        return this.VipIsp;
    }

    /**
     * Set 仅适用于公网负载均衡。CMCC | CTCC | CUCC，分别对应 移动 | 电信 | 联通，如果不指定本参数，则默认使用BGP。
     * @param VipIsp 仅适用于公网负载均衡。CMCC | CTCC | CUCC，分别对应 移动 | 电信 | 联通，如果不指定本参数，则默认使用BGP。
     */
    public void setVipIsp(String VipIsp) {
        this.VipIsp = VipIsp;
    }

    public InquiryPriceCreateLoadBalancerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceCreateLoadBalancerRequest(InquiryPriceCreateLoadBalancerRequest source) {
        if (source.LoadBalancerType != null) {
            this.LoadBalancerType = new String(source.LoadBalancerType);
        }
        if (source.LoadBalancerChargeType != null) {
            this.LoadBalancerChargeType = new String(source.LoadBalancerChargeType);
        }
        if (source.LoadBalancerChargePrepaid != null) {
            this.LoadBalancerChargePrepaid = new LBChargePrepaid(source.LoadBalancerChargePrepaid);
        }
        if (source.InternetAccessible != null) {
            this.InternetAccessible = new InternetAccessible(source.InternetAccessible);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.SlaType != null) {
            this.SlaType = new String(source.SlaType);
        }
        if (source.AddressIPVersion != null) {
            this.AddressIPVersion = new String(source.AddressIPVersion);
        }
        if (source.VipIsp != null) {
            this.VipIsp = new String(source.VipIsp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamSimple(map, prefix + "LoadBalancerChargeType", this.LoadBalancerChargeType);
        this.setParamObj(map, prefix + "LoadBalancerChargePrepaid.", this.LoadBalancerChargePrepaid);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "SlaType", this.SlaType);
        this.setParamSimple(map, prefix + "AddressIPVersion", this.AddressIPVersion);
        this.setParamSimple(map, prefix + "VipIsp", this.VipIsp);

    }
}

