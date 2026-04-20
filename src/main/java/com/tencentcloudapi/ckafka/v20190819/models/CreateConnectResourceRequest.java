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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateConnectResourceRequest extends AbstractModel {

    /**
    * <p>连接源名称</p>
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * <p>连接源类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>连接源描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Dts配置，Type为DTS时必填</p>
    */
    @SerializedName("DtsConnectParam")
    @Expose
    private DtsConnectParam DtsConnectParam;

    /**
    * <p>MongoDB配置，Type为MONGODB时必填</p>
    */
    @SerializedName("MongoDBConnectParam")
    @Expose
    private MongoDBConnectParam MongoDBConnectParam;

    /**
    * <p>Es配置，Type为ES时必填</p>
    */
    @SerializedName("EsConnectParam")
    @Expose
    private EsConnectParam EsConnectParam;

    /**
    * <p>ClickHouse配置，Type为CLICKHOUSE时必填</p>
    */
    @SerializedName("ClickHouseConnectParam")
    @Expose
    private ClickHouseConnectParam ClickHouseConnectParam;

    /**
    * <p>MySQL配置，Type为MYSQL或TDSQL_C_MYSQL时必填</p>
    */
    @SerializedName("MySQLConnectParam")
    @Expose
    private MySQLConnectParam MySQLConnectParam;

    /**
    * <p>PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时必填</p>
    */
    @SerializedName("PostgreSQLConnectParam")
    @Expose
    private PostgreSQLConnectParam PostgreSQLConnectParam;

    /**
    * <p>MariaDB配置，Type为MARIADB时必填</p>
    */
    @SerializedName("MariaDBConnectParam")
    @Expose
    private MariaDBConnectParam MariaDBConnectParam;

    /**
    * <p>SQLServer配置，Type为SQLSERVER时必填</p>
    */
    @SerializedName("SQLServerConnectParam")
    @Expose
    private SQLServerConnectParam SQLServerConnectParam;

    /**
    * <p>Doris 配置，Type为 DORIS 时必填</p>
    */
    @SerializedName("DorisConnectParam")
    @Expose
    private DorisConnectParam DorisConnectParam;

    /**
    * <p>Kafka配置，Type为 KAFKA 时必填</p>
    */
    @SerializedName("KafkaConnectParam")
    @Expose
    private KafkaConnectParam KafkaConnectParam;

    /**
    * <p>MQTT配置，Type为 MQTT 时必填</p>
    */
    @SerializedName("MqttConnectParam")
    @Expose
    private MqttConnectParam MqttConnectParam;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get <p>连接源名称</p> 
     * @return ResourceName <p>连接源名称</p>
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set <p>连接源名称</p>
     * @param ResourceName <p>连接源名称</p>
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get <p>连接源类型</p> 
     * @return Type <p>连接源类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>连接源类型</p>
     * @param Type <p>连接源类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>连接源描述</p> 
     * @return Description <p>连接源描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>连接源描述</p>
     * @param Description <p>连接源描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Dts配置，Type为DTS时必填</p> 
     * @return DtsConnectParam <p>Dts配置，Type为DTS时必填</p>
     */
    public DtsConnectParam getDtsConnectParam() {
        return this.DtsConnectParam;
    }

    /**
     * Set <p>Dts配置，Type为DTS时必填</p>
     * @param DtsConnectParam <p>Dts配置，Type为DTS时必填</p>
     */
    public void setDtsConnectParam(DtsConnectParam DtsConnectParam) {
        this.DtsConnectParam = DtsConnectParam;
    }

    /**
     * Get <p>MongoDB配置，Type为MONGODB时必填</p> 
     * @return MongoDBConnectParam <p>MongoDB配置，Type为MONGODB时必填</p>
     */
    public MongoDBConnectParam getMongoDBConnectParam() {
        return this.MongoDBConnectParam;
    }

    /**
     * Set <p>MongoDB配置，Type为MONGODB时必填</p>
     * @param MongoDBConnectParam <p>MongoDB配置，Type为MONGODB时必填</p>
     */
    public void setMongoDBConnectParam(MongoDBConnectParam MongoDBConnectParam) {
        this.MongoDBConnectParam = MongoDBConnectParam;
    }

    /**
     * Get <p>Es配置，Type为ES时必填</p> 
     * @return EsConnectParam <p>Es配置，Type为ES时必填</p>
     */
    public EsConnectParam getEsConnectParam() {
        return this.EsConnectParam;
    }

    /**
     * Set <p>Es配置，Type为ES时必填</p>
     * @param EsConnectParam <p>Es配置，Type为ES时必填</p>
     */
    public void setEsConnectParam(EsConnectParam EsConnectParam) {
        this.EsConnectParam = EsConnectParam;
    }

    /**
     * Get <p>ClickHouse配置，Type为CLICKHOUSE时必填</p> 
     * @return ClickHouseConnectParam <p>ClickHouse配置，Type为CLICKHOUSE时必填</p>
     */
    public ClickHouseConnectParam getClickHouseConnectParam() {
        return this.ClickHouseConnectParam;
    }

    /**
     * Set <p>ClickHouse配置，Type为CLICKHOUSE时必填</p>
     * @param ClickHouseConnectParam <p>ClickHouse配置，Type为CLICKHOUSE时必填</p>
     */
    public void setClickHouseConnectParam(ClickHouseConnectParam ClickHouseConnectParam) {
        this.ClickHouseConnectParam = ClickHouseConnectParam;
    }

    /**
     * Get <p>MySQL配置，Type为MYSQL或TDSQL_C_MYSQL时必填</p> 
     * @return MySQLConnectParam <p>MySQL配置，Type为MYSQL或TDSQL_C_MYSQL时必填</p>
     */
    public MySQLConnectParam getMySQLConnectParam() {
        return this.MySQLConnectParam;
    }

    /**
     * Set <p>MySQL配置，Type为MYSQL或TDSQL_C_MYSQL时必填</p>
     * @param MySQLConnectParam <p>MySQL配置，Type为MYSQL或TDSQL_C_MYSQL时必填</p>
     */
    public void setMySQLConnectParam(MySQLConnectParam MySQLConnectParam) {
        this.MySQLConnectParam = MySQLConnectParam;
    }

    /**
     * Get <p>PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时必填</p> 
     * @return PostgreSQLConnectParam <p>PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时必填</p>
     */
    public PostgreSQLConnectParam getPostgreSQLConnectParam() {
        return this.PostgreSQLConnectParam;
    }

    /**
     * Set <p>PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时必填</p>
     * @param PostgreSQLConnectParam <p>PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时必填</p>
     */
    public void setPostgreSQLConnectParam(PostgreSQLConnectParam PostgreSQLConnectParam) {
        this.PostgreSQLConnectParam = PostgreSQLConnectParam;
    }

    /**
     * Get <p>MariaDB配置，Type为MARIADB时必填</p> 
     * @return MariaDBConnectParam <p>MariaDB配置，Type为MARIADB时必填</p>
     */
    public MariaDBConnectParam getMariaDBConnectParam() {
        return this.MariaDBConnectParam;
    }

    /**
     * Set <p>MariaDB配置，Type为MARIADB时必填</p>
     * @param MariaDBConnectParam <p>MariaDB配置，Type为MARIADB时必填</p>
     */
    public void setMariaDBConnectParam(MariaDBConnectParam MariaDBConnectParam) {
        this.MariaDBConnectParam = MariaDBConnectParam;
    }

    /**
     * Get <p>SQLServer配置，Type为SQLSERVER时必填</p> 
     * @return SQLServerConnectParam <p>SQLServer配置，Type为SQLSERVER时必填</p>
     */
    public SQLServerConnectParam getSQLServerConnectParam() {
        return this.SQLServerConnectParam;
    }

    /**
     * Set <p>SQLServer配置，Type为SQLSERVER时必填</p>
     * @param SQLServerConnectParam <p>SQLServer配置，Type为SQLSERVER时必填</p>
     */
    public void setSQLServerConnectParam(SQLServerConnectParam SQLServerConnectParam) {
        this.SQLServerConnectParam = SQLServerConnectParam;
    }

    /**
     * Get <p>Doris 配置，Type为 DORIS 时必填</p> 
     * @return DorisConnectParam <p>Doris 配置，Type为 DORIS 时必填</p>
     */
    public DorisConnectParam getDorisConnectParam() {
        return this.DorisConnectParam;
    }

    /**
     * Set <p>Doris 配置，Type为 DORIS 时必填</p>
     * @param DorisConnectParam <p>Doris 配置，Type为 DORIS 时必填</p>
     */
    public void setDorisConnectParam(DorisConnectParam DorisConnectParam) {
        this.DorisConnectParam = DorisConnectParam;
    }

    /**
     * Get <p>Kafka配置，Type为 KAFKA 时必填</p> 
     * @return KafkaConnectParam <p>Kafka配置，Type为 KAFKA 时必填</p>
     */
    public KafkaConnectParam getKafkaConnectParam() {
        return this.KafkaConnectParam;
    }

    /**
     * Set <p>Kafka配置，Type为 KAFKA 时必填</p>
     * @param KafkaConnectParam <p>Kafka配置，Type为 KAFKA 时必填</p>
     */
    public void setKafkaConnectParam(KafkaConnectParam KafkaConnectParam) {
        this.KafkaConnectParam = KafkaConnectParam;
    }

    /**
     * Get <p>MQTT配置，Type为 MQTT 时必填</p> 
     * @return MqttConnectParam <p>MQTT配置，Type为 MQTT 时必填</p>
     */
    public MqttConnectParam getMqttConnectParam() {
        return this.MqttConnectParam;
    }

    /**
     * Set <p>MQTT配置，Type为 MQTT 时必填</p>
     * @param MqttConnectParam <p>MQTT配置，Type为 MQTT 时必填</p>
     */
    public void setMqttConnectParam(MqttConnectParam MqttConnectParam) {
        this.MqttConnectParam = MqttConnectParam;
    }

    /**
     * Get <p>标签列表</p> 
     * @return Tags <p>标签列表</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表</p>
     * @param Tags <p>标签列表</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateConnectResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateConnectResourceRequest(CreateConnectResourceRequest source) {
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DtsConnectParam != null) {
            this.DtsConnectParam = new DtsConnectParam(source.DtsConnectParam);
        }
        if (source.MongoDBConnectParam != null) {
            this.MongoDBConnectParam = new MongoDBConnectParam(source.MongoDBConnectParam);
        }
        if (source.EsConnectParam != null) {
            this.EsConnectParam = new EsConnectParam(source.EsConnectParam);
        }
        if (source.ClickHouseConnectParam != null) {
            this.ClickHouseConnectParam = new ClickHouseConnectParam(source.ClickHouseConnectParam);
        }
        if (source.MySQLConnectParam != null) {
            this.MySQLConnectParam = new MySQLConnectParam(source.MySQLConnectParam);
        }
        if (source.PostgreSQLConnectParam != null) {
            this.PostgreSQLConnectParam = new PostgreSQLConnectParam(source.PostgreSQLConnectParam);
        }
        if (source.MariaDBConnectParam != null) {
            this.MariaDBConnectParam = new MariaDBConnectParam(source.MariaDBConnectParam);
        }
        if (source.SQLServerConnectParam != null) {
            this.SQLServerConnectParam = new SQLServerConnectParam(source.SQLServerConnectParam);
        }
        if (source.DorisConnectParam != null) {
            this.DorisConnectParam = new DorisConnectParam(source.DorisConnectParam);
        }
        if (source.KafkaConnectParam != null) {
            this.KafkaConnectParam = new KafkaConnectParam(source.KafkaConnectParam);
        }
        if (source.MqttConnectParam != null) {
            this.MqttConnectParam = new MqttConnectParam(source.MqttConnectParam);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "DtsConnectParam.", this.DtsConnectParam);
        this.setParamObj(map, prefix + "MongoDBConnectParam.", this.MongoDBConnectParam);
        this.setParamObj(map, prefix + "EsConnectParam.", this.EsConnectParam);
        this.setParamObj(map, prefix + "ClickHouseConnectParam.", this.ClickHouseConnectParam);
        this.setParamObj(map, prefix + "MySQLConnectParam.", this.MySQLConnectParam);
        this.setParamObj(map, prefix + "PostgreSQLConnectParam.", this.PostgreSQLConnectParam);
        this.setParamObj(map, prefix + "MariaDBConnectParam.", this.MariaDBConnectParam);
        this.setParamObj(map, prefix + "SQLServerConnectParam.", this.SQLServerConnectParam);
        this.setParamObj(map, prefix + "DorisConnectParam.", this.DorisConnectParam);
        this.setParamObj(map, prefix + "KafkaConnectParam.", this.KafkaConnectParam);
        this.setParamObj(map, prefix + "MqttConnectParam.", this.MqttConnectParam);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

