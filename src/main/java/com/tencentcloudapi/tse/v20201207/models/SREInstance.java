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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SREInstance extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>版本号</p>
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * <p>状态, 枚举值:creating/create_fail/running/updating/update_fail/restarting/restart_fail/destroying/destroy_fail</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>规格ID</p>
    */
    @SerializedName("SpecId")
    @Expose
    private String SpecId;

    /**
    * <p>副本数</p>
    */
    @SerializedName("Replica")
    @Expose
    private Long Replica;

    /**
    * <p>类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Vpc iD</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网ID</p>
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * <p>是否开启持久化存储</p>
    */
    @SerializedName("EnableStorage")
    @Expose
    private Boolean EnableStorage;

    /**
    * <p>数据存储方式</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>云硬盘容量</p>
    */
    @SerializedName("StorageCapacity")
    @Expose
    private Long StorageCapacity;

    /**
    * <p>计费方式</p>
    */
    @SerializedName("Paymode")
    @Expose
    private String Paymode;

    /**
    * <p>EKS集群的ID</p>
    */
    @SerializedName("EKSClusterID")
    @Expose
    private String EKSClusterID;

    /**
    * <p>集群创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>环境配置信息列表</p>
    */
    @SerializedName("EnvInfos")
    @Expose
    private EnvInfo [] EnvInfos;

    /**
    * <p>引擎所在的区域</p>
    */
    @SerializedName("EngineRegion")
    @Expose
    private String EngineRegion;

    /**
    * <p>注册引擎是否开启公网</p>
    */
    @SerializedName("EnableInternet")
    @Expose
    private Boolean EnableInternet;

    /**
    * <p>私有网络列表信息</p>
    */
    @SerializedName("VpcInfos")
    @Expose
    private VpcInfo [] VpcInfos;

    /**
    * <p>服务治理相关信息列表</p>
    */
    @SerializedName("ServiceGovernanceInfos")
    @Expose
    private ServiceGovernanceInfo [] ServiceGovernanceInfos;

    /**
    * <p>实例的标签信息</p>
    */
    @SerializedName("Tags")
    @Expose
    private KVPair [] Tags;

    /**
    * <p>引擎实例是否开启控制台公网访问地址</p>
    */
    @SerializedName("EnableConsoleInternet")
    @Expose
    private Boolean EnableConsoleInternet;

    /**
    * <p>引擎实例是否开启控制台内网访问地址</p>
    */
    @SerializedName("EnableConsoleIntranet")
    @Expose
    private Boolean EnableConsoleIntranet;

    /**
    * <p>引擎实例是否展示参数配置页面</p>
    */
    @SerializedName("ConfigInfoVisible")
    @Expose
    private Boolean ConfigInfoVisible;

    /**
    * <p>引擎实例控制台默认密码</p>
    */
    @SerializedName("ConsoleDefaultPwd")
    @Expose
    private String ConsoleDefaultPwd;

    /**
    * <p>交易付费类型，0后付费/1预付费</p>
    */
    @SerializedName("TradeType")
    @Expose
    private Long TradeType;

    /**
    * <p>自动续费标记：0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费</p>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>预付费到期时间</p>
    */
    @SerializedName("CurDeadline")
    @Expose
    private String CurDeadline;

    /**
    * <p>隔离开始时间</p>
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * <p>实例地域相关的描述信息</p>
    */
    @SerializedName("RegionInfos")
    @Expose
    private DescribeInstanceRegionInfo [] RegionInfos;

    /**
    * <p>所在EKS环境，分为common和yunti</p>
    */
    @SerializedName("EKSType")
    @Expose
    private String EKSType;

    /**
    * <p>引擎的产品版本</p>
    */
    @SerializedName("FeatureVersion")
    @Expose
    private String FeatureVersion;

    /**
    * <p>引擎实例是否开启客户端内网访问地址</p>
    */
    @SerializedName("EnableClientIntranet")
    @Expose
    private Boolean EnableClientIntranet;

    /**
    * <p>存储额外配置选项</p>
    */
    @SerializedName("StorageOption")
    @Expose
    private StorageOption [] StorageOption;

    /**
    * <p>Zookeeper的额外环境数据信息</p>
    */
    @SerializedName("ZookeeperRegionInfo")
    @Expose
    private ZookeeperRegionInfo ZookeeperRegionInfo;

    /**
    * <p>部署架构</p>
    */
    @SerializedName("DeployMode")
    @Expose
    private String DeployMode;

    /**
    * <p>全局属性</p>
    */
    @SerializedName("GlobalType")
    @Expose
    private String GlobalType;

    /**
    * <p>所属组类型</p>
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * <p>组id</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String [] GroupId;

    /**
    * <p>是否为主地域</p>
    */
    @SerializedName("IsMainRegion")
    @Expose
    private Boolean IsMainRegion;

    /**
    * <p>是否禁止变更</p>
    */
    @SerializedName("MutationEnabled")
    @Expose
    private Boolean MutationEnabled;

    /**
    * <p>禁止限流</p>
    */
    @SerializedName("MaxCapacityLimitEnabled")
    @Expose
    private Boolean MaxCapacityLimitEnabled;

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
     * Get <p>名称</p> 
     * @return Name <p>名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名称</p>
     * @param Name <p>名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>版本号</p> 
     * @return Edition <p>版本号</p>
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set <p>版本号</p>
     * @param Edition <p>版本号</p>
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get <p>状态, 枚举值:creating/create_fail/running/updating/update_fail/restarting/restart_fail/destroying/destroy_fail</p> 
     * @return Status <p>状态, 枚举值:creating/create_fail/running/updating/update_fail/restarting/restart_fail/destroying/destroy_fail</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态, 枚举值:creating/create_fail/running/updating/update_fail/restarting/restart_fail/destroying/destroy_fail</p>
     * @param Status <p>状态, 枚举值:creating/create_fail/running/updating/update_fail/restarting/restart_fail/destroying/destroy_fail</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>规格ID</p> 
     * @return SpecId <p>规格ID</p>
     */
    public String getSpecId() {
        return this.SpecId;
    }

    /**
     * Set <p>规格ID</p>
     * @param SpecId <p>规格ID</p>
     */
    public void setSpecId(String SpecId) {
        this.SpecId = SpecId;
    }

    /**
     * Get <p>副本数</p> 
     * @return Replica <p>副本数</p>
     */
    public Long getReplica() {
        return this.Replica;
    }

    /**
     * Set <p>副本数</p>
     * @param Replica <p>副本数</p>
     */
    public void setReplica(Long Replica) {
        this.Replica = Replica;
    }

    /**
     * Get <p>类型</p> 
     * @return Type <p>类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>类型</p>
     * @param Type <p>类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Vpc iD</p> 
     * @return VpcId <p>Vpc iD</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>Vpc iD</p>
     * @param VpcId <p>Vpc iD</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网ID</p> 
     * @return SubnetIds <p>子网ID</p>
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set <p>子网ID</p>
     * @param SubnetIds <p>子网ID</p>
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get <p>是否开启持久化存储</p> 
     * @return EnableStorage <p>是否开启持久化存储</p>
     */
    public Boolean getEnableStorage() {
        return this.EnableStorage;
    }

    /**
     * Set <p>是否开启持久化存储</p>
     * @param EnableStorage <p>是否开启持久化存储</p>
     */
    public void setEnableStorage(Boolean EnableStorage) {
        this.EnableStorage = EnableStorage;
    }

    /**
     * Get <p>数据存储方式</p> 
     * @return StorageType <p>数据存储方式</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>数据存储方式</p>
     * @param StorageType <p>数据存储方式</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>云硬盘容量</p> 
     * @return StorageCapacity <p>云硬盘容量</p>
     */
    public Long getStorageCapacity() {
        return this.StorageCapacity;
    }

    /**
     * Set <p>云硬盘容量</p>
     * @param StorageCapacity <p>云硬盘容量</p>
     */
    public void setStorageCapacity(Long StorageCapacity) {
        this.StorageCapacity = StorageCapacity;
    }

    /**
     * Get <p>计费方式</p> 
     * @return Paymode <p>计费方式</p>
     */
    public String getPaymode() {
        return this.Paymode;
    }

    /**
     * Set <p>计费方式</p>
     * @param Paymode <p>计费方式</p>
     */
    public void setPaymode(String Paymode) {
        this.Paymode = Paymode;
    }

    /**
     * Get <p>EKS集群的ID</p> 
     * @return EKSClusterID <p>EKS集群的ID</p>
     */
    public String getEKSClusterID() {
        return this.EKSClusterID;
    }

    /**
     * Set <p>EKS集群的ID</p>
     * @param EKSClusterID <p>EKS集群的ID</p>
     */
    public void setEKSClusterID(String EKSClusterID) {
        this.EKSClusterID = EKSClusterID;
    }

    /**
     * Get <p>集群创建时间</p> 
     * @return CreateTime <p>集群创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>集群创建时间</p>
     * @param CreateTime <p>集群创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>环境配置信息列表</p> 
     * @return EnvInfos <p>环境配置信息列表</p>
     */
    public EnvInfo [] getEnvInfos() {
        return this.EnvInfos;
    }

    /**
     * Set <p>环境配置信息列表</p>
     * @param EnvInfos <p>环境配置信息列表</p>
     */
    public void setEnvInfos(EnvInfo [] EnvInfos) {
        this.EnvInfos = EnvInfos;
    }

    /**
     * Get <p>引擎所在的区域</p> 
     * @return EngineRegion <p>引擎所在的区域</p>
     */
    public String getEngineRegion() {
        return this.EngineRegion;
    }

    /**
     * Set <p>引擎所在的区域</p>
     * @param EngineRegion <p>引擎所在的区域</p>
     */
    public void setEngineRegion(String EngineRegion) {
        this.EngineRegion = EngineRegion;
    }

    /**
     * Get <p>注册引擎是否开启公网</p> 
     * @return EnableInternet <p>注册引擎是否开启公网</p>
     */
    public Boolean getEnableInternet() {
        return this.EnableInternet;
    }

    /**
     * Set <p>注册引擎是否开启公网</p>
     * @param EnableInternet <p>注册引擎是否开启公网</p>
     */
    public void setEnableInternet(Boolean EnableInternet) {
        this.EnableInternet = EnableInternet;
    }

    /**
     * Get <p>私有网络列表信息</p> 
     * @return VpcInfos <p>私有网络列表信息</p>
     */
    public VpcInfo [] getVpcInfos() {
        return this.VpcInfos;
    }

    /**
     * Set <p>私有网络列表信息</p>
     * @param VpcInfos <p>私有网络列表信息</p>
     */
    public void setVpcInfos(VpcInfo [] VpcInfos) {
        this.VpcInfos = VpcInfos;
    }

    /**
     * Get <p>服务治理相关信息列表</p> 
     * @return ServiceGovernanceInfos <p>服务治理相关信息列表</p>
     */
    public ServiceGovernanceInfo [] getServiceGovernanceInfos() {
        return this.ServiceGovernanceInfos;
    }

    /**
     * Set <p>服务治理相关信息列表</p>
     * @param ServiceGovernanceInfos <p>服务治理相关信息列表</p>
     */
    public void setServiceGovernanceInfos(ServiceGovernanceInfo [] ServiceGovernanceInfos) {
        this.ServiceGovernanceInfos = ServiceGovernanceInfos;
    }

    /**
     * Get <p>实例的标签信息</p> 
     * @return Tags <p>实例的标签信息</p>
     */
    public KVPair [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>实例的标签信息</p>
     * @param Tags <p>实例的标签信息</p>
     */
    public void setTags(KVPair [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>引擎实例是否开启控制台公网访问地址</p> 
     * @return EnableConsoleInternet <p>引擎实例是否开启控制台公网访问地址</p>
     */
    public Boolean getEnableConsoleInternet() {
        return this.EnableConsoleInternet;
    }

    /**
     * Set <p>引擎实例是否开启控制台公网访问地址</p>
     * @param EnableConsoleInternet <p>引擎实例是否开启控制台公网访问地址</p>
     */
    public void setEnableConsoleInternet(Boolean EnableConsoleInternet) {
        this.EnableConsoleInternet = EnableConsoleInternet;
    }

    /**
     * Get <p>引擎实例是否开启控制台内网访问地址</p> 
     * @return EnableConsoleIntranet <p>引擎实例是否开启控制台内网访问地址</p>
     */
    public Boolean getEnableConsoleIntranet() {
        return this.EnableConsoleIntranet;
    }

    /**
     * Set <p>引擎实例是否开启控制台内网访问地址</p>
     * @param EnableConsoleIntranet <p>引擎实例是否开启控制台内网访问地址</p>
     */
    public void setEnableConsoleIntranet(Boolean EnableConsoleIntranet) {
        this.EnableConsoleIntranet = EnableConsoleIntranet;
    }

    /**
     * Get <p>引擎实例是否展示参数配置页面</p> 
     * @return ConfigInfoVisible <p>引擎实例是否展示参数配置页面</p>
     */
    public Boolean getConfigInfoVisible() {
        return this.ConfigInfoVisible;
    }

    /**
     * Set <p>引擎实例是否展示参数配置页面</p>
     * @param ConfigInfoVisible <p>引擎实例是否展示参数配置页面</p>
     */
    public void setConfigInfoVisible(Boolean ConfigInfoVisible) {
        this.ConfigInfoVisible = ConfigInfoVisible;
    }

    /**
     * Get <p>引擎实例控制台默认密码</p> 
     * @return ConsoleDefaultPwd <p>引擎实例控制台默认密码</p>
     */
    public String getConsoleDefaultPwd() {
        return this.ConsoleDefaultPwd;
    }

    /**
     * Set <p>引擎实例控制台默认密码</p>
     * @param ConsoleDefaultPwd <p>引擎实例控制台默认密码</p>
     */
    public void setConsoleDefaultPwd(String ConsoleDefaultPwd) {
        this.ConsoleDefaultPwd = ConsoleDefaultPwd;
    }

    /**
     * Get <p>交易付费类型，0后付费/1预付费</p> 
     * @return TradeType <p>交易付费类型，0后付费/1预付费</p>
     */
    public Long getTradeType() {
        return this.TradeType;
    }

    /**
     * Set <p>交易付费类型，0后付费/1预付费</p>
     * @param TradeType <p>交易付费类型，0后付费/1预付费</p>
     */
    public void setTradeType(Long TradeType) {
        this.TradeType = TradeType;
    }

    /**
     * Get <p>自动续费标记：0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费</p> 
     * @return AutoRenewFlag <p>自动续费标记：0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费</p>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>自动续费标记：0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费</p>
     * @param AutoRenewFlag <p>自动续费标记：0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费</p>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>预付费到期时间</p> 
     * @return CurDeadline <p>预付费到期时间</p>
     */
    public String getCurDeadline() {
        return this.CurDeadline;
    }

    /**
     * Set <p>预付费到期时间</p>
     * @param CurDeadline <p>预付费到期时间</p>
     */
    public void setCurDeadline(String CurDeadline) {
        this.CurDeadline = CurDeadline;
    }

    /**
     * Get <p>隔离开始时间</p> 
     * @return IsolateTime <p>隔离开始时间</p>
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set <p>隔离开始时间</p>
     * @param IsolateTime <p>隔离开始时间</p>
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get <p>实例地域相关的描述信息</p> 
     * @return RegionInfos <p>实例地域相关的描述信息</p>
     */
    public DescribeInstanceRegionInfo [] getRegionInfos() {
        return this.RegionInfos;
    }

    /**
     * Set <p>实例地域相关的描述信息</p>
     * @param RegionInfos <p>实例地域相关的描述信息</p>
     */
    public void setRegionInfos(DescribeInstanceRegionInfo [] RegionInfos) {
        this.RegionInfos = RegionInfos;
    }

    /**
     * Get <p>所在EKS环境，分为common和yunti</p> 
     * @return EKSType <p>所在EKS环境，分为common和yunti</p>
     */
    public String getEKSType() {
        return this.EKSType;
    }

    /**
     * Set <p>所在EKS环境，分为common和yunti</p>
     * @param EKSType <p>所在EKS环境，分为common和yunti</p>
     */
    public void setEKSType(String EKSType) {
        this.EKSType = EKSType;
    }

    /**
     * Get <p>引擎的产品版本</p> 
     * @return FeatureVersion <p>引擎的产品版本</p>
     */
    public String getFeatureVersion() {
        return this.FeatureVersion;
    }

    /**
     * Set <p>引擎的产品版本</p>
     * @param FeatureVersion <p>引擎的产品版本</p>
     */
    public void setFeatureVersion(String FeatureVersion) {
        this.FeatureVersion = FeatureVersion;
    }

    /**
     * Get <p>引擎实例是否开启客户端内网访问地址</p> 
     * @return EnableClientIntranet <p>引擎实例是否开启客户端内网访问地址</p>
     */
    public Boolean getEnableClientIntranet() {
        return this.EnableClientIntranet;
    }

    /**
     * Set <p>引擎实例是否开启客户端内网访问地址</p>
     * @param EnableClientIntranet <p>引擎实例是否开启客户端内网访问地址</p>
     */
    public void setEnableClientIntranet(Boolean EnableClientIntranet) {
        this.EnableClientIntranet = EnableClientIntranet;
    }

    /**
     * Get <p>存储额外配置选项</p> 
     * @return StorageOption <p>存储额外配置选项</p>
     */
    public StorageOption [] getStorageOption() {
        return this.StorageOption;
    }

    /**
     * Set <p>存储额外配置选项</p>
     * @param StorageOption <p>存储额外配置选项</p>
     */
    public void setStorageOption(StorageOption [] StorageOption) {
        this.StorageOption = StorageOption;
    }

    /**
     * Get <p>Zookeeper的额外环境数据信息</p> 
     * @return ZookeeperRegionInfo <p>Zookeeper的额外环境数据信息</p>
     */
    public ZookeeperRegionInfo getZookeeperRegionInfo() {
        return this.ZookeeperRegionInfo;
    }

    /**
     * Set <p>Zookeeper的额外环境数据信息</p>
     * @param ZookeeperRegionInfo <p>Zookeeper的额外环境数据信息</p>
     */
    public void setZookeeperRegionInfo(ZookeeperRegionInfo ZookeeperRegionInfo) {
        this.ZookeeperRegionInfo = ZookeeperRegionInfo;
    }

    /**
     * Get <p>部署架构</p> 
     * @return DeployMode <p>部署架构</p>
     */
    public String getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set <p>部署架构</p>
     * @param DeployMode <p>部署架构</p>
     */
    public void setDeployMode(String DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get <p>全局属性</p> 
     * @return GlobalType <p>全局属性</p>
     */
    public String getGlobalType() {
        return this.GlobalType;
    }

    /**
     * Set <p>全局属性</p>
     * @param GlobalType <p>全局属性</p>
     */
    public void setGlobalType(String GlobalType) {
        this.GlobalType = GlobalType;
    }

    /**
     * Get <p>所属组类型</p> 
     * @return GroupType <p>所属组类型</p>
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set <p>所属组类型</p>
     * @param GroupType <p>所属组类型</p>
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get <p>组id</p> 
     * @return GroupId <p>组id</p>
     */
    public String [] getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>组id</p>
     * @param GroupId <p>组id</p>
     */
    public void setGroupId(String [] GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>是否为主地域</p> 
     * @return IsMainRegion <p>是否为主地域</p>
     */
    public Boolean getIsMainRegion() {
        return this.IsMainRegion;
    }

    /**
     * Set <p>是否为主地域</p>
     * @param IsMainRegion <p>是否为主地域</p>
     */
    public void setIsMainRegion(Boolean IsMainRegion) {
        this.IsMainRegion = IsMainRegion;
    }

    /**
     * Get <p>是否禁止变更</p> 
     * @return MutationEnabled <p>是否禁止变更</p>
     */
    public Boolean getMutationEnabled() {
        return this.MutationEnabled;
    }

    /**
     * Set <p>是否禁止变更</p>
     * @param MutationEnabled <p>是否禁止变更</p>
     */
    public void setMutationEnabled(Boolean MutationEnabled) {
        this.MutationEnabled = MutationEnabled;
    }

    /**
     * Get <p>禁止限流</p> 
     * @return MaxCapacityLimitEnabled <p>禁止限流</p>
     */
    public Boolean getMaxCapacityLimitEnabled() {
        return this.MaxCapacityLimitEnabled;
    }

    /**
     * Set <p>禁止限流</p>
     * @param MaxCapacityLimitEnabled <p>禁止限流</p>
     */
    public void setMaxCapacityLimitEnabled(Boolean MaxCapacityLimitEnabled) {
        this.MaxCapacityLimitEnabled = MaxCapacityLimitEnabled;
    }

    public SREInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SREInstance(SREInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SpecId != null) {
            this.SpecId = new String(source.SpecId);
        }
        if (source.Replica != null) {
            this.Replica = new Long(source.Replica);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.EnableStorage != null) {
            this.EnableStorage = new Boolean(source.EnableStorage);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.StorageCapacity != null) {
            this.StorageCapacity = new Long(source.StorageCapacity);
        }
        if (source.Paymode != null) {
            this.Paymode = new String(source.Paymode);
        }
        if (source.EKSClusterID != null) {
            this.EKSClusterID = new String(source.EKSClusterID);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.EnvInfos != null) {
            this.EnvInfos = new EnvInfo[source.EnvInfos.length];
            for (int i = 0; i < source.EnvInfos.length; i++) {
                this.EnvInfos[i] = new EnvInfo(source.EnvInfos[i]);
            }
        }
        if (source.EngineRegion != null) {
            this.EngineRegion = new String(source.EngineRegion);
        }
        if (source.EnableInternet != null) {
            this.EnableInternet = new Boolean(source.EnableInternet);
        }
        if (source.VpcInfos != null) {
            this.VpcInfos = new VpcInfo[source.VpcInfos.length];
            for (int i = 0; i < source.VpcInfos.length; i++) {
                this.VpcInfos[i] = new VpcInfo(source.VpcInfos[i]);
            }
        }
        if (source.ServiceGovernanceInfos != null) {
            this.ServiceGovernanceInfos = new ServiceGovernanceInfo[source.ServiceGovernanceInfos.length];
            for (int i = 0; i < source.ServiceGovernanceInfos.length; i++) {
                this.ServiceGovernanceInfos[i] = new ServiceGovernanceInfo(source.ServiceGovernanceInfos[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new KVPair[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new KVPair(source.Tags[i]);
            }
        }
        if (source.EnableConsoleInternet != null) {
            this.EnableConsoleInternet = new Boolean(source.EnableConsoleInternet);
        }
        if (source.EnableConsoleIntranet != null) {
            this.EnableConsoleIntranet = new Boolean(source.EnableConsoleIntranet);
        }
        if (source.ConfigInfoVisible != null) {
            this.ConfigInfoVisible = new Boolean(source.ConfigInfoVisible);
        }
        if (source.ConsoleDefaultPwd != null) {
            this.ConsoleDefaultPwd = new String(source.ConsoleDefaultPwd);
        }
        if (source.TradeType != null) {
            this.TradeType = new Long(source.TradeType);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.CurDeadline != null) {
            this.CurDeadline = new String(source.CurDeadline);
        }
        if (source.IsolateTime != null) {
            this.IsolateTime = new String(source.IsolateTime);
        }
        if (source.RegionInfos != null) {
            this.RegionInfos = new DescribeInstanceRegionInfo[source.RegionInfos.length];
            for (int i = 0; i < source.RegionInfos.length; i++) {
                this.RegionInfos[i] = new DescribeInstanceRegionInfo(source.RegionInfos[i]);
            }
        }
        if (source.EKSType != null) {
            this.EKSType = new String(source.EKSType);
        }
        if (source.FeatureVersion != null) {
            this.FeatureVersion = new String(source.FeatureVersion);
        }
        if (source.EnableClientIntranet != null) {
            this.EnableClientIntranet = new Boolean(source.EnableClientIntranet);
        }
        if (source.StorageOption != null) {
            this.StorageOption = new StorageOption[source.StorageOption.length];
            for (int i = 0; i < source.StorageOption.length; i++) {
                this.StorageOption[i] = new StorageOption(source.StorageOption[i]);
            }
        }
        if (source.ZookeeperRegionInfo != null) {
            this.ZookeeperRegionInfo = new ZookeeperRegionInfo(source.ZookeeperRegionInfo);
        }
        if (source.DeployMode != null) {
            this.DeployMode = new String(source.DeployMode);
        }
        if (source.GlobalType != null) {
            this.GlobalType = new String(source.GlobalType);
        }
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
        if (source.GroupId != null) {
            this.GroupId = new String[source.GroupId.length];
            for (int i = 0; i < source.GroupId.length; i++) {
                this.GroupId[i] = new String(source.GroupId[i]);
            }
        }
        if (source.IsMainRegion != null) {
            this.IsMainRegion = new Boolean(source.IsMainRegion);
        }
        if (source.MutationEnabled != null) {
            this.MutationEnabled = new Boolean(source.MutationEnabled);
        }
        if (source.MaxCapacityLimitEnabled != null) {
            this.MaxCapacityLimitEnabled = new Boolean(source.MaxCapacityLimitEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SpecId", this.SpecId);
        this.setParamSimple(map, prefix + "Replica", this.Replica);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamSimple(map, prefix + "EnableStorage", this.EnableStorage);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "StorageCapacity", this.StorageCapacity);
        this.setParamSimple(map, prefix + "Paymode", this.Paymode);
        this.setParamSimple(map, prefix + "EKSClusterID", this.EKSClusterID);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "EnvInfos.", this.EnvInfos);
        this.setParamSimple(map, prefix + "EngineRegion", this.EngineRegion);
        this.setParamSimple(map, prefix + "EnableInternet", this.EnableInternet);
        this.setParamArrayObj(map, prefix + "VpcInfos.", this.VpcInfos);
        this.setParamArrayObj(map, prefix + "ServiceGovernanceInfos.", this.ServiceGovernanceInfos);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "EnableConsoleInternet", this.EnableConsoleInternet);
        this.setParamSimple(map, prefix + "EnableConsoleIntranet", this.EnableConsoleIntranet);
        this.setParamSimple(map, prefix + "ConfigInfoVisible", this.ConfigInfoVisible);
        this.setParamSimple(map, prefix + "ConsoleDefaultPwd", this.ConsoleDefaultPwd);
        this.setParamSimple(map, prefix + "TradeType", this.TradeType);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "CurDeadline", this.CurDeadline);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);
        this.setParamArrayObj(map, prefix + "RegionInfos.", this.RegionInfos);
        this.setParamSimple(map, prefix + "EKSType", this.EKSType);
        this.setParamSimple(map, prefix + "FeatureVersion", this.FeatureVersion);
        this.setParamSimple(map, prefix + "EnableClientIntranet", this.EnableClientIntranet);
        this.setParamArrayObj(map, prefix + "StorageOption.", this.StorageOption);
        this.setParamObj(map, prefix + "ZookeeperRegionInfo.", this.ZookeeperRegionInfo);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "GlobalType", this.GlobalType);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamArraySimple(map, prefix + "GroupId.", this.GroupId);
        this.setParamSimple(map, prefix + "IsMainRegion", this.IsMainRegion);
        this.setParamSimple(map, prefix + "MutationEnabled", this.MutationEnabled);
        this.setParamSimple(map, prefix + "MaxCapacityLimitEnabled", this.MaxCapacityLimitEnabled);

    }
}

