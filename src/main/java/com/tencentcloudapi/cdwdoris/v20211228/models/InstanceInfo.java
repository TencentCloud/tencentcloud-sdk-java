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
    * <p>集群实例ID, &quot;cdwdoris-xxxx&quot; 字符串类型</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>集群实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>状态,<br>Init  创建中<br>Serving   运行中<br>Isolated   已隔离<br>Changing  变更中</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>版本</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>地域, ap-guangzhou</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>可用区， ap-guangzhou-3</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>私有网络名称</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网名称</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>付费类型，&quot;hour&quot;, &quot;prepay&quot;</p>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>过期时间</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>数据节点描述信息</p>
    */
    @SerializedName("MasterSummary")
    @Expose
    private NodesSummary MasterSummary;

    /**
    * <p>zookeeper节点描述信息</p>
    */
    @SerializedName("CoreSummary")
    @Expose
    private NodesSummary CoreSummary;

    /**
    * <p>高可用，&quot;true&quot; &quot;false&quot;</p>
    */
    @SerializedName("HA")
    @Expose
    private String HA;

    /**
    * <p>高可用类型：<br>0：非高可用<br>1：读高可用<br>2：读写高可用。</p>
    */
    @SerializedName("HaType")
    @Expose
    private Long HaType;

    /**
    * <p>访问地址，例如 &quot;10.0.0.1:9000&quot;</p>
    */
    @SerializedName("AccessInfo")
    @Expose
    private String AccessInfo;

    /**
    * <p>记录ID，数值型</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>regionId, 表示地域</p>
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * <p>可用区说明，例如 &quot;广州三区&quot;</p>
    */
    @SerializedName("ZoneDesc")
    @Expose
    private String ZoneDesc;

    /**
    * <p>错误流程说明信息</p>
    */
    @SerializedName("FlowMsg")
    @Expose
    private String FlowMsg;

    /**
    * <p>状态描述，例如“运行中”等</p>
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * <p>自动续费标记</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private Boolean RenewFlag;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>监控信息</p>
    */
    @SerializedName("Monitor")
    @Expose
    private String Monitor;

    /**
    * <p>是否开通日志</p>
    */
    @SerializedName("HasClsTopic")
    @Expose
    private Boolean HasClsTopic;

    /**
    * <p>日志主题ID</p>
    */
    @SerializedName("ClsTopicId")
    @Expose
    private String ClsTopicId;

    /**
    * <p>日志集ID</p>
    */
    @SerializedName("ClsLogSetId")
    @Expose
    private String ClsLogSetId;

    /**
    * <p>是否支持xml配置管理</p>
    */
    @SerializedName("EnableXMLConfig")
    @Expose
    private Long EnableXMLConfig;

    /**
    * <p>区域</p>
    */
    @SerializedName("RegionDesc")
    @Expose
    private String RegionDesc;

    /**
    * <p>弹性网卡地址</p>
    */
    @SerializedName("Eip")
    @Expose
    private String Eip;

    /**
    * <p>冷热分层系数</p>
    */
    @SerializedName("CosMoveFactor")
    @Expose
    private Long CosMoveFactor;

    /**
    * <p>external/local/yunti</p>
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * <p>cos桶</p>
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * <p>cbs</p>
    */
    @SerializedName("CanAttachCbs")
    @Expose
    private Boolean CanAttachCbs;

    /**
    * <p>小版本</p>
    */
    @SerializedName("BuildVersion")
    @Expose
    private String BuildVersion;

    /**
    * <p>组件信息<br>注：这里返回类型实际为map[string]struct类型，并非显示的string类型，可以参考“示例值”进行数据的解析。</p>
    */
    @SerializedName("Components")
    @Expose
    private String Components;

    /**
    * <p>判断审计日志表是否有catalog字段</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IfExistCatalog")
    @Expose
    private Long IfExistCatalog;

    /**
    * <p>页面特性，用于前端屏蔽一些页面入口</p>
    */
    @SerializedName("Characteristic")
    @Expose
    private String [] Characteristic;

    /**
    * <p>超时时间 单位s</p>
    */
    @SerializedName("RestartTimeout")
    @Expose
    private String RestartTimeout;

    /**
    * <p>内核优雅重启超时时间，如果为-1说明未设置</p>
    */
    @SerializedName("GraceShutdownWaitSeconds")
    @Expose
    private String GraceShutdownWaitSeconds;

    /**
    * <p>表名大小写是否敏感，0：敏感；1：不敏感，以小写进行比较；2：不敏感，表名改为以小写存储</p>
    */
    @SerializedName("CaseSensitive")
    @Expose
    private Long CaseSensitive;

    /**
    * <p>用户是否可以绑定安全组</p>
    */
    @SerializedName("IsWhiteSGs")
    @Expose
    private Boolean IsWhiteSGs;

    /**
    * <p>已绑定的安全组信息</p>
    */
    @SerializedName("BindSGs")
    @Expose
    private String [] BindSGs;

    /**
    * <p>是否为多可用区</p>
    */
    @SerializedName("EnableMultiZones")
    @Expose
    private Boolean EnableMultiZones;

    /**
    * <p>用户可用区和子网信息</p>
    */
    @SerializedName("UserNetworkInfos")
    @Expose
    private String UserNetworkInfos;

    /**
    * <p>是否启用冷热分层。0：未开启 1：已开启</p>
    */
    @SerializedName("EnableCoolDown")
    @Expose
    private Long EnableCoolDown;

    /**
    * <p>冷热分层使用COS桶</p>
    */
    @SerializedName("CoolDownBucket")
    @Expose
    private String CoolDownBucket;

    /**
    * <p>实例扩展信息</p>
    */
    @SerializedName("Details")
    @Expose
    private InstanceDetail Details;

    /**
    * <p>是否启用DLC 0:关闭 1:开启</p>
    */
    @SerializedName("EnableDlc")
    @Expose
    private Long EnableDlc;

    /**
    * <p>账户类型 0:普通用户 1:CAM用户</p>
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * <p>监控模式 0: 老监控 1：新监控</p>
    */
    @SerializedName("MonitorMode")
    @Expose
    private Long MonitorMode;

    /**
    * <p>cn节点信息</p>
    */
    @SerializedName("CNSummary")
    @Expose
    private NodesSummary CNSummary;

    /**
    * <p>计算组个数</p>
    */
    @SerializedName("ComputeGroupCount")
    @Expose
    private Long ComputeGroupCount;

    /**
    * <p>存算分离cos存储数据</p>
    */
    @SerializedName("CosStorageSize")
    @Expose
    private Float CosStorageSize;

    /**
    * <p>存算分离的指标 当是true 不支持新建计算组</p>
    */
    @SerializedName("IsMasterNonVM")
    @Expose
    private Boolean IsMasterNonVM;

    /**
    * <p>Cos容量包大小</p>
    */
    @SerializedName("CosPkgCapacity")
    @Expose
    private Long CosPkgCapacity;

    /**
    * <p>集群是否使用托管桶</p>
    */
    @SerializedName("UseManagedBucket")
    @Expose
    private Boolean UseManagedBucket;

    /**
    * <p>集群类型</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>对应主集群</p>
    */
    @SerializedName("MasterInstance")
    @Expose
    private String MasterInstance;

    /**
    * <p>对应备集群</p>
    */
    @SerializedName("SlaveInstances")
    @Expose
    private String [] SlaveInstances;

    /**
    * <p>ccr服务部署节点ip</p>
    */
    @SerializedName("SyncerIp")
    @Expose
    private String SyncerIp;

    /**
    * <p>是否支持sql convertor</p>
    */
    @SerializedName("EnableSqlConv")
    @Expose
    private Long EnableSqlConv;

    /**
    * <p>集群时区，默认+08:00</p>
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * <p>缓存盘介质：任一计算组为单副本SSD即ELASTIC_REMOTE_SSD（不支持变配多可用区部署等），否则为默认计算组介质；非存算分离为空</p>
    */
    @SerializedName("CacheDiskType")
    @Expose
    private String CacheDiskType;

    /**
     * Get <p>集群实例ID, &quot;cdwdoris-xxxx&quot; 字符串类型</p> 
     * @return InstanceId <p>集群实例ID, &quot;cdwdoris-xxxx&quot; 字符串类型</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>集群实例ID, &quot;cdwdoris-xxxx&quot; 字符串类型</p>
     * @param InstanceId <p>集群实例ID, &quot;cdwdoris-xxxx&quot; 字符串类型</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>集群实例名称</p> 
     * @return InstanceName <p>集群实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>集群实例名称</p>
     * @param InstanceName <p>集群实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>状态,<br>Init  创建中<br>Serving   运行中<br>Isolated   已隔离<br>Changing  变更中</p> 
     * @return Status <p>状态,<br>Init  创建中<br>Serving   运行中<br>Isolated   已隔离<br>Changing  变更中</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态,<br>Init  创建中<br>Serving   运行中<br>Isolated   已隔离<br>Changing  变更中</p>
     * @param Status <p>状态,<br>Init  创建中<br>Serving   运行中<br>Isolated   已隔离<br>Changing  变更中</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>版本</p> 
     * @return Version <p>版本</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>版本</p>
     * @param Version <p>版本</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>地域, ap-guangzhou</p> 
     * @return Region <p>地域, ap-guangzhou</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域, ap-guangzhou</p>
     * @param Region <p>地域, ap-guangzhou</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>可用区， ap-guangzhou-3</p> 
     * @return Zone <p>可用区， ap-guangzhou-3</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区， ap-guangzhou-3</p>
     * @param Zone <p>可用区， ap-guangzhou-3</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>私有网络名称</p> 
     * @return VpcId <p>私有网络名称</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络名称</p>
     * @param VpcId <p>私有网络名称</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网名称</p> 
     * @return SubnetId <p>子网名称</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网名称</p>
     * @param SubnetId <p>子网名称</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>付费类型，&quot;hour&quot;, &quot;prepay&quot;</p> 
     * @return PayMode <p>付费类型，&quot;hour&quot;, &quot;prepay&quot;</p>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>付费类型，&quot;hour&quot;, &quot;prepay&quot;</p>
     * @param PayMode <p>付费类型，&quot;hour&quot;, &quot;prepay&quot;</p>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
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
     * Get <p>过期时间</p> 
     * @return ExpireTime <p>过期时间</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>过期时间</p>
     * @param ExpireTime <p>过期时间</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>数据节点描述信息</p> 
     * @return MasterSummary <p>数据节点描述信息</p>
     */
    public NodesSummary getMasterSummary() {
        return this.MasterSummary;
    }

    /**
     * Set <p>数据节点描述信息</p>
     * @param MasterSummary <p>数据节点描述信息</p>
     */
    public void setMasterSummary(NodesSummary MasterSummary) {
        this.MasterSummary = MasterSummary;
    }

    /**
     * Get <p>zookeeper节点描述信息</p> 
     * @return CoreSummary <p>zookeeper节点描述信息</p>
     */
    public NodesSummary getCoreSummary() {
        return this.CoreSummary;
    }

    /**
     * Set <p>zookeeper节点描述信息</p>
     * @param CoreSummary <p>zookeeper节点描述信息</p>
     */
    public void setCoreSummary(NodesSummary CoreSummary) {
        this.CoreSummary = CoreSummary;
    }

    /**
     * Get <p>高可用，&quot;true&quot; &quot;false&quot;</p> 
     * @return HA <p>高可用，&quot;true&quot; &quot;false&quot;</p>
     */
    public String getHA() {
        return this.HA;
    }

    /**
     * Set <p>高可用，&quot;true&quot; &quot;false&quot;</p>
     * @param HA <p>高可用，&quot;true&quot; &quot;false&quot;</p>
     */
    public void setHA(String HA) {
        this.HA = HA;
    }

    /**
     * Get <p>高可用类型：<br>0：非高可用<br>1：读高可用<br>2：读写高可用。</p> 
     * @return HaType <p>高可用类型：<br>0：非高可用<br>1：读高可用<br>2：读写高可用。</p>
     */
    public Long getHaType() {
        return this.HaType;
    }

    /**
     * Set <p>高可用类型：<br>0：非高可用<br>1：读高可用<br>2：读写高可用。</p>
     * @param HaType <p>高可用类型：<br>0：非高可用<br>1：读高可用<br>2：读写高可用。</p>
     */
    public void setHaType(Long HaType) {
        this.HaType = HaType;
    }

    /**
     * Get <p>访问地址，例如 &quot;10.0.0.1:9000&quot;</p> 
     * @return AccessInfo <p>访问地址，例如 &quot;10.0.0.1:9000&quot;</p>
     */
    public String getAccessInfo() {
        return this.AccessInfo;
    }

    /**
     * Set <p>访问地址，例如 &quot;10.0.0.1:9000&quot;</p>
     * @param AccessInfo <p>访问地址，例如 &quot;10.0.0.1:9000&quot;</p>
     */
    public void setAccessInfo(String AccessInfo) {
        this.AccessInfo = AccessInfo;
    }

    /**
     * Get <p>记录ID，数值型</p> 
     * @return Id <p>记录ID，数值型</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>记录ID，数值型</p>
     * @param Id <p>记录ID，数值型</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>regionId, 表示地域</p> 
     * @return RegionId <p>regionId, 表示地域</p>
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>regionId, 表示地域</p>
     * @param RegionId <p>regionId, 表示地域</p>
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>可用区说明，例如 &quot;广州三区&quot;</p> 
     * @return ZoneDesc <p>可用区说明，例如 &quot;广州三区&quot;</p>
     */
    public String getZoneDesc() {
        return this.ZoneDesc;
    }

    /**
     * Set <p>可用区说明，例如 &quot;广州三区&quot;</p>
     * @param ZoneDesc <p>可用区说明，例如 &quot;广州三区&quot;</p>
     */
    public void setZoneDesc(String ZoneDesc) {
        this.ZoneDesc = ZoneDesc;
    }

    /**
     * Get <p>错误流程说明信息</p> 
     * @return FlowMsg <p>错误流程说明信息</p>
     */
    public String getFlowMsg() {
        return this.FlowMsg;
    }

    /**
     * Set <p>错误流程说明信息</p>
     * @param FlowMsg <p>错误流程说明信息</p>
     */
    public void setFlowMsg(String FlowMsg) {
        this.FlowMsg = FlowMsg;
    }

    /**
     * Get <p>状态描述，例如“运行中”等</p> 
     * @return StatusDesc <p>状态描述，例如“运行中”等</p>
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set <p>状态描述，例如“运行中”等</p>
     * @param StatusDesc <p>状态描述，例如“运行中”等</p>
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get <p>自动续费标记</p> 
     * @return RenewFlag <p>自动续费标记</p>
     */
    public Boolean getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>自动续费标记</p>
     * @param RenewFlag <p>自动续费标记</p>
     */
    public void setRenewFlag(Boolean RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>标签列表</p> 
     * @return Tags <p>标签列表</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表</p>
     * @param Tags <p>标签列表</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>监控信息</p> 
     * @return Monitor <p>监控信息</p>
     */
    public String getMonitor() {
        return this.Monitor;
    }

    /**
     * Set <p>监控信息</p>
     * @param Monitor <p>监控信息</p>
     */
    public void setMonitor(String Monitor) {
        this.Monitor = Monitor;
    }

    /**
     * Get <p>是否开通日志</p> 
     * @return HasClsTopic <p>是否开通日志</p>
     */
    public Boolean getHasClsTopic() {
        return this.HasClsTopic;
    }

    /**
     * Set <p>是否开通日志</p>
     * @param HasClsTopic <p>是否开通日志</p>
     */
    public void setHasClsTopic(Boolean HasClsTopic) {
        this.HasClsTopic = HasClsTopic;
    }

    /**
     * Get <p>日志主题ID</p> 
     * @return ClsTopicId <p>日志主题ID</p>
     */
    public String getClsTopicId() {
        return this.ClsTopicId;
    }

    /**
     * Set <p>日志主题ID</p>
     * @param ClsTopicId <p>日志主题ID</p>
     */
    public void setClsTopicId(String ClsTopicId) {
        this.ClsTopicId = ClsTopicId;
    }

    /**
     * Get <p>日志集ID</p> 
     * @return ClsLogSetId <p>日志集ID</p>
     */
    public String getClsLogSetId() {
        return this.ClsLogSetId;
    }

    /**
     * Set <p>日志集ID</p>
     * @param ClsLogSetId <p>日志集ID</p>
     */
    public void setClsLogSetId(String ClsLogSetId) {
        this.ClsLogSetId = ClsLogSetId;
    }

    /**
     * Get <p>是否支持xml配置管理</p> 
     * @return EnableXMLConfig <p>是否支持xml配置管理</p>
     */
    public Long getEnableXMLConfig() {
        return this.EnableXMLConfig;
    }

    /**
     * Set <p>是否支持xml配置管理</p>
     * @param EnableXMLConfig <p>是否支持xml配置管理</p>
     */
    public void setEnableXMLConfig(Long EnableXMLConfig) {
        this.EnableXMLConfig = EnableXMLConfig;
    }

    /**
     * Get <p>区域</p> 
     * @return RegionDesc <p>区域</p>
     */
    public String getRegionDesc() {
        return this.RegionDesc;
    }

    /**
     * Set <p>区域</p>
     * @param RegionDesc <p>区域</p>
     */
    public void setRegionDesc(String RegionDesc) {
        this.RegionDesc = RegionDesc;
    }

    /**
     * Get <p>弹性网卡地址</p> 
     * @return Eip <p>弹性网卡地址</p>
     */
    public String getEip() {
        return this.Eip;
    }

    /**
     * Set <p>弹性网卡地址</p>
     * @param Eip <p>弹性网卡地址</p>
     */
    public void setEip(String Eip) {
        this.Eip = Eip;
    }

    /**
     * Get <p>冷热分层系数</p> 
     * @return CosMoveFactor <p>冷热分层系数</p>
     */
    public Long getCosMoveFactor() {
        return this.CosMoveFactor;
    }

    /**
     * Set <p>冷热分层系数</p>
     * @param CosMoveFactor <p>冷热分层系数</p>
     */
    public void setCosMoveFactor(Long CosMoveFactor) {
        this.CosMoveFactor = CosMoveFactor;
    }

    /**
     * Get <p>external/local/yunti</p> 
     * @return Kind <p>external/local/yunti</p>
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set <p>external/local/yunti</p>
     * @param Kind <p>external/local/yunti</p>
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get <p>cos桶</p> 
     * @return CosBucketName <p>cos桶</p>
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * Set <p>cos桶</p>
     * @param CosBucketName <p>cos桶</p>
     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

    /**
     * Get <p>cbs</p> 
     * @return CanAttachCbs <p>cbs</p>
     */
    public Boolean getCanAttachCbs() {
        return this.CanAttachCbs;
    }

    /**
     * Set <p>cbs</p>
     * @param CanAttachCbs <p>cbs</p>
     */
    public void setCanAttachCbs(Boolean CanAttachCbs) {
        this.CanAttachCbs = CanAttachCbs;
    }

    /**
     * Get <p>小版本</p> 
     * @return BuildVersion <p>小版本</p>
     */
    public String getBuildVersion() {
        return this.BuildVersion;
    }

    /**
     * Set <p>小版本</p>
     * @param BuildVersion <p>小版本</p>
     */
    public void setBuildVersion(String BuildVersion) {
        this.BuildVersion = BuildVersion;
    }

    /**
     * Get <p>组件信息<br>注：这里返回类型实际为map[string]struct类型，并非显示的string类型，可以参考“示例值”进行数据的解析。</p> 
     * @return Components <p>组件信息<br>注：这里返回类型实际为map[string]struct类型，并非显示的string类型，可以参考“示例值”进行数据的解析。</p>
     */
    public String getComponents() {
        return this.Components;
    }

    /**
     * Set <p>组件信息<br>注：这里返回类型实际为map[string]struct类型，并非显示的string类型，可以参考“示例值”进行数据的解析。</p>
     * @param Components <p>组件信息<br>注：这里返回类型实际为map[string]struct类型，并非显示的string类型，可以参考“示例值”进行数据的解析。</p>
     */
    public void setComponents(String Components) {
        this.Components = Components;
    }

    /**
     * Get <p>判断审计日志表是否有catalog字段</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IfExistCatalog <p>判断审计日志表是否有catalog字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Long getIfExistCatalog() {
        return this.IfExistCatalog;
    }

    /**
     * Set <p>判断审计日志表是否有catalog字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IfExistCatalog <p>判断审计日志表是否有catalog字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setIfExistCatalog(Long IfExistCatalog) {
        this.IfExistCatalog = IfExistCatalog;
    }

    /**
     * Get <p>页面特性，用于前端屏蔽一些页面入口</p> 
     * @return Characteristic <p>页面特性，用于前端屏蔽一些页面入口</p>
     */
    public String [] getCharacteristic() {
        return this.Characteristic;
    }

    /**
     * Set <p>页面特性，用于前端屏蔽一些页面入口</p>
     * @param Characteristic <p>页面特性，用于前端屏蔽一些页面入口</p>
     */
    public void setCharacteristic(String [] Characteristic) {
        this.Characteristic = Characteristic;
    }

    /**
     * Get <p>超时时间 单位s</p> 
     * @return RestartTimeout <p>超时时间 单位s</p>
     */
    public String getRestartTimeout() {
        return this.RestartTimeout;
    }

    /**
     * Set <p>超时时间 单位s</p>
     * @param RestartTimeout <p>超时时间 单位s</p>
     */
    public void setRestartTimeout(String RestartTimeout) {
        this.RestartTimeout = RestartTimeout;
    }

    /**
     * Get <p>内核优雅重启超时时间，如果为-1说明未设置</p> 
     * @return GraceShutdownWaitSeconds <p>内核优雅重启超时时间，如果为-1说明未设置</p>
     */
    public String getGraceShutdownWaitSeconds() {
        return this.GraceShutdownWaitSeconds;
    }

    /**
     * Set <p>内核优雅重启超时时间，如果为-1说明未设置</p>
     * @param GraceShutdownWaitSeconds <p>内核优雅重启超时时间，如果为-1说明未设置</p>
     */
    public void setGraceShutdownWaitSeconds(String GraceShutdownWaitSeconds) {
        this.GraceShutdownWaitSeconds = GraceShutdownWaitSeconds;
    }

    /**
     * Get <p>表名大小写是否敏感，0：敏感；1：不敏感，以小写进行比较；2：不敏感，表名改为以小写存储</p> 
     * @return CaseSensitive <p>表名大小写是否敏感，0：敏感；1：不敏感，以小写进行比较；2：不敏感，表名改为以小写存储</p>
     */
    public Long getCaseSensitive() {
        return this.CaseSensitive;
    }

    /**
     * Set <p>表名大小写是否敏感，0：敏感；1：不敏感，以小写进行比较；2：不敏感，表名改为以小写存储</p>
     * @param CaseSensitive <p>表名大小写是否敏感，0：敏感；1：不敏感，以小写进行比较；2：不敏感，表名改为以小写存储</p>
     */
    public void setCaseSensitive(Long CaseSensitive) {
        this.CaseSensitive = CaseSensitive;
    }

    /**
     * Get <p>用户是否可以绑定安全组</p> 
     * @return IsWhiteSGs <p>用户是否可以绑定安全组</p>
     */
    public Boolean getIsWhiteSGs() {
        return this.IsWhiteSGs;
    }

    /**
     * Set <p>用户是否可以绑定安全组</p>
     * @param IsWhiteSGs <p>用户是否可以绑定安全组</p>
     */
    public void setIsWhiteSGs(Boolean IsWhiteSGs) {
        this.IsWhiteSGs = IsWhiteSGs;
    }

    /**
     * Get <p>已绑定的安全组信息</p> 
     * @return BindSGs <p>已绑定的安全组信息</p>
     */
    public String [] getBindSGs() {
        return this.BindSGs;
    }

    /**
     * Set <p>已绑定的安全组信息</p>
     * @param BindSGs <p>已绑定的安全组信息</p>
     */
    public void setBindSGs(String [] BindSGs) {
        this.BindSGs = BindSGs;
    }

    /**
     * Get <p>是否为多可用区</p> 
     * @return EnableMultiZones <p>是否为多可用区</p>
     */
    public Boolean getEnableMultiZones() {
        return this.EnableMultiZones;
    }

    /**
     * Set <p>是否为多可用区</p>
     * @param EnableMultiZones <p>是否为多可用区</p>
     */
    public void setEnableMultiZones(Boolean EnableMultiZones) {
        this.EnableMultiZones = EnableMultiZones;
    }

    /**
     * Get <p>用户可用区和子网信息</p> 
     * @return UserNetworkInfos <p>用户可用区和子网信息</p>
     */
    public String getUserNetworkInfos() {
        return this.UserNetworkInfos;
    }

    /**
     * Set <p>用户可用区和子网信息</p>
     * @param UserNetworkInfos <p>用户可用区和子网信息</p>
     */
    public void setUserNetworkInfos(String UserNetworkInfos) {
        this.UserNetworkInfos = UserNetworkInfos;
    }

    /**
     * Get <p>是否启用冷热分层。0：未开启 1：已开启</p> 
     * @return EnableCoolDown <p>是否启用冷热分层。0：未开启 1：已开启</p>
     */
    public Long getEnableCoolDown() {
        return this.EnableCoolDown;
    }

    /**
     * Set <p>是否启用冷热分层。0：未开启 1：已开启</p>
     * @param EnableCoolDown <p>是否启用冷热分层。0：未开启 1：已开启</p>
     */
    public void setEnableCoolDown(Long EnableCoolDown) {
        this.EnableCoolDown = EnableCoolDown;
    }

    /**
     * Get <p>冷热分层使用COS桶</p> 
     * @return CoolDownBucket <p>冷热分层使用COS桶</p>
     */
    public String getCoolDownBucket() {
        return this.CoolDownBucket;
    }

    /**
     * Set <p>冷热分层使用COS桶</p>
     * @param CoolDownBucket <p>冷热分层使用COS桶</p>
     */
    public void setCoolDownBucket(String CoolDownBucket) {
        this.CoolDownBucket = CoolDownBucket;
    }

    /**
     * Get <p>实例扩展信息</p> 
     * @return Details <p>实例扩展信息</p>
     */
    public InstanceDetail getDetails() {
        return this.Details;
    }

    /**
     * Set <p>实例扩展信息</p>
     * @param Details <p>实例扩展信息</p>
     */
    public void setDetails(InstanceDetail Details) {
        this.Details = Details;
    }

    /**
     * Get <p>是否启用DLC 0:关闭 1:开启</p> 
     * @return EnableDlc <p>是否启用DLC 0:关闭 1:开启</p>
     */
    public Long getEnableDlc() {
        return this.EnableDlc;
    }

    /**
     * Set <p>是否启用DLC 0:关闭 1:开启</p>
     * @param EnableDlc <p>是否启用DLC 0:关闭 1:开启</p>
     */
    public void setEnableDlc(Long EnableDlc) {
        this.EnableDlc = EnableDlc;
    }

    /**
     * Get <p>账户类型 0:普通用户 1:CAM用户</p> 
     * @return AccountType <p>账户类型 0:普通用户 1:CAM用户</p>
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set <p>账户类型 0:普通用户 1:CAM用户</p>
     * @param AccountType <p>账户类型 0:普通用户 1:CAM用户</p>
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get <p>监控模式 0: 老监控 1：新监控</p> 
     * @return MonitorMode <p>监控模式 0: 老监控 1：新监控</p>
     */
    public Long getMonitorMode() {
        return this.MonitorMode;
    }

    /**
     * Set <p>监控模式 0: 老监控 1：新监控</p>
     * @param MonitorMode <p>监控模式 0: 老监控 1：新监控</p>
     */
    public void setMonitorMode(Long MonitorMode) {
        this.MonitorMode = MonitorMode;
    }

    /**
     * Get <p>cn节点信息</p> 
     * @return CNSummary <p>cn节点信息</p>
     */
    public NodesSummary getCNSummary() {
        return this.CNSummary;
    }

    /**
     * Set <p>cn节点信息</p>
     * @param CNSummary <p>cn节点信息</p>
     */
    public void setCNSummary(NodesSummary CNSummary) {
        this.CNSummary = CNSummary;
    }

    /**
     * Get <p>计算组个数</p> 
     * @return ComputeGroupCount <p>计算组个数</p>
     */
    public Long getComputeGroupCount() {
        return this.ComputeGroupCount;
    }

    /**
     * Set <p>计算组个数</p>
     * @param ComputeGroupCount <p>计算组个数</p>
     */
    public void setComputeGroupCount(Long ComputeGroupCount) {
        this.ComputeGroupCount = ComputeGroupCount;
    }

    /**
     * Get <p>存算分离cos存储数据</p> 
     * @return CosStorageSize <p>存算分离cos存储数据</p>
     */
    public Float getCosStorageSize() {
        return this.CosStorageSize;
    }

    /**
     * Set <p>存算分离cos存储数据</p>
     * @param CosStorageSize <p>存算分离cos存储数据</p>
     */
    public void setCosStorageSize(Float CosStorageSize) {
        this.CosStorageSize = CosStorageSize;
    }

    /**
     * Get <p>存算分离的指标 当是true 不支持新建计算组</p> 
     * @return IsMasterNonVM <p>存算分离的指标 当是true 不支持新建计算组</p>
     */
    public Boolean getIsMasterNonVM() {
        return this.IsMasterNonVM;
    }

    /**
     * Set <p>存算分离的指标 当是true 不支持新建计算组</p>
     * @param IsMasterNonVM <p>存算分离的指标 当是true 不支持新建计算组</p>
     */
    public void setIsMasterNonVM(Boolean IsMasterNonVM) {
        this.IsMasterNonVM = IsMasterNonVM;
    }

    /**
     * Get <p>Cos容量包大小</p> 
     * @return CosPkgCapacity <p>Cos容量包大小</p>
     */
    public Long getCosPkgCapacity() {
        return this.CosPkgCapacity;
    }

    /**
     * Set <p>Cos容量包大小</p>
     * @param CosPkgCapacity <p>Cos容量包大小</p>
     */
    public void setCosPkgCapacity(Long CosPkgCapacity) {
        this.CosPkgCapacity = CosPkgCapacity;
    }

    /**
     * Get <p>集群是否使用托管桶</p> 
     * @return UseManagedBucket <p>集群是否使用托管桶</p>
     */
    public Boolean getUseManagedBucket() {
        return this.UseManagedBucket;
    }

    /**
     * Set <p>集群是否使用托管桶</p>
     * @param UseManagedBucket <p>集群是否使用托管桶</p>
     */
    public void setUseManagedBucket(Boolean UseManagedBucket) {
        this.UseManagedBucket = UseManagedBucket;
    }

    /**
     * Get <p>集群类型</p> 
     * @return InstanceType <p>集群类型</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>集群类型</p>
     * @param InstanceType <p>集群类型</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>对应主集群</p> 
     * @return MasterInstance <p>对应主集群</p>
     */
    public String getMasterInstance() {
        return this.MasterInstance;
    }

    /**
     * Set <p>对应主集群</p>
     * @param MasterInstance <p>对应主集群</p>
     */
    public void setMasterInstance(String MasterInstance) {
        this.MasterInstance = MasterInstance;
    }

    /**
     * Get <p>对应备集群</p> 
     * @return SlaveInstances <p>对应备集群</p>
     */
    public String [] getSlaveInstances() {
        return this.SlaveInstances;
    }

    /**
     * Set <p>对应备集群</p>
     * @param SlaveInstances <p>对应备集群</p>
     */
    public void setSlaveInstances(String [] SlaveInstances) {
        this.SlaveInstances = SlaveInstances;
    }

    /**
     * Get <p>ccr服务部署节点ip</p> 
     * @return SyncerIp <p>ccr服务部署节点ip</p>
     */
    public String getSyncerIp() {
        return this.SyncerIp;
    }

    /**
     * Set <p>ccr服务部署节点ip</p>
     * @param SyncerIp <p>ccr服务部署节点ip</p>
     */
    public void setSyncerIp(String SyncerIp) {
        this.SyncerIp = SyncerIp;
    }

    /**
     * Get <p>是否支持sql convertor</p> 
     * @return EnableSqlConv <p>是否支持sql convertor</p>
     */
    public Long getEnableSqlConv() {
        return this.EnableSqlConv;
    }

    /**
     * Set <p>是否支持sql convertor</p>
     * @param EnableSqlConv <p>是否支持sql convertor</p>
     */
    public void setEnableSqlConv(Long EnableSqlConv) {
        this.EnableSqlConv = EnableSqlConv;
    }

    /**
     * Get <p>集群时区，默认+08:00</p> 
     * @return TimeZone <p>集群时区，默认+08:00</p>
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set <p>集群时区，默认+08:00</p>
     * @param TimeZone <p>集群时区，默认+08:00</p>
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get <p>缓存盘介质：任一计算组为单副本SSD即ELASTIC_REMOTE_SSD（不支持变配多可用区部署等），否则为默认计算组介质；非存算分离为空</p> 
     * @return CacheDiskType <p>缓存盘介质：任一计算组为单副本SSD即ELASTIC_REMOTE_SSD（不支持变配多可用区部署等），否则为默认计算组介质；非存算分离为空</p>
     */
    public String getCacheDiskType() {
        return this.CacheDiskType;
    }

    /**
     * Set <p>缓存盘介质：任一计算组为单副本SSD即ELASTIC_REMOTE_SSD（不支持变配多可用区部署等），否则为默认计算组介质；非存算分离为空</p>
     * @param CacheDiskType <p>缓存盘介质：任一计算组为单副本SSD即ELASTIC_REMOTE_SSD（不支持变配多可用区部署等），否则为默认计算组介质；非存算分离为空</p>
     */
    public void setCacheDiskType(String CacheDiskType) {
        this.CacheDiskType = CacheDiskType;
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
        if (source.SyncerIp != null) {
            this.SyncerIp = new String(source.SyncerIp);
        }
        if (source.EnableSqlConv != null) {
            this.EnableSqlConv = new Long(source.EnableSqlConv);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
        if (source.CacheDiskType != null) {
            this.CacheDiskType = new String(source.CacheDiskType);
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
        this.setParamSimple(map, prefix + "SyncerIp", this.SyncerIp);
        this.setParamSimple(map, prefix + "EnableSqlConv", this.EnableSqlConv);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamSimple(map, prefix + "CacheDiskType", this.CacheDiskType);

    }
}

