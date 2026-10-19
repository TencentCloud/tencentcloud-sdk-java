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

public class BashEventNew extends AbstractModel {

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
    * <p>执行用户名</p>
    */
    @SerializedName("User")
    @Expose
    private String User;

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
    * <p>规则ID</p>
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
    * <p>处理状态： 0 = 待处理 1= 已处理, 2 = 已加白， 3 = 已忽略</p>
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
    * <p>0: bash日志 1: 实时监控(雷霆版)</p>
    */
    @SerializedName("DetectBy")
    @Expose
    private Long DetectBy;

    /**
    * <p>进程id</p>
    */
    @SerializedName("Pid")
    @Expose
    private String Pid;

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
    * <p>转义后的正则表达式</p>
    */
    @SerializedName("RegexBashCmd")
    @Expose
    private String RegexBashCmd;

    /**
    * <p>转义后的正则表达式</p>
    */
    @SerializedName("RegexExe")
    @Expose
    private String RegexExe;

    /**
    * <p>0:普通 1:专业版 2:旗舰版</p>
    */
    @SerializedName("MachineType")
    @Expose
    private Long MachineType;

    /**
    * <p>机器额外信息</p>
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

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
     * Get <p>执行用户名</p> 
     * @return User <p>执行用户名</p>
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set <p>执行用户名</p>
     * @param User <p>执行用户名</p>
     */
    public void setUser(String User) {
        this.User = User;
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
     * Get <p>规则ID</p> 
     * @return RuleId <p>规则ID</p>
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>规则ID</p>
     * @param RuleId <p>规则ID</p>
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
     * Get <p>处理状态： 0 = 待处理 1= 已处理, 2 = 已加白， 3 = 已忽略</p> 
     * @return Status <p>处理状态： 0 = 待处理 1= 已处理, 2 = 已加白， 3 = 已忽略</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>处理状态： 0 = 待处理 1= 已处理, 2 = 已加白， 3 = 已忽略</p>
     * @param Status <p>处理状态： 0 = 待处理 1= 已处理, 2 = 已加白， 3 = 已忽略</p>
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
     * Get <p>0: bash日志 1: 实时监控(雷霆版)</p> 
     * @return DetectBy <p>0: bash日志 1: 实时监控(雷霆版)</p>
     */
    public Long getDetectBy() {
        return this.DetectBy;
    }

    /**
     * Set <p>0: bash日志 1: 实时监控(雷霆版)</p>
     * @param DetectBy <p>0: bash日志 1: 实时监控(雷霆版)</p>
     */
    public void setDetectBy(Long DetectBy) {
        this.DetectBy = DetectBy;
    }

    /**
     * Get <p>进程id</p> 
     * @return Pid <p>进程id</p>
     */
    public String getPid() {
        return this.Pid;
    }

    /**
     * Set <p>进程id</p>
     * @param Pid <p>进程id</p>
     */
    public void setPid(String Pid) {
        this.Pid = Pid;
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
     * Get <p>转义后的正则表达式</p> 
     * @return RegexBashCmd <p>转义后的正则表达式</p>
     */
    public String getRegexBashCmd() {
        return this.RegexBashCmd;
    }

    /**
     * Set <p>转义后的正则表达式</p>
     * @param RegexBashCmd <p>转义后的正则表达式</p>
     */
    public void setRegexBashCmd(String RegexBashCmd) {
        this.RegexBashCmd = RegexBashCmd;
    }

    /**
     * Get <p>转义后的正则表达式</p> 
     * @return RegexExe <p>转义后的正则表达式</p>
     */
    public String getRegexExe() {
        return this.RegexExe;
    }

    /**
     * Set <p>转义后的正则表达式</p>
     * @param RegexExe <p>转义后的正则表达式</p>
     */
    public void setRegexExe(String RegexExe) {
        this.RegexExe = RegexExe;
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
     * Get <p>机器额外信息</p> 
     * @return MachineExtraInfo <p>机器额外信息</p>
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set <p>机器额外信息</p>
     * @param MachineExtraInfo <p>机器额外信息</p>
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
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
        if (source.RegexExe != null) {
            this.RegexExe = new String(source.RegexExe);
        }
        if (source.MachineType != null) {
            this.MachineType = new Long(source.MachineType);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
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
        this.setParamSimple(map, prefix + "RegexExe", this.RegexExe);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamSimple(map, prefix + "FirstDetectTime", this.FirstDetectTime);
        this.setParamSimple(map, prefix + "LatestDetectTime", this.LatestDetectTime);

    }
}

