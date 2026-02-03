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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrateOpt extends AbstractModel {

    /**
    * 包含数据库表信息
    */
    @SerializedName("DatabaseTables")
    @Expose
    private MigrateObject DatabaseTables;

    /**
     * Get 包含数据库表信息 
     * @return DatabaseTables 包含数据库表信息
     */
    public MigrateObject getDatabaseTables() {
        return this.DatabaseTables;
    }

    /**
     * Set 包含数据库表信息
     * @param DatabaseTables 包含数据库表信息
     */
    public void setDatabaseTables(MigrateObject DatabaseTables) {
        this.DatabaseTables = DatabaseTables;
    }

    public MigrateOpt() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrateOpt(MigrateOpt source) {
        if (source.DatabaseTables != null) {
            this.DatabaseTables = new MigrateObject(source.DatabaseTables);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DatabaseTables.", this.DatabaseTables);

    }
}

