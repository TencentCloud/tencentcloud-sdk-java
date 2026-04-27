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
    * <p>集群实例ID, &quot;cdw-xxxx&quot; 字符串类型</p>
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
    * <p>状态,<br>Init 创建中; Serving 运行中；<br>Deleted已销毁；Deleting 销毁中；<br>Modify 集群变更中；</p>
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
    @SerializedName("CommonSummary")
    @Expose
    private NodesSummary CommonSummary;

    /**
    * <p>高可用,&quot;true&quot; &quot;false&quot;</p>
    */
    @SerializedName("HA")
    @Expose
    private String HA;

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
    * <p>可用区说明，例如 &quot;广州二区&quot;</p>
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
    * <p>是否弹性ck</p>
    */
    @SerializedName("IsElastic")
    @Expose
    private Boolean IsElastic;

    /**
    * <p>集群详细状态</p>
    */
    @SerializedName("InstanceStateInfo")
    @Expose
    private InstanceStateInfo InstanceStateInfo;

    /**
    * <p>ZK高可用</p>
    */
    @SerializedName("HAZk")
    @Expose
    private Boolean HAZk;

    /**
    * <p>挂载盘,默认0:没有类型；1:裸盘;2:lvm</p>
    */
    @SerializedName("MountDiskType")
    @Expose
    private Long MountDiskType;

    /**
    * <p>chproxy连接ip</p>
    */
    @SerializedName("CHProxyVip")
    @Expose
    private String CHProxyVip;

    /**
    * <p>cos buket的名字</p>
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * <p>是否可以挂载云盘</p>
    */
    @SerializedName("CanAttachCbs")
    @Expose
    private Boolean CanAttachCbs;

    /**
    * <p>是否可以挂载云盘阵列</p>
    */
    @SerializedName("CanAttachCbsLvm")
    @Expose
    private Boolean CanAttachCbsLvm;

    /**
    * <p>是否可以挂载cos</p>
    */
    @SerializedName("CanAttachCos")
    @Expose
    private Boolean CanAttachCos;

    /**
    * <p>服务信息</p>
    */
    @SerializedName("Components")
    @Expose
    private ServiceInfo [] Components;

    /**
    * <p>可升级的内核版本</p>
    */
    @SerializedName("UpgradeVersions")
    @Expose
    private String UpgradeVersions;

    /**
    * <p>ex-index</p>
    */
    @SerializedName("EsIndexId")
    @Expose
    private String EsIndexId;

    /**
    * <p>username</p>
    */
    @SerializedName("EsIndexUsername")
    @Expose
    private String EsIndexUsername;

    /**
    * <p>password</p>
    */
    @SerializedName("EsIndexPassword")
    @Expose
    private String EsIndexPassword;

    /**
    * <p>true</p>
    */
    @SerializedName("HasEsIndex")
    @Expose
    private Boolean HasEsIndex;

    /**
    * <p>true</p>
    */
    @SerializedName("IsSecondaryZone")
    @Expose
    private Boolean IsSecondaryZone;

    /**
    * <p>desc</p>
    */
    @SerializedName("SecondaryZoneInfo")
    @Expose
    private String SecondaryZoneInfo;

    /**
    * <p>是否clickhouse-keeper</p>
    */
    @SerializedName("ClickHouseKeeper")
    @Expose
    private Boolean ClickHouseKeeper;

    /**
    * <p>实例扩展信息</p>
    */
    @SerializedName("Details")
    @Expose
    private InstanceDetail Details;

    /**
    * <p>安全组白名单</p>
    */
    @SerializedName("IsWhiteSGs")
    @Expose
    private Boolean IsWhiteSGs;

    /**
    * <p>绑定的安全组</p>
    */
    @SerializedName("BindSGs")
    @Expose
    private String [] BindSGs;

    /**
    * <p>是否开启公网clb</p>
    */
    @SerializedName("HasPublicCloudClb")
    @Expose
    private Boolean HasPublicCloudClb;

    /**
    * <p>可升级的zk版本</p>
    */
    @SerializedName("UpgradeZkVersions")
    @Expose
    private String UpgradeZkVersions;

    /**
    * <p>是否显示rip</p>
    */
    @SerializedName("ShowRip")
    @Expose
    private String ShowRip;

    /**
    * <p>实例类型：标准型 standard，无keeper节点类型noKeeper；</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>keyvalue视图</p>
    */
    @SerializedName("EnableConfigKeyValue")
    @Expose
    private String EnableConfigKeyValue;

    /**
    * <p>实例是否开启HTTPS</p><p>枚举值：</p><ul><li>true： 已开启HTTPS</li><li>false： 未开启HTTPS</li></ul>
    */
    @SerializedName("HttpsEnabled")
    @Expose
    private Boolean HttpsEnabled;

    /**
     * Get <p>集群实例ID, &quot;cdw-xxxx&quot; 字符串类型</p> 
     * @return InstanceId <p>集群实例ID, &quot;cdw-xxxx&quot; 字符串类型</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>集群实例ID, &quot;cdw-xxxx&quot; 字符串类型</p>
     * @param InstanceId <p>集群实例ID, &quot;cdw-xxxx&quot; 字符串类型</p>
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
     * Get <p>状态,<br>Init 创建中; Serving 运行中；<br>Deleted已销毁；Deleting 销毁中；<br>Modify 集群变更中；</p> 
     * @return Status <p>状态,<br>Init 创建中; Serving 运行中；<br>Deleted已销毁；Deleting 销毁中；<br>Modify 集群变更中；</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态,<br>Init 创建中; Serving 运行中；<br>Deleted已销毁；Deleting 销毁中；<br>Modify 集群变更中；</p>
     * @param Status <p>状态,<br>Init 创建中; Serving 运行中；<br>Deleted已销毁；Deleting 销毁中；<br>Modify 集群变更中；</p>
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
     * @return CommonSummary <p>zookeeper节点描述信息</p>
     */
    public NodesSummary getCommonSummary() {
        return this.CommonSummary;
    }

    /**
     * Set <p>zookeeper节点描述信息</p>
     * @param CommonSummary <p>zookeeper节点描述信息</p>
     */
    public void setCommonSummary(NodesSummary CommonSummary) {
        this.CommonSummary = CommonSummary;
    }

    /**
     * Get <p>高可用,&quot;true&quot; &quot;false&quot;</p> 
     * @return HA <p>高可用,&quot;true&quot; &quot;false&quot;</p>
     */
    public String getHA() {
        return this.HA;
    }

    /**
     * Set <p>高可用,&quot;true&quot; &quot;false&quot;</p>
     * @param HA <p>高可用,&quot;true&quot; &quot;false&quot;</p>
     */
    public void setHA(String HA) {
        this.HA = HA;
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
     * Get <p>可用区说明，例如 &quot;广州二区&quot;</p> 
     * @return ZoneDesc <p>可用区说明，例如 &quot;广州二区&quot;</p>
     */
    public String getZoneDesc() {
        return this.ZoneDesc;
    }

    /**
     * Set <p>可用区说明，例如 &quot;广州二区&quot;</p>
     * @param ZoneDesc <p>可用区说明，例如 &quot;广州二区&quot;</p>
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
     * Get <p>是否弹性ck</p> 
     * @return IsElastic <p>是否弹性ck</p>
     */
    public Boolean getIsElastic() {
        return this.IsElastic;
    }

    /**
     * Set <p>是否弹性ck</p>
     * @param IsElastic <p>是否弹性ck</p>
     */
    public void setIsElastic(Boolean IsElastic) {
        this.IsElastic = IsElastic;
    }

    /**
     * Get <p>集群详细状态</p> 
     * @return InstanceStateInfo <p>集群详细状态</p>
     */
    public InstanceStateInfo getInstanceStateInfo() {
        return this.InstanceStateInfo;
    }

    /**
     * Set <p>集群详细状态</p>
     * @param InstanceStateInfo <p>集群详细状态</p>
     */
    public void setInstanceStateInfo(InstanceStateInfo InstanceStateInfo) {
        this.InstanceStateInfo = InstanceStateInfo;
    }

    /**
     * Get <p>ZK高可用</p> 
     * @return HAZk <p>ZK高可用</p>
     */
    public Boolean getHAZk() {
        return this.HAZk;
    }

    /**
     * Set <p>ZK高可用</p>
     * @param HAZk <p>ZK高可用</p>
     */
    public void setHAZk(Boolean HAZk) {
        this.HAZk = HAZk;
    }

    /**
     * Get <p>挂载盘,默认0:没有类型；1:裸盘;2:lvm</p> 
     * @return MountDiskType <p>挂载盘,默认0:没有类型；1:裸盘;2:lvm</p>
     */
    public Long getMountDiskType() {
        return this.MountDiskType;
    }

    /**
     * Set <p>挂载盘,默认0:没有类型；1:裸盘;2:lvm</p>
     * @param MountDiskType <p>挂载盘,默认0:没有类型；1:裸盘;2:lvm</p>
     */
    public void setMountDiskType(Long MountDiskType) {
        this.MountDiskType = MountDiskType;
    }

    /**
     * Get <p>chproxy连接ip</p> 
     * @return CHProxyVip <p>chproxy连接ip</p>
     */
    public String getCHProxyVip() {
        return this.CHProxyVip;
    }

    /**
     * Set <p>chproxy连接ip</p>
     * @param CHProxyVip <p>chproxy连接ip</p>
     */
    public void setCHProxyVip(String CHProxyVip) {
        this.CHProxyVip = CHProxyVip;
    }

    /**
     * Get <p>cos buket的名字</p> 
     * @return CosBucketName <p>cos buket的名字</p>
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * Set <p>cos buket的名字</p>
     * @param CosBucketName <p>cos buket的名字</p>
     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

    /**
     * Get <p>是否可以挂载云盘</p> 
     * @return CanAttachCbs <p>是否可以挂载云盘</p>
     */
    public Boolean getCanAttachCbs() {
        return this.CanAttachCbs;
    }

    /**
     * Set <p>是否可以挂载云盘</p>
     * @param CanAttachCbs <p>是否可以挂载云盘</p>
     */
    public void setCanAttachCbs(Boolean CanAttachCbs) {
        this.CanAttachCbs = CanAttachCbs;
    }

    /**
     * Get <p>是否可以挂载云盘阵列</p> 
     * @return CanAttachCbsLvm <p>是否可以挂载云盘阵列</p>
     */
    public Boolean getCanAttachCbsLvm() {
        return this.CanAttachCbsLvm;
    }

    /**
     * Set <p>是否可以挂载云盘阵列</p>
     * @param CanAttachCbsLvm <p>是否可以挂载云盘阵列</p>
     */
    public void setCanAttachCbsLvm(Boolean CanAttachCbsLvm) {
        this.CanAttachCbsLvm = CanAttachCbsLvm;
    }

    /**
     * Get <p>是否可以挂载cos</p> 
     * @return CanAttachCos <p>是否可以挂载cos</p>
     */
    public Boolean getCanAttachCos() {
        return this.CanAttachCos;
    }

    /**
     * Set <p>是否可以挂载cos</p>
     * @param CanAttachCos <p>是否可以挂载cos</p>
     */
    public void setCanAttachCos(Boolean CanAttachCos) {
        this.CanAttachCos = CanAttachCos;
    }

    /**
     * Get <p>服务信息</p> 
     * @return Components <p>服务信息</p>
     */
    public ServiceInfo [] getComponents() {
        return this.Components;
    }

    /**
     * Set <p>服务信息</p>
     * @param Components <p>服务信息</p>
     */
    public void setComponents(ServiceInfo [] Components) {
        this.Components = Components;
    }

    /**
     * Get <p>可升级的内核版本</p> 
     * @return UpgradeVersions <p>可升级的内核版本</p>
     */
    public String getUpgradeVersions() {
        return this.UpgradeVersions;
    }

    /**
     * Set <p>可升级的内核版本</p>
     * @param UpgradeVersions <p>可升级的内核版本</p>
     */
    public void setUpgradeVersions(String UpgradeVersions) {
        this.UpgradeVersions = UpgradeVersions;
    }

    /**
     * Get <p>ex-index</p> 
     * @return EsIndexId <p>ex-index</p>
     */
    public String getEsIndexId() {
        return this.EsIndexId;
    }

    /**
     * Set <p>ex-index</p>
     * @param EsIndexId <p>ex-index</p>
     */
    public void setEsIndexId(String EsIndexId) {
        this.EsIndexId = EsIndexId;
    }

    /**
     * Get <p>username</p> 
     * @return EsIndexUsername <p>username</p>
     */
    public String getEsIndexUsername() {
        return this.EsIndexUsername;
    }

    /**
     * Set <p>username</p>
     * @param EsIndexUsername <p>username</p>
     */
    public void setEsIndexUsername(String EsIndexUsername) {
        this.EsIndexUsername = EsIndexUsername;
    }

    /**
     * Get <p>password</p> 
     * @return EsIndexPassword <p>password</p>
     */
    public String getEsIndexPassword() {
        return this.EsIndexPassword;
    }

    /**
     * Set <p>password</p>
     * @param EsIndexPassword <p>password</p>
     */
    public void setEsIndexPassword(String EsIndexPassword) {
        this.EsIndexPassword = EsIndexPassword;
    }

    /**
     * Get <p>true</p> 
     * @return HasEsIndex <p>true</p>
     */
    public Boolean getHasEsIndex() {
        return this.HasEsIndex;
    }

    /**
     * Set <p>true</p>
     * @param HasEsIndex <p>true</p>
     */
    public void setHasEsIndex(Boolean HasEsIndex) {
        this.HasEsIndex = HasEsIndex;
    }

    /**
     * Get <p>true</p> 
     * @return IsSecondaryZone <p>true</p>
     */
    public Boolean getIsSecondaryZone() {
        return this.IsSecondaryZone;
    }

    /**
     * Set <p>true</p>
     * @param IsSecondaryZone <p>true</p>
     */
    public void setIsSecondaryZone(Boolean IsSecondaryZone) {
        this.IsSecondaryZone = IsSecondaryZone;
    }

    /**
     * Get <p>desc</p> 
     * @return SecondaryZoneInfo <p>desc</p>
     */
    public String getSecondaryZoneInfo() {
        return this.SecondaryZoneInfo;
    }

    /**
     * Set <p>desc</p>
     * @param SecondaryZoneInfo <p>desc</p>
     */
    public void setSecondaryZoneInfo(String SecondaryZoneInfo) {
        this.SecondaryZoneInfo = SecondaryZoneInfo;
    }

    /**
     * Get <p>是否clickhouse-keeper</p> 
     * @return ClickHouseKeeper <p>是否clickhouse-keeper</p>
     */
    public Boolean getClickHouseKeeper() {
        return this.ClickHouseKeeper;
    }

    /**
     * Set <p>是否clickhouse-keeper</p>
     * @param ClickHouseKeeper <p>是否clickhouse-keeper</p>
     */
    public void setClickHouseKeeper(Boolean ClickHouseKeeper) {
        this.ClickHouseKeeper = ClickHouseKeeper;
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
     * Get <p>安全组白名单</p> 
     * @return IsWhiteSGs <p>安全组白名单</p>
     */
    public Boolean getIsWhiteSGs() {
        return this.IsWhiteSGs;
    }

    /**
     * Set <p>安全组白名单</p>
     * @param IsWhiteSGs <p>安全组白名单</p>
     */
    public void setIsWhiteSGs(Boolean IsWhiteSGs) {
        this.IsWhiteSGs = IsWhiteSGs;
    }

    /**
     * Get <p>绑定的安全组</p> 
     * @return BindSGs <p>绑定的安全组</p>
     */
    public String [] getBindSGs() {
        return this.BindSGs;
    }

    /**
     * Set <p>绑定的安全组</p>
     * @param BindSGs <p>绑定的安全组</p>
     */
    public void setBindSGs(String [] BindSGs) {
        this.BindSGs = BindSGs;
    }

    /**
     * Get <p>是否开启公网clb</p> 
     * @return HasPublicCloudClb <p>是否开启公网clb</p>
     */
    public Boolean getHasPublicCloudClb() {
        return this.HasPublicCloudClb;
    }

    /**
     * Set <p>是否开启公网clb</p>
     * @param HasPublicCloudClb <p>是否开启公网clb</p>
     */
    public void setHasPublicCloudClb(Boolean HasPublicCloudClb) {
        this.HasPublicCloudClb = HasPublicCloudClb;
    }

    /**
     * Get <p>可升级的zk版本</p> 
     * @return UpgradeZkVersions <p>可升级的zk版本</p>
     */
    public String getUpgradeZkVersions() {
        return this.UpgradeZkVersions;
    }

    /**
     * Set <p>可升级的zk版本</p>
     * @param UpgradeZkVersions <p>可升级的zk版本</p>
     */
    public void setUpgradeZkVersions(String UpgradeZkVersions) {
        this.UpgradeZkVersions = UpgradeZkVersions;
    }

    /**
     * Get <p>是否显示rip</p> 
     * @return ShowRip <p>是否显示rip</p>
     */
    public String getShowRip() {
        return this.ShowRip;
    }

    /**
     * Set <p>是否显示rip</p>
     * @param ShowRip <p>是否显示rip</p>
     */
    public void setShowRip(String ShowRip) {
        this.ShowRip = ShowRip;
    }

    /**
     * Get <p>实例类型：标准型 standard，无keeper节点类型noKeeper；</p> 
     * @return InstanceType <p>实例类型：标准型 standard，无keeper节点类型noKeeper；</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例类型：标准型 standard，无keeper节点类型noKeeper；</p>
     * @param InstanceType <p>实例类型：标准型 standard，无keeper节点类型noKeeper；</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>keyvalue视图</p> 
     * @return EnableConfigKeyValue <p>keyvalue视图</p>
     */
    public String getEnableConfigKeyValue() {
        return this.EnableConfigKeyValue;
    }

    /**
     * Set <p>keyvalue视图</p>
     * @param EnableConfigKeyValue <p>keyvalue视图</p>
     */
    public void setEnableConfigKeyValue(String EnableConfigKeyValue) {
        this.EnableConfigKeyValue = EnableConfigKeyValue;
    }

    /**
     * Get <p>实例是否开启HTTPS</p><p>枚举值：</p><ul><li>true： 已开启HTTPS</li><li>false： 未开启HTTPS</li></ul> 
     * @return HttpsEnabled <p>实例是否开启HTTPS</p><p>枚举值：</p><ul><li>true： 已开启HTTPS</li><li>false： 未开启HTTPS</li></ul>
     */
    public Boolean getHttpsEnabled() {
        return this.HttpsEnabled;
    }

    /**
     * Set <p>实例是否开启HTTPS</p><p>枚举值：</p><ul><li>true： 已开启HTTPS</li><li>false： 未开启HTTPS</li></ul>
     * @param HttpsEnabled <p>实例是否开启HTTPS</p><p>枚举值：</p><ul><li>true： 已开启HTTPS</li><li>false： 未开启HTTPS</li></ul>
     */
    public void setHttpsEnabled(Boolean HttpsEnabled) {
        this.HttpsEnabled = HttpsEnabled;
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
        if (source.ShowRip != null) {
            this.ShowRip = new String(source.ShowRip);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.EnableConfigKeyValue != null) {
            this.EnableConfigKeyValue = new String(source.EnableConfigKeyValue);
        }
        if (source.HttpsEnabled != null) {
            this.HttpsEnabled = new Boolean(source.HttpsEnabled);
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
        this.setParamSimple(map, prefix + "ShowRip", this.ShowRip);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "EnableConfigKeyValue", this.EnableConfigKeyValue);
        this.setParamSimple(map, prefix + "HttpsEnabled", this.HttpsEnabled);

    }
}

