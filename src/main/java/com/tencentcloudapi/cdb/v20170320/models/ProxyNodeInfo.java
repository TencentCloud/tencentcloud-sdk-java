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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyNodeInfo extends AbstractModel{

    /**
    * 代理节点ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyNodeId")
    @Expose
    private String ProxyNodeId;

    /**
    * 节点当前连接数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyNodeConnections")
    @Expose
    private Long ProxyNodeConnections;

    /**
    * cup
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyNodeCpu")
    @Expose
    private Long ProxyNodeCpu;

    /**
    * 内存
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyNodeMem")
    @Expose
    private Long ProxyNodeMem;

    /**
    * 节点状态：
init（申请中）
online（运行中）
offline（离线中）
destroy（已销毁）
recovering（故障恢复中）
error（节点故障）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyStatus")
    @Expose
    private String ProxyStatus;

    /**
     * Get 代理节点ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyNodeId 代理节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProxyNodeId() {
        return this.ProxyNodeId;
    }

    /**
     * Set 代理节点ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyNodeId 代理节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyNodeId(String ProxyNodeId) {
        this.ProxyNodeId = ProxyNodeId;
    }

    /**
     * Get 节点当前连接数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyNodeConnections 节点当前连接数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProxyNodeConnections() {
        return this.ProxyNodeConnections;
    }

    /**
     * Set 节点当前连接数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyNodeConnections 节点当前连接数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyNodeConnections(Long ProxyNodeConnections) {
        this.ProxyNodeConnections = ProxyNodeConnections;
    }

    /**
     * Get cup
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyNodeCpu cup
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProxyNodeCpu() {
        return this.ProxyNodeCpu;
    }

    /**
     * Set cup
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyNodeCpu cup
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyNodeCpu(Long ProxyNodeCpu) {
        this.ProxyNodeCpu = ProxyNodeCpu;
    }

    /**
     * Get 内存
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyNodeMem 内存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProxyNodeMem() {
        return this.ProxyNodeMem;
    }

    /**
     * Set 内存
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyNodeMem 内存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyNodeMem(Long ProxyNodeMem) {
        this.ProxyNodeMem = ProxyNodeMem;
    }

    /**
     * Get 节点状态：
init（申请中）
online（运行中）
offline（离线中）
destroy（已销毁）
recovering（故障恢复中）
error（节点故障）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyStatus 节点状态：
init（申请中）
online（运行中）
offline（离线中）
destroy（已销毁）
recovering（故障恢复中）
error（节点故障）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProxyStatus() {
        return this.ProxyStatus;
    }

    /**
     * Set 节点状态：
init（申请中）
online（运行中）
offline（离线中）
destroy（已销毁）
recovering（故障恢复中）
error（节点故障）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyStatus 节点状态：
init（申请中）
online（运行中）
offline（离线中）
destroy（已销毁）
recovering（故障恢复中）
error（节点故障）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyStatus(String ProxyStatus) {
        this.ProxyStatus = ProxyStatus;
    }

    public ProxyNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyNodeInfo(ProxyNodeInfo source) {
        if (source.ProxyNodeId != null) {
            this.ProxyNodeId = new String(source.ProxyNodeId);
        }
        if (source.ProxyNodeConnections != null) {
            this.ProxyNodeConnections = new Long(source.ProxyNodeConnections);
        }
        if (source.ProxyNodeCpu != null) {
            this.ProxyNodeCpu = new Long(source.ProxyNodeCpu);
        }
        if (source.ProxyNodeMem != null) {
            this.ProxyNodeMem = new Long(source.ProxyNodeMem);
        }
        if (source.ProxyStatus != null) {
            this.ProxyStatus = new String(source.ProxyStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyNodeId", this.ProxyNodeId);
        this.setParamSimple(map, prefix + "ProxyNodeConnections", this.ProxyNodeConnections);
        this.setParamSimple(map, prefix + "ProxyNodeCpu", this.ProxyNodeCpu);
        this.setParamSimple(map, prefix + "ProxyNodeMem", this.ProxyNodeMem);
        this.setParamSimple(map, prefix + "ProxyStatus", this.ProxyStatus);

    }
}

