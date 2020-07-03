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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CostComponentSet extends AbstractModel{

    /**
    * 组件类型名称
    */
    @SerializedName("ComponentCodeName")
    @Expose
    private String ComponentCodeName;

    /**
    * 组件名称
    */
    @SerializedName("ItemCodeName")
    @Expose
    private String ItemCodeName;

    /**
    * 刊例价
    */
    @SerializedName("SinglePrice")
    @Expose
    private String SinglePrice;

    /**
    * 刊例价单位
    */
    @SerializedName("PriceUnit")
    @Expose
    private String PriceUnit;

    /**
    * 用量
    */
    @SerializedName("UsedAmount")
    @Expose
    private String UsedAmount;

    /**
    * 用量单位
    */
    @SerializedName("UsedAmountUnit")
    @Expose
    private String UsedAmountUnit;

    /**
    * 原价
    */
    @SerializedName("Cost")
    @Expose
    private String Cost;

    /**
    * 折扣
    */
    @SerializedName("Discount")
    @Expose
    private String Discount;

    /**
    * 折后价
    */
    @SerializedName("RealCost")
    @Expose
    private String RealCost;

    /**
    * 代金券支付金额
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
    * 现金支付金额
    */
    @SerializedName("CashPayAmount")
    @Expose
    private String CashPayAmount;

    /**
    * 赠送金支付金额
    */
    @SerializedName("IncentivePayAmount")
    @Expose
    private String IncentivePayAmount;

    /**
     * Get 组件类型名称 
     * @return ComponentCodeName 组件类型名称
     */
    public String getComponentCodeName() {
        return this.ComponentCodeName;
    }

    /**
     * Set 组件类型名称
     * @param ComponentCodeName 组件类型名称
     */
    public void setComponentCodeName(String ComponentCodeName) {
        this.ComponentCodeName = ComponentCodeName;
    }

    /**
     * Get 组件名称 
     * @return ItemCodeName 组件名称
     */
    public String getItemCodeName() {
        return this.ItemCodeName;
    }

    /**
     * Set 组件名称
     * @param ItemCodeName 组件名称
     */
    public void setItemCodeName(String ItemCodeName) {
        this.ItemCodeName = ItemCodeName;
    }

    /**
     * Get 刊例价 
     * @return SinglePrice 刊例价
     */
    public String getSinglePrice() {
        return this.SinglePrice;
    }

    /**
     * Set 刊例价
     * @param SinglePrice 刊例价
     */
    public void setSinglePrice(String SinglePrice) {
        this.SinglePrice = SinglePrice;
    }

    /**
     * Get 刊例价单位 
     * @return PriceUnit 刊例价单位
     */
    public String getPriceUnit() {
        return this.PriceUnit;
    }

    /**
     * Set 刊例价单位
     * @param PriceUnit 刊例价单位
     */
    public void setPriceUnit(String PriceUnit) {
        this.PriceUnit = PriceUnit;
    }

    /**
     * Get 用量 
     * @return UsedAmount 用量
     */
    public String getUsedAmount() {
        return this.UsedAmount;
    }

    /**
     * Set 用量
     * @param UsedAmount 用量
     */
    public void setUsedAmount(String UsedAmount) {
        this.UsedAmount = UsedAmount;
    }

    /**
     * Get 用量单位 
     * @return UsedAmountUnit 用量单位
     */
    public String getUsedAmountUnit() {
        return this.UsedAmountUnit;
    }

    /**
     * Set 用量单位
     * @param UsedAmountUnit 用量单位
     */
    public void setUsedAmountUnit(String UsedAmountUnit) {
        this.UsedAmountUnit = UsedAmountUnit;
    }

    /**
     * Get 原价 
     * @return Cost 原价
     */
    public String getCost() {
        return this.Cost;
    }

    /**
     * Set 原价
     * @param Cost 原价
     */
    public void setCost(String Cost) {
        this.Cost = Cost;
    }

    /**
     * Get 折扣 
     * @return Discount 折扣
     */
    public String getDiscount() {
        return this.Discount;
    }

    /**
     * Set 折扣
     * @param Discount 折扣
     */
    public void setDiscount(String Discount) {
        this.Discount = Discount;
    }

    /**
     * Get 折后价 
     * @return RealCost 折后价
     */
    public String getRealCost() {
        return this.RealCost;
    }

    /**
     * Set 折后价
     * @param RealCost 折后价
     */
    public void setRealCost(String RealCost) {
        this.RealCost = RealCost;
    }

    /**
     * Get 代金券支付金额 
     * @return VoucherPayAmount 代金券支付金额
     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * Set 代金券支付金额
     * @param VoucherPayAmount 代金券支付金额
     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * Get 现金支付金额 
     * @return CashPayAmount 现金支付金额
     */
    public String getCashPayAmount() {
        return this.CashPayAmount;
    }

    /**
     * Set 现金支付金额
     * @param CashPayAmount 现金支付金额
     */
    public void setCashPayAmount(String CashPayAmount) {
        this.CashPayAmount = CashPayAmount;
    }

    /**
     * Get 赠送金支付金额 
     * @return IncentivePayAmount 赠送金支付金额
     */
    public String getIncentivePayAmount() {
        return this.IncentivePayAmount;
    }

    /**
     * Set 赠送金支付金额
     * @param IncentivePayAmount 赠送金支付金额
     */
    public void setIncentivePayAmount(String IncentivePayAmount) {
        this.IncentivePayAmount = IncentivePayAmount;
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

    }
}

