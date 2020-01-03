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

public class QuerySingleTransactionStatusRequest extends AbstractModel{

    /**
    * String(22)，商户号（签约客户号）
    */
    @SerializedName("MrchCode")
    @Expose
    private String MrchCode;

    /**
    * STRING(2)，功能标志（2: 会员间交易; 3: 提现; 4: 充值）
    */
    @SerializedName("FunctionFlag")
    @Expose
    private String FunctionFlag;

    /**
    * STRING(52)，交易网流水号（提现，充值或会员交易请求时的CnsmrSeqNo值）
    */
    @SerializedName("TranNetSeqNo")
    @Expose
    private String TranNetSeqNo;

    /**
    * STRING(50)，见证子帐户的帐号（未启用）
    */
    @SerializedName("SubAcctNo")
    @Expose
    private String SubAcctNo;

    /**
    * STRING(8)，交易日期（未启用）
    */
    @SerializedName("TranDate")
    @Expose
    private String TranDate;

    /**
    * STRING(1027)，保留域
    */
    @SerializedName("ReservedMsg")
    @Expose
    private String ReservedMsg;

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
     * Get STRING(2)，功能标志（2: 会员间交易; 3: 提现; 4: 充值） 
     * @return FunctionFlag STRING(2)，功能标志（2: 会员间交易; 3: 提现; 4: 充值）
     */
    public String getFunctionFlag() {
        return this.FunctionFlag;
    }

    /**
     * Set STRING(2)，功能标志（2: 会员间交易; 3: 提现; 4: 充值）
     * @param FunctionFlag STRING(2)，功能标志（2: 会员间交易; 3: 提现; 4: 充值）
     */
    public void setFunctionFlag(String FunctionFlag) {
        this.FunctionFlag = FunctionFlag;
    }

    /**
     * Get STRING(52)，交易网流水号（提现，充值或会员交易请求时的CnsmrSeqNo值） 
     * @return TranNetSeqNo STRING(52)，交易网流水号（提现，充值或会员交易请求时的CnsmrSeqNo值）
     */
    public String getTranNetSeqNo() {
        return this.TranNetSeqNo;
    }

    /**
     * Set STRING(52)，交易网流水号（提现，充值或会员交易请求时的CnsmrSeqNo值）
     * @param TranNetSeqNo STRING(52)，交易网流水号（提现，充值或会员交易请求时的CnsmrSeqNo值）
     */
    public void setTranNetSeqNo(String TranNetSeqNo) {
        this.TranNetSeqNo = TranNetSeqNo;
    }

    /**
     * Get STRING(50)，见证子帐户的帐号（未启用） 
     * @return SubAcctNo STRING(50)，见证子帐户的帐号（未启用）
     */
    public String getSubAcctNo() {
        return this.SubAcctNo;
    }

    /**
     * Set STRING(50)，见证子帐户的帐号（未启用）
     * @param SubAcctNo STRING(50)，见证子帐户的帐号（未启用）
     */
    public void setSubAcctNo(String SubAcctNo) {
        this.SubAcctNo = SubAcctNo;
    }

    /**
     * Get STRING(8)，交易日期（未启用） 
     * @return TranDate STRING(8)，交易日期（未启用）
     */
    public String getTranDate() {
        return this.TranDate;
    }

    /**
     * Set STRING(8)，交易日期（未启用）
     * @param TranDate STRING(8)，交易日期（未启用）
     */
    public void setTranDate(String TranDate) {
        this.TranDate = TranDate;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MrchCode", this.MrchCode);
        this.setParamSimple(map, prefix + "FunctionFlag", this.FunctionFlag);
        this.setParamSimple(map, prefix + "TranNetSeqNo", this.TranNetSeqNo);
        this.setParamSimple(map, prefix + "SubAcctNo", this.SubAcctNo);
        this.setParamSimple(map, prefix + "TranDate", this.TranDate);
        this.setParamSimple(map, prefix + "ReservedMsg", this.ReservedMsg);

    }
}

