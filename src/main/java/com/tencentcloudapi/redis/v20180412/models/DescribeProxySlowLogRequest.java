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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProxySlowLogRequest extends AbstractModel {

    /**
    * 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。

    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 慢查询的开始时间，查询时间最大跨度30天。
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 慢查询的结束时间，查询时间最大跨度30天。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 慢查询阈值，单位：毫秒。
    */
    @SerializedName("MinQueryTime")
    @Expose
    private Long MinQueryTime;

    /**
    * 每页输出的任务列表大小，默认为 20，最多输出100条。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量，取Limit整数倍，计算公式：offset=limit*(页码-1)。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。
 
     * @return InstanceId 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。

     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。

     * @param InstanceId 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。

     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 慢查询的开始时间，查询时间最大跨度30天。 
     * @return BeginTime 慢查询的开始时间，查询时间最大跨度30天。
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 慢查询的开始时间，查询时间最大跨度30天。
     * @param BeginTime 慢查询的开始时间，查询时间最大跨度30天。
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 慢查询的结束时间，查询时间最大跨度30天。 
     * @return EndTime 慢查询的结束时间，查询时间最大跨度30天。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 慢查询的结束时间，查询时间最大跨度30天。
     * @param EndTime 慢查询的结束时间，查询时间最大跨度30天。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 慢查询阈值，单位：毫秒。 
     * @return MinQueryTime 慢查询阈值，单位：毫秒。
     */
    public Long getMinQueryTime() {
        return this.MinQueryTime;
    }

    /**
     * Set 慢查询阈值，单位：毫秒。
     * @param MinQueryTime 慢查询阈值，单位：毫秒。
     */
    public void setMinQueryTime(Long MinQueryTime) {
        this.MinQueryTime = MinQueryTime;
    }

    /**
     * Get 每页输出的任务列表大小，默认为 20，最多输出100条。 
     * @return Limit 每页输出的任务列表大小，默认为 20，最多输出100条。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页输出的任务列表大小，默认为 20，最多输出100条。
     * @param Limit 每页输出的任务列表大小，默认为 20，最多输出100条。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量，取Limit整数倍，计算公式：offset=limit*(页码-1)。 
     * @return Offset 分页偏移量，取Limit整数倍，计算公式：offset=limit*(页码-1)。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，取Limit整数倍，计算公式：offset=limit*(页码-1)。
     * @param Offset 分页偏移量，取Limit整数倍，计算公式：offset=limit*(页码-1)。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeProxySlowLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProxySlowLogRequest(DescribeProxySlowLogRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MinQueryTime != null) {
            this.MinQueryTime = new Long(source.MinQueryTime);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MinQueryTime", this.MinQueryTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

