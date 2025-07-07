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

public class DeleteCustomFunctionRequest extends AbstractModel {

    /**
    * 集群实例 ID
    */
    @SerializedName("ClusterIdentifier")
    @Expose
    private String ClusterIdentifier;

    /**
    * 函数 ID
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * 项目ID，必须填
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 函数名称
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 函数类型，HIVE，SPARK，DLC，CDW_POSTGRESQL
    */
    @SerializedName("FunctionType")
    @Expose
    private String FunctionType;

    /**
    * 数据库名
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 模式名
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 函数命令格式
    */
    @SerializedName("CommandFormat")
    @Expose
    private String CommandFormat;

    /**
     * Get 集群实例 ID 
     * @return ClusterIdentifier 集群实例 ID
     */
    public String getClusterIdentifier() {
        return this.ClusterIdentifier;
    }

    /**
     * Set 集群实例 ID
     * @param ClusterIdentifier 集群实例 ID
     */
    public void setClusterIdentifier(String ClusterIdentifier) {
        this.ClusterIdentifier = ClusterIdentifier;
    }

    /**
     * Get 函数 ID 
     * @return FunctionId 函数 ID
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set 函数 ID
     * @param FunctionId 函数 ID
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get 项目ID，必须填 
     * @return ProjectId 项目ID，必须填
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID，必须填
     * @param ProjectId 项目ID，必须填
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 函数名称 
     * @return FunctionName 函数名称
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set 函数名称
     * @param FunctionName 函数名称
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get 函数类型，HIVE，SPARK，DLC，CDW_POSTGRESQL 
     * @return FunctionType 函数类型，HIVE，SPARK，DLC，CDW_POSTGRESQL
     */
    public String getFunctionType() {
        return this.FunctionType;
    }

    /**
     * Set 函数类型，HIVE，SPARK，DLC，CDW_POSTGRESQL
     * @param FunctionType 函数类型，HIVE，SPARK，DLC，CDW_POSTGRESQL
     */
    public void setFunctionType(String FunctionType) {
        this.FunctionType = FunctionType;
    }

    /**
     * Get 数据库名 
     * @return DatabaseName 数据库名
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名
     * @param DatabaseName 数据库名
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 模式名 
     * @return SchemaName 模式名
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set 模式名
     * @param SchemaName 模式名
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get 函数命令格式 
     * @return CommandFormat 函数命令格式
     */
    public String getCommandFormat() {
        return this.CommandFormat;
    }

    /**
     * Set 函数命令格式
     * @param CommandFormat 函数命令格式
     */
    public void setCommandFormat(String CommandFormat) {
        this.CommandFormat = CommandFormat;
    }

    public DeleteCustomFunctionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCustomFunctionRequest(DeleteCustomFunctionRequest source) {
        if (source.ClusterIdentifier != null) {
            this.ClusterIdentifier = new String(source.ClusterIdentifier);
        }
        if (source.FunctionId != null) {
            this.FunctionId = new String(source.FunctionId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.FunctionType != null) {
            this.FunctionType = new String(source.FunctionType);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.CommandFormat != null) {
            this.CommandFormat = new String(source.CommandFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterIdentifier", this.ClusterIdentifier);
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "FunctionType", this.FunctionType);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "CommandFormat", this.CommandFormat);

    }
}

