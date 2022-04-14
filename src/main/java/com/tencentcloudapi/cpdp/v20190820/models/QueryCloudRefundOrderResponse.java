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

public class QueryCloudRefundOrderResponse extends AbstractModel{

    /**
    * 该笔退款订单对应的UnifiedOrder下单时传入的OutTradeNo
    */
    @SerializedName("OutTradeNo")
    @Expose
    private String OutTradeNo;

    /**
    * 该笔退款订单对应的支付成功后支付机构返回的支付订单号
    */
    @SerializedName("ChannelExternalOrderId")
    @Expose
    private String ChannelExternalOrderId;

    /**
    * 该笔退款订单退款后支付机构返回的退款单号
    */
    @SerializedName("ChannelExternalRefundId")
    @Expose
    private String ChannelExternalRefundId;

    /**
    * 内部请求微信支付、银行等支付机构的订单号
    */
    @SerializedName("ChannelOrderId")
    @Expose
    private String ChannelOrderId;

    /**
    * 请求退款时传的退款ID后查询退款时传的RefundId
    */
    @SerializedName("RefundId")
    @Expose
    private String RefundId;

    /**
    * 被使用的RefundId，业务可忽略该字段
    */
    @SerializedName("UsedRefundId")
    @Expose
    private String UsedRefundId;

    /**
    * 退款总金额
    */
    @SerializedName("TotalRefundAmt")
    @Expose
    private Long TotalRefundAmt;

    /**
    * ISO货币代码
    */
    @SerializedName("CurrencyType")
    @Expose
    private String CurrencyType;

    /**
    * 退款状态码，退款提交成功后返回
1:退款中
2:退款成功
3:退款失败
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 子单退款信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubRefundList")
    @Expose
    private CloudSubRefundItem [] SubRefundList;

    /**
    * 透传字段，退款成功回调透传给应用，用于开发者透传自定义内容
    */
    @SerializedName("Metadata")
    @Expose
    private String Metadata;

    /**
    * 米大师分配的支付主MidasAppId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 该笔退款订单退款后内部返回的退款单号
    */
    @SerializedName("ChannelRefundId")
    @Expose
    private String ChannelRefundId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 该笔退款订单对应的UnifiedOrder下单时传入的OutTradeNo 
     * @return OutTradeNo 该笔退款订单对应的UnifiedOrder下单时传入的OutTradeNo
     */
    public String getOutTradeNo() {
        return this.OutTradeNo;
    }

    /**
     * Set 该笔退款订单对应的UnifiedOrder下单时传入的OutTradeNo
     * @param OutTradeNo 该笔退款订单对应的UnifiedOrder下单时传入的OutTradeNo
     */
    public void setOutTradeNo(String OutTradeNo) {
        this.OutTradeNo = OutTradeNo;
    }

    /**
     * Get 该笔退款订单对应的支付成功后支付机构返回的支付订单号 
     * @return ChannelExternalOrderId 该笔退款订单对应的支付成功后支付机构返回的支付订单号
     */
    public String getChannelExternalOrderId() {
        return this.ChannelExternalOrderId;
    }

    /**
     * Set 该笔退款订单对应的支付成功后支付机构返回的支付订单号
     * @param ChannelExternalOrderId 该笔退款订单对应的支付成功后支付机构返回的支付订单号
     */
    public void setChannelExternalOrderId(String ChannelExternalOrderId) {
        this.ChannelExternalOrderId = ChannelExternalOrderId;
    }

    /**
     * Get 该笔退款订单退款后支付机构返回的退款单号 
     * @return ChannelExternalRefundId 该笔退款订单退款后支付机构返回的退款单号
     */
    public String getChannelExternalRefundId() {
        return this.ChannelExternalRefundId;
    }

    /**
     * Set 该笔退款订单退款后支付机构返回的退款单号
     * @param ChannelExternalRefundId 该笔退款订单退款后支付机构返回的退款单号
     */
    public void setChannelExternalRefundId(String ChannelExternalRefundId) {
        this.ChannelExternalRefundId = ChannelExternalRefundId;
    }

    /**
     * Get 内部请求微信支付、银行等支付机构的订单号 
     * @return ChannelOrderId 内部请求微信支付、银行等支付机构的订单号
     */
    public String getChannelOrderId() {
        return this.ChannelOrderId;
    }

    /**
     * Set 内部请求微信支付、银行等支付机构的订单号
     * @param ChannelOrderId 内部请求微信支付、银行等支付机构的订单号
     */
    public void setChannelOrderId(String ChannelOrderId) {
        this.ChannelOrderId = ChannelOrderId;
    }

    /**
     * Get 请求退款时传的退款ID后查询退款时传的RefundId 
     * @return RefundId 请求退款时传的退款ID后查询退款时传的RefundId
     */
    public String getRefundId() {
        return this.RefundId;
    }

    /**
     * Set 请求退款时传的退款ID后查询退款时传的RefundId
     * @param RefundId 请求退款时传的退款ID后查询退款时传的RefundId
     */
    public void setRefundId(String RefundId) {
        this.RefundId = RefundId;
    }

    /**
     * Get 被使用的RefundId，业务可忽略该字段 
     * @return UsedRefundId 被使用的RefundId，业务可忽略该字段
     */
    public String getUsedRefundId() {
        return this.UsedRefundId;
    }

    /**
     * Set 被使用的RefundId，业务可忽略该字段
     * @param UsedRefundId 被使用的RefundId，业务可忽略该字段
     */
    public void setUsedRefundId(String UsedRefundId) {
        this.UsedRefundId = UsedRefundId;
    }

    /**
     * Get 退款总金额 
     * @return TotalRefundAmt 退款总金额
     */
    public Long getTotalRefundAmt() {
        return this.TotalRefundAmt;
    }

    /**
     * Set 退款总金额
     * @param TotalRefundAmt 退款总金额
     */
    public void setTotalRefundAmt(Long TotalRefundAmt) {
        this.TotalRefundAmt = TotalRefundAmt;
    }

    /**
     * Get ISO货币代码 
     * @return CurrencyType ISO货币代码
     */
    public String getCurrencyType() {
        return this.CurrencyType;
    }

    /**
     * Set ISO货币代码
     * @param CurrencyType ISO货币代码
     */
    public void setCurrencyType(String CurrencyType) {
        this.CurrencyType = CurrencyType;
    }

    /**
     * Get 退款状态码，退款提交成功后返回
1:退款中
2:退款成功
3:退款失败 
     * @return State 退款状态码，退款提交成功后返回
1:退款中
2:退款成功
3:退款失败
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 退款状态码，退款提交成功后返回
1:退款中
2:退款成功
3:退款失败
     * @param State 退款状态码，退款提交成功后返回
1:退款中
2:退款成功
3:退款失败
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 子单退款信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubRefundList 子单退款信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CloudSubRefundItem [] getSubRefundList() {
        return this.SubRefundList;
    }

    /**
     * Set 子单退款信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubRefundList 子单退款信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubRefundList(CloudSubRefundItem [] SubRefundList) {
        this.SubRefundList = SubRefundList;
    }

    /**
     * Get 透传字段，退款成功回调透传给应用，用于开发者透传自定义内容 
     * @return Metadata 透传字段，退款成功回调透传给应用，用于开发者透传自定义内容
     */
    public String getMetadata() {
        return this.Metadata;
    }

    /**
     * Set 透传字段，退款成功回调透传给应用，用于开发者透传自定义内容
     * @param Metadata 透传字段，退款成功回调透传给应用，用于开发者透传自定义内容
     */
    public void setMetadata(String Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get 米大师分配的支付主MidasAppId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 米大师分配的支付主MidasAppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 米大师分配的支付主MidasAppId
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 米大师分配的支付主MidasAppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 该笔退款订单退款后内部返回的退款单号 
     * @return ChannelRefundId 该笔退款订单退款后内部返回的退款单号
     */
    public String getChannelRefundId() {
        return this.ChannelRefundId;
    }

    /**
     * Set 该笔退款订单退款后内部返回的退款单号
     * @param ChannelRefundId 该笔退款订单退款后内部返回的退款单号
     */
    public void setChannelRefundId(String ChannelRefundId) {
        this.ChannelRefundId = ChannelRefundId;
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

    public QueryCloudRefundOrderResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryCloudRefundOrderResponse(QueryCloudRefundOrderResponse source) {
        if (source.OutTradeNo != null) {
            this.OutTradeNo = new String(source.OutTradeNo);
        }
        if (source.ChannelExternalOrderId != null) {
            this.ChannelExternalOrderId = new String(source.ChannelExternalOrderId);
        }
        if (source.ChannelExternalRefundId != null) {
            this.ChannelExternalRefundId = new String(source.ChannelExternalRefundId);
        }
        if (source.ChannelOrderId != null) {
            this.ChannelOrderId = new String(source.ChannelOrderId);
        }
        if (source.RefundId != null) {
            this.RefundId = new String(source.RefundId);
        }
        if (source.UsedRefundId != null) {
            this.UsedRefundId = new String(source.UsedRefundId);
        }
        if (source.TotalRefundAmt != null) {
            this.TotalRefundAmt = new Long(source.TotalRefundAmt);
        }
        if (source.CurrencyType != null) {
            this.CurrencyType = new String(source.CurrencyType);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.SubRefundList != null) {
            this.SubRefundList = new CloudSubRefundItem[source.SubRefundList.length];
            for (int i = 0; i < source.SubRefundList.length; i++) {
                this.SubRefundList[i] = new CloudSubRefundItem(source.SubRefundList[i]);
            }
        }
        if (source.Metadata != null) {
            this.Metadata = new String(source.Metadata);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.ChannelRefundId != null) {
            this.ChannelRefundId = new String(source.ChannelRefundId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutTradeNo", this.OutTradeNo);
        this.setParamSimple(map, prefix + "ChannelExternalOrderId", this.ChannelExternalOrderId);
        this.setParamSimple(map, prefix + "ChannelExternalRefundId", this.ChannelExternalRefundId);
        this.setParamSimple(map, prefix + "ChannelOrderId", this.ChannelOrderId);
        this.setParamSimple(map, prefix + "RefundId", this.RefundId);
        this.setParamSimple(map, prefix + "UsedRefundId", this.UsedRefundId);
        this.setParamSimple(map, prefix + "TotalRefundAmt", this.TotalRefundAmt);
        this.setParamSimple(map, prefix + "CurrencyType", this.CurrencyType);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamArrayObj(map, prefix + "SubRefundList.", this.SubRefundList);
        this.setParamSimple(map, prefix + "Metadata", this.Metadata);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ChannelRefundId", this.ChannelRefundId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

