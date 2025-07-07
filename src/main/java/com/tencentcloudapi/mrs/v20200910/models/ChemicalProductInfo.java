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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChemicalProductInfo extends AbstractModel {

    /**
    * 药品名称，包括通用名和商品名
    */
    @SerializedName("Name")
    @Expose
    private ChemicalProductInfoName Name;

    /**
    * 活性成份消息定义，如果是复方制剂，可以不列出每个活性成份的详细信息
    */
    @SerializedName("ActiveIngredient")
    @Expose
    private ChemicalProductInfoActiveIngredient ActiveIngredient;

    /**
    * 性状
    */
    @SerializedName("Appearance")
    @Expose
    private ChemicalProductInfoAppearance Appearance;

    /**
    * 适应症描述
    */
    @SerializedName("Indications")
    @Expose
    private ChemicalProductInfoIndications Indications;

    /**
    * 规格
    */
    @SerializedName("Brochure")
    @Expose
    private ChemicalProductInfoBrochure Brochure;

    /**
    * 用法用量
    */
    @SerializedName("Dosage")
    @Expose
    private ChemicalProductInfoDosage Dosage;

    /**
    * 不良反应
    */
    @SerializedName("AdverseReaction")
    @Expose
    private ChemicalProductInfoAdverseReaction AdverseReaction;

    /**
    * 禁忌情况
    */
    @SerializedName("Contraindications")
    @Expose
    private ChemicalProductInfoContraindications Contraindications;

    /**
    * 注意事项
    */
    @SerializedName("Precautions")
    @Expose
    private ChemicalProductInfoPrecautions Precautions;

    /**
    * 孕妇及哺乳期妇女用药
    */
    @SerializedName("PregnancyLactationUse")
    @Expose
    private ChemicalProductInfoPregnancyLactationUse PregnancyLactationUse;

    /**
    * 儿童用药
    */
    @SerializedName("PediatricUse")
    @Expose
    private ChemicalProductInfoPediatricUse PediatricUse;

    /**
    * 老年用药
    */
    @SerializedName("GeriatricUse")
    @Expose
    private ChemicalProductInfoGeriatricUse GeriatricUse;

    /**
    * 药品的药物相互作用
    */
    @SerializedName("Interactions")
    @Expose
    private ChemicalProductInfoInteractions Interactions;

    /**
    * 药物过量
    */
    @SerializedName("Overdose")
    @Expose
    private ChemicalProductInfoOverdose Overdose;

    /**
    * 临床试验
    */
    @SerializedName("ClinicalTrial")
    @Expose
    private ChemicalProductInfoClinicalTrial ClinicalTrial;

    /**
    * 药理毒理
    */
    @SerializedName("PharmacologyToxicology")
    @Expose
    private ChemicalProductInfoPharmacologyToxicology PharmacologyToxicology;

    /**
    * 药代动力学
    */
    @SerializedName("Pharmacokinetics")
    @Expose
    private ChemicalProductInfoPharmacokinetics Pharmacokinetics;

    /**
    * 储存条件
    */
    @SerializedName("Storage")
    @Expose
    private ChemicalProductInfoStorage Storage;

    /**
    * 包装信息
    */
    @SerializedName("Packaging")
    @Expose
    private ChemicalProductInfoPackaging Packaging;

    /**
    * 有效期
    */
    @SerializedName("ValidityPeriod")
    @Expose
    private ChemicalProductInfoValidityPeriod ValidityPeriod;

    /**
    * 执行标准
    */
    @SerializedName("ExecutiveStandards")
    @Expose
    private ChemicalProductInfoExecutiveStandards ExecutiveStandards;

    /**
    * 批准文号
    */
    @SerializedName("Approval")
    @Expose
    private ChemicalProductInfoApproval Approval;

    /**
    * 生产企业名称和地址
    */
    @SerializedName("Manufacturer")
    @Expose
    private ChemicalProductInfoManufacturer Manufacturer;

    /**
     * Get 药品名称，包括通用名和商品名 
     * @return Name 药品名称，包括通用名和商品名
     */
    public ChemicalProductInfoName getName() {
        return this.Name;
    }

    /**
     * Set 药品名称，包括通用名和商品名
     * @param Name 药品名称，包括通用名和商品名
     */
    public void setName(ChemicalProductInfoName Name) {
        this.Name = Name;
    }

    /**
     * Get 活性成份消息定义，如果是复方制剂，可以不列出每个活性成份的详细信息 
     * @return ActiveIngredient 活性成份消息定义，如果是复方制剂，可以不列出每个活性成份的详细信息
     */
    public ChemicalProductInfoActiveIngredient getActiveIngredient() {
        return this.ActiveIngredient;
    }

    /**
     * Set 活性成份消息定义，如果是复方制剂，可以不列出每个活性成份的详细信息
     * @param ActiveIngredient 活性成份消息定义，如果是复方制剂，可以不列出每个活性成份的详细信息
     */
    public void setActiveIngredient(ChemicalProductInfoActiveIngredient ActiveIngredient) {
        this.ActiveIngredient = ActiveIngredient;
    }

    /**
     * Get 性状 
     * @return Appearance 性状
     */
    public ChemicalProductInfoAppearance getAppearance() {
        return this.Appearance;
    }

    /**
     * Set 性状
     * @param Appearance 性状
     */
    public void setAppearance(ChemicalProductInfoAppearance Appearance) {
        this.Appearance = Appearance;
    }

    /**
     * Get 适应症描述 
     * @return Indications 适应症描述
     */
    public ChemicalProductInfoIndications getIndications() {
        return this.Indications;
    }

    /**
     * Set 适应症描述
     * @param Indications 适应症描述
     */
    public void setIndications(ChemicalProductInfoIndications Indications) {
        this.Indications = Indications;
    }

    /**
     * Get 规格 
     * @return Brochure 规格
     */
    public ChemicalProductInfoBrochure getBrochure() {
        return this.Brochure;
    }

    /**
     * Set 规格
     * @param Brochure 规格
     */
    public void setBrochure(ChemicalProductInfoBrochure Brochure) {
        this.Brochure = Brochure;
    }

    /**
     * Get 用法用量 
     * @return Dosage 用法用量
     */
    public ChemicalProductInfoDosage getDosage() {
        return this.Dosage;
    }

    /**
     * Set 用法用量
     * @param Dosage 用法用量
     */
    public void setDosage(ChemicalProductInfoDosage Dosage) {
        this.Dosage = Dosage;
    }

    /**
     * Get 不良反应 
     * @return AdverseReaction 不良反应
     */
    public ChemicalProductInfoAdverseReaction getAdverseReaction() {
        return this.AdverseReaction;
    }

    /**
     * Set 不良反应
     * @param AdverseReaction 不良反应
     */
    public void setAdverseReaction(ChemicalProductInfoAdverseReaction AdverseReaction) {
        this.AdverseReaction = AdverseReaction;
    }

    /**
     * Get 禁忌情况 
     * @return Contraindications 禁忌情况
     */
    public ChemicalProductInfoContraindications getContraindications() {
        return this.Contraindications;
    }

    /**
     * Set 禁忌情况
     * @param Contraindications 禁忌情况
     */
    public void setContraindications(ChemicalProductInfoContraindications Contraindications) {
        this.Contraindications = Contraindications;
    }

    /**
     * Get 注意事项 
     * @return Precautions 注意事项
     */
    public ChemicalProductInfoPrecautions getPrecautions() {
        return this.Precautions;
    }

    /**
     * Set 注意事项
     * @param Precautions 注意事项
     */
    public void setPrecautions(ChemicalProductInfoPrecautions Precautions) {
        this.Precautions = Precautions;
    }

    /**
     * Get 孕妇及哺乳期妇女用药 
     * @return PregnancyLactationUse 孕妇及哺乳期妇女用药
     */
    public ChemicalProductInfoPregnancyLactationUse getPregnancyLactationUse() {
        return this.PregnancyLactationUse;
    }

    /**
     * Set 孕妇及哺乳期妇女用药
     * @param PregnancyLactationUse 孕妇及哺乳期妇女用药
     */
    public void setPregnancyLactationUse(ChemicalProductInfoPregnancyLactationUse PregnancyLactationUse) {
        this.PregnancyLactationUse = PregnancyLactationUse;
    }

    /**
     * Get 儿童用药 
     * @return PediatricUse 儿童用药
     */
    public ChemicalProductInfoPediatricUse getPediatricUse() {
        return this.PediatricUse;
    }

    /**
     * Set 儿童用药
     * @param PediatricUse 儿童用药
     */
    public void setPediatricUse(ChemicalProductInfoPediatricUse PediatricUse) {
        this.PediatricUse = PediatricUse;
    }

    /**
     * Get 老年用药 
     * @return GeriatricUse 老年用药
     */
    public ChemicalProductInfoGeriatricUse getGeriatricUse() {
        return this.GeriatricUse;
    }

    /**
     * Set 老年用药
     * @param GeriatricUse 老年用药
     */
    public void setGeriatricUse(ChemicalProductInfoGeriatricUse GeriatricUse) {
        this.GeriatricUse = GeriatricUse;
    }

    /**
     * Get 药品的药物相互作用 
     * @return Interactions 药品的药物相互作用
     */
    public ChemicalProductInfoInteractions getInteractions() {
        return this.Interactions;
    }

    /**
     * Set 药品的药物相互作用
     * @param Interactions 药品的药物相互作用
     */
    public void setInteractions(ChemicalProductInfoInteractions Interactions) {
        this.Interactions = Interactions;
    }

    /**
     * Get 药物过量 
     * @return Overdose 药物过量
     */
    public ChemicalProductInfoOverdose getOverdose() {
        return this.Overdose;
    }

    /**
     * Set 药物过量
     * @param Overdose 药物过量
     */
    public void setOverdose(ChemicalProductInfoOverdose Overdose) {
        this.Overdose = Overdose;
    }

    /**
     * Get 临床试验 
     * @return ClinicalTrial 临床试验
     */
    public ChemicalProductInfoClinicalTrial getClinicalTrial() {
        return this.ClinicalTrial;
    }

    /**
     * Set 临床试验
     * @param ClinicalTrial 临床试验
     */
    public void setClinicalTrial(ChemicalProductInfoClinicalTrial ClinicalTrial) {
        this.ClinicalTrial = ClinicalTrial;
    }

    /**
     * Get 药理毒理 
     * @return PharmacologyToxicology 药理毒理
     */
    public ChemicalProductInfoPharmacologyToxicology getPharmacologyToxicology() {
        return this.PharmacologyToxicology;
    }

    /**
     * Set 药理毒理
     * @param PharmacologyToxicology 药理毒理
     */
    public void setPharmacologyToxicology(ChemicalProductInfoPharmacologyToxicology PharmacologyToxicology) {
        this.PharmacologyToxicology = PharmacologyToxicology;
    }

    /**
     * Get 药代动力学 
     * @return Pharmacokinetics 药代动力学
     */
    public ChemicalProductInfoPharmacokinetics getPharmacokinetics() {
        return this.Pharmacokinetics;
    }

    /**
     * Set 药代动力学
     * @param Pharmacokinetics 药代动力学
     */
    public void setPharmacokinetics(ChemicalProductInfoPharmacokinetics Pharmacokinetics) {
        this.Pharmacokinetics = Pharmacokinetics;
    }

    /**
     * Get 储存条件 
     * @return Storage 储存条件
     */
    public ChemicalProductInfoStorage getStorage() {
        return this.Storage;
    }

    /**
     * Set 储存条件
     * @param Storage 储存条件
     */
    public void setStorage(ChemicalProductInfoStorage Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 包装信息 
     * @return Packaging 包装信息
     */
    public ChemicalProductInfoPackaging getPackaging() {
        return this.Packaging;
    }

    /**
     * Set 包装信息
     * @param Packaging 包装信息
     */
    public void setPackaging(ChemicalProductInfoPackaging Packaging) {
        this.Packaging = Packaging;
    }

    /**
     * Get 有效期 
     * @return ValidityPeriod 有效期
     */
    public ChemicalProductInfoValidityPeriod getValidityPeriod() {
        return this.ValidityPeriod;
    }

    /**
     * Set 有效期
     * @param ValidityPeriod 有效期
     */
    public void setValidityPeriod(ChemicalProductInfoValidityPeriod ValidityPeriod) {
        this.ValidityPeriod = ValidityPeriod;
    }

    /**
     * Get 执行标准 
     * @return ExecutiveStandards 执行标准
     */
    public ChemicalProductInfoExecutiveStandards getExecutiveStandards() {
        return this.ExecutiveStandards;
    }

    /**
     * Set 执行标准
     * @param ExecutiveStandards 执行标准
     */
    public void setExecutiveStandards(ChemicalProductInfoExecutiveStandards ExecutiveStandards) {
        this.ExecutiveStandards = ExecutiveStandards;
    }

    /**
     * Get 批准文号 
     * @return Approval 批准文号
     */
    public ChemicalProductInfoApproval getApproval() {
        return this.Approval;
    }

    /**
     * Set 批准文号
     * @param Approval 批准文号
     */
    public void setApproval(ChemicalProductInfoApproval Approval) {
        this.Approval = Approval;
    }

    /**
     * Get 生产企业名称和地址 
     * @return Manufacturer 生产企业名称和地址
     */
    public ChemicalProductInfoManufacturer getManufacturer() {
        return this.Manufacturer;
    }

    /**
     * Set 生产企业名称和地址
     * @param Manufacturer 生产企业名称和地址
     */
    public void setManufacturer(ChemicalProductInfoManufacturer Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    public ChemicalProductInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChemicalProductInfo(ChemicalProductInfo source) {
        if (source.Name != null) {
            this.Name = new ChemicalProductInfoName(source.Name);
        }
        if (source.ActiveIngredient != null) {
            this.ActiveIngredient = new ChemicalProductInfoActiveIngredient(source.ActiveIngredient);
        }
        if (source.Appearance != null) {
            this.Appearance = new ChemicalProductInfoAppearance(source.Appearance);
        }
        if (source.Indications != null) {
            this.Indications = new ChemicalProductInfoIndications(source.Indications);
        }
        if (source.Brochure != null) {
            this.Brochure = new ChemicalProductInfoBrochure(source.Brochure);
        }
        if (source.Dosage != null) {
            this.Dosage = new ChemicalProductInfoDosage(source.Dosage);
        }
        if (source.AdverseReaction != null) {
            this.AdverseReaction = new ChemicalProductInfoAdverseReaction(source.AdverseReaction);
        }
        if (source.Contraindications != null) {
            this.Contraindications = new ChemicalProductInfoContraindications(source.Contraindications);
        }
        if (source.Precautions != null) {
            this.Precautions = new ChemicalProductInfoPrecautions(source.Precautions);
        }
        if (source.PregnancyLactationUse != null) {
            this.PregnancyLactationUse = new ChemicalProductInfoPregnancyLactationUse(source.PregnancyLactationUse);
        }
        if (source.PediatricUse != null) {
            this.PediatricUse = new ChemicalProductInfoPediatricUse(source.PediatricUse);
        }
        if (source.GeriatricUse != null) {
            this.GeriatricUse = new ChemicalProductInfoGeriatricUse(source.GeriatricUse);
        }
        if (source.Interactions != null) {
            this.Interactions = new ChemicalProductInfoInteractions(source.Interactions);
        }
        if (source.Overdose != null) {
            this.Overdose = new ChemicalProductInfoOverdose(source.Overdose);
        }
        if (source.ClinicalTrial != null) {
            this.ClinicalTrial = new ChemicalProductInfoClinicalTrial(source.ClinicalTrial);
        }
        if (source.PharmacologyToxicology != null) {
            this.PharmacologyToxicology = new ChemicalProductInfoPharmacologyToxicology(source.PharmacologyToxicology);
        }
        if (source.Pharmacokinetics != null) {
            this.Pharmacokinetics = new ChemicalProductInfoPharmacokinetics(source.Pharmacokinetics);
        }
        if (source.Storage != null) {
            this.Storage = new ChemicalProductInfoStorage(source.Storage);
        }
        if (source.Packaging != null) {
            this.Packaging = new ChemicalProductInfoPackaging(source.Packaging);
        }
        if (source.ValidityPeriod != null) {
            this.ValidityPeriod = new ChemicalProductInfoValidityPeriod(source.ValidityPeriod);
        }
        if (source.ExecutiveStandards != null) {
            this.ExecutiveStandards = new ChemicalProductInfoExecutiveStandards(source.ExecutiveStandards);
        }
        if (source.Approval != null) {
            this.Approval = new ChemicalProductInfoApproval(source.Approval);
        }
        if (source.Manufacturer != null) {
            this.Manufacturer = new ChemicalProductInfoManufacturer(source.Manufacturer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Name.", this.Name);
        this.setParamObj(map, prefix + "ActiveIngredient.", this.ActiveIngredient);
        this.setParamObj(map, prefix + "Appearance.", this.Appearance);
        this.setParamObj(map, prefix + "Indications.", this.Indications);
        this.setParamObj(map, prefix + "Brochure.", this.Brochure);
        this.setParamObj(map, prefix + "Dosage.", this.Dosage);
        this.setParamObj(map, prefix + "AdverseReaction.", this.AdverseReaction);
        this.setParamObj(map, prefix + "Contraindications.", this.Contraindications);
        this.setParamObj(map, prefix + "Precautions.", this.Precautions);
        this.setParamObj(map, prefix + "PregnancyLactationUse.", this.PregnancyLactationUse);
        this.setParamObj(map, prefix + "PediatricUse.", this.PediatricUse);
        this.setParamObj(map, prefix + "GeriatricUse.", this.GeriatricUse);
        this.setParamObj(map, prefix + "Interactions.", this.Interactions);
        this.setParamObj(map, prefix + "Overdose.", this.Overdose);
        this.setParamObj(map, prefix + "ClinicalTrial.", this.ClinicalTrial);
        this.setParamObj(map, prefix + "PharmacologyToxicology.", this.PharmacologyToxicology);
        this.setParamObj(map, prefix + "Pharmacokinetics.", this.Pharmacokinetics);
        this.setParamObj(map, prefix + "Storage.", this.Storage);
        this.setParamObj(map, prefix + "Packaging.", this.Packaging);
        this.setParamObj(map, prefix + "ValidityPeriod.", this.ValidityPeriod);
        this.setParamObj(map, prefix + "ExecutiveStandards.", this.ExecutiveStandards);
        this.setParamObj(map, prefix + "Approval.", this.Approval);
        this.setParamObj(map, prefix + "Manufacturer.", this.Manufacturer);

    }
}

