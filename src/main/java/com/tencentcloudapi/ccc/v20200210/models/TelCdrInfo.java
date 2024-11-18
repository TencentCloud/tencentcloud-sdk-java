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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TelCdrInfo extends AbstractModel {

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
    * 录音 ID
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * 座席信息
    */
    @SerializedName("SeatUser")
    @Expose
    private SeatUserInfo SeatUser;

    /**
    * EndStatus与EndStatusString一一对应，具体枚举如下：

**场景	         EndStatus	EndStatusString	状态说明**

电话呼入&呼出	1	        ok	                        正常结束

电话呼入&呼出	0	        error	                系统错误

电话呼入	             102	        ivrGiveUp	        IVR 期间用户放弃

电话呼入	             103	        waitingGiveUp	       会话排队期间用户放弃

电话呼入	             104	        ringingGiveUp	       会话振铃期间用户放弃

电话呼入	             105	        noSeatOnline	       无座席在线

电话呼入              106	       notWorkTime	       非工作时间   

电话呼入	            107	       ivrEnd	               IVR 后直接结束

电话呼入	            100	      blackList 呼入黑名单 

电话呼出               2	              unconnected	未接通

电话呼出             108	        restrictedCallee	被叫因高风险受限

电话呼出             109	        tooManyRequest	    超频

电话呼出             110	        restrictedArea	    外呼盲区

电话呼出             111	        restrictedTime	外呼时间限制
                         
电话呼出             201            unknown	未知状态

电话呼出             202            notAnswer	未接听

电话呼出            203	    userReject	拒接挂断

电话呼出	          204	    powerOff	关机

电话呼出           205            numberNotExist	空号

电话呼出	         206	           busy	通话中

电话呼出   	        207	           outOfCredit	欠费

电话呼出	         208	           operatorError	运营商线路异常

电话呼出         	209	           callerCancel	主叫取消

电话呼出	        210	           notInService	不在服务区

电话呼入&呼出	211    clientError    客户端错误

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
    */
    @SerializedName("IVRDuration")
    @Expose
    private Long IVRDuration;

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
    * IVR 按键信息 ，e.g. ["1","2","3"]
    */
    @SerializedName("IVRKeyPressed")
    @Expose
    private String [] IVRKeyPressed;

    /**
    * 挂机方 seat 座席 user 用户 system 系统
    */
    @SerializedName("HungUpSide")
    @Expose
    private String HungUpSide;

    /**
    * 服务参与者列表
    */
    @SerializedName("ServeParticipants")
    @Expose
    private ServeParticipant [] ServeParticipants;

    /**
    * 技能组ID
    */
    @SerializedName("SkillGroupId")
    @Expose
    private Long SkillGroupId;

    /**
    * EndStatus与EndStatusString一一对应，具体枚举如下：

**场景	         EndStatus	EndStatusString	状态说明**

电话呼入&呼出	1	        ok	                        正常结束

电话呼入&呼出	0	        error	                系统错误

电话呼入	             102	        ivrGiveUp	        IVR 期间用户放弃

电话呼入	             103	        waitingGiveUp	       会话排队期间用户放弃

电话呼入	             104	        ringingGiveUp	       会话振铃期间用户放弃

电话呼入	             105	        noSeatOnline	       无座席在线

电话呼入              106	       notWorkTime	       非工作时间   

电话呼入	            107	       ivrEnd	               IVR 后直接结束

电话呼入	            100	      blackList 呼入黑名单 

电话呼出               2	              unconnected	未接通

电话呼出             108	        restrictedCallee	被叫因高风险受限

电话呼出             109	        tooManyRequest	    超频

电话呼出             110	        restrictedArea	    外呼盲区

电话呼出             111	        restrictedTime	外呼时间限制
                         
电话呼出             201            unknown	未知状态

电话呼出             202            notAnswer	未接听

电话呼出            203	    userReject	拒接挂断

电话呼出	          204	    powerOff	关机

电话呼出           205            numberNotExist	空号

电话呼出	         206	           busy	通话中

电话呼出   	        207	           outOfCredit	欠费

电话呼出	         208	           operatorError	运营商线路异常

电话呼出         	209	           callerCancel	主叫取消

电话呼出	        210	           notInService	不在服务区

电话呼入&呼出	211    clientError    客户端错误

    */
    @SerializedName("EndStatusString")
    @Expose
    private String EndStatusString;

    /**
    * 会话开始时间戳，UNIX 秒级时间戳
    */
    @SerializedName("StartTimestamp")
    @Expose
    private Long StartTimestamp;

    /**
    * 进入排队时间，Unix 秒级时间戳
    */
    @SerializedName("QueuedTimestamp")
    @Expose
    private Long QueuedTimestamp;

    /**
    * 后置IVR按键信息（e.g. [{"Key":"1","Label":"非常满意"}]）
    */
    @SerializedName("PostIVRKeyPressed")
    @Expose
    private IVRKeyPressedElement [] PostIVRKeyPressed;

    /**
    * 排队技能组Id
    */
    @SerializedName("QueuedSkillGroupId")
    @Expose
    private Long QueuedSkillGroupId;

    /**
    * 会话 ID
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 主叫号码保护ID，开启号码保护映射功能时有效，且Caller字段置空
    */
    @SerializedName("ProtectedCaller")
    @Expose
    private String ProtectedCaller;

    /**
    * 被叫号码保护ID，开启号码保护映射功能时有效，且Callee字段置空
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
    * 客户自定义数据（User-to-User Interface）
    */
    @SerializedName("UUI")
    @Expose
    private String UUI;

    /**
    * IVR按键信息（e.g. [{"Key":"1","Label":"非常满意"}]）
    */
    @SerializedName("IVRKeyPressedEx")
    @Expose
    private IVRKeyPressedElement [] IVRKeyPressedEx;

    /**
    * 获取录音ASR文本信息地址
    */
    @SerializedName("AsrUrl")
    @Expose
    private String AsrUrl;

    /**
    * AsrUrl的状态：Complete
已完成;
Processing
正在生成中;
NotExists
无记录(未开启生成离线asr或者无套餐包)
    */
    @SerializedName("AsrStatus")
    @Expose
    private String AsrStatus;

    /**
    * 录音转存第三方COS地址
    */
    @SerializedName("CustomRecordURL")
    @Expose
    private String CustomRecordURL;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 排队技能组名称
    */
    @SerializedName("QueuedSkillGroupName")
    @Expose
    private String QueuedSkillGroupName;

    /**
    * 通话中语音留言录音URL
    */
    @SerializedName("VoicemailRecordURL")
    @Expose
    private String [] VoicemailRecordURL;

    /**
    * 通话中语音留言ASR文本信息地址
    */
    @SerializedName("VoicemailAsrURL")
    @Expose
    private String [] VoicemailAsrURL;

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
     * Get 录音 ID 
     * @return RecordId 录音 ID
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 录音 ID
     * @param RecordId 录音 ID
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 座席信息 
     * @return SeatUser 座席信息
     */
    public SeatUserInfo getSeatUser() {
        return this.SeatUser;
    }

    /**
     * Set 座席信息
     * @param SeatUser 座席信息
     */
    public void setSeatUser(SeatUserInfo SeatUser) {
        this.SeatUser = SeatUser;
    }

    /**
     * Get EndStatus与EndStatusString一一对应，具体枚举如下：

**场景	         EndStatus	EndStatusString	状态说明**

电话呼入&呼出	1	        ok	                        正常结束

电话呼入&呼出	0	        error	                系统错误

电话呼入	             102	        ivrGiveUp	        IVR 期间用户放弃

电话呼入	             103	        waitingGiveUp	       会话排队期间用户放弃

电话呼入	             104	        ringingGiveUp	       会话振铃期间用户放弃

电话呼入	             105	        noSeatOnline	       无座席在线

电话呼入              106	       notWorkTime	       非工作时间   

电话呼入	            107	       ivrEnd	               IVR 后直接结束

电话呼入	            100	      blackList 呼入黑名单 

电话呼出               2	              unconnected	未接通

电话呼出             108	        restrictedCallee	被叫因高风险受限

电话呼出             109	        tooManyRequest	    超频

电话呼出             110	        restrictedArea	    外呼盲区

电话呼出             111	        restrictedTime	外呼时间限制
                         
电话呼出             201            unknown	未知状态

电话呼出             202            notAnswer	未接听

电话呼出            203	    userReject	拒接挂断

电话呼出	          204	    powerOff	关机

电话呼出           205            numberNotExist	空号

电话呼出	         206	           busy	通话中

电话呼出   	        207	           outOfCredit	欠费

电话呼出	         208	           operatorError	运营商线路异常

电话呼出         	209	           callerCancel	主叫取消

电话呼出	        210	           notInService	不在服务区

电话呼入&呼出	211    clientError    客户端错误
 
     * @return EndStatus EndStatus与EndStatusString一一对应，具体枚举如下：

**场景	         EndStatus	EndStatusString	状态说明**

电话呼入&呼出	1	        ok	                        正常结束

电话呼入&呼出	0	        error	                系统错误

电话呼入	             102	        ivrGiveUp	        IVR 期间用户放弃

电话呼入	             103	        waitingGiveUp	       会话排队期间用户放弃

电话呼入	             104	        ringingGiveUp	       会话振铃期间用户放弃

电话呼入	             105	        noSeatOnline	       无座席在线

电话呼入              106	       notWorkTime	       非工作时间   

电话呼入	            107	       ivrEnd	               IVR 后直接结束

电话呼入	            100	      blackList 呼入黑名单 

电话呼出               2	              unconnected	未接通

电话呼出             108	        restrictedCallee	被叫因高风险受限

电话呼出             109	        tooManyRequest	    超频

电话呼出             110	        restrictedArea	    外呼盲区

电话呼出             111	        restrictedTime	外呼时间限制
                         
电话呼出             201            unknown	未知状态

电话呼出             202            notAnswer	未接听

电话呼出            203	    userReject	拒接挂断

电话呼出	          204	    powerOff	关机

电话呼出           205            numberNotExist	空号

电话呼出	         206	           busy	通话中

电话呼出   	        207	           outOfCredit	欠费

电话呼出	         208	           operatorError	运营商线路异常

电话呼出         	209	           callerCancel	主叫取消

电话呼出	        210	           notInService	不在服务区

电话呼入&呼出	211    clientError    客户端错误

     */
    public Long getEndStatus() {
        return this.EndStatus;
    }

    /**
     * Set EndStatus与EndStatusString一一对应，具体枚举如下：

**场景	         EndStatus	EndStatusString	状态说明**

电话呼入&呼出	1	        ok	                        正常结束

电话呼入&呼出	0	        error	                系统错误

电话呼入	             102	        ivrGiveUp	        IVR 期间用户放弃

电话呼入	             103	        waitingGiveUp	       会话排队期间用户放弃

电话呼入	             104	        ringingGiveUp	       会话振铃期间用户放弃

电话呼入	             105	        noSeatOnline	       无座席在线

电话呼入              106	       notWorkTime	       非工作时间   

电话呼入	            107	       ivrEnd	               IVR 后直接结束

电话呼入	            100	      blackList 呼入黑名单 

电话呼出               2	              unconnected	未接通

电话呼出             108	        restrictedCallee	被叫因高风险受限

电话呼出             109	        tooManyRequest	    超频

电话呼出             110	        restrictedArea	    外呼盲区

电话呼出             111	        restrictedTime	外呼时间限制
                         
电话呼出             201            unknown	未知状态

电话呼出             202            notAnswer	未接听

电话呼出            203	    userReject	拒接挂断

电话呼出	          204	    powerOff	关机

电话呼出           205            numberNotExist	空号

电话呼出	         206	           busy	通话中

电话呼出   	        207	           outOfCredit	欠费

电话呼出	         208	           operatorError	运营商线路异常

电话呼出         	209	           callerCancel	主叫取消

电话呼出	        210	           notInService	不在服务区

电话呼入&呼出	211    clientError    客户端错误

     * @param EndStatus EndStatus与EndStatusString一一对应，具体枚举如下：

**场景	         EndStatus	EndStatusString	状态说明**

电话呼入&呼出	1	        ok	                        正常结束

电话呼入&呼出	0	        error	                系统错误

电话呼入	             102	        ivrGiveUp	        IVR 期间用户放弃

电话呼入	             103	        waitingGiveUp	       会话排队期间用户放弃

电话呼入	             104	        ringingGiveUp	       会话振铃期间用户放弃

电话呼入	             105	        noSeatOnline	       无座席在线

电话呼入              106	       notWorkTime	       非工作时间   

电话呼入	            107	       ivrEnd	               IVR 后直接结束

电话呼入	            100	      blackList 呼入黑名单 

电话呼出               2	              unconnected	未接通

电话呼出             108	        restrictedCallee	被叫因高风险受限

电话呼出             109	        tooManyRequest	    超频

电话呼出             110	        restrictedArea	    外呼盲区

电话呼出             111	        restrictedTime	外呼时间限制
                         
电话呼出             201            unknown	未知状态

电话呼出             202            notAnswer	未接听

电话呼出            203	    userReject	拒接挂断

电话呼出	          204	    powerOff	关机

电话呼出           205            numberNotExist	空号

电话呼出	         206	           busy	通话中

电话呼出   	        207	           outOfCredit	欠费

电话呼出	         208	           operatorError	运营商线路异常

电话呼出         	209	           callerCancel	主叫取消

电话呼出	        210	           notInService	不在服务区

电话呼入&呼出	211    clientError    客户端错误

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
     * @return IVRDuration IVR 阶段耗时
     */
    public Long getIVRDuration() {
        return this.IVRDuration;
    }

    /**
     * Set IVR 阶段耗时
     * @param IVRDuration IVR 阶段耗时
     */
    public void setIVRDuration(Long IVRDuration) {
        this.IVRDuration = IVRDuration;
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
     * Get IVR 按键信息 ，e.g. ["1","2","3"] 
     * @return IVRKeyPressed IVR 按键信息 ，e.g. ["1","2","3"]
     */
    public String [] getIVRKeyPressed() {
        return this.IVRKeyPressed;
    }

    /**
     * Set IVR 按键信息 ，e.g. ["1","2","3"]
     * @param IVRKeyPressed IVR 按键信息 ，e.g. ["1","2","3"]
     */
    public void setIVRKeyPressed(String [] IVRKeyPressed) {
        this.IVRKeyPressed = IVRKeyPressed;
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
     * Get 技能组ID 
     * @return SkillGroupId 技能组ID
     */
    public Long getSkillGroupId() {
        return this.SkillGroupId;
    }

    /**
     * Set 技能组ID
     * @param SkillGroupId 技能组ID
     */
    public void setSkillGroupId(Long SkillGroupId) {
        this.SkillGroupId = SkillGroupId;
    }

    /**
     * Get EndStatus与EndStatusString一一对应，具体枚举如下：

**场景	         EndStatus	EndStatusString	状态说明**

电话呼入&呼出	1	        ok	                        正常结束

电话呼入&呼出	0	        error	                系统错误

电话呼入	             102	        ivrGiveUp	        IVR 期间用户放弃

电话呼入	             103	        waitingGiveUp	       会话排队期间用户放弃

电话呼入	             104	        ringingGiveUp	       会话振铃期间用户放弃

电话呼入	             105	        noSeatOnline	       无座席在线

电话呼入              106	       notWorkTime	       非工作时间   

电话呼入	            107	       ivrEnd	               IVR 后直接结束

电话呼入	            100	      blackList 呼入黑名单 

电话呼出               2	              unconnected	未接通

电话呼出             108	        restrictedCallee	被叫因高风险受限

电话呼出             109	        tooManyRequest	    超频

电话呼出             110	        restrictedArea	    外呼盲区

电话呼出             111	        restrictedTime	外呼时间限制
                         
电话呼出             201            unknown	未知状态

电话呼出             202            notAnswer	未接听

电话呼出            203	    userReject	拒接挂断

电话呼出	          204	    powerOff	关机

电话呼出           205            numberNotExist	空号

电话呼出	         206	           busy	通话中

电话呼出   	        207	           outOfCredit	欠费

电话呼出	         208	           operatorError	运营商线路异常

电话呼出         	209	           callerCancel	主叫取消

电话呼出	        210	           notInService	不在服务区

电话呼入&呼出	211    clientError    客户端错误
 
     * @return EndStatusString EndStatus与EndStatusString一一对应，具体枚举如下：

**场景	         EndStatus	EndStatusString	状态说明**

电话呼入&呼出	1	        ok	                        正常结束

电话呼入&呼出	0	        error	                系统错误

电话呼入	             102	        ivrGiveUp	        IVR 期间用户放弃

电话呼入	             103	        waitingGiveUp	       会话排队期间用户放弃

电话呼入	             104	        ringingGiveUp	       会话振铃期间用户放弃

电话呼入	             105	        noSeatOnline	       无座席在线

电话呼入              106	       notWorkTime	       非工作时间   

电话呼入	            107	       ivrEnd	               IVR 后直接结束

电话呼入	            100	      blackList 呼入黑名单 

电话呼出               2	              unconnected	未接通

电话呼出             108	        restrictedCallee	被叫因高风险受限

电话呼出             109	        tooManyRequest	    超频

电话呼出             110	        restrictedArea	    外呼盲区

电话呼出             111	        restrictedTime	外呼时间限制
                         
电话呼出             201            unknown	未知状态

电话呼出             202            notAnswer	未接听

电话呼出            203	    userReject	拒接挂断

电话呼出	          204	    powerOff	关机

电话呼出           205            numberNotExist	空号

电话呼出	         206	           busy	通话中

电话呼出   	        207	           outOfCredit	欠费

电话呼出	         208	           operatorError	运营商线路异常

电话呼出         	209	           callerCancel	主叫取消

电话呼出	        210	           notInService	不在服务区

电话呼入&呼出	211    clientError    客户端错误

     */
    public String getEndStatusString() {
        return this.EndStatusString;
    }

    /**
     * Set EndStatus与EndStatusString一一对应，具体枚举如下：

**场景	         EndStatus	EndStatusString	状态说明**

电话呼入&呼出	1	        ok	                        正常结束

电话呼入&呼出	0	        error	                系统错误

电话呼入	             102	        ivrGiveUp	        IVR 期间用户放弃

电话呼入	             103	        waitingGiveUp	       会话排队期间用户放弃

电话呼入	             104	        ringingGiveUp	       会话振铃期间用户放弃

电话呼入	             105	        noSeatOnline	       无座席在线

电话呼入              106	       notWorkTime	       非工作时间   

电话呼入	            107	       ivrEnd	               IVR 后直接结束

电话呼入	            100	      blackList 呼入黑名单 

电话呼出               2	              unconnected	未接通

电话呼出             108	        restrictedCallee	被叫因高风险受限

电话呼出             109	        tooManyRequest	    超频

电话呼出             110	        restrictedArea	    外呼盲区

电话呼出             111	        restrictedTime	外呼时间限制
                         
电话呼出             201            unknown	未知状态

电话呼出             202            notAnswer	未接听

电话呼出            203	    userReject	拒接挂断

电话呼出	          204	    powerOff	关机

电话呼出           205            numberNotExist	空号

电话呼出	         206	           busy	通话中

电话呼出   	        207	           outOfCredit	欠费

电话呼出	         208	           operatorError	运营商线路异常

电话呼出         	209	           callerCancel	主叫取消

电话呼出	        210	           notInService	不在服务区

电话呼入&呼出	211    clientError    客户端错误

     * @param EndStatusString EndStatus与EndStatusString一一对应，具体枚举如下：

**场景	         EndStatus	EndStatusString	状态说明**

电话呼入&呼出	1	        ok	                        正常结束

电话呼入&呼出	0	        error	                系统错误

电话呼入	             102	        ivrGiveUp	        IVR 期间用户放弃

电话呼入	             103	        waitingGiveUp	       会话排队期间用户放弃

电话呼入	             104	        ringingGiveUp	       会话振铃期间用户放弃

电话呼入	             105	        noSeatOnline	       无座席在线

电话呼入              106	       notWorkTime	       非工作时间   

电话呼入	            107	       ivrEnd	               IVR 后直接结束

电话呼入	            100	      blackList 呼入黑名单 

电话呼出               2	              unconnected	未接通

电话呼出             108	        restrictedCallee	被叫因高风险受限

电话呼出             109	        tooManyRequest	    超频

电话呼出             110	        restrictedArea	    外呼盲区

电话呼出             111	        restrictedTime	外呼时间限制
                         
电话呼出             201            unknown	未知状态

电话呼出             202            notAnswer	未接听

电话呼出            203	    userReject	拒接挂断

电话呼出	          204	    powerOff	关机

电话呼出           205            numberNotExist	空号

电话呼出	         206	           busy	通话中

电话呼出   	        207	           outOfCredit	欠费

电话呼出	         208	           operatorError	运营商线路异常

电话呼出         	209	           callerCancel	主叫取消

电话呼出	        210	           notInService	不在服务区

电话呼入&呼出	211    clientError    客户端错误

     */
    public void setEndStatusString(String EndStatusString) {
        this.EndStatusString = EndStatusString;
    }

    /**
     * Get 会话开始时间戳，UNIX 秒级时间戳 
     * @return StartTimestamp 会话开始时间戳，UNIX 秒级时间戳
     */
    public Long getStartTimestamp() {
        return this.StartTimestamp;
    }

    /**
     * Set 会话开始时间戳，UNIX 秒级时间戳
     * @param StartTimestamp 会话开始时间戳，UNIX 秒级时间戳
     */
    public void setStartTimestamp(Long StartTimestamp) {
        this.StartTimestamp = StartTimestamp;
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
     * Get 后置IVR按键信息（e.g. [{"Key":"1","Label":"非常满意"}]） 
     * @return PostIVRKeyPressed 后置IVR按键信息（e.g. [{"Key":"1","Label":"非常满意"}]）
     */
    public IVRKeyPressedElement [] getPostIVRKeyPressed() {
        return this.PostIVRKeyPressed;
    }

    /**
     * Set 后置IVR按键信息（e.g. [{"Key":"1","Label":"非常满意"}]）
     * @param PostIVRKeyPressed 后置IVR按键信息（e.g. [{"Key":"1","Label":"非常满意"}]）
     */
    public void setPostIVRKeyPressed(IVRKeyPressedElement [] PostIVRKeyPressed) {
        this.PostIVRKeyPressed = PostIVRKeyPressed;
    }

    /**
     * Get 排队技能组Id 
     * @return QueuedSkillGroupId 排队技能组Id
     */
    public Long getQueuedSkillGroupId() {
        return this.QueuedSkillGroupId;
    }

    /**
     * Set 排队技能组Id
     * @param QueuedSkillGroupId 排队技能组Id
     */
    public void setQueuedSkillGroupId(Long QueuedSkillGroupId) {
        this.QueuedSkillGroupId = QueuedSkillGroupId;
    }

    /**
     * Get 会话 ID 
     * @return SessionId 会话 ID
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 会话 ID
     * @param SessionId 会话 ID
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 主叫号码保护ID，开启号码保护映射功能时有效，且Caller字段置空 
     * @return ProtectedCaller 主叫号码保护ID，开启号码保护映射功能时有效，且Caller字段置空
     */
    public String getProtectedCaller() {
        return this.ProtectedCaller;
    }

    /**
     * Set 主叫号码保护ID，开启号码保护映射功能时有效，且Caller字段置空
     * @param ProtectedCaller 主叫号码保护ID，开启号码保护映射功能时有效，且Caller字段置空
     */
    public void setProtectedCaller(String ProtectedCaller) {
        this.ProtectedCaller = ProtectedCaller;
    }

    /**
     * Get 被叫号码保护ID，开启号码保护映射功能时有效，且Callee字段置空 
     * @return ProtectedCallee 被叫号码保护ID，开启号码保护映射功能时有效，且Callee字段置空
     */
    public String getProtectedCallee() {
        return this.ProtectedCallee;
    }

    /**
     * Set 被叫号码保护ID，开启号码保护映射功能时有效，且Callee字段置空
     * @param ProtectedCallee 被叫号码保护ID，开启号码保护映射功能时有效，且Callee字段置空
     */
    public void setProtectedCallee(String ProtectedCallee) {
        this.ProtectedCallee = ProtectedCallee;
    }

    /**
     * Get 客户自定义数据（User-to-User Interface）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uui 客户自定义数据（User-to-User Interface）
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getUui() {
        return this.Uui;
    }

    /**
     * Set 客户自定义数据（User-to-User Interface）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uui 客户自定义数据（User-to-User Interface）
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setUui(String Uui) {
        this.Uui = Uui;
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
     * Get IVR按键信息（e.g. [{"Key":"1","Label":"非常满意"}]） 
     * @return IVRKeyPressedEx IVR按键信息（e.g. [{"Key":"1","Label":"非常满意"}]）
     */
    public IVRKeyPressedElement [] getIVRKeyPressedEx() {
        return this.IVRKeyPressedEx;
    }

    /**
     * Set IVR按键信息（e.g. [{"Key":"1","Label":"非常满意"}]）
     * @param IVRKeyPressedEx IVR按键信息（e.g. [{"Key":"1","Label":"非常满意"}]）
     */
    public void setIVRKeyPressedEx(IVRKeyPressedElement [] IVRKeyPressedEx) {
        this.IVRKeyPressedEx = IVRKeyPressedEx;
    }

    /**
     * Get 获取录音ASR文本信息地址 
     * @return AsrUrl 获取录音ASR文本信息地址
     */
    public String getAsrUrl() {
        return this.AsrUrl;
    }

    /**
     * Set 获取录音ASR文本信息地址
     * @param AsrUrl 获取录音ASR文本信息地址
     */
    public void setAsrUrl(String AsrUrl) {
        this.AsrUrl = AsrUrl;
    }

    /**
     * Get AsrUrl的状态：Complete
已完成;
Processing
正在生成中;
NotExists
无记录(未开启生成离线asr或者无套餐包) 
     * @return AsrStatus AsrUrl的状态：Complete
已完成;
Processing
正在生成中;
NotExists
无记录(未开启生成离线asr或者无套餐包)
     */
    public String getAsrStatus() {
        return this.AsrStatus;
    }

    /**
     * Set AsrUrl的状态：Complete
已完成;
Processing
正在生成中;
NotExists
无记录(未开启生成离线asr或者无套餐包)
     * @param AsrStatus AsrUrl的状态：Complete
已完成;
Processing
正在生成中;
NotExists
无记录(未开启生成离线asr或者无套餐包)
     */
    public void setAsrStatus(String AsrStatus) {
        this.AsrStatus = AsrStatus;
    }

    /**
     * Get 录音转存第三方COS地址 
     * @return CustomRecordURL 录音转存第三方COS地址
     */
    public String getCustomRecordURL() {
        return this.CustomRecordURL;
    }

    /**
     * Set 录音转存第三方COS地址
     * @param CustomRecordURL 录音转存第三方COS地址
     */
    public void setCustomRecordURL(String CustomRecordURL) {
        this.CustomRecordURL = CustomRecordURL;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
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
     * Get 通话中语音留言录音URL 
     * @return VoicemailRecordURL 通话中语音留言录音URL
     */
    public String [] getVoicemailRecordURL() {
        return this.VoicemailRecordURL;
    }

    /**
     * Set 通话中语音留言录音URL
     * @param VoicemailRecordURL 通话中语音留言录音URL
     */
    public void setVoicemailRecordURL(String [] VoicemailRecordURL) {
        this.VoicemailRecordURL = VoicemailRecordURL;
    }

    /**
     * Get 通话中语音留言ASR文本信息地址 
     * @return VoicemailAsrURL 通话中语音留言ASR文本信息地址
     */
    public String [] getVoicemailAsrURL() {
        return this.VoicemailAsrURL;
    }

    /**
     * Set 通话中语音留言ASR文本信息地址
     * @param VoicemailAsrURL 通话中语音留言ASR文本信息地址
     */
    public void setVoicemailAsrURL(String [] VoicemailAsrURL) {
        this.VoicemailAsrURL = VoicemailAsrURL;
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
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
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
        if (source.UUI != null) {
            this.UUI = new String(source.UUI);
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
        if (source.AsrStatus != null) {
            this.AsrStatus = new String(source.AsrStatus);
        }
        if (source.CustomRecordURL != null) {
            this.CustomRecordURL = new String(source.CustomRecordURL);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.QueuedSkillGroupName != null) {
            this.QueuedSkillGroupName = new String(source.QueuedSkillGroupName);
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
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
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
        this.setParamSimple(map, prefix + "UUI", this.UUI);
        this.setParamArrayObj(map, prefix + "IVRKeyPressedEx.", this.IVRKeyPressedEx);
        this.setParamSimple(map, prefix + "AsrUrl", this.AsrUrl);
        this.setParamSimple(map, prefix + "AsrStatus", this.AsrStatus);
        this.setParamSimple(map, prefix + "CustomRecordURL", this.CustomRecordURL);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "QueuedSkillGroupName", this.QueuedSkillGroupName);
        this.setParamArraySimple(map, prefix + "VoicemailRecordURL.", this.VoicemailRecordURL);
        this.setParamArraySimple(map, prefix + "VoicemailAsrURL.", this.VoicemailAsrURL);

    }
}

