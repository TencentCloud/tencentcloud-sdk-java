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

public class WithdrawCashMembershipRequest extends AbstractModel{

    /**
    * String(22)，商户号（签约客户号）
    */
    @SerializedName("MrchCode")
    @Expose
    private String MrchCode;

    /**
    * STRING(150)，交易网名称（市场名称）
    */
    @SerializedName("TranWebName")
    @Expose
    private String TranWebName;

    /**
    * STRING(5)，会员证件类型（详情见“常见问题”）
    */
    @SerializedName("MemberGlobalType")
    @Expose
    private String MemberGlobalType;

    /**
    * STRING(32)，会员证件号码
    */
    @SerializedName("MemberGlobalId")
    @Expose
    private String MemberGlobalId;

    /**
    * STRING(32)，交易网会员代码
    */
    @SerializedName("TranNetMemberCode")
    @Expose
    private String TranNetMemberCode;

    /**
    * STRING(150)，会员名称
    */
    @SerializedName("MemberName")
    @Expose
    private String MemberName;

    /**
    * STRING(50)，提现账号（银行卡）
    */
    @SerializedName("TakeCashAcctNo")
    @Expose
    private String TakeCashAcctNo;

    /**
    * STRING(150)，出金账户名称（银行卡户名）
    */
    @SerializedName("OutAmtAcctName")
    @Expose
    private String OutAmtAcctName;

    /**
    * STRING(3)，币种（默认为RMB）
    */
    @SerializedName("Ccy")
    @Expose
    private String Ccy;

    /**
    * STRING(20)，可提现金额
    */
    @SerializedName("CashAmt")
    @Expose
    private String CashAmt;

    /**
    * STRING(300)，备注（建议可送订单号，可在对账文件的备注字段获取到）
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * STRING(1027)，保留域
    */
    @SerializedName("ReservedMsg")
    @Expose
    private String ReservedMsg;

    /**
    * STRING(300)，网银签名
    */
    @SerializedName("WebSign")
    @Expose
    private String WebSign;

    /**
     * Get String(22)，商户号（签约客户号） 
     * @return MrchCode String(22)，商户号（签约客户号）
     */
    public String getMrchCode() {
        return this.MrchCode;
    }

    /**
     * Set String(22)，商户号（签约客户号）
     * @param MrchCode String(22)，商户号（签约客户号）
     */
    public void setMrchCode(String MrchCode) {
        this.MrchCode = MrchCode;
    }

    /**
     * Get STRING(150)，交易网名称（市场名称） 
     * @return TranWebName STRING(150)，交易网名称（市场名称）
     */
    public String getTranWebName() {
        return this.TranWebName;
    }

    /**
     * Set STRING(150)，交易网名称（市场名称）
     * @param TranWebName STRING(150)，交易网名称（市场名称）
     */
    public void setTranWebName(String TranWebName) {
        this.TranWebName = TranWebName;
    }

    /**
     * Get STRING(5)，会员证件类型（详情见“常见问题”） 
     * @return MemberGlobalType STRING(5)，会员证件类型（详情见“常见问题”）
     */
    public String getMemberGlobalType() {
        return this.MemberGlobalType;
    }

    /**
     * Set STRING(5)，会员证件类型（详情见“常见问题”）
     * @param MemberGlobalType STRING(5)，会员证件类型（详情见“常见问题”）
     */
    public void setMemberGlobalType(String MemberGlobalType) {
        this.MemberGlobalType = MemberGlobalType;
    }

    /**
     * Get STRING(32)，会员证件号码 
     * @return MemberGlobalId STRING(32)，会员证件号码
     */
    public String getMemberGlobalId() {
        return this.MemberGlobalId;
    }

    /**
     * Set STRING(32)，会员证件号码
     * @param MemberGlobalId STRING(32)，会员证件号码
     */
    public void setMemberGlobalId(String MemberGlobalId) {
        this.MemberGlobalId = MemberGlobalId;
    }

    /**
     * Get STRING(32)，交易网会员代码 
     * @return TranNetMemberCode STRING(32)，交易网会员代码
     */
    public String getTranNetMemberCode() {
        return this.TranNetMemberCode;
    }

    /**
     * Set STRING(32)，交易网会员代码
     * @param TranNetMemberCode STRING(32)，交易网会员代码
     */
    public void setTranNetMemberCode(String TranNetMemberCode) {
        this.TranNetMemberCode = TranNetMemberCode;
    }

    /**
     * Get STRING(150)，会员名称 
     * @return MemberName STRING(150)，会员名称
     */
    public String getMemberName() {
        return this.MemberName;
    }

    /**
     * Set STRING(150)，会员名称
     * @param MemberName STRING(150)，会员名称
     */
    public void setMemberName(String MemberName) {
        this.MemberName = MemberName;
    }

    /**
     * Get STRING(50)，提现账号（银行卡） 
     * @return TakeCashAcctNo STRING(50)，提现账号（银行卡）
     */
    public String getTakeCashAcctNo() {
        return this.TakeCashAcctNo;
    }

    /**
     * Set STRING(50)，提现账号（银行卡）
     * @param TakeCashAcctNo STRING(50)，提现账号（银行卡）
     */
    public void setTakeCashAcctNo(String TakeCashAcctNo) {
        this.TakeCashAcctNo = TakeCashAcctNo;
    }

    /**
     * Get STRING(150)，出金账户名称（银行卡户名） 
     * @return OutAmtAcctName STRING(150)，出金账户名称（银行卡户名）
     */
    public String getOutAmtAcctName() {
        return this.OutAmtAcctName;
    }

    /**
     * Set STRING(150)，出金账户名称（银行卡户名）
     * @param OutAmtAcctName STRING(150)，出金账户名称（银行卡户名）
     */
    public void setOutAmtAcctName(String OutAmtAcctName) {
        this.OutAmtAcctName = OutAmtAcctName;
    }

    /**
     * Get STRING(3)，币种（默认为RMB） 
     * @return Ccy STRING(3)，币种（默认为RMB）
     */
    public String getCcy() {
        return this.Ccy;
    }

    /**
     * Set STRING(3)，币种（默认为RMB）
     * @param Ccy STRING(3)，币种（默认为RMB）
     */
    public void setCcy(String Ccy) {
        this.Ccy = Ccy;
    }

    /**
     * Get STRING(20)，可提现金额 
     * @return CashAmt STRING(20)，可提现金额
     */
    public String getCashAmt() {
        return this.CashAmt;
    }

    /**
     * Set STRING(20)，可提现金额
     * @param CashAmt STRING(20)，可提现金额
     */
    public void setCashAmt(String CashAmt) {
        this.CashAmt = CashAmt;
    }

    /**
     * Get STRING(300)，备注（建议可送订单号，可在对账文件的备注字段获取到） 
     * @return Remark STRING(300)，备注（建议可送订单号，可在对账文件的备注字段获取到）
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set STRING(300)，备注（建议可送订单号，可在对账文件的备注字段获取到）
     * @param Remark STRING(300)，备注（建议可送订单号，可在对账文件的备注字段获取到）
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get STRING(1027)，保留域 
     * @return ReservedMsg STRING(1027)，保留域
     */
    public String getReservedMsg() {
        return this.ReservedMsg;
    }

    /**
     * Set STRING(1027)，保留域
     * @param ReservedMsg STRING(1027)，保留域
     */
    public void setReservedMsg(String ReservedMsg) {
        this.ReservedMsg = ReservedMsg;
    }

    /**
     * Get STRING(300)，网银签名 
     * @return WebSign STRING(300)，网银签名
     */
    public String getWebSign() {
        return this.WebSign;
    }

    /**
     * Set STRING(300)，网银签名
     * @param WebSign STRING(300)，网银签名
     */
    public void setWebSign(String WebSign) {
        this.WebSign = WebSign;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MrchCode", this.MrchCode);
        this.setParamSimple(map, prefix + "TranWebName", this.TranWebName);
        this.setParamSimple(map, prefix + "MemberGlobalType", this.MemberGlobalType);
        this.setParamSimple(map, prefix + "MemberGlobalId", this.MemberGlobalId);
        this.setParamSimple(map, prefix + "TranNetMemberCode", this.TranNetMemberCode);
        this.setParamSimple(map, prefix + "MemberName", this.MemberName);
        this.setParamSimple(map, prefix + "TakeCashAcctNo", this.TakeCashAcctNo);
        this.setParamSimple(map, prefix + "OutAmtAcctName", this.OutAmtAcctName);
        this.setParamSimple(map, prefix + "Ccy", this.Ccy);
        this.setParamSimple(map, prefix + "CashAmt", this.CashAmt);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ReservedMsg", this.ReservedMsg);
        this.setParamSimple(map, prefix + "WebSign", this.WebSign);

    }
}

