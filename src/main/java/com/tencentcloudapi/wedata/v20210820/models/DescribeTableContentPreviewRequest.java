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
    * 表ID
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * 组件类型枚举值，支持的值有 HDFS/HBASE/HIVE/KAFKA
    */
    @SerializedName("TechnologyType")
    @Expose
    private String TechnologyType;

    /**
    * 集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 资源类型枚举值，支持的值有TOPIC/PATH/TABLE/DATABASE
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 表名
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 预览的行数，默认10行
    */
    @SerializedName("RowNum")
    @Expose
    private Long RowNum;

    /**
    * 数据库名，kafka或其他无数据库概念的不填
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 异步查询预览结果时填写
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 分区信息
    */
    @SerializedName("PartitionName")
    @Expose
    private String PartitionName;

    /**
     * Get 表ID 
     * @return TableId 表ID
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set 表ID
     * @param TableId 表ID
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get 组件类型枚举值，支持的值有 HDFS/HBASE/HIVE/KAFKA 
     * @return TechnologyType 组件类型枚举值，支持的值有 HDFS/HBASE/HIVE/KAFKA
     */
    public String getTechnologyType() {
        return this.TechnologyType;
    }

    /**
     * Set 组件类型枚举值，支持的值有 HDFS/HBASE/HIVE/KAFKA
     * @param TechnologyType 组件类型枚举值，支持的值有 HDFS/HBASE/HIVE/KAFKA
     */
    public void setTechnologyType(String TechnologyType) {
        this.TechnologyType = TechnologyType;
    }

    /**
     * Get 集群id 
     * @return ClusterId 集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
     * @param ClusterId 集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 资源类型枚举值，支持的值有TOPIC/PATH/TABLE/DATABASE 
     * @return ResourceType 资源类型枚举值，支持的值有TOPIC/PATH/TABLE/DATABASE
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型枚举值，支持的值有TOPIC/PATH/TABLE/DATABASE
     * @param ResourceType 资源类型枚举值，支持的值有TOPIC/PATH/TABLE/DATABASE
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 表名 
     * @return TableName 表名
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名
     * @param TableName 表名
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
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
     * Get 预览的行数，默认10行 
     * @return RowNum 预览的行数，默认10行
     */
    public Long getRowNum() {
        return this.RowNum;
    }

    /**
     * Set 预览的行数，默认10行
     * @param RowNum 预览的行数，默认10行
     */
    public void setRowNum(Long RowNum) {
        this.RowNum = RowNum;
    }

    /**
     * Get 数据库名，kafka或其他无数据库概念的不填 
     * @return DatabaseName 数据库名，kafka或其他无数据库概念的不填
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名，kafka或其他无数据库概念的不填
     * @param DatabaseName 数据库名，kafka或其他无数据库概念的不填
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 异步查询预览结果时填写 
     * @return TaskId 异步查询预览结果时填写
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 异步查询预览结果时填写
     * @param TaskId 异步查询预览结果时填写
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 分区信息 
     * @return PartitionName 分区信息
     */
    public String getPartitionName() {
        return this.PartitionName;
    }

    /**
     * Set 分区信息
     * @param PartitionName 分区信息
     */
    public void setPartitionName(String PartitionName) {
        this.PartitionName = PartitionName;
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

    }
}

