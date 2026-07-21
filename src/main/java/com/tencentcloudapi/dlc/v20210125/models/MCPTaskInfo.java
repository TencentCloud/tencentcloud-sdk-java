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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MCPTaskInfo extends AbstractModel {

    /**
    * <p>任务 ID</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>BatchId</p>
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * <p>状态</p>
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * <p>任务类型</p>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>任务类型</p>
    */
    @SerializedName("TaskKind")
    @Expose
    private String TaskKind;

    /**
    * <p>引擎详情</p>
    */
    @SerializedName("EngineTypeDetail")
    @Expose
    private String EngineTypeDetail;

    /**
    * <p>SQL 类型</p>
    */
    @SerializedName("SQLType")
    @Expose
    private String SQLType;

    /**
    * <p>SQL</p>
    */
    @SerializedName("SQL")
    @Expose
    private String SQL;

    /**
    * <p>是否截断</p>
    */
    @SerializedName("IsSQLCutOff")
    @Expose
    private Boolean IsSQLCutOff;

    /**
    * <p>数据库名称</p>
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * <p>引擎 ID</p>
    */
    @SerializedName("DataEngineId")
    @Expose
    private String DataEngineId;

    /**
    * <p>资源组名称</p>
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * <p>JobId</p>
    */
    @SerializedName("SparkJobId")
    @Expose
    private String SparkJobId;

    /**
    * <p>Job 名称</p>
    */
    @SerializedName("SparkJobName")
    @Expose
    private String SparkJobName;

    /**
    * <p>操作人 Uin</p>
    */
    @SerializedName("OperateUin")
    @Expose
    private String OperateUin;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>引擎耗时</p><p>单位：毫秒</p>
    */
    @SerializedName("UsedTime")
    @Expose
    private Long UsedTime;

    /**
    * <p>执行总耗时</p><p>单位：毫秒</p>
    */
    @SerializedName("TotalTime")
    @Expose
    private Long TotalTime;

    /**
    * <p>进度</p>
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * <p>输出信息</p>
    */
    @SerializedName("OutputMessage")
    @Expose
    private String OutputMessage;

    /**
    * <p>结果集</p>
    */
    @SerializedName("DataSet")
    @Expose
    private String DataSet;

    /**
     * Get <p>任务 ID</p> 
     * @return Id <p>任务 ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>任务 ID</p>
     * @param Id <p>任务 ID</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>BatchId</p> 
     * @return BatchId <p>BatchId</p>
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set <p>BatchId</p>
     * @param BatchId <p>BatchId</p>
     */
    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    /**
     * Get <p>状态</p> 
     * @return State <p>状态</p>
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set <p>状态</p>
     * @param State <p>状态</p>
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get <p>任务类型</p> 
     * @return TaskType <p>任务类型</p>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>任务类型</p>
     * @param TaskType <p>任务类型</p>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>任务类型</p> 
     * @return TaskKind <p>任务类型</p>
     */
    public String getTaskKind() {
        return this.TaskKind;
    }

    /**
     * Set <p>任务类型</p>
     * @param TaskKind <p>任务类型</p>
     */
    public void setTaskKind(String TaskKind) {
        this.TaskKind = TaskKind;
    }

    /**
     * Get <p>引擎详情</p> 
     * @return EngineTypeDetail <p>引擎详情</p>
     */
    public String getEngineTypeDetail() {
        return this.EngineTypeDetail;
    }

    /**
     * Set <p>引擎详情</p>
     * @param EngineTypeDetail <p>引擎详情</p>
     */
    public void setEngineTypeDetail(String EngineTypeDetail) {
        this.EngineTypeDetail = EngineTypeDetail;
    }

    /**
     * Get <p>SQL 类型</p> 
     * @return SQLType <p>SQL 类型</p>
     */
    public String getSQLType() {
        return this.SQLType;
    }

    /**
     * Set <p>SQL 类型</p>
     * @param SQLType <p>SQL 类型</p>
     */
    public void setSQLType(String SQLType) {
        this.SQLType = SQLType;
    }

    /**
     * Get <p>SQL</p> 
     * @return SQL <p>SQL</p>
     */
    public String getSQL() {
        return this.SQL;
    }

    /**
     * Set <p>SQL</p>
     * @param SQL <p>SQL</p>
     */
    public void setSQL(String SQL) {
        this.SQL = SQL;
    }

    /**
     * Get <p>是否截断</p> 
     * @return IsSQLCutOff <p>是否截断</p>
     */
    public Boolean getIsSQLCutOff() {
        return this.IsSQLCutOff;
    }

    /**
     * Set <p>是否截断</p>
     * @param IsSQLCutOff <p>是否截断</p>
     */
    public void setIsSQLCutOff(Boolean IsSQLCutOff) {
        this.IsSQLCutOff = IsSQLCutOff;
    }

    /**
     * Get <p>数据库名称</p> 
     * @return DatabaseName <p>数据库名称</p>
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set <p>数据库名称</p>
     * @param DatabaseName <p>数据库名称</p>
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get <p>引擎 ID</p> 
     * @return DataEngineId <p>引擎 ID</p>
     */
    public String getDataEngineId() {
        return this.DataEngineId;
    }

    /**
     * Set <p>引擎 ID</p>
     * @param DataEngineId <p>引擎 ID</p>
     */
    public void setDataEngineId(String DataEngineId) {
        this.DataEngineId = DataEngineId;
    }

    /**
     * Get <p>资源组名称</p> 
     * @return ResourceGroupName <p>资源组名称</p>
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set <p>资源组名称</p>
     * @param ResourceGroupName <p>资源组名称</p>
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    /**
     * Get <p>JobId</p> 
     * @return SparkJobId <p>JobId</p>
     */
    public String getSparkJobId() {
        return this.SparkJobId;
    }

    /**
     * Set <p>JobId</p>
     * @param SparkJobId <p>JobId</p>
     */
    public void setSparkJobId(String SparkJobId) {
        this.SparkJobId = SparkJobId;
    }

    /**
     * Get <p>Job 名称</p> 
     * @return SparkJobName <p>Job 名称</p>
     */
    public String getSparkJobName() {
        return this.SparkJobName;
    }

    /**
     * Set <p>Job 名称</p>
     * @param SparkJobName <p>Job 名称</p>
     */
    public void setSparkJobName(String SparkJobName) {
        this.SparkJobName = SparkJobName;
    }

    /**
     * Get <p>操作人 Uin</p> 
     * @return OperateUin <p>操作人 Uin</p>
     */
    public String getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set <p>操作人 Uin</p>
     * @param OperateUin <p>操作人 Uin</p>
     */
    public void setOperateUin(String OperateUin) {
        this.OperateUin = OperateUin;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>开始时间</p> 
     * @return StartTime <p>开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p>
     * @param StartTime <p>开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间</p> 
     * @return EndTime <p>结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
     * @param EndTime <p>结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>引擎耗时</p><p>单位：毫秒</p> 
     * @return UsedTime <p>引擎耗时</p><p>单位：毫秒</p>
     */
    public Long getUsedTime() {
        return this.UsedTime;
    }

    /**
     * Set <p>引擎耗时</p><p>单位：毫秒</p>
     * @param UsedTime <p>引擎耗时</p><p>单位：毫秒</p>
     */
    public void setUsedTime(Long UsedTime) {
        this.UsedTime = UsedTime;
    }

    /**
     * Get <p>执行总耗时</p><p>单位：毫秒</p> 
     * @return TotalTime <p>执行总耗时</p><p>单位：毫秒</p>
     */
    public Long getTotalTime() {
        return this.TotalTime;
    }

    /**
     * Set <p>执行总耗时</p><p>单位：毫秒</p>
     * @param TotalTime <p>执行总耗时</p><p>单位：毫秒</p>
     */
    public void setTotalTime(Long TotalTime) {
        this.TotalTime = TotalTime;
    }

    /**
     * Get <p>进度</p> 
     * @return Progress <p>进度</p>
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>进度</p>
     * @param Progress <p>进度</p>
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>输出信息</p> 
     * @return OutputMessage <p>输出信息</p>
     */
    public String getOutputMessage() {
        return this.OutputMessage;
    }

    /**
     * Set <p>输出信息</p>
     * @param OutputMessage <p>输出信息</p>
     */
    public void setOutputMessage(String OutputMessage) {
        this.OutputMessage = OutputMessage;
    }

    /**
     * Get <p>结果集</p> 
     * @return DataSet <p>结果集</p>
     */
    public String getDataSet() {
        return this.DataSet;
    }

    /**
     * Set <p>结果集</p>
     * @param DataSet <p>结果集</p>
     */
    public void setDataSet(String DataSet) {
        this.DataSet = DataSet;
    }

    public MCPTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MCPTaskInfo(MCPTaskInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.TaskKind != null) {
            this.TaskKind = new String(source.TaskKind);
        }
        if (source.EngineTypeDetail != null) {
            this.EngineTypeDetail = new String(source.EngineTypeDetail);
        }
        if (source.SQLType != null) {
            this.SQLType = new String(source.SQLType);
        }
        if (source.SQL != null) {
            this.SQL = new String(source.SQL);
        }
        if (source.IsSQLCutOff != null) {
            this.IsSQLCutOff = new Boolean(source.IsSQLCutOff);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.DataEngineId != null) {
            this.DataEngineId = new String(source.DataEngineId);
        }
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
        }
        if (source.SparkJobId != null) {
            this.SparkJobId = new String(source.SparkJobId);
        }
        if (source.SparkJobName != null) {
            this.SparkJobName = new String(source.SparkJobName);
        }
        if (source.OperateUin != null) {
            this.OperateUin = new String(source.OperateUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.UsedTime != null) {
            this.UsedTime = new Long(source.UsedTime);
        }
        if (source.TotalTime != null) {
            this.TotalTime = new Long(source.TotalTime);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.OutputMessage != null) {
            this.OutputMessage = new String(source.OutputMessage);
        }
        if (source.DataSet != null) {
            this.DataSet = new String(source.DataSet);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TaskKind", this.TaskKind);
        this.setParamSimple(map, prefix + "EngineTypeDetail", this.EngineTypeDetail);
        this.setParamSimple(map, prefix + "SQLType", this.SQLType);
        this.setParamSimple(map, prefix + "SQL", this.SQL);
        this.setParamSimple(map, prefix + "IsSQLCutOff", this.IsSQLCutOff);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "DataEngineId", this.DataEngineId);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);
        this.setParamSimple(map, prefix + "SparkJobId", this.SparkJobId);
        this.setParamSimple(map, prefix + "SparkJobName", this.SparkJobName);
        this.setParamSimple(map, prefix + "OperateUin", this.OperateUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "UsedTime", this.UsedTime);
        this.setParamSimple(map, prefix + "TotalTime", this.TotalTime);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "OutputMessage", this.OutputMessage);
        this.setParamSimple(map, prefix + "DataSet", this.DataSet);

    }
}

