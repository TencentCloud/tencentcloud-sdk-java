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

public class DescribeDspmPayInfoResponse extends AbstractModel {

    /**
    * APPID
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * 订单状态 0未购买 1正常，2隔离，3销毁，6试用中，7到期
    */
    @SerializedName("OrderStatus")
    @Expose
    private Long OrderStatus;

    /**
    * 已购数据库实例数量
    */
    @SerializedName("AssetNum")
    @Expose
    private Long AssetNum;

    /**
    * 已购审计日志量（TB）
    */
    @SerializedName("LogStorage")
    @Expose
    private Float LogStorage;

    /**
    * 已使用数据库实例数量
    */
    @SerializedName("UsedAssetNum")
    @Expose
    private Long UsedAssetNum;

    /**
    * 已使用审计日志量（TB）
    */
    @SerializedName("UsedLogStorage")
    @Expose
    private Float UsedLogStorage;

    /**
    * 已购sql存储总量（单位百万）
    */
    @SerializedName("SqlTotal")
    @Expose
    private Long SqlTotal;

    /**
    * 已购sql qps
    */
    @SerializedName("SqlQps")
    @Expose
    private Long SqlQps;

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
    * 购买信息
    */
    @SerializedName("InquireData")
    @Expose
    private InquireInfo [] InquireData;

    /**
    * 版本(专业版：professional 试用版：trial)
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get APPID 
     * @return AppID APPID
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set APPID
     * @param AppID APPID
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
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
     * Get 已购数据库实例数量 
     * @return AssetNum 已购数据库实例数量
     */
    public Long getAssetNum() {
        return this.AssetNum;
    }

    /**
     * Set 已购数据库实例数量
     * @param AssetNum 已购数据库实例数量
     */
    public void setAssetNum(Long AssetNum) {
        this.AssetNum = AssetNum;
    }

    /**
     * Get 已购审计日志量（TB） 
     * @return LogStorage 已购审计日志量（TB）
     */
    public Float getLogStorage() {
        return this.LogStorage;
    }

    /**
     * Set 已购审计日志量（TB）
     * @param LogStorage 已购审计日志量（TB）
     */
    public void setLogStorage(Float LogStorage) {
        this.LogStorage = LogStorage;
    }

    /**
     * Get 已使用数据库实例数量 
     * @return UsedAssetNum 已使用数据库实例数量
     */
    public Long getUsedAssetNum() {
        return this.UsedAssetNum;
    }

    /**
     * Set 已使用数据库实例数量
     * @param UsedAssetNum 已使用数据库实例数量
     */
    public void setUsedAssetNum(Long UsedAssetNum) {
        this.UsedAssetNum = UsedAssetNum;
    }

    /**
     * Get 已使用审计日志量（TB） 
     * @return UsedLogStorage 已使用审计日志量（TB）
     */
    public Float getUsedLogStorage() {
        return this.UsedLogStorage;
    }

    /**
     * Set 已使用审计日志量（TB）
     * @param UsedLogStorage 已使用审计日志量（TB）
     */
    public void setUsedLogStorage(Float UsedLogStorage) {
        this.UsedLogStorage = UsedLogStorage;
    }

    /**
     * Get 已购sql存储总量（单位百万） 
     * @return SqlTotal 已购sql存储总量（单位百万）
     */
    public Long getSqlTotal() {
        return this.SqlTotal;
    }

    /**
     * Set 已购sql存储总量（单位百万）
     * @param SqlTotal 已购sql存储总量（单位百万）
     */
    public void setSqlTotal(Long SqlTotal) {
        this.SqlTotal = SqlTotal;
    }

    /**
     * Get 已购sql qps 
     * @return SqlQps 已购sql qps
     */
    public Long getSqlQps() {
        return this.SqlQps;
    }

    /**
     * Set 已购sql qps
     * @param SqlQps 已购sql qps
     */
    public void setSqlQps(Long SqlQps) {
        this.SqlQps = SqlQps;
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
     * Get 购买信息 
     * @return InquireData 购买信息
     */
    public InquireInfo [] getInquireData() {
        return this.InquireData;
    }

    /**
     * Set 购买信息
     * @param InquireData 购买信息
     */
    public void setInquireData(InquireInfo [] InquireData) {
        this.InquireData = InquireData;
    }

    /**
     * Get 版本(专业版：professional 试用版：trial) 
     * @return Version 版本(专业版：professional 试用版：trial)
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 版本(专业版：professional 试用版：trial)
     * @param Version 版本(专业版：professional 试用版：trial)
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDspmPayInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDspmPayInfoResponse(DescribeDspmPayInfoResponse source) {
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.OrderStatus != null) {
            this.OrderStatus = new Long(source.OrderStatus);
        }
        if (source.AssetNum != null) {
            this.AssetNum = new Long(source.AssetNum);
        }
        if (source.LogStorage != null) {
            this.LogStorage = new Float(source.LogStorage);
        }
        if (source.UsedAssetNum != null) {
            this.UsedAssetNum = new Long(source.UsedAssetNum);
        }
        if (source.UsedLogStorage != null) {
            this.UsedLogStorage = new Float(source.UsedLogStorage);
        }
        if (source.SqlTotal != null) {
            this.SqlTotal = new Long(source.SqlTotal);
        }
        if (source.SqlQps != null) {
            this.SqlQps = new Long(source.SqlQps);
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
        if (source.InquireData != null) {
            this.InquireData = new InquireInfo[source.InquireData.length];
            for (int i = 0; i < source.InquireData.length; i++) {
                this.InquireData[i] = new InquireInfo(source.InquireData[i]);
            }
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "OrderStatus", this.OrderStatus);
        this.setParamSimple(map, prefix + "AssetNum", this.AssetNum);
        this.setParamSimple(map, prefix + "LogStorage", this.LogStorage);
        this.setParamSimple(map, prefix + "UsedAssetNum", this.UsedAssetNum);
        this.setParamSimple(map, prefix + "UsedLogStorage", this.UsedLogStorage);
        this.setParamSimple(map, prefix + "SqlTotal", this.SqlTotal);
        this.setParamSimple(map, prefix + "SqlQps", this.SqlQps);
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
        this.setParamArrayObj(map, prefix + "InquireData.", this.InquireData);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

