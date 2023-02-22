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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewDomainBatchRequest extends AbstractModel{

    /**
    * 域名续费的年限。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 批量续费的域名。
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 付费模式 0手动在线付费，1使用余额付费，2使用特惠包。
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 自动续费开关。有三个可选值：
0 表示关闭，不自动续费
1 表示开启，将自动续费
2 表示不处理，保留域名原有状态（默认值）
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 特惠包ID
    */
    @SerializedName("PackageResourceId")
    @Expose
    private String PackageResourceId;

    /**
    * 渠道来源，pc/miniprogram/h5等
    */
    @SerializedName("ChannelFrom")
    @Expose
    private String ChannelFrom;

    /**
    * 订单来源，common正常/dianshi_active点石活动等
    */
    @SerializedName("OrderFrom")
    @Expose
    private String OrderFrom;

    /**
    * 活动id
    */
    @SerializedName("ActivityId")
    @Expose
    private String ActivityId;

    /**
     * Get 域名续费的年限。 
     * @return Period 域名续费的年限。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 域名续费的年限。
     * @param Period 域名续费的年限。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 批量续费的域名。 
     * @return Domains 批量续费的域名。
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 批量续费的域名。
     * @param Domains 批量续费的域名。
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 付费模式 0手动在线付费，1使用余额付费，2使用特惠包。 
     * @return PayMode 付费模式 0手动在线付费，1使用余额付费，2使用特惠包。
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式 0手动在线付费，1使用余额付费，2使用特惠包。
     * @param PayMode 付费模式 0手动在线付费，1使用余额付费，2使用特惠包。
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 自动续费开关。有三个可选值：
0 表示关闭，不自动续费
1 表示开启，将自动续费
2 表示不处理，保留域名原有状态（默认值） 
     * @return AutoRenewFlag 自动续费开关。有三个可选值：
0 表示关闭，不自动续费
1 表示开启，将自动续费
2 表示不处理，保留域名原有状态（默认值）
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费开关。有三个可选值：
0 表示关闭，不自动续费
1 表示开启，将自动续费
2 表示不处理，保留域名原有状态（默认值）
     * @param AutoRenewFlag 自动续费开关。有三个可选值：
0 表示关闭，不自动续费
1 表示开启，将自动续费
2 表示不处理，保留域名原有状态（默认值）
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 特惠包ID 
     * @return PackageResourceId 特惠包ID
     */
    public String getPackageResourceId() {
        return this.PackageResourceId;
    }

    /**
     * Set 特惠包ID
     * @param PackageResourceId 特惠包ID
     */
    public void setPackageResourceId(String PackageResourceId) {
        this.PackageResourceId = PackageResourceId;
    }

    /**
     * Get 渠道来源，pc/miniprogram/h5等 
     * @return ChannelFrom 渠道来源，pc/miniprogram/h5等
     */
    public String getChannelFrom() {
        return this.ChannelFrom;
    }

    /**
     * Set 渠道来源，pc/miniprogram/h5等
     * @param ChannelFrom 渠道来源，pc/miniprogram/h5等
     */
    public void setChannelFrom(String ChannelFrom) {
        this.ChannelFrom = ChannelFrom;
    }

    /**
     * Get 订单来源，common正常/dianshi_active点石活动等 
     * @return OrderFrom 订单来源，common正常/dianshi_active点石活动等
     */
    public String getOrderFrom() {
        return this.OrderFrom;
    }

    /**
     * Set 订单来源，common正常/dianshi_active点石活动等
     * @param OrderFrom 订单来源，common正常/dianshi_active点石活动等
     */
    public void setOrderFrom(String OrderFrom) {
        this.OrderFrom = OrderFrom;
    }

    /**
     * Get 活动id 
     * @return ActivityId 活动id
     */
    public String getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set 活动id
     * @param ActivityId 活动id
     */
    public void setActivityId(String ActivityId) {
        this.ActivityId = ActivityId;
    }

    public RenewDomainBatchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewDomainBatchRequest(RenewDomainBatchRequest source) {
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.PackageResourceId != null) {
            this.PackageResourceId = new String(source.PackageResourceId);
        }
        if (source.ChannelFrom != null) {
            this.ChannelFrom = new String(source.ChannelFrom);
        }
        if (source.OrderFrom != null) {
            this.OrderFrom = new String(source.OrderFrom);
        }
        if (source.ActivityId != null) {
            this.ActivityId = new String(source.ActivityId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "PackageResourceId", this.PackageResourceId);
        this.setParamSimple(map, prefix + "ChannelFrom", this.ChannelFrom);
        this.setParamSimple(map, prefix + "OrderFrom", this.OrderFrom);
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);

    }
}

