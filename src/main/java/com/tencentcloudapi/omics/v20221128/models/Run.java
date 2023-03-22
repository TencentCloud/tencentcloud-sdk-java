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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Run extends AbstractModel{

    /**
    * 任务UUID。
    */
    @SerializedName("RunUuid")
    @Expose
    private String RunUuid;

    /**
    * 项目ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 应用ID。
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 任务批次ID。
    */
    @SerializedName("RunGroupId")
    @Expose
    private String RunGroupId;

    /**
    * 环境ID。
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 用户定义ID，单例运行为空。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserDefinedId")
    @Expose
    private String UserDefinedId;

    /**
    * 表格ID，单例运行为空。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * 表格行UUID，单例运行为空。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableRowUuid")
    @Expose
    private String TableRowUuid;

    /**
    * 任务状态。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务输入。
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
    * 运行选项。
    */
    @SerializedName("Option")
    @Expose
    private RunOption Option;

    /**
    * 执行时间。
    */
    @SerializedName("ExecutionTime")
    @Expose
    private ExecutionTime ExecutionTime;

    /**
    * 错误信息。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 任务UUID。 
     * @return RunUuid 任务UUID。
     */
    public String getRunUuid() {
        return this.RunUuid;
    }

    /**
     * Set 任务UUID。
     * @param RunUuid 任务UUID。
     */
    public void setRunUuid(String RunUuid) {
        this.RunUuid = RunUuid;
    }

    /**
     * Get 项目ID。 
     * @return ProjectId 项目ID。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID。
     * @param ProjectId 项目ID。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 应用ID。 
     * @return ApplicationId 应用ID。
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID。
     * @param ApplicationId 应用ID。
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 任务批次ID。 
     * @return RunGroupId 任务批次ID。
     */
    public String getRunGroupId() {
        return this.RunGroupId;
    }

    /**
     * Set 任务批次ID。
     * @param RunGroupId 任务批次ID。
     */
    public void setRunGroupId(String RunGroupId) {
        this.RunGroupId = RunGroupId;
    }

    /**
     * Get 环境ID。 
     * @return EnvironmentId 环境ID。
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 环境ID。
     * @param EnvironmentId 环境ID。
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 用户定义ID，单例运行为空。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserDefinedId 用户定义ID，单例运行为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserDefinedId() {
        return this.UserDefinedId;
    }

    /**
     * Set 用户定义ID，单例运行为空。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserDefinedId 用户定义ID，单例运行为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserDefinedId(String UserDefinedId) {
        this.UserDefinedId = UserDefinedId;
    }

    /**
     * Get 表格ID，单例运行为空。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableId 表格ID，单例运行为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set 表格ID，单例运行为空。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableId 表格ID，单例运行为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get 表格行UUID，单例运行为空。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableRowUuid 表格行UUID，单例运行为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableRowUuid() {
        return this.TableRowUuid;
    }

    /**
     * Set 表格行UUID，单例运行为空。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableRowUuid 表格行UUID，单例运行为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableRowUuid(String TableRowUuid) {
        this.TableRowUuid = TableRowUuid;
    }

    /**
     * Get 任务状态。 
     * @return Status 任务状态。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态。
     * @param Status 任务状态。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务输入。 
     * @return Input 任务输入。
     */
    public String getInput() {
        return this.Input;
    }

    /**
     * Set 任务输入。
     * @param Input 任务输入。
     */
    public void setInput(String Input) {
        this.Input = Input;
    }

    /**
     * Get 运行选项。 
     * @return Option 运行选项。
     */
    public RunOption getOption() {
        return this.Option;
    }

    /**
     * Set 运行选项。
     * @param Option 运行选项。
     */
    public void setOption(RunOption Option) {
        this.Option = Option;
    }

    /**
     * Get 执行时间。 
     * @return ExecutionTime 执行时间。
     */
    public ExecutionTime getExecutionTime() {
        return this.ExecutionTime;
    }

    /**
     * Set 执行时间。
     * @param ExecutionTime 执行时间。
     */
    public void setExecutionTime(ExecutionTime ExecutionTime) {
        this.ExecutionTime = ExecutionTime;
    }

    /**
     * Get 错误信息。 
     * @return ErrorMessage 错误信息。
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 错误信息。
     * @param ErrorMessage 错误信息。
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间。 
     * @return UpdateTime 更新时间。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间。
     * @param UpdateTime 更新时间。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public Run() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Run(Run source) {
        if (source.RunUuid != null) {
            this.RunUuid = new String(source.RunUuid);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.RunGroupId != null) {
            this.RunGroupId = new String(source.RunGroupId);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.UserDefinedId != null) {
            this.UserDefinedId = new String(source.UserDefinedId);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.TableRowUuid != null) {
            this.TableRowUuid = new String(source.TableRowUuid);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Input != null) {
            this.Input = new String(source.Input);
        }
        if (source.Option != null) {
            this.Option = new RunOption(source.Option);
        }
        if (source.ExecutionTime != null) {
            this.ExecutionTime = new ExecutionTime(source.ExecutionTime);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RunUuid", this.RunUuid);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "RunGroupId", this.RunGroupId);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "UserDefinedId", this.UserDefinedId);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "TableRowUuid", this.TableRowUuid);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Input", this.Input);
        this.setParamObj(map, prefix + "Option.", this.Option);
        this.setParamObj(map, prefix + "ExecutionTime.", this.ExecutionTime);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

