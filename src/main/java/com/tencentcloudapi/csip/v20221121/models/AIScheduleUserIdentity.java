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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIScheduleUserIdentity extends AbstractModel {

    /**
    * <p>appid</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>账号Uin</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>子账号uin</p>
    */
    @SerializedName("SubUin")
    @Expose
    private String SubUin;

    /**
    * <p>用户ID</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>机器人ID</p>
    */
    @SerializedName("BotId")
    @Expose
    private String BotId;

    /**
    * <p>聊天ID</p>
    */
    @SerializedName("ChatId")
    @Expose
    private String ChatId;

    /**
    * <p>渠道标识，如 wecom / qq / wx / feishu / dingtalk / cloud</p>
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
     * Get <p>appid</p> 
     * @return AppId <p>appid</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>appid</p>
     * @param AppId <p>appid</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>账号Uin</p> 
     * @return Uin <p>账号Uin</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>账号Uin</p>
     * @param Uin <p>账号Uin</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>子账号uin</p> 
     * @return SubUin <p>子账号uin</p>
     */
    public String getSubUin() {
        return this.SubUin;
    }

    /**
     * Set <p>子账号uin</p>
     * @param SubUin <p>子账号uin</p>
     */
    public void setSubUin(String SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get <p>用户ID</p> 
     * @return UserId <p>用户ID</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>用户ID</p>
     * @param UserId <p>用户ID</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>机器人ID</p> 
     * @return BotId <p>机器人ID</p>
     */
    public String getBotId() {
        return this.BotId;
    }

    /**
     * Set <p>机器人ID</p>
     * @param BotId <p>机器人ID</p>
     */
    public void setBotId(String BotId) {
        this.BotId = BotId;
    }

    /**
     * Get <p>聊天ID</p> 
     * @return ChatId <p>聊天ID</p>
     */
    public String getChatId() {
        return this.ChatId;
    }

    /**
     * Set <p>聊天ID</p>
     * @param ChatId <p>聊天ID</p>
     */
    public void setChatId(String ChatId) {
        this.ChatId = ChatId;
    }

    /**
     * Get <p>渠道标识，如 wecom / qq / wx / feishu / dingtalk / cloud</p> 
     * @return Channel <p>渠道标识，如 wecom / qq / wx / feishu / dingtalk / cloud</p>
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set <p>渠道标识，如 wecom / qq / wx / feishu / dingtalk / cloud</p>
     * @param Channel <p>渠道标识，如 wecom / qq / wx / feishu / dingtalk / cloud</p>
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    public AIScheduleUserIdentity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIScheduleUserIdentity(AIScheduleUserIdentity source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SubUin != null) {
            this.SubUin = new String(source.SubUin);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.BotId != null) {
            this.BotId = new String(source.BotId);
        }
        if (source.ChatId != null) {
            this.ChatId = new String(source.ChatId);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "BotId", this.BotId);
        this.setParamSimple(map, prefix + "ChatId", this.ChatId);
        this.setParamSimple(map, prefix + "Channel", this.Channel);

    }
}

