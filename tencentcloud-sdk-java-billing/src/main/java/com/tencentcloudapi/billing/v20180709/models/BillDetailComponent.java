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

public class BillDetailComponent extends AbstractModel{

    /**
    * 组件类型:资源组件类型的名称，如内存、硬盘等
    */
    @SerializedName("ComponentCodeName")
    @Expose
    private String ComponentCodeName;

    /**
    * 组件名称:资源组件的名称，如云数据库MySQL-内存等
    */
    @SerializedName("ItemCodeName")
    @Expose
    private String ItemCodeName;

    /**
    * 组件刊例价:资源组件的原始价格，保持原始粒度
    */
    @SerializedName("SinglePrice")
    @Expose
    private String SinglePrice;

    /**
    * 组件指定价
    */
    @SerializedName("SpecifiedPrice")
    @Expose
    private String SpecifiedPrice;

    /**
    * 价格单位
    */
    @SerializedName("PriceUnit")
    @Expose
    private String PriceUnit;

    /**
    * 组件用量
    */
    @SerializedName("UsedAmount")
    @Expose
    private String UsedAmount;

    /**
    * 组件用量单位
    */
    @SerializedName("UsedAmountUnit")
    @Expose
    private String UsedAmountUnit;

    /**
    * 使用时长
    */
    @SerializedName("TimeSpan")
    @Expose
    private String TimeSpan;

    /**
    * 时长单位
    */
    @SerializedName("TimeUnitName")
    @Expose
    private String TimeUnitName;

    /**
    * 组件原价
    */
    @SerializedName("Cost")
    @Expose
    private String Cost;

    /**
    * 折扣率
    */
    @SerializedName("Discount")
    @Expose
    private String Discount;

    /**
    * 优惠类型
    */
    @SerializedName("ReduceType")
    @Expose
    private String ReduceType;

    /**
    * 优惠后总价
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
    * 赠送账户支付金额
    */
    @SerializedName("IncentivePayAmount")
    @Expose
    private String IncentivePayAmount;

    /**
    * 组件类型代码（未开放的字段）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ItemCode")
    @Expose
    private String ItemCode;

    /**
    * 组件名称代码（未开放的字段）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComponentCode")
    @Expose
    private String ComponentCode;

    /**
    * 合同价
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContractPrice")
    @Expose
    private String ContractPrice;

    /**
     * Get 组件类型:资源组件类型的名称，如内存、硬盘等 
     * @return ComponentCodeName 组件类型:资源组件类型的名称，如内存、硬盘等
     */
    public String getComponentCodeName() {
        return this.ComponentCodeName;
    }

    /**
     * Set 组件类型:资源组件类型的名称，如内存、硬盘等
     * @param ComponentCodeName 组件类型:资源组件类型的名称，如内存、硬盘等
     */
    public void setComponentCodeName(String ComponentCodeName) {
        this.ComponentCodeName = ComponentCodeName;
    }

    /**
     * Get 组件名称:资源组件的名称，如云数据库MySQL-内存等 
     * @return ItemCodeName 组件名称:资源组件的名称，如云数据库MySQL-内存等
     */
    public String getItemCodeName() {
        return this.ItemCodeName;
    }

    /**
     * Set 组件名称:资源组件的名称，如云数据库MySQL-内存等
     * @param ItemCodeName 组件名称:资源组件的名称，如云数据库MySQL-内存等
     */
    public void setItemCodeName(String ItemCodeName) {
        this.ItemCodeName = ItemCodeName;
    }

    /**
     * Get 组件刊例价:资源组件的原始价格，保持原始粒度 
     * @return SinglePrice 组件刊例价:资源组件的原始价格，保持原始粒度
     */
    public String getSinglePrice() {
        return this.SinglePrice;
    }

    /**
     * Set 组件刊例价:资源组件的原始价格，保持原始粒度
     * @param SinglePrice 组件刊例价:资源组件的原始价格，保持原始粒度
     */
    public void setSinglePrice(String SinglePrice) {
        this.SinglePrice = SinglePrice;
    }

    /**
     * Get 组件指定价 
     * @return SpecifiedPrice 组件指定价
     */
    public String getSpecifiedPrice() {
        return this.SpecifiedPrice;
    }

    /**
     * Set 组件指定价
     * @param SpecifiedPrice 组件指定价
     */
    public void setSpecifiedPrice(String SpecifiedPrice) {
        this.SpecifiedPrice = SpecifiedPrice;
    }

    /**
     * Get 价格单位 
     * @return PriceUnit 价格单位
     */
    public String getPriceUnit() {
        return this.PriceUnit;
    }

    /**
     * Set 价格单位
     * @param PriceUnit 价格单位
     */
    public void setPriceUnit(String PriceUnit) {
        this.PriceUnit = PriceUnit;
    }

    /**
     * Get 组件用量 
     * @return UsedAmount 组件用量
     */
    public String getUsedAmount() {
        return this.UsedAmount;
    }

    /**
     * Set 组件用量
     * @param UsedAmount 组件用量
     */
    public void setUsedAmount(String UsedAmount) {
        this.UsedAmount = UsedAmount;
    }

    /**
     * Get 组件用量单位 
     * @return UsedAmountUnit 组件用量单位
     */
    public String getUsedAmountUnit() {
        return this.UsedAmountUnit;
    }

    /**
     * Set 组件用量单位
     * @param UsedAmountUnit 组件用量单位
     */
    public void setUsedAmountUnit(String UsedAmountUnit) {
        this.UsedAmountUnit = UsedAmountUnit;
    }

    /**
     * Get 使用时长 
     * @return TimeSpan 使用时长
     */
    public String getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 使用时长
     * @param TimeSpan 使用时长
     */
    public void setTimeSpan(String TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 时长单位 
     * @return TimeUnitName 时长单位
     */
    public String getTimeUnitName() {
        return this.TimeUnitName;
    }

    /**
     * Set 时长单位
     * @param TimeUnitName 时长单位
     */
    public void setTimeUnitName(String TimeUnitName) {
        this.TimeUnitName = TimeUnitName;
    }

    /**
     * Get 组件原价 
     * @return Cost 组件原价
     */
    public String getCost() {
        return this.Cost;
    }

    /**
     * Set 组件原价
     * @param Cost 组件原价
     */
    public void setCost(String Cost) {
        this.Cost = Cost;
    }

    /**
     * Get 折扣率 
     * @return Discount 折扣率
     */
    public String getDiscount() {
        return this.Discount;
    }

    /**
     * Set 折扣率
     * @param Discount 折扣率
     */
    public void setDiscount(String Discount) {
        this.Discount = Discount;
    }

    /**
     * Get 优惠类型 
     * @return ReduceType 优惠类型
     */
    public String getReduceType() {
        return this.ReduceType;
    }

    /**
     * Set 优惠类型
     * @param ReduceType 优惠类型
     */
    public void setReduceType(String ReduceType) {
        this.ReduceType = ReduceType;
    }

    /**
     * Get 优惠后总价 
     * @return RealCost 优惠后总价
     */
    public String getRealCost() {
        return this.RealCost;
    }

    /**
     * Set 优惠后总价
     * @param RealCost 优惠后总价
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
     * Get 赠送账户支付金额 
     * @return IncentivePayAmount 赠送账户支付金额
     */
    public String getIncentivePayAmount() {
        return this.IncentivePayAmount;
    }

    /**
     * Set 赠送账户支付金额
     * @param IncentivePayAmount 赠送账户支付金额
     */
    public void setIncentivePayAmount(String IncentivePayAmount) {
        this.IncentivePayAmount = IncentivePayAmount;
    }

    /**
     * Get 组件类型代码（未开放的字段）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ItemCode 组件类型代码（未开放的字段）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getItemCode() {
        return this.ItemCode;
    }

    /**
     * Set 组件类型代码（未开放的字段）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ItemCode 组件类型代码（未开放的字段）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItemCode(String ItemCode) {
        this.ItemCode = ItemCode;
    }

    /**
     * Get 组件名称代码（未开放的字段）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComponentCode 组件名称代码（未开放的字段）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComponentCode() {
        return this.ComponentCode;
    }

    /**
     * Set 组件名称代码（未开放的字段）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComponentCode 组件名称代码（未开放的字段）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComponentCode(String ComponentCode) {
        this.ComponentCode = ComponentCode;
    }

    /**
     * Get 合同价
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContractPrice 合同价
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContractPrice() {
        return this.ContractPrice;
    }

    /**
     * Set 合同价
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContractPrice 合同价
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContractPrice(String ContractPrice) {
        this.ContractPrice = ContractPrice;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComponentCodeName", this.ComponentCodeName);
        this.setParamSimple(map, prefix + "ItemCodeName", this.ItemCodeName);
        this.setParamSimple(map, prefix + "SinglePrice", this.SinglePrice);
        this.setParamSimple(map, prefix + "SpecifiedPrice", this.SpecifiedPrice);
        this.setParamSimple(map, prefix + "PriceUnit", this.PriceUnit);
        this.setParamSimple(map, prefix + "UsedAmount", this.UsedAmount);
        this.setParamSimple(map, prefix + "UsedAmountUnit", this.UsedAmountUnit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnitName", this.TimeUnitName);
        this.setParamSimple(map, prefix + "Cost", this.Cost);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "ReduceType", this.ReduceType);
        this.setParamSimple(map, prefix + "RealCost", this.RealCost);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);
        this.setParamSimple(map, prefix + "ItemCode", this.ItemCode);
        this.setParamSimple(map, prefix + "ComponentCode", this.ComponentCode);
        this.setParamSimple(map, prefix + "ContractPrice", this.ContractPrice);

    }
}

