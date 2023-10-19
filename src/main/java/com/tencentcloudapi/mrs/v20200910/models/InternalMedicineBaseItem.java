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

public class InternalMedicineBaseItem extends AbstractModel {

    /**
    * 体检报告-内科-腹部
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Abdomen")
    @Expose
    private InternalMedicineAbdomen Abdomen;

    /**
    * 体检报告-内科-心脏
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Heart")
    @Expose
    private InternalMedicineHeart Heart;

    /**
    * 体检报告-内科-血管
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vessel")
    @Expose
    private InternalMedicineVessel Vessel;

    /**
    * 体检报告-内科-呼吸系统
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RespiratorySystem")
    @Expose
    private InternalMedicineRespiratorySystem RespiratorySystem;

    /**
    * 体检报告-内科-内科其他
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Others")
    @Expose
    private KeyValueItem [] Others;

    /**
    * 体检报告-内科-小结
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BriefSummary")
    @Expose
    private InternalMedicineBriefSummary BriefSummary;

    /**
     * Get 体检报告-内科-腹部
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Abdomen 体检报告-内科-腹部
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InternalMedicineAbdomen getAbdomen() {
        return this.Abdomen;
    }

    /**
     * Set 体检报告-内科-腹部
注意：此字段可能返回 null，表示取不到有效值。
     * @param Abdomen 体检报告-内科-腹部
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAbdomen(InternalMedicineAbdomen Abdomen) {
        this.Abdomen = Abdomen;
    }

    /**
     * Get 体检报告-内科-心脏
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Heart 体检报告-内科-心脏
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InternalMedicineHeart getHeart() {
        return this.Heart;
    }

    /**
     * Set 体检报告-内科-心脏
注意：此字段可能返回 null，表示取不到有效值。
     * @param Heart 体检报告-内科-心脏
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeart(InternalMedicineHeart Heart) {
        this.Heart = Heart;
    }

    /**
     * Get 体检报告-内科-血管
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vessel 体检报告-内科-血管
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InternalMedicineVessel getVessel() {
        return this.Vessel;
    }

    /**
     * Set 体检报告-内科-血管
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vessel 体检报告-内科-血管
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVessel(InternalMedicineVessel Vessel) {
        this.Vessel = Vessel;
    }

    /**
     * Get 体检报告-内科-呼吸系统
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RespiratorySystem 体检报告-内科-呼吸系统
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InternalMedicineRespiratorySystem getRespiratorySystem() {
        return this.RespiratorySystem;
    }

    /**
     * Set 体检报告-内科-呼吸系统
注意：此字段可能返回 null，表示取不到有效值。
     * @param RespiratorySystem 体检报告-内科-呼吸系统
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRespiratorySystem(InternalMedicineRespiratorySystem RespiratorySystem) {
        this.RespiratorySystem = RespiratorySystem;
    }

    /**
     * Get 体检报告-内科-内科其他
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Others 体检报告-内科-内科其他
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueItem [] getOthers() {
        return this.Others;
    }

    /**
     * Set 体检报告-内科-内科其他
注意：此字段可能返回 null，表示取不到有效值。
     * @param Others 体检报告-内科-内科其他
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOthers(KeyValueItem [] Others) {
        this.Others = Others;
    }

    /**
     * Get 体检报告-内科-小结
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BriefSummary 体检报告-内科-小结
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InternalMedicineBriefSummary getBriefSummary() {
        return this.BriefSummary;
    }

    /**
     * Set 体检报告-内科-小结
注意：此字段可能返回 null，表示取不到有效值。
     * @param BriefSummary 体检报告-内科-小结
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBriefSummary(InternalMedicineBriefSummary BriefSummary) {
        this.BriefSummary = BriefSummary;
    }

    public InternalMedicineBaseItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InternalMedicineBaseItem(InternalMedicineBaseItem source) {
        if (source.Abdomen != null) {
            this.Abdomen = new InternalMedicineAbdomen(source.Abdomen);
        }
        if (source.Heart != null) {
            this.Heart = new InternalMedicineHeart(source.Heart);
        }
        if (source.Vessel != null) {
            this.Vessel = new InternalMedicineVessel(source.Vessel);
        }
        if (source.RespiratorySystem != null) {
            this.RespiratorySystem = new InternalMedicineRespiratorySystem(source.RespiratorySystem);
        }
        if (source.Others != null) {
            this.Others = new KeyValueItem[source.Others.length];
            for (int i = 0; i < source.Others.length; i++) {
                this.Others[i] = new KeyValueItem(source.Others[i]);
            }
        }
        if (source.BriefSummary != null) {
            this.BriefSummary = new InternalMedicineBriefSummary(source.BriefSummary);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Abdomen.", this.Abdomen);
        this.setParamObj(map, prefix + "Heart.", this.Heart);
        this.setParamObj(map, prefix + "Vessel.", this.Vessel);
        this.setParamObj(map, prefix + "RespiratorySystem.", this.RespiratorySystem);
        this.setParamArrayObj(map, prefix + "Others.", this.Others);
        this.setParamObj(map, prefix + "BriefSummary.", this.BriefSummary);

    }
}

