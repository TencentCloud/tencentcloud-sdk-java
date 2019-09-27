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

public class BillResourceSummary  extends AbstractModel{

    /**
    * 产品名称：云产品大类，如云服务器CVM、云数据库MySQL
    */
    @SerializedName("BusinessCodeName")
    @Expose
    private String BusinessCodeName;

    /**
    * 子产品：云产品子类，如云服务器CVM-标准型S1， 当没有获取到子产品名称时，返回"-"
    */
    @SerializedName("ProductCodeName")
    @Expose
    private String ProductCodeName;

    /**
    * 计费模式：包年包月和按量计费
    */
    @SerializedName("PayModeName")
    @Expose
    private String PayModeName;

    /**
    * 项目
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 地域
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 可用区
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 资源实例ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源实例名称
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 交易类型：包年包月新购/续费/升降配/退款、按量计费扣费、调账补偿/扣费等类型
    */
    @SerializedName("ActionTypeName")
    @Expose
    private String ActionTypeName;

    /**
    * 订单ID
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 扣费时间
    */
    @SerializedName("PayTime")
    @Expose
    private String PayTime;

    /**
    * 开始使用时间
    */
    @SerializedName("FeeBeginTime")
    @Expose
    private String FeeBeginTime;

    /**
    * 结束使用时间
    */
    @SerializedName("FeeEndTime")
    @Expose
    private String FeeEndTime;

    /**
    * 配置描述
    */
    @SerializedName("ConfigDesc")
    @Expose
    private String ConfigDesc;

    /**
    * 扩展字段1
    */
    @SerializedName("ExtendField1")
    @Expose
    private String ExtendField1;

    /**
    * 扩展字段2
    */
    @SerializedName("ExtendField2")
    @Expose
    private String ExtendField2;

    /**
    * 原价，单位为元
    */
    @SerializedName("TotalCost")
    @Expose
    private String TotalCost;

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
    * 优惠后总价，单位为元
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

    /**
    * 代金券支付金额，单位为元
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
    * 现金账户支付金额，单位为元
    */
    @SerializedName("CashPayAmount")
    @Expose
    private String CashPayAmount;

    /**
    * 赠送账户支付金额，单位为元
    */
    @SerializedName("IncentivePayAmount")
    @Expose
    private String IncentivePayAmount;

    /**
    * 扩展字段3
    */
    @SerializedName("ExtendField3")
    @Expose
    private String ExtendField3;

    /**
    * 扩展字段4
    */
    @SerializedName("ExtendField4")
    @Expose
    private String ExtendField4;

    /**
    * 扩展字段5
    */
    @SerializedName("ExtendField5")
    @Expose
    private String ExtendField5;

    /**
    * Tag 信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private BillTagInfo [] Tags;

    /**
    * 付款方uin
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
    * 资源所有者uin,无值则返回"-"
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 操作者uin,无值则返回"-"
    */
    @SerializedName("OperateUin")
    @Expose
    private String OperateUin;

    /**
     * 获取产品名称：云产品大类，如云服务器CVM、云数据库MySQL
     * @return BusinessCodeName 产品名称：云产品大类，如云服务器CVM、云数据库MySQL
     */
    public String getBusinessCodeName() {
        return this.BusinessCodeName;
    }

    /**
     * 设置产品名称：云产品大类，如云服务器CVM、云数据库MySQL
     * @param BusinessCodeName 产品名称：云产品大类，如云服务器CVM、云数据库MySQL
     */
    public void setBusinessCodeName(String BusinessCodeName) {
        this.BusinessCodeName = BusinessCodeName;
    }

    /**
     * 获取子产品：云产品子类，如云服务器CVM-标准型S1， 当没有获取到子产品名称时，返回"-"
     * @return ProductCodeName 子产品：云产品子类，如云服务器CVM-标准型S1， 当没有获取到子产品名称时，返回"-"
     */
    public String getProductCodeName() {
        return this.ProductCodeName;
    }

    /**
     * 设置子产品：云产品子类，如云服务器CVM-标准型S1， 当没有获取到子产品名称时，返回"-"
     * @param ProductCodeName 子产品：云产品子类，如云服务器CVM-标准型S1， 当没有获取到子产品名称时，返回"-"
     */
    public void setProductCodeName(String ProductCodeName) {
        this.ProductCodeName = ProductCodeName;
    }

    /**
     * 获取计费模式：包年包月和按量计费
     * @return PayModeName 计费模式：包年包月和按量计费
     */
    public String getPayModeName() {
        return this.PayModeName;
    }

    /**
     * 设置计费模式：包年包月和按量计费
     * @param PayModeName 计费模式：包年包月和按量计费
     */
    public void setPayModeName(String PayModeName) {
        this.PayModeName = PayModeName;
    }

    /**
     * 获取项目
     * @return ProjectName 项目
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * 设置项目
     * @param ProjectName 项目
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * 获取地域
     * @return RegionName 地域
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * 设置地域
     * @param RegionName 地域
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * 获取可用区
     * @return ZoneName 可用区
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * 设置可用区
     * @param ZoneName 可用区
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * 获取资源实例ID
     * @return ResourceId 资源实例ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * 设置资源实例ID
     * @param ResourceId 资源实例ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * 获取资源实例名称
     * @return ResourceName 资源实例名称
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * 设置资源实例名称
     * @param ResourceName 资源实例名称
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * 获取交易类型：包年包月新购/续费/升降配/退款、按量计费扣费、调账补偿/扣费等类型
     * @return ActionTypeName 交易类型：包年包月新购/续费/升降配/退款、按量计费扣费、调账补偿/扣费等类型
     */
    public String getActionTypeName() {
        return this.ActionTypeName;
    }

    /**
     * 设置交易类型：包年包月新购/续费/升降配/退款、按量计费扣费、调账补偿/扣费等类型
     * @param ActionTypeName 交易类型：包年包月新购/续费/升降配/退款、按量计费扣费、调账补偿/扣费等类型
     */
    public void setActionTypeName(String ActionTypeName) {
        this.ActionTypeName = ActionTypeName;
    }

    /**
     * 获取订单ID
     * @return OrderId 订单ID
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * 设置订单ID
     * @param OrderId 订单ID
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * 获取扣费时间
     * @return PayTime 扣费时间
     */
    public String getPayTime() {
        return this.PayTime;
    }

    /**
     * 设置扣费时间
     * @param PayTime 扣费时间
     */
    public void setPayTime(String PayTime) {
        this.PayTime = PayTime;
    }

    /**
     * 获取开始使用时间
     * @return FeeBeginTime 开始使用时间
     */
    public String getFeeBeginTime() {
        return this.FeeBeginTime;
    }

    /**
     * 设置开始使用时间
     * @param FeeBeginTime 开始使用时间
     */
    public void setFeeBeginTime(String FeeBeginTime) {
        this.FeeBeginTime = FeeBeginTime;
    }

    /**
     * 获取结束使用时间
     * @return FeeEndTime 结束使用时间
     */
    public String getFeeEndTime() {
        return this.FeeEndTime;
    }

    /**
     * 设置结束使用时间
     * @param FeeEndTime 结束使用时间
     */
    public void setFeeEndTime(String FeeEndTime) {
        this.FeeEndTime = FeeEndTime;
    }

    /**
     * 获取配置描述
     * @return ConfigDesc 配置描述
     */
    public String getConfigDesc() {
        return this.ConfigDesc;
    }

    /**
     * 设置配置描述
     * @param ConfigDesc 配置描述
     */
    public void setConfigDesc(String ConfigDesc) {
        this.ConfigDesc = ConfigDesc;
    }

    /**
     * 获取扩展字段1
     * @return ExtendField1 扩展字段1
     */
    public String getExtendField1() {
        return this.ExtendField1;
    }

    /**
     * 设置扩展字段1
     * @param ExtendField1 扩展字段1
     */
    public void setExtendField1(String ExtendField1) {
        this.ExtendField1 = ExtendField1;
    }

    /**
     * 获取扩展字段2
     * @return ExtendField2 扩展字段2
     */
    public String getExtendField2() {
        return this.ExtendField2;
    }

    /**
     * 设置扩展字段2
     * @param ExtendField2 扩展字段2
     */
    public void setExtendField2(String ExtendField2) {
        this.ExtendField2 = ExtendField2;
    }

    /**
     * 获取原价，单位为元
     * @return TotalCost 原价，单位为元
     */
    public String getTotalCost() {
        return this.TotalCost;
    }

    /**
     * 设置原价，单位为元
     * @param TotalCost 原价，单位为元
     */
    public void setTotalCost(String TotalCost) {
        this.TotalCost = TotalCost;
    }

    /**
     * 获取折扣率
     * @return Discount 折扣率
     */
    public String getDiscount() {
        return this.Discount;
    }

    /**
     * 设置折扣率
     * @param Discount 折扣率
     */
    public void setDiscount(String Discount) {
        this.Discount = Discount;
    }

    /**
     * 获取优惠类型
     * @return ReduceType 优惠类型
     */
    public String getReduceType() {
        return this.ReduceType;
    }

    /**
     * 设置优惠类型
     * @param ReduceType 优惠类型
     */
    public void setReduceType(String ReduceType) {
        this.ReduceType = ReduceType;
    }

    /**
     * 获取优惠后总价，单位为元
     * @return RealTotalCost 优惠后总价，单位为元
     */
    public String getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * 设置优惠后总价，单位为元
     * @param RealTotalCost 优惠后总价，单位为元
     */
    public void setRealTotalCost(String RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * 获取代金券支付金额，单位为元
     * @return VoucherPayAmount 代金券支付金额，单位为元
     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * 设置代金券支付金额，单位为元
     * @param VoucherPayAmount 代金券支付金额，单位为元
     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * 获取现金账户支付金额，单位为元
     * @return CashPayAmount 现金账户支付金额，单位为元
     */
    public String getCashPayAmount() {
        return this.CashPayAmount;
    }

    /**
     * 设置现金账户支付金额，单位为元
     * @param CashPayAmount 现金账户支付金额，单位为元
     */
    public void setCashPayAmount(String CashPayAmount) {
        this.CashPayAmount = CashPayAmount;
    }

    /**
     * 获取赠送账户支付金额，单位为元
     * @return IncentivePayAmount 赠送账户支付金额，单位为元
     */
    public String getIncentivePayAmount() {
        return this.IncentivePayAmount;
    }

    /**
     * 设置赠送账户支付金额，单位为元
     * @param IncentivePayAmount 赠送账户支付金额，单位为元
     */
    public void setIncentivePayAmount(String IncentivePayAmount) {
        this.IncentivePayAmount = IncentivePayAmount;
    }

    /**
     * 获取扩展字段3
     * @return ExtendField3 扩展字段3
     */
    public String getExtendField3() {
        return this.ExtendField3;
    }

    /**
     * 设置扩展字段3
     * @param ExtendField3 扩展字段3
     */
    public void setExtendField3(String ExtendField3) {
        this.ExtendField3 = ExtendField3;
    }

    /**
     * 获取扩展字段4
     * @return ExtendField4 扩展字段4
     */
    public String getExtendField4() {
        return this.ExtendField4;
    }

    /**
     * 设置扩展字段4
     * @param ExtendField4 扩展字段4
     */
    public void setExtendField4(String ExtendField4) {
        this.ExtendField4 = ExtendField4;
    }

    /**
     * 获取扩展字段5
     * @return ExtendField5 扩展字段5
     */
    public String getExtendField5() {
        return this.ExtendField5;
    }

    /**
     * 设置扩展字段5
     * @param ExtendField5 扩展字段5
     */
    public void setExtendField5(String ExtendField5) {
        this.ExtendField5 = ExtendField5;
    }

    /**
     * 获取Tag 信息
注意：此字段可能返回 null，表示取不到有效值。
     * @return Tags Tag 信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BillTagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * 设置Tag 信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags Tag 信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(BillTagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * 获取付款方uin
     * @return PayerUin 付款方uin
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * 设置付款方uin
     * @param PayerUin 付款方uin
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    /**
     * 获取资源所有者uin,无值则返回"-"
     * @return OwnerUin 资源所有者uin,无值则返回"-"
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * 设置资源所有者uin,无值则返回"-"
     * @param OwnerUin 资源所有者uin,无值则返回"-"
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * 获取操作者uin,无值则返回"-"
     * @return OperateUin 操作者uin,无值则返回"-"
     */
    public String getOperateUin() {
        return this.OperateUin;
    }

    /**
     * 设置操作者uin,无值则返回"-"
     * @param OperateUin 操作者uin,无值则返回"-"
     */
    public void setOperateUin(String OperateUin) {
        this.OperateUin = OperateUin;
    }

    /**
     * 内部实现，用户禁止调用
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
        this.setParamSimple(map, prefix + "ExtendField3", this.ExtendField3);
        this.setParamSimple(map, prefix + "ExtendField4", this.ExtendField4);
        this.setParamSimple(map, prefix + "ExtendField5", this.ExtendField5);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OperateUin", this.OperateUin);

    }
}

