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

public class DescribeAssetHostDetailResponse extends AbstractModel{

    /**
    * 云镜uuid
    */
    @SerializedName("UUID")
    @Expose
    private String UUID;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 主机名
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 主机分组
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * 主机IP
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * 操作系统
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * agent版本
    */
    @SerializedName("AgentVersion")
    @Expose
    private String AgentVersion;

    /**
    * 内核版本
    */
    @SerializedName("KernelVersion")
    @Expose
    private String KernelVersion;

    /**
    * docker版本
    */
    @SerializedName("DockerVersion")
    @Expose
    private String DockerVersion;

    /**
    * docker api版本
    */
    @SerializedName("DockerAPIVersion")
    @Expose
    private String DockerAPIVersion;

    /**
    * docker go 版本
    */
    @SerializedName("DockerGoVersion")
    @Expose
    private String DockerGoVersion;

    /**
    * docker 文件系统类型
    */
    @SerializedName("DockerFileSystemDriver")
    @Expose
    private String DockerFileSystemDriver;

    /**
    * docker root 目录
    */
    @SerializedName("DockerRootDir")
    @Expose
    private String DockerRootDir;

    /**
    * 镜像数
    */
    @SerializedName("ImageCnt")
    @Expose
    private Long ImageCnt;

    /**
    * 容器数
    */
    @SerializedName("ContainerCnt")
    @Expose
    private Long ContainerCnt;

    /**
    * k8s IP
    */
    @SerializedName("K8sMasterIP")
    @Expose
    private String K8sMasterIP;

    /**
    * k8s version
    */
    @SerializedName("K8sVersion")
    @Expose
    private String K8sVersion;

    /**
    * kube proxy
    */
    @SerializedName("KubeProxyVersion")
    @Expose
    private String KubeProxyVersion;

    /**
    * "UNINSTALL"："未安装","OFFLINE"："离线", "ONLINE"："防护中
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 是否Containerd
    */
    @SerializedName("IsContainerd")
    @Expose
    private Boolean IsContainerd;

    /**
    * 主机来源;"TENCENTCLOUD":"腾讯云服务器","OTHERCLOUD":"非腾讯云服务器"
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * 外网ip
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 主机实例ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 地域ID
    */
    @SerializedName("RegionID")
    @Expose
    private Long RegionID;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 云镜uuid 
     * @return UUID 云镜uuid
     */
    public String getUUID() {
        return this.UUID;
    }

    /**
     * Set 云镜uuid
     * @param UUID 云镜uuid
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 主机名 
     * @return HostName 主机名
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 主机名
     * @param HostName 主机名
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 主机分组 
     * @return Group 主机分组
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set 主机分组
     * @param Group 主机分组
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get 主机IP 
     * @return HostIP 主机IP
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set 主机IP
     * @param HostIP 主机IP
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get 操作系统 
     * @return OsName 操作系统
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set 操作系统
     * @param OsName 操作系统
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get agent版本 
     * @return AgentVersion agent版本
     */
    public String getAgentVersion() {
        return this.AgentVersion;
    }

    /**
     * Set agent版本
     * @param AgentVersion agent版本
     */
    public void setAgentVersion(String AgentVersion) {
        this.AgentVersion = AgentVersion;
    }

    /**
     * Get 内核版本 
     * @return KernelVersion 内核版本
     */
    public String getKernelVersion() {
        return this.KernelVersion;
    }

    /**
     * Set 内核版本
     * @param KernelVersion 内核版本
     */
    public void setKernelVersion(String KernelVersion) {
        this.KernelVersion = KernelVersion;
    }

    /**
     * Get docker版本 
     * @return DockerVersion docker版本
     */
    public String getDockerVersion() {
        return this.DockerVersion;
    }

    /**
     * Set docker版本
     * @param DockerVersion docker版本
     */
    public void setDockerVersion(String DockerVersion) {
        this.DockerVersion = DockerVersion;
    }

    /**
     * Get docker api版本 
     * @return DockerAPIVersion docker api版本
     */
    public String getDockerAPIVersion() {
        return this.DockerAPIVersion;
    }

    /**
     * Set docker api版本
     * @param DockerAPIVersion docker api版本
     */
    public void setDockerAPIVersion(String DockerAPIVersion) {
        this.DockerAPIVersion = DockerAPIVersion;
    }

    /**
     * Get docker go 版本 
     * @return DockerGoVersion docker go 版本
     */
    public String getDockerGoVersion() {
        return this.DockerGoVersion;
    }

    /**
     * Set docker go 版本
     * @param DockerGoVersion docker go 版本
     */
    public void setDockerGoVersion(String DockerGoVersion) {
        this.DockerGoVersion = DockerGoVersion;
    }

    /**
     * Get docker 文件系统类型 
     * @return DockerFileSystemDriver docker 文件系统类型
     */
    public String getDockerFileSystemDriver() {
        return this.DockerFileSystemDriver;
    }

    /**
     * Set docker 文件系统类型
     * @param DockerFileSystemDriver docker 文件系统类型
     */
    public void setDockerFileSystemDriver(String DockerFileSystemDriver) {
        this.DockerFileSystemDriver = DockerFileSystemDriver;
    }

    /**
     * Get docker root 目录 
     * @return DockerRootDir docker root 目录
     */
    public String getDockerRootDir() {
        return this.DockerRootDir;
    }

    /**
     * Set docker root 目录
     * @param DockerRootDir docker root 目录
     */
    public void setDockerRootDir(String DockerRootDir) {
        this.DockerRootDir = DockerRootDir;
    }

    /**
     * Get 镜像数 
     * @return ImageCnt 镜像数
     */
    public Long getImageCnt() {
        return this.ImageCnt;
    }

    /**
     * Set 镜像数
     * @param ImageCnt 镜像数
     */
    public void setImageCnt(Long ImageCnt) {
        this.ImageCnt = ImageCnt;
    }

    /**
     * Get 容器数 
     * @return ContainerCnt 容器数
     */
    public Long getContainerCnt() {
        return this.ContainerCnt;
    }

    /**
     * Set 容器数
     * @param ContainerCnt 容器数
     */
    public void setContainerCnt(Long ContainerCnt) {
        this.ContainerCnt = ContainerCnt;
    }

    /**
     * Get k8s IP 
     * @return K8sMasterIP k8s IP
     */
    public String getK8sMasterIP() {
        return this.K8sMasterIP;
    }

    /**
     * Set k8s IP
     * @param K8sMasterIP k8s IP
     */
    public void setK8sMasterIP(String K8sMasterIP) {
        this.K8sMasterIP = K8sMasterIP;
    }

    /**
     * Get k8s version 
     * @return K8sVersion k8s version
     */
    public String getK8sVersion() {
        return this.K8sVersion;
    }

    /**
     * Set k8s version
     * @param K8sVersion k8s version
     */
    public void setK8sVersion(String K8sVersion) {
        this.K8sVersion = K8sVersion;
    }

    /**
     * Get kube proxy 
     * @return KubeProxyVersion kube proxy
     */
    public String getKubeProxyVersion() {
        return this.KubeProxyVersion;
    }

    /**
     * Set kube proxy
     * @param KubeProxyVersion kube proxy
     */
    public void setKubeProxyVersion(String KubeProxyVersion) {
        this.KubeProxyVersion = KubeProxyVersion;
    }

    /**
     * Get "UNINSTALL"："未安装","OFFLINE"："离线", "ONLINE"："防护中 
     * @return Status "UNINSTALL"："未安装","OFFLINE"："离线", "ONLINE"："防护中
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set "UNINSTALL"："未安装","OFFLINE"："离线", "ONLINE"："防护中
     * @param Status "UNINSTALL"："未安装","OFFLINE"："离线", "ONLINE"："防护中
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 是否Containerd 
     * @return IsContainerd 是否Containerd
     */
    public Boolean getIsContainerd() {
        return this.IsContainerd;
    }

    /**
     * Set 是否Containerd
     * @param IsContainerd 是否Containerd
     */
    public void setIsContainerd(Boolean IsContainerd) {
        this.IsContainerd = IsContainerd;
    }

    /**
     * Get 主机来源;"TENCENTCLOUD":"腾讯云服务器","OTHERCLOUD":"非腾讯云服务器" 
     * @return MachineType 主机来源;"TENCENTCLOUD":"腾讯云服务器","OTHERCLOUD":"非腾讯云服务器"
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set 主机来源;"TENCENTCLOUD":"腾讯云服务器","OTHERCLOUD":"非腾讯云服务器"
     * @param MachineType 主机来源;"TENCENTCLOUD":"腾讯云服务器","OTHERCLOUD":"非腾讯云服务器"
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
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
     * Get 主机实例ID 
     * @return InstanceID 主机实例ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 主机实例ID
     * @param InstanceID 主机实例ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 地域ID 
     * @return RegionID 地域ID
     */
    public Long getRegionID() {
        return this.RegionID;
    }

    /**
     * Set 地域ID
     * @param RegionID 地域ID
     */
    public void setRegionID(Long RegionID) {
        this.RegionID = RegionID;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAssetHostDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetHostDetailResponse(DescribeAssetHostDetailResponse source) {
        if (source.UUID != null) {
            this.UUID = new String(source.UUID);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.AgentVersion != null) {
            this.AgentVersion = new String(source.AgentVersion);
        }
        if (source.KernelVersion != null) {
            this.KernelVersion = new String(source.KernelVersion);
        }
        if (source.DockerVersion != null) {
            this.DockerVersion = new String(source.DockerVersion);
        }
        if (source.DockerAPIVersion != null) {
            this.DockerAPIVersion = new String(source.DockerAPIVersion);
        }
        if (source.DockerGoVersion != null) {
            this.DockerGoVersion = new String(source.DockerGoVersion);
        }
        if (source.DockerFileSystemDriver != null) {
            this.DockerFileSystemDriver = new String(source.DockerFileSystemDriver);
        }
        if (source.DockerRootDir != null) {
            this.DockerRootDir = new String(source.DockerRootDir);
        }
        if (source.ImageCnt != null) {
            this.ImageCnt = new Long(source.ImageCnt);
        }
        if (source.ContainerCnt != null) {
            this.ContainerCnt = new Long(source.ContainerCnt);
        }
        if (source.K8sMasterIP != null) {
            this.K8sMasterIP = new String(source.K8sMasterIP);
        }
        if (source.K8sVersion != null) {
            this.K8sVersion = new String(source.K8sVersion);
        }
        if (source.KubeProxyVersion != null) {
            this.KubeProxyVersion = new String(source.KubeProxyVersion);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.IsContainerd != null) {
            this.IsContainerd = new Boolean(source.IsContainerd);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.RegionID != null) {
            this.RegionID = new Long(source.RegionID);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UUID", this.UUID);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "AgentVersion", this.AgentVersion);
        this.setParamSimple(map, prefix + "KernelVersion", this.KernelVersion);
        this.setParamSimple(map, prefix + "DockerVersion", this.DockerVersion);
        this.setParamSimple(map, prefix + "DockerAPIVersion", this.DockerAPIVersion);
        this.setParamSimple(map, prefix + "DockerGoVersion", this.DockerGoVersion);
        this.setParamSimple(map, prefix + "DockerFileSystemDriver", this.DockerFileSystemDriver);
        this.setParamSimple(map, prefix + "DockerRootDir", this.DockerRootDir);
        this.setParamSimple(map, prefix + "ImageCnt", this.ImageCnt);
        this.setParamSimple(map, prefix + "ContainerCnt", this.ContainerCnt);
        this.setParamSimple(map, prefix + "K8sMasterIP", this.K8sMasterIP);
        this.setParamSimple(map, prefix + "K8sVersion", this.K8sVersion);
        this.setParamSimple(map, prefix + "KubeProxyVersion", this.KubeProxyVersion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsContainerd", this.IsContainerd);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "RegionID", this.RegionID);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

