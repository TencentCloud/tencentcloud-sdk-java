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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiscountDetail extends AbstractModel {

    /**
    * <p>计费时长。</p>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * <p>时间单位。<br>取值为：</p><ul><li>m - 月</li><li>d - 日</li></ul>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * <p>总价。</p><p>单位：元</p>
    */
    @SerializedName("TotalCost")
    @Expose
    private Float TotalCost;

    /**
    * <p>折后总价。</p><p>单位：元</p>
    */
    @SerializedName("RealTotalCost")
    @Expose
    private Float RealTotalCost;

    /**
    * <p>折扣。</p>
    */
    @SerializedName("Discount")
    @Expose
    private Float Discount;

    /**
    * <p>具体折扣详情。</p>
    */
    @SerializedName("PolicyDetail")
    @Expose
    private PolicyDetail PolicyDetail;

    /**
     * Get <p>计费时长。</p> 
     * @return TimeSpan <p>计费时长。</p>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set <p>计费时长。</p>
     * @param TimeSpan <p>计费时长。</p>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get <p>时间单位。<br>取值为：</p><ul><li>m - 月</li><li>d - 日</li></ul> 
     * @return TimeUnit <p>时间单位。<br>取值为：</p><ul><li>m - 月</li><li>d - 日</li></ul>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set <p>时间单位。<br>取值为：</p><ul><li>m - 月</li><li>d - 日</li></ul>
     * @param TimeUnit <p>时间单位。<br>取值为：</p><ul><li>m - 月</li><li>d - 日</li></ul>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get <p>总价。</p><p>单位：元</p> 
     * @return TotalCost <p>总价。</p><p>单位：元</p>
     */
    public Float getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set <p>总价。</p><p>单位：元</p>
     * @param TotalCost <p>总价。</p><p>单位：元</p>
     */
    public void setTotalCost(Float TotalCost) {
        this.TotalCost = TotalCost;
    }

    /**
     * Get <p>折后总价。</p><p>单位：元</p> 
     * @return RealTotalCost <p>折后总价。</p><p>单位：元</p>
     */
    public Float getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set <p>折后总价。</p><p>单位：元</p>
     * @param RealTotalCost <p>折后总价。</p><p>单位：元</p>
     */
    public void setRealTotalCost(Float RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get <p>折扣。</p> 
     * @return Discount <p>折扣。</p>
     */
    public Float getDiscount() {
        return this.Discount;
    }

    /**
     * Set <p>折扣。</p>
     * @param Discount <p>折扣。</p>
     */
    public void setDiscount(Float Discount) {
        this.Discount = Discount;
    }

    /**
     * Get <p>具体折扣详情。</p> 
     * @return PolicyDetail <p>具体折扣详情。</p>
     */
    public PolicyDetail getPolicyDetail() {
        return this.PolicyDetail;
    }

    /**
     * Set <p>具体折扣详情。</p>
     * @param PolicyDetail <p>具体折扣详情。</p>
     */
    public void setPolicyDetail(PolicyDetail PolicyDetail) {
        this.PolicyDetail = PolicyDetail;
    }

    public DiscountDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiscountDetail(DiscountDetail source) {
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new Float(source.TotalCost);
        }
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new Float(source.RealTotalCost);
        }
        if (source.Discount != null) {
            this.Discount = new Float(source.Discount);
        }
        if (source.PolicyDetail != null) {
            this.PolicyDetail = new PolicyDetail(source.PolicyDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamObj(map, prefix + "PolicyDetail.", this.PolicyDetail);

    }
}

