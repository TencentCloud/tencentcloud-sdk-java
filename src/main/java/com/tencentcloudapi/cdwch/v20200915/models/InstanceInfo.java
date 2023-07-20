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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInfo extends AbstractModel{

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
    @SerializedName("CommonSummary")
    @Expose
    private NodesSummary CommonSummary;

    /**
    * 高可用，“true" "false"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HA")
    @Expose
    private String HA;

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
    * 是否弹性ck
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsElastic")
    @Expose
    private Boolean IsElastic;

    /**
    * 集群详细状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceStateInfo")
    @Expose
    private InstanceStateInfo InstanceStateInfo;

    /**
    * ZK高可用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HAZk")
    @Expose
    private Boolean HAZk;

    /**
    * 挂载盘,默认0:没有类型；1:裸盘;2:lvm
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MountDiskType")
    @Expose
    private Long MountDiskType;

    /**
    * 无
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CHProxyVip")
    @Expose
    private String CHProxyVip;

    /**
    * cos buket的名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * 是否可以挂载云盘
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CanAttachCbs")
    @Expose
    private Boolean CanAttachCbs;

    /**
    * 是否可以挂载云盘阵列
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CanAttachCbsLvm")
    @Expose
    private Boolean CanAttachCbsLvm;

    /**
    * 是否可以挂载cos
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CanAttachCos")
    @Expose
    private Boolean CanAttachCos;

    /**
    * 服务信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Components")
    @Expose
    private ServiceInfo [] Components;

    /**
    * 可升级的内核版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpgradeVersions")
    @Expose
    private String UpgradeVersions;

    /**
    * ex-index
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EsIndexId")
    @Expose
    private String EsIndexId;

    /**
    * username
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EsIndexUsername")
    @Expose
    private String EsIndexUsername;

    /**
    * password
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EsIndexPassword")
    @Expose
    private String EsIndexPassword;

    /**
    * true
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasEsIndex")
    @Expose
    private Boolean HasEsIndex;

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
     * @return CommonSummary zookeeper节点描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodesSummary getCommonSummary() {
        return this.CommonSummary;
    }

    /**
     * Set zookeeper节点描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CommonSummary zookeeper节点描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCommonSummary(NodesSummary CommonSummary) {
        this.CommonSummary = CommonSummary;
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
     * Get 是否弹性ck
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsElastic 是否弹性ck
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsElastic() {
        return this.IsElastic;
    }

    /**
     * Set 是否弹性ck
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsElastic 是否弹性ck
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsElastic(Boolean IsElastic) {
        this.IsElastic = IsElastic;
    }

    /**
     * Get 集群详细状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceStateInfo 集群详细状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceStateInfo getInstanceStateInfo() {
        return this.InstanceStateInfo;
    }

    /**
     * Set 集群详细状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceStateInfo 集群详细状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceStateInfo(InstanceStateInfo InstanceStateInfo) {
        this.InstanceStateInfo = InstanceStateInfo;
    }

    /**
     * Get ZK高可用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HAZk ZK高可用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHAZk() {
        return this.HAZk;
    }

    /**
     * Set ZK高可用
注意：此字段可能返回 null，表示取不到有效值。
     * @param HAZk ZK高可用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHAZk(Boolean HAZk) {
        this.HAZk = HAZk;
    }

    /**
     * Get 挂载盘,默认0:没有类型；1:裸盘;2:lvm
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MountDiskType 挂载盘,默认0:没有类型；1:裸盘;2:lvm
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMountDiskType() {
        return this.MountDiskType;
    }

    /**
     * Set 挂载盘,默认0:没有类型；1:裸盘;2:lvm
注意：此字段可能返回 null，表示取不到有效值。
     * @param MountDiskType 挂载盘,默认0:没有类型；1:裸盘;2:lvm
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMountDiskType(Long MountDiskType) {
        this.MountDiskType = MountDiskType;
    }

    /**
     * Get 无
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CHProxyVip 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCHProxyVip() {
        return this.CHProxyVip;
    }

    /**
     * Set 无
注意：此字段可能返回 null，表示取不到有效值。
     * @param CHProxyVip 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCHProxyVip(String CHProxyVip) {
        this.CHProxyVip = CHProxyVip;
    }

    /**
     * Get cos buket的名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosBucketName cos buket的名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * Set cos buket的名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosBucketName cos buket的名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

    /**
     * Get 是否可以挂载云盘
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CanAttachCbs 是否可以挂载云盘
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCanAttachCbs() {
        return this.CanAttachCbs;
    }

    /**
     * Set 是否可以挂载云盘
注意：此字段可能返回 null，表示取不到有效值。
     * @param CanAttachCbs 是否可以挂载云盘
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCanAttachCbs(Boolean CanAttachCbs) {
        this.CanAttachCbs = CanAttachCbs;
    }

    /**
     * Get 是否可以挂载云盘阵列
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CanAttachCbsLvm 是否可以挂载云盘阵列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCanAttachCbsLvm() {
        return this.CanAttachCbsLvm;
    }

    /**
     * Set 是否可以挂载云盘阵列
注意：此字段可能返回 null，表示取不到有效值。
     * @param CanAttachCbsLvm 是否可以挂载云盘阵列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCanAttachCbsLvm(Boolean CanAttachCbsLvm) {
        this.CanAttachCbsLvm = CanAttachCbsLvm;
    }

    /**
     * Get 是否可以挂载cos
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CanAttachCos 是否可以挂载cos
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCanAttachCos() {
        return this.CanAttachCos;
    }

    /**
     * Set 是否可以挂载cos
注意：此字段可能返回 null，表示取不到有效值。
     * @param CanAttachCos 是否可以挂载cos
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCanAttachCos(Boolean CanAttachCos) {
        this.CanAttachCos = CanAttachCos;
    }

    /**
     * Get 服务信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Components 服务信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServiceInfo [] getComponents() {
        return this.Components;
    }

    /**
     * Set 服务信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Components 服务信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComponents(ServiceInfo [] Components) {
        this.Components = Components;
    }

    /**
     * Get 可升级的内核版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpgradeVersions 可升级的内核版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpgradeVersions() {
        return this.UpgradeVersions;
    }

    /**
     * Set 可升级的内核版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpgradeVersions 可升级的内核版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpgradeVersions(String UpgradeVersions) {
        this.UpgradeVersions = UpgradeVersions;
    }

    /**
     * Get ex-index
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EsIndexId ex-index
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEsIndexId() {
        return this.EsIndexId;
    }

    /**
     * Set ex-index
注意：此字段可能返回 null，表示取不到有效值。
     * @param EsIndexId ex-index
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEsIndexId(String EsIndexId) {
        this.EsIndexId = EsIndexId;
    }

    /**
     * Get username
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EsIndexUsername username
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEsIndexUsername() {
        return this.EsIndexUsername;
    }

    /**
     * Set username
注意：此字段可能返回 null，表示取不到有效值。
     * @param EsIndexUsername username
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEsIndexUsername(String EsIndexUsername) {
        this.EsIndexUsername = EsIndexUsername;
    }

    /**
     * Get password
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EsIndexPassword password
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEsIndexPassword() {
        return this.EsIndexPassword;
    }

    /**
     * Set password
注意：此字段可能返回 null，表示取不到有效值。
     * @param EsIndexPassword password
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEsIndexPassword(String EsIndexPassword) {
        this.EsIndexPassword = EsIndexPassword;
    }

    /**
     * Get true
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasEsIndex true
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHasEsIndex() {
        return this.HasEsIndex;
    }

    /**
     * Set true
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasEsIndex true
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasEsIndex(Boolean HasEsIndex) {
        this.HasEsIndex = HasEsIndex;
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

    }
}

