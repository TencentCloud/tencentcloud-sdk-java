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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceCreateProxyRequest extends AbstractModel {

    /**
    * 加速区域名称。
    */
    @SerializedName("AccessRegion")
    @Expose
    private String AccessRegion;

    /**
    * 通道带宽上限，单位：Mbps。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * （旧参数，请切换到RealServerRegion）源站区域名称。
    */
    @SerializedName("DestRegion")
    @Expose
    private String DestRegion;

    /**
    * （此参数为旧参数，请填写新参数Concurrent，二者必须填写一个）通道并发量上限，表示同时在线的连接数，单位：万。
    */
    @SerializedName("Concurrency")
    @Expose
    private Long Concurrency;

    /**
    * （新参数）源站区域名称。
    */
    @SerializedName("RealServerRegion")
    @Expose
    private String RealServerRegion;

    /**
    * （新参数）通道并发量上限，表示同时在线的连接数，单位：万。
    */
    @SerializedName("Concurrent")
    @Expose
    private Long Concurrent;

    /**
    * 计费方式，0表示按带宽计费，1表示按流量计费。默认按带宽计费
    */
    @SerializedName("BillingType")
    @Expose
    private Long BillingType;

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
    * 通道套餐类型，Thunder表示标准通道组，Accelerator表示游戏加速器通道，CrossBorder表示跨境通道。
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * 该字段已废弃，当IPAddressVersion为IPv4时，所创建的通道默认支持Http3.0；当为IPv6，默认不支持Http3.0。
    */
    @SerializedName("Http3Supported")
    @Expose
    private Long Http3Supported;

    /**
     * Get 加速区域名称。 
     * @return AccessRegion 加速区域名称。
     */
    public String getAccessRegion() {
        return this.AccessRegion;
    }

    /**
     * Set 加速区域名称。
     * @param AccessRegion 加速区域名称。
     */
    public void setAccessRegion(String AccessRegion) {
        this.AccessRegion = AccessRegion;
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
     * Get （旧参数，请切换到RealServerRegion）源站区域名称。 
     * @return DestRegion （旧参数，请切换到RealServerRegion）源站区域名称。
     */
    public String getDestRegion() {
        return this.DestRegion;
    }

    /**
     * Set （旧参数，请切换到RealServerRegion）源站区域名称。
     * @param DestRegion （旧参数，请切换到RealServerRegion）源站区域名称。
     */
    public void setDestRegion(String DestRegion) {
        this.DestRegion = DestRegion;
    }

    /**
     * Get （此参数为旧参数，请填写新参数Concurrent，二者必须填写一个）通道并发量上限，表示同时在线的连接数，单位：万。 
     * @return Concurrency （此参数为旧参数，请填写新参数Concurrent，二者必须填写一个）通道并发量上限，表示同时在线的连接数，单位：万。
     */
    public Long getConcurrency() {
        return this.Concurrency;
    }

    /**
     * Set （此参数为旧参数，请填写新参数Concurrent，二者必须填写一个）通道并发量上限，表示同时在线的连接数，单位：万。
     * @param Concurrency （此参数为旧参数，请填写新参数Concurrent，二者必须填写一个）通道并发量上限，表示同时在线的连接数，单位：万。
     */
    public void setConcurrency(Long Concurrency) {
        this.Concurrency = Concurrency;
    }

    /**
     * Get （新参数）源站区域名称。 
     * @return RealServerRegion （新参数）源站区域名称。
     */
    public String getRealServerRegion() {
        return this.RealServerRegion;
    }

    /**
     * Set （新参数）源站区域名称。
     * @param RealServerRegion （新参数）源站区域名称。
     */
    public void setRealServerRegion(String RealServerRegion) {
        this.RealServerRegion = RealServerRegion;
    }

    /**
     * Get （新参数）通道并发量上限，表示同时在线的连接数，单位：万。 
     * @return Concurrent （新参数）通道并发量上限，表示同时在线的连接数，单位：万。
     */
    public Long getConcurrent() {
        return this.Concurrent;
    }

    /**
     * Set （新参数）通道并发量上限，表示同时在线的连接数，单位：万。
     * @param Concurrent （新参数）通道并发量上限，表示同时在线的连接数，单位：万。
     */
    public void setConcurrent(Long Concurrent) {
        this.Concurrent = Concurrent;
    }

    /**
     * Get 计费方式，0表示按带宽计费，1表示按流量计费。默认按带宽计费 
     * @return BillingType 计费方式，0表示按带宽计费，1表示按流量计费。默认按带宽计费
     */
    public Long getBillingType() {
        return this.BillingType;
    }

    /**
     * Set 计费方式，0表示按带宽计费，1表示按流量计费。默认按带宽计费
     * @param BillingType 计费方式，0表示按带宽计费，1表示按流量计费。默认按带宽计费
     */
    public void setBillingType(Long BillingType) {
        this.BillingType = BillingType;
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
     * Get 通道套餐类型，Thunder表示标准通道组，Accelerator表示游戏加速器通道，CrossBorder表示跨境通道。 
     * @return PackageType 通道套餐类型，Thunder表示标准通道组，Accelerator表示游戏加速器通道，CrossBorder表示跨境通道。
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set 通道套餐类型，Thunder表示标准通道组，Accelerator表示游戏加速器通道，CrossBorder表示跨境通道。
     * @param PackageType 通道套餐类型，Thunder表示标准通道组，Accelerator表示游戏加速器通道，CrossBorder表示跨境通道。
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get 该字段已废弃，当IPAddressVersion为IPv4时，所创建的通道默认支持Http3.0；当为IPv6，默认不支持Http3.0。 
     * @return Http3Supported 该字段已废弃，当IPAddressVersion为IPv4时，所创建的通道默认支持Http3.0；当为IPv6，默认不支持Http3.0。
     */
    public Long getHttp3Supported() {
        return this.Http3Supported;
    }

    /**
     * Set 该字段已废弃，当IPAddressVersion为IPv4时，所创建的通道默认支持Http3.0；当为IPv6，默认不支持Http3.0。
     * @param Http3Supported 该字段已废弃，当IPAddressVersion为IPv4时，所创建的通道默认支持Http3.0；当为IPv6，默认不支持Http3.0。
     */
    public void setHttp3Supported(Long Http3Supported) {
        this.Http3Supported = Http3Supported;
    }

    public InquiryPriceCreateProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceCreateProxyRequest(InquiryPriceCreateProxyRequest source) {
        if (source.AccessRegion != null) {
            this.AccessRegion = new String(source.AccessRegion);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.DestRegion != null) {
            this.DestRegion = new String(source.DestRegion);
        }
        if (source.Concurrency != null) {
            this.Concurrency = new Long(source.Concurrency);
        }
        if (source.RealServerRegion != null) {
            this.RealServerRegion = new String(source.RealServerRegion);
        }
        if (source.Concurrent != null) {
            this.Concurrent = new Long(source.Concurrent);
        }
        if (source.BillingType != null) {
            this.BillingType = new Long(source.BillingType);
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
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "DestRegion", this.DestRegion);
        this.setParamSimple(map, prefix + "Concurrency", this.Concurrency);
        this.setParamSimple(map, prefix + "RealServerRegion", this.RealServerRegion);
        this.setParamSimple(map, prefix + "Concurrent", this.Concurrent);
        this.setParamSimple(map, prefix + "BillingType", this.BillingType);
        this.setParamSimple(map, prefix + "IPAddressVersion", this.IPAddressVersion);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "Http3Supported", this.Http3Supported);

    }
}

