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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeUnitNodeInfo extends AbstractModel{

    /**
    * 节点ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 节点状态  NodeStatusHealthy (健康)/NodeStatusAbnormal (异常)/NodeStatusOffline (下线)/NodeStatusNotActivated (未激活
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 节点名称
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 内网节点IP
    */
    @SerializedName("InternalIP")
    @Expose
    private String InternalIP;

    /**
     * Get 节点ID 
     * @return Id 节点ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 节点ID
     * @param Id 节点ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 节点状态  NodeStatusHealthy (健康)/NodeStatusAbnormal (异常)/NodeStatusOffline (下线)/NodeStatusNotActivated (未激活 
     * @return Status 节点状态  NodeStatusHealthy (健康)/NodeStatusAbnormal (异常)/NodeStatusOffline (下线)/NodeStatusNotActivated (未激活
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 节点状态  NodeStatusHealthy (健康)/NodeStatusAbnormal (异常)/NodeStatusOffline (下线)/NodeStatusNotActivated (未激活
     * @param Status 节点状态  NodeStatusHealthy (健康)/NodeStatusAbnormal (异常)/NodeStatusOffline (下线)/NodeStatusNotActivated (未激活
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 节点名称 
     * @return NodeName 节点名称
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 节点名称
     * @param NodeName 节点名称
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 内网节点IP 
     * @return InternalIP 内网节点IP
     */
    public String getInternalIP() {
        return this.InternalIP;
    }

    /**
     * Set 内网节点IP
     * @param InternalIP 内网节点IP
     */
    public void setInternalIP(String InternalIP) {
        this.InternalIP = InternalIP;
    }

    public NodeUnitNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeUnitNodeInfo(NodeUnitNodeInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.InternalIP != null) {
            this.InternalIP = new String(source.InternalIP);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "InternalIP", this.InternalIP);

    }
}

