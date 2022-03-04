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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TelCdrInfo extends AbstractModel{

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
    * 呼叫发起时间戳，Unix 时间戳
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * 呼入呼出方向 0 呼入 1 呼出
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * 通话时长
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 录音信息
    */
    @SerializedName("RecordURL")
    @Expose
    private String RecordURL;

    /**
    * 坐席信息
    */
    @SerializedName("SeatUser")
    @Expose
    private SeatUserInfo SeatUser;

    /**
    * 结束状态
0	错误
1	正常结束
2	未接通
17	坐席未接
100	黑名单
101	坐席转接
102	IVR 期间用户放弃
103	会话排队期间用户放弃
104	会话振铃期间用户放弃
105	无坐席在线
106	非工作时间
107	IVR后直接结束
201	未知状态
202	未接听
203	拒接挂断
204	关机
205	空号
206	通话中
207	欠费
208	运营商线路异常
209	主叫取消
210	不在服务区
    */
    @SerializedName("EndStatus")
    @Expose
    private Long EndStatus;

    /**
    * 技能组名称
    */
    @SerializedName("SkillGroup")
    @Expose
    private String SkillGroup;

    /**
    * 主叫归属地
    */
    @SerializedName("CallerLocation")
    @Expose
    private String CallerLocation;

    /**
    * IVR 阶段耗时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IVRDuration")
    @Expose
    private Long IVRDuration;

    /**
    * 振铃时间戳，UNIX 秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RingTimestamp")
    @Expose
    private Long RingTimestamp;

    /**
    * 接听时间戳，UNIX 秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AcceptTimestamp")
    @Expose
    private Long AcceptTimestamp;

    /**
    * 结束时间戳，UNIX 秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndedTimestamp")
    @Expose
    private Long EndedTimestamp;

    /**
    * IVR 按键信息 ，e.g. ["1","2","3"]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IVRKeyPressed")
    @Expose
    private String [] IVRKeyPressed;

    /**
    * 挂机方 seat 坐席 user 用户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HungUpSide")
    @Expose
    private String HungUpSide;

    /**
    * 服务参与者列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServeParticipants")
    @Expose
    private ServeParticipant [] ServeParticipants;

    /**
    * 技能组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SkillGroupId")
    @Expose
    private Long SkillGroupId;

    /**
    * error                   错误
ok                       正常结束
unconnected      未接通
seatGiveUp         坐席未接
blackList             黑名单
seatForward       坐席转接
ivrGiveUp           IVR 期间用户放弃
waitingGiveUp   会话排队期间用户放弃
ringingGiveUp   会话振铃期间用户放弃
noSeatOnline     无坐席在线
notWorkTime     非工作时间
ivrEnd                 IVR后直接结束
unknown            未知状态
notAnswer          未接听
userReject          拒接挂断
powerOff            关机
numberNotExist  空号
busy                    通话中
outOfCredit        欠费
operatorError     运营商线路异常
callerCancel        主叫取消
notInService       不在服务区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndStatusString")
    @Expose
    private String EndStatusString;

    /**
    * 会话开始时间戳，UNIX 秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTimestamp")
    @Expose
    private Long StartTimestamp;

    /**
    * 进入排队时间，Unix 秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueuedTimestamp")
    @Expose
    private Long QueuedTimestamp;

    /**
    * 后置IVR按键信息（e.g. [{"Key":"1","Label":"非常满意"}]）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PostIVRKeyPressed")
    @Expose
    private IVRKeyPressedElement [] PostIVRKeyPressed;

    /**
    * 排队技能组Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueuedSkillGroupId")
    @Expose
    private Long QueuedSkillGroupId;

    /**
    * 会话 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 主叫号码保护ID，开启号码保护映射功能时有效，且Caller字段置空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProtectedCaller")
    @Expose
    private String ProtectedCaller;

    /**
    * 被叫号码保护ID，开启号码保护映射功能时有效，且Callee字段置空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProtectedCallee")
    @Expose
    private String ProtectedCallee;

    /**
    * 客户自定义数据（User-to-User Interface）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uui")
    @Expose
    private String Uui;

    /**
    * IVR按键信息（e.g. [{"Key":"1","Label":"非常满意"}]）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IVRKeyPressedEx")
    @Expose
    private IVRKeyPressedElement [] IVRKeyPressedEx;

    /**
    * 获取录音ASR文本信息地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AsrUrl")
    @Expose
    private String AsrUrl;

    /**
    * 录音转存第三方COS地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomRecordURL")
    @Expose
    private String CustomRecordURL;

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
     * Get 呼叫发起时间戳，Unix 时间戳 
     * @return Time 呼叫发起时间戳，Unix 时间戳
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set 呼叫发起时间戳，Unix 时间戳
     * @param Time 呼叫发起时间戳，Unix 时间戳
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get 呼入呼出方向 0 呼入 1 呼出 
     * @return Direction 呼入呼出方向 0 呼入 1 呼出
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 呼入呼出方向 0 呼入 1 呼出
     * @param Direction 呼入呼出方向 0 呼入 1 呼出
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 通话时长 
     * @return Duration 通话时长
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 通话时长
     * @param Duration 通话时长
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 录音信息 
     * @return RecordURL 录音信息
     */
    public String getRecordURL() {
        return this.RecordURL;
    }

    /**
     * Set 录音信息
     * @param RecordURL 录音信息
     */
    public void setRecordURL(String RecordURL) {
        this.RecordURL = RecordURL;
    }

    /**
     * Get 坐席信息 
     * @return SeatUser 坐席信息
     */
    public SeatUserInfo getSeatUser() {
        return this.SeatUser;
    }

    /**
     * Set 坐席信息
     * @param SeatUser 坐席信息
     */
    public void setSeatUser(SeatUserInfo SeatUser) {
        this.SeatUser = SeatUser;
    }

    /**
     * Get 结束状态
0	错误
1	正常结束
2	未接通
17	坐席未接
100	黑名单
101	坐席转接
102	IVR 期间用户放弃
103	会话排队期间用户放弃
104	会话振铃期间用户放弃
105	无坐席在线
106	非工作时间
107	IVR后直接结束
201	未知状态
202	未接听
203	拒接挂断
204	关机
205	空号
206	通话中
207	欠费
208	运营商线路异常
209	主叫取消
210	不在服务区 
     * @return EndStatus 结束状态
0	错误
1	正常结束
2	未接通
17	坐席未接
100	黑名单
101	坐席转接
102	IVR 期间用户放弃
103	会话排队期间用户放弃
104	会话振铃期间用户放弃
105	无坐席在线
106	非工作时间
107	IVR后直接结束
201	未知状态
202	未接听
203	拒接挂断
204	关机
205	空号
206	通话中
207	欠费
208	运营商线路异常
209	主叫取消
210	不在服务区
     */
    public Long getEndStatus() {
        return this.EndStatus;
    }

    /**
     * Set 结束状态
0	错误
1	正常结束
2	未接通
17	坐席未接
100	黑名单
101	坐席转接
102	IVR 期间用户放弃
103	会话排队期间用户放弃
104	会话振铃期间用户放弃
105	无坐席在线
106	非工作时间
107	IVR后直接结束
201	未知状态
202	未接听
203	拒接挂断
204	关机
205	空号
206	通话中
207	欠费
208	运营商线路异常
209	主叫取消
210	不在服务区
     * @param EndStatus 结束状态
0	错误
1	正常结束
2	未接通
17	坐席未接
100	黑名单
101	坐席转接
102	IVR 期间用户放弃
103	会话排队期间用户放弃
104	会话振铃期间用户放弃
105	无坐席在线
106	非工作时间
107	IVR后直接结束
201	未知状态
202	未接听
203	拒接挂断
204	关机
205	空号
206	通话中
207	欠费
208	运营商线路异常
209	主叫取消
210	不在服务区
     */
    public void setEndStatus(Long EndStatus) {
        this.EndStatus = EndStatus;
    }

    /**
     * Get 技能组名称 
     * @return SkillGroup 技能组名称
     */
    public String getSkillGroup() {
        return this.SkillGroup;
    }

    /**
     * Set 技能组名称
     * @param SkillGroup 技能组名称
     */
    public void setSkillGroup(String SkillGroup) {
        this.SkillGroup = SkillGroup;
    }

    /**
     * Get 主叫归属地 
     * @return CallerLocation 主叫归属地
     */
    public String getCallerLocation() {
        return this.CallerLocation;
    }

    /**
     * Set 主叫归属地
     * @param CallerLocation 主叫归属地
     */
    public void setCallerLocation(String CallerLocation) {
        this.CallerLocation = CallerLocation;
    }

    /**
     * Get IVR 阶段耗时
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IVRDuration IVR 阶段耗时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIVRDuration() {
        return this.IVRDuration;
    }

    /**
     * Set IVR 阶段耗时
注意：此字段可能返回 null，表示取不到有效值。
     * @param IVRDuration IVR 阶段耗时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIVRDuration(Long IVRDuration) {
        this.IVRDuration = IVRDuration;
    }

    /**
     * Get 振铃时间戳，UNIX 秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RingTimestamp 振铃时间戳，UNIX 秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRingTimestamp() {
        return this.RingTimestamp;
    }

    /**
     * Set 振铃时间戳，UNIX 秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param RingTimestamp 振铃时间戳，UNIX 秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRingTimestamp(Long RingTimestamp) {
        this.RingTimestamp = RingTimestamp;
    }

    /**
     * Get 接听时间戳，UNIX 秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AcceptTimestamp 接听时间戳，UNIX 秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAcceptTimestamp() {
        return this.AcceptTimestamp;
    }

    /**
     * Set 接听时间戳，UNIX 秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param AcceptTimestamp 接听时间戳，UNIX 秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAcceptTimestamp(Long AcceptTimestamp) {
        this.AcceptTimestamp = AcceptTimestamp;
    }

    /**
     * Get 结束时间戳，UNIX 秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndedTimestamp 结束时间戳，UNIX 秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndedTimestamp() {
        return this.EndedTimestamp;
    }

    /**
     * Set 结束时间戳，UNIX 秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndedTimestamp 结束时间戳，UNIX 秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndedTimestamp(Long EndedTimestamp) {
        this.EndedTimestamp = EndedTimestamp;
    }

    /**
     * Get IVR 按键信息 ，e.g. ["1","2","3"]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IVRKeyPressed IVR 按键信息 ，e.g. ["1","2","3"]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIVRKeyPressed() {
        return this.IVRKeyPressed;
    }

    /**
     * Set IVR 按键信息 ，e.g. ["1","2","3"]
注意：此字段可能返回 null，表示取不到有效值。
     * @param IVRKeyPressed IVR 按键信息 ，e.g. ["1","2","3"]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIVRKeyPressed(String [] IVRKeyPressed) {
        this.IVRKeyPressed = IVRKeyPressed;
    }

    /**
     * Get 挂机方 seat 坐席 user 用户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HungUpSide 挂机方 seat 坐席 user 用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHungUpSide() {
        return this.HungUpSide;
    }

    /**
     * Set 挂机方 seat 坐席 user 用户
注意：此字段可能返回 null，表示取不到有效值。
     * @param HungUpSide 挂机方 seat 坐席 user 用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHungUpSide(String HungUpSide) {
        this.HungUpSide = HungUpSide;
    }

    /**
     * Get 服务参与者列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServeParticipants 服务参与者列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServeParticipant [] getServeParticipants() {
        return this.ServeParticipants;
    }

    /**
     * Set 服务参与者列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServeParticipants 服务参与者列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServeParticipants(ServeParticipant [] ServeParticipants) {
        this.ServeParticipants = ServeParticipants;
    }

    /**
     * Get 技能组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SkillGroupId 技能组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSkillGroupId() {
        return this.SkillGroupId;
    }

    /**
     * Set 技能组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SkillGroupId 技能组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSkillGroupId(Long SkillGroupId) {
        this.SkillGroupId = SkillGroupId;
    }

    /**
     * Get error                   错误
ok                       正常结束
unconnected      未接通
seatGiveUp         坐席未接
blackList             黑名单
seatForward       坐席转接
ivrGiveUp           IVR 期间用户放弃
waitingGiveUp   会话排队期间用户放弃
ringingGiveUp   会话振铃期间用户放弃
noSeatOnline     无坐席在线
notWorkTime     非工作时间
ivrEnd                 IVR后直接结束
unknown            未知状态
notAnswer          未接听
userReject          拒接挂断
powerOff            关机
numberNotExist  空号
busy                    通话中
outOfCredit        欠费
operatorError     运营商线路异常
callerCancel        主叫取消
notInService       不在服务区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndStatusString error                   错误
ok                       正常结束
unconnected      未接通
seatGiveUp         坐席未接
blackList             黑名单
seatForward       坐席转接
ivrGiveUp           IVR 期间用户放弃
waitingGiveUp   会话排队期间用户放弃
ringingGiveUp   会话振铃期间用户放弃
noSeatOnline     无坐席在线
notWorkTime     非工作时间
ivrEnd                 IVR后直接结束
unknown            未知状态
notAnswer          未接听
userReject          拒接挂断
powerOff            关机
numberNotExist  空号
busy                    通话中
outOfCredit        欠费
operatorError     运营商线路异常
callerCancel        主叫取消
notInService       不在服务区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndStatusString() {
        return this.EndStatusString;
    }

    /**
     * Set error                   错误
ok                       正常结束
unconnected      未接通
seatGiveUp         坐席未接
blackList             黑名单
seatForward       坐席转接
ivrGiveUp           IVR 期间用户放弃
waitingGiveUp   会话排队期间用户放弃
ringingGiveUp   会话振铃期间用户放弃
noSeatOnline     无坐席在线
notWorkTime     非工作时间
ivrEnd                 IVR后直接结束
unknown            未知状态
notAnswer          未接听
userReject          拒接挂断
powerOff            关机
numberNotExist  空号
busy                    通话中
outOfCredit        欠费
operatorError     运营商线路异常
callerCancel        主叫取消
notInService       不在服务区
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndStatusString error                   错误
ok                       正常结束
unconnected      未接通
seatGiveUp         坐席未接
blackList             黑名单
seatForward       坐席转接
ivrGiveUp           IVR 期间用户放弃
waitingGiveUp   会话排队期间用户放弃
ringingGiveUp   会话振铃期间用户放弃
noSeatOnline     无坐席在线
notWorkTime     非工作时间
ivrEnd                 IVR后直接结束
unknown            未知状态
notAnswer          未接听
userReject          拒接挂断
powerOff            关机
numberNotExist  空号
busy                    通话中
outOfCredit        欠费
operatorError     运营商线路异常
callerCancel        主叫取消
notInService       不在服务区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndStatusString(String EndStatusString) {
        this.EndStatusString = EndStatusString;
    }

    /**
     * Get 会话开始时间戳，UNIX 秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTimestamp 会话开始时间戳，UNIX 秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartTimestamp() {
        return this.StartTimestamp;
    }

    /**
     * Set 会话开始时间戳，UNIX 秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTimestamp 会话开始时间戳，UNIX 秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTimestamp(Long StartTimestamp) {
        this.StartTimestamp = StartTimestamp;
    }

    /**
     * Get 进入排队时间，Unix 秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueuedTimestamp 进入排队时间，Unix 秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQueuedTimestamp() {
        return this.QueuedTimestamp;
    }

    /**
     * Set 进入排队时间，Unix 秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueuedTimestamp 进入排队时间，Unix 秒级时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueuedTimestamp(Long QueuedTimestamp) {
        this.QueuedTimestamp = QueuedTimestamp;
    }

    /**
     * Get 后置IVR按键信息（e.g. [{"Key":"1","Label":"非常满意"}]）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PostIVRKeyPressed 后置IVR按键信息（e.g. [{"Key":"1","Label":"非常满意"}]）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IVRKeyPressedElement [] getPostIVRKeyPressed() {
        return this.PostIVRKeyPressed;
    }

    /**
     * Set 后置IVR按键信息（e.g. [{"Key":"1","Label":"非常满意"}]）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PostIVRKeyPressed 后置IVR按键信息（e.g. [{"Key":"1","Label":"非常满意"}]）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPostIVRKeyPressed(IVRKeyPressedElement [] PostIVRKeyPressed) {
        this.PostIVRKeyPressed = PostIVRKeyPressed;
    }

    /**
     * Get 排队技能组Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueuedSkillGroupId 排队技能组Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQueuedSkillGroupId() {
        return this.QueuedSkillGroupId;
    }

    /**
     * Set 排队技能组Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueuedSkillGroupId 排队技能组Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueuedSkillGroupId(Long QueuedSkillGroupId) {
        this.QueuedSkillGroupId = QueuedSkillGroupId;
    }

    /**
     * Get 会话 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionId 会话 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 会话 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionId 会话 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 主叫号码保护ID，开启号码保护映射功能时有效，且Caller字段置空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProtectedCaller 主叫号码保护ID，开启号码保护映射功能时有效，且Caller字段置空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtectedCaller() {
        return this.ProtectedCaller;
    }

    /**
     * Set 主叫号码保护ID，开启号码保护映射功能时有效，且Caller字段置空
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProtectedCaller 主叫号码保护ID，开启号码保护映射功能时有效，且Caller字段置空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtectedCaller(String ProtectedCaller) {
        this.ProtectedCaller = ProtectedCaller;
    }

    /**
     * Get 被叫号码保护ID，开启号码保护映射功能时有效，且Callee字段置空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProtectedCallee 被叫号码保护ID，开启号码保护映射功能时有效，且Callee字段置空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtectedCallee() {
        return this.ProtectedCallee;
    }

    /**
     * Set 被叫号码保护ID，开启号码保护映射功能时有效，且Callee字段置空
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProtectedCallee 被叫号码保护ID，开启号码保护映射功能时有效，且Callee字段置空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtectedCallee(String ProtectedCallee) {
        this.ProtectedCallee = ProtectedCallee;
    }

    /**
     * Get 客户自定义数据（User-to-User Interface）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uui 客户自定义数据（User-to-User Interface）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUui() {
        return this.Uui;
    }

    /**
     * Set 客户自定义数据（User-to-User Interface）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uui 客户自定义数据（User-to-User Interface）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUui(String Uui) {
        this.Uui = Uui;
    }

    /**
     * Get IVR按键信息（e.g. [{"Key":"1","Label":"非常满意"}]）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IVRKeyPressedEx IVR按键信息（e.g. [{"Key":"1","Label":"非常满意"}]）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IVRKeyPressedElement [] getIVRKeyPressedEx() {
        return this.IVRKeyPressedEx;
    }

    /**
     * Set IVR按键信息（e.g. [{"Key":"1","Label":"非常满意"}]）
注意：此字段可能返回 null，表示取不到有效值。
     * @param IVRKeyPressedEx IVR按键信息（e.g. [{"Key":"1","Label":"非常满意"}]）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIVRKeyPressedEx(IVRKeyPressedElement [] IVRKeyPressedEx) {
        this.IVRKeyPressedEx = IVRKeyPressedEx;
    }

    /**
     * Get 获取录音ASR文本信息地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AsrUrl 获取录音ASR文本信息地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAsrUrl() {
        return this.AsrUrl;
    }

    /**
     * Set 获取录音ASR文本信息地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param AsrUrl 获取录音ASR文本信息地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAsrUrl(String AsrUrl) {
        this.AsrUrl = AsrUrl;
    }

    /**
     * Get 录音转存第三方COS地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomRecordURL 录音转存第三方COS地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomRecordURL() {
        return this.CustomRecordURL;
    }

    /**
     * Set 录音转存第三方COS地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomRecordURL 录音转存第三方COS地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomRecordURL(String CustomRecordURL) {
        this.CustomRecordURL = CustomRecordURL;
    }

    public TelCdrInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TelCdrInfo(TelCdrInfo source) {
        if (source.Caller != null) {
            this.Caller = new String(source.Caller);
        }
        if (source.Callee != null) {
            this.Callee = new String(source.Callee);
        }
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.RecordURL != null) {
            this.RecordURL = new String(source.RecordURL);
        }
        if (source.SeatUser != null) {
            this.SeatUser = new SeatUserInfo(source.SeatUser);
        }
        if (source.EndStatus != null) {
            this.EndStatus = new Long(source.EndStatus);
        }
        if (source.SkillGroup != null) {
            this.SkillGroup = new String(source.SkillGroup);
        }
        if (source.CallerLocation != null) {
            this.CallerLocation = new String(source.CallerLocation);
        }
        if (source.IVRDuration != null) {
            this.IVRDuration = new Long(source.IVRDuration);
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
        if (source.IVRKeyPressed != null) {
            this.IVRKeyPressed = new String[source.IVRKeyPressed.length];
            for (int i = 0; i < source.IVRKeyPressed.length; i++) {
                this.IVRKeyPressed[i] = new String(source.IVRKeyPressed[i]);
            }
        }
        if (source.HungUpSide != null) {
            this.HungUpSide = new String(source.HungUpSide);
        }
        if (source.ServeParticipants != null) {
            this.ServeParticipants = new ServeParticipant[source.ServeParticipants.length];
            for (int i = 0; i < source.ServeParticipants.length; i++) {
                this.ServeParticipants[i] = new ServeParticipant(source.ServeParticipants[i]);
            }
        }
        if (source.SkillGroupId != null) {
            this.SkillGroupId = new Long(source.SkillGroupId);
        }
        if (source.EndStatusString != null) {
            this.EndStatusString = new String(source.EndStatusString);
        }
        if (source.StartTimestamp != null) {
            this.StartTimestamp = new Long(source.StartTimestamp);
        }
        if (source.QueuedTimestamp != null) {
            this.QueuedTimestamp = new Long(source.QueuedTimestamp);
        }
        if (source.PostIVRKeyPressed != null) {
            this.PostIVRKeyPressed = new IVRKeyPressedElement[source.PostIVRKeyPressed.length];
            for (int i = 0; i < source.PostIVRKeyPressed.length; i++) {
                this.PostIVRKeyPressed[i] = new IVRKeyPressedElement(source.PostIVRKeyPressed[i]);
            }
        }
        if (source.QueuedSkillGroupId != null) {
            this.QueuedSkillGroupId = new Long(source.QueuedSkillGroupId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.ProtectedCaller != null) {
            this.ProtectedCaller = new String(source.ProtectedCaller);
        }
        if (source.ProtectedCallee != null) {
            this.ProtectedCallee = new String(source.ProtectedCallee);
        }
        if (source.Uui != null) {
            this.Uui = new String(source.Uui);
        }
        if (source.IVRKeyPressedEx != null) {
            this.IVRKeyPressedEx = new IVRKeyPressedElement[source.IVRKeyPressedEx.length];
            for (int i = 0; i < source.IVRKeyPressedEx.length; i++) {
                this.IVRKeyPressedEx[i] = new IVRKeyPressedElement(source.IVRKeyPressedEx[i]);
            }
        }
        if (source.AsrUrl != null) {
            this.AsrUrl = new String(source.AsrUrl);
        }
        if (source.CustomRecordURL != null) {
            this.CustomRecordURL = new String(source.CustomRecordURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Caller", this.Caller);
        this.setParamSimple(map, prefix + "Callee", this.Callee);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "RecordURL", this.RecordURL);
        this.setParamObj(map, prefix + "SeatUser.", this.SeatUser);
        this.setParamSimple(map, prefix + "EndStatus", this.EndStatus);
        this.setParamSimple(map, prefix + "SkillGroup", this.SkillGroup);
        this.setParamSimple(map, prefix + "CallerLocation", this.CallerLocation);
        this.setParamSimple(map, prefix + "IVRDuration", this.IVRDuration);
        this.setParamSimple(map, prefix + "RingTimestamp", this.RingTimestamp);
        this.setParamSimple(map, prefix + "AcceptTimestamp", this.AcceptTimestamp);
        this.setParamSimple(map, prefix + "EndedTimestamp", this.EndedTimestamp);
        this.setParamArraySimple(map, prefix + "IVRKeyPressed.", this.IVRKeyPressed);
        this.setParamSimple(map, prefix + "HungUpSide", this.HungUpSide);
        this.setParamArrayObj(map, prefix + "ServeParticipants.", this.ServeParticipants);
        this.setParamSimple(map, prefix + "SkillGroupId", this.SkillGroupId);
        this.setParamSimple(map, prefix + "EndStatusString", this.EndStatusString);
        this.setParamSimple(map, prefix + "StartTimestamp", this.StartTimestamp);
        this.setParamSimple(map, prefix + "QueuedTimestamp", this.QueuedTimestamp);
        this.setParamArrayObj(map, prefix + "PostIVRKeyPressed.", this.PostIVRKeyPressed);
        this.setParamSimple(map, prefix + "QueuedSkillGroupId", this.QueuedSkillGroupId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "ProtectedCaller", this.ProtectedCaller);
        this.setParamSimple(map, prefix + "ProtectedCallee", this.ProtectedCallee);
        this.setParamSimple(map, prefix + "Uui", this.Uui);
        this.setParamArrayObj(map, prefix + "IVRKeyPressedEx.", this.IVRKeyPressedEx);
        this.setParamSimple(map, prefix + "AsrUrl", this.AsrUrl);
        this.setParamSimple(map, prefix + "CustomRecordURL", this.CustomRecordURL);

    }
}

