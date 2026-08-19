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
    * <p>Mysql数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mysql")
    @Expose
    private MysqlInfo Mysql;

    /**
    * <p>Hive数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Hive")
    @Expose
    private HiveInfo Hive;

    /**
    * <p>Kafka数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Kafka")
    @Expose
    private KafkaInfo Kafka;

    /**
    * <p>其他数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OtherDatasourceConnection")
    @Expose
    private OtherDatasourceConnection OtherDatasourceConnection;

    /**
    * <p>PostgreSQL数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PostgreSql")
    @Expose
    private DataSourceInfo PostgreSql;

    /**
    * <p>SQLServer数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlServer")
    @Expose
    private DataSourceInfo SqlServer;

    /**
    * <p>ClickHouse数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClickHouse")
    @Expose
    private DataSourceInfo ClickHouse;

    /**
    * <p>Elasticsearch数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Elasticsearch")
    @Expose
    private ElasticsearchInfo Elasticsearch;

    /**
    * <p>TDSQL-PostgreSQL数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TDSQLPostgreSql")
    @Expose
    private DataSourceInfo TDSQLPostgreSql;

    /**
    * <p>Doris数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TCHouseD")
    @Expose
    private TCHouseD TCHouseD;

    /**
    * <p>TccHive数据目录连接信息</p>
    */
    @SerializedName("TccHive")
    @Expose
    private TccHive TccHive;

    /**
    * <p>MongoDB 数据源</p>
    */
    @SerializedName("MongoDB")
    @Expose
    private DataSourceInfo MongoDB;

    /**
    * <p>TCHouseP数据源</p>
    */
    @SerializedName("TCHouseP")
    @Expose
    private TCHousePInfo TCHouseP;

    /**
     * Get <p>Mysql数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mysql <p>Mysql数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MysqlInfo getMysql() {
        return this.Mysql;
    }

    /**
     * Set <p>Mysql数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mysql <p>Mysql数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMysql(MysqlInfo Mysql) {
        this.Mysql = Mysql;
    }

    /**
     * Get <p>Hive数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Hive <p>Hive数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HiveInfo getHive() {
        return this.Hive;
    }

    /**
     * Set <p>Hive数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Hive <p>Hive数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHive(HiveInfo Hive) {
        this.Hive = Hive;
    }

    /**
     * Get <p>Kafka数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Kafka <p>Kafka数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KafkaInfo getKafka() {
        return this.Kafka;
    }

    /**
     * Set <p>Kafka数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Kafka <p>Kafka数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKafka(KafkaInfo Kafka) {
        this.Kafka = Kafka;
    }

    /**
     * Get <p>其他数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OtherDatasourceConnection <p>其他数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OtherDatasourceConnection getOtherDatasourceConnection() {
        return this.OtherDatasourceConnection;
    }

    /**
     * Set <p>其他数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OtherDatasourceConnection <p>其他数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOtherDatasourceConnection(OtherDatasourceConnection OtherDatasourceConnection) {
        this.OtherDatasourceConnection = OtherDatasourceConnection;
    }

    /**
     * Get <p>PostgreSQL数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PostgreSql <p>PostgreSQL数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataSourceInfo getPostgreSql() {
        return this.PostgreSql;
    }

    /**
     * Set <p>PostgreSQL数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PostgreSql <p>PostgreSQL数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPostgreSql(DataSourceInfo PostgreSql) {
        this.PostgreSql = PostgreSql;
    }

    /**
     * Get <p>SQLServer数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlServer <p>SQLServer数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataSourceInfo getSqlServer() {
        return this.SqlServer;
    }

    /**
     * Set <p>SQLServer数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlServer <p>SQLServer数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlServer(DataSourceInfo SqlServer) {
        this.SqlServer = SqlServer;
    }

    /**
     * Get <p>ClickHouse数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClickHouse <p>ClickHouse数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataSourceInfo getClickHouse() {
        return this.ClickHouse;
    }

    /**
     * Set <p>ClickHouse数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClickHouse <p>ClickHouse数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClickHouse(DataSourceInfo ClickHouse) {
        this.ClickHouse = ClickHouse;
    }

    /**
     * Get <p>Elasticsearch数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Elasticsearch <p>Elasticsearch数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ElasticsearchInfo getElasticsearch() {
        return this.Elasticsearch;
    }

    /**
     * Set <p>Elasticsearch数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Elasticsearch <p>Elasticsearch数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElasticsearch(ElasticsearchInfo Elasticsearch) {
        this.Elasticsearch = Elasticsearch;
    }

    /**
     * Get <p>TDSQL-PostgreSQL数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TDSQLPostgreSql <p>TDSQL-PostgreSQL数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataSourceInfo getTDSQLPostgreSql() {
        return this.TDSQLPostgreSql;
    }

    /**
     * Set <p>TDSQL-PostgreSQL数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TDSQLPostgreSql <p>TDSQL-PostgreSQL数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTDSQLPostgreSql(DataSourceInfo TDSQLPostgreSql) {
        this.TDSQLPostgreSql = TDSQLPostgreSql;
    }

    /**
     * Get <p>Doris数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TCHouseD <p>Doris数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TCHouseD getTCHouseD() {
        return this.TCHouseD;
    }

    /**
     * Set <p>Doris数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TCHouseD <p>Doris数据源连接的属性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTCHouseD(TCHouseD TCHouseD) {
        this.TCHouseD = TCHouseD;
    }

    /**
     * Get <p>TccHive数据目录连接信息</p> 
     * @return TccHive <p>TccHive数据目录连接信息</p>
     */
    public TccHive getTccHive() {
        return this.TccHive;
    }

    /**
     * Set <p>TccHive数据目录连接信息</p>
     * @param TccHive <p>TccHive数据目录连接信息</p>
     */
    public void setTccHive(TccHive TccHive) {
        this.TccHive = TccHive;
    }

    /**
     * Get <p>MongoDB 数据源</p> 
     * @return MongoDB <p>MongoDB 数据源</p>
     */
    public DataSourceInfo getMongoDB() {
        return this.MongoDB;
    }

    /**
     * Set <p>MongoDB 数据源</p>
     * @param MongoDB <p>MongoDB 数据源</p>
     */
    public void setMongoDB(DataSourceInfo MongoDB) {
        this.MongoDB = MongoDB;
    }

    /**
     * Get <p>TCHouseP数据源</p> 
     * @return TCHouseP <p>TCHouseP数据源</p>
     */
    public TCHousePInfo getTCHouseP() {
        return this.TCHouseP;
    }

    /**
     * Set <p>TCHouseP数据源</p>
     * @param TCHouseP <p>TCHouseP数据源</p>
     */
    public void setTCHouseP(TCHousePInfo TCHouseP) {
        this.TCHouseP = TCHouseP;
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
        if (source.TCHouseP != null) {
            this.TCHouseP = new TCHousePInfo(source.TCHouseP);
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
        this.setParamObj(map, prefix + "TCHouseP.", this.TCHouseP);

    }
}

