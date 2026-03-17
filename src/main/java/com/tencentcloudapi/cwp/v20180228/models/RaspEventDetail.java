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

public class RaspEventDetail extends AbstractModel {

    /**
    * 漏洞事件id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 状态 0: 待处理 1:已防御 2:已处理 3: 已忽略 4: 已删除 5: 已加白
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 机器quuid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 主机名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 实例id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 内网ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 公网ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 资产tag
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostTags")
    @Expose
    private String [] HostTags;

    /**
    * 首次攻击时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最近攻击时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MergeTime")
    @Expose
    private String MergeTime;

    /**
    * 应用攻击类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttackTypeName")
    @Expose
    private String AttackTypeName;

    /**
    * 应用攻击类型id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttackType")
    @Expose
    private Long AttackType;

    /**
    * 请求url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 漏洞名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * 攻击次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * cve编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CveId")
    @Expose
    private String CveId;

    /**
    * 攻击源ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceIp")
    @Expose
    private String SourceIp;

    /**
    * 攻击源ip地址所在城市
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 被攻击的端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttackPort")
    @Expose
    private Long AttackPort;

    /**
    * 漏洞描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 修复方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Fix")
    @Expose
    private String Fix;

    /**
    * 请求内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkPayload")
    @Expose
    private String NetworkPayload;

    /**
    * 节点名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 节点id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * 容器名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * 容器id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * 容器运行状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerStatus")
    @Expose
    private String ContainerStatus;

    /**
    * 容器隔离状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerNetStatus")
    @Expose
    private String ContainerNetStatus;

    /**
    * 镜像ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 镜像名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * pod名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * podip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodIp")
    @Expose
    private String PodIp;

    /**
    * 集群名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 集群id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 进程id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * 关联进程主类名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MainClass")
    @Expose
    private String MainClass;

    /**
    * 堆栈信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StackTrace")
    @Expose
    private String StackTrace;

    /**
    * 漏洞ID相关的事件详情(json array格式 rasp特有)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RaspDetail")
    @Expose
    private String RaspDetail;

    /**
    * 入侵状态： 1 攻击事件，2 防御成功
    */
    @SerializedName("EventType")
    @Expose
    private Long EventType;

    /**
     * Get 漏洞事件id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 漏洞事件id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 漏洞事件id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 漏洞事件id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 状态 0: 待处理 1:已防御 2:已处理 3: 已忽略 4: 已删除 5: 已加白
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态 0: 待处理 1:已防御 2:已处理 3: 已忽略 4: 已删除 5: 已加白
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态 0: 待处理 1:已防御 2:已处理 3: 已忽略 4: 已删除 5: 已加白
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态 0: 待处理 1:已防御 2:已处理 3: 已忽略 4: 已删除 5: 已加白
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 机器quuid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Quuid 机器quuid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 机器quuid
注意：此字段可能返回 null，表示取不到有效值。
     * @param Quuid 机器quuid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 主机名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Alias 主机名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 主机名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Alias 主机名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 实例id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceID 实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 实例id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceID 实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 内网ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivateIp 内网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 内网ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivateIp 内网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get 公网ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicIp 公网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 公网ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicIp 公网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 资产tag
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostTags 资产tag
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getHostTags() {
        return this.HostTags;
    }

    /**
     * Set 资产tag
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostTags 资产tag
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostTags(String [] HostTags) {
        this.HostTags = HostTags;
    }

    /**
     * Get 首次攻击时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 首次攻击时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 首次攻击时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 首次攻击时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最近攻击时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MergeTime 最近攻击时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMergeTime() {
        return this.MergeTime;
    }

    /**
     * Set 最近攻击时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param MergeTime 最近攻击时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMergeTime(String MergeTime) {
        this.MergeTime = MergeTime;
    }

    /**
     * Get 应用攻击类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttackTypeName 应用攻击类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAttackTypeName() {
        return this.AttackTypeName;
    }

    /**
     * Set 应用攻击类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttackTypeName 应用攻击类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttackTypeName(String AttackTypeName) {
        this.AttackTypeName = AttackTypeName;
    }

    /**
     * Get 应用攻击类型id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttackType 应用攻击类型id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAttackType() {
        return this.AttackType;
    }

    /**
     * Set 应用攻击类型id
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttackType 应用攻击类型id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttackType(Long AttackType) {
        this.AttackType = AttackType;
    }

    /**
     * Get 请求url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url 请求url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 请求url
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url 请求url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 漏洞名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulName 漏洞名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set 漏洞名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulName 漏洞名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get 攻击次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Count 攻击次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 攻击次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Count 攻击次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get cve编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CveId cve编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCveId() {
        return this.CveId;
    }

    /**
     * Set cve编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param CveId cve编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCveId(String CveId) {
        this.CveId = CveId;
    }

    /**
     * Get 攻击源ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceIp 攻击源ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceIp() {
        return this.SourceIp;
    }

    /**
     * Set 攻击源ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceIp 攻击源ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    /**
     * Get 攻击源ip地址所在城市
注意：此字段可能返回 null，表示取不到有效值。 
     * @return City 攻击源ip地址所在城市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 攻击源ip地址所在城市
注意：此字段可能返回 null，表示取不到有效值。
     * @param City 攻击源ip地址所在城市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 被攻击的端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttackPort 被攻击的端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAttackPort() {
        return this.AttackPort;
    }

    /**
     * Set 被攻击的端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttackPort 被攻击的端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttackPort(Long AttackPort) {
        this.AttackPort = AttackPort;
    }

    /**
     * Get 漏洞描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 漏洞描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 漏洞描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 漏洞描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 修复方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Fix 修复方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFix() {
        return this.Fix;
    }

    /**
     * Set 修复方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Fix 修复方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFix(String Fix) {
        this.Fix = Fix;
    }

    /**
     * Get 请求内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkPayload 请求内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNetworkPayload() {
        return this.NetworkPayload;
    }

    /**
     * Set 请求内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkPayload 请求内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkPayload(String NetworkPayload) {
        this.NetworkPayload = NetworkPayload;
    }

    /**
     * Get 节点名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeName 节点名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 节点名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeName 节点名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 节点id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeId 节点id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 节点id
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeId 节点id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 容器名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerName 容器名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set 容器名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerName 容器名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get 容器id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerId 容器id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set 容器id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerId 容器id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get 容器运行状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerStatus 容器运行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContainerStatus() {
        return this.ContainerStatus;
    }

    /**
     * Set 容器运行状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerStatus 容器运行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerStatus(String ContainerStatus) {
        this.ContainerStatus = ContainerStatus;
    }

    /**
     * Get 容器隔离状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerNetStatus 容器隔离状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContainerNetStatus() {
        return this.ContainerNetStatus;
    }

    /**
     * Set 容器隔离状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerNetStatus 容器隔离状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerNetStatus(String ContainerNetStatus) {
        this.ContainerNetStatus = ContainerNetStatus;
    }

    /**
     * Get 镜像ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageId 镜像ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageId 镜像ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 镜像名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageName 镜像名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 镜像名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageName 镜像名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get pod名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodName pod名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set pod名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodName pod名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get podip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodIp podip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPodIp() {
        return this.PodIp;
    }

    /**
     * Set podip
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodIp podip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodIp(String PodIp) {
        this.PodIp = PodIp;
    }

    /**
     * Get 集群名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterName 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterName 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 集群id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 进程id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Pid 进程id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set 进程id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Pid 进程id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get 关联进程主类名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MainClass 关联进程主类名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMainClass() {
        return this.MainClass;
    }

    /**
     * Set 关联进程主类名
注意：此字段可能返回 null，表示取不到有效值。
     * @param MainClass 关联进程主类名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMainClass(String MainClass) {
        this.MainClass = MainClass;
    }

    /**
     * Get 堆栈信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StackTrace 堆栈信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStackTrace() {
        return this.StackTrace;
    }

    /**
     * Set 堆栈信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param StackTrace 堆栈信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStackTrace(String StackTrace) {
        this.StackTrace = StackTrace;
    }

    /**
     * Get 漏洞ID相关的事件详情(json array格式 rasp特有)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RaspDetail 漏洞ID相关的事件详情(json array格式 rasp特有)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRaspDetail() {
        return this.RaspDetail;
    }

    /**
     * Set 漏洞ID相关的事件详情(json array格式 rasp特有)
注意：此字段可能返回 null，表示取不到有效值。
     * @param RaspDetail 漏洞ID相关的事件详情(json array格式 rasp特有)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRaspDetail(String RaspDetail) {
        this.RaspDetail = RaspDetail;
    }

    /**
     * Get 入侵状态： 1 攻击事件，2 防御成功 
     * @return EventType 入侵状态： 1 攻击事件，2 防御成功
     */
    public Long getEventType() {
        return this.EventType;
    }

    /**
     * Set 入侵状态： 1 攻击事件，2 防御成功
     * @param EventType 入侵状态： 1 攻击事件，2 防御成功
     */
    public void setEventType(Long EventType) {
        this.EventType = EventType;
    }

    public RaspEventDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RaspEventDetail(RaspEventDetail source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
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
        if (source.HostTags != null) {
            this.HostTags = new String[source.HostTags.length];
            for (int i = 0; i < source.HostTags.length; i++) {
                this.HostTags[i] = new String(source.HostTags[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.MergeTime != null) {
            this.MergeTime = new String(source.MergeTime);
        }
        if (source.AttackTypeName != null) {
            this.AttackTypeName = new String(source.AttackTypeName);
        }
        if (source.AttackType != null) {
            this.AttackType = new Long(source.AttackType);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
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
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Fix != null) {
            this.Fix = new String(source.Fix);
        }
        if (source.NetworkPayload != null) {
            this.NetworkPayload = new String(source.NetworkPayload);
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
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.MainClass != null) {
            this.MainClass = new String(source.MainClass);
        }
        if (source.StackTrace != null) {
            this.StackTrace = new String(source.StackTrace);
        }
        if (source.RaspDetail != null) {
            this.RaspDetail = new String(source.RaspDetail);
        }
        if (source.EventType != null) {
            this.EventType = new Long(source.EventType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamArraySimple(map, prefix + "HostTags.", this.HostTags);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MergeTime", this.MergeTime);
        this.setParamSimple(map, prefix + "AttackTypeName", this.AttackTypeName);
        this.setParamSimple(map, prefix + "AttackType", this.AttackType);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "CveId", this.CveId);
        this.setParamSimple(map, prefix + "SourceIp", this.SourceIp);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "AttackPort", this.AttackPort);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Fix", this.Fix);
        this.setParamSimple(map, prefix + "NetworkPayload", this.NetworkPayload);
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
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "MainClass", this.MainClass);
        this.setParamSimple(map, prefix + "StackTrace", this.StackTrace);
        this.setParamSimple(map, prefix + "RaspDetail", this.RaspDetail);
        this.setParamSimple(map, prefix + "EventType", this.EventType);

    }
}

