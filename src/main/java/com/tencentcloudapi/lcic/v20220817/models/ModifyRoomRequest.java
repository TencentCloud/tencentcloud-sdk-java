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

public class ModifyRoomRequest extends AbstractModel {

    /**
    * <p>房间ID。</p>
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * <p>低代码互动课堂的SdkAppId</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>预定的房间开始时间，unix时间戳（秒）。直播开始后不允许修改。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>预定的房间结束时间，unix时间戳（秒）。直播开始后不允许修改。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>老师ID。直播开始后不允许修改。</p>
    */
    @SerializedName("TeacherId")
    @Expose
    private String TeacherId;

    /**
    * <p>房间名称。<br>字符数不超过256</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>分辨率。可以有如下取值：<br>1 标清<br>2 高清<br>3 全高清<br>直播开始后不允许修改。</p>
    */
    @SerializedName("Resolution")
    @Expose
    private Long Resolution;

    /**
    * <p>设置房间/课堂同时最大可与老师进行连麦互动的人数，该参数支持正式上课/开播前调用修改房间修改。小班课取值范围[0,16]，大班课取值范围[0,1]，当取值为0时表示当前课堂/直播，不支持连麦互动。</p>
    */
    @SerializedName("MaxMicNumber")
    @Expose
    private Long MaxMicNumber;

    /**
    * <p>进入房间时是否自动连麦。可以有以下取值：<br>0 不自动连麦（默认值）<br>1 自动连麦<br>直播开始后不允许修改。</p>
    */
    @SerializedName("AutoMic")
    @Expose
    private Long AutoMic;

    /**
    * <p>高音质模式。可以有以下取值：<br>0 不开启高音质（默认值）<br>1 开启高音质<br>直播开始后不允许修改。</p>
    */
    @SerializedName("AudioQuality")
    @Expose
    private Long AudioQuality;

    /**
    * <p>房间子类型，可以有以下取值：<br>videodoc 文档+视频<br>video 纯视频<br>直播开始后不允许修改。</p>
    */
    @SerializedName("SubType")
    @Expose
    private String SubType;

    /**
    * <p>禁止录制。可以有以下取值：<br>0 不禁止录制（默认值）<br>1 禁止录制<br>直播开始后不允许修改。</p>
    */
    @SerializedName("DisableRecord")
    @Expose
    private Long DisableRecord;

    /**
    * <p>助教Id列表。直播开始后不允许修改。</p>
    */
    @SerializedName("Assistants")
    @Expose
    private String [] Assistants;

    /**
    * <p>房间绑定的群组ID。直播开始后不允许修改。</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>打开学生麦克风/摄像头的授权开关。直播开始后不允许修改。</p>
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
    * <p>开启课后评分。 0：不开启(默认)  1：开启</p>
    */
    @SerializedName("IsGradingRequiredPostClass")
    @Expose
    private Long IsGradingRequiredPostClass;

    /**
    * <p>房间类型: 0 小班课（默认值）; 1 大班课; 2 1V1 （预留参数、暂未开放)<br>注：大班课的布局(layout)只有三分屏</p>
    */
    @SerializedName("RoomType")
    @Expose
    private Long RoomType;

    /**
    * <p>录制模板。仅可修改还未开始的房间。录制模板枚举值参考：https://cloud.tencent.com/document/product/1639/89744</p>
    */
    @SerializedName("RecordLayout")
    @Expose
    private Long RecordLayout;

    /**
    * <p>拖堂时间：单位分钟，0为不限制(默认值), -1为不能拖堂，大于0为拖堂的时间，最大值120分钟</p>
    */
    @SerializedName("EndDelayTime")
    @Expose
    private Long EndDelayTime;

    /**
    * <p>直播方式：0 常规模式（默认）1 回放直播模式（伪直播）。 目前支持从回放直播模式（伪直播）改为常规模式，不支持从常规模式改为回放直播模式（伪直播）</p>
    */
    @SerializedName("LiveType")
    @Expose
    private Long LiveType;

    /**
    * <p>伪直播链接。 支持的协议以及格式： 协议：HTTP、HTTPS、RTMP、HLS 。格式：FLV、MP3、MP4、MPEG-TS、MOV、MKV、M4A。视频编码：H.264、VP8。音频编码：AAC、OPUS。</p><p>注意：伪直播视频规格建议最高使用1080p 30fps，4k视频会有兼容性问题导致直播失败。</p>
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
    * <p>录制自定义场景，仅recordlayout=9的时候此参数有效,数据内容为用户自定义场景参数，数据格式为json键值对方式，其中键值对的value为string类型。</p>
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
     * Get <p>房间ID。</p> 
     * @return RoomId <p>房间ID。</p>
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set <p>房间ID。</p>
     * @param RoomId <p>房间ID。</p>
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get <p>低代码互动课堂的SdkAppId</p> 
     * @return SdkAppId <p>低代码互动课堂的SdkAppId</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>低代码互动课堂的SdkAppId</p>
     * @param SdkAppId <p>低代码互动课堂的SdkAppId</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>预定的房间开始时间，unix时间戳（秒）。直播开始后不允许修改。</p> 
     * @return StartTime <p>预定的房间开始时间，unix时间戳（秒）。直播开始后不允许修改。</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>预定的房间开始时间，unix时间戳（秒）。直播开始后不允许修改。</p>
     * @param StartTime <p>预定的房间开始时间，unix时间戳（秒）。直播开始后不允许修改。</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>预定的房间结束时间，unix时间戳（秒）。直播开始后不允许修改。</p> 
     * @return EndTime <p>预定的房间结束时间，unix时间戳（秒）。直播开始后不允许修改。</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>预定的房间结束时间，unix时间戳（秒）。直播开始后不允许修改。</p>
     * @param EndTime <p>预定的房间结束时间，unix时间戳（秒）。直播开始后不允许修改。</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>老师ID。直播开始后不允许修改。</p> 
     * @return TeacherId <p>老师ID。直播开始后不允许修改。</p>
     */
    public String getTeacherId() {
        return this.TeacherId;
    }

    /**
     * Set <p>老师ID。直播开始后不允许修改。</p>
     * @param TeacherId <p>老师ID。直播开始后不允许修改。</p>
     */
    public void setTeacherId(String TeacherId) {
        this.TeacherId = TeacherId;
    }

    /**
     * Get <p>房间名称。<br>字符数不超过256</p> 
     * @return Name <p>房间名称。<br>字符数不超过256</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>房间名称。<br>字符数不超过256</p>
     * @param Name <p>房间名称。<br>字符数不超过256</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>分辨率。可以有如下取值：<br>1 标清<br>2 高清<br>3 全高清<br>直播开始后不允许修改。</p> 
     * @return Resolution <p>分辨率。可以有如下取值：<br>1 标清<br>2 高清<br>3 全高清<br>直播开始后不允许修改。</p>
     */
    public Long getResolution() {
        return this.Resolution;
    }

    /**
     * Set <p>分辨率。可以有如下取值：<br>1 标清<br>2 高清<br>3 全高清<br>直播开始后不允许修改。</p>
     * @param Resolution <p>分辨率。可以有如下取值：<br>1 标清<br>2 高清<br>3 全高清<br>直播开始后不允许修改。</p>
     */
    public void setResolution(Long Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get <p>设置房间/课堂同时最大可与老师进行连麦互动的人数，该参数支持正式上课/开播前调用修改房间修改。小班课取值范围[0,16]，大班课取值范围[0,1]，当取值为0时表示当前课堂/直播，不支持连麦互动。</p> 
     * @return MaxMicNumber <p>设置房间/课堂同时最大可与老师进行连麦互动的人数，该参数支持正式上课/开播前调用修改房间修改。小班课取值范围[0,16]，大班课取值范围[0,1]，当取值为0时表示当前课堂/直播，不支持连麦互动。</p>
     */
    public Long getMaxMicNumber() {
        return this.MaxMicNumber;
    }

    /**
     * Set <p>设置房间/课堂同时最大可与老师进行连麦互动的人数，该参数支持正式上课/开播前调用修改房间修改。小班课取值范围[0,16]，大班课取值范围[0,1]，当取值为0时表示当前课堂/直播，不支持连麦互动。</p>
     * @param MaxMicNumber <p>设置房间/课堂同时最大可与老师进行连麦互动的人数，该参数支持正式上课/开播前调用修改房间修改。小班课取值范围[0,16]，大班课取值范围[0,1]，当取值为0时表示当前课堂/直播，不支持连麦互动。</p>
     */
    public void setMaxMicNumber(Long MaxMicNumber) {
        this.MaxMicNumber = MaxMicNumber;
    }

    /**
     * Get <p>进入房间时是否自动连麦。可以有以下取值：<br>0 不自动连麦（默认值）<br>1 自动连麦<br>直播开始后不允许修改。</p> 
     * @return AutoMic <p>进入房间时是否自动连麦。可以有以下取值：<br>0 不自动连麦（默认值）<br>1 自动连麦<br>直播开始后不允许修改。</p>
     */
    public Long getAutoMic() {
        return this.AutoMic;
    }

    /**
     * Set <p>进入房间时是否自动连麦。可以有以下取值：<br>0 不自动连麦（默认值）<br>1 自动连麦<br>直播开始后不允许修改。</p>
     * @param AutoMic <p>进入房间时是否自动连麦。可以有以下取值：<br>0 不自动连麦（默认值）<br>1 自动连麦<br>直播开始后不允许修改。</p>
     */
    public void setAutoMic(Long AutoMic) {
        this.AutoMic = AutoMic;
    }

    /**
     * Get <p>高音质模式。可以有以下取值：<br>0 不开启高音质（默认值）<br>1 开启高音质<br>直播开始后不允许修改。</p> 
     * @return AudioQuality <p>高音质模式。可以有以下取值：<br>0 不开启高音质（默认值）<br>1 开启高音质<br>直播开始后不允许修改。</p>
     */
    public Long getAudioQuality() {
        return this.AudioQuality;
    }

    /**
     * Set <p>高音质模式。可以有以下取值：<br>0 不开启高音质（默认值）<br>1 开启高音质<br>直播开始后不允许修改。</p>
     * @param AudioQuality <p>高音质模式。可以有以下取值：<br>0 不开启高音质（默认值）<br>1 开启高音质<br>直播开始后不允许修改。</p>
     */
    public void setAudioQuality(Long AudioQuality) {
        this.AudioQuality = AudioQuality;
    }

    /**
     * Get <p>房间子类型，可以有以下取值：<br>videodoc 文档+视频<br>video 纯视频<br>直播开始后不允许修改。</p> 
     * @return SubType <p>房间子类型，可以有以下取值：<br>videodoc 文档+视频<br>video 纯视频<br>直播开始后不允许修改。</p>
     */
    public String getSubType() {
        return this.SubType;
    }

    /**
     * Set <p>房间子类型，可以有以下取值：<br>videodoc 文档+视频<br>video 纯视频<br>直播开始后不允许修改。</p>
     * @param SubType <p>房间子类型，可以有以下取值：<br>videodoc 文档+视频<br>video 纯视频<br>直播开始后不允许修改。</p>
     */
    public void setSubType(String SubType) {
        this.SubType = SubType;
    }

    /**
     * Get <p>禁止录制。可以有以下取值：<br>0 不禁止录制（默认值）<br>1 禁止录制<br>直播开始后不允许修改。</p> 
     * @return DisableRecord <p>禁止录制。可以有以下取值：<br>0 不禁止录制（默认值）<br>1 禁止录制<br>直播开始后不允许修改。</p>
     */
    public Long getDisableRecord() {
        return this.DisableRecord;
    }

    /**
     * Set <p>禁止录制。可以有以下取值：<br>0 不禁止录制（默认值）<br>1 禁止录制<br>直播开始后不允许修改。</p>
     * @param DisableRecord <p>禁止录制。可以有以下取值：<br>0 不禁止录制（默认值）<br>1 禁止录制<br>直播开始后不允许修改。</p>
     */
    public void setDisableRecord(Long DisableRecord) {
        this.DisableRecord = DisableRecord;
    }

    /**
     * Get <p>助教Id列表。直播开始后不允许修改。</p> 
     * @return Assistants <p>助教Id列表。直播开始后不允许修改。</p>
     */
    public String [] getAssistants() {
        return this.Assistants;
    }

    /**
     * Set <p>助教Id列表。直播开始后不允许修改。</p>
     * @param Assistants <p>助教Id列表。直播开始后不允许修改。</p>
     */
    public void setAssistants(String [] Assistants) {
        this.Assistants = Assistants;
    }

    /**
     * Get <p>房间绑定的群组ID。直播开始后不允许修改。</p> 
     * @return GroupId <p>房间绑定的群组ID。直播开始后不允许修改。</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>房间绑定的群组ID。直播开始后不允许修改。</p>
     * @param GroupId <p>房间绑定的群组ID。直播开始后不允许修改。</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>打开学生麦克风/摄像头的授权开关。直播开始后不允许修改。</p> 
     * @return EnableDirectControl <p>打开学生麦克风/摄像头的授权开关。直播开始后不允许修改。</p>
     */
    public Long getEnableDirectControl() {
        return this.EnableDirectControl;
    }

    /**
     * Set <p>打开学生麦克风/摄像头的授权开关。直播开始后不允许修改。</p>
     * @param EnableDirectControl <p>打开学生麦克风/摄像头的授权开关。直播开始后不允许修改。</p>
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
     * Get <p>开启课后评分。 0：不开启(默认)  1：开启</p> 
     * @return IsGradingRequiredPostClass <p>开启课后评分。 0：不开启(默认)  1：开启</p>
     */
    public Long getIsGradingRequiredPostClass() {
        return this.IsGradingRequiredPostClass;
    }

    /**
     * Set <p>开启课后评分。 0：不开启(默认)  1：开启</p>
     * @param IsGradingRequiredPostClass <p>开启课后评分。 0：不开启(默认)  1：开启</p>
     */
    public void setIsGradingRequiredPostClass(Long IsGradingRequiredPostClass) {
        this.IsGradingRequiredPostClass = IsGradingRequiredPostClass;
    }

    /**
     * Get <p>房间类型: 0 小班课（默认值）; 1 大班课; 2 1V1 （预留参数、暂未开放)<br>注：大班课的布局(layout)只有三分屏</p> 
     * @return RoomType <p>房间类型: 0 小班课（默认值）; 1 大班课; 2 1V1 （预留参数、暂未开放)<br>注：大班课的布局(layout)只有三分屏</p>
     */
    public Long getRoomType() {
        return this.RoomType;
    }

    /**
     * Set <p>房间类型: 0 小班课（默认值）; 1 大班课; 2 1V1 （预留参数、暂未开放)<br>注：大班课的布局(layout)只有三分屏</p>
     * @param RoomType <p>房间类型: 0 小班课（默认值）; 1 大班课; 2 1V1 （预留参数、暂未开放)<br>注：大班课的布局(layout)只有三分屏</p>
     */
    public void setRoomType(Long RoomType) {
        this.RoomType = RoomType;
    }

    /**
     * Get <p>录制模板。仅可修改还未开始的房间。录制模板枚举值参考：https://cloud.tencent.com/document/product/1639/89744</p> 
     * @return RecordLayout <p>录制模板。仅可修改还未开始的房间。录制模板枚举值参考：https://cloud.tencent.com/document/product/1639/89744</p>
     */
    public Long getRecordLayout() {
        return this.RecordLayout;
    }

    /**
     * Set <p>录制模板。仅可修改还未开始的房间。录制模板枚举值参考：https://cloud.tencent.com/document/product/1639/89744</p>
     * @param RecordLayout <p>录制模板。仅可修改还未开始的房间。录制模板枚举值参考：https://cloud.tencent.com/document/product/1639/89744</p>
     */
    public void setRecordLayout(Long RecordLayout) {
        this.RecordLayout = RecordLayout;
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
     * Get <p>直播方式：0 常规模式（默认）1 回放直播模式（伪直播）。 目前支持从回放直播模式（伪直播）改为常规模式，不支持从常规模式改为回放直播模式（伪直播）</p> 
     * @return LiveType <p>直播方式：0 常规模式（默认）1 回放直播模式（伪直播）。 目前支持从回放直播模式（伪直播）改为常规模式，不支持从常规模式改为回放直播模式（伪直播）</p>
     */
    public Long getLiveType() {
        return this.LiveType;
    }

    /**
     * Set <p>直播方式：0 常规模式（默认）1 回放直播模式（伪直播）。 目前支持从回放直播模式（伪直播）改为常规模式，不支持从常规模式改为回放直播模式（伪直播）</p>
     * @param LiveType <p>直播方式：0 常规模式（默认）1 回放直播模式（伪直播）。 目前支持从回放直播模式（伪直播）改为常规模式，不支持从常规模式改为回放直播模式（伪直播）</p>
     */
    public void setLiveType(Long LiveType) {
        this.LiveType = LiveType;
    }

    /**
     * Get <p>伪直播链接。 支持的协议以及格式： 协议：HTTP、HTTPS、RTMP、HLS 。格式：FLV、MP3、MP4、MPEG-TS、MOV、MKV、M4A。视频编码：H.264、VP8。音频编码：AAC、OPUS。</p><p>注意：伪直播视频规格建议最高使用1080p 30fps，4k视频会有兼容性问题导致直播失败。</p> 
     * @return RecordLiveUrl <p>伪直播链接。 支持的协议以及格式： 协议：HTTP、HTTPS、RTMP、HLS 。格式：FLV、MP3、MP4、MPEG-TS、MOV、MKV、M4A。视频编码：H.264、VP8。音频编码：AAC、OPUS。</p><p>注意：伪直播视频规格建议最高使用1080p 30fps，4k视频会有兼容性问题导致直播失败。</p>
     */
    public String getRecordLiveUrl() {
        return this.RecordLiveUrl;
    }

    /**
     * Set <p>伪直播链接。 支持的协议以及格式： 协议：HTTP、HTTPS、RTMP、HLS 。格式：FLV、MP3、MP4、MPEG-TS、MOV、MKV、M4A。视频编码：H.264、VP8。音频编码：AAC、OPUS。</p><p>注意：伪直播视频规格建议最高使用1080p 30fps，4k视频会有兼容性问题导致直播失败。</p>
     * @param RecordLiveUrl <p>伪直播链接。 支持的协议以及格式： 协议：HTTP、HTTPS、RTMP、HLS 。格式：FLV、MP3、MP4、MPEG-TS、MOV、MKV、M4A。视频编码：H.264、VP8。音频编码：AAC、OPUS。</p><p>注意：伪直播视频规格建议最高使用1080p 30fps，4k视频会有兼容性问题导致直播失败。</p>
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
     * Get <p>录制自定义场景，仅recordlayout=9的时候此参数有效,数据内容为用户自定义场景参数，数据格式为json键值对方式，其中键值对的value为string类型。</p> 
     * @return RecordScene <p>录制自定义场景，仅recordlayout=9的时候此参数有效,数据内容为用户自定义场景参数，数据格式为json键值对方式，其中键值对的value为string类型。</p>
     */
    public String getRecordScene() {
        return this.RecordScene;
    }

    /**
     * Set <p>录制自定义场景，仅recordlayout=9的时候此参数有效,数据内容为用户自定义场景参数，数据格式为json键值对方式，其中键值对的value为string类型。</p>
     * @param RecordScene <p>录制自定义场景，仅recordlayout=9的时候此参数有效,数据内容为用户自定义场景参数，数据格式为json键值对方式，其中键值对的value为string类型。</p>
     */
    public void setRecordScene(String RecordScene) {
        this.RecordScene = RecordScene;
    }

    /**
     * Get <p>录制自定义语言，仅recordlayout=9的时候此参数有效</p> 
     * @return RecordLang <p>录制自定义语言，仅recordlayout=9的时候此参数有效</p>
     * @deprecated
     */
    @Deprecated
    public String getRecordLang() {
        return this.RecordLang;
    }

    /**
     * Set <p>录制自定义语言，仅recordlayout=9的时候此参数有效</p>
     * @param RecordLang <p>录制自定义语言，仅recordlayout=9的时候此参数有效</p>
     * @deprecated
     */
    @Deprecated
    public void setRecordLang(String RecordLang) {
        this.RecordLang = RecordLang;
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

    public ModifyRoomRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRoomRequest(ModifyRoomRequest source) {
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
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
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        if (source.RecordLayout != null) {
            this.RecordLayout = new Long(source.RecordLayout);
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
        if (source.RecordScene != null) {
            this.RecordScene = new String(source.RecordScene);
        }
        if (source.RecordLang != null) {
            this.RecordLang = new String(source.RecordLang);
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
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TeacherId", this.TeacherId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "MaxMicNumber", this.MaxMicNumber);
        this.setParamSimple(map, prefix + "AutoMic", this.AutoMic);
        this.setParamSimple(map, prefix + "AudioQuality", this.AudioQuality);
        this.setParamSimple(map, prefix + "SubType", this.SubType);
        this.setParamSimple(map, prefix + "DisableRecord", this.DisableRecord);
        this.setParamArraySimple(map, prefix + "Assistants.", this.Assistants);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "EnableDirectControl", this.EnableDirectControl);
        this.setParamSimple(map, prefix + "InteractionMode", this.InteractionMode);
        this.setParamSimple(map, prefix + "VideoOrientation", this.VideoOrientation);
        this.setParamSimple(map, prefix + "IsGradingRequiredPostClass", this.IsGradingRequiredPostClass);
        this.setParamSimple(map, prefix + "RoomType", this.RoomType);
        this.setParamSimple(map, prefix + "RecordLayout", this.RecordLayout);
        this.setParamSimple(map, prefix + "EndDelayTime", this.EndDelayTime);
        this.setParamSimple(map, prefix + "LiveType", this.LiveType);
        this.setParamSimple(map, prefix + "RecordLiveUrl", this.RecordLiveUrl);
        this.setParamSimple(map, prefix + "EnableAutoStart", this.EnableAutoStart);
        this.setParamSimple(map, prefix + "RecordScene", this.RecordScene);
        this.setParamSimple(map, prefix + "RecordLang", this.RecordLang);
        this.setParamSimple(map, prefix + "WhiteBoardSnapshotMode", this.WhiteBoardSnapshotMode);
        this.setParamSimple(map, prefix + "SubtitlesTranscription", this.SubtitlesTranscription);
        this.setParamArraySimple(map, prefix + "Guests.", this.Guests);
        this.setParamSimple(map, prefix + "RecordMerge", this.RecordMerge);

    }
}

