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

public class Promotion extends AbstractModel {

    /**
    * <p>营销活动ID</p>
    */
    @SerializedName("PromotionId")
    @Expose
    private String PromotionId;

    /**
    * <p>营销活动名称</p>
    */
    @SerializedName("PromotionName")
    @Expose
    private String PromotionName;

    /**
    * <p>营销活动描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>邀请人ID</p>
    */
    @SerializedName("InviterUserId")
    @Expose
    private String InviterUserId;

    /**
    * <p>优惠券</p>
    */
    @SerializedName("Coupon")
    @Expose
    private Coupon Coupon;

    /**
    * <p>积分</p>
    */
    @SerializedName("CreditPoint")
    @Expose
    private CreditPoint CreditPoint;

    /**
     * Get <p>营销活动ID</p> 
     * @return PromotionId <p>营销活动ID</p>
     */
    public String getPromotionId() {
        return this.PromotionId;
    }

    /**
     * Set <p>营销活动ID</p>
     * @param PromotionId <p>营销活动ID</p>
     */
    public void setPromotionId(String PromotionId) {
        this.PromotionId = PromotionId;
    }

    /**
     * Get <p>营销活动名称</p> 
     * @return PromotionName <p>营销活动名称</p>
     */
    public String getPromotionName() {
        return this.PromotionName;
    }

    /**
     * Set <p>营销活动名称</p>
     * @param PromotionName <p>营销活动名称</p>
     */
    public void setPromotionName(String PromotionName) {
        this.PromotionName = PromotionName;
    }

    /**
     * Get <p>营销活动描述</p> 
     * @return Description <p>营销活动描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>营销活动描述</p>
     * @param Description <p>营销活动描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>邀请人ID</p> 
     * @return InviterUserId <p>邀请人ID</p>
     */
    public String getInviterUserId() {
        return this.InviterUserId;
    }

    /**
     * Set <p>邀请人ID</p>
     * @param InviterUserId <p>邀请人ID</p>
     */
    public void setInviterUserId(String InviterUserId) {
        this.InviterUserId = InviterUserId;
    }

    /**
     * Get <p>优惠券</p> 
     * @return Coupon <p>优惠券</p>
     */
    public Coupon getCoupon() {
        return this.Coupon;
    }

    /**
     * Set <p>优惠券</p>
     * @param Coupon <p>优惠券</p>
     */
    public void setCoupon(Coupon Coupon) {
        this.Coupon = Coupon;
    }

    /**
     * Get <p>积分</p> 
     * @return CreditPoint <p>积分</p>
     */
    public CreditPoint getCreditPoint() {
        return this.CreditPoint;
    }

    /**
     * Set <p>积分</p>
     * @param CreditPoint <p>积分</p>
     */
    public void setCreditPoint(CreditPoint CreditPoint) {
        this.CreditPoint = CreditPoint;
    }

    public Promotion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Promotion(Promotion source) {
        if (source.PromotionId != null) {
            this.PromotionId = new String(source.PromotionId);
        }
        if (source.PromotionName != null) {
            this.PromotionName = new String(source.PromotionName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.InviterUserId != null) {
            this.InviterUserId = new String(source.InviterUserId);
        }
        if (source.Coupon != null) {
            this.Coupon = new Coupon(source.Coupon);
        }
        if (source.CreditPoint != null) {
            this.CreditPoint = new CreditPoint(source.CreditPoint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PromotionId", this.PromotionId);
        this.setParamSimple(map, prefix + "PromotionName", this.PromotionName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "InviterUserId", this.InviterUserId);
        this.setParamObj(map, prefix + "Coupon.", this.Coupon);
        this.setParamObj(map, prefix + "CreditPoint.", this.CreditPoint);

    }
}

