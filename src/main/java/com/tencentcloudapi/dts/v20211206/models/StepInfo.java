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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StepInfo extends AbstractModel{

    /**
    * 步骤编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StepNo")
    @Expose
    private Long StepNo;

    /**
    * 步骤名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StepName")
    @Expose
    private String StepName;

    /**
    * 步骤标号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StepId")
    @Expose
    private String StepId;

    /**
    * 当前步骤状态,可能返回有 notStarted(未开始)、running(校验中)、failed(校验任务失败)、finished(完成)、skipped(跳过)、paused(暂停)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 步骤开始时间，可能为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Errors")
    @Expose
    private StepTip [] Errors;

    /**
    * 警告信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Warnings")
    @Expose
    private StepTip [] Warnings;

    /**
    * 当前步骤进度，范围为[0-100]，若为-1表示当前步骤不支持查看进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
     * Get 步骤编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StepNo 步骤编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStepNo() {
        return this.StepNo;
    }

    /**
     * Set 步骤编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param StepNo 步骤编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStepNo(Long StepNo) {
        this.StepNo = StepNo;
    }

    /**
     * Get 步骤名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StepName 步骤名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStepName() {
        return this.StepName;
    }

    /**
     * Set 步骤名
注意：此字段可能返回 null，表示取不到有效值。
     * @param StepName 步骤名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStepName(String StepName) {
        this.StepName = StepName;
    }

    /**
     * Get 步骤标号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StepId 步骤标号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStepId() {
        return this.StepId;
    }

    /**
     * Set 步骤标号
注意：此字段可能返回 null，表示取不到有效值。
     * @param StepId 步骤标号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStepId(String StepId) {
        this.StepId = StepId;
    }

    /**
     * Get 当前步骤状态,可能返回有 notStarted(未开始)、running(校验中)、failed(校验任务失败)、finished(完成)、skipped(跳过)、paused(暂停)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 当前步骤状态,可能返回有 notStarted(未开始)、running(校验中)、failed(校验任务失败)、finished(完成)、skipped(跳过)、paused(暂停)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 当前步骤状态,可能返回有 notStarted(未开始)、running(校验中)、failed(校验任务失败)、finished(完成)、skipped(跳过)、paused(暂停)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 当前步骤状态,可能返回有 notStarted(未开始)、running(校验中)、failed(校验任务失败)、finished(完成)、skipped(跳过)、paused(暂停)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 步骤开始时间，可能为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 步骤开始时间，可能为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 步骤开始时间，可能为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 步骤开始时间，可能为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Errors 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StepTip [] getErrors() {
        return this.Errors;
    }

    /**
     * Set 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Errors 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrors(StepTip [] Errors) {
        this.Errors = Errors;
    }

    /**
     * Get 警告信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Warnings 警告信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StepTip [] getWarnings() {
        return this.Warnings;
    }

    /**
     * Set 警告信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Warnings 警告信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarnings(StepTip [] Warnings) {
        this.Warnings = Warnings;
    }

    /**
     * Get 当前步骤进度，范围为[0-100]，若为-1表示当前步骤不支持查看进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Progress 当前步骤进度，范围为[0-100]，若为-1表示当前步骤不支持查看进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 当前步骤进度，范围为[0-100]，若为-1表示当前步骤不支持查看进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Progress 当前步骤进度，范围为[0-100]，若为-1表示当前步骤不支持查看进度
注意：此字段可能返回 null，表示取不到有效值。
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
        this.setParamArrayObj(map, prefix + "Errors.", this.Errors);
        this.setParamArrayObj(map, prefix + "Warnings.", this.Warnings);
        this.setParamSimple(map, prefix + "Progress", this.Progress);

    }
}

