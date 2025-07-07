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
package com.tencentcloudapi.partners.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubProductPriceDetail extends AbstractModel {

    /**
    * 子产品名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 折扣值，=100时表示无折扣，=85时表示8.5折
    */
    @SerializedName("DiscountValue")
    @Expose
    private Float DiscountValue;

    /**
    * 原价，折扣前价格，单位：分
    */
    @SerializedName("TotalCost")
    @Expose
    private Long TotalCost;

    /**
    * 折后价，单位：分
    */
    @SerializedName("RealTotalCost")
    @Expose
    private Long RealTotalCost;

    /**
     * Get 子产品名称 
     * @return Name 子产品名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 子产品名称
     * @param Name 子产品名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 折扣值，=100时表示无折扣，=85时表示8.5折 
     * @return DiscountValue 折扣值，=100时表示无折扣，=85时表示8.5折
     */
    public Float getDiscountValue() {
        return this.DiscountValue;
    }

    /**
     * Set 折扣值，=100时表示无折扣，=85时表示8.5折
     * @param DiscountValue 折扣值，=100时表示无折扣，=85时表示8.5折
     */
    public void setDiscountValue(Float DiscountValue) {
        this.DiscountValue = DiscountValue;
    }

    /**
     * Get 原价，折扣前价格，单位：分 
     * @return TotalCost 原价，折扣前价格，单位：分
     */
    public Long getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set 原价，折扣前价格，单位：分
     * @param TotalCost 原价，折扣前价格，单位：分
     */
    public void setTotalCost(Long TotalCost) {
        this.TotalCost = TotalCost;
    }

    /**
     * Get 折后价，单位：分 
     * @return RealTotalCost 折后价，单位：分
     */
    public Long getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set 折后价，单位：分
     * @param RealTotalCost 折后价，单位：分
     */
    public void setRealTotalCost(Long RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    public SubProductPriceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubProductPriceDetail(SubProductPriceDetail source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DiscountValue != null) {
            this.DiscountValue = new Float(source.DiscountValue);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new Long(source.TotalCost);
        }
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new Long(source.RealTotalCost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DiscountValue", this.DiscountValue);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);

    }
}

