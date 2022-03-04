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

public class MemberTransactionItem extends AbstractModel{

    /**
    * 交易类型。
__1__：转出
__2__：转入
    */
    @SerializedName("TransType")
    @Expose
    private String TransType;

    /**
    * 交易状态。
__0__：成功
    */
    @SerializedName("TranStatus")
    @Expose
    private String TranStatus;

    /**
    * 交易金额。
    */
    @SerializedName("TransAmount")
    @Expose
    private String TransAmount;

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
    * 银行记账类型。
_平安渠道为：_
_1：会员支付_
_2：会员冻结_
_3：会员解冻_
_4：登记挂账_
_6：下单预支付_
_7：确认并付款_
_8：会员退款_
_22：见证+收单平台调账_
_23：见证+收单资金冻结_
_24：见证+收单资金解冻_
_25：会员间交易退款_
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BankBookingType")
    @Expose
    private String BankBookingType;

    /**
    * 转入方子账户账号。
_平安渠道为转入见证子账户的账号_
    */
    @SerializedName("InSubAccountNumber")
    @Expose
    private String InSubAccountNumber;

    /**
    * 转出方子账户账号。
_平安渠道为转出见证子账户的账号_
    */
    @SerializedName("OutSubAccountNumber")
    @Expose
    private String OutSubAccountNumber;

    /**
    * 备注。
_平安渠道，如果是见证+收单的交易，返回交易订单号_
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 交易类型。
__1__：转出
__2__：转入 
     * @return TransType 交易类型。
__1__：转出
__2__：转入
     */
    public String getTransType() {
        return this.TransType;
    }

    /**
     * Set 交易类型。
__1__：转出
__2__：转入
     * @param TransType 交易类型。
__1__：转出
__2__：转入
     */
    public void setTransType(String TransType) {
        this.TransType = TransType;
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
     * Get 银行记账类型。
_平安渠道为：_
_1：会员支付_
_2：会员冻结_
_3：会员解冻_
_4：登记挂账_
_6：下单预支付_
_7：确认并付款_
_8：会员退款_
_22：见证+收单平台调账_
_23：见证+收单资金冻结_
_24：见证+收单资金解冻_
_25：会员间交易退款_
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BankBookingType 银行记账类型。
_平安渠道为：_
_1：会员支付_
_2：会员冻结_
_3：会员解冻_
_4：登记挂账_
_6：下单预支付_
_7：确认并付款_
_8：会员退款_
_22：见证+收单平台调账_
_23：见证+收单资金冻结_
_24：见证+收单资金解冻_
_25：会员间交易退款_
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBankBookingType() {
        return this.BankBookingType;
    }

    /**
     * Set 银行记账类型。
_平安渠道为：_
_1：会员支付_
_2：会员冻结_
_3：会员解冻_
_4：登记挂账_
_6：下单预支付_
_7：确认并付款_
_8：会员退款_
_22：见证+收单平台调账_
_23：见证+收单资金冻结_
_24：见证+收单资金解冻_
_25：会员间交易退款_
注意：此字段可能返回 null，表示取不到有效值。
     * @param BankBookingType 银行记账类型。
_平安渠道为：_
_1：会员支付_
_2：会员冻结_
_3：会员解冻_
_4：登记挂账_
_6：下单预支付_
_7：确认并付款_
_8：会员退款_
_22：见证+收单平台调账_
_23：见证+收单资金冻结_
_24：见证+收单资金解冻_
_25：会员间交易退款_
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBankBookingType(String BankBookingType) {
        this.BankBookingType = BankBookingType;
    }

    /**
     * Get 转入方子账户账号。
_平安渠道为转入见证子账户的账号_ 
     * @return InSubAccountNumber 转入方子账户账号。
_平安渠道为转入见证子账户的账号_
     */
    public String getInSubAccountNumber() {
        return this.InSubAccountNumber;
    }

    /**
     * Set 转入方子账户账号。
_平安渠道为转入见证子账户的账号_
     * @param InSubAccountNumber 转入方子账户账号。
_平安渠道为转入见证子账户的账号_
     */
    public void setInSubAccountNumber(String InSubAccountNumber) {
        this.InSubAccountNumber = InSubAccountNumber;
    }

    /**
     * Get 转出方子账户账号。
_平安渠道为转出见证子账户的账号_ 
     * @return OutSubAccountNumber 转出方子账户账号。
_平安渠道为转出见证子账户的账号_
     */
    public String getOutSubAccountNumber() {
        return this.OutSubAccountNumber;
    }

    /**
     * Set 转出方子账户账号。
_平安渠道为转出见证子账户的账号_
     * @param OutSubAccountNumber 转出方子账户账号。
_平安渠道为转出见证子账户的账号_
     */
    public void setOutSubAccountNumber(String OutSubAccountNumber) {
        this.OutSubAccountNumber = OutSubAccountNumber;
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

    public MemberTransactionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MemberTransactionItem(MemberTransactionItem source) {
        if (source.TransType != null) {
            this.TransType = new String(source.TransType);
        }
        if (source.TranStatus != null) {
            this.TranStatus = new String(source.TranStatus);
        }
        if (source.TransAmount != null) {
            this.TransAmount = new String(source.TransAmount);
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
        if (source.BankBookingType != null) {
            this.BankBookingType = new String(source.BankBookingType);
        }
        if (source.InSubAccountNumber != null) {
            this.InSubAccountNumber = new String(source.InSubAccountNumber);
        }
        if (source.OutSubAccountNumber != null) {
            this.OutSubAccountNumber = new String(source.OutSubAccountNumber);
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
        this.setParamSimple(map, prefix + "TranStatus", this.TranStatus);
        this.setParamSimple(map, prefix + "TransAmount", this.TransAmount);
        this.setParamSimple(map, prefix + "TransDate", this.TransDate);
        this.setParamSimple(map, prefix + "TransTime", this.TransTime);
        this.setParamSimple(map, prefix + "BankSequenceNumber", this.BankSequenceNumber);
        this.setParamSimple(map, prefix + "BankBookingType", this.BankBookingType);
        this.setParamSimple(map, prefix + "InSubAccountNumber", this.InSubAccountNumber);
        this.setParamSimple(map, prefix + "OutSubAccountNumber", this.OutSubAccountNumber);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

