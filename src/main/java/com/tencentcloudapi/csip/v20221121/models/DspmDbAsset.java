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
    * 资产实例Id
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 资产类型
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    *  资产名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 账号数
    */
    @SerializedName("AccountCount")
    @Expose
    private Long AccountCount;

    /**
    * 公网访问地址，如果有多个，使用';'分割
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 内网访问地址，如果有多个，使用';'分割
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 广域网域名地址，如果有多个，使用';'分割
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 资产所在vpc的vpcid
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 资产所在vpc的vpc名
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 资产所在vpc子网的subnetid
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 资产所在vpc子网名
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * 实例状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 管理者信息。
    */
    @SerializedName("Manager")
    @Expose
    private DspmUinUser [] Manager;

    /**
    * 是否绑定身份。0-未绑定 1-已绑定
    */
    @SerializedName("BindIdentify")
    @Expose
    private Long BindIdentify;

    /**
    * 是否管理员
    */
    @SerializedName("IsManager")
    @Expose
    private Long IsManager;

    /**
    * 风险统计信息
    */
    @SerializedName("RiskCount")
    @Expose
    private DspmRiskCount RiskCount;

    /**
    * 安全建议。
Resolve 立即解决
Reinforcement 加固
None 暂无异常

    */
    @SerializedName("SafetyAdvice")
    @Expose
    private String SafetyAdvice;

    /**
    * 日志投递状态。
0-投递关闭 1-投递打开 2-投递开通中 3-投递关闭中
    */
    @SerializedName("LogDeliveryStatus")
    @Expose
    private Long LogDeliveryStatus;

    /**
    * 是否支持日志投递。0-不支持 1-支持
    */
    @SerializedName("LogDeliverySupported")
    @Expose
    private Long LogDeliverySupported;

    /**
    * 数据扫描信息
    */
    @SerializedName("DataScanInfo")
    @Expose
    private DspmAssetDataScanDetail DataScanInfo;

    /**
    * 资产所属账号app id
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 账号昵称
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 资产所属账号uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 安全分析状态（0-关闭 1-打开 2-开通中 3-关闭中）

    */
    @SerializedName("SecurityAnalyseStatus")
    @Expose
    private Long SecurityAnalyseStatus;

    /**
    * 当前实例的总日志数
    */
    @SerializedName("TotalAuditLogs")
    @Expose
    private Long TotalAuditLogs;

    /**
    * 日志审计禁止开通的原因，可选值：VersionNotSupportLogSubscription, InstanceIsUpgrading, CdbRuleAuditEnabled, AssetNotExists
    */
    @SerializedName("LogDeliveryDisableReason")
    @Expose
    private String LogDeliveryDisableReason;

    /**
    * 在线日志的起始时间戳，精确到秒
    */
    @SerializedName("OldestOnlineLogTimestamp")
    @Expose
    private Long OldestOnlineLogTimestamp;

    /**
    * 在线日志的最新时间戳，精确到秒
    */
    @SerializedName("NewestOnlineLogTimestamp")
    @Expose
    private Long NewestOnlineLogTimestamp;

    /**
    * 操作错误信息
    */
    @SerializedName("OperationErrorMsg")
    @Expose
    private String OperationErrorMsg;

    /**
    * 是否支持账号操作。0 不支持；1 支持
    */
    @SerializedName("AccountOptSupported")
    @Expose
    private Long AccountOptSupported;

    /**
    * 实例类型
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * 集群类型（MongoDB），与云接口 DescribeDBInstances 的 ClusterType 一致：0-副本集 1-分片；非 MongoDB 资产固定 0
    */
    @SerializedName("ClusterType")
    @Expose
    private Long ClusterType;

    /**
    * 是否支持敏感数据识别。0 不支持；1 支持
    */
    @SerializedName("IdentifyScanSupported")
    @Expose
    private Long IdentifyScanSupported;

    /**
     * Get 资产实例Id 
     * @return AssetId 资产实例Id
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 资产实例Id
     * @param AssetId 资产实例Id
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 资产类型 
     * @return AssetType 资产类型
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 资产类型
     * @param AssetType 资产类型
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get  资产名 
     * @return Name  资产名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set  资产名
     * @param Name  资产名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 账号数 
     * @return AccountCount 账号数
     */
    public Long getAccountCount() {
        return this.AccountCount;
    }

    /**
     * Set 账号数
     * @param AccountCount 账号数
     */
    public void setAccountCount(Long AccountCount) {
        this.AccountCount = AccountCount;
    }

    /**
     * Get 公网访问地址，如果有多个，使用';'分割 
     * @return PublicIp 公网访问地址，如果有多个，使用';'分割
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 公网访问地址，如果有多个，使用';'分割
     * @param PublicIp 公网访问地址，如果有多个，使用';'分割
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 内网访问地址，如果有多个，使用';'分割 
     * @return PrivateIp 内网访问地址，如果有多个，使用';'分割
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 内网访问地址，如果有多个，使用';'分割
     * @param PrivateIp 内网访问地址，如果有多个，使用';'分割
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get 广域网域名地址，如果有多个，使用';'分割 
     * @return WanDomain 广域网域名地址，如果有多个，使用';'分割
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set 广域网域名地址，如果有多个，使用';'分割
     * @param WanDomain 广域网域名地址，如果有多个，使用';'分割
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
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
     * Get 资产所在vpc的vpcid 
     * @return VpcId 资产所在vpc的vpcid
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 资产所在vpc的vpcid
     * @param VpcId 资产所在vpc的vpcid
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 资产所在vpc的vpc名 
     * @return VpcName 资产所在vpc的vpc名
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set 资产所在vpc的vpc名
     * @param VpcName 资产所在vpc的vpc名
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get 资产所在vpc子网的subnetid 
     * @return SubnetId 资产所在vpc子网的subnetid
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 资产所在vpc子网的subnetid
     * @param SubnetId 资产所在vpc子网的subnetid
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 资产所在vpc子网名 
     * @return SubnetName 资产所在vpc子网名
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set 资产所在vpc子网名
     * @param SubnetName 资产所在vpc子网名
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get 实例状态 
     * @return Status 实例状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态
     * @param Status 实例状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 管理者信息。 
     * @return Manager 管理者信息。
     */
    public DspmUinUser [] getManager() {
        return this.Manager;
    }

    /**
     * Set 管理者信息。
     * @param Manager 管理者信息。
     */
    public void setManager(DspmUinUser [] Manager) {
        this.Manager = Manager;
    }

    /**
     * Get 是否绑定身份。0-未绑定 1-已绑定 
     * @return BindIdentify 是否绑定身份。0-未绑定 1-已绑定
     */
    public Long getBindIdentify() {
        return this.BindIdentify;
    }

    /**
     * Set 是否绑定身份。0-未绑定 1-已绑定
     * @param BindIdentify 是否绑定身份。0-未绑定 1-已绑定
     */
    public void setBindIdentify(Long BindIdentify) {
        this.BindIdentify = BindIdentify;
    }

    /**
     * Get 是否管理员 
     * @return IsManager 是否管理员
     */
    public Long getIsManager() {
        return this.IsManager;
    }

    /**
     * Set 是否管理员
     * @param IsManager 是否管理员
     */
    public void setIsManager(Long IsManager) {
        this.IsManager = IsManager;
    }

    /**
     * Get 风险统计信息 
     * @return RiskCount 风险统计信息
     */
    public DspmRiskCount getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set 风险统计信息
     * @param RiskCount 风险统计信息
     */
    public void setRiskCount(DspmRiskCount RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get 安全建议。
Resolve 立即解决
Reinforcement 加固
None 暂无异常
 
     * @return SafetyAdvice 安全建议。
Resolve 立即解决
Reinforcement 加固
None 暂无异常

     */
    public String getSafetyAdvice() {
        return this.SafetyAdvice;
    }

    /**
     * Set 安全建议。
Resolve 立即解决
Reinforcement 加固
None 暂无异常

     * @param SafetyAdvice 安全建议。
Resolve 立即解决
Reinforcement 加固
None 暂无异常

     */
    public void setSafetyAdvice(String SafetyAdvice) {
        this.SafetyAdvice = SafetyAdvice;
    }

    /**
     * Get 日志投递状态。
0-投递关闭 1-投递打开 2-投递开通中 3-投递关闭中 
     * @return LogDeliveryStatus 日志投递状态。
0-投递关闭 1-投递打开 2-投递开通中 3-投递关闭中
     */
    public Long getLogDeliveryStatus() {
        return this.LogDeliveryStatus;
    }

    /**
     * Set 日志投递状态。
0-投递关闭 1-投递打开 2-投递开通中 3-投递关闭中
     * @param LogDeliveryStatus 日志投递状态。
0-投递关闭 1-投递打开 2-投递开通中 3-投递关闭中
     */
    public void setLogDeliveryStatus(Long LogDeliveryStatus) {
        this.LogDeliveryStatus = LogDeliveryStatus;
    }

    /**
     * Get 是否支持日志投递。0-不支持 1-支持 
     * @return LogDeliverySupported 是否支持日志投递。0-不支持 1-支持
     */
    public Long getLogDeliverySupported() {
        return this.LogDeliverySupported;
    }

    /**
     * Set 是否支持日志投递。0-不支持 1-支持
     * @param LogDeliverySupported 是否支持日志投递。0-不支持 1-支持
     */
    public void setLogDeliverySupported(Long LogDeliverySupported) {
        this.LogDeliverySupported = LogDeliverySupported;
    }

    /**
     * Get 数据扫描信息 
     * @return DataScanInfo 数据扫描信息
     */
    public DspmAssetDataScanDetail getDataScanInfo() {
        return this.DataScanInfo;
    }

    /**
     * Set 数据扫描信息
     * @param DataScanInfo 数据扫描信息
     */
    public void setDataScanInfo(DspmAssetDataScanDetail DataScanInfo) {
        this.DataScanInfo = DataScanInfo;
    }

    /**
     * Get 资产所属账号app id 
     * @return AppId 资产所属账号app id
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 资产所属账号app id
     * @param AppId 资产所属账号app id
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 账号昵称 
     * @return NickName 账号昵称
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 账号昵称
     * @param NickName 账号昵称
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get 资产所属账号uin 
     * @return Uin 资产所属账号uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 资产所属账号uin
     * @param Uin 资产所属账号uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 安全分析状态（0-关闭 1-打开 2-开通中 3-关闭中）
 
     * @return SecurityAnalyseStatus 安全分析状态（0-关闭 1-打开 2-开通中 3-关闭中）

     */
    public Long getSecurityAnalyseStatus() {
        return this.SecurityAnalyseStatus;
    }

    /**
     * Set 安全分析状态（0-关闭 1-打开 2-开通中 3-关闭中）

     * @param SecurityAnalyseStatus 安全分析状态（0-关闭 1-打开 2-开通中 3-关闭中）

     */
    public void setSecurityAnalyseStatus(Long SecurityAnalyseStatus) {
        this.SecurityAnalyseStatus = SecurityAnalyseStatus;
    }

    /**
     * Get 当前实例的总日志数 
     * @return TotalAuditLogs 当前实例的总日志数
     */
    public Long getTotalAuditLogs() {
        return this.TotalAuditLogs;
    }

    /**
     * Set 当前实例的总日志数
     * @param TotalAuditLogs 当前实例的总日志数
     */
    public void setTotalAuditLogs(Long TotalAuditLogs) {
        this.TotalAuditLogs = TotalAuditLogs;
    }

    /**
     * Get 日志审计禁止开通的原因，可选值：VersionNotSupportLogSubscription, InstanceIsUpgrading, CdbRuleAuditEnabled, AssetNotExists 
     * @return LogDeliveryDisableReason 日志审计禁止开通的原因，可选值：VersionNotSupportLogSubscription, InstanceIsUpgrading, CdbRuleAuditEnabled, AssetNotExists
     */
    public String getLogDeliveryDisableReason() {
        return this.LogDeliveryDisableReason;
    }

    /**
     * Set 日志审计禁止开通的原因，可选值：VersionNotSupportLogSubscription, InstanceIsUpgrading, CdbRuleAuditEnabled, AssetNotExists
     * @param LogDeliveryDisableReason 日志审计禁止开通的原因，可选值：VersionNotSupportLogSubscription, InstanceIsUpgrading, CdbRuleAuditEnabled, AssetNotExists
     */
    public void setLogDeliveryDisableReason(String LogDeliveryDisableReason) {
        this.LogDeliveryDisableReason = LogDeliveryDisableReason;
    }

    /**
     * Get 在线日志的起始时间戳，精确到秒 
     * @return OldestOnlineLogTimestamp 在线日志的起始时间戳，精确到秒
     */
    public Long getOldestOnlineLogTimestamp() {
        return this.OldestOnlineLogTimestamp;
    }

    /**
     * Set 在线日志的起始时间戳，精确到秒
     * @param OldestOnlineLogTimestamp 在线日志的起始时间戳，精确到秒
     */
    public void setOldestOnlineLogTimestamp(Long OldestOnlineLogTimestamp) {
        this.OldestOnlineLogTimestamp = OldestOnlineLogTimestamp;
    }

    /**
     * Get 在线日志的最新时间戳，精确到秒 
     * @return NewestOnlineLogTimestamp 在线日志的最新时间戳，精确到秒
     */
    public Long getNewestOnlineLogTimestamp() {
        return this.NewestOnlineLogTimestamp;
    }

    /**
     * Set 在线日志的最新时间戳，精确到秒
     * @param NewestOnlineLogTimestamp 在线日志的最新时间戳，精确到秒
     */
    public void setNewestOnlineLogTimestamp(Long NewestOnlineLogTimestamp) {
        this.NewestOnlineLogTimestamp = NewestOnlineLogTimestamp;
    }

    /**
     * Get 操作错误信息 
     * @return OperationErrorMsg 操作错误信息
     */
    public String getOperationErrorMsg() {
        return this.OperationErrorMsg;
    }

    /**
     * Set 操作错误信息
     * @param OperationErrorMsg 操作错误信息
     */
    public void setOperationErrorMsg(String OperationErrorMsg) {
        this.OperationErrorMsg = OperationErrorMsg;
    }

    /**
     * Get 是否支持账号操作。0 不支持；1 支持 
     * @return AccountOptSupported 是否支持账号操作。0 不支持；1 支持
     */
    public Long getAccountOptSupported() {
        return this.AccountOptSupported;
    }

    /**
     * Set 是否支持账号操作。0 不支持；1 支持
     * @param AccountOptSupported 是否支持账号操作。0 不支持；1 支持
     */
    public void setAccountOptSupported(Long AccountOptSupported) {
        this.AccountOptSupported = AccountOptSupported;
    }

    /**
     * Get 实例类型 
     * @return InstanceType 实例类型
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型
     * @param InstanceType 实例类型
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 集群类型（MongoDB），与云接口 DescribeDBInstances 的 ClusterType 一致：0-副本集 1-分片；非 MongoDB 资产固定 0 
     * @return ClusterType 集群类型（MongoDB），与云接口 DescribeDBInstances 的 ClusterType 一致：0-副本集 1-分片；非 MongoDB 资产固定 0
     */
    public Long getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型（MongoDB），与云接口 DescribeDBInstances 的 ClusterType 一致：0-副本集 1-分片；非 MongoDB 资产固定 0
     * @param ClusterType 集群类型（MongoDB），与云接口 DescribeDBInstances 的 ClusterType 一致：0-副本集 1-分片；非 MongoDB 资产固定 0
     */
    public void setClusterType(Long ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 是否支持敏感数据识别。0 不支持；1 支持 
     * @return IdentifyScanSupported 是否支持敏感数据识别。0 不支持；1 支持
     */
    public Long getIdentifyScanSupported() {
        return this.IdentifyScanSupported;
    }

    /**
     * Set 是否支持敏感数据识别。0 不支持；1 支持
     * @param IdentifyScanSupported 是否支持敏感数据识别。0 不支持；1 支持
     */
    public void setIdentifyScanSupported(Long IdentifyScanSupported) {
        this.IdentifyScanSupported = IdentifyScanSupported;
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

    }
}

