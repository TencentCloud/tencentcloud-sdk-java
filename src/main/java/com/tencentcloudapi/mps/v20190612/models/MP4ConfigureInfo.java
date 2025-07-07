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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MP4ConfigureInfo extends AbstractModel {

    /**
    * 录制周期，单位：秒，取值范围 10 分钟到720分钟。默认值：60分钟（3600秒）。
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
     * Get 录制周期，单位：秒，取值范围 10 分钟到720分钟。默认值：60分钟（3600秒）。 
     * @return Interval 录制周期，单位：秒，取值范围 10 分钟到720分钟。默认值：60分钟（3600秒）。
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 录制周期，单位：秒，取值范围 10 分钟到720分钟。默认值：60分钟（3600秒）。
     * @param Interval 录制周期，单位：秒，取值范围 10 分钟到720分钟。默认值：60分钟（3600秒）。
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    public MP4ConfigureInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MP4ConfigureInfo(MP4ConfigureInfo source) {
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Interval", this.Interval);

    }
}

