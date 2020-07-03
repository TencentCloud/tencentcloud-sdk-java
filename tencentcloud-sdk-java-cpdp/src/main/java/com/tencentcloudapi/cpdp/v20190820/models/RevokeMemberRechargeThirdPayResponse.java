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

public class RevokeMemberRechargeThirdPayResponse extends AbstractModel{

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
    * STRING(52)，前置流水号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrontSeqNo")
    @Expose
    private String FrontSeqNo;

    /**
    * STRING(300)，保留域1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReservedMsgOne")
    @Expose
    private String ReservedMsgOne;

    /**
    * STRING(300)，保留域2
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReservedMsgTwo")
    @Expose
    private String ReservedMsgTwo;

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
     * Get STRING(52)，前置流水号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrontSeqNo STRING(52)，前置流水号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrontSeqNo() {
        return this.FrontSeqNo;
    }

    /**
     * Set STRING(52)，前置流水号
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrontSeqNo STRING(52)，前置流水号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrontSeqNo(String FrontSeqNo) {
        this.FrontSeqNo = FrontSeqNo;
    }

    /**
     * Get STRING(300)，保留域1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReservedMsgOne STRING(300)，保留域1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReservedMsgOne() {
        return this.ReservedMsgOne;
    }

    /**
     * Set STRING(300)，保留域1
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReservedMsgOne STRING(300)，保留域1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReservedMsgOne(String ReservedMsgOne) {
        this.ReservedMsgOne = ReservedMsgOne;
    }

    /**
     * Get STRING(300)，保留域2
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReservedMsgTwo STRING(300)，保留域2
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReservedMsgTwo() {
        return this.ReservedMsgTwo;
    }

    /**
     * Set STRING(300)，保留域2
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReservedMsgTwo STRING(300)，保留域2
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReservedMsgTwo(String ReservedMsgTwo) {
        this.ReservedMsgTwo = ReservedMsgTwo;
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
        this.setParamSimple(map, prefix + "FrontSeqNo", this.FrontSeqNo);
        this.setParamSimple(map, prefix + "ReservedMsgOne", this.ReservedMsgOne);
        this.setParamSimple(map, prefix + "ReservedMsgTwo", this.ReservedMsgTwo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

