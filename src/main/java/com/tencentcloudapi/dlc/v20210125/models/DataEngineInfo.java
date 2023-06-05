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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataEngineInfo extends AbstractModel{

    /**
    * DataEngine名称
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * 引擎类型 spark/presto
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * 集群资源类型 spark_private/presto_private/presto_cu/spark_cu
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 引用ID
    */
    @SerializedName("QuotaId")
    @Expose
    private String QuotaId;

    /**
    * 数据引擎状态  -2已删除 -1失败 0初始化中 1挂起 2运行中 3准备删除 4删除中
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 集群规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 计费模式 0共享模式 1按量计费 2包年包月
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 最小集群数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinClusters")
    @Expose
    private Long MinClusters;

    /**
    * 最大集群数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxClusters")
    @Expose
    private Long MaxClusters;

    /**
    * 是否自动恢复
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoResume")
    @Expose
    private Boolean AutoResume;

    /**
    * 自动恢复时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpendAfter")
    @Expose
    private Long SpendAfter;

    /**
    * 集群网段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * 是否为默认引擎
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultDataEngine")
    @Expose
    private Boolean DefaultDataEngine;

    /**
    * 返回信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 引擎id
    */
    @SerializedName("DataEngineId")
    @Expose
    private String DataEngineId;

    /**
    * 操作者
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * 到期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 隔离时间
    */
    @SerializedName("IsolatedTime")
    @Expose
    private String IsolatedTime;

    /**
    * 冲正时间
    */
    @SerializedName("ReversalTime")
    @Expose
    private String ReversalTime;

    /**
    * 用户名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserAlias")
    @Expose
    private String UserAlias;

    /**
    * 标签对集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagList")
    @Expose
    private TagInfo [] TagList;

    /**
    * 引擎拥有的权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Permissions")
    @Expose
    private String [] Permissions;

    /**
    * 是否自定挂起集群：false（默认）：不自动挂起、true：自动挂起
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoSuspend")
    @Expose
    private Boolean AutoSuspend;

    /**
    * 定时启停集群策略：0（默认）：关闭定时策略、1：开启定时策略（注：定时启停策略与自动挂起策略互斥）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CrontabResumeSuspend")
    @Expose
    private Long CrontabResumeSuspend;

    /**
    * 定时启停策略，复杂类型：包含启停时间、挂起集群策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CrontabResumeSuspendStrategy")
    @Expose
    private CrontabResumeSuspendStrategy CrontabResumeSuspendStrategy;

    /**
    * 引擎执行任务类型，有效值：SQL/BATCH
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineExecType")
    @Expose
    private String EngineExecType;

    /**
    * 自动续费标志，0，初始状态，默认不自动续费，若用户有预付费不停服特权，自动续费。1：自动续费。2：明确不自动续费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * 集群自动挂起时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoSuspendTime")
    @Expose
    private Long AutoSuspendTime;

    /**
    * 网络连接配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkConnectionSet")
    @Expose
    private NetworkConnection [] NetworkConnectionSet;

    /**
    * ui的跳转地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UiURL")
    @Expose
    private String UiURL;

    /**
    * 引擎的资源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 集群镜像版本ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageVersionId")
    @Expose
    private String ImageVersionId;

    /**
    * 集群镜像小版本ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChildImageVersionId")
    @Expose
    private String ChildImageVersionId;

    /**
    * 集群镜像版本名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageVersionName")
    @Expose
    private String ImageVersionName;

    /**
    * 是否开启备集群
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartStandbyCluster")
    @Expose
    private Boolean StartStandbyCluster;

    /**
    * spark jar 包年包月集群是否开启弹性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ElasticSwitch")
    @Expose
    private Boolean ElasticSwitch;

    /**
    * spark jar 包年包月集群弹性上限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ElasticLimit")
    @Expose
    private Long ElasticLimit;

    /**
    * 是否为默认引擎
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultHouse")
    @Expose
    private Boolean DefaultHouse;

    /**
    * 单个集群任务最大并发数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxConcurrency")
    @Expose
    private Long MaxConcurrency;

    /**
    * 任务排队上限时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TolerableQueueTime")
    @Expose
    private Long TolerableQueueTime;

    /**
    * 用户appid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserAppId")
    @Expose
    private Long UserAppId;

    /**
    * 用户uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
    * SessionResourceTemplate
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionResourceTemplate")
    @Expose
    private SessionResourceTemplate SessionResourceTemplate;

    /**
     * Get DataEngine名称 
     * @return DataEngineName DataEngine名称
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set DataEngine名称
     * @param DataEngineName DataEngine名称
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get 引擎类型 spark/presto 
     * @return EngineType 引擎类型 spark/presto
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set 引擎类型 spark/presto
     * @param EngineType 引擎类型 spark/presto
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get 集群资源类型 spark_private/presto_private/presto_cu/spark_cu 
     * @return ClusterType 集群资源类型 spark_private/presto_private/presto_cu/spark_cu
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群资源类型 spark_private/presto_private/presto_cu/spark_cu
     * @param ClusterType 集群资源类型 spark_private/presto_private/presto_cu/spark_cu
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 引用ID 
     * @return QuotaId 引用ID
     */
    public String getQuotaId() {
        return this.QuotaId;
    }

    /**
     * Set 引用ID
     * @param QuotaId 引用ID
     */
    public void setQuotaId(String QuotaId) {
        this.QuotaId = QuotaId;
    }

    /**
     * Get 数据引擎状态  -2已删除 -1失败 0初始化中 1挂起 2运行中 3准备删除 4删除中 
     * @return State 数据引擎状态  -2已删除 -1失败 0初始化中 1挂起 2运行中 3准备删除 4删除中
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 数据引擎状态  -2已删除 -1失败 0初始化中 1挂起 2运行中 3准备删除 4删除中
     * @param State 数据引擎状态  -2已删除 -1失败 0初始化中 1挂起 2运行中 3准备删除 4删除中
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 集群规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Size 集群规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 集群规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param Size 集群规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 计费模式 0共享模式 1按量计费 2包年包月 
     * @return Mode 计费模式 0共享模式 1按量计费 2包年包月
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 计费模式 0共享模式 1按量计费 2包年包月
     * @param Mode 计费模式 0共享模式 1按量计费 2包年包月
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 最小集群数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinClusters 最小集群数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinClusters() {
        return this.MinClusters;
    }

    /**
     * Set 最小集群数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinClusters 最小集群数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinClusters(Long MinClusters) {
        this.MinClusters = MinClusters;
    }

    /**
     * Get 最大集群数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxClusters 最大集群数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxClusters() {
        return this.MaxClusters;
    }

    /**
     * Set 最大集群数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxClusters 最大集群数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxClusters(Long MaxClusters) {
        this.MaxClusters = MaxClusters;
    }

    /**
     * Get 是否自动恢复
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoResume 是否自动恢复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAutoResume() {
        return this.AutoResume;
    }

    /**
     * Set 是否自动恢复
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoResume 是否自动恢复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoResume(Boolean AutoResume) {
        this.AutoResume = AutoResume;
    }

    /**
     * Get 自动恢复时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpendAfter 自动恢复时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSpendAfter() {
        return this.SpendAfter;
    }

    /**
     * Set 自动恢复时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpendAfter 自动恢复时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpendAfter(Long SpendAfter) {
        this.SpendAfter = SpendAfter;
    }

    /**
     * Get 集群网段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CidrBlock 集群网段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set 集群网段
注意：此字段可能返回 null，表示取不到有效值。
     * @param CidrBlock 集群网段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get 是否为默认引擎
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultDataEngine 是否为默认引擎
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDefaultDataEngine() {
        return this.DefaultDataEngine;
    }

    /**
     * Set 是否为默认引擎
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultDataEngine 是否为默认引擎
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultDataEngine(Boolean DefaultDataEngine) {
        this.DefaultDataEngine = DefaultDataEngine;
    }

    /**
     * Get 返回信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 返回信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 返回信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 返回信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 引擎id 
     * @return DataEngineId 引擎id
     */
    public String getDataEngineId() {
        return this.DataEngineId;
    }

    /**
     * Set 引擎id
     * @param DataEngineId 引擎id
     */
    public void setDataEngineId(String DataEngineId) {
        this.DataEngineId = DataEngineId;
    }

    /**
     * Get 操作者 
     * @return SubAccountUin 操作者
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set 操作者
     * @param SubAccountUin 操作者
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get 到期时间 
     * @return ExpireTime 到期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 到期时间
     * @param ExpireTime 到期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 隔离时间 
     * @return IsolatedTime 隔离时间
     */
    public String getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set 隔离时间
     * @param IsolatedTime 隔离时间
     */
    public void setIsolatedTime(String IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    /**
     * Get 冲正时间 
     * @return ReversalTime 冲正时间
     */
    public String getReversalTime() {
        return this.ReversalTime;
    }

    /**
     * Set 冲正时间
     * @param ReversalTime 冲正时间
     */
    public void setReversalTime(String ReversalTime) {
        this.ReversalTime = ReversalTime;
    }

    /**
     * Get 用户名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserAlias 用户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserAlias() {
        return this.UserAlias;
    }

    /**
     * Set 用户名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserAlias 用户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserAlias(String UserAlias) {
        this.UserAlias = UserAlias;
    }

    /**
     * Get 标签对集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagList 标签对集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagInfo [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 标签对集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagList 标签对集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagList(TagInfo [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get 引擎拥有的权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Permissions 引擎拥有的权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPermissions() {
        return this.Permissions;
    }

    /**
     * Set 引擎拥有的权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param Permissions 引擎拥有的权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPermissions(String [] Permissions) {
        this.Permissions = Permissions;
    }

    /**
     * Get 是否自定挂起集群：false（默认）：不自动挂起、true：自动挂起
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoSuspend 是否自定挂起集群：false（默认）：不自动挂起、true：自动挂起
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAutoSuspend() {
        return this.AutoSuspend;
    }

    /**
     * Set 是否自定挂起集群：false（默认）：不自动挂起、true：自动挂起
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoSuspend 是否自定挂起集群：false（默认）：不自动挂起、true：自动挂起
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoSuspend(Boolean AutoSuspend) {
        this.AutoSuspend = AutoSuspend;
    }

    /**
     * Get 定时启停集群策略：0（默认）：关闭定时策略、1：开启定时策略（注：定时启停策略与自动挂起策略互斥）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CrontabResumeSuspend 定时启停集群策略：0（默认）：关闭定时策略、1：开启定时策略（注：定时启停策略与自动挂起策略互斥）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCrontabResumeSuspend() {
        return this.CrontabResumeSuspend;
    }

    /**
     * Set 定时启停集群策略：0（默认）：关闭定时策略、1：开启定时策略（注：定时启停策略与自动挂起策略互斥）
注意：此字段可能返回 null，表示取不到有效值。
     * @param CrontabResumeSuspend 定时启停集群策略：0（默认）：关闭定时策略、1：开启定时策略（注：定时启停策略与自动挂起策略互斥）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCrontabResumeSuspend(Long CrontabResumeSuspend) {
        this.CrontabResumeSuspend = CrontabResumeSuspend;
    }

    /**
     * Get 定时启停策略，复杂类型：包含启停时间、挂起集群策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CrontabResumeSuspendStrategy 定时启停策略，复杂类型：包含启停时间、挂起集群策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CrontabResumeSuspendStrategy getCrontabResumeSuspendStrategy() {
        return this.CrontabResumeSuspendStrategy;
    }

    /**
     * Set 定时启停策略，复杂类型：包含启停时间、挂起集群策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param CrontabResumeSuspendStrategy 定时启停策略，复杂类型：包含启停时间、挂起集群策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCrontabResumeSuspendStrategy(CrontabResumeSuspendStrategy CrontabResumeSuspendStrategy) {
        this.CrontabResumeSuspendStrategy = CrontabResumeSuspendStrategy;
    }

    /**
     * Get 引擎执行任务类型，有效值：SQL/BATCH
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineExecType 引擎执行任务类型，有效值：SQL/BATCH
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineExecType() {
        return this.EngineExecType;
    }

    /**
     * Set 引擎执行任务类型，有效值：SQL/BATCH
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineExecType 引擎执行任务类型，有效值：SQL/BATCH
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineExecType(String EngineExecType) {
        this.EngineExecType = EngineExecType;
    }

    /**
     * Get 自动续费标志，0，初始状态，默认不自动续费，若用户有预付费不停服特权，自动续费。1：自动续费。2：明确不自动续费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenewFlag 自动续费标志，0，初始状态，默认不自动续费，若用户有预付费不停服特权，自动续费。1：自动续费。2：明确不自动续费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费标志，0，初始状态，默认不自动续费，若用户有预付费不停服特权，自动续费。1：自动续费。2：明确不自动续费
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewFlag 自动续费标志，0，初始状态，默认不自动续费，若用户有预付费不停服特权，自动续费。1：自动续费。2：明确不自动续费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 集群自动挂起时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoSuspendTime 集群自动挂起时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutoSuspendTime() {
        return this.AutoSuspendTime;
    }

    /**
     * Set 集群自动挂起时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoSuspendTime 集群自动挂起时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoSuspendTime(Long AutoSuspendTime) {
        this.AutoSuspendTime = AutoSuspendTime;
    }

    /**
     * Get 网络连接配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkConnectionSet 网络连接配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NetworkConnection [] getNetworkConnectionSet() {
        return this.NetworkConnectionSet;
    }

    /**
     * Set 网络连接配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkConnectionSet 网络连接配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkConnectionSet(NetworkConnection [] NetworkConnectionSet) {
        this.NetworkConnectionSet = NetworkConnectionSet;
    }

    /**
     * Get ui的跳转地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UiURL ui的跳转地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUiURL() {
        return this.UiURL;
    }

    /**
     * Set ui的跳转地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param UiURL ui的跳转地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUiURL(String UiURL) {
        this.UiURL = UiURL;
    }

    /**
     * Get 引擎的资源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceType 引擎的资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 引擎的资源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceType 引擎的资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 集群镜像版本ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageVersionId 集群镜像版本ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageVersionId() {
        return this.ImageVersionId;
    }

    /**
     * Set 集群镜像版本ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageVersionId 集群镜像版本ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageVersionId(String ImageVersionId) {
        this.ImageVersionId = ImageVersionId;
    }

    /**
     * Get 集群镜像小版本ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChildImageVersionId 集群镜像小版本ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChildImageVersionId() {
        return this.ChildImageVersionId;
    }

    /**
     * Set 集群镜像小版本ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChildImageVersionId 集群镜像小版本ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChildImageVersionId(String ChildImageVersionId) {
        this.ChildImageVersionId = ChildImageVersionId;
    }

    /**
     * Get 集群镜像版本名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageVersionName 集群镜像版本名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageVersionName() {
        return this.ImageVersionName;
    }

    /**
     * Set 集群镜像版本名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageVersionName 集群镜像版本名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageVersionName(String ImageVersionName) {
        this.ImageVersionName = ImageVersionName;
    }

    /**
     * Get 是否开启备集群
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartStandbyCluster 是否开启备集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getStartStandbyCluster() {
        return this.StartStandbyCluster;
    }

    /**
     * Set 是否开启备集群
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartStandbyCluster 是否开启备集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartStandbyCluster(Boolean StartStandbyCluster) {
        this.StartStandbyCluster = StartStandbyCluster;
    }

    /**
     * Get spark jar 包年包月集群是否开启弹性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ElasticSwitch spark jar 包年包月集群是否开启弹性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getElasticSwitch() {
        return this.ElasticSwitch;
    }

    /**
     * Set spark jar 包年包月集群是否开启弹性
注意：此字段可能返回 null，表示取不到有效值。
     * @param ElasticSwitch spark jar 包年包月集群是否开启弹性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElasticSwitch(Boolean ElasticSwitch) {
        this.ElasticSwitch = ElasticSwitch;
    }

    /**
     * Get spark jar 包年包月集群弹性上限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ElasticLimit spark jar 包年包月集群弹性上限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getElasticLimit() {
        return this.ElasticLimit;
    }

    /**
     * Set spark jar 包年包月集群弹性上限
注意：此字段可能返回 null，表示取不到有效值。
     * @param ElasticLimit spark jar 包年包月集群弹性上限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElasticLimit(Long ElasticLimit) {
        this.ElasticLimit = ElasticLimit;
    }

    /**
     * Get 是否为默认引擎
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultHouse 是否为默认引擎
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDefaultHouse() {
        return this.DefaultHouse;
    }

    /**
     * Set 是否为默认引擎
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultHouse 是否为默认引擎
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultHouse(Boolean DefaultHouse) {
        this.DefaultHouse = DefaultHouse;
    }

    /**
     * Get 单个集群任务最大并发数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxConcurrency 单个集群任务最大并发数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxConcurrency() {
        return this.MaxConcurrency;
    }

    /**
     * Set 单个集群任务最大并发数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxConcurrency 单个集群任务最大并发数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxConcurrency(Long MaxConcurrency) {
        this.MaxConcurrency = MaxConcurrency;
    }

    /**
     * Get 任务排队上限时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TolerableQueueTime 任务排队上限时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTolerableQueueTime() {
        return this.TolerableQueueTime;
    }

    /**
     * Set 任务排队上限时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TolerableQueueTime 任务排队上限时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTolerableQueueTime(Long TolerableQueueTime) {
        this.TolerableQueueTime = TolerableQueueTime;
    }

    /**
     * Get 用户appid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserAppId 用户appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUserAppId() {
        return this.UserAppId;
    }

    /**
     * Set 用户appid
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserAppId 用户appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserAppId(Long UserAppId) {
        this.UserAppId = UserAppId;
    }

    /**
     * Get 用户uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserUin 用户uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set 用户uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserUin 用户uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    /**
     * Get SessionResourceTemplate
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionResourceTemplate SessionResourceTemplate
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SessionResourceTemplate getSessionResourceTemplate() {
        return this.SessionResourceTemplate;
    }

    /**
     * Set SessionResourceTemplate
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionResourceTemplate SessionResourceTemplate
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionResourceTemplate(SessionResourceTemplate SessionResourceTemplate) {
        this.SessionResourceTemplate = SessionResourceTemplate;
    }

    public DataEngineInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataEngineInfo(DataEngineInfo source) {
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.QuotaId != null) {
            this.QuotaId = new String(source.QuotaId);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.MinClusters != null) {
            this.MinClusters = new Long(source.MinClusters);
        }
        if (source.MaxClusters != null) {
            this.MaxClusters = new Long(source.MaxClusters);
        }
        if (source.AutoResume != null) {
            this.AutoResume = new Boolean(source.AutoResume);
        }
        if (source.SpendAfter != null) {
            this.SpendAfter = new Long(source.SpendAfter);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.DefaultDataEngine != null) {
            this.DefaultDataEngine = new Boolean(source.DefaultDataEngine);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.DataEngineId != null) {
            this.DataEngineId = new String(source.DataEngineId);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.IsolatedTime != null) {
            this.IsolatedTime = new String(source.IsolatedTime);
        }
        if (source.ReversalTime != null) {
            this.ReversalTime = new String(source.ReversalTime);
        }
        if (source.UserAlias != null) {
            this.UserAlias = new String(source.UserAlias);
        }
        if (source.TagList != null) {
            this.TagList = new TagInfo[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new TagInfo(source.TagList[i]);
            }
        }
        if (source.Permissions != null) {
            this.Permissions = new String[source.Permissions.length];
            for (int i = 0; i < source.Permissions.length; i++) {
                this.Permissions[i] = new String(source.Permissions[i]);
            }
        }
        if (source.AutoSuspend != null) {
            this.AutoSuspend = new Boolean(source.AutoSuspend);
        }
        if (source.CrontabResumeSuspend != null) {
            this.CrontabResumeSuspend = new Long(source.CrontabResumeSuspend);
        }
        if (source.CrontabResumeSuspendStrategy != null) {
            this.CrontabResumeSuspendStrategy = new CrontabResumeSuspendStrategy(source.CrontabResumeSuspendStrategy);
        }
        if (source.EngineExecType != null) {
            this.EngineExecType = new String(source.EngineExecType);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.AutoSuspendTime != null) {
            this.AutoSuspendTime = new Long(source.AutoSuspendTime);
        }
        if (source.NetworkConnectionSet != null) {
            this.NetworkConnectionSet = new NetworkConnection[source.NetworkConnectionSet.length];
            for (int i = 0; i < source.NetworkConnectionSet.length; i++) {
                this.NetworkConnectionSet[i] = new NetworkConnection(source.NetworkConnectionSet[i]);
            }
        }
        if (source.UiURL != null) {
            this.UiURL = new String(source.UiURL);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ImageVersionId != null) {
            this.ImageVersionId = new String(source.ImageVersionId);
        }
        if (source.ChildImageVersionId != null) {
            this.ChildImageVersionId = new String(source.ChildImageVersionId);
        }
        if (source.ImageVersionName != null) {
            this.ImageVersionName = new String(source.ImageVersionName);
        }
        if (source.StartStandbyCluster != null) {
            this.StartStandbyCluster = new Boolean(source.StartStandbyCluster);
        }
        if (source.ElasticSwitch != null) {
            this.ElasticSwitch = new Boolean(source.ElasticSwitch);
        }
        if (source.ElasticLimit != null) {
            this.ElasticLimit = new Long(source.ElasticLimit);
        }
        if (source.DefaultHouse != null) {
            this.DefaultHouse = new Boolean(source.DefaultHouse);
        }
        if (source.MaxConcurrency != null) {
            this.MaxConcurrency = new Long(source.MaxConcurrency);
        }
        if (source.TolerableQueueTime != null) {
            this.TolerableQueueTime = new Long(source.TolerableQueueTime);
        }
        if (source.UserAppId != null) {
            this.UserAppId = new Long(source.UserAppId);
        }
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
        if (source.SessionResourceTemplate != null) {
            this.SessionResourceTemplate = new SessionResourceTemplate(source.SessionResourceTemplate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "QuotaId", this.QuotaId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "MinClusters", this.MinClusters);
        this.setParamSimple(map, prefix + "MaxClusters", this.MaxClusters);
        this.setParamSimple(map, prefix + "AutoResume", this.AutoResume);
        this.setParamSimple(map, prefix + "SpendAfter", this.SpendAfter);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "DefaultDataEngine", this.DefaultDataEngine);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "DataEngineId", this.DataEngineId);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "IsolatedTime", this.IsolatedTime);
        this.setParamSimple(map, prefix + "ReversalTime", this.ReversalTime);
        this.setParamSimple(map, prefix + "UserAlias", this.UserAlias);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamArraySimple(map, prefix + "Permissions.", this.Permissions);
        this.setParamSimple(map, prefix + "AutoSuspend", this.AutoSuspend);
        this.setParamSimple(map, prefix + "CrontabResumeSuspend", this.CrontabResumeSuspend);
        this.setParamObj(map, prefix + "CrontabResumeSuspendStrategy.", this.CrontabResumeSuspendStrategy);
        this.setParamSimple(map, prefix + "EngineExecType", this.EngineExecType);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "AutoSuspendTime", this.AutoSuspendTime);
        this.setParamArrayObj(map, prefix + "NetworkConnectionSet.", this.NetworkConnectionSet);
        this.setParamSimple(map, prefix + "UiURL", this.UiURL);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ImageVersionId", this.ImageVersionId);
        this.setParamSimple(map, prefix + "ChildImageVersionId", this.ChildImageVersionId);
        this.setParamSimple(map, prefix + "ImageVersionName", this.ImageVersionName);
        this.setParamSimple(map, prefix + "StartStandbyCluster", this.StartStandbyCluster);
        this.setParamSimple(map, prefix + "ElasticSwitch", this.ElasticSwitch);
        this.setParamSimple(map, prefix + "ElasticLimit", this.ElasticLimit);
        this.setParamSimple(map, prefix + "DefaultHouse", this.DefaultHouse);
        this.setParamSimple(map, prefix + "MaxConcurrency", this.MaxConcurrency);
        this.setParamSimple(map, prefix + "TolerableQueueTime", this.TolerableQueueTime);
        this.setParamSimple(map, prefix + "UserAppId", this.UserAppId);
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);
        this.setParamObj(map, prefix + "SessionResourceTemplate.", this.SessionResourceTemplate);

    }
}

