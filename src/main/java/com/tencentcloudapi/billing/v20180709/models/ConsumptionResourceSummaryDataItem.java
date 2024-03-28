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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsumptionResourceSummaryDataItem extends AbstractModel {

    /**
    * 资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源名称
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 折后总价
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

    /**
    * 现金花费
    */
    @SerializedName("CashPayAmount")
    @Expose
    private String CashPayAmount;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 项目名称
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 地域ID
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * 地域名称
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 付费模式
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 付费模式名称
    */
    @SerializedName("PayModeName")
    @Expose
    private String PayModeName;

    /**
    * 产品名称代码
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * 产品名称
    */
    @SerializedName("BusinessCodeName")
    @Expose
    private String BusinessCodeName;

    /**
    * 消耗类型
    */
    @SerializedName("ConsumptionTypeName")
    @Expose
    private String ConsumptionTypeName;

    /**
    * 折前价
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealCost")
    @Expose
    private String RealCost;

    /**
    * 费用起始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FeeBeginTime")
    @Expose
    private String FeeBeginTime;

    /**
    * 费用结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FeeEndTime")
    @Expose
    private String FeeEndTime;

    /**
    * 天数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DayDiff")
    @Expose
    private String DayDiff;

    /**
    * 每日消耗
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DailyTotalCost")
    @Expose
    private String DailyTotalCost;

    /**
    * 订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 代金券
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
    * 赠送金
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IncentivePayAmount")
    @Expose
    private String IncentivePayAmount;

    /**
    * 分成金
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransferPayAmount")
    @Expose
    private String TransferPayAmount;

    /**
    * 支付者UIN：支付者的账号 ID，账号 ID 是用户在腾讯云的唯一账号标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
    * 使用者UIN：实际使用资源的账号 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 操作者UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的 ID 或者角色 ID ）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperateUin")
    @Expose
    private String OperateUin;

    /**
    * 子产品编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * 子产品名称：用户采购的具体产品细分类型，例如：云服务器 CVM-标准型 S1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductCodeName")
    @Expose
    private String ProductCodeName;

    /**
    * 地域类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionType")
    @Expose
    private String RegionType;

    /**
    * 地域类型名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionTypeName")
    @Expose
    private String RegionTypeName;

    /**
    * 扩展字段1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Extend1")
    @Expose
    private String Extend1;

    /**
    * 扩展字段2
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Extend2")
    @Expose
    private String Extend2;

    /**
    * 扩展字段3
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Extend3")
    @Expose
    private String Extend3;

    /**
    * 扩展字段4
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Extend4")
    @Expose
    private String Extend4;

    /**
    * 扩展字段5
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Extend5")
    @Expose
    private String Extend5;

    /**
    * 实例类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例类型名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceTypeName")
    @Expose
    private String InstanceTypeName;

    /**
    * 扣费时间：结算扣费时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayTime")
    @Expose
    private String PayTime;

    /**
    * 可用区：资源所属可用区，如广州三区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 配置描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComponentConfig")
    @Expose
    private String ComponentConfig;

    /**
     * Get 资源ID 
     * @return ResourceId 资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID
     * @param ResourceId 资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源名称 
     * @return ResourceName 资源名称
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源名称
     * @param ResourceName 资源名称
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 折后总价 
     * @return RealTotalCost 折后总价
     */
    public String getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set 折后总价
     * @param RealTotalCost 折后总价
     */
    public void setRealTotalCost(String RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get 现金花费 
     * @return CashPayAmount 现金花费
     */
    public String getCashPayAmount() {
        return this.CashPayAmount;
    }

    /**
     * Set 现金花费
     * @param CashPayAmount 现金花费
     */
    public void setCashPayAmount(String CashPayAmount) {
        this.CashPayAmount = CashPayAmount;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 项目名称 
     * @return ProjectName 项目名称
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称
     * @param ProjectName 项目名称
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 地域ID 
     * @return RegionId 地域ID
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域ID
     * @param RegionId 地域ID
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 地域名称 
     * @return RegionName 地域名称
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 地域名称
     * @param RegionName 地域名称
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 付费模式 
     * @return PayMode 付费模式
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式
     * @param PayMode 付费模式
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 付费模式名称 
     * @return PayModeName 付费模式名称
     */
    public String getPayModeName() {
        return this.PayModeName;
    }

    /**
     * Set 付费模式名称
     * @param PayModeName 付费模式名称
     */
    public void setPayModeName(String PayModeName) {
        this.PayModeName = PayModeName;
    }

    /**
     * Get 产品名称代码 
     * @return BusinessCode 产品名称代码
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set 产品名称代码
     * @param BusinessCode 产品名称代码
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get 产品名称 
     * @return BusinessCodeName 产品名称
     */
    public String getBusinessCodeName() {
        return this.BusinessCodeName;
    }

    /**
     * Set 产品名称
     * @param BusinessCodeName 产品名称
     */
    public void setBusinessCodeName(String BusinessCodeName) {
        this.BusinessCodeName = BusinessCodeName;
    }

    /**
     * Get 消耗类型 
     * @return ConsumptionTypeName 消耗类型
     */
    public String getConsumptionTypeName() {
        return this.ConsumptionTypeName;
    }

    /**
     * Set 消耗类型
     * @param ConsumptionTypeName 消耗类型
     */
    public void setConsumptionTypeName(String ConsumptionTypeName) {
        this.ConsumptionTypeName = ConsumptionTypeName;
    }

    /**
     * Get 折前价
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealCost 折前价
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealCost() {
        return this.RealCost;
    }

    /**
     * Set 折前价
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealCost 折前价
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealCost(String RealCost) {
        this.RealCost = RealCost;
    }

    /**
     * Get 费用起始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FeeBeginTime 费用起始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFeeBeginTime() {
        return this.FeeBeginTime;
    }

    /**
     * Set 费用起始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FeeBeginTime 费用起始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFeeBeginTime(String FeeBeginTime) {
        this.FeeBeginTime = FeeBeginTime;
    }

    /**
     * Get 费用结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FeeEndTime 费用结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFeeEndTime() {
        return this.FeeEndTime;
    }

    /**
     * Set 费用结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FeeEndTime 费用结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFeeEndTime(String FeeEndTime) {
        this.FeeEndTime = FeeEndTime;
    }

    /**
     * Get 天数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DayDiff 天数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDayDiff() {
        return this.DayDiff;
    }

    /**
     * Set 天数
注意：此字段可能返回 null，表示取不到有效值。
     * @param DayDiff 天数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDayDiff(String DayDiff) {
        this.DayDiff = DayDiff;
    }

    /**
     * Get 每日消耗
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DailyTotalCost 每日消耗
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDailyTotalCost() {
        return this.DailyTotalCost;
    }

    /**
     * Set 每日消耗
注意：此字段可能返回 null，表示取不到有效值。
     * @param DailyTotalCost 每日消耗
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDailyTotalCost(String DailyTotalCost) {
        this.DailyTotalCost = DailyTotalCost;
    }

    /**
     * Get 订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderId 订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderId 订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 代金券
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VoucherPayAmount 代金券
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * Set 代金券
注意：此字段可能返回 null，表示取不到有效值。
     * @param VoucherPayAmount 代金券
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * Get 赠送金
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IncentivePayAmount 赠送金
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIncentivePayAmount() {
        return this.IncentivePayAmount;
    }

    /**
     * Set 赠送金
注意：此字段可能返回 null，表示取不到有效值。
     * @param IncentivePayAmount 赠送金
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIncentivePayAmount(String IncentivePayAmount) {
        this.IncentivePayAmount = IncentivePayAmount;
    }

    /**
     * Get 分成金
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransferPayAmount 分成金
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTransferPayAmount() {
        return this.TransferPayAmount;
    }

    /**
     * Set 分成金
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransferPayAmount 分成金
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransferPayAmount(String TransferPayAmount) {
        this.TransferPayAmount = TransferPayAmount;
    }

    /**
     * Get 支付者UIN：支付者的账号 ID，账号 ID 是用户在腾讯云的唯一账号标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayerUin 支付者UIN：支付者的账号 ID，账号 ID 是用户在腾讯云的唯一账号标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set 支付者UIN：支付者的账号 ID，账号 ID 是用户在腾讯云的唯一账号标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayerUin 支付者UIN：支付者的账号 ID，账号 ID 是用户在腾讯云的唯一账号标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    /**
     * Get 使用者UIN：实际使用资源的账号 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin 使用者UIN：实际使用资源的账号 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 使用者UIN：实际使用资源的账号 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin 使用者UIN：实际使用资源的账号 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 操作者UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的 ID 或者角色 ID ）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperateUin 操作者UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的 ID 或者角色 ID ）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set 操作者UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的 ID 或者角色 ID ）
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperateUin 操作者UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的 ID 或者角色 ID ）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperateUin(String OperateUin) {
        this.OperateUin = OperateUin;
    }

    /**
     * Get 子产品编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductCode 子产品编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set 子产品编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductCode 子产品编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get 子产品名称：用户采购的具体产品细分类型，例如：云服务器 CVM-标准型 S1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductCodeName 子产品名称：用户采购的具体产品细分类型，例如：云服务器 CVM-标准型 S1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductCodeName() {
        return this.ProductCodeName;
    }

    /**
     * Set 子产品名称：用户采购的具体产品细分类型，例如：云服务器 CVM-标准型 S1
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductCodeName 子产品名称：用户采购的具体产品细分类型，例如：云服务器 CVM-标准型 S1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductCodeName(String ProductCodeName) {
        this.ProductCodeName = ProductCodeName;
    }

    /**
     * Get 地域类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionType 地域类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionType() {
        return this.RegionType;
    }

    /**
     * Set 地域类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionType 地域类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionType(String RegionType) {
        this.RegionType = RegionType;
    }

    /**
     * Get 地域类型名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionTypeName 地域类型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionTypeName() {
        return this.RegionTypeName;
    }

    /**
     * Set 地域类型名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionTypeName 地域类型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionTypeName(String RegionTypeName) {
        this.RegionTypeName = RegionTypeName;
    }

    /**
     * Get 扩展字段1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Extend1 扩展字段1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtend1() {
        return this.Extend1;
    }

    /**
     * Set 扩展字段1
注意：此字段可能返回 null，表示取不到有效值。
     * @param Extend1 扩展字段1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtend1(String Extend1) {
        this.Extend1 = Extend1;
    }

    /**
     * Get 扩展字段2
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Extend2 扩展字段2
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtend2() {
        return this.Extend2;
    }

    /**
     * Set 扩展字段2
注意：此字段可能返回 null，表示取不到有效值。
     * @param Extend2 扩展字段2
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtend2(String Extend2) {
        this.Extend2 = Extend2;
    }

    /**
     * Get 扩展字段3
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Extend3 扩展字段3
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtend3() {
        return this.Extend3;
    }

    /**
     * Set 扩展字段3
注意：此字段可能返回 null，表示取不到有效值。
     * @param Extend3 扩展字段3
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtend3(String Extend3) {
        this.Extend3 = Extend3;
    }

    /**
     * Get 扩展字段4
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Extend4 扩展字段4
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtend4() {
        return this.Extend4;
    }

    /**
     * Set 扩展字段4
注意：此字段可能返回 null，表示取不到有效值。
     * @param Extend4 扩展字段4
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtend4(String Extend4) {
        this.Extend4 = Extend4;
    }

    /**
     * Get 扩展字段5
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Extend5 扩展字段5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtend5() {
        return this.Extend5;
    }

    /**
     * Set 扩展字段5
注意：此字段可能返回 null，表示取不到有效值。
     * @param Extend5 扩展字段5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtend5(String Extend5) {
        this.Extend5 = Extend5;
    }

    /**
     * Get 实例类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType 实例类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType 实例类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例类型名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceTypeName 实例类型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceTypeName() {
        return this.InstanceTypeName;
    }

    /**
     * Set 实例类型名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceTypeName 实例类型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceTypeName(String InstanceTypeName) {
        this.InstanceTypeName = InstanceTypeName;
    }

    /**
     * Get 扣费时间：结算扣费时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayTime 扣费时间：结算扣费时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayTime() {
        return this.PayTime;
    }

    /**
     * Set 扣费时间：结算扣费时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayTime 扣费时间：结算扣费时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayTime(String PayTime) {
        this.PayTime = PayTime;
    }

    /**
     * Get 可用区：资源所属可用区，如广州三区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneName 可用区：资源所属可用区，如广州三区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 可用区：资源所属可用区，如广州三区
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneName 可用区：资源所属可用区，如广州三区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 配置描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComponentConfig 配置描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComponentConfig() {
        return this.ComponentConfig;
    }

    /**
     * Set 配置描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComponentConfig 配置描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComponentConfig(String ComponentConfig) {
        this.ComponentConfig = ComponentConfig;
    }

    public ConsumptionResourceSummaryDataItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumptionResourceSummaryDataItem(ConsumptionResourceSummaryDataItem source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new String(source.RealTotalCost);
        }
        if (source.CashPayAmount != null) {
            this.CashPayAmount = new String(source.CashPayAmount);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.PayModeName != null) {
            this.PayModeName = new String(source.PayModeName);
        }
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
        if (source.BusinessCodeName != null) {
            this.BusinessCodeName = new String(source.BusinessCodeName);
        }
        if (source.ConsumptionTypeName != null) {
            this.ConsumptionTypeName = new String(source.ConsumptionTypeName);
        }
        if (source.RealCost != null) {
            this.RealCost = new String(source.RealCost);
        }
        if (source.FeeBeginTime != null) {
            this.FeeBeginTime = new String(source.FeeBeginTime);
        }
        if (source.FeeEndTime != null) {
            this.FeeEndTime = new String(source.FeeEndTime);
        }
        if (source.DayDiff != null) {
            this.DayDiff = new String(source.DayDiff);
        }
        if (source.DailyTotalCost != null) {
            this.DailyTotalCost = new String(source.DailyTotalCost);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.VoucherPayAmount != null) {
            this.VoucherPayAmount = new String(source.VoucherPayAmount);
        }
        if (source.IncentivePayAmount != null) {
            this.IncentivePayAmount = new String(source.IncentivePayAmount);
        }
        if (source.TransferPayAmount != null) {
            this.TransferPayAmount = new String(source.TransferPayAmount);
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
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.ProductCodeName != null) {
            this.ProductCodeName = new String(source.ProductCodeName);
        }
        if (source.RegionType != null) {
            this.RegionType = new String(source.RegionType);
        }
        if (source.RegionTypeName != null) {
            this.RegionTypeName = new String(source.RegionTypeName);
        }
        if (source.Extend1 != null) {
            this.Extend1 = new String(source.Extend1);
        }
        if (source.Extend2 != null) {
            this.Extend2 = new String(source.Extend2);
        }
        if (source.Extend3 != null) {
            this.Extend3 = new String(source.Extend3);
        }
        if (source.Extend4 != null) {
            this.Extend4 = new String(source.Extend4);
        }
        if (source.Extend5 != null) {
            this.Extend5 = new String(source.Extend5);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceTypeName != null) {
            this.InstanceTypeName = new String(source.InstanceTypeName);
        }
        if (source.PayTime != null) {
            this.PayTime = new String(source.PayTime);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.ComponentConfig != null) {
            this.ComponentConfig = new String(source.ComponentConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PayModeName", this.PayModeName);
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "BusinessCodeName", this.BusinessCodeName);
        this.setParamSimple(map, prefix + "ConsumptionTypeName", this.ConsumptionTypeName);
        this.setParamSimple(map, prefix + "RealCost", this.RealCost);
        this.setParamSimple(map, prefix + "FeeBeginTime", this.FeeBeginTime);
        this.setParamSimple(map, prefix + "FeeEndTime", this.FeeEndTime);
        this.setParamSimple(map, prefix + "DayDiff", this.DayDiff);
        this.setParamSimple(map, prefix + "DailyTotalCost", this.DailyTotalCost);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);
        this.setParamSimple(map, prefix + "TransferPayAmount", this.TransferPayAmount);
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OperateUin", this.OperateUin);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "ProductCodeName", this.ProductCodeName);
        this.setParamSimple(map, prefix + "RegionType", this.RegionType);
        this.setParamSimple(map, prefix + "RegionTypeName", this.RegionTypeName);
        this.setParamSimple(map, prefix + "Extend1", this.Extend1);
        this.setParamSimple(map, prefix + "Extend2", this.Extend2);
        this.setParamSimple(map, prefix + "Extend3", this.Extend3);
        this.setParamSimple(map, prefix + "Extend4", this.Extend4);
        this.setParamSimple(map, prefix + "Extend5", this.Extend5);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceTypeName", this.InstanceTypeName);
        this.setParamSimple(map, prefix + "PayTime", this.PayTime);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "ComponentConfig", this.ComponentConfig);

    }
}

