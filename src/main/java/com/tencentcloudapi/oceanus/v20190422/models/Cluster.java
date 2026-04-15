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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Cluster extends AbstractModel {

    /**
    * <p>集群 ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>集群名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>用户 AppID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>主账号 UIN</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>创建者 UIN</p>
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
    * <p>集群状态, 1 未初始化,3 初始化中，2 运行中</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>描述</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>集群创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>最后一次操作集群的时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>CU 数量</p>
    */
    @SerializedName("CuNum")
    @Expose
    private Long CuNum;

    /**
    * <p>CU 内存规格</p>
    */
    @SerializedName("CuMem")
    @Expose
    private Long CuMem;

    /**
    * <p>可用区</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>状态描述</p>
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * <p>网络</p>
    */
    @SerializedName("CCNs")
    @Expose
    private CCN [] CCNs;

    /**
    * <p>网络</p>
    */
    @SerializedName("NetEnvironmentType")
    @Expose
    private Long NetEnvironmentType;

    /**
    * <p>空闲 CU</p>
    */
    @SerializedName("FreeCuNum")
    @Expose
    private Long FreeCuNum;

    /**
    * <p>集群绑定的标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>集群隔离时间; 没隔离时间，则为 -</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsolatedTime")
    @Expose
    private String IsolatedTime;

    /**
    * <p>集群过期时间; 没过期概念，则为 -</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>距离过期还有多少秒; 没过期概念，则为 -</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecondsUntilExpiry")
    @Expose
    private String SecondsUntilExpiry;

    /**
    * <p>自动续费标记，0 表示默认状态 (用户未设置，即初始状态，用户开通了预付费不停服特权会进行自动续费)， 1 表示自动续费，2表示明确不自动续费(用户设置)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>集群的默认 COS 存储桶</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultCOSBucket")
    @Expose
    private String DefaultCOSBucket;

    /**
    * <p>集群的CLS 日志集 LogSet</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CLSLogSet")
    @Expose
    private String CLSLogSet;

    /**
    * <p>集群的CLS 日志主题 TopicId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CLSTopicId")
    @Expose
    private String CLSTopicId;

    /**
    * <p>集群的CLS 日志集  名字</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CLSLogName")
    @Expose
    private String CLSLogName;

    /**
    * <p>集群的CLS 日志主题  名字</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CLSTopicName")
    @Expose
    private String CLSTopicName;

    /**
    * <p>集群的版本信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private ClusterVersion Version;

    /**
    * <p>细粒度资源下的空闲CU</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FreeCu")
    @Expose
    private Float FreeCu;

    /**
    * <p>集群的默认日志采集配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultLogCollectConf")
    @Expose
    private String DefaultLogCollectConf;

    /**
    * <p>取值：0-没有设置，1-已设置，2-不允许设置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomizedDNSEnabled")
    @Expose
    private Long CustomizedDNSEnabled;

    /**
    * <p>空间信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Correlations")
    @Expose
    private WorkSpaceClusterItem [] Correlations;

    /**
    * <p>运行CU</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunningCu")
    @Expose
    private Float RunningCu;

    /**
    * <p>0 后付费,1 预付费</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>前端区分 集群是否需要2CU逻辑 因为历史集群 变配不需要, default 1  新集群都需要</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsNeedManageNode")
    @Expose
    private Long IsNeedManageNode;

    /**
    * <p>session集群信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterSessions")
    @Expose
    private ClusterSession [] ClusterSessions;

    /**
    * <p>V3版本 = 2</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ArchGeneration")
    @Expose
    private Long ArchGeneration;

    /**
    * <p>0:TKE, 1:EKS</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterType")
    @Expose
    private Long ClusterType;

    /**
    * <p>订单信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Orders")
    @Expose
    private Order [] Orders;

    /**
    * <p>Gateway信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlGateways")
    @Expose
    private SqlGatewayItem [] SqlGateways;

    /**
    * <p>0 公网访问 // 1 内网访问</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebUIType")
    @Expose
    private Long WebUIType;

    /**
    * <p>2 独享集群</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>子eks集群</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubEks")
    @Expose
    private SubEks SubEks;

    /**
    * <p>上级集群</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentSerialId")
    @Expose
    private String AgentSerialId;

    /**
    * <p>资源类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceType")
    @Expose
    private Long ResourceType;

    /**
    * <p>集群类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillingResourceMode")
    @Expose
    private String BillingResourceMode;

    /**
    * <p>Cu比例</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemRatio")
    @Expose
    private Long MemRatio;

    /**
    * <p>是否开启跨租户弹性网卡</p>
    */
    @SerializedName("CrossTenantEniMode")
    @Expose
    private Long CrossTenantEniMode;

    /**
    * <p>总的CPU</p>
    */
    @SerializedName("TotalCpu")
    @Expose
    private Float TotalCpu;

    /**
    * <p>总的内存</p>
    */
    @SerializedName("TotalMem")
    @Expose
    private Float TotalMem;

    /**
    * <p>运行的CPU</p>
    */
    @SerializedName("RunningCpu")
    @Expose
    private Float RunningCpu;

    /**
    * <p>运行的内存</p>
    */
    @SerializedName("RunningMem")
    @Expose
    private Float RunningMem;

    /**
    * <p>setats集群</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Setats")
    @Expose
    private Setats Setats;

    /**
    * <p>[]</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Yarns")
    @Expose
    private HadoopYarnItem [] Yarns;

    /**
    * <p>0 单可用区 1多可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeploymentMode")
    @Expose
    private Long DeploymentMode;

    /**
    * <p>备可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SlaveZones")
    @Expose
    private SlaveZone [] SlaveZones;

    /**
    * <p>集群的日志cos存储</p>
    */
    @SerializedName("LogCOSBucket")
    @Expose
    private String LogCOSBucket;

    /**
    * <p>Cdc集群Id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * <p>集群进度</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterProcessMsg")
    @Expose
    private String ClusterProcessMsg;

    /**
    * <p>单作业最大可配置 CU 数</p>
    */
    @SerializedName("MaxCuPerJob")
    @Expose
    private Long MaxCuPerJob;

    /**
     * Get <p>集群 ID</p> 
     * @return ClusterId <p>集群 ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群 ID</p>
     * @param ClusterId <p>集群 ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>集群名称</p> 
     * @return Name <p>集群名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>集群名称</p>
     * @param Name <p>集群名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get <p>用户 AppID</p> 
     * @return AppId <p>用户 AppID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>用户 AppID</p>
     * @param AppId <p>用户 AppID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>主账号 UIN</p> 
     * @return OwnerUin <p>主账号 UIN</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>主账号 UIN</p>
     * @param OwnerUin <p>主账号 UIN</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>创建者 UIN</p> 
     * @return CreatorUin <p>创建者 UIN</p>
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set <p>创建者 UIN</p>
     * @param CreatorUin <p>创建者 UIN</p>
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get <p>集群状态, 1 未初始化,3 初始化中，2 运行中</p> 
     * @return Status <p>集群状态, 1 未初始化,3 初始化中，2 运行中</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>集群状态, 1 未初始化,3 初始化中，2 运行中</p>
     * @param Status <p>集群状态, 1 未初始化,3 初始化中，2 运行中</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>描述</p> 
     * @return Remark <p>描述</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>描述</p>
     * @param Remark <p>描述</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
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
     * Get <p>最后一次操作集群的时间</p> 
     * @return UpdateTime <p>最后一次操作集群的时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>最后一次操作集群的时间</p>
     * @param UpdateTime <p>最后一次操作集群的时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>CU 数量</p> 
     * @return CuNum <p>CU 数量</p>
     */
    public Long getCuNum() {
        return this.CuNum;
    }

    /**
     * Set <p>CU 数量</p>
     * @param CuNum <p>CU 数量</p>
     */
    public void setCuNum(Long CuNum) {
        this.CuNum = CuNum;
    }

    /**
     * Get <p>CU 内存规格</p> 
     * @return CuMem <p>CU 内存规格</p>
     */
    public Long getCuMem() {
        return this.CuMem;
    }

    /**
     * Set <p>CU 内存规格</p>
     * @param CuMem <p>CU 内存规格</p>
     */
    public void setCuMem(Long CuMem) {
        this.CuMem = CuMem;
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
     * Get <p>状态描述</p> 
     * @return StatusDesc <p>状态描述</p>
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set <p>状态描述</p>
     * @param StatusDesc <p>状态描述</p>
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get <p>网络</p> 
     * @return CCNs <p>网络</p>
     */
    public CCN [] getCCNs() {
        return this.CCNs;
    }

    /**
     * Set <p>网络</p>
     * @param CCNs <p>网络</p>
     */
    public void setCCNs(CCN [] CCNs) {
        this.CCNs = CCNs;
    }

    /**
     * Get <p>网络</p> 
     * @return NetEnvironmentType <p>网络</p>
     */
    public Long getNetEnvironmentType() {
        return this.NetEnvironmentType;
    }

    /**
     * Set <p>网络</p>
     * @param NetEnvironmentType <p>网络</p>
     */
    public void setNetEnvironmentType(Long NetEnvironmentType) {
        this.NetEnvironmentType = NetEnvironmentType;
    }

    /**
     * Get <p>空闲 CU</p> 
     * @return FreeCuNum <p>空闲 CU</p>
     */
    public Long getFreeCuNum() {
        return this.FreeCuNum;
    }

    /**
     * Set <p>空闲 CU</p>
     * @param FreeCuNum <p>空闲 CU</p>
     */
    public void setFreeCuNum(Long FreeCuNum) {
        this.FreeCuNum = FreeCuNum;
    }

    /**
     * Get <p>集群绑定的标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>集群绑定的标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>集群绑定的标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>集群绑定的标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>集群隔离时间; 没隔离时间，则为 -</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsolatedTime <p>集群隔离时间; 没隔离时间，则为 -</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set <p>集群隔离时间; 没隔离时间，则为 -</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsolatedTime <p>集群隔离时间; 没隔离时间，则为 -</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolatedTime(String IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    /**
     * Get <p>集群过期时间; 没过期概念，则为 -</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime <p>集群过期时间; 没过期概念，则为 -</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>集群过期时间; 没过期概念，则为 -</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime <p>集群过期时间; 没过期概念，则为 -</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>距离过期还有多少秒; 没过期概念，则为 -</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecondsUntilExpiry <p>距离过期还有多少秒; 没过期概念，则为 -</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecondsUntilExpiry() {
        return this.SecondsUntilExpiry;
    }

    /**
     * Set <p>距离过期还有多少秒; 没过期概念，则为 -</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecondsUntilExpiry <p>距离过期还有多少秒; 没过期概念，则为 -</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecondsUntilExpiry(String SecondsUntilExpiry) {
        this.SecondsUntilExpiry = SecondsUntilExpiry;
    }

    /**
     * Get <p>自动续费标记，0 表示默认状态 (用户未设置，即初始状态，用户开通了预付费不停服特权会进行自动续费)， 1 表示自动续费，2表示明确不自动续费(用户设置)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoRenewFlag <p>自动续费标记，0 表示默认状态 (用户未设置，即初始状态，用户开通了预付费不停服特权会进行自动续费)， 1 表示自动续费，2表示明确不自动续费(用户设置)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>自动续费标记，0 表示默认状态 (用户未设置，即初始状态，用户开通了预付费不停服特权会进行自动续费)， 1 表示自动续费，2表示明确不自动续费(用户设置)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoRenewFlag <p>自动续费标记，0 表示默认状态 (用户未设置，即初始状态，用户开通了预付费不停服特权会进行自动续费)， 1 表示自动续费，2表示明确不自动续费(用户设置)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>集群的默认 COS 存储桶</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultCOSBucket <p>集群的默认 COS 存储桶</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefaultCOSBucket() {
        return this.DefaultCOSBucket;
    }

    /**
     * Set <p>集群的默认 COS 存储桶</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultCOSBucket <p>集群的默认 COS 存储桶</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultCOSBucket(String DefaultCOSBucket) {
        this.DefaultCOSBucket = DefaultCOSBucket;
    }

    /**
     * Get <p>集群的CLS 日志集 LogSet</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CLSLogSet <p>集群的CLS 日志集 LogSet</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCLSLogSet() {
        return this.CLSLogSet;
    }

    /**
     * Set <p>集群的CLS 日志集 LogSet</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CLSLogSet <p>集群的CLS 日志集 LogSet</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCLSLogSet(String CLSLogSet) {
        this.CLSLogSet = CLSLogSet;
    }

    /**
     * Get <p>集群的CLS 日志主题 TopicId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CLSTopicId <p>集群的CLS 日志主题 TopicId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCLSTopicId() {
        return this.CLSTopicId;
    }

    /**
     * Set <p>集群的CLS 日志主题 TopicId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CLSTopicId <p>集群的CLS 日志主题 TopicId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCLSTopicId(String CLSTopicId) {
        this.CLSTopicId = CLSTopicId;
    }

    /**
     * Get <p>集群的CLS 日志集  名字</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CLSLogName <p>集群的CLS 日志集  名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCLSLogName() {
        return this.CLSLogName;
    }

    /**
     * Set <p>集群的CLS 日志集  名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CLSLogName <p>集群的CLS 日志集  名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCLSLogName(String CLSLogName) {
        this.CLSLogName = CLSLogName;
    }

    /**
     * Get <p>集群的CLS 日志主题  名字</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CLSTopicName <p>集群的CLS 日志主题  名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCLSTopicName() {
        return this.CLSTopicName;
    }

    /**
     * Set <p>集群的CLS 日志主题  名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CLSTopicName <p>集群的CLS 日志主题  名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCLSTopicName(String CLSTopicName) {
        this.CLSTopicName = CLSTopicName;
    }

    /**
     * Get <p>集群的版本信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version <p>集群的版本信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClusterVersion getVersion() {
        return this.Version;
    }

    /**
     * Set <p>集群的版本信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version <p>集群的版本信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(ClusterVersion Version) {
        this.Version = Version;
    }

    /**
     * Get <p>细粒度资源下的空闲CU</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FreeCu <p>细粒度资源下的空闲CU</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getFreeCu() {
        return this.FreeCu;
    }

    /**
     * Set <p>细粒度资源下的空闲CU</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FreeCu <p>细粒度资源下的空闲CU</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFreeCu(Float FreeCu) {
        this.FreeCu = FreeCu;
    }

    /**
     * Get <p>集群的默认日志采集配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultLogCollectConf <p>集群的默认日志采集配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefaultLogCollectConf() {
        return this.DefaultLogCollectConf;
    }

    /**
     * Set <p>集群的默认日志采集配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultLogCollectConf <p>集群的默认日志采集配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultLogCollectConf(String DefaultLogCollectConf) {
        this.DefaultLogCollectConf = DefaultLogCollectConf;
    }

    /**
     * Get <p>取值：0-没有设置，1-已设置，2-不允许设置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomizedDNSEnabled <p>取值：0-没有设置，1-已设置，2-不允许设置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCustomizedDNSEnabled() {
        return this.CustomizedDNSEnabled;
    }

    /**
     * Set <p>取值：0-没有设置，1-已设置，2-不允许设置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomizedDNSEnabled <p>取值：0-没有设置，1-已设置，2-不允许设置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomizedDNSEnabled(Long CustomizedDNSEnabled) {
        this.CustomizedDNSEnabled = CustomizedDNSEnabled;
    }

    /**
     * Get <p>空间信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Correlations <p>空间信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkSpaceClusterItem [] getCorrelations() {
        return this.Correlations;
    }

    /**
     * Set <p>空间信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Correlations <p>空间信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCorrelations(WorkSpaceClusterItem [] Correlations) {
        this.Correlations = Correlations;
    }

    /**
     * Get <p>运行CU</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunningCu <p>运行CU</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRunningCu() {
        return this.RunningCu;
    }

    /**
     * Set <p>运行CU</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunningCu <p>运行CU</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunningCu(Float RunningCu) {
        this.RunningCu = RunningCu;
    }

    /**
     * Get <p>0 后付费,1 预付费</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayMode <p>0 后付费,1 预付费</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>0 后付费,1 预付费</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayMode <p>0 后付费,1 预付费</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>前端区分 集群是否需要2CU逻辑 因为历史集群 变配不需要, default 1  新集群都需要</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsNeedManageNode <p>前端区分 集群是否需要2CU逻辑 因为历史集群 变配不需要, default 1  新集群都需要</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsNeedManageNode() {
        return this.IsNeedManageNode;
    }

    /**
     * Set <p>前端区分 集群是否需要2CU逻辑 因为历史集群 变配不需要, default 1  新集群都需要</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsNeedManageNode <p>前端区分 集群是否需要2CU逻辑 因为历史集群 变配不需要, default 1  新集群都需要</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsNeedManageNode(Long IsNeedManageNode) {
        this.IsNeedManageNode = IsNeedManageNode;
    }

    /**
     * Get <p>session集群信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterSessions <p>session集群信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClusterSession [] getClusterSessions() {
        return this.ClusterSessions;
    }

    /**
     * Set <p>session集群信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterSessions <p>session集群信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterSessions(ClusterSession [] ClusterSessions) {
        this.ClusterSessions = ClusterSessions;
    }

    /**
     * Get <p>V3版本 = 2</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ArchGeneration <p>V3版本 = 2</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getArchGeneration() {
        return this.ArchGeneration;
    }

    /**
     * Set <p>V3版本 = 2</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ArchGeneration <p>V3版本 = 2</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArchGeneration(Long ArchGeneration) {
        this.ArchGeneration = ArchGeneration;
    }

    /**
     * Get <p>0:TKE, 1:EKS</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterType <p>0:TKE, 1:EKS</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>0:TKE, 1:EKS</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterType <p>0:TKE, 1:EKS</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterType(Long ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>订单信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Orders <p>订单信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Order [] getOrders() {
        return this.Orders;
    }

    /**
     * Set <p>订单信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Orders <p>订单信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrders(Order [] Orders) {
        this.Orders = Orders;
    }

    /**
     * Get <p>Gateway信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlGateways <p>Gateway信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SqlGatewayItem [] getSqlGateways() {
        return this.SqlGateways;
    }

    /**
     * Set <p>Gateway信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlGateways <p>Gateway信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlGateways(SqlGatewayItem [] SqlGateways) {
        this.SqlGateways = SqlGateways;
    }

    /**
     * Get <p>0 公网访问 // 1 内网访问</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebUIType <p>0 公网访问 // 1 内网访问</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWebUIType() {
        return this.WebUIType;
    }

    /**
     * Set <p>0 公网访问 // 1 内网访问</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebUIType <p>0 公网访问 // 1 内网访问</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebUIType(Long WebUIType) {
        this.WebUIType = WebUIType;
    }

    /**
     * Get <p>2 独享集群</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>2 独享集群</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>2 独享集群</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>2 独享集群</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>子eks集群</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubEks <p>子eks集群</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SubEks getSubEks() {
        return this.SubEks;
    }

    /**
     * Set <p>子eks集群</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubEks <p>子eks集群</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubEks(SubEks SubEks) {
        this.SubEks = SubEks;
    }

    /**
     * Get <p>上级集群</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentSerialId <p>上级集群</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentSerialId() {
        return this.AgentSerialId;
    }

    /**
     * Set <p>上级集群</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentSerialId <p>上级集群</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentSerialId(String AgentSerialId) {
        this.AgentSerialId = AgentSerialId;
    }

    /**
     * Get <p>资源类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceType <p>资源类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>资源类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceType <p>资源类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceType(Long ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>集群类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillingResourceMode <p>集群类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBillingResourceMode() {
        return this.BillingResourceMode;
    }

    /**
     * Set <p>集群类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillingResourceMode <p>集群类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillingResourceMode(String BillingResourceMode) {
        this.BillingResourceMode = BillingResourceMode;
    }

    /**
     * Get <p>Cu比例</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemRatio <p>Cu比例</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemRatio() {
        return this.MemRatio;
    }

    /**
     * Set <p>Cu比例</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemRatio <p>Cu比例</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemRatio(Long MemRatio) {
        this.MemRatio = MemRatio;
    }

    /**
     * Get <p>是否开启跨租户弹性网卡</p> 
     * @return CrossTenantEniMode <p>是否开启跨租户弹性网卡</p>
     */
    public Long getCrossTenantEniMode() {
        return this.CrossTenantEniMode;
    }

    /**
     * Set <p>是否开启跨租户弹性网卡</p>
     * @param CrossTenantEniMode <p>是否开启跨租户弹性网卡</p>
     */
    public void setCrossTenantEniMode(Long CrossTenantEniMode) {
        this.CrossTenantEniMode = CrossTenantEniMode;
    }

    /**
     * Get <p>总的CPU</p> 
     * @return TotalCpu <p>总的CPU</p>
     */
    public Float getTotalCpu() {
        return this.TotalCpu;
    }

    /**
     * Set <p>总的CPU</p>
     * @param TotalCpu <p>总的CPU</p>
     */
    public void setTotalCpu(Float TotalCpu) {
        this.TotalCpu = TotalCpu;
    }

    /**
     * Get <p>总的内存</p> 
     * @return TotalMem <p>总的内存</p>
     */
    public Float getTotalMem() {
        return this.TotalMem;
    }

    /**
     * Set <p>总的内存</p>
     * @param TotalMem <p>总的内存</p>
     */
    public void setTotalMem(Float TotalMem) {
        this.TotalMem = TotalMem;
    }

    /**
     * Get <p>运行的CPU</p> 
     * @return RunningCpu <p>运行的CPU</p>
     */
    public Float getRunningCpu() {
        return this.RunningCpu;
    }

    /**
     * Set <p>运行的CPU</p>
     * @param RunningCpu <p>运行的CPU</p>
     */
    public void setRunningCpu(Float RunningCpu) {
        this.RunningCpu = RunningCpu;
    }

    /**
     * Get <p>运行的内存</p> 
     * @return RunningMem <p>运行的内存</p>
     */
    public Float getRunningMem() {
        return this.RunningMem;
    }

    /**
     * Set <p>运行的内存</p>
     * @param RunningMem <p>运行的内存</p>
     */
    public void setRunningMem(Float RunningMem) {
        this.RunningMem = RunningMem;
    }

    /**
     * Get <p>setats集群</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Setats <p>setats集群</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Setats getSetats() {
        return this.Setats;
    }

    /**
     * Set <p>setats集群</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Setats <p>setats集群</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSetats(Setats Setats) {
        this.Setats = Setats;
    }

    /**
     * Get <p>[]</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Yarns <p>[]</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HadoopYarnItem [] getYarns() {
        return this.Yarns;
    }

    /**
     * Set <p>[]</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Yarns <p>[]</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setYarns(HadoopYarnItem [] Yarns) {
        this.Yarns = Yarns;
    }

    /**
     * Get <p>0 单可用区 1多可用区</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeploymentMode <p>0 单可用区 1多可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeploymentMode() {
        return this.DeploymentMode;
    }

    /**
     * Set <p>0 单可用区 1多可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeploymentMode <p>0 单可用区 1多可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeploymentMode(Long DeploymentMode) {
        this.DeploymentMode = DeploymentMode;
    }

    /**
     * Get <p>备可用区</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SlaveZones <p>备可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SlaveZone [] getSlaveZones() {
        return this.SlaveZones;
    }

    /**
     * Set <p>备可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SlaveZones <p>备可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlaveZones(SlaveZone [] SlaveZones) {
        this.SlaveZones = SlaveZones;
    }

    /**
     * Get <p>集群的日志cos存储</p> 
     * @return LogCOSBucket <p>集群的日志cos存储</p>
     */
    public String getLogCOSBucket() {
        return this.LogCOSBucket;
    }

    /**
     * Set <p>集群的日志cos存储</p>
     * @param LogCOSBucket <p>集群的日志cos存储</p>
     */
    public void setLogCOSBucket(String LogCOSBucket) {
        this.LogCOSBucket = LogCOSBucket;
    }

    /**
     * Get <p>Cdc集群Id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CdcId <p>Cdc集群Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set <p>Cdc集群Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CdcId <p>Cdc集群Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    /**
     * Get <p>集群进度</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterProcessMsg <p>集群进度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterProcessMsg() {
        return this.ClusterProcessMsg;
    }

    /**
     * Set <p>集群进度</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterProcessMsg <p>集群进度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterProcessMsg(String ClusterProcessMsg) {
        this.ClusterProcessMsg = ClusterProcessMsg;
    }

    /**
     * Get <p>单作业最大可配置 CU 数</p> 
     * @return MaxCuPerJob <p>单作业最大可配置 CU 数</p>
     */
    public Long getMaxCuPerJob() {
        return this.MaxCuPerJob;
    }

    /**
     * Set <p>单作业最大可配置 CU 数</p>
     * @param MaxCuPerJob <p>单作业最大可配置 CU 数</p>
     */
    public void setMaxCuPerJob(Long MaxCuPerJob) {
        this.MaxCuPerJob = MaxCuPerJob;
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
        if (source.ArchGeneration != null) {
            this.ArchGeneration = new Long(source.ArchGeneration);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new Long(source.ClusterType);
        }
        if (source.Orders != null) {
            this.Orders = new Order[source.Orders.length];
            for (int i = 0; i < source.Orders.length; i++) {
                this.Orders[i] = new Order(source.Orders[i]);
            }
        }
        if (source.SqlGateways != null) {
            this.SqlGateways = new SqlGatewayItem[source.SqlGateways.length];
            for (int i = 0; i < source.SqlGateways.length; i++) {
                this.SqlGateways[i] = new SqlGatewayItem(source.SqlGateways[i]);
            }
        }
        if (source.WebUIType != null) {
            this.WebUIType = new Long(source.WebUIType);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.SubEks != null) {
            this.SubEks = new SubEks(source.SubEks);
        }
        if (source.AgentSerialId != null) {
            this.AgentSerialId = new String(source.AgentSerialId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new Long(source.ResourceType);
        }
        if (source.BillingResourceMode != null) {
            this.BillingResourceMode = new String(source.BillingResourceMode);
        }
        if (source.MemRatio != null) {
            this.MemRatio = new Long(source.MemRatio);
        }
        if (source.CrossTenantEniMode != null) {
            this.CrossTenantEniMode = new Long(source.CrossTenantEniMode);
        }
        if (source.TotalCpu != null) {
            this.TotalCpu = new Float(source.TotalCpu);
        }
        if (source.TotalMem != null) {
            this.TotalMem = new Float(source.TotalMem);
        }
        if (source.RunningCpu != null) {
            this.RunningCpu = new Float(source.RunningCpu);
        }
        if (source.RunningMem != null) {
            this.RunningMem = new Float(source.RunningMem);
        }
        if (source.Setats != null) {
            this.Setats = new Setats(source.Setats);
        }
        if (source.Yarns != null) {
            this.Yarns = new HadoopYarnItem[source.Yarns.length];
            for (int i = 0; i < source.Yarns.length; i++) {
                this.Yarns[i] = new HadoopYarnItem(source.Yarns[i]);
            }
        }
        if (source.DeploymentMode != null) {
            this.DeploymentMode = new Long(source.DeploymentMode);
        }
        if (source.SlaveZones != null) {
            this.SlaveZones = new SlaveZone[source.SlaveZones.length];
            for (int i = 0; i < source.SlaveZones.length; i++) {
                this.SlaveZones[i] = new SlaveZone(source.SlaveZones[i]);
            }
        }
        if (source.LogCOSBucket != null) {
            this.LogCOSBucket = new String(source.LogCOSBucket);
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
        if (source.ClusterProcessMsg != null) {
            this.ClusterProcessMsg = new String(source.ClusterProcessMsg);
        }
        if (source.MaxCuPerJob != null) {
            this.MaxCuPerJob = new Long(source.MaxCuPerJob);
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
        this.setParamSimple(map, prefix + "ArchGeneration", this.ArchGeneration);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamArrayObj(map, prefix + "Orders.", this.Orders);
        this.setParamArrayObj(map, prefix + "SqlGateways.", this.SqlGateways);
        this.setParamSimple(map, prefix + "WebUIType", this.WebUIType);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "SubEks.", this.SubEks);
        this.setParamSimple(map, prefix + "AgentSerialId", this.AgentSerialId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "BillingResourceMode", this.BillingResourceMode);
        this.setParamSimple(map, prefix + "MemRatio", this.MemRatio);
        this.setParamSimple(map, prefix + "CrossTenantEniMode", this.CrossTenantEniMode);
        this.setParamSimple(map, prefix + "TotalCpu", this.TotalCpu);
        this.setParamSimple(map, prefix + "TotalMem", this.TotalMem);
        this.setParamSimple(map, prefix + "RunningCpu", this.RunningCpu);
        this.setParamSimple(map, prefix + "RunningMem", this.RunningMem);
        this.setParamObj(map, prefix + "Setats.", this.Setats);
        this.setParamArrayObj(map, prefix + "Yarns.", this.Yarns);
        this.setParamSimple(map, prefix + "DeploymentMode", this.DeploymentMode);
        this.setParamArrayObj(map, prefix + "SlaveZones.", this.SlaveZones);
        this.setParamSimple(map, prefix + "LogCOSBucket", this.LogCOSBucket);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);
        this.setParamSimple(map, prefix + "ClusterProcessMsg", this.ClusterProcessMsg);
        this.setParamSimple(map, prefix + "MaxCuPerJob", this.MaxCuPerJob);

    }
}

