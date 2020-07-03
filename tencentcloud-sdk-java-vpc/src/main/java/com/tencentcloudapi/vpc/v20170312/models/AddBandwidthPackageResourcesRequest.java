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

public class AddBandwidthPackageResourcesRequest extends AbstractModel{

    /**
    * 资源唯一ID，当前支持EIP资源和LB资源，形如'eip-xxxx', 'lb-xxxx'
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * 带宽包唯一标识ID，形如'bwp-xxxx'
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * 带宽包类型，当前支持'BGP'类型，表示内部资源是BGP IP。
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * 资源类型，包括'Address', 'LoadBalance'
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 带宽包协议类型。当前支持'ipv4'和'ipv6'协议类型。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
     * Get 资源唯一ID，当前支持EIP资源和LB资源，形如'eip-xxxx', 'lb-xxxx' 
     * @return ResourceIds 资源唯一ID，当前支持EIP资源和LB资源，形如'eip-xxxx', 'lb-xxxx'
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set 资源唯一ID，当前支持EIP资源和LB资源，形如'eip-xxxx', 'lb-xxxx'
     * @param ResourceIds 资源唯一ID，当前支持EIP资源和LB资源，形如'eip-xxxx', 'lb-xxxx'
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get 带宽包唯一标识ID，形如'bwp-xxxx' 
     * @return BandwidthPackageId 带宽包唯一标识ID，形如'bwp-xxxx'
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set 带宽包唯一标识ID，形如'bwp-xxxx'
     * @param BandwidthPackageId 带宽包唯一标识ID，形如'bwp-xxxx'
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Get 带宽包类型，当前支持'BGP'类型，表示内部资源是BGP IP。 
     * @return NetworkType 带宽包类型，当前支持'BGP'类型，表示内部资源是BGP IP。
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set 带宽包类型，当前支持'BGP'类型，表示内部资源是BGP IP。
     * @param NetworkType 带宽包类型，当前支持'BGP'类型，表示内部资源是BGP IP。
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get 资源类型，包括'Address', 'LoadBalance' 
     * @return ResourceType 资源类型，包括'Address', 'LoadBalance'
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型，包括'Address', 'LoadBalance'
     * @param ResourceType 资源类型，包括'Address', 'LoadBalance'
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 带宽包协议类型。当前支持'ipv4'和'ipv6'协议类型。 
     * @return Protocol 带宽包协议类型。当前支持'ipv4'和'ipv6'协议类型。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 带宽包协议类型。当前支持'ipv4'和'ipv6'协议类型。
     * @param Protocol 带宽包协议类型。当前支持'ipv4'和'ipv6'协议类型。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);

    }
}

