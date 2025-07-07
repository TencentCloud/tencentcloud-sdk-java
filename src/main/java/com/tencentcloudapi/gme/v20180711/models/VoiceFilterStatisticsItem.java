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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VoiceFilterStatisticsItem extends AbstractModel {

    /**
    * 语音过滤总时长，单位为min
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
     * Get 语音过滤总时长，单位为min 
     * @return Duration 语音过滤总时长，单位为min
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 语音过滤总时长，单位为min
     * @param Duration 语音过滤总时长，单位为min
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    public VoiceFilterStatisticsItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceFilterStatisticsItem(VoiceFilterStatisticsItem source) {
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

