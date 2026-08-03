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
    * <p>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 |  |<br>| 1 | 不推送 |<br>| 2 | 微信公众号 |<br>| 3 | 企业微信 AI 机器人 |</p>
    */
    @SerializedName("PushChannel")
    @Expose
    private Long PushChannel;

    /**
    * <p>推送会话ID</p>
    */
    @SerializedName("PushTargetId")
    @Expose
    private String PushTargetId;

    /**
    * <p>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 |  |<br>| 1 | 用户 (微信公众号 openid) |<br>| 2 | 群聊 (企微机器人 chat_id) |</p>
    */
    @SerializedName("PushTargetType")
    @Expose
    private Long PushTargetType;

    /**
    * <p>推送webhook的url</p>
    */
    @SerializedName("PushWebhookUrl")
    @Expose
    private String PushWebhookUrl;

    /**
     * Get <p>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 |  |<br>| 1 | 不推送 |<br>| 2 | 微信公众号 |<br>| 3 | 企业微信 AI 机器人 |</p> 
     * @return PushChannel <p>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 |  |<br>| 1 | 不推送 |<br>| 2 | 微信公众号 |<br>| 3 | 企业微信 AI 机器人 |</p>
     */
    public Long getPushChannel() {
        return this.PushChannel;
    }

    /**
     * Set <p>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 |  |<br>| 1 | 不推送 |<br>| 2 | 微信公众号 |<br>| 3 | 企业微信 AI 机器人 |</p>
     * @param PushChannel <p>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 |  |<br>| 1 | 不推送 |<br>| 2 | 微信公众号 |<br>| 3 | 企业微信 AI 机器人 |</p>
     */
    public void setPushChannel(Long PushChannel) {
        this.PushChannel = PushChannel;
    }

    /**
     * Get <p>推送会话ID</p> 
     * @return PushTargetId <p>推送会话ID</p>
     */
    public String getPushTargetId() {
        return this.PushTargetId;
    }

    /**
     * Set <p>推送会话ID</p>
     * @param PushTargetId <p>推送会话ID</p>
     */
    public void setPushTargetId(String PushTargetId) {
        this.PushTargetId = PushTargetId;
    }

    /**
     * Get <p>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 |  |<br>| 1 | 用户 (微信公众号 openid) |<br>| 2 | 群聊 (企微机器人 chat_id) |</p> 
     * @return PushTargetType <p>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 |  |<br>| 1 | 用户 (微信公众号 openid) |<br>| 2 | 群聊 (企微机器人 chat_id) |</p>
     */
    public Long getPushTargetType() {
        return this.PushTargetType;
    }

    /**
     * Set <p>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 |  |<br>| 1 | 用户 (微信公众号 openid) |<br>| 2 | 群聊 (企微机器人 chat_id) |</p>
     * @param PushTargetType <p>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 |  |<br>| 1 | 用户 (微信公众号 openid) |<br>| 2 | 群聊 (企微机器人 chat_id) |</p>
     */
    public void setPushTargetType(Long PushTargetType) {
        this.PushTargetType = PushTargetType;
    }

    /**
     * Get <p>推送webhook的url</p> 
     * @return PushWebhookUrl <p>推送webhook的url</p>
     */
    public String getPushWebhookUrl() {
        return this.PushWebhookUrl;
    }

    /**
     * Set <p>推送webhook的url</p>
     * @param PushWebhookUrl <p>推送webhook的url</p>
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

