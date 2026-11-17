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

public class AllocateIPv6AddressesRequest extends AbstractModel {

    /**
    * <p>EIP名称，用于申请EIP时用户自定义该EIP的个性化名称。长度上限为128个字符，允许使用大小写字母、汉字、数字、连字符&quot;-&quot;和下划线&quot;_&quot;，不能包含空格。<br>默认值：未命名</p>
    */
    @SerializedName("AddressName")
    @Expose
    private String AddressName;

    /**
    * <p>弹性公网IPv6类型，可选值：</p><ul><li>EIPv6：弹性公网IPv6</li><li>HighQualityEIPv6：精品BGP线路弹性公网IPv6<br>注意：弹性公网IPv6产品需开白才能使用，其中精品BGP线路仅在中国香港支持。</li></ul><p>默认值：EIPv6</p>
    */
    @SerializedName("AddressType")
    @Expose
    private String AddressType;

    /**
    * <p>申请的弹性公网IPv6数量。单次最多可以申请20个弹性公网IPv6实例，总配额请参见<a href="https://cloud.tencent.com/document/product/1142/38369">弹性公网 IPv6 配额说明</a>。</p><p>默认值：1</p>
    */
    @SerializedName("AddressCount")
    @Expose
    private Long AddressCount;

    /**
    * <p>弹性公网IPv6计费方式，可选值：</p><ul><li>BANDWIDTH_PACKAGE：<a href="https://cloud.tencent.com/document/product/684/15255">共享带宽包</a>付费</li><li>TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费</li></ul><p>默认值：TRAFFIC_POSTPAID_BY_HOUR</p>
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * <p>弹性公网IPv6线路类型，默认值：BGP。</p><p>已开通静态单线IP白名单的用户，可选值：</p><ul><li>CMCC：中国移动</li><li>CTCC：中国电信</li><li>CUCC：中国联通<br>注意：仅部分地域支持静态单线IP。具体请以控制台购买页展示为准。</li></ul>
    */
    @SerializedName("InternetServiceProvider")
    @Expose
    private String InternetServiceProvider;

    /**
    * <p>弹性公网IPv6带宽上限，单位：Mbps。</p><p>可选值范围取决于EIP计费方式：</p><ul><li>BANDWIDTH_PACKAGE（共享带宽包付费）：1 Mbps 至 2000 Mbps</li><li>TRAFFIC_POSTPAID_BY_HOUR（流量按小时后付费）：1 Mbps 至 200 Mbps</li></ul><p>默认值：1</p>
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * <p>带宽包唯一ID参数。可以使用<a href="https://cloud.tencent.com/document/product/215/19209">DescribeBandwidthPackages</a>接口查询BandwidthPackageId。<br>设定该参数且InternetChargeType为BANDWIDTH_PACKAGE，则表示创建的EIP加入该BGP带宽包并采用带宽包计费。</p>
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * <p>需要关联的标签列表。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>弹性公网IPv6网络出口，可选值：</p><ul><li>CENTER_EGRESS_1：中心出口一</li><li>CENTER_EGRESS_2：中心出口二<br>注意：不同地域支持的线路类型、网络出口略有差异，请以控制台展示为准。</li></ul><p>默认值：CENTER_EGRESS_1</p>
    */
    @SerializedName("Egress")
    @Expose
    private String Egress;

    /**
     * Get <p>EIP名称，用于申请EIP时用户自定义该EIP的个性化名称。长度上限为128个字符，允许使用大小写字母、汉字、数字、连字符&quot;-&quot;和下划线&quot;_&quot;，不能包含空格。<br>默认值：未命名</p> 
     * @return AddressName <p>EIP名称，用于申请EIP时用户自定义该EIP的个性化名称。长度上限为128个字符，允许使用大小写字母、汉字、数字、连字符&quot;-&quot;和下划线&quot;_&quot;，不能包含空格。<br>默认值：未命名</p>
     */
    public String getAddressName() {
        return this.AddressName;
    }

    /**
     * Set <p>EIP名称，用于申请EIP时用户自定义该EIP的个性化名称。长度上限为128个字符，允许使用大小写字母、汉字、数字、连字符&quot;-&quot;和下划线&quot;_&quot;，不能包含空格。<br>默认值：未命名</p>
     * @param AddressName <p>EIP名称，用于申请EIP时用户自定义该EIP的个性化名称。长度上限为128个字符，允许使用大小写字母、汉字、数字、连字符&quot;-&quot;和下划线&quot;_&quot;，不能包含空格。<br>默认值：未命名</p>
     */
    public void setAddressName(String AddressName) {
        this.AddressName = AddressName;
    }

    /**
     * Get <p>弹性公网IPv6类型，可选值：</p><ul><li>EIPv6：弹性公网IPv6</li><li>HighQualityEIPv6：精品BGP线路弹性公网IPv6<br>注意：弹性公网IPv6产品需开白才能使用，其中精品BGP线路仅在中国香港支持。</li></ul><p>默认值：EIPv6</p> 
     * @return AddressType <p>弹性公网IPv6类型，可选值：</p><ul><li>EIPv6：弹性公网IPv6</li><li>HighQualityEIPv6：精品BGP线路弹性公网IPv6<br>注意：弹性公网IPv6产品需开白才能使用，其中精品BGP线路仅在中国香港支持。</li></ul><p>默认值：EIPv6</p>
     */
    public String getAddressType() {
        return this.AddressType;
    }

    /**
     * Set <p>弹性公网IPv6类型，可选值：</p><ul><li>EIPv6：弹性公网IPv6</li><li>HighQualityEIPv6：精品BGP线路弹性公网IPv6<br>注意：弹性公网IPv6产品需开白才能使用，其中精品BGP线路仅在中国香港支持。</li></ul><p>默认值：EIPv6</p>
     * @param AddressType <p>弹性公网IPv6类型，可选值：</p><ul><li>EIPv6：弹性公网IPv6</li><li>HighQualityEIPv6：精品BGP线路弹性公网IPv6<br>注意：弹性公网IPv6产品需开白才能使用，其中精品BGP线路仅在中国香港支持。</li></ul><p>默认值：EIPv6</p>
     */
    public void setAddressType(String AddressType) {
        this.AddressType = AddressType;
    }

    /**
     * Get <p>申请的弹性公网IPv6数量。单次最多可以申请20个弹性公网IPv6实例，总配额请参见<a href="https://cloud.tencent.com/document/product/1142/38369">弹性公网 IPv6 配额说明</a>。</p><p>默认值：1</p> 
     * @return AddressCount <p>申请的弹性公网IPv6数量。单次最多可以申请20个弹性公网IPv6实例，总配额请参见<a href="https://cloud.tencent.com/document/product/1142/38369">弹性公网 IPv6 配额说明</a>。</p><p>默认值：1</p>
     */
    public Long getAddressCount() {
        return this.AddressCount;
    }

    /**
     * Set <p>申请的弹性公网IPv6数量。单次最多可以申请20个弹性公网IPv6实例，总配额请参见<a href="https://cloud.tencent.com/document/product/1142/38369">弹性公网 IPv6 配额说明</a>。</p><p>默认值：1</p>
     * @param AddressCount <p>申请的弹性公网IPv6数量。单次最多可以申请20个弹性公网IPv6实例，总配额请参见<a href="https://cloud.tencent.com/document/product/1142/38369">弹性公网 IPv6 配额说明</a>。</p><p>默认值：1</p>
     */
    public void setAddressCount(Long AddressCount) {
        this.AddressCount = AddressCount;
    }

    /**
     * Get <p>弹性公网IPv6计费方式，可选值：</p><ul><li>BANDWIDTH_PACKAGE：<a href="https://cloud.tencent.com/document/product/684/15255">共享带宽包</a>付费</li><li>TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费</li></ul><p>默认值：TRAFFIC_POSTPAID_BY_HOUR</p> 
     * @return InternetChargeType <p>弹性公网IPv6计费方式，可选值：</p><ul><li>BANDWIDTH_PACKAGE：<a href="https://cloud.tencent.com/document/product/684/15255">共享带宽包</a>付费</li><li>TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费</li></ul><p>默认值：TRAFFIC_POSTPAID_BY_HOUR</p>
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set <p>弹性公网IPv6计费方式，可选值：</p><ul><li>BANDWIDTH_PACKAGE：<a href="https://cloud.tencent.com/document/product/684/15255">共享带宽包</a>付费</li><li>TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费</li></ul><p>默认值：TRAFFIC_POSTPAID_BY_HOUR</p>
     * @param InternetChargeType <p>弹性公网IPv6计费方式，可选值：</p><ul><li>BANDWIDTH_PACKAGE：<a href="https://cloud.tencent.com/document/product/684/15255">共享带宽包</a>付费</li><li>TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费</li></ul><p>默认值：TRAFFIC_POSTPAID_BY_HOUR</p>
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Get <p>弹性公网IPv6线路类型，默认值：BGP。</p><p>已开通静态单线IP白名单的用户，可选值：</p><ul><li>CMCC：中国移动</li><li>CTCC：中国电信</li><li>CUCC：中国联通<br>注意：仅部分地域支持静态单线IP。具体请以控制台购买页展示为准。</li></ul> 
     * @return InternetServiceProvider <p>弹性公网IPv6线路类型，默认值：BGP。</p><p>已开通静态单线IP白名单的用户，可选值：</p><ul><li>CMCC：中国移动</li><li>CTCC：中国电信</li><li>CUCC：中国联通<br>注意：仅部分地域支持静态单线IP。具体请以控制台购买页展示为准。</li></ul>
     */
    public String getInternetServiceProvider() {
        return this.InternetServiceProvider;
    }

    /**
     * Set <p>弹性公网IPv6线路类型，默认值：BGP。</p><p>已开通静态单线IP白名单的用户，可选值：</p><ul><li>CMCC：中国移动</li><li>CTCC：中国电信</li><li>CUCC：中国联通<br>注意：仅部分地域支持静态单线IP。具体请以控制台购买页展示为准。</li></ul>
     * @param InternetServiceProvider <p>弹性公网IPv6线路类型，默认值：BGP。</p><p>已开通静态单线IP白名单的用户，可选值：</p><ul><li>CMCC：中国移动</li><li>CTCC：中国电信</li><li>CUCC：中国联通<br>注意：仅部分地域支持静态单线IP。具体请以控制台购买页展示为准。</li></ul>
     */
    public void setInternetServiceProvider(String InternetServiceProvider) {
        this.InternetServiceProvider = InternetServiceProvider;
    }

    /**
     * Get <p>弹性公网IPv6带宽上限，单位：Mbps。</p><p>可选值范围取决于EIP计费方式：</p><ul><li>BANDWIDTH_PACKAGE（共享带宽包付费）：1 Mbps 至 2000 Mbps</li><li>TRAFFIC_POSTPAID_BY_HOUR（流量按小时后付费）：1 Mbps 至 200 Mbps</li></ul><p>默认值：1</p> 
     * @return InternetMaxBandwidthOut <p>弹性公网IPv6带宽上限，单位：Mbps。</p><p>可选值范围取决于EIP计费方式：</p><ul><li>BANDWIDTH_PACKAGE（共享带宽包付费）：1 Mbps 至 2000 Mbps</li><li>TRAFFIC_POSTPAID_BY_HOUR（流量按小时后付费）：1 Mbps 至 200 Mbps</li></ul><p>默认值：1</p>
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set <p>弹性公网IPv6带宽上限，单位：Mbps。</p><p>可选值范围取决于EIP计费方式：</p><ul><li>BANDWIDTH_PACKAGE（共享带宽包付费）：1 Mbps 至 2000 Mbps</li><li>TRAFFIC_POSTPAID_BY_HOUR（流量按小时后付费）：1 Mbps 至 200 Mbps</li></ul><p>默认值：1</p>
     * @param InternetMaxBandwidthOut <p>弹性公网IPv6带宽上限，单位：Mbps。</p><p>可选值范围取决于EIP计费方式：</p><ul><li>BANDWIDTH_PACKAGE（共享带宽包付费）：1 Mbps 至 2000 Mbps</li><li>TRAFFIC_POSTPAID_BY_HOUR（流量按小时后付费）：1 Mbps 至 200 Mbps</li></ul><p>默认值：1</p>
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get <p>带宽包唯一ID参数。可以使用<a href="https://cloud.tencent.com/document/product/215/19209">DescribeBandwidthPackages</a>接口查询BandwidthPackageId。<br>设定该参数且InternetChargeType为BANDWIDTH_PACKAGE，则表示创建的EIP加入该BGP带宽包并采用带宽包计费。</p> 
     * @return BandwidthPackageId <p>带宽包唯一ID参数。可以使用<a href="https://cloud.tencent.com/document/product/215/19209">DescribeBandwidthPackages</a>接口查询BandwidthPackageId。<br>设定该参数且InternetChargeType为BANDWIDTH_PACKAGE，则表示创建的EIP加入该BGP带宽包并采用带宽包计费。</p>
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set <p>带宽包唯一ID参数。可以使用<a href="https://cloud.tencent.com/document/product/215/19209">DescribeBandwidthPackages</a>接口查询BandwidthPackageId。<br>设定该参数且InternetChargeType为BANDWIDTH_PACKAGE，则表示创建的EIP加入该BGP带宽包并采用带宽包计费。</p>
     * @param BandwidthPackageId <p>带宽包唯一ID参数。可以使用<a href="https://cloud.tencent.com/document/product/215/19209">DescribeBandwidthPackages</a>接口查询BandwidthPackageId。<br>设定该参数且InternetChargeType为BANDWIDTH_PACKAGE，则表示创建的EIP加入该BGP带宽包并采用带宽包计费。</p>
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Get <p>需要关联的标签列表。</p> 
     * @return Tags <p>需要关联的标签列表。</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>需要关联的标签列表。</p>
     * @param Tags <p>需要关联的标签列表。</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>弹性公网IPv6网络出口，可选值：</p><ul><li>CENTER_EGRESS_1：中心出口一</li><li>CENTER_EGRESS_2：中心出口二<br>注意：不同地域支持的线路类型、网络出口略有差异，请以控制台展示为准。</li></ul><p>默认值：CENTER_EGRESS_1</p> 
     * @return Egress <p>弹性公网IPv6网络出口，可选值：</p><ul><li>CENTER_EGRESS_1：中心出口一</li><li>CENTER_EGRESS_2：中心出口二<br>注意：不同地域支持的线路类型、网络出口略有差异，请以控制台展示为准。</li></ul><p>默认值：CENTER_EGRESS_1</p>
     */
    public String getEgress() {
        return this.Egress;
    }

    /**
     * Set <p>弹性公网IPv6网络出口，可选值：</p><ul><li>CENTER_EGRESS_1：中心出口一</li><li>CENTER_EGRESS_2：中心出口二<br>注意：不同地域支持的线路类型、网络出口略有差异，请以控制台展示为准。</li></ul><p>默认值：CENTER_EGRESS_1</p>
     * @param Egress <p>弹性公网IPv6网络出口，可选值：</p><ul><li>CENTER_EGRESS_1：中心出口一</li><li>CENTER_EGRESS_2：中心出口二<br>注意：不同地域支持的线路类型、网络出口略有差异，请以控制台展示为准。</li></ul><p>默认值：CENTER_EGRESS_1</p>
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

