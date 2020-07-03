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

public class TransactionItem extends AbstractModel{

    /**
    * STRING(2)，记账标志（1: 转出; 2: 转入）
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
    * STRING(20)，交易金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranAmt")
    @Expose
    private String TranAmt;

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
    * STRING(20)，记账类型（详情见“常见问题”）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BookingType")
    @Expose
    private String BookingType;

    /**
    * STRING(50)，转入见证子账户的帐号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InSubAcctNo")
    @Expose
    private String InSubAcctNo;

    /**
    * STRING(50)，转出见证子账户的帐号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutSubAcctNo")
    @Expose
    private String OutSubAcctNo;

    /**
    * STRING(300)，备注（返回交易订单号）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get STRING(2)，记账标志（1: 转出; 2: 转入）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BookingFlag STRING(2)，记账标志（1: 转出; 2: 转入）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBookingFlag() {
        return this.BookingFlag;
    }

    /**
     * Set STRING(2)，记账标志（1: 转出; 2: 转入）
注意：此字段可能返回 null，表示取不到有效值。
     * @param BookingFlag STRING(2)，记账标志（1: 转出; 2: 转入）
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
     * Get STRING(20)，记账类型（详情见“常见问题”）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BookingType STRING(20)，记账类型（详情见“常见问题”）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBookingType() {
        return this.BookingType;
    }

    /**
     * Set STRING(20)，记账类型（详情见“常见问题”）
注意：此字段可能返回 null，表示取不到有效值。
     * @param BookingType STRING(20)，记账类型（详情见“常见问题”）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBookingType(String BookingType) {
        this.BookingType = BookingType;
    }

    /**
     * Get STRING(50)，转入见证子账户的帐号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InSubAcctNo STRING(50)，转入见证子账户的帐号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInSubAcctNo() {
        return this.InSubAcctNo;
    }

    /**
     * Set STRING(50)，转入见证子账户的帐号
注意：此字段可能返回 null，表示取不到有效值。
     * @param InSubAcctNo STRING(50)，转入见证子账户的帐号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInSubAcctNo(String InSubAcctNo) {
        this.InSubAcctNo = InSubAcctNo;
    }

    /**
     * Get STRING(50)，转出见证子账户的帐号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutSubAcctNo STRING(50)，转出见证子账户的帐号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutSubAcctNo() {
        return this.OutSubAcctNo;
    }

    /**
     * Set STRING(50)，转出见证子账户的帐号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutSubAcctNo STRING(50)，转出见证子账户的帐号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutSubAcctNo(String OutSubAcctNo) {
        this.OutSubAcctNo = OutSubAcctNo;
    }

    /**
     * Get STRING(300)，备注（返回交易订单号）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark STRING(300)，备注（返回交易订单号）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set STRING(300)，备注（返回交易订单号）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark STRING(300)，备注（返回交易订单号）
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
        this.setParamSimple(map, prefix + "TranAmt", this.TranAmt);
        this.setParamSimple(map, prefix + "TranDate", this.TranDate);
        this.setParamSimple(map, prefix + "TranTime", this.TranTime);
        this.setParamSimple(map, prefix + "FrontSeqNo", this.FrontSeqNo);
        this.setParamSimple(map, prefix + "BookingType", this.BookingType);
        this.setParamSimple(map, prefix + "InSubAcctNo", this.InSubAcctNo);
        this.setParamSimple(map, prefix + "OutSubAcctNo", this.OutSubAcctNo);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

