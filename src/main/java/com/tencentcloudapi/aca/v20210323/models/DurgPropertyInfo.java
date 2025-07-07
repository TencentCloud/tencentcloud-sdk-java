/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.aca.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DurgPropertyInfo extends AbstractModel {

    /**
    * 药品类型 1:西药,2:中成药,3:中药,4:化学药品,5:生物制药
    */
    @SerializedName("DrugType")
    @Expose
    private Long DrugType;

    /**
    * 抗菌药分类 1:抗真菌药物, 2:抗细菌药物, 3:抗结核药物, 4:其他抗菌药, 0:普通药品
    */
    @SerializedName("AntibacterialType")
    @Expose
    private Long AntibacterialType;

    /**
    * 抗菌药级别 1:非限制级, 2:限制级, 3:特殊使用级 
    */
    @SerializedName("AntibacterialClass")
    @Expose
    private Long AntibacterialClass;

    /**
    * 特殊药品类型 1:毒性药品, 2:麻醉药品, 3:放射药品, 4:精神一类药品, 5:精神二类药品, 6:其他特管药品， 7:贵重药品
    */
    @SerializedName("SpeciallyDrugType")
    @Expose
    private Long SpeciallyDrugType;

    /**
    * 是否为基本药物 1:是, 2:否, 0:未知
    */
    @SerializedName("IsBasicDrug")
    @Expose
    private Long IsBasicDrug;

    /**
    * 社保药品 1:甲类药品, 2:乙类药品, 3:双跨药品, 4:自费药品, 0:未知
    */
    @SerializedName("ChargeType")
    @Expose
    private Long ChargeType;

    /**
     * Get 药品类型 1:西药,2:中成药,3:中药,4:化学药品,5:生物制药 
     * @return DrugType 药品类型 1:西药,2:中成药,3:中药,4:化学药品,5:生物制药
     */
    public Long getDrugType() {
        return this.DrugType;
    }

    /**
     * Set 药品类型 1:西药,2:中成药,3:中药,4:化学药品,5:生物制药
     * @param DrugType 药品类型 1:西药,2:中成药,3:中药,4:化学药品,5:生物制药
     */
    public void setDrugType(Long DrugType) {
        this.DrugType = DrugType;
    }

    /**
     * Get 抗菌药分类 1:抗真菌药物, 2:抗细菌药物, 3:抗结核药物, 4:其他抗菌药, 0:普通药品 
     * @return AntibacterialType 抗菌药分类 1:抗真菌药物, 2:抗细菌药物, 3:抗结核药物, 4:其他抗菌药, 0:普通药品
     */
    public Long getAntibacterialType() {
        return this.AntibacterialType;
    }

    /**
     * Set 抗菌药分类 1:抗真菌药物, 2:抗细菌药物, 3:抗结核药物, 4:其他抗菌药, 0:普通药品
     * @param AntibacterialType 抗菌药分类 1:抗真菌药物, 2:抗细菌药物, 3:抗结核药物, 4:其他抗菌药, 0:普通药品
     */
    public void setAntibacterialType(Long AntibacterialType) {
        this.AntibacterialType = AntibacterialType;
    }

    /**
     * Get 抗菌药级别 1:非限制级, 2:限制级, 3:特殊使用级  
     * @return AntibacterialClass 抗菌药级别 1:非限制级, 2:限制级, 3:特殊使用级 
     */
    public Long getAntibacterialClass() {
        return this.AntibacterialClass;
    }

    /**
     * Set 抗菌药级别 1:非限制级, 2:限制级, 3:特殊使用级 
     * @param AntibacterialClass 抗菌药级别 1:非限制级, 2:限制级, 3:特殊使用级 
     */
    public void setAntibacterialClass(Long AntibacterialClass) {
        this.AntibacterialClass = AntibacterialClass;
    }

    /**
     * Get 特殊药品类型 1:毒性药品, 2:麻醉药品, 3:放射药品, 4:精神一类药品, 5:精神二类药品, 6:其他特管药品， 7:贵重药品 
     * @return SpeciallyDrugType 特殊药品类型 1:毒性药品, 2:麻醉药品, 3:放射药品, 4:精神一类药品, 5:精神二类药品, 6:其他特管药品， 7:贵重药品
     */
    public Long getSpeciallyDrugType() {
        return this.SpeciallyDrugType;
    }

    /**
     * Set 特殊药品类型 1:毒性药品, 2:麻醉药品, 3:放射药品, 4:精神一类药品, 5:精神二类药品, 6:其他特管药品， 7:贵重药品
     * @param SpeciallyDrugType 特殊药品类型 1:毒性药品, 2:麻醉药品, 3:放射药品, 4:精神一类药品, 5:精神二类药品, 6:其他特管药品， 7:贵重药品
     */
    public void setSpeciallyDrugType(Long SpeciallyDrugType) {
        this.SpeciallyDrugType = SpeciallyDrugType;
    }

    /**
     * Get 是否为基本药物 1:是, 2:否, 0:未知 
     * @return IsBasicDrug 是否为基本药物 1:是, 2:否, 0:未知
     */
    public Long getIsBasicDrug() {
        return this.IsBasicDrug;
    }

    /**
     * Set 是否为基本药物 1:是, 2:否, 0:未知
     * @param IsBasicDrug 是否为基本药物 1:是, 2:否, 0:未知
     */
    public void setIsBasicDrug(Long IsBasicDrug) {
        this.IsBasicDrug = IsBasicDrug;
    }

    /**
     * Get 社保药品 1:甲类药品, 2:乙类药品, 3:双跨药品, 4:自费药品, 0:未知 
     * @return ChargeType 社保药品 1:甲类药品, 2:乙类药品, 3:双跨药品, 4:自费药品, 0:未知
     */
    public Long getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 社保药品 1:甲类药品, 2:乙类药品, 3:双跨药品, 4:自费药品, 0:未知
     * @param ChargeType 社保药品 1:甲类药品, 2:乙类药品, 3:双跨药品, 4:自费药品, 0:未知
     */
    public void setChargeType(Long ChargeType) {
        this.ChargeType = ChargeType;
    }

    public DurgPropertyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DurgPropertyInfo(DurgPropertyInfo source) {
        if (source.DrugType != null) {
            this.DrugType = new Long(source.DrugType);
        }
        if (source.AntibacterialType != null) {
            this.AntibacterialType = new Long(source.AntibacterialType);
        }
        if (source.AntibacterialClass != null) {
            this.AntibacterialClass = new Long(source.AntibacterialClass);
        }
        if (source.SpeciallyDrugType != null) {
            this.SpeciallyDrugType = new Long(source.SpeciallyDrugType);
        }
        if (source.IsBasicDrug != null) {
            this.IsBasicDrug = new Long(source.IsBasicDrug);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new Long(source.ChargeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DrugType", this.DrugType);
        this.setParamSimple(map, prefix + "AntibacterialType", this.AntibacterialType);
        this.setParamSimple(map, prefix + "AntibacterialClass", this.AntibacterialClass);
        this.setParamSimple(map, prefix + "SpeciallyDrugType", this.SpeciallyDrugType);
        this.setParamSimple(map, prefix + "IsBasicDrug", this.IsBasicDrug);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);

    }
}

