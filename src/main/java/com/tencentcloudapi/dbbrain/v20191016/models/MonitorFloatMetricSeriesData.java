/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MonitorFloatMetricSeriesData extends AbstractModel{

    /**
    * 监控指标。
    */
    @SerializedName("Series")
    @Expose
    private MonitorFloatMetric [] Series;

    /**
    * 监控指标对应的时间戳。
    */
    @SerializedName("Timestamp")
    @Expose
    private Long [] Timestamp;

    /**
     * Get 监控指标。 
     * @return Series 监控指标。
     */
    public MonitorFloatMetric [] getSeries() {
        return this.Series;
    }

    /**
     * Set 监控指标。
     * @param Series 监控指标。
     */
    public void setSeries(MonitorFloatMetric [] Series) {
        this.Series = Series;
    }

    /**
     * Get 监控指标对应的时间戳。 
     * @return Timestamp 监控指标对应的时间戳。
     */
    public Long [] getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 监控指标对应的时间戳。
     * @param Timestamp 监控指标对应的时间戳。
     */
    public void setTimestamp(Long [] Timestamp) {
        this.Timestamp = Timestamp;
    }

    public MonitorFloatMetricSeriesData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MonitorFloatMetricSeriesData(MonitorFloatMetricSeriesData source) {
        if (source.Series != null) {
            this.Series = new MonitorFloatMetric[source.Series.length];
            for (int i = 0; i < source.Series.length; i++) {
                this.Series[i] = new MonitorFloatMetric(source.Series[i]);
            }
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long[source.Timestamp.length];
            for (int i = 0; i < source.Timestamp.length; i++) {
                this.Timestamp[i] = new Long(source.Timestamp[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Series.", this.Series);
        this.setParamArraySimple(map, prefix + "Timestamp.", this.Timestamp);

    }
}

