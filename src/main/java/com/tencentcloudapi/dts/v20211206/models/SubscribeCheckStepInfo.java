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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubscribeCheckStepInfo extends AbstractModel {

    /**
    * 步骤名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StepName")
    @Expose
    private String StepName;

    /**
    * 步骤Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StepId")
    @Expose
    private String StepId;

    /**
    * 步骤编号，从 1 开始
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StepNo")
    @Expose
    private Long StepNo;

    /**
    * 当前步骤状态，可能值为 notStarted,running,finished,failed
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 当前步骤进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * 错误提示
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Errors")
    @Expose
    private SubscribeCheckStepTip [] Errors;

    /**
    * 告警提示
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Warnings")
    @Expose
    private SubscribeCheckStepTip [] Warnings;

    /**
     * Get 步骤名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StepName 步骤名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStepName() {
        return this.StepName;
    }

    /**
     * Set 步骤名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param StepName 步骤名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStepName(String StepName) {
        this.StepName = StepName;
    }

    /**
     * Get 步骤Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StepId 步骤Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStepId() {
        return this.StepId;
    }

    /**
     * Set 步骤Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param StepId 步骤Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStepId(String StepId) {
        this.StepId = StepId;
    }

    /**
     * Get 步骤编号，从 1 开始
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StepNo 步骤编号，从 1 开始
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStepNo() {
        return this.StepNo;
    }

    /**
     * Set 步骤编号，从 1 开始
注意：此字段可能返回 null，表示取不到有效值。
     * @param StepNo 步骤编号，从 1 开始
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStepNo(Long StepNo) {
        this.StepNo = StepNo;
    }

    /**
     * Get 当前步骤状态，可能值为 notStarted,running,finished,failed
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 当前步骤状态，可能值为 notStarted,running,finished,failed
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 当前步骤状态，可能值为 notStarted,running,finished,failed
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 当前步骤状态，可能值为 notStarted,running,finished,failed
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 当前步骤进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Percent 当前步骤进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set 当前步骤进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Percent 当前步骤进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get 错误提示
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Errors 错误提示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SubscribeCheckStepTip [] getErrors() {
        return this.Errors;
    }

    /**
     * Set 错误提示
注意：此字段可能返回 null，表示取不到有效值。
     * @param Errors 错误提示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrors(SubscribeCheckStepTip [] Errors) {
        this.Errors = Errors;
    }

    /**
     * Get 告警提示
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Warnings 告警提示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SubscribeCheckStepTip [] getWarnings() {
        return this.Warnings;
    }

    /**
     * Set 告警提示
注意：此字段可能返回 null，表示取不到有效值。
     * @param Warnings 告警提示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarnings(SubscribeCheckStepTip [] Warnings) {
        this.Warnings = Warnings;
    }

    public SubscribeCheckStepInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubscribeCheckStepInfo(SubscribeCheckStepInfo source) {
        if (source.StepName != null) {
            this.StepName = new String(source.StepName);
        }
        if (source.StepId != null) {
            this.StepId = new String(source.StepId);
        }
        if (source.StepNo != null) {
            this.StepNo = new Long(source.StepNo);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Percent != null) {
            this.Percent = new Long(source.Percent);
        }
        if (source.Errors != null) {
            this.Errors = new SubscribeCheckStepTip[source.Errors.length];
            for (int i = 0; i < source.Errors.length; i++) {
                this.Errors[i] = new SubscribeCheckStepTip(source.Errors[i]);
            }
        }
        if (source.Warnings != null) {
            this.Warnings = new SubscribeCheckStepTip[source.Warnings.length];
            for (int i = 0; i < source.Warnings.length; i++) {
                this.Warnings[i] = new SubscribeCheckStepTip(source.Warnings[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StepName", this.StepName);
        this.setParamSimple(map, prefix + "StepId", this.StepId);
        this.setParamSimple(map, prefix + "StepNo", this.StepNo);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamArrayObj(map, prefix + "Errors.", this.Errors);
        this.setParamArrayObj(map, prefix + "Warnings.", this.Warnings);

    }
}

