/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
    * 集群实例ID, "cdw-xxxx" 字符串类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 集群实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 状态,
Init 创建中; Serving 运行中； 
Deleted已销毁；Deleting 销毁中；
Modify 集群变更中；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 地域, ap-guangzhou
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 可用区， ap-guangzhou-3
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 私有网络名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 付费类型，"hour", "prepay"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 数据节点描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MasterSummary")
    @Expose
    private NodesSummary MasterSummary;

    /**
    * zookeeper节点描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoreSummary")
    @Expose
    private NodesSummary CoreSummary;

    /**
    * 高可用，“true" "false"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HA")
    @Expose
    private String HA;

    /**
    * 高可用类型：
0：非高可用
1：读高可用
2：读写高可用。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HaType")
    @Expose
    private Long HaType;

    /**
    * 访问地址，例如 "10.0.0.1:9000"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessInfo")
    @Expose
    private String AccessInfo;

    /**
    * 记录ID，数值型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * regionId, 表示地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 可用区说明，例如 "广州二区"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneDesc")
    @Expose
    private String ZoneDesc;

    /**
    * 错误流程说明信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowMsg")
    @Expose
    private String FlowMsg;

    /**
    * 状态描述，例如“运行中”等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 自动续费标记
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenewFlag")
    @Expose
    private Boolean RenewFlag;

    /**
    * 标签列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 监控信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Monitor")
    @Expose
    private String Monitor;

    /**
    * 是否开通日志
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasClsTopic")
    @Expose
    private Boolean HasClsTopic;

    /**
    * 日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClsTopicId")
    @Expose
    private String ClsTopicId;

    /**
    * 日志集ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClsLogSetId")
    @Expose
    private String ClsLogSetId;

    /**
    * 是否支持xml配置管理
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableXMLConfig")
    @Expose
    private Long EnableXMLConfig;

    /**
    * 区域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionDesc")
    @Expose
    private String RegionDesc;

    /**
    * 弹性网卡地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Eip")
    @Expose
    private String Eip;

    /**
    * 冷热分层系数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosMoveFactor")
    @Expose
    private Long CosMoveFactor;

    /**
    * external/local/yunti
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * cos桶
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * cbs
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CanAttachCbs")
    @Expose
    private Boolean CanAttachCbs;

    /**
    * 小版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BuildVersion")
    @Expose
    private String BuildVersion;

    /**
    * 组件信息
注：这里返回类型实际为map[string]struct类型，并非显示的string类型，可以参考“示例值”进行数据的解析。
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Characteristic")
    @Expose
    private String [] Characteristic;

    /**
    * 超时时间 单位s
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RestartTimeout")
    @Expose
    private String RestartTimeout;

    /**
    * 内核优雅重启超时时间，如果为-1说明未设置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GraceShutdownWaitSeconds")
    @Expose
    private String GraceShutdownWaitSeconds;

    /**
    * 表名大小写是否敏感，0：敏感；1：不敏感，以小写进行比较；2：不敏感，表名改为以小写存储
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CaseSensitive")
    @Expose
    private Long CaseSensitive;

    /**
    * 用户是否可以绑定安全组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsWhiteSGs")
    @Expose
    private Boolean IsWhiteSGs;

    /**
    * 已绑定的安全组信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BindSGs")
    @Expose
    private String [] BindSGs;

    /**
    * 是否为多可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableMultiZones")
    @Expose
    private Boolean EnableMultiZones;

    /**
    * 用户可用区和子网信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserNetworkInfos")
    @Expose
    private String UserNetworkInfos;

    /**
    * 是否启用冷热分层。0：未开启 1：已开启
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableCoolDown")
    @Expose
    private Long EnableCoolDown;

    /**
    * 冷热分层使用COS桶
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoolDownBucket")
    @Expose
    private String CoolDownBucket;

    /**
    * 实例扩展信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Details")
    @Expose
    private InstanceDetail Details;

    /**
    * 是否启用DLC 0:关闭 1:开启
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableDlc")
    @Expose
    private Long EnableDlc;

    /**
    * 账户类型 0:普通用户 1:CAM用户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * 监控模式 0: 老监控 1：新监控
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get 集群实例ID, "cdw-xxxx" 字符串类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 集群实例ID, "cdw-xxxx" 字符串类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群实例ID, "cdw-xxxx" 字符串类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 集群实例ID, "cdw-xxxx" 字符串类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 集群实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 集群实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 集群实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 集群实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 状态,
Init 创建中; Serving 运行中； 
Deleted已销毁；Deleting 销毁中；
Modify 集群变更中；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态,
Init 创建中; Serving 运行中； 
Deleted已销毁；Deleting 销毁中；
Modify 集群变更中；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态,
Init 创建中; Serving 运行中； 
Deleted已销毁；Deleting 销毁中；
Modify 集群变更中；
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态,
Init 创建中; Serving 运行中； 
Deleted已销毁；Deleting 销毁中；
Modify 集群变更中；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 地域, ap-guangzhou
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域, ap-guangzhou
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域, ap-guangzhou
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域, ap-guangzhou
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 可用区， ap-guangzhou-3
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone 可用区， ap-guangzhou-3
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区， ap-guangzhou-3
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone 可用区， ap-guangzhou-3
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 私有网络名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId 私有网络名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 私有网络名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 子网名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 付费类型，"hour", "prepay"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayMode 付费类型，"hour", "prepay"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费类型，"hour", "prepay"
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayMode 付费类型，"hour", "prepay"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 数据节点描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MasterSummary 数据节点描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodesSummary getMasterSummary() {
        return this.MasterSummary;
    }

    /**
     * Set 数据节点描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param MasterSummary 数据节点描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMasterSummary(NodesSummary MasterSummary) {
        this.MasterSummary = MasterSummary;
    }

    /**
     * Get zookeeper节点描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CoreSummary zookeeper节点描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodesSummary getCoreSummary() {
        return this.CoreSummary;
    }

    /**
     * Set zookeeper节点描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoreSummary zookeeper节点描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoreSummary(NodesSummary CoreSummary) {
        this.CoreSummary = CoreSummary;
    }

    /**
     * Get 高可用，“true" "false"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HA 高可用，“true" "false"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHA() {
        return this.HA;
    }

    /**
     * Set 高可用，“true" "false"
注意：此字段可能返回 null，表示取不到有效值。
     * @param HA 高可用，“true" "false"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHA(String HA) {
        this.HA = HA;
    }

    /**
     * Get 高可用类型：
0：非高可用
1：读高可用
2：读写高可用。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HaType 高可用类型：
0：非高可用
1：读高可用
2：读写高可用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHaType() {
        return this.HaType;
    }

    /**
     * Set 高可用类型：
0：非高可用
1：读高可用
2：读写高可用。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HaType 高可用类型：
0：非高可用
1：读高可用
2：读写高可用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHaType(Long HaType) {
        this.HaType = HaType;
    }

    /**
     * Get 访问地址，例如 "10.0.0.1:9000"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessInfo 访问地址，例如 "10.0.0.1:9000"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccessInfo() {
        return this.AccessInfo;
    }

    /**
     * Set 访问地址，例如 "10.0.0.1:9000"
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessInfo 访问地址，例如 "10.0.0.1:9000"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessInfo(String AccessInfo) {
        this.AccessInfo = AccessInfo;
    }

    /**
     * Get 记录ID，数值型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 记录ID，数值型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 记录ID，数值型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 记录ID，数值型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get regionId, 表示地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionId regionId, 表示地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set regionId, 表示地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionId regionId, 表示地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 可用区说明，例如 "广州二区"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneDesc 可用区说明，例如 "广州二区"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZoneDesc() {
        return this.ZoneDesc;
    }

    /**
     * Set 可用区说明，例如 "广州二区"
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneDesc 可用区说明，例如 "广州二区"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneDesc(String ZoneDesc) {
        this.ZoneDesc = ZoneDesc;
    }

    /**
     * Get 错误流程说明信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowMsg 错误流程说明信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlowMsg() {
        return this.FlowMsg;
    }

    /**
     * Set 错误流程说明信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowMsg 错误流程说明信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowMsg(String FlowMsg) {
        this.FlowMsg = FlowMsg;
    }

    /**
     * Get 状态描述，例如“运行中”等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusDesc 状态描述，例如“运行中”等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 状态描述，例如“运行中”等
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusDesc 状态描述，例如“运行中”等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 自动续费标记
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenewFlag 自动续费标记
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费标记
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewFlag 自动续费标记
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewFlag(Boolean RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 标签列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 监控信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Monitor 监控信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMonitor() {
        return this.Monitor;
    }

    /**
     * Set 监控信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Monitor 监控信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonitor(String Monitor) {
        this.Monitor = Monitor;
    }

    /**
     * Get 是否开通日志
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasClsTopic 是否开通日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHasClsTopic() {
        return this.HasClsTopic;
    }

    /**
     * Set 是否开通日志
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasClsTopic 是否开通日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasClsTopic(Boolean HasClsTopic) {
        this.HasClsTopic = HasClsTopic;
    }

    /**
     * Get 日志主题ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClsTopicId 日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClsTopicId() {
        return this.ClsTopicId;
    }

    /**
     * Set 日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClsTopicId 日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClsTopicId(String ClsTopicId) {
        this.ClsTopicId = ClsTopicId;
    }

    /**
     * Get 日志集ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClsLogSetId 日志集ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClsLogSetId() {
        return this.ClsLogSetId;
    }

    /**
     * Set 日志集ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClsLogSetId 日志集ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClsLogSetId(String ClsLogSetId) {
        this.ClsLogSetId = ClsLogSetId;
    }

    /**
     * Get 是否支持xml配置管理
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableXMLConfig 是否支持xml配置管理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnableXMLConfig() {
        return this.EnableXMLConfig;
    }

    /**
     * Set 是否支持xml配置管理
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableXMLConfig 是否支持xml配置管理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableXMLConfig(Long EnableXMLConfig) {
        this.EnableXMLConfig = EnableXMLConfig;
    }

    /**
     * Get 区域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionDesc 区域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionDesc() {
        return this.RegionDesc;
    }

    /**
     * Set 区域
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionDesc 区域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionDesc(String RegionDesc) {
        this.RegionDesc = RegionDesc;
    }

    /**
     * Get 弹性网卡地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Eip 弹性网卡地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEip() {
        return this.Eip;
    }

    /**
     * Set 弹性网卡地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Eip 弹性网卡地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEip(String Eip) {
        this.Eip = Eip;
    }

    /**
     * Get 冷热分层系数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosMoveFactor 冷热分层系数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCosMoveFactor() {
        return this.CosMoveFactor;
    }

    /**
     * Set 冷热分层系数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosMoveFactor 冷热分层系数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosMoveFactor(Long CosMoveFactor) {
        this.CosMoveFactor = CosMoveFactor;
    }

    /**
     * Get external/local/yunti
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Kind external/local/yunti
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set external/local/yunti
注意：此字段可能返回 null，表示取不到有效值。
     * @param Kind external/local/yunti
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get cos桶
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosBucketName cos桶
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * Set cos桶
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosBucketName cos桶
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

    /**
     * Get cbs
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CanAttachCbs cbs
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCanAttachCbs() {
        return this.CanAttachCbs;
    }

    /**
     * Set cbs
注意：此字段可能返回 null，表示取不到有效值。
     * @param CanAttachCbs cbs
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCanAttachCbs(Boolean CanAttachCbs) {
        this.CanAttachCbs = CanAttachCbs;
    }

    /**
     * Get 小版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BuildVersion 小版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBuildVersion() {
        return this.BuildVersion;
    }

    /**
     * Set 小版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param BuildVersion 小版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBuildVersion(String BuildVersion) {
        this.BuildVersion = BuildVersion;
    }

    /**
     * Get 组件信息
注：这里返回类型实际为map[string]struct类型，并非显示的string类型，可以参考“示例值”进行数据的解析。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Components 组件信息
注：这里返回类型实际为map[string]struct类型，并非显示的string类型，可以参考“示例值”进行数据的解析。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComponents() {
        return this.Components;
    }

    /**
     * Set 组件信息
注：这里返回类型实际为map[string]struct类型，并非显示的string类型，可以参考“示例值”进行数据的解析。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Components 组件信息
注：这里返回类型实际为map[string]struct类型，并非显示的string类型，可以参考“示例值”进行数据的解析。
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Characteristic 页面特性，用于前端屏蔽一些页面入口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCharacteristic() {
        return this.Characteristic;
    }

    /**
     * Set 页面特性，用于前端屏蔽一些页面入口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Characteristic 页面特性，用于前端屏蔽一些页面入口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCharacteristic(String [] Characteristic) {
        this.Characteristic = Characteristic;
    }

    /**
     * Get 超时时间 单位s
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RestartTimeout 超时时间 单位s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRestartTimeout() {
        return this.RestartTimeout;
    }

    /**
     * Set 超时时间 单位s
注意：此字段可能返回 null，表示取不到有效值。
     * @param RestartTimeout 超时时间 单位s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRestartTimeout(String RestartTimeout) {
        this.RestartTimeout = RestartTimeout;
    }

    /**
     * Get 内核优雅重启超时时间，如果为-1说明未设置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GraceShutdownWaitSeconds 内核优雅重启超时时间，如果为-1说明未设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGraceShutdownWaitSeconds() {
        return this.GraceShutdownWaitSeconds;
    }

    /**
     * Set 内核优雅重启超时时间，如果为-1说明未设置
注意：此字段可能返回 null，表示取不到有效值。
     * @param GraceShutdownWaitSeconds 内核优雅重启超时时间，如果为-1说明未设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGraceShutdownWaitSeconds(String GraceShutdownWaitSeconds) {
        this.GraceShutdownWaitSeconds = GraceShutdownWaitSeconds;
    }

    /**
     * Get 表名大小写是否敏感，0：敏感；1：不敏感，以小写进行比较；2：不敏感，表名改为以小写存储
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CaseSensitive 表名大小写是否敏感，0：敏感；1：不敏感，以小写进行比较；2：不敏感，表名改为以小写存储
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCaseSensitive() {
        return this.CaseSensitive;
    }

    /**
     * Set 表名大小写是否敏感，0：敏感；1：不敏感，以小写进行比较；2：不敏感，表名改为以小写存储
注意：此字段可能返回 null，表示取不到有效值。
     * @param CaseSensitive 表名大小写是否敏感，0：敏感；1：不敏感，以小写进行比较；2：不敏感，表名改为以小写存储
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCaseSensitive(Long CaseSensitive) {
        this.CaseSensitive = CaseSensitive;
    }

    /**
     * Get 用户是否可以绑定安全组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsWhiteSGs 用户是否可以绑定安全组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsWhiteSGs() {
        return this.IsWhiteSGs;
    }

    /**
     * Set 用户是否可以绑定安全组
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsWhiteSGs 用户是否可以绑定安全组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsWhiteSGs(Boolean IsWhiteSGs) {
        this.IsWhiteSGs = IsWhiteSGs;
    }

    /**
     * Get 已绑定的安全组信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BindSGs 已绑定的安全组信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBindSGs() {
        return this.BindSGs;
    }

    /**
     * Set 已绑定的安全组信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param BindSGs 已绑定的安全组信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBindSGs(String [] BindSGs) {
        this.BindSGs = BindSGs;
    }

    /**
     * Get 是否为多可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableMultiZones 是否为多可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableMultiZones() {
        return this.EnableMultiZones;
    }

    /**
     * Set 是否为多可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableMultiZones 是否为多可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableMultiZones(Boolean EnableMultiZones) {
        this.EnableMultiZones = EnableMultiZones;
    }

    /**
     * Get 用户可用区和子网信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserNetworkInfos 用户可用区和子网信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserNetworkInfos() {
        return this.UserNetworkInfos;
    }

    /**
     * Set 用户可用区和子网信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserNetworkInfos 用户可用区和子网信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserNetworkInfos(String UserNetworkInfos) {
        this.UserNetworkInfos = UserNetworkInfos;
    }

    /**
     * Get 是否启用冷热分层。0：未开启 1：已开启
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableCoolDown 是否启用冷热分层。0：未开启 1：已开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnableCoolDown() {
        return this.EnableCoolDown;
    }

    /**
     * Set 是否启用冷热分层。0：未开启 1：已开启
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableCoolDown 是否启用冷热分层。0：未开启 1：已开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableCoolDown(Long EnableCoolDown) {
        this.EnableCoolDown = EnableCoolDown;
    }

    /**
     * Get 冷热分层使用COS桶
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CoolDownBucket 冷热分层使用COS桶
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCoolDownBucket() {
        return this.CoolDownBucket;
    }

    /**
     * Set 冷热分层使用COS桶
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoolDownBucket 冷热分层使用COS桶
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoolDownBucket(String CoolDownBucket) {
        this.CoolDownBucket = CoolDownBucket;
    }

    /**
     * Get 实例扩展信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Details 实例扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceDetail getDetails() {
        return this.Details;
    }

    /**
     * Set 实例扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Details 实例扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetails(InstanceDetail Details) {
        this.Details = Details;
    }

    /**
     * Get 是否启用DLC 0:关闭 1:开启
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableDlc 是否启用DLC 0:关闭 1:开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnableDlc() {
        return this.EnableDlc;
    }

    /**
     * Set 是否启用DLC 0:关闭 1:开启
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableDlc 是否启用DLC 0:关闭 1:开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableDlc(Long EnableDlc) {
        this.EnableDlc = EnableDlc;
    }

    /**
     * Get 账户类型 0:普通用户 1:CAM用户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountType 账户类型 0:普通用户 1:CAM用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set 账户类型 0:普通用户 1:CAM用户
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountType 账户类型 0:普通用户 1:CAM用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get 监控模式 0: 老监控 1：新监控
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonitorMode 监控模式 0: 老监控 1：新监控
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMonitorMode() {
        return this.MonitorMode;
    }

    /**
     * Set 监控模式 0: 老监控 1：新监控
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonitorMode 监控模式 0: 老监控 1：新监控
注意：此字段可能返回 null，表示取不到有效值。
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

    }
}

