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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SREInstance extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 版本号
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * 状态, 枚举值:creating/create_fail/running/updating/update_fail/restarting/restart_fail/destroying/destroy_fail
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 规格ID
    */
    @SerializedName("SpecId")
    @Expose
    private String SpecId;

    /**
    * 副本数
    */
    @SerializedName("Replica")
    @Expose
    private Long Replica;

    /**
    * 类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Vpc iD
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * 是否开启持久化存储
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableStorage")
    @Expose
    private Boolean EnableStorage;

    /**
    * 数据存储方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 云硬盘容量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageCapacity")
    @Expose
    private Long StorageCapacity;

    /**
    * 计费方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Paymode")
    @Expose
    private String Paymode;

    /**
    * EKS集群的ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EKSClusterID")
    @Expose
    private String EKSClusterID;

    /**
    * 集群创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 环境配置信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvInfos")
    @Expose
    private EnvInfo [] EnvInfos;

    /**
    * 引擎所在的区域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineRegion")
    @Expose
    private String EngineRegion;

    /**
    * 注册引擎是否开启公网
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableInternet")
    @Expose
    private Boolean EnableInternet;

    /**
    * 私有网络列表信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcInfos")
    @Expose
    private VpcInfo [] VpcInfos;

    /**
    * 服务治理相关信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceGovernanceInfos")
    @Expose
    private ServiceGovernanceInfo [] ServiceGovernanceInfos;

    /**
    * 实例的标签信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private KVPair [] Tags;

    /**
    * 引擎实例是否开启控制台公网访问地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableConsoleInternet")
    @Expose
    private Boolean EnableConsoleInternet;

    /**
    * 引擎实例是否开启控制台内网访问地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableConsoleIntranet")
    @Expose
    private Boolean EnableConsoleIntranet;

    /**
    * 引擎实例是否展示参数配置页面
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigInfoVisible")
    @Expose
    private Boolean ConfigInfoVisible;

    /**
    * 引擎实例控制台默认密码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsoleDefaultPwd")
    @Expose
    private String ConsoleDefaultPwd;

    /**
    * 交易付费类型，0后付费/1预付费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TradeType")
    @Expose
    private Long TradeType;

    /**
    * 自动续费标记：0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 预付费到期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurDeadline")
    @Expose
    private String CurDeadline;

    /**
    * 隔离开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

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
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 版本号 
     * @return Edition 版本号
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set 版本号
     * @param Edition 版本号
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get 状态, 枚举值:creating/create_fail/running/updating/update_fail/restarting/restart_fail/destroying/destroy_fail 
     * @return Status 状态, 枚举值:creating/create_fail/running/updating/update_fail/restarting/restart_fail/destroying/destroy_fail
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态, 枚举值:creating/create_fail/running/updating/update_fail/restarting/restart_fail/destroying/destroy_fail
     * @param Status 状态, 枚举值:creating/create_fail/running/updating/update_fail/restarting/restart_fail/destroying/destroy_fail
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 规格ID 
     * @return SpecId 规格ID
     */
    public String getSpecId() {
        return this.SpecId;
    }

    /**
     * Set 规格ID
     * @param SpecId 规格ID
     */
    public void setSpecId(String SpecId) {
        this.SpecId = SpecId;
    }

    /**
     * Get 副本数 
     * @return Replica 副本数
     */
    public Long getReplica() {
        return this.Replica;
    }

    /**
     * Set 副本数
     * @param Replica 副本数
     */
    public void setReplica(Long Replica) {
        this.Replica = Replica;
    }

    /**
     * Get 类型 
     * @return Type 类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
     * @param Type 类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Vpc iD 
     * @return VpcId Vpc iD
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Vpc iD
     * @param VpcId Vpc iD
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetIds 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetIds 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get 是否开启持久化存储
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableStorage 是否开启持久化存储
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableStorage() {
        return this.EnableStorage;
    }

    /**
     * Set 是否开启持久化存储
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableStorage 是否开启持久化存储
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableStorage(Boolean EnableStorage) {
        this.EnableStorage = EnableStorage;
    }

    /**
     * Get 数据存储方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageType 数据存储方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 数据存储方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageType 数据存储方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 云硬盘容量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageCapacity 云硬盘容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStorageCapacity() {
        return this.StorageCapacity;
    }

    /**
     * Set 云硬盘容量
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageCapacity 云硬盘容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageCapacity(Long StorageCapacity) {
        this.StorageCapacity = StorageCapacity;
    }

    /**
     * Get 计费方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Paymode 计费方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymode() {
        return this.Paymode;
    }

    /**
     * Set 计费方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Paymode 计费方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymode(String Paymode) {
        this.Paymode = Paymode;
    }

    /**
     * Get EKS集群的ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EKSClusterID EKS集群的ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEKSClusterID() {
        return this.EKSClusterID;
    }

    /**
     * Set EKS集群的ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param EKSClusterID EKS集群的ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEKSClusterID(String EKSClusterID) {
        this.EKSClusterID = EKSClusterID;
    }

    /**
     * Get 集群创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 集群创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 集群创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 集群创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 环境配置信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvInfos 环境配置信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EnvInfo [] getEnvInfos() {
        return this.EnvInfos;
    }

    /**
     * Set 环境配置信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvInfos 环境配置信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvInfos(EnvInfo [] EnvInfos) {
        this.EnvInfos = EnvInfos;
    }

    /**
     * Get 引擎所在的区域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineRegion 引擎所在的区域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineRegion() {
        return this.EngineRegion;
    }

    /**
     * Set 引擎所在的区域
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineRegion 引擎所在的区域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineRegion(String EngineRegion) {
        this.EngineRegion = EngineRegion;
    }

    /**
     * Get 注册引擎是否开启公网
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableInternet 注册引擎是否开启公网
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableInternet() {
        return this.EnableInternet;
    }

    /**
     * Set 注册引擎是否开启公网
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableInternet 注册引擎是否开启公网
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableInternet(Boolean EnableInternet) {
        this.EnableInternet = EnableInternet;
    }

    /**
     * Get 私有网络列表信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcInfos 私有网络列表信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VpcInfo [] getVpcInfos() {
        return this.VpcInfos;
    }

    /**
     * Set 私有网络列表信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcInfos 私有网络列表信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcInfos(VpcInfo [] VpcInfos) {
        this.VpcInfos = VpcInfos;
    }

    /**
     * Get 服务治理相关信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceGovernanceInfos 服务治理相关信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServiceGovernanceInfo [] getServiceGovernanceInfos() {
        return this.ServiceGovernanceInfos;
    }

    /**
     * Set 服务治理相关信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceGovernanceInfos 服务治理相关信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceGovernanceInfos(ServiceGovernanceInfo [] ServiceGovernanceInfos) {
        this.ServiceGovernanceInfos = ServiceGovernanceInfos;
    }

    /**
     * Get 实例的标签信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 实例的标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KVPair [] getTags() {
        return this.Tags;
    }

    /**
     * Set 实例的标签信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 实例的标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(KVPair [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 引擎实例是否开启控制台公网访问地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableConsoleInternet 引擎实例是否开启控制台公网访问地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableConsoleInternet() {
        return this.EnableConsoleInternet;
    }

    /**
     * Set 引擎实例是否开启控制台公网访问地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableConsoleInternet 引擎实例是否开启控制台公网访问地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableConsoleInternet(Boolean EnableConsoleInternet) {
        this.EnableConsoleInternet = EnableConsoleInternet;
    }

    /**
     * Get 引擎实例是否开启控制台内网访问地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableConsoleIntranet 引擎实例是否开启控制台内网访问地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableConsoleIntranet() {
        return this.EnableConsoleIntranet;
    }

    /**
     * Set 引擎实例是否开启控制台内网访问地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableConsoleIntranet 引擎实例是否开启控制台内网访问地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableConsoleIntranet(Boolean EnableConsoleIntranet) {
        this.EnableConsoleIntranet = EnableConsoleIntranet;
    }

    /**
     * Get 引擎实例是否展示参数配置页面
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigInfoVisible 引擎实例是否展示参数配置页面
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getConfigInfoVisible() {
        return this.ConfigInfoVisible;
    }

    /**
     * Set 引擎实例是否展示参数配置页面
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigInfoVisible 引擎实例是否展示参数配置页面
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigInfoVisible(Boolean ConfigInfoVisible) {
        this.ConfigInfoVisible = ConfigInfoVisible;
    }

    /**
     * Get 引擎实例控制台默认密码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsoleDefaultPwd 引擎实例控制台默认密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConsoleDefaultPwd() {
        return this.ConsoleDefaultPwd;
    }

    /**
     * Set 引擎实例控制台默认密码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsoleDefaultPwd 引擎实例控制台默认密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsoleDefaultPwd(String ConsoleDefaultPwd) {
        this.ConsoleDefaultPwd = ConsoleDefaultPwd;
    }

    /**
     * Get 交易付费类型，0后付费/1预付费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TradeType 交易付费类型，0后付费/1预付费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTradeType() {
        return this.TradeType;
    }

    /**
     * Set 交易付费类型，0后付费/1预付费
注意：此字段可能返回 null，表示取不到有效值。
     * @param TradeType 交易付费类型，0后付费/1预付费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTradeType(Long TradeType) {
        this.TradeType = TradeType;
    }

    /**
     * Get 自动续费标记：0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoRenewFlag 自动续费标记：0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费标记：0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoRenewFlag 自动续费标记：0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 预付费到期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurDeadline 预付费到期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCurDeadline() {
        return this.CurDeadline;
    }

    /**
     * Set 预付费到期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurDeadline 预付费到期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurDeadline(String CurDeadline) {
        this.CurDeadline = CurDeadline;
    }

    /**
     * Get 隔离开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsolateTime 隔离开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set 隔离开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsolateTime 隔离开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
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

    }
}

