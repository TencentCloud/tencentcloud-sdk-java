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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogstashNodeView extends AbstractModel {

    /**
    * 节点ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * 节点IP	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeIp")
    @Expose
    private String NodeIp;

    /**
    * 节点HTTP IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeHttpIp")
    @Expose
    private String NodeHttpIp;

    /**
    * 可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 节点总磁盘大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 磁盘使用率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskUsage")
    @Expose
    private Float DiskUsage;

    /**
    * 节点内存大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * 内存使用率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemUsage")
    @Expose
    private Float MemUsage;

    /**
    * JVM内存使用率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JvmMemUsage")
    @Expose
    private Float JvmMemUsage;

    /**
    * 节点cpu个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuNum")
    @Expose
    private Long CpuNum;

    /**
    * cpu使用率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuUsage")
    @Expose
    private Float CpuUsage;

    /**
     * Get 节点ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeId 节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 节点ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeId 节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 节点IP	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeIp 节点IP	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeIp() {
        return this.NodeIp;
    }

    /**
     * Set 节点IP	
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeIp 节点IP	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeIp(String NodeIp) {
        this.NodeIp = NodeIp;
    }

    /**
     * Get 节点HTTP IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeHttpIp 节点HTTP IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeHttpIp() {
        return this.NodeHttpIp;
    }

    /**
     * Set 节点HTTP IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeHttpIp 节点HTTP IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeHttpIp(String NodeHttpIp) {
        this.NodeHttpIp = NodeHttpIp;
    }

    /**
     * Get 可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone 可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone 可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 节点总磁盘大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskSize 节点总磁盘大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 节点总磁盘大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskSize 节点总磁盘大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 磁盘使用率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskUsage 磁盘使用率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set 磁盘使用率
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskUsage 磁盘使用率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskUsage(Float DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get 节点内存大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemSize 节点内存大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set 节点内存大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemSize 节点内存大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get 内存使用率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemUsage 内存使用率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMemUsage() {
        return this.MemUsage;
    }

    /**
     * Set 内存使用率
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemUsage 内存使用率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemUsage(Float MemUsage) {
        this.MemUsage = MemUsage;
    }

    /**
     * Get JVM内存使用率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JvmMemUsage JVM内存使用率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getJvmMemUsage() {
        return this.JvmMemUsage;
    }

    /**
     * Set JVM内存使用率
注意：此字段可能返回 null，表示取不到有效值。
     * @param JvmMemUsage JVM内存使用率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJvmMemUsage(Float JvmMemUsage) {
        this.JvmMemUsage = JvmMemUsage;
    }

    /**
     * Get 节点cpu个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuNum 节点cpu个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCpuNum() {
        return this.CpuNum;
    }

    /**
     * Set 节点cpu个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuNum 节点cpu个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuNum(Long CpuNum) {
        this.CpuNum = CpuNum;
    }

    /**
     * Get cpu使用率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuUsage cpu使用率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCpuUsage() {
        return this.CpuUsage;
    }

    /**
     * Set cpu使用率
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuUsage cpu使用率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuUsage(Float CpuUsage) {
        this.CpuUsage = CpuUsage;
    }

    public LogstashNodeView() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogstashNodeView(LogstashNodeView source) {
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.NodeIp != null) {
            this.NodeIp = new String(source.NodeIp);
        }
        if (source.NodeHttpIp != null) {
            this.NodeHttpIp = new String(source.NodeHttpIp);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskUsage != null) {
            this.DiskUsage = new Float(source.DiskUsage);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.MemUsage != null) {
            this.MemUsage = new Float(source.MemUsage);
        }
        if (source.JvmMemUsage != null) {
            this.JvmMemUsage = new Float(source.JvmMemUsage);
        }
        if (source.CpuNum != null) {
            this.CpuNum = new Long(source.CpuNum);
        }
        if (source.CpuUsage != null) {
            this.CpuUsage = new Float(source.CpuUsage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "NodeIp", this.NodeIp);
        this.setParamSimple(map, prefix + "NodeHttpIp", this.NodeHttpIp);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "MemUsage", this.MemUsage);
        this.setParamSimple(map, prefix + "JvmMemUsage", this.JvmMemUsage);
        this.setParamSimple(map, prefix + "CpuNum", this.CpuNum);
        this.setParamSimple(map, prefix + "CpuUsage", this.CpuUsage);

    }
}

