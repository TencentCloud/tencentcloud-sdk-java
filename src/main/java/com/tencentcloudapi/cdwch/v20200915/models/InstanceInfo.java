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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInfo extends AbstractModel {

    /**
    * 集群实例ID, "cdw-xxxx" 字符串类型
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 集群实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 状态,
Init 创建中; Serving 运行中； 
Deleted已销毁；Deleting 销毁中；
Modify 集群变更中；
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 地域, ap-guangzhou
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 可用区， ap-guangzhou-3
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 私有网络名称
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网名称
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 付费类型，"hour", "prepay"
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 数据节点描述信息
    */
    @SerializedName("MasterSummary")
    @Expose
    private NodesSummary MasterSummary;

    /**
    * zookeeper节点描述信息
    */
    @SerializedName("CommonSummary")
    @Expose
    private NodesSummary CommonSummary;

    /**
    * 高可用,"true" "false"
    */
    @SerializedName("HA")
    @Expose
    private String HA;

    /**
    * 访问地址，例如 "10.0.0.1:9000"
    */
    @SerializedName("AccessInfo")
    @Expose
    private String AccessInfo;

    /**
    * 记录ID，数值型
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * regionId, 表示地域
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 可用区说明，例如 "广州二区"
    */
    @SerializedName("ZoneDesc")
    @Expose
    private String ZoneDesc;

    /**
    * 错误流程说明信息
    */
    @SerializedName("FlowMsg")
    @Expose
    private String FlowMsg;

    /**
    * 状态描述，例如“运行中”等
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 自动续费标记
    */
    @SerializedName("RenewFlag")
    @Expose
    private Boolean RenewFlag;

    /**
    * 标签列表
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 监控信息
    */
    @SerializedName("Monitor")
    @Expose
    private String Monitor;

    /**
    * 是否开通日志
    */
    @SerializedName("HasClsTopic")
    @Expose
    private Boolean HasClsTopic;

    /**
    * 日志主题ID
    */
    @SerializedName("ClsTopicId")
    @Expose
    private String ClsTopicId;

    /**
    * 日志集ID
    */
    @SerializedName("ClsLogSetId")
    @Expose
    private String ClsLogSetId;

    /**
    * 是否支持xml配置管理
    */
    @SerializedName("EnableXMLConfig")
    @Expose
    private Long EnableXMLConfig;

    /**
    * 区域
    */
    @SerializedName("RegionDesc")
    @Expose
    private String RegionDesc;

    /**
    * 弹性网卡地址
    */
    @SerializedName("Eip")
    @Expose
    private String Eip;

    /**
    * 冷热分层系数
    */
    @SerializedName("CosMoveFactor")
    @Expose
    private Long CosMoveFactor;

    /**
    * external/local/yunti
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * 是否弹性ck
    */
    @SerializedName("IsElastic")
    @Expose
    private Boolean IsElastic;

    /**
    * 集群详细状态
    */
    @SerializedName("InstanceStateInfo")
    @Expose
    private InstanceStateInfo InstanceStateInfo;

    /**
    * ZK高可用
    */
    @SerializedName("HAZk")
    @Expose
    private Boolean HAZk;

    /**
    * 挂载盘,默认0:没有类型；1:裸盘;2:lvm
    */
    @SerializedName("MountDiskType")
    @Expose
    private Long MountDiskType;

    /**
    * chproxy连接ip
    */
    @SerializedName("CHProxyVip")
    @Expose
    private String CHProxyVip;

    /**
    * cos buket的名字
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * 是否可以挂载云盘
    */
    @SerializedName("CanAttachCbs")
    @Expose
    private Boolean CanAttachCbs;

    /**
    * 是否可以挂载云盘阵列
    */
    @SerializedName("CanAttachCbsLvm")
    @Expose
    private Boolean CanAttachCbsLvm;

    /**
    * 是否可以挂载cos
    */
    @SerializedName("CanAttachCos")
    @Expose
    private Boolean CanAttachCos;

    /**
    * 服务信息
    */
    @SerializedName("Components")
    @Expose
    private ServiceInfo [] Components;

    /**
    * 可升级的内核版本
    */
    @SerializedName("UpgradeVersions")
    @Expose
    private String UpgradeVersions;

    /**
    * ex-index
    */
    @SerializedName("EsIndexId")
    @Expose
    private String EsIndexId;

    /**
    * username
    */
    @SerializedName("EsIndexUsername")
    @Expose
    private String EsIndexUsername;

    /**
    * password
    */
    @SerializedName("EsIndexPassword")
    @Expose
    private String EsIndexPassword;

    /**
    * true
    */
    @SerializedName("HasEsIndex")
    @Expose
    private Boolean HasEsIndex;

    /**
    * true
    */
    @SerializedName("IsSecondaryZone")
    @Expose
    private Boolean IsSecondaryZone;

    /**
    * desc
    */
    @SerializedName("SecondaryZoneInfo")
    @Expose
    private String SecondaryZoneInfo;

    /**
    * 是否clickhouse-keeper
    */
    @SerializedName("ClickHouseKeeper")
    @Expose
    private Boolean ClickHouseKeeper;

    /**
    * 实例扩展信息
    */
    @SerializedName("Details")
    @Expose
    private InstanceDetail Details;

    /**
    * 安全组白名单
    */
    @SerializedName("IsWhiteSGs")
    @Expose
    private Boolean IsWhiteSGs;

    /**
    * 绑定的安全组
    */
    @SerializedName("BindSGs")
    @Expose
    private String [] BindSGs;

    /**
    * 是否开启公网clb
    */
    @SerializedName("HasPublicCloudClb")
    @Expose
    private Boolean HasPublicCloudClb;

    /**
    * 可升级的zk版本
    */
    @SerializedName("UpgradeZkVersions")
    @Expose
    private String UpgradeZkVersions;

    /**
     * Get 集群实例ID, "cdw-xxxx" 字符串类型 
     * @return InstanceId 集群实例ID, "cdw-xxxx" 字符串类型
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群实例ID, "cdw-xxxx" 字符串类型
     * @param InstanceId 集群实例ID, "cdw-xxxx" 字符串类型
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 集群实例名称 
     * @return InstanceName 集群实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 集群实例名称
     * @param InstanceName 集群实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 状态,
Init 创建中; Serving 运行中； 
Deleted已销毁；Deleting 销毁中；
Modify 集群变更中； 
     * @return Status 状态,
Init 创建中; Serving 运行中； 
Deleted已销毁；Deleting 销毁中；
Modify 集群变更中；
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态,
Init 创建中; Serving 运行中； 
Deleted已销毁；Deleting 销毁中；
Modify 集群变更中；
     * @param Status 状态,
Init 创建中; Serving 运行中； 
Deleted已销毁；Deleting 销毁中；
Modify 集群变更中；
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 版本 
     * @return Version 版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 版本
     * @param Version 版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 地域, ap-guangzhou 
     * @return Region 地域, ap-guangzhou
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域, ap-guangzhou
     * @param Region 地域, ap-guangzhou
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 可用区， ap-guangzhou-3 
     * @return Zone 可用区， ap-guangzhou-3
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区， ap-guangzhou-3
     * @param Zone 可用区， ap-guangzhou-3
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 私有网络名称 
     * @return VpcId 私有网络名称
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络名称
     * @param VpcId 私有网络名称
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网名称 
     * @return SubnetId 子网名称
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网名称
     * @param SubnetId 子网名称
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 付费类型，"hour", "prepay" 
     * @return PayMode 付费类型，"hour", "prepay"
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费类型，"hour", "prepay"
     * @param PayMode 付费类型，"hour", "prepay"
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
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
     * Get 过期时间 
     * @return ExpireTime 过期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间
     * @param ExpireTime 过期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 数据节点描述信息 
     * @return MasterSummary 数据节点描述信息
     */
    public NodesSummary getMasterSummary() {
        return this.MasterSummary;
    }

    /**
     * Set 数据节点描述信息
     * @param MasterSummary 数据节点描述信息
     */
    public void setMasterSummary(NodesSummary MasterSummary) {
        this.MasterSummary = MasterSummary;
    }

    /**
     * Get zookeeper节点描述信息 
     * @return CommonSummary zookeeper节点描述信息
     */
    public NodesSummary getCommonSummary() {
        return this.CommonSummary;
    }

    /**
     * Set zookeeper节点描述信息
     * @param CommonSummary zookeeper节点描述信息
     */
    public void setCommonSummary(NodesSummary CommonSummary) {
        this.CommonSummary = CommonSummary;
    }

    /**
     * Get 高可用,"true" "false" 
     * @return HA 高可用,"true" "false"
     */
    public String getHA() {
        return this.HA;
    }

    /**
     * Set 高可用,"true" "false"
     * @param HA 高可用,"true" "false"
     */
    public void setHA(String HA) {
        this.HA = HA;
    }

    /**
     * Get 访问地址，例如 "10.0.0.1:9000" 
     * @return AccessInfo 访问地址，例如 "10.0.0.1:9000"
     */
    public String getAccessInfo() {
        return this.AccessInfo;
    }

    /**
     * Set 访问地址，例如 "10.0.0.1:9000"
     * @param AccessInfo 访问地址，例如 "10.0.0.1:9000"
     */
    public void setAccessInfo(String AccessInfo) {
        this.AccessInfo = AccessInfo;
    }

    /**
     * Get 记录ID，数值型 
     * @return Id 记录ID，数值型
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 记录ID，数值型
     * @param Id 记录ID，数值型
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get regionId, 表示地域 
     * @return RegionId regionId, 表示地域
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set regionId, 表示地域
     * @param RegionId regionId, 表示地域
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 可用区说明，例如 "广州二区" 
     * @return ZoneDesc 可用区说明，例如 "广州二区"
     */
    public String getZoneDesc() {
        return this.ZoneDesc;
    }

    /**
     * Set 可用区说明，例如 "广州二区"
     * @param ZoneDesc 可用区说明，例如 "广州二区"
     */
    public void setZoneDesc(String ZoneDesc) {
        this.ZoneDesc = ZoneDesc;
    }

    /**
     * Get 错误流程说明信息 
     * @return FlowMsg 错误流程说明信息
     */
    public String getFlowMsg() {
        return this.FlowMsg;
    }

    /**
     * Set 错误流程说明信息
     * @param FlowMsg 错误流程说明信息
     */
    public void setFlowMsg(String FlowMsg) {
        this.FlowMsg = FlowMsg;
    }

    /**
     * Get 状态描述，例如“运行中”等 
     * @return StatusDesc 状态描述，例如“运行中”等
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 状态描述，例如“运行中”等
     * @param StatusDesc 状态描述，例如“运行中”等
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 自动续费标记 
     * @return RenewFlag 自动续费标记
     */
    public Boolean getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费标记
     * @param RenewFlag 自动续费标记
     */
    public void setRenewFlag(Boolean RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 标签列表 
     * @return Tags 标签列表
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表
     * @param Tags 标签列表
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 监控信息 
     * @return Monitor 监控信息
     */
    public String getMonitor() {
        return this.Monitor;
    }

    /**
     * Set 监控信息
     * @param Monitor 监控信息
     */
    public void setMonitor(String Monitor) {
        this.Monitor = Monitor;
    }

    /**
     * Get 是否开通日志 
     * @return HasClsTopic 是否开通日志
     */
    public Boolean getHasClsTopic() {
        return this.HasClsTopic;
    }

    /**
     * Set 是否开通日志
     * @param HasClsTopic 是否开通日志
     */
    public void setHasClsTopic(Boolean HasClsTopic) {
        this.HasClsTopic = HasClsTopic;
    }

    /**
     * Get 日志主题ID 
     * @return ClsTopicId 日志主题ID
     */
    public String getClsTopicId() {
        return this.ClsTopicId;
    }

    /**
     * Set 日志主题ID
     * @param ClsTopicId 日志主题ID
     */
    public void setClsTopicId(String ClsTopicId) {
        this.ClsTopicId = ClsTopicId;
    }

    /**
     * Get 日志集ID 
     * @return ClsLogSetId 日志集ID
     */
    public String getClsLogSetId() {
        return this.ClsLogSetId;
    }

    /**
     * Set 日志集ID
     * @param ClsLogSetId 日志集ID
     */
    public void setClsLogSetId(String ClsLogSetId) {
        this.ClsLogSetId = ClsLogSetId;
    }

    /**
     * Get 是否支持xml配置管理 
     * @return EnableXMLConfig 是否支持xml配置管理
     */
    public Long getEnableXMLConfig() {
        return this.EnableXMLConfig;
    }

    /**
     * Set 是否支持xml配置管理
     * @param EnableXMLConfig 是否支持xml配置管理
     */
    public void setEnableXMLConfig(Long EnableXMLConfig) {
        this.EnableXMLConfig = EnableXMLConfig;
    }

    /**
     * Get 区域 
     * @return RegionDesc 区域
     */
    public String getRegionDesc() {
        return this.RegionDesc;
    }

    /**
     * Set 区域
     * @param RegionDesc 区域
     */
    public void setRegionDesc(String RegionDesc) {
        this.RegionDesc = RegionDesc;
    }

    /**
     * Get 弹性网卡地址 
     * @return Eip 弹性网卡地址
     */
    public String getEip() {
        return this.Eip;
    }

    /**
     * Set 弹性网卡地址
     * @param Eip 弹性网卡地址
     */
    public void setEip(String Eip) {
        this.Eip = Eip;
    }

    /**
     * Get 冷热分层系数 
     * @return CosMoveFactor 冷热分层系数
     */
    public Long getCosMoveFactor() {
        return this.CosMoveFactor;
    }

    /**
     * Set 冷热分层系数
     * @param CosMoveFactor 冷热分层系数
     */
    public void setCosMoveFactor(Long CosMoveFactor) {
        this.CosMoveFactor = CosMoveFactor;
    }

    /**
     * Get external/local/yunti 
     * @return Kind external/local/yunti
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set external/local/yunti
     * @param Kind external/local/yunti
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get 是否弹性ck 
     * @return IsElastic 是否弹性ck
     */
    public Boolean getIsElastic() {
        return this.IsElastic;
    }

    /**
     * Set 是否弹性ck
     * @param IsElastic 是否弹性ck
     */
    public void setIsElastic(Boolean IsElastic) {
        this.IsElastic = IsElastic;
    }

    /**
     * Get 集群详细状态 
     * @return InstanceStateInfo 集群详细状态
     */
    public InstanceStateInfo getInstanceStateInfo() {
        return this.InstanceStateInfo;
    }

    /**
     * Set 集群详细状态
     * @param InstanceStateInfo 集群详细状态
     */
    public void setInstanceStateInfo(InstanceStateInfo InstanceStateInfo) {
        this.InstanceStateInfo = InstanceStateInfo;
    }

    /**
     * Get ZK高可用 
     * @return HAZk ZK高可用
     */
    public Boolean getHAZk() {
        return this.HAZk;
    }

    /**
     * Set ZK高可用
     * @param HAZk ZK高可用
     */
    public void setHAZk(Boolean HAZk) {
        this.HAZk = HAZk;
    }

    /**
     * Get 挂载盘,默认0:没有类型；1:裸盘;2:lvm 
     * @return MountDiskType 挂载盘,默认0:没有类型；1:裸盘;2:lvm
     */
    public Long getMountDiskType() {
        return this.MountDiskType;
    }

    /**
     * Set 挂载盘,默认0:没有类型；1:裸盘;2:lvm
     * @param MountDiskType 挂载盘,默认0:没有类型；1:裸盘;2:lvm
     */
    public void setMountDiskType(Long MountDiskType) {
        this.MountDiskType = MountDiskType;
    }

    /**
     * Get chproxy连接ip 
     * @return CHProxyVip chproxy连接ip
     */
    public String getCHProxyVip() {
        return this.CHProxyVip;
    }

    /**
     * Set chproxy连接ip
     * @param CHProxyVip chproxy连接ip
     */
    public void setCHProxyVip(String CHProxyVip) {
        this.CHProxyVip = CHProxyVip;
    }

    /**
     * Get cos buket的名字 
     * @return CosBucketName cos buket的名字
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * Set cos buket的名字
     * @param CosBucketName cos buket的名字
     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

    /**
     * Get 是否可以挂载云盘 
     * @return CanAttachCbs 是否可以挂载云盘
     */
    public Boolean getCanAttachCbs() {
        return this.CanAttachCbs;
    }

    /**
     * Set 是否可以挂载云盘
     * @param CanAttachCbs 是否可以挂载云盘
     */
    public void setCanAttachCbs(Boolean CanAttachCbs) {
        this.CanAttachCbs = CanAttachCbs;
    }

    /**
     * Get 是否可以挂载云盘阵列 
     * @return CanAttachCbsLvm 是否可以挂载云盘阵列
     */
    public Boolean getCanAttachCbsLvm() {
        return this.CanAttachCbsLvm;
    }

    /**
     * Set 是否可以挂载云盘阵列
     * @param CanAttachCbsLvm 是否可以挂载云盘阵列
     */
    public void setCanAttachCbsLvm(Boolean CanAttachCbsLvm) {
        this.CanAttachCbsLvm = CanAttachCbsLvm;
    }

    /**
     * Get 是否可以挂载cos 
     * @return CanAttachCos 是否可以挂载cos
     */
    public Boolean getCanAttachCos() {
        return this.CanAttachCos;
    }

    /**
     * Set 是否可以挂载cos
     * @param CanAttachCos 是否可以挂载cos
     */
    public void setCanAttachCos(Boolean CanAttachCos) {
        this.CanAttachCos = CanAttachCos;
    }

    /**
     * Get 服务信息 
     * @return Components 服务信息
     */
    public ServiceInfo [] getComponents() {
        return this.Components;
    }

    /**
     * Set 服务信息
     * @param Components 服务信息
     */
    public void setComponents(ServiceInfo [] Components) {
        this.Components = Components;
    }

    /**
     * Get 可升级的内核版本 
     * @return UpgradeVersions 可升级的内核版本
     */
    public String getUpgradeVersions() {
        return this.UpgradeVersions;
    }

    /**
     * Set 可升级的内核版本
     * @param UpgradeVersions 可升级的内核版本
     */
    public void setUpgradeVersions(String UpgradeVersions) {
        this.UpgradeVersions = UpgradeVersions;
    }

    /**
     * Get ex-index 
     * @return EsIndexId ex-index
     */
    public String getEsIndexId() {
        return this.EsIndexId;
    }

    /**
     * Set ex-index
     * @param EsIndexId ex-index
     */
    public void setEsIndexId(String EsIndexId) {
        this.EsIndexId = EsIndexId;
    }

    /**
     * Get username 
     * @return EsIndexUsername username
     */
    public String getEsIndexUsername() {
        return this.EsIndexUsername;
    }

    /**
     * Set username
     * @param EsIndexUsername username
     */
    public void setEsIndexUsername(String EsIndexUsername) {
        this.EsIndexUsername = EsIndexUsername;
    }

    /**
     * Get password 
     * @return EsIndexPassword password
     */
    public String getEsIndexPassword() {
        return this.EsIndexPassword;
    }

    /**
     * Set password
     * @param EsIndexPassword password
     */
    public void setEsIndexPassword(String EsIndexPassword) {
        this.EsIndexPassword = EsIndexPassword;
    }

    /**
     * Get true 
     * @return HasEsIndex true
     */
    public Boolean getHasEsIndex() {
        return this.HasEsIndex;
    }

    /**
     * Set true
     * @param HasEsIndex true
     */
    public void setHasEsIndex(Boolean HasEsIndex) {
        this.HasEsIndex = HasEsIndex;
    }

    /**
     * Get true 
     * @return IsSecondaryZone true
     */
    public Boolean getIsSecondaryZone() {
        return this.IsSecondaryZone;
    }

    /**
     * Set true
     * @param IsSecondaryZone true
     */
    public void setIsSecondaryZone(Boolean IsSecondaryZone) {
        this.IsSecondaryZone = IsSecondaryZone;
    }

    /**
     * Get desc 
     * @return SecondaryZoneInfo desc
     */
    public String getSecondaryZoneInfo() {
        return this.SecondaryZoneInfo;
    }

    /**
     * Set desc
     * @param SecondaryZoneInfo desc
     */
    public void setSecondaryZoneInfo(String SecondaryZoneInfo) {
        this.SecondaryZoneInfo = SecondaryZoneInfo;
    }

    /**
     * Get 是否clickhouse-keeper 
     * @return ClickHouseKeeper 是否clickhouse-keeper
     */
    public Boolean getClickHouseKeeper() {
        return this.ClickHouseKeeper;
    }

    /**
     * Set 是否clickhouse-keeper
     * @param ClickHouseKeeper 是否clickhouse-keeper
     */
    public void setClickHouseKeeper(Boolean ClickHouseKeeper) {
        this.ClickHouseKeeper = ClickHouseKeeper;
    }

    /**
     * Get 实例扩展信息 
     * @return Details 实例扩展信息
     */
    public InstanceDetail getDetails() {
        return this.Details;
    }

    /**
     * Set 实例扩展信息
     * @param Details 实例扩展信息
     */
    public void setDetails(InstanceDetail Details) {
        this.Details = Details;
    }

    /**
     * Get 安全组白名单 
     * @return IsWhiteSGs 安全组白名单
     */
    public Boolean getIsWhiteSGs() {
        return this.IsWhiteSGs;
    }

    /**
     * Set 安全组白名单
     * @param IsWhiteSGs 安全组白名单
     */
    public void setIsWhiteSGs(Boolean IsWhiteSGs) {
        this.IsWhiteSGs = IsWhiteSGs;
    }

    /**
     * Get 绑定的安全组 
     * @return BindSGs 绑定的安全组
     */
    public String [] getBindSGs() {
        return this.BindSGs;
    }

    /**
     * Set 绑定的安全组
     * @param BindSGs 绑定的安全组
     */
    public void setBindSGs(String [] BindSGs) {
        this.BindSGs = BindSGs;
    }

    /**
     * Get 是否开启公网clb 
     * @return HasPublicCloudClb 是否开启公网clb
     */
    public Boolean getHasPublicCloudClb() {
        return this.HasPublicCloudClb;
    }

    /**
     * Set 是否开启公网clb
     * @param HasPublicCloudClb 是否开启公网clb
     */
    public void setHasPublicCloudClb(Boolean HasPublicCloudClb) {
        this.HasPublicCloudClb = HasPublicCloudClb;
    }

    /**
     * Get 可升级的zk版本 
     * @return UpgradeZkVersions 可升级的zk版本
     */
    public String getUpgradeZkVersions() {
        return this.UpgradeZkVersions;
    }

    /**
     * Set 可升级的zk版本
     * @param UpgradeZkVersions 可升级的zk版本
     */
    public void setUpgradeZkVersions(String UpgradeZkVersions) {
        this.UpgradeZkVersions = UpgradeZkVersions;
    }

    public InstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceInfo(InstanceInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.MasterSummary != null) {
            this.MasterSummary = new NodesSummary(source.MasterSummary);
        }
        if (source.CommonSummary != null) {
            this.CommonSummary = new NodesSummary(source.CommonSummary);
        }
        if (source.HA != null) {
            this.HA = new String(source.HA);
        }
        if (source.AccessInfo != null) {
            this.AccessInfo = new String(source.AccessInfo);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ZoneDesc != null) {
            this.ZoneDesc = new String(source.ZoneDesc);
        }
        if (source.FlowMsg != null) {
            this.FlowMsg = new String(source.FlowMsg);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Boolean(source.RenewFlag);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Monitor != null) {
            this.Monitor = new String(source.Monitor);
        }
        if (source.HasClsTopic != null) {
            this.HasClsTopic = new Boolean(source.HasClsTopic);
        }
        if (source.ClsTopicId != null) {
            this.ClsTopicId = new String(source.ClsTopicId);
        }
        if (source.ClsLogSetId != null) {
            this.ClsLogSetId = new String(source.ClsLogSetId);
        }
        if (source.EnableXMLConfig != null) {
            this.EnableXMLConfig = new Long(source.EnableXMLConfig);
        }
        if (source.RegionDesc != null) {
            this.RegionDesc = new String(source.RegionDesc);
        }
        if (source.Eip != null) {
            this.Eip = new String(source.Eip);
        }
        if (source.CosMoveFactor != null) {
            this.CosMoveFactor = new Long(source.CosMoveFactor);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.IsElastic != null) {
            this.IsElastic = new Boolean(source.IsElastic);
        }
        if (source.InstanceStateInfo != null) {
            this.InstanceStateInfo = new InstanceStateInfo(source.InstanceStateInfo);
        }
        if (source.HAZk != null) {
            this.HAZk = new Boolean(source.HAZk);
        }
        if (source.MountDiskType != null) {
            this.MountDiskType = new Long(source.MountDiskType);
        }
        if (source.CHProxyVip != null) {
            this.CHProxyVip = new String(source.CHProxyVip);
        }
        if (source.CosBucketName != null) {
            this.CosBucketName = new String(source.CosBucketName);
        }
        if (source.CanAttachCbs != null) {
            this.CanAttachCbs = new Boolean(source.CanAttachCbs);
        }
        if (source.CanAttachCbsLvm != null) {
            this.CanAttachCbsLvm = new Boolean(source.CanAttachCbsLvm);
        }
        if (source.CanAttachCos != null) {
            this.CanAttachCos = new Boolean(source.CanAttachCos);
        }
        if (source.Components != null) {
            this.Components = new ServiceInfo[source.Components.length];
            for (int i = 0; i < source.Components.length; i++) {
                this.Components[i] = new ServiceInfo(source.Components[i]);
            }
        }
        if (source.UpgradeVersions != null) {
            this.UpgradeVersions = new String(source.UpgradeVersions);
        }
        if (source.EsIndexId != null) {
            this.EsIndexId = new String(source.EsIndexId);
        }
        if (source.EsIndexUsername != null) {
            this.EsIndexUsername = new String(source.EsIndexUsername);
        }
        if (source.EsIndexPassword != null) {
            this.EsIndexPassword = new String(source.EsIndexPassword);
        }
        if (source.HasEsIndex != null) {
            this.HasEsIndex = new Boolean(source.HasEsIndex);
        }
        if (source.IsSecondaryZone != null) {
            this.IsSecondaryZone = new Boolean(source.IsSecondaryZone);
        }
        if (source.SecondaryZoneInfo != null) {
            this.SecondaryZoneInfo = new String(source.SecondaryZoneInfo);
        }
        if (source.ClickHouseKeeper != null) {
            this.ClickHouseKeeper = new Boolean(source.ClickHouseKeeper);
        }
        if (source.Details != null) {
            this.Details = new InstanceDetail(source.Details);
        }
        if (source.IsWhiteSGs != null) {
            this.IsWhiteSGs = new Boolean(source.IsWhiteSGs);
        }
        if (source.BindSGs != null) {
            this.BindSGs = new String[source.BindSGs.length];
            for (int i = 0; i < source.BindSGs.length; i++) {
                this.BindSGs[i] = new String(source.BindSGs[i]);
            }
        }
        if (source.HasPublicCloudClb != null) {
            this.HasPublicCloudClb = new Boolean(source.HasPublicCloudClb);
        }
        if (source.UpgradeZkVersions != null) {
            this.UpgradeZkVersions = new String(source.UpgradeZkVersions);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamObj(map, prefix + "MasterSummary.", this.MasterSummary);
        this.setParamObj(map, prefix + "CommonSummary.", this.CommonSummary);
        this.setParamSimple(map, prefix + "HA", this.HA);
        this.setParamSimple(map, prefix + "AccessInfo", this.AccessInfo);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneDesc", this.ZoneDesc);
        this.setParamSimple(map, prefix + "FlowMsg", this.FlowMsg);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Monitor", this.Monitor);
        this.setParamSimple(map, prefix + "HasClsTopic", this.HasClsTopic);
        this.setParamSimple(map, prefix + "ClsTopicId", this.ClsTopicId);
        this.setParamSimple(map, prefix + "ClsLogSetId", this.ClsLogSetId);
        this.setParamSimple(map, prefix + "EnableXMLConfig", this.EnableXMLConfig);
        this.setParamSimple(map, prefix + "RegionDesc", this.RegionDesc);
        this.setParamSimple(map, prefix + "Eip", this.Eip);
        this.setParamSimple(map, prefix + "CosMoveFactor", this.CosMoveFactor);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "IsElastic", this.IsElastic);
        this.setParamObj(map, prefix + "InstanceStateInfo.", this.InstanceStateInfo);
        this.setParamSimple(map, prefix + "HAZk", this.HAZk);
        this.setParamSimple(map, prefix + "MountDiskType", this.MountDiskType);
        this.setParamSimple(map, prefix + "CHProxyVip", this.CHProxyVip);
        this.setParamSimple(map, prefix + "CosBucketName", this.CosBucketName);
        this.setParamSimple(map, prefix + "CanAttachCbs", this.CanAttachCbs);
        this.setParamSimple(map, prefix + "CanAttachCbsLvm", this.CanAttachCbsLvm);
        this.setParamSimple(map, prefix + "CanAttachCos", this.CanAttachCos);
        this.setParamArrayObj(map, prefix + "Components.", this.Components);
        this.setParamSimple(map, prefix + "UpgradeVersions", this.UpgradeVersions);
        this.setParamSimple(map, prefix + "EsIndexId", this.EsIndexId);
        this.setParamSimple(map, prefix + "EsIndexUsername", this.EsIndexUsername);
        this.setParamSimple(map, prefix + "EsIndexPassword", this.EsIndexPassword);
        this.setParamSimple(map, prefix + "HasEsIndex", this.HasEsIndex);
        this.setParamSimple(map, prefix + "IsSecondaryZone", this.IsSecondaryZone);
        this.setParamSimple(map, prefix + "SecondaryZoneInfo", this.SecondaryZoneInfo);
        this.setParamSimple(map, prefix + "ClickHouseKeeper", this.ClickHouseKeeper);
        this.setParamObj(map, prefix + "Details.", this.Details);
        this.setParamSimple(map, prefix + "IsWhiteSGs", this.IsWhiteSGs);
        this.setParamArraySimple(map, prefix + "BindSGs.", this.BindSGs);
        this.setParamSimple(map, prefix + "HasPublicCloudClb", this.HasPublicCloudClb);
        this.setParamSimple(map, prefix + "UpgradeZkVersions", this.UpgradeZkVersions);

    }
}

