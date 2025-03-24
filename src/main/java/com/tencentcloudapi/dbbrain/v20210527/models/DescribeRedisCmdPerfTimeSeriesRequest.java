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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRedisCmdPerfTimeSeriesRequest extends AbstractModel {

    /**
    * 实例 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 服务产品类型，仅仅支持值 "redis" - 云数据库 Redis。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 开始时间，如“2025-03-17T00:00:00+00:00”。0天 < 当前服务器时间 - 开始时间 <= 10天。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，如“2025-03-17T01:00:00+00:00”，0天 < 结束时间 - 开始时间 <= 10天。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 需要分析的redis命令
    */
    @SerializedName("CommandList")
    @Expose
    private String [] CommandList;

    /**
    * 监控指标，以逗号分隔
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 监控指标时间粒度，单位秒，若不提供则根据开始时间和结束时间取默认值
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
     * Get 实例 ID 
     * @return InstanceId 实例 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID
     * @param InstanceId 实例 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 服务产品类型，仅仅支持值 "redis" - 云数据库 Redis。 
     * @return Product 服务产品类型，仅仅支持值 "redis" - 云数据库 Redis。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，仅仅支持值 "redis" - 云数据库 Redis。
     * @param Product 服务产品类型，仅仅支持值 "redis" - 云数据库 Redis。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 开始时间，如“2025-03-17T00:00:00+00:00”。0天 < 当前服务器时间 - 开始时间 <= 10天。 
     * @return StartTime 开始时间，如“2025-03-17T00:00:00+00:00”。0天 < 当前服务器时间 - 开始时间 <= 10天。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，如“2025-03-17T00:00:00+00:00”。0天 < 当前服务器时间 - 开始时间 <= 10天。
     * @param StartTime 开始时间，如“2025-03-17T00:00:00+00:00”。0天 < 当前服务器时间 - 开始时间 <= 10天。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，如“2025-03-17T01:00:00+00:00”，0天 < 结束时间 - 开始时间 <= 10天。 
     * @return EndTime 结束时间，如“2025-03-17T01:00:00+00:00”，0天 < 结束时间 - 开始时间 <= 10天。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，如“2025-03-17T01:00:00+00:00”，0天 < 结束时间 - 开始时间 <= 10天。
     * @param EndTime 结束时间，如“2025-03-17T01:00:00+00:00”，0天 < 结束时间 - 开始时间 <= 10天。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 需要分析的redis命令 
     * @return CommandList 需要分析的redis命令
     */
    public String [] getCommandList() {
        return this.CommandList;
    }

    /**
     * Set 需要分析的redis命令
     * @param CommandList 需要分析的redis命令
     */
    public void setCommandList(String [] CommandList) {
        this.CommandList = CommandList;
    }

    /**
     * Get 监控指标，以逗号分隔 
     * @return Metric 监控指标，以逗号分隔
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 监控指标，以逗号分隔
     * @param Metric 监控指标，以逗号分隔
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 监控指标时间粒度，单位秒，若不提供则根据开始时间和结束时间取默认值 
     * @return Period 监控指标时间粒度，单位秒，若不提供则根据开始时间和结束时间取默认值
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 监控指标时间粒度，单位秒，若不提供则根据开始时间和结束时间取默认值
     * @param Period 监控指标时间粒度，单位秒，若不提供则根据开始时间和结束时间取默认值
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    public DescribeRedisCmdPerfTimeSeriesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRedisCmdPerfTimeSeriesRequest(DescribeRedisCmdPerfTimeSeriesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CommandList != null) {
            this.CommandList = new String[source.CommandList.length];
            for (int i = 0; i < source.CommandList.length; i++) {
                this.CommandList[i] = new String(source.CommandList[i]);
            }
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "CommandList.", this.CommandList);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}

