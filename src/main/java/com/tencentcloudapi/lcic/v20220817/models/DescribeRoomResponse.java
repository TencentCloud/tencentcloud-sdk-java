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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRoomResponse extends AbstractModel {

    /**
    * 房间名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 预定的房间开始时间，unix时间戳（秒）。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 预定的房间结束时间，unix时间戳（秒）。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 老师的UserId。
    */
    @SerializedName("TeacherId")
    @Expose
    private String TeacherId;

    /**
    * 低代码互动课堂的SdkAppId。
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 观看类型。互动观看 （默认）	
    */
    @SerializedName("AudienceType")
    @Expose
    private Long AudienceType;

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
    * 进入课堂时是否自动连麦。可以有以下取值：
0 不自动连麦（需要手动申请上麦，默认值）
1 自动连麦
    */
    @SerializedName("AutoMic")
    @Expose
    private Long AutoMic;

    /**
    * 高音质模式。可以有以下取值：
0 不开启高音质（默认值）
1 开启高音质
    */
    @SerializedName("AudioQuality")
    @Expose
    private Long AudioQuality;

    /**
    * 房间子类型，可以有以下取值：
videodoc 文档+视频
video 纯视频
    */
    @SerializedName("SubType")
    @Expose
    private String SubType;

    /**
    * 上课后是否禁止自动录制。可以有以下取值：
0 不禁止录制（自动开启录制，默认值）
1 禁止录制
注：如果该配置取值为0，录制将从上课后开始，课堂结束后停止。
    */
    @SerializedName("DisableRecord")
    @Expose
    private Long DisableRecord;

    /**
    * 助教UserId列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Assistants")
    @Expose
    private String [] Assistants;

    /**
    * 录制地址（协议为https)。仅在房间结束后存在。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordUrl")
    @Expose
    private String RecordUrl;

    /**
    * 课堂状态。0为未开始，1为已开始，2为已结束，3为已过期。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 房间绑定的群组ID
注意：此字段可能返回 null，表示取不到有效值。
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
    * 开启专注模式。
0 收看全部角色音视频(默认)
1 只看老师和助教
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
    * 该房间是否开启了课后评分功能。0：未开启  1：开启
    */
    @SerializedName("IsGradingRequiredPostClass")
    @Expose
    private Long IsGradingRequiredPostClass;

    /**
    * 房间类型: 0 小班课（默认值）; 1 大班课; 2 1V1 (后续扩展)
注：大班课的布局(layout)只有三分屏
    */
    @SerializedName("RoomType")
    @Expose
    private Long RoomType;

    /**
    * 录制时长
    */
    @SerializedName("VideoDuration")
    @Expose
    private Long VideoDuration;

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
    * 伪直播链接
    */
    @SerializedName("RecordLiveUrl")
    @Expose
    private String RecordLiveUrl;

    /**
    * 是否自动开始上课：0 不自动上课（默认） 1 自动上课 live_type=1的时候有效
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
    * RTMP推流链接
    */
    @SerializedName("RTMPStreamingURL")
    @Expose
    private String RTMPStreamingURL;

    /**
    * 录制自定义场景，仅recordlayout=9的时候此参数有效
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
    * 录制模板。房间子类型为视频+白板（SubType=videodoc）时默认为3，房间子类型为纯视频（SubType=video）时默认为0。录制模板枚举值参考：https://cloud.tencent.com/document/product/1639/89744
    */
    @SerializedName("RecordLayout")
    @Expose
    private Long RecordLayout;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 房间名称。 
     * @return Name 房间名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 房间名称。
     * @param Name 房间名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 预定的房间开始时间，unix时间戳（秒）。 
     * @return StartTime 预定的房间开始时间，unix时间戳（秒）。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 预定的房间开始时间，unix时间戳（秒）。
     * @param StartTime 预定的房间开始时间，unix时间戳（秒）。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 预定的房间结束时间，unix时间戳（秒）。 
     * @return EndTime 预定的房间结束时间，unix时间戳（秒）。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 预定的房间结束时间，unix时间戳（秒）。
     * @param EndTime 预定的房间结束时间，unix时间戳（秒）。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 老师的UserId。 
     * @return TeacherId 老师的UserId。
     */
    public String getTeacherId() {
        return this.TeacherId;
    }

    /**
     * Set 老师的UserId。
     * @param TeacherId 老师的UserId。
     */
    public void setTeacherId(String TeacherId) {
        this.TeacherId = TeacherId;
    }

    /**
     * Get 低代码互动课堂的SdkAppId。 
     * @return SdkAppId 低代码互动课堂的SdkAppId。
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 低代码互动课堂的SdkAppId。
     * @param SdkAppId 低代码互动课堂的SdkAppId。
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 观看类型。互动观看 （默认）	 
     * @return AudienceType 观看类型。互动观看 （默认）	
     */
    public Long getAudienceType() {
        return this.AudienceType;
    }

    /**
     * Set 观看类型。互动观看 （默认）	
     * @param AudienceType 观看类型。互动观看 （默认）	
     */
    public void setAudienceType(Long AudienceType) {
        this.AudienceType = AudienceType;
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
     * Get 进入课堂时是否自动连麦。可以有以下取值：
0 不自动连麦（需要手动申请上麦，默认值）
1 自动连麦 
     * @return AutoMic 进入课堂时是否自动连麦。可以有以下取值：
0 不自动连麦（需要手动申请上麦，默认值）
1 自动连麦
     */
    public Long getAutoMic() {
        return this.AutoMic;
    }

    /**
     * Set 进入课堂时是否自动连麦。可以有以下取值：
0 不自动连麦（需要手动申请上麦，默认值）
1 自动连麦
     * @param AutoMic 进入课堂时是否自动连麦。可以有以下取值：
0 不自动连麦（需要手动申请上麦，默认值）
1 自动连麦
     */
    public void setAutoMic(Long AutoMic) {
        this.AutoMic = AutoMic;
    }

    /**
     * Get 高音质模式。可以有以下取值：
0 不开启高音质（默认值）
1 开启高音质 
     * @return AudioQuality 高音质模式。可以有以下取值：
0 不开启高音质（默认值）
1 开启高音质
     */
    public Long getAudioQuality() {
        return this.AudioQuality;
    }

    /**
     * Set 高音质模式。可以有以下取值：
0 不开启高音质（默认值）
1 开启高音质
     * @param AudioQuality 高音质模式。可以有以下取值：
0 不开启高音质（默认值）
1 开启高音质
     */
    public void setAudioQuality(Long AudioQuality) {
        this.AudioQuality = AudioQuality;
    }

    /**
     * Get 房间子类型，可以有以下取值：
videodoc 文档+视频
video 纯视频 
     * @return SubType 房间子类型，可以有以下取值：
videodoc 文档+视频
video 纯视频
     */
    public String getSubType() {
        return this.SubType;
    }

    /**
     * Set 房间子类型，可以有以下取值：
videodoc 文档+视频
video 纯视频
     * @param SubType 房间子类型，可以有以下取值：
videodoc 文档+视频
video 纯视频
     */
    public void setSubType(String SubType) {
        this.SubType = SubType;
    }

    /**
     * Get 上课后是否禁止自动录制。可以有以下取值：
0 不禁止录制（自动开启录制，默认值）
1 禁止录制
注：如果该配置取值为0，录制将从上课后开始，课堂结束后停止。 
     * @return DisableRecord 上课后是否禁止自动录制。可以有以下取值：
0 不禁止录制（自动开启录制，默认值）
1 禁止录制
注：如果该配置取值为0，录制将从上课后开始，课堂结束后停止。
     */
    public Long getDisableRecord() {
        return this.DisableRecord;
    }

    /**
     * Set 上课后是否禁止自动录制。可以有以下取值：
0 不禁止录制（自动开启录制，默认值）
1 禁止录制
注：如果该配置取值为0，录制将从上课后开始，课堂结束后停止。
     * @param DisableRecord 上课后是否禁止自动录制。可以有以下取值：
0 不禁止录制（自动开启录制，默认值）
1 禁止录制
注：如果该配置取值为0，录制将从上课后开始，课堂结束后停止。
     */
    public void setDisableRecord(Long DisableRecord) {
        this.DisableRecord = DisableRecord;
    }

    /**
     * Get 助教UserId列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Assistants 助教UserId列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAssistants() {
        return this.Assistants;
    }

    /**
     * Set 助教UserId列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Assistants 助教UserId列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssistants(String [] Assistants) {
        this.Assistants = Assistants;
    }

    /**
     * Get 录制地址（协议为https)。仅在房间结束后存在。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordUrl 录制地址（协议为https)。仅在房间结束后存在。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecordUrl() {
        return this.RecordUrl;
    }

    /**
     * Set 录制地址（协议为https)。仅在房间结束后存在。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordUrl 录制地址（协议为https)。仅在房间结束后存在。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordUrl(String RecordUrl) {
        this.RecordUrl = RecordUrl;
    }

    /**
     * Get 课堂状态。0为未开始，1为已开始，2为已结束，3为已过期。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 课堂状态。0为未开始，1为已开始，2为已结束，3为已过期。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 课堂状态。0为未开始，1为已开始，2为已结束，3为已过期。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 课堂状态。0为未开始，1为已开始，2为已结束，3为已过期。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 房间绑定的群组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId 房间绑定的群组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 房间绑定的群组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId 房间绑定的群组ID
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get 开启专注模式。
0 收看全部角色音视频(默认)
1 只看老师和助教 
     * @return InteractionMode 开启专注模式。
0 收看全部角色音视频(默认)
1 只看老师和助教
     */
    public Long getInteractionMode() {
        return this.InteractionMode;
    }

    /**
     * Set 开启专注模式。
0 收看全部角色音视频(默认)
1 只看老师和助教
     * @param InteractionMode 开启专注模式。
0 收看全部角色音视频(默认)
1 只看老师和助教
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
     * Get 该房间是否开启了课后评分功能。0：未开启  1：开启 
     * @return IsGradingRequiredPostClass 该房间是否开启了课后评分功能。0：未开启  1：开启
     */
    public Long getIsGradingRequiredPostClass() {
        return this.IsGradingRequiredPostClass;
    }

    /**
     * Set 该房间是否开启了课后评分功能。0：未开启  1：开启
     * @param IsGradingRequiredPostClass 该房间是否开启了课后评分功能。0：未开启  1：开启
     */
    public void setIsGradingRequiredPostClass(Long IsGradingRequiredPostClass) {
        this.IsGradingRequiredPostClass = IsGradingRequiredPostClass;
    }

    /**
     * Get 房间类型: 0 小班课（默认值）; 1 大班课; 2 1V1 (后续扩展)
注：大班课的布局(layout)只有三分屏 
     * @return RoomType 房间类型: 0 小班课（默认值）; 1 大班课; 2 1V1 (后续扩展)
注：大班课的布局(layout)只有三分屏
     */
    public Long getRoomType() {
        return this.RoomType;
    }

    /**
     * Set 房间类型: 0 小班课（默认值）; 1 大班课; 2 1V1 (后续扩展)
注：大班课的布局(layout)只有三分屏
     * @param RoomType 房间类型: 0 小班课（默认值）; 1 大班课; 2 1V1 (后续扩展)
注：大班课的布局(layout)只有三分屏
     */
    public void setRoomType(Long RoomType) {
        this.RoomType = RoomType;
    }

    /**
     * Get 录制时长 
     * @return VideoDuration 录制时长
     */
    public Long getVideoDuration() {
        return this.VideoDuration;
    }

    /**
     * Set 录制时长
     * @param VideoDuration 录制时长
     */
    public void setVideoDuration(Long VideoDuration) {
        this.VideoDuration = VideoDuration;
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
     * Get 伪直播链接 
     * @return RecordLiveUrl 伪直播链接
     */
    public String getRecordLiveUrl() {
        return this.RecordLiveUrl;
    }

    /**
     * Set 伪直播链接
     * @param RecordLiveUrl 伪直播链接
     */
    public void setRecordLiveUrl(String RecordLiveUrl) {
        this.RecordLiveUrl = RecordLiveUrl;
    }

    /**
     * Get 是否自动开始上课：0 不自动上课（默认） 1 自动上课 live_type=1的时候有效 
     * @return EnableAutoStart 是否自动开始上课：0 不自动上课（默认） 1 自动上课 live_type=1的时候有效
     */
    public Long getEnableAutoStart() {
        return this.EnableAutoStart;
    }

    /**
     * Set 是否自动开始上课：0 不自动上课（默认） 1 自动上课 live_type=1的时候有效
     * @param EnableAutoStart 是否自动开始上课：0 不自动上课（默认） 1 自动上课 live_type=1的时候有效
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
     * Get RTMP推流链接 
     * @return RTMPStreamingURL RTMP推流链接
     */
    public String getRTMPStreamingURL() {
        return this.RTMPStreamingURL;
    }

    /**
     * Set RTMP推流链接
     * @param RTMPStreamingURL RTMP推流链接
     */
    public void setRTMPStreamingURL(String RTMPStreamingURL) {
        this.RTMPStreamingURL = RTMPStreamingURL;
    }

    /**
     * Get 录制自定义场景，仅recordlayout=9的时候此参数有效 
     * @return RecordScene 录制自定义场景，仅recordlayout=9的时候此参数有效
     */
    public String getRecordScene() {
        return this.RecordScene;
    }

    /**
     * Set 录制自定义场景，仅recordlayout=9的时候此参数有效
     * @param RecordScene 录制自定义场景，仅recordlayout=9的时候此参数有效
     */
    public void setRecordScene(String RecordScene) {
        this.RecordScene = RecordScene;
    }

    /**
     * Get 录制自定义语言，仅recordlayout=9的时候此参数有效 
     * @return RecordLang 录制自定义语言，仅recordlayout=9的时候此参数有效
     */
    public String getRecordLang() {
        return this.RecordLang;
    }

    /**
     * Set 录制自定义语言，仅recordlayout=9的时候此参数有效
     * @param RecordLang 录制自定义语言，仅recordlayout=9的时候此参数有效
     */
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
     * Get 录制模板。房间子类型为视频+白板（SubType=videodoc）时默认为3，房间子类型为纯视频（SubType=video）时默认为0。录制模板枚举值参考：https://cloud.tencent.com/document/product/1639/89744 
     * @return RecordLayout 录制模板。房间子类型为视频+白板（SubType=videodoc）时默认为3，房间子类型为纯视频（SubType=video）时默认为0。录制模板枚举值参考：https://cloud.tencent.com/document/product/1639/89744
     */
    public Long getRecordLayout() {
        return this.RecordLayout;
    }

    /**
     * Set 录制模板。房间子类型为视频+白板（SubType=videodoc）时默认为3，房间子类型为纯视频（SubType=video）时默认为0。录制模板枚举值参考：https://cloud.tencent.com/document/product/1639/89744
     * @param RecordLayout 录制模板。房间子类型为视频+白板（SubType=videodoc）时默认为3，房间子类型为纯视频（SubType=video）时默认为0。录制模板枚举值参考：https://cloud.tencent.com/document/product/1639/89744
     */
    public void setRecordLayout(Long RecordLayout) {
        this.RecordLayout = RecordLayout;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeRoomResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoomResponse(DescribeRoomResponse source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.TeacherId != null) {
            this.TeacherId = new String(source.TeacherId);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.AudienceType != null) {
            this.AudienceType = new Long(source.AudienceType);
        }
        if (source.Resolution != null) {
            this.Resolution = new Long(source.Resolution);
        }
        if (source.MaxMicNumber != null) {
            this.MaxMicNumber = new Long(source.MaxMicNumber);
        }
        if (source.AutoMic != null) {
            this.AutoMic = new Long(source.AutoMic);
        }
        if (source.AudioQuality != null) {
            this.AudioQuality = new Long(source.AudioQuality);
        }
        if (source.SubType != null) {
            this.SubType = new String(source.SubType);
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
        if (source.RecordUrl != null) {
            this.RecordUrl = new String(source.RecordUrl);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
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
        if (source.VideoDuration != null) {
            this.VideoDuration = new Long(source.VideoDuration);
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
        if (source.RTMPStreamingURL != null) {
            this.RTMPStreamingURL = new String(source.RTMPStreamingURL);
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
        if (source.RecordLayout != null) {
            this.RecordLayout = new Long(source.RecordLayout);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TeacherId", this.TeacherId);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "AudienceType", this.AudienceType);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "MaxMicNumber", this.MaxMicNumber);
        this.setParamSimple(map, prefix + "AutoMic", this.AutoMic);
        this.setParamSimple(map, prefix + "AudioQuality", this.AudioQuality);
        this.setParamSimple(map, prefix + "SubType", this.SubType);
        this.setParamSimple(map, prefix + "DisableRecord", this.DisableRecord);
        this.setParamArraySimple(map, prefix + "Assistants.", this.Assistants);
        this.setParamSimple(map, prefix + "RecordUrl", this.RecordUrl);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "EnableDirectControl", this.EnableDirectControl);
        this.setParamSimple(map, prefix + "InteractionMode", this.InteractionMode);
        this.setParamSimple(map, prefix + "VideoOrientation", this.VideoOrientation);
        this.setParamSimple(map, prefix + "IsGradingRequiredPostClass", this.IsGradingRequiredPostClass);
        this.setParamSimple(map, prefix + "RoomType", this.RoomType);
        this.setParamSimple(map, prefix + "VideoDuration", this.VideoDuration);
        this.setParamSimple(map, prefix + "EndDelayTime", this.EndDelayTime);
        this.setParamSimple(map, prefix + "LiveType", this.LiveType);
        this.setParamSimple(map, prefix + "RecordLiveUrl", this.RecordLiveUrl);
        this.setParamSimple(map, prefix + "EnableAutoStart", this.EnableAutoStart);
        this.setParamSimple(map, prefix + "RecordBackground", this.RecordBackground);
        this.setParamSimple(map, prefix + "RTMPStreamingURL", this.RTMPStreamingURL);
        this.setParamSimple(map, prefix + "RecordScene", this.RecordScene);
        this.setParamSimple(map, prefix + "RecordLang", this.RecordLang);
        this.setParamSimple(map, prefix + "RecordStream", this.RecordStream);
        this.setParamSimple(map, prefix + "RecordLayout", this.RecordLayout);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

