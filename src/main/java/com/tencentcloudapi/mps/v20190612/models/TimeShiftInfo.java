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

public class TimeShiftInfo extends AbstractModel {

    /**
    * 回看窗口，单位秒。
    */
    @SerializedName("TimeWindows")
    @Expose
    private Long TimeWindows;

    /**
     * Get 回看窗口，单位秒。 
     * @return TimeWindows 回看窗口，单位秒。
     */
    public Long getTimeWindows() {
        return this.TimeWindows;
    }

    /**
     * Set 回看窗口，单位秒。
     * @param TimeWindows 回看窗口，单位秒。
     */
    public void setTimeWindows(Long TimeWindows) {
        this.TimeWindows = TimeWindows;
    }

    public TimeShiftInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimeShiftInfo(TimeShiftInfo source) {
        if (source.TimeWindows != null) {
            this.TimeWindows = new Long(source.TimeWindows);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeWindows", this.TimeWindows);

    }
}

