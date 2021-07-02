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

public class Pathology extends AbstractModel{

    /**
    * 病理类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PathologicalType")
    @Expose
    private String PathologicalType;

    /**
    * 侵润深度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InfiltrationDepth")
    @Expose
    private String InfiltrationDepth;

    /**
    * PTNM分期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PTNM")
    @Expose
    private String PTNM;

    /**
    * 远处转移
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DistanceMetastasis")
    @Expose
    private String DistanceMetastasis;

    /**
    * 影像诊断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SummaryText")
    @Expose
    private String SummaryText;

    /**
    * 影像所见
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DescText")
    @Expose
    private String DescText;

    /**
    * 组织学类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HistologyType")
    @Expose
    private String HistologyType;

    /**
    * 组织学等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HistologyLevel")
    @Expose
    private String HistologyLevel;

    /**
    * 标本类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SampleType")
    @Expose
    private String SampleType;

    /**
    * 标本部位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SamplePart")
    @Expose
    private String SamplePart;

    /**
    * 标本大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SampleSize")
    @Expose
    private String SampleSize;

    /**
    * 肿瘤扩散
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvasiveList")
    @Expose
    private Invasive [] InvasiveList;

    /**
    * 肿瘤转移
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetastasisList")
    @Expose
    private Metastasis [] MetastasisList;

    /**
    * 免疫组化信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IHCList")
    @Expose
    private IHC [] IHCList;

    /**
     * Get 病理类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PathologicalType 病理类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPathologicalType() {
        return this.PathologicalType;
    }

    /**
     * Set 病理类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param PathologicalType 病理类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPathologicalType(String PathologicalType) {
        this.PathologicalType = PathologicalType;
    }

    /**
     * Get 侵润深度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InfiltrationDepth 侵润深度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInfiltrationDepth() {
        return this.InfiltrationDepth;
    }

    /**
     * Set 侵润深度
注意：此字段可能返回 null，表示取不到有效值。
     * @param InfiltrationDepth 侵润深度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInfiltrationDepth(String InfiltrationDepth) {
        this.InfiltrationDepth = InfiltrationDepth;
    }

    /**
     * Get PTNM分期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PTNM PTNM分期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPTNM() {
        return this.PTNM;
    }

    /**
     * Set PTNM分期
注意：此字段可能返回 null，表示取不到有效值。
     * @param PTNM PTNM分期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPTNM(String PTNM) {
        this.PTNM = PTNM;
    }

    /**
     * Get 远处转移
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DistanceMetastasis 远处转移
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDistanceMetastasis() {
        return this.DistanceMetastasis;
    }

    /**
     * Set 远处转移
注意：此字段可能返回 null，表示取不到有效值。
     * @param DistanceMetastasis 远处转移
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDistanceMetastasis(String DistanceMetastasis) {
        this.DistanceMetastasis = DistanceMetastasis;
    }

    /**
     * Get 影像诊断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SummaryText 影像诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSummaryText() {
        return this.SummaryText;
    }

    /**
     * Set 影像诊断
注意：此字段可能返回 null，表示取不到有效值。
     * @param SummaryText 影像诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSummaryText(String SummaryText) {
        this.SummaryText = SummaryText;
    }

    /**
     * Get 影像所见
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DescText 影像所见
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescText() {
        return this.DescText;
    }

    /**
     * Set 影像所见
注意：此字段可能返回 null，表示取不到有效值。
     * @param DescText 影像所见
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescText(String DescText) {
        this.DescText = DescText;
    }

    /**
     * Get 组织学类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HistologyType 组织学类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHistologyType() {
        return this.HistologyType;
    }

    /**
     * Set 组织学类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param HistologyType 组织学类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHistologyType(String HistologyType) {
        this.HistologyType = HistologyType;
    }

    /**
     * Get 组织学等级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HistologyLevel 组织学等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHistologyLevel() {
        return this.HistologyLevel;
    }

    /**
     * Set 组织学等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param HistologyLevel 组织学等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHistologyLevel(String HistologyLevel) {
        this.HistologyLevel = HistologyLevel;
    }

    /**
     * Get 标本类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SampleType 标本类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSampleType() {
        return this.SampleType;
    }

    /**
     * Set 标本类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param SampleType 标本类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSampleType(String SampleType) {
        this.SampleType = SampleType;
    }

    /**
     * Get 标本部位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SamplePart 标本部位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSamplePart() {
        return this.SamplePart;
    }

    /**
     * Set 标本部位
注意：此字段可能返回 null，表示取不到有效值。
     * @param SamplePart 标本部位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSamplePart(String SamplePart) {
        this.SamplePart = SamplePart;
    }

    /**
     * Get 标本大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SampleSize 标本大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSampleSize() {
        return this.SampleSize;
    }

    /**
     * Set 标本大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param SampleSize 标本大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSampleSize(String SampleSize) {
        this.SampleSize = SampleSize;
    }

    /**
     * Get 肿瘤扩散
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvasiveList 肿瘤扩散
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Invasive [] getInvasiveList() {
        return this.InvasiveList;
    }

    /**
     * Set 肿瘤扩散
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvasiveList 肿瘤扩散
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvasiveList(Invasive [] InvasiveList) {
        this.InvasiveList = InvasiveList;
    }

    /**
     * Get 肿瘤转移
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetastasisList 肿瘤转移
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Metastasis [] getMetastasisList() {
        return this.MetastasisList;
    }

    /**
     * Set 肿瘤转移
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetastasisList 肿瘤转移
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetastasisList(Metastasis [] MetastasisList) {
        this.MetastasisList = MetastasisList;
    }

    /**
     * Get 免疫组化信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IHCList 免疫组化信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IHC [] getIHCList() {
        return this.IHCList;
    }

    /**
     * Set 免疫组化信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param IHCList 免疫组化信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIHCList(IHC [] IHCList) {
        this.IHCList = IHCList;
    }

    public Pathology() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Pathology(Pathology source) {
        if (source.PathologicalType != null) {
            this.PathologicalType = new String(source.PathologicalType);
        }
        if (source.InfiltrationDepth != null) {
            this.InfiltrationDepth = new String(source.InfiltrationDepth);
        }
        if (source.PTNM != null) {
            this.PTNM = new String(source.PTNM);
        }
        if (source.DistanceMetastasis != null) {
            this.DistanceMetastasis = new String(source.DistanceMetastasis);
        }
        if (source.SummaryText != null) {
            this.SummaryText = new String(source.SummaryText);
        }
        if (source.DescText != null) {
            this.DescText = new String(source.DescText);
        }
        if (source.HistologyType != null) {
            this.HistologyType = new String(source.HistologyType);
        }
        if (source.HistologyLevel != null) {
            this.HistologyLevel = new String(source.HistologyLevel);
        }
        if (source.SampleType != null) {
            this.SampleType = new String(source.SampleType);
        }
        if (source.SamplePart != null) {
            this.SamplePart = new String(source.SamplePart);
        }
        if (source.SampleSize != null) {
            this.SampleSize = new String(source.SampleSize);
        }
        if (source.InvasiveList != null) {
            this.InvasiveList = new Invasive[source.InvasiveList.length];
            for (int i = 0; i < source.InvasiveList.length; i++) {
                this.InvasiveList[i] = new Invasive(source.InvasiveList[i]);
            }
        }
        if (source.MetastasisList != null) {
            this.MetastasisList = new Metastasis[source.MetastasisList.length];
            for (int i = 0; i < source.MetastasisList.length; i++) {
                this.MetastasisList[i] = new Metastasis(source.MetastasisList[i]);
            }
        }
        if (source.IHCList != null) {
            this.IHCList = new IHC[source.IHCList.length];
            for (int i = 0; i < source.IHCList.length; i++) {
                this.IHCList[i] = new IHC(source.IHCList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PathologicalType", this.PathologicalType);
        this.setParamSimple(map, prefix + "InfiltrationDepth", this.InfiltrationDepth);
        this.setParamSimple(map, prefix + "PTNM", this.PTNM);
        this.setParamSimple(map, prefix + "DistanceMetastasis", this.DistanceMetastasis);
        this.setParamSimple(map, prefix + "SummaryText", this.SummaryText);
        this.setParamSimple(map, prefix + "DescText", this.DescText);
        this.setParamSimple(map, prefix + "HistologyType", this.HistologyType);
        this.setParamSimple(map, prefix + "HistologyLevel", this.HistologyLevel);
        this.setParamSimple(map, prefix + "SampleType", this.SampleType);
        this.setParamSimple(map, prefix + "SamplePart", this.SamplePart);
        this.setParamSimple(map, prefix + "SampleSize", this.SampleSize);
        this.setParamArrayObj(map, prefix + "InvasiveList.", this.InvasiveList);
        this.setParamArrayObj(map, prefix + "MetastasisList.", this.MetastasisList);
        this.setParamArrayObj(map, prefix + "IHCList.", this.IHCList);

    }
}

