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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskAlarm extends AbstractModel{

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 任务周期，单位为分钟。目前支持1，5，15，30几种取值
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 拨测类型。http, https, ping, tcp, udp, smtp, pop3, dns 之一
    */
    @SerializedName("CatTypeName")
    @Expose
    private String CatTypeName;

    /**
    * 任务状态。1表示暂停，2表示运行中，0为初始态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 拨测任务的URL
    */
    @SerializedName("CgiUrl")
    @Expose
    private String CgiUrl;

    /**
    * 任务创建时间
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 告警状态。1 故障，0 正常
    */
    @SerializedName("AlarmStatus")
    @Expose
    private Long AlarmStatus;

    /**
    * 告警状态描述，统计信息
    */
    @SerializedName("StatusInfo")
    @Expose
    private String StatusInfo;

    /**
    * 任务更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
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
     * Get 任务周期，单位为分钟。目前支持1，5，15，30几种取值 
     * @return Period 任务周期，单位为分钟。目前支持1，5，15，30几种取值
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 任务周期，单位为分钟。目前支持1，5，15，30几种取值
     * @param Period 任务周期，单位为分钟。目前支持1，5，15，30几种取值
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 拨测类型。http, https, ping, tcp, udp, smtp, pop3, dns 之一 
     * @return CatTypeName 拨测类型。http, https, ping, tcp, udp, smtp, pop3, dns 之一
     */
    public String getCatTypeName() {
        return this.CatTypeName;
    }

    /**
     * Set 拨测类型。http, https, ping, tcp, udp, smtp, pop3, dns 之一
     * @param CatTypeName 拨测类型。http, https, ping, tcp, udp, smtp, pop3, dns 之一
     */
    public void setCatTypeName(String CatTypeName) {
        this.CatTypeName = CatTypeName;
    }

    /**
     * Get 任务状态。1表示暂停，2表示运行中，0为初始态 
     * @return Status 任务状态。1表示暂停，2表示运行中，0为初始态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态。1表示暂停，2表示运行中，0为初始态
     * @param Status 任务状态。1表示暂停，2表示运行中，0为初始态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 拨测任务的URL 
     * @return CgiUrl 拨测任务的URL
     */
    public String getCgiUrl() {
        return this.CgiUrl;
    }

    /**
     * Set 拨测任务的URL
     * @param CgiUrl 拨测任务的URL
     */
    public void setCgiUrl(String CgiUrl) {
        this.CgiUrl = CgiUrl;
    }

    /**
     * Get 任务创建时间 
     * @return AddTime 任务创建时间
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set 任务创建时间
     * @param AddTime 任务创建时间
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get 告警状态。1 故障，0 正常 
     * @return AlarmStatus 告警状态。1 故障，0 正常
     */
    public Long getAlarmStatus() {
        return this.AlarmStatus;
    }

    /**
     * Set 告警状态。1 故障，0 正常
     * @param AlarmStatus 告警状态。1 故障，0 正常
     */
    public void setAlarmStatus(Long AlarmStatus) {
        this.AlarmStatus = AlarmStatus;
    }

    /**
     * Get 告警状态描述，统计信息 
     * @return StatusInfo 告警状态描述，统计信息
     */
    public String getStatusInfo() {
        return this.StatusInfo;
    }

    /**
     * Set 告警状态描述，统计信息
     * @param StatusInfo 告警状态描述，统计信息
     */
    public void setStatusInfo(String StatusInfo) {
        this.StatusInfo = StatusInfo;
    }

    /**
     * Get 任务更新时间 
     * @return UpdateTime 任务更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 任务更新时间
     * @param UpdateTime 任务更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "CatTypeName", this.CatTypeName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CgiUrl", this.CgiUrl);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "AlarmStatus", this.AlarmStatus);
        this.setParamSimple(map, prefix + "StatusInfo", this.StatusInfo);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

