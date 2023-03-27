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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUsageSummaryRequest extends AbstractModel{

    /**
    * 统计时间段的开始时间
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 统计时间段的结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 需要获取用量的子产品列表
    */
    @SerializedName("SubProducts")
    @Expose
    private String [] SubProducts;

    /**
    * true: 返回加权后的数据
false: 返回原始数据
    */
    @SerializedName("IsWeighted")
    @Expose
    private Boolean IsWeighted;

    /**
     * Get 统计时间段的开始时间 
     * @return BeginTime 统计时间段的开始时间
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 统计时间段的开始时间
     * @param BeginTime 统计时间段的开始时间
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 统计时间段的结束时间 
     * @return EndTime 统计时间段的结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 统计时间段的结束时间
     * @param EndTime 统计时间段的结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 需要获取用量的子产品列表 
     * @return SubProducts 需要获取用量的子产品列表
     */
    public String [] getSubProducts() {
        return this.SubProducts;
    }

    /**
     * Set 需要获取用量的子产品列表
     * @param SubProducts 需要获取用量的子产品列表
     */
    public void setSubProducts(String [] SubProducts) {
        this.SubProducts = SubProducts;
    }

    /**
     * Get true: 返回加权后的数据
false: 返回原始数据 
     * @return IsWeighted true: 返回加权后的数据
false: 返回原始数据
     */
    public Boolean getIsWeighted() {
        return this.IsWeighted;
    }

    /**
     * Set true: 返回加权后的数据
false: 返回原始数据
     * @param IsWeighted true: 返回加权后的数据
false: 返回原始数据
     */
    public void setIsWeighted(Boolean IsWeighted) {
        this.IsWeighted = IsWeighted;
    }

    public DescribeUsageSummaryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUsageSummaryRequest(DescribeUsageSummaryRequest source) {
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SubProducts != null) {
            this.SubProducts = new String[source.SubProducts.length];
            for (int i = 0; i < source.SubProducts.length; i++) {
                this.SubProducts[i] = new String(source.SubProducts[i]);
            }
        }
        if (source.IsWeighted != null) {
            this.IsWeighted = new Boolean(source.IsWeighted);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "SubProducts.", this.SubProducts);
        this.setParamSimple(map, prefix + "IsWeighted", this.IsWeighted);

    }
}

