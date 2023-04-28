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

public class PaymentOrderResult extends AbstractModel{

    /**
    * 收入类型
LABOR:劳务所得
OCCASION:偶然所得
    */
    @SerializedName("IncomeType")
    @Expose
    private String IncomeType;

    /**
    * 税前金额
    */
    @SerializedName("AmountBeforeTax")
    @Expose
    private String AmountBeforeTax;

    /**
    * 税后金额
    */
    @SerializedName("AmountAfterTax")
    @Expose
    private String AmountAfterTax;

    /**
    * 税金
    */
    @SerializedName("Tax")
    @Expose
    private String Tax;

    /**
    * 外部订单ID
    */
    @SerializedName("OutOrderId")
    @Expose
    private String OutOrderId;

    /**
    * 订单ID
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 发起时间
    */
    @SerializedName("InitiateTime")
    @Expose
    private String InitiateTime;

    /**
    * 完成时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * 状态
ACCEPTED:已受理
ACCOUNTED:已记账
PAYING:付款中
PAYED:完成付款渠道调用
SUCCEED:已成功
FAILED:已失败
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 状态描述
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 提现备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 收款用户ID
    */
    @SerializedName("PayeeId")
    @Expose
    private String PayeeId;

    /**
    * 外部用户ID
    */
    @SerializedName("OutUserId")
    @Expose
    private String OutUserId;

    /**
    * 渠道支付订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelOrderId")
    @Expose
    private String ChannelOrderId;

    /**
    * 增值税
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vat")
    @Expose
    private String Vat;

    /**
    * 个人所得税
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndividualIncomeTax")
    @Expose
    private String IndividualIncomeTax;

    /**
    * 附加税总税额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdditionalTaxSum")
    @Expose
    private String AdditionalTaxSum;

    /**
    * 附加税税项。格式为JSON格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdditionalTaxItem")
    @Expose
    private String AdditionalTaxItem;

    /**
    * 失败原因。当Status为FAILED时，改字段为失败的原因。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * 资金账户字类型: WECHATPAY_ACCOUNT 微信零钱, BANK_ACCOUNT 银行卡
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FundingAccountSubType")
    @Expose
    private String FundingAccountSubType;

    /**
     * Get 收入类型
LABOR:劳务所得
OCCASION:偶然所得 
     * @return IncomeType 收入类型
LABOR:劳务所得
OCCASION:偶然所得
     */
    public String getIncomeType() {
        return this.IncomeType;
    }

    /**
     * Set 收入类型
LABOR:劳务所得
OCCASION:偶然所得
     * @param IncomeType 收入类型
LABOR:劳务所得
OCCASION:偶然所得
     */
    public void setIncomeType(String IncomeType) {
        this.IncomeType = IncomeType;
    }

    /**
     * Get 税前金额 
     * @return AmountBeforeTax 税前金额
     */
    public String getAmountBeforeTax() {
        return this.AmountBeforeTax;
    }

    /**
     * Set 税前金额
     * @param AmountBeforeTax 税前金额
     */
    public void setAmountBeforeTax(String AmountBeforeTax) {
        this.AmountBeforeTax = AmountBeforeTax;
    }

    /**
     * Get 税后金额 
     * @return AmountAfterTax 税后金额
     */
    public String getAmountAfterTax() {
        return this.AmountAfterTax;
    }

    /**
     * Set 税后金额
     * @param AmountAfterTax 税后金额
     */
    public void setAmountAfterTax(String AmountAfterTax) {
        this.AmountAfterTax = AmountAfterTax;
    }

    /**
     * Get 税金 
     * @return Tax 税金
     */
    public String getTax() {
        return this.Tax;
    }

    /**
     * Set 税金
     * @param Tax 税金
     */
    public void setTax(String Tax) {
        this.Tax = Tax;
    }

    /**
     * Get 外部订单ID 
     * @return OutOrderId 外部订单ID
     */
    public String getOutOrderId() {
        return this.OutOrderId;
    }

    /**
     * Set 外部订单ID
     * @param OutOrderId 外部订单ID
     */
    public void setOutOrderId(String OutOrderId) {
        this.OutOrderId = OutOrderId;
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
     * Get 发起时间 
     * @return InitiateTime 发起时间
     */
    public String getInitiateTime() {
        return this.InitiateTime;
    }

    /**
     * Set 发起时间
     * @param InitiateTime 发起时间
     */
    public void setInitiateTime(String InitiateTime) {
        this.InitiateTime = InitiateTime;
    }

    /**
     * Get 完成时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FinishTime 完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 完成时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FinishTime 完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get 状态
ACCEPTED:已受理
ACCOUNTED:已记账
PAYING:付款中
PAYED:完成付款渠道调用
SUCCEED:已成功
FAILED:已失败 
     * @return Status 状态
ACCEPTED:已受理
ACCOUNTED:已记账
PAYING:付款中
PAYED:完成付款渠道调用
SUCCEED:已成功
FAILED:已失败
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
ACCEPTED:已受理
ACCOUNTED:已记账
PAYING:付款中
PAYED:完成付款渠道调用
SUCCEED:已成功
FAILED:已失败
     * @param Status 状态
ACCEPTED:已受理
ACCOUNTED:已记账
PAYING:付款中
PAYED:完成付款渠道调用
SUCCEED:已成功
FAILED:已失败
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 状态描述 
     * @return StatusDesc 状态描述
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 状态描述
     * @param StatusDesc 状态描述
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 提现备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 提现备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 提现备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 提现备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 收款用户ID 
     * @return PayeeId 收款用户ID
     */
    public String getPayeeId() {
        return this.PayeeId;
    }

    /**
     * Set 收款用户ID
     * @param PayeeId 收款用户ID
     */
    public void setPayeeId(String PayeeId) {
        this.PayeeId = PayeeId;
    }

    /**
     * Get 外部用户ID 
     * @return OutUserId 外部用户ID
     */
    public String getOutUserId() {
        return this.OutUserId;
    }

    /**
     * Set 外部用户ID
     * @param OutUserId 外部用户ID
     */
    public void setOutUserId(String OutUserId) {
        this.OutUserId = OutUserId;
    }

    /**
     * Get 渠道支付订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelOrderId 渠道支付订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelOrderId() {
        return this.ChannelOrderId;
    }

    /**
     * Set 渠道支付订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelOrderId 渠道支付订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelOrderId(String ChannelOrderId) {
        this.ChannelOrderId = ChannelOrderId;
    }

    /**
     * Get 增值税
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vat 增值税
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVat() {
        return this.Vat;
    }

    /**
     * Set 增值税
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vat 增值税
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVat(String Vat) {
        this.Vat = Vat;
    }

    /**
     * Get 个人所得税
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndividualIncomeTax 个人所得税
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndividualIncomeTax() {
        return this.IndividualIncomeTax;
    }

    /**
     * Set 个人所得税
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndividualIncomeTax 个人所得税
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndividualIncomeTax(String IndividualIncomeTax) {
        this.IndividualIncomeTax = IndividualIncomeTax;
    }

    /**
     * Get 附加税总税额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdditionalTaxSum 附加税总税额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdditionalTaxSum() {
        return this.AdditionalTaxSum;
    }

    /**
     * Set 附加税总税额
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdditionalTaxSum 附加税总税额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdditionalTaxSum(String AdditionalTaxSum) {
        this.AdditionalTaxSum = AdditionalTaxSum;
    }

    /**
     * Get 附加税税项。格式为JSON格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdditionalTaxItem 附加税税项。格式为JSON格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdditionalTaxItem() {
        return this.AdditionalTaxItem;
    }

    /**
     * Set 附加税税项。格式为JSON格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdditionalTaxItem 附加税税项。格式为JSON格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdditionalTaxItem(String AdditionalTaxItem) {
        this.AdditionalTaxItem = AdditionalTaxItem;
    }

    /**
     * Get 失败原因。当Status为FAILED时，改字段为失败的原因。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailReason 失败原因。当Status为FAILED时，改字段为失败的原因。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set 失败原因。当Status为FAILED时，改字段为失败的原因。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailReason 失败原因。当Status为FAILED时，改字段为失败的原因。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get 资金账户字类型: WECHATPAY_ACCOUNT 微信零钱, BANK_ACCOUNT 银行卡
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FundingAccountSubType 资金账户字类型: WECHATPAY_ACCOUNT 微信零钱, BANK_ACCOUNT 银行卡
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFundingAccountSubType() {
        return this.FundingAccountSubType;
    }

    /**
     * Set 资金账户字类型: WECHATPAY_ACCOUNT 微信零钱, BANK_ACCOUNT 银行卡
注意：此字段可能返回 null，表示取不到有效值。
     * @param FundingAccountSubType 资金账户字类型: WECHATPAY_ACCOUNT 微信零钱, BANK_ACCOUNT 银行卡
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFundingAccountSubType(String FundingAccountSubType) {
        this.FundingAccountSubType = FundingAccountSubType;
    }

    public PaymentOrderResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PaymentOrderResult(PaymentOrderResult source) {
        if (source.IncomeType != null) {
            this.IncomeType = new String(source.IncomeType);
        }
        if (source.AmountBeforeTax != null) {
            this.AmountBeforeTax = new String(source.AmountBeforeTax);
        }
        if (source.AmountAfterTax != null) {
            this.AmountAfterTax = new String(source.AmountAfterTax);
        }
        if (source.Tax != null) {
            this.Tax = new String(source.Tax);
        }
        if (source.OutOrderId != null) {
            this.OutOrderId = new String(source.OutOrderId);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.InitiateTime != null) {
            this.InitiateTime = new String(source.InitiateTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.PayeeId != null) {
            this.PayeeId = new String(source.PayeeId);
        }
        if (source.OutUserId != null) {
            this.OutUserId = new String(source.OutUserId);
        }
        if (source.ChannelOrderId != null) {
            this.ChannelOrderId = new String(source.ChannelOrderId);
        }
        if (source.Vat != null) {
            this.Vat = new String(source.Vat);
        }
        if (source.IndividualIncomeTax != null) {
            this.IndividualIncomeTax = new String(source.IndividualIncomeTax);
        }
        if (source.AdditionalTaxSum != null) {
            this.AdditionalTaxSum = new String(source.AdditionalTaxSum);
        }
        if (source.AdditionalTaxItem != null) {
            this.AdditionalTaxItem = new String(source.AdditionalTaxItem);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.FundingAccountSubType != null) {
            this.FundingAccountSubType = new String(source.FundingAccountSubType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IncomeType", this.IncomeType);
        this.setParamSimple(map, prefix + "AmountBeforeTax", this.AmountBeforeTax);
        this.setParamSimple(map, prefix + "AmountAfterTax", this.AmountAfterTax);
        this.setParamSimple(map, prefix + "Tax", this.Tax);
        this.setParamSimple(map, prefix + "OutOrderId", this.OutOrderId);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "InitiateTime", this.InitiateTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PayeeId", this.PayeeId);
        this.setParamSimple(map, prefix + "OutUserId", this.OutUserId);
        this.setParamSimple(map, prefix + "ChannelOrderId", this.ChannelOrderId);
        this.setParamSimple(map, prefix + "Vat", this.Vat);
        this.setParamSimple(map, prefix + "IndividualIncomeTax", this.IndividualIncomeTax);
        this.setParamSimple(map, prefix + "AdditionalTaxSum", this.AdditionalTaxSum);
        this.setParamSimple(map, prefix + "AdditionalTaxItem", this.AdditionalTaxItem);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "FundingAccountSubType", this.FundingAccountSubType);

    }
}

