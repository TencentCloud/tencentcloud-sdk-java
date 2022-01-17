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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryMetricItem extends AbstractModel{

    /**
    * 指标名
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 同比，已弃用，不建议使用
    */
    @SerializedName("Compare")
    @Expose
    private String Compare;

    /**
    * 同比，支持多种同比方式
    */
    @SerializedName("Compares")
    @Expose
    private String [] Compares;

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
     * Get 同比，已弃用，不建议使用 
     * @return Compare 同比，已弃用，不建议使用
     */
    public String getCompare() {
        return this.Compare;
    }

    /**
     * Set 同比，已弃用，不建议使用
     * @param Compare 同比，已弃用，不建议使用
     */
    public void setCompare(String Compare) {
        this.Compare = Compare;
    }

    /**
     * Get 同比，支持多种同比方式 
     * @return Compares 同比，支持多种同比方式
     */
    public String [] getCompares() {
        return this.Compares;
    }

    /**
     * Set 同比，支持多种同比方式
     * @param Compares 同比，支持多种同比方式
     */
    public void setCompares(String [] Compares) {
        this.Compares = Compares;
    }

    public QueryMetricItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryMetricItem(QueryMetricItem source) {
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Compare != null) {
            this.Compare = new String(source.Compare);
        }
        if (source.Compares != null) {
            this.Compares = new String[source.Compares.length];
            for (int i = 0; i < source.Compares.length; i++) {
                this.Compares[i] = new String(source.Compares[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Compare", this.Compare);
        this.setParamArraySimple(map, prefix + "Compares.", this.Compares);

    }
}

