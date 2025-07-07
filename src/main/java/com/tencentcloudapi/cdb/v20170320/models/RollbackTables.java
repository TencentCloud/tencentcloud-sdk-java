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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RollbackTables extends AbstractModel {

    /**
    * 数据库名
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * 数据库表详情
    */
    @SerializedName("Table")
    @Expose
    private RollbackTableName [] Table;

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
     * Get 数据库表详情 
     * @return Table 数据库表详情
     */
    public RollbackTableName [] getTable() {
        return this.Table;
    }

    /**
     * Set 数据库表详情
     * @param Table 数据库表详情
     */
    public void setTable(RollbackTableName [] Table) {
        this.Table = Table;
    }

    public RollbackTables() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollbackTables(RollbackTables source) {
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Table != null) {
            this.Table = new RollbackTableName[source.Table.length];
            for (int i = 0; i < source.Table.length; i++) {
                this.Table[i] = new RollbackTableName(source.Table[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamArrayObj(map, prefix + "Table.", this.Table);

    }
}

