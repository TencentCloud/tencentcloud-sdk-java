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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmReceiverInfo extends AbstractModel{

    /**
    * 告警ID
    */
    @SerializedName("AlarmId")
    @Expose
    private String AlarmId;

    /**
    * 告警接收人ID
    */
    @SerializedName("AlarmReceiver")
    @Expose
    private String AlarmReceiver;

    /**
    * 邮件，0：未设置，1：成功，2：失败
    */
    @SerializedName("Email")
    @Expose
    private Long Email;

    /**
    * 短信，0：未设置，1：成功，2：失败
    */
    @SerializedName("Sms")
    @Expose
    private Long Sms;

    /**
    * 微信，0：未设置，1：成功，2：失败
    */
    @SerializedName("Wechat")
    @Expose
    private Long Wechat;

    /**
    * 电话，0：未设置，1：成功，2：失败
    */
    @SerializedName("Voice")
    @Expose
    private Long Voice;

    /**
    * 企业微信，0：未设置，1：成功，2：失败
    */
    @SerializedName("Wecom")
    @Expose
    private Long Wecom;

    /**
    * http，0：未设置，1：成功，2：失败
    */
    @SerializedName("Http")
    @Expose
    private Long Http;

    /**
    * 企业微信群，0：未设置，1：成功，2：失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WecomGroup")
    @Expose
    private Long WecomGroup;

    /**
     * Get 告警ID 
     * @return AlarmId 告警ID
     */
    public String getAlarmId() {
        return this.AlarmId;
    }

    /**
     * Set 告警ID
     * @param AlarmId 告警ID
     */
    public void setAlarmId(String AlarmId) {
        this.AlarmId = AlarmId;
    }

    /**
     * Get 告警接收人ID 
     * @return AlarmReceiver 告警接收人ID
     */
    public String getAlarmReceiver() {
        return this.AlarmReceiver;
    }

    /**
     * Set 告警接收人ID
     * @param AlarmReceiver 告警接收人ID
     */
    public void setAlarmReceiver(String AlarmReceiver) {
        this.AlarmReceiver = AlarmReceiver;
    }

    /**
     * Get 邮件，0：未设置，1：成功，2：失败 
     * @return Email 邮件，0：未设置，1：成功，2：失败
     */
    public Long getEmail() {
        return this.Email;
    }

    /**
     * Set 邮件，0：未设置，1：成功，2：失败
     * @param Email 邮件，0：未设置，1：成功，2：失败
     */
    public void setEmail(Long Email) {
        this.Email = Email;
    }

    /**
     * Get 短信，0：未设置，1：成功，2：失败 
     * @return Sms 短信，0：未设置，1：成功，2：失败
     */
    public Long getSms() {
        return this.Sms;
    }

    /**
     * Set 短信，0：未设置，1：成功，2：失败
     * @param Sms 短信，0：未设置，1：成功，2：失败
     */
    public void setSms(Long Sms) {
        this.Sms = Sms;
    }

    /**
     * Get 微信，0：未设置，1：成功，2：失败 
     * @return Wechat 微信，0：未设置，1：成功，2：失败
     */
    public Long getWechat() {
        return this.Wechat;
    }

    /**
     * Set 微信，0：未设置，1：成功，2：失败
     * @param Wechat 微信，0：未设置，1：成功，2：失败
     */
    public void setWechat(Long Wechat) {
        this.Wechat = Wechat;
    }

    /**
     * Get 电话，0：未设置，1：成功，2：失败 
     * @return Voice 电话，0：未设置，1：成功，2：失败
     */
    public Long getVoice() {
        return this.Voice;
    }

    /**
     * Set 电话，0：未设置，1：成功，2：失败
     * @param Voice 电话，0：未设置，1：成功，2：失败
     */
    public void setVoice(Long Voice) {
        this.Voice = Voice;
    }

    /**
     * Get 企业微信，0：未设置，1：成功，2：失败 
     * @return Wecom 企业微信，0：未设置，1：成功，2：失败
     */
    public Long getWecom() {
        return this.Wecom;
    }

    /**
     * Set 企业微信，0：未设置，1：成功，2：失败
     * @param Wecom 企业微信，0：未设置，1：成功，2：失败
     */
    public void setWecom(Long Wecom) {
        this.Wecom = Wecom;
    }

    /**
     * Get http，0：未设置，1：成功，2：失败 
     * @return Http http，0：未设置，1：成功，2：失败
     */
    public Long getHttp() {
        return this.Http;
    }

    /**
     * Set http，0：未设置，1：成功，2：失败
     * @param Http http，0：未设置，1：成功，2：失败
     */
    public void setHttp(Long Http) {
        this.Http = Http;
    }

    /**
     * Get 企业微信群，0：未设置，1：成功，2：失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WecomGroup 企业微信群，0：未设置，1：成功，2：失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWecomGroup() {
        return this.WecomGroup;
    }

    /**
     * Set 企业微信群，0：未设置，1：成功，2：失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param WecomGroup 企业微信群，0：未设置，1：成功，2：失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWecomGroup(Long WecomGroup) {
        this.WecomGroup = WecomGroup;
    }

    public AlarmReceiverInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmReceiverInfo(AlarmReceiverInfo source) {
        if (source.AlarmId != null) {
            this.AlarmId = new String(source.AlarmId);
        }
        if (source.AlarmReceiver != null) {
            this.AlarmReceiver = new String(source.AlarmReceiver);
        }
        if (source.Email != null) {
            this.Email = new Long(source.Email);
        }
        if (source.Sms != null) {
            this.Sms = new Long(source.Sms);
        }
        if (source.Wechat != null) {
            this.Wechat = new Long(source.Wechat);
        }
        if (source.Voice != null) {
            this.Voice = new Long(source.Voice);
        }
        if (source.Wecom != null) {
            this.Wecom = new Long(source.Wecom);
        }
        if (source.Http != null) {
            this.Http = new Long(source.Http);
        }
        if (source.WecomGroup != null) {
            this.WecomGroup = new Long(source.WecomGroup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmId", this.AlarmId);
        this.setParamSimple(map, prefix + "AlarmReceiver", this.AlarmReceiver);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Sms", this.Sms);
        this.setParamSimple(map, prefix + "Wechat", this.Wechat);
        this.setParamSimple(map, prefix + "Voice", this.Voice);
        this.setParamSimple(map, prefix + "Wecom", this.Wecom);
        this.setParamSimple(map, prefix + "Http", this.Http);
        this.setParamSimple(map, prefix + "WecomGroup", this.WecomGroup);

    }
}

