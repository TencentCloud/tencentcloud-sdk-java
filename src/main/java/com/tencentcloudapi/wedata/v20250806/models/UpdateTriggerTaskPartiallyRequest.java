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

public class UpdateTriggerTaskPartiallyRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务基本属性
    */
    @SerializedName("NewSetting")
    @Expose
    private UpdateTriggerTaskPart NewSetting;

    /**
    * 删除字段内容，采用属性路径的形式标识，删除的值以":"分割，多个值以","分割 // 删除调度参数中 ParamKey 为 aa,bb 的属性 "TaskConfiguration/TaskSchedulingParameterList:aa,bb" // 删除上游依赖中 TaskId 为 2509162129381111,2509162129381112 的上游依赖 "TaskSchedulerConfiguration/UpstreamDependencyConfigList:2509162129381111,2509162129381112" // 删除下游循环依赖中 TaskId 为 2509162129382222,2509162129382223 的下游依赖 "TaskSchedulerConfiguration/DownStreamDependencyConfigList:2509162129382222,2509162129382223" // 删除事件中 EventName 为 event_250916_213234,event_250916_213235 的事件 "TaskSchedulerConfiguration/EventListenerList:event_250916_213234,event_250916_213235" // 删除传递参数输出中 ParamKey 为 pp_out,pp_1 的参数 "TaskSchedulerConfiguration/ParamTaskOutList:pp_out,pp_1" // 删除传递参数应用中 ParamKey 为 pp_in,pp_1 的参数 "TaskSchedulerConfiguration/ParamTaskInList:pp_in,pp_1" // 删除产品登记中 TablePhysicalId 为6578laxif4d1的产出登记 "TaskSchedulerConfiguration/TaskOutputRegistryList:6578laxif4d1"
    */
    @SerializedName("FieldToRemoveList")
    @Expose
    private String [] FieldToRemoveList;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务基本属性 
     * @return NewSetting 任务基本属性
     */
    public UpdateTriggerTaskPart getNewSetting() {
        return this.NewSetting;
    }

    /**
     * Set 任务基本属性
     * @param NewSetting 任务基本属性
     */
    public void setNewSetting(UpdateTriggerTaskPart NewSetting) {
        this.NewSetting = NewSetting;
    }

    /**
     * Get 删除字段内容，采用属性路径的形式标识，删除的值以":"分割，多个值以","分割 // 删除调度参数中 ParamKey 为 aa,bb 的属性 "TaskConfiguration/TaskSchedulingParameterList:aa,bb" // 删除上游依赖中 TaskId 为 2509162129381111,2509162129381112 的上游依赖 "TaskSchedulerConfiguration/UpstreamDependencyConfigList:2509162129381111,2509162129381112" // 删除下游循环依赖中 TaskId 为 2509162129382222,2509162129382223 的下游依赖 "TaskSchedulerConfiguration/DownStreamDependencyConfigList:2509162129382222,2509162129382223" // 删除事件中 EventName 为 event_250916_213234,event_250916_213235 的事件 "TaskSchedulerConfiguration/EventListenerList:event_250916_213234,event_250916_213235" // 删除传递参数输出中 ParamKey 为 pp_out,pp_1 的参数 "TaskSchedulerConfiguration/ParamTaskOutList:pp_out,pp_1" // 删除传递参数应用中 ParamKey 为 pp_in,pp_1 的参数 "TaskSchedulerConfiguration/ParamTaskInList:pp_in,pp_1" // 删除产品登记中 TablePhysicalId 为6578laxif4d1的产出登记 "TaskSchedulerConfiguration/TaskOutputRegistryList:6578laxif4d1" 
     * @return FieldToRemoveList 删除字段内容，采用属性路径的形式标识，删除的值以":"分割，多个值以","分割 // 删除调度参数中 ParamKey 为 aa,bb 的属性 "TaskConfiguration/TaskSchedulingParameterList:aa,bb" // 删除上游依赖中 TaskId 为 2509162129381111,2509162129381112 的上游依赖 "TaskSchedulerConfiguration/UpstreamDependencyConfigList:2509162129381111,2509162129381112" // 删除下游循环依赖中 TaskId 为 2509162129382222,2509162129382223 的下游依赖 "TaskSchedulerConfiguration/DownStreamDependencyConfigList:2509162129382222,2509162129382223" // 删除事件中 EventName 为 event_250916_213234,event_250916_213235 的事件 "TaskSchedulerConfiguration/EventListenerList:event_250916_213234,event_250916_213235" // 删除传递参数输出中 ParamKey 为 pp_out,pp_1 的参数 "TaskSchedulerConfiguration/ParamTaskOutList:pp_out,pp_1" // 删除传递参数应用中 ParamKey 为 pp_in,pp_1 的参数 "TaskSchedulerConfiguration/ParamTaskInList:pp_in,pp_1" // 删除产品登记中 TablePhysicalId 为6578laxif4d1的产出登记 "TaskSchedulerConfiguration/TaskOutputRegistryList:6578laxif4d1"
     */
    public String [] getFieldToRemoveList() {
        return this.FieldToRemoveList;
    }

    /**
     * Set 删除字段内容，采用属性路径的形式标识，删除的值以":"分割，多个值以","分割 // 删除调度参数中 ParamKey 为 aa,bb 的属性 "TaskConfiguration/TaskSchedulingParameterList:aa,bb" // 删除上游依赖中 TaskId 为 2509162129381111,2509162129381112 的上游依赖 "TaskSchedulerConfiguration/UpstreamDependencyConfigList:2509162129381111,2509162129381112" // 删除下游循环依赖中 TaskId 为 2509162129382222,2509162129382223 的下游依赖 "TaskSchedulerConfiguration/DownStreamDependencyConfigList:2509162129382222,2509162129382223" // 删除事件中 EventName 为 event_250916_213234,event_250916_213235 的事件 "TaskSchedulerConfiguration/EventListenerList:event_250916_213234,event_250916_213235" // 删除传递参数输出中 ParamKey 为 pp_out,pp_1 的参数 "TaskSchedulerConfiguration/ParamTaskOutList:pp_out,pp_1" // 删除传递参数应用中 ParamKey 为 pp_in,pp_1 的参数 "TaskSchedulerConfiguration/ParamTaskInList:pp_in,pp_1" // 删除产品登记中 TablePhysicalId 为6578laxif4d1的产出登记 "TaskSchedulerConfiguration/TaskOutputRegistryList:6578laxif4d1"
     * @param FieldToRemoveList 删除字段内容，采用属性路径的形式标识，删除的值以":"分割，多个值以","分割 // 删除调度参数中 ParamKey 为 aa,bb 的属性 "TaskConfiguration/TaskSchedulingParameterList:aa,bb" // 删除上游依赖中 TaskId 为 2509162129381111,2509162129381112 的上游依赖 "TaskSchedulerConfiguration/UpstreamDependencyConfigList:2509162129381111,2509162129381112" // 删除下游循环依赖中 TaskId 为 2509162129382222,2509162129382223 的下游依赖 "TaskSchedulerConfiguration/DownStreamDependencyConfigList:2509162129382222,2509162129382223" // 删除事件中 EventName 为 event_250916_213234,event_250916_213235 的事件 "TaskSchedulerConfiguration/EventListenerList:event_250916_213234,event_250916_213235" // 删除传递参数输出中 ParamKey 为 pp_out,pp_1 的参数 "TaskSchedulerConfiguration/ParamTaskOutList:pp_out,pp_1" // 删除传递参数应用中 ParamKey 为 pp_in,pp_1 的参数 "TaskSchedulerConfiguration/ParamTaskInList:pp_in,pp_1" // 删除产品登记中 TablePhysicalId 为6578laxif4d1的产出登记 "TaskSchedulerConfiguration/TaskOutputRegistryList:6578laxif4d1"
     */
    public void setFieldToRemoveList(String [] FieldToRemoveList) {
        this.FieldToRemoveList = FieldToRemoveList;
    }

    public UpdateTriggerTaskPartiallyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateTriggerTaskPartiallyRequest(UpdateTriggerTaskPartiallyRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.NewSetting != null) {
            this.NewSetting = new UpdateTriggerTaskPart(source.NewSetting);
        }
        if (source.FieldToRemoveList != null) {
            this.FieldToRemoveList = new String[source.FieldToRemoveList.length];
            for (int i = 0; i < source.FieldToRemoveList.length; i++) {
                this.FieldToRemoveList[i] = new String(source.FieldToRemoveList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamObj(map, prefix + "NewSetting.", this.NewSetting);
        this.setParamArraySimple(map, prefix + "FieldToRemoveList.", this.FieldToRemoveList);

    }
}

