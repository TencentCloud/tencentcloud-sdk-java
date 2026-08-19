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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogFormat extends AbstractModel {

    /**
    * <p>日志输出格式，取值有：</p><ul><li>json：使用预设日志输出格式 JSON Lines，单条日志中的字段以键值对方式呈现；</li><li>csv：使用预设日志输出格式 csv，单条日志中仅呈现字段值，不呈现字段名称。</li><li>template：使用用户自定义输出模板，单条日志中支持按照自定义模板进行自定义排版和拼接，需配合 RecordTemplate 字段使用。</li></ul>
    */
    @SerializedName("FormatType")
    @Expose
    private String FormatType;

    /**
    * <p>在每个日志投递批次之前添加的字符串。每个日志投递批次可能包含多条日志记录。</p>
    */
    @SerializedName("BatchPrefix")
    @Expose
    private String BatchPrefix;

    /**
    * <p>在每个日志投递批次后附加的字符串。</p>
    */
    @SerializedName("BatchSuffix")
    @Expose
    private String BatchSuffix;

    /**
    * <p>单条日志前缀，在每条日志记录之前添加的字符串。</p>
    */
    @SerializedName("RecordPrefix")
    @Expose
    private String RecordPrefix;

    /**
    * <p>单条日志后缀，在每条日志记录后附加的字符串。</p>
    */
    @SerializedName("RecordSuffix")
    @Expose
    private String RecordSuffix;

    /**
    * <p>日志分隔符，插入日志记录之间作为分隔的字符串，取值有：</p><ul><li>\n：换行符；</li><li>\t：制表符；</li><li>，：半角逗号。</li></ul>
    */
    @SerializedName("RecordDelimiter")
    @Expose
    private String RecordDelimiter;

    /**
    * <p>日志模板，单条日志的输出模板，长度限制 4KB，仅当 FormatType = template 生效。支持对配置的推送字段按照模板进行自定义排版和拼接。</p>
    */
    @SerializedName("RecordTemplate")
    @Expose
    private String RecordTemplate;

    /**
    * <p>字段分隔符，单条日志记录内，插入字段之间作为分隔符的字符串，仅当 FormatType = csv 生效。取值有：<ul><li>\t：制表符；</li><li>，：半角逗号；</li><li>;：半角分号。</li></ul></p>
    */
    @SerializedName("FieldDelimiter")
    @Expose
    private String FieldDelimiter;

    /**
     * Get <p>日志输出格式，取值有：</p><ul><li>json：使用预设日志输出格式 JSON Lines，单条日志中的字段以键值对方式呈现；</li><li>csv：使用预设日志输出格式 csv，单条日志中仅呈现字段值，不呈现字段名称。</li><li>template：使用用户自定义输出模板，单条日志中支持按照自定义模板进行自定义排版和拼接，需配合 RecordTemplate 字段使用。</li></ul> 
     * @return FormatType <p>日志输出格式，取值有：</p><ul><li>json：使用预设日志输出格式 JSON Lines，单条日志中的字段以键值对方式呈现；</li><li>csv：使用预设日志输出格式 csv，单条日志中仅呈现字段值，不呈现字段名称。</li><li>template：使用用户自定义输出模板，单条日志中支持按照自定义模板进行自定义排版和拼接，需配合 RecordTemplate 字段使用。</li></ul>
     */
    public String getFormatType() {
        return this.FormatType;
    }

    /**
     * Set <p>日志输出格式，取值有：</p><ul><li>json：使用预设日志输出格式 JSON Lines，单条日志中的字段以键值对方式呈现；</li><li>csv：使用预设日志输出格式 csv，单条日志中仅呈现字段值，不呈现字段名称。</li><li>template：使用用户自定义输出模板，单条日志中支持按照自定义模板进行自定义排版和拼接，需配合 RecordTemplate 字段使用。</li></ul>
     * @param FormatType <p>日志输出格式，取值有：</p><ul><li>json：使用预设日志输出格式 JSON Lines，单条日志中的字段以键值对方式呈现；</li><li>csv：使用预设日志输出格式 csv，单条日志中仅呈现字段值，不呈现字段名称。</li><li>template：使用用户自定义输出模板，单条日志中支持按照自定义模板进行自定义排版和拼接，需配合 RecordTemplate 字段使用。</li></ul>
     */
    public void setFormatType(String FormatType) {
        this.FormatType = FormatType;
    }

    /**
     * Get <p>在每个日志投递批次之前添加的字符串。每个日志投递批次可能包含多条日志记录。</p> 
     * @return BatchPrefix <p>在每个日志投递批次之前添加的字符串。每个日志投递批次可能包含多条日志记录。</p>
     */
    public String getBatchPrefix() {
        return this.BatchPrefix;
    }

    /**
     * Set <p>在每个日志投递批次之前添加的字符串。每个日志投递批次可能包含多条日志记录。</p>
     * @param BatchPrefix <p>在每个日志投递批次之前添加的字符串。每个日志投递批次可能包含多条日志记录。</p>
     */
    public void setBatchPrefix(String BatchPrefix) {
        this.BatchPrefix = BatchPrefix;
    }

    /**
     * Get <p>在每个日志投递批次后附加的字符串。</p> 
     * @return BatchSuffix <p>在每个日志投递批次后附加的字符串。</p>
     */
    public String getBatchSuffix() {
        return this.BatchSuffix;
    }

    /**
     * Set <p>在每个日志投递批次后附加的字符串。</p>
     * @param BatchSuffix <p>在每个日志投递批次后附加的字符串。</p>
     */
    public void setBatchSuffix(String BatchSuffix) {
        this.BatchSuffix = BatchSuffix;
    }

    /**
     * Get <p>单条日志前缀，在每条日志记录之前添加的字符串。</p> 
     * @return RecordPrefix <p>单条日志前缀，在每条日志记录之前添加的字符串。</p>
     */
    public String getRecordPrefix() {
        return this.RecordPrefix;
    }

    /**
     * Set <p>单条日志前缀，在每条日志记录之前添加的字符串。</p>
     * @param RecordPrefix <p>单条日志前缀，在每条日志记录之前添加的字符串。</p>
     */
    public void setRecordPrefix(String RecordPrefix) {
        this.RecordPrefix = RecordPrefix;
    }

    /**
     * Get <p>单条日志后缀，在每条日志记录后附加的字符串。</p> 
     * @return RecordSuffix <p>单条日志后缀，在每条日志记录后附加的字符串。</p>
     */
    public String getRecordSuffix() {
        return this.RecordSuffix;
    }

    /**
     * Set <p>单条日志后缀，在每条日志记录后附加的字符串。</p>
     * @param RecordSuffix <p>单条日志后缀，在每条日志记录后附加的字符串。</p>
     */
    public void setRecordSuffix(String RecordSuffix) {
        this.RecordSuffix = RecordSuffix;
    }

    /**
     * Get <p>日志分隔符，插入日志记录之间作为分隔的字符串，取值有：</p><ul><li>\n：换行符；</li><li>\t：制表符；</li><li>，：半角逗号。</li></ul> 
     * @return RecordDelimiter <p>日志分隔符，插入日志记录之间作为分隔的字符串，取值有：</p><ul><li>\n：换行符；</li><li>\t：制表符；</li><li>，：半角逗号。</li></ul>
     */
    public String getRecordDelimiter() {
        return this.RecordDelimiter;
    }

    /**
     * Set <p>日志分隔符，插入日志记录之间作为分隔的字符串，取值有：</p><ul><li>\n：换行符；</li><li>\t：制表符；</li><li>，：半角逗号。</li></ul>
     * @param RecordDelimiter <p>日志分隔符，插入日志记录之间作为分隔的字符串，取值有：</p><ul><li>\n：换行符；</li><li>\t：制表符；</li><li>，：半角逗号。</li></ul>
     */
    public void setRecordDelimiter(String RecordDelimiter) {
        this.RecordDelimiter = RecordDelimiter;
    }

    /**
     * Get <p>日志模板，单条日志的输出模板，长度限制 4KB，仅当 FormatType = template 生效。支持对配置的推送字段按照模板进行自定义排版和拼接。</p> 
     * @return RecordTemplate <p>日志模板，单条日志的输出模板，长度限制 4KB，仅当 FormatType = template 生效。支持对配置的推送字段按照模板进行自定义排版和拼接。</p>
     */
    public String getRecordTemplate() {
        return this.RecordTemplate;
    }

    /**
     * Set <p>日志模板，单条日志的输出模板，长度限制 4KB，仅当 FormatType = template 生效。支持对配置的推送字段按照模板进行自定义排版和拼接。</p>
     * @param RecordTemplate <p>日志模板，单条日志的输出模板，长度限制 4KB，仅当 FormatType = template 生效。支持对配置的推送字段按照模板进行自定义排版和拼接。</p>
     */
    public void setRecordTemplate(String RecordTemplate) {
        this.RecordTemplate = RecordTemplate;
    }

    /**
     * Get <p>字段分隔符，单条日志记录内，插入字段之间作为分隔符的字符串，仅当 FormatType = csv 生效。取值有：<ul><li>\t：制表符；</li><li>，：半角逗号；</li><li>;：半角分号。</li></ul></p> 
     * @return FieldDelimiter <p>字段分隔符，单条日志记录内，插入字段之间作为分隔符的字符串，仅当 FormatType = csv 生效。取值有：<ul><li>\t：制表符；</li><li>，：半角逗号；</li><li>;：半角分号。</li></ul></p>
     */
    public String getFieldDelimiter() {
        return this.FieldDelimiter;
    }

    /**
     * Set <p>字段分隔符，单条日志记录内，插入字段之间作为分隔符的字符串，仅当 FormatType = csv 生效。取值有：<ul><li>\t：制表符；</li><li>，：半角逗号；</li><li>;：半角分号。</li></ul></p>
     * @param FieldDelimiter <p>字段分隔符，单条日志记录内，插入字段之间作为分隔符的字符串，仅当 FormatType = csv 生效。取值有：<ul><li>\t：制表符；</li><li>，：半角逗号；</li><li>;：半角分号。</li></ul></p>
     */
    public void setFieldDelimiter(String FieldDelimiter) {
        this.FieldDelimiter = FieldDelimiter;
    }

    public LogFormat() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogFormat(LogFormat source) {
        if (source.FormatType != null) {
            this.FormatType = new String(source.FormatType);
        }
        if (source.BatchPrefix != null) {
            this.BatchPrefix = new String(source.BatchPrefix);
        }
        if (source.BatchSuffix != null) {
            this.BatchSuffix = new String(source.BatchSuffix);
        }
        if (source.RecordPrefix != null) {
            this.RecordPrefix = new String(source.RecordPrefix);
        }
        if (source.RecordSuffix != null) {
            this.RecordSuffix = new String(source.RecordSuffix);
        }
        if (source.RecordDelimiter != null) {
            this.RecordDelimiter = new String(source.RecordDelimiter);
        }
        if (source.RecordTemplate != null) {
            this.RecordTemplate = new String(source.RecordTemplate);
        }
        if (source.FieldDelimiter != null) {
            this.FieldDelimiter = new String(source.FieldDelimiter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FormatType", this.FormatType);
        this.setParamSimple(map, prefix + "BatchPrefix", this.BatchPrefix);
        this.setParamSimple(map, prefix + "BatchSuffix", this.BatchSuffix);
        this.setParamSimple(map, prefix + "RecordPrefix", this.RecordPrefix);
        this.setParamSimple(map, prefix + "RecordSuffix", this.RecordSuffix);
        this.setParamSimple(map, prefix + "RecordDelimiter", this.RecordDelimiter);
        this.setParamSimple(map, prefix + "RecordTemplate", this.RecordTemplate);
        this.setParamSimple(map, prefix + "FieldDelimiter", this.FieldDelimiter);

    }
}

