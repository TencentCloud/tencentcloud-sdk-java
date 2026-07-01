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

public class EDRRule extends AbstractModel {

    /**
    * <p>策略ID</p>
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

    /**
    * <p>策略类型，0-系统策略/System Rule, 1-自定义策略/Custom Rule</p>
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * <p>策略名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>策略描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>内容类型 / Content Type: md5-文件MD5/File MD5, cmdline-命令行/Command Line, dns-DNS, ip_inbound-入站IP/Inbound IP, ip_outbound-出站IP/Outbound IP, custom_file-自定义文件/Custom File, process_network-进程网络/Process Network</p>
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * <p>执行动作 / Action: 0-告警/Alert, 1-放行/Allow, 2-告警并拦截/Alert and Block</p>
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
    * <p>告警等级 / Alert Level: 0-无/None, 1-高危/High, 2-中危/Medium, 3-低危/Low, 4-提示/Reminder</p>
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
    * <p>检测方式 / Detect Type: 0-主机检测/Host Detection, 1-网络检测/Network Detection</p>
    */
    @SerializedName("DetectType")
    @Expose
    private Long DetectType;

    /**
    * <p>攻击阶段</p>
    */
    @SerializedName("AttackStage")
    @Expose
    private String AttackStage;

    /**
    * <p>主机生效资产范围 / Effective Scope: 0-指定主机/Specified Hosts, 1-全部主机/All Hosts, 2-专业版/Professional, 3-旗舰版/Flagship, 4-专业版+旗舰版/Professional+Flagship</p>
    */
    @SerializedName("CWPScope")
    @Expose
    private Long CWPScope;

    /**
    * <p>主机运行时的自选主机</p>
    */
    @SerializedName("QUUIDS")
    @Expose
    private String [] QUUIDS;

    /**
    * <p>状态 / Status: 0-开启/Enabled, 1-关闭/Disabled</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>修改时间</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>是否支持拦截 / Support Block: 0-不支持/Not Supported, 1-支持/Supported</p>
    */
    @SerializedName("SupportBlock")
    @Expose
    private Long SupportBlock;

    /**
    * <p>MD5列表,ContentType=md5 时填充</p>
    */
    @SerializedName("Md5List")
    @Expose
    private String [] Md5List;

    /**
    * <p>文件名列表,ContentType=custom_file 时填充</p>
    */
    @SerializedName("FileName")
    @Expose
    private String [] FileName;

    /**
    * <p>文件目录列表,ContentType=custom_file 时填充</p>
    */
    @SerializedName("FileDirectory")
    @Expose
    private String [] FileDirectory;

    /**
    * <p>域名列表,ContentType=dns 时填充</p>
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * <p>出站IP列表,ContentType=ip_outbound 时填充</p>
    */
    @SerializedName("OutboundIP")
    @Expose
    private String [] OutboundIP;

    /**
    * <p>入站IP列表,ContentType=ip_inbound 时填充</p>
    */
    @SerializedName("InboundIP")
    @Expose
    private String [] InboundIP;

    /**
    * <p>命令行规则,ContentType=cmdline 时填充</p>
    */
    @SerializedName("CmdLineRules")
    @Expose
    private RuleContentCmdLine CmdLineRules;

    /**
    * <p>容器生效镜像范围 / Container Image Scope: 0-指定镜像/Specified Images, 1-全部镜像/All Images</p>
    */
    @SerializedName("TCSSScope")
    @Expose
    private Long TCSSScope;

    /**
    * <p>生效镜像ID列表 / Image IDs (when TCSSScope=0)</p>
    */
    @SerializedName("ImageIDs")
    @Expose
    private String [] ImageIDs;

    /**
    * <p>镜像名正则表达式 / Image Names Regex</p>
    */
    @SerializedName("ImageNamesRegex")
    @Expose
    private String ImageNamesRegex;

    /**
    * <p>置信度 / Confidence: 0-低/Low, 1-中/Medium, 2-高/High</p>
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * <p>排除的主机列表 / Excluded Host QUUIDS</p>
    */
    @SerializedName("ExcludeQUUIDS")
    @Expose
    private String [] ExcludeQUUIDS;

    /**
    * <p>排除的镜像ID列表 / Excluded Image IDs</p>
    */
    @SerializedName("ExcludeImageIDs")
    @Expose
    private String [] ExcludeImageIDs;

    /**
    * <p>进程网络规则 / Process network rules</p>
    */
    @SerializedName("ProcessNetworkRules")
    @Expose
    private RuleContentProcessNetwork ProcessNetworkRules;

    /**
    * <p>策略对应APPID</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>自选实例ID范围</p>
    */
    @SerializedName("InstanceIDs")
    @Expose
    private String [] InstanceIDs;

    /**
    * <p>排除实例ID</p>
    */
    @SerializedName("ExcludeInstanceIDs")
    @Expose
    private String [] ExcludeInstanceIDs;

    /**
     * Get <p>策略ID</p> 
     * @return RuleID <p>策略ID</p>
     */
    public String getRuleID() {
        return this.RuleID;
    }

    /**
     * Set <p>策略ID</p>
     * @param RuleID <p>策略ID</p>
     */
    public void setRuleID(String RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get <p>策略类型，0-系统策略/System Rule, 1-自定义策略/Custom Rule</p> 
     * @return RuleType <p>策略类型，0-系统策略/System Rule, 1-自定义策略/Custom Rule</p>
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set <p>策略类型，0-系统策略/System Rule, 1-自定义策略/Custom Rule</p>
     * @param RuleType <p>策略类型，0-系统策略/System Rule, 1-自定义策略/Custom Rule</p>
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
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
     * Get <p>执行动作 / Action: 0-告警/Alert, 1-放行/Allow, 2-告警并拦截/Alert and Block</p> 
     * @return Action <p>执行动作 / Action: 0-告警/Alert, 1-放行/Allow, 2-告警并拦截/Alert and Block</p>
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set <p>执行动作 / Action: 0-告警/Alert, 1-放行/Allow, 2-告警并拦截/Alert and Block</p>
     * @param Action <p>执行动作 / Action: 0-告警/Alert, 1-放行/Allow, 2-告警并拦截/Alert and Block</p>
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    /**
     * Get <p>告警等级 / Alert Level: 0-无/None, 1-高危/High, 2-中危/Medium, 3-低危/Low, 4-提示/Reminder</p> 
     * @return Level <p>告警等级 / Alert Level: 0-无/None, 1-高危/High, 2-中危/Medium, 3-低危/Low, 4-提示/Reminder</p>
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set <p>告警等级 / Alert Level: 0-无/None, 1-高危/High, 2-中危/Medium, 3-低危/Low, 4-提示/Reminder</p>
     * @param Level <p>告警等级 / Alert Level: 0-无/None, 1-高危/High, 2-中危/Medium, 3-低危/Low, 4-提示/Reminder</p>
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
     * Get <p>检测方式 / Detect Type: 0-主机检测/Host Detection, 1-网络检测/Network Detection</p> 
     * @return DetectType <p>检测方式 / Detect Type: 0-主机检测/Host Detection, 1-网络检测/Network Detection</p>
     */
    public Long getDetectType() {
        return this.DetectType;
    }

    /**
     * Set <p>检测方式 / Detect Type: 0-主机检测/Host Detection, 1-网络检测/Network Detection</p>
     * @param DetectType <p>检测方式 / Detect Type: 0-主机检测/Host Detection, 1-网络检测/Network Detection</p>
     */
    public void setDetectType(Long DetectType) {
        this.DetectType = DetectType;
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
     * Get <p>主机生效资产范围 / Effective Scope: 0-指定主机/Specified Hosts, 1-全部主机/All Hosts, 2-专业版/Professional, 3-旗舰版/Flagship, 4-专业版+旗舰版/Professional+Flagship</p> 
     * @return CWPScope <p>主机生效资产范围 / Effective Scope: 0-指定主机/Specified Hosts, 1-全部主机/All Hosts, 2-专业版/Professional, 3-旗舰版/Flagship, 4-专业版+旗舰版/Professional+Flagship</p>
     */
    public Long getCWPScope() {
        return this.CWPScope;
    }

    /**
     * Set <p>主机生效资产范围 / Effective Scope: 0-指定主机/Specified Hosts, 1-全部主机/All Hosts, 2-专业版/Professional, 3-旗舰版/Flagship, 4-专业版+旗舰版/Professional+Flagship</p>
     * @param CWPScope <p>主机生效资产范围 / Effective Scope: 0-指定主机/Specified Hosts, 1-全部主机/All Hosts, 2-专业版/Professional, 3-旗舰版/Flagship, 4-专业版+旗舰版/Professional+Flagship</p>
     */
    public void setCWPScope(Long CWPScope) {
        this.CWPScope = CWPScope;
    }

    /**
     * Get <p>主机运行时的自选主机</p> 
     * @return QUUIDS <p>主机运行时的自选主机</p>
     */
    public String [] getQUUIDS() {
        return this.QUUIDS;
    }

    /**
     * Set <p>主机运行时的自选主机</p>
     * @param QUUIDS <p>主机运行时的自选主机</p>
     */
    public void setQUUIDS(String [] QUUIDS) {
        this.QUUIDS = QUUIDS;
    }

    /**
     * Get <p>状态 / Status: 0-开启/Enabled, 1-关闭/Disabled</p> 
     * @return Status <p>状态 / Status: 0-开启/Enabled, 1-关闭/Disabled</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态 / Status: 0-开启/Enabled, 1-关闭/Disabled</p>
     * @param Status <p>状态 / Status: 0-开启/Enabled, 1-关闭/Disabled</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>修改时间</p> 
     * @return ModifyTime <p>修改时间</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>修改时间</p>
     * @param ModifyTime <p>修改时间</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>是否支持拦截 / Support Block: 0-不支持/Not Supported, 1-支持/Supported</p> 
     * @return SupportBlock <p>是否支持拦截 / Support Block: 0-不支持/Not Supported, 1-支持/Supported</p>
     */
    public Long getSupportBlock() {
        return this.SupportBlock;
    }

    /**
     * Set <p>是否支持拦截 / Support Block: 0-不支持/Not Supported, 1-支持/Supported</p>
     * @param SupportBlock <p>是否支持拦截 / Support Block: 0-不支持/Not Supported, 1-支持/Supported</p>
     */
    public void setSupportBlock(Long SupportBlock) {
        this.SupportBlock = SupportBlock;
    }

    /**
     * Get <p>MD5列表,ContentType=md5 时填充</p> 
     * @return Md5List <p>MD5列表,ContentType=md5 时填充</p>
     */
    public String [] getMd5List() {
        return this.Md5List;
    }

    /**
     * Set <p>MD5列表,ContentType=md5 时填充</p>
     * @param Md5List <p>MD5列表,ContentType=md5 时填充</p>
     */
    public void setMd5List(String [] Md5List) {
        this.Md5List = Md5List;
    }

    /**
     * Get <p>文件名列表,ContentType=custom_file 时填充</p> 
     * @return FileName <p>文件名列表,ContentType=custom_file 时填充</p>
     */
    public String [] getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>文件名列表,ContentType=custom_file 时填充</p>
     * @param FileName <p>文件名列表,ContentType=custom_file 时填充</p>
     */
    public void setFileName(String [] FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>文件目录列表,ContentType=custom_file 时填充</p> 
     * @return FileDirectory <p>文件目录列表,ContentType=custom_file 时填充</p>
     */
    public String [] getFileDirectory() {
        return this.FileDirectory;
    }

    /**
     * Set <p>文件目录列表,ContentType=custom_file 时填充</p>
     * @param FileDirectory <p>文件目录列表,ContentType=custom_file 时填充</p>
     */
    public void setFileDirectory(String [] FileDirectory) {
        this.FileDirectory = FileDirectory;
    }

    /**
     * Get <p>域名列表,ContentType=dns 时填充</p> 
     * @return Domains <p>域名列表,ContentType=dns 时填充</p>
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set <p>域名列表,ContentType=dns 时填充</p>
     * @param Domains <p>域名列表,ContentType=dns 时填充</p>
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get <p>出站IP列表,ContentType=ip_outbound 时填充</p> 
     * @return OutboundIP <p>出站IP列表,ContentType=ip_outbound 时填充</p>
     */
    public String [] getOutboundIP() {
        return this.OutboundIP;
    }

    /**
     * Set <p>出站IP列表,ContentType=ip_outbound 时填充</p>
     * @param OutboundIP <p>出站IP列表,ContentType=ip_outbound 时填充</p>
     */
    public void setOutboundIP(String [] OutboundIP) {
        this.OutboundIP = OutboundIP;
    }

    /**
     * Get <p>入站IP列表,ContentType=ip_inbound 时填充</p> 
     * @return InboundIP <p>入站IP列表,ContentType=ip_inbound 时填充</p>
     */
    public String [] getInboundIP() {
        return this.InboundIP;
    }

    /**
     * Set <p>入站IP列表,ContentType=ip_inbound 时填充</p>
     * @param InboundIP <p>入站IP列表,ContentType=ip_inbound 时填充</p>
     */
    public void setInboundIP(String [] InboundIP) {
        this.InboundIP = InboundIP;
    }

    /**
     * Get <p>命令行规则,ContentType=cmdline 时填充</p> 
     * @return CmdLineRules <p>命令行规则,ContentType=cmdline 时填充</p>
     */
    public RuleContentCmdLine getCmdLineRules() {
        return this.CmdLineRules;
    }

    /**
     * Set <p>命令行规则,ContentType=cmdline 时填充</p>
     * @param CmdLineRules <p>命令行规则,ContentType=cmdline 时填充</p>
     */
    public void setCmdLineRules(RuleContentCmdLine CmdLineRules) {
        this.CmdLineRules = CmdLineRules;
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
     * Get <p>生效镜像ID列表 / Image IDs (when TCSSScope=0)</p> 
     * @return ImageIDs <p>生效镜像ID列表 / Image IDs (when TCSSScope=0)</p>
     */
    public String [] getImageIDs() {
        return this.ImageIDs;
    }

    /**
     * Set <p>生效镜像ID列表 / Image IDs (when TCSSScope=0)</p>
     * @param ImageIDs <p>生效镜像ID列表 / Image IDs (when TCSSScope=0)</p>
     */
    public void setImageIDs(String [] ImageIDs) {
        this.ImageIDs = ImageIDs;
    }

    /**
     * Get <p>镜像名正则表达式 / Image Names Regex</p> 
     * @return ImageNamesRegex <p>镜像名正则表达式 / Image Names Regex</p>
     */
    public String getImageNamesRegex() {
        return this.ImageNamesRegex;
    }

    /**
     * Set <p>镜像名正则表达式 / Image Names Regex</p>
     * @param ImageNamesRegex <p>镜像名正则表达式 / Image Names Regex</p>
     */
    public void setImageNamesRegex(String ImageNamesRegex) {
        this.ImageNamesRegex = ImageNamesRegex;
    }

    /**
     * Get <p>置信度 / Confidence: 0-低/Low, 1-中/Medium, 2-高/High</p> 
     * @return Confidence <p>置信度 / Confidence: 0-低/Low, 1-中/Medium, 2-高/High</p>
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set <p>置信度 / Confidence: 0-低/Low, 1-中/Medium, 2-高/High</p>
     * @param Confidence <p>置信度 / Confidence: 0-低/Low, 1-中/Medium, 2-高/High</p>
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get <p>排除的主机列表 / Excluded Host QUUIDS</p> 
     * @return ExcludeQUUIDS <p>排除的主机列表 / Excluded Host QUUIDS</p>
     */
    public String [] getExcludeQUUIDS() {
        return this.ExcludeQUUIDS;
    }

    /**
     * Set <p>排除的主机列表 / Excluded Host QUUIDS</p>
     * @param ExcludeQUUIDS <p>排除的主机列表 / Excluded Host QUUIDS</p>
     */
    public void setExcludeQUUIDS(String [] ExcludeQUUIDS) {
        this.ExcludeQUUIDS = ExcludeQUUIDS;
    }

    /**
     * Get <p>排除的镜像ID列表 / Excluded Image IDs</p> 
     * @return ExcludeImageIDs <p>排除的镜像ID列表 / Excluded Image IDs</p>
     */
    public String [] getExcludeImageIDs() {
        return this.ExcludeImageIDs;
    }

    /**
     * Set <p>排除的镜像ID列表 / Excluded Image IDs</p>
     * @param ExcludeImageIDs <p>排除的镜像ID列表 / Excluded Image IDs</p>
     */
    public void setExcludeImageIDs(String [] ExcludeImageIDs) {
        this.ExcludeImageIDs = ExcludeImageIDs;
    }

    /**
     * Get <p>进程网络规则 / Process network rules</p> 
     * @return ProcessNetworkRules <p>进程网络规则 / Process network rules</p>
     */
    public RuleContentProcessNetwork getProcessNetworkRules() {
        return this.ProcessNetworkRules;
    }

    /**
     * Set <p>进程网络规则 / Process network rules</p>
     * @param ProcessNetworkRules <p>进程网络规则 / Process network rules</p>
     */
    public void setProcessNetworkRules(RuleContentProcessNetwork ProcessNetworkRules) {
        this.ProcessNetworkRules = ProcessNetworkRules;
    }

    /**
     * Get <p>策略对应APPID</p> 
     * @return AppID <p>策略对应APPID</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>策略对应APPID</p>
     * @param AppID <p>策略对应APPID</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>自选实例ID范围</p> 
     * @return InstanceIDs <p>自选实例ID范围</p>
     */
    public String [] getInstanceIDs() {
        return this.InstanceIDs;
    }

    /**
     * Set <p>自选实例ID范围</p>
     * @param InstanceIDs <p>自选实例ID范围</p>
     */
    public void setInstanceIDs(String [] InstanceIDs) {
        this.InstanceIDs = InstanceIDs;
    }

    /**
     * Get <p>排除实例ID</p> 
     * @return ExcludeInstanceIDs <p>排除实例ID</p>
     */
    public String [] getExcludeInstanceIDs() {
        return this.ExcludeInstanceIDs;
    }

    /**
     * Set <p>排除实例ID</p>
     * @param ExcludeInstanceIDs <p>排除实例ID</p>
     */
    public void setExcludeInstanceIDs(String [] ExcludeInstanceIDs) {
        this.ExcludeInstanceIDs = ExcludeInstanceIDs;
    }

    public EDRRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EDRRule(EDRRule source) {
        if (source.RuleID != null) {
            this.RuleID = new String(source.RuleID);
        }
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
        if (source.Action != null) {
            this.Action = new Long(source.Action);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.DetectMode != null) {
            this.DetectMode = new Long(source.DetectMode);
        }
        if (source.DetectType != null) {
            this.DetectType = new Long(source.DetectType);
        }
        if (source.AttackStage != null) {
            this.AttackStage = new String(source.AttackStage);
        }
        if (source.CWPScope != null) {
            this.CWPScope = new Long(source.CWPScope);
        }
        if (source.QUUIDS != null) {
            this.QUUIDS = new String[source.QUUIDS.length];
            for (int i = 0; i < source.QUUIDS.length; i++) {
                this.QUUIDS[i] = new String(source.QUUIDS[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.SupportBlock != null) {
            this.SupportBlock = new Long(source.SupportBlock);
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
        if (source.CmdLineRules != null) {
            this.CmdLineRules = new RuleContentCmdLine(source.CmdLineRules);
        }
        if (source.TCSSScope != null) {
            this.TCSSScope = new Long(source.TCSSScope);
        }
        if (source.ImageIDs != null) {
            this.ImageIDs = new String[source.ImageIDs.length];
            for (int i = 0; i < source.ImageIDs.length; i++) {
                this.ImageIDs[i] = new String(source.ImageIDs[i]);
            }
        }
        if (source.ImageNamesRegex != null) {
            this.ImageNamesRegex = new String(source.ImageNamesRegex);
        }
        if (source.Confidence != null) {
            this.Confidence = new Long(source.Confidence);
        }
        if (source.ExcludeQUUIDS != null) {
            this.ExcludeQUUIDS = new String[source.ExcludeQUUIDS.length];
            for (int i = 0; i < source.ExcludeQUUIDS.length; i++) {
                this.ExcludeQUUIDS[i] = new String(source.ExcludeQUUIDS[i]);
            }
        }
        if (source.ExcludeImageIDs != null) {
            this.ExcludeImageIDs = new String[source.ExcludeImageIDs.length];
            for (int i = 0; i < source.ExcludeImageIDs.length; i++) {
                this.ExcludeImageIDs[i] = new String(source.ExcludeImageIDs[i]);
            }
        }
        if (source.ProcessNetworkRules != null) {
            this.ProcessNetworkRules = new RuleContentProcessNetwork(source.ProcessNetworkRules);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.InstanceIDs != null) {
            this.InstanceIDs = new String[source.InstanceIDs.length];
            for (int i = 0; i < source.InstanceIDs.length; i++) {
                this.InstanceIDs[i] = new String(source.InstanceIDs[i]);
            }
        }
        if (source.ExcludeInstanceIDs != null) {
            this.ExcludeInstanceIDs = new String[source.ExcludeInstanceIDs.length];
            for (int i = 0; i < source.ExcludeInstanceIDs.length; i++) {
                this.ExcludeInstanceIDs[i] = new String(source.ExcludeInstanceIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "DetectMode", this.DetectMode);
        this.setParamSimple(map, prefix + "DetectType", this.DetectType);
        this.setParamSimple(map, prefix + "AttackStage", this.AttackStage);
        this.setParamSimple(map, prefix + "CWPScope", this.CWPScope);
        this.setParamArraySimple(map, prefix + "QUUIDS.", this.QUUIDS);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "SupportBlock", this.SupportBlock);
        this.setParamArraySimple(map, prefix + "Md5List.", this.Md5List);
        this.setParamArraySimple(map, prefix + "FileName.", this.FileName);
        this.setParamArraySimple(map, prefix + "FileDirectory.", this.FileDirectory);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamArraySimple(map, prefix + "OutboundIP.", this.OutboundIP);
        this.setParamArraySimple(map, prefix + "InboundIP.", this.InboundIP);
        this.setParamObj(map, prefix + "CmdLineRules.", this.CmdLineRules);
        this.setParamSimple(map, prefix + "TCSSScope", this.TCSSScope);
        this.setParamArraySimple(map, prefix + "ImageIDs.", this.ImageIDs);
        this.setParamSimple(map, prefix + "ImageNamesRegex", this.ImageNamesRegex);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamArraySimple(map, prefix + "ExcludeQUUIDS.", this.ExcludeQUUIDS);
        this.setParamArraySimple(map, prefix + "ExcludeImageIDs.", this.ExcludeImageIDs);
        this.setParamObj(map, prefix + "ProcessNetworkRules.", this.ProcessNetworkRules);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamArraySimple(map, prefix + "InstanceIDs.", this.InstanceIDs);
        this.setParamArraySimple(map, prefix + "ExcludeInstanceIDs.", this.ExcludeInstanceIDs);

    }
}

