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
package com.tencentcloudapi.market.v20191010.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WeChatOrderInfo extends AbstractModel{

    /**
    * 企业微信订单号
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 订单状态。0-未⽀支付，1-已⽀支付，2-已关闭， 3-未⽀支付且已过期， 4-申请退款中， 5-申请退款成功， 6-退款被拒绝
    */
    @SerializedName("OrderStatus")
    @Expose
    private Long OrderStatus;

    /**
    * 订单类型。0-普通订单，1-扩容订单，2-续期，3-版本变更更
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * 应⽤id
    */
    @SerializedName("SuiteId")
    @Expose
    private String SuiteId;

    /**
    * 购买版本ID
    */
    @SerializedName("EditionId")
    @Expose
    private String EditionId;

    /**
    * 购买版本名称
    */
    @SerializedName("EditionName")
    @Expose
    private String EditionName;

    /**
    * 实付款金额，单位分
    */
    @SerializedName("Price")
    @Expose
    private Long Price;

    /**
    * 下单时间
    */
    @SerializedName("OrderTime")
    @Expose
    private Long OrderTime;

    /**
    * 付款时间
    */
    @SerializedName("PaidTime")
    @Expose
    private Long PaidTime;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 资源使用开始时间
    */
    @SerializedName("UseBeginTime")
    @Expose
    private Long UseBeginTime;

    /**
    * 资源使用结束时间
    */
    @SerializedName("UseEndTime")
    @Expose
    private Long UseEndTime;

    /**
    * 磐石详细的四层订单
    */
    @SerializedName("Deals")
    @Expose
    private OfflineProductDeal Deals;

    /**
     * Get 企业微信订单号 
     * @return OrderId 企业微信订单号
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 企业微信订单号
     * @param OrderId 企业微信订单号
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 订单状态。0-未⽀支付，1-已⽀支付，2-已关闭， 3-未⽀支付且已过期， 4-申请退款中， 5-申请退款成功， 6-退款被拒绝 
     * @return OrderStatus 订单状态。0-未⽀支付，1-已⽀支付，2-已关闭， 3-未⽀支付且已过期， 4-申请退款中， 5-申请退款成功， 6-退款被拒绝
     */
    public Long getOrderStatus() {
        return this.OrderStatus;
    }

    /**
     * Set 订单状态。0-未⽀支付，1-已⽀支付，2-已关闭， 3-未⽀支付且已过期， 4-申请退款中， 5-申请退款成功， 6-退款被拒绝
     * @param OrderStatus 订单状态。0-未⽀支付，1-已⽀支付，2-已关闭， 3-未⽀支付且已过期， 4-申请退款中， 5-申请退款成功， 6-退款被拒绝
     */
    public void setOrderStatus(Long OrderStatus) {
        this.OrderStatus = OrderStatus;
    }

    /**
     * Get 订单类型。0-普通订单，1-扩容订单，2-续期，3-版本变更更 
     * @return OrderType 订单类型。0-普通订单，1-扩容订单，2-续期，3-版本变更更
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 订单类型。0-普通订单，1-扩容订单，2-续期，3-版本变更更
     * @param OrderType 订单类型。0-普通订单，1-扩容订单，2-续期，3-版本变更更
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 应⽤id 
     * @return SuiteId 应⽤id
     */
    public String getSuiteId() {
        return this.SuiteId;
    }

    /**
     * Set 应⽤id
     * @param SuiteId 应⽤id
     */
    public void setSuiteId(String SuiteId) {
        this.SuiteId = SuiteId;
    }

    /**
     * Get 购买版本ID 
     * @return EditionId 购买版本ID
     */
    public String getEditionId() {
        return this.EditionId;
    }

    /**
     * Set 购买版本ID
     * @param EditionId 购买版本ID
     */
    public void setEditionId(String EditionId) {
        this.EditionId = EditionId;
    }

    /**
     * Get 购买版本名称 
     * @return EditionName 购买版本名称
     */
    public String getEditionName() {
        return this.EditionName;
    }

    /**
     * Set 购买版本名称
     * @param EditionName 购买版本名称
     */
    public void setEditionName(String EditionName) {
        this.EditionName = EditionName;
    }

    /**
     * Get 实付款金额，单位分 
     * @return Price 实付款金额，单位分
     */
    public Long getPrice() {
        return this.Price;
    }

    /**
     * Set 实付款金额，单位分
     * @param Price 实付款金额，单位分
     */
    public void setPrice(Long Price) {
        this.Price = Price;
    }

    /**
     * Get 下单时间 
     * @return OrderTime 下单时间
     */
    public Long getOrderTime() {
        return this.OrderTime;
    }

    /**
     * Set 下单时间
     * @param OrderTime 下单时间
     */
    public void setOrderTime(Long OrderTime) {
        this.OrderTime = OrderTime;
    }

    /**
     * Get 付款时间 
     * @return PaidTime 付款时间
     */
    public Long getPaidTime() {
        return this.PaidTime;
    }

    /**
     * Set 付款时间
     * @param PaidTime 付款时间
     */
    public void setPaidTime(Long PaidTime) {
        this.PaidTime = PaidTime;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 资源使用开始时间 
     * @return UseBeginTime 资源使用开始时间
     */
    public Long getUseBeginTime() {
        return this.UseBeginTime;
    }

    /**
     * Set 资源使用开始时间
     * @param UseBeginTime 资源使用开始时间
     */
    public void setUseBeginTime(Long UseBeginTime) {
        this.UseBeginTime = UseBeginTime;
    }

    /**
     * Get 资源使用结束时间 
     * @return UseEndTime 资源使用结束时间
     */
    public Long getUseEndTime() {
        return this.UseEndTime;
    }

    /**
     * Set 资源使用结束时间
     * @param UseEndTime 资源使用结束时间
     */
    public void setUseEndTime(Long UseEndTime) {
        this.UseEndTime = UseEndTime;
    }

    /**
     * Get 磐石详细的四层订单 
     * @return Deals 磐石详细的四层订单
     */
    public OfflineProductDeal getDeals() {
        return this.Deals;
    }

    /**
     * Set 磐石详细的四层订单
     * @param Deals 磐石详细的四层订单
     */
    public void setDeals(OfflineProductDeal Deals) {
        this.Deals = Deals;
    }

    public WeChatOrderInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WeChatOrderInfo(WeChatOrderInfo source) {
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.OrderStatus != null) {
            this.OrderStatus = new Long(source.OrderStatus);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.SuiteId != null) {
            this.SuiteId = new String(source.SuiteId);
        }
        if (source.EditionId != null) {
            this.EditionId = new String(source.EditionId);
        }
        if (source.EditionName != null) {
            this.EditionName = new String(source.EditionName);
        }
        if (source.Price != null) {
            this.Price = new Long(source.Price);
        }
        if (source.OrderTime != null) {
            this.OrderTime = new Long(source.OrderTime);
        }
        if (source.PaidTime != null) {
            this.PaidTime = new Long(source.PaidTime);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.UseBeginTime != null) {
            this.UseBeginTime = new Long(source.UseBeginTime);
        }
        if (source.UseEndTime != null) {
            this.UseEndTime = new Long(source.UseEndTime);
        }
        if (source.Deals != null) {
            this.Deals = new OfflineProductDeal(source.Deals);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "OrderStatus", this.OrderStatus);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "SuiteId", this.SuiteId);
        this.setParamSimple(map, prefix + "EditionId", this.EditionId);
        this.setParamSimple(map, prefix + "EditionName", this.EditionName);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "OrderTime", this.OrderTime);
        this.setParamSimple(map, prefix + "PaidTime", this.PaidTime);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "UseBeginTime", this.UseBeginTime);
        this.setParamSimple(map, prefix + "UseEndTime", this.UseEndTime);
        this.setParamObj(map, prefix + "Deals.", this.Deals);

    }
}

