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

public class SyncKTVRobotCommandRequest extends AbstractModel{

    /**
    * 机器人Id。
    */
    @SerializedName("RobotId")
    @Expose
    private String RobotId;

    /**
    * 指令，取值有：
<li>Play：播放</li>
<li>Pause：暂停</li>
<li>SwitchPrevious：上一首</li>
<li>SwitchNext：下一首</li>
<li>SetPlayMode：设置播放模式</li>
<li>Seek：调整播放进度</li>
<li>SetPlaylist：歌单变更</li>
<li>SetAudioParam：音频参数变更</li>
<li>SendMessage：发送自定义消息</li>
<li>SetDestroyMode：设置销毁模式</li>
<li>SetVolume：设置音量</li>
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * 播放参数。
    */
    @SerializedName("PlayCommandInput")
    @Expose
    private PlayCommandInput PlayCommandInput;

    /**
    * 播放列表变更信息，当Command取SetPlaylist时，必填。
    */
    @SerializedName("SetPlaylistCommandInput")
    @Expose
    private SetPlaylistCommandInput SetPlaylistCommandInput;

    /**
    * 播放进度，当Command取Seek时，必填。
    */
    @SerializedName("SeekCommandInput")
    @Expose
    private SeekCommandInput SeekCommandInput;

    /**
    * 音频参数，当Command取SetAudioParam时，必填。
    */
    @SerializedName("SetAudioParamCommandInput")
    @Expose
    private SetAudioParamCommandInput SetAudioParamCommandInput;

    /**
    * 自定义消息，当Command取SendMessage时，必填。
    */
    @SerializedName("SendMessageCommandInput")
    @Expose
    private SendMessageCommandInput SendMessageCommandInput;

    /**
    * 播放模式，当Command取SetPlayMode时，必填。
    */
    @SerializedName("SetPlayModeCommandInput")
    @Expose
    private SetPlayModeCommandInput SetPlayModeCommandInput;

    /**
    * 销毁模式，当Command取SetDestroyMode时，必填。
    */
    @SerializedName("SetDestroyModeCommandInput")
    @Expose
    private SetDestroyModeCommandInput SetDestroyModeCommandInput;

    /**
    * 音量，当Command取SetVolume时，必填。
    */
    @SerializedName("SetVolumeCommandInput")
    @Expose
    private SetVolumeCommandInput SetVolumeCommandInput;

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
     * Get 指令，取值有：
<li>Play：播放</li>
<li>Pause：暂停</li>
<li>SwitchPrevious：上一首</li>
<li>SwitchNext：下一首</li>
<li>SetPlayMode：设置播放模式</li>
<li>Seek：调整播放进度</li>
<li>SetPlaylist：歌单变更</li>
<li>SetAudioParam：音频参数变更</li>
<li>SendMessage：发送自定义消息</li>
<li>SetDestroyMode：设置销毁模式</li>
<li>SetVolume：设置音量</li> 
     * @return Command 指令，取值有：
<li>Play：播放</li>
<li>Pause：暂停</li>
<li>SwitchPrevious：上一首</li>
<li>SwitchNext：下一首</li>
<li>SetPlayMode：设置播放模式</li>
<li>Seek：调整播放进度</li>
<li>SetPlaylist：歌单变更</li>
<li>SetAudioParam：音频参数变更</li>
<li>SendMessage：发送自定义消息</li>
<li>SetDestroyMode：设置销毁模式</li>
<li>SetVolume：设置音量</li>
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set 指令，取值有：
<li>Play：播放</li>
<li>Pause：暂停</li>
<li>SwitchPrevious：上一首</li>
<li>SwitchNext：下一首</li>
<li>SetPlayMode：设置播放模式</li>
<li>Seek：调整播放进度</li>
<li>SetPlaylist：歌单变更</li>
<li>SetAudioParam：音频参数变更</li>
<li>SendMessage：发送自定义消息</li>
<li>SetDestroyMode：设置销毁模式</li>
<li>SetVolume：设置音量</li>
     * @param Command 指令，取值有：
<li>Play：播放</li>
<li>Pause：暂停</li>
<li>SwitchPrevious：上一首</li>
<li>SwitchNext：下一首</li>
<li>SetPlayMode：设置播放模式</li>
<li>Seek：调整播放进度</li>
<li>SetPlaylist：歌单变更</li>
<li>SetAudioParam：音频参数变更</li>
<li>SendMessage：发送自定义消息</li>
<li>SetDestroyMode：设置销毁模式</li>
<li>SetVolume：设置音量</li>
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get 播放参数。 
     * @return PlayCommandInput 播放参数。
     */
    public PlayCommandInput getPlayCommandInput() {
        return this.PlayCommandInput;
    }

    /**
     * Set 播放参数。
     * @param PlayCommandInput 播放参数。
     */
    public void setPlayCommandInput(PlayCommandInput PlayCommandInput) {
        this.PlayCommandInput = PlayCommandInput;
    }

    /**
     * Get 播放列表变更信息，当Command取SetPlaylist时，必填。 
     * @return SetPlaylistCommandInput 播放列表变更信息，当Command取SetPlaylist时，必填。
     */
    public SetPlaylistCommandInput getSetPlaylistCommandInput() {
        return this.SetPlaylistCommandInput;
    }

    /**
     * Set 播放列表变更信息，当Command取SetPlaylist时，必填。
     * @param SetPlaylistCommandInput 播放列表变更信息，当Command取SetPlaylist时，必填。
     */
    public void setSetPlaylistCommandInput(SetPlaylistCommandInput SetPlaylistCommandInput) {
        this.SetPlaylistCommandInput = SetPlaylistCommandInput;
    }

    /**
     * Get 播放进度，当Command取Seek时，必填。 
     * @return SeekCommandInput 播放进度，当Command取Seek时，必填。
     */
    public SeekCommandInput getSeekCommandInput() {
        return this.SeekCommandInput;
    }

    /**
     * Set 播放进度，当Command取Seek时，必填。
     * @param SeekCommandInput 播放进度，当Command取Seek时，必填。
     */
    public void setSeekCommandInput(SeekCommandInput SeekCommandInput) {
        this.SeekCommandInput = SeekCommandInput;
    }

    /**
     * Get 音频参数，当Command取SetAudioParam时，必填。 
     * @return SetAudioParamCommandInput 音频参数，当Command取SetAudioParam时，必填。
     */
    public SetAudioParamCommandInput getSetAudioParamCommandInput() {
        return this.SetAudioParamCommandInput;
    }

    /**
     * Set 音频参数，当Command取SetAudioParam时，必填。
     * @param SetAudioParamCommandInput 音频参数，当Command取SetAudioParam时，必填。
     */
    public void setSetAudioParamCommandInput(SetAudioParamCommandInput SetAudioParamCommandInput) {
        this.SetAudioParamCommandInput = SetAudioParamCommandInput;
    }

    /**
     * Get 自定义消息，当Command取SendMessage时，必填。 
     * @return SendMessageCommandInput 自定义消息，当Command取SendMessage时，必填。
     */
    public SendMessageCommandInput getSendMessageCommandInput() {
        return this.SendMessageCommandInput;
    }

    /**
     * Set 自定义消息，当Command取SendMessage时，必填。
     * @param SendMessageCommandInput 自定义消息，当Command取SendMessage时，必填。
     */
    public void setSendMessageCommandInput(SendMessageCommandInput SendMessageCommandInput) {
        this.SendMessageCommandInput = SendMessageCommandInput;
    }

    /**
     * Get 播放模式，当Command取SetPlayMode时，必填。 
     * @return SetPlayModeCommandInput 播放模式，当Command取SetPlayMode时，必填。
     */
    public SetPlayModeCommandInput getSetPlayModeCommandInput() {
        return this.SetPlayModeCommandInput;
    }

    /**
     * Set 播放模式，当Command取SetPlayMode时，必填。
     * @param SetPlayModeCommandInput 播放模式，当Command取SetPlayMode时，必填。
     */
    public void setSetPlayModeCommandInput(SetPlayModeCommandInput SetPlayModeCommandInput) {
        this.SetPlayModeCommandInput = SetPlayModeCommandInput;
    }

    /**
     * Get 销毁模式，当Command取SetDestroyMode时，必填。 
     * @return SetDestroyModeCommandInput 销毁模式，当Command取SetDestroyMode时，必填。
     */
    public SetDestroyModeCommandInput getSetDestroyModeCommandInput() {
        return this.SetDestroyModeCommandInput;
    }

    /**
     * Set 销毁模式，当Command取SetDestroyMode时，必填。
     * @param SetDestroyModeCommandInput 销毁模式，当Command取SetDestroyMode时，必填。
     */
    public void setSetDestroyModeCommandInput(SetDestroyModeCommandInput SetDestroyModeCommandInput) {
        this.SetDestroyModeCommandInput = SetDestroyModeCommandInput;
    }

    /**
     * Get 音量，当Command取SetVolume时，必填。 
     * @return SetVolumeCommandInput 音量，当Command取SetVolume时，必填。
     */
    public SetVolumeCommandInput getSetVolumeCommandInput() {
        return this.SetVolumeCommandInput;
    }

    /**
     * Set 音量，当Command取SetVolume时，必填。
     * @param SetVolumeCommandInput 音量，当Command取SetVolume时，必填。
     */
    public void setSetVolumeCommandInput(SetVolumeCommandInput SetVolumeCommandInput) {
        this.SetVolumeCommandInput = SetVolumeCommandInput;
    }

    public SyncKTVRobotCommandRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncKTVRobotCommandRequest(SyncKTVRobotCommandRequest source) {
        if (source.RobotId != null) {
            this.RobotId = new String(source.RobotId);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.PlayCommandInput != null) {
            this.PlayCommandInput = new PlayCommandInput(source.PlayCommandInput);
        }
        if (source.SetPlaylistCommandInput != null) {
            this.SetPlaylistCommandInput = new SetPlaylistCommandInput(source.SetPlaylistCommandInput);
        }
        if (source.SeekCommandInput != null) {
            this.SeekCommandInput = new SeekCommandInput(source.SeekCommandInput);
        }
        if (source.SetAudioParamCommandInput != null) {
            this.SetAudioParamCommandInput = new SetAudioParamCommandInput(source.SetAudioParamCommandInput);
        }
        if (source.SendMessageCommandInput != null) {
            this.SendMessageCommandInput = new SendMessageCommandInput(source.SendMessageCommandInput);
        }
        if (source.SetPlayModeCommandInput != null) {
            this.SetPlayModeCommandInput = new SetPlayModeCommandInput(source.SetPlayModeCommandInput);
        }
        if (source.SetDestroyModeCommandInput != null) {
            this.SetDestroyModeCommandInput = new SetDestroyModeCommandInput(source.SetDestroyModeCommandInput);
        }
        if (source.SetVolumeCommandInput != null) {
            this.SetVolumeCommandInput = new SetVolumeCommandInput(source.SetVolumeCommandInput);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RobotId", this.RobotId);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamObj(map, prefix + "PlayCommandInput.", this.PlayCommandInput);
        this.setParamObj(map, prefix + "SetPlaylistCommandInput.", this.SetPlaylistCommandInput);
        this.setParamObj(map, prefix + "SeekCommandInput.", this.SeekCommandInput);
        this.setParamObj(map, prefix + "SetAudioParamCommandInput.", this.SetAudioParamCommandInput);
        this.setParamObj(map, prefix + "SendMessageCommandInput.", this.SendMessageCommandInput);
        this.setParamObj(map, prefix + "SetPlayModeCommandInput.", this.SetPlayModeCommandInput);
        this.setParamObj(map, prefix + "SetDestroyModeCommandInput.", this.SetDestroyModeCommandInput);
        this.setParamObj(map, prefix + "SetVolumeCommandInput.", this.SetVolumeCommandInput);

    }
}

