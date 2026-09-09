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

public class WechatClawBotChannelConfig extends AbstractModel {

    /**
    * <p>ClawBot机器人ID（扫码后回填）</p>
    */
    @SerializedName("BotId")
    @Expose
    private String BotId;

    /**
    * <p>ClawBot机器人Token（扫码后回填）</p>
    */
    @SerializedName("BotToken")
    @Expose
    private String BotToken;

    /**
    * <p>二维码状态（wait/confirmed/expired）</p>
    */
    @SerializedName("QrcodeStatus")
    @Expose
    private String QrcodeStatus;

    /**
    * <p>二维码URL（创建后回填）</p>
    */
    @SerializedName("QrcodeUrl")
    @Expose
    private String QrcodeUrl;

    /**
    * <p>微信用户ID（扫码后回填）</p>
    */
    @SerializedName("WechatUserId")
    @Expose
    private String WechatUserId;

    /**
     * Get <p>ClawBot机器人ID（扫码后回填）</p> 
     * @return BotId <p>ClawBot机器人ID（扫码后回填）</p>
     */
    public String getBotId() {
        return this.BotId;
    }

    /**
     * Set <p>ClawBot机器人ID（扫码后回填）</p>
     * @param BotId <p>ClawBot机器人ID（扫码后回填）</p>
     */
    public void setBotId(String BotId) {
        this.BotId = BotId;
    }

    /**
     * Get <p>ClawBot机器人Token（扫码后回填）</p> 
     * @return BotToken <p>ClawBot机器人Token（扫码后回填）</p>
     */
    public String getBotToken() {
        return this.BotToken;
    }

    /**
     * Set <p>ClawBot机器人Token（扫码后回填）</p>
     * @param BotToken <p>ClawBot机器人Token（扫码后回填）</p>
     */
    public void setBotToken(String BotToken) {
        this.BotToken = BotToken;
    }

    /**
     * Get <p>二维码状态（wait/confirmed/expired）</p> 
     * @return QrcodeStatus <p>二维码状态（wait/confirmed/expired）</p>
     */
    public String getQrcodeStatus() {
        return this.QrcodeStatus;
    }

    /**
     * Set <p>二维码状态（wait/confirmed/expired）</p>
     * @param QrcodeStatus <p>二维码状态（wait/confirmed/expired）</p>
     */
    public void setQrcodeStatus(String QrcodeStatus) {
        this.QrcodeStatus = QrcodeStatus;
    }

    /**
     * Get <p>二维码URL（创建后回填）</p> 
     * @return QrcodeUrl <p>二维码URL（创建后回填）</p>
     */
    public String getQrcodeUrl() {
        return this.QrcodeUrl;
    }

    /**
     * Set <p>二维码URL（创建后回填）</p>
     * @param QrcodeUrl <p>二维码URL（创建后回填）</p>
     */
    public void setQrcodeUrl(String QrcodeUrl) {
        this.QrcodeUrl = QrcodeUrl;
    }

    /**
     * Get <p>微信用户ID（扫码后回填）</p> 
     * @return WechatUserId <p>微信用户ID（扫码后回填）</p>
     */
    public String getWechatUserId() {
        return this.WechatUserId;
    }

    /**
     * Set <p>微信用户ID（扫码后回填）</p>
     * @param WechatUserId <p>微信用户ID（扫码后回填）</p>
     */
    public void setWechatUserId(String WechatUserId) {
        this.WechatUserId = WechatUserId;
    }

    public WechatClawBotChannelConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WechatClawBotChannelConfig(WechatClawBotChannelConfig source) {
        if (source.BotId != null) {
            this.BotId = new String(source.BotId);
        }
        if (source.BotToken != null) {
            this.BotToken = new String(source.BotToken);
        }
        if (source.QrcodeStatus != null) {
            this.QrcodeStatus = new String(source.QrcodeStatus);
        }
        if (source.QrcodeUrl != null) {
            this.QrcodeUrl = new String(source.QrcodeUrl);
        }
        if (source.WechatUserId != null) {
            this.WechatUserId = new String(source.WechatUserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotId", this.BotId);
        this.setParamSimple(map, prefix + "BotToken", this.BotToken);
        this.setParamSimple(map, prefix + "QrcodeStatus", this.QrcodeStatus);
        this.setParamSimple(map, prefix + "QrcodeUrl", this.QrcodeUrl);
        this.setParamSimple(map, prefix + "WechatUserId", this.WechatUserId);

    }
}

