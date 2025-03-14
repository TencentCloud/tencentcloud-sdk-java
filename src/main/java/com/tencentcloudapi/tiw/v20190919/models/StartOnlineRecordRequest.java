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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartOnlineRecordRequest extends AbstractModel {

    /**
    * 客户的SdkAppId
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 需要录制的白板房间号，取值范围: (1, 4294967295)。

1. 在没有指定`GroupId`的情况下，实时录制默认以`RoomId`的字符串表达形式作为同步白板信令的IM群组ID（比如`RoomId`为12358，则IM群组ID为"12358"），并加群进行信令同步，请在开始录制前确保相应IM群组已创建完成，否则会导致录制失败。
2. 在没有指定`TRTCRoomId`和`TRTCRoomIdStr`的情况下，默认会以`RoomId`作为TRTC房间号进房拉流进行录制。
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * 用于录制服务进房的用户ID，最大长度不能大于60个字节，格式为`tic_record_user_${RoomId}_${Random}`，其中 `${RoomId} `与录制房间号对应，`${Random}`为一个随机字符串。
该ID必须是一个单独的未在SDK中使用的ID，录制服务使用这个用户ID进入房间进行音视频与白板录制，若该ID和SDK中使用的ID重复，会导致SDK和录制服务互踢，影响正常录制。
    */
    @SerializedName("RecordUserId")
    @Expose
    private String RecordUserId;

    /**
    * 与`RecordUserId`对应的IM签名
    */
    @SerializedName("RecordUserSig")
    @Expose
    private String RecordUserSig;

    /**
    * 白板进行信令同步的 IM 群组 ID。
在没有指定`GroupId`的情况下，实时录制服务将使用 `RoomId` 的字符串形式作为同步白板信令的IM群组ID。
在指定了`GroupId`的情况下，实时录制将优先使用`GroupId`作为同步白板信令的群组ID。请在开始录制前确保相应的IM群组已创建完成，否则会导致录制失败。
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
    * 自动停止录制超时时间，单位秒，取值范围[300, 86400], 默认值为300秒。

当超过设定时间房间内没有音视频上行且没有白板操作的时候，录制服务会自动停止当前录制任务。
    */
    @SerializedName("AutoStopTimeout")
    @Expose
    private Long AutoStopTimeout;

    /**
    * 内部参数，可忽略
    */
    @SerializedName("ExtraData")
    @Expose
    private String ExtraData;

    /**
    * TRTC数字类型房间号，取值范围: (1, 4294967295)。

在同时指定了`RoomId`与`TRTCRoomId`的情况下，优先使用`TRTCRoomId`作为实时录制拉TRTC流的TRTC房间号。

当指定了`TRTCRoomIdStr`的情况下，此字段将被忽略。
    */
    @SerializedName("TRTCRoomId")
    @Expose
    private Long TRTCRoomId;

    /**
    * TRTC字符串类型房间号。

在指定了`TRTCRoomIdStr`的情况下，会优先使用`TRTCRoomIdStr`作为实时录制拉TRTC流的TRTC房间号。
    */
    @SerializedName("TRTCRoomIdStr")
    @Expose
    private String TRTCRoomIdStr;

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
     * Get 需要录制的白板房间号，取值范围: (1, 4294967295)。

1. 在没有指定`GroupId`的情况下，实时录制默认以`RoomId`的字符串表达形式作为同步白板信令的IM群组ID（比如`RoomId`为12358，则IM群组ID为"12358"），并加群进行信令同步，请在开始录制前确保相应IM群组已创建完成，否则会导致录制失败。
2. 在没有指定`TRTCRoomId`和`TRTCRoomIdStr`的情况下，默认会以`RoomId`作为TRTC房间号进房拉流进行录制。 
     * @return RoomId 需要录制的白板房间号，取值范围: (1, 4294967295)。

1. 在没有指定`GroupId`的情况下，实时录制默认以`RoomId`的字符串表达形式作为同步白板信令的IM群组ID（比如`RoomId`为12358，则IM群组ID为"12358"），并加群进行信令同步，请在开始录制前确保相应IM群组已创建完成，否则会导致录制失败。
2. 在没有指定`TRTCRoomId`和`TRTCRoomIdStr`的情况下，默认会以`RoomId`作为TRTC房间号进房拉流进行录制。
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 需要录制的白板房间号，取值范围: (1, 4294967295)。

1. 在没有指定`GroupId`的情况下，实时录制默认以`RoomId`的字符串表达形式作为同步白板信令的IM群组ID（比如`RoomId`为12358，则IM群组ID为"12358"），并加群进行信令同步，请在开始录制前确保相应IM群组已创建完成，否则会导致录制失败。
2. 在没有指定`TRTCRoomId`和`TRTCRoomIdStr`的情况下，默认会以`RoomId`作为TRTC房间号进房拉流进行录制。
     * @param RoomId 需要录制的白板房间号，取值范围: (1, 4294967295)。

1. 在没有指定`GroupId`的情况下，实时录制默认以`RoomId`的字符串表达形式作为同步白板信令的IM群组ID（比如`RoomId`为12358，则IM群组ID为"12358"），并加群进行信令同步，请在开始录制前确保相应IM群组已创建完成，否则会导致录制失败。
2. 在没有指定`TRTCRoomId`和`TRTCRoomIdStr`的情况下，默认会以`RoomId`作为TRTC房间号进房拉流进行录制。
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 用于录制服务进房的用户ID，最大长度不能大于60个字节，格式为`tic_record_user_${RoomId}_${Random}`，其中 `${RoomId} `与录制房间号对应，`${Random}`为一个随机字符串。
该ID必须是一个单独的未在SDK中使用的ID，录制服务使用这个用户ID进入房间进行音视频与白板录制，若该ID和SDK中使用的ID重复，会导致SDK和录制服务互踢，影响正常录制。 
     * @return RecordUserId 用于录制服务进房的用户ID，最大长度不能大于60个字节，格式为`tic_record_user_${RoomId}_${Random}`，其中 `${RoomId} `与录制房间号对应，`${Random}`为一个随机字符串。
该ID必须是一个单独的未在SDK中使用的ID，录制服务使用这个用户ID进入房间进行音视频与白板录制，若该ID和SDK中使用的ID重复，会导致SDK和录制服务互踢，影响正常录制。
     */
    public String getRecordUserId() {
        return this.RecordUserId;
    }

    /**
     * Set 用于录制服务进房的用户ID，最大长度不能大于60个字节，格式为`tic_record_user_${RoomId}_${Random}`，其中 `${RoomId} `与录制房间号对应，`${Random}`为一个随机字符串。
该ID必须是一个单独的未在SDK中使用的ID，录制服务使用这个用户ID进入房间进行音视频与白板录制，若该ID和SDK中使用的ID重复，会导致SDK和录制服务互踢，影响正常录制。
     * @param RecordUserId 用于录制服务进房的用户ID，最大长度不能大于60个字节，格式为`tic_record_user_${RoomId}_${Random}`，其中 `${RoomId} `与录制房间号对应，`${Random}`为一个随机字符串。
该ID必须是一个单独的未在SDK中使用的ID，录制服务使用这个用户ID进入房间进行音视频与白板录制，若该ID和SDK中使用的ID重复，会导致SDK和录制服务互踢，影响正常录制。
     */
    public void setRecordUserId(String RecordUserId) {
        this.RecordUserId = RecordUserId;
    }

    /**
     * Get 与`RecordUserId`对应的IM签名 
     * @return RecordUserSig 与`RecordUserId`对应的IM签名
     */
    public String getRecordUserSig() {
        return this.RecordUserSig;
    }

    /**
     * Set 与`RecordUserId`对应的IM签名
     * @param RecordUserSig 与`RecordUserId`对应的IM签名
     */
    public void setRecordUserSig(String RecordUserSig) {
        this.RecordUserSig = RecordUserSig;
    }

    /**
     * Get 白板进行信令同步的 IM 群组 ID。
在没有指定`GroupId`的情况下，实时录制服务将使用 `RoomId` 的字符串形式作为同步白板信令的IM群组ID。
在指定了`GroupId`的情况下，实时录制将优先使用`GroupId`作为同步白板信令的群组ID。请在开始录制前确保相应的IM群组已创建完成，否则会导致录制失败。 
     * @return GroupId 白板进行信令同步的 IM 群组 ID。
在没有指定`GroupId`的情况下，实时录制服务将使用 `RoomId` 的字符串形式作为同步白板信令的IM群组ID。
在指定了`GroupId`的情况下，实时录制将优先使用`GroupId`作为同步白板信令的群组ID。请在开始录制前确保相应的IM群组已创建完成，否则会导致录制失败。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 白板进行信令同步的 IM 群组 ID。
在没有指定`GroupId`的情况下，实时录制服务将使用 `RoomId` 的字符串形式作为同步白板信令的IM群组ID。
在指定了`GroupId`的情况下，实时录制将优先使用`GroupId`作为同步白板信令的群组ID。请在开始录制前确保相应的IM群组已创建完成，否则会导致录制失败。
     * @param GroupId 白板进行信令同步的 IM 群组 ID。
在没有指定`GroupId`的情况下，实时录制服务将使用 `RoomId` 的字符串形式作为同步白板信令的IM群组ID。
在指定了`GroupId`的情况下，实时录制将优先使用`GroupId`作为同步白板信令的群组ID。请在开始录制前确保相应的IM群组已创建完成，否则会导致录制失败。
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
     * Get 自动停止录制超时时间，单位秒，取值范围[300, 86400], 默认值为300秒。

当超过设定时间房间内没有音视频上行且没有白板操作的时候，录制服务会自动停止当前录制任务。 
     * @return AutoStopTimeout 自动停止录制超时时间，单位秒，取值范围[300, 86400], 默认值为300秒。

当超过设定时间房间内没有音视频上行且没有白板操作的时候，录制服务会自动停止当前录制任务。
     */
    public Long getAutoStopTimeout() {
        return this.AutoStopTimeout;
    }

    /**
     * Set 自动停止录制超时时间，单位秒，取值范围[300, 86400], 默认值为300秒。

当超过设定时间房间内没有音视频上行且没有白板操作的时候，录制服务会自动停止当前录制任务。
     * @param AutoStopTimeout 自动停止录制超时时间，单位秒，取值范围[300, 86400], 默认值为300秒。

当超过设定时间房间内没有音视频上行且没有白板操作的时候，录制服务会自动停止当前录制任务。
     */
    public void setAutoStopTimeout(Long AutoStopTimeout) {
        this.AutoStopTimeout = AutoStopTimeout;
    }

    /**
     * Get 内部参数，可忽略 
     * @return ExtraData 内部参数，可忽略
     */
    public String getExtraData() {
        return this.ExtraData;
    }

    /**
     * Set 内部参数，可忽略
     * @param ExtraData 内部参数，可忽略
     */
    public void setExtraData(String ExtraData) {
        this.ExtraData = ExtraData;
    }

    /**
     * Get TRTC数字类型房间号，取值范围: (1, 4294967295)。

在同时指定了`RoomId`与`TRTCRoomId`的情况下，优先使用`TRTCRoomId`作为实时录制拉TRTC流的TRTC房间号。

当指定了`TRTCRoomIdStr`的情况下，此字段将被忽略。 
     * @return TRTCRoomId TRTC数字类型房间号，取值范围: (1, 4294967295)。

在同时指定了`RoomId`与`TRTCRoomId`的情况下，优先使用`TRTCRoomId`作为实时录制拉TRTC流的TRTC房间号。

当指定了`TRTCRoomIdStr`的情况下，此字段将被忽略。
     */
    public Long getTRTCRoomId() {
        return this.TRTCRoomId;
    }

    /**
     * Set TRTC数字类型房间号，取值范围: (1, 4294967295)。

在同时指定了`RoomId`与`TRTCRoomId`的情况下，优先使用`TRTCRoomId`作为实时录制拉TRTC流的TRTC房间号。

当指定了`TRTCRoomIdStr`的情况下，此字段将被忽略。
     * @param TRTCRoomId TRTC数字类型房间号，取值范围: (1, 4294967295)。

在同时指定了`RoomId`与`TRTCRoomId`的情况下，优先使用`TRTCRoomId`作为实时录制拉TRTC流的TRTC房间号。

当指定了`TRTCRoomIdStr`的情况下，此字段将被忽略。
     */
    public void setTRTCRoomId(Long TRTCRoomId) {
        this.TRTCRoomId = TRTCRoomId;
    }

    /**
     * Get TRTC字符串类型房间号。

在指定了`TRTCRoomIdStr`的情况下，会优先使用`TRTCRoomIdStr`作为实时录制拉TRTC流的TRTC房间号。 
     * @return TRTCRoomIdStr TRTC字符串类型房间号。

在指定了`TRTCRoomIdStr`的情况下，会优先使用`TRTCRoomIdStr`作为实时录制拉TRTC流的TRTC房间号。
     */
    public String getTRTCRoomIdStr() {
        return this.TRTCRoomIdStr;
    }

    /**
     * Set TRTC字符串类型房间号。

在指定了`TRTCRoomIdStr`的情况下，会优先使用`TRTCRoomIdStr`作为实时录制拉TRTC流的TRTC房间号。
     * @param TRTCRoomIdStr TRTC字符串类型房间号。

在指定了`TRTCRoomIdStr`的情况下，会优先使用`TRTCRoomIdStr`作为实时录制拉TRTC流的TRTC房间号。
     */
    public void setTRTCRoomIdStr(String TRTCRoomIdStr) {
        this.TRTCRoomIdStr = TRTCRoomIdStr;
    }

    public StartOnlineRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartOnlineRecordRequest(StartOnlineRecordRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.RecordUserId != null) {
            this.RecordUserId = new String(source.RecordUserId);
        }
        if (source.RecordUserSig != null) {
            this.RecordUserSig = new String(source.RecordUserSig);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Concat != null) {
            this.Concat = new Concat(source.Concat);
        }
        if (source.Whiteboard != null) {
            this.Whiteboard = new Whiteboard(source.Whiteboard);
        }
        if (source.MixStream != null) {
            this.MixStream = new MixStream(source.MixStream);
        }
        if (source.Extras != null) {
            this.Extras = new String[source.Extras.length];
            for (int i = 0; i < source.Extras.length; i++) {
                this.Extras[i] = new String(source.Extras[i]);
            }
        }
        if (source.AudioFileNeeded != null) {
            this.AudioFileNeeded = new Boolean(source.AudioFileNeeded);
        }
        if (source.RecordControl != null) {
            this.RecordControl = new RecordControl(source.RecordControl);
        }
        if (source.RecordMode != null) {
            this.RecordMode = new String(source.RecordMode);
        }
        if (source.ChatGroupId != null) {
            this.ChatGroupId = new String(source.ChatGroupId);
        }
        if (source.AutoStopTimeout != null) {
            this.AutoStopTimeout = new Long(source.AutoStopTimeout);
        }
        if (source.ExtraData != null) {
            this.ExtraData = new String(source.ExtraData);
        }
        if (source.TRTCRoomId != null) {
            this.TRTCRoomId = new Long(source.TRTCRoomId);
        }
        if (source.TRTCRoomIdStr != null) {
            this.TRTCRoomIdStr = new String(source.TRTCRoomIdStr);
        }
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
        this.setParamSimple(map, prefix + "AutoStopTimeout", this.AutoStopTimeout);
        this.setParamSimple(map, prefix + "ExtraData", this.ExtraData);
        this.setParamSimple(map, prefix + "TRTCRoomId", this.TRTCRoomId);
        this.setParamSimple(map, prefix + "TRTCRoomIdStr", this.TRTCRoomIdStr);

    }
}

