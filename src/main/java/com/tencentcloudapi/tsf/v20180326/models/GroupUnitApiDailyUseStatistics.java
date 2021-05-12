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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupUnitApiDailyUseStatistics extends AbstractModel{

    /**
    * 命名空间ID
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 命名空间名称
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 该API在该命名空间下的总调用次数
    */
    @SerializedName("SumReqAmount")
    @Expose
    private String SumReqAmount;

    /**
    * 该API在该命名空间下的平均错误率
    */
    @SerializedName("AvgFailureRate")
    @Expose
    private String AvgFailureRate;

    /**
    * 该API在该命名空间下的平均响应时间
    */
    @SerializedName("AvgTimeCost")
    @Expose
    private String AvgTimeCost;

    /**
    * 监控数据曲线点位图Map集合
    */
    @SerializedName("MetricDataPointMap")
    @Expose
    private MetricDataPointMap MetricDataPointMap;

    /**
    * 状态码分布详情
    */
    @SerializedName("TopStatusCode")
    @Expose
    private ApiUseStatisticsEntity [] TopStatusCode;

    /**
    * 耗时分布详情
    */
    @SerializedName("TopTimeCost")
    @Expose
    private ApiUseStatisticsEntity [] TopTimeCost;

    /**
    * 分位值对象
    */
    @SerializedName("Quantile")
    @Expose
    private QuantileEntity Quantile;

    /**
     * Get 命名空间ID 
     * @return NamespaceId 命名空间ID
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间ID
     * @param NamespaceId 命名空间ID
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 命名空间名称 
     * @return NamespaceName 命名空间名称
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 命名空间名称
     * @param NamespaceName 命名空间名称
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get 该API在该命名空间下的总调用次数 
     * @return SumReqAmount 该API在该命名空间下的总调用次数
     */
    public String getSumReqAmount() {
        return this.SumReqAmount;
    }

    /**
     * Set 该API在该命名空间下的总调用次数
     * @param SumReqAmount 该API在该命名空间下的总调用次数
     */
    public void setSumReqAmount(String SumReqAmount) {
        this.SumReqAmount = SumReqAmount;
    }

    /**
     * Get 该API在该命名空间下的平均错误率 
     * @return AvgFailureRate 该API在该命名空间下的平均错误率
     */
    public String getAvgFailureRate() {
        return this.AvgFailureRate;
    }

    /**
     * Set 该API在该命名空间下的平均错误率
     * @param AvgFailureRate 该API在该命名空间下的平均错误率
     */
    public void setAvgFailureRate(String AvgFailureRate) {
        this.AvgFailureRate = AvgFailureRate;
    }

    /**
     * Get 该API在该命名空间下的平均响应时间 
     * @return AvgTimeCost 该API在该命名空间下的平均响应时间
     */
    public String getAvgTimeCost() {
        return this.AvgTimeCost;
    }

    /**
     * Set 该API在该命名空间下的平均响应时间
     * @param AvgTimeCost 该API在该命名空间下的平均响应时间
     */
    public void setAvgTimeCost(String AvgTimeCost) {
        this.AvgTimeCost = AvgTimeCost;
    }

    /**
     * Get 监控数据曲线点位图Map集合 
     * @return MetricDataPointMap 监控数据曲线点位图Map集合
     */
    public MetricDataPointMap getMetricDataPointMap() {
        return this.MetricDataPointMap;
    }

    /**
     * Set 监控数据曲线点位图Map集合
     * @param MetricDataPointMap 监控数据曲线点位图Map集合
     */
    public void setMetricDataPointMap(MetricDataPointMap MetricDataPointMap) {
        this.MetricDataPointMap = MetricDataPointMap;
    }

    /**
     * Get 状态码分布详情 
     * @return TopStatusCode 状态码分布详情
     */
    public ApiUseStatisticsEntity [] getTopStatusCode() {
        return this.TopStatusCode;
    }

    /**
     * Set 状态码分布详情
     * @param TopStatusCode 状态码分布详情
     */
    public void setTopStatusCode(ApiUseStatisticsEntity [] TopStatusCode) {
        this.TopStatusCode = TopStatusCode;
    }

    /**
     * Get 耗时分布详情 
     * @return TopTimeCost 耗时分布详情
     */
    public ApiUseStatisticsEntity [] getTopTimeCost() {
        return this.TopTimeCost;
    }

    /**
     * Set 耗时分布详情
     * @param TopTimeCost 耗时分布详情
     */
    public void setTopTimeCost(ApiUseStatisticsEntity [] TopTimeCost) {
        this.TopTimeCost = TopTimeCost;
    }

    /**
     * Get 分位值对象 
     * @return Quantile 分位值对象
     */
    public QuantileEntity getQuantile() {
        return this.Quantile;
    }

    /**
     * Set 分位值对象
     * @param Quantile 分位值对象
     */
    public void setQuantile(QuantileEntity Quantile) {
        this.Quantile = Quantile;
    }

    public GroupUnitApiDailyUseStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupUnitApiDailyUseStatistics(GroupUnitApiDailyUseStatistics source) {
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.SumReqAmount != null) {
            this.SumReqAmount = new String(source.SumReqAmount);
        }
        if (source.AvgFailureRate != null) {
            this.AvgFailureRate = new String(source.AvgFailureRate);
        }
        if (source.AvgTimeCost != null) {
            this.AvgTimeCost = new String(source.AvgTimeCost);
        }
        if (source.MetricDataPointMap != null) {
            this.MetricDataPointMap = new MetricDataPointMap(source.MetricDataPointMap);
        }
        if (source.TopStatusCode != null) {
            this.TopStatusCode = new ApiUseStatisticsEntity[source.TopStatusCode.length];
            for (int i = 0; i < source.TopStatusCode.length; i++) {
                this.TopStatusCode[i] = new ApiUseStatisticsEntity(source.TopStatusCode[i]);
            }
        }
        if (source.TopTimeCost != null) {
            this.TopTimeCost = new ApiUseStatisticsEntity[source.TopTimeCost.length];
            for (int i = 0; i < source.TopTimeCost.length; i++) {
                this.TopTimeCost[i] = new ApiUseStatisticsEntity(source.TopTimeCost[i]);
            }
        }
        if (source.Quantile != null) {
            this.Quantile = new QuantileEntity(source.Quantile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "SumReqAmount", this.SumReqAmount);
        this.setParamSimple(map, prefix + "AvgFailureRate", this.AvgFailureRate);
        this.setParamSimple(map, prefix + "AvgTimeCost", this.AvgTimeCost);
        this.setParamObj(map, prefix + "MetricDataPointMap.", this.MetricDataPointMap);
        this.setParamArrayObj(map, prefix + "TopStatusCode.", this.TopStatusCode);
        this.setParamArrayObj(map, prefix + "TopTimeCost.", this.TopTimeCost);
        this.setParamObj(map, prefix + "Quantile.", this.Quantile);

    }
}

