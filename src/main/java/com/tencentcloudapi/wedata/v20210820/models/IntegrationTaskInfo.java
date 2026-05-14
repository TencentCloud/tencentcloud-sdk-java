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

public class IntegrationTaskInfo extends AbstractModel {

    /**
    * <p>任务名称</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>任务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>同步类型1.解决方案(整库迁移),2.单表同步</p>
    */
    @SerializedName("SyncType")
    @Expose
    private Long SyncType;

    /**
    * <p>201.实时,202.离线</p>
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * <p>任务所属工作流id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务调度id(oceanus or us等作业id)，非填项</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleTaskId")
    @Expose
    private String ScheduleTaskId;

    /**
    * <p>inlong任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskGroupId")
    @Expose
    private String TaskGroupId;

    /**
    * <p>项目id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>创建人uin</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
    * <p>操作人uin</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperatorUin")
    @Expose
    private String OperatorUin;

    /**
    * <p>owner uin</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>应用id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>0:新建(任务开发态默认状态)|1:未开始|2:操作中|3:运行中|4:暂停|5:任务停止中|6:停止|7:执行失败|20:异常|21:未知|</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>节点列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Nodes")
    @Expose
    private IntegrationNodeInfo [] Nodes;

    /**
    * <p>执行资源id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorId")
    @Expose
    private String ExecutorId;

    /**
    * <p>任务配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Config")
    @Expose
    private RecordField [] Config;

    /**
    * <p>任务扩展配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtConfig")
    @Expose
    private RecordField [] ExtConfig;

    /**
    * <p>任务执行context信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecuteContext")
    @Expose
    private RecordField [] ExecuteContext;

    /**
    * <p>节点映射</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mappings")
    @Expose
    private IntegrationNodeMapping [] Mappings;

    /**
    * <p>任务配置模式，0:画布 1:表单 3:脚本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskMode")
    @Expose
    private String TaskMode;

    /**
    * <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Incharge")
    @Expose
    private String Incharge;

    /**
    * <p>离线新增参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OfflineTaskAddEntity")
    @Expose
    private OfflineTaskAddParam OfflineTaskAddEntity;

    /**
    * <p>group name</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorGroupName")
    @Expose
    private String ExecutorGroupName;

    /**
    * <p>inlong manager url</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InLongManagerUrl")
    @Expose
    private String InLongManagerUrl;

    /**
    * <p>stream id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InLongStreamId")
    @Expose
    private String InLongStreamId;

    /**
    * <p>version</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InLongManagerVersion")
    @Expose
    private String InLongManagerVersion;

    /**
    * <p>inlong dataproxy url</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataProxyUrl")
    @Expose
    private String [] DataProxyUrl;

    /**
    * <p>任务版本是否已提交运维</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Submit")
    @Expose
    private Boolean Submit;

    /**
    * <p>数据源类型：MYSQL|POSTGRE|ORACLE|SQLSERVER|FTP|HIVE|HDFS|ICEBERG|KAFKA|HBASE|SPARK|VIRTUAL|TBASE|DB2|DM|GAUSSDB|GBASE|IMPALA|ES|S3_DATAINSIGHT|GREENPLUM|PHOENIX|SAP_HANA|SFTP|OCEANBASE|CLICKHOUSE|KUDU|VERTICA|REDIS|COS|DLC|DLCV1|DORIS|CKAFKA|DTS_KAFKA|S3|CDW|LOCAL|TDSQLC|TDSQL|TDSQL_MYSQL|MONGODB|INFORMIX|SYBASE|REST_API|SuperSQL|PRESTO|DR_SUM|TiDB|StarRocks|Trino|Kyuubi|GDB|TCHOUSE_X|TCHOUSE_P|TDSQL_POSTGRE</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputDatasourceType")
    @Expose
    private String InputDatasourceType;

    /**
    * <p>数据源类型：MYSQL|POSTGRE|ORACLE|SQLSERVER|FTP|HIVE|HDFS|ICEBERG|KAFKA|HBASE|SPARK|VIRTUAL|TBASE|DB2|DM|GAUSSDB|GBASE|IMPALA|ES|S3_DATAINSIGHT|GREENPLUM|PHOENIX|SAP_HANA|SFTP|OCEANBASE|CLICKHOUSE|KUDU|VERTICA|REDIS|COS|DLC|DLCV1|DORIS|CKAFKA|DTS_KAFKA|S3|CDW|LOCAL|TDSQLC|TDSQL|TDSQL_MYSQL|MONGODB|INFORMIX|SYBASE|REST_API|SuperSQL|PRESTO|DR_SUM|TiDB|StarRocks|Trino|Kyuubi|GDB|TCHOUSE_X|TCHOUSE_P|TDSQL_POSTGRE</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputDatasourceType")
    @Expose
    private String OutputDatasourceType;

    /**
    * <p>读取条数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NumRecordsIn")
    @Expose
    private Long NumRecordsIn;

    /**
    * <p>写入条数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NumRecordsOut")
    @Expose
    private Long NumRecordsOut;

    /**
    * <p>读取延迟</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReaderDelay")
    @Expose
    private Float ReaderDelay;

    /**
    * <p>重启次数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NumRestarts")
    @Expose
    private Long NumRestarts;

    /**
    * <p>任务创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>任务更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>任务最后一次运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastRunTime")
    @Expose
    private String LastRunTime;

    /**
    * <p>任务停止时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StopTime")
    @Expose
    private String StopTime;

    /**
    * <p>作业是否已提交</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasVersion")
    @Expose
    private Boolean HasVersion;

    /**
    * <p>任务是否被锁定</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Locked")
    @Expose
    private Boolean Locked;

    /**
    * <p>任务锁定人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Locker")
    @Expose
    private String Locker;

    /**
    * <p>耗费资源量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunningCu")
    @Expose
    private Float RunningCu;

    /**
    * <p>该任务关联的告警规则</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskAlarmRegularList")
    @Expose
    private String [] TaskAlarmRegularList;

    /**
    * <p>实时任务资源分层情况： 0：进行中,1：成功 ,2：失败</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SwitchResource")
    @Expose
    private Long SwitchResource;

    /**
    * <p>实时任务读取阶段：0：全部全量,1：部分全量,2：全部增量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReadPhase")
    @Expose
    private Long ReadPhase;

    /**
    * <p>实时任务版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceVersion")
    @Expose
    private Long InstanceVersion;

    /**
    * <p>离线任务导入到编排空间的任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ArrangeSpaceTaskId")
    @Expose
    private String ArrangeSpaceTaskId;

    /**
    * <p>离线任务状态区分1.未提交2.已提交3.已导出</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OfflineTaskStatus")
    @Expose
    private Long OfflineTaskStatus;

    /**
    * <p>导入到编排空间配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskImportInfo")
    @Expose
    private TaskImportInfo TaskImportInfo;

    /**
    * <p>业务延迟</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessLatency")
    @Expose
    private Long BusinessLatency;

    /**
    * <p>当前同步位点</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentSyncPosition")
    @Expose
    private Long CurrentSyncPosition;

    /**
    * <p>标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagList")
    @Expose
    private IntegrationTag [] TagList;

    /**
    * <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * <p>任务子状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskSubType")
    @Expose
    private Long TaskSubType;

    /**
    * <p>是否存在SavePoint, 0-存在, 1-不存在, null 为未知</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotExistsCheckPoint")
    @Expose
    private Long NotExistsCheckPoint;

    /**
    * <p>savepiontPath</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SavePointId")
    @Expose
    private String SavePointId;

    /**
    * <p>savepiontId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SavePointPath")
    @Expose
    private String SavePointPath;

    /**
    * <p>最近一次操作信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastOperateInfo")
    @Expose
    private LastOperateInfo LastOperateInfo;

    /**
     * Get <p>任务名称</p> 
     * @return TaskName <p>任务名称</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名称</p>
     * @param TaskName <p>任务名称</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>任务描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>任务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>任务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>任务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>同步类型1.解决方案(整库迁移),2.单表同步</p> 
     * @return SyncType <p>同步类型1.解决方案(整库迁移),2.单表同步</p>
     */
    public Long getSyncType() {
        return this.SyncType;
    }

    /**
     * Set <p>同步类型1.解决方案(整库迁移),2.单表同步</p>
     * @param SyncType <p>同步类型1.解决方案(整库迁移),2.单表同步</p>
     */
    public void setSyncType(Long SyncType) {
        this.SyncType = SyncType;
    }

    /**
     * Get <p>201.实时,202.离线</p> 
     * @return TaskType <p>201.实时,202.离线</p>
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>201.实时,202.离线</p>
     * @param TaskType <p>201.实时,202.离线</p>
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>任务所属工作流id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowId <p>任务所属工作流id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set <p>任务所属工作流id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowId <p>任务所属工作流id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get <p>任务id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId <p>任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId <p>任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务调度id(oceanus or us等作业id)，非填项</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleTaskId <p>任务调度id(oceanus or us等作业id)，非填项</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduleTaskId() {
        return this.ScheduleTaskId;
    }

    /**
     * Set <p>任务调度id(oceanus or us等作业id)，非填项</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleTaskId <p>任务调度id(oceanus or us等作业id)，非填项</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleTaskId(String ScheduleTaskId) {
        this.ScheduleTaskId = ScheduleTaskId;
    }

    /**
     * Get <p>inlong任务id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskGroupId <p>inlong任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskGroupId() {
        return this.TaskGroupId;
    }

    /**
     * Set <p>inlong任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskGroupId <p>inlong任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskGroupId(String TaskGroupId) {
        this.TaskGroupId = TaskGroupId;
    }

    /**
     * Get <p>项目id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId <p>项目id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId <p>项目id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>创建人uin</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatorUin <p>创建人uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set <p>创建人uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatorUin <p>创建人uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get <p>操作人uin</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperatorUin <p>操作人uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperatorUin() {
        return this.OperatorUin;
    }

    /**
     * Set <p>操作人uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperatorUin <p>操作人uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperatorUin(String OperatorUin) {
        this.OperatorUin = OperatorUin;
    }

    /**
     * Get <p>owner uin</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin <p>owner uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>owner uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin <p>owner uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>应用id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId <p>应用id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId <p>应用id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>0:新建(任务开发态默认状态)|1:未开始|2:操作中|3:运行中|4:暂停|5:任务停止中|6:停止|7:执行失败|20:异常|21:未知|</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>0:新建(任务开发态默认状态)|1:未开始|2:操作中|3:运行中|4:暂停|5:任务停止中|6:停止|7:执行失败|20:异常|21:未知|</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>0:新建(任务开发态默认状态)|1:未开始|2:操作中|3:运行中|4:暂停|5:任务停止中|6:停止|7:执行失败|20:异常|21:未知|</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>0:新建(任务开发态默认状态)|1:未开始|2:操作中|3:运行中|4:暂停|5:任务停止中|6:停止|7:执行失败|20:异常|21:未知|</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>节点列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Nodes <p>节点列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IntegrationNodeInfo [] getNodes() {
        return this.Nodes;
    }

    /**
     * Set <p>节点列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Nodes <p>节点列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodes(IntegrationNodeInfo [] Nodes) {
        this.Nodes = Nodes;
    }

    /**
     * Get <p>执行资源id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorId <p>执行资源id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutorId() {
        return this.ExecutorId;
    }

    /**
     * Set <p>执行资源id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorId <p>执行资源id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorId(String ExecutorId) {
        this.ExecutorId = ExecutorId;
    }

    /**
     * Get <p>任务配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Config <p>任务配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RecordField [] getConfig() {
        return this.Config;
    }

    /**
     * Set <p>任务配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Config <p>任务配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfig(RecordField [] Config) {
        this.Config = Config;
    }

    /**
     * Get <p>任务扩展配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtConfig <p>任务扩展配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RecordField [] getExtConfig() {
        return this.ExtConfig;
    }

    /**
     * Set <p>任务扩展配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtConfig <p>任务扩展配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtConfig(RecordField [] ExtConfig) {
        this.ExtConfig = ExtConfig;
    }

    /**
     * Get <p>任务执行context信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecuteContext <p>任务执行context信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RecordField [] getExecuteContext() {
        return this.ExecuteContext;
    }

    /**
     * Set <p>任务执行context信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecuteContext <p>任务执行context信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecuteContext(RecordField [] ExecuteContext) {
        this.ExecuteContext = ExecuteContext;
    }

    /**
     * Get <p>节点映射</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mappings <p>节点映射</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IntegrationNodeMapping [] getMappings() {
        return this.Mappings;
    }

    /**
     * Set <p>节点映射</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mappings <p>节点映射</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMappings(IntegrationNodeMapping [] Mappings) {
        this.Mappings = Mappings;
    }

    /**
     * Get <p>任务配置模式，0:画布 1:表单 3:脚本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskMode <p>任务配置模式，0:画布 1:表单 3:脚本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskMode() {
        return this.TaskMode;
    }

    /**
     * Set <p>任务配置模式，0:画布 1:表单 3:脚本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskMode <p>任务配置模式，0:画布 1:表单 3:脚本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskMode(String TaskMode) {
        this.TaskMode = TaskMode;
    }

    /**
     * Get <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Incharge <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIncharge() {
        return this.Incharge;
    }

    /**
     * Set <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Incharge <p>责任人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIncharge(String Incharge) {
        this.Incharge = Incharge;
    }

    /**
     * Get <p>离线新增参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OfflineTaskAddEntity <p>离线新增参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OfflineTaskAddParam getOfflineTaskAddEntity() {
        return this.OfflineTaskAddEntity;
    }

    /**
     * Set <p>离线新增参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OfflineTaskAddEntity <p>离线新增参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOfflineTaskAddEntity(OfflineTaskAddParam OfflineTaskAddEntity) {
        this.OfflineTaskAddEntity = OfflineTaskAddEntity;
    }

    /**
     * Get <p>group name</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorGroupName <p>group name</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutorGroupName() {
        return this.ExecutorGroupName;
    }

    /**
     * Set <p>group name</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorGroupName <p>group name</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorGroupName(String ExecutorGroupName) {
        this.ExecutorGroupName = ExecutorGroupName;
    }

    /**
     * Get <p>inlong manager url</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InLongManagerUrl <p>inlong manager url</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInLongManagerUrl() {
        return this.InLongManagerUrl;
    }

    /**
     * Set <p>inlong manager url</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InLongManagerUrl <p>inlong manager url</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInLongManagerUrl(String InLongManagerUrl) {
        this.InLongManagerUrl = InLongManagerUrl;
    }

    /**
     * Get <p>stream id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InLongStreamId <p>stream id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInLongStreamId() {
        return this.InLongStreamId;
    }

    /**
     * Set <p>stream id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InLongStreamId <p>stream id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInLongStreamId(String InLongStreamId) {
        this.InLongStreamId = InLongStreamId;
    }

    /**
     * Get <p>version</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InLongManagerVersion <p>version</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInLongManagerVersion() {
        return this.InLongManagerVersion;
    }

    /**
     * Set <p>version</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InLongManagerVersion <p>version</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInLongManagerVersion(String InLongManagerVersion) {
        this.InLongManagerVersion = InLongManagerVersion;
    }

    /**
     * Get <p>inlong dataproxy url</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataProxyUrl <p>inlong dataproxy url</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDataProxyUrl() {
        return this.DataProxyUrl;
    }

    /**
     * Set <p>inlong dataproxy url</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataProxyUrl <p>inlong dataproxy url</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataProxyUrl(String [] DataProxyUrl) {
        this.DataProxyUrl = DataProxyUrl;
    }

    /**
     * Get <p>任务版本是否已提交运维</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Submit <p>任务版本是否已提交运维</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSubmit() {
        return this.Submit;
    }

    /**
     * Set <p>任务版本是否已提交运维</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Submit <p>任务版本是否已提交运维</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubmit(Boolean Submit) {
        this.Submit = Submit;
    }

    /**
     * Get <p>数据源类型：MYSQL|POSTGRE|ORACLE|SQLSERVER|FTP|HIVE|HDFS|ICEBERG|KAFKA|HBASE|SPARK|VIRTUAL|TBASE|DB2|DM|GAUSSDB|GBASE|IMPALA|ES|S3_DATAINSIGHT|GREENPLUM|PHOENIX|SAP_HANA|SFTP|OCEANBASE|CLICKHOUSE|KUDU|VERTICA|REDIS|COS|DLC|DLCV1|DORIS|CKAFKA|DTS_KAFKA|S3|CDW|LOCAL|TDSQLC|TDSQL|TDSQL_MYSQL|MONGODB|INFORMIX|SYBASE|REST_API|SuperSQL|PRESTO|DR_SUM|TiDB|StarRocks|Trino|Kyuubi|GDB|TCHOUSE_X|TCHOUSE_P|TDSQL_POSTGRE</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputDatasourceType <p>数据源类型：MYSQL|POSTGRE|ORACLE|SQLSERVER|FTP|HIVE|HDFS|ICEBERG|KAFKA|HBASE|SPARK|VIRTUAL|TBASE|DB2|DM|GAUSSDB|GBASE|IMPALA|ES|S3_DATAINSIGHT|GREENPLUM|PHOENIX|SAP_HANA|SFTP|OCEANBASE|CLICKHOUSE|KUDU|VERTICA|REDIS|COS|DLC|DLCV1|DORIS|CKAFKA|DTS_KAFKA|S3|CDW|LOCAL|TDSQLC|TDSQL|TDSQL_MYSQL|MONGODB|INFORMIX|SYBASE|REST_API|SuperSQL|PRESTO|DR_SUM|TiDB|StarRocks|Trino|Kyuubi|GDB|TCHOUSE_X|TCHOUSE_P|TDSQL_POSTGRE</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInputDatasourceType() {
        return this.InputDatasourceType;
    }

    /**
     * Set <p>数据源类型：MYSQL|POSTGRE|ORACLE|SQLSERVER|FTP|HIVE|HDFS|ICEBERG|KAFKA|HBASE|SPARK|VIRTUAL|TBASE|DB2|DM|GAUSSDB|GBASE|IMPALA|ES|S3_DATAINSIGHT|GREENPLUM|PHOENIX|SAP_HANA|SFTP|OCEANBASE|CLICKHOUSE|KUDU|VERTICA|REDIS|COS|DLC|DLCV1|DORIS|CKAFKA|DTS_KAFKA|S3|CDW|LOCAL|TDSQLC|TDSQL|TDSQL_MYSQL|MONGODB|INFORMIX|SYBASE|REST_API|SuperSQL|PRESTO|DR_SUM|TiDB|StarRocks|Trino|Kyuubi|GDB|TCHOUSE_X|TCHOUSE_P|TDSQL_POSTGRE</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputDatasourceType <p>数据源类型：MYSQL|POSTGRE|ORACLE|SQLSERVER|FTP|HIVE|HDFS|ICEBERG|KAFKA|HBASE|SPARK|VIRTUAL|TBASE|DB2|DM|GAUSSDB|GBASE|IMPALA|ES|S3_DATAINSIGHT|GREENPLUM|PHOENIX|SAP_HANA|SFTP|OCEANBASE|CLICKHOUSE|KUDU|VERTICA|REDIS|COS|DLC|DLCV1|DORIS|CKAFKA|DTS_KAFKA|S3|CDW|LOCAL|TDSQLC|TDSQL|TDSQL_MYSQL|MONGODB|INFORMIX|SYBASE|REST_API|SuperSQL|PRESTO|DR_SUM|TiDB|StarRocks|Trino|Kyuubi|GDB|TCHOUSE_X|TCHOUSE_P|TDSQL_POSTGRE</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputDatasourceType(String InputDatasourceType) {
        this.InputDatasourceType = InputDatasourceType;
    }

    /**
     * Get <p>数据源类型：MYSQL|POSTGRE|ORACLE|SQLSERVER|FTP|HIVE|HDFS|ICEBERG|KAFKA|HBASE|SPARK|VIRTUAL|TBASE|DB2|DM|GAUSSDB|GBASE|IMPALA|ES|S3_DATAINSIGHT|GREENPLUM|PHOENIX|SAP_HANA|SFTP|OCEANBASE|CLICKHOUSE|KUDU|VERTICA|REDIS|COS|DLC|DLCV1|DORIS|CKAFKA|DTS_KAFKA|S3|CDW|LOCAL|TDSQLC|TDSQL|TDSQL_MYSQL|MONGODB|INFORMIX|SYBASE|REST_API|SuperSQL|PRESTO|DR_SUM|TiDB|StarRocks|Trino|Kyuubi|GDB|TCHOUSE_X|TCHOUSE_P|TDSQL_POSTGRE</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputDatasourceType <p>数据源类型：MYSQL|POSTGRE|ORACLE|SQLSERVER|FTP|HIVE|HDFS|ICEBERG|KAFKA|HBASE|SPARK|VIRTUAL|TBASE|DB2|DM|GAUSSDB|GBASE|IMPALA|ES|S3_DATAINSIGHT|GREENPLUM|PHOENIX|SAP_HANA|SFTP|OCEANBASE|CLICKHOUSE|KUDU|VERTICA|REDIS|COS|DLC|DLCV1|DORIS|CKAFKA|DTS_KAFKA|S3|CDW|LOCAL|TDSQLC|TDSQL|TDSQL_MYSQL|MONGODB|INFORMIX|SYBASE|REST_API|SuperSQL|PRESTO|DR_SUM|TiDB|StarRocks|Trino|Kyuubi|GDB|TCHOUSE_X|TCHOUSE_P|TDSQL_POSTGRE</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutputDatasourceType() {
        return this.OutputDatasourceType;
    }

    /**
     * Set <p>数据源类型：MYSQL|POSTGRE|ORACLE|SQLSERVER|FTP|HIVE|HDFS|ICEBERG|KAFKA|HBASE|SPARK|VIRTUAL|TBASE|DB2|DM|GAUSSDB|GBASE|IMPALA|ES|S3_DATAINSIGHT|GREENPLUM|PHOENIX|SAP_HANA|SFTP|OCEANBASE|CLICKHOUSE|KUDU|VERTICA|REDIS|COS|DLC|DLCV1|DORIS|CKAFKA|DTS_KAFKA|S3|CDW|LOCAL|TDSQLC|TDSQL|TDSQL_MYSQL|MONGODB|INFORMIX|SYBASE|REST_API|SuperSQL|PRESTO|DR_SUM|TiDB|StarRocks|Trino|Kyuubi|GDB|TCHOUSE_X|TCHOUSE_P|TDSQL_POSTGRE</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputDatasourceType <p>数据源类型：MYSQL|POSTGRE|ORACLE|SQLSERVER|FTP|HIVE|HDFS|ICEBERG|KAFKA|HBASE|SPARK|VIRTUAL|TBASE|DB2|DM|GAUSSDB|GBASE|IMPALA|ES|S3_DATAINSIGHT|GREENPLUM|PHOENIX|SAP_HANA|SFTP|OCEANBASE|CLICKHOUSE|KUDU|VERTICA|REDIS|COS|DLC|DLCV1|DORIS|CKAFKA|DTS_KAFKA|S3|CDW|LOCAL|TDSQLC|TDSQL|TDSQL_MYSQL|MONGODB|INFORMIX|SYBASE|REST_API|SuperSQL|PRESTO|DR_SUM|TiDB|StarRocks|Trino|Kyuubi|GDB|TCHOUSE_X|TCHOUSE_P|TDSQL_POSTGRE</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputDatasourceType(String OutputDatasourceType) {
        this.OutputDatasourceType = OutputDatasourceType;
    }

    /**
     * Get <p>读取条数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NumRecordsIn <p>读取条数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNumRecordsIn() {
        return this.NumRecordsIn;
    }

    /**
     * Set <p>读取条数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NumRecordsIn <p>读取条数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNumRecordsIn(Long NumRecordsIn) {
        this.NumRecordsIn = NumRecordsIn;
    }

    /**
     * Get <p>写入条数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NumRecordsOut <p>写入条数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNumRecordsOut() {
        return this.NumRecordsOut;
    }

    /**
     * Set <p>写入条数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NumRecordsOut <p>写入条数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNumRecordsOut(Long NumRecordsOut) {
        this.NumRecordsOut = NumRecordsOut;
    }

    /**
     * Get <p>读取延迟</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReaderDelay <p>读取延迟</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getReaderDelay() {
        return this.ReaderDelay;
    }

    /**
     * Set <p>读取延迟</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReaderDelay <p>读取延迟</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReaderDelay(Float ReaderDelay) {
        this.ReaderDelay = ReaderDelay;
    }

    /**
     * Get <p>重启次数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NumRestarts <p>重启次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNumRestarts() {
        return this.NumRestarts;
    }

    /**
     * Set <p>重启次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NumRestarts <p>重启次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNumRestarts(Long NumRestarts) {
        this.NumRestarts = NumRestarts;
    }

    /**
     * Get <p>任务创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>任务创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>任务创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>任务创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>任务更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>任务更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>任务更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>任务更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>任务最后一次运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastRunTime <p>任务最后一次运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastRunTime() {
        return this.LastRunTime;
    }

    /**
     * Set <p>任务最后一次运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastRunTime <p>任务最后一次运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastRunTime(String LastRunTime) {
        this.LastRunTime = LastRunTime;
    }

    /**
     * Get <p>任务停止时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StopTime <p>任务停止时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStopTime() {
        return this.StopTime;
    }

    /**
     * Set <p>任务停止时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StopTime <p>任务停止时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStopTime(String StopTime) {
        this.StopTime = StopTime;
    }

    /**
     * Get <p>作业是否已提交</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasVersion <p>作业是否已提交</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHasVersion() {
        return this.HasVersion;
    }

    /**
     * Set <p>作业是否已提交</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasVersion <p>作业是否已提交</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasVersion(Boolean HasVersion) {
        this.HasVersion = HasVersion;
    }

    /**
     * Get <p>任务是否被锁定</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Locked <p>任务是否被锁定</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getLocked() {
        return this.Locked;
    }

    /**
     * Set <p>任务是否被锁定</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Locked <p>任务是否被锁定</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocked(Boolean Locked) {
        this.Locked = Locked;
    }

    /**
     * Get <p>任务锁定人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Locker <p>任务锁定人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocker() {
        return this.Locker;
    }

    /**
     * Set <p>任务锁定人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Locker <p>任务锁定人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocker(String Locker) {
        this.Locker = Locker;
    }

    /**
     * Get <p>耗费资源量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunningCu <p>耗费资源量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRunningCu() {
        return this.RunningCu;
    }

    /**
     * Set <p>耗费资源量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunningCu <p>耗费资源量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunningCu(Float RunningCu) {
        this.RunningCu = RunningCu;
    }

    /**
     * Get <p>该任务关联的告警规则</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskAlarmRegularList <p>该任务关联的告警规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTaskAlarmRegularList() {
        return this.TaskAlarmRegularList;
    }

    /**
     * Set <p>该任务关联的告警规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskAlarmRegularList <p>该任务关联的告警规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskAlarmRegularList(String [] TaskAlarmRegularList) {
        this.TaskAlarmRegularList = TaskAlarmRegularList;
    }

    /**
     * Get <p>实时任务资源分层情况： 0：进行中,1：成功 ,2：失败</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SwitchResource <p>实时任务资源分层情况： 0：进行中,1：成功 ,2：失败</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSwitchResource() {
        return this.SwitchResource;
    }

    /**
     * Set <p>实时任务资源分层情况： 0：进行中,1：成功 ,2：失败</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SwitchResource <p>实时任务资源分层情况： 0：进行中,1：成功 ,2：失败</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitchResource(Long SwitchResource) {
        this.SwitchResource = SwitchResource;
    }

    /**
     * Get <p>实时任务读取阶段：0：全部全量,1：部分全量,2：全部增量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReadPhase <p>实时任务读取阶段：0：全部全量,1：部分全量,2：全部增量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReadPhase() {
        return this.ReadPhase;
    }

    /**
     * Set <p>实时任务读取阶段：0：全部全量,1：部分全量,2：全部增量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReadPhase <p>实时任务读取阶段：0：全部全量,1：部分全量,2：全部增量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReadPhase(Long ReadPhase) {
        this.ReadPhase = ReadPhase;
    }

    /**
     * Get <p>实时任务版本号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceVersion <p>实时任务版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceVersion() {
        return this.InstanceVersion;
    }

    /**
     * Set <p>实时任务版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceVersion <p>实时任务版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceVersion(Long InstanceVersion) {
        this.InstanceVersion = InstanceVersion;
    }

    /**
     * Get <p>离线任务导入到编排空间的任务id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ArrangeSpaceTaskId <p>离线任务导入到编排空间的任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getArrangeSpaceTaskId() {
        return this.ArrangeSpaceTaskId;
    }

    /**
     * Set <p>离线任务导入到编排空间的任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ArrangeSpaceTaskId <p>离线任务导入到编排空间的任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArrangeSpaceTaskId(String ArrangeSpaceTaskId) {
        this.ArrangeSpaceTaskId = ArrangeSpaceTaskId;
    }

    /**
     * Get <p>离线任务状态区分1.未提交2.已提交3.已导出</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OfflineTaskStatus <p>离线任务状态区分1.未提交2.已提交3.已导出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOfflineTaskStatus() {
        return this.OfflineTaskStatus;
    }

    /**
     * Set <p>离线任务状态区分1.未提交2.已提交3.已导出</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OfflineTaskStatus <p>离线任务状态区分1.未提交2.已提交3.已导出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOfflineTaskStatus(Long OfflineTaskStatus) {
        this.OfflineTaskStatus = OfflineTaskStatus;
    }

    /**
     * Get <p>导入到编排空间配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskImportInfo <p>导入到编排空间配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskImportInfo getTaskImportInfo() {
        return this.TaskImportInfo;
    }

    /**
     * Set <p>导入到编排空间配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskImportInfo <p>导入到编排空间配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskImportInfo(TaskImportInfo TaskImportInfo) {
        this.TaskImportInfo = TaskImportInfo;
    }

    /**
     * Get <p>业务延迟</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessLatency <p>业务延迟</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBusinessLatency() {
        return this.BusinessLatency;
    }

    /**
     * Set <p>业务延迟</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessLatency <p>业务延迟</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessLatency(Long BusinessLatency) {
        this.BusinessLatency = BusinessLatency;
    }

    /**
     * Get <p>当前同步位点</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentSyncPosition <p>当前同步位点</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCurrentSyncPosition() {
        return this.CurrentSyncPosition;
    }

    /**
     * Set <p>当前同步位点</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentSyncPosition <p>当前同步位点</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentSyncPosition(Long CurrentSyncPosition) {
        this.CurrentSyncPosition = CurrentSyncPosition;
    }

    /**
     * Get <p>标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagList <p>标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IntegrationTag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagList <p>标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagList(IntegrationTag [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMessage <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMessage <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get <p>任务子状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskSubType <p>任务子状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskSubType() {
        return this.TaskSubType;
    }

    /**
     * Set <p>任务子状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskSubType <p>任务子状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskSubType(Long TaskSubType) {
        this.TaskSubType = TaskSubType;
    }

    /**
     * Get <p>是否存在SavePoint, 0-存在, 1-不存在, null 为未知</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotExistsCheckPoint <p>是否存在SavePoint, 0-存在, 1-不存在, null 为未知</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNotExistsCheckPoint() {
        return this.NotExistsCheckPoint;
    }

    /**
     * Set <p>是否存在SavePoint, 0-存在, 1-不存在, null 为未知</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotExistsCheckPoint <p>是否存在SavePoint, 0-存在, 1-不存在, null 为未知</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotExistsCheckPoint(Long NotExistsCheckPoint) {
        this.NotExistsCheckPoint = NotExistsCheckPoint;
    }

    /**
     * Get <p>savepiontPath</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SavePointId <p>savepiontPath</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSavePointId() {
        return this.SavePointId;
    }

    /**
     * Set <p>savepiontPath</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SavePointId <p>savepiontPath</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSavePointId(String SavePointId) {
        this.SavePointId = SavePointId;
    }

    /**
     * Get <p>savepiontId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SavePointPath <p>savepiontId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSavePointPath() {
        return this.SavePointPath;
    }

    /**
     * Set <p>savepiontId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SavePointPath <p>savepiontId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSavePointPath(String SavePointPath) {
        this.SavePointPath = SavePointPath;
    }

    /**
     * Get <p>最近一次操作信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastOperateInfo <p>最近一次操作信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LastOperateInfo getLastOperateInfo() {
        return this.LastOperateInfo;
    }

    /**
     * Set <p>最近一次操作信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastOperateInfo <p>最近一次操作信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastOperateInfo(LastOperateInfo LastOperateInfo) {
        this.LastOperateInfo = LastOperateInfo;
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
        if (source.DataProxyUrl != null) {
            this.DataProxyUrl = new String[source.DataProxyUrl.length];
            for (int i = 0; i < source.DataProxyUrl.length; i++) {
                this.DataProxyUrl[i] = new String(source.DataProxyUrl[i]);
            }
        }
        if (source.Submit != null) {
            this.Submit = new Boolean(source.Submit);
        }
        if (source.InputDatasourceType != null) {
            this.InputDatasourceType = new String(source.InputDatasourceType);
        }
        if (source.OutputDatasourceType != null) {
            this.OutputDatasourceType = new String(source.OutputDatasourceType);
        }
        if (source.NumRecordsIn != null) {
            this.NumRecordsIn = new Long(source.NumRecordsIn);
        }
        if (source.NumRecordsOut != null) {
            this.NumRecordsOut = new Long(source.NumRecordsOut);
        }
        if (source.ReaderDelay != null) {
            this.ReaderDelay = new Float(source.ReaderDelay);
        }
        if (source.NumRestarts != null) {
            this.NumRestarts = new Long(source.NumRestarts);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.LastRunTime != null) {
            this.LastRunTime = new String(source.LastRunTime);
        }
        if (source.StopTime != null) {
            this.StopTime = new String(source.StopTime);
        }
        if (source.HasVersion != null) {
            this.HasVersion = new Boolean(source.HasVersion);
        }
        if (source.Locked != null) {
            this.Locked = new Boolean(source.Locked);
        }
        if (source.Locker != null) {
            this.Locker = new String(source.Locker);
        }
        if (source.RunningCu != null) {
            this.RunningCu = new Float(source.RunningCu);
        }
        if (source.TaskAlarmRegularList != null) {
            this.TaskAlarmRegularList = new String[source.TaskAlarmRegularList.length];
            for (int i = 0; i < source.TaskAlarmRegularList.length; i++) {
                this.TaskAlarmRegularList[i] = new String(source.TaskAlarmRegularList[i]);
            }
        }
        if (source.SwitchResource != null) {
            this.SwitchResource = new Long(source.SwitchResource);
        }
        if (source.ReadPhase != null) {
            this.ReadPhase = new Long(source.ReadPhase);
        }
        if (source.InstanceVersion != null) {
            this.InstanceVersion = new Long(source.InstanceVersion);
        }
        if (source.ArrangeSpaceTaskId != null) {
            this.ArrangeSpaceTaskId = new String(source.ArrangeSpaceTaskId);
        }
        if (source.OfflineTaskStatus != null) {
            this.OfflineTaskStatus = new Long(source.OfflineTaskStatus);
        }
        if (source.TaskImportInfo != null) {
            this.TaskImportInfo = new TaskImportInfo(source.TaskImportInfo);
        }
        if (source.BusinessLatency != null) {
            this.BusinessLatency = new Long(source.BusinessLatency);
        }
        if (source.CurrentSyncPosition != null) {
            this.CurrentSyncPosition = new Long(source.CurrentSyncPosition);
        }
        if (source.TagList != null) {
            this.TagList = new IntegrationTag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new IntegrationTag(source.TagList[i]);
            }
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.TaskSubType != null) {
            this.TaskSubType = new Long(source.TaskSubType);
        }
        if (source.NotExistsCheckPoint != null) {
            this.NotExistsCheckPoint = new Long(source.NotExistsCheckPoint);
        }
        if (source.SavePointId != null) {
            this.SavePointId = new String(source.SavePointId);
        }
        if (source.SavePointPath != null) {
            this.SavePointPath = new String(source.SavePointPath);
        }
        if (source.LastOperateInfo != null) {
            this.LastOperateInfo = new LastOperateInfo(source.LastOperateInfo);
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
        this.setParamArraySimple(map, prefix + "DataProxyUrl.", this.DataProxyUrl);
        this.setParamSimple(map, prefix + "Submit", this.Submit);
        this.setParamSimple(map, prefix + "InputDatasourceType", this.InputDatasourceType);
        this.setParamSimple(map, prefix + "OutputDatasourceType", this.OutputDatasourceType);
        this.setParamSimple(map, prefix + "NumRecordsIn", this.NumRecordsIn);
        this.setParamSimple(map, prefix + "NumRecordsOut", this.NumRecordsOut);
        this.setParamSimple(map, prefix + "ReaderDelay", this.ReaderDelay);
        this.setParamSimple(map, prefix + "NumRestarts", this.NumRestarts);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "LastRunTime", this.LastRunTime);
        this.setParamSimple(map, prefix + "StopTime", this.StopTime);
        this.setParamSimple(map, prefix + "HasVersion", this.HasVersion);
        this.setParamSimple(map, prefix + "Locked", this.Locked);
        this.setParamSimple(map, prefix + "Locker", this.Locker);
        this.setParamSimple(map, prefix + "RunningCu", this.RunningCu);
        this.setParamArraySimple(map, prefix + "TaskAlarmRegularList.", this.TaskAlarmRegularList);
        this.setParamSimple(map, prefix + "SwitchResource", this.SwitchResource);
        this.setParamSimple(map, prefix + "ReadPhase", this.ReadPhase);
        this.setParamSimple(map, prefix + "InstanceVersion", this.InstanceVersion);
        this.setParamSimple(map, prefix + "ArrangeSpaceTaskId", this.ArrangeSpaceTaskId);
        this.setParamSimple(map, prefix + "OfflineTaskStatus", this.OfflineTaskStatus);
        this.setParamObj(map, prefix + "TaskImportInfo.", this.TaskImportInfo);
        this.setParamSimple(map, prefix + "BusinessLatency", this.BusinessLatency);
        this.setParamSimple(map, prefix + "CurrentSyncPosition", this.CurrentSyncPosition);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "TaskSubType", this.TaskSubType);
        this.setParamSimple(map, prefix + "NotExistsCheckPoint", this.NotExistsCheckPoint);
        this.setParamSimple(map, prefix + "SavePointId", this.SavePointId);
        this.setParamSimple(map, prefix + "SavePointPath", this.SavePointPath);
        this.setParamObj(map, prefix + "LastOperateInfo.", this.LastOperateInfo);

    }
}

