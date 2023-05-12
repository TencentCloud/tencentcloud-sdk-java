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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Cluster extends AbstractModel{

    /**
    * 集群 ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 用户 AppID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 主账号 UIN
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 创建者 UIN
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
    * 集群状态, 1 未初始化,，3 初始化中，2 运行中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 描述
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 集群创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最后一次操作集群的时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * CU 数量
    */
    @SerializedName("CuNum")
    @Expose
    private Long CuNum;

    /**
    * CU 内存规格
    */
    @SerializedName("CuMem")
    @Expose
    private Long CuMem;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 状态描述
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 网络
    */
    @SerializedName("CCNs")
    @Expose
    private CCN [] CCNs;

    /**
    * 网络
    */
    @SerializedName("NetEnvironmentType")
    @Expose
    private Long NetEnvironmentType;

    /**
    * 空闲 CU
    */
    @SerializedName("FreeCuNum")
    @Expose
    private Long FreeCuNum;

    /**
    * 集群绑定的标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 集群隔离时间; 没隔离时间，则为 -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsolatedTime")
    @Expose
    private String IsolatedTime;

    /**
    * 集群过期时间; 没过期概念，则为 -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 距离过期还有多少秒; 没过期概念，则为 -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecondsUntilExpiry")
    @Expose
    private String SecondsUntilExpiry;

    /**
    * 自动续费标记，0 表示默认状态 (用户未设置，即初始状态，用户开通了预付费不停服特权会进行自动续费)， 1 表示自动续费，2表示明确不自动续费(用户设置)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 集群的默认 COS 存储桶
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultCOSBucket")
    @Expose
    private String DefaultCOSBucket;

    /**
    * 集群的CLS 日志集 LogSet
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CLSLogSet")
    @Expose
    private String CLSLogSet;

    /**
    * 集群的CLS 日志主题 TopicId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CLSTopicId")
    @Expose
    private String CLSTopicId;

    /**
    * 集群的CLS 日志集  名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CLSLogName")
    @Expose
    private String CLSLogName;

    /**
    * 集群的CLS 日志主题  名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CLSTopicName")
    @Expose
    private String CLSTopicName;

    /**
    * 集群的版本信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private ClusterVersion Version;

    /**
    * 细粒度资源下的空闲CU
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FreeCu")
    @Expose
    private Float FreeCu;

    /**
    * 集群的默认日志采集配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultLogCollectConf")
    @Expose
    private String DefaultLogCollectConf;

    /**
    * 取值：0-没有设置，1-已设置，2-不允许设置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomizedDNSEnabled")
    @Expose
    private Long CustomizedDNSEnabled;

    /**
    * 空间信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Correlations")
    @Expose
    private WorkSpaceClusterItem [] Correlations;

    /**
    * 运行CU
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunningCu")
    @Expose
    private Float RunningCu;

    /**
    * 0 后付费,1 预付费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 前端区分 集群是否需要2CU逻辑 因为历史集群 变配不需要, default 1  新集群都需要
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsNeedManageNode")
    @Expose
    private Long IsNeedManageNode;

    /**
    * session集群信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterSessions")
    @Expose
    private ClusterSession [] ClusterSessions;

    /**
     * Get 集群 ID 
     * @return ClusterId 集群 ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群 ID
     * @param ClusterId 集群 ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群名称 
     * @return Name 集群名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 集群名称
     * @param Name 集群名称
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get 用户 AppID 
     * @return AppId 用户 AppID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户 AppID
     * @param AppId 用户 AppID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 主账号 UIN 
     * @return OwnerUin 主账号 UIN
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 主账号 UIN
     * @param OwnerUin 主账号 UIN
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 创建者 UIN 
     * @return CreatorUin 创建者 UIN
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set 创建者 UIN
     * @param CreatorUin 创建者 UIN
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get 集群状态, 1 未初始化,，3 初始化中，2 运行中 
     * @return Status 集群状态, 1 未初始化,，3 初始化中，2 运行中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 集群状态, 1 未初始化,，3 初始化中，2 运行中
     * @param Status 集群状态, 1 未初始化,，3 初始化中，2 运行中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 描述 
     * @return Remark 描述
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 描述
     * @param Remark 描述
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 集群创建时间 
     * @return CreateTime 集群创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 集群创建时间
     * @param CreateTime 集群创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最后一次操作集群的时间 
     * @return UpdateTime 最后一次操作集群的时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最后一次操作集群的时间
     * @param UpdateTime 最后一次操作集群的时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get CU 数量 
     * @return CuNum CU 数量
     */
    public Long getCuNum() {
        return this.CuNum;
    }

    /**
     * Set CU 数量
     * @param CuNum CU 数量
     */
    public void setCuNum(Long CuNum) {
        this.CuNum = CuNum;
    }

    /**
     * Get CU 内存规格 
     * @return CuMem CU 内存规格
     */
    public Long getCuMem() {
        return this.CuMem;
    }

    /**
     * Set CU 内存规格
     * @param CuMem CU 内存规格
     */
    public void setCuMem(Long CuMem) {
        this.CuMem = CuMem;
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
     * Get 状态描述 
     * @return StatusDesc 状态描述
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 状态描述
     * @param StatusDesc 状态描述
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 网络 
     * @return CCNs 网络
     */
    public CCN [] getCCNs() {
        return this.CCNs;
    }

    /**
     * Set 网络
     * @param CCNs 网络
     */
    public void setCCNs(CCN [] CCNs) {
        this.CCNs = CCNs;
    }

    /**
     * Get 网络 
     * @return NetEnvironmentType 网络
     */
    public Long getNetEnvironmentType() {
        return this.NetEnvironmentType;
    }

    /**
     * Set 网络
     * @param NetEnvironmentType 网络
     */
    public void setNetEnvironmentType(Long NetEnvironmentType) {
        this.NetEnvironmentType = NetEnvironmentType;
    }

    /**
     * Get 空闲 CU 
     * @return FreeCuNum 空闲 CU
     */
    public Long getFreeCuNum() {
        return this.FreeCuNum;
    }

    /**
     * Set 空闲 CU
     * @param FreeCuNum 空闲 CU
     */
    public void setFreeCuNum(Long FreeCuNum) {
        this.FreeCuNum = FreeCuNum;
    }

    /**
     * Get 集群绑定的标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 集群绑定的标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 集群绑定的标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 集群绑定的标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 集群隔离时间; 没隔离时间，则为 -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsolatedTime 集群隔离时间; 没隔离时间，则为 -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set 集群隔离时间; 没隔离时间，则为 -
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsolatedTime 集群隔离时间; 没隔离时间，则为 -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolatedTime(String IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    /**
     * Get 集群过期时间; 没过期概念，则为 -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 集群过期时间; 没过期概念，则为 -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 集群过期时间; 没过期概念，则为 -
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 集群过期时间; 没过期概念，则为 -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 距离过期还有多少秒; 没过期概念，则为 -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecondsUntilExpiry 距离过期还有多少秒; 没过期概念，则为 -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecondsUntilExpiry() {
        return this.SecondsUntilExpiry;
    }

    /**
     * Set 距离过期还有多少秒; 没过期概念，则为 -
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecondsUntilExpiry 距离过期还有多少秒; 没过期概念，则为 -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecondsUntilExpiry(String SecondsUntilExpiry) {
        this.SecondsUntilExpiry = SecondsUntilExpiry;
    }

    /**
     * Get 自动续费标记，0 表示默认状态 (用户未设置，即初始状态，用户开通了预付费不停服特权会进行自动续费)， 1 表示自动续费，2表示明确不自动续费(用户设置)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoRenewFlag 自动续费标记，0 表示默认状态 (用户未设置，即初始状态，用户开通了预付费不停服特权会进行自动续费)， 1 表示自动续费，2表示明确不自动续费(用户设置)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费标记，0 表示默认状态 (用户未设置，即初始状态，用户开通了预付费不停服特权会进行自动续费)， 1 表示自动续费，2表示明确不自动续费(用户设置)
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoRenewFlag 自动续费标记，0 表示默认状态 (用户未设置，即初始状态，用户开通了预付费不停服特权会进行自动续费)， 1 表示自动续费，2表示明确不自动续费(用户设置)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 集群的默认 COS 存储桶
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultCOSBucket 集群的默认 COS 存储桶
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefaultCOSBucket() {
        return this.DefaultCOSBucket;
    }

    /**
     * Set 集群的默认 COS 存储桶
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultCOSBucket 集群的默认 COS 存储桶
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultCOSBucket(String DefaultCOSBucket) {
        this.DefaultCOSBucket = DefaultCOSBucket;
    }

    /**
     * Get 集群的CLS 日志集 LogSet
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CLSLogSet 集群的CLS 日志集 LogSet
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCLSLogSet() {
        return this.CLSLogSet;
    }

    /**
     * Set 集群的CLS 日志集 LogSet
注意：此字段可能返回 null，表示取不到有效值。
     * @param CLSLogSet 集群的CLS 日志集 LogSet
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCLSLogSet(String CLSLogSet) {
        this.CLSLogSet = CLSLogSet;
    }

    /**
     * Get 集群的CLS 日志主题 TopicId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CLSTopicId 集群的CLS 日志主题 TopicId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCLSTopicId() {
        return this.CLSTopicId;
    }

    /**
     * Set 集群的CLS 日志主题 TopicId
注意：此字段可能返回 null，表示取不到有效值。
     * @param CLSTopicId 集群的CLS 日志主题 TopicId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCLSTopicId(String CLSTopicId) {
        this.CLSTopicId = CLSTopicId;
    }

    /**
     * Get 集群的CLS 日志集  名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CLSLogName 集群的CLS 日志集  名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCLSLogName() {
        return this.CLSLogName;
    }

    /**
     * Set 集群的CLS 日志集  名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param CLSLogName 集群的CLS 日志集  名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCLSLogName(String CLSLogName) {
        this.CLSLogName = CLSLogName;
    }

    /**
     * Get 集群的CLS 日志主题  名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CLSTopicName 集群的CLS 日志主题  名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCLSTopicName() {
        return this.CLSTopicName;
    }

    /**
     * Set 集群的CLS 日志主题  名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param CLSTopicName 集群的CLS 日志主题  名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCLSTopicName(String CLSTopicName) {
        this.CLSTopicName = CLSTopicName;
    }

    /**
     * Get 集群的版本信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 集群的版本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClusterVersion getVersion() {
        return this.Version;
    }

    /**
     * Set 集群的版本信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 集群的版本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(ClusterVersion Version) {
        this.Version = Version;
    }

    /**
     * Get 细粒度资源下的空闲CU
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FreeCu 细粒度资源下的空闲CU
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getFreeCu() {
        return this.FreeCu;
    }

    /**
     * Set 细粒度资源下的空闲CU
注意：此字段可能返回 null，表示取不到有效值。
     * @param FreeCu 细粒度资源下的空闲CU
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFreeCu(Float FreeCu) {
        this.FreeCu = FreeCu;
    }

    /**
     * Get 集群的默认日志采集配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultLogCollectConf 集群的默认日志采集配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefaultLogCollectConf() {
        return this.DefaultLogCollectConf;
    }

    /**
     * Set 集群的默认日志采集配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultLogCollectConf 集群的默认日志采集配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultLogCollectConf(String DefaultLogCollectConf) {
        this.DefaultLogCollectConf = DefaultLogCollectConf;
    }

    /**
     * Get 取值：0-没有设置，1-已设置，2-不允许设置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomizedDNSEnabled 取值：0-没有设置，1-已设置，2-不允许设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCustomizedDNSEnabled() {
        return this.CustomizedDNSEnabled;
    }

    /**
     * Set 取值：0-没有设置，1-已设置，2-不允许设置
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomizedDNSEnabled 取值：0-没有设置，1-已设置，2-不允许设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomizedDNSEnabled(Long CustomizedDNSEnabled) {
        this.CustomizedDNSEnabled = CustomizedDNSEnabled;
    }

    /**
     * Get 空间信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Correlations 空间信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkSpaceClusterItem [] getCorrelations() {
        return this.Correlations;
    }

    /**
     * Set 空间信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Correlations 空间信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCorrelations(WorkSpaceClusterItem [] Correlations) {
        this.Correlations = Correlations;
    }

    /**
     * Get 运行CU
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunningCu 运行CU
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRunningCu() {
        return this.RunningCu;
    }

    /**
     * Set 运行CU
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunningCu 运行CU
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunningCu(Float RunningCu) {
        this.RunningCu = RunningCu;
    }

    /**
     * Get 0 后付费,1 预付费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayMode 0 后付费,1 预付费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 0 后付费,1 预付费
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayMode 0 后付费,1 预付费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 前端区分 集群是否需要2CU逻辑 因为历史集群 变配不需要, default 1  新集群都需要
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsNeedManageNode 前端区分 集群是否需要2CU逻辑 因为历史集群 变配不需要, default 1  新集群都需要
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsNeedManageNode() {
        return this.IsNeedManageNode;
    }

    /**
     * Set 前端区分 集群是否需要2CU逻辑 因为历史集群 变配不需要, default 1  新集群都需要
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsNeedManageNode 前端区分 集群是否需要2CU逻辑 因为历史集群 变配不需要, default 1  新集群都需要
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsNeedManageNode(Long IsNeedManageNode) {
        this.IsNeedManageNode = IsNeedManageNode;
    }

    /**
     * Get session集群信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterSessions session集群信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClusterSession [] getClusterSessions() {
        return this.ClusterSessions;
    }

    /**
     * Set session集群信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterSessions session集群信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterSessions(ClusterSession [] ClusterSessions) {
        this.ClusterSessions = ClusterSessions;
    }

    public Cluster() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Cluster(Cluster source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new String(source.CreatorUin);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.CuNum != null) {
            this.CuNum = new Long(source.CuNum);
        }
        if (source.CuMem != null) {
            this.CuMem = new Long(source.CuMem);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.CCNs != null) {
            this.CCNs = new CCN[source.CCNs.length];
            for (int i = 0; i < source.CCNs.length; i++) {
                this.CCNs[i] = new CCN(source.CCNs[i]);
            }
        }
        if (source.NetEnvironmentType != null) {
            this.NetEnvironmentType = new Long(source.NetEnvironmentType);
        }
        if (source.FreeCuNum != null) {
            this.FreeCuNum = new Long(source.FreeCuNum);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.IsolatedTime != null) {
            this.IsolatedTime = new String(source.IsolatedTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.SecondsUntilExpiry != null) {
            this.SecondsUntilExpiry = new String(source.SecondsUntilExpiry);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.DefaultCOSBucket != null) {
            this.DefaultCOSBucket = new String(source.DefaultCOSBucket);
        }
        if (source.CLSLogSet != null) {
            this.CLSLogSet = new String(source.CLSLogSet);
        }
        if (source.CLSTopicId != null) {
            this.CLSTopicId = new String(source.CLSTopicId);
        }
        if (source.CLSLogName != null) {
            this.CLSLogName = new String(source.CLSLogName);
        }
        if (source.CLSTopicName != null) {
            this.CLSTopicName = new String(source.CLSTopicName);
        }
        if (source.Version != null) {
            this.Version = new ClusterVersion(source.Version);
        }
        if (source.FreeCu != null) {
            this.FreeCu = new Float(source.FreeCu);
        }
        if (source.DefaultLogCollectConf != null) {
            this.DefaultLogCollectConf = new String(source.DefaultLogCollectConf);
        }
        if (source.CustomizedDNSEnabled != null) {
            this.CustomizedDNSEnabled = new Long(source.CustomizedDNSEnabled);
        }
        if (source.Correlations != null) {
            this.Correlations = new WorkSpaceClusterItem[source.Correlations.length];
            for (int i = 0; i < source.Correlations.length; i++) {
                this.Correlations[i] = new WorkSpaceClusterItem(source.Correlations[i]);
            }
        }
        if (source.RunningCu != null) {
            this.RunningCu = new Float(source.RunningCu);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.IsNeedManageNode != null) {
            this.IsNeedManageNode = new Long(source.IsNeedManageNode);
        }
        if (source.ClusterSessions != null) {
            this.ClusterSessions = new ClusterSession[source.ClusterSessions.length];
            for (int i = 0; i < source.ClusterSessions.length; i++) {
                this.ClusterSessions[i] = new ClusterSession(source.ClusterSessions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CuNum", this.CuNum);
        this.setParamSimple(map, prefix + "CuMem", this.CuMem);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamArrayObj(map, prefix + "CCNs.", this.CCNs);
        this.setParamSimple(map, prefix + "NetEnvironmentType", this.NetEnvironmentType);
        this.setParamSimple(map, prefix + "FreeCuNum", this.FreeCuNum);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "IsolatedTime", this.IsolatedTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "SecondsUntilExpiry", this.SecondsUntilExpiry);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "DefaultCOSBucket", this.DefaultCOSBucket);
        this.setParamSimple(map, prefix + "CLSLogSet", this.CLSLogSet);
        this.setParamSimple(map, prefix + "CLSTopicId", this.CLSTopicId);
        this.setParamSimple(map, prefix + "CLSLogName", this.CLSLogName);
        this.setParamSimple(map, prefix + "CLSTopicName", this.CLSTopicName);
        this.setParamObj(map, prefix + "Version.", this.Version);
        this.setParamSimple(map, prefix + "FreeCu", this.FreeCu);
        this.setParamSimple(map, prefix + "DefaultLogCollectConf", this.DefaultLogCollectConf);
        this.setParamSimple(map, prefix + "CustomizedDNSEnabled", this.CustomizedDNSEnabled);
        this.setParamArrayObj(map, prefix + "Correlations.", this.Correlations);
        this.setParamSimple(map, prefix + "RunningCu", this.RunningCu);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "IsNeedManageNode", this.IsNeedManageNode);
        this.setParamArrayObj(map, prefix + "ClusterSessions.", this.ClusterSessions);

    }
}

