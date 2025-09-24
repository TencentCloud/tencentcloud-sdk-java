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

public class RoomInfo extends AbstractModel {

    /**
    * 房间名称。
字符数不超过256
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 预定的房间开始时间，unix时间戳。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 预定的房间结束时间，unix时间戳。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 头像区域，摄像头视频画面的分辨率。可以有如下取值：
1 标清
2 高清
3 全高清
    */
    @SerializedName("Resolution")
    @Expose
    private Long Resolution;

    /**
    * 设置房间/课堂同时最大可与老师进行连麦互动的人数，该参数支持正式上课/开播前调用修改房间修改。小班课取值范围[0,16]，大班课取值范围[0,1]，当取值为0时表示当前课堂/直播，不支持连麦互动。
    */
    @SerializedName("MaxMicNumber")
    @Expose
    private Long MaxMicNumber;

    /**
    * 房间子类型，可以有以下取值： videodoc 文档+视频 video 纯视频
    */
    @SerializedName("SubType")
    @Expose
    private String SubType;

    /**
    * 老师ID。通过[注册用户]接口获取的UserId。
    */
    @SerializedName("TeacherId")
    @Expose
    private String TeacherId;

    /**
    * 进入课堂时是否自动连麦。可以有以下取值： 0 不自动连麦（需要手动申请上麦，默认值） 1 自动连麦
    */
    @SerializedName("AutoMic")
    @Expose
    private Long AutoMic;

    /**
    * 释放音视频权限后是否自动取消连麦。可以有以下取值： 0 自动取消连麦（默认值） 1 保持连麦状态
    */
    @SerializedName("TurnOffMic")
    @Expose
    private Long TurnOffMic;

    /**
    * 高音质模式。可以有以下取值： 0 不开启高音质（默认值） 1 开启高音质
    */
    @SerializedName("AudioQuality")
    @Expose
    private Long AudioQuality;

    /**
    * 上课后是否禁止自动录制。可以有以下取值： 0 不禁止录制（自动开启录制，默认值） 1 禁止录制 注：如果该配置取值为0，录制将从上课后开始，课堂结束后停止。
    */
    @SerializedName("DisableRecord")
    @Expose
    private Long DisableRecord;

    /**
    * 助教Id列表。通过[注册用户]接口获取的UserId。
    */
    @SerializedName("Assistants")
    @Expose
    private String [] Assistants;

    /**
    * rtc人数。
    */
    @SerializedName("RTCAudienceNumber")
    @Expose
    private Long RTCAudienceNumber;

    /**
    * 观看类型。
    */
    @SerializedName("AudienceType")
    @Expose
    private Long AudienceType;

    /**
    * 录制布局。
    */
    @SerializedName("RecordLayout")
    @Expose
    private Long RecordLayout;

    /**
    * 房间绑定的群组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 打开学生麦克风/摄像头的授权开关
    */
    @SerializedName("EnableDirectControl")
    @Expose
    private Long EnableDirectControl;

    /**
    * 开启专注模式。 0 收看全部角色音视频(默认) 1 只看老师和助教
    */
    @SerializedName("InteractionMode")
    @Expose
    private Long InteractionMode;

    /**
    * 横竖屏。0：横屏开播（默认值）; 1：竖屏开播，当前仅支持移动端的纯视频类型
    */
    @SerializedName("VideoOrientation")
    @Expose
    private Long VideoOrientation;

    /**
    * 开启课后评分。 0：不开启(默认)  1：开启
    */
    @SerializedName("IsGradingRequiredPostClass")
    @Expose
    private Long IsGradingRequiredPostClass;

    /**
    * 课堂类型: 0 小班课（默认值）; 1 大班课; 2 1V1 (预留参数，暂未开放); 3 圆桌会议 注：大班课的布局(layout)只有三分屏
    */
    @SerializedName("RoomType")
    @Expose
    private Long RoomType;

    /**
    * 拖堂时间：单位分钟，0为不限制(默认值), -1为不能拖堂，大于0为拖堂的时间，最大值120分钟
    */
    @SerializedName("EndDelayTime")
    @Expose
    private Long EndDelayTime;

    /**
    * 直播类型：0 常规（默认）1 伪直播 2 RTMP推流直播
    */
    @SerializedName("LiveType")
    @Expose
    private Long LiveType;

    /**
    * 伪直播回放链接
    */
    @SerializedName("RecordLiveUrl")
    @Expose
    private String RecordLiveUrl;

    /**
    * 是否自动开始上课：0 不自动上课（默认） 1 自动上课 live_type=1或2的时候有效
    */
    @SerializedName("EnableAutoStart")
    @Expose
    private Long EnableAutoStart;

    /**
    * 录制文件背景图片，支持png、jpg、jpeg、bmp格式，暂不支持透明通道
    */
    @SerializedName("RecordBackground")
    @Expose
    private String RecordBackground;

    /**
    * 录制自定义场景。注意：仅recordlayout=9的时候此参数有效。需注意各类参数配置正确能够生效。不然会造成录制失败，失败后无法补救。数据内容为用户自定义场景参数，数据格式为json键值对方式，其中键值对的value为string类型。自定义场景参数的含义。如下：     scene：自定义js/css对应的场景值。如scene=recordScene，会加载 recordScene 场景对应的 js/css，这样就可以自定义录制页面的元素。     lng：录制页面对应的语种。如lng=en，则录制界面为en。（枚举值：en,zh，zh-TW，jp，ar，kr，vi）     customToken：录制页面中涉及客户自己的服务需要鉴权时进行配置。一般情况下，无需配置。
    */
    @SerializedName("RecordScene")
    @Expose
    private String RecordScene;

    /**
    * 录制自定义语言，仅recordlayout=9的时候此参数有效
    */
    @SerializedName("RecordLang")
    @Expose
    private String RecordLang;

    /**
    * 录制类型 0 仅录制混流（默认） ;1 录制混流+单流，该模式下除混流录制基础上，分别录制老师、台上学生的音视频流，每路录制都会产生相应的录制费用 。示例：0
    */
    @SerializedName("RecordStream")
    @Expose
    private Long RecordStream;

    /**
    * 板书截图生成类型。0 不生成板书（默认）；1 全量模式；2 单页去重模式
    */
    @SerializedName("WhiteBoardSnapshotMode")
    @Expose
    private Long WhiteBoardSnapshotMode;

    /**
    * 字幕转写功能开关。可以有以下取值：
0 不开启字幕转写功能（默认值）
1 自动转写模式：上课自动开启，下课自动停止
    */
    @SerializedName("SubtitlesTranscription")
    @Expose
    private Long SubtitlesTranscription;

    /**
    * 嘉宾Id列表。当圆桌会议模式（RoomType==3）时生效
    */
    @SerializedName("Guests")
    @Expose
    private String [] Guests;

    /**
    * 录制文件合并开关。0 关闭 1 开启 注：只有在一节课多次启用手动录制时，此功能才有效
    */
    @SerializedName("RecordMerge")
    @Expose
    private Long RecordMerge;

    /**
     * Get 房间名称。
字符数不超过256 
     * @return Name 房间名称。
字符数不超过256
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 房间名称。
字符数不超过256
     * @param Name 房间名称。
字符数不超过256
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 预定的房间开始时间，unix时间戳。 
     * @return StartTime 预定的房间开始时间，unix时间戳。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 预定的房间开始时间，unix时间戳。
     * @param StartTime 预定的房间开始时间，unix时间戳。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 预定的房间结束时间，unix时间戳。 
     * @return EndTime 预定的房间结束时间，unix时间戳。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 预定的房间结束时间，unix时间戳。
     * @param EndTime 预定的房间结束时间，unix时间戳。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 头像区域，摄像头视频画面的分辨率。可以有如下取值：
1 标清
2 高清
3 全高清 
     * @return Resolution 头像区域，摄像头视频画面的分辨率。可以有如下取值：
1 标清
2 高清
3 全高清
     */
    public Long getResolution() {
        return this.Resolution;
    }

    /**
     * Set 头像区域，摄像头视频画面的分辨率。可以有如下取值：
1 标清
2 高清
3 全高清
     * @param Resolution 头像区域，摄像头视频画面的分辨率。可以有如下取值：
1 标清
2 高清
3 全高清
     */
    public void setResolution(Long Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get 设置房间/课堂同时最大可与老师进行连麦互动的人数，该参数支持正式上课/开播前调用修改房间修改。小班课取值范围[0,16]，大班课取值范围[0,1]，当取值为0时表示当前课堂/直播，不支持连麦互动。 
     * @return MaxMicNumber 设置房间/课堂同时最大可与老师进行连麦互动的人数，该参数支持正式上课/开播前调用修改房间修改。小班课取值范围[0,16]，大班课取值范围[0,1]，当取值为0时表示当前课堂/直播，不支持连麦互动。
     */
    public Long getMaxMicNumber() {
        return this.MaxMicNumber;
    }

    /**
     * Set 设置房间/课堂同时最大可与老师进行连麦互动的人数，该参数支持正式上课/开播前调用修改房间修改。小班课取值范围[0,16]，大班课取值范围[0,1]，当取值为0时表示当前课堂/直播，不支持连麦互动。
     * @param MaxMicNumber 设置房间/课堂同时最大可与老师进行连麦互动的人数，该参数支持正式上课/开播前调用修改房间修改。小班课取值范围[0,16]，大班课取值范围[0,1]，当取值为0时表示当前课堂/直播，不支持连麦互动。
     */
    public void setMaxMicNumber(Long MaxMicNumber) {
        this.MaxMicNumber = MaxMicNumber;
    }

    /**
     * Get 房间子类型，可以有以下取值： videodoc 文档+视频 video 纯视频 
     * @return SubType 房间子类型，可以有以下取值： videodoc 文档+视频 video 纯视频
     */
    public String getSubType() {
        return this.SubType;
    }

    /**
     * Set 房间子类型，可以有以下取值： videodoc 文档+视频 video 纯视频
     * @param SubType 房间子类型，可以有以下取值： videodoc 文档+视频 video 纯视频
     */
    public void setSubType(String SubType) {
        this.SubType = SubType;
    }

    /**
     * Get 老师ID。通过[注册用户]接口获取的UserId。 
     * @return TeacherId 老师ID。通过[注册用户]接口获取的UserId。
     */
    public String getTeacherId() {
        return this.TeacherId;
    }

    /**
     * Set 老师ID。通过[注册用户]接口获取的UserId。
     * @param TeacherId 老师ID。通过[注册用户]接口获取的UserId。
     */
    public void setTeacherId(String TeacherId) {
        this.TeacherId = TeacherId;
    }

    /**
     * Get 进入课堂时是否自动连麦。可以有以下取值： 0 不自动连麦（需要手动申请上麦，默认值） 1 自动连麦 
     * @return AutoMic 进入课堂时是否自动连麦。可以有以下取值： 0 不自动连麦（需要手动申请上麦，默认值） 1 自动连麦
     */
    public Long getAutoMic() {
        return this.AutoMic;
    }

    /**
     * Set 进入课堂时是否自动连麦。可以有以下取值： 0 不自动连麦（需要手动申请上麦，默认值） 1 自动连麦
     * @param AutoMic 进入课堂时是否自动连麦。可以有以下取值： 0 不自动连麦（需要手动申请上麦，默认值） 1 自动连麦
     */
    public void setAutoMic(Long AutoMic) {
        this.AutoMic = AutoMic;
    }

    /**
     * Get 释放音视频权限后是否自动取消连麦。可以有以下取值： 0 自动取消连麦（默认值） 1 保持连麦状态 
     * @return TurnOffMic 释放音视频权限后是否自动取消连麦。可以有以下取值： 0 自动取消连麦（默认值） 1 保持连麦状态
     */
    public Long getTurnOffMic() {
        return this.TurnOffMic;
    }

    /**
     * Set 释放音视频权限后是否自动取消连麦。可以有以下取值： 0 自动取消连麦（默认值） 1 保持连麦状态
     * @param TurnOffMic 释放音视频权限后是否自动取消连麦。可以有以下取值： 0 自动取消连麦（默认值） 1 保持连麦状态
     */
    public void setTurnOffMic(Long TurnOffMic) {
        this.TurnOffMic = TurnOffMic;
    }

    /**
     * Get 高音质模式。可以有以下取值： 0 不开启高音质（默认值） 1 开启高音质 
     * @return AudioQuality 高音质模式。可以有以下取值： 0 不开启高音质（默认值） 1 开启高音质
     */
    public Long getAudioQuality() {
        return this.AudioQuality;
    }

    /**
     * Set 高音质模式。可以有以下取值： 0 不开启高音质（默认值） 1 开启高音质
     * @param AudioQuality 高音质模式。可以有以下取值： 0 不开启高音质（默认值） 1 开启高音质
     */
    public void setAudioQuality(Long AudioQuality) {
        this.AudioQuality = AudioQuality;
    }

    /**
     * Get 上课后是否禁止自动录制。可以有以下取值： 0 不禁止录制（自动开启录制，默认值） 1 禁止录制 注：如果该配置取值为0，录制将从上课后开始，课堂结束后停止。 
     * @return DisableRecord 上课后是否禁止自动录制。可以有以下取值： 0 不禁止录制（自动开启录制，默认值） 1 禁止录制 注：如果该配置取值为0，录制将从上课后开始，课堂结束后停止。
     */
    public Long getDisableRecord() {
        return this.DisableRecord;
    }

    /**
     * Set 上课后是否禁止自动录制。可以有以下取值： 0 不禁止录制（自动开启录制，默认值） 1 禁止录制 注：如果该配置取值为0，录制将从上课后开始，课堂结束后停止。
     * @param DisableRecord 上课后是否禁止自动录制。可以有以下取值： 0 不禁止录制（自动开启录制，默认值） 1 禁止录制 注：如果该配置取值为0，录制将从上课后开始，课堂结束后停止。
     */
    public void setDisableRecord(Long DisableRecord) {
        this.DisableRecord = DisableRecord;
    }

    /**
     * Get 助教Id列表。通过[注册用户]接口获取的UserId。 
     * @return Assistants 助教Id列表。通过[注册用户]接口获取的UserId。
     */
    public String [] getAssistants() {
        return this.Assistants;
    }

    /**
     * Set 助教Id列表。通过[注册用户]接口获取的UserId。
     * @param Assistants 助教Id列表。通过[注册用户]接口获取的UserId。
     */
    public void setAssistants(String [] Assistants) {
        this.Assistants = Assistants;
    }

    /**
     * Get rtc人数。 
     * @return RTCAudienceNumber rtc人数。
     * @deprecated
     */
    @Deprecated
    public Long getRTCAudienceNumber() {
        return this.RTCAudienceNumber;
    }

    /**
     * Set rtc人数。
     * @param RTCAudienceNumber rtc人数。
     * @deprecated
     */
    @Deprecated
    public void setRTCAudienceNumber(Long RTCAudienceNumber) {
        this.RTCAudienceNumber = RTCAudienceNumber;
    }

    /**
     * Get 观看类型。 
     * @return AudienceType 观看类型。
     */
    public Long getAudienceType() {
        return this.AudienceType;
    }

    /**
     * Set 观看类型。
     * @param AudienceType 观看类型。
     */
    public void setAudienceType(Long AudienceType) {
        this.AudienceType = AudienceType;
    }

    /**
     * Get 录制布局。 
     * @return RecordLayout 录制布局。
     */
    public Long getRecordLayout() {
        return this.RecordLayout;
    }

    /**
     * Set 录制布局。
     * @param RecordLayout 录制布局。
     */
    public void setRecordLayout(Long RecordLayout) {
        this.RecordLayout = RecordLayout;
    }

    /**
     * Get 房间绑定的群组ID 
     * @return GroupId 房间绑定的群组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 房间绑定的群组ID
     * @param GroupId 房间绑定的群组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 打开学生麦克风/摄像头的授权开关 
     * @return EnableDirectControl 打开学生麦克风/摄像头的授权开关
     */
    public Long getEnableDirectControl() {
        return this.EnableDirectControl;
    }

    /**
     * Set 打开学生麦克风/摄像头的授权开关
     * @param EnableDirectControl 打开学生麦克风/摄像头的授权开关
     */
    public void setEnableDirectControl(Long EnableDirectControl) {
        this.EnableDirectControl = EnableDirectControl;
    }

    /**
     * Get 开启专注模式。 0 收看全部角色音视频(默认) 1 只看老师和助教 
     * @return InteractionMode 开启专注模式。 0 收看全部角色音视频(默认) 1 只看老师和助教
     */
    public Long getInteractionMode() {
        return this.InteractionMode;
    }

    /**
     * Set 开启专注模式。 0 收看全部角色音视频(默认) 1 只看老师和助教
     * @param InteractionMode 开启专注模式。 0 收看全部角色音视频(默认) 1 只看老师和助教
     */
    public void setInteractionMode(Long InteractionMode) {
        this.InteractionMode = InteractionMode;
    }

    /**
     * Get 横竖屏。0：横屏开播（默认值）; 1：竖屏开播，当前仅支持移动端的纯视频类型 
     * @return VideoOrientation 横竖屏。0：横屏开播（默认值）; 1：竖屏开播，当前仅支持移动端的纯视频类型
     */
    public Long getVideoOrientation() {
        return this.VideoOrientation;
    }

    /**
     * Set 横竖屏。0：横屏开播（默认值）; 1：竖屏开播，当前仅支持移动端的纯视频类型
     * @param VideoOrientation 横竖屏。0：横屏开播（默认值）; 1：竖屏开播，当前仅支持移动端的纯视频类型
     */
    public void setVideoOrientation(Long VideoOrientation) {
        this.VideoOrientation = VideoOrientation;
    }

    /**
     * Get 开启课后评分。 0：不开启(默认)  1：开启 
     * @return IsGradingRequiredPostClass 开启课后评分。 0：不开启(默认)  1：开启
     */
    public Long getIsGradingRequiredPostClass() {
        return this.IsGradingRequiredPostClass;
    }

    /**
     * Set 开启课后评分。 0：不开启(默认)  1：开启
     * @param IsGradingRequiredPostClass 开启课后评分。 0：不开启(默认)  1：开启
     */
    public void setIsGradingRequiredPostClass(Long IsGradingRequiredPostClass) {
        this.IsGradingRequiredPostClass = IsGradingRequiredPostClass;
    }

    /**
     * Get 课堂类型: 0 小班课（默认值）; 1 大班课; 2 1V1 (预留参数，暂未开放); 3 圆桌会议 注：大班课的布局(layout)只有三分屏 
     * @return RoomType 课堂类型: 0 小班课（默认值）; 1 大班课; 2 1V1 (预留参数，暂未开放); 3 圆桌会议 注：大班课的布局(layout)只有三分屏
     */
    public Long getRoomType() {
        return this.RoomType;
    }

    /**
     * Set 课堂类型: 0 小班课（默认值）; 1 大班课; 2 1V1 (预留参数，暂未开放); 3 圆桌会议 注：大班课的布局(layout)只有三分屏
     * @param RoomType 课堂类型: 0 小班课（默认值）; 1 大班课; 2 1V1 (预留参数，暂未开放); 3 圆桌会议 注：大班课的布局(layout)只有三分屏
     */
    public void setRoomType(Long RoomType) {
        this.RoomType = RoomType;
    }

    /**
     * Get 拖堂时间：单位分钟，0为不限制(默认值), -1为不能拖堂，大于0为拖堂的时间，最大值120分钟 
     * @return EndDelayTime 拖堂时间：单位分钟，0为不限制(默认值), -1为不能拖堂，大于0为拖堂的时间，最大值120分钟
     */
    public Long getEndDelayTime() {
        return this.EndDelayTime;
    }

    /**
     * Set 拖堂时间：单位分钟，0为不限制(默认值), -1为不能拖堂，大于0为拖堂的时间，最大值120分钟
     * @param EndDelayTime 拖堂时间：单位分钟，0为不限制(默认值), -1为不能拖堂，大于0为拖堂的时间，最大值120分钟
     */
    public void setEndDelayTime(Long EndDelayTime) {
        this.EndDelayTime = EndDelayTime;
    }

    /**
     * Get 直播类型：0 常规（默认）1 伪直播 2 RTMP推流直播 
     * @return LiveType 直播类型：0 常规（默认）1 伪直播 2 RTMP推流直播
     */
    public Long getLiveType() {
        return this.LiveType;
    }

    /**
     * Set 直播类型：0 常规（默认）1 伪直播 2 RTMP推流直播
     * @param LiveType 直播类型：0 常规（默认）1 伪直播 2 RTMP推流直播
     */
    public void setLiveType(Long LiveType) {
        this.LiveType = LiveType;
    }

    /**
     * Get 伪直播回放链接 
     * @return RecordLiveUrl 伪直播回放链接
     */
    public String getRecordLiveUrl() {
        return this.RecordLiveUrl;
    }

    /**
     * Set 伪直播回放链接
     * @param RecordLiveUrl 伪直播回放链接
     */
    public void setRecordLiveUrl(String RecordLiveUrl) {
        this.RecordLiveUrl = RecordLiveUrl;
    }

    /**
     * Get 是否自动开始上课：0 不自动上课（默认） 1 自动上课 live_type=1或2的时候有效 
     * @return EnableAutoStart 是否自动开始上课：0 不自动上课（默认） 1 自动上课 live_type=1或2的时候有效
     */
    public Long getEnableAutoStart() {
        return this.EnableAutoStart;
    }

    /**
     * Set 是否自动开始上课：0 不自动上课（默认） 1 自动上课 live_type=1或2的时候有效
     * @param EnableAutoStart 是否自动开始上课：0 不自动上课（默认） 1 自动上课 live_type=1或2的时候有效
     */
    public void setEnableAutoStart(Long EnableAutoStart) {
        this.EnableAutoStart = EnableAutoStart;
    }

    /**
     * Get 录制文件背景图片，支持png、jpg、jpeg、bmp格式，暂不支持透明通道 
     * @return RecordBackground 录制文件背景图片，支持png、jpg、jpeg、bmp格式，暂不支持透明通道
     */
    public String getRecordBackground() {
        return this.RecordBackground;
    }

    /**
     * Set 录制文件背景图片，支持png、jpg、jpeg、bmp格式，暂不支持透明通道
     * @param RecordBackground 录制文件背景图片，支持png、jpg、jpeg、bmp格式，暂不支持透明通道
     */
    public void setRecordBackground(String RecordBackground) {
        this.RecordBackground = RecordBackground;
    }

    /**
     * Get 录制自定义场景。注意：仅recordlayout=9的时候此参数有效。需注意各类参数配置正确能够生效。不然会造成录制失败，失败后无法补救。数据内容为用户自定义场景参数，数据格式为json键值对方式，其中键值对的value为string类型。自定义场景参数的含义。如下：     scene：自定义js/css对应的场景值。如scene=recordScene，会加载 recordScene 场景对应的 js/css，这样就可以自定义录制页面的元素。     lng：录制页面对应的语种。如lng=en，则录制界面为en。（枚举值：en,zh，zh-TW，jp，ar，kr，vi）     customToken：录制页面中涉及客户自己的服务需要鉴权时进行配置。一般情况下，无需配置。 
     * @return RecordScene 录制自定义场景。注意：仅recordlayout=9的时候此参数有效。需注意各类参数配置正确能够生效。不然会造成录制失败，失败后无法补救。数据内容为用户自定义场景参数，数据格式为json键值对方式，其中键值对的value为string类型。自定义场景参数的含义。如下：     scene：自定义js/css对应的场景值。如scene=recordScene，会加载 recordScene 场景对应的 js/css，这样就可以自定义录制页面的元素。     lng：录制页面对应的语种。如lng=en，则录制界面为en。（枚举值：en,zh，zh-TW，jp，ar，kr，vi）     customToken：录制页面中涉及客户自己的服务需要鉴权时进行配置。一般情况下，无需配置。
     */
    public String getRecordScene() {
        return this.RecordScene;
    }

    /**
     * Set 录制自定义场景。注意：仅recordlayout=9的时候此参数有效。需注意各类参数配置正确能够生效。不然会造成录制失败，失败后无法补救。数据内容为用户自定义场景参数，数据格式为json键值对方式，其中键值对的value为string类型。自定义场景参数的含义。如下：     scene：自定义js/css对应的场景值。如scene=recordScene，会加载 recordScene 场景对应的 js/css，这样就可以自定义录制页面的元素。     lng：录制页面对应的语种。如lng=en，则录制界面为en。（枚举值：en,zh，zh-TW，jp，ar，kr，vi）     customToken：录制页面中涉及客户自己的服务需要鉴权时进行配置。一般情况下，无需配置。
     * @param RecordScene 录制自定义场景。注意：仅recordlayout=9的时候此参数有效。需注意各类参数配置正确能够生效。不然会造成录制失败，失败后无法补救。数据内容为用户自定义场景参数，数据格式为json键值对方式，其中键值对的value为string类型。自定义场景参数的含义。如下：     scene：自定义js/css对应的场景值。如scene=recordScene，会加载 recordScene 场景对应的 js/css，这样就可以自定义录制页面的元素。     lng：录制页面对应的语种。如lng=en，则录制界面为en。（枚举值：en,zh，zh-TW，jp，ar，kr，vi）     customToken：录制页面中涉及客户自己的服务需要鉴权时进行配置。一般情况下，无需配置。
     */
    public void setRecordScene(String RecordScene) {
        this.RecordScene = RecordScene;
    }

    /**
     * Get 录制自定义语言，仅recordlayout=9的时候此参数有效 
     * @return RecordLang 录制自定义语言，仅recordlayout=9的时候此参数有效
     * @deprecated
     */
    @Deprecated
    public String getRecordLang() {
        return this.RecordLang;
    }

    /**
     * Set 录制自定义语言，仅recordlayout=9的时候此参数有效
     * @param RecordLang 录制自定义语言，仅recordlayout=9的时候此参数有效
     * @deprecated
     */
    @Deprecated
    public void setRecordLang(String RecordLang) {
        this.RecordLang = RecordLang;
    }

    /**
     * Get 录制类型 0 仅录制混流（默认） ;1 录制混流+单流，该模式下除混流录制基础上，分别录制老师、台上学生的音视频流，每路录制都会产生相应的录制费用 。示例：0 
     * @return RecordStream 录制类型 0 仅录制混流（默认） ;1 录制混流+单流，该模式下除混流录制基础上，分别录制老师、台上学生的音视频流，每路录制都会产生相应的录制费用 。示例：0
     */
    public Long getRecordStream() {
        return this.RecordStream;
    }

    /**
     * Set 录制类型 0 仅录制混流（默认） ;1 录制混流+单流，该模式下除混流录制基础上，分别录制老师、台上学生的音视频流，每路录制都会产生相应的录制费用 。示例：0
     * @param RecordStream 录制类型 0 仅录制混流（默认） ;1 录制混流+单流，该模式下除混流录制基础上，分别录制老师、台上学生的音视频流，每路录制都会产生相应的录制费用 。示例：0
     */
    public void setRecordStream(Long RecordStream) {
        this.RecordStream = RecordStream;
    }

    /**
     * Get 板书截图生成类型。0 不生成板书（默认）；1 全量模式；2 单页去重模式 
     * @return WhiteBoardSnapshotMode 板书截图生成类型。0 不生成板书（默认）；1 全量模式；2 单页去重模式
     */
    public Long getWhiteBoardSnapshotMode() {
        return this.WhiteBoardSnapshotMode;
    }

    /**
     * Set 板书截图生成类型。0 不生成板书（默认）；1 全量模式；2 单页去重模式
     * @param WhiteBoardSnapshotMode 板书截图生成类型。0 不生成板书（默认）；1 全量模式；2 单页去重模式
     */
    public void setWhiteBoardSnapshotMode(Long WhiteBoardSnapshotMode) {
        this.WhiteBoardSnapshotMode = WhiteBoardSnapshotMode;
    }

    /**
     * Get 字幕转写功能开关。可以有以下取值：
0 不开启字幕转写功能（默认值）
1 自动转写模式：上课自动开启，下课自动停止 
     * @return SubtitlesTranscription 字幕转写功能开关。可以有以下取值：
0 不开启字幕转写功能（默认值）
1 自动转写模式：上课自动开启，下课自动停止
     */
    public Long getSubtitlesTranscription() {
        return this.SubtitlesTranscription;
    }

    /**
     * Set 字幕转写功能开关。可以有以下取值：
0 不开启字幕转写功能（默认值）
1 自动转写模式：上课自动开启，下课自动停止
     * @param SubtitlesTranscription 字幕转写功能开关。可以有以下取值：
0 不开启字幕转写功能（默认值）
1 自动转写模式：上课自动开启，下课自动停止
     */
    public void setSubtitlesTranscription(Long SubtitlesTranscription) {
        this.SubtitlesTranscription = SubtitlesTranscription;
    }

    /**
     * Get 嘉宾Id列表。当圆桌会议模式（RoomType==3）时生效 
     * @return Guests 嘉宾Id列表。当圆桌会议模式（RoomType==3）时生效
     */
    public String [] getGuests() {
        return this.Guests;
    }

    /**
     * Set 嘉宾Id列表。当圆桌会议模式（RoomType==3）时生效
     * @param Guests 嘉宾Id列表。当圆桌会议模式（RoomType==3）时生效
     */
    public void setGuests(String [] Guests) {
        this.Guests = Guests;
    }

    /**
     * Get 录制文件合并开关。0 关闭 1 开启 注：只有在一节课多次启用手动录制时，此功能才有效 
     * @return RecordMerge 录制文件合并开关。0 关闭 1 开启 注：只有在一节课多次启用手动录制时，此功能才有效
     */
    public Long getRecordMerge() {
        return this.RecordMerge;
    }

    /**
     * Set 录制文件合并开关。0 关闭 1 开启 注：只有在一节课多次启用手动录制时，此功能才有效
     * @param RecordMerge 录制文件合并开关。0 关闭 1 开启 注：只有在一节课多次启用手动录制时，此功能才有效
     */
    public void setRecordMerge(Long RecordMerge) {
        this.RecordMerge = RecordMerge;
    }

    public RoomInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoomInfo(RoomInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Resolution != null) {
            this.Resolution = new Long(source.Resolution);
        }
        if (source.MaxMicNumber != null) {
            this.MaxMicNumber = new Long(source.MaxMicNumber);
        }
        if (source.SubType != null) {
            this.SubType = new String(source.SubType);
        }
        if (source.TeacherId != null) {
            this.TeacherId = new String(source.TeacherId);
        }
        if (source.AutoMic != null) {
            this.AutoMic = new Long(source.AutoMic);
        }
        if (source.TurnOffMic != null) {
            this.TurnOffMic = new Long(source.TurnOffMic);
        }
        if (source.AudioQuality != null) {
            this.AudioQuality = new Long(source.AudioQuality);
        }
        if (source.DisableRecord != null) {
            this.DisableRecord = new Long(source.DisableRecord);
        }
        if (source.Assistants != null) {
            this.Assistants = new String[source.Assistants.length];
            for (int i = 0; i < source.Assistants.length; i++) {
                this.Assistants[i] = new String(source.Assistants[i]);
            }
        }
        if (source.RTCAudienceNumber != null) {
            this.RTCAudienceNumber = new Long(source.RTCAudienceNumber);
        }
        if (source.AudienceType != null) {
            this.AudienceType = new Long(source.AudienceType);
        }
        if (source.RecordLayout != null) {
            this.RecordLayout = new Long(source.RecordLayout);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.EnableDirectControl != null) {
            this.EnableDirectControl = new Long(source.EnableDirectControl);
        }
        if (source.InteractionMode != null) {
            this.InteractionMode = new Long(source.InteractionMode);
        }
        if (source.VideoOrientation != null) {
            this.VideoOrientation = new Long(source.VideoOrientation);
        }
        if (source.IsGradingRequiredPostClass != null) {
            this.IsGradingRequiredPostClass = new Long(source.IsGradingRequiredPostClass);
        }
        if (source.RoomType != null) {
            this.RoomType = new Long(source.RoomType);
        }
        if (source.EndDelayTime != null) {
            this.EndDelayTime = new Long(source.EndDelayTime);
        }
        if (source.LiveType != null) {
            this.LiveType = new Long(source.LiveType);
        }
        if (source.RecordLiveUrl != null) {
            this.RecordLiveUrl = new String(source.RecordLiveUrl);
        }
        if (source.EnableAutoStart != null) {
            this.EnableAutoStart = new Long(source.EnableAutoStart);
        }
        if (source.RecordBackground != null) {
            this.RecordBackground = new String(source.RecordBackground);
        }
        if (source.RecordScene != null) {
            this.RecordScene = new String(source.RecordScene);
        }
        if (source.RecordLang != null) {
            this.RecordLang = new String(source.RecordLang);
        }
        if (source.RecordStream != null) {
            this.RecordStream = new Long(source.RecordStream);
        }
        if (source.WhiteBoardSnapshotMode != null) {
            this.WhiteBoardSnapshotMode = new Long(source.WhiteBoardSnapshotMode);
        }
        if (source.SubtitlesTranscription != null) {
            this.SubtitlesTranscription = new Long(source.SubtitlesTranscription);
        }
        if (source.Guests != null) {
            this.Guests = new String[source.Guests.length];
            for (int i = 0; i < source.Guests.length; i++) {
                this.Guests[i] = new String(source.Guests[i]);
            }
        }
        if (source.RecordMerge != null) {
            this.RecordMerge = new Long(source.RecordMerge);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "MaxMicNumber", this.MaxMicNumber);
        this.setParamSimple(map, prefix + "SubType", this.SubType);
        this.setParamSimple(map, prefix + "TeacherId", this.TeacherId);
        this.setParamSimple(map, prefix + "AutoMic", this.AutoMic);
        this.setParamSimple(map, prefix + "TurnOffMic", this.TurnOffMic);
        this.setParamSimple(map, prefix + "AudioQuality", this.AudioQuality);
        this.setParamSimple(map, prefix + "DisableRecord", this.DisableRecord);
        this.setParamArraySimple(map, prefix + "Assistants.", this.Assistants);
        this.setParamSimple(map, prefix + "RTCAudienceNumber", this.RTCAudienceNumber);
        this.setParamSimple(map, prefix + "AudienceType", this.AudienceType);
        this.setParamSimple(map, prefix + "RecordLayout", this.RecordLayout);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "EnableDirectControl", this.EnableDirectControl);
        this.setParamSimple(map, prefix + "InteractionMode", this.InteractionMode);
        this.setParamSimple(map, prefix + "VideoOrientation", this.VideoOrientation);
        this.setParamSimple(map, prefix + "IsGradingRequiredPostClass", this.IsGradingRequiredPostClass);
        this.setParamSimple(map, prefix + "RoomType", this.RoomType);
        this.setParamSimple(map, prefix + "EndDelayTime", this.EndDelayTime);
        this.setParamSimple(map, prefix + "LiveType", this.LiveType);
        this.setParamSimple(map, prefix + "RecordLiveUrl", this.RecordLiveUrl);
        this.setParamSimple(map, prefix + "EnableAutoStart", this.EnableAutoStart);
        this.setParamSimple(map, prefix + "RecordBackground", this.RecordBackground);
        this.setParamSimple(map, prefix + "RecordScene", this.RecordScene);
        this.setParamSimple(map, prefix + "RecordLang", this.RecordLang);
        this.setParamSimple(map, prefix + "RecordStream", this.RecordStream);
        this.setParamSimple(map, prefix + "WhiteBoardSnapshotMode", this.WhiteBoardSnapshotMode);
        this.setParamSimple(map, prefix + "SubtitlesTranscription", this.SubtitlesTranscription);
        this.setParamArraySimple(map, prefix + "Guests.", this.Guests);
        this.setParamSimple(map, prefix + "RecordMerge", this.RecordMerge);

    }
}

