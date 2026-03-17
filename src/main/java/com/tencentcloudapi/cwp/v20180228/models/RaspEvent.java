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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RaspEvent extends AbstractModel {

    /**
    * 漏洞事件id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 机器uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 机器quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 主机名
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 实例id
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 内网ip
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 公网ip
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 漏洞ID
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * 漏洞名称
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * cve编号
    */
    @SerializedName("CveId")
    @Expose
    private String CveId;

    /**
    * 攻击源ip
    */
    @SerializedName("SourceIp")
    @Expose
    private String SourceIp;

    /**
    * 攻击源ip地址所在城市
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 被攻击的端口
    */
    @SerializedName("AttackPort")
    @Expose
    private Long AttackPort;

    /**
    * 首次攻击时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最近攻击时间
    */
    @SerializedName("MergeTime")
    @Expose
    private String MergeTime;

    /**
    * 攻击次数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 状态 0: 待处理 1:已防御 2:已处理 3: 已忽略 4: 已删除 5: 已加白
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 应用攻击类型
    */
    @SerializedName("AttackTypeName")
    @Expose
    private String AttackTypeName;

    /**
    * 应用攻击类型id
    */
    @SerializedName("AttackType")
    @Expose
    private Long AttackType;

    /**
    * 节点名称
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 节点id
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * 容器名称
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * 容器id
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * 容器运行状态
    */
    @SerializedName("ContainerStatus")
    @Expose
    private String ContainerStatus;

    /**
    * 容器隔离状态
    */
    @SerializedName("ContainerNetStatus")
    @Expose
    private String ContainerNetStatus;

    /**
    * 镜像ID
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 镜像名称
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * pod名称
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * podip
    */
    @SerializedName("PodIp")
    @Expose
    private String PodIp;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 事件详情，包括poc
    */
    @SerializedName("RaspDetail")
    @Expose
    private String RaspDetail;

    /**
    * 普通节点：NORMAL
超级节点：SUPER
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 事件类型 1:攻击时间 2:防御成功
    */
    @SerializedName("EventType")
    @Expose
    private Long EventType;

    /**
    * 超级节点的唯一id
    */
    @SerializedName("NodeUniqueID")
    @Expose
    private String NodeUniqueID;

    /**
    * poc id
    */
    @SerializedName("PocID")
    @Expose
    private String PocID;

    /**
    * 请求url
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 恶意特征
    */
    @SerializedName("Poc")
    @Expose
    private String Poc;

    /**
     * Get 漏洞事件id 
     * @return Id 漏洞事件id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 漏洞事件id
     * @param Id 漏洞事件id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 机器uuid 
     * @return Uuid 机器uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 机器uuid
     * @param Uuid 机器uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 机器quuid 
     * @return Quuid 机器quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 机器quuid
     * @param Quuid 机器quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 主机名 
     * @return Alias 主机名
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 主机名
     * @param Alias 主机名
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 实例id 
     * @return InstanceID 实例id
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 实例id
     * @param InstanceID 实例id
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 内网ip 
     * @return PrivateIp 内网ip
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 内网ip
     * @param PrivateIp 内网ip
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get 公网ip 
     * @return PublicIp 公网ip
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 公网ip
     * @param PublicIp 公网ip
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 漏洞ID 
     * @return VulId 漏洞ID
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set 漏洞ID
     * @param VulId 漏洞ID
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get 漏洞名称 
     * @return VulName 漏洞名称
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set 漏洞名称
     * @param VulName 漏洞名称
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get cve编号 
     * @return CveId cve编号
     */
    public String getCveId() {
        return this.CveId;
    }

    /**
     * Set cve编号
     * @param CveId cve编号
     */
    public void setCveId(String CveId) {
        this.CveId = CveId;
    }

    /**
     * Get 攻击源ip 
     * @return SourceIp 攻击源ip
     */
    public String getSourceIp() {
        return this.SourceIp;
    }

    /**
     * Set 攻击源ip
     * @param SourceIp 攻击源ip
     */
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    /**
     * Get 攻击源ip地址所在城市 
     * @return City 攻击源ip地址所在城市
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 攻击源ip地址所在城市
     * @param City 攻击源ip地址所在城市
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 被攻击的端口 
     * @return AttackPort 被攻击的端口
     */
    public Long getAttackPort() {
        return this.AttackPort;
    }

    /**
     * Set 被攻击的端口
     * @param AttackPort 被攻击的端口
     */
    public void setAttackPort(Long AttackPort) {
        this.AttackPort = AttackPort;
    }

    /**
     * Get 首次攻击时间 
     * @return CreateTime 首次攻击时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 首次攻击时间
     * @param CreateTime 首次攻击时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最近攻击时间 
     * @return MergeTime 最近攻击时间
     */
    public String getMergeTime() {
        return this.MergeTime;
    }

    /**
     * Set 最近攻击时间
     * @param MergeTime 最近攻击时间
     */
    public void setMergeTime(String MergeTime) {
        this.MergeTime = MergeTime;
    }

    /**
     * Get 攻击次数 
     * @return Count 攻击次数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 攻击次数
     * @param Count 攻击次数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 状态 0: 待处理 1:已防御 2:已处理 3: 已忽略 4: 已删除 5: 已加白 
     * @return Status 状态 0: 待处理 1:已防御 2:已处理 3: 已忽略 4: 已删除 5: 已加白
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态 0: 待处理 1:已防御 2:已处理 3: 已忽略 4: 已删除 5: 已加白
     * @param Status 状态 0: 待处理 1:已防御 2:已处理 3: 已忽略 4: 已删除 5: 已加白
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 应用攻击类型 
     * @return AttackTypeName 应用攻击类型
     */
    public String getAttackTypeName() {
        return this.AttackTypeName;
    }

    /**
     * Set 应用攻击类型
     * @param AttackTypeName 应用攻击类型
     */
    public void setAttackTypeName(String AttackTypeName) {
        this.AttackTypeName = AttackTypeName;
    }

    /**
     * Get 应用攻击类型id 
     * @return AttackType 应用攻击类型id
     */
    public Long getAttackType() {
        return this.AttackType;
    }

    /**
     * Set 应用攻击类型id
     * @param AttackType 应用攻击类型id
     */
    public void setAttackType(Long AttackType) {
        this.AttackType = AttackType;
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
     * Get 节点id 
     * @return NodeId 节点id
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 节点id
     * @param NodeId 节点id
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 容器名称 
     * @return ContainerName 容器名称
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set 容器名称
     * @param ContainerName 容器名称
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get 容器id 
     * @return ContainerId 容器id
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set 容器id
     * @param ContainerId 容器id
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get 容器运行状态 
     * @return ContainerStatus 容器运行状态
     */
    public String getContainerStatus() {
        return this.ContainerStatus;
    }

    /**
     * Set 容器运行状态
     * @param ContainerStatus 容器运行状态
     */
    public void setContainerStatus(String ContainerStatus) {
        this.ContainerStatus = ContainerStatus;
    }

    /**
     * Get 容器隔离状态 
     * @return ContainerNetStatus 容器隔离状态
     */
    public String getContainerNetStatus() {
        return this.ContainerNetStatus;
    }

    /**
     * Set 容器隔离状态
     * @param ContainerNetStatus 容器隔离状态
     */
    public void setContainerNetStatus(String ContainerNetStatus) {
        this.ContainerNetStatus = ContainerNetStatus;
    }

    /**
     * Get 镜像ID 
     * @return ImageId 镜像ID
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像ID
     * @param ImageId 镜像ID
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 镜像名称 
     * @return ImageName 镜像名称
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 镜像名称
     * @param ImageName 镜像名称
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get pod名称 
     * @return PodName pod名称
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set pod名称
     * @param PodName pod名称
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get podip 
     * @return PodIp podip
     */
    public String getPodIp() {
        return this.PodIp;
    }

    /**
     * Set podip
     * @param PodIp podip
     */
    public void setPodIp(String PodIp) {
        this.PodIp = PodIp;
    }

    /**
     * Get 集群名称 
     * @return ClusterName 集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
     * @param ClusterName 集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 集群id 
     * @return ClusterId 集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
     * @param ClusterId 集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 事件详情，包括poc 
     * @return RaspDetail 事件详情，包括poc
     */
    public String getRaspDetail() {
        return this.RaspDetail;
    }

    /**
     * Set 事件详情，包括poc
     * @param RaspDetail 事件详情，包括poc
     */
    public void setRaspDetail(String RaspDetail) {
        this.RaspDetail = RaspDetail;
    }

    /**
     * Get 普通节点：NORMAL
超级节点：SUPER 
     * @return NodeType 普通节点：NORMAL
超级节点：SUPER
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 普通节点：NORMAL
超级节点：SUPER
     * @param NodeType 普通节点：NORMAL
超级节点：SUPER
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 事件类型 1:攻击时间 2:防御成功 
     * @return EventType 事件类型 1:攻击时间 2:防御成功
     */
    public Long getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类型 1:攻击时间 2:防御成功
     * @param EventType 事件类型 1:攻击时间 2:防御成功
     */
    public void setEventType(Long EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 超级节点的唯一id 
     * @return NodeUniqueID 超级节点的唯一id
     */
    public String getNodeUniqueID() {
        return this.NodeUniqueID;
    }

    /**
     * Set 超级节点的唯一id
     * @param NodeUniqueID 超级节点的唯一id
     */
    public void setNodeUniqueID(String NodeUniqueID) {
        this.NodeUniqueID = NodeUniqueID;
    }

    /**
     * Get poc id 
     * @return PocID poc id
     */
    public String getPocID() {
        return this.PocID;
    }

    /**
     * Set poc id
     * @param PocID poc id
     */
    public void setPocID(String PocID) {
        this.PocID = PocID;
    }

    /**
     * Get 请求url 
     * @return Url 请求url
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 请求url
     * @param Url 请求url
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 恶意特征 
     * @return Poc 恶意特征
     */
    public String getPoc() {
        return this.Poc;
    }

    /**
     * Set 恶意特征
     * @param Poc 恶意特征
     */
    public void setPoc(String Poc) {
        this.Poc = Poc;
    }

    public RaspEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RaspEvent(RaspEvent source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.CveId != null) {
            this.CveId = new String(source.CveId);
        }
        if (source.SourceIp != null) {
            this.SourceIp = new String(source.SourceIp);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.AttackPort != null) {
            this.AttackPort = new Long(source.AttackPort);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.MergeTime != null) {
            this.MergeTime = new String(source.MergeTime);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.AttackTypeName != null) {
            this.AttackTypeName = new String(source.AttackTypeName);
        }
        if (source.AttackType != null) {
            this.AttackType = new Long(source.AttackType);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.ContainerStatus != null) {
            this.ContainerStatus = new String(source.ContainerStatus);
        }
        if (source.ContainerNetStatus != null) {
            this.ContainerNetStatus = new String(source.ContainerNetStatus);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.PodIp != null) {
            this.PodIp = new String(source.PodIp);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.RaspDetail != null) {
            this.RaspDetail = new String(source.RaspDetail);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.EventType != null) {
            this.EventType = new Long(source.EventType);
        }
        if (source.NodeUniqueID != null) {
            this.NodeUniqueID = new String(source.NodeUniqueID);
        }
        if (source.PocID != null) {
            this.PocID = new String(source.PocID);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Poc != null) {
            this.Poc = new String(source.Poc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "CveId", this.CveId);
        this.setParamSimple(map, prefix + "SourceIp", this.SourceIp);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "AttackPort", this.AttackPort);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MergeTime", this.MergeTime);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AttackTypeName", this.AttackTypeName);
        this.setParamSimple(map, prefix + "AttackType", this.AttackType);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "ContainerStatus", this.ContainerStatus);
        this.setParamSimple(map, prefix + "ContainerNetStatus", this.ContainerNetStatus);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "PodIp", this.PodIp);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "RaspDetail", this.RaspDetail);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "NodeUniqueID", this.NodeUniqueID);
        this.setParamSimple(map, prefix + "PocID", this.PocID);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Poc", this.Poc);

    }
}

