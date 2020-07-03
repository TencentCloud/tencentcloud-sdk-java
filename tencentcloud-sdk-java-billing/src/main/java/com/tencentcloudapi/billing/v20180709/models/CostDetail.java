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

public class CostDetail extends AbstractModel{

    /**
    * 支付者uin
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
    * 业务名称
    */
    @SerializedName("BusinessCodeName")
    @Expose
    private String BusinessCodeName;

    /**
    * 产品名称
    */
    @SerializedName("ProductCodeName")
    @Expose
    private String ProductCodeName;

    /**
    * 计费模式名称
    */
    @SerializedName("PayModeName")
    @Expose
    private String PayModeName;

    /**
    * 项目名称
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 区域名称
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 地区名称
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 资源id
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
    * 类型名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActionTypeName")
    @Expose
    private String ActionTypeName;

    /**
    * 订单id
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 交易id
    */
    @SerializedName("BillId")
    @Expose
    private String BillId;

    /**
    * 费用开始时间
    */
    @SerializedName("FeeBeginTime")
    @Expose
    private String FeeBeginTime;

    /**
    * 费用结束时间
    */
    @SerializedName("FeeEndTime")
    @Expose
    private String FeeEndTime;

    /**
    * 组件明细
    */
    @SerializedName("ComponentSet")
    @Expose
    private CostComponentSet [] ComponentSet;

    /**
    * 产品代码
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
     * Get 支付者uin 
     * @return PayerUin 支付者uin
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set 支付者uin
     * @param PayerUin 支付者uin
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    /**
     * Get 业务名称 
     * @return BusinessCodeName 业务名称
     */
    public String getBusinessCodeName() {
        return this.BusinessCodeName;
    }

    /**
     * Set 业务名称
     * @param BusinessCodeName 业务名称
     */
    public void setBusinessCodeName(String BusinessCodeName) {
        this.BusinessCodeName = BusinessCodeName;
    }

    /**
     * Get 产品名称 
     * @return ProductCodeName 产品名称
     */
    public String getProductCodeName() {
        return this.ProductCodeName;
    }

    /**
     * Set 产品名称
     * @param ProductCodeName 产品名称
     */
    public void setProductCodeName(String ProductCodeName) {
        this.ProductCodeName = ProductCodeName;
    }

    /**
     * Get 计费模式名称 
     * @return PayModeName 计费模式名称
     */
    public String getPayModeName() {
        return this.PayModeName;
    }

    /**
     * Set 计费模式名称
     * @param PayModeName 计费模式名称
     */
    public void setPayModeName(String PayModeName) {
        this.PayModeName = PayModeName;
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
     * Get 区域名称 
     * @return RegionName 区域名称
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 区域名称
     * @param RegionName 区域名称
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 地区名称 
     * @return ZoneName 地区名称
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 地区名称
     * @param ZoneName 地区名称
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 资源id 
     * @return ResourceId 资源id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源id
     * @param ResourceId 资源id
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
     * Get 类型名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActionTypeName 类型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActionTypeName() {
        return this.ActionTypeName;
    }

    /**
     * Set 类型名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActionTypeName 类型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActionTypeName(String ActionTypeName) {
        this.ActionTypeName = ActionTypeName;
    }

    /**
     * Get 订单id 
     * @return OrderId 订单id
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单id
     * @param OrderId 订单id
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 交易id 
     * @return BillId 交易id
     */
    public String getBillId() {
        return this.BillId;
    }

    /**
     * Set 交易id
     * @param BillId 交易id
     */
    public void setBillId(String BillId) {
        this.BillId = BillId;
    }

    /**
     * Get 费用开始时间 
     * @return FeeBeginTime 费用开始时间
     */
    public String getFeeBeginTime() {
        return this.FeeBeginTime;
    }

    /**
     * Set 费用开始时间
     * @param FeeBeginTime 费用开始时间
     */
    public void setFeeBeginTime(String FeeBeginTime) {
        this.FeeBeginTime = FeeBeginTime;
    }

    /**
     * Get 费用结束时间 
     * @return FeeEndTime 费用结束时间
     */
    public String getFeeEndTime() {
        return this.FeeEndTime;
    }

    /**
     * Set 费用结束时间
     * @param FeeEndTime 费用结束时间
     */
    public void setFeeEndTime(String FeeEndTime) {
        this.FeeEndTime = FeeEndTime;
    }

    /**
     * Get 组件明细 
     * @return ComponentSet 组件明细
     */
    public CostComponentSet [] getComponentSet() {
        return this.ComponentSet;
    }

    /**
     * Set 组件明细
     * @param ComponentSet 组件明细
     */
    public void setComponentSet(CostComponentSet [] ComponentSet) {
        this.ComponentSet = ComponentSet;
    }

    /**
     * Get 产品代码 
     * @return ProductCode 产品代码
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set 产品代码
     * @param ProductCode 产品代码
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
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
        this.setParamSimple(map, prefix + "FeeBeginTime", this.FeeBeginTime);
        this.setParamSimple(map, prefix + "FeeEndTime", this.FeeEndTime);
        this.setParamArrayObj(map, prefix + "ComponentSet.", this.ComponentSet);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);

    }
}

