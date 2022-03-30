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

public class Deal extends AbstractModel{

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
    private Long Status;

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
    private Long RealTotalCost;

    /**
    * 代金券抵扣金额（分）
    */
    @SerializedName("VoucherDecline")
    @Expose
    private Long VoucherDecline;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 产品分类ID
    */
    @SerializedName("GoodsCategoryId")
    @Expose
    private Long GoodsCategoryId;

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
    * 产品编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * 子产品编码
    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * 大订单号
    */
    @SerializedName("BigDealId")
    @Expose
    private String BigDealId;

    /**
    * 退费公式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Formula")
    @Expose
    private String Formula;

    /**
    * 退费涉及订单信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RefReturnDeals")
    @Expose
    private String RefReturnDeals;

    /**
    * 付费模式：prePay 预付费 postPay后付费 riPay预留实例
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 交易类型
modifyNetworkMode 调整带宽模式
modifyNetworkSize 调整带宽大小
refund 退款
downgrade 降配
upgrade 升配
renew 续费
purchase 购买
preMoveOut 包年包月迁出资源
preMoveIn 包年包月迁入资源
preToPost 预付费转后付费
postMoveOut 按量计费迁出资源
postMoveIn 按量计费迁入资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 产品编码中文名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 子产品编码中文名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubProductName")
    @Expose
    private String SubProductName;

    /**
    * 订单对应的资源id, 查询参数Limit超过200，将返回null
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceId")
    @Expose
    private String [] ResourceId;

    /**
     * Get 订单号 
     * @return OrderId 订单号
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单号
     * @param OrderId 订单号
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 订单状态 
     * @return Status 订单状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 订单状态
     * @param Status 订单状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 支付者 
     * @return Payer 支付者
     */
    public String getPayer() {
        return this.Payer;
    }

    /**
     * Set 支付者
     * @param Payer 支付者
     */
    public void setPayer(String Payer) {
        this.Payer = Payer;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 创建人 
     * @return Creator 创建人
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建人
     * @param Creator 创建人
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 实际支付金额（分） 
     * @return RealTotalCost 实际支付金额（分）
     */
    public Long getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set 实际支付金额（分）
     * @param RealTotalCost 实际支付金额（分）
     */
    public void setRealTotalCost(Long RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get 代金券抵扣金额（分） 
     * @return VoucherDecline 代金券抵扣金额（分）
     */
    public Long getVoucherDecline() {
        return this.VoucherDecline;
    }

    /**
     * Set 代金券抵扣金额（分）
     * @param VoucherDecline 代金券抵扣金额（分）
     */
    public void setVoucherDecline(Long VoucherDecline) {
        this.VoucherDecline = VoucherDecline;
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
     * Get 产品分类ID 
     * @return GoodsCategoryId 产品分类ID
     */
    public Long getGoodsCategoryId() {
        return this.GoodsCategoryId;
    }

    /**
     * Set 产品分类ID
     * @param GoodsCategoryId 产品分类ID
     */
    public void setGoodsCategoryId(Long GoodsCategoryId) {
        this.GoodsCategoryId = GoodsCategoryId;
    }

    /**
     * Get 产品详情 
     * @return ProductInfo 产品详情
     */
    public ProductInfo [] getProductInfo() {
        return this.ProductInfo;
    }

    /**
     * Set 产品详情
     * @param ProductInfo 产品详情
     */
    public void setProductInfo(ProductInfo [] ProductInfo) {
        this.ProductInfo = ProductInfo;
    }

    /**
     * Get 时长 
     * @return TimeSpan 时长
     */
    public Float getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 时长
     * @param TimeSpan 时长
     */
    public void setTimeSpan(Float TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 时间单位 
     * @return TimeUnit 时间单位
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 时间单位
     * @param TimeUnit 时间单位
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 货币单位 
     * @return Currency 货币单位
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set 货币单位
     * @param Currency 货币单位
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get 折扣率 
     * @return Policy 折扣率
     */
    public Float getPolicy() {
        return this.Policy;
    }

    /**
     * Set 折扣率
     * @param Policy 折扣率
     */
    public void setPolicy(Float Policy) {
        this.Policy = Policy;
    }

    /**
     * Get 单价（分） 
     * @return Price 单价（分）
     */
    public Float getPrice() {
        return this.Price;
    }

    /**
     * Set 单价（分）
     * @param Price 单价（分）
     */
    public void setPrice(Float Price) {
        this.Price = Price;
    }

    /**
     * Get 原价（分） 
     * @return TotalCost 原价（分）
     */
    public Float getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set 原价（分）
     * @param TotalCost 原价（分）
     */
    public void setTotalCost(Float TotalCost) {
        this.TotalCost = TotalCost;
    }

    /**
     * Get 产品编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductCode 产品编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set 产品编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductCode 产品编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get 子产品编码 
     * @return SubProductCode 子产品编码
     */
    public String getSubProductCode() {
        return this.SubProductCode;
    }

    /**
     * Set 子产品编码
     * @param SubProductCode 子产品编码
     */
    public void setSubProductCode(String SubProductCode) {
        this.SubProductCode = SubProductCode;
    }

    /**
     * Get 大订单号 
     * @return BigDealId 大订单号
     */
    public String getBigDealId() {
        return this.BigDealId;
    }

    /**
     * Set 大订单号
     * @param BigDealId 大订单号
     */
    public void setBigDealId(String BigDealId) {
        this.BigDealId = BigDealId;
    }

    /**
     * Get 退费公式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Formula 退费公式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFormula() {
        return this.Formula;
    }

    /**
     * Set 退费公式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Formula 退费公式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFormula(String Formula) {
        this.Formula = Formula;
    }

    /**
     * Get 退费涉及订单信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RefReturnDeals 退费涉及订单信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRefReturnDeals() {
        return this.RefReturnDeals;
    }

    /**
     * Set 退费涉及订单信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param RefReturnDeals 退费涉及订单信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRefReturnDeals(String RefReturnDeals) {
        this.RefReturnDeals = RefReturnDeals;
    }

    /**
     * Get 付费模式：prePay 预付费 postPay后付费 riPay预留实例 
     * @return PayMode 付费模式：prePay 预付费 postPay后付费 riPay预留实例
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式：prePay 预付费 postPay后付费 riPay预留实例
     * @param PayMode 付费模式：prePay 预付费 postPay后付费 riPay预留实例
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 交易类型
modifyNetworkMode 调整带宽模式
modifyNetworkSize 调整带宽大小
refund 退款
downgrade 降配
upgrade 升配
renew 续费
purchase 购买
preMoveOut 包年包月迁出资源
preMoveIn 包年包月迁入资源
preToPost 预付费转后付费
postMoveOut 按量计费迁出资源
postMoveIn 按量计费迁入资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Action 交易类型
modifyNetworkMode 调整带宽模式
modifyNetworkSize 调整带宽大小
refund 退款
downgrade 降配
upgrade 升配
renew 续费
purchase 购买
preMoveOut 包年包月迁出资源
preMoveIn 包年包月迁入资源
preToPost 预付费转后付费
postMoveOut 按量计费迁出资源
postMoveIn 按量计费迁入资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 交易类型
modifyNetworkMode 调整带宽模式
modifyNetworkSize 调整带宽大小
refund 退款
downgrade 降配
upgrade 升配
renew 续费
purchase 购买
preMoveOut 包年包月迁出资源
preMoveIn 包年包月迁入资源
preToPost 预付费转后付费
postMoveOut 按量计费迁出资源
postMoveIn 按量计费迁入资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param Action 交易类型
modifyNetworkMode 调整带宽模式
modifyNetworkSize 调整带宽大小
refund 退款
downgrade 降配
upgrade 升配
renew 续费
purchase 购买
preMoveOut 包年包月迁出资源
preMoveIn 包年包月迁入资源
preToPost 预付费转后付费
postMoveOut 按量计费迁出资源
postMoveIn 按量计费迁入资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 产品编码中文名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductName 产品编码中文名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品编码中文名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductName 产品编码中文名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 子产品编码中文名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubProductName 子产品编码中文名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubProductName() {
        return this.SubProductName;
    }

    /**
     * Set 子产品编码中文名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubProductName 子产品编码中文名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubProductName(String SubProductName) {
        this.SubProductName = SubProductName;
    }

    /**
     * Get 订单对应的资源id, 查询参数Limit超过200，将返回null
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceId 订单对应的资源id, 查询参数Limit超过200，将返回null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 订单对应的资源id, 查询参数Limit超过200，将返回null
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceId 订单对应的资源id, 查询参数Limit超过200，将返回null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceId(String [] ResourceId) {
        this.ResourceId = ResourceId;
    }

    public Deal() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Deal(Deal source) {
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Payer != null) {
            this.Payer = new String(source.Payer);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new Long(source.RealTotalCost);
        }
        if (source.VoucherDecline != null) {
            this.VoucherDecline = new Long(source.VoucherDecline);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.GoodsCategoryId != null) {
            this.GoodsCategoryId = new Long(source.GoodsCategoryId);
        }
        if (source.ProductInfo != null) {
            this.ProductInfo = new ProductInfo[source.ProductInfo.length];
            for (int i = 0; i < source.ProductInfo.length; i++) {
                this.ProductInfo[i] = new ProductInfo(source.ProductInfo[i]);
            }
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Float(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.Policy != null) {
            this.Policy = new Float(source.Policy);
        }
        if (source.Price != null) {
            this.Price = new Float(source.Price);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new Float(source.TotalCost);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.SubProductCode != null) {
            this.SubProductCode = new String(source.SubProductCode);
        }
        if (source.BigDealId != null) {
            this.BigDealId = new String(source.BigDealId);
        }
        if (source.Formula != null) {
            this.Formula = new String(source.Formula);
        }
        if (source.RefReturnDeals != null) {
            this.RefReturnDeals = new String(source.RefReturnDeals);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.SubProductName != null) {
            this.SubProductName = new String(source.SubProductName);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String[source.ResourceId.length];
            for (int i = 0; i < source.ResourceId.length; i++) {
                this.ResourceId[i] = new String(source.ResourceId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
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
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "SubProductCode", this.SubProductCode);
        this.setParamSimple(map, prefix + "BigDealId", this.BigDealId);
        this.setParamSimple(map, prefix + "Formula", this.Formula);
        this.setParamSimple(map, prefix + "RefReturnDeals", this.RefReturnDeals);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "SubProductName", this.SubProductName);
        this.setParamArraySimple(map, prefix + "ResourceId.", this.ResourceId);

    }
}

