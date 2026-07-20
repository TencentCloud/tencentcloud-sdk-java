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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCfwRiskOverviewRequest extends AbstractModel {

    /**
    * <p>自定义开始时间。可选，格式 YYYY-MM-DD HH:MM:SS；必须和 EndTime 同时传。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>自定义结束时间。可选，格式 YYYY-MM-DD HH:MM:SS；必须和 StartTime 同时传。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get <p>自定义开始时间。可选，格式 YYYY-MM-DD HH:MM:SS；必须和 EndTime 同时传。</p> 
     * @return StartTime <p>自定义开始时间。可选，格式 YYYY-MM-DD HH:MM:SS；必须和 EndTime 同时传。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>自定义开始时间。可选，格式 YYYY-MM-DD HH:MM:SS；必须和 EndTime 同时传。</p>
     * @param StartTime <p>自定义开始时间。可选，格式 YYYY-MM-DD HH:MM:SS；必须和 EndTime 同时传。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>自定义结束时间。可选，格式 YYYY-MM-DD HH:MM:SS；必须和 StartTime 同时传。</p> 
     * @return EndTime <p>自定义结束时间。可选，格式 YYYY-MM-DD HH:MM:SS；必须和 StartTime 同时传。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>自定义结束时间。可选，格式 YYYY-MM-DD HH:MM:SS；必须和 StartTime 同时传。</p>
     * @param EndTime <p>自定义结束时间。可选，格式 YYYY-MM-DD HH:MM:SS；必须和 StartTime 同时传。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeCfwRiskOverviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCfwRiskOverviewRequest(DescribeCfwRiskOverviewRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
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

