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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricData extends AbstractModel{

    /**
    * 指标名
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 监控数据点
    */
    @SerializedName("Points")
    @Expose
    private MetricDataPoint [] Points;

    /**
     * Get 指标名 
     * @return MetricName 指标名
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名
     * @param MetricName 指标名
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 监控数据点 
     * @return Points 监控数据点
     */
    public MetricDataPoint [] getPoints() {
        return this.Points;
    }

    /**
     * Set 监控数据点
     * @param Points 监控数据点
     */
    public void setPoints(MetricDataPoint [] Points) {
        this.Points = Points;
    }

    public MetricData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricData(MetricData source) {
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Points != null) {
            this.Points = new MetricDataPoint[source.Points.length];
            for (int i = 0; i < source.Points.length; i++) {
                this.Points[i] = new MetricDataPoint(source.Points[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamArrayObj(map, prefix + "Points.", this.Points);

    }
}

