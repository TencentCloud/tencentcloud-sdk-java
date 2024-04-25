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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogFormat extends AbstractModel {

    /**
    * 日志投递的预设输出格式类型，取值有：
<li>json：使用预设日志输出格式 JSON Lines，单条日志中的字段以键值对方式呈现；</li>
<li>csv：使用预设日志输出格式 csv，单条日志中仅呈现字段值，不呈现字段名称。</li>
    */
    @SerializedName("FormatType")
    @Expose
    private String FormatType;

    /**
    * 在每个日志投递批次之前添加的字符串。每个日志投递批次可能包含多条日志记录。
    */
    @SerializedName("BatchPrefix")
    @Expose
    private String BatchPrefix;

    /**
    * 在每个日志投递批次后附加的字符串。
    */
    @SerializedName("BatchSuffix")
    @Expose
    private String BatchSuffix;

    /**
    * 在每条日志记录之前添加的字符串。
    */
    @SerializedName("RecordPrefix")
    @Expose
    private String RecordPrefix;

    /**
    * 在每条日志记录后附加的字符串。
    */
    @SerializedName("RecordSuffix")
    @Expose
    private String RecordSuffix;

    /**
    * 插入日志记录之间作为分隔符的字符串，取值有：
<li>\n：换行符；</li>
<li>\t：制表符；</li>
<li>，：半角逗号。</li>
    */
    @SerializedName("RecordDelimiter")
    @Expose
    private String RecordDelimiter;

    /**
    * 单条日志记录内，插入字段之间作为分隔符的字符串，取值有：
<li>\t：制表符；</li>
<li>，：半角逗号；</li>
<li>;：半角分号。</li>
    */
    @SerializedName("FieldDelimiter")
    @Expose
    private String FieldDelimiter;

    /**
     * Get 日志投递的预设输出格式类型，取值有：
<li>json：使用预设日志输出格式 JSON Lines，单条日志中的字段以键值对方式呈现；</li>
<li>csv：使用预设日志输出格式 csv，单条日志中仅呈现字段值，不呈现字段名称。</li> 
     * @return FormatType 日志投递的预设输出格式类型，取值有：
<li>json：使用预设日志输出格式 JSON Lines，单条日志中的字段以键值对方式呈现；</li>
<li>csv：使用预设日志输出格式 csv，单条日志中仅呈现字段值，不呈现字段名称。</li>
     */
    public String getFormatType() {
        return this.FormatType;
    }

    /**
     * Set 日志投递的预设输出格式类型，取值有：
<li>json：使用预设日志输出格式 JSON Lines，单条日志中的字段以键值对方式呈现；</li>
<li>csv：使用预设日志输出格式 csv，单条日志中仅呈现字段值，不呈现字段名称。</li>
     * @param FormatType 日志投递的预设输出格式类型，取值有：
<li>json：使用预设日志输出格式 JSON Lines，单条日志中的字段以键值对方式呈现；</li>
<li>csv：使用预设日志输出格式 csv，单条日志中仅呈现字段值，不呈现字段名称。</li>
     */
    public void setFormatType(String FormatType) {
        this.FormatType = FormatType;
    }

    /**
     * Get 在每个日志投递批次之前添加的字符串。每个日志投递批次可能包含多条日志记录。 
     * @return BatchPrefix 在每个日志投递批次之前添加的字符串。每个日志投递批次可能包含多条日志记录。
     */
    public String getBatchPrefix() {
        return this.BatchPrefix;
    }

    /**
     * Set 在每个日志投递批次之前添加的字符串。每个日志投递批次可能包含多条日志记录。
     * @param BatchPrefix 在每个日志投递批次之前添加的字符串。每个日志投递批次可能包含多条日志记录。
     */
    public void setBatchPrefix(String BatchPrefix) {
        this.BatchPrefix = BatchPrefix;
    }

    /**
     * Get 在每个日志投递批次后附加的字符串。 
     * @return BatchSuffix 在每个日志投递批次后附加的字符串。
     */
    public String getBatchSuffix() {
        return this.BatchSuffix;
    }

    /**
     * Set 在每个日志投递批次后附加的字符串。
     * @param BatchSuffix 在每个日志投递批次后附加的字符串。
     */
    public void setBatchSuffix(String BatchSuffix) {
        this.BatchSuffix = BatchSuffix;
    }

    /**
     * Get 在每条日志记录之前添加的字符串。 
     * @return RecordPrefix 在每条日志记录之前添加的字符串。
     */
    public String getRecordPrefix() {
        return this.RecordPrefix;
    }

    /**
     * Set 在每条日志记录之前添加的字符串。
     * @param RecordPrefix 在每条日志记录之前添加的字符串。
     */
    public void setRecordPrefix(String RecordPrefix) {
        this.RecordPrefix = RecordPrefix;
    }

    /**
     * Get 在每条日志记录后附加的字符串。 
     * @return RecordSuffix 在每条日志记录后附加的字符串。
     */
    public String getRecordSuffix() {
        return this.RecordSuffix;
    }

    /**
     * Set 在每条日志记录后附加的字符串。
     * @param RecordSuffix 在每条日志记录后附加的字符串。
     */
    public void setRecordSuffix(String RecordSuffix) {
        this.RecordSuffix = RecordSuffix;
    }

    /**
     * Get 插入日志记录之间作为分隔符的字符串，取值有：
<li>\n：换行符；</li>
<li>\t：制表符；</li>
<li>，：半角逗号。</li> 
     * @return RecordDelimiter 插入日志记录之间作为分隔符的字符串，取值有：
<li>\n：换行符；</li>
<li>\t：制表符；</li>
<li>，：半角逗号。</li>
     */
    public String getRecordDelimiter() {
        return this.RecordDelimiter;
    }

    /**
     * Set 插入日志记录之间作为分隔符的字符串，取值有：
<li>\n：换行符；</li>
<li>\t：制表符；</li>
<li>，：半角逗号。</li>
     * @param RecordDelimiter 插入日志记录之间作为分隔符的字符串，取值有：
<li>\n：换行符；</li>
<li>\t：制表符；</li>
<li>，：半角逗号。</li>
     */
    public void setRecordDelimiter(String RecordDelimiter) {
        this.RecordDelimiter = RecordDelimiter;
    }

    /**
     * Get 单条日志记录内，插入字段之间作为分隔符的字符串，取值有：
<li>\t：制表符；</li>
<li>，：半角逗号；</li>
<li>;：半角分号。</li> 
     * @return FieldDelimiter 单条日志记录内，插入字段之间作为分隔符的字符串，取值有：
<li>\t：制表符；</li>
<li>，：半角逗号；</li>
<li>;：半角分号。</li>
     */
    public String getFieldDelimiter() {
        return this.FieldDelimiter;
    }

    /**
     * Set 单条日志记录内，插入字段之间作为分隔符的字符串，取值有：
<li>\t：制表符；</li>
<li>，：半角逗号；</li>
<li>;：半角分号。</li>
     * @param FieldDelimiter 单条日志记录内，插入字段之间作为分隔符的字符串，取值有：
<li>\t：制表符；</li>
<li>，：半角逗号；</li>
<li>;：半角分号。</li>
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
        this.setParamSimple(map, prefix + "FieldDelimiter", this.FieldDelimiter);

    }
}

