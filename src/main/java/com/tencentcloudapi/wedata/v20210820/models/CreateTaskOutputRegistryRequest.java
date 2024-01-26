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

public class CreateTaskOutputRegistryRequest extends AbstractModel {

    /**
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 表物理id
    */
    @SerializedName("TablePhysicalId")
    @Expose
    private String TablePhysicalId;

    /**
    * 登记项Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 数据源id
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * 库名
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 表名
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 表唯一标识
    */
    @SerializedName("TableGuid")
    @Expose
    private String TableGuid;

    /**
    * 分区名
    */
    @SerializedName("PartitionName")
    @Expose
    private String PartitionName;

    /**
    * 库唯一标识
    */
    @SerializedName("DbGuid")
    @Expose
    private String DbGuid;

    /**
     * Get 任务id 
     * @return TaskId 任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
     * @param TaskId 任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

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
     * Get 表物理id 
     * @return TablePhysicalId 表物理id
     */
    public String getTablePhysicalId() {
        return this.TablePhysicalId;
    }

    /**
     * Set 表物理id
     * @param TablePhysicalId 表物理id
     */
    public void setTablePhysicalId(String TablePhysicalId) {
        this.TablePhysicalId = TablePhysicalId;
    }

    /**
     * Get 登记项Id 
     * @return Id 登记项Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 登记项Id
     * @param Id 登记项Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 数据源id 
     * @return DatasourceId 数据源id
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源id
     * @param DatasourceId 数据源id
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 库名 
     * @return DatabaseName 库名
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 库名
     * @param DatabaseName 库名
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
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
     * Get 表唯一标识 
     * @return TableGuid 表唯一标识
     */
    public String getTableGuid() {
        return this.TableGuid;
    }

    /**
     * Set 表唯一标识
     * @param TableGuid 表唯一标识
     */
    public void setTableGuid(String TableGuid) {
        this.TableGuid = TableGuid;
    }

    /**
     * Get 分区名 
     * @return PartitionName 分区名
     */
    public String getPartitionName() {
        return this.PartitionName;
    }

    /**
     * Set 分区名
     * @param PartitionName 分区名
     */
    public void setPartitionName(String PartitionName) {
        this.PartitionName = PartitionName;
    }

    /**
     * Get 库唯一标识 
     * @return DbGuid 库唯一标识
     */
    public String getDbGuid() {
        return this.DbGuid;
    }

    /**
     * Set 库唯一标识
     * @param DbGuid 库唯一标识
     */
    public void setDbGuid(String DbGuid) {
        this.DbGuid = DbGuid;
    }

    public CreateTaskOutputRegistryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTaskOutputRegistryRequest(CreateTaskOutputRegistryRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TablePhysicalId != null) {
            this.TablePhysicalId = new String(source.TablePhysicalId);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.TableGuid != null) {
            this.TableGuid = new String(source.TableGuid);
        }
        if (source.PartitionName != null) {
            this.PartitionName = new String(source.PartitionName);
        }
        if (source.DbGuid != null) {
            this.DbGuid = new String(source.DbGuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TablePhysicalId", this.TablePhysicalId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableGuid", this.TableGuid);
        this.setParamSimple(map, prefix + "PartitionName", this.PartitionName);
        this.setParamSimple(map, prefix + "DbGuid", this.DbGuid);

    }
}

