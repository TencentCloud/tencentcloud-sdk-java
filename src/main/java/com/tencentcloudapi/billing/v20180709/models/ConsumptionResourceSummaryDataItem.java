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

public class ConsumptionResourceSummaryDataItem extends AbstractModel {

    /**
    * <p>资源ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>资源名称</p>
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * <p>折后总价</p>
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

    /**
    * <p>现金花费</p>
    */
    @SerializedName("CashPayAmount")
    @Expose
    private String CashPayAmount;

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>项目名称</p>
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * <p>地域ID</p>
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * <p>地域名称</p>
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * <p>付费模式</p>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>付费模式名称</p>
    */
    @SerializedName("PayModeName")
    @Expose
    private String PayModeName;

    /**
    * <p>产品名称代码</p>
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * <p>产品名称</p>
    */
    @SerializedName("BusinessCodeName")
    @Expose
    private String BusinessCodeName;

    /**
    * <p>消耗类型</p>
    */
    @SerializedName("ConsumptionTypeName")
    @Expose
    private String ConsumptionTypeName;

    /**
    * <p>折前价</p>
    */
    @SerializedName("RealCost")
    @Expose
    private String RealCost;

    /**
    * <p>费用起始时间</p>
    */
    @SerializedName("FeeBeginTime")
    @Expose
    private String FeeBeginTime;

    /**
    * <p>费用结束时间</p>
    */
    @SerializedName("FeeEndTime")
    @Expose
    private String FeeEndTime;

    /**
    * <p>天数</p>
    */
    @SerializedName("DayDiff")
    @Expose
    private String DayDiff;

    /**
    * <p>每日消耗</p>
    */
    @SerializedName("DailyTotalCost")
    @Expose
    private String DailyTotalCost;

    /**
    * <p>订单号</p>
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * <p>代金券</p>
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
    * <p>赠送金</p>
    */
    @SerializedName("IncentivePayAmount")
    @Expose
    private String IncentivePayAmount;

    /**
    * <p>分成金</p>
    */
    @SerializedName("TransferPayAmount")
    @Expose
    private String TransferPayAmount;

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
    * <p>子产品编码</p>
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * <p>子产品名称：用户采购的具体产品细分类型，例如：云服务器 CVM-标准型 S1</p>
    */
    @SerializedName("ProductCodeName")
    @Expose
    private String ProductCodeName;

    /**
    * <p>地域类型</p>
    */
    @SerializedName("RegionType")
    @Expose
    private String RegionType;

    /**
    * <p>地域类型名称</p>
    */
    @SerializedName("RegionTypeName")
    @Expose
    private String RegionTypeName;

    /**
    * <p>扩展字段1</p>
    */
    @SerializedName("Extend1")
    @Expose
    private String Extend1;

    /**
    * <p>扩展字段2</p>
    */
    @SerializedName("Extend2")
    @Expose
    private String Extend2;

    /**
    * <p>扩展字段3</p>
    */
    @SerializedName("Extend3")
    @Expose
    private String Extend3;

    /**
    * <p>扩展字段4</p>
    */
    @SerializedName("Extend4")
    @Expose
    private String Extend4;

    /**
    * <p>扩展字段5</p>
    */
    @SerializedName("Extend5")
    @Expose
    private String Extend5;

    /**
    * <p>实例类型</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>实例类型名称</p>
    */
    @SerializedName("InstanceTypeName")
    @Expose
    private String InstanceTypeName;

    /**
    * <p>扣费时间：结算扣费时间</p>
    */
    @SerializedName("PayTime")
    @Expose
    private String PayTime;

    /**
    * <p>可用区：资源所属可用区，如广州三区</p>
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * <p>配置描述</p>
    */
    @SerializedName("ComponentConfig")
    @Expose
    private String ComponentConfig;

    /**
    * <p>标签信息</p>
    */
    @SerializedName("Tags")
    @Expose
    private String Tags;

    /**
    * <p>待分摊金额</p><p>剩余待分摊的折后总金额</p>
    */
    @SerializedName("LeftRealTotalCost")
    @Expose
    private String LeftRealTotalCost;

    /**
     * Get <p>资源ID</p> 
     * @return ResourceId <p>资源ID</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源ID</p>
     * @param ResourceId <p>资源ID</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>资源名称</p> 
     * @return ResourceName <p>资源名称</p>
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set <p>资源名称</p>
     * @param ResourceName <p>资源名称</p>
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get <p>折后总价</p> 
     * @return RealTotalCost <p>折后总价</p>
     */
    public String getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set <p>折后总价</p>
     * @param RealTotalCost <p>折后总价</p>
     */
    public void setRealTotalCost(String RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get <p>现金花费</p> 
     * @return CashPayAmount <p>现金花费</p>
     */
    public String getCashPayAmount() {
        return this.CashPayAmount;
    }

    /**
     * Set <p>现金花费</p>
     * @param CashPayAmount <p>现金花费</p>
     */
    public void setCashPayAmount(String CashPayAmount) {
        this.CashPayAmount = CashPayAmount;
    }

    /**
     * Get <p>项目ID</p> 
     * @return ProjectId <p>项目ID</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
     * @param ProjectId <p>项目ID</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>项目名称</p> 
     * @return ProjectName <p>项目名称</p>
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set <p>项目名称</p>
     * @param ProjectName <p>项目名称</p>
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
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
     * Get <p>地域名称</p> 
     * @return RegionName <p>地域名称</p>
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set <p>地域名称</p>
     * @param RegionName <p>地域名称</p>
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get <p>付费模式</p> 
     * @return PayMode <p>付费模式</p>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>付费模式</p>
     * @param PayMode <p>付费模式</p>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>付费模式名称</p> 
     * @return PayModeName <p>付费模式名称</p>
     */
    public String getPayModeName() {
        return this.PayModeName;
    }

    /**
     * Set <p>付费模式名称</p>
     * @param PayModeName <p>付费模式名称</p>
     */
    public void setPayModeName(String PayModeName) {
        this.PayModeName = PayModeName;
    }

    /**
     * Get <p>产品名称代码</p> 
     * @return BusinessCode <p>产品名称代码</p>
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set <p>产品名称代码</p>
     * @param BusinessCode <p>产品名称代码</p>
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get <p>产品名称</p> 
     * @return BusinessCodeName <p>产品名称</p>
     */
    public String getBusinessCodeName() {
        return this.BusinessCodeName;
    }

    /**
     * Set <p>产品名称</p>
     * @param BusinessCodeName <p>产品名称</p>
     */
    public void setBusinessCodeName(String BusinessCodeName) {
        this.BusinessCodeName = BusinessCodeName;
    }

    /**
     * Get <p>消耗类型</p> 
     * @return ConsumptionTypeName <p>消耗类型</p>
     */
    public String getConsumptionTypeName() {
        return this.ConsumptionTypeName;
    }

    /**
     * Set <p>消耗类型</p>
     * @param ConsumptionTypeName <p>消耗类型</p>
     */
    public void setConsumptionTypeName(String ConsumptionTypeName) {
        this.ConsumptionTypeName = ConsumptionTypeName;
    }

    /**
     * Get <p>折前价</p> 
     * @return RealCost <p>折前价</p>
     */
    public String getRealCost() {
        return this.RealCost;
    }

    /**
     * Set <p>折前价</p>
     * @param RealCost <p>折前价</p>
     */
    public void setRealCost(String RealCost) {
        this.RealCost = RealCost;
    }

    /**
     * Get <p>费用起始时间</p> 
     * @return FeeBeginTime <p>费用起始时间</p>
     */
    public String getFeeBeginTime() {
        return this.FeeBeginTime;
    }

    /**
     * Set <p>费用起始时间</p>
     * @param FeeBeginTime <p>费用起始时间</p>
     */
    public void setFeeBeginTime(String FeeBeginTime) {
        this.FeeBeginTime = FeeBeginTime;
    }

    /**
     * Get <p>费用结束时间</p> 
     * @return FeeEndTime <p>费用结束时间</p>
     */
    public String getFeeEndTime() {
        return this.FeeEndTime;
    }

    /**
     * Set <p>费用结束时间</p>
     * @param FeeEndTime <p>费用结束时间</p>
     */
    public void setFeeEndTime(String FeeEndTime) {
        this.FeeEndTime = FeeEndTime;
    }

    /**
     * Get <p>天数</p> 
     * @return DayDiff <p>天数</p>
     */
    public String getDayDiff() {
        return this.DayDiff;
    }

    /**
     * Set <p>天数</p>
     * @param DayDiff <p>天数</p>
     */
    public void setDayDiff(String DayDiff) {
        this.DayDiff = DayDiff;
    }

    /**
     * Get <p>每日消耗</p> 
     * @return DailyTotalCost <p>每日消耗</p>
     */
    public String getDailyTotalCost() {
        return this.DailyTotalCost;
    }

    /**
     * Set <p>每日消耗</p>
     * @param DailyTotalCost <p>每日消耗</p>
     */
    public void setDailyTotalCost(String DailyTotalCost) {
        this.DailyTotalCost = DailyTotalCost;
    }

    /**
     * Get <p>订单号</p> 
     * @return OrderId <p>订单号</p>
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set <p>订单号</p>
     * @param OrderId <p>订单号</p>
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get <p>代金券</p> 
     * @return VoucherPayAmount <p>代金券</p>
     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * Set <p>代金券</p>
     * @param VoucherPayAmount <p>代金券</p>
     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * Get <p>赠送金</p> 
     * @return IncentivePayAmount <p>赠送金</p>
     */
    public String getIncentivePayAmount() {
        return this.IncentivePayAmount;
    }

    /**
     * Set <p>赠送金</p>
     * @param IncentivePayAmount <p>赠送金</p>
     */
    public void setIncentivePayAmount(String IncentivePayAmount) {
        this.IncentivePayAmount = IncentivePayAmount;
    }

    /**
     * Get <p>分成金</p> 
     * @return TransferPayAmount <p>分成金</p>
     */
    public String getTransferPayAmount() {
        return this.TransferPayAmount;
    }

    /**
     * Set <p>分成金</p>
     * @param TransferPayAmount <p>分成金</p>
     */
    public void setTransferPayAmount(String TransferPayAmount) {
        this.TransferPayAmount = TransferPayAmount;
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
     * Get <p>地域类型</p> 
     * @return RegionType <p>地域类型</p>
     */
    public String getRegionType() {
        return this.RegionType;
    }

    /**
     * Set <p>地域类型</p>
     * @param RegionType <p>地域类型</p>
     */
    public void setRegionType(String RegionType) {
        this.RegionType = RegionType;
    }

    /**
     * Get <p>地域类型名称</p> 
     * @return RegionTypeName <p>地域类型名称</p>
     */
    public String getRegionTypeName() {
        return this.RegionTypeName;
    }

    /**
     * Set <p>地域类型名称</p>
     * @param RegionTypeName <p>地域类型名称</p>
     */
    public void setRegionTypeName(String RegionTypeName) {
        this.RegionTypeName = RegionTypeName;
    }

    /**
     * Get <p>扩展字段1</p> 
     * @return Extend1 <p>扩展字段1</p>
     */
    public String getExtend1() {
        return this.Extend1;
    }

    /**
     * Set <p>扩展字段1</p>
     * @param Extend1 <p>扩展字段1</p>
     */
    public void setExtend1(String Extend1) {
        this.Extend1 = Extend1;
    }

    /**
     * Get <p>扩展字段2</p> 
     * @return Extend2 <p>扩展字段2</p>
     */
    public String getExtend2() {
        return this.Extend2;
    }

    /**
     * Set <p>扩展字段2</p>
     * @param Extend2 <p>扩展字段2</p>
     */
    public void setExtend2(String Extend2) {
        this.Extend2 = Extend2;
    }

    /**
     * Get <p>扩展字段3</p> 
     * @return Extend3 <p>扩展字段3</p>
     */
    public String getExtend3() {
        return this.Extend3;
    }

    /**
     * Set <p>扩展字段3</p>
     * @param Extend3 <p>扩展字段3</p>
     */
    public void setExtend3(String Extend3) {
        this.Extend3 = Extend3;
    }

    /**
     * Get <p>扩展字段4</p> 
     * @return Extend4 <p>扩展字段4</p>
     */
    public String getExtend4() {
        return this.Extend4;
    }

    /**
     * Set <p>扩展字段4</p>
     * @param Extend4 <p>扩展字段4</p>
     */
    public void setExtend4(String Extend4) {
        this.Extend4 = Extend4;
    }

    /**
     * Get <p>扩展字段5</p> 
     * @return Extend5 <p>扩展字段5</p>
     */
    public String getExtend5() {
        return this.Extend5;
    }

    /**
     * Set <p>扩展字段5</p>
     * @param Extend5 <p>扩展字段5</p>
     */
    public void setExtend5(String Extend5) {
        this.Extend5 = Extend5;
    }

    /**
     * Get <p>实例类型</p> 
     * @return InstanceType <p>实例类型</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例类型</p>
     * @param InstanceType <p>实例类型</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>实例类型名称</p> 
     * @return InstanceTypeName <p>实例类型名称</p>
     */
    public String getInstanceTypeName() {
        return this.InstanceTypeName;
    }

    /**
     * Set <p>实例类型名称</p>
     * @param InstanceTypeName <p>实例类型名称</p>
     */
    public void setInstanceTypeName(String InstanceTypeName) {
        this.InstanceTypeName = InstanceTypeName;
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
     * Get <p>配置描述</p> 
     * @return ComponentConfig <p>配置描述</p>
     */
    public String getComponentConfig() {
        return this.ComponentConfig;
    }

    /**
     * Set <p>配置描述</p>
     * @param ComponentConfig <p>配置描述</p>
     */
    public void setComponentConfig(String ComponentConfig) {
        this.ComponentConfig = ComponentConfig;
    }

    /**
     * Get <p>标签信息</p> 
     * @return Tags <p>标签信息</p>
     */
    public String getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签信息</p>
     * @param Tags <p>标签信息</p>
     */
    public void setTags(String Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>待分摊金额</p><p>剩余待分摊的折后总金额</p> 
     * @return LeftRealTotalCost <p>待分摊金额</p><p>剩余待分摊的折后总金额</p>
     */
    public String getLeftRealTotalCost() {
        return this.LeftRealTotalCost;
    }

    /**
     * Set <p>待分摊金额</p><p>剩余待分摊的折后总金额</p>
     * @param LeftRealTotalCost <p>待分摊金额</p><p>剩余待分摊的折后总金额</p>
     */
    public void setLeftRealTotalCost(String LeftRealTotalCost) {
        this.LeftRealTotalCost = LeftRealTotalCost;
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
        if (source.Tags != null) {
            this.Tags = new String(source.Tags);
        }
        if (source.LeftRealTotalCost != null) {
            this.LeftRealTotalCost = new String(source.LeftRealTotalCost);
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
        this.setParamSimple(map, prefix + "Tags", this.Tags);
        this.setParamSimple(map, prefix + "LeftRealTotalCost", this.LeftRealTotalCost);

    }
}

