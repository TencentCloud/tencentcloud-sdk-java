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

public class ReservedInstancesOffering extends AbstractModel{

    /**
    * 预留实例计费可购买的可用区。形如：ap-guangzhou-1。
返回项：<a href="https://cloud.tencent.com/document/product/213/6091">可用区列表</a>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 可购买的预留实例计费类型的结算货币，使用ISO 4217标准货币代码。
返回项：USD（美元）。
    */
    @SerializedName("CurrencyCode")
    @Expose
    private String CurrencyCode;

    /**
    * 预留实例计费【有效期】即预留实例计费购买时长。形如：31536000。
计量单位：秒
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 预留实例计费的购买价格。形如：4000.0。
计量单位：与 currencyCode 一致，目前支持 USD（美元）
    */
    @SerializedName("FixedPrice")
    @Expose
    private Float FixedPrice;

    /**
    * 预留实例计费的实例类型。形如：S3.MEDIUM4。
返回项：<a href="https://cloud.tencent.com/product/cvm/instances">预留实例计费类型列表</a>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 预留实例计费的付款类型。形如：All Upfront。
返回项： All Upfront (预付全部费用)。
    */
    @SerializedName("OfferingType")
    @Expose
    private String OfferingType;

    /**
    * 可购买的预留实例计费配置ID。形如：650c138f-ae7e-4750-952a-96841d6e9fc1。
    */
    @SerializedName("ReservedInstancesOfferingId")
    @Expose
    private String ReservedInstancesOfferingId;

    /**
    * 预留实例计费的平台描述（即操作系统）。形如：linux。
返回项： linux 。
    */
    @SerializedName("ProductDescription")
    @Expose
    private String ProductDescription;

    /**
    * 扣除预付费之后的使用价格 (按小时计费)。形如：0.0。
目前，因为只支持 All Upfront 付款类型，所以默认为 0元/小时。
计量单位：元/小时，货币单位与 currencyCode 一致，目前支持 USD（美元）
    */
    @SerializedName("UsagePrice")
    @Expose
    private Float UsagePrice;

    /**
     * Get 预留实例计费可购买的可用区。形如：ap-guangzhou-1。
返回项：<a href="https://cloud.tencent.com/document/product/213/6091">可用区列表</a> 
     * @return Zone 预留实例计费可购买的可用区。形如：ap-guangzhou-1。
返回项：<a href="https://cloud.tencent.com/document/product/213/6091">可用区列表</a>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 预留实例计费可购买的可用区。形如：ap-guangzhou-1。
返回项：<a href="https://cloud.tencent.com/document/product/213/6091">可用区列表</a>
     * @param Zone 预留实例计费可购买的可用区。形如：ap-guangzhou-1。
返回项：<a href="https://cloud.tencent.com/document/product/213/6091">可用区列表</a>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 可购买的预留实例计费类型的结算货币，使用ISO 4217标准货币代码。
返回项：USD（美元）。 
     * @return CurrencyCode 可购买的预留实例计费类型的结算货币，使用ISO 4217标准货币代码。
返回项：USD（美元）。
     */
    public String getCurrencyCode() {
        return this.CurrencyCode;
    }

    /**
     * Set 可购买的预留实例计费类型的结算货币，使用ISO 4217标准货币代码。
返回项：USD（美元）。
     * @param CurrencyCode 可购买的预留实例计费类型的结算货币，使用ISO 4217标准货币代码。
返回项：USD（美元）。
     */
    public void setCurrencyCode(String CurrencyCode) {
        this.CurrencyCode = CurrencyCode;
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
     * Get 预留实例计费的购买价格。形如：4000.0。
计量单位：与 currencyCode 一致，目前支持 USD（美元） 
     * @return FixedPrice 预留实例计费的购买价格。形如：4000.0。
计量单位：与 currencyCode 一致，目前支持 USD（美元）
     */
    public Float getFixedPrice() {
        return this.FixedPrice;
    }

    /**
     * Set 预留实例计费的购买价格。形如：4000.0。
计量单位：与 currencyCode 一致，目前支持 USD（美元）
     * @param FixedPrice 预留实例计费的购买价格。形如：4000.0。
计量单位：与 currencyCode 一致，目前支持 USD（美元）
     */
    public void setFixedPrice(Float FixedPrice) {
        this.FixedPrice = FixedPrice;
    }

    /**
     * Get 预留实例计费的实例类型。形如：S3.MEDIUM4。
返回项：<a href="https://cloud.tencent.com/product/cvm/instances">预留实例计费类型列表</a> 
     * @return InstanceType 预留实例计费的实例类型。形如：S3.MEDIUM4。
返回项：<a href="https://cloud.tencent.com/product/cvm/instances">预留实例计费类型列表</a>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 预留实例计费的实例类型。形如：S3.MEDIUM4。
返回项：<a href="https://cloud.tencent.com/product/cvm/instances">预留实例计费类型列表</a>
     * @param InstanceType 预留实例计费的实例类型。形如：S3.MEDIUM4。
返回项：<a href="https://cloud.tencent.com/product/cvm/instances">预留实例计费类型列表</a>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 预留实例计费的付款类型。形如：All Upfront。
返回项： All Upfront (预付全部费用)。 
     * @return OfferingType 预留实例计费的付款类型。形如：All Upfront。
返回项： All Upfront (预付全部费用)。
     */
    public String getOfferingType() {
        return this.OfferingType;
    }

    /**
     * Set 预留实例计费的付款类型。形如：All Upfront。
返回项： All Upfront (预付全部费用)。
     * @param OfferingType 预留实例计费的付款类型。形如：All Upfront。
返回项： All Upfront (预付全部费用)。
     */
    public void setOfferingType(String OfferingType) {
        this.OfferingType = OfferingType;
    }

    /**
     * Get 可购买的预留实例计费配置ID。形如：650c138f-ae7e-4750-952a-96841d6e9fc1。 
     * @return ReservedInstancesOfferingId 可购买的预留实例计费配置ID。形如：650c138f-ae7e-4750-952a-96841d6e9fc1。
     */
    public String getReservedInstancesOfferingId() {
        return this.ReservedInstancesOfferingId;
    }

    /**
     * Set 可购买的预留实例计费配置ID。形如：650c138f-ae7e-4750-952a-96841d6e9fc1。
     * @param ReservedInstancesOfferingId 可购买的预留实例计费配置ID。形如：650c138f-ae7e-4750-952a-96841d6e9fc1。
     */
    public void setReservedInstancesOfferingId(String ReservedInstancesOfferingId) {
        this.ReservedInstancesOfferingId = ReservedInstancesOfferingId;
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

    /**
     * Get 扣除预付费之后的使用价格 (按小时计费)。形如：0.0。
目前，因为只支持 All Upfront 付款类型，所以默认为 0元/小时。
计量单位：元/小时，货币单位与 currencyCode 一致，目前支持 USD（美元） 
     * @return UsagePrice 扣除预付费之后的使用价格 (按小时计费)。形如：0.0。
目前，因为只支持 All Upfront 付款类型，所以默认为 0元/小时。
计量单位：元/小时，货币单位与 currencyCode 一致，目前支持 USD（美元）
     */
    public Float getUsagePrice() {
        return this.UsagePrice;
    }

    /**
     * Set 扣除预付费之后的使用价格 (按小时计费)。形如：0.0。
目前，因为只支持 All Upfront 付款类型，所以默认为 0元/小时。
计量单位：元/小时，货币单位与 currencyCode 一致，目前支持 USD（美元）
     * @param UsagePrice 扣除预付费之后的使用价格 (按小时计费)。形如：0.0。
目前，因为只支持 All Upfront 付款类型，所以默认为 0元/小时。
计量单位：元/小时，货币单位与 currencyCode 一致，目前支持 USD（美元）
     */
    public void setUsagePrice(Float UsagePrice) {
        this.UsagePrice = UsagePrice;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "CurrencyCode", this.CurrencyCode);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "FixedPrice", this.FixedPrice);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "OfferingType", this.OfferingType);
        this.setParamSimple(map, prefix + "ReservedInstancesOfferingId", this.ReservedInstancesOfferingId);
        this.setParamSimple(map, prefix + "ProductDescription", this.ProductDescription);
        this.setParamSimple(map, prefix + "UsagePrice", this.UsagePrice);

    }
}

