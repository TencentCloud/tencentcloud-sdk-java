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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MsgRecordSource extends AbstractModel {

    /**
    * 对话消息的接入渠道类型：0=未指定, 1=坐席, 2=体验页面(腾讯云), 3=评测端对话, 4=体验页面(手机号), 5=对话端API接入, 6=评测任务对话, 10=工作流调试, 10000=微信公众号, 10001=微信服务号, 10002=企微应用, 10003=网页组件, 10004=微信客服, 10005=微信小程序, 10006=元器, 10007=应用宝, 10008=元宝, 10009=企微智能机器人, 10010=元器API, 10011=LINE, 10012=Telegram, 10100=电脑管家, 20001=荣耀智能体平台, 20002=小米应用商店；user_id（string）为该渠道下的访客唯一标识。
    */
    @SerializedName("ChannelType")
    @Expose
    private Long ChannelType;

    /**
    * 用户ID
    */
    @SerializedName("FromId")
    @Expose
    private String FromId;

    /**
    * 消息发送者的用户来源类型：1=用户（访客/C端用户）, 2=机器人（AI回复）, 3=坐席（人工客服）；from_id（string）为该来源类型下的用户唯一标识 ID。
    */
    @SerializedName("FromType")
    @Expose
    private Long FromType;

    /**
    * 用户头像
    */
    @SerializedName("UserAvatar")
    @Expose
    private String UserAvatar;

    /**
    * 访客ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 访客名称
    */
    @SerializedName("UserNickname")
    @Expose
    private String UserNickname;

    /**
     * Get 对话消息的接入渠道类型：0=未指定, 1=坐席, 2=体验页面(腾讯云), 3=评测端对话, 4=体验页面(手机号), 5=对话端API接入, 6=评测任务对话, 10=工作流调试, 10000=微信公众号, 10001=微信服务号, 10002=企微应用, 10003=网页组件, 10004=微信客服, 10005=微信小程序, 10006=元器, 10007=应用宝, 10008=元宝, 10009=企微智能机器人, 10010=元器API, 10011=LINE, 10012=Telegram, 10100=电脑管家, 20001=荣耀智能体平台, 20002=小米应用商店；user_id（string）为该渠道下的访客唯一标识。 
     * @return ChannelType 对话消息的接入渠道类型：0=未指定, 1=坐席, 2=体验页面(腾讯云), 3=评测端对话, 4=体验页面(手机号), 5=对话端API接入, 6=评测任务对话, 10=工作流调试, 10000=微信公众号, 10001=微信服务号, 10002=企微应用, 10003=网页组件, 10004=微信客服, 10005=微信小程序, 10006=元器, 10007=应用宝, 10008=元宝, 10009=企微智能机器人, 10010=元器API, 10011=LINE, 10012=Telegram, 10100=电脑管家, 20001=荣耀智能体平台, 20002=小米应用商店；user_id（string）为该渠道下的访客唯一标识。
     */
    public Long getChannelType() {
        return this.ChannelType;
    }

    /**
     * Set 对话消息的接入渠道类型：0=未指定, 1=坐席, 2=体验页面(腾讯云), 3=评测端对话, 4=体验页面(手机号), 5=对话端API接入, 6=评测任务对话, 10=工作流调试, 10000=微信公众号, 10001=微信服务号, 10002=企微应用, 10003=网页组件, 10004=微信客服, 10005=微信小程序, 10006=元器, 10007=应用宝, 10008=元宝, 10009=企微智能机器人, 10010=元器API, 10011=LINE, 10012=Telegram, 10100=电脑管家, 20001=荣耀智能体平台, 20002=小米应用商店；user_id（string）为该渠道下的访客唯一标识。
     * @param ChannelType 对话消息的接入渠道类型：0=未指定, 1=坐席, 2=体验页面(腾讯云), 3=评测端对话, 4=体验页面(手机号), 5=对话端API接入, 6=评测任务对话, 10=工作流调试, 10000=微信公众号, 10001=微信服务号, 10002=企微应用, 10003=网页组件, 10004=微信客服, 10005=微信小程序, 10006=元器, 10007=应用宝, 10008=元宝, 10009=企微智能机器人, 10010=元器API, 10011=LINE, 10012=Telegram, 10100=电脑管家, 20001=荣耀智能体平台, 20002=小米应用商店；user_id（string）为该渠道下的访客唯一标识。
     */
    public void setChannelType(Long ChannelType) {
        this.ChannelType = ChannelType;
    }

    /**
     * Get 用户ID 
     * @return FromId 用户ID
     */
    public String getFromId() {
        return this.FromId;
    }

    /**
     * Set 用户ID
     * @param FromId 用户ID
     */
    public void setFromId(String FromId) {
        this.FromId = FromId;
    }

    /**
     * Get 消息发送者的用户来源类型：1=用户（访客/C端用户）, 2=机器人（AI回复）, 3=坐席（人工客服）；from_id（string）为该来源类型下的用户唯一标识 ID。 
     * @return FromType 消息发送者的用户来源类型：1=用户（访客/C端用户）, 2=机器人（AI回复）, 3=坐席（人工客服）；from_id（string）为该来源类型下的用户唯一标识 ID。
     */
    public Long getFromType() {
        return this.FromType;
    }

    /**
     * Set 消息发送者的用户来源类型：1=用户（访客/C端用户）, 2=机器人（AI回复）, 3=坐席（人工客服）；from_id（string）为该来源类型下的用户唯一标识 ID。
     * @param FromType 消息发送者的用户来源类型：1=用户（访客/C端用户）, 2=机器人（AI回复）, 3=坐席（人工客服）；from_id（string）为该来源类型下的用户唯一标识 ID。
     */
    public void setFromType(Long FromType) {
        this.FromType = FromType;
    }

    /**
     * Get 用户头像 
     * @return UserAvatar 用户头像
     */
    public String getUserAvatar() {
        return this.UserAvatar;
    }

    /**
     * Set 用户头像
     * @param UserAvatar 用户头像
     */
    public void setUserAvatar(String UserAvatar) {
        this.UserAvatar = UserAvatar;
    }

    /**
     * Get 访客ID 
     * @return UserId 访客ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 访客ID
     * @param UserId 访客ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 访客名称 
     * @return UserNickname 访客名称
     */
    public String getUserNickname() {
        return this.UserNickname;
    }

    /**
     * Set 访客名称
     * @param UserNickname 访客名称
     */
    public void setUserNickname(String UserNickname) {
        this.UserNickname = UserNickname;
    }

    public MsgRecordSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MsgRecordSource(MsgRecordSource source) {
        if (source.ChannelType != null) {
            this.ChannelType = new Long(source.ChannelType);
        }
        if (source.FromId != null) {
            this.FromId = new String(source.FromId);
        }
        if (source.FromType != null) {
            this.FromType = new Long(source.FromType);
        }
        if (source.UserAvatar != null) {
            this.UserAvatar = new String(source.UserAvatar);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserNickname != null) {
            this.UserNickname = new String(source.UserNickname);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelType", this.ChannelType);
        this.setParamSimple(map, prefix + "FromId", this.FromId);
        this.setParamSimple(map, prefix + "FromType", this.FromType);
        this.setParamSimple(map, prefix + "UserAvatar", this.UserAvatar);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserNickname", this.UserNickname);

    }
}

