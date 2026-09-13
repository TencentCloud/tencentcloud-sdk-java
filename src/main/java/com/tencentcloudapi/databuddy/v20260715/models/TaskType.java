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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskType extends AbstractModel {

    /**
    * <p>任务类型：SQL：用于执行SQL查询和数据处理操作；DATA_INTEGRATION：用于离线数据接入操作；NOTEBOOK：用于运行Notebook脚本；RUN_WORKFLOW：用于执行嵌套工作流；PYTHON：用于运行Python脚本；RAY_JOB：用于运行Ray作业；DATA_QUALITY：用于数据质量监控；IF_ELSE：用于条件分支判断；FOR_EACH：用于循环遍历执行；</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTypeName")
    @Expose
    private String TaskTypeName;

    /**
    * <p>Notebook 类型扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Notebook")
    @Expose
    private TaskTypeNotebookExt Notebook;

    /**
    * <p>任务扩展属性列表，具体填写参考 ListWorkflowTaskTypeProperties 接口</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTypePropertyList")
    @Expose
    private TaskTypeProperty [] TaskTypePropertyList;

    /**
    * <p>运行时属性列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuntimePropertyList")
    @Expose
    private TaskTypeProperty [] RuntimePropertyList;

    /**
     * Get <p>任务类型：SQL：用于执行SQL查询和数据处理操作；DATA_INTEGRATION：用于离线数据接入操作；NOTEBOOK：用于运行Notebook脚本；RUN_WORKFLOW：用于执行嵌套工作流；PYTHON：用于运行Python脚本；RAY_JOB：用于运行Ray作业；DATA_QUALITY：用于数据质量监控；IF_ELSE：用于条件分支判断；FOR_EACH：用于循环遍历执行；</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTypeName <p>任务类型：SQL：用于执行SQL查询和数据处理操作；DATA_INTEGRATION：用于离线数据接入操作；NOTEBOOK：用于运行Notebook脚本；RUN_WORKFLOW：用于执行嵌套工作流；PYTHON：用于运行Python脚本；RAY_JOB：用于运行Ray作业；DATA_QUALITY：用于数据质量监控；IF_ELSE：用于条件分支判断；FOR_EACH：用于循环遍历执行；</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskTypeName() {
        return this.TaskTypeName;
    }

    /**
     * Set <p>任务类型：SQL：用于执行SQL查询和数据处理操作；DATA_INTEGRATION：用于离线数据接入操作；NOTEBOOK：用于运行Notebook脚本；RUN_WORKFLOW：用于执行嵌套工作流；PYTHON：用于运行Python脚本；RAY_JOB：用于运行Ray作业；DATA_QUALITY：用于数据质量监控；IF_ELSE：用于条件分支判断；FOR_EACH：用于循环遍历执行；</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTypeName <p>任务类型：SQL：用于执行SQL查询和数据处理操作；DATA_INTEGRATION：用于离线数据接入操作；NOTEBOOK：用于运行Notebook脚本；RUN_WORKFLOW：用于执行嵌套工作流；PYTHON：用于运行Python脚本；RAY_JOB：用于运行Ray作业；DATA_QUALITY：用于数据质量监控；IF_ELSE：用于条件分支判断；FOR_EACH：用于循环遍历执行；</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTypeName(String TaskTypeName) {
        this.TaskTypeName = TaskTypeName;
    }

    /**
     * Get <p>Notebook 类型扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Notebook <p>Notebook 类型扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskTypeNotebookExt getNotebook() {
        return this.Notebook;
    }

    /**
     * Set <p>Notebook 类型扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Notebook <p>Notebook 类型扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotebook(TaskTypeNotebookExt Notebook) {
        this.Notebook = Notebook;
    }

    /**
     * Get <p>任务扩展属性列表，具体填写参考 ListWorkflowTaskTypeProperties 接口</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTypePropertyList <p>任务扩展属性列表，具体填写参考 ListWorkflowTaskTypeProperties 接口</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskTypeProperty [] getTaskTypePropertyList() {
        return this.TaskTypePropertyList;
    }

    /**
     * Set <p>任务扩展属性列表，具体填写参考 ListWorkflowTaskTypeProperties 接口</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTypePropertyList <p>任务扩展属性列表，具体填写参考 ListWorkflowTaskTypeProperties 接口</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTypePropertyList(TaskTypeProperty [] TaskTypePropertyList) {
        this.TaskTypePropertyList = TaskTypePropertyList;
    }

    /**
     * Get <p>运行时属性列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuntimePropertyList <p>运行时属性列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskTypeProperty [] getRuntimePropertyList() {
        return this.RuntimePropertyList;
    }

    /**
     * Set <p>运行时属性列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuntimePropertyList <p>运行时属性列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuntimePropertyList(TaskTypeProperty [] RuntimePropertyList) {
        this.RuntimePropertyList = RuntimePropertyList;
    }

    public TaskType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskType(TaskType source) {
        if (source.TaskTypeName != null) {
            this.TaskTypeName = new String(source.TaskTypeName);
        }
        if (source.Notebook != null) {
            this.Notebook = new TaskTypeNotebookExt(source.Notebook);
        }
        if (source.TaskTypePropertyList != null) {
            this.TaskTypePropertyList = new TaskTypeProperty[source.TaskTypePropertyList.length];
            for (int i = 0; i < source.TaskTypePropertyList.length; i++) {
                this.TaskTypePropertyList[i] = new TaskTypeProperty(source.TaskTypePropertyList[i]);
            }
        }
        if (source.RuntimePropertyList != null) {
            this.RuntimePropertyList = new TaskTypeProperty[source.RuntimePropertyList.length];
            for (int i = 0; i < source.RuntimePropertyList.length; i++) {
                this.RuntimePropertyList[i] = new TaskTypeProperty(source.RuntimePropertyList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskTypeName", this.TaskTypeName);
        this.setParamObj(map, prefix + "Notebook.", this.Notebook);
        this.setParamArrayObj(map, prefix + "TaskTypePropertyList.", this.TaskTypePropertyList);
        this.setParamArrayObj(map, prefix + "RuntimePropertyList.", this.RuntimePropertyList);

    }
}

