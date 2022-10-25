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

public class QueryRefundResponse extends AbstractModel{

    /**
    * 退款状态码，退款提交成功后返回  1：退款中；  2：退款成功；  3：退款失败。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 支付机构订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelExternalOrderId")
    @Expose
    private String ChannelExternalOrderId;

    /**
    * 支付机构退款单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelExternalRefundId")
    @Expose
    private String ChannelExternalRefundId;

    /**
    * 渠道订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelOrderId")
    @Expose
    private String ChannelOrderId;

    /**
    * 退款总金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalRefundAmt")
    @Expose
    private Long TotalRefundAmt;

    /**
    * 货币类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrencyType")
    @Expose
    private String CurrencyType;

    /**
    * 外部订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutTradeNo")
    @Expose
    private String OutTradeNo;

    /**
    * 退款订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RefundId")
    @Expose
    private String RefundId;

    /**
    * 聚鑫分配的支付主MidasAppId
    */
    @SerializedName("MidasAppId")
    @Expose
    private String MidasAppId;

    /**
    * 指定退款订单号。与RefundId的区别是，UsedRefundId不会再做修饰，而RefundId则可能在查询退款处理时做了如添加前缀等的修饰
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsedRefundId")
    @Expose
    private String UsedRefundId;

    /**
    * 子单退款信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubRefundList")
    @Expose
    private OldSubRefund [] SubRefundList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 退款状态码，退款提交成功后返回  1：退款中；  2：退款成功；  3：退款失败。 
     * @return State 退款状态码，退款提交成功后返回  1：退款中；  2：退款成功；  3：退款失败。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 退款状态码，退款提交成功后返回  1：退款中；  2：退款成功；  3：退款失败。
     * @param State 退款状态码，退款提交成功后返回  1：退款中；  2：退款成功；  3：退款失败。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 支付机构订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelExternalOrderId 支付机构订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelExternalOrderId() {
        return this.ChannelExternalOrderId;
    }

    /**
     * Set 支付机构订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelExternalOrderId 支付机构订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelExternalOrderId(String ChannelExternalOrderId) {
        this.ChannelExternalOrderId = ChannelExternalOrderId;
    }

    /**
     * Get 支付机构退款单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelExternalRefundId 支付机构退款单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelExternalRefundId() {
        return this.ChannelExternalRefundId;
    }

    /**
     * Set 支付机构退款单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelExternalRefundId 支付机构退款单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelExternalRefundId(String ChannelExternalRefundId) {
        this.ChannelExternalRefundId = ChannelExternalRefundId;
    }

    /**
     * Get 渠道订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelOrderId 渠道订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelOrderId() {
        return this.ChannelOrderId;
    }

    /**
     * Set 渠道订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelOrderId 渠道订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelOrderId(String ChannelOrderId) {
        this.ChannelOrderId = ChannelOrderId;
    }

    /**
     * Get 退款总金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalRefundAmt 退款总金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalRefundAmt() {
        return this.TotalRefundAmt;
    }

    /**
     * Set 退款总金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalRefundAmt 退款总金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalRefundAmt(Long TotalRefundAmt) {
        this.TotalRefundAmt = TotalRefundAmt;
    }

    /**
     * Get 货币类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrencyType 货币类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCurrencyType() {
        return this.CurrencyType;
    }

    /**
     * Set 货币类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrencyType 货币类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrencyType(String CurrencyType) {
        this.CurrencyType = CurrencyType;
    }

    /**
     * Get 外部订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutTradeNo 外部订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutTradeNo() {
        return this.OutTradeNo;
    }

    /**
     * Set 外部订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutTradeNo 外部订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutTradeNo(String OutTradeNo) {
        this.OutTradeNo = OutTradeNo;
    }

    /**
     * Get 退款订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RefundId 退款订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRefundId() {
        return this.RefundId;
    }

    /**
     * Set 退款订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param RefundId 退款订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRefundId(String RefundId) {
        this.RefundId = RefundId;
    }

    /**
     * Get 聚鑫分配的支付主MidasAppId 
     * @return MidasAppId 聚鑫分配的支付主MidasAppId
     */
    public String getMidasAppId() {
        return this.MidasAppId;
    }

    /**
     * Set 聚鑫分配的支付主MidasAppId
     * @param MidasAppId 聚鑫分配的支付主MidasAppId
     */
    public void setMidasAppId(String MidasAppId) {
        this.MidasAppId = MidasAppId;
    }

    /**
     * Get 指定退款订单号。与RefundId的区别是，UsedRefundId不会再做修饰，而RefundId则可能在查询退款处理时做了如添加前缀等的修饰
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsedRefundId 指定退款订单号。与RefundId的区别是，UsedRefundId不会再做修饰，而RefundId则可能在查询退款处理时做了如添加前缀等的修饰
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsedRefundId() {
        return this.UsedRefundId;
    }

    /**
     * Set 指定退款订单号。与RefundId的区别是，UsedRefundId不会再做修饰，而RefundId则可能在查询退款处理时做了如添加前缀等的修饰
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsedRefundId 指定退款订单号。与RefundId的区别是，UsedRefundId不会再做修饰，而RefundId则可能在查询退款处理时做了如添加前缀等的修饰
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsedRefundId(String UsedRefundId) {
        this.UsedRefundId = UsedRefundId;
    }

    /**
     * Get 子单退款信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubRefundList 子单退款信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OldSubRefund [] getSubRefundList() {
        return this.SubRefundList;
    }

    /**
     * Set 子单退款信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubRefundList 子单退款信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubRefundList(OldSubRefund [] SubRefundList) {
        this.SubRefundList = SubRefundList;
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

    public QueryRefundResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryRefundResponse(QueryRefundResponse source) {
        if (source.State != null) {
            this.State = new String(source.State);
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
        if (source.TotalRefundAmt != null) {
            this.TotalRefundAmt = new Long(source.TotalRefundAmt);
        }
        if (source.CurrencyType != null) {
            this.CurrencyType = new String(source.CurrencyType);
        }
        if (source.OutTradeNo != null) {
            this.OutTradeNo = new String(source.OutTradeNo);
        }
        if (source.RefundId != null) {
            this.RefundId = new String(source.RefundId);
        }
        if (source.MidasAppId != null) {
            this.MidasAppId = new String(source.MidasAppId);
        }
        if (source.UsedRefundId != null) {
            this.UsedRefundId = new String(source.UsedRefundId);
        }
        if (source.SubRefundList != null) {
            this.SubRefundList = new OldSubRefund[source.SubRefundList.length];
            for (int i = 0; i < source.SubRefundList.length; i++) {
                this.SubRefundList[i] = new OldSubRefund(source.SubRefundList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "ChannelExternalOrderId", this.ChannelExternalOrderId);
        this.setParamSimple(map, prefix + "ChannelExternalRefundId", this.ChannelExternalRefundId);
        this.setParamSimple(map, prefix + "ChannelOrderId", this.ChannelOrderId);
        this.setParamSimple(map, prefix + "TotalRefundAmt", this.TotalRefundAmt);
        this.setParamSimple(map, prefix + "CurrencyType", this.CurrencyType);
        this.setParamSimple(map, prefix + "OutTradeNo", this.OutTradeNo);
        this.setParamSimple(map, prefix + "RefundId", this.RefundId);
        this.setParamSimple(map, prefix + "MidasAppId", this.MidasAppId);
        this.setParamSimple(map, prefix + "UsedRefundId", this.UsedRefundId);
        this.setParamArrayObj(map, prefix + "SubRefundList.", this.SubRefundList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

