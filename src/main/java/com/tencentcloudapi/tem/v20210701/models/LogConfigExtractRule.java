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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogConfigExtractRule extends AbstractModel{

    /**
    * 首行正则表达式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BeginningRegex")
    @Expose
    private String BeginningRegex;

    /**
    * 提取结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Keys")
    @Expose
    private String [] Keys;

    /**
    * 过滤键
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilterKeys")
    @Expose
    private String [] FilterKeys;

    /**
    * 过滤值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilterRegex")
    @Expose
    private String [] FilterRegex;

    /**
    * 日志正则表达式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogRegex")
    @Expose
    private String LogRegex;

    /**
    * 时间字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeKey")
    @Expose
    private String TimeKey;

    /**
    * 时间格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeFormat")
    @Expose
    private String TimeFormat;

    /**
    * 是否上传解析失败日志
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnMatchUpload")
    @Expose
    private String UnMatchUpload;

    /**
    * 解析失败日志的键名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnMatchedKey")
    @Expose
    private String UnMatchedKey;

    /**
     * Get 首行正则表达式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BeginningRegex 首行正则表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBeginningRegex() {
        return this.BeginningRegex;
    }

    /**
     * Set 首行正则表达式
注意：此字段可能返回 null，表示取不到有效值。
     * @param BeginningRegex 首行正则表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBeginningRegex(String BeginningRegex) {
        this.BeginningRegex = BeginningRegex;
    }

    /**
     * Get 提取结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Keys 提取结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getKeys() {
        return this.Keys;
    }

    /**
     * Set 提取结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param Keys 提取结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeys(String [] Keys) {
        this.Keys = Keys;
    }

    /**
     * Get 过滤键
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilterKeys 过滤键
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFilterKeys() {
        return this.FilterKeys;
    }

    /**
     * Set 过滤键
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilterKeys 过滤键
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilterKeys(String [] FilterKeys) {
        this.FilterKeys = FilterKeys;
    }

    /**
     * Get 过滤值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilterRegex 过滤值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFilterRegex() {
        return this.FilterRegex;
    }

    /**
     * Set 过滤值
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilterRegex 过滤值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilterRegex(String [] FilterRegex) {
        this.FilterRegex = FilterRegex;
    }

    /**
     * Get 日志正则表达式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogRegex 日志正则表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogRegex() {
        return this.LogRegex;
    }

    /**
     * Set 日志正则表达式
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogRegex 日志正则表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogRegex(String LogRegex) {
        this.LogRegex = LogRegex;
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
     * Get 时间格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeFormat 时间格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeFormat() {
        return this.TimeFormat;
    }

    /**
     * Set 时间格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeFormat 时间格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeFormat(String TimeFormat) {
        this.TimeFormat = TimeFormat;
    }

    /**
     * Get 是否上传解析失败日志
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnMatchUpload 是否上传解析失败日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUnMatchUpload() {
        return this.UnMatchUpload;
    }

    /**
     * Set 是否上传解析失败日志
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnMatchUpload 是否上传解析失败日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnMatchUpload(String UnMatchUpload) {
        this.UnMatchUpload = UnMatchUpload;
    }

    /**
     * Get 解析失败日志的键名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnMatchedKey 解析失败日志的键名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUnMatchedKey() {
        return this.UnMatchedKey;
    }

    /**
     * Set 解析失败日志的键名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnMatchedKey 解析失败日志的键名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnMatchedKey(String UnMatchedKey) {
        this.UnMatchedKey = UnMatchedKey;
    }

    public LogConfigExtractRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogConfigExtractRule(LogConfigExtractRule source) {
        if (source.BeginningRegex != null) {
            this.BeginningRegex = new String(source.BeginningRegex);
        }
        if (source.Keys != null) {
            this.Keys = new String[source.Keys.length];
            for (int i = 0; i < source.Keys.length; i++) {
                this.Keys[i] = new String(source.Keys[i]);
            }
        }
        if (source.FilterKeys != null) {
            this.FilterKeys = new String[source.FilterKeys.length];
            for (int i = 0; i < source.FilterKeys.length; i++) {
                this.FilterKeys[i] = new String(source.FilterKeys[i]);
            }
        }
        if (source.FilterRegex != null) {
            this.FilterRegex = new String[source.FilterRegex.length];
            for (int i = 0; i < source.FilterRegex.length; i++) {
                this.FilterRegex[i] = new String(source.FilterRegex[i]);
            }
        }
        if (source.LogRegex != null) {
            this.LogRegex = new String(source.LogRegex);
        }
        if (source.TimeKey != null) {
            this.TimeKey = new String(source.TimeKey);
        }
        if (source.TimeFormat != null) {
            this.TimeFormat = new String(source.TimeFormat);
        }
        if (source.UnMatchUpload != null) {
            this.UnMatchUpload = new String(source.UnMatchUpload);
        }
        if (source.UnMatchedKey != null) {
            this.UnMatchedKey = new String(source.UnMatchedKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginningRegex", this.BeginningRegex);
        this.setParamArraySimple(map, prefix + "Keys.", this.Keys);
        this.setParamArraySimple(map, prefix + "FilterKeys.", this.FilterKeys);
        this.setParamArraySimple(map, prefix + "FilterRegex.", this.FilterRegex);
        this.setParamSimple(map, prefix + "LogRegex", this.LogRegex);
        this.setParamSimple(map, prefix + "TimeKey", this.TimeKey);
        this.setParamSimple(map, prefix + "TimeFormat", this.TimeFormat);
        this.setParamSimple(map, prefix + "UnMatchUpload", this.UnMatchUpload);
        this.setParamSimple(map, prefix + "UnMatchedKey", this.UnMatchedKey);

    }
}

