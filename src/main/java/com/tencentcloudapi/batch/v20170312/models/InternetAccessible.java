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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InternetAccessible extends AbstractModel {

    /**
    * 网络计费类型。取值范围：<br><li>BANDWIDTH_PREPAID：预付费按带宽结算</li><li>TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费</li><li>BANDWIDTH_POSTPAID_BY_HOUR：带宽按小时后付费</li><li>BANDWIDTH_PACKAGE：带宽包用户</li>默认取值：非带宽包用户默认与子机付费类型保持一致，比如子机付费类型为预付费，网络计费类型默认为预付费；子机付费类型为后付费，网络计费类型默认为后付费。
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * 公网出带宽上限，单位：Mbps。默认值：0Mbps。不同机型带宽上限范围不一致，具体限制详见[购买网络带宽](https://cloud.tencent.com/document/product/213/12523)。
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * 是否分配公网IP。取值范围：<br><li>true：表示分配公网IP</li><li>false：表示不分配公网IP</li><br>当公网带宽大于0Mbps时，可自由选择开通与否，默认开通公网IP；当公网带宽为0，则不允许分配公网IP。该参数仅在RunInstances接口中作为入参使用。
    */
    @SerializedName("PublicIpAssigned")
    @Expose
    private Boolean PublicIpAssigned;

    /**
    * 带宽包ID。可通过[ DescribeBandwidthPackages ](https://cloud.tencent.com/document/api/215/19209)接口返回值中的`BandwidthPackageId`获取。该参数仅在RunInstances接口中作为入参使用。
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * 线路类型。各种线路类型详情可参考：[EIP 的 IP 地址类型](https://cloud.tencent.com/document/product/1199/41646)。默认值：BGP。

- BGP：常规 BGP 线路

已开通静态单线IP白名单的用户，可选值：

 - CMCC：中国移动
 - CTCC：中国电信
 - CUCC：中国联通

注意：仅部分地域支持静态单线IP。
示例值：BGP
    */
    @SerializedName("InternetServiceProvider")
    @Expose
    private String InternetServiceProvider;

    /**
    * 公网 IP 类型。

- WanIP：普通公网IP。
- HighQualityEIP：精品 IP。仅新加坡和中国香港支持精品IP。
- AntiDDoSEIP：高防 IP。仅部分地域支持高防IP，详情可见[弹性公网IP产品概述](https://cloud.tencent.com/document/product/1199/41646)。

如需为资源分配公网IPv4地址，请指定公网IPv4地址类型。

示例值：WanIP

此功能仅部分地区灰度开放，如需使用[请提交工单咨询](https://console.cloud.tencent.com/workorder/category)
    */
    @SerializedName("IPv4AddressType")
    @Expose
    private String IPv4AddressType;

    /**
    * 弹性公网 IPv6 类型。
- EIPv6：弹性公网 IPv6。
- HighQualityEIPv6：精品 IPv6。仅中国香港支持精品IPv6。

如需为资源分配IPv6地址，请指定弹性公网IPv6类型。
示例值：EIPv6

此功能仅部分地区灰度开放，如需使用[请提交工单咨询](https://console.cloud.tencent.com/workorder/category)
    */
    @SerializedName("IPv6AddressType")
    @Expose
    private String IPv6AddressType;

    /**
    * 高防包唯一ID，申请高防IP时，该字段必传。
示例值：bgp-12345678

    */
    @SerializedName("AntiDDoSPackageId")
    @Expose
    private String AntiDDoSPackageId;

    /**
     * Get 网络计费类型。取值范围：<br><li>BANDWIDTH_PREPAID：预付费按带宽结算</li><li>TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费</li><li>BANDWIDTH_POSTPAID_BY_HOUR：带宽按小时后付费</li><li>BANDWIDTH_PACKAGE：带宽包用户</li>默认取值：非带宽包用户默认与子机付费类型保持一致，比如子机付费类型为预付费，网络计费类型默认为预付费；子机付费类型为后付费，网络计费类型默认为后付费。 
     * @return InternetChargeType 网络计费类型。取值范围：<br><li>BANDWIDTH_PREPAID：预付费按带宽结算</li><li>TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费</li><li>BANDWIDTH_POSTPAID_BY_HOUR：带宽按小时后付费</li><li>BANDWIDTH_PACKAGE：带宽包用户</li>默认取值：非带宽包用户默认与子机付费类型保持一致，比如子机付费类型为预付费，网络计费类型默认为预付费；子机付费类型为后付费，网络计费类型默认为后付费。
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set 网络计费类型。取值范围：<br><li>BANDWIDTH_PREPAID：预付费按带宽结算</li><li>TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费</li><li>BANDWIDTH_POSTPAID_BY_HOUR：带宽按小时后付费</li><li>BANDWIDTH_PACKAGE：带宽包用户</li>默认取值：非带宽包用户默认与子机付费类型保持一致，比如子机付费类型为预付费，网络计费类型默认为预付费；子机付费类型为后付费，网络计费类型默认为后付费。
     * @param InternetChargeType 网络计费类型。取值范围：<br><li>BANDWIDTH_PREPAID：预付费按带宽结算</li><li>TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费</li><li>BANDWIDTH_POSTPAID_BY_HOUR：带宽按小时后付费</li><li>BANDWIDTH_PACKAGE：带宽包用户</li>默认取值：非带宽包用户默认与子机付费类型保持一致，比如子机付费类型为预付费，网络计费类型默认为预付费；子机付费类型为后付费，网络计费类型默认为后付费。
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Get 公网出带宽上限，单位：Mbps。默认值：0Mbps。不同机型带宽上限范围不一致，具体限制详见[购买网络带宽](https://cloud.tencent.com/document/product/213/12523)。 
     * @return InternetMaxBandwidthOut 公网出带宽上限，单位：Mbps。默认值：0Mbps。不同机型带宽上限范围不一致，具体限制详见[购买网络带宽](https://cloud.tencent.com/document/product/213/12523)。
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 公网出带宽上限，单位：Mbps。默认值：0Mbps。不同机型带宽上限范围不一致，具体限制详见[购买网络带宽](https://cloud.tencent.com/document/product/213/12523)。
     * @param InternetMaxBandwidthOut 公网出带宽上限，单位：Mbps。默认值：0Mbps。不同机型带宽上限范围不一致，具体限制详见[购买网络带宽](https://cloud.tencent.com/document/product/213/12523)。
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get 是否分配公网IP。取值范围：<br><li>true：表示分配公网IP</li><li>false：表示不分配公网IP</li><br>当公网带宽大于0Mbps时，可自由选择开通与否，默认开通公网IP；当公网带宽为0，则不允许分配公网IP。该参数仅在RunInstances接口中作为入参使用。 
     * @return PublicIpAssigned 是否分配公网IP。取值范围：<br><li>true：表示分配公网IP</li><li>false：表示不分配公网IP</li><br>当公网带宽大于0Mbps时，可自由选择开通与否，默认开通公网IP；当公网带宽为0，则不允许分配公网IP。该参数仅在RunInstances接口中作为入参使用。
     */
    public Boolean getPublicIpAssigned() {
        return this.PublicIpAssigned;
    }

    /**
     * Set 是否分配公网IP。取值范围：<br><li>true：表示分配公网IP</li><li>false：表示不分配公网IP</li><br>当公网带宽大于0Mbps时，可自由选择开通与否，默认开通公网IP；当公网带宽为0，则不允许分配公网IP。该参数仅在RunInstances接口中作为入参使用。
     * @param PublicIpAssigned 是否分配公网IP。取值范围：<br><li>true：表示分配公网IP</li><li>false：表示不分配公网IP</li><br>当公网带宽大于0Mbps时，可自由选择开通与否，默认开通公网IP；当公网带宽为0，则不允许分配公网IP。该参数仅在RunInstances接口中作为入参使用。
     */
    public void setPublicIpAssigned(Boolean PublicIpAssigned) {
        this.PublicIpAssigned = PublicIpAssigned;
    }

    /**
     * Get 带宽包ID。可通过[ DescribeBandwidthPackages ](https://cloud.tencent.com/document/api/215/19209)接口返回值中的`BandwidthPackageId`获取。该参数仅在RunInstances接口中作为入参使用。 
     * @return BandwidthPackageId 带宽包ID。可通过[ DescribeBandwidthPackages ](https://cloud.tencent.com/document/api/215/19209)接口返回值中的`BandwidthPackageId`获取。该参数仅在RunInstances接口中作为入参使用。
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set 带宽包ID。可通过[ DescribeBandwidthPackages ](https://cloud.tencent.com/document/api/215/19209)接口返回值中的`BandwidthPackageId`获取。该参数仅在RunInstances接口中作为入参使用。
     * @param BandwidthPackageId 带宽包ID。可通过[ DescribeBandwidthPackages ](https://cloud.tencent.com/document/api/215/19209)接口返回值中的`BandwidthPackageId`获取。该参数仅在RunInstances接口中作为入参使用。
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Get 线路类型。各种线路类型详情可参考：[EIP 的 IP 地址类型](https://cloud.tencent.com/document/product/1199/41646)。默认值：BGP。

- BGP：常规 BGP 线路

已开通静态单线IP白名单的用户，可选值：

 - CMCC：中国移动
 - CTCC：中国电信
 - CUCC：中国联通

注意：仅部分地域支持静态单线IP。
示例值：BGP 
     * @return InternetServiceProvider 线路类型。各种线路类型详情可参考：[EIP 的 IP 地址类型](https://cloud.tencent.com/document/product/1199/41646)。默认值：BGP。

- BGP：常规 BGP 线路

已开通静态单线IP白名单的用户，可选值：

 - CMCC：中国移动
 - CTCC：中国电信
 - CUCC：中国联通

注意：仅部分地域支持静态单线IP。
示例值：BGP
     */
    public String getInternetServiceProvider() {
        return this.InternetServiceProvider;
    }

    /**
     * Set 线路类型。各种线路类型详情可参考：[EIP 的 IP 地址类型](https://cloud.tencent.com/document/product/1199/41646)。默认值：BGP。

- BGP：常规 BGP 线路

已开通静态单线IP白名单的用户，可选值：

 - CMCC：中国移动
 - CTCC：中国电信
 - CUCC：中国联通

注意：仅部分地域支持静态单线IP。
示例值：BGP
     * @param InternetServiceProvider 线路类型。各种线路类型详情可参考：[EIP 的 IP 地址类型](https://cloud.tencent.com/document/product/1199/41646)。默认值：BGP。

- BGP：常规 BGP 线路

已开通静态单线IP白名单的用户，可选值：

 - CMCC：中国移动
 - CTCC：中国电信
 - CUCC：中国联通

注意：仅部分地域支持静态单线IP。
示例值：BGP
     */
    public void setInternetServiceProvider(String InternetServiceProvider) {
        this.InternetServiceProvider = InternetServiceProvider;
    }

    /**
     * Get 公网 IP 类型。

- WanIP：普通公网IP。
- HighQualityEIP：精品 IP。仅新加坡和中国香港支持精品IP。
- AntiDDoSEIP：高防 IP。仅部分地域支持高防IP，详情可见[弹性公网IP产品概述](https://cloud.tencent.com/document/product/1199/41646)。

如需为资源分配公网IPv4地址，请指定公网IPv4地址类型。

示例值：WanIP

此功能仅部分地区灰度开放，如需使用[请提交工单咨询](https://console.cloud.tencent.com/workorder/category) 
     * @return IPv4AddressType 公网 IP 类型。

- WanIP：普通公网IP。
- HighQualityEIP：精品 IP。仅新加坡和中国香港支持精品IP。
- AntiDDoSEIP：高防 IP。仅部分地域支持高防IP，详情可见[弹性公网IP产品概述](https://cloud.tencent.com/document/product/1199/41646)。

如需为资源分配公网IPv4地址，请指定公网IPv4地址类型。

示例值：WanIP

此功能仅部分地区灰度开放，如需使用[请提交工单咨询](https://console.cloud.tencent.com/workorder/category)
     */
    public String getIPv4AddressType() {
        return this.IPv4AddressType;
    }

    /**
     * Set 公网 IP 类型。

- WanIP：普通公网IP。
- HighQualityEIP：精品 IP。仅新加坡和中国香港支持精品IP。
- AntiDDoSEIP：高防 IP。仅部分地域支持高防IP，详情可见[弹性公网IP产品概述](https://cloud.tencent.com/document/product/1199/41646)。

如需为资源分配公网IPv4地址，请指定公网IPv4地址类型。

示例值：WanIP

此功能仅部分地区灰度开放，如需使用[请提交工单咨询](https://console.cloud.tencent.com/workorder/category)
     * @param IPv4AddressType 公网 IP 类型。

- WanIP：普通公网IP。
- HighQualityEIP：精品 IP。仅新加坡和中国香港支持精品IP。
- AntiDDoSEIP：高防 IP。仅部分地域支持高防IP，详情可见[弹性公网IP产品概述](https://cloud.tencent.com/document/product/1199/41646)。

如需为资源分配公网IPv4地址，请指定公网IPv4地址类型。

示例值：WanIP

此功能仅部分地区灰度开放，如需使用[请提交工单咨询](https://console.cloud.tencent.com/workorder/category)
     */
    public void setIPv4AddressType(String IPv4AddressType) {
        this.IPv4AddressType = IPv4AddressType;
    }

    /**
     * Get 弹性公网 IPv6 类型。
- EIPv6：弹性公网 IPv6。
- HighQualityEIPv6：精品 IPv6。仅中国香港支持精品IPv6。

如需为资源分配IPv6地址，请指定弹性公网IPv6类型。
示例值：EIPv6

此功能仅部分地区灰度开放，如需使用[请提交工单咨询](https://console.cloud.tencent.com/workorder/category) 
     * @return IPv6AddressType 弹性公网 IPv6 类型。
- EIPv6：弹性公网 IPv6。
- HighQualityEIPv6：精品 IPv6。仅中国香港支持精品IPv6。

如需为资源分配IPv6地址，请指定弹性公网IPv6类型。
示例值：EIPv6

此功能仅部分地区灰度开放，如需使用[请提交工单咨询](https://console.cloud.tencent.com/workorder/category)
     */
    public String getIPv6AddressType() {
        return this.IPv6AddressType;
    }

    /**
     * Set 弹性公网 IPv6 类型。
- EIPv6：弹性公网 IPv6。
- HighQualityEIPv6：精品 IPv6。仅中国香港支持精品IPv6。

如需为资源分配IPv6地址，请指定弹性公网IPv6类型。
示例值：EIPv6

此功能仅部分地区灰度开放，如需使用[请提交工单咨询](https://console.cloud.tencent.com/workorder/category)
     * @param IPv6AddressType 弹性公网 IPv6 类型。
- EIPv6：弹性公网 IPv6。
- HighQualityEIPv6：精品 IPv6。仅中国香港支持精品IPv6。

如需为资源分配IPv6地址，请指定弹性公网IPv6类型。
示例值：EIPv6

此功能仅部分地区灰度开放，如需使用[请提交工单咨询](https://console.cloud.tencent.com/workorder/category)
     */
    public void setIPv6AddressType(String IPv6AddressType) {
        this.IPv6AddressType = IPv6AddressType;
    }

    /**
     * Get 高防包唯一ID，申请高防IP时，该字段必传。
示例值：bgp-12345678
 
     * @return AntiDDoSPackageId 高防包唯一ID，申请高防IP时，该字段必传。
示例值：bgp-12345678

     */
    public String getAntiDDoSPackageId() {
        return this.AntiDDoSPackageId;
    }

    /**
     * Set 高防包唯一ID，申请高防IP时，该字段必传。
示例值：bgp-12345678

     * @param AntiDDoSPackageId 高防包唯一ID，申请高防IP时，该字段必传。
示例值：bgp-12345678

     */
    public void setAntiDDoSPackageId(String AntiDDoSPackageId) {
        this.AntiDDoSPackageId = AntiDDoSPackageId;
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
        if (source.PublicIpAssigned != null) {
            this.PublicIpAssigned = new Boolean(source.PublicIpAssigned);
        }
        if (source.BandwidthPackageId != null) {
            this.BandwidthPackageId = new String(source.BandwidthPackageId);
        }
        if (source.InternetServiceProvider != null) {
            this.InternetServiceProvider = new String(source.InternetServiceProvider);
        }
        if (source.IPv4AddressType != null) {
            this.IPv4AddressType = new String(source.IPv4AddressType);
        }
        if (source.IPv6AddressType != null) {
            this.IPv6AddressType = new String(source.IPv6AddressType);
        }
        if (source.AntiDDoSPackageId != null) {
            this.AntiDDoSPackageId = new String(source.AntiDDoSPackageId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InternetChargeType", this.InternetChargeType);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "PublicIpAssigned", this.PublicIpAssigned);
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);
        this.setParamSimple(map, prefix + "InternetServiceProvider", this.InternetServiceProvider);
        this.setParamSimple(map, prefix + "IPv4AddressType", this.IPv4AddressType);
        this.setParamSimple(map, prefix + "IPv6AddressType", this.IPv6AddressType);
        this.setParamSimple(map, prefix + "AntiDDoSPackageId", this.AntiDDoSPackageId);

    }
}

