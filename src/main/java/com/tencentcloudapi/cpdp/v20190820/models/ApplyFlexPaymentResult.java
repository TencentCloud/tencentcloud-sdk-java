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

public class ApplyFlexPaymentResult extends AbstractModel{

    /**
    * 订单ID
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 税前金额
    */
    @SerializedName("AmountBeforeTax")
    @Expose
    private String AmountBeforeTax;

    /**
    * 税后金额
    */
    @SerializedName("AmountAfterTax")
    @Expose
    private String AmountAfterTax;

    /**
    * 税金
    */
    @SerializedName("Tax")
    @Expose
    private String Tax;

    /**
    * 增值税
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vat")
    @Expose
    private String Vat;

    /**
    * 个人所得税
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndividualIncomeTax")
    @Expose
    private String IndividualIncomeTax;

    /**
    * 附加税总税额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdditionalTaxSum")
    @Expose
    private String AdditionalTaxSum;

    /**
    * 附加税税项。格式为JSON格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdditionalTaxItem")
    @Expose
    private String AdditionalTaxItem;

    /**
     * Get 订单ID 
     * @return OrderId 订单ID
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单ID
     * @param OrderId 订单ID
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 税前金额 
     * @return AmountBeforeTax 税前金额
     */
    public String getAmountBeforeTax() {
        return this.AmountBeforeTax;
    }

    /**
     * Set 税前金额
     * @param AmountBeforeTax 税前金额
     */
    public void setAmountBeforeTax(String AmountBeforeTax) {
        this.AmountBeforeTax = AmountBeforeTax;
    }

    /**
     * Get 税后金额 
     * @return AmountAfterTax 税后金额
     */
    public String getAmountAfterTax() {
        return this.AmountAfterTax;
    }

    /**
     * Set 税后金额
     * @param AmountAfterTax 税后金额
     */
    public void setAmountAfterTax(String AmountAfterTax) {
        this.AmountAfterTax = AmountAfterTax;
    }

    /**
     * Get 税金 
     * @return Tax 税金
     */
    public String getTax() {
        return this.Tax;
    }

    /**
     * Set 税金
     * @param Tax 税金
     */
    public void setTax(String Tax) {
        this.Tax = Tax;
    }

    /**
     * Get 增值税
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vat 增值税
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVat() {
        return this.Vat;
    }

    /**
     * Set 增值税
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vat 增值税
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVat(String Vat) {
        this.Vat = Vat;
    }

    /**
     * Get 个人所得税
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndividualIncomeTax 个人所得税
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndividualIncomeTax() {
        return this.IndividualIncomeTax;
    }

    /**
     * Set 个人所得税
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndividualIncomeTax 个人所得税
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndividualIncomeTax(String IndividualIncomeTax) {
        this.IndividualIncomeTax = IndividualIncomeTax;
    }

    /**
     * Get 附加税总税额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdditionalTaxSum 附加税总税额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdditionalTaxSum() {
        return this.AdditionalTaxSum;
    }

    /**
     * Set 附加税总税额
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdditionalTaxSum 附加税总税额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdditionalTaxSum(String AdditionalTaxSum) {
        this.AdditionalTaxSum = AdditionalTaxSum;
    }

    /**
     * Get 附加税税项。格式为JSON格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdditionalTaxItem 附加税税项。格式为JSON格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdditionalTaxItem() {
        return this.AdditionalTaxItem;
    }

    /**
     * Set 附加税税项。格式为JSON格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdditionalTaxItem 附加税税项。格式为JSON格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdditionalTaxItem(String AdditionalTaxItem) {
        this.AdditionalTaxItem = AdditionalTaxItem;
    }

    public ApplyFlexPaymentResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyFlexPaymentResult(ApplyFlexPaymentResult source) {
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.AmountBeforeTax != null) {
            this.AmountBeforeTax = new String(source.AmountBeforeTax);
        }
        if (source.AmountAfterTax != null) {
            this.AmountAfterTax = new String(source.AmountAfterTax);
        }
        if (source.Tax != null) {
            this.Tax = new String(source.Tax);
        }
        if (source.Vat != null) {
            this.Vat = new String(source.Vat);
        }
        if (source.IndividualIncomeTax != null) {
            this.IndividualIncomeTax = new String(source.IndividualIncomeTax);
        }
        if (source.AdditionalTaxSum != null) {
            this.AdditionalTaxSum = new String(source.AdditionalTaxSum);
        }
        if (source.AdditionalTaxItem != null) {
            this.AdditionalTaxItem = new String(source.AdditionalTaxItem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "AmountBeforeTax", this.AmountBeforeTax);
        this.setParamSimple(map, prefix + "AmountAfterTax", this.AmountAfterTax);
        this.setParamSimple(map, prefix + "Tax", this.Tax);
        this.setParamSimple(map, prefix + "Vat", this.Vat);
        this.setParamSimple(map, prefix + "IndividualIncomeTax", this.IndividualIncomeTax);
        this.setParamSimple(map, prefix + "AdditionalTaxSum", this.AdditionalTaxSum);
        this.setParamSimple(map, prefix + "AdditionalTaxItem", this.AdditionalTaxItem);

    }
}

