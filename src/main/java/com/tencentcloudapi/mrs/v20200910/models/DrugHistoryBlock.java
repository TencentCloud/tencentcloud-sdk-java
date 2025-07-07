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

public class DrugHistoryBlock extends AbstractModel {

    /**
    * 药品名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 原文
    */
    @SerializedName("Src")
    @Expose
    private String Src;

    /**
    * 药物列表
    */
    @SerializedName("DrugList")
    @Expose
    private DrugListBlock [] DrugList;

    /**
    * 归一化值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 药品名称 
     * @return Name 药品名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 药品名称
     * @param Name 药品名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 原文 
     * @return Src 原文
     */
    public String getSrc() {
        return this.Src;
    }

    /**
     * Set 原文
     * @param Src 原文
     */
    public void setSrc(String Src) {
        this.Src = Src;
    }

    /**
     * Get 药物列表 
     * @return DrugList 药物列表
     */
    public DrugListBlock [] getDrugList() {
        return this.DrugList;
    }

    /**
     * Set 药物列表
     * @param DrugList 药物列表
     */
    public void setDrugList(DrugListBlock [] DrugList) {
        this.DrugList = DrugList;
    }

    /**
     * Get 归一化值 
     * @return Value 归一化值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 归一化值
     * @param Value 归一化值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public DrugHistoryBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DrugHistoryBlock(DrugHistoryBlock source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Src != null) {
            this.Src = new String(source.Src);
        }
        if (source.DrugList != null) {
            this.DrugList = new DrugListBlock[source.DrugList.length];
            for (int i = 0; i < source.DrugList.length; i++) {
                this.DrugList[i] = new DrugListBlock(source.DrugList[i]);
            }
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Src", this.Src);
        this.setParamArrayObj(map, prefix + "DrugList.", this.DrugList);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

