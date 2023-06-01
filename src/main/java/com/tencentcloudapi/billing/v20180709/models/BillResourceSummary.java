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

public class BillResourceSummary extends AbstractModel{

    /**
    * 产品名称：用户所采购的各类云产品，例如：云服务器 CVM
    */
    @SerializedName("BusinessCodeName")
    @Expose
    private String BusinessCodeName;

    /**
    * 子产品名称：用户采购的具体产品细分类型，例如：云服务器 CVM-标准型 S1
    */
    @SerializedName("ProductCodeName")
    @Expose
    private String ProductCodeName;

    /**
    * 计费模式：资源的计费模式，区分为包年包月和按量计费
    */
    @SerializedName("PayModeName")
    @Expose
    private String PayModeName;

    /**
    * 项目名称：资源归属的项目，用户在控制台给资源自主分配项目，未分配则是默认项目
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 地域：资源所属地域，如华南地区（广州）
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 可用区：资源所属可用区，如广州三区
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 资源 ID：账单中出账对象 ID，不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID	
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源别名：用户在控制台为资源设置的名称，如果未设置，则默认为空
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 交易类型：如包年包月新购、包年包月续费、按量计费扣费等类型
    */
    @SerializedName("ActionTypeName")
    @Expose
    private String ActionTypeName;

    /**
    * 订单ID：包年包月计费模式下订购的订单号
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 扣费时间：结算扣费时间
    */
    @SerializedName("PayTime")
    @Expose
    private String PayTime;

    /**
    * 开始使用时间：产品服务开始使用时间
    */
    @SerializedName("FeeBeginTime")
    @Expose
    private String FeeBeginTime;

    /**
    * 结束使用时间：产品服务结束使用时间
    */
    @SerializedName("FeeEndTime")
    @Expose
    private String FeeEndTime;

    /**
    * 配置描述：该资源下的计费项名称和用量合并展示，仅在资源账单体现
    */
    @SerializedName("ConfigDesc")
    @Expose
    private String ConfigDesc;

    /**
    * 扩展字段1：产品对应的扩展属性信息，仅在资源账单体现
    */
    @SerializedName("ExtendField1")
    @Expose
    private String ExtendField1;

    /**
    * 扩展字段2：产品对应的扩展属性信息，仅在资源账单体现
    */
    @SerializedName("ExtendField2")
    @Expose
    private String ExtendField2;

    /**
    * 原价：原价 = 组件刊例价 * 组件用量 * 使用时长（如果客户享受一口价/合同价则默认不展示，退费类场景也默认不展示）
    */
    @SerializedName("TotalCost")
    @Expose
    private String TotalCost;

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
    * 优惠后总价
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

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
    * 扩展字段3：产品对应的扩展属性信息，仅在资源账单体现
    */
    @SerializedName("ExtendField3")
    @Expose
    private String ExtendField3;

    /**
    * 扩展字段4：产品对应的扩展属性信息，仅在资源账单体现
    */
    @SerializedName("ExtendField4")
    @Expose
    private String ExtendField4;

    /**
    * 扩展字段5：产品对应的扩展属性信息，仅在资源账单体现
    */
    @SerializedName("ExtendField5")
    @Expose
    private String ExtendField5;

    /**
    * 标签信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private BillTagInfo [] Tags;

    /**
    * 支付者UIN：支付者的账号 ID，账号 ID 是用户在腾讯云的唯一账号标识
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
    * 使用者UIN：实际使用资源的账号 ID
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 操作者UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的 ID 或者角色 ID ）
    */
    @SerializedName("OperateUin")
    @Expose
    private String OperateUin;

    /**
    * 产品编码
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * 子产品编码
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * 地域ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 实例类型：购买的产品服务对应的实例类型，包括资源包、RI、SP、竞价实例。正常的实例展示默认为不展示
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 预留实例抵扣组件原价：本产品或服务使用预留实例抵扣的组件原价金额	
    */
    @SerializedName("OriginalCostWithRI")
    @Expose
    private String OriginalCostWithRI;

    /**
    * 节省计划抵扣金额（已废弃）
    */
    @SerializedName("SPDeduction")
    @Expose
    private String SPDeduction;

    /**
    * 节省计划抵扣组件原价：节省计划抵扣原价=节省计划包抵扣金额/节省计划抵扣率	
    */
    @SerializedName("OriginalCostWithSP")
    @Expose
    private String OriginalCostWithSP;

    /**
     * Get 产品名称：用户所采购的各类云产品，例如：云服务器 CVM 
     * @return BusinessCodeName 产品名称：用户所采购的各类云产品，例如：云服务器 CVM
     */
    public String getBusinessCodeName() {
        return this.BusinessCodeName;
    }

    /**
     * Set 产品名称：用户所采购的各类云产品，例如：云服务器 CVM
     * @param BusinessCodeName 产品名称：用户所采购的各类云产品，例如：云服务器 CVM
     */
    public void setBusinessCodeName(String BusinessCodeName) {
        this.BusinessCodeName = BusinessCodeName;
    }

    /**
     * Get 子产品名称：用户采购的具体产品细分类型，例如：云服务器 CVM-标准型 S1 
     * @return ProductCodeName 子产品名称：用户采购的具体产品细分类型，例如：云服务器 CVM-标准型 S1
     */
    public String getProductCodeName() {
        return this.ProductCodeName;
    }

    /**
     * Set 子产品名称：用户采购的具体产品细分类型，例如：云服务器 CVM-标准型 S1
     * @param ProductCodeName 子产品名称：用户采购的具体产品细分类型，例如：云服务器 CVM-标准型 S1
     */
    public void setProductCodeName(String ProductCodeName) {
        this.ProductCodeName = ProductCodeName;
    }

    /**
     * Get 计费模式：资源的计费模式，区分为包年包月和按量计费 
     * @return PayModeName 计费模式：资源的计费模式，区分为包年包月和按量计费
     */
    public String getPayModeName() {
        return this.PayModeName;
    }

    /**
     * Set 计费模式：资源的计费模式，区分为包年包月和按量计费
     * @param PayModeName 计费模式：资源的计费模式，区分为包年包月和按量计费
     */
    public void setPayModeName(String PayModeName) {
        this.PayModeName = PayModeName;
    }

    /**
     * Get 项目名称：资源归属的项目，用户在控制台给资源自主分配项目，未分配则是默认项目 
     * @return ProjectName 项目名称：资源归属的项目，用户在控制台给资源自主分配项目，未分配则是默认项目
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称：资源归属的项目，用户在控制台给资源自主分配项目，未分配则是默认项目
     * @param ProjectName 项目名称：资源归属的项目，用户在控制台给资源自主分配项目，未分配则是默认项目
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 地域：资源所属地域，如华南地区（广州） 
     * @return RegionName 地域：资源所属地域，如华南地区（广州）
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 地域：资源所属地域，如华南地区（广州）
     * @param RegionName 地域：资源所属地域，如华南地区（广州）
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 可用区：资源所属可用区，如广州三区 
     * @return ZoneName 可用区：资源所属可用区，如广州三区
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 可用区：资源所属可用区，如广州三区
     * @param ZoneName 可用区：资源所属可用区，如广州三区
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 资源 ID：账单中出账对象 ID，不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID	 
     * @return ResourceId 资源 ID：账单中出账对象 ID，不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID	
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源 ID：账单中出账对象 ID，不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID	
     * @param ResourceId 资源 ID：账单中出账对象 ID，不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID	
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源别名：用户在控制台为资源设置的名称，如果未设置，则默认为空 
     * @return ResourceName 资源别名：用户在控制台为资源设置的名称，如果未设置，则默认为空
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源别名：用户在控制台为资源设置的名称，如果未设置，则默认为空
     * @param ResourceName 资源别名：用户在控制台为资源设置的名称，如果未设置，则默认为空
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 交易类型：如包年包月新购、包年包月续费、按量计费扣费等类型 
     * @return ActionTypeName 交易类型：如包年包月新购、包年包月续费、按量计费扣费等类型
     */
    public String getActionTypeName() {
        return this.ActionTypeName;
    }

    /**
     * Set 交易类型：如包年包月新购、包年包月续费、按量计费扣费等类型
     * @param ActionTypeName 交易类型：如包年包月新购、包年包月续费、按量计费扣费等类型
     */
    public void setActionTypeName(String ActionTypeName) {
        this.ActionTypeName = ActionTypeName;
    }

    /**
     * Get 订单ID：包年包月计费模式下订购的订单号 
     * @return OrderId 订单ID：包年包月计费模式下订购的订单号
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单ID：包年包月计费模式下订购的订单号
     * @param OrderId 订单ID：包年包月计费模式下订购的订单号
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 扣费时间：结算扣费时间 
     * @return PayTime 扣费时间：结算扣费时间
     */
    public String getPayTime() {
        return this.PayTime;
    }

    /**
     * Set 扣费时间：结算扣费时间
     * @param PayTime 扣费时间：结算扣费时间
     */
    public void setPayTime(String PayTime) {
        this.PayTime = PayTime;
    }

    /**
     * Get 开始使用时间：产品服务开始使用时间 
     * @return FeeBeginTime 开始使用时间：产品服务开始使用时间
     */
    public String getFeeBeginTime() {
        return this.FeeBeginTime;
    }

    /**
     * Set 开始使用时间：产品服务开始使用时间
     * @param FeeBeginTime 开始使用时间：产品服务开始使用时间
     */
    public void setFeeBeginTime(String FeeBeginTime) {
        this.FeeBeginTime = FeeBeginTime;
    }

    /**
     * Get 结束使用时间：产品服务结束使用时间 
     * @return FeeEndTime 结束使用时间：产品服务结束使用时间
     */
    public String getFeeEndTime() {
        return this.FeeEndTime;
    }

    /**
     * Set 结束使用时间：产品服务结束使用时间
     * @param FeeEndTime 结束使用时间：产品服务结束使用时间
     */
    public void setFeeEndTime(String FeeEndTime) {
        this.FeeEndTime = FeeEndTime;
    }

    /**
     * Get 配置描述：该资源下的计费项名称和用量合并展示，仅在资源账单体现 
     * @return ConfigDesc 配置描述：该资源下的计费项名称和用量合并展示，仅在资源账单体现
     */
    public String getConfigDesc() {
        return this.ConfigDesc;
    }

    /**
     * Set 配置描述：该资源下的计费项名称和用量合并展示，仅在资源账单体现
     * @param ConfigDesc 配置描述：该资源下的计费项名称和用量合并展示，仅在资源账单体现
     */
    public void setConfigDesc(String ConfigDesc) {
        this.ConfigDesc = ConfigDesc;
    }

    /**
     * Get 扩展字段1：产品对应的扩展属性信息，仅在资源账单体现 
     * @return ExtendField1 扩展字段1：产品对应的扩展属性信息，仅在资源账单体现
     */
    public String getExtendField1() {
        return this.ExtendField1;
    }

    /**
     * Set 扩展字段1：产品对应的扩展属性信息，仅在资源账单体现
     * @param ExtendField1 扩展字段1：产品对应的扩展属性信息，仅在资源账单体现
     */
    public void setExtendField1(String ExtendField1) {
        this.ExtendField1 = ExtendField1;
    }

    /**
     * Get 扩展字段2：产品对应的扩展属性信息，仅在资源账单体现 
     * @return ExtendField2 扩展字段2：产品对应的扩展属性信息，仅在资源账单体现
     */
    public String getExtendField2() {
        return this.ExtendField2;
    }

    /**
     * Set 扩展字段2：产品对应的扩展属性信息，仅在资源账单体现
     * @param ExtendField2 扩展字段2：产品对应的扩展属性信息，仅在资源账单体现
     */
    public void setExtendField2(String ExtendField2) {
        this.ExtendField2 = ExtendField2;
    }

    /**
     * Get 原价：原价 = 组件刊例价 * 组件用量 * 使用时长（如果客户享受一口价/合同价则默认不展示，退费类场景也默认不展示） 
     * @return TotalCost 原价：原价 = 组件刊例价 * 组件用量 * 使用时长（如果客户享受一口价/合同价则默认不展示，退费类场景也默认不展示）
     */
    public String getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set 原价：原价 = 组件刊例价 * 组件用量 * 使用时长（如果客户享受一口价/合同价则默认不展示，退费类场景也默认不展示）
     * @param TotalCost 原价：原价 = 组件刊例价 * 组件用量 * 使用时长（如果客户享受一口价/合同价则默认不展示，退费类场景也默认不展示）
     */
    public void setTotalCost(String TotalCost) {
        this.TotalCost = TotalCost;
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
     * Get 优惠后总价 
     * @return RealTotalCost 优惠后总价
     */
    public String getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set 优惠后总价
     * @param RealTotalCost 优惠后总价
     */
    public void setRealTotalCost(String RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
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
     * Get 扩展字段3：产品对应的扩展属性信息，仅在资源账单体现 
     * @return ExtendField3 扩展字段3：产品对应的扩展属性信息，仅在资源账单体现
     */
    public String getExtendField3() {
        return this.ExtendField3;
    }

    /**
     * Set 扩展字段3：产品对应的扩展属性信息，仅在资源账单体现
     * @param ExtendField3 扩展字段3：产品对应的扩展属性信息，仅在资源账单体现
     */
    public void setExtendField3(String ExtendField3) {
        this.ExtendField3 = ExtendField3;
    }

    /**
     * Get 扩展字段4：产品对应的扩展属性信息，仅在资源账单体现 
     * @return ExtendField4 扩展字段4：产品对应的扩展属性信息，仅在资源账单体现
     */
    public String getExtendField4() {
        return this.ExtendField4;
    }

    /**
     * Set 扩展字段4：产品对应的扩展属性信息，仅在资源账单体现
     * @param ExtendField4 扩展字段4：产品对应的扩展属性信息，仅在资源账单体现
     */
    public void setExtendField4(String ExtendField4) {
        this.ExtendField4 = ExtendField4;
    }

    /**
     * Get 扩展字段5：产品对应的扩展属性信息，仅在资源账单体现 
     * @return ExtendField5 扩展字段5：产品对应的扩展属性信息，仅在资源账单体现
     */
    public String getExtendField5() {
        return this.ExtendField5;
    }

    /**
     * Set 扩展字段5：产品对应的扩展属性信息，仅在资源账单体现
     * @param ExtendField5 扩展字段5：产品对应的扩展属性信息，仅在资源账单体现
     */
    public void setExtendField5(String ExtendField5) {
        this.ExtendField5 = ExtendField5;
    }

    /**
     * Get 标签信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BillTagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(BillTagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 支付者UIN：支付者的账号 ID，账号 ID 是用户在腾讯云的唯一账号标识 
     * @return PayerUin 支付者UIN：支付者的账号 ID，账号 ID 是用户在腾讯云的唯一账号标识
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set 支付者UIN：支付者的账号 ID，账号 ID 是用户在腾讯云的唯一账号标识
     * @param PayerUin 支付者UIN：支付者的账号 ID，账号 ID 是用户在腾讯云的唯一账号标识
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    /**
     * Get 使用者UIN：实际使用资源的账号 ID 
     * @return OwnerUin 使用者UIN：实际使用资源的账号 ID
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 使用者UIN：实际使用资源的账号 ID
     * @param OwnerUin 使用者UIN：实际使用资源的账号 ID
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 操作者UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的 ID 或者角色 ID ） 
     * @return OperateUin 操作者UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的 ID 或者角色 ID ）
     */
    public String getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set 操作者UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的 ID 或者角色 ID ）
     * @param OperateUin 操作者UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的 ID 或者角色 ID ）
     */
    public void setOperateUin(String OperateUin) {
        this.OperateUin = OperateUin;
    }

    /**
     * Get 产品编码 
     * @return BusinessCode 产品编码
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set 产品编码
     * @param BusinessCode 产品编码
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get 子产品编码 
     * @return ProductCode 子产品编码
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set 子产品编码
     * @param ProductCode 子产品编码
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get 地域ID 
     * @return RegionId 地域ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域ID
     * @param RegionId 地域ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 实例类型：购买的产品服务对应的实例类型，包括资源包、RI、SP、竞价实例。正常的实例展示默认为不展示 
     * @return InstanceType 实例类型：购买的产品服务对应的实例类型，包括资源包、RI、SP、竞价实例。正常的实例展示默认为不展示
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型：购买的产品服务对应的实例类型，包括资源包、RI、SP、竞价实例。正常的实例展示默认为不展示
     * @param InstanceType 实例类型：购买的产品服务对应的实例类型，包括资源包、RI、SP、竞价实例。正常的实例展示默认为不展示
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 预留实例抵扣组件原价：本产品或服务使用预留实例抵扣的组件原价金额	 
     * @return OriginalCostWithRI 预留实例抵扣组件原价：本产品或服务使用预留实例抵扣的组件原价金额	
     */
    public String getOriginalCostWithRI() {
        return this.OriginalCostWithRI;
    }

    /**
     * Set 预留实例抵扣组件原价：本产品或服务使用预留实例抵扣的组件原价金额	
     * @param OriginalCostWithRI 预留实例抵扣组件原价：本产品或服务使用预留实例抵扣的组件原价金额	
     */
    public void setOriginalCostWithRI(String OriginalCostWithRI) {
        this.OriginalCostWithRI = OriginalCostWithRI;
    }

    /**
     * Get 节省计划抵扣金额（已废弃） 
     * @return SPDeduction 节省计划抵扣金额（已废弃）
     * @deprecated
     */
    @Deprecated
    public String getSPDeduction() {
        return this.SPDeduction;
    }

    /**
     * Set 节省计划抵扣金额（已废弃）
     * @param SPDeduction 节省计划抵扣金额（已废弃）
     * @deprecated
     */
    @Deprecated
    public void setSPDeduction(String SPDeduction) {
        this.SPDeduction = SPDeduction;
    }

    /**
     * Get 节省计划抵扣组件原价：节省计划抵扣原价=节省计划包抵扣金额/节省计划抵扣率	 
     * @return OriginalCostWithSP 节省计划抵扣组件原价：节省计划抵扣原价=节省计划包抵扣金额/节省计划抵扣率	
     */
    public String getOriginalCostWithSP() {
        return this.OriginalCostWithSP;
    }

    /**
     * Set 节省计划抵扣组件原价：节省计划抵扣原价=节省计划包抵扣金额/节省计划抵扣率	
     * @param OriginalCostWithSP 节省计划抵扣组件原价：节省计划抵扣原价=节省计划包抵扣金额/节省计划抵扣率	
     */
    public void setOriginalCostWithSP(String OriginalCostWithSP) {
        this.OriginalCostWithSP = OriginalCostWithSP;
    }

    public BillResourceSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BillResourceSummary(BillResourceSummary source) {
        if (source.BusinessCodeName != null) {
            this.BusinessCodeName = new String(source.BusinessCodeName);
        }
        if (source.ProductCodeName != null) {
            this.ProductCodeName = new String(source.ProductCodeName);
        }
        if (source.PayModeName != null) {
            this.PayModeName = new String(source.PayModeName);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ActionTypeName != null) {
            this.ActionTypeName = new String(source.ActionTypeName);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.PayTime != null) {
            this.PayTime = new String(source.PayTime);
        }
        if (source.FeeBeginTime != null) {
            this.FeeBeginTime = new String(source.FeeBeginTime);
        }
        if (source.FeeEndTime != null) {
            this.FeeEndTime = new String(source.FeeEndTime);
        }
        if (source.ConfigDesc != null) {
            this.ConfigDesc = new String(source.ConfigDesc);
        }
        if (source.ExtendField1 != null) {
            this.ExtendField1 = new String(source.ExtendField1);
        }
        if (source.ExtendField2 != null) {
            this.ExtendField2 = new String(source.ExtendField2);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new String(source.TotalCost);
        }
        if (source.Discount != null) {
            this.Discount = new String(source.Discount);
        }
        if (source.ReduceType != null) {
            this.ReduceType = new String(source.ReduceType);
        }
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new String(source.RealTotalCost);
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
        if (source.ExtendField3 != null) {
            this.ExtendField3 = new String(source.ExtendField3);
        }
        if (source.ExtendField4 != null) {
            this.ExtendField4 = new String(source.ExtendField4);
        }
        if (source.ExtendField5 != null) {
            this.ExtendField5 = new String(source.ExtendField5);
        }
        if (source.Tags != null) {
            this.Tags = new BillTagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new BillTagInfo(source.Tags[i]);
            }
        }
        if (source.PayerUin != null) {
            this.PayerUin = new String(source.PayerUin);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.OperateUin != null) {
            this.OperateUin = new String(source.OperateUin);
        }
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.OriginalCostWithRI != null) {
            this.OriginalCostWithRI = new String(source.OriginalCostWithRI);
        }
        if (source.SPDeduction != null) {
            this.SPDeduction = new String(source.SPDeduction);
        }
        if (source.OriginalCostWithSP != null) {
            this.OriginalCostWithSP = new String(source.OriginalCostWithSP);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusinessCodeName", this.BusinessCodeName);
        this.setParamSimple(map, prefix + "ProductCodeName", this.ProductCodeName);
        this.setParamSimple(map, prefix + "PayModeName", this.PayModeName);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ActionTypeName", this.ActionTypeName);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "PayTime", this.PayTime);
        this.setParamSimple(map, prefix + "FeeBeginTime", this.FeeBeginTime);
        this.setParamSimple(map, prefix + "FeeEndTime", this.FeeEndTime);
        this.setParamSimple(map, prefix + "ConfigDesc", this.ConfigDesc);
        this.setParamSimple(map, prefix + "ExtendField1", this.ExtendField1);
        this.setParamSimple(map, prefix + "ExtendField2", this.ExtendField2);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "ReduceType", this.ReduceType);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);
        this.setParamSimple(map, prefix + "TransferPayAmount", this.TransferPayAmount);
        this.setParamSimple(map, prefix + "ExtendField3", this.ExtendField3);
        this.setParamSimple(map, prefix + "ExtendField4", this.ExtendField4);
        this.setParamSimple(map, prefix + "ExtendField5", this.ExtendField5);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OperateUin", this.OperateUin);
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "OriginalCostWithRI", this.OriginalCostWithRI);
        this.setParamSimple(map, prefix + "SPDeduction", this.SPDeduction);
        this.setParamSimple(map, prefix + "OriginalCostWithSP", this.OriginalCostWithSP);

    }
}

