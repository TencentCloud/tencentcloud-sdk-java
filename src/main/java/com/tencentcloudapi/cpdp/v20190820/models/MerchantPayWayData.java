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

public class MerchantPayWayData extends AbstractModel{

    /**
    * 支付币种
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayCurrency")
    @Expose
    private String PayCurrency;

    /**
    * 支付图标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayIcon")
    @Expose
    private String PayIcon;

    /**
    * 支付名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayInternalName")
    @Expose
    private String PayInternalName;

    /**
    * 支付简称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayName")
    @Expose
    private String PayName;

    /**
    * 是否支持退款
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaySplitRefund")
    @Expose
    private String PaySplitRefund;

    /**
    * 支付标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayTag")
    @Expose
    private String PayTag;

    /**
    * 支付凭证图标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayTicketIcon")
    @Expose
    private String PayTicketIcon;

    /**
    * 支付类型，逗号分隔
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayType")
    @Expose
    private String PayType;

    /**
    * 凭证名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TicketName")
    @Expose
    private String TicketName;

    /**
     * Get 支付币种
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayCurrency 支付币种
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayCurrency() {
        return this.PayCurrency;
    }

    /**
     * Set 支付币种
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayCurrency 支付币种
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayCurrency(String PayCurrency) {
        this.PayCurrency = PayCurrency;
    }

    /**
     * Get 支付图标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayIcon 支付图标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayIcon() {
        return this.PayIcon;
    }

    /**
     * Set 支付图标
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayIcon 支付图标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayIcon(String PayIcon) {
        this.PayIcon = PayIcon;
    }

    /**
     * Get 支付名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayInternalName 支付名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayInternalName() {
        return this.PayInternalName;
    }

    /**
     * Set 支付名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayInternalName 支付名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayInternalName(String PayInternalName) {
        this.PayInternalName = PayInternalName;
    }

    /**
     * Get 支付简称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayName 支付简称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayName() {
        return this.PayName;
    }

    /**
     * Set 支付简称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayName 支付简称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayName(String PayName) {
        this.PayName = PayName;
    }

    /**
     * Get 是否支持退款
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaySplitRefund 是否支持退款
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaySplitRefund() {
        return this.PaySplitRefund;
    }

    /**
     * Set 是否支持退款
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaySplitRefund 是否支持退款
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaySplitRefund(String PaySplitRefund) {
        this.PaySplitRefund = PaySplitRefund;
    }

    /**
     * Get 支付标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayTag 支付标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayTag() {
        return this.PayTag;
    }

    /**
     * Set 支付标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayTag 支付标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayTag(String PayTag) {
        this.PayTag = PayTag;
    }

    /**
     * Get 支付凭证图标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayTicketIcon 支付凭证图标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayTicketIcon() {
        return this.PayTicketIcon;
    }

    /**
     * Set 支付凭证图标
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayTicketIcon 支付凭证图标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayTicketIcon(String PayTicketIcon) {
        this.PayTicketIcon = PayTicketIcon;
    }

    /**
     * Get 支付类型，逗号分隔
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayType 支付类型，逗号分隔
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayType() {
        return this.PayType;
    }

    /**
     * Set 支付类型，逗号分隔
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayType 支付类型，逗号分隔
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayType(String PayType) {
        this.PayType = PayType;
    }

    /**
     * Get 凭证名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TicketName 凭证名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTicketName() {
        return this.TicketName;
    }

    /**
     * Set 凭证名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TicketName 凭证名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTicketName(String TicketName) {
        this.TicketName = TicketName;
    }

    public MerchantPayWayData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MerchantPayWayData(MerchantPayWayData source) {
        if (source.PayCurrency != null) {
            this.PayCurrency = new String(source.PayCurrency);
        }
        if (source.PayIcon != null) {
            this.PayIcon = new String(source.PayIcon);
        }
        if (source.PayInternalName != null) {
            this.PayInternalName = new String(source.PayInternalName);
        }
        if (source.PayName != null) {
            this.PayName = new String(source.PayName);
        }
        if (source.PaySplitRefund != null) {
            this.PaySplitRefund = new String(source.PaySplitRefund);
        }
        if (source.PayTag != null) {
            this.PayTag = new String(source.PayTag);
        }
        if (source.PayTicketIcon != null) {
            this.PayTicketIcon = new String(source.PayTicketIcon);
        }
        if (source.PayType != null) {
            this.PayType = new String(source.PayType);
        }
        if (source.TicketName != null) {
            this.TicketName = new String(source.TicketName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayCurrency", this.PayCurrency);
        this.setParamSimple(map, prefix + "PayIcon", this.PayIcon);
        this.setParamSimple(map, prefix + "PayInternalName", this.PayInternalName);
        this.setParamSimple(map, prefix + "PayName", this.PayName);
        this.setParamSimple(map, prefix + "PaySplitRefund", this.PaySplitRefund);
        this.setParamSimple(map, prefix + "PayTag", this.PayTag);
        this.setParamSimple(map, prefix + "PayTicketIcon", this.PayTicketIcon);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "TicketName", this.TicketName);

    }
}

