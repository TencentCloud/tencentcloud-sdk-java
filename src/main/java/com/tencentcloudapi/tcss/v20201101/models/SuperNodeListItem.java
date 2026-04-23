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
    * <p>超级节点ID</p>
    */
    @SerializedName("NodeID")
    @Expose
    private String NodeID;

    /**
    * <p>超级节点名称</p>
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * <p>所属集群名</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>所属集群ID</p>
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * <p>节点状态:Running,Ready,Notready,Initializing,Failed,Error</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>子网ID</p>
    */
    @SerializedName("SubNetID")
    @Expose
    private String SubNetID;

    /**
    * <p>子网名称</p>
    */
    @SerializedName("SubNetName")
    @Expose
    private String SubNetName;

    /**
    * <p>子网网段</p>
    */
    @SerializedName("SubNetCidr")
    @Expose
    private String SubNetCidr;

    /**
    * <p>可用区ID</p>
    */
    @SerializedName("ZoneID")
    @Expose
    private String ZoneID;

    /**
    * <p>可用区</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>关联pod数</p>
    */
    @SerializedName("RelatePodCount")
    @Expose
    private Long RelatePodCount;

    /**
    * <p>关联容器数</p>
    */
    @SerializedName("RelateContainerCount")
    @Expose
    private Long RelateContainerCount;

    /**
    * <p>agent安装状态UNINSTALL:未安装;INSTALLED:已安装;INSTALLING:安装中;</p>
    */
    @SerializedName("AgentStatus")
    @Expose
    private String AgentStatus;

    /**
    * <p>节点唯一id</p>
    */
    @SerializedName("NodeUniqueID")
    @Expose
    private String NodeUniqueID;

    /**
    * <p>集群接入状态</p>
    */
    @SerializedName("ClusterAccessedStatus")
    @Expose
    private String ClusterAccessedStatus;

    /**
    * <p>计费核数</p>
    */
    @SerializedName("ChargeCoresCnt")
    @Expose
    private Long ChargeCoresCnt;

    /**
    * <p>防护状态:<br>已防护: Defended<br>未防护: UnDefended</p>
    */
    @SerializedName("DefendStatus")
    @Expose
    private String DefendStatus;

    /**
    * <p>集群接入子状态</p><p>枚举值：</p><ul><li>AccessedSubNone： 无</li><li>AccessedSubUninstallException： 卸载异常</li><li>AccessedSubTimeout： 接入超时</li><li>AccessedSubUninstallTimeout： 卸载超时</li><li>AccessedSubResourceException： 集群组件检查异常-Deployment/DaemonSet等异常</li><li>AccessedSubCAMPermissionDenied： CAM权限不够</li></ul>
    */
    @SerializedName("ClusterAccessedSubStatus")
    @Expose
    private String ClusterAccessedSubStatus;

    /**
    * <p>失败具体原因描述</p>
    */
    @SerializedName("ClusterAccessedErrorReason")
    @Expose
    private String ClusterAccessedErrorReason;

    /**
     * Get <p>超级节点ID</p> 
     * @return NodeID <p>超级节点ID</p>
     */
    public String getNodeID() {
        return this.NodeID;
    }

    /**
     * Set <p>超级节点ID</p>
     * @param NodeID <p>超级节点ID</p>
     */
    public void setNodeID(String NodeID) {
        this.NodeID = NodeID;
    }

    /**
     * Get <p>超级节点名称</p> 
     * @return NodeName <p>超级节点名称</p>
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set <p>超级节点名称</p>
     * @param NodeName <p>超级节点名称</p>
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get <p>所属集群名</p> 
     * @return ClusterName <p>所属集群名</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>所属集群名</p>
     * @param ClusterName <p>所属集群名</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>所属集群ID</p> 
     * @return ClusterID <p>所属集群ID</p>
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set <p>所属集群ID</p>
     * @param ClusterID <p>所属集群ID</p>
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get <p>节点状态:Running,Ready,Notready,Initializing,Failed,Error</p> 
     * @return Status <p>节点状态:Running,Ready,Notready,Initializing,Failed,Error</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>节点状态:Running,Ready,Notready,Initializing,Failed,Error</p>
     * @param Status <p>节点状态:Running,Ready,Notready,Initializing,Failed,Error</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>子网ID</p> 
     * @return SubNetID <p>子网ID</p>
     */
    public String getSubNetID() {
        return this.SubNetID;
    }

    /**
     * Set <p>子网ID</p>
     * @param SubNetID <p>子网ID</p>
     */
    public void setSubNetID(String SubNetID) {
        this.SubNetID = SubNetID;
    }

    /**
     * Get <p>子网名称</p> 
     * @return SubNetName <p>子网名称</p>
     */
    public String getSubNetName() {
        return this.SubNetName;
    }

    /**
     * Set <p>子网名称</p>
     * @param SubNetName <p>子网名称</p>
     */
    public void setSubNetName(String SubNetName) {
        this.SubNetName = SubNetName;
    }

    /**
     * Get <p>子网网段</p> 
     * @return SubNetCidr <p>子网网段</p>
     */
    public String getSubNetCidr() {
        return this.SubNetCidr;
    }

    /**
     * Set <p>子网网段</p>
     * @param SubNetCidr <p>子网网段</p>
     */
    public void setSubNetCidr(String SubNetCidr) {
        this.SubNetCidr = SubNetCidr;
    }

    /**
     * Get <p>可用区ID</p> 
     * @return ZoneID <p>可用区ID</p>
     */
    public String getZoneID() {
        return this.ZoneID;
    }

    /**
     * Set <p>可用区ID</p>
     * @param ZoneID <p>可用区ID</p>
     */
    public void setZoneID(String ZoneID) {
        this.ZoneID = ZoneID;
    }

    /**
     * Get <p>可用区</p> 
     * @return Zone <p>可用区</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区</p>
     * @param Zone <p>可用区</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>关联pod数</p> 
     * @return RelatePodCount <p>关联pod数</p>
     */
    public Long getRelatePodCount() {
        return this.RelatePodCount;
    }

    /**
     * Set <p>关联pod数</p>
     * @param RelatePodCount <p>关联pod数</p>
     */
    public void setRelatePodCount(Long RelatePodCount) {
        this.RelatePodCount = RelatePodCount;
    }

    /**
     * Get <p>关联容器数</p> 
     * @return RelateContainerCount <p>关联容器数</p>
     */
    public Long getRelateContainerCount() {
        return this.RelateContainerCount;
    }

    /**
     * Set <p>关联容器数</p>
     * @param RelateContainerCount <p>关联容器数</p>
     */
    public void setRelateContainerCount(Long RelateContainerCount) {
        this.RelateContainerCount = RelateContainerCount;
    }

    /**
     * Get <p>agent安装状态UNINSTALL:未安装;INSTALLED:已安装;INSTALLING:安装中;</p> 
     * @return AgentStatus <p>agent安装状态UNINSTALL:未安装;INSTALLED:已安装;INSTALLING:安装中;</p>
     */
    public String getAgentStatus() {
        return this.AgentStatus;
    }

    /**
     * Set <p>agent安装状态UNINSTALL:未安装;INSTALLED:已安装;INSTALLING:安装中;</p>
     * @param AgentStatus <p>agent安装状态UNINSTALL:未安装;INSTALLED:已安装;INSTALLING:安装中;</p>
     */
    public void setAgentStatus(String AgentStatus) {
        this.AgentStatus = AgentStatus;
    }

    /**
     * Get <p>节点唯一id</p> 
     * @return NodeUniqueID <p>节点唯一id</p>
     */
    public String getNodeUniqueID() {
        return this.NodeUniqueID;
    }

    /**
     * Set <p>节点唯一id</p>
     * @param NodeUniqueID <p>节点唯一id</p>
     */
    public void setNodeUniqueID(String NodeUniqueID) {
        this.NodeUniqueID = NodeUniqueID;
    }

    /**
     * Get <p>集群接入状态</p> 
     * @return ClusterAccessedStatus <p>集群接入状态</p>
     */
    public String getClusterAccessedStatus() {
        return this.ClusterAccessedStatus;
    }

    /**
     * Set <p>集群接入状态</p>
     * @param ClusterAccessedStatus <p>集群接入状态</p>
     */
    public void setClusterAccessedStatus(String ClusterAccessedStatus) {
        this.ClusterAccessedStatus = ClusterAccessedStatus;
    }

    /**
     * Get <p>计费核数</p> 
     * @return ChargeCoresCnt <p>计费核数</p>
     */
    public Long getChargeCoresCnt() {
        return this.ChargeCoresCnt;
    }

    /**
     * Set <p>计费核数</p>
     * @param ChargeCoresCnt <p>计费核数</p>
     */
    public void setChargeCoresCnt(Long ChargeCoresCnt) {
        this.ChargeCoresCnt = ChargeCoresCnt;
    }

    /**
     * Get <p>防护状态:<br>已防护: Defended<br>未防护: UnDefended</p> 
     * @return DefendStatus <p>防护状态:<br>已防护: Defended<br>未防护: UnDefended</p>
     */
    public String getDefendStatus() {
        return this.DefendStatus;
    }

    /**
     * Set <p>防护状态:<br>已防护: Defended<br>未防护: UnDefended</p>
     * @param DefendStatus <p>防护状态:<br>已防护: Defended<br>未防护: UnDefended</p>
     */
    public void setDefendStatus(String DefendStatus) {
        this.DefendStatus = DefendStatus;
    }

    /**
     * Get <p>集群接入子状态</p><p>枚举值：</p><ul><li>AccessedSubNone： 无</li><li>AccessedSubUninstallException： 卸载异常</li><li>AccessedSubTimeout： 接入超时</li><li>AccessedSubUninstallTimeout： 卸载超时</li><li>AccessedSubResourceException： 集群组件检查异常-Deployment/DaemonSet等异常</li><li>AccessedSubCAMPermissionDenied： CAM权限不够</li></ul> 
     * @return ClusterAccessedSubStatus <p>集群接入子状态</p><p>枚举值：</p><ul><li>AccessedSubNone： 无</li><li>AccessedSubUninstallException： 卸载异常</li><li>AccessedSubTimeout： 接入超时</li><li>AccessedSubUninstallTimeout： 卸载超时</li><li>AccessedSubResourceException： 集群组件检查异常-Deployment/DaemonSet等异常</li><li>AccessedSubCAMPermissionDenied： CAM权限不够</li></ul>
     */
    public String getClusterAccessedSubStatus() {
        return this.ClusterAccessedSubStatus;
    }

    /**
     * Set <p>集群接入子状态</p><p>枚举值：</p><ul><li>AccessedSubNone： 无</li><li>AccessedSubUninstallException： 卸载异常</li><li>AccessedSubTimeout： 接入超时</li><li>AccessedSubUninstallTimeout： 卸载超时</li><li>AccessedSubResourceException： 集群组件检查异常-Deployment/DaemonSet等异常</li><li>AccessedSubCAMPermissionDenied： CAM权限不够</li></ul>
     * @param ClusterAccessedSubStatus <p>集群接入子状态</p><p>枚举值：</p><ul><li>AccessedSubNone： 无</li><li>AccessedSubUninstallException： 卸载异常</li><li>AccessedSubTimeout： 接入超时</li><li>AccessedSubUninstallTimeout： 卸载超时</li><li>AccessedSubResourceException： 集群组件检查异常-Deployment/DaemonSet等异常</li><li>AccessedSubCAMPermissionDenied： CAM权限不够</li></ul>
     */
    public void setClusterAccessedSubStatus(String ClusterAccessedSubStatus) {
        this.ClusterAccessedSubStatus = ClusterAccessedSubStatus;
    }

    /**
     * Get <p>失败具体原因描述</p> 
     * @return ClusterAccessedErrorReason <p>失败具体原因描述</p>
     */
    public String getClusterAccessedErrorReason() {
        return this.ClusterAccessedErrorReason;
    }

    /**
     * Set <p>失败具体原因描述</p>
     * @param ClusterAccessedErrorReason <p>失败具体原因描述</p>
     */
    public void setClusterAccessedErrorReason(String ClusterAccessedErrorReason) {
        this.ClusterAccessedErrorReason = ClusterAccessedErrorReason;
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
        if (source.ClusterAccessedSubStatus != null) {
            this.ClusterAccessedSubStatus = new String(source.ClusterAccessedSubStatus);
        }
        if (source.ClusterAccessedErrorReason != null) {
            this.ClusterAccessedErrorReason = new String(source.ClusterAccessedErrorReason);
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
        this.setParamSimple(map, prefix + "ClusterAccessedSubStatus", this.ClusterAccessedSubStatus);
        this.setParamSimple(map, prefix + "ClusterAccessedErrorReason", this.ClusterAccessedErrorReason);

    }
}

