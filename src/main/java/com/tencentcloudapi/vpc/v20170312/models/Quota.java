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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Quota extends AbstractModel {

    /**
    * 配额名称，取值范围：
- `TOTAL_EIP_QUOTA`：用户当前地域下，EIP的配额数；
- `LOCALBGP_EIP_QUOTA`：用户当前地域下，本地BGP IP配额数；
- `SINGLEISP_EIP_QUOTA`：用户当前地域下，静态单线 IP 配额数；
- `DAILY_EIP_APPLY`：用户当前地域下，除静态单线 IP外今日申购次数；
- `DAILY_SINGLEISP_APPLY`：用户当前地域下，静态单线 IP今日申购次数；
- `DAILY_PUBLIC_IP_ASSIGN`：用户当前地域下，重新分配公网 IP次数；
- `MONTHLY_RECOVER_QUOTA`：用户当前地域下，每月申请指定 IP次数；
- `TOTAL_EIP6_QUOTA`：用户当前地域下，传统弹性公网IPv6的配额数；
- `BGP_EIPv6_QUOTA`：用户当前地域下，可申请的 BGP 弹性公网IPv6 的配额数；
- `SINGLEISP_EIPv6_QUOTA`：用户当前地域下，可申请的静态单线弹性公网IPv6 的配额数；
- `TOTAL_BANDWIDTHPKG_QUOTA`：用户当前地域下，可申请的带宽包总配额；
- `PRIMARY_TRAFFIC_SINGLE_BWP_QUOTA`：用户当前地域下，可申请的静态单线主流量带宽包配额数；
- `PRIMARY_TRAFFIC_BGP_BWP_QUOTA`：用户当前地域下，可申请的BGP主流量带宽包配额数；
- `BandwidthGuaranteedRatio`：用户当前地域下，保底带宽包默认保底比例；
- `TezBandwidthGuaranteedRatio`：用户当前地域下，边缘可用区保底带宽包默认保底比例；
    */
    @SerializedName("QuotaId")
    @Expose
    private String QuotaId;

    /**
    * 当前数量
    */
    @SerializedName("QuotaCurrent")
    @Expose
    private Long QuotaCurrent;

    /**
    * 配额数量
    */
    @SerializedName("QuotaLimit")
    @Expose
    private Long QuotaLimit;

    /**
    * 配额所属的网络组
    */
    @SerializedName("QuotaGroup")
    @Expose
    private String QuotaGroup;

    /**
     * Get 配额名称，取值范围：
- `TOTAL_EIP_QUOTA`：用户当前地域下，EIP的配额数；
- `LOCALBGP_EIP_QUOTA`：用户当前地域下，本地BGP IP配额数；
- `SINGLEISP_EIP_QUOTA`：用户当前地域下，静态单线 IP 配额数；
- `DAILY_EIP_APPLY`：用户当前地域下，除静态单线 IP外今日申购次数；
- `DAILY_SINGLEISP_APPLY`：用户当前地域下，静态单线 IP今日申购次数；
- `DAILY_PUBLIC_IP_ASSIGN`：用户当前地域下，重新分配公网 IP次数；
- `MONTHLY_RECOVER_QUOTA`：用户当前地域下，每月申请指定 IP次数；
- `TOTAL_EIP6_QUOTA`：用户当前地域下，传统弹性公网IPv6的配额数；
- `BGP_EIPv6_QUOTA`：用户当前地域下，可申请的 BGP 弹性公网IPv6 的配额数；
- `SINGLEISP_EIPv6_QUOTA`：用户当前地域下，可申请的静态单线弹性公网IPv6 的配额数；
- `TOTAL_BANDWIDTHPKG_QUOTA`：用户当前地域下，可申请的带宽包总配额；
- `PRIMARY_TRAFFIC_SINGLE_BWP_QUOTA`：用户当前地域下，可申请的静态单线主流量带宽包配额数；
- `PRIMARY_TRAFFIC_BGP_BWP_QUOTA`：用户当前地域下，可申请的BGP主流量带宽包配额数；
- `BandwidthGuaranteedRatio`：用户当前地域下，保底带宽包默认保底比例；
- `TezBandwidthGuaranteedRatio`：用户当前地域下，边缘可用区保底带宽包默认保底比例； 
     * @return QuotaId 配额名称，取值范围：
- `TOTAL_EIP_QUOTA`：用户当前地域下，EIP的配额数；
- `LOCALBGP_EIP_QUOTA`：用户当前地域下，本地BGP IP配额数；
- `SINGLEISP_EIP_QUOTA`：用户当前地域下，静态单线 IP 配额数；
- `DAILY_EIP_APPLY`：用户当前地域下，除静态单线 IP外今日申购次数；
- `DAILY_SINGLEISP_APPLY`：用户当前地域下，静态单线 IP今日申购次数；
- `DAILY_PUBLIC_IP_ASSIGN`：用户当前地域下，重新分配公网 IP次数；
- `MONTHLY_RECOVER_QUOTA`：用户当前地域下，每月申请指定 IP次数；
- `TOTAL_EIP6_QUOTA`：用户当前地域下，传统弹性公网IPv6的配额数；
- `BGP_EIPv6_QUOTA`：用户当前地域下，可申请的 BGP 弹性公网IPv6 的配额数；
- `SINGLEISP_EIPv6_QUOTA`：用户当前地域下，可申请的静态单线弹性公网IPv6 的配额数；
- `TOTAL_BANDWIDTHPKG_QUOTA`：用户当前地域下，可申请的带宽包总配额；
- `PRIMARY_TRAFFIC_SINGLE_BWP_QUOTA`：用户当前地域下，可申请的静态单线主流量带宽包配额数；
- `PRIMARY_TRAFFIC_BGP_BWP_QUOTA`：用户当前地域下，可申请的BGP主流量带宽包配额数；
- `BandwidthGuaranteedRatio`：用户当前地域下，保底带宽包默认保底比例；
- `TezBandwidthGuaranteedRatio`：用户当前地域下，边缘可用区保底带宽包默认保底比例；
     */
    public String getQuotaId() {
        return this.QuotaId;
    }

    /**
     * Set 配额名称，取值范围：
- `TOTAL_EIP_QUOTA`：用户当前地域下，EIP的配额数；
- `LOCALBGP_EIP_QUOTA`：用户当前地域下，本地BGP IP配额数；
- `SINGLEISP_EIP_QUOTA`：用户当前地域下，静态单线 IP 配额数；
- `DAILY_EIP_APPLY`：用户当前地域下，除静态单线 IP外今日申购次数；
- `DAILY_SINGLEISP_APPLY`：用户当前地域下，静态单线 IP今日申购次数；
- `DAILY_PUBLIC_IP_ASSIGN`：用户当前地域下，重新分配公网 IP次数；
- `MONTHLY_RECOVER_QUOTA`：用户当前地域下，每月申请指定 IP次数；
- `TOTAL_EIP6_QUOTA`：用户当前地域下，传统弹性公网IPv6的配额数；
- `BGP_EIPv6_QUOTA`：用户当前地域下，可申请的 BGP 弹性公网IPv6 的配额数；
- `SINGLEISP_EIPv6_QUOTA`：用户当前地域下，可申请的静态单线弹性公网IPv6 的配额数；
- `TOTAL_BANDWIDTHPKG_QUOTA`：用户当前地域下，可申请的带宽包总配额；
- `PRIMARY_TRAFFIC_SINGLE_BWP_QUOTA`：用户当前地域下，可申请的静态单线主流量带宽包配额数；
- `PRIMARY_TRAFFIC_BGP_BWP_QUOTA`：用户当前地域下，可申请的BGP主流量带宽包配额数；
- `BandwidthGuaranteedRatio`：用户当前地域下，保底带宽包默认保底比例；
- `TezBandwidthGuaranteedRatio`：用户当前地域下，边缘可用区保底带宽包默认保底比例；
     * @param QuotaId 配额名称，取值范围：
- `TOTAL_EIP_QUOTA`：用户当前地域下，EIP的配额数；
- `LOCALBGP_EIP_QUOTA`：用户当前地域下，本地BGP IP配额数；
- `SINGLEISP_EIP_QUOTA`：用户当前地域下，静态单线 IP 配额数；
- `DAILY_EIP_APPLY`：用户当前地域下，除静态单线 IP外今日申购次数；
- `DAILY_SINGLEISP_APPLY`：用户当前地域下，静态单线 IP今日申购次数；
- `DAILY_PUBLIC_IP_ASSIGN`：用户当前地域下，重新分配公网 IP次数；
- `MONTHLY_RECOVER_QUOTA`：用户当前地域下，每月申请指定 IP次数；
- `TOTAL_EIP6_QUOTA`：用户当前地域下，传统弹性公网IPv6的配额数；
- `BGP_EIPv6_QUOTA`：用户当前地域下，可申请的 BGP 弹性公网IPv6 的配额数；
- `SINGLEISP_EIPv6_QUOTA`：用户当前地域下，可申请的静态单线弹性公网IPv6 的配额数；
- `TOTAL_BANDWIDTHPKG_QUOTA`：用户当前地域下，可申请的带宽包总配额；
- `PRIMARY_TRAFFIC_SINGLE_BWP_QUOTA`：用户当前地域下，可申请的静态单线主流量带宽包配额数；
- `PRIMARY_TRAFFIC_BGP_BWP_QUOTA`：用户当前地域下，可申请的BGP主流量带宽包配额数；
- `BandwidthGuaranteedRatio`：用户当前地域下，保底带宽包默认保底比例；
- `TezBandwidthGuaranteedRatio`：用户当前地域下，边缘可用区保底带宽包默认保底比例；
     */
    public void setQuotaId(String QuotaId) {
        this.QuotaId = QuotaId;
    }

    /**
     * Get 当前数量 
     * @return QuotaCurrent 当前数量
     */
    public Long getQuotaCurrent() {
        return this.QuotaCurrent;
    }

    /**
     * Set 当前数量
     * @param QuotaCurrent 当前数量
     */
    public void setQuotaCurrent(Long QuotaCurrent) {
        this.QuotaCurrent = QuotaCurrent;
    }

    /**
     * Get 配额数量 
     * @return QuotaLimit 配额数量
     */
    public Long getQuotaLimit() {
        return this.QuotaLimit;
    }

    /**
     * Set 配额数量
     * @param QuotaLimit 配额数量
     */
    public void setQuotaLimit(Long QuotaLimit) {
        this.QuotaLimit = QuotaLimit;
    }

    /**
     * Get 配额所属的网络组 
     * @return QuotaGroup 配额所属的网络组
     */
    public String getQuotaGroup() {
        return this.QuotaGroup;
    }

    /**
     * Set 配额所属的网络组
     * @param QuotaGroup 配额所属的网络组
     */
    public void setQuotaGroup(String QuotaGroup) {
        this.QuotaGroup = QuotaGroup;
    }

    public Quota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Quota(Quota source) {
        if (source.QuotaId != null) {
            this.QuotaId = new String(source.QuotaId);
        }
        if (source.QuotaCurrent != null) {
            this.QuotaCurrent = new Long(source.QuotaCurrent);
        }
        if (source.QuotaLimit != null) {
            this.QuotaLimit = new Long(source.QuotaLimit);
        }
        if (source.QuotaGroup != null) {
            this.QuotaGroup = new String(source.QuotaGroup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QuotaId", this.QuotaId);
        this.setParamSimple(map, prefix + "QuotaCurrent", this.QuotaCurrent);
        this.setParamSimple(map, prefix + "QuotaLimit", this.QuotaLimit);
        this.setParamSimple(map, prefix + "QuotaGroup", this.QuotaGroup);

    }
}

