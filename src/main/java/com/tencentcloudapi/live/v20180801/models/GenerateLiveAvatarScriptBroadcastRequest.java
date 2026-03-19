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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GenerateLiveAvatarScriptBroadcastRequest extends AbstractModel {

    /**
    * 数字人直播间 ID。
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 话术 ID。
    */
    @SerializedName("ScriptId")
    @Expose
    private String ScriptId;

    /**
    * 音色 Key。如果不填，则默认使用数字人直播已经保存的音色。
    */
    @SerializedName("TimbreKey")
    @Expose
    private String TimbreKey;

    /**
    * 语速（1.0为正常语速，范围[0.6-2.5]，值为0.6时播报语速最慢，值为2.5时播报语速最快。不传默认使用数字人直播间已设置的语速。
    */
    @SerializedName("SpeechSpeed")
    @Expose
    private Float SpeechSpeed;

    /**
    * 音量大小，范围[0，10]，对应音量大小。默认为5，代表正常音量，值越大音量越高。不传使用数字人直播已设置的音量。
    */
    @SerializedName("SpeechVolume")
    @Expose
    private Long SpeechVolume;

    /**
     * Get 数字人直播间 ID。 
     * @return RoomId 数字人直播间 ID。
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 数字人直播间 ID。
     * @param RoomId 数字人直播间 ID。
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 话术 ID。 
     * @return ScriptId 话术 ID。
     */
    public String getScriptId() {
        return this.ScriptId;
    }

    /**
     * Set 话术 ID。
     * @param ScriptId 话术 ID。
     */
    public void setScriptId(String ScriptId) {
        this.ScriptId = ScriptId;
    }

    /**
     * Get 音色 Key。如果不填，则默认使用数字人直播已经保存的音色。 
     * @return TimbreKey 音色 Key。如果不填，则默认使用数字人直播已经保存的音色。
     */
    public String getTimbreKey() {
        return this.TimbreKey;
    }

    /**
     * Set 音色 Key。如果不填，则默认使用数字人直播已经保存的音色。
     * @param TimbreKey 音色 Key。如果不填，则默认使用数字人直播已经保存的音色。
     */
    public void setTimbreKey(String TimbreKey) {
        this.TimbreKey = TimbreKey;
    }

    /**
     * Get 语速（1.0为正常语速，范围[0.6-2.5]，值为0.6时播报语速最慢，值为2.5时播报语速最快。不传默认使用数字人直播间已设置的语速。 
     * @return SpeechSpeed 语速（1.0为正常语速，范围[0.6-2.5]，值为0.6时播报语速最慢，值为2.5时播报语速最快。不传默认使用数字人直播间已设置的语速。
     */
    public Float getSpeechSpeed() {
        return this.SpeechSpeed;
    }

    /**
     * Set 语速（1.0为正常语速，范围[0.6-2.5]，值为0.6时播报语速最慢，值为2.5时播报语速最快。不传默认使用数字人直播间已设置的语速。
     * @param SpeechSpeed 语速（1.0为正常语速，范围[0.6-2.5]，值为0.6时播报语速最慢，值为2.5时播报语速最快。不传默认使用数字人直播间已设置的语速。
     */
    public void setSpeechSpeed(Float SpeechSpeed) {
        this.SpeechSpeed = SpeechSpeed;
    }

    /**
     * Get 音量大小，范围[0，10]，对应音量大小。默认为5，代表正常音量，值越大音量越高。不传使用数字人直播已设置的音量。 
     * @return SpeechVolume 音量大小，范围[0，10]，对应音量大小。默认为5，代表正常音量，值越大音量越高。不传使用数字人直播已设置的音量。
     */
    public Long getSpeechVolume() {
        return this.SpeechVolume;
    }

    /**
     * Set 音量大小，范围[0，10]，对应音量大小。默认为5，代表正常音量，值越大音量越高。不传使用数字人直播已设置的音量。
     * @param SpeechVolume 音量大小，范围[0，10]，对应音量大小。默认为5，代表正常音量，值越大音量越高。不传使用数字人直播已设置的音量。
     */
    public void setSpeechVolume(Long SpeechVolume) {
        this.SpeechVolume = SpeechVolume;
    }

    public GenerateLiveAvatarScriptBroadcastRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GenerateLiveAvatarScriptBroadcastRequest(GenerateLiveAvatarScriptBroadcastRequest source) {
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.ScriptId != null) {
            this.ScriptId = new String(source.ScriptId);
        }
        if (source.TimbreKey != null) {
            this.TimbreKey = new String(source.TimbreKey);
        }
        if (source.SpeechSpeed != null) {
            this.SpeechSpeed = new Float(source.SpeechSpeed);
        }
        if (source.SpeechVolume != null) {
            this.SpeechVolume = new Long(source.SpeechVolume);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "ScriptId", this.ScriptId);
        this.setParamSimple(map, prefix + "TimbreKey", this.TimbreKey);
        this.setParamSimple(map, prefix + "SpeechSpeed", this.SpeechSpeed);
        this.setParamSimple(map, prefix + "SpeechVolume", this.SpeechVolume);

    }
}

