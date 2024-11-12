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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEmrOverviewMetricsRequest extends AbstractModel {

    /**
    * 结束时间
    */
    @SerializedName("End")
    @Expose
    private Long End;

    /**
    * 指标名，NODE.CPU：节点平均CPU利用率和总核数；NODE.CPU.SLHBASE：Serverless实例平均CPU利用率和总核数；HDFS.NN.CAPACITY：存储使用率和总量
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 集群id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 粒度 30s-max 1m-max 1h-max等
    */
    @SerializedName("Downsample")
    @Expose
    private String Downsample;

    /**
    * 起始时间，画饼状图时不传
    */
    @SerializedName("Start")
    @Expose
    private Long Start;

    /**
    * 聚合方法，扩展用，这里目前不用传
    */
    @SerializedName("Aggregator")
    @Expose
    private String Aggregator;

    /**
    * 指标要查询的具体type 如："{"type":"CapacityTotal|CapacityRemaining"}"
    */
    @SerializedName("Tags")
    @Expose
    private String Tags;

    /**
     * Get 结束时间 
     * @return End 结束时间
     */
    public Long getEnd() {
        return this.End;
    }

    /**
     * Set 结束时间
     * @param End 结束时间
     */
    public void setEnd(Long End) {
        this.End = End;
    }

    /**
     * Get 指标名，NODE.CPU：节点平均CPU利用率和总核数；NODE.CPU.SLHBASE：Serverless实例平均CPU利用率和总核数；HDFS.NN.CAPACITY：存储使用率和总量 
     * @return Metric 指标名，NODE.CPU：节点平均CPU利用率和总核数；NODE.CPU.SLHBASE：Serverless实例平均CPU利用率和总核数；HDFS.NN.CAPACITY：存储使用率和总量
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 指标名，NODE.CPU：节点平均CPU利用率和总核数；NODE.CPU.SLHBASE：Serverless实例平均CPU利用率和总核数；HDFS.NN.CAPACITY：存储使用率和总量
     * @param Metric 指标名，NODE.CPU：节点平均CPU利用率和总核数；NODE.CPU.SLHBASE：Serverless实例平均CPU利用率和总核数；HDFS.NN.CAPACITY：存储使用率和总量
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 集群id 
     * @return InstanceId 集群id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群id
     * @param InstanceId 集群id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 粒度 30s-max 1m-max 1h-max等 
     * @return Downsample 粒度 30s-max 1m-max 1h-max等
     */
    public String getDownsample() {
        return this.Downsample;
    }

    /**
     * Set 粒度 30s-max 1m-max 1h-max等
     * @param Downsample 粒度 30s-max 1m-max 1h-max等
     */
    public void setDownsample(String Downsample) {
        this.Downsample = Downsample;
    }

    /**
     * Get 起始时间，画饼状图时不传 
     * @return Start 起始时间，画饼状图时不传
     */
    public Long getStart() {
        return this.Start;
    }

    /**
     * Set 起始时间，画饼状图时不传
     * @param Start 起始时间，画饼状图时不传
     */
    public void setStart(Long Start) {
        this.Start = Start;
    }

    /**
     * Get 聚合方法，扩展用，这里目前不用传 
     * @return Aggregator 聚合方法，扩展用，这里目前不用传
     */
    public String getAggregator() {
        return this.Aggregator;
    }

    /**
     * Set 聚合方法，扩展用，这里目前不用传
     * @param Aggregator 聚合方法，扩展用，这里目前不用传
     */
    public void setAggregator(String Aggregator) {
        this.Aggregator = Aggregator;
    }

    /**
     * Get 指标要查询的具体type 如："{"type":"CapacityTotal|CapacityRemaining"}" 
     * @return Tags 指标要查询的具体type 如："{"type":"CapacityTotal|CapacityRemaining"}"
     */
    public String getTags() {
        return this.Tags;
    }

    /**
     * Set 指标要查询的具体type 如："{"type":"CapacityTotal|CapacityRemaining"}"
     * @param Tags 指标要查询的具体type 如："{"type":"CapacityTotal|CapacityRemaining"}"
     */
    public void setTags(String Tags) {
        this.Tags = Tags;
    }

    public DescribeEmrOverviewMetricsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEmrOverviewMetricsRequest(DescribeEmrOverviewMetricsRequest source) {
        if (source.End != null) {
            this.End = new Long(source.End);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Downsample != null) {
            this.Downsample = new String(source.Downsample);
        }
        if (source.Start != null) {
            this.Start = new Long(source.Start);
        }
        if (source.Aggregator != null) {
            this.Aggregator = new String(source.Aggregator);
        }
        if (source.Tags != null) {
            this.Tags = new String(source.Tags);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "End", this.End);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Downsample", this.Downsample);
        this.setParamSimple(map, prefix + "Start", this.Start);
        this.setParamSimple(map, prefix + "Aggregator", this.Aggregator);
        this.setParamSimple(map, prefix + "Tags", this.Tags);

    }
}

