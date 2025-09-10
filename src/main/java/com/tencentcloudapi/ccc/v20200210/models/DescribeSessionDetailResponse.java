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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSessionDetailResponse extends AbstractModel {

    /**
    * 主叫号码
    */
    @SerializedName("Caller")
    @Expose
    private String Caller;

    /**
    * 被叫号码
    */
    @SerializedName("Callee")
    @Expose
    private String Callee;

    /**
    * 通话类型 1 呼出 2 呼入 3 音频呼入 5 预测式外呼 6 内线呼叫
    */
    @SerializedName("CallType")
    @Expose
    private Long CallType;

    /**
    * 开始时间戳，Unix 秒级时间戳
    */
    @SerializedName("StartTimeStamp")
    @Expose
    private Long StartTimeStamp;

    /**
    * 振铃时间戳，UNIX 秒级时间戳
    */
    @SerializedName("RingTimestamp")
    @Expose
    private Long RingTimestamp;

    /**
    * 接听时间戳，UNIX 秒级时间戳
    */
    @SerializedName("AcceptTimestamp")
    @Expose
    private Long AcceptTimestamp;

    /**
    * 结束时间戳，UNIX 秒级时间戳
    */
    @SerializedName("EndedTimestamp")
    @Expose
    private Long EndedTimestamp;

    /**
    * 进入排队时间，Unix 秒级时间戳
    */
    @SerializedName("QueuedTimestamp")
    @Expose
    private Long QueuedTimestamp;

    /**
    * 座席账号
    */
    @SerializedName("StaffUserId")
    @Expose
    private String StaffUserId;

    /**
    * 参考 DescribeTelCdr 接口 EndStatus 字段
    */
    @SerializedName("EndStatus")
    @Expose
    private Long EndStatus;

    /**
    * 排队技能组 ID
    */
    @SerializedName("QueuedSkillGroupId")
    @Expose
    private Long QueuedSkillGroupId;

    /**
    * 排队技能组名称
    */
    @SerializedName("QueuedSkillGroupName")
    @Expose
    private String QueuedSkillGroupName;

    /**
    * 录音链接，带鉴权和有效期，获取之后请在短时间内拉取，不要持久化此链接
    */
    @SerializedName("RecordURL")
    @Expose
    private String RecordURL;

    /**
    * 录音转存第三方 COS 链接
    */
    @SerializedName("CustomRecordURL")
    @Expose
    private String CustomRecordURL;

    /**
    * 录音文本信息链接，带鉴权和有效期，获取之后请在短时间内拉取，不要持久化此链接
    */
    @SerializedName("AsrURL")
    @Expose
    private String AsrURL;

    /**
    * 语音留言录音链接
    */
    @SerializedName("VoicemailRecordURL")
    @Expose
    private String [] VoicemailRecordURL;

    /**
    * 语音留言录音文本信息链接，需在控制台购买离线语音识别套餐包并开启离线语音识别开关
    */
    @SerializedName("VoicemailAsrURL")
    @Expose
    private String [] VoicemailAsrURL;

    /**
    * IVR 按键信息
    */
    @SerializedName("IVRKeyPressed")
    @Expose
    private IVRKeyPressedElement [] IVRKeyPressed;

    /**
    * 满意度按键信息
    */
    @SerializedName("PostIVRKeyPressed")
    @Expose
    private IVRKeyPressedElement [] PostIVRKeyPressed;

    /**
    * 挂机方 seat 座席 user 用户 system 系统
    */
    @SerializedName("HungUpSide")
    @Expose
    private String HungUpSide;

    /**
    * 客户自定义数据（User-to-User Interface）
    */
    @SerializedName("UUI")
    @Expose
    private String UUI;

    /**
    * 通话中的事件列表
    */
    @SerializedName("Events")
    @Expose
    private SessionEvent [] Events;

    /**
    * 服务参与者列表
    */
    @SerializedName("ServeParticipants")
    @Expose
    private ServeParticipant [] ServeParticipants;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 主叫号码 
     * @return Caller 主叫号码
     */
    public String getCaller() {
        return this.Caller;
    }

    /**
     * Set 主叫号码
     * @param Caller 主叫号码
     */
    public void setCaller(String Caller) {
        this.Caller = Caller;
    }

    /**
     * Get 被叫号码 
     * @return Callee 被叫号码
     */
    public String getCallee() {
        return this.Callee;
    }

    /**
     * Set 被叫号码
     * @param Callee 被叫号码
     */
    public void setCallee(String Callee) {
        this.Callee = Callee;
    }

    /**
     * Get 通话类型 1 呼出 2 呼入 3 音频呼入 5 预测式外呼 6 内线呼叫 
     * @return CallType 通话类型 1 呼出 2 呼入 3 音频呼入 5 预测式外呼 6 内线呼叫
     */
    public Long getCallType() {
        return this.CallType;
    }

    /**
     * Set 通话类型 1 呼出 2 呼入 3 音频呼入 5 预测式外呼 6 内线呼叫
     * @param CallType 通话类型 1 呼出 2 呼入 3 音频呼入 5 预测式外呼 6 内线呼叫
     */
    public void setCallType(Long CallType) {
        this.CallType = CallType;
    }

    /**
     * Get 开始时间戳，Unix 秒级时间戳 
     * @return StartTimeStamp 开始时间戳，Unix 秒级时间戳
     */
    public Long getStartTimeStamp() {
        return this.StartTimeStamp;
    }

    /**
     * Set 开始时间戳，Unix 秒级时间戳
     * @param StartTimeStamp 开始时间戳，Unix 秒级时间戳
     */
    public void setStartTimeStamp(Long StartTimeStamp) {
        this.StartTimeStamp = StartTimeStamp;
    }

    /**
     * Get 振铃时间戳，UNIX 秒级时间戳 
     * @return RingTimestamp 振铃时间戳，UNIX 秒级时间戳
     */
    public Long getRingTimestamp() {
        return this.RingTimestamp;
    }

    /**
     * Set 振铃时间戳，UNIX 秒级时间戳
     * @param RingTimestamp 振铃时间戳，UNIX 秒级时间戳
     */
    public void setRingTimestamp(Long RingTimestamp) {
        this.RingTimestamp = RingTimestamp;
    }

    /**
     * Get 接听时间戳，UNIX 秒级时间戳 
     * @return AcceptTimestamp 接听时间戳，UNIX 秒级时间戳
     */
    public Long getAcceptTimestamp() {
        return this.AcceptTimestamp;
    }

    /**
     * Set 接听时间戳，UNIX 秒级时间戳
     * @param AcceptTimestamp 接听时间戳，UNIX 秒级时间戳
     */
    public void setAcceptTimestamp(Long AcceptTimestamp) {
        this.AcceptTimestamp = AcceptTimestamp;
    }

    /**
     * Get 结束时间戳，UNIX 秒级时间戳 
     * @return EndedTimestamp 结束时间戳，UNIX 秒级时间戳
     */
    public Long getEndedTimestamp() {
        return this.EndedTimestamp;
    }

    /**
     * Set 结束时间戳，UNIX 秒级时间戳
     * @param EndedTimestamp 结束时间戳，UNIX 秒级时间戳
     */
    public void setEndedTimestamp(Long EndedTimestamp) {
        this.EndedTimestamp = EndedTimestamp;
    }

    /**
     * Get 进入排队时间，Unix 秒级时间戳 
     * @return QueuedTimestamp 进入排队时间，Unix 秒级时间戳
     */
    public Long getQueuedTimestamp() {
        return this.QueuedTimestamp;
    }

    /**
     * Set 进入排队时间，Unix 秒级时间戳
     * @param QueuedTimestamp 进入排队时间，Unix 秒级时间戳
     */
    public void setQueuedTimestamp(Long QueuedTimestamp) {
        this.QueuedTimestamp = QueuedTimestamp;
    }

    /**
     * Get 座席账号 
     * @return StaffUserId 座席账号
     */
    public String getStaffUserId() {
        return this.StaffUserId;
    }

    /**
     * Set 座席账号
     * @param StaffUserId 座席账号
     */
    public void setStaffUserId(String StaffUserId) {
        this.StaffUserId = StaffUserId;
    }

    /**
     * Get 参考 DescribeTelCdr 接口 EndStatus 字段 
     * @return EndStatus 参考 DescribeTelCdr 接口 EndStatus 字段
     */
    public Long getEndStatus() {
        return this.EndStatus;
    }

    /**
     * Set 参考 DescribeTelCdr 接口 EndStatus 字段
     * @param EndStatus 参考 DescribeTelCdr 接口 EndStatus 字段
     */
    public void setEndStatus(Long EndStatus) {
        this.EndStatus = EndStatus;
    }

    /**
     * Get 排队技能组 ID 
     * @return QueuedSkillGroupId 排队技能组 ID
     */
    public Long getQueuedSkillGroupId() {
        return this.QueuedSkillGroupId;
    }

    /**
     * Set 排队技能组 ID
     * @param QueuedSkillGroupId 排队技能组 ID
     */
    public void setQueuedSkillGroupId(Long QueuedSkillGroupId) {
        this.QueuedSkillGroupId = QueuedSkillGroupId;
    }

    /**
     * Get 排队技能组名称 
     * @return QueuedSkillGroupName 排队技能组名称
     */
    public String getQueuedSkillGroupName() {
        return this.QueuedSkillGroupName;
    }

    /**
     * Set 排队技能组名称
     * @param QueuedSkillGroupName 排队技能组名称
     */
    public void setQueuedSkillGroupName(String QueuedSkillGroupName) {
        this.QueuedSkillGroupName = QueuedSkillGroupName;
    }

    /**
     * Get 录音链接，带鉴权和有效期，获取之后请在短时间内拉取，不要持久化此链接 
     * @return RecordURL 录音链接，带鉴权和有效期，获取之后请在短时间内拉取，不要持久化此链接
     */
    public String getRecordURL() {
        return this.RecordURL;
    }

    /**
     * Set 录音链接，带鉴权和有效期，获取之后请在短时间内拉取，不要持久化此链接
     * @param RecordURL 录音链接，带鉴权和有效期，获取之后请在短时间内拉取，不要持久化此链接
     */
    public void setRecordURL(String RecordURL) {
        this.RecordURL = RecordURL;
    }

    /**
     * Get 录音转存第三方 COS 链接 
     * @return CustomRecordURL 录音转存第三方 COS 链接
     */
    public String getCustomRecordURL() {
        return this.CustomRecordURL;
    }

    /**
     * Set 录音转存第三方 COS 链接
     * @param CustomRecordURL 录音转存第三方 COS 链接
     */
    public void setCustomRecordURL(String CustomRecordURL) {
        this.CustomRecordURL = CustomRecordURL;
    }

    /**
     * Get 录音文本信息链接，带鉴权和有效期，获取之后请在短时间内拉取，不要持久化此链接 
     * @return AsrURL 录音文本信息链接，带鉴权和有效期，获取之后请在短时间内拉取，不要持久化此链接
     */
    public String getAsrURL() {
        return this.AsrURL;
    }

    /**
     * Set 录音文本信息链接，带鉴权和有效期，获取之后请在短时间内拉取，不要持久化此链接
     * @param AsrURL 录音文本信息链接，带鉴权和有效期，获取之后请在短时间内拉取，不要持久化此链接
     */
    public void setAsrURL(String AsrURL) {
        this.AsrURL = AsrURL;
    }

    /**
     * Get 语音留言录音链接 
     * @return VoicemailRecordURL 语音留言录音链接
     */
    public String [] getVoicemailRecordURL() {
        return this.VoicemailRecordURL;
    }

    /**
     * Set 语音留言录音链接
     * @param VoicemailRecordURL 语音留言录音链接
     */
    public void setVoicemailRecordURL(String [] VoicemailRecordURL) {
        this.VoicemailRecordURL = VoicemailRecordURL;
    }

    /**
     * Get 语音留言录音文本信息链接，需在控制台购买离线语音识别套餐包并开启离线语音识别开关 
     * @return VoicemailAsrURL 语音留言录音文本信息链接，需在控制台购买离线语音识别套餐包并开启离线语音识别开关
     */
    public String [] getVoicemailAsrURL() {
        return this.VoicemailAsrURL;
    }

    /**
     * Set 语音留言录音文本信息链接，需在控制台购买离线语音识别套餐包并开启离线语音识别开关
     * @param VoicemailAsrURL 语音留言录音文本信息链接，需在控制台购买离线语音识别套餐包并开启离线语音识别开关
     */
    public void setVoicemailAsrURL(String [] VoicemailAsrURL) {
        this.VoicemailAsrURL = VoicemailAsrURL;
    }

    /**
     * Get IVR 按键信息 
     * @return IVRKeyPressed IVR 按键信息
     */
    public IVRKeyPressedElement [] getIVRKeyPressed() {
        return this.IVRKeyPressed;
    }

    /**
     * Set IVR 按键信息
     * @param IVRKeyPressed IVR 按键信息
     */
    public void setIVRKeyPressed(IVRKeyPressedElement [] IVRKeyPressed) {
        this.IVRKeyPressed = IVRKeyPressed;
    }

    /**
     * Get 满意度按键信息 
     * @return PostIVRKeyPressed 满意度按键信息
     */
    public IVRKeyPressedElement [] getPostIVRKeyPressed() {
        return this.PostIVRKeyPressed;
    }

    /**
     * Set 满意度按键信息
     * @param PostIVRKeyPressed 满意度按键信息
     */
    public void setPostIVRKeyPressed(IVRKeyPressedElement [] PostIVRKeyPressed) {
        this.PostIVRKeyPressed = PostIVRKeyPressed;
    }

    /**
     * Get 挂机方 seat 座席 user 用户 system 系统 
     * @return HungUpSide 挂机方 seat 座席 user 用户 system 系统
     */
    public String getHungUpSide() {
        return this.HungUpSide;
    }

    /**
     * Set 挂机方 seat 座席 user 用户 system 系统
     * @param HungUpSide 挂机方 seat 座席 user 用户 system 系统
     */
    public void setHungUpSide(String HungUpSide) {
        this.HungUpSide = HungUpSide;
    }

    /**
     * Get 客户自定义数据（User-to-User Interface） 
     * @return UUI 客户自定义数据（User-to-User Interface）
     */
    public String getUUI() {
        return this.UUI;
    }

    /**
     * Set 客户自定义数据（User-to-User Interface）
     * @param UUI 客户自定义数据（User-to-User Interface）
     */
    public void setUUI(String UUI) {
        this.UUI = UUI;
    }

    /**
     * Get 通话中的事件列表 
     * @return Events 通话中的事件列表
     */
    public SessionEvent [] getEvents() {
        return this.Events;
    }

    /**
     * Set 通话中的事件列表
     * @param Events 通话中的事件列表
     */
    public void setEvents(SessionEvent [] Events) {
        this.Events = Events;
    }

    /**
     * Get 服务参与者列表 
     * @return ServeParticipants 服务参与者列表
     */
    public ServeParticipant [] getServeParticipants() {
        return this.ServeParticipants;
    }

    /**
     * Set 服务参与者列表
     * @param ServeParticipants 服务参与者列表
     */
    public void setServeParticipants(ServeParticipant [] ServeParticipants) {
        this.ServeParticipants = ServeParticipants;
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

    public DescribeSessionDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSessionDetailResponse(DescribeSessionDetailResponse source) {
        if (source.Caller != null) {
            this.Caller = new String(source.Caller);
        }
        if (source.Callee != null) {
            this.Callee = new String(source.Callee);
        }
        if (source.CallType != null) {
            this.CallType = new Long(source.CallType);
        }
        if (source.StartTimeStamp != null) {
            this.StartTimeStamp = new Long(source.StartTimeStamp);
        }
        if (source.RingTimestamp != null) {
            this.RingTimestamp = new Long(source.RingTimestamp);
        }
        if (source.AcceptTimestamp != null) {
            this.AcceptTimestamp = new Long(source.AcceptTimestamp);
        }
        if (source.EndedTimestamp != null) {
            this.EndedTimestamp = new Long(source.EndedTimestamp);
        }
        if (source.QueuedTimestamp != null) {
            this.QueuedTimestamp = new Long(source.QueuedTimestamp);
        }
        if (source.StaffUserId != null) {
            this.StaffUserId = new String(source.StaffUserId);
        }
        if (source.EndStatus != null) {
            this.EndStatus = new Long(source.EndStatus);
        }
        if (source.QueuedSkillGroupId != null) {
            this.QueuedSkillGroupId = new Long(source.QueuedSkillGroupId);
        }
        if (source.QueuedSkillGroupName != null) {
            this.QueuedSkillGroupName = new String(source.QueuedSkillGroupName);
        }
        if (source.RecordURL != null) {
            this.RecordURL = new String(source.RecordURL);
        }
        if (source.CustomRecordURL != null) {
            this.CustomRecordURL = new String(source.CustomRecordURL);
        }
        if (source.AsrURL != null) {
            this.AsrURL = new String(source.AsrURL);
        }
        if (source.VoicemailRecordURL != null) {
            this.VoicemailRecordURL = new String[source.VoicemailRecordURL.length];
            for (int i = 0; i < source.VoicemailRecordURL.length; i++) {
                this.VoicemailRecordURL[i] = new String(source.VoicemailRecordURL[i]);
            }
        }
        if (source.VoicemailAsrURL != null) {
            this.VoicemailAsrURL = new String[source.VoicemailAsrURL.length];
            for (int i = 0; i < source.VoicemailAsrURL.length; i++) {
                this.VoicemailAsrURL[i] = new String(source.VoicemailAsrURL[i]);
            }
        }
        if (source.IVRKeyPressed != null) {
            this.IVRKeyPressed = new IVRKeyPressedElement[source.IVRKeyPressed.length];
            for (int i = 0; i < source.IVRKeyPressed.length; i++) {
                this.IVRKeyPressed[i] = new IVRKeyPressedElement(source.IVRKeyPressed[i]);
            }
        }
        if (source.PostIVRKeyPressed != null) {
            this.PostIVRKeyPressed = new IVRKeyPressedElement[source.PostIVRKeyPressed.length];
            for (int i = 0; i < source.PostIVRKeyPressed.length; i++) {
                this.PostIVRKeyPressed[i] = new IVRKeyPressedElement(source.PostIVRKeyPressed[i]);
            }
        }
        if (source.HungUpSide != null) {
            this.HungUpSide = new String(source.HungUpSide);
        }
        if (source.UUI != null) {
            this.UUI = new String(source.UUI);
        }
        if (source.Events != null) {
            this.Events = new SessionEvent[source.Events.length];
            for (int i = 0; i < source.Events.length; i++) {
                this.Events[i] = new SessionEvent(source.Events[i]);
            }
        }
        if (source.ServeParticipants != null) {
            this.ServeParticipants = new ServeParticipant[source.ServeParticipants.length];
            for (int i = 0; i < source.ServeParticipants.length; i++) {
                this.ServeParticipants[i] = new ServeParticipant(source.ServeParticipants[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Caller", this.Caller);
        this.setParamSimple(map, prefix + "Callee", this.Callee);
        this.setParamSimple(map, prefix + "CallType", this.CallType);
        this.setParamSimple(map, prefix + "StartTimeStamp", this.StartTimeStamp);
        this.setParamSimple(map, prefix + "RingTimestamp", this.RingTimestamp);
        this.setParamSimple(map, prefix + "AcceptTimestamp", this.AcceptTimestamp);
        this.setParamSimple(map, prefix + "EndedTimestamp", this.EndedTimestamp);
        this.setParamSimple(map, prefix + "QueuedTimestamp", this.QueuedTimestamp);
        this.setParamSimple(map, prefix + "StaffUserId", this.StaffUserId);
        this.setParamSimple(map, prefix + "EndStatus", this.EndStatus);
        this.setParamSimple(map, prefix + "QueuedSkillGroupId", this.QueuedSkillGroupId);
        this.setParamSimple(map, prefix + "QueuedSkillGroupName", this.QueuedSkillGroupName);
        this.setParamSimple(map, prefix + "RecordURL", this.RecordURL);
        this.setParamSimple(map, prefix + "CustomRecordURL", this.CustomRecordURL);
        this.setParamSimple(map, prefix + "AsrURL", this.AsrURL);
        this.setParamArraySimple(map, prefix + "VoicemailRecordURL.", this.VoicemailRecordURL);
        this.setParamArraySimple(map, prefix + "VoicemailAsrURL.", this.VoicemailAsrURL);
        this.setParamArrayObj(map, prefix + "IVRKeyPressed.", this.IVRKeyPressed);
        this.setParamArrayObj(map, prefix + "PostIVRKeyPressed.", this.PostIVRKeyPressed);
        this.setParamSimple(map, prefix + "HungUpSide", this.HungUpSide);
        this.setParamSimple(map, prefix + "UUI", this.UUI);
        this.setParamArrayObj(map, prefix + "Events.", this.Events);
        this.setParamArrayObj(map, prefix + "ServeParticipants.", this.ServeParticipants);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

