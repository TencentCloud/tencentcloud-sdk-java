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

public class TaskOpsInfo extends AbstractModel {

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务名
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 负责人Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 任务状态:
- Y: 调度中
- F: 已下线
- O: 已暂停
- T: 下线中
- INVALID: 已失效
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 文件夹id
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * 文件夹名字
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * 工作流id
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 工作流名称
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 项目名称
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 更新人名称
    */
    @SerializedName("UpdateUserUin")
    @Expose
    private String UpdateUserUin;

    /**
    * 任务类型Id：
* 21:JDBC SQL
* 23:TDSQL-PostgreSQL
* 26:OfflineSynchronization
* 30:Python
* 31:PySpark
* 33:Impala
* 34:Hive SQL
* 35:Shell
* 36:Spark SQL
* 38:Shell Form Mode
* 39:Spark
* 40:TCHouse-P
* 41:Kettle
* 42:Tchouse-X
* 43:TCHouse-X SQL
* 46:DLC Spark
* 47:TiOne
* 48:Trino
* 50:DLC PySpark
* 92:MapReduce
* 130:Branch Node
* 131:Merged Node
* 132:Notebook
* 133:SSH
* 134:StarRocks
* 137:For-each
* 138:Setats SQL
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
    * 任务类型描述
 - 通用数据同步
 - ETLTaskType
 - ETLTaskType
 - python
 - pyspark
 - HiveSQLTaskType
 - shell
 - SparkSQLTaskType
 - JDBCSQLTaskType
 - DLCTaskType
 - ImpalaTaskType
 - CDWTaskType
 - kettle
 - DLCSparkTaskType
 - TiOne机器学习
 - TrinoTaskType
 - DLCPyspark
 - spark
 - mr
 - shell脚本
 - hivesql脚本
 - 自定义业务通用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTypeDesc")
    @Expose
    private String TaskTypeDesc;

    /**
    * 任务周期类型
* ONEOFF_CYCLE: 一次性
* YEAR_CYCLE: 年
* MONTH_CYCLE: 月
* WEEK_CYCLE: 周
* DAY_CYCLE: 天
* HOUR_CYCLE: 小时
* MINUTE_CYCLE: 分钟
* CRONTAB_CYCLE: crontab表达式类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * 资源组id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorGroupId")
    @Expose
    private String ExecutorGroupId;

    /**
    * 调度描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleDesc")
    @Expose
    private String ScheduleDesc;

    /**
    * 资源组名称
    */
    @SerializedName("ExecutorGroupName")
    @Expose
    private String ExecutorGroupName;

    /**
    * 最新调度提交时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastSchedulerCommitTime")
    @Expose
    private String LastSchedulerCommitTime;

    /**
    * 首次执行时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstRunTime")
    @Expose
    private String FirstRunTime;

    /**
    * 最近一次提交时间
    */
    @SerializedName("FirstSubmitTime")
    @Expose
    private String FirstSubmitTime;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最近更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private String LastUpdateTime;

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
     * Get 任务名 
     * @return TaskName 任务名
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名
     * @param TaskName 任务名
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 负责人Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin 负责人Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 负责人Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin 负责人Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 任务状态:
- Y: 调度中
- F: 已下线
- O: 已暂停
- T: 下线中
- INVALID: 已失效 
     * @return Status 任务状态:
- Y: 调度中
- F: 已下线
- O: 已暂停
- T: 下线中
- INVALID: 已失效
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态:
- Y: 调度中
- F: 已下线
- O: 已暂停
- T: 下线中
- INVALID: 已失效
     * @param Status 任务状态:
- Y: 调度中
- F: 已下线
- O: 已暂停
- T: 下线中
- INVALID: 已失效
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 文件夹id 
     * @return FolderId 文件夹id
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set 文件夹id
     * @param FolderId 文件夹id
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get 文件夹名字 
     * @return FolderName 文件夹名字
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set 文件夹名字
     * @param FolderName 文件夹名字
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    /**
     * Get 工作流id 
     * @return WorkflowId 工作流id
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流id
     * @param WorkflowId 工作流id
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 工作流名称 
     * @return WorkflowName 工作流名称
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set 工作流名称
     * @param WorkflowName 工作流名称
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
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
     * Get 项目名称 
     * @return ProjectName 项目名称
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称
     * @param ProjectName 项目名称
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 更新人名称 
     * @return UpdateUserUin 更新人名称
     */
    public String getUpdateUserUin() {
        return this.UpdateUserUin;
    }

    /**
     * Set 更新人名称
     * @param UpdateUserUin 更新人名称
     */
    public void setUpdateUserUin(String UpdateUserUin) {
        this.UpdateUserUin = UpdateUserUin;
    }

    /**
     * Get 任务类型Id：
* 21:JDBC SQL
* 23:TDSQL-PostgreSQL
* 26:OfflineSynchronization
* 30:Python
* 31:PySpark
* 33:Impala
* 34:Hive SQL
* 35:Shell
* 36:Spark SQL
* 38:Shell Form Mode
* 39:Spark
* 40:TCHouse-P
* 41:Kettle
* 42:Tchouse-X
* 43:TCHouse-X SQL
* 46:DLC Spark
* 47:TiOne
* 48:Trino
* 50:DLC PySpark
* 92:MapReduce
* 130:Branch Node
* 131:Merged Node
* 132:Notebook
* 133:SSH
* 134:StarRocks
* 137:For-each
* 138:Setats SQL 
     * @return TaskTypeId 任务类型Id：
* 21:JDBC SQL
* 23:TDSQL-PostgreSQL
* 26:OfflineSynchronization
* 30:Python
* 31:PySpark
* 33:Impala
* 34:Hive SQL
* 35:Shell
* 36:Spark SQL
* 38:Shell Form Mode
* 39:Spark
* 40:TCHouse-P
* 41:Kettle
* 42:Tchouse-X
* 43:TCHouse-X SQL
* 46:DLC Spark
* 47:TiOne
* 48:Trino
* 50:DLC PySpark
* 92:MapReduce
* 130:Branch Node
* 131:Merged Node
* 132:Notebook
* 133:SSH
* 134:StarRocks
* 137:For-each
* 138:Setats SQL
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set 任务类型Id：
* 21:JDBC SQL
* 23:TDSQL-PostgreSQL
* 26:OfflineSynchronization
* 30:Python
* 31:PySpark
* 33:Impala
* 34:Hive SQL
* 35:Shell
* 36:Spark SQL
* 38:Shell Form Mode
* 39:Spark
* 40:TCHouse-P
* 41:Kettle
* 42:Tchouse-X
* 43:TCHouse-X SQL
* 46:DLC Spark
* 47:TiOne
* 48:Trino
* 50:DLC PySpark
* 92:MapReduce
* 130:Branch Node
* 131:Merged Node
* 132:Notebook
* 133:SSH
* 134:StarRocks
* 137:For-each
* 138:Setats SQL
     * @param TaskTypeId 任务类型Id：
* 21:JDBC SQL
* 23:TDSQL-PostgreSQL
* 26:OfflineSynchronization
* 30:Python
* 31:PySpark
* 33:Impala
* 34:Hive SQL
* 35:Shell
* 36:Spark SQL
* 38:Shell Form Mode
* 39:Spark
* 40:TCHouse-P
* 41:Kettle
* 42:Tchouse-X
* 43:TCHouse-X SQL
* 46:DLC Spark
* 47:TiOne
* 48:Trino
* 50:DLC PySpark
* 92:MapReduce
* 130:Branch Node
* 131:Merged Node
* 132:Notebook
* 133:SSH
* 134:StarRocks
* 137:For-each
* 138:Setats SQL
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get 任务类型描述
 - 通用数据同步
 - ETLTaskType
 - ETLTaskType
 - python
 - pyspark
 - HiveSQLTaskType
 - shell
 - SparkSQLTaskType
 - JDBCSQLTaskType
 - DLCTaskType
 - ImpalaTaskType
 - CDWTaskType
 - kettle
 - DLCSparkTaskType
 - TiOne机器学习
 - TrinoTaskType
 - DLCPyspark
 - spark
 - mr
 - shell脚本
 - hivesql脚本
 - 自定义业务通用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTypeDesc 任务类型描述
 - 通用数据同步
 - ETLTaskType
 - ETLTaskType
 - python
 - pyspark
 - HiveSQLTaskType
 - shell
 - SparkSQLTaskType
 - JDBCSQLTaskType
 - DLCTaskType
 - ImpalaTaskType
 - CDWTaskType
 - kettle
 - DLCSparkTaskType
 - TiOne机器学习
 - TrinoTaskType
 - DLCPyspark
 - spark
 - mr
 - shell脚本
 - hivesql脚本
 - 自定义业务通用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskTypeDesc() {
        return this.TaskTypeDesc;
    }

    /**
     * Set 任务类型描述
 - 通用数据同步
 - ETLTaskType
 - ETLTaskType
 - python
 - pyspark
 - HiveSQLTaskType
 - shell
 - SparkSQLTaskType
 - JDBCSQLTaskType
 - DLCTaskType
 - ImpalaTaskType
 - CDWTaskType
 - kettle
 - DLCSparkTaskType
 - TiOne机器学习
 - TrinoTaskType
 - DLCPyspark
 - spark
 - mr
 - shell脚本
 - hivesql脚本
 - 自定义业务通用
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTypeDesc 任务类型描述
 - 通用数据同步
 - ETLTaskType
 - ETLTaskType
 - python
 - pyspark
 - HiveSQLTaskType
 - shell
 - SparkSQLTaskType
 - JDBCSQLTaskType
 - DLCTaskType
 - ImpalaTaskType
 - CDWTaskType
 - kettle
 - DLCSparkTaskType
 - TiOne机器学习
 - TrinoTaskType
 - DLCPyspark
 - spark
 - mr
 - shell脚本
 - hivesql脚本
 - 自定义业务通用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTypeDesc(String TaskTypeDesc) {
        this.TaskTypeDesc = TaskTypeDesc;
    }

    /**
     * Get 任务周期类型
* ONEOFF_CYCLE: 一次性
* YEAR_CYCLE: 年
* MONTH_CYCLE: 月
* WEEK_CYCLE: 周
* DAY_CYCLE: 天
* HOUR_CYCLE: 小时
* MINUTE_CYCLE: 分钟
* CRONTAB_CYCLE: crontab表达式类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleType 任务周期类型
* ONEOFF_CYCLE: 一次性
* YEAR_CYCLE: 年
* MONTH_CYCLE: 月
* WEEK_CYCLE: 周
* DAY_CYCLE: 天
* HOUR_CYCLE: 小时
* MINUTE_CYCLE: 分钟
* CRONTAB_CYCLE: crontab表达式类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set 任务周期类型
* ONEOFF_CYCLE: 一次性
* YEAR_CYCLE: 年
* MONTH_CYCLE: 月
* WEEK_CYCLE: 周
* DAY_CYCLE: 天
* HOUR_CYCLE: 小时
* MINUTE_CYCLE: 分钟
* CRONTAB_CYCLE: crontab表达式类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleType 任务周期类型
* ONEOFF_CYCLE: 一次性
* YEAR_CYCLE: 年
* MONTH_CYCLE: 月
* WEEK_CYCLE: 周
* DAY_CYCLE: 天
* HOUR_CYCLE: 小时
* MINUTE_CYCLE: 分钟
* CRONTAB_CYCLE: crontab表达式类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get 资源组id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorGroupId 资源组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutorGroupId() {
        return this.ExecutorGroupId;
    }

    /**
     * Set 资源组id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorGroupId 资源组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorGroupId(String ExecutorGroupId) {
        this.ExecutorGroupId = ExecutorGroupId;
    }

    /**
     * Get 调度描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleDesc 调度描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduleDesc() {
        return this.ScheduleDesc;
    }

    /**
     * Set 调度描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleDesc 调度描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleDesc(String ScheduleDesc) {
        this.ScheduleDesc = ScheduleDesc;
    }

    /**
     * Get 资源组名称 
     * @return ExecutorGroupName 资源组名称
     */
    public String getExecutorGroupName() {
        return this.ExecutorGroupName;
    }

    /**
     * Set 资源组名称
     * @param ExecutorGroupName 资源组名称
     */
    public void setExecutorGroupName(String ExecutorGroupName) {
        this.ExecutorGroupName = ExecutorGroupName;
    }

    /**
     * Get 最新调度提交时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastSchedulerCommitTime 最新调度提交时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastSchedulerCommitTime() {
        return this.LastSchedulerCommitTime;
    }

    /**
     * Set 最新调度提交时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastSchedulerCommitTime 最新调度提交时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastSchedulerCommitTime(String LastSchedulerCommitTime) {
        this.LastSchedulerCommitTime = LastSchedulerCommitTime;
    }

    /**
     * Get 首次执行时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstRunTime 首次执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFirstRunTime() {
        return this.FirstRunTime;
    }

    /**
     * Set 首次执行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstRunTime 首次执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstRunTime(String FirstRunTime) {
        this.FirstRunTime = FirstRunTime;
    }

    /**
     * Get 最近一次提交时间 
     * @return FirstSubmitTime 最近一次提交时间
     */
    public String getFirstSubmitTime() {
        return this.FirstSubmitTime;
    }

    /**
     * Set 最近一次提交时间
     * @param FirstSubmitTime 最近一次提交时间
     */
    public void setFirstSubmitTime(String FirstSubmitTime) {
        this.FirstSubmitTime = FirstSubmitTime;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最近更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastUpdateTime 最近更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set 最近更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastUpdateTime 最近更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastUpdateTime(String LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    public TaskOpsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskOpsInfo(TaskOpsInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.UpdateUserUin != null) {
            this.UpdateUserUin = new String(source.UpdateUserUin);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new Long(source.TaskTypeId);
        }
        if (source.TaskTypeDesc != null) {
            this.TaskTypeDesc = new String(source.TaskTypeDesc);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.ExecutorGroupId != null) {
            this.ExecutorGroupId = new String(source.ExecutorGroupId);
        }
        if (source.ScheduleDesc != null) {
            this.ScheduleDesc = new String(source.ScheduleDesc);
        }
        if (source.ExecutorGroupName != null) {
            this.ExecutorGroupName = new String(source.ExecutorGroupName);
        }
        if (source.LastSchedulerCommitTime != null) {
            this.LastSchedulerCommitTime = new String(source.LastSchedulerCommitTime);
        }
        if (source.FirstRunTime != null) {
            this.FirstRunTime = new String(source.FirstRunTime);
        }
        if (source.FirstSubmitTime != null) {
            this.FirstSubmitTime = new String(source.FirstSubmitTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new String(source.LastUpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "UpdateUserUin", this.UpdateUserUin);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "TaskTypeDesc", this.TaskTypeDesc);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "ExecutorGroupId", this.ExecutorGroupId);
        this.setParamSimple(map, prefix + "ScheduleDesc", this.ScheduleDesc);
        this.setParamSimple(map, prefix + "ExecutorGroupName", this.ExecutorGroupName);
        this.setParamSimple(map, prefix + "LastSchedulerCommitTime", this.LastSchedulerCommitTime);
        this.setParamSimple(map, prefix + "FirstRunTime", this.FirstRunTime);
        this.setParamSimple(map, prefix + "FirstSubmitTime", this.FirstSubmitTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);

    }
}

