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
package com.tencentcloudapi.lowcode.v20210108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppJobInfo extends AbstractModel {

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 当前步骤
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Step")
    @Expose
    private Long Step;

    /**
    * 任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 任务总共步骤数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalStep")
    @Expose
    private Long TotalStep;

    /**
    * 当前步骤详情
    */
    @SerializedName("StepDesc")
    @Expose
    private String StepDesc;

    /**
    * 错误信息
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 当前步骤
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Step 当前步骤
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStep() {
        return this.Step;
    }

    /**
     * Set 当前步骤
注意：此字段可能返回 null，表示取不到有效值。
     * @param Step 当前步骤
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStep(Long Step) {
        this.Step = Step;
    }

    /**
     * Get 任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 任务总共步骤数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalStep 任务总共步骤数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalStep() {
        return this.TotalStep;
    }

    /**
     * Set 任务总共步骤数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalStep 任务总共步骤数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalStep(Long TotalStep) {
        this.TotalStep = TotalStep;
    }

    /**
     * Get 当前步骤详情 
     * @return StepDesc 当前步骤详情
     */
    public String getStepDesc() {
        return this.StepDesc;
    }

    /**
     * Set 当前步骤详情
     * @param StepDesc 当前步骤详情
     */
    public void setStepDesc(String StepDesc) {
        this.StepDesc = StepDesc;
    }

    /**
     * Get 错误信息 
     * @return ErrMsg 错误信息
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 错误信息
     * @param ErrMsg 错误信息
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    public AppJobInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppJobInfo(AppJobInfo source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Step != null) {
            this.Step = new Long(source.Step);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.TotalStep != null) {
            this.TotalStep = new Long(source.TotalStep);
        }
        if (source.StepDesc != null) {
            this.StepDesc = new String(source.StepDesc);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Step", this.Step);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TotalStep", this.TotalStep);
        this.setParamSimple(map, prefix + "StepDesc", this.StepDesc);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);

    }
}

