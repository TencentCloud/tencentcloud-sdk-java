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

public class TaskTableMetricInfo extends AbstractModel {

    /**
    * 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 表名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 总记录数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalRecordNum")
    @Expose
    private Long TotalRecordNum;

    /**
    * 总字节数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalRecordByteNum")
    @Expose
    private Long TotalRecordByteNum;

    /**
    * 总脏记录数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalDirtyRecordNum")
    @Expose
    private Long TotalDirtyRecordNum;

    /**
    * Schema名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * topic名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * Collection名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Collection")
    @Expose
    private String Collection;

    /**
    * 数据源名称
    */
    @SerializedName("DataSourceName")
    @Expose
    private String DataSourceName;

    /**
    * 节点id
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * 逻辑库名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogicDatabase")
    @Expose
    private String LogicDatabase;

    /**
    * 逻辑表名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogicTable")
    @Expose
    private String LogicTable;

    /**
    * 逻辑schema名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogicSchema")
    @Expose
    private String LogicSchema;

    /**
    * 物理表信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTableMetricInfos")
    @Expose
    private TaskTableMetricInfo [] TaskTableMetricInfos;

    /**
    * 同步状态，0-未知，1-正常， 2-异常
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SyncStatus")
    @Expose
    private Long SyncStatus;

    /**
    * Target数据库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetDatabaseName")
    @Expose
    private String TargetDatabaseName;

    /**
    * Target表名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetTableName")
    @Expose
    private String TargetTableName;

    /**
    * Write总记录数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WriteTotalRecordNum")
    @Expose
    private Long WriteTotalRecordNum;

    /**
    * Write总字节数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WriteTotalRecordByteNum")
    @Expose
    private String WriteTotalRecordByteNum;

    /**
    * TargetSchema名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetSchemaName")
    @Expose
    private String TargetSchemaName;

    /**
    * Targettopic名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetTopic")
    @Expose
    private String TargetTopic;

    /**
    * TargetCollection名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetCollection")
    @Expose
    private String TargetCollection;

    /**
    * 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetDataSourceName")
    @Expose
    private String TargetDataSourceName;

    /**
    * 节点id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetNodeId")
    @Expose
    private String TargetNodeId;

    /**
    * 读取条数的速度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalRecordSpeed")
    @Expose
    private Float TotalRecordSpeed;

    /**
    * 写入条数的速度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WriteTotalRecordSpeed")
    @Expose
    private Float WriteTotalRecordSpeed;

    /**
    * 异常原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExceptionReason")
    @Expose
    private String ExceptionReason;

    /**
     * Get 数据库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseName 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseName 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 表名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName 表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName 表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 总记录数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalRecordNum 总记录数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalRecordNum() {
        return this.TotalRecordNum;
    }

    /**
     * Set 总记录数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalRecordNum 总记录数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalRecordNum(Long TotalRecordNum) {
        this.TotalRecordNum = TotalRecordNum;
    }

    /**
     * Get 总字节数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalRecordByteNum 总字节数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalRecordByteNum() {
        return this.TotalRecordByteNum;
    }

    /**
     * Set 总字节数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalRecordByteNum 总字节数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalRecordByteNum(Long TotalRecordByteNum) {
        this.TotalRecordByteNum = TotalRecordByteNum;
    }

    /**
     * Get 总脏记录数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalDirtyRecordNum 总脏记录数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalDirtyRecordNum() {
        return this.TotalDirtyRecordNum;
    }

    /**
     * Set 总脏记录数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalDirtyRecordNum 总脏记录数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalDirtyRecordNum(Long TotalDirtyRecordNum) {
        this.TotalDirtyRecordNum = TotalDirtyRecordNum;
    }

    /**
     * Get Schema名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchemaName Schema名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set Schema名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchemaName Schema名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get topic名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Topic topic名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set topic名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Topic topic名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get Collection名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Collection Collection名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCollection() {
        return this.Collection;
    }

    /**
     * Set Collection名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Collection Collection名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCollection(String Collection) {
        this.Collection = Collection;
    }

    /**
     * Get 数据源名称 
     * @return DataSourceName 数据源名称
     */
    public String getDataSourceName() {
        return this.DataSourceName;
    }

    /**
     * Set 数据源名称
     * @param DataSourceName 数据源名称
     */
    public void setDataSourceName(String DataSourceName) {
        this.DataSourceName = DataSourceName;
    }

    /**
     * Get 节点id 
     * @return NodeId 节点id
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 节点id
     * @param NodeId 节点id
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 逻辑库名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogicDatabase 逻辑库名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogicDatabase() {
        return this.LogicDatabase;
    }

    /**
     * Set 逻辑库名
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogicDatabase 逻辑库名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogicDatabase(String LogicDatabase) {
        this.LogicDatabase = LogicDatabase;
    }

    /**
     * Get 逻辑表名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogicTable 逻辑表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogicTable() {
        return this.LogicTable;
    }

    /**
     * Set 逻辑表名
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogicTable 逻辑表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogicTable(String LogicTable) {
        this.LogicTable = LogicTable;
    }

    /**
     * Get 逻辑schema名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogicSchema 逻辑schema名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogicSchema() {
        return this.LogicSchema;
    }

    /**
     * Set 逻辑schema名
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogicSchema 逻辑schema名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogicSchema(String LogicSchema) {
        this.LogicSchema = LogicSchema;
    }

    /**
     * Get 物理表信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTableMetricInfos 物理表信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskTableMetricInfo [] getTaskTableMetricInfos() {
        return this.TaskTableMetricInfos;
    }

    /**
     * Set 物理表信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTableMetricInfos 物理表信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTableMetricInfos(TaskTableMetricInfo [] TaskTableMetricInfos) {
        this.TaskTableMetricInfos = TaskTableMetricInfos;
    }

    /**
     * Get 同步状态，0-未知，1-正常， 2-异常
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SyncStatus 同步状态，0-未知，1-正常， 2-异常
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSyncStatus() {
        return this.SyncStatus;
    }

    /**
     * Set 同步状态，0-未知，1-正常， 2-异常
注意：此字段可能返回 null，表示取不到有效值。
     * @param SyncStatus 同步状态，0-未知，1-正常， 2-异常
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSyncStatus(Long SyncStatus) {
        this.SyncStatus = SyncStatus;
    }

    /**
     * Get Target数据库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetDatabaseName Target数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetDatabaseName() {
        return this.TargetDatabaseName;
    }

    /**
     * Set Target数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetDatabaseName Target数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetDatabaseName(String TargetDatabaseName) {
        this.TargetDatabaseName = TargetDatabaseName;
    }

    /**
     * Get Target表名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetTableName Target表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetTableName() {
        return this.TargetTableName;
    }

    /**
     * Set Target表名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetTableName Target表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetTableName(String TargetTableName) {
        this.TargetTableName = TargetTableName;
    }

    /**
     * Get Write总记录数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WriteTotalRecordNum Write总记录数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWriteTotalRecordNum() {
        return this.WriteTotalRecordNum;
    }

    /**
     * Set Write总记录数
注意：此字段可能返回 null，表示取不到有效值。
     * @param WriteTotalRecordNum Write总记录数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWriteTotalRecordNum(Long WriteTotalRecordNum) {
        this.WriteTotalRecordNum = WriteTotalRecordNum;
    }

    /**
     * Get Write总字节数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WriteTotalRecordByteNum Write总字节数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWriteTotalRecordByteNum() {
        return this.WriteTotalRecordByteNum;
    }

    /**
     * Set Write总字节数
注意：此字段可能返回 null，表示取不到有效值。
     * @param WriteTotalRecordByteNum Write总字节数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWriteTotalRecordByteNum(String WriteTotalRecordByteNum) {
        this.WriteTotalRecordByteNum = WriteTotalRecordByteNum;
    }

    /**
     * Get TargetSchema名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetSchemaName TargetSchema名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetSchemaName() {
        return this.TargetSchemaName;
    }

    /**
     * Set TargetSchema名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetSchemaName TargetSchema名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetSchemaName(String TargetSchemaName) {
        this.TargetSchemaName = TargetSchemaName;
    }

    /**
     * Get Targettopic名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetTopic Targettopic名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetTopic() {
        return this.TargetTopic;
    }

    /**
     * Set Targettopic名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetTopic Targettopic名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetTopic(String TargetTopic) {
        this.TargetTopic = TargetTopic;
    }

    /**
     * Get TargetCollection名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetCollection TargetCollection名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetCollection() {
        return this.TargetCollection;
    }

    /**
     * Set TargetCollection名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetCollection TargetCollection名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetCollection(String TargetCollection) {
        this.TargetCollection = TargetCollection;
    }

    /**
     * Get 数据源名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetDataSourceName 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetDataSourceName() {
        return this.TargetDataSourceName;
    }

    /**
     * Set 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetDataSourceName 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetDataSourceName(String TargetDataSourceName) {
        this.TargetDataSourceName = TargetDataSourceName;
    }

    /**
     * Get 节点id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetNodeId 节点id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetNodeId() {
        return this.TargetNodeId;
    }

    /**
     * Set 节点id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetNodeId 节点id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetNodeId(String TargetNodeId) {
        this.TargetNodeId = TargetNodeId;
    }

    /**
     * Get 读取条数的速度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalRecordSpeed 读取条数的速度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTotalRecordSpeed() {
        return this.TotalRecordSpeed;
    }

    /**
     * Set 读取条数的速度
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalRecordSpeed 读取条数的速度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalRecordSpeed(Float TotalRecordSpeed) {
        this.TotalRecordSpeed = TotalRecordSpeed;
    }

    /**
     * Get 写入条数的速度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WriteTotalRecordSpeed 写入条数的速度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getWriteTotalRecordSpeed() {
        return this.WriteTotalRecordSpeed;
    }

    /**
     * Set 写入条数的速度
注意：此字段可能返回 null，表示取不到有效值。
     * @param WriteTotalRecordSpeed 写入条数的速度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWriteTotalRecordSpeed(Float WriteTotalRecordSpeed) {
        this.WriteTotalRecordSpeed = WriteTotalRecordSpeed;
    }

    /**
     * Get 异常原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExceptionReason 异常原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExceptionReason() {
        return this.ExceptionReason;
    }

    /**
     * Set 异常原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExceptionReason 异常原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExceptionReason(String ExceptionReason) {
        this.ExceptionReason = ExceptionReason;
    }

    public TaskTableMetricInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskTableMetricInfo(TaskTableMetricInfo source) {
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.TotalRecordNum != null) {
            this.TotalRecordNum = new Long(source.TotalRecordNum);
        }
        if (source.TotalRecordByteNum != null) {
            this.TotalRecordByteNum = new Long(source.TotalRecordByteNum);
        }
        if (source.TotalDirtyRecordNum != null) {
            this.TotalDirtyRecordNum = new Long(source.TotalDirtyRecordNum);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Collection != null) {
            this.Collection = new String(source.Collection);
        }
        if (source.DataSourceName != null) {
            this.DataSourceName = new String(source.DataSourceName);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.LogicDatabase != null) {
            this.LogicDatabase = new String(source.LogicDatabase);
        }
        if (source.LogicTable != null) {
            this.LogicTable = new String(source.LogicTable);
        }
        if (source.LogicSchema != null) {
            this.LogicSchema = new String(source.LogicSchema);
        }
        if (source.TaskTableMetricInfos != null) {
            this.TaskTableMetricInfos = new TaskTableMetricInfo[source.TaskTableMetricInfos.length];
            for (int i = 0; i < source.TaskTableMetricInfos.length; i++) {
                this.TaskTableMetricInfos[i] = new TaskTableMetricInfo(source.TaskTableMetricInfos[i]);
            }
        }
        if (source.SyncStatus != null) {
            this.SyncStatus = new Long(source.SyncStatus);
        }
        if (source.TargetDatabaseName != null) {
            this.TargetDatabaseName = new String(source.TargetDatabaseName);
        }
        if (source.TargetTableName != null) {
            this.TargetTableName = new String(source.TargetTableName);
        }
        if (source.WriteTotalRecordNum != null) {
            this.WriteTotalRecordNum = new Long(source.WriteTotalRecordNum);
        }
        if (source.WriteTotalRecordByteNum != null) {
            this.WriteTotalRecordByteNum = new String(source.WriteTotalRecordByteNum);
        }
        if (source.TargetSchemaName != null) {
            this.TargetSchemaName = new String(source.TargetSchemaName);
        }
        if (source.TargetTopic != null) {
            this.TargetTopic = new String(source.TargetTopic);
        }
        if (source.TargetCollection != null) {
            this.TargetCollection = new String(source.TargetCollection);
        }
        if (source.TargetDataSourceName != null) {
            this.TargetDataSourceName = new String(source.TargetDataSourceName);
        }
        if (source.TargetNodeId != null) {
            this.TargetNodeId = new String(source.TargetNodeId);
        }
        if (source.TotalRecordSpeed != null) {
            this.TotalRecordSpeed = new Float(source.TotalRecordSpeed);
        }
        if (source.WriteTotalRecordSpeed != null) {
            this.WriteTotalRecordSpeed = new Float(source.WriteTotalRecordSpeed);
        }
        if (source.ExceptionReason != null) {
            this.ExceptionReason = new String(source.ExceptionReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TotalRecordNum", this.TotalRecordNum);
        this.setParamSimple(map, prefix + "TotalRecordByteNum", this.TotalRecordByteNum);
        this.setParamSimple(map, prefix + "TotalDirtyRecordNum", this.TotalDirtyRecordNum);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Collection", this.Collection);
        this.setParamSimple(map, prefix + "DataSourceName", this.DataSourceName);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "LogicDatabase", this.LogicDatabase);
        this.setParamSimple(map, prefix + "LogicTable", this.LogicTable);
        this.setParamSimple(map, prefix + "LogicSchema", this.LogicSchema);
        this.setParamArrayObj(map, prefix + "TaskTableMetricInfos.", this.TaskTableMetricInfos);
        this.setParamSimple(map, prefix + "SyncStatus", this.SyncStatus);
        this.setParamSimple(map, prefix + "TargetDatabaseName", this.TargetDatabaseName);
        this.setParamSimple(map, prefix + "TargetTableName", this.TargetTableName);
        this.setParamSimple(map, prefix + "WriteTotalRecordNum", this.WriteTotalRecordNum);
        this.setParamSimple(map, prefix + "WriteTotalRecordByteNum", this.WriteTotalRecordByteNum);
        this.setParamSimple(map, prefix + "TargetSchemaName", this.TargetSchemaName);
        this.setParamSimple(map, prefix + "TargetTopic", this.TargetTopic);
        this.setParamSimple(map, prefix + "TargetCollection", this.TargetCollection);
        this.setParamSimple(map, prefix + "TargetDataSourceName", this.TargetDataSourceName);
        this.setParamSimple(map, prefix + "TargetNodeId", this.TargetNodeId);
        this.setParamSimple(map, prefix + "TotalRecordSpeed", this.TotalRecordSpeed);
        this.setParamSimple(map, prefix + "WriteTotalRecordSpeed", this.WriteTotalRecordSpeed);
        this.setParamSimple(map, prefix + "ExceptionReason", this.ExceptionReason);

    }
}

