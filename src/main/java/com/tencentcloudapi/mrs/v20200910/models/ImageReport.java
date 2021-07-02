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

public class ImageReport extends AbstractModel{

    /**
    * 报告文本信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageText")
    @Expose
    private ImageText ImageText;

    /**
    * 报告类别信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KindSet")
    @Expose
    private KindItem [] KindSet;

    /**
    * 基本信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BasicInfo")
    @Expose
    private BasicInfo BasicInfo;

    /**
    * 个人隐私信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PersonalInfo")
    @Expose
    private PersonalInfo PersonalInfo;

    /**
    * 检验指标内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TestList")
    @Expose
    private TestItem [] TestList;

    /**
    * 检查报告内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Inspection")
    @Expose
    private Inspection Inspection;

    /**
    * 病历资料内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CaseHistory")
    @Expose
    private CaseHistory CaseHistory;

    /**
    * 病理报告内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Pathology")
    @Expose
    private Pathology Pathology;

    /**
     * Get 报告文本信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageText 报告文本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageText getImageText() {
        return this.ImageText;
    }

    /**
     * Set 报告文本信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageText 报告文本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageText(ImageText ImageText) {
        this.ImageText = ImageText;
    }

    /**
     * Get 报告类别信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KindSet 报告类别信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KindItem [] getKindSet() {
        return this.KindSet;
    }

    /**
     * Set 报告类别信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param KindSet 报告类别信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKindSet(KindItem [] KindSet) {
        this.KindSet = KindSet;
    }

    /**
     * Get 基本信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BasicInfo 基本信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BasicInfo getBasicInfo() {
        return this.BasicInfo;
    }

    /**
     * Set 基本信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param BasicInfo 基本信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBasicInfo(BasicInfo BasicInfo) {
        this.BasicInfo = BasicInfo;
    }

    /**
     * Get 个人隐私信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PersonalInfo 个人隐私信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PersonalInfo getPersonalInfo() {
        return this.PersonalInfo;
    }

    /**
     * Set 个人隐私信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PersonalInfo 个人隐私信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPersonalInfo(PersonalInfo PersonalInfo) {
        this.PersonalInfo = PersonalInfo;
    }

    /**
     * Get 检验指标内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TestList 检验指标内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TestItem [] getTestList() {
        return this.TestList;
    }

    /**
     * Set 检验指标内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param TestList 检验指标内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTestList(TestItem [] TestList) {
        this.TestList = TestList;
    }

    /**
     * Get 检查报告内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Inspection 检查报告内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Inspection getInspection() {
        return this.Inspection;
    }

    /**
     * Set 检查报告内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Inspection 检查报告内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInspection(Inspection Inspection) {
        this.Inspection = Inspection;
    }

    /**
     * Get 病历资料内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CaseHistory 病历资料内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CaseHistory getCaseHistory() {
        return this.CaseHistory;
    }

    /**
     * Set 病历资料内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param CaseHistory 病历资料内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCaseHistory(CaseHistory CaseHistory) {
        this.CaseHistory = CaseHistory;
    }

    /**
     * Get 病理报告内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Pathology 病理报告内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Pathology getPathology() {
        return this.Pathology;
    }

    /**
     * Set 病理报告内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Pathology 病理报告内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPathology(Pathology Pathology) {
        this.Pathology = Pathology;
    }

    public ImageReport() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageReport(ImageReport source) {
        if (source.ImageText != null) {
            this.ImageText = new ImageText(source.ImageText);
        }
        if (source.KindSet != null) {
            this.KindSet = new KindItem[source.KindSet.length];
            for (int i = 0; i < source.KindSet.length; i++) {
                this.KindSet[i] = new KindItem(source.KindSet[i]);
            }
        }
        if (source.BasicInfo != null) {
            this.BasicInfo = new BasicInfo(source.BasicInfo);
        }
        if (source.PersonalInfo != null) {
            this.PersonalInfo = new PersonalInfo(source.PersonalInfo);
        }
        if (source.TestList != null) {
            this.TestList = new TestItem[source.TestList.length];
            for (int i = 0; i < source.TestList.length; i++) {
                this.TestList[i] = new TestItem(source.TestList[i]);
            }
        }
        if (source.Inspection != null) {
            this.Inspection = new Inspection(source.Inspection);
        }
        if (source.CaseHistory != null) {
            this.CaseHistory = new CaseHistory(source.CaseHistory);
        }
        if (source.Pathology != null) {
            this.Pathology = new Pathology(source.Pathology);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ImageText.", this.ImageText);
        this.setParamArrayObj(map, prefix + "KindSet.", this.KindSet);
        this.setParamObj(map, prefix + "BasicInfo.", this.BasicInfo);
        this.setParamObj(map, prefix + "PersonalInfo.", this.PersonalInfo);
        this.setParamArrayObj(map, prefix + "TestList.", this.TestList);
        this.setParamObj(map, prefix + "Inspection.", this.Inspection);
        this.setParamObj(map, prefix + "CaseHistory.", this.CaseHistory);
        this.setParamObj(map, prefix + "Pathology.", this.Pathology);

    }
}

