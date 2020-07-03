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
package com.tencentcloudapi.captcha.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CaptchaOperDataTryTimesUnit extends AbstractModel{

    /**
    * 时间
    */
    @SerializedName("DateKey")
    @Expose
    private String DateKey;

    /**
    * 平均尝试次数
    */
    @SerializedName("CntPerPass")
    @Expose
    private Float [] CntPerPass;

    /**
    * market平均尝试次数
    */
    @SerializedName("MarketCntPerPass")
    @Expose
    private Float MarketCntPerPass;

    /**
     * Get 时间 
     * @return DateKey 时间
     */
    public String getDateKey() {
        return this.DateKey;
    }

    /**
     * Set 时间
     * @param DateKey 时间
     */
    public void setDateKey(String DateKey) {
        this.DateKey = DateKey;
    }

    /**
     * Get 平均尝试次数 
     * @return CntPerPass 平均尝试次数
     */
    public Float [] getCntPerPass() {
        return this.CntPerPass;
    }

    /**
     * Set 平均尝试次数
     * @param CntPerPass 平均尝试次数
     */
    public void setCntPerPass(Float [] CntPerPass) {
        this.CntPerPass = CntPerPass;
    }

    /**
     * Get market平均尝试次数 
     * @return MarketCntPerPass market平均尝试次数
     */
    public Float getMarketCntPerPass() {
        return this.MarketCntPerPass;
    }

    /**
     * Set market平均尝试次数
     * @param MarketCntPerPass market平均尝试次数
     */
    public void setMarketCntPerPass(Float MarketCntPerPass) {
        this.MarketCntPerPass = MarketCntPerPass;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DateKey", this.DateKey);
        this.setParamArraySimple(map, prefix + "CntPerPass.", this.CntPerPass);
        this.setParamSimple(map, prefix + "MarketCntPerPass", this.MarketCntPerPass);

    }
}

