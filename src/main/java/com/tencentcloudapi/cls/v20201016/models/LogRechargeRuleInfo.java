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

public class LogRechargeRuleInfo extends AbstractModel{

    /**
    * 导入类型，支持json_log：json格式日志，minimalist_log: 单行全文，fullregex_log: 单行完全正则
    */
    @SerializedName("RechargeType")
    @Expose
    private String RechargeType;

    /**
    * 解析编码格式，0: UTF-8（默认值），1: GBK
    */
    @SerializedName("EncodingFormat")
    @Expose
    private Long EncodingFormat;

    /**
    * 使用默认时间，true：开启（默认值）， flase：关闭
    */
    @SerializedName("DefaultTimeSwitch")
    @Expose
    private Boolean DefaultTimeSwitch;

    /**
    * 整条日志匹配规则，只有RechargeType为fullregex_log时有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogRegex")
    @Expose
    private String LogRegex;

    /**
    * 解析失败日志是否上传，true表示上传，false表示不上传
    */
    @SerializedName("UnMatchLogSwitch")
    @Expose
    private Boolean UnMatchLogSwitch;

    /**
    * 解析失败日志的键名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnMatchLogKey")
    @Expose
    private String UnMatchLogKey;

    /**
    * 解析失败日志时间来源，0: 系统当前时间，1: Kafka消息时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnMatchLogTimeSrc")
    @Expose
    private Long UnMatchLogTimeSrc;

    /**
    * 默认时间来源，0: 系统当前时间，1: Kafka消息时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultTimeSrc")
    @Expose
    private Long DefaultTimeSrc;

    /**
    * 时间字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeKey")
    @Expose
    private String TimeKey;

    /**
    * 时间提取正则表达式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeRegex")
    @Expose
    private String TimeRegex;

    /**
    * 时间字段格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeFormat")
    @Expose
    private String TimeFormat;

    /**
    * 时间字段时区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * 元数据信息，Kafka导入支持kafka_topic,kafka_partition,kafka_offset,kafka_timestamp
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Metadata")
    @Expose
    private String [] Metadata;

    /**
    * 日志Key列表，RechargeType为full_regex_log时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Keys")
    @Expose
    private String [] Keys;

    /**
     * Get 导入类型，支持json_log：json格式日志，minimalist_log: 单行全文，fullregex_log: 单行完全正则 
     * @return RechargeType 导入类型，支持json_log：json格式日志，minimalist_log: 单行全文，fullregex_log: 单行完全正则
     */
    public String getRechargeType() {
        return this.RechargeType;
    }

    /**
     * Set 导入类型，支持json_log：json格式日志，minimalist_log: 单行全文，fullregex_log: 单行完全正则
     * @param RechargeType 导入类型，支持json_log：json格式日志，minimalist_log: 单行全文，fullregex_log: 单行完全正则
     */
    public void setRechargeType(String RechargeType) {
        this.RechargeType = RechargeType;
    }

    /**
     * Get 解析编码格式，0: UTF-8（默认值），1: GBK 
     * @return EncodingFormat 解析编码格式，0: UTF-8（默认值），1: GBK
     */
    public Long getEncodingFormat() {
        return this.EncodingFormat;
    }

    /**
     * Set 解析编码格式，0: UTF-8（默认值），1: GBK
     * @param EncodingFormat 解析编码格式，0: UTF-8（默认值），1: GBK
     */
    public void setEncodingFormat(Long EncodingFormat) {
        this.EncodingFormat = EncodingFormat;
    }

    /**
     * Get 使用默认时间，true：开启（默认值）， flase：关闭 
     * @return DefaultTimeSwitch 使用默认时间，true：开启（默认值）， flase：关闭
     */
    public Boolean getDefaultTimeSwitch() {
        return this.DefaultTimeSwitch;
    }

    /**
     * Set 使用默认时间，true：开启（默认值）， flase：关闭
     * @param DefaultTimeSwitch 使用默认时间，true：开启（默认值）， flase：关闭
     */
    public void setDefaultTimeSwitch(Boolean DefaultTimeSwitch) {
        this.DefaultTimeSwitch = DefaultTimeSwitch;
    }

    /**
     * Get 整条日志匹配规则，只有RechargeType为fullregex_log时有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogRegex 整条日志匹配规则，只有RechargeType为fullregex_log时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogRegex() {
        return this.LogRegex;
    }

    /**
     * Set 整条日志匹配规则，只有RechargeType为fullregex_log时有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogRegex 整条日志匹配规则，只有RechargeType为fullregex_log时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogRegex(String LogRegex) {
        this.LogRegex = LogRegex;
    }

    /**
     * Get 解析失败日志是否上传，true表示上传，false表示不上传 
     * @return UnMatchLogSwitch 解析失败日志是否上传，true表示上传，false表示不上传
     */
    public Boolean getUnMatchLogSwitch() {
        return this.UnMatchLogSwitch;
    }

    /**
     * Set 解析失败日志是否上传，true表示上传，false表示不上传
     * @param UnMatchLogSwitch 解析失败日志是否上传，true表示上传，false表示不上传
     */
    public void setUnMatchLogSwitch(Boolean UnMatchLogSwitch) {
        this.UnMatchLogSwitch = UnMatchLogSwitch;
    }

    /**
     * Get 解析失败日志的键名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnMatchLogKey 解析失败日志的键名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUnMatchLogKey() {
        return this.UnMatchLogKey;
    }

    /**
     * Set 解析失败日志的键名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnMatchLogKey 解析失败日志的键名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnMatchLogKey(String UnMatchLogKey) {
        this.UnMatchLogKey = UnMatchLogKey;
    }

    /**
     * Get 解析失败日志时间来源，0: 系统当前时间，1: Kafka消息时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnMatchLogTimeSrc 解析失败日志时间来源，0: 系统当前时间，1: Kafka消息时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUnMatchLogTimeSrc() {
        return this.UnMatchLogTimeSrc;
    }

    /**
     * Set 解析失败日志时间来源，0: 系统当前时间，1: Kafka消息时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnMatchLogTimeSrc 解析失败日志时间来源，0: 系统当前时间，1: Kafka消息时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnMatchLogTimeSrc(Long UnMatchLogTimeSrc) {
        this.UnMatchLogTimeSrc = UnMatchLogTimeSrc;
    }

    /**
     * Get 默认时间来源，0: 系统当前时间，1: Kafka消息时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultTimeSrc 默认时间来源，0: 系统当前时间，1: Kafka消息时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDefaultTimeSrc() {
        return this.DefaultTimeSrc;
    }

    /**
     * Set 默认时间来源，0: 系统当前时间，1: Kafka消息时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultTimeSrc 默认时间来源，0: 系统当前时间，1: Kafka消息时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultTimeSrc(Long DefaultTimeSrc) {
        this.DefaultTimeSrc = DefaultTimeSrc;
    }

    /**
     * Get 时间字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeKey 时间字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeKey() {
        return this.TimeKey;
    }

    /**
     * Set 时间字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeKey 时间字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeKey(String TimeKey) {
        this.TimeKey = TimeKey;
    }

    /**
     * Get 时间提取正则表达式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeRegex 时间提取正则表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeRegex() {
        return this.TimeRegex;
    }

    /**
     * Set 时间提取正则表达式
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeRegex 时间提取正则表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeRegex(String TimeRegex) {
        this.TimeRegex = TimeRegex;
    }

    /**
     * Get 时间字段格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeFormat 时间字段格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeFormat() {
        return this.TimeFormat;
    }

    /**
     * Set 时间字段格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeFormat 时间字段格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeFormat(String TimeFormat) {
        this.TimeFormat = TimeFormat;
    }

    /**
     * Get 时间字段时区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeZone 时间字段时区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set 时间字段时区
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeZone 时间字段时区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get 元数据信息，Kafka导入支持kafka_topic,kafka_partition,kafka_offset,kafka_timestamp
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Metadata 元数据信息，Kafka导入支持kafka_topic,kafka_partition,kafka_offset,kafka_timestamp
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getMetadata() {
        return this.Metadata;
    }

    /**
     * Set 元数据信息，Kafka导入支持kafka_topic,kafka_partition,kafka_offset,kafka_timestamp
注意：此字段可能返回 null，表示取不到有效值。
     * @param Metadata 元数据信息，Kafka导入支持kafka_topic,kafka_partition,kafka_offset,kafka_timestamp
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetadata(String [] Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get 日志Key列表，RechargeType为full_regex_log时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Keys 日志Key列表，RechargeType为full_regex_log时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getKeys() {
        return this.Keys;
    }

    /**
     * Set 日志Key列表，RechargeType为full_regex_log时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param Keys 日志Key列表，RechargeType为full_regex_log时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeys(String [] Keys) {
        this.Keys = Keys;
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

    }
}

