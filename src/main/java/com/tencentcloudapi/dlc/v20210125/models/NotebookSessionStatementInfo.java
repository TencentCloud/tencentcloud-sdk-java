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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NotebookSessionStatementInfo extends AbstractModel{

    /**
    * 完成时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Completed")
    @Expose
    private Long Completed;

    /**
    * 开始时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Started")
    @Expose
    private Long Started;

    /**
    * 完成进度，百分制
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * Session Statement唯一标识
    */
    @SerializedName("StatementId")
    @Expose
    private String StatementId;

    /**
    * Session Statement状态，包含：waiting（排队中）、running（运行中）、available（正常）、error（异常）、cancelling（取消中）、cancelled（已取消）
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Statement输出信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutPut")
    @Expose
    private StatementOutput OutPut;

    /**
    * 批任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * 运行语句
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
     * Get 完成时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Completed 完成时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCompleted() {
        return this.Completed;
    }

    /**
     * Set 完成时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param Completed 完成时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompleted(Long Completed) {
        this.Completed = Completed;
    }

    /**
     * Get 开始时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Started 开始时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStarted() {
        return this.Started;
    }

    /**
     * Set 开始时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param Started 开始时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStarted(Long Started) {
        this.Started = Started;
    }

    /**
     * Get 完成进度，百分制
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Progress 完成进度，百分制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set 完成进度，百分制
注意：此字段可能返回 null，表示取不到有效值。
     * @param Progress 完成进度，百分制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Session Statement唯一标识 
     * @return StatementId Session Statement唯一标识
     */
    public String getStatementId() {
        return this.StatementId;
    }

    /**
     * Set Session Statement唯一标识
     * @param StatementId Session Statement唯一标识
     */
    public void setStatementId(String StatementId) {
        this.StatementId = StatementId;
    }

    /**
     * Get Session Statement状态，包含：waiting（排队中）、running（运行中）、available（正常）、error（异常）、cancelling（取消中）、cancelled（已取消） 
     * @return State Session Statement状态，包含：waiting（排队中）、running（运行中）、available（正常）、error（异常）、cancelling（取消中）、cancelled（已取消）
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Session Statement状态，包含：waiting（排队中）、running（运行中）、available（正常）、error（异常）、cancelling（取消中）、cancelled（已取消）
     * @param State Session Statement状态，包含：waiting（排队中）、running（运行中）、available（正常）、error（异常）、cancelling（取消中）、cancelled（已取消）
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Statement输出信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutPut Statement输出信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StatementOutput getOutPut() {
        return this.OutPut;
    }

    /**
     * Set Statement输出信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutPut Statement输出信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutPut(StatementOutput OutPut) {
        this.OutPut = OutPut;
    }

    /**
     * Get 批任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BatchId 批任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set 批任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param BatchId 批任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    /**
     * Get 运行语句
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Code 运行语句
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 运行语句
注意：此字段可能返回 null，表示取不到有效值。
     * @param Code 运行语句
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    public NotebookSessionStatementInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NotebookSessionStatementInfo(NotebookSessionStatementInfo source) {
        if (source.Completed != null) {
            this.Completed = new Long(source.Completed);
        }
        if (source.Started != null) {
            this.Started = new Long(source.Started);
        }
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
        if (source.StatementId != null) {
            this.StatementId = new String(source.StatementId);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.OutPut != null) {
            this.OutPut = new StatementOutput(source.OutPut);
        }
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Completed", this.Completed);
        this.setParamSimple(map, prefix + "Started", this.Started);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "StatementId", this.StatementId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamObj(map, prefix + "OutPut.", this.OutPut);
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

