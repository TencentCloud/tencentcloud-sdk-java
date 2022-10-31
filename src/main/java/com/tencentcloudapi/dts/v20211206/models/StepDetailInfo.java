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

public class StepDetailInfo extends AbstractModel{

    /**
    * 步骤序列
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StepNo")
    @Expose
    private Long StepNo;

    /**
    * 步骤展现名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StepName")
    @Expose
    private String StepName;

    /**
    * 步骤英文标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StepId")
    @Expose
    private String StepId;

    /**
    * 步骤状态:success(成功)、failed(失败)、running(执行中)、notStarted(未执行)、默认为notStarted
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 当前步骤开始的时间，格式为"yyyy-mm-dd hh:mm:ss"，该字段不存在或者为空是无意义 注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 步骤错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StepMessage")
    @Expose
    private String StepMessage;

    /**
    * 执行进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Errors")
    @Expose
    private ProcessStepTip [] Errors;

    /**
    * 告警提示
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Warnings")
    @Expose
    private ProcessStepTip [] Warnings;

    /**
     * Get 步骤序列
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StepNo 步骤序列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStepNo() {
        return this.StepNo;
    }

    /**
     * Set 步骤序列
注意：此字段可能返回 null，表示取不到有效值。
     * @param StepNo 步骤序列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStepNo(Long StepNo) {
        this.StepNo = StepNo;
    }

    /**
     * Get 步骤展现名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StepName 步骤展现名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStepName() {
        return this.StepName;
    }

    /**
     * Set 步骤展现名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param StepName 步骤展现名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStepName(String StepName) {
        this.StepName = StepName;
    }

    /**
     * Get 步骤英文标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StepId 步骤英文标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStepId() {
        return this.StepId;
    }

    /**
     * Set 步骤英文标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param StepId 步骤英文标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStepId(String StepId) {
        this.StepId = StepId;
    }

    /**
     * Get 步骤状态:success(成功)、failed(失败)、running(执行中)、notStarted(未执行)、默认为notStarted
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 步骤状态:success(成功)、failed(失败)、running(执行中)、notStarted(未执行)、默认为notStarted
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 步骤状态:success(成功)、failed(失败)、running(执行中)、notStarted(未执行)、默认为notStarted
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 步骤状态:success(成功)、failed(失败)、running(执行中)、notStarted(未执行)、默认为notStarted
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 当前步骤开始的时间，格式为"yyyy-mm-dd hh:mm:ss"，该字段不存在或者为空是无意义 注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 当前步骤开始的时间，格式为"yyyy-mm-dd hh:mm:ss"，该字段不存在或者为空是无意义 注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 当前步骤开始的时间，格式为"yyyy-mm-dd hh:mm:ss"，该字段不存在或者为空是无意义 注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 当前步骤开始的时间，格式为"yyyy-mm-dd hh:mm:ss"，该字段不存在或者为空是无意义 注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 步骤错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StepMessage 步骤错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStepMessage() {
        return this.StepMessage;
    }

    /**
     * Set 步骤错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param StepMessage 步骤错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStepMessage(String StepMessage) {
        this.StepMessage = StepMessage;
    }

    /**
     * Get 执行进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Percent 执行进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set 执行进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Percent 执行进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get 错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Errors 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProcessStepTip [] getErrors() {
        return this.Errors;
    }

    /**
     * Set 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Errors 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrors(ProcessStepTip [] Errors) {
        this.Errors = Errors;
    }

    /**
     * Get 告警提示
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Warnings 告警提示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProcessStepTip [] getWarnings() {
        return this.Warnings;
    }

    /**
     * Set 告警提示
注意：此字段可能返回 null，表示取不到有效值。
     * @param Warnings 告警提示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarnings(ProcessStepTip [] Warnings) {
        this.Warnings = Warnings;
    }

    public StepDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StepDetailInfo(StepDetailInfo source) {
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
        if (source.StepMessage != null) {
            this.StepMessage = new String(source.StepMessage);
        }
        if (source.Percent != null) {
            this.Percent = new Long(source.Percent);
        }
        if (source.Errors != null) {
            this.Errors = new ProcessStepTip[source.Errors.length];
            for (int i = 0; i < source.Errors.length; i++) {
                this.Errors[i] = new ProcessStepTip(source.Errors[i]);
            }
        }
        if (source.Warnings != null) {
            this.Warnings = new ProcessStepTip[source.Warnings.length];
            for (int i = 0; i < source.Warnings.length; i++) {
                this.Warnings[i] = new ProcessStepTip(source.Warnings[i]);
            }
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
        this.setParamSimple(map, prefix + "StepMessage", this.StepMessage);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamArrayObj(map, prefix + "Errors.", this.Errors);
        this.setParamArrayObj(map, prefix + "Warnings.", this.Warnings);

    }
}

