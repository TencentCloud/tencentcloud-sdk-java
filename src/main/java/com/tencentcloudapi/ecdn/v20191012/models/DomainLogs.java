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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainLogs extends AbstractModel {

    /**
    * 日志起始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 日志结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 日志下载路径。
    */
    @SerializedName("LogPath")
    @Expose
    private String LogPath;

    /**
     * Get 日志起始时间。 
     * @return StartTime 日志起始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 日志起始时间。
     * @param StartTime 日志起始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 日志结束时间。 
     * @return EndTime 日志结束时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 日志结束时间。
     * @param EndTime 日志结束时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 日志下载路径。 
     * @return LogPath 日志下载路径。
     */
    public String getLogPath() {
        return this.LogPath;
    }

    /**
     * Set 日志下载路径。
     * @param LogPath 日志下载路径。
     */
    public void setLogPath(String LogPath) {
        this.LogPath = LogPath;
    }

    public DomainLogs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainLogs(DomainLogs source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.LogPath != null) {
            this.LogPath = new String(source.LogPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "LogPath", this.LogPath);

    }
}

