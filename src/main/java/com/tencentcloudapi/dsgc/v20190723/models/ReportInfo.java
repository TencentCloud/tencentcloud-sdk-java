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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReportInfo extends AbstractModel {

    /**
    * 任务id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 报告名称
    */
    @SerializedName("ReportName")
    @Expose
    private String ReportName;

    /**
    * 报告类型（AssetSorting:资产梳理）
    */
    @SerializedName("ReportType")
    @Expose
    private String ReportType;

    /**
    * 报告周期（0单次 1每天 2每周 3每月）
    */
    @SerializedName("ReportPeriod")
    @Expose
    private Long ReportPeriod;

    /**
    * 执行计划 （0:单次报告 1:定时报告）
    */
    @SerializedName("ReportPlan")
    @Expose
    private Long ReportPlan;

    /**
    * 报告导出状态（Success 成功, Failed 失败, InProgress 进行中）
    */
    @SerializedName("ReportStatus")
    @Expose
    private String ReportStatus;

    /**
    * 任务下次启动时间
    */
    @SerializedName("TimingStartTime")
    @Expose
    private String TimingStartTime;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 完成时间
    */
    @SerializedName("FinishedTime")
    @Expose
    private String FinishedTime;

    /**
    * 子账号uin
    */
    @SerializedName("SubUin")
    @Expose
    private String SubUin;

    /**
    * 失败信息
    */
    @SerializedName("FailedMessage")
    @Expose
    private String FailedMessage;

    /**
    * 是否启用（0：否 1：是）
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 识别模板名称
    */
    @SerializedName("ComplianceName")
    @Expose
    private String ComplianceName;

    /**
    * 进度百分比
    */
    @SerializedName("ProgressPercent")
    @Expose
    private Long ProgressPercent;

    /**
    * 报告模板名称
    */
    @SerializedName("ReportTemplateName")
    @Expose
    private String ReportTemplateName;

    /**
     * Get 任务id 
     * @return Id 任务id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 任务id
     * @param Id 任务id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 报告名称 
     * @return ReportName 报告名称
     */
    public String getReportName() {
        return this.ReportName;
    }

    /**
     * Set 报告名称
     * @param ReportName 报告名称
     */
    public void setReportName(String ReportName) {
        this.ReportName = ReportName;
    }

    /**
     * Get 报告类型（AssetSorting:资产梳理） 
     * @return ReportType 报告类型（AssetSorting:资产梳理）
     */
    public String getReportType() {
        return this.ReportType;
    }

    /**
     * Set 报告类型（AssetSorting:资产梳理）
     * @param ReportType 报告类型（AssetSorting:资产梳理）
     */
    public void setReportType(String ReportType) {
        this.ReportType = ReportType;
    }

    /**
     * Get 报告周期（0单次 1每天 2每周 3每月） 
     * @return ReportPeriod 报告周期（0单次 1每天 2每周 3每月）
     */
    public Long getReportPeriod() {
        return this.ReportPeriod;
    }

    /**
     * Set 报告周期（0单次 1每天 2每周 3每月）
     * @param ReportPeriod 报告周期（0单次 1每天 2每周 3每月）
     */
    public void setReportPeriod(Long ReportPeriod) {
        this.ReportPeriod = ReportPeriod;
    }

    /**
     * Get 执行计划 （0:单次报告 1:定时报告） 
     * @return ReportPlan 执行计划 （0:单次报告 1:定时报告）
     */
    public Long getReportPlan() {
        return this.ReportPlan;
    }

    /**
     * Set 执行计划 （0:单次报告 1:定时报告）
     * @param ReportPlan 执行计划 （0:单次报告 1:定时报告）
     */
    public void setReportPlan(Long ReportPlan) {
        this.ReportPlan = ReportPlan;
    }

    /**
     * Get 报告导出状态（Success 成功, Failed 失败, InProgress 进行中） 
     * @return ReportStatus 报告导出状态（Success 成功, Failed 失败, InProgress 进行中）
     */
    public String getReportStatus() {
        return this.ReportStatus;
    }

    /**
     * Set 报告导出状态（Success 成功, Failed 失败, InProgress 进行中）
     * @param ReportStatus 报告导出状态（Success 成功, Failed 失败, InProgress 进行中）
     */
    public void setReportStatus(String ReportStatus) {
        this.ReportStatus = ReportStatus;
    }

    /**
     * Get 任务下次启动时间 
     * @return TimingStartTime 任务下次启动时间
     */
    public String getTimingStartTime() {
        return this.TimingStartTime;
    }

    /**
     * Set 任务下次启动时间
     * @param TimingStartTime 任务下次启动时间
     */
    public void setTimingStartTime(String TimingStartTime) {
        this.TimingStartTime = TimingStartTime;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 完成时间 
     * @return FinishedTime 完成时间
     */
    public String getFinishedTime() {
        return this.FinishedTime;
    }

    /**
     * Set 完成时间
     * @param FinishedTime 完成时间
     */
    public void setFinishedTime(String FinishedTime) {
        this.FinishedTime = FinishedTime;
    }

    /**
     * Get 子账号uin 
     * @return SubUin 子账号uin
     */
    public String getSubUin() {
        return this.SubUin;
    }

    /**
     * Set 子账号uin
     * @param SubUin 子账号uin
     */
    public void setSubUin(String SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get 失败信息 
     * @return FailedMessage 失败信息
     */
    public String getFailedMessage() {
        return this.FailedMessage;
    }

    /**
     * Set 失败信息
     * @param FailedMessage 失败信息
     */
    public void setFailedMessage(String FailedMessage) {
        this.FailedMessage = FailedMessage;
    }

    /**
     * Get 是否启用（0：否 1：是） 
     * @return Enable 是否启用（0：否 1：是）
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否启用（0：否 1：是）
     * @param Enable 是否启用（0：否 1：是）
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 识别模板名称 
     * @return ComplianceName 识别模板名称
     */
    public String getComplianceName() {
        return this.ComplianceName;
    }

    /**
     * Set 识别模板名称
     * @param ComplianceName 识别模板名称
     */
    public void setComplianceName(String ComplianceName) {
        this.ComplianceName = ComplianceName;
    }

    /**
     * Get 进度百分比 
     * @return ProgressPercent 进度百分比
     */
    public Long getProgressPercent() {
        return this.ProgressPercent;
    }

    /**
     * Set 进度百分比
     * @param ProgressPercent 进度百分比
     */
    public void setProgressPercent(Long ProgressPercent) {
        this.ProgressPercent = ProgressPercent;
    }

    /**
     * Get 报告模板名称 
     * @return ReportTemplateName 报告模板名称
     */
    public String getReportTemplateName() {
        return this.ReportTemplateName;
    }

    /**
     * Set 报告模板名称
     * @param ReportTemplateName 报告模板名称
     */
    public void setReportTemplateName(String ReportTemplateName) {
        this.ReportTemplateName = ReportTemplateName;
    }

    public ReportInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportInfo(ReportInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ReportName != null) {
            this.ReportName = new String(source.ReportName);
        }
        if (source.ReportType != null) {
            this.ReportType = new String(source.ReportType);
        }
        if (source.ReportPeriod != null) {
            this.ReportPeriod = new Long(source.ReportPeriod);
        }
        if (source.ReportPlan != null) {
            this.ReportPlan = new Long(source.ReportPlan);
        }
        if (source.ReportStatus != null) {
            this.ReportStatus = new String(source.ReportStatus);
        }
        if (source.TimingStartTime != null) {
            this.TimingStartTime = new String(source.TimingStartTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.FinishedTime != null) {
            this.FinishedTime = new String(source.FinishedTime);
        }
        if (source.SubUin != null) {
            this.SubUin = new String(source.SubUin);
        }
        if (source.FailedMessage != null) {
            this.FailedMessage = new String(source.FailedMessage);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.ComplianceName != null) {
            this.ComplianceName = new String(source.ComplianceName);
        }
        if (source.ProgressPercent != null) {
            this.ProgressPercent = new Long(source.ProgressPercent);
        }
        if (source.ReportTemplateName != null) {
            this.ReportTemplateName = new String(source.ReportTemplateName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ReportName", this.ReportName);
        this.setParamSimple(map, prefix + "ReportType", this.ReportType);
        this.setParamSimple(map, prefix + "ReportPeriod", this.ReportPeriod);
        this.setParamSimple(map, prefix + "ReportPlan", this.ReportPlan);
        this.setParamSimple(map, prefix + "ReportStatus", this.ReportStatus);
        this.setParamSimple(map, prefix + "TimingStartTime", this.TimingStartTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "FinishedTime", this.FinishedTime);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "FailedMessage", this.FailedMessage);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "ComplianceName", this.ComplianceName);
        this.setParamSimple(map, prefix + "ProgressPercent", this.ProgressPercent);
        this.setParamSimple(map, prefix + "ReportTemplateName", this.ReportTemplateName);

    }
}

