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

public class MenstrualMedicalHistory extends AbstractModel{

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastMenstrualPeriod")
    @Expose
    private String LastMenstrualPeriod;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MenstrualFlow")
    @Expose
    private String MenstrualFlow;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MenarcheAge")
    @Expose
    private String MenarcheAge;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MenstruationOrNot")
    @Expose
    private String MenstruationOrNot;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MenstrualCycles")
    @Expose
    private String MenstrualCycles;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MenstrualPeriod")
    @Expose
    private String MenstrualPeriod;

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastMenstrualPeriod “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastMenstrualPeriod() {
        return this.LastMenstrualPeriod;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastMenstrualPeriod “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastMenstrualPeriod(String LastMenstrualPeriod) {
        this.LastMenstrualPeriod = LastMenstrualPeriod;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MenstrualFlow “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMenstrualFlow() {
        return this.MenstrualFlow;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param MenstrualFlow “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMenstrualFlow(String MenstrualFlow) {
        this.MenstrualFlow = MenstrualFlow;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MenarcheAge “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMenarcheAge() {
        return this.MenarcheAge;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param MenarcheAge “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMenarcheAge(String MenarcheAge) {
        this.MenarcheAge = MenarcheAge;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MenstruationOrNot “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMenstruationOrNot() {
        return this.MenstruationOrNot;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param MenstruationOrNot “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMenstruationOrNot(String MenstruationOrNot) {
        this.MenstruationOrNot = MenstruationOrNot;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MenstrualCycles “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMenstrualCycles() {
        return this.MenstrualCycles;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param MenstrualCycles “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMenstrualCycles(String MenstrualCycles) {
        this.MenstrualCycles = MenstrualCycles;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MenstrualPeriod “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMenstrualPeriod() {
        return this.MenstrualPeriod;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param MenstrualPeriod “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMenstrualPeriod(String MenstrualPeriod) {
        this.MenstrualPeriod = MenstrualPeriod;
    }

    public MenstrualMedicalHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MenstrualMedicalHistory(MenstrualMedicalHistory source) {
        if (source.LastMenstrualPeriod != null) {
            this.LastMenstrualPeriod = new String(source.LastMenstrualPeriod);
        }
        if (source.MenstrualFlow != null) {
            this.MenstrualFlow = new String(source.MenstrualFlow);
        }
        if (source.MenarcheAge != null) {
            this.MenarcheAge = new String(source.MenarcheAge);
        }
        if (source.MenstruationOrNot != null) {
            this.MenstruationOrNot = new String(source.MenstruationOrNot);
        }
        if (source.MenstrualCycles != null) {
            this.MenstrualCycles = new String(source.MenstrualCycles);
        }
        if (source.MenstrualPeriod != null) {
            this.MenstrualPeriod = new String(source.MenstrualPeriod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LastMenstrualPeriod", this.LastMenstrualPeriod);
        this.setParamSimple(map, prefix + "MenstrualFlow", this.MenstrualFlow);
        this.setParamSimple(map, prefix + "MenarcheAge", this.MenarcheAge);
        this.setParamSimple(map, prefix + "MenstruationOrNot", this.MenstruationOrNot);
        this.setParamSimple(map, prefix + "MenstrualCycles", this.MenstrualCycles);
        this.setParamSimple(map, prefix + "MenstrualPeriod", this.MenstrualPeriod);

    }
}

