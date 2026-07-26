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

public class TimerPushConfig extends AbstractModel {

    /**
    * 
枚举值:
| uint | 描述 |
| --- | --- |
| 0 |  |
| 1 | 不推送 |
| 2 | 微信公众号 |
| 3 | 企业微信 AI 机器人 |
    */
    @SerializedName("PushChannel")
    @Expose
    private Long PushChannel;

    /**
    * 推送会话ID
    */
    @SerializedName("PushTargetId")
    @Expose
    private String PushTargetId;

    /**
    * 
枚举值:
| uint | 描述 |
| --- | --- |
| 0 |  |
| 1 | 用户 (微信公众号 openid) |
| 2 | 群聊 (企微机器人 chat_id) |
    */
    @SerializedName("PushTargetType")
    @Expose
    private Long PushTargetType;

    /**
    * 
    */
    @SerializedName("PushWebhookUrl")
    @Expose
    private String PushWebhookUrl;

    /**
     * Get 
枚举值:
| uint | 描述 |
| --- | --- |
| 0 |  |
| 1 | 不推送 |
| 2 | 微信公众号 |
| 3 | 企业微信 AI 机器人 | 
     * @return PushChannel 
枚举值:
| uint | 描述 |
| --- | --- |
| 0 |  |
| 1 | 不推送 |
| 2 | 微信公众号 |
| 3 | 企业微信 AI 机器人 |
     */
    public Long getPushChannel() {
        return this.PushChannel;
    }

    /**
     * Set 
枚举值:
| uint | 描述 |
| --- | --- |
| 0 |  |
| 1 | 不推送 |
| 2 | 微信公众号 |
| 3 | 企业微信 AI 机器人 |
     * @param PushChannel 
枚举值:
| uint | 描述 |
| --- | --- |
| 0 |  |
| 1 | 不推送 |
| 2 | 微信公众号 |
| 3 | 企业微信 AI 机器人 |
     */
    public void setPushChannel(Long PushChannel) {
        this.PushChannel = PushChannel;
    }

    /**
     * Get 推送会话ID 
     * @return PushTargetId 推送会话ID
     */
    public String getPushTargetId() {
        return this.PushTargetId;
    }

    /**
     * Set 推送会话ID
     * @param PushTargetId 推送会话ID
     */
    public void setPushTargetId(String PushTargetId) {
        this.PushTargetId = PushTargetId;
    }

    /**
     * Get 
枚举值:
| uint | 描述 |
| --- | --- |
| 0 |  |
| 1 | 用户 (微信公众号 openid) |
| 2 | 群聊 (企微机器人 chat_id) | 
     * @return PushTargetType 
枚举值:
| uint | 描述 |
| --- | --- |
| 0 |  |
| 1 | 用户 (微信公众号 openid) |
| 2 | 群聊 (企微机器人 chat_id) |
     */
    public Long getPushTargetType() {
        return this.PushTargetType;
    }

    /**
     * Set 
枚举值:
| uint | 描述 |
| --- | --- |
| 0 |  |
| 1 | 用户 (微信公众号 openid) |
| 2 | 群聊 (企微机器人 chat_id) |
     * @param PushTargetType 
枚举值:
| uint | 描述 |
| --- | --- |
| 0 |  |
| 1 | 用户 (微信公众号 openid) |
| 2 | 群聊 (企微机器人 chat_id) |
     */
    public void setPushTargetType(Long PushTargetType) {
        this.PushTargetType = PushTargetType;
    }

    /**
     * Get  
     * @return PushWebhookUrl 
     */
    public String getPushWebhookUrl() {
        return this.PushWebhookUrl;
    }

    /**
     * Set 
     * @param PushWebhookUrl 
     */
    public void setPushWebhookUrl(String PushWebhookUrl) {
        this.PushWebhookUrl = PushWebhookUrl;
    }

    public TimerPushConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimerPushConfig(TimerPushConfig source) {
        if (source.PushChannel != null) {
            this.PushChannel = new Long(source.PushChannel);
        }
        if (source.PushTargetId != null) {
            this.PushTargetId = new String(source.PushTargetId);
        }
        if (source.PushTargetType != null) {
            this.PushTargetType = new Long(source.PushTargetType);
        }
        if (source.PushWebhookUrl != null) {
            this.PushWebhookUrl = new String(source.PushWebhookUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PushChannel", this.PushChannel);
        this.setParamSimple(map, prefix + "PushTargetId", this.PushTargetId);
        this.setParamSimple(map, prefix + "PushTargetType", this.PushTargetType);
        this.setParamSimple(map, prefix + "PushWebhookUrl", this.PushWebhookUrl);

    }
}

