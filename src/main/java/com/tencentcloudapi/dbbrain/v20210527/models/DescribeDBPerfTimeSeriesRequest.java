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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBPerfTimeSeriesRequest extends AbstractModel {

    /**
    * 需要获取性能趋势的实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 开始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 指标名称，多个指标之间用逗号分隔。
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 TDSQL-C for MySQL，"redis" - 云数据库 Redis，"mongodb" - 云数据库 MongoDB
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 需要获取性能趋势的集群ID。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 性能数据统计粒度。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 实列节点ID。
    */
    @SerializedName("InstanceNodeId")
    @Expose
    private String InstanceNodeId;

    /**
    * 实列代理ID。
    */
    @SerializedName("InstanceProxyId")
    @Expose
    private String InstanceProxyId;

    /**
    * 代理节点ID。
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
     * Get 需要获取性能趋势的实例ID。 
     * @return InstanceId 需要获取性能趋势的实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 需要获取性能趋势的实例ID。
     * @param InstanceId 需要获取性能趋势的实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 开始时间。 
     * @return StartTime 开始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间。
     * @param StartTime 开始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间。 
     * @return EndTime 结束时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间。
     * @param EndTime 结束时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 指标名称，多个指标之间用逗号分隔。 
     * @return Metric 指标名称，多个指标之间用逗号分隔。
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 指标名称，多个指标之间用逗号分隔。
     * @param Metric 指标名称，多个指标之间用逗号分隔。
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 TDSQL-C for MySQL，"redis" - 云数据库 Redis，"mongodb" - 云数据库 MongoDB 
     * @return Product 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 TDSQL-C for MySQL，"redis" - 云数据库 Redis，"mongodb" - 云数据库 MongoDB
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 TDSQL-C for MySQL，"redis" - 云数据库 Redis，"mongodb" - 云数据库 MongoDB
     * @param Product 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 TDSQL-C for MySQL，"redis" - 云数据库 Redis，"mongodb" - 云数据库 MongoDB
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 需要获取性能趋势的集群ID。 
     * @return ClusterId 需要获取性能趋势的集群ID。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 需要获取性能趋势的集群ID。
     * @param ClusterId 需要获取性能趋势的集群ID。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 性能数据统计粒度。 
     * @return Period 性能数据统计粒度。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 性能数据统计粒度。
     * @param Period 性能数据统计粒度。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 实列节点ID。 
     * @return InstanceNodeId 实列节点ID。
     */
    public String getInstanceNodeId() {
        return this.InstanceNodeId;
    }

    /**
     * Set 实列节点ID。
     * @param InstanceNodeId 实列节点ID。
     */
    public void setInstanceNodeId(String InstanceNodeId) {
        this.InstanceNodeId = InstanceNodeId;
    }

    /**
     * Get 实列代理ID。 
     * @return InstanceProxyId 实列代理ID。
     */
    public String getInstanceProxyId() {
        return this.InstanceProxyId;
    }

    /**
     * Set 实列代理ID。
     * @param InstanceProxyId 实列代理ID。
     */
    public void setInstanceProxyId(String InstanceProxyId) {
        this.InstanceProxyId = InstanceProxyId;
    }

    /**
     * Get 代理节点ID。 
     * @return ProxyId 代理节点ID。
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set 代理节点ID。
     * @param ProxyId 代理节点ID。
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    public DescribeDBPerfTimeSeriesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBPerfTimeSeriesRequest(DescribeDBPerfTimeSeriesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.InstanceNodeId != null) {
            this.InstanceNodeId = new String(source.InstanceNodeId);
        }
        if (source.InstanceProxyId != null) {
            this.InstanceProxyId = new String(source.InstanceProxyId);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "InstanceNodeId", this.InstanceNodeId);
        this.setParamSimple(map, prefix + "InstanceProxyId", this.InstanceProxyId);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);

    }
}

