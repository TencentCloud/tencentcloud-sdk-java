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
package com.tencentcloudapi.partners.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentDealNewElem extends AbstractModel {

    /**
    * 订单自增 ID【请勿依赖该字段作为唯一标识】
    */
    @SerializedName("DealId")
    @Expose
    private String DealId;

    /**
    * 订单号【订单唯一键】
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * 商品类型 ID
    */
    @SerializedName("GoodsCategoryId")
    @Expose
    private String GoodsCategoryId;

    /**
    * 订单所有者
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 订单所有者对应 appId
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 商品数量
    */
    @SerializedName("GoodsNum")
    @Expose
    private String GoodsNum;

    /**
    * 价格详情
    */
    @SerializedName("GoodsPrice")
    @Expose
    private DealGoodsPriceNewElem GoodsPrice;

    /**
    * 下单人
    */
    @SerializedName("Creater")
    @Expose
    private String Creater;

    /**
    * 下单时间
    */
    @SerializedName("CreatTime")
    @Expose
    private String CreatTime;

    /**
    * 支付结束时间
    */
    @SerializedName("PayEndTime")
    @Expose
    private String PayEndTime;

    /**
    * 扣费流水号
    */
    @SerializedName("BillId")
    @Expose
    private String BillId;

    /**
    * 支付人
    */
    @SerializedName("Payer")
    @Expose
    private String Payer;

    /**
    * 订单状态，中文描述
    */
    @SerializedName("DealStatus")
    @Expose
    private String DealStatus;

    /**
    * 订单的状态(1：未支付;2：已支付;3：发货中;4：已发货;5：发货失败;6：已退款;7：已关单;8：订单过期;9：订单已失效;10：产品已失效;11：代付拒绝;12：支付中)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 产品名称
    */
    @SerializedName("GoodsName")
    @Expose
    private String GoodsName;

    /**
    * 客户备注
    */
    @SerializedName("ClientRemark")
    @Expose
    private String ClientRemark;

    /**
    * 订单操作类型，"purchase":"新购","upgrade":"升配","upConvertExpire":"升配","downgrade":"降配","downConvertExpire":"降配","renew":"续费","refund":"退货","modifyNetworkMode":"调整带宽模式","modifyNetworkSize":"调整带宽大小","preMoveOut":"资源迁出","preMoveIn":"资源迁入","preToPost":"包年包月转按量","modify":"变配","postMoveOut":"资源迁出","postMoveIn":"资源迁入","recoverRefundForward":"调账补偿","recoverPayReserve":"调账补偿","recoverPayForward":"调账扣费","recoverRefundReserve":"调账扣费"
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * 代金券抵扣金额，单位分
    */
    @SerializedName("VoucherDecline")
    @Expose
    private String VoucherDecline;

    /**
    * 大订单号
    */
    @SerializedName("BigDealId")
    @Expose
    private String BigDealId;

    /**
    * 客户类型（new：自拓；old：官网；assign：指派；direct：直销；direct_newopp：直销(新商机)）
    */
    @SerializedName("ClientType")
    @Expose
    private String ClientType;

    /**
    * 项目类型（self：自拓；repeat：直销；platform：官网合作）
    */
    @SerializedName("ProjectType")
    @Expose
    private String ProjectType;

    /**
    * 业务员账号ID
    */
    @SerializedName("SalesUin")
    @Expose
    private String SalesUin;

    /**
    * 支付方式，0：自付；1：代付
    */
    @SerializedName("PayerMode")
    @Expose
    private String PayerMode;

    /**
    * 活动ID
    */
    @SerializedName("ActivityId")
    @Expose
    private String ActivityId;

    /**
    * 订单过期时间
    */
    @SerializedName("OverdueTime")
    @Expose
    private String OverdueTime;

    /**
    * 产品详情
    */
    @SerializedName("ProductInfo")
    @Expose
    private ProductInfoElem [] ProductInfo;

    /**
    * 付款方式
    */
    @SerializedName("PaymentMethod")
    @Expose
    private String PaymentMethod;

    /**
    * 订单更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 资源id
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * 退款单的原订单信息。当前仅 DescribeClientDealsByCache 接口会返回该字段
    */
    @SerializedName("RefundMap")
    @Expose
    private RefundMap [] RefundMap;

    /**
    * 子产品名称
    */
    @SerializedName("SubGoodsName")
    @Expose
    private String SubGoodsName;

    /**
     * Get 订单自增 ID【请勿依赖该字段作为唯一标识】 
     * @return DealId 订单自增 ID【请勿依赖该字段作为唯一标识】
     */
    public String getDealId() {
        return this.DealId;
    }

    /**
     * Set 订单自增 ID【请勿依赖该字段作为唯一标识】
     * @param DealId 订单自增 ID【请勿依赖该字段作为唯一标识】
     */
    public void setDealId(String DealId) {
        this.DealId = DealId;
    }

    /**
     * Get 订单号【订单唯一键】 
     * @return DealName 订单号【订单唯一键】
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set 订单号【订单唯一键】
     * @param DealName 订单号【订单唯一键】
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * Get 商品类型 ID 
     * @return GoodsCategoryId 商品类型 ID
     */
    public String getGoodsCategoryId() {
        return this.GoodsCategoryId;
    }

    /**
     * Set 商品类型 ID
     * @param GoodsCategoryId 商品类型 ID
     */
    public void setGoodsCategoryId(String GoodsCategoryId) {
        this.GoodsCategoryId = GoodsCategoryId;
    }

    /**
     * Get 订单所有者 
     * @return OwnerUin 订单所有者
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 订单所有者
     * @param OwnerUin 订单所有者
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 订单所有者对应 appId 
     * @return AppId 订单所有者对应 appId
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 订单所有者对应 appId
     * @param AppId 订单所有者对应 appId
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 商品数量 
     * @return GoodsNum 商品数量
     */
    public String getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 商品数量
     * @param GoodsNum 商品数量
     */
    public void setGoodsNum(String GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get 价格详情 
     * @return GoodsPrice 价格详情
     */
    public DealGoodsPriceNewElem getGoodsPrice() {
        return this.GoodsPrice;
    }

    /**
     * Set 价格详情
     * @param GoodsPrice 价格详情
     */
    public void setGoodsPrice(DealGoodsPriceNewElem GoodsPrice) {
        this.GoodsPrice = GoodsPrice;
    }

    /**
     * Get 下单人 
     * @return Creater 下单人
     */
    public String getCreater() {
        return this.Creater;
    }

    /**
     * Set 下单人
     * @param Creater 下单人
     */
    public void setCreater(String Creater) {
        this.Creater = Creater;
    }

    /**
     * Get 下单时间 
     * @return CreatTime 下单时间
     */
    public String getCreatTime() {
        return this.CreatTime;
    }

    /**
     * Set 下单时间
     * @param CreatTime 下单时间
     */
    public void setCreatTime(String CreatTime) {
        this.CreatTime = CreatTime;
    }

    /**
     * Get 支付结束时间 
     * @return PayEndTime 支付结束时间
     */
    public String getPayEndTime() {
        return this.PayEndTime;
    }

    /**
     * Set 支付结束时间
     * @param PayEndTime 支付结束时间
     */
    public void setPayEndTime(String PayEndTime) {
        this.PayEndTime = PayEndTime;
    }

    /**
     * Get 扣费流水号 
     * @return BillId 扣费流水号
     */
    public String getBillId() {
        return this.BillId;
    }

    /**
     * Set 扣费流水号
     * @param BillId 扣费流水号
     */
    public void setBillId(String BillId) {
        this.BillId = BillId;
    }

    /**
     * Get 支付人 
     * @return Payer 支付人
     */
    public String getPayer() {
        return this.Payer;
    }

    /**
     * Set 支付人
     * @param Payer 支付人
     */
    public void setPayer(String Payer) {
        this.Payer = Payer;
    }

    /**
     * Get 订单状态，中文描述 
     * @return DealStatus 订单状态，中文描述
     */
    public String getDealStatus() {
        return this.DealStatus;
    }

    /**
     * Set 订单状态，中文描述
     * @param DealStatus 订单状态，中文描述
     */
    public void setDealStatus(String DealStatus) {
        this.DealStatus = DealStatus;
    }

    /**
     * Get 订单的状态(1：未支付;2：已支付;3：发货中;4：已发货;5：发货失败;6：已退款;7：已关单;8：订单过期;9：订单已失效;10：产品已失效;11：代付拒绝;12：支付中) 
     * @return Status 订单的状态(1：未支付;2：已支付;3：发货中;4：已发货;5：发货失败;6：已退款;7：已关单;8：订单过期;9：订单已失效;10：产品已失效;11：代付拒绝;12：支付中)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 订单的状态(1：未支付;2：已支付;3：发货中;4：已发货;5：发货失败;6：已退款;7：已关单;8：订单过期;9：订单已失效;10：产品已失效;11：代付拒绝;12：支付中)
     * @param Status 订单的状态(1：未支付;2：已支付;3：发货中;4：已发货;5：发货失败;6：已退款;7：已关单;8：订单过期;9：订单已失效;10：产品已失效;11：代付拒绝;12：支付中)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 产品名称 
     * @return GoodsName 产品名称
     */
    public String getGoodsName() {
        return this.GoodsName;
    }

    /**
     * Set 产品名称
     * @param GoodsName 产品名称
     */
    public void setGoodsName(String GoodsName) {
        this.GoodsName = GoodsName;
    }

    /**
     * Get 客户备注 
     * @return ClientRemark 客户备注
     */
    public String getClientRemark() {
        return this.ClientRemark;
    }

    /**
     * Set 客户备注
     * @param ClientRemark 客户备注
     */
    public void setClientRemark(String ClientRemark) {
        this.ClientRemark = ClientRemark;
    }

    /**
     * Get 订单操作类型，"purchase":"新购","upgrade":"升配","upConvertExpire":"升配","downgrade":"降配","downConvertExpire":"降配","renew":"续费","refund":"退货","modifyNetworkMode":"调整带宽模式","modifyNetworkSize":"调整带宽大小","preMoveOut":"资源迁出","preMoveIn":"资源迁入","preToPost":"包年包月转按量","modify":"变配","postMoveOut":"资源迁出","postMoveIn":"资源迁入","recoverRefundForward":"调账补偿","recoverPayReserve":"调账补偿","recoverPayForward":"调账扣费","recoverRefundReserve":"调账扣费" 
     * @return ActionType 订单操作类型，"purchase":"新购","upgrade":"升配","upConvertExpire":"升配","downgrade":"降配","downConvertExpire":"降配","renew":"续费","refund":"退货","modifyNetworkMode":"调整带宽模式","modifyNetworkSize":"调整带宽大小","preMoveOut":"资源迁出","preMoveIn":"资源迁入","preToPost":"包年包月转按量","modify":"变配","postMoveOut":"资源迁出","postMoveIn":"资源迁入","recoverRefundForward":"调账补偿","recoverPayReserve":"调账补偿","recoverPayForward":"调账扣费","recoverRefundReserve":"调账扣费"
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set 订单操作类型，"purchase":"新购","upgrade":"升配","upConvertExpire":"升配","downgrade":"降配","downConvertExpire":"降配","renew":"续费","refund":"退货","modifyNetworkMode":"调整带宽模式","modifyNetworkSize":"调整带宽大小","preMoveOut":"资源迁出","preMoveIn":"资源迁入","preToPost":"包年包月转按量","modify":"变配","postMoveOut":"资源迁出","postMoveIn":"资源迁入","recoverRefundForward":"调账补偿","recoverPayReserve":"调账补偿","recoverPayForward":"调账扣费","recoverRefundReserve":"调账扣费"
     * @param ActionType 订单操作类型，"purchase":"新购","upgrade":"升配","upConvertExpire":"升配","downgrade":"降配","downConvertExpire":"降配","renew":"续费","refund":"退货","modifyNetworkMode":"调整带宽模式","modifyNetworkSize":"调整带宽大小","preMoveOut":"资源迁出","preMoveIn":"资源迁入","preToPost":"包年包月转按量","modify":"变配","postMoveOut":"资源迁出","postMoveIn":"资源迁入","recoverRefundForward":"调账补偿","recoverPayReserve":"调账补偿","recoverPayForward":"调账扣费","recoverRefundReserve":"调账扣费"
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get 代金券抵扣金额，单位分 
     * @return VoucherDecline 代金券抵扣金额，单位分
     */
    public String getVoucherDecline() {
        return this.VoucherDecline;
    }

    /**
     * Set 代金券抵扣金额，单位分
     * @param VoucherDecline 代金券抵扣金额，单位分
     */
    public void setVoucherDecline(String VoucherDecline) {
        this.VoucherDecline = VoucherDecline;
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
     * Get 客户类型（new：自拓；old：官网；assign：指派；direct：直销；direct_newopp：直销(新商机)） 
     * @return ClientType 客户类型（new：自拓；old：官网；assign：指派；direct：直销；direct_newopp：直销(新商机)）
     */
    public String getClientType() {
        return this.ClientType;
    }

    /**
     * Set 客户类型（new：自拓；old：官网；assign：指派；direct：直销；direct_newopp：直销(新商机)）
     * @param ClientType 客户类型（new：自拓；old：官网；assign：指派；direct：直销；direct_newopp：直销(新商机)）
     */
    public void setClientType(String ClientType) {
        this.ClientType = ClientType;
    }

    /**
     * Get 项目类型（self：自拓；repeat：直销；platform：官网合作） 
     * @return ProjectType 项目类型（self：自拓；repeat：直销；platform：官网合作）
     */
    public String getProjectType() {
        return this.ProjectType;
    }

    /**
     * Set 项目类型（self：自拓；repeat：直销；platform：官网合作）
     * @param ProjectType 项目类型（self：自拓；repeat：直销；platform：官网合作）
     */
    public void setProjectType(String ProjectType) {
        this.ProjectType = ProjectType;
    }

    /**
     * Get 业务员账号ID 
     * @return SalesUin 业务员账号ID
     */
    public String getSalesUin() {
        return this.SalesUin;
    }

    /**
     * Set 业务员账号ID
     * @param SalesUin 业务员账号ID
     */
    public void setSalesUin(String SalesUin) {
        this.SalesUin = SalesUin;
    }

    /**
     * Get 支付方式，0：自付；1：代付 
     * @return PayerMode 支付方式，0：自付；1：代付
     */
    public String getPayerMode() {
        return this.PayerMode;
    }

    /**
     * Set 支付方式，0：自付；1：代付
     * @param PayerMode 支付方式，0：自付；1：代付
     */
    public void setPayerMode(String PayerMode) {
        this.PayerMode = PayerMode;
    }

    /**
     * Get 活动ID 
     * @return ActivityId 活动ID
     */
    public String getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set 活动ID
     * @param ActivityId 活动ID
     */
    public void setActivityId(String ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Get 订单过期时间 
     * @return OverdueTime 订单过期时间
     */
    public String getOverdueTime() {
        return this.OverdueTime;
    }

    /**
     * Set 订单过期时间
     * @param OverdueTime 订单过期时间
     */
    public void setOverdueTime(String OverdueTime) {
        this.OverdueTime = OverdueTime;
    }

    /**
     * Get 产品详情 
     * @return ProductInfo 产品详情
     */
    public ProductInfoElem [] getProductInfo() {
        return this.ProductInfo;
    }

    /**
     * Set 产品详情
     * @param ProductInfo 产品详情
     */
    public void setProductInfo(ProductInfoElem [] ProductInfo) {
        this.ProductInfo = ProductInfo;
    }

    /**
     * Get 付款方式 
     * @return PaymentMethod 付款方式
     */
    public String getPaymentMethod() {
        return this.PaymentMethod;
    }

    /**
     * Set 付款方式
     * @param PaymentMethod 付款方式
     */
    public void setPaymentMethod(String PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

    /**
     * Get 订单更新时间 
     * @return UpdateTime 订单更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 订单更新时间
     * @param UpdateTime 订单更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 资源id 
     * @return ResourceIds 资源id
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set 资源id
     * @param ResourceIds 资源id
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get 退款单的原订单信息。当前仅 DescribeClientDealsByCache 接口会返回该字段 
     * @return RefundMap 退款单的原订单信息。当前仅 DescribeClientDealsByCache 接口会返回该字段
     */
    public RefundMap [] getRefundMap() {
        return this.RefundMap;
    }

    /**
     * Set 退款单的原订单信息。当前仅 DescribeClientDealsByCache 接口会返回该字段
     * @param RefundMap 退款单的原订单信息。当前仅 DescribeClientDealsByCache 接口会返回该字段
     */
    public void setRefundMap(RefundMap [] RefundMap) {
        this.RefundMap = RefundMap;
    }

    /**
     * Get 子产品名称 
     * @return SubGoodsName 子产品名称
     */
    public String getSubGoodsName() {
        return this.SubGoodsName;
    }

    /**
     * Set 子产品名称
     * @param SubGoodsName 子产品名称
     */
    public void setSubGoodsName(String SubGoodsName) {
        this.SubGoodsName = SubGoodsName;
    }

    public AgentDealNewElem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentDealNewElem(AgentDealNewElem source) {
        if (source.DealId != null) {
            this.DealId = new String(source.DealId);
        }
        if (source.DealName != null) {
            this.DealName = new String(source.DealName);
        }
        if (source.GoodsCategoryId != null) {
            this.GoodsCategoryId = new String(source.GoodsCategoryId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new String(source.GoodsNum);
        }
        if (source.GoodsPrice != null) {
            this.GoodsPrice = new DealGoodsPriceNewElem(source.GoodsPrice);
        }
        if (source.Creater != null) {
            this.Creater = new String(source.Creater);
        }
        if (source.CreatTime != null) {
            this.CreatTime = new String(source.CreatTime);
        }
        if (source.PayEndTime != null) {
            this.PayEndTime = new String(source.PayEndTime);
        }
        if (source.BillId != null) {
            this.BillId = new String(source.BillId);
        }
        if (source.Payer != null) {
            this.Payer = new String(source.Payer);
        }
        if (source.DealStatus != null) {
            this.DealStatus = new String(source.DealStatus);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.GoodsName != null) {
            this.GoodsName = new String(source.GoodsName);
        }
        if (source.ClientRemark != null) {
            this.ClientRemark = new String(source.ClientRemark);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.VoucherDecline != null) {
            this.VoucherDecline = new String(source.VoucherDecline);
        }
        if (source.BigDealId != null) {
            this.BigDealId = new String(source.BigDealId);
        }
        if (source.ClientType != null) {
            this.ClientType = new String(source.ClientType);
        }
        if (source.ProjectType != null) {
            this.ProjectType = new String(source.ProjectType);
        }
        if (source.SalesUin != null) {
            this.SalesUin = new String(source.SalesUin);
        }
        if (source.PayerMode != null) {
            this.PayerMode = new String(source.PayerMode);
        }
        if (source.ActivityId != null) {
            this.ActivityId = new String(source.ActivityId);
        }
        if (source.OverdueTime != null) {
            this.OverdueTime = new String(source.OverdueTime);
        }
        if (source.ProductInfo != null) {
            this.ProductInfo = new ProductInfoElem[source.ProductInfo.length];
            for (int i = 0; i < source.ProductInfo.length; i++) {
                this.ProductInfo[i] = new ProductInfoElem(source.ProductInfo[i]);
            }
        }
        if (source.PaymentMethod != null) {
            this.PaymentMethod = new String(source.PaymentMethod);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
        if (source.RefundMap != null) {
            this.RefundMap = new RefundMap[source.RefundMap.length];
            for (int i = 0; i < source.RefundMap.length; i++) {
                this.RefundMap[i] = new RefundMap(source.RefundMap[i]);
            }
        }
        if (source.SubGoodsName != null) {
            this.SubGoodsName = new String(source.SubGoodsName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DealId", this.DealId);
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamSimple(map, prefix + "GoodsCategoryId", this.GoodsCategoryId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamObj(map, prefix + "GoodsPrice.", this.GoodsPrice);
        this.setParamSimple(map, prefix + "Creater", this.Creater);
        this.setParamSimple(map, prefix + "CreatTime", this.CreatTime);
        this.setParamSimple(map, prefix + "PayEndTime", this.PayEndTime);
        this.setParamSimple(map, prefix + "BillId", this.BillId);
        this.setParamSimple(map, prefix + "Payer", this.Payer);
        this.setParamSimple(map, prefix + "DealStatus", this.DealStatus);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "GoodsName", this.GoodsName);
        this.setParamSimple(map, prefix + "ClientRemark", this.ClientRemark);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "VoucherDecline", this.VoucherDecline);
        this.setParamSimple(map, prefix + "BigDealId", this.BigDealId);
        this.setParamSimple(map, prefix + "ClientType", this.ClientType);
        this.setParamSimple(map, prefix + "ProjectType", this.ProjectType);
        this.setParamSimple(map, prefix + "SalesUin", this.SalesUin);
        this.setParamSimple(map, prefix + "PayerMode", this.PayerMode);
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);
        this.setParamSimple(map, prefix + "OverdueTime", this.OverdueTime);
        this.setParamArrayObj(map, prefix + "ProductInfo.", this.ProductInfo);
        this.setParamSimple(map, prefix + "PaymentMethod", this.PaymentMethod);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamArrayObj(map, prefix + "RefundMap.", this.RefundMap);
        this.setParamSimple(map, prefix + "SubGoodsName", this.SubGoodsName);

    }
}

