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

public class DescribeRoomResponse extends AbstractModel {

    /**
    * <p>课堂名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>预定的课堂开始时间，unix时间戳（秒）。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>预定的课堂结束时间，unix时间戳（秒）。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>老师的UserId。</p>
    */
    @SerializedName("TeacherId")
    @Expose
    private String TeacherId;

    /**
    * <p>低代码互动课堂的SdkAppId。</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>观看类型。互动观看 （默认）</p>
    */
    @SerializedName("AudienceType")
    @Expose
    private Long AudienceType;

    /**
    * <p>头像区域，摄像头视频画面的分辨率。可以有如下取值：<br>1 标清<br>2 高清<br>3 全高清</p>
    */
    @SerializedName("Resolution")
    @Expose
    private Long Resolution;

    /**
    * <p>设置课堂同时最大可与老师进行连麦互动的人数，该参数支持正式上课/开播前调用修改房间修改。小班课取值范围[0,16]，大班课取值范围[0,1]，当取值为0时表示当前课堂/直播，不支持连麦互动。</p>
    */
    @SerializedName("MaxMicNumber")
    @Expose
    private Long MaxMicNumber;

    /**
    * <p>进入课堂时是否自动连麦。可以有以下取值：<br>0 不自动连麦（需要手动申请上麦，默认值）<br>1 自动连麦</p>
    */
    @SerializedName("AutoMic")
    @Expose
    private Long AutoMic;

    /**
    * <p>高音质模式。可以有以下取值：<br>0 不开启高音质（默认值）<br>1 开启高音质</p>
    */
    @SerializedName("AudioQuality")
    @Expose
    private Long AudioQuality;

    /**
    * <p>课堂子类型，可以有以下取值：videodoc 文档+视频video 纯视频</p>
    */
    @SerializedName("SubType")
    @Expose
    private String SubType;

    /**
    * <p>录制方式。</p><p>枚举值：</p><ul><li>0： 开启自动录制</li><li>1： 禁止录制</li><li>2： 开启手动录制。（仅支持页面录制，需通过startRecord、stopRecord接口控制录制的开始和结束。）</li><li>3： 信令录制。</li></ul>
    */
    @SerializedName("DisableRecord")
    @Expose
    private Long DisableRecord;

    /**
    * <p>助教UserId列表。</p>
    */
    @SerializedName("Assistants")
    @Expose
    private String [] Assistants;

    /**
    * <p>录制地址（协议为https)。仅在房间结束后存在。</p>
    */
    @SerializedName("RecordUrl")
    @Expose
    private String RecordUrl;

    /**
    * <p>课堂状态。0为未开始，1为已开始，2为已结束，3为已过期。</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>课堂绑定的群组ID</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>打开学生麦克风/摄像头的授权开关</p>
    */
    @SerializedName("EnableDirectControl")
    @Expose
    private Long EnableDirectControl;

    /**
    * <p>开启专注模式。<br>0 收看全部角色音视频(默认)<br>1 只看老师和助教</p>
    */
    @SerializedName("InteractionMode")
    @Expose
    private Long InteractionMode;

    /**
    * <p>横竖屏。0：横屏开播（默认值）; 1：竖屏开播，当前仅支持移动端的纯视频类型</p>
    */
    @SerializedName("VideoOrientation")
    @Expose
    private Long VideoOrientation;

    /**
    * <p>该课堂是否开启了课后评分功能。0：未开启  1：开启</p>
    */
    @SerializedName("IsGradingRequiredPostClass")
    @Expose
    private Long IsGradingRequiredPostClass;

    /**
    * <p>课堂类型: 0 小班课（默认值）; 1 大班课; 2 1V1 (预留参数，暂未开放); 3 圆桌会议 注：大班课的布局(layout)只有三分屏</p>
    */
    @SerializedName("RoomType")
    @Expose
    private Long RoomType;

    /**
    * <p>录制时长</p>
    */
    @SerializedName("VideoDuration")
    @Expose
    private Long VideoDuration;

    /**
    * <p>拖堂时间：单位分钟，0为不限制(默认值), -1为不能拖堂，大于0为拖堂的时间，最大值120分钟</p>
    */
    @SerializedName("EndDelayTime")
    @Expose
    private Long EndDelayTime;

    /**
    * <p>直播类型：0 常规（默认）1 伪直播 2 RTMP推流直播</p>
    */
    @SerializedName("LiveType")
    @Expose
    private Long LiveType;

    /**
    * <p>伪直播链接</p>
    */
    @SerializedName("RecordLiveUrl")
    @Expose
    private String RecordLiveUrl;

    /**
    * <p>是否自动开始上课：0 不自动上课（默认） 1 自动上课 live_type=1的时候有效</p>
    */
    @SerializedName("EnableAutoStart")
    @Expose
    private Long EnableAutoStart;

    /**
    * <p>录制文件背景图片，支持png、jpg、jpeg、bmp格式，暂不支持透明通道</p>
    */
    @SerializedName("RecordBackground")
    @Expose
    private String RecordBackground;

    /**
    * <p>RTMP推流链接</p>
    */
    @SerializedName("RTMPStreamingURL")
    @Expose
    private String RTMPStreamingURL;

    /**
    * <p>录制自定义场景。注意：仅recordlayout=9的时候此参数有效。需注意各类参数配置正确能够生效。不然会造成录制失败，失败后无法补救。数据内容为用户自定义场景参数，数据格式为json键值对方式，其中键值对的value为string类型。自定义场景参数的含义。如下：     scene：自定义js/css对应的场景值。如scene=recordScene，会加载 recordScene 场景对应的 js/css，这样就可以自定义录制页面的元素。     lng：录制页面对应的语种。如lng=en，则录制界面为en。（枚举值：en,zh，zh-TW，jp，ar，kr，vi）     customToken：录制页面中涉及客户自己的服务需要鉴权时进行配置。一般情况下，无需配置。</p>
    */
    @SerializedName("RecordScene")
    @Expose
    private String RecordScene;

    /**
    * <p>录制自定义语言，仅recordlayout=9的时候此参数有效</p>
    */
    @SerializedName("RecordLang")
    @Expose
    private String RecordLang;

    /**
    * <p>录制类型 0 仅录制混流（默认） ;1 录制混流+单流，该模式下除混流录制基础上，分别录制老师、台上学生的音视频流，每路录制都会产生相应的录制费用 。示例：0</p>
    */
    @SerializedName("RecordStream")
    @Expose
    private Long RecordStream;

    /**
    * <p>录制模板。房间子类型为视频+白板（SubType=videodoc）时默认为3，房间子类型为纯视频（SubType=video）时默认为0。录制模板枚举值参考：https://cloud.tencent.com/document/product/1639/89744</p>
    */
    @SerializedName("RecordLayout")
    @Expose
    private Long RecordLayout;

    /**
    * <p>板书截图生成类型。0 不生成板书；1 全量模式；2 单页去重模式</p>
    */
    @SerializedName("WhiteBoardSnapshotMode")
    @Expose
    private Long WhiteBoardSnapshotMode;

    /**
    * <p>字幕转写功能开关。可以有以下取值：<br>0 不开启字幕转写功能（默认值）<br>1 自动转写模式：上课自动开启，下课自动停止<br>2 手动转写模式：支持老师或者助教通过客户端API手动开启/关闭字幕转写<br>设置0和1时客户端均不展示手动开关，设置2时老师或者助教端展示字幕转写开关</p>
    */
    @SerializedName("SubtitlesTranscription")
    @Expose
    private Long SubtitlesTranscription;

    /**
    * <p>嘉宾Id列表。当圆桌会议模式（RoomType==3）时生效</p>
    */
    @SerializedName("Guests")
    @Expose
    private String [] Guests;

    /**
    * <p>录制文件合并开关。0 关闭 1 开启 注：只有在一节课多次启用手动录制时，此功能才有效</p>
    */
    @SerializedName("RecordMerge")
    @Expose
    private Long RecordMerge;

    /**
    * <p>转推开关</p><p>枚举值：</p><ul><li>0： 关闭</li><li>1： 开启</li></ul>
    */
    @SerializedName("EnableLiveRelay")
    @Expose
    private Long EnableLiveRelay;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>课堂名称。</p> 
     * @return Name <p>课堂名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>课堂名称。</p>
     * @param Name <p>课堂名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>预定的课堂开始时间，unix时间戳（秒）。</p> 
     * @return StartTime <p>预定的课堂开始时间，unix时间戳（秒）。</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>预定的课堂开始时间，unix时间戳（秒）。</p>
     * @param StartTime <p>预定的课堂开始时间，unix时间戳（秒）。</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>预定的课堂结束时间，unix时间戳（秒）。</p> 
     * @return EndTime <p>预定的课堂结束时间，unix时间戳（秒）。</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>预定的课堂结束时间，unix时间戳（秒）。</p>
     * @param EndTime <p>预定的课堂结束时间，unix时间戳（秒）。</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>老师的UserId。</p> 
     * @return TeacherId <p>老师的UserId。</p>
     */
    public String getTeacherId() {
        return this.TeacherId;
    }

    /**
     * Set <p>老师的UserId。</p>
     * @param TeacherId <p>老师的UserId。</p>
     */
    public void setTeacherId(String TeacherId) {
        this.TeacherId = TeacherId;
    }

    /**
     * Get <p>低代码互动课堂的SdkAppId。</p> 
     * @return SdkAppId <p>低代码互动课堂的SdkAppId。</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>低代码互动课堂的SdkAppId。</p>
     * @param SdkAppId <p>低代码互动课堂的SdkAppId。</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>观看类型。互动观看 （默认）</p> 
     * @return AudienceType <p>观看类型。互动观看 （默认）</p>
     */
    public Long getAudienceType() {
        return this.AudienceType;
    }

    /**
     * Set <p>观看类型。互动观看 （默认）</p>
     * @param AudienceType <p>观看类型。互动观看 （默认）</p>
     */
    public void setAudienceType(Long AudienceType) {
        this.AudienceType = AudienceType;
    }

    /**
     * Get <p>头像区域，摄像头视频画面的分辨率。可以有如下取值：<br>1 标清<br>2 高清<br>3 全高清</p> 
     * @return Resolution <p>头像区域，摄像头视频画面的分辨率。可以有如下取值：<br>1 标清<br>2 高清<br>3 全高清</p>
     */
    public Long getResolution() {
        return this.Resolution;
    }

    /**
     * Set <p>头像区域，摄像头视频画面的分辨率。可以有如下取值：<br>1 标清<br>2 高清<br>3 全高清</p>
     * @param Resolution <p>头像区域，摄像头视频画面的分辨率。可以有如下取值：<br>1 标清<br>2 高清<br>3 全高清</p>
     */
    public void setResolution(Long Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get <p>设置课堂同时最大可与老师进行连麦互动的人数，该参数支持正式上课/开播前调用修改房间修改。小班课取值范围[0,16]，大班课取值范围[0,1]，当取值为0时表示当前课堂/直播，不支持连麦互动。</p> 
     * @return MaxMicNumber <p>设置课堂同时最大可与老师进行连麦互动的人数，该参数支持正式上课/开播前调用修改房间修改。小班课取值范围[0,16]，大班课取值范围[0,1]，当取值为0时表示当前课堂/直播，不支持连麦互动。</p>
     */
    public Long getMaxMicNumber() {
        return this.MaxMicNumber;
    }

    /**
     * Set <p>设置课堂同时最大可与老师进行连麦互动的人数，该参数支持正式上课/开播前调用修改房间修改。小班课取值范围[0,16]，大班课取值范围[0,1]，当取值为0时表示当前课堂/直播，不支持连麦互动。</p>
     * @param MaxMicNumber <p>设置课堂同时最大可与老师进行连麦互动的人数，该参数支持正式上课/开播前调用修改房间修改。小班课取值范围[0,16]，大班课取值范围[0,1]，当取值为0时表示当前课堂/直播，不支持连麦互动。</p>
     */
    public void setMaxMicNumber(Long MaxMicNumber) {
        this.MaxMicNumber = MaxMicNumber;
    }

    /**
     * Get <p>进入课堂时是否自动连麦。可以有以下取值：<br>0 不自动连麦（需要手动申请上麦，默认值）<br>1 自动连麦</p> 
     * @return AutoMic <p>进入课堂时是否自动连麦。可以有以下取值：<br>0 不自动连麦（需要手动申请上麦，默认值）<br>1 自动连麦</p>
     */
    public Long getAutoMic() {
        return this.AutoMic;
    }

    /**
     * Set <p>进入课堂时是否自动连麦。可以有以下取值：<br>0 不自动连麦（需要手动申请上麦，默认值）<br>1 自动连麦</p>
     * @param AutoMic <p>进入课堂时是否自动连麦。可以有以下取值：<br>0 不自动连麦（需要手动申请上麦，默认值）<br>1 自动连麦</p>
     */
    public void setAutoMic(Long AutoMic) {
        this.AutoMic = AutoMic;
    }

    /**
     * Get <p>高音质模式。可以有以下取值：<br>0 不开启高音质（默认值）<br>1 开启高音质</p> 
     * @return AudioQuality <p>高音质模式。可以有以下取值：<br>0 不开启高音质（默认值）<br>1 开启高音质</p>
     */
    public Long getAudioQuality() {
        return this.AudioQuality;
    }

    /**
     * Set <p>高音质模式。可以有以下取值：<br>0 不开启高音质（默认值）<br>1 开启高音质</p>
     * @param AudioQuality <p>高音质模式。可以有以下取值：<br>0 不开启高音质（默认值）<br>1 开启高音质</p>
     */
    public void setAudioQuality(Long AudioQuality) {
        this.AudioQuality = AudioQuality;
    }

    /**
     * Get <p>课堂子类型，可以有以下取值：videodoc 文档+视频video 纯视频</p> 
     * @return SubType <p>课堂子类型，可以有以下取值：videodoc 文档+视频video 纯视频</p>
     */
    public String getSubType() {
        return this.SubType;
    }

    /**
     * Set <p>课堂子类型，可以有以下取值：videodoc 文档+视频video 纯视频</p>
     * @param SubType <p>课堂子类型，可以有以下取值：videodoc 文档+视频video 纯视频</p>
     */
    public void setSubType(String SubType) {
        this.SubType = SubType;
    }

    /**
     * Get <p>录制方式。</p><p>枚举值：</p><ul><li>0： 开启自动录制</li><li>1： 禁止录制</li><li>2： 开启手动录制。（仅支持页面录制，需通过startRecord、stopRecord接口控制录制的开始和结束。）</li><li>3： 信令录制。</li></ul> 
     * @return DisableRecord <p>录制方式。</p><p>枚举值：</p><ul><li>0： 开启自动录制</li><li>1： 禁止录制</li><li>2： 开启手动录制。（仅支持页面录制，需通过startRecord、stopRecord接口控制录制的开始和结束。）</li><li>3： 信令录制。</li></ul>
     */
    public Long getDisableRecord() {
        return this.DisableRecord;
    }

    /**
     * Set <p>录制方式。</p><p>枚举值：</p><ul><li>0： 开启自动录制</li><li>1： 禁止录制</li><li>2： 开启手动录制。（仅支持页面录制，需通过startRecord、stopRecord接口控制录制的开始和结束。）</li><li>3： 信令录制。</li></ul>
     * @param DisableRecord <p>录制方式。</p><p>枚举值：</p><ul><li>0： 开启自动录制</li><li>1： 禁止录制</li><li>2： 开启手动录制。（仅支持页面录制，需通过startRecord、stopRecord接口控制录制的开始和结束。）</li><li>3： 信令录制。</li></ul>
     */
    public void setDisableRecord(Long DisableRecord) {
        this.DisableRecord = DisableRecord;
    }

    /**
     * Get <p>助教UserId列表。</p> 
     * @return Assistants <p>助教UserId列表。</p>
     */
    public String [] getAssistants() {
        return this.Assistants;
    }

    /**
     * Set <p>助教UserId列表。</p>
     * @param Assistants <p>助教UserId列表。</p>
     */
    public void setAssistants(String [] Assistants) {
        this.Assistants = Assistants;
    }

    /**
     * Get <p>录制地址（协议为https)。仅在房间结束后存在。</p> 
     * @return RecordUrl <p>录制地址（协议为https)。仅在房间结束后存在。</p>
     */
    public String getRecordUrl() {
        return this.RecordUrl;
    }

    /**
     * Set <p>录制地址（协议为https)。仅在房间结束后存在。</p>
     * @param RecordUrl <p>录制地址（协议为https)。仅在房间结束后存在。</p>
     */
    public void setRecordUrl(String RecordUrl) {
        this.RecordUrl = RecordUrl;
    }

    /**
     * Get <p>课堂状态。0为未开始，1为已开始，2为已结束，3为已过期。</p> 
     * @return Status <p>课堂状态。0为未开始，1为已开始，2为已结束，3为已过期。</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>课堂状态。0为未开始，1为已开始，2为已结束，3为已过期。</p>
     * @param Status <p>课堂状态。0为未开始，1为已开始，2为已结束，3为已过期。</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>课堂绑定的群组ID</p> 
     * @return GroupId <p>课堂绑定的群组ID</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>课堂绑定的群组ID</p>
     * @param GroupId <p>课堂绑定的群组ID</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>打开学生麦克风/摄像头的授权开关</p> 
     * @return EnableDirectControl <p>打开学生麦克风/摄像头的授权开关</p>
     */
    public Long getEnableDirectControl() {
        return this.EnableDirectControl;
    }

    /**
     * Set <p>打开学生麦克风/摄像头的授权开关</p>
     * @param EnableDirectControl <p>打开学生麦克风/摄像头的授权开关</p>
     */
    public void setEnableDirectControl(Long EnableDirectControl) {
        this.EnableDirectControl = EnableDirectControl;
    }

    /**
     * Get <p>开启专注模式。<br>0 收看全部角色音视频(默认)<br>1 只看老师和助教</p> 
     * @return InteractionMode <p>开启专注模式。<br>0 收看全部角色音视频(默认)<br>1 只看老师和助教</p>
     */
    public Long getInteractionMode() {
        return this.InteractionMode;
    }

    /**
     * Set <p>开启专注模式。<br>0 收看全部角色音视频(默认)<br>1 只看老师和助教</p>
     * @param InteractionMode <p>开启专注模式。<br>0 收看全部角色音视频(默认)<br>1 只看老师和助教</p>
     */
    public void setInteractionMode(Long InteractionMode) {
        this.InteractionMode = InteractionMode;
    }

    /**
     * Get <p>横竖屏。0：横屏开播（默认值）; 1：竖屏开播，当前仅支持移动端的纯视频类型</p> 
     * @return VideoOrientation <p>横竖屏。0：横屏开播（默认值）; 1：竖屏开播，当前仅支持移动端的纯视频类型</p>
     */
    public Long getVideoOrientation() {
        return this.VideoOrientation;
    }

    /**
     * Set <p>横竖屏。0：横屏开播（默认值）; 1：竖屏开播，当前仅支持移动端的纯视频类型</p>
     * @param VideoOrientation <p>横竖屏。0：横屏开播（默认值）; 1：竖屏开播，当前仅支持移动端的纯视频类型</p>
     */
    public void setVideoOrientation(Long VideoOrientation) {
        this.VideoOrientation = VideoOrientation;
    }

    /**
     * Get <p>该课堂是否开启了课后评分功能。0：未开启  1：开启</p> 
     * @return IsGradingRequiredPostClass <p>该课堂是否开启了课后评分功能。0：未开启  1：开启</p>
     */
    public Long getIsGradingRequiredPostClass() {
        return this.IsGradingRequiredPostClass;
    }

    /**
     * Set <p>该课堂是否开启了课后评分功能。0：未开启  1：开启</p>
     * @param IsGradingRequiredPostClass <p>该课堂是否开启了课后评分功能。0：未开启  1：开启</p>
     */
    public void setIsGradingRequiredPostClass(Long IsGradingRequiredPostClass) {
        this.IsGradingRequiredPostClass = IsGradingRequiredPostClass;
    }

    /**
     * Get <p>课堂类型: 0 小班课（默认值）; 1 大班课; 2 1V1 (预留参数，暂未开放); 3 圆桌会议 注：大班课的布局(layout)只有三分屏</p> 
     * @return RoomType <p>课堂类型: 0 小班课（默认值）; 1 大班课; 2 1V1 (预留参数，暂未开放); 3 圆桌会议 注：大班课的布局(layout)只有三分屏</p>
     */
    public Long getRoomType() {
        return this.RoomType;
    }

    /**
     * Set <p>课堂类型: 0 小班课（默认值）; 1 大班课; 2 1V1 (预留参数，暂未开放); 3 圆桌会议 注：大班课的布局(layout)只有三分屏</p>
     * @param RoomType <p>课堂类型: 0 小班课（默认值）; 1 大班课; 2 1V1 (预留参数，暂未开放); 3 圆桌会议 注：大班课的布局(layout)只有三分屏</p>
     */
    public void setRoomType(Long RoomType) {
        this.RoomType = RoomType;
    }

    /**
     * Get <p>录制时长</p> 
     * @return VideoDuration <p>录制时长</p>
     */
    public Long getVideoDuration() {
        return this.VideoDuration;
    }

    /**
     * Set <p>录制时长</p>
     * @param VideoDuration <p>录制时长</p>
     */
    public void setVideoDuration(Long VideoDuration) {
        this.VideoDuration = VideoDuration;
    }

    /**
     * Get <p>拖堂时间：单位分钟，0为不限制(默认值), -1为不能拖堂，大于0为拖堂的时间，最大值120分钟</p> 
     * @return EndDelayTime <p>拖堂时间：单位分钟，0为不限制(默认值), -1为不能拖堂，大于0为拖堂的时间，最大值120分钟</p>
     */
    public Long getEndDelayTime() {
        return this.EndDelayTime;
    }

    /**
     * Set <p>拖堂时间：单位分钟，0为不限制(默认值), -1为不能拖堂，大于0为拖堂的时间，最大值120分钟</p>
     * @param EndDelayTime <p>拖堂时间：单位分钟，0为不限制(默认值), -1为不能拖堂，大于0为拖堂的时间，最大值120分钟</p>
     */
    public void setEndDelayTime(Long EndDelayTime) {
        this.EndDelayTime = EndDelayTime;
    }

    /**
     * Get <p>直播类型：0 常规（默认）1 伪直播 2 RTMP推流直播</p> 
     * @return LiveType <p>直播类型：0 常规（默认）1 伪直播 2 RTMP推流直播</p>
     */
    public Long getLiveType() {
        return this.LiveType;
    }

    /**
     * Set <p>直播类型：0 常规（默认）1 伪直播 2 RTMP推流直播</p>
     * @param LiveType <p>直播类型：0 常规（默认）1 伪直播 2 RTMP推流直播</p>
     */
    public void setLiveType(Long LiveType) {
        this.LiveType = LiveType;
    }

    /**
     * Get <p>伪直播链接</p> 
     * @return RecordLiveUrl <p>伪直播链接</p>
     */
    public String getRecordLiveUrl() {
        return this.RecordLiveUrl;
    }

    /**
     * Set <p>伪直播链接</p>
     * @param RecordLiveUrl <p>伪直播链接</p>
     */
    public void setRecordLiveUrl(String RecordLiveUrl) {
        this.RecordLiveUrl = RecordLiveUrl;
    }

    /**
     * Get <p>是否自动开始上课：0 不自动上课（默认） 1 自动上课 live_type=1的时候有效</p> 
     * @return EnableAutoStart <p>是否自动开始上课：0 不自动上课（默认） 1 自动上课 live_type=1的时候有效</p>
     */
    public Long getEnableAutoStart() {
        return this.EnableAutoStart;
    }

    /**
     * Set <p>是否自动开始上课：0 不自动上课（默认） 1 自动上课 live_type=1的时候有效</p>
     * @param EnableAutoStart <p>是否自动开始上课：0 不自动上课（默认） 1 自动上课 live_type=1的时候有效</p>
     */
    public void setEnableAutoStart(Long EnableAutoStart) {
        this.EnableAutoStart = EnableAutoStart;
    }

    /**
     * Get <p>录制文件背景图片，支持png、jpg、jpeg、bmp格式，暂不支持透明通道</p> 
     * @return RecordBackground <p>录制文件背景图片，支持png、jpg、jpeg、bmp格式，暂不支持透明通道</p>
     */
    public String getRecordBackground() {
        return this.RecordBackground;
    }

    /**
     * Set <p>录制文件背景图片，支持png、jpg、jpeg、bmp格式，暂不支持透明通道</p>
     * @param RecordBackground <p>录制文件背景图片，支持png、jpg、jpeg、bmp格式，暂不支持透明通道</p>
     */
    public void setRecordBackground(String RecordBackground) {
        this.RecordBackground = RecordBackground;
    }

    /**
     * Get <p>RTMP推流链接</p> 
     * @return RTMPStreamingURL <p>RTMP推流链接</p>
     */
    public String getRTMPStreamingURL() {
        return this.RTMPStreamingURL;
    }

    /**
     * Set <p>RTMP推流链接</p>
     * @param RTMPStreamingURL <p>RTMP推流链接</p>
     */
    public void setRTMPStreamingURL(String RTMPStreamingURL) {
        this.RTMPStreamingURL = RTMPStreamingURL;
    }

    /**
     * Get <p>录制自定义场景。注意：仅recordlayout=9的时候此参数有效。需注意各类参数配置正确能够生效。不然会造成录制失败，失败后无法补救。数据内容为用户自定义场景参数，数据格式为json键值对方式，其中键值对的value为string类型。自定义场景参数的含义。如下：     scene：自定义js/css对应的场景值。如scene=recordScene，会加载 recordScene 场景对应的 js/css，这样就可以自定义录制页面的元素。     lng：录制页面对应的语种。如lng=en，则录制界面为en。（枚举值：en,zh，zh-TW，jp，ar，kr，vi）     customToken：录制页面中涉及客户自己的服务需要鉴权时进行配置。一般情况下，无需配置。</p> 
     * @return RecordScene <p>录制自定义场景。注意：仅recordlayout=9的时候此参数有效。需注意各类参数配置正确能够生效。不然会造成录制失败，失败后无法补救。数据内容为用户自定义场景参数，数据格式为json键值对方式，其中键值对的value为string类型。自定义场景参数的含义。如下：     scene：自定义js/css对应的场景值。如scene=recordScene，会加载 recordScene 场景对应的 js/css，这样就可以自定义录制页面的元素。     lng：录制页面对应的语种。如lng=en，则录制界面为en。（枚举值：en,zh，zh-TW，jp，ar，kr，vi）     customToken：录制页面中涉及客户自己的服务需要鉴权时进行配置。一般情况下，无需配置。</p>
     */
    public String getRecordScene() {
        return this.RecordScene;
    }

    /**
     * Set <p>录制自定义场景。注意：仅recordlayout=9的时候此参数有效。需注意各类参数配置正确能够生效。不然会造成录制失败，失败后无法补救。数据内容为用户自定义场景参数，数据格式为json键值对方式，其中键值对的value为string类型。自定义场景参数的含义。如下：     scene：自定义js/css对应的场景值。如scene=recordScene，会加载 recordScene 场景对应的 js/css，这样就可以自定义录制页面的元素。     lng：录制页面对应的语种。如lng=en，则录制界面为en。（枚举值：en,zh，zh-TW，jp，ar，kr，vi）     customToken：录制页面中涉及客户自己的服务需要鉴权时进行配置。一般情况下，无需配置。</p>
     * @param RecordScene <p>录制自定义场景。注意：仅recordlayout=9的时候此参数有效。需注意各类参数配置正确能够生效。不然会造成录制失败，失败后无法补救。数据内容为用户自定义场景参数，数据格式为json键值对方式，其中键值对的value为string类型。自定义场景参数的含义。如下：     scene：自定义js/css对应的场景值。如scene=recordScene，会加载 recordScene 场景对应的 js/css，这样就可以自定义录制页面的元素。     lng：录制页面对应的语种。如lng=en，则录制界面为en。（枚举值：en,zh，zh-TW，jp，ar，kr，vi）     customToken：录制页面中涉及客户自己的服务需要鉴权时进行配置。一般情况下，无需配置。</p>
     */
    public void setRecordScene(String RecordScene) {
        this.RecordScene = RecordScene;
    }

    /**
     * Get <p>录制自定义语言，仅recordlayout=9的时候此参数有效</p> 
     * @return RecordLang <p>录制自定义语言，仅recordlayout=9的时候此参数有效</p>
     */
    public String getRecordLang() {
        return this.RecordLang;
    }

    /**
     * Set <p>录制自定义语言，仅recordlayout=9的时候此参数有效</p>
     * @param RecordLang <p>录制自定义语言，仅recordlayout=9的时候此参数有效</p>
     */
    public void setRecordLang(String RecordLang) {
        this.RecordLang = RecordLang;
    }

    /**
     * Get <p>录制类型 0 仅录制混流（默认） ;1 录制混流+单流，该模式下除混流录制基础上，分别录制老师、台上学生的音视频流，每路录制都会产生相应的录制费用 。示例：0</p> 
     * @return RecordStream <p>录制类型 0 仅录制混流（默认） ;1 录制混流+单流，该模式下除混流录制基础上，分别录制老师、台上学生的音视频流，每路录制都会产生相应的录制费用 。示例：0</p>
     */
    public Long getRecordStream() {
        return this.RecordStream;
    }

    /**
     * Set <p>录制类型 0 仅录制混流（默认） ;1 录制混流+单流，该模式下除混流录制基础上，分别录制老师、台上学生的音视频流，每路录制都会产生相应的录制费用 。示例：0</p>
     * @param RecordStream <p>录制类型 0 仅录制混流（默认） ;1 录制混流+单流，该模式下除混流录制基础上，分别录制老师、台上学生的音视频流，每路录制都会产生相应的录制费用 。示例：0</p>
     */
    public void setRecordStream(Long RecordStream) {
        this.RecordStream = RecordStream;
    }

    /**
     * Get <p>录制模板。房间子类型为视频+白板（SubType=videodoc）时默认为3，房间子类型为纯视频（SubType=video）时默认为0。录制模板枚举值参考：https://cloud.tencent.com/document/product/1639/89744</p> 
     * @return RecordLayout <p>录制模板。房间子类型为视频+白板（SubType=videodoc）时默认为3，房间子类型为纯视频（SubType=video）时默认为0。录制模板枚举值参考：https://cloud.tencent.com/document/product/1639/89744</p>
     */
    public Long getRecordLayout() {
        return this.RecordLayout;
    }

    /**
     * Set <p>录制模板。房间子类型为视频+白板（SubType=videodoc）时默认为3，房间子类型为纯视频（SubType=video）时默认为0。录制模板枚举值参考：https://cloud.tencent.com/document/product/1639/89744</p>
     * @param RecordLayout <p>录制模板。房间子类型为视频+白板（SubType=videodoc）时默认为3，房间子类型为纯视频（SubType=video）时默认为0。录制模板枚举值参考：https://cloud.tencent.com/document/product/1639/89744</p>
     */
    public void setRecordLayout(Long RecordLayout) {
        this.RecordLayout = RecordLayout;
    }

    /**
     * Get <p>板书截图生成类型。0 不生成板书；1 全量模式；2 单页去重模式</p> 
     * @return WhiteBoardSnapshotMode <p>板书截图生成类型。0 不生成板书；1 全量模式；2 单页去重模式</p>
     */
    public Long getWhiteBoardSnapshotMode() {
        return this.WhiteBoardSnapshotMode;
    }

    /**
     * Set <p>板书截图生成类型。0 不生成板书；1 全量模式；2 单页去重模式</p>
     * @param WhiteBoardSnapshotMode <p>板书截图生成类型。0 不生成板书；1 全量模式；2 单页去重模式</p>
     */
    public void setWhiteBoardSnapshotMode(Long WhiteBoardSnapshotMode) {
        this.WhiteBoardSnapshotMode = WhiteBoardSnapshotMode;
    }

    /**
     * Get <p>字幕转写功能开关。可以有以下取值：<br>0 不开启字幕转写功能（默认值）<br>1 自动转写模式：上课自动开启，下课自动停止<br>2 手动转写模式：支持老师或者助教通过客户端API手动开启/关闭字幕转写<br>设置0和1时客户端均不展示手动开关，设置2时老师或者助教端展示字幕转写开关</p> 
     * @return SubtitlesTranscription <p>字幕转写功能开关。可以有以下取值：<br>0 不开启字幕转写功能（默认值）<br>1 自动转写模式：上课自动开启，下课自动停止<br>2 手动转写模式：支持老师或者助教通过客户端API手动开启/关闭字幕转写<br>设置0和1时客户端均不展示手动开关，设置2时老师或者助教端展示字幕转写开关</p>
     */
    public Long getSubtitlesTranscription() {
        return this.SubtitlesTranscription;
    }

    /**
     * Set <p>字幕转写功能开关。可以有以下取值：<br>0 不开启字幕转写功能（默认值）<br>1 自动转写模式：上课自动开启，下课自动停止<br>2 手动转写模式：支持老师或者助教通过客户端API手动开启/关闭字幕转写<br>设置0和1时客户端均不展示手动开关，设置2时老师或者助教端展示字幕转写开关</p>
     * @param SubtitlesTranscription <p>字幕转写功能开关。可以有以下取值：<br>0 不开启字幕转写功能（默认值）<br>1 自动转写模式：上课自动开启，下课自动停止<br>2 手动转写模式：支持老师或者助教通过客户端API手动开启/关闭字幕转写<br>设置0和1时客户端均不展示手动开关，设置2时老师或者助教端展示字幕转写开关</p>
     */
    public void setSubtitlesTranscription(Long SubtitlesTranscription) {
        this.SubtitlesTranscription = SubtitlesTranscription;
    }

    /**
     * Get <p>嘉宾Id列表。当圆桌会议模式（RoomType==3）时生效</p> 
     * @return Guests <p>嘉宾Id列表。当圆桌会议模式（RoomType==3）时生效</p>
     */
    public String [] getGuests() {
        return this.Guests;
    }

    /**
     * Set <p>嘉宾Id列表。当圆桌会议模式（RoomType==3）时生效</p>
     * @param Guests <p>嘉宾Id列表。当圆桌会议模式（RoomType==3）时生效</p>
     */
    public void setGuests(String [] Guests) {
        this.Guests = Guests;
    }

    /**
     * Get <p>录制文件合并开关。0 关闭 1 开启 注：只有在一节课多次启用手动录制时，此功能才有效</p> 
     * @return RecordMerge <p>录制文件合并开关。0 关闭 1 开启 注：只有在一节课多次启用手动录制时，此功能才有效</p>
     */
    public Long getRecordMerge() {
        return this.RecordMerge;
    }

    /**
     * Set <p>录制文件合并开关。0 关闭 1 开启 注：只有在一节课多次启用手动录制时，此功能才有效</p>
     * @param RecordMerge <p>录制文件合并开关。0 关闭 1 开启 注：只有在一节课多次启用手动录制时，此功能才有效</p>
     */
    public void setRecordMerge(Long RecordMerge) {
        this.RecordMerge = RecordMerge;
    }

    /**
     * Get <p>转推开关</p><p>枚举值：</p><ul><li>0： 关闭</li><li>1： 开启</li></ul> 
     * @return EnableLiveRelay <p>转推开关</p><p>枚举值：</p><ul><li>0： 关闭</li><li>1： 开启</li></ul>
     */
    public Long getEnableLiveRelay() {
        return this.EnableLiveRelay;
    }

    /**
     * Set <p>转推开关</p><p>枚举值：</p><ul><li>0： 关闭</li><li>1： 开启</li></ul>
     * @param EnableLiveRelay <p>转推开关</p><p>枚举值：</p><ul><li>0： 关闭</li><li>1： 开启</li></ul>
     */
    public void setEnableLiveRelay(Long EnableLiveRelay) {
        this.EnableLiveRelay = EnableLiveRelay;
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
        if (source.EnableLiveRelay != null) {
            this.EnableLiveRelay = new Long(source.EnableLiveRelay);
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
        this.setParamSimple(map, prefix + "WhiteBoardSnapshotMode", this.WhiteBoardSnapshotMode);
        this.setParamSimple(map, prefix + "SubtitlesTranscription", this.SubtitlesTranscription);
        this.setParamArraySimple(map, prefix + "Guests.", this.Guests);
        this.setParamSimple(map, prefix + "RecordMerge", this.RecordMerge);
        this.setParamSimple(map, prefix + "EnableLiveRelay", this.EnableLiveRelay);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

