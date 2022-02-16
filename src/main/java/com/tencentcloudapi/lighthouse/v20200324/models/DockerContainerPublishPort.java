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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DockerContainerPublishPort extends AbstractModel{

    /**
    * 主机端口
    */
    @SerializedName("HostPort")
    @Expose
    private Long HostPort;

    /**
    * 容器端口
    */
    @SerializedName("ContainerPort")
    @Expose
    private Long ContainerPort;

    /**
    * 对外绑定IP，默认0.0.0.0
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 协议，默认tcp，支持tcp/udp/sctp
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
     * Get 主机端口 
     * @return HostPort 主机端口
     */
    public Long getHostPort() {
        return this.HostPort;
    }

    /**
     * Set 主机端口
     * @param HostPort 主机端口
     */
    public void setHostPort(Long HostPort) {
        this.HostPort = HostPort;
    }

    /**
     * Get 容器端口 
     * @return ContainerPort 容器端口
     */
    public Long getContainerPort() {
        return this.ContainerPort;
    }

    /**
     * Set 容器端口
     * @param ContainerPort 容器端口
     */
    public void setContainerPort(Long ContainerPort) {
        this.ContainerPort = ContainerPort;
    }

    /**
     * Get 对外绑定IP，默认0.0.0.0
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ip 对外绑定IP，默认0.0.0.0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 对外绑定IP，默认0.0.0.0
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ip 对外绑定IP，默认0.0.0.0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 协议，默认tcp，支持tcp/udp/sctp
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol 协议，默认tcp，支持tcp/udp/sctp
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议，默认tcp，支持tcp/udp/sctp
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol 协议，默认tcp，支持tcp/udp/sctp
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    public DockerContainerPublishPort() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DockerContainerPublishPort(DockerContainerPublishPort source) {
        if (source.HostPort != null) {
            this.HostPort = new Long(source.HostPort);
        }
        if (source.ContainerPort != null) {
            this.ContainerPort = new Long(source.ContainerPort);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostPort", this.HostPort);
        this.setParamSimple(map, prefix + "ContainerPort", this.ContainerPort);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);

    }
}

