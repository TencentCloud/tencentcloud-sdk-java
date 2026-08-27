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
    * <p>告警消息Id</p>
    */
    @SerializedName("AlarmMessageId")
    @Expose
    private Long AlarmMessageId;

    /**
    * <p>告警时间，同一条告警可能发送多次，只显示最新的告警时间</p>
    */
    @SerializedName("AlarmTime")
    @Expose
    private String AlarmTime;

    /**
    * <p>任务名称</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>任务Id</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务的实例数据时间</p>
    */
    @SerializedName("CurRunDate")
    @Expose
    private String CurRunDate;

    /**
    * <p>告警原因</p>
    */
    @SerializedName("AlarmReason")
    @Expose
    private String AlarmReason;

    /**
    * <p>告警级别，1.普通， 2.重要，3.紧急</p>
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * <p>告警规则Id</p>
    */
    @SerializedName("AlarmRuleId")
    @Expose
    private String AlarmRuleId;

    /**
    * <p>告警渠道 1.邮件，2.短信，3.微信，4.语音，5.企业微信，6.Http，7.企业微信群， 8.飞书群，9.钉钉群，10.Slack群,11.Teams群（默认1.邮件），7.企业微信群，8.飞书群，9.钉钉群，10.Slack群，11.Teams群</p>
    */
    @SerializedName("AlarmWays")
    @Expose
    private String [] AlarmWays;

    /**
    * <p>告警接收人</p>
    */
    @SerializedName("AlarmRecipients")
    @Expose
    private String [] AlarmRecipients;

    /**
    * <p>自定义邮箱列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomEmails")
    @Expose
    private String [] CustomEmails;

    /**
     * Get <p>告警消息Id</p> 
     * @return AlarmMessageId <p>告警消息Id</p>
     */
    public Long getAlarmMessageId() {
        return this.AlarmMessageId;
    }

    /**
     * Set <p>告警消息Id</p>
     * @param AlarmMessageId <p>告警消息Id</p>
     */
    public void setAlarmMessageId(Long AlarmMessageId) {
        this.AlarmMessageId = AlarmMessageId;
    }

    /**
     * Get <p>告警时间，同一条告警可能发送多次，只显示最新的告警时间</p> 
     * @return AlarmTime <p>告警时间，同一条告警可能发送多次，只显示最新的告警时间</p>
     */
    public String getAlarmTime() {
        return this.AlarmTime;
    }

    /**
     * Set <p>告警时间，同一条告警可能发送多次，只显示最新的告警时间</p>
     * @param AlarmTime <p>告警时间，同一条告警可能发送多次，只显示最新的告警时间</p>
     */
    public void setAlarmTime(String AlarmTime) {
        this.AlarmTime = AlarmTime;
    }

    /**
     * Get <p>任务名称</p> 
     * @return TaskName <p>任务名称</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名称</p>
     * @param TaskName <p>任务名称</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>任务Id</p> 
     * @return TaskId <p>任务Id</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务Id</p>
     * @param TaskId <p>任务Id</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务的实例数据时间</p> 
     * @return CurRunDate <p>任务的实例数据时间</p>
     */
    public String getCurRunDate() {
        return this.CurRunDate;
    }

    /**
     * Set <p>任务的实例数据时间</p>
     * @param CurRunDate <p>任务的实例数据时间</p>
     */
    public void setCurRunDate(String CurRunDate) {
        this.CurRunDate = CurRunDate;
    }

    /**
     * Get <p>告警原因</p> 
     * @return AlarmReason <p>告警原因</p>
     */
    public String getAlarmReason() {
        return this.AlarmReason;
    }

    /**
     * Set <p>告警原因</p>
     * @param AlarmReason <p>告警原因</p>
     */
    public void setAlarmReason(String AlarmReason) {
        this.AlarmReason = AlarmReason;
    }

    /**
     * Get <p>告警级别，1.普通， 2.重要，3.紧急</p> 
     * @return AlarmLevel <p>告警级别，1.普通， 2.重要，3.紧急</p>
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set <p>告警级别，1.普通， 2.重要，3.紧急</p>
     * @param AlarmLevel <p>告警级别，1.普通， 2.重要，3.紧急</p>
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get <p>告警规则Id</p> 
     * @return AlarmRuleId <p>告警规则Id</p>
     */
    public String getAlarmRuleId() {
        return this.AlarmRuleId;
    }

    /**
     * Set <p>告警规则Id</p>
     * @param AlarmRuleId <p>告警规则Id</p>
     */
    public void setAlarmRuleId(String AlarmRuleId) {
        this.AlarmRuleId = AlarmRuleId;
    }

    /**
     * Get <p>告警渠道 1.邮件，2.短信，3.微信，4.语音，5.企业微信，6.Http，7.企业微信群， 8.飞书群，9.钉钉群，10.Slack群,11.Teams群（默认1.邮件），7.企业微信群，8.飞书群，9.钉钉群，10.Slack群，11.Teams群</p> 
     * @return AlarmWays <p>告警渠道 1.邮件，2.短信，3.微信，4.语音，5.企业微信，6.Http，7.企业微信群， 8.飞书群，9.钉钉群，10.Slack群,11.Teams群（默认1.邮件），7.企业微信群，8.飞书群，9.钉钉群，10.Slack群，11.Teams群</p>
     */
    public String [] getAlarmWays() {
        return this.AlarmWays;
    }

    /**
     * Set <p>告警渠道 1.邮件，2.短信，3.微信，4.语音，5.企业微信，6.Http，7.企业微信群， 8.飞书群，9.钉钉群，10.Slack群,11.Teams群（默认1.邮件），7.企业微信群，8.飞书群，9.钉钉群，10.Slack群，11.Teams群</p>
     * @param AlarmWays <p>告警渠道 1.邮件，2.短信，3.微信，4.语音，5.企业微信，6.Http，7.企业微信群， 8.飞书群，9.钉钉群，10.Slack群,11.Teams群（默认1.邮件），7.企业微信群，8.飞书群，9.钉钉群，10.Slack群，11.Teams群</p>
     */
    public void setAlarmWays(String [] AlarmWays) {
        this.AlarmWays = AlarmWays;
    }

    /**
     * Get <p>告警接收人</p> 
     * @return AlarmRecipients <p>告警接收人</p>
     */
    public String [] getAlarmRecipients() {
        return this.AlarmRecipients;
    }

    /**
     * Set <p>告警接收人</p>
     * @param AlarmRecipients <p>告警接收人</p>
     */
    public void setAlarmRecipients(String [] AlarmRecipients) {
        this.AlarmRecipients = AlarmRecipients;
    }

    /**
     * Get <p>自定义邮箱列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomEmails <p>自定义邮箱列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCustomEmails() {
        return this.CustomEmails;
    }

    /**
     * Set <p>自定义邮箱列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomEmails <p>自定义邮箱列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomEmails(String [] CustomEmails) {
        this.CustomEmails = CustomEmails;
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
        if (source.CustomEmails != null) {
            this.CustomEmails = new String[source.CustomEmails.length];
            for (int i = 0; i < source.CustomEmails.length; i++) {
                this.CustomEmails[i] = new String(source.CustomEmails[i]);
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
        this.setParamArraySimple(map, prefix + "CustomEmails.", this.CustomEmails);

    }
}

