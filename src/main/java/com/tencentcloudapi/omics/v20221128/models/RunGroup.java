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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunGroup extends AbstractModel {

    /**
    * 任务批次ID。
    */
    @SerializedName("RunGroupId")
    @Expose
    private String RunGroupId;

    /**
    * 项目ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 项目名称。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 应用ID。
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 应用名称。
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * 应用类型。
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
    * 应用版本。
    */
    @SerializedName("ApplicationVersion")
    @Expose
    private ApplicationVersion ApplicationVersion;

    /**
    * 应用访问类型：
- PRIVATE 私有应用
- PUBLIC 公共应用
    */
    @SerializedName("AccessMode")
    @Expose
    private String AccessMode;

    /**
    * 环境ID。
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 环境名称。
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * 表格ID，单例运行为空。
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * 任务名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 任务描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 任务状态。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务批次类型 ：
- WDL
- NEXTFLOW
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 工作目录。
    */
    @SerializedName("WorkDir")
    @Expose
    private String WorkDir;

    /**
    * 任务输入。
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
    * 任务输入类型：
- JSON: 导入JSON
- MANUAL: 手动输入
- COS: COS文件
    */
    @SerializedName("InputType")
    @Expose
    private String InputType;

    /**
    * 输入COS地址。
    */
    @SerializedName("InputCosUri")
    @Expose
    private String InputCosUri;

    /**
    * 输入模版ID。
    */
    @SerializedName("InputTemplateId")
    @Expose
    private String InputTemplateId;

    /**
    * WDL运行选项。
    */
    @SerializedName("Option")
    @Expose
    private RunOption Option;

    /**
    * Nextflow运行选项。
    */
    @SerializedName("NFOption")
    @Expose
    private NFOption NFOption;

    /**
    * 使用的缓存卷。
    */
    @SerializedName("Volumes")
    @Expose
    private VolumeInfo [] Volumes;

    /**
    * 任务总数量。
    */
    @SerializedName("TotalRun")
    @Expose
    private Long TotalRun;

    /**
    * 各状态任务的数量。
    */
    @SerializedName("RunStatusCounts")
    @Expose
    private RunStatusCount [] RunStatusCounts;

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
    * 运行结果通知方式。
    */
    @SerializedName("ResultNotify")
    @Expose
    private String ResultNotify;

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
    * 创建者。
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 创建者ID。
    */
    @SerializedName("CreatorId")
    @Expose
    private String CreatorId;

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
     * Get 项目名称。 
     * @return ProjectName 项目名称。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称。
     * @param ProjectName 项目名称。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
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
     * Get 应用名称。 
     * @return ApplicationName 应用名称。
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set 应用名称。
     * @param ApplicationName 应用名称。
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get 应用类型。 
     * @return ApplicationType 应用类型。
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set 应用类型。
     * @param ApplicationType 应用类型。
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get 应用版本。 
     * @return ApplicationVersion 应用版本。
     */
    public ApplicationVersion getApplicationVersion() {
        return this.ApplicationVersion;
    }

    /**
     * Set 应用版本。
     * @param ApplicationVersion 应用版本。
     */
    public void setApplicationVersion(ApplicationVersion ApplicationVersion) {
        this.ApplicationVersion = ApplicationVersion;
    }

    /**
     * Get 应用访问类型：
- PRIVATE 私有应用
- PUBLIC 公共应用 
     * @return AccessMode 应用访问类型：
- PRIVATE 私有应用
- PUBLIC 公共应用
     */
    public String getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set 应用访问类型：
- PRIVATE 私有应用
- PUBLIC 公共应用
     * @param AccessMode 应用访问类型：
- PRIVATE 私有应用
- PUBLIC 公共应用
     */
    public void setAccessMode(String AccessMode) {
        this.AccessMode = AccessMode;
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
     * Get 环境名称。 
     * @return EnvironmentName 环境名称。
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set 环境名称。
     * @param EnvironmentName 环境名称。
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get 表格ID，单例运行为空。 
     * @return TableId 表格ID，单例运行为空。
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set 表格ID，单例运行为空。
     * @param TableId 表格ID，单例运行为空。
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get 任务名称。 
     * @return Name 任务名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 任务名称。
     * @param Name 任务名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 任务描述。 
     * @return Description 任务描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 任务描述。
     * @param Description 任务描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get 任务批次类型 ：
- WDL
- NEXTFLOW 
     * @return Type 任务批次类型 ：
- WDL
- NEXTFLOW
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 任务批次类型 ：
- WDL
- NEXTFLOW
     * @param Type 任务批次类型 ：
- WDL
- NEXTFLOW
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 工作目录。 
     * @return WorkDir 工作目录。
     */
    public String getWorkDir() {
        return this.WorkDir;
    }

    /**
     * Set 工作目录。
     * @param WorkDir 工作目录。
     */
    public void setWorkDir(String WorkDir) {
        this.WorkDir = WorkDir;
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
     * Get 任务输入类型：
- JSON: 导入JSON
- MANUAL: 手动输入
- COS: COS文件 
     * @return InputType 任务输入类型：
- JSON: 导入JSON
- MANUAL: 手动输入
- COS: COS文件
     */
    public String getInputType() {
        return this.InputType;
    }

    /**
     * Set 任务输入类型：
- JSON: 导入JSON
- MANUAL: 手动输入
- COS: COS文件
     * @param InputType 任务输入类型：
- JSON: 导入JSON
- MANUAL: 手动输入
- COS: COS文件
     */
    public void setInputType(String InputType) {
        this.InputType = InputType;
    }

    /**
     * Get 输入COS地址。 
     * @return InputCosUri 输入COS地址。
     */
    public String getInputCosUri() {
        return this.InputCosUri;
    }

    /**
     * Set 输入COS地址。
     * @param InputCosUri 输入COS地址。
     */
    public void setInputCosUri(String InputCosUri) {
        this.InputCosUri = InputCosUri;
    }

    /**
     * Get 输入模版ID。 
     * @return InputTemplateId 输入模版ID。
     */
    public String getInputTemplateId() {
        return this.InputTemplateId;
    }

    /**
     * Set 输入模版ID。
     * @param InputTemplateId 输入模版ID。
     */
    public void setInputTemplateId(String InputTemplateId) {
        this.InputTemplateId = InputTemplateId;
    }

    /**
     * Get WDL运行选项。 
     * @return Option WDL运行选项。
     */
    public RunOption getOption() {
        return this.Option;
    }

    /**
     * Set WDL运行选项。
     * @param Option WDL运行选项。
     */
    public void setOption(RunOption Option) {
        this.Option = Option;
    }

    /**
     * Get Nextflow运行选项。 
     * @return NFOption Nextflow运行选项。
     */
    public NFOption getNFOption() {
        return this.NFOption;
    }

    /**
     * Set Nextflow运行选项。
     * @param NFOption Nextflow运行选项。
     */
    public void setNFOption(NFOption NFOption) {
        this.NFOption = NFOption;
    }

    /**
     * Get 使用的缓存卷。 
     * @return Volumes 使用的缓存卷。
     */
    public VolumeInfo [] getVolumes() {
        return this.Volumes;
    }

    /**
     * Set 使用的缓存卷。
     * @param Volumes 使用的缓存卷。
     */
    public void setVolumes(VolumeInfo [] Volumes) {
        this.Volumes = Volumes;
    }

    /**
     * Get 任务总数量。 
     * @return TotalRun 任务总数量。
     */
    public Long getTotalRun() {
        return this.TotalRun;
    }

    /**
     * Set 任务总数量。
     * @param TotalRun 任务总数量。
     */
    public void setTotalRun(Long TotalRun) {
        this.TotalRun = TotalRun;
    }

    /**
     * Get 各状态任务的数量。 
     * @return RunStatusCounts 各状态任务的数量。
     */
    public RunStatusCount [] getRunStatusCounts() {
        return this.RunStatusCounts;
    }

    /**
     * Set 各状态任务的数量。
     * @param RunStatusCounts 各状态任务的数量。
     */
    public void setRunStatusCounts(RunStatusCount [] RunStatusCounts) {
        this.RunStatusCounts = RunStatusCounts;
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
     * Get 运行结果通知方式。 
     * @return ResultNotify 运行结果通知方式。
     */
    public String getResultNotify() {
        return this.ResultNotify;
    }

    /**
     * Set 运行结果通知方式。
     * @param ResultNotify 运行结果通知方式。
     */
    public void setResultNotify(String ResultNotify) {
        this.ResultNotify = ResultNotify;
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

    /**
     * Get 创建者。 
     * @return Creator 创建者。
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建者。
     * @param Creator 创建者。
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 创建者ID。 
     * @return CreatorId 创建者ID。
     */
    public String getCreatorId() {
        return this.CreatorId;
    }

    /**
     * Set 创建者ID。
     * @param CreatorId 创建者ID。
     */
    public void setCreatorId(String CreatorId) {
        this.CreatorId = CreatorId;
    }

    public RunGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunGroup(RunGroup source) {
        if (source.RunGroupId != null) {
            this.RunGroupId = new String(source.RunGroupId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new String(source.ApplicationType);
        }
        if (source.ApplicationVersion != null) {
            this.ApplicationVersion = new ApplicationVersion(source.ApplicationVersion);
        }
        if (source.AccessMode != null) {
            this.AccessMode = new String(source.AccessMode);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.WorkDir != null) {
            this.WorkDir = new String(source.WorkDir);
        }
        if (source.Input != null) {
            this.Input = new String(source.Input);
        }
        if (source.InputType != null) {
            this.InputType = new String(source.InputType);
        }
        if (source.InputCosUri != null) {
            this.InputCosUri = new String(source.InputCosUri);
        }
        if (source.InputTemplateId != null) {
            this.InputTemplateId = new String(source.InputTemplateId);
        }
        if (source.Option != null) {
            this.Option = new RunOption(source.Option);
        }
        if (source.NFOption != null) {
            this.NFOption = new NFOption(source.NFOption);
        }
        if (source.Volumes != null) {
            this.Volumes = new VolumeInfo[source.Volumes.length];
            for (int i = 0; i < source.Volumes.length; i++) {
                this.Volumes[i] = new VolumeInfo(source.Volumes[i]);
            }
        }
        if (source.TotalRun != null) {
            this.TotalRun = new Long(source.TotalRun);
        }
        if (source.RunStatusCounts != null) {
            this.RunStatusCounts = new RunStatusCount[source.RunStatusCounts.length];
            for (int i = 0; i < source.RunStatusCounts.length; i++) {
                this.RunStatusCounts[i] = new RunStatusCount(source.RunStatusCounts[i]);
            }
        }
        if (source.ExecutionTime != null) {
            this.ExecutionTime = new ExecutionTime(source.ExecutionTime);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.ResultNotify != null) {
            this.ResultNotify = new String(source.ResultNotify);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreatorId != null) {
            this.CreatorId = new String(source.CreatorId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RunGroupId", this.RunGroupId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamObj(map, prefix + "ApplicationVersion.", this.ApplicationVersion);
        this.setParamSimple(map, prefix + "AccessMode", this.AccessMode);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "WorkDir", this.WorkDir);
        this.setParamSimple(map, prefix + "Input", this.Input);
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamSimple(map, prefix + "InputCosUri", this.InputCosUri);
        this.setParamSimple(map, prefix + "InputTemplateId", this.InputTemplateId);
        this.setParamObj(map, prefix + "Option.", this.Option);
        this.setParamObj(map, prefix + "NFOption.", this.NFOption);
        this.setParamArrayObj(map, prefix + "Volumes.", this.Volumes);
        this.setParamSimple(map, prefix + "TotalRun", this.TotalRun);
        this.setParamArrayObj(map, prefix + "RunStatusCounts.", this.RunStatusCounts);
        this.setParamObj(map, prefix + "ExecutionTime.", this.ExecutionTime);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "ResultNotify", this.ResultNotify);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreatorId", this.CreatorId);

    }
}

