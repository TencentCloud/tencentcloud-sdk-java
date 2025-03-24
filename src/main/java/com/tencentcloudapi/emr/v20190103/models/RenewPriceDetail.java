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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewPriceDetail extends AbstractModel {

    /**
    * 计费项名称
    */
    @SerializedName("BillingName")
    @Expose
    private String BillingName;

    /**
    * 折扣
    */
    @SerializedName("Policy")
    @Expose
    private Float Policy;

    /**
    * 数量
    */
    @SerializedName("Quantity")
    @Expose
    private Long Quantity;

    /**
    * 原价
    */
    @SerializedName("OriginalCost")
    @Expose
    private Float OriginalCost;

    /**
    * 折扣价
    */
    @SerializedName("DiscountCost")
    @Expose
    private Float DiscountCost;

    /**
     * Get 计费项名称 
     * @return BillingName 计费项名称
     */
    public String getBillingName() {
        return this.BillingName;
    }

    /**
     * Set 计费项名称
     * @param BillingName 计费项名称
     */
    public void setBillingName(String BillingName) {
        this.BillingName = BillingName;
    }

    /**
     * Get 折扣 
     * @return Policy 折扣
     */
    public Float getPolicy() {
        return this.Policy;
    }

    /**
     * Set 折扣
     * @param Policy 折扣
     */
    public void setPolicy(Float Policy) {
        this.Policy = Policy;
    }

    /**
     * Get 数量 
     * @return Quantity 数量
     */
    public Long getQuantity() {
        return this.Quantity;
    }

    /**
     * Set 数量
     * @param Quantity 数量
     */
    public void setQuantity(Long Quantity) {
        this.Quantity = Quantity;
    }

    /**
     * Get 原价 
     * @return OriginalCost 原价
     */
    public Float getOriginalCost() {
        return this.OriginalCost;
    }

    /**
     * Set 原价
     * @param OriginalCost 原价
     */
    public void setOriginalCost(Float OriginalCost) {
        this.OriginalCost = OriginalCost;
    }

    /**
     * Get 折扣价 
     * @return DiscountCost 折扣价
     */
    public Float getDiscountCost() {
        return this.DiscountCost;
    }

    /**
     * Set 折扣价
     * @param DiscountCost 折扣价
     */
    public void setDiscountCost(Float DiscountCost) {
        this.DiscountCost = DiscountCost;
    }

    public RenewPriceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewPriceDetail(RenewPriceDetail source) {
        if (source.BillingName != null) {
            this.BillingName = new String(source.BillingName);
        }
        if (source.Policy != null) {
            this.Policy = new Float(source.Policy);
        }
        if (source.Quantity != null) {
            this.Quantity = new Long(source.Quantity);
        }
        if (source.OriginalCost != null) {
            this.OriginalCost = new Float(source.OriginalCost);
        }
        if (source.DiscountCost != null) {
            this.DiscountCost = new Float(source.DiscountCost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BillingName", this.BillingName);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "Quantity", this.Quantity);
        this.setParamSimple(map, prefix + "OriginalCost", this.OriginalCost);
        this.setParamSimple(map, prefix + "DiscountCost", this.DiscountCost);

    }
}

