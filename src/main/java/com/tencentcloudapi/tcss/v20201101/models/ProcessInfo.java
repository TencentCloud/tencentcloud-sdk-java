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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProcessInfo extends AbstractModel {

    /**
    * 进程启动时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 运行用户
    */
    @SerializedName("RunAs")
    @Expose
    private String RunAs;

    /**
    * 命令行参数
    */
    @SerializedName("CmdLine")
    @Expose
    private String CmdLine;

    /**
    * Exe路径
    */
    @SerializedName("Exe")
    @Expose
    private String Exe;

    /**
    * 主机PID
    */
    @SerializedName("PID")
    @Expose
    private Long PID;

    /**
    * 容器内pid
    */
    @SerializedName("ContainerPID")
    @Expose
    private Long ContainerPID;

    /**
    * 容器名称
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
    * 节点id
    */
    @SerializedName("NodeID")
    @Expose
    private String NodeID;

    /**
    * podip
    */
    @SerializedName("PodIP")
    @Expose
    private String PodIP;

    /**
    * pod名称
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * 节点类型
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 超级节点唯一id
    */
    @SerializedName("NodeUniqueID")
    @Expose
    private String NodeUniqueID;

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
     * Get 运行用户 
     * @return RunAs 运行用户
     */
    public String getRunAs() {
        return this.RunAs;
    }

    /**
     * Set 运行用户
     * @param RunAs 运行用户
     */
    public void setRunAs(String RunAs) {
        this.RunAs = RunAs;
    }

    /**
     * Get 命令行参数 
     * @return CmdLine 命令行参数
     */
    public String getCmdLine() {
        return this.CmdLine;
    }

    /**
     * Set 命令行参数
     * @param CmdLine 命令行参数
     */
    public void setCmdLine(String CmdLine) {
        this.CmdLine = CmdLine;
    }

    /**
     * Get Exe路径 
     * @return Exe Exe路径
     */
    public String getExe() {
        return this.Exe;
    }

    /**
     * Set Exe路径
     * @param Exe Exe路径
     */
    public void setExe(String Exe) {
        this.Exe = Exe;
    }

    /**
     * Get 主机PID 
     * @return PID 主机PID
     */
    public Long getPID() {
        return this.PID;
    }

    /**
     * Set 主机PID
     * @param PID 主机PID
     */
    public void setPID(Long PID) {
        this.PID = PID;
    }

    /**
     * Get 容器内pid 
     * @return ContainerPID 容器内pid
     */
    public Long getContainerPID() {
        return this.ContainerPID;
    }

    /**
     * Set 容器内pid
     * @param ContainerPID 容器内pid
     */
    public void setContainerPID(Long ContainerPID) {
        this.ContainerPID = ContainerPID;
    }

    /**
     * Get 容器名称 
     * @return ContainerName 容器名称
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set 容器名称
     * @param ContainerName 容器名称
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

    /**
     * Get 节点id 
     * @return NodeID 节点id
     */
    public String getNodeID() {
        return this.NodeID;
    }

    /**
     * Set 节点id
     * @param NodeID 节点id
     */
    public void setNodeID(String NodeID) {
        this.NodeID = NodeID;
    }

    /**
     * Get podip 
     * @return PodIP podip
     */
    public String getPodIP() {
        return this.PodIP;
    }

    /**
     * Set podip
     * @param PodIP podip
     */
    public void setPodIP(String PodIP) {
        this.PodIP = PodIP;
    }

    /**
     * Get pod名称 
     * @return PodName pod名称
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set pod名称
     * @param PodName pod名称
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get 节点类型 
     * @return NodeType 节点类型
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点类型
     * @param NodeType 节点类型
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 超级节点唯一id 
     * @return NodeUniqueID 超级节点唯一id
     */
    public String getNodeUniqueID() {
        return this.NodeUniqueID;
    }

    /**
     * Set 超级节点唯一id
     * @param NodeUniqueID 超级节点唯一id
     */
    public void setNodeUniqueID(String NodeUniqueID) {
        this.NodeUniqueID = NodeUniqueID;
    }

    public ProcessInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessInfo(ProcessInfo source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.RunAs != null) {
            this.RunAs = new String(source.RunAs);
        }
        if (source.CmdLine != null) {
            this.CmdLine = new String(source.CmdLine);
        }
        if (source.Exe != null) {
            this.Exe = new String(source.Exe);
        }
        if (source.PID != null) {
            this.PID = new Long(source.PID);
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
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.NodeID != null) {
            this.NodeID = new String(source.NodeID);
        }
        if (source.PodIP != null) {
            this.PodIP = new String(source.PodIP);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeUniqueID != null) {
            this.NodeUniqueID = new String(source.NodeUniqueID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "RunAs", this.RunAs);
        this.setParamSimple(map, prefix + "CmdLine", this.CmdLine);
        this.setParamSimple(map, prefix + "Exe", this.Exe);
        this.setParamSimple(map, prefix + "PID", this.PID);
        this.setParamSimple(map, prefix + "ContainerPID", this.ContainerPID);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "HostID", this.HostID);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "NodeID", this.NodeID);
        this.setParamSimple(map, prefix + "PodIP", this.PodIP);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeUniqueID", this.NodeUniqueID);

    }
}

