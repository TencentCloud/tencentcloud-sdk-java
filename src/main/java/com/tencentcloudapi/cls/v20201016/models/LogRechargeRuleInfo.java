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

public class LogRechargeRuleInfo extends AbstractModel {

    /**
    * <p>导入类型，支持json_log：json格式日志，minimalist_log: 单行全文，fullregex_log: 单行完全正则</p>
    */
    @SerializedName("RechargeType")
    @Expose
    private String RechargeType;

    /**
    * <p>解析编码格式，0: UTF-8（默认值），1: GBK</p>
    */
    @SerializedName("EncodingFormat")
    @Expose
    private Long EncodingFormat;

    /**
    * <p>使用默认时间状态。true：开启后将使用系统当前时间或 Kafka 消息时间戳作为日志时间戳；false：关闭将使用日志中的时间字段作为日志时间戳。 默认：true</p>
    */
    @SerializedName("DefaultTimeSwitch")
    @Expose
    private Boolean DefaultTimeSwitch;

    /**
    * <p>整条日志匹配规则，只有RechargeType为fullregex_log时有效</p>
    */
    @SerializedName("LogRegex")
    @Expose
    private String LogRegex;

    /**
    * <p>解析失败日志是否上传，true表示上传，false表示不上传</p>
    */
    @SerializedName("UnMatchLogSwitch")
    @Expose
    private Boolean UnMatchLogSwitch;

    /**
    * <p>解析失败日志的键名称</p>
    */
    @SerializedName("UnMatchLogKey")
    @Expose
    private String UnMatchLogKey;

    /**
    * <p>解析失败日志时间来源，0: 系统当前时间，1: Kafka消息时间戳</p>
    */
    @SerializedName("UnMatchLogTimeSrc")
    @Expose
    private Long UnMatchLogTimeSrc;

    /**
    * <p>默认时间来源，0: 系统当前时间，1: Kafka消息时间戳</p>
    */
    @SerializedName("DefaultTimeSrc")
    @Expose
    private Long DefaultTimeSrc;

    /**
    * <p>时间字段，日志中代表时间的字段名。</p><ul><li>当DefaultTimeSwitch为false，且RechargeType数据提取模式为 <code>json_log</code> JSON-文件日志 或 <code>fullregex_log</code> 单行完全正则-文件日志时， TimeKey不能为空。</li></ul>
    */
    @SerializedName("TimeKey")
    @Expose
    private String TimeKey;

    /**
    * <p>时间提取正则表达式。</p><ul><li>当DefaultTimeSwitch为false，且RechargeType数据提取模式为 <code>minimalist_log</code> 单行全文-文件日志时， TimeRegex不能为空。</li><li>仅需输入日志中代表时间的字段的正则表达式即可；若匹配到多个字段，将使用第一个。<br> 例：日志原文为：message with time 2022-08-08 14:20:20，则您可以设置提取时间正则为\d\d\d\d-\d\d-\d\d \d\d:\d\d:\d\d</li></ul>
    */
    @SerializedName("TimeRegex")
    @Expose
    private String TimeRegex;

    /**
    * <p>时间字段格式。</p><ul><li>当DefaultTimeSwitch为false时， TimeFormat不能为空。</li></ul>
    */
    @SerializedName("TimeFormat")
    @Expose
    private String TimeFormat;

    /**
    * <p>时间字段时区。</p><ul><li><p>当DefaultTimeSwitch为false时， TimeZone不能为空。</p></li><li><p>时区格式规则<br>前缀：使用 GMT 或 UTC 作为时区基准<br>偏移量：</p><ul><li><code>-</code> 表示西时区（比基准时间晚）</li><li><code>+</code> 表示东时区（比基准时间早）</li><li>格式为 ±HH:MM（小时:分钟）</li></ul></li><li><p>当前支持：<br><pre><code>&quot;GMT-12:00&quot; &quot;GMT-11:00&quot; &quot;GMT-10:00&quot; &quot;GMT-09:30&quot; &quot;GMT-09:00&quot; &quot;GMT-08:00&quot; &quot;GMT-07:00&quot; &quot;GMT-06:00&quot; &quot;GMT-05:00&quot; &quot;GMT-04:00&quot; &quot;GMT-03:30&quot; &quot;GMT-03:00&quot; &quot;GMT-02:00&quot; &quot;GMT-01:00&quot; &quot;GMT+00:00&quot;&quot;GMT+01:00&quot;&quot;GMT+02:00&quot;&quot;GMT+03:30&quot;&quot;GMT+04:00&quot;&quot;GMT+04:30&quot;&quot;GMT+05:00&quot;&quot;GMT+05:30&quot;&quot;GMT+05:45&quot;&quot;GMT+06:00&quot;&quot;GMT+06:30&quot;&quot;GMT+07:00&quot;&quot;GMT+08:00&quot;&quot;GMT+09:00&quot;&quot;GMT+09:30&quot;&quot;GMT+10:00&quot;&quot;GMT+10:30&quot;&quot;GMT+11:00&quot;&quot;GMT+11:30&quot;&quot;GMT+12:00&quot;&quot;GMT+12:45&quot;&quot;GMT+13:00&quot;&quot;GMT+14:00&quot;&quot;UTC-11:00&quot;&quot;UTC-10:00&quot;&quot;UTC-09:00&quot;&quot;UTC-08:00&quot;&quot;UTC-12:00&quot;&quot;UTC-07:00&quot;&quot;UTC-06:00&quot;&quot;UTC-05:00&quot;&quot;UTC-04:30&quot;&quot;UTC-04:00&quot;&quot;UTC-03:30&quot;&quot;UTC-03:00&quot;&quot;UTC-02:00&quot;&quot;UTC-01:00&quot;&quot;UTC+00:00&quot;&quot;UTC+01:00&quot;&quot;UTC+02:00&quot;&quot;UTC+03:00&quot;&quot;UTC+03:30&quot;&quot;UTC+04:00&quot;&quot;UTC+04:30&quot;&quot;UTC+05:00&quot;&quot;UTC+05:45&quot;&quot;UTC+06:00&quot;&quot;UTC+06:30&quot;&quot;UTC+07:00&quot;&quot;UTC+08:00&quot;&quot;UTC+09:00&quot;&quot;UTC+09:30&quot;&quot;UTC+10:00&quot;&quot;UTC+11:00&quot;&quot;UTC+12:00&quot;&quot;UTC+13:00&quot;</code></pre></p></li></ul>
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * <p>元数据信息，Kafka导入支持kafka_topic,kafka_partition,kafka_offset,kafka_timestamp</p>
    */
    @SerializedName("Metadata")
    @Expose
    private String [] Metadata;

    /**
    * <p>日志Key列表，RechargeType为full_regex_log、delimiter_log时必填</p>
    */
    @SerializedName("Keys")
    @Expose
    private String [] Keys;

    /**
    * <p>json解析模式，开启首层数据解析</p>
    */
    @SerializedName("ParseArray")
    @Expose
    private Boolean ParseArray;

    /**
    * <p>分隔符解析模式-分隔符<br>当解析格式为分隔符提取时，该字段必填</p>
    */
    @SerializedName("Delimiter")
    @Expose
    private String Delimiter;

    /**
    * <p>JSON嵌套展开配置。仅RechargeType为json_log时生效，不传表示不开启。</p>
    */
    @SerializedName("JsonExpand")
    @Expose
    private JsonExpandInfo JsonExpand;

    /**
     * Get <p>导入类型，支持json_log：json格式日志，minimalist_log: 单行全文，fullregex_log: 单行完全正则</p> 
     * @return RechargeType <p>导入类型，支持json_log：json格式日志，minimalist_log: 单行全文，fullregex_log: 单行完全正则</p>
     */
    public String getRechargeType() {
        return this.RechargeType;
    }

    /**
     * Set <p>导入类型，支持json_log：json格式日志，minimalist_log: 单行全文，fullregex_log: 单行完全正则</p>
     * @param RechargeType <p>导入类型，支持json_log：json格式日志，minimalist_log: 单行全文，fullregex_log: 单行完全正则</p>
     */
    public void setRechargeType(String RechargeType) {
        this.RechargeType = RechargeType;
    }

    /**
     * Get <p>解析编码格式，0: UTF-8（默认值），1: GBK</p> 
     * @return EncodingFormat <p>解析编码格式，0: UTF-8（默认值），1: GBK</p>
     */
    public Long getEncodingFormat() {
        return this.EncodingFormat;
    }

    /**
     * Set <p>解析编码格式，0: UTF-8（默认值），1: GBK</p>
     * @param EncodingFormat <p>解析编码格式，0: UTF-8（默认值），1: GBK</p>
     */
    public void setEncodingFormat(Long EncodingFormat) {
        this.EncodingFormat = EncodingFormat;
    }

    /**
     * Get <p>使用默认时间状态。true：开启后将使用系统当前时间或 Kafka 消息时间戳作为日志时间戳；false：关闭将使用日志中的时间字段作为日志时间戳。 默认：true</p> 
     * @return DefaultTimeSwitch <p>使用默认时间状态。true：开启后将使用系统当前时间或 Kafka 消息时间戳作为日志时间戳；false：关闭将使用日志中的时间字段作为日志时间戳。 默认：true</p>
     */
    public Boolean getDefaultTimeSwitch() {
        return this.DefaultTimeSwitch;
    }

    /**
     * Set <p>使用默认时间状态。true：开启后将使用系统当前时间或 Kafka 消息时间戳作为日志时间戳；false：关闭将使用日志中的时间字段作为日志时间戳。 默认：true</p>
     * @param DefaultTimeSwitch <p>使用默认时间状态。true：开启后将使用系统当前时间或 Kafka 消息时间戳作为日志时间戳；false：关闭将使用日志中的时间字段作为日志时间戳。 默认：true</p>
     */
    public void setDefaultTimeSwitch(Boolean DefaultTimeSwitch) {
        this.DefaultTimeSwitch = DefaultTimeSwitch;
    }

    /**
     * Get <p>整条日志匹配规则，只有RechargeType为fullregex_log时有效</p> 
     * @return LogRegex <p>整条日志匹配规则，只有RechargeType为fullregex_log时有效</p>
     */
    public String getLogRegex() {
        return this.LogRegex;
    }

    /**
     * Set <p>整条日志匹配规则，只有RechargeType为fullregex_log时有效</p>
     * @param LogRegex <p>整条日志匹配规则，只有RechargeType为fullregex_log时有效</p>
     */
    public void setLogRegex(String LogRegex) {
        this.LogRegex = LogRegex;
    }

    /**
     * Get <p>解析失败日志是否上传，true表示上传，false表示不上传</p> 
     * @return UnMatchLogSwitch <p>解析失败日志是否上传，true表示上传，false表示不上传</p>
     */
    public Boolean getUnMatchLogSwitch() {
        return this.UnMatchLogSwitch;
    }

    /**
     * Set <p>解析失败日志是否上传，true表示上传，false表示不上传</p>
     * @param UnMatchLogSwitch <p>解析失败日志是否上传，true表示上传，false表示不上传</p>
     */
    public void setUnMatchLogSwitch(Boolean UnMatchLogSwitch) {
        this.UnMatchLogSwitch = UnMatchLogSwitch;
    }

    /**
     * Get <p>解析失败日志的键名称</p> 
     * @return UnMatchLogKey <p>解析失败日志的键名称</p>
     */
    public String getUnMatchLogKey() {
        return this.UnMatchLogKey;
    }

    /**
     * Set <p>解析失败日志的键名称</p>
     * @param UnMatchLogKey <p>解析失败日志的键名称</p>
     */
    public void setUnMatchLogKey(String UnMatchLogKey) {
        this.UnMatchLogKey = UnMatchLogKey;
    }

    /**
     * Get <p>解析失败日志时间来源，0: 系统当前时间，1: Kafka消息时间戳</p> 
     * @return UnMatchLogTimeSrc <p>解析失败日志时间来源，0: 系统当前时间，1: Kafka消息时间戳</p>
     */
    public Long getUnMatchLogTimeSrc() {
        return this.UnMatchLogTimeSrc;
    }

    /**
     * Set <p>解析失败日志时间来源，0: 系统当前时间，1: Kafka消息时间戳</p>
     * @param UnMatchLogTimeSrc <p>解析失败日志时间来源，0: 系统当前时间，1: Kafka消息时间戳</p>
     */
    public void setUnMatchLogTimeSrc(Long UnMatchLogTimeSrc) {
        this.UnMatchLogTimeSrc = UnMatchLogTimeSrc;
    }

    /**
     * Get <p>默认时间来源，0: 系统当前时间，1: Kafka消息时间戳</p> 
     * @return DefaultTimeSrc <p>默认时间来源，0: 系统当前时间，1: Kafka消息时间戳</p>
     */
    public Long getDefaultTimeSrc() {
        return this.DefaultTimeSrc;
    }

    /**
     * Set <p>默认时间来源，0: 系统当前时间，1: Kafka消息时间戳</p>
     * @param DefaultTimeSrc <p>默认时间来源，0: 系统当前时间，1: Kafka消息时间戳</p>
     */
    public void setDefaultTimeSrc(Long DefaultTimeSrc) {
        this.DefaultTimeSrc = DefaultTimeSrc;
    }

    /**
     * Get <p>时间字段，日志中代表时间的字段名。</p><ul><li>当DefaultTimeSwitch为false，且RechargeType数据提取模式为 <code>json_log</code> JSON-文件日志 或 <code>fullregex_log</code> 单行完全正则-文件日志时， TimeKey不能为空。</li></ul> 
     * @return TimeKey <p>时间字段，日志中代表时间的字段名。</p><ul><li>当DefaultTimeSwitch为false，且RechargeType数据提取模式为 <code>json_log</code> JSON-文件日志 或 <code>fullregex_log</code> 单行完全正则-文件日志时， TimeKey不能为空。</li></ul>
     */
    public String getTimeKey() {
        return this.TimeKey;
    }

    /**
     * Set <p>时间字段，日志中代表时间的字段名。</p><ul><li>当DefaultTimeSwitch为false，且RechargeType数据提取模式为 <code>json_log</code> JSON-文件日志 或 <code>fullregex_log</code> 单行完全正则-文件日志时， TimeKey不能为空。</li></ul>
     * @param TimeKey <p>时间字段，日志中代表时间的字段名。</p><ul><li>当DefaultTimeSwitch为false，且RechargeType数据提取模式为 <code>json_log</code> JSON-文件日志 或 <code>fullregex_log</code> 单行完全正则-文件日志时， TimeKey不能为空。</li></ul>
     */
    public void setTimeKey(String TimeKey) {
        this.TimeKey = TimeKey;
    }

    /**
     * Get <p>时间提取正则表达式。</p><ul><li>当DefaultTimeSwitch为false，且RechargeType数据提取模式为 <code>minimalist_log</code> 单行全文-文件日志时， TimeRegex不能为空。</li><li>仅需输入日志中代表时间的字段的正则表达式即可；若匹配到多个字段，将使用第一个。<br> 例：日志原文为：message with time 2022-08-08 14:20:20，则您可以设置提取时间正则为\d\d\d\d-\d\d-\d\d \d\d:\d\d:\d\d</li></ul> 
     * @return TimeRegex <p>时间提取正则表达式。</p><ul><li>当DefaultTimeSwitch为false，且RechargeType数据提取模式为 <code>minimalist_log</code> 单行全文-文件日志时， TimeRegex不能为空。</li><li>仅需输入日志中代表时间的字段的正则表达式即可；若匹配到多个字段，将使用第一个。<br> 例：日志原文为：message with time 2022-08-08 14:20:20，则您可以设置提取时间正则为\d\d\d\d-\d\d-\d\d \d\d:\d\d:\d\d</li></ul>
     */
    public String getTimeRegex() {
        return this.TimeRegex;
    }

    /**
     * Set <p>时间提取正则表达式。</p><ul><li>当DefaultTimeSwitch为false，且RechargeType数据提取模式为 <code>minimalist_log</code> 单行全文-文件日志时， TimeRegex不能为空。</li><li>仅需输入日志中代表时间的字段的正则表达式即可；若匹配到多个字段，将使用第一个。<br> 例：日志原文为：message with time 2022-08-08 14:20:20，则您可以设置提取时间正则为\d\d\d\d-\d\d-\d\d \d\d:\d\d:\d\d</li></ul>
     * @param TimeRegex <p>时间提取正则表达式。</p><ul><li>当DefaultTimeSwitch为false，且RechargeType数据提取模式为 <code>minimalist_log</code> 单行全文-文件日志时， TimeRegex不能为空。</li><li>仅需输入日志中代表时间的字段的正则表达式即可；若匹配到多个字段，将使用第一个。<br> 例：日志原文为：message with time 2022-08-08 14:20:20，则您可以设置提取时间正则为\d\d\d\d-\d\d-\d\d \d\d:\d\d:\d\d</li></ul>
     */
    public void setTimeRegex(String TimeRegex) {
        this.TimeRegex = TimeRegex;
    }

    /**
     * Get <p>时间字段格式。</p><ul><li>当DefaultTimeSwitch为false时， TimeFormat不能为空。</li></ul> 
     * @return TimeFormat <p>时间字段格式。</p><ul><li>当DefaultTimeSwitch为false时， TimeFormat不能为空。</li></ul>
     */
    public String getTimeFormat() {
        return this.TimeFormat;
    }

    /**
     * Set <p>时间字段格式。</p><ul><li>当DefaultTimeSwitch为false时， TimeFormat不能为空。</li></ul>
     * @param TimeFormat <p>时间字段格式。</p><ul><li>当DefaultTimeSwitch为false时， TimeFormat不能为空。</li></ul>
     */
    public void setTimeFormat(String TimeFormat) {
        this.TimeFormat = TimeFormat;
    }

    /**
     * Get <p>时间字段时区。</p><ul><li><p>当DefaultTimeSwitch为false时， TimeZone不能为空。</p></li><li><p>时区格式规则<br>前缀：使用 GMT 或 UTC 作为时区基准<br>偏移量：</p><ul><li><code>-</code> 表示西时区（比基准时间晚）</li><li><code>+</code> 表示东时区（比基准时间早）</li><li>格式为 ±HH:MM（小时:分钟）</li></ul></li><li><p>当前支持：<br><pre><code>&quot;GMT-12:00&quot; &quot;GMT-11:00&quot; &quot;GMT-10:00&quot; &quot;GMT-09:30&quot; &quot;GMT-09:00&quot; &quot;GMT-08:00&quot; &quot;GMT-07:00&quot; &quot;GMT-06:00&quot; &quot;GMT-05:00&quot; &quot;GMT-04:00&quot; &quot;GMT-03:30&quot; &quot;GMT-03:00&quot; &quot;GMT-02:00&quot; &quot;GMT-01:00&quot; &quot;GMT+00:00&quot;&quot;GMT+01:00&quot;&quot;GMT+02:00&quot;&quot;GMT+03:30&quot;&quot;GMT+04:00&quot;&quot;GMT+04:30&quot;&quot;GMT+05:00&quot;&quot;GMT+05:30&quot;&quot;GMT+05:45&quot;&quot;GMT+06:00&quot;&quot;GMT+06:30&quot;&quot;GMT+07:00&quot;&quot;GMT+08:00&quot;&quot;GMT+09:00&quot;&quot;GMT+09:30&quot;&quot;GMT+10:00&quot;&quot;GMT+10:30&quot;&quot;GMT+11:00&quot;&quot;GMT+11:30&quot;&quot;GMT+12:00&quot;&quot;GMT+12:45&quot;&quot;GMT+13:00&quot;&quot;GMT+14:00&quot;&quot;UTC-11:00&quot;&quot;UTC-10:00&quot;&quot;UTC-09:00&quot;&quot;UTC-08:00&quot;&quot;UTC-12:00&quot;&quot;UTC-07:00&quot;&quot;UTC-06:00&quot;&quot;UTC-05:00&quot;&quot;UTC-04:30&quot;&quot;UTC-04:00&quot;&quot;UTC-03:30&quot;&quot;UTC-03:00&quot;&quot;UTC-02:00&quot;&quot;UTC-01:00&quot;&quot;UTC+00:00&quot;&quot;UTC+01:00&quot;&quot;UTC+02:00&quot;&quot;UTC+03:00&quot;&quot;UTC+03:30&quot;&quot;UTC+04:00&quot;&quot;UTC+04:30&quot;&quot;UTC+05:00&quot;&quot;UTC+05:45&quot;&quot;UTC+06:00&quot;&quot;UTC+06:30&quot;&quot;UTC+07:00&quot;&quot;UTC+08:00&quot;&quot;UTC+09:00&quot;&quot;UTC+09:30&quot;&quot;UTC+10:00&quot;&quot;UTC+11:00&quot;&quot;UTC+12:00&quot;&quot;UTC+13:00&quot;</code></pre></p></li></ul> 
     * @return TimeZone <p>时间字段时区。</p><ul><li><p>当DefaultTimeSwitch为false时， TimeZone不能为空。</p></li><li><p>时区格式规则<br>前缀：使用 GMT 或 UTC 作为时区基准<br>偏移量：</p><ul><li><code>-</code> 表示西时区（比基准时间晚）</li><li><code>+</code> 表示东时区（比基准时间早）</li><li>格式为 ±HH:MM（小时:分钟）</li></ul></li><li><p>当前支持：<br><pre><code>&quot;GMT-12:00&quot; &quot;GMT-11:00&quot; &quot;GMT-10:00&quot; &quot;GMT-09:30&quot; &quot;GMT-09:00&quot; &quot;GMT-08:00&quot; &quot;GMT-07:00&quot; &quot;GMT-06:00&quot; &quot;GMT-05:00&quot; &quot;GMT-04:00&quot; &quot;GMT-03:30&quot; &quot;GMT-03:00&quot; &quot;GMT-02:00&quot; &quot;GMT-01:00&quot; &quot;GMT+00:00&quot;&quot;GMT+01:00&quot;&quot;GMT+02:00&quot;&quot;GMT+03:30&quot;&quot;GMT+04:00&quot;&quot;GMT+04:30&quot;&quot;GMT+05:00&quot;&quot;GMT+05:30&quot;&quot;GMT+05:45&quot;&quot;GMT+06:00&quot;&quot;GMT+06:30&quot;&quot;GMT+07:00&quot;&quot;GMT+08:00&quot;&quot;GMT+09:00&quot;&quot;GMT+09:30&quot;&quot;GMT+10:00&quot;&quot;GMT+10:30&quot;&quot;GMT+11:00&quot;&quot;GMT+11:30&quot;&quot;GMT+12:00&quot;&quot;GMT+12:45&quot;&quot;GMT+13:00&quot;&quot;GMT+14:00&quot;&quot;UTC-11:00&quot;&quot;UTC-10:00&quot;&quot;UTC-09:00&quot;&quot;UTC-08:00&quot;&quot;UTC-12:00&quot;&quot;UTC-07:00&quot;&quot;UTC-06:00&quot;&quot;UTC-05:00&quot;&quot;UTC-04:30&quot;&quot;UTC-04:00&quot;&quot;UTC-03:30&quot;&quot;UTC-03:00&quot;&quot;UTC-02:00&quot;&quot;UTC-01:00&quot;&quot;UTC+00:00&quot;&quot;UTC+01:00&quot;&quot;UTC+02:00&quot;&quot;UTC+03:00&quot;&quot;UTC+03:30&quot;&quot;UTC+04:00&quot;&quot;UTC+04:30&quot;&quot;UTC+05:00&quot;&quot;UTC+05:45&quot;&quot;UTC+06:00&quot;&quot;UTC+06:30&quot;&quot;UTC+07:00&quot;&quot;UTC+08:00&quot;&quot;UTC+09:00&quot;&quot;UTC+09:30&quot;&quot;UTC+10:00&quot;&quot;UTC+11:00&quot;&quot;UTC+12:00&quot;&quot;UTC+13:00&quot;</code></pre></p></li></ul>
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set <p>时间字段时区。</p><ul><li><p>当DefaultTimeSwitch为false时， TimeZone不能为空。</p></li><li><p>时区格式规则<br>前缀：使用 GMT 或 UTC 作为时区基准<br>偏移量：</p><ul><li><code>-</code> 表示西时区（比基准时间晚）</li><li><code>+</code> 表示东时区（比基准时间早）</li><li>格式为 ±HH:MM（小时:分钟）</li></ul></li><li><p>当前支持：<br><pre><code>&quot;GMT-12:00&quot; &quot;GMT-11:00&quot; &quot;GMT-10:00&quot; &quot;GMT-09:30&quot; &quot;GMT-09:00&quot; &quot;GMT-08:00&quot; &quot;GMT-07:00&quot; &quot;GMT-06:00&quot; &quot;GMT-05:00&quot; &quot;GMT-04:00&quot; &quot;GMT-03:30&quot; &quot;GMT-03:00&quot; &quot;GMT-02:00&quot; &quot;GMT-01:00&quot; &quot;GMT+00:00&quot;&quot;GMT+01:00&quot;&quot;GMT+02:00&quot;&quot;GMT+03:30&quot;&quot;GMT+04:00&quot;&quot;GMT+04:30&quot;&quot;GMT+05:00&quot;&quot;GMT+05:30&quot;&quot;GMT+05:45&quot;&quot;GMT+06:00&quot;&quot;GMT+06:30&quot;&quot;GMT+07:00&quot;&quot;GMT+08:00&quot;&quot;GMT+09:00&quot;&quot;GMT+09:30&quot;&quot;GMT+10:00&quot;&quot;GMT+10:30&quot;&quot;GMT+11:00&quot;&quot;GMT+11:30&quot;&quot;GMT+12:00&quot;&quot;GMT+12:45&quot;&quot;GMT+13:00&quot;&quot;GMT+14:00&quot;&quot;UTC-11:00&quot;&quot;UTC-10:00&quot;&quot;UTC-09:00&quot;&quot;UTC-08:00&quot;&quot;UTC-12:00&quot;&quot;UTC-07:00&quot;&quot;UTC-06:00&quot;&quot;UTC-05:00&quot;&quot;UTC-04:30&quot;&quot;UTC-04:00&quot;&quot;UTC-03:30&quot;&quot;UTC-03:00&quot;&quot;UTC-02:00&quot;&quot;UTC-01:00&quot;&quot;UTC+00:00&quot;&quot;UTC+01:00&quot;&quot;UTC+02:00&quot;&quot;UTC+03:00&quot;&quot;UTC+03:30&quot;&quot;UTC+04:00&quot;&quot;UTC+04:30&quot;&quot;UTC+05:00&quot;&quot;UTC+05:45&quot;&quot;UTC+06:00&quot;&quot;UTC+06:30&quot;&quot;UTC+07:00&quot;&quot;UTC+08:00&quot;&quot;UTC+09:00&quot;&quot;UTC+09:30&quot;&quot;UTC+10:00&quot;&quot;UTC+11:00&quot;&quot;UTC+12:00&quot;&quot;UTC+13:00&quot;</code></pre></p></li></ul>
     * @param TimeZone <p>时间字段时区。</p><ul><li><p>当DefaultTimeSwitch为false时， TimeZone不能为空。</p></li><li><p>时区格式规则<br>前缀：使用 GMT 或 UTC 作为时区基准<br>偏移量：</p><ul><li><code>-</code> 表示西时区（比基准时间晚）</li><li><code>+</code> 表示东时区（比基准时间早）</li><li>格式为 ±HH:MM（小时:分钟）</li></ul></li><li><p>当前支持：<br><pre><code>&quot;GMT-12:00&quot; &quot;GMT-11:00&quot; &quot;GMT-10:00&quot; &quot;GMT-09:30&quot; &quot;GMT-09:00&quot; &quot;GMT-08:00&quot; &quot;GMT-07:00&quot; &quot;GMT-06:00&quot; &quot;GMT-05:00&quot; &quot;GMT-04:00&quot; &quot;GMT-03:30&quot; &quot;GMT-03:00&quot; &quot;GMT-02:00&quot; &quot;GMT-01:00&quot; &quot;GMT+00:00&quot;&quot;GMT+01:00&quot;&quot;GMT+02:00&quot;&quot;GMT+03:30&quot;&quot;GMT+04:00&quot;&quot;GMT+04:30&quot;&quot;GMT+05:00&quot;&quot;GMT+05:30&quot;&quot;GMT+05:45&quot;&quot;GMT+06:00&quot;&quot;GMT+06:30&quot;&quot;GMT+07:00&quot;&quot;GMT+08:00&quot;&quot;GMT+09:00&quot;&quot;GMT+09:30&quot;&quot;GMT+10:00&quot;&quot;GMT+10:30&quot;&quot;GMT+11:00&quot;&quot;GMT+11:30&quot;&quot;GMT+12:00&quot;&quot;GMT+12:45&quot;&quot;GMT+13:00&quot;&quot;GMT+14:00&quot;&quot;UTC-11:00&quot;&quot;UTC-10:00&quot;&quot;UTC-09:00&quot;&quot;UTC-08:00&quot;&quot;UTC-12:00&quot;&quot;UTC-07:00&quot;&quot;UTC-06:00&quot;&quot;UTC-05:00&quot;&quot;UTC-04:30&quot;&quot;UTC-04:00&quot;&quot;UTC-03:30&quot;&quot;UTC-03:00&quot;&quot;UTC-02:00&quot;&quot;UTC-01:00&quot;&quot;UTC+00:00&quot;&quot;UTC+01:00&quot;&quot;UTC+02:00&quot;&quot;UTC+03:00&quot;&quot;UTC+03:30&quot;&quot;UTC+04:00&quot;&quot;UTC+04:30&quot;&quot;UTC+05:00&quot;&quot;UTC+05:45&quot;&quot;UTC+06:00&quot;&quot;UTC+06:30&quot;&quot;UTC+07:00&quot;&quot;UTC+08:00&quot;&quot;UTC+09:00&quot;&quot;UTC+09:30&quot;&quot;UTC+10:00&quot;&quot;UTC+11:00&quot;&quot;UTC+12:00&quot;&quot;UTC+13:00&quot;</code></pre></p></li></ul>
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get <p>元数据信息，Kafka导入支持kafka_topic,kafka_partition,kafka_offset,kafka_timestamp</p> 
     * @return Metadata <p>元数据信息，Kafka导入支持kafka_topic,kafka_partition,kafka_offset,kafka_timestamp</p>
     */
    public String [] getMetadata() {
        return this.Metadata;
    }

    /**
     * Set <p>元数据信息，Kafka导入支持kafka_topic,kafka_partition,kafka_offset,kafka_timestamp</p>
     * @param Metadata <p>元数据信息，Kafka导入支持kafka_topic,kafka_partition,kafka_offset,kafka_timestamp</p>
     */
    public void setMetadata(String [] Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get <p>日志Key列表，RechargeType为full_regex_log、delimiter_log时必填</p> 
     * @return Keys <p>日志Key列表，RechargeType为full_regex_log、delimiter_log时必填</p>
     */
    public String [] getKeys() {
        return this.Keys;
    }

    /**
     * Set <p>日志Key列表，RechargeType为full_regex_log、delimiter_log时必填</p>
     * @param Keys <p>日志Key列表，RechargeType为full_regex_log、delimiter_log时必填</p>
     */
    public void setKeys(String [] Keys) {
        this.Keys = Keys;
    }

    /**
     * Get <p>json解析模式，开启首层数据解析</p> 
     * @return ParseArray <p>json解析模式，开启首层数据解析</p>
     */
    public Boolean getParseArray() {
        return this.ParseArray;
    }

    /**
     * Set <p>json解析模式，开启首层数据解析</p>
     * @param ParseArray <p>json解析模式，开启首层数据解析</p>
     */
    public void setParseArray(Boolean ParseArray) {
        this.ParseArray = ParseArray;
    }

    /**
     * Get <p>分隔符解析模式-分隔符<br>当解析格式为分隔符提取时，该字段必填</p> 
     * @return Delimiter <p>分隔符解析模式-分隔符<br>当解析格式为分隔符提取时，该字段必填</p>
     */
    public String getDelimiter() {
        return this.Delimiter;
    }

    /**
     * Set <p>分隔符解析模式-分隔符<br>当解析格式为分隔符提取时，该字段必填</p>
     * @param Delimiter <p>分隔符解析模式-分隔符<br>当解析格式为分隔符提取时，该字段必填</p>
     */
    public void setDelimiter(String Delimiter) {
        this.Delimiter = Delimiter;
    }

    /**
     * Get <p>JSON嵌套展开配置。仅RechargeType为json_log时生效，不传表示不开启。</p> 
     * @return JsonExpand <p>JSON嵌套展开配置。仅RechargeType为json_log时生效，不传表示不开启。</p>
     */
    public JsonExpandInfo getJsonExpand() {
        return this.JsonExpand;
    }

    /**
     * Set <p>JSON嵌套展开配置。仅RechargeType为json_log时生效，不传表示不开启。</p>
     * @param JsonExpand <p>JSON嵌套展开配置。仅RechargeType为json_log时生效，不传表示不开启。</p>
     */
    public void setJsonExpand(JsonExpandInfo JsonExpand) {
        this.JsonExpand = JsonExpand;
    }

    public LogRechargeRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogRechargeRuleInfo(LogRechargeRuleInfo source) {
        if (source.RechargeType != null) {
            this.RechargeType = new String(source.RechargeType);
        }
        if (source.EncodingFormat != null) {
            this.EncodingFormat = new Long(source.EncodingFormat);
        }
        if (source.DefaultTimeSwitch != null) {
            this.DefaultTimeSwitch = new Boolean(source.DefaultTimeSwitch);
        }
        if (source.LogRegex != null) {
            this.LogRegex = new String(source.LogRegex);
        }
        if (source.UnMatchLogSwitch != null) {
            this.UnMatchLogSwitch = new Boolean(source.UnMatchLogSwitch);
        }
        if (source.UnMatchLogKey != null) {
            this.UnMatchLogKey = new String(source.UnMatchLogKey);
        }
        if (source.UnMatchLogTimeSrc != null) {
            this.UnMatchLogTimeSrc = new Long(source.UnMatchLogTimeSrc);
        }
        if (source.DefaultTimeSrc != null) {
            this.DefaultTimeSrc = new Long(source.DefaultTimeSrc);
        }
        if (source.TimeKey != null) {
            this.TimeKey = new String(source.TimeKey);
        }
        if (source.TimeRegex != null) {
            this.TimeRegex = new String(source.TimeRegex);
        }
        if (source.TimeFormat != null) {
            this.TimeFormat = new String(source.TimeFormat);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
        if (source.Metadata != null) {
            this.Metadata = new String[source.Metadata.length];
            for (int i = 0; i < source.Metadata.length; i++) {
                this.Metadata[i] = new String(source.Metadata[i]);
            }
        }
        if (source.Keys != null) {
            this.Keys = new String[source.Keys.length];
            for (int i = 0; i < source.Keys.length; i++) {
                this.Keys[i] = new String(source.Keys[i]);
            }
        }
        if (source.ParseArray != null) {
            this.ParseArray = new Boolean(source.ParseArray);
        }
        if (source.Delimiter != null) {
            this.Delimiter = new String(source.Delimiter);
        }
        if (source.JsonExpand != null) {
            this.JsonExpand = new JsonExpandInfo(source.JsonExpand);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RechargeType", this.RechargeType);
        this.setParamSimple(map, prefix + "EncodingFormat", this.EncodingFormat);
        this.setParamSimple(map, prefix + "DefaultTimeSwitch", this.DefaultTimeSwitch);
        this.setParamSimple(map, prefix + "LogRegex", this.LogRegex);
        this.setParamSimple(map, prefix + "UnMatchLogSwitch", this.UnMatchLogSwitch);
        this.setParamSimple(map, prefix + "UnMatchLogKey", this.UnMatchLogKey);
        this.setParamSimple(map, prefix + "UnMatchLogTimeSrc", this.UnMatchLogTimeSrc);
        this.setParamSimple(map, prefix + "DefaultTimeSrc", this.DefaultTimeSrc);
        this.setParamSimple(map, prefix + "TimeKey", this.TimeKey);
        this.setParamSimple(map, prefix + "TimeRegex", this.TimeRegex);
        this.setParamSimple(map, prefix + "TimeFormat", this.TimeFormat);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamArraySimple(map, prefix + "Metadata.", this.Metadata);
        this.setParamArraySimple(map, prefix + "Keys.", this.Keys);
        this.setParamSimple(map, prefix + "ParseArray", this.ParseArray);
        this.setParamSimple(map, prefix + "Delimiter", this.Delimiter);
        this.setParamObj(map, prefix + "JsonExpand.", this.JsonExpand);

    }
}

