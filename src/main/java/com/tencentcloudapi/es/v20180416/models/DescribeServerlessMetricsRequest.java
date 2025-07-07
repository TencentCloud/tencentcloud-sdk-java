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
    * 指标类型，暂时只支持Storage(存储大小),AllMetric(所有存储指标：索引流量、存储大小、文档数量、读请求和写请求)
    */
    @SerializedName("MetricType")
    @Expose
    private String [] MetricType;

    /**
    * 时间长度类型DurationType(1: 3小时, 2: 昨天1天,3: 今日0点到现在)
    */
    @SerializedName("DurationType")
    @Expose
    private Long DurationType;

    /**
    * 索引数据
    */
    @SerializedName("BatchIndexList")
    @Expose
    private String [] BatchIndexList;

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
     * Get 指标类型，暂时只支持Storage(存储大小),AllMetric(所有存储指标：索引流量、存储大小、文档数量、读请求和写请求) 
     * @return MetricType 指标类型，暂时只支持Storage(存储大小),AllMetric(所有存储指标：索引流量、存储大小、文档数量、读请求和写请求)
     */
    public String [] getMetricType() {
        return this.MetricType;
    }

    /**
     * Set 指标类型，暂时只支持Storage(存储大小),AllMetric(所有存储指标：索引流量、存储大小、文档数量、读请求和写请求)
     * @param MetricType 指标类型，暂时只支持Storage(存储大小),AllMetric(所有存储指标：索引流量、存储大小、文档数量、读请求和写请求)
     */
    public void setMetricType(String [] MetricType) {
        this.MetricType = MetricType;
    }

    /**
     * Get 时间长度类型DurationType(1: 3小时, 2: 昨天1天,3: 今日0点到现在) 
     * @return DurationType 时间长度类型DurationType(1: 3小时, 2: 昨天1天,3: 今日0点到现在)
     */
    public Long getDurationType() {
        return this.DurationType;
    }

    /**
     * Set 时间长度类型DurationType(1: 3小时, 2: 昨天1天,3: 今日0点到现在)
     * @param DurationType 时间长度类型DurationType(1: 3小时, 2: 昨天1天,3: 今日0点到现在)
     */
    public void setDurationType(Long DurationType) {
        this.DurationType = DurationType;
    }

    /**
     * Get 索引数据 
     * @return BatchIndexList 索引数据
     */
    public String [] getBatchIndexList() {
        return this.BatchIndexList;
    }

    /**
     * Set 索引数据
     * @param BatchIndexList 索引数据
     */
    public void setBatchIndexList(String [] BatchIndexList) {
        this.BatchIndexList = BatchIndexList;
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
        if (source.DurationType != null) {
            this.DurationType = new Long(source.DurationType);
        }
        if (source.BatchIndexList != null) {
            this.BatchIndexList = new String[source.BatchIndexList.length];
            for (int i = 0; i < source.BatchIndexList.length; i++) {
                this.BatchIndexList[i] = new String(source.BatchIndexList[i]);
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
        this.setParamSimple(map, prefix + "DurationType", this.DurationType);
        this.setParamArraySimple(map, prefix + "BatchIndexList.", this.BatchIndexList);

    }
}

