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

public class ContractOrderResponse extends AbstractModel {

    /**
    * 支付金额，单位： 分
    */
    @SerializedName("TotalAmt")
    @Expose
    private Long TotalAmt;

    /**
    * 应用支付订单号
    */
    @SerializedName("OutTradeNo")
    @Expose
    private String OutTradeNo;

    /**
    * 支付参数透传给聚鑫SDK（原文透传给SDK即可，不需要解码）
    */
    @SerializedName("PayInfo")
    @Expose
    private String PayInfo;

    /**
    * 聚鑫的交易订单号
    */
    @SerializedName("TransactionId")
    @Expose
    private String TransactionId;

    /**
    * 外部签约协议号
    */
    @SerializedName("OutContractCode")
    @Expose
    private String OutContractCode;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 支付金额，单位： 分 
     * @return TotalAmt 支付金额，单位： 分
     */
    public Long getTotalAmt() {
        return this.TotalAmt;
    }

    /**
     * Set 支付金额，单位： 分
     * @param TotalAmt 支付金额，单位： 分
     */
    public void setTotalAmt(Long TotalAmt) {
        this.TotalAmt = TotalAmt;
    }

    /**
     * Get 应用支付订单号 
     * @return OutTradeNo 应用支付订单号
     */
    public String getOutTradeNo() {
        return this.OutTradeNo;
    }

    /**
     * Set 应用支付订单号
     * @param OutTradeNo 应用支付订单号
     */
    public void setOutTradeNo(String OutTradeNo) {
        this.OutTradeNo = OutTradeNo;
    }

    /**
     * Get 支付参数透传给聚鑫SDK（原文透传给SDK即可，不需要解码） 
     * @return PayInfo 支付参数透传给聚鑫SDK（原文透传给SDK即可，不需要解码）
     */
    public String getPayInfo() {
        return this.PayInfo;
    }

    /**
     * Set 支付参数透传给聚鑫SDK（原文透传给SDK即可，不需要解码）
     * @param PayInfo 支付参数透传给聚鑫SDK（原文透传给SDK即可，不需要解码）
     */
    public void setPayInfo(String PayInfo) {
        this.PayInfo = PayInfo;
    }

    /**
     * Get 聚鑫的交易订单号 
     * @return TransactionId 聚鑫的交易订单号
     */
    public String getTransactionId() {
        return this.TransactionId;
    }

    /**
     * Set 聚鑫的交易订单号
     * @param TransactionId 聚鑫的交易订单号
     */
    public void setTransactionId(String TransactionId) {
        this.TransactionId = TransactionId;
    }

    /**
     * Get 外部签约协议号 
     * @return OutContractCode 外部签约协议号
     */
    public String getOutContractCode() {
        return this.OutContractCode;
    }

    /**
     * Set 外部签约协议号
     * @param OutContractCode 外部签约协议号
     */
    public void setOutContractCode(String OutContractCode) {
        this.OutContractCode = OutContractCode;
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

    public ContractOrderResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContractOrderResponse(ContractOrderResponse source) {
        if (source.TotalAmt != null) {
            this.TotalAmt = new Long(source.TotalAmt);
        }
        if (source.OutTradeNo != null) {
            this.OutTradeNo = new String(source.OutTradeNo);
        }
        if (source.PayInfo != null) {
            this.PayInfo = new String(source.PayInfo);
        }
        if (source.TransactionId != null) {
            this.TransactionId = new String(source.TransactionId);
        }
        if (source.OutContractCode != null) {
            this.OutContractCode = new String(source.OutContractCode);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalAmt", this.TotalAmt);
        this.setParamSimple(map, prefix + "OutTradeNo", this.OutTradeNo);
        this.setParamSimple(map, prefix + "PayInfo", this.PayInfo);
        this.setParamSimple(map, prefix + "TransactionId", this.TransactionId);
        this.setParamSimple(map, prefix + "OutContractCode", this.OutContractCode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

