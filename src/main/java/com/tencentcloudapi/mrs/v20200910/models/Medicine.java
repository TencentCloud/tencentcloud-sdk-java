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

public class Medicine extends AbstractModel {

    /**
    * 药品名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 商品名
    */
    @SerializedName("TradeName")
    @Expose
    private String TradeName;

    /**
    * 厂商
    */
    @SerializedName("Firm")
    @Expose
    private String Firm;

    /**
    * 医保类型
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 规格
    */
    @SerializedName("Specification")
    @Expose
    private String Specification;

    /**
    * 最小包装数量
    */
    @SerializedName("MinQuantity")
    @Expose
    private String MinQuantity;

    /**
    * 最小制剂单位
    */
    @SerializedName("DosageUnit")
    @Expose
    private String DosageUnit;

    /**
    * 最小包装单位
    */
    @SerializedName("PackingUnit")
    @Expose
    private String PackingUnit;

    /**
     * Get 药品名 
     * @return Name 药品名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 药品名
     * @param Name 药品名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 商品名 
     * @return TradeName 商品名
     */
    public String getTradeName() {
        return this.TradeName;
    }

    /**
     * Set 商品名
     * @param TradeName 商品名
     */
    public void setTradeName(String TradeName) {
        this.TradeName = TradeName;
    }

    /**
     * Get 厂商 
     * @return Firm 厂商
     */
    public String getFirm() {
        return this.Firm;
    }

    /**
     * Set 厂商
     * @param Firm 厂商
     */
    public void setFirm(String Firm) {
        this.Firm = Firm;
    }

    /**
     * Get 医保类型 
     * @return Category 医保类型
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 医保类型
     * @param Category 医保类型
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 规格 
     * @return Specification 规格
     */
    public String getSpecification() {
        return this.Specification;
    }

    /**
     * Set 规格
     * @param Specification 规格
     */
    public void setSpecification(String Specification) {
        this.Specification = Specification;
    }

    /**
     * Get 最小包装数量 
     * @return MinQuantity 最小包装数量
     */
    public String getMinQuantity() {
        return this.MinQuantity;
    }

    /**
     * Set 最小包装数量
     * @param MinQuantity 最小包装数量
     */
    public void setMinQuantity(String MinQuantity) {
        this.MinQuantity = MinQuantity;
    }

    /**
     * Get 最小制剂单位 
     * @return DosageUnit 最小制剂单位
     */
    public String getDosageUnit() {
        return this.DosageUnit;
    }

    /**
     * Set 最小制剂单位
     * @param DosageUnit 最小制剂单位
     */
    public void setDosageUnit(String DosageUnit) {
        this.DosageUnit = DosageUnit;
    }

    /**
     * Get 最小包装单位 
     * @return PackingUnit 最小包装单位
     */
    public String getPackingUnit() {
        return this.PackingUnit;
    }

    /**
     * Set 最小包装单位
     * @param PackingUnit 最小包装单位
     */
    public void setPackingUnit(String PackingUnit) {
        this.PackingUnit = PackingUnit;
    }

    public Medicine() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Medicine(Medicine source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TradeName != null) {
            this.TradeName = new String(source.TradeName);
        }
        if (source.Firm != null) {
            this.Firm = new String(source.Firm);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Specification != null) {
            this.Specification = new String(source.Specification);
        }
        if (source.MinQuantity != null) {
            this.MinQuantity = new String(source.MinQuantity);
        }
        if (source.DosageUnit != null) {
            this.DosageUnit = new String(source.DosageUnit);
        }
        if (source.PackingUnit != null) {
            this.PackingUnit = new String(source.PackingUnit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TradeName", this.TradeName);
        this.setParamSimple(map, prefix + "Firm", this.Firm);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Specification", this.Specification);
        this.setParamSimple(map, prefix + "MinQuantity", this.MinQuantity);
        this.setParamSimple(map, prefix + "DosageUnit", this.DosageUnit);
        this.setParamSimple(map, prefix + "PackingUnit", this.PackingUnit);

    }
}

