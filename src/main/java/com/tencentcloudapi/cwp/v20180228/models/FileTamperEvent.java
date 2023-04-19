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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileTamperEvent extends AbstractModel{

    /**
    * 机器名称
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 机器IP
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * 发生时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最近发生时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 事件id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 主机uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * cvm id
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 事件类型/动作  0 -- 告警
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 进程路径
    */
    @SerializedName("ProcessExe")
    @Expose
    private String ProcessExe;

    /**
    * 进程参数
    */
    @SerializedName("ProcessArgv")
    @Expose
    private String ProcessArgv;

    /**
    * 目标文件路径
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 处理状态  0 -- 待处理 1 -- 已加白 2 -- 已删除 3 - 已忽略 4-已手动处理
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 事件产生次数
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

    /**
    * 规则id
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 事件详情: json格式
    */
    @SerializedName("Pstree")
    @Expose
    private String Pstree;

    /**
    * 规则类型 0系统规则 1自定义规则
    */
    @SerializedName("RuleCategory")
    @Expose
    private Long RuleCategory;

    /**
    * 主机在线信息 ONLINE、OFFLINE
    */
    @SerializedName("MachineStatus")
    @Expose
    private String MachineStatus;

    /**
    * 危害描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 修护建议
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 内网ip
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 进程权限
    */
    @SerializedName("ExePermission")
    @Expose
    private String ExePermission;

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 用户组
    */
    @SerializedName("UserGroup")
    @Expose
    private String UserGroup;

    /**
    * 进程名
    */
    @SerializedName("ExeMd5")
    @Expose
    private String ExeMd5;

    /**
    * 进程文件大小
    */
    @SerializedName("ExeSize")
    @Expose
    private Long ExeSize;

    /**
    * 进程执行时长
    */
    @SerializedName("ExeTime")
    @Expose
    private Long ExeTime;

    /**
    * 目标文件大小
    */
    @SerializedName("TargetSize")
    @Expose
    private Long TargetSize;

    /**
    * 目标文件权限
    */
    @SerializedName("TargetPermission")
    @Expose
    private String TargetPermission;

    /**
    * 目标文件更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetModifyTime")
    @Expose
    private String TargetModifyTime;

    /**
    * 目标文件创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetCreatTime")
    @Expose
    private String TargetCreatTime;

    /**
    * 进程pid
    */
    @SerializedName("ExePid")
    @Expose
    private Long ExePid;

    /**
    * 文件名称
    */
    @SerializedName("TargetName")
    @Expose
    private String TargetName;

    /**
    * 参考链接
    */
    @SerializedName("Reference")
    @Expose
    private String Reference;

    /**
    * 风险等级 0：无， 1: 高危， 2:中危， 3: 低危
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 进程名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExeName")
    @Expose
    private String ExeName;

    /**
    *  主机额外信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * 文件威胁行为
<li>read 读取文件</li>
<li>write 修改文件</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileAction")
    @Expose
    private String FileAction;

    /**
     * Get 机器名称 
     * @return HostName 机器名称
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 机器名称
     * @param HostName 机器名称
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 机器IP 
     * @return HostIp 机器IP
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set 机器IP
     * @param HostIp 机器IP
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get 发生时间 
     * @return CreateTime 发生时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 发生时间
     * @param CreateTime 发生时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最近发生时间 
     * @return ModifyTime 最近发生时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 最近发生时间
     * @param ModifyTime 最近发生时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 事件id 
     * @return Id 事件id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 事件id
     * @param Id 事件id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 主机uuid 
     * @return Uuid 主机uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机uuid
     * @param Uuid 主机uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get cvm id 
     * @return Quuid cvm id
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set cvm id
     * @param Quuid cvm id
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 事件类型/动作  0 -- 告警 
     * @return Type 事件类型/动作  0 -- 告警
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 事件类型/动作  0 -- 告警
     * @param Type 事件类型/动作  0 -- 告警
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 进程路径 
     * @return ProcessExe 进程路径
     */
    public String getProcessExe() {
        return this.ProcessExe;
    }

    /**
     * Set 进程路径
     * @param ProcessExe 进程路径
     */
    public void setProcessExe(String ProcessExe) {
        this.ProcessExe = ProcessExe;
    }

    /**
     * Get 进程参数 
     * @return ProcessArgv 进程参数
     */
    public String getProcessArgv() {
        return this.ProcessArgv;
    }

    /**
     * Set 进程参数
     * @param ProcessArgv 进程参数
     */
    public void setProcessArgv(String ProcessArgv) {
        this.ProcessArgv = ProcessArgv;
    }

    /**
     * Get 目标文件路径 
     * @return Target 目标文件路径
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 目标文件路径
     * @param Target 目标文件路径
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get 处理状态  0 -- 待处理 1 -- 已加白 2 -- 已删除 3 - 已忽略 4-已手动处理 
     * @return Status 处理状态  0 -- 待处理 1 -- 已加白 2 -- 已删除 3 - 已忽略 4-已手动处理
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 处理状态  0 -- 待处理 1 -- 已加白 2 -- 已删除 3 - 已忽略 4-已手动处理
     * @param Status 处理状态  0 -- 待处理 1 -- 已加白 2 -- 已删除 3 - 已忽略 4-已手动处理
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 事件产生次数 
     * @return EventCount 事件产生次数
     */
    public Long getEventCount() {
        return this.EventCount;
    }

    /**
     * Set 事件产生次数
     * @param EventCount 事件产生次数
     */
    public void setEventCount(Long EventCount) {
        this.EventCount = EventCount;
    }

    /**
     * Get 规则id 
     * @return RuleId 规则id
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则id
     * @param RuleId 规则id
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则名称 
     * @return RuleName 规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
     * @param RuleName 规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 事件详情: json格式 
     * @return Pstree 事件详情: json格式
     */
    public String getPstree() {
        return this.Pstree;
    }

    /**
     * Set 事件详情: json格式
     * @param Pstree 事件详情: json格式
     */
    public void setPstree(String Pstree) {
        this.Pstree = Pstree;
    }

    /**
     * Get 规则类型 0系统规则 1自定义规则 
     * @return RuleCategory 规则类型 0系统规则 1自定义规则
     */
    public Long getRuleCategory() {
        return this.RuleCategory;
    }

    /**
     * Set 规则类型 0系统规则 1自定义规则
     * @param RuleCategory 规则类型 0系统规则 1自定义规则
     */
    public void setRuleCategory(Long RuleCategory) {
        this.RuleCategory = RuleCategory;
    }

    /**
     * Get 主机在线信息 ONLINE、OFFLINE 
     * @return MachineStatus 主机在线信息 ONLINE、OFFLINE
     */
    public String getMachineStatus() {
        return this.MachineStatus;
    }

    /**
     * Set 主机在线信息 ONLINE、OFFLINE
     * @param MachineStatus 主机在线信息 ONLINE、OFFLINE
     */
    public void setMachineStatus(String MachineStatus) {
        this.MachineStatus = MachineStatus;
    }

    /**
     * Get 危害描述 
     * @return Description 危害描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 危害描述
     * @param Description 危害描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 修护建议 
     * @return Suggestion 修护建议
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 修护建议
     * @param Suggestion 修护建议
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 内网ip 
     * @return PrivateIp 内网ip
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 内网ip
     * @param PrivateIp 内网ip
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get 进程权限 
     * @return ExePermission 进程权限
     */
    public String getExePermission() {
        return this.ExePermission;
    }

    /**
     * Set 进程权限
     * @param ExePermission 进程权限
     */
    public void setExePermission(String ExePermission) {
        this.ExePermission = ExePermission;
    }

    /**
     * Get 用户名 
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 用户组 
     * @return UserGroup 用户组
     */
    public String getUserGroup() {
        return this.UserGroup;
    }

    /**
     * Set 用户组
     * @param UserGroup 用户组
     */
    public void setUserGroup(String UserGroup) {
        this.UserGroup = UserGroup;
    }

    /**
     * Get 进程名 
     * @return ExeMd5 进程名
     */
    public String getExeMd5() {
        return this.ExeMd5;
    }

    /**
     * Set 进程名
     * @param ExeMd5 进程名
     */
    public void setExeMd5(String ExeMd5) {
        this.ExeMd5 = ExeMd5;
    }

    /**
     * Get 进程文件大小 
     * @return ExeSize 进程文件大小
     */
    public Long getExeSize() {
        return this.ExeSize;
    }

    /**
     * Set 进程文件大小
     * @param ExeSize 进程文件大小
     */
    public void setExeSize(Long ExeSize) {
        this.ExeSize = ExeSize;
    }

    /**
     * Get 进程执行时长 
     * @return ExeTime 进程执行时长
     */
    public Long getExeTime() {
        return this.ExeTime;
    }

    /**
     * Set 进程执行时长
     * @param ExeTime 进程执行时长
     */
    public void setExeTime(Long ExeTime) {
        this.ExeTime = ExeTime;
    }

    /**
     * Get 目标文件大小 
     * @return TargetSize 目标文件大小
     */
    public Long getTargetSize() {
        return this.TargetSize;
    }

    /**
     * Set 目标文件大小
     * @param TargetSize 目标文件大小
     */
    public void setTargetSize(Long TargetSize) {
        this.TargetSize = TargetSize;
    }

    /**
     * Get 目标文件权限 
     * @return TargetPermission 目标文件权限
     */
    public String getTargetPermission() {
        return this.TargetPermission;
    }

    /**
     * Set 目标文件权限
     * @param TargetPermission 目标文件权限
     */
    public void setTargetPermission(String TargetPermission) {
        this.TargetPermission = TargetPermission;
    }

    /**
     * Get 目标文件更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetModifyTime 目标文件更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetModifyTime() {
        return this.TargetModifyTime;
    }

    /**
     * Set 目标文件更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetModifyTime 目标文件更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetModifyTime(String TargetModifyTime) {
        this.TargetModifyTime = TargetModifyTime;
    }

    /**
     * Get 目标文件创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetCreatTime 目标文件创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetCreatTime() {
        return this.TargetCreatTime;
    }

    /**
     * Set 目标文件创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetCreatTime 目标文件创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetCreatTime(String TargetCreatTime) {
        this.TargetCreatTime = TargetCreatTime;
    }

    /**
     * Get 进程pid 
     * @return ExePid 进程pid
     */
    public Long getExePid() {
        return this.ExePid;
    }

    /**
     * Set 进程pid
     * @param ExePid 进程pid
     */
    public void setExePid(Long ExePid) {
        this.ExePid = ExePid;
    }

    /**
     * Get 文件名称 
     * @return TargetName 文件名称
     */
    public String getTargetName() {
        return this.TargetName;
    }

    /**
     * Set 文件名称
     * @param TargetName 文件名称
     */
    public void setTargetName(String TargetName) {
        this.TargetName = TargetName;
    }

    /**
     * Get 参考链接 
     * @return Reference 参考链接
     */
    public String getReference() {
        return this.Reference;
    }

    /**
     * Set 参考链接
     * @param Reference 参考链接
     */
    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    /**
     * Get 风险等级 0：无， 1: 高危， 2:中危， 3: 低危 
     * @return Level 风险等级 0：无， 1: 高危， 2:中危， 3: 低危
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 风险等级 0：无， 1: 高危， 2:中危， 3: 低危
     * @param Level 风险等级 0：无， 1: 高危， 2:中危， 3: 低危
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 进程名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExeName 进程名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExeName() {
        return this.ExeName;
    }

    /**
     * Set 进程名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExeName 进程名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExeName(String ExeName) {
        this.ExeName = ExeName;
    }

    /**
     * Get  主机额外信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MachineExtraInfo  主机额外信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set  主机额外信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param MachineExtraInfo  主机额外信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    /**
     * Get 文件威胁行为
<li>read 读取文件</li>
<li>write 修改文件</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileAction 文件威胁行为
<li>read 读取文件</li>
<li>write 修改文件</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileAction() {
        return this.FileAction;
    }

    /**
     * Set 文件威胁行为
<li>read 读取文件</li>
<li>write 修改文件</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileAction 文件威胁行为
<li>read 读取文件</li>
<li>write 修改文件</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileAction(String FileAction) {
        this.FileAction = FileAction;
    }

    public FileTamperEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileTamperEvent(FileTamperEvent source) {
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.ProcessExe != null) {
            this.ProcessExe = new String(source.ProcessExe);
        }
        if (source.ProcessArgv != null) {
            this.ProcessArgv = new String(source.ProcessArgv);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.EventCount != null) {
            this.EventCount = new Long(source.EventCount);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Pstree != null) {
            this.Pstree = new String(source.Pstree);
        }
        if (source.RuleCategory != null) {
            this.RuleCategory = new Long(source.RuleCategory);
        }
        if (source.MachineStatus != null) {
            this.MachineStatus = new String(source.MachineStatus);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.ExePermission != null) {
            this.ExePermission = new String(source.ExePermission);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UserGroup != null) {
            this.UserGroup = new String(source.UserGroup);
        }
        if (source.ExeMd5 != null) {
            this.ExeMd5 = new String(source.ExeMd5);
        }
        if (source.ExeSize != null) {
            this.ExeSize = new Long(source.ExeSize);
        }
        if (source.ExeTime != null) {
            this.ExeTime = new Long(source.ExeTime);
        }
        if (source.TargetSize != null) {
            this.TargetSize = new Long(source.TargetSize);
        }
        if (source.TargetPermission != null) {
            this.TargetPermission = new String(source.TargetPermission);
        }
        if (source.TargetModifyTime != null) {
            this.TargetModifyTime = new String(source.TargetModifyTime);
        }
        if (source.TargetCreatTime != null) {
            this.TargetCreatTime = new String(source.TargetCreatTime);
        }
        if (source.ExePid != null) {
            this.ExePid = new Long(source.ExePid);
        }
        if (source.TargetName != null) {
            this.TargetName = new String(source.TargetName);
        }
        if (source.Reference != null) {
            this.Reference = new String(source.Reference);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.ExeName != null) {
            this.ExeName = new String(source.ExeName);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
        if (source.FileAction != null) {
            this.FileAction = new String(source.FileAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ProcessExe", this.ProcessExe);
        this.setParamSimple(map, prefix + "ProcessArgv", this.ProcessArgv);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Pstree", this.Pstree);
        this.setParamSimple(map, prefix + "RuleCategory", this.RuleCategory);
        this.setParamSimple(map, prefix + "MachineStatus", this.MachineStatus);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "ExePermission", this.ExePermission);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "UserGroup", this.UserGroup);
        this.setParamSimple(map, prefix + "ExeMd5", this.ExeMd5);
        this.setParamSimple(map, prefix + "ExeSize", this.ExeSize);
        this.setParamSimple(map, prefix + "ExeTime", this.ExeTime);
        this.setParamSimple(map, prefix + "TargetSize", this.TargetSize);
        this.setParamSimple(map, prefix + "TargetPermission", this.TargetPermission);
        this.setParamSimple(map, prefix + "TargetModifyTime", this.TargetModifyTime);
        this.setParamSimple(map, prefix + "TargetCreatTime", this.TargetCreatTime);
        this.setParamSimple(map, prefix + "ExePid", this.ExePid);
        this.setParamSimple(map, prefix + "TargetName", this.TargetName);
        this.setParamSimple(map, prefix + "Reference", this.Reference);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "ExeName", this.ExeName);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);
        this.setParamSimple(map, prefix + "FileAction", this.FileAction);

    }
}

