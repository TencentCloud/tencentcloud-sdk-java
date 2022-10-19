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

    }
}

