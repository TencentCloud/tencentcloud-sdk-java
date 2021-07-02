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

public class DiseaseHistory extends AbstractModel{

    /**
    * 过敏史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Allergy")
    @Expose
    private String Allergy;

    /**
    * 传染疾病史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Infect")
    @Expose
    private String Infect;

    /**
    * 主要病史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MainDisease")
    @Expose
    private String MainDisease;

    /**
    * 手术外伤史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 输血史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Transfusion")
    @Expose
    private String Transfusion;

    /**
    * 疾病史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Disease")
    @Expose
    private String Disease;

    /**
     * Get 过敏史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Allergy 过敏史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAllergy() {
        return this.Allergy;
    }

    /**
     * Set 过敏史
注意：此字段可能返回 null，表示取不到有效值。
     * @param Allergy 过敏史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllergy(String Allergy) {
        this.Allergy = Allergy;
    }

    /**
     * Get 传染疾病史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Infect 传染疾病史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInfect() {
        return this.Infect;
    }

    /**
     * Set 传染疾病史
注意：此字段可能返回 null，表示取不到有效值。
     * @param Infect 传染疾病史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInfect(String Infect) {
        this.Infect = Infect;
    }

    /**
     * Get 主要病史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MainDisease 主要病史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMainDisease() {
        return this.MainDisease;
    }

    /**
     * Set 主要病史
注意：此字段可能返回 null，表示取不到有效值。
     * @param MainDisease 主要病史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMainDisease(String MainDisease) {
        this.MainDisease = MainDisease;
    }

    /**
     * Get 手术外伤史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operation 手术外伤史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 手术外伤史
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operation 手术外伤史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 输血史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Transfusion 输血史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTransfusion() {
        return this.Transfusion;
    }

    /**
     * Set 输血史
注意：此字段可能返回 null，表示取不到有效值。
     * @param Transfusion 输血史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransfusion(String Transfusion) {
        this.Transfusion = Transfusion;
    }

    /**
     * Get 疾病史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Disease 疾病史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisease() {
        return this.Disease;
    }

    /**
     * Set 疾病史
注意：此字段可能返回 null，表示取不到有效值。
     * @param Disease 疾病史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisease(String Disease) {
        this.Disease = Disease;
    }

    public DiseaseHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiseaseHistory(DiseaseHistory source) {
        if (source.Allergy != null) {
            this.Allergy = new String(source.Allergy);
        }
        if (source.Infect != null) {
            this.Infect = new String(source.Infect);
        }
        if (source.MainDisease != null) {
            this.MainDisease = new String(source.MainDisease);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.Transfusion != null) {
            this.Transfusion = new String(source.Transfusion);
        }
        if (source.Disease != null) {
            this.Disease = new String(source.Disease);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Allergy", this.Allergy);
        this.setParamSimple(map, prefix + "Infect", this.Infect);
        this.setParamSimple(map, prefix + "MainDisease", this.MainDisease);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "Transfusion", this.Transfusion);
        this.setParamSimple(map, prefix + "Disease", this.Disease);

    }
}

