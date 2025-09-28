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

public class DescribeMetricTopProxiesRequest extends AbstractModel {

    /**
    * 开始时间，如“2021-05-27 00:00:00”，支持的最早查询时间为当前时间的前30天。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，如“2021-05-27 01:00:00”，支持的最早查询时间为当前时间的前30天。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 实例ID列表。可通过 [DescribeDiagDBInstances](https://cloud.tencent.com/document/api/1130/57798) 接口获取。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 服务产品类型，支持值包括："mysql" - 云数据库 MySQL，"redis" - 云数据库 Redis，"mariadb"-数据库mariadb    默认为"mysql"。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 指标 eg: cpu_util, connections
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 默认前20条
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 开始时间，如“2021-05-27 00:00:00”，支持的最早查询时间为当前时间的前30天。 
     * @return StartTime 开始时间，如“2021-05-27 00:00:00”，支持的最早查询时间为当前时间的前30天。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，如“2021-05-27 00:00:00”，支持的最早查询时间为当前时间的前30天。
     * @param StartTime 开始时间，如“2021-05-27 00:00:00”，支持的最早查询时间为当前时间的前30天。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，如“2021-05-27 01:00:00”，支持的最早查询时间为当前时间的前30天。 
     * @return EndTime 结束时间，如“2021-05-27 01:00:00”，支持的最早查询时间为当前时间的前30天。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，如“2021-05-27 01:00:00”，支持的最早查询时间为当前时间的前30天。
     * @param EndTime 结束时间，如“2021-05-27 01:00:00”，支持的最早查询时间为当前时间的前30天。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 实例ID列表。可通过 [DescribeDiagDBInstances](https://cloud.tencent.com/document/api/1130/57798) 接口获取。 
     * @return InstanceId 实例ID列表。可通过 [DescribeDiagDBInstances](https://cloud.tencent.com/document/api/1130/57798) 接口获取。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID列表。可通过 [DescribeDiagDBInstances](https://cloud.tencent.com/document/api/1130/57798) 接口获取。
     * @param InstanceId 实例ID列表。可通过 [DescribeDiagDBInstances](https://cloud.tencent.com/document/api/1130/57798) 接口获取。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 服务产品类型，支持值包括："mysql" - 云数据库 MySQL，"redis" - 云数据库 Redis，"mariadb"-数据库mariadb    默认为"mysql"。 
     * @return Product 服务产品类型，支持值包括："mysql" - 云数据库 MySQL，"redis" - 云数据库 Redis，"mariadb"-数据库mariadb    默认为"mysql"。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，支持值包括："mysql" - 云数据库 MySQL，"redis" - 云数据库 Redis，"mariadb"-数据库mariadb    默认为"mysql"。
     * @param Product 服务产品类型，支持值包括："mysql" - 云数据库 MySQL，"redis" - 云数据库 Redis，"mariadb"-数据库mariadb    默认为"mysql"。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 指标 eg: cpu_util, connections 
     * @return Metric 指标 eg: cpu_util, connections
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 指标 eg: cpu_util, connections
     * @param Metric 指标 eg: cpu_util, connections
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 默认前20条 
     * @return Limit 默认前20条
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 默认前20条
     * @param Limit 默认前20条
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeMetricTopProxiesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMetricTopProxiesRequest(DescribeMetricTopProxiesRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

