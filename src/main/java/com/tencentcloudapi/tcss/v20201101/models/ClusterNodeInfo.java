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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterNodeInfo extends AbstractModel {

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 内网ip地址
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private String PrivateIpAddresses;

    /**
    * 节点的角色，Master、Work等
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * 实例的状态（running 运行中，initializing 初始化中，failed 异常）
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * 节点名称
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * agent安装状态
    */
    @SerializedName("AgentStatus")
    @Expose
    private String AgentStatus;

    /**
    * 公网ip
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * 节点ID
    */
    @SerializedName("HostID")
    @Expose
    private String HostID;

    /**
    * 主机类型(普通节点情况)
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * 节点类型(
NORMAL: 普通节点
SUPER:超级节点
)
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * uuid
    */
    @SerializedName("UUID")
    @Expose
    private String UUID;

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
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 内网ip地址 
     * @return PrivateIpAddresses 内网ip地址
     */
    public String getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set 内网ip地址
     * @param PrivateIpAddresses 内网ip地址
     */
    public void setPrivateIpAddresses(String PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Get 节点的角色，Master、Work等 
     * @return InstanceRole 节点的角色，Master、Work等
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set 节点的角色，Master、Work等
     * @param InstanceRole 节点的角色，Master、Work等
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get 实例的状态（running 运行中，initializing 初始化中，failed 异常） 
     * @return InstanceState 实例的状态（running 运行中，initializing 初始化中，failed 异常）
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set 实例的状态（running 运行中，initializing 初始化中，failed 异常）
     * @param InstanceState 实例的状态（running 运行中，initializing 初始化中，failed 异常）
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
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
     * Get agent安装状态 
     * @return AgentStatus agent安装状态
     */
    public String getAgentStatus() {
        return this.AgentStatus;
    }

    /**
     * Set agent安装状态
     * @param AgentStatus agent安装状态
     */
    public void setAgentStatus(String AgentStatus) {
        this.AgentStatus = AgentStatus;
    }

    /**
     * Get 公网ip 
     * @return PublicIP 公网ip
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set 公网ip
     * @param PublicIP 公网ip
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get 节点ID 
     * @return HostID 节点ID
     */
    public String getHostID() {
        return this.HostID;
    }

    /**
     * Set 节点ID
     * @param HostID 节点ID
     */
    public void setHostID(String HostID) {
        this.HostID = HostID;
    }

    /**
     * Get 主机类型(普通节点情况) 
     * @return MachineType 主机类型(普通节点情况)
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set 主机类型(普通节点情况)
     * @param MachineType 主机类型(普通节点情况)
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get 节点类型(
NORMAL: 普通节点
SUPER:超级节点
) 
     * @return NodeType 节点类型(
NORMAL: 普通节点
SUPER:超级节点
)
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点类型(
NORMAL: 普通节点
SUPER:超级节点
)
     * @param NodeType 节点类型(
NORMAL: 普通节点
SUPER:超级节点
)
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get uuid 
     * @return UUID uuid
     */
    public String getUUID() {
        return this.UUID;
    }

    /**
     * Set uuid
     * @param UUID uuid
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
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

    public ClusterNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterNodeInfo(ClusterNodeInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PrivateIpAddresses != null) {
            this.PrivateIpAddresses = new String(source.PrivateIpAddresses);
        }
        if (source.InstanceRole != null) {
            this.InstanceRole = new String(source.InstanceRole);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.AgentStatus != null) {
            this.AgentStatus = new String(source.AgentStatus);
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
        }
        if (source.HostID != null) {
            this.HostID = new String(source.HostID);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.UUID != null) {
            this.UUID = new String(source.UUID);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PrivateIpAddresses", this.PrivateIpAddresses);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "AgentStatus", this.AgentStatus);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "HostID", this.HostID);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "UUID", this.UUID);
        this.setParamSimple(map, prefix + "ChargeCoresCnt", this.ChargeCoresCnt);
        this.setParamSimple(map, prefix + "DefendStatus", this.DefendStatus);

    }
}

