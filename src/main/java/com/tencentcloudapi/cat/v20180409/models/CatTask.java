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

public class CatTask extends AbstractModel{

    /**
    * 任务Id
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
    * 拨测类型。http, https, ping, tcp 之一
    */
    @SerializedName("CatTypeName")
    @Expose
    private String CatTypeName;

    /**
    * 拨测任务的Url
    */
    @SerializedName("CgiUrl")
    @Expose
    private String CgiUrl;

    /**
    * 告警的可用率门限(0~100)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvailRatioThres")
    @Expose
    private Long AvailRatioThres;

    /**
    * 告警的可用率持续时间。值为Period的0~4倍
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvailRatioInterval")
    @Expose
    private Long AvailRatioInterval;

    /**
    * 告警接收组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReceiverGroupId")
    @Expose
    private Long ReceiverGroupId;

    /**
    * 拨测分组id
    */
    @SerializedName("AgentGroupId")
    @Expose
    private Long AgentGroupId;

    /**
    * 任务状态。1表示暂停，2表示运行中，0为初始态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 任务创建时间
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 任务更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 任务Id 
     * @return TaskId 任务Id
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务Id
     * @param TaskId 任务Id
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
     * Get 拨测类型。http, https, ping, tcp 之一 
     * @return CatTypeName 拨测类型。http, https, ping, tcp 之一
     */
    public String getCatTypeName() {
        return this.CatTypeName;
    }

    /**
     * Set 拨测类型。http, https, ping, tcp 之一
     * @param CatTypeName 拨测类型。http, https, ping, tcp 之一
     */
    public void setCatTypeName(String CatTypeName) {
        this.CatTypeName = CatTypeName;
    }

    /**
     * Get 拨测任务的Url 
     * @return CgiUrl 拨测任务的Url
     */
    public String getCgiUrl() {
        return this.CgiUrl;
    }

    /**
     * Set 拨测任务的Url
     * @param CgiUrl 拨测任务的Url
     */
    public void setCgiUrl(String CgiUrl) {
        this.CgiUrl = CgiUrl;
    }

    /**
     * Get 告警的可用率门限(0~100)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvailRatioThres 告警的可用率门限(0~100)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAvailRatioThres() {
        return this.AvailRatioThres;
    }

    /**
     * Set 告警的可用率门限(0~100)
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvailRatioThres 告警的可用率门限(0~100)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvailRatioThres(Long AvailRatioThres) {
        this.AvailRatioThres = AvailRatioThres;
    }

    /**
     * Get 告警的可用率持续时间。值为Period的0~4倍
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvailRatioInterval 告警的可用率持续时间。值为Period的0~4倍
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAvailRatioInterval() {
        return this.AvailRatioInterval;
    }

    /**
     * Set 告警的可用率持续时间。值为Period的0~4倍
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvailRatioInterval 告警的可用率持续时间。值为Period的0~4倍
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvailRatioInterval(Long AvailRatioInterval) {
        this.AvailRatioInterval = AvailRatioInterval;
    }

    /**
     * Get 告警接收组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReceiverGroupId 告警接收组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReceiverGroupId() {
        return this.ReceiverGroupId;
    }

    /**
     * Set 告警接收组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReceiverGroupId 告警接收组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceiverGroupId(Long ReceiverGroupId) {
        this.ReceiverGroupId = ReceiverGroupId;
    }

    /**
     * Get 拨测分组id 
     * @return AgentGroupId 拨测分组id
     */
    public Long getAgentGroupId() {
        return this.AgentGroupId;
    }

    /**
     * Set 拨测分组id
     * @param AgentGroupId 拨测分组id
     */
    public void setAgentGroupId(Long AgentGroupId) {
        this.AgentGroupId = AgentGroupId;
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
        this.setParamSimple(map, prefix + "CgiUrl", this.CgiUrl);
        this.setParamSimple(map, prefix + "AvailRatioThres", this.AvailRatioThres);
        this.setParamSimple(map, prefix + "AvailRatioInterval", this.AvailRatioInterval);
        this.setParamSimple(map, prefix + "ReceiverGroupId", this.ReceiverGroupId);
        this.setParamSimple(map, prefix + "AgentGroupId", this.AgentGroupId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

