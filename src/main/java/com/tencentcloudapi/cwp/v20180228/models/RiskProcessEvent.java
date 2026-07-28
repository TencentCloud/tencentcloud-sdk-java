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
    * <p>事件ID</p>
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * <p>主机名称</p>
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * <p>主机IP</p>
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * <p>外网IP</p>
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * <p>进程ID</p>
    */
    @SerializedName("ProcessId")
    @Expose
    private Long ProcessId;

    /**
    * <p>文件路径</p>
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * <p>执行命令</p>
    */
    @SerializedName("CmdLine")
    @Expose
    private String CmdLine;

    /**
    * <p>进程启动时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>最近检测时间</p>
    */
    @SerializedName("DetectTime")
    @Expose
    private String DetectTime;

    /**
    * <p>病毒名称</p>
    */
    @SerializedName("VirusName")
    @Expose
    private String VirusName;

    /**
    * <p>木马检测平台 [1:云查杀引擎|2:TAV|3:binaryAi|4:异常行为|5:威胁情报]</p>
    */
    @SerializedName("CheckPlatform")
    @Expose
    private String [] CheckPlatform;

    /**
    * <p>病毒标签</p>
    */
    @SerializedName("VirusTags")
    @Expose
    private String [] VirusTags;

    /**
    * <p>威胁描述</p>
    */
    @SerializedName("ThreatDesc")
    @Expose
    private String ThreatDesc;

    /**
    * <p>建议方案</p>
    */
    @SerializedName("SuggestSolution")
    @Expose
    private String SuggestSolution;

    /**
    * <p>参考链接</p>
    */
    @SerializedName("ReferenceLink")
    @Expose
    private String ReferenceLink;

    /**
    * <p>处理状态[0待处理;1已处理;2查杀中;3已查杀;4已退出;5忽略]</p>
    */
    @SerializedName("HandleStatus")
    @Expose
    private Long HandleStatus;

    /**
    * <p>主机在线状态</p>
    */
    @SerializedName("OnlineStatus")
    @Expose
    private Long OnlineStatus;

    /**
    * <p>附加信息</p>
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * <p>主机uuid</p>
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * <p>首次检出方式 0扫描;1实时监控</p>
    */
    @SerializedName("FirstDetectionMethod")
    @Expose
    private Long FirstDetectionMethod;

    /**
    * <p>quuid</p>
    */
    @SerializedName("QUUID")
    @Expose
    private String QUUID;

    /**
    * <p>进程md5</p>
    */
    @SerializedName("ExeMd5")
    @Expose
    private String ExeMd5;

    /**
     * Get <p>事件ID</p> 
     * @return EventId <p>事件ID</p>
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set <p>事件ID</p>
     * @param EventId <p>事件ID</p>
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get <p>主机名称</p> 
     * @return HostName <p>主机名称</p>
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set <p>主机名称</p>
     * @param HostName <p>主机名称</p>
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get <p>主机IP</p> 
     * @return HostIp <p>主机IP</p>
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set <p>主机IP</p>
     * @param HostIp <p>主机IP</p>
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get <p>外网IP</p> 
     * @return WanIp <p>外网IP</p>
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set <p>外网IP</p>
     * @param WanIp <p>外网IP</p>
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get <p>进程ID</p> 
     * @return ProcessId <p>进程ID</p>
     */
    public Long getProcessId() {
        return this.ProcessId;
    }

    /**
     * Set <p>进程ID</p>
     * @param ProcessId <p>进程ID</p>
     */
    public void setProcessId(Long ProcessId) {
        this.ProcessId = ProcessId;
    }

    /**
     * Get <p>文件路径</p> 
     * @return FilePath <p>文件路径</p>
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set <p>文件路径</p>
     * @param FilePath <p>文件路径</p>
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get <p>执行命令</p> 
     * @return CmdLine <p>执行命令</p>
     */
    public String getCmdLine() {
        return this.CmdLine;
    }

    /**
     * Set <p>执行命令</p>
     * @param CmdLine <p>执行命令</p>
     */
    public void setCmdLine(String CmdLine) {
        this.CmdLine = CmdLine;
    }

    /**
     * Get <p>进程启动时间</p> 
     * @return StartTime <p>进程启动时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>进程启动时间</p>
     * @param StartTime <p>进程启动时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>最近检测时间</p> 
     * @return DetectTime <p>最近检测时间</p>
     */
    public String getDetectTime() {
        return this.DetectTime;
    }

    /**
     * Set <p>最近检测时间</p>
     * @param DetectTime <p>最近检测时间</p>
     */
    public void setDetectTime(String DetectTime) {
        this.DetectTime = DetectTime;
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
     * Get <p>木马检测平台 [1:云查杀引擎|2:TAV|3:binaryAi|4:异常行为|5:威胁情报]</p> 
     * @return CheckPlatform <p>木马检测平台 [1:云查杀引擎|2:TAV|3:binaryAi|4:异常行为|5:威胁情报]</p>
     */
    public String [] getCheckPlatform() {
        return this.CheckPlatform;
    }

    /**
     * Set <p>木马检测平台 [1:云查杀引擎|2:TAV|3:binaryAi|4:异常行为|5:威胁情报]</p>
     * @param CheckPlatform <p>木马检测平台 [1:云查杀引擎|2:TAV|3:binaryAi|4:异常行为|5:威胁情报]</p>
     */
    public void setCheckPlatform(String [] CheckPlatform) {
        this.CheckPlatform = CheckPlatform;
    }

    /**
     * Get <p>病毒标签</p> 
     * @return VirusTags <p>病毒标签</p>
     */
    public String [] getVirusTags() {
        return this.VirusTags;
    }

    /**
     * Set <p>病毒标签</p>
     * @param VirusTags <p>病毒标签</p>
     */
    public void setVirusTags(String [] VirusTags) {
        this.VirusTags = VirusTags;
    }

    /**
     * Get <p>威胁描述</p> 
     * @return ThreatDesc <p>威胁描述</p>
     */
    public String getThreatDesc() {
        return this.ThreatDesc;
    }

    /**
     * Set <p>威胁描述</p>
     * @param ThreatDesc <p>威胁描述</p>
     */
    public void setThreatDesc(String ThreatDesc) {
        this.ThreatDesc = ThreatDesc;
    }

    /**
     * Get <p>建议方案</p> 
     * @return SuggestSolution <p>建议方案</p>
     */
    public String getSuggestSolution() {
        return this.SuggestSolution;
    }

    /**
     * Set <p>建议方案</p>
     * @param SuggestSolution <p>建议方案</p>
     */
    public void setSuggestSolution(String SuggestSolution) {
        this.SuggestSolution = SuggestSolution;
    }

    /**
     * Get <p>参考链接</p> 
     * @return ReferenceLink <p>参考链接</p>
     */
    public String getReferenceLink() {
        return this.ReferenceLink;
    }

    /**
     * Set <p>参考链接</p>
     * @param ReferenceLink <p>参考链接</p>
     */
    public void setReferenceLink(String ReferenceLink) {
        this.ReferenceLink = ReferenceLink;
    }

    /**
     * Get <p>处理状态[0待处理;1已处理;2查杀中;3已查杀;4已退出;5忽略]</p> 
     * @return HandleStatus <p>处理状态[0待处理;1已处理;2查杀中;3已查杀;4已退出;5忽略]</p>
     */
    public Long getHandleStatus() {
        return this.HandleStatus;
    }

    /**
     * Set <p>处理状态[0待处理;1已处理;2查杀中;3已查杀;4已退出;5忽略]</p>
     * @param HandleStatus <p>处理状态[0待处理;1已处理;2查杀中;3已查杀;4已退出;5忽略]</p>
     */
    public void setHandleStatus(Long HandleStatus) {
        this.HandleStatus = HandleStatus;
    }

    /**
     * Get <p>主机在线状态</p> 
     * @return OnlineStatus <p>主机在线状态</p>
     */
    public Long getOnlineStatus() {
        return this.OnlineStatus;
    }

    /**
     * Set <p>主机在线状态</p>
     * @param OnlineStatus <p>主机在线状态</p>
     */
    public void setOnlineStatus(Long OnlineStatus) {
        this.OnlineStatus = OnlineStatus;
    }

    /**
     * Get <p>附加信息</p> 
     * @return MachineExtraInfo <p>附加信息</p>
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set <p>附加信息</p>
     * @param MachineExtraInfo <p>附加信息</p>
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    /**
     * Get <p>主机uuid</p> 
     * @return Uuid <p>主机uuid</p>
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set <p>主机uuid</p>
     * @param Uuid <p>主机uuid</p>
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get <p>首次检出方式 0扫描;1实时监控</p> 
     * @return FirstDetectionMethod <p>首次检出方式 0扫描;1实时监控</p>
     */
    public Long getFirstDetectionMethod() {
        return this.FirstDetectionMethod;
    }

    /**
     * Set <p>首次检出方式 0扫描;1实时监控</p>
     * @param FirstDetectionMethod <p>首次检出方式 0扫描;1实时监控</p>
     */
    public void setFirstDetectionMethod(Long FirstDetectionMethod) {
        this.FirstDetectionMethod = FirstDetectionMethod;
    }

    /**
     * Get <p>quuid</p> 
     * @return QUUID <p>quuid</p>
     */
    public String getQUUID() {
        return this.QUUID;
    }

    /**
     * Set <p>quuid</p>
     * @param QUUID <p>quuid</p>
     */
    public void setQUUID(String QUUID) {
        this.QUUID = QUUID;
    }

    /**
     * Get <p>进程md5</p> 
     * @return ExeMd5 <p>进程md5</p>
     */
    public String getExeMd5() {
        return this.ExeMd5;
    }

    /**
     * Set <p>进程md5</p>
     * @param ExeMd5 <p>进程md5</p>
     */
    public void setExeMd5(String ExeMd5) {
        this.ExeMd5 = ExeMd5;
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
        if (source.QUUID != null) {
            this.QUUID = new String(source.QUUID);
        }
        if (source.ExeMd5 != null) {
            this.ExeMd5 = new String(source.ExeMd5);
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
        this.setParamSimple(map, prefix + "QUUID", this.QUUID);
        this.setParamSimple(map, prefix + "ExeMd5", this.ExeMd5);

    }
}

