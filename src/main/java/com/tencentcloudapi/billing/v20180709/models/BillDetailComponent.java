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
    * 组件类型代码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ItemCode")
    @Expose
    private String ItemCode;

    /**
    * 组件名称代码
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
    * 资源包、预留实例、节省计划、竞价实例这四类特殊实例本身的扣费行为，此字段体现对应的实例类型。枚举值如下：
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 预留实例抵扣的使用时长，时长单位与被抵扣的时长单位保持一致
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiTimeSpan")
    @Expose
    private String RiTimeSpan;

    /**
    * 按组件原价的口径换算的预留实例抵扣金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginalCostWithRI")
    @Expose
    private String OriginalCostWithRI;

    /**
    * 节省计划可用余额额度范围内，节省计划对于此组件打的折扣率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SPDeductionRate")
    @Expose
    private String SPDeductionRate;

    /**
    * 节省计划抵扣的SP包面值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SPDeduction")
    @Expose
    private String SPDeduction;

    /**
    * 按组件原价的口径换算的节省计划抵扣金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginalCostWithSP")
    @Expose
    private String OriginalCostWithSP;

    /**
    * 综合了官网折扣、预留实例抵扣、节省计划抵扣的混合折扣率。若没有预留实例抵扣、节省计划抵扣,混合折扣率等于折扣率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlendedDiscount")
    @Expose
    private String BlendedDiscount;

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
     * Get 组件类型代码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ItemCode 组件类型代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getItemCode() {
        return this.ItemCode;
    }

    /**
     * Set 组件类型代码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ItemCode 组件类型代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItemCode(String ItemCode) {
        this.ItemCode = ItemCode;
    }

    /**
     * Get 组件名称代码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComponentCode 组件名称代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComponentCode() {
        return this.ComponentCode;
    }

    /**
     * Set 组件名称代码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComponentCode 组件名称代码
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
     * Get 资源包、预留实例、节省计划、竞价实例这四类特殊实例本身的扣费行为，此字段体现对应的实例类型。枚举值如下：
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType 资源包、预留实例、节省计划、竞价实例这四类特殊实例本身的扣费行为，此字段体现对应的实例类型。枚举值如下：
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 资源包、预留实例、节省计划、竞价实例这四类特殊实例本身的扣费行为，此字段体现对应的实例类型。枚举值如下：
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType 资源包、预留实例、节省计划、竞价实例这四类特殊实例本身的扣费行为，此字段体现对应的实例类型。枚举值如下：
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 预留实例抵扣的使用时长，时长单位与被抵扣的时长单位保持一致
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiTimeSpan 预留实例抵扣的使用时长，时长单位与被抵扣的时长单位保持一致
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiTimeSpan() {
        return this.RiTimeSpan;
    }

    /**
     * Set 预留实例抵扣的使用时长，时长单位与被抵扣的时长单位保持一致
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiTimeSpan 预留实例抵扣的使用时长，时长单位与被抵扣的时长单位保持一致
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiTimeSpan(String RiTimeSpan) {
        this.RiTimeSpan = RiTimeSpan;
    }

    /**
     * Get 按组件原价的口径换算的预留实例抵扣金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginalCostWithRI 按组件原价的口径换算的预留实例抵扣金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginalCostWithRI() {
        return this.OriginalCostWithRI;
    }

    /**
     * Set 按组件原价的口径换算的预留实例抵扣金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginalCostWithRI 按组件原价的口径换算的预留实例抵扣金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginalCostWithRI(String OriginalCostWithRI) {
        this.OriginalCostWithRI = OriginalCostWithRI;
    }

    /**
     * Get 节省计划可用余额额度范围内，节省计划对于此组件打的折扣率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SPDeductionRate 节省计划可用余额额度范围内，节省计划对于此组件打的折扣率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSPDeductionRate() {
        return this.SPDeductionRate;
    }

    /**
     * Set 节省计划可用余额额度范围内，节省计划对于此组件打的折扣率
注意：此字段可能返回 null，表示取不到有效值。
     * @param SPDeductionRate 节省计划可用余额额度范围内，节省计划对于此组件打的折扣率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSPDeductionRate(String SPDeductionRate) {
        this.SPDeductionRate = SPDeductionRate;
    }

    /**
     * Get 节省计划抵扣的SP包面值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SPDeduction 节省计划抵扣的SP包面值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSPDeduction() {
        return this.SPDeduction;
    }

    /**
     * Set 节省计划抵扣的SP包面值
注意：此字段可能返回 null，表示取不到有效值。
     * @param SPDeduction 节省计划抵扣的SP包面值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSPDeduction(String SPDeduction) {
        this.SPDeduction = SPDeduction;
    }

    /**
     * Get 按组件原价的口径换算的节省计划抵扣金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginalCostWithSP 按组件原价的口径换算的节省计划抵扣金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginalCostWithSP() {
        return this.OriginalCostWithSP;
    }

    /**
     * Set 按组件原价的口径换算的节省计划抵扣金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginalCostWithSP 按组件原价的口径换算的节省计划抵扣金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginalCostWithSP(String OriginalCostWithSP) {
        this.OriginalCostWithSP = OriginalCostWithSP;
    }

    /**
     * Get 综合了官网折扣、预留实例抵扣、节省计划抵扣的混合折扣率。若没有预留实例抵扣、节省计划抵扣,混合折扣率等于折扣率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlendedDiscount 综合了官网折扣、预留实例抵扣、节省计划抵扣的混合折扣率。若没有预留实例抵扣、节省计划抵扣,混合折扣率等于折扣率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlendedDiscount() {
        return this.BlendedDiscount;
    }

    /**
     * Set 综合了官网折扣、预留实例抵扣、节省计划抵扣的混合折扣率。若没有预留实例抵扣、节省计划抵扣,混合折扣率等于折扣率
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlendedDiscount 综合了官网折扣、预留实例抵扣、节省计划抵扣的混合折扣率。若没有预留实例抵扣、节省计划抵扣,混合折扣率等于折扣率
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
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "RiTimeSpan", this.RiTimeSpan);
        this.setParamSimple(map, prefix + "OriginalCostWithRI", this.OriginalCostWithRI);
        this.setParamSimple(map, prefix + "SPDeductionRate", this.SPDeductionRate);
        this.setParamSimple(map, prefix + "SPDeduction", this.SPDeduction);
        this.setParamSimple(map, prefix + "OriginalCostWithSP", this.OriginalCostWithSP);
        this.setParamSimple(map, prefix + "BlendedDiscount", this.BlendedDiscount);

    }
}

