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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrderItem extends AbstractModel{

    /**
    * 明细金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AmountHasTax")
    @Expose
    private Float AmountHasTax;

    /**
    * 优惠金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Discount")
    @Expose
    private Float Discount;

    /**
    * 商品名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 型号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Models")
    @Expose
    private String Models;

    /**
    * 数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 数量单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 默认“0”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 单价
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Price")
    @Expose
    private Float Price;

    /**
    * 商品编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaxCode")
    @Expose
    private String TaxCode;

    /**
     * Get 明细金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AmountHasTax 明细金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getAmountHasTax() {
        return this.AmountHasTax;
    }

    /**
     * Set 明细金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param AmountHasTax 明细金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAmountHasTax(Float AmountHasTax) {
        this.AmountHasTax = AmountHasTax;
    }

    /**
     * Get 优惠金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Discount 优惠金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDiscount() {
        return this.Discount;
    }

    /**
     * Set 优惠金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param Discount 优惠金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiscount(Float Discount) {
        this.Discount = Discount;
    }

    /**
     * Get 商品名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 商品名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 商品名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 商品名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 型号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Models 型号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModels() {
        return this.Models;
    }

    /**
     * Set 型号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Models 型号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModels(String Models) {
        this.Models = Models;
    }

    /**
     * Get 数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 数量单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Unit 数量单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 数量单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param Unit 数量单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 默认“0”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 默认“0”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 默认“0”
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 默认“0”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 单价
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Price 单价
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getPrice() {
        return this.Price;
    }

    /**
     * Set 单价
注意：此字段可能返回 null，表示取不到有效值。
     * @param Price 单价
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrice(Float Price) {
        this.Price = Price;
    }

    /**
     * Get 商品编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaxCode 商品编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaxCode() {
        return this.TaxCode;
    }

    /**
     * Set 商品编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaxCode 商品编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaxCode(String TaxCode) {
        this.TaxCode = TaxCode;
    }

    public OrderItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrderItem(OrderItem source) {
        if (source.AmountHasTax != null) {
            this.AmountHasTax = new Float(source.AmountHasTax);
        }
        if (source.Discount != null) {
            this.Discount = new Float(source.Discount);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Models != null) {
            this.Models = new String(source.Models);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Price != null) {
            this.Price = new Float(source.Price);
        }
        if (source.TaxCode != null) {
            this.TaxCode = new String(source.TaxCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AmountHasTax", this.AmountHasTax);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Models", this.Models);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "TaxCode", this.TaxCode);

    }
}

