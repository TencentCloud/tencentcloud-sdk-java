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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PhysicalExamination extends AbstractModel {

    /**
    * 一般检查
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GeneralExamination")
    @Expose
    private GeneralExaminationBaseItem GeneralExamination;

    /**
    * 内科
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InternalMedicine")
    @Expose
    private InternalMedicineBaseItem InternalMedicine;

    /**
    * 外科
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Surgery")
    @Expose
    private SurgeryBaseItem Surgery;

    /**
    * 口腔科
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Stomatology")
    @Expose
    private StomatologyBaseItem Stomatology;

    /**
    * 眼科
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ophthalmology")
    @Expose
    private OphthalmologyBaseItem Ophthalmology;

    /**
    * 耳鼻喉科
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Otolaryngology")
    @Expose
    private OtolaryngologyBaseItem Otolaryngology;

    /**
    * 妇科
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Gynaecology")
    @Expose
    private GynaecologyBaseItem Gynaecology;

    /**
    * 未标准化
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Unclassified")
    @Expose
    private KeyValueItem [] Unclassified;

    /**
     * Get 一般检查
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GeneralExamination 一般检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GeneralExaminationBaseItem getGeneralExamination() {
        return this.GeneralExamination;
    }

    /**
     * Set 一般检查
注意：此字段可能返回 null，表示取不到有效值。
     * @param GeneralExamination 一般检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGeneralExamination(GeneralExaminationBaseItem GeneralExamination) {
        this.GeneralExamination = GeneralExamination;
    }

    /**
     * Get 内科
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InternalMedicine 内科
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InternalMedicineBaseItem getInternalMedicine() {
        return this.InternalMedicine;
    }

    /**
     * Set 内科
注意：此字段可能返回 null，表示取不到有效值。
     * @param InternalMedicine 内科
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInternalMedicine(InternalMedicineBaseItem InternalMedicine) {
        this.InternalMedicine = InternalMedicine;
    }

    /**
     * Get 外科
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Surgery 外科
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SurgeryBaseItem getSurgery() {
        return this.Surgery;
    }

    /**
     * Set 外科
注意：此字段可能返回 null，表示取不到有效值。
     * @param Surgery 外科
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSurgery(SurgeryBaseItem Surgery) {
        this.Surgery = Surgery;
    }

    /**
     * Get 口腔科
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Stomatology 口腔科
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StomatologyBaseItem getStomatology() {
        return this.Stomatology;
    }

    /**
     * Set 口腔科
注意：此字段可能返回 null，表示取不到有效值。
     * @param Stomatology 口腔科
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStomatology(StomatologyBaseItem Stomatology) {
        this.Stomatology = Stomatology;
    }

    /**
     * Get 眼科
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ophthalmology 眼科
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OphthalmologyBaseItem getOphthalmology() {
        return this.Ophthalmology;
    }

    /**
     * Set 眼科
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ophthalmology 眼科
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOphthalmology(OphthalmologyBaseItem Ophthalmology) {
        this.Ophthalmology = Ophthalmology;
    }

    /**
     * Get 耳鼻喉科
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Otolaryngology 耳鼻喉科
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OtolaryngologyBaseItem getOtolaryngology() {
        return this.Otolaryngology;
    }

    /**
     * Set 耳鼻喉科
注意：此字段可能返回 null，表示取不到有效值。
     * @param Otolaryngology 耳鼻喉科
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOtolaryngology(OtolaryngologyBaseItem Otolaryngology) {
        this.Otolaryngology = Otolaryngology;
    }

    /**
     * Get 妇科
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Gynaecology 妇科
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GynaecologyBaseItem getGynaecology() {
        return this.Gynaecology;
    }

    /**
     * Set 妇科
注意：此字段可能返回 null，表示取不到有效值。
     * @param Gynaecology 妇科
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGynaecology(GynaecologyBaseItem Gynaecology) {
        this.Gynaecology = Gynaecology;
    }

    /**
     * Get 未标准化
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Unclassified 未标准化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueItem [] getUnclassified() {
        return this.Unclassified;
    }

    /**
     * Set 未标准化
注意：此字段可能返回 null，表示取不到有效值。
     * @param Unclassified 未标准化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnclassified(KeyValueItem [] Unclassified) {
        this.Unclassified = Unclassified;
    }

    public PhysicalExamination() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PhysicalExamination(PhysicalExamination source) {
        if (source.GeneralExamination != null) {
            this.GeneralExamination = new GeneralExaminationBaseItem(source.GeneralExamination);
        }
        if (source.InternalMedicine != null) {
            this.InternalMedicine = new InternalMedicineBaseItem(source.InternalMedicine);
        }
        if (source.Surgery != null) {
            this.Surgery = new SurgeryBaseItem(source.Surgery);
        }
        if (source.Stomatology != null) {
            this.Stomatology = new StomatologyBaseItem(source.Stomatology);
        }
        if (source.Ophthalmology != null) {
            this.Ophthalmology = new OphthalmologyBaseItem(source.Ophthalmology);
        }
        if (source.Otolaryngology != null) {
            this.Otolaryngology = new OtolaryngologyBaseItem(source.Otolaryngology);
        }
        if (source.Gynaecology != null) {
            this.Gynaecology = new GynaecologyBaseItem(source.Gynaecology);
        }
        if (source.Unclassified != null) {
            this.Unclassified = new KeyValueItem[source.Unclassified.length];
            for (int i = 0; i < source.Unclassified.length; i++) {
                this.Unclassified[i] = new KeyValueItem(source.Unclassified[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "GeneralExamination.", this.GeneralExamination);
        this.setParamObj(map, prefix + "InternalMedicine.", this.InternalMedicine);
        this.setParamObj(map, prefix + "Surgery.", this.Surgery);
        this.setParamObj(map, prefix + "Stomatology.", this.Stomatology);
        this.setParamObj(map, prefix + "Ophthalmology.", this.Ophthalmology);
        this.setParamObj(map, prefix + "Otolaryngology.", this.Otolaryngology);
        this.setParamObj(map, prefix + "Gynaecology.", this.Gynaecology);
        this.setParamArrayObj(map, prefix + "Unclassified.", this.Unclassified);

    }
}

