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

public class DischargeInfoBlock extends AbstractModel {

    /**
    * 疾病史
    */
    @SerializedName("DiseaseHistory")
    @Expose
    private DiseaseHistoryBlock DiseaseHistory;

    /**
    * 个人史
    */
    @SerializedName("PersonalHistory")
    @Expose
    private PersonalHistoryBlock PersonalHistory;

    /**
    * 药物史
    */
    @SerializedName("DrugHistory")
    @Expose
    private DrugHistoryBlock DrugHistory;

    /**
    * 治疗相关
    */
    @SerializedName("TreatmentRecord")
    @Expose
    private TreatmentRecordBlock TreatmentRecord;

    /**
    * 文本段落
    */
    @SerializedName("ParagraphBlock")
    @Expose
    private ParagraphBlock ParagraphBlock;

    /**
    * 数据在原PDF文件中的第几页
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
     * Get 疾病史 
     * @return DiseaseHistory 疾病史
     */
    public DiseaseHistoryBlock getDiseaseHistory() {
        return this.DiseaseHistory;
    }

    /**
     * Set 疾病史
     * @param DiseaseHistory 疾病史
     */
    public void setDiseaseHistory(DiseaseHistoryBlock DiseaseHistory) {
        this.DiseaseHistory = DiseaseHistory;
    }

    /**
     * Get 个人史 
     * @return PersonalHistory 个人史
     */
    public PersonalHistoryBlock getPersonalHistory() {
        return this.PersonalHistory;
    }

    /**
     * Set 个人史
     * @param PersonalHistory 个人史
     */
    public void setPersonalHistory(PersonalHistoryBlock PersonalHistory) {
        this.PersonalHistory = PersonalHistory;
    }

    /**
     * Get 药物史 
     * @return DrugHistory 药物史
     */
    public DrugHistoryBlock getDrugHistory() {
        return this.DrugHistory;
    }

    /**
     * Set 药物史
     * @param DrugHistory 药物史
     */
    public void setDrugHistory(DrugHistoryBlock DrugHistory) {
        this.DrugHistory = DrugHistory;
    }

    /**
     * Get 治疗相关 
     * @return TreatmentRecord 治疗相关
     */
    public TreatmentRecordBlock getTreatmentRecord() {
        return this.TreatmentRecord;
    }

    /**
     * Set 治疗相关
     * @param TreatmentRecord 治疗相关
     */
    public void setTreatmentRecord(TreatmentRecordBlock TreatmentRecord) {
        this.TreatmentRecord = TreatmentRecord;
    }

    /**
     * Get 文本段落 
     * @return ParagraphBlock 文本段落
     */
    public ParagraphBlock getParagraphBlock() {
        return this.ParagraphBlock;
    }

    /**
     * Set 文本段落
     * @param ParagraphBlock 文本段落
     */
    public void setParagraphBlock(ParagraphBlock ParagraphBlock) {
        this.ParagraphBlock = ParagraphBlock;
    }

    /**
     * Get 数据在原PDF文件中的第几页 
     * @return Page 数据在原PDF文件中的第几页
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 数据在原PDF文件中的第几页
     * @param Page 数据在原PDF文件中的第几页
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    public DischargeInfoBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DischargeInfoBlock(DischargeInfoBlock source) {
        if (source.DiseaseHistory != null) {
            this.DiseaseHistory = new DiseaseHistoryBlock(source.DiseaseHistory);
        }
        if (source.PersonalHistory != null) {
            this.PersonalHistory = new PersonalHistoryBlock(source.PersonalHistory);
        }
        if (source.DrugHistory != null) {
            this.DrugHistory = new DrugHistoryBlock(source.DrugHistory);
        }
        if (source.TreatmentRecord != null) {
            this.TreatmentRecord = new TreatmentRecordBlock(source.TreatmentRecord);
        }
        if (source.ParagraphBlock != null) {
            this.ParagraphBlock = new ParagraphBlock(source.ParagraphBlock);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DiseaseHistory.", this.DiseaseHistory);
        this.setParamObj(map, prefix + "PersonalHistory.", this.PersonalHistory);
        this.setParamObj(map, prefix + "DrugHistory.", this.DrugHistory);
        this.setParamObj(map, prefix + "TreatmentRecord.", this.TreatmentRecord);
        this.setParamObj(map, prefix + "ParagraphBlock.", this.ParagraphBlock);
        this.setParamSimple(map, prefix + "Page", this.Page);

    }
}

