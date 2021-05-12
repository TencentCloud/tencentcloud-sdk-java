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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReservedInstancePriceItem extends AbstractModel{

    /**
    * 付费类型，如："All Upfront","Partial Upfront","No Upfront"
    */
    @SerializedName("OfferingType")
    @Expose
    private String OfferingType;

    /**
    * 预支合计费用，单位：元。
    */
    @SerializedName("FixedPrice")
    @Expose
    private Float FixedPrice;

    /**
    * 后续合计费用，单位：元/小时
    */
    @SerializedName("UsagePrice")
    @Expose
    private Float UsagePrice;

    /**
    * 预留实例配置ID
    */
    @SerializedName("ReservedInstancesOfferingId")
    @Expose
    private String ReservedInstancesOfferingId;

    /**
    * 预留实例计费可购买的可用区。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 预留实例计费【有效期】即预留实例计费购买时长。形如：31536000。
计量单位：秒
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 预留实例计费的平台描述（即操作系统）。形如：linux。
返回项： linux 。
    */
    @SerializedName("ProductDescription")
    @Expose
    private String ProductDescription;

    /**
     * Get 付费类型，如："All Upfront","Partial Upfront","No Upfront" 
     * @return OfferingType 付费类型，如："All Upfront","Partial Upfront","No Upfront"
     */
    public String getOfferingType() {
        return this.OfferingType;
    }

    /**
     * Set 付费类型，如："All Upfront","Partial Upfront","No Upfront"
     * @param OfferingType 付费类型，如："All Upfront","Partial Upfront","No Upfront"
     */
    public void setOfferingType(String OfferingType) {
        this.OfferingType = OfferingType;
    }

    /**
     * Get 预支合计费用，单位：元。 
     * @return FixedPrice 预支合计费用，单位：元。
     */
    public Float getFixedPrice() {
        return this.FixedPrice;
    }

    /**
     * Set 预支合计费用，单位：元。
     * @param FixedPrice 预支合计费用，单位：元。
     */
    public void setFixedPrice(Float FixedPrice) {
        this.FixedPrice = FixedPrice;
    }

    /**
     * Get 后续合计费用，单位：元/小时 
     * @return UsagePrice 后续合计费用，单位：元/小时
     */
    public Float getUsagePrice() {
        return this.UsagePrice;
    }

    /**
     * Set 后续合计费用，单位：元/小时
     * @param UsagePrice 后续合计费用，单位：元/小时
     */
    public void setUsagePrice(Float UsagePrice) {
        this.UsagePrice = UsagePrice;
    }

    /**
     * Get 预留实例配置ID 
     * @return ReservedInstancesOfferingId 预留实例配置ID
     */
    public String getReservedInstancesOfferingId() {
        return this.ReservedInstancesOfferingId;
    }

    /**
     * Set 预留实例配置ID
     * @param ReservedInstancesOfferingId 预留实例配置ID
     */
    public void setReservedInstancesOfferingId(String ReservedInstancesOfferingId) {
        this.ReservedInstancesOfferingId = ReservedInstancesOfferingId;
    }

    /**
     * Get 预留实例计费可购买的可用区。 
     * @return Zone 预留实例计费可购买的可用区。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 预留实例计费可购买的可用区。
     * @param Zone 预留实例计费可购买的可用区。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 预留实例计费【有效期】即预留实例计费购买时长。形如：31536000。
计量单位：秒 
     * @return Duration 预留实例计费【有效期】即预留实例计费购买时长。形如：31536000。
计量单位：秒
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 预留实例计费【有效期】即预留实例计费购买时长。形如：31536000。
计量单位：秒
     * @param Duration 预留实例计费【有效期】即预留实例计费购买时长。形如：31536000。
计量单位：秒
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 预留实例计费的平台描述（即操作系统）。形如：linux。
返回项： linux 。 
     * @return ProductDescription 预留实例计费的平台描述（即操作系统）。形如：linux。
返回项： linux 。
     */
    public String getProductDescription() {
        return this.ProductDescription;
    }

    /**
     * Set 预留实例计费的平台描述（即操作系统）。形如：linux。
返回项： linux 。
     * @param ProductDescription 预留实例计费的平台描述（即操作系统）。形如：linux。
返回项： linux 。
     */
    public void setProductDescription(String ProductDescription) {
        this.ProductDescription = ProductDescription;
    }

    public ReservedInstancePriceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReservedInstancePriceItem(ReservedInstancePriceItem source) {
        if (source.OfferingType != null) {
            this.OfferingType = new String(source.OfferingType);
        }
        if (source.FixedPrice != null) {
            this.FixedPrice = new Float(source.FixedPrice);
        }
        if (source.UsagePrice != null) {
            this.UsagePrice = new Float(source.UsagePrice);
        }
        if (source.ReservedInstancesOfferingId != null) {
            this.ReservedInstancesOfferingId = new String(source.ReservedInstancesOfferingId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.ProductDescription != null) {
            this.ProductDescription = new String(source.ProductDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OfferingType", this.OfferingType);
        this.setParamSimple(map, prefix + "FixedPrice", this.FixedPrice);
        this.setParamSimple(map, prefix + "UsagePrice", this.UsagePrice);
        this.setParamSimple(map, prefix + "ReservedInstancesOfferingId", this.ReservedInstancesOfferingId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "ProductDescription", this.ProductDescription);

    }
}

