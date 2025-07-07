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
package com.tencentcloudapi.yinsuda.v20220527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChorusClip extends AbstractModel {

    /**
    * 开始时间，单位：毫秒。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间，单位：毫秒。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get 开始时间，单位：毫秒。 
     * @return StartTime 开始时间，单位：毫秒。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，单位：毫秒。
     * @param StartTime 开始时间，单位：毫秒。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，单位：毫秒。 
     * @return EndTime 结束时间，单位：毫秒。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，单位：毫秒。
     * @param EndTime 结束时间，单位：毫秒。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public ChorusClip() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChorusClip(ChorusClip source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

