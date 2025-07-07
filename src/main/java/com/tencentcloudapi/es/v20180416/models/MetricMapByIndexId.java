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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricMapByIndexId extends AbstractModel {

    /**
    * 实例id
    */
    @SerializedName("IndexId")
    @Expose
    private String IndexId;

    /**
    * 指标数据
    */
    @SerializedName("MetricAllData")
    @Expose
    private MetricAllData MetricAllData;

    /**
     * Get 实例id 
     * @return IndexId 实例id
     */
    public String getIndexId() {
        return this.IndexId;
    }

    /**
     * Set 实例id
     * @param IndexId 实例id
     */
    public void setIndexId(String IndexId) {
        this.IndexId = IndexId;
    }

    /**
     * Get 指标数据 
     * @return MetricAllData 指标数据
     */
    public MetricAllData getMetricAllData() {
        return this.MetricAllData;
    }

    /**
     * Set 指标数据
     * @param MetricAllData 指标数据
     */
    public void setMetricAllData(MetricAllData MetricAllData) {
        this.MetricAllData = MetricAllData;
    }

    public MetricMapByIndexId() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricMapByIndexId(MetricMapByIndexId source) {
        if (source.IndexId != null) {
            this.IndexId = new String(source.IndexId);
        }
        if (source.MetricAllData != null) {
            this.MetricAllData = new MetricAllData(source.MetricAllData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IndexId", this.IndexId);
        this.setParamObj(map, prefix + "MetricAllData.", this.MetricAllData);

    }
}

