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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrafficSandboxACLDstRule extends AbstractModel {

    /**
    * 目标 IP 列表
入参限制：每项支持三种格式：单个 IP（如 10.0.0.1）、网段（如 10.0.0.1/24）、IP 范围（如 10.0.0.1-10.0.2.0）
    */
    @SerializedName("DstIP")
    @Expose
    private String [] DstIP;

    /**
    * 排除的目标 IP 列表
入参限制：格式同 DstIP
    */
    @SerializedName("DstIPExcept")
    @Expose
    private String [] DstIPExcept;

    /**
    * 目标端口或端口范围
入参限制：单端口如 80，端口范围如 8000-9000
    */
    @SerializedName("DstPort")
    @Expose
    private String [] DstPort;

    /**
    * 排除的目标端口列表
入参限制：格式同 DstPort
    */
    @SerializedName("DstPortExcept")
    @Expose
    private String [] DstPortExcept;

    /**
     * Get 目标 IP 列表
入参限制：每项支持三种格式：单个 IP（如 10.0.0.1）、网段（如 10.0.0.1/24）、IP 范围（如 10.0.0.1-10.0.2.0） 
     * @return DstIP 目标 IP 列表
入参限制：每项支持三种格式：单个 IP（如 10.0.0.1）、网段（如 10.0.0.1/24）、IP 范围（如 10.0.0.1-10.0.2.0）
     */
    public String [] getDstIP() {
        return this.DstIP;
    }

    /**
     * Set 目标 IP 列表
入参限制：每项支持三种格式：单个 IP（如 10.0.0.1）、网段（如 10.0.0.1/24）、IP 范围（如 10.0.0.1-10.0.2.0）
     * @param DstIP 目标 IP 列表
入参限制：每项支持三种格式：单个 IP（如 10.0.0.1）、网段（如 10.0.0.1/24）、IP 范围（如 10.0.0.1-10.0.2.0）
     */
    public void setDstIP(String [] DstIP) {
        this.DstIP = DstIP;
    }

    /**
     * Get 排除的目标 IP 列表
入参限制：格式同 DstIP 
     * @return DstIPExcept 排除的目标 IP 列表
入参限制：格式同 DstIP
     */
    public String [] getDstIPExcept() {
        return this.DstIPExcept;
    }

    /**
     * Set 排除的目标 IP 列表
入参限制：格式同 DstIP
     * @param DstIPExcept 排除的目标 IP 列表
入参限制：格式同 DstIP
     */
    public void setDstIPExcept(String [] DstIPExcept) {
        this.DstIPExcept = DstIPExcept;
    }

    /**
     * Get 目标端口或端口范围
入参限制：单端口如 80，端口范围如 8000-9000 
     * @return DstPort 目标端口或端口范围
入参限制：单端口如 80，端口范围如 8000-9000
     */
    public String [] getDstPort() {
        return this.DstPort;
    }

    /**
     * Set 目标端口或端口范围
入参限制：单端口如 80，端口范围如 8000-9000
     * @param DstPort 目标端口或端口范围
入参限制：单端口如 80，端口范围如 8000-9000
     */
    public void setDstPort(String [] DstPort) {
        this.DstPort = DstPort;
    }

    /**
     * Get 排除的目标端口列表
入参限制：格式同 DstPort 
     * @return DstPortExcept 排除的目标端口列表
入参限制：格式同 DstPort
     */
    public String [] getDstPortExcept() {
        return this.DstPortExcept;
    }

    /**
     * Set 排除的目标端口列表
入参限制：格式同 DstPort
     * @param DstPortExcept 排除的目标端口列表
入参限制：格式同 DstPort
     */
    public void setDstPortExcept(String [] DstPortExcept) {
        this.DstPortExcept = DstPortExcept;
    }

    public TrafficSandboxACLDstRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficSandboxACLDstRule(TrafficSandboxACLDstRule source) {
        if (source.DstIP != null) {
            this.DstIP = new String[source.DstIP.length];
            for (int i = 0; i < source.DstIP.length; i++) {
                this.DstIP[i] = new String(source.DstIP[i]);
            }
        }
        if (source.DstIPExcept != null) {
            this.DstIPExcept = new String[source.DstIPExcept.length];
            for (int i = 0; i < source.DstIPExcept.length; i++) {
                this.DstIPExcept[i] = new String(source.DstIPExcept[i]);
            }
        }
        if (source.DstPort != null) {
            this.DstPort = new String[source.DstPort.length];
            for (int i = 0; i < source.DstPort.length; i++) {
                this.DstPort[i] = new String(source.DstPort[i]);
            }
        }
        if (source.DstPortExcept != null) {
            this.DstPortExcept = new String[source.DstPortExcept.length];
            for (int i = 0; i < source.DstPortExcept.length; i++) {
                this.DstPortExcept[i] = new String(source.DstPortExcept[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DstIP.", this.DstIP);
        this.setParamArraySimple(map, prefix + "DstIPExcept.", this.DstIPExcept);
        this.setParamArraySimple(map, prefix + "DstPort.", this.DstPort);
        this.setParamArraySimple(map, prefix + "DstPortExcept.", this.DstPortExcept);

    }
}

