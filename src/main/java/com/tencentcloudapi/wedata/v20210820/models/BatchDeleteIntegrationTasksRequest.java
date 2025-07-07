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

public class BatchDeleteIntegrationTasksRequest extends AbstractModel {

    /**
    * 任务id
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * 任务类型，201为实时任务，202为离线任务
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 是否删除开发态任务。默认不删除开发态，为 0 不删除 , 为 1 删除
    */
    @SerializedName("DeleteKFFlag")
    @Expose
    private Long DeleteKFFlag;

    /**
    * 操作名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 本次批量操作涉及任务，用于审计
    */
    @SerializedName("TaskNames")
    @Expose
    private String [] TaskNames;

    /**
     * Get 任务id 
     * @return TaskIds 任务id
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set 任务id
     * @param TaskIds 任务id
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get 任务类型，201为实时任务，202为离线任务 
     * @return TaskType 任务类型，201为实时任务，202为离线任务
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型，201为实时任务，202为离线任务
     * @param TaskType 任务类型，201为实时任务，202为离线任务
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

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
     * Get 是否删除开发态任务。默认不删除开发态，为 0 不删除 , 为 1 删除 
     * @return DeleteKFFlag 是否删除开发态任务。默认不删除开发态，为 0 不删除 , 为 1 删除
     */
    public Long getDeleteKFFlag() {
        return this.DeleteKFFlag;
    }

    /**
     * Set 是否删除开发态任务。默认不删除开发态，为 0 不删除 , 为 1 删除
     * @param DeleteKFFlag 是否删除开发态任务。默认不删除开发态，为 0 不删除 , 为 1 删除
     */
    public void setDeleteKFFlag(Long DeleteKFFlag) {
        this.DeleteKFFlag = DeleteKFFlag;
    }

    /**
     * Get 操作名称 
     * @return Name 操作名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 操作名称
     * @param Name 操作名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 本次批量操作涉及任务，用于审计 
     * @return TaskNames 本次批量操作涉及任务，用于审计
     */
    public String [] getTaskNames() {
        return this.TaskNames;
    }

    /**
     * Set 本次批量操作涉及任务，用于审计
     * @param TaskNames 本次批量操作涉及任务，用于审计
     */
    public void setTaskNames(String [] TaskNames) {
        this.TaskNames = TaskNames;
    }

    public BatchDeleteIntegrationTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchDeleteIntegrationTasksRequest(BatchDeleteIntegrationTasksRequest source) {
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DeleteKFFlag != null) {
            this.DeleteKFFlag = new Long(source.DeleteKFFlag);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TaskNames != null) {
            this.TaskNames = new String[source.TaskNames.length];
            for (int i = 0; i < source.TaskNames.length; i++) {
                this.TaskNames[i] = new String(source.TaskNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DeleteKFFlag", this.DeleteKFFlag);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "TaskNames.", this.TaskNames);

    }
}

