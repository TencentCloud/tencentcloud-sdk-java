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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SchedulesInfo extends AbstractModel{

    /**
    * 编排唯一标识。
    */
    @SerializedName("ScheduleId")
    @Expose
    private Long ScheduleId;

    /**
    * 编排名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleName")
    @Expose
    private String ScheduleName;

    /**
    * 编排状态，取值范围：
Enabled：已启用，
Disabled：已禁用。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 编排绑定的触发规则。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Trigger")
    @Expose
    private WorkflowTrigger Trigger;

    /**
    * 编排任务列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Activities")
    @Expose
    private Activity [] Activities;

    /**
    * 媒体处理的文件输出存储位置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * 媒体处理生成的文件输出的目标目录。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputDir")
    @Expose
    private String OutputDir;

    /**
    * 任务的事件通知配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskNotifyConfig")
    @Expose
    private TaskNotifyConfig TaskNotifyConfig;

    /**
    * 创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最后编辑时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleName 编排名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduleName() {
        return this.ScheduleName;
    }

    /**
     * Set 编排名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleName 编排名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleName(String ScheduleName) {
        this.ScheduleName = ScheduleName;
    }

    /**
     * Get 编排状态，取值范围：
Enabled：已启用，
Disabled：已禁用。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 编排状态，取值范围：
Enabled：已启用，
Disabled：已禁用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 编排状态，取值范围：
Enabled：已启用，
Disabled：已禁用。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 编排状态，取值范围：
Enabled：已启用，
Disabled：已禁用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 编排绑定的触发规则。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Trigger 编排绑定的触发规则。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkflowTrigger getTrigger() {
        return this.Trigger;
    }

    /**
     * Set 编排绑定的触发规则。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Trigger 编排绑定的触发规则。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrigger(WorkflowTrigger Trigger) {
        this.Trigger = Trigger;
    }

    /**
     * Get 编排任务列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Activities 编排任务列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Activity [] getActivities() {
        return this.Activities;
    }

    /**
     * Set 编排任务列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Activities 编排任务列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivities(Activity [] Activities) {
        this.Activities = Activities;
    }

    /**
     * Get 媒体处理的文件输出存储位置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputStorage 媒体处理的文件输出存储位置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set 媒体处理的文件输出存储位置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputStorage 媒体处理的文件输出存储位置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get 媒体处理生成的文件输出的目标目录。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputDir 媒体处理生成的文件输出的目标目录。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutputDir() {
        return this.OutputDir;
    }

    /**
     * Set 媒体处理生成的文件输出的目标目录。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputDir 媒体处理生成的文件输出的目标目录。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputDir(String OutputDir) {
        this.OutputDir = OutputDir;
    }

    /**
     * Get 任务的事件通知配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskNotifyConfig 任务的事件通知配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskNotifyConfig getTaskNotifyConfig() {
        return this.TaskNotifyConfig;
    }

    /**
     * Set 任务的事件通知配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskNotifyConfig 任务的事件通知配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskNotifyConfig(TaskNotifyConfig TaskNotifyConfig) {
        this.TaskNotifyConfig = TaskNotifyConfig;
    }

    /**
     * Get 创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最后编辑时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 最后编辑时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最后编辑时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 最后编辑时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public SchedulesInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SchedulesInfo(SchedulesInfo source) {
        if (source.ScheduleId != null) {
            this.ScheduleId = new Long(source.ScheduleId);
        }
        if (source.ScheduleName != null) {
            this.ScheduleName = new String(source.ScheduleName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
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
        this.setParamSimple(map, prefix + "ScheduleId", this.ScheduleId);
        this.setParamSimple(map, prefix + "ScheduleName", this.ScheduleName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Trigger.", this.Trigger);
        this.setParamArrayObj(map, prefix + "Activities.", this.Activities);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputDir", this.OutputDir);
        this.setParamObj(map, prefix + "TaskNotifyConfig.", this.TaskNotifyConfig);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

