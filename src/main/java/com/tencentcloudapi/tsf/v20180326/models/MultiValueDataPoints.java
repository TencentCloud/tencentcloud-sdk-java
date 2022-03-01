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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MultiValueDataPoints extends AbstractModel{

    /**
    * 多值数据点
    */
    @SerializedName("Points")
    @Expose
    private MultiValue [] Points;

    /**
    * 指标名称
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 多值数据点key列表，每个值表示当前数据点所在区域的下限
    */
    @SerializedName("PointKeys")
    @Expose
    private String [] PointKeys;

    /**
     * Get 多值数据点 
     * @return Points 多值数据点
     */
    public MultiValue [] getPoints() {
        return this.Points;
    }

    /**
     * Set 多值数据点
     * @param Points 多值数据点
     */
    public void setPoints(MultiValue [] Points) {
        this.Points = Points;
    }

    /**
     * Get 指标名称 
     * @return MetricName 指标名称
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名称
     * @param MetricName 指标名称
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 多值数据点key列表，每个值表示当前数据点所在区域的下限 
     * @return PointKeys 多值数据点key列表，每个值表示当前数据点所在区域的下限
     */
    public String [] getPointKeys() {
        return this.PointKeys;
    }

    /**
     * Set 多值数据点key列表，每个值表示当前数据点所在区域的下限
     * @param PointKeys 多值数据点key列表，每个值表示当前数据点所在区域的下限
     */
    public void setPointKeys(String [] PointKeys) {
        this.PointKeys = PointKeys;
    }

    public MultiValueDataPoints() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiValueDataPoints(MultiValueDataPoints source) {
        if (source.Points != null) {
            this.Points = new MultiValue[source.Points.length];
            for (int i = 0; i < source.Points.length; i++) {
                this.Points[i] = new MultiValue(source.Points[i]);
            }
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.PointKeys != null) {
            this.PointKeys = new String[source.PointKeys.length];
            for (int i = 0; i < source.PointKeys.length; i++) {
                this.PointKeys[i] = new String(source.PointKeys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Points.", this.Points);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamArraySimple(map, prefix + "PointKeys.", this.PointKeys);

    }
}

