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

public class ProcessProgress extends AbstractModel{

    /**
    * 步骤的状态， 包括：notStarted(未开始)、running(运行中)、success(成功)、failed(失败)等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 进度信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * 总的步骤数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StepAll")
    @Expose
    private Long StepAll;

    /**
    * 当前进行的步骤
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StepNow")
    @Expose
    private Long StepNow;

    /**
    * 当前步骤输出提示信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 步骤信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Steps")
    @Expose
    private StepDetailInfo [] Steps;

    /**
     * Get 步骤的状态， 包括：notStarted(未开始)、running(运行中)、success(成功)、failed(失败)等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 步骤的状态， 包括：notStarted(未开始)、running(运行中)、success(成功)、failed(失败)等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 步骤的状态， 包括：notStarted(未开始)、running(运行中)、success(成功)、failed(失败)等
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 步骤的状态， 包括：notStarted(未开始)、running(运行中)、success(成功)、failed(失败)等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 进度信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Percent 进度信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set 进度信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Percent 进度信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get 总的步骤数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StepAll 总的步骤数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStepAll() {
        return this.StepAll;
    }

    /**
     * Set 总的步骤数
注意：此字段可能返回 null，表示取不到有效值。
     * @param StepAll 总的步骤数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStepAll(Long StepAll) {
        this.StepAll = StepAll;
    }

    /**
     * Get 当前进行的步骤
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StepNow 当前进行的步骤
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStepNow() {
        return this.StepNow;
    }

    /**
     * Set 当前进行的步骤
注意：此字段可能返回 null，表示取不到有效值。
     * @param StepNow 当前进行的步骤
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStepNow(Long StepNow) {
        this.StepNow = StepNow;
    }

    /**
     * Get 当前步骤输出提示信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 当前步骤输出提示信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 当前步骤输出提示信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 当前步骤输出提示信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 步骤信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Steps 步骤信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StepDetailInfo [] getSteps() {
        return this.Steps;
    }

    /**
     * Set 步骤信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Steps 步骤信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSteps(StepDetailInfo [] Steps) {
        this.Steps = Steps;
    }

    public ProcessProgress() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessProgress(ProcessProgress source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Percent != null) {
            this.Percent = new Long(source.Percent);
        }
        if (source.StepAll != null) {
            this.StepAll = new Long(source.StepAll);
        }
        if (source.StepNow != null) {
            this.StepNow = new Long(source.StepNow);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Steps != null) {
            this.Steps = new StepDetailInfo[source.Steps.length];
            for (int i = 0; i < source.Steps.length; i++) {
                this.Steps[i] = new StepDetailInfo(source.Steps[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "StepAll", this.StepAll);
        this.setParamSimple(map, prefix + "StepNow", this.StepNow);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamArrayObj(map, prefix + "Steps.", this.Steps);

    }
}

