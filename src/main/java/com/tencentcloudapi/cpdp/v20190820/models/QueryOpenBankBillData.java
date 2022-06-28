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

public class QueryOpenBankBillData extends AbstractModel{

    /**
    * 交易日期
    */
    @SerializedName("BillDate")
    @Expose
    private String BillDate;

    /**
    * 渠道编码
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * 二级渠道
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubChannel")
    @Expose
    private String SubChannel;

    /**
    * 系统父商户号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentMerchantId")
    @Expose
    private String ParentMerchantId;

    /**
    * 外部商户号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutMerchantId")
    @Expose
    private String OutMerchantId;

    /**
    * 系统商户号
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 第三方商户号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndMerchantId")
    @Expose
    private String EndMerchantId;

    /**
    * 外部订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutTradeNo")
    @Expose
    private String OutTradeNo;

    /**
    * 系统订单号
    */
    @SerializedName("TradeNo")
    @Expose
    private String TradeNo;

    /**
    * 第三方订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTradeNo")
    @Expose
    private String EndTradeNo;

    /**
    * 收付类型，PAYMENT:付款，INCOME:收款
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentType")
    @Expose
    private String PaymentType;

    /**
    * 业务类型，WITHDRAW:提现，PAY:支付，RECHARGE:充值，TRANSFER:转账，REFUND:退款
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessType")
    @Expose
    private String BusinessType;

    /**
    * 发起交易时间，格式yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("TradeTime")
    @Expose
    private String TradeTime;

    /**
    * 交易完成时间，格式yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * 交易状态，0:未知，1:成功，2:失败
    */
    @SerializedName("TradeStatus")
    @Expose
    private String TradeStatus;

    /**
    * 对账状态，1:成功，2:失败 3:长账 4:短账
    */
    @SerializedName("CheckStatus")
    @Expose
    private String CheckStatus;

    /**
    * 对账失败原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckFailReason")
    @Expose
    private String CheckFailReason;

    /**
    * 交易金额（元）
    */
    @SerializedName("OrderAmount")
    @Expose
    private String OrderAmount;

    /**
    * 服务费（元）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceFee")
    @Expose
    private String ServiceFee;

    /**
    * 收款人账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayeeAccount")
    @Expose
    private String PayeeAccount;

    /**
    * 收款人名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayeeName")
    @Expose
    private String PayeeName;

    /**
    * 付款人账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayerAccount")
    @Expose
    private String PayerAccount;

    /**
    * 付款人名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayerName")
    @Expose
    private String PayerName;

    /**
    * 支付信息描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 交易日期 
     * @return BillDate 交易日期
     */
    public String getBillDate() {
        return this.BillDate;
    }

    /**
     * Set 交易日期
     * @param BillDate 交易日期
     */
    public void setBillDate(String BillDate) {
        this.BillDate = BillDate;
    }

    /**
     * Get 渠道编码 
     * @return Channel 渠道编码
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 渠道编码
     * @param Channel 渠道编码
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get 二级渠道
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubChannel 二级渠道
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubChannel() {
        return this.SubChannel;
    }

    /**
     * Set 二级渠道
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubChannel 二级渠道
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubChannel(String SubChannel) {
        this.SubChannel = SubChannel;
    }

    /**
     * Get 系统父商户号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentMerchantId 系统父商户号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentMerchantId() {
        return this.ParentMerchantId;
    }

    /**
     * Set 系统父商户号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentMerchantId 系统父商户号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentMerchantId(String ParentMerchantId) {
        this.ParentMerchantId = ParentMerchantId;
    }

    /**
     * Get 外部商户号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutMerchantId 外部商户号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutMerchantId() {
        return this.OutMerchantId;
    }

    /**
     * Set 外部商户号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutMerchantId 外部商户号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutMerchantId(String OutMerchantId) {
        this.OutMerchantId = OutMerchantId;
    }

    /**
     * Get 系统商户号 
     * @return MerchantId 系统商户号
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set 系统商户号
     * @param MerchantId 系统商户号
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    /**
     * Get 第三方商户号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndMerchantId 第三方商户号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndMerchantId() {
        return this.EndMerchantId;
    }

    /**
     * Set 第三方商户号
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndMerchantId 第三方商户号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndMerchantId(String EndMerchantId) {
        this.EndMerchantId = EndMerchantId;
    }

    /**
     * Get 外部订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutTradeNo 外部订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutTradeNo() {
        return this.OutTradeNo;
    }

    /**
     * Set 外部订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutTradeNo 外部订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutTradeNo(String OutTradeNo) {
        this.OutTradeNo = OutTradeNo;
    }

    /**
     * Get 系统订单号 
     * @return TradeNo 系统订单号
     */
    public String getTradeNo() {
        return this.TradeNo;
    }

    /**
     * Set 系统订单号
     * @param TradeNo 系统订单号
     */
    public void setTradeNo(String TradeNo) {
        this.TradeNo = TradeNo;
    }

    /**
     * Get 第三方订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTradeNo 第三方订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTradeNo() {
        return this.EndTradeNo;
    }

    /**
     * Set 第三方订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTradeNo 第三方订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTradeNo(String EndTradeNo) {
        this.EndTradeNo = EndTradeNo;
    }

    /**
     * Get 收付类型，PAYMENT:付款，INCOME:收款
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentType 收付类型，PAYMENT:付款，INCOME:收款
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentType() {
        return this.PaymentType;
    }

    /**
     * Set 收付类型，PAYMENT:付款，INCOME:收款
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentType 收付类型，PAYMENT:付款，INCOME:收款
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentType(String PaymentType) {
        this.PaymentType = PaymentType;
    }

    /**
     * Get 业务类型，WITHDRAW:提现，PAY:支付，RECHARGE:充值，TRANSFER:转账，REFUND:退款
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessType 业务类型，WITHDRAW:提现，PAY:支付，RECHARGE:充值，TRANSFER:转账，REFUND:退款
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessType() {
        return this.BusinessType;
    }

    /**
     * Set 业务类型，WITHDRAW:提现，PAY:支付，RECHARGE:充值，TRANSFER:转账，REFUND:退款
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessType 业务类型，WITHDRAW:提现，PAY:支付，RECHARGE:充值，TRANSFER:转账，REFUND:退款
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessType(String BusinessType) {
        this.BusinessType = BusinessType;
    }

    /**
     * Get 发起交易时间，格式yyyy-MM-dd HH:mm:ss 
     * @return TradeTime 发起交易时间，格式yyyy-MM-dd HH:mm:ss
     */
    public String getTradeTime() {
        return this.TradeTime;
    }

    /**
     * Set 发起交易时间，格式yyyy-MM-dd HH:mm:ss
     * @param TradeTime 发起交易时间，格式yyyy-MM-dd HH:mm:ss
     */
    public void setTradeTime(String TradeTime) {
        this.TradeTime = TradeTime;
    }

    /**
     * Get 交易完成时间，格式yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FinishTime 交易完成时间，格式yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 交易完成时间，格式yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     * @param FinishTime 交易完成时间，格式yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get 交易状态，0:未知，1:成功，2:失败 
     * @return TradeStatus 交易状态，0:未知，1:成功，2:失败
     */
    public String getTradeStatus() {
        return this.TradeStatus;
    }

    /**
     * Set 交易状态，0:未知，1:成功，2:失败
     * @param TradeStatus 交易状态，0:未知，1:成功，2:失败
     */
    public void setTradeStatus(String TradeStatus) {
        this.TradeStatus = TradeStatus;
    }

    /**
     * Get 对账状态，1:成功，2:失败 3:长账 4:短账 
     * @return CheckStatus 对账状态，1:成功，2:失败 3:长账 4:短账
     */
    public String getCheckStatus() {
        return this.CheckStatus;
    }

    /**
     * Set 对账状态，1:成功，2:失败 3:长账 4:短账
     * @param CheckStatus 对账状态，1:成功，2:失败 3:长账 4:短账
     */
    public void setCheckStatus(String CheckStatus) {
        this.CheckStatus = CheckStatus;
    }

    /**
     * Get 对账失败原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckFailReason 对账失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCheckFailReason() {
        return this.CheckFailReason;
    }

    /**
     * Set 对账失败原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckFailReason 对账失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckFailReason(String CheckFailReason) {
        this.CheckFailReason = CheckFailReason;
    }

    /**
     * Get 交易金额（元） 
     * @return OrderAmount 交易金额（元）
     */
    public String getOrderAmount() {
        return this.OrderAmount;
    }

    /**
     * Set 交易金额（元）
     * @param OrderAmount 交易金额（元）
     */
    public void setOrderAmount(String OrderAmount) {
        this.OrderAmount = OrderAmount;
    }

    /**
     * Get 服务费（元）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceFee 服务费（元）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceFee() {
        return this.ServiceFee;
    }

    /**
     * Set 服务费（元）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceFee 服务费（元）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceFee(String ServiceFee) {
        this.ServiceFee = ServiceFee;
    }

    /**
     * Get 收款人账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayeeAccount 收款人账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayeeAccount() {
        return this.PayeeAccount;
    }

    /**
     * Set 收款人账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayeeAccount 收款人账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayeeAccount(String PayeeAccount) {
        this.PayeeAccount = PayeeAccount;
    }

    /**
     * Get 收款人名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayeeName 收款人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayeeName() {
        return this.PayeeName;
    }

    /**
     * Set 收款人名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayeeName 收款人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayeeName(String PayeeName) {
        this.PayeeName = PayeeName;
    }

    /**
     * Get 付款人账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayerAccount 付款人账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayerAccount() {
        return this.PayerAccount;
    }

    /**
     * Set 付款人账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayerAccount 付款人账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayerAccount(String PayerAccount) {
        this.PayerAccount = PayerAccount;
    }

    /**
     * Get 付款人名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayerName 付款人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayerName() {
        return this.PayerName;
    }

    /**
     * Set 付款人名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayerName 付款人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayerName(String PayerName) {
        this.PayerName = PayerName;
    }

    /**
     * Get 支付信息描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 支付信息描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 支付信息描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 支付信息描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public QueryOpenBankBillData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryOpenBankBillData(QueryOpenBankBillData source) {
        if (source.BillDate != null) {
            this.BillDate = new String(source.BillDate);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.SubChannel != null) {
            this.SubChannel = new String(source.SubChannel);
        }
        if (source.ParentMerchantId != null) {
            this.ParentMerchantId = new String(source.ParentMerchantId);
        }
        if (source.OutMerchantId != null) {
            this.OutMerchantId = new String(source.OutMerchantId);
        }
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.EndMerchantId != null) {
            this.EndMerchantId = new String(source.EndMerchantId);
        }
        if (source.OutTradeNo != null) {
            this.OutTradeNo = new String(source.OutTradeNo);
        }
        if (source.TradeNo != null) {
            this.TradeNo = new String(source.TradeNo);
        }
        if (source.EndTradeNo != null) {
            this.EndTradeNo = new String(source.EndTradeNo);
        }
        if (source.PaymentType != null) {
            this.PaymentType = new String(source.PaymentType);
        }
        if (source.BusinessType != null) {
            this.BusinessType = new String(source.BusinessType);
        }
        if (source.TradeTime != null) {
            this.TradeTime = new String(source.TradeTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.TradeStatus != null) {
            this.TradeStatus = new String(source.TradeStatus);
        }
        if (source.CheckStatus != null) {
            this.CheckStatus = new String(source.CheckStatus);
        }
        if (source.CheckFailReason != null) {
            this.CheckFailReason = new String(source.CheckFailReason);
        }
        if (source.OrderAmount != null) {
            this.OrderAmount = new String(source.OrderAmount);
        }
        if (source.ServiceFee != null) {
            this.ServiceFee = new String(source.ServiceFee);
        }
        if (source.PayeeAccount != null) {
            this.PayeeAccount = new String(source.PayeeAccount);
        }
        if (source.PayeeName != null) {
            this.PayeeName = new String(source.PayeeName);
        }
        if (source.PayerAccount != null) {
            this.PayerAccount = new String(source.PayerAccount);
        }
        if (source.PayerName != null) {
            this.PayerName = new String(source.PayerName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BillDate", this.BillDate);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "SubChannel", this.SubChannel);
        this.setParamSimple(map, prefix + "ParentMerchantId", this.ParentMerchantId);
        this.setParamSimple(map, prefix + "OutMerchantId", this.OutMerchantId);
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "EndMerchantId", this.EndMerchantId);
        this.setParamSimple(map, prefix + "OutTradeNo", this.OutTradeNo);
        this.setParamSimple(map, prefix + "TradeNo", this.TradeNo);
        this.setParamSimple(map, prefix + "EndTradeNo", this.EndTradeNo);
        this.setParamSimple(map, prefix + "PaymentType", this.PaymentType);
        this.setParamSimple(map, prefix + "BusinessType", this.BusinessType);
        this.setParamSimple(map, prefix + "TradeTime", this.TradeTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "TradeStatus", this.TradeStatus);
        this.setParamSimple(map, prefix + "CheckStatus", this.CheckStatus);
        this.setParamSimple(map, prefix + "CheckFailReason", this.CheckFailReason);
        this.setParamSimple(map, prefix + "OrderAmount", this.OrderAmount);
        this.setParamSimple(map, prefix + "ServiceFee", this.ServiceFee);
        this.setParamSimple(map, prefix + "PayeeAccount", this.PayeeAccount);
        this.setParamSimple(map, prefix + "PayeeName", this.PayeeName);
        this.setParamSimple(map, prefix + "PayerAccount", this.PayerAccount);
        this.setParamSimple(map, prefix + "PayerName", this.PayerName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

