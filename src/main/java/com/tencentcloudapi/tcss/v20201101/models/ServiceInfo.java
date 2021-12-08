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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceInfo extends AbstractModel{

    /**
    * 服务id
    */
    @SerializedName("ServiceID")
    @Expose
    private String ServiceID;

    /**
    * 主机id
    */
    @SerializedName("HostID")
    @Expose
    private String HostID;

    /**
    * 主机ip
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * 容器名
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * 服务名 例如nginx/redis
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 账号
    */
    @SerializedName("RunAs")
    @Expose
    private String RunAs;

    /**
    * 监听端口
    */
    @SerializedName("Listen")
    @Expose
    private String [] Listen;

    /**
    * 配置
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * 关联进程数
    */
    @SerializedName("ProcessCnt")
    @Expose
    private Long ProcessCnt;

    /**
    * 访问日志
    */
    @SerializedName("AccessLog")
    @Expose
    private String AccessLog;

    /**
    * 错误日志
    */
    @SerializedName("ErrorLog")
    @Expose
    private String ErrorLog;

    /**
    * 数据目录
    */
    @SerializedName("DataPath")
    @Expose
    private String DataPath;

    /**
    * web目录
    */
    @SerializedName("WebRoot")
    @Expose
    private String WebRoot;

    /**
    * 关联的进程id
    */
    @SerializedName("Pids")
    @Expose
    private Long [] Pids;

    /**
    * 服务类型 app,web,db
    */
    @SerializedName("MainType")
    @Expose
    private String MainType;

    /**
    * 执行文件
    */
    @SerializedName("Exe")
    @Expose
    private String Exe;

    /**
    * 服务命令行参数
    */
    @SerializedName("Parameter")
    @Expose
    private String Parameter;

    /**
    * 容器id
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * 主机名称
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 外网ip
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
     * Get 服务id 
     * @return ServiceID 服务id
     */
    public String getServiceID() {
        return this.ServiceID;
    }

    /**
     * Set 服务id
     * @param ServiceID 服务id
     */
    public void setServiceID(String ServiceID) {
        this.ServiceID = ServiceID;
    }

    /**
     * Get 主机id 
     * @return HostID 主机id
     */
    public String getHostID() {
        return this.HostID;
    }

    /**
     * Set 主机id
     * @param HostID 主机id
     */
    public void setHostID(String HostID) {
        this.HostID = HostID;
    }

    /**
     * Get 主机ip 
     * @return HostIP 主机ip
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set 主机ip
     * @param HostIP 主机ip
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get 容器名 
     * @return ContainerName 容器名
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set 容器名
     * @param ContainerName 容器名
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get 服务名 例如nginx/redis 
     * @return Type 服务名 例如nginx/redis
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 服务名 例如nginx/redis
     * @param Type 服务名 例如nginx/redis
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 版本 
     * @return Version 版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 版本
     * @param Version 版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 账号 
     * @return RunAs 账号
     */
    public String getRunAs() {
        return this.RunAs;
    }

    /**
     * Set 账号
     * @param RunAs 账号
     */
    public void setRunAs(String RunAs) {
        this.RunAs = RunAs;
    }

    /**
     * Get 监听端口 
     * @return Listen 监听端口
     */
    public String [] getListen() {
        return this.Listen;
    }

    /**
     * Set 监听端口
     * @param Listen 监听端口
     */
    public void setListen(String [] Listen) {
        this.Listen = Listen;
    }

    /**
     * Get 配置 
     * @return Config 配置
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set 配置
     * @param Config 配置
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get 关联进程数 
     * @return ProcessCnt 关联进程数
     */
    public Long getProcessCnt() {
        return this.ProcessCnt;
    }

    /**
     * Set 关联进程数
     * @param ProcessCnt 关联进程数
     */
    public void setProcessCnt(Long ProcessCnt) {
        this.ProcessCnt = ProcessCnt;
    }

    /**
     * Get 访问日志 
     * @return AccessLog 访问日志
     */
    public String getAccessLog() {
        return this.AccessLog;
    }

    /**
     * Set 访问日志
     * @param AccessLog 访问日志
     */
    public void setAccessLog(String AccessLog) {
        this.AccessLog = AccessLog;
    }

    /**
     * Get 错误日志 
     * @return ErrorLog 错误日志
     */
    public String getErrorLog() {
        return this.ErrorLog;
    }

    /**
     * Set 错误日志
     * @param ErrorLog 错误日志
     */
    public void setErrorLog(String ErrorLog) {
        this.ErrorLog = ErrorLog;
    }

    /**
     * Get 数据目录 
     * @return DataPath 数据目录
     */
    public String getDataPath() {
        return this.DataPath;
    }

    /**
     * Set 数据目录
     * @param DataPath 数据目录
     */
    public void setDataPath(String DataPath) {
        this.DataPath = DataPath;
    }

    /**
     * Get web目录 
     * @return WebRoot web目录
     */
    public String getWebRoot() {
        return this.WebRoot;
    }

    /**
     * Set web目录
     * @param WebRoot web目录
     */
    public void setWebRoot(String WebRoot) {
        this.WebRoot = WebRoot;
    }

    /**
     * Get 关联的进程id 
     * @return Pids 关联的进程id
     */
    public Long [] getPids() {
        return this.Pids;
    }

    /**
     * Set 关联的进程id
     * @param Pids 关联的进程id
     */
    public void setPids(Long [] Pids) {
        this.Pids = Pids;
    }

    /**
     * Get 服务类型 app,web,db 
     * @return MainType 服务类型 app,web,db
     */
    public String getMainType() {
        return this.MainType;
    }

    /**
     * Set 服务类型 app,web,db
     * @param MainType 服务类型 app,web,db
     */
    public void setMainType(String MainType) {
        this.MainType = MainType;
    }

    /**
     * Get 执行文件 
     * @return Exe 执行文件
     */
    public String getExe() {
        return this.Exe;
    }

    /**
     * Set 执行文件
     * @param Exe 执行文件
     */
    public void setExe(String Exe) {
        this.Exe = Exe;
    }

    /**
     * Get 服务命令行参数 
     * @return Parameter 服务命令行参数
     */
    public String getParameter() {
        return this.Parameter;
    }

    /**
     * Set 服务命令行参数
     * @param Parameter 服务命令行参数
     */
    public void setParameter(String Parameter) {
        this.Parameter = Parameter;
    }

    /**
     * Get 容器id 
     * @return ContainerId 容器id
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set 容器id
     * @param ContainerId 容器id
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
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
     * Get 外网ip 
     * @return PublicIp 外网ip
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 外网ip
     * @param PublicIp 外网ip
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    public ServiceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceInfo(ServiceInfo source) {
        if (source.ServiceID != null) {
            this.ServiceID = new String(source.ServiceID);
        }
        if (source.HostID != null) {
            this.HostID = new String(source.HostID);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.RunAs != null) {
            this.RunAs = new String(source.RunAs);
        }
        if (source.Listen != null) {
            this.Listen = new String[source.Listen.length];
            for (int i = 0; i < source.Listen.length; i++) {
                this.Listen[i] = new String(source.Listen[i]);
            }
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.ProcessCnt != null) {
            this.ProcessCnt = new Long(source.ProcessCnt);
        }
        if (source.AccessLog != null) {
            this.AccessLog = new String(source.AccessLog);
        }
        if (source.ErrorLog != null) {
            this.ErrorLog = new String(source.ErrorLog);
        }
        if (source.DataPath != null) {
            this.DataPath = new String(source.DataPath);
        }
        if (source.WebRoot != null) {
            this.WebRoot = new String(source.WebRoot);
        }
        if (source.Pids != null) {
            this.Pids = new Long[source.Pids.length];
            for (int i = 0; i < source.Pids.length; i++) {
                this.Pids[i] = new Long(source.Pids[i]);
            }
        }
        if (source.MainType != null) {
            this.MainType = new String(source.MainType);
        }
        if (source.Exe != null) {
            this.Exe = new String(source.Exe);
        }
        if (source.Parameter != null) {
            this.Parameter = new String(source.Parameter);
        }
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceID", this.ServiceID);
        this.setParamSimple(map, prefix + "HostID", this.HostID);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "RunAs", this.RunAs);
        this.setParamArraySimple(map, prefix + "Listen.", this.Listen);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "ProcessCnt", this.ProcessCnt);
        this.setParamSimple(map, prefix + "AccessLog", this.AccessLog);
        this.setParamSimple(map, prefix + "ErrorLog", this.ErrorLog);
        this.setParamSimple(map, prefix + "DataPath", this.DataPath);
        this.setParamSimple(map, prefix + "WebRoot", this.WebRoot);
        this.setParamArraySimple(map, prefix + "Pids.", this.Pids);
        this.setParamSimple(map, prefix + "MainType", this.MainType);
        this.setParamSimple(map, prefix + "Exe", this.Exe);
        this.setParamSimple(map, prefix + "Parameter", this.Parameter);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);

    }
}

