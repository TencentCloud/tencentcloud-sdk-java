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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlaybackItem extends AbstractModel {

    /**
    * <p>房间id</p>
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * <p>回放地址</p>
    */
    @SerializedName("PlaybackUrl")
    @Expose
    private String PlaybackUrl;

    /**
    * <p>录制时长</p>
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * <p>录制开始时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
     * Get <p>房间id</p> 
     * @return RoomId <p>房间id</p>
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set <p>房间id</p>
     * @param RoomId <p>房间id</p>
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get <p>回放地址</p> 
     * @return PlaybackUrl <p>回放地址</p>
     */
    public String getPlaybackUrl() {
        return this.PlaybackUrl;
    }

    /**
     * Set <p>回放地址</p>
     * @param PlaybackUrl <p>回放地址</p>
     */
    public void setPlaybackUrl(String PlaybackUrl) {
        this.PlaybackUrl = PlaybackUrl;
    }

    /**
     * Get <p>录制时长</p> 
     * @return Duration <p>录制时长</p>
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>录制时长</p>
     * @param Duration <p>录制时长</p>
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>录制开始时间</p> 
     * @return CreateTime <p>录制开始时间</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>录制开始时间</p>
     * @param CreateTime <p>录制开始时间</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    public PlaybackItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlaybackItem(PlaybackItem source) {
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.PlaybackUrl != null) {
            this.PlaybackUrl = new String(source.PlaybackUrl);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "PlaybackUrl", this.PlaybackUrl);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

