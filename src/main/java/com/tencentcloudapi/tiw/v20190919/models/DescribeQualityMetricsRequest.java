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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeQualityMetricsRequest extends AbstractModel{

    /**
    * 白板应用的SdkAppId
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 开始时间，Unix时间戳，单位秒，时间跨度不能超过7天
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间，Unix时间戳，单位秒，时间跨度不能超过7天
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 查询的指标，目前支持以下值
  - image_load_total_count: 图片加载总数（单位，次）
  - image_load_fail_count: 图片加载失败数量（单位，次）
  - image_load_success_rate: 图片加载成功率（百分比）
  - ppt_load_total_count: PPT加载总数（单位，次）
  - ppt_load_fail_count: PPT加载失败总数（单位，次）
  - ppt_load_success_rate: PPT加载成功率（单位，百分比）
  - verify_sdk_total_count: 白板鉴权总次数（单位，次）
  - verify_sdk_fail_count: 白板鉴权失败次数（单位，次）
  - verify_sdk_success_rate: 白板鉴权成功率（单位，百分比）
  - verify_sdk_in_one_second_rate: 白板鉴权秒开率（单位，百分比）
  - verify_sdk_cost_avg: 白板鉴权耗时平均时间（单位，毫秒）
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 聚合的时间维度，目前只支持1小时，输入值为"1h"
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
     * Get 白板应用的SdkAppId 
     * @return SdkAppId 白板应用的SdkAppId
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 白板应用的SdkAppId
     * @param SdkAppId 白板应用的SdkAppId
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 开始时间，Unix时间戳，单位秒，时间跨度不能超过7天 
     * @return StartTime 开始时间，Unix时间戳，单位秒，时间跨度不能超过7天
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，Unix时间戳，单位秒，时间跨度不能超过7天
     * @param StartTime 开始时间，Unix时间戳，单位秒，时间跨度不能超过7天
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，Unix时间戳，单位秒，时间跨度不能超过7天 
     * @return EndTime 结束时间，Unix时间戳，单位秒，时间跨度不能超过7天
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，Unix时间戳，单位秒，时间跨度不能超过7天
     * @param EndTime 结束时间，Unix时间戳，单位秒，时间跨度不能超过7天
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 查询的指标，目前支持以下值
  - image_load_total_count: 图片加载总数（单位，次）
  - image_load_fail_count: 图片加载失败数量（单位，次）
  - image_load_success_rate: 图片加载成功率（百分比）
  - ppt_load_total_count: PPT加载总数（单位，次）
  - ppt_load_fail_count: PPT加载失败总数（单位，次）
  - ppt_load_success_rate: PPT加载成功率（单位，百分比）
  - verify_sdk_total_count: 白板鉴权总次数（单位，次）
  - verify_sdk_fail_count: 白板鉴权失败次数（单位，次）
  - verify_sdk_success_rate: 白板鉴权成功率（单位，百分比）
  - verify_sdk_in_one_second_rate: 白板鉴权秒开率（单位，百分比）
  - verify_sdk_cost_avg: 白板鉴权耗时平均时间（单位，毫秒） 
     * @return Metric 查询的指标，目前支持以下值
  - image_load_total_count: 图片加载总数（单位，次）
  - image_load_fail_count: 图片加载失败数量（单位，次）
  - image_load_success_rate: 图片加载成功率（百分比）
  - ppt_load_total_count: PPT加载总数（单位，次）
  - ppt_load_fail_count: PPT加载失败总数（单位，次）
  - ppt_load_success_rate: PPT加载成功率（单位，百分比）
  - verify_sdk_total_count: 白板鉴权总次数（单位，次）
  - verify_sdk_fail_count: 白板鉴权失败次数（单位，次）
  - verify_sdk_success_rate: 白板鉴权成功率（单位，百分比）
  - verify_sdk_in_one_second_rate: 白板鉴权秒开率（单位，百分比）
  - verify_sdk_cost_avg: 白板鉴权耗时平均时间（单位，毫秒）
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 查询的指标，目前支持以下值
  - image_load_total_count: 图片加载总数（单位，次）
  - image_load_fail_count: 图片加载失败数量（单位，次）
  - image_load_success_rate: 图片加载成功率（百分比）
  - ppt_load_total_count: PPT加载总数（单位，次）
  - ppt_load_fail_count: PPT加载失败总数（单位，次）
  - ppt_load_success_rate: PPT加载成功率（单位，百分比）
  - verify_sdk_total_count: 白板鉴权总次数（单位，次）
  - verify_sdk_fail_count: 白板鉴权失败次数（单位，次）
  - verify_sdk_success_rate: 白板鉴权成功率（单位，百分比）
  - verify_sdk_in_one_second_rate: 白板鉴权秒开率（单位，百分比）
  - verify_sdk_cost_avg: 白板鉴权耗时平均时间（单位，毫秒）
     * @param Metric 查询的指标，目前支持以下值
  - image_load_total_count: 图片加载总数（单位，次）
  - image_load_fail_count: 图片加载失败数量（单位，次）
  - image_load_success_rate: 图片加载成功率（百分比）
  - ppt_load_total_count: PPT加载总数（单位，次）
  - ppt_load_fail_count: PPT加载失败总数（单位，次）
  - ppt_load_success_rate: PPT加载成功率（单位，百分比）
  - verify_sdk_total_count: 白板鉴权总次数（单位，次）
  - verify_sdk_fail_count: 白板鉴权失败次数（单位，次）
  - verify_sdk_success_rate: 白板鉴权成功率（单位，百分比）
  - verify_sdk_in_one_second_rate: 白板鉴权秒开率（单位，百分比）
  - verify_sdk_cost_avg: 白板鉴权耗时平均时间（单位，毫秒）
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 聚合的时间维度，目前只支持1小时，输入值为"1h" 
     * @return Interval 聚合的时间维度，目前只支持1小时，输入值为"1h"
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set 聚合的时间维度，目前只支持1小时，输入值为"1h"
     * @param Interval 聚合的时间维度，目前只支持1小时，输入值为"1h"
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    public DescribeQualityMetricsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeQualityMetricsRequest(DescribeQualityMetricsRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Interval", this.Interval);

    }
}

