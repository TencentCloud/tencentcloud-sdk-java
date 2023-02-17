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

public class RoomInfo extends AbstractModel{

    /**
    * 房间名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 预定的房间开始时间，unix时间戳。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 预定的房间结束时间，unix时间戳。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 分辨率。可以有如下取值： 1 标清 2 高清 3 全高清
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resolution")
    @Expose
    private Long Resolution;

    /**
    * 最大连麦人数（不包括老师）。取值范围[0, 16]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxMicNumber")
    @Expose
    private Long MaxMicNumber;

    /**
    * 房间子类型，可以有以下取值： videodoc 文档+视频 video 纯视频 coteaching 双师
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubType")
    @Expose
    private String SubType;

    /**
    * 老师ID。通过[注册用户]接口获取的UserId。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TeacherId")
    @Expose
    private String TeacherId;

    /**
    * 进入课堂时是否自动连麦。可以有以下取值： 0 不自动连麦（需要手动申请上麦，默认值） 1 自动连麦
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoMic")
    @Expose
    private Long AutoMic;

    /**
    * 释放音视频权限后是否自动取消连麦。可以有以下取值： 0 自动取消连麦（默认值） 1 保持连麦状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TurnOffMic")
    @Expose
    private Long TurnOffMic;

    /**
    * 高音质模式。可以有以下取值： 0 不开启高音质（默认值） 1 开启高音质
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioQuality")
    @Expose
    private Long AudioQuality;

    /**
    * 上课后是否禁止自动录制。可以有以下取值： 0 不禁止录制（自动开启录制，默认值） 1 禁止录制 注：如果该配置取值为0，录制将从上课后开始，课堂结束后停止。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisableRecord")
    @Expose
    private Long DisableRecord;

    /**
    * 助教Id列表。通过[注册用户]接口获取的UserId。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Assistants")
    @Expose
    private String [] Assistants;

    /**
    * rtc人数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RTCAudienceNumber")
    @Expose
    private Long RTCAudienceNumber;

    /**
    * 观看类型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudienceType")
    @Expose
    private Long AudienceType;

    /**
    * 录制布局。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordLayout")
    @Expose
    private Long RecordLayout;

    /**
    * 房间绑定的群组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * Get 房间名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 房间名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 房间名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 房间名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 预定的房间开始时间，unix时间戳。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 预定的房间开始时间，unix时间戳。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 预定的房间开始时间，unix时间戳。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 预定的房间开始时间，unix时间戳。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 预定的房间结束时间，unix时间戳。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 预定的房间结束时间，unix时间戳。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 预定的房间结束时间，unix时间戳。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 预定的房间结束时间，unix时间戳。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 分辨率。可以有如下取值： 1 标清 2 高清 3 全高清
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resolution 分辨率。可以有如下取值： 1 标清 2 高清 3 全高清
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResolution() {
        return this.Resolution;
    }

    /**
     * Set 分辨率。可以有如下取值： 1 标清 2 高清 3 全高清
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resolution 分辨率。可以有如下取值： 1 标清 2 高清 3 全高清
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResolution(Long Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get 最大连麦人数（不包括老师）。取值范围[0, 16]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxMicNumber 最大连麦人数（不包括老师）。取值范围[0, 16]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxMicNumber() {
        return this.MaxMicNumber;
    }

    /**
     * Set 最大连麦人数（不包括老师）。取值范围[0, 16]
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxMicNumber 最大连麦人数（不包括老师）。取值范围[0, 16]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxMicNumber(Long MaxMicNumber) {
        this.MaxMicNumber = MaxMicNumber;
    }

    /**
     * Get 房间子类型，可以有以下取值： videodoc 文档+视频 video 纯视频 coteaching 双师
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubType 房间子类型，可以有以下取值： videodoc 文档+视频 video 纯视频 coteaching 双师
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubType() {
        return this.SubType;
    }

    /**
     * Set 房间子类型，可以有以下取值： videodoc 文档+视频 video 纯视频 coteaching 双师
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubType 房间子类型，可以有以下取值： videodoc 文档+视频 video 纯视频 coteaching 双师
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubType(String SubType) {
        this.SubType = SubType;
    }

    /**
     * Get 老师ID。通过[注册用户]接口获取的UserId。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TeacherId 老师ID。通过[注册用户]接口获取的UserId。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTeacherId() {
        return this.TeacherId;
    }

    /**
     * Set 老师ID。通过[注册用户]接口获取的UserId。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TeacherId 老师ID。通过[注册用户]接口获取的UserId。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTeacherId(String TeacherId) {
        this.TeacherId = TeacherId;
    }

    /**
     * Get 进入课堂时是否自动连麦。可以有以下取值： 0 不自动连麦（需要手动申请上麦，默认值） 1 自动连麦
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoMic 进入课堂时是否自动连麦。可以有以下取值： 0 不自动连麦（需要手动申请上麦，默认值） 1 自动连麦
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutoMic() {
        return this.AutoMic;
    }

    /**
     * Set 进入课堂时是否自动连麦。可以有以下取值： 0 不自动连麦（需要手动申请上麦，默认值） 1 自动连麦
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoMic 进入课堂时是否自动连麦。可以有以下取值： 0 不自动连麦（需要手动申请上麦，默认值） 1 自动连麦
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoMic(Long AutoMic) {
        this.AutoMic = AutoMic;
    }

    /**
     * Get 释放音视频权限后是否自动取消连麦。可以有以下取值： 0 自动取消连麦（默认值） 1 保持连麦状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TurnOffMic 释放音视频权限后是否自动取消连麦。可以有以下取值： 0 自动取消连麦（默认值） 1 保持连麦状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTurnOffMic() {
        return this.TurnOffMic;
    }

    /**
     * Set 释放音视频权限后是否自动取消连麦。可以有以下取值： 0 自动取消连麦（默认值） 1 保持连麦状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param TurnOffMic 释放音视频权限后是否自动取消连麦。可以有以下取值： 0 自动取消连麦（默认值） 1 保持连麦状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTurnOffMic(Long TurnOffMic) {
        this.TurnOffMic = TurnOffMic;
    }

    /**
     * Get 高音质模式。可以有以下取值： 0 不开启高音质（默认值） 1 开启高音质
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioQuality 高音质模式。可以有以下取值： 0 不开启高音质（默认值） 1 开启高音质
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAudioQuality() {
        return this.AudioQuality;
    }

    /**
     * Set 高音质模式。可以有以下取值： 0 不开启高音质（默认值） 1 开启高音质
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioQuality 高音质模式。可以有以下取值： 0 不开启高音质（默认值） 1 开启高音质
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioQuality(Long AudioQuality) {
        this.AudioQuality = AudioQuality;
    }

    /**
     * Get 上课后是否禁止自动录制。可以有以下取值： 0 不禁止录制（自动开启录制，默认值） 1 禁止录制 注：如果该配置取值为0，录制将从上课后开始，课堂结束后停止。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisableRecord 上课后是否禁止自动录制。可以有以下取值： 0 不禁止录制（自动开启录制，默认值） 1 禁止录制 注：如果该配置取值为0，录制将从上课后开始，课堂结束后停止。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDisableRecord() {
        return this.DisableRecord;
    }

    /**
     * Set 上课后是否禁止自动录制。可以有以下取值： 0 不禁止录制（自动开启录制，默认值） 1 禁止录制 注：如果该配置取值为0，录制将从上课后开始，课堂结束后停止。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisableRecord 上课后是否禁止自动录制。可以有以下取值： 0 不禁止录制（自动开启录制，默认值） 1 禁止录制 注：如果该配置取值为0，录制将从上课后开始，课堂结束后停止。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisableRecord(Long DisableRecord) {
        this.DisableRecord = DisableRecord;
    }

    /**
     * Get 助教Id列表。通过[注册用户]接口获取的UserId。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Assistants 助教Id列表。通过[注册用户]接口获取的UserId。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAssistants() {
        return this.Assistants;
    }

    /**
     * Set 助教Id列表。通过[注册用户]接口获取的UserId。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Assistants 助教Id列表。通过[注册用户]接口获取的UserId。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssistants(String [] Assistants) {
        this.Assistants = Assistants;
    }

    /**
     * Get rtc人数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RTCAudienceNumber rtc人数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRTCAudienceNumber() {
        return this.RTCAudienceNumber;
    }

    /**
     * Set rtc人数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RTCAudienceNumber rtc人数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRTCAudienceNumber(Long RTCAudienceNumber) {
        this.RTCAudienceNumber = RTCAudienceNumber;
    }

    /**
     * Get 观看类型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudienceType 观看类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAudienceType() {
        return this.AudienceType;
    }

    /**
     * Set 观看类型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudienceType 观看类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudienceType(Long AudienceType) {
        this.AudienceType = AudienceType;
    }

    /**
     * Get 录制布局。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordLayout 录制布局。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRecordLayout() {
        return this.RecordLayout;
    }

    /**
     * Set 录制布局。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordLayout 录制布局。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordLayout(Long RecordLayout) {
        this.RecordLayout = RecordLayout;
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

    }
}

