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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PodsMetricSource extends AbstractModel{

    /**
    * 指标名
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 目标值
    */
    @SerializedName("TargetAverageValue")
    @Expose
    private String TargetAverageValue;

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
     * Get 目标值 
     * @return TargetAverageValue 目标值
     */
    public String getTargetAverageValue() {
        return this.TargetAverageValue;
    }

    /**
     * Set 目标值
     * @param TargetAverageValue 目标值
     */
    public void setTargetAverageValue(String TargetAverageValue) {
        this.TargetAverageValue = TargetAverageValue;
    }

    public PodsMetricSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PodsMetricSource(PodsMetricSource source) {
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.TargetAverageValue != null) {
            this.TargetAverageValue = new String(source.TargetAverageValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "TargetAverageValue", this.TargetAverageValue);

    }
}

