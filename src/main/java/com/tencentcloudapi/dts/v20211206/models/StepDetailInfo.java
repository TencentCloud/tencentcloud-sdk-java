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

public class StepDetailInfo extends AbstractModel {

    /**
    * <p>步骤序列</p>
    */
    @SerializedName("StepNo")
    @Expose
    private Long StepNo;

    /**
    * <p>步骤展现名称</p>
    */
    @SerializedName("StepName")
    @Expose
    private String StepName;

    /**
    * <p>步骤英文标识</p>
    */
    @SerializedName("StepId")
    @Expose
    private String StepId;

    /**
    * <p>步骤状态:success(成功)、failed(失败)、running(执行中)、notStarted(未执行)、默认为notStarted</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>当前步骤开始的时间，格式为&quot;yyyy-mm-dd hh:mm:ss&quot;，该字段不存在或者为空是无意义 注意：此字段可能返回 null，表示取不到有效值。</p>
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
    * <p>步骤错误信息</p>
    */
    @SerializedName("StepMessage")
    @Expose
    private String StepMessage;

    /**
    * <p>执行进度</p>
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * <p>错误信息</p>
    */
    @SerializedName("Errors")
    @Expose
    private ProcessStepTip [] Errors;

    /**
    * <p>告警提示</p>
    */
    @SerializedName("Warnings")
    @Expose
    private ProcessStepTip [] Warnings;

    /**
     * Get <p>步骤序列</p> 
     * @return StepNo <p>步骤序列</p>
     */
    public Long getStepNo() {
        return this.StepNo;
    }

    /**
     * Set <p>步骤序列</p>
     * @param StepNo <p>步骤序列</p>
     */
    public void setStepNo(Long StepNo) {
        this.StepNo = StepNo;
    }

    /**
     * Get <p>步骤展现名称</p> 
     * @return StepName <p>步骤展现名称</p>
     */
    public String getStepName() {
        return this.StepName;
    }

    /**
     * Set <p>步骤展现名称</p>
     * @param StepName <p>步骤展现名称</p>
     */
    public void setStepName(String StepName) {
        this.StepName = StepName;
    }

    /**
     * Get <p>步骤英文标识</p> 
     * @return StepId <p>步骤英文标识</p>
     */
    public String getStepId() {
        return this.StepId;
    }

    /**
     * Set <p>步骤英文标识</p>
     * @param StepId <p>步骤英文标识</p>
     */
    public void setStepId(String StepId) {
        this.StepId = StepId;
    }

    /**
     * Get <p>步骤状态:success(成功)、failed(失败)、running(执行中)、notStarted(未执行)、默认为notStarted</p> 
     * @return Status <p>步骤状态:success(成功)、failed(失败)、running(执行中)、notStarted(未执行)、默认为notStarted</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>步骤状态:success(成功)、failed(失败)、running(执行中)、notStarted(未执行)、默认为notStarted</p>
     * @param Status <p>步骤状态:success(成功)、failed(失败)、running(执行中)、notStarted(未执行)、默认为notStarted</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>当前步骤开始的时间，格式为&quot;yyyy-mm-dd hh:mm:ss&quot;，该字段不存在或者为空是无意义 注意：此字段可能返回 null，表示取不到有效值。</p> 
     * @return StartTime <p>当前步骤开始的时间，格式为&quot;yyyy-mm-dd hh:mm:ss&quot;，该字段不存在或者为空是无意义 注意：此字段可能返回 null，表示取不到有效值。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>当前步骤开始的时间，格式为&quot;yyyy-mm-dd hh:mm:ss&quot;，该字段不存在或者为空是无意义 注意：此字段可能返回 null，表示取不到有效值。</p>
     * @param StartTime <p>当前步骤开始的时间，格式为&quot;yyyy-mm-dd hh:mm:ss&quot;，该字段不存在或者为空是无意义 注意：此字段可能返回 null，表示取不到有效值。</p>
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
     * Get <p>步骤错误信息</p> 
     * @return StepMessage <p>步骤错误信息</p>
     */
    public String getStepMessage() {
        return this.StepMessage;
    }

    /**
     * Set <p>步骤错误信息</p>
     * @param StepMessage <p>步骤错误信息</p>
     */
    public void setStepMessage(String StepMessage) {
        this.StepMessage = StepMessage;
    }

    /**
     * Get <p>执行进度</p> 
     * @return Percent <p>执行进度</p>
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set <p>执行进度</p>
     * @param Percent <p>执行进度</p>
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get <p>错误信息</p> 
     * @return Errors <p>错误信息</p>
     */
    public ProcessStepTip [] getErrors() {
        return this.Errors;
    }

    /**
     * Set <p>错误信息</p>
     * @param Errors <p>错误信息</p>
     */
    public void setErrors(ProcessStepTip [] Errors) {
        this.Errors = Errors;
    }

    /**
     * Get <p>告警提示</p> 
     * @return Warnings <p>告警提示</p>
     */
    public ProcessStepTip [] getWarnings() {
        return this.Warnings;
    }

    /**
     * Set <p>告警提示</p>
     * @param Warnings <p>告警提示</p>
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
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
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
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "StepMessage", this.StepMessage);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamArrayObj(map, prefix + "Errors.", this.Errors);
        this.setParamArrayObj(map, prefix + "Warnings.", this.Warnings);

    }
}

