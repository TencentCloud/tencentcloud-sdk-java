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

public class DescribeBandwidthPackagesRequest extends AbstractModel{

    /**
    * 带宽包唯一ID列表
    */
    @SerializedName("BandwidthPackageIds")
    @Expose
    private String [] BandwidthPackageIds;

    /**
    * 每次请求的`Filters`的上限为10。参数不支持同时指定`BandwidthPackageIds`和`Filters`。详细的过滤条件如下：
<li> bandwidth-package_id - String - 是否必填：否 - （过滤条件）按照带宽包的唯一标识ID过滤。</li>
<li> bandwidth-package-name - String - 是否必填：否 - （过滤条件）按照 带宽包名称过滤。不支持模糊过滤。</li>
<li> network-type - String - 是否必填：否 - （过滤条件）按照带宽包的类型过滤。类型包括'BGP','SINGLEISP'和'ANYCAST'。</li>
<li> charge-type - String - 是否必填：否 - （过滤条件）按照带宽包的计费类型过滤。计费类型包括'TOP5_POSTPAID_BY_MONTH'和'PERCENT95_POSTPAID_BY_MONTH'</li>
<li> resource.resource-type - String - 是否必填：否 - （过滤条件）按照带宽包资源类型过滤。资源类型包括'Address'和'LoadBalance'</li>
<li> resource.resource-id - String - 是否必填：否 - （过滤条件）按照带宽包资源Id过滤。资源Id形如'eip-xxxx','lb-xxxx'</li>
<li> resource.address-ip - String - 是否必填：否 - （过滤条件）按照带宽包资源Ip过滤。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 查询带宽包偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询带宽包数量限制
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 带宽包唯一ID列表 
     * @return BandwidthPackageIds 带宽包唯一ID列表
     */
    public String [] getBandwidthPackageIds() {
        return this.BandwidthPackageIds;
    }

    /**
     * Set 带宽包唯一ID列表
     * @param BandwidthPackageIds 带宽包唯一ID列表
     */
    public void setBandwidthPackageIds(String [] BandwidthPackageIds) {
        this.BandwidthPackageIds = BandwidthPackageIds;
    }

    /**
     * Get 每次请求的`Filters`的上限为10。参数不支持同时指定`BandwidthPackageIds`和`Filters`。详细的过滤条件如下：
<li> bandwidth-package_id - String - 是否必填：否 - （过滤条件）按照带宽包的唯一标识ID过滤。</li>
<li> bandwidth-package-name - String - 是否必填：否 - （过滤条件）按照 带宽包名称过滤。不支持模糊过滤。</li>
<li> network-type - String - 是否必填：否 - （过滤条件）按照带宽包的类型过滤。类型包括'BGP','SINGLEISP'和'ANYCAST'。</li>
<li> charge-type - String - 是否必填：否 - （过滤条件）按照带宽包的计费类型过滤。计费类型包括'TOP5_POSTPAID_BY_MONTH'和'PERCENT95_POSTPAID_BY_MONTH'</li>
<li> resource.resource-type - String - 是否必填：否 - （过滤条件）按照带宽包资源类型过滤。资源类型包括'Address'和'LoadBalance'</li>
<li> resource.resource-id - String - 是否必填：否 - （过滤条件）按照带宽包资源Id过滤。资源Id形如'eip-xxxx','lb-xxxx'</li>
<li> resource.address-ip - String - 是否必填：否 - （过滤条件）按照带宽包资源Ip过滤。</li> 
     * @return Filters 每次请求的`Filters`的上限为10。参数不支持同时指定`BandwidthPackageIds`和`Filters`。详细的过滤条件如下：
<li> bandwidth-package_id - String - 是否必填：否 - （过滤条件）按照带宽包的唯一标识ID过滤。</li>
<li> bandwidth-package-name - String - 是否必填：否 - （过滤条件）按照 带宽包名称过滤。不支持模糊过滤。</li>
<li> network-type - String - 是否必填：否 - （过滤条件）按照带宽包的类型过滤。类型包括'BGP','SINGLEISP'和'ANYCAST'。</li>
<li> charge-type - String - 是否必填：否 - （过滤条件）按照带宽包的计费类型过滤。计费类型包括'TOP5_POSTPAID_BY_MONTH'和'PERCENT95_POSTPAID_BY_MONTH'</li>
<li> resource.resource-type - String - 是否必填：否 - （过滤条件）按照带宽包资源类型过滤。资源类型包括'Address'和'LoadBalance'</li>
<li> resource.resource-id - String - 是否必填：否 - （过滤条件）按照带宽包资源Id过滤。资源Id形如'eip-xxxx','lb-xxxx'</li>
<li> resource.address-ip - String - 是否必填：否 - （过滤条件）按照带宽包资源Ip过滤。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 每次请求的`Filters`的上限为10。参数不支持同时指定`BandwidthPackageIds`和`Filters`。详细的过滤条件如下：
<li> bandwidth-package_id - String - 是否必填：否 - （过滤条件）按照带宽包的唯一标识ID过滤。</li>
<li> bandwidth-package-name - String - 是否必填：否 - （过滤条件）按照 带宽包名称过滤。不支持模糊过滤。</li>
<li> network-type - String - 是否必填：否 - （过滤条件）按照带宽包的类型过滤。类型包括'BGP','SINGLEISP'和'ANYCAST'。</li>
<li> charge-type - String - 是否必填：否 - （过滤条件）按照带宽包的计费类型过滤。计费类型包括'TOP5_POSTPAID_BY_MONTH'和'PERCENT95_POSTPAID_BY_MONTH'</li>
<li> resource.resource-type - String - 是否必填：否 - （过滤条件）按照带宽包资源类型过滤。资源类型包括'Address'和'LoadBalance'</li>
<li> resource.resource-id - String - 是否必填：否 - （过滤条件）按照带宽包资源Id过滤。资源Id形如'eip-xxxx','lb-xxxx'</li>
<li> resource.address-ip - String - 是否必填：否 - （过滤条件）按照带宽包资源Ip过滤。</li>
     * @param Filters 每次请求的`Filters`的上限为10。参数不支持同时指定`BandwidthPackageIds`和`Filters`。详细的过滤条件如下：
<li> bandwidth-package_id - String - 是否必填：否 - （过滤条件）按照带宽包的唯一标识ID过滤。</li>
<li> bandwidth-package-name - String - 是否必填：否 - （过滤条件）按照 带宽包名称过滤。不支持模糊过滤。</li>
<li> network-type - String - 是否必填：否 - （过滤条件）按照带宽包的类型过滤。类型包括'BGP','SINGLEISP'和'ANYCAST'。</li>
<li> charge-type - String - 是否必填：否 - （过滤条件）按照带宽包的计费类型过滤。计费类型包括'TOP5_POSTPAID_BY_MONTH'和'PERCENT95_POSTPAID_BY_MONTH'</li>
<li> resource.resource-type - String - 是否必填：否 - （过滤条件）按照带宽包资源类型过滤。资源类型包括'Address'和'LoadBalance'</li>
<li> resource.resource-id - String - 是否必填：否 - （过滤条件）按照带宽包资源Id过滤。资源Id形如'eip-xxxx','lb-xxxx'</li>
<li> resource.address-ip - String - 是否必填：否 - （过滤条件）按照带宽包资源Ip过滤。</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 查询带宽包偏移量 
     * @return Offset 查询带宽包偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询带宽包偏移量
     * @param Offset 查询带宽包偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询带宽包数量限制 
     * @return Limit 查询带宽包数量限制
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询带宽包数量限制
     * @param Limit 查询带宽包数量限制
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "BandwidthPackageIds.", this.BandwidthPackageIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

