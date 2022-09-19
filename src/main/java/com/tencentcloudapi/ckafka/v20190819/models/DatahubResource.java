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

public class DatahubResource extends AbstractModel{

    /**
    * 资源类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * ckafka配置，Type为KAFKA时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KafkaParam")
    @Expose
    private KafkaParam KafkaParam;

    /**
    * EB配置，Type为EB时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventBusParam")
    @Expose
    private EventBusParam EventBusParam;

    /**
    * MongoDB配置，Type为MONGODB时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MongoDBParam")
    @Expose
    private MongoDBParam MongoDBParam;

    /**
    * Es配置，Type为ES时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EsParam")
    @Expose
    private EsParam EsParam;

    /**
    * Tdw配置，Type为TDW时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TdwParam")
    @Expose
    private TdwParam TdwParam;

    /**
    * Dts配置，Type为DTS时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DtsParam")
    @Expose
    private DtsParam DtsParam;

    /**
    * ClickHouse配置，Type为CLICKHOUSE时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClickHouseParam")
    @Expose
    private ClickHouseParam ClickHouseParam;

    /**
    * Cls配置，Type为CLS时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClsParam")
    @Expose
    private ClsParam ClsParam;

    /**
    * Cos配置，Type为COS时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosParam")
    @Expose
    private CosParam CosParam;

    /**
    * MySQL配置，Type为MYSQL时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MySQLParam")
    @Expose
    private MySQLParam MySQLParam;

    /**
    * PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PostgreSQLParam")
    @Expose
    private PostgreSQLParam PostgreSQLParam;

    /**
    * Topic配置，Type为Topic时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicParam")
    @Expose
    private TopicParam TopicParam;

    /**
    * MariaDB配置，Type为MARIADB时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MariaDBParam")
    @Expose
    private MariaDBParam MariaDBParam;

    /**
    * SQLServer配置，Type为SQLSERVER时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SQLServerParam")
    @Expose
    private SQLServerParam SQLServerParam;

    /**
    * Ctsdb配置，Type为CTSDB时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CtsdbParam")
    @Expose
    private CtsdbParam CtsdbParam;

    /**
     * Get 资源类型 
     * @return Type 资源类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 资源类型
     * @param Type 资源类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get ckafka配置，Type为KAFKA时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KafkaParam ckafka配置，Type为KAFKA时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KafkaParam getKafkaParam() {
        return this.KafkaParam;
    }

    /**
     * Set ckafka配置，Type为KAFKA时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param KafkaParam ckafka配置，Type为KAFKA时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKafkaParam(KafkaParam KafkaParam) {
        this.KafkaParam = KafkaParam;
    }

    /**
     * Get EB配置，Type为EB时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventBusParam EB配置，Type为EB时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EventBusParam getEventBusParam() {
        return this.EventBusParam;
    }

    /**
     * Set EB配置，Type为EB时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventBusParam EB配置，Type为EB时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventBusParam(EventBusParam EventBusParam) {
        this.EventBusParam = EventBusParam;
    }

    /**
     * Get MongoDB配置，Type为MONGODB时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MongoDBParam MongoDB配置，Type为MONGODB时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MongoDBParam getMongoDBParam() {
        return this.MongoDBParam;
    }

    /**
     * Set MongoDB配置，Type为MONGODB时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param MongoDBParam MongoDB配置，Type为MONGODB时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMongoDBParam(MongoDBParam MongoDBParam) {
        this.MongoDBParam = MongoDBParam;
    }

    /**
     * Get Es配置，Type为ES时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EsParam Es配置，Type为ES时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EsParam getEsParam() {
        return this.EsParam;
    }

    /**
     * Set Es配置，Type为ES时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param EsParam Es配置，Type为ES时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEsParam(EsParam EsParam) {
        this.EsParam = EsParam;
    }

    /**
     * Get Tdw配置，Type为TDW时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TdwParam Tdw配置，Type为TDW时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TdwParam getTdwParam() {
        return this.TdwParam;
    }

    /**
     * Set Tdw配置，Type为TDW时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param TdwParam Tdw配置，Type为TDW时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTdwParam(TdwParam TdwParam) {
        this.TdwParam = TdwParam;
    }

    /**
     * Get Dts配置，Type为DTS时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DtsParam Dts配置，Type为DTS时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DtsParam getDtsParam() {
        return this.DtsParam;
    }

    /**
     * Set Dts配置，Type为DTS时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param DtsParam Dts配置，Type为DTS时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDtsParam(DtsParam DtsParam) {
        this.DtsParam = DtsParam;
    }

    /**
     * Get ClickHouse配置，Type为CLICKHOUSE时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClickHouseParam ClickHouse配置，Type为CLICKHOUSE时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClickHouseParam getClickHouseParam() {
        return this.ClickHouseParam;
    }

    /**
     * Set ClickHouse配置，Type为CLICKHOUSE时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClickHouseParam ClickHouse配置，Type为CLICKHOUSE时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClickHouseParam(ClickHouseParam ClickHouseParam) {
        this.ClickHouseParam = ClickHouseParam;
    }

    /**
     * Get Cls配置，Type为CLS时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClsParam Cls配置，Type为CLS时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClsParam getClsParam() {
        return this.ClsParam;
    }

    /**
     * Set Cls配置，Type为CLS时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClsParam Cls配置，Type为CLS时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClsParam(ClsParam ClsParam) {
        this.ClsParam = ClsParam;
    }

    /**
     * Get Cos配置，Type为COS时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosParam Cos配置，Type为COS时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CosParam getCosParam() {
        return this.CosParam;
    }

    /**
     * Set Cos配置，Type为COS时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosParam Cos配置，Type为COS时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosParam(CosParam CosParam) {
        this.CosParam = CosParam;
    }

    /**
     * Get MySQL配置，Type为MYSQL时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MySQLParam MySQL配置，Type为MYSQL时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MySQLParam getMySQLParam() {
        return this.MySQLParam;
    }

    /**
     * Set MySQL配置，Type为MYSQL时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param MySQLParam MySQL配置，Type为MYSQL时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMySQLParam(MySQLParam MySQLParam) {
        this.MySQLParam = MySQLParam;
    }

    /**
     * Get PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PostgreSQLParam PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PostgreSQLParam getPostgreSQLParam() {
        return this.PostgreSQLParam;
    }

    /**
     * Set PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param PostgreSQLParam PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPostgreSQLParam(PostgreSQLParam PostgreSQLParam) {
        this.PostgreSQLParam = PostgreSQLParam;
    }

    /**
     * Get Topic配置，Type为Topic时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicParam Topic配置，Type为Topic时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TopicParam getTopicParam() {
        return this.TopicParam;
    }

    /**
     * Set Topic配置，Type为Topic时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicParam Topic配置，Type为Topic时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicParam(TopicParam TopicParam) {
        this.TopicParam = TopicParam;
    }

    /**
     * Get MariaDB配置，Type为MARIADB时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MariaDBParam MariaDB配置，Type为MARIADB时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MariaDBParam getMariaDBParam() {
        return this.MariaDBParam;
    }

    /**
     * Set MariaDB配置，Type为MARIADB时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param MariaDBParam MariaDB配置，Type为MARIADB时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMariaDBParam(MariaDBParam MariaDBParam) {
        this.MariaDBParam = MariaDBParam;
    }

    /**
     * Get SQLServer配置，Type为SQLSERVER时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SQLServerParam SQLServer配置，Type为SQLSERVER时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SQLServerParam getSQLServerParam() {
        return this.SQLServerParam;
    }

    /**
     * Set SQLServer配置，Type为SQLSERVER时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param SQLServerParam SQLServer配置，Type为SQLSERVER时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSQLServerParam(SQLServerParam SQLServerParam) {
        this.SQLServerParam = SQLServerParam;
    }

    /**
     * Get Ctsdb配置，Type为CTSDB时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CtsdbParam Ctsdb配置，Type为CTSDB时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CtsdbParam getCtsdbParam() {
        return this.CtsdbParam;
    }

    /**
     * Set Ctsdb配置，Type为CTSDB时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param CtsdbParam Ctsdb配置，Type为CTSDB时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCtsdbParam(CtsdbParam CtsdbParam) {
        this.CtsdbParam = CtsdbParam;
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

    }
}

