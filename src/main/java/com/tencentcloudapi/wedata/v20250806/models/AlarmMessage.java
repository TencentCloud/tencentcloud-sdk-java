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

public class AlarmMessage extends AbstractModel {

    /**
    * 告警消息Id
    */
    @SerializedName("AlarmMessageId")
    @Expose
    private Long AlarmMessageId;

    /**
    * 告警时间，同一条告警可能发送多次，只显示最新的告警时间
    */
    @SerializedName("AlarmTime")
    @Expose
    private String AlarmTime;

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 任务Id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务的实例数据时间
    */
    @SerializedName("CurRunDate")
    @Expose
    private String CurRunDate;

    /**
    * 告警原因
    */
    @SerializedName("AlarmReason")
    @Expose
    private String AlarmReason;

    /**
    * 告警级别，1.普通， 2.重要，3.紧急
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * 告警规则Id
    */
    @SerializedName("AlarmRuleId")
    @Expose
    private String AlarmRuleId;

    /**
    * 告警渠道 1.邮件，2.短信，3.微信，4.语音，5.企业微信，6.Http，7.企业微信群， 8.飞书群，9.钉钉群，10.Slack群,11.Teams群（默认1.邮件），7.企业微信群，8.飞书群，9.钉钉群，10.Slack群，11.Teams群 
    */
    @SerializedName("AlarmWays")
    @Expose
    private String [] AlarmWays;

    /**
    * 告警接收人
    */
    @SerializedName("AlarmRecipients")
    @Expose
    private String [] AlarmRecipients;

    /**
     * Get 告警消息Id 
     * @return AlarmMessageId 告警消息Id
     */
    public Long getAlarmMessageId() {
        return this.AlarmMessageId;
    }

    /**
     * Set 告警消息Id
     * @param AlarmMessageId 告警消息Id
     */
    public void setAlarmMessageId(Long AlarmMessageId) {
        this.AlarmMessageId = AlarmMessageId;
    }

    /**
     * Get 告警时间，同一条告警可能发送多次，只显示最新的告警时间 
     * @return AlarmTime 告警时间，同一条告警可能发送多次，只显示最新的告警时间
     */
    public String getAlarmTime() {
        return this.AlarmTime;
    }

    /**
     * Set 告警时间，同一条告警可能发送多次，只显示最新的告警时间
     * @param AlarmTime 告警时间，同一条告警可能发送多次，只显示最新的告警时间
     */
    public void setAlarmTime(String AlarmTime) {
        this.AlarmTime = AlarmTime;
    }

    /**
     * Get 任务名称 
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 任务Id 
     * @return TaskId 任务Id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务Id
     * @param TaskId 任务Id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务的实例数据时间 
     * @return CurRunDate 任务的实例数据时间
     */
    public String getCurRunDate() {
        return this.CurRunDate;
    }

    /**
     * Set 任务的实例数据时间
     * @param CurRunDate 任务的实例数据时间
     */
    public void setCurRunDate(String CurRunDate) {
        this.CurRunDate = CurRunDate;
    }

    /**
     * Get 告警原因 
     * @return AlarmReason 告警原因
     */
    public String getAlarmReason() {
        return this.AlarmReason;
    }

    /**
     * Set 告警原因
     * @param AlarmReason 告警原因
     */
    public void setAlarmReason(String AlarmReason) {
        this.AlarmReason = AlarmReason;
    }

    /**
     * Get 告警级别，1.普通， 2.重要，3.紧急 
     * @return AlarmLevel 告警级别，1.普通， 2.重要，3.紧急
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set 告警级别，1.普通， 2.重要，3.紧急
     * @param AlarmLevel 告警级别，1.普通， 2.重要，3.紧急
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get 告警规则Id 
     * @return AlarmRuleId 告警规则Id
     */
    public String getAlarmRuleId() {
        return this.AlarmRuleId;
    }

    /**
     * Set 告警规则Id
     * @param AlarmRuleId 告警规则Id
     */
    public void setAlarmRuleId(String AlarmRuleId) {
        this.AlarmRuleId = AlarmRuleId;
    }

    /**
     * Get 告警渠道 1.邮件，2.短信，3.微信，4.语音，5.企业微信，6.Http，7.企业微信群， 8.飞书群，9.钉钉群，10.Slack群,11.Teams群（默认1.邮件），7.企业微信群，8.飞书群，9.钉钉群，10.Slack群，11.Teams群  
     * @return AlarmWays 告警渠道 1.邮件，2.短信，3.微信，4.语音，5.企业微信，6.Http，7.企业微信群， 8.飞书群，9.钉钉群，10.Slack群,11.Teams群（默认1.邮件），7.企业微信群，8.飞书群，9.钉钉群，10.Slack群，11.Teams群 
     */
    public String [] getAlarmWays() {
        return this.AlarmWays;
    }

    /**
     * Set 告警渠道 1.邮件，2.短信，3.微信，4.语音，5.企业微信，6.Http，7.企业微信群， 8.飞书群，9.钉钉群，10.Slack群,11.Teams群（默认1.邮件），7.企业微信群，8.飞书群，9.钉钉群，10.Slack群，11.Teams群 
     * @param AlarmWays 告警渠道 1.邮件，2.短信，3.微信，4.语音，5.企业微信，6.Http，7.企业微信群， 8.飞书群，9.钉钉群，10.Slack群,11.Teams群（默认1.邮件），7.企业微信群，8.飞书群，9.钉钉群，10.Slack群，11.Teams群 
     */
    public void setAlarmWays(String [] AlarmWays) {
        this.AlarmWays = AlarmWays;
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

    public AlarmMessage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmMessage(AlarmMessage source) {
        if (source.AlarmMessageId != null) {
            this.AlarmMessageId = new Long(source.AlarmMessageId);
        }
        if (source.AlarmTime != null) {
            this.AlarmTime = new String(source.AlarmTime);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.CurRunDate != null) {
            this.CurRunDate = new String(source.CurRunDate);
        }
        if (source.AlarmReason != null) {
            this.AlarmReason = new String(source.AlarmReason);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.AlarmRuleId != null) {
            this.AlarmRuleId = new String(source.AlarmRuleId);
        }
        if (source.AlarmWays != null) {
            this.AlarmWays = new String[source.AlarmWays.length];
            for (int i = 0; i < source.AlarmWays.length; i++) {
                this.AlarmWays[i] = new String(source.AlarmWays[i]);
            }
        }
        if (source.AlarmRecipients != null) {
            this.AlarmRecipients = new String[source.AlarmRecipients.length];
            for (int i = 0; i < source.AlarmRecipients.length; i++) {
                this.AlarmRecipients[i] = new String(source.AlarmRecipients[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmMessageId", this.AlarmMessageId);
        this.setParamSimple(map, prefix + "AlarmTime", this.AlarmTime);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "CurRunDate", this.CurRunDate);
        this.setParamSimple(map, prefix + "AlarmReason", this.AlarmReason);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamSimple(map, prefix + "AlarmRuleId", this.AlarmRuleId);
        this.setParamArraySimple(map, prefix + "AlarmWays.", this.AlarmWays);
        this.setParamArraySimple(map, prefix + "AlarmRecipients.", this.AlarmRecipients);

    }
}

