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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudOrderReturn extends AbstractModel{

    /**
    * 米大师分配的支付主MidasAppId
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 开发者支付订单号
    */
    @SerializedName("OutTradeNo")
    @Expose
    private String OutTradeNo;

    /**
    * 调用下单接口传进来的子单列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubOrderList")
    @Expose
    private CloudSubOrderReturn [] SubOrderList;

    /**
    * 调用下单接口获取的米大师交易订单号
    */
    @SerializedName("TransactionId")
    @Expose
    private String TransactionId;

    /**
    * 用户Id
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 支付渠道
wechat:微信支付
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * 物品Id
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 发货标识，由开发者在调用下单接口的时候传入
    */
    @SerializedName("Metadata")
    @Expose
    private String Metadata;

    /**
    * ISO货币代码
    */
    @SerializedName("CurrencyType")
    @Expose
    private String CurrencyType;

    /**
    * 支付金额，单位：分
    */
    @SerializedName("Amt")
    @Expose
    private Long Amt;

    /**
    * 订单状态
0:初始状态，获取米大师交易订单成功
1:拉起米大师支付页面成功，用户未支付
2:用户支付成功，正在发货
3:用户支付成功，发货失败
4:用户支付成功，发货成功
5:关单中
6:已关单
    */
    @SerializedName("OrderState")
    @Expose
    private String OrderState;

    /**
    * 下单时间，unix时间戳
    */
    @SerializedName("OrderTime")
    @Expose
    private String OrderTime;

    /**
    * 支付时间，unix时间戳
    */
    @SerializedName("PayTime")
    @Expose
    private String PayTime;

    /**
    * 支付回调时间，unix时间戳
    */
    @SerializedName("CallBackTime")
    @Expose
    private String CallBackTime;

    /**
    * 支付机构订单号
    */
    @SerializedName("ChannelExternalOrderId")
    @Expose
    private String ChannelExternalOrderId;

    /**
    * 米大师内部渠道订单号
    */
    @SerializedName("ChannelOrderId")
    @Expose
    private String ChannelOrderId;

    /**
    * 是否曾退款
    */
    @SerializedName("RefundFlag")
    @Expose
    private String RefundFlag;

    /**
    * 用户支付金额
    */
    @SerializedName("CashAmt")
    @Expose
    private String CashAmt;

    /**
    * 抵扣券金额
    */
    @SerializedName("CouponAmt")
    @Expose
    private String CouponAmt;

    /**
    * 商品名称
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 结算信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SettleInfo")
    @Expose
    private CloudSettleInfo SettleInfo;

    /**
    * 附加项信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttachmentInfoList")
    @Expose
    private CloudAttachmentInfo [] AttachmentInfoList;

    /**
    * 渠道方返回的用户信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelExternalUserInfoList")
    @Expose
    private CloudChannelExternalUserInfo [] ChannelExternalUserInfoList;

    /**
    * 渠道扩展促销列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalReturnPromptGroupList")
    @Expose
    private CloudExternalPromptGroup [] ExternalReturnPromptGroupList;

    /**
    * 场景扩展信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SceneInfo")
    @Expose
    private String SceneInfo;

    /**
     * Get 米大师分配的支付主MidasAppId 
     * @return AppId 米大师分配的支付主MidasAppId
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 米大师分配的支付主MidasAppId
     * @param AppId 米大师分配的支付主MidasAppId
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 开发者支付订单号 
     * @return OutTradeNo 开发者支付订单号
     */
    public String getOutTradeNo() {
        return this.OutTradeNo;
    }

    /**
     * Set 开发者支付订单号
     * @param OutTradeNo 开发者支付订单号
     */
    public void setOutTradeNo(String OutTradeNo) {
        this.OutTradeNo = OutTradeNo;
    }

    /**
     * Get 调用下单接口传进来的子单列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubOrderList 调用下单接口传进来的子单列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CloudSubOrderReturn [] getSubOrderList() {
        return this.SubOrderList;
    }

    /**
     * Set 调用下单接口传进来的子单列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubOrderList 调用下单接口传进来的子单列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubOrderList(CloudSubOrderReturn [] SubOrderList) {
        this.SubOrderList = SubOrderList;
    }

    /**
     * Get 调用下单接口获取的米大师交易订单号 
     * @return TransactionId 调用下单接口获取的米大师交易订单号
     */
    public String getTransactionId() {
        return this.TransactionId;
    }

    /**
     * Set 调用下单接口获取的米大师交易订单号
     * @param TransactionId 调用下单接口获取的米大师交易订单号
     */
    public void setTransactionId(String TransactionId) {
        this.TransactionId = TransactionId;
    }

    /**
     * Get 用户Id 
     * @return UserId 用户Id
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户Id
     * @param UserId 用户Id
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 支付渠道
wechat:微信支付 
     * @return Channel 支付渠道
wechat:微信支付
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 支付渠道
wechat:微信支付
     * @param Channel 支付渠道
wechat:微信支付
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get 物品Id 
     * @return ProductId 物品Id
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 物品Id
     * @param ProductId 物品Id
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 发货标识，由开发者在调用下单接口的时候传入 
     * @return Metadata 发货标识，由开发者在调用下单接口的时候传入
     */
    public String getMetadata() {
        return this.Metadata;
    }

    /**
     * Set 发货标识，由开发者在调用下单接口的时候传入
     * @param Metadata 发货标识，由开发者在调用下单接口的时候传入
     */
    public void setMetadata(String Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get ISO货币代码 
     * @return CurrencyType ISO货币代码
     */
    public String getCurrencyType() {
        return this.CurrencyType;
    }

    /**
     * Set ISO货币代码
     * @param CurrencyType ISO货币代码
     */
    public void setCurrencyType(String CurrencyType) {
        this.CurrencyType = CurrencyType;
    }

    /**
     * Get 支付金额，单位：分 
     * @return Amt 支付金额，单位：分
     */
    public Long getAmt() {
        return this.Amt;
    }

    /**
     * Set 支付金额，单位：分
     * @param Amt 支付金额，单位：分
     */
    public void setAmt(Long Amt) {
        this.Amt = Amt;
    }

    /**
     * Get 订单状态
0:初始状态，获取米大师交易订单成功
1:拉起米大师支付页面成功，用户未支付
2:用户支付成功，正在发货
3:用户支付成功，发货失败
4:用户支付成功，发货成功
5:关单中
6:已关单 
     * @return OrderState 订单状态
0:初始状态，获取米大师交易订单成功
1:拉起米大师支付页面成功，用户未支付
2:用户支付成功，正在发货
3:用户支付成功，发货失败
4:用户支付成功，发货成功
5:关单中
6:已关单
     */
    public String getOrderState() {
        return this.OrderState;
    }

    /**
     * Set 订单状态
0:初始状态，获取米大师交易订单成功
1:拉起米大师支付页面成功，用户未支付
2:用户支付成功，正在发货
3:用户支付成功，发货失败
4:用户支付成功，发货成功
5:关单中
6:已关单
     * @param OrderState 订单状态
0:初始状态，获取米大师交易订单成功
1:拉起米大师支付页面成功，用户未支付
2:用户支付成功，正在发货
3:用户支付成功，发货失败
4:用户支付成功，发货成功
5:关单中
6:已关单
     */
    public void setOrderState(String OrderState) {
        this.OrderState = OrderState;
    }

    /**
     * Get 下单时间，unix时间戳 
     * @return OrderTime 下单时间，unix时间戳
     */
    public String getOrderTime() {
        return this.OrderTime;
    }

    /**
     * Set 下单时间，unix时间戳
     * @param OrderTime 下单时间，unix时间戳
     */
    public void setOrderTime(String OrderTime) {
        this.OrderTime = OrderTime;
    }

    /**
     * Get 支付时间，unix时间戳 
     * @return PayTime 支付时间，unix时间戳
     */
    public String getPayTime() {
        return this.PayTime;
    }

    /**
     * Set 支付时间，unix时间戳
     * @param PayTime 支付时间，unix时间戳
     */
    public void setPayTime(String PayTime) {
        this.PayTime = PayTime;
    }

    /**
     * Get 支付回调时间，unix时间戳 
     * @return CallBackTime 支付回调时间，unix时间戳
     */
    public String getCallBackTime() {
        return this.CallBackTime;
    }

    /**
     * Set 支付回调时间，unix时间戳
     * @param CallBackTime 支付回调时间，unix时间戳
     */
    public void setCallBackTime(String CallBackTime) {
        this.CallBackTime = CallBackTime;
    }

    /**
     * Get 支付机构订单号 
     * @return ChannelExternalOrderId 支付机构订单号
     */
    public String getChannelExternalOrderId() {
        return this.ChannelExternalOrderId;
    }

    /**
     * Set 支付机构订单号
     * @param ChannelExternalOrderId 支付机构订单号
     */
    public void setChannelExternalOrderId(String ChannelExternalOrderId) {
        this.ChannelExternalOrderId = ChannelExternalOrderId;
    }

    /**
     * Get 米大师内部渠道订单号 
     * @return ChannelOrderId 米大师内部渠道订单号
     */
    public String getChannelOrderId() {
        return this.ChannelOrderId;
    }

    /**
     * Set 米大师内部渠道订单号
     * @param ChannelOrderId 米大师内部渠道订单号
     */
    public void setChannelOrderId(String ChannelOrderId) {
        this.ChannelOrderId = ChannelOrderId;
    }

    /**
     * Get 是否曾退款 
     * @return RefundFlag 是否曾退款
     */
    public String getRefundFlag() {
        return this.RefundFlag;
    }

    /**
     * Set 是否曾退款
     * @param RefundFlag 是否曾退款
     */
    public void setRefundFlag(String RefundFlag) {
        this.RefundFlag = RefundFlag;
    }

    /**
     * Get 用户支付金额 
     * @return CashAmt 用户支付金额
     */
    public String getCashAmt() {
        return this.CashAmt;
    }

    /**
     * Set 用户支付金额
     * @param CashAmt 用户支付金额
     */
    public void setCashAmt(String CashAmt) {
        this.CashAmt = CashAmt;
    }

    /**
     * Get 抵扣券金额 
     * @return CouponAmt 抵扣券金额
     */
    public String getCouponAmt() {
        return this.CouponAmt;
    }

    /**
     * Set 抵扣券金额
     * @param CouponAmt 抵扣券金额
     */
    public void setCouponAmt(String CouponAmt) {
        this.CouponAmt = CouponAmt;
    }

    /**
     * Get 商品名称 
     * @return ProductName 商品名称
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 商品名称
     * @param ProductName 商品名称
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 结算信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SettleInfo 结算信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CloudSettleInfo getSettleInfo() {
        return this.SettleInfo;
    }

    /**
     * Set 结算信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SettleInfo 结算信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSettleInfo(CloudSettleInfo SettleInfo) {
        this.SettleInfo = SettleInfo;
    }

    /**
     * Get 附加项信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttachmentInfoList 附加项信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CloudAttachmentInfo [] getAttachmentInfoList() {
        return this.AttachmentInfoList;
    }

    /**
     * Set 附加项信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttachmentInfoList 附加项信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttachmentInfoList(CloudAttachmentInfo [] AttachmentInfoList) {
        this.AttachmentInfoList = AttachmentInfoList;
    }

    /**
     * Get 渠道方返回的用户信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelExternalUserInfoList 渠道方返回的用户信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CloudChannelExternalUserInfo [] getChannelExternalUserInfoList() {
        return this.ChannelExternalUserInfoList;
    }

    /**
     * Set 渠道方返回的用户信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelExternalUserInfoList 渠道方返回的用户信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelExternalUserInfoList(CloudChannelExternalUserInfo [] ChannelExternalUserInfoList) {
        this.ChannelExternalUserInfoList = ChannelExternalUserInfoList;
    }

    /**
     * Get 渠道扩展促销列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalReturnPromptGroupList 渠道扩展促销列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CloudExternalPromptGroup [] getExternalReturnPromptGroupList() {
        return this.ExternalReturnPromptGroupList;
    }

    /**
     * Set 渠道扩展促销列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalReturnPromptGroupList 渠道扩展促销列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalReturnPromptGroupList(CloudExternalPromptGroup [] ExternalReturnPromptGroupList) {
        this.ExternalReturnPromptGroupList = ExternalReturnPromptGroupList;
    }

    /**
     * Get 场景扩展信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SceneInfo 场景扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSceneInfo() {
        return this.SceneInfo;
    }

    /**
     * Set 场景扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SceneInfo 场景扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSceneInfo(String SceneInfo) {
        this.SceneInfo = SceneInfo;
    }

    public CloudOrderReturn() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudOrderReturn(CloudOrderReturn source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.OutTradeNo != null) {
            this.OutTradeNo = new String(source.OutTradeNo);
        }
        if (source.SubOrderList != null) {
            this.SubOrderList = new CloudSubOrderReturn[source.SubOrderList.length];
            for (int i = 0; i < source.SubOrderList.length; i++) {
                this.SubOrderList[i] = new CloudSubOrderReturn(source.SubOrderList[i]);
            }
        }
        if (source.TransactionId != null) {
            this.TransactionId = new String(source.TransactionId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.Metadata != null) {
            this.Metadata = new String(source.Metadata);
        }
        if (source.CurrencyType != null) {
            this.CurrencyType = new String(source.CurrencyType);
        }
        if (source.Amt != null) {
            this.Amt = new Long(source.Amt);
        }
        if (source.OrderState != null) {
            this.OrderState = new String(source.OrderState);
        }
        if (source.OrderTime != null) {
            this.OrderTime = new String(source.OrderTime);
        }
        if (source.PayTime != null) {
            this.PayTime = new String(source.PayTime);
        }
        if (source.CallBackTime != null) {
            this.CallBackTime = new String(source.CallBackTime);
        }
        if (source.ChannelExternalOrderId != null) {
            this.ChannelExternalOrderId = new String(source.ChannelExternalOrderId);
        }
        if (source.ChannelOrderId != null) {
            this.ChannelOrderId = new String(source.ChannelOrderId);
        }
        if (source.RefundFlag != null) {
            this.RefundFlag = new String(source.RefundFlag);
        }
        if (source.CashAmt != null) {
            this.CashAmt = new String(source.CashAmt);
        }
        if (source.CouponAmt != null) {
            this.CouponAmt = new String(source.CouponAmt);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.SettleInfo != null) {
            this.SettleInfo = new CloudSettleInfo(source.SettleInfo);
        }
        if (source.AttachmentInfoList != null) {
            this.AttachmentInfoList = new CloudAttachmentInfo[source.AttachmentInfoList.length];
            for (int i = 0; i < source.AttachmentInfoList.length; i++) {
                this.AttachmentInfoList[i] = new CloudAttachmentInfo(source.AttachmentInfoList[i]);
            }
        }
        if (source.ChannelExternalUserInfoList != null) {
            this.ChannelExternalUserInfoList = new CloudChannelExternalUserInfo[source.ChannelExternalUserInfoList.length];
            for (int i = 0; i < source.ChannelExternalUserInfoList.length; i++) {
                this.ChannelExternalUserInfoList[i] = new CloudChannelExternalUserInfo(source.ChannelExternalUserInfoList[i]);
            }
        }
        if (source.ExternalReturnPromptGroupList != null) {
            this.ExternalReturnPromptGroupList = new CloudExternalPromptGroup[source.ExternalReturnPromptGroupList.length];
            for (int i = 0; i < source.ExternalReturnPromptGroupList.length; i++) {
                this.ExternalReturnPromptGroupList[i] = new CloudExternalPromptGroup(source.ExternalReturnPromptGroupList[i]);
            }
        }
        if (source.SceneInfo != null) {
            this.SceneInfo = new String(source.SceneInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "OutTradeNo", this.OutTradeNo);
        this.setParamArrayObj(map, prefix + "SubOrderList.", this.SubOrderList);
        this.setParamSimple(map, prefix + "TransactionId", this.TransactionId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "Metadata", this.Metadata);
        this.setParamSimple(map, prefix + "CurrencyType", this.CurrencyType);
        this.setParamSimple(map, prefix + "Amt", this.Amt);
        this.setParamSimple(map, prefix + "OrderState", this.OrderState);
        this.setParamSimple(map, prefix + "OrderTime", this.OrderTime);
        this.setParamSimple(map, prefix + "PayTime", this.PayTime);
        this.setParamSimple(map, prefix + "CallBackTime", this.CallBackTime);
        this.setParamSimple(map, prefix + "ChannelExternalOrderId", this.ChannelExternalOrderId);
        this.setParamSimple(map, prefix + "ChannelOrderId", this.ChannelOrderId);
        this.setParamSimple(map, prefix + "RefundFlag", this.RefundFlag);
        this.setParamSimple(map, prefix + "CashAmt", this.CashAmt);
        this.setParamSimple(map, prefix + "CouponAmt", this.CouponAmt);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamObj(map, prefix + "SettleInfo.", this.SettleInfo);
        this.setParamArrayObj(map, prefix + "AttachmentInfoList.", this.AttachmentInfoList);
        this.setParamArrayObj(map, prefix + "ChannelExternalUserInfoList.", this.ChannelExternalUserInfoList);
        this.setParamArrayObj(map, prefix + "ExternalReturnPromptGroupList.", this.ExternalReturnPromptGroupList);
        this.setParamSimple(map, prefix + "SceneInfo", this.SceneInfo);

    }
}

