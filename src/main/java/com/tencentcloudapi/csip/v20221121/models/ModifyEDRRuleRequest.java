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

public class ModifyEDRRuleRequest extends AbstractModel {

    /**
    * <p>策略类型 / Rule Type: 0-系统策略/System Rule, 1-自定义策略/Custom Rule</p>
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * <p>执行动作 / Action: 0-告警/Alert, 1-放行/Allow, 2-告警并拦截/Alert and Block</p>
    */
    @SerializedName("AlertAction")
    @Expose
    private Long AlertAction;

    /**
    * <p>生效资产 / Effective Scope: 0-指定主机/Specified Hosts, 1-全部主机/All Hosts, 2-专业版/Professional, 3-旗舰版/Flagship, 4-专业版+旗舰版/Professional+Flagship     QUUIDS        []string json:&quot;QUUIDS&quot;                                      // 主机列表 / Host QUUIDS (when Scope=0)</p>
    */
    @SerializedName("CWPScope")
    @Expose
    private Long CWPScope;

    /**
    * <p>容器生效镜像范围 / Container Image Scope: 0-指定镜像/Specified Images, 1-全部镜像/All Images</p>
    */
    @SerializedName("TCSSScope")
    @Expose
    private Long TCSSScope;

    /**
    * <p>开关 / Status: 0-开启/Enabled, 1-关闭/Disabled</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>策略名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>内容类型 / Content Type: md5-文件MD5/File MD5, cmdline-命令行/Command Line, dns-DNS, ip_inbound-入站IP/Inbound IP, ip_outbound-出站IP/Outbound IP, custom_file-自定义文件/Custom File, process_network-进程网络/Process Network</p>
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * <p>告警等级 / Alert Level: 1-高危/High, 2-中危/Medium, 3-低危/Low, 4-提示/Reminder</p>
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * <p>检测模式 / Detect Mode: 0-精准/Precise, 1-均衡/Balanced, 2-深度/Deep</p>
    */
    @SerializedName("DetectMode")
    @Expose
    private Long DetectMode;

    /**
    * <p>攻击阶段</p>
    */
    @SerializedName("AttackStage")
    @Expose
    private String AttackStage;

    /**
    * <p>策略</p>
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

    /**
    * <p>策略描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>处理历史告警 / Handle Old Events: 0-否/No, 1-是/Yes</p>
    */
    @SerializedName("DealOldEvents")
    @Expose
    private Long DealOldEvents;

    /**
    * <p>ContentType=md5 时传入的 MD5 列表</p>
    */
    @SerializedName("Md5List")
    @Expose
    private String [] Md5List;

    /**
    * <p>ContentType=custom_file 时传入的文件名列表(Base64编码)</p>
    */
    @SerializedName("FileName")
    @Expose
    private String [] FileName;

    /**
    * <p>ContentType=custom_file 时传入的文件目录列表(Base64编码)</p>
    */
    @SerializedName("FileDirectory")
    @Expose
    private String [] FileDirectory;

    /**
    * <p>ContentType=cmdline 时传入的命令行规则，Process/PProcess/AProcess 的 Exe/Cmdline 字段需要 Base64 编码</p>
    */
    @SerializedName("CmdLineRules")
    @Expose
    private RuleContentCmdLine CmdLineRules;

    /**
    * <p>ContentType=dns 时传入的域名列表(Base64编码)</p>
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * <p>ContentType=ip_outbound 时传入的出站IP列表(Base64编码)</p>
    */
    @SerializedName("OutboundIP")
    @Expose
    private String [] OutboundIP;

    /**
    * <p>ContentType=ip_inbound 时传入的入站IP列表(Base64编码)</p>
    */
    @SerializedName("InboundIP")
    @Expose
    private String [] InboundIP;

    /**
    * <p>镜像ID列表 / Image IDs (when TCSSScope=0)</p>
    */
    @SerializedName("ImageIDs")
    @Expose
    private String [] ImageIDs;

    /**
    * <p>ContentType=process_network 时传入的进程网络规则</p>
    */
    @SerializedName("ProcessNetworkRules")
    @Expose
    private RuleContentProcessNetwork ProcessNetworkRules;

    /**
    * <p>选择的多账号的APPID</p>
    */
    @SerializedName("TargetAppIDs")
    @Expose
    private Long [] TargetAppIDs;

    /**
    * <p>告警的加白目标机器信息</p>
    */
    @SerializedName("Target")
    @Expose
    private EdrAlertTarget Target;

    /**
    * <p>自选资产对应的实例ID和APPID</p>
    */
    @SerializedName("InstanceIDsWithAppId")
    @Expose
    private InstanceIDWithAppIdItem [] InstanceIDsWithAppId;

    /**
    * <p>全选资产排除的实例ID和APPID</p>
    */
    @SerializedName("ExcludeInstanceIDsWithAppId")
    @Expose
    private InstanceIDWithAppIdItem [] ExcludeInstanceIDsWithAppId;

    /**
     * Get <p>策略类型 / Rule Type: 0-系统策略/System Rule, 1-自定义策略/Custom Rule</p> 
     * @return RuleType <p>策略类型 / Rule Type: 0-系统策略/System Rule, 1-自定义策略/Custom Rule</p>
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set <p>策略类型 / Rule Type: 0-系统策略/System Rule, 1-自定义策略/Custom Rule</p>
     * @param RuleType <p>策略类型 / Rule Type: 0-系统策略/System Rule, 1-自定义策略/Custom Rule</p>
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get <p>执行动作 / Action: 0-告警/Alert, 1-放行/Allow, 2-告警并拦截/Alert and Block</p> 
     * @return AlertAction <p>执行动作 / Action: 0-告警/Alert, 1-放行/Allow, 2-告警并拦截/Alert and Block</p>
     */
    public Long getAlertAction() {
        return this.AlertAction;
    }

    /**
     * Set <p>执行动作 / Action: 0-告警/Alert, 1-放行/Allow, 2-告警并拦截/Alert and Block</p>
     * @param AlertAction <p>执行动作 / Action: 0-告警/Alert, 1-放行/Allow, 2-告警并拦截/Alert and Block</p>
     */
    public void setAlertAction(Long AlertAction) {
        this.AlertAction = AlertAction;
    }

    /**
     * Get <p>生效资产 / Effective Scope: 0-指定主机/Specified Hosts, 1-全部主机/All Hosts, 2-专业版/Professional, 3-旗舰版/Flagship, 4-专业版+旗舰版/Professional+Flagship     QUUIDS        []string json:&quot;QUUIDS&quot;                                      // 主机列表 / Host QUUIDS (when Scope=0)</p> 
     * @return CWPScope <p>生效资产 / Effective Scope: 0-指定主机/Specified Hosts, 1-全部主机/All Hosts, 2-专业版/Professional, 3-旗舰版/Flagship, 4-专业版+旗舰版/Professional+Flagship     QUUIDS        []string json:&quot;QUUIDS&quot;                                      // 主机列表 / Host QUUIDS (when Scope=0)</p>
     */
    public Long getCWPScope() {
        return this.CWPScope;
    }

    /**
     * Set <p>生效资产 / Effective Scope: 0-指定主机/Specified Hosts, 1-全部主机/All Hosts, 2-专业版/Professional, 3-旗舰版/Flagship, 4-专业版+旗舰版/Professional+Flagship     QUUIDS        []string json:&quot;QUUIDS&quot;                                      // 主机列表 / Host QUUIDS (when Scope=0)</p>
     * @param CWPScope <p>生效资产 / Effective Scope: 0-指定主机/Specified Hosts, 1-全部主机/All Hosts, 2-专业版/Professional, 3-旗舰版/Flagship, 4-专业版+旗舰版/Professional+Flagship     QUUIDS        []string json:&quot;QUUIDS&quot;                                      // 主机列表 / Host QUUIDS (when Scope=0)</p>
     */
    public void setCWPScope(Long CWPScope) {
        this.CWPScope = CWPScope;
    }

    /**
     * Get <p>容器生效镜像范围 / Container Image Scope: 0-指定镜像/Specified Images, 1-全部镜像/All Images</p> 
     * @return TCSSScope <p>容器生效镜像范围 / Container Image Scope: 0-指定镜像/Specified Images, 1-全部镜像/All Images</p>
     */
    public Long getTCSSScope() {
        return this.TCSSScope;
    }

    /**
     * Set <p>容器生效镜像范围 / Container Image Scope: 0-指定镜像/Specified Images, 1-全部镜像/All Images</p>
     * @param TCSSScope <p>容器生效镜像范围 / Container Image Scope: 0-指定镜像/Specified Images, 1-全部镜像/All Images</p>
     */
    public void setTCSSScope(Long TCSSScope) {
        this.TCSSScope = TCSSScope;
    }

    /**
     * Get <p>开关 / Status: 0-开启/Enabled, 1-关闭/Disabled</p> 
     * @return Status <p>开关 / Status: 0-开启/Enabled, 1-关闭/Disabled</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>开关 / Status: 0-开启/Enabled, 1-关闭/Disabled</p>
     * @param Status <p>开关 / Status: 0-开启/Enabled, 1-关闭/Disabled</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>策略名称</p> 
     * @return Name <p>策略名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>策略名称</p>
     * @param Name <p>策略名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>内容类型 / Content Type: md5-文件MD5/File MD5, cmdline-命令行/Command Line, dns-DNS, ip_inbound-入站IP/Inbound IP, ip_outbound-出站IP/Outbound IP, custom_file-自定义文件/Custom File, process_network-进程网络/Process Network</p> 
     * @return ContentType <p>内容类型 / Content Type: md5-文件MD5/File MD5, cmdline-命令行/Command Line, dns-DNS, ip_inbound-入站IP/Inbound IP, ip_outbound-出站IP/Outbound IP, custom_file-自定义文件/Custom File, process_network-进程网络/Process Network</p>
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set <p>内容类型 / Content Type: md5-文件MD5/File MD5, cmdline-命令行/Command Line, dns-DNS, ip_inbound-入站IP/Inbound IP, ip_outbound-出站IP/Outbound IP, custom_file-自定义文件/Custom File, process_network-进程网络/Process Network</p>
     * @param ContentType <p>内容类型 / Content Type: md5-文件MD5/File MD5, cmdline-命令行/Command Line, dns-DNS, ip_inbound-入站IP/Inbound IP, ip_outbound-出站IP/Outbound IP, custom_file-自定义文件/Custom File, process_network-进程网络/Process Network</p>
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get <p>告警等级 / Alert Level: 1-高危/High, 2-中危/Medium, 3-低危/Low, 4-提示/Reminder</p> 
     * @return Level <p>告警等级 / Alert Level: 1-高危/High, 2-中危/Medium, 3-低危/Low, 4-提示/Reminder</p>
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set <p>告警等级 / Alert Level: 1-高危/High, 2-中危/Medium, 3-低危/Low, 4-提示/Reminder</p>
     * @param Level <p>告警等级 / Alert Level: 1-高危/High, 2-中危/Medium, 3-低危/Low, 4-提示/Reminder</p>
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get <p>检测模式 / Detect Mode: 0-精准/Precise, 1-均衡/Balanced, 2-深度/Deep</p> 
     * @return DetectMode <p>检测模式 / Detect Mode: 0-精准/Precise, 1-均衡/Balanced, 2-深度/Deep</p>
     */
    public Long getDetectMode() {
        return this.DetectMode;
    }

    /**
     * Set <p>检测模式 / Detect Mode: 0-精准/Precise, 1-均衡/Balanced, 2-深度/Deep</p>
     * @param DetectMode <p>检测模式 / Detect Mode: 0-精准/Precise, 1-均衡/Balanced, 2-深度/Deep</p>
     */
    public void setDetectMode(Long DetectMode) {
        this.DetectMode = DetectMode;
    }

    /**
     * Get <p>攻击阶段</p> 
     * @return AttackStage <p>攻击阶段</p>
     */
    public String getAttackStage() {
        return this.AttackStage;
    }

    /**
     * Set <p>攻击阶段</p>
     * @param AttackStage <p>攻击阶段</p>
     */
    public void setAttackStage(String AttackStage) {
        this.AttackStage = AttackStage;
    }

    /**
     * Get <p>策略</p> 
     * @return RuleID <p>策略</p>
     */
    public String getRuleID() {
        return this.RuleID;
    }

    /**
     * Set <p>策略</p>
     * @param RuleID <p>策略</p>
     */
    public void setRuleID(String RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get <p>策略描述</p> 
     * @return Description <p>策略描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>策略描述</p>
     * @param Description <p>策略描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>处理历史告警 / Handle Old Events: 0-否/No, 1-是/Yes</p> 
     * @return DealOldEvents <p>处理历史告警 / Handle Old Events: 0-否/No, 1-是/Yes</p>
     */
    public Long getDealOldEvents() {
        return this.DealOldEvents;
    }

    /**
     * Set <p>处理历史告警 / Handle Old Events: 0-否/No, 1-是/Yes</p>
     * @param DealOldEvents <p>处理历史告警 / Handle Old Events: 0-否/No, 1-是/Yes</p>
     */
    public void setDealOldEvents(Long DealOldEvents) {
        this.DealOldEvents = DealOldEvents;
    }

    /**
     * Get <p>ContentType=md5 时传入的 MD5 列表</p> 
     * @return Md5List <p>ContentType=md5 时传入的 MD5 列表</p>
     */
    public String [] getMd5List() {
        return this.Md5List;
    }

    /**
     * Set <p>ContentType=md5 时传入的 MD5 列表</p>
     * @param Md5List <p>ContentType=md5 时传入的 MD5 列表</p>
     */
    public void setMd5List(String [] Md5List) {
        this.Md5List = Md5List;
    }

    /**
     * Get <p>ContentType=custom_file 时传入的文件名列表(Base64编码)</p> 
     * @return FileName <p>ContentType=custom_file 时传入的文件名列表(Base64编码)</p>
     */
    public String [] getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>ContentType=custom_file 时传入的文件名列表(Base64编码)</p>
     * @param FileName <p>ContentType=custom_file 时传入的文件名列表(Base64编码)</p>
     */
    public void setFileName(String [] FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>ContentType=custom_file 时传入的文件目录列表(Base64编码)</p> 
     * @return FileDirectory <p>ContentType=custom_file 时传入的文件目录列表(Base64编码)</p>
     */
    public String [] getFileDirectory() {
        return this.FileDirectory;
    }

    /**
     * Set <p>ContentType=custom_file 时传入的文件目录列表(Base64编码)</p>
     * @param FileDirectory <p>ContentType=custom_file 时传入的文件目录列表(Base64编码)</p>
     */
    public void setFileDirectory(String [] FileDirectory) {
        this.FileDirectory = FileDirectory;
    }

    /**
     * Get <p>ContentType=cmdline 时传入的命令行规则，Process/PProcess/AProcess 的 Exe/Cmdline 字段需要 Base64 编码</p> 
     * @return CmdLineRules <p>ContentType=cmdline 时传入的命令行规则，Process/PProcess/AProcess 的 Exe/Cmdline 字段需要 Base64 编码</p>
     */
    public RuleContentCmdLine getCmdLineRules() {
        return this.CmdLineRules;
    }

    /**
     * Set <p>ContentType=cmdline 时传入的命令行规则，Process/PProcess/AProcess 的 Exe/Cmdline 字段需要 Base64 编码</p>
     * @param CmdLineRules <p>ContentType=cmdline 时传入的命令行规则，Process/PProcess/AProcess 的 Exe/Cmdline 字段需要 Base64 编码</p>
     */
    public void setCmdLineRules(RuleContentCmdLine CmdLineRules) {
        this.CmdLineRules = CmdLineRules;
    }

    /**
     * Get <p>ContentType=dns 时传入的域名列表(Base64编码)</p> 
     * @return Domains <p>ContentType=dns 时传入的域名列表(Base64编码)</p>
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set <p>ContentType=dns 时传入的域名列表(Base64编码)</p>
     * @param Domains <p>ContentType=dns 时传入的域名列表(Base64编码)</p>
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get <p>ContentType=ip_outbound 时传入的出站IP列表(Base64编码)</p> 
     * @return OutboundIP <p>ContentType=ip_outbound 时传入的出站IP列表(Base64编码)</p>
     */
    public String [] getOutboundIP() {
        return this.OutboundIP;
    }

    /**
     * Set <p>ContentType=ip_outbound 时传入的出站IP列表(Base64编码)</p>
     * @param OutboundIP <p>ContentType=ip_outbound 时传入的出站IP列表(Base64编码)</p>
     */
    public void setOutboundIP(String [] OutboundIP) {
        this.OutboundIP = OutboundIP;
    }

    /**
     * Get <p>ContentType=ip_inbound 时传入的入站IP列表(Base64编码)</p> 
     * @return InboundIP <p>ContentType=ip_inbound 时传入的入站IP列表(Base64编码)</p>
     */
    public String [] getInboundIP() {
        return this.InboundIP;
    }

    /**
     * Set <p>ContentType=ip_inbound 时传入的入站IP列表(Base64编码)</p>
     * @param InboundIP <p>ContentType=ip_inbound 时传入的入站IP列表(Base64编码)</p>
     */
    public void setInboundIP(String [] InboundIP) {
        this.InboundIP = InboundIP;
    }

    /**
     * Get <p>镜像ID列表 / Image IDs (when TCSSScope=0)</p> 
     * @return ImageIDs <p>镜像ID列表 / Image IDs (when TCSSScope=0)</p>
     */
    public String [] getImageIDs() {
        return this.ImageIDs;
    }

    /**
     * Set <p>镜像ID列表 / Image IDs (when TCSSScope=0)</p>
     * @param ImageIDs <p>镜像ID列表 / Image IDs (when TCSSScope=0)</p>
     */
    public void setImageIDs(String [] ImageIDs) {
        this.ImageIDs = ImageIDs;
    }

    /**
     * Get <p>ContentType=process_network 时传入的进程网络规则</p> 
     * @return ProcessNetworkRules <p>ContentType=process_network 时传入的进程网络规则</p>
     */
    public RuleContentProcessNetwork getProcessNetworkRules() {
        return this.ProcessNetworkRules;
    }

    /**
     * Set <p>ContentType=process_network 时传入的进程网络规则</p>
     * @param ProcessNetworkRules <p>ContentType=process_network 时传入的进程网络规则</p>
     */
    public void setProcessNetworkRules(RuleContentProcessNetwork ProcessNetworkRules) {
        this.ProcessNetworkRules = ProcessNetworkRules;
    }

    /**
     * Get <p>选择的多账号的APPID</p> 
     * @return TargetAppIDs <p>选择的多账号的APPID</p>
     */
    public Long [] getTargetAppIDs() {
        return this.TargetAppIDs;
    }

    /**
     * Set <p>选择的多账号的APPID</p>
     * @param TargetAppIDs <p>选择的多账号的APPID</p>
     */
    public void setTargetAppIDs(Long [] TargetAppIDs) {
        this.TargetAppIDs = TargetAppIDs;
    }

    /**
     * Get <p>告警的加白目标机器信息</p> 
     * @return Target <p>告警的加白目标机器信息</p>
     */
    public EdrAlertTarget getTarget() {
        return this.Target;
    }

    /**
     * Set <p>告警的加白目标机器信息</p>
     * @param Target <p>告警的加白目标机器信息</p>
     */
    public void setTarget(EdrAlertTarget Target) {
        this.Target = Target;
    }

    /**
     * Get <p>自选资产对应的实例ID和APPID</p> 
     * @return InstanceIDsWithAppId <p>自选资产对应的实例ID和APPID</p>
     */
    public InstanceIDWithAppIdItem [] getInstanceIDsWithAppId() {
        return this.InstanceIDsWithAppId;
    }

    /**
     * Set <p>自选资产对应的实例ID和APPID</p>
     * @param InstanceIDsWithAppId <p>自选资产对应的实例ID和APPID</p>
     */
    public void setInstanceIDsWithAppId(InstanceIDWithAppIdItem [] InstanceIDsWithAppId) {
        this.InstanceIDsWithAppId = InstanceIDsWithAppId;
    }

    /**
     * Get <p>全选资产排除的实例ID和APPID</p> 
     * @return ExcludeInstanceIDsWithAppId <p>全选资产排除的实例ID和APPID</p>
     */
    public InstanceIDWithAppIdItem [] getExcludeInstanceIDsWithAppId() {
        return this.ExcludeInstanceIDsWithAppId;
    }

    /**
     * Set <p>全选资产排除的实例ID和APPID</p>
     * @param ExcludeInstanceIDsWithAppId <p>全选资产排除的实例ID和APPID</p>
     */
    public void setExcludeInstanceIDsWithAppId(InstanceIDWithAppIdItem [] ExcludeInstanceIDsWithAppId) {
        this.ExcludeInstanceIDsWithAppId = ExcludeInstanceIDsWithAppId;
    }

    public ModifyEDRRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEDRRuleRequest(ModifyEDRRuleRequest source) {
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
        if (source.AlertAction != null) {
            this.AlertAction = new Long(source.AlertAction);
        }
        if (source.CWPScope != null) {
            this.CWPScope = new Long(source.CWPScope);
        }
        if (source.TCSSScope != null) {
            this.TCSSScope = new Long(source.TCSSScope);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.DetectMode != null) {
            this.DetectMode = new Long(source.DetectMode);
        }
        if (source.AttackStage != null) {
            this.AttackStage = new String(source.AttackStage);
        }
        if (source.RuleID != null) {
            this.RuleID = new String(source.RuleID);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DealOldEvents != null) {
            this.DealOldEvents = new Long(source.DealOldEvents);
        }
        if (source.Md5List != null) {
            this.Md5List = new String[source.Md5List.length];
            for (int i = 0; i < source.Md5List.length; i++) {
                this.Md5List[i] = new String(source.Md5List[i]);
            }
        }
        if (source.FileName != null) {
            this.FileName = new String[source.FileName.length];
            for (int i = 0; i < source.FileName.length; i++) {
                this.FileName[i] = new String(source.FileName[i]);
            }
        }
        if (source.FileDirectory != null) {
            this.FileDirectory = new String[source.FileDirectory.length];
            for (int i = 0; i < source.FileDirectory.length; i++) {
                this.FileDirectory[i] = new String(source.FileDirectory[i]);
            }
        }
        if (source.CmdLineRules != null) {
            this.CmdLineRules = new RuleContentCmdLine(source.CmdLineRules);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.OutboundIP != null) {
            this.OutboundIP = new String[source.OutboundIP.length];
            for (int i = 0; i < source.OutboundIP.length; i++) {
                this.OutboundIP[i] = new String(source.OutboundIP[i]);
            }
        }
        if (source.InboundIP != null) {
            this.InboundIP = new String[source.InboundIP.length];
            for (int i = 0; i < source.InboundIP.length; i++) {
                this.InboundIP[i] = new String(source.InboundIP[i]);
            }
        }
        if (source.ImageIDs != null) {
            this.ImageIDs = new String[source.ImageIDs.length];
            for (int i = 0; i < source.ImageIDs.length; i++) {
                this.ImageIDs[i] = new String(source.ImageIDs[i]);
            }
        }
        if (source.ProcessNetworkRules != null) {
            this.ProcessNetworkRules = new RuleContentProcessNetwork(source.ProcessNetworkRules);
        }
        if (source.TargetAppIDs != null) {
            this.TargetAppIDs = new Long[source.TargetAppIDs.length];
            for (int i = 0; i < source.TargetAppIDs.length; i++) {
                this.TargetAppIDs[i] = new Long(source.TargetAppIDs[i]);
            }
        }
        if (source.Target != null) {
            this.Target = new EdrAlertTarget(source.Target);
        }
        if (source.InstanceIDsWithAppId != null) {
            this.InstanceIDsWithAppId = new InstanceIDWithAppIdItem[source.InstanceIDsWithAppId.length];
            for (int i = 0; i < source.InstanceIDsWithAppId.length; i++) {
                this.InstanceIDsWithAppId[i] = new InstanceIDWithAppIdItem(source.InstanceIDsWithAppId[i]);
            }
        }
        if (source.ExcludeInstanceIDsWithAppId != null) {
            this.ExcludeInstanceIDsWithAppId = new InstanceIDWithAppIdItem[source.ExcludeInstanceIDsWithAppId.length];
            for (int i = 0; i < source.ExcludeInstanceIDsWithAppId.length; i++) {
                this.ExcludeInstanceIDsWithAppId[i] = new InstanceIDWithAppIdItem(source.ExcludeInstanceIDsWithAppId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "AlertAction", this.AlertAction);
        this.setParamSimple(map, prefix + "CWPScope", this.CWPScope);
        this.setParamSimple(map, prefix + "TCSSScope", this.TCSSScope);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "DetectMode", this.DetectMode);
        this.setParamSimple(map, prefix + "AttackStage", this.AttackStage);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DealOldEvents", this.DealOldEvents);
        this.setParamArraySimple(map, prefix + "Md5List.", this.Md5List);
        this.setParamArraySimple(map, prefix + "FileName.", this.FileName);
        this.setParamArraySimple(map, prefix + "FileDirectory.", this.FileDirectory);
        this.setParamObj(map, prefix + "CmdLineRules.", this.CmdLineRules);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamArraySimple(map, prefix + "OutboundIP.", this.OutboundIP);
        this.setParamArraySimple(map, prefix + "InboundIP.", this.InboundIP);
        this.setParamArraySimple(map, prefix + "ImageIDs.", this.ImageIDs);
        this.setParamObj(map, prefix + "ProcessNetworkRules.", this.ProcessNetworkRules);
        this.setParamArraySimple(map, prefix + "TargetAppIDs.", this.TargetAppIDs);
        this.setParamObj(map, prefix + "Target.", this.Target);
        this.setParamArrayObj(map, prefix + "InstanceIDsWithAppId.", this.InstanceIDsWithAppId);
        this.setParamArrayObj(map, prefix + "ExcludeInstanceIDsWithAppId.", this.ExcludeInstanceIDsWithAppId);

    }
}

