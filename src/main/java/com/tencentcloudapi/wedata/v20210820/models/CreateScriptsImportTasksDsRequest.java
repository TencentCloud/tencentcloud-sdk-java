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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateScriptsImportTasksDsRequest extends AbstractModel {

    /**
    * 任务属性
    */
    @SerializedName("Task")
    @Expose
    private TaskDsDTOLite Task;

    /**
    * 自定义业务实体信息列表
    */
    @SerializedName("EntityDTOList")
    @Expose
    private CustomizeBusinessEntityDTO [] EntityDTOList;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 0:跳过；1:重命名
    */
    @SerializedName("TaskNameExistMode")
    @Expose
    private Long TaskNameExistMode;

    /**
    * 任务目录ID
    */
    @SerializedName("TaskFolderId")
    @Expose
    private String TaskFolderId;

    /**
     * Get 任务属性 
     * @return Task 任务属性
     */
    public TaskDsDTOLite getTask() {
        return this.Task;
    }

    /**
     * Set 任务属性
     * @param Task 任务属性
     */
    public void setTask(TaskDsDTOLite Task) {
        this.Task = Task;
    }

    /**
     * Get 自定义业务实体信息列表 
     * @return EntityDTOList 自定义业务实体信息列表
     */
    public CustomizeBusinessEntityDTO [] getEntityDTOList() {
        return this.EntityDTOList;
    }

    /**
     * Set 自定义业务实体信息列表
     * @param EntityDTOList 自定义业务实体信息列表
     */
    public void setEntityDTOList(CustomizeBusinessEntityDTO [] EntityDTOList) {
        this.EntityDTOList = EntityDTOList;
    }

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
     * Get 0:跳过；1:重命名 
     * @return TaskNameExistMode 0:跳过；1:重命名
     */
    public Long getTaskNameExistMode() {
        return this.TaskNameExistMode;
    }

    /**
     * Set 0:跳过；1:重命名
     * @param TaskNameExistMode 0:跳过；1:重命名
     */
    public void setTaskNameExistMode(Long TaskNameExistMode) {
        this.TaskNameExistMode = TaskNameExistMode;
    }

    /**
     * Get 任务目录ID 
     * @return TaskFolderId 任务目录ID
     */
    public String getTaskFolderId() {
        return this.TaskFolderId;
    }

    /**
     * Set 任务目录ID
     * @param TaskFolderId 任务目录ID
     */
    public void setTaskFolderId(String TaskFolderId) {
        this.TaskFolderId = TaskFolderId;
    }

    public CreateScriptsImportTasksDsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateScriptsImportTasksDsRequest(CreateScriptsImportTasksDsRequest source) {
        if (source.Task != null) {
            this.Task = new TaskDsDTOLite(source.Task);
        }
        if (source.EntityDTOList != null) {
            this.EntityDTOList = new CustomizeBusinessEntityDTO[source.EntityDTOList.length];
            for (int i = 0; i < source.EntityDTOList.length; i++) {
                this.EntityDTOList[i] = new CustomizeBusinessEntityDTO(source.EntityDTOList[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskNameExistMode != null) {
            this.TaskNameExistMode = new Long(source.TaskNameExistMode);
        }
        if (source.TaskFolderId != null) {
            this.TaskFolderId = new String(source.TaskFolderId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Task.", this.Task);
        this.setParamArrayObj(map, prefix + "EntityDTOList.", this.EntityDTOList);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskNameExistMode", this.TaskNameExistMode);
        this.setParamSimple(map, prefix + "TaskFolderId", this.TaskFolderId);

    }
}

