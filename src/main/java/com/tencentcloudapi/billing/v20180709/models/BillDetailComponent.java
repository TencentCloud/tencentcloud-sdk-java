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
    * 组件类型：用户购买的产品或服务对应的组件大类，例如：云服务器 CVM 的组件：CPU、内存等
    */
    @SerializedName("ComponentCodeName")
    @Expose
    private String ComponentCodeName;

    /**
    * 组件名称：用户购买的产品或服务，所包含的具体组件
    */
    @SerializedName("ItemCodeName")
    @Expose
    private String ItemCodeName;

    /**
    * 组件刊例价：组件的官网原始单价（如果客户享受一口价/合同价则默认不展示）
    */
    @SerializedName("SinglePrice")
    @Expose
    private String SinglePrice;

    /**
    * 组件指定价（已废弃）
    */
    @SerializedName("SpecifiedPrice")
    @Expose
    private String SpecifiedPrice;

    /**
    * 组件价格单位：组件价格的单位，单位构成：元/用量单位/时长单位
    */
    @SerializedName("PriceUnit")
    @Expose
    private String PriceUnit;

    /**
    * 组件用量：该组件实际结算用量，组件用量 = 组件原始用量 - 抵扣用量（含资源包
    */
    @SerializedName("UsedAmount")
    @Expose
    private String UsedAmount;

    /**
    * 组件用量单位：组件用量对应的单位
    */
    @SerializedName("UsedAmountUnit")
    @Expose
    private String UsedAmountUnit;

    /**
    * 原始用量/时长：组件被资源包抵扣前的原始用量/时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealTotalMeasure")
    @Expose
    private String RealTotalMeasure;

    /**
    * 抵扣用量/时长（含资源包）：组件被资源包抵扣的用量/时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeductedMeasure")
    @Expose
    private String DeductedMeasure;

    /**
    * 使用时长：资源使用的时长
    */
    @SerializedName("TimeSpan")
    @Expose
    private String TimeSpan;

    /**
    * 时长单位：资源使用时长的单位
    */
    @SerializedName("TimeUnitName")
    @Expose
    private String TimeUnitName;

    /**
    * 组件原价：原价 = 组件刊例价 * 组件用量 * 使用时长（如果客户享受一口价/合同价则默认不展示，退费类场景也默认不展示）
    */
    @SerializedName("Cost")
    @Expose
    private String Cost;

    /**
    * 折扣率：本资源享受的折扣率（如果客户享受一口价/合同价则默认不展示，退费场景也默认不展示）
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
    * 优惠后总价：优惠后总价=（原价 - 预留实例抵扣原价 - 节省计划抵扣原价）* 折扣率
    */
    @SerializedName("RealCost")
    @Expose
    private String RealCost;

    /**
    * 优惠券支出：使用各类优惠券（如代金券、现金券等）支付的金额
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
    * 现金账户支出：通过现金账户支付的金额
    */
    @SerializedName("CashPayAmount")
    @Expose
    private String CashPayAmount;

    /**
    * 赠送账户支出：使用赠送金支付的金额
    */
    @SerializedName("IncentivePayAmount")
    @Expose
    private String IncentivePayAmount;

    /**
    * 分成金账户支出：通过分成金账户支付的金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransferPayAmount")
    @Expose
    private String TransferPayAmount;

    /**
    * 组件类型编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ItemCode")
    @Expose
    private String ItemCode;

    /**
    * 组件名称编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComponentCode")
    @Expose
    private String ComponentCode;

    /**
    * 组件单价：组件的折后单价，组件单价 = 刊例价 * 折扣
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContractPrice")
    @Expose
    private String ContractPrice;

    /**
    * 实例类型：购买的产品服务对应的实例类型，包括资源包、RI、SP、竞价实例。正常的实例展示默认为不展示
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 预留实例抵扣的使用时长：本产品或服务使用预留实例抵扣的使用时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiTimeSpan")
    @Expose
    private String RiTimeSpan;

    /**
    * 预留实例抵扣组件原价：本产品或服务使用预留实例抵扣的组件原价金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginalCostWithRI")
    @Expose
    private String OriginalCostWithRI;

    /**
    * 节省计划抵扣率：节省计划可用余额额度范围内，节省计划对于此组件打的折扣率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SPDeductionRate")
    @Expose
    private String SPDeductionRate;

    /**
    * 节省计划抵扣金额（已废弃）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SPDeduction")
    @Expose
    private String SPDeduction;

    /**
    * 节省计划抵扣组件原价：节省计划抵扣原价=节省计划包抵扣金额/节省计划抵扣率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginalCostWithSP")
    @Expose
    private String OriginalCostWithSP;

    /**
    * 混合折扣率：综合各类折扣抵扣信息后的最终折扣率，混合折扣率 = 优惠后总价 / 组件原价
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlendedDiscount")
    @Expose
    private String BlendedDiscount;

    /**
     * Get 组件类型：用户购买的产品或服务对应的组件大类，例如：云服务器 CVM 的组件：CPU、内存等 
     * @return ComponentCodeName 组件类型：用户购买的产品或服务对应的组件大类，例如：云服务器 CVM 的组件：CPU、内存等
     */
    public String getComponentCodeName() {
        return this.ComponentCodeName;
    }

    /**
     * Set 组件类型：用户购买的产品或服务对应的组件大类，例如：云服务器 CVM 的组件：CPU、内存等
     * @param ComponentCodeName 组件类型：用户购买的产品或服务对应的组件大类，例如：云服务器 CVM 的组件：CPU、内存等
     */
    public void setComponentCodeName(String ComponentCodeName) {
        this.ComponentCodeName = ComponentCodeName;
    }

    /**
     * Get 组件名称：用户购买的产品或服务，所包含的具体组件 
     * @return ItemCodeName 组件名称：用户购买的产品或服务，所包含的具体组件
     */
    public String getItemCodeName() {
        return this.ItemCodeName;
    }

    /**
     * Set 组件名称：用户购买的产品或服务，所包含的具体组件
     * @param ItemCodeName 组件名称：用户购买的产品或服务，所包含的具体组件
     */
    public void setItemCodeName(String ItemCodeName) {
        this.ItemCodeName = ItemCodeName;
    }

    /**
     * Get 组件刊例价：组件的官网原始单价（如果客户享受一口价/合同价则默认不展示） 
     * @return SinglePrice 组件刊例价：组件的官网原始单价（如果客户享受一口价/合同价则默认不展示）
     */
    public String getSinglePrice() {
        return this.SinglePrice;
    }

    /**
     * Set 组件刊例价：组件的官网原始单价（如果客户享受一口价/合同价则默认不展示）
     * @param SinglePrice 组件刊例价：组件的官网原始单价（如果客户享受一口价/合同价则默认不展示）
     */
    public void setSinglePrice(String SinglePrice) {
        this.SinglePrice = SinglePrice;
    }

    /**
     * Get 组件指定价（已废弃） 
     * @return SpecifiedPrice 组件指定价（已废弃）
     * @deprecated
     */
    @Deprecated
    public String getSpecifiedPrice() {
        return this.SpecifiedPrice;
    }

    /**
     * Set 组件指定价（已废弃）
     * @param SpecifiedPrice 组件指定价（已废弃）
     * @deprecated
     */
    @Deprecated
    public void setSpecifiedPrice(String SpecifiedPrice) {
        this.SpecifiedPrice = SpecifiedPrice;
    }

    /**
     * Get 组件价格单位：组件价格的单位，单位构成：元/用量单位/时长单位 
     * @return PriceUnit 组件价格单位：组件价格的单位，单位构成：元/用量单位/时长单位
     */
    public String getPriceUnit() {
        return this.PriceUnit;
    }

    /**
     * Set 组件价格单位：组件价格的单位，单位构成：元/用量单位/时长单位
     * @param PriceUnit 组件价格单位：组件价格的单位，单位构成：元/用量单位/时长单位
     */
    public void setPriceUnit(String PriceUnit) {
        this.PriceUnit = PriceUnit;
    }

    /**
     * Get 组件用量：该组件实际结算用量，组件用量 = 组件原始用量 - 抵扣用量（含资源包 
     * @return UsedAmount 组件用量：该组件实际结算用量，组件用量 = 组件原始用量 - 抵扣用量（含资源包
     */
    public String getUsedAmount() {
        return this.UsedAmount;
    }

    /**
     * Set 组件用量：该组件实际结算用量，组件用量 = 组件原始用量 - 抵扣用量（含资源包
     * @param UsedAmount 组件用量：该组件实际结算用量，组件用量 = 组件原始用量 - 抵扣用量（含资源包
     */
    public void setUsedAmount(String UsedAmount) {
        this.UsedAmount = UsedAmount;
    }

    /**
     * Get 组件用量单位：组件用量对应的单位 
     * @return UsedAmountUnit 组件用量单位：组件用量对应的单位
     */
    public String getUsedAmountUnit() {
        return this.UsedAmountUnit;
    }

    /**
     * Set 组件用量单位：组件用量对应的单位
     * @param UsedAmountUnit 组件用量单位：组件用量对应的单位
     */
    public void setUsedAmountUnit(String UsedAmountUnit) {
        this.UsedAmountUnit = UsedAmountUnit;
    }

    /**
     * Get 原始用量/时长：组件被资源包抵扣前的原始用量/时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealTotalMeasure 原始用量/时长：组件被资源包抵扣前的原始用量/时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealTotalMeasure() {
        return this.RealTotalMeasure;
    }

    /**
     * Set 原始用量/时长：组件被资源包抵扣前的原始用量/时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealTotalMeasure 原始用量/时长：组件被资源包抵扣前的原始用量/时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealTotalMeasure(String RealTotalMeasure) {
        this.RealTotalMeasure = RealTotalMeasure;
    }

    /**
     * Get 抵扣用量/时长（含资源包）：组件被资源包抵扣的用量/时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeductedMeasure 抵扣用量/时长（含资源包）：组件被资源包抵扣的用量/时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeductedMeasure() {
        return this.DeductedMeasure;
    }

    /**
     * Set 抵扣用量/时长（含资源包）：组件被资源包抵扣的用量/时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeductedMeasure 抵扣用量/时长（含资源包）：组件被资源包抵扣的用量/时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeductedMeasure(String DeductedMeasure) {
        this.DeductedMeasure = DeductedMeasure;
    }

    /**
     * Get 使用时长：资源使用的时长 
     * @return TimeSpan 使用时长：资源使用的时长
     */
    public String getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 使用时长：资源使用的时长
     * @param TimeSpan 使用时长：资源使用的时长
     */
    public void setTimeSpan(String TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 时长单位：资源使用时长的单位 
     * @return TimeUnitName 时长单位：资源使用时长的单位
     */
    public String getTimeUnitName() {
        return this.TimeUnitName;
    }

    /**
     * Set 时长单位：资源使用时长的单位
     * @param TimeUnitName 时长单位：资源使用时长的单位
     */
    public void setTimeUnitName(String TimeUnitName) {
        this.TimeUnitName = TimeUnitName;
    }

    /**
     * Get 组件原价：原价 = 组件刊例价 * 组件用量 * 使用时长（如果客户享受一口价/合同价则默认不展示，退费类场景也默认不展示） 
     * @return Cost 组件原价：原价 = 组件刊例价 * 组件用量 * 使用时长（如果客户享受一口价/合同价则默认不展示，退费类场景也默认不展示）
     */
    public String getCost() {
        return this.Cost;
    }

    /**
     * Set 组件原价：原价 = 组件刊例价 * 组件用量 * 使用时长（如果客户享受一口价/合同价则默认不展示，退费类场景也默认不展示）
     * @param Cost 组件原价：原价 = 组件刊例价 * 组件用量 * 使用时长（如果客户享受一口价/合同价则默认不展示，退费类场景也默认不展示）
     */
    public void setCost(String Cost) {
        this.Cost = Cost;
    }

    /**
     * Get 折扣率：本资源享受的折扣率（如果客户享受一口价/合同价则默认不展示，退费场景也默认不展示） 
     * @return Discount 折扣率：本资源享受的折扣率（如果客户享受一口价/合同价则默认不展示，退费场景也默认不展示）
     */
    public String getDiscount() {
        return this.Discount;
    }

    /**
     * Set 折扣率：本资源享受的折扣率（如果客户享受一口价/合同价则默认不展示，退费场景也默认不展示）
     * @param Discount 折扣率：本资源享受的折扣率（如果客户享受一口价/合同价则默认不展示，退费场景也默认不展示）
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
     * Get 优惠后总价：优惠后总价=（原价 - 预留实例抵扣原价 - 节省计划抵扣原价）* 折扣率 
     * @return RealCost 优惠后总价：优惠后总价=（原价 - 预留实例抵扣原价 - 节省计划抵扣原价）* 折扣率
     */
    public String getRealCost() {
        return this.RealCost;
    }

    /**
     * Set 优惠后总价：优惠后总价=（原价 - 预留实例抵扣原价 - 节省计划抵扣原价）* 折扣率
     * @param RealCost 优惠后总价：优惠后总价=（原价 - 预留实例抵扣原价 - 节省计划抵扣原价）* 折扣率
     */
    public void setRealCost(String RealCost) {
        this.RealCost = RealCost;
    }

    /**
     * Get 优惠券支出：使用各类优惠券（如代金券、现金券等）支付的金额 
     * @return VoucherPayAmount 优惠券支出：使用各类优惠券（如代金券、现金券等）支付的金额
     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * Set 优惠券支出：使用各类优惠券（如代金券、现金券等）支付的金额
     * @param VoucherPayAmount 优惠券支出：使用各类优惠券（如代金券、现金券等）支付的金额
     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * Get 现金账户支出：通过现金账户支付的金额 
     * @return CashPayAmount 现金账户支出：通过现金账户支付的金额
     */
    public String getCashPayAmount() {
        return this.CashPayAmount;
    }

    /**
     * Set 现金账户支出：通过现金账户支付的金额
     * @param CashPayAmount 现金账户支出：通过现金账户支付的金额
     */
    public void setCashPayAmount(String CashPayAmount) {
        this.CashPayAmount = CashPayAmount;
    }

    /**
     * Get 赠送账户支出：使用赠送金支付的金额 
     * @return IncentivePayAmount 赠送账户支出：使用赠送金支付的金额
     */
    public String getIncentivePayAmount() {
        return this.IncentivePayAmount;
    }

    /**
     * Set 赠送账户支出：使用赠送金支付的金额
     * @param IncentivePayAmount 赠送账户支出：使用赠送金支付的金额
     */
    public void setIncentivePayAmount(String IncentivePayAmount) {
        this.IncentivePayAmount = IncentivePayAmount;
    }

    /**
     * Get 分成金账户支出：通过分成金账户支付的金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransferPayAmount 分成金账户支出：通过分成金账户支付的金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTransferPayAmount() {
        return this.TransferPayAmount;
    }

    /**
     * Set 分成金账户支出：通过分成金账户支付的金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransferPayAmount 分成金账户支出：通过分成金账户支付的金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransferPayAmount(String TransferPayAmount) {
        this.TransferPayAmount = TransferPayAmount;
    }

    /**
     * Get 组件类型编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ItemCode 组件类型编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getItemCode() {
        return this.ItemCode;
    }

    /**
     * Set 组件类型编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ItemCode 组件类型编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItemCode(String ItemCode) {
        this.ItemCode = ItemCode;
    }

    /**
     * Get 组件名称编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComponentCode 组件名称编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComponentCode() {
        return this.ComponentCode;
    }

    /**
     * Set 组件名称编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComponentCode 组件名称编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComponentCode(String ComponentCode) {
        this.ComponentCode = ComponentCode;
    }

    /**
     * Get 组件单价：组件的折后单价，组件单价 = 刊例价 * 折扣
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContractPrice 组件单价：组件的折后单价，组件单价 = 刊例价 * 折扣
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContractPrice() {
        return this.ContractPrice;
    }

    /**
     * Set 组件单价：组件的折后单价，组件单价 = 刊例价 * 折扣
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContractPrice 组件单价：组件的折后单价，组件单价 = 刊例价 * 折扣
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContractPrice(String ContractPrice) {
        this.ContractPrice = ContractPrice;
    }

    /**
     * Get 实例类型：购买的产品服务对应的实例类型，包括资源包、RI、SP、竞价实例。正常的实例展示默认为不展示
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType 实例类型：购买的产品服务对应的实例类型，包括资源包、RI、SP、竞价实例。正常的实例展示默认为不展示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型：购买的产品服务对应的实例类型，包括资源包、RI、SP、竞价实例。正常的实例展示默认为不展示
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType 实例类型：购买的产品服务对应的实例类型，包括资源包、RI、SP、竞价实例。正常的实例展示默认为不展示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 预留实例抵扣的使用时长：本产品或服务使用预留实例抵扣的使用时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiTimeSpan 预留实例抵扣的使用时长：本产品或服务使用预留实例抵扣的使用时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiTimeSpan() {
        return this.RiTimeSpan;
    }

    /**
     * Set 预留实例抵扣的使用时长：本产品或服务使用预留实例抵扣的使用时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiTimeSpan 预留实例抵扣的使用时长：本产品或服务使用预留实例抵扣的使用时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiTimeSpan(String RiTimeSpan) {
        this.RiTimeSpan = RiTimeSpan;
    }

    /**
     * Get 预留实例抵扣组件原价：本产品或服务使用预留实例抵扣的组件原价金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginalCostWithRI 预留实例抵扣组件原价：本产品或服务使用预留实例抵扣的组件原价金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginalCostWithRI() {
        return this.OriginalCostWithRI;
    }

    /**
     * Set 预留实例抵扣组件原价：本产品或服务使用预留实例抵扣的组件原价金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginalCostWithRI 预留实例抵扣组件原价：本产品或服务使用预留实例抵扣的组件原价金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginalCostWithRI(String OriginalCostWithRI) {
        this.OriginalCostWithRI = OriginalCostWithRI;
    }

    /**
     * Get 节省计划抵扣率：节省计划可用余额额度范围内，节省计划对于此组件打的折扣率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SPDeductionRate 节省计划抵扣率：节省计划可用余额额度范围内，节省计划对于此组件打的折扣率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSPDeductionRate() {
        return this.SPDeductionRate;
    }

    /**
     * Set 节省计划抵扣率：节省计划可用余额额度范围内，节省计划对于此组件打的折扣率
注意：此字段可能返回 null，表示取不到有效值。
     * @param SPDeductionRate 节省计划抵扣率：节省计划可用余额额度范围内，节省计划对于此组件打的折扣率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSPDeductionRate(String SPDeductionRate) {
        this.SPDeductionRate = SPDeductionRate;
    }

    /**
     * Get 节省计划抵扣金额（已废弃）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SPDeduction 节省计划抵扣金额（已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getSPDeduction() {
        return this.SPDeduction;
    }

    /**
     * Set 节省计划抵扣金额（已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     * @param SPDeduction 节省计划抵扣金额（已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setSPDeduction(String SPDeduction) {
        this.SPDeduction = SPDeduction;
    }

    /**
     * Get 节省计划抵扣组件原价：节省计划抵扣原价=节省计划包抵扣金额/节省计划抵扣率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginalCostWithSP 节省计划抵扣组件原价：节省计划抵扣原价=节省计划包抵扣金额/节省计划抵扣率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginalCostWithSP() {
        return this.OriginalCostWithSP;
    }

    /**
     * Set 节省计划抵扣组件原价：节省计划抵扣原价=节省计划包抵扣金额/节省计划抵扣率
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginalCostWithSP 节省计划抵扣组件原价：节省计划抵扣原价=节省计划包抵扣金额/节省计划抵扣率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginalCostWithSP(String OriginalCostWithSP) {
        this.OriginalCostWithSP = OriginalCostWithSP;
    }

    /**
     * Get 混合折扣率：综合各类折扣抵扣信息后的最终折扣率，混合折扣率 = 优惠后总价 / 组件原价
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlendedDiscount 混合折扣率：综合各类折扣抵扣信息后的最终折扣率，混合折扣率 = 优惠后总价 / 组件原价
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlendedDiscount() {
        return this.BlendedDiscount;
    }

    /**
     * Set 混合折扣率：综合各类折扣抵扣信息后的最终折扣率，混合折扣率 = 优惠后总价 / 组件原价
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlendedDiscount 混合折扣率：综合各类折扣抵扣信息后的最终折扣率，混合折扣率 = 优惠后总价 / 组件原价
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlendedDiscount(String BlendedDiscount) {
        this.BlendedDiscount = BlendedDiscount;
    }

    public BillDetailComponent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BillDetailComponent(BillDetailComponent source) {
        if (source.ComponentCodeName != null) {
            this.ComponentCodeName = new String(source.ComponentCodeName);
        }
        if (source.ItemCodeName != null) {
            this.ItemCodeName = new String(source.ItemCodeName);
        }
        if (source.SinglePrice != null) {
            this.SinglePrice = new String(source.SinglePrice);
        }
        if (source.SpecifiedPrice != null) {
            this.SpecifiedPrice = new String(source.SpecifiedPrice);
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
        if (source.RealTotalMeasure != null) {
            this.RealTotalMeasure = new String(source.RealTotalMeasure);
        }
        if (source.DeductedMeasure != null) {
            this.DeductedMeasure = new String(source.DeductedMeasure);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new String(source.TimeSpan);
        }
        if (source.TimeUnitName != null) {
            this.TimeUnitName = new String(source.TimeUnitName);
        }
        if (source.Cost != null) {
            this.Cost = new String(source.Cost);
        }
        if (source.Discount != null) {
            this.Discount = new String(source.Discount);
        }
        if (source.ReduceType != null) {
            this.ReduceType = new String(source.ReduceType);
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
        if (source.TransferPayAmount != null) {
            this.TransferPayAmount = new String(source.TransferPayAmount);
        }
        if (source.ItemCode != null) {
            this.ItemCode = new String(source.ItemCode);
        }
        if (source.ComponentCode != null) {
            this.ComponentCode = new String(source.ComponentCode);
        }
        if (source.ContractPrice != null) {
            this.ContractPrice = new String(source.ContractPrice);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.RiTimeSpan != null) {
            this.RiTimeSpan = new String(source.RiTimeSpan);
        }
        if (source.OriginalCostWithRI != null) {
            this.OriginalCostWithRI = new String(source.OriginalCostWithRI);
        }
        if (source.SPDeductionRate != null) {
            this.SPDeductionRate = new String(source.SPDeductionRate);
        }
        if (source.SPDeduction != null) {
            this.SPDeduction = new String(source.SPDeduction);
        }
        if (source.OriginalCostWithSP != null) {
            this.OriginalCostWithSP = new String(source.OriginalCostWithSP);
        }
        if (source.BlendedDiscount != null) {
            this.BlendedDiscount = new String(source.BlendedDiscount);
        }
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
        this.setParamSimple(map, prefix + "RealTotalMeasure", this.RealTotalMeasure);
        this.setParamSimple(map, prefix + "DeductedMeasure", this.DeductedMeasure);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnitName", this.TimeUnitName);
        this.setParamSimple(map, prefix + "Cost", this.Cost);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "ReduceType", this.ReduceType);
        this.setParamSimple(map, prefix + "RealCost", this.RealCost);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);
        this.setParamSimple(map, prefix + "TransferPayAmount", this.TransferPayAmount);
        this.setParamSimple(map, prefix + "ItemCode", this.ItemCode);
        this.setParamSimple(map, prefix + "ComponentCode", this.ComponentCode);
        this.setParamSimple(map, prefix + "ContractPrice", this.ContractPrice);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "RiTimeSpan", this.RiTimeSpan);
        this.setParamSimple(map, prefix + "OriginalCostWithRI", this.OriginalCostWithRI);
        this.setParamSimple(map, prefix + "SPDeductionRate", this.SPDeductionRate);
        this.setParamSimple(map, prefix + "SPDeduction", this.SPDeduction);
        this.setParamSimple(map, prefix + "OriginalCostWithSP", this.OriginalCostWithSP);
        this.setParamSimple(map, prefix + "BlendedDiscount", this.BlendedDiscount);

    }
}

