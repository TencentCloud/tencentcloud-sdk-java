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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeJobLogRequest extends AbstractModel {

    /**
    * <p>作业 ID（必填）。</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>日志类型（必填）。可选值：SPARK_SQL_OPERATION / SPARK_BATCH_OPERATION / SPARK_LAUNCH / SPARK_DRIVER_STDOUT / SPARK_DRIVER_LOG4J / SPARK_EXECUTOR_STDOUT / SPARK_EXECUTOR_LOG4J。</p>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>Statement 序号（1-based，仅 LogType=SPARK_SQL_OPERATION 时可传），定位多语句作业中的具体语句。</p>
    */
    @SerializedName("StatementIndex")
    @Expose
    private Long StatementIndex;

    /**
    * <p>分页游标（首页不传，后续页原样透传上一响应的 Cursor；不透明，无需解析）。无法续读时以 HasMore=false 终止分页。</p>
    */
    @SerializedName("Cursor")
    @Expose
    private String Cursor;

    /**
    * <p>返回上限（行数），范围 [1, 1000]。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>关键词过滤。</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>Pod 名称过滤。</p>
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * <p>日志级别过滤。取值：ERROR / WARN / INFO / DEBUG / TRACE，非法值拒绝。</p>
    */
    @SerializedName("LogLevel")
    @Expose
    private String LogLevel;

    /**
    * <p>起始时间，Unix 毫秒。</p>
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * <p>结束时间，Unix 毫秒。</p>
    */
    @SerializedName("To")
    @Expose
    private Long To;

    /**
     * Get <p>作业 ID（必填）。</p> 
     * @return JobId <p>作业 ID（必填）。</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>作业 ID（必填）。</p>
     * @param JobId <p>作业 ID（必填）。</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>日志类型（必填）。可选值：SPARK_SQL_OPERATION / SPARK_BATCH_OPERATION / SPARK_LAUNCH / SPARK_DRIVER_STDOUT / SPARK_DRIVER_LOG4J / SPARK_EXECUTOR_STDOUT / SPARK_EXECUTOR_LOG4J。</p> 
     * @return LogType <p>日志类型（必填）。可选值：SPARK_SQL_OPERATION / SPARK_BATCH_OPERATION / SPARK_LAUNCH / SPARK_DRIVER_STDOUT / SPARK_DRIVER_LOG4J / SPARK_EXECUTOR_STDOUT / SPARK_EXECUTOR_LOG4J。</p>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>日志类型（必填）。可选值：SPARK_SQL_OPERATION / SPARK_BATCH_OPERATION / SPARK_LAUNCH / SPARK_DRIVER_STDOUT / SPARK_DRIVER_LOG4J / SPARK_EXECUTOR_STDOUT / SPARK_EXECUTOR_LOG4J。</p>
     * @param LogType <p>日志类型（必填）。可选值：SPARK_SQL_OPERATION / SPARK_BATCH_OPERATION / SPARK_LAUNCH / SPARK_DRIVER_STDOUT / SPARK_DRIVER_LOG4J / SPARK_EXECUTOR_STDOUT / SPARK_EXECUTOR_LOG4J。</p>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>Statement 序号（1-based，仅 LogType=SPARK_SQL_OPERATION 时可传），定位多语句作业中的具体语句。</p> 
     * @return StatementIndex <p>Statement 序号（1-based，仅 LogType=SPARK_SQL_OPERATION 时可传），定位多语句作业中的具体语句。</p>
     */
    public Long getStatementIndex() {
        return this.StatementIndex;
    }

    /**
     * Set <p>Statement 序号（1-based，仅 LogType=SPARK_SQL_OPERATION 时可传），定位多语句作业中的具体语句。</p>
     * @param StatementIndex <p>Statement 序号（1-based，仅 LogType=SPARK_SQL_OPERATION 时可传），定位多语句作业中的具体语句。</p>
     */
    public void setStatementIndex(Long StatementIndex) {
        this.StatementIndex = StatementIndex;
    }

    /**
     * Get <p>分页游标（首页不传，后续页原样透传上一响应的 Cursor；不透明，无需解析）。无法续读时以 HasMore=false 终止分页。</p> 
     * @return Cursor <p>分页游标（首页不传，后续页原样透传上一响应的 Cursor；不透明，无需解析）。无法续读时以 HasMore=false 终止分页。</p>
     */
    public String getCursor() {
        return this.Cursor;
    }

    /**
     * Set <p>分页游标（首页不传，后续页原样透传上一响应的 Cursor；不透明，无需解析）。无法续读时以 HasMore=false 终止分页。</p>
     * @param Cursor <p>分页游标（首页不传，后续页原样透传上一响应的 Cursor；不透明，无需解析）。无法续读时以 HasMore=false 终止分页。</p>
     */
    public void setCursor(String Cursor) {
        this.Cursor = Cursor;
    }

    /**
     * Get <p>返回上限（行数），范围 [1, 1000]。</p> 
     * @return Limit <p>返回上限（行数），范围 [1, 1000]。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回上限（行数），范围 [1, 1000]。</p>
     * @param Limit <p>返回上限（行数），范围 [1, 1000]。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>关键词过滤。</p> 
     * @return Keyword <p>关键词过滤。</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>关键词过滤。</p>
     * @param Keyword <p>关键词过滤。</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>Pod 名称过滤。</p> 
     * @return PodName <p>Pod 名称过滤。</p>
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set <p>Pod 名称过滤。</p>
     * @param PodName <p>Pod 名称过滤。</p>
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get <p>日志级别过滤。取值：ERROR / WARN / INFO / DEBUG / TRACE，非法值拒绝。</p> 
     * @return LogLevel <p>日志级别过滤。取值：ERROR / WARN / INFO / DEBUG / TRACE，非法值拒绝。</p>
     */
    public String getLogLevel() {
        return this.LogLevel;
    }

    /**
     * Set <p>日志级别过滤。取值：ERROR / WARN / INFO / DEBUG / TRACE，非法值拒绝。</p>
     * @param LogLevel <p>日志级别过滤。取值：ERROR / WARN / INFO / DEBUG / TRACE，非法值拒绝。</p>
     */
    public void setLogLevel(String LogLevel) {
        this.LogLevel = LogLevel;
    }

    /**
     * Get <p>起始时间，Unix 毫秒。</p> 
     * @return From <p>起始时间，Unix 毫秒。</p>
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set <p>起始时间，Unix 毫秒。</p>
     * @param From <p>起始时间，Unix 毫秒。</p>
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get <p>结束时间，Unix 毫秒。</p> 
     * @return To <p>结束时间，Unix 毫秒。</p>
     */
    public Long getTo() {
        return this.To;
    }

    /**
     * Set <p>结束时间，Unix 毫秒。</p>
     * @param To <p>结束时间，Unix 毫秒。</p>
     */
    public void setTo(Long To) {
        this.To = To;
    }

    public DescribeJobLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeJobLogRequest(DescribeJobLogRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.StatementIndex != null) {
            this.StatementIndex = new Long(source.StatementIndex);
        }
        if (source.Cursor != null) {
            this.Cursor = new String(source.Cursor);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.LogLevel != null) {
            this.LogLevel = new String(source.LogLevel);
        }
        if (source.From != null) {
            this.From = new Long(source.From);
        }
        if (source.To != null) {
            this.To = new Long(source.To);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "StatementIndex", this.StatementIndex);
        this.setParamSimple(map, prefix + "Cursor", this.Cursor);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "LogLevel", this.LogLevel);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);

    }
}

