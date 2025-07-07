/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryReconciliationDocumentResponse extends AbstractModel {

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
    * STRING(10)，本次交易返回查询结果记录数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultNum")
    @Expose
    private String ResultNum;

    /**
    * 交易信息数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranItemArray")
    @Expose
    private FileItem [] TranItemArray;

    /**
    * STRING(1027)，保留域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReservedMsg")
    @Expose
    private String ReservedMsg;

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
     * Get STRING(10)，本次交易返回查询结果记录数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultNum STRING(10)，本次交易返回查询结果记录数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResultNum() {
        return this.ResultNum;
    }

    /**
     * Set STRING(10)，本次交易返回查询结果记录数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultNum STRING(10)，本次交易返回查询结果记录数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultNum(String ResultNum) {
        this.ResultNum = ResultNum;
    }

    /**
     * Get 交易信息数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranItemArray 交易信息数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FileItem [] getTranItemArray() {
        return this.TranItemArray;
    }

    /**
     * Set 交易信息数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranItemArray 交易信息数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranItemArray(FileItem [] TranItemArray) {
        this.TranItemArray = TranItemArray;
    }

    /**
     * Get STRING(1027)，保留域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReservedMsg STRING(1027)，保留域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReservedMsg() {
        return this.ReservedMsg;
    }

    /**
     * Set STRING(1027)，保留域
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReservedMsg STRING(1027)，保留域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReservedMsg(String ReservedMsg) {
        this.ReservedMsg = ReservedMsg;
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

    public QueryReconciliationDocumentResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryReconciliationDocumentResponse(QueryReconciliationDocumentResponse source) {
        if (source.TxnReturnCode != null) {
            this.TxnReturnCode = new String(source.TxnReturnCode);
        }
        if (source.TxnReturnMsg != null) {
            this.TxnReturnMsg = new String(source.TxnReturnMsg);
        }
        if (source.CnsmrSeqNo != null) {
            this.CnsmrSeqNo = new String(source.CnsmrSeqNo);
        }
        if (source.ResultNum != null) {
            this.ResultNum = new String(source.ResultNum);
        }
        if (source.TranItemArray != null) {
            this.TranItemArray = new FileItem[source.TranItemArray.length];
            for (int i = 0; i < source.TranItemArray.length; i++) {
                this.TranItemArray[i] = new FileItem(source.TranItemArray[i]);
            }
        }
        if (source.ReservedMsg != null) {
            this.ReservedMsg = new String(source.ReservedMsg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TxnReturnCode", this.TxnReturnCode);
        this.setParamSimple(map, prefix + "TxnReturnMsg", this.TxnReturnMsg);
        this.setParamSimple(map, prefix + "CnsmrSeqNo", this.CnsmrSeqNo);
        this.setParamSimple(map, prefix + "ResultNum", this.ResultNum);
        this.setParamArrayObj(map, prefix + "TranItemArray.", this.TranItemArray);
        this.setParamSimple(map, prefix + "ReservedMsg", this.ReservedMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

