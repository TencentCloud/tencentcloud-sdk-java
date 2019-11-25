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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaradData  extends AbstractModel{

    /**
    * 指标名（connum表示TCP连接数；new_conn表示新增TCP连接数；intraffic表示入流量；outtraffic表示出流量）
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 值数组
    */
    @SerializedName("Data")
    @Expose
    private Float [] Data;

    /**
    * 值数组的大小
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * 获取指标名（connum表示TCP连接数；new_conn表示新增TCP连接数；intraffic表示入流量；outtraffic表示出流量）
     * @return MetricName 指标名（connum表示TCP连接数；new_conn表示新增TCP连接数；intraffic表示入流量；outtraffic表示出流量）
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * 设置指标名（connum表示TCP连接数；new_conn表示新增TCP连接数；intraffic表示入流量；outtraffic表示出流量）
     * @param MetricName 指标名（connum表示TCP连接数；new_conn表示新增TCP连接数；intraffic表示入流量；outtraffic表示出流量）
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * 获取值数组
     * @return Data 值数组
     */
    public Float [] getData() {
        return this.Data;
    }

    /**
     * 设置值数组
     * @param Data 值数组
     */
    public void setData(Float [] Data) {
        this.Data = Data;
    }

    /**
     * 获取值数组的大小
     * @return Count 值数组的大小
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * 设置值数组的大小
     * @param Count 值数组的大小
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamArraySimple(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

