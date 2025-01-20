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

public class AllocateIPv6AddressesRequest extends AbstractModel {

    /**
    * EIP名称，用于申请EIP时用户自定义该EIP的个性化名称，默认值：未命名。
    */
    @SerializedName("AddressName")
    @Expose
    private String AddressName;

    /**
    * 弹性公网IPv6类型，可选值：

- EIPv6：普通IPv6
- HighQualityEIPv6：精品IPv6
注意：需联系产品开通精品IPv6白名单，且仅部分地域支持精品IPv6

默认值：EIPv6。
    */
    @SerializedName("AddressType")
    @Expose
    private String AddressType;

    /**
    * 申请的弹性公网IPv6数量，默认值：1。
    */
    @SerializedName("AddressCount")
    @Expose
    private Long AddressCount;

    /**
    * 弹性公网IPv6计费方式，可选值：

- BANDWIDTH_PACKAGE：[共享带宽包](https://cloud.tencent.com/document/product/684/15255)付费
- TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费

默认值：TRAFFIC_POSTPAID_BY_HOUR。
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * 弹性公网IPv6线路类型，默认值：BGP。

已开通静态单线IP白名单的用户，可选值：
- CMCC：中国移动
- CTCC：中国电信
- CUCC：中国联通
注意：仅部分地域支持静态单线IP。
    */
    @SerializedName("InternetServiceProvider")
    @Expose
    private String InternetServiceProvider;

    /**
    * 弹性公网IPv6带宽上限，单位：Mbps。

可选值范围取决于EIP计费方式：

- BANDWIDTH_PACKAGE：1 Mbps 至 2000 Mbps
- TRAFFIC_POSTPAID_BY_HOUR：1 Mbps 至 100 Mbps

默认值：1 Mbps。
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * 带宽包唯一ID参数。
设定该参数且InternetChargeType为BANDWIDTH_PACKAGE，则表示创建的EIP加入该BGP带宽包并采用带宽包计费。
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * 需要关联的标签列表。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 弹性公网IPv6网络出口，可选值：

- CENTER_EGRESS_1：中心出口一
- CENTER_EGRESS_2：中心出口二
- CENTER_EGRESS_3：中心出口三
注意：不同运营商或资源类型对应的网络出口需要联系产品开白

默认值：CENTER_EGRESS_1。
    */
    @SerializedName("Egress")
    @Expose
    private String Egress;

    /**
     * Get EIP名称，用于申请EIP时用户自定义该EIP的个性化名称，默认值：未命名。 
     * @return AddressName EIP名称，用于申请EIP时用户自定义该EIP的个性化名称，默认值：未命名。
     */
    public String getAddressName() {
        return this.AddressName;
    }

    /**
     * Set EIP名称，用于申请EIP时用户自定义该EIP的个性化名称，默认值：未命名。
     * @param AddressName EIP名称，用于申请EIP时用户自定义该EIP的个性化名称，默认值：未命名。
     */
    public void setAddressName(String AddressName) {
        this.AddressName = AddressName;
    }

    /**
     * Get 弹性公网IPv6类型，可选值：

- EIPv6：普通IPv6
- HighQualityEIPv6：精品IPv6
注意：需联系产品开通精品IPv6白名单，且仅部分地域支持精品IPv6

默认值：EIPv6。 
     * @return AddressType 弹性公网IPv6类型，可选值：

- EIPv6：普通IPv6
- HighQualityEIPv6：精品IPv6
注意：需联系产品开通精品IPv6白名单，且仅部分地域支持精品IPv6

默认值：EIPv6。
     */
    public String getAddressType() {
        return this.AddressType;
    }

    /**
     * Set 弹性公网IPv6类型，可选值：

- EIPv6：普通IPv6
- HighQualityEIPv6：精品IPv6
注意：需联系产品开通精品IPv6白名单，且仅部分地域支持精品IPv6

默认值：EIPv6。
     * @param AddressType 弹性公网IPv6类型，可选值：

- EIPv6：普通IPv6
- HighQualityEIPv6：精品IPv6
注意：需联系产品开通精品IPv6白名单，且仅部分地域支持精品IPv6

默认值：EIPv6。
     */
    public void setAddressType(String AddressType) {
        this.AddressType = AddressType;
    }

    /**
     * Get 申请的弹性公网IPv6数量，默认值：1。 
     * @return AddressCount 申请的弹性公网IPv6数量，默认值：1。
     */
    public Long getAddressCount() {
        return this.AddressCount;
    }

    /**
     * Set 申请的弹性公网IPv6数量，默认值：1。
     * @param AddressCount 申请的弹性公网IPv6数量，默认值：1。
     */
    public void setAddressCount(Long AddressCount) {
        this.AddressCount = AddressCount;
    }

    /**
     * Get 弹性公网IPv6计费方式，可选值：

- BANDWIDTH_PACKAGE：[共享带宽包](https://cloud.tencent.com/document/product/684/15255)付费
- TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费

默认值：TRAFFIC_POSTPAID_BY_HOUR。 
     * @return InternetChargeType 弹性公网IPv6计费方式，可选值：

- BANDWIDTH_PACKAGE：[共享带宽包](https://cloud.tencent.com/document/product/684/15255)付费
- TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费

默认值：TRAFFIC_POSTPAID_BY_HOUR。
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set 弹性公网IPv6计费方式，可选值：

- BANDWIDTH_PACKAGE：[共享带宽包](https://cloud.tencent.com/document/product/684/15255)付费
- TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费

默认值：TRAFFIC_POSTPAID_BY_HOUR。
     * @param InternetChargeType 弹性公网IPv6计费方式，可选值：

- BANDWIDTH_PACKAGE：[共享带宽包](https://cloud.tencent.com/document/product/684/15255)付费
- TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费

默认值：TRAFFIC_POSTPAID_BY_HOUR。
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Get 弹性公网IPv6线路类型，默认值：BGP。

已开通静态单线IP白名单的用户，可选值：
- CMCC：中国移动
- CTCC：中国电信
- CUCC：中国联通
注意：仅部分地域支持静态单线IP。 
     * @return InternetServiceProvider 弹性公网IPv6线路类型，默认值：BGP。

已开通静态单线IP白名单的用户，可选值：
- CMCC：中国移动
- CTCC：中国电信
- CUCC：中国联通
注意：仅部分地域支持静态单线IP。
     */
    public String getInternetServiceProvider() {
        return this.InternetServiceProvider;
    }

    /**
     * Set 弹性公网IPv6线路类型，默认值：BGP。

已开通静态单线IP白名单的用户，可选值：
- CMCC：中国移动
- CTCC：中国电信
- CUCC：中国联通
注意：仅部分地域支持静态单线IP。
     * @param InternetServiceProvider 弹性公网IPv6线路类型，默认值：BGP。

已开通静态单线IP白名单的用户，可选值：
- CMCC：中国移动
- CTCC：中国电信
- CUCC：中国联通
注意：仅部分地域支持静态单线IP。
     */
    public void setInternetServiceProvider(String InternetServiceProvider) {
        this.InternetServiceProvider = InternetServiceProvider;
    }

    /**
     * Get 弹性公网IPv6带宽上限，单位：Mbps。

可选值范围取决于EIP计费方式：

- BANDWIDTH_PACKAGE：1 Mbps 至 2000 Mbps
- TRAFFIC_POSTPAID_BY_HOUR：1 Mbps 至 100 Mbps

默认值：1 Mbps。 
     * @return InternetMaxBandwidthOut 弹性公网IPv6带宽上限，单位：Mbps。

可选值范围取决于EIP计费方式：

- BANDWIDTH_PACKAGE：1 Mbps 至 2000 Mbps
- TRAFFIC_POSTPAID_BY_HOUR：1 Mbps 至 100 Mbps

默认值：1 Mbps。
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 弹性公网IPv6带宽上限，单位：Mbps。

可选值范围取决于EIP计费方式：

- BANDWIDTH_PACKAGE：1 Mbps 至 2000 Mbps
- TRAFFIC_POSTPAID_BY_HOUR：1 Mbps 至 100 Mbps

默认值：1 Mbps。
     * @param InternetMaxBandwidthOut 弹性公网IPv6带宽上限，单位：Mbps。

可选值范围取决于EIP计费方式：

- BANDWIDTH_PACKAGE：1 Mbps 至 2000 Mbps
- TRAFFIC_POSTPAID_BY_HOUR：1 Mbps 至 100 Mbps

默认值：1 Mbps。
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get 带宽包唯一ID参数。
设定该参数且InternetChargeType为BANDWIDTH_PACKAGE，则表示创建的EIP加入该BGP带宽包并采用带宽包计费。 
     * @return BandwidthPackageId 带宽包唯一ID参数。
设定该参数且InternetChargeType为BANDWIDTH_PACKAGE，则表示创建的EIP加入该BGP带宽包并采用带宽包计费。
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set 带宽包唯一ID参数。
设定该参数且InternetChargeType为BANDWIDTH_PACKAGE，则表示创建的EIP加入该BGP带宽包并采用带宽包计费。
     * @param BandwidthPackageId 带宽包唯一ID参数。
设定该参数且InternetChargeType为BANDWIDTH_PACKAGE，则表示创建的EIP加入该BGP带宽包并采用带宽包计费。
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
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
     * Get 弹性公网IPv6网络出口，可选值：

- CENTER_EGRESS_1：中心出口一
- CENTER_EGRESS_2：中心出口二
- CENTER_EGRESS_3：中心出口三
注意：不同运营商或资源类型对应的网络出口需要联系产品开白

默认值：CENTER_EGRESS_1。 
     * @return Egress 弹性公网IPv6网络出口，可选值：

- CENTER_EGRESS_1：中心出口一
- CENTER_EGRESS_2：中心出口二
- CENTER_EGRESS_3：中心出口三
注意：不同运营商或资源类型对应的网络出口需要联系产品开白

默认值：CENTER_EGRESS_1。
     */
    public String getEgress() {
        return this.Egress;
    }

    /**
     * Set 弹性公网IPv6网络出口，可选值：

- CENTER_EGRESS_1：中心出口一
- CENTER_EGRESS_2：中心出口二
- CENTER_EGRESS_3：中心出口三
注意：不同运营商或资源类型对应的网络出口需要联系产品开白

默认值：CENTER_EGRESS_1。
     * @param Egress 弹性公网IPv6网络出口，可选值：

- CENTER_EGRESS_1：中心出口一
- CENTER_EGRESS_2：中心出口二
- CENTER_EGRESS_3：中心出口三
注意：不同运营商或资源类型对应的网络出口需要联系产品开白

默认值：CENTER_EGRESS_1。
     */
    public void setEgress(String Egress) {
        this.Egress = Egress;
    }

    public AllocateIPv6AddressesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocateIPv6AddressesRequest(AllocateIPv6AddressesRequest source) {
        if (source.AddressName != null) {
            this.AddressName = new String(source.AddressName);
        }
        if (source.AddressType != null) {
            this.AddressType = new String(source.AddressType);
        }
        if (source.AddressCount != null) {
            this.AddressCount = new Long(source.AddressCount);
        }
        if (source.InternetChargeType != null) {
            this.InternetChargeType = new String(source.InternetChargeType);
        }
        if (source.InternetServiceProvider != null) {
            this.InternetServiceProvider = new String(source.InternetServiceProvider);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.BandwidthPackageId != null) {
            this.BandwidthPackageId = new String(source.BandwidthPackageId);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Egress != null) {
            this.Egress = new String(source.Egress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressName", this.AddressName);
        this.setParamSimple(map, prefix + "AddressType", this.AddressType);
        this.setParamSimple(map, prefix + "AddressCount", this.AddressCount);
        this.setParamSimple(map, prefix + "InternetChargeType", this.InternetChargeType);
        this.setParamSimple(map, prefix + "InternetServiceProvider", this.InternetServiceProvider);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Egress", this.Egress);

    }
}

