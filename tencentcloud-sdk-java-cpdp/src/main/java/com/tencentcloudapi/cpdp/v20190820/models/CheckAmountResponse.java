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

public class CheckAmountResponse extends AbstractModel{

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
    * STRING(52)，见证系统流水号（即电商见证宝系统生成的流水号，可关联具体一笔请求）
    */
    @SerializedName("FrontSeqNo")
    @Expose
    private String FrontSeqNo;

    /**
    * STRING(1027)，保留域
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
     * Get STRING(52)，见证系统流水号（即电商见证宝系统生成的流水号，可关联具体一笔请求） 
     * @return FrontSeqNo STRING(52)，见证系统流水号（即电商见证宝系统生成的流水号，可关联具体一笔请求）
     */
    public String getFrontSeqNo() {
        return this.FrontSeqNo;
    }

    /**
     * Set STRING(52)，见证系统流水号（即电商见证宝系统生成的流水号，可关联具体一笔请求）
     * @param FrontSeqNo STRING(52)，见证系统流水号（即电商见证宝系统生成的流水号，可关联具体一笔请求）
     */
    public void setFrontSeqNo(String FrontSeqNo) {
        this.FrontSeqNo = FrontSeqNo;
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
        this.setParamSimple(map, prefix + "ReservedMsg", this.ReservedMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

