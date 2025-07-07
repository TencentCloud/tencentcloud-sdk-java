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

public class PathologyReport extends AbstractModel {

    /**
    * 癌症部位
    */
    @SerializedName("CancerPart")
    @Expose
    private Part CancerPart;

    /**
    * 癌症部位大小
    */
    @SerializedName("CancerSize")
    @Expose
    private Size [] CancerSize;

    /**
    * 描述文本
    */
    @SerializedName("DescText")
    @Expose
    private String DescText;

    /**
    * 组织学等级
    */
    @SerializedName("HistologyLevel")
    @Expose
    private HistologyLevel HistologyLevel;

    /**
    * 组织学类型
    */
    @SerializedName("HistologyType")
    @Expose
    private HistologyType HistologyType;

    /**
    * IHC信息
    */
    @SerializedName("IHC")
    @Expose
    private IHCInfo [] IHC;

    /**
    * 浸润深度
    */
    @SerializedName("InfiltrationDepth")
    @Expose
    private BlockInfo InfiltrationDepth;

    /**
    * 肿瘤扩散
    */
    @SerializedName("Invasive")
    @Expose
    private Invas [] Invasive;

    /**
    * 淋巴结
    */
    @SerializedName("LymphNodes")
    @Expose
    private Lymph [] LymphNodes;

    /**
    * PTNM信息
    */
    @SerializedName("PTNM")
    @Expose
    private BlockInfo PTNM;

    /**
    * 病理报告类型
    */
    @SerializedName("PathologicalReportType")
    @Expose
    private BlockInfo PathologicalReportType;

    /**
    * 报告原文
    */
    @SerializedName("ReportText")
    @Expose
    private String ReportText;

    /**
    * 标本类型
    */
    @SerializedName("SampleType")
    @Expose
    private BlockInfo SampleType;

    /**
    * 结论文本
    */
    @SerializedName("SummaryText")
    @Expose
    private String SummaryText;

    /**
     * Get 癌症部位 
     * @return CancerPart 癌症部位
     */
    public Part getCancerPart() {
        return this.CancerPart;
    }

    /**
     * Set 癌症部位
     * @param CancerPart 癌症部位
     */
    public void setCancerPart(Part CancerPart) {
        this.CancerPart = CancerPart;
    }

    /**
     * Get 癌症部位大小 
     * @return CancerSize 癌症部位大小
     */
    public Size [] getCancerSize() {
        return this.CancerSize;
    }

    /**
     * Set 癌症部位大小
     * @param CancerSize 癌症部位大小
     */
    public void setCancerSize(Size [] CancerSize) {
        this.CancerSize = CancerSize;
    }

    /**
     * Get 描述文本 
     * @return DescText 描述文本
     */
    public String getDescText() {
        return this.DescText;
    }

    /**
     * Set 描述文本
     * @param DescText 描述文本
     */
    public void setDescText(String DescText) {
        this.DescText = DescText;
    }

    /**
     * Get 组织学等级 
     * @return HistologyLevel 组织学等级
     */
    public HistologyLevel getHistologyLevel() {
        return this.HistologyLevel;
    }

    /**
     * Set 组织学等级
     * @param HistologyLevel 组织学等级
     */
    public void setHistologyLevel(HistologyLevel HistologyLevel) {
        this.HistologyLevel = HistologyLevel;
    }

    /**
     * Get 组织学类型 
     * @return HistologyType 组织学类型
     */
    public HistologyType getHistologyType() {
        return this.HistologyType;
    }

    /**
     * Set 组织学类型
     * @param HistologyType 组织学类型
     */
    public void setHistologyType(HistologyType HistologyType) {
        this.HistologyType = HistologyType;
    }

    /**
     * Get IHC信息 
     * @return IHC IHC信息
     */
    public IHCInfo [] getIHC() {
        return this.IHC;
    }

    /**
     * Set IHC信息
     * @param IHC IHC信息
     */
    public void setIHC(IHCInfo [] IHC) {
        this.IHC = IHC;
    }

    /**
     * Get 浸润深度 
     * @return InfiltrationDepth 浸润深度
     */
    public BlockInfo getInfiltrationDepth() {
        return this.InfiltrationDepth;
    }

    /**
     * Set 浸润深度
     * @param InfiltrationDepth 浸润深度
     */
    public void setInfiltrationDepth(BlockInfo InfiltrationDepth) {
        this.InfiltrationDepth = InfiltrationDepth;
    }

    /**
     * Get 肿瘤扩散 
     * @return Invasive 肿瘤扩散
     */
    public Invas [] getInvasive() {
        return this.Invasive;
    }

    /**
     * Set 肿瘤扩散
     * @param Invasive 肿瘤扩散
     */
    public void setInvasive(Invas [] Invasive) {
        this.Invasive = Invasive;
    }

    /**
     * Get 淋巴结 
     * @return LymphNodes 淋巴结
     */
    public Lymph [] getLymphNodes() {
        return this.LymphNodes;
    }

    /**
     * Set 淋巴结
     * @param LymphNodes 淋巴结
     */
    public void setLymphNodes(Lymph [] LymphNodes) {
        this.LymphNodes = LymphNodes;
    }

    /**
     * Get PTNM信息 
     * @return PTNM PTNM信息
     */
    public BlockInfo getPTNM() {
        return this.PTNM;
    }

    /**
     * Set PTNM信息
     * @param PTNM PTNM信息
     */
    public void setPTNM(BlockInfo PTNM) {
        this.PTNM = PTNM;
    }

    /**
     * Get 病理报告类型 
     * @return PathologicalReportType 病理报告类型
     */
    public BlockInfo getPathologicalReportType() {
        return this.PathologicalReportType;
    }

    /**
     * Set 病理报告类型
     * @param PathologicalReportType 病理报告类型
     */
    public void setPathologicalReportType(BlockInfo PathologicalReportType) {
        this.PathologicalReportType = PathologicalReportType;
    }

    /**
     * Get 报告原文 
     * @return ReportText 报告原文
     */
    public String getReportText() {
        return this.ReportText;
    }

    /**
     * Set 报告原文
     * @param ReportText 报告原文
     */
    public void setReportText(String ReportText) {
        this.ReportText = ReportText;
    }

    /**
     * Get 标本类型 
     * @return SampleType 标本类型
     */
    public BlockInfo getSampleType() {
        return this.SampleType;
    }

    /**
     * Set 标本类型
     * @param SampleType 标本类型
     */
    public void setSampleType(BlockInfo SampleType) {
        this.SampleType = SampleType;
    }

    /**
     * Get 结论文本 
     * @return SummaryText 结论文本
     */
    public String getSummaryText() {
        return this.SummaryText;
    }

    /**
     * Set 结论文本
     * @param SummaryText 结论文本
     */
    public void setSummaryText(String SummaryText) {
        this.SummaryText = SummaryText;
    }

    public PathologyReport() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PathologyReport(PathologyReport source) {
        if (source.CancerPart != null) {
            this.CancerPart = new Part(source.CancerPart);
        }
        if (source.CancerSize != null) {
            this.CancerSize = new Size[source.CancerSize.length];
            for (int i = 0; i < source.CancerSize.length; i++) {
                this.CancerSize[i] = new Size(source.CancerSize[i]);
            }
        }
        if (source.DescText != null) {
            this.DescText = new String(source.DescText);
        }
        if (source.HistologyLevel != null) {
            this.HistologyLevel = new HistologyLevel(source.HistologyLevel);
        }
        if (source.HistologyType != null) {
            this.HistologyType = new HistologyType(source.HistologyType);
        }
        if (source.IHC != null) {
            this.IHC = new IHCInfo[source.IHC.length];
            for (int i = 0; i < source.IHC.length; i++) {
                this.IHC[i] = new IHCInfo(source.IHC[i]);
            }
        }
        if (source.InfiltrationDepth != null) {
            this.InfiltrationDepth = new BlockInfo(source.InfiltrationDepth);
        }
        if (source.Invasive != null) {
            this.Invasive = new Invas[source.Invasive.length];
            for (int i = 0; i < source.Invasive.length; i++) {
                this.Invasive[i] = new Invas(source.Invasive[i]);
            }
        }
        if (source.LymphNodes != null) {
            this.LymphNodes = new Lymph[source.LymphNodes.length];
            for (int i = 0; i < source.LymphNodes.length; i++) {
                this.LymphNodes[i] = new Lymph(source.LymphNodes[i]);
            }
        }
        if (source.PTNM != null) {
            this.PTNM = new BlockInfo(source.PTNM);
        }
        if (source.PathologicalReportType != null) {
            this.PathologicalReportType = new BlockInfo(source.PathologicalReportType);
        }
        if (source.ReportText != null) {
            this.ReportText = new String(source.ReportText);
        }
        if (source.SampleType != null) {
            this.SampleType = new BlockInfo(source.SampleType);
        }
        if (source.SummaryText != null) {
            this.SummaryText = new String(source.SummaryText);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CancerPart.", this.CancerPart);
        this.setParamArrayObj(map, prefix + "CancerSize.", this.CancerSize);
        this.setParamSimple(map, prefix + "DescText", this.DescText);
        this.setParamObj(map, prefix + "HistologyLevel.", this.HistologyLevel);
        this.setParamObj(map, prefix + "HistologyType.", this.HistologyType);
        this.setParamArrayObj(map, prefix + "IHC.", this.IHC);
        this.setParamObj(map, prefix + "InfiltrationDepth.", this.InfiltrationDepth);
        this.setParamArrayObj(map, prefix + "Invasive.", this.Invasive);
        this.setParamArrayObj(map, prefix + "LymphNodes.", this.LymphNodes);
        this.setParamObj(map, prefix + "PTNM.", this.PTNM);
        this.setParamObj(map, prefix + "PathologicalReportType.", this.PathologicalReportType);
        this.setParamSimple(map, prefix + "ReportText", this.ReportText);
        this.setParamObj(map, prefix + "SampleType.", this.SampleType);
        this.setParamSimple(map, prefix + "SummaryText", this.SummaryText);

    }
}

