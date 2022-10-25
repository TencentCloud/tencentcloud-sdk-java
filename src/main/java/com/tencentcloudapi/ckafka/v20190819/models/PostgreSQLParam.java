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

public class PostgreSQLParam extends AbstractModel{

    /**
    * PostgreSQL的数据库名称
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * PostgreSQL的数据表名称，"*"为所监听的所有数据库中的非系统表，可以","间隔，监听多个数据表，但数据表需要以"Schema名.数据表名"的格式进行填写，需要填入正则表达式时，格式为"Schema名\\.数据表名"
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * 该PostgreSQL在连接管理内的Id
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * 插件名(decoderbufs/pgoutput)，默认为decoderbufs
    */
    @SerializedName("PluginName")
    @Expose
    private String PluginName;

    /**
    * 复制存量信息(never增量, initial全量)，默认为initial
    */
    @SerializedName("SnapshotMode")
    @Expose
    private String SnapshotMode;

    /**
    * 上游数据格式(JSON/Debezium), 当数据库同步模式为默认字段匹配时,必填
    */
    @SerializedName("DataFormat")
    @Expose
    private String DataFormat;

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
    * 是否抛弃解析失败的消息，默认为true
    */
    @SerializedName("DropInvalidMessage")
    @Expose
    private Boolean DropInvalidMessage;

    /**
    * 输入的table是否为正则表达式
    */
    @SerializedName("IsTableRegular")
    @Expose
    private Boolean IsTableRegular;

    /**
    * 格式：库1.表1:字段1,字段2;库2.表2:字段2，表之间;（分号）隔开，字段之间,（逗号）隔开。不指定的表默认取表的主键
    */
    @SerializedName("KeyColumns")
    @Expose
    private String KeyColumns;

    /**
    * 如果该值为 true，则消息中会携带消息结构体对应的schema，如果该值为false则不会携带
    */
    @SerializedName("RecordWithSchema")
    @Expose
    private Boolean RecordWithSchema;

    /**
     * Get PostgreSQL的数据库名称 
     * @return Database PostgreSQL的数据库名称
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set PostgreSQL的数据库名称
     * @param Database PostgreSQL的数据库名称
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get PostgreSQL的数据表名称，"*"为所监听的所有数据库中的非系统表，可以","间隔，监听多个数据表，但数据表需要以"Schema名.数据表名"的格式进行填写，需要填入正则表达式时，格式为"Schema名\\.数据表名" 
     * @return Table PostgreSQL的数据表名称，"*"为所监听的所有数据库中的非系统表，可以","间隔，监听多个数据表，但数据表需要以"Schema名.数据表名"的格式进行填写，需要填入正则表达式时，格式为"Schema名\\.数据表名"
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set PostgreSQL的数据表名称，"*"为所监听的所有数据库中的非系统表，可以","间隔，监听多个数据表，但数据表需要以"Schema名.数据表名"的格式进行填写，需要填入正则表达式时，格式为"Schema名\\.数据表名"
     * @param Table PostgreSQL的数据表名称，"*"为所监听的所有数据库中的非系统表，可以","间隔，监听多个数据表，但数据表需要以"Schema名.数据表名"的格式进行填写，需要填入正则表达式时，格式为"Schema名\\.数据表名"
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get 该PostgreSQL在连接管理内的Id 
     * @return Resource 该PostgreSQL在连接管理内的Id
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set 该PostgreSQL在连接管理内的Id
     * @param Resource 该PostgreSQL在连接管理内的Id
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 插件名(decoderbufs/pgoutput)，默认为decoderbufs 
     * @return PluginName 插件名(decoderbufs/pgoutput)，默认为decoderbufs
     */
    public String getPluginName() {
        return this.PluginName;
    }

    /**
     * Set 插件名(decoderbufs/pgoutput)，默认为decoderbufs
     * @param PluginName 插件名(decoderbufs/pgoutput)，默认为decoderbufs
     */
    public void setPluginName(String PluginName) {
        this.PluginName = PluginName;
    }

    /**
     * Get 复制存量信息(never增量, initial全量)，默认为initial 
     * @return SnapshotMode 复制存量信息(never增量, initial全量)，默认为initial
     */
    public String getSnapshotMode() {
        return this.SnapshotMode;
    }

    /**
     * Set 复制存量信息(never增量, initial全量)，默认为initial
     * @param SnapshotMode 复制存量信息(never增量, initial全量)，默认为initial
     */
    public void setSnapshotMode(String SnapshotMode) {
        this.SnapshotMode = SnapshotMode;
    }

    /**
     * Get 上游数据格式(JSON/Debezium), 当数据库同步模式为默认字段匹配时,必填 
     * @return DataFormat 上游数据格式(JSON/Debezium), 当数据库同步模式为默认字段匹配时,必填
     */
    public String getDataFormat() {
        return this.DataFormat;
    }

    /**
     * Set 上游数据格式(JSON/Debezium), 当数据库同步模式为默认字段匹配时,必填
     * @param DataFormat 上游数据格式(JSON/Debezium), 当数据库同步模式为默认字段匹配时,必填
     */
    public void setDataFormat(String DataFormat) {
        this.DataFormat = DataFormat;
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
     * Get 是否抛弃解析失败的消息，默认为true 
     * @return DropInvalidMessage 是否抛弃解析失败的消息，默认为true
     */
    public Boolean getDropInvalidMessage() {
        return this.DropInvalidMessage;
    }

    /**
     * Set 是否抛弃解析失败的消息，默认为true
     * @param DropInvalidMessage 是否抛弃解析失败的消息，默认为true
     */
    public void setDropInvalidMessage(Boolean DropInvalidMessage) {
        this.DropInvalidMessage = DropInvalidMessage;
    }

    /**
     * Get 输入的table是否为正则表达式 
     * @return IsTableRegular 输入的table是否为正则表达式
     */
    public Boolean getIsTableRegular() {
        return this.IsTableRegular;
    }

    /**
     * Set 输入的table是否为正则表达式
     * @param IsTableRegular 输入的table是否为正则表达式
     */
    public void setIsTableRegular(Boolean IsTableRegular) {
        this.IsTableRegular = IsTableRegular;
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

    public PostgreSQLParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PostgreSQLParam(PostgreSQLParam source) {
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.PluginName != null) {
            this.PluginName = new String(source.PluginName);
        }
        if (source.SnapshotMode != null) {
            this.SnapshotMode = new String(source.SnapshotMode);
        }
        if (source.DataFormat != null) {
            this.DataFormat = new String(source.DataFormat);
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
        if (source.DropInvalidMessage != null) {
            this.DropInvalidMessage = new Boolean(source.DropInvalidMessage);
        }
        if (source.IsTableRegular != null) {
            this.IsTableRegular = new Boolean(source.IsTableRegular);
        }
        if (source.KeyColumns != null) {
            this.KeyColumns = new String(source.KeyColumns);
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
        this.setParamSimple(map, prefix + "PluginName", this.PluginName);
        this.setParamSimple(map, prefix + "SnapshotMode", this.SnapshotMode);
        this.setParamSimple(map, prefix + "DataFormat", this.DataFormat);
        this.setParamSimple(map, prefix + "DataTargetInsertMode", this.DataTargetInsertMode);
        this.setParamSimple(map, prefix + "DataTargetPrimaryKeyField", this.DataTargetPrimaryKeyField);
        this.setParamArrayObj(map, prefix + "DataTargetRecordMapping.", this.DataTargetRecordMapping);
        this.setParamSimple(map, prefix + "DropInvalidMessage", this.DropInvalidMessage);
        this.setParamSimple(map, prefix + "IsTableRegular", this.IsTableRegular);
        this.setParamSimple(map, prefix + "KeyColumns", this.KeyColumns);
        this.setParamSimple(map, prefix + "RecordWithSchema", this.RecordWithSchema);

    }
}

