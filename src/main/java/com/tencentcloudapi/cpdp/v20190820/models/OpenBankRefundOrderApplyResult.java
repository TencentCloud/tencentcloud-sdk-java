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

public class OpenBankRefundOrderApplyResult extends AbstractModel{

    /**
    * 云企付订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelOrderId")
    @Expose
    private String ChannelOrderId;

    /**
    * 云企付退款流水号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelRefundId")
    @Expose
    private String ChannelRefundId;

    /**
    * 外部商户退款单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutRefundId")
    @Expose
    private String OutRefundId;

    /**
    * 外部商户订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutOrderId")
    @Expose
    private String OutOrderId;

    /**
    * 退款返回描述，比如失败原因等。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RefundMessage")
    @Expose
    private String RefundMessage;

    /**
    * 退款金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RefundAmount")
    @Expose
    private Long RefundAmount;

    /**
    * 退款手续费金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FeeAmount")
    @Expose
    private Long FeeAmount;

    /**
    * 退款状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RefundStatus")
    @Expose
    private String RefundStatus;

    /**
     * Get 云企付订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelOrderId 云企付订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelOrderId() {
        return this.ChannelOrderId;
    }

    /**
     * Set 云企付订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelOrderId 云企付订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelOrderId(String ChannelOrderId) {
        this.ChannelOrderId = ChannelOrderId;
    }

    /**
     * Get 云企付退款流水号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelRefundId 云企付退款流水号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelRefundId() {
        return this.ChannelRefundId;
    }

    /**
     * Set 云企付退款流水号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelRefundId 云企付退款流水号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelRefundId(String ChannelRefundId) {
        this.ChannelRefundId = ChannelRefundId;
    }

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
     * Get 外部商户订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutOrderId 外部商户订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutOrderId() {
        return this.OutOrderId;
    }

    /**
     * Set 外部商户订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutOrderId 外部商户订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutOrderId(String OutOrderId) {
        this.OutOrderId = OutOrderId;
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

    /**
     * Get 退款金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RefundAmount 退款金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRefundAmount() {
        return this.RefundAmount;
    }

    /**
     * Set 退款金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param RefundAmount 退款金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRefundAmount(Long RefundAmount) {
        this.RefundAmount = RefundAmount;
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
     * Get 退款状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RefundStatus 退款状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRefundStatus() {
        return this.RefundStatus;
    }

    /**
     * Set 退款状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param RefundStatus 退款状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRefundStatus(String RefundStatus) {
        this.RefundStatus = RefundStatus;
    }

    public OpenBankRefundOrderApplyResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenBankRefundOrderApplyResult(OpenBankRefundOrderApplyResult source) {
        if (source.ChannelOrderId != null) {
            this.ChannelOrderId = new String(source.ChannelOrderId);
        }
        if (source.ChannelRefundId != null) {
            this.ChannelRefundId = new String(source.ChannelRefundId);
        }
        if (source.OutRefundId != null) {
            this.OutRefundId = new String(source.OutRefundId);
        }
        if (source.OutOrderId != null) {
            this.OutOrderId = new String(source.OutOrderId);
        }
        if (source.RefundMessage != null) {
            this.RefundMessage = new String(source.RefundMessage);
        }
        if (source.RefundAmount != null) {
            this.RefundAmount = new Long(source.RefundAmount);
        }
        if (source.FeeAmount != null) {
            this.FeeAmount = new Long(source.FeeAmount);
        }
        if (source.RefundStatus != null) {
            this.RefundStatus = new String(source.RefundStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelOrderId", this.ChannelOrderId);
        this.setParamSimple(map, prefix + "ChannelRefundId", this.ChannelRefundId);
        this.setParamSimple(map, prefix + "OutRefundId", this.OutRefundId);
        this.setParamSimple(map, prefix + "OutOrderId", this.OutOrderId);
        this.setParamSimple(map, prefix + "RefundMessage", this.RefundMessage);
        this.setParamSimple(map, prefix + "RefundAmount", this.RefundAmount);
        this.setParamSimple(map, prefix + "FeeAmount", this.FeeAmount);
        this.setParamSimple(map, prefix + "RefundStatus", this.RefundStatus);

    }
}

