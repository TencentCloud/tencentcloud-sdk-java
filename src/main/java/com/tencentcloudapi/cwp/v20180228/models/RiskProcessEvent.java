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

public class RiskProcessEvent extends AbstractModel {

    /**
    * 事件ID
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

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
    * 进程ID
    */
    @SerializedName("ProcessId")
    @Expose
    private Long ProcessId;

    /**
    * 文件路径
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * 执行命令
    */
    @SerializedName("CmdLine")
    @Expose
    private String CmdLine;

    /**
    * 进程启动时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 最近检测时间
    */
    @SerializedName("DetectTime")
    @Expose
    private String DetectTime;

    /**
    * 病毒名称
    */
    @SerializedName("VirusName")
    @Expose
    private String VirusName;

    /**
    * 木马检测平台 [1:云查杀引擎|2:TAV|3:binaryAi|4:异常行为|5:威胁情报]
    */
    @SerializedName("CheckPlatform")
    @Expose
    private String [] CheckPlatform;

    /**
    * 病毒标签
    */
    @SerializedName("VirusTags")
    @Expose
    private String [] VirusTags;

    /**
    * 威胁描述
    */
    @SerializedName("ThreatDesc")
    @Expose
    private String ThreatDesc;

    /**
    * 建议方案
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
    * 处理状态[0待处理;1已处理;2查杀中;3已查杀;4已退出;5忽略]
    */
    @SerializedName("HandleStatus")
    @Expose
    private Long HandleStatus;

    /**
    * 主机在线状态
    */
    @SerializedName("OnlineStatus")
    @Expose
    private Long OnlineStatus;

    /**
    * 附加信息
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * 主机uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 首次检出方式 0扫描;1实时监控
    */
    @SerializedName("FirstDetectionMethod")
    @Expose
    private Long FirstDetectionMethod;

    /**
     * Get 事件ID 
     * @return EventId 事件ID
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件ID
     * @param EventId 事件ID
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
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
     * Get 进程ID 
     * @return ProcessId 进程ID
     */
    public Long getProcessId() {
        return this.ProcessId;
    }

    /**
     * Set 进程ID
     * @param ProcessId 进程ID
     */
    public void setProcessId(Long ProcessId) {
        this.ProcessId = ProcessId;
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
     * Get 执行命令 
     * @return CmdLine 执行命令
     */
    public String getCmdLine() {
        return this.CmdLine;
    }

    /**
     * Set 执行命令
     * @param CmdLine 执行命令
     */
    public void setCmdLine(String CmdLine) {
        this.CmdLine = CmdLine;
    }

    /**
     * Get 进程启动时间 
     * @return StartTime 进程启动时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 进程启动时间
     * @param StartTime 进程启动时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 最近检测时间 
     * @return DetectTime 最近检测时间
     */
    public String getDetectTime() {
        return this.DetectTime;
    }

    /**
     * Set 最近检测时间
     * @param DetectTime 最近检测时间
     */
    public void setDetectTime(String DetectTime) {
        this.DetectTime = DetectTime;
    }

    /**
     * Get 病毒名称 
     * @return VirusName 病毒名称
     */
    public String getVirusName() {
        return this.VirusName;
    }

    /**
     * Set 病毒名称
     * @param VirusName 病毒名称
     */
    public void setVirusName(String VirusName) {
        this.VirusName = VirusName;
    }

    /**
     * Get 木马检测平台 [1:云查杀引擎|2:TAV|3:binaryAi|4:异常行为|5:威胁情报] 
     * @return CheckPlatform 木马检测平台 [1:云查杀引擎|2:TAV|3:binaryAi|4:异常行为|5:威胁情报]
     */
    public String [] getCheckPlatform() {
        return this.CheckPlatform;
    }

    /**
     * Set 木马检测平台 [1:云查杀引擎|2:TAV|3:binaryAi|4:异常行为|5:威胁情报]
     * @param CheckPlatform 木马检测平台 [1:云查杀引擎|2:TAV|3:binaryAi|4:异常行为|5:威胁情报]
     */
    public void setCheckPlatform(String [] CheckPlatform) {
        this.CheckPlatform = CheckPlatform;
    }

    /**
     * Get 病毒标签 
     * @return VirusTags 病毒标签
     */
    public String [] getVirusTags() {
        return this.VirusTags;
    }

    /**
     * Set 病毒标签
     * @param VirusTags 病毒标签
     */
    public void setVirusTags(String [] VirusTags) {
        this.VirusTags = VirusTags;
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
     * Get 建议方案 
     * @return SuggestSolution 建议方案
     */
    public String getSuggestSolution() {
        return this.SuggestSolution;
    }

    /**
     * Set 建议方案
     * @param SuggestSolution 建议方案
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
     * Get 处理状态[0待处理;1已处理;2查杀中;3已查杀;4已退出;5忽略] 
     * @return HandleStatus 处理状态[0待处理;1已处理;2查杀中;3已查杀;4已退出;5忽略]
     */
    public Long getHandleStatus() {
        return this.HandleStatus;
    }

    /**
     * Set 处理状态[0待处理;1已处理;2查杀中;3已查杀;4已退出;5忽略]
     * @param HandleStatus 处理状态[0待处理;1已处理;2查杀中;3已查杀;4已退出;5忽略]
     */
    public void setHandleStatus(Long HandleStatus) {
        this.HandleStatus = HandleStatus;
    }

    /**
     * Get 主机在线状态 
     * @return OnlineStatus 主机在线状态
     */
    public Long getOnlineStatus() {
        return this.OnlineStatus;
    }

    /**
     * Set 主机在线状态
     * @param OnlineStatus 主机在线状态
     */
    public void setOnlineStatus(Long OnlineStatus) {
        this.OnlineStatus = OnlineStatus;
    }

    /**
     * Get 附加信息 
     * @return MachineExtraInfo 附加信息
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set 附加信息
     * @param MachineExtraInfo 附加信息
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
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
     * Get 首次检出方式 0扫描;1实时监控 
     * @return FirstDetectionMethod 首次检出方式 0扫描;1实时监控
     */
    public Long getFirstDetectionMethod() {
        return this.FirstDetectionMethod;
    }

    /**
     * Set 首次检出方式 0扫描;1实时监控
     * @param FirstDetectionMethod 首次检出方式 0扫描;1实时监控
     */
    public void setFirstDetectionMethod(Long FirstDetectionMethod) {
        this.FirstDetectionMethod = FirstDetectionMethod;
    }

    public RiskProcessEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskProcessEvent(RiskProcessEvent source) {
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
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
        if (source.ProcessId != null) {
            this.ProcessId = new Long(source.ProcessId);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.CmdLine != null) {
            this.CmdLine = new String(source.CmdLine);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.DetectTime != null) {
            this.DetectTime = new String(source.DetectTime);
        }
        if (source.VirusName != null) {
            this.VirusName = new String(source.VirusName);
        }
        if (source.CheckPlatform != null) {
            this.CheckPlatform = new String[source.CheckPlatform.length];
            for (int i = 0; i < source.CheckPlatform.length; i++) {
                this.CheckPlatform[i] = new String(source.CheckPlatform[i]);
            }
        }
        if (source.VirusTags != null) {
            this.VirusTags = new String[source.VirusTags.length];
            for (int i = 0; i < source.VirusTags.length; i++) {
                this.VirusTags[i] = new String(source.VirusTags[i]);
            }
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
        if (source.OnlineStatus != null) {
            this.OnlineStatus = new Long(source.OnlineStatus);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.FirstDetectionMethod != null) {
            this.FirstDetectionMethod = new Long(source.FirstDetectionMethod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "WanIp", this.WanIp);
        this.setParamSimple(map, prefix + "ProcessId", this.ProcessId);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "CmdLine", this.CmdLine);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "DetectTime", this.DetectTime);
        this.setParamSimple(map, prefix + "VirusName", this.VirusName);
        this.setParamArraySimple(map, prefix + "CheckPlatform.", this.CheckPlatform);
        this.setParamArraySimple(map, prefix + "VirusTags.", this.VirusTags);
        this.setParamSimple(map, prefix + "ThreatDesc", this.ThreatDesc);
        this.setParamSimple(map, prefix + "SuggestSolution", this.SuggestSolution);
        this.setParamSimple(map, prefix + "ReferenceLink", this.ReferenceLink);
        this.setParamSimple(map, prefix + "HandleStatus", this.HandleStatus);
        this.setParamSimple(map, prefix + "OnlineStatus", this.OnlineStatus);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "FirstDetectionMethod", this.FirstDetectionMethod);

    }
}

