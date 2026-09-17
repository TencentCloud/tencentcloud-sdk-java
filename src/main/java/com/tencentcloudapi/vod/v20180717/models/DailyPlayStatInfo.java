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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DailyPlayStatInfo extends AbstractModel {

    /**
    * <p>播放媒体文件的日期，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * <p>媒体文件ID。</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>播放次数。</p>
    */
    @SerializedName("PlayTimes")
    @Expose
    private Long PlayTimes;

    /**
    * <p>播放流量，单位：字节。</p>
    */
    @SerializedName("Traffic")
    @Expose
    private Long Traffic;

    /**
     * Get <p>播放媒体文件的日期，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p> 
     * @return Date <p>播放媒体文件的日期，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set <p>播放媒体文件的日期，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     * @param Date <p>播放媒体文件的日期，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get <p>媒体文件ID。</p> 
     * @return FileId <p>媒体文件ID。</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>媒体文件ID。</p>
     * @param FileId <p>媒体文件ID。</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>播放次数。</p> 
     * @return PlayTimes <p>播放次数。</p>
     */
    public Long getPlayTimes() {
        return this.PlayTimes;
    }

    /**
     * Set <p>播放次数。</p>
     * @param PlayTimes <p>播放次数。</p>
     */
    public void setPlayTimes(Long PlayTimes) {
        this.PlayTimes = PlayTimes;
    }

    /**
     * Get <p>播放流量，单位：字节。</p> 
     * @return Traffic <p>播放流量，单位：字节。</p>
     */
    public Long getTraffic() {
        return this.Traffic;
    }

    /**
     * Set <p>播放流量，单位：字节。</p>
     * @param Traffic <p>播放流量，单位：字节。</p>
     */
    public void setTraffic(Long Traffic) {
        this.Traffic = Traffic;
    }

    public DailyPlayStatInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DailyPlayStatInfo(DailyPlayStatInfo source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.PlayTimes != null) {
            this.PlayTimes = new Long(source.PlayTimes);
        }
        if (source.Traffic != null) {
            this.Traffic = new Long(source.Traffic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "PlayTimes", this.PlayTimes);
        this.setParamSimple(map, prefix + "Traffic", this.Traffic);

    }
}

