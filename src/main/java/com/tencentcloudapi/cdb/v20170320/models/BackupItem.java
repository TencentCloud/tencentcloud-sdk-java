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

public class BackupItem extends AbstractModel {

    /**
    * 需要备份的库名
    */
    @SerializedName("Db")
    @Expose
    private String Db;

    /**
    * 需要备份的表名。 如果传该参数，表示备份该库中的指定表。如果不传该参数则备份该db库
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
     * Get 需要备份的库名 
     * @return Db 需要备份的库名
     */
    public String getDb() {
        return this.Db;
    }

    /**
     * Set 需要备份的库名
     * @param Db 需要备份的库名
     */
    public void setDb(String Db) {
        this.Db = Db;
    }

    /**
     * Get 需要备份的表名。 如果传该参数，表示备份该库中的指定表。如果不传该参数则备份该db库 
     * @return Table 需要备份的表名。 如果传该参数，表示备份该库中的指定表。如果不传该参数则备份该db库
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set 需要备份的表名。 如果传该参数，表示备份该库中的指定表。如果不传该参数则备份该db库
     * @param Table 需要备份的表名。 如果传该参数，表示备份该库中的指定表。如果不传该参数则备份该db库
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    public BackupItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupItem(BackupItem source) {
        if (source.Db != null) {
            this.Db = new String(source.Db);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Db", this.Db);
        this.setParamSimple(map, prefix + "Table", this.Table);

    }
}

