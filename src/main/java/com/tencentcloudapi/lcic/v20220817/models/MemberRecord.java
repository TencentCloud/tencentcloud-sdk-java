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

public class MemberRecord extends AbstractModel{

    /**
    * 用户ID。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户名称。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 在线时长，单位秒。
    */
    @SerializedName("PresentTime")
    @Expose
    private Long PresentTime;

    /**
    * 是否开启摄像头。
    */
    @SerializedName("Camera")
    @Expose
    private Long Camera;

    /**
    * 是否开启麦克风。
    */
    @SerializedName("Mic")
    @Expose
    private Long Mic;

    /**
    * 是否禁言。
    */
    @SerializedName("Silence")
    @Expose
    private Long Silence;

    /**
    * 回答问题数量。
    */
    @SerializedName("AnswerQuestions")
    @Expose
    private Long AnswerQuestions;

    /**
    * 举手数量。
    */
    @SerializedName("HandUps")
    @Expose
    private Long HandUps;

    /**
    * 首次进入房间的unix时间戳。
    */
    @SerializedName("FirstJoinTimestamp")
    @Expose
    private Long FirstJoinTimestamp;

    /**
    * 最后一次退出房间的unix时间戳。
    */
    @SerializedName("LastQuitTimestamp")
    @Expose
    private Long LastQuitTimestamp;

    /**
    * 奖励次数。
    */
    @SerializedName("Rewords")
    @Expose
    private Long Rewords;

    /**
    * 用户IP。
    */
    @SerializedName("IPAddress")
    @Expose
    private String IPAddress;

    /**
    * 用户位置信息。
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 用户设备平台信息。0:unknown  1:windows  2:mac  3:android  4:ios  5:web   6:h5   7:miniprogram （小程序）
    */
    @SerializedName("Device")
    @Expose
    private Long Device;

    /**
    * 每个成员上麦次数。
    */
    @SerializedName("PerMemberMicCount")
    @Expose
    private Long PerMemberMicCount;

    /**
    * 每个成员发送消息数量。

    */
    @SerializedName("PerMemberMessageCount")
    @Expose
    private Long PerMemberMessageCount;

    /**
    * 用户角色。0代表学生；1代表老师； 2助教；3巡课。
    */
    @SerializedName("Role")
    @Expose
    private Long Role;

    /**
    * 上课班号
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 子上课班号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubGroupId")
    @Expose
    private String [] SubGroupId;

    /**
    * 用户的上台状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Stage")
    @Expose
    private Long Stage;

    /**
    * 用户状态。0为未到，1为在线，2为离线，3为被踢，4为永久被踢，5为暂时掉线
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentState")
    @Expose
    private Long CurrentState;

    /**
     * Get 用户ID。 
     * @return UserId 用户ID。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID。
     * @param UserId 用户ID。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户名称。 
     * @return UserName 用户名称。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名称。
     * @param UserName 用户名称。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 在线时长，单位秒。 
     * @return PresentTime 在线时长，单位秒。
     */
    public Long getPresentTime() {
        return this.PresentTime;
    }

    /**
     * Set 在线时长，单位秒。
     * @param PresentTime 在线时长，单位秒。
     */
    public void setPresentTime(Long PresentTime) {
        this.PresentTime = PresentTime;
    }

    /**
     * Get 是否开启摄像头。 
     * @return Camera 是否开启摄像头。
     */
    public Long getCamera() {
        return this.Camera;
    }

    /**
     * Set 是否开启摄像头。
     * @param Camera 是否开启摄像头。
     */
    public void setCamera(Long Camera) {
        this.Camera = Camera;
    }

    /**
     * Get 是否开启麦克风。 
     * @return Mic 是否开启麦克风。
     */
    public Long getMic() {
        return this.Mic;
    }

    /**
     * Set 是否开启麦克风。
     * @param Mic 是否开启麦克风。
     */
    public void setMic(Long Mic) {
        this.Mic = Mic;
    }

    /**
     * Get 是否禁言。 
     * @return Silence 是否禁言。
     */
    public Long getSilence() {
        return this.Silence;
    }

    /**
     * Set 是否禁言。
     * @param Silence 是否禁言。
     */
    public void setSilence(Long Silence) {
        this.Silence = Silence;
    }

    /**
     * Get 回答问题数量。 
     * @return AnswerQuestions 回答问题数量。
     */
    public Long getAnswerQuestions() {
        return this.AnswerQuestions;
    }

    /**
     * Set 回答问题数量。
     * @param AnswerQuestions 回答问题数量。
     */
    public void setAnswerQuestions(Long AnswerQuestions) {
        this.AnswerQuestions = AnswerQuestions;
    }

    /**
     * Get 举手数量。 
     * @return HandUps 举手数量。
     */
    public Long getHandUps() {
        return this.HandUps;
    }

    /**
     * Set 举手数量。
     * @param HandUps 举手数量。
     */
    public void setHandUps(Long HandUps) {
        this.HandUps = HandUps;
    }

    /**
     * Get 首次进入房间的unix时间戳。 
     * @return FirstJoinTimestamp 首次进入房间的unix时间戳。
     */
    public Long getFirstJoinTimestamp() {
        return this.FirstJoinTimestamp;
    }

    /**
     * Set 首次进入房间的unix时间戳。
     * @param FirstJoinTimestamp 首次进入房间的unix时间戳。
     */
    public void setFirstJoinTimestamp(Long FirstJoinTimestamp) {
        this.FirstJoinTimestamp = FirstJoinTimestamp;
    }

    /**
     * Get 最后一次退出房间的unix时间戳。 
     * @return LastQuitTimestamp 最后一次退出房间的unix时间戳。
     */
    public Long getLastQuitTimestamp() {
        return this.LastQuitTimestamp;
    }

    /**
     * Set 最后一次退出房间的unix时间戳。
     * @param LastQuitTimestamp 最后一次退出房间的unix时间戳。
     */
    public void setLastQuitTimestamp(Long LastQuitTimestamp) {
        this.LastQuitTimestamp = LastQuitTimestamp;
    }

    /**
     * Get 奖励次数。 
     * @return Rewords 奖励次数。
     */
    public Long getRewords() {
        return this.Rewords;
    }

    /**
     * Set 奖励次数。
     * @param Rewords 奖励次数。
     */
    public void setRewords(Long Rewords) {
        this.Rewords = Rewords;
    }

    /**
     * Get 用户IP。 
     * @return IPAddress 用户IP。
     */
    public String getIPAddress() {
        return this.IPAddress;
    }

    /**
     * Set 用户IP。
     * @param IPAddress 用户IP。
     */
    public void setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
    }

    /**
     * Get 用户位置信息。 
     * @return Location 用户位置信息。
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set 用户位置信息。
     * @param Location 用户位置信息。
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get 用户设备平台信息。0:unknown  1:windows  2:mac  3:android  4:ios  5:web   6:h5   7:miniprogram （小程序） 
     * @return Device 用户设备平台信息。0:unknown  1:windows  2:mac  3:android  4:ios  5:web   6:h5   7:miniprogram （小程序）
     */
    public Long getDevice() {
        return this.Device;
    }

    /**
     * Set 用户设备平台信息。0:unknown  1:windows  2:mac  3:android  4:ios  5:web   6:h5   7:miniprogram （小程序）
     * @param Device 用户设备平台信息。0:unknown  1:windows  2:mac  3:android  4:ios  5:web   6:h5   7:miniprogram （小程序）
     */
    public void setDevice(Long Device) {
        this.Device = Device;
    }

    /**
     * Get 每个成员上麦次数。 
     * @return PerMemberMicCount 每个成员上麦次数。
     */
    public Long getPerMemberMicCount() {
        return this.PerMemberMicCount;
    }

    /**
     * Set 每个成员上麦次数。
     * @param PerMemberMicCount 每个成员上麦次数。
     */
    public void setPerMemberMicCount(Long PerMemberMicCount) {
        this.PerMemberMicCount = PerMemberMicCount;
    }

    /**
     * Get 每个成员发送消息数量。
 
     * @return PerMemberMessageCount 每个成员发送消息数量。

     */
    public Long getPerMemberMessageCount() {
        return this.PerMemberMessageCount;
    }

    /**
     * Set 每个成员发送消息数量。

     * @param PerMemberMessageCount 每个成员发送消息数量。

     */
    public void setPerMemberMessageCount(Long PerMemberMessageCount) {
        this.PerMemberMessageCount = PerMemberMessageCount;
    }

    /**
     * Get 用户角色。0代表学生；1代表老师； 2助教；3巡课。 
     * @return Role 用户角色。0代表学生；1代表老师； 2助教；3巡课。
     */
    public Long getRole() {
        return this.Role;
    }

    /**
     * Set 用户角色。0代表学生；1代表老师； 2助教；3巡课。
     * @param Role 用户角色。0代表学生；1代表老师； 2助教；3巡课。
     */
    public void setRole(Long Role) {
        this.Role = Role;
    }

    /**
     * Get 上课班号 
     * @return GroupId 上课班号
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 上课班号
     * @param GroupId 上课班号
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 子上课班号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubGroupId 子上课班号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSubGroupId() {
        return this.SubGroupId;
    }

    /**
     * Set 子上课班号
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubGroupId 子上课班号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubGroupId(String [] SubGroupId) {
        this.SubGroupId = SubGroupId;
    }

    /**
     * Get 用户的上台状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Stage 用户的上台状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStage() {
        return this.Stage;
    }

    /**
     * Set 用户的上台状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Stage 用户的上台状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStage(Long Stage) {
        this.Stage = Stage;
    }

    /**
     * Get 用户状态。0为未到，1为在线，2为离线，3为被踢，4为永久被踢，5为暂时掉线
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentState 用户状态。0为未到，1为在线，2为离线，3为被踢，4为永久被踢，5为暂时掉线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCurrentState() {
        return this.CurrentState;
    }

    /**
     * Set 用户状态。0为未到，1为在线，2为离线，3为被踢，4为永久被踢，5为暂时掉线
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentState 用户状态。0为未到，1为在线，2为离线，3为被踢，4为永久被踢，5为暂时掉线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentState(Long CurrentState) {
        this.CurrentState = CurrentState;
    }

    public MemberRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MemberRecord(MemberRecord source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.PresentTime != null) {
            this.PresentTime = new Long(source.PresentTime);
        }
        if (source.Camera != null) {
            this.Camera = new Long(source.Camera);
        }
        if (source.Mic != null) {
            this.Mic = new Long(source.Mic);
        }
        if (source.Silence != null) {
            this.Silence = new Long(source.Silence);
        }
        if (source.AnswerQuestions != null) {
            this.AnswerQuestions = new Long(source.AnswerQuestions);
        }
        if (source.HandUps != null) {
            this.HandUps = new Long(source.HandUps);
        }
        if (source.FirstJoinTimestamp != null) {
            this.FirstJoinTimestamp = new Long(source.FirstJoinTimestamp);
        }
        if (source.LastQuitTimestamp != null) {
            this.LastQuitTimestamp = new Long(source.LastQuitTimestamp);
        }
        if (source.Rewords != null) {
            this.Rewords = new Long(source.Rewords);
        }
        if (source.IPAddress != null) {
            this.IPAddress = new String(source.IPAddress);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.Device != null) {
            this.Device = new Long(source.Device);
        }
        if (source.PerMemberMicCount != null) {
            this.PerMemberMicCount = new Long(source.PerMemberMicCount);
        }
        if (source.PerMemberMessageCount != null) {
            this.PerMemberMessageCount = new Long(source.PerMemberMessageCount);
        }
        if (source.Role != null) {
            this.Role = new Long(source.Role);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.SubGroupId != null) {
            this.SubGroupId = new String[source.SubGroupId.length];
            for (int i = 0; i < source.SubGroupId.length; i++) {
                this.SubGroupId[i] = new String(source.SubGroupId[i]);
            }
        }
        if (source.Stage != null) {
            this.Stage = new Long(source.Stage);
        }
        if (source.CurrentState != null) {
            this.CurrentState = new Long(source.CurrentState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "PresentTime", this.PresentTime);
        this.setParamSimple(map, prefix + "Camera", this.Camera);
        this.setParamSimple(map, prefix + "Mic", this.Mic);
        this.setParamSimple(map, prefix + "Silence", this.Silence);
        this.setParamSimple(map, prefix + "AnswerQuestions", this.AnswerQuestions);
        this.setParamSimple(map, prefix + "HandUps", this.HandUps);
        this.setParamSimple(map, prefix + "FirstJoinTimestamp", this.FirstJoinTimestamp);
        this.setParamSimple(map, prefix + "LastQuitTimestamp", this.LastQuitTimestamp);
        this.setParamSimple(map, prefix + "Rewords", this.Rewords);
        this.setParamSimple(map, prefix + "IPAddress", this.IPAddress);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "Device", this.Device);
        this.setParamSimple(map, prefix + "PerMemberMicCount", this.PerMemberMicCount);
        this.setParamSimple(map, prefix + "PerMemberMessageCount", this.PerMemberMessageCount);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArraySimple(map, prefix + "SubGroupId.", this.SubGroupId);
        this.setParamSimple(map, prefix + "Stage", this.Stage);
        this.setParamSimple(map, prefix + "CurrentState", this.CurrentState);

    }
}

