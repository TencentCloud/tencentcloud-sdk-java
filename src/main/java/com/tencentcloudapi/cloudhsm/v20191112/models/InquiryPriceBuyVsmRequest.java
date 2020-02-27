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
package com.tencentcloudapi.cloudhsm.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceBuyVsmRequest extends AbstractModel{

    /**
    * 需购买实例的数量
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * 付费模式：0表示按需计费/后付费，1表示预付费
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 商品的时间大小
    */
    @SerializedName("TimeSpan")
    @Expose
    private String TimeSpan;

    /**
    * 商品的时间单位
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 货币类型，默认为CNY
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * 默认为CREATE，可选RENEW
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 需购买实例的数量 
     * @return GoodsNum 需购买实例的数量
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 需购买实例的数量
     * @param GoodsNum 需购买实例的数量
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get 付费模式：0表示按需计费/后付费，1表示预付费 
     * @return PayMode 付费模式：0表示按需计费/后付费，1表示预付费
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式：0表示按需计费/后付费，1表示预付费
     * @param PayMode 付费模式：0表示按需计费/后付费，1表示预付费
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 商品的时间大小 
     * @return TimeSpan 商品的时间大小
     */
    public String getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 商品的时间大小
     * @param TimeSpan 商品的时间大小
     */
    public void setTimeSpan(String TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 商品的时间单位 
     * @return TimeUnit 商品的时间单位
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 商品的时间单位
     * @param TimeUnit 商品的时间单位
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 货币类型，默认为CNY 
     * @return Currency 货币类型，默认为CNY
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set 货币类型，默认为CNY
     * @param Currency 货币类型，默认为CNY
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get 默认为CREATE，可选RENEW 
     * @return Type 默认为CREATE，可选RENEW
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 默认为CREATE，可选RENEW
     * @param Type 默认为CREATE，可选RENEW
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

