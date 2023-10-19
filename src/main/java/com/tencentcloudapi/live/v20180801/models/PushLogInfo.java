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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PushLogInfo extends AbstractModel {

    /**
    * 日志名称。
    */
    @SerializedName("LogName")
    @Expose
    private String LogName;

    /**
    * 日志下载地址。
    */
    @SerializedName("LogUrl")
    @Expose
    private String LogUrl;

    /**
    * 日志时间。UTC 格式，例如：2018-11-29T19:00:00Z。
注意：
1. 北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("LogTime")
    @Expose
    private String LogTime;

    /**
    * 文件大小，单位字节。
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
     * Get 日志下载地址。 
     * @return LogUrl 日志下载地址。
     */
    public String getLogUrl() {
        return this.LogUrl;
    }

    /**
     * Set 日志下载地址。
     * @param LogUrl 日志下载地址。
     */
    public void setLogUrl(String LogUrl) {
        this.LogUrl = LogUrl;
    }

    /**
     * Get 日志时间。UTC 格式，例如：2018-11-29T19:00:00Z。
注意：
1. 北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return LogTime 日志时间。UTC 格式，例如：2018-11-29T19:00:00Z。
注意：
1. 北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getLogTime() {
        return this.LogTime;
    }

    /**
     * Set 日志时间。UTC 格式，例如：2018-11-29T19:00:00Z。
注意：
1. 北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param LogTime 日志时间。UTC 格式，例如：2018-11-29T19:00:00Z。
注意：
1. 北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setLogTime(String LogTime) {
        this.LogTime = LogTime;
    }

    /**
     * Get 文件大小，单位字节。 
     * @return FileSize 文件大小，单位字节。
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文件大小，单位字节。
     * @param FileSize 文件大小，单位字节。
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    public PushLogInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PushLogInfo(PushLogInfo source) {
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

