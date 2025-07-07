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

public class AlertExtraInfo extends AbstractModel {

    /**
    * 相关攻击事件
    */
    @SerializedName("RelateEvent")
    @Expose
    private RelatedEvent RelateEvent;

    /**
    * 泄漏内容
    */
    @SerializedName("LeakContent")
    @Expose
    private String LeakContent;

    /**
    * 泄漏API
    */
    @SerializedName("LeakAPI")
    @Expose
    private String LeakAPI;

    /**
    * secretID
    */
    @SerializedName("SecretID")
    @Expose
    private String SecretID;

    /**
    * 命中规则
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * 规则描述
    */
    @SerializedName("RuleDesc")
    @Expose
    private String RuleDesc;

    /**
    * 协议端口
    */
    @SerializedName("ProtocolPort")
    @Expose
    private String ProtocolPort;

    /**
    * 攻击内容
    */
    @SerializedName("AttackContent")
    @Expose
    private String AttackContent;

    /**
    * 攻击IP画像
    */
    @SerializedName("AttackIPProfile")
    @Expose
    private String AttackIPProfile;

    /**
    * 攻击IP标签
    */
    @SerializedName("AttackIPTags")
    @Expose
    private String AttackIPTags;

    /**
    * 请求方式
    */
    @SerializedName("RequestMethod")
    @Expose
    private String RequestMethod;

    /**
    * HTTP日志
    */
    @SerializedName("HttpLog")
    @Expose
    private String HttpLog;

    /**
    * 被攻击域名
    */
    @SerializedName("AttackDomain")
    @Expose
    private String AttackDomain;

    /**
    * 文件路径
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * user_agent
    */
    @SerializedName("UserAgent")
    @Expose
    private String UserAgent;

    /**
    * 请求头
    */
    @SerializedName("RequestHeaders")
    @Expose
    private String RequestHeaders;

    /**
    * 登录用户名
    */
    @SerializedName("LoginUserName")
    @Expose
    private String LoginUserName;

    /**
    * 漏洞名称
    */
    @SerializedName("VulnerabilityName")
    @Expose
    private String VulnerabilityName;

    /**
    * 公共漏洞和暴露
    */
    @SerializedName("CVE")
    @Expose
    private String CVE;

    /**
    * 服务进程
    */
    @SerializedName("ServiceProcess")
    @Expose
    private String ServiceProcess;

    /**
    * 文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件大小
    */
    @SerializedName("FileSize")
    @Expose
    private String FileSize;

    /**
    * 文件MD5
    */
    @SerializedName("FileMD5")
    @Expose
    private String FileMD5;

    /**
    * 文件最近访问时间
    */
    @SerializedName("FileLastAccessTime")
    @Expose
    private String FileLastAccessTime;

    /**
    * 文件修改时间
    */
    @SerializedName("FileModifyTime")
    @Expose
    private String FileModifyTime;

    /**
    * 最近访问时间
    */
    @SerializedName("RecentAccessTime")
    @Expose
    private String RecentAccessTime;

    /**
    * 最近修改时间
    */
    @SerializedName("RecentModifyTime")
    @Expose
    private String RecentModifyTime;

    /**
    * 病毒名
    */
    @SerializedName("VirusName")
    @Expose
    private String VirusName;

    /**
    * 病毒文件标签
    */
    @SerializedName("VirusFileTags")
    @Expose
    private String VirusFileTags;

    /**
    * 行为特征
    */
    @SerializedName("BehavioralCharacteristics")
    @Expose
    private String BehavioralCharacteristics;

    /**
    * 进程名（PID）
    */
    @SerializedName("ProcessNamePID")
    @Expose
    private String ProcessNamePID;

    /**
    * 进程路径
    */
    @SerializedName("ProcessPath")
    @Expose
    private String ProcessPath;

    /**
    * 进程命令行
    */
    @SerializedName("ProcessCommandLine")
    @Expose
    private String ProcessCommandLine;

    /**
    * 进程权限
    */
    @SerializedName("ProcessPermissions")
    @Expose
    private String ProcessPermissions;

    /**
    * 执行命令
    */
    @SerializedName("ExecutedCommand")
    @Expose
    private String ExecutedCommand;

    /**
    * 受影响文件名
    */
    @SerializedName("AffectedFileName")
    @Expose
    private String AffectedFileName;

    /**
    * 诱饵路径
    */
    @SerializedName("DecoyPath")
    @Expose
    private String DecoyPath;

    /**
    * 恶意进程文件大小
    */
    @SerializedName("MaliciousProcessFileSize")
    @Expose
    private String MaliciousProcessFileSize;

    /**
    * 恶意进程文件MD5
    */
    @SerializedName("MaliciousProcessFileMD5")
    @Expose
    private String MaliciousProcessFileMD5;

    /**
    * 恶意进程名（PID）
    */
    @SerializedName("MaliciousProcessNamePID")
    @Expose
    private String MaliciousProcessNamePID;

    /**
    * 恶意进程路径
    */
    @SerializedName("MaliciousProcessPath")
    @Expose
    private String MaliciousProcessPath;

    /**
    * 恶意进程启动时间
    */
    @SerializedName("MaliciousProcessStartTime")
    @Expose
    private String MaliciousProcessStartTime;

    /**
    * 命令内容
    */
    @SerializedName("CommandContent")
    @Expose
    private String CommandContent;

    /**
    * 启动用户
    */
    @SerializedName("StartupUser")
    @Expose
    private String StartupUser;

    /**
    * 用户所属组
    */
    @SerializedName("UserGroup")
    @Expose
    private String UserGroup;

    /**
    * 新增权限
    */
    @SerializedName("NewPermissions")
    @Expose
    private String NewPermissions;

    /**
    * 父进程
    */
    @SerializedName("ParentProcess")
    @Expose
    private String ParentProcess;

    /**
    * 类名
    */
    @SerializedName("ClassName")
    @Expose
    private String ClassName;

    /**
    * 所属类加载器
    */
    @SerializedName("ClassLoader")
    @Expose
    private String ClassLoader;

    /**
    * 类文件大小
    */
    @SerializedName("ClassFileSize")
    @Expose
    private String ClassFileSize;

    /**
    * 类文件MD5
    */
    @SerializedName("ClassFileMD5")
    @Expose
    private String ClassFileMD5;

    /**
    * 父类名
    */
    @SerializedName("ParentClassName")
    @Expose
    private String ParentClassName;

    /**
    * 继承接口
    */
    @SerializedName("InheritedInterface")
    @Expose
    private String InheritedInterface;

    /**
    * 注释
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 载荷内容
    */
    @SerializedName("PayloadContent")
    @Expose
    private String PayloadContent;

    /**
    * 回连地址画像
    */
    @SerializedName("CallbackAddressPortrait")
    @Expose
    private String CallbackAddressPortrait;

    /**
    * 回连地址标签
    */
    @SerializedName("CallbackAddressTag")
    @Expose
    private String CallbackAddressTag;

    /**
    * 进程MD5
    */
    @SerializedName("ProcessMD5")
    @Expose
    private String ProcessMD5;

    /**
    * 文件权限
    */
    @SerializedName("FilePermission")
    @Expose
    private String FilePermission;

    /**
    * 来源于日志分析的信息字段
    */
    @SerializedName("FromLogAnalysisData")
    @Expose
    private KeyValue [] FromLogAnalysisData;

    /**
    * 命中探针
    */
    @SerializedName("HitProbe")
    @Expose
    private String HitProbe;

    /**
    * 命中蜜罐

    */
    @SerializedName("HitHoneyPot")
    @Expose
    private String HitHoneyPot;

    /**
    * 命令列表
    */
    @SerializedName("CommandList")
    @Expose
    private String CommandList;

    /**
    * 攻击事件描述

    */
    @SerializedName("AttackEventDesc")
    @Expose
    private String AttackEventDesc;

    /**
    * 进程信息
    */
    @SerializedName("ProcessInfo")
    @Expose
    private String ProcessInfo;

    /**
    * 使用用户名&密码
    */
    @SerializedName("UserNameAndPwd")
    @Expose
    private String UserNameAndPwd;

    /**
    * 主机防护策略ID
    */
    @SerializedName("StrategyID")
    @Expose
    private String StrategyID;

    /**
    * 主机防护策略名称
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * 主机防护命中策略，是策略ID和策略名称的组合
    */
    @SerializedName("HitStrategy")
    @Expose
    private String HitStrategy;

    /**
    * 进程名
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * PID
    */
    @SerializedName("PID")
    @Expose
    private String PID;

    /**
    * 容器Pod名
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * 容器PodID
    */
    @SerializedName("PodID")
    @Expose
    private String PodID;

    /**
    * Http响应
    */
    @SerializedName("Response")
    @Expose
    private String Response;

    /**
    * 系统调用
    */
    @SerializedName("SystemCall")
    @Expose
    private String SystemCall;

    /**
    * 操作类型verb
    */
    @SerializedName("Verb")
    @Expose
    private String Verb;

    /**
    * 日志ID
    */
    @SerializedName("LogID")
    @Expose
    private String LogID;

    /**
    * 变更内容
    */
    @SerializedName("Different")
    @Expose
    private String Different;

    /**
    * 事件类型
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * 事件描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 目标地址(容器反弹shell)
    */
    @SerializedName("TargetAddress")
    @Expose
    private String TargetAddress;

    /**
    * 恶意请求域名(容器恶意外联)
    */
    @SerializedName("MaliciousRequestDomain")
    @Expose
    private String MaliciousRequestDomain;

    /**
    * 规则类型(容器K8sAPI异常请求)
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 请求资源(容器K8sAPI异常请求)
    */
    @SerializedName("RequestURI")
    @Expose
    private String RequestURI;

    /**
    * 发起请求用户(容器K8sAPI异常请求)
    */
    @SerializedName("RequestUser")
    @Expose
    private String RequestUser;

    /**
    * 请求对象(容器K8sAPI异常请求)
    */
    @SerializedName("RequestObject")
    @Expose
    private String RequestObject;

    /**
    * 响应对象(容器K8sAPI异常请求)
    */
    @SerializedName("ResponseObject")
    @Expose
    private String ResponseObject;

    /**
    * 文件类型(容器文件篡改)
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 标签特征(容器恶意外联)
    */
    @SerializedName("TIType")
    @Expose
    private String TIType;

    /**
    * 来源IP(容器K8sAPI异常请求)
    */
    @SerializedName("SourceIP")
    @Expose
    private String SourceIP;

    /**
     * Get 相关攻击事件 
     * @return RelateEvent 相关攻击事件
     */
    public RelatedEvent getRelateEvent() {
        return this.RelateEvent;
    }

    /**
     * Set 相关攻击事件
     * @param RelateEvent 相关攻击事件
     */
    public void setRelateEvent(RelatedEvent RelateEvent) {
        this.RelateEvent = RelateEvent;
    }

    /**
     * Get 泄漏内容 
     * @return LeakContent 泄漏内容
     */
    public String getLeakContent() {
        return this.LeakContent;
    }

    /**
     * Set 泄漏内容
     * @param LeakContent 泄漏内容
     */
    public void setLeakContent(String LeakContent) {
        this.LeakContent = LeakContent;
    }

    /**
     * Get 泄漏API 
     * @return LeakAPI 泄漏API
     */
    public String getLeakAPI() {
        return this.LeakAPI;
    }

    /**
     * Set 泄漏API
     * @param LeakAPI 泄漏API
     */
    public void setLeakAPI(String LeakAPI) {
        this.LeakAPI = LeakAPI;
    }

    /**
     * Get secretID 
     * @return SecretID secretID
     */
    public String getSecretID() {
        return this.SecretID;
    }

    /**
     * Set secretID
     * @param SecretID secretID
     */
    public void setSecretID(String SecretID) {
        this.SecretID = SecretID;
    }

    /**
     * Get 命中规则 
     * @return Rule 命中规则
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set 命中规则
     * @param Rule 命中规则
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * Get 规则描述 
     * @return RuleDesc 规则描述
     */
    public String getRuleDesc() {
        return this.RuleDesc;
    }

    /**
     * Set 规则描述
     * @param RuleDesc 规则描述
     */
    public void setRuleDesc(String RuleDesc) {
        this.RuleDesc = RuleDesc;
    }

    /**
     * Get 协议端口 
     * @return ProtocolPort 协议端口
     */
    public String getProtocolPort() {
        return this.ProtocolPort;
    }

    /**
     * Set 协议端口
     * @param ProtocolPort 协议端口
     */
    public void setProtocolPort(String ProtocolPort) {
        this.ProtocolPort = ProtocolPort;
    }

    /**
     * Get 攻击内容 
     * @return AttackContent 攻击内容
     */
    public String getAttackContent() {
        return this.AttackContent;
    }

    /**
     * Set 攻击内容
     * @param AttackContent 攻击内容
     */
    public void setAttackContent(String AttackContent) {
        this.AttackContent = AttackContent;
    }

    /**
     * Get 攻击IP画像 
     * @return AttackIPProfile 攻击IP画像
     */
    public String getAttackIPProfile() {
        return this.AttackIPProfile;
    }

    /**
     * Set 攻击IP画像
     * @param AttackIPProfile 攻击IP画像
     */
    public void setAttackIPProfile(String AttackIPProfile) {
        this.AttackIPProfile = AttackIPProfile;
    }

    /**
     * Get 攻击IP标签 
     * @return AttackIPTags 攻击IP标签
     */
    public String getAttackIPTags() {
        return this.AttackIPTags;
    }

    /**
     * Set 攻击IP标签
     * @param AttackIPTags 攻击IP标签
     */
    public void setAttackIPTags(String AttackIPTags) {
        this.AttackIPTags = AttackIPTags;
    }

    /**
     * Get 请求方式 
     * @return RequestMethod 请求方式
     */
    public String getRequestMethod() {
        return this.RequestMethod;
    }

    /**
     * Set 请求方式
     * @param RequestMethod 请求方式
     */
    public void setRequestMethod(String RequestMethod) {
        this.RequestMethod = RequestMethod;
    }

    /**
     * Get HTTP日志 
     * @return HttpLog HTTP日志
     */
    public String getHttpLog() {
        return this.HttpLog;
    }

    /**
     * Set HTTP日志
     * @param HttpLog HTTP日志
     */
    public void setHttpLog(String HttpLog) {
        this.HttpLog = HttpLog;
    }

    /**
     * Get 被攻击域名 
     * @return AttackDomain 被攻击域名
     */
    public String getAttackDomain() {
        return this.AttackDomain;
    }

    /**
     * Set 被攻击域名
     * @param AttackDomain 被攻击域名
     */
    public void setAttackDomain(String AttackDomain) {
        this.AttackDomain = AttackDomain;
    }

    /**
     * Get 文件路径 
     * @return FilePath 文件路径
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set 文件路径
     * @param FilePath 文件路径
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get user_agent 
     * @return UserAgent user_agent
     */
    public String getUserAgent() {
        return this.UserAgent;
    }

    /**
     * Set user_agent
     * @param UserAgent user_agent
     */
    public void setUserAgent(String UserAgent) {
        this.UserAgent = UserAgent;
    }

    /**
     * Get 请求头 
     * @return RequestHeaders 请求头
     */
    public String getRequestHeaders() {
        return this.RequestHeaders;
    }

    /**
     * Set 请求头
     * @param RequestHeaders 请求头
     */
    public void setRequestHeaders(String RequestHeaders) {
        this.RequestHeaders = RequestHeaders;
    }

    /**
     * Get 登录用户名 
     * @return LoginUserName 登录用户名
     */
    public String getLoginUserName() {
        return this.LoginUserName;
    }

    /**
     * Set 登录用户名
     * @param LoginUserName 登录用户名
     */
    public void setLoginUserName(String LoginUserName) {
        this.LoginUserName = LoginUserName;
    }

    /**
     * Get 漏洞名称 
     * @return VulnerabilityName 漏洞名称
     */
    public String getVulnerabilityName() {
        return this.VulnerabilityName;
    }

    /**
     * Set 漏洞名称
     * @param VulnerabilityName 漏洞名称
     */
    public void setVulnerabilityName(String VulnerabilityName) {
        this.VulnerabilityName = VulnerabilityName;
    }

    /**
     * Get 公共漏洞和暴露 
     * @return CVE 公共漏洞和暴露
     */
    public String getCVE() {
        return this.CVE;
    }

    /**
     * Set 公共漏洞和暴露
     * @param CVE 公共漏洞和暴露
     */
    public void setCVE(String CVE) {
        this.CVE = CVE;
    }

    /**
     * Get 服务进程 
     * @return ServiceProcess 服务进程
     */
    public String getServiceProcess() {
        return this.ServiceProcess;
    }

    /**
     * Set 服务进程
     * @param ServiceProcess 服务进程
     */
    public void setServiceProcess(String ServiceProcess) {
        this.ServiceProcess = ServiceProcess;
    }

    /**
     * Get 文件名 
     * @return FileName 文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名
     * @param FileName 文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件大小 
     * @return FileSize 文件大小
     */
    public String getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文件大小
     * @param FileSize 文件大小
     */
    public void setFileSize(String FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 文件MD5 
     * @return FileMD5 文件MD5
     */
    public String getFileMD5() {
        return this.FileMD5;
    }

    /**
     * Set 文件MD5
     * @param FileMD5 文件MD5
     */
    public void setFileMD5(String FileMD5) {
        this.FileMD5 = FileMD5;
    }

    /**
     * Get 文件最近访问时间 
     * @return FileLastAccessTime 文件最近访问时间
     */
    public String getFileLastAccessTime() {
        return this.FileLastAccessTime;
    }

    /**
     * Set 文件最近访问时间
     * @param FileLastAccessTime 文件最近访问时间
     */
    public void setFileLastAccessTime(String FileLastAccessTime) {
        this.FileLastAccessTime = FileLastAccessTime;
    }

    /**
     * Get 文件修改时间 
     * @return FileModifyTime 文件修改时间
     */
    public String getFileModifyTime() {
        return this.FileModifyTime;
    }

    /**
     * Set 文件修改时间
     * @param FileModifyTime 文件修改时间
     */
    public void setFileModifyTime(String FileModifyTime) {
        this.FileModifyTime = FileModifyTime;
    }

    /**
     * Get 最近访问时间 
     * @return RecentAccessTime 最近访问时间
     */
    public String getRecentAccessTime() {
        return this.RecentAccessTime;
    }

    /**
     * Set 最近访问时间
     * @param RecentAccessTime 最近访问时间
     */
    public void setRecentAccessTime(String RecentAccessTime) {
        this.RecentAccessTime = RecentAccessTime;
    }

    /**
     * Get 最近修改时间 
     * @return RecentModifyTime 最近修改时间
     */
    public String getRecentModifyTime() {
        return this.RecentModifyTime;
    }

    /**
     * Set 最近修改时间
     * @param RecentModifyTime 最近修改时间
     */
    public void setRecentModifyTime(String RecentModifyTime) {
        this.RecentModifyTime = RecentModifyTime;
    }

    /**
     * Get 病毒名 
     * @return VirusName 病毒名
     */
    public String getVirusName() {
        return this.VirusName;
    }

    /**
     * Set 病毒名
     * @param VirusName 病毒名
     */
    public void setVirusName(String VirusName) {
        this.VirusName = VirusName;
    }

    /**
     * Get 病毒文件标签 
     * @return VirusFileTags 病毒文件标签
     */
    public String getVirusFileTags() {
        return this.VirusFileTags;
    }

    /**
     * Set 病毒文件标签
     * @param VirusFileTags 病毒文件标签
     */
    public void setVirusFileTags(String VirusFileTags) {
        this.VirusFileTags = VirusFileTags;
    }

    /**
     * Get 行为特征 
     * @return BehavioralCharacteristics 行为特征
     */
    public String getBehavioralCharacteristics() {
        return this.BehavioralCharacteristics;
    }

    /**
     * Set 行为特征
     * @param BehavioralCharacteristics 行为特征
     */
    public void setBehavioralCharacteristics(String BehavioralCharacteristics) {
        this.BehavioralCharacteristics = BehavioralCharacteristics;
    }

    /**
     * Get 进程名（PID） 
     * @return ProcessNamePID 进程名（PID）
     */
    public String getProcessNamePID() {
        return this.ProcessNamePID;
    }

    /**
     * Set 进程名（PID）
     * @param ProcessNamePID 进程名（PID）
     */
    public void setProcessNamePID(String ProcessNamePID) {
        this.ProcessNamePID = ProcessNamePID;
    }

    /**
     * Get 进程路径 
     * @return ProcessPath 进程路径
     */
    public String getProcessPath() {
        return this.ProcessPath;
    }

    /**
     * Set 进程路径
     * @param ProcessPath 进程路径
     */
    public void setProcessPath(String ProcessPath) {
        this.ProcessPath = ProcessPath;
    }

    /**
     * Get 进程命令行 
     * @return ProcessCommandLine 进程命令行
     */
    public String getProcessCommandLine() {
        return this.ProcessCommandLine;
    }

    /**
     * Set 进程命令行
     * @param ProcessCommandLine 进程命令行
     */
    public void setProcessCommandLine(String ProcessCommandLine) {
        this.ProcessCommandLine = ProcessCommandLine;
    }

    /**
     * Get 进程权限 
     * @return ProcessPermissions 进程权限
     */
    public String getProcessPermissions() {
        return this.ProcessPermissions;
    }

    /**
     * Set 进程权限
     * @param ProcessPermissions 进程权限
     */
    public void setProcessPermissions(String ProcessPermissions) {
        this.ProcessPermissions = ProcessPermissions;
    }

    /**
     * Get 执行命令 
     * @return ExecutedCommand 执行命令
     */
    public String getExecutedCommand() {
        return this.ExecutedCommand;
    }

    /**
     * Set 执行命令
     * @param ExecutedCommand 执行命令
     */
    public void setExecutedCommand(String ExecutedCommand) {
        this.ExecutedCommand = ExecutedCommand;
    }

    /**
     * Get 受影响文件名 
     * @return AffectedFileName 受影响文件名
     */
    public String getAffectedFileName() {
        return this.AffectedFileName;
    }

    /**
     * Set 受影响文件名
     * @param AffectedFileName 受影响文件名
     */
    public void setAffectedFileName(String AffectedFileName) {
        this.AffectedFileName = AffectedFileName;
    }

    /**
     * Get 诱饵路径 
     * @return DecoyPath 诱饵路径
     */
    public String getDecoyPath() {
        return this.DecoyPath;
    }

    /**
     * Set 诱饵路径
     * @param DecoyPath 诱饵路径
     */
    public void setDecoyPath(String DecoyPath) {
        this.DecoyPath = DecoyPath;
    }

    /**
     * Get 恶意进程文件大小 
     * @return MaliciousProcessFileSize 恶意进程文件大小
     */
    public String getMaliciousProcessFileSize() {
        return this.MaliciousProcessFileSize;
    }

    /**
     * Set 恶意进程文件大小
     * @param MaliciousProcessFileSize 恶意进程文件大小
     */
    public void setMaliciousProcessFileSize(String MaliciousProcessFileSize) {
        this.MaliciousProcessFileSize = MaliciousProcessFileSize;
    }

    /**
     * Get 恶意进程文件MD5 
     * @return MaliciousProcessFileMD5 恶意进程文件MD5
     */
    public String getMaliciousProcessFileMD5() {
        return this.MaliciousProcessFileMD5;
    }

    /**
     * Set 恶意进程文件MD5
     * @param MaliciousProcessFileMD5 恶意进程文件MD5
     */
    public void setMaliciousProcessFileMD5(String MaliciousProcessFileMD5) {
        this.MaliciousProcessFileMD5 = MaliciousProcessFileMD5;
    }

    /**
     * Get 恶意进程名（PID） 
     * @return MaliciousProcessNamePID 恶意进程名（PID）
     */
    public String getMaliciousProcessNamePID() {
        return this.MaliciousProcessNamePID;
    }

    /**
     * Set 恶意进程名（PID）
     * @param MaliciousProcessNamePID 恶意进程名（PID）
     */
    public void setMaliciousProcessNamePID(String MaliciousProcessNamePID) {
        this.MaliciousProcessNamePID = MaliciousProcessNamePID;
    }

    /**
     * Get 恶意进程路径 
     * @return MaliciousProcessPath 恶意进程路径
     */
    public String getMaliciousProcessPath() {
        return this.MaliciousProcessPath;
    }

    /**
     * Set 恶意进程路径
     * @param MaliciousProcessPath 恶意进程路径
     */
    public void setMaliciousProcessPath(String MaliciousProcessPath) {
        this.MaliciousProcessPath = MaliciousProcessPath;
    }

    /**
     * Get 恶意进程启动时间 
     * @return MaliciousProcessStartTime 恶意进程启动时间
     */
    public String getMaliciousProcessStartTime() {
        return this.MaliciousProcessStartTime;
    }

    /**
     * Set 恶意进程启动时间
     * @param MaliciousProcessStartTime 恶意进程启动时间
     */
    public void setMaliciousProcessStartTime(String MaliciousProcessStartTime) {
        this.MaliciousProcessStartTime = MaliciousProcessStartTime;
    }

    /**
     * Get 命令内容 
     * @return CommandContent 命令内容
     */
    public String getCommandContent() {
        return this.CommandContent;
    }

    /**
     * Set 命令内容
     * @param CommandContent 命令内容
     */
    public void setCommandContent(String CommandContent) {
        this.CommandContent = CommandContent;
    }

    /**
     * Get 启动用户 
     * @return StartupUser 启动用户
     */
    public String getStartupUser() {
        return this.StartupUser;
    }

    /**
     * Set 启动用户
     * @param StartupUser 启动用户
     */
    public void setStartupUser(String StartupUser) {
        this.StartupUser = StartupUser;
    }

    /**
     * Get 用户所属组 
     * @return UserGroup 用户所属组
     */
    public String getUserGroup() {
        return this.UserGroup;
    }

    /**
     * Set 用户所属组
     * @param UserGroup 用户所属组
     */
    public void setUserGroup(String UserGroup) {
        this.UserGroup = UserGroup;
    }

    /**
     * Get 新增权限 
     * @return NewPermissions 新增权限
     */
    public String getNewPermissions() {
        return this.NewPermissions;
    }

    /**
     * Set 新增权限
     * @param NewPermissions 新增权限
     */
    public void setNewPermissions(String NewPermissions) {
        this.NewPermissions = NewPermissions;
    }

    /**
     * Get 父进程 
     * @return ParentProcess 父进程
     */
    public String getParentProcess() {
        return this.ParentProcess;
    }

    /**
     * Set 父进程
     * @param ParentProcess 父进程
     */
    public void setParentProcess(String ParentProcess) {
        this.ParentProcess = ParentProcess;
    }

    /**
     * Get 类名 
     * @return ClassName 类名
     */
    public String getClassName() {
        return this.ClassName;
    }

    /**
     * Set 类名
     * @param ClassName 类名
     */
    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    /**
     * Get 所属类加载器 
     * @return ClassLoader 所属类加载器
     */
    public String getClassLoader() {
        return this.ClassLoader;
    }

    /**
     * Set 所属类加载器
     * @param ClassLoader 所属类加载器
     */
    public void setClassLoader(String ClassLoader) {
        this.ClassLoader = ClassLoader;
    }

    /**
     * Get 类文件大小 
     * @return ClassFileSize 类文件大小
     */
    public String getClassFileSize() {
        return this.ClassFileSize;
    }

    /**
     * Set 类文件大小
     * @param ClassFileSize 类文件大小
     */
    public void setClassFileSize(String ClassFileSize) {
        this.ClassFileSize = ClassFileSize;
    }

    /**
     * Get 类文件MD5 
     * @return ClassFileMD5 类文件MD5
     */
    public String getClassFileMD5() {
        return this.ClassFileMD5;
    }

    /**
     * Set 类文件MD5
     * @param ClassFileMD5 类文件MD5
     */
    public void setClassFileMD5(String ClassFileMD5) {
        this.ClassFileMD5 = ClassFileMD5;
    }

    /**
     * Get 父类名 
     * @return ParentClassName 父类名
     */
    public String getParentClassName() {
        return this.ParentClassName;
    }

    /**
     * Set 父类名
     * @param ParentClassName 父类名
     */
    public void setParentClassName(String ParentClassName) {
        this.ParentClassName = ParentClassName;
    }

    /**
     * Get 继承接口 
     * @return InheritedInterface 继承接口
     */
    public String getInheritedInterface() {
        return this.InheritedInterface;
    }

    /**
     * Set 继承接口
     * @param InheritedInterface 继承接口
     */
    public void setInheritedInterface(String InheritedInterface) {
        this.InheritedInterface = InheritedInterface;
    }

    /**
     * Get 注释 
     * @return Comment 注释
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 注释
     * @param Comment 注释
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 载荷内容 
     * @return PayloadContent 载荷内容
     */
    public String getPayloadContent() {
        return this.PayloadContent;
    }

    /**
     * Set 载荷内容
     * @param PayloadContent 载荷内容
     */
    public void setPayloadContent(String PayloadContent) {
        this.PayloadContent = PayloadContent;
    }

    /**
     * Get 回连地址画像 
     * @return CallbackAddressPortrait 回连地址画像
     */
    public String getCallbackAddressPortrait() {
        return this.CallbackAddressPortrait;
    }

    /**
     * Set 回连地址画像
     * @param CallbackAddressPortrait 回连地址画像
     */
    public void setCallbackAddressPortrait(String CallbackAddressPortrait) {
        this.CallbackAddressPortrait = CallbackAddressPortrait;
    }

    /**
     * Get 回连地址标签 
     * @return CallbackAddressTag 回连地址标签
     */
    public String getCallbackAddressTag() {
        return this.CallbackAddressTag;
    }

    /**
     * Set 回连地址标签
     * @param CallbackAddressTag 回连地址标签
     */
    public void setCallbackAddressTag(String CallbackAddressTag) {
        this.CallbackAddressTag = CallbackAddressTag;
    }

    /**
     * Get 进程MD5 
     * @return ProcessMD5 进程MD5
     */
    public String getProcessMD5() {
        return this.ProcessMD5;
    }

    /**
     * Set 进程MD5
     * @param ProcessMD5 进程MD5
     */
    public void setProcessMD5(String ProcessMD5) {
        this.ProcessMD5 = ProcessMD5;
    }

    /**
     * Get 文件权限 
     * @return FilePermission 文件权限
     */
    public String getFilePermission() {
        return this.FilePermission;
    }

    /**
     * Set 文件权限
     * @param FilePermission 文件权限
     */
    public void setFilePermission(String FilePermission) {
        this.FilePermission = FilePermission;
    }

    /**
     * Get 来源于日志分析的信息字段 
     * @return FromLogAnalysisData 来源于日志分析的信息字段
     */
    public KeyValue [] getFromLogAnalysisData() {
        return this.FromLogAnalysisData;
    }

    /**
     * Set 来源于日志分析的信息字段
     * @param FromLogAnalysisData 来源于日志分析的信息字段
     */
    public void setFromLogAnalysisData(KeyValue [] FromLogAnalysisData) {
        this.FromLogAnalysisData = FromLogAnalysisData;
    }

    /**
     * Get 命中探针 
     * @return HitProbe 命中探针
     */
    public String getHitProbe() {
        return this.HitProbe;
    }

    /**
     * Set 命中探针
     * @param HitProbe 命中探针
     */
    public void setHitProbe(String HitProbe) {
        this.HitProbe = HitProbe;
    }

    /**
     * Get 命中蜜罐
 
     * @return HitHoneyPot 命中蜜罐

     */
    public String getHitHoneyPot() {
        return this.HitHoneyPot;
    }

    /**
     * Set 命中蜜罐

     * @param HitHoneyPot 命中蜜罐

     */
    public void setHitHoneyPot(String HitHoneyPot) {
        this.HitHoneyPot = HitHoneyPot;
    }

    /**
     * Get 命令列表 
     * @return CommandList 命令列表
     */
    public String getCommandList() {
        return this.CommandList;
    }

    /**
     * Set 命令列表
     * @param CommandList 命令列表
     */
    public void setCommandList(String CommandList) {
        this.CommandList = CommandList;
    }

    /**
     * Get 攻击事件描述
 
     * @return AttackEventDesc 攻击事件描述

     */
    public String getAttackEventDesc() {
        return this.AttackEventDesc;
    }

    /**
     * Set 攻击事件描述

     * @param AttackEventDesc 攻击事件描述

     */
    public void setAttackEventDesc(String AttackEventDesc) {
        this.AttackEventDesc = AttackEventDesc;
    }

    /**
     * Get 进程信息 
     * @return ProcessInfo 进程信息
     */
    public String getProcessInfo() {
        return this.ProcessInfo;
    }

    /**
     * Set 进程信息
     * @param ProcessInfo 进程信息
     */
    public void setProcessInfo(String ProcessInfo) {
        this.ProcessInfo = ProcessInfo;
    }

    /**
     * Get 使用用户名&密码 
     * @return UserNameAndPwd 使用用户名&密码
     */
    public String getUserNameAndPwd() {
        return this.UserNameAndPwd;
    }

    /**
     * Set 使用用户名&密码
     * @param UserNameAndPwd 使用用户名&密码
     */
    public void setUserNameAndPwd(String UserNameAndPwd) {
        this.UserNameAndPwd = UserNameAndPwd;
    }

    /**
     * Get 主机防护策略ID 
     * @return StrategyID 主机防护策略ID
     */
    public String getStrategyID() {
        return this.StrategyID;
    }

    /**
     * Set 主机防护策略ID
     * @param StrategyID 主机防护策略ID
     */
    public void setStrategyID(String StrategyID) {
        this.StrategyID = StrategyID;
    }

    /**
     * Get 主机防护策略名称 
     * @return StrategyName 主机防护策略名称
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set 主机防护策略名称
     * @param StrategyName 主机防护策略名称
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get 主机防护命中策略，是策略ID和策略名称的组合 
     * @return HitStrategy 主机防护命中策略，是策略ID和策略名称的组合
     */
    public String getHitStrategy() {
        return this.HitStrategy;
    }

    /**
     * Set 主机防护命中策略，是策略ID和策略名称的组合
     * @param HitStrategy 主机防护命中策略，是策略ID和策略名称的组合
     */
    public void setHitStrategy(String HitStrategy) {
        this.HitStrategy = HitStrategy;
    }

    /**
     * Get 进程名 
     * @return ProcessName 进程名
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set 进程名
     * @param ProcessName 进程名
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get PID 
     * @return PID PID
     */
    public String getPID() {
        return this.PID;
    }

    /**
     * Set PID
     * @param PID PID
     */
    public void setPID(String PID) {
        this.PID = PID;
    }

    /**
     * Get 容器Pod名 
     * @return PodName 容器Pod名
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set 容器Pod名
     * @param PodName 容器Pod名
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get 容器PodID 
     * @return PodID 容器PodID
     */
    public String getPodID() {
        return this.PodID;
    }

    /**
     * Set 容器PodID
     * @param PodID 容器PodID
     */
    public void setPodID(String PodID) {
        this.PodID = PodID;
    }

    /**
     * Get Http响应 
     * @return Response Http响应
     */
    public String getResponse() {
        return this.Response;
    }

    /**
     * Set Http响应
     * @param Response Http响应
     */
    public void setResponse(String Response) {
        this.Response = Response;
    }

    /**
     * Get 系统调用 
     * @return SystemCall 系统调用
     */
    public String getSystemCall() {
        return this.SystemCall;
    }

    /**
     * Set 系统调用
     * @param SystemCall 系统调用
     */
    public void setSystemCall(String SystemCall) {
        this.SystemCall = SystemCall;
    }

    /**
     * Get 操作类型verb 
     * @return Verb 操作类型verb
     */
    public String getVerb() {
        return this.Verb;
    }

    /**
     * Set 操作类型verb
     * @param Verb 操作类型verb
     */
    public void setVerb(String Verb) {
        this.Verb = Verb;
    }

    /**
     * Get 日志ID 
     * @return LogID 日志ID
     */
    public String getLogID() {
        return this.LogID;
    }

    /**
     * Set 日志ID
     * @param LogID 日志ID
     */
    public void setLogID(String LogID) {
        this.LogID = LogID;
    }

    /**
     * Get 变更内容 
     * @return Different 变更内容
     */
    public String getDifferent() {
        return this.Different;
    }

    /**
     * Set 变更内容
     * @param Different 变更内容
     */
    public void setDifferent(String Different) {
        this.Different = Different;
    }

    /**
     * Get 事件类型 
     * @return EventType 事件类型
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类型
     * @param EventType 事件类型
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 事件描述 
     * @return Description 事件描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 事件描述
     * @param Description 事件描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 目标地址(容器反弹shell) 
     * @return TargetAddress 目标地址(容器反弹shell)
     */
    public String getTargetAddress() {
        return this.TargetAddress;
    }

    /**
     * Set 目标地址(容器反弹shell)
     * @param TargetAddress 目标地址(容器反弹shell)
     */
    public void setTargetAddress(String TargetAddress) {
        this.TargetAddress = TargetAddress;
    }

    /**
     * Get 恶意请求域名(容器恶意外联) 
     * @return MaliciousRequestDomain 恶意请求域名(容器恶意外联)
     */
    public String getMaliciousRequestDomain() {
        return this.MaliciousRequestDomain;
    }

    /**
     * Set 恶意请求域名(容器恶意外联)
     * @param MaliciousRequestDomain 恶意请求域名(容器恶意外联)
     */
    public void setMaliciousRequestDomain(String MaliciousRequestDomain) {
        this.MaliciousRequestDomain = MaliciousRequestDomain;
    }

    /**
     * Get 规则类型(容器K8sAPI异常请求) 
     * @return RuleType 规则类型(容器K8sAPI异常请求)
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型(容器K8sAPI异常请求)
     * @param RuleType 规则类型(容器K8sAPI异常请求)
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 请求资源(容器K8sAPI异常请求) 
     * @return RequestURI 请求资源(容器K8sAPI异常请求)
     */
    public String getRequestURI() {
        return this.RequestURI;
    }

    /**
     * Set 请求资源(容器K8sAPI异常请求)
     * @param RequestURI 请求资源(容器K8sAPI异常请求)
     */
    public void setRequestURI(String RequestURI) {
        this.RequestURI = RequestURI;
    }

    /**
     * Get 发起请求用户(容器K8sAPI异常请求) 
     * @return RequestUser 发起请求用户(容器K8sAPI异常请求)
     */
    public String getRequestUser() {
        return this.RequestUser;
    }

    /**
     * Set 发起请求用户(容器K8sAPI异常请求)
     * @param RequestUser 发起请求用户(容器K8sAPI异常请求)
     */
    public void setRequestUser(String RequestUser) {
        this.RequestUser = RequestUser;
    }

    /**
     * Get 请求对象(容器K8sAPI异常请求) 
     * @return RequestObject 请求对象(容器K8sAPI异常请求)
     */
    public String getRequestObject() {
        return this.RequestObject;
    }

    /**
     * Set 请求对象(容器K8sAPI异常请求)
     * @param RequestObject 请求对象(容器K8sAPI异常请求)
     */
    public void setRequestObject(String RequestObject) {
        this.RequestObject = RequestObject;
    }

    /**
     * Get 响应对象(容器K8sAPI异常请求) 
     * @return ResponseObject 响应对象(容器K8sAPI异常请求)
     */
    public String getResponseObject() {
        return this.ResponseObject;
    }

    /**
     * Set 响应对象(容器K8sAPI异常请求)
     * @param ResponseObject 响应对象(容器K8sAPI异常请求)
     */
    public void setResponseObject(String ResponseObject) {
        this.ResponseObject = ResponseObject;
    }

    /**
     * Get 文件类型(容器文件篡改) 
     * @return FileType 文件类型(容器文件篡改)
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型(容器文件篡改)
     * @param FileType 文件类型(容器文件篡改)
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 标签特征(容器恶意外联) 
     * @return TIType 标签特征(容器恶意外联)
     */
    public String getTIType() {
        return this.TIType;
    }

    /**
     * Set 标签特征(容器恶意外联)
     * @param TIType 标签特征(容器恶意外联)
     */
    public void setTIType(String TIType) {
        this.TIType = TIType;
    }

    /**
     * Get 来源IP(容器K8sAPI异常请求) 
     * @return SourceIP 来源IP(容器K8sAPI异常请求)
     */
    public String getSourceIP() {
        return this.SourceIP;
    }

    /**
     * Set 来源IP(容器K8sAPI异常请求)
     * @param SourceIP 来源IP(容器K8sAPI异常请求)
     */
    public void setSourceIP(String SourceIP) {
        this.SourceIP = SourceIP;
    }

    public AlertExtraInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlertExtraInfo(AlertExtraInfo source) {
        if (source.RelateEvent != null) {
            this.RelateEvent = new RelatedEvent(source.RelateEvent);
        }
        if (source.LeakContent != null) {
            this.LeakContent = new String(source.LeakContent);
        }
        if (source.LeakAPI != null) {
            this.LeakAPI = new String(source.LeakAPI);
        }
        if (source.SecretID != null) {
            this.SecretID = new String(source.SecretID);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
        if (source.RuleDesc != null) {
            this.RuleDesc = new String(source.RuleDesc);
        }
        if (source.ProtocolPort != null) {
            this.ProtocolPort = new String(source.ProtocolPort);
        }
        if (source.AttackContent != null) {
            this.AttackContent = new String(source.AttackContent);
        }
        if (source.AttackIPProfile != null) {
            this.AttackIPProfile = new String(source.AttackIPProfile);
        }
        if (source.AttackIPTags != null) {
            this.AttackIPTags = new String(source.AttackIPTags);
        }
        if (source.RequestMethod != null) {
            this.RequestMethod = new String(source.RequestMethod);
        }
        if (source.HttpLog != null) {
            this.HttpLog = new String(source.HttpLog);
        }
        if (source.AttackDomain != null) {
            this.AttackDomain = new String(source.AttackDomain);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.UserAgent != null) {
            this.UserAgent = new String(source.UserAgent);
        }
        if (source.RequestHeaders != null) {
            this.RequestHeaders = new String(source.RequestHeaders);
        }
        if (source.LoginUserName != null) {
            this.LoginUserName = new String(source.LoginUserName);
        }
        if (source.VulnerabilityName != null) {
            this.VulnerabilityName = new String(source.VulnerabilityName);
        }
        if (source.CVE != null) {
            this.CVE = new String(source.CVE);
        }
        if (source.ServiceProcess != null) {
            this.ServiceProcess = new String(source.ServiceProcess);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileSize != null) {
            this.FileSize = new String(source.FileSize);
        }
        if (source.FileMD5 != null) {
            this.FileMD5 = new String(source.FileMD5);
        }
        if (source.FileLastAccessTime != null) {
            this.FileLastAccessTime = new String(source.FileLastAccessTime);
        }
        if (source.FileModifyTime != null) {
            this.FileModifyTime = new String(source.FileModifyTime);
        }
        if (source.RecentAccessTime != null) {
            this.RecentAccessTime = new String(source.RecentAccessTime);
        }
        if (source.RecentModifyTime != null) {
            this.RecentModifyTime = new String(source.RecentModifyTime);
        }
        if (source.VirusName != null) {
            this.VirusName = new String(source.VirusName);
        }
        if (source.VirusFileTags != null) {
            this.VirusFileTags = new String(source.VirusFileTags);
        }
        if (source.BehavioralCharacteristics != null) {
            this.BehavioralCharacteristics = new String(source.BehavioralCharacteristics);
        }
        if (source.ProcessNamePID != null) {
            this.ProcessNamePID = new String(source.ProcessNamePID);
        }
        if (source.ProcessPath != null) {
            this.ProcessPath = new String(source.ProcessPath);
        }
        if (source.ProcessCommandLine != null) {
            this.ProcessCommandLine = new String(source.ProcessCommandLine);
        }
        if (source.ProcessPermissions != null) {
            this.ProcessPermissions = new String(source.ProcessPermissions);
        }
        if (source.ExecutedCommand != null) {
            this.ExecutedCommand = new String(source.ExecutedCommand);
        }
        if (source.AffectedFileName != null) {
            this.AffectedFileName = new String(source.AffectedFileName);
        }
        if (source.DecoyPath != null) {
            this.DecoyPath = new String(source.DecoyPath);
        }
        if (source.MaliciousProcessFileSize != null) {
            this.MaliciousProcessFileSize = new String(source.MaliciousProcessFileSize);
        }
        if (source.MaliciousProcessFileMD5 != null) {
            this.MaliciousProcessFileMD5 = new String(source.MaliciousProcessFileMD5);
        }
        if (source.MaliciousProcessNamePID != null) {
            this.MaliciousProcessNamePID = new String(source.MaliciousProcessNamePID);
        }
        if (source.MaliciousProcessPath != null) {
            this.MaliciousProcessPath = new String(source.MaliciousProcessPath);
        }
        if (source.MaliciousProcessStartTime != null) {
            this.MaliciousProcessStartTime = new String(source.MaliciousProcessStartTime);
        }
        if (source.CommandContent != null) {
            this.CommandContent = new String(source.CommandContent);
        }
        if (source.StartupUser != null) {
            this.StartupUser = new String(source.StartupUser);
        }
        if (source.UserGroup != null) {
            this.UserGroup = new String(source.UserGroup);
        }
        if (source.NewPermissions != null) {
            this.NewPermissions = new String(source.NewPermissions);
        }
        if (source.ParentProcess != null) {
            this.ParentProcess = new String(source.ParentProcess);
        }
        if (source.ClassName != null) {
            this.ClassName = new String(source.ClassName);
        }
        if (source.ClassLoader != null) {
            this.ClassLoader = new String(source.ClassLoader);
        }
        if (source.ClassFileSize != null) {
            this.ClassFileSize = new String(source.ClassFileSize);
        }
        if (source.ClassFileMD5 != null) {
            this.ClassFileMD5 = new String(source.ClassFileMD5);
        }
        if (source.ParentClassName != null) {
            this.ParentClassName = new String(source.ParentClassName);
        }
        if (source.InheritedInterface != null) {
            this.InheritedInterface = new String(source.InheritedInterface);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.PayloadContent != null) {
            this.PayloadContent = new String(source.PayloadContent);
        }
        if (source.CallbackAddressPortrait != null) {
            this.CallbackAddressPortrait = new String(source.CallbackAddressPortrait);
        }
        if (source.CallbackAddressTag != null) {
            this.CallbackAddressTag = new String(source.CallbackAddressTag);
        }
        if (source.ProcessMD5 != null) {
            this.ProcessMD5 = new String(source.ProcessMD5);
        }
        if (source.FilePermission != null) {
            this.FilePermission = new String(source.FilePermission);
        }
        if (source.FromLogAnalysisData != null) {
            this.FromLogAnalysisData = new KeyValue[source.FromLogAnalysisData.length];
            for (int i = 0; i < source.FromLogAnalysisData.length; i++) {
                this.FromLogAnalysisData[i] = new KeyValue(source.FromLogAnalysisData[i]);
            }
        }
        if (source.HitProbe != null) {
            this.HitProbe = new String(source.HitProbe);
        }
        if (source.HitHoneyPot != null) {
            this.HitHoneyPot = new String(source.HitHoneyPot);
        }
        if (source.CommandList != null) {
            this.CommandList = new String(source.CommandList);
        }
        if (source.AttackEventDesc != null) {
            this.AttackEventDesc = new String(source.AttackEventDesc);
        }
        if (source.ProcessInfo != null) {
            this.ProcessInfo = new String(source.ProcessInfo);
        }
        if (source.UserNameAndPwd != null) {
            this.UserNameAndPwd = new String(source.UserNameAndPwd);
        }
        if (source.StrategyID != null) {
            this.StrategyID = new String(source.StrategyID);
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.HitStrategy != null) {
            this.HitStrategy = new String(source.HitStrategy);
        }
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.PID != null) {
            this.PID = new String(source.PID);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.PodID != null) {
            this.PodID = new String(source.PodID);
        }
        if (source.Response != null) {
            this.Response = new String(source.Response);
        }
        if (source.SystemCall != null) {
            this.SystemCall = new String(source.SystemCall);
        }
        if (source.Verb != null) {
            this.Verb = new String(source.Verb);
        }
        if (source.LogID != null) {
            this.LogID = new String(source.LogID);
        }
        if (source.Different != null) {
            this.Different = new String(source.Different);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.TargetAddress != null) {
            this.TargetAddress = new String(source.TargetAddress);
        }
        if (source.MaliciousRequestDomain != null) {
            this.MaliciousRequestDomain = new String(source.MaliciousRequestDomain);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RequestURI != null) {
            this.RequestURI = new String(source.RequestURI);
        }
        if (source.RequestUser != null) {
            this.RequestUser = new String(source.RequestUser);
        }
        if (source.RequestObject != null) {
            this.RequestObject = new String(source.RequestObject);
        }
        if (source.ResponseObject != null) {
            this.ResponseObject = new String(source.ResponseObject);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.TIType != null) {
            this.TIType = new String(source.TIType);
        }
        if (source.SourceIP != null) {
            this.SourceIP = new String(source.SourceIP);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RelateEvent.", this.RelateEvent);
        this.setParamSimple(map, prefix + "LeakContent", this.LeakContent);
        this.setParamSimple(map, prefix + "LeakAPI", this.LeakAPI);
        this.setParamSimple(map, prefix + "SecretID", this.SecretID);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "RuleDesc", this.RuleDesc);
        this.setParamSimple(map, prefix + "ProtocolPort", this.ProtocolPort);
        this.setParamSimple(map, prefix + "AttackContent", this.AttackContent);
        this.setParamSimple(map, prefix + "AttackIPProfile", this.AttackIPProfile);
        this.setParamSimple(map, prefix + "AttackIPTags", this.AttackIPTags);
        this.setParamSimple(map, prefix + "RequestMethod", this.RequestMethod);
        this.setParamSimple(map, prefix + "HttpLog", this.HttpLog);
        this.setParamSimple(map, prefix + "AttackDomain", this.AttackDomain);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "UserAgent", this.UserAgent);
        this.setParamSimple(map, prefix + "RequestHeaders", this.RequestHeaders);
        this.setParamSimple(map, prefix + "LoginUserName", this.LoginUserName);
        this.setParamSimple(map, prefix + "VulnerabilityName", this.VulnerabilityName);
        this.setParamSimple(map, prefix + "CVE", this.CVE);
        this.setParamSimple(map, prefix + "ServiceProcess", this.ServiceProcess);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "FileMD5", this.FileMD5);
        this.setParamSimple(map, prefix + "FileLastAccessTime", this.FileLastAccessTime);
        this.setParamSimple(map, prefix + "FileModifyTime", this.FileModifyTime);
        this.setParamSimple(map, prefix + "RecentAccessTime", this.RecentAccessTime);
        this.setParamSimple(map, prefix + "RecentModifyTime", this.RecentModifyTime);
        this.setParamSimple(map, prefix + "VirusName", this.VirusName);
        this.setParamSimple(map, prefix + "VirusFileTags", this.VirusFileTags);
        this.setParamSimple(map, prefix + "BehavioralCharacteristics", this.BehavioralCharacteristics);
        this.setParamSimple(map, prefix + "ProcessNamePID", this.ProcessNamePID);
        this.setParamSimple(map, prefix + "ProcessPath", this.ProcessPath);
        this.setParamSimple(map, prefix + "ProcessCommandLine", this.ProcessCommandLine);
        this.setParamSimple(map, prefix + "ProcessPermissions", this.ProcessPermissions);
        this.setParamSimple(map, prefix + "ExecutedCommand", this.ExecutedCommand);
        this.setParamSimple(map, prefix + "AffectedFileName", this.AffectedFileName);
        this.setParamSimple(map, prefix + "DecoyPath", this.DecoyPath);
        this.setParamSimple(map, prefix + "MaliciousProcessFileSize", this.MaliciousProcessFileSize);
        this.setParamSimple(map, prefix + "MaliciousProcessFileMD5", this.MaliciousProcessFileMD5);
        this.setParamSimple(map, prefix + "MaliciousProcessNamePID", this.MaliciousProcessNamePID);
        this.setParamSimple(map, prefix + "MaliciousProcessPath", this.MaliciousProcessPath);
        this.setParamSimple(map, prefix + "MaliciousProcessStartTime", this.MaliciousProcessStartTime);
        this.setParamSimple(map, prefix + "CommandContent", this.CommandContent);
        this.setParamSimple(map, prefix + "StartupUser", this.StartupUser);
        this.setParamSimple(map, prefix + "UserGroup", this.UserGroup);
        this.setParamSimple(map, prefix + "NewPermissions", this.NewPermissions);
        this.setParamSimple(map, prefix + "ParentProcess", this.ParentProcess);
        this.setParamSimple(map, prefix + "ClassName", this.ClassName);
        this.setParamSimple(map, prefix + "ClassLoader", this.ClassLoader);
        this.setParamSimple(map, prefix + "ClassFileSize", this.ClassFileSize);
        this.setParamSimple(map, prefix + "ClassFileMD5", this.ClassFileMD5);
        this.setParamSimple(map, prefix + "ParentClassName", this.ParentClassName);
        this.setParamSimple(map, prefix + "InheritedInterface", this.InheritedInterface);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "PayloadContent", this.PayloadContent);
        this.setParamSimple(map, prefix + "CallbackAddressPortrait", this.CallbackAddressPortrait);
        this.setParamSimple(map, prefix + "CallbackAddressTag", this.CallbackAddressTag);
        this.setParamSimple(map, prefix + "ProcessMD5", this.ProcessMD5);
        this.setParamSimple(map, prefix + "FilePermission", this.FilePermission);
        this.setParamArrayObj(map, prefix + "FromLogAnalysisData.", this.FromLogAnalysisData);
        this.setParamSimple(map, prefix + "HitProbe", this.HitProbe);
        this.setParamSimple(map, prefix + "HitHoneyPot", this.HitHoneyPot);
        this.setParamSimple(map, prefix + "CommandList", this.CommandList);
        this.setParamSimple(map, prefix + "AttackEventDesc", this.AttackEventDesc);
        this.setParamSimple(map, prefix + "ProcessInfo", this.ProcessInfo);
        this.setParamSimple(map, prefix + "UserNameAndPwd", this.UserNameAndPwd);
        this.setParamSimple(map, prefix + "StrategyID", this.StrategyID);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "HitStrategy", this.HitStrategy);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "PID", this.PID);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "PodID", this.PodID);
        this.setParamSimple(map, prefix + "Response", this.Response);
        this.setParamSimple(map, prefix + "SystemCall", this.SystemCall);
        this.setParamSimple(map, prefix + "Verb", this.Verb);
        this.setParamSimple(map, prefix + "LogID", this.LogID);
        this.setParamSimple(map, prefix + "Different", this.Different);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "TargetAddress", this.TargetAddress);
        this.setParamSimple(map, prefix + "MaliciousRequestDomain", this.MaliciousRequestDomain);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "RequestURI", this.RequestURI);
        this.setParamSimple(map, prefix + "RequestUser", this.RequestUser);
        this.setParamSimple(map, prefix + "RequestObject", this.RequestObject);
        this.setParamSimple(map, prefix + "ResponseObject", this.ResponseObject);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "TIType", this.TIType);
        this.setParamSimple(map, prefix + "SourceIP", this.SourceIP);

    }
}

