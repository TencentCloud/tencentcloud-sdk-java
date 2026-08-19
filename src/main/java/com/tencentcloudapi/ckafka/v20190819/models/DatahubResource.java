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

public class DatahubResource extends AbstractModel {

    /**
    * <p>资源类型  type类型如下:<br>KAFKA,<br>EB_ES,<br>EB_COS,<br>EB_CLS,<br>EB_,<br>MONGODB,<br>HTTP,<br>TDW,<br>ES,<br>CLICKHOUSE,<br>DTS,<br>CLS,<br>COS,<br>TOPIC,<br>MYSQL,<br>MQTT,<br>MYSQL_DATA,<br>DORIS,<br>POSTGRESQL,<br>TDSQL_C_POSTGRESQL,<br>TDSQL_POSTGRESQL,<br>WAREHOUSE_POSTGRESQL,<br>TDSQL_C_MYSQL,<br>MARIADB,<br>SQLSERVER,<br>CTSDB,<br>SCF</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>ckafka配置，Type为KAFKA时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KafkaParam")
    @Expose
    private KafkaParam KafkaParam;

    /**
    * <p>EB配置，Type为EB时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventBusParam")
    @Expose
    private EventBusParam EventBusParam;

    /**
    * <p>MongoDB配置，Type为MONGODB时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MongoDBParam")
    @Expose
    private MongoDBParam MongoDBParam;

    /**
    * <p>Es配置，Type为ES时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EsParam")
    @Expose
    private EsParam EsParam;

    /**
    * <p>Tdw配置，Type为TDW时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TdwParam")
    @Expose
    private TdwParam TdwParam;

    /**
    * <p>Dts配置，Type为DTS时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DtsParam")
    @Expose
    private DtsParam DtsParam;

    /**
    * <p>ClickHouse配置，Type为CLICKHOUSE时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClickHouseParam")
    @Expose
    private ClickHouseParam ClickHouseParam;

    /**
    * <p>Cls配置，Type为CLS时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClsParam")
    @Expose
    private ClsParam ClsParam;

    /**
    * <p>Cos配置，Type为COS时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosParam")
    @Expose
    private CosParam CosParam;

    /**
    * <p>MySQL配置，Type为MYSQL时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MySQLParam")
    @Expose
    private MySQLParam MySQLParam;

    /**
    * <p>PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PostgreSQLParam")
    @Expose
    private PostgreSQLParam PostgreSQLParam;

    /**
    * <p>Topic配置，Type为Topic时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicParam")
    @Expose
    private TopicParam TopicParam;

    /**
    * <p>MariaDB配置，Type为MARIADB时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MariaDBParam")
    @Expose
    private MariaDBParam MariaDBParam;

    /**
    * <p>SQLServer配置，Type为SQLSERVER时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SQLServerParam")
    @Expose
    private SQLServerParam SQLServerParam;

    /**
    * <p>Ctsdb配置，Type为CTSDB时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CtsdbParam")
    @Expose
    private CtsdbParam CtsdbParam;

    /**
    * <p>Scf配置，Type为SCF时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScfParam")
    @Expose
    private ScfParam ScfParam;

    /**
    * <p>MQTT配置，Type为 MQTT 时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MqttParam")
    @Expose
    private MqttParam MqttParam;

    /**
    * <p>IceBerg配置</p>
    */
    @SerializedName("IcebergParam")
    @Expose
    private IcebergParam IcebergParam;

    /**
     * Get <p>资源类型  type类型如下:<br>KAFKA,<br>EB_ES,<br>EB_COS,<br>EB_CLS,<br>EB_,<br>MONGODB,<br>HTTP,<br>TDW,<br>ES,<br>CLICKHOUSE,<br>DTS,<br>CLS,<br>COS,<br>TOPIC,<br>MYSQL,<br>MQTT,<br>MYSQL_DATA,<br>DORIS,<br>POSTGRESQL,<br>TDSQL_C_POSTGRESQL,<br>TDSQL_POSTGRESQL,<br>WAREHOUSE_POSTGRESQL,<br>TDSQL_C_MYSQL,<br>MARIADB,<br>SQLSERVER,<br>CTSDB,<br>SCF</p> 
     * @return Type <p>资源类型  type类型如下:<br>KAFKA,<br>EB_ES,<br>EB_COS,<br>EB_CLS,<br>EB_,<br>MONGODB,<br>HTTP,<br>TDW,<br>ES,<br>CLICKHOUSE,<br>DTS,<br>CLS,<br>COS,<br>TOPIC,<br>MYSQL,<br>MQTT,<br>MYSQL_DATA,<br>DORIS,<br>POSTGRESQL,<br>TDSQL_C_POSTGRESQL,<br>TDSQL_POSTGRESQL,<br>WAREHOUSE_POSTGRESQL,<br>TDSQL_C_MYSQL,<br>MARIADB,<br>SQLSERVER,<br>CTSDB,<br>SCF</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>资源类型  type类型如下:<br>KAFKA,<br>EB_ES,<br>EB_COS,<br>EB_CLS,<br>EB_,<br>MONGODB,<br>HTTP,<br>TDW,<br>ES,<br>CLICKHOUSE,<br>DTS,<br>CLS,<br>COS,<br>TOPIC,<br>MYSQL,<br>MQTT,<br>MYSQL_DATA,<br>DORIS,<br>POSTGRESQL,<br>TDSQL_C_POSTGRESQL,<br>TDSQL_POSTGRESQL,<br>WAREHOUSE_POSTGRESQL,<br>TDSQL_C_MYSQL,<br>MARIADB,<br>SQLSERVER,<br>CTSDB,<br>SCF</p>
     * @param Type <p>资源类型  type类型如下:<br>KAFKA,<br>EB_ES,<br>EB_COS,<br>EB_CLS,<br>EB_,<br>MONGODB,<br>HTTP,<br>TDW,<br>ES,<br>CLICKHOUSE,<br>DTS,<br>CLS,<br>COS,<br>TOPIC,<br>MYSQL,<br>MQTT,<br>MYSQL_DATA,<br>DORIS,<br>POSTGRESQL,<br>TDSQL_C_POSTGRESQL,<br>TDSQL_POSTGRESQL,<br>WAREHOUSE_POSTGRESQL,<br>TDSQL_C_MYSQL,<br>MARIADB,<br>SQLSERVER,<br>CTSDB,<br>SCF</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>ckafka配置，Type为KAFKA时必填</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KafkaParam <p>ckafka配置，Type为KAFKA时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KafkaParam getKafkaParam() {
        return this.KafkaParam;
    }

    /**
     * Set <p>ckafka配置，Type为KAFKA时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KafkaParam <p>ckafka配置，Type为KAFKA时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKafkaParam(KafkaParam KafkaParam) {
        this.KafkaParam = KafkaParam;
    }

    /**
     * Get <p>EB配置，Type为EB时必填</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventBusParam <p>EB配置，Type为EB时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EventBusParam getEventBusParam() {
        return this.EventBusParam;
    }

    /**
     * Set <p>EB配置，Type为EB时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventBusParam <p>EB配置，Type为EB时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventBusParam(EventBusParam EventBusParam) {
        this.EventBusParam = EventBusParam;
    }

    /**
     * Get <p>MongoDB配置，Type为MONGODB时必填</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MongoDBParam <p>MongoDB配置，Type为MONGODB时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MongoDBParam getMongoDBParam() {
        return this.MongoDBParam;
    }

    /**
     * Set <p>MongoDB配置，Type为MONGODB时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MongoDBParam <p>MongoDB配置，Type为MONGODB时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMongoDBParam(MongoDBParam MongoDBParam) {
        this.MongoDBParam = MongoDBParam;
    }

    /**
     * Get <p>Es配置，Type为ES时必填</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EsParam <p>Es配置，Type为ES时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EsParam getEsParam() {
        return this.EsParam;
    }

    /**
     * Set <p>Es配置，Type为ES时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EsParam <p>Es配置，Type为ES时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEsParam(EsParam EsParam) {
        this.EsParam = EsParam;
    }

    /**
     * Get <p>Tdw配置，Type为TDW时必填</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TdwParam <p>Tdw配置，Type为TDW时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TdwParam getTdwParam() {
        return this.TdwParam;
    }

    /**
     * Set <p>Tdw配置，Type为TDW时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TdwParam <p>Tdw配置，Type为TDW时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTdwParam(TdwParam TdwParam) {
        this.TdwParam = TdwParam;
    }

    /**
     * Get <p>Dts配置，Type为DTS时必填</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DtsParam <p>Dts配置，Type为DTS时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DtsParam getDtsParam() {
        return this.DtsParam;
    }

    /**
     * Set <p>Dts配置，Type为DTS时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DtsParam <p>Dts配置，Type为DTS时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDtsParam(DtsParam DtsParam) {
        this.DtsParam = DtsParam;
    }

    /**
     * Get <p>ClickHouse配置，Type为CLICKHOUSE时必填</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClickHouseParam <p>ClickHouse配置，Type为CLICKHOUSE时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClickHouseParam getClickHouseParam() {
        return this.ClickHouseParam;
    }

    /**
     * Set <p>ClickHouse配置，Type为CLICKHOUSE时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClickHouseParam <p>ClickHouse配置，Type为CLICKHOUSE时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClickHouseParam(ClickHouseParam ClickHouseParam) {
        this.ClickHouseParam = ClickHouseParam;
    }

    /**
     * Get <p>Cls配置，Type为CLS时必填</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClsParam <p>Cls配置，Type为CLS时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClsParam getClsParam() {
        return this.ClsParam;
    }

    /**
     * Set <p>Cls配置，Type为CLS时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClsParam <p>Cls配置，Type为CLS时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClsParam(ClsParam ClsParam) {
        this.ClsParam = ClsParam;
    }

    /**
     * Get <p>Cos配置，Type为COS时必填</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosParam <p>Cos配置，Type为COS时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CosParam getCosParam() {
        return this.CosParam;
    }

    /**
     * Set <p>Cos配置，Type为COS时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosParam <p>Cos配置，Type为COS时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosParam(CosParam CosParam) {
        this.CosParam = CosParam;
    }

    /**
     * Get <p>MySQL配置，Type为MYSQL时必填</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MySQLParam <p>MySQL配置，Type为MYSQL时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MySQLParam getMySQLParam() {
        return this.MySQLParam;
    }

    /**
     * Set <p>MySQL配置，Type为MYSQL时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MySQLParam <p>MySQL配置，Type为MYSQL时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMySQLParam(MySQLParam MySQLParam) {
        this.MySQLParam = MySQLParam;
    }

    /**
     * Get <p>PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时必填</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PostgreSQLParam <p>PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PostgreSQLParam getPostgreSQLParam() {
        return this.PostgreSQLParam;
    }

    /**
     * Set <p>PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PostgreSQLParam <p>PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPostgreSQLParam(PostgreSQLParam PostgreSQLParam) {
        this.PostgreSQLParam = PostgreSQLParam;
    }

    /**
     * Get <p>Topic配置，Type为Topic时必填</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicParam <p>Topic配置，Type为Topic时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TopicParam getTopicParam() {
        return this.TopicParam;
    }

    /**
     * Set <p>Topic配置，Type为Topic时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicParam <p>Topic配置，Type为Topic时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicParam(TopicParam TopicParam) {
        this.TopicParam = TopicParam;
    }

    /**
     * Get <p>MariaDB配置，Type为MARIADB时必填</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MariaDBParam <p>MariaDB配置，Type为MARIADB时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MariaDBParam getMariaDBParam() {
        return this.MariaDBParam;
    }

    /**
     * Set <p>MariaDB配置，Type为MARIADB时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MariaDBParam <p>MariaDB配置，Type为MARIADB时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMariaDBParam(MariaDBParam MariaDBParam) {
        this.MariaDBParam = MariaDBParam;
    }

    /**
     * Get <p>SQLServer配置，Type为SQLSERVER时必填</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SQLServerParam <p>SQLServer配置，Type为SQLSERVER时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SQLServerParam getSQLServerParam() {
        return this.SQLServerParam;
    }

    /**
     * Set <p>SQLServer配置，Type为SQLSERVER时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SQLServerParam <p>SQLServer配置，Type为SQLSERVER时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSQLServerParam(SQLServerParam SQLServerParam) {
        this.SQLServerParam = SQLServerParam;
    }

    /**
     * Get <p>Ctsdb配置，Type为CTSDB时必填</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CtsdbParam <p>Ctsdb配置，Type为CTSDB时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CtsdbParam getCtsdbParam() {
        return this.CtsdbParam;
    }

    /**
     * Set <p>Ctsdb配置，Type为CTSDB时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CtsdbParam <p>Ctsdb配置，Type为CTSDB时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCtsdbParam(CtsdbParam CtsdbParam) {
        this.CtsdbParam = CtsdbParam;
    }

    /**
     * Get <p>Scf配置，Type为SCF时必填</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScfParam <p>Scf配置，Type为SCF时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScfParam getScfParam() {
        return this.ScfParam;
    }

    /**
     * Set <p>Scf配置，Type为SCF时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScfParam <p>Scf配置，Type为SCF时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScfParam(ScfParam ScfParam) {
        this.ScfParam = ScfParam;
    }

    /**
     * Get <p>MQTT配置，Type为 MQTT 时必填</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MqttParam <p>MQTT配置，Type为 MQTT 时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MqttParam getMqttParam() {
        return this.MqttParam;
    }

    /**
     * Set <p>MQTT配置，Type为 MQTT 时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MqttParam <p>MQTT配置，Type为 MQTT 时必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMqttParam(MqttParam MqttParam) {
        this.MqttParam = MqttParam;
    }

    /**
     * Get <p>IceBerg配置</p> 
     * @return IcebergParam <p>IceBerg配置</p>
     */
    public IcebergParam getIcebergParam() {
        return this.IcebergParam;
    }

    /**
     * Set <p>IceBerg配置</p>
     * @param IcebergParam <p>IceBerg配置</p>
     */
    public void setIcebergParam(IcebergParam IcebergParam) {
        this.IcebergParam = IcebergParam;
    }

    public DatahubResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatahubResource(DatahubResource source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.KafkaParam != null) {
            this.KafkaParam = new KafkaParam(source.KafkaParam);
        }
        if (source.EventBusParam != null) {
            this.EventBusParam = new EventBusParam(source.EventBusParam);
        }
        if (source.MongoDBParam != null) {
            this.MongoDBParam = new MongoDBParam(source.MongoDBParam);
        }
        if (source.EsParam != null) {
            this.EsParam = new EsParam(source.EsParam);
        }
        if (source.TdwParam != null) {
            this.TdwParam = new TdwParam(source.TdwParam);
        }
        if (source.DtsParam != null) {
            this.DtsParam = new DtsParam(source.DtsParam);
        }
        if (source.ClickHouseParam != null) {
            this.ClickHouseParam = new ClickHouseParam(source.ClickHouseParam);
        }
        if (source.ClsParam != null) {
            this.ClsParam = new ClsParam(source.ClsParam);
        }
        if (source.CosParam != null) {
            this.CosParam = new CosParam(source.CosParam);
        }
        if (source.MySQLParam != null) {
            this.MySQLParam = new MySQLParam(source.MySQLParam);
        }
        if (source.PostgreSQLParam != null) {
            this.PostgreSQLParam = new PostgreSQLParam(source.PostgreSQLParam);
        }
        if (source.TopicParam != null) {
            this.TopicParam = new TopicParam(source.TopicParam);
        }
        if (source.MariaDBParam != null) {
            this.MariaDBParam = new MariaDBParam(source.MariaDBParam);
        }
        if (source.SQLServerParam != null) {
            this.SQLServerParam = new SQLServerParam(source.SQLServerParam);
        }
        if (source.CtsdbParam != null) {
            this.CtsdbParam = new CtsdbParam(source.CtsdbParam);
        }
        if (source.ScfParam != null) {
            this.ScfParam = new ScfParam(source.ScfParam);
        }
        if (source.MqttParam != null) {
            this.MqttParam = new MqttParam(source.MqttParam);
        }
        if (source.IcebergParam != null) {
            this.IcebergParam = new IcebergParam(source.IcebergParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "KafkaParam.", this.KafkaParam);
        this.setParamObj(map, prefix + "EventBusParam.", this.EventBusParam);
        this.setParamObj(map, prefix + "MongoDBParam.", this.MongoDBParam);
        this.setParamObj(map, prefix + "EsParam.", this.EsParam);
        this.setParamObj(map, prefix + "TdwParam.", this.TdwParam);
        this.setParamObj(map, prefix + "DtsParam.", this.DtsParam);
        this.setParamObj(map, prefix + "ClickHouseParam.", this.ClickHouseParam);
        this.setParamObj(map, prefix + "ClsParam.", this.ClsParam);
        this.setParamObj(map, prefix + "CosParam.", this.CosParam);
        this.setParamObj(map, prefix + "MySQLParam.", this.MySQLParam);
        this.setParamObj(map, prefix + "PostgreSQLParam.", this.PostgreSQLParam);
        this.setParamObj(map, prefix + "TopicParam.", this.TopicParam);
        this.setParamObj(map, prefix + "MariaDBParam.", this.MariaDBParam);
        this.setParamObj(map, prefix + "SQLServerParam.", this.SQLServerParam);
        this.setParamObj(map, prefix + "CtsdbParam.", this.CtsdbParam);
        this.setParamObj(map, prefix + "ScfParam.", this.ScfParam);
        this.setParamObj(map, prefix + "MqttParam.", this.MqttParam);
        this.setParamObj(map, prefix + "IcebergParam.", this.IcebergParam);

    }
}

