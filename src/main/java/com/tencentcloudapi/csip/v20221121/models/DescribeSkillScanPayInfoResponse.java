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

public class DescribeSkillScanPayInfoResponse extends AbstractModel {

    /**
    * <p>订单所属租户 AppID</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>订单状态<br>枚举值：<br>0：未购买<br>1：正常<br>2：隔离<br>6：试用中<br>7：已过期<br>8：试用到期</p>
    */
    @SerializedName("OrderStatus")
    @Expose
    private Long OrderStatus;

    /**
    * <p>总配额</p>
    */
    @SerializedName("TotalQuota")
    @Expose
    private Long TotalQuota;

    /**
    * <p>已消耗配额</p>
    */
    @SerializedName("UsedCount")
    @Expose
    private Long UsedCount;

    /**
    * <p>支付模式<br>枚举值：<br>0：后付费<br>1：预付费</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>自动续费标志<br>枚举值：<br>0：未设置<br>1：自动续费<br>2：不自动续费</p>
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * <p>资源ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>购买时长</p>
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
    * <p>公测结束时间，固定为 2026-06-30 23:59:59</p>
    */
    @SerializedName("BetaEndTime")
    @Expose
    private String BetaEndTime;

    /**
    * <p>服务器当前时间</p>
    */
    @SerializedName("TimeNow")
    @Expose
    private String TimeNow;

    /**
    * <p>租户 Uin</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>租户昵称</p>
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>订单所属租户 AppID</p> 
     * @return AppID <p>订单所属租户 AppID</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>订单所属租户 AppID</p>
     * @param AppID <p>订单所属租户 AppID</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>订单状态<br>枚举值：<br>0：未购买<br>1：正常<br>2：隔离<br>6：试用中<br>7：已过期<br>8：试用到期</p> 
     * @return OrderStatus <p>订单状态<br>枚举值：<br>0：未购买<br>1：正常<br>2：隔离<br>6：试用中<br>7：已过期<br>8：试用到期</p>
     */
    public Long getOrderStatus() {
        return this.OrderStatus;
    }

    /**
     * Set <p>订单状态<br>枚举值：<br>0：未购买<br>1：正常<br>2：隔离<br>6：试用中<br>7：已过期<br>8：试用到期</p>
     * @param OrderStatus <p>订单状态<br>枚举值：<br>0：未购买<br>1：正常<br>2：隔离<br>6：试用中<br>7：已过期<br>8：试用到期</p>
     */
    public void setOrderStatus(Long OrderStatus) {
        this.OrderStatus = OrderStatus;
    }

    /**
     * Get <p>总配额</p> 
     * @return TotalQuota <p>总配额</p>
     */
    public Long getTotalQuota() {
        return this.TotalQuota;
    }

    /**
     * Set <p>总配额</p>
     * @param TotalQuota <p>总配额</p>
     */
    public void setTotalQuota(Long TotalQuota) {
        this.TotalQuota = TotalQuota;
    }

    /**
     * Get <p>已消耗配额</p> 
     * @return UsedCount <p>已消耗配额</p>
     */
    public Long getUsedCount() {
        return this.UsedCount;
    }

    /**
     * Set <p>已消耗配额</p>
     * @param UsedCount <p>已消耗配额</p>
     */
    public void setUsedCount(Long UsedCount) {
        this.UsedCount = UsedCount;
    }

    /**
     * Get <p>支付模式<br>枚举值：<br>0：后付费<br>1：预付费</p> 
     * @return PayMode <p>支付模式<br>枚举值：<br>0：后付费<br>1：预付费</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>支付模式<br>枚举值：<br>0：后付费<br>1：预付费</p>
     * @param PayMode <p>支付模式<br>枚举值：<br>0：后付费<br>1：预付费</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>自动续费标志<br>枚举值：<br>0：未设置<br>1：自动续费<br>2：不自动续费</p> 
     * @return AutoRenew <p>自动续费标志<br>枚举值：<br>0：未设置<br>1：自动续费<br>2：不自动续费</p>
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set <p>自动续费标志<br>枚举值：<br>0：未设置<br>1：自动续费<br>2：不自动续费</p>
     * @param AutoRenew <p>自动续费标志<br>枚举值：<br>0：未设置<br>1：自动续费<br>2：不自动续费</p>
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get <p>资源ID</p> 
     * @return ResourceId <p>资源ID</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源ID</p>
     * @param ResourceId <p>资源ID</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>购买时长</p> 
     * @return TimeSpan <p>购买时长</p>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set <p>购买时长</p>
     * @param TimeSpan <p>购买时长</p>
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
     * Get <p>公测结束时间，固定为 2026-06-30 23:59:59</p> 
     * @return BetaEndTime <p>公测结束时间，固定为 2026-06-30 23:59:59</p>
     */
    public String getBetaEndTime() {
        return this.BetaEndTime;
    }

    /**
     * Set <p>公测结束时间，固定为 2026-06-30 23:59:59</p>
     * @param BetaEndTime <p>公测结束时间，固定为 2026-06-30 23:59:59</p>
     */
    public void setBetaEndTime(String BetaEndTime) {
        this.BetaEndTime = BetaEndTime;
    }

    /**
     * Get <p>服务器当前时间</p> 
     * @return TimeNow <p>服务器当前时间</p>
     */
    public String getTimeNow() {
        return this.TimeNow;
    }

    /**
     * Set <p>服务器当前时间</p>
     * @param TimeNow <p>服务器当前时间</p>
     */
    public void setTimeNow(String TimeNow) {
        this.TimeNow = TimeNow;
    }

    /**
     * Get <p>租户 Uin</p> 
     * @return Uin <p>租户 Uin</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>租户 Uin</p>
     * @param Uin <p>租户 Uin</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>租户昵称</p> 
     * @return NickName <p>租户昵称</p>
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set <p>租户昵称</p>
     * @param NickName <p>租户昵称</p>
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
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

    public DescribeSkillScanPayInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSkillScanPayInfoResponse(DescribeSkillScanPayInfoResponse source) {
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.OrderStatus != null) {
            this.OrderStatus = new Long(source.OrderStatus);
        }
        if (source.TotalQuota != null) {
            this.TotalQuota = new Long(source.TotalQuota);
        }
        if (source.UsedCount != null) {
            this.UsedCount = new Long(source.UsedCount);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.BetaEndTime != null) {
            this.BetaEndTime = new String(source.BetaEndTime);
        }
        if (source.TimeNow != null) {
            this.TimeNow = new String(source.TimeNow);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
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
        this.setParamSimple(map, prefix + "TotalQuota", this.TotalQuota);
        this.setParamSimple(map, prefix + "UsedCount", this.UsedCount);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "BetaEndTime", this.BetaEndTime);
        this.setParamSimple(map, prefix + "TimeNow", this.TimeNow);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

