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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DatasourceConnectionConfig extends AbstractModel {

    /**
    * Mysql数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mysql")
    @Expose
    private MysqlInfo Mysql;

    /**
    * Hive数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Hive")
    @Expose
    private HiveInfo Hive;

    /**
    * Kafka数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Kafka")
    @Expose
    private KafkaInfo Kafka;

    /**
    * 其他数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OtherDatasourceConnection")
    @Expose
    private OtherDatasourceConnection OtherDatasourceConnection;

    /**
    * PostgreSQL数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PostgreSql")
    @Expose
    private DataSourceInfo PostgreSql;

    /**
    * SQLServer数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlServer")
    @Expose
    private DataSourceInfo SqlServer;

    /**
    * ClickHouse数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClickHouse")
    @Expose
    private DataSourceInfo ClickHouse;

    /**
    * Elasticsearch数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Elasticsearch")
    @Expose
    private ElasticsearchInfo Elasticsearch;

    /**
    * TDSQL-PostgreSQL数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TDSQLPostgreSql")
    @Expose
    private DataSourceInfo TDSQLPostgreSql;

    /**
    * Doris数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TCHouseD")
    @Expose
    private TCHouseD TCHouseD;

    /**
    * TccHive数据目录连接信息
    */
    @SerializedName("TccHive")
    @Expose
    private TccHive TccHive;

    /**
    * MongoDB 数据源
    */
    @SerializedName("MongoDB")
    @Expose
    private DataSourceInfo MongoDB;

    /**
     * Get Mysql数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mysql Mysql数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MysqlInfo getMysql() {
        return this.Mysql;
    }

    /**
     * Set Mysql数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mysql Mysql数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMysql(MysqlInfo Mysql) {
        this.Mysql = Mysql;
    }

    /**
     * Get Hive数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Hive Hive数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HiveInfo getHive() {
        return this.Hive;
    }

    /**
     * Set Hive数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param Hive Hive数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHive(HiveInfo Hive) {
        this.Hive = Hive;
    }

    /**
     * Get Kafka数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Kafka Kafka数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KafkaInfo getKafka() {
        return this.Kafka;
    }

    /**
     * Set Kafka数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param Kafka Kafka数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKafka(KafkaInfo Kafka) {
        this.Kafka = Kafka;
    }

    /**
     * Get 其他数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OtherDatasourceConnection 其他数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OtherDatasourceConnection getOtherDatasourceConnection() {
        return this.OtherDatasourceConnection;
    }

    /**
     * Set 其他数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param OtherDatasourceConnection 其他数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOtherDatasourceConnection(OtherDatasourceConnection OtherDatasourceConnection) {
        this.OtherDatasourceConnection = OtherDatasourceConnection;
    }

    /**
     * Get PostgreSQL数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PostgreSql PostgreSQL数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataSourceInfo getPostgreSql() {
        return this.PostgreSql;
    }

    /**
     * Set PostgreSQL数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param PostgreSql PostgreSQL数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPostgreSql(DataSourceInfo PostgreSql) {
        this.PostgreSql = PostgreSql;
    }

    /**
     * Get SQLServer数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlServer SQLServer数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataSourceInfo getSqlServer() {
        return this.SqlServer;
    }

    /**
     * Set SQLServer数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlServer SQLServer数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlServer(DataSourceInfo SqlServer) {
        this.SqlServer = SqlServer;
    }

    /**
     * Get ClickHouse数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClickHouse ClickHouse数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataSourceInfo getClickHouse() {
        return this.ClickHouse;
    }

    /**
     * Set ClickHouse数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClickHouse ClickHouse数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClickHouse(DataSourceInfo ClickHouse) {
        this.ClickHouse = ClickHouse;
    }

    /**
     * Get Elasticsearch数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Elasticsearch Elasticsearch数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ElasticsearchInfo getElasticsearch() {
        return this.Elasticsearch;
    }

    /**
     * Set Elasticsearch数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param Elasticsearch Elasticsearch数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElasticsearch(ElasticsearchInfo Elasticsearch) {
        this.Elasticsearch = Elasticsearch;
    }

    /**
     * Get TDSQL-PostgreSQL数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TDSQLPostgreSql TDSQL-PostgreSQL数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataSourceInfo getTDSQLPostgreSql() {
        return this.TDSQLPostgreSql;
    }

    /**
     * Set TDSQL-PostgreSQL数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param TDSQLPostgreSql TDSQL-PostgreSQL数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTDSQLPostgreSql(DataSourceInfo TDSQLPostgreSql) {
        this.TDSQLPostgreSql = TDSQLPostgreSql;
    }

    /**
     * Get Doris数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TCHouseD Doris数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TCHouseD getTCHouseD() {
        return this.TCHouseD;
    }

    /**
     * Set Doris数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param TCHouseD Doris数据源连接的属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTCHouseD(TCHouseD TCHouseD) {
        this.TCHouseD = TCHouseD;
    }

    /**
     * Get TccHive数据目录连接信息 
     * @return TccHive TccHive数据目录连接信息
     */
    public TccHive getTccHive() {
        return this.TccHive;
    }

    /**
     * Set TccHive数据目录连接信息
     * @param TccHive TccHive数据目录连接信息
     */
    public void setTccHive(TccHive TccHive) {
        this.TccHive = TccHive;
    }

    /**
     * Get MongoDB 数据源 
     * @return MongoDB MongoDB 数据源
     */
    public DataSourceInfo getMongoDB() {
        return this.MongoDB;
    }

    /**
     * Set MongoDB 数据源
     * @param MongoDB MongoDB 数据源
     */
    public void setMongoDB(DataSourceInfo MongoDB) {
        this.MongoDB = MongoDB;
    }

    public DatasourceConnectionConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatasourceConnectionConfig(DatasourceConnectionConfig source) {
        if (source.Mysql != null) {
            this.Mysql = new MysqlInfo(source.Mysql);
        }
        if (source.Hive != null) {
            this.Hive = new HiveInfo(source.Hive);
        }
        if (source.Kafka != null) {
            this.Kafka = new KafkaInfo(source.Kafka);
        }
        if (source.OtherDatasourceConnection != null) {
            this.OtherDatasourceConnection = new OtherDatasourceConnection(source.OtherDatasourceConnection);
        }
        if (source.PostgreSql != null) {
            this.PostgreSql = new DataSourceInfo(source.PostgreSql);
        }
        if (source.SqlServer != null) {
            this.SqlServer = new DataSourceInfo(source.SqlServer);
        }
        if (source.ClickHouse != null) {
            this.ClickHouse = new DataSourceInfo(source.ClickHouse);
        }
        if (source.Elasticsearch != null) {
            this.Elasticsearch = new ElasticsearchInfo(source.Elasticsearch);
        }
        if (source.TDSQLPostgreSql != null) {
            this.TDSQLPostgreSql = new DataSourceInfo(source.TDSQLPostgreSql);
        }
        if (source.TCHouseD != null) {
            this.TCHouseD = new TCHouseD(source.TCHouseD);
        }
        if (source.TccHive != null) {
            this.TccHive = new TccHive(source.TccHive);
        }
        if (source.MongoDB != null) {
            this.MongoDB = new DataSourceInfo(source.MongoDB);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Mysql.", this.Mysql);
        this.setParamObj(map, prefix + "Hive.", this.Hive);
        this.setParamObj(map, prefix + "Kafka.", this.Kafka);
        this.setParamObj(map, prefix + "OtherDatasourceConnection.", this.OtherDatasourceConnection);
        this.setParamObj(map, prefix + "PostgreSql.", this.PostgreSql);
        this.setParamObj(map, prefix + "SqlServer.", this.SqlServer);
        this.setParamObj(map, prefix + "ClickHouse.", this.ClickHouse);
        this.setParamObj(map, prefix + "Elasticsearch.", this.Elasticsearch);
        this.setParamObj(map, prefix + "TDSQLPostgreSql.", this.TDSQLPostgreSql);
        this.setParamObj(map, prefix + "TCHouseD.", this.TCHouseD);
        this.setParamObj(map, prefix + "TccHive.", this.TccHive);
        this.setParamObj(map, prefix + "MongoDB.", this.MongoDB);

    }
}

