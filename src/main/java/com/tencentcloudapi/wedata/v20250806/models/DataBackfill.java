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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataBackfill extends AbstractModel {

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 数据补录计划id
    */
    @SerializedName("DataBackfillPlanId")
    @Expose
    private String DataBackfillPlanId;

    /**
    * 数据补录计划名称
    */
    @SerializedName("DataBackfillPlanName")
    @Expose
    private String DataBackfillPlanName;

    /**
    * 补录任务集合
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * 补录任务的数据配置列表
    */
    @SerializedName("DataBackfillRangeList")
    @Expose
    private DataBackfillRange [] DataBackfillRangeList;

    /**
    * 检查父任务类型，取值范围：- NONE-全部不检查- ALL-检查全部上游父任务- MAKE_SCOPE-只在（当前补录计划）选中任务中检查
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckParentType")
    @Expose
    private String CheckParentType;

    /**
    * 补录是否忽略事件依赖	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SkipEventListening")
    @Expose
    private Boolean SkipEventListening;

    /**
    * 自定义实例运行并发度, 返回为null或者不返回，则表示任务原有自依赖
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RedefineParallelNum")
    @Expose
    private Long RedefineParallelNum;

    /**
    * 自定义的工作流自依赖，yes或者no；如果不配置，则使用工作流原有自依赖
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RedefineSelfWorkflowDependency")
    @Expose
    private String RedefineSelfWorkflowDependency;

    /**
    * 调度资源组id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchedulerResourceGroupId")
    @Expose
    private String SchedulerResourceGroupId;

    /**
    * 集成资源组id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntegrationResourceGroupId")
    @Expose
    private String IntegrationResourceGroupId;

    /**
    * 补录自定义的生成周期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RedefineCycleType")
    @Expose
    private String RedefineCycleType;

    /**
    * 自定义参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RedefineParamList")
    @Expose
    private KVPair [] RedefineParamList;

    /**
    * 补录任务的执行开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 补录任务的执行结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 创建用户id
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * 补录计划实例完成百分数
    */
    @SerializedName("CompletePercent")
    @Expose
    private Long CompletePercent;

    /**
    * 补录计划实例成功百分数
    */
    @SerializedName("SuccessPercent")
    @Expose
    private Long SuccessPercent;

    /**
    * 补录是实例数据时间顺序，生效必须满足2个条件:1. 必须同周期任务2. 优先按依赖关系执行，无依赖关系影响的情况下按配置执行顺序执行 可选值- NORMAL: 不设置- ORDER: 顺序- REVERSE: 逆序不设置默认为NORMAL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataTimeOrder")
    @Expose
    private String DataTimeOrder;

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 数据补录计划id 
     * @return DataBackfillPlanId 数据补录计划id
     */
    public String getDataBackfillPlanId() {
        return this.DataBackfillPlanId;
    }

    /**
     * Set 数据补录计划id
     * @param DataBackfillPlanId 数据补录计划id
     */
    public void setDataBackfillPlanId(String DataBackfillPlanId) {
        this.DataBackfillPlanId = DataBackfillPlanId;
    }

    /**
     * Get 数据补录计划名称 
     * @return DataBackfillPlanName 数据补录计划名称
     */
    public String getDataBackfillPlanName() {
        return this.DataBackfillPlanName;
    }

    /**
     * Set 数据补录计划名称
     * @param DataBackfillPlanName 数据补录计划名称
     */
    public void setDataBackfillPlanName(String DataBackfillPlanName) {
        this.DataBackfillPlanName = DataBackfillPlanName;
    }

    /**
     * Get 补录任务集合 
     * @return TaskIds 补录任务集合
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set 补录任务集合
     * @param TaskIds 补录任务集合
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get 补录任务的数据配置列表 
     * @return DataBackfillRangeList 补录任务的数据配置列表
     */
    public DataBackfillRange [] getDataBackfillRangeList() {
        return this.DataBackfillRangeList;
    }

    /**
     * Set 补录任务的数据配置列表
     * @param DataBackfillRangeList 补录任务的数据配置列表
     */
    public void setDataBackfillRangeList(DataBackfillRange [] DataBackfillRangeList) {
        this.DataBackfillRangeList = DataBackfillRangeList;
    }

    /**
     * Get 检查父任务类型，取值范围：- NONE-全部不检查- ALL-检查全部上游父任务- MAKE_SCOPE-只在（当前补录计划）选中任务中检查
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckParentType 检查父任务类型，取值范围：- NONE-全部不检查- ALL-检查全部上游父任务- MAKE_SCOPE-只在（当前补录计划）选中任务中检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCheckParentType() {
        return this.CheckParentType;
    }

    /**
     * Set 检查父任务类型，取值范围：- NONE-全部不检查- ALL-检查全部上游父任务- MAKE_SCOPE-只在（当前补录计划）选中任务中检查
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckParentType 检查父任务类型，取值范围：- NONE-全部不检查- ALL-检查全部上游父任务- MAKE_SCOPE-只在（当前补录计划）选中任务中检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckParentType(String CheckParentType) {
        this.CheckParentType = CheckParentType;
    }

    /**
     * Get 补录是否忽略事件依赖	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SkipEventListening 补录是否忽略事件依赖	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSkipEventListening() {
        return this.SkipEventListening;
    }

    /**
     * Set 补录是否忽略事件依赖	
注意：此字段可能返回 null，表示取不到有效值。
     * @param SkipEventListening 补录是否忽略事件依赖	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSkipEventListening(Boolean SkipEventListening) {
        this.SkipEventListening = SkipEventListening;
    }

    /**
     * Get 自定义实例运行并发度, 返回为null或者不返回，则表示任务原有自依赖
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RedefineParallelNum 自定义实例运行并发度, 返回为null或者不返回，则表示任务原有自依赖
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRedefineParallelNum() {
        return this.RedefineParallelNum;
    }

    /**
     * Set 自定义实例运行并发度, 返回为null或者不返回，则表示任务原有自依赖
注意：此字段可能返回 null，表示取不到有效值。
     * @param RedefineParallelNum 自定义实例运行并发度, 返回为null或者不返回，则表示任务原有自依赖
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRedefineParallelNum(Long RedefineParallelNum) {
        this.RedefineParallelNum = RedefineParallelNum;
    }

    /**
     * Get 自定义的工作流自依赖，yes或者no；如果不配置，则使用工作流原有自依赖
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RedefineSelfWorkflowDependency 自定义的工作流自依赖，yes或者no；如果不配置，则使用工作流原有自依赖
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRedefineSelfWorkflowDependency() {
        return this.RedefineSelfWorkflowDependency;
    }

    /**
     * Set 自定义的工作流自依赖，yes或者no；如果不配置，则使用工作流原有自依赖
注意：此字段可能返回 null，表示取不到有效值。
     * @param RedefineSelfWorkflowDependency 自定义的工作流自依赖，yes或者no；如果不配置，则使用工作流原有自依赖
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRedefineSelfWorkflowDependency(String RedefineSelfWorkflowDependency) {
        this.RedefineSelfWorkflowDependency = RedefineSelfWorkflowDependency;
    }

    /**
     * Get 调度资源组id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchedulerResourceGroupId 调度资源组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchedulerResourceGroupId() {
        return this.SchedulerResourceGroupId;
    }

    /**
     * Set 调度资源组id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchedulerResourceGroupId 调度资源组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchedulerResourceGroupId(String SchedulerResourceGroupId) {
        this.SchedulerResourceGroupId = SchedulerResourceGroupId;
    }

    /**
     * Get 集成资源组id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntegrationResourceGroupId 集成资源组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIntegrationResourceGroupId() {
        return this.IntegrationResourceGroupId;
    }

    /**
     * Set 集成资源组id
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntegrationResourceGroupId 集成资源组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntegrationResourceGroupId(String IntegrationResourceGroupId) {
        this.IntegrationResourceGroupId = IntegrationResourceGroupId;
    }

    /**
     * Get 补录自定义的生成周期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RedefineCycleType 补录自定义的生成周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRedefineCycleType() {
        return this.RedefineCycleType;
    }

    /**
     * Set 补录自定义的生成周期
注意：此字段可能返回 null，表示取不到有效值。
     * @param RedefineCycleType 补录自定义的生成周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRedefineCycleType(String RedefineCycleType) {
        this.RedefineCycleType = RedefineCycleType;
    }

    /**
     * Get 自定义参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RedefineParamList 自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KVPair [] getRedefineParamList() {
        return this.RedefineParamList;
    }

    /**
     * Set 自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RedefineParamList 自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRedefineParamList(KVPair [] RedefineParamList) {
        this.RedefineParamList = RedefineParamList;
    }

    /**
     * Get 补录任务的执行开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 补录任务的执行开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 补录任务的执行开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 补录任务的执行开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 补录任务的执行结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 补录任务的执行结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 补录任务的执行结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 补录任务的执行结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 创建用户id 
     * @return CreateUserUin 创建用户id
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set 创建用户id
     * @param CreateUserUin 创建用户id
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get 补录计划实例完成百分数 
     * @return CompletePercent 补录计划实例完成百分数
     */
    public Long getCompletePercent() {
        return this.CompletePercent;
    }

    /**
     * Set 补录计划实例完成百分数
     * @param CompletePercent 补录计划实例完成百分数
     */
    public void setCompletePercent(Long CompletePercent) {
        this.CompletePercent = CompletePercent;
    }

    /**
     * Get 补录计划实例成功百分数 
     * @return SuccessPercent 补录计划实例成功百分数
     */
    public Long getSuccessPercent() {
        return this.SuccessPercent;
    }

    /**
     * Set 补录计划实例成功百分数
     * @param SuccessPercent 补录计划实例成功百分数
     */
    public void setSuccessPercent(Long SuccessPercent) {
        this.SuccessPercent = SuccessPercent;
    }

    /**
     * Get 补录是实例数据时间顺序，生效必须满足2个条件:1. 必须同周期任务2. 优先按依赖关系执行，无依赖关系影响的情况下按配置执行顺序执行 可选值- NORMAL: 不设置- ORDER: 顺序- REVERSE: 逆序不设置默认为NORMAL
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataTimeOrder 补录是实例数据时间顺序，生效必须满足2个条件:1. 必须同周期任务2. 优先按依赖关系执行，无依赖关系影响的情况下按配置执行顺序执行 可选值- NORMAL: 不设置- ORDER: 顺序- REVERSE: 逆序不设置默认为NORMAL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataTimeOrder() {
        return this.DataTimeOrder;
    }

    /**
     * Set 补录是实例数据时间顺序，生效必须满足2个条件:1. 必须同周期任务2. 优先按依赖关系执行，无依赖关系影响的情况下按配置执行顺序执行 可选值- NORMAL: 不设置- ORDER: 顺序- REVERSE: 逆序不设置默认为NORMAL
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataTimeOrder 补录是实例数据时间顺序，生效必须满足2个条件:1. 必须同周期任务2. 优先按依赖关系执行，无依赖关系影响的情况下按配置执行顺序执行 可选值- NORMAL: 不设置- ORDER: 顺序- REVERSE: 逆序不设置默认为NORMAL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataTimeOrder(String DataTimeOrder) {
        this.DataTimeOrder = DataTimeOrder;
    }

    public DataBackfill() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataBackfill(DataBackfill source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DataBackfillPlanId != null) {
            this.DataBackfillPlanId = new String(source.DataBackfillPlanId);
        }
        if (source.DataBackfillPlanName != null) {
            this.DataBackfillPlanName = new String(source.DataBackfillPlanName);
        }
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.DataBackfillRangeList != null) {
            this.DataBackfillRangeList = new DataBackfillRange[source.DataBackfillRangeList.length];
            for (int i = 0; i < source.DataBackfillRangeList.length; i++) {
                this.DataBackfillRangeList[i] = new DataBackfillRange(source.DataBackfillRangeList[i]);
            }
        }
        if (source.CheckParentType != null) {
            this.CheckParentType = new String(source.CheckParentType);
        }
        if (source.SkipEventListening != null) {
            this.SkipEventListening = new Boolean(source.SkipEventListening);
        }
        if (source.RedefineParallelNum != null) {
            this.RedefineParallelNum = new Long(source.RedefineParallelNum);
        }
        if (source.RedefineSelfWorkflowDependency != null) {
            this.RedefineSelfWorkflowDependency = new String(source.RedefineSelfWorkflowDependency);
        }
        if (source.SchedulerResourceGroupId != null) {
            this.SchedulerResourceGroupId = new String(source.SchedulerResourceGroupId);
        }
        if (source.IntegrationResourceGroupId != null) {
            this.IntegrationResourceGroupId = new String(source.IntegrationResourceGroupId);
        }
        if (source.RedefineCycleType != null) {
            this.RedefineCycleType = new String(source.RedefineCycleType);
        }
        if (source.RedefineParamList != null) {
            this.RedefineParamList = new KVPair[source.RedefineParamList.length];
            for (int i = 0; i < source.RedefineParamList.length; i++) {
                this.RedefineParamList[i] = new KVPair(source.RedefineParamList[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.CompletePercent != null) {
            this.CompletePercent = new Long(source.CompletePercent);
        }
        if (source.SuccessPercent != null) {
            this.SuccessPercent = new Long(source.SuccessPercent);
        }
        if (source.DataTimeOrder != null) {
            this.DataTimeOrder = new String(source.DataTimeOrder);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DataBackfillPlanId", this.DataBackfillPlanId);
        this.setParamSimple(map, prefix + "DataBackfillPlanName", this.DataBackfillPlanName);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamArrayObj(map, prefix + "DataBackfillRangeList.", this.DataBackfillRangeList);
        this.setParamSimple(map, prefix + "CheckParentType", this.CheckParentType);
        this.setParamSimple(map, prefix + "SkipEventListening", this.SkipEventListening);
        this.setParamSimple(map, prefix + "RedefineParallelNum", this.RedefineParallelNum);
        this.setParamSimple(map, prefix + "RedefineSelfWorkflowDependency", this.RedefineSelfWorkflowDependency);
        this.setParamSimple(map, prefix + "SchedulerResourceGroupId", this.SchedulerResourceGroupId);
        this.setParamSimple(map, prefix + "IntegrationResourceGroupId", this.IntegrationResourceGroupId);
        this.setParamSimple(map, prefix + "RedefineCycleType", this.RedefineCycleType);
        this.setParamArrayObj(map, prefix + "RedefineParamList.", this.RedefineParamList);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "CompletePercent", this.CompletePercent);
        this.setParamSimple(map, prefix + "SuccessPercent", this.SuccessPercent);
        this.setParamSimple(map, prefix + "DataTimeOrder", this.DataTimeOrder);

    }
}

