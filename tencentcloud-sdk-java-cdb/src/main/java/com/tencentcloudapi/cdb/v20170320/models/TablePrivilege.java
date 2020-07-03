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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TablePrivilege extends AbstractModel{

    /**
    * 数据库名
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * 数据库表名
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * 权限信息
    */
    @SerializedName("Privileges")
    @Expose
    private String [] Privileges;

    /**
     * Get 数据库名 
     * @return Database 数据库名
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set 数据库名
     * @param Database 数据库名
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get 数据库表名 
     * @return Table 数据库表名
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set 数据库表名
     * @param Table 数据库表名
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get 权限信息 
     * @return Privileges 权限信息
     */
    public String [] getPrivileges() {
        return this.Privileges;
    }

    /**
     * Set 权限信息
     * @param Privileges 权限信息
     */
    public void setPrivileges(String [] Privileges) {
        this.Privileges = Privileges;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamArraySimple(map, prefix + "Privileges.", this.Privileges);

    }
}

