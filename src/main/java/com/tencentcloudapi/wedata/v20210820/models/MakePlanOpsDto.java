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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MakePlanOpsDto extends AbstractModel{

    /**
    * 补录计划ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * 补录计划名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MakeName")
    @Expose
    private String MakeName;

    /**
    * 项目ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 补录是否检查父任务状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckParent")
    @Expose
    private Boolean CheckParent;

    /**
    * 是否使用任务原有自依赖配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SameSelfDependType")
    @Expose
    private Boolean SameSelfDependType;

    /**
    * 并行度，在SameSelfDependType为false时生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParallelNum")
    @Expose
    private Long ParallelNum;

    /**
    * 补录实例生成周期是否修改
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SameCycle")
    @Expose
    private Boolean SameCycle;

    /**
    * 调度周期转换方式-原始周期类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceTaskCycle")
    @Expose
    private String SourceTaskCycle;

    /**
    * 调度周期转换方式-目标周期类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetTaskCycle")
    @Expose
    private String TargetTaskCycle;

    /**
    * 调度周期转换方式-目标周期类型指定时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetTaskAction")
    @Expose
    private Long TargetTaskAction;

    /**
    * 补录实例自定义参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MapParamList")
    @Expose
    private StrToStrMap [] MapParamList;

    /**
    * 创建人ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatorId")
    @Expose
    private String CreatorId;

    /**
    * 创建人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 补录任务ID集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskIdList")
    @Expose
    private String [] TaskIdList;

    /**
    * 补录计划日期范围
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MakeDatetimeList")
    @Expose
    private CreateMakeDatetimeInfo [] MakeDatetimeList;

    /**
    * 补录计划说明
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 补录指定的调度资源组（ID）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchedulerResourceGroup")
    @Expose
    private String SchedulerResourceGroup;

    /**
    * 补录指定的调度资源组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchedulerResourceGroupName")
    @Expose
    private String SchedulerResourceGroupName;

    /**
    * 补录指定的集成资源组（ID）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntegrationResourceGroup")
    @Expose
    private String IntegrationResourceGroup;

    /**
    * 补录指定的集成资源组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntegrationResourceGroupName")
    @Expose
    private String IntegrationResourceGroupName;

    /**
    * 补录计划任务数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskCount")
    @Expose
    private Long TaskCount;

    /**
    * 补录计划实例完成百分数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompletePercent")
    @Expose
    private Long CompletePercent;

    /**
    * 补录计划实例成功百分数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessPercent")
    @Expose
    private Long SuccessPercent;

    /**
    * 补录检查父任务类型。取值范围：
<li> NONE: 全部不检查 </li>
<li> ALL: 检查全部上游父任务 </li>
<li> MAKE_SCOPE: 只在（当前补录计划）选中任务中检查 </li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckParentType")
    @Expose
    private String CheckParentType;

    /**
     * Get 补录计划ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlanId 补录计划ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set 补录计划ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlanId 补录计划ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get 补录计划名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MakeName 补录计划名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMakeName() {
        return this.MakeName;
    }

    /**
     * Set 补录计划名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param MakeName 补录计划名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMakeName(String MakeName) {
        this.MakeName = MakeName;
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
     * Get 补录是否检查父任务状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckParent 补录是否检查父任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCheckParent() {
        return this.CheckParent;
    }

    /**
     * Set 补录是否检查父任务状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckParent 补录是否检查父任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckParent(Boolean CheckParent) {
        this.CheckParent = CheckParent;
    }

    /**
     * Get 是否使用任务原有自依赖配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SameSelfDependType 是否使用任务原有自依赖配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSameSelfDependType() {
        return this.SameSelfDependType;
    }

    /**
     * Set 是否使用任务原有自依赖配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param SameSelfDependType 是否使用任务原有自依赖配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSameSelfDependType(Boolean SameSelfDependType) {
        this.SameSelfDependType = SameSelfDependType;
    }

    /**
     * Get 并行度，在SameSelfDependType为false时生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParallelNum 并行度，在SameSelfDependType为false时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getParallelNum() {
        return this.ParallelNum;
    }

    /**
     * Set 并行度，在SameSelfDependType为false时生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParallelNum 并行度，在SameSelfDependType为false时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParallelNum(Long ParallelNum) {
        this.ParallelNum = ParallelNum;
    }

    /**
     * Get 补录实例生成周期是否修改
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SameCycle 补录实例生成周期是否修改
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSameCycle() {
        return this.SameCycle;
    }

    /**
     * Set 补录实例生成周期是否修改
注意：此字段可能返回 null，表示取不到有效值。
     * @param SameCycle 补录实例生成周期是否修改
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSameCycle(Boolean SameCycle) {
        this.SameCycle = SameCycle;
    }

    /**
     * Get 调度周期转换方式-原始周期类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceTaskCycle 调度周期转换方式-原始周期类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceTaskCycle() {
        return this.SourceTaskCycle;
    }

    /**
     * Set 调度周期转换方式-原始周期类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceTaskCycle 调度周期转换方式-原始周期类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceTaskCycle(String SourceTaskCycle) {
        this.SourceTaskCycle = SourceTaskCycle;
    }

    /**
     * Get 调度周期转换方式-目标周期类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetTaskCycle 调度周期转换方式-目标周期类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetTaskCycle() {
        return this.TargetTaskCycle;
    }

    /**
     * Set 调度周期转换方式-目标周期类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetTaskCycle 调度周期转换方式-目标周期类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetTaskCycle(String TargetTaskCycle) {
        this.TargetTaskCycle = TargetTaskCycle;
    }

    /**
     * Get 调度周期转换方式-目标周期类型指定时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetTaskAction 调度周期转换方式-目标周期类型指定时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTargetTaskAction() {
        return this.TargetTaskAction;
    }

    /**
     * Set 调度周期转换方式-目标周期类型指定时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetTaskAction 调度周期转换方式-目标周期类型指定时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetTaskAction(Long TargetTaskAction) {
        this.TargetTaskAction = TargetTaskAction;
    }

    /**
     * Get 补录实例自定义参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MapParamList 补录实例自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StrToStrMap [] getMapParamList() {
        return this.MapParamList;
    }

    /**
     * Set 补录实例自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MapParamList 补录实例自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMapParamList(StrToStrMap [] MapParamList) {
        this.MapParamList = MapParamList;
    }

    /**
     * Get 创建人ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatorId 创建人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatorId() {
        return this.CreatorId;
    }

    /**
     * Set 创建人ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatorId 创建人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatorId(String CreatorId) {
        this.CreatorId = CreatorId;
    }

    /**
     * Get 创建人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Creator 创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建人
注意：此字段可能返回 null，表示取不到有效值。
     * @param Creator 创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
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
     * Get 补录任务ID集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskIdList 补录任务ID集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTaskIdList() {
        return this.TaskIdList;
    }

    /**
     * Set 补录任务ID集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskIdList 补录任务ID集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskIdList(String [] TaskIdList) {
        this.TaskIdList = TaskIdList;
    }

    /**
     * Get 补录计划日期范围
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MakeDatetimeList 补录计划日期范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CreateMakeDatetimeInfo [] getMakeDatetimeList() {
        return this.MakeDatetimeList;
    }

    /**
     * Set 补录计划日期范围
注意：此字段可能返回 null，表示取不到有效值。
     * @param MakeDatetimeList 补录计划日期范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMakeDatetimeList(CreateMakeDatetimeInfo [] MakeDatetimeList) {
        this.MakeDatetimeList = MakeDatetimeList;
    }

    /**
     * Get 补录计划说明
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 补录计划说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 补录计划说明
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 补录计划说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 补录指定的调度资源组（ID）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchedulerResourceGroup 补录指定的调度资源组（ID）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchedulerResourceGroup() {
        return this.SchedulerResourceGroup;
    }

    /**
     * Set 补录指定的调度资源组（ID）
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchedulerResourceGroup 补录指定的调度资源组（ID）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchedulerResourceGroup(String SchedulerResourceGroup) {
        this.SchedulerResourceGroup = SchedulerResourceGroup;
    }

    /**
     * Get 补录指定的调度资源组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchedulerResourceGroupName 补录指定的调度资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchedulerResourceGroupName() {
        return this.SchedulerResourceGroupName;
    }

    /**
     * Set 补录指定的调度资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchedulerResourceGroupName 补录指定的调度资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchedulerResourceGroupName(String SchedulerResourceGroupName) {
        this.SchedulerResourceGroupName = SchedulerResourceGroupName;
    }

    /**
     * Get 补录指定的集成资源组（ID）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntegrationResourceGroup 补录指定的集成资源组（ID）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIntegrationResourceGroup() {
        return this.IntegrationResourceGroup;
    }

    /**
     * Set 补录指定的集成资源组（ID）
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntegrationResourceGroup 补录指定的集成资源组（ID）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntegrationResourceGroup(String IntegrationResourceGroup) {
        this.IntegrationResourceGroup = IntegrationResourceGroup;
    }

    /**
     * Get 补录指定的集成资源组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntegrationResourceGroupName 补录指定的集成资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIntegrationResourceGroupName() {
        return this.IntegrationResourceGroupName;
    }

    /**
     * Set 补录指定的集成资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntegrationResourceGroupName 补录指定的集成资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntegrationResourceGroupName(String IntegrationResourceGroupName) {
        this.IntegrationResourceGroupName = IntegrationResourceGroupName;
    }

    /**
     * Get 补录计划任务数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskCount 补录计划任务数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskCount() {
        return this.TaskCount;
    }

    /**
     * Set 补录计划任务数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskCount 补录计划任务数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskCount(Long TaskCount) {
        this.TaskCount = TaskCount;
    }

    /**
     * Get 补录计划实例完成百分数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompletePercent 补录计划实例完成百分数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCompletePercent() {
        return this.CompletePercent;
    }

    /**
     * Set 补录计划实例完成百分数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompletePercent 补录计划实例完成百分数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompletePercent(Long CompletePercent) {
        this.CompletePercent = CompletePercent;
    }

    /**
     * Get 补录计划实例成功百分数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessPercent 补录计划实例成功百分数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSuccessPercent() {
        return this.SuccessPercent;
    }

    /**
     * Set 补录计划实例成功百分数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessPercent 补录计划实例成功百分数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessPercent(Long SuccessPercent) {
        this.SuccessPercent = SuccessPercent;
    }

    /**
     * Get 补录检查父任务类型。取值范围：
<li> NONE: 全部不检查 </li>
<li> ALL: 检查全部上游父任务 </li>
<li> MAKE_SCOPE: 只在（当前补录计划）选中任务中检查 </li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckParentType 补录检查父任务类型。取值范围：
<li> NONE: 全部不检查 </li>
<li> ALL: 检查全部上游父任务 </li>
<li> MAKE_SCOPE: 只在（当前补录计划）选中任务中检查 </li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCheckParentType() {
        return this.CheckParentType;
    }

    /**
     * Set 补录检查父任务类型。取值范围：
<li> NONE: 全部不检查 </li>
<li> ALL: 检查全部上游父任务 </li>
<li> MAKE_SCOPE: 只在（当前补录计划）选中任务中检查 </li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckParentType 补录检查父任务类型。取值范围：
<li> NONE: 全部不检查 </li>
<li> ALL: 检查全部上游父任务 </li>
<li> MAKE_SCOPE: 只在（当前补录计划）选中任务中检查 </li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckParentType(String CheckParentType) {
        this.CheckParentType = CheckParentType;
    }

    public MakePlanOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MakePlanOpsDto(MakePlanOpsDto source) {
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.MakeName != null) {
            this.MakeName = new String(source.MakeName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CheckParent != null) {
            this.CheckParent = new Boolean(source.CheckParent);
        }
        if (source.SameSelfDependType != null) {
            this.SameSelfDependType = new Boolean(source.SameSelfDependType);
        }
        if (source.ParallelNum != null) {
            this.ParallelNum = new Long(source.ParallelNum);
        }
        if (source.SameCycle != null) {
            this.SameCycle = new Boolean(source.SameCycle);
        }
        if (source.SourceTaskCycle != null) {
            this.SourceTaskCycle = new String(source.SourceTaskCycle);
        }
        if (source.TargetTaskCycle != null) {
            this.TargetTaskCycle = new String(source.TargetTaskCycle);
        }
        if (source.TargetTaskAction != null) {
            this.TargetTaskAction = new Long(source.TargetTaskAction);
        }
        if (source.MapParamList != null) {
            this.MapParamList = new StrToStrMap[source.MapParamList.length];
            for (int i = 0; i < source.MapParamList.length; i++) {
                this.MapParamList[i] = new StrToStrMap(source.MapParamList[i]);
            }
        }
        if (source.CreatorId != null) {
            this.CreatorId = new String(source.CreatorId);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.TaskIdList != null) {
            this.TaskIdList = new String[source.TaskIdList.length];
            for (int i = 0; i < source.TaskIdList.length; i++) {
                this.TaskIdList[i] = new String(source.TaskIdList[i]);
            }
        }
        if (source.MakeDatetimeList != null) {
            this.MakeDatetimeList = new CreateMakeDatetimeInfo[source.MakeDatetimeList.length];
            for (int i = 0; i < source.MakeDatetimeList.length; i++) {
                this.MakeDatetimeList[i] = new CreateMakeDatetimeInfo(source.MakeDatetimeList[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.SchedulerResourceGroup != null) {
            this.SchedulerResourceGroup = new String(source.SchedulerResourceGroup);
        }
        if (source.SchedulerResourceGroupName != null) {
            this.SchedulerResourceGroupName = new String(source.SchedulerResourceGroupName);
        }
        if (source.IntegrationResourceGroup != null) {
            this.IntegrationResourceGroup = new String(source.IntegrationResourceGroup);
        }
        if (source.IntegrationResourceGroupName != null) {
            this.IntegrationResourceGroupName = new String(source.IntegrationResourceGroupName);
        }
        if (source.TaskCount != null) {
            this.TaskCount = new Long(source.TaskCount);
        }
        if (source.CompletePercent != null) {
            this.CompletePercent = new Long(source.CompletePercent);
        }
        if (source.SuccessPercent != null) {
            this.SuccessPercent = new Long(source.SuccessPercent);
        }
        if (source.CheckParentType != null) {
            this.CheckParentType = new String(source.CheckParentType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "MakeName", this.MakeName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CheckParent", this.CheckParent);
        this.setParamSimple(map, prefix + "SameSelfDependType", this.SameSelfDependType);
        this.setParamSimple(map, prefix + "ParallelNum", this.ParallelNum);
        this.setParamSimple(map, prefix + "SameCycle", this.SameCycle);
        this.setParamSimple(map, prefix + "SourceTaskCycle", this.SourceTaskCycle);
        this.setParamSimple(map, prefix + "TargetTaskCycle", this.TargetTaskCycle);
        this.setParamSimple(map, prefix + "TargetTaskAction", this.TargetTaskAction);
        this.setParamArrayObj(map, prefix + "MapParamList.", this.MapParamList);
        this.setParamSimple(map, prefix + "CreatorId", this.CreatorId);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArraySimple(map, prefix + "TaskIdList.", this.TaskIdList);
        this.setParamArrayObj(map, prefix + "MakeDatetimeList.", this.MakeDatetimeList);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "SchedulerResourceGroup", this.SchedulerResourceGroup);
        this.setParamSimple(map, prefix + "SchedulerResourceGroupName", this.SchedulerResourceGroupName);
        this.setParamSimple(map, prefix + "IntegrationResourceGroup", this.IntegrationResourceGroup);
        this.setParamSimple(map, prefix + "IntegrationResourceGroupName", this.IntegrationResourceGroupName);
        this.setParamSimple(map, prefix + "TaskCount", this.TaskCount);
        this.setParamSimple(map, prefix + "CompletePercent", this.CompletePercent);
        this.setParamSimple(map, prefix + "SuccessPercent", this.SuccessPercent);
        this.setParamSimple(map, prefix + "CheckParentType", this.CheckParentType);

    }
}

