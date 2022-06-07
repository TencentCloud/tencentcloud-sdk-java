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

public class PayeeTaxTemplateInfo extends AbstractModel{

    /**
    * 收入类型
LABOR: 劳务所得
OCCASION: 偶然所得
    */
    @SerializedName("IncomeType")
    @Expose
    private String IncomeType;

    /**
    * 计税模板ID
    */
    @SerializedName("TaxTemplateId")
    @Expose
    private String TaxTemplateId;

    /**
     * Get 收入类型
LABOR: 劳务所得
OCCASION: 偶然所得 
     * @return IncomeType 收入类型
LABOR: 劳务所得
OCCASION: 偶然所得
     */
    public String getIncomeType() {
        return this.IncomeType;
    }

    /**
     * Set 收入类型
LABOR: 劳务所得
OCCASION: 偶然所得
     * @param IncomeType 收入类型
LABOR: 劳务所得
OCCASION: 偶然所得
     */
    public void setIncomeType(String IncomeType) {
        this.IncomeType = IncomeType;
    }

    /**
     * Get 计税模板ID 
     * @return TaxTemplateId 计税模板ID
     */
    public String getTaxTemplateId() {
        return this.TaxTemplateId;
    }

    /**
     * Set 计税模板ID
     * @param TaxTemplateId 计税模板ID
     */
    public void setTaxTemplateId(String TaxTemplateId) {
        this.TaxTemplateId = TaxTemplateId;
    }

    public PayeeTaxTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PayeeTaxTemplateInfo(PayeeTaxTemplateInfo source) {
        if (source.IncomeType != null) {
            this.IncomeType = new String(source.IncomeType);
        }
        if (source.TaxTemplateId != null) {
            this.TaxTemplateId = new String(source.TaxTemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IncomeType", this.IncomeType);
        this.setParamSimple(map, prefix + "TaxTemplateId", this.TaxTemplateId);

    }
}

