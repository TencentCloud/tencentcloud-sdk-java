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

public class AlarmInfo extends AbstractModel{

    /**
    * 关联任务id
    */
    @SerializedName("TaskIds")
    @Expose
    private String TaskIds;

    /**
    * 告警类别；failure表示失败告警；overtime表示超时告警
    */
    @SerializedName("AlarmType")
    @Expose
    private String AlarmType;

    /**
    * 告警方式；SMS表示短信；Email表示邮件；HTTP 表示接口方式；Wechat表示微信方式
    */
    @SerializedName("AlarmWay")
    @Expose
    private String AlarmWay;

    /**
    * 告警接收人，多个告警接收人以;分割
    */
    @SerializedName("AlarmRecipient")
    @Expose
    private String AlarmRecipient;

    /**
    * 告警接收人id，多个告警接收人id以;分割
    */
    @SerializedName("AlarmRecipientId")
    @Expose
    private String AlarmRecipientId;

    /**
    * 预计运行的小时，取值范围0-23
    */
    @SerializedName("Hours")
    @Expose
    private Long Hours;

    /**
    * 预计运行分钟，取值范围0-59
    */
    @SerializedName("Minutes")
    @Expose
    private Long Minutes;

    /**
    * 告警出发时机；1表示第一次运行失败；2表示所有重试完成后失败；
    */
    @SerializedName("TriggerType")
    @Expose
    private Long TriggerType;

    /**
    * 告警信息id
    */
    @SerializedName("AlarmId")
    @Expose
    private String AlarmId;

    /**
    * 告警状态设置；1表示可用；0表示不可用，默认可用
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 关联任务id 
     * @return TaskIds 关联任务id
     */
    public String getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set 关联任务id
     * @param TaskIds 关联任务id
     */
    public void setTaskIds(String TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get 告警类别；failure表示失败告警；overtime表示超时告警 
     * @return AlarmType 告警类别；failure表示失败告警；overtime表示超时告警
     */
    public String getAlarmType() {
        return this.AlarmType;
    }

    /**
     * Set 告警类别；failure表示失败告警；overtime表示超时告警
     * @param AlarmType 告警类别；failure表示失败告警；overtime表示超时告警
     */
    public void setAlarmType(String AlarmType) {
        this.AlarmType = AlarmType;
    }

    /**
     * Get 告警方式；SMS表示短信；Email表示邮件；HTTP 表示接口方式；Wechat表示微信方式 
     * @return AlarmWay 告警方式；SMS表示短信；Email表示邮件；HTTP 表示接口方式；Wechat表示微信方式
     */
    public String getAlarmWay() {
        return this.AlarmWay;
    }

    /**
     * Set 告警方式；SMS表示短信；Email表示邮件；HTTP 表示接口方式；Wechat表示微信方式
     * @param AlarmWay 告警方式；SMS表示短信；Email表示邮件；HTTP 表示接口方式；Wechat表示微信方式
     */
    public void setAlarmWay(String AlarmWay) {
        this.AlarmWay = AlarmWay;
    }

    /**
     * Get 告警接收人，多个告警接收人以;分割 
     * @return AlarmRecipient 告警接收人，多个告警接收人以;分割
     */
    public String getAlarmRecipient() {
        return this.AlarmRecipient;
    }

    /**
     * Set 告警接收人，多个告警接收人以;分割
     * @param AlarmRecipient 告警接收人，多个告警接收人以;分割
     */
    public void setAlarmRecipient(String AlarmRecipient) {
        this.AlarmRecipient = AlarmRecipient;
    }

    /**
     * Get 告警接收人id，多个告警接收人id以;分割 
     * @return AlarmRecipientId 告警接收人id，多个告警接收人id以;分割
     */
    public String getAlarmRecipientId() {
        return this.AlarmRecipientId;
    }

    /**
     * Set 告警接收人id，多个告警接收人id以;分割
     * @param AlarmRecipientId 告警接收人id，多个告警接收人id以;分割
     */
    public void setAlarmRecipientId(String AlarmRecipientId) {
        this.AlarmRecipientId = AlarmRecipientId;
    }

    /**
     * Get 预计运行的小时，取值范围0-23 
     * @return Hours 预计运行的小时，取值范围0-23
     */
    public Long getHours() {
        return this.Hours;
    }

    /**
     * Set 预计运行的小时，取值范围0-23
     * @param Hours 预计运行的小时，取值范围0-23
     */
    public void setHours(Long Hours) {
        this.Hours = Hours;
    }

    /**
     * Get 预计运行分钟，取值范围0-59 
     * @return Minutes 预计运行分钟，取值范围0-59
     */
    public Long getMinutes() {
        return this.Minutes;
    }

    /**
     * Set 预计运行分钟，取值范围0-59
     * @param Minutes 预计运行分钟，取值范围0-59
     */
    public void setMinutes(Long Minutes) {
        this.Minutes = Minutes;
    }

    /**
     * Get 告警出发时机；1表示第一次运行失败；2表示所有重试完成后失败； 
     * @return TriggerType 告警出发时机；1表示第一次运行失败；2表示所有重试完成后失败；
     */
    public Long getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set 告警出发时机；1表示第一次运行失败；2表示所有重试完成后失败；
     * @param TriggerType 告警出发时机；1表示第一次运行失败；2表示所有重试完成后失败；
     */
    public void setTriggerType(Long TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get 告警信息id 
     * @return AlarmId 告警信息id
     */
    public String getAlarmId() {
        return this.AlarmId;
    }

    /**
     * Set 告警信息id
     * @param AlarmId 告警信息id
     */
    public void setAlarmId(String AlarmId) {
        this.AlarmId = AlarmId;
    }

    /**
     * Get 告警状态设置；1表示可用；0表示不可用，默认可用 
     * @return Status 告警状态设置；1表示可用；0表示不可用，默认可用
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 告警状态设置；1表示可用；0表示不可用，默认可用
     * @param Status 告警状态设置；1表示可用；0表示不可用，默认可用
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public AlarmInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmInfo(AlarmInfo source) {
        if (source.TaskIds != null) {
            this.TaskIds = new String(source.TaskIds);
        }
        if (source.AlarmType != null) {
            this.AlarmType = new String(source.AlarmType);
        }
        if (source.AlarmWay != null) {
            this.AlarmWay = new String(source.AlarmWay);
        }
        if (source.AlarmRecipient != null) {
            this.AlarmRecipient = new String(source.AlarmRecipient);
        }
        if (source.AlarmRecipientId != null) {
            this.AlarmRecipientId = new String(source.AlarmRecipientId);
        }
        if (source.Hours != null) {
            this.Hours = new Long(source.Hours);
        }
        if (source.Minutes != null) {
            this.Minutes = new Long(source.Minutes);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new Long(source.TriggerType);
        }
        if (source.AlarmId != null) {
            this.AlarmId = new String(source.AlarmId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskIds", this.TaskIds);
        this.setParamSimple(map, prefix + "AlarmType", this.AlarmType);
        this.setParamSimple(map, prefix + "AlarmWay", this.AlarmWay);
        this.setParamSimple(map, prefix + "AlarmRecipient", this.AlarmRecipient);
        this.setParamSimple(map, prefix + "AlarmRecipientId", this.AlarmRecipientId);
        this.setParamSimple(map, prefix + "Hours", this.Hours);
        this.setParamSimple(map, prefix + "Minutes", this.Minutes);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "AlarmId", this.AlarmId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

