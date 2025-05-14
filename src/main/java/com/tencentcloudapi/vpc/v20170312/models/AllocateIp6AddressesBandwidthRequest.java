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

public class AllocateIp6AddressesBandwidthRequest extends AbstractModel {

    /**
    * 需要开通公网访问能力的IPv6地址，可以使用[DescribeIp6Addresses](https://cloud.tencent.com/document/product/215/40089)接口查询Ip6Addresses。

    */
    @SerializedName("Ip6Addresses")
    @Expose
    private String [] Ip6Addresses;

    /**
    * 带宽上限，单位Mbps。可调整的带宽上限值参考产品文档中[IPv6 计费限制说明](https://cloud.tencent.com/document/product/1142/38369#IPv6)。
默认值：1Mbps
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * 网络计费模式。IPv6当前支持：<li>TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费</li><li>BANDWIDTH_PACKAGE：共享带宽包付费</li>
默认值：TRAFFIC_POSTPAID_BY_HOUR
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * 带宽包id，设定该参数且InternetChargeType为BANDWIDTH_PACKAGE，则表示创建的IPv6加入该带宽包并采用带宽包计费。可以使用[DescribeBandwidthPackages](https://cloud.tencent.com/document/product/215/19209)接口查询BandwidthPackageId。
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
     * Get 需要开通公网访问能力的IPv6地址，可以使用[DescribeIp6Addresses](https://cloud.tencent.com/document/product/215/40089)接口查询Ip6Addresses。
 
     * @return Ip6Addresses 需要开通公网访问能力的IPv6地址，可以使用[DescribeIp6Addresses](https://cloud.tencent.com/document/product/215/40089)接口查询Ip6Addresses。

     */
    public String [] getIp6Addresses() {
        return this.Ip6Addresses;
    }

    /**
     * Set 需要开通公网访问能力的IPv6地址，可以使用[DescribeIp6Addresses](https://cloud.tencent.com/document/product/215/40089)接口查询Ip6Addresses。

     * @param Ip6Addresses 需要开通公网访问能力的IPv6地址，可以使用[DescribeIp6Addresses](https://cloud.tencent.com/document/product/215/40089)接口查询Ip6Addresses。

     */
    public void setIp6Addresses(String [] Ip6Addresses) {
        this.Ip6Addresses = Ip6Addresses;
    }

    /**
     * Get 带宽上限，单位Mbps。可调整的带宽上限值参考产品文档中[IPv6 计费限制说明](https://cloud.tencent.com/document/product/1142/38369#IPv6)。
默认值：1Mbps 
     * @return InternetMaxBandwidthOut 带宽上限，单位Mbps。可调整的带宽上限值参考产品文档中[IPv6 计费限制说明](https://cloud.tencent.com/document/product/1142/38369#IPv6)。
默认值：1Mbps
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 带宽上限，单位Mbps。可调整的带宽上限值参考产品文档中[IPv6 计费限制说明](https://cloud.tencent.com/document/product/1142/38369#IPv6)。
默认值：1Mbps
     * @param InternetMaxBandwidthOut 带宽上限，单位Mbps。可调整的带宽上限值参考产品文档中[IPv6 计费限制说明](https://cloud.tencent.com/document/product/1142/38369#IPv6)。
默认值：1Mbps
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get 网络计费模式。IPv6当前支持：<li>TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费</li><li>BANDWIDTH_PACKAGE：共享带宽包付费</li>
默认值：TRAFFIC_POSTPAID_BY_HOUR 
     * @return InternetChargeType 网络计费模式。IPv6当前支持：<li>TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费</li><li>BANDWIDTH_PACKAGE：共享带宽包付费</li>
默认值：TRAFFIC_POSTPAID_BY_HOUR
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set 网络计费模式。IPv6当前支持：<li>TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费</li><li>BANDWIDTH_PACKAGE：共享带宽包付费</li>
默认值：TRAFFIC_POSTPAID_BY_HOUR
     * @param InternetChargeType 网络计费模式。IPv6当前支持：<li>TRAFFIC_POSTPAID_BY_HOUR：流量按小时后付费</li><li>BANDWIDTH_PACKAGE：共享带宽包付费</li>
默认值：TRAFFIC_POSTPAID_BY_HOUR
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Get 带宽包id，设定该参数且InternetChargeType为BANDWIDTH_PACKAGE，则表示创建的IPv6加入该带宽包并采用带宽包计费。可以使用[DescribeBandwidthPackages](https://cloud.tencent.com/document/product/215/19209)接口查询BandwidthPackageId。 
     * @return BandwidthPackageId 带宽包id，设定该参数且InternetChargeType为BANDWIDTH_PACKAGE，则表示创建的IPv6加入该带宽包并采用带宽包计费。可以使用[DescribeBandwidthPackages](https://cloud.tencent.com/document/product/215/19209)接口查询BandwidthPackageId。
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set 带宽包id，设定该参数且InternetChargeType为BANDWIDTH_PACKAGE，则表示创建的IPv6加入该带宽包并采用带宽包计费。可以使用[DescribeBandwidthPackages](https://cloud.tencent.com/document/product/215/19209)接口查询BandwidthPackageId。
     * @param BandwidthPackageId 带宽包id，设定该参数且InternetChargeType为BANDWIDTH_PACKAGE，则表示创建的IPv6加入该带宽包并采用带宽包计费。可以使用[DescribeBandwidthPackages](https://cloud.tencent.com/document/product/215/19209)接口查询BandwidthPackageId。
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
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
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
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

