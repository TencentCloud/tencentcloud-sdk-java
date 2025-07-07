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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyScheduleRequest extends AbstractModel {

    /**
    * 编排唯一标识。
    */
    @SerializedName("ScheduleId")
    @Expose
    private Long ScheduleId;

    /**
    * 编排名称。
    */
    @SerializedName("ScheduleName")
    @Expose
    private String ScheduleName;

    /**
    * 编排绑定的触发规则。
    */
    @SerializedName("Trigger")
    @Expose
    private WorkflowTrigger Trigger;

    /**
    * 编排任务列表。
注意：内部不允许部分更新，如果需要更新需全量提交编排任务列表。
    */
    @SerializedName("Activities")
    @Expose
    private Activity [] Activities;

    /**
    * 媒体处理的文件输出存储位置。
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * 媒体处理生成的文件输出的目标目录，必选以 / 开头和结尾。
注意：如果设置为空，则表示取消老配置的OutputDir值。
    */
    @SerializedName("OutputDir")
    @Expose
    private String OutputDir;

    /**
    * 任务的事件通知配置。
    */
    @SerializedName("TaskNotifyConfig")
    @Expose
    private TaskNotifyConfig TaskNotifyConfig;

    /**
    * 资源ID，需要保证对应资源是开启状态。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get 编排唯一标识。 
     * @return ScheduleId 编排唯一标识。
     */
    public Long getScheduleId() {
        return this.ScheduleId;
    }

    /**
     * Set 编排唯一标识。
     * @param ScheduleId 编排唯一标识。
     */
    public void setScheduleId(Long ScheduleId) {
        this.ScheduleId = ScheduleId;
    }

    /**
     * Get 编排名称。 
     * @return ScheduleName 编排名称。
     */
    public String getScheduleName() {
        return this.ScheduleName;
    }

    /**
     * Set 编排名称。
     * @param ScheduleName 编排名称。
     */
    public void setScheduleName(String ScheduleName) {
        this.ScheduleName = ScheduleName;
    }

    /**
     * Get 编排绑定的触发规则。 
     * @return Trigger 编排绑定的触发规则。
     */
    public WorkflowTrigger getTrigger() {
        return this.Trigger;
    }

    /**
     * Set 编排绑定的触发规则。
     * @param Trigger 编排绑定的触发规则。
     */
    public void setTrigger(WorkflowTrigger Trigger) {
        this.Trigger = Trigger;
    }

    /**
     * Get 编排任务列表。
注意：内部不允许部分更新，如果需要更新需全量提交编排任务列表。 
     * @return Activities 编排任务列表。
注意：内部不允许部分更新，如果需要更新需全量提交编排任务列表。
     */
    public Activity [] getActivities() {
        return this.Activities;
    }

    /**
     * Set 编排任务列表。
注意：内部不允许部分更新，如果需要更新需全量提交编排任务列表。
     * @param Activities 编排任务列表。
注意：内部不允许部分更新，如果需要更新需全量提交编排任务列表。
     */
    public void setActivities(Activity [] Activities) {
        this.Activities = Activities;
    }

    /**
     * Get 媒体处理的文件输出存储位置。 
     * @return OutputStorage 媒体处理的文件输出存储位置。
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set 媒体处理的文件输出存储位置。
     * @param OutputStorage 媒体处理的文件输出存储位置。
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get 媒体处理生成的文件输出的目标目录，必选以 / 开头和结尾。
注意：如果设置为空，则表示取消老配置的OutputDir值。 
     * @return OutputDir 媒体处理生成的文件输出的目标目录，必选以 / 开头和结尾。
注意：如果设置为空，则表示取消老配置的OutputDir值。
     */
    public String getOutputDir() {
        return this.OutputDir;
    }

    /**
     * Set 媒体处理生成的文件输出的目标目录，必选以 / 开头和结尾。
注意：如果设置为空，则表示取消老配置的OutputDir值。
     * @param OutputDir 媒体处理生成的文件输出的目标目录，必选以 / 开头和结尾。
注意：如果设置为空，则表示取消老配置的OutputDir值。
     */
    public void setOutputDir(String OutputDir) {
        this.OutputDir = OutputDir;
    }

    /**
     * Get 任务的事件通知配置。 
     * @return TaskNotifyConfig 任务的事件通知配置。
     */
    public TaskNotifyConfig getTaskNotifyConfig() {
        return this.TaskNotifyConfig;
    }

    /**
     * Set 任务的事件通知配置。
     * @param TaskNotifyConfig 任务的事件通知配置。
     */
    public void setTaskNotifyConfig(TaskNotifyConfig TaskNotifyConfig) {
        this.TaskNotifyConfig = TaskNotifyConfig;
    }

    /**
     * Get 资源ID，需要保证对应资源是开启状态。 
     * @return ResourceId 资源ID，需要保证对应资源是开启状态。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID，需要保证对应资源是开启状态。
     * @param ResourceId 资源ID，需要保证对应资源是开启状态。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public ModifyScheduleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyScheduleRequest(ModifyScheduleRequest source) {
        if (source.ScheduleId != null) {
            this.ScheduleId = new Long(source.ScheduleId);
        }
        if (source.ScheduleName != null) {
            this.ScheduleName = new String(source.ScheduleName);
        }
        if (source.Trigger != null) {
            this.Trigger = new WorkflowTrigger(source.Trigger);
        }
        if (source.Activities != null) {
            this.Activities = new Activity[source.Activities.length];
            for (int i = 0; i < source.Activities.length; i++) {
                this.Activities[i] = new Activity(source.Activities[i]);
            }
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.OutputDir != null) {
            this.OutputDir = new String(source.OutputDir);
        }
        if (source.TaskNotifyConfig != null) {
            this.TaskNotifyConfig = new TaskNotifyConfig(source.TaskNotifyConfig);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScheduleId", this.ScheduleId);
        this.setParamSimple(map, prefix + "ScheduleName", this.ScheduleName);
        this.setParamObj(map, prefix + "Trigger.", this.Trigger);
        this.setParamArrayObj(map, prefix + "Activities.", this.Activities);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputDir", this.OutputDir);
        this.setParamObj(map, prefix + "TaskNotifyConfig.", this.TaskNotifyConfig);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

