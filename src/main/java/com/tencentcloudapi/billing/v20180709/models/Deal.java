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

public class Deal  extends AbstractModel{

    /**
    * 订单号
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 订单状态
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 支付者
    */
    @SerializedName("Payer")
    @Expose
    private String Payer;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 创建人
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 实际支付金额（分）
    */
    @SerializedName("RealTotalCost")
    @Expose
    private Integer RealTotalCost;

    /**
    * 代金券抵扣金额（分）
    */
    @SerializedName("VoucherDecline")
    @Expose
    private Integer VoucherDecline;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * 产品分类ID
    */
    @SerializedName("GoodsCategoryId")
    @Expose
    private Integer GoodsCategoryId;

    /**
    * 产品详情
    */
    @SerializedName("ProductInfo")
    @Expose
    private ProductInfo [] ProductInfo;

    /**
    * 时长
    */
    @SerializedName("TimeSpan")
    @Expose
    private Float TimeSpan;

    /**
    * 时间单位
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 货币单位
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * 折扣率
    */
    @SerializedName("Policy")
    @Expose
    private Float Policy;

    /**
    * 单价（分）
    */
    @SerializedName("Price")
    @Expose
    private Float Price;

    /**
    * 原价（分）
    */
    @SerializedName("TotalCost")
    @Expose
    private Float TotalCost;

    /**
     * 获取订单号
     * @return OrderId 订单号
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * 设置订单号
     * @param OrderId 订单号
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * 获取订单状态
     * @return Status 订单状态
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置订单状态
     * @param Status 订单状态
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取支付者
     * @return Payer 支付者
     */
    public String getPayer() {
        return this.Payer;
    }

    /**
     * 设置支付者
     * @param Payer 支付者
     */
    public void setPayer(String Payer) {
        this.Payer = Payer;
    }

    /**
     * 获取创建时间
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取创建人
     * @return Creator 创建人
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * 设置创建人
     * @param Creator 创建人
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * 获取实际支付金额（分）
     * @return RealTotalCost 实际支付金额（分）
     */
    public Integer getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * 设置实际支付金额（分）
     * @param RealTotalCost 实际支付金额（分）
     */
    public void setRealTotalCost(Integer RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * 获取代金券抵扣金额（分）
     * @return VoucherDecline 代金券抵扣金额（分）
     */
    public Integer getVoucherDecline() {
        return this.VoucherDecline;
    }

    /**
     * 设置代金券抵扣金额（分）
     * @param VoucherDecline 代金券抵扣金额（分）
     */
    public void setVoucherDecline(Integer VoucherDecline) {
        this.VoucherDecline = VoucherDecline;
    }

    /**
     * 获取项目ID
     * @return ProjectId 项目ID
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取产品分类ID
     * @return GoodsCategoryId 产品分类ID
     */
    public Integer getGoodsCategoryId() {
        return this.GoodsCategoryId;
    }

    /**
     * 设置产品分类ID
     * @param GoodsCategoryId 产品分类ID
     */
    public void setGoodsCategoryId(Integer GoodsCategoryId) {
        this.GoodsCategoryId = GoodsCategoryId;
    }

    /**
     * 获取产品详情
     * @return ProductInfo 产品详情
     */
    public ProductInfo [] getProductInfo() {
        return this.ProductInfo;
    }

    /**
     * 设置产品详情
     * @param ProductInfo 产品详情
     */
    public void setProductInfo(ProductInfo [] ProductInfo) {
        this.ProductInfo = ProductInfo;
    }

    /**
     * 获取时长
     * @return TimeSpan 时长
     */
    public Float getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * 设置时长
     * @param TimeSpan 时长
     */
    public void setTimeSpan(Float TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * 获取时间单位
     * @return TimeUnit 时间单位
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * 设置时间单位
     * @param TimeUnit 时间单位
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * 获取货币单位
     * @return Currency 货币单位
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * 设置货币单位
     * @param Currency 货币单位
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * 获取折扣率
     * @return Policy 折扣率
     */
    public Float getPolicy() {
        return this.Policy;
    }

    /**
     * 设置折扣率
     * @param Policy 折扣率
     */
    public void setPolicy(Float Policy) {
        this.Policy = Policy;
    }

    /**
     * 获取单价（分）
     * @return Price 单价（分）
     */
    public Float getPrice() {
        return this.Price;
    }

    /**
     * 设置单价（分）
     * @param Price 单价（分）
     */
    public void setPrice(Float Price) {
        this.Price = Price;
    }

    /**
     * 获取原价（分）
     * @return TotalCost 原价（分）
     */
    public Float getTotalCost() {
        return this.TotalCost;
    }

    /**
     * 设置原价（分）
     * @param TotalCost 原价（分）
     */
    public void setTotalCost(Float TotalCost) {
        this.TotalCost = TotalCost;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Payer", this.Payer);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "VoucherDecline", this.VoucherDecline);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "GoodsCategoryId", this.GoodsCategoryId);
        this.setParamArrayObj(map, prefix + "ProductInfo.", this.ProductInfo);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);

    }
}

