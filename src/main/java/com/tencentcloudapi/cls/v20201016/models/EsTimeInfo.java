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

public class EsTimeInfo extends AbstractModel {

    /**
    * 时间类型 1: 日志采集时间 2: 指定日志字段
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 日志时间字段。

时间类型为 2: 指定日志字段时必填
    */
    @SerializedName("TimeKey")
    @Expose
    private String TimeKey;

    /**
    * 日志时间格式。

时间类型为 2: 指定日志字段时必填
    */
    @SerializedName("TimeFormat")
    @Expose
    private String TimeFormat;

    /**
    * 时间字段时区。

时间类型为 2: 指定日志字段时必填
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
     * Get 时间类型 1: 日志采集时间 2: 指定日志字段 
     * @return Type 时间类型 1: 日志采集时间 2: 指定日志字段
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 时间类型 1: 日志采集时间 2: 指定日志字段
     * @param Type 时间类型 1: 日志采集时间 2: 指定日志字段
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 日志时间字段。

时间类型为 2: 指定日志字段时必填 
     * @return TimeKey 日志时间字段。

时间类型为 2: 指定日志字段时必填
     */
    public String getTimeKey() {
        return this.TimeKey;
    }

    /**
     * Set 日志时间字段。

时间类型为 2: 指定日志字段时必填
     * @param TimeKey 日志时间字段。

时间类型为 2: 指定日志字段时必填
     */
    public void setTimeKey(String TimeKey) {
        this.TimeKey = TimeKey;
    }

    /**
     * Get 日志时间格式。

时间类型为 2: 指定日志字段时必填 
     * @return TimeFormat 日志时间格式。

时间类型为 2: 指定日志字段时必填
     */
    public String getTimeFormat() {
        return this.TimeFormat;
    }

    /**
     * Set 日志时间格式。

时间类型为 2: 指定日志字段时必填
     * @param TimeFormat 日志时间格式。

时间类型为 2: 指定日志字段时必填
     */
    public void setTimeFormat(String TimeFormat) {
        this.TimeFormat = TimeFormat;
    }

    /**
     * Get 时间字段时区。

时间类型为 2: 指定日志字段时必填 
     * @return TimeZone 时间字段时区。

时间类型为 2: 指定日志字段时必填
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set 时间字段时区。

时间类型为 2: 指定日志字段时必填
     * @param TimeZone 时间字段时区。

时间类型为 2: 指定日志字段时必填
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    public EsTimeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EsTimeInfo(EsTimeInfo source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.TimeKey != null) {
            this.TimeKey = new String(source.TimeKey);
        }
        if (source.TimeFormat != null) {
            this.TimeFormat = new String(source.TimeFormat);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TimeKey", this.TimeKey);
        this.setParamSimple(map, prefix + "TimeFormat", this.TimeFormat);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);

    }
}

