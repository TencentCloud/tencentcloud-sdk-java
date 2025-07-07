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

public class CreateTasksRequest extends AbstractModel {

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
    * spark集群资源组名称
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * 是否使用multi- statement方式运行一批次任务，true: 是，false: 否
    */
    @SerializedName("IsMultiStatement")
    @Expose
    private Boolean IsMultiStatement;

    /**
    * 任务来源信息
    */
    @SerializedName("SourceInfo")
    @Expose
    private KVPair [] SourceInfo;

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

    /**
     * Get spark集群资源组名称 
     * @return ResourceGroupName spark集群资源组名称
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set spark集群资源组名称
     * @param ResourceGroupName spark集群资源组名称
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    /**
     * Get 是否使用multi- statement方式运行一批次任务，true: 是，false: 否 
     * @return IsMultiStatement 是否使用multi- statement方式运行一批次任务，true: 是，false: 否
     */
    public Boolean getIsMultiStatement() {
        return this.IsMultiStatement;
    }

    /**
     * Set 是否使用multi- statement方式运行一批次任务，true: 是，false: 否
     * @param IsMultiStatement 是否使用multi- statement方式运行一批次任务，true: 是，false: 否
     */
    public void setIsMultiStatement(Boolean IsMultiStatement) {
        this.IsMultiStatement = IsMultiStatement;
    }

    /**
     * Get 任务来源信息 
     * @return SourceInfo 任务来源信息
     */
    public KVPair [] getSourceInfo() {
        return this.SourceInfo;
    }

    /**
     * Set 任务来源信息
     * @param SourceInfo 任务来源信息
     */
    public void setSourceInfo(KVPair [] SourceInfo) {
        this.SourceInfo = SourceInfo;
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
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
        }
        if (source.IsMultiStatement != null) {
            this.IsMultiStatement = new Boolean(source.IsMultiStatement);
        }
        if (source.SourceInfo != null) {
            this.SourceInfo = new KVPair[source.SourceInfo.length];
            for (int i = 0; i < source.SourceInfo.length; i++) {
                this.SourceInfo[i] = new KVPair(source.SourceInfo[i]);
            }
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
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);
        this.setParamSimple(map, prefix + "IsMultiStatement", this.IsMultiStatement);
        this.setParamArrayObj(map, prefix + "SourceInfo.", this.SourceInfo);

    }
}

