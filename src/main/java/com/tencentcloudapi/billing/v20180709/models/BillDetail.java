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
    * <p>产品名称：用户所采购的各类云产品，例如：云服务器 CVM</p>
    */
    @SerializedName("BusinessCodeName")
    @Expose
    private String BusinessCodeName;

    /**
    * <p>子产品名称：用户采购的具体产品细分类型，例如：云服务器 CVM-标准型 S1</p>
    */
    @SerializedName("ProductCodeName")
    @Expose
    private String ProductCodeName;

    /**
    * <p>计费模式：资源的计费模式，区分为包年包月和按量计费</p>
    */
    @SerializedName("PayModeName")
    @Expose
    private String PayModeName;

    /**
    * <p>项目名称：资源归属的项目，用户在控制台给资源自主分配项目，未分配则是默认项目</p>
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * <p>地域：资源所属地域，如华南地区（广州）</p>
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * <p>可用区：资源所属可用区，如广州三区</p>
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * <p>资源 ID：账单中出账对象 ID，不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>资源别名：用户在控制台为资源设置的名称，如果未设置，则默认为空</p>
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * <p>交易类型，如包年包月新购、包年包月续费、按量计费扣费等类型</p>
    */
    @SerializedName("ActionTypeName")
    @Expose
    private String ActionTypeName;

    /**
    * <p>订单ID：包年包月计费模式下对应子订单号。后付费计费模式下账单费用不存在订单概念，可忽略此参数。</p>
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * <p>交易ID：结算扣费单号</p>
    */
    @SerializedName("BillId")
    @Expose
    private String BillId;

    /**
    * <p>扣费时间：结算扣费时间</p>
    */
    @SerializedName("PayTime")
    @Expose
    private String PayTime;

    /**
    * <p>开始使用时间：产品服务开始使用时间</p>
    */
    @SerializedName("FeeBeginTime")
    @Expose
    private String FeeBeginTime;

    /**
    * <p>结束使用时间：产品服务结束使用时间</p>
    */
    @SerializedName("FeeEndTime")
    @Expose
    private String FeeEndTime;

    /**
    * <p>组件列表</p>
    */
    @SerializedName("ComponentSet")
    @Expose
    private BillDetailComponent [] ComponentSet;

    /**
    * <p>支付者UIN：支付者的账号 ID，账号 ID 是用户在腾讯云的唯一账号标识</p>
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
    * <p>使用者UIN：实际使用资源的账号 ID</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>操作者UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的 ID 或者角色 ID ）</p>
    */
    @SerializedName("OperateUin")
    @Expose
    private String OperateUin;

    /**
    * <p>标签信息</p>
    */
    @SerializedName("Tags")
    @Expose
    private BillTagInfo [] Tags;

    /**
    * <p>产品编码</p>
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * <p>子产品编码</p>
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * <p>交易类型编码</p>
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * <p>地域ID</p>
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>价格属性：该组件除单价、时长外的其他影响折扣定价的属性信息</p>
    */
    @SerializedName("PriceInfo")
    @Expose
    private String [] PriceInfo;

    /**
    * <p>关联交易单据ID：和本笔交易关联单据 ID，如，冲销订单，记录原订单、重结订单，退费单记录对应的原购买订单号</p>
    */
    @SerializedName("AssociatedOrder")
    @Expose
    private BillDetailAssociatedOrder AssociatedOrder;

    /**
    * <p>计算说明：特殊交易类型计费结算的详细计算说明，如退费及变配</p>
    */
    @SerializedName("Formula")
    @Expose
    private String Formula;

    /**
    * <p>计费规则：各产品详细的计费规则官网说明链接</p>
    */
    @SerializedName("FormulaUrl")
    @Expose
    private String FormulaUrl;

    /**
    * <p>账单归属日</p>
    */
    @SerializedName("BillDay")
    @Expose
    private String BillDay;

    /**
    * <p>账单归属月</p>
    */
    @SerializedName("BillMonth")
    @Expose
    private String BillMonth;

    /**
    * <p>账单记录ID</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>国内国际编码</p>
    */
    @SerializedName("RegionType")
    @Expose
    private String RegionType;

    /**
    * <p>国内国际：资源所属区域类型（国内、国际）</p>
    */
    @SerializedName("RegionTypeName")
    @Expose
    private String RegionTypeName;

    /**
    * <p>备注属性（实例配置）：其他备注信息，如预留实例的预留实例类型和交易类型、CCN 产品的两端地域信息</p>
    */
    @SerializedName("ReserveDetail")
    @Expose
    private String ReserveDetail;

    /**
    * <p>优惠对象</p>
    */
    @SerializedName("DiscountObject")
    @Expose
    private String DiscountObject;

    /**
    * <p>优惠类型</p>
    */
    @SerializedName("DiscountType")
    @Expose
    private String DiscountType;

    /**
    * <p>优惠内容</p>
    */
    @SerializedName("DiscountContent")
    @Expose
    private String DiscountContent;

    /**
    * <p>资源扩展信息：体现资源维度的扩展信息，与L2账单的扩展字段信息保持一致。</p>
    */
    @SerializedName("ExtendField")
    @Expose
    private String ExtendField;

    /**
     * Get <p>产品名称：用户所采购的各类云产品，例如：云服务器 CVM</p> 
     * @return BusinessCodeName <p>产品名称：用户所采购的各类云产品，例如：云服务器 CVM</p>
     */
    public String getBusinessCodeName() {
        return this.BusinessCodeName;
    }

    /**
     * Set <p>产品名称：用户所采购的各类云产品，例如：云服务器 CVM</p>
     * @param BusinessCodeName <p>产品名称：用户所采购的各类云产品，例如：云服务器 CVM</p>
     */
    public void setBusinessCodeName(String BusinessCodeName) {
        this.BusinessCodeName = BusinessCodeName;
    }

    /**
     * Get <p>子产品名称：用户采购的具体产品细分类型，例如：云服务器 CVM-标准型 S1</p> 
     * @return ProductCodeName <p>子产品名称：用户采购的具体产品细分类型，例如：云服务器 CVM-标准型 S1</p>
     */
    public String getProductCodeName() {
        return this.ProductCodeName;
    }

    /**
     * Set <p>子产品名称：用户采购的具体产品细分类型，例如：云服务器 CVM-标准型 S1</p>
     * @param ProductCodeName <p>子产品名称：用户采购的具体产品细分类型，例如：云服务器 CVM-标准型 S1</p>
     */
    public void setProductCodeName(String ProductCodeName) {
        this.ProductCodeName = ProductCodeName;
    }

    /**
     * Get <p>计费模式：资源的计费模式，区分为包年包月和按量计费</p> 
     * @return PayModeName <p>计费模式：资源的计费模式，区分为包年包月和按量计费</p>
     */
    public String getPayModeName() {
        return this.PayModeName;
    }

    /**
     * Set <p>计费模式：资源的计费模式，区分为包年包月和按量计费</p>
     * @param PayModeName <p>计费模式：资源的计费模式，区分为包年包月和按量计费</p>
     */
    public void setPayModeName(String PayModeName) {
        this.PayModeName = PayModeName;
    }

    /**
     * Get <p>项目名称：资源归属的项目，用户在控制台给资源自主分配项目，未分配则是默认项目</p> 
     * @return ProjectName <p>项目名称：资源归属的项目，用户在控制台给资源自主分配项目，未分配则是默认项目</p>
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set <p>项目名称：资源归属的项目，用户在控制台给资源自主分配项目，未分配则是默认项目</p>
     * @param ProjectName <p>项目名称：资源归属的项目，用户在控制台给资源自主分配项目，未分配则是默认项目</p>
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get <p>地域：资源所属地域，如华南地区（广州）</p> 
     * @return RegionName <p>地域：资源所属地域，如华南地区（广州）</p>
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set <p>地域：资源所属地域，如华南地区（广州）</p>
     * @param RegionName <p>地域：资源所属地域，如华南地区（广州）</p>
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get <p>可用区：资源所属可用区，如广州三区</p> 
     * @return ZoneName <p>可用区：资源所属可用区，如广州三区</p>
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set <p>可用区：资源所属可用区，如广州三区</p>
     * @param ZoneName <p>可用区：资源所属可用区，如广州三区</p>
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get <p>资源 ID：账单中出账对象 ID，不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID</p> 
     * @return ResourceId <p>资源 ID：账单中出账对象 ID，不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源 ID：账单中出账对象 ID，不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID</p>
     * @param ResourceId <p>资源 ID：账单中出账对象 ID，不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>资源别名：用户在控制台为资源设置的名称，如果未设置，则默认为空</p> 
     * @return ResourceName <p>资源别名：用户在控制台为资源设置的名称，如果未设置，则默认为空</p>
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set <p>资源别名：用户在控制台为资源设置的名称，如果未设置，则默认为空</p>
     * @param ResourceName <p>资源别名：用户在控制台为资源设置的名称，如果未设置，则默认为空</p>
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get <p>交易类型，如包年包月新购、包年包月续费、按量计费扣费等类型</p> 
     * @return ActionTypeName <p>交易类型，如包年包月新购、包年包月续费、按量计费扣费等类型</p>
     */
    public String getActionTypeName() {
        return this.ActionTypeName;
    }

    /**
     * Set <p>交易类型，如包年包月新购、包年包月续费、按量计费扣费等类型</p>
     * @param ActionTypeName <p>交易类型，如包年包月新购、包年包月续费、按量计费扣费等类型</p>
     */
    public void setActionTypeName(String ActionTypeName) {
        this.ActionTypeName = ActionTypeName;
    }

    /**
     * Get <p>订单ID：包年包月计费模式下对应子订单号。后付费计费模式下账单费用不存在订单概念，可忽略此参数。</p> 
     * @return OrderId <p>订单ID：包年包月计费模式下对应子订单号。后付费计费模式下账单费用不存在订单概念，可忽略此参数。</p>
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set <p>订单ID：包年包月计费模式下对应子订单号。后付费计费模式下账单费用不存在订单概念，可忽略此参数。</p>
     * @param OrderId <p>订单ID：包年包月计费模式下对应子订单号。后付费计费模式下账单费用不存在订单概念，可忽略此参数。</p>
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get <p>交易ID：结算扣费单号</p> 
     * @return BillId <p>交易ID：结算扣费单号</p>
     */
    public String getBillId() {
        return this.BillId;
    }

    /**
     * Set <p>交易ID：结算扣费单号</p>
     * @param BillId <p>交易ID：结算扣费单号</p>
     */
    public void setBillId(String BillId) {
        this.BillId = BillId;
    }

    /**
     * Get <p>扣费时间：结算扣费时间</p> 
     * @return PayTime <p>扣费时间：结算扣费时间</p>
     */
    public String getPayTime() {
        return this.PayTime;
    }

    /**
     * Set <p>扣费时间：结算扣费时间</p>
     * @param PayTime <p>扣费时间：结算扣费时间</p>
     */
    public void setPayTime(String PayTime) {
        this.PayTime = PayTime;
    }

    /**
     * Get <p>开始使用时间：产品服务开始使用时间</p> 
     * @return FeeBeginTime <p>开始使用时间：产品服务开始使用时间</p>
     */
    public String getFeeBeginTime() {
        return this.FeeBeginTime;
    }

    /**
     * Set <p>开始使用时间：产品服务开始使用时间</p>
     * @param FeeBeginTime <p>开始使用时间：产品服务开始使用时间</p>
     */
    public void setFeeBeginTime(String FeeBeginTime) {
        this.FeeBeginTime = FeeBeginTime;
    }

    /**
     * Get <p>结束使用时间：产品服务结束使用时间</p> 
     * @return FeeEndTime <p>结束使用时间：产品服务结束使用时间</p>
     */
    public String getFeeEndTime() {
        return this.FeeEndTime;
    }

    /**
     * Set <p>结束使用时间：产品服务结束使用时间</p>
     * @param FeeEndTime <p>结束使用时间：产品服务结束使用时间</p>
     */
    public void setFeeEndTime(String FeeEndTime) {
        this.FeeEndTime = FeeEndTime;
    }

    /**
     * Get <p>组件列表</p> 
     * @return ComponentSet <p>组件列表</p>
     */
    public BillDetailComponent [] getComponentSet() {
        return this.ComponentSet;
    }

    /**
     * Set <p>组件列表</p>
     * @param ComponentSet <p>组件列表</p>
     */
    public void setComponentSet(BillDetailComponent [] ComponentSet) {
        this.ComponentSet = ComponentSet;
    }

    /**
     * Get <p>支付者UIN：支付者的账号 ID，账号 ID 是用户在腾讯云的唯一账号标识</p> 
     * @return PayerUin <p>支付者UIN：支付者的账号 ID，账号 ID 是用户在腾讯云的唯一账号标识</p>
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set <p>支付者UIN：支付者的账号 ID，账号 ID 是用户在腾讯云的唯一账号标识</p>
     * @param PayerUin <p>支付者UIN：支付者的账号 ID，账号 ID 是用户在腾讯云的唯一账号标识</p>
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    /**
     * Get <p>使用者UIN：实际使用资源的账号 ID</p> 
     * @return OwnerUin <p>使用者UIN：实际使用资源的账号 ID</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>使用者UIN：实际使用资源的账号 ID</p>
     * @param OwnerUin <p>使用者UIN：实际使用资源的账号 ID</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>操作者UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的 ID 或者角色 ID ）</p> 
     * @return OperateUin <p>操作者UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的 ID 或者角色 ID ）</p>
     */
    public String getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set <p>操作者UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的 ID 或者角色 ID ）</p>
     * @param OperateUin <p>操作者UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的 ID 或者角色 ID ）</p>
     */
    public void setOperateUin(String OperateUin) {
        this.OperateUin = OperateUin;
    }

    /**
     * Get <p>标签信息</p> 
     * @return Tags <p>标签信息</p>
     */
    public BillTagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签信息</p>
     * @param Tags <p>标签信息</p>
     */
    public void setTags(BillTagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>产品编码</p> 
     * @return BusinessCode <p>产品编码</p>
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set <p>产品编码</p>
     * @param BusinessCode <p>产品编码</p>
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get <p>子产品编码</p> 
     * @return ProductCode <p>子产品编码</p>
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set <p>子产品编码</p>
     * @param ProductCode <p>子产品编码</p>
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get <p>交易类型编码</p> 
     * @return ActionType <p>交易类型编码</p>
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set <p>交易类型编码</p>
     * @param ActionType <p>交易类型编码</p>
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get <p>地域ID</p> 
     * @return RegionId <p>地域ID</p>
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>地域ID</p>
     * @param RegionId <p>地域ID</p>
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>项目ID</p> 
     * @return ProjectId <p>项目ID</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
     * @param ProjectId <p>项目ID</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>价格属性：该组件除单价、时长外的其他影响折扣定价的属性信息</p> 
     * @return PriceInfo <p>价格属性：该组件除单价、时长外的其他影响折扣定价的属性信息</p>
     */
    public String [] getPriceInfo() {
        return this.PriceInfo;
    }

    /**
     * Set <p>价格属性：该组件除单价、时长外的其他影响折扣定价的属性信息</p>
     * @param PriceInfo <p>价格属性：该组件除单价、时长外的其他影响折扣定价的属性信息</p>
     */
    public void setPriceInfo(String [] PriceInfo) {
        this.PriceInfo = PriceInfo;
    }

    /**
     * Get <p>关联交易单据ID：和本笔交易关联单据 ID，如，冲销订单，记录原订单、重结订单，退费单记录对应的原购买订单号</p> 
     * @return AssociatedOrder <p>关联交易单据ID：和本笔交易关联单据 ID，如，冲销订单，记录原订单、重结订单，退费单记录对应的原购买订单号</p>
     */
    public BillDetailAssociatedOrder getAssociatedOrder() {
        return this.AssociatedOrder;
    }

    /**
     * Set <p>关联交易单据ID：和本笔交易关联单据 ID，如，冲销订单，记录原订单、重结订单，退费单记录对应的原购买订单号</p>
     * @param AssociatedOrder <p>关联交易单据ID：和本笔交易关联单据 ID，如，冲销订单，记录原订单、重结订单，退费单记录对应的原购买订单号</p>
     */
    public void setAssociatedOrder(BillDetailAssociatedOrder AssociatedOrder) {
        this.AssociatedOrder = AssociatedOrder;
    }

    /**
     * Get <p>计算说明：特殊交易类型计费结算的详细计算说明，如退费及变配</p> 
     * @return Formula <p>计算说明：特殊交易类型计费结算的详细计算说明，如退费及变配</p>
     */
    public String getFormula() {
        return this.Formula;
    }

    /**
     * Set <p>计算说明：特殊交易类型计费结算的详细计算说明，如退费及变配</p>
     * @param Formula <p>计算说明：特殊交易类型计费结算的详细计算说明，如退费及变配</p>
     */
    public void setFormula(String Formula) {
        this.Formula = Formula;
    }

    /**
     * Get <p>计费规则：各产品详细的计费规则官网说明链接</p> 
     * @return FormulaUrl <p>计费规则：各产品详细的计费规则官网说明链接</p>
     */
    public String getFormulaUrl() {
        return this.FormulaUrl;
    }

    /**
     * Set <p>计费规则：各产品详细的计费规则官网说明链接</p>
     * @param FormulaUrl <p>计费规则：各产品详细的计费规则官网说明链接</p>
     */
    public void setFormulaUrl(String FormulaUrl) {
        this.FormulaUrl = FormulaUrl;
    }

    /**
     * Get <p>账单归属日</p> 
     * @return BillDay <p>账单归属日</p>
     */
    public String getBillDay() {
        return this.BillDay;
    }

    /**
     * Set <p>账单归属日</p>
     * @param BillDay <p>账单归属日</p>
     */
    public void setBillDay(String BillDay) {
        this.BillDay = BillDay;
    }

    /**
     * Get <p>账单归属月</p> 
     * @return BillMonth <p>账单归属月</p>
     */
    public String getBillMonth() {
        return this.BillMonth;
    }

    /**
     * Set <p>账单归属月</p>
     * @param BillMonth <p>账单归属月</p>
     */
    public void setBillMonth(String BillMonth) {
        this.BillMonth = BillMonth;
    }

    /**
     * Get <p>账单记录ID</p> 
     * @return Id <p>账单记录ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>账单记录ID</p>
     * @param Id <p>账单记录ID</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>国内国际编码</p> 
     * @return RegionType <p>国内国际编码</p>
     */
    public String getRegionType() {
        return this.RegionType;
    }

    /**
     * Set <p>国内国际编码</p>
     * @param RegionType <p>国内国际编码</p>
     */
    public void setRegionType(String RegionType) {
        this.RegionType = RegionType;
    }

    /**
     * Get <p>国内国际：资源所属区域类型（国内、国际）</p> 
     * @return RegionTypeName <p>国内国际：资源所属区域类型（国内、国际）</p>
     */
    public String getRegionTypeName() {
        return this.RegionTypeName;
    }

    /**
     * Set <p>国内国际：资源所属区域类型（国内、国际）</p>
     * @param RegionTypeName <p>国内国际：资源所属区域类型（国内、国际）</p>
     */
    public void setRegionTypeName(String RegionTypeName) {
        this.RegionTypeName = RegionTypeName;
    }

    /**
     * Get <p>备注属性（实例配置）：其他备注信息，如预留实例的预留实例类型和交易类型、CCN 产品的两端地域信息</p> 
     * @return ReserveDetail <p>备注属性（实例配置）：其他备注信息，如预留实例的预留实例类型和交易类型、CCN 产品的两端地域信息</p>
     */
    public String getReserveDetail() {
        return this.ReserveDetail;
    }

    /**
     * Set <p>备注属性（实例配置）：其他备注信息，如预留实例的预留实例类型和交易类型、CCN 产品的两端地域信息</p>
     * @param ReserveDetail <p>备注属性（实例配置）：其他备注信息，如预留实例的预留实例类型和交易类型、CCN 产品的两端地域信息</p>
     */
    public void setReserveDetail(String ReserveDetail) {
        this.ReserveDetail = ReserveDetail;
    }

    /**
     * Get <p>优惠对象</p> 
     * @return DiscountObject <p>优惠对象</p>
     */
    public String getDiscountObject() {
        return this.DiscountObject;
    }

    /**
     * Set <p>优惠对象</p>
     * @param DiscountObject <p>优惠对象</p>
     */
    public void setDiscountObject(String DiscountObject) {
        this.DiscountObject = DiscountObject;
    }

    /**
     * Get <p>优惠类型</p> 
     * @return DiscountType <p>优惠类型</p>
     */
    public String getDiscountType() {
        return this.DiscountType;
    }

    /**
     * Set <p>优惠类型</p>
     * @param DiscountType <p>优惠类型</p>
     */
    public void setDiscountType(String DiscountType) {
        this.DiscountType = DiscountType;
    }

    /**
     * Get <p>优惠内容</p> 
     * @return DiscountContent <p>优惠内容</p>
     */
    public String getDiscountContent() {
        return this.DiscountContent;
    }

    /**
     * Set <p>优惠内容</p>
     * @param DiscountContent <p>优惠内容</p>
     */
    public void setDiscountContent(String DiscountContent) {
        this.DiscountContent = DiscountContent;
    }

    /**
     * Get <p>资源扩展信息：体现资源维度的扩展信息，与L2账单的扩展字段信息保持一致。</p> 
     * @return ExtendField <p>资源扩展信息：体现资源维度的扩展信息，与L2账单的扩展字段信息保持一致。</p>
     */
    public String getExtendField() {
        return this.ExtendField;
    }

    /**
     * Set <p>资源扩展信息：体现资源维度的扩展信息，与L2账单的扩展字段信息保持一致。</p>
     * @param ExtendField <p>资源扩展信息：体现资源维度的扩展信息，与L2账单的扩展字段信息保持一致。</p>
     */
    public void setExtendField(String ExtendField) {
        this.ExtendField = ExtendField;
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
        if (source.ExtendField != null) {
            this.ExtendField = new String(source.ExtendField);
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
        this.setParamSimple(map, prefix + "ExtendField", this.ExtendField);

    }
}

