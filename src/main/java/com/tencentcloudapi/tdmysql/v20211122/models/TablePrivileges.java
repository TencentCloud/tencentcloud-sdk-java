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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TablePrivileges extends AbstractModel {

    /**
    * DATABASE名
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * 表名
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * 权限列表
    */
    @SerializedName("Privileges")
    @Expose
    private String [] Privileges;

    /**
     * Get DATABASE名 
     * @return Database DATABASE名
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set DATABASE名
     * @param Database DATABASE名
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get 表名 
     * @return Table 表名
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set 表名
     * @param Table 表名
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get 权限列表 
     * @return Privileges 权限列表
     */
    public String [] getPrivileges() {
        return this.Privileges;
    }

    /**
     * Set 权限列表
     * @param Privileges 权限列表
     */
    public void setPrivileges(String [] Privileges) {
        this.Privileges = Privileges;
    }

    public TablePrivileges() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TablePrivileges(TablePrivileges source) {
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.Privileges != null) {
            this.Privileges = new String[source.Privileges.length];
            for (int i = 0; i < source.Privileges.length; i++) {
                this.Privileges[i] = new String(source.Privileges[i]);
            }
        }
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

