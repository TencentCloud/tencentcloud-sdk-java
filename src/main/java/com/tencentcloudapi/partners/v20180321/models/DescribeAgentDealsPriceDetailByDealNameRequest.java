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

public class DescribeAgentDealsPriceDetailByDealNameRequest extends AbstractModel {

    /**
    * 下单年份（订单创建时间归属年份）
    */
    @SerializedName("DealCreatYear")
    @Expose
    private Long DealCreatYear;

    /**
    * 子订单号，每个请求最多查询100条
    */
    @SerializedName("DealNames")
    @Expose
    private String [] DealNames;

    /**
    * 订单归属代客uin
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
     * Get 下单年份（订单创建时间归属年份） 
     * @return DealCreatYear 下单年份（订单创建时间归属年份）
     */
    public Long getDealCreatYear() {
        return this.DealCreatYear;
    }

    /**
     * Set 下单年份（订单创建时间归属年份）
     * @param DealCreatYear 下单年份（订单创建时间归属年份）
     */
    public void setDealCreatYear(Long DealCreatYear) {
        this.DealCreatYear = DealCreatYear;
    }

    /**
     * Get 子订单号，每个请求最多查询100条 
     * @return DealNames 子订单号，每个请求最多查询100条
     */
    public String [] getDealNames() {
        return this.DealNames;
    }

    /**
     * Set 子订单号，每个请求最多查询100条
     * @param DealNames 子订单号，每个请求最多查询100条
     */
    public void setDealNames(String [] DealNames) {
        this.DealNames = DealNames;
    }

    /**
     * Get 订单归属代客uin 
     * @return OwnerUin 订单归属代客uin
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 订单归属代客uin
     * @param OwnerUin 订单归属代客uin
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    public DescribeAgentDealsPriceDetailByDealNameRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgentDealsPriceDetailByDealNameRequest(DescribeAgentDealsPriceDetailByDealNameRequest source) {
        if (source.DealCreatYear != null) {
            this.DealCreatYear = new Long(source.DealCreatYear);
        }
        if (source.DealNames != null) {
            this.DealNames = new String[source.DealNames.length];
            for (int i = 0; i < source.DealNames.length; i++) {
                this.DealNames[i] = new String(source.DealNames[i]);
            }
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DealCreatYear", this.DealCreatYear);
        this.setParamArraySimple(map, prefix + "DealNames.", this.DealNames);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);

    }
}

