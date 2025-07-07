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
package com.tencentcloudapi.aca.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RationalDrugInfo extends AbstractModel {

    /**
    * 是否有风险
    */
    @SerializedName("Hit")
    @Expose
    private Boolean Hit;

    /**
    * 药品用量风险
    */
    @SerializedName("DrugUsages")
    @Expose
    private RiskInfo [] DrugUsages;

    /**
    * 重复用药风险
    */
    @SerializedName("DrugRepeats")
    @Expose
    private RiskInfo [] DrugRepeats;

    /**
    * 用药途径风险
    */
    @SerializedName("DrugRoutes")
    @Expose
    private RiskInfo [] DrugRoutes;

    /**
    * 特殊人群风险
    */
    @SerializedName("SpecialPopulations")
    @Expose
    private RiskInfo [] SpecialPopulations;

    /**
    * 禁忌症风险
    */
    @SerializedName("DrugTaboos")
    @Expose
    private RiskInfo [] DrugTaboos;

    /**
    * 相互作用风险
    */
    @SerializedName("DrugInteractions")
    @Expose
    private RiskInfo [] DrugInteractions;

    /**
    * 配伍禁忌风险
    */
    @SerializedName("DrugIncompatibility")
    @Expose
    private RiskInfo [] DrugIncompatibility;

    /**
    * 过敏风险
    */
    @SerializedName("DrugAllergys")
    @Expose
    private RiskInfo [] DrugAllergys;

    /**
    * 适应症风险
    */
    @SerializedName("DrugIndications")
    @Expose
    private RiskInfo [] DrugIndications;

    /**
    * 异常提醒
    */
    @SerializedName("Abnormals")
    @Expose
    private Abnormals [] Abnormals;

    /**
    * 药品列表
    */
    @SerializedName("DrugList")
    @Expose
    private DrugList [] DrugList;

    /**
     * Get 是否有风险 
     * @return Hit 是否有风险
     */
    public Boolean getHit() {
        return this.Hit;
    }

    /**
     * Set 是否有风险
     * @param Hit 是否有风险
     */
    public void setHit(Boolean Hit) {
        this.Hit = Hit;
    }

    /**
     * Get 药品用量风险 
     * @return DrugUsages 药品用量风险
     */
    public RiskInfo [] getDrugUsages() {
        return this.DrugUsages;
    }

    /**
     * Set 药品用量风险
     * @param DrugUsages 药品用量风险
     */
    public void setDrugUsages(RiskInfo [] DrugUsages) {
        this.DrugUsages = DrugUsages;
    }

    /**
     * Get 重复用药风险 
     * @return DrugRepeats 重复用药风险
     */
    public RiskInfo [] getDrugRepeats() {
        return this.DrugRepeats;
    }

    /**
     * Set 重复用药风险
     * @param DrugRepeats 重复用药风险
     */
    public void setDrugRepeats(RiskInfo [] DrugRepeats) {
        this.DrugRepeats = DrugRepeats;
    }

    /**
     * Get 用药途径风险 
     * @return DrugRoutes 用药途径风险
     */
    public RiskInfo [] getDrugRoutes() {
        return this.DrugRoutes;
    }

    /**
     * Set 用药途径风险
     * @param DrugRoutes 用药途径风险
     */
    public void setDrugRoutes(RiskInfo [] DrugRoutes) {
        this.DrugRoutes = DrugRoutes;
    }

    /**
     * Get 特殊人群风险 
     * @return SpecialPopulations 特殊人群风险
     */
    public RiskInfo [] getSpecialPopulations() {
        return this.SpecialPopulations;
    }

    /**
     * Set 特殊人群风险
     * @param SpecialPopulations 特殊人群风险
     */
    public void setSpecialPopulations(RiskInfo [] SpecialPopulations) {
        this.SpecialPopulations = SpecialPopulations;
    }

    /**
     * Get 禁忌症风险 
     * @return DrugTaboos 禁忌症风险
     */
    public RiskInfo [] getDrugTaboos() {
        return this.DrugTaboos;
    }

    /**
     * Set 禁忌症风险
     * @param DrugTaboos 禁忌症风险
     */
    public void setDrugTaboos(RiskInfo [] DrugTaboos) {
        this.DrugTaboos = DrugTaboos;
    }

    /**
     * Get 相互作用风险 
     * @return DrugInteractions 相互作用风险
     */
    public RiskInfo [] getDrugInteractions() {
        return this.DrugInteractions;
    }

    /**
     * Set 相互作用风险
     * @param DrugInteractions 相互作用风险
     */
    public void setDrugInteractions(RiskInfo [] DrugInteractions) {
        this.DrugInteractions = DrugInteractions;
    }

    /**
     * Get 配伍禁忌风险 
     * @return DrugIncompatibility 配伍禁忌风险
     */
    public RiskInfo [] getDrugIncompatibility() {
        return this.DrugIncompatibility;
    }

    /**
     * Set 配伍禁忌风险
     * @param DrugIncompatibility 配伍禁忌风险
     */
    public void setDrugIncompatibility(RiskInfo [] DrugIncompatibility) {
        this.DrugIncompatibility = DrugIncompatibility;
    }

    /**
     * Get 过敏风险 
     * @return DrugAllergys 过敏风险
     */
    public RiskInfo [] getDrugAllergys() {
        return this.DrugAllergys;
    }

    /**
     * Set 过敏风险
     * @param DrugAllergys 过敏风险
     */
    public void setDrugAllergys(RiskInfo [] DrugAllergys) {
        this.DrugAllergys = DrugAllergys;
    }

    /**
     * Get 适应症风险 
     * @return DrugIndications 适应症风险
     */
    public RiskInfo [] getDrugIndications() {
        return this.DrugIndications;
    }

    /**
     * Set 适应症风险
     * @param DrugIndications 适应症风险
     */
    public void setDrugIndications(RiskInfo [] DrugIndications) {
        this.DrugIndications = DrugIndications;
    }

    /**
     * Get 异常提醒 
     * @return Abnormals 异常提醒
     */
    public Abnormals [] getAbnormals() {
        return this.Abnormals;
    }

    /**
     * Set 异常提醒
     * @param Abnormals 异常提醒
     */
    public void setAbnormals(Abnormals [] Abnormals) {
        this.Abnormals = Abnormals;
    }

    /**
     * Get 药品列表 
     * @return DrugList 药品列表
     */
    public DrugList [] getDrugList() {
        return this.DrugList;
    }

    /**
     * Set 药品列表
     * @param DrugList 药品列表
     */
    public void setDrugList(DrugList [] DrugList) {
        this.DrugList = DrugList;
    }

    public RationalDrugInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RationalDrugInfo(RationalDrugInfo source) {
        if (source.Hit != null) {
            this.Hit = new Boolean(source.Hit);
        }
        if (source.DrugUsages != null) {
            this.DrugUsages = new RiskInfo[source.DrugUsages.length];
            for (int i = 0; i < source.DrugUsages.length; i++) {
                this.DrugUsages[i] = new RiskInfo(source.DrugUsages[i]);
            }
        }
        if (source.DrugRepeats != null) {
            this.DrugRepeats = new RiskInfo[source.DrugRepeats.length];
            for (int i = 0; i < source.DrugRepeats.length; i++) {
                this.DrugRepeats[i] = new RiskInfo(source.DrugRepeats[i]);
            }
        }
        if (source.DrugRoutes != null) {
            this.DrugRoutes = new RiskInfo[source.DrugRoutes.length];
            for (int i = 0; i < source.DrugRoutes.length; i++) {
                this.DrugRoutes[i] = new RiskInfo(source.DrugRoutes[i]);
            }
        }
        if (source.SpecialPopulations != null) {
            this.SpecialPopulations = new RiskInfo[source.SpecialPopulations.length];
            for (int i = 0; i < source.SpecialPopulations.length; i++) {
                this.SpecialPopulations[i] = new RiskInfo(source.SpecialPopulations[i]);
            }
        }
        if (source.DrugTaboos != null) {
            this.DrugTaboos = new RiskInfo[source.DrugTaboos.length];
            for (int i = 0; i < source.DrugTaboos.length; i++) {
                this.DrugTaboos[i] = new RiskInfo(source.DrugTaboos[i]);
            }
        }
        if (source.DrugInteractions != null) {
            this.DrugInteractions = new RiskInfo[source.DrugInteractions.length];
            for (int i = 0; i < source.DrugInteractions.length; i++) {
                this.DrugInteractions[i] = new RiskInfo(source.DrugInteractions[i]);
            }
        }
        if (source.DrugIncompatibility != null) {
            this.DrugIncompatibility = new RiskInfo[source.DrugIncompatibility.length];
            for (int i = 0; i < source.DrugIncompatibility.length; i++) {
                this.DrugIncompatibility[i] = new RiskInfo(source.DrugIncompatibility[i]);
            }
        }
        if (source.DrugAllergys != null) {
            this.DrugAllergys = new RiskInfo[source.DrugAllergys.length];
            for (int i = 0; i < source.DrugAllergys.length; i++) {
                this.DrugAllergys[i] = new RiskInfo(source.DrugAllergys[i]);
            }
        }
        if (source.DrugIndications != null) {
            this.DrugIndications = new RiskInfo[source.DrugIndications.length];
            for (int i = 0; i < source.DrugIndications.length; i++) {
                this.DrugIndications[i] = new RiskInfo(source.DrugIndications[i]);
            }
        }
        if (source.Abnormals != null) {
            this.Abnormals = new Abnormals[source.Abnormals.length];
            for (int i = 0; i < source.Abnormals.length; i++) {
                this.Abnormals[i] = new Abnormals(source.Abnormals[i]);
            }
        }
        if (source.DrugList != null) {
            this.DrugList = new DrugList[source.DrugList.length];
            for (int i = 0; i < source.DrugList.length; i++) {
                this.DrugList[i] = new DrugList(source.DrugList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Hit", this.Hit);
        this.setParamArrayObj(map, prefix + "DrugUsages.", this.DrugUsages);
        this.setParamArrayObj(map, prefix + "DrugRepeats.", this.DrugRepeats);
        this.setParamArrayObj(map, prefix + "DrugRoutes.", this.DrugRoutes);
        this.setParamArrayObj(map, prefix + "SpecialPopulations.", this.SpecialPopulations);
        this.setParamArrayObj(map, prefix + "DrugTaboos.", this.DrugTaboos);
        this.setParamArrayObj(map, prefix + "DrugInteractions.", this.DrugInteractions);
        this.setParamArrayObj(map, prefix + "DrugIncompatibility.", this.DrugIncompatibility);
        this.setParamArrayObj(map, prefix + "DrugAllergys.", this.DrugAllergys);
        this.setParamArrayObj(map, prefix + "DrugIndications.", this.DrugIndications);
        this.setParamArrayObj(map, prefix + "Abnormals.", this.Abnormals);
        this.setParamArrayObj(map, prefix + "DrugList.", this.DrugList);

    }
}

