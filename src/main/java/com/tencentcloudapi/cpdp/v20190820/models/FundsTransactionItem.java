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

public class FundsTransactionItem extends AbstractModel{

    /**
    * 资金交易类型。
__1__：提现/退款
__2__：清分/充值
    */
    @SerializedName("TransType")
    @Expose
    private String TransType;

    /**
    * 银行记账说明。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BankBookingMessage")
    @Expose
    private String BankBookingMessage;

    /**
    * 交易状态。
__0__：成功
    */
    @SerializedName("TranStatus")
    @Expose
    private String TranStatus;

    /**
    * 业务方会员标识。
_平安渠道为交易网会员代码_
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransNetMemberCode")
    @Expose
    private String TransNetMemberCode;

    /**
    * 子账户账号。
_平安渠道为见证子账户的账号_
    */
    @SerializedName("SubAccountNumber")
    @Expose
    private String SubAccountNumber;

    /**
    * 子账户名称。
_平安渠道为见证子账户的户名_
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubAccountName")
    @Expose
    private String SubAccountName;

    /**
    * 交易金额。
    */
    @SerializedName("TransAmount")
    @Expose
    private String TransAmount;

    /**
    * 交易手续费。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransFee")
    @Expose
    private String TransFee;

    /**
    * 交易日期，格式：yyyyMMdd。
    */
    @SerializedName("TransDate")
    @Expose
    private String TransDate;

    /**
    * 交易时间，格式：HHmmss。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransTime")
    @Expose
    private String TransTime;

    /**
    * 银行系统流水号。
_平安渠道为见证系统流水号_
    */
    @SerializedName("BankSequenceNumber")
    @Expose
    private String BankSequenceNumber;

    /**
    * 备注。
_平安渠道，如果是见证+收单的交易，返回交易订单号_
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 资金交易类型。
__1__：提现/退款
__2__：清分/充值 
     * @return TransType 资金交易类型。
__1__：提现/退款
__2__：清分/充值
     */
    public String getTransType() {
        return this.TransType;
    }

    /**
     * Set 资金交易类型。
__1__：提现/退款
__2__：清分/充值
     * @param TransType 资金交易类型。
__1__：提现/退款
__2__：清分/充值
     */
    public void setTransType(String TransType) {
        this.TransType = TransType;
    }

    /**
     * Get 银行记账说明。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BankBookingMessage 银行记账说明。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBankBookingMessage() {
        return this.BankBookingMessage;
    }

    /**
     * Set 银行记账说明。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BankBookingMessage 银行记账说明。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBankBookingMessage(String BankBookingMessage) {
        this.BankBookingMessage = BankBookingMessage;
    }

    /**
     * Get 交易状态。
__0__：成功 
     * @return TranStatus 交易状态。
__0__：成功
     */
    public String getTranStatus() {
        return this.TranStatus;
    }

    /**
     * Set 交易状态。
__0__：成功
     * @param TranStatus 交易状态。
__0__：成功
     */
    public void setTranStatus(String TranStatus) {
        this.TranStatus = TranStatus;
    }

    /**
     * Get 业务方会员标识。
_平安渠道为交易网会员代码_
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransNetMemberCode 业务方会员标识。
_平安渠道为交易网会员代码_
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTransNetMemberCode() {
        return this.TransNetMemberCode;
    }

    /**
     * Set 业务方会员标识。
_平安渠道为交易网会员代码_
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransNetMemberCode 业务方会员标识。
_平安渠道为交易网会员代码_
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransNetMemberCode(String TransNetMemberCode) {
        this.TransNetMemberCode = TransNetMemberCode;
    }

    /**
     * Get 子账户账号。
_平安渠道为见证子账户的账号_ 
     * @return SubAccountNumber 子账户账号。
_平安渠道为见证子账户的账号_
     */
    public String getSubAccountNumber() {
        return this.SubAccountNumber;
    }

    /**
     * Set 子账户账号。
_平安渠道为见证子账户的账号_
     * @param SubAccountNumber 子账户账号。
_平安渠道为见证子账户的账号_
     */
    public void setSubAccountNumber(String SubAccountNumber) {
        this.SubAccountNumber = SubAccountNumber;
    }

    /**
     * Get 子账户名称。
_平安渠道为见证子账户的户名_
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubAccountName 子账户名称。
_平安渠道为见证子账户的户名_
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubAccountName() {
        return this.SubAccountName;
    }

    /**
     * Set 子账户名称。
_平安渠道为见证子账户的户名_
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubAccountName 子账户名称。
_平安渠道为见证子账户的户名_
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubAccountName(String SubAccountName) {
        this.SubAccountName = SubAccountName;
    }

    /**
     * Get 交易金额。 
     * @return TransAmount 交易金额。
     */
    public String getTransAmount() {
        return this.TransAmount;
    }

    /**
     * Set 交易金额。
     * @param TransAmount 交易金额。
     */
    public void setTransAmount(String TransAmount) {
        this.TransAmount = TransAmount;
    }

    /**
     * Get 交易手续费。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransFee 交易手续费。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTransFee() {
        return this.TransFee;
    }

    /**
     * Set 交易手续费。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransFee 交易手续费。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransFee(String TransFee) {
        this.TransFee = TransFee;
    }

    /**
     * Get 交易日期，格式：yyyyMMdd。 
     * @return TransDate 交易日期，格式：yyyyMMdd。
     */
    public String getTransDate() {
        return this.TransDate;
    }

    /**
     * Set 交易日期，格式：yyyyMMdd。
     * @param TransDate 交易日期，格式：yyyyMMdd。
     */
    public void setTransDate(String TransDate) {
        this.TransDate = TransDate;
    }

    /**
     * Get 交易时间，格式：HHmmss。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransTime 交易时间，格式：HHmmss。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTransTime() {
        return this.TransTime;
    }

    /**
     * Set 交易时间，格式：HHmmss。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransTime 交易时间，格式：HHmmss。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransTime(String TransTime) {
        this.TransTime = TransTime;
    }

    /**
     * Get 银行系统流水号。
_平安渠道为见证系统流水号_ 
     * @return BankSequenceNumber 银行系统流水号。
_平安渠道为见证系统流水号_
     */
    public String getBankSequenceNumber() {
        return this.BankSequenceNumber;
    }

    /**
     * Set 银行系统流水号。
_平安渠道为见证系统流水号_
     * @param BankSequenceNumber 银行系统流水号。
_平安渠道为见证系统流水号_
     */
    public void setBankSequenceNumber(String BankSequenceNumber) {
        this.BankSequenceNumber = BankSequenceNumber;
    }

    /**
     * Get 备注。
_平安渠道，如果是见证+收单的交易，返回交易订单号_
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 备注。
_平安渠道，如果是见证+收单的交易，返回交易订单号_
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注。
_平安渠道，如果是见证+收单的交易，返回交易订单号_
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 备注。
_平安渠道，如果是见证+收单的交易，返回交易订单号_
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public FundsTransactionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FundsTransactionItem(FundsTransactionItem source) {
        if (source.TransType != null) {
            this.TransType = new String(source.TransType);
        }
        if (source.BankBookingMessage != null) {
            this.BankBookingMessage = new String(source.BankBookingMessage);
        }
        if (source.TranStatus != null) {
            this.TranStatus = new String(source.TranStatus);
        }
        if (source.TransNetMemberCode != null) {
            this.TransNetMemberCode = new String(source.TransNetMemberCode);
        }
        if (source.SubAccountNumber != null) {
            this.SubAccountNumber = new String(source.SubAccountNumber);
        }
        if (source.SubAccountName != null) {
            this.SubAccountName = new String(source.SubAccountName);
        }
        if (source.TransAmount != null) {
            this.TransAmount = new String(source.TransAmount);
        }
        if (source.TransFee != null) {
            this.TransFee = new String(source.TransFee);
        }
        if (source.TransDate != null) {
            this.TransDate = new String(source.TransDate);
        }
        if (source.TransTime != null) {
            this.TransTime = new String(source.TransTime);
        }
        if (source.BankSequenceNumber != null) {
            this.BankSequenceNumber = new String(source.BankSequenceNumber);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TransType", this.TransType);
        this.setParamSimple(map, prefix + "BankBookingMessage", this.BankBookingMessage);
        this.setParamSimple(map, prefix + "TranStatus", this.TranStatus);
        this.setParamSimple(map, prefix + "TransNetMemberCode", this.TransNetMemberCode);
        this.setParamSimple(map, prefix + "SubAccountNumber", this.SubAccountNumber);
        this.setParamSimple(map, prefix + "SubAccountName", this.SubAccountName);
        this.setParamSimple(map, prefix + "TransAmount", this.TransAmount);
        this.setParamSimple(map, prefix + "TransFee", this.TransFee);
        this.setParamSimple(map, prefix + "TransDate", this.TransDate);
        this.setParamSimple(map, prefix + "TransTime", this.TransTime);
        this.setParamSimple(map, prefix + "BankSequenceNumber", this.BankSequenceNumber);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

