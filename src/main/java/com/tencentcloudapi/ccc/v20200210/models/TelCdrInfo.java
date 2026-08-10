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

public class TelCdrInfo extends AbstractModel {

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
    * <p>呼叫发起时间戳，Unix 时间戳</p>
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * <p>呼入呼出方向 0 呼入 1 呼出</p>
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * <p>通话类型 1 呼出 2 呼入 3 音频呼入 5 预测式外呼 6 内线呼叫</p>
    */
    @SerializedName("CallType")
    @Expose
    private Long CallType;

    /**
    * <p>通话时长</p>
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * <p>录音信息</p>
    */
    @SerializedName("RecordURL")
    @Expose
    private String RecordURL;

    /**
    * <p>录音 ID</p>
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * <p>座席信息</p>
    */
    @SerializedName("SeatUser")
    @Expose
    private SeatUserInfo SeatUser;

    /**
    * <p>EndStatus与EndStatusString一一对应，具体枚举如下：</p><p><strong>场景             EndStatus    EndStatusString    状态说明</strong></p><p>电话呼入&amp;呼出    1            ok                            <strong>正常通话</strong></p><p>电话呼入                 102            ivrGiveUp            <strong>IVR期间用户放弃</strong></p><p>电话呼入                 103            waitingGiveUp           <strong>排队时用户放弃</strong></p><p>电话呼入                 104            ringingGiveUp           <strong>振铃时用户放弃</strong></p><p>电话呼入                 105            noSeatOnline           <strong>无座席在线</strong></p><p>电话呼入              106           notWorkTime           <strong>非工作时间</strong>   </p><p>电话呼入                107           ivrEnd                   <strong>IVR全自动结束(无人工介入)</strong></p><p>电话呼入                100          blackList <strong>黑名单(系统侧)</strong></p><p>电话呼出             108            restrictedCallee    <strong>全局外呼风险号码拦截(系统侧)</strong></p><p>电话呼出             109            tooManyRequest        <strong>外呼频控拦截(系统侧)</strong></p><p>电话呼出             110            restrictedArea        <strong>外呼地域拦截(系统侧)</strong></p><p>电话呼出             111            restrictedTime    <strong>外呼时段拦截(系统侧)</strong></p><p>电话呼出             202            notAnswer     <strong>被叫未接听</strong></p><p>电话呼出            203        userReject    <strong>被叫拒接挂断</strong></p><p>电话呼出              204        powerOff    <strong>被叫关机</strong></p><p>电话呼出           205            numberNotExist    <strong>被叫空号</strong></p><p>电话呼出             206               busy    <strong>被叫忙</strong></p><p>电话呼出               207               outOfCredit    <strong>被叫欠费</strong></p><p>电话呼出             208               operatorError    <strong>运营商线路异常</strong></p><p>电话呼出             209               callerCancel    <strong>主叫取消</strong></p><p>电话呼出            210               notInService    <strong>被叫不在服务区</strong></p><p>电话呼入&amp;呼出    211    clientError    <strong>座席客户端错误</strong></p><p>电话呼出        212     carrierBlocked      <strong>运营商拦截</strong></p><p>电话呼出        213     callReminder      <strong>提示来电提醒</strong></p><p>电话呼出        215     numberInvalid      <strong>被叫号码无效</strong></p><p>电话呼出        216     callRestricted      <strong>提示呼叫受限</strong></p><p>电话呼出        217     calleeRestricted      <strong>被叫黑名单受限</strong></p><p>电话呼出        218     areaRestricted      <strong>被叫区域受限</strong></p><p>电话呼出        219     promptCallForwarding      <strong>提示呼叫转移</strong></p><p>电话呼出        220     callerCancelWhileRing      <strong>振铃中主叫取消</strong></p><p>电话呼出        221     callerCancelWithoutRing      <strong>未振铃被叫号码异常</strong></p><p>电话呼出        222     voiceMailReached      <strong>语音信箱挂断</strong></p><p>音频呼入        501     callConflict      <strong>VoIP用户呼叫冲突终止</strong></p><p>音频呼入        502     clientTimeout      <strong>VoIP用户客户端超时</strong></p><p>音频呼入        503     voipClientError      <strong>VoIP用户客户端错误</strong></p><p>中文详情<a href="https://www.tencentcloud.com/zh/document/product/1229/71847">参考</a></p><p>英文详情<a href="https://www.tencentcloud.com/document/product/1229/71847?lang=en">参考</a></p>
    */
    @SerializedName("EndStatus")
    @Expose
    private Long EndStatus;

    /**
    * <p>技能组名称</p>
    */
    @SerializedName("SkillGroup")
    @Expose
    private String SkillGroup;

    /**
    * <p>主叫归属地</p>
    */
    @SerializedName("CallerLocation")
    @Expose
    private String CallerLocation;

    /**
    * <p>IVR 阶段耗时</p>
    */
    @SerializedName("IVRDuration")
    @Expose
    private Long IVRDuration;

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
    * <p>IVR 按键信息 ，e.g. [&quot;1&quot;,&quot;2&quot;,&quot;3&quot;]</p>
    */
    @SerializedName("IVRKeyPressed")
    @Expose
    private String [] IVRKeyPressed;

    /**
    * <p>IVR按键信息（e.g.xa0[{&quot;Key&quot;:&quot;1&quot;,&quot;Label&quot;:&quot;非常满意&quot;}]）</p>
    */
    @SerializedName("IVRKeyPressedEx")
    @Expose
    private IVRKeyPressedElement [] IVRKeyPressedEx;

    /**
    * <p>挂机方 seat 座席 user 用户 system 系统</p>
    */
    @SerializedName("HungUpSide")
    @Expose
    private String HungUpSide;

    /**
    * <p>服务参与者列表</p>
    */
    @SerializedName("ServeParticipants")
    @Expose
    private ServeParticipant [] ServeParticipants;

    /**
    * <p>技能组ID</p>
    */
    @SerializedName("SkillGroupId")
    @Expose
    private Long SkillGroupId;

    /**
    * <p>参考 EndStatus 字段</p>
    */
    @SerializedName("EndStatusString")
    @Expose
    private String EndStatusString;

    /**
    * <p>会话开始时间戳，UNIX 秒级时间戳</p>
    */
    @SerializedName("StartTimestamp")
    @Expose
    private Long StartTimestamp;

    /**
    * <p>进入排队时间，Unix 秒级时间戳</p>
    */
    @SerializedName("QueuedTimestamp")
    @Expose
    private Long QueuedTimestamp;

    /**
    * <p>后置IVR按键信息（e.g.xa0[{&quot;Key&quot;:&quot;1&quot;,&quot;Label&quot;:&quot;非常满意&quot;}]）</p>
    */
    @SerializedName("PostIVRKeyPressed")
    @Expose
    private IVRKeyPressedElement [] PostIVRKeyPressed;

    /**
    * <p>满意度按键信息 Key 为 noInput 表示进入满意度但无按键</p>
    */
    @SerializedName("PostIVRKeyPressedEx")
    @Expose
    private IVRKeyPressedElement [] PostIVRKeyPressedEx;

    /**
    * <p>排队技能组Id</p>
    */
    @SerializedName("QueuedSkillGroupId")
    @Expose
    private Long QueuedSkillGroupId;

    /**
    * <p>会话 ID</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>主叫号码保护ID，开启号码保护映射功能时有效，且Caller字段置空</p>
    */
    @SerializedName("ProtectedCaller")
    @Expose
    private String ProtectedCaller;

    /**
    * <p>被叫号码保护ID，开启号码保护映射功能时有效，且Callee字段置空</p>
    */
    @SerializedName("ProtectedCallee")
    @Expose
    private String ProtectedCallee;

    /**
    * <p>客户自定义数据（User-to-User Interface）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uui")
    @Expose
    private String Uui;

    /**
    * <p>客户自定义数据（User-to-User Interface）</p>
    */
    @SerializedName("UUI")
    @Expose
    private String UUI;

    /**
    * <p>获取录音ASR文本信息地址</p>
    */
    @SerializedName("AsrUrl")
    @Expose
    private String AsrUrl;

    /**
    * <p>AsrUrl的状态：Complete<br>已完成;<br>Processing<br>正在生成中;<br>NotExists<br>无记录(未开启生成离线asr或者无套餐包)</p>
    */
    @SerializedName("AsrStatus")
    @Expose
    private String AsrStatus;

    /**
    * <p>录音转存第三方COS地址</p>
    */
    @SerializedName("CustomRecordURL")
    @Expose
    private String CustomRecordURL;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>排队技能组名称</p>
    */
    @SerializedName("QueuedSkillGroupName")
    @Expose
    private String QueuedSkillGroupName;

    /**
    * <p>通话中语音留言录音URL</p>
    */
    @SerializedName("VoicemailRecordURL")
    @Expose
    private String [] VoicemailRecordURL;

    /**
    * <p>通话中语音留言ASR文本信息地址</p>
    */
    @SerializedName("VoicemailAsrURL")
    @Expose
    private String [] VoicemailAsrURL;

    /**
    * <p>如果是智能体相关通话，这里是智能体 ID</p>
    */
    @SerializedName("AIAgentId")
    @Expose
    private Long AIAgentId;

    /**
    * <p>如果是智能体相关通话，这里是智能体名称</p>
    */
    @SerializedName("AIAgentName")
    @Expose
    private String AIAgentName;

    /**
    * <p>接通后系统挂断原因，枚举类似</p>
    */
    @SerializedName("SysHangupReason")
    @Expose
    private Long SysHangupReason;

    /**
    * <p>接通后系统挂断原因，文字描述信息</p>
    */
    @SerializedName("SysHangupReasonString")
    @Expose
    private String SysHangupReasonString;

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
     * Get <p>呼叫发起时间戳，Unix 时间戳</p> 
     * @return Time <p>呼叫发起时间戳，Unix 时间戳</p>
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set <p>呼叫发起时间戳，Unix 时间戳</p>
     * @param Time <p>呼叫发起时间戳，Unix 时间戳</p>
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get <p>呼入呼出方向 0 呼入 1 呼出</p> 
     * @return Direction <p>呼入呼出方向 0 呼入 1 呼出</p>
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set <p>呼入呼出方向 0 呼入 1 呼出</p>
     * @param Direction <p>呼入呼出方向 0 呼入 1 呼出</p>
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
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
     * Get <p>通话时长</p> 
     * @return Duration <p>通话时长</p>
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>通话时长</p>
     * @param Duration <p>通话时长</p>
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>录音信息</p> 
     * @return RecordURL <p>录音信息</p>
     */
    public String getRecordURL() {
        return this.RecordURL;
    }

    /**
     * Set <p>录音信息</p>
     * @param RecordURL <p>录音信息</p>
     */
    public void setRecordURL(String RecordURL) {
        this.RecordURL = RecordURL;
    }

    /**
     * Get <p>录音 ID</p> 
     * @return RecordId <p>录音 ID</p>
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set <p>录音 ID</p>
     * @param RecordId <p>录音 ID</p>
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get <p>座席信息</p> 
     * @return SeatUser <p>座席信息</p>
     */
    public SeatUserInfo getSeatUser() {
        return this.SeatUser;
    }

    /**
     * Set <p>座席信息</p>
     * @param SeatUser <p>座席信息</p>
     */
    public void setSeatUser(SeatUserInfo SeatUser) {
        this.SeatUser = SeatUser;
    }

    /**
     * Get <p>EndStatus与EndStatusString一一对应，具体枚举如下：</p><p><strong>场景             EndStatus    EndStatusString    状态说明</strong></p><p>电话呼入&amp;呼出    1            ok                            <strong>正常通话</strong></p><p>电话呼入                 102            ivrGiveUp            <strong>IVR期间用户放弃</strong></p><p>电话呼入                 103            waitingGiveUp           <strong>排队时用户放弃</strong></p><p>电话呼入                 104            ringingGiveUp           <strong>振铃时用户放弃</strong></p><p>电话呼入                 105            noSeatOnline           <strong>无座席在线</strong></p><p>电话呼入              106           notWorkTime           <strong>非工作时间</strong>   </p><p>电话呼入                107           ivrEnd                   <strong>IVR全自动结束(无人工介入)</strong></p><p>电话呼入                100          blackList <strong>黑名单(系统侧)</strong></p><p>电话呼出             108            restrictedCallee    <strong>全局外呼风险号码拦截(系统侧)</strong></p><p>电话呼出             109            tooManyRequest        <strong>外呼频控拦截(系统侧)</strong></p><p>电话呼出             110            restrictedArea        <strong>外呼地域拦截(系统侧)</strong></p><p>电话呼出             111            restrictedTime    <strong>外呼时段拦截(系统侧)</strong></p><p>电话呼出             202            notAnswer     <strong>被叫未接听</strong></p><p>电话呼出            203        userReject    <strong>被叫拒接挂断</strong></p><p>电话呼出              204        powerOff    <strong>被叫关机</strong></p><p>电话呼出           205            numberNotExist    <strong>被叫空号</strong></p><p>电话呼出             206               busy    <strong>被叫忙</strong></p><p>电话呼出               207               outOfCredit    <strong>被叫欠费</strong></p><p>电话呼出             208               operatorError    <strong>运营商线路异常</strong></p><p>电话呼出             209               callerCancel    <strong>主叫取消</strong></p><p>电话呼出            210               notInService    <strong>被叫不在服务区</strong></p><p>电话呼入&amp;呼出    211    clientError    <strong>座席客户端错误</strong></p><p>电话呼出        212     carrierBlocked      <strong>运营商拦截</strong></p><p>电话呼出        213     callReminder      <strong>提示来电提醒</strong></p><p>电话呼出        215     numberInvalid      <strong>被叫号码无效</strong></p><p>电话呼出        216     callRestricted      <strong>提示呼叫受限</strong></p><p>电话呼出        217     calleeRestricted      <strong>被叫黑名单受限</strong></p><p>电话呼出        218     areaRestricted      <strong>被叫区域受限</strong></p><p>电话呼出        219     promptCallForwarding      <strong>提示呼叫转移</strong></p><p>电话呼出        220     callerCancelWhileRing      <strong>振铃中主叫取消</strong></p><p>电话呼出        221     callerCancelWithoutRing      <strong>未振铃被叫号码异常</strong></p><p>电话呼出        222     voiceMailReached      <strong>语音信箱挂断</strong></p><p>音频呼入        501     callConflict      <strong>VoIP用户呼叫冲突终止</strong></p><p>音频呼入        502     clientTimeout      <strong>VoIP用户客户端超时</strong></p><p>音频呼入        503     voipClientError      <strong>VoIP用户客户端错误</strong></p><p>中文详情<a href="https://www.tencentcloud.com/zh/document/product/1229/71847">参考</a></p><p>英文详情<a href="https://www.tencentcloud.com/document/product/1229/71847?lang=en">参考</a></p> 
     * @return EndStatus <p>EndStatus与EndStatusString一一对应，具体枚举如下：</p><p><strong>场景             EndStatus    EndStatusString    状态说明</strong></p><p>电话呼入&amp;呼出    1            ok                            <strong>正常通话</strong></p><p>电话呼入                 102            ivrGiveUp            <strong>IVR期间用户放弃</strong></p><p>电话呼入                 103            waitingGiveUp           <strong>排队时用户放弃</strong></p><p>电话呼入                 104            ringingGiveUp           <strong>振铃时用户放弃</strong></p><p>电话呼入                 105            noSeatOnline           <strong>无座席在线</strong></p><p>电话呼入              106           notWorkTime           <strong>非工作时间</strong>   </p><p>电话呼入                107           ivrEnd                   <strong>IVR全自动结束(无人工介入)</strong></p><p>电话呼入                100          blackList <strong>黑名单(系统侧)</strong></p><p>电话呼出             108            restrictedCallee    <strong>全局外呼风险号码拦截(系统侧)</strong></p><p>电话呼出             109            tooManyRequest        <strong>外呼频控拦截(系统侧)</strong></p><p>电话呼出             110            restrictedArea        <strong>外呼地域拦截(系统侧)</strong></p><p>电话呼出             111            restrictedTime    <strong>外呼时段拦截(系统侧)</strong></p><p>电话呼出             202            notAnswer     <strong>被叫未接听</strong></p><p>电话呼出            203        userReject    <strong>被叫拒接挂断</strong></p><p>电话呼出              204        powerOff    <strong>被叫关机</strong></p><p>电话呼出           205            numberNotExist    <strong>被叫空号</strong></p><p>电话呼出             206               busy    <strong>被叫忙</strong></p><p>电话呼出               207               outOfCredit    <strong>被叫欠费</strong></p><p>电话呼出             208               operatorError    <strong>运营商线路异常</strong></p><p>电话呼出             209               callerCancel    <strong>主叫取消</strong></p><p>电话呼出            210               notInService    <strong>被叫不在服务区</strong></p><p>电话呼入&amp;呼出    211    clientError    <strong>座席客户端错误</strong></p><p>电话呼出        212     carrierBlocked      <strong>运营商拦截</strong></p><p>电话呼出        213     callReminder      <strong>提示来电提醒</strong></p><p>电话呼出        215     numberInvalid      <strong>被叫号码无效</strong></p><p>电话呼出        216     callRestricted      <strong>提示呼叫受限</strong></p><p>电话呼出        217     calleeRestricted      <strong>被叫黑名单受限</strong></p><p>电话呼出        218     areaRestricted      <strong>被叫区域受限</strong></p><p>电话呼出        219     promptCallForwarding      <strong>提示呼叫转移</strong></p><p>电话呼出        220     callerCancelWhileRing      <strong>振铃中主叫取消</strong></p><p>电话呼出        221     callerCancelWithoutRing      <strong>未振铃被叫号码异常</strong></p><p>电话呼出        222     voiceMailReached      <strong>语音信箱挂断</strong></p><p>音频呼入        501     callConflict      <strong>VoIP用户呼叫冲突终止</strong></p><p>音频呼入        502     clientTimeout      <strong>VoIP用户客户端超时</strong></p><p>音频呼入        503     voipClientError      <strong>VoIP用户客户端错误</strong></p><p>中文详情<a href="https://www.tencentcloud.com/zh/document/product/1229/71847">参考</a></p><p>英文详情<a href="https://www.tencentcloud.com/document/product/1229/71847?lang=en">参考</a></p>
     */
    public Long getEndStatus() {
        return this.EndStatus;
    }

    /**
     * Set <p>EndStatus与EndStatusString一一对应，具体枚举如下：</p><p><strong>场景             EndStatus    EndStatusString    状态说明</strong></p><p>电话呼入&amp;呼出    1            ok                            <strong>正常通话</strong></p><p>电话呼入                 102            ivrGiveUp            <strong>IVR期间用户放弃</strong></p><p>电话呼入                 103            waitingGiveUp           <strong>排队时用户放弃</strong></p><p>电话呼入                 104            ringingGiveUp           <strong>振铃时用户放弃</strong></p><p>电话呼入                 105            noSeatOnline           <strong>无座席在线</strong></p><p>电话呼入              106           notWorkTime           <strong>非工作时间</strong>   </p><p>电话呼入                107           ivrEnd                   <strong>IVR全自动结束(无人工介入)</strong></p><p>电话呼入                100          blackList <strong>黑名单(系统侧)</strong></p><p>电话呼出             108            restrictedCallee    <strong>全局外呼风险号码拦截(系统侧)</strong></p><p>电话呼出             109            tooManyRequest        <strong>外呼频控拦截(系统侧)</strong></p><p>电话呼出             110            restrictedArea        <strong>外呼地域拦截(系统侧)</strong></p><p>电话呼出             111            restrictedTime    <strong>外呼时段拦截(系统侧)</strong></p><p>电话呼出             202            notAnswer     <strong>被叫未接听</strong></p><p>电话呼出            203        userReject    <strong>被叫拒接挂断</strong></p><p>电话呼出              204        powerOff    <strong>被叫关机</strong></p><p>电话呼出           205            numberNotExist    <strong>被叫空号</strong></p><p>电话呼出             206               busy    <strong>被叫忙</strong></p><p>电话呼出               207               outOfCredit    <strong>被叫欠费</strong></p><p>电话呼出             208               operatorError    <strong>运营商线路异常</strong></p><p>电话呼出             209               callerCancel    <strong>主叫取消</strong></p><p>电话呼出            210               notInService    <strong>被叫不在服务区</strong></p><p>电话呼入&amp;呼出    211    clientError    <strong>座席客户端错误</strong></p><p>电话呼出        212     carrierBlocked      <strong>运营商拦截</strong></p><p>电话呼出        213     callReminder      <strong>提示来电提醒</strong></p><p>电话呼出        215     numberInvalid      <strong>被叫号码无效</strong></p><p>电话呼出        216     callRestricted      <strong>提示呼叫受限</strong></p><p>电话呼出        217     calleeRestricted      <strong>被叫黑名单受限</strong></p><p>电话呼出        218     areaRestricted      <strong>被叫区域受限</strong></p><p>电话呼出        219     promptCallForwarding      <strong>提示呼叫转移</strong></p><p>电话呼出        220     callerCancelWhileRing      <strong>振铃中主叫取消</strong></p><p>电话呼出        221     callerCancelWithoutRing      <strong>未振铃被叫号码异常</strong></p><p>电话呼出        222     voiceMailReached      <strong>语音信箱挂断</strong></p><p>音频呼入        501     callConflict      <strong>VoIP用户呼叫冲突终止</strong></p><p>音频呼入        502     clientTimeout      <strong>VoIP用户客户端超时</strong></p><p>音频呼入        503     voipClientError      <strong>VoIP用户客户端错误</strong></p><p>中文详情<a href="https://www.tencentcloud.com/zh/document/product/1229/71847">参考</a></p><p>英文详情<a href="https://www.tencentcloud.com/document/product/1229/71847?lang=en">参考</a></p>
     * @param EndStatus <p>EndStatus与EndStatusString一一对应，具体枚举如下：</p><p><strong>场景             EndStatus    EndStatusString    状态说明</strong></p><p>电话呼入&amp;呼出    1            ok                            <strong>正常通话</strong></p><p>电话呼入                 102            ivrGiveUp            <strong>IVR期间用户放弃</strong></p><p>电话呼入                 103            waitingGiveUp           <strong>排队时用户放弃</strong></p><p>电话呼入                 104            ringingGiveUp           <strong>振铃时用户放弃</strong></p><p>电话呼入                 105            noSeatOnline           <strong>无座席在线</strong></p><p>电话呼入              106           notWorkTime           <strong>非工作时间</strong>   </p><p>电话呼入                107           ivrEnd                   <strong>IVR全自动结束(无人工介入)</strong></p><p>电话呼入                100          blackList <strong>黑名单(系统侧)</strong></p><p>电话呼出             108            restrictedCallee    <strong>全局外呼风险号码拦截(系统侧)</strong></p><p>电话呼出             109            tooManyRequest        <strong>外呼频控拦截(系统侧)</strong></p><p>电话呼出             110            restrictedArea        <strong>外呼地域拦截(系统侧)</strong></p><p>电话呼出             111            restrictedTime    <strong>外呼时段拦截(系统侧)</strong></p><p>电话呼出             202            notAnswer     <strong>被叫未接听</strong></p><p>电话呼出            203        userReject    <strong>被叫拒接挂断</strong></p><p>电话呼出              204        powerOff    <strong>被叫关机</strong></p><p>电话呼出           205            numberNotExist    <strong>被叫空号</strong></p><p>电话呼出             206               busy    <strong>被叫忙</strong></p><p>电话呼出               207               outOfCredit    <strong>被叫欠费</strong></p><p>电话呼出             208               operatorError    <strong>运营商线路异常</strong></p><p>电话呼出             209               callerCancel    <strong>主叫取消</strong></p><p>电话呼出            210               notInService    <strong>被叫不在服务区</strong></p><p>电话呼入&amp;呼出    211    clientError    <strong>座席客户端错误</strong></p><p>电话呼出        212     carrierBlocked      <strong>运营商拦截</strong></p><p>电话呼出        213     callReminder      <strong>提示来电提醒</strong></p><p>电话呼出        215     numberInvalid      <strong>被叫号码无效</strong></p><p>电话呼出        216     callRestricted      <strong>提示呼叫受限</strong></p><p>电话呼出        217     calleeRestricted      <strong>被叫黑名单受限</strong></p><p>电话呼出        218     areaRestricted      <strong>被叫区域受限</strong></p><p>电话呼出        219     promptCallForwarding      <strong>提示呼叫转移</strong></p><p>电话呼出        220     callerCancelWhileRing      <strong>振铃中主叫取消</strong></p><p>电话呼出        221     callerCancelWithoutRing      <strong>未振铃被叫号码异常</strong></p><p>电话呼出        222     voiceMailReached      <strong>语音信箱挂断</strong></p><p>音频呼入        501     callConflict      <strong>VoIP用户呼叫冲突终止</strong></p><p>音频呼入        502     clientTimeout      <strong>VoIP用户客户端超时</strong></p><p>音频呼入        503     voipClientError      <strong>VoIP用户客户端错误</strong></p><p>中文详情<a href="https://www.tencentcloud.com/zh/document/product/1229/71847">参考</a></p><p>英文详情<a href="https://www.tencentcloud.com/document/product/1229/71847?lang=en">参考</a></p>
     */
    public void setEndStatus(Long EndStatus) {
        this.EndStatus = EndStatus;
    }

    /**
     * Get <p>技能组名称</p> 
     * @return SkillGroup <p>技能组名称</p>
     */
    public String getSkillGroup() {
        return this.SkillGroup;
    }

    /**
     * Set <p>技能组名称</p>
     * @param SkillGroup <p>技能组名称</p>
     */
    public void setSkillGroup(String SkillGroup) {
        this.SkillGroup = SkillGroup;
    }

    /**
     * Get <p>主叫归属地</p> 
     * @return CallerLocation <p>主叫归属地</p>
     */
    public String getCallerLocation() {
        return this.CallerLocation;
    }

    /**
     * Set <p>主叫归属地</p>
     * @param CallerLocation <p>主叫归属地</p>
     */
    public void setCallerLocation(String CallerLocation) {
        this.CallerLocation = CallerLocation;
    }

    /**
     * Get <p>IVR 阶段耗时</p> 
     * @return IVRDuration <p>IVR 阶段耗时</p>
     */
    public Long getIVRDuration() {
        return this.IVRDuration;
    }

    /**
     * Set <p>IVR 阶段耗时</p>
     * @param IVRDuration <p>IVR 阶段耗时</p>
     */
    public void setIVRDuration(Long IVRDuration) {
        this.IVRDuration = IVRDuration;
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
     * Get <p>IVR 按键信息 ，e.g. [&quot;1&quot;,&quot;2&quot;,&quot;3&quot;]</p> 
     * @return IVRKeyPressed <p>IVR 按键信息 ，e.g. [&quot;1&quot;,&quot;2&quot;,&quot;3&quot;]</p>
     * @deprecated
     */
    @Deprecated
    public String [] getIVRKeyPressed() {
        return this.IVRKeyPressed;
    }

    /**
     * Set <p>IVR 按键信息 ，e.g. [&quot;1&quot;,&quot;2&quot;,&quot;3&quot;]</p>
     * @param IVRKeyPressed <p>IVR 按键信息 ，e.g. [&quot;1&quot;,&quot;2&quot;,&quot;3&quot;]</p>
     * @deprecated
     */
    @Deprecated
    public void setIVRKeyPressed(String [] IVRKeyPressed) {
        this.IVRKeyPressed = IVRKeyPressed;
    }

    /**
     * Get <p>IVR按键信息（e.g.xa0[{&quot;Key&quot;:&quot;1&quot;,&quot;Label&quot;:&quot;非常满意&quot;}]）</p> 
     * @return IVRKeyPressedEx <p>IVR按键信息（e.g.xa0[{&quot;Key&quot;:&quot;1&quot;,&quot;Label&quot;:&quot;非常满意&quot;}]）</p>
     */
    public IVRKeyPressedElement [] getIVRKeyPressedEx() {
        return this.IVRKeyPressedEx;
    }

    /**
     * Set <p>IVR按键信息（e.g.xa0[{&quot;Key&quot;:&quot;1&quot;,&quot;Label&quot;:&quot;非常满意&quot;}]）</p>
     * @param IVRKeyPressedEx <p>IVR按键信息（e.g.xa0[{&quot;Key&quot;:&quot;1&quot;,&quot;Label&quot;:&quot;非常满意&quot;}]）</p>
     */
    public void setIVRKeyPressedEx(IVRKeyPressedElement [] IVRKeyPressedEx) {
        this.IVRKeyPressedEx = IVRKeyPressedEx;
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
     * Get <p>技能组ID</p> 
     * @return SkillGroupId <p>技能组ID</p>
     */
    public Long getSkillGroupId() {
        return this.SkillGroupId;
    }

    /**
     * Set <p>技能组ID</p>
     * @param SkillGroupId <p>技能组ID</p>
     */
    public void setSkillGroupId(Long SkillGroupId) {
        this.SkillGroupId = SkillGroupId;
    }

    /**
     * Get <p>参考 EndStatus 字段</p> 
     * @return EndStatusString <p>参考 EndStatus 字段</p>
     */
    public String getEndStatusString() {
        return this.EndStatusString;
    }

    /**
     * Set <p>参考 EndStatus 字段</p>
     * @param EndStatusString <p>参考 EndStatus 字段</p>
     */
    public void setEndStatusString(String EndStatusString) {
        this.EndStatusString = EndStatusString;
    }

    /**
     * Get <p>会话开始时间戳，UNIX 秒级时间戳</p> 
     * @return StartTimestamp <p>会话开始时间戳，UNIX 秒级时间戳</p>
     */
    public Long getStartTimestamp() {
        return this.StartTimestamp;
    }

    /**
     * Set <p>会话开始时间戳，UNIX 秒级时间戳</p>
     * @param StartTimestamp <p>会话开始时间戳，UNIX 秒级时间戳</p>
     */
    public void setStartTimestamp(Long StartTimestamp) {
        this.StartTimestamp = StartTimestamp;
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
     * Get <p>后置IVR按键信息（e.g.xa0[{&quot;Key&quot;:&quot;1&quot;,&quot;Label&quot;:&quot;非常满意&quot;}]）</p> 
     * @return PostIVRKeyPressed <p>后置IVR按键信息（e.g.xa0[{&quot;Key&quot;:&quot;1&quot;,&quot;Label&quot;:&quot;非常满意&quot;}]）</p>
     * @deprecated
     */
    @Deprecated
    public IVRKeyPressedElement [] getPostIVRKeyPressed() {
        return this.PostIVRKeyPressed;
    }

    /**
     * Set <p>后置IVR按键信息（e.g.xa0[{&quot;Key&quot;:&quot;1&quot;,&quot;Label&quot;:&quot;非常满意&quot;}]）</p>
     * @param PostIVRKeyPressed <p>后置IVR按键信息（e.g.xa0[{&quot;Key&quot;:&quot;1&quot;,&quot;Label&quot;:&quot;非常满意&quot;}]）</p>
     * @deprecated
     */
    @Deprecated
    public void setPostIVRKeyPressed(IVRKeyPressedElement [] PostIVRKeyPressed) {
        this.PostIVRKeyPressed = PostIVRKeyPressed;
    }

    /**
     * Get <p>满意度按键信息 Key 为 noInput 表示进入满意度但无按键</p> 
     * @return PostIVRKeyPressedEx <p>满意度按键信息 Key 为 noInput 表示进入满意度但无按键</p>
     */
    public IVRKeyPressedElement [] getPostIVRKeyPressedEx() {
        return this.PostIVRKeyPressedEx;
    }

    /**
     * Set <p>满意度按键信息 Key 为 noInput 表示进入满意度但无按键</p>
     * @param PostIVRKeyPressedEx <p>满意度按键信息 Key 为 noInput 表示进入满意度但无按键</p>
     */
    public void setPostIVRKeyPressedEx(IVRKeyPressedElement [] PostIVRKeyPressedEx) {
        this.PostIVRKeyPressedEx = PostIVRKeyPressedEx;
    }

    /**
     * Get <p>排队技能组Id</p> 
     * @return QueuedSkillGroupId <p>排队技能组Id</p>
     */
    public Long getQueuedSkillGroupId() {
        return this.QueuedSkillGroupId;
    }

    /**
     * Set <p>排队技能组Id</p>
     * @param QueuedSkillGroupId <p>排队技能组Id</p>
     */
    public void setQueuedSkillGroupId(Long QueuedSkillGroupId) {
        this.QueuedSkillGroupId = QueuedSkillGroupId;
    }

    /**
     * Get <p>会话 ID</p> 
     * @return SessionId <p>会话 ID</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>会话 ID</p>
     * @param SessionId <p>会话 ID</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>主叫号码保护ID，开启号码保护映射功能时有效，且Caller字段置空</p> 
     * @return ProtectedCaller <p>主叫号码保护ID，开启号码保护映射功能时有效，且Caller字段置空</p>
     */
    public String getProtectedCaller() {
        return this.ProtectedCaller;
    }

    /**
     * Set <p>主叫号码保护ID，开启号码保护映射功能时有效，且Caller字段置空</p>
     * @param ProtectedCaller <p>主叫号码保护ID，开启号码保护映射功能时有效，且Caller字段置空</p>
     */
    public void setProtectedCaller(String ProtectedCaller) {
        this.ProtectedCaller = ProtectedCaller;
    }

    /**
     * Get <p>被叫号码保护ID，开启号码保护映射功能时有效，且Callee字段置空</p> 
     * @return ProtectedCallee <p>被叫号码保护ID，开启号码保护映射功能时有效，且Callee字段置空</p>
     */
    public String getProtectedCallee() {
        return this.ProtectedCallee;
    }

    /**
     * Set <p>被叫号码保护ID，开启号码保护映射功能时有效，且Callee字段置空</p>
     * @param ProtectedCallee <p>被叫号码保护ID，开启号码保护映射功能时有效，且Callee字段置空</p>
     */
    public void setProtectedCallee(String ProtectedCallee) {
        this.ProtectedCallee = ProtectedCallee;
    }

    /**
     * Get <p>客户自定义数据（User-to-User Interface）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uui <p>客户自定义数据（User-to-User Interface）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getUui() {
        return this.Uui;
    }

    /**
     * Set <p>客户自定义数据（User-to-User Interface）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uui <p>客户自定义数据（User-to-User Interface）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setUui(String Uui) {
        this.Uui = Uui;
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
     * Get <p>获取录音ASR文本信息地址</p> 
     * @return AsrUrl <p>获取录音ASR文本信息地址</p>
     */
    public String getAsrUrl() {
        return this.AsrUrl;
    }

    /**
     * Set <p>获取录音ASR文本信息地址</p>
     * @param AsrUrl <p>获取录音ASR文本信息地址</p>
     */
    public void setAsrUrl(String AsrUrl) {
        this.AsrUrl = AsrUrl;
    }

    /**
     * Get <p>AsrUrl的状态：Complete<br>已完成;<br>Processing<br>正在生成中;<br>NotExists<br>无记录(未开启生成离线asr或者无套餐包)</p> 
     * @return AsrStatus <p>AsrUrl的状态：Complete<br>已完成;<br>Processing<br>正在生成中;<br>NotExists<br>无记录(未开启生成离线asr或者无套餐包)</p>
     */
    public String getAsrStatus() {
        return this.AsrStatus;
    }

    /**
     * Set <p>AsrUrl的状态：Complete<br>已完成;<br>Processing<br>正在生成中;<br>NotExists<br>无记录(未开启生成离线asr或者无套餐包)</p>
     * @param AsrStatus <p>AsrUrl的状态：Complete<br>已完成;<br>Processing<br>正在生成中;<br>NotExists<br>无记录(未开启生成离线asr或者无套餐包)</p>
     */
    public void setAsrStatus(String AsrStatus) {
        this.AsrStatus = AsrStatus;
    }

    /**
     * Get <p>录音转存第三方COS地址</p> 
     * @return CustomRecordURL <p>录音转存第三方COS地址</p>
     */
    public String getCustomRecordURL() {
        return this.CustomRecordURL;
    }

    /**
     * Set <p>录音转存第三方COS地址</p>
     * @param CustomRecordURL <p>录音转存第三方COS地址</p>
     */
    public void setCustomRecordURL(String CustomRecordURL) {
        this.CustomRecordURL = CustomRecordURL;
    }

    /**
     * Get <p>备注</p> 
     * @return Remark <p>备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
     * @param Remark <p>备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
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
     * Get <p>通话中语音留言录音URL</p> 
     * @return VoicemailRecordURL <p>通话中语音留言录音URL</p>
     */
    public String [] getVoicemailRecordURL() {
        return this.VoicemailRecordURL;
    }

    /**
     * Set <p>通话中语音留言录音URL</p>
     * @param VoicemailRecordURL <p>通话中语音留言录音URL</p>
     */
    public void setVoicemailRecordURL(String [] VoicemailRecordURL) {
        this.VoicemailRecordURL = VoicemailRecordURL;
    }

    /**
     * Get <p>通话中语音留言ASR文本信息地址</p> 
     * @return VoicemailAsrURL <p>通话中语音留言ASR文本信息地址</p>
     */
    public String [] getVoicemailAsrURL() {
        return this.VoicemailAsrURL;
    }

    /**
     * Set <p>通话中语音留言ASR文本信息地址</p>
     * @param VoicemailAsrURL <p>通话中语音留言ASR文本信息地址</p>
     */
    public void setVoicemailAsrURL(String [] VoicemailAsrURL) {
        this.VoicemailAsrURL = VoicemailAsrURL;
    }

    /**
     * Get <p>如果是智能体相关通话，这里是智能体 ID</p> 
     * @return AIAgentId <p>如果是智能体相关通话，这里是智能体 ID</p>
     */
    public Long getAIAgentId() {
        return this.AIAgentId;
    }

    /**
     * Set <p>如果是智能体相关通话，这里是智能体 ID</p>
     * @param AIAgentId <p>如果是智能体相关通话，这里是智能体 ID</p>
     */
    public void setAIAgentId(Long AIAgentId) {
        this.AIAgentId = AIAgentId;
    }

    /**
     * Get <p>如果是智能体相关通话，这里是智能体名称</p> 
     * @return AIAgentName <p>如果是智能体相关通话，这里是智能体名称</p>
     */
    public String getAIAgentName() {
        return this.AIAgentName;
    }

    /**
     * Set <p>如果是智能体相关通话，这里是智能体名称</p>
     * @param AIAgentName <p>如果是智能体相关通话，这里是智能体名称</p>
     */
    public void setAIAgentName(String AIAgentName) {
        this.AIAgentName = AIAgentName;
    }

    /**
     * Get <p>接通后系统挂断原因，枚举类似</p> 
     * @return SysHangupReason <p>接通后系统挂断原因，枚举类似</p>
     */
    public Long getSysHangupReason() {
        return this.SysHangupReason;
    }

    /**
     * Set <p>接通后系统挂断原因，枚举类似</p>
     * @param SysHangupReason <p>接通后系统挂断原因，枚举类似</p>
     */
    public void setSysHangupReason(Long SysHangupReason) {
        this.SysHangupReason = SysHangupReason;
    }

    /**
     * Get <p>接通后系统挂断原因，文字描述信息</p> 
     * @return SysHangupReasonString <p>接通后系统挂断原因，文字描述信息</p>
     */
    public String getSysHangupReasonString() {
        return this.SysHangupReasonString;
    }

    /**
     * Set <p>接通后系统挂断原因，文字描述信息</p>
     * @param SysHangupReasonString <p>接通后系统挂断原因，文字描述信息</p>
     */
    public void setSysHangupReasonString(String SysHangupReasonString) {
        this.SysHangupReasonString = SysHangupReasonString;
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
        if (source.CallType != null) {
            this.CallType = new Long(source.CallType);
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
        if (source.IVRKeyPressedEx != null) {
            this.IVRKeyPressedEx = new IVRKeyPressedElement[source.IVRKeyPressedEx.length];
            for (int i = 0; i < source.IVRKeyPressedEx.length; i++) {
                this.IVRKeyPressedEx[i] = new IVRKeyPressedElement(source.IVRKeyPressedEx[i]);
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
        if (source.PostIVRKeyPressedEx != null) {
            this.PostIVRKeyPressedEx = new IVRKeyPressedElement[source.PostIVRKeyPressedEx.length];
            for (int i = 0; i < source.PostIVRKeyPressedEx.length; i++) {
                this.PostIVRKeyPressedEx[i] = new IVRKeyPressedElement(source.PostIVRKeyPressedEx[i]);
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
        if (source.AIAgentId != null) {
            this.AIAgentId = new Long(source.AIAgentId);
        }
        if (source.AIAgentName != null) {
            this.AIAgentName = new String(source.AIAgentName);
        }
        if (source.SysHangupReason != null) {
            this.SysHangupReason = new Long(source.SysHangupReason);
        }
        if (source.SysHangupReasonString != null) {
            this.SysHangupReasonString = new String(source.SysHangupReasonString);
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
        this.setParamSimple(map, prefix + "CallType", this.CallType);
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
        this.setParamArrayObj(map, prefix + "IVRKeyPressedEx.", this.IVRKeyPressedEx);
        this.setParamSimple(map, prefix + "HungUpSide", this.HungUpSide);
        this.setParamArrayObj(map, prefix + "ServeParticipants.", this.ServeParticipants);
        this.setParamSimple(map, prefix + "SkillGroupId", this.SkillGroupId);
        this.setParamSimple(map, prefix + "EndStatusString", this.EndStatusString);
        this.setParamSimple(map, prefix + "StartTimestamp", this.StartTimestamp);
        this.setParamSimple(map, prefix + "QueuedTimestamp", this.QueuedTimestamp);
        this.setParamArrayObj(map, prefix + "PostIVRKeyPressed.", this.PostIVRKeyPressed);
        this.setParamArrayObj(map, prefix + "PostIVRKeyPressedEx.", this.PostIVRKeyPressedEx);
        this.setParamSimple(map, prefix + "QueuedSkillGroupId", this.QueuedSkillGroupId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "ProtectedCaller", this.ProtectedCaller);
        this.setParamSimple(map, prefix + "ProtectedCallee", this.ProtectedCallee);
        this.setParamSimple(map, prefix + "Uui", this.Uui);
        this.setParamSimple(map, prefix + "UUI", this.UUI);
        this.setParamSimple(map, prefix + "AsrUrl", this.AsrUrl);
        this.setParamSimple(map, prefix + "AsrStatus", this.AsrStatus);
        this.setParamSimple(map, prefix + "CustomRecordURL", this.CustomRecordURL);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "QueuedSkillGroupName", this.QueuedSkillGroupName);
        this.setParamArraySimple(map, prefix + "VoicemailRecordURL.", this.VoicemailRecordURL);
        this.setParamArraySimple(map, prefix + "VoicemailAsrURL.", this.VoicemailAsrURL);
        this.setParamSimple(map, prefix + "AIAgentId", this.AIAgentId);
        this.setParamSimple(map, prefix + "AIAgentName", this.AIAgentName);
        this.setParamSimple(map, prefix + "SysHangupReason", this.SysHangupReason);
        this.setParamSimple(map, prefix + "SysHangupReasonString", this.SysHangupReasonString);

    }
}

