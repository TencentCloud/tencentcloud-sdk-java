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

public class EdrAlertDetail extends AbstractModel {

    /**
    * <p>主键ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>租户ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>告警唯一标识</p>
    */
    @SerializedName("AlertId")
    @Expose
    private String AlertId;

    /**
    * <p>告警大类（英文枚举：VIRUS_TROJAN/ABNORMAL_LOGIN/HOST_BEHAVIOR/NETWORK_BEHAVIOR/LINK_ENGINE）</p>
    */
    @SerializedName("AlertCategory")
    @Expose
    private String AlertCategory;

    /**
    * <p>告警子类型（英文枚举：MALWARE_FILE/MALWARE_PROCESS/RISK_LOGIN/BRUTE_FORCE/DNS/BASH/PRIV_ESCALATION/REVERSE_SHELL/NET_ATTACK/VUL_DEFENCE/MEMORY_SHELL_INJECT/MEMORY_SHELL_SCAN/MULTI_BEHAVIOR_ATTACK）</p>
    */
    @SerializedName("AlertSubType")
    @Expose
    private String AlertSubType;

    /**
    * <p>关联规则ID</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>规则类型: 0-系统规则 1-用户自定义</p>
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * <p>告警等级（英文枚举：CRITICAL/HIGH/MEDIUM/LOW/INFO）</p>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * <p>处理状态（英文枚举：PENDING/PROCESSED/WHITELISTED/ISOLATED/CLEANED/IGNORED/ISOLATING/RESTORING/BLOCKED/DELETED）</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>ATT&amp;CK攻击阶段</p>
    */
    @SerializedName("AttackStage")
    @Expose
    private String AttackStage;

    /**
    * <p>检测模式（英文枚举：PRECISE/BALANCED/DEEP）</p>
    */
    @SerializedName("DetectMode")
    @Expose
    private String DetectMode;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>主机UUID</p>
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * <p>聚合事件数</p>
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

    /**
    * <p>是否付费版</p>
    */
    @SerializedName("IsProVersion")
    @Expose
    private Long IsProVersion;

    /**
    * <p>告警来源（英文枚举：HOST/CONTAINER/K8S/CSIP）</p>
    */
    @SerializedName("AlertSource")
    @Expose
    private String AlertSource;

    /**
    * <p>容器镜像ID（保留字段，恒为空串）</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>容器ID（保留字段，恒为空串）</p>
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * <p>集群ID（保留字段，恒为空串）</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>首次发现时间</p>
    */
    @SerializedName("FirstDetectTime")
    @Expose
    private String FirstDetectTime;

    /**
    * <p>最近发现时间</p>
    */
    @SerializedName("LatestDetectTime")
    @Expose
    private String LatestDetectTime;

    /**
    * <p>规则名称（规则富化）</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>内容类型: md5/cmdline/dns/ip_inbound/ip_outbound/custom_file/process_network</p>
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * <p>实例名（资产富化）</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>公网IP（资产富化）</p>
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * <p>内网IP（资产富化）</p>
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * <p>告警详情JSON字符串（前端通过JSON.parse解析，空值为&quot;{}&quot;）</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>告警名称（子类型中英文名）</p>
    */
    @SerializedName("AlertName")
    @Expose
    private String AlertName;

    /**
    * <p>安全中心标签</p>
    */
    @SerializedName("CSIPTags")
    @Expose
    private CSIPTag [] CSIPTags;

    /**
    * <p>危害描述（统一字段，合并原各子类型独立字段）</p>
    */
    @SerializedName("HarmDesc")
    @Expose
    private String HarmDesc;

    /**
    * <p>修复建议（统一字段）</p>
    */
    @SerializedName("SuggestScheme")
    @Expose
    private String SuggestScheme;

    /**
    * <p>数据来源: vuldb/vdc/intel/default</p>
    */
    @SerializedName("HarmDescSource")
    @Expose
    private String HarmDescSource;

    /**
    * <p>统一威胁情报标签（按子类型路由不同情报源）</p>
    */
    @SerializedName("ThreatTags")
    @Expose
    private String [] ThreatTags;

    /**
    * <p>Base64解码后的命令（高危命令子类型独有）</p>
    */
    @SerializedName("BashCmdDecoded")
    @Expose
    private String BashCmdDecoded;

    /**
    * <p>漏洞名称（网络攻击子类型独有）</p>
    */
    @SerializedName("NetVulName")
    @Expose
    private String NetVulName;

    /**
    * <p>CVE编号（网络攻击子类型独有）</p>
    */
    @SerializedName("NetCVEId")
    @Expose
    private String NetCVEId;

    /**
    * <p>异常行为（网络攻击子类型独有）</p>
    */
    @SerializedName("NetAbnormalAction")
    @Expose
    private String NetAbnormalAction;

    /**
    * <p>IP情报信息（为空时不返回）</p>
    */
    @SerializedName("IPIntel")
    @Expose
    private IPIntelInfo IPIntel;

    /**
    * <p>多行为攻击规则类型分类: sequence/threshold/command</p>
    */
    @SerializedName("MultiBehaviorDetectionMode")
    @Expose
    private String MultiBehaviorDetectionMode;

    /**
    * <p>告警来源描述（按子类型派生，描述哪个引擎/规则检出）</p>
    */
    @SerializedName("SourceDesc")
    @Expose
    private String SourceDesc;

    /**
    * <p>处理时间参数格式：2026-05-26 19:45:48</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>情报富化结果来源（标识本次详情是否成功命中外部情报）；取值 &quot;VDC&quot; / &quot;IPAnalysis&quot; / &quot;BreakingTI&quot; / 空串</p>
    */
    @SerializedName("IntelSource")
    @Expose
    private String IntelSource;

    /**
    * <p>综合研判，中英文已翻译，中：恶意/安全/未知；英：Malicious/Safe/Unknown</p>
    */
    @SerializedName("Verdict")
    @Expose
    private String Verdict;

    /**
    * <p>研判依据</p>
    */
    @SerializedName("VerdictBasis")
    @Expose
    private String VerdictBasis;

    /**
    * <p>病毒名称</p>
    */
    @SerializedName("VirusName")
    @Expose
    private String VirusName;

    /**
    * <p>病毒家族</p>
    */
    @SerializedName("VirusFamily")
    @Expose
    private String VirusFamily;

    /**
    * <p>NetResponsePayload 响应数据包（base64 编码后的字符串）</p>
    */
    @SerializedName("NetResponsePayload")
    @Expose
    private String NetResponsePayload;

    /**
    * <p>服务进程信息（base64 编码后的 JSON 字符串）</p>
    */
    @SerializedName("NetSvcPs")
    @Expose
    private String NetSvcPs;

    /**
     * Get <p>主键ID</p> 
     * @return Id <p>主键ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>主键ID</p>
     * @param Id <p>主键ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>租户ID</p> 
     * @return AppId <p>租户ID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>租户ID</p>
     * @param AppId <p>租户ID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>告警唯一标识</p> 
     * @return AlertId <p>告警唯一标识</p>
     */
    public String getAlertId() {
        return this.AlertId;
    }

    /**
     * Set <p>告警唯一标识</p>
     * @param AlertId <p>告警唯一标识</p>
     */
    public void setAlertId(String AlertId) {
        this.AlertId = AlertId;
    }

    /**
     * Get <p>告警大类（英文枚举：VIRUS_TROJAN/ABNORMAL_LOGIN/HOST_BEHAVIOR/NETWORK_BEHAVIOR/LINK_ENGINE）</p> 
     * @return AlertCategory <p>告警大类（英文枚举：VIRUS_TROJAN/ABNORMAL_LOGIN/HOST_BEHAVIOR/NETWORK_BEHAVIOR/LINK_ENGINE）</p>
     */
    public String getAlertCategory() {
        return this.AlertCategory;
    }

    /**
     * Set <p>告警大类（英文枚举：VIRUS_TROJAN/ABNORMAL_LOGIN/HOST_BEHAVIOR/NETWORK_BEHAVIOR/LINK_ENGINE）</p>
     * @param AlertCategory <p>告警大类（英文枚举：VIRUS_TROJAN/ABNORMAL_LOGIN/HOST_BEHAVIOR/NETWORK_BEHAVIOR/LINK_ENGINE）</p>
     */
    public void setAlertCategory(String AlertCategory) {
        this.AlertCategory = AlertCategory;
    }

    /**
     * Get <p>告警子类型（英文枚举：MALWARE_FILE/MALWARE_PROCESS/RISK_LOGIN/BRUTE_FORCE/DNS/BASH/PRIV_ESCALATION/REVERSE_SHELL/NET_ATTACK/VUL_DEFENCE/MEMORY_SHELL_INJECT/MEMORY_SHELL_SCAN/MULTI_BEHAVIOR_ATTACK）</p> 
     * @return AlertSubType <p>告警子类型（英文枚举：MALWARE_FILE/MALWARE_PROCESS/RISK_LOGIN/BRUTE_FORCE/DNS/BASH/PRIV_ESCALATION/REVERSE_SHELL/NET_ATTACK/VUL_DEFENCE/MEMORY_SHELL_INJECT/MEMORY_SHELL_SCAN/MULTI_BEHAVIOR_ATTACK）</p>
     */
    public String getAlertSubType() {
        return this.AlertSubType;
    }

    /**
     * Set <p>告警子类型（英文枚举：MALWARE_FILE/MALWARE_PROCESS/RISK_LOGIN/BRUTE_FORCE/DNS/BASH/PRIV_ESCALATION/REVERSE_SHELL/NET_ATTACK/VUL_DEFENCE/MEMORY_SHELL_INJECT/MEMORY_SHELL_SCAN/MULTI_BEHAVIOR_ATTACK）</p>
     * @param AlertSubType <p>告警子类型（英文枚举：MALWARE_FILE/MALWARE_PROCESS/RISK_LOGIN/BRUTE_FORCE/DNS/BASH/PRIV_ESCALATION/REVERSE_SHELL/NET_ATTACK/VUL_DEFENCE/MEMORY_SHELL_INJECT/MEMORY_SHELL_SCAN/MULTI_BEHAVIOR_ATTACK）</p>
     */
    public void setAlertSubType(String AlertSubType) {
        this.AlertSubType = AlertSubType;
    }

    /**
     * Get <p>关联规则ID</p> 
     * @return RuleId <p>关联规则ID</p>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>关联规则ID</p>
     * @param RuleId <p>关联规则ID</p>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>规则类型: 0-系统规则 1-用户自定义</p> 
     * @return RuleType <p>规则类型: 0-系统规则 1-用户自定义</p>
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set <p>规则类型: 0-系统规则 1-用户自定义</p>
     * @param RuleType <p>规则类型: 0-系统规则 1-用户自定义</p>
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get <p>告警等级（英文枚举：CRITICAL/HIGH/MEDIUM/LOW/INFO）</p> 
     * @return Level <p>告警等级（英文枚举：CRITICAL/HIGH/MEDIUM/LOW/INFO）</p>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set <p>告警等级（英文枚举：CRITICAL/HIGH/MEDIUM/LOW/INFO）</p>
     * @param Level <p>告警等级（英文枚举：CRITICAL/HIGH/MEDIUM/LOW/INFO）</p>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get <p>处理状态（英文枚举：PENDING/PROCESSED/WHITELISTED/ISOLATED/CLEANED/IGNORED/ISOLATING/RESTORING/BLOCKED/DELETED）</p> 
     * @return Status <p>处理状态（英文枚举：PENDING/PROCESSED/WHITELISTED/ISOLATED/CLEANED/IGNORED/ISOLATING/RESTORING/BLOCKED/DELETED）</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>处理状态（英文枚举：PENDING/PROCESSED/WHITELISTED/ISOLATED/CLEANED/IGNORED/ISOLATING/RESTORING/BLOCKED/DELETED）</p>
     * @param Status <p>处理状态（英文枚举：PENDING/PROCESSED/WHITELISTED/ISOLATED/CLEANED/IGNORED/ISOLATING/RESTORING/BLOCKED/DELETED）</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>ATT&amp;CK攻击阶段</p> 
     * @return AttackStage <p>ATT&amp;CK攻击阶段</p>
     */
    public String getAttackStage() {
        return this.AttackStage;
    }

    /**
     * Set <p>ATT&amp;CK攻击阶段</p>
     * @param AttackStage <p>ATT&amp;CK攻击阶段</p>
     */
    public void setAttackStage(String AttackStage) {
        this.AttackStage = AttackStage;
    }

    /**
     * Get <p>检测模式（英文枚举：PRECISE/BALANCED/DEEP）</p> 
     * @return DetectMode <p>检测模式（英文枚举：PRECISE/BALANCED/DEEP）</p>
     */
    public String getDetectMode() {
        return this.DetectMode;
    }

    /**
     * Set <p>检测模式（英文枚举：PRECISE/BALANCED/DEEP）</p>
     * @param DetectMode <p>检测模式（英文枚举：PRECISE/BALANCED/DEEP）</p>
     */
    public void setDetectMode(String DetectMode) {
        this.DetectMode = DetectMode;
    }

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
     * Get <p>主机UUID</p> 
     * @return Quuid <p>主机UUID</p>
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set <p>主机UUID</p>
     * @param Quuid <p>主机UUID</p>
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get <p>聚合事件数</p> 
     * @return EventCount <p>聚合事件数</p>
     */
    public Long getEventCount() {
        return this.EventCount;
    }

    /**
     * Set <p>聚合事件数</p>
     * @param EventCount <p>聚合事件数</p>
     */
    public void setEventCount(Long EventCount) {
        this.EventCount = EventCount;
    }

    /**
     * Get <p>是否付费版</p> 
     * @return IsProVersion <p>是否付费版</p>
     */
    public Long getIsProVersion() {
        return this.IsProVersion;
    }

    /**
     * Set <p>是否付费版</p>
     * @param IsProVersion <p>是否付费版</p>
     */
    public void setIsProVersion(Long IsProVersion) {
        this.IsProVersion = IsProVersion;
    }

    /**
     * Get <p>告警来源（英文枚举：HOST/CONTAINER/K8S/CSIP）</p> 
     * @return AlertSource <p>告警来源（英文枚举：HOST/CONTAINER/K8S/CSIP）</p>
     */
    public String getAlertSource() {
        return this.AlertSource;
    }

    /**
     * Set <p>告警来源（英文枚举：HOST/CONTAINER/K8S/CSIP）</p>
     * @param AlertSource <p>告警来源（英文枚举：HOST/CONTAINER/K8S/CSIP）</p>
     */
    public void setAlertSource(String AlertSource) {
        this.AlertSource = AlertSource;
    }

    /**
     * Get <p>容器镜像ID（保留字段，恒为空串）</p> 
     * @return ImageId <p>容器镜像ID（保留字段，恒为空串）</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>容器镜像ID（保留字段，恒为空串）</p>
     * @param ImageId <p>容器镜像ID（保留字段，恒为空串）</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>容器ID（保留字段，恒为空串）</p> 
     * @return ContainerId <p>容器ID（保留字段，恒为空串）</p>
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set <p>容器ID（保留字段，恒为空串）</p>
     * @param ContainerId <p>容器ID（保留字段，恒为空串）</p>
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get <p>集群ID（保留字段，恒为空串）</p> 
     * @return ClusterId <p>集群ID（保留字段，恒为空串）</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID（保留字段，恒为空串）</p>
     * @param ClusterId <p>集群ID（保留字段，恒为空串）</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>首次发现时间</p> 
     * @return FirstDetectTime <p>首次发现时间</p>
     */
    public String getFirstDetectTime() {
        return this.FirstDetectTime;
    }

    /**
     * Set <p>首次发现时间</p>
     * @param FirstDetectTime <p>首次发现时间</p>
     */
    public void setFirstDetectTime(String FirstDetectTime) {
        this.FirstDetectTime = FirstDetectTime;
    }

    /**
     * Get <p>最近发现时间</p> 
     * @return LatestDetectTime <p>最近发现时间</p>
     */
    public String getLatestDetectTime() {
        return this.LatestDetectTime;
    }

    /**
     * Set <p>最近发现时间</p>
     * @param LatestDetectTime <p>最近发现时间</p>
     */
    public void setLatestDetectTime(String LatestDetectTime) {
        this.LatestDetectTime = LatestDetectTime;
    }

    /**
     * Get <p>规则名称（规则富化）</p> 
     * @return RuleName <p>规则名称（规则富化）</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>规则名称（规则富化）</p>
     * @param RuleName <p>规则名称（规则富化）</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>内容类型: md5/cmdline/dns/ip_inbound/ip_outbound/custom_file/process_network</p> 
     * @return ContentType <p>内容类型: md5/cmdline/dns/ip_inbound/ip_outbound/custom_file/process_network</p>
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set <p>内容类型: md5/cmdline/dns/ip_inbound/ip_outbound/custom_file/process_network</p>
     * @param ContentType <p>内容类型: md5/cmdline/dns/ip_inbound/ip_outbound/custom_file/process_network</p>
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get <p>实例名（资产富化）</p> 
     * @return InstanceName <p>实例名（资产富化）</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名（资产富化）</p>
     * @param InstanceName <p>实例名（资产富化）</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>公网IP（资产富化）</p> 
     * @return PublicIp <p>公网IP（资产富化）</p>
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set <p>公网IP（资产富化）</p>
     * @param PublicIp <p>公网IP（资产富化）</p>
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get <p>内网IP（资产富化）</p> 
     * @return PrivateIp <p>内网IP（资产富化）</p>
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set <p>内网IP（资产富化）</p>
     * @param PrivateIp <p>内网IP（资产富化）</p>
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get <p>告警详情JSON字符串（前端通过JSON.parse解析，空值为&quot;{}&quot;）</p> 
     * @return Content <p>告警详情JSON字符串（前端通过JSON.parse解析，空值为&quot;{}&quot;）</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>告警详情JSON字符串（前端通过JSON.parse解析，空值为&quot;{}&quot;）</p>
     * @param Content <p>告警详情JSON字符串（前端通过JSON.parse解析，空值为&quot;{}&quot;）</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>告警名称（子类型中英文名）</p> 
     * @return AlertName <p>告警名称（子类型中英文名）</p>
     */
    public String getAlertName() {
        return this.AlertName;
    }

    /**
     * Set <p>告警名称（子类型中英文名）</p>
     * @param AlertName <p>告警名称（子类型中英文名）</p>
     */
    public void setAlertName(String AlertName) {
        this.AlertName = AlertName;
    }

    /**
     * Get <p>安全中心标签</p> 
     * @return CSIPTags <p>安全中心标签</p>
     */
    public CSIPTag [] getCSIPTags() {
        return this.CSIPTags;
    }

    /**
     * Set <p>安全中心标签</p>
     * @param CSIPTags <p>安全中心标签</p>
     */
    public void setCSIPTags(CSIPTag [] CSIPTags) {
        this.CSIPTags = CSIPTags;
    }

    /**
     * Get <p>危害描述（统一字段，合并原各子类型独立字段）</p> 
     * @return HarmDesc <p>危害描述（统一字段，合并原各子类型独立字段）</p>
     */
    public String getHarmDesc() {
        return this.HarmDesc;
    }

    /**
     * Set <p>危害描述（统一字段，合并原各子类型独立字段）</p>
     * @param HarmDesc <p>危害描述（统一字段，合并原各子类型独立字段）</p>
     */
    public void setHarmDesc(String HarmDesc) {
        this.HarmDesc = HarmDesc;
    }

    /**
     * Get <p>修复建议（统一字段）</p> 
     * @return SuggestScheme <p>修复建议（统一字段）</p>
     */
    public String getSuggestScheme() {
        return this.SuggestScheme;
    }

    /**
     * Set <p>修复建议（统一字段）</p>
     * @param SuggestScheme <p>修复建议（统一字段）</p>
     */
    public void setSuggestScheme(String SuggestScheme) {
        this.SuggestScheme = SuggestScheme;
    }

    /**
     * Get <p>数据来源: vuldb/vdc/intel/default</p> 
     * @return HarmDescSource <p>数据来源: vuldb/vdc/intel/default</p>
     */
    public String getHarmDescSource() {
        return this.HarmDescSource;
    }

    /**
     * Set <p>数据来源: vuldb/vdc/intel/default</p>
     * @param HarmDescSource <p>数据来源: vuldb/vdc/intel/default</p>
     */
    public void setHarmDescSource(String HarmDescSource) {
        this.HarmDescSource = HarmDescSource;
    }

    /**
     * Get <p>统一威胁情报标签（按子类型路由不同情报源）</p> 
     * @return ThreatTags <p>统一威胁情报标签（按子类型路由不同情报源）</p>
     */
    public String [] getThreatTags() {
        return this.ThreatTags;
    }

    /**
     * Set <p>统一威胁情报标签（按子类型路由不同情报源）</p>
     * @param ThreatTags <p>统一威胁情报标签（按子类型路由不同情报源）</p>
     */
    public void setThreatTags(String [] ThreatTags) {
        this.ThreatTags = ThreatTags;
    }

    /**
     * Get <p>Base64解码后的命令（高危命令子类型独有）</p> 
     * @return BashCmdDecoded <p>Base64解码后的命令（高危命令子类型独有）</p>
     */
    public String getBashCmdDecoded() {
        return this.BashCmdDecoded;
    }

    /**
     * Set <p>Base64解码后的命令（高危命令子类型独有）</p>
     * @param BashCmdDecoded <p>Base64解码后的命令（高危命令子类型独有）</p>
     */
    public void setBashCmdDecoded(String BashCmdDecoded) {
        this.BashCmdDecoded = BashCmdDecoded;
    }

    /**
     * Get <p>漏洞名称（网络攻击子类型独有）</p> 
     * @return NetVulName <p>漏洞名称（网络攻击子类型独有）</p>
     */
    public String getNetVulName() {
        return this.NetVulName;
    }

    /**
     * Set <p>漏洞名称（网络攻击子类型独有）</p>
     * @param NetVulName <p>漏洞名称（网络攻击子类型独有）</p>
     */
    public void setNetVulName(String NetVulName) {
        this.NetVulName = NetVulName;
    }

    /**
     * Get <p>CVE编号（网络攻击子类型独有）</p> 
     * @return NetCVEId <p>CVE编号（网络攻击子类型独有）</p>
     */
    public String getNetCVEId() {
        return this.NetCVEId;
    }

    /**
     * Set <p>CVE编号（网络攻击子类型独有）</p>
     * @param NetCVEId <p>CVE编号（网络攻击子类型独有）</p>
     */
    public void setNetCVEId(String NetCVEId) {
        this.NetCVEId = NetCVEId;
    }

    /**
     * Get <p>异常行为（网络攻击子类型独有）</p> 
     * @return NetAbnormalAction <p>异常行为（网络攻击子类型独有）</p>
     */
    public String getNetAbnormalAction() {
        return this.NetAbnormalAction;
    }

    /**
     * Set <p>异常行为（网络攻击子类型独有）</p>
     * @param NetAbnormalAction <p>异常行为（网络攻击子类型独有）</p>
     */
    public void setNetAbnormalAction(String NetAbnormalAction) {
        this.NetAbnormalAction = NetAbnormalAction;
    }

    /**
     * Get <p>IP情报信息（为空时不返回）</p> 
     * @return IPIntel <p>IP情报信息（为空时不返回）</p>
     */
    public IPIntelInfo getIPIntel() {
        return this.IPIntel;
    }

    /**
     * Set <p>IP情报信息（为空时不返回）</p>
     * @param IPIntel <p>IP情报信息（为空时不返回）</p>
     */
    public void setIPIntel(IPIntelInfo IPIntel) {
        this.IPIntel = IPIntel;
    }

    /**
     * Get <p>多行为攻击规则类型分类: sequence/threshold/command</p> 
     * @return MultiBehaviorDetectionMode <p>多行为攻击规则类型分类: sequence/threshold/command</p>
     */
    public String getMultiBehaviorDetectionMode() {
        return this.MultiBehaviorDetectionMode;
    }

    /**
     * Set <p>多行为攻击规则类型分类: sequence/threshold/command</p>
     * @param MultiBehaviorDetectionMode <p>多行为攻击规则类型分类: sequence/threshold/command</p>
     */
    public void setMultiBehaviorDetectionMode(String MultiBehaviorDetectionMode) {
        this.MultiBehaviorDetectionMode = MultiBehaviorDetectionMode;
    }

    /**
     * Get <p>告警来源描述（按子类型派生，描述哪个引擎/规则检出）</p> 
     * @return SourceDesc <p>告警来源描述（按子类型派生，描述哪个引擎/规则检出）</p>
     */
    public String getSourceDesc() {
        return this.SourceDesc;
    }

    /**
     * Set <p>告警来源描述（按子类型派生，描述哪个引擎/规则检出）</p>
     * @param SourceDesc <p>告警来源描述（按子类型派生，描述哪个引擎/规则检出）</p>
     */
    public void setSourceDesc(String SourceDesc) {
        this.SourceDesc = SourceDesc;
    }

    /**
     * Get <p>处理时间参数格式：2026-05-26 19:45:48</p> 
     * @return ModifyTime <p>处理时间参数格式：2026-05-26 19:45:48</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>处理时间参数格式：2026-05-26 19:45:48</p>
     * @param ModifyTime <p>处理时间参数格式：2026-05-26 19:45:48</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>情报富化结果来源（标识本次详情是否成功命中外部情报）；取值 &quot;VDC&quot; / &quot;IPAnalysis&quot; / &quot;BreakingTI&quot; / 空串</p> 
     * @return IntelSource <p>情报富化结果来源（标识本次详情是否成功命中外部情报）；取值 &quot;VDC&quot; / &quot;IPAnalysis&quot; / &quot;BreakingTI&quot; / 空串</p>
     */
    public String getIntelSource() {
        return this.IntelSource;
    }

    /**
     * Set <p>情报富化结果来源（标识本次详情是否成功命中外部情报）；取值 &quot;VDC&quot; / &quot;IPAnalysis&quot; / &quot;BreakingTI&quot; / 空串</p>
     * @param IntelSource <p>情报富化结果来源（标识本次详情是否成功命中外部情报）；取值 &quot;VDC&quot; / &quot;IPAnalysis&quot; / &quot;BreakingTI&quot; / 空串</p>
     */
    public void setIntelSource(String IntelSource) {
        this.IntelSource = IntelSource;
    }

    /**
     * Get <p>综合研判，中英文已翻译，中：恶意/安全/未知；英：Malicious/Safe/Unknown</p> 
     * @return Verdict <p>综合研判，中英文已翻译，中：恶意/安全/未知；英：Malicious/Safe/Unknown</p>
     */
    public String getVerdict() {
        return this.Verdict;
    }

    /**
     * Set <p>综合研判，中英文已翻译，中：恶意/安全/未知；英：Malicious/Safe/Unknown</p>
     * @param Verdict <p>综合研判，中英文已翻译，中：恶意/安全/未知；英：Malicious/Safe/Unknown</p>
     */
    public void setVerdict(String Verdict) {
        this.Verdict = Verdict;
    }

    /**
     * Get <p>研判依据</p> 
     * @return VerdictBasis <p>研判依据</p>
     */
    public String getVerdictBasis() {
        return this.VerdictBasis;
    }

    /**
     * Set <p>研判依据</p>
     * @param VerdictBasis <p>研判依据</p>
     */
    public void setVerdictBasis(String VerdictBasis) {
        this.VerdictBasis = VerdictBasis;
    }

    /**
     * Get <p>病毒名称</p> 
     * @return VirusName <p>病毒名称</p>
     */
    public String getVirusName() {
        return this.VirusName;
    }

    /**
     * Set <p>病毒名称</p>
     * @param VirusName <p>病毒名称</p>
     */
    public void setVirusName(String VirusName) {
        this.VirusName = VirusName;
    }

    /**
     * Get <p>病毒家族</p> 
     * @return VirusFamily <p>病毒家族</p>
     */
    public String getVirusFamily() {
        return this.VirusFamily;
    }

    /**
     * Set <p>病毒家族</p>
     * @param VirusFamily <p>病毒家族</p>
     */
    public void setVirusFamily(String VirusFamily) {
        this.VirusFamily = VirusFamily;
    }

    /**
     * Get <p>NetResponsePayload 响应数据包（base64 编码后的字符串）</p> 
     * @return NetResponsePayload <p>NetResponsePayload 响应数据包（base64 编码后的字符串）</p>
     */
    public String getNetResponsePayload() {
        return this.NetResponsePayload;
    }

    /**
     * Set <p>NetResponsePayload 响应数据包（base64 编码后的字符串）</p>
     * @param NetResponsePayload <p>NetResponsePayload 响应数据包（base64 编码后的字符串）</p>
     */
    public void setNetResponsePayload(String NetResponsePayload) {
        this.NetResponsePayload = NetResponsePayload;
    }

    /**
     * Get <p>服务进程信息（base64 编码后的 JSON 字符串）</p> 
     * @return NetSvcPs <p>服务进程信息（base64 编码后的 JSON 字符串）</p>
     */
    public String getNetSvcPs() {
        return this.NetSvcPs;
    }

    /**
     * Set <p>服务进程信息（base64 编码后的 JSON 字符串）</p>
     * @param NetSvcPs <p>服务进程信息（base64 编码后的 JSON 字符串）</p>
     */
    public void setNetSvcPs(String NetSvcPs) {
        this.NetSvcPs = NetSvcPs;
    }

    public EdrAlertDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdrAlertDetail(EdrAlertDetail source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.AlertId != null) {
            this.AlertId = new String(source.AlertId);
        }
        if (source.AlertCategory != null) {
            this.AlertCategory = new String(source.AlertCategory);
        }
        if (source.AlertSubType != null) {
            this.AlertSubType = new String(source.AlertSubType);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.AttackStage != null) {
            this.AttackStage = new String(source.AttackStage);
        }
        if (source.DetectMode != null) {
            this.DetectMode = new String(source.DetectMode);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.EventCount != null) {
            this.EventCount = new Long(source.EventCount);
        }
        if (source.IsProVersion != null) {
            this.IsProVersion = new Long(source.IsProVersion);
        }
        if (source.AlertSource != null) {
            this.AlertSource = new String(source.AlertSource);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.FirstDetectTime != null) {
            this.FirstDetectTime = new String(source.FirstDetectTime);
        }
        if (source.LatestDetectTime != null) {
            this.LatestDetectTime = new String(source.LatestDetectTime);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.AlertName != null) {
            this.AlertName = new String(source.AlertName);
        }
        if (source.CSIPTags != null) {
            this.CSIPTags = new CSIPTag[source.CSIPTags.length];
            for (int i = 0; i < source.CSIPTags.length; i++) {
                this.CSIPTags[i] = new CSIPTag(source.CSIPTags[i]);
            }
        }
        if (source.HarmDesc != null) {
            this.HarmDesc = new String(source.HarmDesc);
        }
        if (source.SuggestScheme != null) {
            this.SuggestScheme = new String(source.SuggestScheme);
        }
        if (source.HarmDescSource != null) {
            this.HarmDescSource = new String(source.HarmDescSource);
        }
        if (source.ThreatTags != null) {
            this.ThreatTags = new String[source.ThreatTags.length];
            for (int i = 0; i < source.ThreatTags.length; i++) {
                this.ThreatTags[i] = new String(source.ThreatTags[i]);
            }
        }
        if (source.BashCmdDecoded != null) {
            this.BashCmdDecoded = new String(source.BashCmdDecoded);
        }
        if (source.NetVulName != null) {
            this.NetVulName = new String(source.NetVulName);
        }
        if (source.NetCVEId != null) {
            this.NetCVEId = new String(source.NetCVEId);
        }
        if (source.NetAbnormalAction != null) {
            this.NetAbnormalAction = new String(source.NetAbnormalAction);
        }
        if (source.IPIntel != null) {
            this.IPIntel = new IPIntelInfo(source.IPIntel);
        }
        if (source.MultiBehaviorDetectionMode != null) {
            this.MultiBehaviorDetectionMode = new String(source.MultiBehaviorDetectionMode);
        }
        if (source.SourceDesc != null) {
            this.SourceDesc = new String(source.SourceDesc);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.IntelSource != null) {
            this.IntelSource = new String(source.IntelSource);
        }
        if (source.Verdict != null) {
            this.Verdict = new String(source.Verdict);
        }
        if (source.VerdictBasis != null) {
            this.VerdictBasis = new String(source.VerdictBasis);
        }
        if (source.VirusName != null) {
            this.VirusName = new String(source.VirusName);
        }
        if (source.VirusFamily != null) {
            this.VirusFamily = new String(source.VirusFamily);
        }
        if (source.NetResponsePayload != null) {
            this.NetResponsePayload = new String(source.NetResponsePayload);
        }
        if (source.NetSvcPs != null) {
            this.NetSvcPs = new String(source.NetSvcPs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AlertId", this.AlertId);
        this.setParamSimple(map, prefix + "AlertCategory", this.AlertCategory);
        this.setParamSimple(map, prefix + "AlertSubType", this.AlertSubType);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AttackStage", this.AttackStage);
        this.setParamSimple(map, prefix + "DetectMode", this.DetectMode);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamSimple(map, prefix + "IsProVersion", this.IsProVersion);
        this.setParamSimple(map, prefix + "AlertSource", this.AlertSource);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "FirstDetectTime", this.FirstDetectTime);
        this.setParamSimple(map, prefix + "LatestDetectTime", this.LatestDetectTime);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "AlertName", this.AlertName);
        this.setParamArrayObj(map, prefix + "CSIPTags.", this.CSIPTags);
        this.setParamSimple(map, prefix + "HarmDesc", this.HarmDesc);
        this.setParamSimple(map, prefix + "SuggestScheme", this.SuggestScheme);
        this.setParamSimple(map, prefix + "HarmDescSource", this.HarmDescSource);
        this.setParamArraySimple(map, prefix + "ThreatTags.", this.ThreatTags);
        this.setParamSimple(map, prefix + "BashCmdDecoded", this.BashCmdDecoded);
        this.setParamSimple(map, prefix + "NetVulName", this.NetVulName);
        this.setParamSimple(map, prefix + "NetCVEId", this.NetCVEId);
        this.setParamSimple(map, prefix + "NetAbnormalAction", this.NetAbnormalAction);
        this.setParamObj(map, prefix + "IPIntel.", this.IPIntel);
        this.setParamSimple(map, prefix + "MultiBehaviorDetectionMode", this.MultiBehaviorDetectionMode);
        this.setParamSimple(map, prefix + "SourceDesc", this.SourceDesc);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "IntelSource", this.IntelSource);
        this.setParamSimple(map, prefix + "Verdict", this.Verdict);
        this.setParamSimple(map, prefix + "VerdictBasis", this.VerdictBasis);
        this.setParamSimple(map, prefix + "VirusName", this.VirusName);
        this.setParamSimple(map, prefix + "VirusFamily", this.VirusFamily);
        this.setParamSimple(map, prefix + "NetResponsePayload", this.NetResponsePayload);
        this.setParamSimple(map, prefix + "NetSvcPs", this.NetSvcPs);

    }
}

