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

public class ModifyNetworkInterfaceQosRequest extends AbstractModel {

    /**
    * 弹性网卡ID，支持批量修改。可通过[DescribeNetworkInterfaces](https://cloud.tencent.com/document/product/215/15817)接口获取。

    */
    @SerializedName("NetworkInterfaceIds")
    @Expose
    private String [] NetworkInterfaceIds;

    /**
    * 服务质量，可选值：PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。
    */
    @SerializedName("QosLevel")
    @Expose
    private String QosLevel;

    /**
    * DirectSend端口范围最大值。最大值: 65535。
    */
    @SerializedName("DirectSendMaxPort")
    @Expose
    private Long DirectSendMaxPort;

    /**
     * Get 弹性网卡ID，支持批量修改。可通过[DescribeNetworkInterfaces](https://cloud.tencent.com/document/product/215/15817)接口获取。
 
     * @return NetworkInterfaceIds 弹性网卡ID，支持批量修改。可通过[DescribeNetworkInterfaces](https://cloud.tencent.com/document/product/215/15817)接口获取。

     */
    public String [] getNetworkInterfaceIds() {
        return this.NetworkInterfaceIds;
    }

    /**
     * Set 弹性网卡ID，支持批量修改。可通过[DescribeNetworkInterfaces](https://cloud.tencent.com/document/product/215/15817)接口获取。

     * @param NetworkInterfaceIds 弹性网卡ID，支持批量修改。可通过[DescribeNetworkInterfaces](https://cloud.tencent.com/document/product/215/15817)接口获取。

     */
    public void setNetworkInterfaceIds(String [] NetworkInterfaceIds) {
        this.NetworkInterfaceIds = NetworkInterfaceIds;
    }

    /**
     * Get 服务质量，可选值：PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。 
     * @return QosLevel 服务质量，可选值：PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。
     */
    public String getQosLevel() {
        return this.QosLevel;
    }

    /**
     * Set 服务质量，可选值：PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。
     * @param QosLevel 服务质量，可选值：PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。
     */
    public void setQosLevel(String QosLevel) {
        this.QosLevel = QosLevel;
    }

    /**
     * Get DirectSend端口范围最大值。最大值: 65535。 
     * @return DirectSendMaxPort DirectSend端口范围最大值。最大值: 65535。
     */
    public Long getDirectSendMaxPort() {
        return this.DirectSendMaxPort;
    }

    /**
     * Set DirectSend端口范围最大值。最大值: 65535。
     * @param DirectSendMaxPort DirectSend端口范围最大值。最大值: 65535。
     */
    public void setDirectSendMaxPort(Long DirectSendMaxPort) {
        this.DirectSendMaxPort = DirectSendMaxPort;
    }

    public ModifyNetworkInterfaceQosRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNetworkInterfaceQosRequest(ModifyNetworkInterfaceQosRequest source) {
        if (source.NetworkInterfaceIds != null) {
            this.NetworkInterfaceIds = new String[source.NetworkInterfaceIds.length];
            for (int i = 0; i < source.NetworkInterfaceIds.length; i++) {
                this.NetworkInterfaceIds[i] = new String(source.NetworkInterfaceIds[i]);
            }
        }
        if (source.QosLevel != null) {
            this.QosLevel = new String(source.QosLevel);
        }
        if (source.DirectSendMaxPort != null) {
            this.DirectSendMaxPort = new Long(source.DirectSendMaxPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "NetworkInterfaceIds.", this.NetworkInterfaceIds);
        this.setParamSimple(map, prefix + "QosLevel", this.QosLevel);
        this.setParamSimple(map, prefix + "DirectSendMaxPort", this.DirectSendMaxPort);

    }
}

