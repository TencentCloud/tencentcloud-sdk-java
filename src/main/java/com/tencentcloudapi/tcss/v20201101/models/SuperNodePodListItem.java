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

public class SuperNodePodListItem extends AbstractModel {

    /**
    * pod名称
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * podIP
    */
    @SerializedName("PodIP")
    @Expose
    private String PodIP;

    /**
    * 节点唯一id
    */
    @SerializedName("NodeUniqueID")
    @Expose
    private String NodeUniqueID;

    /**
    * 运行状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * cpu需求核数
    */
    @SerializedName("CpuRequest")
    @Expose
    private Long CpuRequest;

    /**
    * cpu限制核数
    */
    @SerializedName("CpuLimit")
    @Expose
    private Long CpuLimit;

    /**
    * 内存需求大小
    */
    @SerializedName("MemRequest")
    @Expose
    private Long MemRequest;

    /**
    * 内存限制大小
    */
    @SerializedName("MemLimit")
    @Expose
    private Long MemLimit;

    /**
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 工作负载名称
    */
    @SerializedName("DeploymentName")
    @Expose
    private String DeploymentName;

    /**
    * 工作负载id
    */
    @SerializedName("DeploymentID")
    @Expose
    private String DeploymentID;

    /**
    * 启动时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 关联容器个数
    */
    @SerializedName("RelateContainerCount")
    @Expose
    private Long RelateContainerCount;

    /**
    * 运行时间
    */
    @SerializedName("RunningTime")
    @Expose
    private String RunningTime;

    /**
    * PodUid
    */
    @SerializedName("PodUid")
    @Expose
    private String PodUid;

    /**
    * 计费核数
    */
    @SerializedName("ChargeCoresCnt")
    @Expose
    private Long ChargeCoresCnt;

    /**
    * 防护状态
    */
    @SerializedName("DefendStatus")
    @Expose
    private String DefendStatus;

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
     * Get podIP 
     * @return PodIP podIP
     */
    public String getPodIP() {
        return this.PodIP;
    }

    /**
     * Set podIP
     * @param PodIP podIP
     */
    public void setPodIP(String PodIP) {
        this.PodIP = PodIP;
    }

    /**
     * Get 节点唯一id 
     * @return NodeUniqueID 节点唯一id
     */
    public String getNodeUniqueID() {
        return this.NodeUniqueID;
    }

    /**
     * Set 节点唯一id
     * @param NodeUniqueID 节点唯一id
     */
    public void setNodeUniqueID(String NodeUniqueID) {
        this.NodeUniqueID = NodeUniqueID;
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
     * Get cpu需求核数 
     * @return CpuRequest cpu需求核数
     */
    public Long getCpuRequest() {
        return this.CpuRequest;
    }

    /**
     * Set cpu需求核数
     * @param CpuRequest cpu需求核数
     */
    public void setCpuRequest(Long CpuRequest) {
        this.CpuRequest = CpuRequest;
    }

    /**
     * Get cpu限制核数 
     * @return CpuLimit cpu限制核数
     */
    public Long getCpuLimit() {
        return this.CpuLimit;
    }

    /**
     * Set cpu限制核数
     * @param CpuLimit cpu限制核数
     */
    public void setCpuLimit(Long CpuLimit) {
        this.CpuLimit = CpuLimit;
    }

    /**
     * Get 内存需求大小 
     * @return MemRequest 内存需求大小
     */
    public Long getMemRequest() {
        return this.MemRequest;
    }

    /**
     * Set 内存需求大小
     * @param MemRequest 内存需求大小
     */
    public void setMemRequest(Long MemRequest) {
        this.MemRequest = MemRequest;
    }

    /**
     * Get 内存限制大小 
     * @return MemLimit 内存限制大小
     */
    public Long getMemLimit() {
        return this.MemLimit;
    }

    /**
     * Set 内存限制大小
     * @param MemLimit 内存限制大小
     */
    public void setMemLimit(Long MemLimit) {
        this.MemLimit = MemLimit;
    }

    /**
     * Get 命名空间 
     * @return Namespace 命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
     * @param Namespace 命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 工作负载名称 
     * @return DeploymentName 工作负载名称
     */
    public String getDeploymentName() {
        return this.DeploymentName;
    }

    /**
     * Set 工作负载名称
     * @param DeploymentName 工作负载名称
     */
    public void setDeploymentName(String DeploymentName) {
        this.DeploymentName = DeploymentName;
    }

    /**
     * Get 工作负载id 
     * @return DeploymentID 工作负载id
     */
    public String getDeploymentID() {
        return this.DeploymentID;
    }

    /**
     * Set 工作负载id
     * @param DeploymentID 工作负载id
     */
    public void setDeploymentID(String DeploymentID) {
        this.DeploymentID = DeploymentID;
    }

    /**
     * Get 启动时间 
     * @return StartTime 启动时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 启动时间
     * @param StartTime 启动时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
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
     * Get 关联容器个数 
     * @return RelateContainerCount 关联容器个数
     */
    public Long getRelateContainerCount() {
        return this.RelateContainerCount;
    }

    /**
     * Set 关联容器个数
     * @param RelateContainerCount 关联容器个数
     */
    public void setRelateContainerCount(Long RelateContainerCount) {
        this.RelateContainerCount = RelateContainerCount;
    }

    /**
     * Get 运行时间 
     * @return RunningTime 运行时间
     */
    public String getRunningTime() {
        return this.RunningTime;
    }

    /**
     * Set 运行时间
     * @param RunningTime 运行时间
     */
    public void setRunningTime(String RunningTime) {
        this.RunningTime = RunningTime;
    }

    /**
     * Get PodUid 
     * @return PodUid PodUid
     */
    public String getPodUid() {
        return this.PodUid;
    }

    /**
     * Set PodUid
     * @param PodUid PodUid
     */
    public void setPodUid(String PodUid) {
        this.PodUid = PodUid;
    }

    /**
     * Get 计费核数 
     * @return ChargeCoresCnt 计费核数
     */
    public Long getChargeCoresCnt() {
        return this.ChargeCoresCnt;
    }

    /**
     * Set 计费核数
     * @param ChargeCoresCnt 计费核数
     */
    public void setChargeCoresCnt(Long ChargeCoresCnt) {
        this.ChargeCoresCnt = ChargeCoresCnt;
    }

    /**
     * Get 防护状态 
     * @return DefendStatus 防护状态
     */
    public String getDefendStatus() {
        return this.DefendStatus;
    }

    /**
     * Set 防护状态
     * @param DefendStatus 防护状态
     */
    public void setDefendStatus(String DefendStatus) {
        this.DefendStatus = DefendStatus;
    }

    public SuperNodePodListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SuperNodePodListItem(SuperNodePodListItem source) {
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.PodIP != null) {
            this.PodIP = new String(source.PodIP);
        }
        if (source.NodeUniqueID != null) {
            this.NodeUniqueID = new String(source.NodeUniqueID);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CpuRequest != null) {
            this.CpuRequest = new Long(source.CpuRequest);
        }
        if (source.CpuLimit != null) {
            this.CpuLimit = new Long(source.CpuLimit);
        }
        if (source.MemRequest != null) {
            this.MemRequest = new Long(source.MemRequest);
        }
        if (source.MemLimit != null) {
            this.MemLimit = new Long(source.MemLimit);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.DeploymentName != null) {
            this.DeploymentName = new String(source.DeploymentName);
        }
        if (source.DeploymentID != null) {
            this.DeploymentID = new String(source.DeploymentID);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RelateContainerCount != null) {
            this.RelateContainerCount = new Long(source.RelateContainerCount);
        }
        if (source.RunningTime != null) {
            this.RunningTime = new String(source.RunningTime);
        }
        if (source.PodUid != null) {
            this.PodUid = new String(source.PodUid);
        }
        if (source.ChargeCoresCnt != null) {
            this.ChargeCoresCnt = new Long(source.ChargeCoresCnt);
        }
        if (source.DefendStatus != null) {
            this.DefendStatus = new String(source.DefendStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "PodIP", this.PodIP);
        this.setParamSimple(map, prefix + "NodeUniqueID", this.NodeUniqueID);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CpuRequest", this.CpuRequest);
        this.setParamSimple(map, prefix + "CpuLimit", this.CpuLimit);
        this.setParamSimple(map, prefix + "MemRequest", this.MemRequest);
        this.setParamSimple(map, prefix + "MemLimit", this.MemLimit);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "DeploymentName", this.DeploymentName);
        this.setParamSimple(map, prefix + "DeploymentID", this.DeploymentID);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RelateContainerCount", this.RelateContainerCount);
        this.setParamSimple(map, prefix + "RunningTime", this.RunningTime);
        this.setParamSimple(map, prefix + "PodUid", this.PodUid);
        this.setParamSimple(map, prefix + "ChargeCoresCnt", this.ChargeCoresCnt);
        this.setParamSimple(map, prefix + "DefendStatus", this.DefendStatus);

    }
}

