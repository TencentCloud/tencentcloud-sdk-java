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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartOnlineRecordRequest extends AbstractModel{

    /**
    * 客户的SdkAppId
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 需要录制的房间号，取值范围: (1, 4294967295)
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * 用于录制服务进房的用户ID，格式为`tic_record_user_${RoomId}_${Random}`，其中 `${RoomId} `与录制房间号对应，`${Random}`为一个随机字符串。
该ID必须是一个单独的未在SDK中使用的ID，录制服务使用这个用户ID进入房间进行音视频与白板录制，若该ID和SDK中使用的ID重复，会导致SDK和录制服务互踢，影响正常录制。
    */
    @SerializedName("RecordUserId")
    @Expose
    private String RecordUserId;

    /**
    * 与RecordUserId对应的签名
    */
    @SerializedName("RecordUserSig")
    @Expose
    private String RecordUserSig;

    /**
    * （已废弃，设置无效）白板的 IM 群组 Id，默认同房间号
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 录制视频拼接参数
    */
    @SerializedName("Concat")
    @Expose
    private Concat Concat;

    /**
    * 录制白板参数，例如白板宽高等
    */
    @SerializedName("Whiteboard")
    @Expose
    private Whiteboard Whiteboard;

    /**
    * 录制混流参数
特别说明：
1. 混流功能需要根据额外开通， 请联系腾讯云互动白板客服人员
2. 使用混流功能，必须提供 Extras 参数，且 Extras 参数中必须包含 "MIX_STREAM"
    */
    @SerializedName("MixStream")
    @Expose
    private MixStream MixStream;

    /**
    * 使用到的高级功能列表
可以选值列表：
MIX_STREAM - 混流功能
    */
    @SerializedName("Extras")
    @Expose
    private String [] Extras;

    /**
    * 是否需要在结果回调中返回各路流的纯音频录制文件，文件格式为mp3
    */
    @SerializedName("AudioFileNeeded")
    @Expose
    private Boolean AudioFileNeeded;

    /**
    * 录制控制参数，用于更精细地指定需要录制哪些流，某一路流是否禁用音频，是否只录制小画面等
    */
    @SerializedName("RecordControl")
    @Expose
    private RecordControl RecordControl;

    /**
    * 录制模式

REALTIME_MODE - 实时录制模式（默认）
VIDEO_GENERATION_MODE - 视频生成模式（内测中，需邮件申请开通）
    */
    @SerializedName("RecordMode")
    @Expose
    private String RecordMode;

    /**
    * 聊天群组ID，此字段仅适用于`视频生成模式`

在`视频生成模式`下，默认会记录白板群组内的非白板信令消息，如果指定了`ChatGroupId`，则会记录指定群ID的聊天消息。
    */
    @SerializedName("ChatGroupId")
    @Expose
    private String ChatGroupId;

    /**
     * Get 客户的SdkAppId 
     * @return SdkAppId 客户的SdkAppId
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 客户的SdkAppId
     * @param SdkAppId 客户的SdkAppId
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 需要录制的房间号，取值范围: (1, 4294967295) 
     * @return RoomId 需要录制的房间号，取值范围: (1, 4294967295)
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 需要录制的房间号，取值范围: (1, 4294967295)
     * @param RoomId 需要录制的房间号，取值范围: (1, 4294967295)
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 用于录制服务进房的用户ID，格式为`tic_record_user_${RoomId}_${Random}`，其中 `${RoomId} `与录制房间号对应，`${Random}`为一个随机字符串。
该ID必须是一个单独的未在SDK中使用的ID，录制服务使用这个用户ID进入房间进行音视频与白板录制，若该ID和SDK中使用的ID重复，会导致SDK和录制服务互踢，影响正常录制。 
     * @return RecordUserId 用于录制服务进房的用户ID，格式为`tic_record_user_${RoomId}_${Random}`，其中 `${RoomId} `与录制房间号对应，`${Random}`为一个随机字符串。
该ID必须是一个单独的未在SDK中使用的ID，录制服务使用这个用户ID进入房间进行音视频与白板录制，若该ID和SDK中使用的ID重复，会导致SDK和录制服务互踢，影响正常录制。
     */
    public String getRecordUserId() {
        return this.RecordUserId;
    }

    /**
     * Set 用于录制服务进房的用户ID，格式为`tic_record_user_${RoomId}_${Random}`，其中 `${RoomId} `与录制房间号对应，`${Random}`为一个随机字符串。
该ID必须是一个单独的未在SDK中使用的ID，录制服务使用这个用户ID进入房间进行音视频与白板录制，若该ID和SDK中使用的ID重复，会导致SDK和录制服务互踢，影响正常录制。
     * @param RecordUserId 用于录制服务进房的用户ID，格式为`tic_record_user_${RoomId}_${Random}`，其中 `${RoomId} `与录制房间号对应，`${Random}`为一个随机字符串。
该ID必须是一个单独的未在SDK中使用的ID，录制服务使用这个用户ID进入房间进行音视频与白板录制，若该ID和SDK中使用的ID重复，会导致SDK和录制服务互踢，影响正常录制。
     */
    public void setRecordUserId(String RecordUserId) {
        this.RecordUserId = RecordUserId;
    }

    /**
     * Get 与RecordUserId对应的签名 
     * @return RecordUserSig 与RecordUserId对应的签名
     */
    public String getRecordUserSig() {
        return this.RecordUserSig;
    }

    /**
     * Set 与RecordUserId对应的签名
     * @param RecordUserSig 与RecordUserId对应的签名
     */
    public void setRecordUserSig(String RecordUserSig) {
        this.RecordUserSig = RecordUserSig;
    }

    /**
     * Get （已废弃，设置无效）白板的 IM 群组 Id，默认同房间号 
     * @return GroupId （已废弃，设置无效）白板的 IM 群组 Id，默认同房间号
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set （已废弃，设置无效）白板的 IM 群组 Id，默认同房间号
     * @param GroupId （已废弃，设置无效）白板的 IM 群组 Id，默认同房间号
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 录制视频拼接参数 
     * @return Concat 录制视频拼接参数
     */
    public Concat getConcat() {
        return this.Concat;
    }

    /**
     * Set 录制视频拼接参数
     * @param Concat 录制视频拼接参数
     */
    public void setConcat(Concat Concat) {
        this.Concat = Concat;
    }

    /**
     * Get 录制白板参数，例如白板宽高等 
     * @return Whiteboard 录制白板参数，例如白板宽高等
     */
    public Whiteboard getWhiteboard() {
        return this.Whiteboard;
    }

    /**
     * Set 录制白板参数，例如白板宽高等
     * @param Whiteboard 录制白板参数，例如白板宽高等
     */
    public void setWhiteboard(Whiteboard Whiteboard) {
        this.Whiteboard = Whiteboard;
    }

    /**
     * Get 录制混流参数
特别说明：
1. 混流功能需要根据额外开通， 请联系腾讯云互动白板客服人员
2. 使用混流功能，必须提供 Extras 参数，且 Extras 参数中必须包含 "MIX_STREAM" 
     * @return MixStream 录制混流参数
特别说明：
1. 混流功能需要根据额外开通， 请联系腾讯云互动白板客服人员
2. 使用混流功能，必须提供 Extras 参数，且 Extras 参数中必须包含 "MIX_STREAM"
     */
    public MixStream getMixStream() {
        return this.MixStream;
    }

    /**
     * Set 录制混流参数
特别说明：
1. 混流功能需要根据额外开通， 请联系腾讯云互动白板客服人员
2. 使用混流功能，必须提供 Extras 参数，且 Extras 参数中必须包含 "MIX_STREAM"
     * @param MixStream 录制混流参数
特别说明：
1. 混流功能需要根据额外开通， 请联系腾讯云互动白板客服人员
2. 使用混流功能，必须提供 Extras 参数，且 Extras 参数中必须包含 "MIX_STREAM"
     */
    public void setMixStream(MixStream MixStream) {
        this.MixStream = MixStream;
    }

    /**
     * Get 使用到的高级功能列表
可以选值列表：
MIX_STREAM - 混流功能 
     * @return Extras 使用到的高级功能列表
可以选值列表：
MIX_STREAM - 混流功能
     */
    public String [] getExtras() {
        return this.Extras;
    }

    /**
     * Set 使用到的高级功能列表
可以选值列表：
MIX_STREAM - 混流功能
     * @param Extras 使用到的高级功能列表
可以选值列表：
MIX_STREAM - 混流功能
     */
    public void setExtras(String [] Extras) {
        this.Extras = Extras;
    }

    /**
     * Get 是否需要在结果回调中返回各路流的纯音频录制文件，文件格式为mp3 
     * @return AudioFileNeeded 是否需要在结果回调中返回各路流的纯音频录制文件，文件格式为mp3
     */
    public Boolean getAudioFileNeeded() {
        return this.AudioFileNeeded;
    }

    /**
     * Set 是否需要在结果回调中返回各路流的纯音频录制文件，文件格式为mp3
     * @param AudioFileNeeded 是否需要在结果回调中返回各路流的纯音频录制文件，文件格式为mp3
     */
    public void setAudioFileNeeded(Boolean AudioFileNeeded) {
        this.AudioFileNeeded = AudioFileNeeded;
    }

    /**
     * Get 录制控制参数，用于更精细地指定需要录制哪些流，某一路流是否禁用音频，是否只录制小画面等 
     * @return RecordControl 录制控制参数，用于更精细地指定需要录制哪些流，某一路流是否禁用音频，是否只录制小画面等
     */
    public RecordControl getRecordControl() {
        return this.RecordControl;
    }

    /**
     * Set 录制控制参数，用于更精细地指定需要录制哪些流，某一路流是否禁用音频，是否只录制小画面等
     * @param RecordControl 录制控制参数，用于更精细地指定需要录制哪些流，某一路流是否禁用音频，是否只录制小画面等
     */
    public void setRecordControl(RecordControl RecordControl) {
        this.RecordControl = RecordControl;
    }

    /**
     * Get 录制模式

REALTIME_MODE - 实时录制模式（默认）
VIDEO_GENERATION_MODE - 视频生成模式（内测中，需邮件申请开通） 
     * @return RecordMode 录制模式

REALTIME_MODE - 实时录制模式（默认）
VIDEO_GENERATION_MODE - 视频生成模式（内测中，需邮件申请开通）
     */
    public String getRecordMode() {
        return this.RecordMode;
    }

    /**
     * Set 录制模式

REALTIME_MODE - 实时录制模式（默认）
VIDEO_GENERATION_MODE - 视频生成模式（内测中，需邮件申请开通）
     * @param RecordMode 录制模式

REALTIME_MODE - 实时录制模式（默认）
VIDEO_GENERATION_MODE - 视频生成模式（内测中，需邮件申请开通）
     */
    public void setRecordMode(String RecordMode) {
        this.RecordMode = RecordMode;
    }

    /**
     * Get 聊天群组ID，此字段仅适用于`视频生成模式`

在`视频生成模式`下，默认会记录白板群组内的非白板信令消息，如果指定了`ChatGroupId`，则会记录指定群ID的聊天消息。 
     * @return ChatGroupId 聊天群组ID，此字段仅适用于`视频生成模式`

在`视频生成模式`下，默认会记录白板群组内的非白板信令消息，如果指定了`ChatGroupId`，则会记录指定群ID的聊天消息。
     */
    public String getChatGroupId() {
        return this.ChatGroupId;
    }

    /**
     * Set 聊天群组ID，此字段仅适用于`视频生成模式`

在`视频生成模式`下，默认会记录白板群组内的非白板信令消息，如果指定了`ChatGroupId`，则会记录指定群ID的聊天消息。
     * @param ChatGroupId 聊天群组ID，此字段仅适用于`视频生成模式`

在`视频生成模式`下，默认会记录白板群组内的非白板信令消息，如果指定了`ChatGroupId`，则会记录指定群ID的聊天消息。
     */
    public void setChatGroupId(String ChatGroupId) {
        this.ChatGroupId = ChatGroupId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "RecordUserId", this.RecordUserId);
        this.setParamSimple(map, prefix + "RecordUserSig", this.RecordUserSig);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamObj(map, prefix + "Concat.", this.Concat);
        this.setParamObj(map, prefix + "Whiteboard.", this.Whiteboard);
        this.setParamObj(map, prefix + "MixStream.", this.MixStream);
        this.setParamArraySimple(map, prefix + "Extras.", this.Extras);
        this.setParamSimple(map, prefix + "AudioFileNeeded", this.AudioFileNeeded);
        this.setParamObj(map, prefix + "RecordControl.", this.RecordControl);
        this.setParamSimple(map, prefix + "RecordMode", this.RecordMode);
        this.setParamSimple(map, prefix + "ChatGroupId", this.ChatGroupId);

    }
}

