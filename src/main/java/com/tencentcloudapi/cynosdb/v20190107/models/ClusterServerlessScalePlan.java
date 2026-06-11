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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterServerlessScalePlan extends AbstractModel {

    /**
    * <p>计划ID</p>
    */
    @SerializedName("PlanId")
    @Expose
    private Long PlanId;

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>实例对象。具体是实例id或者类型。比如ro-即集群下的所有只读实例。</p>
    */
    @SerializedName("ObjectInstance")
    @Expose
    private String ObjectInstance;

    /**
    * <p>策略ID</p>
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * <p>策略类型</p>
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * <p>原规格下限</p>
    */
    @SerializedName("SourceMinCpu")
    @Expose
    private Float SourceMinCpu;

    /**
    * <p>原规格上限</p>
    */
    @SerializedName("SourceMaxCpu")
    @Expose
    private Float SourceMaxCpu;

    /**
    * <p>原规格下限</p>
    */
    @SerializedName("TargetMinCpu")
    @Expose
    private Float TargetMinCpu;

    /**
    * <p>原规格上限</p>
    */
    @SerializedName("TargetMaxCpu")
    @Expose
    private Float TargetMaxCpu;

    /**
    * <p>计划状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>弹性任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScaleTaskId")
    @Expose
    private Long ScaleTaskId;

    /**
    * <p>失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * <p>计划预期开始执行时间</p>
    */
    @SerializedName("ExpectedStartTime")
    @Expose
    private String ExpectedStartTime;

    /**
    * <p>计划预期结束时间</p>
    */
    @SerializedName("ExpectedEndTime")
    @Expose
    private String ExpectedEndTime;

    /**
    * <p>恢复自动弹性任务</p>
    */
    @SerializedName("ResetTaskId")
    @Expose
    private Long ResetTaskId;

    /**
    * <p>恢复自动弹性任务执行方式</p>
    */
    @SerializedName("ResetType")
    @Expose
    private String ResetType;

    /**
    * <p>恢复自动弹性任务执行时间</p>
    */
    @SerializedName("ResetTime")
    @Expose
    private String ResetTime;

    /**
     * Get <p>计划ID</p> 
     * @return PlanId <p>计划ID</p>
     */
    public Long getPlanId() {
        return this.PlanId;
    }

    /**
     * Set <p>计划ID</p>
     * @param PlanId <p>计划ID</p>
     */
    public void setPlanId(Long PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get <p>集群ID</p> 
     * @return ClusterId <p>集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterId <p>集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>实例对象。具体是实例id或者类型。比如ro-即集群下的所有只读实例。</p> 
     * @return ObjectInstance <p>实例对象。具体是实例id或者类型。比如ro-即集群下的所有只读实例。</p>
     */
    public String getObjectInstance() {
        return this.ObjectInstance;
    }

    /**
     * Set <p>实例对象。具体是实例id或者类型。比如ro-即集群下的所有只读实例。</p>
     * @param ObjectInstance <p>实例对象。具体是实例id或者类型。比如ro-即集群下的所有只读实例。</p>
     */
    public void setObjectInstance(String ObjectInstance) {
        this.ObjectInstance = ObjectInstance;
    }

    /**
     * Get <p>策略ID</p> 
     * @return PolicyId <p>策略ID</p>
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set <p>策略ID</p>
     * @param PolicyId <p>策略ID</p>
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get <p>策略类型</p> 
     * @return PolicyType <p>策略类型</p>
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set <p>策略类型</p>
     * @param PolicyType <p>策略类型</p>
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get <p>原规格下限</p> 
     * @return SourceMinCpu <p>原规格下限</p>
     */
    public Float getSourceMinCpu() {
        return this.SourceMinCpu;
    }

    /**
     * Set <p>原规格下限</p>
     * @param SourceMinCpu <p>原规格下限</p>
     */
    public void setSourceMinCpu(Float SourceMinCpu) {
        this.SourceMinCpu = SourceMinCpu;
    }

    /**
     * Get <p>原规格上限</p> 
     * @return SourceMaxCpu <p>原规格上限</p>
     */
    public Float getSourceMaxCpu() {
        return this.SourceMaxCpu;
    }

    /**
     * Set <p>原规格上限</p>
     * @param SourceMaxCpu <p>原规格上限</p>
     */
    public void setSourceMaxCpu(Float SourceMaxCpu) {
        this.SourceMaxCpu = SourceMaxCpu;
    }

    /**
     * Get <p>原规格下限</p> 
     * @return TargetMinCpu <p>原规格下限</p>
     */
    public Float getTargetMinCpu() {
        return this.TargetMinCpu;
    }

    /**
     * Set <p>原规格下限</p>
     * @param TargetMinCpu <p>原规格下限</p>
     */
    public void setTargetMinCpu(Float TargetMinCpu) {
        this.TargetMinCpu = TargetMinCpu;
    }

    /**
     * Get <p>原规格上限</p> 
     * @return TargetMaxCpu <p>原规格上限</p>
     */
    public Float getTargetMaxCpu() {
        return this.TargetMaxCpu;
    }

    /**
     * Set <p>原规格上限</p>
     * @param TargetMaxCpu <p>原规格上限</p>
     */
    public void setTargetMaxCpu(Float TargetMaxCpu) {
        this.TargetMaxCpu = TargetMaxCpu;
    }

    /**
     * Get <p>计划状态</p> 
     * @return Status <p>计划状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>计划状态</p>
     * @param Status <p>计划状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>弹性任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScaleTaskId <p>弹性任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScaleTaskId() {
        return this.ScaleTaskId;
    }

    /**
     * Set <p>弹性任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScaleTaskId <p>弹性任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScaleTaskId(Long ScaleTaskId) {
        this.ScaleTaskId = ScaleTaskId;
    }

    /**
     * Get <p>失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailReason <p>失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set <p>失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailReason <p>失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get <p>计划预期开始执行时间</p> 
     * @return ExpectedStartTime <p>计划预期开始执行时间</p>
     */
    public String getExpectedStartTime() {
        return this.ExpectedStartTime;
    }

    /**
     * Set <p>计划预期开始执行时间</p>
     * @param ExpectedStartTime <p>计划预期开始执行时间</p>
     */
    public void setExpectedStartTime(String ExpectedStartTime) {
        this.ExpectedStartTime = ExpectedStartTime;
    }

    /**
     * Get <p>计划预期结束时间</p> 
     * @return ExpectedEndTime <p>计划预期结束时间</p>
     */
    public String getExpectedEndTime() {
        return this.ExpectedEndTime;
    }

    /**
     * Set <p>计划预期结束时间</p>
     * @param ExpectedEndTime <p>计划预期结束时间</p>
     */
    public void setExpectedEndTime(String ExpectedEndTime) {
        this.ExpectedEndTime = ExpectedEndTime;
    }

    /**
     * Get <p>恢复自动弹性任务</p> 
     * @return ResetTaskId <p>恢复自动弹性任务</p>
     */
    public Long getResetTaskId() {
        return this.ResetTaskId;
    }

    /**
     * Set <p>恢复自动弹性任务</p>
     * @param ResetTaskId <p>恢复自动弹性任务</p>
     */
    public void setResetTaskId(Long ResetTaskId) {
        this.ResetTaskId = ResetTaskId;
    }

    /**
     * Get <p>恢复自动弹性任务执行方式</p> 
     * @return ResetType <p>恢复自动弹性任务执行方式</p>
     */
    public String getResetType() {
        return this.ResetType;
    }

    /**
     * Set <p>恢复自动弹性任务执行方式</p>
     * @param ResetType <p>恢复自动弹性任务执行方式</p>
     */
    public void setResetType(String ResetType) {
        this.ResetType = ResetType;
    }

    /**
     * Get <p>恢复自动弹性任务执行时间</p> 
     * @return ResetTime <p>恢复自动弹性任务执行时间</p>
     */
    public String getResetTime() {
        return this.ResetTime;
    }

    /**
     * Set <p>恢复自动弹性任务执行时间</p>
     * @param ResetTime <p>恢复自动弹性任务执行时间</p>
     */
    public void setResetTime(String ResetTime) {
        this.ResetTime = ResetTime;
    }

    public ClusterServerlessScalePlan() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterServerlessScalePlan(ClusterServerlessScalePlan source) {
        if (source.PlanId != null) {
            this.PlanId = new Long(source.PlanId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ObjectInstance != null) {
            this.ObjectInstance = new String(source.ObjectInstance);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.SourceMinCpu != null) {
            this.SourceMinCpu = new Float(source.SourceMinCpu);
        }
        if (source.SourceMaxCpu != null) {
            this.SourceMaxCpu = new Float(source.SourceMaxCpu);
        }
        if (source.TargetMinCpu != null) {
            this.TargetMinCpu = new Float(source.TargetMinCpu);
        }
        if (source.TargetMaxCpu != null) {
            this.TargetMaxCpu = new Float(source.TargetMaxCpu);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ScaleTaskId != null) {
            this.ScaleTaskId = new Long(source.ScaleTaskId);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.ExpectedStartTime != null) {
            this.ExpectedStartTime = new String(source.ExpectedStartTime);
        }
        if (source.ExpectedEndTime != null) {
            this.ExpectedEndTime = new String(source.ExpectedEndTime);
        }
        if (source.ResetTaskId != null) {
            this.ResetTaskId = new Long(source.ResetTaskId);
        }
        if (source.ResetType != null) {
            this.ResetType = new String(source.ResetType);
        }
        if (source.ResetTime != null) {
            this.ResetTime = new String(source.ResetTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ObjectInstance", this.ObjectInstance);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "SourceMinCpu", this.SourceMinCpu);
        this.setParamSimple(map, prefix + "SourceMaxCpu", this.SourceMaxCpu);
        this.setParamSimple(map, prefix + "TargetMinCpu", this.TargetMinCpu);
        this.setParamSimple(map, prefix + "TargetMaxCpu", this.TargetMaxCpu);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ScaleTaskId", this.ScaleTaskId);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "ExpectedStartTime", this.ExpectedStartTime);
        this.setParamSimple(map, prefix + "ExpectedEndTime", this.ExpectedEndTime);
        this.setParamSimple(map, prefix + "ResetTaskId", this.ResetTaskId);
        this.setParamSimple(map, prefix + "ResetType", this.ResetType);
        this.setParamSimple(map, prefix + "ResetTime", this.ResetTime);

    }
}

