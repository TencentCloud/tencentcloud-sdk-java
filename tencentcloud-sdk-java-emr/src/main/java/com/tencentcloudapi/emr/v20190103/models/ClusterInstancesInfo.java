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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterInstancesInfo extends AbstractModel{

    /**
    * ID号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 标题
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ftitle")
    @Expose
    private String Ftitle;

    /**
    * 集群名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 地域ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 地区ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 用户APPID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 用户UIN
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 项目Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 集群VPCID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * 子网ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * 实例的状态码。取值范围：
<li>2：表示集群运行中。</li>
<li>3：表示集群创建中。</li>
<li>4：表示集群扩容中。</li>
<li>5：表示集群增加router节点中。</li>
<li>6：表示集群安装组件中。</li>
<li>7：表示集群执行命令中。</li>
<li>8：表示重启服务中。</li>
<li>9：表示进入维护中。</li>
<li>10：表示服务暂停中。</li>
<li>11：表示退出维护中。</li>
<li>12：表示退出暂停中。</li>
<li>13：表示配置下发中。</li>
<li>14：表示销毁集群中。</li>
<li>15：表示销毁core节点中。</li>
<li>16：销毁task节点中。</li>
<li>17：表示销毁router节点中。</li>
<li>18：表示更改webproxy密码中。</li>
<li>19：表示集群隔离中。</li>
<li>20：表示集群冲正中。</li>
<li>21：表示集群回收中。</li>
<li>22：表示变配等待中。</li>
<li>23：表示集群已隔离。</li>
<li>24：表示缩容节点中。</li>
<li>33：表示集群等待退费中。</li>
<li>34：表示集群已退费。</li>
<li>301：表示创建失败。</li>
<li>302：表示扩容失败。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 添加时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 已经运行时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunTime")
    @Expose
    private String RunTime;

    /**
    * 集群产品配置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Config")
    @Expose
    private EmrProductConfigOutter Config;

    /**
    * 主节点外网IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MasterIp")
    @Expose
    private String MasterIp;

    /**
    * EMR版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EmrVersion")
    @Expose
    private String EmrVersion;

    /**
    * 收费类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChargeType")
    @Expose
    private Long ChargeType;

    /**
    * 交易版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TradeVersion")
    @Expose
    private Long TradeVersion;

    /**
    * 资源订单ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceOrderId")
    @Expose
    private Long ResourceOrderId;

    /**
    * 是否计费集群
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsTradeCluster")
    @Expose
    private Long IsTradeCluster;

    /**
    * 集群错误状态告警信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmInfo")
    @Expose
    private String AlarmInfo;

    /**
    * 是否采用新架构
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsWoodpeckerCluster")
    @Expose
    private Long IsWoodpeckerCluster;

    /**
    * 元数据库信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetaDb")
    @Expose
    private String MetaDb;

    /**
    * 标签信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Hive元数据信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HiveMetaDb")
    @Expose
    private String HiveMetaDb;

    /**
    * 集群类型:EMR,CLICKHOUSE,DRUID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceClass")
    @Expose
    private String ServiceClass;

    /**
    * 集群所有节点的别名序列化
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AliasInfo")
    @Expose
    private String AliasInfo;

    /**
    * 集群版本Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
     * Get ID号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id ID号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set ID号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id ID号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 集群ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 标题
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ftitle 标题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFtitle() {
        return this.Ftitle;
    }

    /**
     * Set 标题
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ftitle 标题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFtitle(String Ftitle) {
        this.Ftitle = Ftitle;
    }

    /**
     * Get 集群名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterName 集群名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterName 集群名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 地域ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionId 地域ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionId 地域ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 地区ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneId 地区ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 地区ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneId 地区ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 用户APPID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 用户APPID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户APPID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 用户APPID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 用户UIN
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 用户UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户UIN
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 用户UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 项目Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 集群VPCID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId 集群VPCID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 集群VPCID
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 集群VPCID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 实例的状态码。取值范围：
<li>2：表示集群运行中。</li>
<li>3：表示集群创建中。</li>
<li>4：表示集群扩容中。</li>
<li>5：表示集群增加router节点中。</li>
<li>6：表示集群安装组件中。</li>
<li>7：表示集群执行命令中。</li>
<li>8：表示重启服务中。</li>
<li>9：表示进入维护中。</li>
<li>10：表示服务暂停中。</li>
<li>11：表示退出维护中。</li>
<li>12：表示退出暂停中。</li>
<li>13：表示配置下发中。</li>
<li>14：表示销毁集群中。</li>
<li>15：表示销毁core节点中。</li>
<li>16：销毁task节点中。</li>
<li>17：表示销毁router节点中。</li>
<li>18：表示更改webproxy密码中。</li>
<li>19：表示集群隔离中。</li>
<li>20：表示集群冲正中。</li>
<li>21：表示集群回收中。</li>
<li>22：表示变配等待中。</li>
<li>23：表示集群已隔离。</li>
<li>24：表示缩容节点中。</li>
<li>33：表示集群等待退费中。</li>
<li>34：表示集群已退费。</li>
<li>301：表示创建失败。</li>
<li>302：表示扩容失败。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 实例的状态码。取值范围：
<li>2：表示集群运行中。</li>
<li>3：表示集群创建中。</li>
<li>4：表示集群扩容中。</li>
<li>5：表示集群增加router节点中。</li>
<li>6：表示集群安装组件中。</li>
<li>7：表示集群执行命令中。</li>
<li>8：表示重启服务中。</li>
<li>9：表示进入维护中。</li>
<li>10：表示服务暂停中。</li>
<li>11：表示退出维护中。</li>
<li>12：表示退出暂停中。</li>
<li>13：表示配置下发中。</li>
<li>14：表示销毁集群中。</li>
<li>15：表示销毁core节点中。</li>
<li>16：销毁task节点中。</li>
<li>17：表示销毁router节点中。</li>
<li>18：表示更改webproxy密码中。</li>
<li>19：表示集群隔离中。</li>
<li>20：表示集群冲正中。</li>
<li>21：表示集群回收中。</li>
<li>22：表示变配等待中。</li>
<li>23：表示集群已隔离。</li>
<li>24：表示缩容节点中。</li>
<li>33：表示集群等待退费中。</li>
<li>34：表示集群已退费。</li>
<li>301：表示创建失败。</li>
<li>302：表示扩容失败。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 实例的状态码。取值范围：
<li>2：表示集群运行中。</li>
<li>3：表示集群创建中。</li>
<li>4：表示集群扩容中。</li>
<li>5：表示集群增加router节点中。</li>
<li>6：表示集群安装组件中。</li>
<li>7：表示集群执行命令中。</li>
<li>8：表示重启服务中。</li>
<li>9：表示进入维护中。</li>
<li>10：表示服务暂停中。</li>
<li>11：表示退出维护中。</li>
<li>12：表示退出暂停中。</li>
<li>13：表示配置下发中。</li>
<li>14：表示销毁集群中。</li>
<li>15：表示销毁core节点中。</li>
<li>16：销毁task节点中。</li>
<li>17：表示销毁router节点中。</li>
<li>18：表示更改webproxy密码中。</li>
<li>19：表示集群隔离中。</li>
<li>20：表示集群冲正中。</li>
<li>21：表示集群回收中。</li>
<li>22：表示变配等待中。</li>
<li>23：表示集群已隔离。</li>
<li>24：表示缩容节点中。</li>
<li>33：表示集群等待退费中。</li>
<li>34：表示集群已退费。</li>
<li>301：表示创建失败。</li>
<li>302：表示扩容失败。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 实例的状态码。取值范围：
<li>2：表示集群运行中。</li>
<li>3：表示集群创建中。</li>
<li>4：表示集群扩容中。</li>
<li>5：表示集群增加router节点中。</li>
<li>6：表示集群安装组件中。</li>
<li>7：表示集群执行命令中。</li>
<li>8：表示重启服务中。</li>
<li>9：表示进入维护中。</li>
<li>10：表示服务暂停中。</li>
<li>11：表示退出维护中。</li>
<li>12：表示退出暂停中。</li>
<li>13：表示配置下发中。</li>
<li>14：表示销毁集群中。</li>
<li>15：表示销毁core节点中。</li>
<li>16：销毁task节点中。</li>
<li>17：表示销毁router节点中。</li>
<li>18：表示更改webproxy密码中。</li>
<li>19：表示集群隔离中。</li>
<li>20：表示集群冲正中。</li>
<li>21：表示集群回收中。</li>
<li>22：表示变配等待中。</li>
<li>23：表示集群已隔离。</li>
<li>24：表示缩容节点中。</li>
<li>33：表示集群等待退费中。</li>
<li>34：表示集群已退费。</li>
<li>301：表示创建失败。</li>
<li>302：表示扩容失败。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 添加时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddTime 添加时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set 添加时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddTime 添加时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get 已经运行时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunTime 已经运行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunTime() {
        return this.RunTime;
    }

    /**
     * Set 已经运行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunTime 已经运行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunTime(String RunTime) {
        this.RunTime = RunTime;
    }

    /**
     * Get 集群产品配置信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Config 集群产品配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EmrProductConfigOutter getConfig() {
        return this.Config;
    }

    /**
     * Set 集群产品配置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Config 集群产品配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfig(EmrProductConfigOutter Config) {
        this.Config = Config;
    }

    /**
     * Get 主节点外网IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MasterIp 主节点外网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMasterIp() {
        return this.MasterIp;
    }

    /**
     * Set 主节点外网IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param MasterIp 主节点外网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMasterIp(String MasterIp) {
        this.MasterIp = MasterIp;
    }

    /**
     * Get EMR版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EmrVersion EMR版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEmrVersion() {
        return this.EmrVersion;
    }

    /**
     * Set EMR版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param EmrVersion EMR版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmrVersion(String EmrVersion) {
        this.EmrVersion = EmrVersion;
    }

    /**
     * Get 收费类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChargeType 收费类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 收费类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChargeType 收费类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChargeType(Long ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 交易版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TradeVersion 交易版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTradeVersion() {
        return this.TradeVersion;
    }

    /**
     * Set 交易版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param TradeVersion 交易版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTradeVersion(Long TradeVersion) {
        this.TradeVersion = TradeVersion;
    }

    /**
     * Get 资源订单ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceOrderId 资源订单ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResourceOrderId() {
        return this.ResourceOrderId;
    }

    /**
     * Set 资源订单ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceOrderId 资源订单ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceOrderId(Long ResourceOrderId) {
        this.ResourceOrderId = ResourceOrderId;
    }

    /**
     * Get 是否计费集群
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsTradeCluster 是否计费集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsTradeCluster() {
        return this.IsTradeCluster;
    }

    /**
     * Set 是否计费集群
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsTradeCluster 是否计费集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsTradeCluster(Long IsTradeCluster) {
        this.IsTradeCluster = IsTradeCluster;
    }

    /**
     * Get 集群错误状态告警信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmInfo 集群错误状态告警信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarmInfo() {
        return this.AlarmInfo;
    }

    /**
     * Set 集群错误状态告警信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmInfo 集群错误状态告警信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmInfo(String AlarmInfo) {
        this.AlarmInfo = AlarmInfo;
    }

    /**
     * Get 是否采用新架构
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsWoodpeckerCluster 是否采用新架构
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsWoodpeckerCluster() {
        return this.IsWoodpeckerCluster;
    }

    /**
     * Set 是否采用新架构
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsWoodpeckerCluster 是否采用新架构
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsWoodpeckerCluster(Long IsWoodpeckerCluster) {
        this.IsWoodpeckerCluster = IsWoodpeckerCluster;
    }

    /**
     * Get 元数据库信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetaDb 元数据库信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetaDb() {
        return this.MetaDb;
    }

    /**
     * Set 元数据库信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetaDb 元数据库信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetaDb(String MetaDb) {
        this.MetaDb = MetaDb;
    }

    /**
     * Get 标签信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Hive元数据信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HiveMetaDb Hive元数据信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHiveMetaDb() {
        return this.HiveMetaDb;
    }

    /**
     * Set Hive元数据信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param HiveMetaDb Hive元数据信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHiveMetaDb(String HiveMetaDb) {
        this.HiveMetaDb = HiveMetaDb;
    }

    /**
     * Get 集群类型:EMR,CLICKHOUSE,DRUID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceClass 集群类型:EMR,CLICKHOUSE,DRUID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceClass() {
        return this.ServiceClass;
    }

    /**
     * Set 集群类型:EMR,CLICKHOUSE,DRUID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceClass 集群类型:EMR,CLICKHOUSE,DRUID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceClass(String ServiceClass) {
        this.ServiceClass = ServiceClass;
    }

    /**
     * Get 集群所有节点的别名序列化
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AliasInfo 集群所有节点的别名序列化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAliasInfo() {
        return this.AliasInfo;
    }

    /**
     * Set 集群所有节点的别名序列化
注意：此字段可能返回 null，表示取不到有效值。
     * @param AliasInfo 集群所有节点的别名序列化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAliasInfo(String AliasInfo) {
        this.AliasInfo = AliasInfo;
    }

    /**
     * Get 集群版本Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductId 集群版本Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set 集群版本Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductId 集群版本Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
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

    }
}

