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

public class VodCloudStorageEvent extends AbstractModel {

    /**
    * <p>事件id</p>
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * <p>缩略图url</p>
    */
    @SerializedName("ThumbnailUrl")
    @Expose
    private String ThumbnailUrl;

    /**
    * <p>事件开始时间</p>
    */
    @SerializedName("EventStartTime")
    @Expose
    private Long EventStartTime;

    /**
    * <p>事件结束时间</p>
    */
    @SerializedName("EventEndTime")
    @Expose
    private Long EventEndTime;

    /**
    * <p>视频相关信息</p>
    */
    @SerializedName("VideoList")
    @Expose
    private VideoList [] VideoList;

    /**
    * <p>是否为图片事件</p><p>枚举值：</p><ul><li>true： 图片事件</li><li>false： 视频事件</li></ul>
    */
    @SerializedName("IsStaticEvent")
    @Expose
    private Boolean IsStaticEvent;

    /**
     * Get <p>事件id</p> 
     * @return EventId <p>事件id</p>
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set <p>事件id</p>
     * @param EventId <p>事件id</p>
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get <p>缩略图url</p> 
     * @return ThumbnailUrl <p>缩略图url</p>
     */
    public String getThumbnailUrl() {
        return this.ThumbnailUrl;
    }

    /**
     * Set <p>缩略图url</p>
     * @param ThumbnailUrl <p>缩略图url</p>
     */
    public void setThumbnailUrl(String ThumbnailUrl) {
        this.ThumbnailUrl = ThumbnailUrl;
    }

    /**
     * Get <p>事件开始时间</p> 
     * @return EventStartTime <p>事件开始时间</p>
     */
    public Long getEventStartTime() {
        return this.EventStartTime;
    }

    /**
     * Set <p>事件开始时间</p>
     * @param EventStartTime <p>事件开始时间</p>
     */
    public void setEventStartTime(Long EventStartTime) {
        this.EventStartTime = EventStartTime;
    }

    /**
     * Get <p>事件结束时间</p> 
     * @return EventEndTime <p>事件结束时间</p>
     */
    public Long getEventEndTime() {
        return this.EventEndTime;
    }

    /**
     * Set <p>事件结束时间</p>
     * @param EventEndTime <p>事件结束时间</p>
     */
    public void setEventEndTime(Long EventEndTime) {
        this.EventEndTime = EventEndTime;
    }

    /**
     * Get <p>视频相关信息</p> 
     * @return VideoList <p>视频相关信息</p>
     */
    public VideoList [] getVideoList() {
        return this.VideoList;
    }

    /**
     * Set <p>视频相关信息</p>
     * @param VideoList <p>视频相关信息</p>
     */
    public void setVideoList(VideoList [] VideoList) {
        this.VideoList = VideoList;
    }

    /**
     * Get <p>是否为图片事件</p><p>枚举值：</p><ul><li>true： 图片事件</li><li>false： 视频事件</li></ul> 
     * @return IsStaticEvent <p>是否为图片事件</p><p>枚举值：</p><ul><li>true： 图片事件</li><li>false： 视频事件</li></ul>
     */
    public Boolean getIsStaticEvent() {
        return this.IsStaticEvent;
    }

    /**
     * Set <p>是否为图片事件</p><p>枚举值：</p><ul><li>true： 图片事件</li><li>false： 视频事件</li></ul>
     * @param IsStaticEvent <p>是否为图片事件</p><p>枚举值：</p><ul><li>true： 图片事件</li><li>false： 视频事件</li></ul>
     */
    public void setIsStaticEvent(Boolean IsStaticEvent) {
        this.IsStaticEvent = IsStaticEvent;
    }

    public VodCloudStorageEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VodCloudStorageEvent(VodCloudStorageEvent source) {
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.ThumbnailUrl != null) {
            this.ThumbnailUrl = new String(source.ThumbnailUrl);
        }
        if (source.EventStartTime != null) {
            this.EventStartTime = new Long(source.EventStartTime);
        }
        if (source.EventEndTime != null) {
            this.EventEndTime = new Long(source.EventEndTime);
        }
        if (source.VideoList != null) {
            this.VideoList = new VideoList[source.VideoList.length];
            for (int i = 0; i < source.VideoList.length; i++) {
                this.VideoList[i] = new VideoList(source.VideoList[i]);
            }
        }
        if (source.IsStaticEvent != null) {
            this.IsStaticEvent = new Boolean(source.IsStaticEvent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "ThumbnailUrl", this.ThumbnailUrl);
        this.setParamSimple(map, prefix + "EventStartTime", this.EventStartTime);
        this.setParamSimple(map, prefix + "EventEndTime", this.EventEndTime);
        this.setParamArrayObj(map, prefix + "VideoList.", this.VideoList);
        this.setParamSimple(map, prefix + "IsStaticEvent", this.IsStaticEvent);

    }
}

