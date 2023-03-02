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

public class PathologyV2 extends AbstractModel{

    /**
    * 报告类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PathologicalReportType")
    @Expose
    private Report PathologicalReportType;

    /**
    * 描述段落
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Desc")
    @Expose
    private DescInfo Desc;

    /**
    * 诊断结论
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Summary")
    @Expose
    private SummaryInfo Summary;

    /**
    * 报告全文
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReportText")
    @Expose
    private String ReportText;

    /**
    * 淋巴结总计转移信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LymphTotal")
    @Expose
    private LymphTotal [] LymphTotal;

    /**
    * 单淋巴结转移信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LymphNodes")
    @Expose
    private LymphNode [] LymphNodes;

    /**
    * ihc信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ihc")
    @Expose
    private IHCV2 [] Ihc;

    /**
    * 临床诊断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Clinical")
    @Expose
    private BaseInfo Clinical;

    /**
    * 是否癌前病变
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Precancer")
    @Expose
    private HistologyClass Precancer;

    /**
    * 是否恶性肿瘤
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Malignant")
    @Expose
    private HistologyClass Malignant;

    /**
    * 是否良性肿瘤
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Benigntumor")
    @Expose
    private HistologyClass Benigntumor;

    /**
    * 送检材料
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SampleType")
    @Expose
    private BaseInfo SampleType;

    /**
    * 淋巴结大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LymphSize")
    @Expose
    private Size [] LymphSize;

    /**
    * 分子病理
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Molecular")
    @Expose
    private Molecular [] Molecular;

    /**
     * Get 报告类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PathologicalReportType 报告类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Report getPathologicalReportType() {
        return this.PathologicalReportType;
    }

    /**
     * Set 报告类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param PathologicalReportType 报告类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPathologicalReportType(Report PathologicalReportType) {
        this.PathologicalReportType = PathologicalReportType;
    }

    /**
     * Get 描述段落
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Desc 描述段落
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescInfo getDesc() {
        return this.Desc;
    }

    /**
     * Set 描述段落
注意：此字段可能返回 null，表示取不到有效值。
     * @param Desc 描述段落
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDesc(DescInfo Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 诊断结论
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Summary 诊断结论
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SummaryInfo getSummary() {
        return this.Summary;
    }

    /**
     * Set 诊断结论
注意：此字段可能返回 null，表示取不到有效值。
     * @param Summary 诊断结论
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSummary(SummaryInfo Summary) {
        this.Summary = Summary;
    }

    /**
     * Get 报告全文
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReportText 报告全文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReportText() {
        return this.ReportText;
    }

    /**
     * Set 报告全文
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReportText 报告全文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReportText(String ReportText) {
        this.ReportText = ReportText;
    }

    /**
     * Get 淋巴结总计转移信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LymphTotal 淋巴结总计转移信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LymphTotal [] getLymphTotal() {
        return this.LymphTotal;
    }

    /**
     * Set 淋巴结总计转移信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param LymphTotal 淋巴结总计转移信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLymphTotal(LymphTotal [] LymphTotal) {
        this.LymphTotal = LymphTotal;
    }

    /**
     * Get 单淋巴结转移信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LymphNodes 单淋巴结转移信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LymphNode [] getLymphNodes() {
        return this.LymphNodes;
    }

    /**
     * Set 单淋巴结转移信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param LymphNodes 单淋巴结转移信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLymphNodes(LymphNode [] LymphNodes) {
        this.LymphNodes = LymphNodes;
    }

    /**
     * Get ihc信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ihc ihc信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IHCV2 [] getIhc() {
        return this.Ihc;
    }

    /**
     * Set ihc信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ihc ihc信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIhc(IHCV2 [] Ihc) {
        this.Ihc = Ihc;
    }

    /**
     * Get 临床诊断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Clinical 临床诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseInfo getClinical() {
        return this.Clinical;
    }

    /**
     * Set 临床诊断
注意：此字段可能返回 null，表示取不到有效值。
     * @param Clinical 临床诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClinical(BaseInfo Clinical) {
        this.Clinical = Clinical;
    }

    /**
     * Get 是否癌前病变
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Precancer 是否癌前病变
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HistologyClass getPrecancer() {
        return this.Precancer;
    }

    /**
     * Set 是否癌前病变
注意：此字段可能返回 null，表示取不到有效值。
     * @param Precancer 是否癌前病变
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrecancer(HistologyClass Precancer) {
        this.Precancer = Precancer;
    }

    /**
     * Get 是否恶性肿瘤
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Malignant 是否恶性肿瘤
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HistologyClass getMalignant() {
        return this.Malignant;
    }

    /**
     * Set 是否恶性肿瘤
注意：此字段可能返回 null，表示取不到有效值。
     * @param Malignant 是否恶性肿瘤
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMalignant(HistologyClass Malignant) {
        this.Malignant = Malignant;
    }

    /**
     * Get 是否良性肿瘤
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Benigntumor 是否良性肿瘤
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HistologyClass getBenigntumor() {
        return this.Benigntumor;
    }

    /**
     * Set 是否良性肿瘤
注意：此字段可能返回 null，表示取不到有效值。
     * @param Benigntumor 是否良性肿瘤
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBenigntumor(HistologyClass Benigntumor) {
        this.Benigntumor = Benigntumor;
    }

    /**
     * Get 送检材料
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SampleType 送检材料
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseInfo getSampleType() {
        return this.SampleType;
    }

    /**
     * Set 送检材料
注意：此字段可能返回 null，表示取不到有效值。
     * @param SampleType 送检材料
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSampleType(BaseInfo SampleType) {
        this.SampleType = SampleType;
    }

    /**
     * Get 淋巴结大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LymphSize 淋巴结大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Size [] getLymphSize() {
        return this.LymphSize;
    }

    /**
     * Set 淋巴结大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param LymphSize 淋巴结大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLymphSize(Size [] LymphSize) {
        this.LymphSize = LymphSize;
    }

    /**
     * Get 分子病理
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Molecular 分子病理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Molecular [] getMolecular() {
        return this.Molecular;
    }

    /**
     * Set 分子病理
注意：此字段可能返回 null，表示取不到有效值。
     * @param Molecular 分子病理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMolecular(Molecular [] Molecular) {
        this.Molecular = Molecular;
    }

    public PathologyV2() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PathologyV2(PathologyV2 source) {
        if (source.PathologicalReportType != null) {
            this.PathologicalReportType = new Report(source.PathologicalReportType);
        }
        if (source.Desc != null) {
            this.Desc = new DescInfo(source.Desc);
        }
        if (source.Summary != null) {
            this.Summary = new SummaryInfo(source.Summary);
        }
        if (source.ReportText != null) {
            this.ReportText = new String(source.ReportText);
        }
        if (source.LymphTotal != null) {
            this.LymphTotal = new LymphTotal[source.LymphTotal.length];
            for (int i = 0; i < source.LymphTotal.length; i++) {
                this.LymphTotal[i] = new LymphTotal(source.LymphTotal[i]);
            }
        }
        if (source.LymphNodes != null) {
            this.LymphNodes = new LymphNode[source.LymphNodes.length];
            for (int i = 0; i < source.LymphNodes.length; i++) {
                this.LymphNodes[i] = new LymphNode(source.LymphNodes[i]);
            }
        }
        if (source.Ihc != null) {
            this.Ihc = new IHCV2[source.Ihc.length];
            for (int i = 0; i < source.Ihc.length; i++) {
                this.Ihc[i] = new IHCV2(source.Ihc[i]);
            }
        }
        if (source.Clinical != null) {
            this.Clinical = new BaseInfo(source.Clinical);
        }
        if (source.Precancer != null) {
            this.Precancer = new HistologyClass(source.Precancer);
        }
        if (source.Malignant != null) {
            this.Malignant = new HistologyClass(source.Malignant);
        }
        if (source.Benigntumor != null) {
            this.Benigntumor = new HistologyClass(source.Benigntumor);
        }
        if (source.SampleType != null) {
            this.SampleType = new BaseInfo(source.SampleType);
        }
        if (source.LymphSize != null) {
            this.LymphSize = new Size[source.LymphSize.length];
            for (int i = 0; i < source.LymphSize.length; i++) {
                this.LymphSize[i] = new Size(source.LymphSize[i]);
            }
        }
        if (source.Molecular != null) {
            this.Molecular = new Molecular[source.Molecular.length];
            for (int i = 0; i < source.Molecular.length; i++) {
                this.Molecular[i] = new Molecular(source.Molecular[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "PathologicalReportType.", this.PathologicalReportType);
        this.setParamObj(map, prefix + "Desc.", this.Desc);
        this.setParamObj(map, prefix + "Summary.", this.Summary);
        this.setParamSimple(map, prefix + "ReportText", this.ReportText);
        this.setParamArrayObj(map, prefix + "LymphTotal.", this.LymphTotal);
        this.setParamArrayObj(map, prefix + "LymphNodes.", this.LymphNodes);
        this.setParamArrayObj(map, prefix + "Ihc.", this.Ihc);
        this.setParamObj(map, prefix + "Clinical.", this.Clinical);
        this.setParamObj(map, prefix + "Precancer.", this.Precancer);
        this.setParamObj(map, prefix + "Malignant.", this.Malignant);
        this.setParamObj(map, prefix + "Benigntumor.", this.Benigntumor);
        this.setParamObj(map, prefix + "SampleType.", this.SampleType);
        this.setParamArrayObj(map, prefix + "LymphSize.", this.LymphSize);
        this.setParamArrayObj(map, prefix + "Molecular.", this.Molecular);

    }
}

