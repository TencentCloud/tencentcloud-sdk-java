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

public class RemoveBandwidthPackageResourcesRequest extends AbstractModel {

    /**
    * 资源唯一ID，当前支持EIP资源和LB资源，形如'eip-xxxx', 'lb-xxxx'。EIP资源列表可通过[DescribeAddresses](https://cloud.tencent.com/document/product/215/16702)接口获取，LB资源列表可通过[DescribeLoadBalancers](https://cloud.tencent.com/document/api/214/30685)接口获取。
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * 带宽包唯一标识ID，形如'bwp-xxxx'，可以使用[DescribeBandwidthPackages](https://cloud.tencent.com/document/product/215/19209)接口查询BandwidthPackageId。
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * 资源类型，可选值：
<li>Address：弹性公网IP</li>
<li>LoadBalance：负载均衡</li>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
     * Get 资源唯一ID，当前支持EIP资源和LB资源，形如'eip-xxxx', 'lb-xxxx'。EIP资源列表可通过[DescribeAddresses](https://cloud.tencent.com/document/product/215/16702)接口获取，LB资源列表可通过[DescribeLoadBalancers](https://cloud.tencent.com/document/api/214/30685)接口获取。 
     * @return ResourceIds 资源唯一ID，当前支持EIP资源和LB资源，形如'eip-xxxx', 'lb-xxxx'。EIP资源列表可通过[DescribeAddresses](https://cloud.tencent.com/document/product/215/16702)接口获取，LB资源列表可通过[DescribeLoadBalancers](https://cloud.tencent.com/document/api/214/30685)接口获取。
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set 资源唯一ID，当前支持EIP资源和LB资源，形如'eip-xxxx', 'lb-xxxx'。EIP资源列表可通过[DescribeAddresses](https://cloud.tencent.com/document/product/215/16702)接口获取，LB资源列表可通过[DescribeLoadBalancers](https://cloud.tencent.com/document/api/214/30685)接口获取。
     * @param ResourceIds 资源唯一ID，当前支持EIP资源和LB资源，形如'eip-xxxx', 'lb-xxxx'。EIP资源列表可通过[DescribeAddresses](https://cloud.tencent.com/document/product/215/16702)接口获取，LB资源列表可通过[DescribeLoadBalancers](https://cloud.tencent.com/document/api/214/30685)接口获取。
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get 带宽包唯一标识ID，形如'bwp-xxxx'，可以使用[DescribeBandwidthPackages](https://cloud.tencent.com/document/product/215/19209)接口查询BandwidthPackageId。 
     * @return BandwidthPackageId 带宽包唯一标识ID，形如'bwp-xxxx'，可以使用[DescribeBandwidthPackages](https://cloud.tencent.com/document/product/215/19209)接口查询BandwidthPackageId。
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set 带宽包唯一标识ID，形如'bwp-xxxx'，可以使用[DescribeBandwidthPackages](https://cloud.tencent.com/document/product/215/19209)接口查询BandwidthPackageId。
     * @param BandwidthPackageId 带宽包唯一标识ID，形如'bwp-xxxx'，可以使用[DescribeBandwidthPackages](https://cloud.tencent.com/document/product/215/19209)接口查询BandwidthPackageId。
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Get 资源类型，可选值：
<li>Address：弹性公网IP</li>
<li>LoadBalance：负载均衡</li> 
     * @return ResourceType 资源类型，可选值：
<li>Address：弹性公网IP</li>
<li>LoadBalance：负载均衡</li>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型，可选值：
<li>Address：弹性公网IP</li>
<li>LoadBalance：负载均衡</li>
     * @param ResourceType 资源类型，可选值：
<li>Address：弹性公网IP</li>
<li>LoadBalance：负载均衡</li>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    public RemoveBandwidthPackageResourcesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveBandwidthPackageResourcesRequest(RemoveBandwidthPackageResourcesRequest source) {
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
        if (source.BandwidthPackageId != null) {
            this.BandwidthPackageId = new String(source.BandwidthPackageId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);

    }
}

