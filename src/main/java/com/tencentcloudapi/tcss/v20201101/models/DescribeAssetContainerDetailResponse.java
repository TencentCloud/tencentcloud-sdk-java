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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetContainerDetailResponse extends AbstractModel {

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
    * 容器名称
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * 运行状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 运行账户
    */
    @SerializedName("RunAs")
    @Expose
    private String RunAs;

    /**
    * 命令行
    */
    @SerializedName("Cmd")
    @Expose
    private String Cmd;

    /**
    * CPU使用率 * 1000
    */
    @SerializedName("CPUUsage")
    @Expose
    private Long CPUUsage;

    /**
    * 内存使用 KB
    */
    @SerializedName("RamUsage")
    @Expose
    private Long RamUsage;

    /**
    * 镜像名
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 镜像ID
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
    * 归属POD
    */
    @SerializedName("POD")
    @Expose
    private String POD;

    /**
    * k8s 主节点
    */
    @SerializedName("K8sMaster")
    @Expose
    private String K8sMaster;

    /**
    * 容器内进程数
    */
    @SerializedName("ProcessCnt")
    @Expose
    private Long ProcessCnt;

    /**
    * 容器内端口数
    */
    @SerializedName("PortCnt")
    @Expose
    private Long PortCnt;

    /**
    * 组件数
    */
    @SerializedName("ComponentCnt")
    @Expose
    private Long ComponentCnt;

    /**
    * app数
    */
    @SerializedName("AppCnt")
    @Expose
    private Long AppCnt;

    /**
    * websvc数
    */
    @SerializedName("WebServiceCnt")
    @Expose
    private Long WebServiceCnt;

    /**
    * 挂载
    */
    @SerializedName("Mounts")
    @Expose
    private ContainerMount [] Mounts;

    /**
    * 容器网络信息
    */
    @SerializedName("Network")
    @Expose
    private ContainerNetwork Network;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 镜像创建时间
    */
    @SerializedName("ImageCreateTime")
    @Expose
    private String ImageCreateTime;

    /**
    * 镜像大小
    */
    @SerializedName("ImageSize")
    @Expose
    private Long ImageSize;

    /**
    * 主机状态 offline,online,pause
    */
    @SerializedName("HostStatus")
    @Expose
    private String HostStatus;

    /**
    * 网络状态
未隔离  	NORMAL
已隔离		ISOLATED
隔离中		ISOLATING
隔离失败	ISOLATE_FAILED
解除隔离中  RESTORING
解除隔离失败 RESTORE_FAILED
    */
    @SerializedName("NetStatus")
    @Expose
    private String NetStatus;

    /**
    * 网络子状态
    */
    @SerializedName("NetSubStatus")
    @Expose
    private String NetSubStatus;

    /**
    * 隔离来源
    */
    @SerializedName("IsolateSource")
    @Expose
    private String IsolateSource;

    /**
    * 隔离时间
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * 节点ID
    */
    @SerializedName("NodeID")
    @Expose
    private String NodeID;

    /**
    * 节点名称
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 节点子网ID
    */
    @SerializedName("NodeSubNetID")
    @Expose
    private String NodeSubNetID;

    /**
    * 节点子网名称
    */
    @SerializedName("NodeSubNetName")
    @Expose
    private String NodeSubNetName;

    /**
    * 节点子网网段
    */
    @SerializedName("NodeSubNetCIDR")
    @Expose
    private String NodeSubNetCIDR;

    /**
    * pod名称
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * pod ip
    */
    @SerializedName("PodIP")
    @Expose
    private String PodIP;

    /**
    * pod状态
    */
    @SerializedName("PodStatus")
    @Expose
    private String PodStatus;

    /**
    * 集群ID
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 节点类型:NORMAL: 普通节点(默认值) SUPER: 超级节点
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
    * 外网ip
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get 运行状态 
     * @return Status 运行状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 运行状态
     * @param Status 运行状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 运行账户 
     * @return RunAs 运行账户
     */
    public String getRunAs() {
        return this.RunAs;
    }

    /**
     * Set 运行账户
     * @param RunAs 运行账户
     */
    public void setRunAs(String RunAs) {
        this.RunAs = RunAs;
    }

    /**
     * Get 命令行 
     * @return Cmd 命令行
     */
    public String getCmd() {
        return this.Cmd;
    }

    /**
     * Set 命令行
     * @param Cmd 命令行
     */
    public void setCmd(String Cmd) {
        this.Cmd = Cmd;
    }

    /**
     * Get CPU使用率 * 1000 
     * @return CPUUsage CPU使用率 * 1000
     */
    public Long getCPUUsage() {
        return this.CPUUsage;
    }

    /**
     * Set CPU使用率 * 1000
     * @param CPUUsage CPU使用率 * 1000
     */
    public void setCPUUsage(Long CPUUsage) {
        this.CPUUsage = CPUUsage;
    }

    /**
     * Get 内存使用 KB 
     * @return RamUsage 内存使用 KB
     */
    public Long getRamUsage() {
        return this.RamUsage;
    }

    /**
     * Set 内存使用 KB
     * @param RamUsage 内存使用 KB
     */
    public void setRamUsage(Long RamUsage) {
        this.RamUsage = RamUsage;
    }

    /**
     * Get 镜像名 
     * @return ImageName 镜像名
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 镜像名
     * @param ImageName 镜像名
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get 镜像ID 
     * @return ImageID 镜像ID
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set 镜像ID
     * @param ImageID 镜像ID
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
    }

    /**
     * Get 归属POD 
     * @return POD 归属POD
     */
    public String getPOD() {
        return this.POD;
    }

    /**
     * Set 归属POD
     * @param POD 归属POD
     */
    public void setPOD(String POD) {
        this.POD = POD;
    }

    /**
     * Get k8s 主节点 
     * @return K8sMaster k8s 主节点
     */
    public String getK8sMaster() {
        return this.K8sMaster;
    }

    /**
     * Set k8s 主节点
     * @param K8sMaster k8s 主节点
     */
    public void setK8sMaster(String K8sMaster) {
        this.K8sMaster = K8sMaster;
    }

    /**
     * Get 容器内进程数 
     * @return ProcessCnt 容器内进程数
     */
    public Long getProcessCnt() {
        return this.ProcessCnt;
    }

    /**
     * Set 容器内进程数
     * @param ProcessCnt 容器内进程数
     */
    public void setProcessCnt(Long ProcessCnt) {
        this.ProcessCnt = ProcessCnt;
    }

    /**
     * Get 容器内端口数 
     * @return PortCnt 容器内端口数
     */
    public Long getPortCnt() {
        return this.PortCnt;
    }

    /**
     * Set 容器内端口数
     * @param PortCnt 容器内端口数
     */
    public void setPortCnt(Long PortCnt) {
        this.PortCnt = PortCnt;
    }

    /**
     * Get 组件数 
     * @return ComponentCnt 组件数
     */
    public Long getComponentCnt() {
        return this.ComponentCnt;
    }

    /**
     * Set 组件数
     * @param ComponentCnt 组件数
     */
    public void setComponentCnt(Long ComponentCnt) {
        this.ComponentCnt = ComponentCnt;
    }

    /**
     * Get app数 
     * @return AppCnt app数
     */
    public Long getAppCnt() {
        return this.AppCnt;
    }

    /**
     * Set app数
     * @param AppCnt app数
     */
    public void setAppCnt(Long AppCnt) {
        this.AppCnt = AppCnt;
    }

    /**
     * Get websvc数 
     * @return WebServiceCnt websvc数
     */
    public Long getWebServiceCnt() {
        return this.WebServiceCnt;
    }

    /**
     * Set websvc数
     * @param WebServiceCnt websvc数
     */
    public void setWebServiceCnt(Long WebServiceCnt) {
        this.WebServiceCnt = WebServiceCnt;
    }

    /**
     * Get 挂载 
     * @return Mounts 挂载
     */
    public ContainerMount [] getMounts() {
        return this.Mounts;
    }

    /**
     * Set 挂载
     * @param Mounts 挂载
     */
    public void setMounts(ContainerMount [] Mounts) {
        this.Mounts = Mounts;
    }

    /**
     * Get 容器网络信息 
     * @return Network 容器网络信息
     */
    public ContainerNetwork getNetwork() {
        return this.Network;
    }

    /**
     * Set 容器网络信息
     * @param Network 容器网络信息
     */
    public void setNetwork(ContainerNetwork Network) {
        this.Network = Network;
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
     * Get 镜像创建时间 
     * @return ImageCreateTime 镜像创建时间
     */
    public String getImageCreateTime() {
        return this.ImageCreateTime;
    }

    /**
     * Set 镜像创建时间
     * @param ImageCreateTime 镜像创建时间
     */
    public void setImageCreateTime(String ImageCreateTime) {
        this.ImageCreateTime = ImageCreateTime;
    }

    /**
     * Get 镜像大小 
     * @return ImageSize 镜像大小
     */
    public Long getImageSize() {
        return this.ImageSize;
    }

    /**
     * Set 镜像大小
     * @param ImageSize 镜像大小
     */
    public void setImageSize(Long ImageSize) {
        this.ImageSize = ImageSize;
    }

    /**
     * Get 主机状态 offline,online,pause 
     * @return HostStatus 主机状态 offline,online,pause
     */
    public String getHostStatus() {
        return this.HostStatus;
    }

    /**
     * Set 主机状态 offline,online,pause
     * @param HostStatus 主机状态 offline,online,pause
     */
    public void setHostStatus(String HostStatus) {
        this.HostStatus = HostStatus;
    }

    /**
     * Get 网络状态
未隔离  	NORMAL
已隔离		ISOLATED
隔离中		ISOLATING
隔离失败	ISOLATE_FAILED
解除隔离中  RESTORING
解除隔离失败 RESTORE_FAILED 
     * @return NetStatus 网络状态
未隔离  	NORMAL
已隔离		ISOLATED
隔离中		ISOLATING
隔离失败	ISOLATE_FAILED
解除隔离中  RESTORING
解除隔离失败 RESTORE_FAILED
     */
    public String getNetStatus() {
        return this.NetStatus;
    }

    /**
     * Set 网络状态
未隔离  	NORMAL
已隔离		ISOLATED
隔离中		ISOLATING
隔离失败	ISOLATE_FAILED
解除隔离中  RESTORING
解除隔离失败 RESTORE_FAILED
     * @param NetStatus 网络状态
未隔离  	NORMAL
已隔离		ISOLATED
隔离中		ISOLATING
隔离失败	ISOLATE_FAILED
解除隔离中  RESTORING
解除隔离失败 RESTORE_FAILED
     */
    public void setNetStatus(String NetStatus) {
        this.NetStatus = NetStatus;
    }

    /**
     * Get 网络子状态 
     * @return NetSubStatus 网络子状态
     */
    public String getNetSubStatus() {
        return this.NetSubStatus;
    }

    /**
     * Set 网络子状态
     * @param NetSubStatus 网络子状态
     */
    public void setNetSubStatus(String NetSubStatus) {
        this.NetSubStatus = NetSubStatus;
    }

    /**
     * Get 隔离来源 
     * @return IsolateSource 隔离来源
     */
    public String getIsolateSource() {
        return this.IsolateSource;
    }

    /**
     * Set 隔离来源
     * @param IsolateSource 隔离来源
     */
    public void setIsolateSource(String IsolateSource) {
        this.IsolateSource = IsolateSource;
    }

    /**
     * Get 隔离时间 
     * @return IsolateTime 隔离时间
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set 隔离时间
     * @param IsolateTime 隔离时间
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get 节点ID 
     * @return NodeID 节点ID
     */
    public String getNodeID() {
        return this.NodeID;
    }

    /**
     * Set 节点ID
     * @param NodeID 节点ID
     */
    public void setNodeID(String NodeID) {
        this.NodeID = NodeID;
    }

    /**
     * Get 节点名称 
     * @return NodeName 节点名称
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 节点名称
     * @param NodeName 节点名称
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 节点子网ID 
     * @return NodeSubNetID 节点子网ID
     */
    public String getNodeSubNetID() {
        return this.NodeSubNetID;
    }

    /**
     * Set 节点子网ID
     * @param NodeSubNetID 节点子网ID
     */
    public void setNodeSubNetID(String NodeSubNetID) {
        this.NodeSubNetID = NodeSubNetID;
    }

    /**
     * Get 节点子网名称 
     * @return NodeSubNetName 节点子网名称
     */
    public String getNodeSubNetName() {
        return this.NodeSubNetName;
    }

    /**
     * Set 节点子网名称
     * @param NodeSubNetName 节点子网名称
     */
    public void setNodeSubNetName(String NodeSubNetName) {
        this.NodeSubNetName = NodeSubNetName;
    }

    /**
     * Get 节点子网网段 
     * @return NodeSubNetCIDR 节点子网网段
     */
    public String getNodeSubNetCIDR() {
        return this.NodeSubNetCIDR;
    }

    /**
     * Set 节点子网网段
     * @param NodeSubNetCIDR 节点子网网段
     */
    public void setNodeSubNetCIDR(String NodeSubNetCIDR) {
        this.NodeSubNetCIDR = NodeSubNetCIDR;
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
     * Get pod ip 
     * @return PodIP pod ip
     */
    public String getPodIP() {
        return this.PodIP;
    }

    /**
     * Set pod ip
     * @param PodIP pod ip
     */
    public void setPodIP(String PodIP) {
        this.PodIP = PodIP;
    }

    /**
     * Get pod状态 
     * @return PodStatus pod状态
     */
    public String getPodStatus() {
        return this.PodStatus;
    }

    /**
     * Set pod状态
     * @param PodStatus pod状态
     */
    public void setPodStatus(String PodStatus) {
        this.PodStatus = PodStatus;
    }

    /**
     * Get 集群ID 
     * @return ClusterID 集群ID
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set 集群ID
     * @param ClusterID 集群ID
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get 集群名称 
     * @return ClusterName 集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
     * @param ClusterName 集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 节点类型:NORMAL: 普通节点(默认值) SUPER: 超级节点 
     * @return NodeType 节点类型:NORMAL: 普通节点(默认值) SUPER: 超级节点
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点类型:NORMAL: 普通节点(默认值) SUPER: 超级节点
     * @param NodeType 节点类型:NORMAL: 普通节点(默认值) SUPER: 超级节点
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

    /**
     * Get 外网ip 
     * @return PublicIP 外网ip
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set 外网ip
     * @param PublicIP 外网ip
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAssetContainerDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetContainerDetailResponse(DescribeAssetContainerDetailResponse source) {
        if (source.HostID != null) {
            this.HostID = new String(source.HostID);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RunAs != null) {
            this.RunAs = new String(source.RunAs);
        }
        if (source.Cmd != null) {
            this.Cmd = new String(source.Cmd);
        }
        if (source.CPUUsage != null) {
            this.CPUUsage = new Long(source.CPUUsage);
        }
        if (source.RamUsage != null) {
            this.RamUsage = new Long(source.RamUsage);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
        if (source.POD != null) {
            this.POD = new String(source.POD);
        }
        if (source.K8sMaster != null) {
            this.K8sMaster = new String(source.K8sMaster);
        }
        if (source.ProcessCnt != null) {
            this.ProcessCnt = new Long(source.ProcessCnt);
        }
        if (source.PortCnt != null) {
            this.PortCnt = new Long(source.PortCnt);
        }
        if (source.ComponentCnt != null) {
            this.ComponentCnt = new Long(source.ComponentCnt);
        }
        if (source.AppCnt != null) {
            this.AppCnt = new Long(source.AppCnt);
        }
        if (source.WebServiceCnt != null) {
            this.WebServiceCnt = new Long(source.WebServiceCnt);
        }
        if (source.Mounts != null) {
            this.Mounts = new ContainerMount[source.Mounts.length];
            for (int i = 0; i < source.Mounts.length; i++) {
                this.Mounts[i] = new ContainerMount(source.Mounts[i]);
            }
        }
        if (source.Network != null) {
            this.Network = new ContainerNetwork(source.Network);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ImageCreateTime != null) {
            this.ImageCreateTime = new String(source.ImageCreateTime);
        }
        if (source.ImageSize != null) {
            this.ImageSize = new Long(source.ImageSize);
        }
        if (source.HostStatus != null) {
            this.HostStatus = new String(source.HostStatus);
        }
        if (source.NetStatus != null) {
            this.NetStatus = new String(source.NetStatus);
        }
        if (source.NetSubStatus != null) {
            this.NetSubStatus = new String(source.NetSubStatus);
        }
        if (source.IsolateSource != null) {
            this.IsolateSource = new String(source.IsolateSource);
        }
        if (source.IsolateTime != null) {
            this.IsolateTime = new String(source.IsolateTime);
        }
        if (source.NodeID != null) {
            this.NodeID = new String(source.NodeID);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.NodeSubNetID != null) {
            this.NodeSubNetID = new String(source.NodeSubNetID);
        }
        if (source.NodeSubNetName != null) {
            this.NodeSubNetName = new String(source.NodeSubNetName);
        }
        if (source.NodeSubNetCIDR != null) {
            this.NodeSubNetCIDR = new String(source.NodeSubNetCIDR);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.PodIP != null) {
            this.PodIP = new String(source.PodIP);
        }
        if (source.PodStatus != null) {
            this.PodStatus = new String(source.PodStatus);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeUniqueID != null) {
            this.NodeUniqueID = new String(source.NodeUniqueID);
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostID", this.HostID);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RunAs", this.RunAs);
        this.setParamSimple(map, prefix + "Cmd", this.Cmd);
        this.setParamSimple(map, prefix + "CPUUsage", this.CPUUsage);
        this.setParamSimple(map, prefix + "RamUsage", this.RamUsage);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);
        this.setParamSimple(map, prefix + "POD", this.POD);
        this.setParamSimple(map, prefix + "K8sMaster", this.K8sMaster);
        this.setParamSimple(map, prefix + "ProcessCnt", this.ProcessCnt);
        this.setParamSimple(map, prefix + "PortCnt", this.PortCnt);
        this.setParamSimple(map, prefix + "ComponentCnt", this.ComponentCnt);
        this.setParamSimple(map, prefix + "AppCnt", this.AppCnt);
        this.setParamSimple(map, prefix + "WebServiceCnt", this.WebServiceCnt);
        this.setParamArrayObj(map, prefix + "Mounts.", this.Mounts);
        this.setParamObj(map, prefix + "Network.", this.Network);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ImageCreateTime", this.ImageCreateTime);
        this.setParamSimple(map, prefix + "ImageSize", this.ImageSize);
        this.setParamSimple(map, prefix + "HostStatus", this.HostStatus);
        this.setParamSimple(map, prefix + "NetStatus", this.NetStatus);
        this.setParamSimple(map, prefix + "NetSubStatus", this.NetSubStatus);
        this.setParamSimple(map, prefix + "IsolateSource", this.IsolateSource);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);
        this.setParamSimple(map, prefix + "NodeID", this.NodeID);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "NodeSubNetID", this.NodeSubNetID);
        this.setParamSimple(map, prefix + "NodeSubNetName", this.NodeSubNetName);
        this.setParamSimple(map, prefix + "NodeSubNetCIDR", this.NodeSubNetCIDR);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "PodIP", this.PodIP);
        this.setParamSimple(map, prefix + "PodStatus", this.PodStatus);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeUniqueID", this.NodeUniqueID);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

