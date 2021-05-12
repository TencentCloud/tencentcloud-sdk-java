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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VatInvoiceGoodsInfo extends AbstractModel{

    /**
    * 项目名称
    */
    @SerializedName("Item")
    @Expose
    private String Item;

    /**
    * 规格型号
    */
    @SerializedName("Specification")
    @Expose
    private String Specification;

    /**
    * 单位
    */
    @SerializedName("MeasurementDimension")
    @Expose
    private String MeasurementDimension;

    /**
    * 价格
    */
    @SerializedName("Price")
    @Expose
    private String Price;

    /**
    * 数量
    */
    @SerializedName("Quantity")
    @Expose
    private String Quantity;

    /**
    * 金额
    */
    @SerializedName("Amount")
    @Expose
    private String Amount;

    /**
    * 税率(如6%、免税)
    */
    @SerializedName("TaxScheme")
    @Expose
    private String TaxScheme;

    /**
    * 税额
    */
    @SerializedName("TaxAmount")
    @Expose
    private String TaxAmount;

    /**
     * Get 项目名称 
     * @return Item 项目名称
     */
    public String getItem() {
        return this.Item;
    }

    /**
     * Set 项目名称
     * @param Item 项目名称
     */
    public void setItem(String Item) {
        this.Item = Item;
    }

    /**
     * Get 规格型号 
     * @return Specification 规格型号
     */
    public String getSpecification() {
        return this.Specification;
    }

    /**
     * Set 规格型号
     * @param Specification 规格型号
     */
    public void setSpecification(String Specification) {
        this.Specification = Specification;
    }

    /**
     * Get 单位 
     * @return MeasurementDimension 单位
     */
    public String getMeasurementDimension() {
        return this.MeasurementDimension;
    }

    /**
     * Set 单位
     * @param MeasurementDimension 单位
     */
    public void setMeasurementDimension(String MeasurementDimension) {
        this.MeasurementDimension = MeasurementDimension;
    }

    /**
     * Get 价格 
     * @return Price 价格
     */
    public String getPrice() {
        return this.Price;
    }

    /**
     * Set 价格
     * @param Price 价格
     */
    public void setPrice(String Price) {
        this.Price = Price;
    }

    /**
     * Get 数量 
     * @return Quantity 数量
     */
    public String getQuantity() {
        return this.Quantity;
    }

    /**
     * Set 数量
     * @param Quantity 数量
     */
    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    /**
     * Get 金额 
     * @return Amount 金额
     */
    public String getAmount() {
        return this.Amount;
    }

    /**
     * Set 金额
     * @param Amount 金额
     */
    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

    /**
     * Get 税率(如6%、免税) 
     * @return TaxScheme 税率(如6%、免税)
     */
    public String getTaxScheme() {
        return this.TaxScheme;
    }

    /**
     * Set 税率(如6%、免税)
     * @param TaxScheme 税率(如6%、免税)
     */
    public void setTaxScheme(String TaxScheme) {
        this.TaxScheme = TaxScheme;
    }

    /**
     * Get 税额 
     * @return TaxAmount 税额
     */
    public String getTaxAmount() {
        return this.TaxAmount;
    }

    /**
     * Set 税额
     * @param TaxAmount 税额
     */
    public void setTaxAmount(String TaxAmount) {
        this.TaxAmount = TaxAmount;
    }

    public VatInvoiceGoodsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VatInvoiceGoodsInfo(VatInvoiceGoodsInfo source) {
        if (source.Item != null) {
            this.Item = new String(source.Item);
        }
        if (source.Specification != null) {
            this.Specification = new String(source.Specification);
        }
        if (source.MeasurementDimension != null) {
            this.MeasurementDimension = new String(source.MeasurementDimension);
        }
        if (source.Price != null) {
            this.Price = new String(source.Price);
        }
        if (source.Quantity != null) {
            this.Quantity = new String(source.Quantity);
        }
        if (source.Amount != null) {
            this.Amount = new String(source.Amount);
        }
        if (source.TaxScheme != null) {
            this.TaxScheme = new String(source.TaxScheme);
        }
        if (source.TaxAmount != null) {
            this.TaxAmount = new String(source.TaxAmount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Item", this.Item);
        this.setParamSimple(map, prefix + "Specification", this.Specification);
        this.setParamSimple(map, prefix + "MeasurementDimension", this.MeasurementDimension);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "Quantity", this.Quantity);
        this.setParamSimple(map, prefix + "Amount", this.Amount);
        this.setParamSimple(map, prefix + "TaxScheme", this.TaxScheme);
        this.setParamSimple(map, prefix + "TaxAmount", this.TaxAmount);

    }
}

