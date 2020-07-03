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

public class Activity extends AbstractModel{

    /**
    * 活动ID
    */
    @SerializedName("ActivityId")
    @Expose
    private String ActivityId;

    /**
    * 计算节点ID
    */
    @SerializedName("ComputeNodeId")
    @Expose
    private String ComputeNodeId;

    /**
    * 计算节点活动类型，创建或者销毁
    */
    @SerializedName("ComputeNodeActivityType")
    @Expose
    private String ComputeNodeActivityType;

    /**
    * 计算环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 起因
    */
    @SerializedName("Cause")
    @Expose
    private String Cause;

    /**
    * 活动状态
    */
    @SerializedName("ActivityState")
    @Expose
    private String ActivityState;

    /**
    * 状态原因
    */
    @SerializedName("StateReason")
    @Expose
    private String StateReason;

    /**
    * 活动开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 活动结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 云服务器实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get 活动ID 
     * @return ActivityId 活动ID
     */
    public String getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set 活动ID
     * @param ActivityId 活动ID
     */
    public void setActivityId(String ActivityId) {
        this.ActivityId = ActivityId;
    }

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
     * Get 计算节点活动类型，创建或者销毁 
     * @return ComputeNodeActivityType 计算节点活动类型，创建或者销毁
     */
    public String getComputeNodeActivityType() {
        return this.ComputeNodeActivityType;
    }

    /**
     * Set 计算节点活动类型，创建或者销毁
     * @param ComputeNodeActivityType 计算节点活动类型，创建或者销毁
     */
    public void setComputeNodeActivityType(String ComputeNodeActivityType) {
        this.ComputeNodeActivityType = ComputeNodeActivityType;
    }

    /**
     * Get 计算环境ID 
     * @return EnvId 计算环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 计算环境ID
     * @param EnvId 计算环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 起因 
     * @return Cause 起因
     */
    public String getCause() {
        return this.Cause;
    }

    /**
     * Set 起因
     * @param Cause 起因
     */
    public void setCause(String Cause) {
        this.Cause = Cause;
    }

    /**
     * Get 活动状态 
     * @return ActivityState 活动状态
     */
    public String getActivityState() {
        return this.ActivityState;
    }

    /**
     * Set 活动状态
     * @param ActivityState 活动状态
     */
    public void setActivityState(String ActivityState) {
        this.ActivityState = ActivityState;
    }

    /**
     * Get 状态原因 
     * @return StateReason 状态原因
     */
    public String getStateReason() {
        return this.StateReason;
    }

    /**
     * Set 状态原因
     * @param StateReason 状态原因
     */
    public void setStateReason(String StateReason) {
        this.StateReason = StateReason;
    }

    /**
     * Get 活动开始时间 
     * @return StartTime 活动开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 活动开始时间
     * @param StartTime 活动开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 活动结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 活动结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 活动结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 活动结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 云服务器实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 云服务器实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 云服务器实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 云服务器实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);
        this.setParamSimple(map, prefix + "ComputeNodeId", this.ComputeNodeId);
        this.setParamSimple(map, prefix + "ComputeNodeActivityType", this.ComputeNodeActivityType);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Cause", this.Cause);
        this.setParamSimple(map, prefix + "ActivityState", this.ActivityState);
        this.setParamSimple(map, prefix + "StateReason", this.StateReason);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

