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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmDbAsset extends AbstractModel {

    /**
    * <p>资产实例Id</p>
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * <p>资产类型</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>资产名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>账号数</p>
    */
    @SerializedName("AccountCount")
    @Expose
    private Long AccountCount;

    /**
    * <p>公网访问地址，如果有多个，使用&#39;;&#39;分割</p>
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * <p>内网访问地址，如果有多个，使用&#39;;&#39;分割</p>
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * <p>广域网域名地址，如果有多个，使用&#39;;&#39;分割</p>
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * <p>地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>资产所在vpc的vpcid</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>资产所在vpc的vpc名</p>
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * <p>资产所在vpc子网的subnetid</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>资产所在vpc子网名</p>
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * <p>实例状态</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>创建时间。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>管理者信息。</p>
    */
    @SerializedName("Manager")
    @Expose
    private DspmUinUser [] Manager;

    /**
    * <p>是否绑定身份。0-未绑定 1-已绑定</p>
    */
    @SerializedName("BindIdentify")
    @Expose
    private Long BindIdentify;

    /**
    * <p>是否管理员</p>
    */
    @SerializedName("IsManager")
    @Expose
    private Long IsManager;

    /**
    * <p>风险统计信息</p>
    */
    @SerializedName("RiskCount")
    @Expose
    private DspmRiskCount RiskCount;

    /**
    * <p>安全建议。<br>Resolve 立即解决<br>Reinforcement 加固<br>None 暂无异常</p>
    */
    @SerializedName("SafetyAdvice")
    @Expose
    private String SafetyAdvice;

    /**
    * <p>日志投递状态。<br>0-投递关闭 1-投递打开 2-投递开通中 3-投递关闭中</p>
    */
    @SerializedName("LogDeliveryStatus")
    @Expose
    private Long LogDeliveryStatus;

    /**
    * <p>是否支持日志投递。0-不支持 1-支持</p>
    */
    @SerializedName("LogDeliverySupported")
    @Expose
    private Long LogDeliverySupported;

    /**
    * <p>数据扫描信息</p>
    */
    @SerializedName("DataScanInfo")
    @Expose
    private DspmAssetDataScanDetail DataScanInfo;

    /**
    * <p>资产所属账号app id</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>账号昵称</p>
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * <p>资产所属账号uin</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>安全分析状态（0-关闭 1-打开 2-开通中 3-关闭中）</p>
    */
    @SerializedName("SecurityAnalyseStatus")
    @Expose
    private Long SecurityAnalyseStatus;

    /**
    * <p>当前实例的总日志数</p>
    */
    @SerializedName("TotalAuditLogs")
    @Expose
    private Long TotalAuditLogs;

    /**
    * <p>日志审计禁止开通的原因，可选值：VersionNotSupportLogSubscription, InstanceIsUpgrading, CdbRuleAuditEnabled, AssetNotExists</p>
    */
    @SerializedName("LogDeliveryDisableReason")
    @Expose
    private String LogDeliveryDisableReason;

    /**
    * <p>在线日志的起始时间戳，精确到秒</p>
    */
    @SerializedName("OldestOnlineLogTimestamp")
    @Expose
    private Long OldestOnlineLogTimestamp;

    /**
    * <p>在线日志的最新时间戳，精确到秒</p>
    */
    @SerializedName("NewestOnlineLogTimestamp")
    @Expose
    private Long NewestOnlineLogTimestamp;

    /**
    * <p>操作错误信息</p>
    */
    @SerializedName("OperationErrorMsg")
    @Expose
    private String OperationErrorMsg;

    /**
    * <p>是否支持账号操作。0 不支持；1 支持</p>
    */
    @SerializedName("AccountOptSupported")
    @Expose
    private Long AccountOptSupported;

    /**
    * <p>实例类型</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * <p>集群类型（MongoDB），与云接口 DescribeDBInstances 的 ClusterType 一致：0-副本集 1-分片；非 MongoDB 资产固定 0</p>
    */
    @SerializedName("ClusterType")
    @Expose
    private Long ClusterType;

    /**
    * <p>是否支持敏感数据识别。0 不支持；1 支持</p>
    */
    @SerializedName("IdentifyScanSupported")
    @Expose
    private Long IdentifyScanSupported;

    /**
    * <p>集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>集群名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
     * Get <p>资产实例Id</p> 
     * @return AssetId <p>资产实例Id</p>
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set <p>资产实例Id</p>
     * @param AssetId <p>资产实例Id</p>
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get <p>资产类型</p> 
     * @return AssetType <p>资产类型</p>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>资产类型</p>
     * @param AssetType <p>资产类型</p>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>资产名</p> 
     * @return Name <p>资产名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>资产名</p>
     * @param Name <p>资产名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>账号数</p> 
     * @return AccountCount <p>账号数</p>
     */
    public Long getAccountCount() {
        return this.AccountCount;
    }

    /**
     * Set <p>账号数</p>
     * @param AccountCount <p>账号数</p>
     */
    public void setAccountCount(Long AccountCount) {
        this.AccountCount = AccountCount;
    }

    /**
     * Get <p>公网访问地址，如果有多个，使用&#39;;&#39;分割</p> 
     * @return PublicIp <p>公网访问地址，如果有多个，使用&#39;;&#39;分割</p>
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set <p>公网访问地址，如果有多个，使用&#39;;&#39;分割</p>
     * @param PublicIp <p>公网访问地址，如果有多个，使用&#39;;&#39;分割</p>
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get <p>内网访问地址，如果有多个，使用&#39;;&#39;分割</p> 
     * @return PrivateIp <p>内网访问地址，如果有多个，使用&#39;;&#39;分割</p>
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set <p>内网访问地址，如果有多个，使用&#39;;&#39;分割</p>
     * @param PrivateIp <p>内网访问地址，如果有多个，使用&#39;;&#39;分割</p>
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get <p>广域网域名地址，如果有多个，使用&#39;;&#39;分割</p> 
     * @return WanDomain <p>广域网域名地址，如果有多个，使用&#39;;&#39;分割</p>
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set <p>广域网域名地址，如果有多个，使用&#39;;&#39;分割</p>
     * @param WanDomain <p>广域网域名地址，如果有多个，使用&#39;;&#39;分割</p>
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
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
     * Get <p>资产所在vpc的vpcid</p> 
     * @return VpcId <p>资产所在vpc的vpcid</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>资产所在vpc的vpcid</p>
     * @param VpcId <p>资产所在vpc的vpcid</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>资产所在vpc的vpc名</p> 
     * @return VpcName <p>资产所在vpc的vpc名</p>
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set <p>资产所在vpc的vpc名</p>
     * @param VpcName <p>资产所在vpc的vpc名</p>
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get <p>资产所在vpc子网的subnetid</p> 
     * @return SubnetId <p>资产所在vpc子网的subnetid</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>资产所在vpc子网的subnetid</p>
     * @param SubnetId <p>资产所在vpc子网的subnetid</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>资产所在vpc子网名</p> 
     * @return SubnetName <p>资产所在vpc子网名</p>
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set <p>资产所在vpc子网名</p>
     * @param SubnetName <p>资产所在vpc子网名</p>
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get <p>实例状态</p> 
     * @return Status <p>实例状态</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实例状态</p>
     * @param Status <p>实例状态</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>创建时间。</p> 
     * @return CreateTime <p>创建时间。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间。</p>
     * @param CreateTime <p>创建时间。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>管理者信息。</p> 
     * @return Manager <p>管理者信息。</p>
     */
    public DspmUinUser [] getManager() {
        return this.Manager;
    }

    /**
     * Set <p>管理者信息。</p>
     * @param Manager <p>管理者信息。</p>
     */
    public void setManager(DspmUinUser [] Manager) {
        this.Manager = Manager;
    }

    /**
     * Get <p>是否绑定身份。0-未绑定 1-已绑定</p> 
     * @return BindIdentify <p>是否绑定身份。0-未绑定 1-已绑定</p>
     */
    public Long getBindIdentify() {
        return this.BindIdentify;
    }

    /**
     * Set <p>是否绑定身份。0-未绑定 1-已绑定</p>
     * @param BindIdentify <p>是否绑定身份。0-未绑定 1-已绑定</p>
     */
    public void setBindIdentify(Long BindIdentify) {
        this.BindIdentify = BindIdentify;
    }

    /**
     * Get <p>是否管理员</p> 
     * @return IsManager <p>是否管理员</p>
     */
    public Long getIsManager() {
        return this.IsManager;
    }

    /**
     * Set <p>是否管理员</p>
     * @param IsManager <p>是否管理员</p>
     */
    public void setIsManager(Long IsManager) {
        this.IsManager = IsManager;
    }

    /**
     * Get <p>风险统计信息</p> 
     * @return RiskCount <p>风险统计信息</p>
     */
    public DspmRiskCount getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set <p>风险统计信息</p>
     * @param RiskCount <p>风险统计信息</p>
     */
    public void setRiskCount(DspmRiskCount RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get <p>安全建议。<br>Resolve 立即解决<br>Reinforcement 加固<br>None 暂无异常</p> 
     * @return SafetyAdvice <p>安全建议。<br>Resolve 立即解决<br>Reinforcement 加固<br>None 暂无异常</p>
     */
    public String getSafetyAdvice() {
        return this.SafetyAdvice;
    }

    /**
     * Set <p>安全建议。<br>Resolve 立即解决<br>Reinforcement 加固<br>None 暂无异常</p>
     * @param SafetyAdvice <p>安全建议。<br>Resolve 立即解决<br>Reinforcement 加固<br>None 暂无异常</p>
     */
    public void setSafetyAdvice(String SafetyAdvice) {
        this.SafetyAdvice = SafetyAdvice;
    }

    /**
     * Get <p>日志投递状态。<br>0-投递关闭 1-投递打开 2-投递开通中 3-投递关闭中</p> 
     * @return LogDeliveryStatus <p>日志投递状态。<br>0-投递关闭 1-投递打开 2-投递开通中 3-投递关闭中</p>
     */
    public Long getLogDeliveryStatus() {
        return this.LogDeliveryStatus;
    }

    /**
     * Set <p>日志投递状态。<br>0-投递关闭 1-投递打开 2-投递开通中 3-投递关闭中</p>
     * @param LogDeliveryStatus <p>日志投递状态。<br>0-投递关闭 1-投递打开 2-投递开通中 3-投递关闭中</p>
     */
    public void setLogDeliveryStatus(Long LogDeliveryStatus) {
        this.LogDeliveryStatus = LogDeliveryStatus;
    }

    /**
     * Get <p>是否支持日志投递。0-不支持 1-支持</p> 
     * @return LogDeliverySupported <p>是否支持日志投递。0-不支持 1-支持</p>
     */
    public Long getLogDeliverySupported() {
        return this.LogDeliverySupported;
    }

    /**
     * Set <p>是否支持日志投递。0-不支持 1-支持</p>
     * @param LogDeliverySupported <p>是否支持日志投递。0-不支持 1-支持</p>
     */
    public void setLogDeliverySupported(Long LogDeliverySupported) {
        this.LogDeliverySupported = LogDeliverySupported;
    }

    /**
     * Get <p>数据扫描信息</p> 
     * @return DataScanInfo <p>数据扫描信息</p>
     */
    public DspmAssetDataScanDetail getDataScanInfo() {
        return this.DataScanInfo;
    }

    /**
     * Set <p>数据扫描信息</p>
     * @param DataScanInfo <p>数据扫描信息</p>
     */
    public void setDataScanInfo(DspmAssetDataScanDetail DataScanInfo) {
        this.DataScanInfo = DataScanInfo;
    }

    /**
     * Get <p>资产所属账号app id</p> 
     * @return AppId <p>资产所属账号app id</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>资产所属账号app id</p>
     * @param AppId <p>资产所属账号app id</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>账号昵称</p> 
     * @return NickName <p>账号昵称</p>
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set <p>账号昵称</p>
     * @param NickName <p>账号昵称</p>
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get <p>资产所属账号uin</p> 
     * @return Uin <p>资产所属账号uin</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>资产所属账号uin</p>
     * @param Uin <p>资产所属账号uin</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>安全分析状态（0-关闭 1-打开 2-开通中 3-关闭中）</p> 
     * @return SecurityAnalyseStatus <p>安全分析状态（0-关闭 1-打开 2-开通中 3-关闭中）</p>
     */
    public Long getSecurityAnalyseStatus() {
        return this.SecurityAnalyseStatus;
    }

    /**
     * Set <p>安全分析状态（0-关闭 1-打开 2-开通中 3-关闭中）</p>
     * @param SecurityAnalyseStatus <p>安全分析状态（0-关闭 1-打开 2-开通中 3-关闭中）</p>
     */
    public void setSecurityAnalyseStatus(Long SecurityAnalyseStatus) {
        this.SecurityAnalyseStatus = SecurityAnalyseStatus;
    }

    /**
     * Get <p>当前实例的总日志数</p> 
     * @return TotalAuditLogs <p>当前实例的总日志数</p>
     */
    public Long getTotalAuditLogs() {
        return this.TotalAuditLogs;
    }

    /**
     * Set <p>当前实例的总日志数</p>
     * @param TotalAuditLogs <p>当前实例的总日志数</p>
     */
    public void setTotalAuditLogs(Long TotalAuditLogs) {
        this.TotalAuditLogs = TotalAuditLogs;
    }

    /**
     * Get <p>日志审计禁止开通的原因，可选值：VersionNotSupportLogSubscription, InstanceIsUpgrading, CdbRuleAuditEnabled, AssetNotExists</p> 
     * @return LogDeliveryDisableReason <p>日志审计禁止开通的原因，可选值：VersionNotSupportLogSubscription, InstanceIsUpgrading, CdbRuleAuditEnabled, AssetNotExists</p>
     */
    public String getLogDeliveryDisableReason() {
        return this.LogDeliveryDisableReason;
    }

    /**
     * Set <p>日志审计禁止开通的原因，可选值：VersionNotSupportLogSubscription, InstanceIsUpgrading, CdbRuleAuditEnabled, AssetNotExists</p>
     * @param LogDeliveryDisableReason <p>日志审计禁止开通的原因，可选值：VersionNotSupportLogSubscription, InstanceIsUpgrading, CdbRuleAuditEnabled, AssetNotExists</p>
     */
    public void setLogDeliveryDisableReason(String LogDeliveryDisableReason) {
        this.LogDeliveryDisableReason = LogDeliveryDisableReason;
    }

    /**
     * Get <p>在线日志的起始时间戳，精确到秒</p> 
     * @return OldestOnlineLogTimestamp <p>在线日志的起始时间戳，精确到秒</p>
     */
    public Long getOldestOnlineLogTimestamp() {
        return this.OldestOnlineLogTimestamp;
    }

    /**
     * Set <p>在线日志的起始时间戳，精确到秒</p>
     * @param OldestOnlineLogTimestamp <p>在线日志的起始时间戳，精确到秒</p>
     */
    public void setOldestOnlineLogTimestamp(Long OldestOnlineLogTimestamp) {
        this.OldestOnlineLogTimestamp = OldestOnlineLogTimestamp;
    }

    /**
     * Get <p>在线日志的最新时间戳，精确到秒</p> 
     * @return NewestOnlineLogTimestamp <p>在线日志的最新时间戳，精确到秒</p>
     */
    public Long getNewestOnlineLogTimestamp() {
        return this.NewestOnlineLogTimestamp;
    }

    /**
     * Set <p>在线日志的最新时间戳，精确到秒</p>
     * @param NewestOnlineLogTimestamp <p>在线日志的最新时间戳，精确到秒</p>
     */
    public void setNewestOnlineLogTimestamp(Long NewestOnlineLogTimestamp) {
        this.NewestOnlineLogTimestamp = NewestOnlineLogTimestamp;
    }

    /**
     * Get <p>操作错误信息</p> 
     * @return OperationErrorMsg <p>操作错误信息</p>
     */
    public String getOperationErrorMsg() {
        return this.OperationErrorMsg;
    }

    /**
     * Set <p>操作错误信息</p>
     * @param OperationErrorMsg <p>操作错误信息</p>
     */
    public void setOperationErrorMsg(String OperationErrorMsg) {
        this.OperationErrorMsg = OperationErrorMsg;
    }

    /**
     * Get <p>是否支持账号操作。0 不支持；1 支持</p> 
     * @return AccountOptSupported <p>是否支持账号操作。0 不支持；1 支持</p>
     */
    public Long getAccountOptSupported() {
        return this.AccountOptSupported;
    }

    /**
     * Set <p>是否支持账号操作。0 不支持；1 支持</p>
     * @param AccountOptSupported <p>是否支持账号操作。0 不支持；1 支持</p>
     */
    public void setAccountOptSupported(Long AccountOptSupported) {
        this.AccountOptSupported = AccountOptSupported;
    }

    /**
     * Get <p>实例类型</p> 
     * @return InstanceType <p>实例类型</p>
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例类型</p>
     * @param InstanceType <p>实例类型</p>
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>集群类型（MongoDB），与云接口 DescribeDBInstances 的 ClusterType 一致：0-副本集 1-分片；非 MongoDB 资产固定 0</p> 
     * @return ClusterType <p>集群类型（MongoDB），与云接口 DescribeDBInstances 的 ClusterType 一致：0-副本集 1-分片；非 MongoDB 资产固定 0</p>
     */
    public Long getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>集群类型（MongoDB），与云接口 DescribeDBInstances 的 ClusterType 一致：0-副本集 1-分片；非 MongoDB 资产固定 0</p>
     * @param ClusterType <p>集群类型（MongoDB），与云接口 DescribeDBInstances 的 ClusterType 一致：0-副本集 1-分片；非 MongoDB 资产固定 0</p>
     */
    public void setClusterType(Long ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>是否支持敏感数据识别。0 不支持；1 支持</p> 
     * @return IdentifyScanSupported <p>是否支持敏感数据识别。0 不支持；1 支持</p>
     */
    public Long getIdentifyScanSupported() {
        return this.IdentifyScanSupported;
    }

    /**
     * Set <p>是否支持敏感数据识别。0 不支持；1 支持</p>
     * @param IdentifyScanSupported <p>是否支持敏感数据识别。0 不支持；1 支持</p>
     */
    public void setIdentifyScanSupported(Long IdentifyScanSupported) {
        this.IdentifyScanSupported = IdentifyScanSupported;
    }

    /**
     * Get <p>集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId <p>集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId <p>集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>集群名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterName <p>集群名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterName <p>集群名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    public DspmDbAsset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmDbAsset(DspmDbAsset source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AccountCount != null) {
            this.AccountCount = new Long(source.AccountCount);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.WanDomain != null) {
            this.WanDomain = new String(source.WanDomain);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Manager != null) {
            this.Manager = new DspmUinUser[source.Manager.length];
            for (int i = 0; i < source.Manager.length; i++) {
                this.Manager[i] = new DspmUinUser(source.Manager[i]);
            }
        }
        if (source.BindIdentify != null) {
            this.BindIdentify = new Long(source.BindIdentify);
        }
        if (source.IsManager != null) {
            this.IsManager = new Long(source.IsManager);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new DspmRiskCount(source.RiskCount);
        }
        if (source.SafetyAdvice != null) {
            this.SafetyAdvice = new String(source.SafetyAdvice);
        }
        if (source.LogDeliveryStatus != null) {
            this.LogDeliveryStatus = new Long(source.LogDeliveryStatus);
        }
        if (source.LogDeliverySupported != null) {
            this.LogDeliverySupported = new Long(source.LogDeliverySupported);
        }
        if (source.DataScanInfo != null) {
            this.DataScanInfo = new DspmAssetDataScanDetail(source.DataScanInfo);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SecurityAnalyseStatus != null) {
            this.SecurityAnalyseStatus = new Long(source.SecurityAnalyseStatus);
        }
        if (source.TotalAuditLogs != null) {
            this.TotalAuditLogs = new Long(source.TotalAuditLogs);
        }
        if (source.LogDeliveryDisableReason != null) {
            this.LogDeliveryDisableReason = new String(source.LogDeliveryDisableReason);
        }
        if (source.OldestOnlineLogTimestamp != null) {
            this.OldestOnlineLogTimestamp = new Long(source.OldestOnlineLogTimestamp);
        }
        if (source.NewestOnlineLogTimestamp != null) {
            this.NewestOnlineLogTimestamp = new Long(source.NewestOnlineLogTimestamp);
        }
        if (source.OperationErrorMsg != null) {
            this.OperationErrorMsg = new String(source.OperationErrorMsg);
        }
        if (source.AccountOptSupported != null) {
            this.AccountOptSupported = new Long(source.AccountOptSupported);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new Long(source.ClusterType);
        }
        if (source.IdentifyScanSupported != null) {
            this.IdentifyScanSupported = new Long(source.IdentifyScanSupported);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AccountCount", this.AccountCount);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "Manager.", this.Manager);
        this.setParamSimple(map, prefix + "BindIdentify", this.BindIdentify);
        this.setParamSimple(map, prefix + "IsManager", this.IsManager);
        this.setParamObj(map, prefix + "RiskCount.", this.RiskCount);
        this.setParamSimple(map, prefix + "SafetyAdvice", this.SafetyAdvice);
        this.setParamSimple(map, prefix + "LogDeliveryStatus", this.LogDeliveryStatus);
        this.setParamSimple(map, prefix + "LogDeliverySupported", this.LogDeliverySupported);
        this.setParamObj(map, prefix + "DataScanInfo.", this.DataScanInfo);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SecurityAnalyseStatus", this.SecurityAnalyseStatus);
        this.setParamSimple(map, prefix + "TotalAuditLogs", this.TotalAuditLogs);
        this.setParamSimple(map, prefix + "LogDeliveryDisableReason", this.LogDeliveryDisableReason);
        this.setParamSimple(map, prefix + "OldestOnlineLogTimestamp", this.OldestOnlineLogTimestamp);
        this.setParamSimple(map, prefix + "NewestOnlineLogTimestamp", this.NewestOnlineLogTimestamp);
        this.setParamSimple(map, prefix + "OperationErrorMsg", this.OperationErrorMsg);
        this.setParamSimple(map, prefix + "AccountOptSupported", this.AccountOptSupported);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "IdentifyScanSupported", this.IdentifyScanSupported);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);

    }
}

