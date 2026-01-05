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

public class CreateTaskFolderRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 父文件夹绝对路径，如/abc/de，如果是根目录则传/
    */
    @SerializedName("ParentTaskFolderPath")
    @Expose
    private String ParentTaskFolderPath;

    /**
    * 要创建的文件夹名字
    */
    @SerializedName("TaskFolderName")
    @Expose
    private String TaskFolderName;

    /**
    * 任务文件夹类型

| 任务文件夹类型取值 | 任务文件夹类型界面对应名称 |
| ---------------- | ------------------------ |
| ETL              | 集成任务                 |
| EMR              | EMR                      |
| DLC              | DLC                      |
| SETATS           | SETATS                   |
| TDSQL            | TDSQL                    |
| TCHOUSE          | TCHOUSE                  |
| GENERAL          | 通用                     |
| TI_ONE           | TI-ONE机器学习           |
| ACROSS_WORKFLOWS | 跨工作流                 |
    */
    @SerializedName("TaskFolderType")
    @Expose
    private String TaskFolderType;

    /**
    * 工作流ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

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
     * Get 父文件夹绝对路径，如/abc/de，如果是根目录则传/ 
     * @return ParentTaskFolderPath 父文件夹绝对路径，如/abc/de，如果是根目录则传/
     */
    public String getParentTaskFolderPath() {
        return this.ParentTaskFolderPath;
    }

    /**
     * Set 父文件夹绝对路径，如/abc/de，如果是根目录则传/
     * @param ParentTaskFolderPath 父文件夹绝对路径，如/abc/de，如果是根目录则传/
     */
    public void setParentTaskFolderPath(String ParentTaskFolderPath) {
        this.ParentTaskFolderPath = ParentTaskFolderPath;
    }

    /**
     * Get 要创建的文件夹名字 
     * @return TaskFolderName 要创建的文件夹名字
     */
    public String getTaskFolderName() {
        return this.TaskFolderName;
    }

    /**
     * Set 要创建的文件夹名字
     * @param TaskFolderName 要创建的文件夹名字
     */
    public void setTaskFolderName(String TaskFolderName) {
        this.TaskFolderName = TaskFolderName;
    }

    /**
     * Get 任务文件夹类型

| 任务文件夹类型取值 | 任务文件夹类型界面对应名称 |
| ---------------- | ------------------------ |
| ETL              | 集成任务                 |
| EMR              | EMR                      |
| DLC              | DLC                      |
| SETATS           | SETATS                   |
| TDSQL            | TDSQL                    |
| TCHOUSE          | TCHOUSE                  |
| GENERAL          | 通用                     |
| TI_ONE           | TI-ONE机器学习           |
| ACROSS_WORKFLOWS | 跨工作流                 | 
     * @return TaskFolderType 任务文件夹类型

| 任务文件夹类型取值 | 任务文件夹类型界面对应名称 |
| ---------------- | ------------------------ |
| ETL              | 集成任务                 |
| EMR              | EMR                      |
| DLC              | DLC                      |
| SETATS           | SETATS                   |
| TDSQL            | TDSQL                    |
| TCHOUSE          | TCHOUSE                  |
| GENERAL          | 通用                     |
| TI_ONE           | TI-ONE机器学习           |
| ACROSS_WORKFLOWS | 跨工作流                 |
     */
    public String getTaskFolderType() {
        return this.TaskFolderType;
    }

    /**
     * Set 任务文件夹类型

| 任务文件夹类型取值 | 任务文件夹类型界面对应名称 |
| ---------------- | ------------------------ |
| ETL              | 集成任务                 |
| EMR              | EMR                      |
| DLC              | DLC                      |
| SETATS           | SETATS                   |
| TDSQL            | TDSQL                    |
| TCHOUSE          | TCHOUSE                  |
| GENERAL          | 通用                     |
| TI_ONE           | TI-ONE机器学习           |
| ACROSS_WORKFLOWS | 跨工作流                 |
     * @param TaskFolderType 任务文件夹类型

| 任务文件夹类型取值 | 任务文件夹类型界面对应名称 |
| ---------------- | ------------------------ |
| ETL              | 集成任务                 |
| EMR              | EMR                      |
| DLC              | DLC                      |
| SETATS           | SETATS                   |
| TDSQL            | TDSQL                    |
| TCHOUSE          | TCHOUSE                  |
| GENERAL          | 通用                     |
| TI_ONE           | TI-ONE机器学习           |
| ACROSS_WORKFLOWS | 跨工作流                 |
     */
    public void setTaskFolderType(String TaskFolderType) {
        this.TaskFolderType = TaskFolderType;
    }

    /**
     * Get 工作流ID 
     * @return WorkflowId 工作流ID
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流ID
     * @param WorkflowId 工作流ID
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    public CreateTaskFolderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTaskFolderRequest(CreateTaskFolderRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ParentTaskFolderPath != null) {
            this.ParentTaskFolderPath = new String(source.ParentTaskFolderPath);
        }
        if (source.TaskFolderName != null) {
            this.TaskFolderName = new String(source.TaskFolderName);
        }
        if (source.TaskFolderType != null) {
            this.TaskFolderType = new String(source.TaskFolderType);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ParentTaskFolderPath", this.ParentTaskFolderPath);
        this.setParamSimple(map, prefix + "TaskFolderName", this.TaskFolderName);
        this.setParamSimple(map, prefix + "TaskFolderType", this.TaskFolderType);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);

    }
}

