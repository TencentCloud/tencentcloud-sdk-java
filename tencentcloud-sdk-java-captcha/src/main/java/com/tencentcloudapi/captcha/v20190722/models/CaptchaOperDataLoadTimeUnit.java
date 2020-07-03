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

public class CaptchaOperDataLoadTimeUnit extends AbstractModel{

    /**
    * 时间
    */
    @SerializedName("DateKey")
    @Expose
    private String DateKey;

    /**
    * Market加载时间
    */
    @SerializedName("MarketLoadTime")
    @Expose
    private Float MarketLoadTime;

    /**
    * AppId加载时间
    */
    @SerializedName("AppIdLoadTime")
    @Expose
    private Float AppIdLoadTime;

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
     * Get Market加载时间 
     * @return MarketLoadTime Market加载时间
     */
    public Float getMarketLoadTime() {
        return this.MarketLoadTime;
    }

    /**
     * Set Market加载时间
     * @param MarketLoadTime Market加载时间
     */
    public void setMarketLoadTime(Float MarketLoadTime) {
        this.MarketLoadTime = MarketLoadTime;
    }

    /**
     * Get AppId加载时间 
     * @return AppIdLoadTime AppId加载时间
     */
    public Float getAppIdLoadTime() {
        return this.AppIdLoadTime;
    }

    /**
     * Set AppId加载时间
     * @param AppIdLoadTime AppId加载时间
     */
    public void setAppIdLoadTime(Float AppIdLoadTime) {
        this.AppIdLoadTime = AppIdLoadTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DateKey", this.DateKey);
        this.setParamSimple(map, prefix + "MarketLoadTime", this.MarketLoadTime);
        this.setParamSimple(map, prefix + "AppIdLoadTime", this.AppIdLoadTime);

    }
}

