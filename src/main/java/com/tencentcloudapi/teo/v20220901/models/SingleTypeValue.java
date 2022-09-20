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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SingleTypeValue extends AbstractModel{

    /**
    * 指标名。
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 指标值。
    */
    @SerializedName("DetailData")
    @Expose
    private Long DetailData;

    /**
     * Get 指标名。 
     * @return MetricName 指标名。
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名。
     * @param MetricName 指标名。
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 指标值。 
     * @return DetailData 指标值。
     */
    public Long getDetailData() {
        return this.DetailData;
    }

    /**
     * Set 指标值。
     * @param DetailData 指标值。
     */
    public void setDetailData(Long DetailData) {
        this.DetailData = DetailData;
    }

    public SingleTypeValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SingleTypeValue(SingleTypeValue source) {
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.DetailData != null) {
            this.DetailData = new Long(source.DetailData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "DetailData", this.DetailData);

    }
}

