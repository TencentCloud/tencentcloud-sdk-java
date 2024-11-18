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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BashEventNew extends AbstractModel {

    /**
    * 数据ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 主机安全ID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 主机ID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 主机内网IP
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * 执行用户名
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 平台类型
    */
    @SerializedName("Platform")
    @Expose
    private Long Platform;

    /**
    * 执行命令
    */
    @SerializedName("BashCmd")
    @Expose
    private String BashCmd;

    /**
    * 规则ID
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
    * 规则等级：1-高 2-中 3-低
    */
    @SerializedName("RuleLevel")
    @Expose
    private Long RuleLevel;

    /**
    * 处理状态： 0 = 待处理 1= 已处理, 2 = 已加白， 3 = 已忽略
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 发生时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 主机名
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 0: bash日志 1: 实时监控(雷霆版)
    */
    @SerializedName("DetectBy")
    @Expose
    private Long DetectBy;

    /**
    * 进程id
    */
    @SerializedName("Pid")
    @Expose
    private String Pid;

    /**
    * 进程名称
    */
    @SerializedName("Exe")
    @Expose
    private String Exe;

    /**
    * 处理时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 规则类别  0=系统规则，1=用户规则
    */
    @SerializedName("RuleCategory")
    @Expose
    private Long RuleCategory;

    /**
    * 自动生成的正则表达式
    */
    @SerializedName("RegexBashCmd")
    @Expose
    private String RegexBashCmd;

    /**
    * 0:普通 1:专业版 2:旗舰版
    */
    @SerializedName("MachineType")
    @Expose
    private Long MachineType;

    /**
    * 机器额外信息
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
     * Get 数据ID 
     * @return Id 数据ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 数据ID
     * @param Id 数据ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 主机安全ID 
     * @return Uuid 主机安全ID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机安全ID
     * @param Uuid 主机安全ID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 主机ID 
     * @return Quuid 主机ID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 主机ID
     * @param Quuid 主机ID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 主机内网IP 
     * @return HostIp 主机内网IP
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set 主机内网IP
     * @param HostIp 主机内网IP
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get 执行用户名 
     * @return User 执行用户名
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 执行用户名
     * @param User 执行用户名
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 平台类型 
     * @return Platform 平台类型
     */
    public Long getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台类型
     * @param Platform 平台类型
     */
    public void setPlatform(Long Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 执行命令 
     * @return BashCmd 执行命令
     */
    public String getBashCmd() {
        return this.BashCmd;
    }

    /**
     * Set 执行命令
     * @param BashCmd 执行命令
     */
    public void setBashCmd(String BashCmd) {
        this.BashCmd = BashCmd;
    }

    /**
     * Get 规则ID 
     * @return RuleId 规则ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
     * @param RuleId 规则ID
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
     * Get 规则等级：1-高 2-中 3-低 
     * @return RuleLevel 规则等级：1-高 2-中 3-低
     */
    public Long getRuleLevel() {
        return this.RuleLevel;
    }

    /**
     * Set 规则等级：1-高 2-中 3-低
     * @param RuleLevel 规则等级：1-高 2-中 3-低
     */
    public void setRuleLevel(Long RuleLevel) {
        this.RuleLevel = RuleLevel;
    }

    /**
     * Get 处理状态： 0 = 待处理 1= 已处理, 2 = 已加白， 3 = 已忽略 
     * @return Status 处理状态： 0 = 待处理 1= 已处理, 2 = 已加白， 3 = 已忽略
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 处理状态： 0 = 待处理 1= 已处理, 2 = 已加白， 3 = 已忽略
     * @param Status 处理状态： 0 = 待处理 1= 已处理, 2 = 已加白， 3 = 已忽略
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
     * Get 主机名 
     * @return MachineName 主机名
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 主机名
     * @param MachineName 主机名
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get 0: bash日志 1: 实时监控(雷霆版) 
     * @return DetectBy 0: bash日志 1: 实时监控(雷霆版)
     */
    public Long getDetectBy() {
        return this.DetectBy;
    }

    /**
     * Set 0: bash日志 1: 实时监控(雷霆版)
     * @param DetectBy 0: bash日志 1: 实时监控(雷霆版)
     */
    public void setDetectBy(Long DetectBy) {
        this.DetectBy = DetectBy;
    }

    /**
     * Get 进程id 
     * @return Pid 进程id
     */
    public String getPid() {
        return this.Pid;
    }

    /**
     * Set 进程id
     * @param Pid 进程id
     */
    public void setPid(String Pid) {
        this.Pid = Pid;
    }

    /**
     * Get 进程名称 
     * @return Exe 进程名称
     */
    public String getExe() {
        return this.Exe;
    }

    /**
     * Set 进程名称
     * @param Exe 进程名称
     */
    public void setExe(String Exe) {
        this.Exe = Exe;
    }

    /**
     * Get 处理时间 
     * @return ModifyTime 处理时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 处理时间
     * @param ModifyTime 处理时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 规则类别  0=系统规则，1=用户规则 
     * @return RuleCategory 规则类别  0=系统规则，1=用户规则
     */
    public Long getRuleCategory() {
        return this.RuleCategory;
    }

    /**
     * Set 规则类别  0=系统规则，1=用户规则
     * @param RuleCategory 规则类别  0=系统规则，1=用户规则
     */
    public void setRuleCategory(Long RuleCategory) {
        this.RuleCategory = RuleCategory;
    }

    /**
     * Get 自动生成的正则表达式 
     * @return RegexBashCmd 自动生成的正则表达式
     */
    public String getRegexBashCmd() {
        return this.RegexBashCmd;
    }

    /**
     * Set 自动生成的正则表达式
     * @param RegexBashCmd 自动生成的正则表达式
     */
    public void setRegexBashCmd(String RegexBashCmd) {
        this.RegexBashCmd = RegexBashCmd;
    }

    /**
     * Get 0:普通 1:专业版 2:旗舰版 
     * @return MachineType 0:普通 1:专业版 2:旗舰版
     */
    public Long getMachineType() {
        return this.MachineType;
    }

    /**
     * Set 0:普通 1:专业版 2:旗舰版
     * @param MachineType 0:普通 1:专业版 2:旗舰版
     */
    public void setMachineType(Long MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get 机器额外信息 
     * @return MachineExtraInfo 机器额外信息
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set 机器额外信息
     * @param MachineExtraInfo 机器额外信息
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    public BashEventNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BashEventNew(BashEventNew source) {
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
        if (source.User != null) {
            this.User = new String(source.User);
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
        if (source.DetectBy != null) {
            this.DetectBy = new Long(source.DetectBy);
        }
        if (source.Pid != null) {
            this.Pid = new String(source.Pid);
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
        if (source.MachineType != null) {
            this.MachineType = new Long(source.MachineType);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
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
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "BashCmd", this.BashCmd);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleLevel", this.RuleLevel);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "DetectBy", this.DetectBy);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "Exe", this.Exe);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "RuleCategory", this.RuleCategory);
        this.setParamSimple(map, prefix + "RegexBashCmd", this.RegexBashCmd);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

