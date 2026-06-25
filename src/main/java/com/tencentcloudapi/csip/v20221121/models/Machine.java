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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Machine extends AbstractModel {

    /**
    * <p>Agent状态，取值：ONLINE-在线，OFFLINE-离线，UNINSTALL-未安装</p>
    */
    @SerializedName("AgentStatus")
    @Expose
    private String AgentStatus;

    /**
    * <p>Agent版本</p>
    */
    @SerializedName("AgentVersion")
    @Expose
    private String AgentVersion;

    /**
    * <p>账号AppId</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>云服务商</p>
    */
    @SerializedName("CloudFromEnum")
    @Expose
    private String CloudFromEnum;

    /**
    * <p>云标签列表</p>
    */
    @SerializedName("CloudTags")
    @Expose
    private Tag [] CloudTags;

    /**
    * <p>CSIP防护类型，取值：BASIC-基础版，PRO-专业版，ULTIMATE-旗舰版</p>
    */
    @SerializedName("CsipProtectType")
    @Expose
    private String CsipProtectType;

    /**
    * <p>暴露状态</p>
    */
    @SerializedName("ExposedStatus")
    @Expose
    private String ExposedStatus;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>实例状态，取值：RUNNING-运行中，STOPPED-已关机，EXPIRED-待回收</p>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * <p>网卡IP列表</p>
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
    * <p>是否为新增主机（15天内新增）</p>
    */
    @SerializedName("IsNew")
    @Expose
    private Boolean IsNew;

    /**
    * <p>内核版本</p>
    */
    @SerializedName("KernelVersion")
    @Expose
    private String KernelVersion;

    /**
    * <p>最近一次离线时间（Unix时间戳）</p>
    */
    @SerializedName("LatestOfflineTime")
    @Expose
    private Long LatestOfflineTime;

    /**
    * <p>内网IP</p>
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * <p>主机名称</p>
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * <p>操作系统</p>
    */
    @SerializedName("MachineOs")
    @Expose
    private String MachineOs;

    /**
    * <p>外网IP</p>
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * <p>付费模式，取值：PREPAID-预付费，POSTPAID-后付费</p>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>防护类型，取值：NONE-无防护，BASIC-基础版，PRO-专业版，ULTIMATE-旗舰版，PRO_LH-轻量版</p>
    */
    @SerializedName("ProtectType")
    @Expose
    private String ProtectType;

    /**
    * <p>主机唯一标识</p>
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * <p>地域信息</p>
    */
    @SerializedName("RegionInfo")
    @Expose
    private RegionInfo RegionInfo;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>资产标签列表</p>
    */
    @SerializedName("TagItems")
    @Expose
    private MiniTagItem [] TagItems;

    /**
    * <p>标签修改信息</p>
    */
    @SerializedName("TagModifyInfo")
    @Expose
    private AssetTagModifyAssetItem TagModifyInfo;

    /**
    * <p>TAT状态，取值：ONLINE-在线，OFFLINE-离线</p>
    */
    @SerializedName("TatStatus")
    @Expose
    private String TatStatus;

    /**
    * <p>Agent唯一标识</p>
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * <p>VPC ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>主机节点类型</p><p>枚举值：</p><ul><li>NONE： 主机节点</li><li>CLUSTER： 集群节点</li><li>CONTAINER： 容器节点</li></ul>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>容器防护状态</p><p>枚举值：</p><ul><li>Enabled： 开启防护</li><li>Disabled： 关闭防护</li><li>Unknown： 未知</li></ul>
    */
    @SerializedName("ContainerDefendStatus")
    @Expose
    private String ContainerDefendStatus;

    /**
    * <p>容器数量</p>
    */
    @SerializedName("ContainerCount")
    @Expose
    private Long ContainerCount;

    /**
    * <p>核数</p>
    */
    @SerializedName("CpuCoreCount")
    @Expose
    private Long CpuCoreCount;

    /**
     * Get <p>Agent状态，取值：ONLINE-在线，OFFLINE-离线，UNINSTALL-未安装</p> 
     * @return AgentStatus <p>Agent状态，取值：ONLINE-在线，OFFLINE-离线，UNINSTALL-未安装</p>
     */
    public String getAgentStatus() {
        return this.AgentStatus;
    }

    /**
     * Set <p>Agent状态，取值：ONLINE-在线，OFFLINE-离线，UNINSTALL-未安装</p>
     * @param AgentStatus <p>Agent状态，取值：ONLINE-在线，OFFLINE-离线，UNINSTALL-未安装</p>
     */
    public void setAgentStatus(String AgentStatus) {
        this.AgentStatus = AgentStatus;
    }

    /**
     * Get <p>Agent版本</p> 
     * @return AgentVersion <p>Agent版本</p>
     */
    public String getAgentVersion() {
        return this.AgentVersion;
    }

    /**
     * Set <p>Agent版本</p>
     * @param AgentVersion <p>Agent版本</p>
     */
    public void setAgentVersion(String AgentVersion) {
        this.AgentVersion = AgentVersion;
    }

    /**
     * Get <p>账号AppId</p> 
     * @return AppId <p>账号AppId</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>账号AppId</p>
     * @param AppId <p>账号AppId</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>云服务商</p> 
     * @return CloudFromEnum <p>云服务商</p>
     */
    public String getCloudFromEnum() {
        return this.CloudFromEnum;
    }

    /**
     * Set <p>云服务商</p>
     * @param CloudFromEnum <p>云服务商</p>
     */
    public void setCloudFromEnum(String CloudFromEnum) {
        this.CloudFromEnum = CloudFromEnum;
    }

    /**
     * Get <p>云标签列表</p> 
     * @return CloudTags <p>云标签列表</p>
     */
    public Tag [] getCloudTags() {
        return this.CloudTags;
    }

    /**
     * Set <p>云标签列表</p>
     * @param CloudTags <p>云标签列表</p>
     */
    public void setCloudTags(Tag [] CloudTags) {
        this.CloudTags = CloudTags;
    }

    /**
     * Get <p>CSIP防护类型，取值：BASIC-基础版，PRO-专业版，ULTIMATE-旗舰版</p> 
     * @return CsipProtectType <p>CSIP防护类型，取值：BASIC-基础版，PRO-专业版，ULTIMATE-旗舰版</p>
     */
    public String getCsipProtectType() {
        return this.CsipProtectType;
    }

    /**
     * Set <p>CSIP防护类型，取值：BASIC-基础版，PRO-专业版，ULTIMATE-旗舰版</p>
     * @param CsipProtectType <p>CSIP防护类型，取值：BASIC-基础版，PRO-专业版，ULTIMATE-旗舰版</p>
     */
    public void setCsipProtectType(String CsipProtectType) {
        this.CsipProtectType = CsipProtectType;
    }

    /**
     * Get <p>暴露状态</p> 
     * @return ExposedStatus <p>暴露状态</p>
     */
    public String getExposedStatus() {
        return this.ExposedStatus;
    }

    /**
     * Set <p>暴露状态</p>
     * @param ExposedStatus <p>暴露状态</p>
     */
    public void setExposedStatus(String ExposedStatus) {
        this.ExposedStatus = ExposedStatus;
    }

    /**
     * Get <p>实例ID</p> 
     * @return InstanceID <p>实例ID</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceID <p>实例ID</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>实例状态，取值：RUNNING-运行中，STOPPED-已关机，EXPIRED-待回收</p> 
     * @return InstanceStatus <p>实例状态，取值：RUNNING-运行中，STOPPED-已关机，EXPIRED-待回收</p>
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>实例状态，取值：RUNNING-运行中，STOPPED-已关机，EXPIRED-待回收</p>
     * @param InstanceStatus <p>实例状态，取值：RUNNING-运行中，STOPPED-已关机，EXPIRED-待回收</p>
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get <p>网卡IP列表</p> 
     * @return IpList <p>网卡IP列表</p>
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set <p>网卡IP列表</p>
     * @param IpList <p>网卡IP列表</p>
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    /**
     * Get <p>是否为新增主机（15天内新增）</p> 
     * @return IsNew <p>是否为新增主机（15天内新增）</p>
     */
    public Boolean getIsNew() {
        return this.IsNew;
    }

    /**
     * Set <p>是否为新增主机（15天内新增）</p>
     * @param IsNew <p>是否为新增主机（15天内新增）</p>
     */
    public void setIsNew(Boolean IsNew) {
        this.IsNew = IsNew;
    }

    /**
     * Get <p>内核版本</p> 
     * @return KernelVersion <p>内核版本</p>
     */
    public String getKernelVersion() {
        return this.KernelVersion;
    }

    /**
     * Set <p>内核版本</p>
     * @param KernelVersion <p>内核版本</p>
     */
    public void setKernelVersion(String KernelVersion) {
        this.KernelVersion = KernelVersion;
    }

    /**
     * Get <p>最近一次离线时间（Unix时间戳）</p> 
     * @return LatestOfflineTime <p>最近一次离线时间（Unix时间戳）</p>
     */
    public Long getLatestOfflineTime() {
        return this.LatestOfflineTime;
    }

    /**
     * Set <p>最近一次离线时间（Unix时间戳）</p>
     * @param LatestOfflineTime <p>最近一次离线时间（Unix时间戳）</p>
     */
    public void setLatestOfflineTime(Long LatestOfflineTime) {
        this.LatestOfflineTime = LatestOfflineTime;
    }

    /**
     * Get <p>内网IP</p> 
     * @return MachineIp <p>内网IP</p>
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set <p>内网IP</p>
     * @param MachineIp <p>内网IP</p>
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get <p>主机名称</p> 
     * @return MachineName <p>主机名称</p>
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set <p>主机名称</p>
     * @param MachineName <p>主机名称</p>
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get <p>操作系统</p> 
     * @return MachineOs <p>操作系统</p>
     */
    public String getMachineOs() {
        return this.MachineOs;
    }

    /**
     * Set <p>操作系统</p>
     * @param MachineOs <p>操作系统</p>
     */
    public void setMachineOs(String MachineOs) {
        this.MachineOs = MachineOs;
    }

    /**
     * Get <p>外网IP</p> 
     * @return MachineWanIp <p>外网IP</p>
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set <p>外网IP</p>
     * @param MachineWanIp <p>外网IP</p>
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get <p>付费模式，取值：PREPAID-预付费，POSTPAID-后付费</p> 
     * @return PayMode <p>付费模式，取值：PREPAID-预付费，POSTPAID-后付费</p>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>付费模式，取值：PREPAID-预付费，POSTPAID-后付费</p>
     * @param PayMode <p>付费模式，取值：PREPAID-预付费，POSTPAID-后付费</p>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>项目ID</p> 
     * @return ProjectId <p>项目ID</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
     * @param ProjectId <p>项目ID</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>防护类型，取值：NONE-无防护，BASIC-基础版，PRO-专业版，ULTIMATE-旗舰版，PRO_LH-轻量版</p> 
     * @return ProtectType <p>防护类型，取值：NONE-无防护，BASIC-基础版，PRO-专业版，ULTIMATE-旗舰版，PRO_LH-轻量版</p>
     */
    public String getProtectType() {
        return this.ProtectType;
    }

    /**
     * Set <p>防护类型，取值：NONE-无防护，BASIC-基础版，PRO-专业版，ULTIMATE-旗舰版，PRO_LH-轻量版</p>
     * @param ProtectType <p>防护类型，取值：NONE-无防护，BASIC-基础版，PRO-专业版，ULTIMATE-旗舰版，PRO_LH-轻量版</p>
     */
    public void setProtectType(String ProtectType) {
        this.ProtectType = ProtectType;
    }

    /**
     * Get <p>主机唯一标识</p> 
     * @return Quuid <p>主机唯一标识</p>
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set <p>主机唯一标识</p>
     * @param Quuid <p>主机唯一标识</p>
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get <p>地域信息</p> 
     * @return RegionInfo <p>地域信息</p>
     */
    public RegionInfo getRegionInfo() {
        return this.RegionInfo;
    }

    /**
     * Set <p>地域信息</p>
     * @param RegionInfo <p>地域信息</p>
     */
    public void setRegionInfo(RegionInfo RegionInfo) {
        this.RegionInfo = RegionInfo;
    }

    /**
     * Get <p>备注</p> 
     * @return Remark <p>备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
     * @param Remark <p>备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>资产标签列表</p> 
     * @return TagItems <p>资产标签列表</p>
     */
    public MiniTagItem [] getTagItems() {
        return this.TagItems;
    }

    /**
     * Set <p>资产标签列表</p>
     * @param TagItems <p>资产标签列表</p>
     */
    public void setTagItems(MiniTagItem [] TagItems) {
        this.TagItems = TagItems;
    }

    /**
     * Get <p>标签修改信息</p> 
     * @return TagModifyInfo <p>标签修改信息</p>
     */
    public AssetTagModifyAssetItem getTagModifyInfo() {
        return this.TagModifyInfo;
    }

    /**
     * Set <p>标签修改信息</p>
     * @param TagModifyInfo <p>标签修改信息</p>
     */
    public void setTagModifyInfo(AssetTagModifyAssetItem TagModifyInfo) {
        this.TagModifyInfo = TagModifyInfo;
    }

    /**
     * Get <p>TAT状态，取值：ONLINE-在线，OFFLINE-离线</p> 
     * @return TatStatus <p>TAT状态，取值：ONLINE-在线，OFFLINE-离线</p>
     */
    public String getTatStatus() {
        return this.TatStatus;
    }

    /**
     * Set <p>TAT状态，取值：ONLINE-在线，OFFLINE-离线</p>
     * @param TatStatus <p>TAT状态，取值：ONLINE-在线，OFFLINE-离线</p>
     */
    public void setTatStatus(String TatStatus) {
        this.TatStatus = TatStatus;
    }

    /**
     * Get <p>Agent唯一标识</p> 
     * @return Uuid <p>Agent唯一标识</p>
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set <p>Agent唯一标识</p>
     * @param Uuid <p>Agent唯一标识</p>
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get <p>VPC ID</p> 
     * @return VpcId <p>VPC ID</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC ID</p>
     * @param VpcId <p>VPC ID</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>主机节点类型</p><p>枚举值：</p><ul><li>NONE： 主机节点</li><li>CLUSTER： 集群节点</li><li>CONTAINER： 容器节点</li></ul> 
     * @return NodeType <p>主机节点类型</p><p>枚举值：</p><ul><li>NONE： 主机节点</li><li>CLUSTER： 集群节点</li><li>CONTAINER： 容器节点</li></ul>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>主机节点类型</p><p>枚举值：</p><ul><li>NONE： 主机节点</li><li>CLUSTER： 集群节点</li><li>CONTAINER： 容器节点</li></ul>
     * @param NodeType <p>主机节点类型</p><p>枚举值：</p><ul><li>NONE： 主机节点</li><li>CLUSTER： 集群节点</li><li>CONTAINER： 容器节点</li></ul>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>容器防护状态</p><p>枚举值：</p><ul><li>Enabled： 开启防护</li><li>Disabled： 关闭防护</li><li>Unknown： 未知</li></ul> 
     * @return ContainerDefendStatus <p>容器防护状态</p><p>枚举值：</p><ul><li>Enabled： 开启防护</li><li>Disabled： 关闭防护</li><li>Unknown： 未知</li></ul>
     */
    public String getContainerDefendStatus() {
        return this.ContainerDefendStatus;
    }

    /**
     * Set <p>容器防护状态</p><p>枚举值：</p><ul><li>Enabled： 开启防护</li><li>Disabled： 关闭防护</li><li>Unknown： 未知</li></ul>
     * @param ContainerDefendStatus <p>容器防护状态</p><p>枚举值：</p><ul><li>Enabled： 开启防护</li><li>Disabled： 关闭防护</li><li>Unknown： 未知</li></ul>
     */
    public void setContainerDefendStatus(String ContainerDefendStatus) {
        this.ContainerDefendStatus = ContainerDefendStatus;
    }

    /**
     * Get <p>容器数量</p> 
     * @return ContainerCount <p>容器数量</p>
     */
    public Long getContainerCount() {
        return this.ContainerCount;
    }

    /**
     * Set <p>容器数量</p>
     * @param ContainerCount <p>容器数量</p>
     */
    public void setContainerCount(Long ContainerCount) {
        this.ContainerCount = ContainerCount;
    }

    /**
     * Get <p>核数</p> 
     * @return CpuCoreCount <p>核数</p>
     */
    public Long getCpuCoreCount() {
        return this.CpuCoreCount;
    }

    /**
     * Set <p>核数</p>
     * @param CpuCoreCount <p>核数</p>
     */
    public void setCpuCoreCount(Long CpuCoreCount) {
        this.CpuCoreCount = CpuCoreCount;
    }

    public Machine() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Machine(Machine source) {
        if (source.AgentStatus != null) {
            this.AgentStatus = new String(source.AgentStatus);
        }
        if (source.AgentVersion != null) {
            this.AgentVersion = new String(source.AgentVersion);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.CloudFromEnum != null) {
            this.CloudFromEnum = new String(source.CloudFromEnum);
        }
        if (source.CloudTags != null) {
            this.CloudTags = new Tag[source.CloudTags.length];
            for (int i = 0; i < source.CloudTags.length; i++) {
                this.CloudTags[i] = new Tag(source.CloudTags[i]);
            }
        }
        if (source.CsipProtectType != null) {
            this.CsipProtectType = new String(source.CsipProtectType);
        }
        if (source.ExposedStatus != null) {
            this.ExposedStatus = new String(source.ExposedStatus);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.IpList != null) {
            this.IpList = new String[source.IpList.length];
            for (int i = 0; i < source.IpList.length; i++) {
                this.IpList[i] = new String(source.IpList[i]);
            }
        }
        if (source.IsNew != null) {
            this.IsNew = new Boolean(source.IsNew);
        }
        if (source.KernelVersion != null) {
            this.KernelVersion = new String(source.KernelVersion);
        }
        if (source.LatestOfflineTime != null) {
            this.LatestOfflineTime = new Long(source.LatestOfflineTime);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.MachineOs != null) {
            this.MachineOs = new String(source.MachineOs);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ProtectType != null) {
            this.ProtectType = new String(source.ProtectType);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.RegionInfo != null) {
            this.RegionInfo = new RegionInfo(source.RegionInfo);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.TagItems != null) {
            this.TagItems = new MiniTagItem[source.TagItems.length];
            for (int i = 0; i < source.TagItems.length; i++) {
                this.TagItems[i] = new MiniTagItem(source.TagItems[i]);
            }
        }
        if (source.TagModifyInfo != null) {
            this.TagModifyInfo = new AssetTagModifyAssetItem(source.TagModifyInfo);
        }
        if (source.TatStatus != null) {
            this.TatStatus = new String(source.TatStatus);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.ContainerDefendStatus != null) {
            this.ContainerDefendStatus = new String(source.ContainerDefendStatus);
        }
        if (source.ContainerCount != null) {
            this.ContainerCount = new Long(source.ContainerCount);
        }
        if (source.CpuCoreCount != null) {
            this.CpuCoreCount = new Long(source.CpuCoreCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentStatus", this.AgentStatus);
        this.setParamSimple(map, prefix + "AgentVersion", this.AgentVersion);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "CloudFromEnum", this.CloudFromEnum);
        this.setParamArrayObj(map, prefix + "CloudTags.", this.CloudTags);
        this.setParamSimple(map, prefix + "CsipProtectType", this.CsipProtectType);
        this.setParamSimple(map, prefix + "ExposedStatus", this.ExposedStatus);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);
        this.setParamSimple(map, prefix + "IsNew", this.IsNew);
        this.setParamSimple(map, prefix + "KernelVersion", this.KernelVersion);
        this.setParamSimple(map, prefix + "LatestOfflineTime", this.LatestOfflineTime);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachineOs", this.MachineOs);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProtectType", this.ProtectType);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamObj(map, prefix + "RegionInfo.", this.RegionInfo);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "TagItems.", this.TagItems);
        this.setParamObj(map, prefix + "TagModifyInfo.", this.TagModifyInfo);
        this.setParamSimple(map, prefix + "TatStatus", this.TatStatus);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "ContainerDefendStatus", this.ContainerDefendStatus);
        this.setParamSimple(map, prefix + "ContainerCount", this.ContainerCount);
        this.setParamSimple(map, prefix + "CpuCoreCount", this.CpuCoreCount);

    }
}

