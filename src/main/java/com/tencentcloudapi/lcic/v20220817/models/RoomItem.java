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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoomItem extends AbstractModel{

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
    * 房间状态。0 未开始 ；1进行中  ；2 已结束
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
    * 最高房间内人数（包括老师），0表示不限制，默认为0
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoomType")
    @Expose
    private Long RoomType;

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
     * Get 房间状态。0 未开始 ；1进行中  ；2 已结束
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 房间状态。0 未开始 ；1进行中  ；2 已结束
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 房间状态。0 未开始 ；1进行中  ；2 已结束
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 房间状态。0 未开始 ；1进行中  ；2 已结束
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
     * Get 最高房间内人数（包括老师），0表示不限制，默认为0
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxMicNumber 最高房间内人数（包括老师），0表示不限制，默认为0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxMicNumber() {
        return this.MaxMicNumber;
    }

    /**
     * Set 最高房间内人数（包括老师），0表示不限制，默认为0
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxMicNumber 最高房间内人数（包括老师），0表示不限制，默认为0
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoomType 房间类型。0:小班课（默认值）；1:大班课；2:1V1（后续扩展）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRoomType() {
        return this.RoomType;
    }

    /**
     * Set 房间类型。0:小班课（默认值）；1:大班课；2:1V1（后续扩展）
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoomType 房间类型。0:小班课（默认值）；1:大班课；2:1V1（后续扩展）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoomType(Long RoomType) {
        this.RoomType = RoomType;
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

    }
}

