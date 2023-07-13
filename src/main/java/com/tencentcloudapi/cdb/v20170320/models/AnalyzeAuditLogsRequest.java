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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnalyzeAuditLogsRequest extends AbstractModel{

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 要分析的日志开始时间，格式为："2023-02-16 00:00:20"。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 要分析的日志结束时间，格式为："2023-02-16 00:10:20"。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 聚合维度的排序条件。
    */
    @SerializedName("AggregationConditions")
    @Expose
    private AggregationCondition [] AggregationConditions;

    /**
    * 已废弃。该过滤条件下的审计日志结果集作为分析日志。
    */
    @SerializedName("AuditLogFilter")
    @Expose
    private AuditLogFilter AuditLogFilter;

    /**
    * 该过滤条件下的审计日志结果集作为分析日志。
    */
    @SerializedName("LogFilter")
    @Expose
    private InstanceAuditLogFilters [] LogFilter;

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 要分析的日志开始时间，格式为："2023-02-16 00:00:20"。 
     * @return StartTime 要分析的日志开始时间，格式为："2023-02-16 00:00:20"。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 要分析的日志开始时间，格式为："2023-02-16 00:00:20"。
     * @param StartTime 要分析的日志开始时间，格式为："2023-02-16 00:00:20"。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 要分析的日志结束时间，格式为："2023-02-16 00:10:20"。 
     * @return EndTime 要分析的日志结束时间，格式为："2023-02-16 00:10:20"。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 要分析的日志结束时间，格式为："2023-02-16 00:10:20"。
     * @param EndTime 要分析的日志结束时间，格式为："2023-02-16 00:10:20"。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 聚合维度的排序条件。 
     * @return AggregationConditions 聚合维度的排序条件。
     */
    public AggregationCondition [] getAggregationConditions() {
        return this.AggregationConditions;
    }

    /**
     * Set 聚合维度的排序条件。
     * @param AggregationConditions 聚合维度的排序条件。
     */
    public void setAggregationConditions(AggregationCondition [] AggregationConditions) {
        this.AggregationConditions = AggregationConditions;
    }

    /**
     * Get 已废弃。该过滤条件下的审计日志结果集作为分析日志。 
     * @return AuditLogFilter 已废弃。该过滤条件下的审计日志结果集作为分析日志。
     */
    public AuditLogFilter getAuditLogFilter() {
        return this.AuditLogFilter;
    }

    /**
     * Set 已废弃。该过滤条件下的审计日志结果集作为分析日志。
     * @param AuditLogFilter 已废弃。该过滤条件下的审计日志结果集作为分析日志。
     */
    public void setAuditLogFilter(AuditLogFilter AuditLogFilter) {
        this.AuditLogFilter = AuditLogFilter;
    }

    /**
     * Get 该过滤条件下的审计日志结果集作为分析日志。 
     * @return LogFilter 该过滤条件下的审计日志结果集作为分析日志。
     */
    public InstanceAuditLogFilters [] getLogFilter() {
        return this.LogFilter;
    }

    /**
     * Set 该过滤条件下的审计日志结果集作为分析日志。
     * @param LogFilter 该过滤条件下的审计日志结果集作为分析日志。
     */
    public void setLogFilter(InstanceAuditLogFilters [] LogFilter) {
        this.LogFilter = LogFilter;
    }

    public AnalyzeAuditLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnalyzeAuditLogsRequest(AnalyzeAuditLogsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.AggregationConditions != null) {
            this.AggregationConditions = new AggregationCondition[source.AggregationConditions.length];
            for (int i = 0; i < source.AggregationConditions.length; i++) {
                this.AggregationConditions[i] = new AggregationCondition(source.AggregationConditions[i]);
            }
        }
        if (source.AuditLogFilter != null) {
            this.AuditLogFilter = new AuditLogFilter(source.AuditLogFilter);
        }
        if (source.LogFilter != null) {
            this.LogFilter = new InstanceAuditLogFilters[source.LogFilter.length];
            for (int i = 0; i < source.LogFilter.length; i++) {
                this.LogFilter[i] = new InstanceAuditLogFilters(source.LogFilter[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "AggregationConditions.", this.AggregationConditions);
        this.setParamObj(map, prefix + "AuditLogFilter.", this.AuditLogFilter);
        this.setParamArrayObj(map, prefix + "LogFilter.", this.LogFilter);

    }
}

