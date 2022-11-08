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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateHiveTableRequest extends AbstractModel{

    /**
    * 数据源id
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

    }
}

