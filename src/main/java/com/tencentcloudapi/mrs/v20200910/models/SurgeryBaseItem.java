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

public class SurgeryBaseItem extends AbstractModel {

    /**
    * 体检报告-外科-头颈部
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeadNeck")
    @Expose
    private SurgeryHeadNeck HeadNeck;

    /**
    * 体检报告-外科-甲状腺
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Thyroid")
    @Expose
    private SurgeryThyroid Thyroid;

    /**
    * 体检报告-外科-乳房
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Breast")
    @Expose
    private SurgeryBreast Breast;

    /**
    * 体检报告-外科-浅表淋巴结
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LymphNode")
    @Expose
    private SurgeryLymphNode LymphNode;

    /**
    * 体检报告-外科-脊柱
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpinalExtremities")
    @Expose
    private SurgerySpinalExtremities SpinalExtremities;

    /**
    * 体检报告-外科-皮肤
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Skin")
    @Expose
    private SurgerySkin Skin;

    /**
    * 体检报告-外科-肛门直肠
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Anorectal")
    @Expose
    private SurgeryAnorectal Anorectal;

    /**
    * 体检报告-外科-泌尿生殖系统
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UrogenitalSystem")
    @Expose
    private SurgeryUrogenitalSystem UrogenitalSystem;

    /**
    * 体检报告-外科-外科其他
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Others")
    @Expose
    private KeyValueItem [] Others;

    /**
    * 体检报告-外科-小结
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BriefSummary")
    @Expose
    private SurgeryBriefSummary BriefSummary;

    /**
     * Get 体检报告-外科-头颈部
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeadNeck 体检报告-外科-头颈部
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SurgeryHeadNeck getHeadNeck() {
        return this.HeadNeck;
    }

    /**
     * Set 体检报告-外科-头颈部
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeadNeck 体检报告-外科-头颈部
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeadNeck(SurgeryHeadNeck HeadNeck) {
        this.HeadNeck = HeadNeck;
    }

    /**
     * Get 体检报告-外科-甲状腺
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Thyroid 体检报告-外科-甲状腺
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SurgeryThyroid getThyroid() {
        return this.Thyroid;
    }

    /**
     * Set 体检报告-外科-甲状腺
注意：此字段可能返回 null，表示取不到有效值。
     * @param Thyroid 体检报告-外科-甲状腺
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThyroid(SurgeryThyroid Thyroid) {
        this.Thyroid = Thyroid;
    }

    /**
     * Get 体检报告-外科-乳房
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Breast 体检报告-外科-乳房
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SurgeryBreast getBreast() {
        return this.Breast;
    }

    /**
     * Set 体检报告-外科-乳房
注意：此字段可能返回 null，表示取不到有效值。
     * @param Breast 体检报告-外科-乳房
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBreast(SurgeryBreast Breast) {
        this.Breast = Breast;
    }

    /**
     * Get 体检报告-外科-浅表淋巴结
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LymphNode 体检报告-外科-浅表淋巴结
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SurgeryLymphNode getLymphNode() {
        return this.LymphNode;
    }

    /**
     * Set 体检报告-外科-浅表淋巴结
注意：此字段可能返回 null，表示取不到有效值。
     * @param LymphNode 体检报告-外科-浅表淋巴结
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLymphNode(SurgeryLymphNode LymphNode) {
        this.LymphNode = LymphNode;
    }

    /**
     * Get 体检报告-外科-脊柱
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpinalExtremities 体检报告-外科-脊柱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SurgerySpinalExtremities getSpinalExtremities() {
        return this.SpinalExtremities;
    }

    /**
     * Set 体检报告-外科-脊柱
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpinalExtremities 体检报告-外科-脊柱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpinalExtremities(SurgerySpinalExtremities SpinalExtremities) {
        this.SpinalExtremities = SpinalExtremities;
    }

    /**
     * Get 体检报告-外科-皮肤
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Skin 体检报告-外科-皮肤
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SurgerySkin getSkin() {
        return this.Skin;
    }

    /**
     * Set 体检报告-外科-皮肤
注意：此字段可能返回 null，表示取不到有效值。
     * @param Skin 体检报告-外科-皮肤
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSkin(SurgerySkin Skin) {
        this.Skin = Skin;
    }

    /**
     * Get 体检报告-外科-肛门直肠
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Anorectal 体检报告-外科-肛门直肠
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SurgeryAnorectal getAnorectal() {
        return this.Anorectal;
    }

    /**
     * Set 体检报告-外科-肛门直肠
注意：此字段可能返回 null，表示取不到有效值。
     * @param Anorectal 体检报告-外科-肛门直肠
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnorectal(SurgeryAnorectal Anorectal) {
        this.Anorectal = Anorectal;
    }

    /**
     * Get 体检报告-外科-泌尿生殖系统
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UrogenitalSystem 体检报告-外科-泌尿生殖系统
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SurgeryUrogenitalSystem getUrogenitalSystem() {
        return this.UrogenitalSystem;
    }

    /**
     * Set 体检报告-外科-泌尿生殖系统
注意：此字段可能返回 null，表示取不到有效值。
     * @param UrogenitalSystem 体检报告-外科-泌尿生殖系统
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrogenitalSystem(SurgeryUrogenitalSystem UrogenitalSystem) {
        this.UrogenitalSystem = UrogenitalSystem;
    }

    /**
     * Get 体检报告-外科-外科其他
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Others 体检报告-外科-外科其他
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueItem [] getOthers() {
        return this.Others;
    }

    /**
     * Set 体检报告-外科-外科其他
注意：此字段可能返回 null，表示取不到有效值。
     * @param Others 体检报告-外科-外科其他
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOthers(KeyValueItem [] Others) {
        this.Others = Others;
    }

    /**
     * Get 体检报告-外科-小结
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BriefSummary 体检报告-外科-小结
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SurgeryBriefSummary getBriefSummary() {
        return this.BriefSummary;
    }

    /**
     * Set 体检报告-外科-小结
注意：此字段可能返回 null，表示取不到有效值。
     * @param BriefSummary 体检报告-外科-小结
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBriefSummary(SurgeryBriefSummary BriefSummary) {
        this.BriefSummary = BriefSummary;
    }

    public SurgeryBaseItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SurgeryBaseItem(SurgeryBaseItem source) {
        if (source.HeadNeck != null) {
            this.HeadNeck = new SurgeryHeadNeck(source.HeadNeck);
        }
        if (source.Thyroid != null) {
            this.Thyroid = new SurgeryThyroid(source.Thyroid);
        }
        if (source.Breast != null) {
            this.Breast = new SurgeryBreast(source.Breast);
        }
        if (source.LymphNode != null) {
            this.LymphNode = new SurgeryLymphNode(source.LymphNode);
        }
        if (source.SpinalExtremities != null) {
            this.SpinalExtremities = new SurgerySpinalExtremities(source.SpinalExtremities);
        }
        if (source.Skin != null) {
            this.Skin = new SurgerySkin(source.Skin);
        }
        if (source.Anorectal != null) {
            this.Anorectal = new SurgeryAnorectal(source.Anorectal);
        }
        if (source.UrogenitalSystem != null) {
            this.UrogenitalSystem = new SurgeryUrogenitalSystem(source.UrogenitalSystem);
        }
        if (source.Others != null) {
            this.Others = new KeyValueItem[source.Others.length];
            for (int i = 0; i < source.Others.length; i++) {
                this.Others[i] = new KeyValueItem(source.Others[i]);
            }
        }
        if (source.BriefSummary != null) {
            this.BriefSummary = new SurgeryBriefSummary(source.BriefSummary);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "HeadNeck.", this.HeadNeck);
        this.setParamObj(map, prefix + "Thyroid.", this.Thyroid);
        this.setParamObj(map, prefix + "Breast.", this.Breast);
        this.setParamObj(map, prefix + "LymphNode.", this.LymphNode);
        this.setParamObj(map, prefix + "SpinalExtremities.", this.SpinalExtremities);
        this.setParamObj(map, prefix + "Skin.", this.Skin);
        this.setParamObj(map, prefix + "Anorectal.", this.Anorectal);
        this.setParamObj(map, prefix + "UrogenitalSystem.", this.UrogenitalSystem);
        this.setParamArrayObj(map, prefix + "Others.", this.Others);
        this.setParamObj(map, prefix + "BriefSummary.", this.BriefSummary);

    }
}

