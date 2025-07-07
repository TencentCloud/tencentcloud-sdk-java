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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceDataHistoryItem extends AbstractModel {

    /**
    * 时间点，毫秒时间戳
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 字段取值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 时间点，毫秒时间戳 
     * @return Time 时间点，毫秒时间戳
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 时间点，毫秒时间戳
     * @param Time 时间点，毫秒时间戳
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 字段取值 
     * @return Value 字段取值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 字段取值
     * @param Value 字段取值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public DeviceDataHistoryItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceDataHistoryItem(DeviceDataHistoryItem source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

