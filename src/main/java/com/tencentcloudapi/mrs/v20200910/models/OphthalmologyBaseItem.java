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

public class OphthalmologyBaseItem extends AbstractModel {

    /**
    * 裸眼视力
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BareEyeSight")
    @Expose
    private OphthalmologyBareEyeSight BareEyeSight;

    /**
    * 矫正视力
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CorrectedVisualAcuity")
    @Expose
    private OphthalmologyCorrectedVisualAcuity CorrectedVisualAcuity;

    /**
    * 色觉
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColourVision")
    @Expose
    private OphthalmologyColourVision ColourVision;

    /**
    * 眼底
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Fundoscopy")
    @Expose
    private OphthalmologyFundoscopy Fundoscopy;

    /**
    * 眼科其他
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Others")
    @Expose
    private KeyValueItem [] Others;

    /**
    * 眼科小结
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BriefSummary")
    @Expose
    private OphthalmologyBriefSummary BriefSummary;

    /**
     * Get 裸眼视力
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BareEyeSight 裸眼视力
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OphthalmologyBareEyeSight getBareEyeSight() {
        return this.BareEyeSight;
    }

    /**
     * Set 裸眼视力
注意：此字段可能返回 null，表示取不到有效值。
     * @param BareEyeSight 裸眼视力
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBareEyeSight(OphthalmologyBareEyeSight BareEyeSight) {
        this.BareEyeSight = BareEyeSight;
    }

    /**
     * Get 矫正视力
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CorrectedVisualAcuity 矫正视力
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OphthalmologyCorrectedVisualAcuity getCorrectedVisualAcuity() {
        return this.CorrectedVisualAcuity;
    }

    /**
     * Set 矫正视力
注意：此字段可能返回 null，表示取不到有效值。
     * @param CorrectedVisualAcuity 矫正视力
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCorrectedVisualAcuity(OphthalmologyCorrectedVisualAcuity CorrectedVisualAcuity) {
        this.CorrectedVisualAcuity = CorrectedVisualAcuity;
    }

    /**
     * Get 色觉
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColourVision 色觉
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OphthalmologyColourVision getColourVision() {
        return this.ColourVision;
    }

    /**
     * Set 色觉
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColourVision 色觉
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColourVision(OphthalmologyColourVision ColourVision) {
        this.ColourVision = ColourVision;
    }

    /**
     * Get 眼底
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Fundoscopy 眼底
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OphthalmologyFundoscopy getFundoscopy() {
        return this.Fundoscopy;
    }

    /**
     * Set 眼底
注意：此字段可能返回 null，表示取不到有效值。
     * @param Fundoscopy 眼底
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFundoscopy(OphthalmologyFundoscopy Fundoscopy) {
        this.Fundoscopy = Fundoscopy;
    }

    /**
     * Get 眼科其他
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Others 眼科其他
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueItem [] getOthers() {
        return this.Others;
    }

    /**
     * Set 眼科其他
注意：此字段可能返回 null，表示取不到有效值。
     * @param Others 眼科其他
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOthers(KeyValueItem [] Others) {
        this.Others = Others;
    }

    /**
     * Get 眼科小结
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BriefSummary 眼科小结
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OphthalmologyBriefSummary getBriefSummary() {
        return this.BriefSummary;
    }

    /**
     * Set 眼科小结
注意：此字段可能返回 null，表示取不到有效值。
     * @param BriefSummary 眼科小结
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBriefSummary(OphthalmologyBriefSummary BriefSummary) {
        this.BriefSummary = BriefSummary;
    }

    public OphthalmologyBaseItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OphthalmologyBaseItem(OphthalmologyBaseItem source) {
        if (source.BareEyeSight != null) {
            this.BareEyeSight = new OphthalmologyBareEyeSight(source.BareEyeSight);
        }
        if (source.CorrectedVisualAcuity != null) {
            this.CorrectedVisualAcuity = new OphthalmologyCorrectedVisualAcuity(source.CorrectedVisualAcuity);
        }
        if (source.ColourVision != null) {
            this.ColourVision = new OphthalmologyColourVision(source.ColourVision);
        }
        if (source.Fundoscopy != null) {
            this.Fundoscopy = new OphthalmologyFundoscopy(source.Fundoscopy);
        }
        if (source.Others != null) {
            this.Others = new KeyValueItem[source.Others.length];
            for (int i = 0; i < source.Others.length; i++) {
                this.Others[i] = new KeyValueItem(source.Others[i]);
            }
        }
        if (source.BriefSummary != null) {
            this.BriefSummary = new OphthalmologyBriefSummary(source.BriefSummary);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BareEyeSight.", this.BareEyeSight);
        this.setParamObj(map, prefix + "CorrectedVisualAcuity.", this.CorrectedVisualAcuity);
        this.setParamObj(map, prefix + "ColourVision.", this.ColourVision);
        this.setParamObj(map, prefix + "Fundoscopy.", this.Fundoscopy);
        this.setParamArrayObj(map, prefix + "Others.", this.Others);
        this.setParamObj(map, prefix + "BriefSummary.", this.BriefSummary);

    }
}

