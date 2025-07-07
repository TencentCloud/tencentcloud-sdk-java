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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainLog extends AbstractModel {

    /**
    * 日志包起始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 日志包结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 日志包下载链接
    */
    @SerializedName("LogPath")
    @Expose
    private String LogPath;

    /**
    * 日志包对应加速区域
mainland：境内
overseas：境外
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 日志包文件名
    */
    @SerializedName("LogName")
    @Expose
    private String LogName;

    /**
    * 文件大小，单位: Byte
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
     * Get 日志包起始时间 
     * @return StartTime 日志包起始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 日志包起始时间
     * @param StartTime 日志包起始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 日志包结束时间 
     * @return EndTime 日志包结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 日志包结束时间
     * @param EndTime 日志包结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 日志包下载链接 
     * @return LogPath 日志包下载链接
     */
    public String getLogPath() {
        return this.LogPath;
    }

    /**
     * Set 日志包下载链接
     * @param LogPath 日志包下载链接
     */
    public void setLogPath(String LogPath) {
        this.LogPath = LogPath;
    }

    /**
     * Get 日志包对应加速区域
mainland：境内
overseas：境外 
     * @return Area 日志包对应加速区域
mainland：境内
overseas：境外
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 日志包对应加速区域
mainland：境内
overseas：境外
     * @param Area 日志包对应加速区域
mainland：境内
overseas：境外
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 日志包文件名 
     * @return LogName 日志包文件名
     */
    public String getLogName() {
        return this.LogName;
    }

    /**
     * Set 日志包文件名
     * @param LogName 日志包文件名
     */
    public void setLogName(String LogName) {
        this.LogName = LogName;
    }

    /**
     * Get 文件大小，单位: Byte
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileSize 文件大小，单位: Byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文件大小，单位: Byte
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileSize 文件大小，单位: Byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    public DomainLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainLog(DomainLog source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.LogPath != null) {
            this.LogPath = new String(source.LogPath);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.LogName != null) {
            this.LogName = new String(source.LogName);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "LogPath", this.LogPath);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "LogName", this.LogName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);

    }
}

