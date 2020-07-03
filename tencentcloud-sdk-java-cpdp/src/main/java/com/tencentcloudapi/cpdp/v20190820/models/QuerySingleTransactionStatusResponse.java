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

public class QuerySingleTransactionStatusResponse extends AbstractModel{

    /**
    * String(20)，返回码
    */
    @SerializedName("TxnReturnCode")
    @Expose
    private String TxnReturnCode;

    /**
    * String(100)，返回信息
    */
    @SerializedName("TxnReturnMsg")
    @Expose
    private String TxnReturnMsg;

    /**
    * String(22)，交易流水号
    */
    @SerializedName("CnsmrSeqNo")
    @Expose
    private String CnsmrSeqNo;

    /**
    * STRING(2)，记账标志（记账标志。1: 登记挂账; 2: 支付; 3: 提现; 4: 清分; 5: 下单预支付; 6: 确认并付款; 7: 退款; 8: 支付到平台; N: 其他）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BookingFlag")
    @Expose
    private String BookingFlag;

    /**
    * STRING(32)，交易状态（0: 成功; 1: 失败; 2: 待确认; 5: 待处理; 6: 处理中。0和1是终态，2、5、6是中间态，其中2是特指提现后待确认提现是否成功，5是银行收到交易等待处理，6是交易正在处理）
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
    * STRING(50)，转入子账户账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InSubAcctNo")
    @Expose
    private String InSubAcctNo;

    /**
    * STRING(50)，转出子账户账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutSubAcctNo")
    @Expose
    private String OutSubAcctNo;

    /**
    * STRING(300)，失败信息（当提现失败时，返回交易失败原因）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailMsg")
    @Expose
    private String FailMsg;

    /**
    * STRING(50)，原前置流水号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OldTranFrontSeqNo")
    @Expose
    private String OldTranFrontSeqNo;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get String(20)，返回码 
     * @return TxnReturnCode String(20)，返回码
     */
    public String getTxnReturnCode() {
        return this.TxnReturnCode;
    }

    /**
     * Set String(20)，返回码
     * @param TxnReturnCode String(20)，返回码
     */
    public void setTxnReturnCode(String TxnReturnCode) {
        this.TxnReturnCode = TxnReturnCode;
    }

    /**
     * Get String(100)，返回信息 
     * @return TxnReturnMsg String(100)，返回信息
     */
    public String getTxnReturnMsg() {
        return this.TxnReturnMsg;
    }

    /**
     * Set String(100)，返回信息
     * @param TxnReturnMsg String(100)，返回信息
     */
    public void setTxnReturnMsg(String TxnReturnMsg) {
        this.TxnReturnMsg = TxnReturnMsg;
    }

    /**
     * Get String(22)，交易流水号 
     * @return CnsmrSeqNo String(22)，交易流水号
     */
    public String getCnsmrSeqNo() {
        return this.CnsmrSeqNo;
    }

    /**
     * Set String(22)，交易流水号
     * @param CnsmrSeqNo String(22)，交易流水号
     */
    public void setCnsmrSeqNo(String CnsmrSeqNo) {
        this.CnsmrSeqNo = CnsmrSeqNo;
    }

    /**
     * Get STRING(2)，记账标志（记账标志。1: 登记挂账; 2: 支付; 3: 提现; 4: 清分; 5: 下单预支付; 6: 确认并付款; 7: 退款; 8: 支付到平台; N: 其他）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BookingFlag STRING(2)，记账标志（记账标志。1: 登记挂账; 2: 支付; 3: 提现; 4: 清分; 5: 下单预支付; 6: 确认并付款; 7: 退款; 8: 支付到平台; N: 其他）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBookingFlag() {
        return this.BookingFlag;
    }

    /**
     * Set STRING(2)，记账标志（记账标志。1: 登记挂账; 2: 支付; 3: 提现; 4: 清分; 5: 下单预支付; 6: 确认并付款; 7: 退款; 8: 支付到平台; N: 其他）
注意：此字段可能返回 null，表示取不到有效值。
     * @param BookingFlag STRING(2)，记账标志（记账标志。1: 登记挂账; 2: 支付; 3: 提现; 4: 清分; 5: 下单预支付; 6: 确认并付款; 7: 退款; 8: 支付到平台; N: 其他）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBookingFlag(String BookingFlag) {
        this.BookingFlag = BookingFlag;
    }

    /**
     * Get STRING(32)，交易状态（0: 成功; 1: 失败; 2: 待确认; 5: 待处理; 6: 处理中。0和1是终态，2、5、6是中间态，其中2是特指提现后待确认提现是否成功，5是银行收到交易等待处理，6是交易正在处理）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranStatus STRING(32)，交易状态（0: 成功; 1: 失败; 2: 待确认; 5: 待处理; 6: 处理中。0和1是终态，2、5、6是中间态，其中2是特指提现后待确认提现是否成功，5是银行收到交易等待处理，6是交易正在处理）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTranStatus() {
        return this.TranStatus;
    }

    /**
     * Set STRING(32)，交易状态（0: 成功; 1: 失败; 2: 待确认; 5: 待处理; 6: 处理中。0和1是终态，2、5、6是中间态，其中2是特指提现后待确认提现是否成功，5是银行收到交易等待处理，6是交易正在处理）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranStatus STRING(32)，交易状态（0: 成功; 1: 失败; 2: 待确认; 5: 待处理; 6: 处理中。0和1是终态，2、5、6是中间态，其中2是特指提现后待确认提现是否成功，5是银行收到交易等待处理，6是交易正在处理）
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
     * Get STRING(50)，转入子账户账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InSubAcctNo STRING(50)，转入子账户账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInSubAcctNo() {
        return this.InSubAcctNo;
    }

    /**
     * Set STRING(50)，转入子账户账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param InSubAcctNo STRING(50)，转入子账户账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInSubAcctNo(String InSubAcctNo) {
        this.InSubAcctNo = InSubAcctNo;
    }

    /**
     * Get STRING(50)，转出子账户账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutSubAcctNo STRING(50)，转出子账户账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutSubAcctNo() {
        return this.OutSubAcctNo;
    }

    /**
     * Set STRING(50)，转出子账户账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutSubAcctNo STRING(50)，转出子账户账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutSubAcctNo(String OutSubAcctNo) {
        this.OutSubAcctNo = OutSubAcctNo;
    }

    /**
     * Get STRING(300)，失败信息（当提现失败时，返回交易失败原因）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailMsg STRING(300)，失败信息（当提现失败时，返回交易失败原因）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailMsg() {
        return this.FailMsg;
    }

    /**
     * Set STRING(300)，失败信息（当提现失败时，返回交易失败原因）
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailMsg STRING(300)，失败信息（当提现失败时，返回交易失败原因）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailMsg(String FailMsg) {
        this.FailMsg = FailMsg;
    }

    /**
     * Get STRING(50)，原前置流水号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OldTranFrontSeqNo STRING(50)，原前置流水号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOldTranFrontSeqNo() {
        return this.OldTranFrontSeqNo;
    }

    /**
     * Set STRING(50)，原前置流水号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OldTranFrontSeqNo STRING(50)，原前置流水号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOldTranFrontSeqNo(String OldTranFrontSeqNo) {
        this.OldTranFrontSeqNo = OldTranFrontSeqNo;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TxnReturnCode", this.TxnReturnCode);
        this.setParamSimple(map, prefix + "TxnReturnMsg", this.TxnReturnMsg);
        this.setParamSimple(map, prefix + "CnsmrSeqNo", this.CnsmrSeqNo);
        this.setParamSimple(map, prefix + "BookingFlag", this.BookingFlag);
        this.setParamSimple(map, prefix + "TranStatus", this.TranStatus);
        this.setParamSimple(map, prefix + "TranAmt", this.TranAmt);
        this.setParamSimple(map, prefix + "TranDate", this.TranDate);
        this.setParamSimple(map, prefix + "TranTime", this.TranTime);
        this.setParamSimple(map, prefix + "InSubAcctNo", this.InSubAcctNo);
        this.setParamSimple(map, prefix + "OutSubAcctNo", this.OutSubAcctNo);
        this.setParamSimple(map, prefix + "FailMsg", this.FailMsg);
        this.setParamSimple(map, prefix + "OldTranFrontSeqNo", this.OldTranFrontSeqNo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

