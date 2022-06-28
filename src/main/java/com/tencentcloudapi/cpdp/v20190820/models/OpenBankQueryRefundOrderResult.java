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

public class OpenBankQueryRefundOrderResult extends AbstractModel{

    /**
    * 外部商户退款单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutRefundId")
    @Expose
    private String OutRefundId;

    /**
    * 渠道退款单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelRefundId")
    @Expose
    private String ChannelRefundId;

    /**
    * 退款原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RefundReason")
    @Expose
    private String RefundReason;

    /**
    * 退款金额，单位分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RefundAmount")
    @Expose
    private Long RefundAmount;

    /**
    * 实际退款金额，单位分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealRefundAmount")
    @Expose
    private Long RealRefundAmount;

    /**
    * 原支付订单总金额，单位分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalAmount")
    @Expose
    private Long TotalAmount;

    /**
    * 退款完成时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeFinish")
    @Expose
    private String TimeFinish;

    /**
    * 退款订单状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RefundStatus")
    @Expose
    private String RefundStatus;

    /**
    * 退款明细信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RefundInfo")
    @Expose
    private String RefundInfo;

    /**
    * 退款手续费金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FeeAmount")
    @Expose
    private Long FeeAmount;

    /**
    * 退款返回描述，比如失败原因等。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RefundMessage")
    @Expose
    private String RefundMessage;

    /**
     * Get 外部商户退款单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutRefundId 外部商户退款单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutRefundId() {
        return this.OutRefundId;
    }

    /**
     * Set 外部商户退款单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutRefundId 外部商户退款单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutRefundId(String OutRefundId) {
        this.OutRefundId = OutRefundId;
    }

    /**
     * Get 渠道退款单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelRefundId 渠道退款单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelRefundId() {
        return this.ChannelRefundId;
    }

    /**
     * Set 渠道退款单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelRefundId 渠道退款单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelRefundId(String ChannelRefundId) {
        this.ChannelRefundId = ChannelRefundId;
    }

    /**
     * Get 退款原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RefundReason 退款原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRefundReason() {
        return this.RefundReason;
    }

    /**
     * Set 退款原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param RefundReason 退款原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRefundReason(String RefundReason) {
        this.RefundReason = RefundReason;
    }

    /**
     * Get 退款金额，单位分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RefundAmount 退款金额，单位分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRefundAmount() {
        return this.RefundAmount;
    }

    /**
     * Set 退款金额，单位分
注意：此字段可能返回 null，表示取不到有效值。
     * @param RefundAmount 退款金额，单位分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRefundAmount(Long RefundAmount) {
        this.RefundAmount = RefundAmount;
    }

    /**
     * Get 实际退款金额，单位分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealRefundAmount 实际退款金额，单位分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRealRefundAmount() {
        return this.RealRefundAmount;
    }

    /**
     * Set 实际退款金额，单位分
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealRefundAmount 实际退款金额，单位分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealRefundAmount(Long RealRefundAmount) {
        this.RealRefundAmount = RealRefundAmount;
    }

    /**
     * Get 原支付订单总金额，单位分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalAmount 原支付订单总金额，单位分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalAmount() {
        return this.TotalAmount;
    }

    /**
     * Set 原支付订单总金额，单位分
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalAmount 原支付订单总金额，单位分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalAmount(Long TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    /**
     * Get 退款完成时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeFinish 退款完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeFinish() {
        return this.TimeFinish;
    }

    /**
     * Set 退款完成时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeFinish 退款完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeFinish(String TimeFinish) {
        this.TimeFinish = TimeFinish;
    }

    /**
     * Get 退款订单状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RefundStatus 退款订单状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRefundStatus() {
        return this.RefundStatus;
    }

    /**
     * Set 退款订单状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param RefundStatus 退款订单状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRefundStatus(String RefundStatus) {
        this.RefundStatus = RefundStatus;
    }

    /**
     * Get 退款明细信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RefundInfo 退款明细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRefundInfo() {
        return this.RefundInfo;
    }

    /**
     * Set 退款明细信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param RefundInfo 退款明细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRefundInfo(String RefundInfo) {
        this.RefundInfo = RefundInfo;
    }

    /**
     * Get 退款手续费金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FeeAmount 退款手续费金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFeeAmount() {
        return this.FeeAmount;
    }

    /**
     * Set 退款手续费金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param FeeAmount 退款手续费金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFeeAmount(Long FeeAmount) {
        this.FeeAmount = FeeAmount;
    }

    /**
     * Get 退款返回描述，比如失败原因等。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RefundMessage 退款返回描述，比如失败原因等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRefundMessage() {
        return this.RefundMessage;
    }

    /**
     * Set 退款返回描述，比如失败原因等。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RefundMessage 退款返回描述，比如失败原因等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRefundMessage(String RefundMessage) {
        this.RefundMessage = RefundMessage;
    }

    public OpenBankQueryRefundOrderResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenBankQueryRefundOrderResult(OpenBankQueryRefundOrderResult source) {
        if (source.OutRefundId != null) {
            this.OutRefundId = new String(source.OutRefundId);
        }
        if (source.ChannelRefundId != null) {
            this.ChannelRefundId = new String(source.ChannelRefundId);
        }
        if (source.RefundReason != null) {
            this.RefundReason = new String(source.RefundReason);
        }
        if (source.RefundAmount != null) {
            this.RefundAmount = new Long(source.RefundAmount);
        }
        if (source.RealRefundAmount != null) {
            this.RealRefundAmount = new Long(source.RealRefundAmount);
        }
        if (source.TotalAmount != null) {
            this.TotalAmount = new Long(source.TotalAmount);
        }
        if (source.TimeFinish != null) {
            this.TimeFinish = new String(source.TimeFinish);
        }
        if (source.RefundStatus != null) {
            this.RefundStatus = new String(source.RefundStatus);
        }
        if (source.RefundInfo != null) {
            this.RefundInfo = new String(source.RefundInfo);
        }
        if (source.FeeAmount != null) {
            this.FeeAmount = new Long(source.FeeAmount);
        }
        if (source.RefundMessage != null) {
            this.RefundMessage = new String(source.RefundMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutRefundId", this.OutRefundId);
        this.setParamSimple(map, prefix + "ChannelRefundId", this.ChannelRefundId);
        this.setParamSimple(map, prefix + "RefundReason", this.RefundReason);
        this.setParamSimple(map, prefix + "RefundAmount", this.RefundAmount);
        this.setParamSimple(map, prefix + "RealRefundAmount", this.RealRefundAmount);
        this.setParamSimple(map, prefix + "TotalAmount", this.TotalAmount);
        this.setParamSimple(map, prefix + "TimeFinish", this.TimeFinish);
        this.setParamSimple(map, prefix + "RefundStatus", this.RefundStatus);
        this.setParamSimple(map, prefix + "RefundInfo", this.RefundInfo);
        this.setParamSimple(map, prefix + "FeeAmount", this.FeeAmount);
        this.setParamSimple(map, prefix + "RefundMessage", this.RefundMessage);

    }
}

