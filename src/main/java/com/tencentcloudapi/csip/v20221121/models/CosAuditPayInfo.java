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

public class CosAuditPayInfo extends AbstractModel {

    /**
    * APPID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 订单状态 0未购买 1正常，2隔离，3销毁，6试用中，7到期
    */
    @SerializedName("OrderStatus")
    @Expose
    private Long OrderStatus;

    /**
    * 已购对象存储数量
    */
    @SerializedName("BucketNum")
    @Expose
    private Long BucketNum;

    /**
    * 支付模式，0-后付费 1-预付费
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 是否单独购买，1-单独购买，2-被其它账号共享
    */
    @SerializedName("IsSelfBuy")
    @Expose
    private Long IsSelfBuy;

    /**
    * 订单开始时间
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 订单到期时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 0-用户未设置,1-用户设置自动续费,2-用户设置不自动续费
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * 订单时长
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 时长单位
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 资源id 
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 公测结束时间
    */
    @SerializedName("BetaEndTime")
    @Expose
    private String BetaEndTime;

    /**
    * 系统当前时间
    */
    @SerializedName("TimeNow")
    @Expose
    private String TimeNow;

    /**
    * 是否分享给其它账号，1-是，2-否
    */
    @SerializedName("IsShareToOther")
    @Expose
    private Long IsShareToOther;

    /**
    * uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 昵称
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 共享的bucketIdSet 
    */
    @SerializedName("BindBucket")
    @Expose
    private CosBucketId [] BindBucket;

    /**
    * 共享的appid
    */
    @SerializedName("SharedAppIdSet")
    @Expose
    private Long [] SharedAppIdSet;

    /**
    * 是否已经开启后付费
    */
    @SerializedName("PostPayStatus")
    @Expose
    private Long PostPayStatus;

    /**
    * 0：未做过试用期试用   1 ：做过试用期试用
    */
    @SerializedName("IsTestUser")
    @Expose
    private Long IsTestUser;

    /**
    * 剩余可用数
    */
    @SerializedName("AvailableBucketNum")
    @Expose
    private Long AvailableBucketNum;

    /**
    * 已开启的监测存储桶数
    */
    @SerializedName("MonitorBucketNum")
    @Expose
    private Long MonitorBucketNum;

    /**
    * 总的存储桶数
    */
    @SerializedName("TotalBucketNum")
    @Expose
    private Long TotalBucketNum;

    /**
     * Get APPID 
     * @return AppId APPID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set APPID
     * @param AppId APPID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 订单状态 0未购买 1正常，2隔离，3销毁，6试用中，7到期 
     * @return OrderStatus 订单状态 0未购买 1正常，2隔离，3销毁，6试用中，7到期
     */
    public Long getOrderStatus() {
        return this.OrderStatus;
    }

    /**
     * Set 订单状态 0未购买 1正常，2隔离，3销毁，6试用中，7到期
     * @param OrderStatus 订单状态 0未购买 1正常，2隔离，3销毁，6试用中，7到期
     */
    public void setOrderStatus(Long OrderStatus) {
        this.OrderStatus = OrderStatus;
    }

    /**
     * Get 已购对象存储数量 
     * @return BucketNum 已购对象存储数量
     */
    public Long getBucketNum() {
        return this.BucketNum;
    }

    /**
     * Set 已购对象存储数量
     * @param BucketNum 已购对象存储数量
     */
    public void setBucketNum(Long BucketNum) {
        this.BucketNum = BucketNum;
    }

    /**
     * Get 支付模式，0-后付费 1-预付费 
     * @return PayMode 支付模式，0-后付费 1-预付费
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 支付模式，0-后付费 1-预付费
     * @param PayMode 支付模式，0-后付费 1-预付费
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 是否单独购买，1-单独购买，2-被其它账号共享 
     * @return IsSelfBuy 是否单独购买，1-单独购买，2-被其它账号共享
     */
    public Long getIsSelfBuy() {
        return this.IsSelfBuy;
    }

    /**
     * Set 是否单独购买，1-单独购买，2-被其它账号共享
     * @param IsSelfBuy 是否单独购买，1-单独购买，2-被其它账号共享
     */
    public void setIsSelfBuy(Long IsSelfBuy) {
        this.IsSelfBuy = IsSelfBuy;
    }

    /**
     * Get 订单开始时间 
     * @return BeginTime 订单开始时间
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 订单开始时间
     * @param BeginTime 订单开始时间
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 订单到期时间 
     * @return EndTime 订单到期时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 订单到期时间
     * @param EndTime 订单到期时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 0-用户未设置,1-用户设置自动续费,2-用户设置不自动续费 
     * @return AutoRenew 0-用户未设置,1-用户设置自动续费,2-用户设置不自动续费
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set 0-用户未设置,1-用户设置自动续费,2-用户设置不自动续费
     * @param AutoRenew 0-用户未设置,1-用户设置自动续费,2-用户设置不自动续费
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get 订单时长 
     * @return TimeSpan 订单时长
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 订单时长
     * @param TimeSpan 订单时长
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 时长单位 
     * @return TimeUnit 时长单位
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 时长单位
     * @param TimeUnit 时长单位
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 资源id  
     * @return ResourceId 资源id 
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源id 
     * @param ResourceId 资源id 
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 公测结束时间 
     * @return BetaEndTime 公测结束时间
     */
    public String getBetaEndTime() {
        return this.BetaEndTime;
    }

    /**
     * Set 公测结束时间
     * @param BetaEndTime 公测结束时间
     */
    public void setBetaEndTime(String BetaEndTime) {
        this.BetaEndTime = BetaEndTime;
    }

    /**
     * Get 系统当前时间 
     * @return TimeNow 系统当前时间
     */
    public String getTimeNow() {
        return this.TimeNow;
    }

    /**
     * Set 系统当前时间
     * @param TimeNow 系统当前时间
     */
    public void setTimeNow(String TimeNow) {
        this.TimeNow = TimeNow;
    }

    /**
     * Get 是否分享给其它账号，1-是，2-否 
     * @return IsShareToOther 是否分享给其它账号，1-是，2-否
     */
    public Long getIsShareToOther() {
        return this.IsShareToOther;
    }

    /**
     * Set 是否分享给其它账号，1-是，2-否
     * @param IsShareToOther 是否分享给其它账号，1-是，2-否
     */
    public void setIsShareToOther(Long IsShareToOther) {
        this.IsShareToOther = IsShareToOther;
    }

    /**
     * Get uin 
     * @return Uin uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set uin
     * @param Uin uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 昵称 
     * @return NickName 昵称
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 昵称
     * @param NickName 昵称
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get 共享的bucketIdSet  
     * @return BindBucket 共享的bucketIdSet 
     */
    public CosBucketId [] getBindBucket() {
        return this.BindBucket;
    }

    /**
     * Set 共享的bucketIdSet 
     * @param BindBucket 共享的bucketIdSet 
     */
    public void setBindBucket(CosBucketId [] BindBucket) {
        this.BindBucket = BindBucket;
    }

    /**
     * Get 共享的appid 
     * @return SharedAppIdSet 共享的appid
     */
    public Long [] getSharedAppIdSet() {
        return this.SharedAppIdSet;
    }

    /**
     * Set 共享的appid
     * @param SharedAppIdSet 共享的appid
     */
    public void setSharedAppIdSet(Long [] SharedAppIdSet) {
        this.SharedAppIdSet = SharedAppIdSet;
    }

    /**
     * Get 是否已经开启后付费 
     * @return PostPayStatus 是否已经开启后付费
     */
    public Long getPostPayStatus() {
        return this.PostPayStatus;
    }

    /**
     * Set 是否已经开启后付费
     * @param PostPayStatus 是否已经开启后付费
     */
    public void setPostPayStatus(Long PostPayStatus) {
        this.PostPayStatus = PostPayStatus;
    }

    /**
     * Get 0：未做过试用期试用   1 ：做过试用期试用 
     * @return IsTestUser 0：未做过试用期试用   1 ：做过试用期试用
     */
    public Long getIsTestUser() {
        return this.IsTestUser;
    }

    /**
     * Set 0：未做过试用期试用   1 ：做过试用期试用
     * @param IsTestUser 0：未做过试用期试用   1 ：做过试用期试用
     */
    public void setIsTestUser(Long IsTestUser) {
        this.IsTestUser = IsTestUser;
    }

    /**
     * Get 剩余可用数 
     * @return AvailableBucketNum 剩余可用数
     */
    public Long getAvailableBucketNum() {
        return this.AvailableBucketNum;
    }

    /**
     * Set 剩余可用数
     * @param AvailableBucketNum 剩余可用数
     */
    public void setAvailableBucketNum(Long AvailableBucketNum) {
        this.AvailableBucketNum = AvailableBucketNum;
    }

    /**
     * Get 已开启的监测存储桶数 
     * @return MonitorBucketNum 已开启的监测存储桶数
     */
    public Long getMonitorBucketNum() {
        return this.MonitorBucketNum;
    }

    /**
     * Set 已开启的监测存储桶数
     * @param MonitorBucketNum 已开启的监测存储桶数
     */
    public void setMonitorBucketNum(Long MonitorBucketNum) {
        this.MonitorBucketNum = MonitorBucketNum;
    }

    /**
     * Get 总的存储桶数 
     * @return TotalBucketNum 总的存储桶数
     */
    public Long getTotalBucketNum() {
        return this.TotalBucketNum;
    }

    /**
     * Set 总的存储桶数
     * @param TotalBucketNum 总的存储桶数
     */
    public void setTotalBucketNum(Long TotalBucketNum) {
        this.TotalBucketNum = TotalBucketNum;
    }

    public CosAuditPayInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosAuditPayInfo(CosAuditPayInfo source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.OrderStatus != null) {
            this.OrderStatus = new Long(source.OrderStatus);
        }
        if (source.BucketNum != null) {
            this.BucketNum = new Long(source.BucketNum);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.IsSelfBuy != null) {
            this.IsSelfBuy = new Long(source.IsSelfBuy);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.BetaEndTime != null) {
            this.BetaEndTime = new String(source.BetaEndTime);
        }
        if (source.TimeNow != null) {
            this.TimeNow = new String(source.TimeNow);
        }
        if (source.IsShareToOther != null) {
            this.IsShareToOther = new Long(source.IsShareToOther);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.BindBucket != null) {
            this.BindBucket = new CosBucketId[source.BindBucket.length];
            for (int i = 0; i < source.BindBucket.length; i++) {
                this.BindBucket[i] = new CosBucketId(source.BindBucket[i]);
            }
        }
        if (source.SharedAppIdSet != null) {
            this.SharedAppIdSet = new Long[source.SharedAppIdSet.length];
            for (int i = 0; i < source.SharedAppIdSet.length; i++) {
                this.SharedAppIdSet[i] = new Long(source.SharedAppIdSet[i]);
            }
        }
        if (source.PostPayStatus != null) {
            this.PostPayStatus = new Long(source.PostPayStatus);
        }
        if (source.IsTestUser != null) {
            this.IsTestUser = new Long(source.IsTestUser);
        }
        if (source.AvailableBucketNum != null) {
            this.AvailableBucketNum = new Long(source.AvailableBucketNum);
        }
        if (source.MonitorBucketNum != null) {
            this.MonitorBucketNum = new Long(source.MonitorBucketNum);
        }
        if (source.TotalBucketNum != null) {
            this.TotalBucketNum = new Long(source.TotalBucketNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "OrderStatus", this.OrderStatus);
        this.setParamSimple(map, prefix + "BucketNum", this.BucketNum);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "IsSelfBuy", this.IsSelfBuy);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "BetaEndTime", this.BetaEndTime);
        this.setParamSimple(map, prefix + "TimeNow", this.TimeNow);
        this.setParamSimple(map, prefix + "IsShareToOther", this.IsShareToOther);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamArrayObj(map, prefix + "BindBucket.", this.BindBucket);
        this.setParamArraySimple(map, prefix + "SharedAppIdSet.", this.SharedAppIdSet);
        this.setParamSimple(map, prefix + "PostPayStatus", this.PostPayStatus);
        this.setParamSimple(map, prefix + "IsTestUser", this.IsTestUser);
        this.setParamSimple(map, prefix + "AvailableBucketNum", this.AvailableBucketNum);
        this.setParamSimple(map, prefix + "MonitorBucketNum", this.MonitorBucketNum);
        this.setParamSimple(map, prefix + "TotalBucketNum", this.TotalBucketNum);

    }
}

