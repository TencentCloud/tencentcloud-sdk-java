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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Task extends AbstractModel {

    /**
    * 任务状态（process(运行中)、pause(暂停)、pausing(暂停中)、paused(已暂停)、done(已完成)、abort(中止)、aborted(已中止)、resume(重新执行)）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LifeState")
    @Expose
    private String LifeState;

    /**
    * 任务目标ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetObj")
    @Expose
    private String TargetObj;

    /**
    * 任务参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Param")
    @Expose
    private String Param;

    /**
    * 任务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 任务失败原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastError")
    @Expose
    private String LastError;

    /**
    * 任务所属集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * 任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 任务更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 创建任务唯一请求ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskID")
    @Expose
    private String TaskID;

    /**
     * Get 任务状态（process(运行中)、pause(暂停)、pausing(暂停中)、paused(已暂停)、done(已完成)、abort(中止)、aborted(已中止)、resume(重新执行)）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LifeState 任务状态（process(运行中)、pause(暂停)、pausing(暂停中)、paused(已暂停)、done(已完成)、abort(中止)、aborted(已中止)、resume(重新执行)）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLifeState() {
        return this.LifeState;
    }

    /**
     * Set 任务状态（process(运行中)、pause(暂停)、pausing(暂停中)、paused(已暂停)、done(已完成)、abort(中止)、aborted(已中止)、resume(重新执行)）
注意：此字段可能返回 null，表示取不到有效值。
     * @param LifeState 任务状态（process(运行中)、pause(暂停)、pausing(暂停中)、paused(已暂停)、done(已完成)、abort(中止)、aborted(已中止)、resume(重新执行)）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLifeState(String LifeState) {
        this.LifeState = LifeState;
    }

    /**
     * Get 任务目标ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetObj 任务目标ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetObj() {
        return this.TargetObj;
    }

    /**
     * Set 任务目标ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetObj 任务目标ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetObj(String TargetObj) {
        this.TargetObj = TargetObj;
    }

    /**
     * Get 任务参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Param 任务参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParam() {
        return this.Param;
    }

    /**
     * Set 任务参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Param 任务参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParam(String Param) {
        this.Param = Param;
    }

    /**
     * Get 任务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskType 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskType 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务失败原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastError 任务失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastError() {
        return this.LastError;
    }

    /**
     * Set 任务失败原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastError 任务失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastError(String LastError) {
        this.LastError = LastError;
    }

    /**
     * Get 任务所属集群ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterID 任务所属集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set 任务所属集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterID 任务所属集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get 任务开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedAt 任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedAt 任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 任务更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt 任务更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 任务更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt 任务更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 创建任务唯一请求ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskID 创建任务唯一请求ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskID() {
        return this.TaskID;
    }

    /**
     * Set 创建任务唯一请求ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskID 创建任务唯一请求ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskID(String TaskID) {
        this.TaskID = TaskID;
    }

    public Task() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Task(Task source) {
        if (source.LifeState != null) {
            this.LifeState = new String(source.LifeState);
        }
        if (source.TargetObj != null) {
            this.TargetObj = new String(source.TargetObj);
        }
        if (source.Param != null) {
            this.Param = new String(source.Param);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.LastError != null) {
            this.LastError = new String(source.LastError);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.TaskID != null) {
            this.TaskID = new String(source.TaskID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LifeState", this.LifeState);
        this.setParamSimple(map, prefix + "TargetObj", this.TargetObj);
        this.setParamSimple(map, prefix + "Param", this.Param);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "LastError", this.LastError);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "TaskID", this.TaskID);

    }
}

