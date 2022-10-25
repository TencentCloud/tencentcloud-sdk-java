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

public class OldSubRefund extends AbstractModel{

    /**
    * 支付机构退款流水号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelExternalRefundId")
    @Expose
    private String ChannelExternalRefundId;

    /**
    * 支付机构支付订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelExternalOrderId")
    @Expose
    private String ChannelExternalOrderId;

    /**
    * 渠道退款订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelRefundId")
    @Expose
    private String ChannelRefundId;

    /**
    * 子订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubOutTradeNo")
    @Expose
    private String SubOutTradeNo;

    /**
    * 子单退款金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RefundAmt")
    @Expose
    private String RefundAmt;

    /**
     * Get 支付机构退款流水号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelExternalRefundId 支付机构退款流水号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelExternalRefundId() {
        return this.ChannelExternalRefundId;
    }

    /**
     * Set 支付机构退款流水号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelExternalRefundId 支付机构退款流水号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelExternalRefundId(String ChannelExternalRefundId) {
        this.ChannelExternalRefundId = ChannelExternalRefundId;
    }

    /**
     * Get 支付机构支付订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelExternalOrderId 支付机构支付订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelExternalOrderId() {
        return this.ChannelExternalOrderId;
    }

    /**
     * Set 支付机构支付订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelExternalOrderId 支付机构支付订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelExternalOrderId(String ChannelExternalOrderId) {
        this.ChannelExternalOrderId = ChannelExternalOrderId;
    }

    /**
     * Get 渠道退款订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelRefundId 渠道退款订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelRefundId() {
        return this.ChannelRefundId;
    }

    /**
     * Set 渠道退款订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelRefundId 渠道退款订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelRefundId(String ChannelRefundId) {
        this.ChannelRefundId = ChannelRefundId;
    }

    /**
     * Get 子订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubOutTradeNo 子订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubOutTradeNo() {
        return this.SubOutTradeNo;
    }

    /**
     * Set 子订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubOutTradeNo 子订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubOutTradeNo(String SubOutTradeNo) {
        this.SubOutTradeNo = SubOutTradeNo;
    }

    /**
     * Get 子单退款金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RefundAmt 子单退款金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRefundAmt() {
        return this.RefundAmt;
    }

    /**
     * Set 子单退款金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param RefundAmt 子单退款金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRefundAmt(String RefundAmt) {
        this.RefundAmt = RefundAmt;
    }

    public OldSubRefund() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OldSubRefund(OldSubRefund source) {
        if (source.ChannelExternalRefundId != null) {
            this.ChannelExternalRefundId = new String(source.ChannelExternalRefundId);
        }
        if (source.ChannelExternalOrderId != null) {
            this.ChannelExternalOrderId = new String(source.ChannelExternalOrderId);
        }
        if (source.ChannelRefundId != null) {
            this.ChannelRefundId = new String(source.ChannelRefundId);
        }
        if (source.SubOutTradeNo != null) {
            this.SubOutTradeNo = new String(source.SubOutTradeNo);
        }
        if (source.RefundAmt != null) {
            this.RefundAmt = new String(source.RefundAmt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelExternalRefundId", this.ChannelExternalRefundId);
        this.setParamSimple(map, prefix + "ChannelExternalOrderId", this.ChannelExternalOrderId);
        this.setParamSimple(map, prefix + "ChannelRefundId", this.ChannelRefundId);
        this.setParamSimple(map, prefix + "SubOutTradeNo", this.SubOutTradeNo);
        this.setParamSimple(map, prefix + "RefundAmt", this.RefundAmt);

    }
}

