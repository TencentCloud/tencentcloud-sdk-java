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

public class TransferItem extends AbstractModel{

    /**
    * STRING(10)，入账类型（02: 会员充值; 03: 资金挂账）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InAcctType")
    @Expose
    private String InAcctType;

    /**
    * STRING(32)，交易网会员代码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranNetMemberCode")
    @Expose
    private String TranNetMemberCode;

    /**
    * STRING(50)，见证子帐户的帐号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubAcctNo")
    @Expose
    private String SubAcctNo;

    /**
    * STRING(20)，入金金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranAmt")
    @Expose
    private String TranAmt;

    /**
    * STRING(50)，入金账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InAcctNo")
    @Expose
    private String InAcctNo;

    /**
    * STRING(150)，入金账户名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InAcctName")
    @Expose
    private String InAcctName;

    /**
    * STRING(3)，币种
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ccy")
    @Expose
    private String Ccy;

    /**
    * STRING(8)，会计日期（即银行主机记账日期）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountingDate")
    @Expose
    private String AccountingDate;

    /**
    * STRING(150)，银行名称（付款账户银行名称）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BankName")
    @Expose
    private String BankName;

    /**
    * STRING(300)，转账备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * STRING(52)，见证系统流水号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrontSeqNo")
    @Expose
    private String FrontSeqNo;

    /**
     * Get STRING(10)，入账类型（02: 会员充值; 03: 资金挂账）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InAcctType STRING(10)，入账类型（02: 会员充值; 03: 资金挂账）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInAcctType() {
        return this.InAcctType;
    }

    /**
     * Set STRING(10)，入账类型（02: 会员充值; 03: 资金挂账）
注意：此字段可能返回 null，表示取不到有效值。
     * @param InAcctType STRING(10)，入账类型（02: 会员充值; 03: 资金挂账）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInAcctType(String InAcctType) {
        this.InAcctType = InAcctType;
    }

    /**
     * Get STRING(32)，交易网会员代码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranNetMemberCode STRING(32)，交易网会员代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTranNetMemberCode() {
        return this.TranNetMemberCode;
    }

    /**
     * Set STRING(32)，交易网会员代码
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranNetMemberCode STRING(32)，交易网会员代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranNetMemberCode(String TranNetMemberCode) {
        this.TranNetMemberCode = TranNetMemberCode;
    }

    /**
     * Get STRING(50)，见证子帐户的帐号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubAcctNo STRING(50)，见证子帐户的帐号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubAcctNo() {
        return this.SubAcctNo;
    }

    /**
     * Set STRING(50)，见证子帐户的帐号
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubAcctNo STRING(50)，见证子帐户的帐号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubAcctNo(String SubAcctNo) {
        this.SubAcctNo = SubAcctNo;
    }

    /**
     * Get STRING(20)，入金金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranAmt STRING(20)，入金金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTranAmt() {
        return this.TranAmt;
    }

    /**
     * Set STRING(20)，入金金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranAmt STRING(20)，入金金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranAmt(String TranAmt) {
        this.TranAmt = TranAmt;
    }

    /**
     * Get STRING(50)，入金账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InAcctNo STRING(50)，入金账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInAcctNo() {
        return this.InAcctNo;
    }

    /**
     * Set STRING(50)，入金账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param InAcctNo STRING(50)，入金账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInAcctNo(String InAcctNo) {
        this.InAcctNo = InAcctNo;
    }

    /**
     * Get STRING(150)，入金账户名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InAcctName STRING(150)，入金账户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInAcctName() {
        return this.InAcctName;
    }

    /**
     * Set STRING(150)，入金账户名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InAcctName STRING(150)，入金账户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInAcctName(String InAcctName) {
        this.InAcctName = InAcctName;
    }

    /**
     * Get STRING(3)，币种
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ccy STRING(3)，币种
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCcy() {
        return this.Ccy;
    }

    /**
     * Set STRING(3)，币种
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ccy STRING(3)，币种
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCcy(String Ccy) {
        this.Ccy = Ccy;
    }

    /**
     * Get STRING(8)，会计日期（即银行主机记账日期）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountingDate STRING(8)，会计日期（即银行主机记账日期）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountingDate() {
        return this.AccountingDate;
    }

    /**
     * Set STRING(8)，会计日期（即银行主机记账日期）
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountingDate STRING(8)，会计日期（即银行主机记账日期）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountingDate(String AccountingDate) {
        this.AccountingDate = AccountingDate;
    }

    /**
     * Get STRING(150)，银行名称（付款账户银行名称）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BankName STRING(150)，银行名称（付款账户银行名称）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBankName() {
        return this.BankName;
    }

    /**
     * Set STRING(150)，银行名称（付款账户银行名称）
注意：此字段可能返回 null，表示取不到有效值。
     * @param BankName STRING(150)，银行名称（付款账户银行名称）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    /**
     * Get STRING(300)，转账备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark STRING(300)，转账备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set STRING(300)，转账备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark STRING(300)，转账备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get STRING(52)，见证系统流水号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrontSeqNo STRING(52)，见证系统流水号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrontSeqNo() {
        return this.FrontSeqNo;
    }

    /**
     * Set STRING(52)，见证系统流水号
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrontSeqNo STRING(52)，见证系统流水号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrontSeqNo(String FrontSeqNo) {
        this.FrontSeqNo = FrontSeqNo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InAcctType", this.InAcctType);
        this.setParamSimple(map, prefix + "TranNetMemberCode", this.TranNetMemberCode);
        this.setParamSimple(map, prefix + "SubAcctNo", this.SubAcctNo);
        this.setParamSimple(map, prefix + "TranAmt", this.TranAmt);
        this.setParamSimple(map, prefix + "InAcctNo", this.InAcctNo);
        this.setParamSimple(map, prefix + "InAcctName", this.InAcctName);
        this.setParamSimple(map, prefix + "Ccy", this.Ccy);
        this.setParamSimple(map, prefix + "AccountingDate", this.AccountingDate);
        this.setParamSimple(map, prefix + "BankName", this.BankName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "FrontSeqNo", this.FrontSeqNo);

    }
}

