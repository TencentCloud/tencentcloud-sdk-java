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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EBPFEndpoint extends AbstractModel {

    /**
    * 目标 IP，支持 IPv4/IPv6
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * 目标端口（1-65535），为空表示仅按 IP 过滤
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
     * Get 目标 IP，支持 IPv4/IPv6 
     * @return IP 目标 IP，支持 IPv4/IPv6
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set 目标 IP，支持 IPv4/IPv6
     * @param IP 目标 IP，支持 IPv4/IPv6
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get 目标端口（1-65535），为空表示仅按 IP 过滤
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 目标端口（1-65535），为空表示仅按 IP 过滤
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 目标端口（1-65535），为空表示仅按 IP 过滤
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 目标端口（1-65535），为空表示仅按 IP 过滤
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    public EBPFEndpoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EBPFEndpoint(EBPFEndpoint source) {
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

