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

public class DescribeTDEMSSETrendRequest extends AbstractModel {

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
    * <p>指标。取值说明：token_throughput（token 吞吐率，token/秒）、first_message_delay（首次消息时延，毫秒）、error_rate（错误率，已乘 100 的百分比）、stall_rate（卡死率，已乘 100 的百分比）、fluency（流畅度，已乘 100 的百分比）。</p>
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * <p>趋势维度。取值说明：overall、model_version、network_type、server_ip、isp。overall 返回 Points，其他维度返回 Series。</p>
    */
    @SerializedName("Dimension")
    @Expose
    private String Dimension;

    /**
    * <p>筛选条件 JSON 字符串，格式为 [{Key,Op,Values}]。Op 只允许 in。Key 只允许 model_version、app_version、platform、os、region、is_error、is_stall、network_type、server_ip、isp、user_id。is_error 与 is_stall 的值只允许 true 或 false。</p>
    */
    @SerializedName("Filters")
    @Expose
    private String Filters;

    /**
    * <p>头部维度数量，只允许 7、10、20。Dimension 为 overall 时忽略。</p>
    */
    @SerializedName("TopN")
    @Expose
    private Long TopN;

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
     * Get <p>指标。取值说明：token_throughput（token 吞吐率，token/秒）、first_message_delay（首次消息时延，毫秒）、error_rate（错误率，已乘 100 的百分比）、stall_rate（卡死率，已乘 100 的百分比）、fluency（流畅度，已乘 100 的百分比）。</p> 
     * @return Metric <p>指标。取值说明：token_throughput（token 吞吐率，token/秒）、first_message_delay（首次消息时延，毫秒）、error_rate（错误率，已乘 100 的百分比）、stall_rate（卡死率，已乘 100 的百分比）、fluency（流畅度，已乘 100 的百分比）。</p>
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set <p>指标。取值说明：token_throughput（token 吞吐率，token/秒）、first_message_delay（首次消息时延，毫秒）、error_rate（错误率，已乘 100 的百分比）、stall_rate（卡死率，已乘 100 的百分比）、fluency（流畅度，已乘 100 的百分比）。</p>
     * @param Metric <p>指标。取值说明：token_throughput（token 吞吐率，token/秒）、first_message_delay（首次消息时延，毫秒）、error_rate（错误率，已乘 100 的百分比）、stall_rate（卡死率，已乘 100 的百分比）、fluency（流畅度，已乘 100 的百分比）。</p>
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get <p>趋势维度。取值说明：overall、model_version、network_type、server_ip、isp。overall 返回 Points，其他维度返回 Series。</p> 
     * @return Dimension <p>趋势维度。取值说明：overall、model_version、network_type、server_ip、isp。overall 返回 Points，其他维度返回 Series。</p>
     */
    public String getDimension() {
        return this.Dimension;
    }

    /**
     * Set <p>趋势维度。取值说明：overall、model_version、network_type、server_ip、isp。overall 返回 Points，其他维度返回 Series。</p>
     * @param Dimension <p>趋势维度。取值说明：overall、model_version、network_type、server_ip、isp。overall 返回 Points，其他维度返回 Series。</p>
     */
    public void setDimension(String Dimension) {
        this.Dimension = Dimension;
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

    /**
     * Get <p>头部维度数量，只允许 7、10、20。Dimension 为 overall 时忽略。</p> 
     * @return TopN <p>头部维度数量，只允许 7、10、20。Dimension 为 overall 时忽略。</p>
     */
    public Long getTopN() {
        return this.TopN;
    }

    /**
     * Set <p>头部维度数量，只允许 7、10、20。Dimension 为 overall 时忽略。</p>
     * @param TopN <p>头部维度数量，只允许 7、10、20。Dimension 为 overall 时忽略。</p>
     */
    public void setTopN(Long TopN) {
        this.TopN = TopN;
    }

    public DescribeTDEMSSETrendRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTDEMSSETrendRequest(DescribeTDEMSSETrendRequest source) {
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
        if (source.Dimension != null) {
            this.Dimension = new String(source.Dimension);
        }
        if (source.Filters != null) {
            this.Filters = new String(source.Filters);
        }
        if (source.TopN != null) {
            this.TopN = new Long(source.TopN);
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
        this.setParamSimple(map, prefix + "Dimension", this.Dimension);
        this.setParamSimple(map, prefix + "Filters", this.Filters);
        this.setParamSimple(map, prefix + "TopN", this.TopN);

    }
}

