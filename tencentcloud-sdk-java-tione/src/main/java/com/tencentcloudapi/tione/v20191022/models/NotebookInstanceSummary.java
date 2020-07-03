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
package com.tencentcloudapi.tione.v20191022.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NotebookInstanceSummary extends AbstractModel{

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 最近修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastModifiedTime")
    @Expose
    private String LastModifiedTime;

    /**
    * notebook实例名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotebookInstanceName")
    @Expose
    private String NotebookInstanceName;

    /**
    * notebook实例状态，取值范围：
Pending: 创建中
Inservice: 运行中
Stopping: 停止中
Stopped: 已停止
Failed: 失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotebookInstanceStatus")
    @Expose
    private String NotebookInstanceStatus;

    /**
    * 算力类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 启动时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartupTime")
    @Expose
    private String StartupTime;

    /**
    * 运行截止时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Deadline")
    @Expose
    private String Deadline;

    /**
    * 自动停止配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StoppingCondition")
    @Expose
    private StoppingCondition StoppingCondition;

    /**
    * 是否是预付费实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Prepay")
    @Expose
    private Boolean Prepay;

    /**
    * 计费标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillingLabel")
    @Expose
    private BillingLabel BillingLabel;

    /**
    * 运行时长，秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuntimeInSeconds")
    @Expose
    private Long RuntimeInSeconds;

    /**
    * 剩余时长，秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemainTimeInSeconds")
    @Expose
    private Long RemainTimeInSeconds;

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreationTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreationTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 最近修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastModifiedTime 最近修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastModifiedTime() {
        return this.LastModifiedTime;
    }

    /**
     * Set 最近修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastModifiedTime 最近修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastModifiedTime(String LastModifiedTime) {
        this.LastModifiedTime = LastModifiedTime;
    }

    /**
     * Get notebook实例名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotebookInstanceName notebook实例名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNotebookInstanceName() {
        return this.NotebookInstanceName;
    }

    /**
     * Set notebook实例名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotebookInstanceName notebook实例名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotebookInstanceName(String NotebookInstanceName) {
        this.NotebookInstanceName = NotebookInstanceName;
    }

    /**
     * Get notebook实例状态，取值范围：
Pending: 创建中
Inservice: 运行中
Stopping: 停止中
Stopped: 已停止
Failed: 失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotebookInstanceStatus notebook实例状态，取值范围：
Pending: 创建中
Inservice: 运行中
Stopping: 停止中
Stopped: 已停止
Failed: 失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNotebookInstanceStatus() {
        return this.NotebookInstanceStatus;
    }

    /**
     * Set notebook实例状态，取值范围：
Pending: 创建中
Inservice: 运行中
Stopping: 停止中
Stopped: 已停止
Failed: 失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotebookInstanceStatus notebook实例状态，取值范围：
Pending: 创建中
Inservice: 运行中
Stopping: 停止中
Stopped: 已停止
Failed: 失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotebookInstanceStatus(String NotebookInstanceStatus) {
        this.NotebookInstanceStatus = NotebookInstanceStatus;
    }

    /**
     * Get 算力类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType 算力类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 算力类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType 算力类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 启动时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartupTime 启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartupTime() {
        return this.StartupTime;
    }

    /**
     * Set 启动时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartupTime 启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartupTime(String StartupTime) {
        this.StartupTime = StartupTime;
    }

    /**
     * Get 运行截止时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Deadline 运行截止时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 运行截止时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Deadline 运行截止时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeadline(String Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get 自动停止配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StoppingCondition 自动停止配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StoppingCondition getStoppingCondition() {
        return this.StoppingCondition;
    }

    /**
     * Set 自动停止配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param StoppingCondition 自动停止配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStoppingCondition(StoppingCondition StoppingCondition) {
        this.StoppingCondition = StoppingCondition;
    }

    /**
     * Get 是否是预付费实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Prepay 是否是预付费实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getPrepay() {
        return this.Prepay;
    }

    /**
     * Set 是否是预付费实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param Prepay 是否是预付费实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrepay(Boolean Prepay) {
        this.Prepay = Prepay;
    }

    /**
     * Get 计费标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillingLabel 计费标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BillingLabel getBillingLabel() {
        return this.BillingLabel;
    }

    /**
     * Set 计费标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillingLabel 计费标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillingLabel(BillingLabel BillingLabel) {
        this.BillingLabel = BillingLabel;
    }

    /**
     * Get 运行时长，秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuntimeInSeconds 运行时长，秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuntimeInSeconds() {
        return this.RuntimeInSeconds;
    }

    /**
     * Set 运行时长，秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuntimeInSeconds 运行时长，秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuntimeInSeconds(Long RuntimeInSeconds) {
        this.RuntimeInSeconds = RuntimeInSeconds;
    }

    /**
     * Get 剩余时长，秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemainTimeInSeconds 剩余时长，秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRemainTimeInSeconds() {
        return this.RemainTimeInSeconds;
    }

    /**
     * Set 剩余时长，秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemainTimeInSeconds 剩余时长，秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemainTimeInSeconds(Long RemainTimeInSeconds) {
        this.RemainTimeInSeconds = RemainTimeInSeconds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "LastModifiedTime", this.LastModifiedTime);
        this.setParamSimple(map, prefix + "NotebookInstanceName", this.NotebookInstanceName);
        this.setParamSimple(map, prefix + "NotebookInstanceStatus", this.NotebookInstanceStatus);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartupTime", this.StartupTime);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamObj(map, prefix + "StoppingCondition.", this.StoppingCondition);
        this.setParamSimple(map, prefix + "Prepay", this.Prepay);
        this.setParamObj(map, prefix + "BillingLabel.", this.BillingLabel);
        this.setParamSimple(map, prefix + "RuntimeInSeconds", this.RuntimeInSeconds);
        this.setParamSimple(map, prefix + "RemainTimeInSeconds", this.RemainTimeInSeconds);

    }
}

