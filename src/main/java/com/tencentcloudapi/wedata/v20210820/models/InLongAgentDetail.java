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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InLongAgentDetail extends AbstractModel{

    /**
    * Agent ID
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * Agent Name
    */
    @SerializedName("AgentName")
    @Expose
    private String AgentName;

    /**
    * Agent状态(running运行中，initializing 操作中，failed心跳异常)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Agent状态描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 集群类型，1：TKE Agent，2：BOSS SDK，默认：1
    */
    @SerializedName("AgentType")
    @Expose
    private Long AgentType;

    /**
    * 采集来源
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * VPC
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 集成资源组Id
    */
    @SerializedName("ExecutorGroupId")
    @Expose
    private String ExecutorGroupId;

    /**
    * 集成资源组名称
    */
    @SerializedName("ExecutorGroupName")
    @Expose
    private String ExecutorGroupName;

    /**
    * 关联任务数
    */
    @SerializedName("TaskCount")
    @Expose
    private Long TaskCount;

    /**
    * 采集器组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentGroupId")
    @Expose
    private String AgentGroupId;

    /**
    * agent状态统计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CvmAgentStatusList")
    @Expose
    private CvmAgentStatus [] CvmAgentStatusList;

    /**
    * agent数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentTotal")
    @Expose
    private Long AgentTotal;

    /**
    * 生命周期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LifeDays")
    @Expose
    private Long LifeDays;

    /**
     * Get Agent ID 
     * @return AgentId Agent ID
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set Agent ID
     * @param AgentId Agent ID
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get Agent Name 
     * @return AgentName Agent Name
     */
    public String getAgentName() {
        return this.AgentName;
    }

    /**
     * Set Agent Name
     * @param AgentName Agent Name
     */
    public void setAgentName(String AgentName) {
        this.AgentName = AgentName;
    }

    /**
     * Get Agent状态(running运行中，initializing 操作中，failed心跳异常) 
     * @return Status Agent状态(running运行中，initializing 操作中，failed心跳异常)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Agent状态(running运行中，initializing 操作中，failed心跳异常)
     * @param Status Agent状态(running运行中，initializing 操作中，failed心跳异常)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Agent状态描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusDesc Agent状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set Agent状态描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusDesc Agent状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 集群类型，1：TKE Agent，2：BOSS SDK，默认：1 
     * @return AgentType 集群类型，1：TKE Agent，2：BOSS SDK，默认：1
     */
    public Long getAgentType() {
        return this.AgentType;
    }

    /**
     * Set 集群类型，1：TKE Agent，2：BOSS SDK，默认：1
     * @param AgentType 集群类型，1：TKE Agent，2：BOSS SDK，默认：1
     */
    public void setAgentType(Long AgentType) {
        this.AgentType = AgentType;
    }

    /**
     * Get 采集来源 
     * @return Source 采集来源
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 采集来源
     * @param Source 采集来源
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get VPC 
     * @return VpcId VPC
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC
     * @param VpcId VPC
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 集成资源组Id 
     * @return ExecutorGroupId 集成资源组Id
     */
    public String getExecutorGroupId() {
        return this.ExecutorGroupId;
    }

    /**
     * Set 集成资源组Id
     * @param ExecutorGroupId 集成资源组Id
     */
    public void setExecutorGroupId(String ExecutorGroupId) {
        this.ExecutorGroupId = ExecutorGroupId;
    }

    /**
     * Get 集成资源组名称 
     * @return ExecutorGroupName 集成资源组名称
     */
    public String getExecutorGroupName() {
        return this.ExecutorGroupName;
    }

    /**
     * Set 集成资源组名称
     * @param ExecutorGroupName 集成资源组名称
     */
    public void setExecutorGroupName(String ExecutorGroupName) {
        this.ExecutorGroupName = ExecutorGroupName;
    }

    /**
     * Get 关联任务数 
     * @return TaskCount 关联任务数
     */
    public Long getTaskCount() {
        return this.TaskCount;
    }

    /**
     * Set 关联任务数
     * @param TaskCount 关联任务数
     */
    public void setTaskCount(Long TaskCount) {
        this.TaskCount = TaskCount;
    }

    /**
     * Get 采集器组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentGroupId 采集器组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentGroupId() {
        return this.AgentGroupId;
    }

    /**
     * Set 采集器组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentGroupId 采集器组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentGroupId(String AgentGroupId) {
        this.AgentGroupId = AgentGroupId;
    }

    /**
     * Get agent状态统计
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CvmAgentStatusList agent状态统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CvmAgentStatus [] getCvmAgentStatusList() {
        return this.CvmAgentStatusList;
    }

    /**
     * Set agent状态统计
注意：此字段可能返回 null，表示取不到有效值。
     * @param CvmAgentStatusList agent状态统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCvmAgentStatusList(CvmAgentStatus [] CvmAgentStatusList) {
        this.CvmAgentStatusList = CvmAgentStatusList;
    }

    /**
     * Get agent数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentTotal agent数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAgentTotal() {
        return this.AgentTotal;
    }

    /**
     * Set agent数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentTotal agent数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentTotal(Long AgentTotal) {
        this.AgentTotal = AgentTotal;
    }

    /**
     * Get 生命周期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LifeDays 生命周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLifeDays() {
        return this.LifeDays;
    }

    /**
     * Set 生命周期
注意：此字段可能返回 null，表示取不到有效值。
     * @param LifeDays 生命周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLifeDays(Long LifeDays) {
        this.LifeDays = LifeDays;
    }

    public InLongAgentDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InLongAgentDetail(InLongAgentDetail source) {
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.AgentName != null) {
            this.AgentName = new String(source.AgentName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.AgentType != null) {
            this.AgentType = new Long(source.AgentType);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ExecutorGroupId != null) {
            this.ExecutorGroupId = new String(source.ExecutorGroupId);
        }
        if (source.ExecutorGroupName != null) {
            this.ExecutorGroupName = new String(source.ExecutorGroupName);
        }
        if (source.TaskCount != null) {
            this.TaskCount = new Long(source.TaskCount);
        }
        if (source.AgentGroupId != null) {
            this.AgentGroupId = new String(source.AgentGroupId);
        }
        if (source.CvmAgentStatusList != null) {
            this.CvmAgentStatusList = new CvmAgentStatus[source.CvmAgentStatusList.length];
            for (int i = 0; i < source.CvmAgentStatusList.length; i++) {
                this.CvmAgentStatusList[i] = new CvmAgentStatus(source.CvmAgentStatusList[i]);
            }
        }
        if (source.AgentTotal != null) {
            this.AgentTotal = new Long(source.AgentTotal);
        }
        if (source.LifeDays != null) {
            this.LifeDays = new Long(source.LifeDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "AgentName", this.AgentName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "AgentType", this.AgentType);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "ExecutorGroupId", this.ExecutorGroupId);
        this.setParamSimple(map, prefix + "ExecutorGroupName", this.ExecutorGroupName);
        this.setParamSimple(map, prefix + "TaskCount", this.TaskCount);
        this.setParamSimple(map, prefix + "AgentGroupId", this.AgentGroupId);
        this.setParamArrayObj(map, prefix + "CvmAgentStatusList.", this.CvmAgentStatusList);
        this.setParamSimple(map, prefix + "AgentTotal", this.AgentTotal);
        this.setParamSimple(map, prefix + "LifeDays", this.LifeDays);

    }
}

