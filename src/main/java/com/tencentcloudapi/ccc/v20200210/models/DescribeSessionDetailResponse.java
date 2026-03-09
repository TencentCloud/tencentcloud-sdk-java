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
    * <p>主叫号码</p>
    */
    @SerializedName("Caller")
    @Expose
    private String Caller;

    /**
    * <p>被叫号码</p>
    */
    @SerializedName("Callee")
    @Expose
    private String Callee;

    /**
    * <p>通话类型 1 呼出 2 呼入 3 音频呼入 5 预测式外呼 6 内线呼叫</p>
    */
    @SerializedName("CallType")
    @Expose
    private Long CallType;

    /**
    * <p>开始时间戳，Unix 秒级时间戳</p>
    */
    @SerializedName("StartTimeStamp")
    @Expose
    private Long StartTimeStamp;

    /**
    * <p>振铃时间戳，UNIX 秒级时间戳</p>
    */
    @SerializedName("RingTimestamp")
    @Expose
    private Long RingTimestamp;

    /**
    * <p>接听时间戳，UNIX 秒级时间戳</p>
    */
    @SerializedName("AcceptTimestamp")
    @Expose
    private Long AcceptTimestamp;

    /**
    * <p>结束时间戳，UNIX 秒级时间戳</p>
    */
    @SerializedName("EndedTimestamp")
    @Expose
    private Long EndedTimestamp;

    /**
    * <p>进入排队时间，Unix 秒级时间戳</p>
    */
    @SerializedName("QueuedTimestamp")
    @Expose
    private Long QueuedTimestamp;

    /**
    * <p>座席账号</p>
    */
    @SerializedName("StaffUserId")
    @Expose
    private String StaffUserId;

    /**
    * <p>参考 DescribeTelCdr 接口 EndStatus 字段</p>
    */
    @SerializedName("EndStatus")
    @Expose
    private Long EndStatus;

    /**
    * <p>排队技能组 ID</p>
    */
    @SerializedName("QueuedSkillGroupId")
    @Expose
    private Long QueuedSkillGroupId;

    /**
    * <p>排队技能组名称</p>
    */
    @SerializedName("QueuedSkillGroupName")
    @Expose
    private String QueuedSkillGroupName;

    /**
    * <p>录音链接，带鉴权和有效期，获取之后请在24 小时内拉取，不要持久化此链接。如此链接已过期，请重新调用此接口获取新的链接</p>
    */
    @SerializedName("RecordURL")
    @Expose
    private String RecordURL;

    /**
    * <p>录音转存第三方 COS 链接</p>
    */
    @SerializedName("CustomRecordURL")
    @Expose
    private String CustomRecordURL;

    /**
    * <p>录音文本信息链接，带鉴权和有效期，获取之后请在24 小时拉取，不要持久化此链接。如此链接已过期，请重新调用此接口获取新的链接</p>
    */
    @SerializedName("AsrURL")
    @Expose
    private String AsrURL;

    /**
    * <p>语音留言录音链接</p>
    */
    @SerializedName("VoicemailRecordURL")
    @Expose
    private String [] VoicemailRecordURL;

    /**
    * <p>语音留言录音文本信息链接，需在控制台购买离线语音识别套餐包并开启离线语音识别开关</p>
    */
    @SerializedName("VoicemailAsrURL")
    @Expose
    private String [] VoicemailAsrURL;

    /**
    * <p>IVR 按键信息</p>
    */
    @SerializedName("IVRKeyPressed")
    @Expose
    private IVRKeyPressedElement [] IVRKeyPressed;

    /**
    * <p>满意度按键信息</p>
    */
    @SerializedName("PostIVRKeyPressed")
    @Expose
    private IVRKeyPressedElement [] PostIVRKeyPressed;

    /**
    * <p>挂机方 seat 座席 user 用户 system 系统</p>
    */
    @SerializedName("HungUpSide")
    @Expose
    private String HungUpSide;

    /**
    * <p>客户自定义数据（User-to-User Interface）</p>
    */
    @SerializedName("UUI")
    @Expose
    private String UUI;

    /**
    * <p>通话中的事件列表</p>
    */
    @SerializedName("Events")
    @Expose
    private SessionEvent [] Events;

    /**
    * <p>服务参与者列表</p>
    */
    @SerializedName("ServeParticipants")
    @Expose
    private ServeParticipant [] ServeParticipants;

    /**
    * <p>接通后系统挂断原因状态码</p><p><a href="https://cloud.tencent.com/document/product/679/123938">详见</a></p>
    */
    @SerializedName("SysHangupReason")
    @Expose
    private Long SysHangupReason;

    /**
    * <p>接通后系统挂断原因</p><p><a href="https://cloud.tencent.com/document/product/679/123938">详见</a></p>
    */
    @SerializedName("SysHangupReasonString")
    @Expose
    private String SysHangupReasonString;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>主叫号码</p> 
     * @return Caller <p>主叫号码</p>
     */
    public String getCaller() {
        return this.Caller;
    }

    /**
     * Set <p>主叫号码</p>
     * @param Caller <p>主叫号码</p>
     */
    public void setCaller(String Caller) {
        this.Caller = Caller;
    }

    /**
     * Get <p>被叫号码</p> 
     * @return Callee <p>被叫号码</p>
     */
    public String getCallee() {
        return this.Callee;
    }

    /**
     * Set <p>被叫号码</p>
     * @param Callee <p>被叫号码</p>
     */
    public void setCallee(String Callee) {
        this.Callee = Callee;
    }

    /**
     * Get <p>通话类型 1 呼出 2 呼入 3 音频呼入 5 预测式外呼 6 内线呼叫</p> 
     * @return CallType <p>通话类型 1 呼出 2 呼入 3 音频呼入 5 预测式外呼 6 内线呼叫</p>
     */
    public Long getCallType() {
        return this.CallType;
    }

    /**
     * Set <p>通话类型 1 呼出 2 呼入 3 音频呼入 5 预测式外呼 6 内线呼叫</p>
     * @param CallType <p>通话类型 1 呼出 2 呼入 3 音频呼入 5 预测式外呼 6 内线呼叫</p>
     */
    public void setCallType(Long CallType) {
        this.CallType = CallType;
    }

    /**
     * Get <p>开始时间戳，Unix 秒级时间戳</p> 
     * @return StartTimeStamp <p>开始时间戳，Unix 秒级时间戳</p>
     */
    public Long getStartTimeStamp() {
        return this.StartTimeStamp;
    }

    /**
     * Set <p>开始时间戳，Unix 秒级时间戳</p>
     * @param StartTimeStamp <p>开始时间戳，Unix 秒级时间戳</p>
     */
    public void setStartTimeStamp(Long StartTimeStamp) {
        this.StartTimeStamp = StartTimeStamp;
    }

    /**
     * Get <p>振铃时间戳，UNIX 秒级时间戳</p> 
     * @return RingTimestamp <p>振铃时间戳，UNIX 秒级时间戳</p>
     */
    public Long getRingTimestamp() {
        return this.RingTimestamp;
    }

    /**
     * Set <p>振铃时间戳，UNIX 秒级时间戳</p>
     * @param RingTimestamp <p>振铃时间戳，UNIX 秒级时间戳</p>
     */
    public void setRingTimestamp(Long RingTimestamp) {
        this.RingTimestamp = RingTimestamp;
    }

    /**
     * Get <p>接听时间戳，UNIX 秒级时间戳</p> 
     * @return AcceptTimestamp <p>接听时间戳，UNIX 秒级时间戳</p>
     */
    public Long getAcceptTimestamp() {
        return this.AcceptTimestamp;
    }

    /**
     * Set <p>接听时间戳，UNIX 秒级时间戳</p>
     * @param AcceptTimestamp <p>接听时间戳，UNIX 秒级时间戳</p>
     */
    public void setAcceptTimestamp(Long AcceptTimestamp) {
        this.AcceptTimestamp = AcceptTimestamp;
    }

    /**
     * Get <p>结束时间戳，UNIX 秒级时间戳</p> 
     * @return EndedTimestamp <p>结束时间戳，UNIX 秒级时间戳</p>
     */
    public Long getEndedTimestamp() {
        return this.EndedTimestamp;
    }

    /**
     * Set <p>结束时间戳，UNIX 秒级时间戳</p>
     * @param EndedTimestamp <p>结束时间戳，UNIX 秒级时间戳</p>
     */
    public void setEndedTimestamp(Long EndedTimestamp) {
        this.EndedTimestamp = EndedTimestamp;
    }

    /**
     * Get <p>进入排队时间，Unix 秒级时间戳</p> 
     * @return QueuedTimestamp <p>进入排队时间，Unix 秒级时间戳</p>
     */
    public Long getQueuedTimestamp() {
        return this.QueuedTimestamp;
    }

    /**
     * Set <p>进入排队时间，Unix 秒级时间戳</p>
     * @param QueuedTimestamp <p>进入排队时间，Unix 秒级时间戳</p>
     */
    public void setQueuedTimestamp(Long QueuedTimestamp) {
        this.QueuedTimestamp = QueuedTimestamp;
    }

    /**
     * Get <p>座席账号</p> 
     * @return StaffUserId <p>座席账号</p>
     */
    public String getStaffUserId() {
        return this.StaffUserId;
    }

    /**
     * Set <p>座席账号</p>
     * @param StaffUserId <p>座席账号</p>
     */
    public void setStaffUserId(String StaffUserId) {
        this.StaffUserId = StaffUserId;
    }

    /**
     * Get <p>参考 DescribeTelCdr 接口 EndStatus 字段</p> 
     * @return EndStatus <p>参考 DescribeTelCdr 接口 EndStatus 字段</p>
     */
    public Long getEndStatus() {
        return this.EndStatus;
    }

    /**
     * Set <p>参考 DescribeTelCdr 接口 EndStatus 字段</p>
     * @param EndStatus <p>参考 DescribeTelCdr 接口 EndStatus 字段</p>
     */
    public void setEndStatus(Long EndStatus) {
        this.EndStatus = EndStatus;
    }

    /**
     * Get <p>排队技能组 ID</p> 
     * @return QueuedSkillGroupId <p>排队技能组 ID</p>
     */
    public Long getQueuedSkillGroupId() {
        return this.QueuedSkillGroupId;
    }

    /**
     * Set <p>排队技能组 ID</p>
     * @param QueuedSkillGroupId <p>排队技能组 ID</p>
     */
    public void setQueuedSkillGroupId(Long QueuedSkillGroupId) {
        this.QueuedSkillGroupId = QueuedSkillGroupId;
    }

    /**
     * Get <p>排队技能组名称</p> 
     * @return QueuedSkillGroupName <p>排队技能组名称</p>
     */
    public String getQueuedSkillGroupName() {
        return this.QueuedSkillGroupName;
    }

    /**
     * Set <p>排队技能组名称</p>
     * @param QueuedSkillGroupName <p>排队技能组名称</p>
     */
    public void setQueuedSkillGroupName(String QueuedSkillGroupName) {
        this.QueuedSkillGroupName = QueuedSkillGroupName;
    }

    /**
     * Get <p>录音链接，带鉴权和有效期，获取之后请在24 小时内拉取，不要持久化此链接。如此链接已过期，请重新调用此接口获取新的链接</p> 
     * @return RecordURL <p>录音链接，带鉴权和有效期，获取之后请在24 小时内拉取，不要持久化此链接。如此链接已过期，请重新调用此接口获取新的链接</p>
     */
    public String getRecordURL() {
        return this.RecordURL;
    }

    /**
     * Set <p>录音链接，带鉴权和有效期，获取之后请在24 小时内拉取，不要持久化此链接。如此链接已过期，请重新调用此接口获取新的链接</p>
     * @param RecordURL <p>录音链接，带鉴权和有效期，获取之后请在24 小时内拉取，不要持久化此链接。如此链接已过期，请重新调用此接口获取新的链接</p>
     */
    public void setRecordURL(String RecordURL) {
        this.RecordURL = RecordURL;
    }

    /**
     * Get <p>录音转存第三方 COS 链接</p> 
     * @return CustomRecordURL <p>录音转存第三方 COS 链接</p>
     */
    public String getCustomRecordURL() {
        return this.CustomRecordURL;
    }

    /**
     * Set <p>录音转存第三方 COS 链接</p>
     * @param CustomRecordURL <p>录音转存第三方 COS 链接</p>
     */
    public void setCustomRecordURL(String CustomRecordURL) {
        this.CustomRecordURL = CustomRecordURL;
    }

    /**
     * Get <p>录音文本信息链接，带鉴权和有效期，获取之后请在24 小时拉取，不要持久化此链接。如此链接已过期，请重新调用此接口获取新的链接</p> 
     * @return AsrURL <p>录音文本信息链接，带鉴权和有效期，获取之后请在24 小时拉取，不要持久化此链接。如此链接已过期，请重新调用此接口获取新的链接</p>
     */
    public String getAsrURL() {
        return this.AsrURL;
    }

    /**
     * Set <p>录音文本信息链接，带鉴权和有效期，获取之后请在24 小时拉取，不要持久化此链接。如此链接已过期，请重新调用此接口获取新的链接</p>
     * @param AsrURL <p>录音文本信息链接，带鉴权和有效期，获取之后请在24 小时拉取，不要持久化此链接。如此链接已过期，请重新调用此接口获取新的链接</p>
     */
    public void setAsrURL(String AsrURL) {
        this.AsrURL = AsrURL;
    }

    /**
     * Get <p>语音留言录音链接</p> 
     * @return VoicemailRecordURL <p>语音留言录音链接</p>
     */
    public String [] getVoicemailRecordURL() {
        return this.VoicemailRecordURL;
    }

    /**
     * Set <p>语音留言录音链接</p>
     * @param VoicemailRecordURL <p>语音留言录音链接</p>
     */
    public void setVoicemailRecordURL(String [] VoicemailRecordURL) {
        this.VoicemailRecordURL = VoicemailRecordURL;
    }

    /**
     * Get <p>语音留言录音文本信息链接，需在控制台购买离线语音识别套餐包并开启离线语音识别开关</p> 
     * @return VoicemailAsrURL <p>语音留言录音文本信息链接，需在控制台购买离线语音识别套餐包并开启离线语音识别开关</p>
     */
    public String [] getVoicemailAsrURL() {
        return this.VoicemailAsrURL;
    }

    /**
     * Set <p>语音留言录音文本信息链接，需在控制台购买离线语音识别套餐包并开启离线语音识别开关</p>
     * @param VoicemailAsrURL <p>语音留言录音文本信息链接，需在控制台购买离线语音识别套餐包并开启离线语音识别开关</p>
     */
    public void setVoicemailAsrURL(String [] VoicemailAsrURL) {
        this.VoicemailAsrURL = VoicemailAsrURL;
    }

    /**
     * Get <p>IVR 按键信息</p> 
     * @return IVRKeyPressed <p>IVR 按键信息</p>
     */
    public IVRKeyPressedElement [] getIVRKeyPressed() {
        return this.IVRKeyPressed;
    }

    /**
     * Set <p>IVR 按键信息</p>
     * @param IVRKeyPressed <p>IVR 按键信息</p>
     */
    public void setIVRKeyPressed(IVRKeyPressedElement [] IVRKeyPressed) {
        this.IVRKeyPressed = IVRKeyPressed;
    }

    /**
     * Get <p>满意度按键信息</p> 
     * @return PostIVRKeyPressed <p>满意度按键信息</p>
     */
    public IVRKeyPressedElement [] getPostIVRKeyPressed() {
        return this.PostIVRKeyPressed;
    }

    /**
     * Set <p>满意度按键信息</p>
     * @param PostIVRKeyPressed <p>满意度按键信息</p>
     */
    public void setPostIVRKeyPressed(IVRKeyPressedElement [] PostIVRKeyPressed) {
        this.PostIVRKeyPressed = PostIVRKeyPressed;
    }

    /**
     * Get <p>挂机方 seat 座席 user 用户 system 系统</p> 
     * @return HungUpSide <p>挂机方 seat 座席 user 用户 system 系统</p>
     */
    public String getHungUpSide() {
        return this.HungUpSide;
    }

    /**
     * Set <p>挂机方 seat 座席 user 用户 system 系统</p>
     * @param HungUpSide <p>挂机方 seat 座席 user 用户 system 系统</p>
     */
    public void setHungUpSide(String HungUpSide) {
        this.HungUpSide = HungUpSide;
    }

    /**
     * Get <p>客户自定义数据（User-to-User Interface）</p> 
     * @return UUI <p>客户自定义数据（User-to-User Interface）</p>
     */
    public String getUUI() {
        return this.UUI;
    }

    /**
     * Set <p>客户自定义数据（User-to-User Interface）</p>
     * @param UUI <p>客户自定义数据（User-to-User Interface）</p>
     */
    public void setUUI(String UUI) {
        this.UUI = UUI;
    }

    /**
     * Get <p>通话中的事件列表</p> 
     * @return Events <p>通话中的事件列表</p>
     */
    public SessionEvent [] getEvents() {
        return this.Events;
    }

    /**
     * Set <p>通话中的事件列表</p>
     * @param Events <p>通话中的事件列表</p>
     */
    public void setEvents(SessionEvent [] Events) {
        this.Events = Events;
    }

    /**
     * Get <p>服务参与者列表</p> 
     * @return ServeParticipants <p>服务参与者列表</p>
     */
    public ServeParticipant [] getServeParticipants() {
        return this.ServeParticipants;
    }

    /**
     * Set <p>服务参与者列表</p>
     * @param ServeParticipants <p>服务参与者列表</p>
     */
    public void setServeParticipants(ServeParticipant [] ServeParticipants) {
        this.ServeParticipants = ServeParticipants;
    }

    /**
     * Get <p>接通后系统挂断原因状态码</p><p><a href="https://cloud.tencent.com/document/product/679/123938">详见</a></p> 
     * @return SysHangupReason <p>接通后系统挂断原因状态码</p><p><a href="https://cloud.tencent.com/document/product/679/123938">详见</a></p>
     */
    public Long getSysHangupReason() {
        return this.SysHangupReason;
    }

    /**
     * Set <p>接通后系统挂断原因状态码</p><p><a href="https://cloud.tencent.com/document/product/679/123938">详见</a></p>
     * @param SysHangupReason <p>接通后系统挂断原因状态码</p><p><a href="https://cloud.tencent.com/document/product/679/123938">详见</a></p>
     */
    public void setSysHangupReason(Long SysHangupReason) {
        this.SysHangupReason = SysHangupReason;
    }

    /**
     * Get <p>接通后系统挂断原因</p><p><a href="https://cloud.tencent.com/document/product/679/123938">详见</a></p> 
     * @return SysHangupReasonString <p>接通后系统挂断原因</p><p><a href="https://cloud.tencent.com/document/product/679/123938">详见</a></p>
     */
    public String getSysHangupReasonString() {
        return this.SysHangupReasonString;
    }

    /**
     * Set <p>接通后系统挂断原因</p><p><a href="https://cloud.tencent.com/document/product/679/123938">详见</a></p>
     * @param SysHangupReasonString <p>接通后系统挂断原因</p><p><a href="https://cloud.tencent.com/document/product/679/123938">详见</a></p>
     */
    public void setSysHangupReasonString(String SysHangupReasonString) {
        this.SysHangupReasonString = SysHangupReasonString;
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
        if (source.SysHangupReason != null) {
            this.SysHangupReason = new Long(source.SysHangupReason);
        }
        if (source.SysHangupReasonString != null) {
            this.SysHangupReasonString = new String(source.SysHangupReasonString);
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
        this.setParamSimple(map, prefix + "SysHangupReason", this.SysHangupReason);
        this.setParamSimple(map, prefix + "SysHangupReasonString", this.SysHangupReasonString);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

