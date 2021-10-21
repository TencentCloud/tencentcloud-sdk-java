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

public class Electrocardiogram extends AbstractModel{

    /**
    * 心电图详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EcgDescription")
    @Expose
    private EcgDescription EcgDescription;

    /**
    * 心电图诊断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EcgDiagnosis")
    @Expose
    private EcgDiagnosis EcgDiagnosis;

    /**
     * Get 心电图详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EcgDescription 心电图详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EcgDescription getEcgDescription() {
        return this.EcgDescription;
    }

    /**
     * Set 心电图详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param EcgDescription 心电图详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEcgDescription(EcgDescription EcgDescription) {
        this.EcgDescription = EcgDescription;
    }

    /**
     * Get 心电图诊断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EcgDiagnosis 心电图诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EcgDiagnosis getEcgDiagnosis() {
        return this.EcgDiagnosis;
    }

    /**
     * Set 心电图诊断
注意：此字段可能返回 null，表示取不到有效值。
     * @param EcgDiagnosis 心电图诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEcgDiagnosis(EcgDiagnosis EcgDiagnosis) {
        this.EcgDiagnosis = EcgDiagnosis;
    }

    public Electrocardiogram() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Electrocardiogram(Electrocardiogram source) {
        if (source.EcgDescription != null) {
            this.EcgDescription = new EcgDescription(source.EcgDescription);
        }
        if (source.EcgDiagnosis != null) {
            this.EcgDiagnosis = new EcgDiagnosis(source.EcgDiagnosis);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "EcgDescription.", this.EcgDescription);
        this.setParamObj(map, prefix + "EcgDiagnosis.", this.EcgDiagnosis);

    }
}

