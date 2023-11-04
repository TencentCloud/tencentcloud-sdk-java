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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskLogInfo extends AbstractModel {

    /**
    * 报告名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskLogName")
    @Expose
    private String TaskLogName;

    /**
    * 报告ID
    */
    @SerializedName("TaskLogId")
    @Expose
    private String TaskLogId;

    /**
    * 关联资产个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetsNumber")
    @Expose
    private Long AssetsNumber;

    /**
    * 安全风险数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskNumber")
    @Expose
    private Long RiskNumber;

    /**
    * 报告生成时间,任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 任务状态码：0 初始值  1正在扫描  2扫描完成  3扫描出错，4停止，5暂停，6该任务已被重启过
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 关联任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 扫描开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 任务中心扫描任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskCenterTaskId")
    @Expose
    private String TaskCenterTaskId;

    /**
    * 租户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 主账户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UIN")
    @Expose
    private String UIN;

    /**
    * 用户名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 报告类型： 1安全体检 2日报 3周报 4月报
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReportType")
    @Expose
    private Long ReportType;

    /**
    * 报告模板id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
     * Get 报告名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskLogName 报告名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskLogName() {
        return this.TaskLogName;
    }

    /**
     * Set 报告名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskLogName 报告名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskLogName(String TaskLogName) {
        this.TaskLogName = TaskLogName;
    }

    /**
     * Get 报告ID 
     * @return TaskLogId 报告ID
     */
    public String getTaskLogId() {
        return this.TaskLogId;
    }

    /**
     * Set 报告ID
     * @param TaskLogId 报告ID
     */
    public void setTaskLogId(String TaskLogId) {
        this.TaskLogId = TaskLogId;
    }

    /**
     * Get 关联资产个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetsNumber 关联资产个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAssetsNumber() {
        return this.AssetsNumber;
    }

    /**
     * Set 关联资产个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetsNumber 关联资产个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetsNumber(Long AssetsNumber) {
        this.AssetsNumber = AssetsNumber;
    }

    /**
     * Get 安全风险数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskNumber 安全风险数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRiskNumber() {
        return this.RiskNumber;
    }

    /**
     * Set 安全风险数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskNumber 安全风险数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskNumber(Long RiskNumber) {
        this.RiskNumber = RiskNumber;
    }

    /**
     * Get 报告生成时间,任务结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Time 报告生成时间,任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 报告生成时间,任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Time 报告生成时间,任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 任务状态码：0 初始值  1正在扫描  2扫描完成  3扫描出错，4停止，5暂停，6该任务已被重启过
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 任务状态码：0 初始值  1正在扫描  2扫描完成  3扫描出错，4停止，5暂停，6该任务已被重启过
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态码：0 初始值  1正在扫描  2扫描完成  3扫描出错，4停止，5暂停，6该任务已被重启过
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 任务状态码：0 初始值  1正在扫描  2扫描完成  3扫描出错，4停止，5暂停，6该任务已被重启过
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 关联任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName 关联任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 关联任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName 关联任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 扫描开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 扫描开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 扫描开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 扫描开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务中心扫描任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskCenterTaskId 任务中心扫描任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskCenterTaskId() {
        return this.TaskCenterTaskId;
    }

    /**
     * Set 任务中心扫描任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskCenterTaskId 任务中心扫描任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskCenterTaskId(String TaskCenterTaskId) {
        this.TaskCenterTaskId = TaskCenterTaskId;
    }

    /**
     * Get 租户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 租户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 租户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 租户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 主账户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UIN 主账户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUIN() {
        return this.UIN;
    }

    /**
     * Set 主账户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UIN 主账户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUIN(String UIN) {
        this.UIN = UIN;
    }

    /**
     * Get 用户名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName 用户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName 用户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 报告类型： 1安全体检 2日报 3周报 4月报
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReportType 报告类型： 1安全体检 2日报 3周报 4月报
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReportType() {
        return this.ReportType;
    }

    /**
     * Set 报告类型： 1安全体检 2日报 3周报 4月报
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReportType 报告类型： 1安全体检 2日报 3周报 4月报
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReportType(Long ReportType) {
        this.ReportType = ReportType;
    }

    /**
     * Get 报告模板id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateId 报告模板id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 报告模板id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateId 报告模板id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    public TaskLogInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskLogInfo(TaskLogInfo source) {
        if (source.TaskLogName != null) {
            this.TaskLogName = new String(source.TaskLogName);
        }
        if (source.TaskLogId != null) {
            this.TaskLogId = new String(source.TaskLogId);
        }
        if (source.AssetsNumber != null) {
            this.AssetsNumber = new Long(source.AssetsNumber);
        }
        if (source.RiskNumber != null) {
            this.RiskNumber = new Long(source.RiskNumber);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.TaskCenterTaskId != null) {
            this.TaskCenterTaskId = new String(source.TaskCenterTaskId);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.UIN != null) {
            this.UIN = new String(source.UIN);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.ReportType != null) {
            this.ReportType = new Long(source.ReportType);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskLogName", this.TaskLogName);
        this.setParamSimple(map, prefix + "TaskLogId", this.TaskLogId);
        this.setParamSimple(map, prefix + "AssetsNumber", this.AssetsNumber);
        this.setParamSimple(map, prefix + "RiskNumber", this.RiskNumber);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "TaskCenterTaskId", this.TaskCenterTaskId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "UIN", this.UIN);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "ReportType", this.ReportType);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}

