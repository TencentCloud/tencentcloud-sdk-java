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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudStorageEvent extends AbstractModel{

    /**
    * 事件起始时间（Unix 时间戳，秒级
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 事件结束时间（Unix 时间戳，秒级
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 事件缩略图
    */
    @SerializedName("Thumbnail")
    @Expose
    private String Thumbnail;

    /**
    * 事件ID
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
     * Get 事件起始时间（Unix 时间戳，秒级 
     * @return StartTime 事件起始时间（Unix 时间戳，秒级
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 事件起始时间（Unix 时间戳，秒级
     * @param StartTime 事件起始时间（Unix 时间戳，秒级
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 事件结束时间（Unix 时间戳，秒级 
     * @return EndTime 事件结束时间（Unix 时间戳，秒级
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 事件结束时间（Unix 时间戳，秒级
     * @param EndTime 事件结束时间（Unix 时间戳，秒级
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 事件缩略图 
     * @return Thumbnail 事件缩略图
     */
    public String getThumbnail() {
        return this.Thumbnail;
    }

    /**
     * Set 事件缩略图
     * @param Thumbnail 事件缩略图
     */
    public void setThumbnail(String Thumbnail) {
        this.Thumbnail = Thumbnail;
    }

    /**
     * Get 事件ID 
     * @return EventId 事件ID
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件ID
     * @param EventId 事件ID
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    public CloudStorageEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudStorageEvent(CloudStorageEvent source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Thumbnail != null) {
            this.Thumbnail = new String(source.Thumbnail);
        }
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Thumbnail", this.Thumbnail);
        this.setParamSimple(map, prefix + "EventId", this.EventId);

    }
}

