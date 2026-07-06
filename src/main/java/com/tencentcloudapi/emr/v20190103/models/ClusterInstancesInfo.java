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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterInstancesInfo extends AbstractModel {

    /**
    * <p>ID号</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>标题</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ftitle")
    @Expose
    private String Ftitle;

    /**
    * <p>集群名</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>地域ID</p>
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * <p>地区ID</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>用户APPID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>用户UIN</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>项目Id</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>集群VPCID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * <p>子网ID</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * <p>实例的状态码。取值范围：</p><li>2：表示集群运行中。</li><li>3：表示集群创建中。</li><li>4：表示集群扩容中。</li><li>5：表示集群增加router节点中。</li><li>6：表示集群安装组件中。</li><li>7：表示集群执行命令中。</li><li>8：表示重启服务中。</li><li>9：表示进入维护中。</li><li>10：表示服务暂停中。</li><li>11：表示退出维护中。</li><li>12：表示退出暂停中。</li><li>13：表示配置下发中。</li><li>14：表示销毁集群中。</li><li>15：表示销毁core节点中。</li><li>16：销毁task节点中。</li><li>17：表示销毁router节点中。</li><li>18：表示更改webproxy密码中。</li><li>19：表示集群隔离中。</li><li>20：表示集群冲正中。</li><li>21：表示集群回收中。</li><li>22：表示变配等待中。</li><li>23：表示集群已隔离。</li><li>24：表示缩容节点中。</li><li>33：表示集群等待退费中。</li><li>34：表示集群已退费。</li><li>301：表示创建失败。</li><li>302：表示扩容失败。</li>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>添加时间</p>
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * <p>已经运行时间</p>
    */
    @SerializedName("RunTime")
    @Expose
    private String RunTime;

    /**
    * <p>集群产品配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Config")
    @Expose
    private EmrProductConfigOutter Config;

    /**
    * <p>主节点外网IP</p>
    */
    @SerializedName("MasterIp")
    @Expose
    private String MasterIp;

    /**
    * <p>EMR版本</p>
    */
    @SerializedName("EmrVersion")
    @Expose
    private String EmrVersion;

    /**
    * <p>收费类型</p>
    */
    @SerializedName("ChargeType")
    @Expose
    private Long ChargeType;

    /**
    * <p>交易版本</p>
    */
    @SerializedName("TradeVersion")
    @Expose
    private Long TradeVersion;

    /**
    * <p>资源订单ID</p>
    */
    @SerializedName("ResourceOrderId")
    @Expose
    private Long ResourceOrderId;

    /**
    * <p>是否计费集群</p>
    */
    @SerializedName("IsTradeCluster")
    @Expose
    private Long IsTradeCluster;

    /**
    * <p>集群错误状态告警信息</p>
    */
    @SerializedName("AlarmInfo")
    @Expose
    private String AlarmInfo;

    /**
    * <p>是否采用新架构</p>
    */
    @SerializedName("IsWoodpeckerCluster")
    @Expose
    private Long IsWoodpeckerCluster;

    /**
    * <p>元数据库信息</p>
    */
    @SerializedName("MetaDb")
    @Expose
    private String MetaDb;

    /**
    * <p>标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>Hive元数据信息</p>
    */
    @SerializedName("HiveMetaDb")
    @Expose
    private String HiveMetaDb;

    /**
    * <p>集群类型:EMR,CLICKHOUSE,DRUID</p>
    */
    @SerializedName("ServiceClass")
    @Expose
    private String ServiceClass;

    /**
    * <p>集群所有节点的别名序列化</p>
    */
    @SerializedName("AliasInfo")
    @Expose
    private String AliasInfo;

    /**
    * <p>集群版本Id</p>
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * <p>地区ID</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>场景名称</p>
    */
    @SerializedName("SceneName")
    @Expose
    private String SceneName;

    /**
    * <p>场景化集群类型</p>
    */
    @SerializedName("SceneServiceClass")
    @Expose
    private String SceneServiceClass;

    /**
    * <p>场景化EMR版本</p>
    */
    @SerializedName("SceneEmrVersion")
    @Expose
    private String SceneEmrVersion;

    /**
    * <p>场景化集群类型</p>
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * <p>vpc name</p>
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * <p>subnet name</p>
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * <p>集群依赖关系</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterExternalServiceInfo")
    @Expose
    private ClusterExternalServiceInfo [] ClusterExternalServiceInfo;

    /**
    * <p>集群vpcid 字符串类型</p>
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * <p>子网id 字符串类型</p>
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * <p>节点信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopologyInfoList")
    @Expose
    private TopologyInfo [] TopologyInfoList;

    /**
    * <p>是否是跨AZ集群</p>
    */
    @SerializedName("IsMultiZoneCluster")
    @Expose
    private Boolean IsMultiZoneCluster;

    /**
    * <p>是否开通异常节点自动补偿</p>
    */
    @SerializedName("IsCvmReplace")
    @Expose
    private Boolean IsCvmReplace;

    /**
    * <p>标题</p>
    */
    @SerializedName("ClusterTitle")
    @Expose
    private String ClusterTitle;

    /**
    * <p>集群产品配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigDetail")
    @Expose
    private EmrProductConfigDetail ConfigDetail;

    /**
    * <p>集群绑定的文件系统数</p>
    */
    @SerializedName("BindFileSystemNum")
    @Expose
    private Long BindFileSystemNum;

    /**
    * <p>rss集群的绑定列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterRelationInfoList")
    @Expose
    private ClusterRelationMeta [] ClusterRelationInfoList;

    /**
    * <p>Redis信息</p>
    */
    @SerializedName("RedisId")
    @Expose
    private String RedisId;

    /**
    * <p>是否开启IO故障自愈</p>
    */
    @SerializedName("IsIOHungSelfRecovery")
    @Expose
    private Boolean IsIOHungSelfRecovery;

    /**
    * <p>元数据信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetaDBGroupInfo")
    @Expose
    private CustomMetaDBInfo [] MetaDBGroupInfo;

    /**
     * Get <p>ID号</p> 
     * @return Id <p>ID号</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>ID号</p>
     * @param Id <p>ID号</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>集群ID</p> 
     * @return ClusterId <p>集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterId <p>集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>标题</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ftitle <p>标题</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getFtitle() {
        return this.Ftitle;
    }

    /**
     * Set <p>标题</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ftitle <p>标题</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setFtitle(String Ftitle) {
        this.Ftitle = Ftitle;
    }

    /**
     * Get <p>集群名</p> 
     * @return ClusterName <p>集群名</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名</p>
     * @param ClusterName <p>集群名</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>地域ID</p> 
     * @return RegionId <p>地域ID</p>
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>地域ID</p>
     * @param RegionId <p>地域ID</p>
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>地区ID</p> 
     * @return ZoneId <p>地区ID</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>地区ID</p>
     * @param ZoneId <p>地区ID</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>用户APPID</p> 
     * @return AppId <p>用户APPID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>用户APPID</p>
     * @param AppId <p>用户APPID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>用户UIN</p> 
     * @return Uin <p>用户UIN</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>用户UIN</p>
     * @param Uin <p>用户UIN</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>项目Id</p> 
     * @return ProjectId <p>项目Id</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目Id</p>
     * @param ProjectId <p>项目Id</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>集群VPCID</p> 
     * @return VpcId <p>集群VPCID</p>
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>集群VPCID</p>
     * @param VpcId <p>集群VPCID</p>
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网ID</p> 
     * @return SubnetId <p>子网ID</p>
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网ID</p>
     * @param SubnetId <p>子网ID</p>
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>实例的状态码。取值范围：</p><li>2：表示集群运行中。</li><li>3：表示集群创建中。</li><li>4：表示集群扩容中。</li><li>5：表示集群增加router节点中。</li><li>6：表示集群安装组件中。</li><li>7：表示集群执行命令中。</li><li>8：表示重启服务中。</li><li>9：表示进入维护中。</li><li>10：表示服务暂停中。</li><li>11：表示退出维护中。</li><li>12：表示退出暂停中。</li><li>13：表示配置下发中。</li><li>14：表示销毁集群中。</li><li>15：表示销毁core节点中。</li><li>16：销毁task节点中。</li><li>17：表示销毁router节点中。</li><li>18：表示更改webproxy密码中。</li><li>19：表示集群隔离中。</li><li>20：表示集群冲正中。</li><li>21：表示集群回收中。</li><li>22：表示变配等待中。</li><li>23：表示集群已隔离。</li><li>24：表示缩容节点中。</li><li>33：表示集群等待退费中。</li><li>34：表示集群已退费。</li><li>301：表示创建失败。</li><li>302：表示扩容失败。</li> 
     * @return Status <p>实例的状态码。取值范围：</p><li>2：表示集群运行中。</li><li>3：表示集群创建中。</li><li>4：表示集群扩容中。</li><li>5：表示集群增加router节点中。</li><li>6：表示集群安装组件中。</li><li>7：表示集群执行命令中。</li><li>8：表示重启服务中。</li><li>9：表示进入维护中。</li><li>10：表示服务暂停中。</li><li>11：表示退出维护中。</li><li>12：表示退出暂停中。</li><li>13：表示配置下发中。</li><li>14：表示销毁集群中。</li><li>15：表示销毁core节点中。</li><li>16：销毁task节点中。</li><li>17：表示销毁router节点中。</li><li>18：表示更改webproxy密码中。</li><li>19：表示集群隔离中。</li><li>20：表示集群冲正中。</li><li>21：表示集群回收中。</li><li>22：表示变配等待中。</li><li>23：表示集群已隔离。</li><li>24：表示缩容节点中。</li><li>33：表示集群等待退费中。</li><li>34：表示集群已退费。</li><li>301：表示创建失败。</li><li>302：表示扩容失败。</li>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实例的状态码。取值范围：</p><li>2：表示集群运行中。</li><li>3：表示集群创建中。</li><li>4：表示集群扩容中。</li><li>5：表示集群增加router节点中。</li><li>6：表示集群安装组件中。</li><li>7：表示集群执行命令中。</li><li>8：表示重启服务中。</li><li>9：表示进入维护中。</li><li>10：表示服务暂停中。</li><li>11：表示退出维护中。</li><li>12：表示退出暂停中。</li><li>13：表示配置下发中。</li><li>14：表示销毁集群中。</li><li>15：表示销毁core节点中。</li><li>16：销毁task节点中。</li><li>17：表示销毁router节点中。</li><li>18：表示更改webproxy密码中。</li><li>19：表示集群隔离中。</li><li>20：表示集群冲正中。</li><li>21：表示集群回收中。</li><li>22：表示变配等待中。</li><li>23：表示集群已隔离。</li><li>24：表示缩容节点中。</li><li>33：表示集群等待退费中。</li><li>34：表示集群已退费。</li><li>301：表示创建失败。</li><li>302：表示扩容失败。</li>
     * @param Status <p>实例的状态码。取值范围：</p><li>2：表示集群运行中。</li><li>3：表示集群创建中。</li><li>4：表示集群扩容中。</li><li>5：表示集群增加router节点中。</li><li>6：表示集群安装组件中。</li><li>7：表示集群执行命令中。</li><li>8：表示重启服务中。</li><li>9：表示进入维护中。</li><li>10：表示服务暂停中。</li><li>11：表示退出维护中。</li><li>12：表示退出暂停中。</li><li>13：表示配置下发中。</li><li>14：表示销毁集群中。</li><li>15：表示销毁core节点中。</li><li>16：销毁task节点中。</li><li>17：表示销毁router节点中。</li><li>18：表示更改webproxy密码中。</li><li>19：表示集群隔离中。</li><li>20：表示集群冲正中。</li><li>21：表示集群回收中。</li><li>22：表示变配等待中。</li><li>23：表示集群已隔离。</li><li>24：表示缩容节点中。</li><li>33：表示集群等待退费中。</li><li>34：表示集群已退费。</li><li>301：表示创建失败。</li><li>302：表示扩容失败。</li>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>添加时间</p> 
     * @return AddTime <p>添加时间</p>
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set <p>添加时间</p>
     * @param AddTime <p>添加时间</p>
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get <p>已经运行时间</p> 
     * @return RunTime <p>已经运行时间</p>
     */
    public String getRunTime() {
        return this.RunTime;
    }

    /**
     * Set <p>已经运行时间</p>
     * @param RunTime <p>已经运行时间</p>
     */
    public void setRunTime(String RunTime) {
        this.RunTime = RunTime;
    }

    /**
     * Get <p>集群产品配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Config <p>集群产品配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public EmrProductConfigOutter getConfig() {
        return this.Config;
    }

    /**
     * Set <p>集群产品配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Config <p>集群产品配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setConfig(EmrProductConfigOutter Config) {
        this.Config = Config;
    }

    /**
     * Get <p>主节点外网IP</p> 
     * @return MasterIp <p>主节点外网IP</p>
     */
    public String getMasterIp() {
        return this.MasterIp;
    }

    /**
     * Set <p>主节点外网IP</p>
     * @param MasterIp <p>主节点外网IP</p>
     */
    public void setMasterIp(String MasterIp) {
        this.MasterIp = MasterIp;
    }

    /**
     * Get <p>EMR版本</p> 
     * @return EmrVersion <p>EMR版本</p>
     */
    public String getEmrVersion() {
        return this.EmrVersion;
    }

    /**
     * Set <p>EMR版本</p>
     * @param EmrVersion <p>EMR版本</p>
     */
    public void setEmrVersion(String EmrVersion) {
        this.EmrVersion = EmrVersion;
    }

    /**
     * Get <p>收费类型</p> 
     * @return ChargeType <p>收费类型</p>
     */
    public Long getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set <p>收费类型</p>
     * @param ChargeType <p>收费类型</p>
     */
    public void setChargeType(Long ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get <p>交易版本</p> 
     * @return TradeVersion <p>交易版本</p>
     */
    public Long getTradeVersion() {
        return this.TradeVersion;
    }

    /**
     * Set <p>交易版本</p>
     * @param TradeVersion <p>交易版本</p>
     */
    public void setTradeVersion(Long TradeVersion) {
        this.TradeVersion = TradeVersion;
    }

    /**
     * Get <p>资源订单ID</p> 
     * @return ResourceOrderId <p>资源订单ID</p>
     */
    public Long getResourceOrderId() {
        return this.ResourceOrderId;
    }

    /**
     * Set <p>资源订单ID</p>
     * @param ResourceOrderId <p>资源订单ID</p>
     */
    public void setResourceOrderId(Long ResourceOrderId) {
        this.ResourceOrderId = ResourceOrderId;
    }

    /**
     * Get <p>是否计费集群</p> 
     * @return IsTradeCluster <p>是否计费集群</p>
     */
    public Long getIsTradeCluster() {
        return this.IsTradeCluster;
    }

    /**
     * Set <p>是否计费集群</p>
     * @param IsTradeCluster <p>是否计费集群</p>
     */
    public void setIsTradeCluster(Long IsTradeCluster) {
        this.IsTradeCluster = IsTradeCluster;
    }

    /**
     * Get <p>集群错误状态告警信息</p> 
     * @return AlarmInfo <p>集群错误状态告警信息</p>
     */
    public String getAlarmInfo() {
        return this.AlarmInfo;
    }

    /**
     * Set <p>集群错误状态告警信息</p>
     * @param AlarmInfo <p>集群错误状态告警信息</p>
     */
    public void setAlarmInfo(String AlarmInfo) {
        this.AlarmInfo = AlarmInfo;
    }

    /**
     * Get <p>是否采用新架构</p> 
     * @return IsWoodpeckerCluster <p>是否采用新架构</p>
     */
    public Long getIsWoodpeckerCluster() {
        return this.IsWoodpeckerCluster;
    }

    /**
     * Set <p>是否采用新架构</p>
     * @param IsWoodpeckerCluster <p>是否采用新架构</p>
     */
    public void setIsWoodpeckerCluster(Long IsWoodpeckerCluster) {
        this.IsWoodpeckerCluster = IsWoodpeckerCluster;
    }

    /**
     * Get <p>元数据库信息</p> 
     * @return MetaDb <p>元数据库信息</p>
     */
    public String getMetaDb() {
        return this.MetaDb;
    }

    /**
     * Set <p>元数据库信息</p>
     * @param MetaDb <p>元数据库信息</p>
     */
    public void setMetaDb(String MetaDb) {
        this.MetaDb = MetaDb;
    }

    /**
     * Get <p>标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Hive元数据信息</p> 
     * @return HiveMetaDb <p>Hive元数据信息</p>
     */
    public String getHiveMetaDb() {
        return this.HiveMetaDb;
    }

    /**
     * Set <p>Hive元数据信息</p>
     * @param HiveMetaDb <p>Hive元数据信息</p>
     */
    public void setHiveMetaDb(String HiveMetaDb) {
        this.HiveMetaDb = HiveMetaDb;
    }

    /**
     * Get <p>集群类型:EMR,CLICKHOUSE,DRUID</p> 
     * @return ServiceClass <p>集群类型:EMR,CLICKHOUSE,DRUID</p>
     */
    public String getServiceClass() {
        return this.ServiceClass;
    }

    /**
     * Set <p>集群类型:EMR,CLICKHOUSE,DRUID</p>
     * @param ServiceClass <p>集群类型:EMR,CLICKHOUSE,DRUID</p>
     */
    public void setServiceClass(String ServiceClass) {
        this.ServiceClass = ServiceClass;
    }

    /**
     * Get <p>集群所有节点的别名序列化</p> 
     * @return AliasInfo <p>集群所有节点的别名序列化</p>
     */
    public String getAliasInfo() {
        return this.AliasInfo;
    }

    /**
     * Set <p>集群所有节点的别名序列化</p>
     * @param AliasInfo <p>集群所有节点的别名序列化</p>
     */
    public void setAliasInfo(String AliasInfo) {
        this.AliasInfo = AliasInfo;
    }

    /**
     * Get <p>集群版本Id</p> 
     * @return ProductId <p>集群版本Id</p>
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>集群版本Id</p>
     * @param ProductId <p>集群版本Id</p>
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>地区ID</p> 
     * @return Zone <p>地区ID</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>地区ID</p>
     * @param Zone <p>地区ID</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>场景名称</p> 
     * @return SceneName <p>场景名称</p>
     */
    public String getSceneName() {
        return this.SceneName;
    }

    /**
     * Set <p>场景名称</p>
     * @param SceneName <p>场景名称</p>
     */
    public void setSceneName(String SceneName) {
        this.SceneName = SceneName;
    }

    /**
     * Get <p>场景化集群类型</p> 
     * @return SceneServiceClass <p>场景化集群类型</p>
     */
    public String getSceneServiceClass() {
        return this.SceneServiceClass;
    }

    /**
     * Set <p>场景化集群类型</p>
     * @param SceneServiceClass <p>场景化集群类型</p>
     */
    public void setSceneServiceClass(String SceneServiceClass) {
        this.SceneServiceClass = SceneServiceClass;
    }

    /**
     * Get <p>场景化EMR版本</p> 
     * @return SceneEmrVersion <p>场景化EMR版本</p>
     */
    public String getSceneEmrVersion() {
        return this.SceneEmrVersion;
    }

    /**
     * Set <p>场景化EMR版本</p>
     * @param SceneEmrVersion <p>场景化EMR版本</p>
     */
    public void setSceneEmrVersion(String SceneEmrVersion) {
        this.SceneEmrVersion = SceneEmrVersion;
    }

    /**
     * Get <p>场景化集群类型</p> 
     * @return DisplayName <p>场景化集群类型</p>
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set <p>场景化集群类型</p>
     * @param DisplayName <p>场景化集群类型</p>
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get <p>vpc name</p> 
     * @return VpcName <p>vpc name</p>
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set <p>vpc name</p>
     * @param VpcName <p>vpc name</p>
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get <p>subnet name</p> 
     * @return SubnetName <p>subnet name</p>
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set <p>subnet name</p>
     * @param SubnetName <p>subnet name</p>
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get <p>集群依赖关系</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterExternalServiceInfo <p>集群依赖关系</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClusterExternalServiceInfo [] getClusterExternalServiceInfo() {
        return this.ClusterExternalServiceInfo;
    }

    /**
     * Set <p>集群依赖关系</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterExternalServiceInfo <p>集群依赖关系</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterExternalServiceInfo(ClusterExternalServiceInfo [] ClusterExternalServiceInfo) {
        this.ClusterExternalServiceInfo = ClusterExternalServiceInfo;
    }

    /**
     * Get <p>集群vpcid 字符串类型</p> 
     * @return UniqVpcId <p>集群vpcid 字符串类型</p>
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set <p>集群vpcid 字符串类型</p>
     * @param UniqVpcId <p>集群vpcid 字符串类型</p>
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get <p>子网id 字符串类型</p> 
     * @return UniqSubnetId <p>子网id 字符串类型</p>
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set <p>子网id 字符串类型</p>
     * @param UniqSubnetId <p>子网id 字符串类型</p>
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get <p>节点信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopologyInfoList <p>节点信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TopologyInfo [] getTopologyInfoList() {
        return this.TopologyInfoList;
    }

    /**
     * Set <p>节点信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopologyInfoList <p>节点信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopologyInfoList(TopologyInfo [] TopologyInfoList) {
        this.TopologyInfoList = TopologyInfoList;
    }

    /**
     * Get <p>是否是跨AZ集群</p> 
     * @return IsMultiZoneCluster <p>是否是跨AZ集群</p>
     */
    public Boolean getIsMultiZoneCluster() {
        return this.IsMultiZoneCluster;
    }

    /**
     * Set <p>是否是跨AZ集群</p>
     * @param IsMultiZoneCluster <p>是否是跨AZ集群</p>
     */
    public void setIsMultiZoneCluster(Boolean IsMultiZoneCluster) {
        this.IsMultiZoneCluster = IsMultiZoneCluster;
    }

    /**
     * Get <p>是否开通异常节点自动补偿</p> 
     * @return IsCvmReplace <p>是否开通异常节点自动补偿</p>
     */
    public Boolean getIsCvmReplace() {
        return this.IsCvmReplace;
    }

    /**
     * Set <p>是否开通异常节点自动补偿</p>
     * @param IsCvmReplace <p>是否开通异常节点自动补偿</p>
     */
    public void setIsCvmReplace(Boolean IsCvmReplace) {
        this.IsCvmReplace = IsCvmReplace;
    }

    /**
     * Get <p>标题</p> 
     * @return ClusterTitle <p>标题</p>
     */
    public String getClusterTitle() {
        return this.ClusterTitle;
    }

    /**
     * Set <p>标题</p>
     * @param ClusterTitle <p>标题</p>
     */
    public void setClusterTitle(String ClusterTitle) {
        this.ClusterTitle = ClusterTitle;
    }

    /**
     * Get <p>集群产品配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigDetail <p>集群产品配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EmrProductConfigDetail getConfigDetail() {
        return this.ConfigDetail;
    }

    /**
     * Set <p>集群产品配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigDetail <p>集群产品配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigDetail(EmrProductConfigDetail ConfigDetail) {
        this.ConfigDetail = ConfigDetail;
    }

    /**
     * Get <p>集群绑定的文件系统数</p> 
     * @return BindFileSystemNum <p>集群绑定的文件系统数</p>
     */
    public Long getBindFileSystemNum() {
        return this.BindFileSystemNum;
    }

    /**
     * Set <p>集群绑定的文件系统数</p>
     * @param BindFileSystemNum <p>集群绑定的文件系统数</p>
     */
    public void setBindFileSystemNum(Long BindFileSystemNum) {
        this.BindFileSystemNum = BindFileSystemNum;
    }

    /**
     * Get <p>rss集群的绑定列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterRelationInfoList <p>rss集群的绑定列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClusterRelationMeta [] getClusterRelationInfoList() {
        return this.ClusterRelationInfoList;
    }

    /**
     * Set <p>rss集群的绑定列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterRelationInfoList <p>rss集群的绑定列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterRelationInfoList(ClusterRelationMeta [] ClusterRelationInfoList) {
        this.ClusterRelationInfoList = ClusterRelationInfoList;
    }

    /**
     * Get <p>Redis信息</p> 
     * @return RedisId <p>Redis信息</p>
     */
    public String getRedisId() {
        return this.RedisId;
    }

    /**
     * Set <p>Redis信息</p>
     * @param RedisId <p>Redis信息</p>
     */
    public void setRedisId(String RedisId) {
        this.RedisId = RedisId;
    }

    /**
     * Get <p>是否开启IO故障自愈</p> 
     * @return IsIOHungSelfRecovery <p>是否开启IO故障自愈</p>
     */
    public Boolean getIsIOHungSelfRecovery() {
        return this.IsIOHungSelfRecovery;
    }

    /**
     * Set <p>是否开启IO故障自愈</p>
     * @param IsIOHungSelfRecovery <p>是否开启IO故障自愈</p>
     */
    public void setIsIOHungSelfRecovery(Boolean IsIOHungSelfRecovery) {
        this.IsIOHungSelfRecovery = IsIOHungSelfRecovery;
    }

    /**
     * Get <p>元数据信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetaDBGroupInfo <p>元数据信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CustomMetaDBInfo [] getMetaDBGroupInfo() {
        return this.MetaDBGroupInfo;
    }

    /**
     * Set <p>元数据信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetaDBGroupInfo <p>元数据信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetaDBGroupInfo(CustomMetaDBInfo [] MetaDBGroupInfo) {
        this.MetaDBGroupInfo = MetaDBGroupInfo;
    }

    public ClusterInstancesInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterInstancesInfo(ClusterInstancesInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Ftitle != null) {
            this.Ftitle = new String(source.Ftitle);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.VpcId != null) {
            this.VpcId = new Long(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new Long(source.SubnetId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.RunTime != null) {
            this.RunTime = new String(source.RunTime);
        }
        if (source.Config != null) {
            this.Config = new EmrProductConfigOutter(source.Config);
        }
        if (source.MasterIp != null) {
            this.MasterIp = new String(source.MasterIp);
        }
        if (source.EmrVersion != null) {
            this.EmrVersion = new String(source.EmrVersion);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new Long(source.ChargeType);
        }
        if (source.TradeVersion != null) {
            this.TradeVersion = new Long(source.TradeVersion);
        }
        if (source.ResourceOrderId != null) {
            this.ResourceOrderId = new Long(source.ResourceOrderId);
        }
        if (source.IsTradeCluster != null) {
            this.IsTradeCluster = new Long(source.IsTradeCluster);
        }
        if (source.AlarmInfo != null) {
            this.AlarmInfo = new String(source.AlarmInfo);
        }
        if (source.IsWoodpeckerCluster != null) {
            this.IsWoodpeckerCluster = new Long(source.IsWoodpeckerCluster);
        }
        if (source.MetaDb != null) {
            this.MetaDb = new String(source.MetaDb);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.HiveMetaDb != null) {
            this.HiveMetaDb = new String(source.HiveMetaDb);
        }
        if (source.ServiceClass != null) {
            this.ServiceClass = new String(source.ServiceClass);
        }
        if (source.AliasInfo != null) {
            this.AliasInfo = new String(source.AliasInfo);
        }
        if (source.ProductId != null) {
            this.ProductId = new Long(source.ProductId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.SceneName != null) {
            this.SceneName = new String(source.SceneName);
        }
        if (source.SceneServiceClass != null) {
            this.SceneServiceClass = new String(source.SceneServiceClass);
        }
        if (source.SceneEmrVersion != null) {
            this.SceneEmrVersion = new String(source.SceneEmrVersion);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.ClusterExternalServiceInfo != null) {
            this.ClusterExternalServiceInfo = new ClusterExternalServiceInfo[source.ClusterExternalServiceInfo.length];
            for (int i = 0; i < source.ClusterExternalServiceInfo.length; i++) {
                this.ClusterExternalServiceInfo[i] = new ClusterExternalServiceInfo(source.ClusterExternalServiceInfo[i]);
            }
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.TopologyInfoList != null) {
            this.TopologyInfoList = new TopologyInfo[source.TopologyInfoList.length];
            for (int i = 0; i < source.TopologyInfoList.length; i++) {
                this.TopologyInfoList[i] = new TopologyInfo(source.TopologyInfoList[i]);
            }
        }
        if (source.IsMultiZoneCluster != null) {
            this.IsMultiZoneCluster = new Boolean(source.IsMultiZoneCluster);
        }
        if (source.IsCvmReplace != null) {
            this.IsCvmReplace = new Boolean(source.IsCvmReplace);
        }
        if (source.ClusterTitle != null) {
            this.ClusterTitle = new String(source.ClusterTitle);
        }
        if (source.ConfigDetail != null) {
            this.ConfigDetail = new EmrProductConfigDetail(source.ConfigDetail);
        }
        if (source.BindFileSystemNum != null) {
            this.BindFileSystemNum = new Long(source.BindFileSystemNum);
        }
        if (source.ClusterRelationInfoList != null) {
            this.ClusterRelationInfoList = new ClusterRelationMeta[source.ClusterRelationInfoList.length];
            for (int i = 0; i < source.ClusterRelationInfoList.length; i++) {
                this.ClusterRelationInfoList[i] = new ClusterRelationMeta(source.ClusterRelationInfoList[i]);
            }
        }
        if (source.RedisId != null) {
            this.RedisId = new String(source.RedisId);
        }
        if (source.IsIOHungSelfRecovery != null) {
            this.IsIOHungSelfRecovery = new Boolean(source.IsIOHungSelfRecovery);
        }
        if (source.MetaDBGroupInfo != null) {
            this.MetaDBGroupInfo = new CustomMetaDBInfo[source.MetaDBGroupInfo.length];
            for (int i = 0; i < source.MetaDBGroupInfo.length; i++) {
                this.MetaDBGroupInfo[i] = new CustomMetaDBInfo(source.MetaDBGroupInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Ftitle", this.Ftitle);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "RunTime", this.RunTime);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamSimple(map, prefix + "MasterIp", this.MasterIp);
        this.setParamSimple(map, prefix + "EmrVersion", this.EmrVersion);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "TradeVersion", this.TradeVersion);
        this.setParamSimple(map, prefix + "ResourceOrderId", this.ResourceOrderId);
        this.setParamSimple(map, prefix + "IsTradeCluster", this.IsTradeCluster);
        this.setParamSimple(map, prefix + "AlarmInfo", this.AlarmInfo);
        this.setParamSimple(map, prefix + "IsWoodpeckerCluster", this.IsWoodpeckerCluster);
        this.setParamSimple(map, prefix + "MetaDb", this.MetaDb);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "HiveMetaDb", this.HiveMetaDb);
        this.setParamSimple(map, prefix + "ServiceClass", this.ServiceClass);
        this.setParamSimple(map, prefix + "AliasInfo", this.AliasInfo);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "SceneName", this.SceneName);
        this.setParamSimple(map, prefix + "SceneServiceClass", this.SceneServiceClass);
        this.setParamSimple(map, prefix + "SceneEmrVersion", this.SceneEmrVersion);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamArrayObj(map, prefix + "ClusterExternalServiceInfo.", this.ClusterExternalServiceInfo);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamArrayObj(map, prefix + "TopologyInfoList.", this.TopologyInfoList);
        this.setParamSimple(map, prefix + "IsMultiZoneCluster", this.IsMultiZoneCluster);
        this.setParamSimple(map, prefix + "IsCvmReplace", this.IsCvmReplace);
        this.setParamSimple(map, prefix + "ClusterTitle", this.ClusterTitle);
        this.setParamObj(map, prefix + "ConfigDetail.", this.ConfigDetail);
        this.setParamSimple(map, prefix + "BindFileSystemNum", this.BindFileSystemNum);
        this.setParamArrayObj(map, prefix + "ClusterRelationInfoList.", this.ClusterRelationInfoList);
        this.setParamSimple(map, prefix + "RedisId", this.RedisId);
        this.setParamSimple(map, prefix + "IsIOHungSelfRecovery", this.IsIOHungSelfRecovery);
        this.setParamArrayObj(map, prefix + "MetaDBGroupInfo.", this.MetaDBGroupInfo);

    }
}

