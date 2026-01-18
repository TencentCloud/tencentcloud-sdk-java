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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckProxyCreateRequest extends AbstractModel {

    /**
    * <p>通道的接入(加速)区域。取值可通过接口DescribeAccessRegionsByDestRegion获取到</p>
    */
    @SerializedName("AccessRegion")
    @Expose
    private String AccessRegion;

    /**
    * <p>通道的源站区域。取值可通过接口DescribeDestRegions获取到</p>
    */
    @SerializedName("RealServerRegion")
    @Expose
    private String RealServerRegion;

    /**
    * <p>通道带宽上限，单位：Mbps。</p>
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * <p>通道并发量上限，表示同时在线的连接数，单位：万。</p>
    */
    @SerializedName("Concurrent")
    @Expose
    private Long Concurrent;

    /**
    * <p>如果在通道组下创建通道，需要填写通道组的ID</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>IP版本，可取值：IPv4、IPv6，默认值IPv4</p>
    */
    @SerializedName("IPAddressVersion")
    @Expose
    private String IPAddressVersion;

    /**
    * <p>网络类型，可取值：normal、cn2，默认值normal</p>
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * <p>通道套餐类型。Thunder表示标准通道组，Accelerator表示游戏加速器通道，CrossBorder表示跨境通道。</p>
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * <p>该字段已废弃，当IPAddressVersion为IPv4时，所创建的通道默认支持Http3.0；当为IPv6，默认不支持Http3.0。</p>
    */
    @SerializedName("Http3Supported")
    @Expose
    private Long Http3Supported;

    /**
     * Get <p>通道的接入(加速)区域。取值可通过接口DescribeAccessRegionsByDestRegion获取到</p> 
     * @return AccessRegion <p>通道的接入(加速)区域。取值可通过接口DescribeAccessRegionsByDestRegion获取到</p>
     */
    public String getAccessRegion() {
        return this.AccessRegion;
    }

    /**
     * Set <p>通道的接入(加速)区域。取值可通过接口DescribeAccessRegionsByDestRegion获取到</p>
     * @param AccessRegion <p>通道的接入(加速)区域。取值可通过接口DescribeAccessRegionsByDestRegion获取到</p>
     */
    public void setAccessRegion(String AccessRegion) {
        this.AccessRegion = AccessRegion;
    }

    /**
     * Get <p>通道的源站区域。取值可通过接口DescribeDestRegions获取到</p> 
     * @return RealServerRegion <p>通道的源站区域。取值可通过接口DescribeDestRegions获取到</p>
     */
    public String getRealServerRegion() {
        return this.RealServerRegion;
    }

    /**
     * Set <p>通道的源站区域。取值可通过接口DescribeDestRegions获取到</p>
     * @param RealServerRegion <p>通道的源站区域。取值可通过接口DescribeDestRegions获取到</p>
     */
    public void setRealServerRegion(String RealServerRegion) {
        this.RealServerRegion = RealServerRegion;
    }

    /**
     * Get <p>通道带宽上限，单位：Mbps。</p> 
     * @return Bandwidth <p>通道带宽上限，单位：Mbps。</p>
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set <p>通道带宽上限，单位：Mbps。</p>
     * @param Bandwidth <p>通道带宽上限，单位：Mbps。</p>
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get <p>通道并发量上限，表示同时在线的连接数，单位：万。</p> 
     * @return Concurrent <p>通道并发量上限，表示同时在线的连接数，单位：万。</p>
     */
    public Long getConcurrent() {
        return this.Concurrent;
    }

    /**
     * Set <p>通道并发量上限，表示同时在线的连接数，单位：万。</p>
     * @param Concurrent <p>通道并发量上限，表示同时在线的连接数，单位：万。</p>
     */
    public void setConcurrent(Long Concurrent) {
        this.Concurrent = Concurrent;
    }

    /**
     * Get <p>如果在通道组下创建通道，需要填写通道组的ID</p> 
     * @return GroupId <p>如果在通道组下创建通道，需要填写通道组的ID</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>如果在通道组下创建通道，需要填写通道组的ID</p>
     * @param GroupId <p>如果在通道组下创建通道，需要填写通道组的ID</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>IP版本，可取值：IPv4、IPv6，默认值IPv4</p> 
     * @return IPAddressVersion <p>IP版本，可取值：IPv4、IPv6，默认值IPv4</p>
     */
    public String getIPAddressVersion() {
        return this.IPAddressVersion;
    }

    /**
     * Set <p>IP版本，可取值：IPv4、IPv6，默认值IPv4</p>
     * @param IPAddressVersion <p>IP版本，可取值：IPv4、IPv6，默认值IPv4</p>
     */
    public void setIPAddressVersion(String IPAddressVersion) {
        this.IPAddressVersion = IPAddressVersion;
    }

    /**
     * Get <p>网络类型，可取值：normal、cn2，默认值normal</p> 
     * @return NetworkType <p>网络类型，可取值：normal、cn2，默认值normal</p>
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set <p>网络类型，可取值：normal、cn2，默认值normal</p>
     * @param NetworkType <p>网络类型，可取值：normal、cn2，默认值normal</p>
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get <p>通道套餐类型。Thunder表示标准通道组，Accelerator表示游戏加速器通道，CrossBorder表示跨境通道。</p> 
     * @return PackageType <p>通道套餐类型。Thunder表示标准通道组，Accelerator表示游戏加速器通道，CrossBorder表示跨境通道。</p>
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set <p>通道套餐类型。Thunder表示标准通道组，Accelerator表示游戏加速器通道，CrossBorder表示跨境通道。</p>
     * @param PackageType <p>通道套餐类型。Thunder表示标准通道组，Accelerator表示游戏加速器通道，CrossBorder表示跨境通道。</p>
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get <p>该字段已废弃，当IPAddressVersion为IPv4时，所创建的通道默认支持Http3.0；当为IPv6，默认不支持Http3.0。</p> 
     * @return Http3Supported <p>该字段已废弃，当IPAddressVersion为IPv4时，所创建的通道默认支持Http3.0；当为IPv6，默认不支持Http3.0。</p>
     */
    public Long getHttp3Supported() {
        return this.Http3Supported;
    }

    /**
     * Set <p>该字段已废弃，当IPAddressVersion为IPv4时，所创建的通道默认支持Http3.0；当为IPv6，默认不支持Http3.0。</p>
     * @param Http3Supported <p>该字段已废弃，当IPAddressVersion为IPv4时，所创建的通道默认支持Http3.0；当为IPv6，默认不支持Http3.0。</p>
     */
    public void setHttp3Supported(Long Http3Supported) {
        this.Http3Supported = Http3Supported;
    }

    public CheckProxyCreateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckProxyCreateRequest(CheckProxyCreateRequest source) {
        if (source.AccessRegion != null) {
            this.AccessRegion = new String(source.AccessRegion);
        }
        if (source.RealServerRegion != null) {
            this.RealServerRegion = new String(source.RealServerRegion);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.Concurrent != null) {
            this.Concurrent = new Long(source.Concurrent);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.IPAddressVersion != null) {
            this.IPAddressVersion = new String(source.IPAddressVersion);
        }
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.Http3Supported != null) {
            this.Http3Supported = new Long(source.Http3Supported);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessRegion", this.AccessRegion);
        this.setParamSimple(map, prefix + "RealServerRegion", this.RealServerRegion);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Concurrent", this.Concurrent);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "IPAddressVersion", this.IPAddressVersion);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "Http3Supported", this.Http3Supported);

    }
}

