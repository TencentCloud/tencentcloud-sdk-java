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

public class CloudSubRefundItem extends AbstractModel{

    /**
    * 渠道方应答的退款ID，透传处理
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelExternalRefundId")
    @Expose
    private String ChannelExternalRefundId;

    /**
    * 渠道方应答的订单号，透传处理
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelExternalOrderId")
    @Expose
    private String ChannelExternalOrderId;

    /**
    * 子单退款金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RefundAmt")
    @Expose
    private Long RefundAmt;

    /**
    * 子单订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubOutTradeNo")
    @Expose
    private String SubOutTradeNo;

    /**
    * 子单退款id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubRefundId")
    @Expose
    private String SubRefundId;

    /**
    * 子应用ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubAppId")
    @Expose
    private String SubAppId;

    /**
    * 渠道子单支付订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelSubOrderId")
    @Expose
    private String ChannelSubOrderId;

    /**
    * 渠道子退款订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelSubRefundId")
    @Expose
    private String ChannelSubRefundId;

    /**
     * Get 渠道方应答的退款ID，透传处理
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelExternalRefundId 渠道方应答的退款ID，透传处理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelExternalRefundId() {
        return this.ChannelExternalRefundId;
    }

    /**
     * Set 渠道方应答的退款ID，透传处理
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelExternalRefundId 渠道方应答的退款ID，透传处理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelExternalRefundId(String ChannelExternalRefundId) {
        this.ChannelExternalRefundId = ChannelExternalRefundId;
    }

    /**
     * Get 渠道方应答的订单号，透传处理
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelExternalOrderId 渠道方应答的订单号，透传处理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelExternalOrderId() {
        return this.ChannelExternalOrderId;
    }

    /**
     * Set 渠道方应答的订单号，透传处理
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelExternalOrderId 渠道方应答的订单号，透传处理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelExternalOrderId(String ChannelExternalOrderId) {
        this.ChannelExternalOrderId = ChannelExternalOrderId;
    }

    /**
     * Get 子单退款金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RefundAmt 子单退款金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRefundAmt() {
        return this.RefundAmt;
    }

    /**
     * Set 子单退款金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param RefundAmt 子单退款金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRefundAmt(Long RefundAmt) {
        this.RefundAmt = RefundAmt;
    }

    /**
     * Get 子单订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubOutTradeNo 子单订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubOutTradeNo() {
        return this.SubOutTradeNo;
    }

    /**
     * Set 子单订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubOutTradeNo 子单订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubOutTradeNo(String SubOutTradeNo) {
        this.SubOutTradeNo = SubOutTradeNo;
    }

    /**
     * Get 子单退款id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubRefundId 子单退款id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubRefundId() {
        return this.SubRefundId;
    }

    /**
     * Set 子单退款id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubRefundId 子单退款id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubRefundId(String SubRefundId) {
        this.SubRefundId = SubRefundId;
    }

    /**
     * Get 子应用ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubAppId 子应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 子应用ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubAppId 子应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubAppId(String SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 渠道子单支付订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelSubOrderId 渠道子单支付订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelSubOrderId() {
        return this.ChannelSubOrderId;
    }

    /**
     * Set 渠道子单支付订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelSubOrderId 渠道子单支付订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelSubOrderId(String ChannelSubOrderId) {
        this.ChannelSubOrderId = ChannelSubOrderId;
    }

    /**
     * Get 渠道子退款订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelSubRefundId 渠道子退款订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelSubRefundId() {
        return this.ChannelSubRefundId;
    }

    /**
     * Set 渠道子退款订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelSubRefundId 渠道子退款订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelSubRefundId(String ChannelSubRefundId) {
        this.ChannelSubRefundId = ChannelSubRefundId;
    }

    public CloudSubRefundItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudSubRefundItem(CloudSubRefundItem source) {
        if (source.ChannelExternalRefundId != null) {
            this.ChannelExternalRefundId = new String(source.ChannelExternalRefundId);
        }
        if (source.ChannelExternalOrderId != null) {
            this.ChannelExternalOrderId = new String(source.ChannelExternalOrderId);
        }
        if (source.RefundAmt != null) {
            this.RefundAmt = new Long(source.RefundAmt);
        }
        if (source.SubOutTradeNo != null) {
            this.SubOutTradeNo = new String(source.SubOutTradeNo);
        }
        if (source.SubRefundId != null) {
            this.SubRefundId = new String(source.SubRefundId);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new String(source.SubAppId);
        }
        if (source.ChannelSubOrderId != null) {
            this.ChannelSubOrderId = new String(source.ChannelSubOrderId);
        }
        if (source.ChannelSubRefundId != null) {
            this.ChannelSubRefundId = new String(source.ChannelSubRefundId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelExternalRefundId", this.ChannelExternalRefundId);
        this.setParamSimple(map, prefix + "ChannelExternalOrderId", this.ChannelExternalOrderId);
        this.setParamSimple(map, prefix + "RefundAmt", this.RefundAmt);
        this.setParamSimple(map, prefix + "SubOutTradeNo", this.SubOutTradeNo);
        this.setParamSimple(map, prefix + "SubRefundId", this.SubRefundId);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "ChannelSubOrderId", this.ChannelSubOrderId);
        this.setParamSimple(map, prefix + "ChannelSubRefundId", this.ChannelSubRefundId);

    }
}

