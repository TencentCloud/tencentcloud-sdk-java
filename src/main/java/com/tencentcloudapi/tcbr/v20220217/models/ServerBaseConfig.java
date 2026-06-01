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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServerBaseConfig extends AbstractModel {

    /**
    * <p>环境 Id</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>服务名</p>
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * <p>是否开启公网访问</p>
    */
    @SerializedName("OpenAccessTypes")
    @Expose
    private String [] OpenAccessTypes;

    /**
    * <p>Cpu 规格</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Float Cpu;

    /**
    * <p>Mem 规格</p>
    */
    @SerializedName("Mem")
    @Expose
    private Float Mem;

    /**
    * <p>最小副本数</p>
    */
    @SerializedName("MinNum")
    @Expose
    private Long MinNum;

    /**
    * <p>最大副本数</p>
    */
    @SerializedName("MaxNum")
    @Expose
    private Long MaxNum;

    /**
    * <p>扩缩容配置</p>
    */
    @SerializedName("PolicyDetails")
    @Expose
    private HpaPolicy [] PolicyDetails;

    /**
    * <p>日志采集路径</p>
    */
    @SerializedName("CustomLogs")
    @Expose
    private String CustomLogs;

    /**
    * <p>环境变量</p>
    */
    @SerializedName("EnvParams")
    @Expose
    private String EnvParams;

    /**
    * <p>延迟检测时间</p>
    */
    @SerializedName("InitialDelaySeconds")
    @Expose
    private Long InitialDelaySeconds;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>服务端口</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>是否有Dockerfile</p>
    */
    @SerializedName("HasDockerfile")
    @Expose
    private Boolean HasDockerfile;

    /**
    * <p>Dockerfile 文件名</p>
    */
    @SerializedName("Dockerfile")
    @Expose
    private String Dockerfile;

    /**
    * <p>构建目录</p>
    */
    @SerializedName("BuildDir")
    @Expose
    private String BuildDir;

    /**
    * <p>日志类型: none | default | custom</p>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>cls setId</p>
    */
    @SerializedName("LogSetId")
    @Expose
    private String LogSetId;

    /**
    * <p>cls 主题id</p>
    */
    @SerializedName("LogTopicId")
    @Expose
    private String LogTopicId;

    /**
    * <p>解析类型：json ｜ line</p>
    */
    @SerializedName("LogParseType")
    @Expose
    private String LogParseType;

    /**
    * <p>服务标签, function: 函数托管</p>
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * <p>内网访问开关 close | open</p>
    */
    @SerializedName("InternalAccess")
    @Expose
    private String InternalAccess;

    /**
    * <p>内网域名</p>
    */
    @SerializedName("InternalDomain")
    @Expose
    private String InternalDomain;

    /**
    * <p>运行模式</p>
    */
    @SerializedName("OperationMode")
    @Expose
    private String OperationMode;

    /**
    * <p>定时扩缩容配置</p>
    */
    @SerializedName("TimerScale")
    @Expose
    private TimerScale [] TimerScale;

    /**
    * <p>Dockerfile EntryPoint 参数</p>
    */
    @SerializedName("EntryPoint")
    @Expose
    private String [] EntryPoint;

    /**
    * <p>Dockerfile Cmd 参数</p>
    */
    @SerializedName("Cmd")
    @Expose
    private String [] Cmd;

    /**
    * <p>会话亲和性开关</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionAffinity")
    @Expose
    private String SessionAffinity;

    /**
    * <p>Vpc 配置参数</p>
    */
    @SerializedName("VpcConf")
    @Expose
    private VpcConf VpcConf;

    /**
    * <p>存储配置信息</p>
    */
    @SerializedName("VolumesConf")
    @Expose
    private VolumeConf [] VolumesConf;

    /**
    * <p>关联镜像密钥</p>
    */
    @SerializedName("LinkImageRegistry")
    @Expose
    private String LinkImageRegistry;

    /**
    * <p>公网访问配置</p>
    */
    @SerializedName("PublicNetConf")
    @Expose
    private PublicNetConf PublicNetConf;

    /**
     * Get <p>环境 Id</p> 
     * @return EnvId <p>环境 Id</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>环境 Id</p>
     * @param EnvId <p>环境 Id</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>服务名</p> 
     * @return ServerName <p>服务名</p>
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set <p>服务名</p>
     * @param ServerName <p>服务名</p>
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    /**
     * Get <p>是否开启公网访问</p> 
     * @return OpenAccessTypes <p>是否开启公网访问</p>
     */
    public String [] getOpenAccessTypes() {
        return this.OpenAccessTypes;
    }

    /**
     * Set <p>是否开启公网访问</p>
     * @param OpenAccessTypes <p>是否开启公网访问</p>
     */
    public void setOpenAccessTypes(String [] OpenAccessTypes) {
        this.OpenAccessTypes = OpenAccessTypes;
    }

    /**
     * Get <p>Cpu 规格</p> 
     * @return Cpu <p>Cpu 规格</p>
     */
    public Float getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>Cpu 规格</p>
     * @param Cpu <p>Cpu 规格</p>
     */
    public void setCpu(Float Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>Mem 规格</p> 
     * @return Mem <p>Mem 规格</p>
     */
    public Float getMem() {
        return this.Mem;
    }

    /**
     * Set <p>Mem 规格</p>
     * @param Mem <p>Mem 规格</p>
     */
    public void setMem(Float Mem) {
        this.Mem = Mem;
    }

    /**
     * Get <p>最小副本数</p> 
     * @return MinNum <p>最小副本数</p>
     */
    public Long getMinNum() {
        return this.MinNum;
    }

    /**
     * Set <p>最小副本数</p>
     * @param MinNum <p>最小副本数</p>
     */
    public void setMinNum(Long MinNum) {
        this.MinNum = MinNum;
    }

    /**
     * Get <p>最大副本数</p> 
     * @return MaxNum <p>最大副本数</p>
     */
    public Long getMaxNum() {
        return this.MaxNum;
    }

    /**
     * Set <p>最大副本数</p>
     * @param MaxNum <p>最大副本数</p>
     */
    public void setMaxNum(Long MaxNum) {
        this.MaxNum = MaxNum;
    }

    /**
     * Get <p>扩缩容配置</p> 
     * @return PolicyDetails <p>扩缩容配置</p>
     */
    public HpaPolicy [] getPolicyDetails() {
        return this.PolicyDetails;
    }

    /**
     * Set <p>扩缩容配置</p>
     * @param PolicyDetails <p>扩缩容配置</p>
     */
    public void setPolicyDetails(HpaPolicy [] PolicyDetails) {
        this.PolicyDetails = PolicyDetails;
    }

    /**
     * Get <p>日志采集路径</p> 
     * @return CustomLogs <p>日志采集路径</p>
     */
    public String getCustomLogs() {
        return this.CustomLogs;
    }

    /**
     * Set <p>日志采集路径</p>
     * @param CustomLogs <p>日志采集路径</p>
     */
    public void setCustomLogs(String CustomLogs) {
        this.CustomLogs = CustomLogs;
    }

    /**
     * Get <p>环境变量</p> 
     * @return EnvParams <p>环境变量</p>
     */
    public String getEnvParams() {
        return this.EnvParams;
    }

    /**
     * Set <p>环境变量</p>
     * @param EnvParams <p>环境变量</p>
     */
    public void setEnvParams(String EnvParams) {
        this.EnvParams = EnvParams;
    }

    /**
     * Get <p>延迟检测时间</p> 
     * @return InitialDelaySeconds <p>延迟检测时间</p>
     */
    public Long getInitialDelaySeconds() {
        return this.InitialDelaySeconds;
    }

    /**
     * Set <p>延迟检测时间</p>
     * @param InitialDelaySeconds <p>延迟检测时间</p>
     */
    public void setInitialDelaySeconds(Long InitialDelaySeconds) {
        this.InitialDelaySeconds = InitialDelaySeconds;
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
     * Get <p>服务端口</p> 
     * @return Port <p>服务端口</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>服务端口</p>
     * @param Port <p>服务端口</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>是否有Dockerfile</p> 
     * @return HasDockerfile <p>是否有Dockerfile</p>
     */
    public Boolean getHasDockerfile() {
        return this.HasDockerfile;
    }

    /**
     * Set <p>是否有Dockerfile</p>
     * @param HasDockerfile <p>是否有Dockerfile</p>
     */
    public void setHasDockerfile(Boolean HasDockerfile) {
        this.HasDockerfile = HasDockerfile;
    }

    /**
     * Get <p>Dockerfile 文件名</p> 
     * @return Dockerfile <p>Dockerfile 文件名</p>
     */
    public String getDockerfile() {
        return this.Dockerfile;
    }

    /**
     * Set <p>Dockerfile 文件名</p>
     * @param Dockerfile <p>Dockerfile 文件名</p>
     */
    public void setDockerfile(String Dockerfile) {
        this.Dockerfile = Dockerfile;
    }

    /**
     * Get <p>构建目录</p> 
     * @return BuildDir <p>构建目录</p>
     */
    public String getBuildDir() {
        return this.BuildDir;
    }

    /**
     * Set <p>构建目录</p>
     * @param BuildDir <p>构建目录</p>
     */
    public void setBuildDir(String BuildDir) {
        this.BuildDir = BuildDir;
    }

    /**
     * Get <p>日志类型: none | default | custom</p> 
     * @return LogType <p>日志类型: none | default | custom</p>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>日志类型: none | default | custom</p>
     * @param LogType <p>日志类型: none | default | custom</p>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>cls setId</p> 
     * @return LogSetId <p>cls setId</p>
     */
    public String getLogSetId() {
        return this.LogSetId;
    }

    /**
     * Set <p>cls setId</p>
     * @param LogSetId <p>cls setId</p>
     */
    public void setLogSetId(String LogSetId) {
        this.LogSetId = LogSetId;
    }

    /**
     * Get <p>cls 主题id</p> 
     * @return LogTopicId <p>cls 主题id</p>
     */
    public String getLogTopicId() {
        return this.LogTopicId;
    }

    /**
     * Set <p>cls 主题id</p>
     * @param LogTopicId <p>cls 主题id</p>
     */
    public void setLogTopicId(String LogTopicId) {
        this.LogTopicId = LogTopicId;
    }

    /**
     * Get <p>解析类型：json ｜ line</p> 
     * @return LogParseType <p>解析类型：json ｜ line</p>
     */
    public String getLogParseType() {
        return this.LogParseType;
    }

    /**
     * Set <p>解析类型：json ｜ line</p>
     * @param LogParseType <p>解析类型：json ｜ line</p>
     */
    public void setLogParseType(String LogParseType) {
        this.LogParseType = LogParseType;
    }

    /**
     * Get <p>服务标签, function: 函数托管</p> 
     * @return Tag <p>服务标签, function: 函数托管</p>
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set <p>服务标签, function: 函数托管</p>
     * @param Tag <p>服务标签, function: 函数托管</p>
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get <p>内网访问开关 close | open</p> 
     * @return InternalAccess <p>内网访问开关 close | open</p>
     */
    public String getInternalAccess() {
        return this.InternalAccess;
    }

    /**
     * Set <p>内网访问开关 close | open</p>
     * @param InternalAccess <p>内网访问开关 close | open</p>
     */
    public void setInternalAccess(String InternalAccess) {
        this.InternalAccess = InternalAccess;
    }

    /**
     * Get <p>内网域名</p> 
     * @return InternalDomain <p>内网域名</p>
     */
    public String getInternalDomain() {
        return this.InternalDomain;
    }

    /**
     * Set <p>内网域名</p>
     * @param InternalDomain <p>内网域名</p>
     */
    public void setInternalDomain(String InternalDomain) {
        this.InternalDomain = InternalDomain;
    }

    /**
     * Get <p>运行模式</p> 
     * @return OperationMode <p>运行模式</p>
     */
    public String getOperationMode() {
        return this.OperationMode;
    }

    /**
     * Set <p>运行模式</p>
     * @param OperationMode <p>运行模式</p>
     */
    public void setOperationMode(String OperationMode) {
        this.OperationMode = OperationMode;
    }

    /**
     * Get <p>定时扩缩容配置</p> 
     * @return TimerScale <p>定时扩缩容配置</p>
     */
    public TimerScale [] getTimerScale() {
        return this.TimerScale;
    }

    /**
     * Set <p>定时扩缩容配置</p>
     * @param TimerScale <p>定时扩缩容配置</p>
     */
    public void setTimerScale(TimerScale [] TimerScale) {
        this.TimerScale = TimerScale;
    }

    /**
     * Get <p>Dockerfile EntryPoint 参数</p> 
     * @return EntryPoint <p>Dockerfile EntryPoint 参数</p>
     */
    public String [] getEntryPoint() {
        return this.EntryPoint;
    }

    /**
     * Set <p>Dockerfile EntryPoint 参数</p>
     * @param EntryPoint <p>Dockerfile EntryPoint 参数</p>
     */
    public void setEntryPoint(String [] EntryPoint) {
        this.EntryPoint = EntryPoint;
    }

    /**
     * Get <p>Dockerfile Cmd 参数</p> 
     * @return Cmd <p>Dockerfile Cmd 参数</p>
     */
    public String [] getCmd() {
        return this.Cmd;
    }

    /**
     * Set <p>Dockerfile Cmd 参数</p>
     * @param Cmd <p>Dockerfile Cmd 参数</p>
     */
    public void setCmd(String [] Cmd) {
        this.Cmd = Cmd;
    }

    /**
     * Get <p>会话亲和性开关</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionAffinity <p>会话亲和性开关</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionAffinity() {
        return this.SessionAffinity;
    }

    /**
     * Set <p>会话亲和性开关</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionAffinity <p>会话亲和性开关</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionAffinity(String SessionAffinity) {
        this.SessionAffinity = SessionAffinity;
    }

    /**
     * Get <p>Vpc 配置参数</p> 
     * @return VpcConf <p>Vpc 配置参数</p>
     */
    public VpcConf getVpcConf() {
        return this.VpcConf;
    }

    /**
     * Set <p>Vpc 配置参数</p>
     * @param VpcConf <p>Vpc 配置参数</p>
     */
    public void setVpcConf(VpcConf VpcConf) {
        this.VpcConf = VpcConf;
    }

    /**
     * Get <p>存储配置信息</p> 
     * @return VolumesConf <p>存储配置信息</p>
     */
    public VolumeConf [] getVolumesConf() {
        return this.VolumesConf;
    }

    /**
     * Set <p>存储配置信息</p>
     * @param VolumesConf <p>存储配置信息</p>
     */
    public void setVolumesConf(VolumeConf [] VolumesConf) {
        this.VolumesConf = VolumesConf;
    }

    /**
     * Get <p>关联镜像密钥</p> 
     * @return LinkImageRegistry <p>关联镜像密钥</p>
     */
    public String getLinkImageRegistry() {
        return this.LinkImageRegistry;
    }

    /**
     * Set <p>关联镜像密钥</p>
     * @param LinkImageRegistry <p>关联镜像密钥</p>
     */
    public void setLinkImageRegistry(String LinkImageRegistry) {
        this.LinkImageRegistry = LinkImageRegistry;
    }

    /**
     * Get <p>公网访问配置</p> 
     * @return PublicNetConf <p>公网访问配置</p>
     */
    public PublicNetConf getPublicNetConf() {
        return this.PublicNetConf;
    }

    /**
     * Set <p>公网访问配置</p>
     * @param PublicNetConf <p>公网访问配置</p>
     */
    public void setPublicNetConf(PublicNetConf PublicNetConf) {
        this.PublicNetConf = PublicNetConf;
    }

    public ServerBaseConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerBaseConfig(ServerBaseConfig source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.ServerName != null) {
            this.ServerName = new String(source.ServerName);
        }
        if (source.OpenAccessTypes != null) {
            this.OpenAccessTypes = new String[source.OpenAccessTypes.length];
            for (int i = 0; i < source.OpenAccessTypes.length; i++) {
                this.OpenAccessTypes[i] = new String(source.OpenAccessTypes[i]);
            }
        }
        if (source.Cpu != null) {
            this.Cpu = new Float(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Float(source.Mem);
        }
        if (source.MinNum != null) {
            this.MinNum = new Long(source.MinNum);
        }
        if (source.MaxNum != null) {
            this.MaxNum = new Long(source.MaxNum);
        }
        if (source.PolicyDetails != null) {
            this.PolicyDetails = new HpaPolicy[source.PolicyDetails.length];
            for (int i = 0; i < source.PolicyDetails.length; i++) {
                this.PolicyDetails[i] = new HpaPolicy(source.PolicyDetails[i]);
            }
        }
        if (source.CustomLogs != null) {
            this.CustomLogs = new String(source.CustomLogs);
        }
        if (source.EnvParams != null) {
            this.EnvParams = new String(source.EnvParams);
        }
        if (source.InitialDelaySeconds != null) {
            this.InitialDelaySeconds = new Long(source.InitialDelaySeconds);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.HasDockerfile != null) {
            this.HasDockerfile = new Boolean(source.HasDockerfile);
        }
        if (source.Dockerfile != null) {
            this.Dockerfile = new String(source.Dockerfile);
        }
        if (source.BuildDir != null) {
            this.BuildDir = new String(source.BuildDir);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.LogSetId != null) {
            this.LogSetId = new String(source.LogSetId);
        }
        if (source.LogTopicId != null) {
            this.LogTopicId = new String(source.LogTopicId);
        }
        if (source.LogParseType != null) {
            this.LogParseType = new String(source.LogParseType);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.InternalAccess != null) {
            this.InternalAccess = new String(source.InternalAccess);
        }
        if (source.InternalDomain != null) {
            this.InternalDomain = new String(source.InternalDomain);
        }
        if (source.OperationMode != null) {
            this.OperationMode = new String(source.OperationMode);
        }
        if (source.TimerScale != null) {
            this.TimerScale = new TimerScale[source.TimerScale.length];
            for (int i = 0; i < source.TimerScale.length; i++) {
                this.TimerScale[i] = new TimerScale(source.TimerScale[i]);
            }
        }
        if (source.EntryPoint != null) {
            this.EntryPoint = new String[source.EntryPoint.length];
            for (int i = 0; i < source.EntryPoint.length; i++) {
                this.EntryPoint[i] = new String(source.EntryPoint[i]);
            }
        }
        if (source.Cmd != null) {
            this.Cmd = new String[source.Cmd.length];
            for (int i = 0; i < source.Cmd.length; i++) {
                this.Cmd[i] = new String(source.Cmd[i]);
            }
        }
        if (source.SessionAffinity != null) {
            this.SessionAffinity = new String(source.SessionAffinity);
        }
        if (source.VpcConf != null) {
            this.VpcConf = new VpcConf(source.VpcConf);
        }
        if (source.VolumesConf != null) {
            this.VolumesConf = new VolumeConf[source.VolumesConf.length];
            for (int i = 0; i < source.VolumesConf.length; i++) {
                this.VolumesConf[i] = new VolumeConf(source.VolumesConf[i]);
            }
        }
        if (source.LinkImageRegistry != null) {
            this.LinkImageRegistry = new String(source.LinkImageRegistry);
        }
        if (source.PublicNetConf != null) {
            this.PublicNetConf = new PublicNetConf(source.PublicNetConf);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);
        this.setParamArraySimple(map, prefix + "OpenAccessTypes.", this.OpenAccessTypes);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "MinNum", this.MinNum);
        this.setParamSimple(map, prefix + "MaxNum", this.MaxNum);
        this.setParamArrayObj(map, prefix + "PolicyDetails.", this.PolicyDetails);
        this.setParamSimple(map, prefix + "CustomLogs", this.CustomLogs);
        this.setParamSimple(map, prefix + "EnvParams", this.EnvParams);
        this.setParamSimple(map, prefix + "InitialDelaySeconds", this.InitialDelaySeconds);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "HasDockerfile", this.HasDockerfile);
        this.setParamSimple(map, prefix + "Dockerfile", this.Dockerfile);
        this.setParamSimple(map, prefix + "BuildDir", this.BuildDir);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "LogSetId", this.LogSetId);
        this.setParamSimple(map, prefix + "LogTopicId", this.LogTopicId);
        this.setParamSimple(map, prefix + "LogParseType", this.LogParseType);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "InternalAccess", this.InternalAccess);
        this.setParamSimple(map, prefix + "InternalDomain", this.InternalDomain);
        this.setParamSimple(map, prefix + "OperationMode", this.OperationMode);
        this.setParamArrayObj(map, prefix + "TimerScale.", this.TimerScale);
        this.setParamArraySimple(map, prefix + "EntryPoint.", this.EntryPoint);
        this.setParamArraySimple(map, prefix + "Cmd.", this.Cmd);
        this.setParamSimple(map, prefix + "SessionAffinity", this.SessionAffinity);
        this.setParamObj(map, prefix + "VpcConf.", this.VpcConf);
        this.setParamArrayObj(map, prefix + "VolumesConf.", this.VolumesConf);
        this.setParamSimple(map, prefix + "LinkImageRegistry", this.LinkImageRegistry);
        this.setParamObj(map, prefix + "PublicNetConf.", this.PublicNetConf);

    }
}

