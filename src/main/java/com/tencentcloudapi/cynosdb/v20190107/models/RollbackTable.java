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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RollbackTable extends AbstractModel{

    /**
    * 数据库名称
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * 数据库表
    */
    @SerializedName("Tables")
    @Expose
    private RollbackTableInfo [] Tables;

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
     * Get 数据库表 
     * @return Tables 数据库表
     */
    public RollbackTableInfo [] getTables() {
        return this.Tables;
    }

    /**
     * Set 数据库表
     * @param Tables 数据库表
     */
    public void setTables(RollbackTableInfo [] Tables) {
        this.Tables = Tables;
    }

    public RollbackTable() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollbackTable(RollbackTable source) {
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Tables != null) {
            this.Tables = new RollbackTableInfo[source.Tables.length];
            for (int i = 0; i < source.Tables.length; i++) {
                this.Tables[i] = new RollbackTableInfo(source.Tables[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamArrayObj(map, prefix + "Tables.", this.Tables);

    }
}

