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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTasksRequest extends AbstractModel{

    /**
    * 数据库名称。如果SQL语句中有数据库名称，优先使用SQL语句中的数据库，否则使用该参数指定的数据库（注：当提交建库sql时，该字段传空字符串）。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * SQL任务信息
    */
    @SerializedName("Tasks")
    @Expose
    private TasksInfo Tasks;

    /**
    * 数据源名称，默认为DataLakeCatalog
    */
    @SerializedName("DatasourceConnectionName")
    @Expose
    private String DatasourceConnectionName;

    /**
    * 计算引擎名称，不填任务提交到默认集群
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
     * Get 数据库名称。如果SQL语句中有数据库名称，优先使用SQL语句中的数据库，否则使用该参数指定的数据库（注：当提交建库sql时，该字段传空字符串）。 
     * @return DatabaseName 数据库名称。如果SQL语句中有数据库名称，优先使用SQL语句中的数据库，否则使用该参数指定的数据库（注：当提交建库sql时，该字段传空字符串）。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名称。如果SQL语句中有数据库名称，优先使用SQL语句中的数据库，否则使用该参数指定的数据库（注：当提交建库sql时，该字段传空字符串）。
     * @param DatabaseName 数据库名称。如果SQL语句中有数据库名称，优先使用SQL语句中的数据库，否则使用该参数指定的数据库（注：当提交建库sql时，该字段传空字符串）。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get SQL任务信息 
     * @return Tasks SQL任务信息
     */
    public TasksInfo getTasks() {
        return this.Tasks;
    }

    /**
     * Set SQL任务信息
     * @param Tasks SQL任务信息
     */
    public void setTasks(TasksInfo Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get 数据源名称，默认为DataLakeCatalog 
     * @return DatasourceConnectionName 数据源名称，默认为DataLakeCatalog
     */
    public String getDatasourceConnectionName() {
        return this.DatasourceConnectionName;
    }

    /**
     * Set 数据源名称，默认为DataLakeCatalog
     * @param DatasourceConnectionName 数据源名称，默认为DataLakeCatalog
     */
    public void setDatasourceConnectionName(String DatasourceConnectionName) {
        this.DatasourceConnectionName = DatasourceConnectionName;
    }

    /**
     * Get 计算引擎名称，不填任务提交到默认集群 
     * @return DataEngineName 计算引擎名称，不填任务提交到默认集群
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set 计算引擎名称，不填任务提交到默认集群
     * @param DataEngineName 计算引擎名称，不填任务提交到默认集群
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    public CreateTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTasksRequest(CreateTasksRequest source) {
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.Tasks != null) {
            this.Tasks = new TasksInfo(source.Tasks);
        }
        if (source.DatasourceConnectionName != null) {
            this.DatasourceConnectionName = new String(source.DatasourceConnectionName);
        }
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "DatasourceConnectionName", this.DatasourceConnectionName);
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);

    }
}

