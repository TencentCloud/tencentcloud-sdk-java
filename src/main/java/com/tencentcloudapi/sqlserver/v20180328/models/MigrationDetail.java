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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrationDetail extends AbstractModel{

    /**
    * 总步骤数
    */
    @SerializedName("StepAll")
    @Expose
    private Long StepAll;

    /**
    * 当前步骤
    */
    @SerializedName("StepNow")
    @Expose
    private Long StepNow;

    /**
    * 总进度,如："30"表示30%
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 步骤信息，null表示还未开始迁移
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StepInfo")
    @Expose
    private MigrationStep [] StepInfo;

    /**
     * Get 总步骤数 
     * @return StepAll 总步骤数
     */
    public Long getStepAll() {
        return this.StepAll;
    }

    /**
     * Set 总步骤数
     * @param StepAll 总步骤数
     */
    public void setStepAll(Long StepAll) {
        this.StepAll = StepAll;
    }

    /**
     * Get 当前步骤 
     * @return StepNow 当前步骤
     */
    public Long getStepNow() {
        return this.StepNow;
    }

    /**
     * Set 当前步骤
     * @param StepNow 当前步骤
     */
    public void setStepNow(Long StepNow) {
        this.StepNow = StepNow;
    }

    /**
     * Get 总进度,如："30"表示30% 
     * @return Progress 总进度,如："30"表示30%
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 总进度,如："30"表示30%
     * @param Progress 总进度,如："30"表示30%
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 步骤信息，null表示还未开始迁移
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StepInfo 步骤信息，null表示还未开始迁移
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MigrationStep [] getStepInfo() {
        return this.StepInfo;
    }

    /**
     * Set 步骤信息，null表示还未开始迁移
注意：此字段可能返回 null，表示取不到有效值。
     * @param StepInfo 步骤信息，null表示还未开始迁移
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStepInfo(MigrationStep [] StepInfo) {
        this.StepInfo = StepInfo;
    }

    public MigrationDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrationDetail(MigrationDetail source) {
        if (source.StepAll != null) {
            this.StepAll = new Long(source.StepAll);
        }
        if (source.StepNow != null) {
            this.StepNow = new Long(source.StepNow);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.StepInfo != null) {
            this.StepInfo = new MigrationStep[source.StepInfo.length];
            for (int i = 0; i < source.StepInfo.length; i++) {
                this.StepInfo[i] = new MigrationStep(source.StepInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StepAll", this.StepAll);
        this.setParamSimple(map, prefix + "StepNow", this.StepNow);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamArrayObj(map, prefix + "StepInfo.", this.StepInfo);

    }
}

