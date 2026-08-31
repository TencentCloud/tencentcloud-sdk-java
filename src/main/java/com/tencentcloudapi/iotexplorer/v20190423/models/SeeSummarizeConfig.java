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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SeeSummarizeConfig extends AbstractModel {

    /**
    * 是否开启每日总结
    */
    @SerializedName("EnableDailySummary")
    @Expose
    private Boolean EnableDailySummary;

    /**
    * 是否开启每周总结
    */
    @SerializedName("EnableWeeklySummary")
    @Expose
    private Boolean EnableWeeklySummary;

    /**
    * <p>生成总结的详细程度</p><p>枚举值：</p><ul><li>low： 精简</li><li>medium： 概要（默认值）</li></ul>
    */
    @SerializedName("SummaryVerbosity")
    @Expose
    private String SummaryVerbosity;

    /**
     * Get 是否开启每日总结 
     * @return EnableDailySummary 是否开启每日总结
     */
    public Boolean getEnableDailySummary() {
        return this.EnableDailySummary;
    }

    /**
     * Set 是否开启每日总结
     * @param EnableDailySummary 是否开启每日总结
     */
    public void setEnableDailySummary(Boolean EnableDailySummary) {
        this.EnableDailySummary = EnableDailySummary;
    }

    /**
     * Get 是否开启每周总结 
     * @return EnableWeeklySummary 是否开启每周总结
     */
    public Boolean getEnableWeeklySummary() {
        return this.EnableWeeklySummary;
    }

    /**
     * Set 是否开启每周总结
     * @param EnableWeeklySummary 是否开启每周总结
     */
    public void setEnableWeeklySummary(Boolean EnableWeeklySummary) {
        this.EnableWeeklySummary = EnableWeeklySummary;
    }

    /**
     * Get <p>生成总结的详细程度</p><p>枚举值：</p><ul><li>low： 精简</li><li>medium： 概要（默认值）</li></ul> 
     * @return SummaryVerbosity <p>生成总结的详细程度</p><p>枚举值：</p><ul><li>low： 精简</li><li>medium： 概要（默认值）</li></ul>
     */
    public String getSummaryVerbosity() {
        return this.SummaryVerbosity;
    }

    /**
     * Set <p>生成总结的详细程度</p><p>枚举值：</p><ul><li>low： 精简</li><li>medium： 概要（默认值）</li></ul>
     * @param SummaryVerbosity <p>生成总结的详细程度</p><p>枚举值：</p><ul><li>low： 精简</li><li>medium： 概要（默认值）</li></ul>
     */
    public void setSummaryVerbosity(String SummaryVerbosity) {
        this.SummaryVerbosity = SummaryVerbosity;
    }

    public SeeSummarizeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SeeSummarizeConfig(SeeSummarizeConfig source) {
        if (source.EnableDailySummary != null) {
            this.EnableDailySummary = new Boolean(source.EnableDailySummary);
        }
        if (source.EnableWeeklySummary != null) {
            this.EnableWeeklySummary = new Boolean(source.EnableWeeklySummary);
        }
        if (source.SummaryVerbosity != null) {
            this.SummaryVerbosity = new String(source.SummaryVerbosity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableDailySummary", this.EnableDailySummary);
        this.setParamSimple(map, prefix + "EnableWeeklySummary", this.EnableWeeklySummary);
        this.setParamSimple(map, prefix + "SummaryVerbosity", this.SummaryVerbosity);

    }
}

