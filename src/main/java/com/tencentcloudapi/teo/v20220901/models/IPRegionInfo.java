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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IPRegionInfo extends AbstractModel {

    /**
    * IP 地址，IPV4 或 IPV6。
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * IP 是否属于 EdgeOne 节点，取值有：
<li>yes：该 IP 属于 EdgeOne 节点；</li>
<li>no：该 IP 不属于 EdgeOne 节点。</li>
    */
    @SerializedName("IsEdgeOneIP")
    @Expose
    private String IsEdgeOneIP;

    /**
     * Get IP 地址，IPV4 或 IPV6。 
     * @return IP IP 地址，IPV4 或 IPV6。
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set IP 地址，IPV4 或 IPV6。
     * @param IP IP 地址，IPV4 或 IPV6。
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get IP 是否属于 EdgeOne 节点，取值有：
<li>yes：该 IP 属于 EdgeOne 节点；</li>
<li>no：该 IP 不属于 EdgeOne 节点。</li> 
     * @return IsEdgeOneIP IP 是否属于 EdgeOne 节点，取值有：
<li>yes：该 IP 属于 EdgeOne 节点；</li>
<li>no：该 IP 不属于 EdgeOne 节点。</li>
     */
    public String getIsEdgeOneIP() {
        return this.IsEdgeOneIP;
    }

    /**
     * Set IP 是否属于 EdgeOne 节点，取值有：
<li>yes：该 IP 属于 EdgeOne 节点；</li>
<li>no：该 IP 不属于 EdgeOne 节点。</li>
     * @param IsEdgeOneIP IP 是否属于 EdgeOne 节点，取值有：
<li>yes：该 IP 属于 EdgeOne 节点；</li>
<li>no：该 IP 不属于 EdgeOne 节点。</li>
     */
    public void setIsEdgeOneIP(String IsEdgeOneIP) {
        this.IsEdgeOneIP = IsEdgeOneIP;
    }

    public IPRegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPRegionInfo(IPRegionInfo source) {
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.IsEdgeOneIP != null) {
            this.IsEdgeOneIP = new String(source.IsEdgeOneIP);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "IsEdgeOneIP", this.IsEdgeOneIP);

    }
}

