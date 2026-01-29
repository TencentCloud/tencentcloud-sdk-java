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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunSqlRequest extends AbstractModel {

    /**
    * 要执行的SQL语句
    */
    @SerializedName("Sql")
    @Expose
    private String Sql;

    /**
    * 云开发环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 数据库连接器实例信息
    */
    @SerializedName("DbInstance")
    @Expose
    private DbInstance DbInstance;

    /**
    * 是否只读；当 `true` 时仅允许以 `SELECT/WITH/SHOW/DESCRIBE/DESC/EXPLAIN` 开头的 SQL
    */
    @SerializedName("ReadOnly")
    @Expose
    private Boolean ReadOnly;

    /**
     * Get 要执行的SQL语句 
     * @return Sql 要执行的SQL语句
     */
    public String getSql() {
        return this.Sql;
    }

    /**
     * Set 要执行的SQL语句
     * @param Sql 要执行的SQL语句
     */
    public void setSql(String Sql) {
        this.Sql = Sql;
    }

    /**
     * Get 云开发环境ID 
     * @return EnvId 云开发环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 云开发环境ID
     * @param EnvId 云开发环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 数据库连接器实例信息 
     * @return DbInstance 数据库连接器实例信息
     */
    public DbInstance getDbInstance() {
        return this.DbInstance;
    }

    /**
     * Set 数据库连接器实例信息
     * @param DbInstance 数据库连接器实例信息
     */
    public void setDbInstance(DbInstance DbInstance) {
        this.DbInstance = DbInstance;
    }

    /**
     * Get 是否只读；当 `true` 时仅允许以 `SELECT/WITH/SHOW/DESCRIBE/DESC/EXPLAIN` 开头的 SQL 
     * @return ReadOnly 是否只读；当 `true` 时仅允许以 `SELECT/WITH/SHOW/DESCRIBE/DESC/EXPLAIN` 开头的 SQL
     */
    public Boolean getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set 是否只读；当 `true` 时仅允许以 `SELECT/WITH/SHOW/DESCRIBE/DESC/EXPLAIN` 开头的 SQL
     * @param ReadOnly 是否只读；当 `true` 时仅允许以 `SELECT/WITH/SHOW/DESCRIBE/DESC/EXPLAIN` 开头的 SQL
     */
    public void setReadOnly(Boolean ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    public RunSqlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunSqlRequest(RunSqlRequest source) {
        if (source.Sql != null) {
            this.Sql = new String(source.Sql);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.DbInstance != null) {
            this.DbInstance = new DbInstance(source.DbInstance);
        }
        if (source.ReadOnly != null) {
            this.ReadOnly = new Boolean(source.ReadOnly);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sql", this.Sql);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamObj(map, prefix + "DbInstance.", this.DbInstance);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);

    }
}

