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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MinimalRequestBodyTransferRate extends AbstractModel {

    /**
    * 正文传输最小速率阈值，单位仅支持bps。
    */
    @SerializedName("MinimalAvgTransferRateThreshold")
    @Expose
    private String MinimalAvgTransferRateThreshold;

    /**
    * 正文传输最小速率统计时间范围，取值有：<li>10s：10秒；</li><li>30s：30秒；</li><li>60s：60秒；</li><li>120s：120秒。</li> 
    */
    @SerializedName("CountingPeriod")
    @Expose
    private String CountingPeriod;

    /**
    * 正文传输最小速率阈值是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
     * Get 正文传输最小速率阈值，单位仅支持bps。 
     * @return MinimalAvgTransferRateThreshold 正文传输最小速率阈值，单位仅支持bps。
     */
    public String getMinimalAvgTransferRateThreshold() {
        return this.MinimalAvgTransferRateThreshold;
    }

    /**
     * Set 正文传输最小速率阈值，单位仅支持bps。
     * @param MinimalAvgTransferRateThreshold 正文传输最小速率阈值，单位仅支持bps。
     */
    public void setMinimalAvgTransferRateThreshold(String MinimalAvgTransferRateThreshold) {
        this.MinimalAvgTransferRateThreshold = MinimalAvgTransferRateThreshold;
    }

    /**
     * Get 正文传输最小速率统计时间范围，取值有：<li>10s：10秒；</li><li>30s：30秒；</li><li>60s：60秒；</li><li>120s：120秒。</li>  
     * @return CountingPeriod 正文传输最小速率统计时间范围，取值有：<li>10s：10秒；</li><li>30s：30秒；</li><li>60s：60秒；</li><li>120s：120秒。</li> 
     */
    public String getCountingPeriod() {
        return this.CountingPeriod;
    }

    /**
     * Set 正文传输最小速率统计时间范围，取值有：<li>10s：10秒；</li><li>30s：30秒；</li><li>60s：60秒；</li><li>120s：120秒。</li> 
     * @param CountingPeriod 正文传输最小速率统计时间范围，取值有：<li>10s：10秒；</li><li>30s：30秒；</li><li>60s：60秒；</li><li>120s：120秒。</li> 
     */
    public void setCountingPeriod(String CountingPeriod) {
        this.CountingPeriod = CountingPeriod;
    }

    /**
     * Get 正文传输最小速率阈值是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li> 
     * @return Enabled 正文传输最小速率阈值是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 正文传输最小速率阈值是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
     * @param Enabled 正文传输最小速率阈值是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    public MinimalRequestBodyTransferRate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MinimalRequestBodyTransferRate(MinimalRequestBodyTransferRate source) {
        if (source.MinimalAvgTransferRateThreshold != null) {
            this.MinimalAvgTransferRateThreshold = new String(source.MinimalAvgTransferRateThreshold);
        }
        if (source.CountingPeriod != null) {
            this.CountingPeriod = new String(source.CountingPeriod);
        }
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinimalAvgTransferRateThreshold", this.MinimalAvgTransferRateThreshold);
        this.setParamSimple(map, prefix + "CountingPeriod", this.CountingPeriod);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

