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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrtcUsage extends AbstractModel{

    /**
    * 时间点，格式为YYYY-MM-DD HH:mm:ss。多天查询时，HH:mm:ss为00:00:00。
    */
    @SerializedName("TimeKey")
    @Expose
    private String TimeKey;

    /**
    * 用量数组。每个数值含义与UsageKey对应。单位：分钟。
    */
    @SerializedName("UsageValue")
    @Expose
    private Float [] UsageValue;

    /**
     * Get 时间点，格式为YYYY-MM-DD HH:mm:ss。多天查询时，HH:mm:ss为00:00:00。 
     * @return TimeKey 时间点，格式为YYYY-MM-DD HH:mm:ss。多天查询时，HH:mm:ss为00:00:00。
     */
    public String getTimeKey() {
        return this.TimeKey;
    }

    /**
     * Set 时间点，格式为YYYY-MM-DD HH:mm:ss。多天查询时，HH:mm:ss为00:00:00。
     * @param TimeKey 时间点，格式为YYYY-MM-DD HH:mm:ss。多天查询时，HH:mm:ss为00:00:00。
     */
    public void setTimeKey(String TimeKey) {
        this.TimeKey = TimeKey;
    }

    /**
     * Get 用量数组。每个数值含义与UsageKey对应。单位：分钟。 
     * @return UsageValue 用量数组。每个数值含义与UsageKey对应。单位：分钟。
     */
    public Float [] getUsageValue() {
        return this.UsageValue;
    }

    /**
     * Set 用量数组。每个数值含义与UsageKey对应。单位：分钟。
     * @param UsageValue 用量数组。每个数值含义与UsageKey对应。单位：分钟。
     */
    public void setUsageValue(Float [] UsageValue) {
        this.UsageValue = UsageValue;
    }

    public TrtcUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrtcUsage(TrtcUsage source) {
        if (source.TimeKey != null) {
            this.TimeKey = new String(source.TimeKey);
        }
        if (source.UsageValue != null) {
            this.UsageValue = new Float[source.UsageValue.length];
            for (int i = 0; i < source.UsageValue.length; i++) {
                this.UsageValue[i] = new Float(source.UsageValue[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeKey", this.TimeKey);
        this.setParamArraySimple(map, prefix + "UsageValue.", this.UsageValue);

    }
}

