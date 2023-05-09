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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanTaskInfo extends AbstractModel{

    /**
    * 任务日志Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务日志名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 任务状态码：1等待开始  2正在扫描  3扫描出错 4扫描完成
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 任务进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 对应的展示时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTime")
    @Expose
    private String TaskTime;

    /**
    * 报表id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReportId")
    @Expose
    private String ReportId;

    /**
    * 报表名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReportName")
    @Expose
    private String ReportName;

    /**
    * 扫描计划，0-周期任务,1-立即扫描,2-定时扫描,3-自定义
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanPlan")
    @Expose
    private Long ScanPlan;

    /**
    * 关联的资产数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetCount")
    @Expose
    private Long AssetCount;

    /**
    * APP ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 用户主账户ID
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
     * Get 任务日志Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务日志Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务日志Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务日志Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务日志名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName 任务日志名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务日志名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName 任务日志名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 任务状态码：1等待开始  2正在扫描  3扫描出错 4扫描完成
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 任务状态码：1等待开始  2正在扫描  3扫描出错 4扫描完成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态码：1等待开始  2正在扫描  3扫描出错 4扫描完成
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 任务状态码：1等待开始  2正在扫描  3扫描出错 4扫描完成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 任务进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Progress 任务进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 任务进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Progress 任务进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 对应的展示时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTime 对应的展示时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskTime() {
        return this.TaskTime;
    }

    /**
     * Set 对应的展示时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTime 对应的展示时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTime(String TaskTime) {
        this.TaskTime = TaskTime;
    }

    /**
     * Get 报表id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReportId 报表id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReportId() {
        return this.ReportId;
    }

    /**
     * Set 报表id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReportId 报表id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReportId(String ReportId) {
        this.ReportId = ReportId;
    }

    /**
     * Get 报表名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReportName 报表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReportName() {
        return this.ReportName;
    }

    /**
     * Set 报表名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReportName 报表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReportName(String ReportName) {
        this.ReportName = ReportName;
    }

    /**
     * Get 扫描计划，0-周期任务,1-立即扫描,2-定时扫描,3-自定义
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanPlan 扫描计划，0-周期任务,1-立即扫描,2-定时扫描,3-自定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScanPlan() {
        return this.ScanPlan;
    }

    /**
     * Set 扫描计划，0-周期任务,1-立即扫描,2-定时扫描,3-自定义
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanPlan 扫描计划，0-周期任务,1-立即扫描,2-定时扫描,3-自定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanPlan(Long ScanPlan) {
        this.ScanPlan = ScanPlan;
    }

    /**
     * Get 关联的资产数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetCount 关联的资产数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAssetCount() {
        return this.AssetCount;
    }

    /**
     * Set 关联的资产数
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetCount 关联的资产数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetCount(Long AssetCount) {
        this.AssetCount = AssetCount;
    }

    /**
     * Get APP ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId APP ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set APP ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId APP ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 用户主账户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UIN 用户主账户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUIN() {
        return this.UIN;
    }

    /**
     * Set 用户主账户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UIN 用户主账户ID
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

    public ScanTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanTaskInfo(ScanTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.TaskTime != null) {
            this.TaskTime = new String(source.TaskTime);
        }
        if (source.ReportId != null) {
            this.ReportId = new String(source.ReportId);
        }
        if (source.ReportName != null) {
            this.ReportName = new String(source.ReportName);
        }
        if (source.ScanPlan != null) {
            this.ScanPlan = new Long(source.ScanPlan);
        }
        if (source.AssetCount != null) {
            this.AssetCount = new Long(source.AssetCount);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "TaskTime", this.TaskTime);
        this.setParamSimple(map, prefix + "ReportId", this.ReportId);
        this.setParamSimple(map, prefix + "ReportName", this.ReportName);
        this.setParamSimple(map, prefix + "ScanPlan", this.ScanPlan);
        this.setParamSimple(map, prefix + "AssetCount", this.AssetCount);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "UIN", this.UIN);
        this.setParamSimple(map, prefix + "UserName", this.UserName);

    }
}

