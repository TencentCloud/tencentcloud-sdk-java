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

public class MariaDBParam extends AbstractModel{

    /**
    * MariaDB的数据库名称，"*"为全数据库
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * MariaDB的数据表名称，"*"为所监听的所有数据库中的非系统表，可以","间隔，监听多个数据表，但数据表需要以"数据库名.数据表名"的格式进行填写
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * 该MariaDB在连接管理内的Id
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * 复制存量信息(schema_only不复制, initial全量)，默认位initial
    */
    @SerializedName("SnapshotMode")
    @Expose
    private String SnapshotMode;

    /**
    * 格式：库1.表1:字段1,字段2;库2.表2:字段2，表之间;（分号）隔开，字段之间,（逗号）隔开。不指定的表默认取表的主键
    */
    @SerializedName("KeyColumns")
    @Expose
    private String KeyColumns;

    /**
    * 当Table输入的是前缀时，该项值为true，否则为false
    */
    @SerializedName("IsTablePrefix")
    @Expose
    private Boolean IsTablePrefix;

    /**
    * 输出格式，DEFAULT、CANAL_1、CANAL_2
    */
    @SerializedName("OutputFormat")
    @Expose
    private String OutputFormat;

    /**
    * 如果该值为all，则DDL数据以及DML数据也会写入到选中的topic；若该值为dml，则只有DML数据写入到选中的topic
    */
    @SerializedName("IncludeContentChanges")
    @Expose
    private String IncludeContentChanges;

    /**
    * 如果该值为true，且MySQL中"binlog_rows_query_log_events"配置项的值为"ON"，则流入到topic的数据包含原SQL语句；若该值为false，流入到topic的数据不包含原SQL语句
    */
    @SerializedName("IncludeQuery")
    @Expose
    private Boolean IncludeQuery;

    /**
    * 如果该值为 true，则消息中会携带消息结构体对应的schema，如果该值为false则不会携带
    */
    @SerializedName("RecordWithSchema")
    @Expose
    private Boolean RecordWithSchema;

    /**
     * Get MariaDB的数据库名称，"*"为全数据库 
     * @return Database MariaDB的数据库名称，"*"为全数据库
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set MariaDB的数据库名称，"*"为全数据库
     * @param Database MariaDB的数据库名称，"*"为全数据库
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get MariaDB的数据表名称，"*"为所监听的所有数据库中的非系统表，可以","间隔，监听多个数据表，但数据表需要以"数据库名.数据表名"的格式进行填写 
     * @return Table MariaDB的数据表名称，"*"为所监听的所有数据库中的非系统表，可以","间隔，监听多个数据表，但数据表需要以"数据库名.数据表名"的格式进行填写
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set MariaDB的数据表名称，"*"为所监听的所有数据库中的非系统表，可以","间隔，监听多个数据表，但数据表需要以"数据库名.数据表名"的格式进行填写
     * @param Table MariaDB的数据表名称，"*"为所监听的所有数据库中的非系统表，可以","间隔，监听多个数据表，但数据表需要以"数据库名.数据表名"的格式进行填写
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get 该MariaDB在连接管理内的Id 
     * @return Resource 该MariaDB在连接管理内的Id
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set 该MariaDB在连接管理内的Id
     * @param Resource 该MariaDB在连接管理内的Id
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 复制存量信息(schema_only不复制, initial全量)，默认位initial 
     * @return SnapshotMode 复制存量信息(schema_only不复制, initial全量)，默认位initial
     */
    public String getSnapshotMode() {
        return this.SnapshotMode;
    }

    /**
     * Set 复制存量信息(schema_only不复制, initial全量)，默认位initial
     * @param SnapshotMode 复制存量信息(schema_only不复制, initial全量)，默认位initial
     */
    public void setSnapshotMode(String SnapshotMode) {
        this.SnapshotMode = SnapshotMode;
    }

    /**
     * Get 格式：库1.表1:字段1,字段2;库2.表2:字段2，表之间;（分号）隔开，字段之间,（逗号）隔开。不指定的表默认取表的主键 
     * @return KeyColumns 格式：库1.表1:字段1,字段2;库2.表2:字段2，表之间;（分号）隔开，字段之间,（逗号）隔开。不指定的表默认取表的主键
     */
    public String getKeyColumns() {
        return this.KeyColumns;
    }

    /**
     * Set 格式：库1.表1:字段1,字段2;库2.表2:字段2，表之间;（分号）隔开，字段之间,（逗号）隔开。不指定的表默认取表的主键
     * @param KeyColumns 格式：库1.表1:字段1,字段2;库2.表2:字段2，表之间;（分号）隔开，字段之间,（逗号）隔开。不指定的表默认取表的主键
     */
    public void setKeyColumns(String KeyColumns) {
        this.KeyColumns = KeyColumns;
    }

    /**
     * Get 当Table输入的是前缀时，该项值为true，否则为false 
     * @return IsTablePrefix 当Table输入的是前缀时，该项值为true，否则为false
     */
    public Boolean getIsTablePrefix() {
        return this.IsTablePrefix;
    }

    /**
     * Set 当Table输入的是前缀时，该项值为true，否则为false
     * @param IsTablePrefix 当Table输入的是前缀时，该项值为true，否则为false
     */
    public void setIsTablePrefix(Boolean IsTablePrefix) {
        this.IsTablePrefix = IsTablePrefix;
    }

    /**
     * Get 输出格式，DEFAULT、CANAL_1、CANAL_2 
     * @return OutputFormat 输出格式，DEFAULT、CANAL_1、CANAL_2
     */
    public String getOutputFormat() {
        return this.OutputFormat;
    }

    /**
     * Set 输出格式，DEFAULT、CANAL_1、CANAL_2
     * @param OutputFormat 输出格式，DEFAULT、CANAL_1、CANAL_2
     */
    public void setOutputFormat(String OutputFormat) {
        this.OutputFormat = OutputFormat;
    }

    /**
     * Get 如果该值为all，则DDL数据以及DML数据也会写入到选中的topic；若该值为dml，则只有DML数据写入到选中的topic 
     * @return IncludeContentChanges 如果该值为all，则DDL数据以及DML数据也会写入到选中的topic；若该值为dml，则只有DML数据写入到选中的topic
     */
    public String getIncludeContentChanges() {
        return this.IncludeContentChanges;
    }

    /**
     * Set 如果该值为all，则DDL数据以及DML数据也会写入到选中的topic；若该值为dml，则只有DML数据写入到选中的topic
     * @param IncludeContentChanges 如果该值为all，则DDL数据以及DML数据也会写入到选中的topic；若该值为dml，则只有DML数据写入到选中的topic
     */
    public void setIncludeContentChanges(String IncludeContentChanges) {
        this.IncludeContentChanges = IncludeContentChanges;
    }

    /**
     * Get 如果该值为true，且MySQL中"binlog_rows_query_log_events"配置项的值为"ON"，则流入到topic的数据包含原SQL语句；若该值为false，流入到topic的数据不包含原SQL语句 
     * @return IncludeQuery 如果该值为true，且MySQL中"binlog_rows_query_log_events"配置项的值为"ON"，则流入到topic的数据包含原SQL语句；若该值为false，流入到topic的数据不包含原SQL语句
     */
    public Boolean getIncludeQuery() {
        return this.IncludeQuery;
    }

    /**
     * Set 如果该值为true，且MySQL中"binlog_rows_query_log_events"配置项的值为"ON"，则流入到topic的数据包含原SQL语句；若该值为false，流入到topic的数据不包含原SQL语句
     * @param IncludeQuery 如果该值为true，且MySQL中"binlog_rows_query_log_events"配置项的值为"ON"，则流入到topic的数据包含原SQL语句；若该值为false，流入到topic的数据不包含原SQL语句
     */
    public void setIncludeQuery(Boolean IncludeQuery) {
        this.IncludeQuery = IncludeQuery;
    }

    /**
     * Get 如果该值为 true，则消息中会携带消息结构体对应的schema，如果该值为false则不会携带 
     * @return RecordWithSchema 如果该值为 true，则消息中会携带消息结构体对应的schema，如果该值为false则不会携带
     */
    public Boolean getRecordWithSchema() {
        return this.RecordWithSchema;
    }

    /**
     * Set 如果该值为 true，则消息中会携带消息结构体对应的schema，如果该值为false则不会携带
     * @param RecordWithSchema 如果该值为 true，则消息中会携带消息结构体对应的schema，如果该值为false则不会携带
     */
    public void setRecordWithSchema(Boolean RecordWithSchema) {
        this.RecordWithSchema = RecordWithSchema;
    }

    public MariaDBParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MariaDBParam(MariaDBParam source) {
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
        if (source.KeyColumns != null) {
            this.KeyColumns = new String(source.KeyColumns);
        }
        if (source.IsTablePrefix != null) {
            this.IsTablePrefix = new Boolean(source.IsTablePrefix);
        }
        if (source.OutputFormat != null) {
            this.OutputFormat = new String(source.OutputFormat);
        }
        if (source.IncludeContentChanges != null) {
            this.IncludeContentChanges = new String(source.IncludeContentChanges);
        }
        if (source.IncludeQuery != null) {
            this.IncludeQuery = new Boolean(source.IncludeQuery);
        }
        if (source.RecordWithSchema != null) {
            this.RecordWithSchema = new Boolean(source.RecordWithSchema);
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
        this.setParamSimple(map, prefix + "KeyColumns", this.KeyColumns);
        this.setParamSimple(map, prefix + "IsTablePrefix", this.IsTablePrefix);
        this.setParamSimple(map, prefix + "OutputFormat", this.OutputFormat);
        this.setParamSimple(map, prefix + "IncludeContentChanges", this.IncludeContentChanges);
        this.setParamSimple(map, prefix + "IncludeQuery", this.IncludeQuery);
        this.setParamSimple(map, prefix + "RecordWithSchema", this.RecordWithSchema);

    }
}

