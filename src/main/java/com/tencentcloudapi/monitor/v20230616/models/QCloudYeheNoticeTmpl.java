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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QCloudYeheNoticeTmpl extends AbstractModel {

    /**
    * 邮件通知渠道
    */
    @SerializedName("Email")
    @Expose
    private QCloudYeheNoticeTmplItem Email;

    /**
    * 企业微信通知渠道
    */
    @SerializedName("QYWX")
    @Expose
    private QCloudYeheNoticeTmplItem QYWX;

    /**
    * 短信通知渠道
    */
    @SerializedName("SMS")
    @Expose
    private QCloudYeheNoticeTmplItem SMS;

    /**
    * 语音通知渠道
    */
    @SerializedName("Voice")
    @Expose
    private QCloudYeheNoticeTmplItem Voice;

    /**
    * 微信通知渠道
    */
    @SerializedName("WeChat")
    @Expose
    private QCloudYeheWeChatNoticeTmplItem WeChat;

    /**
    * 站内信通知渠道
    */
    @SerializedName("Site")
    @Expose
    private QCloudYeheNoticeTmplItem Site;

    /**
    * 安灯通知渠道
    */
    @SerializedName("Andon")
    @Expose
    private QCloudYeheNoticeTmplItem Andon;

    /**
     * Get 邮件通知渠道 
     * @return Email 邮件通知渠道
     */
    public QCloudYeheNoticeTmplItem getEmail() {
        return this.Email;
    }

    /**
     * Set 邮件通知渠道
     * @param Email 邮件通知渠道
     */
    public void setEmail(QCloudYeheNoticeTmplItem Email) {
        this.Email = Email;
    }

    /**
     * Get 企业微信通知渠道 
     * @return QYWX 企业微信通知渠道
     */
    public QCloudYeheNoticeTmplItem getQYWX() {
        return this.QYWX;
    }

    /**
     * Set 企业微信通知渠道
     * @param QYWX 企业微信通知渠道
     */
    public void setQYWX(QCloudYeheNoticeTmplItem QYWX) {
        this.QYWX = QYWX;
    }

    /**
     * Get 短信通知渠道 
     * @return SMS 短信通知渠道
     */
    public QCloudYeheNoticeTmplItem getSMS() {
        return this.SMS;
    }

    /**
     * Set 短信通知渠道
     * @param SMS 短信通知渠道
     */
    public void setSMS(QCloudYeheNoticeTmplItem SMS) {
        this.SMS = SMS;
    }

    /**
     * Get 语音通知渠道 
     * @return Voice 语音通知渠道
     */
    public QCloudYeheNoticeTmplItem getVoice() {
        return this.Voice;
    }

    /**
     * Set 语音通知渠道
     * @param Voice 语音通知渠道
     */
    public void setVoice(QCloudYeheNoticeTmplItem Voice) {
        this.Voice = Voice;
    }

    /**
     * Get 微信通知渠道 
     * @return WeChat 微信通知渠道
     */
    public QCloudYeheWeChatNoticeTmplItem getWeChat() {
        return this.WeChat;
    }

    /**
     * Set 微信通知渠道
     * @param WeChat 微信通知渠道
     */
    public void setWeChat(QCloudYeheWeChatNoticeTmplItem WeChat) {
        this.WeChat = WeChat;
    }

    /**
     * Get 站内信通知渠道 
     * @return Site 站内信通知渠道
     */
    public QCloudYeheNoticeTmplItem getSite() {
        return this.Site;
    }

    /**
     * Set 站内信通知渠道
     * @param Site 站内信通知渠道
     */
    public void setSite(QCloudYeheNoticeTmplItem Site) {
        this.Site = Site;
    }

    /**
     * Get 安灯通知渠道 
     * @return Andon 安灯通知渠道
     */
    public QCloudYeheNoticeTmplItem getAndon() {
        return this.Andon;
    }

    /**
     * Set 安灯通知渠道
     * @param Andon 安灯通知渠道
     */
    public void setAndon(QCloudYeheNoticeTmplItem Andon) {
        this.Andon = Andon;
    }

    public QCloudYeheNoticeTmpl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QCloudYeheNoticeTmpl(QCloudYeheNoticeTmpl source) {
        if (source.Email != null) {
            this.Email = new QCloudYeheNoticeTmplItem(source.Email);
        }
        if (source.QYWX != null) {
            this.QYWX = new QCloudYeheNoticeTmplItem(source.QYWX);
        }
        if (source.SMS != null) {
            this.SMS = new QCloudYeheNoticeTmplItem(source.SMS);
        }
        if (source.Voice != null) {
            this.Voice = new QCloudYeheNoticeTmplItem(source.Voice);
        }
        if (source.WeChat != null) {
            this.WeChat = new QCloudYeheWeChatNoticeTmplItem(source.WeChat);
        }
        if (source.Site != null) {
            this.Site = new QCloudYeheNoticeTmplItem(source.Site);
        }
        if (source.Andon != null) {
            this.Andon = new QCloudYeheNoticeTmplItem(source.Andon);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Email.", this.Email);
        this.setParamObj(map, prefix + "QYWX.", this.QYWX);
        this.setParamObj(map, prefix + "SMS.", this.SMS);
        this.setParamObj(map, prefix + "Voice.", this.Voice);
        this.setParamObj(map, prefix + "WeChat.", this.WeChat);
        this.setParamObj(map, prefix + "Site.", this.Site);
        this.setParamObj(map, prefix + "Andon.", this.Andon);

    }
}

