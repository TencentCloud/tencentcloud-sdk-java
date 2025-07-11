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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeInfos extends AbstractModel {

    /**
    * 节点名称
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 节点状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 节点ip
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 节点角色
    */
    @SerializedName("NodeRole")
    @Expose
    private String NodeRole;

    /**
    * 组件名
    */
    @SerializedName("ComponentName")
    @Expose
    private String ComponentName;

    /**
    * 上一次重启时间
    */
    @SerializedName("LastRestartTime")
    @Expose
    private String LastRestartTime;

    /**
    * id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

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
    * 计算组id
    */
    @SerializedName("ComputeGroupId")
    @Expose
    private String ComputeGroupId;

    /**
    * rip
    */
    @SerializedName("RIp")
    @Expose
    private String RIp;

    /**
    * 虚拟可用区
    */
    @SerializedName("VirtualZone")
    @Expose
    private String VirtualZone;

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
     * Get 节点状态 
     * @return Status 节点状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 节点状态
     * @param Status 节点状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 节点ip 
     * @return Ip 节点ip
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 节点ip
     * @param Ip 节点ip
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
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
     * Get 组件名 
     * @return ComponentName 组件名
     */
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set 组件名
     * @param ComponentName 组件名
     */
    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    /**
     * Get 上一次重启时间 
     * @return LastRestartTime 上一次重启时间
     */
    public String getLastRestartTime() {
        return this.LastRestartTime;
    }

    /**
     * Set 上一次重启时间
     * @param LastRestartTime 上一次重启时间
     */
    public void setLastRestartTime(String LastRestartTime) {
        this.LastRestartTime = LastRestartTime;
    }

    /**
     * Get id 
     * @return Id id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set id
     * @param Id id
     */
    public void setId(String Id) {
        this.Id = Id;
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
     * Get 计算组id 
     * @return ComputeGroupId 计算组id
     */
    public String getComputeGroupId() {
        return this.ComputeGroupId;
    }

    /**
     * Set 计算组id
     * @param ComputeGroupId 计算组id
     */
    public void setComputeGroupId(String ComputeGroupId) {
        this.ComputeGroupId = ComputeGroupId;
    }

    /**
     * Get rip 
     * @return RIp rip
     */
    public String getRIp() {
        return this.RIp;
    }

    /**
     * Set rip
     * @param RIp rip
     */
    public void setRIp(String RIp) {
        this.RIp = RIp;
    }

    /**
     * Get 虚拟可用区 
     * @return VirtualZone 虚拟可用区
     */
    public String getVirtualZone() {
        return this.VirtualZone;
    }

    /**
     * Set 虚拟可用区
     * @param VirtualZone 虚拟可用区
     */
    public void setVirtualZone(String VirtualZone) {
        this.VirtualZone = VirtualZone;
    }

    public NodeInfos() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeInfos(NodeInfos source) {
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.NodeRole != null) {
            this.NodeRole = new String(source.NodeRole);
        }
        if (source.ComponentName != null) {
            this.ComponentName = new String(source.ComponentName);
        }
        if (source.LastRestartTime != null) {
            this.LastRestartTime = new String(source.LastRestartTime);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ComputeGroupId != null) {
            this.ComputeGroupId = new String(source.ComputeGroupId);
        }
        if (source.RIp != null) {
            this.RIp = new String(source.RIp);
        }
        if (source.VirtualZone != null) {
            this.VirtualZone = new String(source.VirtualZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "NodeRole", this.NodeRole);
        this.setParamSimple(map, prefix + "ComponentName", this.ComponentName);
        this.setParamSimple(map, prefix + "LastRestartTime", this.LastRestartTime);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ComputeGroupId", this.ComputeGroupId);
        this.setParamSimple(map, prefix + "RIp", this.RIp);
        this.setParamSimple(map, prefix + "VirtualZone", this.VirtualZone);

    }
}

