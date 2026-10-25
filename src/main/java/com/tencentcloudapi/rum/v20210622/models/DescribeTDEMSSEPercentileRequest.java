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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTDEMSSEPercentileRequest extends AbstractModel {

    /**
    * <p>应用 ID。这里是业务应用标识，不是腾讯云账号 AppId。</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>开始时间，Unix 毫秒。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>结束时间，Unix 毫秒。须通过现有时间范围校验。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>指标。只允许 token_throughput、first_message_delay、fluency。error_rate 与 stall_rate 返回 InvalidParameter。</p>
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * <p>筛选条件 JSON 字符串，格式为 [{Key,Op,Values}]。Op 只允许 in。Key 只允许 model_version、app_version、platform、os、region、is_error、is_stall、network_type、server_ip、isp、user_id。is_error 与 is_stall 的值只允许 true 或 false。</p>
    */
    @SerializedName("Filters")
    @Expose
    private String Filters;

    /**
     * Get <p>应用 ID。这里是业务应用标识，不是腾讯云账号 AppId。</p> 
     * @return AppId <p>应用 ID。这里是业务应用标识，不是腾讯云账号 AppId。</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用 ID。这里是业务应用标识，不是腾讯云账号 AppId。</p>
     * @param AppId <p>应用 ID。这里是业务应用标识，不是腾讯云账号 AppId。</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>开始时间，Unix 毫秒。</p> 
     * @return StartTime <p>开始时间，Unix 毫秒。</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间，Unix 毫秒。</p>
     * @param StartTime <p>开始时间，Unix 毫秒。</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间，Unix 毫秒。须通过现有时间范围校验。</p> 
     * @return EndTime <p>结束时间，Unix 毫秒。须通过现有时间范围校验。</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间，Unix 毫秒。须通过现有时间范围校验。</p>
     * @param EndTime <p>结束时间，Unix 毫秒。须通过现有时间范围校验。</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>指标。只允许 token_throughput、first_message_delay、fluency。error_rate 与 stall_rate 返回 InvalidParameter。</p> 
     * @return Metric <p>指标。只允许 token_throughput、first_message_delay、fluency。error_rate 与 stall_rate 返回 InvalidParameter。</p>
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set <p>指标。只允许 token_throughput、first_message_delay、fluency。error_rate 与 stall_rate 返回 InvalidParameter。</p>
     * @param Metric <p>指标。只允许 token_throughput、first_message_delay、fluency。error_rate 与 stall_rate 返回 InvalidParameter。</p>
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get <p>筛选条件 JSON 字符串，格式为 [{Key,Op,Values}]。Op 只允许 in。Key 只允许 model_version、app_version、platform、os、region、is_error、is_stall、network_type、server_ip、isp、user_id。is_error 与 is_stall 的值只允许 true 或 false。</p> 
     * @return Filters <p>筛选条件 JSON 字符串，格式为 [{Key,Op,Values}]。Op 只允许 in。Key 只允许 model_version、app_version、platform、os、region、is_error、is_stall、network_type、server_ip、isp、user_id。is_error 与 is_stall 的值只允许 true 或 false。</p>
     */
    public String getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>筛选条件 JSON 字符串，格式为 [{Key,Op,Values}]。Op 只允许 in。Key 只允许 model_version、app_version、platform、os、region、is_error、is_stall、network_type、server_ip、isp、user_id。is_error 与 is_stall 的值只允许 true 或 false。</p>
     * @param Filters <p>筛选条件 JSON 字符串，格式为 [{Key,Op,Values}]。Op 只允许 in。Key 只允许 model_version、app_version、platform、os、region、is_error、is_stall、network_type、server_ip、isp、user_id。is_error 与 is_stall 的值只允许 true 或 false。</p>
     */
    public void setFilters(String Filters) {
        this.Filters = Filters;
    }

    public DescribeTDEMSSEPercentileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTDEMSSEPercentileRequest(DescribeTDEMSSEPercentileRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
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
        if (source.Filters != null) {
            this.Filters = new String(source.Filters);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Filters", this.Filters);

    }
}

