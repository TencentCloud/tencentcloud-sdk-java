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

public class SurgeryHistory extends AbstractModel{

    /**
    * 手术名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SurgeryName")
    @Expose
    private SurgeryAttr SurgeryName;

    /**
    * 手术日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SurgeryDate")
    @Expose
    private SurgeryAttr SurgeryDate;

    /**
    * 术前诊断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PreoperativePathology")
    @Expose
    private SurgeryAttr PreoperativePathology;

    /**
    * 术中诊断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntraoperativePathology")
    @Expose
    private SurgeryAttr IntraoperativePathology;

    /**
    * 术后诊断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PostoperativePathology")
    @Expose
    private SurgeryAttr PostoperativePathology;

    /**
    * 出院诊断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DischargeDiagnosis")
    @Expose
    private SurgeryAttr DischargeDiagnosis;

    /**
     * Get 手术名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SurgeryName 手术名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SurgeryAttr getSurgeryName() {
        return this.SurgeryName;
    }

    /**
     * Set 手术名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SurgeryName 手术名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSurgeryName(SurgeryAttr SurgeryName) {
        this.SurgeryName = SurgeryName;
    }

    /**
     * Get 手术日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SurgeryDate 手术日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SurgeryAttr getSurgeryDate() {
        return this.SurgeryDate;
    }

    /**
     * Set 手术日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param SurgeryDate 手术日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSurgeryDate(SurgeryAttr SurgeryDate) {
        this.SurgeryDate = SurgeryDate;
    }

    /**
     * Get 术前诊断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PreoperativePathology 术前诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SurgeryAttr getPreoperativePathology() {
        return this.PreoperativePathology;
    }

    /**
     * Set 术前诊断
注意：此字段可能返回 null，表示取不到有效值。
     * @param PreoperativePathology 术前诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPreoperativePathology(SurgeryAttr PreoperativePathology) {
        this.PreoperativePathology = PreoperativePathology;
    }

    /**
     * Get 术中诊断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntraoperativePathology 术中诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SurgeryAttr getIntraoperativePathology() {
        return this.IntraoperativePathology;
    }

    /**
     * Set 术中诊断
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntraoperativePathology 术中诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntraoperativePathology(SurgeryAttr IntraoperativePathology) {
        this.IntraoperativePathology = IntraoperativePathology;
    }

    /**
     * Get 术后诊断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PostoperativePathology 术后诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SurgeryAttr getPostoperativePathology() {
        return this.PostoperativePathology;
    }

    /**
     * Set 术后诊断
注意：此字段可能返回 null，表示取不到有效值。
     * @param PostoperativePathology 术后诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPostoperativePathology(SurgeryAttr PostoperativePathology) {
        this.PostoperativePathology = PostoperativePathology;
    }

    /**
     * Get 出院诊断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DischargeDiagnosis 出院诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SurgeryAttr getDischargeDiagnosis() {
        return this.DischargeDiagnosis;
    }

    /**
     * Set 出院诊断
注意：此字段可能返回 null，表示取不到有效值。
     * @param DischargeDiagnosis 出院诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDischargeDiagnosis(SurgeryAttr DischargeDiagnosis) {
        this.DischargeDiagnosis = DischargeDiagnosis;
    }

    public SurgeryHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SurgeryHistory(SurgeryHistory source) {
        if (source.SurgeryName != null) {
            this.SurgeryName = new SurgeryAttr(source.SurgeryName);
        }
        if (source.SurgeryDate != null) {
            this.SurgeryDate = new SurgeryAttr(source.SurgeryDate);
        }
        if (source.PreoperativePathology != null) {
            this.PreoperativePathology = new SurgeryAttr(source.PreoperativePathology);
        }
        if (source.IntraoperativePathology != null) {
            this.IntraoperativePathology = new SurgeryAttr(source.IntraoperativePathology);
        }
        if (source.PostoperativePathology != null) {
            this.PostoperativePathology = new SurgeryAttr(source.PostoperativePathology);
        }
        if (source.DischargeDiagnosis != null) {
            this.DischargeDiagnosis = new SurgeryAttr(source.DischargeDiagnosis);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SurgeryName.", this.SurgeryName);
        this.setParamObj(map, prefix + "SurgeryDate.", this.SurgeryDate);
        this.setParamObj(map, prefix + "PreoperativePathology.", this.PreoperativePathology);
        this.setParamObj(map, prefix + "IntraoperativePathology.", this.IntraoperativePathology);
        this.setParamObj(map, prefix + "PostoperativePathology.", this.PostoperativePathology);
        this.setParamObj(map, prefix + "DischargeDiagnosis.", this.DischargeDiagnosis);

    }
}

