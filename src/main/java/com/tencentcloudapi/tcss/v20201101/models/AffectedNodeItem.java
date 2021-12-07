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

public class AffectedNodeItem extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群名字
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 内网ip地址
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private String PrivateIpAddresses;

    /**
    * 节点的角色，Master、Work等
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * k8s版本
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * 运行时组件,docker或者containerd
    */
    @SerializedName("ContainerRuntime")
    @Expose
    private String ContainerRuntime;

    /**
    * 区域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 检查结果的验证信息
    */
    @SerializedName("VerifyInfo")
    @Expose
    private String VerifyInfo;

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
     * Get 集群名字 
     * @return ClusterName 集群名字
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名字
     * @param ClusterName 集群名字
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 内网ip地址 
     * @return PrivateIpAddresses 内网ip地址
     */
    public String getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set 内网ip地址
     * @param PrivateIpAddresses 内网ip地址
     */
    public void setPrivateIpAddresses(String PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Get 节点的角色，Master、Work等 
     * @return InstanceRole 节点的角色，Master、Work等
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set 节点的角色，Master、Work等
     * @param InstanceRole 节点的角色，Master、Work等
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get k8s版本 
     * @return ClusterVersion k8s版本
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set k8s版本
     * @param ClusterVersion k8s版本
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get 运行时组件,docker或者containerd 
     * @return ContainerRuntime 运行时组件,docker或者containerd
     */
    public String getContainerRuntime() {
        return this.ContainerRuntime;
    }

    /**
     * Set 运行时组件,docker或者containerd
     * @param ContainerRuntime 运行时组件,docker或者containerd
     */
    public void setContainerRuntime(String ContainerRuntime) {
        this.ContainerRuntime = ContainerRuntime;
    }

    /**
     * Get 区域 
     * @return Region 区域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 区域
     * @param Region 区域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 检查结果的验证信息 
     * @return VerifyInfo 检查结果的验证信息
     */
    public String getVerifyInfo() {
        return this.VerifyInfo;
    }

    /**
     * Set 检查结果的验证信息
     * @param VerifyInfo 检查结果的验证信息
     */
    public void setVerifyInfo(String VerifyInfo) {
        this.VerifyInfo = VerifyInfo;
    }

    public AffectedNodeItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AffectedNodeItem(AffectedNodeItem source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PrivateIpAddresses != null) {
            this.PrivateIpAddresses = new String(source.PrivateIpAddresses);
        }
        if (source.InstanceRole != null) {
            this.InstanceRole = new String(source.InstanceRole);
        }
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
        }
        if (source.ContainerRuntime != null) {
            this.ContainerRuntime = new String(source.ContainerRuntime);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.VerifyInfo != null) {
            this.VerifyInfo = new String(source.VerifyInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PrivateIpAddresses", this.PrivateIpAddresses);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);
        this.setParamSimple(map, prefix + "ContainerRuntime", this.ContainerRuntime);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "VerifyInfo", this.VerifyInfo);

    }
}

