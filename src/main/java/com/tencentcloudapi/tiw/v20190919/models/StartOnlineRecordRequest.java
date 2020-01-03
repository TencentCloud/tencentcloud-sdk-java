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
    * 需要录制的房间号
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * 用于实时录制服务进房的用户Id，格式为`tic_record_user_${RoomId}_${Random}`，其中 `${RoomId}` 与录制房间号对应，`${Random}`为一个随机字符串。
实时录制服务会使用这个用户Id进房进行录制房间内的音视频与白板，为了防止进房冲突，请保证此 用户Id不重复
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
    * 白板的 IM 群组 Id，默认同房间号
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 实时录制视频拼接参数
    */
    @SerializedName("Concat")
    @Expose
    private Concat Concat;

    /**
    * 实时录制白板参数，例如白板宽高等
    */
    @SerializedName("Whiteboard")
    @Expose
    private Whiteboard Whiteboard;

    /**
    * 实时录制混流参数
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
     * Get 需要录制的房间号 
     * @return RoomId 需要录制的房间号
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 需要录制的房间号
     * @param RoomId 需要录制的房间号
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 用于实时录制服务进房的用户Id，格式为`tic_record_user_${RoomId}_${Random}`，其中 `${RoomId}` 与录制房间号对应，`${Random}`为一个随机字符串。
实时录制服务会使用这个用户Id进房进行录制房间内的音视频与白板，为了防止进房冲突，请保证此 用户Id不重复 
     * @return RecordUserId 用于实时录制服务进房的用户Id，格式为`tic_record_user_${RoomId}_${Random}`，其中 `${RoomId}` 与录制房间号对应，`${Random}`为一个随机字符串。
实时录制服务会使用这个用户Id进房进行录制房间内的音视频与白板，为了防止进房冲突，请保证此 用户Id不重复
     */
    public String getRecordUserId() {
        return this.RecordUserId;
    }

    /**
     * Set 用于实时录制服务进房的用户Id，格式为`tic_record_user_${RoomId}_${Random}`，其中 `${RoomId}` 与录制房间号对应，`${Random}`为一个随机字符串。
实时录制服务会使用这个用户Id进房进行录制房间内的音视频与白板，为了防止进房冲突，请保证此 用户Id不重复
     * @param RecordUserId 用于实时录制服务进房的用户Id，格式为`tic_record_user_${RoomId}_${Random}`，其中 `${RoomId}` 与录制房间号对应，`${Random}`为一个随机字符串。
实时录制服务会使用这个用户Id进房进行录制房间内的音视频与白板，为了防止进房冲突，请保证此 用户Id不重复
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
     * Get 白板的 IM 群组 Id，默认同房间号 
     * @return GroupId 白板的 IM 群组 Id，默认同房间号
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 白板的 IM 群组 Id，默认同房间号
     * @param GroupId 白板的 IM 群组 Id，默认同房间号
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 实时录制视频拼接参数 
     * @return Concat 实时录制视频拼接参数
     */
    public Concat getConcat() {
        return this.Concat;
    }

    /**
     * Set 实时录制视频拼接参数
     * @param Concat 实时录制视频拼接参数
     */
    public void setConcat(Concat Concat) {
        this.Concat = Concat;
    }

    /**
     * Get 实时录制白板参数，例如白板宽高等 
     * @return Whiteboard 实时录制白板参数，例如白板宽高等
     */
    public Whiteboard getWhiteboard() {
        return this.Whiteboard;
    }

    /**
     * Set 实时录制白板参数，例如白板宽高等
     * @param Whiteboard 实时录制白板参数，例如白板宽高等
     */
    public void setWhiteboard(Whiteboard Whiteboard) {
        this.Whiteboard = Whiteboard;
    }

    /**
     * Get 实时录制混流参数
特别说明：
1. 混流功能需要根据额外开通， 请联系腾讯云互动白板客服人员
2. 使用混流功能，必须提供 Extras 参数，且 Extras 参数中必须包含 "MIX_STREAM" 
     * @return MixStream 实时录制混流参数
特别说明：
1. 混流功能需要根据额外开通， 请联系腾讯云互动白板客服人员
2. 使用混流功能，必须提供 Extras 参数，且 Extras 参数中必须包含 "MIX_STREAM"
     */
    public MixStream getMixStream() {
        return this.MixStream;
    }

    /**
     * Set 实时录制混流参数
特别说明：
1. 混流功能需要根据额外开通， 请联系腾讯云互动白板客服人员
2. 使用混流功能，必须提供 Extras 参数，且 Extras 参数中必须包含 "MIX_STREAM"
     * @param MixStream 实时录制混流参数
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

    }
}

