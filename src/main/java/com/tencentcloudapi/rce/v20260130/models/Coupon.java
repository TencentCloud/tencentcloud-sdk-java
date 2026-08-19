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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Coupon extends AbstractModel {

    /**
    * <p>优惠券ID</p>
    */
    @SerializedName("CouponId")
    @Expose
    private String CouponId;

    /**
    * <p>优惠券名称</p>
    */
    @SerializedName("CouponName")
    @Expose
    private String CouponName;

    /**
    * <p>优惠券开始时间</p><p>参数格式：符合ISO 8601标准的带UTC时区的毫秒级时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>优惠券过期时间</p><p>参数格式：符合ISO 8601标准的带UTC时区的毫秒级时间</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>折扣百分比，如果折扣为 10%，则发送“0.1”</p>
    */
    @SerializedName("PercentageRate")
    @Expose
    private Float PercentageRate;

    /**
    * <p>折扣金额</p>
    */
    @SerializedName("DiscountAmount")
    @Expose
    private Amount DiscountAmount;

    /**
    * <p>优惠券门槛</p>
    */
    @SerializedName("Threshold")
    @Expose
    private Float Threshold;

    /**
     * Get <p>优惠券ID</p> 
     * @return CouponId <p>优惠券ID</p>
     */
    public String getCouponId() {
        return this.CouponId;
    }

    /**
     * Set <p>优惠券ID</p>
     * @param CouponId <p>优惠券ID</p>
     */
    public void setCouponId(String CouponId) {
        this.CouponId = CouponId;
    }

    /**
     * Get <p>优惠券名称</p> 
     * @return CouponName <p>优惠券名称</p>
     */
    public String getCouponName() {
        return this.CouponName;
    }

    /**
     * Set <p>优惠券名称</p>
     * @param CouponName <p>优惠券名称</p>
     */
    public void setCouponName(String CouponName) {
        this.CouponName = CouponName;
    }

    /**
     * Get <p>优惠券开始时间</p><p>参数格式：符合ISO 8601标准的带UTC时区的毫秒级时间</p> 
     * @return StartTime <p>优惠券开始时间</p><p>参数格式：符合ISO 8601标准的带UTC时区的毫秒级时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>优惠券开始时间</p><p>参数格式：符合ISO 8601标准的带UTC时区的毫秒级时间</p>
     * @param StartTime <p>优惠券开始时间</p><p>参数格式：符合ISO 8601标准的带UTC时区的毫秒级时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>优惠券过期时间</p><p>参数格式：符合ISO 8601标准的带UTC时区的毫秒级时间</p> 
     * @return ExpireTime <p>优惠券过期时间</p><p>参数格式：符合ISO 8601标准的带UTC时区的毫秒级时间</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>优惠券过期时间</p><p>参数格式：符合ISO 8601标准的带UTC时区的毫秒级时间</p>
     * @param ExpireTime <p>优惠券过期时间</p><p>参数格式：符合ISO 8601标准的带UTC时区的毫秒级时间</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>折扣百分比，如果折扣为 10%，则发送“0.1”</p> 
     * @return PercentageRate <p>折扣百分比，如果折扣为 10%，则发送“0.1”</p>
     */
    public Float getPercentageRate() {
        return this.PercentageRate;
    }

    /**
     * Set <p>折扣百分比，如果折扣为 10%，则发送“0.1”</p>
     * @param PercentageRate <p>折扣百分比，如果折扣为 10%，则发送“0.1”</p>
     */
    public void setPercentageRate(Float PercentageRate) {
        this.PercentageRate = PercentageRate;
    }

    /**
     * Get <p>折扣金额</p> 
     * @return DiscountAmount <p>折扣金额</p>
     */
    public Amount getDiscountAmount() {
        return this.DiscountAmount;
    }

    /**
     * Set <p>折扣金额</p>
     * @param DiscountAmount <p>折扣金额</p>
     */
    public void setDiscountAmount(Amount DiscountAmount) {
        this.DiscountAmount = DiscountAmount;
    }

    /**
     * Get <p>优惠券门槛</p> 
     * @return Threshold <p>优惠券门槛</p>
     */
    public Float getThreshold() {
        return this.Threshold;
    }

    /**
     * Set <p>优惠券门槛</p>
     * @param Threshold <p>优惠券门槛</p>
     */
    public void setThreshold(Float Threshold) {
        this.Threshold = Threshold;
    }

    public Coupon() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Coupon(Coupon source) {
        if (source.CouponId != null) {
            this.CouponId = new String(source.CouponId);
        }
        if (source.CouponName != null) {
            this.CouponName = new String(source.CouponName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.PercentageRate != null) {
            this.PercentageRate = new Float(source.PercentageRate);
        }
        if (source.DiscountAmount != null) {
            this.DiscountAmount = new Amount(source.DiscountAmount);
        }
        if (source.Threshold != null) {
            this.Threshold = new Float(source.Threshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CouponId", this.CouponId);
        this.setParamSimple(map, prefix + "CouponName", this.CouponName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "PercentageRate", this.PercentageRate);
        this.setParamObj(map, prefix + "DiscountAmount.", this.DiscountAmount);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);

    }
}

