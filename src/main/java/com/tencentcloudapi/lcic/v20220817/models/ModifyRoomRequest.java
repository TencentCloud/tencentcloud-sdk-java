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

public class ModifyRoomRequest extends AbstractModel {

    /**
    * 房间ID。
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * 低代码互动课堂的SdkAppId
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 预定的房间开始时间，unix时间戳（秒）。直播开始后不允许修改。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 预定的房间结束时间，unix时间戳（秒）。直播开始后不允许修改。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 老师ID。直播开始后不允许修改。
    */
    @SerializedName("TeacherId")
    @Expose
    private String TeacherId;

    /**
    * 房间名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 分辨率。可以有如下取值：
1 标清
2 高清
3 全高清
直播开始后不允许修改。
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
    * 进入房间时是否自动连麦。可以有以下取值：
0 不自动连麦（默认值）
1 自动连麦
直播开始后不允许修改。
    */
    @SerializedName("AutoMic")
    @Expose
    private Long AutoMic;

    /**
    * 高音质模式。可以有以下取值：
0 不开启高音质（默认值）
1 开启高音质
直播开始后不允许修改。
    */
    @SerializedName("AudioQuality")
    @Expose
    private Long AudioQuality;

    /**
    * 房间子类型，可以有以下取值：
videodoc 文档+视频
video 纯视频
直播开始后不允许修改。
    */
    @SerializedName("SubType")
    @Expose
    private String SubType;

    /**
    * 禁止录制。可以有以下取值：
0 不禁止录制（默认值）
1 禁止录制
直播开始后不允许修改。
    */
    @SerializedName("DisableRecord")
    @Expose
    private Long DisableRecord;

    /**
    * 助教Id列表。直播开始后不允许修改。
    */
    @SerializedName("Assistants")
    @Expose
    private String [] Assistants;

    /**
    * 房间绑定的群组ID。直播开始后不允许修改。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 打开学生麦克风/摄像头的授权开关。直播开始后不允许修改。
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
    * 开启课后评分。 0：不开启(默认)  1：开启
    */
    @SerializedName("IsGradingRequiredPostClass")
    @Expose
    private Long IsGradingRequiredPostClass;

    /**
    * 房间类型: 0 小班课（默认值）; 1 大班课; 2 1V1 （预留参数、暂未开放)
注：大班课的布局(layout)只有三分屏
    */
    @SerializedName("RoomType")
    @Expose
    private Long RoomType;

    /**
    * 录制模板。仅可修改还未开始的房间。录制模板枚举值参考：https://cloud.tencent.com/document/product/1639/89744
    */
    @SerializedName("RecordLayout")
    @Expose
    private Long RecordLayout;

    /**
    * 拖堂时间：单位分钟，0为不限制(默认值), -1为不能拖堂，大于0为拖堂的时间，最大值120分钟
    */
    @SerializedName("EndDelayTime")
    @Expose
    private Long EndDelayTime;

    /**
    * 直播方式：0 常规模式（默认）1 回放直播模式（伪直播）。 目前支持从回放直播模式（伪直播）改为常规模式，不支持从常规模式改为回放直播模式（伪直播）
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
    * 录制自定义场景，仅recordlayout=9的时候此参数有效,数据内容为用户自定义场景参数，数据格式为json键值对方式，其中键值对的value为string类型。
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
     * Get 房间ID。 
     * @return RoomId 房间ID。
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间ID。
     * @param RoomId 房间ID。
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 低代码互动课堂的SdkAppId 
     * @return SdkAppId 低代码互动课堂的SdkAppId
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 低代码互动课堂的SdkAppId
     * @param SdkAppId 低代码互动课堂的SdkAppId
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 预定的房间开始时间，unix时间戳（秒）。直播开始后不允许修改。 
     * @return StartTime 预定的房间开始时间，unix时间戳（秒）。直播开始后不允许修改。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 预定的房间开始时间，unix时间戳（秒）。直播开始后不允许修改。
     * @param StartTime 预定的房间开始时间，unix时间戳（秒）。直播开始后不允许修改。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 预定的房间结束时间，unix时间戳（秒）。直播开始后不允许修改。 
     * @return EndTime 预定的房间结束时间，unix时间戳（秒）。直播开始后不允许修改。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 预定的房间结束时间，unix时间戳（秒）。直播开始后不允许修改。
     * @param EndTime 预定的房间结束时间，unix时间戳（秒）。直播开始后不允许修改。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 老师ID。直播开始后不允许修改。 
     * @return TeacherId 老师ID。直播开始后不允许修改。
     */
    public String getTeacherId() {
        return this.TeacherId;
    }

    /**
     * Set 老师ID。直播开始后不允许修改。
     * @param TeacherId 老师ID。直播开始后不允许修改。
     */
    public void setTeacherId(String TeacherId) {
        this.TeacherId = TeacherId;
    }

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
     * Get 分辨率。可以有如下取值：
1 标清
2 高清
3 全高清
直播开始后不允许修改。 
     * @return Resolution 分辨率。可以有如下取值：
1 标清
2 高清
3 全高清
直播开始后不允许修改。
     */
    public Long getResolution() {
        return this.Resolution;
    }

    /**
     * Set 分辨率。可以有如下取值：
1 标清
2 高清
3 全高清
直播开始后不允许修改。
     * @param Resolution 分辨率。可以有如下取值：
1 标清
2 高清
3 全高清
直播开始后不允许修改。
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
     * Get 进入房间时是否自动连麦。可以有以下取值：
0 不自动连麦（默认值）
1 自动连麦
直播开始后不允许修改。 
     * @return AutoMic 进入房间时是否自动连麦。可以有以下取值：
0 不自动连麦（默认值）
1 自动连麦
直播开始后不允许修改。
     */
    public Long getAutoMic() {
        return this.AutoMic;
    }

    /**
     * Set 进入房间时是否自动连麦。可以有以下取值：
0 不自动连麦（默认值）
1 自动连麦
直播开始后不允许修改。
     * @param AutoMic 进入房间时是否自动连麦。可以有以下取值：
0 不自动连麦（默认值）
1 自动连麦
直播开始后不允许修改。
     */
    public void setAutoMic(Long AutoMic) {
        this.AutoMic = AutoMic;
    }

    /**
     * Get 高音质模式。可以有以下取值：
0 不开启高音质（默认值）
1 开启高音质
直播开始后不允许修改。 
     * @return AudioQuality 高音质模式。可以有以下取值：
0 不开启高音质（默认值）
1 开启高音质
直播开始后不允许修改。
     */
    public Long getAudioQuality() {
        return this.AudioQuality;
    }

    /**
     * Set 高音质模式。可以有以下取值：
0 不开启高音质（默认值）
1 开启高音质
直播开始后不允许修改。
     * @param AudioQuality 高音质模式。可以有以下取值：
0 不开启高音质（默认值）
1 开启高音质
直播开始后不允许修改。
     */
    public void setAudioQuality(Long AudioQuality) {
        this.AudioQuality = AudioQuality;
    }

    /**
     * Get 房间子类型，可以有以下取值：
videodoc 文档+视频
video 纯视频
直播开始后不允许修改。 
     * @return SubType 房间子类型，可以有以下取值：
videodoc 文档+视频
video 纯视频
直播开始后不允许修改。
     */
    public String getSubType() {
        return this.SubType;
    }

    /**
     * Set 房间子类型，可以有以下取值：
videodoc 文档+视频
video 纯视频
直播开始后不允许修改。
     * @param SubType 房间子类型，可以有以下取值：
videodoc 文档+视频
video 纯视频
直播开始后不允许修改。
     */
    public void setSubType(String SubType) {
        this.SubType = SubType;
    }

    /**
     * Get 禁止录制。可以有以下取值：
0 不禁止录制（默认值）
1 禁止录制
直播开始后不允许修改。 
     * @return DisableRecord 禁止录制。可以有以下取值：
0 不禁止录制（默认值）
1 禁止录制
直播开始后不允许修改。
     */
    public Long getDisableRecord() {
        return this.DisableRecord;
    }

    /**
     * Set 禁止录制。可以有以下取值：
0 不禁止录制（默认值）
1 禁止录制
直播开始后不允许修改。
     * @param DisableRecord 禁止录制。可以有以下取值：
0 不禁止录制（默认值）
1 禁止录制
直播开始后不允许修改。
     */
    public void setDisableRecord(Long DisableRecord) {
        this.DisableRecord = DisableRecord;
    }

    /**
     * Get 助教Id列表。直播开始后不允许修改。 
     * @return Assistants 助教Id列表。直播开始后不允许修改。
     */
    public String [] getAssistants() {
        return this.Assistants;
    }

    /**
     * Set 助教Id列表。直播开始后不允许修改。
     * @param Assistants 助教Id列表。直播开始后不允许修改。
     */
    public void setAssistants(String [] Assistants) {
        this.Assistants = Assistants;
    }

    /**
     * Get 房间绑定的群组ID。直播开始后不允许修改。 
     * @return GroupId 房间绑定的群组ID。直播开始后不允许修改。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 房间绑定的群组ID。直播开始后不允许修改。
     * @param GroupId 房间绑定的群组ID。直播开始后不允许修改。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 打开学生麦克风/摄像头的授权开关。直播开始后不允许修改。 
     * @return EnableDirectControl 打开学生麦克风/摄像头的授权开关。直播开始后不允许修改。
     */
    public Long getEnableDirectControl() {
        return this.EnableDirectControl;
    }

    /**
     * Set 打开学生麦克风/摄像头的授权开关。直播开始后不允许修改。
     * @param EnableDirectControl 打开学生麦克风/摄像头的授权开关。直播开始后不允许修改。
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
     * Get 房间类型: 0 小班课（默认值）; 1 大班课; 2 1V1 （预留参数、暂未开放)
注：大班课的布局(layout)只有三分屏 
     * @return RoomType 房间类型: 0 小班课（默认值）; 1 大班课; 2 1V1 （预留参数、暂未开放)
注：大班课的布局(layout)只有三分屏
     */
    public Long getRoomType() {
        return this.RoomType;
    }

    /**
     * Set 房间类型: 0 小班课（默认值）; 1 大班课; 2 1V1 （预留参数、暂未开放)
注：大班课的布局(layout)只有三分屏
     * @param RoomType 房间类型: 0 小班课（默认值）; 1 大班课; 2 1V1 （预留参数、暂未开放)
注：大班课的布局(layout)只有三分屏
     */
    public void setRoomType(Long RoomType) {
        this.RoomType = RoomType;
    }

    /**
     * Get 录制模板。仅可修改还未开始的房间。录制模板枚举值参考：https://cloud.tencent.com/document/product/1639/89744 
     * @return RecordLayout 录制模板。仅可修改还未开始的房间。录制模板枚举值参考：https://cloud.tencent.com/document/product/1639/89744
     */
    public Long getRecordLayout() {
        return this.RecordLayout;
    }

    /**
     * Set 录制模板。仅可修改还未开始的房间。录制模板枚举值参考：https://cloud.tencent.com/document/product/1639/89744
     * @param RecordLayout 录制模板。仅可修改还未开始的房间。录制模板枚举值参考：https://cloud.tencent.com/document/product/1639/89744
     */
    public void setRecordLayout(Long RecordLayout) {
        this.RecordLayout = RecordLayout;
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
     * Get 直播方式：0 常规模式（默认）1 回放直播模式（伪直播）。 目前支持从回放直播模式（伪直播）改为常规模式，不支持从常规模式改为回放直播模式（伪直播） 
     * @return LiveType 直播方式：0 常规模式（默认）1 回放直播模式（伪直播）。 目前支持从回放直播模式（伪直播）改为常规模式，不支持从常规模式改为回放直播模式（伪直播）
     */
    public Long getLiveType() {
        return this.LiveType;
    }

    /**
     * Set 直播方式：0 常规模式（默认）1 回放直播模式（伪直播）。 目前支持从回放直播模式（伪直播）改为常规模式，不支持从常规模式改为回放直播模式（伪直播）
     * @param LiveType 直播方式：0 常规模式（默认）1 回放直播模式（伪直播）。 目前支持从回放直播模式（伪直播）改为常规模式，不支持从常规模式改为回放直播模式（伪直播）
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
     * Get 录制自定义场景，仅recordlayout=9的时候此参数有效,数据内容为用户自定义场景参数，数据格式为json键值对方式，其中键值对的value为string类型。 
     * @return RecordScene 录制自定义场景，仅recordlayout=9的时候此参数有效,数据内容为用户自定义场景参数，数据格式为json键值对方式，其中键值对的value为string类型。
     */
    public String getRecordScene() {
        return this.RecordScene;
    }

    /**
     * Set 录制自定义场景，仅recordlayout=9的时候此参数有效,数据内容为用户自定义场景参数，数据格式为json键值对方式，其中键值对的value为string类型。
     * @param RecordScene 录制自定义场景，仅recordlayout=9的时候此参数有效,数据内容为用户自定义场景参数，数据格式为json键值对方式，其中键值对的value为string类型。
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

    }
}

