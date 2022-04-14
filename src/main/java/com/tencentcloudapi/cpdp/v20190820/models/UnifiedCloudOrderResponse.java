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

public class UnifiedCloudOrderResponse extends AbstractModel{

    /**
    * 米大师的交易订单号。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransactionId")
    @Expose
    private String TransactionId;

    /**
    * 开发者的支付订单号。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutTradeNo")
    @Expose
    private String OutTradeNo;

    /**
    * SDK的支付参数。
支付参数透传给米大师SDK（原文透传给SDK即可，不需要解码）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayInfo")
    @Expose
    private String PayInfo;

    /**
    * 支付金额，单位：分。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalAmt")
    @Expose
    private Long TotalAmt;

    /**
    * 渠道信息，用于拉起渠道支付。j
son字符串，注意此字段仅会在传入正确的PayScene入参时才会有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelInfo")
    @Expose
    private String ChannelInfo;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 米大师的交易订单号。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransactionId 米大师的交易订单号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTransactionId() {
        return this.TransactionId;
    }

    /**
     * Set 米大师的交易订单号。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransactionId 米大师的交易订单号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransactionId(String TransactionId) {
        this.TransactionId = TransactionId;
    }

    /**
     * Get 开发者的支付订单号。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutTradeNo 开发者的支付订单号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutTradeNo() {
        return this.OutTradeNo;
    }

    /**
     * Set 开发者的支付订单号。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutTradeNo 开发者的支付订单号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutTradeNo(String OutTradeNo) {
        this.OutTradeNo = OutTradeNo;
    }

    /**
     * Get SDK的支付参数。
支付参数透传给米大师SDK（原文透传给SDK即可，不需要解码）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayInfo SDK的支付参数。
支付参数透传给米大师SDK（原文透传给SDK即可，不需要解码）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayInfo() {
        return this.PayInfo;
    }

    /**
     * Set SDK的支付参数。
支付参数透传给米大师SDK（原文透传给SDK即可，不需要解码）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayInfo SDK的支付参数。
支付参数透传给米大师SDK（原文透传给SDK即可，不需要解码）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayInfo(String PayInfo) {
        this.PayInfo = PayInfo;
    }

    /**
     * Get 支付金额，单位：分。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalAmt 支付金额，单位：分。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalAmt() {
        return this.TotalAmt;
    }

    /**
     * Set 支付金额，单位：分。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalAmt 支付金额，单位：分。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalAmt(Long TotalAmt) {
        this.TotalAmt = TotalAmt;
    }

    /**
     * Get 渠道信息，用于拉起渠道支付。j
son字符串，注意此字段仅会在传入正确的PayScene入参时才会有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelInfo 渠道信息，用于拉起渠道支付。j
son字符串，注意此字段仅会在传入正确的PayScene入参时才会有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelInfo() {
        return this.ChannelInfo;
    }

    /**
     * Set 渠道信息，用于拉起渠道支付。j
son字符串，注意此字段仅会在传入正确的PayScene入参时才会有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelInfo 渠道信息，用于拉起渠道支付。j
son字符串，注意此字段仅会在传入正确的PayScene入参时才会有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelInfo(String ChannelInfo) {
        this.ChannelInfo = ChannelInfo;
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

    public UnifiedCloudOrderResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnifiedCloudOrderResponse(UnifiedCloudOrderResponse source) {
        if (source.TransactionId != null) {
            this.TransactionId = new String(source.TransactionId);
        }
        if (source.OutTradeNo != null) {
            this.OutTradeNo = new String(source.OutTradeNo);
        }
        if (source.PayInfo != null) {
            this.PayInfo = new String(source.PayInfo);
        }
        if (source.TotalAmt != null) {
            this.TotalAmt = new Long(source.TotalAmt);
        }
        if (source.ChannelInfo != null) {
            this.ChannelInfo = new String(source.ChannelInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TransactionId", this.TransactionId);
        this.setParamSimple(map, prefix + "OutTradeNo", this.OutTradeNo);
        this.setParamSimple(map, prefix + "PayInfo", this.PayInfo);
        this.setParamSimple(map, prefix + "TotalAmt", this.TotalAmt);
        this.setParamSimple(map, prefix + "ChannelInfo", this.ChannelInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

