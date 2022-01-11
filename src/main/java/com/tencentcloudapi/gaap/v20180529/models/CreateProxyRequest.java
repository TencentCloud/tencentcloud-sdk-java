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

public class CreateProxyRequest extends AbstractModel{

    /**
    * 通道的项目ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 通道名称。
    */
    @SerializedName("ProxyName")
    @Expose
    private String ProxyName;

    /**
    * 接入地域。
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
    * 通道并发量上限，表示同时在线的连接数，单位：万。
    */
    @SerializedName("Concurrent")
    @Expose
    private Long Concurrent;

    /**
    * 源站地域。当GroupId存在时，源站地域为通道组的源站地域,此时可不填该字段。当GroupId不存在时，需要填写该字段
    */
    @SerializedName("RealServerRegion")
    @Expose
    private String RealServerRegion;

    /**
    * 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
更多详细信息请参阅：如何保证幂等性。
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 通道所在的通道组ID，当在通道组中创建通道时必带，否则忽略该字段。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 通道需要添加的标签列表。
    */
    @SerializedName("TagSet")
    @Expose
    private TagPair [] TagSet;

    /**
    * 被复制的通道ID。只有处于运行中状态的通道可以被复制。
当设置该参数时，表示复制该通道。
    */
    @SerializedName("ClonedProxyId")
    @Expose
    private String ClonedProxyId;

    /**
    * 计费方式 (0:按带宽计费，1:按流量计费 默认按带宽计费）
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
    * 网络类型，normal表示常规BGP，cn2表示精品BGP，triple表示三网
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
    * 支持Http3的开关，其中：0，表示不需要支持Http3接入；1，表示需要支持Http3接入。注意：如果开启了Http3的功能，那么该通道就不再支持TCP/UDP接入的功能。该功能的启停无法在通道创建完毕后再修改。
    */
    @SerializedName("Http3Supported")
    @Expose
    private Long Http3Supported;

    /**
     * Get 通道的项目ID。 
     * @return ProjectId 通道的项目ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 通道的项目ID。
     * @param ProjectId 通道的项目ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 通道名称。 
     * @return ProxyName 通道名称。
     */
    public String getProxyName() {
        return this.ProxyName;
    }

    /**
     * Set 通道名称。
     * @param ProxyName 通道名称。
     */
    public void setProxyName(String ProxyName) {
        this.ProxyName = ProxyName;
    }

    /**
     * Get 接入地域。 
     * @return AccessRegion 接入地域。
     */
    public String getAccessRegion() {
        return this.AccessRegion;
    }

    /**
     * Set 接入地域。
     * @param AccessRegion 接入地域。
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
     * Get 源站地域。当GroupId存在时，源站地域为通道组的源站地域,此时可不填该字段。当GroupId不存在时，需要填写该字段 
     * @return RealServerRegion 源站地域。当GroupId存在时，源站地域为通道组的源站地域,此时可不填该字段。当GroupId不存在时，需要填写该字段
     */
    public String getRealServerRegion() {
        return this.RealServerRegion;
    }

    /**
     * Set 源站地域。当GroupId存在时，源站地域为通道组的源站地域,此时可不填该字段。当GroupId不存在时，需要填写该字段
     * @param RealServerRegion 源站地域。当GroupId存在时，源站地域为通道组的源站地域,此时可不填该字段。当GroupId不存在时，需要填写该字段
     */
    public void setRealServerRegion(String RealServerRegion) {
        this.RealServerRegion = RealServerRegion;
    }

    /**
     * Get 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
更多详细信息请参阅：如何保证幂等性。 
     * @return ClientToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
更多详细信息请参阅：如何保证幂等性。
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
更多详细信息请参阅：如何保证幂等性。
     * @param ClientToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
更多详细信息请参阅：如何保证幂等性。
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get 通道所在的通道组ID，当在通道组中创建通道时必带，否则忽略该字段。 
     * @return GroupId 通道所在的通道组ID，当在通道组中创建通道时必带，否则忽略该字段。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 通道所在的通道组ID，当在通道组中创建通道时必带，否则忽略该字段。
     * @param GroupId 通道所在的通道组ID，当在通道组中创建通道时必带，否则忽略该字段。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 通道需要添加的标签列表。 
     * @return TagSet 通道需要添加的标签列表。
     */
    public TagPair [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 通道需要添加的标签列表。
     * @param TagSet 通道需要添加的标签列表。
     */
    public void setTagSet(TagPair [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get 被复制的通道ID。只有处于运行中状态的通道可以被复制。
当设置该参数时，表示复制该通道。 
     * @return ClonedProxyId 被复制的通道ID。只有处于运行中状态的通道可以被复制。
当设置该参数时，表示复制该通道。
     */
    public String getClonedProxyId() {
        return this.ClonedProxyId;
    }

    /**
     * Set 被复制的通道ID。只有处于运行中状态的通道可以被复制。
当设置该参数时，表示复制该通道。
     * @param ClonedProxyId 被复制的通道ID。只有处于运行中状态的通道可以被复制。
当设置该参数时，表示复制该通道。
     */
    public void setClonedProxyId(String ClonedProxyId) {
        this.ClonedProxyId = ClonedProxyId;
    }

    /**
     * Get 计费方式 (0:按带宽计费，1:按流量计费 默认按带宽计费） 
     * @return BillingType 计费方式 (0:按带宽计费，1:按流量计费 默认按带宽计费）
     */
    public Long getBillingType() {
        return this.BillingType;
    }

    /**
     * Set 计费方式 (0:按带宽计费，1:按流量计费 默认按带宽计费）
     * @param BillingType 计费方式 (0:按带宽计费，1:按流量计费 默认按带宽计费）
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
     * Get 网络类型，normal表示常规BGP，cn2表示精品BGP，triple表示三网 
     * @return NetworkType 网络类型，normal表示常规BGP，cn2表示精品BGP，triple表示三网
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set 网络类型，normal表示常规BGP，cn2表示精品BGP，triple表示三网
     * @param NetworkType 网络类型，normal表示常规BGP，cn2表示精品BGP，triple表示三网
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

    public CreateProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProxyRequest(CreateProxyRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ProxyName != null) {
            this.ProxyName = new String(source.ProxyName);
        }
        if (source.AccessRegion != null) {
            this.AccessRegion = new String(source.AccessRegion);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.Concurrent != null) {
            this.Concurrent = new Long(source.Concurrent);
        }
        if (source.RealServerRegion != null) {
            this.RealServerRegion = new String(source.RealServerRegion);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.TagSet != null) {
            this.TagSet = new TagPair[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new TagPair(source.TagSet[i]);
            }
        }
        if (source.ClonedProxyId != null) {
            this.ClonedProxyId = new String(source.ClonedProxyId);
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
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProxyName", this.ProxyName);
        this.setParamSimple(map, prefix + "AccessRegion", this.AccessRegion);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Concurrent", this.Concurrent);
        this.setParamSimple(map, prefix + "RealServerRegion", this.RealServerRegion);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "ClonedProxyId", this.ClonedProxyId);
        this.setParamSimple(map, prefix + "BillingType", this.BillingType);
        this.setParamSimple(map, prefix + "IPAddressVersion", this.IPAddressVersion);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "Http3Supported", this.Http3Supported);

    }
}

