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
    * <p>所属项目Id</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>补录任务集合</p>
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * <p>补录任务的数据时间配置</p>
    */
    @SerializedName("DataBackfillRangeList")
    @Expose
    private DataBackfillRange [] DataBackfillRangeList;

    /**
    * <p>时区，默认UTC+8</p>
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * <p>数据补录计划名称，不填则由系统随机生成一串字符</p>
    */
    @SerializedName("DataBackfillPlanName")
    @Expose
    private String DataBackfillPlanName;

    /**
    * <p>检查父任务类型，取值范围：- NONE-全部不检查- ALL-检查全部上游父任务- MAKE_SCOPE-只在（当前补录计划）选中任务中检查,默认NONE不检查</p>
    */
    @SerializedName("CheckParentType")
    @Expose
    private String CheckParentType;

    /**
    * <p>补录是否忽略事件依赖,默认true</p>
    */
    @SerializedName("SkipEventListening")
    @Expose
    private Boolean SkipEventListening;

    /**
    * <p>自定义的工作流自依赖，yes或者no；如果不配置，则使用工作流原有自依赖</p>
    */
    @SerializedName("RedefineSelfWorkflowDependency")
    @Expose
    private String RedefineSelfWorkflowDependency;

    /**
    * <p>自定义实例运行并发度, 如果不配置，则使用任务原有自依赖</p>
    */
    @SerializedName("RedefineParallelNum")
    @Expose
    private Long RedefineParallelNum;

    /**
    * <p>调度资源组id，为空则表示使用任务原有调度执行资源组</p>
    */
    @SerializedName("SchedulerResourceGroupId")
    @Expose
    private String SchedulerResourceGroupId;

    /**
    * <p>集成任务资源组id，为空则表示使用任务原有调度执行资源组</p>
    */
    @SerializedName("IntegrationResourceGroupId")
    @Expose
    private String IntegrationResourceGroupId;

    /**
    * <p>自定义参数，可以重新指定任务的参数，方便补录实例执行新的逻辑</p>
    */
    @SerializedName("RedefineParamList")
    @Expose
    private KVPair [] RedefineParamList;

    /**
    * <p>补录是实例数据时间顺序，生效必须满足2个条件:</p><ol><li>必须同周期任务</li><li>优先按依赖关系执行，无依赖关系影响的情况下按配置执行顺序执行</li></ol><p>可选值</p><ul><li>NORMAL: 不设置</li><li>ORDER: 顺序</li><li>REVERSE: 逆序<br>不设置默认为NORMAL</li></ul>
    */
    @SerializedName("DataTimeOrder")
    @Expose
    private String DataTimeOrder;

    /**
    * <p>补录实例重新生成周期，如果设置会重新指定补录任务实例的生成周期，目前只会将天实例转换成每月1号生成的实例</p><ul><li>MONTH_CYCLE: 月</li></ul>
    */
    @SerializedName("RedefineCycleType")
    @Expose
    private String RedefineCycleType;

    /**
    * <p>存算配置映射列表，对应页面“存算引擎配置”</p>
    */
    @SerializedName("ComputeConfigMappings")
    @Expose
    private ComputeConfigMapping [] ComputeConfigMappings;

    /**
     * Get <p>所属项目Id</p> 
     * @return ProjectId <p>所属项目Id</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>所属项目Id</p>
     * @param ProjectId <p>所属项目Id</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>补录任务集合</p> 
     * @return TaskIds <p>补录任务集合</p>
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set <p>补录任务集合</p>
     * @param TaskIds <p>补录任务集合</p>
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get <p>补录任务的数据时间配置</p> 
     * @return DataBackfillRangeList <p>补录任务的数据时间配置</p>
     */
    public DataBackfillRange [] getDataBackfillRangeList() {
        return this.DataBackfillRangeList;
    }

    /**
     * Set <p>补录任务的数据时间配置</p>
     * @param DataBackfillRangeList <p>补录任务的数据时间配置</p>
     */
    public void setDataBackfillRangeList(DataBackfillRange [] DataBackfillRangeList) {
        this.DataBackfillRangeList = DataBackfillRangeList;
    }

    /**
     * Get <p>时区，默认UTC+8</p> 
     * @return TimeZone <p>时区，默认UTC+8</p>
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set <p>时区，默认UTC+8</p>
     * @param TimeZone <p>时区，默认UTC+8</p>
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get <p>数据补录计划名称，不填则由系统随机生成一串字符</p> 
     * @return DataBackfillPlanName <p>数据补录计划名称，不填则由系统随机生成一串字符</p>
     */
    public String getDataBackfillPlanName() {
        return this.DataBackfillPlanName;
    }

    /**
     * Set <p>数据补录计划名称，不填则由系统随机生成一串字符</p>
     * @param DataBackfillPlanName <p>数据补录计划名称，不填则由系统随机生成一串字符</p>
     */
    public void setDataBackfillPlanName(String DataBackfillPlanName) {
        this.DataBackfillPlanName = DataBackfillPlanName;
    }

    /**
     * Get <p>检查父任务类型，取值范围：- NONE-全部不检查- ALL-检查全部上游父任务- MAKE_SCOPE-只在（当前补录计划）选中任务中检查,默认NONE不检查</p> 
     * @return CheckParentType <p>检查父任务类型，取值范围：- NONE-全部不检查- ALL-检查全部上游父任务- MAKE_SCOPE-只在（当前补录计划）选中任务中检查,默认NONE不检查</p>
     */
    public String getCheckParentType() {
        return this.CheckParentType;
    }

    /**
     * Set <p>检查父任务类型，取值范围：- NONE-全部不检查- ALL-检查全部上游父任务- MAKE_SCOPE-只在（当前补录计划）选中任务中检查,默认NONE不检查</p>
     * @param CheckParentType <p>检查父任务类型，取值范围：- NONE-全部不检查- ALL-检查全部上游父任务- MAKE_SCOPE-只在（当前补录计划）选中任务中检查,默认NONE不检查</p>
     */
    public void setCheckParentType(String CheckParentType) {
        this.CheckParentType = CheckParentType;
    }

    /**
     * Get <p>补录是否忽略事件依赖,默认true</p> 
     * @return SkipEventListening <p>补录是否忽略事件依赖,默认true</p>
     */
    public Boolean getSkipEventListening() {
        return this.SkipEventListening;
    }

    /**
     * Set <p>补录是否忽略事件依赖,默认true</p>
     * @param SkipEventListening <p>补录是否忽略事件依赖,默认true</p>
     */
    public void setSkipEventListening(Boolean SkipEventListening) {
        this.SkipEventListening = SkipEventListening;
    }

    /**
     * Get <p>自定义的工作流自依赖，yes或者no；如果不配置，则使用工作流原有自依赖</p> 
     * @return RedefineSelfWorkflowDependency <p>自定义的工作流自依赖，yes或者no；如果不配置，则使用工作流原有自依赖</p>
     */
    public String getRedefineSelfWorkflowDependency() {
        return this.RedefineSelfWorkflowDependency;
    }

    /**
     * Set <p>自定义的工作流自依赖，yes或者no；如果不配置，则使用工作流原有自依赖</p>
     * @param RedefineSelfWorkflowDependency <p>自定义的工作流自依赖，yes或者no；如果不配置，则使用工作流原有自依赖</p>
     */
    public void setRedefineSelfWorkflowDependency(String RedefineSelfWorkflowDependency) {
        this.RedefineSelfWorkflowDependency = RedefineSelfWorkflowDependency;
    }

    /**
     * Get <p>自定义实例运行并发度, 如果不配置，则使用任务原有自依赖</p> 
     * @return RedefineParallelNum <p>自定义实例运行并发度, 如果不配置，则使用任务原有自依赖</p>
     */
    public Long getRedefineParallelNum() {
        return this.RedefineParallelNum;
    }

    /**
     * Set <p>自定义实例运行并发度, 如果不配置，则使用任务原有自依赖</p>
     * @param RedefineParallelNum <p>自定义实例运行并发度, 如果不配置，则使用任务原有自依赖</p>
     */
    public void setRedefineParallelNum(Long RedefineParallelNum) {
        this.RedefineParallelNum = RedefineParallelNum;
    }

    /**
     * Get <p>调度资源组id，为空则表示使用任务原有调度执行资源组</p> 
     * @return SchedulerResourceGroupId <p>调度资源组id，为空则表示使用任务原有调度执行资源组</p>
     */
    public String getSchedulerResourceGroupId() {
        return this.SchedulerResourceGroupId;
    }

    /**
     * Set <p>调度资源组id，为空则表示使用任务原有调度执行资源组</p>
     * @param SchedulerResourceGroupId <p>调度资源组id，为空则表示使用任务原有调度执行资源组</p>
     */
    public void setSchedulerResourceGroupId(String SchedulerResourceGroupId) {
        this.SchedulerResourceGroupId = SchedulerResourceGroupId;
    }

    /**
     * Get <p>集成任务资源组id，为空则表示使用任务原有调度执行资源组</p> 
     * @return IntegrationResourceGroupId <p>集成任务资源组id，为空则表示使用任务原有调度执行资源组</p>
     */
    public String getIntegrationResourceGroupId() {
        return this.IntegrationResourceGroupId;
    }

    /**
     * Set <p>集成任务资源组id，为空则表示使用任务原有调度执行资源组</p>
     * @param IntegrationResourceGroupId <p>集成任务资源组id，为空则表示使用任务原有调度执行资源组</p>
     */
    public void setIntegrationResourceGroupId(String IntegrationResourceGroupId) {
        this.IntegrationResourceGroupId = IntegrationResourceGroupId;
    }

    /**
     * Get <p>自定义参数，可以重新指定任务的参数，方便补录实例执行新的逻辑</p> 
     * @return RedefineParamList <p>自定义参数，可以重新指定任务的参数，方便补录实例执行新的逻辑</p>
     */
    public KVPair [] getRedefineParamList() {
        return this.RedefineParamList;
    }

    /**
     * Set <p>自定义参数，可以重新指定任务的参数，方便补录实例执行新的逻辑</p>
     * @param RedefineParamList <p>自定义参数，可以重新指定任务的参数，方便补录实例执行新的逻辑</p>
     */
    public void setRedefineParamList(KVPair [] RedefineParamList) {
        this.RedefineParamList = RedefineParamList;
    }

    /**
     * Get <p>补录是实例数据时间顺序，生效必须满足2个条件:</p><ol><li>必须同周期任务</li><li>优先按依赖关系执行，无依赖关系影响的情况下按配置执行顺序执行</li></ol><p>可选值</p><ul><li>NORMAL: 不设置</li><li>ORDER: 顺序</li><li>REVERSE: 逆序<br>不设置默认为NORMAL</li></ul> 
     * @return DataTimeOrder <p>补录是实例数据时间顺序，生效必须满足2个条件:</p><ol><li>必须同周期任务</li><li>优先按依赖关系执行，无依赖关系影响的情况下按配置执行顺序执行</li></ol><p>可选值</p><ul><li>NORMAL: 不设置</li><li>ORDER: 顺序</li><li>REVERSE: 逆序<br>不设置默认为NORMAL</li></ul>
     */
    public String getDataTimeOrder() {
        return this.DataTimeOrder;
    }

    /**
     * Set <p>补录是实例数据时间顺序，生效必须满足2个条件:</p><ol><li>必须同周期任务</li><li>优先按依赖关系执行，无依赖关系影响的情况下按配置执行顺序执行</li></ol><p>可选值</p><ul><li>NORMAL: 不设置</li><li>ORDER: 顺序</li><li>REVERSE: 逆序<br>不设置默认为NORMAL</li></ul>
     * @param DataTimeOrder <p>补录是实例数据时间顺序，生效必须满足2个条件:</p><ol><li>必须同周期任务</li><li>优先按依赖关系执行，无依赖关系影响的情况下按配置执行顺序执行</li></ol><p>可选值</p><ul><li>NORMAL: 不设置</li><li>ORDER: 顺序</li><li>REVERSE: 逆序<br>不设置默认为NORMAL</li></ul>
     */
    public void setDataTimeOrder(String DataTimeOrder) {
        this.DataTimeOrder = DataTimeOrder;
    }

    /**
     * Get <p>补录实例重新生成周期，如果设置会重新指定补录任务实例的生成周期，目前只会将天实例转换成每月1号生成的实例</p><ul><li>MONTH_CYCLE: 月</li></ul> 
     * @return RedefineCycleType <p>补录实例重新生成周期，如果设置会重新指定补录任务实例的生成周期，目前只会将天实例转换成每月1号生成的实例</p><ul><li>MONTH_CYCLE: 月</li></ul>
     */
    public String getRedefineCycleType() {
        return this.RedefineCycleType;
    }

    /**
     * Set <p>补录实例重新生成周期，如果设置会重新指定补录任务实例的生成周期，目前只会将天实例转换成每月1号生成的实例</p><ul><li>MONTH_CYCLE: 月</li></ul>
     * @param RedefineCycleType <p>补录实例重新生成周期，如果设置会重新指定补录任务实例的生成周期，目前只会将天实例转换成每月1号生成的实例</p><ul><li>MONTH_CYCLE: 月</li></ul>
     */
    public void setRedefineCycleType(String RedefineCycleType) {
        this.RedefineCycleType = RedefineCycleType;
    }

    /**
     * Get <p>存算配置映射列表，对应页面“存算引擎配置”</p> 
     * @return ComputeConfigMappings <p>存算配置映射列表，对应页面“存算引擎配置”</p>
     */
    public ComputeConfigMapping [] getComputeConfigMappings() {
        return this.ComputeConfigMappings;
    }

    /**
     * Set <p>存算配置映射列表，对应页面“存算引擎配置”</p>
     * @param ComputeConfigMappings <p>存算配置映射列表，对应页面“存算引擎配置”</p>
     */
    public void setComputeConfigMappings(ComputeConfigMapping [] ComputeConfigMappings) {
        this.ComputeConfigMappings = ComputeConfigMappings;
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
        if (source.ComputeConfigMappings != null) {
            this.ComputeConfigMappings = new ComputeConfigMapping[source.ComputeConfigMappings.length];
            for (int i = 0; i < source.ComputeConfigMappings.length; i++) {
                this.ComputeConfigMappings[i] = new ComputeConfigMapping(source.ComputeConfigMappings[i]);
            }
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
        this.setParamArrayObj(map, prefix + "ComputeConfigMappings.", this.ComputeConfigMappings);

    }
}

