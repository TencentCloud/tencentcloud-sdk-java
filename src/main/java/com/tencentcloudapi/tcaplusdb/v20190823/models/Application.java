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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Application extends AbstractModel{

    /**
    * 审批单号
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 申请类型
    */
    @SerializedName("ApplicationType")
    @Expose
    private Long ApplicationType;

    /**
    * 集群Id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 表格组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableGroupName")
    @Expose
    private String TableGroupName;

    /**
    * 表格名称
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 申请人
    */
    @SerializedName("Applicant")
    @Expose
    private String Applicant;

    /**
    * 建单时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 处理状态 -1 撤回 0-待审核 1-已经审核并提交任务 2-已驳回
    */
    @SerializedName("ApplicationStatus")
    @Expose
    private Long ApplicationStatus;

    /**
    * 表格组Id
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
    * 已提交的任务Id，未提交申请为0
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 腾讯云上table的唯一键
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableInstanceId")
    @Expose
    private String TableInstanceId;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 审批人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecuteUser")
    @Expose
    private String ExecuteUser;

    /**
    * 执行状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecuteStatus")
    @Expose
    private String ExecuteStatus;

    /**
    * 该申请单是否可以被当前用户审批
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CanCensor")
    @Expose
    private Boolean CanCensor;

    /**
    * 该申请单是否可以被当前用户撤回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CanWithdrawal")
    @Expose
    private Boolean CanWithdrawal;

    /**
     * Get 审批单号 
     * @return ApplicationId 审批单号
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 审批单号
     * @param ApplicationId 审批单号
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 申请类型 
     * @return ApplicationType 申请类型
     */
    public Long getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set 申请类型
     * @param ApplicationType 申请类型
     */
    public void setApplicationType(Long ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get 集群Id 
     * @return ClusterId 集群Id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群Id
     * @param ClusterId 集群Id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群名称 
     * @return ClusterName 集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
     * @param ClusterName 集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 表格组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableGroupName 表格组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableGroupName() {
        return this.TableGroupName;
    }

    /**
     * Set 表格组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableGroupName 表格组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableGroupName(String TableGroupName) {
        this.TableGroupName = TableGroupName;
    }

    /**
     * Get 表格名称 
     * @return TableName 表格名称
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表格名称
     * @param TableName 表格名称
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 申请人 
     * @return Applicant 申请人
     */
    public String getApplicant() {
        return this.Applicant;
    }

    /**
     * Set 申请人
     * @param Applicant 申请人
     */
    public void setApplicant(String Applicant) {
        this.Applicant = Applicant;
    }

    /**
     * Get 建单时间 
     * @return CreatedTime 建单时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 建单时间
     * @param CreatedTime 建单时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 处理状态 -1 撤回 0-待审核 1-已经审核并提交任务 2-已驳回 
     * @return ApplicationStatus 处理状态 -1 撤回 0-待审核 1-已经审核并提交任务 2-已驳回
     */
    public Long getApplicationStatus() {
        return this.ApplicationStatus;
    }

    /**
     * Set 处理状态 -1 撤回 0-待审核 1-已经审核并提交任务 2-已驳回
     * @param ApplicationStatus 处理状态 -1 撤回 0-待审核 1-已经审核并提交任务 2-已驳回
     */
    public void setApplicationStatus(Long ApplicationStatus) {
        this.ApplicationStatus = ApplicationStatus;
    }

    /**
     * Get 表格组Id 
     * @return TableGroupId 表格组Id
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set 表格组Id
     * @param TableGroupId 表格组Id
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Get 已提交的任务Id，未提交申请为0 
     * @return TaskId 已提交的任务Id，未提交申请为0
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 已提交的任务Id，未提交申请为0
     * @param TaskId 已提交的任务Id，未提交申请为0
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 腾讯云上table的唯一键
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableInstanceId 腾讯云上table的唯一键
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableInstanceId() {
        return this.TableInstanceId;
    }

    /**
     * Set 腾讯云上table的唯一键
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableInstanceId 腾讯云上table的唯一键
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableInstanceId(String TableInstanceId) {
        this.TableInstanceId = TableInstanceId;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 审批人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecuteUser 审批人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecuteUser() {
        return this.ExecuteUser;
    }

    /**
     * Set 审批人
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecuteUser 审批人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecuteUser(String ExecuteUser) {
        this.ExecuteUser = ExecuteUser;
    }

    /**
     * Get 执行状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecuteStatus 执行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecuteStatus() {
        return this.ExecuteStatus;
    }

    /**
     * Set 执行状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecuteStatus 执行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecuteStatus(String ExecuteStatus) {
        this.ExecuteStatus = ExecuteStatus;
    }

    /**
     * Get 该申请单是否可以被当前用户审批
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CanCensor 该申请单是否可以被当前用户审批
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCanCensor() {
        return this.CanCensor;
    }

    /**
     * Set 该申请单是否可以被当前用户审批
注意：此字段可能返回 null，表示取不到有效值。
     * @param CanCensor 该申请单是否可以被当前用户审批
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCanCensor(Boolean CanCensor) {
        this.CanCensor = CanCensor;
    }

    /**
     * Get 该申请单是否可以被当前用户撤回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CanWithdrawal 该申请单是否可以被当前用户撤回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCanWithdrawal() {
        return this.CanWithdrawal;
    }

    /**
     * Set 该申请单是否可以被当前用户撤回
注意：此字段可能返回 null，表示取不到有效值。
     * @param CanWithdrawal 该申请单是否可以被当前用户撤回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCanWithdrawal(Boolean CanWithdrawal) {
        this.CanWithdrawal = CanWithdrawal;
    }

    public Application() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Application(Application source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new Long(source.ApplicationType);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.TableGroupName != null) {
            this.TableGroupName = new String(source.TableGroupName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.Applicant != null) {
            this.Applicant = new String(source.Applicant);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ApplicationStatus != null) {
            this.ApplicationStatus = new Long(source.ApplicationStatus);
        }
        if (source.TableGroupId != null) {
            this.TableGroupId = new String(source.TableGroupId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TableInstanceId != null) {
            this.TableInstanceId = new String(source.TableInstanceId);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ExecuteUser != null) {
            this.ExecuteUser = new String(source.ExecuteUser);
        }
        if (source.ExecuteStatus != null) {
            this.ExecuteStatus = new String(source.ExecuteStatus);
        }
        if (source.CanCensor != null) {
            this.CanCensor = new Boolean(source.CanCensor);
        }
        if (source.CanWithdrawal != null) {
            this.CanWithdrawal = new Boolean(source.CanWithdrawal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "TableGroupName", this.TableGroupName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "Applicant", this.Applicant);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ApplicationStatus", this.ApplicationStatus);
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TableInstanceId", this.TableInstanceId);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ExecuteUser", this.ExecuteUser);
        this.setParamSimple(map, prefix + "ExecuteStatus", this.ExecuteStatus);
        this.setParamSimple(map, prefix + "CanCensor", this.CanCensor);
        this.setParamSimple(map, prefix + "CanWithdrawal", this.CanWithdrawal);

    }
}

