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

public class RiskDnsEvent extends AbstractModel{

    /**
    * 事件Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 策略ID
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 命中策略类型[-1:未知|0系统|1:用户]
    */
    @SerializedName("PolicyType")
    @Expose
    private Long PolicyType;

    /**
    * 命中策略名称
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 保护级别[0:基础版|1:专业版|2:旗舰版]
    */
    @SerializedName("ProtectLevel")
    @Expose
    private Long ProtectLevel;

    /**
    * 主机ID
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
    * 主机名称
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 主机IP
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * 外网IP
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * 客户端ID
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * 访问域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 标签特性
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 访问次数
    */
    @SerializedName("AccessCount")
    @Expose
    private Long AccessCount;

    /**
    * 威胁描述
    */
    @SerializedName("ThreatDesc")
    @Expose
    private String ThreatDesc;

    /**
    * 修复方案
    */
    @SerializedName("SuggestSolution")
    @Expose
    private String SuggestSolution;

    /**
    * 参考链接
    */
    @SerializedName("ReferenceLink")
    @Expose
    private String ReferenceLink;

    /**
    * 处理状态；[0:待处理|2:已加白|3:非信任状态|4:已处理|5:已忽略]
    */
    @SerializedName("HandleStatus")
    @Expose
    private Long HandleStatus;

    /**
    * 进程ID
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * 进程名
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * 进程MD5
    */
    @SerializedName("ProcessMd5")
    @Expose
    private String ProcessMd5;

    /**
    * 命令行
    */
    @SerializedName("CmdLine")
    @Expose
    private String CmdLine;

    /**
    * 首次访问时间
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * 最近访问时间
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * 主机在线状态[OFFLINE:离线|ONLINE:在线|UNKNOWN:未知]
    */
    @SerializedName("HostStatus")
    @Expose
    private String HostStatus;

    /**
    * 附加信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
     * Get 事件Id 
     * @return Id 事件Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 事件Id
     * @param Id 事件Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 策略ID 
     * @return PolicyId 策略ID
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 策略ID
     * @param PolicyId 策略ID
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 命中策略类型[-1:未知|0系统|1:用户] 
     * @return PolicyType 命中策略类型[-1:未知|0系统|1:用户]
     */
    public Long getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 命中策略类型[-1:未知|0系统|1:用户]
     * @param PolicyType 命中策略类型[-1:未知|0系统|1:用户]
     */
    public void setPolicyType(Long PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get 命中策略名称 
     * @return PolicyName 命中策略名称
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 命中策略名称
     * @param PolicyName 命中策略名称
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 保护级别[0:基础版|1:专业版|2:旗舰版] 
     * @return ProtectLevel 保护级别[0:基础版|1:专业版|2:旗舰版]
     */
    public Long getProtectLevel() {
        return this.ProtectLevel;
    }

    /**
     * Set 保护级别[0:基础版|1:专业版|2:旗舰版]
     * @param ProtectLevel 保护级别[0:基础版|1:专业版|2:旗舰版]
     */
    public void setProtectLevel(Long ProtectLevel) {
        this.ProtectLevel = ProtectLevel;
    }

    /**
     * Get 主机ID 
     * @return HostId 主机ID
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set 主机ID
     * @param HostId 主机ID
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
    }

    /**
     * Get 主机名称 
     * @return HostName 主机名称
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 主机名称
     * @param HostName 主机名称
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 主机IP 
     * @return HostIp 主机IP
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set 主机IP
     * @param HostIp 主机IP
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get 外网IP 
     * @return WanIp 外网IP
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set 外网IP
     * @param WanIp 外网IP
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get 客户端ID 
     * @return AgentId 客户端ID
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set 客户端ID
     * @param AgentId 客户端ID
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get 访问域名 
     * @return Domain 访问域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 访问域名
     * @param Domain 访问域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 标签特性 
     * @return Tags 标签特性
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签特性
     * @param Tags 标签特性
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 访问次数 
     * @return AccessCount 访问次数
     */
    public Long getAccessCount() {
        return this.AccessCount;
    }

    /**
     * Set 访问次数
     * @param AccessCount 访问次数
     */
    public void setAccessCount(Long AccessCount) {
        this.AccessCount = AccessCount;
    }

    /**
     * Get 威胁描述 
     * @return ThreatDesc 威胁描述
     */
    public String getThreatDesc() {
        return this.ThreatDesc;
    }

    /**
     * Set 威胁描述
     * @param ThreatDesc 威胁描述
     */
    public void setThreatDesc(String ThreatDesc) {
        this.ThreatDesc = ThreatDesc;
    }

    /**
     * Get 修复方案 
     * @return SuggestSolution 修复方案
     */
    public String getSuggestSolution() {
        return this.SuggestSolution;
    }

    /**
     * Set 修复方案
     * @param SuggestSolution 修复方案
     */
    public void setSuggestSolution(String SuggestSolution) {
        this.SuggestSolution = SuggestSolution;
    }

    /**
     * Get 参考链接 
     * @return ReferenceLink 参考链接
     */
    public String getReferenceLink() {
        return this.ReferenceLink;
    }

    /**
     * Set 参考链接
     * @param ReferenceLink 参考链接
     */
    public void setReferenceLink(String ReferenceLink) {
        this.ReferenceLink = ReferenceLink;
    }

    /**
     * Get 处理状态；[0:待处理|2:已加白|3:非信任状态|4:已处理|5:已忽略] 
     * @return HandleStatus 处理状态；[0:待处理|2:已加白|3:非信任状态|4:已处理|5:已忽略]
     */
    public Long getHandleStatus() {
        return this.HandleStatus;
    }

    /**
     * Set 处理状态；[0:待处理|2:已加白|3:非信任状态|4:已处理|5:已忽略]
     * @param HandleStatus 处理状态；[0:待处理|2:已加白|3:非信任状态|4:已处理|5:已忽略]
     */
    public void setHandleStatus(Long HandleStatus) {
        this.HandleStatus = HandleStatus;
    }

    /**
     * Get 进程ID 
     * @return Pid 进程ID
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set 进程ID
     * @param Pid 进程ID
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
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
     * Get 进程MD5 
     * @return ProcessMd5 进程MD5
     */
    public String getProcessMd5() {
        return this.ProcessMd5;
    }

    /**
     * Set 进程MD5
     * @param ProcessMd5 进程MD5
     */
    public void setProcessMd5(String ProcessMd5) {
        this.ProcessMd5 = ProcessMd5;
    }

    /**
     * Get 命令行 
     * @return CmdLine 命令行
     */
    public String getCmdLine() {
        return this.CmdLine;
    }

    /**
     * Set 命令行
     * @param CmdLine 命令行
     */
    public void setCmdLine(String CmdLine) {
        this.CmdLine = CmdLine;
    }

    /**
     * Get 首次访问时间 
     * @return FirstTime 首次访问时间
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set 首次访问时间
     * @param FirstTime 首次访问时间
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * Get 最近访问时间 
     * @return LastTime 最近访问时间
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set 最近访问时间
     * @param LastTime 最近访问时间
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get 主机在线状态[OFFLINE:离线|ONLINE:在线|UNKNOWN:未知] 
     * @return HostStatus 主机在线状态[OFFLINE:离线|ONLINE:在线|UNKNOWN:未知]
     */
    public String getHostStatus() {
        return this.HostStatus;
    }

    /**
     * Set 主机在线状态[OFFLINE:离线|ONLINE:在线|UNKNOWN:未知]
     * @param HostStatus 主机在线状态[OFFLINE:离线|ONLINE:在线|UNKNOWN:未知]
     */
    public void setHostStatus(String HostStatus) {
        this.HostStatus = HostStatus;
    }

    /**
     * Get 附加信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MachineExtraInfo 附加信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set 附加信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param MachineExtraInfo 附加信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    public RiskDnsEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskDnsEvent(RiskDnsEvent source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new Long(source.PolicyType);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.ProtectLevel != null) {
            this.ProtectLevel = new Long(source.ProtectLevel);
        }
        if (source.HostId != null) {
            this.HostId = new String(source.HostId);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.WanIp != null) {
            this.WanIp = new String(source.WanIp);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.AccessCount != null) {
            this.AccessCount = new Long(source.AccessCount);
        }
        if (source.ThreatDesc != null) {
            this.ThreatDesc = new String(source.ThreatDesc);
        }
        if (source.SuggestSolution != null) {
            this.SuggestSolution = new String(source.SuggestSolution);
        }
        if (source.ReferenceLink != null) {
            this.ReferenceLink = new String(source.ReferenceLink);
        }
        if (source.HandleStatus != null) {
            this.HandleStatus = new Long(source.HandleStatus);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.ProcessMd5 != null) {
            this.ProcessMd5 = new String(source.ProcessMd5);
        }
        if (source.CmdLine != null) {
            this.CmdLine = new String(source.CmdLine);
        }
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
        }
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
        }
        if (source.HostStatus != null) {
            this.HostStatus = new String(source.HostStatus);
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
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "ProtectLevel", this.ProtectLevel);
        this.setParamSimple(map, prefix + "HostId", this.HostId);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "WanIp", this.WanIp);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AccessCount", this.AccessCount);
        this.setParamSimple(map, prefix + "ThreatDesc", this.ThreatDesc);
        this.setParamSimple(map, prefix + "SuggestSolution", this.SuggestSolution);
        this.setParamSimple(map, prefix + "ReferenceLink", this.ReferenceLink);
        this.setParamSimple(map, prefix + "HandleStatus", this.HandleStatus);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "ProcessMd5", this.ProcessMd5);
        this.setParamSimple(map, prefix + "CmdLine", this.CmdLine);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "HostStatus", this.HostStatus);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

