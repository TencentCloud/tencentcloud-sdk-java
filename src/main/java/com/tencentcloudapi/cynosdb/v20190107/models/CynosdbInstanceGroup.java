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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CynosdbInstanceGroup extends AbstractModel {

    /**
    * 用户appId
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 删除时间
    */
    @SerializedName("DeletedTime")
    @Expose
    private String DeletedTime;

    /**
    * 实例组ID
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private String InstanceGroupId;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 实例组（网络）类型。ha-ha组；ro-只读组；proxy-代理；singleRo-只读实例独占
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 更新时间
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * 内网IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 内网端口
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 外网域名
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * 外网ip
    */
    @SerializedName("WanIP")
    @Expose
    private String WanIP;

    /**
    * 外网端口
    */
    @SerializedName("WanPort")
    @Expose
    private Long WanPort;

    /**
    * 外网状态
    */
    @SerializedName("WanStatus")
    @Expose
    private String WanStatus;

    /**
    * 实例组包含实例信息
    */
    @SerializedName("InstanceSet")
    @Expose
    private CynosdbInstance [] InstanceSet;

    /**
    * VPC的ID
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 子网ID
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * 正在回收IP信息
    */
    @SerializedName("OldAddrInfo")
    @Expose
    private OldAddrInfo OldAddrInfo;

    /**
    * 正在进行的任务
    */
    @SerializedName("ProcessingTasks")
    @Expose
    private String [] ProcessingTasks;

    /**
    * 任务列表
    */
    @SerializedName("Tasks")
    @Expose
    private ObjectTask [] Tasks;

    /**
    * biz_net_service表id
    */
    @SerializedName("NetServiceId")
    @Expose
    private Long NetServiceId;

    /**
     * Get 用户appId 
     * @return AppId 用户appId
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户appId
     * @param AppId 用户appId
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 创建时间 
     * @return CreatedTime 创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 删除时间 
     * @return DeletedTime 删除时间
     */
    public String getDeletedTime() {
        return this.DeletedTime;
    }

    /**
     * Set 删除时间
     * @param DeletedTime 删除时间
     */
    public void setDeletedTime(String DeletedTime) {
        this.DeletedTime = DeletedTime;
    }

    /**
     * Get 实例组ID 
     * @return InstanceGroupId 实例组ID
     */
    public String getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set 实例组ID
     * @param InstanceGroupId 实例组ID
     */
    public void setInstanceGroupId(String InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 实例组（网络）类型。ha-ha组；ro-只读组；proxy-代理；singleRo-只读实例独占 
     * @return Type 实例组（网络）类型。ha-ha组；ro-只读组；proxy-代理；singleRo-只读实例独占
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 实例组（网络）类型。ha-ha组；ro-只读组；proxy-代理；singleRo-只读实例独占
     * @param Type 实例组（网络）类型。ha-ha组；ro-只读组；proxy-代理；singleRo-只读实例独占
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 更新时间 
     * @return UpdatedTime 更新时间
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 更新时间
     * @param UpdatedTime 更新时间
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get 内网IP 
     * @return Vip 内网IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 内网IP
     * @param Vip 内网IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 内网端口 
     * @return Vport 内网端口
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 内网端口
     * @param Vport 内网端口
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 外网域名 
     * @return WanDomain 外网域名
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set 外网域名
     * @param WanDomain 外网域名
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    /**
     * Get 外网ip 
     * @return WanIP 外网ip
     */
    public String getWanIP() {
        return this.WanIP;
    }

    /**
     * Set 外网ip
     * @param WanIP 外网ip
     */
    public void setWanIP(String WanIP) {
        this.WanIP = WanIP;
    }

    /**
     * Get 外网端口 
     * @return WanPort 外网端口
     */
    public Long getWanPort() {
        return this.WanPort;
    }

    /**
     * Set 外网端口
     * @param WanPort 外网端口
     */
    public void setWanPort(Long WanPort) {
        this.WanPort = WanPort;
    }

    /**
     * Get 外网状态 
     * @return WanStatus 外网状态
     */
    public String getWanStatus() {
        return this.WanStatus;
    }

    /**
     * Set 外网状态
     * @param WanStatus 外网状态
     */
    public void setWanStatus(String WanStatus) {
        this.WanStatus = WanStatus;
    }

    /**
     * Get 实例组包含实例信息 
     * @return InstanceSet 实例组包含实例信息
     */
    public CynosdbInstance [] getInstanceSet() {
        return this.InstanceSet;
    }

    /**
     * Set 实例组包含实例信息
     * @param InstanceSet 实例组包含实例信息
     */
    public void setInstanceSet(CynosdbInstance [] InstanceSet) {
        this.InstanceSet = InstanceSet;
    }

    /**
     * Get VPC的ID 
     * @return UniqVpcId VPC的ID
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set VPC的ID
     * @param UniqVpcId VPC的ID
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 子网ID 
     * @return UniqSubnetId 子网ID
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set 子网ID
     * @param UniqSubnetId 子网ID
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get 正在回收IP信息 
     * @return OldAddrInfo 正在回收IP信息
     */
    public OldAddrInfo getOldAddrInfo() {
        return this.OldAddrInfo;
    }

    /**
     * Set 正在回收IP信息
     * @param OldAddrInfo 正在回收IP信息
     */
    public void setOldAddrInfo(OldAddrInfo OldAddrInfo) {
        this.OldAddrInfo = OldAddrInfo;
    }

    /**
     * Get 正在进行的任务 
     * @return ProcessingTasks 正在进行的任务
     */
    public String [] getProcessingTasks() {
        return this.ProcessingTasks;
    }

    /**
     * Set 正在进行的任务
     * @param ProcessingTasks 正在进行的任务
     */
    public void setProcessingTasks(String [] ProcessingTasks) {
        this.ProcessingTasks = ProcessingTasks;
    }

    /**
     * Get 任务列表 
     * @return Tasks 任务列表
     */
    public ObjectTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 任务列表
     * @param Tasks 任务列表
     */
    public void setTasks(ObjectTask [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get biz_net_service表id 
     * @return NetServiceId biz_net_service表id
     */
    public Long getNetServiceId() {
        return this.NetServiceId;
    }

    /**
     * Set biz_net_service表id
     * @param NetServiceId biz_net_service表id
     */
    public void setNetServiceId(Long NetServiceId) {
        this.NetServiceId = NetServiceId;
    }

    public CynosdbInstanceGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CynosdbInstanceGroup(CynosdbInstanceGroup source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.DeletedTime != null) {
            this.DeletedTime = new String(source.DeletedTime);
        }
        if (source.InstanceGroupId != null) {
            this.InstanceGroupId = new String(source.InstanceGroupId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.WanDomain != null) {
            this.WanDomain = new String(source.WanDomain);
        }
        if (source.WanIP != null) {
            this.WanIP = new String(source.WanIP);
        }
        if (source.WanPort != null) {
            this.WanPort = new Long(source.WanPort);
        }
        if (source.WanStatus != null) {
            this.WanStatus = new String(source.WanStatus);
        }
        if (source.InstanceSet != null) {
            this.InstanceSet = new CynosdbInstance[source.InstanceSet.length];
            for (int i = 0; i < source.InstanceSet.length; i++) {
                this.InstanceSet[i] = new CynosdbInstance(source.InstanceSet[i]);
            }
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.OldAddrInfo != null) {
            this.OldAddrInfo = new OldAddrInfo(source.OldAddrInfo);
        }
        if (source.ProcessingTasks != null) {
            this.ProcessingTasks = new String[source.ProcessingTasks.length];
            for (int i = 0; i < source.ProcessingTasks.length; i++) {
                this.ProcessingTasks[i] = new String(source.ProcessingTasks[i]);
            }
        }
        if (source.Tasks != null) {
            this.Tasks = new ObjectTask[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new ObjectTask(source.Tasks[i]);
            }
        }
        if (source.NetServiceId != null) {
            this.NetServiceId = new Long(source.NetServiceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "DeletedTime", this.DeletedTime);
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamSimple(map, prefix + "WanIP", this.WanIP);
        this.setParamSimple(map, prefix + "WanPort", this.WanPort);
        this.setParamSimple(map, prefix + "WanStatus", this.WanStatus);
        this.setParamArrayObj(map, prefix + "InstanceSet.", this.InstanceSet);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamObj(map, prefix + "OldAddrInfo.", this.OldAddrInfo);
        this.setParamArraySimple(map, prefix + "ProcessingTasks.", this.ProcessingTasks);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "NetServiceId", this.NetServiceId);

    }
}

