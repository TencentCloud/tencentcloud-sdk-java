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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TradeInfo extends AbstractModel{

    /**
    * 交易订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * 上一次交易订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastDealName")
    @Expose
    private String LastDealName;

    /**
    * 实例规格，包括：micro、small、medium、large、xlarge、2xlarge等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceClass")
    @Expose
    private String InstanceClass;

    /**
    * 计费任务状态， normal(计费或待计费)、resizing(变配中)、reversing(冲正中，比较短暂的状态)、isolating(隔离中，比较短暂的状态)、isolated(已隔离)、offlining(下线中)、offlined(已下线)、notBilled(未计费)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TradeStatus")
    @Expose
    private String TradeStatus;

    /**
    * 到期时间，格式为"yyyy-mm-dd hh:mm:ss"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 下线时间，格式为"yyyy-mm-dd hh:mm:ss"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * 隔离时间，格式为"yyyy-mm-dd hh:mm:ss"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * 下线原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OfflineReason")
    @Expose
    private String OfflineReason;

    /**
    * 隔离原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsolateReason")
    @Expose
    private String IsolateReason;

    /**
    * 付费类型，包括：postpay(后付费)、prepay(预付费)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayType")
    @Expose
    private String PayType;

    /**
    * 任务计费类型，包括：billing(计费)、notBilling(不计费)、 promotions(促销活动中)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillingType")
    @Expose
    private String BillingType;

    /**
     * Get 交易订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DealName 交易订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set 交易订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param DealName 交易订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * Get 上一次交易订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastDealName 上一次交易订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastDealName() {
        return this.LastDealName;
    }

    /**
     * Set 上一次交易订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastDealName 上一次交易订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastDealName(String LastDealName) {
        this.LastDealName = LastDealName;
    }

    /**
     * Get 实例规格，包括：micro、small、medium、large、xlarge、2xlarge等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceClass 实例规格，包括：micro、small、medium、large、xlarge、2xlarge等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceClass() {
        return this.InstanceClass;
    }

    /**
     * Set 实例规格，包括：micro、small、medium、large、xlarge、2xlarge等
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceClass 实例规格，包括：micro、small、medium、large、xlarge、2xlarge等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceClass(String InstanceClass) {
        this.InstanceClass = InstanceClass;
    }

    /**
     * Get 计费任务状态， normal(计费或待计费)、resizing(变配中)、reversing(冲正中，比较短暂的状态)、isolating(隔离中，比较短暂的状态)、isolated(已隔离)、offlining(下线中)、offlined(已下线)、notBilled(未计费)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TradeStatus 计费任务状态， normal(计费或待计费)、resizing(变配中)、reversing(冲正中，比较短暂的状态)、isolating(隔离中，比较短暂的状态)、isolated(已隔离)、offlining(下线中)、offlined(已下线)、notBilled(未计费)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTradeStatus() {
        return this.TradeStatus;
    }

    /**
     * Set 计费任务状态， normal(计费或待计费)、resizing(变配中)、reversing(冲正中，比较短暂的状态)、isolating(隔离中，比较短暂的状态)、isolated(已隔离)、offlining(下线中)、offlined(已下线)、notBilled(未计费)
注意：此字段可能返回 null，表示取不到有效值。
     * @param TradeStatus 计费任务状态， normal(计费或待计费)、resizing(变配中)、reversing(冲正中，比较短暂的状态)、isolating(隔离中，比较短暂的状态)、isolated(已隔离)、offlining(下线中)、offlined(已下线)、notBilled(未计费)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTradeStatus(String TradeStatus) {
        this.TradeStatus = TradeStatus;
    }

    /**
     * Get 到期时间，格式为"yyyy-mm-dd hh:mm:ss"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 到期时间，格式为"yyyy-mm-dd hh:mm:ss"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 到期时间，格式为"yyyy-mm-dd hh:mm:ss"
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 到期时间，格式为"yyyy-mm-dd hh:mm:ss"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 下线时间，格式为"yyyy-mm-dd hh:mm:ss"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OfflineTime 下线时间，格式为"yyyy-mm-dd hh:mm:ss"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set 下线时间，格式为"yyyy-mm-dd hh:mm:ss"
注意：此字段可能返回 null，表示取不到有效值。
     * @param OfflineTime 下线时间，格式为"yyyy-mm-dd hh:mm:ss"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get 隔离时间，格式为"yyyy-mm-dd hh:mm:ss"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsolateTime 隔离时间，格式为"yyyy-mm-dd hh:mm:ss"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set 隔离时间，格式为"yyyy-mm-dd hh:mm:ss"
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsolateTime 隔离时间，格式为"yyyy-mm-dd hh:mm:ss"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get 下线原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OfflineReason 下线原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOfflineReason() {
        return this.OfflineReason;
    }

    /**
     * Set 下线原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param OfflineReason 下线原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOfflineReason(String OfflineReason) {
        this.OfflineReason = OfflineReason;
    }

    /**
     * Get 隔离原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsolateReason 隔离原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsolateReason() {
        return this.IsolateReason;
    }

    /**
     * Set 隔离原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsolateReason 隔离原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolateReason(String IsolateReason) {
        this.IsolateReason = IsolateReason;
    }

    /**
     * Get 付费类型，包括：postpay(后付费)、prepay(预付费)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayType 付费类型，包括：postpay(后付费)、prepay(预付费)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayType() {
        return this.PayType;
    }

    /**
     * Set 付费类型，包括：postpay(后付费)、prepay(预付费)
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayType 付费类型，包括：postpay(后付费)、prepay(预付费)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayType(String PayType) {
        this.PayType = PayType;
    }

    /**
     * Get 任务计费类型，包括：billing(计费)、notBilling(不计费)、 promotions(促销活动中)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillingType 任务计费类型，包括：billing(计费)、notBilling(不计费)、 promotions(促销活动中)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBillingType() {
        return this.BillingType;
    }

    /**
     * Set 任务计费类型，包括：billing(计费)、notBilling(不计费)、 promotions(促销活动中)
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillingType 任务计费类型，包括：billing(计费)、notBilling(不计费)、 promotions(促销活动中)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillingType(String BillingType) {
        this.BillingType = BillingType;
    }

    public TradeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TradeInfo(TradeInfo source) {
        if (source.DealName != null) {
            this.DealName = new String(source.DealName);
        }
        if (source.LastDealName != null) {
            this.LastDealName = new String(source.LastDealName);
        }
        if (source.InstanceClass != null) {
            this.InstanceClass = new String(source.InstanceClass);
        }
        if (source.TradeStatus != null) {
            this.TradeStatus = new String(source.TradeStatus);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.OfflineTime != null) {
            this.OfflineTime = new String(source.OfflineTime);
        }
        if (source.IsolateTime != null) {
            this.IsolateTime = new String(source.IsolateTime);
        }
        if (source.OfflineReason != null) {
            this.OfflineReason = new String(source.OfflineReason);
        }
        if (source.IsolateReason != null) {
            this.IsolateReason = new String(source.IsolateReason);
        }
        if (source.PayType != null) {
            this.PayType = new String(source.PayType);
        }
        if (source.BillingType != null) {
            this.BillingType = new String(source.BillingType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamSimple(map, prefix + "LastDealName", this.LastDealName);
        this.setParamSimple(map, prefix + "InstanceClass", this.InstanceClass);
        this.setParamSimple(map, prefix + "TradeStatus", this.TradeStatus);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "OfflineTime", this.OfflineTime);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);
        this.setParamSimple(map, prefix + "OfflineReason", this.OfflineReason);
        this.setParamSimple(map, prefix + "IsolateReason", this.IsolateReason);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "BillingType", this.BillingType);

    }
}

