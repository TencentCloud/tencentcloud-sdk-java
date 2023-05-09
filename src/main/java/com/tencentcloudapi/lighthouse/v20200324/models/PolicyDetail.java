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

public class PolicyDetail extends AbstractModel{

    /**
    * 用户折扣。
    */
    @SerializedName("UserDiscount")
    @Expose
    private Float UserDiscount;

    /**
    * 公共折扣。
    */
    @SerializedName("CommonDiscount")
    @Expose
    private Float CommonDiscount;

    /**
    * 最终折扣。
    */
    @SerializedName("FinalDiscount")
    @Expose
    private Float FinalDiscount;

    /**
    * 活动折扣。取值为null，表示无有效值，即没有折扣。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActivityDiscount")
    @Expose
    private Float ActivityDiscount;

    /**
    * 折扣类型。
user：用户折扣; common：官网折扣; activity：活动折扣。 取值为null，表示无有效值，即没有折扣。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiscountType")
    @Expose
    private String DiscountType;

    /**
     * Get 用户折扣。 
     * @return UserDiscount 用户折扣。
     */
    public Float getUserDiscount() {
        return this.UserDiscount;
    }

    /**
     * Set 用户折扣。
     * @param UserDiscount 用户折扣。
     */
    public void setUserDiscount(Float UserDiscount) {
        this.UserDiscount = UserDiscount;
    }

    /**
     * Get 公共折扣。 
     * @return CommonDiscount 公共折扣。
     */
    public Float getCommonDiscount() {
        return this.CommonDiscount;
    }

    /**
     * Set 公共折扣。
     * @param CommonDiscount 公共折扣。
     */
    public void setCommonDiscount(Float CommonDiscount) {
        this.CommonDiscount = CommonDiscount;
    }

    /**
     * Get 最终折扣。 
     * @return FinalDiscount 最终折扣。
     */
    public Float getFinalDiscount() {
        return this.FinalDiscount;
    }

    /**
     * Set 最终折扣。
     * @param FinalDiscount 最终折扣。
     */
    public void setFinalDiscount(Float FinalDiscount) {
        this.FinalDiscount = FinalDiscount;
    }

    /**
     * Get 活动折扣。取值为null，表示无有效值，即没有折扣。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActivityDiscount 活动折扣。取值为null，表示无有效值，即没有折扣。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getActivityDiscount() {
        return this.ActivityDiscount;
    }

    /**
     * Set 活动折扣。取值为null，表示无有效值，即没有折扣。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActivityDiscount 活动折扣。取值为null，表示无有效值，即没有折扣。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivityDiscount(Float ActivityDiscount) {
        this.ActivityDiscount = ActivityDiscount;
    }

    /**
     * Get 折扣类型。
user：用户折扣; common：官网折扣; activity：活动折扣。 取值为null，表示无有效值，即没有折扣。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiscountType 折扣类型。
user：用户折扣; common：官网折扣; activity：活动折扣。 取值为null，表示无有效值，即没有折扣。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiscountType() {
        return this.DiscountType;
    }

    /**
     * Set 折扣类型。
user：用户折扣; common：官网折扣; activity：活动折扣。 取值为null，表示无有效值，即没有折扣。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiscountType 折扣类型。
user：用户折扣; common：官网折扣; activity：活动折扣。 取值为null，表示无有效值，即没有折扣。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiscountType(String DiscountType) {
        this.DiscountType = DiscountType;
    }

    public PolicyDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PolicyDetail(PolicyDetail source) {
        if (source.UserDiscount != null) {
            this.UserDiscount = new Float(source.UserDiscount);
        }
        if (source.CommonDiscount != null) {
            this.CommonDiscount = new Float(source.CommonDiscount);
        }
        if (source.FinalDiscount != null) {
            this.FinalDiscount = new Float(source.FinalDiscount);
        }
        if (source.ActivityDiscount != null) {
            this.ActivityDiscount = new Float(source.ActivityDiscount);
        }
        if (source.DiscountType != null) {
            this.DiscountType = new String(source.DiscountType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserDiscount", this.UserDiscount);
        this.setParamSimple(map, prefix + "CommonDiscount", this.CommonDiscount);
        this.setParamSimple(map, prefix + "FinalDiscount", this.FinalDiscount);
        this.setParamSimple(map, prefix + "ActivityDiscount", this.ActivityDiscount);
        this.setParamSimple(map, prefix + "DiscountType", this.DiscountType);

    }
}

