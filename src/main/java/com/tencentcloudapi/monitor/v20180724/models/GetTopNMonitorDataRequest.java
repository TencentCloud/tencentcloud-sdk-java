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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetTopNMonitorDataRequest extends AbstractModel {

    /**
    * topN
    */
    @SerializedName("N")
    @Expose
    private Long N;

    /**
    * 起始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 截止时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 实例对象的维度组合，格式为key-value键值对形式的集合。不同类型的实例字段完全不同，如CVM为[{"Name":"InstanceId","Value":"ins-j0hk02zo"}]，Ckafka为[{"Name":"instanceId","Value":"ckafka-l49k54dd"}]，COS为[{"Name":"appid","Value":"1258344699"},{"Name":"bucket","Value":"rig-1258344699"}]。各个云产品的维度请参阅各个产品监控指标文档，对应的维度列即为维度组合的key，value为key对应的值。单请求最多支持批量拉取50个实例的监控数据。
    */
    @SerializedName("Instances")
    @Expose
    private Instance [] Instances;

    /**
    * 指标名称，如Bwpresourcebandwidthin，仅支持单指标拉取。各个云产品的详细指标说明请参阅各个产品监控指标文档，对应的指标英文名即为MetricName
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 命名空间，如QCE/CVM。各个云产品的详细命名空间说明请参阅各个产品监控指标文档
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 监控统计周期，如60。默认为取值为60，单位为s。每个指标支持的统计周期不一定相同，各个云产品支持的统计周期请参阅各个产品监控指标文档，对应的统计周期列即为支持的统计周期。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
     * Get topN 
     * @return N topN
     */
    public Long getN() {
        return this.N;
    }

    /**
     * Set topN
     * @param N topN
     */
    public void setN(Long N) {
        this.N = N;
    }

    /**
     * Get 起始时间 
     * @return StartTime 起始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间
     * @param StartTime 起始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 截止时间 
     * @return EndTime 截止时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 截止时间
     * @param EndTime 截止时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 实例对象的维度组合，格式为key-value键值对形式的集合。不同类型的实例字段完全不同，如CVM为[{"Name":"InstanceId","Value":"ins-j0hk02zo"}]，Ckafka为[{"Name":"instanceId","Value":"ckafka-l49k54dd"}]，COS为[{"Name":"appid","Value":"1258344699"},{"Name":"bucket","Value":"rig-1258344699"}]。各个云产品的维度请参阅各个产品监控指标文档，对应的维度列即为维度组合的key，value为key对应的值。单请求最多支持批量拉取50个实例的监控数据。 
     * @return Instances 实例对象的维度组合，格式为key-value键值对形式的集合。不同类型的实例字段完全不同，如CVM为[{"Name":"InstanceId","Value":"ins-j0hk02zo"}]，Ckafka为[{"Name":"instanceId","Value":"ckafka-l49k54dd"}]，COS为[{"Name":"appid","Value":"1258344699"},{"Name":"bucket","Value":"rig-1258344699"}]。各个云产品的维度请参阅各个产品监控指标文档，对应的维度列即为维度组合的key，value为key对应的值。单请求最多支持批量拉取50个实例的监控数据。
     */
    public Instance [] getInstances() {
        return this.Instances;
    }

    /**
     * Set 实例对象的维度组合，格式为key-value键值对形式的集合。不同类型的实例字段完全不同，如CVM为[{"Name":"InstanceId","Value":"ins-j0hk02zo"}]，Ckafka为[{"Name":"instanceId","Value":"ckafka-l49k54dd"}]，COS为[{"Name":"appid","Value":"1258344699"},{"Name":"bucket","Value":"rig-1258344699"}]。各个云产品的维度请参阅各个产品监控指标文档，对应的维度列即为维度组合的key，value为key对应的值。单请求最多支持批量拉取50个实例的监控数据。
     * @param Instances 实例对象的维度组合，格式为key-value键值对形式的集合。不同类型的实例字段完全不同，如CVM为[{"Name":"InstanceId","Value":"ins-j0hk02zo"}]，Ckafka为[{"Name":"instanceId","Value":"ckafka-l49k54dd"}]，COS为[{"Name":"appid","Value":"1258344699"},{"Name":"bucket","Value":"rig-1258344699"}]。各个云产品的维度请参阅各个产品监控指标文档，对应的维度列即为维度组合的key，value为key对应的值。单请求最多支持批量拉取50个实例的监控数据。
     */
    public void setInstances(Instance [] Instances) {
        this.Instances = Instances;
    }

    /**
     * Get 指标名称，如Bwpresourcebandwidthin，仅支持单指标拉取。各个云产品的详细指标说明请参阅各个产品监控指标文档，对应的指标英文名即为MetricName 
     * @return MetricName 指标名称，如Bwpresourcebandwidthin，仅支持单指标拉取。各个云产品的详细指标说明请参阅各个产品监控指标文档，对应的指标英文名即为MetricName
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名称，如Bwpresourcebandwidthin，仅支持单指标拉取。各个云产品的详细指标说明请参阅各个产品监控指标文档，对应的指标英文名即为MetricName
     * @param MetricName 指标名称，如Bwpresourcebandwidthin，仅支持单指标拉取。各个云产品的详细指标说明请参阅各个产品监控指标文档，对应的指标英文名即为MetricName
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 命名空间，如QCE/CVM。各个云产品的详细命名空间说明请参阅各个产品监控指标文档 
     * @return Namespace 命名空间，如QCE/CVM。各个云产品的详细命名空间说明请参阅各个产品监控指标文档
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间，如QCE/CVM。各个云产品的详细命名空间说明请参阅各个产品监控指标文档
     * @param Namespace 命名空间，如QCE/CVM。各个云产品的详细命名空间说明请参阅各个产品监控指标文档
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 监控统计周期，如60。默认为取值为60，单位为s。每个指标支持的统计周期不一定相同，各个云产品支持的统计周期请参阅各个产品监控指标文档，对应的统计周期列即为支持的统计周期。 
     * @return Period 监控统计周期，如60。默认为取值为60，单位为s。每个指标支持的统计周期不一定相同，各个云产品支持的统计周期请参阅各个产品监控指标文档，对应的统计周期列即为支持的统计周期。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 监控统计周期，如60。默认为取值为60，单位为s。每个指标支持的统计周期不一定相同，各个云产品支持的统计周期请参阅各个产品监控指标文档，对应的统计周期列即为支持的统计周期。
     * @param Period 监控统计周期，如60。默认为取值为60，单位为s。每个指标支持的统计周期不一定相同，各个云产品支持的统计周期请参阅各个产品监控指标文档，对应的统计周期列即为支持的统计周期。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    public GetTopNMonitorDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetTopNMonitorDataRequest(GetTopNMonitorDataRequest source) {
        if (source.N != null) {
            this.N = new Long(source.N);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Instances != null) {
            this.Instances = new Instance[source.Instances.length];
            for (int i = 0; i < source.Instances.length; i++) {
                this.Instances[i] = new Instance(source.Instances[i]);
            }
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "N", this.N);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "Instances.", this.Instances);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}

