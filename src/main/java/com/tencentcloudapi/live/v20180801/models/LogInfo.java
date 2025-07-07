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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogInfo extends AbstractModel {

    /**
    * 日志名称。
    */
    @SerializedName("LogName")
    @Expose
    private String LogName;

    /**
    * 日志 URL。
    */
    @SerializedName("LogUrl")
    @Expose
    private String LogUrl;

    /**
    * 日志生成时间。
注：此字段为北京时间（UTC+8时区）。
    */
    @SerializedName("LogTime")
    @Expose
    private String LogTime;

    /**
    * 文件大小。
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
     * Get 日志名称。 
     * @return LogName 日志名称。
     */
    public String getLogName() {
        return this.LogName;
    }

    /**
     * Set 日志名称。
     * @param LogName 日志名称。
     */
    public void setLogName(String LogName) {
        this.LogName = LogName;
    }

    /**
     * Get 日志 URL。 
     * @return LogUrl 日志 URL。
     */
    public String getLogUrl() {
        return this.LogUrl;
    }

    /**
     * Set 日志 URL。
     * @param LogUrl 日志 URL。
     */
    public void setLogUrl(String LogUrl) {
        this.LogUrl = LogUrl;
    }

    /**
     * Get 日志生成时间。
注：此字段为北京时间（UTC+8时区）。 
     * @return LogTime 日志生成时间。
注：此字段为北京时间（UTC+8时区）。
     */
    public String getLogTime() {
        return this.LogTime;
    }

    /**
     * Set 日志生成时间。
注：此字段为北京时间（UTC+8时区）。
     * @param LogTime 日志生成时间。
注：此字段为北京时间（UTC+8时区）。
     */
    public void setLogTime(String LogTime) {
        this.LogTime = LogTime;
    }

    /**
     * Get 文件大小。 
     * @return FileSize 文件大小。
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文件大小。
     * @param FileSize 文件大小。
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    public LogInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogInfo(LogInfo source) {
        if (source.LogName != null) {
            this.LogName = new String(source.LogName);
        }
        if (source.LogUrl != null) {
            this.LogUrl = new String(source.LogUrl);
        }
        if (source.LogTime != null) {
            this.LogTime = new String(source.LogTime);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogName", this.LogName);
        this.setParamSimple(map, prefix + "LogUrl", this.LogUrl);
        this.setParamSimple(map, prefix + "LogTime", this.LogTime);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);

    }
}

