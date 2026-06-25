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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CostComponentSet extends AbstractModel {

    /**
    * <p>组件类型名称</p>
    */
    @SerializedName("ComponentCodeName")
    @Expose
    private String ComponentCodeName;

    /**
    * <p>组件名称</p>
    */
    @SerializedName("ItemCodeName")
    @Expose
    private String ItemCodeName;

    /**
    * <p>刊例价</p>
    */
    @SerializedName("SinglePrice")
    @Expose
    private String SinglePrice;

    /**
    * <p>刊例价单位</p>
    */
    @SerializedName("PriceUnit")
    @Expose
    private String PriceUnit;

    /**
    * <p>用量</p>
    */
    @SerializedName("UsedAmount")
    @Expose
    private String UsedAmount;

    /**
    * <p>用量单位</p>
    */
    @SerializedName("UsedAmountUnit")
    @Expose
    private String UsedAmountUnit;

    /**
    * <p>原价</p>
    */
    @SerializedName("Cost")
    @Expose
    private String Cost;

    /**
    * <p>折扣</p>
    */
    @SerializedName("Discount")
    @Expose
    private String Discount;

    /**
    * <p>折后价</p>
    */
    @SerializedName("RealCost")
    @Expose
    private String RealCost;

    /**
    * <p>代金券支付金额</p>
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
    * <p>现金支付金额</p>
    */
    @SerializedName("CashPayAmount")
    @Expose
    private String CashPayAmount;

    /**
    * <p>赠送金支付金额</p>
    */
    @SerializedName("IncentivePayAmount")
    @Expose
    private String IncentivePayAmount;

    /**
    * <p>组件类型code</p>
    */
    @SerializedName("ComponentCode")
    @Expose
    private String ComponentCode;

    /**
    * <p>组件名称code</p>
    */
    @SerializedName("ItemCode")
    @Expose
    private String ItemCode;

    /**
     * Get <p>组件类型名称</p> 
     * @return ComponentCodeName <p>组件类型名称</p>
     */
    public String getComponentCodeName() {
        return this.ComponentCodeName;
    }

    /**
     * Set <p>组件类型名称</p>
     * @param ComponentCodeName <p>组件类型名称</p>
     */
    public void setComponentCodeName(String ComponentCodeName) {
        this.ComponentCodeName = ComponentCodeName;
    }

    /**
     * Get <p>组件名称</p> 
     * @return ItemCodeName <p>组件名称</p>
     */
    public String getItemCodeName() {
        return this.ItemCodeName;
    }

    /**
     * Set <p>组件名称</p>
     * @param ItemCodeName <p>组件名称</p>
     */
    public void setItemCodeName(String ItemCodeName) {
        this.ItemCodeName = ItemCodeName;
    }

    /**
     * Get <p>刊例价</p> 
     * @return SinglePrice <p>刊例价</p>
     */
    public String getSinglePrice() {
        return this.SinglePrice;
    }

    /**
     * Set <p>刊例价</p>
     * @param SinglePrice <p>刊例价</p>
     */
    public void setSinglePrice(String SinglePrice) {
        this.SinglePrice = SinglePrice;
    }

    /**
     * Get <p>刊例价单位</p> 
     * @return PriceUnit <p>刊例价单位</p>
     */
    public String getPriceUnit() {
        return this.PriceUnit;
    }

    /**
     * Set <p>刊例价单位</p>
     * @param PriceUnit <p>刊例价单位</p>
     */
    public void setPriceUnit(String PriceUnit) {
        this.PriceUnit = PriceUnit;
    }

    /**
     * Get <p>用量</p> 
     * @return UsedAmount <p>用量</p>
     */
    public String getUsedAmount() {
        return this.UsedAmount;
    }

    /**
     * Set <p>用量</p>
     * @param UsedAmount <p>用量</p>
     */
    public void setUsedAmount(String UsedAmount) {
        this.UsedAmount = UsedAmount;
    }

    /**
     * Get <p>用量单位</p> 
     * @return UsedAmountUnit <p>用量单位</p>
     */
    public String getUsedAmountUnit() {
        return this.UsedAmountUnit;
    }

    /**
     * Set <p>用量单位</p>
     * @param UsedAmountUnit <p>用量单位</p>
     */
    public void setUsedAmountUnit(String UsedAmountUnit) {
        this.UsedAmountUnit = UsedAmountUnit;
    }

    /**
     * Get <p>原价</p> 
     * @return Cost <p>原价</p>
     */
    public String getCost() {
        return this.Cost;
    }

    /**
     * Set <p>原价</p>
     * @param Cost <p>原价</p>
     */
    public void setCost(String Cost) {
        this.Cost = Cost;
    }

    /**
     * Get <p>折扣</p> 
     * @return Discount <p>折扣</p>
     */
    public String getDiscount() {
        return this.Discount;
    }

    /**
     * Set <p>折扣</p>
     * @param Discount <p>折扣</p>
     */
    public void setDiscount(String Discount) {
        this.Discount = Discount;
    }

    /**
     * Get <p>折后价</p> 
     * @return RealCost <p>折后价</p>
     */
    public String getRealCost() {
        return this.RealCost;
    }

    /**
     * Set <p>折后价</p>
     * @param RealCost <p>折后价</p>
     */
    public void setRealCost(String RealCost) {
        this.RealCost = RealCost;
    }

    /**
     * Get <p>代金券支付金额</p> 
     * @return VoucherPayAmount <p>代金券支付金额</p>
     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * Set <p>代金券支付金额</p>
     * @param VoucherPayAmount <p>代金券支付金额</p>
     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * Get <p>现金支付金额</p> 
     * @return CashPayAmount <p>现金支付金额</p>
     */
    public String getCashPayAmount() {
        return this.CashPayAmount;
    }

    /**
     * Set <p>现金支付金额</p>
     * @param CashPayAmount <p>现金支付金额</p>
     */
    public void setCashPayAmount(String CashPayAmount) {
        this.CashPayAmount = CashPayAmount;
    }

    /**
     * Get <p>赠送金支付金额</p> 
     * @return IncentivePayAmount <p>赠送金支付金额</p>
     */
    public String getIncentivePayAmount() {
        return this.IncentivePayAmount;
    }

    /**
     * Set <p>赠送金支付金额</p>
     * @param IncentivePayAmount <p>赠送金支付金额</p>
     */
    public void setIncentivePayAmount(String IncentivePayAmount) {
        this.IncentivePayAmount = IncentivePayAmount;
    }

    /**
     * Get <p>组件类型code</p> 
     * @return ComponentCode <p>组件类型code</p>
     */
    public String getComponentCode() {
        return this.ComponentCode;
    }

    /**
     * Set <p>组件类型code</p>
     * @param ComponentCode <p>组件类型code</p>
     */
    public void setComponentCode(String ComponentCode) {
        this.ComponentCode = ComponentCode;
    }

    /**
     * Get <p>组件名称code</p> 
     * @return ItemCode <p>组件名称code</p>
     */
    public String getItemCode() {
        return this.ItemCode;
    }

    /**
     * Set <p>组件名称code</p>
     * @param ItemCode <p>组件名称code</p>
     */
    public void setItemCode(String ItemCode) {
        this.ItemCode = ItemCode;
    }

    public CostComponentSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CostComponentSet(CostComponentSet source) {
        if (source.ComponentCodeName != null) {
            this.ComponentCodeName = new String(source.ComponentCodeName);
        }
        if (source.ItemCodeName != null) {
            this.ItemCodeName = new String(source.ItemCodeName);
        }
        if (source.SinglePrice != null) {
            this.SinglePrice = new String(source.SinglePrice);
        }
        if (source.PriceUnit != null) {
            this.PriceUnit = new String(source.PriceUnit);
        }
        if (source.UsedAmount != null) {
            this.UsedAmount = new String(source.UsedAmount);
        }
        if (source.UsedAmountUnit != null) {
            this.UsedAmountUnit = new String(source.UsedAmountUnit);
        }
        if (source.Cost != null) {
            this.Cost = new String(source.Cost);
        }
        if (source.Discount != null) {
            this.Discount = new String(source.Discount);
        }
        if (source.RealCost != null) {
            this.RealCost = new String(source.RealCost);
        }
        if (source.VoucherPayAmount != null) {
            this.VoucherPayAmount = new String(source.VoucherPayAmount);
        }
        if (source.CashPayAmount != null) {
            this.CashPayAmount = new String(source.CashPayAmount);
        }
        if (source.IncentivePayAmount != null) {
            this.IncentivePayAmount = new String(source.IncentivePayAmount);
        }
        if (source.ComponentCode != null) {
            this.ComponentCode = new String(source.ComponentCode);
        }
        if (source.ItemCode != null) {
            this.ItemCode = new String(source.ItemCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComponentCodeName", this.ComponentCodeName);
        this.setParamSimple(map, prefix + "ItemCodeName", this.ItemCodeName);
        this.setParamSimple(map, prefix + "SinglePrice", this.SinglePrice);
        this.setParamSimple(map, prefix + "PriceUnit", this.PriceUnit);
        this.setParamSimple(map, prefix + "UsedAmount", this.UsedAmount);
        this.setParamSimple(map, prefix + "UsedAmountUnit", this.UsedAmountUnit);
        this.setParamSimple(map, prefix + "Cost", this.Cost);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "RealCost", this.RealCost);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);
        this.setParamSimple(map, prefix + "ComponentCode", this.ComponentCode);
        this.setParamSimple(map, prefix + "ItemCode", this.ItemCode);

    }
}

