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

public class RoomItem extends AbstractModel {

    /**
    * 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 房间ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * 房间状态。0 未开始 ；1进行中  ；2 已结束；3已过期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 实际开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealStartTime")
    @Expose
    private Long RealStartTime;

    /**
    * 实际结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealEndTime")
    @Expose
    private Long RealEndTime;

    /**
    * 分辨率。1 标清
2 高清
3 全高清
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resolution")
    @Expose
    private Long Resolution;

    /**
    * 最大允许连麦人数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxRTCMember")
    @Expose
    private Long MaxRTCMember;

    /**
    * 房间录制地址。已废弃，使用新字段 RecordUrl
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReplayUrl")
    @Expose
    private String ReplayUrl;

    /**
    * 录制地址（协议为https)。仅在房间结束后存在。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordUrl")
    @Expose
    private String RecordUrl;

    /**
    * 最高房间内人数（不包括老师），0表示不限制，默认为0
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxMicNumber")
    @Expose
    private Long MaxMicNumber;

    /**
    * 打开学生麦克风/摄像头的授权开关 
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableDirectControl")
    @Expose
    private Long EnableDirectControl;

    /**
    * 开启专注模式。 0 收看全部角色音视频(默认) 1 只看老师和助教
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InteractionMode")
    @Expose
    private Long InteractionMode;

    /**
    * 横竖屏。0：横屏开播（默认值）; 1：竖屏开播，当前仅支持移动端的纯视频类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoOrientation")
    @Expose
    private Long VideoOrientation;

    /**
    * 开启课后评分。 0：不开启(默认)  1：开启
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsGradingRequiredPostClass")
    @Expose
    private Long IsGradingRequiredPostClass;

    /**
    * 房间类型。0:小班课（默认值）；1:大班课；2:1V1（后续扩展）
注：大班课的布局(layout)只有三分屏
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoomType")
    @Expose
    private Long RoomType;

    /**
    * 拖堂时间：单位分钟，0为不限制(默认值), -1为不能拖堂，大于0为拖堂的时间，最大值120分钟
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndDelayTime")
    @Expose
    private Long EndDelayTime;

    /**
    * 直播类型：0 常规（默认）1 伪直播
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LiveType")
    @Expose
    private Long LiveType;

    /**
    * 伪直播回放链接	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordLiveUrl")
    @Expose
    private String RecordLiveUrl;

    /**
    * 是否自动开始上课：0 不自动上课（默认） 1 自动上课 live_type=1的时候有效	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableAutoStart")
    @Expose
    private Long EnableAutoStart;

    /**
    * 录制文件背景图片，支持png、jpg、jpeg、bmp格式，暂不支持透明通道
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordBackground")
    @Expose
    private String RecordBackground;

    /**
    * 录制自定义场景，仅recordlayout=9的时候此参数有效,数据内容为用户自定义场景参数，数据格式为json键值对方式，其中键值对的value为string类型。
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 房间ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoomId 房间ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoomId 房间ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 房间状态。0 未开始 ；1进行中  ；2 已结束；3已过期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 房间状态。0 未开始 ；1进行中  ；2 已结束；3已过期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 房间状态。0 未开始 ；1进行中  ；2 已结束；3已过期
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 房间状态。0 未开始 ；1进行中  ；2 已结束；3已过期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 实际开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealStartTime 实际开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRealStartTime() {
        return this.RealStartTime;
    }

    /**
     * Set 实际开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealStartTime 实际开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealStartTime(Long RealStartTime) {
        this.RealStartTime = RealStartTime;
    }

    /**
     * Get 实际结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealEndTime 实际结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRealEndTime() {
        return this.RealEndTime;
    }

    /**
     * Set 实际结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealEndTime 实际结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealEndTime(Long RealEndTime) {
        this.RealEndTime = RealEndTime;
    }

    /**
     * Get 分辨率。1 标清
2 高清
3 全高清
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resolution 分辨率。1 标清
2 高清
3 全高清
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResolution() {
        return this.Resolution;
    }

    /**
     * Set 分辨率。1 标清
2 高清
3 全高清
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resolution 分辨率。1 标清
2 高清
3 全高清
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResolution(Long Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get 最大允许连麦人数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxRTCMember 最大允许连麦人数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxRTCMember() {
        return this.MaxRTCMember;
    }

    /**
     * Set 最大允许连麦人数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxRTCMember 最大允许连麦人数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxRTCMember(Long MaxRTCMember) {
        this.MaxRTCMember = MaxRTCMember;
    }

    /**
     * Get 房间录制地址。已废弃，使用新字段 RecordUrl
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReplayUrl 房间录制地址。已废弃，使用新字段 RecordUrl
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReplayUrl() {
        return this.ReplayUrl;
    }

    /**
     * Set 房间录制地址。已废弃，使用新字段 RecordUrl
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReplayUrl 房间录制地址。已废弃，使用新字段 RecordUrl
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplayUrl(String ReplayUrl) {
        this.ReplayUrl = ReplayUrl;
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
     * Get 最高房间内人数（不包括老师），0表示不限制，默认为0
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxMicNumber 最高房间内人数（不包括老师），0表示不限制，默认为0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxMicNumber() {
        return this.MaxMicNumber;
    }

    /**
     * Set 最高房间内人数（不包括老师），0表示不限制，默认为0
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxMicNumber 最高房间内人数（不包括老师），0表示不限制，默认为0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxMicNumber(Long MaxMicNumber) {
        this.MaxMicNumber = MaxMicNumber;
    }

    /**
     * Get 打开学生麦克风/摄像头的授权开关 
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableDirectControl 打开学生麦克风/摄像头的授权开关 
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnableDirectControl() {
        return this.EnableDirectControl;
    }

    /**
     * Set 打开学生麦克风/摄像头的授权开关 
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableDirectControl 打开学生麦克风/摄像头的授权开关 
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableDirectControl(Long EnableDirectControl) {
        this.EnableDirectControl = EnableDirectControl;
    }

    /**
     * Get 开启专注模式。 0 收看全部角色音视频(默认) 1 只看老师和助教
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InteractionMode 开启专注模式。 0 收看全部角色音视频(默认) 1 只看老师和助教
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInteractionMode() {
        return this.InteractionMode;
    }

    /**
     * Set 开启专注模式。 0 收看全部角色音视频(默认) 1 只看老师和助教
注意：此字段可能返回 null，表示取不到有效值。
     * @param InteractionMode 开启专注模式。 0 收看全部角色音视频(默认) 1 只看老师和助教
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInteractionMode(Long InteractionMode) {
        this.InteractionMode = InteractionMode;
    }

    /**
     * Get 横竖屏。0：横屏开播（默认值）; 1：竖屏开播，当前仅支持移动端的纯视频类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoOrientation 横竖屏。0：横屏开播（默认值）; 1：竖屏开播，当前仅支持移动端的纯视频类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVideoOrientation() {
        return this.VideoOrientation;
    }

    /**
     * Set 横竖屏。0：横屏开播（默认值）; 1：竖屏开播，当前仅支持移动端的纯视频类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoOrientation 横竖屏。0：横屏开播（默认值）; 1：竖屏开播，当前仅支持移动端的纯视频类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoOrientation(Long VideoOrientation) {
        this.VideoOrientation = VideoOrientation;
    }

    /**
     * Get 开启课后评分。 0：不开启(默认)  1：开启
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsGradingRequiredPostClass 开启课后评分。 0：不开启(默认)  1：开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsGradingRequiredPostClass() {
        return this.IsGradingRequiredPostClass;
    }

    /**
     * Set 开启课后评分。 0：不开启(默认)  1：开启
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsGradingRequiredPostClass 开启课后评分。 0：不开启(默认)  1：开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsGradingRequiredPostClass(Long IsGradingRequiredPostClass) {
        this.IsGradingRequiredPostClass = IsGradingRequiredPostClass;
    }

    /**
     * Get 房间类型。0:小班课（默认值）；1:大班课；2:1V1（后续扩展）
注：大班课的布局(layout)只有三分屏
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoomType 房间类型。0:小班课（默认值）；1:大班课；2:1V1（后续扩展）
注：大班课的布局(layout)只有三分屏
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRoomType() {
        return this.RoomType;
    }

    /**
     * Set 房间类型。0:小班课（默认值）；1:大班课；2:1V1（后续扩展）
注：大班课的布局(layout)只有三分屏
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoomType 房间类型。0:小班课（默认值）；1:大班课；2:1V1（后续扩展）
注：大班课的布局(layout)只有三分屏
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoomType(Long RoomType) {
        this.RoomType = RoomType;
    }

    /**
     * Get 拖堂时间：单位分钟，0为不限制(默认值), -1为不能拖堂，大于0为拖堂的时间，最大值120分钟
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndDelayTime 拖堂时间：单位分钟，0为不限制(默认值), -1为不能拖堂，大于0为拖堂的时间，最大值120分钟
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndDelayTime() {
        return this.EndDelayTime;
    }

    /**
     * Set 拖堂时间：单位分钟，0为不限制(默认值), -1为不能拖堂，大于0为拖堂的时间，最大值120分钟
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndDelayTime 拖堂时间：单位分钟，0为不限制(默认值), -1为不能拖堂，大于0为拖堂的时间，最大值120分钟
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndDelayTime(Long EndDelayTime) {
        this.EndDelayTime = EndDelayTime;
    }

    /**
     * Get 直播类型：0 常规（默认）1 伪直播
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LiveType 直播类型：0 常规（默认）1 伪直播
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLiveType() {
        return this.LiveType;
    }

    /**
     * Set 直播类型：0 常规（默认）1 伪直播
注意：此字段可能返回 null，表示取不到有效值。
     * @param LiveType 直播类型：0 常规（默认）1 伪直播
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLiveType(Long LiveType) {
        this.LiveType = LiveType;
    }

    /**
     * Get 伪直播回放链接	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordLiveUrl 伪直播回放链接	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecordLiveUrl() {
        return this.RecordLiveUrl;
    }

    /**
     * Set 伪直播回放链接	
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordLiveUrl 伪直播回放链接	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordLiveUrl(String RecordLiveUrl) {
        this.RecordLiveUrl = RecordLiveUrl;
    }

    /**
     * Get 是否自动开始上课：0 不自动上课（默认） 1 自动上课 live_type=1的时候有效	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableAutoStart 是否自动开始上课：0 不自动上课（默认） 1 自动上课 live_type=1的时候有效	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnableAutoStart() {
        return this.EnableAutoStart;
    }

    /**
     * Set 是否自动开始上课：0 不自动上课（默认） 1 自动上课 live_type=1的时候有效	
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableAutoStart 是否自动开始上课：0 不自动上课（默认） 1 自动上课 live_type=1的时候有效	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableAutoStart(Long EnableAutoStart) {
        this.EnableAutoStart = EnableAutoStart;
    }

    /**
     * Get 录制文件背景图片，支持png、jpg、jpeg、bmp格式，暂不支持透明通道
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordBackground 录制文件背景图片，支持png、jpg、jpeg、bmp格式，暂不支持透明通道
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecordBackground() {
        return this.RecordBackground;
    }

    /**
     * Set 录制文件背景图片，支持png、jpg、jpeg、bmp格式，暂不支持透明通道
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordBackground 录制文件背景图片，支持png、jpg、jpeg、bmp格式，暂不支持透明通道
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordBackground(String RecordBackground) {
        this.RecordBackground = RecordBackground;
    }

    /**
     * Get 录制自定义场景，仅recordlayout=9的时候此参数有效,数据内容为用户自定义场景参数，数据格式为json键值对方式，其中键值对的value为string类型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordScene 录制自定义场景，仅recordlayout=9的时候此参数有效,数据内容为用户自定义场景参数，数据格式为json键值对方式，其中键值对的value为string类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecordScene() {
        return this.RecordScene;
    }

    /**
     * Set 录制自定义场景，仅recordlayout=9的时候此参数有效,数据内容为用户自定义场景参数，数据格式为json键值对方式，其中键值对的value为string类型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordScene 录制自定义场景，仅recordlayout=9的时候此参数有效,数据内容为用户自定义场景参数，数据格式为json键值对方式，其中键值对的value为string类型。
注意：此字段可能返回 null，表示取不到有效值。
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

    public RoomItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoomItem(RoomItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.RealStartTime != null) {
            this.RealStartTime = new Long(source.RealStartTime);
        }
        if (source.RealEndTime != null) {
            this.RealEndTime = new Long(source.RealEndTime);
        }
        if (source.Resolution != null) {
            this.Resolution = new Long(source.Resolution);
        }
        if (source.MaxRTCMember != null) {
            this.MaxRTCMember = new Long(source.MaxRTCMember);
        }
        if (source.ReplayUrl != null) {
            this.ReplayUrl = new String(source.ReplayUrl);
        }
        if (source.RecordUrl != null) {
            this.RecordUrl = new String(source.RecordUrl);
        }
        if (source.MaxMicNumber != null) {
            this.MaxMicNumber = new Long(source.MaxMicNumber);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "RealStartTime", this.RealStartTime);
        this.setParamSimple(map, prefix + "RealEndTime", this.RealEndTime);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "MaxRTCMember", this.MaxRTCMember);
        this.setParamSimple(map, prefix + "ReplayUrl", this.ReplayUrl);
        this.setParamSimple(map, prefix + "RecordUrl", this.RecordUrl);
        this.setParamSimple(map, prefix + "MaxMicNumber", this.MaxMicNumber);
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

    }
}

