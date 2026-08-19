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

public class DescribeTableContentPreviewRequest extends AbstractModel {

    /**
    * <p>表ID</p>
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * <p>组件类型枚举值，支持的值有 HDFS/HBASE/HIVE/KAFKA</p>
    */
    @SerializedName("TechnologyType")
    @Expose
    private String TechnologyType;

    /**
    * <p>集群id</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>资源类型枚举值，支持的值有TOPIC/PATH/TABLE/DATABASE</p>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * <p>表名</p>
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * <p>项目id</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>预览的行数，默认10行</p>
    */
    @SerializedName("RowNum")
    @Expose
    private Long RowNum;

    /**
    * <p>数据库名，kafka或其他无数据库概念的不填</p>
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * <p>异步查询预览结果时填写</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>分区信息</p>
    */
    @SerializedName("PartitionName")
    @Expose
    private String PartitionName;

    /**
    * <p>资源组ID</p>
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * <p>执行SQL</p>
    */
    @SerializedName("Sql")
    @Expose
    private String Sql;

    /**
    * <p>引擎名</p>
    */
    @SerializedName("EngineId")
    @Expose
    private String EngineId;

    /**
     * Get <p>表ID</p> 
     * @return TableId <p>表ID</p>
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set <p>表ID</p>
     * @param TableId <p>表ID</p>
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get <p>组件类型枚举值，支持的值有 HDFS/HBASE/HIVE/KAFKA</p> 
     * @return TechnologyType <p>组件类型枚举值，支持的值有 HDFS/HBASE/HIVE/KAFKA</p>
     */
    public String getTechnologyType() {
        return this.TechnologyType;
    }

    /**
     * Set <p>组件类型枚举值，支持的值有 HDFS/HBASE/HIVE/KAFKA</p>
     * @param TechnologyType <p>组件类型枚举值，支持的值有 HDFS/HBASE/HIVE/KAFKA</p>
     */
    public void setTechnologyType(String TechnologyType) {
        this.TechnologyType = TechnologyType;
    }

    /**
     * Get <p>集群id</p> 
     * @return ClusterId <p>集群id</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群id</p>
     * @param ClusterId <p>集群id</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>资源类型枚举值，支持的值有TOPIC/PATH/TABLE/DATABASE</p> 
     * @return ResourceType <p>资源类型枚举值，支持的值有TOPIC/PATH/TABLE/DATABASE</p>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>资源类型枚举值，支持的值有TOPIC/PATH/TABLE/DATABASE</p>
     * @param ResourceType <p>资源类型枚举值，支持的值有TOPIC/PATH/TABLE/DATABASE</p>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>表名</p> 
     * @return TableName <p>表名</p>
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set <p>表名</p>
     * @param TableName <p>表名</p>
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get <p>项目id</p> 
     * @return ProjectId <p>项目id</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目id</p>
     * @param ProjectId <p>项目id</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>预览的行数，默认10行</p> 
     * @return RowNum <p>预览的行数，默认10行</p>
     */
    public Long getRowNum() {
        return this.RowNum;
    }

    /**
     * Set <p>预览的行数，默认10行</p>
     * @param RowNum <p>预览的行数，默认10行</p>
     */
    public void setRowNum(Long RowNum) {
        this.RowNum = RowNum;
    }

    /**
     * Get <p>数据库名，kafka或其他无数据库概念的不填</p> 
     * @return DatabaseName <p>数据库名，kafka或其他无数据库概念的不填</p>
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set <p>数据库名，kafka或其他无数据库概念的不填</p>
     * @param DatabaseName <p>数据库名，kafka或其他无数据库概念的不填</p>
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get <p>异步查询预览结果时填写</p> 
     * @return TaskId <p>异步查询预览结果时填写</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>异步查询预览结果时填写</p>
     * @param TaskId <p>异步查询预览结果时填写</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>分区信息</p> 
     * @return PartitionName <p>分区信息</p>
     */
    public String getPartitionName() {
        return this.PartitionName;
    }

    /**
     * Set <p>分区信息</p>
     * @param PartitionName <p>分区信息</p>
     */
    public void setPartitionName(String PartitionName) {
        this.PartitionName = PartitionName;
    }

    /**
     * Get <p>资源组ID</p> 
     * @return ResourceGroupId <p>资源组ID</p>
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set <p>资源组ID</p>
     * @param ResourceGroupId <p>资源组ID</p>
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get <p>执行SQL</p> 
     * @return Sql <p>执行SQL</p>
     */
    public String getSql() {
        return this.Sql;
    }

    /**
     * Set <p>执行SQL</p>
     * @param Sql <p>执行SQL</p>
     */
    public void setSql(String Sql) {
        this.Sql = Sql;
    }

    /**
     * Get <p>引擎名</p> 
     * @return EngineId <p>引擎名</p>
     */
    public String getEngineId() {
        return this.EngineId;
    }

    /**
     * Set <p>引擎名</p>
     * @param EngineId <p>引擎名</p>
     */
    public void setEngineId(String EngineId) {
        this.EngineId = EngineId;
    }

    public DescribeTableContentPreviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTableContentPreviewRequest(DescribeTableContentPreviewRequest source) {
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.TechnologyType != null) {
            this.TechnologyType = new String(source.TechnologyType);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.RowNum != null) {
            this.RowNum = new Long(source.RowNum);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.PartitionName != null) {
            this.PartitionName = new String(source.PartitionName);
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.Sql != null) {
            this.Sql = new String(source.Sql);
        }
        if (source.EngineId != null) {
            this.EngineId = new String(source.EngineId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "TechnologyType", this.TechnologyType);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RowNum", this.RowNum);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "PartitionName", this.PartitionName);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "Sql", this.Sql);
        this.setParamSimple(map, prefix + "EngineId", this.EngineId);

    }
}

