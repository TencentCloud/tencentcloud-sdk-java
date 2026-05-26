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
    * <p>实例唯一ID</p>
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
    * <p>实例对应资源ID，计费使用</p>
    */
    @SerializedName("ResourceIds")
    @Expose
    private String ResourceIds;

    /**
    * <p>实例所属地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>付费模式</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>自动续费标识。<br>0：关闭<br>1：开启</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>弹性计费开关。<br>0：关闭<br>1：开启</p>
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * <p>实例套餐版本。<br>101：小微版<br>102：超轻版<br>2：高级版<br>3：企业版<br>4：旗舰版<br>6：独享版</p>
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * <p>实例过期时间</p>
    */
    @SerializedName("ValidTime")
    @Expose
    private String ValidTime;

    /**
    * <p>实例开始时间</p>
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * <p>已配置域名个数</p>
    */
    @SerializedName("DomainCount")
    @Expose
    private Long DomainCount;

    /**
    * <p>域名数量上限</p>
    */
    @SerializedName("SubDomainLimit")
    @Expose
    private Long SubDomainLimit;

    /**
    * <p>已配置主域名个数</p>
    */
    @SerializedName("MainDomainCount")
    @Expose
    private Long MainDomainCount;

    /**
    * <p>主域名数量上限</p>
    */
    @SerializedName("MainDomainLimit")
    @Expose
    private Long MainDomainLimit;

    /**
    * <p>实例30天内QPS峰值</p>
    */
    @SerializedName("MaxQPS")
    @Expose
    private Long MaxQPS;

    /**
    * <p>qps扩展包信息</p>
    */
    @SerializedName("QPS")
    @Expose
    private QPSPackageNew QPS;

    /**
    * <p>域名扩展包信息</p>
    */
    @SerializedName("DomainPkg")
    @Expose
    private DomainPackageNew DomainPkg;

    /**
    * <p>用户appid</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>clb或saas</p>
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * <p>业务安全包</p>
    */
    @SerializedName("FraudPkg")
    @Expose
    private FraudPkg FraudPkg;

    /**
    * <p>Bot资源包</p>
    */
    @SerializedName("BotPkg")
    @Expose
    private BotPkg BotPkg;

    /**
    * <p>bot的qps详情</p>
    */
    @SerializedName("BotQPS")
    @Expose
    private BotQPS BotQPS;

    /**
    * <p>qps弹性计费上限</p>
    */
    @SerializedName("ElasticBilling")
    @Expose
    private Long ElasticBilling;

    /**
    * <p>攻击日志投递开关</p>
    */
    @SerializedName("AttackLogPost")
    @Expose
    private Long AttackLogPost;

    /**
    * <p>带宽峰值，单位为B/s(字节每秒)</p>
    */
    @SerializedName("MaxBandwidth")
    @Expose
    private Long MaxBandwidth;

    /**
    * <p>api安全是否购买</p>
    */
    @SerializedName("APISecurity")
    @Expose
    private Long APISecurity;

    /**
    * <p>购买的qps规格</p>
    */
    @SerializedName("QpsStandard")
    @Expose
    private Long QpsStandard;

    /**
    * <p>购买的带宽规格</p>
    */
    @SerializedName("BandwidthStandard")
    @Expose
    private Long BandwidthStandard;

    /**
    * <p>实例状态</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>实例沙箱qps值</p>
    */
    @SerializedName("SandboxQps")
    @Expose
    private Long SandboxQps;

    /**
    * <p>是否api 安全试用</p>
    */
    @SerializedName("IsAPISecurityTrial")
    @Expose
    private Long IsAPISecurityTrial;

    /**
    * <p>重保包</p>
    */
    @SerializedName("MajorEventsPkg")
    @Expose
    private MajorEventsPkg MajorEventsPkg;

    /**
    * <p>混合云子节点包</p>
    */
    @SerializedName("HybridPkg")
    @Expose
    private HybridPkg HybridPkg;

    /**
    * <p>API安全资源包</p>
    */
    @SerializedName("ApiPkg")
    @Expose
    private ApiPkg ApiPkg;

    /**
    * <p>小程序安全加速包</p>
    */
    @SerializedName("MiniPkg")
    @Expose
    private MiniPkg MiniPkg;

    /**
    * <p>小程序qps规格</p>
    */
    @SerializedName("MiniQpsStandard")
    @Expose
    private Long MiniQpsStandard;

    /**
    * <p>小程序qps峰值</p>
    */
    @SerializedName("MiniMaxQPS")
    @Expose
    private Long MiniMaxQPS;

    /**
    * <p>最近一次超量时间</p>
    */
    @SerializedName("LastQpsExceedTime")
    @Expose
    private String LastQpsExceedTime;

    /**
    * <p>小程序安全接入ID数量扩张包</p>
    */
    @SerializedName("MiniExtendPkg")
    @Expose
    private MiniExtendPkg MiniExtendPkg;

    /**
    * <p>计费项</p>
    */
    @SerializedName("BillingItem")
    @Expose
    private String BillingItem;

    /**
    * <p>实例延期释放标识</p>
    */
    @SerializedName("FreeDelayFlag")
    @Expose
    private Long FreeDelayFlag;

    /**
    * <p>最近3天最大qps</p>
    */
    @SerializedName("Last3MaxQPS")
    @Expose
    private Long Last3MaxQPS;

    /**
    * <p>最近3天最大带宽</p>
    */
    @SerializedName("Last3MaxBandwidth")
    @Expose
    private Long Last3MaxBandwidth;

    /**
    * <p>重保增强包</p>
    */
    @SerializedName("MajorEventsProPkg")
    @Expose
    private MajorEventsProPkg MajorEventsProPkg;

    /**
    * <p>1是基础2025版本；0不是</p>
    */
    @SerializedName("BasicFlag")
    @Expose
    private Long BasicFlag;

    /**
    * <p>实例的网络配置</p>
    */
    @SerializedName("NetworkConfig")
    @Expose
    private NetworkConfig NetworkConfig;

    /**
    * <p>RCE设备安全信息包</p>
    */
    @SerializedName("RCEPkg")
    @Expose
    private RCEPkg RCEPkg;

    /**
    * <p>超量策略。0：超量沙箱<br>1：超量限流</p>
    */
    @SerializedName("ExceedPolicy")
    @Expose
    private Long ExceedPolicy;

    /**
    * <p>大模型安全信息包</p>
    */
    @SerializedName("LLMPkg")
    @Expose
    private LLMPkg LLMPkg;

    /**
    * <p>弹性资源Id</p>
    */
    @SerializedName("ElasticResourceId")
    @Expose
    private String ElasticResourceId;

    /**
    * <p>预付费大模型安全信息包</p>
    */
    @SerializedName("LLMMonPkg")
    @Expose
    private LLMMonPkg LLMMonPkg;

    /**
    * <p>地域id</p>
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * <p>BOT安全护航信息</p>
    */
    @SerializedName("BotSecurityPkg")
    @Expose
    private BotSecurityPkg BotSecurityPkg;

    /**
    * <p>BOT安全监测资源信息</p>
    */
    @SerializedName("BotMonitorPkg")
    @Expose
    private BotMonitorPkg BotMonitorPkg;

    /**
    * <p>独享ip资源信息</p>
    */
    @SerializedName("DedicatedIPPkg")
    @Expose
    private DedicatedIPPkg DedicatedIPPkg;

    /**
    * <p>已经配置独享ip的数量</p>
    */
    @SerializedName("DedicatedIPCount")
    @Expose
    private Long DedicatedIPCount;

    /**
    * <p>标签结构体</p>
    */
    @SerializedName("TagInfos")
    @Expose
    private TagInfo [] TagInfos;

    /**
     * Get <p>实例唯一ID</p> 
     * @return InstanceId <p>实例唯一ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例唯一ID</p>
     * @param InstanceId <p>实例唯一ID</p>
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
     * Get <p>实例对应资源ID，计费使用</p> 
     * @return ResourceIds <p>实例对应资源ID，计费使用</p>
     */
    public String getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set <p>实例对应资源ID，计费使用</p>
     * @param ResourceIds <p>实例对应资源ID，计费使用</p>
     */
    public void setResourceIds(String ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get <p>实例所属地域</p> 
     * @return Region <p>实例所属地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>实例所属地域</p>
     * @param Region <p>实例所属地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>付费模式</p> 
     * @return PayMode <p>付费模式</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>付费模式</p>
     * @param PayMode <p>付费模式</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>自动续费标识。<br>0：关闭<br>1：开启</p> 
     * @return RenewFlag <p>自动续费标识。<br>0：关闭<br>1：开启</p>
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>自动续费标识。<br>0：关闭<br>1：开启</p>
     * @param RenewFlag <p>自动续费标识。<br>0：关闭<br>1：开启</p>
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>弹性计费开关。<br>0：关闭<br>1：开启</p> 
     * @return Mode <p>弹性计费开关。<br>0：关闭<br>1：开启</p>
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set <p>弹性计费开关。<br>0：关闭<br>1：开启</p>
     * @param Mode <p>弹性计费开关。<br>0：关闭<br>1：开启</p>
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>实例套餐版本。<br>101：小微版<br>102：超轻版<br>2：高级版<br>3：企业版<br>4：旗舰版<br>6：独享版</p> 
     * @return Level <p>实例套餐版本。<br>101：小微版<br>102：超轻版<br>2：高级版<br>3：企业版<br>4：旗舰版<br>6：独享版</p>
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set <p>实例套餐版本。<br>101：小微版<br>102：超轻版<br>2：高级版<br>3：企业版<br>4：旗舰版<br>6：独享版</p>
     * @param Level <p>实例套餐版本。<br>101：小微版<br>102：超轻版<br>2：高级版<br>3：企业版<br>4：旗舰版<br>6：独享版</p>
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get <p>实例过期时间</p> 
     * @return ValidTime <p>实例过期时间</p>
     */
    public String getValidTime() {
        return this.ValidTime;
    }

    /**
     * Set <p>实例过期时间</p>
     * @param ValidTime <p>实例过期时间</p>
     */
    public void setValidTime(String ValidTime) {
        this.ValidTime = ValidTime;
    }

    /**
     * Get <p>实例开始时间</p> 
     * @return BeginTime <p>实例开始时间</p>
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>实例开始时间</p>
     * @param BeginTime <p>实例开始时间</p>
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>已配置域名个数</p> 
     * @return DomainCount <p>已配置域名个数</p>
     */
    public Long getDomainCount() {
        return this.DomainCount;
    }

    /**
     * Set <p>已配置域名个数</p>
     * @param DomainCount <p>已配置域名个数</p>
     */
    public void setDomainCount(Long DomainCount) {
        this.DomainCount = DomainCount;
    }

    /**
     * Get <p>域名数量上限</p> 
     * @return SubDomainLimit <p>域名数量上限</p>
     */
    public Long getSubDomainLimit() {
        return this.SubDomainLimit;
    }

    /**
     * Set <p>域名数量上限</p>
     * @param SubDomainLimit <p>域名数量上限</p>
     */
    public void setSubDomainLimit(Long SubDomainLimit) {
        this.SubDomainLimit = SubDomainLimit;
    }

    /**
     * Get <p>已配置主域名个数</p> 
     * @return MainDomainCount <p>已配置主域名个数</p>
     */
    public Long getMainDomainCount() {
        return this.MainDomainCount;
    }

    /**
     * Set <p>已配置主域名个数</p>
     * @param MainDomainCount <p>已配置主域名个数</p>
     */
    public void setMainDomainCount(Long MainDomainCount) {
        this.MainDomainCount = MainDomainCount;
    }

    /**
     * Get <p>主域名数量上限</p> 
     * @return MainDomainLimit <p>主域名数量上限</p>
     */
    public Long getMainDomainLimit() {
        return this.MainDomainLimit;
    }

    /**
     * Set <p>主域名数量上限</p>
     * @param MainDomainLimit <p>主域名数量上限</p>
     */
    public void setMainDomainLimit(Long MainDomainLimit) {
        this.MainDomainLimit = MainDomainLimit;
    }

    /**
     * Get <p>实例30天内QPS峰值</p> 
     * @return MaxQPS <p>实例30天内QPS峰值</p>
     */
    public Long getMaxQPS() {
        return this.MaxQPS;
    }

    /**
     * Set <p>实例30天内QPS峰值</p>
     * @param MaxQPS <p>实例30天内QPS峰值</p>
     */
    public void setMaxQPS(Long MaxQPS) {
        this.MaxQPS = MaxQPS;
    }

    /**
     * Get <p>qps扩展包信息</p> 
     * @return QPS <p>qps扩展包信息</p>
     */
    public QPSPackageNew getQPS() {
        return this.QPS;
    }

    /**
     * Set <p>qps扩展包信息</p>
     * @param QPS <p>qps扩展包信息</p>
     */
    public void setQPS(QPSPackageNew QPS) {
        this.QPS = QPS;
    }

    /**
     * Get <p>域名扩展包信息</p> 
     * @return DomainPkg <p>域名扩展包信息</p>
     */
    public DomainPackageNew getDomainPkg() {
        return this.DomainPkg;
    }

    /**
     * Set <p>域名扩展包信息</p>
     * @param DomainPkg <p>域名扩展包信息</p>
     */
    public void setDomainPkg(DomainPackageNew DomainPkg) {
        this.DomainPkg = DomainPkg;
    }

    /**
     * Get <p>用户appid</p> 
     * @return AppId <p>用户appid</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>用户appid</p>
     * @param AppId <p>用户appid</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>clb或saas</p> 
     * @return Edition <p>clb或saas</p>
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set <p>clb或saas</p>
     * @param Edition <p>clb或saas</p>
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get <p>业务安全包</p> 
     * @return FraudPkg <p>业务安全包</p>
     */
    public FraudPkg getFraudPkg() {
        return this.FraudPkg;
    }

    /**
     * Set <p>业务安全包</p>
     * @param FraudPkg <p>业务安全包</p>
     */
    public void setFraudPkg(FraudPkg FraudPkg) {
        this.FraudPkg = FraudPkg;
    }

    /**
     * Get <p>Bot资源包</p> 
     * @return BotPkg <p>Bot资源包</p>
     */
    public BotPkg getBotPkg() {
        return this.BotPkg;
    }

    /**
     * Set <p>Bot资源包</p>
     * @param BotPkg <p>Bot资源包</p>
     */
    public void setBotPkg(BotPkg BotPkg) {
        this.BotPkg = BotPkg;
    }

    /**
     * Get <p>bot的qps详情</p> 
     * @return BotQPS <p>bot的qps详情</p>
     */
    public BotQPS getBotQPS() {
        return this.BotQPS;
    }

    /**
     * Set <p>bot的qps详情</p>
     * @param BotQPS <p>bot的qps详情</p>
     */
    public void setBotQPS(BotQPS BotQPS) {
        this.BotQPS = BotQPS;
    }

    /**
     * Get <p>qps弹性计费上限</p> 
     * @return ElasticBilling <p>qps弹性计费上限</p>
     */
    public Long getElasticBilling() {
        return this.ElasticBilling;
    }

    /**
     * Set <p>qps弹性计费上限</p>
     * @param ElasticBilling <p>qps弹性计费上限</p>
     */
    public void setElasticBilling(Long ElasticBilling) {
        this.ElasticBilling = ElasticBilling;
    }

    /**
     * Get <p>攻击日志投递开关</p> 
     * @return AttackLogPost <p>攻击日志投递开关</p>
     */
    public Long getAttackLogPost() {
        return this.AttackLogPost;
    }

    /**
     * Set <p>攻击日志投递开关</p>
     * @param AttackLogPost <p>攻击日志投递开关</p>
     */
    public void setAttackLogPost(Long AttackLogPost) {
        this.AttackLogPost = AttackLogPost;
    }

    /**
     * Get <p>带宽峰值，单位为B/s(字节每秒)</p> 
     * @return MaxBandwidth <p>带宽峰值，单位为B/s(字节每秒)</p>
     */
    public Long getMaxBandwidth() {
        return this.MaxBandwidth;
    }

    /**
     * Set <p>带宽峰值，单位为B/s(字节每秒)</p>
     * @param MaxBandwidth <p>带宽峰值，单位为B/s(字节每秒)</p>
     */
    public void setMaxBandwidth(Long MaxBandwidth) {
        this.MaxBandwidth = MaxBandwidth;
    }

    /**
     * Get <p>api安全是否购买</p> 
     * @return APISecurity <p>api安全是否购买</p>
     */
    public Long getAPISecurity() {
        return this.APISecurity;
    }

    /**
     * Set <p>api安全是否购买</p>
     * @param APISecurity <p>api安全是否购买</p>
     */
    public void setAPISecurity(Long APISecurity) {
        this.APISecurity = APISecurity;
    }

    /**
     * Get <p>购买的qps规格</p> 
     * @return QpsStandard <p>购买的qps规格</p>
     */
    public Long getQpsStandard() {
        return this.QpsStandard;
    }

    /**
     * Set <p>购买的qps规格</p>
     * @param QpsStandard <p>购买的qps规格</p>
     */
    public void setQpsStandard(Long QpsStandard) {
        this.QpsStandard = QpsStandard;
    }

    /**
     * Get <p>购买的带宽规格</p> 
     * @return BandwidthStandard <p>购买的带宽规格</p>
     */
    public Long getBandwidthStandard() {
        return this.BandwidthStandard;
    }

    /**
     * Set <p>购买的带宽规格</p>
     * @param BandwidthStandard <p>购买的带宽规格</p>
     */
    public void setBandwidthStandard(Long BandwidthStandard) {
        this.BandwidthStandard = BandwidthStandard;
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
     * Get <p>实例沙箱qps值</p> 
     * @return SandboxQps <p>实例沙箱qps值</p>
     */
    public Long getSandboxQps() {
        return this.SandboxQps;
    }

    /**
     * Set <p>实例沙箱qps值</p>
     * @param SandboxQps <p>实例沙箱qps值</p>
     */
    public void setSandboxQps(Long SandboxQps) {
        this.SandboxQps = SandboxQps;
    }

    /**
     * Get <p>是否api 安全试用</p> 
     * @return IsAPISecurityTrial <p>是否api 安全试用</p>
     */
    public Long getIsAPISecurityTrial() {
        return this.IsAPISecurityTrial;
    }

    /**
     * Set <p>是否api 安全试用</p>
     * @param IsAPISecurityTrial <p>是否api 安全试用</p>
     */
    public void setIsAPISecurityTrial(Long IsAPISecurityTrial) {
        this.IsAPISecurityTrial = IsAPISecurityTrial;
    }

    /**
     * Get <p>重保包</p> 
     * @return MajorEventsPkg <p>重保包</p>
     */
    public MajorEventsPkg getMajorEventsPkg() {
        return this.MajorEventsPkg;
    }

    /**
     * Set <p>重保包</p>
     * @param MajorEventsPkg <p>重保包</p>
     */
    public void setMajorEventsPkg(MajorEventsPkg MajorEventsPkg) {
        this.MajorEventsPkg = MajorEventsPkg;
    }

    /**
     * Get <p>混合云子节点包</p> 
     * @return HybridPkg <p>混合云子节点包</p>
     */
    public HybridPkg getHybridPkg() {
        return this.HybridPkg;
    }

    /**
     * Set <p>混合云子节点包</p>
     * @param HybridPkg <p>混合云子节点包</p>
     */
    public void setHybridPkg(HybridPkg HybridPkg) {
        this.HybridPkg = HybridPkg;
    }

    /**
     * Get <p>API安全资源包</p> 
     * @return ApiPkg <p>API安全资源包</p>
     */
    public ApiPkg getApiPkg() {
        return this.ApiPkg;
    }

    /**
     * Set <p>API安全资源包</p>
     * @param ApiPkg <p>API安全资源包</p>
     */
    public void setApiPkg(ApiPkg ApiPkg) {
        this.ApiPkg = ApiPkg;
    }

    /**
     * Get <p>小程序安全加速包</p> 
     * @return MiniPkg <p>小程序安全加速包</p>
     */
    public MiniPkg getMiniPkg() {
        return this.MiniPkg;
    }

    /**
     * Set <p>小程序安全加速包</p>
     * @param MiniPkg <p>小程序安全加速包</p>
     */
    public void setMiniPkg(MiniPkg MiniPkg) {
        this.MiniPkg = MiniPkg;
    }

    /**
     * Get <p>小程序qps规格</p> 
     * @return MiniQpsStandard <p>小程序qps规格</p>
     */
    public Long getMiniQpsStandard() {
        return this.MiniQpsStandard;
    }

    /**
     * Set <p>小程序qps规格</p>
     * @param MiniQpsStandard <p>小程序qps规格</p>
     */
    public void setMiniQpsStandard(Long MiniQpsStandard) {
        this.MiniQpsStandard = MiniQpsStandard;
    }

    /**
     * Get <p>小程序qps峰值</p> 
     * @return MiniMaxQPS <p>小程序qps峰值</p>
     */
    public Long getMiniMaxQPS() {
        return this.MiniMaxQPS;
    }

    /**
     * Set <p>小程序qps峰值</p>
     * @param MiniMaxQPS <p>小程序qps峰值</p>
     */
    public void setMiniMaxQPS(Long MiniMaxQPS) {
        this.MiniMaxQPS = MiniMaxQPS;
    }

    /**
     * Get <p>最近一次超量时间</p> 
     * @return LastQpsExceedTime <p>最近一次超量时间</p>
     */
    public String getLastQpsExceedTime() {
        return this.LastQpsExceedTime;
    }

    /**
     * Set <p>最近一次超量时间</p>
     * @param LastQpsExceedTime <p>最近一次超量时间</p>
     */
    public void setLastQpsExceedTime(String LastQpsExceedTime) {
        this.LastQpsExceedTime = LastQpsExceedTime;
    }

    /**
     * Get <p>小程序安全接入ID数量扩张包</p> 
     * @return MiniExtendPkg <p>小程序安全接入ID数量扩张包</p>
     */
    public MiniExtendPkg getMiniExtendPkg() {
        return this.MiniExtendPkg;
    }

    /**
     * Set <p>小程序安全接入ID数量扩张包</p>
     * @param MiniExtendPkg <p>小程序安全接入ID数量扩张包</p>
     */
    public void setMiniExtendPkg(MiniExtendPkg MiniExtendPkg) {
        this.MiniExtendPkg = MiniExtendPkg;
    }

    /**
     * Get <p>计费项</p> 
     * @return BillingItem <p>计费项</p>
     */
    public String getBillingItem() {
        return this.BillingItem;
    }

    /**
     * Set <p>计费项</p>
     * @param BillingItem <p>计费项</p>
     */
    public void setBillingItem(String BillingItem) {
        this.BillingItem = BillingItem;
    }

    /**
     * Get <p>实例延期释放标识</p> 
     * @return FreeDelayFlag <p>实例延期释放标识</p>
     */
    public Long getFreeDelayFlag() {
        return this.FreeDelayFlag;
    }

    /**
     * Set <p>实例延期释放标识</p>
     * @param FreeDelayFlag <p>实例延期释放标识</p>
     */
    public void setFreeDelayFlag(Long FreeDelayFlag) {
        this.FreeDelayFlag = FreeDelayFlag;
    }

    /**
     * Get <p>最近3天最大qps</p> 
     * @return Last3MaxQPS <p>最近3天最大qps</p>
     */
    public Long getLast3MaxQPS() {
        return this.Last3MaxQPS;
    }

    /**
     * Set <p>最近3天最大qps</p>
     * @param Last3MaxQPS <p>最近3天最大qps</p>
     */
    public void setLast3MaxQPS(Long Last3MaxQPS) {
        this.Last3MaxQPS = Last3MaxQPS;
    }

    /**
     * Get <p>最近3天最大带宽</p> 
     * @return Last3MaxBandwidth <p>最近3天最大带宽</p>
     */
    public Long getLast3MaxBandwidth() {
        return this.Last3MaxBandwidth;
    }

    /**
     * Set <p>最近3天最大带宽</p>
     * @param Last3MaxBandwidth <p>最近3天最大带宽</p>
     */
    public void setLast3MaxBandwidth(Long Last3MaxBandwidth) {
        this.Last3MaxBandwidth = Last3MaxBandwidth;
    }

    /**
     * Get <p>重保增强包</p> 
     * @return MajorEventsProPkg <p>重保增强包</p>
     */
    public MajorEventsProPkg getMajorEventsProPkg() {
        return this.MajorEventsProPkg;
    }

    /**
     * Set <p>重保增强包</p>
     * @param MajorEventsProPkg <p>重保增强包</p>
     */
    public void setMajorEventsProPkg(MajorEventsProPkg MajorEventsProPkg) {
        this.MajorEventsProPkg = MajorEventsProPkg;
    }

    /**
     * Get <p>1是基础2025版本；0不是</p> 
     * @return BasicFlag <p>1是基础2025版本；0不是</p>
     */
    public Long getBasicFlag() {
        return this.BasicFlag;
    }

    /**
     * Set <p>1是基础2025版本；0不是</p>
     * @param BasicFlag <p>1是基础2025版本；0不是</p>
     */
    public void setBasicFlag(Long BasicFlag) {
        this.BasicFlag = BasicFlag;
    }

    /**
     * Get <p>实例的网络配置</p> 
     * @return NetworkConfig <p>实例的网络配置</p>
     */
    public NetworkConfig getNetworkConfig() {
        return this.NetworkConfig;
    }

    /**
     * Set <p>实例的网络配置</p>
     * @param NetworkConfig <p>实例的网络配置</p>
     */
    public void setNetworkConfig(NetworkConfig NetworkConfig) {
        this.NetworkConfig = NetworkConfig;
    }

    /**
     * Get <p>RCE设备安全信息包</p> 
     * @return RCEPkg <p>RCE设备安全信息包</p>
     */
    public RCEPkg getRCEPkg() {
        return this.RCEPkg;
    }

    /**
     * Set <p>RCE设备安全信息包</p>
     * @param RCEPkg <p>RCE设备安全信息包</p>
     */
    public void setRCEPkg(RCEPkg RCEPkg) {
        this.RCEPkg = RCEPkg;
    }

    /**
     * Get <p>超量策略。0：超量沙箱<br>1：超量限流</p> 
     * @return ExceedPolicy <p>超量策略。0：超量沙箱<br>1：超量限流</p>
     */
    public Long getExceedPolicy() {
        return this.ExceedPolicy;
    }

    /**
     * Set <p>超量策略。0：超量沙箱<br>1：超量限流</p>
     * @param ExceedPolicy <p>超量策略。0：超量沙箱<br>1：超量限流</p>
     */
    public void setExceedPolicy(Long ExceedPolicy) {
        this.ExceedPolicy = ExceedPolicy;
    }

    /**
     * Get <p>大模型安全信息包</p> 
     * @return LLMPkg <p>大模型安全信息包</p>
     */
    public LLMPkg getLLMPkg() {
        return this.LLMPkg;
    }

    /**
     * Set <p>大模型安全信息包</p>
     * @param LLMPkg <p>大模型安全信息包</p>
     */
    public void setLLMPkg(LLMPkg LLMPkg) {
        this.LLMPkg = LLMPkg;
    }

    /**
     * Get <p>弹性资源Id</p> 
     * @return ElasticResourceId <p>弹性资源Id</p>
     */
    public String getElasticResourceId() {
        return this.ElasticResourceId;
    }

    /**
     * Set <p>弹性资源Id</p>
     * @param ElasticResourceId <p>弹性资源Id</p>
     */
    public void setElasticResourceId(String ElasticResourceId) {
        this.ElasticResourceId = ElasticResourceId;
    }

    /**
     * Get <p>预付费大模型安全信息包</p> 
     * @return LLMMonPkg <p>预付费大模型安全信息包</p>
     */
    public LLMMonPkg getLLMMonPkg() {
        return this.LLMMonPkg;
    }

    /**
     * Set <p>预付费大模型安全信息包</p>
     * @param LLMMonPkg <p>预付费大模型安全信息包</p>
     */
    public void setLLMMonPkg(LLMMonPkg LLMMonPkg) {
        this.LLMMonPkg = LLMMonPkg;
    }

    /**
     * Get <p>地域id</p> 
     * @return RegionId <p>地域id</p>
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>地域id</p>
     * @param RegionId <p>地域id</p>
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>BOT安全护航信息</p> 
     * @return BotSecurityPkg <p>BOT安全护航信息</p>
     */
    public BotSecurityPkg getBotSecurityPkg() {
        return this.BotSecurityPkg;
    }

    /**
     * Set <p>BOT安全护航信息</p>
     * @param BotSecurityPkg <p>BOT安全护航信息</p>
     */
    public void setBotSecurityPkg(BotSecurityPkg BotSecurityPkg) {
        this.BotSecurityPkg = BotSecurityPkg;
    }

    /**
     * Get <p>BOT安全监测资源信息</p> 
     * @return BotMonitorPkg <p>BOT安全监测资源信息</p>
     */
    public BotMonitorPkg getBotMonitorPkg() {
        return this.BotMonitorPkg;
    }

    /**
     * Set <p>BOT安全监测资源信息</p>
     * @param BotMonitorPkg <p>BOT安全监测资源信息</p>
     */
    public void setBotMonitorPkg(BotMonitorPkg BotMonitorPkg) {
        this.BotMonitorPkg = BotMonitorPkg;
    }

    /**
     * Get <p>独享ip资源信息</p> 
     * @return DedicatedIPPkg <p>独享ip资源信息</p>
     */
    public DedicatedIPPkg getDedicatedIPPkg() {
        return this.DedicatedIPPkg;
    }

    /**
     * Set <p>独享ip资源信息</p>
     * @param DedicatedIPPkg <p>独享ip资源信息</p>
     */
    public void setDedicatedIPPkg(DedicatedIPPkg DedicatedIPPkg) {
        this.DedicatedIPPkg = DedicatedIPPkg;
    }

    /**
     * Get <p>已经配置独享ip的数量</p> 
     * @return DedicatedIPCount <p>已经配置独享ip的数量</p>
     */
    public Long getDedicatedIPCount() {
        return this.DedicatedIPCount;
    }

    /**
     * Set <p>已经配置独享ip的数量</p>
     * @param DedicatedIPCount <p>已经配置独享ip的数量</p>
     */
    public void setDedicatedIPCount(Long DedicatedIPCount) {
        this.DedicatedIPCount = DedicatedIPCount;
    }

    /**
     * Get <p>标签结构体</p> 
     * @return TagInfos <p>标签结构体</p>
     */
    public TagInfo [] getTagInfos() {
        return this.TagInfos;
    }

    /**
     * Set <p>标签结构体</p>
     * @param TagInfos <p>标签结构体</p>
     */
    public void setTagInfos(TagInfo [] TagInfos) {
        this.TagInfos = TagInfos;
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
        if (source.BotSecurityPkg != null) {
            this.BotSecurityPkg = new BotSecurityPkg(source.BotSecurityPkg);
        }
        if (source.BotMonitorPkg != null) {
            this.BotMonitorPkg = new BotMonitorPkg(source.BotMonitorPkg);
        }
        if (source.DedicatedIPPkg != null) {
            this.DedicatedIPPkg = new DedicatedIPPkg(source.DedicatedIPPkg);
        }
        if (source.DedicatedIPCount != null) {
            this.DedicatedIPCount = new Long(source.DedicatedIPCount);
        }
        if (source.TagInfos != null) {
            this.TagInfos = new TagInfo[source.TagInfos.length];
            for (int i = 0; i < source.TagInfos.length; i++) {
                this.TagInfos[i] = new TagInfo(source.TagInfos[i]);
            }
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
        this.setParamObj(map, prefix + "BotSecurityPkg.", this.BotSecurityPkg);
        this.setParamObj(map, prefix + "BotMonitorPkg.", this.BotMonitorPkg);
        this.setParamObj(map, prefix + "DedicatedIPPkg.", this.DedicatedIPPkg);
        this.setParamSimple(map, prefix + "DedicatedIPCount", this.DedicatedIPCount);
        this.setParamArrayObj(map, prefix + "TagInfos.", this.TagInfos);

    }
}

