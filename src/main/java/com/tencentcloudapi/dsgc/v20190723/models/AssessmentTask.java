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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssessmentTask extends AbstractModel {

    /**
    * 评估任务Id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 评估任务的自增ID

    */
    @SerializedName("TaskUid")
    @Expose
    private Long TaskUid;

    /**
    * 评估任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 业务名称
    */
    @SerializedName("BusinessName")
    @Expose
    private String BusinessName;

    /**
    * 业务所属部门
    */
    @SerializedName("BusinessDept")
    @Expose
    private String BusinessDept;

    /**
    * 业务负责人
    */
    @SerializedName("BusinessOwner")
    @Expose
    private String BusinessOwner;

    /**
    * 评估模板Id
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 评估模板名称
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 分类分级模板Id
    */
    @SerializedName("ComplianceGroupId")
    @Expose
    private Long ComplianceGroupId;

    /**
    * 分类分级模板名称
    */
    @SerializedName("ComplianceGroupName")
    @Expose
    private String ComplianceGroupName;

    /**
    * 评估项数量
    */
    @SerializedName("ControlItemCount")
    @Expose
    private Long ControlItemCount;

    /**
    * 风险项数量（仅状态为finished的风险项不计入总数，其余状态均算入该数量）
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * 评估任务完成时间
    */
    @SerializedName("FinishedTime")
    @Expose
    private String FinishedTime;

    /**
    * 评估任务发起时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 评估状态。(waiting待评估，processing评估中, , finished已评估, failed评估失败)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 待处理各等级风险项信息
    */
    @SerializedName("RiskCountInfoList")
    @Expose
    private RiskCountInfo [] RiskCountInfoList;

    /**
    * 数据源信息
    */
    @SerializedName("DiscoveryCondition")
    @Expose
    private DiscoveryCondition DiscoveryCondition;

    /**
    * 评估任务失败信息
    */
    @SerializedName("ErrorInfo")
    @Expose
    private String ErrorInfo;

    /**
    * 模板主键id
    */
    @SerializedName("TemplateUid")
    @Expose
    private Long TemplateUid;

    /**
    * 进度百分比
    */
    @SerializedName("ProgressPercent")
    @Expose
    private Long ProgressPercent;

    /**
     * Get 评估任务Id 
     * @return TaskId 评估任务Id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 评估任务Id
     * @param TaskId 评估任务Id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 评估任务的自增ID
 
     * @return TaskUid 评估任务的自增ID

     */
    public Long getTaskUid() {
        return this.TaskUid;
    }

    /**
     * Set 评估任务的自增ID

     * @param TaskUid 评估任务的自增ID

     */
    public void setTaskUid(Long TaskUid) {
        this.TaskUid = TaskUid;
    }

    /**
     * Get 评估任务名称 
     * @return TaskName 评估任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 评估任务名称
     * @param TaskName 评估任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 业务名称 
     * @return BusinessName 业务名称
     */
    public String getBusinessName() {
        return this.BusinessName;
    }

    /**
     * Set 业务名称
     * @param BusinessName 业务名称
     */
    public void setBusinessName(String BusinessName) {
        this.BusinessName = BusinessName;
    }

    /**
     * Get 业务所属部门 
     * @return BusinessDept 业务所属部门
     */
    public String getBusinessDept() {
        return this.BusinessDept;
    }

    /**
     * Set 业务所属部门
     * @param BusinessDept 业务所属部门
     */
    public void setBusinessDept(String BusinessDept) {
        this.BusinessDept = BusinessDept;
    }

    /**
     * Get 业务负责人 
     * @return BusinessOwner 业务负责人
     */
    public String getBusinessOwner() {
        return this.BusinessOwner;
    }

    /**
     * Set 业务负责人
     * @param BusinessOwner 业务负责人
     */
    public void setBusinessOwner(String BusinessOwner) {
        this.BusinessOwner = BusinessOwner;
    }

    /**
     * Get 评估模板Id 
     * @return TemplateId 评估模板Id
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 评估模板Id
     * @param TemplateId 评估模板Id
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 评估模板名称 
     * @return TemplateName 评估模板名称
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 评估模板名称
     * @param TemplateName 评估模板名称
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 分类分级模板Id 
     * @return ComplianceGroupId 分类分级模板Id
     */
    public Long getComplianceGroupId() {
        return this.ComplianceGroupId;
    }

    /**
     * Set 分类分级模板Id
     * @param ComplianceGroupId 分类分级模板Id
     */
    public void setComplianceGroupId(Long ComplianceGroupId) {
        this.ComplianceGroupId = ComplianceGroupId;
    }

    /**
     * Get 分类分级模板名称 
     * @return ComplianceGroupName 分类分级模板名称
     */
    public String getComplianceGroupName() {
        return this.ComplianceGroupName;
    }

    /**
     * Set 分类分级模板名称
     * @param ComplianceGroupName 分类分级模板名称
     */
    public void setComplianceGroupName(String ComplianceGroupName) {
        this.ComplianceGroupName = ComplianceGroupName;
    }

    /**
     * Get 评估项数量 
     * @return ControlItemCount 评估项数量
     */
    public Long getControlItemCount() {
        return this.ControlItemCount;
    }

    /**
     * Set 评估项数量
     * @param ControlItemCount 评估项数量
     */
    public void setControlItemCount(Long ControlItemCount) {
        this.ControlItemCount = ControlItemCount;
    }

    /**
     * Get 风险项数量（仅状态为finished的风险项不计入总数，其余状态均算入该数量） 
     * @return RiskCount 风险项数量（仅状态为finished的风险项不计入总数，其余状态均算入该数量）
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set 风险项数量（仅状态为finished的风险项不计入总数，其余状态均算入该数量）
     * @param RiskCount 风险项数量（仅状态为finished的风险项不计入总数，其余状态均算入该数量）
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get 评估任务完成时间 
     * @return FinishedTime 评估任务完成时间
     */
    public String getFinishedTime() {
        return this.FinishedTime;
    }

    /**
     * Set 评估任务完成时间
     * @param FinishedTime 评估任务完成时间
     */
    public void setFinishedTime(String FinishedTime) {
        this.FinishedTime = FinishedTime;
    }

    /**
     * Get 评估任务发起时间 
     * @return CreatedTime 评估任务发起时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 评估任务发起时间
     * @param CreatedTime 评估任务发起时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 评估状态。(waiting待评估，processing评估中, , finished已评估, failed评估失败) 
     * @return Status 评估状态。(waiting待评估，processing评估中, , finished已评估, failed评估失败)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 评估状态。(waiting待评估，processing评估中, , finished已评估, failed评估失败)
     * @param Status 评估状态。(waiting待评估，processing评估中, , finished已评估, failed评估失败)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 待处理各等级风险项信息 
     * @return RiskCountInfoList 待处理各等级风险项信息
     */
    public RiskCountInfo [] getRiskCountInfoList() {
        return this.RiskCountInfoList;
    }

    /**
     * Set 待处理各等级风险项信息
     * @param RiskCountInfoList 待处理各等级风险项信息
     */
    public void setRiskCountInfoList(RiskCountInfo [] RiskCountInfoList) {
        this.RiskCountInfoList = RiskCountInfoList;
    }

    /**
     * Get 数据源信息 
     * @return DiscoveryCondition 数据源信息
     */
    public DiscoveryCondition getDiscoveryCondition() {
        return this.DiscoveryCondition;
    }

    /**
     * Set 数据源信息
     * @param DiscoveryCondition 数据源信息
     */
    public void setDiscoveryCondition(DiscoveryCondition DiscoveryCondition) {
        this.DiscoveryCondition = DiscoveryCondition;
    }

    /**
     * Get 评估任务失败信息 
     * @return ErrorInfo 评估任务失败信息
     */
    public String getErrorInfo() {
        return this.ErrorInfo;
    }

    /**
     * Set 评估任务失败信息
     * @param ErrorInfo 评估任务失败信息
     */
    public void setErrorInfo(String ErrorInfo) {
        this.ErrorInfo = ErrorInfo;
    }

    /**
     * Get 模板主键id 
     * @return TemplateUid 模板主键id
     */
    public Long getTemplateUid() {
        return this.TemplateUid;
    }

    /**
     * Set 模板主键id
     * @param TemplateUid 模板主键id
     */
    public void setTemplateUid(Long TemplateUid) {
        this.TemplateUid = TemplateUid;
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

    public AssessmentTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssessmentTask(AssessmentTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskUid != null) {
            this.TaskUid = new Long(source.TaskUid);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.BusinessName != null) {
            this.BusinessName = new String(source.BusinessName);
        }
        if (source.BusinessDept != null) {
            this.BusinessDept = new String(source.BusinessDept);
        }
        if (source.BusinessOwner != null) {
            this.BusinessOwner = new String(source.BusinessOwner);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.ComplianceGroupId != null) {
            this.ComplianceGroupId = new Long(source.ComplianceGroupId);
        }
        if (source.ComplianceGroupName != null) {
            this.ComplianceGroupName = new String(source.ComplianceGroupName);
        }
        if (source.ControlItemCount != null) {
            this.ControlItemCount = new Long(source.ControlItemCount);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new Long(source.RiskCount);
        }
        if (source.FinishedTime != null) {
            this.FinishedTime = new String(source.FinishedTime);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RiskCountInfoList != null) {
            this.RiskCountInfoList = new RiskCountInfo[source.RiskCountInfoList.length];
            for (int i = 0; i < source.RiskCountInfoList.length; i++) {
                this.RiskCountInfoList[i] = new RiskCountInfo(source.RiskCountInfoList[i]);
            }
        }
        if (source.DiscoveryCondition != null) {
            this.DiscoveryCondition = new DiscoveryCondition(source.DiscoveryCondition);
        }
        if (source.ErrorInfo != null) {
            this.ErrorInfo = new String(source.ErrorInfo);
        }
        if (source.TemplateUid != null) {
            this.TemplateUid = new Long(source.TemplateUid);
        }
        if (source.ProgressPercent != null) {
            this.ProgressPercent = new Long(source.ProgressPercent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskUid", this.TaskUid);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "BusinessName", this.BusinessName);
        this.setParamSimple(map, prefix + "BusinessDept", this.BusinessDept);
        this.setParamSimple(map, prefix + "BusinessOwner", this.BusinessOwner);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "ComplianceGroupId", this.ComplianceGroupId);
        this.setParamSimple(map, prefix + "ComplianceGroupName", this.ComplianceGroupName);
        this.setParamSimple(map, prefix + "ControlItemCount", this.ControlItemCount);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);
        this.setParamSimple(map, prefix + "FinishedTime", this.FinishedTime);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "RiskCountInfoList.", this.RiskCountInfoList);
        this.setParamObj(map, prefix + "DiscoveryCondition.", this.DiscoveryCondition);
        this.setParamSimple(map, prefix + "ErrorInfo", this.ErrorInfo);
        this.setParamSimple(map, prefix + "TemplateUid", this.TemplateUid);
        this.setParamSimple(map, prefix + "ProgressPercent", this.ProgressPercent);

    }
}

