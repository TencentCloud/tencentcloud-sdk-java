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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManualTriggerRecordOpsDto extends AbstractModel {

    /**
    * 运行触发记录ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerId")
    @Expose
    private String TriggerId;

    /**
    * 用户提交运行时配置的运行名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerName")
    @Expose
    private String TriggerName;

    /**
    * 用户提交运行的备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 数据时间列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatetimeList")
    @Expose
    private String [] DatetimeList;

    /**
    * 任务数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskCnt")
    @Expose
    private Long TaskCnt;

    /**
    * 实例数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceCnt")
    @Expose
    private Long InstanceCnt;

    /**
    * 已完成的实例数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FinishedInstanceCnt")
    @Expose
    private Long FinishedInstanceCnt;

    /**
    * 成功的实例数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessInstanceCnt")
    @Expose
    private Long SuccessInstanceCnt;

    /**
    * 记录运行状态
 INIT, RUNNING, FINISHED
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 用户提交运行时的入参，主要用于前端反显和记录原始提交信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerParams")
    @Expose
    private String TriggerParams;

    /**
    * 用户主账号ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 用户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
    * 用户展示名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 租户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * 项目ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 数据实例时间的时区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

    /**
     * Get 运行触发记录ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerId 运行触发记录ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerId() {
        return this.TriggerId;
    }

    /**
     * Set 运行触发记录ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerId 运行触发记录ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerId(String TriggerId) {
        this.TriggerId = TriggerId;
    }

    /**
     * Get 用户提交运行时配置的运行名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerName 用户提交运行时配置的运行名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerName() {
        return this.TriggerName;
    }

    /**
     * Set 用户提交运行时配置的运行名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerName 用户提交运行时配置的运行名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerName(String TriggerName) {
        this.TriggerName = TriggerName;
    }

    /**
     * Get 用户提交运行的备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 用户提交运行的备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 用户提交运行的备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 用户提交运行的备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 数据时间列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatetimeList 数据时间列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDatetimeList() {
        return this.DatetimeList;
    }

    /**
     * Set 数据时间列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatetimeList 数据时间列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatetimeList(String [] DatetimeList) {
        this.DatetimeList = DatetimeList;
    }

    /**
     * Get 任务数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskCnt 任务数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskCnt() {
        return this.TaskCnt;
    }

    /**
     * Set 任务数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskCnt 任务数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskCnt(Long TaskCnt) {
        this.TaskCnt = TaskCnt;
    }

    /**
     * Get 实例数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceCnt 实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceCnt() {
        return this.InstanceCnt;
    }

    /**
     * Set 实例数
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceCnt 实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceCnt(Long InstanceCnt) {
        this.InstanceCnt = InstanceCnt;
    }

    /**
     * Get 已完成的实例数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FinishedInstanceCnt 已完成的实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFinishedInstanceCnt() {
        return this.FinishedInstanceCnt;
    }

    /**
     * Set 已完成的实例数
注意：此字段可能返回 null，表示取不到有效值。
     * @param FinishedInstanceCnt 已完成的实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFinishedInstanceCnt(Long FinishedInstanceCnt) {
        this.FinishedInstanceCnt = FinishedInstanceCnt;
    }

    /**
     * Get 成功的实例数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessInstanceCnt 成功的实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSuccessInstanceCnt() {
        return this.SuccessInstanceCnt;
    }

    /**
     * Set 成功的实例数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessInstanceCnt 成功的实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessInstanceCnt(Long SuccessInstanceCnt) {
        this.SuccessInstanceCnt = SuccessInstanceCnt;
    }

    /**
     * Get 记录运行状态
 INIT, RUNNING, FINISHED
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 记录运行状态
 INIT, RUNNING, FINISHED
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 记录运行状态
 INIT, RUNNING, FINISHED
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 记录运行状态
 INIT, RUNNING, FINISHED
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 用户提交运行时的入参，主要用于前端反显和记录原始提交信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerParams 用户提交运行时的入参，主要用于前端反显和记录原始提交信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerParams() {
        return this.TriggerParams;
    }

    /**
     * Set 用户提交运行时的入参，主要用于前端反显和记录原始提交信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerParams 用户提交运行时的入参，主要用于前端反显和记录原始提交信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerParams(String TriggerParams) {
        this.TriggerParams = TriggerParams;
    }

    /**
     * Get 用户主账号ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin 用户主账号ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 用户主账号ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin 用户主账号ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 用户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserUin 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserUin 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    /**
     * Get 用户展示名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName 用户展示名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户展示名
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName 用户展示名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 租户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TenantId 租户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set 租户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TenantId 租户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get 项目ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 数据实例时间的时区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleTimeZone 数据实例时间的时区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduleTimeZone() {
        return this.ScheduleTimeZone;
    }

    /**
     * Set 数据实例时间的时区
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleTimeZone 数据实例时间的时区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleTimeZone(String ScheduleTimeZone) {
        this.ScheduleTimeZone = ScheduleTimeZone;
    }

    public ManualTriggerRecordOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManualTriggerRecordOpsDto(ManualTriggerRecordOpsDto source) {
        if (source.TriggerId != null) {
            this.TriggerId = new String(source.TriggerId);
        }
        if (source.TriggerName != null) {
            this.TriggerName = new String(source.TriggerName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.DatetimeList != null) {
            this.DatetimeList = new String[source.DatetimeList.length];
            for (int i = 0; i < source.DatetimeList.length; i++) {
                this.DatetimeList[i] = new String(source.DatetimeList[i]);
            }
        }
        if (source.TaskCnt != null) {
            this.TaskCnt = new Long(source.TaskCnt);
        }
        if (source.InstanceCnt != null) {
            this.InstanceCnt = new Long(source.InstanceCnt);
        }
        if (source.FinishedInstanceCnt != null) {
            this.FinishedInstanceCnt = new Long(source.FinishedInstanceCnt);
        }
        if (source.SuccessInstanceCnt != null) {
            this.SuccessInstanceCnt = new Long(source.SuccessInstanceCnt);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TriggerParams != null) {
            this.TriggerParams = new String(source.TriggerParams);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ScheduleTimeZone != null) {
            this.ScheduleTimeZone = new String(source.ScheduleTimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TriggerId", this.TriggerId);
        this.setParamSimple(map, prefix + "TriggerName", this.TriggerName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArraySimple(map, prefix + "DatetimeList.", this.DatetimeList);
        this.setParamSimple(map, prefix + "TaskCnt", this.TaskCnt);
        this.setParamSimple(map, prefix + "InstanceCnt", this.InstanceCnt);
        this.setParamSimple(map, prefix + "FinishedInstanceCnt", this.FinishedInstanceCnt);
        this.setParamSimple(map, prefix + "SuccessInstanceCnt", this.SuccessInstanceCnt);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TriggerParams", this.TriggerParams);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ScheduleTimeZone", this.ScheduleTimeZone);

    }
}

