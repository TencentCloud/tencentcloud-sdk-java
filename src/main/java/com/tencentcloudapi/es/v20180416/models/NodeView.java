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

public class NodeView extends AbstractModel{

    /**
    * 节点ID
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * 节点IP
    */
    @SerializedName("NodeIp")
    @Expose
    private String NodeIp;

    /**
    * 节点是否可见
    */
    @SerializedName("Visible")
    @Expose
    private Float Visible;

    /**
    * 是否熔断
    */
    @SerializedName("Break")
    @Expose
    private Float Break;

    /**
    * 节点总磁盘大小
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 磁盘使用率
    */
    @SerializedName("DiskUsage")
    @Expose
    private Float DiskUsage;

    /**
    * 节点内存大小，单位GB
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * 内存使用率
    */
    @SerializedName("MemUsage")
    @Expose
    private Float MemUsage;

    /**
    * 节点cpu个数
    */
    @SerializedName("CpuNum")
    @Expose
    private Long CpuNum;

    /**
    * cpu使用率
    */
    @SerializedName("CpuUsage")
    @Expose
    private Float CpuUsage;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 节点角色
    */
    @SerializedName("NodeRole")
    @Expose
    private String NodeRole;

    /**
    * 节点HTTP IP
    */
    @SerializedName("NodeHttpIp")
    @Expose
    private String NodeHttpIp;

    /**
    * JVM内存使用率
    */
    @SerializedName("JvmMemUsage")
    @Expose
    private Float JvmMemUsage;

    /**
    * 节点分片数
    */
    @SerializedName("ShardNum")
    @Expose
    private Long ShardNum;

    /**
    * 节点上磁盘ID列表
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * 是否为隐藏可用区
    */
    @SerializedName("Hidden")
    @Expose
    private Boolean Hidden;

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
     * @return NodeIp 节点IP
     */
    public String getNodeIp() {
        return this.NodeIp;
    }

    /**
     * Set 节点IP
     * @param NodeIp 节点IP
     */
    public void setNodeIp(String NodeIp) {
        this.NodeIp = NodeIp;
    }

    /**
     * Get 节点是否可见 
     * @return Visible 节点是否可见
     */
    public Float getVisible() {
        return this.Visible;
    }

    /**
     * Set 节点是否可见
     * @param Visible 节点是否可见
     */
    public void setVisible(Float Visible) {
        this.Visible = Visible;
    }

    /**
     * Get 是否熔断 
     * @return Break 是否熔断
     */
    public Float getBreak() {
        return this.Break;
    }

    /**
     * Set 是否熔断
     * @param Break 是否熔断
     */
    public void setBreak(Float Break) {
        this.Break = Break;
    }

    /**
     * Get 节点总磁盘大小 
     * @return DiskSize 节点总磁盘大小
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 节点总磁盘大小
     * @param DiskSize 节点总磁盘大小
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 磁盘使用率 
     * @return DiskUsage 磁盘使用率
     */
    public Float getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set 磁盘使用率
     * @param DiskUsage 磁盘使用率
     */
    public void setDiskUsage(Float DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get 节点内存大小，单位GB 
     * @return MemSize 节点内存大小，单位GB
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set 节点内存大小，单位GB
     * @param MemSize 节点内存大小，单位GB
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get 内存使用率 
     * @return MemUsage 内存使用率
     */
    public Float getMemUsage() {
        return this.MemUsage;
    }

    /**
     * Set 内存使用率
     * @param MemUsage 内存使用率
     */
    public void setMemUsage(Float MemUsage) {
        this.MemUsage = MemUsage;
    }

    /**
     * Get 节点cpu个数 
     * @return CpuNum 节点cpu个数
     */
    public Long getCpuNum() {
        return this.CpuNum;
    }

    /**
     * Set 节点cpu个数
     * @param CpuNum 节点cpu个数
     */
    public void setCpuNum(Long CpuNum) {
        this.CpuNum = CpuNum;
    }

    /**
     * Get cpu使用率 
     * @return CpuUsage cpu使用率
     */
    public Float getCpuUsage() {
        return this.CpuUsage;
    }

    /**
     * Set cpu使用率
     * @param CpuUsage cpu使用率
     */
    public void setCpuUsage(Float CpuUsage) {
        this.CpuUsage = CpuUsage;
    }

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
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
     * Get 节点HTTP IP 
     * @return NodeHttpIp 节点HTTP IP
     */
    public String getNodeHttpIp() {
        return this.NodeHttpIp;
    }

    /**
     * Set 节点HTTP IP
     * @param NodeHttpIp 节点HTTP IP
     */
    public void setNodeHttpIp(String NodeHttpIp) {
        this.NodeHttpIp = NodeHttpIp;
    }

    /**
     * Get JVM内存使用率 
     * @return JvmMemUsage JVM内存使用率
     */
    public Float getJvmMemUsage() {
        return this.JvmMemUsage;
    }

    /**
     * Set JVM内存使用率
     * @param JvmMemUsage JVM内存使用率
     */
    public void setJvmMemUsage(Float JvmMemUsage) {
        this.JvmMemUsage = JvmMemUsage;
    }

    /**
     * Get 节点分片数 
     * @return ShardNum 节点分片数
     */
    public Long getShardNum() {
        return this.ShardNum;
    }

    /**
     * Set 节点分片数
     * @param ShardNum 节点分片数
     */
    public void setShardNum(Long ShardNum) {
        this.ShardNum = ShardNum;
    }

    /**
     * Get 节点上磁盘ID列表 
     * @return DiskIds 节点上磁盘ID列表
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set 节点上磁盘ID列表
     * @param DiskIds 节点上磁盘ID列表
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get 是否为隐藏可用区 
     * @return Hidden 是否为隐藏可用区
     */
    public Boolean getHidden() {
        return this.Hidden;
    }

    /**
     * Set 是否为隐藏可用区
     * @param Hidden 是否为隐藏可用区
     */
    public void setHidden(Boolean Hidden) {
        this.Hidden = Hidden;
    }

    public NodeView() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeView(NodeView source) {
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.NodeIp != null) {
            this.NodeIp = new String(source.NodeIp);
        }
        if (source.Visible != null) {
            this.Visible = new Float(source.Visible);
        }
        if (source.Break != null) {
            this.Break = new Float(source.Break);
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
        if (source.CpuNum != null) {
            this.CpuNum = new Long(source.CpuNum);
        }
        if (source.CpuUsage != null) {
            this.CpuUsage = new Float(source.CpuUsage);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.NodeRole != null) {
            this.NodeRole = new String(source.NodeRole);
        }
        if (source.NodeHttpIp != null) {
            this.NodeHttpIp = new String(source.NodeHttpIp);
        }
        if (source.JvmMemUsage != null) {
            this.JvmMemUsage = new Float(source.JvmMemUsage);
        }
        if (source.ShardNum != null) {
            this.ShardNum = new Long(source.ShardNum);
        }
        if (source.DiskIds != null) {
            this.DiskIds = new String[source.DiskIds.length];
            for (int i = 0; i < source.DiskIds.length; i++) {
                this.DiskIds[i] = new String(source.DiskIds[i]);
            }
        }
        if (source.Hidden != null) {
            this.Hidden = new Boolean(source.Hidden);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "NodeIp", this.NodeIp);
        this.setParamSimple(map, prefix + "Visible", this.Visible);
        this.setParamSimple(map, prefix + "Break", this.Break);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "MemUsage", this.MemUsage);
        this.setParamSimple(map, prefix + "CpuNum", this.CpuNum);
        this.setParamSimple(map, prefix + "CpuUsage", this.CpuUsage);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "NodeRole", this.NodeRole);
        this.setParamSimple(map, prefix + "NodeHttpIp", this.NodeHttpIp);
        this.setParamSimple(map, prefix + "JvmMemUsage", this.JvmMemUsage);
        this.setParamSimple(map, prefix + "ShardNum", this.ShardNum);
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamSimple(map, prefix + "Hidden", this.Hidden);

    }
}

