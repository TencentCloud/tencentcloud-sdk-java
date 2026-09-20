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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoList extends AbstractModel {

    /**
    * <p>用于播放加密视频</p>
    */
    @SerializedName("Psign")
    @Expose
    private String Psign;

    /**
    * <p>开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>播放url</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>视频类型</p>
    */
    @SerializedName("StreamType")
    @Expose
    private String StreamType;

    /**
    * <p>点播文件id</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
     * Get <p>用于播放加密视频</p> 
     * @return Psign <p>用于播放加密视频</p>
     */
    public String getPsign() {
        return this.Psign;
    }

    /**
     * Set <p>用于播放加密视频</p>
     * @param Psign <p>用于播放加密视频</p>
     */
    public void setPsign(String Psign) {
        this.Psign = Psign;
    }

    /**
     * Get <p>开始时间</p> 
     * @return StartTime <p>开始时间</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p>
     * @param StartTime <p>开始时间</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间</p> 
     * @return EndTime <p>结束时间</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
     * @param EndTime <p>结束时间</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>播放url</p> 
     * @return Url <p>播放url</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>播放url</p>
     * @param Url <p>播放url</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>视频类型</p> 
     * @return StreamType <p>视频类型</p>
     */
    public String getStreamType() {
        return this.StreamType;
    }

    /**
     * Set <p>视频类型</p>
     * @param StreamType <p>视频类型</p>
     */
    public void setStreamType(String StreamType) {
        this.StreamType = StreamType;
    }

    /**
     * Get <p>点播文件id</p> 
     * @return FileId <p>点播文件id</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>点播文件id</p>
     * @param FileId <p>点播文件id</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    public VideoList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoList(VideoList source) {
        if (source.Psign != null) {
            this.Psign = new String(source.Psign);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.StreamType != null) {
            this.StreamType = new String(source.StreamType);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Psign", this.Psign);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "StreamType", this.StreamType);
        this.setParamSimple(map, prefix + "FileId", this.FileId);

    }
}

