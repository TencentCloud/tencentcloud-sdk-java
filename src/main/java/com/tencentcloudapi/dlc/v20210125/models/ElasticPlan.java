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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ElasticPlan extends AbstractModel {

    /**
    * 最小集群数
    */
    @SerializedName("MinElasticClusters")
    @Expose
    private Long MinElasticClusters;

    /**
    * 最大集群数
    */
    @SerializedName("MaxElasticClusters")
    @Expose
    private Long MaxElasticClusters;

    /**
    * 最大排队时间
    */
    @SerializedName("TolerableQueueTime")
    @Expose
    private Long TolerableQueueTime;

    /**
    * 开始时间，Once格式：yyyy-MM-dd HH:mm:ss; 非Once格式： HH:mm:ss
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，Once格式：yyyy-MM-dd HH:mm:ss; 非Once格式： HH:mm:ss
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 分时弹性上限
    */
    @SerializedName("ElasticLimit")
    @Expose
    private Long ElasticLimit;

    /**
     * Get 最小集群数 
     * @return MinElasticClusters 最小集群数
     */
    public Long getMinElasticClusters() {
        return this.MinElasticClusters;
    }

    /**
     * Set 最小集群数
     * @param MinElasticClusters 最小集群数
     */
    public void setMinElasticClusters(Long MinElasticClusters) {
        this.MinElasticClusters = MinElasticClusters;
    }

    /**
     * Get 最大集群数 
     * @return MaxElasticClusters 最大集群数
     */
    public Long getMaxElasticClusters() {
        return this.MaxElasticClusters;
    }

    /**
     * Set 最大集群数
     * @param MaxElasticClusters 最大集群数
     */
    public void setMaxElasticClusters(Long MaxElasticClusters) {
        this.MaxElasticClusters = MaxElasticClusters;
    }

    /**
     * Get 最大排队时间 
     * @return TolerableQueueTime 最大排队时间
     */
    public Long getTolerableQueueTime() {
        return this.TolerableQueueTime;
    }

    /**
     * Set 最大排队时间
     * @param TolerableQueueTime 最大排队时间
     */
    public void setTolerableQueueTime(Long TolerableQueueTime) {
        this.TolerableQueueTime = TolerableQueueTime;
    }

    /**
     * Get 开始时间，Once格式：yyyy-MM-dd HH:mm:ss; 非Once格式： HH:mm:ss 
     * @return StartTime 开始时间，Once格式：yyyy-MM-dd HH:mm:ss; 非Once格式： HH:mm:ss
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，Once格式：yyyy-MM-dd HH:mm:ss; 非Once格式： HH:mm:ss
     * @param StartTime 开始时间，Once格式：yyyy-MM-dd HH:mm:ss; 非Once格式： HH:mm:ss
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，Once格式：yyyy-MM-dd HH:mm:ss; 非Once格式： HH:mm:ss 
     * @return EndTime 结束时间，Once格式：yyyy-MM-dd HH:mm:ss; 非Once格式： HH:mm:ss
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，Once格式：yyyy-MM-dd HH:mm:ss; 非Once格式： HH:mm:ss
     * @param EndTime 结束时间，Once格式：yyyy-MM-dd HH:mm:ss; 非Once格式： HH:mm:ss
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 分时弹性上限 
     * @return ElasticLimit 分时弹性上限
     */
    public Long getElasticLimit() {
        return this.ElasticLimit;
    }

    /**
     * Set 分时弹性上限
     * @param ElasticLimit 分时弹性上限
     */
    public void setElasticLimit(Long ElasticLimit) {
        this.ElasticLimit = ElasticLimit;
    }

    public ElasticPlan() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ElasticPlan(ElasticPlan source) {
        if (source.MinElasticClusters != null) {
            this.MinElasticClusters = new Long(source.MinElasticClusters);
        }
        if (source.MaxElasticClusters != null) {
            this.MaxElasticClusters = new Long(source.MaxElasticClusters);
        }
        if (source.TolerableQueueTime != null) {
            this.TolerableQueueTime = new Long(source.TolerableQueueTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ElasticLimit != null) {
            this.ElasticLimit = new Long(source.ElasticLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinElasticClusters", this.MinElasticClusters);
        this.setParamSimple(map, prefix + "MaxElasticClusters", this.MaxElasticClusters);
        this.setParamSimple(map, prefix + "TolerableQueueTime", this.TolerableQueueTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ElasticLimit", this.ElasticLimit);

    }
}

