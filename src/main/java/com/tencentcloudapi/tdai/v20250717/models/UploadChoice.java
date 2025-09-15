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
package com.tencentcloudapi.tdai.v20250717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadChoice extends AbstractModel {

    /**
    * 消息索引
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * 当前消息步骤
    */
    @SerializedName("StepNo")
    @Expose
    private Long StepNo;

    /**
    * 当前步骤
    */
    @SerializedName("CurrentStep")
    @Expose
    private String CurrentStep;

    /**
    * 增量信息
    */
    @SerializedName("Delta")
    @Expose
    private UploadDelta Delta;

    /**
    * 结束原因
    */
    @SerializedName("FinishReason")
    @Expose
    private String FinishReason;

    /**
    * 错误信息，FinishReason为error时有效
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
     * Get 消息索引 
     * @return Index 消息索引
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set 消息索引
     * @param Index 消息索引
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get 当前消息步骤 
     * @return StepNo 当前消息步骤
     */
    public Long getStepNo() {
        return this.StepNo;
    }

    /**
     * Set 当前消息步骤
     * @param StepNo 当前消息步骤
     */
    public void setStepNo(Long StepNo) {
        this.StepNo = StepNo;
    }

    /**
     * Get 当前步骤 
     * @return CurrentStep 当前步骤
     */
    public String getCurrentStep() {
        return this.CurrentStep;
    }

    /**
     * Set 当前步骤
     * @param CurrentStep 当前步骤
     */
    public void setCurrentStep(String CurrentStep) {
        this.CurrentStep = CurrentStep;
    }

    /**
     * Get 增量信息 
     * @return Delta 增量信息
     */
    public UploadDelta getDelta() {
        return this.Delta;
    }

    /**
     * Set 增量信息
     * @param Delta 增量信息
     */
    public void setDelta(UploadDelta Delta) {
        this.Delta = Delta;
    }

    /**
     * Get 结束原因 
     * @return FinishReason 结束原因
     */
    public String getFinishReason() {
        return this.FinishReason;
    }

    /**
     * Set 结束原因
     * @param FinishReason 结束原因
     */
    public void setFinishReason(String FinishReason) {
        this.FinishReason = FinishReason;
    }

    /**
     * Get 错误信息，FinishReason为error时有效 
     * @return ErrorMessage 错误信息，FinishReason为error时有效
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 错误信息，FinishReason为error时有效
     * @param ErrorMessage 错误信息，FinishReason为error时有效
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    public UploadChoice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadChoice(UploadChoice source) {
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.StepNo != null) {
            this.StepNo = new Long(source.StepNo);
        }
        if (source.CurrentStep != null) {
            this.CurrentStep = new String(source.CurrentStep);
        }
        if (source.Delta != null) {
            this.Delta = new UploadDelta(source.Delta);
        }
        if (source.FinishReason != null) {
            this.FinishReason = new String(source.FinishReason);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "StepNo", this.StepNo);
        this.setParamSimple(map, prefix + "CurrentStep", this.CurrentStep);
        this.setParamObj(map, prefix + "Delta.", this.Delta);
        this.setParamSimple(map, prefix + "FinishReason", this.FinishReason);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);

    }
}

