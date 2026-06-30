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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MakePlanOpsDto extends AbstractModel {

    /**
    * <p>补录计划ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * <p>补录计划名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MakeName")
    @Expose
    private String MakeName;

    /**
    * <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>补录是否检查父任务状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckParent")
    @Expose
    private Boolean CheckParent;

    /**
    * <p>是否使用任务原有自依赖配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SameSelfDependType")
    @Expose
    private Boolean SameSelfDependType;

    /**
    * <p>并行度，在SameSelfDependType为false时生效</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParallelNum")
    @Expose
    private Long ParallelNum;

    /**
    * <p>补录实例生成周期是否修改</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SameCycle")
    @Expose
    private Boolean SameCycle;

    /**
    * <p>调度周期转换方式-原始周期类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceTaskCycle")
    @Expose
    private String SourceTaskCycle;

    /**
    * <p>调度周期转换方式-目标周期类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetTaskCycle")
    @Expose
    private String TargetTaskCycle;

    /**
    * <p>调度周期转换方式-目标周期类型指定时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetTaskAction")
    @Expose
    private Long TargetTaskAction;

    /**
    * <p>补录实例自定义参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MapParamList")
    @Expose
    private StrToStrMap [] MapParamList;

    /**
    * <p>补录扩展属性</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MakeExtList")
    @Expose
    private StrToStrMap [] MakeExtList;

    /**
    * <p>创建人ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatorId")
    @Expose
    private String CreatorId;

    /**
    * <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>补录任务ID集合</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskIdList")
    @Expose
    private String [] TaskIdList;

    /**
    * <p>补录计划日期范围</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MakeDatetimeList")
    @Expose
    private CreateMakeDatetimeInfo [] MakeDatetimeList;

    /**
    * <p>补录计划说明</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>补录指定的调度资源组（ID）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchedulerResourceGroup")
    @Expose
    private String SchedulerResourceGroup;

    /**
    * <p>补录指定的调度资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchedulerResourceGroupName")
    @Expose
    private String SchedulerResourceGroupName;

    /**
    * <p>补录指定的集成资源组（ID）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntegrationResourceGroup")
    @Expose
    private String IntegrationResourceGroup;

    /**
    * <p>补录指定的集成资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntegrationResourceGroupName")
    @Expose
    private String IntegrationResourceGroupName;

    /**
    * <p>补录计划任务数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskCount")
    @Expose
    private Long TaskCount;

    /**
    * <p>补录计划实例完成百分数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompletePercent")
    @Expose
    private Long CompletePercent;

    /**
    * <p>补录计划实例成功百分数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessPercent")
    @Expose
    private Long SuccessPercent;

    /**
    * <p>补录检查父任务类型。取值范围：</p><li> NONE: 全部不检查 </li><li> ALL: 检查全部上游父任务 </li><li> MAKE_SCOPE: 只在（当前补录计划）选中任务中检查 </li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckParentType")
    @Expose
    private String CheckParentType;

    /**
    * <p>是否和原任务保持相同工作流自依赖属性</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SameSelfWorkflowDependType")
    @Expose
    private Boolean SameSelfWorkflowDependType;

    /**
    * <p>工作流自依赖类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SelfWorkflowDependency")
    @Expose
    private String SelfWorkflowDependency;

    /**
    * <p>补录时间顺序<br>NORMAL： 正常<br>ORDER ： 按照实例时间顺序执行<br>REVERSE： 实例数据时间逆序</p>
    */
    @SerializedName("MakeDataTimeOrder")
    @Expose
    private String MakeDataTimeOrder;

    /**
    * <p>补录时间范围的时区</p>
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

    /**
    * <p>执行应用参数</p>
    */
    @SerializedName("AppParam")
    @Expose
    private String AppParam;

    /**
    * <p>补录计划时间范围的类型：<br>DATA_TIME：实例数据时间；SCHEDULE_TIME 计划调度时间</p>
    */
    @SerializedName("TimeType")
    @Expose
    private String TimeType;

    /**
    * <p>开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>失败百分比</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailurePercent")
    @Expose
    private Long FailurePercent;

    /**
    * <p>补录计划的告警规则</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmRule")
    @Expose
    private MakePlanAlarmRule AlarmRule;

    /**
    * <p>运行类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunType")
    @Expose
    private Long RunType;

    /**
    * <p>定时运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunDateTime")
    @Expose
    private String RunDateTime;

    /**
    * <p>定时补录计划 或者 指定时间段补录 执行时间点的时区</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunScheduleTimeZone")
    @Expose
    private String RunScheduleTimeZone;

    /**
    * <p>指定时间段补录开始时间</p><p>参数格式：00:00 - 23:59</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunScheduleRangeStartTime")
    @Expose
    private String RunScheduleRangeStartTime;

    /**
    * <p>指定时间段补录结束时间</p><p>参数格式：00:00 - 23:59</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunScheduleRangeEndTime")
    @Expose
    private String RunScheduleRangeEndTime;

    /**
    * <p>指定时间段补录生效日，星期一到星期日，1-7</p><p>枚举值：</p><ul><li>星期一： 1</li><li>星期二： 2</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunScheduleRangeWeekDays")
    @Expose
    private Long [] RunScheduleRangeWeekDays;

    /**
     * Get <p>补录计划ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlanId <p>补录计划ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set <p>补录计划ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlanId <p>补录计划ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get <p>补录计划名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MakeName <p>补录计划名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMakeName() {
        return this.MakeName;
    }

    /**
     * Set <p>补录计划名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MakeName <p>补录计划名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMakeName(String MakeName) {
        this.MakeName = MakeName;
    }

    /**
     * Get <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>补录是否检查父任务状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckParent <p>补录是否检查父任务状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCheckParent() {
        return this.CheckParent;
    }

    /**
     * Set <p>补录是否检查父任务状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckParent <p>补录是否检查父任务状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckParent(Boolean CheckParent) {
        this.CheckParent = CheckParent;
    }

    /**
     * Get <p>是否使用任务原有自依赖配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SameSelfDependType <p>是否使用任务原有自依赖配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSameSelfDependType() {
        return this.SameSelfDependType;
    }

    /**
     * Set <p>是否使用任务原有自依赖配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SameSelfDependType <p>是否使用任务原有自依赖配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSameSelfDependType(Boolean SameSelfDependType) {
        this.SameSelfDependType = SameSelfDependType;
    }

    /**
     * Get <p>并行度，在SameSelfDependType为false时生效</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParallelNum <p>并行度，在SameSelfDependType为false时生效</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getParallelNum() {
        return this.ParallelNum;
    }

    /**
     * Set <p>并行度，在SameSelfDependType为false时生效</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParallelNum <p>并行度，在SameSelfDependType为false时生效</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParallelNum(Long ParallelNum) {
        this.ParallelNum = ParallelNum;
    }

    /**
     * Get <p>补录实例生成周期是否修改</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SameCycle <p>补录实例生成周期是否修改</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSameCycle() {
        return this.SameCycle;
    }

    /**
     * Set <p>补录实例生成周期是否修改</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SameCycle <p>补录实例生成周期是否修改</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSameCycle(Boolean SameCycle) {
        this.SameCycle = SameCycle;
    }

    /**
     * Get <p>调度周期转换方式-原始周期类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceTaskCycle <p>调度周期转换方式-原始周期类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceTaskCycle() {
        return this.SourceTaskCycle;
    }

    /**
     * Set <p>调度周期转换方式-原始周期类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceTaskCycle <p>调度周期转换方式-原始周期类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceTaskCycle(String SourceTaskCycle) {
        this.SourceTaskCycle = SourceTaskCycle;
    }

    /**
     * Get <p>调度周期转换方式-目标周期类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetTaskCycle <p>调度周期转换方式-目标周期类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetTaskCycle() {
        return this.TargetTaskCycle;
    }

    /**
     * Set <p>调度周期转换方式-目标周期类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetTaskCycle <p>调度周期转换方式-目标周期类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetTaskCycle(String TargetTaskCycle) {
        this.TargetTaskCycle = TargetTaskCycle;
    }

    /**
     * Get <p>调度周期转换方式-目标周期类型指定时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetTaskAction <p>调度周期转换方式-目标周期类型指定时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTargetTaskAction() {
        return this.TargetTaskAction;
    }

    /**
     * Set <p>调度周期转换方式-目标周期类型指定时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetTaskAction <p>调度周期转换方式-目标周期类型指定时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetTaskAction(Long TargetTaskAction) {
        this.TargetTaskAction = TargetTaskAction;
    }

    /**
     * Get <p>补录实例自定义参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MapParamList <p>补录实例自定义参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StrToStrMap [] getMapParamList() {
        return this.MapParamList;
    }

    /**
     * Set <p>补录实例自定义参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MapParamList <p>补录实例自定义参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMapParamList(StrToStrMap [] MapParamList) {
        this.MapParamList = MapParamList;
    }

    /**
     * Get <p>补录扩展属性</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MakeExtList <p>补录扩展属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StrToStrMap [] getMakeExtList() {
        return this.MakeExtList;
    }

    /**
     * Set <p>补录扩展属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MakeExtList <p>补录扩展属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMakeExtList(StrToStrMap [] MakeExtList) {
        this.MakeExtList = MakeExtList;
    }

    /**
     * Get <p>创建人ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatorId <p>创建人ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatorId() {
        return this.CreatorId;
    }

    /**
     * Set <p>创建人ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatorId <p>创建人ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatorId(String CreatorId) {
        this.CreatorId = CreatorId;
    }

    /**
     * Get <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Creator <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Creator <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>补录任务ID集合</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskIdList <p>补录任务ID集合</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTaskIdList() {
        return this.TaskIdList;
    }

    /**
     * Set <p>补录任务ID集合</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskIdList <p>补录任务ID集合</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskIdList(String [] TaskIdList) {
        this.TaskIdList = TaskIdList;
    }

    /**
     * Get <p>补录计划日期范围</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MakeDatetimeList <p>补录计划日期范围</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CreateMakeDatetimeInfo [] getMakeDatetimeList() {
        return this.MakeDatetimeList;
    }

    /**
     * Set <p>补录计划日期范围</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MakeDatetimeList <p>补录计划日期范围</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMakeDatetimeList(CreateMakeDatetimeInfo [] MakeDatetimeList) {
        this.MakeDatetimeList = MakeDatetimeList;
    }

    /**
     * Get <p>补录计划说明</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark <p>补录计划说明</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>补录计划说明</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark <p>补录计划说明</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>补录指定的调度资源组（ID）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchedulerResourceGroup <p>补录指定的调度资源组（ID）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchedulerResourceGroup() {
        return this.SchedulerResourceGroup;
    }

    /**
     * Set <p>补录指定的调度资源组（ID）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchedulerResourceGroup <p>补录指定的调度资源组（ID）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchedulerResourceGroup(String SchedulerResourceGroup) {
        this.SchedulerResourceGroup = SchedulerResourceGroup;
    }

    /**
     * Get <p>补录指定的调度资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchedulerResourceGroupName <p>补录指定的调度资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchedulerResourceGroupName() {
        return this.SchedulerResourceGroupName;
    }

    /**
     * Set <p>补录指定的调度资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchedulerResourceGroupName <p>补录指定的调度资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchedulerResourceGroupName(String SchedulerResourceGroupName) {
        this.SchedulerResourceGroupName = SchedulerResourceGroupName;
    }

    /**
     * Get <p>补录指定的集成资源组（ID）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntegrationResourceGroup <p>补录指定的集成资源组（ID）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIntegrationResourceGroup() {
        return this.IntegrationResourceGroup;
    }

    /**
     * Set <p>补录指定的集成资源组（ID）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntegrationResourceGroup <p>补录指定的集成资源组（ID）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntegrationResourceGroup(String IntegrationResourceGroup) {
        this.IntegrationResourceGroup = IntegrationResourceGroup;
    }

    /**
     * Get <p>补录指定的集成资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntegrationResourceGroupName <p>补录指定的集成资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIntegrationResourceGroupName() {
        return this.IntegrationResourceGroupName;
    }

    /**
     * Set <p>补录指定的集成资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntegrationResourceGroupName <p>补录指定的集成资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntegrationResourceGroupName(String IntegrationResourceGroupName) {
        this.IntegrationResourceGroupName = IntegrationResourceGroupName;
    }

    /**
     * Get <p>补录计划任务数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskCount <p>补录计划任务数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskCount() {
        return this.TaskCount;
    }

    /**
     * Set <p>补录计划任务数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskCount <p>补录计划任务数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskCount(Long TaskCount) {
        this.TaskCount = TaskCount;
    }

    /**
     * Get <p>补录计划实例完成百分数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompletePercent <p>补录计划实例完成百分数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCompletePercent() {
        return this.CompletePercent;
    }

    /**
     * Set <p>补录计划实例完成百分数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompletePercent <p>补录计划实例完成百分数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompletePercent(Long CompletePercent) {
        this.CompletePercent = CompletePercent;
    }

    /**
     * Get <p>补录计划实例成功百分数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessPercent <p>补录计划实例成功百分数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSuccessPercent() {
        return this.SuccessPercent;
    }

    /**
     * Set <p>补录计划实例成功百分数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessPercent <p>补录计划实例成功百分数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessPercent(Long SuccessPercent) {
        this.SuccessPercent = SuccessPercent;
    }

    /**
     * Get <p>补录检查父任务类型。取值范围：</p><li> NONE: 全部不检查 </li><li> ALL: 检查全部上游父任务 </li><li> MAKE_SCOPE: 只在（当前补录计划）选中任务中检查 </li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckParentType <p>补录检查父任务类型。取值范围：</p><li> NONE: 全部不检查 </li><li> ALL: 检查全部上游父任务 </li><li> MAKE_SCOPE: 只在（当前补录计划）选中任务中检查 </li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCheckParentType() {
        return this.CheckParentType;
    }

    /**
     * Set <p>补录检查父任务类型。取值范围：</p><li> NONE: 全部不检查 </li><li> ALL: 检查全部上游父任务 </li><li> MAKE_SCOPE: 只在（当前补录计划）选中任务中检查 </li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckParentType <p>补录检查父任务类型。取值范围：</p><li> NONE: 全部不检查 </li><li> ALL: 检查全部上游父任务 </li><li> MAKE_SCOPE: 只在（当前补录计划）选中任务中检查 </li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckParentType(String CheckParentType) {
        this.CheckParentType = CheckParentType;
    }

    /**
     * Get <p>是否和原任务保持相同工作流自依赖属性</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SameSelfWorkflowDependType <p>是否和原任务保持相同工作流自依赖属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSameSelfWorkflowDependType() {
        return this.SameSelfWorkflowDependType;
    }

    /**
     * Set <p>是否和原任务保持相同工作流自依赖属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SameSelfWorkflowDependType <p>是否和原任务保持相同工作流自依赖属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSameSelfWorkflowDependType(Boolean SameSelfWorkflowDependType) {
        this.SameSelfWorkflowDependType = SameSelfWorkflowDependType;
    }

    /**
     * Get <p>工作流自依赖类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SelfWorkflowDependency <p>工作流自依赖类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSelfWorkflowDependency() {
        return this.SelfWorkflowDependency;
    }

    /**
     * Set <p>工作流自依赖类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SelfWorkflowDependency <p>工作流自依赖类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelfWorkflowDependency(String SelfWorkflowDependency) {
        this.SelfWorkflowDependency = SelfWorkflowDependency;
    }

    /**
     * Get <p>补录时间顺序<br>NORMAL： 正常<br>ORDER ： 按照实例时间顺序执行<br>REVERSE： 实例数据时间逆序</p> 
     * @return MakeDataTimeOrder <p>补录时间顺序<br>NORMAL： 正常<br>ORDER ： 按照实例时间顺序执行<br>REVERSE： 实例数据时间逆序</p>
     */
    public String getMakeDataTimeOrder() {
        return this.MakeDataTimeOrder;
    }

    /**
     * Set <p>补录时间顺序<br>NORMAL： 正常<br>ORDER ： 按照实例时间顺序执行<br>REVERSE： 实例数据时间逆序</p>
     * @param MakeDataTimeOrder <p>补录时间顺序<br>NORMAL： 正常<br>ORDER ： 按照实例时间顺序执行<br>REVERSE： 实例数据时间逆序</p>
     */
    public void setMakeDataTimeOrder(String MakeDataTimeOrder) {
        this.MakeDataTimeOrder = MakeDataTimeOrder;
    }

    /**
     * Get <p>补录时间范围的时区</p> 
     * @return ScheduleTimeZone <p>补录时间范围的时区</p>
     */
    public String getScheduleTimeZone() {
        return this.ScheduleTimeZone;
    }

    /**
     * Set <p>补录时间范围的时区</p>
     * @param ScheduleTimeZone <p>补录时间范围的时区</p>
     */
    public void setScheduleTimeZone(String ScheduleTimeZone) {
        this.ScheduleTimeZone = ScheduleTimeZone;
    }

    /**
     * Get <p>执行应用参数</p> 
     * @return AppParam <p>执行应用参数</p>
     */
    public String getAppParam() {
        return this.AppParam;
    }

    /**
     * Set <p>执行应用参数</p>
     * @param AppParam <p>执行应用参数</p>
     */
    public void setAppParam(String AppParam) {
        this.AppParam = AppParam;
    }

    /**
     * Get <p>补录计划时间范围的类型：<br>DATA_TIME：实例数据时间；SCHEDULE_TIME 计划调度时间</p> 
     * @return TimeType <p>补录计划时间范围的类型：<br>DATA_TIME：实例数据时间；SCHEDULE_TIME 计划调度时间</p>
     */
    public String getTimeType() {
        return this.TimeType;
    }

    /**
     * Set <p>补录计划时间范围的类型：<br>DATA_TIME：实例数据时间；SCHEDULE_TIME 计划调度时间</p>
     * @param TimeType <p>补录计划时间范围的类型：<br>DATA_TIME：实例数据时间；SCHEDULE_TIME 计划调度时间</p>
     */
    public void setTimeType(String TimeType) {
        this.TimeType = TimeType;
    }

    /**
     * Get <p>开始时间</p> 
     * @return StartTime <p>开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p>
     * @param StartTime <p>开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间</p> 
     * @return EndTime <p>结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
     * @param EndTime <p>结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>失败百分比</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailurePercent <p>失败百分比</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFailurePercent() {
        return this.FailurePercent;
    }

    /**
     * Set <p>失败百分比</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailurePercent <p>失败百分比</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailurePercent(Long FailurePercent) {
        this.FailurePercent = FailurePercent;
    }

    /**
     * Get <p>补录计划的告警规则</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmRule <p>补录计划的告警规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MakePlanAlarmRule getAlarmRule() {
        return this.AlarmRule;
    }

    /**
     * Set <p>补录计划的告警规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmRule <p>补录计划的告警规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmRule(MakePlanAlarmRule AlarmRule) {
        this.AlarmRule = AlarmRule;
    }

    /**
     * Get <p>运行类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunType <p>运行类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRunType() {
        return this.RunType;
    }

    /**
     * Set <p>运行类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunType <p>运行类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunType(Long RunType) {
        this.RunType = RunType;
    }

    /**
     * Get <p>定时运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunDateTime <p>定时运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunDateTime() {
        return this.RunDateTime;
    }

    /**
     * Set <p>定时运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunDateTime <p>定时运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunDateTime(String RunDateTime) {
        this.RunDateTime = RunDateTime;
    }

    /**
     * Get <p>定时补录计划 或者 指定时间段补录 执行时间点的时区</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunScheduleTimeZone <p>定时补录计划 或者 指定时间段补录 执行时间点的时区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunScheduleTimeZone() {
        return this.RunScheduleTimeZone;
    }

    /**
     * Set <p>定时补录计划 或者 指定时间段补录 执行时间点的时区</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunScheduleTimeZone <p>定时补录计划 或者 指定时间段补录 执行时间点的时区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunScheduleTimeZone(String RunScheduleTimeZone) {
        this.RunScheduleTimeZone = RunScheduleTimeZone;
    }

    /**
     * Get <p>指定时间段补录开始时间</p><p>参数格式：00:00 - 23:59</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunScheduleRangeStartTime <p>指定时间段补录开始时间</p><p>参数格式：00:00 - 23:59</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunScheduleRangeStartTime() {
        return this.RunScheduleRangeStartTime;
    }

    /**
     * Set <p>指定时间段补录开始时间</p><p>参数格式：00:00 - 23:59</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunScheduleRangeStartTime <p>指定时间段补录开始时间</p><p>参数格式：00:00 - 23:59</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunScheduleRangeStartTime(String RunScheduleRangeStartTime) {
        this.RunScheduleRangeStartTime = RunScheduleRangeStartTime;
    }

    /**
     * Get <p>指定时间段补录结束时间</p><p>参数格式：00:00 - 23:59</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunScheduleRangeEndTime <p>指定时间段补录结束时间</p><p>参数格式：00:00 - 23:59</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunScheduleRangeEndTime() {
        return this.RunScheduleRangeEndTime;
    }

    /**
     * Set <p>指定时间段补录结束时间</p><p>参数格式：00:00 - 23:59</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunScheduleRangeEndTime <p>指定时间段补录结束时间</p><p>参数格式：00:00 - 23:59</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunScheduleRangeEndTime(String RunScheduleRangeEndTime) {
        this.RunScheduleRangeEndTime = RunScheduleRangeEndTime;
    }

    /**
     * Get <p>指定时间段补录生效日，星期一到星期日，1-7</p><p>枚举值：</p><ul><li>星期一： 1</li><li>星期二： 2</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunScheduleRangeWeekDays <p>指定时间段补录生效日，星期一到星期日，1-7</p><p>枚举值：</p><ul><li>星期一： 1</li><li>星期二： 2</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getRunScheduleRangeWeekDays() {
        return this.RunScheduleRangeWeekDays;
    }

    /**
     * Set <p>指定时间段补录生效日，星期一到星期日，1-7</p><p>枚举值：</p><ul><li>星期一： 1</li><li>星期二： 2</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunScheduleRangeWeekDays <p>指定时间段补录生效日，星期一到星期日，1-7</p><p>枚举值：</p><ul><li>星期一： 1</li><li>星期二： 2</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunScheduleRangeWeekDays(Long [] RunScheduleRangeWeekDays) {
        this.RunScheduleRangeWeekDays = RunScheduleRangeWeekDays;
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
        if (source.MakeExtList != null) {
            this.MakeExtList = new StrToStrMap[source.MakeExtList.length];
            for (int i = 0; i < source.MakeExtList.length; i++) {
                this.MakeExtList[i] = new StrToStrMap(source.MakeExtList[i]);
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
        if (source.SameSelfWorkflowDependType != null) {
            this.SameSelfWorkflowDependType = new Boolean(source.SameSelfWorkflowDependType);
        }
        if (source.SelfWorkflowDependency != null) {
            this.SelfWorkflowDependency = new String(source.SelfWorkflowDependency);
        }
        if (source.MakeDataTimeOrder != null) {
            this.MakeDataTimeOrder = new String(source.MakeDataTimeOrder);
        }
        if (source.ScheduleTimeZone != null) {
            this.ScheduleTimeZone = new String(source.ScheduleTimeZone);
        }
        if (source.AppParam != null) {
            this.AppParam = new String(source.AppParam);
        }
        if (source.TimeType != null) {
            this.TimeType = new String(source.TimeType);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.FailurePercent != null) {
            this.FailurePercent = new Long(source.FailurePercent);
        }
        if (source.AlarmRule != null) {
            this.AlarmRule = new MakePlanAlarmRule(source.AlarmRule);
        }
        if (source.RunType != null) {
            this.RunType = new Long(source.RunType);
        }
        if (source.RunDateTime != null) {
            this.RunDateTime = new String(source.RunDateTime);
        }
        if (source.RunScheduleTimeZone != null) {
            this.RunScheduleTimeZone = new String(source.RunScheduleTimeZone);
        }
        if (source.RunScheduleRangeStartTime != null) {
            this.RunScheduleRangeStartTime = new String(source.RunScheduleRangeStartTime);
        }
        if (source.RunScheduleRangeEndTime != null) {
            this.RunScheduleRangeEndTime = new String(source.RunScheduleRangeEndTime);
        }
        if (source.RunScheduleRangeWeekDays != null) {
            this.RunScheduleRangeWeekDays = new Long[source.RunScheduleRangeWeekDays.length];
            for (int i = 0; i < source.RunScheduleRangeWeekDays.length; i++) {
                this.RunScheduleRangeWeekDays[i] = new Long(source.RunScheduleRangeWeekDays[i]);
            }
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
        this.setParamArrayObj(map, prefix + "MakeExtList.", this.MakeExtList);
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
        this.setParamSimple(map, prefix + "SameSelfWorkflowDependType", this.SameSelfWorkflowDependType);
        this.setParamSimple(map, prefix + "SelfWorkflowDependency", this.SelfWorkflowDependency);
        this.setParamSimple(map, prefix + "MakeDataTimeOrder", this.MakeDataTimeOrder);
        this.setParamSimple(map, prefix + "ScheduleTimeZone", this.ScheduleTimeZone);
        this.setParamSimple(map, prefix + "AppParam", this.AppParam);
        this.setParamSimple(map, prefix + "TimeType", this.TimeType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "FailurePercent", this.FailurePercent);
        this.setParamObj(map, prefix + "AlarmRule.", this.AlarmRule);
        this.setParamSimple(map, prefix + "RunType", this.RunType);
        this.setParamSimple(map, prefix + "RunDateTime", this.RunDateTime);
        this.setParamSimple(map, prefix + "RunScheduleTimeZone", this.RunScheduleTimeZone);
        this.setParamSimple(map, prefix + "RunScheduleRangeStartTime", this.RunScheduleRangeStartTime);
        this.setParamSimple(map, prefix + "RunScheduleRangeEndTime", this.RunScheduleRangeEndTime);
        this.setParamArraySimple(map, prefix + "RunScheduleRangeWeekDays.", this.RunScheduleRangeWeekDays);

    }
}

