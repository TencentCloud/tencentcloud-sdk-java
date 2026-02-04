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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceNode extends AbstractModel {

    /**
    * id
    */
    @SerializedName("NodeId")
    @Expose
    private Long NodeId;

    /**
    * cn
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * ip
    */
    @SerializedName("NodeIp")
    @Expose
    private String NodeIp;

    /**
    * 私有ip
    */
    @SerializedName("PrivateNetworkIp")
    @Expose
    private String PrivateNetworkIp;

    /**
    * 节点角色
    */
    @SerializedName("NodeRole")
    @Expose
    private String NodeRole;

    /**
    * 节点名称
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 规格名称
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * cpu
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 数据盘数量
    */
    @SerializedName("DataDiskCount")
    @Expose
    private Long DataDiskCount;

    /**
    * 数据盘大小
    */
    @SerializedName("DataDiskSize")
    @Expose
    private Long DataDiskSize;

    /**
    * 数据盘类型
    */
    @SerializedName("DataDiskType")
    @Expose
    private String DataDiskType;

    /**
    * 唯一uuid
    */
    @SerializedName("UUID")
    @Expose
    private String UUID;

    /**
    * 区域
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get id 
     * @return NodeId id
     */
    public Long getNodeId() {
        return this.NodeId;
    }

    /**
     * Set id
     * @param NodeId id
     */
    public void setNodeId(Long NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get cn 
     * @return NodeType cn
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set cn
     * @param NodeType cn
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get ip 
     * @return NodeIp ip
     */
    public String getNodeIp() {
        return this.NodeIp;
    }

    /**
     * Set ip
     * @param NodeIp ip
     */
    public void setNodeIp(String NodeIp) {
        this.NodeIp = NodeIp;
    }

    /**
     * Get 私有ip 
     * @return PrivateNetworkIp 私有ip
     */
    public String getPrivateNetworkIp() {
        return this.PrivateNetworkIp;
    }

    /**
     * Set 私有ip
     * @param PrivateNetworkIp 私有ip
     */
    public void setPrivateNetworkIp(String PrivateNetworkIp) {
        this.PrivateNetworkIp = PrivateNetworkIp;
    }

    /**
     * Get 节点角色 
     * @return NodeRole 节点角色
     */
    public String getNodeRole() {
        return this.NodeRole;
    }

    /**
     * Set 节点角色
     * @param NodeRole 节点角色
     */
    public void setNodeRole(String NodeRole) {
        this.NodeRole = NodeRole;
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
     * Get 规格名称 
     * @return SpecName 规格名称
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set 规格名称
     * @param SpecName 规格名称
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get cpu 
     * @return Cpu cpu
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set cpu
     * @param Cpu cpu
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存 
     * @return Memory 内存
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存
     * @param Memory 内存
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 数据盘数量 
     * @return DataDiskCount 数据盘数量
     */
    public Long getDataDiskCount() {
        return this.DataDiskCount;
    }

    /**
     * Set 数据盘数量
     * @param DataDiskCount 数据盘数量
     */
    public void setDataDiskCount(Long DataDiskCount) {
        this.DataDiskCount = DataDiskCount;
    }

    /**
     * Get 数据盘大小 
     * @return DataDiskSize 数据盘大小
     */
    public Long getDataDiskSize() {
        return this.DataDiskSize;
    }

    /**
     * Set 数据盘大小
     * @param DataDiskSize 数据盘大小
     */
    public void setDataDiskSize(Long DataDiskSize) {
        this.DataDiskSize = DataDiskSize;
    }

    /**
     * Get 数据盘类型 
     * @return DataDiskType 数据盘类型
     */
    public String getDataDiskType() {
        return this.DataDiskType;
    }

    /**
     * Set 数据盘类型
     * @param DataDiskType 数据盘类型
     */
    public void setDataDiskType(String DataDiskType) {
        this.DataDiskType = DataDiskType;
    }

    /**
     * Get 唯一uuid 
     * @return UUID 唯一uuid
     */
    public String getUUID() {
        return this.UUID;
    }

    /**
     * Set 唯一uuid
     * @param UUID 唯一uuid
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    /**
     * Get 区域 
     * @return Zone 区域
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 区域
     * @param Zone 区域
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public InstanceNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceNode(InstanceNode source) {
        if (source.NodeId != null) {
            this.NodeId = new Long(source.NodeId);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeIp != null) {
            this.NodeIp = new String(source.NodeIp);
        }
        if (source.PrivateNetworkIp != null) {
            this.PrivateNetworkIp = new String(source.PrivateNetworkIp);
        }
        if (source.NodeRole != null) {
            this.NodeRole = new String(source.NodeRole);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.DataDiskCount != null) {
            this.DataDiskCount = new Long(source.DataDiskCount);
        }
        if (source.DataDiskSize != null) {
            this.DataDiskSize = new Long(source.DataDiskSize);
        }
        if (source.DataDiskType != null) {
            this.DataDiskType = new String(source.DataDiskType);
        }
        if (source.UUID != null) {
            this.UUID = new String(source.UUID);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeIp", this.NodeIp);
        this.setParamSimple(map, prefix + "PrivateNetworkIp", this.PrivateNetworkIp);
        this.setParamSimple(map, prefix + "NodeRole", this.NodeRole);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "DataDiskCount", this.DataDiskCount);
        this.setParamSimple(map, prefix + "DataDiskSize", this.DataDiskSize);
        this.setParamSimple(map, prefix + "DataDiskType", this.DataDiskType);
        this.setParamSimple(map, prefix + "UUID", this.UUID);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

