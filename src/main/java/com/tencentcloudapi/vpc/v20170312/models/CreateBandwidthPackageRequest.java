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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBandwidthPackageRequest extends AbstractModel{

    /**
    * 带宽包类型，包括'BGP'，'SINGLEISP'，'ANYCAST'
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * 带宽包计费类型，包括‘TOP5_POSTPAID_BY_MONTH’，‘PERCENT95_POSTPAID_BY_MONTH’
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 带宽包名字
    */
    @SerializedName("BandwidthPackageName")
    @Expose
    private String BandwidthPackageName;

    /**
    * 带宽包数量(传统账户类型只能填1)
    */
    @SerializedName("BandwidthPackageCount")
    @Expose
    private Long BandwidthPackageCount;

    /**
    * 带宽包限速大小。单位：Mbps，-1表示不限速。
    */
    @SerializedName("InternetMaxBandwidth")
    @Expose
    private Long InternetMaxBandwidth;

    /**
    * 需要关联的标签列表。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 带宽包协议类型。当前支持'ipv4'和'ipv6'协议带宽包，默认值是'ipv4'。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
     * Get 带宽包类型，包括'BGP'，'SINGLEISP'，'ANYCAST' 
     * @return NetworkType 带宽包类型，包括'BGP'，'SINGLEISP'，'ANYCAST'
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set 带宽包类型，包括'BGP'，'SINGLEISP'，'ANYCAST'
     * @param NetworkType 带宽包类型，包括'BGP'，'SINGLEISP'，'ANYCAST'
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get 带宽包计费类型，包括‘TOP5_POSTPAID_BY_MONTH’，‘PERCENT95_POSTPAID_BY_MONTH’ 
     * @return ChargeType 带宽包计费类型，包括‘TOP5_POSTPAID_BY_MONTH’，‘PERCENT95_POSTPAID_BY_MONTH’
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 带宽包计费类型，包括‘TOP5_POSTPAID_BY_MONTH’，‘PERCENT95_POSTPAID_BY_MONTH’
     * @param ChargeType 带宽包计费类型，包括‘TOP5_POSTPAID_BY_MONTH’，‘PERCENT95_POSTPAID_BY_MONTH’
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 带宽包名字 
     * @return BandwidthPackageName 带宽包名字
     */
    public String getBandwidthPackageName() {
        return this.BandwidthPackageName;
    }

    /**
     * Set 带宽包名字
     * @param BandwidthPackageName 带宽包名字
     */
    public void setBandwidthPackageName(String BandwidthPackageName) {
        this.BandwidthPackageName = BandwidthPackageName;
    }

    /**
     * Get 带宽包数量(传统账户类型只能填1) 
     * @return BandwidthPackageCount 带宽包数量(传统账户类型只能填1)
     */
    public Long getBandwidthPackageCount() {
        return this.BandwidthPackageCount;
    }

    /**
     * Set 带宽包数量(传统账户类型只能填1)
     * @param BandwidthPackageCount 带宽包数量(传统账户类型只能填1)
     */
    public void setBandwidthPackageCount(Long BandwidthPackageCount) {
        this.BandwidthPackageCount = BandwidthPackageCount;
    }

    /**
     * Get 带宽包限速大小。单位：Mbps，-1表示不限速。 
     * @return InternetMaxBandwidth 带宽包限速大小。单位：Mbps，-1表示不限速。
     */
    public Long getInternetMaxBandwidth() {
        return this.InternetMaxBandwidth;
    }

    /**
     * Set 带宽包限速大小。单位：Mbps，-1表示不限速。
     * @param InternetMaxBandwidth 带宽包限速大小。单位：Mbps，-1表示不限速。
     */
    public void setInternetMaxBandwidth(Long InternetMaxBandwidth) {
        this.InternetMaxBandwidth = InternetMaxBandwidth;
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
     * Get 带宽包协议类型。当前支持'ipv4'和'ipv6'协议带宽包，默认值是'ipv4'。 
     * @return Protocol 带宽包协议类型。当前支持'ipv4'和'ipv6'协议带宽包，默认值是'ipv4'。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 带宽包协议类型。当前支持'ipv4'和'ipv6'协议带宽包，默认值是'ipv4'。
     * @param Protocol 带宽包协议类型。当前支持'ipv4'和'ipv6'协议带宽包，默认值是'ipv4'。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "BandwidthPackageName", this.BandwidthPackageName);
        this.setParamSimple(map, prefix + "BandwidthPackageCount", this.BandwidthPackageCount);
        this.setParamSimple(map, prefix + "InternetMaxBandwidth", this.InternetMaxBandwidth);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);

    }
}

