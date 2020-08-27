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
    * 结束状态 0 未知 1 正常通话 2 未接通
    */
    @SerializedName("EndStatus")
    @Expose
    private Long EndStatus;

    /**
    * 技能组
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
     * Get 结束状态 0 未知 1 正常通话 2 未接通 
     * @return EndStatus 结束状态 0 未知 1 正常通话 2 未接通
     */
    public Long getEndStatus() {
        return this.EndStatus;
    }

    /**
     * Set 结束状态 0 未知 1 正常通话 2 未接通
     * @param EndStatus 结束状态 0 未知 1 正常通话 2 未接通
     */
    public void setEndStatus(Long EndStatus) {
        this.EndStatus = EndStatus;
    }

    /**
     * Get 技能组 
     * @return SkillGroup 技能组
     */
    public String getSkillGroup() {
        return this.SkillGroup;
    }

    /**
     * Set 技能组
     * @param SkillGroup 技能组
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

    }
}

