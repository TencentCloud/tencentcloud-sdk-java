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

public class AllocateIp6AddressesBandwidthRequest extends AbstractModel{

    /**
    * 需要开通公网访问能力的IPV6地址
    */
    @SerializedName("Ip6Addresses")
    @Expose
    private String [] Ip6Addresses;

    /**
    * 带宽，单位Mbps。默认是1Mbps
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * 网络计费模式。IPV6当前对标准账户类型支持"TRAFFIC_POSTPAID_BY_HOUR"，对传统账户类型支持"BANDWIDTH_PACKAGE"。默认网络计费模式是"TRAFFIC_POSTPAID_BY_HOUR"。
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * 带宽包id，上移账号，申请带宽包计费模式的ipv6地址需要传入.
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
     * Get 需要开通公网访问能力的IPV6地址 
     * @return Ip6Addresses 需要开通公网访问能力的IPV6地址
     */
    public String [] getIp6Addresses() {
        return this.Ip6Addresses;
    }

    /**
     * Set 需要开通公网访问能力的IPV6地址
     * @param Ip6Addresses 需要开通公网访问能力的IPV6地址
     */
    public void setIp6Addresses(String [] Ip6Addresses) {
        this.Ip6Addresses = Ip6Addresses;
    }

    /**
     * Get 带宽，单位Mbps。默认是1Mbps 
     * @return InternetMaxBandwidthOut 带宽，单位Mbps。默认是1Mbps
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 带宽，单位Mbps。默认是1Mbps
     * @param InternetMaxBandwidthOut 带宽，单位Mbps。默认是1Mbps
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get 网络计费模式。IPV6当前对标准账户类型支持"TRAFFIC_POSTPAID_BY_HOUR"，对传统账户类型支持"BANDWIDTH_PACKAGE"。默认网络计费模式是"TRAFFIC_POSTPAID_BY_HOUR"。 
     * @return InternetChargeType 网络计费模式。IPV6当前对标准账户类型支持"TRAFFIC_POSTPAID_BY_HOUR"，对传统账户类型支持"BANDWIDTH_PACKAGE"。默认网络计费模式是"TRAFFIC_POSTPAID_BY_HOUR"。
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set 网络计费模式。IPV6当前对标准账户类型支持"TRAFFIC_POSTPAID_BY_HOUR"，对传统账户类型支持"BANDWIDTH_PACKAGE"。默认网络计费模式是"TRAFFIC_POSTPAID_BY_HOUR"。
     * @param InternetChargeType 网络计费模式。IPV6当前对标准账户类型支持"TRAFFIC_POSTPAID_BY_HOUR"，对传统账户类型支持"BANDWIDTH_PACKAGE"。默认网络计费模式是"TRAFFIC_POSTPAID_BY_HOUR"。
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Get 带宽包id，上移账号，申请带宽包计费模式的ipv6地址需要传入. 
     * @return BandwidthPackageId 带宽包id，上移账号，申请带宽包计费模式的ipv6地址需要传入.
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set 带宽包id，上移账号，申请带宽包计费模式的ipv6地址需要传入.
     * @param BandwidthPackageId 带宽包id，上移账号，申请带宽包计费模式的ipv6地址需要传入.
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    public AllocateIp6AddressesBandwidthRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocateIp6AddressesBandwidthRequest(AllocateIp6AddressesBandwidthRequest source) {
        if (source.Ip6Addresses != null) {
            this.Ip6Addresses = new String[source.Ip6Addresses.length];
            for (int i = 0; i < source.Ip6Addresses.length; i++) {
                this.Ip6Addresses[i] = new String(source.Ip6Addresses[i]);
            }
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.InternetChargeType != null) {
            this.InternetChargeType = new String(source.InternetChargeType);
        }
        if (source.BandwidthPackageId != null) {
            this.BandwidthPackageId = new String(source.BandwidthPackageId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Ip6Addresses.", this.Ip6Addresses);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "InternetChargeType", this.InternetChargeType);
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);

    }
}

