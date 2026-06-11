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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StepInfo extends AbstractModel {

    /**
    * <p>步骤编号</p>
    */
    @SerializedName("StepNo")
    @Expose
    private Long StepNo;

    /**
    * <p>步骤名</p>
    */
    @SerializedName("StepName")
    @Expose
    private String StepName;

    /**
    * <p>步骤标号</p>
    */
    @SerializedName("StepId")
    @Expose
    private String StepId;

    /**
    * <p>当前步骤状态,可能返回有 notStarted(未开始)、running(校验中)、failed(校验任务失败)、finished(完成)、skipped(跳过)、paused(暂停)</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>步骤开始时间，可能为空</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>完成时间</p>
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Errors")
    @Expose
    private StepTip [] Errors;

    /**
    * <p>警告信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Warnings")
    @Expose
    private StepTip [] Warnings;

    /**
    * <p>当前步骤进度，范围为[0-100]，若为-1表示当前步骤不支持查看进度</p>
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
     * Get <p>步骤编号</p> 
     * @return StepNo <p>步骤编号</p>
     */
    public Long getStepNo() {
        return this.StepNo;
    }

    /**
     * Set <p>步骤编号</p>
     * @param StepNo <p>步骤编号</p>
     */
    public void setStepNo(Long StepNo) {
        this.StepNo = StepNo;
    }

    /**
     * Get <p>步骤名</p> 
     * @return StepName <p>步骤名</p>
     */
    public String getStepName() {
        return this.StepName;
    }

    /**
     * Set <p>步骤名</p>
     * @param StepName <p>步骤名</p>
     */
    public void setStepName(String StepName) {
        this.StepName = StepName;
    }

    /**
     * Get <p>步骤标号</p> 
     * @return StepId <p>步骤标号</p>
     */
    public String getStepId() {
        return this.StepId;
    }

    /**
     * Set <p>步骤标号</p>
     * @param StepId <p>步骤标号</p>
     */
    public void setStepId(String StepId) {
        this.StepId = StepId;
    }

    /**
     * Get <p>当前步骤状态,可能返回有 notStarted(未开始)、running(校验中)、failed(校验任务失败)、finished(完成)、skipped(跳过)、paused(暂停)</p> 
     * @return Status <p>当前步骤状态,可能返回有 notStarted(未开始)、running(校验中)、failed(校验任务失败)、finished(完成)、skipped(跳过)、paused(暂停)</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>当前步骤状态,可能返回有 notStarted(未开始)、running(校验中)、failed(校验任务失败)、finished(完成)、skipped(跳过)、paused(暂停)</p>
     * @param Status <p>当前步骤状态,可能返回有 notStarted(未开始)、running(校验中)、failed(校验任务失败)、finished(完成)、skipped(跳过)、paused(暂停)</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>步骤开始时间，可能为空</p> 
     * @return StartTime <p>步骤开始时间，可能为空</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>步骤开始时间，可能为空</p>
     * @param StartTime <p>步骤开始时间，可能为空</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>完成时间</p> 
     * @return FinishTime <p>完成时间</p>
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set <p>完成时间</p>
     * @param FinishTime <p>完成时间</p>
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Errors <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StepTip [] getErrors() {
        return this.Errors;
    }

    /**
     * Set <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Errors <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrors(StepTip [] Errors) {
        this.Errors = Errors;
    }

    /**
     * Get <p>警告信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Warnings <p>警告信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StepTip [] getWarnings() {
        return this.Warnings;
    }

    /**
     * Set <p>警告信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Warnings <p>警告信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarnings(StepTip [] Warnings) {
        this.Warnings = Warnings;
    }

    /**
     * Get <p>当前步骤进度，范围为[0-100]，若为-1表示当前步骤不支持查看进度</p> 
     * @return Progress <p>当前步骤进度，范围为[0-100]，若为-1表示当前步骤不支持查看进度</p>
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>当前步骤进度，范围为[0-100]，若为-1表示当前步骤不支持查看进度</p>
     * @param Progress <p>当前步骤进度，范围为[0-100]，若为-1表示当前步骤不支持查看进度</p>
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    public StepInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StepInfo(StepInfo source) {
        if (source.StepNo != null) {
            this.StepNo = new Long(source.StepNo);
        }
        if (source.StepName != null) {
            this.StepName = new String(source.StepName);
        }
        if (source.StepId != null) {
            this.StepId = new String(source.StepId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.Errors != null) {
            this.Errors = new StepTip[source.Errors.length];
            for (int i = 0; i < source.Errors.length; i++) {
                this.Errors[i] = new StepTip(source.Errors[i]);
            }
        }
        if (source.Warnings != null) {
            this.Warnings = new StepTip[source.Warnings.length];
            for (int i = 0; i < source.Warnings.length; i++) {
                this.Warnings[i] = new StepTip(source.Warnings[i]);
            }
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StepNo", this.StepNo);
        this.setParamSimple(map, prefix + "StepName", this.StepName);
        this.setParamSimple(map, prefix + "StepId", this.StepId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamArrayObj(map, prefix + "Errors.", this.Errors);
        this.setParamArrayObj(map, prefix + "Warnings.", this.Warnings);
        this.setParamSimple(map, prefix + "Progress", this.Progress);

    }
}

