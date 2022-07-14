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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogstashNodeInfo extends AbstractModel{

    /**
    * 节点ID
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * 节点IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 节点端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
     * Get 节点ID 
     * @return NodeId 节点ID
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 节点ID
     * @param NodeId 节点ID
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 节点IP 
     * @return Ip 节点IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 节点IP
     * @param Ip 节点IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 节点端口 
     * @return Port 节点端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 节点端口
     * @param Port 节点端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    public LogstashNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogstashNodeInfo(LogstashNodeInfo source) {
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

