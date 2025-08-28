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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceEnrichedInfo extends AbstractModel {

    /**
    * 机器ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 机器名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 机器内网IP
    */
    @SerializedName("LanIp")
    @Expose
    private String LanIp;

    /**
    * 机器外网IP
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * 机器所在VPC
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 机器运行状态，枚举值为：
- `Pending`: 准备中
-  `Running`: 运行中
-  `Stopped`: 已停止
-  `Rebooting`: 重启中
-  `Starting`: 启动中
-  `Stopping`: 停止中
-  `Abnormal`: 异常
-  `Unknown`: 未知
-  `Offline`: 离线 
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * 机器可用状态（表示机器上的Agent在线）
    */
    @SerializedName("InstanceAvailableStatus")
    @Expose
    private String InstanceAvailableStatus;

    /**
    * 应用ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 应用名称
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * 应用类型，C表示容器应用，V表示虚拟机应用
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 集群类型，C表示容器集群，V表示虚拟机集群
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 命名空间ID
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 命名空间名称
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 机器所在部署组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 部署组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
     * Get 机器ID 
     * @return InstanceId 机器ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 机器ID
     * @param InstanceId 机器ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 机器名称 
     * @return InstanceName 机器名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 机器名称
     * @param InstanceName 机器名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 机器内网IP 
     * @return LanIp 机器内网IP
     */
    public String getLanIp() {
        return this.LanIp;
    }

    /**
     * Set 机器内网IP
     * @param LanIp 机器内网IP
     */
    public void setLanIp(String LanIp) {
        this.LanIp = LanIp;
    }

    /**
     * Get 机器外网IP 
     * @return WanIp 机器外网IP
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set 机器外网IP
     * @param WanIp 机器外网IP
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get 机器所在VPC 
     * @return VpcId 机器所在VPC
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 机器所在VPC
     * @param VpcId 机器所在VPC
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 机器运行状态，枚举值为：
- `Pending`: 准备中
-  `Running`: 运行中
-  `Stopped`: 已停止
-  `Rebooting`: 重启中
-  `Starting`: 启动中
-  `Stopping`: 停止中
-  `Abnormal`: 异常
-  `Unknown`: 未知
-  `Offline`: 离线  
     * @return InstanceStatus 机器运行状态，枚举值为：
- `Pending`: 准备中
-  `Running`: 运行中
-  `Stopped`: 已停止
-  `Rebooting`: 重启中
-  `Starting`: 启动中
-  `Stopping`: 停止中
-  `Abnormal`: 异常
-  `Unknown`: 未知
-  `Offline`: 离线 
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 机器运行状态，枚举值为：
- `Pending`: 准备中
-  `Running`: 运行中
-  `Stopped`: 已停止
-  `Rebooting`: 重启中
-  `Starting`: 启动中
-  `Stopping`: 停止中
-  `Abnormal`: 异常
-  `Unknown`: 未知
-  `Offline`: 离线 
     * @param InstanceStatus 机器运行状态，枚举值为：
- `Pending`: 准备中
-  `Running`: 运行中
-  `Stopped`: 已停止
-  `Rebooting`: 重启中
-  `Starting`: 启动中
-  `Stopping`: 停止中
-  `Abnormal`: 异常
-  `Unknown`: 未知
-  `Offline`: 离线 
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get 机器可用状态（表示机器上的Agent在线） 
     * @return InstanceAvailableStatus 机器可用状态（表示机器上的Agent在线）
     */
    public String getInstanceAvailableStatus() {
        return this.InstanceAvailableStatus;
    }

    /**
     * Set 机器可用状态（表示机器上的Agent在线）
     * @param InstanceAvailableStatus 机器可用状态（表示机器上的Agent在线）
     */
    public void setInstanceAvailableStatus(String InstanceAvailableStatus) {
        this.InstanceAvailableStatus = InstanceAvailableStatus;
    }

    /**
     * Get 应用ID 
     * @return ApplicationId 应用ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID
     * @param ApplicationId 应用ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 应用名称 
     * @return ApplicationName 应用名称
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set 应用名称
     * @param ApplicationName 应用名称
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get 应用类型，C表示容器应用，V表示虚拟机应用 
     * @return ApplicationType 应用类型，C表示容器应用，V表示虚拟机应用
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set 应用类型，C表示容器应用，V表示虚拟机应用
     * @param ApplicationType 应用类型，C表示容器应用，V表示虚拟机应用
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
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
     * Get 集群类型，C表示容器集群，V表示虚拟机集群 
     * @return ClusterType 集群类型，C表示容器集群，V表示虚拟机集群
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型，C表示容器集群，V表示虚拟机集群
     * @param ClusterType 集群类型，C表示容器集群，V表示虚拟机集群
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 命名空间ID 
     * @return NamespaceId 命名空间ID
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间ID
     * @param NamespaceId 命名空间ID
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 命名空间名称 
     * @return NamespaceName 命名空间名称
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 命名空间名称
     * @param NamespaceName 命名空间名称
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get 机器所在部署组ID 
     * @return GroupId 机器所在部署组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 机器所在部署组ID
     * @param GroupId 机器所在部署组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 部署组名称 
     * @return GroupName 部署组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 部署组名称
     * @param GroupName 部署组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    public InstanceEnrichedInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceEnrichedInfo(InstanceEnrichedInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.LanIp != null) {
            this.LanIp = new String(source.LanIp);
        }
        if (source.WanIp != null) {
            this.WanIp = new String(source.WanIp);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.InstanceAvailableStatus != null) {
            this.InstanceAvailableStatus = new String(source.InstanceAvailableStatus);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new String(source.ApplicationType);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "LanIp", this.LanIp);
        this.setParamSimple(map, prefix + "WanIp", this.WanIp);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "InstanceAvailableStatus", this.InstanceAvailableStatus);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);

    }
}

