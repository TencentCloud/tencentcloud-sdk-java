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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserItem extends AbstractModel {

    /**
    * <p>登录用户appid</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>用户类型</p>
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * <p>用户付费类型</p>
    */
    @SerializedName("PayType")
    @Expose
    private Long PayType;

    /**
    * <p>总配额次数</p>
    */
    @SerializedName("TotalQuota")
    @Expose
    private Long TotalQuota;

    /**
    * <p>已消耗配额次数</p>
    */
    @SerializedName("CostQuota")
    @Expose
    private Long CostQuota;

    /**
    * <p>云厂商信息</p>
    */
    @SerializedName("Providers")
    @Expose
    private String [] Providers;

    /**
    * <p>refresh:下次仍会刷新;expire:下次不再刷新</p>
    */
    @SerializedName("QuotaFlushType")
    @Expose
    private String QuotaFlushType;

    /**
    * <p>下次配额刷新时间</p>
    */
    @SerializedName("QuotaFlushTime")
    @Expose
    private String QuotaFlushTime;

    /**
    * <p>购买类型</p>
    */
    @SerializedName("QuotaSource")
    @Expose
    private Long QuotaSource;

    /**
    * <p>被共享时为共享方appid，自购或无配额时为0</p>
    */
    @SerializedName("ShareFromAppID")
    @Expose
    private Long ShareFromAppID;

    /**
    * <p>配额共享方账号</p>
    */
    @SerializedName("ShareFromUser")
    @Expose
    private String ShareFromUser;

    /**
     * Get <p>登录用户appid</p> 
     * @return AppID <p>登录用户appid</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>登录用户appid</p>
     * @param AppID <p>登录用户appid</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>用户类型</p> 
     * @return AccountType <p>用户类型</p>
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set <p>用户类型</p>
     * @param AccountType <p>用户类型</p>
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get <p>用户付费类型</p> 
     * @return PayType <p>用户付费类型</p>
     */
    public Long getPayType() {
        return this.PayType;
    }

    /**
     * Set <p>用户付费类型</p>
     * @param PayType <p>用户付费类型</p>
     */
    public void setPayType(Long PayType) {
        this.PayType = PayType;
    }

    /**
     * Get <p>总配额次数</p> 
     * @return TotalQuota <p>总配额次数</p>
     */
    public Long getTotalQuota() {
        return this.TotalQuota;
    }

    /**
     * Set <p>总配额次数</p>
     * @param TotalQuota <p>总配额次数</p>
     */
    public void setTotalQuota(Long TotalQuota) {
        this.TotalQuota = TotalQuota;
    }

    /**
     * Get <p>已消耗配额次数</p> 
     * @return CostQuota <p>已消耗配额次数</p>
     */
    public Long getCostQuota() {
        return this.CostQuota;
    }

    /**
     * Set <p>已消耗配额次数</p>
     * @param CostQuota <p>已消耗配额次数</p>
     */
    public void setCostQuota(Long CostQuota) {
        this.CostQuota = CostQuota;
    }

    /**
     * Get <p>云厂商信息</p> 
     * @return Providers <p>云厂商信息</p>
     */
    public String [] getProviders() {
        return this.Providers;
    }

    /**
     * Set <p>云厂商信息</p>
     * @param Providers <p>云厂商信息</p>
     */
    public void setProviders(String [] Providers) {
        this.Providers = Providers;
    }

    /**
     * Get <p>refresh:下次仍会刷新;expire:下次不再刷新</p> 
     * @return QuotaFlushType <p>refresh:下次仍会刷新;expire:下次不再刷新</p>
     */
    public String getQuotaFlushType() {
        return this.QuotaFlushType;
    }

    /**
     * Set <p>refresh:下次仍会刷新;expire:下次不再刷新</p>
     * @param QuotaFlushType <p>refresh:下次仍会刷新;expire:下次不再刷新</p>
     */
    public void setQuotaFlushType(String QuotaFlushType) {
        this.QuotaFlushType = QuotaFlushType;
    }

    /**
     * Get <p>下次配额刷新时间</p> 
     * @return QuotaFlushTime <p>下次配额刷新时间</p>
     */
    public String getQuotaFlushTime() {
        return this.QuotaFlushTime;
    }

    /**
     * Set <p>下次配额刷新时间</p>
     * @param QuotaFlushTime <p>下次配额刷新时间</p>
     */
    public void setQuotaFlushTime(String QuotaFlushTime) {
        this.QuotaFlushTime = QuotaFlushTime;
    }

    /**
     * Get <p>购买类型</p> 
     * @return QuotaSource <p>购买类型</p>
     */
    public Long getQuotaSource() {
        return this.QuotaSource;
    }

    /**
     * Set <p>购买类型</p>
     * @param QuotaSource <p>购买类型</p>
     */
    public void setQuotaSource(Long QuotaSource) {
        this.QuotaSource = QuotaSource;
    }

    /**
     * Get <p>被共享时为共享方appid，自购或无配额时为0</p> 
     * @return ShareFromAppID <p>被共享时为共享方appid，自购或无配额时为0</p>
     */
    public Long getShareFromAppID() {
        return this.ShareFromAppID;
    }

    /**
     * Set <p>被共享时为共享方appid，自购或无配额时为0</p>
     * @param ShareFromAppID <p>被共享时为共享方appid，自购或无配额时为0</p>
     */
    public void setShareFromAppID(Long ShareFromAppID) {
        this.ShareFromAppID = ShareFromAppID;
    }

    /**
     * Get <p>配额共享方账号</p> 
     * @return ShareFromUser <p>配额共享方账号</p>
     */
    public String getShareFromUser() {
        return this.ShareFromUser;
    }

    /**
     * Set <p>配额共享方账号</p>
     * @param ShareFromUser <p>配额共享方账号</p>
     */
    public void setShareFromUser(String ShareFromUser) {
        this.ShareFromUser = ShareFromUser;
    }

    public UserItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserItem(UserItem source) {
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.AccountType != null) {
            this.AccountType = new Long(source.AccountType);
        }
        if (source.PayType != null) {
            this.PayType = new Long(source.PayType);
        }
        if (source.TotalQuota != null) {
            this.TotalQuota = new Long(source.TotalQuota);
        }
        if (source.CostQuota != null) {
            this.CostQuota = new Long(source.CostQuota);
        }
        if (source.Providers != null) {
            this.Providers = new String[source.Providers.length];
            for (int i = 0; i < source.Providers.length; i++) {
                this.Providers[i] = new String(source.Providers[i]);
            }
        }
        if (source.QuotaFlushType != null) {
            this.QuotaFlushType = new String(source.QuotaFlushType);
        }
        if (source.QuotaFlushTime != null) {
            this.QuotaFlushTime = new String(source.QuotaFlushTime);
        }
        if (source.QuotaSource != null) {
            this.QuotaSource = new Long(source.QuotaSource);
        }
        if (source.ShareFromAppID != null) {
            this.ShareFromAppID = new Long(source.ShareFromAppID);
        }
        if (source.ShareFromUser != null) {
            this.ShareFromUser = new String(source.ShareFromUser);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "TotalQuota", this.TotalQuota);
        this.setParamSimple(map, prefix + "CostQuota", this.CostQuota);
        this.setParamArraySimple(map, prefix + "Providers.", this.Providers);
        this.setParamSimple(map, prefix + "QuotaFlushType", this.QuotaFlushType);
        this.setParamSimple(map, prefix + "QuotaFlushTime", this.QuotaFlushTime);
        this.setParamSimple(map, prefix + "QuotaSource", this.QuotaSource);
        this.setParamSimple(map, prefix + "ShareFromAppID", this.ShareFromAppID);
        this.setParamSimple(map, prefix + "ShareFromUser", this.ShareFromUser);

    }
}

