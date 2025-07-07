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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SuperNodeListItem extends AbstractModel {

    /**
    * 超级节点ID
    */
    @SerializedName("NodeID")
    @Expose
    private String NodeID;

    /**
    * 超级节点名称
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 所属集群名
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 所属集群ID
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * 节点状态:Running,Ready,Notready,Initializing,Failed,Error
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 子网ID
    */
    @SerializedName("SubNetID")
    @Expose
    private String SubNetID;

    /**
    * 子网名称
    */
    @SerializedName("SubNetName")
    @Expose
    private String SubNetName;

    /**
    * 子网网段
    */
    @SerializedName("SubNetCidr")
    @Expose
    private String SubNetCidr;

    /**
    * 可用区ID
    */
    @SerializedName("ZoneID")
    @Expose
    private String ZoneID;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 关联pod数
    */
    @SerializedName("RelatePodCount")
    @Expose
    private Long RelatePodCount;

    /**
    * 关联容器数
    */
    @SerializedName("RelateContainerCount")
    @Expose
    private Long RelateContainerCount;

    /**
    * agent安装状态UNINSTALL:未安装;INSTALLED:已安装;INSTALLING:安装中;
    */
    @SerializedName("AgentStatus")
    @Expose
    private String AgentStatus;

    /**
    * 节点唯一id
    */
    @SerializedName("NodeUniqueID")
    @Expose
    private String NodeUniqueID;

    /**
    * 集群接入状态
    */
    @SerializedName("ClusterAccessedStatus")
    @Expose
    private String ClusterAccessedStatus;

    /**
    * 计费核数
    */
    @SerializedName("ChargeCoresCnt")
    @Expose
    private Long ChargeCoresCnt;

    /**
    * 防护状态:
已防护: Defended
未防护: UnDefended
    */
    @SerializedName("DefendStatus")
    @Expose
    private String DefendStatus;

    /**
     * Get 超级节点ID 
     * @return NodeID 超级节点ID
     */
    public String getNodeID() {
        return this.NodeID;
    }

    /**
     * Set 超级节点ID
     * @param NodeID 超级节点ID
     */
    public void setNodeID(String NodeID) {
        this.NodeID = NodeID;
    }

    /**
     * Get 超级节点名称 
     * @return NodeName 超级节点名称
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 超级节点名称
     * @param NodeName 超级节点名称
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 所属集群名 
     * @return ClusterName 所属集群名
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 所属集群名
     * @param ClusterName 所属集群名
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 所属集群ID 
     * @return ClusterID 所属集群ID
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set 所属集群ID
     * @param ClusterID 所属集群ID
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get 节点状态:Running,Ready,Notready,Initializing,Failed,Error 
     * @return Status 节点状态:Running,Ready,Notready,Initializing,Failed,Error
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 节点状态:Running,Ready,Notready,Initializing,Failed,Error
     * @param Status 节点状态:Running,Ready,Notready,Initializing,Failed,Error
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 子网ID 
     * @return SubNetID 子网ID
     */
    public String getSubNetID() {
        return this.SubNetID;
    }

    /**
     * Set 子网ID
     * @param SubNetID 子网ID
     */
    public void setSubNetID(String SubNetID) {
        this.SubNetID = SubNetID;
    }

    /**
     * Get 子网名称 
     * @return SubNetName 子网名称
     */
    public String getSubNetName() {
        return this.SubNetName;
    }

    /**
     * Set 子网名称
     * @param SubNetName 子网名称
     */
    public void setSubNetName(String SubNetName) {
        this.SubNetName = SubNetName;
    }

    /**
     * Get 子网网段 
     * @return SubNetCidr 子网网段
     */
    public String getSubNetCidr() {
        return this.SubNetCidr;
    }

    /**
     * Set 子网网段
     * @param SubNetCidr 子网网段
     */
    public void setSubNetCidr(String SubNetCidr) {
        this.SubNetCidr = SubNetCidr;
    }

    /**
     * Get 可用区ID 
     * @return ZoneID 可用区ID
     */
    public String getZoneID() {
        return this.ZoneID;
    }

    /**
     * Set 可用区ID
     * @param ZoneID 可用区ID
     */
    public void setZoneID(String ZoneID) {
        this.ZoneID = ZoneID;
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
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 关联pod数 
     * @return RelatePodCount 关联pod数
     */
    public Long getRelatePodCount() {
        return this.RelatePodCount;
    }

    /**
     * Set 关联pod数
     * @param RelatePodCount 关联pod数
     */
    public void setRelatePodCount(Long RelatePodCount) {
        this.RelatePodCount = RelatePodCount;
    }

    /**
     * Get 关联容器数 
     * @return RelateContainerCount 关联容器数
     */
    public Long getRelateContainerCount() {
        return this.RelateContainerCount;
    }

    /**
     * Set 关联容器数
     * @param RelateContainerCount 关联容器数
     */
    public void setRelateContainerCount(Long RelateContainerCount) {
        this.RelateContainerCount = RelateContainerCount;
    }

    /**
     * Get agent安装状态UNINSTALL:未安装;INSTALLED:已安装;INSTALLING:安装中; 
     * @return AgentStatus agent安装状态UNINSTALL:未安装;INSTALLED:已安装;INSTALLING:安装中;
     */
    public String getAgentStatus() {
        return this.AgentStatus;
    }

    /**
     * Set agent安装状态UNINSTALL:未安装;INSTALLED:已安装;INSTALLING:安装中;
     * @param AgentStatus agent安装状态UNINSTALL:未安装;INSTALLED:已安装;INSTALLING:安装中;
     */
    public void setAgentStatus(String AgentStatus) {
        this.AgentStatus = AgentStatus;
    }

    /**
     * Get 节点唯一id 
     * @return NodeUniqueID 节点唯一id
     */
    public String getNodeUniqueID() {
        return this.NodeUniqueID;
    }

    /**
     * Set 节点唯一id
     * @param NodeUniqueID 节点唯一id
     */
    public void setNodeUniqueID(String NodeUniqueID) {
        this.NodeUniqueID = NodeUniqueID;
    }

    /**
     * Get 集群接入状态 
     * @return ClusterAccessedStatus 集群接入状态
     */
    public String getClusterAccessedStatus() {
        return this.ClusterAccessedStatus;
    }

    /**
     * Set 集群接入状态
     * @param ClusterAccessedStatus 集群接入状态
     */
    public void setClusterAccessedStatus(String ClusterAccessedStatus) {
        this.ClusterAccessedStatus = ClusterAccessedStatus;
    }

    /**
     * Get 计费核数 
     * @return ChargeCoresCnt 计费核数
     */
    public Long getChargeCoresCnt() {
        return this.ChargeCoresCnt;
    }

    /**
     * Set 计费核数
     * @param ChargeCoresCnt 计费核数
     */
    public void setChargeCoresCnt(Long ChargeCoresCnt) {
        this.ChargeCoresCnt = ChargeCoresCnt;
    }

    /**
     * Get 防护状态:
已防护: Defended
未防护: UnDefended 
     * @return DefendStatus 防护状态:
已防护: Defended
未防护: UnDefended
     */
    public String getDefendStatus() {
        return this.DefendStatus;
    }

    /**
     * Set 防护状态:
已防护: Defended
未防护: UnDefended
     * @param DefendStatus 防护状态:
已防护: Defended
未防护: UnDefended
     */
    public void setDefendStatus(String DefendStatus) {
        this.DefendStatus = DefendStatus;
    }

    public SuperNodeListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SuperNodeListItem(SuperNodeListItem source) {
        if (source.NodeID != null) {
            this.NodeID = new String(source.NodeID);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SubNetID != null) {
            this.SubNetID = new String(source.SubNetID);
        }
        if (source.SubNetName != null) {
            this.SubNetName = new String(source.SubNetName);
        }
        if (source.SubNetCidr != null) {
            this.SubNetCidr = new String(source.SubNetCidr);
        }
        if (source.ZoneID != null) {
            this.ZoneID = new String(source.ZoneID);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RelatePodCount != null) {
            this.RelatePodCount = new Long(source.RelatePodCount);
        }
        if (source.RelateContainerCount != null) {
            this.RelateContainerCount = new Long(source.RelateContainerCount);
        }
        if (source.AgentStatus != null) {
            this.AgentStatus = new String(source.AgentStatus);
        }
        if (source.NodeUniqueID != null) {
            this.NodeUniqueID = new String(source.NodeUniqueID);
        }
        if (source.ClusterAccessedStatus != null) {
            this.ClusterAccessedStatus = new String(source.ClusterAccessedStatus);
        }
        if (source.ChargeCoresCnt != null) {
            this.ChargeCoresCnt = new Long(source.ChargeCoresCnt);
        }
        if (source.DefendStatus != null) {
            this.DefendStatus = new String(source.DefendStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeID", this.NodeID);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SubNetID", this.SubNetID);
        this.setParamSimple(map, prefix + "SubNetName", this.SubNetName);
        this.setParamSimple(map, prefix + "SubNetCidr", this.SubNetCidr);
        this.setParamSimple(map, prefix + "ZoneID", this.ZoneID);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RelatePodCount", this.RelatePodCount);
        this.setParamSimple(map, prefix + "RelateContainerCount", this.RelateContainerCount);
        this.setParamSimple(map, prefix + "AgentStatus", this.AgentStatus);
        this.setParamSimple(map, prefix + "NodeUniqueID", this.NodeUniqueID);
        this.setParamSimple(map, prefix + "ClusterAccessedStatus", this.ClusterAccessedStatus);
        this.setParamSimple(map, prefix + "ChargeCoresCnt", this.ChargeCoresCnt);
        this.setParamSimple(map, prefix + "DefendStatus", this.DefendStatus);

    }
}

