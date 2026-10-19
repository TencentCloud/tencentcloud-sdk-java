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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BashEventsInfoNew extends AbstractModel {

    /**
    * <p>数据ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>主机安全ID</p>
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * <p>主机ID</p>
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * <p>主机内网IP</p>
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * <p>平台类型</p>
    */
    @SerializedName("Platform")
    @Expose
    private Long Platform;

    /**
    * <p>执行命令</p>
    */
    @SerializedName("BashCmd")
    @Expose
    private String BashCmd;

    /**
    * <p>规则ID,等于0表示已规则已被删除或生效范围已修改</p>
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * <p>规则名称</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>规则等级：1-高 2-中 3-低</p>
    */
    @SerializedName("RuleLevel")
    @Expose
    private Long RuleLevel;

    /**
    * <p>处理状态： 0 = 待处理 1= 已处理, 2 = 已加白， 3= 已忽略</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>发生时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>主机名</p>
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * <p>进程名称</p>
    */
    @SerializedName("Exe")
    @Expose
    private String Exe;

    /**
    * <p>处理时间</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>规则类别  0=系统规则，1=用户规则</p>
    */
    @SerializedName("RuleCategory")
    @Expose
    private Long RuleCategory;

    /**
    * <p>自动生成的正则表达式</p>
    */
    @SerializedName("RegexBashCmd")
    @Expose
    private String RegexBashCmd;

    /**
    * <p>进程树 json  pid:进程id，exe:文件路径 ，account:进程所属用组和用户 ,cmdline:执行命令，ssh_service: SSH服务ip, ssh_soure:登录源</p>
    */
    @SerializedName("PsTree")
    @Expose
    private String PsTree;

    /**
    * <p>建议方案</p>
    */
    @SerializedName("SuggestScheme")
    @Expose
    private String SuggestScheme;

    /**
    * <p>描述</p>
    */
    @SerializedName("HarmDescribe")
    @Expose
    private String HarmDescribe;

    /**
    * <p>标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>参考链接</p>
    */
    @SerializedName("References")
    @Expose
    private String [] References;

    /**
    * <p>主机外网ip</p>
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * <p>主机在线状态 OFFLINE  ONLINE</p>
    */
    @SerializedName("MachineStatus")
    @Expose
    private String MachineStatus;

    /**
    * <p>登录用户</p>
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * <p>进程号</p>
    */
    @SerializedName("Pid")
    @Expose
    private String Pid;

    /**
    * <p>0:普通 1:专业版 2:旗舰版</p>
    */
    @SerializedName("MachineType")
    @Expose
    private Long MachineType;

    /**
    * <p>检测来源 0:bash日志 1:实时监控</p>
    */
    @SerializedName("DetectBy")
    @Expose
    private Long DetectBy;

    /**
    * <p>执行命令(解码后)</p>
    */
    @SerializedName("BashCmdDecoded")
    @Expose
    private String BashCmdDecoded;

    /**
    * <p>告警次数：同一聚合维度当天的告警命中次数，老数据为空</p>
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

    /**
    * <p>首次发现时间（格式 yyyy-MM-dd HH:mm:ss）</p>
    */
    @SerializedName("FirstDetectTime")
    @Expose
    private String FirstDetectTime;

    /**
    * <p>最近发现时间（格式 yyyy-MM-dd HH:mm:ss）</p>
    */
    @SerializedName("LatestDetectTime")
    @Expose
    private String LatestDetectTime;

    /**
    * <p>进程MD5（文件监控行为独有）</p>
    */
    @SerializedName("FileProcessMd5")
    @Expose
    private String FileProcessMd5;

    /**
    * <p>动作：进程对文件的操作，如 读/写/重命名/删除/清空内容（文件监控行为独有）</p>
    */
    @SerializedName("FileAction")
    @Expose
    private String FileAction;

    /**
    * <p>文件路径（文件监控行为独有）</p>
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * <p>文件MD5（文件监控行为独有）</p>
    */
    @SerializedName("FileMd5")
    @Expose
    private String FileMd5;

    /**
    * <p>文件名称（文件监控行为独有）</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>文件大小（文件监控行为独有）</p>
    */
    @SerializedName("FileSize")
    @Expose
    private String FileSize;

    /**
    * <p>文件修改时间（文件监控行为独有）</p>
    */
    @SerializedName("FileModifyTime")
    @Expose
    private String FileModifyTime;

    /**
    * <p>文件权限（文件监控行为独有）</p>
    */
    @SerializedName("FilePermission")
    @Expose
    private String FilePermission;

    /**
    * <p>文件访问时间</p>
    */
    @SerializedName("FileAccessTime")
    @Expose
    private String FileAccessTime;

    /**
    * <p>高危命令事件类型</p><p>枚举值：</p><ul><li>filemon： 文件监控事件</li><li>connect： 外联行为事件</li><li>process： 进程启动事件</li></ul>
    */
    @SerializedName("BashType")
    @Expose
    private String BashType;

    /**
     * Get <p>数据ID</p> 
     * @return Id <p>数据ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>数据ID</p>
     * @param Id <p>数据ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>主机安全ID</p> 
     * @return Uuid <p>主机安全ID</p>
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set <p>主机安全ID</p>
     * @param Uuid <p>主机安全ID</p>
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get <p>主机ID</p> 
     * @return Quuid <p>主机ID</p>
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set <p>主机ID</p>
     * @param Quuid <p>主机ID</p>
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get <p>主机内网IP</p> 
     * @return HostIp <p>主机内网IP</p>
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set <p>主机内网IP</p>
     * @param HostIp <p>主机内网IP</p>
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get <p>平台类型</p> 
     * @return Platform <p>平台类型</p>
     */
    public Long getPlatform() {
        return this.Platform;
    }

    /**
     * Set <p>平台类型</p>
     * @param Platform <p>平台类型</p>
     */
    public void setPlatform(Long Platform) {
        this.Platform = Platform;
    }

    /**
     * Get <p>执行命令</p> 
     * @return BashCmd <p>执行命令</p>
     */
    public String getBashCmd() {
        return this.BashCmd;
    }

    /**
     * Set <p>执行命令</p>
     * @param BashCmd <p>执行命令</p>
     */
    public void setBashCmd(String BashCmd) {
        this.BashCmd = BashCmd;
    }

    /**
     * Get <p>规则ID,等于0表示已规则已被删除或生效范围已修改</p> 
     * @return RuleId <p>规则ID,等于0表示已规则已被删除或生效范围已修改</p>
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>规则ID,等于0表示已规则已被删除或生效范围已修改</p>
     * @param RuleId <p>规则ID,等于0表示已规则已被删除或生效范围已修改</p>
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>规则名称</p> 
     * @return RuleName <p>规则名称</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>规则名称</p>
     * @param RuleName <p>规则名称</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>规则等级：1-高 2-中 3-低</p> 
     * @return RuleLevel <p>规则等级：1-高 2-中 3-低</p>
     */
    public Long getRuleLevel() {
        return this.RuleLevel;
    }

    /**
     * Set <p>规则等级：1-高 2-中 3-低</p>
     * @param RuleLevel <p>规则等级：1-高 2-中 3-低</p>
     */
    public void setRuleLevel(Long RuleLevel) {
        this.RuleLevel = RuleLevel;
    }

    /**
     * Get <p>处理状态： 0 = 待处理 1= 已处理, 2 = 已加白， 3= 已忽略</p> 
     * @return Status <p>处理状态： 0 = 待处理 1= 已处理, 2 = 已加白， 3= 已忽略</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>处理状态： 0 = 待处理 1= 已处理, 2 = 已加白， 3= 已忽略</p>
     * @param Status <p>处理状态： 0 = 待处理 1= 已处理, 2 = 已加白， 3= 已忽略</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>发生时间</p> 
     * @return CreateTime <p>发生时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>发生时间</p>
     * @param CreateTime <p>发生时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>主机名</p> 
     * @return MachineName <p>主机名</p>
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set <p>主机名</p>
     * @param MachineName <p>主机名</p>
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get <p>进程名称</p> 
     * @return Exe <p>进程名称</p>
     */
    public String getExe() {
        return this.Exe;
    }

    /**
     * Set <p>进程名称</p>
     * @param Exe <p>进程名称</p>
     */
    public void setExe(String Exe) {
        this.Exe = Exe;
    }

    /**
     * Get <p>处理时间</p> 
     * @return ModifyTime <p>处理时间</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>处理时间</p>
     * @param ModifyTime <p>处理时间</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>规则类别  0=系统规则，1=用户规则</p> 
     * @return RuleCategory <p>规则类别  0=系统规则，1=用户规则</p>
     */
    public Long getRuleCategory() {
        return this.RuleCategory;
    }

    /**
     * Set <p>规则类别  0=系统规则，1=用户规则</p>
     * @param RuleCategory <p>规则类别  0=系统规则，1=用户规则</p>
     */
    public void setRuleCategory(Long RuleCategory) {
        this.RuleCategory = RuleCategory;
    }

    /**
     * Get <p>自动生成的正则表达式</p> 
     * @return RegexBashCmd <p>自动生成的正则表达式</p>
     */
    public String getRegexBashCmd() {
        return this.RegexBashCmd;
    }

    /**
     * Set <p>自动生成的正则表达式</p>
     * @param RegexBashCmd <p>自动生成的正则表达式</p>
     */
    public void setRegexBashCmd(String RegexBashCmd) {
        this.RegexBashCmd = RegexBashCmd;
    }

    /**
     * Get <p>进程树 json  pid:进程id，exe:文件路径 ，account:进程所属用组和用户 ,cmdline:执行命令，ssh_service: SSH服务ip, ssh_soure:登录源</p> 
     * @return PsTree <p>进程树 json  pid:进程id，exe:文件路径 ，account:进程所属用组和用户 ,cmdline:执行命令，ssh_service: SSH服务ip, ssh_soure:登录源</p>
     */
    public String getPsTree() {
        return this.PsTree;
    }

    /**
     * Set <p>进程树 json  pid:进程id，exe:文件路径 ，account:进程所属用组和用户 ,cmdline:执行命令，ssh_service: SSH服务ip, ssh_soure:登录源</p>
     * @param PsTree <p>进程树 json  pid:进程id，exe:文件路径 ，account:进程所属用组和用户 ,cmdline:执行命令，ssh_service: SSH服务ip, ssh_soure:登录源</p>
     */
    public void setPsTree(String PsTree) {
        this.PsTree = PsTree;
    }

    /**
     * Get <p>建议方案</p> 
     * @return SuggestScheme <p>建议方案</p>
     */
    public String getSuggestScheme() {
        return this.SuggestScheme;
    }

    /**
     * Set <p>建议方案</p>
     * @param SuggestScheme <p>建议方案</p>
     */
    public void setSuggestScheme(String SuggestScheme) {
        this.SuggestScheme = SuggestScheme;
    }

    /**
     * Get <p>描述</p> 
     * @return HarmDescribe <p>描述</p>
     */
    public String getHarmDescribe() {
        return this.HarmDescribe;
    }

    /**
     * Set <p>描述</p>
     * @param HarmDescribe <p>描述</p>
     */
    public void setHarmDescribe(String HarmDescribe) {
        this.HarmDescribe = HarmDescribe;
    }

    /**
     * Get <p>标签</p> 
     * @return Tags <p>标签</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
     * @param Tags <p>标签</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>参考链接</p> 
     * @return References <p>参考链接</p>
     */
    public String [] getReferences() {
        return this.References;
    }

    /**
     * Set <p>参考链接</p>
     * @param References <p>参考链接</p>
     */
    public void setReferences(String [] References) {
        this.References = References;
    }

    /**
     * Get <p>主机外网ip</p> 
     * @return MachineWanIp <p>主机外网ip</p>
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set <p>主机外网ip</p>
     * @param MachineWanIp <p>主机外网ip</p>
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get <p>主机在线状态 OFFLINE  ONLINE</p> 
     * @return MachineStatus <p>主机在线状态 OFFLINE  ONLINE</p>
     */
    public String getMachineStatus() {
        return this.MachineStatus;
    }

    /**
     * Set <p>主机在线状态 OFFLINE  ONLINE</p>
     * @param MachineStatus <p>主机在线状态 OFFLINE  ONLINE</p>
     */
    public void setMachineStatus(String MachineStatus) {
        this.MachineStatus = MachineStatus;
    }

    /**
     * Get <p>登录用户</p> 
     * @return User <p>登录用户</p>
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set <p>登录用户</p>
     * @param User <p>登录用户</p>
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get <p>进程号</p> 
     * @return Pid <p>进程号</p>
     */
    public String getPid() {
        return this.Pid;
    }

    /**
     * Set <p>进程号</p>
     * @param Pid <p>进程号</p>
     */
    public void setPid(String Pid) {
        this.Pid = Pid;
    }

    /**
     * Get <p>0:普通 1:专业版 2:旗舰版</p> 
     * @return MachineType <p>0:普通 1:专业版 2:旗舰版</p>
     */
    public Long getMachineType() {
        return this.MachineType;
    }

    /**
     * Set <p>0:普通 1:专业版 2:旗舰版</p>
     * @param MachineType <p>0:普通 1:专业版 2:旗舰版</p>
     */
    public void setMachineType(Long MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get <p>检测来源 0:bash日志 1:实时监控</p> 
     * @return DetectBy <p>检测来源 0:bash日志 1:实时监控</p>
     */
    public Long getDetectBy() {
        return this.DetectBy;
    }

    /**
     * Set <p>检测来源 0:bash日志 1:实时监控</p>
     * @param DetectBy <p>检测来源 0:bash日志 1:实时监控</p>
     */
    public void setDetectBy(Long DetectBy) {
        this.DetectBy = DetectBy;
    }

    /**
     * Get <p>执行命令(解码后)</p> 
     * @return BashCmdDecoded <p>执行命令(解码后)</p>
     */
    public String getBashCmdDecoded() {
        return this.BashCmdDecoded;
    }

    /**
     * Set <p>执行命令(解码后)</p>
     * @param BashCmdDecoded <p>执行命令(解码后)</p>
     */
    public void setBashCmdDecoded(String BashCmdDecoded) {
        this.BashCmdDecoded = BashCmdDecoded;
    }

    /**
     * Get <p>告警次数：同一聚合维度当天的告警命中次数，老数据为空</p> 
     * @return EventCount <p>告警次数：同一聚合维度当天的告警命中次数，老数据为空</p>
     */
    public Long getEventCount() {
        return this.EventCount;
    }

    /**
     * Set <p>告警次数：同一聚合维度当天的告警命中次数，老数据为空</p>
     * @param EventCount <p>告警次数：同一聚合维度当天的告警命中次数，老数据为空</p>
     */
    public void setEventCount(Long EventCount) {
        this.EventCount = EventCount;
    }

    /**
     * Get <p>首次发现时间（格式 yyyy-MM-dd HH:mm:ss）</p> 
     * @return FirstDetectTime <p>首次发现时间（格式 yyyy-MM-dd HH:mm:ss）</p>
     */
    public String getFirstDetectTime() {
        return this.FirstDetectTime;
    }

    /**
     * Set <p>首次发现时间（格式 yyyy-MM-dd HH:mm:ss）</p>
     * @param FirstDetectTime <p>首次发现时间（格式 yyyy-MM-dd HH:mm:ss）</p>
     */
    public void setFirstDetectTime(String FirstDetectTime) {
        this.FirstDetectTime = FirstDetectTime;
    }

    /**
     * Get <p>最近发现时间（格式 yyyy-MM-dd HH:mm:ss）</p> 
     * @return LatestDetectTime <p>最近发现时间（格式 yyyy-MM-dd HH:mm:ss）</p>
     */
    public String getLatestDetectTime() {
        return this.LatestDetectTime;
    }

    /**
     * Set <p>最近发现时间（格式 yyyy-MM-dd HH:mm:ss）</p>
     * @param LatestDetectTime <p>最近发现时间（格式 yyyy-MM-dd HH:mm:ss）</p>
     */
    public void setLatestDetectTime(String LatestDetectTime) {
        this.LatestDetectTime = LatestDetectTime;
    }

    /**
     * Get <p>进程MD5（文件监控行为独有）</p> 
     * @return FileProcessMd5 <p>进程MD5（文件监控行为独有）</p>
     */
    public String getFileProcessMd5() {
        return this.FileProcessMd5;
    }

    /**
     * Set <p>进程MD5（文件监控行为独有）</p>
     * @param FileProcessMd5 <p>进程MD5（文件监控行为独有）</p>
     */
    public void setFileProcessMd5(String FileProcessMd5) {
        this.FileProcessMd5 = FileProcessMd5;
    }

    /**
     * Get <p>动作：进程对文件的操作，如 读/写/重命名/删除/清空内容（文件监控行为独有）</p> 
     * @return FileAction <p>动作：进程对文件的操作，如 读/写/重命名/删除/清空内容（文件监控行为独有）</p>
     */
    public String getFileAction() {
        return this.FileAction;
    }

    /**
     * Set <p>动作：进程对文件的操作，如 读/写/重命名/删除/清空内容（文件监控行为独有）</p>
     * @param FileAction <p>动作：进程对文件的操作，如 读/写/重命名/删除/清空内容（文件监控行为独有）</p>
     */
    public void setFileAction(String FileAction) {
        this.FileAction = FileAction;
    }

    /**
     * Get <p>文件路径（文件监控行为独有）</p> 
     * @return FilePath <p>文件路径（文件监控行为独有）</p>
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set <p>文件路径（文件监控行为独有）</p>
     * @param FilePath <p>文件路径（文件监控行为独有）</p>
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get <p>文件MD5（文件监控行为独有）</p> 
     * @return FileMd5 <p>文件MD5（文件监控行为独有）</p>
     */
    public String getFileMd5() {
        return this.FileMd5;
    }

    /**
     * Set <p>文件MD5（文件监控行为独有）</p>
     * @param FileMd5 <p>文件MD5（文件监控行为独有）</p>
     */
    public void setFileMd5(String FileMd5) {
        this.FileMd5 = FileMd5;
    }

    /**
     * Get <p>文件名称（文件监控行为独有）</p> 
     * @return FileName <p>文件名称（文件监控行为独有）</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>文件名称（文件监控行为独有）</p>
     * @param FileName <p>文件名称（文件监控行为独有）</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>文件大小（文件监控行为独有）</p> 
     * @return FileSize <p>文件大小（文件监控行为独有）</p>
     */
    public String getFileSize() {
        return this.FileSize;
    }

    /**
     * Set <p>文件大小（文件监控行为独有）</p>
     * @param FileSize <p>文件大小（文件监控行为独有）</p>
     */
    public void setFileSize(String FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get <p>文件修改时间（文件监控行为独有）</p> 
     * @return FileModifyTime <p>文件修改时间（文件监控行为独有）</p>
     */
    public String getFileModifyTime() {
        return this.FileModifyTime;
    }

    /**
     * Set <p>文件修改时间（文件监控行为独有）</p>
     * @param FileModifyTime <p>文件修改时间（文件监控行为独有）</p>
     */
    public void setFileModifyTime(String FileModifyTime) {
        this.FileModifyTime = FileModifyTime;
    }

    /**
     * Get <p>文件权限（文件监控行为独有）</p> 
     * @return FilePermission <p>文件权限（文件监控行为独有）</p>
     */
    public String getFilePermission() {
        return this.FilePermission;
    }

    /**
     * Set <p>文件权限（文件监控行为独有）</p>
     * @param FilePermission <p>文件权限（文件监控行为独有）</p>
     */
    public void setFilePermission(String FilePermission) {
        this.FilePermission = FilePermission;
    }

    /**
     * Get <p>文件访问时间</p> 
     * @return FileAccessTime <p>文件访问时间</p>
     */
    public String getFileAccessTime() {
        return this.FileAccessTime;
    }

    /**
     * Set <p>文件访问时间</p>
     * @param FileAccessTime <p>文件访问时间</p>
     */
    public void setFileAccessTime(String FileAccessTime) {
        this.FileAccessTime = FileAccessTime;
    }

    /**
     * Get <p>高危命令事件类型</p><p>枚举值：</p><ul><li>filemon： 文件监控事件</li><li>connect： 外联行为事件</li><li>process： 进程启动事件</li></ul> 
     * @return BashType <p>高危命令事件类型</p><p>枚举值：</p><ul><li>filemon： 文件监控事件</li><li>connect： 外联行为事件</li><li>process： 进程启动事件</li></ul>
     */
    public String getBashType() {
        return this.BashType;
    }

    /**
     * Set <p>高危命令事件类型</p><p>枚举值：</p><ul><li>filemon： 文件监控事件</li><li>connect： 外联行为事件</li><li>process： 进程启动事件</li></ul>
     * @param BashType <p>高危命令事件类型</p><p>枚举值：</p><ul><li>filemon： 文件监控事件</li><li>connect： 外联行为事件</li><li>process： 进程启动事件</li></ul>
     */
    public void setBashType(String BashType) {
        this.BashType = BashType;
    }

    public BashEventsInfoNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BashEventsInfoNew(BashEventsInfoNew source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.Platform != null) {
            this.Platform = new Long(source.Platform);
        }
        if (source.BashCmd != null) {
            this.BashCmd = new String(source.BashCmd);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleLevel != null) {
            this.RuleLevel = new Long(source.RuleLevel);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.Exe != null) {
            this.Exe = new String(source.Exe);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.RuleCategory != null) {
            this.RuleCategory = new Long(source.RuleCategory);
        }
        if (source.RegexBashCmd != null) {
            this.RegexBashCmd = new String(source.RegexBashCmd);
        }
        if (source.PsTree != null) {
            this.PsTree = new String(source.PsTree);
        }
        if (source.SuggestScheme != null) {
            this.SuggestScheme = new String(source.SuggestScheme);
        }
        if (source.HarmDescribe != null) {
            this.HarmDescribe = new String(source.HarmDescribe);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.References != null) {
            this.References = new String[source.References.length];
            for (int i = 0; i < source.References.length; i++) {
                this.References[i] = new String(source.References[i]);
            }
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.MachineStatus != null) {
            this.MachineStatus = new String(source.MachineStatus);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Pid != null) {
            this.Pid = new String(source.Pid);
        }
        if (source.MachineType != null) {
            this.MachineType = new Long(source.MachineType);
        }
        if (source.DetectBy != null) {
            this.DetectBy = new Long(source.DetectBy);
        }
        if (source.BashCmdDecoded != null) {
            this.BashCmdDecoded = new String(source.BashCmdDecoded);
        }
        if (source.EventCount != null) {
            this.EventCount = new Long(source.EventCount);
        }
        if (source.FirstDetectTime != null) {
            this.FirstDetectTime = new String(source.FirstDetectTime);
        }
        if (source.LatestDetectTime != null) {
            this.LatestDetectTime = new String(source.LatestDetectTime);
        }
        if (source.FileProcessMd5 != null) {
            this.FileProcessMd5 = new String(source.FileProcessMd5);
        }
        if (source.FileAction != null) {
            this.FileAction = new String(source.FileAction);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.FileMd5 != null) {
            this.FileMd5 = new String(source.FileMd5);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileSize != null) {
            this.FileSize = new String(source.FileSize);
        }
        if (source.FileModifyTime != null) {
            this.FileModifyTime = new String(source.FileModifyTime);
        }
        if (source.FilePermission != null) {
            this.FilePermission = new String(source.FilePermission);
        }
        if (source.FileAccessTime != null) {
            this.FileAccessTime = new String(source.FileAccessTime);
        }
        if (source.BashType != null) {
            this.BashType = new String(source.BashType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "BashCmd", this.BashCmd);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleLevel", this.RuleLevel);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "Exe", this.Exe);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "RuleCategory", this.RuleCategory);
        this.setParamSimple(map, prefix + "RegexBashCmd", this.RegexBashCmd);
        this.setParamSimple(map, prefix + "PsTree", this.PsTree);
        this.setParamSimple(map, prefix + "SuggestScheme", this.SuggestScheme);
        this.setParamSimple(map, prefix + "HarmDescribe", this.HarmDescribe);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "References.", this.References);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "MachineStatus", this.MachineStatus);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "DetectBy", this.DetectBy);
        this.setParamSimple(map, prefix + "BashCmdDecoded", this.BashCmdDecoded);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamSimple(map, prefix + "FirstDetectTime", this.FirstDetectTime);
        this.setParamSimple(map, prefix + "LatestDetectTime", this.LatestDetectTime);
        this.setParamSimple(map, prefix + "FileProcessMd5", this.FileProcessMd5);
        this.setParamSimple(map, prefix + "FileAction", this.FileAction);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "FileMd5", this.FileMd5);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "FileModifyTime", this.FileModifyTime);
        this.setParamSimple(map, prefix + "FilePermission", this.FilePermission);
        this.setParamSimple(map, prefix + "FileAccessTime", this.FileAccessTime);
        this.setParamSimple(map, prefix + "BashType", this.BashType);

    }
}

