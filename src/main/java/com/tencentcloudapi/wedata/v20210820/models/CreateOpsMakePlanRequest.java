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

public class CreateOpsMakePlanRequest extends AbstractModel{

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 补录计划名称
    */
    @SerializedName("MakeName")
    @Expose
    private String MakeName;

    /**
    * 补录任务集合
    */
    @SerializedName("TaskIdList")
    @Expose
    private String [] TaskIdList;

    /**
    * 补录计划日期范围
    */
    @SerializedName("MakeDatetimeList")
    @Expose
    private CreateMakeDatetimeInfo [] MakeDatetimeList;

    /**
    * 项目标识
    */
    @SerializedName("ProjectIdent")
    @Expose
    private String ProjectIdent;

    /**
    * 补录是否检查父任务状态，默认不检查。不推荐使用，后续会废弃，推荐使用 CheckParentType。
    */
    @SerializedName("CheckParent")
    @Expose
    private Boolean CheckParent;

    /**
    * 补录检查父任务类型。取值范围：
<li> NONE: 全部不检查 </li>
<li> ALL: 检查全部上游父任务 </li>
<li> MAKE_SCOPE: 只在（当前补录计划）选中任务中检查 </li>
    */
    @SerializedName("CheckParentType")
    @Expose
    private String CheckParentType;

    /**
    * 项目名称
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 已弃用。任务自依赖类型：parallel（并行），serial（无序串行），orderly（有序串行）
    */
    @SerializedName("SelfDependence")
    @Expose
    private String SelfDependence;

    /**
    * 并行度
    */
    @SerializedName("ParallelNum")
    @Expose
    private Long ParallelNum;

    /**
    * 补录实例生成周期是否和原周期相同，默认为true
    */
    @SerializedName("SameCycle")
    @Expose
    private Boolean SameCycle;

    /**
    * 补录实例目标周期类型
    */
    @SerializedName("TargetTaskCycle")
    @Expose
    private String TargetTaskCycle;

    /**
    * 补录实例目标周期类型指定时间
    */
    @SerializedName("TargetTaskAction")
    @Expose
    private Long TargetTaskAction;

    /**
    * 补录实例自定义参数
    */
    @SerializedName("MapParamList")
    @Expose
    private StrToStrMap [] MapParamList;

    /**
    * 创建人id
    */
    @SerializedName("CreatorId")
    @Expose
    private String CreatorId;

    /**
    * 创建人
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 补录计划说明
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 是否使用任务原有自依赖配置，默认为true
    */
    @SerializedName("SameSelfDependType")
    @Expose
    private Boolean SameSelfDependType;

    /**
    * 补录实例原始周期类型
    */
    @SerializedName("SourceTaskCycle")
    @Expose
    private String SourceTaskCycle;

    /**
    * 重新指定的调度资源组ID
    */
    @SerializedName("SchedulerResourceGroup")
    @Expose
    private String SchedulerResourceGroup;

    /**
    * 重新指定的集成资源组ID
    */
    @SerializedName("IntegrationResourceGroup")
    @Expose
    private String IntegrationResourceGroup;

    /**
    * 重新指定的调度资源组名称
    */
    @SerializedName("SchedulerResourceGroupName")
    @Expose
    private String SchedulerResourceGroupName;

    /**
    * 重新指定的集成资源组名称
    */
    @SerializedName("IntegrationResourceGroupName")
    @Expose
    private String IntegrationResourceGroupName;

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 补录计划名称 
     * @return MakeName 补录计划名称
     */
    public String getMakeName() {
        return this.MakeName;
    }

    /**
     * Set 补录计划名称
     * @param MakeName 补录计划名称
     */
    public void setMakeName(String MakeName) {
        this.MakeName = MakeName;
    }

    /**
     * Get 补录任务集合 
     * @return TaskIdList 补录任务集合
     */
    public String [] getTaskIdList() {
        return this.TaskIdList;
    }

    /**
     * Set 补录任务集合
     * @param TaskIdList 补录任务集合
     */
    public void setTaskIdList(String [] TaskIdList) {
        this.TaskIdList = TaskIdList;
    }

    /**
     * Get 补录计划日期范围 
     * @return MakeDatetimeList 补录计划日期范围
     */
    public CreateMakeDatetimeInfo [] getMakeDatetimeList() {
        return this.MakeDatetimeList;
    }

    /**
     * Set 补录计划日期范围
     * @param MakeDatetimeList 补录计划日期范围
     */
    public void setMakeDatetimeList(CreateMakeDatetimeInfo [] MakeDatetimeList) {
        this.MakeDatetimeList = MakeDatetimeList;
    }

    /**
     * Get 项目标识 
     * @return ProjectIdent 项目标识
     */
    public String getProjectIdent() {
        return this.ProjectIdent;
    }

    /**
     * Set 项目标识
     * @param ProjectIdent 项目标识
     */
    public void setProjectIdent(String ProjectIdent) {
        this.ProjectIdent = ProjectIdent;
    }

    /**
     * Get 补录是否检查父任务状态，默认不检查。不推荐使用，后续会废弃，推荐使用 CheckParentType。 
     * @return CheckParent 补录是否检查父任务状态，默认不检查。不推荐使用，后续会废弃，推荐使用 CheckParentType。
     */
    public Boolean getCheckParent() {
        return this.CheckParent;
    }

    /**
     * Set 补录是否检查父任务状态，默认不检查。不推荐使用，后续会废弃，推荐使用 CheckParentType。
     * @param CheckParent 补录是否检查父任务状态，默认不检查。不推荐使用，后续会废弃，推荐使用 CheckParentType。
     */
    public void setCheckParent(Boolean CheckParent) {
        this.CheckParent = CheckParent;
    }

    /**
     * Get 补录检查父任务类型。取值范围：
<li> NONE: 全部不检查 </li>
<li> ALL: 检查全部上游父任务 </li>
<li> MAKE_SCOPE: 只在（当前补录计划）选中任务中检查 </li> 
     * @return CheckParentType 补录检查父任务类型。取值范围：
<li> NONE: 全部不检查 </li>
<li> ALL: 检查全部上游父任务 </li>
<li> MAKE_SCOPE: 只在（当前补录计划）选中任务中检查 </li>
     */
    public String getCheckParentType() {
        return this.CheckParentType;
    }

    /**
     * Set 补录检查父任务类型。取值范围：
<li> NONE: 全部不检查 </li>
<li> ALL: 检查全部上游父任务 </li>
<li> MAKE_SCOPE: 只在（当前补录计划）选中任务中检查 </li>
     * @param CheckParentType 补录检查父任务类型。取值范围：
<li> NONE: 全部不检查 </li>
<li> ALL: 检查全部上游父任务 </li>
<li> MAKE_SCOPE: 只在（当前补录计划）选中任务中检查 </li>
     */
    public void setCheckParentType(String CheckParentType) {
        this.CheckParentType = CheckParentType;
    }

    /**
     * Get 项目名称 
     * @return ProjectName 项目名称
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称
     * @param ProjectName 项目名称
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 已弃用。任务自依赖类型：parallel（并行），serial（无序串行），orderly（有序串行） 
     * @return SelfDependence 已弃用。任务自依赖类型：parallel（并行），serial（无序串行），orderly（有序串行）
     */
    public String getSelfDependence() {
        return this.SelfDependence;
    }

    /**
     * Set 已弃用。任务自依赖类型：parallel（并行），serial（无序串行），orderly（有序串行）
     * @param SelfDependence 已弃用。任务自依赖类型：parallel（并行），serial（无序串行），orderly（有序串行）
     */
    public void setSelfDependence(String SelfDependence) {
        this.SelfDependence = SelfDependence;
    }

    /**
     * Get 并行度 
     * @return ParallelNum 并行度
     */
    public Long getParallelNum() {
        return this.ParallelNum;
    }

    /**
     * Set 并行度
     * @param ParallelNum 并行度
     */
    public void setParallelNum(Long ParallelNum) {
        this.ParallelNum = ParallelNum;
    }

    /**
     * Get 补录实例生成周期是否和原周期相同，默认为true 
     * @return SameCycle 补录实例生成周期是否和原周期相同，默认为true
     */
    public Boolean getSameCycle() {
        return this.SameCycle;
    }

    /**
     * Set 补录实例生成周期是否和原周期相同，默认为true
     * @param SameCycle 补录实例生成周期是否和原周期相同，默认为true
     */
    public void setSameCycle(Boolean SameCycle) {
        this.SameCycle = SameCycle;
    }

    /**
     * Get 补录实例目标周期类型 
     * @return TargetTaskCycle 补录实例目标周期类型
     */
    public String getTargetTaskCycle() {
        return this.TargetTaskCycle;
    }

    /**
     * Set 补录实例目标周期类型
     * @param TargetTaskCycle 补录实例目标周期类型
     */
    public void setTargetTaskCycle(String TargetTaskCycle) {
        this.TargetTaskCycle = TargetTaskCycle;
    }

    /**
     * Get 补录实例目标周期类型指定时间 
     * @return TargetTaskAction 补录实例目标周期类型指定时间
     */
    public Long getTargetTaskAction() {
        return this.TargetTaskAction;
    }

    /**
     * Set 补录实例目标周期类型指定时间
     * @param TargetTaskAction 补录实例目标周期类型指定时间
     */
    public void setTargetTaskAction(Long TargetTaskAction) {
        this.TargetTaskAction = TargetTaskAction;
    }

    /**
     * Get 补录实例自定义参数 
     * @return MapParamList 补录实例自定义参数
     */
    public StrToStrMap [] getMapParamList() {
        return this.MapParamList;
    }

    /**
     * Set 补录实例自定义参数
     * @param MapParamList 补录实例自定义参数
     */
    public void setMapParamList(StrToStrMap [] MapParamList) {
        this.MapParamList = MapParamList;
    }

    /**
     * Get 创建人id 
     * @return CreatorId 创建人id
     */
    public String getCreatorId() {
        return this.CreatorId;
    }

    /**
     * Set 创建人id
     * @param CreatorId 创建人id
     */
    public void setCreatorId(String CreatorId) {
        this.CreatorId = CreatorId;
    }

    /**
     * Get 创建人 
     * @return Creator 创建人
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建人
     * @param Creator 创建人
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 补录计划说明 
     * @return Remark 补录计划说明
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 补录计划说明
     * @param Remark 补录计划说明
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 是否使用任务原有自依赖配置，默认为true 
     * @return SameSelfDependType 是否使用任务原有自依赖配置，默认为true
     */
    public Boolean getSameSelfDependType() {
        return this.SameSelfDependType;
    }

    /**
     * Set 是否使用任务原有自依赖配置，默认为true
     * @param SameSelfDependType 是否使用任务原有自依赖配置，默认为true
     */
    public void setSameSelfDependType(Boolean SameSelfDependType) {
        this.SameSelfDependType = SameSelfDependType;
    }

    /**
     * Get 补录实例原始周期类型 
     * @return SourceTaskCycle 补录实例原始周期类型
     */
    public String getSourceTaskCycle() {
        return this.SourceTaskCycle;
    }

    /**
     * Set 补录实例原始周期类型
     * @param SourceTaskCycle 补录实例原始周期类型
     */
    public void setSourceTaskCycle(String SourceTaskCycle) {
        this.SourceTaskCycle = SourceTaskCycle;
    }

    /**
     * Get 重新指定的调度资源组ID 
     * @return SchedulerResourceGroup 重新指定的调度资源组ID
     */
    public String getSchedulerResourceGroup() {
        return this.SchedulerResourceGroup;
    }

    /**
     * Set 重新指定的调度资源组ID
     * @param SchedulerResourceGroup 重新指定的调度资源组ID
     */
    public void setSchedulerResourceGroup(String SchedulerResourceGroup) {
        this.SchedulerResourceGroup = SchedulerResourceGroup;
    }

    /**
     * Get 重新指定的集成资源组ID 
     * @return IntegrationResourceGroup 重新指定的集成资源组ID
     */
    public String getIntegrationResourceGroup() {
        return this.IntegrationResourceGroup;
    }

    /**
     * Set 重新指定的集成资源组ID
     * @param IntegrationResourceGroup 重新指定的集成资源组ID
     */
    public void setIntegrationResourceGroup(String IntegrationResourceGroup) {
        this.IntegrationResourceGroup = IntegrationResourceGroup;
    }

    /**
     * Get 重新指定的调度资源组名称 
     * @return SchedulerResourceGroupName 重新指定的调度资源组名称
     */
    public String getSchedulerResourceGroupName() {
        return this.SchedulerResourceGroupName;
    }

    /**
     * Set 重新指定的调度资源组名称
     * @param SchedulerResourceGroupName 重新指定的调度资源组名称
     */
    public void setSchedulerResourceGroupName(String SchedulerResourceGroupName) {
        this.SchedulerResourceGroupName = SchedulerResourceGroupName;
    }

    /**
     * Get 重新指定的集成资源组名称 
     * @return IntegrationResourceGroupName 重新指定的集成资源组名称
     */
    public String getIntegrationResourceGroupName() {
        return this.IntegrationResourceGroupName;
    }

    /**
     * Set 重新指定的集成资源组名称
     * @param IntegrationResourceGroupName 重新指定的集成资源组名称
     */
    public void setIntegrationResourceGroupName(String IntegrationResourceGroupName) {
        this.IntegrationResourceGroupName = IntegrationResourceGroupName;
    }

    public CreateOpsMakePlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOpsMakePlanRequest(CreateOpsMakePlanRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.MakeName != null) {
            this.MakeName = new String(source.MakeName);
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
        if (source.ProjectIdent != null) {
            this.ProjectIdent = new String(source.ProjectIdent);
        }
        if (source.CheckParent != null) {
            this.CheckParent = new Boolean(source.CheckParent);
        }
        if (source.CheckParentType != null) {
            this.CheckParentType = new String(source.CheckParentType);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.SelfDependence != null) {
            this.SelfDependence = new String(source.SelfDependence);
        }
        if (source.ParallelNum != null) {
            this.ParallelNum = new Long(source.ParallelNum);
        }
        if (source.SameCycle != null) {
            this.SameCycle = new Boolean(source.SameCycle);
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
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.SameSelfDependType != null) {
            this.SameSelfDependType = new Boolean(source.SameSelfDependType);
        }
        if (source.SourceTaskCycle != null) {
            this.SourceTaskCycle = new String(source.SourceTaskCycle);
        }
        if (source.SchedulerResourceGroup != null) {
            this.SchedulerResourceGroup = new String(source.SchedulerResourceGroup);
        }
        if (source.IntegrationResourceGroup != null) {
            this.IntegrationResourceGroup = new String(source.IntegrationResourceGroup);
        }
        if (source.SchedulerResourceGroupName != null) {
            this.SchedulerResourceGroupName = new String(source.SchedulerResourceGroupName);
        }
        if (source.IntegrationResourceGroupName != null) {
            this.IntegrationResourceGroupName = new String(source.IntegrationResourceGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "MakeName", this.MakeName);
        this.setParamArraySimple(map, prefix + "TaskIdList.", this.TaskIdList);
        this.setParamArrayObj(map, prefix + "MakeDatetimeList.", this.MakeDatetimeList);
        this.setParamSimple(map, prefix + "ProjectIdent", this.ProjectIdent);
        this.setParamSimple(map, prefix + "CheckParent", this.CheckParent);
        this.setParamSimple(map, prefix + "CheckParentType", this.CheckParentType);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "SelfDependence", this.SelfDependence);
        this.setParamSimple(map, prefix + "ParallelNum", this.ParallelNum);
        this.setParamSimple(map, prefix + "SameCycle", this.SameCycle);
        this.setParamSimple(map, prefix + "TargetTaskCycle", this.TargetTaskCycle);
        this.setParamSimple(map, prefix + "TargetTaskAction", this.TargetTaskAction);
        this.setParamArrayObj(map, prefix + "MapParamList.", this.MapParamList);
        this.setParamSimple(map, prefix + "CreatorId", this.CreatorId);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "SameSelfDependType", this.SameSelfDependType);
        this.setParamSimple(map, prefix + "SourceTaskCycle", this.SourceTaskCycle);
        this.setParamSimple(map, prefix + "SchedulerResourceGroup", this.SchedulerResourceGroup);
        this.setParamSimple(map, prefix + "IntegrationResourceGroup", this.IntegrationResourceGroup);
        this.setParamSimple(map, prefix + "SchedulerResourceGroupName", this.SchedulerResourceGroupName);
        this.setParamSimple(map, prefix + "IntegrationResourceGroupName", this.IntegrationResourceGroupName);

    }
}

