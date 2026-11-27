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
    * <p>日志名称。</p>
    */
    @SerializedName("LogName")
    @Expose
    private String LogName;

    /**
    * <p>日志 URL。</p>
    */
    @SerializedName("LogUrl")
    @Expose
    private String LogUrl;

    /**
    * <p>日志生成时间。<br>注：此字段为北京时间（UTC+8时区）。</p>
    */
    @SerializedName("LogTime")
    @Expose
    private String LogTime;

    /**
    * <p>文件大小，单位字节。</p>
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
     * Get <p>日志名称。</p> 
     * @return LogName <p>日志名称。</p>
     */
    public String getLogName() {
        return this.LogName;
    }

    /**
     * Set <p>日志名称。</p>
     * @param LogName <p>日志名称。</p>
     */
    public void setLogName(String LogName) {
        this.LogName = LogName;
    }

    /**
     * Get <p>日志 URL。</p> 
     * @return LogUrl <p>日志 URL。</p>
     */
    public String getLogUrl() {
        return this.LogUrl;
    }

    /**
     * Set <p>日志 URL。</p>
     * @param LogUrl <p>日志 URL。</p>
     */
    public void setLogUrl(String LogUrl) {
        this.LogUrl = LogUrl;
    }

    /**
     * Get <p>日志生成时间。<br>注：此字段为北京时间（UTC+8时区）。</p> 
     * @return LogTime <p>日志生成时间。<br>注：此字段为北京时间（UTC+8时区）。</p>
     */
    public String getLogTime() {
        return this.LogTime;
    }

    /**
     * Set <p>日志生成时间。<br>注：此字段为北京时间（UTC+8时区）。</p>
     * @param LogTime <p>日志生成时间。<br>注：此字段为北京时间（UTC+8时区）。</p>
     */
    public void setLogTime(String LogTime) {
        this.LogTime = LogTime;
    }

    /**
     * Get <p>文件大小，单位字节。</p> 
     * @return FileSize <p>文件大小，单位字节。</p>
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set <p>文件大小，单位字节。</p>
     * @param FileSize <p>文件大小，单位字节。</p>
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

