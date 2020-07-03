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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataPointMetric extends AbstractModel{

    /**
    * 数据项
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 数据点的时间和值
    */
    @SerializedName("Points")
    @Expose
    private DataPoint [] Points;

    /**
     * Get 数据项 
     * @return MetricName 数据项
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 数据项
     * @param MetricName 数据项
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 数据点的时间和值 
     * @return Points 数据点的时间和值
     */
    public DataPoint [] getPoints() {
        return this.Points;
    }

    /**
     * Set 数据点的时间和值
     * @param Points 数据点的时间和值
     */
    public void setPoints(DataPoint [] Points) {
        this.Points = Points;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamArrayObj(map, prefix + "Points.", this.Points);

    }
}

