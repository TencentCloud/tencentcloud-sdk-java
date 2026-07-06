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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInfo extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>可用区</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>用户ID</p>
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
    * <p>实例所属VPC的UID</p>
    */
    @SerializedName("VpcUid")
    @Expose
    private String VpcUid;

    /**
    * <p>实例所属子网的UID</p>
    */
    @SerializedName("SubnetUid")
    @Expose
    private String SubnetUid;

    /**
    * <p>实例状态，0:处理中,1:正常,-1:停止,-2:销毁中,-3:已销毁, -4:隔离中,2:创建集群时初始化中</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>自动续费标识。取值范围：<br>RENEW_FLAG_AUTO：自动续费<br>RENEW_FLAG_MANUAL：不自动续费<br>默认取值：<br>RENEW_FLAG_DEFAULT：不自动续费<br>若该参数指定为 RENEW_FLAG_AUTO，在账户余额充足的情况下，实例到期后将按月自动续费。</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * <p>实例计费模式。取值范围：  PREPAID：表示预付费，即包年包月  POSTPAID_BY_HOUR：表示后付费，即按量计费  CDHPAID：CDH付费，即只对CDH计费，不对CDH上的实例计费。</p>
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * <p>包年包月购买时长,单位:月</p>
    */
    @SerializedName("ChargePeriod")
    @Expose
    private Long ChargePeriod;

    /**
    * <p>节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>节点个数</p>
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * <p>节点CPU核数</p>
    */
    @SerializedName("CpuNum")
    @Expose
    private Long CpuNum;

    /**
    * <p>节点内存大小，单位GB</p>
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * <p>节点磁盘类型</p>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * <p>节点磁盘大小，单位GB</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>ES域名</p>
    */
    @SerializedName("EsDomain")
    @Expose
    private String EsDomain;

    /**
    * <p>ES VIP</p>
    */
    @SerializedName("EsVip")
    @Expose
    private String EsVip;

    /**
    * <p>ES端口</p>
    */
    @SerializedName("EsPort")
    @Expose
    private Long EsPort;

    /**
    * <p>Kibana访问url</p>
    */
    @SerializedName("KibanaUrl")
    @Expose
    private String KibanaUrl;

    /**
    * <p>ES版本号</p>
    */
    @SerializedName("EsVersion")
    @Expose
    private String EsVersion;

    /**
    * <p>ES配置项</p>
    */
    @SerializedName("EsConfig")
    @Expose
    private String EsConfig;

    /**
    * <p>Kibana访问控制配置</p>
    */
    @SerializedName("EsAcl")
    @Expose
    private EsAcl EsAcl;

    /**
    * <p>实例创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>实例最后修改操作时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>实例到期时间</p>
    */
    @SerializedName("Deadline")
    @Expose
    private String Deadline;

    /**
    * <p>实例类型（实例类型标识，当前只有1,2两种）</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * <p>Ik分词器配置</p>
    */
    @SerializedName("IkConfig")
    @Expose
    private EsDictionaryInfo IkConfig;

    /**
    * <p>专用主节点配置</p>
    */
    @SerializedName("MasterNodeInfo")
    @Expose
    private MasterNodeInfo MasterNodeInfo;

    /**
    * <p>cos自动备份配置</p>
    */
    @SerializedName("CosBackup")
    @Expose
    private CosBackup CosBackup;

    /**
    * <p>是否允许cos自动备份</p>
    */
    @SerializedName("AllowCosBackup")
    @Expose
    private Boolean AllowCosBackup;

    /**
    * <p>实例拥有的标签列表</p>
    */
    @SerializedName("TagList")
    @Expose
    private TagInfo [] TagList;

    /**
    * <p>License类型<li>oss：开源版</li><li>basic：基础版</li><li>platinum：白金版</li>默认值platinum</p>
    */
    @SerializedName("LicenseType")
    @Expose
    private String LicenseType;

    /**
    * <p>License类型<li>oss：开源版</li><li>basic：基础版</li><li>platinum：白金版</li><li>enterprise：企业版</li>默认值platinum</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealLicenseType")
    @Expose
    private String RealLicenseType;

    /**
    * <p>是否为冷热集群<li>true: 冷热集群</li><li>false: 非冷热集群</li></p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableHotWarmMode")
    @Expose
    private Boolean EnableHotWarmMode;

    /**
    * <p>温节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WarmNodeType")
    @Expose
    private String WarmNodeType;

    /**
    * <p>温节点个数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WarmNodeNum")
    @Expose
    private Long WarmNodeNum;

    /**
    * <p>温节点CPU核数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WarmCpuNum")
    @Expose
    private Long WarmCpuNum;

    /**
    * <p>温节点内存内存大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WarmMemSize")
    @Expose
    private Long WarmMemSize;

    /**
    * <p>温节点磁盘类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WarmDiskType")
    @Expose
    private String WarmDiskType;

    /**
    * <p>温节点磁盘大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WarmDiskSize")
    @Expose
    private Long WarmDiskSize;

    /**
    * <p>集群节点信息列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeInfoList")
    @Expose
    private NodeInfo [] NodeInfoList;

    /**
    * <p>Es公网地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EsPublicUrl")
    @Expose
    private String EsPublicUrl;

    /**
    * <p>多可用区网络信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MultiZoneInfo")
    @Expose
    private ZoneDetail [] MultiZoneInfo;

    /**
    * <p>部署模式<li>0：单可用区</li><li>1：多可用区，北京、上海、上海金融、广州、南京、香港、新加坡、法兰克福（白名单控制）</li></p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeployMode")
    @Expose
    private Long DeployMode;

    /**
    * <p>ES公网访问状态<li>OPEN：开启</li><li>CLOSE：关闭</li></p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicAccess")
    @Expose
    private String PublicAccess;

    /**
    * <p>ES公网访问控制配置</p>
    */
    @SerializedName("EsPublicAcl")
    @Expose
    private EsAcl EsPublicAcl;

    /**
    * <p>Kibana内网地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KibanaPrivateUrl")
    @Expose
    private String KibanaPrivateUrl;

    /**
    * <p>Kibana公网访问状态<li>OPEN：开启</li><li>CLOSE：关闭</li></p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KibanaPublicAccess")
    @Expose
    private String KibanaPublicAccess;

    /**
    * <p>Kibana内网访问状态<li>OPEN：开启</li><li>CLOSE：关闭</li></p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KibanaPrivateAccess")
    @Expose
    private String KibanaPrivateAccess;

    /**
    * <p>6.8（及以上版本）基础版是否开启xpack security认证<li>1：不开启</li><li>2：开启</li></p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecurityType")
    @Expose
    private Long SecurityType;

    /**
    * <p>场景化模板类型：0、不开启；1、通用场景；2、日志场景；3、搜索场景</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SceneType")
    @Expose
    private Long SceneType;

    /**
    * <p>Kibana配置项</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KibanaConfig")
    @Expose
    private String KibanaConfig;

    /**
    * <p>Kibana节点信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KibanaNodeInfo")
    @Expose
    private KibanaNodeInfo KibanaNodeInfo;

    /**
    * <p>可视化节点配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebNodeTypeInfo")
    @Expose
    private WebNodeTypeInfo WebNodeTypeInfo;

    /**
    * <p>JDK类型，oracle或kona</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Jdk")
    @Expose
    private String Jdk;

    /**
    * <p>集群网络通讯协议</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>安全组id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecurityGroups")
    @Expose
    private String [] SecurityGroups;

    /**
    * <p>冷节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColdNodeType")
    @Expose
    private String ColdNodeType;

    /**
    * <p>冷节点个数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColdNodeNum")
    @Expose
    private Long ColdNodeNum;

    /**
    * <p>冷节点CPU核数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColdCpuNum")
    @Expose
    private Long ColdCpuNum;

    /**
    * <p>冷节点内存大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColdMemSize")
    @Expose
    private Long ColdMemSize;

    /**
    * <p>冷节点磁盘类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColdDiskType")
    @Expose
    private String ColdDiskType;

    /**
    * <p>冷节点磁盘大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColdDiskSize")
    @Expose
    private Long ColdDiskSize;

    /**
    * <p>冻节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrozenNodeType")
    @Expose
    private String FrozenNodeType;

    /**
    * <p>冻节点个数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrozenNodeNum")
    @Expose
    private Long FrozenNodeNum;

    /**
    * <p>冻节点CPU核数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrozenCpuNum")
    @Expose
    private Long FrozenCpuNum;

    /**
    * <p>冻节点内存大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrozenMemSize")
    @Expose
    private Long FrozenMemSize;

    /**
    * <p>冻节点磁盘类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrozenDiskType")
    @Expose
    private String FrozenDiskType;

    /**
    * <p>冻节点磁盘大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrozenDiskSize")
    @Expose
    private Long FrozenDiskSize;

    /**
    * <p>集群健康状态 -1 未知；0 Green; 1 Yellow; 2 Red</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthStatus")
    @Expose
    private Long HealthStatus;

    /**
    * <p>https集群内网url</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EsPrivateUrl")
    @Expose
    private String EsPrivateUrl;

    /**
    * <p>https集群内网域名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EsPrivateDomain")
    @Expose
    private String EsPrivateDomain;

    /**
    * <p>集群的配置组信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EsConfigSets")
    @Expose
    private EsConfigSetInfo [] EsConfigSets;

    /**
    * <p>集群可维护时间段</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperationDuration")
    @Expose
    private OperationDuration OperationDuration;

    /**
    * <p>web节点列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OptionalWebServiceInfos")
    @Expose
    private OptionalWebServiceInfo [] OptionalWebServiceInfos;

    /**
    * <p>自治索引开关</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoIndexEnabled")
    @Expose
    private Boolean AutoIndexEnabled;

    /**
    * <p>是否支持存储计算分离</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableHybridStorage")
    @Expose
    private Boolean EnableHybridStorage;

    /**
    * <p>流程进度</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessPercent")
    @Expose
    private Float ProcessPercent;

    /**
    * <p>Kibana的alerting外网告警策略<li>OPEN：开启</li><li>CLOSE：关闭</li></p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KibanaAlteringPublicAccess")
    @Expose
    private String KibanaAlteringPublicAccess;

    /**
    * <p>本月是否有内核可以更新：false-无，true-有</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasKernelUpgrade")
    @Expose
    private Boolean HasKernelUpgrade;

    /**
    * <p>cdcId，使用cdc子网时传递</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * <p>kibana内网vip</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KibanaPrivateVip")
    @Expose
    private String KibanaPrivateVip;

    /**
    * <p>自定义kibana内网url</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomKibanaPrivateUrl")
    @Expose
    private String CustomKibanaPrivateUrl;

    /**
    * <p>节点出站访问详细信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutboundPublicAcls")
    @Expose
    private OutboundPublicAcl [] OutboundPublicAcls;

    /**
    * <p>网络连接方案</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetConnectScheme")
    @Expose
    private String NetConnectScheme;

    /**
    * <p>置放群组相关参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisasterRecoverGroupAffinity")
    @Expose
    private Long DisasterRecoverGroupAffinity;

    /**
    * <p>子产品ID枚举值： 开源版：&quot;sp_es_io2&quot;， 基础版：&quot;sp_es_basic&quot;，白金版：&quot;sp_es_platinum&quot;，AI搜索增强版：&quot;sp_es_aisearch&quot;，企业版：&quot;sp_es_enterprise&quot;，CDC白金版：&quot;sp_es_cdc_platinum&quot;，日志增强版：&quot;sp_es_enlogging&quot;，tsearch：&quot;sp_tsearch_io2&quot;，logstash：&quot;sp_es_logstash&quot; ，可以为空，为空的时候后台取LicenseType映射该字段</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * <p>存算分离cos用量，单位M</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosBucketStorageSize")
    @Expose
    private Long CosBucketStorageSize;

    /**
    * <p>读写分离模式：0-不开启，1-本地读写分离，2-远端读写分离</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReadWriteMode")
    @Expose
    private Long ReadWriteMode;

    /**
    * <p>是否有置放群组异步调度任务</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableScheduleRecoverGroup")
    @Expose
    private Boolean EnableScheduleRecoverGroup;

    /**
    * <p>异步调度任务的时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableScheduleOperationDuration")
    @Expose
    private EnableScheduleOperationDuration EnableScheduleOperationDuration;

    /**
    * <p>开启集群保护：OPEN-开启，CLOSE-关闭</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableDestroyProtection")
    @Expose
    private String EnableDestroyProtection;

    /**
    * <p>kibana内网访问地址</p>
    */
    @SerializedName("ShowKibanaIpPort")
    @Expose
    private String ShowKibanaIpPort;

    /**
    * <p>是否为CDZLite可用区</p>
    */
    @SerializedName("IsCdzLite")
    @Expose
    private Boolean IsCdzLite;

    /**
    * <p>集群内网tcp地址</p>
    */
    @SerializedName("EsPrivateTcpUrl")
    @Expose
    private String EsPrivateTcpUrl;

    /**
    * <p>是否在回收站内</p><p>默认值：false</p>
    */
    @SerializedName("IsInRecycleBin")
    @Expose
    private Boolean IsInRecycleBin;

    /**
    * <p>回收站内是否锁定</p><p>默认值：false</p>
    */
    @SerializedName("RecycleLockEnabled")
    @Expose
    private Boolean RecycleLockEnabled;

    /**
    * <p>预计销毁的时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("MayDestroyPoint")
    @Expose
    private String MayDestroyPoint;

    /**
    * <p>延迟销毁的时间</p><p>单位：天</p>
    */
    @SerializedName("DelayDestroyInterval")
    @Expose
    private Long DelayDestroyInterval;

    /**
    * <p>开启异常节点自动替换，0关闭，1开启</p>
    */
    @SerializedName("EnableAutoReplace")
    @Expose
    private Long EnableAutoReplace;

    /**
    * <p>开启mtls，0关闭，1开启</p>
    */
    @SerializedName("OpenMTLS")
    @Expose
    private Long OpenMTLS;

    /**
    * <p>证书类型</p>
    */
    @SerializedName("ServerCertSource")
    @Expose
    private String ServerCertSource;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>地域</p> 
     * @return Region <p>地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
     * @param Region <p>地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>可用区</p> 
     * @return Zone <p>可用区</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区</p>
     * @param Zone <p>可用区</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>用户ID</p> 
     * @return AppId <p>用户ID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>用户ID</p>
     * @param AppId <p>用户ID</p>
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
     * Get <p>实例所属VPC的UID</p> 
     * @return VpcUid <p>实例所属VPC的UID</p>
     */
    public String getVpcUid() {
        return this.VpcUid;
    }

    /**
     * Set <p>实例所属VPC的UID</p>
     * @param VpcUid <p>实例所属VPC的UID</p>
     */
    public void setVpcUid(String VpcUid) {
        this.VpcUid = VpcUid;
    }

    /**
     * Get <p>实例所属子网的UID</p> 
     * @return SubnetUid <p>实例所属子网的UID</p>
     */
    public String getSubnetUid() {
        return this.SubnetUid;
    }

    /**
     * Set <p>实例所属子网的UID</p>
     * @param SubnetUid <p>实例所属子网的UID</p>
     */
    public void setSubnetUid(String SubnetUid) {
        this.SubnetUid = SubnetUid;
    }

    /**
     * Get <p>实例状态，0:处理中,1:正常,-1:停止,-2:销毁中,-3:已销毁, -4:隔离中,2:创建集群时初始化中</p> 
     * @return Status <p>实例状态，0:处理中,1:正常,-1:停止,-2:销毁中,-3:已销毁, -4:隔离中,2:创建集群时初始化中</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实例状态，0:处理中,1:正常,-1:停止,-2:销毁中,-3:已销毁, -4:隔离中,2:创建集群时初始化中</p>
     * @param Status <p>实例状态，0:处理中,1:正常,-1:停止,-2:销毁中,-3:已销毁, -4:隔离中,2:创建集群时初始化中</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>自动续费标识。取值范围：<br>RENEW_FLAG_AUTO：自动续费<br>RENEW_FLAG_MANUAL：不自动续费<br>默认取值：<br>RENEW_FLAG_DEFAULT：不自动续费<br>若该参数指定为 RENEW_FLAG_AUTO，在账户余额充足的情况下，实例到期后将按月自动续费。</p> 
     * @return RenewFlag <p>自动续费标识。取值范围：<br>RENEW_FLAG_AUTO：自动续费<br>RENEW_FLAG_MANUAL：不自动续费<br>默认取值：<br>RENEW_FLAG_DEFAULT：不自动续费<br>若该参数指定为 RENEW_FLAG_AUTO，在账户余额充足的情况下，实例到期后将按月自动续费。</p>
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>自动续费标识。取值范围：<br>RENEW_FLAG_AUTO：自动续费<br>RENEW_FLAG_MANUAL：不自动续费<br>默认取值：<br>RENEW_FLAG_DEFAULT：不自动续费<br>若该参数指定为 RENEW_FLAG_AUTO，在账户余额充足的情况下，实例到期后将按月自动续费。</p>
     * @param RenewFlag <p>自动续费标识。取值范围：<br>RENEW_FLAG_AUTO：自动续费<br>RENEW_FLAG_MANUAL：不自动续费<br>默认取值：<br>RENEW_FLAG_DEFAULT：不自动续费<br>若该参数指定为 RENEW_FLAG_AUTO，在账户余额充足的情况下，实例到期后将按月自动续费。</p>
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>实例计费模式。取值范围：  PREPAID：表示预付费，即包年包月  POSTPAID_BY_HOUR：表示后付费，即按量计费  CDHPAID：CDH付费，即只对CDH计费，不对CDH上的实例计费。</p> 
     * @return ChargeType <p>实例计费模式。取值范围：  PREPAID：表示预付费，即包年包月  POSTPAID_BY_HOUR：表示后付费，即按量计费  CDHPAID：CDH付费，即只对CDH计费，不对CDH上的实例计费。</p>
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set <p>实例计费模式。取值范围：  PREPAID：表示预付费，即包年包月  POSTPAID_BY_HOUR：表示后付费，即按量计费  CDHPAID：CDH付费，即只对CDH计费，不对CDH上的实例计费。</p>
     * @param ChargeType <p>实例计费模式。取值范围：  PREPAID：表示预付费，即包年包月  POSTPAID_BY_HOUR：表示后付费，即按量计费  CDHPAID：CDH付费，即只对CDH计费，不对CDH上的实例计费。</p>
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get <p>包年包月购买时长,单位:月</p> 
     * @return ChargePeriod <p>包年包月购买时长,单位:月</p>
     */
    public Long getChargePeriod() {
        return this.ChargePeriod;
    }

    /**
     * Set <p>包年包月购买时长,单位:月</p>
     * @param ChargePeriod <p>包年包月购买时长,单位:月</p>
     */
    public void setChargePeriod(Long ChargePeriod) {
        this.ChargePeriod = ChargePeriod;
    }

    /**
     * Get <p>节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p> 
     * @return NodeType <p>节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
     * @param NodeType <p>节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>节点个数</p> 
     * @return NodeNum <p>节点个数</p>
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set <p>节点个数</p>
     * @param NodeNum <p>节点个数</p>
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get <p>节点CPU核数</p> 
     * @return CpuNum <p>节点CPU核数</p>
     */
    public Long getCpuNum() {
        return this.CpuNum;
    }

    /**
     * Set <p>节点CPU核数</p>
     * @param CpuNum <p>节点CPU核数</p>
     */
    public void setCpuNum(Long CpuNum) {
        this.CpuNum = CpuNum;
    }

    /**
     * Get <p>节点内存大小，单位GB</p> 
     * @return MemSize <p>节点内存大小，单位GB</p>
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set <p>节点内存大小，单位GB</p>
     * @param MemSize <p>节点内存大小，单位GB</p>
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get <p>节点磁盘类型</p> 
     * @return DiskType <p>节点磁盘类型</p>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set <p>节点磁盘类型</p>
     * @param DiskType <p>节点磁盘类型</p>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get <p>节点磁盘大小，单位GB</p> 
     * @return DiskSize <p>节点磁盘大小，单位GB</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>节点磁盘大小，单位GB</p>
     * @param DiskSize <p>节点磁盘大小，单位GB</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>ES域名</p> 
     * @return EsDomain <p>ES域名</p>
     */
    public String getEsDomain() {
        return this.EsDomain;
    }

    /**
     * Set <p>ES域名</p>
     * @param EsDomain <p>ES域名</p>
     */
    public void setEsDomain(String EsDomain) {
        this.EsDomain = EsDomain;
    }

    /**
     * Get <p>ES VIP</p> 
     * @return EsVip <p>ES VIP</p>
     */
    public String getEsVip() {
        return this.EsVip;
    }

    /**
     * Set <p>ES VIP</p>
     * @param EsVip <p>ES VIP</p>
     */
    public void setEsVip(String EsVip) {
        this.EsVip = EsVip;
    }

    /**
     * Get <p>ES端口</p> 
     * @return EsPort <p>ES端口</p>
     */
    public Long getEsPort() {
        return this.EsPort;
    }

    /**
     * Set <p>ES端口</p>
     * @param EsPort <p>ES端口</p>
     */
    public void setEsPort(Long EsPort) {
        this.EsPort = EsPort;
    }

    /**
     * Get <p>Kibana访问url</p> 
     * @return KibanaUrl <p>Kibana访问url</p>
     */
    public String getKibanaUrl() {
        return this.KibanaUrl;
    }

    /**
     * Set <p>Kibana访问url</p>
     * @param KibanaUrl <p>Kibana访问url</p>
     */
    public void setKibanaUrl(String KibanaUrl) {
        this.KibanaUrl = KibanaUrl;
    }

    /**
     * Get <p>ES版本号</p> 
     * @return EsVersion <p>ES版本号</p>
     */
    public String getEsVersion() {
        return this.EsVersion;
    }

    /**
     * Set <p>ES版本号</p>
     * @param EsVersion <p>ES版本号</p>
     */
    public void setEsVersion(String EsVersion) {
        this.EsVersion = EsVersion;
    }

    /**
     * Get <p>ES配置项</p> 
     * @return EsConfig <p>ES配置项</p>
     */
    public String getEsConfig() {
        return this.EsConfig;
    }

    /**
     * Set <p>ES配置项</p>
     * @param EsConfig <p>ES配置项</p>
     */
    public void setEsConfig(String EsConfig) {
        this.EsConfig = EsConfig;
    }

    /**
     * Get <p>Kibana访问控制配置</p> 
     * @return EsAcl <p>Kibana访问控制配置</p>
     */
    public EsAcl getEsAcl() {
        return this.EsAcl;
    }

    /**
     * Set <p>Kibana访问控制配置</p>
     * @param EsAcl <p>Kibana访问控制配置</p>
     */
    public void setEsAcl(EsAcl EsAcl) {
        this.EsAcl = EsAcl;
    }

    /**
     * Get <p>实例创建时间</p> 
     * @return CreateTime <p>实例创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>实例创建时间</p>
     * @param CreateTime <p>实例创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>实例最后修改操作时间</p> 
     * @return UpdateTime <p>实例最后修改操作时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>实例最后修改操作时间</p>
     * @param UpdateTime <p>实例最后修改操作时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>实例到期时间</p> 
     * @return Deadline <p>实例到期时间</p>
     */
    public String getDeadline() {
        return this.Deadline;
    }

    /**
     * Set <p>实例到期时间</p>
     * @param Deadline <p>实例到期时间</p>
     */
    public void setDeadline(String Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get <p>实例类型（实例类型标识，当前只有1,2两种）</p> 
     * @return InstanceType <p>实例类型（实例类型标识，当前只有1,2两种）</p>
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例类型（实例类型标识，当前只有1,2两种）</p>
     * @param InstanceType <p>实例类型（实例类型标识，当前只有1,2两种）</p>
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>Ik分词器配置</p> 
     * @return IkConfig <p>Ik分词器配置</p>
     */
    public EsDictionaryInfo getIkConfig() {
        return this.IkConfig;
    }

    /**
     * Set <p>Ik分词器配置</p>
     * @param IkConfig <p>Ik分词器配置</p>
     */
    public void setIkConfig(EsDictionaryInfo IkConfig) {
        this.IkConfig = IkConfig;
    }

    /**
     * Get <p>专用主节点配置</p> 
     * @return MasterNodeInfo <p>专用主节点配置</p>
     */
    public MasterNodeInfo getMasterNodeInfo() {
        return this.MasterNodeInfo;
    }

    /**
     * Set <p>专用主节点配置</p>
     * @param MasterNodeInfo <p>专用主节点配置</p>
     */
    public void setMasterNodeInfo(MasterNodeInfo MasterNodeInfo) {
        this.MasterNodeInfo = MasterNodeInfo;
    }

    /**
     * Get <p>cos自动备份配置</p> 
     * @return CosBackup <p>cos自动备份配置</p>
     */
    public CosBackup getCosBackup() {
        return this.CosBackup;
    }

    /**
     * Set <p>cos自动备份配置</p>
     * @param CosBackup <p>cos自动备份配置</p>
     */
    public void setCosBackup(CosBackup CosBackup) {
        this.CosBackup = CosBackup;
    }

    /**
     * Get <p>是否允许cos自动备份</p> 
     * @return AllowCosBackup <p>是否允许cos自动备份</p>
     */
    public Boolean getAllowCosBackup() {
        return this.AllowCosBackup;
    }

    /**
     * Set <p>是否允许cos自动备份</p>
     * @param AllowCosBackup <p>是否允许cos自动备份</p>
     */
    public void setAllowCosBackup(Boolean AllowCosBackup) {
        this.AllowCosBackup = AllowCosBackup;
    }

    /**
     * Get <p>实例拥有的标签列表</p> 
     * @return TagList <p>实例拥有的标签列表</p>
     */
    public TagInfo [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>实例拥有的标签列表</p>
     * @param TagList <p>实例拥有的标签列表</p>
     */
    public void setTagList(TagInfo [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>License类型<li>oss：开源版</li><li>basic：基础版</li><li>platinum：白金版</li>默认值platinum</p> 
     * @return LicenseType <p>License类型<li>oss：开源版</li><li>basic：基础版</li><li>platinum：白金版</li>默认值platinum</p>
     */
    public String getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set <p>License类型<li>oss：开源版</li><li>basic：基础版</li><li>platinum：白金版</li>默认值platinum</p>
     * @param LicenseType <p>License类型<li>oss：开源版</li><li>basic：基础版</li><li>platinum：白金版</li>默认值platinum</p>
     */
    public void setLicenseType(String LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get <p>License类型<li>oss：开源版</li><li>basic：基础版</li><li>platinum：白金版</li><li>enterprise：企业版</li>默认值platinum</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealLicenseType <p>License类型<li>oss：开源版</li><li>basic：基础版</li><li>platinum：白金版</li><li>enterprise：企业版</li>默认值platinum</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealLicenseType() {
        return this.RealLicenseType;
    }

    /**
     * Set <p>License类型<li>oss：开源版</li><li>basic：基础版</li><li>platinum：白金版</li><li>enterprise：企业版</li>默认值platinum</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealLicenseType <p>License类型<li>oss：开源版</li><li>basic：基础版</li><li>platinum：白金版</li><li>enterprise：企业版</li>默认值platinum</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealLicenseType(String RealLicenseType) {
        this.RealLicenseType = RealLicenseType;
    }

    /**
     * Get <p>是否为冷热集群<li>true: 冷热集群</li><li>false: 非冷热集群</li></p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableHotWarmMode <p>是否为冷热集群<li>true: 冷热集群</li><li>false: 非冷热集群</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableHotWarmMode() {
        return this.EnableHotWarmMode;
    }

    /**
     * Set <p>是否为冷热集群<li>true: 冷热集群</li><li>false: 非冷热集群</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableHotWarmMode <p>是否为冷热集群<li>true: 冷热集群</li><li>false: 非冷热集群</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableHotWarmMode(Boolean EnableHotWarmMode) {
        this.EnableHotWarmMode = EnableHotWarmMode;
    }

    /**
     * Get <p>温节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WarmNodeType <p>温节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWarmNodeType() {
        return this.WarmNodeType;
    }

    /**
     * Set <p>温节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WarmNodeType <p>温节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarmNodeType(String WarmNodeType) {
        this.WarmNodeType = WarmNodeType;
    }

    /**
     * Get <p>温节点个数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WarmNodeNum <p>温节点个数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWarmNodeNum() {
        return this.WarmNodeNum;
    }

    /**
     * Set <p>温节点个数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WarmNodeNum <p>温节点个数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarmNodeNum(Long WarmNodeNum) {
        this.WarmNodeNum = WarmNodeNum;
    }

    /**
     * Get <p>温节点CPU核数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WarmCpuNum <p>温节点CPU核数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWarmCpuNum() {
        return this.WarmCpuNum;
    }

    /**
     * Set <p>温节点CPU核数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WarmCpuNum <p>温节点CPU核数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarmCpuNum(Long WarmCpuNum) {
        this.WarmCpuNum = WarmCpuNum;
    }

    /**
     * Get <p>温节点内存内存大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WarmMemSize <p>温节点内存内存大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWarmMemSize() {
        return this.WarmMemSize;
    }

    /**
     * Set <p>温节点内存内存大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WarmMemSize <p>温节点内存内存大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarmMemSize(Long WarmMemSize) {
        this.WarmMemSize = WarmMemSize;
    }

    /**
     * Get <p>温节点磁盘类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WarmDiskType <p>温节点磁盘类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWarmDiskType() {
        return this.WarmDiskType;
    }

    /**
     * Set <p>温节点磁盘类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WarmDiskType <p>温节点磁盘类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarmDiskType(String WarmDiskType) {
        this.WarmDiskType = WarmDiskType;
    }

    /**
     * Get <p>温节点磁盘大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WarmDiskSize <p>温节点磁盘大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWarmDiskSize() {
        return this.WarmDiskSize;
    }

    /**
     * Set <p>温节点磁盘大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WarmDiskSize <p>温节点磁盘大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarmDiskSize(Long WarmDiskSize) {
        this.WarmDiskSize = WarmDiskSize;
    }

    /**
     * Get <p>集群节点信息列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeInfoList <p>集群节点信息列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeInfo [] getNodeInfoList() {
        return this.NodeInfoList;
    }

    /**
     * Set <p>集群节点信息列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeInfoList <p>集群节点信息列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeInfoList(NodeInfo [] NodeInfoList) {
        this.NodeInfoList = NodeInfoList;
    }

    /**
     * Get <p>Es公网地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EsPublicUrl <p>Es公网地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEsPublicUrl() {
        return this.EsPublicUrl;
    }

    /**
     * Set <p>Es公网地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EsPublicUrl <p>Es公网地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEsPublicUrl(String EsPublicUrl) {
        this.EsPublicUrl = EsPublicUrl;
    }

    /**
     * Get <p>多可用区网络信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MultiZoneInfo <p>多可用区网络信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ZoneDetail [] getMultiZoneInfo() {
        return this.MultiZoneInfo;
    }

    /**
     * Set <p>多可用区网络信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MultiZoneInfo <p>多可用区网络信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMultiZoneInfo(ZoneDetail [] MultiZoneInfo) {
        this.MultiZoneInfo = MultiZoneInfo;
    }

    /**
     * Get <p>部署模式<li>0：单可用区</li><li>1：多可用区，北京、上海、上海金融、广州、南京、香港、新加坡、法兰克福（白名单控制）</li></p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeployMode <p>部署模式<li>0：单可用区</li><li>1：多可用区，北京、上海、上海金融、广州、南京、香港、新加坡、法兰克福（白名单控制）</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set <p>部署模式<li>0：单可用区</li><li>1：多可用区，北京、上海、上海金融、广州、南京、香港、新加坡、法兰克福（白名单控制）</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeployMode <p>部署模式<li>0：单可用区</li><li>1：多可用区，北京、上海、上海金融、广州、南京、香港、新加坡、法兰克福（白名单控制）</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeployMode(Long DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get <p>ES公网访问状态<li>OPEN：开启</li><li>CLOSE：关闭</li></p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicAccess <p>ES公网访问状态<li>OPEN：开启</li><li>CLOSE：关闭</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicAccess() {
        return this.PublicAccess;
    }

    /**
     * Set <p>ES公网访问状态<li>OPEN：开启</li><li>CLOSE：关闭</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicAccess <p>ES公网访问状态<li>OPEN：开启</li><li>CLOSE：关闭</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicAccess(String PublicAccess) {
        this.PublicAccess = PublicAccess;
    }

    /**
     * Get <p>ES公网访问控制配置</p> 
     * @return EsPublicAcl <p>ES公网访问控制配置</p>
     */
    public EsAcl getEsPublicAcl() {
        return this.EsPublicAcl;
    }

    /**
     * Set <p>ES公网访问控制配置</p>
     * @param EsPublicAcl <p>ES公网访问控制配置</p>
     */
    public void setEsPublicAcl(EsAcl EsPublicAcl) {
        this.EsPublicAcl = EsPublicAcl;
    }

    /**
     * Get <p>Kibana内网地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KibanaPrivateUrl <p>Kibana内网地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKibanaPrivateUrl() {
        return this.KibanaPrivateUrl;
    }

    /**
     * Set <p>Kibana内网地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KibanaPrivateUrl <p>Kibana内网地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKibanaPrivateUrl(String KibanaPrivateUrl) {
        this.KibanaPrivateUrl = KibanaPrivateUrl;
    }

    /**
     * Get <p>Kibana公网访问状态<li>OPEN：开启</li><li>CLOSE：关闭</li></p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KibanaPublicAccess <p>Kibana公网访问状态<li>OPEN：开启</li><li>CLOSE：关闭</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKibanaPublicAccess() {
        return this.KibanaPublicAccess;
    }

    /**
     * Set <p>Kibana公网访问状态<li>OPEN：开启</li><li>CLOSE：关闭</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KibanaPublicAccess <p>Kibana公网访问状态<li>OPEN：开启</li><li>CLOSE：关闭</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKibanaPublicAccess(String KibanaPublicAccess) {
        this.KibanaPublicAccess = KibanaPublicAccess;
    }

    /**
     * Get <p>Kibana内网访问状态<li>OPEN：开启</li><li>CLOSE：关闭</li></p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KibanaPrivateAccess <p>Kibana内网访问状态<li>OPEN：开启</li><li>CLOSE：关闭</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKibanaPrivateAccess() {
        return this.KibanaPrivateAccess;
    }

    /**
     * Set <p>Kibana内网访问状态<li>OPEN：开启</li><li>CLOSE：关闭</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KibanaPrivateAccess <p>Kibana内网访问状态<li>OPEN：开启</li><li>CLOSE：关闭</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKibanaPrivateAccess(String KibanaPrivateAccess) {
        this.KibanaPrivateAccess = KibanaPrivateAccess;
    }

    /**
     * Get <p>6.8（及以上版本）基础版是否开启xpack security认证<li>1：不开启</li><li>2：开启</li></p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecurityType <p>6.8（及以上版本）基础版是否开启xpack security认证<li>1：不开启</li><li>2：开启</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSecurityType() {
        return this.SecurityType;
    }

    /**
     * Set <p>6.8（及以上版本）基础版是否开启xpack security认证<li>1：不开启</li><li>2：开启</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecurityType <p>6.8（及以上版本）基础版是否开启xpack security认证<li>1：不开启</li><li>2：开启</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecurityType(Long SecurityType) {
        this.SecurityType = SecurityType;
    }

    /**
     * Get <p>场景化模板类型：0、不开启；1、通用场景；2、日志场景；3、搜索场景</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SceneType <p>场景化模板类型：0、不开启；1、通用场景；2、日志场景；3、搜索场景</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSceneType() {
        return this.SceneType;
    }

    /**
     * Set <p>场景化模板类型：0、不开启；1、通用场景；2、日志场景；3、搜索场景</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SceneType <p>场景化模板类型：0、不开启；1、通用场景；2、日志场景；3、搜索场景</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSceneType(Long SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get <p>Kibana配置项</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KibanaConfig <p>Kibana配置项</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKibanaConfig() {
        return this.KibanaConfig;
    }

    /**
     * Set <p>Kibana配置项</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KibanaConfig <p>Kibana配置项</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKibanaConfig(String KibanaConfig) {
        this.KibanaConfig = KibanaConfig;
    }

    /**
     * Get <p>Kibana节点信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KibanaNodeInfo <p>Kibana节点信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KibanaNodeInfo getKibanaNodeInfo() {
        return this.KibanaNodeInfo;
    }

    /**
     * Set <p>Kibana节点信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KibanaNodeInfo <p>Kibana节点信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKibanaNodeInfo(KibanaNodeInfo KibanaNodeInfo) {
        this.KibanaNodeInfo = KibanaNodeInfo;
    }

    /**
     * Get <p>可视化节点配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebNodeTypeInfo <p>可视化节点配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WebNodeTypeInfo getWebNodeTypeInfo() {
        return this.WebNodeTypeInfo;
    }

    /**
     * Set <p>可视化节点配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebNodeTypeInfo <p>可视化节点配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebNodeTypeInfo(WebNodeTypeInfo WebNodeTypeInfo) {
        this.WebNodeTypeInfo = WebNodeTypeInfo;
    }

    /**
     * Get <p>JDK类型，oracle或kona</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Jdk <p>JDK类型，oracle或kona</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJdk() {
        return this.Jdk;
    }

    /**
     * Set <p>JDK类型，oracle或kona</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Jdk <p>JDK类型，oracle或kona</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJdk(String Jdk) {
        this.Jdk = Jdk;
    }

    /**
     * Get <p>集群网络通讯协议</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol <p>集群网络通讯协议</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>集群网络通讯协议</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol <p>集群网络通讯协议</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>安全组id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecurityGroups <p>安全组id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSecurityGroups() {
        return this.SecurityGroups;
    }

    /**
     * Set <p>安全组id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecurityGroups <p>安全组id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecurityGroups(String [] SecurityGroups) {
        this.SecurityGroups = SecurityGroups;
    }

    /**
     * Get <p>冷节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColdNodeType <p>冷节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColdNodeType() {
        return this.ColdNodeType;
    }

    /**
     * Set <p>冷节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColdNodeType <p>冷节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColdNodeType(String ColdNodeType) {
        this.ColdNodeType = ColdNodeType;
    }

    /**
     * Get <p>冷节点个数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColdNodeNum <p>冷节点个数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getColdNodeNum() {
        return this.ColdNodeNum;
    }

    /**
     * Set <p>冷节点个数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColdNodeNum <p>冷节点个数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColdNodeNum(Long ColdNodeNum) {
        this.ColdNodeNum = ColdNodeNum;
    }

    /**
     * Get <p>冷节点CPU核数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColdCpuNum <p>冷节点CPU核数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getColdCpuNum() {
        return this.ColdCpuNum;
    }

    /**
     * Set <p>冷节点CPU核数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColdCpuNum <p>冷节点CPU核数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColdCpuNum(Long ColdCpuNum) {
        this.ColdCpuNum = ColdCpuNum;
    }

    /**
     * Get <p>冷节点内存大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColdMemSize <p>冷节点内存大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getColdMemSize() {
        return this.ColdMemSize;
    }

    /**
     * Set <p>冷节点内存大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColdMemSize <p>冷节点内存大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColdMemSize(Long ColdMemSize) {
        this.ColdMemSize = ColdMemSize;
    }

    /**
     * Get <p>冷节点磁盘类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColdDiskType <p>冷节点磁盘类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColdDiskType() {
        return this.ColdDiskType;
    }

    /**
     * Set <p>冷节点磁盘类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColdDiskType <p>冷节点磁盘类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColdDiskType(String ColdDiskType) {
        this.ColdDiskType = ColdDiskType;
    }

    /**
     * Get <p>冷节点磁盘大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColdDiskSize <p>冷节点磁盘大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getColdDiskSize() {
        return this.ColdDiskSize;
    }

    /**
     * Set <p>冷节点磁盘大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColdDiskSize <p>冷节点磁盘大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColdDiskSize(Long ColdDiskSize) {
        this.ColdDiskSize = ColdDiskSize;
    }

    /**
     * Get <p>冻节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrozenNodeType <p>冻节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrozenNodeType() {
        return this.FrozenNodeType;
    }

    /**
     * Set <p>冻节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrozenNodeType <p>冻节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrozenNodeType(String FrozenNodeType) {
        this.FrozenNodeType = FrozenNodeType;
    }

    /**
     * Get <p>冻节点个数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrozenNodeNum <p>冻节点个数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFrozenNodeNum() {
        return this.FrozenNodeNum;
    }

    /**
     * Set <p>冻节点个数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrozenNodeNum <p>冻节点个数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrozenNodeNum(Long FrozenNodeNum) {
        this.FrozenNodeNum = FrozenNodeNum;
    }

    /**
     * Get <p>冻节点CPU核数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrozenCpuNum <p>冻节点CPU核数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFrozenCpuNum() {
        return this.FrozenCpuNum;
    }

    /**
     * Set <p>冻节点CPU核数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrozenCpuNum <p>冻节点CPU核数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrozenCpuNum(Long FrozenCpuNum) {
        this.FrozenCpuNum = FrozenCpuNum;
    }

    /**
     * Get <p>冻节点内存大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrozenMemSize <p>冻节点内存大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFrozenMemSize() {
        return this.FrozenMemSize;
    }

    /**
     * Set <p>冻节点内存大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrozenMemSize <p>冻节点内存大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrozenMemSize(Long FrozenMemSize) {
        this.FrozenMemSize = FrozenMemSize;
    }

    /**
     * Get <p>冻节点磁盘类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrozenDiskType <p>冻节点磁盘类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrozenDiskType() {
        return this.FrozenDiskType;
    }

    /**
     * Set <p>冻节点磁盘类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrozenDiskType <p>冻节点磁盘类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrozenDiskType(String FrozenDiskType) {
        this.FrozenDiskType = FrozenDiskType;
    }

    /**
     * Get <p>冻节点磁盘大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrozenDiskSize <p>冻节点磁盘大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFrozenDiskSize() {
        return this.FrozenDiskSize;
    }

    /**
     * Set <p>冻节点磁盘大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrozenDiskSize <p>冻节点磁盘大小，单位GB</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrozenDiskSize(Long FrozenDiskSize) {
        this.FrozenDiskSize = FrozenDiskSize;
    }

    /**
     * Get <p>集群健康状态 -1 未知；0 Green; 1 Yellow; 2 Red</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthStatus <p>集群健康状态 -1 未知；0 Green; 1 Yellow; 2 Red</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * Set <p>集群健康状态 -1 未知；0 Green; 1 Yellow; 2 Red</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthStatus <p>集群健康状态 -1 未知；0 Green; 1 Yellow; 2 Red</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthStatus(Long HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    /**
     * Get <p>https集群内网url</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EsPrivateUrl <p>https集群内网url</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEsPrivateUrl() {
        return this.EsPrivateUrl;
    }

    /**
     * Set <p>https集群内网url</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EsPrivateUrl <p>https集群内网url</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEsPrivateUrl(String EsPrivateUrl) {
        this.EsPrivateUrl = EsPrivateUrl;
    }

    /**
     * Get <p>https集群内网域名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EsPrivateDomain <p>https集群内网域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEsPrivateDomain() {
        return this.EsPrivateDomain;
    }

    /**
     * Set <p>https集群内网域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EsPrivateDomain <p>https集群内网域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEsPrivateDomain(String EsPrivateDomain) {
        this.EsPrivateDomain = EsPrivateDomain;
    }

    /**
     * Get <p>集群的配置组信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EsConfigSets <p>集群的配置组信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EsConfigSetInfo [] getEsConfigSets() {
        return this.EsConfigSets;
    }

    /**
     * Set <p>集群的配置组信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EsConfigSets <p>集群的配置组信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEsConfigSets(EsConfigSetInfo [] EsConfigSets) {
        this.EsConfigSets = EsConfigSets;
    }

    /**
     * Get <p>集群可维护时间段</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperationDuration <p>集群可维护时间段</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OperationDuration getOperationDuration() {
        return this.OperationDuration;
    }

    /**
     * Set <p>集群可维护时间段</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperationDuration <p>集群可维护时间段</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperationDuration(OperationDuration OperationDuration) {
        this.OperationDuration = OperationDuration;
    }

    /**
     * Get <p>web节点列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OptionalWebServiceInfos <p>web节点列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OptionalWebServiceInfo [] getOptionalWebServiceInfos() {
        return this.OptionalWebServiceInfos;
    }

    /**
     * Set <p>web节点列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OptionalWebServiceInfos <p>web节点列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOptionalWebServiceInfos(OptionalWebServiceInfo [] OptionalWebServiceInfos) {
        this.OptionalWebServiceInfos = OptionalWebServiceInfos;
    }

    /**
     * Get <p>自治索引开关</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoIndexEnabled <p>自治索引开关</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAutoIndexEnabled() {
        return this.AutoIndexEnabled;
    }

    /**
     * Set <p>自治索引开关</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoIndexEnabled <p>自治索引开关</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoIndexEnabled(Boolean AutoIndexEnabled) {
        this.AutoIndexEnabled = AutoIndexEnabled;
    }

    /**
     * Get <p>是否支持存储计算分离</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableHybridStorage <p>是否支持存储计算分离</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableHybridStorage() {
        return this.EnableHybridStorage;
    }

    /**
     * Set <p>是否支持存储计算分离</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableHybridStorage <p>是否支持存储计算分离</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableHybridStorage(Boolean EnableHybridStorage) {
        this.EnableHybridStorage = EnableHybridStorage;
    }

    /**
     * Get <p>流程进度</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessPercent <p>流程进度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getProcessPercent() {
        return this.ProcessPercent;
    }

    /**
     * Set <p>流程进度</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessPercent <p>流程进度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessPercent(Float ProcessPercent) {
        this.ProcessPercent = ProcessPercent;
    }

    /**
     * Get <p>Kibana的alerting外网告警策略<li>OPEN：开启</li><li>CLOSE：关闭</li></p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KibanaAlteringPublicAccess <p>Kibana的alerting外网告警策略<li>OPEN：开启</li><li>CLOSE：关闭</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKibanaAlteringPublicAccess() {
        return this.KibanaAlteringPublicAccess;
    }

    /**
     * Set <p>Kibana的alerting外网告警策略<li>OPEN：开启</li><li>CLOSE：关闭</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KibanaAlteringPublicAccess <p>Kibana的alerting外网告警策略<li>OPEN：开启</li><li>CLOSE：关闭</li></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKibanaAlteringPublicAccess(String KibanaAlteringPublicAccess) {
        this.KibanaAlteringPublicAccess = KibanaAlteringPublicAccess;
    }

    /**
     * Get <p>本月是否有内核可以更新：false-无，true-有</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasKernelUpgrade <p>本月是否有内核可以更新：false-无，true-有</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHasKernelUpgrade() {
        return this.HasKernelUpgrade;
    }

    /**
     * Set <p>本月是否有内核可以更新：false-无，true-有</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasKernelUpgrade <p>本月是否有内核可以更新：false-无，true-有</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasKernelUpgrade(Boolean HasKernelUpgrade) {
        this.HasKernelUpgrade = HasKernelUpgrade;
    }

    /**
     * Get <p>cdcId，使用cdc子网时传递</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CdcId <p>cdcId，使用cdc子网时传递</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set <p>cdcId，使用cdc子网时传递</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CdcId <p>cdcId，使用cdc子网时传递</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    /**
     * Get <p>kibana内网vip</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KibanaPrivateVip <p>kibana内网vip</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKibanaPrivateVip() {
        return this.KibanaPrivateVip;
    }

    /**
     * Set <p>kibana内网vip</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KibanaPrivateVip <p>kibana内网vip</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKibanaPrivateVip(String KibanaPrivateVip) {
        this.KibanaPrivateVip = KibanaPrivateVip;
    }

    /**
     * Get <p>自定义kibana内网url</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomKibanaPrivateUrl <p>自定义kibana内网url</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomKibanaPrivateUrl() {
        return this.CustomKibanaPrivateUrl;
    }

    /**
     * Set <p>自定义kibana内网url</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomKibanaPrivateUrl <p>自定义kibana内网url</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomKibanaPrivateUrl(String CustomKibanaPrivateUrl) {
        this.CustomKibanaPrivateUrl = CustomKibanaPrivateUrl;
    }

    /**
     * Get <p>节点出站访问详细信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutboundPublicAcls <p>节点出站访问详细信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OutboundPublicAcl [] getOutboundPublicAcls() {
        return this.OutboundPublicAcls;
    }

    /**
     * Set <p>节点出站访问详细信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutboundPublicAcls <p>节点出站访问详细信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutboundPublicAcls(OutboundPublicAcl [] OutboundPublicAcls) {
        this.OutboundPublicAcls = OutboundPublicAcls;
    }

    /**
     * Get <p>网络连接方案</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetConnectScheme <p>网络连接方案</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNetConnectScheme() {
        return this.NetConnectScheme;
    }

    /**
     * Set <p>网络连接方案</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetConnectScheme <p>网络连接方案</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetConnectScheme(String NetConnectScheme) {
        this.NetConnectScheme = NetConnectScheme;
    }

    /**
     * Get <p>置放群组相关参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisasterRecoverGroupAffinity <p>置放群组相关参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDisasterRecoverGroupAffinity() {
        return this.DisasterRecoverGroupAffinity;
    }

    /**
     * Set <p>置放群组相关参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisasterRecoverGroupAffinity <p>置放群组相关参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisasterRecoverGroupAffinity(Long DisasterRecoverGroupAffinity) {
        this.DisasterRecoverGroupAffinity = DisasterRecoverGroupAffinity;
    }

    /**
     * Get <p>子产品ID枚举值： 开源版：&quot;sp_es_io2&quot;， 基础版：&quot;sp_es_basic&quot;，白金版：&quot;sp_es_platinum&quot;，AI搜索增强版：&quot;sp_es_aisearch&quot;，企业版：&quot;sp_es_enterprise&quot;，CDC白金版：&quot;sp_es_cdc_platinum&quot;，日志增强版：&quot;sp_es_enlogging&quot;，tsearch：&quot;sp_tsearch_io2&quot;，logstash：&quot;sp_es_logstash&quot; ，可以为空，为空的时候后台取LicenseType映射该字段</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubProductCode <p>子产品ID枚举值： 开源版：&quot;sp_es_io2&quot;， 基础版：&quot;sp_es_basic&quot;，白金版：&quot;sp_es_platinum&quot;，AI搜索增强版：&quot;sp_es_aisearch&quot;，企业版：&quot;sp_es_enterprise&quot;，CDC白金版：&quot;sp_es_cdc_platinum&quot;，日志增强版：&quot;sp_es_enlogging&quot;，tsearch：&quot;sp_tsearch_io2&quot;，logstash：&quot;sp_es_logstash&quot; ，可以为空，为空的时候后台取LicenseType映射该字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubProductCode() {
        return this.SubProductCode;
    }

    /**
     * Set <p>子产品ID枚举值： 开源版：&quot;sp_es_io2&quot;， 基础版：&quot;sp_es_basic&quot;，白金版：&quot;sp_es_platinum&quot;，AI搜索增强版：&quot;sp_es_aisearch&quot;，企业版：&quot;sp_es_enterprise&quot;，CDC白金版：&quot;sp_es_cdc_platinum&quot;，日志增强版：&quot;sp_es_enlogging&quot;，tsearch：&quot;sp_tsearch_io2&quot;，logstash：&quot;sp_es_logstash&quot; ，可以为空，为空的时候后台取LicenseType映射该字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubProductCode <p>子产品ID枚举值： 开源版：&quot;sp_es_io2&quot;， 基础版：&quot;sp_es_basic&quot;，白金版：&quot;sp_es_platinum&quot;，AI搜索增强版：&quot;sp_es_aisearch&quot;，企业版：&quot;sp_es_enterprise&quot;，CDC白金版：&quot;sp_es_cdc_platinum&quot;，日志增强版：&quot;sp_es_enlogging&quot;，tsearch：&quot;sp_tsearch_io2&quot;，logstash：&quot;sp_es_logstash&quot; ，可以为空，为空的时候后台取LicenseType映射该字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubProductCode(String SubProductCode) {
        this.SubProductCode = SubProductCode;
    }

    /**
     * Get <p>存算分离cos用量，单位M</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosBucketStorageSize <p>存算分离cos用量，单位M</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCosBucketStorageSize() {
        return this.CosBucketStorageSize;
    }

    /**
     * Set <p>存算分离cos用量，单位M</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosBucketStorageSize <p>存算分离cos用量，单位M</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosBucketStorageSize(Long CosBucketStorageSize) {
        this.CosBucketStorageSize = CosBucketStorageSize;
    }

    /**
     * Get <p>读写分离模式：0-不开启，1-本地读写分离，2-远端读写分离</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReadWriteMode <p>读写分离模式：0-不开启，1-本地读写分离，2-远端读写分离</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReadWriteMode() {
        return this.ReadWriteMode;
    }

    /**
     * Set <p>读写分离模式：0-不开启，1-本地读写分离，2-远端读写分离</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReadWriteMode <p>读写分离模式：0-不开启，1-本地读写分离，2-远端读写分离</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReadWriteMode(Long ReadWriteMode) {
        this.ReadWriteMode = ReadWriteMode;
    }

    /**
     * Get <p>是否有置放群组异步调度任务</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableScheduleRecoverGroup <p>是否有置放群组异步调度任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableScheduleRecoverGroup() {
        return this.EnableScheduleRecoverGroup;
    }

    /**
     * Set <p>是否有置放群组异步调度任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableScheduleRecoverGroup <p>是否有置放群组异步调度任务</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableScheduleRecoverGroup(Boolean EnableScheduleRecoverGroup) {
        this.EnableScheduleRecoverGroup = EnableScheduleRecoverGroup;
    }

    /**
     * Get <p>异步调度任务的时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableScheduleOperationDuration <p>异步调度任务的时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EnableScheduleOperationDuration getEnableScheduleOperationDuration() {
        return this.EnableScheduleOperationDuration;
    }

    /**
     * Set <p>异步调度任务的时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableScheduleOperationDuration <p>异步调度任务的时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableScheduleOperationDuration(EnableScheduleOperationDuration EnableScheduleOperationDuration) {
        this.EnableScheduleOperationDuration = EnableScheduleOperationDuration;
    }

    /**
     * Get <p>开启集群保护：OPEN-开启，CLOSE-关闭</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableDestroyProtection <p>开启集群保护：OPEN-开启，CLOSE-关闭</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnableDestroyProtection() {
        return this.EnableDestroyProtection;
    }

    /**
     * Set <p>开启集群保护：OPEN-开启，CLOSE-关闭</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableDestroyProtection <p>开启集群保护：OPEN-开启，CLOSE-关闭</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableDestroyProtection(String EnableDestroyProtection) {
        this.EnableDestroyProtection = EnableDestroyProtection;
    }

    /**
     * Get <p>kibana内网访问地址</p> 
     * @return ShowKibanaIpPort <p>kibana内网访问地址</p>
     */
    public String getShowKibanaIpPort() {
        return this.ShowKibanaIpPort;
    }

    /**
     * Set <p>kibana内网访问地址</p>
     * @param ShowKibanaIpPort <p>kibana内网访问地址</p>
     */
    public void setShowKibanaIpPort(String ShowKibanaIpPort) {
        this.ShowKibanaIpPort = ShowKibanaIpPort;
    }

    /**
     * Get <p>是否为CDZLite可用区</p> 
     * @return IsCdzLite <p>是否为CDZLite可用区</p>
     */
    public Boolean getIsCdzLite() {
        return this.IsCdzLite;
    }

    /**
     * Set <p>是否为CDZLite可用区</p>
     * @param IsCdzLite <p>是否为CDZLite可用区</p>
     */
    public void setIsCdzLite(Boolean IsCdzLite) {
        this.IsCdzLite = IsCdzLite;
    }

    /**
     * Get <p>集群内网tcp地址</p> 
     * @return EsPrivateTcpUrl <p>集群内网tcp地址</p>
     */
    public String getEsPrivateTcpUrl() {
        return this.EsPrivateTcpUrl;
    }

    /**
     * Set <p>集群内网tcp地址</p>
     * @param EsPrivateTcpUrl <p>集群内网tcp地址</p>
     */
    public void setEsPrivateTcpUrl(String EsPrivateTcpUrl) {
        this.EsPrivateTcpUrl = EsPrivateTcpUrl;
    }

    /**
     * Get <p>是否在回收站内</p><p>默认值：false</p> 
     * @return IsInRecycleBin <p>是否在回收站内</p><p>默认值：false</p>
     */
    public Boolean getIsInRecycleBin() {
        return this.IsInRecycleBin;
    }

    /**
     * Set <p>是否在回收站内</p><p>默认值：false</p>
     * @param IsInRecycleBin <p>是否在回收站内</p><p>默认值：false</p>
     */
    public void setIsInRecycleBin(Boolean IsInRecycleBin) {
        this.IsInRecycleBin = IsInRecycleBin;
    }

    /**
     * Get <p>回收站内是否锁定</p><p>默认值：false</p> 
     * @return RecycleLockEnabled <p>回收站内是否锁定</p><p>默认值：false</p>
     */
    public Boolean getRecycleLockEnabled() {
        return this.RecycleLockEnabled;
    }

    /**
     * Set <p>回收站内是否锁定</p><p>默认值：false</p>
     * @param RecycleLockEnabled <p>回收站内是否锁定</p><p>默认值：false</p>
     */
    public void setRecycleLockEnabled(Boolean RecycleLockEnabled) {
        this.RecycleLockEnabled = RecycleLockEnabled;
    }

    /**
     * Get <p>预计销毁的时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p> 
     * @return MayDestroyPoint <p>预计销毁的时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public String getMayDestroyPoint() {
        return this.MayDestroyPoint;
    }

    /**
     * Set <p>预计销毁的时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     * @param MayDestroyPoint <p>预计销毁的时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public void setMayDestroyPoint(String MayDestroyPoint) {
        this.MayDestroyPoint = MayDestroyPoint;
    }

    /**
     * Get <p>延迟销毁的时间</p><p>单位：天</p> 
     * @return DelayDestroyInterval <p>延迟销毁的时间</p><p>单位：天</p>
     */
    public Long getDelayDestroyInterval() {
        return this.DelayDestroyInterval;
    }

    /**
     * Set <p>延迟销毁的时间</p><p>单位：天</p>
     * @param DelayDestroyInterval <p>延迟销毁的时间</p><p>单位：天</p>
     */
    public void setDelayDestroyInterval(Long DelayDestroyInterval) {
        this.DelayDestroyInterval = DelayDestroyInterval;
    }

    /**
     * Get <p>开启异常节点自动替换，0关闭，1开启</p> 
     * @return EnableAutoReplace <p>开启异常节点自动替换，0关闭，1开启</p>
     */
    public Long getEnableAutoReplace() {
        return this.EnableAutoReplace;
    }

    /**
     * Set <p>开启异常节点自动替换，0关闭，1开启</p>
     * @param EnableAutoReplace <p>开启异常节点自动替换，0关闭，1开启</p>
     */
    public void setEnableAutoReplace(Long EnableAutoReplace) {
        this.EnableAutoReplace = EnableAutoReplace;
    }

    /**
     * Get <p>开启mtls，0关闭，1开启</p> 
     * @return OpenMTLS <p>开启mtls，0关闭，1开启</p>
     */
    public Long getOpenMTLS() {
        return this.OpenMTLS;
    }

    /**
     * Set <p>开启mtls，0关闭，1开启</p>
     * @param OpenMTLS <p>开启mtls，0关闭，1开启</p>
     */
    public void setOpenMTLS(Long OpenMTLS) {
        this.OpenMTLS = OpenMTLS;
    }

    /**
     * Get <p>证书类型</p> 
     * @return ServerCertSource <p>证书类型</p>
     */
    public String getServerCertSource() {
        return this.ServerCertSource;
    }

    /**
     * Set <p>证书类型</p>
     * @param ServerCertSource <p>证书类型</p>
     */
    public void setServerCertSource(String ServerCertSource) {
        this.ServerCertSource = ServerCertSource;
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
        if (source.RealLicenseType != null) {
            this.RealLicenseType = new String(source.RealLicenseType);
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
        if (source.EsConfigSets != null) {
            this.EsConfigSets = new EsConfigSetInfo[source.EsConfigSets.length];
            for (int i = 0; i < source.EsConfigSets.length; i++) {
                this.EsConfigSets[i] = new EsConfigSetInfo(source.EsConfigSets[i]);
            }
        }
        if (source.OperationDuration != null) {
            this.OperationDuration = new OperationDuration(source.OperationDuration);
        }
        if (source.OptionalWebServiceInfos != null) {
            this.OptionalWebServiceInfos = new OptionalWebServiceInfo[source.OptionalWebServiceInfos.length];
            for (int i = 0; i < source.OptionalWebServiceInfos.length; i++) {
                this.OptionalWebServiceInfos[i] = new OptionalWebServiceInfo(source.OptionalWebServiceInfos[i]);
            }
        }
        if (source.AutoIndexEnabled != null) {
            this.AutoIndexEnabled = new Boolean(source.AutoIndexEnabled);
        }
        if (source.EnableHybridStorage != null) {
            this.EnableHybridStorage = new Boolean(source.EnableHybridStorage);
        }
        if (source.ProcessPercent != null) {
            this.ProcessPercent = new Float(source.ProcessPercent);
        }
        if (source.KibanaAlteringPublicAccess != null) {
            this.KibanaAlteringPublicAccess = new String(source.KibanaAlteringPublicAccess);
        }
        if (source.HasKernelUpgrade != null) {
            this.HasKernelUpgrade = new Boolean(source.HasKernelUpgrade);
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
        if (source.KibanaPrivateVip != null) {
            this.KibanaPrivateVip = new String(source.KibanaPrivateVip);
        }
        if (source.CustomKibanaPrivateUrl != null) {
            this.CustomKibanaPrivateUrl = new String(source.CustomKibanaPrivateUrl);
        }
        if (source.OutboundPublicAcls != null) {
            this.OutboundPublicAcls = new OutboundPublicAcl[source.OutboundPublicAcls.length];
            for (int i = 0; i < source.OutboundPublicAcls.length; i++) {
                this.OutboundPublicAcls[i] = new OutboundPublicAcl(source.OutboundPublicAcls[i]);
            }
        }
        if (source.NetConnectScheme != null) {
            this.NetConnectScheme = new String(source.NetConnectScheme);
        }
        if (source.DisasterRecoverGroupAffinity != null) {
            this.DisasterRecoverGroupAffinity = new Long(source.DisasterRecoverGroupAffinity);
        }
        if (source.SubProductCode != null) {
            this.SubProductCode = new String(source.SubProductCode);
        }
        if (source.CosBucketStorageSize != null) {
            this.CosBucketStorageSize = new Long(source.CosBucketStorageSize);
        }
        if (source.ReadWriteMode != null) {
            this.ReadWriteMode = new Long(source.ReadWriteMode);
        }
        if (source.EnableScheduleRecoverGroup != null) {
            this.EnableScheduleRecoverGroup = new Boolean(source.EnableScheduleRecoverGroup);
        }
        if (source.EnableScheduleOperationDuration != null) {
            this.EnableScheduleOperationDuration = new EnableScheduleOperationDuration(source.EnableScheduleOperationDuration);
        }
        if (source.EnableDestroyProtection != null) {
            this.EnableDestroyProtection = new String(source.EnableDestroyProtection);
        }
        if (source.ShowKibanaIpPort != null) {
            this.ShowKibanaIpPort = new String(source.ShowKibanaIpPort);
        }
        if (source.IsCdzLite != null) {
            this.IsCdzLite = new Boolean(source.IsCdzLite);
        }
        if (source.EsPrivateTcpUrl != null) {
            this.EsPrivateTcpUrl = new String(source.EsPrivateTcpUrl);
        }
        if (source.IsInRecycleBin != null) {
            this.IsInRecycleBin = new Boolean(source.IsInRecycleBin);
        }
        if (source.RecycleLockEnabled != null) {
            this.RecycleLockEnabled = new Boolean(source.RecycleLockEnabled);
        }
        if (source.MayDestroyPoint != null) {
            this.MayDestroyPoint = new String(source.MayDestroyPoint);
        }
        if (source.DelayDestroyInterval != null) {
            this.DelayDestroyInterval = new Long(source.DelayDestroyInterval);
        }
        if (source.EnableAutoReplace != null) {
            this.EnableAutoReplace = new Long(source.EnableAutoReplace);
        }
        if (source.OpenMTLS != null) {
            this.OpenMTLS = new Long(source.OpenMTLS);
        }
        if (source.ServerCertSource != null) {
            this.ServerCertSource = new String(source.ServerCertSource);
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
        this.setParamSimple(map, prefix + "RealLicenseType", this.RealLicenseType);
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
        this.setParamArrayObj(map, prefix + "EsConfigSets.", this.EsConfigSets);
        this.setParamObj(map, prefix + "OperationDuration.", this.OperationDuration);
        this.setParamArrayObj(map, prefix + "OptionalWebServiceInfos.", this.OptionalWebServiceInfos);
        this.setParamSimple(map, prefix + "AutoIndexEnabled", this.AutoIndexEnabled);
        this.setParamSimple(map, prefix + "EnableHybridStorage", this.EnableHybridStorage);
        this.setParamSimple(map, prefix + "ProcessPercent", this.ProcessPercent);
        this.setParamSimple(map, prefix + "KibanaAlteringPublicAccess", this.KibanaAlteringPublicAccess);
        this.setParamSimple(map, prefix + "HasKernelUpgrade", this.HasKernelUpgrade);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);
        this.setParamSimple(map, prefix + "KibanaPrivateVip", this.KibanaPrivateVip);
        this.setParamSimple(map, prefix + "CustomKibanaPrivateUrl", this.CustomKibanaPrivateUrl);
        this.setParamArrayObj(map, prefix + "OutboundPublicAcls.", this.OutboundPublicAcls);
        this.setParamSimple(map, prefix + "NetConnectScheme", this.NetConnectScheme);
        this.setParamSimple(map, prefix + "DisasterRecoverGroupAffinity", this.DisasterRecoverGroupAffinity);
        this.setParamSimple(map, prefix + "SubProductCode", this.SubProductCode);
        this.setParamSimple(map, prefix + "CosBucketStorageSize", this.CosBucketStorageSize);
        this.setParamSimple(map, prefix + "ReadWriteMode", this.ReadWriteMode);
        this.setParamSimple(map, prefix + "EnableScheduleRecoverGroup", this.EnableScheduleRecoverGroup);
        this.setParamObj(map, prefix + "EnableScheduleOperationDuration.", this.EnableScheduleOperationDuration);
        this.setParamSimple(map, prefix + "EnableDestroyProtection", this.EnableDestroyProtection);
        this.setParamSimple(map, prefix + "ShowKibanaIpPort", this.ShowKibanaIpPort);
        this.setParamSimple(map, prefix + "IsCdzLite", this.IsCdzLite);
        this.setParamSimple(map, prefix + "EsPrivateTcpUrl", this.EsPrivateTcpUrl);
        this.setParamSimple(map, prefix + "IsInRecycleBin", this.IsInRecycleBin);
        this.setParamSimple(map, prefix + "RecycleLockEnabled", this.RecycleLockEnabled);
        this.setParamSimple(map, prefix + "MayDestroyPoint", this.MayDestroyPoint);
        this.setParamSimple(map, prefix + "DelayDestroyInterval", this.DelayDestroyInterval);
        this.setParamSimple(map, prefix + "EnableAutoReplace", this.EnableAutoReplace);
        this.setParamSimple(map, prefix + "OpenMTLS", this.OpenMTLS);
        this.setParamSimple(map, prefix + "ServerCertSource", this.ServerCertSource);

    }
}

