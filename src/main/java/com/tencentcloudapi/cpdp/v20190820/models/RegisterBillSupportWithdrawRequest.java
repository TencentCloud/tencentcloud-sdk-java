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

public class RegisterBillSupportWithdrawRequest extends AbstractModel{

    /**
    * STRING(32)，交易网会员代码
    */
    @SerializedName("TranNetMemberCode")
    @Expose
    private String TranNetMemberCode;

    /**
    * STRING(50)，订单号
    */
    @SerializedName("OrderNo")
    @Expose
    private String OrderNo;

    /**
    * STRING(20)，挂账金额（包含交易费用）
    */
    @SerializedName("SuspendAmt")
    @Expose
    private String SuspendAmt;

    /**
    * STRING(20)，交易费用（暂未使用，默认传0.0）
    */
    @SerializedName("TranFee")
    @Expose
    private String TranFee;

    /**
    * String(22)，商户号（签约客户号）
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
     * Get STRING(50)，订单号 
     * @return OrderNo STRING(50)，订单号
     */
    public String getOrderNo() {
        return this.OrderNo;
    }

    /**
     * Set STRING(50)，订单号
     * @param OrderNo STRING(50)，订单号
     */
    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
    }

    /**
     * Get STRING(20)，挂账金额（包含交易费用） 
     * @return SuspendAmt STRING(20)，挂账金额（包含交易费用）
     */
    public String getSuspendAmt() {
        return this.SuspendAmt;
    }

    /**
     * Set STRING(20)，挂账金额（包含交易费用）
     * @param SuspendAmt STRING(20)，挂账金额（包含交易费用）
     */
    public void setSuspendAmt(String SuspendAmt) {
        this.SuspendAmt = SuspendAmt;
    }

    /**
     * Get STRING(20)，交易费用（暂未使用，默认传0.0） 
     * @return TranFee STRING(20)，交易费用（暂未使用，默认传0.0）
     */
    public String getTranFee() {
        return this.TranFee;
    }

    /**
     * Set STRING(20)，交易费用（暂未使用，默认传0.0）
     * @param TranFee STRING(20)，交易费用（暂未使用，默认传0.0）
     */
    public void setTranFee(String TranFee) {
        this.TranFee = TranFee;
    }

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
        this.setParamSimple(map, prefix + "OrderNo", this.OrderNo);
        this.setParamSimple(map, prefix + "SuspendAmt", this.SuspendAmt);
        this.setParamSimple(map, prefix + "TranFee", this.TranFee);
        this.setParamSimple(map, prefix + "MrchCode", this.MrchCode);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ReservedMsgOne", this.ReservedMsgOne);
        this.setParamSimple(map, prefix + "ReservedMsgTwo", this.ReservedMsgTwo);
        this.setParamSimple(map, prefix + "ReservedMsgThree", this.ReservedMsgThree);

    }
}

