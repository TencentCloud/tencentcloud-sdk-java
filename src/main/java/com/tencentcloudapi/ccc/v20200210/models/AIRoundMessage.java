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

public class AIRoundMessage extends AbstractModel {

    /**
    * <p>消息的毫秒级时间戳</p><p>单位：ms</p>
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * <p>用户消息</p>
    */
    @SerializedName("UserReply")
    @Expose
    private UserReplyEvent UserReply;

    /**
    * <p>智能体响应消息</p>
    */
    @SerializedName("AISpeak")
    @Expose
    private AISpeakEvent AISpeak;

    /**
     * Get <p>消息的毫秒级时间戳</p><p>单位：ms</p> 
     * @return Timestamp <p>消息的毫秒级时间戳</p><p>单位：ms</p>
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set <p>消息的毫秒级时间戳</p><p>单位：ms</p>
     * @param Timestamp <p>消息的毫秒级时间戳</p><p>单位：ms</p>
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get <p>用户消息</p> 
     * @return UserReply <p>用户消息</p>
     */
    public UserReplyEvent getUserReply() {
        return this.UserReply;
    }

    /**
     * Set <p>用户消息</p>
     * @param UserReply <p>用户消息</p>
     */
    public void setUserReply(UserReplyEvent UserReply) {
        this.UserReply = UserReply;
    }

    /**
     * Get <p>智能体响应消息</p> 
     * @return AISpeak <p>智能体响应消息</p>
     */
    public AISpeakEvent getAISpeak() {
        return this.AISpeak;
    }

    /**
     * Set <p>智能体响应消息</p>
     * @param AISpeak <p>智能体响应消息</p>
     */
    public void setAISpeak(AISpeakEvent AISpeak) {
        this.AISpeak = AISpeak;
    }

    public AIRoundMessage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIRoundMessage(AIRoundMessage source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.UserReply != null) {
            this.UserReply = new UserReplyEvent(source.UserReply);
        }
        if (source.AISpeak != null) {
            this.AISpeak = new AISpeakEvent(source.AISpeak);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamObj(map, prefix + "UserReply.", this.UserReply);
        this.setParamObj(map, prefix + "AISpeak.", this.AISpeak);

    }
}

