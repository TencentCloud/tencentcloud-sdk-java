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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Instance extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 节点角色, MASTER, WORKER, ETCD, MASTER_ETCD,ALL, 默认为WORKER
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * 实例异常(或者处于初始化中)的原因
    */
    @SerializedName("FailedReason")
    @Expose
    private String FailedReason;

    /**
    * 实例的状态（running 运行中，initializing 初始化中，failed 异常）
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * 实例是否封锁状态
    */
    @SerializedName("DrainStatus")
    @Expose
    private String DrainStatus;

    /**
    * 节点配置
    */
    @SerializedName("InstanceAdvancedSettings")
    @Expose
    private InstanceAdvancedSettings InstanceAdvancedSettings;

    /**
    * 添加时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 节点内网IP
    */
    @SerializedName("LanIP")
    @Expose
    private String LanIP;

    /**
    * 资源池ID
    */
    @SerializedName("NodePoolId")
    @Expose
    private String NodePoolId;

    /**
    * 自动伸缩组ID
    */
    @SerializedName("AutoscalingGroupId")
    @Expose
    private String AutoscalingGroupId;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 节点角色, MASTER, WORKER, ETCD, MASTER_ETCD,ALL, 默认为WORKER 
     * @return InstanceRole 节点角色, MASTER, WORKER, ETCD, MASTER_ETCD,ALL, 默认为WORKER
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set 节点角色, MASTER, WORKER, ETCD, MASTER_ETCD,ALL, 默认为WORKER
     * @param InstanceRole 节点角色, MASTER, WORKER, ETCD, MASTER_ETCD,ALL, 默认为WORKER
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get 实例异常(或者处于初始化中)的原因 
     * @return FailedReason 实例异常(或者处于初始化中)的原因
     */
    public String getFailedReason() {
        return this.FailedReason;
    }

    /**
     * Set 实例异常(或者处于初始化中)的原因
     * @param FailedReason 实例异常(或者处于初始化中)的原因
     */
    public void setFailedReason(String FailedReason) {
        this.FailedReason = FailedReason;
    }

    /**
     * Get 实例的状态（running 运行中，initializing 初始化中，failed 异常） 
     * @return InstanceState 实例的状态（running 运行中，initializing 初始化中，failed 异常）
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set 实例的状态（running 运行中，initializing 初始化中，failed 异常）
     * @param InstanceState 实例的状态（running 运行中，initializing 初始化中，failed 异常）
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get 实例是否封锁状态 
     * @return DrainStatus 实例是否封锁状态
     */
    public String getDrainStatus() {
        return this.DrainStatus;
    }

    /**
     * Set 实例是否封锁状态
     * @param DrainStatus 实例是否封锁状态
     */
    public void setDrainStatus(String DrainStatus) {
        this.DrainStatus = DrainStatus;
    }

    /**
     * Get 节点配置 
     * @return InstanceAdvancedSettings 节点配置
     */
    public InstanceAdvancedSettings getInstanceAdvancedSettings() {
        return this.InstanceAdvancedSettings;
    }

    /**
     * Set 节点配置
     * @param InstanceAdvancedSettings 节点配置
     */
    public void setInstanceAdvancedSettings(InstanceAdvancedSettings InstanceAdvancedSettings) {
        this.InstanceAdvancedSettings = InstanceAdvancedSettings;
    }

    /**
     * Get 添加时间 
     * @return CreatedTime 添加时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 添加时间
     * @param CreatedTime 添加时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 节点内网IP 
     * @return LanIP 节点内网IP
     */
    public String getLanIP() {
        return this.LanIP;
    }

    /**
     * Set 节点内网IP
     * @param LanIP 节点内网IP
     */
    public void setLanIP(String LanIP) {
        this.LanIP = LanIP;
    }

    /**
     * Get 资源池ID 
     * @return NodePoolId 资源池ID
     */
    public String getNodePoolId() {
        return this.NodePoolId;
    }

    /**
     * Set 资源池ID
     * @param NodePoolId 资源池ID
     */
    public void setNodePoolId(String NodePoolId) {
        this.NodePoolId = NodePoolId;
    }

    /**
     * Get 自动伸缩组ID 
     * @return AutoscalingGroupId 自动伸缩组ID
     */
    public String getAutoscalingGroupId() {
        return this.AutoscalingGroupId;
    }

    /**
     * Set 自动伸缩组ID
     * @param AutoscalingGroupId 自动伸缩组ID
     */
    public void setAutoscalingGroupId(String AutoscalingGroupId) {
        this.AutoscalingGroupId = AutoscalingGroupId;
    }

    public Instance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Instance(Instance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceRole != null) {
            this.InstanceRole = new String(source.InstanceRole);
        }
        if (source.FailedReason != null) {
            this.FailedReason = new String(source.FailedReason);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.DrainStatus != null) {
            this.DrainStatus = new String(source.DrainStatus);
        }
        if (source.InstanceAdvancedSettings != null) {
            this.InstanceAdvancedSettings = new InstanceAdvancedSettings(source.InstanceAdvancedSettings);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.LanIP != null) {
            this.LanIP = new String(source.LanIP);
        }
        if (source.NodePoolId != null) {
            this.NodePoolId = new String(source.NodePoolId);
        }
        if (source.AutoscalingGroupId != null) {
            this.AutoscalingGroupId = new String(source.AutoscalingGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "FailedReason", this.FailedReason);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "DrainStatus", this.DrainStatus);
        this.setParamObj(map, prefix + "InstanceAdvancedSettings.", this.InstanceAdvancedSettings);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "LanIP", this.LanIP);
        this.setParamSimple(map, prefix + "NodePoolId", this.NodePoolId);
        this.setParamSimple(map, prefix + "AutoscalingGroupId", this.AutoscalingGroupId);

    }
}

