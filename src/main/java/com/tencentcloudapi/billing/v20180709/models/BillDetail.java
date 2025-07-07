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

public class BillDetail extends AbstractModel {

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
    * 交易类型，如包年包月新购、包年包月续费、按量计费扣费等类型
    */
    @SerializedName("ActionTypeName")
    @Expose
    private String ActionTypeName;

    /**
    * 订单ID：包年包月计费模式下对应子订单号。后付费计费模式下账单费用不存在订单概念，可忽略此参数。

    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 交易ID：结算扣费单号
    */
    @SerializedName("BillId")
    @Expose
    private String BillId;

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
    * 组件列表
    */
    @SerializedName("ComponentSet")
    @Expose
    private BillDetailComponent [] ComponentSet;

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
    * 标签信息
    */
    @SerializedName("Tags")
    @Expose
    private BillTagInfo [] Tags;

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
    * 交易类型编码
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * 地域ID
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 价格属性：该组件除单价、时长外的其他影响折扣定价的属性信息
    */
    @SerializedName("PriceInfo")
    @Expose
    private String [] PriceInfo;

    /**
    * 关联交易单据ID：和本笔交易关联单据 ID，如，冲销订单，记录原订单、重结订单，退费单记录对应的原购买订单号
    */
    @SerializedName("AssociatedOrder")
    @Expose
    private BillDetailAssociatedOrder AssociatedOrder;

    /**
    * 计算说明：特殊交易类型计费结算的详细计算说明，如退费及变配
    */
    @SerializedName("Formula")
    @Expose
    private String Formula;

    /**
    * 计费规则：各产品详细的计费规则官网说明链接
    */
    @SerializedName("FormulaUrl")
    @Expose
    private String FormulaUrl;

    /**
    * 账单归属日
    */
    @SerializedName("BillDay")
    @Expose
    private String BillDay;

    /**
    * 账单归属月
    */
    @SerializedName("BillMonth")
    @Expose
    private String BillMonth;

    /**
    * 账单记录ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 国内国际编码
    */
    @SerializedName("RegionType")
    @Expose
    private String RegionType;

    /**
    * 国内国际：资源所属区域类型（国内、国际）
    */
    @SerializedName("RegionTypeName")
    @Expose
    private String RegionTypeName;

    /**
    * 备注属性（实例配置）：其他备注信息，如预留实例的预留实例类型和交易类型、CCN 产品的两端地域信息
    */
    @SerializedName("ReserveDetail")
    @Expose
    private String ReserveDetail;

    /**
    * 优惠对象
    */
    @SerializedName("DiscountObject")
    @Expose
    private String DiscountObject;

    /**
    * 优惠类型
    */
    @SerializedName("DiscountType")
    @Expose
    private String DiscountType;

    /**
    * 优惠内容
    */
    @SerializedName("DiscountContent")
    @Expose
    private String DiscountContent;

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
     * Get 交易类型，如包年包月新购、包年包月续费、按量计费扣费等类型 
     * @return ActionTypeName 交易类型，如包年包月新购、包年包月续费、按量计费扣费等类型
     */
    public String getActionTypeName() {
        return this.ActionTypeName;
    }

    /**
     * Set 交易类型，如包年包月新购、包年包月续费、按量计费扣费等类型
     * @param ActionTypeName 交易类型，如包年包月新购、包年包月续费、按量计费扣费等类型
     */
    public void setActionTypeName(String ActionTypeName) {
        this.ActionTypeName = ActionTypeName;
    }

    /**
     * Get 订单ID：包年包月计费模式下对应子订单号。后付费计费模式下账单费用不存在订单概念，可忽略此参数。
 
     * @return OrderId 订单ID：包年包月计费模式下对应子订单号。后付费计费模式下账单费用不存在订单概念，可忽略此参数。

     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单ID：包年包月计费模式下对应子订单号。后付费计费模式下账单费用不存在订单概念，可忽略此参数。

     * @param OrderId 订单ID：包年包月计费模式下对应子订单号。后付费计费模式下账单费用不存在订单概念，可忽略此参数。

     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 交易ID：结算扣费单号 
     * @return BillId 交易ID：结算扣费单号
     */
    public String getBillId() {
        return this.BillId;
    }

    /**
     * Set 交易ID：结算扣费单号
     * @param BillId 交易ID：结算扣费单号
     */
    public void setBillId(String BillId) {
        this.BillId = BillId;
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
     * Get 组件列表 
     * @return ComponentSet 组件列表
     */
    public BillDetailComponent [] getComponentSet() {
        return this.ComponentSet;
    }

    /**
     * Set 组件列表
     * @param ComponentSet 组件列表
     */
    public void setComponentSet(BillDetailComponent [] ComponentSet) {
        this.ComponentSet = ComponentSet;
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
     * Get 标签信息 
     * @return Tags 标签信息
     */
    public BillTagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签信息
     * @param Tags 标签信息
     */
    public void setTags(BillTagInfo [] Tags) {
        this.Tags = Tags;
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
     * Get 交易类型编码 
     * @return ActionType 交易类型编码
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set 交易类型编码
     * @param ActionType 交易类型编码
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
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
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 价格属性：该组件除单价、时长外的其他影响折扣定价的属性信息 
     * @return PriceInfo 价格属性：该组件除单价、时长外的其他影响折扣定价的属性信息
     */
    public String [] getPriceInfo() {
        return this.PriceInfo;
    }

    /**
     * Set 价格属性：该组件除单价、时长外的其他影响折扣定价的属性信息
     * @param PriceInfo 价格属性：该组件除单价、时长外的其他影响折扣定价的属性信息
     */
    public void setPriceInfo(String [] PriceInfo) {
        this.PriceInfo = PriceInfo;
    }

    /**
     * Get 关联交易单据ID：和本笔交易关联单据 ID，如，冲销订单，记录原订单、重结订单，退费单记录对应的原购买订单号 
     * @return AssociatedOrder 关联交易单据ID：和本笔交易关联单据 ID，如，冲销订单，记录原订单、重结订单，退费单记录对应的原购买订单号
     */
    public BillDetailAssociatedOrder getAssociatedOrder() {
        return this.AssociatedOrder;
    }

    /**
     * Set 关联交易单据ID：和本笔交易关联单据 ID，如，冲销订单，记录原订单、重结订单，退费单记录对应的原购买订单号
     * @param AssociatedOrder 关联交易单据ID：和本笔交易关联单据 ID，如，冲销订单，记录原订单、重结订单，退费单记录对应的原购买订单号
     */
    public void setAssociatedOrder(BillDetailAssociatedOrder AssociatedOrder) {
        this.AssociatedOrder = AssociatedOrder;
    }

    /**
     * Get 计算说明：特殊交易类型计费结算的详细计算说明，如退费及变配 
     * @return Formula 计算说明：特殊交易类型计费结算的详细计算说明，如退费及变配
     */
    public String getFormula() {
        return this.Formula;
    }

    /**
     * Set 计算说明：特殊交易类型计费结算的详细计算说明，如退费及变配
     * @param Formula 计算说明：特殊交易类型计费结算的详细计算说明，如退费及变配
     */
    public void setFormula(String Formula) {
        this.Formula = Formula;
    }

    /**
     * Get 计费规则：各产品详细的计费规则官网说明链接 
     * @return FormulaUrl 计费规则：各产品详细的计费规则官网说明链接
     */
    public String getFormulaUrl() {
        return this.FormulaUrl;
    }

    /**
     * Set 计费规则：各产品详细的计费规则官网说明链接
     * @param FormulaUrl 计费规则：各产品详细的计费规则官网说明链接
     */
    public void setFormulaUrl(String FormulaUrl) {
        this.FormulaUrl = FormulaUrl;
    }

    /**
     * Get 账单归属日 
     * @return BillDay 账单归属日
     */
    public String getBillDay() {
        return this.BillDay;
    }

    /**
     * Set 账单归属日
     * @param BillDay 账单归属日
     */
    public void setBillDay(String BillDay) {
        this.BillDay = BillDay;
    }

    /**
     * Get 账单归属月 
     * @return BillMonth 账单归属月
     */
    public String getBillMonth() {
        return this.BillMonth;
    }

    /**
     * Set 账单归属月
     * @param BillMonth 账单归属月
     */
    public void setBillMonth(String BillMonth) {
        this.BillMonth = BillMonth;
    }

    /**
     * Get 账单记录ID 
     * @return Id 账单记录ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 账单记录ID
     * @param Id 账单记录ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 国内国际编码 
     * @return RegionType 国内国际编码
     */
    public String getRegionType() {
        return this.RegionType;
    }

    /**
     * Set 国内国际编码
     * @param RegionType 国内国际编码
     */
    public void setRegionType(String RegionType) {
        this.RegionType = RegionType;
    }

    /**
     * Get 国内国际：资源所属区域类型（国内、国际） 
     * @return RegionTypeName 国内国际：资源所属区域类型（国内、国际）
     */
    public String getRegionTypeName() {
        return this.RegionTypeName;
    }

    /**
     * Set 国内国际：资源所属区域类型（国内、国际）
     * @param RegionTypeName 国内国际：资源所属区域类型（国内、国际）
     */
    public void setRegionTypeName(String RegionTypeName) {
        this.RegionTypeName = RegionTypeName;
    }

    /**
     * Get 备注属性（实例配置）：其他备注信息，如预留实例的预留实例类型和交易类型、CCN 产品的两端地域信息 
     * @return ReserveDetail 备注属性（实例配置）：其他备注信息，如预留实例的预留实例类型和交易类型、CCN 产品的两端地域信息
     */
    public String getReserveDetail() {
        return this.ReserveDetail;
    }

    /**
     * Set 备注属性（实例配置）：其他备注信息，如预留实例的预留实例类型和交易类型、CCN 产品的两端地域信息
     * @param ReserveDetail 备注属性（实例配置）：其他备注信息，如预留实例的预留实例类型和交易类型、CCN 产品的两端地域信息
     */
    public void setReserveDetail(String ReserveDetail) {
        this.ReserveDetail = ReserveDetail;
    }

    /**
     * Get 优惠对象 
     * @return DiscountObject 优惠对象
     */
    public String getDiscountObject() {
        return this.DiscountObject;
    }

    /**
     * Set 优惠对象
     * @param DiscountObject 优惠对象
     */
    public void setDiscountObject(String DiscountObject) {
        this.DiscountObject = DiscountObject;
    }

    /**
     * Get 优惠类型 
     * @return DiscountType 优惠类型
     */
    public String getDiscountType() {
        return this.DiscountType;
    }

    /**
     * Set 优惠类型
     * @param DiscountType 优惠类型
     */
    public void setDiscountType(String DiscountType) {
        this.DiscountType = DiscountType;
    }

    /**
     * Get 优惠内容 
     * @return DiscountContent 优惠内容
     */
    public String getDiscountContent() {
        return this.DiscountContent;
    }

    /**
     * Set 优惠内容
     * @param DiscountContent 优惠内容
     */
    public void setDiscountContent(String DiscountContent) {
        this.DiscountContent = DiscountContent;
    }

    public BillDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BillDetail(BillDetail source) {
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
        if (source.BillId != null) {
            this.BillId = new String(source.BillId);
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
        if (source.ComponentSet != null) {
            this.ComponentSet = new BillDetailComponent[source.ComponentSet.length];
            for (int i = 0; i < source.ComponentSet.length; i++) {
                this.ComponentSet[i] = new BillDetailComponent(source.ComponentSet[i]);
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
        if (source.Tags != null) {
            this.Tags = new BillTagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new BillTagInfo(source.Tags[i]);
            }
        }
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.PriceInfo != null) {
            this.PriceInfo = new String[source.PriceInfo.length];
            for (int i = 0; i < source.PriceInfo.length; i++) {
                this.PriceInfo[i] = new String(source.PriceInfo[i]);
            }
        }
        if (source.AssociatedOrder != null) {
            this.AssociatedOrder = new BillDetailAssociatedOrder(source.AssociatedOrder);
        }
        if (source.Formula != null) {
            this.Formula = new String(source.Formula);
        }
        if (source.FormulaUrl != null) {
            this.FormulaUrl = new String(source.FormulaUrl);
        }
        if (source.BillDay != null) {
            this.BillDay = new String(source.BillDay);
        }
        if (source.BillMonth != null) {
            this.BillMonth = new String(source.BillMonth);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.RegionType != null) {
            this.RegionType = new String(source.RegionType);
        }
        if (source.RegionTypeName != null) {
            this.RegionTypeName = new String(source.RegionTypeName);
        }
        if (source.ReserveDetail != null) {
            this.ReserveDetail = new String(source.ReserveDetail);
        }
        if (source.DiscountObject != null) {
            this.DiscountObject = new String(source.DiscountObject);
        }
        if (source.DiscountType != null) {
            this.DiscountType = new String(source.DiscountType);
        }
        if (source.DiscountContent != null) {
            this.DiscountContent = new String(source.DiscountContent);
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
        this.setParamSimple(map, prefix + "BillId", this.BillId);
        this.setParamSimple(map, prefix + "PayTime", this.PayTime);
        this.setParamSimple(map, prefix + "FeeBeginTime", this.FeeBeginTime);
        this.setParamSimple(map, prefix + "FeeEndTime", this.FeeEndTime);
        this.setParamArrayObj(map, prefix + "ComponentSet.", this.ComponentSet);
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OperateUin", this.OperateUin);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "PriceInfo.", this.PriceInfo);
        this.setParamObj(map, prefix + "AssociatedOrder.", this.AssociatedOrder);
        this.setParamSimple(map, prefix + "Formula", this.Formula);
        this.setParamSimple(map, prefix + "FormulaUrl", this.FormulaUrl);
        this.setParamSimple(map, prefix + "BillDay", this.BillDay);
        this.setParamSimple(map, prefix + "BillMonth", this.BillMonth);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "RegionType", this.RegionType);
        this.setParamSimple(map, prefix + "RegionTypeName", this.RegionTypeName);
        this.setParamSimple(map, prefix + "ReserveDetail", this.ReserveDetail);
        this.setParamSimple(map, prefix + "DiscountObject", this.DiscountObject);
        this.setParamSimple(map, prefix + "DiscountType", this.DiscountType);
        this.setParamSimple(map, prefix + "DiscountContent", this.DiscountContent);

    }
}

