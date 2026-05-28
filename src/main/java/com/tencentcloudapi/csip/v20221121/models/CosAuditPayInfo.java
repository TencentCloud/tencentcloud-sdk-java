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
    * <p>APPID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>订单状态 0未购买 1正常，2隔离，3销毁，6试用中，7到期</p>
    */
    @SerializedName("OrderStatus")
    @Expose
    private Long OrderStatus;

    /**
    * <p>已购对象存储数量</p>
    */
    @SerializedName("BucketNum")
    @Expose
    private Long BucketNum;

    /**
    * <p>支付模式，0-后付费 1-预付费</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>是否单独购买，1-单独购买，2-被其它账号共享</p>
    */
    @SerializedName("IsSelfBuy")
    @Expose
    private Long IsSelfBuy;

    /**
    * <p>订单开始时间</p>
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * <p>订单到期时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>0-用户未设置,1-用户设置自动续费,2-用户设置不自动续费</p>
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * <p>订单时长</p>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * <p>时长单位</p>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * <p>资源id</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>公测结束时间</p>
    */
    @SerializedName("BetaEndTime")
    @Expose
    private String BetaEndTime;

    /**
    * <p>系统当前时间</p>
    */
    @SerializedName("TimeNow")
    @Expose
    private String TimeNow;

    /**
    * <p>是否分享给其它账号，1-是，2-否</p>
    */
    @SerializedName("IsShareToOther")
    @Expose
    private Long IsShareToOther;

    /**
    * <p>uin</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>昵称</p>
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * <p>共享的bucketIdSet</p>
    */
    @SerializedName("BindBucket")
    @Expose
    private CosBucketId [] BindBucket;

    /**
    * <p>共享的appid</p>
    */
    @SerializedName("SharedAppIdSet")
    @Expose
    private Long [] SharedAppIdSet;

    /**
    * <p>是否已经开启后付费</p>
    */
    @SerializedName("PostPayStatus")
    @Expose
    private Long PostPayStatus;

    /**
    * <p>0：未做过试用期试用   1 ：做过试用期试用</p>
    */
    @SerializedName("IsTestUser")
    @Expose
    private Long IsTestUser;

    /**
    * <p>剩余可用数</p>
    */
    @SerializedName("AvailableBucketNum")
    @Expose
    private Long AvailableBucketNum;

    /**
    * <p>已开启的监测存储桶数</p>
    */
    @SerializedName("MonitorBucketNum")
    @Expose
    private Long MonitorBucketNum;

    /**
    * <p>总的存储桶数</p>
    */
    @SerializedName("TotalBucketNum")
    @Expose
    private Long TotalBucketNum;

    /**
    * <p>后付费产品开关状态</p>
    */
    @SerializedName("PostProductStatusList")
    @Expose
    private Long [] PostProductStatusList;

    /**
    * <p>后付费产品购买状态</p>
    */
    @SerializedName("PostProductBuyStatusList")
    @Expose
    private Long [] PostProductBuyStatusList;

    /**
    * <p>新后付费资源id</p>
    */
    @SerializedName("NewPostPayResourceId")
    @Expose
    private String NewPostPayResourceId;

    /**
     * Get <p>APPID</p> 
     * @return AppId <p>APPID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>APPID</p>
     * @param AppId <p>APPID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>订单状态 0未购买 1正常，2隔离，3销毁，6试用中，7到期</p> 
     * @return OrderStatus <p>订单状态 0未购买 1正常，2隔离，3销毁，6试用中，7到期</p>
     */
    public Long getOrderStatus() {
        return this.OrderStatus;
    }

    /**
     * Set <p>订单状态 0未购买 1正常，2隔离，3销毁，6试用中，7到期</p>
     * @param OrderStatus <p>订单状态 0未购买 1正常，2隔离，3销毁，6试用中，7到期</p>
     */
    public void setOrderStatus(Long OrderStatus) {
        this.OrderStatus = OrderStatus;
    }

    /**
     * Get <p>已购对象存储数量</p> 
     * @return BucketNum <p>已购对象存储数量</p>
     */
    public Long getBucketNum() {
        return this.BucketNum;
    }

    /**
     * Set <p>已购对象存储数量</p>
     * @param BucketNum <p>已购对象存储数量</p>
     */
    public void setBucketNum(Long BucketNum) {
        this.BucketNum = BucketNum;
    }

    /**
     * Get <p>支付模式，0-后付费 1-预付费</p> 
     * @return PayMode <p>支付模式，0-后付费 1-预付费</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>支付模式，0-后付费 1-预付费</p>
     * @param PayMode <p>支付模式，0-后付费 1-预付费</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>是否单独购买，1-单独购买，2-被其它账号共享</p> 
     * @return IsSelfBuy <p>是否单独购买，1-单独购买，2-被其它账号共享</p>
     */
    public Long getIsSelfBuy() {
        return this.IsSelfBuy;
    }

    /**
     * Set <p>是否单独购买，1-单独购买，2-被其它账号共享</p>
     * @param IsSelfBuy <p>是否单独购买，1-单独购买，2-被其它账号共享</p>
     */
    public void setIsSelfBuy(Long IsSelfBuy) {
        this.IsSelfBuy = IsSelfBuy;
    }

    /**
     * Get <p>订单开始时间</p> 
     * @return BeginTime <p>订单开始时间</p>
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>订单开始时间</p>
     * @param BeginTime <p>订单开始时间</p>
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>订单到期时间</p> 
     * @return EndTime <p>订单到期时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>订单到期时间</p>
     * @param EndTime <p>订单到期时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>0-用户未设置,1-用户设置自动续费,2-用户设置不自动续费</p> 
     * @return AutoRenew <p>0-用户未设置,1-用户设置自动续费,2-用户设置不自动续费</p>
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set <p>0-用户未设置,1-用户设置自动续费,2-用户设置不自动续费</p>
     * @param AutoRenew <p>0-用户未设置,1-用户设置自动续费,2-用户设置不自动续费</p>
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get <p>订单时长</p> 
     * @return TimeSpan <p>订单时长</p>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set <p>订单时长</p>
     * @param TimeSpan <p>订单时长</p>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get <p>时长单位</p> 
     * @return TimeUnit <p>时长单位</p>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set <p>时长单位</p>
     * @param TimeUnit <p>时长单位</p>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get <p>资源id</p> 
     * @return ResourceId <p>资源id</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源id</p>
     * @param ResourceId <p>资源id</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>公测结束时间</p> 
     * @return BetaEndTime <p>公测结束时间</p>
     */
    public String getBetaEndTime() {
        return this.BetaEndTime;
    }

    /**
     * Set <p>公测结束时间</p>
     * @param BetaEndTime <p>公测结束时间</p>
     */
    public void setBetaEndTime(String BetaEndTime) {
        this.BetaEndTime = BetaEndTime;
    }

    /**
     * Get <p>系统当前时间</p> 
     * @return TimeNow <p>系统当前时间</p>
     */
    public String getTimeNow() {
        return this.TimeNow;
    }

    /**
     * Set <p>系统当前时间</p>
     * @param TimeNow <p>系统当前时间</p>
     */
    public void setTimeNow(String TimeNow) {
        this.TimeNow = TimeNow;
    }

    /**
     * Get <p>是否分享给其它账号，1-是，2-否</p> 
     * @return IsShareToOther <p>是否分享给其它账号，1-是，2-否</p>
     */
    public Long getIsShareToOther() {
        return this.IsShareToOther;
    }

    /**
     * Set <p>是否分享给其它账号，1-是，2-否</p>
     * @param IsShareToOther <p>是否分享给其它账号，1-是，2-否</p>
     */
    public void setIsShareToOther(Long IsShareToOther) {
        this.IsShareToOther = IsShareToOther;
    }

    /**
     * Get <p>uin</p> 
     * @return Uin <p>uin</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>uin</p>
     * @param Uin <p>uin</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>昵称</p> 
     * @return NickName <p>昵称</p>
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set <p>昵称</p>
     * @param NickName <p>昵称</p>
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get <p>共享的bucketIdSet</p> 
     * @return BindBucket <p>共享的bucketIdSet</p>
     */
    public CosBucketId [] getBindBucket() {
        return this.BindBucket;
    }

    /**
     * Set <p>共享的bucketIdSet</p>
     * @param BindBucket <p>共享的bucketIdSet</p>
     */
    public void setBindBucket(CosBucketId [] BindBucket) {
        this.BindBucket = BindBucket;
    }

    /**
     * Get <p>共享的appid</p> 
     * @return SharedAppIdSet <p>共享的appid</p>
     */
    public Long [] getSharedAppIdSet() {
        return this.SharedAppIdSet;
    }

    /**
     * Set <p>共享的appid</p>
     * @param SharedAppIdSet <p>共享的appid</p>
     */
    public void setSharedAppIdSet(Long [] SharedAppIdSet) {
        this.SharedAppIdSet = SharedAppIdSet;
    }

    /**
     * Get <p>是否已经开启后付费</p> 
     * @return PostPayStatus <p>是否已经开启后付费</p>
     */
    public Long getPostPayStatus() {
        return this.PostPayStatus;
    }

    /**
     * Set <p>是否已经开启后付费</p>
     * @param PostPayStatus <p>是否已经开启后付费</p>
     */
    public void setPostPayStatus(Long PostPayStatus) {
        this.PostPayStatus = PostPayStatus;
    }

    /**
     * Get <p>0：未做过试用期试用   1 ：做过试用期试用</p> 
     * @return IsTestUser <p>0：未做过试用期试用   1 ：做过试用期试用</p>
     */
    public Long getIsTestUser() {
        return this.IsTestUser;
    }

    /**
     * Set <p>0：未做过试用期试用   1 ：做过试用期试用</p>
     * @param IsTestUser <p>0：未做过试用期试用   1 ：做过试用期试用</p>
     */
    public void setIsTestUser(Long IsTestUser) {
        this.IsTestUser = IsTestUser;
    }

    /**
     * Get <p>剩余可用数</p> 
     * @return AvailableBucketNum <p>剩余可用数</p>
     */
    public Long getAvailableBucketNum() {
        return this.AvailableBucketNum;
    }

    /**
     * Set <p>剩余可用数</p>
     * @param AvailableBucketNum <p>剩余可用数</p>
     */
    public void setAvailableBucketNum(Long AvailableBucketNum) {
        this.AvailableBucketNum = AvailableBucketNum;
    }

    /**
     * Get <p>已开启的监测存储桶数</p> 
     * @return MonitorBucketNum <p>已开启的监测存储桶数</p>
     */
    public Long getMonitorBucketNum() {
        return this.MonitorBucketNum;
    }

    /**
     * Set <p>已开启的监测存储桶数</p>
     * @param MonitorBucketNum <p>已开启的监测存储桶数</p>
     */
    public void setMonitorBucketNum(Long MonitorBucketNum) {
        this.MonitorBucketNum = MonitorBucketNum;
    }

    /**
     * Get <p>总的存储桶数</p> 
     * @return TotalBucketNum <p>总的存储桶数</p>
     */
    public Long getTotalBucketNum() {
        return this.TotalBucketNum;
    }

    /**
     * Set <p>总的存储桶数</p>
     * @param TotalBucketNum <p>总的存储桶数</p>
     */
    public void setTotalBucketNum(Long TotalBucketNum) {
        this.TotalBucketNum = TotalBucketNum;
    }

    /**
     * Get <p>后付费产品开关状态</p> 
     * @return PostProductStatusList <p>后付费产品开关状态</p>
     */
    public Long [] getPostProductStatusList() {
        return this.PostProductStatusList;
    }

    /**
     * Set <p>后付费产品开关状态</p>
     * @param PostProductStatusList <p>后付费产品开关状态</p>
     */
    public void setPostProductStatusList(Long [] PostProductStatusList) {
        this.PostProductStatusList = PostProductStatusList;
    }

    /**
     * Get <p>后付费产品购买状态</p> 
     * @return PostProductBuyStatusList <p>后付费产品购买状态</p>
     */
    public Long [] getPostProductBuyStatusList() {
        return this.PostProductBuyStatusList;
    }

    /**
     * Set <p>后付费产品购买状态</p>
     * @param PostProductBuyStatusList <p>后付费产品购买状态</p>
     */
    public void setPostProductBuyStatusList(Long [] PostProductBuyStatusList) {
        this.PostProductBuyStatusList = PostProductBuyStatusList;
    }

    /**
     * Get <p>新后付费资源id</p> 
     * @return NewPostPayResourceId <p>新后付费资源id</p>
     */
    public String getNewPostPayResourceId() {
        return this.NewPostPayResourceId;
    }

    /**
     * Set <p>新后付费资源id</p>
     * @param NewPostPayResourceId <p>新后付费资源id</p>
     */
    public void setNewPostPayResourceId(String NewPostPayResourceId) {
        this.NewPostPayResourceId = NewPostPayResourceId;
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
        if (source.PostProductStatusList != null) {
            this.PostProductStatusList = new Long[source.PostProductStatusList.length];
            for (int i = 0; i < source.PostProductStatusList.length; i++) {
                this.PostProductStatusList[i] = new Long(source.PostProductStatusList[i]);
            }
        }
        if (source.PostProductBuyStatusList != null) {
            this.PostProductBuyStatusList = new Long[source.PostProductBuyStatusList.length];
            for (int i = 0; i < source.PostProductBuyStatusList.length; i++) {
                this.PostProductBuyStatusList[i] = new Long(source.PostProductBuyStatusList[i]);
            }
        }
        if (source.NewPostPayResourceId != null) {
            this.NewPostPayResourceId = new String(source.NewPostPayResourceId);
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
        this.setParamArraySimple(map, prefix + "PostProductStatusList.", this.PostProductStatusList);
        this.setParamArraySimple(map, prefix + "PostProductBuyStatusList.", this.PostProductBuyStatusList);
        this.setParamSimple(map, prefix + "NewPostPayResourceId", this.NewPostPayResourceId);

    }
}

