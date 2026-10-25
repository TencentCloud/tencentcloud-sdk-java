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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UsageTimePoint extends AbstractModel {

    /**
    * <p>时间 YYYY-MM-DD HH:00:00</p>
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * <p>上报量</p>
    */
    @SerializedName("ReportVolume")
    @Expose
    private Long ReportVolume;

    /**
     * Get <p>时间 YYYY-MM-DD HH:00:00</p> 
     * @return Time <p>时间 YYYY-MM-DD HH:00:00</p>
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set <p>时间 YYYY-MM-DD HH:00:00</p>
     * @param Time <p>时间 YYYY-MM-DD HH:00:00</p>
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get <p>上报量</p> 
     * @return ReportVolume <p>上报量</p>
     */
    public Long getReportVolume() {
        return this.ReportVolume;
    }

    /**
     * Set <p>上报量</p>
     * @param ReportVolume <p>上报量</p>
     */
    public void setReportVolume(Long ReportVolume) {
        this.ReportVolume = ReportVolume;
    }

    public UsageTimePoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsageTimePoint(UsageTimePoint source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.ReportVolume != null) {
            this.ReportVolume = new Long(source.ReportVolume);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "ReportVolume", this.ReportVolume);

    }
}

