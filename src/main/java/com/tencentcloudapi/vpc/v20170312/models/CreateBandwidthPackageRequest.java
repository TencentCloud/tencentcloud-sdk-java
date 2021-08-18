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
    * 带宽包类型, 默认值: BGP, 可选值:
<li>BGP: 普通BGP共享带宽包</li>
<li>HIGH_QUALITY_BGP: 精品BGP共享带宽包</li>
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * 带宽包计费类型, 默认为: TOP5_POSTPAID_BY_MONTH, 可选值:
<li>TOP5_POSTPAID_BY_MONTH: 按月后付费TOP5计费</li>
<li>PERCENT95_POSTPAID_BY_MONTH: 按月后付费月95计费</li>
<li>FIXED_PREPAID_BY_MONTH: 包月预付费计费</li>
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 带宽包名称。
    */
    @SerializedName("BandwidthPackageName")
    @Expose
    private String BandwidthPackageName;

    /**
    * 带宽包数量(传统账户类型只能填1), 标准账户类型取值范围为1~20。
    */
    @SerializedName("BandwidthPackageCount")
    @Expose
    private Long BandwidthPackageCount;

    /**
    * 带宽包限速大小。单位：Mbps，-1表示不限速。该功能当前内测中，暂不对外开放。
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
     * Get 带宽包类型, 默认值: BGP, 可选值:
<li>BGP: 普通BGP共享带宽包</li>
<li>HIGH_QUALITY_BGP: 精品BGP共享带宽包</li> 
     * @return NetworkType 带宽包类型, 默认值: BGP, 可选值:
<li>BGP: 普通BGP共享带宽包</li>
<li>HIGH_QUALITY_BGP: 精品BGP共享带宽包</li>
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set 带宽包类型, 默认值: BGP, 可选值:
<li>BGP: 普通BGP共享带宽包</li>
<li>HIGH_QUALITY_BGP: 精品BGP共享带宽包</li>
     * @param NetworkType 带宽包类型, 默认值: BGP, 可选值:
<li>BGP: 普通BGP共享带宽包</li>
<li>HIGH_QUALITY_BGP: 精品BGP共享带宽包</li>
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get 带宽包计费类型, 默认为: TOP5_POSTPAID_BY_MONTH, 可选值:
<li>TOP5_POSTPAID_BY_MONTH: 按月后付费TOP5计费</li>
<li>PERCENT95_POSTPAID_BY_MONTH: 按月后付费月95计费</li>
<li>FIXED_PREPAID_BY_MONTH: 包月预付费计费</li> 
     * @return ChargeType 带宽包计费类型, 默认为: TOP5_POSTPAID_BY_MONTH, 可选值:
<li>TOP5_POSTPAID_BY_MONTH: 按月后付费TOP5计费</li>
<li>PERCENT95_POSTPAID_BY_MONTH: 按月后付费月95计费</li>
<li>FIXED_PREPAID_BY_MONTH: 包月预付费计费</li>
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 带宽包计费类型, 默认为: TOP5_POSTPAID_BY_MONTH, 可选值:
<li>TOP5_POSTPAID_BY_MONTH: 按月后付费TOP5计费</li>
<li>PERCENT95_POSTPAID_BY_MONTH: 按月后付费月95计费</li>
<li>FIXED_PREPAID_BY_MONTH: 包月预付费计费</li>
     * @param ChargeType 带宽包计费类型, 默认为: TOP5_POSTPAID_BY_MONTH, 可选值:
<li>TOP5_POSTPAID_BY_MONTH: 按月后付费TOP5计费</li>
<li>PERCENT95_POSTPAID_BY_MONTH: 按月后付费月95计费</li>
<li>FIXED_PREPAID_BY_MONTH: 包月预付费计费</li>
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 带宽包名称。 
     * @return BandwidthPackageName 带宽包名称。
     */
    public String getBandwidthPackageName() {
        return this.BandwidthPackageName;
    }

    /**
     * Set 带宽包名称。
     * @param BandwidthPackageName 带宽包名称。
     */
    public void setBandwidthPackageName(String BandwidthPackageName) {
        this.BandwidthPackageName = BandwidthPackageName;
    }

    /**
     * Get 带宽包数量(传统账户类型只能填1), 标准账户类型取值范围为1~20。 
     * @return BandwidthPackageCount 带宽包数量(传统账户类型只能填1), 标准账户类型取值范围为1~20。
     */
    public Long getBandwidthPackageCount() {
        return this.BandwidthPackageCount;
    }

    /**
     * Set 带宽包数量(传统账户类型只能填1), 标准账户类型取值范围为1~20。
     * @param BandwidthPackageCount 带宽包数量(传统账户类型只能填1), 标准账户类型取值范围为1~20。
     */
    public void setBandwidthPackageCount(Long BandwidthPackageCount) {
        this.BandwidthPackageCount = BandwidthPackageCount;
    }

    /**
     * Get 带宽包限速大小。单位：Mbps，-1表示不限速。该功能当前内测中，暂不对外开放。 
     * @return InternetMaxBandwidth 带宽包限速大小。单位：Mbps，-1表示不限速。该功能当前内测中，暂不对外开放。
     */
    public Long getInternetMaxBandwidth() {
        return this.InternetMaxBandwidth;
    }

    /**
     * Set 带宽包限速大小。单位：Mbps，-1表示不限速。该功能当前内测中，暂不对外开放。
     * @param InternetMaxBandwidth 带宽包限速大小。单位：Mbps，-1表示不限速。该功能当前内测中，暂不对外开放。
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

    public CreateBandwidthPackageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBandwidthPackageRequest(CreateBandwidthPackageRequest source) {
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.BandwidthPackageName != null) {
            this.BandwidthPackageName = new String(source.BandwidthPackageName);
        }
        if (source.BandwidthPackageCount != null) {
            this.BandwidthPackageCount = new Long(source.BandwidthPackageCount);
        }
        if (source.InternetMaxBandwidth != null) {
            this.InternetMaxBandwidth = new Long(source.InternetMaxBandwidth);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
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

