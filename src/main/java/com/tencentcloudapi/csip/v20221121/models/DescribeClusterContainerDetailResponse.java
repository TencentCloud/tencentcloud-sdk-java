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

public class DescribeClusterContainerDetailResponse extends AbstractModel {

    /**
    * <p>主账号AppID</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>容器ID</p>
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * <p>容器启动CMD</p>
    */
    @SerializedName("Cmd")
    @Expose
    private String Cmd;

    /**
    * <p>容器创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>运行状态</p>
    */
    @SerializedName("RunStatus")
    @Expose
    private String RunStatus;

    /**
    * <p>隔离状态</p>
    */
    @SerializedName("IsolateStatus")
    @Expose
    private String IsolateStatus;

    /**
    * <p>严重风险事件数</p>
    */
    @SerializedName("RiskEventCriticalCount")
    @Expose
    private Long RiskEventCriticalCount;

    /**
    * <p>高风险事件数</p>
    */
    @SerializedName("RiskEventHighCount")
    @Expose
    private Long RiskEventHighCount;

    /**
    * <p>中风险事件数</p>
    */
    @SerializedName("RiskEventMiddleCount")
    @Expose
    private Long RiskEventMiddleCount;

    /**
    * <p>低风险事件数</p>
    */
    @SerializedName("RiskEventLowCount")
    @Expose
    private Long RiskEventLowCount;

    /**
    * <p>镜像名称</p>
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * <p>镜像ID</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>镜像大小</p>
    */
    @SerializedName("ImageSize")
    @Expose
    private String ImageSize;

    /**
    * <p>镜像创建时间</p>
    */
    @SerializedName("ImageCreateTime")
    @Expose
    private String ImageCreateTime;

    /**
    * <p>节点名称</p>
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * <p>节点内网IP</p>
    */
    @SerializedName("NodeInternalIP")
    @Expose
    private String NodeInternalIP;

    /**
    * <p>节点运行状态</p>
    */
    @SerializedName("NodeRunStatus")
    @Expose
    private String NodeRunStatus;

    /**
    * <p>挂载信息列表</p>
    */
    @SerializedName("Mounts")
    @Expose
    private ContainerMountItem [] Mounts;

    /**
    * <p>网络名称</p>
    */
    @SerializedName("NetworkName")
    @Expose
    private String NetworkName;

    /**
    * <p>网络模式</p>
    */
    @SerializedName("NetworkMode")
    @Expose
    private String NetworkMode;

    /**
    * <p>网络ID</p>
    */
    @SerializedName("NetworkId")
    @Expose
    private String NetworkId;

    /**
    * <p>端点ID</p>
    */
    @SerializedName("EndpointId")
    @Expose
    private String EndpointId;

    /**
    * <p>网关地址</p>
    */
    @SerializedName("Gateway")
    @Expose
    private String Gateway;

    /**
    * <p>IPv4地址</p>
    */
    @SerializedName("IPv4")
    @Expose
    private String IPv4;

    /**
    * <p>IPv6地址</p>
    */
    @SerializedName("IPv6")
    @Expose
    private String IPv6;

    /**
    * <p>MAC地址</p>
    */
    @SerializedName("MAC")
    @Expose
    private String MAC;

    /**
    * <p>容器名称</p>
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * <p>节点实例ID</p>
    */
    @SerializedName("NodeInstanceId")
    @Expose
    private String NodeInstanceId;

    /**
    * <p>容器关联节点的节点类型</p>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>容器关联节点的节点唯一ID</p>
    */
    @SerializedName("NodeUniqueID")
    @Expose
    private String NodeUniqueID;

    /**
    * <p>容器关联集群的集群ca证书md5值，集群的唯一标识</p>
    */
    @SerializedName("ClusterCaMD5")
    @Expose
    private String ClusterCaMD5;

    /**
    * <p>容器镜像能否关联到镜像仓库中的记录</p>
    */
    @SerializedName("EnableLinkImage")
    @Expose
    private Boolean EnableLinkImage;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>主账号AppID</p> 
     * @return AppID <p>主账号AppID</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>主账号AppID</p>
     * @param AppID <p>主账号AppID</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>容器ID</p> 
     * @return ContainerId <p>容器ID</p>
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set <p>容器ID</p>
     * @param ContainerId <p>容器ID</p>
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get <p>容器启动CMD</p> 
     * @return Cmd <p>容器启动CMD</p>
     */
    public String getCmd() {
        return this.Cmd;
    }

    /**
     * Set <p>容器启动CMD</p>
     * @param Cmd <p>容器启动CMD</p>
     */
    public void setCmd(String Cmd) {
        this.Cmd = Cmd;
    }

    /**
     * Get <p>容器创建时间</p> 
     * @return CreateTime <p>容器创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>容器创建时间</p>
     * @param CreateTime <p>容器创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>运行状态</p> 
     * @return RunStatus <p>运行状态</p>
     */
    public String getRunStatus() {
        return this.RunStatus;
    }

    /**
     * Set <p>运行状态</p>
     * @param RunStatus <p>运行状态</p>
     */
    public void setRunStatus(String RunStatus) {
        this.RunStatus = RunStatus;
    }

    /**
     * Get <p>隔离状态</p> 
     * @return IsolateStatus <p>隔离状态</p>
     */
    public String getIsolateStatus() {
        return this.IsolateStatus;
    }

    /**
     * Set <p>隔离状态</p>
     * @param IsolateStatus <p>隔离状态</p>
     */
    public void setIsolateStatus(String IsolateStatus) {
        this.IsolateStatus = IsolateStatus;
    }

    /**
     * Get <p>严重风险事件数</p> 
     * @return RiskEventCriticalCount <p>严重风险事件数</p>
     * @deprecated
     */
    @Deprecated
    public Long getRiskEventCriticalCount() {
        return this.RiskEventCriticalCount;
    }

    /**
     * Set <p>严重风险事件数</p>
     * @param RiskEventCriticalCount <p>严重风险事件数</p>
     * @deprecated
     */
    @Deprecated
    public void setRiskEventCriticalCount(Long RiskEventCriticalCount) {
        this.RiskEventCriticalCount = RiskEventCriticalCount;
    }

    /**
     * Get <p>高风险事件数</p> 
     * @return RiskEventHighCount <p>高风险事件数</p>
     * @deprecated
     */
    @Deprecated
    public Long getRiskEventHighCount() {
        return this.RiskEventHighCount;
    }

    /**
     * Set <p>高风险事件数</p>
     * @param RiskEventHighCount <p>高风险事件数</p>
     * @deprecated
     */
    @Deprecated
    public void setRiskEventHighCount(Long RiskEventHighCount) {
        this.RiskEventHighCount = RiskEventHighCount;
    }

    /**
     * Get <p>中风险事件数</p> 
     * @return RiskEventMiddleCount <p>中风险事件数</p>
     * @deprecated
     */
    @Deprecated
    public Long getRiskEventMiddleCount() {
        return this.RiskEventMiddleCount;
    }

    /**
     * Set <p>中风险事件数</p>
     * @param RiskEventMiddleCount <p>中风险事件数</p>
     * @deprecated
     */
    @Deprecated
    public void setRiskEventMiddleCount(Long RiskEventMiddleCount) {
        this.RiskEventMiddleCount = RiskEventMiddleCount;
    }

    /**
     * Get <p>低风险事件数</p> 
     * @return RiskEventLowCount <p>低风险事件数</p>
     * @deprecated
     */
    @Deprecated
    public Long getRiskEventLowCount() {
        return this.RiskEventLowCount;
    }

    /**
     * Set <p>低风险事件数</p>
     * @param RiskEventLowCount <p>低风险事件数</p>
     * @deprecated
     */
    @Deprecated
    public void setRiskEventLowCount(Long RiskEventLowCount) {
        this.RiskEventLowCount = RiskEventLowCount;
    }

    /**
     * Get <p>镜像名称</p> 
     * @return ImageName <p>镜像名称</p>
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set <p>镜像名称</p>
     * @param ImageName <p>镜像名称</p>
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get <p>镜像ID</p> 
     * @return ImageId <p>镜像ID</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>镜像ID</p>
     * @param ImageId <p>镜像ID</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>镜像大小</p> 
     * @return ImageSize <p>镜像大小</p>
     */
    public String getImageSize() {
        return this.ImageSize;
    }

    /**
     * Set <p>镜像大小</p>
     * @param ImageSize <p>镜像大小</p>
     */
    public void setImageSize(String ImageSize) {
        this.ImageSize = ImageSize;
    }

    /**
     * Get <p>镜像创建时间</p> 
     * @return ImageCreateTime <p>镜像创建时间</p>
     */
    public String getImageCreateTime() {
        return this.ImageCreateTime;
    }

    /**
     * Set <p>镜像创建时间</p>
     * @param ImageCreateTime <p>镜像创建时间</p>
     */
    public void setImageCreateTime(String ImageCreateTime) {
        this.ImageCreateTime = ImageCreateTime;
    }

    /**
     * Get <p>节点名称</p> 
     * @return NodeName <p>节点名称</p>
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set <p>节点名称</p>
     * @param NodeName <p>节点名称</p>
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get <p>节点内网IP</p> 
     * @return NodeInternalIP <p>节点内网IP</p>
     */
    public String getNodeInternalIP() {
        return this.NodeInternalIP;
    }

    /**
     * Set <p>节点内网IP</p>
     * @param NodeInternalIP <p>节点内网IP</p>
     */
    public void setNodeInternalIP(String NodeInternalIP) {
        this.NodeInternalIP = NodeInternalIP;
    }

    /**
     * Get <p>节点运行状态</p> 
     * @return NodeRunStatus <p>节点运行状态</p>
     */
    public String getNodeRunStatus() {
        return this.NodeRunStatus;
    }

    /**
     * Set <p>节点运行状态</p>
     * @param NodeRunStatus <p>节点运行状态</p>
     */
    public void setNodeRunStatus(String NodeRunStatus) {
        this.NodeRunStatus = NodeRunStatus;
    }

    /**
     * Get <p>挂载信息列表</p> 
     * @return Mounts <p>挂载信息列表</p>
     */
    public ContainerMountItem [] getMounts() {
        return this.Mounts;
    }

    /**
     * Set <p>挂载信息列表</p>
     * @param Mounts <p>挂载信息列表</p>
     */
    public void setMounts(ContainerMountItem [] Mounts) {
        this.Mounts = Mounts;
    }

    /**
     * Get <p>网络名称</p> 
     * @return NetworkName <p>网络名称</p>
     */
    public String getNetworkName() {
        return this.NetworkName;
    }

    /**
     * Set <p>网络名称</p>
     * @param NetworkName <p>网络名称</p>
     */
    public void setNetworkName(String NetworkName) {
        this.NetworkName = NetworkName;
    }

    /**
     * Get <p>网络模式</p> 
     * @return NetworkMode <p>网络模式</p>
     */
    public String getNetworkMode() {
        return this.NetworkMode;
    }

    /**
     * Set <p>网络模式</p>
     * @param NetworkMode <p>网络模式</p>
     */
    public void setNetworkMode(String NetworkMode) {
        this.NetworkMode = NetworkMode;
    }

    /**
     * Get <p>网络ID</p> 
     * @return NetworkId <p>网络ID</p>
     */
    public String getNetworkId() {
        return this.NetworkId;
    }

    /**
     * Set <p>网络ID</p>
     * @param NetworkId <p>网络ID</p>
     */
    public void setNetworkId(String NetworkId) {
        this.NetworkId = NetworkId;
    }

    /**
     * Get <p>端点ID</p> 
     * @return EndpointId <p>端点ID</p>
     */
    public String getEndpointId() {
        return this.EndpointId;
    }

    /**
     * Set <p>端点ID</p>
     * @param EndpointId <p>端点ID</p>
     */
    public void setEndpointId(String EndpointId) {
        this.EndpointId = EndpointId;
    }

    /**
     * Get <p>网关地址</p> 
     * @return Gateway <p>网关地址</p>
     */
    public String getGateway() {
        return this.Gateway;
    }

    /**
     * Set <p>网关地址</p>
     * @param Gateway <p>网关地址</p>
     */
    public void setGateway(String Gateway) {
        this.Gateway = Gateway;
    }

    /**
     * Get <p>IPv4地址</p> 
     * @return IPv4 <p>IPv4地址</p>
     */
    public String getIPv4() {
        return this.IPv4;
    }

    /**
     * Set <p>IPv4地址</p>
     * @param IPv4 <p>IPv4地址</p>
     */
    public void setIPv4(String IPv4) {
        this.IPv4 = IPv4;
    }

    /**
     * Get <p>IPv6地址</p> 
     * @return IPv6 <p>IPv6地址</p>
     */
    public String getIPv6() {
        return this.IPv6;
    }

    /**
     * Set <p>IPv6地址</p>
     * @param IPv6 <p>IPv6地址</p>
     */
    public void setIPv6(String IPv6) {
        this.IPv6 = IPv6;
    }

    /**
     * Get <p>MAC地址</p> 
     * @return MAC <p>MAC地址</p>
     */
    public String getMAC() {
        return this.MAC;
    }

    /**
     * Set <p>MAC地址</p>
     * @param MAC <p>MAC地址</p>
     */
    public void setMAC(String MAC) {
        this.MAC = MAC;
    }

    /**
     * Get <p>容器名称</p> 
     * @return ContainerName <p>容器名称</p>
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set <p>容器名称</p>
     * @param ContainerName <p>容器名称</p>
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get <p>节点实例ID</p> 
     * @return NodeInstanceId <p>节点实例ID</p>
     */
    public String getNodeInstanceId() {
        return this.NodeInstanceId;
    }

    /**
     * Set <p>节点实例ID</p>
     * @param NodeInstanceId <p>节点实例ID</p>
     */
    public void setNodeInstanceId(String NodeInstanceId) {
        this.NodeInstanceId = NodeInstanceId;
    }

    /**
     * Get <p>容器关联节点的节点类型</p> 
     * @return NodeType <p>容器关联节点的节点类型</p>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>容器关联节点的节点类型</p>
     * @param NodeType <p>容器关联节点的节点类型</p>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>容器关联节点的节点唯一ID</p> 
     * @return NodeUniqueID <p>容器关联节点的节点唯一ID</p>
     */
    public String getNodeUniqueID() {
        return this.NodeUniqueID;
    }

    /**
     * Set <p>容器关联节点的节点唯一ID</p>
     * @param NodeUniqueID <p>容器关联节点的节点唯一ID</p>
     */
    public void setNodeUniqueID(String NodeUniqueID) {
        this.NodeUniqueID = NodeUniqueID;
    }

    /**
     * Get <p>容器关联集群的集群ca证书md5值，集群的唯一标识</p> 
     * @return ClusterCaMD5 <p>容器关联集群的集群ca证书md5值，集群的唯一标识</p>
     */
    public String getClusterCaMD5() {
        return this.ClusterCaMD5;
    }

    /**
     * Set <p>容器关联集群的集群ca证书md5值，集群的唯一标识</p>
     * @param ClusterCaMD5 <p>容器关联集群的集群ca证书md5值，集群的唯一标识</p>
     */
    public void setClusterCaMD5(String ClusterCaMD5) {
        this.ClusterCaMD5 = ClusterCaMD5;
    }

    /**
     * Get <p>容器镜像能否关联到镜像仓库中的记录</p> 
     * @return EnableLinkImage <p>容器镜像能否关联到镜像仓库中的记录</p>
     */
    public Boolean getEnableLinkImage() {
        return this.EnableLinkImage;
    }

    /**
     * Set <p>容器镜像能否关联到镜像仓库中的记录</p>
     * @param EnableLinkImage <p>容器镜像能否关联到镜像仓库中的记录</p>
     */
    public void setEnableLinkImage(Boolean EnableLinkImage) {
        this.EnableLinkImage = EnableLinkImage;
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

    public DescribeClusterContainerDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterContainerDetailResponse(DescribeClusterContainerDetailResponse source) {
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.Cmd != null) {
            this.Cmd = new String(source.Cmd);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RunStatus != null) {
            this.RunStatus = new String(source.RunStatus);
        }
        if (source.IsolateStatus != null) {
            this.IsolateStatus = new String(source.IsolateStatus);
        }
        if (source.RiskEventCriticalCount != null) {
            this.RiskEventCriticalCount = new Long(source.RiskEventCriticalCount);
        }
        if (source.RiskEventHighCount != null) {
            this.RiskEventHighCount = new Long(source.RiskEventHighCount);
        }
        if (source.RiskEventMiddleCount != null) {
            this.RiskEventMiddleCount = new Long(source.RiskEventMiddleCount);
        }
        if (source.RiskEventLowCount != null) {
            this.RiskEventLowCount = new Long(source.RiskEventLowCount);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ImageSize != null) {
            this.ImageSize = new String(source.ImageSize);
        }
        if (source.ImageCreateTime != null) {
            this.ImageCreateTime = new String(source.ImageCreateTime);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.NodeInternalIP != null) {
            this.NodeInternalIP = new String(source.NodeInternalIP);
        }
        if (source.NodeRunStatus != null) {
            this.NodeRunStatus = new String(source.NodeRunStatus);
        }
        if (source.Mounts != null) {
            this.Mounts = new ContainerMountItem[source.Mounts.length];
            for (int i = 0; i < source.Mounts.length; i++) {
                this.Mounts[i] = new ContainerMountItem(source.Mounts[i]);
            }
        }
        if (source.NetworkName != null) {
            this.NetworkName = new String(source.NetworkName);
        }
        if (source.NetworkMode != null) {
            this.NetworkMode = new String(source.NetworkMode);
        }
        if (source.NetworkId != null) {
            this.NetworkId = new String(source.NetworkId);
        }
        if (source.EndpointId != null) {
            this.EndpointId = new String(source.EndpointId);
        }
        if (source.Gateway != null) {
            this.Gateway = new String(source.Gateway);
        }
        if (source.IPv4 != null) {
            this.IPv4 = new String(source.IPv4);
        }
        if (source.IPv6 != null) {
            this.IPv6 = new String(source.IPv6);
        }
        if (source.MAC != null) {
            this.MAC = new String(source.MAC);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.NodeInstanceId != null) {
            this.NodeInstanceId = new String(source.NodeInstanceId);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeUniqueID != null) {
            this.NodeUniqueID = new String(source.NodeUniqueID);
        }
        if (source.ClusterCaMD5 != null) {
            this.ClusterCaMD5 = new String(source.ClusterCaMD5);
        }
        if (source.EnableLinkImage != null) {
            this.EnableLinkImage = new Boolean(source.EnableLinkImage);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "Cmd", this.Cmd);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RunStatus", this.RunStatus);
        this.setParamSimple(map, prefix + "IsolateStatus", this.IsolateStatus);
        this.setParamSimple(map, prefix + "RiskEventCriticalCount", this.RiskEventCriticalCount);
        this.setParamSimple(map, prefix + "RiskEventHighCount", this.RiskEventHighCount);
        this.setParamSimple(map, prefix + "RiskEventMiddleCount", this.RiskEventMiddleCount);
        this.setParamSimple(map, prefix + "RiskEventLowCount", this.RiskEventLowCount);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageSize", this.ImageSize);
        this.setParamSimple(map, prefix + "ImageCreateTime", this.ImageCreateTime);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "NodeInternalIP", this.NodeInternalIP);
        this.setParamSimple(map, prefix + "NodeRunStatus", this.NodeRunStatus);
        this.setParamArrayObj(map, prefix + "Mounts.", this.Mounts);
        this.setParamSimple(map, prefix + "NetworkName", this.NetworkName);
        this.setParamSimple(map, prefix + "NetworkMode", this.NetworkMode);
        this.setParamSimple(map, prefix + "NetworkId", this.NetworkId);
        this.setParamSimple(map, prefix + "EndpointId", this.EndpointId);
        this.setParamSimple(map, prefix + "Gateway", this.Gateway);
        this.setParamSimple(map, prefix + "IPv4", this.IPv4);
        this.setParamSimple(map, prefix + "IPv6", this.IPv6);
        this.setParamSimple(map, prefix + "MAC", this.MAC);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "NodeInstanceId", this.NodeInstanceId);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeUniqueID", this.NodeUniqueID);
        this.setParamSimple(map, prefix + "ClusterCaMD5", this.ClusterCaMD5);
        this.setParamSimple(map, prefix + "EnableLinkImage", this.EnableLinkImage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

