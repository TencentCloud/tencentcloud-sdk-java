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

public class ModifyNetDetectRequest extends AbstractModel {

    /**
    * 网络探测实例`ID`。形如：`netd-12345678`
    */
    @SerializedName("NetDetectId")
    @Expose
    private String NetDetectId;

    /**
    * 网络探测名称，最大长度不能超过60个字节。
    */
    @SerializedName("NetDetectName")
    @Expose
    private String NetDetectName;

    /**
    * 探测目的IPv4地址数组，最多两个。
    */
    @SerializedName("DetectDestinationIp")
    @Expose
    private String [] DetectDestinationIp;

    /**
    * 下一跳类型，目前我们支持的类型有：
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
NAT：NAT网关；
NORMAL_CVM：普通云服务器；
CCN：云联网网关；
NONEXTHOP：无下一跳；
    */
    @SerializedName("NextHopType")
    @Expose
    private String NextHopType;

    /**
    * 下一跳目的网关，取值与“下一跳类型”相关：
下一跳类型为VPN，取值VPN网关ID，形如：vpngw-12345678；
下一跳类型为DIRECTCONNECT，取值专线网关ID，形如：dcg-12345678；
下一跳类型为PEERCONNECTION，取值对等连接ID，形如：pcx-12345678；
下一跳类型为NAT，取值Nat网关，形如：nat-12345678；
下一跳类型为NORMAL_CVM，取值云服务器IPv4地址，形如：10.0.0.12；
下一跳类型为CCN，取值云联网ID，形如：ccn-12345678；
下一跳类型为NONEXTHOP，指定网络探测为无下一跳的网络探测；
    */
    @SerializedName("NextHopDestination")
    @Expose
    private String NextHopDestination;

    /**
    * 网络探测描述。
    */
    @SerializedName("NetDetectDescription")
    @Expose
    private String NetDetectDescription;

    /**
     * Get 网络探测实例`ID`。形如：`netd-12345678` 
     * @return NetDetectId 网络探测实例`ID`。形如：`netd-12345678`
     */
    public String getNetDetectId() {
        return this.NetDetectId;
    }

    /**
     * Set 网络探测实例`ID`。形如：`netd-12345678`
     * @param NetDetectId 网络探测实例`ID`。形如：`netd-12345678`
     */
    public void setNetDetectId(String NetDetectId) {
        this.NetDetectId = NetDetectId;
    }

    /**
     * Get 网络探测名称，最大长度不能超过60个字节。 
     * @return NetDetectName 网络探测名称，最大长度不能超过60个字节。
     */
    public String getNetDetectName() {
        return this.NetDetectName;
    }

    /**
     * Set 网络探测名称，最大长度不能超过60个字节。
     * @param NetDetectName 网络探测名称，最大长度不能超过60个字节。
     */
    public void setNetDetectName(String NetDetectName) {
        this.NetDetectName = NetDetectName;
    }

    /**
     * Get 探测目的IPv4地址数组，最多两个。 
     * @return DetectDestinationIp 探测目的IPv4地址数组，最多两个。
     */
    public String [] getDetectDestinationIp() {
        return this.DetectDestinationIp;
    }

    /**
     * Set 探测目的IPv4地址数组，最多两个。
     * @param DetectDestinationIp 探测目的IPv4地址数组，最多两个。
     */
    public void setDetectDestinationIp(String [] DetectDestinationIp) {
        this.DetectDestinationIp = DetectDestinationIp;
    }

    /**
     * Get 下一跳类型，目前我们支持的类型有：
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
NAT：NAT网关；
NORMAL_CVM：普通云服务器；
CCN：云联网网关；
NONEXTHOP：无下一跳； 
     * @return NextHopType 下一跳类型，目前我们支持的类型有：
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
NAT：NAT网关；
NORMAL_CVM：普通云服务器；
CCN：云联网网关；
NONEXTHOP：无下一跳；
     */
    public String getNextHopType() {
        return this.NextHopType;
    }

    /**
     * Set 下一跳类型，目前我们支持的类型有：
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
NAT：NAT网关；
NORMAL_CVM：普通云服务器；
CCN：云联网网关；
NONEXTHOP：无下一跳；
     * @param NextHopType 下一跳类型，目前我们支持的类型有：
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
NAT：NAT网关；
NORMAL_CVM：普通云服务器；
CCN：云联网网关；
NONEXTHOP：无下一跳；
     */
    public void setNextHopType(String NextHopType) {
        this.NextHopType = NextHopType;
    }

    /**
     * Get 下一跳目的网关，取值与“下一跳类型”相关：
下一跳类型为VPN，取值VPN网关ID，形如：vpngw-12345678；
下一跳类型为DIRECTCONNECT，取值专线网关ID，形如：dcg-12345678；
下一跳类型为PEERCONNECTION，取值对等连接ID，形如：pcx-12345678；
下一跳类型为NAT，取值Nat网关，形如：nat-12345678；
下一跳类型为NORMAL_CVM，取值云服务器IPv4地址，形如：10.0.0.12；
下一跳类型为CCN，取值云联网ID，形如：ccn-12345678；
下一跳类型为NONEXTHOP，指定网络探测为无下一跳的网络探测； 
     * @return NextHopDestination 下一跳目的网关，取值与“下一跳类型”相关：
下一跳类型为VPN，取值VPN网关ID，形如：vpngw-12345678；
下一跳类型为DIRECTCONNECT，取值专线网关ID，形如：dcg-12345678；
下一跳类型为PEERCONNECTION，取值对等连接ID，形如：pcx-12345678；
下一跳类型为NAT，取值Nat网关，形如：nat-12345678；
下一跳类型为NORMAL_CVM，取值云服务器IPv4地址，形如：10.0.0.12；
下一跳类型为CCN，取值云联网ID，形如：ccn-12345678；
下一跳类型为NONEXTHOP，指定网络探测为无下一跳的网络探测；
     */
    public String getNextHopDestination() {
        return this.NextHopDestination;
    }

    /**
     * Set 下一跳目的网关，取值与“下一跳类型”相关：
下一跳类型为VPN，取值VPN网关ID，形如：vpngw-12345678；
下一跳类型为DIRECTCONNECT，取值专线网关ID，形如：dcg-12345678；
下一跳类型为PEERCONNECTION，取值对等连接ID，形如：pcx-12345678；
下一跳类型为NAT，取值Nat网关，形如：nat-12345678；
下一跳类型为NORMAL_CVM，取值云服务器IPv4地址，形如：10.0.0.12；
下一跳类型为CCN，取值云联网ID，形如：ccn-12345678；
下一跳类型为NONEXTHOP，指定网络探测为无下一跳的网络探测；
     * @param NextHopDestination 下一跳目的网关，取值与“下一跳类型”相关：
下一跳类型为VPN，取值VPN网关ID，形如：vpngw-12345678；
下一跳类型为DIRECTCONNECT，取值专线网关ID，形如：dcg-12345678；
下一跳类型为PEERCONNECTION，取值对等连接ID，形如：pcx-12345678；
下一跳类型为NAT，取值Nat网关，形如：nat-12345678；
下一跳类型为NORMAL_CVM，取值云服务器IPv4地址，形如：10.0.0.12；
下一跳类型为CCN，取值云联网ID，形如：ccn-12345678；
下一跳类型为NONEXTHOP，指定网络探测为无下一跳的网络探测；
     */
    public void setNextHopDestination(String NextHopDestination) {
        this.NextHopDestination = NextHopDestination;
    }

    /**
     * Get 网络探测描述。 
     * @return NetDetectDescription 网络探测描述。
     */
    public String getNetDetectDescription() {
        return this.NetDetectDescription;
    }

    /**
     * Set 网络探测描述。
     * @param NetDetectDescription 网络探测描述。
     */
    public void setNetDetectDescription(String NetDetectDescription) {
        this.NetDetectDescription = NetDetectDescription;
    }

    public ModifyNetDetectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNetDetectRequest(ModifyNetDetectRequest source) {
        if (source.NetDetectId != null) {
            this.NetDetectId = new String(source.NetDetectId);
        }
        if (source.NetDetectName != null) {
            this.NetDetectName = new String(source.NetDetectName);
        }
        if (source.DetectDestinationIp != null) {
            this.DetectDestinationIp = new String[source.DetectDestinationIp.length];
            for (int i = 0; i < source.DetectDestinationIp.length; i++) {
                this.DetectDestinationIp[i] = new String(source.DetectDestinationIp[i]);
            }
        }
        if (source.NextHopType != null) {
            this.NextHopType = new String(source.NextHopType);
        }
        if (source.NextHopDestination != null) {
            this.NextHopDestination = new String(source.NextHopDestination);
        }
        if (source.NetDetectDescription != null) {
            this.NetDetectDescription = new String(source.NetDetectDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetDetectId", this.NetDetectId);
        this.setParamSimple(map, prefix + "NetDetectName", this.NetDetectName);
        this.setParamArraySimple(map, prefix + "DetectDestinationIp.", this.DetectDestinationIp);
        this.setParamSimple(map, prefix + "NextHopType", this.NextHopType);
        this.setParamSimple(map, prefix + "NextHopDestination", this.NextHopDestination);
        this.setParamSimple(map, prefix + "NetDetectDescription", this.NetDetectDescription);

    }
}

