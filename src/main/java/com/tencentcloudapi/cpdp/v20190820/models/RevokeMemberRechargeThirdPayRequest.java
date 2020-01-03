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

public class RevokeMemberRechargeThirdPayRequest extends AbstractModel{

    /**
    * STRING(52)，原充值的前置流水号
    */
    @SerializedName("OldFillFrontSeqNo")
    @Expose
    private String OldFillFrontSeqNo;

    /**
    * STRING(20)，原充值的支付渠道类型
    */
    @SerializedName("OldFillPayChannelType")
    @Expose
    private String OldFillPayChannelType;

    /**
    * STRING(52)，原充值的支付渠道交易流水号
    */
    @SerializedName("OldPayChannelTranSeqNo")
    @Expose
    private String OldPayChannelTranSeqNo;

    /**
    * STRING(52)，原充值的电商见证宝订单号
    */
    @SerializedName("OldFillEjzbOrderNo")
    @Expose
    private String OldFillEjzbOrderNo;

    /**
    * STRING(20)，申请撤销的会员金额
    */
    @SerializedName("ApplyCancelMemberAmt")
    @Expose
    private String ApplyCancelMemberAmt;

    /**
    * STRING(20)，申请撤销的手续费金额
    */
    @SerializedName("ApplyCancelCommission")
    @Expose
    private String ApplyCancelCommission;

    /**
    * String(22)，商户号
    */
    @SerializedName("MrchCode")
    @Expose
    private String MrchCode;

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
     * Get STRING(52)，原充值的前置流水号 
     * @return OldFillFrontSeqNo STRING(52)，原充值的前置流水号
     */
    public String getOldFillFrontSeqNo() {
        return this.OldFillFrontSeqNo;
    }

    /**
     * Set STRING(52)，原充值的前置流水号
     * @param OldFillFrontSeqNo STRING(52)，原充值的前置流水号
     */
    public void setOldFillFrontSeqNo(String OldFillFrontSeqNo) {
        this.OldFillFrontSeqNo = OldFillFrontSeqNo;
    }

    /**
     * Get STRING(20)，原充值的支付渠道类型 
     * @return OldFillPayChannelType STRING(20)，原充值的支付渠道类型
     */
    public String getOldFillPayChannelType() {
        return this.OldFillPayChannelType;
    }

    /**
     * Set STRING(20)，原充值的支付渠道类型
     * @param OldFillPayChannelType STRING(20)，原充值的支付渠道类型
     */
    public void setOldFillPayChannelType(String OldFillPayChannelType) {
        this.OldFillPayChannelType = OldFillPayChannelType;
    }

    /**
     * Get STRING(52)，原充值的支付渠道交易流水号 
     * @return OldPayChannelTranSeqNo STRING(52)，原充值的支付渠道交易流水号
     */
    public String getOldPayChannelTranSeqNo() {
        return this.OldPayChannelTranSeqNo;
    }

    /**
     * Set STRING(52)，原充值的支付渠道交易流水号
     * @param OldPayChannelTranSeqNo STRING(52)，原充值的支付渠道交易流水号
     */
    public void setOldPayChannelTranSeqNo(String OldPayChannelTranSeqNo) {
        this.OldPayChannelTranSeqNo = OldPayChannelTranSeqNo;
    }

    /**
     * Get STRING(52)，原充值的电商见证宝订单号 
     * @return OldFillEjzbOrderNo STRING(52)，原充值的电商见证宝订单号
     */
    public String getOldFillEjzbOrderNo() {
        return this.OldFillEjzbOrderNo;
    }

    /**
     * Set STRING(52)，原充值的电商见证宝订单号
     * @param OldFillEjzbOrderNo STRING(52)，原充值的电商见证宝订单号
     */
    public void setOldFillEjzbOrderNo(String OldFillEjzbOrderNo) {
        this.OldFillEjzbOrderNo = OldFillEjzbOrderNo;
    }

    /**
     * Get STRING(20)，申请撤销的会员金额 
     * @return ApplyCancelMemberAmt STRING(20)，申请撤销的会员金额
     */
    public String getApplyCancelMemberAmt() {
        return this.ApplyCancelMemberAmt;
    }

    /**
     * Set STRING(20)，申请撤销的会员金额
     * @param ApplyCancelMemberAmt STRING(20)，申请撤销的会员金额
     */
    public void setApplyCancelMemberAmt(String ApplyCancelMemberAmt) {
        this.ApplyCancelMemberAmt = ApplyCancelMemberAmt;
    }

    /**
     * Get STRING(20)，申请撤销的手续费金额 
     * @return ApplyCancelCommission STRING(20)，申请撤销的手续费金额
     */
    public String getApplyCancelCommission() {
        return this.ApplyCancelCommission;
    }

    /**
     * Set STRING(20)，申请撤销的手续费金额
     * @param ApplyCancelCommission STRING(20)，申请撤销的手续费金额
     */
    public void setApplyCancelCommission(String ApplyCancelCommission) {
        this.ApplyCancelCommission = ApplyCancelCommission;
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
        this.setParamSimple(map, prefix + "OldFillFrontSeqNo", this.OldFillFrontSeqNo);
        this.setParamSimple(map, prefix + "OldFillPayChannelType", this.OldFillPayChannelType);
        this.setParamSimple(map, prefix + "OldPayChannelTranSeqNo", this.OldPayChannelTranSeqNo);
        this.setParamSimple(map, prefix + "OldFillEjzbOrderNo", this.OldFillEjzbOrderNo);
        this.setParamSimple(map, prefix + "ApplyCancelMemberAmt", this.ApplyCancelMemberAmt);
        this.setParamSimple(map, prefix + "ApplyCancelCommission", this.ApplyCancelCommission);
        this.setParamSimple(map, prefix + "MrchCode", this.MrchCode);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ReservedMsgOne", this.ReservedMsgOne);
        this.setParamSimple(map, prefix + "ReservedMsgTwo", this.ReservedMsgTwo);
        this.setParamSimple(map, prefix + "ReservedMsgThree", this.ReservedMsgThree);

    }
}

