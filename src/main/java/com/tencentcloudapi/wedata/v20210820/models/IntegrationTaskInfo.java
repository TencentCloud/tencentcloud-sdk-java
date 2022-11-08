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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntegrationTaskInfo extends AbstractModel{

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 任务描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 同步类型1.解决方案(整库迁移),2.单表同步
    */
    @SerializedName("SyncType")
    @Expose
    private Long SyncType;

    /**
    * 201.实时,202.离线
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 任务所属工作流id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务调度id(oceanus or us等作业id)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleTaskId")
    @Expose
    private String ScheduleTaskId;

    /**
    * 任务组id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskGroupId")
    @Expose
    private String TaskGroupId;

    /**
    * 项目id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 创建人uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
    * 操作人uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperatorUin")
    @Expose
    private String OperatorUin;

    /**
    * owner uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 应用id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 任务状态1.初始化,2.操作中,3.运行中,4.暂停,5.任务停止中,6.停止,7.执行失败,8.已删除,9.已锁定,10.配置过期,11.提交中,12.提交成功,13.提交失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 节点列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Nodes")
    @Expose
    private IntegrationNodeInfo [] Nodes;

    /**
    * 执行资源id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorId")
    @Expose
    private String ExecutorId;

    /**
    * 任务配置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Config")
    @Expose
    private RecordField [] Config;

    /**
    * 任务扩展配置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtConfig")
    @Expose
    private RecordField [] ExtConfig;

    /**
    * 任务执行context信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecuteContext")
    @Expose
    private RecordField [] ExecuteContext;

    /**
    * 节点映射
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mappings")
    @Expose
    private IntegrationNodeMapping [] Mappings;

    /**
    * 任务模式：1.画布模式，2.flink jar
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskMode")
    @Expose
    private String TaskMode;

    /**
    * 责任人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Incharge")
    @Expose
    private String Incharge;

    /**
    * 离线新增参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OfflineTaskAddEntity")
    @Expose
    private OfflineTaskAddParam OfflineTaskAddEntity;

    /**
    * group name
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorGroupName")
    @Expose
    private String ExecutorGroupName;

    /**
    * url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InLongManagerUrl")
    @Expose
    private String InLongManagerUrl;

    /**
    * stream id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InLongStreamId")
    @Expose
    private String InLongStreamId;

    /**
    * version
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InLongManagerVersion")
    @Expose
    private String InLongManagerVersion;

    /**
     * Get 任务名称 
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 任务描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 任务描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 任务描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 任务描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 同步类型1.解决方案(整库迁移),2.单表同步 
     * @return SyncType 同步类型1.解决方案(整库迁移),2.单表同步
     */
    public Long getSyncType() {
        return this.SyncType;
    }

    /**
     * Set 同步类型1.解决方案(整库迁移),2.单表同步
     * @param SyncType 同步类型1.解决方案(整库迁移),2.单表同步
     */
    public void setSyncType(Long SyncType) {
        this.SyncType = SyncType;
    }

    /**
     * Get 201.实时,202.离线 
     * @return TaskType 201.实时,202.离线
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 201.实时,202.离线
     * @param TaskType 201.实时,202.离线
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务所属工作流id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowId 任务所属工作流id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 任务所属工作流id
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowId 任务所属工作流id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务调度id(oceanus or us等作业id)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleTaskId 任务调度id(oceanus or us等作业id)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduleTaskId() {
        return this.ScheduleTaskId;
    }

    /**
     * Set 任务调度id(oceanus or us等作业id)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleTaskId 任务调度id(oceanus or us等作业id)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleTaskId(String ScheduleTaskId) {
        this.ScheduleTaskId = ScheduleTaskId;
    }

    /**
     * Get 任务组id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskGroupId 任务组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskGroupId() {
        return this.TaskGroupId;
    }

    /**
     * Set 任务组id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskGroupId 任务组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskGroupId(String TaskGroupId) {
        this.TaskGroupId = TaskGroupId;
    }

    /**
     * Get 项目id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 创建人uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatorUin 创建人uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set 创建人uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatorUin 创建人uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get 操作人uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperatorUin 操作人uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperatorUin() {
        return this.OperatorUin;
    }

    /**
     * Set 操作人uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperatorUin 操作人uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperatorUin(String OperatorUin) {
        this.OperatorUin = OperatorUin;
    }

    /**
     * Get owner uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin owner uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set owner uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin owner uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 应用id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 应用id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 应用id
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 应用id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 任务状态1.初始化,2.操作中,3.运行中,4.暂停,5.任务停止中,6.停止,7.执行失败,8.已删除,9.已锁定,10.配置过期,11.提交中,12.提交成功,13.提交失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 任务状态1.初始化,2.操作中,3.运行中,4.暂停,5.任务停止中,6.停止,7.执行失败,8.已删除,9.已锁定,10.配置过期,11.提交中,12.提交成功,13.提交失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态1.初始化,2.操作中,3.运行中,4.暂停,5.任务停止中,6.停止,7.执行失败,8.已删除,9.已锁定,10.配置过期,11.提交中,12.提交成功,13.提交失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 任务状态1.初始化,2.操作中,3.运行中,4.暂停,5.任务停止中,6.停止,7.执行失败,8.已删除,9.已锁定,10.配置过期,11.提交中,12.提交成功,13.提交失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 节点列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Nodes 节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IntegrationNodeInfo [] getNodes() {
        return this.Nodes;
    }

    /**
     * Set 节点列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Nodes 节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodes(IntegrationNodeInfo [] Nodes) {
        this.Nodes = Nodes;
    }

    /**
     * Get 执行资源id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorId 执行资源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutorId() {
        return this.ExecutorId;
    }

    /**
     * Set 执行资源id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorId 执行资源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorId(String ExecutorId) {
        this.ExecutorId = ExecutorId;
    }

    /**
     * Get 任务配置信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Config 任务配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RecordField [] getConfig() {
        return this.Config;
    }

    /**
     * Set 任务配置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Config 任务配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfig(RecordField [] Config) {
        this.Config = Config;
    }

    /**
     * Get 任务扩展配置信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtConfig 任务扩展配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RecordField [] getExtConfig() {
        return this.ExtConfig;
    }

    /**
     * Set 任务扩展配置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtConfig 任务扩展配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtConfig(RecordField [] ExtConfig) {
        this.ExtConfig = ExtConfig;
    }

    /**
     * Get 任务执行context信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecuteContext 任务执行context信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RecordField [] getExecuteContext() {
        return this.ExecuteContext;
    }

    /**
     * Set 任务执行context信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecuteContext 任务执行context信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecuteContext(RecordField [] ExecuteContext) {
        this.ExecuteContext = ExecuteContext;
    }

    /**
     * Get 节点映射
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mappings 节点映射
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IntegrationNodeMapping [] getMappings() {
        return this.Mappings;
    }

    /**
     * Set 节点映射
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mappings 节点映射
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMappings(IntegrationNodeMapping [] Mappings) {
        this.Mappings = Mappings;
    }

    /**
     * Get 任务模式：1.画布模式，2.flink jar
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskMode 任务模式：1.画布模式，2.flink jar
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskMode() {
        return this.TaskMode;
    }

    /**
     * Set 任务模式：1.画布模式，2.flink jar
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskMode 任务模式：1.画布模式，2.flink jar
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskMode(String TaskMode) {
        this.TaskMode = TaskMode;
    }

    /**
     * Get 责任人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Incharge 责任人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIncharge() {
        return this.Incharge;
    }

    /**
     * Set 责任人
注意：此字段可能返回 null，表示取不到有效值。
     * @param Incharge 责任人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIncharge(String Incharge) {
        this.Incharge = Incharge;
    }

    /**
     * Get 离线新增参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OfflineTaskAddEntity 离线新增参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OfflineTaskAddParam getOfflineTaskAddEntity() {
        return this.OfflineTaskAddEntity;
    }

    /**
     * Set 离线新增参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param OfflineTaskAddEntity 离线新增参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOfflineTaskAddEntity(OfflineTaskAddParam OfflineTaskAddEntity) {
        this.OfflineTaskAddEntity = OfflineTaskAddEntity;
    }

    /**
     * Get group name
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorGroupName group name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutorGroupName() {
        return this.ExecutorGroupName;
    }

    /**
     * Set group name
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorGroupName group name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorGroupName(String ExecutorGroupName) {
        this.ExecutorGroupName = ExecutorGroupName;
    }

    /**
     * Get url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InLongManagerUrl url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInLongManagerUrl() {
        return this.InLongManagerUrl;
    }

    /**
     * Set url
注意：此字段可能返回 null，表示取不到有效值。
     * @param InLongManagerUrl url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInLongManagerUrl(String InLongManagerUrl) {
        this.InLongManagerUrl = InLongManagerUrl;
    }

    /**
     * Get stream id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InLongStreamId stream id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInLongStreamId() {
        return this.InLongStreamId;
    }

    /**
     * Set stream id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InLongStreamId stream id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInLongStreamId(String InLongStreamId) {
        this.InLongStreamId = InLongStreamId;
    }

    /**
     * Get version
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InLongManagerVersion version
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInLongManagerVersion() {
        return this.InLongManagerVersion;
    }

    /**
     * Set version
注意：此字段可能返回 null，表示取不到有效值。
     * @param InLongManagerVersion version
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInLongManagerVersion(String InLongManagerVersion) {
        this.InLongManagerVersion = InLongManagerVersion;
    }

    public IntegrationTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntegrationTaskInfo(IntegrationTaskInfo source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SyncType != null) {
            this.SyncType = new Long(source.SyncType);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ScheduleTaskId != null) {
            this.ScheduleTaskId = new String(source.ScheduleTaskId);
        }
        if (source.TaskGroupId != null) {
            this.TaskGroupId = new String(source.TaskGroupId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new String(source.CreatorUin);
        }
        if (source.OperatorUin != null) {
            this.OperatorUin = new String(source.OperatorUin);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Nodes != null) {
            this.Nodes = new IntegrationNodeInfo[source.Nodes.length];
            for (int i = 0; i < source.Nodes.length; i++) {
                this.Nodes[i] = new IntegrationNodeInfo(source.Nodes[i]);
            }
        }
        if (source.ExecutorId != null) {
            this.ExecutorId = new String(source.ExecutorId);
        }
        if (source.Config != null) {
            this.Config = new RecordField[source.Config.length];
            for (int i = 0; i < source.Config.length; i++) {
                this.Config[i] = new RecordField(source.Config[i]);
            }
        }
        if (source.ExtConfig != null) {
            this.ExtConfig = new RecordField[source.ExtConfig.length];
            for (int i = 0; i < source.ExtConfig.length; i++) {
                this.ExtConfig[i] = new RecordField(source.ExtConfig[i]);
            }
        }
        if (source.ExecuteContext != null) {
            this.ExecuteContext = new RecordField[source.ExecuteContext.length];
            for (int i = 0; i < source.ExecuteContext.length; i++) {
                this.ExecuteContext[i] = new RecordField(source.ExecuteContext[i]);
            }
        }
        if (source.Mappings != null) {
            this.Mappings = new IntegrationNodeMapping[source.Mappings.length];
            for (int i = 0; i < source.Mappings.length; i++) {
                this.Mappings[i] = new IntegrationNodeMapping(source.Mappings[i]);
            }
        }
        if (source.TaskMode != null) {
            this.TaskMode = new String(source.TaskMode);
        }
        if (source.Incharge != null) {
            this.Incharge = new String(source.Incharge);
        }
        if (source.OfflineTaskAddEntity != null) {
            this.OfflineTaskAddEntity = new OfflineTaskAddParam(source.OfflineTaskAddEntity);
        }
        if (source.ExecutorGroupName != null) {
            this.ExecutorGroupName = new String(source.ExecutorGroupName);
        }
        if (source.InLongManagerUrl != null) {
            this.InLongManagerUrl = new String(source.InLongManagerUrl);
        }
        if (source.InLongStreamId != null) {
            this.InLongStreamId = new String(source.InLongStreamId);
        }
        if (source.InLongManagerVersion != null) {
            this.InLongManagerVersion = new String(source.InLongManagerVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SyncType", this.SyncType);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ScheduleTaskId", this.ScheduleTaskId);
        this.setParamSimple(map, prefix + "TaskGroupId", this.TaskGroupId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "OperatorUin", this.OperatorUin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Nodes.", this.Nodes);
        this.setParamSimple(map, prefix + "ExecutorId", this.ExecutorId);
        this.setParamArrayObj(map, prefix + "Config.", this.Config);
        this.setParamArrayObj(map, prefix + "ExtConfig.", this.ExtConfig);
        this.setParamArrayObj(map, prefix + "ExecuteContext.", this.ExecuteContext);
        this.setParamArrayObj(map, prefix + "Mappings.", this.Mappings);
        this.setParamSimple(map, prefix + "TaskMode", this.TaskMode);
        this.setParamSimple(map, prefix + "Incharge", this.Incharge);
        this.setParamObj(map, prefix + "OfflineTaskAddEntity.", this.OfflineTaskAddEntity);
        this.setParamSimple(map, prefix + "ExecutorGroupName", this.ExecutorGroupName);
        this.setParamSimple(map, prefix + "InLongManagerUrl", this.InLongManagerUrl);
        this.setParamSimple(map, prefix + "InLongStreamId", this.InLongStreamId);
        this.setParamSimple(map, prefix + "InLongManagerVersion", this.InLongManagerVersion);

    }
}

