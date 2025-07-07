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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpecPrice extends AbstractModel {

    /**
    * 计费项名称
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * 原价，单位：分。最大值42亿，超过则返回0
    */
    @SerializedName("TotalCost")
    @Expose
    private Long TotalCost;

    /**
    * 优惠后的价格，单位：分
    */
    @SerializedName("RealTotalCost")
    @Expose
    private Long RealTotalCost;

    /**
    * 计费项数量
    */
    @SerializedName("SpecCount")
    @Expose
    private Long SpecCount;

    /**
     * Get 计费项名称 
     * @return SpecName 计费项名称
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set 计费项名称
     * @param SpecName 计费项名称
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get 原价，单位：分。最大值42亿，超过则返回0 
     * @return TotalCost 原价，单位：分。最大值42亿，超过则返回0
     */
    public Long getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set 原价，单位：分。最大值42亿，超过则返回0
     * @param TotalCost 原价，单位：分。最大值42亿，超过则返回0
     */
    public void setTotalCost(Long TotalCost) {
        this.TotalCost = TotalCost;
    }

    /**
     * Get 优惠后的价格，单位：分 
     * @return RealTotalCost 优惠后的价格，单位：分
     */
    public Long getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set 优惠后的价格，单位：分
     * @param RealTotalCost 优惠后的价格，单位：分
     */
    public void setRealTotalCost(Long RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get 计费项数量 
     * @return SpecCount 计费项数量
     */
    public Long getSpecCount() {
        return this.SpecCount;
    }

    /**
     * Set 计费项数量
     * @param SpecCount 计费项数量
     */
    public void setSpecCount(Long SpecCount) {
        this.SpecCount = SpecCount;
    }

    public SpecPrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpecPrice(SpecPrice source) {
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new Long(source.TotalCost);
        }
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new Long(source.RealTotalCost);
        }
        if (source.SpecCount != null) {
            this.SpecCount = new Long(source.SpecCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "SpecCount", this.SpecCount);

    }
}

