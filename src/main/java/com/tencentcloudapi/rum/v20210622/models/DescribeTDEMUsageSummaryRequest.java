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

public class DescribeTDEMUsageSummaryRequest extends AbstractModel {

    /**
    * <p>开始时间，YYYY-MM-DD HH:00:00（小时对齐，必填）</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间，YYYY-MM-DD HH:00:00（小时对齐，必填）</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>演示模式开关</p>
    */
    @SerializedName("DemoMode")
    @Expose
    private Boolean DemoMode;

    /**
     * Get <p>开始时间，YYYY-MM-DD HH:00:00（小时对齐，必填）</p> 
     * @return StartTime <p>开始时间，YYYY-MM-DD HH:00:00（小时对齐，必填）</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间，YYYY-MM-DD HH:00:00（小时对齐，必填）</p>
     * @param StartTime <p>开始时间，YYYY-MM-DD HH:00:00（小时对齐，必填）</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间，YYYY-MM-DD HH:00:00（小时对齐，必填）</p> 
     * @return EndTime <p>结束时间，YYYY-MM-DD HH:00:00（小时对齐，必填）</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间，YYYY-MM-DD HH:00:00（小时对齐，必填）</p>
     * @param EndTime <p>结束时间，YYYY-MM-DD HH:00:00（小时对齐，必填）</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>演示模式开关</p> 
     * @return DemoMode <p>演示模式开关</p>
     */
    public Boolean getDemoMode() {
        return this.DemoMode;
    }

    /**
     * Set <p>演示模式开关</p>
     * @param DemoMode <p>演示模式开关</p>
     */
    public void setDemoMode(Boolean DemoMode) {
        this.DemoMode = DemoMode;
    }

    public DescribeTDEMUsageSummaryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTDEMUsageSummaryRequest(DescribeTDEMUsageSummaryRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.DemoMode != null) {
            this.DemoMode = new Boolean(source.DemoMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "DemoMode", this.DemoMode);

    }
}

