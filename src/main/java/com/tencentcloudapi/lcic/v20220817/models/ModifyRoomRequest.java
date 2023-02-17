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

public class ModifyRoomRequest extends AbstractModel{

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
    * 预定的房间开始时间，unix时间戳。直播开始后不允许修改。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 预定的房间结束时间，unix时间戳。直播开始后不允许修改。
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
    * 最大连麦人数（不包括老师）。取值范围[0, 17)
直播开始后不允许修改。
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
coteaching 双师
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
    * 房间绑定的群组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

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
     * Get 预定的房间开始时间，unix时间戳。直播开始后不允许修改。 
     * @return StartTime 预定的房间开始时间，unix时间戳。直播开始后不允许修改。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 预定的房间开始时间，unix时间戳。直播开始后不允许修改。
     * @param StartTime 预定的房间开始时间，unix时间戳。直播开始后不允许修改。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 预定的房间结束时间，unix时间戳。直播开始后不允许修改。 
     * @return EndTime 预定的房间结束时间，unix时间戳。直播开始后不允许修改。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 预定的房间结束时间，unix时间戳。直播开始后不允许修改。
     * @param EndTime 预定的房间结束时间，unix时间戳。直播开始后不允许修改。
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
     * Get 最大连麦人数（不包括老师）。取值范围[0, 17)
直播开始后不允许修改。 
     * @return MaxMicNumber 最大连麦人数（不包括老师）。取值范围[0, 17)
直播开始后不允许修改。
     */
    public Long getMaxMicNumber() {
        return this.MaxMicNumber;
    }

    /**
     * Set 最大连麦人数（不包括老师）。取值范围[0, 17)
直播开始后不允许修改。
     * @param MaxMicNumber 最大连麦人数（不包括老师）。取值范围[0, 17)
直播开始后不允许修改。
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
coteaching 双师
直播开始后不允许修改。 
     * @return SubType 房间子类型，可以有以下取值：
videodoc 文档+视频
video 纯视频
coteaching 双师
直播开始后不允许修改。
     */
    public String getSubType() {
        return this.SubType;
    }

    /**
     * Set 房间子类型，可以有以下取值：
videodoc 文档+视频
video 纯视频
coteaching 双师
直播开始后不允许修改。
     * @param SubType 房间子类型，可以有以下取值：
videodoc 文档+视频
video 纯视频
coteaching 双师
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

    }
}

