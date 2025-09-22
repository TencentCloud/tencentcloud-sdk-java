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

public class CreateDataBackfillPlanRequest extends AbstractModel {

    /**
    * 所属项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 补录任务集合
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * 补录任务的数据时间配置
    */
    @SerializedName("DataBackfillRangeList")
    @Expose
    private DataBackfillRange [] DataBackfillRangeList;

    /**
    * 时区，默认UTC+8
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * 数据补录计划名称，不填则由系统随机生成一串字符
    */
    @SerializedName("DataBackfillPlanName")
    @Expose
    private String DataBackfillPlanName;

    /**
    * 检查父任务类型，取值范围：- NONE-全部不检查- ALL-检查全部上游父任务- MAKE_SCOPE-只在（当前补录计划）选中任务中检查,默认NONE不检查
    */
    @SerializedName("CheckParentType")
    @Expose
    private String CheckParentType;

    /**
    * 补录是否忽略事件依赖,默认true
    */
    @SerializedName("SkipEventListening")
    @Expose
    private Boolean SkipEventListening;

    /**
    * 自定义的工作流自依赖，yes或者no；如果不配置，则使用工作流原有自依赖
    */
    @SerializedName("RedefineSelfWorkflowDependency")
    @Expose
    private String RedefineSelfWorkflowDependency;

    /**
    * 自定义实例运行并发度, 如果不配置，则使用任务原有自依赖
    */
    @SerializedName("RedefineParallelNum")
    @Expose
    private Long RedefineParallelNum;

    /**
    * 调度资源组id，为空则表示使用任务原有调度执行资源组
    */
    @SerializedName("SchedulerResourceGroupId")
    @Expose
    private String SchedulerResourceGroupId;

    /**
    * 集成任务资源组id，为空则表示使用任务原有调度执行资源组
    */
    @SerializedName("IntegrationResourceGroupId")
    @Expose
    private String IntegrationResourceGroupId;

    /**
    * 自定义参数，可以重新指定任务的参数，方便补录实例执行新的逻辑
    */
    @SerializedName("RedefineParamList")
    @Expose
    private KVPair [] RedefineParamList;

    /**
    * 补录是实例数据时间顺序，生效必须满足2个条件:
1. 必须同周期任务
2. 优先按依赖关系执行，无依赖关系影响的情况下按配置执行顺序执行
 
可选值
- NORMAL: 不设置
- ORDER: 顺序
- REVERSE: 逆序
不设置默认为NORMAL
    */
    @SerializedName("DataTimeOrder")
    @Expose
    private String DataTimeOrder;

    /**
    * 补录实例重新生成周期，如果设置会重新指定补录任务实例的生成周期，目前只会将天实例转换成每月1号生成的实例
* MONTH_CYCLE: 月
    */
    @SerializedName("RedefineCycleType")
    @Expose
    private String RedefineCycleType;

    /**
     * Get 所属项目Id 
     * @return ProjectId 所属项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 所属项目Id
     * @param ProjectId 所属项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
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
     * Get 补录任务的数据时间配置 
     * @return DataBackfillRangeList 补录任务的数据时间配置
     */
    public DataBackfillRange [] getDataBackfillRangeList() {
        return this.DataBackfillRangeList;
    }

    /**
     * Set 补录任务的数据时间配置
     * @param DataBackfillRangeList 补录任务的数据时间配置
     */
    public void setDataBackfillRangeList(DataBackfillRange [] DataBackfillRangeList) {
        this.DataBackfillRangeList = DataBackfillRangeList;
    }

    /**
     * Get 时区，默认UTC+8 
     * @return TimeZone 时区，默认UTC+8
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set 时区，默认UTC+8
     * @param TimeZone 时区，默认UTC+8
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get 数据补录计划名称，不填则由系统随机生成一串字符 
     * @return DataBackfillPlanName 数据补录计划名称，不填则由系统随机生成一串字符
     */
    public String getDataBackfillPlanName() {
        return this.DataBackfillPlanName;
    }

    /**
     * Set 数据补录计划名称，不填则由系统随机生成一串字符
     * @param DataBackfillPlanName 数据补录计划名称，不填则由系统随机生成一串字符
     */
    public void setDataBackfillPlanName(String DataBackfillPlanName) {
        this.DataBackfillPlanName = DataBackfillPlanName;
    }

    /**
     * Get 检查父任务类型，取值范围：- NONE-全部不检查- ALL-检查全部上游父任务- MAKE_SCOPE-只在（当前补录计划）选中任务中检查,默认NONE不检查 
     * @return CheckParentType 检查父任务类型，取值范围：- NONE-全部不检查- ALL-检查全部上游父任务- MAKE_SCOPE-只在（当前补录计划）选中任务中检查,默认NONE不检查
     */
    public String getCheckParentType() {
        return this.CheckParentType;
    }

    /**
     * Set 检查父任务类型，取值范围：- NONE-全部不检查- ALL-检查全部上游父任务- MAKE_SCOPE-只在（当前补录计划）选中任务中检查,默认NONE不检查
     * @param CheckParentType 检查父任务类型，取值范围：- NONE-全部不检查- ALL-检查全部上游父任务- MAKE_SCOPE-只在（当前补录计划）选中任务中检查,默认NONE不检查
     */
    public void setCheckParentType(String CheckParentType) {
        this.CheckParentType = CheckParentType;
    }

    /**
     * Get 补录是否忽略事件依赖,默认true 
     * @return SkipEventListening 补录是否忽略事件依赖,默认true
     */
    public Boolean getSkipEventListening() {
        return this.SkipEventListening;
    }

    /**
     * Set 补录是否忽略事件依赖,默认true
     * @param SkipEventListening 补录是否忽略事件依赖,默认true
     */
    public void setSkipEventListening(Boolean SkipEventListening) {
        this.SkipEventListening = SkipEventListening;
    }

    /**
     * Get 自定义的工作流自依赖，yes或者no；如果不配置，则使用工作流原有自依赖 
     * @return RedefineSelfWorkflowDependency 自定义的工作流自依赖，yes或者no；如果不配置，则使用工作流原有自依赖
     */
    public String getRedefineSelfWorkflowDependency() {
        return this.RedefineSelfWorkflowDependency;
    }

    /**
     * Set 自定义的工作流自依赖，yes或者no；如果不配置，则使用工作流原有自依赖
     * @param RedefineSelfWorkflowDependency 自定义的工作流自依赖，yes或者no；如果不配置，则使用工作流原有自依赖
     */
    public void setRedefineSelfWorkflowDependency(String RedefineSelfWorkflowDependency) {
        this.RedefineSelfWorkflowDependency = RedefineSelfWorkflowDependency;
    }

    /**
     * Get 自定义实例运行并发度, 如果不配置，则使用任务原有自依赖 
     * @return RedefineParallelNum 自定义实例运行并发度, 如果不配置，则使用任务原有自依赖
     */
    public Long getRedefineParallelNum() {
        return this.RedefineParallelNum;
    }

    /**
     * Set 自定义实例运行并发度, 如果不配置，则使用任务原有自依赖
     * @param RedefineParallelNum 自定义实例运行并发度, 如果不配置，则使用任务原有自依赖
     */
    public void setRedefineParallelNum(Long RedefineParallelNum) {
        this.RedefineParallelNum = RedefineParallelNum;
    }

    /**
     * Get 调度资源组id，为空则表示使用任务原有调度执行资源组 
     * @return SchedulerResourceGroupId 调度资源组id，为空则表示使用任务原有调度执行资源组
     */
    public String getSchedulerResourceGroupId() {
        return this.SchedulerResourceGroupId;
    }

    /**
     * Set 调度资源组id，为空则表示使用任务原有调度执行资源组
     * @param SchedulerResourceGroupId 调度资源组id，为空则表示使用任务原有调度执行资源组
     */
    public void setSchedulerResourceGroupId(String SchedulerResourceGroupId) {
        this.SchedulerResourceGroupId = SchedulerResourceGroupId;
    }

    /**
     * Get 集成任务资源组id，为空则表示使用任务原有调度执行资源组 
     * @return IntegrationResourceGroupId 集成任务资源组id，为空则表示使用任务原有调度执行资源组
     */
    public String getIntegrationResourceGroupId() {
        return this.IntegrationResourceGroupId;
    }

    /**
     * Set 集成任务资源组id，为空则表示使用任务原有调度执行资源组
     * @param IntegrationResourceGroupId 集成任务资源组id，为空则表示使用任务原有调度执行资源组
     */
    public void setIntegrationResourceGroupId(String IntegrationResourceGroupId) {
        this.IntegrationResourceGroupId = IntegrationResourceGroupId;
    }

    /**
     * Get 自定义参数，可以重新指定任务的参数，方便补录实例执行新的逻辑 
     * @return RedefineParamList 自定义参数，可以重新指定任务的参数，方便补录实例执行新的逻辑
     */
    public KVPair [] getRedefineParamList() {
        return this.RedefineParamList;
    }

    /**
     * Set 自定义参数，可以重新指定任务的参数，方便补录实例执行新的逻辑
     * @param RedefineParamList 自定义参数，可以重新指定任务的参数，方便补录实例执行新的逻辑
     */
    public void setRedefineParamList(KVPair [] RedefineParamList) {
        this.RedefineParamList = RedefineParamList;
    }

    /**
     * Get 补录是实例数据时间顺序，生效必须满足2个条件:
1. 必须同周期任务
2. 优先按依赖关系执行，无依赖关系影响的情况下按配置执行顺序执行
 
可选值
- NORMAL: 不设置
- ORDER: 顺序
- REVERSE: 逆序
不设置默认为NORMAL 
     * @return DataTimeOrder 补录是实例数据时间顺序，生效必须满足2个条件:
1. 必须同周期任务
2. 优先按依赖关系执行，无依赖关系影响的情况下按配置执行顺序执行
 
可选值
- NORMAL: 不设置
- ORDER: 顺序
- REVERSE: 逆序
不设置默认为NORMAL
     */
    public String getDataTimeOrder() {
        return this.DataTimeOrder;
    }

    /**
     * Set 补录是实例数据时间顺序，生效必须满足2个条件:
1. 必须同周期任务
2. 优先按依赖关系执行，无依赖关系影响的情况下按配置执行顺序执行
 
可选值
- NORMAL: 不设置
- ORDER: 顺序
- REVERSE: 逆序
不设置默认为NORMAL
     * @param DataTimeOrder 补录是实例数据时间顺序，生效必须满足2个条件:
1. 必须同周期任务
2. 优先按依赖关系执行，无依赖关系影响的情况下按配置执行顺序执行
 
可选值
- NORMAL: 不设置
- ORDER: 顺序
- REVERSE: 逆序
不设置默认为NORMAL
     */
    public void setDataTimeOrder(String DataTimeOrder) {
        this.DataTimeOrder = DataTimeOrder;
    }

    /**
     * Get 补录实例重新生成周期，如果设置会重新指定补录任务实例的生成周期，目前只会将天实例转换成每月1号生成的实例
* MONTH_CYCLE: 月 
     * @return RedefineCycleType 补录实例重新生成周期，如果设置会重新指定补录任务实例的生成周期，目前只会将天实例转换成每月1号生成的实例
* MONTH_CYCLE: 月
     */
    public String getRedefineCycleType() {
        return this.RedefineCycleType;
    }

    /**
     * Set 补录实例重新生成周期，如果设置会重新指定补录任务实例的生成周期，目前只会将天实例转换成每月1号生成的实例
* MONTH_CYCLE: 月
     * @param RedefineCycleType 补录实例重新生成周期，如果设置会重新指定补录任务实例的生成周期，目前只会将天实例转换成每月1号生成的实例
* MONTH_CYCLE: 月
     */
    public void setRedefineCycleType(String RedefineCycleType) {
        this.RedefineCycleType = RedefineCycleType;
    }

    public CreateDataBackfillPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDataBackfillPlanRequest(CreateDataBackfillPlanRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
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
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
        if (source.DataBackfillPlanName != null) {
            this.DataBackfillPlanName = new String(source.DataBackfillPlanName);
        }
        if (source.CheckParentType != null) {
            this.CheckParentType = new String(source.CheckParentType);
        }
        if (source.SkipEventListening != null) {
            this.SkipEventListening = new Boolean(source.SkipEventListening);
        }
        if (source.RedefineSelfWorkflowDependency != null) {
            this.RedefineSelfWorkflowDependency = new String(source.RedefineSelfWorkflowDependency);
        }
        if (source.RedefineParallelNum != null) {
            this.RedefineParallelNum = new Long(source.RedefineParallelNum);
        }
        if (source.SchedulerResourceGroupId != null) {
            this.SchedulerResourceGroupId = new String(source.SchedulerResourceGroupId);
        }
        if (source.IntegrationResourceGroupId != null) {
            this.IntegrationResourceGroupId = new String(source.IntegrationResourceGroupId);
        }
        if (source.RedefineParamList != null) {
            this.RedefineParamList = new KVPair[source.RedefineParamList.length];
            for (int i = 0; i < source.RedefineParamList.length; i++) {
                this.RedefineParamList[i] = new KVPair(source.RedefineParamList[i]);
            }
        }
        if (source.DataTimeOrder != null) {
            this.DataTimeOrder = new String(source.DataTimeOrder);
        }
        if (source.RedefineCycleType != null) {
            this.RedefineCycleType = new String(source.RedefineCycleType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamArrayObj(map, prefix + "DataBackfillRangeList.", this.DataBackfillRangeList);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamSimple(map, prefix + "DataBackfillPlanName", this.DataBackfillPlanName);
        this.setParamSimple(map, prefix + "CheckParentType", this.CheckParentType);
        this.setParamSimple(map, prefix + "SkipEventListening", this.SkipEventListening);
        this.setParamSimple(map, prefix + "RedefineSelfWorkflowDependency", this.RedefineSelfWorkflowDependency);
        this.setParamSimple(map, prefix + "RedefineParallelNum", this.RedefineParallelNum);
        this.setParamSimple(map, prefix + "SchedulerResourceGroupId", this.SchedulerResourceGroupId);
        this.setParamSimple(map, prefix + "IntegrationResourceGroupId", this.IntegrationResourceGroupId);
        this.setParamArrayObj(map, prefix + "RedefineParamList.", this.RedefineParamList);
        this.setParamSimple(map, prefix + "DataTimeOrder", this.DataTimeOrder);
        this.setParamSimple(map, prefix + "RedefineCycleType", this.RedefineCycleType);

    }
}

