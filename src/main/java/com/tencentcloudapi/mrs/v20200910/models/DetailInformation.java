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

public class DetailInformation extends AbstractModel{

    /**
    * 部位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Part")
    @Expose
    private Part Part;

    /**
    * 组织大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TissueSizes")
    @Expose
    private Size [] TissueSizes;

    /**
    * 结节大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TuberSizes")
    @Expose
    private Size [] TuberSizes;

    /**
    * 肿瘤大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CancerSizes")
    @Expose
    private Size [] CancerSizes;

    /**
    * 组织学等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HistologyLevel")
    @Expose
    private BaseInfo HistologyLevel;

    /**
    * 组织学类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HistologyType")
    @Expose
    private HistologyTypeV2 HistologyType;

    /**
    * 侵犯
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Invasive")
    @Expose
    private InvasiveV2 [] Invasive;

    /**
    * pTNM
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PTNM")
    @Expose
    private PTNM PTNM;

    /**
    * 浸润深度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InfiltrationDepth")
    @Expose
    private BaseInfo InfiltrationDepth;

    /**
    * 结节数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TuberNum")
    @Expose
    private BaseInfo TuberNum;

    /**
    * 钙化
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Calcification")
    @Expose
    private BaseInfo Calcification;

    /**
    * 坏死
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Necrosis")
    @Expose
    private BaseInfo Necrosis;

    /**
    * 异形
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Abnormity")
    @Expose
    private BaseInfo Abnormity;

    /**
    * 断链
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Breaked")
    @Expose
    private BaseInfo Breaked;

    /**
     * Get 部位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Part 部位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Part getPart() {
        return this.Part;
    }

    /**
     * Set 部位
注意：此字段可能返回 null，表示取不到有效值。
     * @param Part 部位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPart(Part Part) {
        this.Part = Part;
    }

    /**
     * Get 组织大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TissueSizes 组织大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Size [] getTissueSizes() {
        return this.TissueSizes;
    }

    /**
     * Set 组织大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param TissueSizes 组织大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTissueSizes(Size [] TissueSizes) {
        this.TissueSizes = TissueSizes;
    }

    /**
     * Get 结节大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TuberSizes 结节大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Size [] getTuberSizes() {
        return this.TuberSizes;
    }

    /**
     * Set 结节大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param TuberSizes 结节大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTuberSizes(Size [] TuberSizes) {
        this.TuberSizes = TuberSizes;
    }

    /**
     * Get 肿瘤大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CancerSizes 肿瘤大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Size [] getCancerSizes() {
        return this.CancerSizes;
    }

    /**
     * Set 肿瘤大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param CancerSizes 肿瘤大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCancerSizes(Size [] CancerSizes) {
        this.CancerSizes = CancerSizes;
    }

    /**
     * Get 组织学等级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HistologyLevel 组织学等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseInfo getHistologyLevel() {
        return this.HistologyLevel;
    }

    /**
     * Set 组织学等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param HistologyLevel 组织学等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHistologyLevel(BaseInfo HistologyLevel) {
        this.HistologyLevel = HistologyLevel;
    }

    /**
     * Get 组织学类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HistologyType 组织学类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HistologyTypeV2 getHistologyType() {
        return this.HistologyType;
    }

    /**
     * Set 组织学类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param HistologyType 组织学类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHistologyType(HistologyTypeV2 HistologyType) {
        this.HistologyType = HistologyType;
    }

    /**
     * Get 侵犯
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Invasive 侵犯
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InvasiveV2 [] getInvasive() {
        return this.Invasive;
    }

    /**
     * Set 侵犯
注意：此字段可能返回 null，表示取不到有效值。
     * @param Invasive 侵犯
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvasive(InvasiveV2 [] Invasive) {
        this.Invasive = Invasive;
    }

    /**
     * Get pTNM
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PTNM pTNM
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PTNM getPTNM() {
        return this.PTNM;
    }

    /**
     * Set pTNM
注意：此字段可能返回 null，表示取不到有效值。
     * @param PTNM pTNM
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPTNM(PTNM PTNM) {
        this.PTNM = PTNM;
    }

    /**
     * Get 浸润深度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InfiltrationDepth 浸润深度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseInfo getInfiltrationDepth() {
        return this.InfiltrationDepth;
    }

    /**
     * Set 浸润深度
注意：此字段可能返回 null，表示取不到有效值。
     * @param InfiltrationDepth 浸润深度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInfiltrationDepth(BaseInfo InfiltrationDepth) {
        this.InfiltrationDepth = InfiltrationDepth;
    }

    /**
     * Get 结节数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TuberNum 结节数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseInfo getTuberNum() {
        return this.TuberNum;
    }

    /**
     * Set 结节数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TuberNum 结节数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTuberNum(BaseInfo TuberNum) {
        this.TuberNum = TuberNum;
    }

    /**
     * Get 钙化
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Calcification 钙化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseInfo getCalcification() {
        return this.Calcification;
    }

    /**
     * Set 钙化
注意：此字段可能返回 null，表示取不到有效值。
     * @param Calcification 钙化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalcification(BaseInfo Calcification) {
        this.Calcification = Calcification;
    }

    /**
     * Get 坏死
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Necrosis 坏死
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseInfo getNecrosis() {
        return this.Necrosis;
    }

    /**
     * Set 坏死
注意：此字段可能返回 null，表示取不到有效值。
     * @param Necrosis 坏死
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNecrosis(BaseInfo Necrosis) {
        this.Necrosis = Necrosis;
    }

    /**
     * Get 异形
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Abnormity 异形
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseInfo getAbnormity() {
        return this.Abnormity;
    }

    /**
     * Set 异形
注意：此字段可能返回 null，表示取不到有效值。
     * @param Abnormity 异形
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAbnormity(BaseInfo Abnormity) {
        this.Abnormity = Abnormity;
    }

    /**
     * Get 断链
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Breaked 断链
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseInfo getBreaked() {
        return this.Breaked;
    }

    /**
     * Set 断链
注意：此字段可能返回 null，表示取不到有效值。
     * @param Breaked 断链
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBreaked(BaseInfo Breaked) {
        this.Breaked = Breaked;
    }

    public DetailInformation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetailInformation(DetailInformation source) {
        if (source.Part != null) {
            this.Part = new Part(source.Part);
        }
        if (source.TissueSizes != null) {
            this.TissueSizes = new Size[source.TissueSizes.length];
            for (int i = 0; i < source.TissueSizes.length; i++) {
                this.TissueSizes[i] = new Size(source.TissueSizes[i]);
            }
        }
        if (source.TuberSizes != null) {
            this.TuberSizes = new Size[source.TuberSizes.length];
            for (int i = 0; i < source.TuberSizes.length; i++) {
                this.TuberSizes[i] = new Size(source.TuberSizes[i]);
            }
        }
        if (source.CancerSizes != null) {
            this.CancerSizes = new Size[source.CancerSizes.length];
            for (int i = 0; i < source.CancerSizes.length; i++) {
                this.CancerSizes[i] = new Size(source.CancerSizes[i]);
            }
        }
        if (source.HistologyLevel != null) {
            this.HistologyLevel = new BaseInfo(source.HistologyLevel);
        }
        if (source.HistologyType != null) {
            this.HistologyType = new HistologyTypeV2(source.HistologyType);
        }
        if (source.Invasive != null) {
            this.Invasive = new InvasiveV2[source.Invasive.length];
            for (int i = 0; i < source.Invasive.length; i++) {
                this.Invasive[i] = new InvasiveV2(source.Invasive[i]);
            }
        }
        if (source.PTNM != null) {
            this.PTNM = new PTNM(source.PTNM);
        }
        if (source.InfiltrationDepth != null) {
            this.InfiltrationDepth = new BaseInfo(source.InfiltrationDepth);
        }
        if (source.TuberNum != null) {
            this.TuberNum = new BaseInfo(source.TuberNum);
        }
        if (source.Calcification != null) {
            this.Calcification = new BaseInfo(source.Calcification);
        }
        if (source.Necrosis != null) {
            this.Necrosis = new BaseInfo(source.Necrosis);
        }
        if (source.Abnormity != null) {
            this.Abnormity = new BaseInfo(source.Abnormity);
        }
        if (source.Breaked != null) {
            this.Breaked = new BaseInfo(source.Breaked);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Part.", this.Part);
        this.setParamArrayObj(map, prefix + "TissueSizes.", this.TissueSizes);
        this.setParamArrayObj(map, prefix + "TuberSizes.", this.TuberSizes);
        this.setParamArrayObj(map, prefix + "CancerSizes.", this.CancerSizes);
        this.setParamObj(map, prefix + "HistologyLevel.", this.HistologyLevel);
        this.setParamObj(map, prefix + "HistologyType.", this.HistologyType);
        this.setParamArrayObj(map, prefix + "Invasive.", this.Invasive);
        this.setParamObj(map, prefix + "PTNM.", this.PTNM);
        this.setParamObj(map, prefix + "InfiltrationDepth.", this.InfiltrationDepth);
        this.setParamObj(map, prefix + "TuberNum.", this.TuberNum);
        this.setParamObj(map, prefix + "Calcification.", this.Calcification);
        this.setParamObj(map, prefix + "Necrosis.", this.Necrosis);
        this.setParamObj(map, prefix + "Abnormity.", this.Abnormity);
        this.setParamObj(map, prefix + "Breaked.", this.Breaked);

    }
}

