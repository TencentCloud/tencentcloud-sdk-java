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

public class MaxNewSessionTriggerConfig extends AbstractModel {

    /**
    * 触发阈值统计的时间窗口，取值有：<li>5s：5 秒内；</li><li>10s：10 秒内；</li><li>15s：15 秒内；</li><li>30s：30 秒内；</li><li>60s：60 秒内；</li><li>5m：5 分钟内；</li><li>10m：10 分钟内；</li><li>30m：30 分钟内；</li><li>60m：60 分钟内。</li> 
    */
    @SerializedName("MaxNewSessionCountInterval")
    @Expose
    private String MaxNewSessionCountInterval;

    /**
    * 触发阈值统计的累计次数，取值范围 1 ~ 100000000。
    */
    @SerializedName("MaxNewSessionCountThreshold")
    @Expose
    private Long MaxNewSessionCountThreshold;

    /**
     * Get 触发阈值统计的时间窗口，取值有：<li>5s：5 秒内；</li><li>10s：10 秒内；</li><li>15s：15 秒内；</li><li>30s：30 秒内；</li><li>60s：60 秒内；</li><li>5m：5 分钟内；</li><li>10m：10 分钟内；</li><li>30m：30 分钟内；</li><li>60m：60 分钟内。</li>  
     * @return MaxNewSessionCountInterval 触发阈值统计的时间窗口，取值有：<li>5s：5 秒内；</li><li>10s：10 秒内；</li><li>15s：15 秒内；</li><li>30s：30 秒内；</li><li>60s：60 秒内；</li><li>5m：5 分钟内；</li><li>10m：10 分钟内；</li><li>30m：30 分钟内；</li><li>60m：60 分钟内。</li> 
     */
    public String getMaxNewSessionCountInterval() {
        return this.MaxNewSessionCountInterval;
    }

    /**
     * Set 触发阈值统计的时间窗口，取值有：<li>5s：5 秒内；</li><li>10s：10 秒内；</li><li>15s：15 秒内；</li><li>30s：30 秒内；</li><li>60s：60 秒内；</li><li>5m：5 分钟内；</li><li>10m：10 分钟内；</li><li>30m：30 分钟内；</li><li>60m：60 分钟内。</li> 
     * @param MaxNewSessionCountInterval 触发阈值统计的时间窗口，取值有：<li>5s：5 秒内；</li><li>10s：10 秒内；</li><li>15s：15 秒内；</li><li>30s：30 秒内；</li><li>60s：60 秒内；</li><li>5m：5 分钟内；</li><li>10m：10 分钟内；</li><li>30m：30 分钟内；</li><li>60m：60 分钟内。</li> 
     */
    public void setMaxNewSessionCountInterval(String MaxNewSessionCountInterval) {
        this.MaxNewSessionCountInterval = MaxNewSessionCountInterval;
    }

    /**
     * Get 触发阈值统计的累计次数，取值范围 1 ~ 100000000。 
     * @return MaxNewSessionCountThreshold 触发阈值统计的累计次数，取值范围 1 ~ 100000000。
     */
    public Long getMaxNewSessionCountThreshold() {
        return this.MaxNewSessionCountThreshold;
    }

    /**
     * Set 触发阈值统计的累计次数，取值范围 1 ~ 100000000。
     * @param MaxNewSessionCountThreshold 触发阈值统计的累计次数，取值范围 1 ~ 100000000。
     */
    public void setMaxNewSessionCountThreshold(Long MaxNewSessionCountThreshold) {
        this.MaxNewSessionCountThreshold = MaxNewSessionCountThreshold;
    }

    public MaxNewSessionTriggerConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MaxNewSessionTriggerConfig(MaxNewSessionTriggerConfig source) {
        if (source.MaxNewSessionCountInterval != null) {
            this.MaxNewSessionCountInterval = new String(source.MaxNewSessionCountInterval);
        }
        if (source.MaxNewSessionCountThreshold != null) {
            this.MaxNewSessionCountThreshold = new Long(source.MaxNewSessionCountThreshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxNewSessionCountInterval", this.MaxNewSessionCountInterval);
        this.setParamSimple(map, prefix + "MaxNewSessionCountThreshold", this.MaxNewSessionCountThreshold);

    }
}

