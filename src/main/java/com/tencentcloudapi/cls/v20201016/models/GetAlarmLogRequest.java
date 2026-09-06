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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetAlarmLogRequest extends AbstractModel {

    /**
    * <p>要查询的执行详情的起始时间，Unix时间戳，单位ms。</p>
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * <p>要查询的执行详情的结束时间，Unix时间戳，单位ms。</p>
    */
    @SerializedName("To")
    @Expose
    private Long To;

    /**
    * <p>查询过滤条件，例如：</p><ul><li>按告警策略ID查询：<code>alert_id:&quot;alarm-0745ec00-e605-xxxx-b50b-54afe61fc971&quot;</code><ul><li>通过<a href="https://cloud.tencent.com/document/api/614/56461">获取告警策略列表</a>获取告警策略ID</li></ul></li><li>按监控对象ID查询：<code>monitored_object:&quot;823d8bfa-76a7-xxxx-8399-8cda74d4009b&quot;</code><ul><li>通过<a href="https://cloud.tencent.com/document/api/614/56461">获取告警策略列表</a>获取监控对象ID</li></ul></li><li>按告警策略ID及监控对象ID查询：<code>alert_id:&quot;alarm-0745ec00-e605-xxxx-b50b-54afe61fc971&quot; AND monitored_object:&quot;823d8bfa-76a7-xxxx-8399-8cda74d4009b&quot;</code></li><li>按告警策略ID及监控对象ID查询支持SQL语句：<code>(alert_id:&quot;alarm-5ce45495-0918-4d58-xxxx-768134bf330c&quot;) AND (monitored_object:&quot;3c514e84-6f1f-46ec-xxxx-05de6163f7fe&quot;) AND NOT condition_evaluate_result: &quot;Skip&quot; AND condition_evaluate_result:[* TO *] | SELECT count(*) as top50StatisticsTotalCount, count_if(condition_evaluate_result=&#39;ProcessError&#39;) as top50StatisticsFailureCount, count_if(notification_send_result!=&#39;NotSend&#39;) as top50NoticeTotalCount, count_if(notification_send_result=&#39;SendPartFail&#39; or notification_send_result=&#39;SendFail&#39;) as top50NoticeFailureCount, alert_id, alert_name, monitored_object, topic_type, happen_threshold, alert_threshold, notify_template group by alert_id, alert_name, monitored_object,topic_type, happen_threshold, alert_threshold, notify_template order by top50StatisticsTotalCount desc limit 1</code></li></ul><p>该查询语句走Lucene语法（已废弃）</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p>查询过滤条件，例如：- 按告警策略ID查询：<code>alert_id:&quot;alarm-0745ec00-e605-xxxx-b50b-54afe61fc971&quot;</code>   - 通过<a href="https://cloud.tencent.com/document/api/614/56461">获取告警策略列表</a>获取告警策略ID- 按监控对象ID查询：<code>monitored_object:&quot;823d8bfa-76a7-xxxx-8399-8cda74d4009b&quot;</code>  - 通过<a href="https://cloud.tencent.com/document/api/614/56461">获取告警策略列表</a>获取监控对象ID- 按告警策略ID及监控对象ID查询：<code>alert_id:&quot;alarm-0745ec00-e605-xxxx-b50b-54afe61fc971&quot; AND monitored_object:&quot;823d8bfa-76a7-xxxx-8399-8cda74d4009b&quot;</code>- 按告警策略ID及监控对象ID查询支持SQL语句：<code>(alert_id:&quot;alarm-5ce45495-0918-4d58-xxxx-768134bf330c&quot;) AND (monitored_object:&quot;3c514e84-6f1f-46ec-xxxx-05de6163f7fe&quot;) AND NOT condition_evaluate_result: &quot;Skip&quot; AND condition_evaluate_result:[* TO *] | SELECT count(*) as top50StatisticsTotalCount, count_if(condition_evaluate_result=&#39;ProcessError&#39;) as top50StatisticsFailureCount, count_if(notification_send_result!=&#39;NotSend&#39;) as top50NoticeTotalCount, count_if(notification_send_result=&#39;SendPartFail&#39; or notification_send_result=&#39;SendFail&#39;) as top50NoticeFailureCount, alert_id, alert_name, monitored_object, topic_type, happen_threshold, alert_threshold, notify_template group by alert_id, alert_name, monitored_object,topic_type, happen_threshold, alert_threshold, notify_template order by top50StatisticsTotalCount desc limit 1</code></p><p>该查询语句走CQL语法</p>
    */
    @SerializedName("QueryString")
    @Expose
    private String QueryString;

    /**
    * <p>单次查询返回的执行详情条数，最大值为1000</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>透传上次接口返回的Context值，可获取后续更多日志，总计最多可获取1万条原始日志，过期时间1小时。<br>注意：</p><ul><li>透传该参数时，请勿修改除该参数外的其它参数</li><li>仅当检索分析语句(Query)不包含SQL时有效，SQL获取后续结果参考<a href="https://cloud.tencent.com/document/product/614/58977" target="_blank">SQL LIMIT语法</a></li></ul>
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * <p>原始日志是否按时间排序返回；可选值：asc(升序)、desc(降序)，默认为 desc<br>注意：</p><ul><li>仅当检索分析语句(Query)不包含SQL时有效</li><li>SQL结果排序方式参考<a href="https://cloud.tencent.com/document/product/614/58978" target="_blank">SQL ORDER BY语法</a></li></ul>
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * <p>true：代表使用新的检索结果返回方式，输出参数AnalysisRecords和Columns有效；<br>false：代表使用老的检索结果返回方式，输出AnalysisResults和ColNames有效；<br>两种返回方式在编码格式上有少量区别，建议使用true。</p>
    */
    @SerializedName("UseNewAnalysis")
    @Expose
    private Boolean UseNewAnalysis;

    /**
     * Get <p>要查询的执行详情的起始时间，Unix时间戳，单位ms。</p> 
     * @return From <p>要查询的执行详情的起始时间，Unix时间戳，单位ms。</p>
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set <p>要查询的执行详情的起始时间，Unix时间戳，单位ms。</p>
     * @param From <p>要查询的执行详情的起始时间，Unix时间戳，单位ms。</p>
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get <p>要查询的执行详情的结束时间，Unix时间戳，单位ms。</p> 
     * @return To <p>要查询的执行详情的结束时间，Unix时间戳，单位ms。</p>
     */
    public Long getTo() {
        return this.To;
    }

    /**
     * Set <p>要查询的执行详情的结束时间，Unix时间戳，单位ms。</p>
     * @param To <p>要查询的执行详情的结束时间，Unix时间戳，单位ms。</p>
     */
    public void setTo(Long To) {
        this.To = To;
    }

    /**
     * Get <p>查询过滤条件，例如：</p><ul><li>按告警策略ID查询：<code>alert_id:&quot;alarm-0745ec00-e605-xxxx-b50b-54afe61fc971&quot;</code><ul><li>通过<a href="https://cloud.tencent.com/document/api/614/56461">获取告警策略列表</a>获取告警策略ID</li></ul></li><li>按监控对象ID查询：<code>monitored_object:&quot;823d8bfa-76a7-xxxx-8399-8cda74d4009b&quot;</code><ul><li>通过<a href="https://cloud.tencent.com/document/api/614/56461">获取告警策略列表</a>获取监控对象ID</li></ul></li><li>按告警策略ID及监控对象ID查询：<code>alert_id:&quot;alarm-0745ec00-e605-xxxx-b50b-54afe61fc971&quot; AND monitored_object:&quot;823d8bfa-76a7-xxxx-8399-8cda74d4009b&quot;</code></li><li>按告警策略ID及监控对象ID查询支持SQL语句：<code>(alert_id:&quot;alarm-5ce45495-0918-4d58-xxxx-768134bf330c&quot;) AND (monitored_object:&quot;3c514e84-6f1f-46ec-xxxx-05de6163f7fe&quot;) AND NOT condition_evaluate_result: &quot;Skip&quot; AND condition_evaluate_result:[* TO *] | SELECT count(*) as top50StatisticsTotalCount, count_if(condition_evaluate_result=&#39;ProcessError&#39;) as top50StatisticsFailureCount, count_if(notification_send_result!=&#39;NotSend&#39;) as top50NoticeTotalCount, count_if(notification_send_result=&#39;SendPartFail&#39; or notification_send_result=&#39;SendFail&#39;) as top50NoticeFailureCount, alert_id, alert_name, monitored_object, topic_type, happen_threshold, alert_threshold, notify_template group by alert_id, alert_name, monitored_object,topic_type, happen_threshold, alert_threshold, notify_template order by top50StatisticsTotalCount desc limit 1</code></li></ul><p>该查询语句走Lucene语法（已废弃）</p> 
     * @return Query <p>查询过滤条件，例如：</p><ul><li>按告警策略ID查询：<code>alert_id:&quot;alarm-0745ec00-e605-xxxx-b50b-54afe61fc971&quot;</code><ul><li>通过<a href="https://cloud.tencent.com/document/api/614/56461">获取告警策略列表</a>获取告警策略ID</li></ul></li><li>按监控对象ID查询：<code>monitored_object:&quot;823d8bfa-76a7-xxxx-8399-8cda74d4009b&quot;</code><ul><li>通过<a href="https://cloud.tencent.com/document/api/614/56461">获取告警策略列表</a>获取监控对象ID</li></ul></li><li>按告警策略ID及监控对象ID查询：<code>alert_id:&quot;alarm-0745ec00-e605-xxxx-b50b-54afe61fc971&quot; AND monitored_object:&quot;823d8bfa-76a7-xxxx-8399-8cda74d4009b&quot;</code></li><li>按告警策略ID及监控对象ID查询支持SQL语句：<code>(alert_id:&quot;alarm-5ce45495-0918-4d58-xxxx-768134bf330c&quot;) AND (monitored_object:&quot;3c514e84-6f1f-46ec-xxxx-05de6163f7fe&quot;) AND NOT condition_evaluate_result: &quot;Skip&quot; AND condition_evaluate_result:[* TO *] | SELECT count(*) as top50StatisticsTotalCount, count_if(condition_evaluate_result=&#39;ProcessError&#39;) as top50StatisticsFailureCount, count_if(notification_send_result!=&#39;NotSend&#39;) as top50NoticeTotalCount, count_if(notification_send_result=&#39;SendPartFail&#39; or notification_send_result=&#39;SendFail&#39;) as top50NoticeFailureCount, alert_id, alert_name, monitored_object, topic_type, happen_threshold, alert_threshold, notify_template group by alert_id, alert_name, monitored_object,topic_type, happen_threshold, alert_threshold, notify_template order by top50StatisticsTotalCount desc limit 1</code></li></ul><p>该查询语句走Lucene语法（已废弃）</p>
     * @deprecated
     */
    @Deprecated
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>查询过滤条件，例如：</p><ul><li>按告警策略ID查询：<code>alert_id:&quot;alarm-0745ec00-e605-xxxx-b50b-54afe61fc971&quot;</code><ul><li>通过<a href="https://cloud.tencent.com/document/api/614/56461">获取告警策略列表</a>获取告警策略ID</li></ul></li><li>按监控对象ID查询：<code>monitored_object:&quot;823d8bfa-76a7-xxxx-8399-8cda74d4009b&quot;</code><ul><li>通过<a href="https://cloud.tencent.com/document/api/614/56461">获取告警策略列表</a>获取监控对象ID</li></ul></li><li>按告警策略ID及监控对象ID查询：<code>alert_id:&quot;alarm-0745ec00-e605-xxxx-b50b-54afe61fc971&quot; AND monitored_object:&quot;823d8bfa-76a7-xxxx-8399-8cda74d4009b&quot;</code></li><li>按告警策略ID及监控对象ID查询支持SQL语句：<code>(alert_id:&quot;alarm-5ce45495-0918-4d58-xxxx-768134bf330c&quot;) AND (monitored_object:&quot;3c514e84-6f1f-46ec-xxxx-05de6163f7fe&quot;) AND NOT condition_evaluate_result: &quot;Skip&quot; AND condition_evaluate_result:[* TO *] | SELECT count(*) as top50StatisticsTotalCount, count_if(condition_evaluate_result=&#39;ProcessError&#39;) as top50StatisticsFailureCount, count_if(notification_send_result!=&#39;NotSend&#39;) as top50NoticeTotalCount, count_if(notification_send_result=&#39;SendPartFail&#39; or notification_send_result=&#39;SendFail&#39;) as top50NoticeFailureCount, alert_id, alert_name, monitored_object, topic_type, happen_threshold, alert_threshold, notify_template group by alert_id, alert_name, monitored_object,topic_type, happen_threshold, alert_threshold, notify_template order by top50StatisticsTotalCount desc limit 1</code></li></ul><p>该查询语句走Lucene语法（已废弃）</p>
     * @param Query <p>查询过滤条件，例如：</p><ul><li>按告警策略ID查询：<code>alert_id:&quot;alarm-0745ec00-e605-xxxx-b50b-54afe61fc971&quot;</code><ul><li>通过<a href="https://cloud.tencent.com/document/api/614/56461">获取告警策略列表</a>获取告警策略ID</li></ul></li><li>按监控对象ID查询：<code>monitored_object:&quot;823d8bfa-76a7-xxxx-8399-8cda74d4009b&quot;</code><ul><li>通过<a href="https://cloud.tencent.com/document/api/614/56461">获取告警策略列表</a>获取监控对象ID</li></ul></li><li>按告警策略ID及监控对象ID查询：<code>alert_id:&quot;alarm-0745ec00-e605-xxxx-b50b-54afe61fc971&quot; AND monitored_object:&quot;823d8bfa-76a7-xxxx-8399-8cda74d4009b&quot;</code></li><li>按告警策略ID及监控对象ID查询支持SQL语句：<code>(alert_id:&quot;alarm-5ce45495-0918-4d58-xxxx-768134bf330c&quot;) AND (monitored_object:&quot;3c514e84-6f1f-46ec-xxxx-05de6163f7fe&quot;) AND NOT condition_evaluate_result: &quot;Skip&quot; AND condition_evaluate_result:[* TO *] | SELECT count(*) as top50StatisticsTotalCount, count_if(condition_evaluate_result=&#39;ProcessError&#39;) as top50StatisticsFailureCount, count_if(notification_send_result!=&#39;NotSend&#39;) as top50NoticeTotalCount, count_if(notification_send_result=&#39;SendPartFail&#39; or notification_send_result=&#39;SendFail&#39;) as top50NoticeFailureCount, alert_id, alert_name, monitored_object, topic_type, happen_threshold, alert_threshold, notify_template group by alert_id, alert_name, monitored_object,topic_type, happen_threshold, alert_threshold, notify_template order by top50StatisticsTotalCount desc limit 1</code></li></ul><p>该查询语句走Lucene语法（已废弃）</p>
     * @deprecated
     */
    @Deprecated
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p>查询过滤条件，例如：- 按告警策略ID查询：<code>alert_id:&quot;alarm-0745ec00-e605-xxxx-b50b-54afe61fc971&quot;</code>   - 通过<a href="https://cloud.tencent.com/document/api/614/56461">获取告警策略列表</a>获取告警策略ID- 按监控对象ID查询：<code>monitored_object:&quot;823d8bfa-76a7-xxxx-8399-8cda74d4009b&quot;</code>  - 通过<a href="https://cloud.tencent.com/document/api/614/56461">获取告警策略列表</a>获取监控对象ID- 按告警策略ID及监控对象ID查询：<code>alert_id:&quot;alarm-0745ec00-e605-xxxx-b50b-54afe61fc971&quot; AND monitored_object:&quot;823d8bfa-76a7-xxxx-8399-8cda74d4009b&quot;</code>- 按告警策略ID及监控对象ID查询支持SQL语句：<code>(alert_id:&quot;alarm-5ce45495-0918-4d58-xxxx-768134bf330c&quot;) AND (monitored_object:&quot;3c514e84-6f1f-46ec-xxxx-05de6163f7fe&quot;) AND NOT condition_evaluate_result: &quot;Skip&quot; AND condition_evaluate_result:[* TO *] | SELECT count(*) as top50StatisticsTotalCount, count_if(condition_evaluate_result=&#39;ProcessError&#39;) as top50StatisticsFailureCount, count_if(notification_send_result!=&#39;NotSend&#39;) as top50NoticeTotalCount, count_if(notification_send_result=&#39;SendPartFail&#39; or notification_send_result=&#39;SendFail&#39;) as top50NoticeFailureCount, alert_id, alert_name, monitored_object, topic_type, happen_threshold, alert_threshold, notify_template group by alert_id, alert_name, monitored_object,topic_type, happen_threshold, alert_threshold, notify_template order by top50StatisticsTotalCount desc limit 1</code></p><p>该查询语句走CQL语法</p> 
     * @return QueryString <p>查询过滤条件，例如：- 按告警策略ID查询：<code>alert_id:&quot;alarm-0745ec00-e605-xxxx-b50b-54afe61fc971&quot;</code>   - 通过<a href="https://cloud.tencent.com/document/api/614/56461">获取告警策略列表</a>获取告警策略ID- 按监控对象ID查询：<code>monitored_object:&quot;823d8bfa-76a7-xxxx-8399-8cda74d4009b&quot;</code>  - 通过<a href="https://cloud.tencent.com/document/api/614/56461">获取告警策略列表</a>获取监控对象ID- 按告警策略ID及监控对象ID查询：<code>alert_id:&quot;alarm-0745ec00-e605-xxxx-b50b-54afe61fc971&quot; AND monitored_object:&quot;823d8bfa-76a7-xxxx-8399-8cda74d4009b&quot;</code>- 按告警策略ID及监控对象ID查询支持SQL语句：<code>(alert_id:&quot;alarm-5ce45495-0918-4d58-xxxx-768134bf330c&quot;) AND (monitored_object:&quot;3c514e84-6f1f-46ec-xxxx-05de6163f7fe&quot;) AND NOT condition_evaluate_result: &quot;Skip&quot; AND condition_evaluate_result:[* TO *] | SELECT count(*) as top50StatisticsTotalCount, count_if(condition_evaluate_result=&#39;ProcessError&#39;) as top50StatisticsFailureCount, count_if(notification_send_result!=&#39;NotSend&#39;) as top50NoticeTotalCount, count_if(notification_send_result=&#39;SendPartFail&#39; or notification_send_result=&#39;SendFail&#39;) as top50NoticeFailureCount, alert_id, alert_name, monitored_object, topic_type, happen_threshold, alert_threshold, notify_template group by alert_id, alert_name, monitored_object,topic_type, happen_threshold, alert_threshold, notify_template order by top50StatisticsTotalCount desc limit 1</code></p><p>该查询语句走CQL语法</p>
     */
    public String getQueryString() {
        return this.QueryString;
    }

    /**
     * Set <p>查询过滤条件，例如：- 按告警策略ID查询：<code>alert_id:&quot;alarm-0745ec00-e605-xxxx-b50b-54afe61fc971&quot;</code>   - 通过<a href="https://cloud.tencent.com/document/api/614/56461">获取告警策略列表</a>获取告警策略ID- 按监控对象ID查询：<code>monitored_object:&quot;823d8bfa-76a7-xxxx-8399-8cda74d4009b&quot;</code>  - 通过<a href="https://cloud.tencent.com/document/api/614/56461">获取告警策略列表</a>获取监控对象ID- 按告警策略ID及监控对象ID查询：<code>alert_id:&quot;alarm-0745ec00-e605-xxxx-b50b-54afe61fc971&quot; AND monitored_object:&quot;823d8bfa-76a7-xxxx-8399-8cda74d4009b&quot;</code>- 按告警策略ID及监控对象ID查询支持SQL语句：<code>(alert_id:&quot;alarm-5ce45495-0918-4d58-xxxx-768134bf330c&quot;) AND (monitored_object:&quot;3c514e84-6f1f-46ec-xxxx-05de6163f7fe&quot;) AND NOT condition_evaluate_result: &quot;Skip&quot; AND condition_evaluate_result:[* TO *] | SELECT count(*) as top50StatisticsTotalCount, count_if(condition_evaluate_result=&#39;ProcessError&#39;) as top50StatisticsFailureCount, count_if(notification_send_result!=&#39;NotSend&#39;) as top50NoticeTotalCount, count_if(notification_send_result=&#39;SendPartFail&#39; or notification_send_result=&#39;SendFail&#39;) as top50NoticeFailureCount, alert_id, alert_name, monitored_object, topic_type, happen_threshold, alert_threshold, notify_template group by alert_id, alert_name, monitored_object,topic_type, happen_threshold, alert_threshold, notify_template order by top50StatisticsTotalCount desc limit 1</code></p><p>该查询语句走CQL语法</p>
     * @param QueryString <p>查询过滤条件，例如：- 按告警策略ID查询：<code>alert_id:&quot;alarm-0745ec00-e605-xxxx-b50b-54afe61fc971&quot;</code>   - 通过<a href="https://cloud.tencent.com/document/api/614/56461">获取告警策略列表</a>获取告警策略ID- 按监控对象ID查询：<code>monitored_object:&quot;823d8bfa-76a7-xxxx-8399-8cda74d4009b&quot;</code>  - 通过<a href="https://cloud.tencent.com/document/api/614/56461">获取告警策略列表</a>获取监控对象ID- 按告警策略ID及监控对象ID查询：<code>alert_id:&quot;alarm-0745ec00-e605-xxxx-b50b-54afe61fc971&quot; AND monitored_object:&quot;823d8bfa-76a7-xxxx-8399-8cda74d4009b&quot;</code>- 按告警策略ID及监控对象ID查询支持SQL语句：<code>(alert_id:&quot;alarm-5ce45495-0918-4d58-xxxx-768134bf330c&quot;) AND (monitored_object:&quot;3c514e84-6f1f-46ec-xxxx-05de6163f7fe&quot;) AND NOT condition_evaluate_result: &quot;Skip&quot; AND condition_evaluate_result:[* TO *] | SELECT count(*) as top50StatisticsTotalCount, count_if(condition_evaluate_result=&#39;ProcessError&#39;) as top50StatisticsFailureCount, count_if(notification_send_result!=&#39;NotSend&#39;) as top50NoticeTotalCount, count_if(notification_send_result=&#39;SendPartFail&#39; or notification_send_result=&#39;SendFail&#39;) as top50NoticeFailureCount, alert_id, alert_name, monitored_object, topic_type, happen_threshold, alert_threshold, notify_template group by alert_id, alert_name, monitored_object,topic_type, happen_threshold, alert_threshold, notify_template order by top50StatisticsTotalCount desc limit 1</code></p><p>该查询语句走CQL语法</p>
     */
    public void setQueryString(String QueryString) {
        this.QueryString = QueryString;
    }

    /**
     * Get <p>单次查询返回的执行详情条数，最大值为1000</p> 
     * @return Limit <p>单次查询返回的执行详情条数，最大值为1000</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>单次查询返回的执行详情条数，最大值为1000</p>
     * @param Limit <p>单次查询返回的执行详情条数，最大值为1000</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>透传上次接口返回的Context值，可获取后续更多日志，总计最多可获取1万条原始日志，过期时间1小时。<br>注意：</p><ul><li>透传该参数时，请勿修改除该参数外的其它参数</li><li>仅当检索分析语句(Query)不包含SQL时有效，SQL获取后续结果参考<a href="https://cloud.tencent.com/document/product/614/58977" target="_blank">SQL LIMIT语法</a></li></ul> 
     * @return Context <p>透传上次接口返回的Context值，可获取后续更多日志，总计最多可获取1万条原始日志，过期时间1小时。<br>注意：</p><ul><li>透传该参数时，请勿修改除该参数外的其它参数</li><li>仅当检索分析语句(Query)不包含SQL时有效，SQL获取后续结果参考<a href="https://cloud.tencent.com/document/product/614/58977" target="_blank">SQL LIMIT语法</a></li></ul>
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set <p>透传上次接口返回的Context值，可获取后续更多日志，总计最多可获取1万条原始日志，过期时间1小时。<br>注意：</p><ul><li>透传该参数时，请勿修改除该参数外的其它参数</li><li>仅当检索分析语句(Query)不包含SQL时有效，SQL获取后续结果参考<a href="https://cloud.tencent.com/document/product/614/58977" target="_blank">SQL LIMIT语法</a></li></ul>
     * @param Context <p>透传上次接口返回的Context值，可获取后续更多日志，总计最多可获取1万条原始日志，过期时间1小时。<br>注意：</p><ul><li>透传该参数时，请勿修改除该参数外的其它参数</li><li>仅当检索分析语句(Query)不包含SQL时有效，SQL获取后续结果参考<a href="https://cloud.tencent.com/document/product/614/58977" target="_blank">SQL LIMIT语法</a></li></ul>
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get <p>原始日志是否按时间排序返回；可选值：asc(升序)、desc(降序)，默认为 desc<br>注意：</p><ul><li>仅当检索分析语句(Query)不包含SQL时有效</li><li>SQL结果排序方式参考<a href="https://cloud.tencent.com/document/product/614/58978" target="_blank">SQL ORDER BY语法</a></li></ul> 
     * @return Sort <p>原始日志是否按时间排序返回；可选值：asc(升序)、desc(降序)，默认为 desc<br>注意：</p><ul><li>仅当检索分析语句(Query)不包含SQL时有效</li><li>SQL结果排序方式参考<a href="https://cloud.tencent.com/document/product/614/58978" target="_blank">SQL ORDER BY语法</a></li></ul>
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set <p>原始日志是否按时间排序返回；可选值：asc(升序)、desc(降序)，默认为 desc<br>注意：</p><ul><li>仅当检索分析语句(Query)不包含SQL时有效</li><li>SQL结果排序方式参考<a href="https://cloud.tencent.com/document/product/614/58978" target="_blank">SQL ORDER BY语法</a></li></ul>
     * @param Sort <p>原始日志是否按时间排序返回；可选值：asc(升序)、desc(降序)，默认为 desc<br>注意：</p><ul><li>仅当检索分析语句(Query)不包含SQL时有效</li><li>SQL结果排序方式参考<a href="https://cloud.tencent.com/document/product/614/58978" target="_blank">SQL ORDER BY语法</a></li></ul>
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get <p>true：代表使用新的检索结果返回方式，输出参数AnalysisRecords和Columns有效；<br>false：代表使用老的检索结果返回方式，输出AnalysisResults和ColNames有效；<br>两种返回方式在编码格式上有少量区别，建议使用true。</p> 
     * @return UseNewAnalysis <p>true：代表使用新的检索结果返回方式，输出参数AnalysisRecords和Columns有效；<br>false：代表使用老的检索结果返回方式，输出AnalysisResults和ColNames有效；<br>两种返回方式在编码格式上有少量区别，建议使用true。</p>
     */
    public Boolean getUseNewAnalysis() {
        return this.UseNewAnalysis;
    }

    /**
     * Set <p>true：代表使用新的检索结果返回方式，输出参数AnalysisRecords和Columns有效；<br>false：代表使用老的检索结果返回方式，输出AnalysisResults和ColNames有效；<br>两种返回方式在编码格式上有少量区别，建议使用true。</p>
     * @param UseNewAnalysis <p>true：代表使用新的检索结果返回方式，输出参数AnalysisRecords和Columns有效；<br>false：代表使用老的检索结果返回方式，输出AnalysisResults和ColNames有效；<br>两种返回方式在编码格式上有少量区别，建议使用true。</p>
     */
    public void setUseNewAnalysis(Boolean UseNewAnalysis) {
        this.UseNewAnalysis = UseNewAnalysis;
    }

    public GetAlarmLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAlarmLogRequest(GetAlarmLogRequest source) {
        if (source.From != null) {
            this.From = new Long(source.From);
        }
        if (source.To != null) {
            this.To = new Long(source.To);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.QueryString != null) {
            this.QueryString = new String(source.QueryString);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.UseNewAnalysis != null) {
            this.UseNewAnalysis = new Boolean(source.UseNewAnalysis);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "QueryString", this.QueryString);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "UseNewAnalysis", this.UseNewAnalysis);

    }
}

