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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeServerlessMetricsRequest extends AbstractModel {

    /**
    * space空间id
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * index索引id
    */
    @SerializedName("IndexId")
    @Expose
    private String IndexId;

    /**
    * 指标类型，暂时只支持Storage
    */
    @SerializedName("MetricType")
    @Expose
    private String [] MetricType;

    /**
     * Get space空间id 
     * @return SpaceId space空间id
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set space空间id
     * @param SpaceId space空间id
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get index索引id 
     * @return IndexId index索引id
     */
    public String getIndexId() {
        return this.IndexId;
    }

    /**
     * Set index索引id
     * @param IndexId index索引id
     */
    public void setIndexId(String IndexId) {
        this.IndexId = IndexId;
    }

    /**
     * Get 指标类型，暂时只支持Storage 
     * @return MetricType 指标类型，暂时只支持Storage
     */
    public String [] getMetricType() {
        return this.MetricType;
    }

    /**
     * Set 指标类型，暂时只支持Storage
     * @param MetricType 指标类型，暂时只支持Storage
     */
    public void setMetricType(String [] MetricType) {
        this.MetricType = MetricType;
    }

    public DescribeServerlessMetricsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeServerlessMetricsRequest(DescribeServerlessMetricsRequest source) {
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.IndexId != null) {
            this.IndexId = new String(source.IndexId);
        }
        if (source.MetricType != null) {
            this.MetricType = new String[source.MetricType.length];
            for (int i = 0; i < source.MetricType.length; i++) {
                this.MetricType[i] = new String(source.MetricType[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "IndexId", this.IndexId);
        this.setParamArraySimple(map, prefix + "MetricType.", this.MetricType);

    }
}

