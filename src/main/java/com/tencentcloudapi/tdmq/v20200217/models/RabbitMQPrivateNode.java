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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQPrivateNode extends AbstractModel{

    /**
    * 节点名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 节点状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeStatus")
    @Expose
    private String NodeStatus;

    /**
    * CPU使用率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CPUUsage")
    @Expose
    private String CPUUsage;

    /**
    * 内存使用情况，单位MB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 磁盘使用率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskUsage")
    @Expose
    private String DiskUsage;

    /**
    * Rabbitmq的Erlang进程数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessNumber")
    @Expose
    private Long ProcessNumber;

    /**
     * Get 节点名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeName 节点名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 节点名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeName 节点名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 节点状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeStatus 节点状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeStatus() {
        return this.NodeStatus;
    }

    /**
     * Set 节点状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeStatus 节点状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeStatus(String NodeStatus) {
        this.NodeStatus = NodeStatus;
    }

    /**
     * Get CPU使用率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CPUUsage CPU使用率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCPUUsage() {
        return this.CPUUsage;
    }

    /**
     * Set CPU使用率
注意：此字段可能返回 null，表示取不到有效值。
     * @param CPUUsage CPU使用率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCPUUsage(String CPUUsage) {
        this.CPUUsage = CPUUsage;
    }

    /**
     * Get 内存使用情况，单位MB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Memory 内存使用情况，单位MB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存使用情况，单位MB
注意：此字段可能返回 null，表示取不到有效值。
     * @param Memory 内存使用情况，单位MB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 磁盘使用率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskUsage 磁盘使用率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set 磁盘使用率
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskUsage 磁盘使用率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskUsage(String DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get Rabbitmq的Erlang进程数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessNumber Rabbitmq的Erlang进程数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProcessNumber() {
        return this.ProcessNumber;
    }

    /**
     * Set Rabbitmq的Erlang进程数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessNumber Rabbitmq的Erlang进程数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessNumber(Long ProcessNumber) {
        this.ProcessNumber = ProcessNumber;
    }

    public RabbitMQPrivateNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQPrivateNode(RabbitMQPrivateNode source) {
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.NodeStatus != null) {
            this.NodeStatus = new String(source.NodeStatus);
        }
        if (source.CPUUsage != null) {
            this.CPUUsage = new String(source.CPUUsage);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.DiskUsage != null) {
            this.DiskUsage = new String(source.DiskUsage);
        }
        if (source.ProcessNumber != null) {
            this.ProcessNumber = new Long(source.ProcessNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "NodeStatus", this.NodeStatus);
        this.setParamSimple(map, prefix + "CPUUsage", this.CPUUsage);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "ProcessNumber", this.ProcessNumber);

    }
}

