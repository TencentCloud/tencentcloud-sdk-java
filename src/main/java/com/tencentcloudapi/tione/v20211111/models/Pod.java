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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Pod extends AbstractModel {

    /**
    * <p>pod名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>pod的唯一id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * <p>服务付费模式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * <p>pod的状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Phase")
    @Expose
    private String Phase;

    /**
    * <p>pod的IP</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * <p>pod的创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>容器列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Containers")
    @Expose
    private Container Containers;

    /**
    * <p>容器列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerInfos")
    @Expose
    private Container [] ContainerInfos;

    /**
    * <p>容器调用信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CrossTenantENIInfo")
    @Expose
    private CrossTenantENIInfo CrossTenantENIInfo;

    /**
    * <p>实例的状态信息</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>实例的开始调度时间</p>
    */
    @SerializedName("StartScheduleTime")
    @Expose
    private String StartScheduleTime;

    /**
    * <p>实例状态的补充信息</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>当前实例所在的节点 IP</p>
    */
    @SerializedName("NodeIP")
    @Expose
    private String NodeIP;

    /**
    * <p>当前实例所在节点id</p>
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * <p>当时实例所属资源组 id</p>
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * <p>资源组名称</p>
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * <p>实例的资源占用信息</p>
    */
    @SerializedName("ResourceInfo")
    @Expose
    private ResourceInfo ResourceInfo;

    /**
     * Get <p>pod名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>pod名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>pod名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>pod名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>pod的唯一id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uid <p>pod的唯一id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set <p>pod的唯一id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uid <p>pod的唯一id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get <p>服务付费模式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChargeType <p>服务付费模式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set <p>服务付费模式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChargeType <p>服务付费模式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get <p>pod的状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Phase <p>pod的状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhase() {
        return this.Phase;
    }

    /**
     * Set <p>pod的状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Phase <p>pod的状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhase(String Phase) {
        this.Phase = Phase;
    }

    /**
     * Get <p>pod的IP</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IP <p>pod的IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set <p>pod的IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IP <p>pod的IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get <p>pod的创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>pod的创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>pod的创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>pod的创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>容器列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Containers <p>容器列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Container getContainers() {
        return this.Containers;
    }

    /**
     * Set <p>容器列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Containers <p>容器列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setContainers(Container Containers) {
        this.Containers = Containers;
    }

    /**
     * Get <p>容器列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerInfos <p>容器列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Container [] getContainerInfos() {
        return this.ContainerInfos;
    }

    /**
     * Set <p>容器列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerInfos <p>容器列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerInfos(Container [] ContainerInfos) {
        this.ContainerInfos = ContainerInfos;
    }

    /**
     * Get <p>容器调用信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CrossTenantENIInfo <p>容器调用信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CrossTenantENIInfo getCrossTenantENIInfo() {
        return this.CrossTenantENIInfo;
    }

    /**
     * Set <p>容器调用信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CrossTenantENIInfo <p>容器调用信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCrossTenantENIInfo(CrossTenantENIInfo CrossTenantENIInfo) {
        this.CrossTenantENIInfo = CrossTenantENIInfo;
    }

    /**
     * Get <p>实例的状态信息</p> 
     * @return Status <p>实例的状态信息</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实例的状态信息</p>
     * @param Status <p>实例的状态信息</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>实例的开始调度时间</p> 
     * @return StartScheduleTime <p>实例的开始调度时间</p>
     */
    public String getStartScheduleTime() {
        return this.StartScheduleTime;
    }

    /**
     * Set <p>实例的开始调度时间</p>
     * @param StartScheduleTime <p>实例的开始调度时间</p>
     */
    public void setStartScheduleTime(String StartScheduleTime) {
        this.StartScheduleTime = StartScheduleTime;
    }

    /**
     * Get <p>实例状态的补充信息</p> 
     * @return Message <p>实例状态的补充信息</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>实例状态的补充信息</p>
     * @param Message <p>实例状态的补充信息</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>当前实例所在的节点 IP</p> 
     * @return NodeIP <p>当前实例所在的节点 IP</p>
     */
    public String getNodeIP() {
        return this.NodeIP;
    }

    /**
     * Set <p>当前实例所在的节点 IP</p>
     * @param NodeIP <p>当前实例所在的节点 IP</p>
     */
    public void setNodeIP(String NodeIP) {
        this.NodeIP = NodeIP;
    }

    /**
     * Get <p>当前实例所在节点id</p> 
     * @return NodeId <p>当前实例所在节点id</p>
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set <p>当前实例所在节点id</p>
     * @param NodeId <p>当前实例所在节点id</p>
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get <p>当时实例所属资源组 id</p> 
     * @return ResourceGroupId <p>当时实例所属资源组 id</p>
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set <p>当时实例所属资源组 id</p>
     * @param ResourceGroupId <p>当时实例所属资源组 id</p>
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get <p>资源组名称</p> 
     * @return ResourceGroupName <p>资源组名称</p>
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set <p>资源组名称</p>
     * @param ResourceGroupName <p>资源组名称</p>
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    /**
     * Get <p>实例的资源占用信息</p> 
     * @return ResourceInfo <p>实例的资源占用信息</p>
     */
    public ResourceInfo getResourceInfo() {
        return this.ResourceInfo;
    }

    /**
     * Set <p>实例的资源占用信息</p>
     * @param ResourceInfo <p>实例的资源占用信息</p>
     */
    public void setResourceInfo(ResourceInfo ResourceInfo) {
        this.ResourceInfo = ResourceInfo;
    }

    public Pod() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Pod(Pod source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Uid != null) {
            this.Uid = new String(source.Uid);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.Phase != null) {
            this.Phase = new String(source.Phase);
        }
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Containers != null) {
            this.Containers = new Container(source.Containers);
        }
        if (source.ContainerInfos != null) {
            this.ContainerInfos = new Container[source.ContainerInfos.length];
            for (int i = 0; i < source.ContainerInfos.length; i++) {
                this.ContainerInfos[i] = new Container(source.ContainerInfos[i]);
            }
        }
        if (source.CrossTenantENIInfo != null) {
            this.CrossTenantENIInfo = new CrossTenantENIInfo(source.CrossTenantENIInfo);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StartScheduleTime != null) {
            this.StartScheduleTime = new String(source.StartScheduleTime);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.NodeIP != null) {
            this.NodeIP = new String(source.NodeIP);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
        }
        if (source.ResourceInfo != null) {
            this.ResourceInfo = new ResourceInfo(source.ResourceInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "Phase", this.Phase);
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamObj(map, prefix + "Containers.", this.Containers);
        this.setParamArrayObj(map, prefix + "ContainerInfos.", this.ContainerInfos);
        this.setParamObj(map, prefix + "CrossTenantENIInfo.", this.CrossTenantENIInfo);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartScheduleTime", this.StartScheduleTime);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "NodeIP", this.NodeIP);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);
        this.setParamObj(map, prefix + "ResourceInfo.", this.ResourceInfo);

    }
}

