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

public class RechargeMemberThirdPayRequest extends AbstractModel{

    /**
    * STRING(32)，交易网会代码
    */
    @SerializedName("TranNetMemberCode")
    @Expose
    private String TranNetMemberCode;

    /**
    * STRING(20)，会员充值金额
    */
    @SerializedName("MemberFillAmt")
    @Expose
    private String MemberFillAmt;

    /**
    * STRING(20)，手续费金额
    */
    @SerializedName("Commission")
    @Expose
    private String Commission;

    /**
    * STRING(3)，币种。如RMB
    */
    @SerializedName("Ccy")
    @Expose
    private String Ccy;

    /**
    * STRING(20)，支付渠道类型。
0001-微信
0002-支付宝
0003-京东支付
    */
    @SerializedName("PayChannelType")
    @Expose
    private String PayChannelType;

    /**
    * STRING(50)，支付渠道所分配的商户号
    */
    @SerializedName("PayChannelAssignMerNo")
    @Expose
    private String PayChannelAssignMerNo;

    /**
    * STRING(52)，支付渠道交易流水号
    */
    @SerializedName("PayChannelTranSeqNo")
    @Expose
    private String PayChannelTranSeqNo;

    /**
    * STRING(52)，电商见证宝订单号
    */
    @SerializedName("EjzbOrderNo")
    @Expose
    private String EjzbOrderNo;

    /**
    * String(22)，商户号
    */
    @SerializedName("MrchCode")
    @Expose
    private String MrchCode;

    /**
    * STRING(500)，电商见证宝订单内容
    */
    @SerializedName("EjzbOrderContent")
    @Expose
    private String EjzbOrderContent;

    /**
    * STRING(300)，备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * STRING(300)，保留域1
    */
    @SerializedName("ReservedMsgOne")
    @Expose
    private String ReservedMsgOne;

    /**
    * STRING(300)，保留域2
    */
    @SerializedName("ReservedMsgTwo")
    @Expose
    private String ReservedMsgTwo;

    /**
    * STRING(300)，保留域3
    */
    @SerializedName("ReservedMsgThree")
    @Expose
    private String ReservedMsgThree;

    /**
     * Get STRING(32)，交易网会代码 
     * @return TranNetMemberCode STRING(32)，交易网会代码
     */
    public String getTranNetMemberCode() {
        return this.TranNetMemberCode;
    }

    /**
     * Set STRING(32)，交易网会代码
     * @param TranNetMemberCode STRING(32)，交易网会代码
     */
    public void setTranNetMemberCode(String TranNetMemberCode) {
        this.TranNetMemberCode = TranNetMemberCode;
    }

    /**
     * Get STRING(20)，会员充值金额 
     * @return MemberFillAmt STRING(20)，会员充值金额
     */
    public String getMemberFillAmt() {
        return this.MemberFillAmt;
    }

    /**
     * Set STRING(20)，会员充值金额
     * @param MemberFillAmt STRING(20)，会员充值金额
     */
    public void setMemberFillAmt(String MemberFillAmt) {
        this.MemberFillAmt = MemberFillAmt;
    }

    /**
     * Get STRING(20)，手续费金额 
     * @return Commission STRING(20)，手续费金额
     */
    public String getCommission() {
        return this.Commission;
    }

    /**
     * Set STRING(20)，手续费金额
     * @param Commission STRING(20)，手续费金额
     */
    public void setCommission(String Commission) {
        this.Commission = Commission;
    }

    /**
     * Get STRING(3)，币种。如RMB 
     * @return Ccy STRING(3)，币种。如RMB
     */
    public String getCcy() {
        return this.Ccy;
    }

    /**
     * Set STRING(3)，币种。如RMB
     * @param Ccy STRING(3)，币种。如RMB
     */
    public void setCcy(String Ccy) {
        this.Ccy = Ccy;
    }

    /**
     * Get STRING(20)，支付渠道类型。
0001-微信
0002-支付宝
0003-京东支付 
     * @return PayChannelType STRING(20)，支付渠道类型。
0001-微信
0002-支付宝
0003-京东支付
     */
    public String getPayChannelType() {
        return this.PayChannelType;
    }

    /**
     * Set STRING(20)，支付渠道类型。
0001-微信
0002-支付宝
0003-京东支付
     * @param PayChannelType STRING(20)，支付渠道类型。
0001-微信
0002-支付宝
0003-京东支付
     */
    public void setPayChannelType(String PayChannelType) {
        this.PayChannelType = PayChannelType;
    }

    /**
     * Get STRING(50)，支付渠道所分配的商户号 
     * @return PayChannelAssignMerNo STRING(50)，支付渠道所分配的商户号
     */
    public String getPayChannelAssignMerNo() {
        return this.PayChannelAssignMerNo;
    }

    /**
     * Set STRING(50)，支付渠道所分配的商户号
     * @param PayChannelAssignMerNo STRING(50)，支付渠道所分配的商户号
     */
    public void setPayChannelAssignMerNo(String PayChannelAssignMerNo) {
        this.PayChannelAssignMerNo = PayChannelAssignMerNo;
    }

    /**
     * Get STRING(52)，支付渠道交易流水号 
     * @return PayChannelTranSeqNo STRING(52)，支付渠道交易流水号
     */
    public String getPayChannelTranSeqNo() {
        return this.PayChannelTranSeqNo;
    }

    /**
     * Set STRING(52)，支付渠道交易流水号
     * @param PayChannelTranSeqNo STRING(52)，支付渠道交易流水号
     */
    public void setPayChannelTranSeqNo(String PayChannelTranSeqNo) {
        this.PayChannelTranSeqNo = PayChannelTranSeqNo;
    }

    /**
     * Get STRING(52)，电商见证宝订单号 
     * @return EjzbOrderNo STRING(52)，电商见证宝订单号
     */
    public String getEjzbOrderNo() {
        return this.EjzbOrderNo;
    }

    /**
     * Set STRING(52)，电商见证宝订单号
     * @param EjzbOrderNo STRING(52)，电商见证宝订单号
     */
    public void setEjzbOrderNo(String EjzbOrderNo) {
        this.EjzbOrderNo = EjzbOrderNo;
    }

    /**
     * Get String(22)，商户号 
     * @return MrchCode String(22)，商户号
     */
    public String getMrchCode() {
        return this.MrchCode;
    }

    /**
     * Set String(22)，商户号
     * @param MrchCode String(22)，商户号
     */
    public void setMrchCode(String MrchCode) {
        this.MrchCode = MrchCode;
    }

    /**
     * Get STRING(500)，电商见证宝订单内容 
     * @return EjzbOrderContent STRING(500)，电商见证宝订单内容
     */
    public String getEjzbOrderContent() {
        return this.EjzbOrderContent;
    }

    /**
     * Set STRING(500)，电商见证宝订单内容
     * @param EjzbOrderContent STRING(500)，电商见证宝订单内容
     */
    public void setEjzbOrderContent(String EjzbOrderContent) {
        this.EjzbOrderContent = EjzbOrderContent;
    }

    /**
     * Get STRING(300)，备注 
     * @return Remark STRING(300)，备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set STRING(300)，备注
     * @param Remark STRING(300)，备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get STRING(300)，保留域1 
     * @return ReservedMsgOne STRING(300)，保留域1
     */
    public String getReservedMsgOne() {
        return this.ReservedMsgOne;
    }

    /**
     * Set STRING(300)，保留域1
     * @param ReservedMsgOne STRING(300)，保留域1
     */
    public void setReservedMsgOne(String ReservedMsgOne) {
        this.ReservedMsgOne = ReservedMsgOne;
    }

    /**
     * Get STRING(300)，保留域2 
     * @return ReservedMsgTwo STRING(300)，保留域2
     */
    public String getReservedMsgTwo() {
        return this.ReservedMsgTwo;
    }

    /**
     * Set STRING(300)，保留域2
     * @param ReservedMsgTwo STRING(300)，保留域2
     */
    public void setReservedMsgTwo(String ReservedMsgTwo) {
        this.ReservedMsgTwo = ReservedMsgTwo;
    }

    /**
     * Get STRING(300)，保留域3 
     * @return ReservedMsgThree STRING(300)，保留域3
     */
    public String getReservedMsgThree() {
        return this.ReservedMsgThree;
    }

    /**
     * Set STRING(300)，保留域3
     * @param ReservedMsgThree STRING(300)，保留域3
     */
    public void setReservedMsgThree(String ReservedMsgThree) {
        this.ReservedMsgThree = ReservedMsgThree;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TranNetMemberCode", this.TranNetMemberCode);
        this.setParamSimple(map, prefix + "MemberFillAmt", this.MemberFillAmt);
        this.setParamSimple(map, prefix + "Commission", this.Commission);
        this.setParamSimple(map, prefix + "Ccy", this.Ccy);
        this.setParamSimple(map, prefix + "PayChannelType", this.PayChannelType);
        this.setParamSimple(map, prefix + "PayChannelAssignMerNo", this.PayChannelAssignMerNo);
        this.setParamSimple(map, prefix + "PayChannelTranSeqNo", this.PayChannelTranSeqNo);
        this.setParamSimple(map, prefix + "EjzbOrderNo", this.EjzbOrderNo);
        this.setParamSimple(map, prefix + "MrchCode", this.MrchCode);
        this.setParamSimple(map, prefix + "EjzbOrderContent", this.EjzbOrderContent);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ReservedMsgOne", this.ReservedMsgOne);
        this.setParamSimple(map, prefix + "ReservedMsgTwo", this.ReservedMsgTwo);
        this.setParamSimple(map, prefix + "ReservedMsgThree", this.ReservedMsgThree);

    }
}

