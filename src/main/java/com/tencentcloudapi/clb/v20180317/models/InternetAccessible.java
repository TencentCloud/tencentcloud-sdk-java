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

public class InternetAccessible extends AbstractModel {

    /**
    * TRAFFIC_POSTPAID_BY_HOUR 按流量按小时后计费 ; BANDWIDTH_POSTPAID_BY_HOUR 按带宽按小时后计费，国际站用户不支持该计费模式; BANDWIDTH_PACKAGE 按带宽包计费;BANDWIDTH_PREPAID按带宽预付费。
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * 最大出带宽，单位Mbps，仅对公网属性的共享型、性能容量型和独占型 CLB 实例、以及内网属性的性能容量型 CLB 实例生效。
- 对于公网属性的共享型和独占型 CLB 实例，最大出带宽的范围为1Mbps-2048Mbps。
- 对于公网属性和内网属性的性能容量型 CLB实例，最大出带宽的范围为1Mbps-61440Mbps。
（调用CreateLoadBalancer创建LB时不指定此参数则设置为默认值10Mbps。此上限可调整）
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * 带宽包的类型，如 BGP（多线）。
类型如下：
SINGLEISP: 单线
BGP: 多线
HIGH_QUALITY_BGP: 精品BGP共享带宽包
SINGLEISP_CMCC: 中国移动共享带宽包
SINGLEISP_CTCC: 中国电信共享带宽包
SINGLEISP_CUCC: 中国联通共享带宽包
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BandwidthpkgSubType")
    @Expose
    private String BandwidthpkgSubType;

    /**
     * Get TRAFFIC_POSTPAID_BY_HOUR 按流量按小时后计费 ; BANDWIDTH_POSTPAID_BY_HOUR 按带宽按小时后计费，国际站用户不支持该计费模式; BANDWIDTH_PACKAGE 按带宽包计费;BANDWIDTH_PREPAID按带宽预付费。 
     * @return InternetChargeType TRAFFIC_POSTPAID_BY_HOUR 按流量按小时后计费 ; BANDWIDTH_POSTPAID_BY_HOUR 按带宽按小时后计费，国际站用户不支持该计费模式; BANDWIDTH_PACKAGE 按带宽包计费;BANDWIDTH_PREPAID按带宽预付费。
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set TRAFFIC_POSTPAID_BY_HOUR 按流量按小时后计费 ; BANDWIDTH_POSTPAID_BY_HOUR 按带宽按小时后计费，国际站用户不支持该计费模式; BANDWIDTH_PACKAGE 按带宽包计费;BANDWIDTH_PREPAID按带宽预付费。
     * @param InternetChargeType TRAFFIC_POSTPAID_BY_HOUR 按流量按小时后计费 ; BANDWIDTH_POSTPAID_BY_HOUR 按带宽按小时后计费，国际站用户不支持该计费模式; BANDWIDTH_PACKAGE 按带宽包计费;BANDWIDTH_PREPAID按带宽预付费。
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Get 最大出带宽，单位Mbps，仅对公网属性的共享型、性能容量型和独占型 CLB 实例、以及内网属性的性能容量型 CLB 实例生效。
- 对于公网属性的共享型和独占型 CLB 实例，最大出带宽的范围为1Mbps-2048Mbps。
- 对于公网属性和内网属性的性能容量型 CLB实例，最大出带宽的范围为1Mbps-61440Mbps。
（调用CreateLoadBalancer创建LB时不指定此参数则设置为默认值10Mbps。此上限可调整） 
     * @return InternetMaxBandwidthOut 最大出带宽，单位Mbps，仅对公网属性的共享型、性能容量型和独占型 CLB 实例、以及内网属性的性能容量型 CLB 实例生效。
- 对于公网属性的共享型和独占型 CLB 实例，最大出带宽的范围为1Mbps-2048Mbps。
- 对于公网属性和内网属性的性能容量型 CLB实例，最大出带宽的范围为1Mbps-61440Mbps。
（调用CreateLoadBalancer创建LB时不指定此参数则设置为默认值10Mbps。此上限可调整）
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 最大出带宽，单位Mbps，仅对公网属性的共享型、性能容量型和独占型 CLB 实例、以及内网属性的性能容量型 CLB 实例生效。
- 对于公网属性的共享型和独占型 CLB 实例，最大出带宽的范围为1Mbps-2048Mbps。
- 对于公网属性和内网属性的性能容量型 CLB实例，最大出带宽的范围为1Mbps-61440Mbps。
（调用CreateLoadBalancer创建LB时不指定此参数则设置为默认值10Mbps。此上限可调整）
     * @param InternetMaxBandwidthOut 最大出带宽，单位Mbps，仅对公网属性的共享型、性能容量型和独占型 CLB 实例、以及内网属性的性能容量型 CLB 实例生效。
- 对于公网属性的共享型和独占型 CLB 实例，最大出带宽的范围为1Mbps-2048Mbps。
- 对于公网属性和内网属性的性能容量型 CLB实例，最大出带宽的范围为1Mbps-61440Mbps。
（调用CreateLoadBalancer创建LB时不指定此参数则设置为默认值10Mbps。此上限可调整）
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get 带宽包的类型，如 BGP（多线）。
类型如下：
SINGLEISP: 单线
BGP: 多线
HIGH_QUALITY_BGP: 精品BGP共享带宽包
SINGLEISP_CMCC: 中国移动共享带宽包
SINGLEISP_CTCC: 中国电信共享带宽包
SINGLEISP_CUCC: 中国联通共享带宽包
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BandwidthpkgSubType 带宽包的类型，如 BGP（多线）。
类型如下：
SINGLEISP: 单线
BGP: 多线
HIGH_QUALITY_BGP: 精品BGP共享带宽包
SINGLEISP_CMCC: 中国移动共享带宽包
SINGLEISP_CTCC: 中国电信共享带宽包
SINGLEISP_CUCC: 中国联通共享带宽包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBandwidthpkgSubType() {
        return this.BandwidthpkgSubType;
    }

    /**
     * Set 带宽包的类型，如 BGP（多线）。
类型如下：
SINGLEISP: 单线
BGP: 多线
HIGH_QUALITY_BGP: 精品BGP共享带宽包
SINGLEISP_CMCC: 中国移动共享带宽包
SINGLEISP_CTCC: 中国电信共享带宽包
SINGLEISP_CUCC: 中国联通共享带宽包
注意：此字段可能返回 null，表示取不到有效值。
     * @param BandwidthpkgSubType 带宽包的类型，如 BGP（多线）。
类型如下：
SINGLEISP: 单线
BGP: 多线
HIGH_QUALITY_BGP: 精品BGP共享带宽包
SINGLEISP_CMCC: 中国移动共享带宽包
SINGLEISP_CTCC: 中国电信共享带宽包
SINGLEISP_CUCC: 中国联通共享带宽包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBandwidthpkgSubType(String BandwidthpkgSubType) {
        this.BandwidthpkgSubType = BandwidthpkgSubType;
    }

    public InternetAccessible() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InternetAccessible(InternetAccessible source) {
        if (source.InternetChargeType != null) {
            this.InternetChargeType = new String(source.InternetChargeType);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.BandwidthpkgSubType != null) {
            this.BandwidthpkgSubType = new String(source.BandwidthpkgSubType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InternetChargeType", this.InternetChargeType);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "BandwidthpkgSubType", this.BandwidthpkgSubType);

    }
}

