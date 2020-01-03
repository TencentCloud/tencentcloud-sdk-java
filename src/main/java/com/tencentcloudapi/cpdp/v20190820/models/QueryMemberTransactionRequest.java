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

public class QueryMemberTransactionRequest extends AbstractModel{

    /**
    * String(22)，商户号（签约客户号）
    */
    @SerializedName("MrchCode")
    @Expose
    private String MrchCode;

    /**
    * STRING(2)，功能标志（1: 下单预支付; 2: 确认并付款; 3: 退款; 6: 直接支付T+1; 9: 直接支付T+0）
    */
    @SerializedName("FunctionFlag")
    @Expose
    private String FunctionFlag;

    /**
    * STRING(50)，转出方的见证子账户的账号（付款方）
    */
    @SerializedName("OutSubAcctNo")
    @Expose
    private String OutSubAcctNo;

    /**
    * STRING(32)，转出方的交易网会员代码
    */
    @SerializedName("OutMemberCode")
    @Expose
    private String OutMemberCode;

    /**
    * STRING(150)，转出方的见证子账户的户名（户名是绑卡时上送的账户名称，如果未绑卡，就送OpenCustAcctId接口上送的用户昵称UserNickname）
    */
    @SerializedName("OutSubAcctName")
    @Expose
    private String OutSubAcctName;

    /**
    * STRING(50)，转入方的见证子账户的账号（收款方）
    */
    @SerializedName("InSubAcctNo")
    @Expose
    private String InSubAcctNo;

    /**
    * STRING(32)，转入方的交易网会员代码
    */
    @SerializedName("InMemberCode")
    @Expose
    private String InMemberCode;

    /**
    * STRING(150)，转入方的见证子账户的户名（户名是绑卡时上送的账户名称，如果未绑卡，就送OpenCustAcctId接口上送的用户昵称UserNickname）
    */
    @SerializedName("InSubAcctName")
    @Expose
    private String InSubAcctName;

    /**
    * STRING(20)，交易金额
    */
    @SerializedName("TranAmt")
    @Expose
    private String TranAmt;

    /**
    * STRING(20)，交易费用（平台收取交易费用）
    */
    @SerializedName("TranFee")
    @Expose
    private String TranFee;

    /**
    * STRING(20)，交易类型（01: 普通交易）
    */
    @SerializedName("TranType")
    @Expose
    private String TranType;

    /**
    * STRING(3)，币种（默认: RMB）
    */
    @SerializedName("Ccy")
    @Expose
    private String Ccy;

    /**
    * STRING(50)，订单号（功能标志为1,2,3时必输）
    */
    @SerializedName("OrderNo")
    @Expose
    private String OrderNo;

    /**
    * STRING(500)，订单内容
    */
    @SerializedName("OrderContent")
    @Expose
    private String OrderContent;

    /**
    * STRING(300)，备注（建议可送订单号，可在对账文件的备注字段获取到）
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * STRING(1027)，保留域（若需短信验证码则此项必输短信指令号）
    */
    @SerializedName("ReservedMsg")
    @Expose
    private String ReservedMsg;

    /**
    * STRING(300)，网银签名（若需短信验证码则此项必输）
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
     * Get STRING(2)，功能标志（1: 下单预支付; 2: 确认并付款; 3: 退款; 6: 直接支付T+1; 9: 直接支付T+0） 
     * @return FunctionFlag STRING(2)，功能标志（1: 下单预支付; 2: 确认并付款; 3: 退款; 6: 直接支付T+1; 9: 直接支付T+0）
     */
    public String getFunctionFlag() {
        return this.FunctionFlag;
    }

    /**
     * Set STRING(2)，功能标志（1: 下单预支付; 2: 确认并付款; 3: 退款; 6: 直接支付T+1; 9: 直接支付T+0）
     * @param FunctionFlag STRING(2)，功能标志（1: 下单预支付; 2: 确认并付款; 3: 退款; 6: 直接支付T+1; 9: 直接支付T+0）
     */
    public void setFunctionFlag(String FunctionFlag) {
        this.FunctionFlag = FunctionFlag;
    }

    /**
     * Get STRING(50)，转出方的见证子账户的账号（付款方） 
     * @return OutSubAcctNo STRING(50)，转出方的见证子账户的账号（付款方）
     */
    public String getOutSubAcctNo() {
        return this.OutSubAcctNo;
    }

    /**
     * Set STRING(50)，转出方的见证子账户的账号（付款方）
     * @param OutSubAcctNo STRING(50)，转出方的见证子账户的账号（付款方）
     */
    public void setOutSubAcctNo(String OutSubAcctNo) {
        this.OutSubAcctNo = OutSubAcctNo;
    }

    /**
     * Get STRING(32)，转出方的交易网会员代码 
     * @return OutMemberCode STRING(32)，转出方的交易网会员代码
     */
    public String getOutMemberCode() {
        return this.OutMemberCode;
    }

    /**
     * Set STRING(32)，转出方的交易网会员代码
     * @param OutMemberCode STRING(32)，转出方的交易网会员代码
     */
    public void setOutMemberCode(String OutMemberCode) {
        this.OutMemberCode = OutMemberCode;
    }

    /**
     * Get STRING(150)，转出方的见证子账户的户名（户名是绑卡时上送的账户名称，如果未绑卡，就送OpenCustAcctId接口上送的用户昵称UserNickname） 
     * @return OutSubAcctName STRING(150)，转出方的见证子账户的户名（户名是绑卡时上送的账户名称，如果未绑卡，就送OpenCustAcctId接口上送的用户昵称UserNickname）
     */
    public String getOutSubAcctName() {
        return this.OutSubAcctName;
    }

    /**
     * Set STRING(150)，转出方的见证子账户的户名（户名是绑卡时上送的账户名称，如果未绑卡，就送OpenCustAcctId接口上送的用户昵称UserNickname）
     * @param OutSubAcctName STRING(150)，转出方的见证子账户的户名（户名是绑卡时上送的账户名称，如果未绑卡，就送OpenCustAcctId接口上送的用户昵称UserNickname）
     */
    public void setOutSubAcctName(String OutSubAcctName) {
        this.OutSubAcctName = OutSubAcctName;
    }

    /**
     * Get STRING(50)，转入方的见证子账户的账号（收款方） 
     * @return InSubAcctNo STRING(50)，转入方的见证子账户的账号（收款方）
     */
    public String getInSubAcctNo() {
        return this.InSubAcctNo;
    }

    /**
     * Set STRING(50)，转入方的见证子账户的账号（收款方）
     * @param InSubAcctNo STRING(50)，转入方的见证子账户的账号（收款方）
     */
    public void setInSubAcctNo(String InSubAcctNo) {
        this.InSubAcctNo = InSubAcctNo;
    }

    /**
     * Get STRING(32)，转入方的交易网会员代码 
     * @return InMemberCode STRING(32)，转入方的交易网会员代码
     */
    public String getInMemberCode() {
        return this.InMemberCode;
    }

    /**
     * Set STRING(32)，转入方的交易网会员代码
     * @param InMemberCode STRING(32)，转入方的交易网会员代码
     */
    public void setInMemberCode(String InMemberCode) {
        this.InMemberCode = InMemberCode;
    }

    /**
     * Get STRING(150)，转入方的见证子账户的户名（户名是绑卡时上送的账户名称，如果未绑卡，就送OpenCustAcctId接口上送的用户昵称UserNickname） 
     * @return InSubAcctName STRING(150)，转入方的见证子账户的户名（户名是绑卡时上送的账户名称，如果未绑卡，就送OpenCustAcctId接口上送的用户昵称UserNickname）
     */
    public String getInSubAcctName() {
        return this.InSubAcctName;
    }

    /**
     * Set STRING(150)，转入方的见证子账户的户名（户名是绑卡时上送的账户名称，如果未绑卡，就送OpenCustAcctId接口上送的用户昵称UserNickname）
     * @param InSubAcctName STRING(150)，转入方的见证子账户的户名（户名是绑卡时上送的账户名称，如果未绑卡，就送OpenCustAcctId接口上送的用户昵称UserNickname）
     */
    public void setInSubAcctName(String InSubAcctName) {
        this.InSubAcctName = InSubAcctName;
    }

    /**
     * Get STRING(20)，交易金额 
     * @return TranAmt STRING(20)，交易金额
     */
    public String getTranAmt() {
        return this.TranAmt;
    }

    /**
     * Set STRING(20)，交易金额
     * @param TranAmt STRING(20)，交易金额
     */
    public void setTranAmt(String TranAmt) {
        this.TranAmt = TranAmt;
    }

    /**
     * Get STRING(20)，交易费用（平台收取交易费用） 
     * @return TranFee STRING(20)，交易费用（平台收取交易费用）
     */
    public String getTranFee() {
        return this.TranFee;
    }

    /**
     * Set STRING(20)，交易费用（平台收取交易费用）
     * @param TranFee STRING(20)，交易费用（平台收取交易费用）
     */
    public void setTranFee(String TranFee) {
        this.TranFee = TranFee;
    }

    /**
     * Get STRING(20)，交易类型（01: 普通交易） 
     * @return TranType STRING(20)，交易类型（01: 普通交易）
     */
    public String getTranType() {
        return this.TranType;
    }

    /**
     * Set STRING(20)，交易类型（01: 普通交易）
     * @param TranType STRING(20)，交易类型（01: 普通交易）
     */
    public void setTranType(String TranType) {
        this.TranType = TranType;
    }

    /**
     * Get STRING(3)，币种（默认: RMB） 
     * @return Ccy STRING(3)，币种（默认: RMB）
     */
    public String getCcy() {
        return this.Ccy;
    }

    /**
     * Set STRING(3)，币种（默认: RMB）
     * @param Ccy STRING(3)，币种（默认: RMB）
     */
    public void setCcy(String Ccy) {
        this.Ccy = Ccy;
    }

    /**
     * Get STRING(50)，订单号（功能标志为1,2,3时必输） 
     * @return OrderNo STRING(50)，订单号（功能标志为1,2,3时必输）
     */
    public String getOrderNo() {
        return this.OrderNo;
    }

    /**
     * Set STRING(50)，订单号（功能标志为1,2,3时必输）
     * @param OrderNo STRING(50)，订单号（功能标志为1,2,3时必输）
     */
    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
    }

    /**
     * Get STRING(500)，订单内容 
     * @return OrderContent STRING(500)，订单内容
     */
    public String getOrderContent() {
        return this.OrderContent;
    }

    /**
     * Set STRING(500)，订单内容
     * @param OrderContent STRING(500)，订单内容
     */
    public void setOrderContent(String OrderContent) {
        this.OrderContent = OrderContent;
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
     * Get STRING(1027)，保留域（若需短信验证码则此项必输短信指令号） 
     * @return ReservedMsg STRING(1027)，保留域（若需短信验证码则此项必输短信指令号）
     */
    public String getReservedMsg() {
        return this.ReservedMsg;
    }

    /**
     * Set STRING(1027)，保留域（若需短信验证码则此项必输短信指令号）
     * @param ReservedMsg STRING(1027)，保留域（若需短信验证码则此项必输短信指令号）
     */
    public void setReservedMsg(String ReservedMsg) {
        this.ReservedMsg = ReservedMsg;
    }

    /**
     * Get STRING(300)，网银签名（若需短信验证码则此项必输） 
     * @return WebSign STRING(300)，网银签名（若需短信验证码则此项必输）
     */
    public String getWebSign() {
        return this.WebSign;
    }

    /**
     * Set STRING(300)，网银签名（若需短信验证码则此项必输）
     * @param WebSign STRING(300)，网银签名（若需短信验证码则此项必输）
     */
    public void setWebSign(String WebSign) {
        this.WebSign = WebSign;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MrchCode", this.MrchCode);
        this.setParamSimple(map, prefix + "FunctionFlag", this.FunctionFlag);
        this.setParamSimple(map, prefix + "OutSubAcctNo", this.OutSubAcctNo);
        this.setParamSimple(map, prefix + "OutMemberCode", this.OutMemberCode);
        this.setParamSimple(map, prefix + "OutSubAcctName", this.OutSubAcctName);
        this.setParamSimple(map, prefix + "InSubAcctNo", this.InSubAcctNo);
        this.setParamSimple(map, prefix + "InMemberCode", this.InMemberCode);
        this.setParamSimple(map, prefix + "InSubAcctName", this.InSubAcctName);
        this.setParamSimple(map, prefix + "TranAmt", this.TranAmt);
        this.setParamSimple(map, prefix + "TranFee", this.TranFee);
        this.setParamSimple(map, prefix + "TranType", this.TranType);
        this.setParamSimple(map, prefix + "Ccy", this.Ccy);
        this.setParamSimple(map, prefix + "OrderNo", this.OrderNo);
        this.setParamSimple(map, prefix + "OrderContent", this.OrderContent);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ReservedMsg", this.ReservedMsg);
        this.setParamSimple(map, prefix + "WebSign", this.WebSign);

    }
}

