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

public class InstanceInfo extends AbstractModel {

    /**
    * 集群实例ID, "cdwdoris-xxxx" 字符串类型
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
Init  创建中
Serving   运行中
Isolated   已隔离
Changing  变更中
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
    @SerializedName("CoreSummary")
    @Expose
    private NodesSummary CoreSummary;

    /**
    * 高可用，"true" "false"
    */
    @SerializedName("HA")
    @Expose
    private String HA;

    /**
    * 高可用类型：
0：非高可用
1：读高可用
2：读写高可用。
    */
    @SerializedName("HaType")
    @Expose
    private Long HaType;

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
    * 可用区说明，例如 "广州三区"
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
    * cos桶
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * cbs
    */
    @SerializedName("CanAttachCbs")
    @Expose
    private Boolean CanAttachCbs;

    /**
    * 小版本
    */
    @SerializedName("BuildVersion")
    @Expose
    private String BuildVersion;

    /**
    * 组件信息
注：这里返回类型实际为map[string]struct类型，并非显示的string类型，可以参考“示例值”进行数据的解析。
    */
    @SerializedName("Components")
    @Expose
    private String Components;

    /**
    * 判断审计日志表是否有catalog字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IfExistCatalog")
    @Expose
    private Long IfExistCatalog;

    /**
    * 页面特性，用于前端屏蔽一些页面入口
    */
    @SerializedName("Characteristic")
    @Expose
    private String [] Characteristic;

    /**
    * 超时时间 单位s
    */
    @SerializedName("RestartTimeout")
    @Expose
    private String RestartTimeout;

    /**
    * 内核优雅重启超时时间，如果为-1说明未设置
    */
    @SerializedName("GraceShutdownWaitSeconds")
    @Expose
    private String GraceShutdownWaitSeconds;

    /**
    * 表名大小写是否敏感，0：敏感；1：不敏感，以小写进行比较；2：不敏感，表名改为以小写存储
    */
    @SerializedName("CaseSensitive")
    @Expose
    private Long CaseSensitive;

    /**
    * 用户是否可以绑定安全组
    */
    @SerializedName("IsWhiteSGs")
    @Expose
    private Boolean IsWhiteSGs;

    /**
    * 已绑定的安全组信息
    */
    @SerializedName("BindSGs")
    @Expose
    private String [] BindSGs;

    /**
    * 是否为多可用区
    */
    @SerializedName("EnableMultiZones")
    @Expose
    private Boolean EnableMultiZones;

    /**
    * 用户可用区和子网信息
    */
    @SerializedName("UserNetworkInfos")
    @Expose
    private String UserNetworkInfos;

    /**
    * 是否启用冷热分层。0：未开启 1：已开启
    */
    @SerializedName("EnableCoolDown")
    @Expose
    private Long EnableCoolDown;

    /**
    * 冷热分层使用COS桶
    */
    @SerializedName("CoolDownBucket")
    @Expose
    private String CoolDownBucket;

    /**
    * 实例扩展信息
    */
    @SerializedName("Details")
    @Expose
    private InstanceDetail Details;

    /**
    * 是否启用DLC 0:关闭 1:开启
    */
    @SerializedName("EnableDlc")
    @Expose
    private Long EnableDlc;

    /**
    * 账户类型 0:普通用户 1:CAM用户
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * 监控模式 0: 老监控 1：新监控
    */
    @SerializedName("MonitorMode")
    @Expose
    private Long MonitorMode;

    /**
    * cn节点信息
    */
    @SerializedName("CNSummary")
    @Expose
    private NodesSummary CNSummary;

    /**
    * 计算组个数
    */
    @SerializedName("ComputeGroupCount")
    @Expose
    private Long ComputeGroupCount;

    /**
    * 存算分离cos存储数据
    */
    @SerializedName("CosStorageSize")
    @Expose
    private Float CosStorageSize;

    /**
    * 存算分离的指标 当是true 不支持新建计算组
    */
    @SerializedName("IsMasterNonVM")
    @Expose
    private Boolean IsMasterNonVM;

    /**
    * Cos容量包大小
    */
    @SerializedName("CosPkgCapacity")
    @Expose
    private Long CosPkgCapacity;

    /**
    * 集群是否使用托管桶
    */
    @SerializedName("UseManagedBucket")
    @Expose
    private Boolean UseManagedBucket;

    /**
    * 集群类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 对应主集群
    */
    @SerializedName("MasterInstance")
    @Expose
    private String MasterInstance;

    /**
    * 对应备集群
    */
    @SerializedName("SlaveInstances")
    @Expose
    private String [] SlaveInstances;

    /**
     * Get 集群实例ID, "cdwdoris-xxxx" 字符串类型 
     * @return InstanceId 集群实例ID, "cdwdoris-xxxx" 字符串类型
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群实例ID, "cdwdoris-xxxx" 字符串类型
     * @param InstanceId 集群实例ID, "cdwdoris-xxxx" 字符串类型
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
Init  创建中
Serving   运行中
Isolated   已隔离
Changing  变更中 
     * @return Status 状态,
Init  创建中
Serving   运行中
Isolated   已隔离
Changing  变更中
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态,
Init  创建中
Serving   运行中
Isolated   已隔离
Changing  变更中
     * @param Status 状态,
Init  创建中
Serving   运行中
Isolated   已隔离
Changing  变更中
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
     * @return CoreSummary zookeeper节点描述信息
     */
    public NodesSummary getCoreSummary() {
        return this.CoreSummary;
    }

    /**
     * Set zookeeper节点描述信息
     * @param CoreSummary zookeeper节点描述信息
     */
    public void setCoreSummary(NodesSummary CoreSummary) {
        this.CoreSummary = CoreSummary;
    }

    /**
     * Get 高可用，"true" "false" 
     * @return HA 高可用，"true" "false"
     */
    public String getHA() {
        return this.HA;
    }

    /**
     * Set 高可用，"true" "false"
     * @param HA 高可用，"true" "false"
     */
    public void setHA(String HA) {
        this.HA = HA;
    }

    /**
     * Get 高可用类型：
0：非高可用
1：读高可用
2：读写高可用。 
     * @return HaType 高可用类型：
0：非高可用
1：读高可用
2：读写高可用。
     */
    public Long getHaType() {
        return this.HaType;
    }

    /**
     * Set 高可用类型：
0：非高可用
1：读高可用
2：读写高可用。
     * @param HaType 高可用类型：
0：非高可用
1：读高可用
2：读写高可用。
     */
    public void setHaType(Long HaType) {
        this.HaType = HaType;
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
     * Get 可用区说明，例如 "广州三区" 
     * @return ZoneDesc 可用区说明，例如 "广州三区"
     */
    public String getZoneDesc() {
        return this.ZoneDesc;
    }

    /**
     * Set 可用区说明，例如 "广州三区"
     * @param ZoneDesc 可用区说明，例如 "广州三区"
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
     * Get cos桶 
     * @return CosBucketName cos桶
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * Set cos桶
     * @param CosBucketName cos桶
     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

    /**
     * Get cbs 
     * @return CanAttachCbs cbs
     */
    public Boolean getCanAttachCbs() {
        return this.CanAttachCbs;
    }

    /**
     * Set cbs
     * @param CanAttachCbs cbs
     */
    public void setCanAttachCbs(Boolean CanAttachCbs) {
        this.CanAttachCbs = CanAttachCbs;
    }

    /**
     * Get 小版本 
     * @return BuildVersion 小版本
     */
    public String getBuildVersion() {
        return this.BuildVersion;
    }

    /**
     * Set 小版本
     * @param BuildVersion 小版本
     */
    public void setBuildVersion(String BuildVersion) {
        this.BuildVersion = BuildVersion;
    }

    /**
     * Get 组件信息
注：这里返回类型实际为map[string]struct类型，并非显示的string类型，可以参考“示例值”进行数据的解析。 
     * @return Components 组件信息
注：这里返回类型实际为map[string]struct类型，并非显示的string类型，可以参考“示例值”进行数据的解析。
     */
    public String getComponents() {
        return this.Components;
    }

    /**
     * Set 组件信息
注：这里返回类型实际为map[string]struct类型，并非显示的string类型，可以参考“示例值”进行数据的解析。
     * @param Components 组件信息
注：这里返回类型实际为map[string]struct类型，并非显示的string类型，可以参考“示例值”进行数据的解析。
     */
    public void setComponents(String Components) {
        this.Components = Components;
    }

    /**
     * Get 判断审计日志表是否有catalog字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IfExistCatalog 判断审计日志表是否有catalog字段
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Long getIfExistCatalog() {
        return this.IfExistCatalog;
    }

    /**
     * Set 判断审计日志表是否有catalog字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param IfExistCatalog 判断审计日志表是否有catalog字段
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setIfExistCatalog(Long IfExistCatalog) {
        this.IfExistCatalog = IfExistCatalog;
    }

    /**
     * Get 页面特性，用于前端屏蔽一些页面入口 
     * @return Characteristic 页面特性，用于前端屏蔽一些页面入口
     */
    public String [] getCharacteristic() {
        return this.Characteristic;
    }

    /**
     * Set 页面特性，用于前端屏蔽一些页面入口
     * @param Characteristic 页面特性，用于前端屏蔽一些页面入口
     */
    public void setCharacteristic(String [] Characteristic) {
        this.Characteristic = Characteristic;
    }

    /**
     * Get 超时时间 单位s 
     * @return RestartTimeout 超时时间 单位s
     */
    public String getRestartTimeout() {
        return this.RestartTimeout;
    }

    /**
     * Set 超时时间 单位s
     * @param RestartTimeout 超时时间 单位s
     */
    public void setRestartTimeout(String RestartTimeout) {
        this.RestartTimeout = RestartTimeout;
    }

    /**
     * Get 内核优雅重启超时时间，如果为-1说明未设置 
     * @return GraceShutdownWaitSeconds 内核优雅重启超时时间，如果为-1说明未设置
     */
    public String getGraceShutdownWaitSeconds() {
        return this.GraceShutdownWaitSeconds;
    }

    /**
     * Set 内核优雅重启超时时间，如果为-1说明未设置
     * @param GraceShutdownWaitSeconds 内核优雅重启超时时间，如果为-1说明未设置
     */
    public void setGraceShutdownWaitSeconds(String GraceShutdownWaitSeconds) {
        this.GraceShutdownWaitSeconds = GraceShutdownWaitSeconds;
    }

    /**
     * Get 表名大小写是否敏感，0：敏感；1：不敏感，以小写进行比较；2：不敏感，表名改为以小写存储 
     * @return CaseSensitive 表名大小写是否敏感，0：敏感；1：不敏感，以小写进行比较；2：不敏感，表名改为以小写存储
     */
    public Long getCaseSensitive() {
        return this.CaseSensitive;
    }

    /**
     * Set 表名大小写是否敏感，0：敏感；1：不敏感，以小写进行比较；2：不敏感，表名改为以小写存储
     * @param CaseSensitive 表名大小写是否敏感，0：敏感；1：不敏感，以小写进行比较；2：不敏感，表名改为以小写存储
     */
    public void setCaseSensitive(Long CaseSensitive) {
        this.CaseSensitive = CaseSensitive;
    }

    /**
     * Get 用户是否可以绑定安全组 
     * @return IsWhiteSGs 用户是否可以绑定安全组
     */
    public Boolean getIsWhiteSGs() {
        return this.IsWhiteSGs;
    }

    /**
     * Set 用户是否可以绑定安全组
     * @param IsWhiteSGs 用户是否可以绑定安全组
     */
    public void setIsWhiteSGs(Boolean IsWhiteSGs) {
        this.IsWhiteSGs = IsWhiteSGs;
    }

    /**
     * Get 已绑定的安全组信息 
     * @return BindSGs 已绑定的安全组信息
     */
    public String [] getBindSGs() {
        return this.BindSGs;
    }

    /**
     * Set 已绑定的安全组信息
     * @param BindSGs 已绑定的安全组信息
     */
    public void setBindSGs(String [] BindSGs) {
        this.BindSGs = BindSGs;
    }

    /**
     * Get 是否为多可用区 
     * @return EnableMultiZones 是否为多可用区
     */
    public Boolean getEnableMultiZones() {
        return this.EnableMultiZones;
    }

    /**
     * Set 是否为多可用区
     * @param EnableMultiZones 是否为多可用区
     */
    public void setEnableMultiZones(Boolean EnableMultiZones) {
        this.EnableMultiZones = EnableMultiZones;
    }

    /**
     * Get 用户可用区和子网信息 
     * @return UserNetworkInfos 用户可用区和子网信息
     */
    public String getUserNetworkInfos() {
        return this.UserNetworkInfos;
    }

    /**
     * Set 用户可用区和子网信息
     * @param UserNetworkInfos 用户可用区和子网信息
     */
    public void setUserNetworkInfos(String UserNetworkInfos) {
        this.UserNetworkInfos = UserNetworkInfos;
    }

    /**
     * Get 是否启用冷热分层。0：未开启 1：已开启 
     * @return EnableCoolDown 是否启用冷热分层。0：未开启 1：已开启
     */
    public Long getEnableCoolDown() {
        return this.EnableCoolDown;
    }

    /**
     * Set 是否启用冷热分层。0：未开启 1：已开启
     * @param EnableCoolDown 是否启用冷热分层。0：未开启 1：已开启
     */
    public void setEnableCoolDown(Long EnableCoolDown) {
        this.EnableCoolDown = EnableCoolDown;
    }

    /**
     * Get 冷热分层使用COS桶 
     * @return CoolDownBucket 冷热分层使用COS桶
     */
    public String getCoolDownBucket() {
        return this.CoolDownBucket;
    }

    /**
     * Set 冷热分层使用COS桶
     * @param CoolDownBucket 冷热分层使用COS桶
     */
    public void setCoolDownBucket(String CoolDownBucket) {
        this.CoolDownBucket = CoolDownBucket;
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
     * Get 是否启用DLC 0:关闭 1:开启 
     * @return EnableDlc 是否启用DLC 0:关闭 1:开启
     */
    public Long getEnableDlc() {
        return this.EnableDlc;
    }

    /**
     * Set 是否启用DLC 0:关闭 1:开启
     * @param EnableDlc 是否启用DLC 0:关闭 1:开启
     */
    public void setEnableDlc(Long EnableDlc) {
        this.EnableDlc = EnableDlc;
    }

    /**
     * Get 账户类型 0:普通用户 1:CAM用户 
     * @return AccountType 账户类型 0:普通用户 1:CAM用户
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set 账户类型 0:普通用户 1:CAM用户
     * @param AccountType 账户类型 0:普通用户 1:CAM用户
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get 监控模式 0: 老监控 1：新监控 
     * @return MonitorMode 监控模式 0: 老监控 1：新监控
     */
    public Long getMonitorMode() {
        return this.MonitorMode;
    }

    /**
     * Set 监控模式 0: 老监控 1：新监控
     * @param MonitorMode 监控模式 0: 老监控 1：新监控
     */
    public void setMonitorMode(Long MonitorMode) {
        this.MonitorMode = MonitorMode;
    }

    /**
     * Get cn节点信息 
     * @return CNSummary cn节点信息
     */
    public NodesSummary getCNSummary() {
        return this.CNSummary;
    }

    /**
     * Set cn节点信息
     * @param CNSummary cn节点信息
     */
    public void setCNSummary(NodesSummary CNSummary) {
        this.CNSummary = CNSummary;
    }

    /**
     * Get 计算组个数 
     * @return ComputeGroupCount 计算组个数
     */
    public Long getComputeGroupCount() {
        return this.ComputeGroupCount;
    }

    /**
     * Set 计算组个数
     * @param ComputeGroupCount 计算组个数
     */
    public void setComputeGroupCount(Long ComputeGroupCount) {
        this.ComputeGroupCount = ComputeGroupCount;
    }

    /**
     * Get 存算分离cos存储数据 
     * @return CosStorageSize 存算分离cos存储数据
     */
    public Float getCosStorageSize() {
        return this.CosStorageSize;
    }

    /**
     * Set 存算分离cos存储数据
     * @param CosStorageSize 存算分离cos存储数据
     */
    public void setCosStorageSize(Float CosStorageSize) {
        this.CosStorageSize = CosStorageSize;
    }

    /**
     * Get 存算分离的指标 当是true 不支持新建计算组 
     * @return IsMasterNonVM 存算分离的指标 当是true 不支持新建计算组
     */
    public Boolean getIsMasterNonVM() {
        return this.IsMasterNonVM;
    }

    /**
     * Set 存算分离的指标 当是true 不支持新建计算组
     * @param IsMasterNonVM 存算分离的指标 当是true 不支持新建计算组
     */
    public void setIsMasterNonVM(Boolean IsMasterNonVM) {
        this.IsMasterNonVM = IsMasterNonVM;
    }

    /**
     * Get Cos容量包大小 
     * @return CosPkgCapacity Cos容量包大小
     */
    public Long getCosPkgCapacity() {
        return this.CosPkgCapacity;
    }

    /**
     * Set Cos容量包大小
     * @param CosPkgCapacity Cos容量包大小
     */
    public void setCosPkgCapacity(Long CosPkgCapacity) {
        this.CosPkgCapacity = CosPkgCapacity;
    }

    /**
     * Get 集群是否使用托管桶 
     * @return UseManagedBucket 集群是否使用托管桶
     */
    public Boolean getUseManagedBucket() {
        return this.UseManagedBucket;
    }

    /**
     * Set 集群是否使用托管桶
     * @param UseManagedBucket 集群是否使用托管桶
     */
    public void setUseManagedBucket(Boolean UseManagedBucket) {
        this.UseManagedBucket = UseManagedBucket;
    }

    /**
     * Get 集群类型 
     * @return InstanceType 集群类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 集群类型
     * @param InstanceType 集群类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 对应主集群 
     * @return MasterInstance 对应主集群
     */
    public String getMasterInstance() {
        return this.MasterInstance;
    }

    /**
     * Set 对应主集群
     * @param MasterInstance 对应主集群
     */
    public void setMasterInstance(String MasterInstance) {
        this.MasterInstance = MasterInstance;
    }

    /**
     * Get 对应备集群 
     * @return SlaveInstances 对应备集群
     */
    public String [] getSlaveInstances() {
        return this.SlaveInstances;
    }

    /**
     * Set 对应备集群
     * @param SlaveInstances 对应备集群
     */
    public void setSlaveInstances(String [] SlaveInstances) {
        this.SlaveInstances = SlaveInstances;
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
        if (source.CoreSummary != null) {
            this.CoreSummary = new NodesSummary(source.CoreSummary);
        }
        if (source.HA != null) {
            this.HA = new String(source.HA);
        }
        if (source.HaType != null) {
            this.HaType = new Long(source.HaType);
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
        if (source.CosBucketName != null) {
            this.CosBucketName = new String(source.CosBucketName);
        }
        if (source.CanAttachCbs != null) {
            this.CanAttachCbs = new Boolean(source.CanAttachCbs);
        }
        if (source.BuildVersion != null) {
            this.BuildVersion = new String(source.BuildVersion);
        }
        if (source.Components != null) {
            this.Components = new String(source.Components);
        }
        if (source.IfExistCatalog != null) {
            this.IfExistCatalog = new Long(source.IfExistCatalog);
        }
        if (source.Characteristic != null) {
            this.Characteristic = new String[source.Characteristic.length];
            for (int i = 0; i < source.Characteristic.length; i++) {
                this.Characteristic[i] = new String(source.Characteristic[i]);
            }
        }
        if (source.RestartTimeout != null) {
            this.RestartTimeout = new String(source.RestartTimeout);
        }
        if (source.GraceShutdownWaitSeconds != null) {
            this.GraceShutdownWaitSeconds = new String(source.GraceShutdownWaitSeconds);
        }
        if (source.CaseSensitive != null) {
            this.CaseSensitive = new Long(source.CaseSensitive);
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
        if (source.EnableMultiZones != null) {
            this.EnableMultiZones = new Boolean(source.EnableMultiZones);
        }
        if (source.UserNetworkInfos != null) {
            this.UserNetworkInfos = new String(source.UserNetworkInfos);
        }
        if (source.EnableCoolDown != null) {
            this.EnableCoolDown = new Long(source.EnableCoolDown);
        }
        if (source.CoolDownBucket != null) {
            this.CoolDownBucket = new String(source.CoolDownBucket);
        }
        if (source.Details != null) {
            this.Details = new InstanceDetail(source.Details);
        }
        if (source.EnableDlc != null) {
            this.EnableDlc = new Long(source.EnableDlc);
        }
        if (source.AccountType != null) {
            this.AccountType = new Long(source.AccountType);
        }
        if (source.MonitorMode != null) {
            this.MonitorMode = new Long(source.MonitorMode);
        }
        if (source.CNSummary != null) {
            this.CNSummary = new NodesSummary(source.CNSummary);
        }
        if (source.ComputeGroupCount != null) {
            this.ComputeGroupCount = new Long(source.ComputeGroupCount);
        }
        if (source.CosStorageSize != null) {
            this.CosStorageSize = new Float(source.CosStorageSize);
        }
        if (source.IsMasterNonVM != null) {
            this.IsMasterNonVM = new Boolean(source.IsMasterNonVM);
        }
        if (source.CosPkgCapacity != null) {
            this.CosPkgCapacity = new Long(source.CosPkgCapacity);
        }
        if (source.UseManagedBucket != null) {
            this.UseManagedBucket = new Boolean(source.UseManagedBucket);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.MasterInstance != null) {
            this.MasterInstance = new String(source.MasterInstance);
        }
        if (source.SlaveInstances != null) {
            this.SlaveInstances = new String[source.SlaveInstances.length];
            for (int i = 0; i < source.SlaveInstances.length; i++) {
                this.SlaveInstances[i] = new String(source.SlaveInstances[i]);
            }
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
        this.setParamObj(map, prefix + "CoreSummary.", this.CoreSummary);
        this.setParamSimple(map, prefix + "HA", this.HA);
        this.setParamSimple(map, prefix + "HaType", this.HaType);
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
        this.setParamSimple(map, prefix + "CosBucketName", this.CosBucketName);
        this.setParamSimple(map, prefix + "CanAttachCbs", this.CanAttachCbs);
        this.setParamSimple(map, prefix + "BuildVersion", this.BuildVersion);
        this.setParamSimple(map, prefix + "Components", this.Components);
        this.setParamSimple(map, prefix + "IfExistCatalog", this.IfExistCatalog);
        this.setParamArraySimple(map, prefix + "Characteristic.", this.Characteristic);
        this.setParamSimple(map, prefix + "RestartTimeout", this.RestartTimeout);
        this.setParamSimple(map, prefix + "GraceShutdownWaitSeconds", this.GraceShutdownWaitSeconds);
        this.setParamSimple(map, prefix + "CaseSensitive", this.CaseSensitive);
        this.setParamSimple(map, prefix + "IsWhiteSGs", this.IsWhiteSGs);
        this.setParamArraySimple(map, prefix + "BindSGs.", this.BindSGs);
        this.setParamSimple(map, prefix + "EnableMultiZones", this.EnableMultiZones);
        this.setParamSimple(map, prefix + "UserNetworkInfos", this.UserNetworkInfos);
        this.setParamSimple(map, prefix + "EnableCoolDown", this.EnableCoolDown);
        this.setParamSimple(map, prefix + "CoolDownBucket", this.CoolDownBucket);
        this.setParamObj(map, prefix + "Details.", this.Details);
        this.setParamSimple(map, prefix + "EnableDlc", this.EnableDlc);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "MonitorMode", this.MonitorMode);
        this.setParamObj(map, prefix + "CNSummary.", this.CNSummary);
        this.setParamSimple(map, prefix + "ComputeGroupCount", this.ComputeGroupCount);
        this.setParamSimple(map, prefix + "CosStorageSize", this.CosStorageSize);
        this.setParamSimple(map, prefix + "IsMasterNonVM", this.IsMasterNonVM);
        this.setParamSimple(map, prefix + "CosPkgCapacity", this.CosPkgCapacity);
        this.setParamSimple(map, prefix + "UseManagedBucket", this.UseManagedBucket);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "MasterInstance", this.MasterInstance);
        this.setParamArraySimple(map, prefix + "SlaveInstances.", this.SlaveInstances);

    }
}

