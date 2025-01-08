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
package com.tencentcloudapi.aca.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmartDrugInfoResp extends AbstractModel {

    /**
    * 药品ID
    */
    @SerializedName("DrugId")
    @Expose
    private String DrugId;

    /**
    * 序列ID
    */
    @SerializedName("SequenceId")
    @Expose
    private Long SequenceId;

    /**
    * 药品哈希ID
    */
    @SerializedName("DrugHashId")
    @Expose
    private String DrugHashId;

    /**
    * 图片URL
    */
    @SerializedName("ImgUrl")
    @Expose
    private String ImgUrl;

    /**
    * 药品名称
    */
    @SerializedName("DrugName")
    @Expose
    private String DrugName;

    /**
    * 商品名
    */
    @SerializedName("TradeName")
    @Expose
    private String TradeName;

    /**
    * 英文名称
    */
    @SerializedName("EnglishName")
    @Expose
    private String EnglishName;

    /**
    * 英文商品名
    */
    @SerializedName("EnglishTradeName")
    @Expose
    private String EnglishTradeName;

    /**
    * 拼音
    */
    @SerializedName("Pinyin")
    @Expose
    private String Pinyin;

    /**
    * 其他名称
    */
    @SerializedName("OtherNames")
    @Expose
    private String OtherNames;

    /**
    * 化学名称
    */
    @SerializedName("ChemicalName")
    @Expose
    private String ChemicalName;

    /**
    * 英文化学名称
    */
    @SerializedName("EnglishChemicalName")
    @Expose
    private String EnglishChemicalName;

    /**
    * 批准文号
    */
    @SerializedName("ApprovalNumber")
    @Expose
    private String ApprovalNumber;

    /**
    * 药品属性标签 多个标签时 | 分隔，如抗菌药|抗生素|贵重药品
    */
    @SerializedName("Property")
    @Expose
    private String Property;

    /**
    * 药品成分
    */
    @SerializedName("Ingredients")
    @Expose
    private String Ingredients;

    /**
    * 药品性状
    */
    @SerializedName("PhenotypicTrait")
    @Expose
    private String PhenotypicTrait;

    /**
    * 适应症
    */
    @SerializedName("Indications")
    @Expose
    private String Indications;

    /**
    * 规格
    */
    @SerializedName("Specifications")
    @Expose
    private String Specifications;

    /**
    * 用法用量
    */
    @SerializedName("UsageAndDosage")
    @Expose
    private String UsageAndDosage;

    /**
    * 推荐用法
    */
    @SerializedName("RecommendedUsage")
    @Expose
    private RecommendedUsage RecommendedUsage;

    /**
    * 不良反应
    */
    @SerializedName("AdverseReaction")
    @Expose
    private String AdverseReaction;

    /**
    * 禁忌
    */
    @SerializedName("Contraindication")
    @Expose
    private String Contraindication;

    /**
    * 注意事项
    */
    @SerializedName("Attentions")
    @Expose
    private String Attentions;

    /**
    * 药物过量
    */
    @SerializedName("Overdose")
    @Expose
    private String Overdose;

    /**
    * 孕妇及哺乳期妇女用药
    */
    @SerializedName("PregnantAndLactatingWomen")
    @Expose
    private String PregnantAndLactatingWomen;

    /**
    * 老年患者用药
    */
    @SerializedName("ElderlyPatients")
    @Expose
    private String ElderlyPatients;

    /**
    * 儿童用药
    */
    @SerializedName("PediatricDrugs")
    @Expose
    private String PediatricDrugs;

    /**
    * 药物相互作用
    */
    @SerializedName("Interactions")
    @Expose
    private String Interactions;

    /**
    * 临床研究
    */
    @SerializedName("ClinicalResearch")
    @Expose
    private String ClinicalResearch;

    /**
    * 药理毒理
    */
    @SerializedName("PharmacologyToxicology")
    @Expose
    private String PharmacologyToxicology;

    /**
    * 药代动力学
    */
    @SerializedName("Pharmacokinetics")
    @Expose
    private String Pharmacokinetics;

    /**
    * 警告
    */
    @SerializedName("Warning")
    @Expose
    private String Warning;

    /**
    * 有效期
    */
    @SerializedName("ExpireDate")
    @Expose
    private String ExpireDate;

    /**
    * 贮藏
    */
    @SerializedName("Storage")
    @Expose
    private String Storage;

    /**
    * 包装
    */
    @SerializedName("Pack")
    @Expose
    private String Pack;

    /**
    * 生产企业
    */
    @SerializedName("Manufacturer")
    @Expose
    private String Manufacturer;

    /**
    * 生产企业地址
    */
    @SerializedName("ManufacturerAddress")
    @Expose
    private String ManufacturerAddress;

    /**
    * 生产企业电话
    */
    @SerializedName("ManufacturerPhone")
    @Expose
    private String ManufacturerPhone;

    /**
    * 生产企业邮箱
    */
    @SerializedName("ManufacturerEmail")
    @Expose
    private String ManufacturerEmail;

    /**
    * 生产企业网站
    */
    @SerializedName("ManufacturerWebsite")
    @Expose
    private String ManufacturerWebsite;

    /**
    * 说明书制定和修订时间
    */
    @SerializedName("DocRevisionTime")
    @Expose
    private String DocRevisionTime;

    /**
    * 参考文献
    */
    @SerializedName("References")
    @Expose
    private String References;

    /**
    * 剂型
    */
    @SerializedName("DrugDosageForm")
    @Expose
    private String DrugDosageForm;

    /**
    * 给药途径
    */
    @SerializedName("DrugRoute")
    @Expose
    private String DrugRoute;

    /**
    * 药品本位码
    */
    @SerializedName("DrugBasicCode")
    @Expose
    private String DrugBasicCode;

    /**
    * OTC标签
    */
    @SerializedName("OctTag")
    @Expose
    private String OctTag;

    /**
     * Get 药品ID 
     * @return DrugId 药品ID
     */
    public String getDrugId() {
        return this.DrugId;
    }

    /**
     * Set 药品ID
     * @param DrugId 药品ID
     */
    public void setDrugId(String DrugId) {
        this.DrugId = DrugId;
    }

    /**
     * Get 序列ID 
     * @return SequenceId 序列ID
     */
    public Long getSequenceId() {
        return this.SequenceId;
    }

    /**
     * Set 序列ID
     * @param SequenceId 序列ID
     */
    public void setSequenceId(Long SequenceId) {
        this.SequenceId = SequenceId;
    }

    /**
     * Get 药品哈希ID 
     * @return DrugHashId 药品哈希ID
     */
    public String getDrugHashId() {
        return this.DrugHashId;
    }

    /**
     * Set 药品哈希ID
     * @param DrugHashId 药品哈希ID
     */
    public void setDrugHashId(String DrugHashId) {
        this.DrugHashId = DrugHashId;
    }

    /**
     * Get 图片URL 
     * @return ImgUrl 图片URL
     */
    public String getImgUrl() {
        return this.ImgUrl;
    }

    /**
     * Set 图片URL
     * @param ImgUrl 图片URL
     */
    public void setImgUrl(String ImgUrl) {
        this.ImgUrl = ImgUrl;
    }

    /**
     * Get 药品名称 
     * @return DrugName 药品名称
     */
    public String getDrugName() {
        return this.DrugName;
    }

    /**
     * Set 药品名称
     * @param DrugName 药品名称
     */
    public void setDrugName(String DrugName) {
        this.DrugName = DrugName;
    }

    /**
     * Get 商品名 
     * @return TradeName 商品名
     */
    public String getTradeName() {
        return this.TradeName;
    }

    /**
     * Set 商品名
     * @param TradeName 商品名
     */
    public void setTradeName(String TradeName) {
        this.TradeName = TradeName;
    }

    /**
     * Get 英文名称 
     * @return EnglishName 英文名称
     */
    public String getEnglishName() {
        return this.EnglishName;
    }

    /**
     * Set 英文名称
     * @param EnglishName 英文名称
     */
    public void setEnglishName(String EnglishName) {
        this.EnglishName = EnglishName;
    }

    /**
     * Get 英文商品名 
     * @return EnglishTradeName 英文商品名
     */
    public String getEnglishTradeName() {
        return this.EnglishTradeName;
    }

    /**
     * Set 英文商品名
     * @param EnglishTradeName 英文商品名
     */
    public void setEnglishTradeName(String EnglishTradeName) {
        this.EnglishTradeName = EnglishTradeName;
    }

    /**
     * Get 拼音 
     * @return Pinyin 拼音
     */
    public String getPinyin() {
        return this.Pinyin;
    }

    /**
     * Set 拼音
     * @param Pinyin 拼音
     */
    public void setPinyin(String Pinyin) {
        this.Pinyin = Pinyin;
    }

    /**
     * Get 其他名称 
     * @return OtherNames 其他名称
     */
    public String getOtherNames() {
        return this.OtherNames;
    }

    /**
     * Set 其他名称
     * @param OtherNames 其他名称
     */
    public void setOtherNames(String OtherNames) {
        this.OtherNames = OtherNames;
    }

    /**
     * Get 化学名称 
     * @return ChemicalName 化学名称
     */
    public String getChemicalName() {
        return this.ChemicalName;
    }

    /**
     * Set 化学名称
     * @param ChemicalName 化学名称
     */
    public void setChemicalName(String ChemicalName) {
        this.ChemicalName = ChemicalName;
    }

    /**
     * Get 英文化学名称 
     * @return EnglishChemicalName 英文化学名称
     */
    public String getEnglishChemicalName() {
        return this.EnglishChemicalName;
    }

    /**
     * Set 英文化学名称
     * @param EnglishChemicalName 英文化学名称
     */
    public void setEnglishChemicalName(String EnglishChemicalName) {
        this.EnglishChemicalName = EnglishChemicalName;
    }

    /**
     * Get 批准文号 
     * @return ApprovalNumber 批准文号
     */
    public String getApprovalNumber() {
        return this.ApprovalNumber;
    }

    /**
     * Set 批准文号
     * @param ApprovalNumber 批准文号
     */
    public void setApprovalNumber(String ApprovalNumber) {
        this.ApprovalNumber = ApprovalNumber;
    }

    /**
     * Get 药品属性标签 多个标签时 | 分隔，如抗菌药|抗生素|贵重药品 
     * @return Property 药品属性标签 多个标签时 | 分隔，如抗菌药|抗生素|贵重药品
     */
    public String getProperty() {
        return this.Property;
    }

    /**
     * Set 药品属性标签 多个标签时 | 分隔，如抗菌药|抗生素|贵重药品
     * @param Property 药品属性标签 多个标签时 | 分隔，如抗菌药|抗生素|贵重药品
     */
    public void setProperty(String Property) {
        this.Property = Property;
    }

    /**
     * Get 药品成分 
     * @return Ingredients 药品成分
     */
    public String getIngredients() {
        return this.Ingredients;
    }

    /**
     * Set 药品成分
     * @param Ingredients 药品成分
     */
    public void setIngredients(String Ingredients) {
        this.Ingredients = Ingredients;
    }

    /**
     * Get 药品性状 
     * @return PhenotypicTrait 药品性状
     */
    public String getPhenotypicTrait() {
        return this.PhenotypicTrait;
    }

    /**
     * Set 药品性状
     * @param PhenotypicTrait 药品性状
     */
    public void setPhenotypicTrait(String PhenotypicTrait) {
        this.PhenotypicTrait = PhenotypicTrait;
    }

    /**
     * Get 适应症 
     * @return Indications 适应症
     */
    public String getIndications() {
        return this.Indications;
    }

    /**
     * Set 适应症
     * @param Indications 适应症
     */
    public void setIndications(String Indications) {
        this.Indications = Indications;
    }

    /**
     * Get 规格 
     * @return Specifications 规格
     */
    public String getSpecifications() {
        return this.Specifications;
    }

    /**
     * Set 规格
     * @param Specifications 规格
     */
    public void setSpecifications(String Specifications) {
        this.Specifications = Specifications;
    }

    /**
     * Get 用法用量 
     * @return UsageAndDosage 用法用量
     */
    public String getUsageAndDosage() {
        return this.UsageAndDosage;
    }

    /**
     * Set 用法用量
     * @param UsageAndDosage 用法用量
     */
    public void setUsageAndDosage(String UsageAndDosage) {
        this.UsageAndDosage = UsageAndDosage;
    }

    /**
     * Get 推荐用法 
     * @return RecommendedUsage 推荐用法
     */
    public RecommendedUsage getRecommendedUsage() {
        return this.RecommendedUsage;
    }

    /**
     * Set 推荐用法
     * @param RecommendedUsage 推荐用法
     */
    public void setRecommendedUsage(RecommendedUsage RecommendedUsage) {
        this.RecommendedUsage = RecommendedUsage;
    }

    /**
     * Get 不良反应 
     * @return AdverseReaction 不良反应
     */
    public String getAdverseReaction() {
        return this.AdverseReaction;
    }

    /**
     * Set 不良反应
     * @param AdverseReaction 不良反应
     */
    public void setAdverseReaction(String AdverseReaction) {
        this.AdverseReaction = AdverseReaction;
    }

    /**
     * Get 禁忌 
     * @return Contraindication 禁忌
     */
    public String getContraindication() {
        return this.Contraindication;
    }

    /**
     * Set 禁忌
     * @param Contraindication 禁忌
     */
    public void setContraindication(String Contraindication) {
        this.Contraindication = Contraindication;
    }

    /**
     * Get 注意事项 
     * @return Attentions 注意事项
     */
    public String getAttentions() {
        return this.Attentions;
    }

    /**
     * Set 注意事项
     * @param Attentions 注意事项
     */
    public void setAttentions(String Attentions) {
        this.Attentions = Attentions;
    }

    /**
     * Get 药物过量 
     * @return Overdose 药物过量
     */
    public String getOverdose() {
        return this.Overdose;
    }

    /**
     * Set 药物过量
     * @param Overdose 药物过量
     */
    public void setOverdose(String Overdose) {
        this.Overdose = Overdose;
    }

    /**
     * Get 孕妇及哺乳期妇女用药 
     * @return PregnantAndLactatingWomen 孕妇及哺乳期妇女用药
     */
    public String getPregnantAndLactatingWomen() {
        return this.PregnantAndLactatingWomen;
    }

    /**
     * Set 孕妇及哺乳期妇女用药
     * @param PregnantAndLactatingWomen 孕妇及哺乳期妇女用药
     */
    public void setPregnantAndLactatingWomen(String PregnantAndLactatingWomen) {
        this.PregnantAndLactatingWomen = PregnantAndLactatingWomen;
    }

    /**
     * Get 老年患者用药 
     * @return ElderlyPatients 老年患者用药
     */
    public String getElderlyPatients() {
        return this.ElderlyPatients;
    }

    /**
     * Set 老年患者用药
     * @param ElderlyPatients 老年患者用药
     */
    public void setElderlyPatients(String ElderlyPatients) {
        this.ElderlyPatients = ElderlyPatients;
    }

    /**
     * Get 儿童用药 
     * @return PediatricDrugs 儿童用药
     */
    public String getPediatricDrugs() {
        return this.PediatricDrugs;
    }

    /**
     * Set 儿童用药
     * @param PediatricDrugs 儿童用药
     */
    public void setPediatricDrugs(String PediatricDrugs) {
        this.PediatricDrugs = PediatricDrugs;
    }

    /**
     * Get 药物相互作用 
     * @return Interactions 药物相互作用
     */
    public String getInteractions() {
        return this.Interactions;
    }

    /**
     * Set 药物相互作用
     * @param Interactions 药物相互作用
     */
    public void setInteractions(String Interactions) {
        this.Interactions = Interactions;
    }

    /**
     * Get 临床研究 
     * @return ClinicalResearch 临床研究
     */
    public String getClinicalResearch() {
        return this.ClinicalResearch;
    }

    /**
     * Set 临床研究
     * @param ClinicalResearch 临床研究
     */
    public void setClinicalResearch(String ClinicalResearch) {
        this.ClinicalResearch = ClinicalResearch;
    }

    /**
     * Get 药理毒理 
     * @return PharmacologyToxicology 药理毒理
     */
    public String getPharmacologyToxicology() {
        return this.PharmacologyToxicology;
    }

    /**
     * Set 药理毒理
     * @param PharmacologyToxicology 药理毒理
     */
    public void setPharmacologyToxicology(String PharmacologyToxicology) {
        this.PharmacologyToxicology = PharmacologyToxicology;
    }

    /**
     * Get 药代动力学 
     * @return Pharmacokinetics 药代动力学
     */
    public String getPharmacokinetics() {
        return this.Pharmacokinetics;
    }

    /**
     * Set 药代动力学
     * @param Pharmacokinetics 药代动力学
     */
    public void setPharmacokinetics(String Pharmacokinetics) {
        this.Pharmacokinetics = Pharmacokinetics;
    }

    /**
     * Get 警告 
     * @return Warning 警告
     */
    public String getWarning() {
        return this.Warning;
    }

    /**
     * Set 警告
     * @param Warning 警告
     */
    public void setWarning(String Warning) {
        this.Warning = Warning;
    }

    /**
     * Get 有效期 
     * @return ExpireDate 有效期
     */
    public String getExpireDate() {
        return this.ExpireDate;
    }

    /**
     * Set 有效期
     * @param ExpireDate 有效期
     */
    public void setExpireDate(String ExpireDate) {
        this.ExpireDate = ExpireDate;
    }

    /**
     * Get 贮藏 
     * @return Storage 贮藏
     */
    public String getStorage() {
        return this.Storage;
    }

    /**
     * Set 贮藏
     * @param Storage 贮藏
     */
    public void setStorage(String Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 包装 
     * @return Pack 包装
     */
    public String getPack() {
        return this.Pack;
    }

    /**
     * Set 包装
     * @param Pack 包装
     */
    public void setPack(String Pack) {
        this.Pack = Pack;
    }

    /**
     * Get 生产企业 
     * @return Manufacturer 生产企业
     */
    public String getManufacturer() {
        return this.Manufacturer;
    }

    /**
     * Set 生产企业
     * @param Manufacturer 生产企业
     */
    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    /**
     * Get 生产企业地址 
     * @return ManufacturerAddress 生产企业地址
     */
    public String getManufacturerAddress() {
        return this.ManufacturerAddress;
    }

    /**
     * Set 生产企业地址
     * @param ManufacturerAddress 生产企业地址
     */
    public void setManufacturerAddress(String ManufacturerAddress) {
        this.ManufacturerAddress = ManufacturerAddress;
    }

    /**
     * Get 生产企业电话 
     * @return ManufacturerPhone 生产企业电话
     */
    public String getManufacturerPhone() {
        return this.ManufacturerPhone;
    }

    /**
     * Set 生产企业电话
     * @param ManufacturerPhone 生产企业电话
     */
    public void setManufacturerPhone(String ManufacturerPhone) {
        this.ManufacturerPhone = ManufacturerPhone;
    }

    /**
     * Get 生产企业邮箱 
     * @return ManufacturerEmail 生产企业邮箱
     */
    public String getManufacturerEmail() {
        return this.ManufacturerEmail;
    }

    /**
     * Set 生产企业邮箱
     * @param ManufacturerEmail 生产企业邮箱
     */
    public void setManufacturerEmail(String ManufacturerEmail) {
        this.ManufacturerEmail = ManufacturerEmail;
    }

    /**
     * Get 生产企业网站 
     * @return ManufacturerWebsite 生产企业网站
     */
    public String getManufacturerWebsite() {
        return this.ManufacturerWebsite;
    }

    /**
     * Set 生产企业网站
     * @param ManufacturerWebsite 生产企业网站
     */
    public void setManufacturerWebsite(String ManufacturerWebsite) {
        this.ManufacturerWebsite = ManufacturerWebsite;
    }

    /**
     * Get 说明书制定和修订时间 
     * @return DocRevisionTime 说明书制定和修订时间
     */
    public String getDocRevisionTime() {
        return this.DocRevisionTime;
    }

    /**
     * Set 说明书制定和修订时间
     * @param DocRevisionTime 说明书制定和修订时间
     */
    public void setDocRevisionTime(String DocRevisionTime) {
        this.DocRevisionTime = DocRevisionTime;
    }

    /**
     * Get 参考文献 
     * @return References 参考文献
     */
    public String getReferences() {
        return this.References;
    }

    /**
     * Set 参考文献
     * @param References 参考文献
     */
    public void setReferences(String References) {
        this.References = References;
    }

    /**
     * Get 剂型 
     * @return DrugDosageForm 剂型
     */
    public String getDrugDosageForm() {
        return this.DrugDosageForm;
    }

    /**
     * Set 剂型
     * @param DrugDosageForm 剂型
     */
    public void setDrugDosageForm(String DrugDosageForm) {
        this.DrugDosageForm = DrugDosageForm;
    }

    /**
     * Get 给药途径 
     * @return DrugRoute 给药途径
     */
    public String getDrugRoute() {
        return this.DrugRoute;
    }

    /**
     * Set 给药途径
     * @param DrugRoute 给药途径
     */
    public void setDrugRoute(String DrugRoute) {
        this.DrugRoute = DrugRoute;
    }

    /**
     * Get 药品本位码 
     * @return DrugBasicCode 药品本位码
     */
    public String getDrugBasicCode() {
        return this.DrugBasicCode;
    }

    /**
     * Set 药品本位码
     * @param DrugBasicCode 药品本位码
     */
    public void setDrugBasicCode(String DrugBasicCode) {
        this.DrugBasicCode = DrugBasicCode;
    }

    /**
     * Get OTC标签 
     * @return OctTag OTC标签
     */
    public String getOctTag() {
        return this.OctTag;
    }

    /**
     * Set OTC标签
     * @param OctTag OTC标签
     */
    public void setOctTag(String OctTag) {
        this.OctTag = OctTag;
    }

    public SmartDrugInfoResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartDrugInfoResp(SmartDrugInfoResp source) {
        if (source.DrugId != null) {
            this.DrugId = new String(source.DrugId);
        }
        if (source.SequenceId != null) {
            this.SequenceId = new Long(source.SequenceId);
        }
        if (source.DrugHashId != null) {
            this.DrugHashId = new String(source.DrugHashId);
        }
        if (source.ImgUrl != null) {
            this.ImgUrl = new String(source.ImgUrl);
        }
        if (source.DrugName != null) {
            this.DrugName = new String(source.DrugName);
        }
        if (source.TradeName != null) {
            this.TradeName = new String(source.TradeName);
        }
        if (source.EnglishName != null) {
            this.EnglishName = new String(source.EnglishName);
        }
        if (source.EnglishTradeName != null) {
            this.EnglishTradeName = new String(source.EnglishTradeName);
        }
        if (source.Pinyin != null) {
            this.Pinyin = new String(source.Pinyin);
        }
        if (source.OtherNames != null) {
            this.OtherNames = new String(source.OtherNames);
        }
        if (source.ChemicalName != null) {
            this.ChemicalName = new String(source.ChemicalName);
        }
        if (source.EnglishChemicalName != null) {
            this.EnglishChemicalName = new String(source.EnglishChemicalName);
        }
        if (source.ApprovalNumber != null) {
            this.ApprovalNumber = new String(source.ApprovalNumber);
        }
        if (source.Property != null) {
            this.Property = new String(source.Property);
        }
        if (source.Ingredients != null) {
            this.Ingredients = new String(source.Ingredients);
        }
        if (source.PhenotypicTrait != null) {
            this.PhenotypicTrait = new String(source.PhenotypicTrait);
        }
        if (source.Indications != null) {
            this.Indications = new String(source.Indications);
        }
        if (source.Specifications != null) {
            this.Specifications = new String(source.Specifications);
        }
        if (source.UsageAndDosage != null) {
            this.UsageAndDosage = new String(source.UsageAndDosage);
        }
        if (source.RecommendedUsage != null) {
            this.RecommendedUsage = new RecommendedUsage(source.RecommendedUsage);
        }
        if (source.AdverseReaction != null) {
            this.AdverseReaction = new String(source.AdverseReaction);
        }
        if (source.Contraindication != null) {
            this.Contraindication = new String(source.Contraindication);
        }
        if (source.Attentions != null) {
            this.Attentions = new String(source.Attentions);
        }
        if (source.Overdose != null) {
            this.Overdose = new String(source.Overdose);
        }
        if (source.PregnantAndLactatingWomen != null) {
            this.PregnantAndLactatingWomen = new String(source.PregnantAndLactatingWomen);
        }
        if (source.ElderlyPatients != null) {
            this.ElderlyPatients = new String(source.ElderlyPatients);
        }
        if (source.PediatricDrugs != null) {
            this.PediatricDrugs = new String(source.PediatricDrugs);
        }
        if (source.Interactions != null) {
            this.Interactions = new String(source.Interactions);
        }
        if (source.ClinicalResearch != null) {
            this.ClinicalResearch = new String(source.ClinicalResearch);
        }
        if (source.PharmacologyToxicology != null) {
            this.PharmacologyToxicology = new String(source.PharmacologyToxicology);
        }
        if (source.Pharmacokinetics != null) {
            this.Pharmacokinetics = new String(source.Pharmacokinetics);
        }
        if (source.Warning != null) {
            this.Warning = new String(source.Warning);
        }
        if (source.ExpireDate != null) {
            this.ExpireDate = new String(source.ExpireDate);
        }
        if (source.Storage != null) {
            this.Storage = new String(source.Storage);
        }
        if (source.Pack != null) {
            this.Pack = new String(source.Pack);
        }
        if (source.Manufacturer != null) {
            this.Manufacturer = new String(source.Manufacturer);
        }
        if (source.ManufacturerAddress != null) {
            this.ManufacturerAddress = new String(source.ManufacturerAddress);
        }
        if (source.ManufacturerPhone != null) {
            this.ManufacturerPhone = new String(source.ManufacturerPhone);
        }
        if (source.ManufacturerEmail != null) {
            this.ManufacturerEmail = new String(source.ManufacturerEmail);
        }
        if (source.ManufacturerWebsite != null) {
            this.ManufacturerWebsite = new String(source.ManufacturerWebsite);
        }
        if (source.DocRevisionTime != null) {
            this.DocRevisionTime = new String(source.DocRevisionTime);
        }
        if (source.References != null) {
            this.References = new String(source.References);
        }
        if (source.DrugDosageForm != null) {
            this.DrugDosageForm = new String(source.DrugDosageForm);
        }
        if (source.DrugRoute != null) {
            this.DrugRoute = new String(source.DrugRoute);
        }
        if (source.DrugBasicCode != null) {
            this.DrugBasicCode = new String(source.DrugBasicCode);
        }
        if (source.OctTag != null) {
            this.OctTag = new String(source.OctTag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DrugId", this.DrugId);
        this.setParamSimple(map, prefix + "SequenceId", this.SequenceId);
        this.setParamSimple(map, prefix + "DrugHashId", this.DrugHashId);
        this.setParamSimple(map, prefix + "ImgUrl", this.ImgUrl);
        this.setParamSimple(map, prefix + "DrugName", this.DrugName);
        this.setParamSimple(map, prefix + "TradeName", this.TradeName);
        this.setParamSimple(map, prefix + "EnglishName", this.EnglishName);
        this.setParamSimple(map, prefix + "EnglishTradeName", this.EnglishTradeName);
        this.setParamSimple(map, prefix + "Pinyin", this.Pinyin);
        this.setParamSimple(map, prefix + "OtherNames", this.OtherNames);
        this.setParamSimple(map, prefix + "ChemicalName", this.ChemicalName);
        this.setParamSimple(map, prefix + "EnglishChemicalName", this.EnglishChemicalName);
        this.setParamSimple(map, prefix + "ApprovalNumber", this.ApprovalNumber);
        this.setParamSimple(map, prefix + "Property", this.Property);
        this.setParamSimple(map, prefix + "Ingredients", this.Ingredients);
        this.setParamSimple(map, prefix + "PhenotypicTrait", this.PhenotypicTrait);
        this.setParamSimple(map, prefix + "Indications", this.Indications);
        this.setParamSimple(map, prefix + "Specifications", this.Specifications);
        this.setParamSimple(map, prefix + "UsageAndDosage", this.UsageAndDosage);
        this.setParamObj(map, prefix + "RecommendedUsage.", this.RecommendedUsage);
        this.setParamSimple(map, prefix + "AdverseReaction", this.AdverseReaction);
        this.setParamSimple(map, prefix + "Contraindication", this.Contraindication);
        this.setParamSimple(map, prefix + "Attentions", this.Attentions);
        this.setParamSimple(map, prefix + "Overdose", this.Overdose);
        this.setParamSimple(map, prefix + "PregnantAndLactatingWomen", this.PregnantAndLactatingWomen);
        this.setParamSimple(map, prefix + "ElderlyPatients", this.ElderlyPatients);
        this.setParamSimple(map, prefix + "PediatricDrugs", this.PediatricDrugs);
        this.setParamSimple(map, prefix + "Interactions", this.Interactions);
        this.setParamSimple(map, prefix + "ClinicalResearch", this.ClinicalResearch);
        this.setParamSimple(map, prefix + "PharmacologyToxicology", this.PharmacologyToxicology);
        this.setParamSimple(map, prefix + "Pharmacokinetics", this.Pharmacokinetics);
        this.setParamSimple(map, prefix + "Warning", this.Warning);
        this.setParamSimple(map, prefix + "ExpireDate", this.ExpireDate);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "Pack", this.Pack);
        this.setParamSimple(map, prefix + "Manufacturer", this.Manufacturer);
        this.setParamSimple(map, prefix + "ManufacturerAddress", this.ManufacturerAddress);
        this.setParamSimple(map, prefix + "ManufacturerPhone", this.ManufacturerPhone);
        this.setParamSimple(map, prefix + "ManufacturerEmail", this.ManufacturerEmail);
        this.setParamSimple(map, prefix + "ManufacturerWebsite", this.ManufacturerWebsite);
        this.setParamSimple(map, prefix + "DocRevisionTime", this.DocRevisionTime);
        this.setParamSimple(map, prefix + "References", this.References);
        this.setParamSimple(map, prefix + "DrugDosageForm", this.DrugDosageForm);
        this.setParamSimple(map, prefix + "DrugRoute", this.DrugRoute);
        this.setParamSimple(map, prefix + "DrugBasicCode", this.DrugBasicCode);
        this.setParamSimple(map, prefix + "OctTag", this.OctTag);

    }
}

