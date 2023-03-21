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

public class CreateConnectResourceRequest extends AbstractModel{

    /**
    * 连接源名称
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 连接源类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 连接源描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Dts配置，Type为DTS时必填
    */
    @SerializedName("DtsConnectParam")
    @Expose
    private DtsConnectParam DtsConnectParam;

    /**
    * MongoDB配置，Type为MONGODB时必填
    */
    @SerializedName("MongoDBConnectParam")
    @Expose
    private MongoDBConnectParam MongoDBConnectParam;

    /**
    * Es配置，Type为ES时必填
    */
    @SerializedName("EsConnectParam")
    @Expose
    private EsConnectParam EsConnectParam;

    /**
    * ClickHouse配置，Type为CLICKHOUSE时必填
    */
    @SerializedName("ClickHouseConnectParam")
    @Expose
    private ClickHouseConnectParam ClickHouseConnectParam;

    /**
    * MySQL配置，Type为MYSQL或TDSQL_C_MYSQL时必填
    */
    @SerializedName("MySQLConnectParam")
    @Expose
    private MySQLConnectParam MySQLConnectParam;

    /**
    * PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时必填
    */
    @SerializedName("PostgreSQLConnectParam")
    @Expose
    private PostgreSQLConnectParam PostgreSQLConnectParam;

    /**
    * MariaDB配置，Type为MARIADB时必填
    */
    @SerializedName("MariaDBConnectParam")
    @Expose
    private MariaDBConnectParam MariaDBConnectParam;

    /**
    * SQLServer配置，Type为SQLSERVER时必填
    */
    @SerializedName("SQLServerConnectParam")
    @Expose
    private SQLServerConnectParam SQLServerConnectParam;

    /**
    * Doris 配置，Type为 DORIS 时必填
    */
    @SerializedName("DorisConnectParam")
    @Expose
    private DorisConnectParam DorisConnectParam;

    /**
    * Kafka配置，Type为 KAFKA 时必填
    */
    @SerializedName("KafkaConnectParam")
    @Expose
    private KafkaConnectParam KafkaConnectParam;

    /**
     * Get 连接源名称 
     * @return ResourceName 连接源名称
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 连接源名称
     * @param ResourceName 连接源名称
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 连接源类型 
     * @return Type 连接源类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 连接源类型
     * @param Type 连接源类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 连接源描述 
     * @return Description 连接源描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 连接源描述
     * @param Description 连接源描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Dts配置，Type为DTS时必填 
     * @return DtsConnectParam Dts配置，Type为DTS时必填
     */
    public DtsConnectParam getDtsConnectParam() {
        return this.DtsConnectParam;
    }

    /**
     * Set Dts配置，Type为DTS时必填
     * @param DtsConnectParam Dts配置，Type为DTS时必填
     */
    public void setDtsConnectParam(DtsConnectParam DtsConnectParam) {
        this.DtsConnectParam = DtsConnectParam;
    }

    /**
     * Get MongoDB配置，Type为MONGODB时必填 
     * @return MongoDBConnectParam MongoDB配置，Type为MONGODB时必填
     */
    public MongoDBConnectParam getMongoDBConnectParam() {
        return this.MongoDBConnectParam;
    }

    /**
     * Set MongoDB配置，Type为MONGODB时必填
     * @param MongoDBConnectParam MongoDB配置，Type为MONGODB时必填
     */
    public void setMongoDBConnectParam(MongoDBConnectParam MongoDBConnectParam) {
        this.MongoDBConnectParam = MongoDBConnectParam;
    }

    /**
     * Get Es配置，Type为ES时必填 
     * @return EsConnectParam Es配置，Type为ES时必填
     */
    public EsConnectParam getEsConnectParam() {
        return this.EsConnectParam;
    }

    /**
     * Set Es配置，Type为ES时必填
     * @param EsConnectParam Es配置，Type为ES时必填
     */
    public void setEsConnectParam(EsConnectParam EsConnectParam) {
        this.EsConnectParam = EsConnectParam;
    }

    /**
     * Get ClickHouse配置，Type为CLICKHOUSE时必填 
     * @return ClickHouseConnectParam ClickHouse配置，Type为CLICKHOUSE时必填
     */
    public ClickHouseConnectParam getClickHouseConnectParam() {
        return this.ClickHouseConnectParam;
    }

    /**
     * Set ClickHouse配置，Type为CLICKHOUSE时必填
     * @param ClickHouseConnectParam ClickHouse配置，Type为CLICKHOUSE时必填
     */
    public void setClickHouseConnectParam(ClickHouseConnectParam ClickHouseConnectParam) {
        this.ClickHouseConnectParam = ClickHouseConnectParam;
    }

    /**
     * Get MySQL配置，Type为MYSQL或TDSQL_C_MYSQL时必填 
     * @return MySQLConnectParam MySQL配置，Type为MYSQL或TDSQL_C_MYSQL时必填
     */
    public MySQLConnectParam getMySQLConnectParam() {
        return this.MySQLConnectParam;
    }

    /**
     * Set MySQL配置，Type为MYSQL或TDSQL_C_MYSQL时必填
     * @param MySQLConnectParam MySQL配置，Type为MYSQL或TDSQL_C_MYSQL时必填
     */
    public void setMySQLConnectParam(MySQLConnectParam MySQLConnectParam) {
        this.MySQLConnectParam = MySQLConnectParam;
    }

    /**
     * Get PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时必填 
     * @return PostgreSQLConnectParam PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时必填
     */
    public PostgreSQLConnectParam getPostgreSQLConnectParam() {
        return this.PostgreSQLConnectParam;
    }

    /**
     * Set PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时必填
     * @param PostgreSQLConnectParam PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时必填
     */
    public void setPostgreSQLConnectParam(PostgreSQLConnectParam PostgreSQLConnectParam) {
        this.PostgreSQLConnectParam = PostgreSQLConnectParam;
    }

    /**
     * Get MariaDB配置，Type为MARIADB时必填 
     * @return MariaDBConnectParam MariaDB配置，Type为MARIADB时必填
     */
    public MariaDBConnectParam getMariaDBConnectParam() {
        return this.MariaDBConnectParam;
    }

    /**
     * Set MariaDB配置，Type为MARIADB时必填
     * @param MariaDBConnectParam MariaDB配置，Type为MARIADB时必填
     */
    public void setMariaDBConnectParam(MariaDBConnectParam MariaDBConnectParam) {
        this.MariaDBConnectParam = MariaDBConnectParam;
    }

    /**
     * Get SQLServer配置，Type为SQLSERVER时必填 
     * @return SQLServerConnectParam SQLServer配置，Type为SQLSERVER时必填
     */
    public SQLServerConnectParam getSQLServerConnectParam() {
        return this.SQLServerConnectParam;
    }

    /**
     * Set SQLServer配置，Type为SQLSERVER时必填
     * @param SQLServerConnectParam SQLServer配置，Type为SQLSERVER时必填
     */
    public void setSQLServerConnectParam(SQLServerConnectParam SQLServerConnectParam) {
        this.SQLServerConnectParam = SQLServerConnectParam;
    }

    /**
     * Get Doris 配置，Type为 DORIS 时必填 
     * @return DorisConnectParam Doris 配置，Type为 DORIS 时必填
     */
    public DorisConnectParam getDorisConnectParam() {
        return this.DorisConnectParam;
    }

    /**
     * Set Doris 配置，Type为 DORIS 时必填
     * @param DorisConnectParam Doris 配置，Type为 DORIS 时必填
     */
    public void setDorisConnectParam(DorisConnectParam DorisConnectParam) {
        this.DorisConnectParam = DorisConnectParam;
    }

    /**
     * Get Kafka配置，Type为 KAFKA 时必填 
     * @return KafkaConnectParam Kafka配置，Type为 KAFKA 时必填
     */
    public KafkaConnectParam getKafkaConnectParam() {
        return this.KafkaConnectParam;
    }

    /**
     * Set Kafka配置，Type为 KAFKA 时必填
     * @param KafkaConnectParam Kafka配置，Type为 KAFKA 时必填
     */
    public void setKafkaConnectParam(KafkaConnectParam KafkaConnectParam) {
        this.KafkaConnectParam = KafkaConnectParam;
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

    }
}

