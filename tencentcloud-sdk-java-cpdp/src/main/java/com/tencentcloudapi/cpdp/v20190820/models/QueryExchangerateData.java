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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryExchangerateData extends AbstractModel{

    /**
    * 汇率
    */
    @SerializedName("Rate")
    @Expose
    private String Rate;

    /**
    * 源币种
    */
    @SerializedName("SourceCurrency")
    @Expose
    private String SourceCurrency;

    /**
    * 目的币种
    */
    @SerializedName("TargetCurrency")
    @Expose
    private String TargetCurrency;

    /**
    * 汇率时间
    */
    @SerializedName("RateTime")
    @Expose
    private String RateTime;

    /**
    * 基准币种
    */
    @SerializedName("BaseCurrency")
    @Expose
    private String BaseCurrency;

    /**
     * Get 汇率 
     * @return Rate 汇率
     */
    public String getRate() {
        return this.Rate;
    }

    /**
     * Set 汇率
     * @param Rate 汇率
     */
    public void setRate(String Rate) {
        this.Rate = Rate;
    }

    /**
     * Get 源币种 
     * @return SourceCurrency 源币种
     */
    public String getSourceCurrency() {
        return this.SourceCurrency;
    }

    /**
     * Set 源币种
     * @param SourceCurrency 源币种
     */
    public void setSourceCurrency(String SourceCurrency) {
        this.SourceCurrency = SourceCurrency;
    }

    /**
     * Get 目的币种 
     * @return TargetCurrency 目的币种
     */
    public String getTargetCurrency() {
        return this.TargetCurrency;
    }

    /**
     * Set 目的币种
     * @param TargetCurrency 目的币种
     */
    public void setTargetCurrency(String TargetCurrency) {
        this.TargetCurrency = TargetCurrency;
    }

    /**
     * Get 汇率时间 
     * @return RateTime 汇率时间
     */
    public String getRateTime() {
        return this.RateTime;
    }

    /**
     * Set 汇率时间
     * @param RateTime 汇率时间
     */
    public void setRateTime(String RateTime) {
        this.RateTime = RateTime;
    }

    /**
     * Get 基准币种 
     * @return BaseCurrency 基准币种
     */
    public String getBaseCurrency() {
        return this.BaseCurrency;
    }

    /**
     * Set 基准币种
     * @param BaseCurrency 基准币种
     */
    public void setBaseCurrency(String BaseCurrency) {
        this.BaseCurrency = BaseCurrency;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Rate", this.Rate);
        this.setParamSimple(map, prefix + "SourceCurrency", this.SourceCurrency);
        this.setParamSimple(map, prefix + "TargetCurrency", this.TargetCurrency);
        this.setParamSimple(map, prefix + "RateTime", this.RateTime);
        this.setParamSimple(map, prefix + "BaseCurrency", this.BaseCurrency);

    }
}

