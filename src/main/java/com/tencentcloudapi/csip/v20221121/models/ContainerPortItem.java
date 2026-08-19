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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContainerPortItem extends AbstractModel {

    /**
    * 监听进程名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * 容器内监听端口
    */
    @SerializedName("ContainerPort")
    @Expose
    private Long ContainerPort;

    /**
    * 进程运行用户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunAs")
    @Expose
    private String RunAs;

    /**
    * 容器内进程ID
    */
    @SerializedName("ContainerPID")
    @Expose
    private Long ContainerPID;

    /**
    * 宿主机内网IP地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostInnerIP")
    @Expose
    private String HostInnerIP;

    /**
    * 宿主机外网IP地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostPublicIP")
    @Expose
    private String HostPublicIP;

    /**
    * 宿主机映射端口
    */
    @SerializedName("PublicPort")
    @Expose
    private Long PublicPort;

    /**
    * 网络协议类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProtocolType")
    @Expose
    private String ProtocolType;

    /**
     * Get 监听进程名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessName 监听进程名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set 监听进程名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessName 监听进程名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get 容器内监听端口 
     * @return ContainerPort 容器内监听端口
     */
    public Long getContainerPort() {
        return this.ContainerPort;
    }

    /**
     * Set 容器内监听端口
     * @param ContainerPort 容器内监听端口
     */
    public void setContainerPort(Long ContainerPort) {
        this.ContainerPort = ContainerPort;
    }

    /**
     * Get 进程运行用户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunAs 进程运行用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunAs() {
        return this.RunAs;
    }

    /**
     * Set 进程运行用户
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunAs 进程运行用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunAs(String RunAs) {
        this.RunAs = RunAs;
    }

    /**
     * Get 容器内进程ID 
     * @return ContainerPID 容器内进程ID
     */
    public Long getContainerPID() {
        return this.ContainerPID;
    }

    /**
     * Set 容器内进程ID
     * @param ContainerPID 容器内进程ID
     */
    public void setContainerPID(Long ContainerPID) {
        this.ContainerPID = ContainerPID;
    }

    /**
     * Get 宿主机内网IP地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostInnerIP 宿主机内网IP地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostInnerIP() {
        return this.HostInnerIP;
    }

    /**
     * Set 宿主机内网IP地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostInnerIP 宿主机内网IP地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostInnerIP(String HostInnerIP) {
        this.HostInnerIP = HostInnerIP;
    }

    /**
     * Get 宿主机外网IP地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostPublicIP 宿主机外网IP地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostPublicIP() {
        return this.HostPublicIP;
    }

    /**
     * Set 宿主机外网IP地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostPublicIP 宿主机外网IP地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostPublicIP(String HostPublicIP) {
        this.HostPublicIP = HostPublicIP;
    }

    /**
     * Get 宿主机映射端口 
     * @return PublicPort 宿主机映射端口
     */
    public Long getPublicPort() {
        return this.PublicPort;
    }

    /**
     * Set 宿主机映射端口
     * @param PublicPort 宿主机映射端口
     */
    public void setPublicPort(Long PublicPort) {
        this.PublicPort = PublicPort;
    }

    /**
     * Get 网络协议类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProtocolType 网络协议类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocolType() {
        return this.ProtocolType;
    }

    /**
     * Set 网络协议类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProtocolType 网络协议类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocolType(String ProtocolType) {
        this.ProtocolType = ProtocolType;
    }

    public ContainerPortItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerPortItem(ContainerPortItem source) {
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.ContainerPort != null) {
            this.ContainerPort = new Long(source.ContainerPort);
        }
        if (source.RunAs != null) {
            this.RunAs = new String(source.RunAs);
        }
        if (source.ContainerPID != null) {
            this.ContainerPID = new Long(source.ContainerPID);
        }
        if (source.HostInnerIP != null) {
            this.HostInnerIP = new String(source.HostInnerIP);
        }
        if (source.HostPublicIP != null) {
            this.HostPublicIP = new String(source.HostPublicIP);
        }
        if (source.PublicPort != null) {
            this.PublicPort = new Long(source.PublicPort);
        }
        if (source.ProtocolType != null) {
            this.ProtocolType = new String(source.ProtocolType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "ContainerPort", this.ContainerPort);
        this.setParamSimple(map, prefix + "RunAs", this.RunAs);
        this.setParamSimple(map, prefix + "ContainerPID", this.ContainerPID);
        this.setParamSimple(map, prefix + "HostInnerIP", this.HostInnerIP);
        this.setParamSimple(map, prefix + "HostPublicIP", this.HostPublicIP);
        this.setParamSimple(map, prefix + "PublicPort", this.PublicPort);
        this.setParamSimple(map, prefix + "ProtocolType", this.ProtocolType);

    }
}

