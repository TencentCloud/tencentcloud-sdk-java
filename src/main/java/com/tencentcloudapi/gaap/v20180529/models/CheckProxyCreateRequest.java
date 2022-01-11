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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckProxyCreateRequest extends AbstractModel{

    /**
    * 通道的接入(加速)区域。取值可通过接口DescribeAccessRegionsByDestRegion获取到
    */
    @SerializedName("AccessRegion")
    @Expose
    private String AccessRegion;

    /**
    * 通道的源站区域。取值可通过接口DescribeDestRegions获取到
    */
    @SerializedName("RealServerRegion")
    @Expose
    private String RealServerRegion;

    /**
    * 通道带宽上限，单位：Mbps。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 通道并发量上限，表示同时在线的连接数，单位：万。
    */
    @SerializedName("Concurrent")
    @Expose
    private Long Concurrent;

    /**
    * 如果在通道组下创建通道，需要填写通道组的ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * IP版本，可取值：IPv4、IPv6，默认值IPv4
    */
    @SerializedName("IPAddressVersion")
    @Expose
    private String IPAddressVersion;

    /**
    * 网络类型，可取值：normal、cn2，默认值normal
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * 通道套餐类型。Thunder表示标准通道组，Accelerator表示游戏加速器通道，CrossBorder表示跨境通道。
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * 支持Http3的开关，其中：0，表示不需要支持Http3接入；1，表示需要支持Http3接入。注意：如果开启了Http3的功能，那么该通道就不再支持TCP/UDP接入的功能。该功能的启停无法在通道创建完毕后再修改。
    */
    @SerializedName("Http3Supported")
    @Expose
    private Long Http3Supported;

    /**
     * Get 通道的接入(加速)区域。取值可通过接口DescribeAccessRegionsByDestRegion获取到 
     * @return AccessRegion 通道的接入(加速)区域。取值可通过接口DescribeAccessRegionsByDestRegion获取到
     */
    public String getAccessRegion() {
        return this.AccessRegion;
    }

    /**
     * Set 通道的接入(加速)区域。取值可通过接口DescribeAccessRegionsByDestRegion获取到
     * @param AccessRegion 通道的接入(加速)区域。取值可通过接口DescribeAccessRegionsByDestRegion获取到
     */
    public void setAccessRegion(String AccessRegion) {
        this.AccessRegion = AccessRegion;
    }

    /**
     * Get 通道的源站区域。取值可通过接口DescribeDestRegions获取到 
     * @return RealServerRegion 通道的源站区域。取值可通过接口DescribeDestRegions获取到
     */
    public String getRealServerRegion() {
        return this.RealServerRegion;
    }

    /**
     * Set 通道的源站区域。取值可通过接口DescribeDestRegions获取到
     * @param RealServerRegion 通道的源站区域。取值可通过接口DescribeDestRegions获取到
     */
    public void setRealServerRegion(String RealServerRegion) {
        this.RealServerRegion = RealServerRegion;
    }

    /**
     * Get 通道带宽上限，单位：Mbps。 
     * @return Bandwidth 通道带宽上限，单位：Mbps。
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 通道带宽上限，单位：Mbps。
     * @param Bandwidth 通道带宽上限，单位：Mbps。
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 通道并发量上限，表示同时在线的连接数，单位：万。 
     * @return Concurrent 通道并发量上限，表示同时在线的连接数，单位：万。
     */
    public Long getConcurrent() {
        return this.Concurrent;
    }

    /**
     * Set 通道并发量上限，表示同时在线的连接数，单位：万。
     * @param Concurrent 通道并发量上限，表示同时在线的连接数，单位：万。
     */
    public void setConcurrent(Long Concurrent) {
        this.Concurrent = Concurrent;
    }

    /**
     * Get 如果在通道组下创建通道，需要填写通道组的ID 
     * @return GroupId 如果在通道组下创建通道，需要填写通道组的ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 如果在通道组下创建通道，需要填写通道组的ID
     * @param GroupId 如果在通道组下创建通道，需要填写通道组的ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get IP版本，可取值：IPv4、IPv6，默认值IPv4 
     * @return IPAddressVersion IP版本，可取值：IPv4、IPv6，默认值IPv4
     */
    public String getIPAddressVersion() {
        return this.IPAddressVersion;
    }

    /**
     * Set IP版本，可取值：IPv4、IPv6，默认值IPv4
     * @param IPAddressVersion IP版本，可取值：IPv4、IPv6，默认值IPv4
     */
    public void setIPAddressVersion(String IPAddressVersion) {
        this.IPAddressVersion = IPAddressVersion;
    }

    /**
     * Get 网络类型，可取值：normal、cn2，默认值normal 
     * @return NetworkType 网络类型，可取值：normal、cn2，默认值normal
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set 网络类型，可取值：normal、cn2，默认值normal
     * @param NetworkType 网络类型，可取值：normal、cn2，默认值normal
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get 通道套餐类型。Thunder表示标准通道组，Accelerator表示游戏加速器通道，CrossBorder表示跨境通道。 
     * @return PackageType 通道套餐类型。Thunder表示标准通道组，Accelerator表示游戏加速器通道，CrossBorder表示跨境通道。
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set 通道套餐类型。Thunder表示标准通道组，Accelerator表示游戏加速器通道，CrossBorder表示跨境通道。
     * @param PackageType 通道套餐类型。Thunder表示标准通道组，Accelerator表示游戏加速器通道，CrossBorder表示跨境通道。
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get 支持Http3的开关，其中：0，表示不需要支持Http3接入；1，表示需要支持Http3接入。注意：如果开启了Http3的功能，那么该通道就不再支持TCP/UDP接入的功能。该功能的启停无法在通道创建完毕后再修改。 
     * @return Http3Supported 支持Http3的开关，其中：0，表示不需要支持Http3接入；1，表示需要支持Http3接入。注意：如果开启了Http3的功能，那么该通道就不再支持TCP/UDP接入的功能。该功能的启停无法在通道创建完毕后再修改。
     */
    public Long getHttp3Supported() {
        return this.Http3Supported;
    }

    /**
     * Set 支持Http3的开关，其中：0，表示不需要支持Http3接入；1，表示需要支持Http3接入。注意：如果开启了Http3的功能，那么该通道就不再支持TCP/UDP接入的功能。该功能的启停无法在通道创建完毕后再修改。
     * @param Http3Supported 支持Http3的开关，其中：0，表示不需要支持Http3接入；1，表示需要支持Http3接入。注意：如果开启了Http3的功能，那么该通道就不再支持TCP/UDP接入的功能。该功能的启停无法在通道创建完毕后再修改。
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

