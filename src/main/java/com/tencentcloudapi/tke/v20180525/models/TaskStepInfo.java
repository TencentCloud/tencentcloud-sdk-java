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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskStepInfo extends AbstractModel{

    /**
    * 步骤名称
    */
    @SerializedName("Step")
    @Expose
    private String Step;

    /**
    * 生命周期
pending : 步骤未开始
running: 步骤执行中
success: 步骤成功完成
failed: 步骤失败
    */
    @SerializedName("LifeState")
    @Expose
    private String LifeState;

    /**
    * 步骤开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartAt")
    @Expose
    private String StartAt;

    /**
    * 步骤结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndAt")
    @Expose
    private String EndAt;

    /**
    * 若步骤生命周期为failed,则此字段显示错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedMsg")
    @Expose
    private String FailedMsg;

    /**
     * Get 步骤名称 
     * @return Step 步骤名称
     */
    public String getStep() {
        return this.Step;
    }

    /**
     * Set 步骤名称
     * @param Step 步骤名称
     */
    public void setStep(String Step) {
        this.Step = Step;
    }

    /**
     * Get 生命周期
pending : 步骤未开始
running: 步骤执行中
success: 步骤成功完成
failed: 步骤失败 
     * @return LifeState 生命周期
pending : 步骤未开始
running: 步骤执行中
success: 步骤成功完成
failed: 步骤失败
     */
    public String getLifeState() {
        return this.LifeState;
    }

    /**
     * Set 生命周期
pending : 步骤未开始
running: 步骤执行中
success: 步骤成功完成
failed: 步骤失败
     * @param LifeState 生命周期
pending : 步骤未开始
running: 步骤执行中
success: 步骤成功完成
failed: 步骤失败
     */
    public void setLifeState(String LifeState) {
        this.LifeState = LifeState;
    }

    /**
     * Get 步骤开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartAt 步骤开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartAt() {
        return this.StartAt;
    }

    /**
     * Set 步骤开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartAt 步骤开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartAt(String StartAt) {
        this.StartAt = StartAt;
    }

    /**
     * Get 步骤结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndAt 步骤结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndAt() {
        return this.EndAt;
    }

    /**
     * Set 步骤结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndAt 步骤结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndAt(String EndAt) {
        this.EndAt = EndAt;
    }

    /**
     * Get 若步骤生命周期为failed,则此字段显示错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedMsg 若步骤生命周期为failed,则此字段显示错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailedMsg() {
        return this.FailedMsg;
    }

    /**
     * Set 若步骤生命周期为failed,则此字段显示错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedMsg 若步骤生命周期为failed,则此字段显示错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedMsg(String FailedMsg) {
        this.FailedMsg = FailedMsg;
    }

    public TaskStepInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskStepInfo(TaskStepInfo source) {
        if (source.Step != null) {
            this.Step = new String(source.Step);
        }
        if (source.LifeState != null) {
            this.LifeState = new String(source.LifeState);
        }
        if (source.StartAt != null) {
            this.StartAt = new String(source.StartAt);
        }
        if (source.EndAt != null) {
            this.EndAt = new String(source.EndAt);
        }
        if (source.FailedMsg != null) {
            this.FailedMsg = new String(source.FailedMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Step", this.Step);
        this.setParamSimple(map, prefix + "LifeState", this.LifeState);
        this.setParamSimple(map, prefix + "StartAt", this.StartAt);
        this.setParamSimple(map, prefix + "EndAt", this.EndAt);
        this.setParamSimple(map, prefix + "FailedMsg", this.FailedMsg);

    }
}

