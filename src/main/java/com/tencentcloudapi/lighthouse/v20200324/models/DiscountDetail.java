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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiscountDetail extends AbstractModel{

    /**
    * 计费时长。
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 计费单元。
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 总价。
    */
    @SerializedName("TotalCost")
    @Expose
    private Float TotalCost;

    /**
    * 折后总价。
    */
    @SerializedName("RealTotalCost")
    @Expose
    private Float RealTotalCost;

    /**
    * 折扣。
    */
    @SerializedName("Discount")
    @Expose
    private Long Discount;

    /**
    * 具体折扣详情。
    */
    @SerializedName("PolicyDetail")
    @Expose
    private PolicyDetail PolicyDetail;

    /**
     * Get 计费时长。 
     * @return TimeSpan 计费时长。
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 计费时长。
     * @param TimeSpan 计费时长。
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 计费单元。 
     * @return TimeUnit 计费单元。
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 计费单元。
     * @param TimeUnit 计费单元。
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 总价。 
     * @return TotalCost 总价。
     */
    public Float getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set 总价。
     * @param TotalCost 总价。
     */
    public void setTotalCost(Float TotalCost) {
        this.TotalCost = TotalCost;
    }

    /**
     * Get 折后总价。 
     * @return RealTotalCost 折后总价。
     */
    public Float getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set 折后总价。
     * @param RealTotalCost 折后总价。
     */
    public void setRealTotalCost(Float RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get 折扣。 
     * @return Discount 折扣。
     */
    public Long getDiscount() {
        return this.Discount;
    }

    /**
     * Set 折扣。
     * @param Discount 折扣。
     */
    public void setDiscount(Long Discount) {
        this.Discount = Discount;
    }

    /**
     * Get 具体折扣详情。 
     * @return PolicyDetail 具体折扣详情。
     */
    public PolicyDetail getPolicyDetail() {
        return this.PolicyDetail;
    }

    /**
     * Set 具体折扣详情。
     * @param PolicyDetail 具体折扣详情。
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
            this.Discount = new Long(source.Discount);
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

