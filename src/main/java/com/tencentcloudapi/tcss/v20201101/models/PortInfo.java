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

public class PortInfo extends AbstractModel{

    /**
    * 类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 对外ip
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * 主机端口
    */
    @SerializedName("PublicPort")
    @Expose
    private Long PublicPort;

    /**
    * 容器端口
    */
    @SerializedName("ContainerPort")
    @Expose
    private Long ContainerPort;

    /**
    * 容器Pid
    */
    @SerializedName("ContainerPID")
    @Expose
    private Long ContainerPID;

    /**
    * 容器名
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

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
    * 进程名称
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * 容器内监听地址
    */
    @SerializedName("ListenContainer")
    @Expose
    private String ListenContainer;

    /**
    * 容器外监听地址
    */
    @SerializedName("ListenHost")
    @Expose
    private String ListenHost;

    /**
    * 运行账号
    */
    @SerializedName("RunAs")
    @Expose
    private String RunAs;

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
     * Get 类型 
     * @return Type 类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
     * @param Type 类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 对外ip 
     * @return PublicIP 对外ip
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set 对外ip
     * @param PublicIP 对外ip
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get 主机端口 
     * @return PublicPort 主机端口
     */
    public Long getPublicPort() {
        return this.PublicPort;
    }

    /**
     * Set 主机端口
     * @param PublicPort 主机端口
     */
    public void setPublicPort(Long PublicPort) {
        this.PublicPort = PublicPort;
    }

    /**
     * Get 容器端口 
     * @return ContainerPort 容器端口
     */
    public Long getContainerPort() {
        return this.ContainerPort;
    }

    /**
     * Set 容器端口
     * @param ContainerPort 容器端口
     */
    public void setContainerPort(Long ContainerPort) {
        this.ContainerPort = ContainerPort;
    }

    /**
     * Get 容器Pid 
     * @return ContainerPID 容器Pid
     */
    public Long getContainerPID() {
        return this.ContainerPID;
    }

    /**
     * Set 容器Pid
     * @param ContainerPID 容器Pid
     */
    public void setContainerPID(Long ContainerPID) {
        this.ContainerPID = ContainerPID;
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
     * Get 进程名称 
     * @return ProcessName 进程名称
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set 进程名称
     * @param ProcessName 进程名称
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get 容器内监听地址 
     * @return ListenContainer 容器内监听地址
     */
    public String getListenContainer() {
        return this.ListenContainer;
    }

    /**
     * Set 容器内监听地址
     * @param ListenContainer 容器内监听地址
     */
    public void setListenContainer(String ListenContainer) {
        this.ListenContainer = ListenContainer;
    }

    /**
     * Get 容器外监听地址 
     * @return ListenHost 容器外监听地址
     */
    public String getListenHost() {
        return this.ListenHost;
    }

    /**
     * Set 容器外监听地址
     * @param ListenHost 容器外监听地址
     */
    public void setListenHost(String ListenHost) {
        this.ListenHost = ListenHost;
    }

    /**
     * Get 运行账号 
     * @return RunAs 运行账号
     */
    public String getRunAs() {
        return this.RunAs;
    }

    /**
     * Set 运行账号
     * @param RunAs 运行账号
     */
    public void setRunAs(String RunAs) {
        this.RunAs = RunAs;
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

    public PortInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PortInfo(PortInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
        }
        if (source.PublicPort != null) {
            this.PublicPort = new Long(source.PublicPort);
        }
        if (source.ContainerPort != null) {
            this.ContainerPort = new Long(source.ContainerPort);
        }
        if (source.ContainerPID != null) {
            this.ContainerPID = new Long(source.ContainerPID);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.HostID != null) {
            this.HostID = new String(source.HostID);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.ListenContainer != null) {
            this.ListenContainer = new String(source.ListenContainer);
        }
        if (source.ListenHost != null) {
            this.ListenHost = new String(source.ListenHost);
        }
        if (source.RunAs != null) {
            this.RunAs = new String(source.RunAs);
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
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "PublicPort", this.PublicPort);
        this.setParamSimple(map, prefix + "ContainerPort", this.ContainerPort);
        this.setParamSimple(map, prefix + "ContainerPID", this.ContainerPID);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "HostID", this.HostID);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "ListenContainer", this.ListenContainer);
        this.setParamSimple(map, prefix + "ListenHost", this.ListenHost);
        this.setParamSimple(map, prefix + "RunAs", this.RunAs);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);

    }
}

