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

public class BillDetail  extends AbstractModel{

    /**
    * 产品名称：云产品大类，如云服务器CVM、云数据库MySQL
    */
    @SerializedName("BusinessCodeName")
    @Expose
    private String BusinessCodeName;

    /**
    * 子产品名称：云产品子类，如云服务器CVM-标准型S1
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
    * 项目:资源所属项目
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 区域：资源所属地域，如华南地区（广州）
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
    * 资源实例ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 实例名称
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 交易类型
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
    * 交易ID
    */
    @SerializedName("BillId")
    @Expose
    private String BillId;

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
    * 组件列表
    */
    @SerializedName("ComponentSet")
    @Expose
    private BillDetailComponent [] ComponentSet;

    /**
    * 支付者UIN
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
    * 使用者UIN
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 操作者UIN
    */
    @SerializedName("OperateUin")
    @Expose
    private String OperateUin;

    /**
    * Tag 信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private BillTagInfo [] Tags;

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
     * 获取子产品名称：云产品子类，如云服务器CVM-标准型S1
     * @return ProductCodeName 子产品名称：云产品子类，如云服务器CVM-标准型S1
     */
    public String getProductCodeName() {
        return this.ProductCodeName;
    }

    /**
     * 设置子产品名称：云产品子类，如云服务器CVM-标准型S1
     * @param ProductCodeName 子产品名称：云产品子类，如云服务器CVM-标准型S1
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
     * 获取项目:资源所属项目
     * @return ProjectName 项目:资源所属项目
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * 设置项目:资源所属项目
     * @param ProjectName 项目:资源所属项目
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * 获取区域：资源所属地域，如华南地区（广州）
     * @return RegionName 区域：资源所属地域，如华南地区（广州）
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * 设置区域：资源所属地域，如华南地区（广州）
     * @param RegionName 区域：资源所属地域，如华南地区（广州）
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * 获取可用区：资源所属可用区，如广州三区
     * @return ZoneName 可用区：资源所属可用区，如广州三区
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * 设置可用区：资源所属可用区，如广州三区
     * @param ZoneName 可用区：资源所属可用区，如广州三区
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
     * 获取实例名称
     * @return ResourceName 实例名称
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * 设置实例名称
     * @param ResourceName 实例名称
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * 获取交易类型
     * @return ActionTypeName 交易类型
     */
    public String getActionTypeName() {
        return this.ActionTypeName;
    }

    /**
     * 设置交易类型
     * @param ActionTypeName 交易类型
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
     * 获取交易ID
     * @return BillId 交易ID
     */
    public String getBillId() {
        return this.BillId;
    }

    /**
     * 设置交易ID
     * @param BillId 交易ID
     */
    public void setBillId(String BillId) {
        this.BillId = BillId;
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
     * 获取组件列表
     * @return ComponentSet 组件列表
     */
    public BillDetailComponent [] getComponentSet() {
        return this.ComponentSet;
    }

    /**
     * 设置组件列表
     * @param ComponentSet 组件列表
     */
    public void setComponentSet(BillDetailComponent [] ComponentSet) {
        this.ComponentSet = ComponentSet;
    }

    /**
     * 获取支付者UIN
     * @return PayerUin 支付者UIN
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * 设置支付者UIN
     * @param PayerUin 支付者UIN
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    /**
     * 获取使用者UIN
     * @return OwnerUin 使用者UIN
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * 设置使用者UIN
     * @param OwnerUin 使用者UIN
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * 获取操作者UIN
     * @return OperateUin 操作者UIN
     */
    public String getOperateUin() {
        return this.OperateUin;
    }

    /**
     * 设置操作者UIN
     * @param OperateUin 操作者UIN
     */
    public void setOperateUin(String OperateUin) {
        this.OperateUin = OperateUin;
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
        this.setParamSimple(map, prefix + "BillId", this.BillId);
        this.setParamSimple(map, prefix + "PayTime", this.PayTime);
        this.setParamSimple(map, prefix + "FeeBeginTime", this.FeeBeginTime);
        this.setParamSimple(map, prefix + "FeeEndTime", this.FeeEndTime);
        this.setParamArrayObj(map, prefix + "ComponentSet.", this.ComponentSet);
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OperateUin", this.OperateUin);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

