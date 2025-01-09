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

public class CreateHiveTableByDDLRequest extends AbstractModel {

    /**
    * 数据源ID
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * 数据库
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * 建hive表ddl
    */
    @SerializedName("DDLSql")
    @Expose
    private String DDLSql;

    /**
    * 表权限 ，默认为0:项目共享;1:仅个人与管理员
    */
    @SerializedName("Privilege")
    @Expose
    private Long Privilege;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 目标表类型(HIVE或GBASE)
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 责任人
    */
    @SerializedName("Incharge")
    @Expose
    private String Incharge;

    /**
    * schema名称
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 是否异步建表
    */
    @SerializedName("Async")
    @Expose
    private Boolean Async;

    /**
    * 数据优化使用的资源
    */
    @SerializedName("DataOptimizationResource")
    @Expose
    private String DataOptimizationResource;

    /**
    * 是否开启数据优化
    */
    @SerializedName("SmartOptimizerWritten")
    @Expose
    private String SmartOptimizerWritten;

    /**
     * Get 数据源ID 
     * @return DatasourceId 数据源ID
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源ID
     * @param DatasourceId 数据源ID
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 数据库 
     * @return Database 数据库
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set 数据库
     * @param Database 数据库
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get 建hive表ddl 
     * @return DDLSql 建hive表ddl
     */
    public String getDDLSql() {
        return this.DDLSql;
    }

    /**
     * Set 建hive表ddl
     * @param DDLSql 建hive表ddl
     */
    public void setDDLSql(String DDLSql) {
        this.DDLSql = DDLSql;
    }

    /**
     * Get 表权限 ，默认为0:项目共享;1:仅个人与管理员 
     * @return Privilege 表权限 ，默认为0:项目共享;1:仅个人与管理员
     */
    public Long getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set 表权限 ，默认为0:项目共享;1:仅个人与管理员
     * @param Privilege 表权限 ，默认为0:项目共享;1:仅个人与管理员
     */
    public void setPrivilege(Long Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 目标表类型(HIVE或GBASE) 
     * @return Type 目标表类型(HIVE或GBASE)
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 目标表类型(HIVE或GBASE)
     * @param Type 目标表类型(HIVE或GBASE)
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 责任人 
     * @return Incharge 责任人
     */
    public String getIncharge() {
        return this.Incharge;
    }

    /**
     * Set 责任人
     * @param Incharge 责任人
     */
    public void setIncharge(String Incharge) {
        this.Incharge = Incharge;
    }

    /**
     * Get schema名称 
     * @return SchemaName schema名称
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set schema名称
     * @param SchemaName schema名称
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get 是否异步建表 
     * @return Async 是否异步建表
     */
    public Boolean getAsync() {
        return this.Async;
    }

    /**
     * Set 是否异步建表
     * @param Async 是否异步建表
     */
    public void setAsync(Boolean Async) {
        this.Async = Async;
    }

    /**
     * Get 数据优化使用的资源 
     * @return DataOptimizationResource 数据优化使用的资源
     */
    public String getDataOptimizationResource() {
        return this.DataOptimizationResource;
    }

    /**
     * Set 数据优化使用的资源
     * @param DataOptimizationResource 数据优化使用的资源
     */
    public void setDataOptimizationResource(String DataOptimizationResource) {
        this.DataOptimizationResource = DataOptimizationResource;
    }

    /**
     * Get 是否开启数据优化 
     * @return SmartOptimizerWritten 是否开启数据优化
     */
    public String getSmartOptimizerWritten() {
        return this.SmartOptimizerWritten;
    }

    /**
     * Set 是否开启数据优化
     * @param SmartOptimizerWritten 是否开启数据优化
     */
    public void setSmartOptimizerWritten(String SmartOptimizerWritten) {
        this.SmartOptimizerWritten = SmartOptimizerWritten;
    }

    public CreateHiveTableByDDLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateHiveTableByDDLRequest(CreateHiveTableByDDLRequest source) {
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.DDLSql != null) {
            this.DDLSql = new String(source.DDLSql);
        }
        if (source.Privilege != null) {
            this.Privilege = new Long(source.Privilege);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Incharge != null) {
            this.Incharge = new String(source.Incharge);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.Async != null) {
            this.Async = new Boolean(source.Async);
        }
        if (source.DataOptimizationResource != null) {
            this.DataOptimizationResource = new String(source.DataOptimizationResource);
        }
        if (source.SmartOptimizerWritten != null) {
            this.SmartOptimizerWritten = new String(source.SmartOptimizerWritten);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "DDLSql", this.DDLSql);
        this.setParamSimple(map, prefix + "Privilege", this.Privilege);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Incharge", this.Incharge);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "Async", this.Async);
        this.setParamSimple(map, prefix + "DataOptimizationResource", this.DataOptimizationResource);
        this.setParamSimple(map, prefix + "SmartOptimizerWritten", this.SmartOptimizerWritten);

    }
}

