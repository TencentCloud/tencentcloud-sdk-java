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

public class SearchLogRequest extends AbstractModel {

    /**
    * <p>要检索分析的日志的起始时间，<strong>Unix时间戳（毫秒）</strong></p>
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * <p>要检索分析的日志的结束时间，<strong>Unix时间戳（毫秒）</strong></p>
    */
    @SerializedName("To")
    @Expose
    private Long To;

    /**
    * <p>检索分析语句，最大长度为12KB<br>语句由 <a href="https://cloud.tencent.com/document/product/614/47044" target="_blank">[检索条件]</a> | <a href="https://cloud.tencent.com/document/product/614/44061" target="_blank">[SQL语句]</a>构成，无需对日志进行统计分析时，可省略其中的管道符<code> | </code>及SQL语句<br>使用*或空字符串可查询所有日志</p><p>默认值：空字符串</p>
    */
    @SerializedName("QueryString")
    @Expose
    private String QueryString;

    /**
    * <p>检索语法规则，默认值为1，推荐使用1 。</p><ul><li>0：Lucene语法</li><li>1：CQL语法（CLS Query Language，日志服务专用检索语法）</li></ul><p>详细说明参见<a href="https://cloud.tencent.com/document/product/614/47044#RetrievesConditionalRules" target="_blank">检索条件语法规则</a>。</p><p>默认值：1</p>
    */
    @SerializedName("QuerySyntax")
    @Expose
    private Long QuerySyntax;

    /**
    * <ul><li>要检索分析的日志主题ID，仅能指定一个日志主题。</li><li>如需同时检索多个日志主题，请使用Topics参数。</li><li>TopicId 和 Topics 不能同时使用，在一次请求中有且只能选择一个。</li></ul>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <ul><li>要检索分析的日志主题列表，最大支持50个日志主题。</li><li>检索单个日志主题时请使用TopicId。</li><li>TopicId 和 Topics 不能同时使用，在一次请求中有且只能选择一个。</li></ul>
    */
    @SerializedName("Topics")
    @Expose
    private MultiTopicSearchInformation [] Topics;

    /**
    * <p>原始日志是否按时间排序返回；可选值：asc(升序)、desc(降序)，默认为 desc<br>注意：</p><ul><li>仅当检索分析语句(Query)不包含SQL时有效</li><li>SQL结果排序方式参考<a href="https://cloud.tencent.com/document/product/614/58978" target="_blank">SQL ORDER BY语法</a></li></ul>
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * <p>表示单次查询返回的原始日志条数，默认为100，最大值为1000。<br>注意：</p><ul><li>仅当检索分析语句(Query)不包含SQL时有效</li><li>SQL结果条数指定方式参考<a href="https://cloud.tencent.com/document/product/614/58977" target="_blank">SQL LIMIT语法</a></li></ul><p>可通过两种方式获取后续更多日志：</p><ul><li>Context:透传上次接口返回的Context值，获取后续更多日志，总计最多可获取1万条原始日志</li><li>Offset:偏移量，表示从第几行开始返回原始日志，无日志条数限制</li></ul>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>查询原始日志的偏移量，表示从第几行开始返回原始日志，默认为0。<br>注意：</p><ul><li>仅当检索分析语句(Query)不包含SQL时有效</li><li>不能与Context参数同时使用</li><li>仅适用于单日志主题检索</li></ul>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>透传上次接口返回的Context值，可获取后续更多日志，总计最多可获取1万条原始日志，过期时间1小时。<br>注意：</p><ul><li>透传该参数时，请勿修改除该参数外的其它参数</li><li>仅适用于单日志主题检索，检索多个日志主题时，请使用Topics中的Context</li><li>仅当检索分析语句(Query)不包含SQL时有效，SQL获取后续结果参考<a href="https://cloud.tencent.com/document/product/614/58977" target="_blank">SQL LIMIT语法</a></li></ul>
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * <p>执行统计分析（Query中包含SQL）时，是否对原始日志先进行采样，再进行统计分析。<br>0：自动采样;<br>0～1：按指定采样率采样，例如0.02;<br>1：不采样，即精确分析<br>默认值为1</p>
    */
    @SerializedName("SamplingRate")
    @Expose
    private Float SamplingRate;

    /**
    * <p>为true代表使用新的检索结果返回方式，输出参数AnalysisRecords和Columns有效<br>为false时代表使用老的检索结果返回方式, 输出AnalysisResults和ColNames有效<br>两种返回方式在编码格式上有少量区别，建议使用true</p>
    */
    @SerializedName("UseNewAnalysis")
    @Expose
    private Boolean UseNewAnalysis;

    /**
    * <p>是否高亮符合检索条件的关键词，一般用于高亮显示。仅支持键值检索，不支持全文检索</p>
    */
    @SerializedName("HighLight")
    @Expose
    private Boolean HighLight;

    /**
    * <p><strong>Query字段已废弃，请使用QueryString字段</strong><br>字段差异：未指定语法规则时，Query默认使用Lucene语法，QueryString默认使用CQL语法，语法差异详见 <a href="https://cloud.tencent.com/document/product/614/47044#RetrievesConditionalRules">语法规则</a></p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p><strong>SyntaxRule字段已废弃，请使用QuerySyntax字段</strong></p><p>字段差异：</p><ul><li>SyntaxRule与Query字段搭配使用，默认使用Lucene语法</li><li>QuerySyntax与QueryString字段搭配使用，默认使用CQL语法</li></ul><p>SyntaxRule参数说明：</p><ul><li>0：Lucene语法</li><li>1：CQL语法（CLS Query Language，日志服务专用检索语法）</li></ul>
    */
    @SerializedName("SyntaxRule")
    @Expose
    private Long SyntaxRule;

    /**
     * Get <p>要检索分析的日志的起始时间，<strong>Unix时间戳（毫秒）</strong></p> 
     * @return From <p>要检索分析的日志的起始时间，<strong>Unix时间戳（毫秒）</strong></p>
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set <p>要检索分析的日志的起始时间，<strong>Unix时间戳（毫秒）</strong></p>
     * @param From <p>要检索分析的日志的起始时间，<strong>Unix时间戳（毫秒）</strong></p>
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get <p>要检索分析的日志的结束时间，<strong>Unix时间戳（毫秒）</strong></p> 
     * @return To <p>要检索分析的日志的结束时间，<strong>Unix时间戳（毫秒）</strong></p>
     */
    public Long getTo() {
        return this.To;
    }

    /**
     * Set <p>要检索分析的日志的结束时间，<strong>Unix时间戳（毫秒）</strong></p>
     * @param To <p>要检索分析的日志的结束时间，<strong>Unix时间戳（毫秒）</strong></p>
     */
    public void setTo(Long To) {
        this.To = To;
    }

    /**
     * Get <p>检索分析语句，最大长度为12KB<br>语句由 <a href="https://cloud.tencent.com/document/product/614/47044" target="_blank">[检索条件]</a> | <a href="https://cloud.tencent.com/document/product/614/44061" target="_blank">[SQL语句]</a>构成，无需对日志进行统计分析时，可省略其中的管道符<code> | </code>及SQL语句<br>使用*或空字符串可查询所有日志</p><p>默认值：空字符串</p> 
     * @return QueryString <p>检索分析语句，最大长度为12KB<br>语句由 <a href="https://cloud.tencent.com/document/product/614/47044" target="_blank">[检索条件]</a> | <a href="https://cloud.tencent.com/document/product/614/44061" target="_blank">[SQL语句]</a>构成，无需对日志进行统计分析时，可省略其中的管道符<code> | </code>及SQL语句<br>使用*或空字符串可查询所有日志</p><p>默认值：空字符串</p>
     */
    public String getQueryString() {
        return this.QueryString;
    }

    /**
     * Set <p>检索分析语句，最大长度为12KB<br>语句由 <a href="https://cloud.tencent.com/document/product/614/47044" target="_blank">[检索条件]</a> | <a href="https://cloud.tencent.com/document/product/614/44061" target="_blank">[SQL语句]</a>构成，无需对日志进行统计分析时，可省略其中的管道符<code> | </code>及SQL语句<br>使用*或空字符串可查询所有日志</p><p>默认值：空字符串</p>
     * @param QueryString <p>检索分析语句，最大长度为12KB<br>语句由 <a href="https://cloud.tencent.com/document/product/614/47044" target="_blank">[检索条件]</a> | <a href="https://cloud.tencent.com/document/product/614/44061" target="_blank">[SQL语句]</a>构成，无需对日志进行统计分析时，可省略其中的管道符<code> | </code>及SQL语句<br>使用*或空字符串可查询所有日志</p><p>默认值：空字符串</p>
     */
    public void setQueryString(String QueryString) {
        this.QueryString = QueryString;
    }

    /**
     * Get <p>检索语法规则，默认值为1，推荐使用1 。</p><ul><li>0：Lucene语法</li><li>1：CQL语法（CLS Query Language，日志服务专用检索语法）</li></ul><p>详细说明参见<a href="https://cloud.tencent.com/document/product/614/47044#RetrievesConditionalRules" target="_blank">检索条件语法规则</a>。</p><p>默认值：1</p> 
     * @return QuerySyntax <p>检索语法规则，默认值为1，推荐使用1 。</p><ul><li>0：Lucene语法</li><li>1：CQL语法（CLS Query Language，日志服务专用检索语法）</li></ul><p>详细说明参见<a href="https://cloud.tencent.com/document/product/614/47044#RetrievesConditionalRules" target="_blank">检索条件语法规则</a>。</p><p>默认值：1</p>
     */
    public Long getQuerySyntax() {
        return this.QuerySyntax;
    }

    /**
     * Set <p>检索语法规则，默认值为1，推荐使用1 。</p><ul><li>0：Lucene语法</li><li>1：CQL语法（CLS Query Language，日志服务专用检索语法）</li></ul><p>详细说明参见<a href="https://cloud.tencent.com/document/product/614/47044#RetrievesConditionalRules" target="_blank">检索条件语法规则</a>。</p><p>默认值：1</p>
     * @param QuerySyntax <p>检索语法规则，默认值为1，推荐使用1 。</p><ul><li>0：Lucene语法</li><li>1：CQL语法（CLS Query Language，日志服务专用检索语法）</li></ul><p>详细说明参见<a href="https://cloud.tencent.com/document/product/614/47044#RetrievesConditionalRules" target="_blank">检索条件语法规则</a>。</p><p>默认值：1</p>
     */
    public void setQuerySyntax(Long QuerySyntax) {
        this.QuerySyntax = QuerySyntax;
    }

    /**
     * Get <ul><li>要检索分析的日志主题ID，仅能指定一个日志主题。</li><li>如需同时检索多个日志主题，请使用Topics参数。</li><li>TopicId 和 Topics 不能同时使用，在一次请求中有且只能选择一个。</li></ul> 
     * @return TopicId <ul><li>要检索分析的日志主题ID，仅能指定一个日志主题。</li><li>如需同时检索多个日志主题，请使用Topics参数。</li><li>TopicId 和 Topics 不能同时使用，在一次请求中有且只能选择一个。</li></ul>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <ul><li>要检索分析的日志主题ID，仅能指定一个日志主题。</li><li>如需同时检索多个日志主题，请使用Topics参数。</li><li>TopicId 和 Topics 不能同时使用，在一次请求中有且只能选择一个。</li></ul>
     * @param TopicId <ul><li>要检索分析的日志主题ID，仅能指定一个日志主题。</li><li>如需同时检索多个日志主题，请使用Topics参数。</li><li>TopicId 和 Topics 不能同时使用，在一次请求中有且只能选择一个。</li></ul>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <ul><li>要检索分析的日志主题列表，最大支持50个日志主题。</li><li>检索单个日志主题时请使用TopicId。</li><li>TopicId 和 Topics 不能同时使用，在一次请求中有且只能选择一个。</li></ul> 
     * @return Topics <ul><li>要检索分析的日志主题列表，最大支持50个日志主题。</li><li>检索单个日志主题时请使用TopicId。</li><li>TopicId 和 Topics 不能同时使用，在一次请求中有且只能选择一个。</li></ul>
     */
    public MultiTopicSearchInformation [] getTopics() {
        return this.Topics;
    }

    /**
     * Set <ul><li>要检索分析的日志主题列表，最大支持50个日志主题。</li><li>检索单个日志主题时请使用TopicId。</li><li>TopicId 和 Topics 不能同时使用，在一次请求中有且只能选择一个。</li></ul>
     * @param Topics <ul><li>要检索分析的日志主题列表，最大支持50个日志主题。</li><li>检索单个日志主题时请使用TopicId。</li><li>TopicId 和 Topics 不能同时使用，在一次请求中有且只能选择一个。</li></ul>
     */
    public void setTopics(MultiTopicSearchInformation [] Topics) {
        this.Topics = Topics;
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
     * Get <p>表示单次查询返回的原始日志条数，默认为100，最大值为1000。<br>注意：</p><ul><li>仅当检索分析语句(Query)不包含SQL时有效</li><li>SQL结果条数指定方式参考<a href="https://cloud.tencent.com/document/product/614/58977" target="_blank">SQL LIMIT语法</a></li></ul><p>可通过两种方式获取后续更多日志：</p><ul><li>Context:透传上次接口返回的Context值，获取后续更多日志，总计最多可获取1万条原始日志</li><li>Offset:偏移量，表示从第几行开始返回原始日志，无日志条数限制</li></ul> 
     * @return Limit <p>表示单次查询返回的原始日志条数，默认为100，最大值为1000。<br>注意：</p><ul><li>仅当检索分析语句(Query)不包含SQL时有效</li><li>SQL结果条数指定方式参考<a href="https://cloud.tencent.com/document/product/614/58977" target="_blank">SQL LIMIT语法</a></li></ul><p>可通过两种方式获取后续更多日志：</p><ul><li>Context:透传上次接口返回的Context值，获取后续更多日志，总计最多可获取1万条原始日志</li><li>Offset:偏移量，表示从第几行开始返回原始日志，无日志条数限制</li></ul>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>表示单次查询返回的原始日志条数，默认为100，最大值为1000。<br>注意：</p><ul><li>仅当检索分析语句(Query)不包含SQL时有效</li><li>SQL结果条数指定方式参考<a href="https://cloud.tencent.com/document/product/614/58977" target="_blank">SQL LIMIT语法</a></li></ul><p>可通过两种方式获取后续更多日志：</p><ul><li>Context:透传上次接口返回的Context值，获取后续更多日志，总计最多可获取1万条原始日志</li><li>Offset:偏移量，表示从第几行开始返回原始日志，无日志条数限制</li></ul>
     * @param Limit <p>表示单次查询返回的原始日志条数，默认为100，最大值为1000。<br>注意：</p><ul><li>仅当检索分析语句(Query)不包含SQL时有效</li><li>SQL结果条数指定方式参考<a href="https://cloud.tencent.com/document/product/614/58977" target="_blank">SQL LIMIT语法</a></li></ul><p>可通过两种方式获取后续更多日志：</p><ul><li>Context:透传上次接口返回的Context值，获取后续更多日志，总计最多可获取1万条原始日志</li><li>Offset:偏移量，表示从第几行开始返回原始日志，无日志条数限制</li></ul>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>查询原始日志的偏移量，表示从第几行开始返回原始日志，默认为0。<br>注意：</p><ul><li>仅当检索分析语句(Query)不包含SQL时有效</li><li>不能与Context参数同时使用</li><li>仅适用于单日志主题检索</li></ul> 
     * @return Offset <p>查询原始日志的偏移量，表示从第几行开始返回原始日志，默认为0。<br>注意：</p><ul><li>仅当检索分析语句(Query)不包含SQL时有效</li><li>不能与Context参数同时使用</li><li>仅适用于单日志主题检索</li></ul>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>查询原始日志的偏移量，表示从第几行开始返回原始日志，默认为0。<br>注意：</p><ul><li>仅当检索分析语句(Query)不包含SQL时有效</li><li>不能与Context参数同时使用</li><li>仅适用于单日志主题检索</li></ul>
     * @param Offset <p>查询原始日志的偏移量，表示从第几行开始返回原始日志，默认为0。<br>注意：</p><ul><li>仅当检索分析语句(Query)不包含SQL时有效</li><li>不能与Context参数同时使用</li><li>仅适用于单日志主题检索</li></ul>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>透传上次接口返回的Context值，可获取后续更多日志，总计最多可获取1万条原始日志，过期时间1小时。<br>注意：</p><ul><li>透传该参数时，请勿修改除该参数外的其它参数</li><li>仅适用于单日志主题检索，检索多个日志主题时，请使用Topics中的Context</li><li>仅当检索分析语句(Query)不包含SQL时有效，SQL获取后续结果参考<a href="https://cloud.tencent.com/document/product/614/58977" target="_blank">SQL LIMIT语法</a></li></ul> 
     * @return Context <p>透传上次接口返回的Context值，可获取后续更多日志，总计最多可获取1万条原始日志，过期时间1小时。<br>注意：</p><ul><li>透传该参数时，请勿修改除该参数外的其它参数</li><li>仅适用于单日志主题检索，检索多个日志主题时，请使用Topics中的Context</li><li>仅当检索分析语句(Query)不包含SQL时有效，SQL获取后续结果参考<a href="https://cloud.tencent.com/document/product/614/58977" target="_blank">SQL LIMIT语法</a></li></ul>
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set <p>透传上次接口返回的Context值，可获取后续更多日志，总计最多可获取1万条原始日志，过期时间1小时。<br>注意：</p><ul><li>透传该参数时，请勿修改除该参数外的其它参数</li><li>仅适用于单日志主题检索，检索多个日志主题时，请使用Topics中的Context</li><li>仅当检索分析语句(Query)不包含SQL时有效，SQL获取后续结果参考<a href="https://cloud.tencent.com/document/product/614/58977" target="_blank">SQL LIMIT语法</a></li></ul>
     * @param Context <p>透传上次接口返回的Context值，可获取后续更多日志，总计最多可获取1万条原始日志，过期时间1小时。<br>注意：</p><ul><li>透传该参数时，请勿修改除该参数外的其它参数</li><li>仅适用于单日志主题检索，检索多个日志主题时，请使用Topics中的Context</li><li>仅当检索分析语句(Query)不包含SQL时有效，SQL获取后续结果参考<a href="https://cloud.tencent.com/document/product/614/58977" target="_blank">SQL LIMIT语法</a></li></ul>
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get <p>执行统计分析（Query中包含SQL）时，是否对原始日志先进行采样，再进行统计分析。<br>0：自动采样;<br>0～1：按指定采样率采样，例如0.02;<br>1：不采样，即精确分析<br>默认值为1</p> 
     * @return SamplingRate <p>执行统计分析（Query中包含SQL）时，是否对原始日志先进行采样，再进行统计分析。<br>0：自动采样;<br>0～1：按指定采样率采样，例如0.02;<br>1：不采样，即精确分析<br>默认值为1</p>
     */
    public Float getSamplingRate() {
        return this.SamplingRate;
    }

    /**
     * Set <p>执行统计分析（Query中包含SQL）时，是否对原始日志先进行采样，再进行统计分析。<br>0：自动采样;<br>0～1：按指定采样率采样，例如0.02;<br>1：不采样，即精确分析<br>默认值为1</p>
     * @param SamplingRate <p>执行统计分析（Query中包含SQL）时，是否对原始日志先进行采样，再进行统计分析。<br>0：自动采样;<br>0～1：按指定采样率采样，例如0.02;<br>1：不采样，即精确分析<br>默认值为1</p>
     */
    public void setSamplingRate(Float SamplingRate) {
        this.SamplingRate = SamplingRate;
    }

    /**
     * Get <p>为true代表使用新的检索结果返回方式，输出参数AnalysisRecords和Columns有效<br>为false时代表使用老的检索结果返回方式, 输出AnalysisResults和ColNames有效<br>两种返回方式在编码格式上有少量区别，建议使用true</p> 
     * @return UseNewAnalysis <p>为true代表使用新的检索结果返回方式，输出参数AnalysisRecords和Columns有效<br>为false时代表使用老的检索结果返回方式, 输出AnalysisResults和ColNames有效<br>两种返回方式在编码格式上有少量区别，建议使用true</p>
     */
    public Boolean getUseNewAnalysis() {
        return this.UseNewAnalysis;
    }

    /**
     * Set <p>为true代表使用新的检索结果返回方式，输出参数AnalysisRecords和Columns有效<br>为false时代表使用老的检索结果返回方式, 输出AnalysisResults和ColNames有效<br>两种返回方式在编码格式上有少量区别，建议使用true</p>
     * @param UseNewAnalysis <p>为true代表使用新的检索结果返回方式，输出参数AnalysisRecords和Columns有效<br>为false时代表使用老的检索结果返回方式, 输出AnalysisResults和ColNames有效<br>两种返回方式在编码格式上有少量区别，建议使用true</p>
     */
    public void setUseNewAnalysis(Boolean UseNewAnalysis) {
        this.UseNewAnalysis = UseNewAnalysis;
    }

    /**
     * Get <p>是否高亮符合检索条件的关键词，一般用于高亮显示。仅支持键值检索，不支持全文检索</p> 
     * @return HighLight <p>是否高亮符合检索条件的关键词，一般用于高亮显示。仅支持键值检索，不支持全文检索</p>
     */
    public Boolean getHighLight() {
        return this.HighLight;
    }

    /**
     * Set <p>是否高亮符合检索条件的关键词，一般用于高亮显示。仅支持键值检索，不支持全文检索</p>
     * @param HighLight <p>是否高亮符合检索条件的关键词，一般用于高亮显示。仅支持键值检索，不支持全文检索</p>
     */
    public void setHighLight(Boolean HighLight) {
        this.HighLight = HighLight;
    }

    /**
     * Get <p><strong>Query字段已废弃，请使用QueryString字段</strong><br>字段差异：未指定语法规则时，Query默认使用Lucene语法，QueryString默认使用CQL语法，语法差异详见 <a href="https://cloud.tencent.com/document/product/614/47044#RetrievesConditionalRules">语法规则</a></p> 
     * @return Query <p><strong>Query字段已废弃，请使用QueryString字段</strong><br>字段差异：未指定语法规则时，Query默认使用Lucene语法，QueryString默认使用CQL语法，语法差异详见 <a href="https://cloud.tencent.com/document/product/614/47044#RetrievesConditionalRules">语法规则</a></p>
     * @deprecated
     */
    @Deprecated
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p><strong>Query字段已废弃，请使用QueryString字段</strong><br>字段差异：未指定语法规则时，Query默认使用Lucene语法，QueryString默认使用CQL语法，语法差异详见 <a href="https://cloud.tencent.com/document/product/614/47044#RetrievesConditionalRules">语法规则</a></p>
     * @param Query <p><strong>Query字段已废弃，请使用QueryString字段</strong><br>字段差异：未指定语法规则时，Query默认使用Lucene语法，QueryString默认使用CQL语法，语法差异详见 <a href="https://cloud.tencent.com/document/product/614/47044#RetrievesConditionalRules">语法规则</a></p>
     * @deprecated
     */
    @Deprecated
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p><strong>SyntaxRule字段已废弃，请使用QuerySyntax字段</strong></p><p>字段差异：</p><ul><li>SyntaxRule与Query字段搭配使用，默认使用Lucene语法</li><li>QuerySyntax与QueryString字段搭配使用，默认使用CQL语法</li></ul><p>SyntaxRule参数说明：</p><ul><li>0：Lucene语法</li><li>1：CQL语法（CLS Query Language，日志服务专用检索语法）</li></ul> 
     * @return SyntaxRule <p><strong>SyntaxRule字段已废弃，请使用QuerySyntax字段</strong></p><p>字段差异：</p><ul><li>SyntaxRule与Query字段搭配使用，默认使用Lucene语法</li><li>QuerySyntax与QueryString字段搭配使用，默认使用CQL语法</li></ul><p>SyntaxRule参数说明：</p><ul><li>0：Lucene语法</li><li>1：CQL语法（CLS Query Language，日志服务专用检索语法）</li></ul>
     * @deprecated
     */
    @Deprecated
    public Long getSyntaxRule() {
        return this.SyntaxRule;
    }

    /**
     * Set <p><strong>SyntaxRule字段已废弃，请使用QuerySyntax字段</strong></p><p>字段差异：</p><ul><li>SyntaxRule与Query字段搭配使用，默认使用Lucene语法</li><li>QuerySyntax与QueryString字段搭配使用，默认使用CQL语法</li></ul><p>SyntaxRule参数说明：</p><ul><li>0：Lucene语法</li><li>1：CQL语法（CLS Query Language，日志服务专用检索语法）</li></ul>
     * @param SyntaxRule <p><strong>SyntaxRule字段已废弃，请使用QuerySyntax字段</strong></p><p>字段差异：</p><ul><li>SyntaxRule与Query字段搭配使用，默认使用Lucene语法</li><li>QuerySyntax与QueryString字段搭配使用，默认使用CQL语法</li></ul><p>SyntaxRule参数说明：</p><ul><li>0：Lucene语法</li><li>1：CQL语法（CLS Query Language，日志服务专用检索语法）</li></ul>
     * @deprecated
     */
    @Deprecated
    public void setSyntaxRule(Long SyntaxRule) {
        this.SyntaxRule = SyntaxRule;
    }

    public SearchLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchLogRequest(SearchLogRequest source) {
        if (source.From != null) {
            this.From = new Long(source.From);
        }
        if (source.To != null) {
            this.To = new Long(source.To);
        }
        if (source.QueryString != null) {
            this.QueryString = new String(source.QueryString);
        }
        if (source.QuerySyntax != null) {
            this.QuerySyntax = new Long(source.QuerySyntax);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Topics != null) {
            this.Topics = new MultiTopicSearchInformation[source.Topics.length];
            for (int i = 0; i < source.Topics.length; i++) {
                this.Topics[i] = new MultiTopicSearchInformation(source.Topics[i]);
            }
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.SamplingRate != null) {
            this.SamplingRate = new Float(source.SamplingRate);
        }
        if (source.UseNewAnalysis != null) {
            this.UseNewAnalysis = new Boolean(source.UseNewAnalysis);
        }
        if (source.HighLight != null) {
            this.HighLight = new Boolean(source.HighLight);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.SyntaxRule != null) {
            this.SyntaxRule = new Long(source.SyntaxRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);
        this.setParamSimple(map, prefix + "QueryString", this.QueryString);
        this.setParamSimple(map, prefix + "QuerySyntax", this.QuerySyntax);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamArrayObj(map, prefix + "Topics.", this.Topics);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "SamplingRate", this.SamplingRate);
        this.setParamSimple(map, prefix + "UseNewAnalysis", this.UseNewAnalysis);
        this.setParamSimple(map, prefix + "HighLight", this.HighLight);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "SyntaxRule", this.SyntaxRule);

    }
}

