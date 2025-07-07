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

public class CreateHiveTableRequest extends AbstractModel {

    /**
    * 数据源id
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * 数据库名称
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * base64转码之后的建表语句
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
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 责任人
    */
    @SerializedName("Incharge")
    @Expose
    private String Incharge;

    /**
    * 数据优化引擎
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
    * 数据优化针对的表
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 数据优化资源组
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

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
     * Get 数据库名称 
     * @return Database 数据库名称
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set 数据库名称
     * @param Database 数据库名称
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get base64转码之后的建表语句 
     * @return DDLSql base64转码之后的建表语句
     */
    public String getDDLSql() {
        return this.DDLSql;
    }

    /**
     * Set base64转码之后的建表语句
     * @param DDLSql base64转码之后的建表语句
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
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
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
     * Get 数据优化引擎 
     * @return DataOptimizationResource 数据优化引擎
     */
    public String getDataOptimizationResource() {
        return this.DataOptimizationResource;
    }

    /**
     * Set 数据优化引擎
     * @param DataOptimizationResource 数据优化引擎
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

    /**
     * Get 数据优化针对的表 
     * @return TableName 数据优化针对的表
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 数据优化针对的表
     * @param TableName 数据优化针对的表
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 数据优化资源组 
     * @return ResourceGroupName 数据优化资源组
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set 数据优化资源组
     * @param ResourceGroupName 数据优化资源组
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    public CreateHiveTableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateHiveTableRequest(CreateHiveTableRequest source) {
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
        if (source.Incharge != null) {
            this.Incharge = new String(source.Incharge);
        }
        if (source.DataOptimizationResource != null) {
            this.DataOptimizationResource = new String(source.DataOptimizationResource);
        }
        if (source.SmartOptimizerWritten != null) {
            this.SmartOptimizerWritten = new String(source.SmartOptimizerWritten);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
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
        this.setParamSimple(map, prefix + "Incharge", this.Incharge);
        this.setParamSimple(map, prefix + "DataOptimizationResource", this.DataOptimizationResource);
        this.setParamSimple(map, prefix + "SmartOptimizerWritten", this.SmartOptimizerWritten);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);

    }
}

