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

public class DescribeTableSchemaInfoRequest extends AbstractModel {

    /**
    * 表名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 数据库名称
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 数据源的类型（例如MYSQL、HIVE、KAFKA等）
    */
    @SerializedName("MsType")
    @Expose
    private String MsType;

    /**
    * 数据源id
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * 连接类型（示例值rpc）
    */
    @SerializedName("ConnectionType")
    @Expose
    private String ConnectionType;

    /**
    * 元数据Database下的Schema名称
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 项目空间ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 环境信息
    */
    @SerializedName("Env")
    @Expose
    private String Env;

    /**
    * 空间模式
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 开发态的datasourceId
    */
    @SerializedName("DevDatasourceId")
    @Expose
    private String DevDatasourceId;

    /**
     * Get 表名称 
     * @return Name 表名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 表名称
     * @param Name 表名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 数据库名称 
     * @return DatabaseName 数据库名称
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名称
     * @param DatabaseName 数据库名称
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 数据源的类型（例如MYSQL、HIVE、KAFKA等） 
     * @return MsType 数据源的类型（例如MYSQL、HIVE、KAFKA等）
     */
    public String getMsType() {
        return this.MsType;
    }

    /**
     * Set 数据源的类型（例如MYSQL、HIVE、KAFKA等）
     * @param MsType 数据源的类型（例如MYSQL、HIVE、KAFKA等）
     */
    public void setMsType(String MsType) {
        this.MsType = MsType;
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
     * Get 连接类型（示例值rpc） 
     * @return ConnectionType 连接类型（示例值rpc）
     */
    public String getConnectionType() {
        return this.ConnectionType;
    }

    /**
     * Set 连接类型（示例值rpc）
     * @param ConnectionType 连接类型（示例值rpc）
     */
    public void setConnectionType(String ConnectionType) {
        this.ConnectionType = ConnectionType;
    }

    /**
     * Get 元数据Database下的Schema名称 
     * @return SchemaName 元数据Database下的Schema名称
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set 元数据Database下的Schema名称
     * @param SchemaName 元数据Database下的Schema名称
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get 项目空间ID 
     * @return ProjectId 项目空间ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目空间ID
     * @param ProjectId 项目空间ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 环境信息 
     * @return Env 环境信息
     */
    public String getEnv() {
        return this.Env;
    }

    /**
     * Set 环境信息
     * @param Env 环境信息
     */
    public void setEnv(String Env) {
        this.Env = Env;
    }

    /**
     * Get 空间模式 
     * @return Model 空间模式
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 空间模式
     * @param Model 空间模式
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get 开发态的datasourceId 
     * @return DevDatasourceId 开发态的datasourceId
     */
    public String getDevDatasourceId() {
        return this.DevDatasourceId;
    }

    /**
     * Set 开发态的datasourceId
     * @param DevDatasourceId 开发态的datasourceId
     */
    public void setDevDatasourceId(String DevDatasourceId) {
        this.DevDatasourceId = DevDatasourceId;
    }

    public DescribeTableSchemaInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTableSchemaInfoRequest(DescribeTableSchemaInfoRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.MsType != null) {
            this.MsType = new String(source.MsType);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.ConnectionType != null) {
            this.ConnectionType = new String(source.ConnectionType);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Env != null) {
            this.Env = new String(source.Env);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.DevDatasourceId != null) {
            this.DevDatasourceId = new String(source.DevDatasourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "MsType", this.MsType);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "ConnectionType", this.ConnectionType);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Env", this.Env);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "DevDatasourceId", this.DevDatasourceId);

    }
}

