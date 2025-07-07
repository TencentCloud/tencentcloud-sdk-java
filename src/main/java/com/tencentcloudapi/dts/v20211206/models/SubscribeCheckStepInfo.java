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

public class SubscribeCheckStepInfo extends AbstractModel {

    /**
    * 步骤名称
    */
    @SerializedName("StepName")
    @Expose
    private String StepName;

    /**
    * 步骤Id
    */
    @SerializedName("StepId")
    @Expose
    private String StepId;

    /**
    * 步骤编号，从 1 开始
    */
    @SerializedName("StepNo")
    @Expose
    private Long StepNo;

    /**
    * 当前步骤状态，可能值为 notStarted,running,finished,failed
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 当前步骤进度
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * 错误提示
    */
    @SerializedName("Errors")
    @Expose
    private SubscribeCheckStepTip [] Errors;

    /**
    * 告警提示
    */
    @SerializedName("Warnings")
    @Expose
    private SubscribeCheckStepTip [] Warnings;

    /**
     * Get 步骤名称 
     * @return StepName 步骤名称
     */
    public String getStepName() {
        return this.StepName;
    }

    /**
     * Set 步骤名称
     * @param StepName 步骤名称
     */
    public void setStepName(String StepName) {
        this.StepName = StepName;
    }

    /**
     * Get 步骤Id 
     * @return StepId 步骤Id
     */
    public String getStepId() {
        return this.StepId;
    }

    /**
     * Set 步骤Id
     * @param StepId 步骤Id
     */
    public void setStepId(String StepId) {
        this.StepId = StepId;
    }

    /**
     * Get 步骤编号，从 1 开始 
     * @return StepNo 步骤编号，从 1 开始
     */
    public Long getStepNo() {
        return this.StepNo;
    }

    /**
     * Set 步骤编号，从 1 开始
     * @param StepNo 步骤编号，从 1 开始
     */
    public void setStepNo(Long StepNo) {
        this.StepNo = StepNo;
    }

    /**
     * Get 当前步骤状态，可能值为 notStarted,running,finished,failed 
     * @return Status 当前步骤状态，可能值为 notStarted,running,finished,failed
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 当前步骤状态，可能值为 notStarted,running,finished,failed
     * @param Status 当前步骤状态，可能值为 notStarted,running,finished,failed
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 当前步骤进度 
     * @return Percent 当前步骤进度
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set 当前步骤进度
     * @param Percent 当前步骤进度
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get 错误提示 
     * @return Errors 错误提示
     */
    public SubscribeCheckStepTip [] getErrors() {
        return this.Errors;
    }

    /**
     * Set 错误提示
     * @param Errors 错误提示
     */
    public void setErrors(SubscribeCheckStepTip [] Errors) {
        this.Errors = Errors;
    }

    /**
     * Get 告警提示 
     * @return Warnings 告警提示
     */
    public SubscribeCheckStepTip [] getWarnings() {
        return this.Warnings;
    }

    /**
     * Set 告警提示
     * @param Warnings 告警提示
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

