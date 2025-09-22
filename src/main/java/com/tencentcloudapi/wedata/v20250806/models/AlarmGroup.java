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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmGroup extends AbstractModel {

    /**
    * 告警升级人ID列表
若告警接收人或上级升级人未在告警间隔时间内确认告警，则会发送告警给下一级升级人。
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
    * 告警通知疲劳配置
    */
    @SerializedName("NotificationFatigue")
    @Expose
    private NotificationFatigue NotificationFatigue;

    /**
    * 告警渠道 1.邮件，2.短信，3.微信，4.语音，5.企业微信，6.Http，7.企业微信群 8 飞书群 9 钉钉群 10 Slack群 11 Teams群（默认1.邮件） 7.企业微信群 8 飞书群 9 钉钉群 10 Slack群 11 Teams群 只能选择一个渠道
    */
    @SerializedName("AlarmWays")
    @Expose
    private String [] AlarmWays;

    /**
    * 企业微信群/飞书群/钉钉群 /Slack群/Teams群的webhook地址列表
    */
    @SerializedName("WebHooks")
    @Expose
    private AlarmWayWebHook [] WebHooks;

    /**
    * 告警接收人类型：1.指定人员，2.任务责任人，3.值班表（默认1.指定人员）
    */
    @SerializedName("AlarmRecipientType")
    @Expose
    private Long AlarmRecipientType;

    /**
    * 根据AlarmRecipientType的类型该列表具有不同的业务id 1（指定人员）: 告警接收人id列表 2（任务责任人）：无需配置 3（值班表）：值班表id列表
    */
    @SerializedName("AlarmRecipientIds")
    @Expose
    private String [] AlarmRecipientIds;

    /**
     * Get 告警升级人ID列表
若告警接收人或上级升级人未在告警间隔时间内确认告警，则会发送告警给下一级升级人。 
     * @return AlarmEscalationRecipientIds 告警升级人ID列表
若告警接收人或上级升级人未在告警间隔时间内确认告警，则会发送告警给下一级升级人。
     */
    public String [] getAlarmEscalationRecipientIds() {
        return this.AlarmEscalationRecipientIds;
    }

    /**
     * Set 告警升级人ID列表
若告警接收人或上级升级人未在告警间隔时间内确认告警，则会发送告警给下一级升级人。
     * @param AlarmEscalationRecipientIds 告警升级人ID列表
若告警接收人或上级升级人未在告警间隔时间内确认告警，则会发送告警给下一级升级人。
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
     * Get 告警通知疲劳配置 
     * @return NotificationFatigue 告警通知疲劳配置
     */
    public NotificationFatigue getNotificationFatigue() {
        return this.NotificationFatigue;
    }

    /**
     * Set 告警通知疲劳配置
     * @param NotificationFatigue 告警通知疲劳配置
     */
    public void setNotificationFatigue(NotificationFatigue NotificationFatigue) {
        this.NotificationFatigue = NotificationFatigue;
    }

    /**
     * Get 告警渠道 1.邮件，2.短信，3.微信，4.语音，5.企业微信，6.Http，7.企业微信群 8 飞书群 9 钉钉群 10 Slack群 11 Teams群（默认1.邮件） 7.企业微信群 8 飞书群 9 钉钉群 10 Slack群 11 Teams群 只能选择一个渠道 
     * @return AlarmWays 告警渠道 1.邮件，2.短信，3.微信，4.语音，5.企业微信，6.Http，7.企业微信群 8 飞书群 9 钉钉群 10 Slack群 11 Teams群（默认1.邮件） 7.企业微信群 8 飞书群 9 钉钉群 10 Slack群 11 Teams群 只能选择一个渠道
     */
    public String [] getAlarmWays() {
        return this.AlarmWays;
    }

    /**
     * Set 告警渠道 1.邮件，2.短信，3.微信，4.语音，5.企业微信，6.Http，7.企业微信群 8 飞书群 9 钉钉群 10 Slack群 11 Teams群（默认1.邮件） 7.企业微信群 8 飞书群 9 钉钉群 10 Slack群 11 Teams群 只能选择一个渠道
     * @param AlarmWays 告警渠道 1.邮件，2.短信，3.微信，4.语音，5.企业微信，6.Http，7.企业微信群 8 飞书群 9 钉钉群 10 Slack群 11 Teams群（默认1.邮件） 7.企业微信群 8 飞书群 9 钉钉群 10 Slack群 11 Teams群 只能选择一个渠道
     */
    public void setAlarmWays(String [] AlarmWays) {
        this.AlarmWays = AlarmWays;
    }

    /**
     * Get 企业微信群/飞书群/钉钉群 /Slack群/Teams群的webhook地址列表 
     * @return WebHooks 企业微信群/飞书群/钉钉群 /Slack群/Teams群的webhook地址列表
     */
    public AlarmWayWebHook [] getWebHooks() {
        return this.WebHooks;
    }

    /**
     * Set 企业微信群/飞书群/钉钉群 /Slack群/Teams群的webhook地址列表
     * @param WebHooks 企业微信群/飞书群/钉钉群 /Slack群/Teams群的webhook地址列表
     */
    public void setWebHooks(AlarmWayWebHook [] WebHooks) {
        this.WebHooks = WebHooks;
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
     * Get 根据AlarmRecipientType的类型该列表具有不同的业务id 1（指定人员）: 告警接收人id列表 2（任务责任人）：无需配置 3（值班表）：值班表id列表 
     * @return AlarmRecipientIds 根据AlarmRecipientType的类型该列表具有不同的业务id 1（指定人员）: 告警接收人id列表 2（任务责任人）：无需配置 3（值班表）：值班表id列表
     */
    public String [] getAlarmRecipientIds() {
        return this.AlarmRecipientIds;
    }

    /**
     * Set 根据AlarmRecipientType的类型该列表具有不同的业务id 1（指定人员）: 告警接收人id列表 2（任务责任人）：无需配置 3（值班表）：值班表id列表
     * @param AlarmRecipientIds 根据AlarmRecipientType的类型该列表具有不同的业务id 1（指定人员）: 告警接收人id列表 2（任务责任人）：无需配置 3（值班表）：值班表id列表
     */
    public void setAlarmRecipientIds(String [] AlarmRecipientIds) {
        this.AlarmRecipientIds = AlarmRecipientIds;
    }

    public AlarmGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmGroup(AlarmGroup source) {
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
        if (source.AlarmWays != null) {
            this.AlarmWays = new String[source.AlarmWays.length];
            for (int i = 0; i < source.AlarmWays.length; i++) {
                this.AlarmWays[i] = new String(source.AlarmWays[i]);
            }
        }
        if (source.WebHooks != null) {
            this.WebHooks = new AlarmWayWebHook[source.WebHooks.length];
            for (int i = 0; i < source.WebHooks.length; i++) {
                this.WebHooks[i] = new AlarmWayWebHook(source.WebHooks[i]);
            }
        }
        if (source.AlarmRecipientType != null) {
            this.AlarmRecipientType = new Long(source.AlarmRecipientType);
        }
        if (source.AlarmRecipientIds != null) {
            this.AlarmRecipientIds = new String[source.AlarmRecipientIds.length];
            for (int i = 0; i < source.AlarmRecipientIds.length; i++) {
                this.AlarmRecipientIds[i] = new String(source.AlarmRecipientIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AlarmEscalationRecipientIds.", this.AlarmEscalationRecipientIds);
        this.setParamSimple(map, prefix + "AlarmEscalationInterval", this.AlarmEscalationInterval);
        this.setParamObj(map, prefix + "NotificationFatigue.", this.NotificationFatigue);
        this.setParamArraySimple(map, prefix + "AlarmWays.", this.AlarmWays);
        this.setParamArrayObj(map, prefix + "WebHooks.", this.WebHooks);
        this.setParamSimple(map, prefix + "AlarmRecipientType", this.AlarmRecipientType);
        this.setParamArraySimple(map, prefix + "AlarmRecipientIds.", this.AlarmRecipientIds);

    }
}

