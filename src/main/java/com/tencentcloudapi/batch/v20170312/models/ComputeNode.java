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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComputeNode extends AbstractModel{

    /**
    * 计算节点ID
    */
    @SerializedName("ComputeNodeId")
    @Expose
    private String ComputeNodeId;

    /**
    * 计算节点实例ID，对于CVM场景，即为CVM的InstanceId
    */
    @SerializedName("ComputeNodeInstanceId")
    @Expose
    private String ComputeNodeInstanceId;

    /**
    * 计算节点状态
    */
    @SerializedName("ComputeNodeState")
    @Expose
    private String ComputeNodeState;

    /**
    * CPU核数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存容量，单位GiB
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * 资源创建完成时间
    */
    @SerializedName("ResourceCreatedTime")
    @Expose
    private String ResourceCreatedTime;

    /**
    * 计算节点运行  TaskInstance 可用容量。0表示计算节点忙碌。
    */
    @SerializedName("TaskInstanceNumAvailable")
    @Expose
    private Long TaskInstanceNumAvailable;

    /**
    * Batch Agent 版本
    */
    @SerializedName("AgentVersion")
    @Expose
    private String AgentVersion;

    /**
    * 实例内网IP
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private String [] PrivateIpAddresses;

    /**
    * 实例公网IP
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String [] PublicIpAddresses;

    /**
    * 计算环境资源类型，当前为CVM和CPM（黑石）
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 计算环境资源来源。<br>BATCH_CREATED：由批量计算创建的实例资源。<br>
USER_ATTACHED：用户添加到计算环境中的实例资源。
    */
    @SerializedName("ResourceOrigin")
    @Expose
    private String ResourceOrigin;

    /**
     * Get 计算节点ID 
     * @return ComputeNodeId 计算节点ID
     */
    public String getComputeNodeId() {
        return this.ComputeNodeId;
    }

    /**
     * Set 计算节点ID
     * @param ComputeNodeId 计算节点ID
     */
    public void setComputeNodeId(String ComputeNodeId) {
        this.ComputeNodeId = ComputeNodeId;
    }

    /**
     * Get 计算节点实例ID，对于CVM场景，即为CVM的InstanceId 
     * @return ComputeNodeInstanceId 计算节点实例ID，对于CVM场景，即为CVM的InstanceId
     */
    public String getComputeNodeInstanceId() {
        return this.ComputeNodeInstanceId;
    }

    /**
     * Set 计算节点实例ID，对于CVM场景，即为CVM的InstanceId
     * @param ComputeNodeInstanceId 计算节点实例ID，对于CVM场景，即为CVM的InstanceId
     */
    public void setComputeNodeInstanceId(String ComputeNodeInstanceId) {
        this.ComputeNodeInstanceId = ComputeNodeInstanceId;
    }

    /**
     * Get 计算节点状态 
     * @return ComputeNodeState 计算节点状态
     */
    public String getComputeNodeState() {
        return this.ComputeNodeState;
    }

    /**
     * Set 计算节点状态
     * @param ComputeNodeState 计算节点状态
     */
    public void setComputeNodeState(String ComputeNodeState) {
        this.ComputeNodeState = ComputeNodeState;
    }

    /**
     * Get CPU核数 
     * @return Cpu CPU核数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU核数
     * @param Cpu CPU核数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存容量，单位GiB 
     * @return Mem 内存容量，单位GiB
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set 内存容量，单位GiB
     * @param Mem 内存容量，单位GiB
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get 资源创建完成时间 
     * @return ResourceCreatedTime 资源创建完成时间
     */
    public String getResourceCreatedTime() {
        return this.ResourceCreatedTime;
    }

    /**
     * Set 资源创建完成时间
     * @param ResourceCreatedTime 资源创建完成时间
     */
    public void setResourceCreatedTime(String ResourceCreatedTime) {
        this.ResourceCreatedTime = ResourceCreatedTime;
    }

    /**
     * Get 计算节点运行  TaskInstance 可用容量。0表示计算节点忙碌。 
     * @return TaskInstanceNumAvailable 计算节点运行  TaskInstance 可用容量。0表示计算节点忙碌。
     */
    public Long getTaskInstanceNumAvailable() {
        return this.TaskInstanceNumAvailable;
    }

    /**
     * Set 计算节点运行  TaskInstance 可用容量。0表示计算节点忙碌。
     * @param TaskInstanceNumAvailable 计算节点运行  TaskInstance 可用容量。0表示计算节点忙碌。
     */
    public void setTaskInstanceNumAvailable(Long TaskInstanceNumAvailable) {
        this.TaskInstanceNumAvailable = TaskInstanceNumAvailable;
    }

    /**
     * Get Batch Agent 版本 
     * @return AgentVersion Batch Agent 版本
     */
    public String getAgentVersion() {
        return this.AgentVersion;
    }

    /**
     * Set Batch Agent 版本
     * @param AgentVersion Batch Agent 版本
     */
    public void setAgentVersion(String AgentVersion) {
        this.AgentVersion = AgentVersion;
    }

    /**
     * Get 实例内网IP 
     * @return PrivateIpAddresses 实例内网IP
     */
    public String [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set 实例内网IP
     * @param PrivateIpAddresses 实例内网IP
     */
    public void setPrivateIpAddresses(String [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Get 实例公网IP 
     * @return PublicIpAddresses 实例公网IP
     */
    public String [] getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set 实例公网IP
     * @param PublicIpAddresses 实例公网IP
     */
    public void setPublicIpAddresses(String [] PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * Get 计算环境资源类型，当前为CVM和CPM（黑石） 
     * @return ResourceType 计算环境资源类型，当前为CVM和CPM（黑石）
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 计算环境资源类型，当前为CVM和CPM（黑石）
     * @param ResourceType 计算环境资源类型，当前为CVM和CPM（黑石）
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 计算环境资源来源。<br>BATCH_CREATED：由批量计算创建的实例资源。<br>
USER_ATTACHED：用户添加到计算环境中的实例资源。 
     * @return ResourceOrigin 计算环境资源来源。<br>BATCH_CREATED：由批量计算创建的实例资源。<br>
USER_ATTACHED：用户添加到计算环境中的实例资源。
     */
    public String getResourceOrigin() {
        return this.ResourceOrigin;
    }

    /**
     * Set 计算环境资源来源。<br>BATCH_CREATED：由批量计算创建的实例资源。<br>
USER_ATTACHED：用户添加到计算环境中的实例资源。
     * @param ResourceOrigin 计算环境资源来源。<br>BATCH_CREATED：由批量计算创建的实例资源。<br>
USER_ATTACHED：用户添加到计算环境中的实例资源。
     */
    public void setResourceOrigin(String ResourceOrigin) {
        this.ResourceOrigin = ResourceOrigin;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComputeNodeId", this.ComputeNodeId);
        this.setParamSimple(map, prefix + "ComputeNodeInstanceId", this.ComputeNodeInstanceId);
        this.setParamSimple(map, prefix + "ComputeNodeState", this.ComputeNodeState);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "ResourceCreatedTime", this.ResourceCreatedTime);
        this.setParamSimple(map, prefix + "TaskInstanceNumAvailable", this.TaskInstanceNumAvailable);
        this.setParamSimple(map, prefix + "AgentVersion", this.AgentVersion);
        this.setParamArraySimple(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);
        this.setParamArraySimple(map, prefix + "PublicIpAddresses.", this.PublicIpAddresses);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceOrigin", this.ResourceOrigin);

    }
}

