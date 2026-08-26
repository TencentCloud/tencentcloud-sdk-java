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

public class DescribeCSCPayInfoResponse extends AbstractModel {

    /**
    * <p>租户AppID。</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>订单状态。取值：0（未购买）、1（正常）、2（隔离）、3（销毁）、4（修改）、5（续费）、6（试用）、7（过期）、8（试用到期）。</p>
    */
    @SerializedName("OrderStatus")
    @Expose
    private Long OrderStatus;

    /**
    * <p>付费模式。取值：0（后付费）、1（预付费）。</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>订单开始时间，格式：2006-01-02 15:04:05。</p>
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * <p>订单结束时间，格式：2006-01-02 15:04:05。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>自动续费标志。取值：0（未设置）、1（自动续费）、2（不自动续费）。</p>
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * <p>购买时长。</p>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * <p>时间单位，如 m（月）。</p>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * <p>资源ID。</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>当前服务器时间，格式：2006-01-02 15:04:05。</p>
    */
    @SerializedName("TimeNow")
    @Expose
    private String TimeNow;

    /**
    * <p>账号UIN。</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>账号昵称。</p>
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * <p>是否为新用户。取值：1（新用户）、0（旧用户）。</p>
    */
    @SerializedName("NewUser")
    @Expose
    private Long NewUser;

    /**
    * <p>用户计费信息，Key为L4</p>
    */
    @SerializedName("QuotaList")
    @Expose
    private OrderQuotaInfo [] QuotaList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>租户AppID。</p> 
     * @return AppID <p>租户AppID。</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>租户AppID。</p>
     * @param AppID <p>租户AppID。</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>订单状态。取值：0（未购买）、1（正常）、2（隔离）、3（销毁）、4（修改）、5（续费）、6（试用）、7（过期）、8（试用到期）。</p> 
     * @return OrderStatus <p>订单状态。取值：0（未购买）、1（正常）、2（隔离）、3（销毁）、4（修改）、5（续费）、6（试用）、7（过期）、8（试用到期）。</p>
     */
    public Long getOrderStatus() {
        return this.OrderStatus;
    }

    /**
     * Set <p>订单状态。取值：0（未购买）、1（正常）、2（隔离）、3（销毁）、4（修改）、5（续费）、6（试用）、7（过期）、8（试用到期）。</p>
     * @param OrderStatus <p>订单状态。取值：0（未购买）、1（正常）、2（隔离）、3（销毁）、4（修改）、5（续费）、6（试用）、7（过期）、8（试用到期）。</p>
     */
    public void setOrderStatus(Long OrderStatus) {
        this.OrderStatus = OrderStatus;
    }

    /**
     * Get <p>付费模式。取值：0（后付费）、1（预付费）。</p> 
     * @return PayMode <p>付费模式。取值：0（后付费）、1（预付费）。</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>付费模式。取值：0（后付费）、1（预付费）。</p>
     * @param PayMode <p>付费模式。取值：0（后付费）、1（预付费）。</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>订单开始时间，格式：2006-01-02 15:04:05。</p> 
     * @return BeginTime <p>订单开始时间，格式：2006-01-02 15:04:05。</p>
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>订单开始时间，格式：2006-01-02 15:04:05。</p>
     * @param BeginTime <p>订单开始时间，格式：2006-01-02 15:04:05。</p>
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>订单结束时间，格式：2006-01-02 15:04:05。</p> 
     * @return EndTime <p>订单结束时间，格式：2006-01-02 15:04:05。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>订单结束时间，格式：2006-01-02 15:04:05。</p>
     * @param EndTime <p>订单结束时间，格式：2006-01-02 15:04:05。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>自动续费标志。取值：0（未设置）、1（自动续费）、2（不自动续费）。</p> 
     * @return AutoRenew <p>自动续费标志。取值：0（未设置）、1（自动续费）、2（不自动续费）。</p>
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set <p>自动续费标志。取值：0（未设置）、1（自动续费）、2（不自动续费）。</p>
     * @param AutoRenew <p>自动续费标志。取值：0（未设置）、1（自动续费）、2（不自动续费）。</p>
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get <p>购买时长。</p> 
     * @return TimeSpan <p>购买时长。</p>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set <p>购买时长。</p>
     * @param TimeSpan <p>购买时长。</p>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get <p>时间单位，如 m（月）。</p> 
     * @return TimeUnit <p>时间单位，如 m（月）。</p>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set <p>时间单位，如 m（月）。</p>
     * @param TimeUnit <p>时间单位，如 m（月）。</p>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get <p>资源ID。</p> 
     * @return ResourceId <p>资源ID。</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源ID。</p>
     * @param ResourceId <p>资源ID。</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>当前服务器时间，格式：2006-01-02 15:04:05。</p> 
     * @return TimeNow <p>当前服务器时间，格式：2006-01-02 15:04:05。</p>
     */
    public String getTimeNow() {
        return this.TimeNow;
    }

    /**
     * Set <p>当前服务器时间，格式：2006-01-02 15:04:05。</p>
     * @param TimeNow <p>当前服务器时间，格式：2006-01-02 15:04:05。</p>
     */
    public void setTimeNow(String TimeNow) {
        this.TimeNow = TimeNow;
    }

    /**
     * Get <p>账号UIN。</p> 
     * @return Uin <p>账号UIN。</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>账号UIN。</p>
     * @param Uin <p>账号UIN。</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>账号昵称。</p> 
     * @return NickName <p>账号昵称。</p>
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set <p>账号昵称。</p>
     * @param NickName <p>账号昵称。</p>
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get <p>是否为新用户。取值：1（新用户）、0（旧用户）。</p> 
     * @return NewUser <p>是否为新用户。取值：1（新用户）、0（旧用户）。</p>
     */
    public Long getNewUser() {
        return this.NewUser;
    }

    /**
     * Set <p>是否为新用户。取值：1（新用户）、0（旧用户）。</p>
     * @param NewUser <p>是否为新用户。取值：1（新用户）、0（旧用户）。</p>
     */
    public void setNewUser(Long NewUser) {
        this.NewUser = NewUser;
    }

    /**
     * Get <p>用户计费信息，Key为L4</p> 
     * @return QuotaList <p>用户计费信息，Key为L4</p>
     */
    public OrderQuotaInfo [] getQuotaList() {
        return this.QuotaList;
    }

    /**
     * Set <p>用户计费信息，Key为L4</p>
     * @param QuotaList <p>用户计费信息，Key为L4</p>
     */
    public void setQuotaList(OrderQuotaInfo [] QuotaList) {
        this.QuotaList = QuotaList;
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

    public DescribeCSCPayInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCSCPayInfoResponse(DescribeCSCPayInfoResponse source) {
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.OrderStatus != null) {
            this.OrderStatus = new Long(source.OrderStatus);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
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
        if (source.TimeNow != null) {
            this.TimeNow = new String(source.TimeNow);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.NewUser != null) {
            this.NewUser = new Long(source.NewUser);
        }
        if (source.QuotaList != null) {
            this.QuotaList = new OrderQuotaInfo[source.QuotaList.length];
            for (int i = 0; i < source.QuotaList.length; i++) {
                this.QuotaList[i] = new OrderQuotaInfo(source.QuotaList[i]);
            }
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
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "TimeNow", this.TimeNow);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "NewUser", this.NewUser);
        this.setParamArrayObj(map, prefix + "QuotaList.", this.QuotaList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

