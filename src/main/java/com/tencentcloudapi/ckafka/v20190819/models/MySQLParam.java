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

public class MySQLParam extends AbstractModel{

    /**
    * MySQL的数据库名称，"*"为全数据库
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * MySQL的数据表名称，"*"为所监听的所有数据库中的非系统表，可以","间隔，监听多个数据表，但数据表需要以"数据库名.数据表名"的格式进行填写，需要填入正则表达式时，格式为"数据库名\\.数据表名"
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * 该MySQL在连接管理内的Id
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
    * 存放MySQL的Ddl信息的Topic，为空则默认不存放
    */
    @SerializedName("DdlTopic")
    @Expose
    private String DdlTopic;

    /**
    * "TABLE" 表示读取项为 table，"QUERY" 表示读取项为 query
    */
    @SerializedName("DataSourceMonitorMode")
    @Expose
    private String DataSourceMonitorMode;

    /**
    * 当 "DataMonitorMode"="TABLE" 时，传入需要读取的 Table；当 "DataMonitorMode"="QUERY" 时，传入需要读取的查询 sql 语句
    */
    @SerializedName("DataSourceMonitorResource")
    @Expose
    private String DataSourceMonitorResource;

    /**
    * "TIMESTAMP" 表示增量列为时间戳类型，"INCREMENT" 表示增量列为自增 id 类型
    */
    @SerializedName("DataSourceIncrementMode")
    @Expose
    private String DataSourceIncrementMode;

    /**
    * 传入需要监听的列名称
    */
    @SerializedName("DataSourceIncrementColumn")
    @Expose
    private String DataSourceIncrementColumn;

    /**
    * "HEAD" 表示复制存量 + 增量数据，"TAIL" 表示只复制增量数据
    */
    @SerializedName("DataSourceStartFrom")
    @Expose
    private String DataSourceStartFrom;

    /**
    * "INSERT" 表示使用 Insert 模式插入，"UPSERT" 表示使用 Upsert 模式插入
    */
    @SerializedName("DataTargetInsertMode")
    @Expose
    private String DataTargetInsertMode;

    /**
    * 当 "DataInsertMode"="UPSERT" 时，传入当前 upsert 时依赖的主键
    */
    @SerializedName("DataTargetPrimaryKeyField")
    @Expose
    private String DataTargetPrimaryKeyField;

    /**
    * 表与消息间的映射关系
    */
    @SerializedName("DataTargetRecordMapping")
    @Expose
    private RecordMapping [] DataTargetRecordMapping;

    /**
    * 事件路由到特定主题的正则表达式，默认为(.*)
    */
    @SerializedName("TopicRegex")
    @Expose
    private String TopicRegex;

    /**
    * TopicRegex的引用组，指定$1、$2等
    */
    @SerializedName("TopicReplacement")
    @Expose
    private String TopicReplacement;

    /**
    * 格式：库1.表1:字段1,字段2;库2.表2:字段2，表之间;（分号）隔开，字段之间,（逗号）隔开。不指定的表默认取表的主键
    */
    @SerializedName("KeyColumns")
    @Expose
    private String KeyColumns;

    /**
    * Mysql 是否抛弃解析失败的消息，默认为true
    */
    @SerializedName("DropInvalidMessage")
    @Expose
    private Boolean DropInvalidMessage;

    /**
    * 当设置成员参数DropInvalidMessageToCls设置为true时,DropInvalidMessage参数失效
    */
    @SerializedName("DropCls")
    @Expose
    private DropCls DropCls;

    /**
    * 输出格式，DEFAULT、CANAL_1、CANAL_2
    */
    @SerializedName("OutputFormat")
    @Expose
    private String OutputFormat;

    /**
    * 当Table输入的是前缀时，该项值为true，否则为false
    */
    @SerializedName("IsTablePrefix")
    @Expose
    private Boolean IsTablePrefix;

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
    * 存放信令表的数据库名称
    */
    @SerializedName("SignalDatabase")
    @Expose
    private String SignalDatabase;

    /**
    * 输入的table是否为正则表达式，如果该选项以及IsTablePrefix同时为true，该选项的判断优先级高于IsTablePrefix
    */
    @SerializedName("IsTableRegular")
    @Expose
    private Boolean IsTableRegular;

    /**
     * Get MySQL的数据库名称，"*"为全数据库 
     * @return Database MySQL的数据库名称，"*"为全数据库
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set MySQL的数据库名称，"*"为全数据库
     * @param Database MySQL的数据库名称，"*"为全数据库
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get MySQL的数据表名称，"*"为所监听的所有数据库中的非系统表，可以","间隔，监听多个数据表，但数据表需要以"数据库名.数据表名"的格式进行填写，需要填入正则表达式时，格式为"数据库名\\.数据表名" 
     * @return Table MySQL的数据表名称，"*"为所监听的所有数据库中的非系统表，可以","间隔，监听多个数据表，但数据表需要以"数据库名.数据表名"的格式进行填写，需要填入正则表达式时，格式为"数据库名\\.数据表名"
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set MySQL的数据表名称，"*"为所监听的所有数据库中的非系统表，可以","间隔，监听多个数据表，但数据表需要以"数据库名.数据表名"的格式进行填写，需要填入正则表达式时，格式为"数据库名\\.数据表名"
     * @param Table MySQL的数据表名称，"*"为所监听的所有数据库中的非系统表，可以","间隔，监听多个数据表，但数据表需要以"数据库名.数据表名"的格式进行填写，需要填入正则表达式时，格式为"数据库名\\.数据表名"
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get 该MySQL在连接管理内的Id 
     * @return Resource 该MySQL在连接管理内的Id
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set 该MySQL在连接管理内的Id
     * @param Resource 该MySQL在连接管理内的Id
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
     * Get 存放MySQL的Ddl信息的Topic，为空则默认不存放 
     * @return DdlTopic 存放MySQL的Ddl信息的Topic，为空则默认不存放
     */
    public String getDdlTopic() {
        return this.DdlTopic;
    }

    /**
     * Set 存放MySQL的Ddl信息的Topic，为空则默认不存放
     * @param DdlTopic 存放MySQL的Ddl信息的Topic，为空则默认不存放
     */
    public void setDdlTopic(String DdlTopic) {
        this.DdlTopic = DdlTopic;
    }

    /**
     * Get "TABLE" 表示读取项为 table，"QUERY" 表示读取项为 query 
     * @return DataSourceMonitorMode "TABLE" 表示读取项为 table，"QUERY" 表示读取项为 query
     */
    public String getDataSourceMonitorMode() {
        return this.DataSourceMonitorMode;
    }

    /**
     * Set "TABLE" 表示读取项为 table，"QUERY" 表示读取项为 query
     * @param DataSourceMonitorMode "TABLE" 表示读取项为 table，"QUERY" 表示读取项为 query
     */
    public void setDataSourceMonitorMode(String DataSourceMonitorMode) {
        this.DataSourceMonitorMode = DataSourceMonitorMode;
    }

    /**
     * Get 当 "DataMonitorMode"="TABLE" 时，传入需要读取的 Table；当 "DataMonitorMode"="QUERY" 时，传入需要读取的查询 sql 语句 
     * @return DataSourceMonitorResource 当 "DataMonitorMode"="TABLE" 时，传入需要读取的 Table；当 "DataMonitorMode"="QUERY" 时，传入需要读取的查询 sql 语句
     */
    public String getDataSourceMonitorResource() {
        return this.DataSourceMonitorResource;
    }

    /**
     * Set 当 "DataMonitorMode"="TABLE" 时，传入需要读取的 Table；当 "DataMonitorMode"="QUERY" 时，传入需要读取的查询 sql 语句
     * @param DataSourceMonitorResource 当 "DataMonitorMode"="TABLE" 时，传入需要读取的 Table；当 "DataMonitorMode"="QUERY" 时，传入需要读取的查询 sql 语句
     */
    public void setDataSourceMonitorResource(String DataSourceMonitorResource) {
        this.DataSourceMonitorResource = DataSourceMonitorResource;
    }

    /**
     * Get "TIMESTAMP" 表示增量列为时间戳类型，"INCREMENT" 表示增量列为自增 id 类型 
     * @return DataSourceIncrementMode "TIMESTAMP" 表示增量列为时间戳类型，"INCREMENT" 表示增量列为自增 id 类型
     */
    public String getDataSourceIncrementMode() {
        return this.DataSourceIncrementMode;
    }

    /**
     * Set "TIMESTAMP" 表示增量列为时间戳类型，"INCREMENT" 表示增量列为自增 id 类型
     * @param DataSourceIncrementMode "TIMESTAMP" 表示增量列为时间戳类型，"INCREMENT" 表示增量列为自增 id 类型
     */
    public void setDataSourceIncrementMode(String DataSourceIncrementMode) {
        this.DataSourceIncrementMode = DataSourceIncrementMode;
    }

    /**
     * Get 传入需要监听的列名称 
     * @return DataSourceIncrementColumn 传入需要监听的列名称
     */
    public String getDataSourceIncrementColumn() {
        return this.DataSourceIncrementColumn;
    }

    /**
     * Set 传入需要监听的列名称
     * @param DataSourceIncrementColumn 传入需要监听的列名称
     */
    public void setDataSourceIncrementColumn(String DataSourceIncrementColumn) {
        this.DataSourceIncrementColumn = DataSourceIncrementColumn;
    }

    /**
     * Get "HEAD" 表示复制存量 + 增量数据，"TAIL" 表示只复制增量数据 
     * @return DataSourceStartFrom "HEAD" 表示复制存量 + 增量数据，"TAIL" 表示只复制增量数据
     */
    public String getDataSourceStartFrom() {
        return this.DataSourceStartFrom;
    }

    /**
     * Set "HEAD" 表示复制存量 + 增量数据，"TAIL" 表示只复制增量数据
     * @param DataSourceStartFrom "HEAD" 表示复制存量 + 增量数据，"TAIL" 表示只复制增量数据
     */
    public void setDataSourceStartFrom(String DataSourceStartFrom) {
        this.DataSourceStartFrom = DataSourceStartFrom;
    }

    /**
     * Get "INSERT" 表示使用 Insert 模式插入，"UPSERT" 表示使用 Upsert 模式插入 
     * @return DataTargetInsertMode "INSERT" 表示使用 Insert 模式插入，"UPSERT" 表示使用 Upsert 模式插入
     */
    public String getDataTargetInsertMode() {
        return this.DataTargetInsertMode;
    }

    /**
     * Set "INSERT" 表示使用 Insert 模式插入，"UPSERT" 表示使用 Upsert 模式插入
     * @param DataTargetInsertMode "INSERT" 表示使用 Insert 模式插入，"UPSERT" 表示使用 Upsert 模式插入
     */
    public void setDataTargetInsertMode(String DataTargetInsertMode) {
        this.DataTargetInsertMode = DataTargetInsertMode;
    }

    /**
     * Get 当 "DataInsertMode"="UPSERT" 时，传入当前 upsert 时依赖的主键 
     * @return DataTargetPrimaryKeyField 当 "DataInsertMode"="UPSERT" 时，传入当前 upsert 时依赖的主键
     */
    public String getDataTargetPrimaryKeyField() {
        return this.DataTargetPrimaryKeyField;
    }

    /**
     * Set 当 "DataInsertMode"="UPSERT" 时，传入当前 upsert 时依赖的主键
     * @param DataTargetPrimaryKeyField 当 "DataInsertMode"="UPSERT" 时，传入当前 upsert 时依赖的主键
     */
    public void setDataTargetPrimaryKeyField(String DataTargetPrimaryKeyField) {
        this.DataTargetPrimaryKeyField = DataTargetPrimaryKeyField;
    }

    /**
     * Get 表与消息间的映射关系 
     * @return DataTargetRecordMapping 表与消息间的映射关系
     */
    public RecordMapping [] getDataTargetRecordMapping() {
        return this.DataTargetRecordMapping;
    }

    /**
     * Set 表与消息间的映射关系
     * @param DataTargetRecordMapping 表与消息间的映射关系
     */
    public void setDataTargetRecordMapping(RecordMapping [] DataTargetRecordMapping) {
        this.DataTargetRecordMapping = DataTargetRecordMapping;
    }

    /**
     * Get 事件路由到特定主题的正则表达式，默认为(.*) 
     * @return TopicRegex 事件路由到特定主题的正则表达式，默认为(.*)
     */
    public String getTopicRegex() {
        return this.TopicRegex;
    }

    /**
     * Set 事件路由到特定主题的正则表达式，默认为(.*)
     * @param TopicRegex 事件路由到特定主题的正则表达式，默认为(.*)
     */
    public void setTopicRegex(String TopicRegex) {
        this.TopicRegex = TopicRegex;
    }

    /**
     * Get TopicRegex的引用组，指定$1、$2等 
     * @return TopicReplacement TopicRegex的引用组，指定$1、$2等
     */
    public String getTopicReplacement() {
        return this.TopicReplacement;
    }

    /**
     * Set TopicRegex的引用组，指定$1、$2等
     * @param TopicReplacement TopicRegex的引用组，指定$1、$2等
     */
    public void setTopicReplacement(String TopicReplacement) {
        this.TopicReplacement = TopicReplacement;
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
     * Get Mysql 是否抛弃解析失败的消息，默认为true 
     * @return DropInvalidMessage Mysql 是否抛弃解析失败的消息，默认为true
     */
    public Boolean getDropInvalidMessage() {
        return this.DropInvalidMessage;
    }

    /**
     * Set Mysql 是否抛弃解析失败的消息，默认为true
     * @param DropInvalidMessage Mysql 是否抛弃解析失败的消息，默认为true
     */
    public void setDropInvalidMessage(Boolean DropInvalidMessage) {
        this.DropInvalidMessage = DropInvalidMessage;
    }

    /**
     * Get 当设置成员参数DropInvalidMessageToCls设置为true时,DropInvalidMessage参数失效 
     * @return DropCls 当设置成员参数DropInvalidMessageToCls设置为true时,DropInvalidMessage参数失效
     */
    public DropCls getDropCls() {
        return this.DropCls;
    }

    /**
     * Set 当设置成员参数DropInvalidMessageToCls设置为true时,DropInvalidMessage参数失效
     * @param DropCls 当设置成员参数DropInvalidMessageToCls设置为true时,DropInvalidMessage参数失效
     */
    public void setDropCls(DropCls DropCls) {
        this.DropCls = DropCls;
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

    /**
     * Get 存放信令表的数据库名称 
     * @return SignalDatabase 存放信令表的数据库名称
     */
    public String getSignalDatabase() {
        return this.SignalDatabase;
    }

    /**
     * Set 存放信令表的数据库名称
     * @param SignalDatabase 存放信令表的数据库名称
     */
    public void setSignalDatabase(String SignalDatabase) {
        this.SignalDatabase = SignalDatabase;
    }

    /**
     * Get 输入的table是否为正则表达式，如果该选项以及IsTablePrefix同时为true，该选项的判断优先级高于IsTablePrefix 
     * @return IsTableRegular 输入的table是否为正则表达式，如果该选项以及IsTablePrefix同时为true，该选项的判断优先级高于IsTablePrefix
     */
    public Boolean getIsTableRegular() {
        return this.IsTableRegular;
    }

    /**
     * Set 输入的table是否为正则表达式，如果该选项以及IsTablePrefix同时为true，该选项的判断优先级高于IsTablePrefix
     * @param IsTableRegular 输入的table是否为正则表达式，如果该选项以及IsTablePrefix同时为true，该选项的判断优先级高于IsTablePrefix
     */
    public void setIsTableRegular(Boolean IsTableRegular) {
        this.IsTableRegular = IsTableRegular;
    }

    public MySQLParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MySQLParam(MySQLParam source) {
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
        if (source.DdlTopic != null) {
            this.DdlTopic = new String(source.DdlTopic);
        }
        if (source.DataSourceMonitorMode != null) {
            this.DataSourceMonitorMode = new String(source.DataSourceMonitorMode);
        }
        if (source.DataSourceMonitorResource != null) {
            this.DataSourceMonitorResource = new String(source.DataSourceMonitorResource);
        }
        if (source.DataSourceIncrementMode != null) {
            this.DataSourceIncrementMode = new String(source.DataSourceIncrementMode);
        }
        if (source.DataSourceIncrementColumn != null) {
            this.DataSourceIncrementColumn = new String(source.DataSourceIncrementColumn);
        }
        if (source.DataSourceStartFrom != null) {
            this.DataSourceStartFrom = new String(source.DataSourceStartFrom);
        }
        if (source.DataTargetInsertMode != null) {
            this.DataTargetInsertMode = new String(source.DataTargetInsertMode);
        }
        if (source.DataTargetPrimaryKeyField != null) {
            this.DataTargetPrimaryKeyField = new String(source.DataTargetPrimaryKeyField);
        }
        if (source.DataTargetRecordMapping != null) {
            this.DataTargetRecordMapping = new RecordMapping[source.DataTargetRecordMapping.length];
            for (int i = 0; i < source.DataTargetRecordMapping.length; i++) {
                this.DataTargetRecordMapping[i] = new RecordMapping(source.DataTargetRecordMapping[i]);
            }
        }
        if (source.TopicRegex != null) {
            this.TopicRegex = new String(source.TopicRegex);
        }
        if (source.TopicReplacement != null) {
            this.TopicReplacement = new String(source.TopicReplacement);
        }
        if (source.KeyColumns != null) {
            this.KeyColumns = new String(source.KeyColumns);
        }
        if (source.DropInvalidMessage != null) {
            this.DropInvalidMessage = new Boolean(source.DropInvalidMessage);
        }
        if (source.DropCls != null) {
            this.DropCls = new DropCls(source.DropCls);
        }
        if (source.OutputFormat != null) {
            this.OutputFormat = new String(source.OutputFormat);
        }
        if (source.IsTablePrefix != null) {
            this.IsTablePrefix = new Boolean(source.IsTablePrefix);
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
        if (source.SignalDatabase != null) {
            this.SignalDatabase = new String(source.SignalDatabase);
        }
        if (source.IsTableRegular != null) {
            this.IsTableRegular = new Boolean(source.IsTableRegular);
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
        this.setParamSimple(map, prefix + "DdlTopic", this.DdlTopic);
        this.setParamSimple(map, prefix + "DataSourceMonitorMode", this.DataSourceMonitorMode);
        this.setParamSimple(map, prefix + "DataSourceMonitorResource", this.DataSourceMonitorResource);
        this.setParamSimple(map, prefix + "DataSourceIncrementMode", this.DataSourceIncrementMode);
        this.setParamSimple(map, prefix + "DataSourceIncrementColumn", this.DataSourceIncrementColumn);
        this.setParamSimple(map, prefix + "DataSourceStartFrom", this.DataSourceStartFrom);
        this.setParamSimple(map, prefix + "DataTargetInsertMode", this.DataTargetInsertMode);
        this.setParamSimple(map, prefix + "DataTargetPrimaryKeyField", this.DataTargetPrimaryKeyField);
        this.setParamArrayObj(map, prefix + "DataTargetRecordMapping.", this.DataTargetRecordMapping);
        this.setParamSimple(map, prefix + "TopicRegex", this.TopicRegex);
        this.setParamSimple(map, prefix + "TopicReplacement", this.TopicReplacement);
        this.setParamSimple(map, prefix + "KeyColumns", this.KeyColumns);
        this.setParamSimple(map, prefix + "DropInvalidMessage", this.DropInvalidMessage);
        this.setParamObj(map, prefix + "DropCls.", this.DropCls);
        this.setParamSimple(map, prefix + "OutputFormat", this.OutputFormat);
        this.setParamSimple(map, prefix + "IsTablePrefix", this.IsTablePrefix);
        this.setParamSimple(map, prefix + "IncludeContentChanges", this.IncludeContentChanges);
        this.setParamSimple(map, prefix + "IncludeQuery", this.IncludeQuery);
        this.setParamSimple(map, prefix + "RecordWithSchema", this.RecordWithSchema);
        this.setParamSimple(map, prefix + "SignalDatabase", this.SignalDatabase);
        this.setParamSimple(map, prefix + "IsTableRegular", this.IsTableRegular);

    }
}

