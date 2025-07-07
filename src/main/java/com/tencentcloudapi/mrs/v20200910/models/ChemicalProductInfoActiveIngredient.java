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

public class ChemicalProductInfoActiveIngredient extends AbstractModel {

    /**
    * 文本内容
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 活性成份的化学名称
    */
    @SerializedName("ChemicalName")
    @Expose
    private String ChemicalName;

    /**
    * 活性成份的化学结构式
    */
    @SerializedName("ChemicalFormula")
    @Expose
    private String ChemicalFormula;

    /**
    * 活性成份的分子式
    */
    @SerializedName("MolecularFormula")
    @Expose
    private String MolecularFormula;

    /**
    * 活性成份的分子量
    */
    @SerializedName("MolecularWeight")
    @Expose
    private String MolecularWeight;

    /**
     * Get 文本内容 
     * @return Text 文本内容
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 文本内容
     * @param Text 文本内容
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 活性成份的化学名称 
     * @return ChemicalName 活性成份的化学名称
     */
    public String getChemicalName() {
        return this.ChemicalName;
    }

    /**
     * Set 活性成份的化学名称
     * @param ChemicalName 活性成份的化学名称
     */
    public void setChemicalName(String ChemicalName) {
        this.ChemicalName = ChemicalName;
    }

    /**
     * Get 活性成份的化学结构式 
     * @return ChemicalFormula 活性成份的化学结构式
     */
    public String getChemicalFormula() {
        return this.ChemicalFormula;
    }

    /**
     * Set 活性成份的化学结构式
     * @param ChemicalFormula 活性成份的化学结构式
     */
    public void setChemicalFormula(String ChemicalFormula) {
        this.ChemicalFormula = ChemicalFormula;
    }

    /**
     * Get 活性成份的分子式 
     * @return MolecularFormula 活性成份的分子式
     */
    public String getMolecularFormula() {
        return this.MolecularFormula;
    }

    /**
     * Set 活性成份的分子式
     * @param MolecularFormula 活性成份的分子式
     */
    public void setMolecularFormula(String MolecularFormula) {
        this.MolecularFormula = MolecularFormula;
    }

    /**
     * Get 活性成份的分子量 
     * @return MolecularWeight 活性成份的分子量
     */
    public String getMolecularWeight() {
        return this.MolecularWeight;
    }

    /**
     * Set 活性成份的分子量
     * @param MolecularWeight 活性成份的分子量
     */
    public void setMolecularWeight(String MolecularWeight) {
        this.MolecularWeight = MolecularWeight;
    }

    public ChemicalProductInfoActiveIngredient() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChemicalProductInfoActiveIngredient(ChemicalProductInfoActiveIngredient source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.ChemicalName != null) {
            this.ChemicalName = new String(source.ChemicalName);
        }
        if (source.ChemicalFormula != null) {
            this.ChemicalFormula = new String(source.ChemicalFormula);
        }
        if (source.MolecularFormula != null) {
            this.MolecularFormula = new String(source.MolecularFormula);
        }
        if (source.MolecularWeight != null) {
            this.MolecularWeight = new String(source.MolecularWeight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "ChemicalName", this.ChemicalName);
        this.setParamSimple(map, prefix + "ChemicalFormula", this.ChemicalFormula);
        this.setParamSimple(map, prefix + "MolecularFormula", this.MolecularFormula);
        this.setParamSimple(map, prefix + "MolecularWeight", this.MolecularWeight);

    }
}

