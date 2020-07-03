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

public class BillDetail extends AbstractModel{

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
    * 商品名称代码（未开放的字段）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * 子商品名称代码 （未开放的字段）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * 交易类型代码（未开放的字段）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * 区域ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
     * Get 产品名称：云产品大类，如云服务器CVM、云数据库MySQL 
     * @return BusinessCodeName 产品名称：云产品大类，如云服务器CVM、云数据库MySQL
     */
    public String getBusinessCodeName() {
        return this.BusinessCodeName;
    }

    /**
     * Set 产品名称：云产品大类，如云服务器CVM、云数据库MySQL
     * @param BusinessCodeName 产品名称：云产品大类，如云服务器CVM、云数据库MySQL
     */
    public void setBusinessCodeName(String BusinessCodeName) {
        this.BusinessCodeName = BusinessCodeName;
    }

    /**
     * Get 子产品名称：云产品子类，如云服务器CVM-标准型S1 
     * @return ProductCodeName 子产品名称：云产品子类，如云服务器CVM-标准型S1
     */
    public String getProductCodeName() {
        return this.ProductCodeName;
    }

    /**
     * Set 子产品名称：云产品子类，如云服务器CVM-标准型S1
     * @param ProductCodeName 子产品名称：云产品子类，如云服务器CVM-标准型S1
     */
    public void setProductCodeName(String ProductCodeName) {
        this.ProductCodeName = ProductCodeName;
    }

    /**
     * Get 计费模式：包年包月和按量计费 
     * @return PayModeName 计费模式：包年包月和按量计费
     */
    public String getPayModeName() {
        return this.PayModeName;
    }

    /**
     * Set 计费模式：包年包月和按量计费
     * @param PayModeName 计费模式：包年包月和按量计费
     */
    public void setPayModeName(String PayModeName) {
        this.PayModeName = PayModeName;
    }

    /**
     * Get 项目:资源所属项目 
     * @return ProjectName 项目:资源所属项目
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目:资源所属项目
     * @param ProjectName 项目:资源所属项目
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 区域：资源所属地域，如华南地区（广州） 
     * @return RegionName 区域：资源所属地域，如华南地区（广州）
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 区域：资源所属地域，如华南地区（广州）
     * @param RegionName 区域：资源所属地域，如华南地区（广州）
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
     * Get 资源实例ID 
     * @return ResourceId 资源实例ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源实例ID
     * @param ResourceId 资源实例ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 实例名称 
     * @return ResourceName 实例名称
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 实例名称
     * @param ResourceName 实例名称
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 交易类型 
     * @return ActionTypeName 交易类型
     */
    public String getActionTypeName() {
        return this.ActionTypeName;
    }

    /**
     * Set 交易类型
     * @param ActionTypeName 交易类型
     */
    public void setActionTypeName(String ActionTypeName) {
        this.ActionTypeName = ActionTypeName;
    }

    /**
     * Get 订单ID 
     * @return OrderId 订单ID
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单ID
     * @param OrderId 订单ID
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 交易ID 
     * @return BillId 交易ID
     */
    public String getBillId() {
        return this.BillId;
    }

    /**
     * Set 交易ID
     * @param BillId 交易ID
     */
    public void setBillId(String BillId) {
        this.BillId = BillId;
    }

    /**
     * Get 扣费时间 
     * @return PayTime 扣费时间
     */
    public String getPayTime() {
        return this.PayTime;
    }

    /**
     * Set 扣费时间
     * @param PayTime 扣费时间
     */
    public void setPayTime(String PayTime) {
        this.PayTime = PayTime;
    }

    /**
     * Get 开始使用时间 
     * @return FeeBeginTime 开始使用时间
     */
    public String getFeeBeginTime() {
        return this.FeeBeginTime;
    }

    /**
     * Set 开始使用时间
     * @param FeeBeginTime 开始使用时间
     */
    public void setFeeBeginTime(String FeeBeginTime) {
        this.FeeBeginTime = FeeBeginTime;
    }

    /**
     * Get 结束使用时间 
     * @return FeeEndTime 结束使用时间
     */
    public String getFeeEndTime() {
        return this.FeeEndTime;
    }

    /**
     * Set 结束使用时间
     * @param FeeEndTime 结束使用时间
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
     * Get 支付者UIN 
     * @return PayerUin 支付者UIN
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set 支付者UIN
     * @param PayerUin 支付者UIN
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    /**
     * Get 使用者UIN 
     * @return OwnerUin 使用者UIN
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 使用者UIN
     * @param OwnerUin 使用者UIN
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 操作者UIN 
     * @return OperateUin 操作者UIN
     */
    public String getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set 操作者UIN
     * @param OperateUin 操作者UIN
     */
    public void setOperateUin(String OperateUin) {
        this.OperateUin = OperateUin;
    }

    /**
     * Get Tag 信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags Tag 信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BillTagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag 信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags Tag 信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(BillTagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 商品名称代码（未开放的字段）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessCode 商品名称代码（未开放的字段）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set 商品名称代码（未开放的字段）
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessCode 商品名称代码（未开放的字段）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get 子商品名称代码 （未开放的字段）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductCode 子商品名称代码 （未开放的字段）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set 子商品名称代码 （未开放的字段）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductCode 子商品名称代码 （未开放的字段）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get 交易类型代码（未开放的字段）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActionType 交易类型代码（未开放的字段）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set 交易类型代码（未开放的字段）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActionType 交易类型代码（未开放的字段）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get 区域ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionId 区域ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 区域ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionId 区域ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
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

    }
}

