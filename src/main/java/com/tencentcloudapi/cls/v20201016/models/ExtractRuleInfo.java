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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtractRuleInfo extends AbstractModel{

    /**
    * 时间字段的key名字，time_key和time_format必须成对出现
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeKey")
    @Expose
    private String TimeKey;

    /**
    * 时间字段的格式，参考c语言的strftime函数对于时间的格式说明输出参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeFormat")
    @Expose
    private String TimeFormat;

    /**
    * 分隔符类型日志的分隔符，只有log_type为delimiter_log时有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Delimiter")
    @Expose
    private String Delimiter;

    /**
    * 整条日志匹配规则，只有log_type为fullregex_log时有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogRegex")
    @Expose
    private String LogRegex;

    /**
    * 行首匹配规则，只有log_type为multiline_log或fullregex_log时有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BeginRegex")
    @Expose
    private String BeginRegex;

    /**
    * 取的每个字段的key名字，为空的key代表丢弃这个字段，只有log_type为delimiter_log时有效，json_log的日志使用json本身的key。限制100个。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Keys")
    @Expose
    private String [] Keys;

    /**
    * 需要过滤日志的key，及其对应的regex
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilterKeyRegex")
    @Expose
    private KeyRegexInfo [] FilterKeyRegex;

    /**
    * 解析失败日志是否上传，true表示上传，false表示不上传
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnMatchUpLoadSwitch")
    @Expose
    private Boolean UnMatchUpLoadSwitch;

    /**
    * 失败日志的key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnMatchLogKey")
    @Expose
    private String UnMatchLogKey;

    /**
    * 增量采集模式下的回溯数据量，默认-1（全量采集）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Backtracking")
    @Expose
    private Long Backtracking;

    /**
    * 是否为Gbk编码.   0: 否, 1: 是
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsGBK")
    @Expose
    private Long IsGBK;

    /**
    * 是否为标准json.   0: 否, 1: 是
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JsonStandard")
    @Expose
    private Long JsonStandard;

    /**
    * syslog传输协议，取值为tcp或者udp。
该字段适用于：创建采集规则配置、修改采集规则配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * syslog系统日志采集指定采集器监听的地址和端口 ，形式：[ip]:[port]。举例：127.0.0.1:9000
该字段适用于：创建采集规则配置、修改采集规则配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * rfc3164：指定系统日志采集使用RFC3164协议解析日志。
rfc5424：指定系统日志采集使用RFC5424协议解析日志。
auto：自动匹配rfc3164或者rfc5424其中一种协议
该字段适用于：创建采集规则配置、修改采集规则配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParseProtocol")
    @Expose
    private String ParseProtocol;

    /**
    * 元数据类型，0: 不使用元数据信息，1:使用机器组元数据，2:使用用户自定义元数据，3:使用采集配置路径，
    */
    @SerializedName("MetadataType")
    @Expose
    private Long MetadataType;

    /**
    * 采集配置路径正则表达式，MetadataType为3时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PathRegex")
    @Expose
    private String PathRegex;

    /**
    * 用户自定义元数据信息，MetadataType为2时必填
    */
    @SerializedName("MetaTags")
    @Expose
    private MetaTagInfo [] MetaTags;

    /**
    * windows事件日志采集
    */
    @SerializedName("EventLogRules")
    @Expose
    private EventLog [] EventLogRules;

    /**
     * Get 时间字段的key名字，time_key和time_format必须成对出现
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeKey 时间字段的key名字，time_key和time_format必须成对出现
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeKey() {
        return this.TimeKey;
    }

    /**
     * Set 时间字段的key名字，time_key和time_format必须成对出现
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeKey 时间字段的key名字，time_key和time_format必须成对出现
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeKey(String TimeKey) {
        this.TimeKey = TimeKey;
    }

    /**
     * Get 时间字段的格式，参考c语言的strftime函数对于时间的格式说明输出参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeFormat 时间字段的格式，参考c语言的strftime函数对于时间的格式说明输出参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeFormat() {
        return this.TimeFormat;
    }

    /**
     * Set 时间字段的格式，参考c语言的strftime函数对于时间的格式说明输出参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeFormat 时间字段的格式，参考c语言的strftime函数对于时间的格式说明输出参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeFormat(String TimeFormat) {
        this.TimeFormat = TimeFormat;
    }

    /**
     * Get 分隔符类型日志的分隔符，只有log_type为delimiter_log时有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Delimiter 分隔符类型日志的分隔符，只有log_type为delimiter_log时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDelimiter() {
        return this.Delimiter;
    }

    /**
     * Set 分隔符类型日志的分隔符，只有log_type为delimiter_log时有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param Delimiter 分隔符类型日志的分隔符，只有log_type为delimiter_log时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDelimiter(String Delimiter) {
        this.Delimiter = Delimiter;
    }

    /**
     * Get 整条日志匹配规则，只有log_type为fullregex_log时有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogRegex 整条日志匹配规则，只有log_type为fullregex_log时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogRegex() {
        return this.LogRegex;
    }

    /**
     * Set 整条日志匹配规则，只有log_type为fullregex_log时有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogRegex 整条日志匹配规则，只有log_type为fullregex_log时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogRegex(String LogRegex) {
        this.LogRegex = LogRegex;
    }

    /**
     * Get 行首匹配规则，只有log_type为multiline_log或fullregex_log时有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BeginRegex 行首匹配规则，只有log_type为multiline_log或fullregex_log时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBeginRegex() {
        return this.BeginRegex;
    }

    /**
     * Set 行首匹配规则，只有log_type为multiline_log或fullregex_log时有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param BeginRegex 行首匹配规则，只有log_type为multiline_log或fullregex_log时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBeginRegex(String BeginRegex) {
        this.BeginRegex = BeginRegex;
    }

    /**
     * Get 取的每个字段的key名字，为空的key代表丢弃这个字段，只有log_type为delimiter_log时有效，json_log的日志使用json本身的key。限制100个。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Keys 取的每个字段的key名字，为空的key代表丢弃这个字段，只有log_type为delimiter_log时有效，json_log的日志使用json本身的key。限制100个。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getKeys() {
        return this.Keys;
    }

    /**
     * Set 取的每个字段的key名字，为空的key代表丢弃这个字段，只有log_type为delimiter_log时有效，json_log的日志使用json本身的key。限制100个。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Keys 取的每个字段的key名字，为空的key代表丢弃这个字段，只有log_type为delimiter_log时有效，json_log的日志使用json本身的key。限制100个。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeys(String [] Keys) {
        this.Keys = Keys;
    }

    /**
     * Get 需要过滤日志的key，及其对应的regex
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilterKeyRegex 需要过滤日志的key，及其对应的regex
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyRegexInfo [] getFilterKeyRegex() {
        return this.FilterKeyRegex;
    }

    /**
     * Set 需要过滤日志的key，及其对应的regex
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilterKeyRegex 需要过滤日志的key，及其对应的regex
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilterKeyRegex(KeyRegexInfo [] FilterKeyRegex) {
        this.FilterKeyRegex = FilterKeyRegex;
    }

    /**
     * Get 解析失败日志是否上传，true表示上传，false表示不上传
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnMatchUpLoadSwitch 解析失败日志是否上传，true表示上传，false表示不上传
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getUnMatchUpLoadSwitch() {
        return this.UnMatchUpLoadSwitch;
    }

    /**
     * Set 解析失败日志是否上传，true表示上传，false表示不上传
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnMatchUpLoadSwitch 解析失败日志是否上传，true表示上传，false表示不上传
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnMatchUpLoadSwitch(Boolean UnMatchUpLoadSwitch) {
        this.UnMatchUpLoadSwitch = UnMatchUpLoadSwitch;
    }

    /**
     * Get 失败日志的key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnMatchLogKey 失败日志的key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUnMatchLogKey() {
        return this.UnMatchLogKey;
    }

    /**
     * Set 失败日志的key
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnMatchLogKey 失败日志的key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnMatchLogKey(String UnMatchLogKey) {
        this.UnMatchLogKey = UnMatchLogKey;
    }

    /**
     * Get 增量采集模式下的回溯数据量，默认-1（全量采集）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Backtracking 增量采集模式下的回溯数据量，默认-1（全量采集）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBacktracking() {
        return this.Backtracking;
    }

    /**
     * Set 增量采集模式下的回溯数据量，默认-1（全量采集）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Backtracking 增量采集模式下的回溯数据量，默认-1（全量采集）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBacktracking(Long Backtracking) {
        this.Backtracking = Backtracking;
    }

    /**
     * Get 是否为Gbk编码.   0: 否, 1: 是
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsGBK 是否为Gbk编码.   0: 否, 1: 是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsGBK() {
        return this.IsGBK;
    }

    /**
     * Set 是否为Gbk编码.   0: 否, 1: 是
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsGBK 是否为Gbk编码.   0: 否, 1: 是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsGBK(Long IsGBK) {
        this.IsGBK = IsGBK;
    }

    /**
     * Get 是否为标准json.   0: 否, 1: 是
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JsonStandard 是否为标准json.   0: 否, 1: 是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getJsonStandard() {
        return this.JsonStandard;
    }

    /**
     * Set 是否为标准json.   0: 否, 1: 是
注意：此字段可能返回 null，表示取不到有效值。
     * @param JsonStandard 是否为标准json.   0: 否, 1: 是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJsonStandard(Long JsonStandard) {
        this.JsonStandard = JsonStandard;
    }

    /**
     * Get syslog传输协议，取值为tcp或者udp。
该字段适用于：创建采集规则配置、修改采集规则配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol syslog传输协议，取值为tcp或者udp。
该字段适用于：创建采集规则配置、修改采集规则配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set syslog传输协议，取值为tcp或者udp。
该字段适用于：创建采集规则配置、修改采集规则配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol syslog传输协议，取值为tcp或者udp。
该字段适用于：创建采集规则配置、修改采集规则配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get syslog系统日志采集指定采集器监听的地址和端口 ，形式：[ip]:[port]。举例：127.0.0.1:9000
该字段适用于：创建采集规则配置、修改采集规则配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Address syslog系统日志采集指定采集器监听的地址和端口 ，形式：[ip]:[port]。举例：127.0.0.1:9000
该字段适用于：创建采集规则配置、修改采集规则配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set syslog系统日志采集指定采集器监听的地址和端口 ，形式：[ip]:[port]。举例：127.0.0.1:9000
该字段适用于：创建采集规则配置、修改采集规则配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Address syslog系统日志采集指定采集器监听的地址和端口 ，形式：[ip]:[port]。举例：127.0.0.1:9000
该字段适用于：创建采集规则配置、修改采集规则配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get rfc3164：指定系统日志采集使用RFC3164协议解析日志。
rfc5424：指定系统日志采集使用RFC5424协议解析日志。
auto：自动匹配rfc3164或者rfc5424其中一种协议
该字段适用于：创建采集规则配置、修改采集规则配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParseProtocol rfc3164：指定系统日志采集使用RFC3164协议解析日志。
rfc5424：指定系统日志采集使用RFC5424协议解析日志。
auto：自动匹配rfc3164或者rfc5424其中一种协议
该字段适用于：创建采集规则配置、修改采集规则配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParseProtocol() {
        return this.ParseProtocol;
    }

    /**
     * Set rfc3164：指定系统日志采集使用RFC3164协议解析日志。
rfc5424：指定系统日志采集使用RFC5424协议解析日志。
auto：自动匹配rfc3164或者rfc5424其中一种协议
该字段适用于：创建采集规则配置、修改采集规则配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParseProtocol rfc3164：指定系统日志采集使用RFC3164协议解析日志。
rfc5424：指定系统日志采集使用RFC5424协议解析日志。
auto：自动匹配rfc3164或者rfc5424其中一种协议
该字段适用于：创建采集规则配置、修改采集规则配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParseProtocol(String ParseProtocol) {
        this.ParseProtocol = ParseProtocol;
    }

    /**
     * Get 元数据类型，0: 不使用元数据信息，1:使用机器组元数据，2:使用用户自定义元数据，3:使用采集配置路径， 
     * @return MetadataType 元数据类型，0: 不使用元数据信息，1:使用机器组元数据，2:使用用户自定义元数据，3:使用采集配置路径，
     */
    public Long getMetadataType() {
        return this.MetadataType;
    }

    /**
     * Set 元数据类型，0: 不使用元数据信息，1:使用机器组元数据，2:使用用户自定义元数据，3:使用采集配置路径，
     * @param MetadataType 元数据类型，0: 不使用元数据信息，1:使用机器组元数据，2:使用用户自定义元数据，3:使用采集配置路径，
     */
    public void setMetadataType(Long MetadataType) {
        this.MetadataType = MetadataType;
    }

    /**
     * Get 采集配置路径正则表达式，MetadataType为3时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PathRegex 采集配置路径正则表达式，MetadataType为3时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPathRegex() {
        return this.PathRegex;
    }

    /**
     * Set 采集配置路径正则表达式，MetadataType为3时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param PathRegex 采集配置路径正则表达式，MetadataType为3时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPathRegex(String PathRegex) {
        this.PathRegex = PathRegex;
    }

    /**
     * Get 用户自定义元数据信息，MetadataType为2时必填 
     * @return MetaTags 用户自定义元数据信息，MetadataType为2时必填
     */
    public MetaTagInfo [] getMetaTags() {
        return this.MetaTags;
    }

    /**
     * Set 用户自定义元数据信息，MetadataType为2时必填
     * @param MetaTags 用户自定义元数据信息，MetadataType为2时必填
     */
    public void setMetaTags(MetaTagInfo [] MetaTags) {
        this.MetaTags = MetaTags;
    }

    /**
     * Get windows事件日志采集 
     * @return EventLogRules windows事件日志采集
     */
    public EventLog [] getEventLogRules() {
        return this.EventLogRules;
    }

    /**
     * Set windows事件日志采集
     * @param EventLogRules windows事件日志采集
     */
    public void setEventLogRules(EventLog [] EventLogRules) {
        this.EventLogRules = EventLogRules;
    }

    public ExtractRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtractRuleInfo(ExtractRuleInfo source) {
        if (source.TimeKey != null) {
            this.TimeKey = new String(source.TimeKey);
        }
        if (source.TimeFormat != null) {
            this.TimeFormat = new String(source.TimeFormat);
        }
        if (source.Delimiter != null) {
            this.Delimiter = new String(source.Delimiter);
        }
        if (source.LogRegex != null) {
            this.LogRegex = new String(source.LogRegex);
        }
        if (source.BeginRegex != null) {
            this.BeginRegex = new String(source.BeginRegex);
        }
        if (source.Keys != null) {
            this.Keys = new String[source.Keys.length];
            for (int i = 0; i < source.Keys.length; i++) {
                this.Keys[i] = new String(source.Keys[i]);
            }
        }
        if (source.FilterKeyRegex != null) {
            this.FilterKeyRegex = new KeyRegexInfo[source.FilterKeyRegex.length];
            for (int i = 0; i < source.FilterKeyRegex.length; i++) {
                this.FilterKeyRegex[i] = new KeyRegexInfo(source.FilterKeyRegex[i]);
            }
        }
        if (source.UnMatchUpLoadSwitch != null) {
            this.UnMatchUpLoadSwitch = new Boolean(source.UnMatchUpLoadSwitch);
        }
        if (source.UnMatchLogKey != null) {
            this.UnMatchLogKey = new String(source.UnMatchLogKey);
        }
        if (source.Backtracking != null) {
            this.Backtracking = new Long(source.Backtracking);
        }
        if (source.IsGBK != null) {
            this.IsGBK = new Long(source.IsGBK);
        }
        if (source.JsonStandard != null) {
            this.JsonStandard = new Long(source.JsonStandard);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.ParseProtocol != null) {
            this.ParseProtocol = new String(source.ParseProtocol);
        }
        if (source.MetadataType != null) {
            this.MetadataType = new Long(source.MetadataType);
        }
        if (source.PathRegex != null) {
            this.PathRegex = new String(source.PathRegex);
        }
        if (source.MetaTags != null) {
            this.MetaTags = new MetaTagInfo[source.MetaTags.length];
            for (int i = 0; i < source.MetaTags.length; i++) {
                this.MetaTags[i] = new MetaTagInfo(source.MetaTags[i]);
            }
        }
        if (source.EventLogRules != null) {
            this.EventLogRules = new EventLog[source.EventLogRules.length];
            for (int i = 0; i < source.EventLogRules.length; i++) {
                this.EventLogRules[i] = new EventLog(source.EventLogRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeKey", this.TimeKey);
        this.setParamSimple(map, prefix + "TimeFormat", this.TimeFormat);
        this.setParamSimple(map, prefix + "Delimiter", this.Delimiter);
        this.setParamSimple(map, prefix + "LogRegex", this.LogRegex);
        this.setParamSimple(map, prefix + "BeginRegex", this.BeginRegex);
        this.setParamArraySimple(map, prefix + "Keys.", this.Keys);
        this.setParamArrayObj(map, prefix + "FilterKeyRegex.", this.FilterKeyRegex);
        this.setParamSimple(map, prefix + "UnMatchUpLoadSwitch", this.UnMatchUpLoadSwitch);
        this.setParamSimple(map, prefix + "UnMatchLogKey", this.UnMatchLogKey);
        this.setParamSimple(map, prefix + "Backtracking", this.Backtracking);
        this.setParamSimple(map, prefix + "IsGBK", this.IsGBK);
        this.setParamSimple(map, prefix + "JsonStandard", this.JsonStandard);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "ParseProtocol", this.ParseProtocol);
        this.setParamSimple(map, prefix + "MetadataType", this.MetadataType);
        this.setParamSimple(map, prefix + "PathRegex", this.PathRegex);
        this.setParamArrayObj(map, prefix + "MetaTags.", this.MetaTags);
        this.setParamArrayObj(map, prefix + "EventLogRules.", this.EventLogRules);

    }
}

