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

public class TriggerTaskBaseAttribute extends AbstractModel {

    /**
    * 任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务类型ID：

- 26:OfflineSynchronization
- 30:Python
- 32:DLC SQL
- 35:Shell
- 38:Shell Form Mode
- 46:DLC Spark
- 50:DLC PySpark
- 130:Branch Node
- 131:Merged Node
- 132:Notebook
- 133:SSH
- 137:For-each
- 139:DLC Spark Streaming
- 140:Run Workflow
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
    * 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 最近一次保存版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskLatestVersionNo")
    @Expose
    private String TaskLatestVersionNo;

    /**
    * 最近一次提交的版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskLatestSubmitVersionNo")
    @Expose
    private String TaskLatestSubmitVersionNo;

    /**
    * 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * 任务状态：
* N: 新建
* Y: 调度中

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务最新提交状态，任务是否已经提交：true/false
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Submit")
    @Expose
    private Boolean Submit;

    /**
    * 任务创建时间，示例：2022-02-12 11:13:41
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最后更新时间，示例：2025-08-13 16:34:06
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private String LastUpdateTime;

    /**
    * 最后更新人名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastUpdateUserName")
    @Expose
    private String LastUpdateUserName;

    /**
    * 最后运维时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastOpsTime")
    @Expose
    private String LastOpsTime;

    /**
    * 最后运维人名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastOpsUserName")
    @Expose
    private String LastOpsUserName;

    /**
    * 任务负责人ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 任务描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskDescription")
    @Expose
    private String TaskDescription;

    /**
    * 最近一次更新用户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateUserUin")
    @Expose
    private String UpdateUserUin;

    /**
    * 创建用户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * 任务文件夹路径

注意：

路径上不要填写任务节点类型；例如，在 一个名为 wf01 的工作流，“通用” 分类下，现在想要在这个分类下的 tf_01 文件夹下，新建一个 shell 任务；则 填写 /tf_01 即可；
如果 tf_01 文件夹不存在，则需要先创建这个文件夹（使用 CreateTaskFolder 接口）才能操作成功；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskFolderPath")
    @Expose
    private String TaskFolderPath;

    /**
     * Get 任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务类型ID：

- 26:OfflineSynchronization
- 30:Python
- 32:DLC SQL
- 35:Shell
- 38:Shell Form Mode
- 46:DLC Spark
- 50:DLC PySpark
- 130:Branch Node
- 131:Merged Node
- 132:Notebook
- 133:SSH
- 137:For-each
- 139:DLC Spark Streaming
- 140:Run Workflow
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTypeId 任务类型ID：

- 26:OfflineSynchronization
- 30:Python
- 32:DLC SQL
- 35:Shell
- 38:Shell Form Mode
- 46:DLC Spark
- 50:DLC PySpark
- 130:Branch Node
- 131:Merged Node
- 132:Notebook
- 133:SSH
- 137:For-each
- 139:DLC Spark Streaming
- 140:Run Workflow
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set 任务类型ID：

- 26:OfflineSynchronization
- 30:Python
- 32:DLC SQL
- 35:Shell
- 38:Shell Form Mode
- 46:DLC Spark
- 50:DLC PySpark
- 130:Branch Node
- 131:Merged Node
- 132:Notebook
- 133:SSH
- 137:For-each
- 139:DLC Spark Streaming
- 140:Run Workflow
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTypeId 任务类型ID：

- 26:OfflineSynchronization
- 30:Python
- 32:DLC SQL
- 35:Shell
- 38:Shell Form Mode
- 46:DLC Spark
- 50:DLC PySpark
- 130:Branch Node
- 131:Merged Node
- 132:Notebook
- 133:SSH
- 137:For-each
- 139:DLC Spark Streaming
- 140:Run Workflow
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get 工作流ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowId 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowId 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 最近一次保存版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskLatestVersionNo 最近一次保存版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskLatestVersionNo() {
        return this.TaskLatestVersionNo;
    }

    /**
     * Set 最近一次保存版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskLatestVersionNo 最近一次保存版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskLatestVersionNo(String TaskLatestVersionNo) {
        this.TaskLatestVersionNo = TaskLatestVersionNo;
    }

    /**
     * Get 最近一次提交的版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskLatestSubmitVersionNo 最近一次提交的版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskLatestSubmitVersionNo() {
        return this.TaskLatestSubmitVersionNo;
    }

    /**
     * Set 最近一次提交的版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskLatestSubmitVersionNo 最近一次提交的版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskLatestSubmitVersionNo(String TaskLatestSubmitVersionNo) {
        this.TaskLatestSubmitVersionNo = TaskLatestSubmitVersionNo;
    }

    /**
     * Get 工作流名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowName 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowName 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get 任务状态：
* N: 新建
* Y: 调度中

注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 任务状态：
* N: 新建
* Y: 调度中

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态：
* N: 新建
* Y: 调度中

注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 任务状态：
* N: 新建
* Y: 调度中

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务最新提交状态，任务是否已经提交：true/false
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Submit 任务最新提交状态，任务是否已经提交：true/false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSubmit() {
        return this.Submit;
    }

    /**
     * Set 任务最新提交状态，任务是否已经提交：true/false
注意：此字段可能返回 null，表示取不到有效值。
     * @param Submit 任务最新提交状态，任务是否已经提交：true/false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubmit(Boolean Submit) {
        this.Submit = Submit;
    }

    /**
     * Get 任务创建时间，示例：2022-02-12 11:13:41
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 任务创建时间，示例：2022-02-12 11:13:41
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建时间，示例：2022-02-12 11:13:41
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 任务创建时间，示例：2022-02-12 11:13:41
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最后更新时间，示例：2025-08-13 16:34:06
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastUpdateTime 最后更新时间，示例：2025-08-13 16:34:06
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set 最后更新时间，示例：2025-08-13 16:34:06
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastUpdateTime 最后更新时间，示例：2025-08-13 16:34:06
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastUpdateTime(String LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get 最后更新人名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastUpdateUserName 最后更新人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastUpdateUserName() {
        return this.LastUpdateUserName;
    }

    /**
     * Set 最后更新人名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastUpdateUserName 最后更新人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastUpdateUserName(String LastUpdateUserName) {
        this.LastUpdateUserName = LastUpdateUserName;
    }

    /**
     * Get 最后运维时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastOpsTime 最后运维时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastOpsTime() {
        return this.LastOpsTime;
    }

    /**
     * Set 最后运维时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastOpsTime 最后运维时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastOpsTime(String LastOpsTime) {
        this.LastOpsTime = LastOpsTime;
    }

    /**
     * Get 最后运维人名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastOpsUserName 最后运维人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastOpsUserName() {
        return this.LastOpsUserName;
    }

    /**
     * Set 最后运维人名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastOpsUserName 最后运维人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastOpsUserName(String LastOpsUserName) {
        this.LastOpsUserName = LastOpsUserName;
    }

    /**
     * Get 任务负责人ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin 任务负责人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 任务负责人ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin 任务负责人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 任务描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskDescription 任务描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskDescription() {
        return this.TaskDescription;
    }

    /**
     * Set 任务描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskDescription 任务描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskDescription(String TaskDescription) {
        this.TaskDescription = TaskDescription;
    }

    /**
     * Get 最近一次更新用户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateUserUin 最近一次更新用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateUserUin() {
        return this.UpdateUserUin;
    }

    /**
     * Set 最近一次更新用户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateUserUin 最近一次更新用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateUserUin(String UpdateUserUin) {
        this.UpdateUserUin = UpdateUserUin;
    }

    /**
     * Get 创建用户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUserUin 创建用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set 创建用户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUserUin 创建用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get 任务文件夹路径

注意：

路径上不要填写任务节点类型；例如，在 一个名为 wf01 的工作流，“通用” 分类下，现在想要在这个分类下的 tf_01 文件夹下，新建一个 shell 任务；则 填写 /tf_01 即可；
如果 tf_01 文件夹不存在，则需要先创建这个文件夹（使用 CreateTaskFolder 接口）才能操作成功；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskFolderPath 任务文件夹路径

注意：

路径上不要填写任务节点类型；例如，在 一个名为 wf01 的工作流，“通用” 分类下，现在想要在这个分类下的 tf_01 文件夹下，新建一个 shell 任务；则 填写 /tf_01 即可；
如果 tf_01 文件夹不存在，则需要先创建这个文件夹（使用 CreateTaskFolder 接口）才能操作成功；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskFolderPath() {
        return this.TaskFolderPath;
    }

    /**
     * Set 任务文件夹路径

注意：

路径上不要填写任务节点类型；例如，在 一个名为 wf01 的工作流，“通用” 分类下，现在想要在这个分类下的 tf_01 文件夹下，新建一个 shell 任务；则 填写 /tf_01 即可；
如果 tf_01 文件夹不存在，则需要先创建这个文件夹（使用 CreateTaskFolder 接口）才能操作成功；
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskFolderPath 任务文件夹路径

注意：

路径上不要填写任务节点类型；例如，在 一个名为 wf01 的工作流，“通用” 分类下，现在想要在这个分类下的 tf_01 文件夹下，新建一个 shell 任务；则 填写 /tf_01 即可；
如果 tf_01 文件夹不存在，则需要先创建这个文件夹（使用 CreateTaskFolder 接口）才能操作成功；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskFolderPath(String TaskFolderPath) {
        this.TaskFolderPath = TaskFolderPath;
    }

    public TriggerTaskBaseAttribute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerTaskBaseAttribute(TriggerTaskBaseAttribute source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new Long(source.TaskTypeId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskLatestVersionNo != null) {
            this.TaskLatestVersionNo = new String(source.TaskLatestVersionNo);
        }
        if (source.TaskLatestSubmitVersionNo != null) {
            this.TaskLatestSubmitVersionNo = new String(source.TaskLatestSubmitVersionNo);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Submit != null) {
            this.Submit = new Boolean(source.Submit);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new String(source.LastUpdateTime);
        }
        if (source.LastUpdateUserName != null) {
            this.LastUpdateUserName = new String(source.LastUpdateUserName);
        }
        if (source.LastOpsTime != null) {
            this.LastOpsTime = new String(source.LastOpsTime);
        }
        if (source.LastOpsUserName != null) {
            this.LastOpsUserName = new String(source.LastOpsUserName);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.TaskDescription != null) {
            this.TaskDescription = new String(source.TaskDescription);
        }
        if (source.UpdateUserUin != null) {
            this.UpdateUserUin = new String(source.UpdateUserUin);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.TaskFolderPath != null) {
            this.TaskFolderPath = new String(source.TaskFolderPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskLatestVersionNo", this.TaskLatestVersionNo);
        this.setParamSimple(map, prefix + "TaskLatestSubmitVersionNo", this.TaskLatestSubmitVersionNo);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Submit", this.Submit);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamSimple(map, prefix + "LastUpdateUserName", this.LastUpdateUserName);
        this.setParamSimple(map, prefix + "LastOpsTime", this.LastOpsTime);
        this.setParamSimple(map, prefix + "LastOpsUserName", this.LastOpsUserName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "TaskDescription", this.TaskDescription);
        this.setParamSimple(map, prefix + "UpdateUserUin", this.UpdateUserUin);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "TaskFolderPath", this.TaskFolderPath);

    }
}

