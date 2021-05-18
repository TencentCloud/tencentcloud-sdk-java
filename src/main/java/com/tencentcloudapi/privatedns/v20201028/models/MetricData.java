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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricData extends AbstractModel{

    /**
    * 资源描述
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * 表名
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 表数据
    */
    @SerializedName("DataSet")
    @Expose
    private DatePoint [] DataSet;

    /**
     * Get 资源描述 
     * @return Resource 资源描述
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set 资源描述
     * @param Resource 资源描述
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 表名 
     * @return Metric 表名
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 表名
     * @param Metric 表名
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 表数据 
     * @return DataSet 表数据
     */
    public DatePoint [] getDataSet() {
        return this.DataSet;
    }

    /**
     * Set 表数据
     * @param DataSet 表数据
     */
    public void setDataSet(DatePoint [] DataSet) {
        this.DataSet = DataSet;
    }

    public MetricData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricData(MetricData source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.DataSet != null) {
            this.DataSet = new DatePoint[source.DataSet.length];
            for (int i = 0; i < source.DataSet.length; i++) {
                this.DataSet[i] = new DatePoint(source.DataSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamArrayObj(map, prefix + "DataSet.", this.DataSet);

    }
}

