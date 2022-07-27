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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AmountBeforeTaxResult extends AbstractModel{

    /**
    * 税前金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AmountBeforeTax")
    @Expose
    private String AmountBeforeTax;

    /**
    * 两位精度税前金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AmountBeforeTaxWithTwoDigitPrecision")
    @Expose
    private String AmountBeforeTaxWithTwoDigitPrecision;

    /**
     * Get 税前金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AmountBeforeTax 税前金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAmountBeforeTax() {
        return this.AmountBeforeTax;
    }

    /**
     * Set 税前金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param AmountBeforeTax 税前金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAmountBeforeTax(String AmountBeforeTax) {
        this.AmountBeforeTax = AmountBeforeTax;
    }

    /**
     * Get 两位精度税前金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AmountBeforeTaxWithTwoDigitPrecision 两位精度税前金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAmountBeforeTaxWithTwoDigitPrecision() {
        return this.AmountBeforeTaxWithTwoDigitPrecision;
    }

    /**
     * Set 两位精度税前金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param AmountBeforeTaxWithTwoDigitPrecision 两位精度税前金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAmountBeforeTaxWithTwoDigitPrecision(String AmountBeforeTaxWithTwoDigitPrecision) {
        this.AmountBeforeTaxWithTwoDigitPrecision = AmountBeforeTaxWithTwoDigitPrecision;
    }

    public AmountBeforeTaxResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AmountBeforeTaxResult(AmountBeforeTaxResult source) {
        if (source.AmountBeforeTax != null) {
            this.AmountBeforeTax = new String(source.AmountBeforeTax);
        }
        if (source.AmountBeforeTaxWithTwoDigitPrecision != null) {
            this.AmountBeforeTaxWithTwoDigitPrecision = new String(source.AmountBeforeTaxWithTwoDigitPrecision);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AmountBeforeTax", this.AmountBeforeTax);
        this.setParamSimple(map, prefix + "AmountBeforeTaxWithTwoDigitPrecision", this.AmountBeforeTaxWithTwoDigitPrecision);

    }
}

