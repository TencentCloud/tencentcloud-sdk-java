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

public class QueryOpenBankPaymentOrderResult extends AbstractModel{

    /**
    * 渠道商户号。外部接入平台入驻云企付平台下发
    */
    @SerializedName("ChannelMerchantId")
    @Expose
    private String ChannelMerchantId;

    /**
    * 外部商户订单号
    */
    @SerializedName("OutOrderId")
    @Expose
    private String OutOrderId;

    /**
    * 云企付平台订单号
    */
    @SerializedName("ChannelOrderId")
    @Expose
    private String ChannelOrderId;

    /**
    * 第三方支付平台订单号
    */
    @SerializedName("ThirdPayOrderId")
    @Expose
    private String ThirdPayOrderId;

    /**
    * INIT：初始化
PAYING：支付中
DEDUCTED：扣款成功
ACCEPTED：支付受理成功
SUCCESS：支付成功
CLOSED：关单
PAY_FAIL：支付失败
REVOKE：退票
    */
    @SerializedName("OrderStatus")
    @Expose
    private String OrderStatus;

    /**
    * 支付渠道名称，如TENPAY
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 付款方式。如EBANK_PAYMENT
OPENBANK_PAYMENT
    */
    @SerializedName("PaymentMethod")
    @Expose
    private String PaymentMethod;

    /**
    * 订单金额。单位分
    */
    @SerializedName("TotalAmount")
    @Expose
    private Long TotalAmount;

    /**
    * 实际支付金额。单位分，支付成功时返回
    */
    @SerializedName("PayAmount")
    @Expose
    private Long PayAmount;

    /**
    * 失败原因，若失败的返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * 附加信息，查询时原样透传
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Attachment")
    @Expose
    private String Attachment;

    /**
    * 重定向参数，用于客户端跳转，订单未支付时返回该参数
渠道为TENPAY，付款方式为EBANK_PAYMENT时返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RedirectInfo")
    @Expose
    private OpenBankRedirectInfo RedirectInfo;

    /**
    * 第三方渠道返回信息，见渠道特殊说明,详情见附录-复杂类型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalReturnData")
    @Expose
    private String ExternalReturnData;

    /**
    * 银行复核指引。当TENPAY下OPENBANT_PAYMENT时，下单受理成功是返回。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BankApprovalGuideInfo")
    @Expose
    private OpenBankApprovalGuideInfo BankApprovalGuideInfo;

    /**
     * Get 渠道商户号。外部接入平台入驻云企付平台下发 
     * @return ChannelMerchantId 渠道商户号。外部接入平台入驻云企付平台下发
     */
    public String getChannelMerchantId() {
        return this.ChannelMerchantId;
    }

    /**
     * Set 渠道商户号。外部接入平台入驻云企付平台下发
     * @param ChannelMerchantId 渠道商户号。外部接入平台入驻云企付平台下发
     */
    public void setChannelMerchantId(String ChannelMerchantId) {
        this.ChannelMerchantId = ChannelMerchantId;
    }

    /**
     * Get 外部商户订单号 
     * @return OutOrderId 外部商户订单号
     */
    public String getOutOrderId() {
        return this.OutOrderId;
    }

    /**
     * Set 外部商户订单号
     * @param OutOrderId 外部商户订单号
     */
    public void setOutOrderId(String OutOrderId) {
        this.OutOrderId = OutOrderId;
    }

    /**
     * Get 云企付平台订单号 
     * @return ChannelOrderId 云企付平台订单号
     */
    public String getChannelOrderId() {
        return this.ChannelOrderId;
    }

    /**
     * Set 云企付平台订单号
     * @param ChannelOrderId 云企付平台订单号
     */
    public void setChannelOrderId(String ChannelOrderId) {
        this.ChannelOrderId = ChannelOrderId;
    }

    /**
     * Get 第三方支付平台订单号 
     * @return ThirdPayOrderId 第三方支付平台订单号
     */
    public String getThirdPayOrderId() {
        return this.ThirdPayOrderId;
    }

    /**
     * Set 第三方支付平台订单号
     * @param ThirdPayOrderId 第三方支付平台订单号
     */
    public void setThirdPayOrderId(String ThirdPayOrderId) {
        this.ThirdPayOrderId = ThirdPayOrderId;
    }

    /**
     * Get INIT：初始化
PAYING：支付中
DEDUCTED：扣款成功
ACCEPTED：支付受理成功
SUCCESS：支付成功
CLOSED：关单
PAY_FAIL：支付失败
REVOKE：退票 
     * @return OrderStatus INIT：初始化
PAYING：支付中
DEDUCTED：扣款成功
ACCEPTED：支付受理成功
SUCCESS：支付成功
CLOSED：关单
PAY_FAIL：支付失败
REVOKE：退票
     */
    public String getOrderStatus() {
        return this.OrderStatus;
    }

    /**
     * Set INIT：初始化
PAYING：支付中
DEDUCTED：扣款成功
ACCEPTED：支付受理成功
SUCCESS：支付成功
CLOSED：关单
PAY_FAIL：支付失败
REVOKE：退票
     * @param OrderStatus INIT：初始化
PAYING：支付中
DEDUCTED：扣款成功
ACCEPTED：支付受理成功
SUCCESS：支付成功
CLOSED：关单
PAY_FAIL：支付失败
REVOKE：退票
     */
    public void setOrderStatus(String OrderStatus) {
        this.OrderStatus = OrderStatus;
    }

    /**
     * Get 支付渠道名称，如TENPAY 
     * @return ChannelName 支付渠道名称，如TENPAY
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 支付渠道名称，如TENPAY
     * @param ChannelName 支付渠道名称，如TENPAY
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 付款方式。如EBANK_PAYMENT
OPENBANK_PAYMENT 
     * @return PaymentMethod 付款方式。如EBANK_PAYMENT
OPENBANK_PAYMENT
     */
    public String getPaymentMethod() {
        return this.PaymentMethod;
    }

    /**
     * Set 付款方式。如EBANK_PAYMENT
OPENBANK_PAYMENT
     * @param PaymentMethod 付款方式。如EBANK_PAYMENT
OPENBANK_PAYMENT
     */
    public void setPaymentMethod(String PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

    /**
     * Get 订单金额。单位分 
     * @return TotalAmount 订单金额。单位分
     */
    public Long getTotalAmount() {
        return this.TotalAmount;
    }

    /**
     * Set 订单金额。单位分
     * @param TotalAmount 订单金额。单位分
     */
    public void setTotalAmount(Long TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    /**
     * Get 实际支付金额。单位分，支付成功时返回 
     * @return PayAmount 实际支付金额。单位分，支付成功时返回
     */
    public Long getPayAmount() {
        return this.PayAmount;
    }

    /**
     * Set 实际支付金额。单位分，支付成功时返回
     * @param PayAmount 实际支付金额。单位分，支付成功时返回
     */
    public void setPayAmount(Long PayAmount) {
        this.PayAmount = PayAmount;
    }

    /**
     * Get 失败原因，若失败的返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailReason 失败原因，若失败的返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set 失败原因，若失败的返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailReason 失败原因，若失败的返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get 附加信息，查询时原样透传
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Attachment 附加信息，查询时原样透传
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAttachment() {
        return this.Attachment;
    }

    /**
     * Set 附加信息，查询时原样透传
注意：此字段可能返回 null，表示取不到有效值。
     * @param Attachment 附加信息，查询时原样透传
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttachment(String Attachment) {
        this.Attachment = Attachment;
    }

    /**
     * Get 重定向参数，用于客户端跳转，订单未支付时返回该参数
渠道为TENPAY，付款方式为EBANK_PAYMENT时返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RedirectInfo 重定向参数，用于客户端跳转，订单未支付时返回该参数
渠道为TENPAY，付款方式为EBANK_PAYMENT时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OpenBankRedirectInfo getRedirectInfo() {
        return this.RedirectInfo;
    }

    /**
     * Set 重定向参数，用于客户端跳转，订单未支付时返回该参数
渠道为TENPAY，付款方式为EBANK_PAYMENT时返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param RedirectInfo 重定向参数，用于客户端跳转，订单未支付时返回该参数
渠道为TENPAY，付款方式为EBANK_PAYMENT时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRedirectInfo(OpenBankRedirectInfo RedirectInfo) {
        this.RedirectInfo = RedirectInfo;
    }

    /**
     * Get 第三方渠道返回信息，见渠道特殊说明,详情见附录-复杂类型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalReturnData 第三方渠道返回信息，见渠道特殊说明,详情见附录-复杂类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExternalReturnData() {
        return this.ExternalReturnData;
    }

    /**
     * Set 第三方渠道返回信息，见渠道特殊说明,详情见附录-复杂类型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalReturnData 第三方渠道返回信息，见渠道特殊说明,详情见附录-复杂类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalReturnData(String ExternalReturnData) {
        this.ExternalReturnData = ExternalReturnData;
    }

    /**
     * Get 银行复核指引。当TENPAY下OPENBANT_PAYMENT时，下单受理成功是返回。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BankApprovalGuideInfo 银行复核指引。当TENPAY下OPENBANT_PAYMENT时，下单受理成功是返回。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OpenBankApprovalGuideInfo getBankApprovalGuideInfo() {
        return this.BankApprovalGuideInfo;
    }

    /**
     * Set 银行复核指引。当TENPAY下OPENBANT_PAYMENT时，下单受理成功是返回。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BankApprovalGuideInfo 银行复核指引。当TENPAY下OPENBANT_PAYMENT时，下单受理成功是返回。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBankApprovalGuideInfo(OpenBankApprovalGuideInfo BankApprovalGuideInfo) {
        this.BankApprovalGuideInfo = BankApprovalGuideInfo;
    }

    public QueryOpenBankPaymentOrderResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryOpenBankPaymentOrderResult(QueryOpenBankPaymentOrderResult source) {
        if (source.ChannelMerchantId != null) {
            this.ChannelMerchantId = new String(source.ChannelMerchantId);
        }
        if (source.OutOrderId != null) {
            this.OutOrderId = new String(source.OutOrderId);
        }
        if (source.ChannelOrderId != null) {
            this.ChannelOrderId = new String(source.ChannelOrderId);
        }
        if (source.ThirdPayOrderId != null) {
            this.ThirdPayOrderId = new String(source.ThirdPayOrderId);
        }
        if (source.OrderStatus != null) {
            this.OrderStatus = new String(source.OrderStatus);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.PaymentMethod != null) {
            this.PaymentMethod = new String(source.PaymentMethod);
        }
        if (source.TotalAmount != null) {
            this.TotalAmount = new Long(source.TotalAmount);
        }
        if (source.PayAmount != null) {
            this.PayAmount = new Long(source.PayAmount);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.Attachment != null) {
            this.Attachment = new String(source.Attachment);
        }
        if (source.RedirectInfo != null) {
            this.RedirectInfo = new OpenBankRedirectInfo(source.RedirectInfo);
        }
        if (source.ExternalReturnData != null) {
            this.ExternalReturnData = new String(source.ExternalReturnData);
        }
        if (source.BankApprovalGuideInfo != null) {
            this.BankApprovalGuideInfo = new OpenBankApprovalGuideInfo(source.BankApprovalGuideInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelMerchantId", this.ChannelMerchantId);
        this.setParamSimple(map, prefix + "OutOrderId", this.OutOrderId);
        this.setParamSimple(map, prefix + "ChannelOrderId", this.ChannelOrderId);
        this.setParamSimple(map, prefix + "ThirdPayOrderId", this.ThirdPayOrderId);
        this.setParamSimple(map, prefix + "OrderStatus", this.OrderStatus);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "PaymentMethod", this.PaymentMethod);
        this.setParamSimple(map, prefix + "TotalAmount", this.TotalAmount);
        this.setParamSimple(map, prefix + "PayAmount", this.PayAmount);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "Attachment", this.Attachment);
        this.setParamObj(map, prefix + "RedirectInfo.", this.RedirectInfo);
        this.setParamSimple(map, prefix + "ExternalReturnData", this.ExternalReturnData);
        this.setParamObj(map, prefix + "BankApprovalGuideInfo.", this.BankApprovalGuideInfo);

    }
}

