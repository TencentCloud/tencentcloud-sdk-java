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
package com.tencentcloudapi.yinsuda.v20220527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeKTVMusicAccompanySegmentUrlRequest extends AbstractModel{

    /**
    * 应用名称。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 用户标识。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 歌曲 Id 。
    */
    @SerializedName("MusicId")
    @Expose
    private String MusicId;

    /**
    * 播放场景。默认为Chat
<li>Live：直播</li><li>Chat：语聊</li>
    */
    @SerializedName("PlayScene")
    @Expose
    private String PlayScene;

    /**
    * 房间Id
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
     * Get 应用名称。 
     * @return AppName 应用名称。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名称。
     * @param AppName 应用名称。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 用户标识。 
     * @return UserId 用户标识。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户标识。
     * @param UserId 用户标识。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 歌曲 Id 。 
     * @return MusicId 歌曲 Id 。
     */
    public String getMusicId() {
        return this.MusicId;
    }

    /**
     * Set 歌曲 Id 。
     * @param MusicId 歌曲 Id 。
     */
    public void setMusicId(String MusicId) {
        this.MusicId = MusicId;
    }

    /**
     * Get 播放场景。默认为Chat
<li>Live：直播</li><li>Chat：语聊</li> 
     * @return PlayScene 播放场景。默认为Chat
<li>Live：直播</li><li>Chat：语聊</li>
     */
    public String getPlayScene() {
        return this.PlayScene;
    }

    /**
     * Set 播放场景。默认为Chat
<li>Live：直播</li><li>Chat：语聊</li>
     * @param PlayScene 播放场景。默认为Chat
<li>Live：直播</li><li>Chat：语聊</li>
     */
    public void setPlayScene(String PlayScene) {
        this.PlayScene = PlayScene;
    }

    /**
     * Get 房间Id 
     * @return RoomId 房间Id
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间Id
     * @param RoomId 房间Id
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    public DescribeKTVMusicAccompanySegmentUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKTVMusicAccompanySegmentUrlRequest(DescribeKTVMusicAccompanySegmentUrlRequest source) {
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.MusicId != null) {
            this.MusicId = new String(source.MusicId);
        }
        if (source.PlayScene != null) {
            this.PlayScene = new String(source.PlayScene);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "MusicId", this.MusicId);
        this.setParamSimple(map, prefix + "PlayScene", this.PlayScene);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);

    }
}

