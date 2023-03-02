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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OtherInfo extends AbstractModel{

    /**
    * 麻醉方法
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Anesthesia")
    @Expose
    private SurgeryAttr Anesthesia;

    /**
    * 术中出血
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BloodLoss")
    @Expose
    private SurgeryAttr BloodLoss;

    /**
    * 输血
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BloodTransfusion")
    @Expose
    private SurgeryAttr BloodTransfusion;

    /**
    * 手术用时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private SurgeryAttr Duration;

    /**
    * 手术开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private SurgeryAttr EndTime;

    /**
    * 手术结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private SurgeryAttr StartTime;

    /**
     * Get 麻醉方法
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Anesthesia 麻醉方法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SurgeryAttr getAnesthesia() {
        return this.Anesthesia;
    }

    /**
     * Set 麻醉方法
注意：此字段可能返回 null，表示取不到有效值。
     * @param Anesthesia 麻醉方法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnesthesia(SurgeryAttr Anesthesia) {
        this.Anesthesia = Anesthesia;
    }

    /**
     * Get 术中出血
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BloodLoss 术中出血
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SurgeryAttr getBloodLoss() {
        return this.BloodLoss;
    }

    /**
     * Set 术中出血
注意：此字段可能返回 null，表示取不到有效值。
     * @param BloodLoss 术中出血
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBloodLoss(SurgeryAttr BloodLoss) {
        this.BloodLoss = BloodLoss;
    }

    /**
     * Get 输血
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BloodTransfusion 输血
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SurgeryAttr getBloodTransfusion() {
        return this.BloodTransfusion;
    }

    /**
     * Set 输血
注意：此字段可能返回 null，表示取不到有效值。
     * @param BloodTransfusion 输血
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBloodTransfusion(SurgeryAttr BloodTransfusion) {
        this.BloodTransfusion = BloodTransfusion;
    }

    /**
     * Get 手术用时
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 手术用时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SurgeryAttr getDuration() {
        return this.Duration;
    }

    /**
     * Set 手术用时
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 手术用时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(SurgeryAttr Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 手术开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 手术开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SurgeryAttr getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 手术开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 手术开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(SurgeryAttr EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 手术结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 手术结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SurgeryAttr getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 手术结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 手术结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(SurgeryAttr StartTime) {
        this.StartTime = StartTime;
    }

    public OtherInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OtherInfo(OtherInfo source) {
        if (source.Anesthesia != null) {
            this.Anesthesia = new SurgeryAttr(source.Anesthesia);
        }
        if (source.BloodLoss != null) {
            this.BloodLoss = new SurgeryAttr(source.BloodLoss);
        }
        if (source.BloodTransfusion != null) {
            this.BloodTransfusion = new SurgeryAttr(source.BloodTransfusion);
        }
        if (source.Duration != null) {
            this.Duration = new SurgeryAttr(source.Duration);
        }
        if (source.EndTime != null) {
            this.EndTime = new SurgeryAttr(source.EndTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new SurgeryAttr(source.StartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Anesthesia.", this.Anesthesia);
        this.setParamObj(map, prefix + "BloodLoss.", this.BloodLoss);
        this.setParamObj(map, prefix + "BloodTransfusion.", this.BloodTransfusion);
        this.setParamObj(map, prefix + "Duration.", this.Duration);
        this.setParamObj(map, prefix + "EndTime.", this.EndTime);
        this.setParamObj(map, prefix + "StartTime.", this.StartTime);

    }
}

