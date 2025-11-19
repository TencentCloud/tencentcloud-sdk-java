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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInfo extends AbstractModel {

    /**
    * 实例唯一ID
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
    * 实例对应资源ID，计费使用
    */
    @SerializedName("ResourceIds")
    @Expose
    private String ResourceIds;

    /**
    * 实例所属地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 付费模式
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 自动续费标识。
0：关闭
1：开启
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * 弹性计费开关。
0：关闭
1：开启
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 实例套餐版本。
101：小微版
102：超轻版
2：高级版
3：企业版
4：旗舰版
6：独享版
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 实例过期时间
    */
    @SerializedName("ValidTime")
    @Expose
    private String ValidTime;

    /**
    * 实例开始时间
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 已配置域名个数
    */
    @SerializedName("DomainCount")
    @Expose
    private Long DomainCount;

    /**
    * 域名数量上限
    */
    @SerializedName("SubDomainLimit")
    @Expose
    private Long SubDomainLimit;

    /**
    * 已配置主域名个数
    */
    @SerializedName("MainDomainCount")
    @Expose
    private Long MainDomainCount;

    /**
    * 主域名数量上限
    */
    @SerializedName("MainDomainLimit")
    @Expose
    private Long MainDomainLimit;

    /**
    * 实例30天内QPS峰值
    */
    @SerializedName("MaxQPS")
    @Expose
    private Long MaxQPS;

    /**
    * qps扩展包信息
    */
    @SerializedName("QPS")
    @Expose
    private QPSPackageNew QPS;

    /**
    * 域名扩展包信息
    */
    @SerializedName("DomainPkg")
    @Expose
    private DomainPackageNew DomainPkg;

    /**
    * 用户appid
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * clb或saas
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * 业务安全包
    */
    @SerializedName("FraudPkg")
    @Expose
    private FraudPkg FraudPkg;

    /**
    * Bot资源包
    */
    @SerializedName("BotPkg")
    @Expose
    private BotPkg BotPkg;

    /**
    * bot的qps详情
    */
    @SerializedName("BotQPS")
    @Expose
    private BotQPS BotQPS;

    /**
    * qps弹性计费上限
    */
    @SerializedName("ElasticBilling")
    @Expose
    private Long ElasticBilling;

    /**
    * 攻击日志投递开关
    */
    @SerializedName("AttackLogPost")
    @Expose
    private Long AttackLogPost;

    /**
    * 带宽峰值，单位为B/s(字节每秒)
    */
    @SerializedName("MaxBandwidth")
    @Expose
    private Long MaxBandwidth;

    /**
    * api安全是否购买
    */
    @SerializedName("APISecurity")
    @Expose
    private Long APISecurity;

    /**
    * 购买的qps规格
    */
    @SerializedName("QpsStandard")
    @Expose
    private Long QpsStandard;

    /**
    * 购买的带宽规格
    */
    @SerializedName("BandwidthStandard")
    @Expose
    private Long BandwidthStandard;

    /**
    * 实例状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 实例沙箱qps值
    */
    @SerializedName("SandboxQps")
    @Expose
    private Long SandboxQps;

    /**
    * 是否api 安全试用
    */
    @SerializedName("IsAPISecurityTrial")
    @Expose
    private Long IsAPISecurityTrial;

    /**
    * 重保包
    */
    @SerializedName("MajorEventsPkg")
    @Expose
    private MajorEventsPkg MajorEventsPkg;

    /**
    * 混合云子节点包
    */
    @SerializedName("HybridPkg")
    @Expose
    private HybridPkg HybridPkg;

    /**
    * API安全资源包
    */
    @SerializedName("ApiPkg")
    @Expose
    private ApiPkg ApiPkg;

    /**
    * 小程序安全加速包
    */
    @SerializedName("MiniPkg")
    @Expose
    private MiniPkg MiniPkg;

    /**
    * 小程序qps规格
    */
    @SerializedName("MiniQpsStandard")
    @Expose
    private Long MiniQpsStandard;

    /**
    * 小程序qps峰值
    */
    @SerializedName("MiniMaxQPS")
    @Expose
    private Long MiniMaxQPS;

    /**
    * 最近一次超量时间
    */
    @SerializedName("LastQpsExceedTime")
    @Expose
    private String LastQpsExceedTime;

    /**
    * 小程序安全接入ID数量扩张包
    */
    @SerializedName("MiniExtendPkg")
    @Expose
    private MiniExtendPkg MiniExtendPkg;

    /**
    * 计费项
    */
    @SerializedName("BillingItem")
    @Expose
    private String BillingItem;

    /**
    * 实例延期释放标识
    */
    @SerializedName("FreeDelayFlag")
    @Expose
    private Long FreeDelayFlag;

    /**
    * 最近3天最大qps
    */
    @SerializedName("Last3MaxQPS")
    @Expose
    private Long Last3MaxQPS;

    /**
    * 最近3天最大带宽
    */
    @SerializedName("Last3MaxBandwidth")
    @Expose
    private Long Last3MaxBandwidth;

    /**
    * 重保增强包
    */
    @SerializedName("MajorEventsProPkg")
    @Expose
    private MajorEventsProPkg MajorEventsProPkg;

    /**
    * 1是基础2025版本；0不是
    */
    @SerializedName("BasicFlag")
    @Expose
    private Long BasicFlag;

    /**
    * 实例的网络配置
    */
    @SerializedName("NetworkConfig")
    @Expose
    private NetworkConfig NetworkConfig;

    /**
    * RCE设备安全信息包
    */
    @SerializedName("RCEPkg")
    @Expose
    private RCEPkg RCEPkg;

    /**
    * 超量策略。0：超量沙箱
1：超量限流
    */
    @SerializedName("ExceedPolicy")
    @Expose
    private Long ExceedPolicy;

    /**
    * 大模型安全信息包
    */
    @SerializedName("LLMPkg")
    @Expose
    private LLMPkg LLMPkg;

    /**
    * 弹性资源Id
    */
    @SerializedName("ElasticResourceId")
    @Expose
    private String ElasticResourceId;

    /**
    * 预付费大模型安全信息包
    */
    @SerializedName("LLMMonPkg")
    @Expose
    private LLMMonPkg LLMMonPkg;

    /**
    * 地域id
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
     * Get 实例唯一ID 
     * @return InstanceId 实例唯一ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例唯一ID
     * @param InstanceId 实例唯一ID
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
     * Get 实例对应资源ID，计费使用 
     * @return ResourceIds 实例对应资源ID，计费使用
     */
    public String getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set 实例对应资源ID，计费使用
     * @param ResourceIds 实例对应资源ID，计费使用
     */
    public void setResourceIds(String ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get 实例所属地域 
     * @return Region 实例所属地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 实例所属地域
     * @param Region 实例所属地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 付费模式 
     * @return PayMode 付费模式
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式
     * @param PayMode 付费模式
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 自动续费标识。
0：关闭
1：开启 
     * @return RenewFlag 自动续费标识。
0：关闭
1：开启
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费标识。
0：关闭
1：开启
     * @param RenewFlag 自动续费标识。
0：关闭
1：开启
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 弹性计费开关。
0：关闭
1：开启 
     * @return Mode 弹性计费开关。
0：关闭
1：开启
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 弹性计费开关。
0：关闭
1：开启
     * @param Mode 弹性计费开关。
0：关闭
1：开启
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 实例套餐版本。
101：小微版
102：超轻版
2：高级版
3：企业版
4：旗舰版
6：独享版 
     * @return Level 实例套餐版本。
101：小微版
102：超轻版
2：高级版
3：企业版
4：旗舰版
6：独享版
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 实例套餐版本。
101：小微版
102：超轻版
2：高级版
3：企业版
4：旗舰版
6：独享版
     * @param Level 实例套餐版本。
101：小微版
102：超轻版
2：高级版
3：企业版
4：旗舰版
6：独享版
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 实例过期时间 
     * @return ValidTime 实例过期时间
     */
    public String getValidTime() {
        return this.ValidTime;
    }

    /**
     * Set 实例过期时间
     * @param ValidTime 实例过期时间
     */
    public void setValidTime(String ValidTime) {
        this.ValidTime = ValidTime;
    }

    /**
     * Get 实例开始时间 
     * @return BeginTime 实例开始时间
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 实例开始时间
     * @param BeginTime 实例开始时间
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 已配置域名个数 
     * @return DomainCount 已配置域名个数
     */
    public Long getDomainCount() {
        return this.DomainCount;
    }

    /**
     * Set 已配置域名个数
     * @param DomainCount 已配置域名个数
     */
    public void setDomainCount(Long DomainCount) {
        this.DomainCount = DomainCount;
    }

    /**
     * Get 域名数量上限 
     * @return SubDomainLimit 域名数量上限
     */
    public Long getSubDomainLimit() {
        return this.SubDomainLimit;
    }

    /**
     * Set 域名数量上限
     * @param SubDomainLimit 域名数量上限
     */
    public void setSubDomainLimit(Long SubDomainLimit) {
        this.SubDomainLimit = SubDomainLimit;
    }

    /**
     * Get 已配置主域名个数 
     * @return MainDomainCount 已配置主域名个数
     */
    public Long getMainDomainCount() {
        return this.MainDomainCount;
    }

    /**
     * Set 已配置主域名个数
     * @param MainDomainCount 已配置主域名个数
     */
    public void setMainDomainCount(Long MainDomainCount) {
        this.MainDomainCount = MainDomainCount;
    }

    /**
     * Get 主域名数量上限 
     * @return MainDomainLimit 主域名数量上限
     */
    public Long getMainDomainLimit() {
        return this.MainDomainLimit;
    }

    /**
     * Set 主域名数量上限
     * @param MainDomainLimit 主域名数量上限
     */
    public void setMainDomainLimit(Long MainDomainLimit) {
        this.MainDomainLimit = MainDomainLimit;
    }

    /**
     * Get 实例30天内QPS峰值 
     * @return MaxQPS 实例30天内QPS峰值
     */
    public Long getMaxQPS() {
        return this.MaxQPS;
    }

    /**
     * Set 实例30天内QPS峰值
     * @param MaxQPS 实例30天内QPS峰值
     */
    public void setMaxQPS(Long MaxQPS) {
        this.MaxQPS = MaxQPS;
    }

    /**
     * Get qps扩展包信息 
     * @return QPS qps扩展包信息
     */
    public QPSPackageNew getQPS() {
        return this.QPS;
    }

    /**
     * Set qps扩展包信息
     * @param QPS qps扩展包信息
     */
    public void setQPS(QPSPackageNew QPS) {
        this.QPS = QPS;
    }

    /**
     * Get 域名扩展包信息 
     * @return DomainPkg 域名扩展包信息
     */
    public DomainPackageNew getDomainPkg() {
        return this.DomainPkg;
    }

    /**
     * Set 域名扩展包信息
     * @param DomainPkg 域名扩展包信息
     */
    public void setDomainPkg(DomainPackageNew DomainPkg) {
        this.DomainPkg = DomainPkg;
    }

    /**
     * Get 用户appid 
     * @return AppId 用户appid
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户appid
     * @param AppId 用户appid
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get clb或saas 
     * @return Edition clb或saas
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set clb或saas
     * @param Edition clb或saas
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get 业务安全包 
     * @return FraudPkg 业务安全包
     */
    public FraudPkg getFraudPkg() {
        return this.FraudPkg;
    }

    /**
     * Set 业务安全包
     * @param FraudPkg 业务安全包
     */
    public void setFraudPkg(FraudPkg FraudPkg) {
        this.FraudPkg = FraudPkg;
    }

    /**
     * Get Bot资源包 
     * @return BotPkg Bot资源包
     */
    public BotPkg getBotPkg() {
        return this.BotPkg;
    }

    /**
     * Set Bot资源包
     * @param BotPkg Bot资源包
     */
    public void setBotPkg(BotPkg BotPkg) {
        this.BotPkg = BotPkg;
    }

    /**
     * Get bot的qps详情 
     * @return BotQPS bot的qps详情
     */
    public BotQPS getBotQPS() {
        return this.BotQPS;
    }

    /**
     * Set bot的qps详情
     * @param BotQPS bot的qps详情
     */
    public void setBotQPS(BotQPS BotQPS) {
        this.BotQPS = BotQPS;
    }

    /**
     * Get qps弹性计费上限 
     * @return ElasticBilling qps弹性计费上限
     */
    public Long getElasticBilling() {
        return this.ElasticBilling;
    }

    /**
     * Set qps弹性计费上限
     * @param ElasticBilling qps弹性计费上限
     */
    public void setElasticBilling(Long ElasticBilling) {
        this.ElasticBilling = ElasticBilling;
    }

    /**
     * Get 攻击日志投递开关 
     * @return AttackLogPost 攻击日志投递开关
     */
    public Long getAttackLogPost() {
        return this.AttackLogPost;
    }

    /**
     * Set 攻击日志投递开关
     * @param AttackLogPost 攻击日志投递开关
     */
    public void setAttackLogPost(Long AttackLogPost) {
        this.AttackLogPost = AttackLogPost;
    }

    /**
     * Get 带宽峰值，单位为B/s(字节每秒) 
     * @return MaxBandwidth 带宽峰值，单位为B/s(字节每秒)
     */
    public Long getMaxBandwidth() {
        return this.MaxBandwidth;
    }

    /**
     * Set 带宽峰值，单位为B/s(字节每秒)
     * @param MaxBandwidth 带宽峰值，单位为B/s(字节每秒)
     */
    public void setMaxBandwidth(Long MaxBandwidth) {
        this.MaxBandwidth = MaxBandwidth;
    }

    /**
     * Get api安全是否购买 
     * @return APISecurity api安全是否购买
     */
    public Long getAPISecurity() {
        return this.APISecurity;
    }

    /**
     * Set api安全是否购买
     * @param APISecurity api安全是否购买
     */
    public void setAPISecurity(Long APISecurity) {
        this.APISecurity = APISecurity;
    }

    /**
     * Get 购买的qps规格 
     * @return QpsStandard 购买的qps规格
     */
    public Long getQpsStandard() {
        return this.QpsStandard;
    }

    /**
     * Set 购买的qps规格
     * @param QpsStandard 购买的qps规格
     */
    public void setQpsStandard(Long QpsStandard) {
        this.QpsStandard = QpsStandard;
    }

    /**
     * Get 购买的带宽规格 
     * @return BandwidthStandard 购买的带宽规格
     */
    public Long getBandwidthStandard() {
        return this.BandwidthStandard;
    }

    /**
     * Set 购买的带宽规格
     * @param BandwidthStandard 购买的带宽规格
     */
    public void setBandwidthStandard(Long BandwidthStandard) {
        this.BandwidthStandard = BandwidthStandard;
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
     * Get 实例沙箱qps值 
     * @return SandboxQps 实例沙箱qps值
     */
    public Long getSandboxQps() {
        return this.SandboxQps;
    }

    /**
     * Set 实例沙箱qps值
     * @param SandboxQps 实例沙箱qps值
     */
    public void setSandboxQps(Long SandboxQps) {
        this.SandboxQps = SandboxQps;
    }

    /**
     * Get 是否api 安全试用 
     * @return IsAPISecurityTrial 是否api 安全试用
     */
    public Long getIsAPISecurityTrial() {
        return this.IsAPISecurityTrial;
    }

    /**
     * Set 是否api 安全试用
     * @param IsAPISecurityTrial 是否api 安全试用
     */
    public void setIsAPISecurityTrial(Long IsAPISecurityTrial) {
        this.IsAPISecurityTrial = IsAPISecurityTrial;
    }

    /**
     * Get 重保包 
     * @return MajorEventsPkg 重保包
     */
    public MajorEventsPkg getMajorEventsPkg() {
        return this.MajorEventsPkg;
    }

    /**
     * Set 重保包
     * @param MajorEventsPkg 重保包
     */
    public void setMajorEventsPkg(MajorEventsPkg MajorEventsPkg) {
        this.MajorEventsPkg = MajorEventsPkg;
    }

    /**
     * Get 混合云子节点包 
     * @return HybridPkg 混合云子节点包
     */
    public HybridPkg getHybridPkg() {
        return this.HybridPkg;
    }

    /**
     * Set 混合云子节点包
     * @param HybridPkg 混合云子节点包
     */
    public void setHybridPkg(HybridPkg HybridPkg) {
        this.HybridPkg = HybridPkg;
    }

    /**
     * Get API安全资源包 
     * @return ApiPkg API安全资源包
     */
    public ApiPkg getApiPkg() {
        return this.ApiPkg;
    }

    /**
     * Set API安全资源包
     * @param ApiPkg API安全资源包
     */
    public void setApiPkg(ApiPkg ApiPkg) {
        this.ApiPkg = ApiPkg;
    }

    /**
     * Get 小程序安全加速包 
     * @return MiniPkg 小程序安全加速包
     */
    public MiniPkg getMiniPkg() {
        return this.MiniPkg;
    }

    /**
     * Set 小程序安全加速包
     * @param MiniPkg 小程序安全加速包
     */
    public void setMiniPkg(MiniPkg MiniPkg) {
        this.MiniPkg = MiniPkg;
    }

    /**
     * Get 小程序qps规格 
     * @return MiniQpsStandard 小程序qps规格
     */
    public Long getMiniQpsStandard() {
        return this.MiniQpsStandard;
    }

    /**
     * Set 小程序qps规格
     * @param MiniQpsStandard 小程序qps规格
     */
    public void setMiniQpsStandard(Long MiniQpsStandard) {
        this.MiniQpsStandard = MiniQpsStandard;
    }

    /**
     * Get 小程序qps峰值 
     * @return MiniMaxQPS 小程序qps峰值
     */
    public Long getMiniMaxQPS() {
        return this.MiniMaxQPS;
    }

    /**
     * Set 小程序qps峰值
     * @param MiniMaxQPS 小程序qps峰值
     */
    public void setMiniMaxQPS(Long MiniMaxQPS) {
        this.MiniMaxQPS = MiniMaxQPS;
    }

    /**
     * Get 最近一次超量时间 
     * @return LastQpsExceedTime 最近一次超量时间
     */
    public String getLastQpsExceedTime() {
        return this.LastQpsExceedTime;
    }

    /**
     * Set 最近一次超量时间
     * @param LastQpsExceedTime 最近一次超量时间
     */
    public void setLastQpsExceedTime(String LastQpsExceedTime) {
        this.LastQpsExceedTime = LastQpsExceedTime;
    }

    /**
     * Get 小程序安全接入ID数量扩张包 
     * @return MiniExtendPkg 小程序安全接入ID数量扩张包
     */
    public MiniExtendPkg getMiniExtendPkg() {
        return this.MiniExtendPkg;
    }

    /**
     * Set 小程序安全接入ID数量扩张包
     * @param MiniExtendPkg 小程序安全接入ID数量扩张包
     */
    public void setMiniExtendPkg(MiniExtendPkg MiniExtendPkg) {
        this.MiniExtendPkg = MiniExtendPkg;
    }

    /**
     * Get 计费项 
     * @return BillingItem 计费项
     */
    public String getBillingItem() {
        return this.BillingItem;
    }

    /**
     * Set 计费项
     * @param BillingItem 计费项
     */
    public void setBillingItem(String BillingItem) {
        this.BillingItem = BillingItem;
    }

    /**
     * Get 实例延期释放标识 
     * @return FreeDelayFlag 实例延期释放标识
     */
    public Long getFreeDelayFlag() {
        return this.FreeDelayFlag;
    }

    /**
     * Set 实例延期释放标识
     * @param FreeDelayFlag 实例延期释放标识
     */
    public void setFreeDelayFlag(Long FreeDelayFlag) {
        this.FreeDelayFlag = FreeDelayFlag;
    }

    /**
     * Get 最近3天最大qps 
     * @return Last3MaxQPS 最近3天最大qps
     */
    public Long getLast3MaxQPS() {
        return this.Last3MaxQPS;
    }

    /**
     * Set 最近3天最大qps
     * @param Last3MaxQPS 最近3天最大qps
     */
    public void setLast3MaxQPS(Long Last3MaxQPS) {
        this.Last3MaxQPS = Last3MaxQPS;
    }

    /**
     * Get 最近3天最大带宽 
     * @return Last3MaxBandwidth 最近3天最大带宽
     */
    public Long getLast3MaxBandwidth() {
        return this.Last3MaxBandwidth;
    }

    /**
     * Set 最近3天最大带宽
     * @param Last3MaxBandwidth 最近3天最大带宽
     */
    public void setLast3MaxBandwidth(Long Last3MaxBandwidth) {
        this.Last3MaxBandwidth = Last3MaxBandwidth;
    }

    /**
     * Get 重保增强包 
     * @return MajorEventsProPkg 重保增强包
     */
    public MajorEventsProPkg getMajorEventsProPkg() {
        return this.MajorEventsProPkg;
    }

    /**
     * Set 重保增强包
     * @param MajorEventsProPkg 重保增强包
     */
    public void setMajorEventsProPkg(MajorEventsProPkg MajorEventsProPkg) {
        this.MajorEventsProPkg = MajorEventsProPkg;
    }

    /**
     * Get 1是基础2025版本；0不是 
     * @return BasicFlag 1是基础2025版本；0不是
     */
    public Long getBasicFlag() {
        return this.BasicFlag;
    }

    /**
     * Set 1是基础2025版本；0不是
     * @param BasicFlag 1是基础2025版本；0不是
     */
    public void setBasicFlag(Long BasicFlag) {
        this.BasicFlag = BasicFlag;
    }

    /**
     * Get 实例的网络配置 
     * @return NetworkConfig 实例的网络配置
     */
    public NetworkConfig getNetworkConfig() {
        return this.NetworkConfig;
    }

    /**
     * Set 实例的网络配置
     * @param NetworkConfig 实例的网络配置
     */
    public void setNetworkConfig(NetworkConfig NetworkConfig) {
        this.NetworkConfig = NetworkConfig;
    }

    /**
     * Get RCE设备安全信息包 
     * @return RCEPkg RCE设备安全信息包
     */
    public RCEPkg getRCEPkg() {
        return this.RCEPkg;
    }

    /**
     * Set RCE设备安全信息包
     * @param RCEPkg RCE设备安全信息包
     */
    public void setRCEPkg(RCEPkg RCEPkg) {
        this.RCEPkg = RCEPkg;
    }

    /**
     * Get 超量策略。0：超量沙箱
1：超量限流 
     * @return ExceedPolicy 超量策略。0：超量沙箱
1：超量限流
     */
    public Long getExceedPolicy() {
        return this.ExceedPolicy;
    }

    /**
     * Set 超量策略。0：超量沙箱
1：超量限流
     * @param ExceedPolicy 超量策略。0：超量沙箱
1：超量限流
     */
    public void setExceedPolicy(Long ExceedPolicy) {
        this.ExceedPolicy = ExceedPolicy;
    }

    /**
     * Get 大模型安全信息包 
     * @return LLMPkg 大模型安全信息包
     */
    public LLMPkg getLLMPkg() {
        return this.LLMPkg;
    }

    /**
     * Set 大模型安全信息包
     * @param LLMPkg 大模型安全信息包
     */
    public void setLLMPkg(LLMPkg LLMPkg) {
        this.LLMPkg = LLMPkg;
    }

    /**
     * Get 弹性资源Id 
     * @return ElasticResourceId 弹性资源Id
     */
    public String getElasticResourceId() {
        return this.ElasticResourceId;
    }

    /**
     * Set 弹性资源Id
     * @param ElasticResourceId 弹性资源Id
     */
    public void setElasticResourceId(String ElasticResourceId) {
        this.ElasticResourceId = ElasticResourceId;
    }

    /**
     * Get 预付费大模型安全信息包 
     * @return LLMMonPkg 预付费大模型安全信息包
     */
    public LLMMonPkg getLLMMonPkg() {
        return this.LLMMonPkg;
    }

    /**
     * Set 预付费大模型安全信息包
     * @param LLMMonPkg 预付费大模型安全信息包
     */
    public void setLLMMonPkg(LLMMonPkg LLMMonPkg) {
        this.LLMMonPkg = LLMMonPkg;
    }

    /**
     * Get 地域id 
     * @return RegionId 地域id
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域id
     * @param RegionId 地域id
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
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
        if (source.ResourceIds != null) {
            this.ResourceIds = new String(source.ResourceIds);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.ValidTime != null) {
            this.ValidTime = new String(source.ValidTime);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.DomainCount != null) {
            this.DomainCount = new Long(source.DomainCount);
        }
        if (source.SubDomainLimit != null) {
            this.SubDomainLimit = new Long(source.SubDomainLimit);
        }
        if (source.MainDomainCount != null) {
            this.MainDomainCount = new Long(source.MainDomainCount);
        }
        if (source.MainDomainLimit != null) {
            this.MainDomainLimit = new Long(source.MainDomainLimit);
        }
        if (source.MaxQPS != null) {
            this.MaxQPS = new Long(source.MaxQPS);
        }
        if (source.QPS != null) {
            this.QPS = new QPSPackageNew(source.QPS);
        }
        if (source.DomainPkg != null) {
            this.DomainPkg = new DomainPackageNew(source.DomainPkg);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.FraudPkg != null) {
            this.FraudPkg = new FraudPkg(source.FraudPkg);
        }
        if (source.BotPkg != null) {
            this.BotPkg = new BotPkg(source.BotPkg);
        }
        if (source.BotQPS != null) {
            this.BotQPS = new BotQPS(source.BotQPS);
        }
        if (source.ElasticBilling != null) {
            this.ElasticBilling = new Long(source.ElasticBilling);
        }
        if (source.AttackLogPost != null) {
            this.AttackLogPost = new Long(source.AttackLogPost);
        }
        if (source.MaxBandwidth != null) {
            this.MaxBandwidth = new Long(source.MaxBandwidth);
        }
        if (source.APISecurity != null) {
            this.APISecurity = new Long(source.APISecurity);
        }
        if (source.QpsStandard != null) {
            this.QpsStandard = new Long(source.QpsStandard);
        }
        if (source.BandwidthStandard != null) {
            this.BandwidthStandard = new Long(source.BandwidthStandard);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SandboxQps != null) {
            this.SandboxQps = new Long(source.SandboxQps);
        }
        if (source.IsAPISecurityTrial != null) {
            this.IsAPISecurityTrial = new Long(source.IsAPISecurityTrial);
        }
        if (source.MajorEventsPkg != null) {
            this.MajorEventsPkg = new MajorEventsPkg(source.MajorEventsPkg);
        }
        if (source.HybridPkg != null) {
            this.HybridPkg = new HybridPkg(source.HybridPkg);
        }
        if (source.ApiPkg != null) {
            this.ApiPkg = new ApiPkg(source.ApiPkg);
        }
        if (source.MiniPkg != null) {
            this.MiniPkg = new MiniPkg(source.MiniPkg);
        }
        if (source.MiniQpsStandard != null) {
            this.MiniQpsStandard = new Long(source.MiniQpsStandard);
        }
        if (source.MiniMaxQPS != null) {
            this.MiniMaxQPS = new Long(source.MiniMaxQPS);
        }
        if (source.LastQpsExceedTime != null) {
            this.LastQpsExceedTime = new String(source.LastQpsExceedTime);
        }
        if (source.MiniExtendPkg != null) {
            this.MiniExtendPkg = new MiniExtendPkg(source.MiniExtendPkg);
        }
        if (source.BillingItem != null) {
            this.BillingItem = new String(source.BillingItem);
        }
        if (source.FreeDelayFlag != null) {
            this.FreeDelayFlag = new Long(source.FreeDelayFlag);
        }
        if (source.Last3MaxQPS != null) {
            this.Last3MaxQPS = new Long(source.Last3MaxQPS);
        }
        if (source.Last3MaxBandwidth != null) {
            this.Last3MaxBandwidth = new Long(source.Last3MaxBandwidth);
        }
        if (source.MajorEventsProPkg != null) {
            this.MajorEventsProPkg = new MajorEventsProPkg(source.MajorEventsProPkg);
        }
        if (source.BasicFlag != null) {
            this.BasicFlag = new Long(source.BasicFlag);
        }
        if (source.NetworkConfig != null) {
            this.NetworkConfig = new NetworkConfig(source.NetworkConfig);
        }
        if (source.RCEPkg != null) {
            this.RCEPkg = new RCEPkg(source.RCEPkg);
        }
        if (source.ExceedPolicy != null) {
            this.ExceedPolicy = new Long(source.ExceedPolicy);
        }
        if (source.LLMPkg != null) {
            this.LLMPkg = new LLMPkg(source.LLMPkg);
        }
        if (source.ElasticResourceId != null) {
            this.ElasticResourceId = new String(source.ElasticResourceId);
        }
        if (source.LLMMonPkg != null) {
            this.LLMMonPkg = new LLMMonPkg(source.LLMMonPkg);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ResourceIds", this.ResourceIds);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "ValidTime", this.ValidTime);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "DomainCount", this.DomainCount);
        this.setParamSimple(map, prefix + "SubDomainLimit", this.SubDomainLimit);
        this.setParamSimple(map, prefix + "MainDomainCount", this.MainDomainCount);
        this.setParamSimple(map, prefix + "MainDomainLimit", this.MainDomainLimit);
        this.setParamSimple(map, prefix + "MaxQPS", this.MaxQPS);
        this.setParamObj(map, prefix + "QPS.", this.QPS);
        this.setParamObj(map, prefix + "DomainPkg.", this.DomainPkg);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamObj(map, prefix + "FraudPkg.", this.FraudPkg);
        this.setParamObj(map, prefix + "BotPkg.", this.BotPkg);
        this.setParamObj(map, prefix + "BotQPS.", this.BotQPS);
        this.setParamSimple(map, prefix + "ElasticBilling", this.ElasticBilling);
        this.setParamSimple(map, prefix + "AttackLogPost", this.AttackLogPost);
        this.setParamSimple(map, prefix + "MaxBandwidth", this.MaxBandwidth);
        this.setParamSimple(map, prefix + "APISecurity", this.APISecurity);
        this.setParamSimple(map, prefix + "QpsStandard", this.QpsStandard);
        this.setParamSimple(map, prefix + "BandwidthStandard", this.BandwidthStandard);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SandboxQps", this.SandboxQps);
        this.setParamSimple(map, prefix + "IsAPISecurityTrial", this.IsAPISecurityTrial);
        this.setParamObj(map, prefix + "MajorEventsPkg.", this.MajorEventsPkg);
        this.setParamObj(map, prefix + "HybridPkg.", this.HybridPkg);
        this.setParamObj(map, prefix + "ApiPkg.", this.ApiPkg);
        this.setParamObj(map, prefix + "MiniPkg.", this.MiniPkg);
        this.setParamSimple(map, prefix + "MiniQpsStandard", this.MiniQpsStandard);
        this.setParamSimple(map, prefix + "MiniMaxQPS", this.MiniMaxQPS);
        this.setParamSimple(map, prefix + "LastQpsExceedTime", this.LastQpsExceedTime);
        this.setParamObj(map, prefix + "MiniExtendPkg.", this.MiniExtendPkg);
        this.setParamSimple(map, prefix + "BillingItem", this.BillingItem);
        this.setParamSimple(map, prefix + "FreeDelayFlag", this.FreeDelayFlag);
        this.setParamSimple(map, prefix + "Last3MaxQPS", this.Last3MaxQPS);
        this.setParamSimple(map, prefix + "Last3MaxBandwidth", this.Last3MaxBandwidth);
        this.setParamObj(map, prefix + "MajorEventsProPkg.", this.MajorEventsProPkg);
        this.setParamSimple(map, prefix + "BasicFlag", this.BasicFlag);
        this.setParamObj(map, prefix + "NetworkConfig.", this.NetworkConfig);
        this.setParamObj(map, prefix + "RCEPkg.", this.RCEPkg);
        this.setParamSimple(map, prefix + "ExceedPolicy", this.ExceedPolicy);
        this.setParamObj(map, prefix + "LLMPkg.", this.LLMPkg);
        this.setParamSimple(map, prefix + "ElasticResourceId", this.ElasticResourceId);
        this.setParamObj(map, prefix + "LLMMonPkg.", this.LLMMonPkg);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);

    }
}

