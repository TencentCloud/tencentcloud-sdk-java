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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmGroup extends AbstractModel {

    /**
    * 告警方式,1.邮件，2.短信，3.微信，4.语音，5.企业微信，6.Http，7.企业微信群；告警方式code列表（默认1.邮件）
    */
    @SerializedName("AlarmWays")
    @Expose
    private String [] AlarmWays;

    /**
    * 告警接收人类型：1.指定人员，2.任务责任人，3.值班表（默认1.指定人员）
    */
    @SerializedName("AlarmRecipientType")
    @Expose
    private Long AlarmRecipientType;

    /**
    * 告警接收人
    */
    @SerializedName("AlarmRecipients")
    @Expose
    private String [] AlarmRecipients;

    /**
    * 告警接收人ID
    */
    @SerializedName("AlarmRecipientIds")
    @Expose
    private String [] AlarmRecipientIds;

    /**
    * 告警升级人
    */
    @SerializedName("AlarmEscalationRecipients")
    @Expose
    private String [] AlarmEscalationRecipients;

    /**
    * 告警升级人ID
    */
    @SerializedName("AlarmEscalationRecipientIds")
    @Expose
    private String [] AlarmEscalationRecipientIds;

    /**
    * 告警升级间隔
    */
    @SerializedName("AlarmEscalationInterval")
    @Expose
    private Long AlarmEscalationInterval;

    /**
    * 告警通知疲劳度配置。
    */
    @SerializedName("NotificationFatigue")
    @Expose
    private NotificationFatigue NotificationFatigue;

    /**
    * 告警渠道规则 json 格式
    */
    @SerializedName("AlarmMessageRule")
    @Expose
    private String AlarmMessageRule;

    /**
     * Get 告警方式,1.邮件，2.短信，3.微信，4.语音，5.企业微信，6.Http，7.企业微信群；告警方式code列表（默认1.邮件） 
     * @return AlarmWays 告警方式,1.邮件，2.短信，3.微信，4.语音，5.企业微信，6.Http，7.企业微信群；告警方式code列表（默认1.邮件）
     */
    public String [] getAlarmWays() {
        return this.AlarmWays;
    }

    /**
     * Set 告警方式,1.邮件，2.短信，3.微信，4.语音，5.企业微信，6.Http，7.企业微信群；告警方式code列表（默认1.邮件）
     * @param AlarmWays 告警方式,1.邮件，2.短信，3.微信，4.语音，5.企业微信，6.Http，7.企业微信群；告警方式code列表（默认1.邮件）
     */
    public void setAlarmWays(String [] AlarmWays) {
        this.AlarmWays = AlarmWays;
    }

    /**
     * Get 告警接收人类型：1.指定人员，2.任务责任人，3.值班表（默认1.指定人员） 
     * @return AlarmRecipientType 告警接收人类型：1.指定人员，2.任务责任人，3.值班表（默认1.指定人员）
     */
    public Long getAlarmRecipientType() {
        return this.AlarmRecipientType;
    }

    /**
     * Set 告警接收人类型：1.指定人员，2.任务责任人，3.值班表（默认1.指定人员）
     * @param AlarmRecipientType 告警接收人类型：1.指定人员，2.任务责任人，3.值班表（默认1.指定人员）
     */
    public void setAlarmRecipientType(Long AlarmRecipientType) {
        this.AlarmRecipientType = AlarmRecipientType;
    }

    /**
     * Get 告警接收人 
     * @return AlarmRecipients 告警接收人
     */
    public String [] getAlarmRecipients() {
        return this.AlarmRecipients;
    }

    /**
     * Set 告警接收人
     * @param AlarmRecipients 告警接收人
     */
    public void setAlarmRecipients(String [] AlarmRecipients) {
        this.AlarmRecipients = AlarmRecipients;
    }

    /**
     * Get 告警接收人ID 
     * @return AlarmRecipientIds 告警接收人ID
     */
    public String [] getAlarmRecipientIds() {
        return this.AlarmRecipientIds;
    }

    /**
     * Set 告警接收人ID
     * @param AlarmRecipientIds 告警接收人ID
     */
    public void setAlarmRecipientIds(String [] AlarmRecipientIds) {
        this.AlarmRecipientIds = AlarmRecipientIds;
    }

    /**
     * Get 告警升级人 
     * @return AlarmEscalationRecipients 告警升级人
     */
    public String [] getAlarmEscalationRecipients() {
        return this.AlarmEscalationRecipients;
    }

    /**
     * Set 告警升级人
     * @param AlarmEscalationRecipients 告警升级人
     */
    public void setAlarmEscalationRecipients(String [] AlarmEscalationRecipients) {
        this.AlarmEscalationRecipients = AlarmEscalationRecipients;
    }

    /**
     * Get 告警升级人ID 
     * @return AlarmEscalationRecipientIds 告警升级人ID
     */
    public String [] getAlarmEscalationRecipientIds() {
        return this.AlarmEscalationRecipientIds;
    }

    /**
     * Set 告警升级人ID
     * @param AlarmEscalationRecipientIds 告警升级人ID
     */
    public void setAlarmEscalationRecipientIds(String [] AlarmEscalationRecipientIds) {
        this.AlarmEscalationRecipientIds = AlarmEscalationRecipientIds;
    }

    /**
     * Get 告警升级间隔 
     * @return AlarmEscalationInterval 告警升级间隔
     */
    public Long getAlarmEscalationInterval() {
        return this.AlarmEscalationInterval;
    }

    /**
     * Set 告警升级间隔
     * @param AlarmEscalationInterval 告警升级间隔
     */
    public void setAlarmEscalationInterval(Long AlarmEscalationInterval) {
        this.AlarmEscalationInterval = AlarmEscalationInterval;
    }

    /**
     * Get 告警通知疲劳度配置。 
     * @return NotificationFatigue 告警通知疲劳度配置。
     */
    public NotificationFatigue getNotificationFatigue() {
        return this.NotificationFatigue;
    }

    /**
     * Set 告警通知疲劳度配置。
     * @param NotificationFatigue 告警通知疲劳度配置。
     */
    public void setNotificationFatigue(NotificationFatigue NotificationFatigue) {
        this.NotificationFatigue = NotificationFatigue;
    }

    /**
     * Get 告警渠道规则 json 格式 
     * @return AlarmMessageRule 告警渠道规则 json 格式
     */
    public String getAlarmMessageRule() {
        return this.AlarmMessageRule;
    }

    /**
     * Set 告警渠道规则 json 格式
     * @param AlarmMessageRule 告警渠道规则 json 格式
     */
    public void setAlarmMessageRule(String AlarmMessageRule) {
        this.AlarmMessageRule = AlarmMessageRule;
    }

    public AlarmGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmGroup(AlarmGroup source) {
        if (source.AlarmWays != null) {
            this.AlarmWays = new String[source.AlarmWays.length];
            for (int i = 0; i < source.AlarmWays.length; i++) {
                this.AlarmWays[i] = new String(source.AlarmWays[i]);
            }
        }
        if (source.AlarmRecipientType != null) {
            this.AlarmRecipientType = new Long(source.AlarmRecipientType);
        }
        if (source.AlarmRecipients != null) {
            this.AlarmRecipients = new String[source.AlarmRecipients.length];
            for (int i = 0; i < source.AlarmRecipients.length; i++) {
                this.AlarmRecipients[i] = new String(source.AlarmRecipients[i]);
            }
        }
        if (source.AlarmRecipientIds != null) {
            this.AlarmRecipientIds = new String[source.AlarmRecipientIds.length];
            for (int i = 0; i < source.AlarmRecipientIds.length; i++) {
                this.AlarmRecipientIds[i] = new String(source.AlarmRecipientIds[i]);
            }
        }
        if (source.AlarmEscalationRecipients != null) {
            this.AlarmEscalationRecipients = new String[source.AlarmEscalationRecipients.length];
            for (int i = 0; i < source.AlarmEscalationRecipients.length; i++) {
                this.AlarmEscalationRecipients[i] = new String(source.AlarmEscalationRecipients[i]);
            }
        }
        if (source.AlarmEscalationRecipientIds != null) {
            this.AlarmEscalationRecipientIds = new String[source.AlarmEscalationRecipientIds.length];
            for (int i = 0; i < source.AlarmEscalationRecipientIds.length; i++) {
                this.AlarmEscalationRecipientIds[i] = new String(source.AlarmEscalationRecipientIds[i]);
            }
        }
        if (source.AlarmEscalationInterval != null) {
            this.AlarmEscalationInterval = new Long(source.AlarmEscalationInterval);
        }
        if (source.NotificationFatigue != null) {
            this.NotificationFatigue = new NotificationFatigue(source.NotificationFatigue);
        }
        if (source.AlarmMessageRule != null) {
            this.AlarmMessageRule = new String(source.AlarmMessageRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AlarmWays.", this.AlarmWays);
        this.setParamSimple(map, prefix + "AlarmRecipientType", this.AlarmRecipientType);
        this.setParamArraySimple(map, prefix + "AlarmRecipients.", this.AlarmRecipients);
        this.setParamArraySimple(map, prefix + "AlarmRecipientIds.", this.AlarmRecipientIds);
        this.setParamArraySimple(map, prefix + "AlarmEscalationRecipients.", this.AlarmEscalationRecipients);
        this.setParamArraySimple(map, prefix + "AlarmEscalationRecipientIds.", this.AlarmEscalationRecipientIds);
        this.setParamSimple(map, prefix + "AlarmEscalationInterval", this.AlarmEscalationInterval);
        this.setParamObj(map, prefix + "NotificationFatigue.", this.NotificationFatigue);
        this.setParamSimple(map, prefix + "AlarmMessageRule", this.AlarmMessageRule);

    }
}

