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

public class StomatologyBaseItem extends AbstractModel{

    /**
    * 龋齿
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ToothDecay")
    @Expose
    private StomatologyToothDecay ToothDecay;

    /**
    * 牙龈
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Gingiva")
    @Expose
    private StomatologyGingiva Gingiva;

    /**
    * 牙周
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Periodontics")
    @Expose
    private StomatologyPeriodontics Periodontics;

    /**
    * 口腔其他
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Others")
    @Expose
    private KeyValueItem [] Others;

    /**
    * 小结
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BriefSummary")
    @Expose
    private StomatologyBriefSummary BriefSummary;

    /**
     * Get 龋齿
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ToothDecay 龋齿
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StomatologyToothDecay getToothDecay() {
        return this.ToothDecay;
    }

    /**
     * Set 龋齿
注意：此字段可能返回 null，表示取不到有效值。
     * @param ToothDecay 龋齿
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setToothDecay(StomatologyToothDecay ToothDecay) {
        this.ToothDecay = ToothDecay;
    }

    /**
     * Get 牙龈
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Gingiva 牙龈
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StomatologyGingiva getGingiva() {
        return this.Gingiva;
    }

    /**
     * Set 牙龈
注意：此字段可能返回 null，表示取不到有效值。
     * @param Gingiva 牙龈
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGingiva(StomatologyGingiva Gingiva) {
        this.Gingiva = Gingiva;
    }

    /**
     * Get 牙周
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Periodontics 牙周
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StomatologyPeriodontics getPeriodontics() {
        return this.Periodontics;
    }

    /**
     * Set 牙周
注意：此字段可能返回 null，表示取不到有效值。
     * @param Periodontics 牙周
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriodontics(StomatologyPeriodontics Periodontics) {
        this.Periodontics = Periodontics;
    }

    /**
     * Get 口腔其他
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Others 口腔其他
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueItem [] getOthers() {
        return this.Others;
    }

    /**
     * Set 口腔其他
注意：此字段可能返回 null，表示取不到有效值。
     * @param Others 口腔其他
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOthers(KeyValueItem [] Others) {
        this.Others = Others;
    }

    /**
     * Get 小结
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BriefSummary 小结
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StomatologyBriefSummary getBriefSummary() {
        return this.BriefSummary;
    }

    /**
     * Set 小结
注意：此字段可能返回 null，表示取不到有效值。
     * @param BriefSummary 小结
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBriefSummary(StomatologyBriefSummary BriefSummary) {
        this.BriefSummary = BriefSummary;
    }

    public StomatologyBaseItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StomatologyBaseItem(StomatologyBaseItem source) {
        if (source.ToothDecay != null) {
            this.ToothDecay = new StomatologyToothDecay(source.ToothDecay);
        }
        if (source.Gingiva != null) {
            this.Gingiva = new StomatologyGingiva(source.Gingiva);
        }
        if (source.Periodontics != null) {
            this.Periodontics = new StomatologyPeriodontics(source.Periodontics);
        }
        if (source.Others != null) {
            this.Others = new KeyValueItem[source.Others.length];
            for (int i = 0; i < source.Others.length; i++) {
                this.Others[i] = new KeyValueItem(source.Others[i]);
            }
        }
        if (source.BriefSummary != null) {
            this.BriefSummary = new StomatologyBriefSummary(source.BriefSummary);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ToothDecay.", this.ToothDecay);
        this.setParamObj(map, prefix + "Gingiva.", this.Gingiva);
        this.setParamObj(map, prefix + "Periodontics.", this.Periodontics);
        this.setParamArrayObj(map, prefix + "Others.", this.Others);
        this.setParamObj(map, prefix + "BriefSummary.", this.BriefSummary);

    }
}

