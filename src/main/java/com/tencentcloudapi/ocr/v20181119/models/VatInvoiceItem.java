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

public class VatInvoiceItem extends AbstractModel{

    /**
    * 行号
    */
    @SerializedName("LineNo")
    @Expose
    private String LineNo;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 规格
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * 单位
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 数量
    */
    @SerializedName("Quantity")
    @Expose
    private String Quantity;

    /**
    * 单价
    */
    @SerializedName("UnitPrice")
    @Expose
    private String UnitPrice;

    /**
    * 不含税金额
    */
    @SerializedName("AmountWithoutTax")
    @Expose
    private String AmountWithoutTax;

    /**
    * 税率
    */
    @SerializedName("TaxRate")
    @Expose
    private String TaxRate;

    /**
    * 税额
    */
    @SerializedName("TaxAmount")
    @Expose
    private String TaxAmount;

    /**
     * Get 行号 
     * @return LineNo 行号
     */
    public String getLineNo() {
        return this.LineNo;
    }

    /**
     * Set 行号
     * @param LineNo 行号
     */
    public void setLineNo(String LineNo) {
        this.LineNo = LineNo;
    }

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 规格 
     * @return Spec 规格
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set 规格
     * @param Spec 规格
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get 单位 
     * @return Unit 单位
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 单位
     * @param Unit 单位
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
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
     * Get 单价 
     * @return UnitPrice 单价
     */
    public String getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set 单价
     * @param UnitPrice 单价
     */
    public void setUnitPrice(String UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get 不含税金额 
     * @return AmountWithoutTax 不含税金额
     */
    public String getAmountWithoutTax() {
        return this.AmountWithoutTax;
    }

    /**
     * Set 不含税金额
     * @param AmountWithoutTax 不含税金额
     */
    public void setAmountWithoutTax(String AmountWithoutTax) {
        this.AmountWithoutTax = AmountWithoutTax;
    }

    /**
     * Get 税率 
     * @return TaxRate 税率
     */
    public String getTaxRate() {
        return this.TaxRate;
    }

    /**
     * Set 税率
     * @param TaxRate 税率
     */
    public void setTaxRate(String TaxRate) {
        this.TaxRate = TaxRate;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LineNo", this.LineNo);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "Quantity", this.Quantity);
        this.setParamSimple(map, prefix + "UnitPrice", this.UnitPrice);
        this.setParamSimple(map, prefix + "AmountWithoutTax", this.AmountWithoutTax);
        this.setParamSimple(map, prefix + "TaxRate", this.TaxRate);
        this.setParamSimple(map, prefix + "TaxAmount", this.TaxAmount);

    }
}

