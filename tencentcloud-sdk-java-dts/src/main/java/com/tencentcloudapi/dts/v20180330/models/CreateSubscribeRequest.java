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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSubscribeRequest extends AbstractModel{

    /**
    * 订阅的数据库类型，目前支持的有 mysql
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 实例付费类型，1小时计费，0包年包月
    */
    @SerializedName("PayType")
    @Expose
    private Long PayType;

    /**
    * 购买时长。PayType为0时必填。单位为月，最大支持120
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 购买数量,默认为1，最大为10
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 是否自动续费，默认为0，1表示自动续费。小时计费实例设置该标识无效。
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
     * Get 订阅的数据库类型，目前支持的有 mysql 
     * @return Product 订阅的数据库类型，目前支持的有 mysql
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 订阅的数据库类型，目前支持的有 mysql
     * @param Product 订阅的数据库类型，目前支持的有 mysql
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 实例付费类型，1小时计费，0包年包月 
     * @return PayType 实例付费类型，1小时计费，0包年包月
     */
    public Long getPayType() {
        return this.PayType;
    }

    /**
     * Set 实例付费类型，1小时计费，0包年包月
     * @param PayType 实例付费类型，1小时计费，0包年包月
     */
    public void setPayType(Long PayType) {
        this.PayType = PayType;
    }

    /**
     * Get 购买时长。PayType为0时必填。单位为月，最大支持120 
     * @return Duration 购买时长。PayType为0时必填。单位为月，最大支持120
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 购买时长。PayType为0时必填。单位为月，最大支持120
     * @param Duration 购买时长。PayType为0时必填。单位为月，最大支持120
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 购买数量,默认为1，最大为10 
     * @return Count 购买数量,默认为1，最大为10
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 购买数量,默认为1，最大为10
     * @param Count 购买数量,默认为1，最大为10
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 是否自动续费，默认为0，1表示自动续费。小时计费实例设置该标识无效。 
     * @return AutoRenew 是否自动续费，默认为0，1表示自动续费。小时计费实例设置该标识无效。
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set 是否自动续费，默认为0，1表示自动续费。小时计费实例设置该标识无效。
     * @param AutoRenew 是否自动续费，默认为0，1表示自动续费。小时计费实例设置该标识无效。
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);

    }
}

