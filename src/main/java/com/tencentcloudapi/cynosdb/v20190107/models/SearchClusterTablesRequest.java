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

public class SearchClusterTablesRequest extends AbstractModel{

    /**
    * 集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 数据库名
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * 数据表名
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * 数据表类型：
view：只返回 view，
base_table： 只返回基本表，
all：返回 view 和表
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
     * Get 集群id 
     * @return ClusterId 集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
     * @param ClusterId 集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

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
     * Get 数据表名 
     * @return Table 数据表名
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set 数据表名
     * @param Table 数据表名
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get 数据表类型：
view：只返回 view，
base_table： 只返回基本表，
all：返回 view 和表 
     * @return TableType 数据表类型：
view：只返回 view，
base_table： 只返回基本表，
all：返回 view 和表
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set 数据表类型：
view：只返回 view，
base_table： 只返回基本表，
all：返回 view 和表
     * @param TableType 数据表类型：
view：只返回 view，
base_table： 只返回基本表，
all：返回 view 和表
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    public SearchClusterTablesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchClusterTablesRequest(SearchClusterTablesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.TableType != null) {
            this.TableType = new String(source.TableType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "TableType", this.TableType);

    }
}

