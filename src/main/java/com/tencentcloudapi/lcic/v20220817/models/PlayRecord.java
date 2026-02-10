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

public class PlayRecord extends AbstractModel {

    /**
    * <p>房间ID。</p>
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * <p>用户ID。</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>单次播放会话ID。</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>播放开始时间，unix时间戳（秒）。</p>
    */
    @SerializedName("PlayBeginTime")
    @Expose
    private Long PlayBeginTime;

    /**
    * <p>播放结束时间，unix时间戳（秒）。</p>
    */
    @SerializedName("PlayEndTime")
    @Expose
    private Long PlayEndTime;

    /**
    * <p>播放时长（毫秒）。</p>
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
     * Get <p>房间ID。</p> 
     * @return RoomId <p>房间ID。</p>
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set <p>房间ID。</p>
     * @param RoomId <p>房间ID。</p>
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get <p>用户ID。</p> 
     * @return UserId <p>用户ID。</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>用户ID。</p>
     * @param UserId <p>用户ID。</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>单次播放会话ID。</p> 
     * @return SessionId <p>单次播放会话ID。</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>单次播放会话ID。</p>
     * @param SessionId <p>单次播放会话ID。</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>播放开始时间，unix时间戳（秒）。</p> 
     * @return PlayBeginTime <p>播放开始时间，unix时间戳（秒）。</p>
     */
    public Long getPlayBeginTime() {
        return this.PlayBeginTime;
    }

    /**
     * Set <p>播放开始时间，unix时间戳（秒）。</p>
     * @param PlayBeginTime <p>播放开始时间，unix时间戳（秒）。</p>
     */
    public void setPlayBeginTime(Long PlayBeginTime) {
        this.PlayBeginTime = PlayBeginTime;
    }

    /**
     * Get <p>播放结束时间，unix时间戳（秒）。</p> 
     * @return PlayEndTime <p>播放结束时间，unix时间戳（秒）。</p>
     */
    public Long getPlayEndTime() {
        return this.PlayEndTime;
    }

    /**
     * Set <p>播放结束时间，unix时间戳（秒）。</p>
     * @param PlayEndTime <p>播放结束时间，unix时间戳（秒）。</p>
     */
    public void setPlayEndTime(Long PlayEndTime) {
        this.PlayEndTime = PlayEndTime;
    }

    /**
     * Get <p>播放时长（毫秒）。</p> 
     * @return Duration <p>播放时长（毫秒）。</p>
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>播放时长（毫秒）。</p>
     * @param Duration <p>播放时长（毫秒）。</p>
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    public PlayRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlayRecord(PlayRecord source) {
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.PlayBeginTime != null) {
            this.PlayBeginTime = new Long(source.PlayBeginTime);
        }
        if (source.PlayEndTime != null) {
            this.PlayEndTime = new Long(source.PlayEndTime);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "PlayBeginTime", this.PlayBeginTime);
        this.setParamSimple(map, prefix + "PlayEndTime", this.PlayEndTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

