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

public class TrainingJobSummary extends AbstractModel{

    /**
    * 任务创建时间
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
    * 训练任务名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrainingJobName")
    @Expose
    private String TrainingJobName;

    /**
    * 训练任务状态，取值范围
InProgress：运行中
Completed: 已完成
Failed: 失败
Stopping: 停止中
Stopped：已停止
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrainingJobStatus")
    @Expose
    private String TrainingJobStatus;

    /**
    * 完成时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrainingEndTime")
    @Expose
    private String TrainingEndTime;

    /**
    * 算了实例Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 资源配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceConfig")
    @Expose
    private ResourceConfig ResourceConfig;

    /**
     * Get 任务创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreationTime 任务创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 任务创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreationTime 任务创建时间
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
     * Get 训练任务名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrainingJobName 训练任务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTrainingJobName() {
        return this.TrainingJobName;
    }

    /**
     * Set 训练任务名
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrainingJobName 训练任务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrainingJobName(String TrainingJobName) {
        this.TrainingJobName = TrainingJobName;
    }

    /**
     * Get 训练任务状态，取值范围
InProgress：运行中
Completed: 已完成
Failed: 失败
Stopping: 停止中
Stopped：已停止
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrainingJobStatus 训练任务状态，取值范围
InProgress：运行中
Completed: 已完成
Failed: 失败
Stopping: 停止中
Stopped：已停止
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTrainingJobStatus() {
        return this.TrainingJobStatus;
    }

    /**
     * Set 训练任务状态，取值范围
InProgress：运行中
Completed: 已完成
Failed: 失败
Stopping: 停止中
Stopped：已停止
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrainingJobStatus 训练任务状态，取值范围
InProgress：运行中
Completed: 已完成
Failed: 失败
Stopping: 停止中
Stopped：已停止
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrainingJobStatus(String TrainingJobStatus) {
        this.TrainingJobStatus = TrainingJobStatus;
    }

    /**
     * Get 完成时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrainingEndTime 完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTrainingEndTime() {
        return this.TrainingEndTime;
    }

    /**
     * Set 完成时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrainingEndTime 完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrainingEndTime(String TrainingEndTime) {
        this.TrainingEndTime = TrainingEndTime;
    }

    /**
     * Get 算了实例Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 算了实例Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 算了实例Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 算了实例Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 资源配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceConfig 资源配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceConfig getResourceConfig() {
        return this.ResourceConfig;
    }

    /**
     * Set 资源配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceConfig 资源配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceConfig(ResourceConfig ResourceConfig) {
        this.ResourceConfig = ResourceConfig;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "LastModifiedTime", this.LastModifiedTime);
        this.setParamSimple(map, prefix + "TrainingJobName", this.TrainingJobName);
        this.setParamSimple(map, prefix + "TrainingJobStatus", this.TrainingJobStatus);
        this.setParamSimple(map, prefix + "TrainingEndTime", this.TrainingEndTime);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "ResourceConfig.", this.ResourceConfig);

    }
}

