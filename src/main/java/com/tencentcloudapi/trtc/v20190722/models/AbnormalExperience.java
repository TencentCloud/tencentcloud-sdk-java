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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AbnormalExperience extends AbstractModel{

    /**
    * 用户ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 异常体验ID
    */
    @SerializedName("ExperienceId")
    @Expose
    private Long ExperienceId;

    /**
    * 字符串房间号
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 异常事件数组
    */
    @SerializedName("AbnormalEventList")
    @Expose
    private AbnormalEvent [] AbnormalEventList;

    /**
    * 异常事件的上报时间
    */
    @SerializedName("EventTime")
    @Expose
    private Long EventTime;

    /**
     * Get 用户ID 
     * @return UserId 用户ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID
     * @param UserId 用户ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 异常体验ID 
     * @return ExperienceId 异常体验ID
     */
    public Long getExperienceId() {
        return this.ExperienceId;
    }

    /**
     * Set 异常体验ID
     * @param ExperienceId 异常体验ID
     */
    public void setExperienceId(Long ExperienceId) {
        this.ExperienceId = ExperienceId;
    }

    /**
     * Get 字符串房间号 
     * @return RoomId 字符串房间号
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 字符串房间号
     * @param RoomId 字符串房间号
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 异常事件数组 
     * @return AbnormalEventList 异常事件数组
     */
    public AbnormalEvent [] getAbnormalEventList() {
        return this.AbnormalEventList;
    }

    /**
     * Set 异常事件数组
     * @param AbnormalEventList 异常事件数组
     */
    public void setAbnormalEventList(AbnormalEvent [] AbnormalEventList) {
        this.AbnormalEventList = AbnormalEventList;
    }

    /**
     * Get 异常事件的上报时间 
     * @return EventTime 异常事件的上报时间
     */
    public Long getEventTime() {
        return this.EventTime;
    }

    /**
     * Set 异常事件的上报时间
     * @param EventTime 异常事件的上报时间
     */
    public void setEventTime(Long EventTime) {
        this.EventTime = EventTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "ExperienceId", this.ExperienceId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamArrayObj(map, prefix + "AbnormalEventList.", this.AbnormalEventList);
        this.setParamSimple(map, prefix + "EventTime", this.EventTime);

    }
}

