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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KTVRobotInfo extends AbstractModel{

    /**
    * 机器人Id。
    */
    @SerializedName("RobotId")
    @Expose
    private String RobotId;

    /**
    * 状态，取值有：
<li>Play：播放</li>
<li>Pause：暂停</li>
<li>Destroy：销毁</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 播放列表。
    */
    @SerializedName("Playlists")
    @Expose
    private String [] Playlists;

    /**
    * 当前歌单索引位置。
    */
    @SerializedName("CurIndex")
    @Expose
    private Long CurIndex;

    /**
    * 播放进度，单位：毫秒。
    */
    @SerializedName("Position")
    @Expose
    private Long Position;

    /**
    * 音频参数。
    */
    @SerializedName("SetAudioParamInput")
    @Expose
    private SetAudioParamCommandInput SetAudioParamInput;

    /**
    * 进房信息。
    */
    @SerializedName("JoinRoomInput")
    @Expose
    private JoinRoomInput JoinRoomInput;

    /**
    * RTC厂商类型，取值有：
<li>TRTC</li>
    */
    @SerializedName("RTCSystem")
    @Expose
    private String RTCSystem;

    /**
    * 播放模式，PlayMode取值有：
<li>RepeatPlaylist：列表循环</li>
<li>Order：顺序播放</li>
<li>RepeatSingle：单曲循环</li>
<li>Shuffle：随机播放</li>
    */
    @SerializedName("SetPlayModeInput")
    @Expose
    private SetPlayModeCommandInput SetPlayModeInput;

    /**
    * 音量，范围 0~100，默认为 50。
    */
    @SerializedName("SetVolumeInput")
    @Expose
    private SetVolumeCommandInput SetVolumeInput;

    /**
     * Get 机器人Id。 
     * @return RobotId 机器人Id。
     */
    public String getRobotId() {
        return this.RobotId;
    }

    /**
     * Set 机器人Id。
     * @param RobotId 机器人Id。
     */
    public void setRobotId(String RobotId) {
        this.RobotId = RobotId;
    }

    /**
     * Get 状态，取值有：
<li>Play：播放</li>
<li>Pause：暂停</li>
<li>Destroy：销毁</li> 
     * @return Status 状态，取值有：
<li>Play：播放</li>
<li>Pause：暂停</li>
<li>Destroy：销毁</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态，取值有：
<li>Play：播放</li>
<li>Pause：暂停</li>
<li>Destroy：销毁</li>
     * @param Status 状态，取值有：
<li>Play：播放</li>
<li>Pause：暂停</li>
<li>Destroy：销毁</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 播放列表。 
     * @return Playlists 播放列表。
     */
    public String [] getPlaylists() {
        return this.Playlists;
    }

    /**
     * Set 播放列表。
     * @param Playlists 播放列表。
     */
    public void setPlaylists(String [] Playlists) {
        this.Playlists = Playlists;
    }

    /**
     * Get 当前歌单索引位置。 
     * @return CurIndex 当前歌单索引位置。
     */
    public Long getCurIndex() {
        return this.CurIndex;
    }

    /**
     * Set 当前歌单索引位置。
     * @param CurIndex 当前歌单索引位置。
     */
    public void setCurIndex(Long CurIndex) {
        this.CurIndex = CurIndex;
    }

    /**
     * Get 播放进度，单位：毫秒。 
     * @return Position 播放进度，单位：毫秒。
     */
    public Long getPosition() {
        return this.Position;
    }

    /**
     * Set 播放进度，单位：毫秒。
     * @param Position 播放进度，单位：毫秒。
     */
    public void setPosition(Long Position) {
        this.Position = Position;
    }

    /**
     * Get 音频参数。 
     * @return SetAudioParamInput 音频参数。
     */
    public SetAudioParamCommandInput getSetAudioParamInput() {
        return this.SetAudioParamInput;
    }

    /**
     * Set 音频参数。
     * @param SetAudioParamInput 音频参数。
     */
    public void setSetAudioParamInput(SetAudioParamCommandInput SetAudioParamInput) {
        this.SetAudioParamInput = SetAudioParamInput;
    }

    /**
     * Get 进房信息。 
     * @return JoinRoomInput 进房信息。
     */
    public JoinRoomInput getJoinRoomInput() {
        return this.JoinRoomInput;
    }

    /**
     * Set 进房信息。
     * @param JoinRoomInput 进房信息。
     */
    public void setJoinRoomInput(JoinRoomInput JoinRoomInput) {
        this.JoinRoomInput = JoinRoomInput;
    }

    /**
     * Get RTC厂商类型，取值有：
<li>TRTC</li> 
     * @return RTCSystem RTC厂商类型，取值有：
<li>TRTC</li>
     */
    public String getRTCSystem() {
        return this.RTCSystem;
    }

    /**
     * Set RTC厂商类型，取值有：
<li>TRTC</li>
     * @param RTCSystem RTC厂商类型，取值有：
<li>TRTC</li>
     */
    public void setRTCSystem(String RTCSystem) {
        this.RTCSystem = RTCSystem;
    }

    /**
     * Get 播放模式，PlayMode取值有：
<li>RepeatPlaylist：列表循环</li>
<li>Order：顺序播放</li>
<li>RepeatSingle：单曲循环</li>
<li>Shuffle：随机播放</li> 
     * @return SetPlayModeInput 播放模式，PlayMode取值有：
<li>RepeatPlaylist：列表循环</li>
<li>Order：顺序播放</li>
<li>RepeatSingle：单曲循环</li>
<li>Shuffle：随机播放</li>
     */
    public SetPlayModeCommandInput getSetPlayModeInput() {
        return this.SetPlayModeInput;
    }

    /**
     * Set 播放模式，PlayMode取值有：
<li>RepeatPlaylist：列表循环</li>
<li>Order：顺序播放</li>
<li>RepeatSingle：单曲循环</li>
<li>Shuffle：随机播放</li>
     * @param SetPlayModeInput 播放模式，PlayMode取值有：
<li>RepeatPlaylist：列表循环</li>
<li>Order：顺序播放</li>
<li>RepeatSingle：单曲循环</li>
<li>Shuffle：随机播放</li>
     */
    public void setSetPlayModeInput(SetPlayModeCommandInput SetPlayModeInput) {
        this.SetPlayModeInput = SetPlayModeInput;
    }

    /**
     * Get 音量，范围 0~100，默认为 50。 
     * @return SetVolumeInput 音量，范围 0~100，默认为 50。
     */
    public SetVolumeCommandInput getSetVolumeInput() {
        return this.SetVolumeInput;
    }

    /**
     * Set 音量，范围 0~100，默认为 50。
     * @param SetVolumeInput 音量，范围 0~100，默认为 50。
     */
    public void setSetVolumeInput(SetVolumeCommandInput SetVolumeInput) {
        this.SetVolumeInput = SetVolumeInput;
    }

    public KTVRobotInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KTVRobotInfo(KTVRobotInfo source) {
        if (source.RobotId != null) {
            this.RobotId = new String(source.RobotId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Playlists != null) {
            this.Playlists = new String[source.Playlists.length];
            for (int i = 0; i < source.Playlists.length; i++) {
                this.Playlists[i] = new String(source.Playlists[i]);
            }
        }
        if (source.CurIndex != null) {
            this.CurIndex = new Long(source.CurIndex);
        }
        if (source.Position != null) {
            this.Position = new Long(source.Position);
        }
        if (source.SetAudioParamInput != null) {
            this.SetAudioParamInput = new SetAudioParamCommandInput(source.SetAudioParamInput);
        }
        if (source.JoinRoomInput != null) {
            this.JoinRoomInput = new JoinRoomInput(source.JoinRoomInput);
        }
        if (source.RTCSystem != null) {
            this.RTCSystem = new String(source.RTCSystem);
        }
        if (source.SetPlayModeInput != null) {
            this.SetPlayModeInput = new SetPlayModeCommandInput(source.SetPlayModeInput);
        }
        if (source.SetVolumeInput != null) {
            this.SetVolumeInput = new SetVolumeCommandInput(source.SetVolumeInput);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RobotId", this.RobotId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Playlists.", this.Playlists);
        this.setParamSimple(map, prefix + "CurIndex", this.CurIndex);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamObj(map, prefix + "SetAudioParamInput.", this.SetAudioParamInput);
        this.setParamObj(map, prefix + "JoinRoomInput.", this.JoinRoomInput);
        this.setParamSimple(map, prefix + "RTCSystem", this.RTCSystem);
        this.setParamObj(map, prefix + "SetPlayModeInput.", this.SetPlayModeInput);
        this.setParamObj(map, prefix + "SetVolumeInput.", this.SetVolumeInput);

    }
}

