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

public class BiologicalProductInfo extends AbstractModel {

    /**
    * 药品名称，包括通用名和商品名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private BiologicalProductInfoName Name;

    /**
    * 成份和性状
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IngredientAndAppearance")
    @Expose
    private BiologicalProductInfoIngredientAndAppearance IngredientAndAppearance;

    /**
    * 接种对象
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VaccinationTarget")
    @Expose
    private BiologicalProductInfoVaccinationTarget VaccinationTarget;

    /**
    * 作用与用途
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Indications")
    @Expose
    private BiologicalProductInfoIndications Indications;

    /**
    * 规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Brochure")
    @Expose
    private BiologicalProductInfoBrochure Brochure;

    /**
    * 免疫程序和剂量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Dosage")
    @Expose
    private BiologicalProductInfoDosage Dosage;

    /**
    * 不良反应
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdverseReaction")
    @Expose
    private BiologicalProductInfoAdverseReaction AdverseReaction;

    /**
    * 禁忌情况
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Contraindications")
    @Expose
    private BiologicalProductInfoContraindications Contraindications;

    /**
    * 注意事项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Precautions")
    @Expose
    private BiologicalProductInfoPrecautions Precautions;

    /**
    * 储存条件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Storage")
    @Expose
    private BiologicalProductInfoStorage Storage;

    /**
    * 包装信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Packaging")
    @Expose
    private BiologicalProductInfoPackaging Packaging;

    /**
    * 有效期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValidityPeriod")
    @Expose
    private BiologicalProductInfoValidityPeriod ValidityPeriod;

    /**
    * 执行标准
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutiveStandards")
    @Expose
    private BiologicalProductInfoExecutiveStandards ExecutiveStandards;

    /**
    * 批准文号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Approval")
    @Expose
    private BiologicalProductInfoApproval Approval;

    /**
    * 生产企业名称和地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Manufacturer")
    @Expose
    private BiologicalProductInfoManufacturer Manufacturer;

    /**
     * Get 药品名称，包括通用名和商品名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 药品名称，包括通用名和商品名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BiologicalProductInfoName getName() {
        return this.Name;
    }

    /**
     * Set 药品名称，包括通用名和商品名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 药品名称，包括通用名和商品名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(BiologicalProductInfoName Name) {
        this.Name = Name;
    }

    /**
     * Get 成份和性状
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IngredientAndAppearance 成份和性状
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BiologicalProductInfoIngredientAndAppearance getIngredientAndAppearance() {
        return this.IngredientAndAppearance;
    }

    /**
     * Set 成份和性状
注意：此字段可能返回 null，表示取不到有效值。
     * @param IngredientAndAppearance 成份和性状
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIngredientAndAppearance(BiologicalProductInfoIngredientAndAppearance IngredientAndAppearance) {
        this.IngredientAndAppearance = IngredientAndAppearance;
    }

    /**
     * Get 接种对象
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VaccinationTarget 接种对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BiologicalProductInfoVaccinationTarget getVaccinationTarget() {
        return this.VaccinationTarget;
    }

    /**
     * Set 接种对象
注意：此字段可能返回 null，表示取不到有效值。
     * @param VaccinationTarget 接种对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVaccinationTarget(BiologicalProductInfoVaccinationTarget VaccinationTarget) {
        this.VaccinationTarget = VaccinationTarget;
    }

    /**
     * Get 作用与用途
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Indications 作用与用途
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BiologicalProductInfoIndications getIndications() {
        return this.Indications;
    }

    /**
     * Set 作用与用途
注意：此字段可能返回 null，表示取不到有效值。
     * @param Indications 作用与用途
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndications(BiologicalProductInfoIndications Indications) {
        this.Indications = Indications;
    }

    /**
     * Get 规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Brochure 规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BiologicalProductInfoBrochure getBrochure() {
        return this.Brochure;
    }

    /**
     * Set 规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param Brochure 规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBrochure(BiologicalProductInfoBrochure Brochure) {
        this.Brochure = Brochure;
    }

    /**
     * Get 免疫程序和剂量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Dosage 免疫程序和剂量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BiologicalProductInfoDosage getDosage() {
        return this.Dosage;
    }

    /**
     * Set 免疫程序和剂量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Dosage 免疫程序和剂量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDosage(BiologicalProductInfoDosage Dosage) {
        this.Dosage = Dosage;
    }

    /**
     * Get 不良反应
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdverseReaction 不良反应
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BiologicalProductInfoAdverseReaction getAdverseReaction() {
        return this.AdverseReaction;
    }

    /**
     * Set 不良反应
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdverseReaction 不良反应
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdverseReaction(BiologicalProductInfoAdverseReaction AdverseReaction) {
        this.AdverseReaction = AdverseReaction;
    }

    /**
     * Get 禁忌情况
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Contraindications 禁忌情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BiologicalProductInfoContraindications getContraindications() {
        return this.Contraindications;
    }

    /**
     * Set 禁忌情况
注意：此字段可能返回 null，表示取不到有效值。
     * @param Contraindications 禁忌情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContraindications(BiologicalProductInfoContraindications Contraindications) {
        this.Contraindications = Contraindications;
    }

    /**
     * Get 注意事项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Precautions 注意事项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BiologicalProductInfoPrecautions getPrecautions() {
        return this.Precautions;
    }

    /**
     * Set 注意事项
注意：此字段可能返回 null，表示取不到有效值。
     * @param Precautions 注意事项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrecautions(BiologicalProductInfoPrecautions Precautions) {
        this.Precautions = Precautions;
    }

    /**
     * Get 储存条件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Storage 储存条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BiologicalProductInfoStorage getStorage() {
        return this.Storage;
    }

    /**
     * Set 储存条件
注意：此字段可能返回 null，表示取不到有效值。
     * @param Storage 储存条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorage(BiologicalProductInfoStorage Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 包装信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Packaging 包装信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BiologicalProductInfoPackaging getPackaging() {
        return this.Packaging;
    }

    /**
     * Set 包装信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Packaging 包装信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackaging(BiologicalProductInfoPackaging Packaging) {
        this.Packaging = Packaging;
    }

    /**
     * Get 有效期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValidityPeriod 有效期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BiologicalProductInfoValidityPeriod getValidityPeriod() {
        return this.ValidityPeriod;
    }

    /**
     * Set 有效期
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValidityPeriod 有效期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValidityPeriod(BiologicalProductInfoValidityPeriod ValidityPeriod) {
        this.ValidityPeriod = ValidityPeriod;
    }

    /**
     * Get 执行标准
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutiveStandards 执行标准
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BiologicalProductInfoExecutiveStandards getExecutiveStandards() {
        return this.ExecutiveStandards;
    }

    /**
     * Set 执行标准
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutiveStandards 执行标准
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutiveStandards(BiologicalProductInfoExecutiveStandards ExecutiveStandards) {
        this.ExecutiveStandards = ExecutiveStandards;
    }

    /**
     * Get 批准文号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Approval 批准文号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BiologicalProductInfoApproval getApproval() {
        return this.Approval;
    }

    /**
     * Set 批准文号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Approval 批准文号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproval(BiologicalProductInfoApproval Approval) {
        this.Approval = Approval;
    }

    /**
     * Get 生产企业名称和地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Manufacturer 生产企业名称和地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BiologicalProductInfoManufacturer getManufacturer() {
        return this.Manufacturer;
    }

    /**
     * Set 生产企业名称和地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Manufacturer 生产企业名称和地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setManufacturer(BiologicalProductInfoManufacturer Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    public BiologicalProductInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BiologicalProductInfo(BiologicalProductInfo source) {
        if (source.Name != null) {
            this.Name = new BiologicalProductInfoName(source.Name);
        }
        if (source.IngredientAndAppearance != null) {
            this.IngredientAndAppearance = new BiologicalProductInfoIngredientAndAppearance(source.IngredientAndAppearance);
        }
        if (source.VaccinationTarget != null) {
            this.VaccinationTarget = new BiologicalProductInfoVaccinationTarget(source.VaccinationTarget);
        }
        if (source.Indications != null) {
            this.Indications = new BiologicalProductInfoIndications(source.Indications);
        }
        if (source.Brochure != null) {
            this.Brochure = new BiologicalProductInfoBrochure(source.Brochure);
        }
        if (source.Dosage != null) {
            this.Dosage = new BiologicalProductInfoDosage(source.Dosage);
        }
        if (source.AdverseReaction != null) {
            this.AdverseReaction = new BiologicalProductInfoAdverseReaction(source.AdverseReaction);
        }
        if (source.Contraindications != null) {
            this.Contraindications = new BiologicalProductInfoContraindications(source.Contraindications);
        }
        if (source.Precautions != null) {
            this.Precautions = new BiologicalProductInfoPrecautions(source.Precautions);
        }
        if (source.Storage != null) {
            this.Storage = new BiologicalProductInfoStorage(source.Storage);
        }
        if (source.Packaging != null) {
            this.Packaging = new BiologicalProductInfoPackaging(source.Packaging);
        }
        if (source.ValidityPeriod != null) {
            this.ValidityPeriod = new BiologicalProductInfoValidityPeriod(source.ValidityPeriod);
        }
        if (source.ExecutiveStandards != null) {
            this.ExecutiveStandards = new BiologicalProductInfoExecutiveStandards(source.ExecutiveStandards);
        }
        if (source.Approval != null) {
            this.Approval = new BiologicalProductInfoApproval(source.Approval);
        }
        if (source.Manufacturer != null) {
            this.Manufacturer = new BiologicalProductInfoManufacturer(source.Manufacturer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Name.", this.Name);
        this.setParamObj(map, prefix + "IngredientAndAppearance.", this.IngredientAndAppearance);
        this.setParamObj(map, prefix + "VaccinationTarget.", this.VaccinationTarget);
        this.setParamObj(map, prefix + "Indications.", this.Indications);
        this.setParamObj(map, prefix + "Brochure.", this.Brochure);
        this.setParamObj(map, prefix + "Dosage.", this.Dosage);
        this.setParamObj(map, prefix + "AdverseReaction.", this.AdverseReaction);
        this.setParamObj(map, prefix + "Contraindications.", this.Contraindications);
        this.setParamObj(map, prefix + "Precautions.", this.Precautions);
        this.setParamObj(map, prefix + "Storage.", this.Storage);
        this.setParamObj(map, prefix + "Packaging.", this.Packaging);
        this.setParamObj(map, prefix + "ValidityPeriod.", this.ValidityPeriod);
        this.setParamObj(map, prefix + "ExecutiveStandards.", this.ExecutiveStandards);
        this.setParamObj(map, prefix + "Approval.", this.Approval);
        this.setParamObj(map, prefix + "Manufacturer.", this.Manufacturer);

    }
}

