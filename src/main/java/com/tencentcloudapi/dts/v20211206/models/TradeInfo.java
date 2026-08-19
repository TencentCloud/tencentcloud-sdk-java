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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TradeInfo extends AbstractModel {

    /**
    * <p>交易订单号</p>
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * <p>上一次交易订单号</p>
    */
    @SerializedName("LastDealName")
    @Expose
    private String LastDealName;

    /**
    * <p>实例规格，包括：micro、small、medium、large、xlarge、2xlarge等</p>
    */
    @SerializedName("InstanceClass")
    @Expose
    private String InstanceClass;

    /**
    * <p>计费任务状态， normal(计费或待计费)、resizing(变配中)、reversing(冲正中，比较短暂的状态)、isolating(隔离中，比较短暂的状态)、isolated(已隔离)、offlining(下线中)、offlined(已下线)、notBilled(未计费)</p>
    */
    @SerializedName("TradeStatus")
    @Expose
    private String TradeStatus;

    /**
    * <p>到期时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>下线时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * <p>隔离时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * <p>下线原因</p>
    */
    @SerializedName("OfflineReason")
    @Expose
    private String OfflineReason;

    /**
    * <p>隔离原因</p>
    */
    @SerializedName("IsolateReason")
    @Expose
    private String IsolateReason;

    /**
    * <p>付费类型，包括：postpay(后付费)、prepay(预付费)</p>
    */
    @SerializedName("PayType")
    @Expose
    private String PayType;

    /**
    * <p>任务计费类型，包括：billing(计费)、notBilling(不计费)、 promotions(促销活动中)</p>
    */
    @SerializedName("BillingType")
    @Expose
    private String BillingType;

    /**
     * Get <p>交易订单号</p> 
     * @return DealName <p>交易订单号</p>
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set <p>交易订单号</p>
     * @param DealName <p>交易订单号</p>
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * Get <p>上一次交易订单号</p> 
     * @return LastDealName <p>上一次交易订单号</p>
     */
    public String getLastDealName() {
        return this.LastDealName;
    }

    /**
     * Set <p>上一次交易订单号</p>
     * @param LastDealName <p>上一次交易订单号</p>
     */
    public void setLastDealName(String LastDealName) {
        this.LastDealName = LastDealName;
    }

    /**
     * Get <p>实例规格，包括：micro、small、medium、large、xlarge、2xlarge等</p> 
     * @return InstanceClass <p>实例规格，包括：micro、small、medium、large、xlarge、2xlarge等</p>
     */
    public String getInstanceClass() {
        return this.InstanceClass;
    }

    /**
     * Set <p>实例规格，包括：micro、small、medium、large、xlarge、2xlarge等</p>
     * @param InstanceClass <p>实例规格，包括：micro、small、medium、large、xlarge、2xlarge等</p>
     */
    public void setInstanceClass(String InstanceClass) {
        this.InstanceClass = InstanceClass;
    }

    /**
     * Get <p>计费任务状态， normal(计费或待计费)、resizing(变配中)、reversing(冲正中，比较短暂的状态)、isolating(隔离中，比较短暂的状态)、isolated(已隔离)、offlining(下线中)、offlined(已下线)、notBilled(未计费)</p> 
     * @return TradeStatus <p>计费任务状态， normal(计费或待计费)、resizing(变配中)、reversing(冲正中，比较短暂的状态)、isolating(隔离中，比较短暂的状态)、isolated(已隔离)、offlining(下线中)、offlined(已下线)、notBilled(未计费)</p>
     */
    public String getTradeStatus() {
        return this.TradeStatus;
    }

    /**
     * Set <p>计费任务状态， normal(计费或待计费)、resizing(变配中)、reversing(冲正中，比较短暂的状态)、isolating(隔离中，比较短暂的状态)、isolated(已隔离)、offlining(下线中)、offlined(已下线)、notBilled(未计费)</p>
     * @param TradeStatus <p>计费任务状态， normal(计费或待计费)、resizing(变配中)、reversing(冲正中，比较短暂的状态)、isolating(隔离中，比较短暂的状态)、isolated(已隔离)、offlining(下线中)、offlined(已下线)、notBilled(未计费)</p>
     */
    public void setTradeStatus(String TradeStatus) {
        this.TradeStatus = TradeStatus;
    }

    /**
     * Get <p>到期时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p> 
     * @return ExpireTime <p>到期时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>到期时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     * @param ExpireTime <p>到期时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>下线时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p> 
     * @return OfflineTime <p>下线时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set <p>下线时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     * @param OfflineTime <p>下线时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get <p>隔离时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p> 
     * @return IsolateTime <p>隔离时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set <p>隔离时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     * @param IsolateTime <p>隔离时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get <p>下线原因</p> 
     * @return OfflineReason <p>下线原因</p>
     */
    public String getOfflineReason() {
        return this.OfflineReason;
    }

    /**
     * Set <p>下线原因</p>
     * @param OfflineReason <p>下线原因</p>
     */
    public void setOfflineReason(String OfflineReason) {
        this.OfflineReason = OfflineReason;
    }

    /**
     * Get <p>隔离原因</p> 
     * @return IsolateReason <p>隔离原因</p>
     */
    public String getIsolateReason() {
        return this.IsolateReason;
    }

    /**
     * Set <p>隔离原因</p>
     * @param IsolateReason <p>隔离原因</p>
     */
    public void setIsolateReason(String IsolateReason) {
        this.IsolateReason = IsolateReason;
    }

    /**
     * Get <p>付费类型，包括：postpay(后付费)、prepay(预付费)</p> 
     * @return PayType <p>付费类型，包括：postpay(后付费)、prepay(预付费)</p>
     */
    public String getPayType() {
        return this.PayType;
    }

    /**
     * Set <p>付费类型，包括：postpay(后付费)、prepay(预付费)</p>
     * @param PayType <p>付费类型，包括：postpay(后付费)、prepay(预付费)</p>
     */
    public void setPayType(String PayType) {
        this.PayType = PayType;
    }

    /**
     * Get <p>任务计费类型，包括：billing(计费)、notBilling(不计费)、 promotions(促销活动中)</p> 
     * @return BillingType <p>任务计费类型，包括：billing(计费)、notBilling(不计费)、 promotions(促销活动中)</p>
     */
    public String getBillingType() {
        return this.BillingType;
    }

    /**
     * Set <p>任务计费类型，包括：billing(计费)、notBilling(不计费)、 promotions(促销活动中)</p>
     * @param BillingType <p>任务计费类型，包括：billing(计费)、notBilling(不计费)、 promotions(促销活动中)</p>
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

