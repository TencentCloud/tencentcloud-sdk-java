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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProtocolPort extends AbstractModel{

    /**
    * TCP UDP
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 服务端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 容器端口
    */
    @SerializedName("TargetPort")
    @Expose
    private Long TargetPort;

    /**
    * 主机端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodePort")
    @Expose
    private Long NodePort;

    /**
     * Get TCP UDP 
     * @return Protocol TCP UDP
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set TCP UDP
     * @param Protocol TCP UDP
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 服务端口 
     * @return Port 服务端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 服务端口
     * @param Port 服务端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 容器端口 
     * @return TargetPort 容器端口
     */
    public Long getTargetPort() {
        return this.TargetPort;
    }

    /**
     * Set 容器端口
     * @param TargetPort 容器端口
     */
    public void setTargetPort(Long TargetPort) {
        this.TargetPort = TargetPort;
    }

    /**
     * Get 主机端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodePort 主机端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNodePort() {
        return this.NodePort;
    }

    /**
     * Set 主机端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodePort 主机端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodePort(Long NodePort) {
        this.NodePort = NodePort;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "TargetPort", this.TargetPort);
        this.setParamSimple(map, prefix + "NodePort", this.NodePort);

    }
}

