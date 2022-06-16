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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServerBaseConfig extends AbstractModel{

    /**
    * 环境 Id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 服务名
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * 是否开启公网访问
    */
    @SerializedName("OpenAccessTypes")
    @Expose
    private String [] OpenAccessTypes;

    /**
    * Cpu 规格
    */
    @SerializedName("Cpu")
    @Expose
    private Float Cpu;

    /**
    * Mem 规格
    */
    @SerializedName("Mem")
    @Expose
    private Float Mem;

    /**
    * 最小副本数
    */
    @SerializedName("MinNum")
    @Expose
    private Long MinNum;

    /**
    * 最大副本数
    */
    @SerializedName("MaxNum")
    @Expose
    private Long MaxNum;

    /**
    * 扩缩容配置
    */
    @SerializedName("PolicyDetails")
    @Expose
    private HpaPolicy [] PolicyDetails;

    /**
    * 日志采集路径
    */
    @SerializedName("CustomLogs")
    @Expose
    private String CustomLogs;

    /**
    * 环境变量
    */
    @SerializedName("EnvParams")
    @Expose
    private String EnvParams;

    /**
    * 延迟检测时间
    */
    @SerializedName("InitialDelaySeconds")
    @Expose
    private Long InitialDelaySeconds;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 服务端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 是否有Dockerfile
    */
    @SerializedName("HasDockerfile")
    @Expose
    private Boolean HasDockerfile;

    /**
    * Dockerfile 文件名
    */
    @SerializedName("Dockerfile")
    @Expose
    private String Dockerfile;

    /**
    * 构建目录
    */
    @SerializedName("BuildDir")
    @Expose
    private String BuildDir;

    /**
    * 日志类型: none | default | custom
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * cls setId
    */
    @SerializedName("LogSetId")
    @Expose
    private String LogSetId;

    /**
    * cls 主题id
    */
    @SerializedName("LogTopicId")
    @Expose
    private String LogTopicId;

    /**
    * 解析类型：json ｜ line
    */
    @SerializedName("LogParseType")
    @Expose
    private String LogParseType;

    /**
     * Get 环境 Id 
     * @return EnvId 环境 Id
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境 Id
     * @param EnvId 环境 Id
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 服务名 
     * @return ServerName 服务名
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set 服务名
     * @param ServerName 服务名
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    /**
     * Get 是否开启公网访问 
     * @return OpenAccessTypes 是否开启公网访问
     */
    public String [] getOpenAccessTypes() {
        return this.OpenAccessTypes;
    }

    /**
     * Set 是否开启公网访问
     * @param OpenAccessTypes 是否开启公网访问
     */
    public void setOpenAccessTypes(String [] OpenAccessTypes) {
        this.OpenAccessTypes = OpenAccessTypes;
    }

    /**
     * Get Cpu 规格 
     * @return Cpu Cpu 规格
     */
    public Float getCpu() {
        return this.Cpu;
    }

    /**
     * Set Cpu 规格
     * @param Cpu Cpu 规格
     */
    public void setCpu(Float Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Mem 规格 
     * @return Mem Mem 规格
     */
    public Float getMem() {
        return this.Mem;
    }

    /**
     * Set Mem 规格
     * @param Mem Mem 规格
     */
    public void setMem(Float Mem) {
        this.Mem = Mem;
    }

    /**
     * Get 最小副本数 
     * @return MinNum 最小副本数
     */
    public Long getMinNum() {
        return this.MinNum;
    }

    /**
     * Set 最小副本数
     * @param MinNum 最小副本数
     */
    public void setMinNum(Long MinNum) {
        this.MinNum = MinNum;
    }

    /**
     * Get 最大副本数 
     * @return MaxNum 最大副本数
     */
    public Long getMaxNum() {
        return this.MaxNum;
    }

    /**
     * Set 最大副本数
     * @param MaxNum 最大副本数
     */
    public void setMaxNum(Long MaxNum) {
        this.MaxNum = MaxNum;
    }

    /**
     * Get 扩缩容配置 
     * @return PolicyDetails 扩缩容配置
     */
    public HpaPolicy [] getPolicyDetails() {
        return this.PolicyDetails;
    }

    /**
     * Set 扩缩容配置
     * @param PolicyDetails 扩缩容配置
     */
    public void setPolicyDetails(HpaPolicy [] PolicyDetails) {
        this.PolicyDetails = PolicyDetails;
    }

    /**
     * Get 日志采集路径 
     * @return CustomLogs 日志采集路径
     */
    public String getCustomLogs() {
        return this.CustomLogs;
    }

    /**
     * Set 日志采集路径
     * @param CustomLogs 日志采集路径
     */
    public void setCustomLogs(String CustomLogs) {
        this.CustomLogs = CustomLogs;
    }

    /**
     * Get 环境变量 
     * @return EnvParams 环境变量
     */
    public String getEnvParams() {
        return this.EnvParams;
    }

    /**
     * Set 环境变量
     * @param EnvParams 环境变量
     */
    public void setEnvParams(String EnvParams) {
        this.EnvParams = EnvParams;
    }

    /**
     * Get 延迟检测时间 
     * @return InitialDelaySeconds 延迟检测时间
     */
    public Long getInitialDelaySeconds() {
        return this.InitialDelaySeconds;
    }

    /**
     * Set 延迟检测时间
     * @param InitialDelaySeconds 延迟检测时间
     */
    public void setInitialDelaySeconds(Long InitialDelaySeconds) {
        this.InitialDelaySeconds = InitialDelaySeconds;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 服务端口 
     * @return Port 服务端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 服务端口
     * @param Port 服务端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 是否有Dockerfile 
     * @return HasDockerfile 是否有Dockerfile
     */
    public Boolean getHasDockerfile() {
        return this.HasDockerfile;
    }

    /**
     * Set 是否有Dockerfile
     * @param HasDockerfile 是否有Dockerfile
     */
    public void setHasDockerfile(Boolean HasDockerfile) {
        this.HasDockerfile = HasDockerfile;
    }

    /**
     * Get Dockerfile 文件名 
     * @return Dockerfile Dockerfile 文件名
     */
    public String getDockerfile() {
        return this.Dockerfile;
    }

    /**
     * Set Dockerfile 文件名
     * @param Dockerfile Dockerfile 文件名
     */
    public void setDockerfile(String Dockerfile) {
        this.Dockerfile = Dockerfile;
    }

    /**
     * Get 构建目录 
     * @return BuildDir 构建目录
     */
    public String getBuildDir() {
        return this.BuildDir;
    }

    /**
     * Set 构建目录
     * @param BuildDir 构建目录
     */
    public void setBuildDir(String BuildDir) {
        this.BuildDir = BuildDir;
    }

    /**
     * Get 日志类型: none | default | custom 
     * @return LogType 日志类型: none | default | custom
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 日志类型: none | default | custom
     * @param LogType 日志类型: none | default | custom
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get cls setId 
     * @return LogSetId cls setId
     */
    public String getLogSetId() {
        return this.LogSetId;
    }

    /**
     * Set cls setId
     * @param LogSetId cls setId
     */
    public void setLogSetId(String LogSetId) {
        this.LogSetId = LogSetId;
    }

    /**
     * Get cls 主题id 
     * @return LogTopicId cls 主题id
     */
    public String getLogTopicId() {
        return this.LogTopicId;
    }

    /**
     * Set cls 主题id
     * @param LogTopicId cls 主题id
     */
    public void setLogTopicId(String LogTopicId) {
        this.LogTopicId = LogTopicId;
    }

    /**
     * Get 解析类型：json ｜ line 
     * @return LogParseType 解析类型：json ｜ line
     */
    public String getLogParseType() {
        return this.LogParseType;
    }

    /**
     * Set 解析类型：json ｜ line
     * @param LogParseType 解析类型：json ｜ line
     */
    public void setLogParseType(String LogParseType) {
        this.LogParseType = LogParseType;
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

    }
}

