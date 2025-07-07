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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimeValue extends AbstractModel {

    /**
    * 时间，unix时间戳（1590065877s)
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * 当前时间返回参数取值，如（bigvCapFps在1590065877取值为0，则Value：0 ）
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
     * Get 时间，unix时间戳（1590065877s) 
     * @return Time 时间，unix时间戳（1590065877s)
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set 时间，unix时间戳（1590065877s)
     * @param Time 时间，unix时间戳（1590065877s)
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get 当前时间返回参数取值，如（bigvCapFps在1590065877取值为0，则Value：0 ） 
     * @return Value 当前时间返回参数取值，如（bigvCapFps在1590065877取值为0，则Value：0 ）
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set 当前时间返回参数取值，如（bigvCapFps在1590065877取值为0，则Value：0 ）
     * @param Value 当前时间返回参数取值，如（bigvCapFps在1590065877取值为0，则Value：0 ）
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    public TimeValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimeValue(TimeValue source) {
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.Value != null) {
            this.Value = new Float(source.Value);
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

