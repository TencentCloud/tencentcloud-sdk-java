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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FraudPkg")
    @Expose
    private FraudPkg FraudPkg;

    /**
    * Bot资源包
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BotPkg")
    @Expose
    private BotPkg BotPkg;

    /**
    * bot的qps详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BotQPS")
    @Expose
    private BotQPS BotQPS;

    /**
    * qps弹性计费上限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ElasticBilling")
    @Expose
    private Long ElasticBilling;

    /**
    * 攻击日志投递开关
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttackLogPost")
    @Expose
    private Long AttackLogPost;

    /**
    * 带宽峰值，单位为B/s(字节每秒)
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QpsStandard")
    @Expose
    private Long QpsStandard;

    /**
    * 购买的带宽规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BandwidthStandard")
    @Expose
    private Long BandwidthStandard;

    /**
    * 实例状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 实例沙箱qps值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SandboxQps")
    @Expose
    private Long SandboxQps;

    /**
    * 是否api 安全试用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAPISecurityTrial")
    @Expose
    private Long IsAPISecurityTrial;

    /**
    * 重保包
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MajorEventsPkg")
    @Expose
    private MajorEventsPkg MajorEventsPkg;

    /**
    * 混合云子节点包
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HybridPkg")
    @Expose
    private HybridPkg HybridPkg;

    /**
    * API安全资源包
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiPkg")
    @Expose
    private ApiPkg ApiPkg;

    /**
    * 小程序安全加速包
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MiniPkg")
    @Expose
    private MiniPkg MiniPkg;

    /**
    * 小程序qps规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MiniQpsStandard")
    @Expose
    private Long MiniQpsStandard;

    /**
    * 小程序qps峰值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MiniMaxQPS")
    @Expose
    private Long MiniMaxQPS;

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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FraudPkg 业务安全包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FraudPkg getFraudPkg() {
        return this.FraudPkg;
    }

    /**
     * Set 业务安全包
注意：此字段可能返回 null，表示取不到有效值。
     * @param FraudPkg 业务安全包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFraudPkg(FraudPkg FraudPkg) {
        this.FraudPkg = FraudPkg;
    }

    /**
     * Get Bot资源包
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BotPkg Bot资源包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BotPkg getBotPkg() {
        return this.BotPkg;
    }

    /**
     * Set Bot资源包
注意：此字段可能返回 null，表示取不到有效值。
     * @param BotPkg Bot资源包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBotPkg(BotPkg BotPkg) {
        this.BotPkg = BotPkg;
    }

    /**
     * Get bot的qps详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BotQPS bot的qps详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BotQPS getBotQPS() {
        return this.BotQPS;
    }

    /**
     * Set bot的qps详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param BotQPS bot的qps详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBotQPS(BotQPS BotQPS) {
        this.BotQPS = BotQPS;
    }

    /**
     * Get qps弹性计费上限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ElasticBilling qps弹性计费上限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getElasticBilling() {
        return this.ElasticBilling;
    }

    /**
     * Set qps弹性计费上限
注意：此字段可能返回 null，表示取不到有效值。
     * @param ElasticBilling qps弹性计费上限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElasticBilling(Long ElasticBilling) {
        this.ElasticBilling = ElasticBilling;
    }

    /**
     * Get 攻击日志投递开关
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttackLogPost 攻击日志投递开关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAttackLogPost() {
        return this.AttackLogPost;
    }

    /**
     * Set 攻击日志投递开关
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttackLogPost 攻击日志投递开关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttackLogPost(Long AttackLogPost) {
        this.AttackLogPost = AttackLogPost;
    }

    /**
     * Get 带宽峰值，单位为B/s(字节每秒)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxBandwidth 带宽峰值，单位为B/s(字节每秒)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxBandwidth() {
        return this.MaxBandwidth;
    }

    /**
     * Set 带宽峰值，单位为B/s(字节每秒)
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxBandwidth 带宽峰值，单位为B/s(字节每秒)
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QpsStandard 购买的qps规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQpsStandard() {
        return this.QpsStandard;
    }

    /**
     * Set 购买的qps规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param QpsStandard 购买的qps规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQpsStandard(Long QpsStandard) {
        this.QpsStandard = QpsStandard;
    }

    /**
     * Get 购买的带宽规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BandwidthStandard 购买的带宽规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBandwidthStandard() {
        return this.BandwidthStandard;
    }

    /**
     * Set 购买的带宽规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param BandwidthStandard 购买的带宽规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBandwidthStandard(Long BandwidthStandard) {
        this.BandwidthStandard = BandwidthStandard;
    }

    /**
     * Get 实例状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 实例沙箱qps值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SandboxQps 实例沙箱qps值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSandboxQps() {
        return this.SandboxQps;
    }

    /**
     * Set 实例沙箱qps值
注意：此字段可能返回 null，表示取不到有效值。
     * @param SandboxQps 实例沙箱qps值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSandboxQps(Long SandboxQps) {
        this.SandboxQps = SandboxQps;
    }

    /**
     * Get 是否api 安全试用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAPISecurityTrial 是否api 安全试用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsAPISecurityTrial() {
        return this.IsAPISecurityTrial;
    }

    /**
     * Set 是否api 安全试用
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAPISecurityTrial 是否api 安全试用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAPISecurityTrial(Long IsAPISecurityTrial) {
        this.IsAPISecurityTrial = IsAPISecurityTrial;
    }

    /**
     * Get 重保包
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MajorEventsPkg 重保包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MajorEventsPkg getMajorEventsPkg() {
        return this.MajorEventsPkg;
    }

    /**
     * Set 重保包
注意：此字段可能返回 null，表示取不到有效值。
     * @param MajorEventsPkg 重保包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMajorEventsPkg(MajorEventsPkg MajorEventsPkg) {
        this.MajorEventsPkg = MajorEventsPkg;
    }

    /**
     * Get 混合云子节点包
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HybridPkg 混合云子节点包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HybridPkg getHybridPkg() {
        return this.HybridPkg;
    }

    /**
     * Set 混合云子节点包
注意：此字段可能返回 null，表示取不到有效值。
     * @param HybridPkg 混合云子节点包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHybridPkg(HybridPkg HybridPkg) {
        this.HybridPkg = HybridPkg;
    }

    /**
     * Get API安全资源包
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiPkg API安全资源包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApiPkg getApiPkg() {
        return this.ApiPkg;
    }

    /**
     * Set API安全资源包
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiPkg API安全资源包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiPkg(ApiPkg ApiPkg) {
        this.ApiPkg = ApiPkg;
    }

    /**
     * Get 小程序安全加速包
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MiniPkg 小程序安全加速包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MiniPkg getMiniPkg() {
        return this.MiniPkg;
    }

    /**
     * Set 小程序安全加速包
注意：此字段可能返回 null，表示取不到有效值。
     * @param MiniPkg 小程序安全加速包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMiniPkg(MiniPkg MiniPkg) {
        this.MiniPkg = MiniPkg;
    }

    /**
     * Get 小程序qps规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MiniQpsStandard 小程序qps规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMiniQpsStandard() {
        return this.MiniQpsStandard;
    }

    /**
     * Set 小程序qps规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param MiniQpsStandard 小程序qps规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMiniQpsStandard(Long MiniQpsStandard) {
        this.MiniQpsStandard = MiniQpsStandard;
    }

    /**
     * Get 小程序qps峰值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MiniMaxQPS 小程序qps峰值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMiniMaxQPS() {
        return this.MiniMaxQPS;
    }

    /**
     * Set 小程序qps峰值
注意：此字段可能返回 null，表示取不到有效值。
     * @param MiniMaxQPS 小程序qps峰值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMiniMaxQPS(Long MiniMaxQPS) {
        this.MiniMaxQPS = MiniMaxQPS;
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

    }
}

