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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInfo extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 用户ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 用户UIN
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 实例所属VPC的UID
    */
    @SerializedName("VpcUid")
    @Expose
    private String VpcUid;

    /**
    * 实例所属子网的UID
    */
    @SerializedName("SubnetUid")
    @Expose
    private String SubnetUid;

    /**
    * 实例状态，0:处理中,1:正常,-1停止,-2:销毁中,-3:已销毁
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 自动续费标识。取值范围：
RENEW_FLAG_AUTO：自动续费  
RENEW_FLAG_MANUAL：不自动续费
默认取值：
RENEW_FLAG_DEFAULT：不自动续费
若该参数指定为 RENEW_FLAG_AUTO，在账户余额充足的情况下，实例到期后将按月自动续费。
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * 实例计费模式。取值范围：  PREPAID：表示预付费，即包年包月  POSTPAID_BY_HOUR：表示后付费，即按量计费  CDHPAID：CDH付费，即只对CDH计费，不对CDH上的实例计费。
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 包年包月购买时长,单位:月
    */
    @SerializedName("ChargePeriod")
    @Expose
    private Long ChargePeriod;

    /**
    * 节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 节点个数
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * 节点CPU核数
    */
    @SerializedName("CpuNum")
    @Expose
    private Long CpuNum;

    /**
    * 节点内存大小，单位GB
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * 节点磁盘类型
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 节点磁盘大小，单位GB
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * ES域名
    */
    @SerializedName("EsDomain")
    @Expose
    private String EsDomain;

    /**
    * ES VIP
    */
    @SerializedName("EsVip")
    @Expose
    private String EsVip;

    /**
    * ES端口
    */
    @SerializedName("EsPort")
    @Expose
    private Long EsPort;

    /**
    * Kibana访问url
    */
    @SerializedName("KibanaUrl")
    @Expose
    private String KibanaUrl;

    /**
    * ES版本号
    */
    @SerializedName("EsVersion")
    @Expose
    private String EsVersion;

    /**
    * ES配置项
    */
    @SerializedName("EsConfig")
    @Expose
    private String EsConfig;

    /**
    * Kibana访问控制配置
    */
    @SerializedName("EsAcl")
    @Expose
    private EsAcl EsAcl;

    /**
    * 实例创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 实例最后修改操作时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 实例到期时间
    */
    @SerializedName("Deadline")
    @Expose
    private String Deadline;

    /**
    * 实例类型（实例类型标识，当前只有1,2两种）
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * Ik分词器配置
    */
    @SerializedName("IkConfig")
    @Expose
    private EsDictionaryInfo IkConfig;

    /**
    * 专用主节点配置
    */
    @SerializedName("MasterNodeInfo")
    @Expose
    private MasterNodeInfo MasterNodeInfo;

    /**
    * cos自动备份配置
    */
    @SerializedName("CosBackup")
    @Expose
    private CosBackup CosBackup;

    /**
    * 是否允许cos自动备份
    */
    @SerializedName("AllowCosBackup")
    @Expose
    private Boolean AllowCosBackup;

    /**
    * 实例拥有的标签列表
    */
    @SerializedName("TagList")
    @Expose
    private TagInfo [] TagList;

    /**
    * License类型<li>oss：开源版</li><li>basic：基础版</li><li>platinum：白金版</li>默认值platinum
    */
    @SerializedName("LicenseType")
    @Expose
    private String LicenseType;

    /**
    * 是否为冷热集群<li>true: 冷热集群</li><li>false: 非冷热集群</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableHotWarmMode")
    @Expose
    private Boolean EnableHotWarmMode;

    /**
    * 温节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WarmNodeType")
    @Expose
    private String WarmNodeType;

    /**
    * 温节点个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WarmNodeNum")
    @Expose
    private Long WarmNodeNum;

    /**
    * 温节点CPU核数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WarmCpuNum")
    @Expose
    private Long WarmCpuNum;

    /**
    * 温节点内存内存大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WarmMemSize")
    @Expose
    private Long WarmMemSize;

    /**
    * 温节点磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WarmDiskType")
    @Expose
    private String WarmDiskType;

    /**
    * 温节点磁盘大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WarmDiskSize")
    @Expose
    private Long WarmDiskSize;

    /**
    * 集群节点信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeInfoList")
    @Expose
    private NodeInfo [] NodeInfoList;

    /**
    * Es公网地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EsPublicUrl")
    @Expose
    private String EsPublicUrl;

    /**
    * 多可用区网络信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MultiZoneInfo")
    @Expose
    private ZoneDetail [] MultiZoneInfo;

    /**
    * 部署模式<li>0：单可用区</li><li>1：多可用区</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeployMode")
    @Expose
    private Long DeployMode;

    /**
    * ES公网访问状态<li>OPEN：开启</li><li>CLOSE：关闭
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicAccess")
    @Expose
    private String PublicAccess;

    /**
    * ES公网访问控制配置
    */
    @SerializedName("EsPublicAcl")
    @Expose
    private EsAcl EsPublicAcl;

    /**
    * Kibana内网地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KibanaPrivateUrl")
    @Expose
    private String KibanaPrivateUrl;

    /**
    * Kibana公网访问状态<li>OPEN：开启</li><li>CLOSE：关闭
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KibanaPublicAccess")
    @Expose
    private String KibanaPublicAccess;

    /**
    * Kibana内网访问状态<li>OPEN：开启</li><li>CLOSE：关闭
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KibanaPrivateAccess")
    @Expose
    private String KibanaPrivateAccess;

    /**
    * 6.8（及以上版本）基础版是否开启xpack security认证<li>1：不开启</li><li>2：开启</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecurityType")
    @Expose
    private Long SecurityType;

    /**
    * 场景化模板类型：0、不开启；1、通用场景；2、日志场景；3、搜索场景
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SceneType")
    @Expose
    private Long SceneType;

    /**
    * Kibana配置项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KibanaConfig")
    @Expose
    private String KibanaConfig;

    /**
    * Kibana节点信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KibanaNodeInfo")
    @Expose
    private KibanaNodeInfo KibanaNodeInfo;

    /**
    * 可视化节点配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebNodeTypeInfo")
    @Expose
    private WebNodeTypeInfo WebNodeTypeInfo;

    /**
    * JDK类型，oracle或kona
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Jdk")
    @Expose
    private String Jdk;

    /**
    * 集群网络通讯协议
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 安全组id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecurityGroups")
    @Expose
    private String [] SecurityGroups;

    /**
    * 冷节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColdNodeType")
    @Expose
    private String ColdNodeType;

    /**
    * 冷节点个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColdNodeNum")
    @Expose
    private Long ColdNodeNum;

    /**
    * 冷节点CPU核数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColdCpuNum")
    @Expose
    private Long ColdCpuNum;

    /**
    * 冷节点内存大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColdMemSize")
    @Expose
    private Long ColdMemSize;

    /**
    * 冷节点磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColdDiskType")
    @Expose
    private String ColdDiskType;

    /**
    * 冷节点磁盘大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColdDiskSize")
    @Expose
    private Long ColdDiskSize;

    /**
    * 冻节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrozenNodeType")
    @Expose
    private String FrozenNodeType;

    /**
    * 冻节点个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrozenNodeNum")
    @Expose
    private Long FrozenNodeNum;

    /**
    * 冻节点CPU核数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrozenCpuNum")
    @Expose
    private Long FrozenCpuNum;

    /**
    * 冻节点内存大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrozenMemSize")
    @Expose
    private Long FrozenMemSize;

    /**
    * 冻节点磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrozenDiskType")
    @Expose
    private String FrozenDiskType;

    /**
    * 冻节点磁盘大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrozenDiskSize")
    @Expose
    private Long FrozenDiskSize;

    /**
    * 集群健康状态 -1 未知；0 Green; 1 Yellow; 2 Red
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthStatus")
    @Expose
    private Long HealthStatus;

    /**
    * https集群内网url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EsPrivateUrl")
    @Expose
    private String EsPrivateUrl;

    /**
    * https集群内网域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EsPrivateDomain")
    @Expose
    private String EsPrivateDomain;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 用户ID 
     * @return AppId 用户ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户ID
     * @param AppId 用户ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 用户UIN 
     * @return Uin 用户UIN
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户UIN
     * @param Uin 用户UIN
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 实例所属VPC的UID 
     * @return VpcUid 实例所属VPC的UID
     */
    public String getVpcUid() {
        return this.VpcUid;
    }

    /**
     * Set 实例所属VPC的UID
     * @param VpcUid 实例所属VPC的UID
     */
    public void setVpcUid(String VpcUid) {
        this.VpcUid = VpcUid;
    }

    /**
     * Get 实例所属子网的UID 
     * @return SubnetUid 实例所属子网的UID
     */
    public String getSubnetUid() {
        return this.SubnetUid;
    }

    /**
     * Set 实例所属子网的UID
     * @param SubnetUid 实例所属子网的UID
     */
    public void setSubnetUid(String SubnetUid) {
        this.SubnetUid = SubnetUid;
    }

    /**
     * Get 实例状态，0:处理中,1:正常,-1停止,-2:销毁中,-3:已销毁 
     * @return Status 实例状态，0:处理中,1:正常,-1停止,-2:销毁中,-3:已销毁
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态，0:处理中,1:正常,-1停止,-2:销毁中,-3:已销毁
     * @param Status 实例状态，0:处理中,1:正常,-1停止,-2:销毁中,-3:已销毁
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 自动续费标识。取值范围：
RENEW_FLAG_AUTO：自动续费  
RENEW_FLAG_MANUAL：不自动续费
默认取值：
RENEW_FLAG_DEFAULT：不自动续费
若该参数指定为 RENEW_FLAG_AUTO，在账户余额充足的情况下，实例到期后将按月自动续费。 
     * @return RenewFlag 自动续费标识。取值范围：
RENEW_FLAG_AUTO：自动续费  
RENEW_FLAG_MANUAL：不自动续费
默认取值：
RENEW_FLAG_DEFAULT：不自动续费
若该参数指定为 RENEW_FLAG_AUTO，在账户余额充足的情况下，实例到期后将按月自动续费。
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费标识。取值范围：
RENEW_FLAG_AUTO：自动续费  
RENEW_FLAG_MANUAL：不自动续费
默认取值：
RENEW_FLAG_DEFAULT：不自动续费
若该参数指定为 RENEW_FLAG_AUTO，在账户余额充足的情况下，实例到期后将按月自动续费。
     * @param RenewFlag 自动续费标识。取值范围：
RENEW_FLAG_AUTO：自动续费  
RENEW_FLAG_MANUAL：不自动续费
默认取值：
RENEW_FLAG_DEFAULT：不自动续费
若该参数指定为 RENEW_FLAG_AUTO，在账户余额充足的情况下，实例到期后将按月自动续费。
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 实例计费模式。取值范围：  PREPAID：表示预付费，即包年包月  POSTPAID_BY_HOUR：表示后付费，即按量计费  CDHPAID：CDH付费，即只对CDH计费，不对CDH上的实例计费。 
     * @return ChargeType 实例计费模式。取值范围：  PREPAID：表示预付费，即包年包月  POSTPAID_BY_HOUR：表示后付费，即按量计费  CDHPAID：CDH付费，即只对CDH计费，不对CDH上的实例计费。
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 实例计费模式。取值范围：  PREPAID：表示预付费，即包年包月  POSTPAID_BY_HOUR：表示后付费，即按量计费  CDHPAID：CDH付费，即只对CDH计费，不对CDH上的实例计费。
     * @param ChargeType 实例计费模式。取值范围：  PREPAID：表示预付费，即包年包月  POSTPAID_BY_HOUR：表示后付费，即按量计费  CDHPAID：CDH付费，即只对CDH计费，不对CDH上的实例计费。
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 包年包月购买时长,单位:月 
     * @return ChargePeriod 包年包月购买时长,单位:月
     */
    public Long getChargePeriod() {
        return this.ChargePeriod;
    }

    /**
     * Set 包年包月购买时长,单位:月
     * @param ChargePeriod 包年包月购买时长,单位:月
     */
    public void setChargePeriod(Long ChargePeriod) {
        this.ChargePeriod = ChargePeriod;
    }

    /**
     * Get 节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li> 
     * @return NodeType 节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
     * @param NodeType 节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 节点个数 
     * @return NodeNum 节点个数
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set 节点个数
     * @param NodeNum 节点个数
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get 节点CPU核数 
     * @return CpuNum 节点CPU核数
     */
    public Long getCpuNum() {
        return this.CpuNum;
    }

    /**
     * Set 节点CPU核数
     * @param CpuNum 节点CPU核数
     */
    public void setCpuNum(Long CpuNum) {
        this.CpuNum = CpuNum;
    }

    /**
     * Get 节点内存大小，单位GB 
     * @return MemSize 节点内存大小，单位GB
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set 节点内存大小，单位GB
     * @param MemSize 节点内存大小，单位GB
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get 节点磁盘类型 
     * @return DiskType 节点磁盘类型
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 节点磁盘类型
     * @param DiskType 节点磁盘类型
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 节点磁盘大小，单位GB 
     * @return DiskSize 节点磁盘大小，单位GB
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 节点磁盘大小，单位GB
     * @param DiskSize 节点磁盘大小，单位GB
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get ES域名 
     * @return EsDomain ES域名
     */
    public String getEsDomain() {
        return this.EsDomain;
    }

    /**
     * Set ES域名
     * @param EsDomain ES域名
     */
    public void setEsDomain(String EsDomain) {
        this.EsDomain = EsDomain;
    }

    /**
     * Get ES VIP 
     * @return EsVip ES VIP
     */
    public String getEsVip() {
        return this.EsVip;
    }

    /**
     * Set ES VIP
     * @param EsVip ES VIP
     */
    public void setEsVip(String EsVip) {
        this.EsVip = EsVip;
    }

    /**
     * Get ES端口 
     * @return EsPort ES端口
     */
    public Long getEsPort() {
        return this.EsPort;
    }

    /**
     * Set ES端口
     * @param EsPort ES端口
     */
    public void setEsPort(Long EsPort) {
        this.EsPort = EsPort;
    }

    /**
     * Get Kibana访问url 
     * @return KibanaUrl Kibana访问url
     */
    public String getKibanaUrl() {
        return this.KibanaUrl;
    }

    /**
     * Set Kibana访问url
     * @param KibanaUrl Kibana访问url
     */
    public void setKibanaUrl(String KibanaUrl) {
        this.KibanaUrl = KibanaUrl;
    }

    /**
     * Get ES版本号 
     * @return EsVersion ES版本号
     */
    public String getEsVersion() {
        return this.EsVersion;
    }

    /**
     * Set ES版本号
     * @param EsVersion ES版本号
     */
    public void setEsVersion(String EsVersion) {
        this.EsVersion = EsVersion;
    }

    /**
     * Get ES配置项 
     * @return EsConfig ES配置项
     */
    public String getEsConfig() {
        return this.EsConfig;
    }

    /**
     * Set ES配置项
     * @param EsConfig ES配置项
     */
    public void setEsConfig(String EsConfig) {
        this.EsConfig = EsConfig;
    }

    /**
     * Get Kibana访问控制配置 
     * @return EsAcl Kibana访问控制配置
     */
    public EsAcl getEsAcl() {
        return this.EsAcl;
    }

    /**
     * Set Kibana访问控制配置
     * @param EsAcl Kibana访问控制配置
     */
    public void setEsAcl(EsAcl EsAcl) {
        this.EsAcl = EsAcl;
    }

    /**
     * Get 实例创建时间 
     * @return CreateTime 实例创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 实例创建时间
     * @param CreateTime 实例创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 实例最后修改操作时间 
     * @return UpdateTime 实例最后修改操作时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 实例最后修改操作时间
     * @param UpdateTime 实例最后修改操作时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 实例到期时间 
     * @return Deadline 实例到期时间
     */
    public String getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 实例到期时间
     * @param Deadline 实例到期时间
     */
    public void setDeadline(String Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get 实例类型（实例类型标识，当前只有1,2两种） 
     * @return InstanceType 实例类型（实例类型标识，当前只有1,2两种）
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型（实例类型标识，当前只有1,2两种）
     * @param InstanceType 实例类型（实例类型标识，当前只有1,2两种）
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Ik分词器配置 
     * @return IkConfig Ik分词器配置
     */
    public EsDictionaryInfo getIkConfig() {
        return this.IkConfig;
    }

    /**
     * Set Ik分词器配置
     * @param IkConfig Ik分词器配置
     */
    public void setIkConfig(EsDictionaryInfo IkConfig) {
        this.IkConfig = IkConfig;
    }

    /**
     * Get 专用主节点配置 
     * @return MasterNodeInfo 专用主节点配置
     */
    public MasterNodeInfo getMasterNodeInfo() {
        return this.MasterNodeInfo;
    }

    /**
     * Set 专用主节点配置
     * @param MasterNodeInfo 专用主节点配置
     */
    public void setMasterNodeInfo(MasterNodeInfo MasterNodeInfo) {
        this.MasterNodeInfo = MasterNodeInfo;
    }

    /**
     * Get cos自动备份配置 
     * @return CosBackup cos自动备份配置
     */
    public CosBackup getCosBackup() {
        return this.CosBackup;
    }

    /**
     * Set cos自动备份配置
     * @param CosBackup cos自动备份配置
     */
    public void setCosBackup(CosBackup CosBackup) {
        this.CosBackup = CosBackup;
    }

    /**
     * Get 是否允许cos自动备份 
     * @return AllowCosBackup 是否允许cos自动备份
     */
    public Boolean getAllowCosBackup() {
        return this.AllowCosBackup;
    }

    /**
     * Set 是否允许cos自动备份
     * @param AllowCosBackup 是否允许cos自动备份
     */
    public void setAllowCosBackup(Boolean AllowCosBackup) {
        this.AllowCosBackup = AllowCosBackup;
    }

    /**
     * Get 实例拥有的标签列表 
     * @return TagList 实例拥有的标签列表
     */
    public TagInfo [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 实例拥有的标签列表
     * @param TagList 实例拥有的标签列表
     */
    public void setTagList(TagInfo [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get License类型<li>oss：开源版</li><li>basic：基础版</li><li>platinum：白金版</li>默认值platinum 
     * @return LicenseType License类型<li>oss：开源版</li><li>basic：基础版</li><li>platinum：白金版</li>默认值platinum
     */
    public String getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set License类型<li>oss：开源版</li><li>basic：基础版</li><li>platinum：白金版</li>默认值platinum
     * @param LicenseType License类型<li>oss：开源版</li><li>basic：基础版</li><li>platinum：白金版</li>默认值platinum
     */
    public void setLicenseType(String LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get 是否为冷热集群<li>true: 冷热集群</li><li>false: 非冷热集群</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableHotWarmMode 是否为冷热集群<li>true: 冷热集群</li><li>false: 非冷热集群</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableHotWarmMode() {
        return this.EnableHotWarmMode;
    }

    /**
     * Set 是否为冷热集群<li>true: 冷热集群</li><li>false: 非冷热集群</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableHotWarmMode 是否为冷热集群<li>true: 冷热集群</li><li>false: 非冷热集群</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableHotWarmMode(Boolean EnableHotWarmMode) {
        this.EnableHotWarmMode = EnableHotWarmMode;
    }

    /**
     * Get 温节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WarmNodeType 温节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWarmNodeType() {
        return this.WarmNodeType;
    }

    /**
     * Set 温节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WarmNodeType 温节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarmNodeType(String WarmNodeType) {
        this.WarmNodeType = WarmNodeType;
    }

    /**
     * Get 温节点个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WarmNodeNum 温节点个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWarmNodeNum() {
        return this.WarmNodeNum;
    }

    /**
     * Set 温节点个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param WarmNodeNum 温节点个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarmNodeNum(Long WarmNodeNum) {
        this.WarmNodeNum = WarmNodeNum;
    }

    /**
     * Get 温节点CPU核数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WarmCpuNum 温节点CPU核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWarmCpuNum() {
        return this.WarmCpuNum;
    }

    /**
     * Set 温节点CPU核数
注意：此字段可能返回 null，表示取不到有效值。
     * @param WarmCpuNum 温节点CPU核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarmCpuNum(Long WarmCpuNum) {
        this.WarmCpuNum = WarmCpuNum;
    }

    /**
     * Get 温节点内存内存大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WarmMemSize 温节点内存内存大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWarmMemSize() {
        return this.WarmMemSize;
    }

    /**
     * Set 温节点内存内存大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。
     * @param WarmMemSize 温节点内存内存大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarmMemSize(Long WarmMemSize) {
        this.WarmMemSize = WarmMemSize;
    }

    /**
     * Get 温节点磁盘类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WarmDiskType 温节点磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWarmDiskType() {
        return this.WarmDiskType;
    }

    /**
     * Set 温节点磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param WarmDiskType 温节点磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarmDiskType(String WarmDiskType) {
        this.WarmDiskType = WarmDiskType;
    }

    /**
     * Get 温节点磁盘大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WarmDiskSize 温节点磁盘大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWarmDiskSize() {
        return this.WarmDiskSize;
    }

    /**
     * Set 温节点磁盘大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。
     * @param WarmDiskSize 温节点磁盘大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarmDiskSize(Long WarmDiskSize) {
        this.WarmDiskSize = WarmDiskSize;
    }

    /**
     * Get 集群节点信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeInfoList 集群节点信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeInfo [] getNodeInfoList() {
        return this.NodeInfoList;
    }

    /**
     * Set 集群节点信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeInfoList 集群节点信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeInfoList(NodeInfo [] NodeInfoList) {
        this.NodeInfoList = NodeInfoList;
    }

    /**
     * Get Es公网地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EsPublicUrl Es公网地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEsPublicUrl() {
        return this.EsPublicUrl;
    }

    /**
     * Set Es公网地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param EsPublicUrl Es公网地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEsPublicUrl(String EsPublicUrl) {
        this.EsPublicUrl = EsPublicUrl;
    }

    /**
     * Get 多可用区网络信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MultiZoneInfo 多可用区网络信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ZoneDetail [] getMultiZoneInfo() {
        return this.MultiZoneInfo;
    }

    /**
     * Set 多可用区网络信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param MultiZoneInfo 多可用区网络信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMultiZoneInfo(ZoneDetail [] MultiZoneInfo) {
        this.MultiZoneInfo = MultiZoneInfo;
    }

    /**
     * Get 部署模式<li>0：单可用区</li><li>1：多可用区</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeployMode 部署模式<li>0：单可用区</li><li>1：多可用区</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set 部署模式<li>0：单可用区</li><li>1：多可用区</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeployMode 部署模式<li>0：单可用区</li><li>1：多可用区</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeployMode(Long DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get ES公网访问状态<li>OPEN：开启</li><li>CLOSE：关闭
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicAccess ES公网访问状态<li>OPEN：开启</li><li>CLOSE：关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicAccess() {
        return this.PublicAccess;
    }

    /**
     * Set ES公网访问状态<li>OPEN：开启</li><li>CLOSE：关闭
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicAccess ES公网访问状态<li>OPEN：开启</li><li>CLOSE：关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicAccess(String PublicAccess) {
        this.PublicAccess = PublicAccess;
    }

    /**
     * Get ES公网访问控制配置 
     * @return EsPublicAcl ES公网访问控制配置
     */
    public EsAcl getEsPublicAcl() {
        return this.EsPublicAcl;
    }

    /**
     * Set ES公网访问控制配置
     * @param EsPublicAcl ES公网访问控制配置
     */
    public void setEsPublicAcl(EsAcl EsPublicAcl) {
        this.EsPublicAcl = EsPublicAcl;
    }

    /**
     * Get Kibana内网地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KibanaPrivateUrl Kibana内网地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKibanaPrivateUrl() {
        return this.KibanaPrivateUrl;
    }

    /**
     * Set Kibana内网地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param KibanaPrivateUrl Kibana内网地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKibanaPrivateUrl(String KibanaPrivateUrl) {
        this.KibanaPrivateUrl = KibanaPrivateUrl;
    }

    /**
     * Get Kibana公网访问状态<li>OPEN：开启</li><li>CLOSE：关闭
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KibanaPublicAccess Kibana公网访问状态<li>OPEN：开启</li><li>CLOSE：关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKibanaPublicAccess() {
        return this.KibanaPublicAccess;
    }

    /**
     * Set Kibana公网访问状态<li>OPEN：开启</li><li>CLOSE：关闭
注意：此字段可能返回 null，表示取不到有效值。
     * @param KibanaPublicAccess Kibana公网访问状态<li>OPEN：开启</li><li>CLOSE：关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKibanaPublicAccess(String KibanaPublicAccess) {
        this.KibanaPublicAccess = KibanaPublicAccess;
    }

    /**
     * Get Kibana内网访问状态<li>OPEN：开启</li><li>CLOSE：关闭
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KibanaPrivateAccess Kibana内网访问状态<li>OPEN：开启</li><li>CLOSE：关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKibanaPrivateAccess() {
        return this.KibanaPrivateAccess;
    }

    /**
     * Set Kibana内网访问状态<li>OPEN：开启</li><li>CLOSE：关闭
注意：此字段可能返回 null，表示取不到有效值。
     * @param KibanaPrivateAccess Kibana内网访问状态<li>OPEN：开启</li><li>CLOSE：关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKibanaPrivateAccess(String KibanaPrivateAccess) {
        this.KibanaPrivateAccess = KibanaPrivateAccess;
    }

    /**
     * Get 6.8（及以上版本）基础版是否开启xpack security认证<li>1：不开启</li><li>2：开启</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecurityType 6.8（及以上版本）基础版是否开启xpack security认证<li>1：不开启</li><li>2：开启</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSecurityType() {
        return this.SecurityType;
    }

    /**
     * Set 6.8（及以上版本）基础版是否开启xpack security认证<li>1：不开启</li><li>2：开启</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecurityType 6.8（及以上版本）基础版是否开启xpack security认证<li>1：不开启</li><li>2：开启</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecurityType(Long SecurityType) {
        this.SecurityType = SecurityType;
    }

    /**
     * Get 场景化模板类型：0、不开启；1、通用场景；2、日志场景；3、搜索场景
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SceneType 场景化模板类型：0、不开启；1、通用场景；2、日志场景；3、搜索场景
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSceneType() {
        return this.SceneType;
    }

    /**
     * Set 场景化模板类型：0、不开启；1、通用场景；2、日志场景；3、搜索场景
注意：此字段可能返回 null，表示取不到有效值。
     * @param SceneType 场景化模板类型：0、不开启；1、通用场景；2、日志场景；3、搜索场景
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSceneType(Long SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get Kibana配置项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KibanaConfig Kibana配置项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKibanaConfig() {
        return this.KibanaConfig;
    }

    /**
     * Set Kibana配置项
注意：此字段可能返回 null，表示取不到有效值。
     * @param KibanaConfig Kibana配置项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKibanaConfig(String KibanaConfig) {
        this.KibanaConfig = KibanaConfig;
    }

    /**
     * Get Kibana节点信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KibanaNodeInfo Kibana节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KibanaNodeInfo getKibanaNodeInfo() {
        return this.KibanaNodeInfo;
    }

    /**
     * Set Kibana节点信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param KibanaNodeInfo Kibana节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKibanaNodeInfo(KibanaNodeInfo KibanaNodeInfo) {
        this.KibanaNodeInfo = KibanaNodeInfo;
    }

    /**
     * Get 可视化节点配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebNodeTypeInfo 可视化节点配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WebNodeTypeInfo getWebNodeTypeInfo() {
        return this.WebNodeTypeInfo;
    }

    /**
     * Set 可视化节点配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebNodeTypeInfo 可视化节点配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebNodeTypeInfo(WebNodeTypeInfo WebNodeTypeInfo) {
        this.WebNodeTypeInfo = WebNodeTypeInfo;
    }

    /**
     * Get JDK类型，oracle或kona
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Jdk JDK类型，oracle或kona
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJdk() {
        return this.Jdk;
    }

    /**
     * Set JDK类型，oracle或kona
注意：此字段可能返回 null，表示取不到有效值。
     * @param Jdk JDK类型，oracle或kona
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJdk(String Jdk) {
        this.Jdk = Jdk;
    }

    /**
     * Get 集群网络通讯协议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol 集群网络通讯协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 集群网络通讯协议
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol 集群网络通讯协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 安全组id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecurityGroups 安全组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSecurityGroups() {
        return this.SecurityGroups;
    }

    /**
     * Set 安全组id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecurityGroups 安全组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecurityGroups(String [] SecurityGroups) {
        this.SecurityGroups = SecurityGroups;
    }

    /**
     * Get 冷节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColdNodeType 冷节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColdNodeType() {
        return this.ColdNodeType;
    }

    /**
     * Set 冷节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColdNodeType 冷节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColdNodeType(String ColdNodeType) {
        this.ColdNodeType = ColdNodeType;
    }

    /**
     * Get 冷节点个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColdNodeNum 冷节点个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getColdNodeNum() {
        return this.ColdNodeNum;
    }

    /**
     * Set 冷节点个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColdNodeNum 冷节点个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColdNodeNum(Long ColdNodeNum) {
        this.ColdNodeNum = ColdNodeNum;
    }

    /**
     * Get 冷节点CPU核数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColdCpuNum 冷节点CPU核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getColdCpuNum() {
        return this.ColdCpuNum;
    }

    /**
     * Set 冷节点CPU核数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColdCpuNum 冷节点CPU核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColdCpuNum(Long ColdCpuNum) {
        this.ColdCpuNum = ColdCpuNum;
    }

    /**
     * Get 冷节点内存大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColdMemSize 冷节点内存大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getColdMemSize() {
        return this.ColdMemSize;
    }

    /**
     * Set 冷节点内存大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColdMemSize 冷节点内存大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColdMemSize(Long ColdMemSize) {
        this.ColdMemSize = ColdMemSize;
    }

    /**
     * Get 冷节点磁盘类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColdDiskType 冷节点磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColdDiskType() {
        return this.ColdDiskType;
    }

    /**
     * Set 冷节点磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColdDiskType 冷节点磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColdDiskType(String ColdDiskType) {
        this.ColdDiskType = ColdDiskType;
    }

    /**
     * Get 冷节点磁盘大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColdDiskSize 冷节点磁盘大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getColdDiskSize() {
        return this.ColdDiskSize;
    }

    /**
     * Set 冷节点磁盘大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColdDiskSize 冷节点磁盘大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColdDiskSize(Long ColdDiskSize) {
        this.ColdDiskSize = ColdDiskSize;
    }

    /**
     * Get 冻节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrozenNodeType 冻节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrozenNodeType() {
        return this.FrozenNodeType;
    }

    /**
     * Set 冻节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrozenNodeType 冻节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrozenNodeType(String FrozenNodeType) {
        this.FrozenNodeType = FrozenNodeType;
    }

    /**
     * Get 冻节点个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrozenNodeNum 冻节点个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFrozenNodeNum() {
        return this.FrozenNodeNum;
    }

    /**
     * Set 冻节点个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrozenNodeNum 冻节点个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrozenNodeNum(Long FrozenNodeNum) {
        this.FrozenNodeNum = FrozenNodeNum;
    }

    /**
     * Get 冻节点CPU核数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrozenCpuNum 冻节点CPU核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFrozenCpuNum() {
        return this.FrozenCpuNum;
    }

    /**
     * Set 冻节点CPU核数
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrozenCpuNum 冻节点CPU核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrozenCpuNum(Long FrozenCpuNum) {
        this.FrozenCpuNum = FrozenCpuNum;
    }

    /**
     * Get 冻节点内存大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrozenMemSize 冻节点内存大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFrozenMemSize() {
        return this.FrozenMemSize;
    }

    /**
     * Set 冻节点内存大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrozenMemSize 冻节点内存大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrozenMemSize(Long FrozenMemSize) {
        this.FrozenMemSize = FrozenMemSize;
    }

    /**
     * Get 冻节点磁盘类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrozenDiskType 冻节点磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrozenDiskType() {
        return this.FrozenDiskType;
    }

    /**
     * Set 冻节点磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrozenDiskType 冻节点磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrozenDiskType(String FrozenDiskType) {
        this.FrozenDiskType = FrozenDiskType;
    }

    /**
     * Get 冻节点磁盘大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrozenDiskSize 冻节点磁盘大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFrozenDiskSize() {
        return this.FrozenDiskSize;
    }

    /**
     * Set 冻节点磁盘大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrozenDiskSize 冻节点磁盘大小，单位GB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrozenDiskSize(Long FrozenDiskSize) {
        this.FrozenDiskSize = FrozenDiskSize;
    }

    /**
     * Get 集群健康状态 -1 未知；0 Green; 1 Yellow; 2 Red
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthStatus 集群健康状态 -1 未知；0 Green; 1 Yellow; 2 Red
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * Set 集群健康状态 -1 未知；0 Green; 1 Yellow; 2 Red
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthStatus 集群健康状态 -1 未知；0 Green; 1 Yellow; 2 Red
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthStatus(Long HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    /**
     * Get https集群内网url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EsPrivateUrl https集群内网url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEsPrivateUrl() {
        return this.EsPrivateUrl;
    }

    /**
     * Set https集群内网url
注意：此字段可能返回 null，表示取不到有效值。
     * @param EsPrivateUrl https集群内网url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEsPrivateUrl(String EsPrivateUrl) {
        this.EsPrivateUrl = EsPrivateUrl;
    }

    /**
     * Get https集群内网域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EsPrivateDomain https集群内网域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEsPrivateDomain() {
        return this.EsPrivateDomain;
    }

    /**
     * Set https集群内网域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param EsPrivateDomain https集群内网域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEsPrivateDomain(String EsPrivateDomain) {
        this.EsPrivateDomain = EsPrivateDomain;
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
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.VpcUid != null) {
            this.VpcUid = new String(source.VpcUid);
        }
        if (source.SubnetUid != null) {
            this.SubnetUid = new String(source.SubnetUid);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.ChargePeriod != null) {
            this.ChargePeriod = new Long(source.ChargePeriod);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
        }
        if (source.CpuNum != null) {
            this.CpuNum = new Long(source.CpuNum);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.EsDomain != null) {
            this.EsDomain = new String(source.EsDomain);
        }
        if (source.EsVip != null) {
            this.EsVip = new String(source.EsVip);
        }
        if (source.EsPort != null) {
            this.EsPort = new Long(source.EsPort);
        }
        if (source.KibanaUrl != null) {
            this.KibanaUrl = new String(source.KibanaUrl);
        }
        if (source.EsVersion != null) {
            this.EsVersion = new String(source.EsVersion);
        }
        if (source.EsConfig != null) {
            this.EsConfig = new String(source.EsConfig);
        }
        if (source.EsAcl != null) {
            this.EsAcl = new EsAcl(source.EsAcl);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Deadline != null) {
            this.Deadline = new String(source.Deadline);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.IkConfig != null) {
            this.IkConfig = new EsDictionaryInfo(source.IkConfig);
        }
        if (source.MasterNodeInfo != null) {
            this.MasterNodeInfo = new MasterNodeInfo(source.MasterNodeInfo);
        }
        if (source.CosBackup != null) {
            this.CosBackup = new CosBackup(source.CosBackup);
        }
        if (source.AllowCosBackup != null) {
            this.AllowCosBackup = new Boolean(source.AllowCosBackup);
        }
        if (source.TagList != null) {
            this.TagList = new TagInfo[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new TagInfo(source.TagList[i]);
            }
        }
        if (source.LicenseType != null) {
            this.LicenseType = new String(source.LicenseType);
        }
        if (source.EnableHotWarmMode != null) {
            this.EnableHotWarmMode = new Boolean(source.EnableHotWarmMode);
        }
        if (source.WarmNodeType != null) {
            this.WarmNodeType = new String(source.WarmNodeType);
        }
        if (source.WarmNodeNum != null) {
            this.WarmNodeNum = new Long(source.WarmNodeNum);
        }
        if (source.WarmCpuNum != null) {
            this.WarmCpuNum = new Long(source.WarmCpuNum);
        }
        if (source.WarmMemSize != null) {
            this.WarmMemSize = new Long(source.WarmMemSize);
        }
        if (source.WarmDiskType != null) {
            this.WarmDiskType = new String(source.WarmDiskType);
        }
        if (source.WarmDiskSize != null) {
            this.WarmDiskSize = new Long(source.WarmDiskSize);
        }
        if (source.NodeInfoList != null) {
            this.NodeInfoList = new NodeInfo[source.NodeInfoList.length];
            for (int i = 0; i < source.NodeInfoList.length; i++) {
                this.NodeInfoList[i] = new NodeInfo(source.NodeInfoList[i]);
            }
        }
        if (source.EsPublicUrl != null) {
            this.EsPublicUrl = new String(source.EsPublicUrl);
        }
        if (source.MultiZoneInfo != null) {
            this.MultiZoneInfo = new ZoneDetail[source.MultiZoneInfo.length];
            for (int i = 0; i < source.MultiZoneInfo.length; i++) {
                this.MultiZoneInfo[i] = new ZoneDetail(source.MultiZoneInfo[i]);
            }
        }
        if (source.DeployMode != null) {
            this.DeployMode = new Long(source.DeployMode);
        }
        if (source.PublicAccess != null) {
            this.PublicAccess = new String(source.PublicAccess);
        }
        if (source.EsPublicAcl != null) {
            this.EsPublicAcl = new EsAcl(source.EsPublicAcl);
        }
        if (source.KibanaPrivateUrl != null) {
            this.KibanaPrivateUrl = new String(source.KibanaPrivateUrl);
        }
        if (source.KibanaPublicAccess != null) {
            this.KibanaPublicAccess = new String(source.KibanaPublicAccess);
        }
        if (source.KibanaPrivateAccess != null) {
            this.KibanaPrivateAccess = new String(source.KibanaPrivateAccess);
        }
        if (source.SecurityType != null) {
            this.SecurityType = new Long(source.SecurityType);
        }
        if (source.SceneType != null) {
            this.SceneType = new Long(source.SceneType);
        }
        if (source.KibanaConfig != null) {
            this.KibanaConfig = new String(source.KibanaConfig);
        }
        if (source.KibanaNodeInfo != null) {
            this.KibanaNodeInfo = new KibanaNodeInfo(source.KibanaNodeInfo);
        }
        if (source.WebNodeTypeInfo != null) {
            this.WebNodeTypeInfo = new WebNodeTypeInfo(source.WebNodeTypeInfo);
        }
        if (source.Jdk != null) {
            this.Jdk = new String(source.Jdk);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.SecurityGroups != null) {
            this.SecurityGroups = new String[source.SecurityGroups.length];
            for (int i = 0; i < source.SecurityGroups.length; i++) {
                this.SecurityGroups[i] = new String(source.SecurityGroups[i]);
            }
        }
        if (source.ColdNodeType != null) {
            this.ColdNodeType = new String(source.ColdNodeType);
        }
        if (source.ColdNodeNum != null) {
            this.ColdNodeNum = new Long(source.ColdNodeNum);
        }
        if (source.ColdCpuNum != null) {
            this.ColdCpuNum = new Long(source.ColdCpuNum);
        }
        if (source.ColdMemSize != null) {
            this.ColdMemSize = new Long(source.ColdMemSize);
        }
        if (source.ColdDiskType != null) {
            this.ColdDiskType = new String(source.ColdDiskType);
        }
        if (source.ColdDiskSize != null) {
            this.ColdDiskSize = new Long(source.ColdDiskSize);
        }
        if (source.FrozenNodeType != null) {
            this.FrozenNodeType = new String(source.FrozenNodeType);
        }
        if (source.FrozenNodeNum != null) {
            this.FrozenNodeNum = new Long(source.FrozenNodeNum);
        }
        if (source.FrozenCpuNum != null) {
            this.FrozenCpuNum = new Long(source.FrozenCpuNum);
        }
        if (source.FrozenMemSize != null) {
            this.FrozenMemSize = new Long(source.FrozenMemSize);
        }
        if (source.FrozenDiskType != null) {
            this.FrozenDiskType = new String(source.FrozenDiskType);
        }
        if (source.FrozenDiskSize != null) {
            this.FrozenDiskSize = new Long(source.FrozenDiskSize);
        }
        if (source.HealthStatus != null) {
            this.HealthStatus = new Long(source.HealthStatus);
        }
        if (source.EsPrivateUrl != null) {
            this.EsPrivateUrl = new String(source.EsPrivateUrl);
        }
        if (source.EsPrivateDomain != null) {
            this.EsPrivateDomain = new String(source.EsPrivateDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "VpcUid", this.VpcUid);
        this.setParamSimple(map, prefix + "SubnetUid", this.SubnetUid);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "ChargePeriod", this.ChargePeriod);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "CpuNum", this.CpuNum);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "EsDomain", this.EsDomain);
        this.setParamSimple(map, prefix + "EsVip", this.EsVip);
        this.setParamSimple(map, prefix + "EsPort", this.EsPort);
        this.setParamSimple(map, prefix + "KibanaUrl", this.KibanaUrl);
        this.setParamSimple(map, prefix + "EsVersion", this.EsVersion);
        this.setParamSimple(map, prefix + "EsConfig", this.EsConfig);
        this.setParamObj(map, prefix + "EsAcl.", this.EsAcl);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamObj(map, prefix + "IkConfig.", this.IkConfig);
        this.setParamObj(map, prefix + "MasterNodeInfo.", this.MasterNodeInfo);
        this.setParamObj(map, prefix + "CosBackup.", this.CosBackup);
        this.setParamSimple(map, prefix + "AllowCosBackup", this.AllowCosBackup);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "EnableHotWarmMode", this.EnableHotWarmMode);
        this.setParamSimple(map, prefix + "WarmNodeType", this.WarmNodeType);
        this.setParamSimple(map, prefix + "WarmNodeNum", this.WarmNodeNum);
        this.setParamSimple(map, prefix + "WarmCpuNum", this.WarmCpuNum);
        this.setParamSimple(map, prefix + "WarmMemSize", this.WarmMemSize);
        this.setParamSimple(map, prefix + "WarmDiskType", this.WarmDiskType);
        this.setParamSimple(map, prefix + "WarmDiskSize", this.WarmDiskSize);
        this.setParamArrayObj(map, prefix + "NodeInfoList.", this.NodeInfoList);
        this.setParamSimple(map, prefix + "EsPublicUrl", this.EsPublicUrl);
        this.setParamArrayObj(map, prefix + "MultiZoneInfo.", this.MultiZoneInfo);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "PublicAccess", this.PublicAccess);
        this.setParamObj(map, prefix + "EsPublicAcl.", this.EsPublicAcl);
        this.setParamSimple(map, prefix + "KibanaPrivateUrl", this.KibanaPrivateUrl);
        this.setParamSimple(map, prefix + "KibanaPublicAccess", this.KibanaPublicAccess);
        this.setParamSimple(map, prefix + "KibanaPrivateAccess", this.KibanaPrivateAccess);
        this.setParamSimple(map, prefix + "SecurityType", this.SecurityType);
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamSimple(map, prefix + "KibanaConfig", this.KibanaConfig);
        this.setParamObj(map, prefix + "KibanaNodeInfo.", this.KibanaNodeInfo);
        this.setParamObj(map, prefix + "WebNodeTypeInfo.", this.WebNodeTypeInfo);
        this.setParamSimple(map, prefix + "Jdk", this.Jdk);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamArraySimple(map, prefix + "SecurityGroups.", this.SecurityGroups);
        this.setParamSimple(map, prefix + "ColdNodeType", this.ColdNodeType);
        this.setParamSimple(map, prefix + "ColdNodeNum", this.ColdNodeNum);
        this.setParamSimple(map, prefix + "ColdCpuNum", this.ColdCpuNum);
        this.setParamSimple(map, prefix + "ColdMemSize", this.ColdMemSize);
        this.setParamSimple(map, prefix + "ColdDiskType", this.ColdDiskType);
        this.setParamSimple(map, prefix + "ColdDiskSize", this.ColdDiskSize);
        this.setParamSimple(map, prefix + "FrozenNodeType", this.FrozenNodeType);
        this.setParamSimple(map, prefix + "FrozenNodeNum", this.FrozenNodeNum);
        this.setParamSimple(map, prefix + "FrozenCpuNum", this.FrozenCpuNum);
        this.setParamSimple(map, prefix + "FrozenMemSize", this.FrozenMemSize);
        this.setParamSimple(map, prefix + "FrozenDiskType", this.FrozenDiskType);
        this.setParamSimple(map, prefix + "FrozenDiskSize", this.FrozenDiskSize);
        this.setParamSimple(map, prefix + "HealthStatus", this.HealthStatus);
        this.setParamSimple(map, prefix + "EsPrivateUrl", this.EsPrivateUrl);
        this.setParamSimple(map, prefix + "EsPrivateDomain", this.EsPrivateDomain);

    }
}

