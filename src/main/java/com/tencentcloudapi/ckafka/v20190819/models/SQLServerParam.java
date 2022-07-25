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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SQLServerParam extends AbstractModel{

    /**
    * SQLServer的数据库名称
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * SQLServer的数据表名称，"*"为所监听的所有数据库中的非系统表，可以","间隔，监听多个数据表，但数据表需要以"数据库名.数据表名"的格式进行填写
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * 该SQLServer在连接管理内的Id
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * 复制存量信息(schema_only增量, initial全量)，默认为initial
    */
    @SerializedName("SnapshotMode")
    @Expose
    private String SnapshotMode;

    /**
     * Get SQLServer的数据库名称 
     * @return Database SQLServer的数据库名称
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set SQLServer的数据库名称
     * @param Database SQLServer的数据库名称
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get SQLServer的数据表名称，"*"为所监听的所有数据库中的非系统表，可以","间隔，监听多个数据表，但数据表需要以"数据库名.数据表名"的格式进行填写 
     * @return Table SQLServer的数据表名称，"*"为所监听的所有数据库中的非系统表，可以","间隔，监听多个数据表，但数据表需要以"数据库名.数据表名"的格式进行填写
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set SQLServer的数据表名称，"*"为所监听的所有数据库中的非系统表，可以","间隔，监听多个数据表，但数据表需要以"数据库名.数据表名"的格式进行填写
     * @param Table SQLServer的数据表名称，"*"为所监听的所有数据库中的非系统表，可以","间隔，监听多个数据表，但数据表需要以"数据库名.数据表名"的格式进行填写
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get 该SQLServer在连接管理内的Id 
     * @return Resource 该SQLServer在连接管理内的Id
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set 该SQLServer在连接管理内的Id
     * @param Resource 该SQLServer在连接管理内的Id
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 复制存量信息(schema_only增量, initial全量)，默认为initial 
     * @return SnapshotMode 复制存量信息(schema_only增量, initial全量)，默认为initial
     */
    public String getSnapshotMode() {
        return this.SnapshotMode;
    }

    /**
     * Set 复制存量信息(schema_only增量, initial全量)，默认为initial
     * @param SnapshotMode 复制存量信息(schema_only增量, initial全量)，默认为initial
     */
    public void setSnapshotMode(String SnapshotMode) {
        this.SnapshotMode = SnapshotMode;
    }

    public SQLServerParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SQLServerParam(SQLServerParam source) {
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.SnapshotMode != null) {
            this.SnapshotMode = new String(source.SnapshotMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "SnapshotMode", this.SnapshotMode);

    }
}

