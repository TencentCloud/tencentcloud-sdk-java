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

public class InquiryPriceAllocateAddressesRequest extends AbstractModel {

    /**
    * EIP计费方式。
<ul style="margin:0"><li>账号为标准账户类型的用户，可选值：<ul>
<li>BANDWIDTH_POSTPAID_BY_HOUR：带宽按小时后付费</li>
<li>BANDWIDTH_PREPAID_BY_MONTH：包月按带宽预付费</li>
<li>TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费</li>
</ul></li>
</ul>
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * EIP出带宽上限，单位：Mbps。
<ul style="margin:0"><li>账号为标准账户类型的用户，可选值范围取决于EIP计费方式：<ul>
<li>BANDWIDTH_POSTPAID_BY_HOUR：1 Mbps 至 100 Mbps</li>
<li>BANDWIDTH_PREPAID_BY_MONTH：1 Mbps 至 200 Mbps</li>
<li>TRAFFIC_POSTPAID_BY_HOUR：1 Mbps 至 100 Mbps</li></ul>默认值：1 Mbps。</li>
<li>账号为传统账户类型的用户，EIP出带宽上限取决于与其绑定的实例的公网出带宽上限，无需传递此参数。</li></ul>

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
    * EIP类型。默认值：EIP。
<ul style="margin:0"><li>弹性公网IP，可选值：<ul><li>EIP：弹性公网IP</li></ul></li></ul>
<ul style="margin:0"><li>精品IP，可选值：<ul><li>HighQualityEIP：精品IP</li></ul>注意：仅新加坡和中国香港支持精品IP。</li></ul>
<ul style="margin:0"><li>高防IP，可选值：<ul><li>AntiDDoSEIP：高防IP</li></ul>注意：仅部分地域支持高防IP，详情可见弹性公网IP[产品概述](https://cloud.tencent.com/document/product/1199/41646)。</li></ul>
    */
    @SerializedName("AddressType")
    @Expose
    private String AddressType;

    /**
    * 原生EIP IP资源的计费方式。
<ul style="margin:0"><li>账号为标准账户类型的用户，可选值：<ul>
<li>IP_POSTPAID_BY_HOUR：IP资源按小时后付费</li>
<li>IP_PREPAID_BY_MONTH：IP资源包月预付费</li>
</ul></li>
</ul>
    */
    @SerializedName("IPChargeType")
    @Expose
    private String IPChargeType;

    /**
     * Get EIP计费方式。
<ul style="margin:0"><li>账号为标准账户类型的用户，可选值：<ul>
<li>BANDWIDTH_POSTPAID_BY_HOUR：带宽按小时后付费</li>
<li>BANDWIDTH_PREPAID_BY_MONTH：包月按带宽预付费</li>
<li>TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费</li>
</ul></li>
</ul> 
     * @return InternetChargeType EIP计费方式。
<ul style="margin:0"><li>账号为标准账户类型的用户，可选值：<ul>
<li>BANDWIDTH_POSTPAID_BY_HOUR：带宽按小时后付费</li>
<li>BANDWIDTH_PREPAID_BY_MONTH：包月按带宽预付费</li>
<li>TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费</li>
</ul></li>
</ul>
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set EIP计费方式。
<ul style="margin:0"><li>账号为标准账户类型的用户，可选值：<ul>
<li>BANDWIDTH_POSTPAID_BY_HOUR：带宽按小时后付费</li>
<li>BANDWIDTH_PREPAID_BY_MONTH：包月按带宽预付费</li>
<li>TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费</li>
</ul></li>
</ul>
     * @param InternetChargeType EIP计费方式。
<ul style="margin:0"><li>账号为标准账户类型的用户，可选值：<ul>
<li>BANDWIDTH_POSTPAID_BY_HOUR：带宽按小时后付费</li>
<li>BANDWIDTH_PREPAID_BY_MONTH：包月按带宽预付费</li>
<li>TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费</li>
</ul></li>
</ul>
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Get EIP出带宽上限，单位：Mbps。
<ul style="margin:0"><li>账号为标准账户类型的用户，可选值范围取决于EIP计费方式：<ul>
<li>BANDWIDTH_POSTPAID_BY_HOUR：1 Mbps 至 100 Mbps</li>
<li>BANDWIDTH_PREPAID_BY_MONTH：1 Mbps 至 200 Mbps</li>
<li>TRAFFIC_POSTPAID_BY_HOUR：1 Mbps 至 100 Mbps</li></ul>默认值：1 Mbps。</li>
<li>账号为传统账户类型的用户，EIP出带宽上限取决于与其绑定的实例的公网出带宽上限，无需传递此参数。</li></ul>
 
     * @return InternetMaxBandwidthOut EIP出带宽上限，单位：Mbps。
<ul style="margin:0"><li>账号为标准账户类型的用户，可选值范围取决于EIP计费方式：<ul>
<li>BANDWIDTH_POSTPAID_BY_HOUR：1 Mbps 至 100 Mbps</li>
<li>BANDWIDTH_PREPAID_BY_MONTH：1 Mbps 至 200 Mbps</li>
<li>TRAFFIC_POSTPAID_BY_HOUR：1 Mbps 至 100 Mbps</li></ul>默认值：1 Mbps。</li>
<li>账号为传统账户类型的用户，EIP出带宽上限取决于与其绑定的实例的公网出带宽上限，无需传递此参数。</li></ul>

     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set EIP出带宽上限，单位：Mbps。
<ul style="margin:0"><li>账号为标准账户类型的用户，可选值范围取决于EIP计费方式：<ul>
<li>BANDWIDTH_POSTPAID_BY_HOUR：1 Mbps 至 100 Mbps</li>
<li>BANDWIDTH_PREPAID_BY_MONTH：1 Mbps 至 200 Mbps</li>
<li>TRAFFIC_POSTPAID_BY_HOUR：1 Mbps 至 100 Mbps</li></ul>默认值：1 Mbps。</li>
<li>账号为传统账户类型的用户，EIP出带宽上限取决于与其绑定的实例的公网出带宽上限，无需传递此参数。</li></ul>

     * @param InternetMaxBandwidthOut EIP出带宽上限，单位：Mbps。
<ul style="margin:0"><li>账号为标准账户类型的用户，可选值范围取决于EIP计费方式：<ul>
<li>BANDWIDTH_POSTPAID_BY_HOUR：1 Mbps 至 100 Mbps</li>
<li>BANDWIDTH_PREPAID_BY_MONTH：1 Mbps 至 200 Mbps</li>
<li>TRAFFIC_POSTPAID_BY_HOUR：1 Mbps 至 100 Mbps</li></ul>默认值：1 Mbps。</li>
<li>账号为传统账户类型的用户，EIP出带宽上限取决于与其绑定的实例的公网出带宽上限，无需传递此参数。</li></ul>

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
     * Get EIP类型。默认值：EIP。
<ul style="margin:0"><li>弹性公网IP，可选值：<ul><li>EIP：弹性公网IP</li></ul></li></ul>
<ul style="margin:0"><li>精品IP，可选值：<ul><li>HighQualityEIP：精品IP</li></ul>注意：仅新加坡和中国香港支持精品IP。</li></ul>
<ul style="margin:0"><li>高防IP，可选值：<ul><li>AntiDDoSEIP：高防IP</li></ul>注意：仅部分地域支持高防IP，详情可见弹性公网IP[产品概述](https://cloud.tencent.com/document/product/1199/41646)。</li></ul> 
     * @return AddressType EIP类型。默认值：EIP。
<ul style="margin:0"><li>弹性公网IP，可选值：<ul><li>EIP：弹性公网IP</li></ul></li></ul>
<ul style="margin:0"><li>精品IP，可选值：<ul><li>HighQualityEIP：精品IP</li></ul>注意：仅新加坡和中国香港支持精品IP。</li></ul>
<ul style="margin:0"><li>高防IP，可选值：<ul><li>AntiDDoSEIP：高防IP</li></ul>注意：仅部分地域支持高防IP，详情可见弹性公网IP[产品概述](https://cloud.tencent.com/document/product/1199/41646)。</li></ul>
     */
    public String getAddressType() {
        return this.AddressType;
    }

    /**
     * Set EIP类型。默认值：EIP。
<ul style="margin:0"><li>弹性公网IP，可选值：<ul><li>EIP：弹性公网IP</li></ul></li></ul>
<ul style="margin:0"><li>精品IP，可选值：<ul><li>HighQualityEIP：精品IP</li></ul>注意：仅新加坡和中国香港支持精品IP。</li></ul>
<ul style="margin:0"><li>高防IP，可选值：<ul><li>AntiDDoSEIP：高防IP</li></ul>注意：仅部分地域支持高防IP，详情可见弹性公网IP[产品概述](https://cloud.tencent.com/document/product/1199/41646)。</li></ul>
     * @param AddressType EIP类型。默认值：EIP。
<ul style="margin:0"><li>弹性公网IP，可选值：<ul><li>EIP：弹性公网IP</li></ul></li></ul>
<ul style="margin:0"><li>精品IP，可选值：<ul><li>HighQualityEIP：精品IP</li></ul>注意：仅新加坡和中国香港支持精品IP。</li></ul>
<ul style="margin:0"><li>高防IP，可选值：<ul><li>AntiDDoSEIP：高防IP</li></ul>注意：仅部分地域支持高防IP，详情可见弹性公网IP[产品概述](https://cloud.tencent.com/document/product/1199/41646)。</li></ul>
     */
    public void setAddressType(String AddressType) {
        this.AddressType = AddressType;
    }

    /**
     * Get 原生EIP IP资源的计费方式。
<ul style="margin:0"><li>账号为标准账户类型的用户，可选值：<ul>
<li>IP_POSTPAID_BY_HOUR：IP资源按小时后付费</li>
<li>IP_PREPAID_BY_MONTH：IP资源包月预付费</li>
</ul></li>
</ul> 
     * @return IPChargeType 原生EIP IP资源的计费方式。
<ul style="margin:0"><li>账号为标准账户类型的用户，可选值：<ul>
<li>IP_POSTPAID_BY_HOUR：IP资源按小时后付费</li>
<li>IP_PREPAID_BY_MONTH：IP资源包月预付费</li>
</ul></li>
</ul>
     */
    public String getIPChargeType() {
        return this.IPChargeType;
    }

    /**
     * Set 原生EIP IP资源的计费方式。
<ul style="margin:0"><li>账号为标准账户类型的用户，可选值：<ul>
<li>IP_POSTPAID_BY_HOUR：IP资源按小时后付费</li>
<li>IP_PREPAID_BY_MONTH：IP资源包月预付费</li>
</ul></li>
</ul>
     * @param IPChargeType 原生EIP IP资源的计费方式。
<ul style="margin:0"><li>账号为标准账户类型的用户，可选值：<ul>
<li>IP_POSTPAID_BY_HOUR：IP资源按小时后付费</li>
<li>IP_PREPAID_BY_MONTH：IP资源包月预付费</li>
</ul></li>
</ul>
     */
    public void setIPChargeType(String IPChargeType) {
        this.IPChargeType = IPChargeType;
    }

    public InquiryPriceAllocateAddressesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceAllocateAddressesRequest(InquiryPriceAllocateAddressesRequest source) {
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
        if (source.IPChargeType != null) {
            this.IPChargeType = new String(source.IPChargeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InternetChargeType", this.InternetChargeType);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamObj(map, prefix + "AddressChargePrepaid.", this.AddressChargePrepaid);
        this.setParamSimple(map, prefix + "AddressType", this.AddressType);
        this.setParamSimple(map, prefix + "IPChargeType", this.IPChargeType);

    }
}

