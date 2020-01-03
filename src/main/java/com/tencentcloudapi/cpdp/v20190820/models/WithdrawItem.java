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

public class WithdrawItem extends AbstractModel{

    /**
    * STRING(2)，记账标志（01: 提现; 02: 清分 ）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BookingFlag")
    @Expose
    private String BookingFlag;

    /**
    * STRING(32)，交易状态（0: 成功）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranStatus")
    @Expose
    private String TranStatus;

    /**
    * STRING(200)，记账说明
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BookingMsg")
    @Expose
    private String BookingMsg;

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
    * STRING(150)，见证子账户的名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubAcctName")
    @Expose
    private String SubAcctName;

    /**
    * STRING(20)，交易金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranAmt")
    @Expose
    private String TranAmt;

    /**
    * STRING(20)，手续费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Commission")
    @Expose
    private String Commission;

    /**
    * STRING(8)，交易日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranDate")
    @Expose
    private String TranDate;

    /**
    * STRING(20)，交易时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranTime")
    @Expose
    private String TranTime;

    /**
    * STRING(52)，见证系统流水号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrontSeqNo")
    @Expose
    private String FrontSeqNo;

    /**
    * STRING(300)，备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get STRING(2)，记账标志（01: 提现; 02: 清分 ）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BookingFlag STRING(2)，记账标志（01: 提现; 02: 清分 ）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBookingFlag() {
        return this.BookingFlag;
    }

    /**
     * Set STRING(2)，记账标志（01: 提现; 02: 清分 ）
注意：此字段可能返回 null，表示取不到有效值。
     * @param BookingFlag STRING(2)，记账标志（01: 提现; 02: 清分 ）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBookingFlag(String BookingFlag) {
        this.BookingFlag = BookingFlag;
    }

    /**
     * Get STRING(32)，交易状态（0: 成功）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranStatus STRING(32)，交易状态（0: 成功）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTranStatus() {
        return this.TranStatus;
    }

    /**
     * Set STRING(32)，交易状态（0: 成功）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranStatus STRING(32)，交易状态（0: 成功）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranStatus(String TranStatus) {
        this.TranStatus = TranStatus;
    }

    /**
     * Get STRING(200)，记账说明
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BookingMsg STRING(200)，记账说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBookingMsg() {
        return this.BookingMsg;
    }

    /**
     * Set STRING(200)，记账说明
注意：此字段可能返回 null，表示取不到有效值。
     * @param BookingMsg STRING(200)，记账说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBookingMsg(String BookingMsg) {
        this.BookingMsg = BookingMsg;
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
     * Get STRING(150)，见证子账户的名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubAcctName STRING(150)，见证子账户的名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubAcctName() {
        return this.SubAcctName;
    }

    /**
     * Set STRING(150)，见证子账户的名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubAcctName STRING(150)，见证子账户的名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubAcctName(String SubAcctName) {
        this.SubAcctName = SubAcctName;
    }

    /**
     * Get STRING(20)，交易金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranAmt STRING(20)，交易金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTranAmt() {
        return this.TranAmt;
    }

    /**
     * Set STRING(20)，交易金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranAmt STRING(20)，交易金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranAmt(String TranAmt) {
        this.TranAmt = TranAmt;
    }

    /**
     * Get STRING(20)，手续费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Commission STRING(20)，手续费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCommission() {
        return this.Commission;
    }

    /**
     * Set STRING(20)，手续费
注意：此字段可能返回 null，表示取不到有效值。
     * @param Commission STRING(20)，手续费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCommission(String Commission) {
        this.Commission = Commission;
    }

    /**
     * Get STRING(8)，交易日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranDate STRING(8)，交易日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTranDate() {
        return this.TranDate;
    }

    /**
     * Set STRING(8)，交易日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranDate STRING(8)，交易日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranDate(String TranDate) {
        this.TranDate = TranDate;
    }

    /**
     * Get STRING(20)，交易时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranTime STRING(20)，交易时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTranTime() {
        return this.TranTime;
    }

    /**
     * Set STRING(20)，交易时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranTime STRING(20)，交易时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranTime(String TranTime) {
        this.TranTime = TranTime;
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
     * Get STRING(300)，备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark STRING(300)，备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set STRING(300)，备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark STRING(300)，备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BookingFlag", this.BookingFlag);
        this.setParamSimple(map, prefix + "TranStatus", this.TranStatus);
        this.setParamSimple(map, prefix + "BookingMsg", this.BookingMsg);
        this.setParamSimple(map, prefix + "TranNetMemberCode", this.TranNetMemberCode);
        this.setParamSimple(map, prefix + "SubAcctNo", this.SubAcctNo);
        this.setParamSimple(map, prefix + "SubAcctName", this.SubAcctName);
        this.setParamSimple(map, prefix + "TranAmt", this.TranAmt);
        this.setParamSimple(map, prefix + "Commission", this.Commission);
        this.setParamSimple(map, prefix + "TranDate", this.TranDate);
        this.setParamSimple(map, prefix + "TranTime", this.TranTime);
        this.setParamSimple(map, prefix + "FrontSeqNo", this.FrontSeqNo);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

