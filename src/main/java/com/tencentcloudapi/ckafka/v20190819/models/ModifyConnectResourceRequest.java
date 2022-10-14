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

public class ModifyConnectResourceRequest extends AbstractModel{

    /**
    * 连接源的Id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 连接源名称，为空时不修改
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 连接源描述，为空时不修改
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 连接源类型，修改数据源参数时，需要与原Type相同，否则编辑数据源无效
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Dts配置，Type为DTS时必填
    */
    @SerializedName("DtsConnectParam")
    @Expose
    private DtsModifyConnectParam DtsConnectParam;

    /**
    * MongoDB配置，Type为MONGODB时必填
    */
    @SerializedName("MongoDBConnectParam")
    @Expose
    private MongoDBModifyConnectParam MongoDBConnectParam;

    /**
    * Es配置，Type为ES时必填
    */
    @SerializedName("EsConnectParam")
    @Expose
    private EsModifyConnectParam EsConnectParam;

    /**
    * ClickHouse配置，Type为CLICKHOUSE时必填
    */
    @SerializedName("ClickHouseConnectParam")
    @Expose
    private ClickHouseModifyConnectParam ClickHouseConnectParam;

    /**
    * MySQL配置，Type为MYSQL或TDSQL_C_MYSQL时必填
    */
    @SerializedName("MySQLConnectParam")
    @Expose
    private MySQLModifyConnectParam MySQLConnectParam;

    /**
    * PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时必填
    */
    @SerializedName("PostgreSQLConnectParam")
    @Expose
    private PostgreSQLModifyConnectParam PostgreSQLConnectParam;

    /**
    * MariaDB配置，Type为MARIADB时必填
    */
    @SerializedName("MariaDBConnectParam")
    @Expose
    private MariaDBModifyConnectParam MariaDBConnectParam;

    /**
    * SQLServer配置，Type为SQLSERVER时必填
    */
    @SerializedName("SQLServerConnectParam")
    @Expose
    private SQLServerModifyConnectParam SQLServerConnectParam;

    /**
    * Ctsdb配置，Type为CTSDB
    */
    @SerializedName("CtsdbConnectParam")
    @Expose
    private CtsdbModifyConnectParam CtsdbConnectParam;

    /**
    * Doris配置，Type为DORIS
    */
    @SerializedName("DorisConnectParam")
    @Expose
    private DorisModifyConnectParam DorisConnectParam;

    /**
     * Get 连接源的Id 
     * @return ResourceId 连接源的Id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 连接源的Id
     * @param ResourceId 连接源的Id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 连接源名称，为空时不修改 
     * @return ResourceName 连接源名称，为空时不修改
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 连接源名称，为空时不修改
     * @param ResourceName 连接源名称，为空时不修改
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 连接源描述，为空时不修改 
     * @return Description 连接源描述，为空时不修改
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 连接源描述，为空时不修改
     * @param Description 连接源描述，为空时不修改
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 连接源类型，修改数据源参数时，需要与原Type相同，否则编辑数据源无效 
     * @return Type 连接源类型，修改数据源参数时，需要与原Type相同，否则编辑数据源无效
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 连接源类型，修改数据源参数时，需要与原Type相同，否则编辑数据源无效
     * @param Type 连接源类型，修改数据源参数时，需要与原Type相同，否则编辑数据源无效
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Dts配置，Type为DTS时必填 
     * @return DtsConnectParam Dts配置，Type为DTS时必填
     */
    public DtsModifyConnectParam getDtsConnectParam() {
        return this.DtsConnectParam;
    }

    /**
     * Set Dts配置，Type为DTS时必填
     * @param DtsConnectParam Dts配置，Type为DTS时必填
     */
    public void setDtsConnectParam(DtsModifyConnectParam DtsConnectParam) {
        this.DtsConnectParam = DtsConnectParam;
    }

    /**
     * Get MongoDB配置，Type为MONGODB时必填 
     * @return MongoDBConnectParam MongoDB配置，Type为MONGODB时必填
     */
    public MongoDBModifyConnectParam getMongoDBConnectParam() {
        return this.MongoDBConnectParam;
    }

    /**
     * Set MongoDB配置，Type为MONGODB时必填
     * @param MongoDBConnectParam MongoDB配置，Type为MONGODB时必填
     */
    public void setMongoDBConnectParam(MongoDBModifyConnectParam MongoDBConnectParam) {
        this.MongoDBConnectParam = MongoDBConnectParam;
    }

    /**
     * Get Es配置，Type为ES时必填 
     * @return EsConnectParam Es配置，Type为ES时必填
     */
    public EsModifyConnectParam getEsConnectParam() {
        return this.EsConnectParam;
    }

    /**
     * Set Es配置，Type为ES时必填
     * @param EsConnectParam Es配置，Type为ES时必填
     */
    public void setEsConnectParam(EsModifyConnectParam EsConnectParam) {
        this.EsConnectParam = EsConnectParam;
    }

    /**
     * Get ClickHouse配置，Type为CLICKHOUSE时必填 
     * @return ClickHouseConnectParam ClickHouse配置，Type为CLICKHOUSE时必填
     */
    public ClickHouseModifyConnectParam getClickHouseConnectParam() {
        return this.ClickHouseConnectParam;
    }

    /**
     * Set ClickHouse配置，Type为CLICKHOUSE时必填
     * @param ClickHouseConnectParam ClickHouse配置，Type为CLICKHOUSE时必填
     */
    public void setClickHouseConnectParam(ClickHouseModifyConnectParam ClickHouseConnectParam) {
        this.ClickHouseConnectParam = ClickHouseConnectParam;
    }

    /**
     * Get MySQL配置，Type为MYSQL或TDSQL_C_MYSQL时必填 
     * @return MySQLConnectParam MySQL配置，Type为MYSQL或TDSQL_C_MYSQL时必填
     */
    public MySQLModifyConnectParam getMySQLConnectParam() {
        return this.MySQLConnectParam;
    }

    /**
     * Set MySQL配置，Type为MYSQL或TDSQL_C_MYSQL时必填
     * @param MySQLConnectParam MySQL配置，Type为MYSQL或TDSQL_C_MYSQL时必填
     */
    public void setMySQLConnectParam(MySQLModifyConnectParam MySQLConnectParam) {
        this.MySQLConnectParam = MySQLConnectParam;
    }

    /**
     * Get PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时必填 
     * @return PostgreSQLConnectParam PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时必填
     */
    public PostgreSQLModifyConnectParam getPostgreSQLConnectParam() {
        return this.PostgreSQLConnectParam;
    }

    /**
     * Set PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时必填
     * @param PostgreSQLConnectParam PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时必填
     */
    public void setPostgreSQLConnectParam(PostgreSQLModifyConnectParam PostgreSQLConnectParam) {
        this.PostgreSQLConnectParam = PostgreSQLConnectParam;
    }

    /**
     * Get MariaDB配置，Type为MARIADB时必填 
     * @return MariaDBConnectParam MariaDB配置，Type为MARIADB时必填
     */
    public MariaDBModifyConnectParam getMariaDBConnectParam() {
        return this.MariaDBConnectParam;
    }

    /**
     * Set MariaDB配置，Type为MARIADB时必填
     * @param MariaDBConnectParam MariaDB配置，Type为MARIADB时必填
     */
    public void setMariaDBConnectParam(MariaDBModifyConnectParam MariaDBConnectParam) {
        this.MariaDBConnectParam = MariaDBConnectParam;
    }

    /**
     * Get SQLServer配置，Type为SQLSERVER时必填 
     * @return SQLServerConnectParam SQLServer配置，Type为SQLSERVER时必填
     */
    public SQLServerModifyConnectParam getSQLServerConnectParam() {
        return this.SQLServerConnectParam;
    }

    /**
     * Set SQLServer配置，Type为SQLSERVER时必填
     * @param SQLServerConnectParam SQLServer配置，Type为SQLSERVER时必填
     */
    public void setSQLServerConnectParam(SQLServerModifyConnectParam SQLServerConnectParam) {
        this.SQLServerConnectParam = SQLServerConnectParam;
    }

    /**
     * Get Ctsdb配置，Type为CTSDB 
     * @return CtsdbConnectParam Ctsdb配置，Type为CTSDB
     */
    public CtsdbModifyConnectParam getCtsdbConnectParam() {
        return this.CtsdbConnectParam;
    }

    /**
     * Set Ctsdb配置，Type为CTSDB
     * @param CtsdbConnectParam Ctsdb配置，Type为CTSDB
     */
    public void setCtsdbConnectParam(CtsdbModifyConnectParam CtsdbConnectParam) {
        this.CtsdbConnectParam = CtsdbConnectParam;
    }

    /**
     * Get Doris配置，Type为DORIS 
     * @return DorisConnectParam Doris配置，Type为DORIS
     */
    public DorisModifyConnectParam getDorisConnectParam() {
        return this.DorisConnectParam;
    }

    /**
     * Set Doris配置，Type为DORIS
     * @param DorisConnectParam Doris配置，Type为DORIS
     */
    public void setDorisConnectParam(DorisModifyConnectParam DorisConnectParam) {
        this.DorisConnectParam = DorisConnectParam;
    }

    public ModifyConnectResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyConnectResourceRequest(ModifyConnectResourceRequest source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.DtsConnectParam != null) {
            this.DtsConnectParam = new DtsModifyConnectParam(source.DtsConnectParam);
        }
        if (source.MongoDBConnectParam != null) {
            this.MongoDBConnectParam = new MongoDBModifyConnectParam(source.MongoDBConnectParam);
        }
        if (source.EsConnectParam != null) {
            this.EsConnectParam = new EsModifyConnectParam(source.EsConnectParam);
        }
        if (source.ClickHouseConnectParam != null) {
            this.ClickHouseConnectParam = new ClickHouseModifyConnectParam(source.ClickHouseConnectParam);
        }
        if (source.MySQLConnectParam != null) {
            this.MySQLConnectParam = new MySQLModifyConnectParam(source.MySQLConnectParam);
        }
        if (source.PostgreSQLConnectParam != null) {
            this.PostgreSQLConnectParam = new PostgreSQLModifyConnectParam(source.PostgreSQLConnectParam);
        }
        if (source.MariaDBConnectParam != null) {
            this.MariaDBConnectParam = new MariaDBModifyConnectParam(source.MariaDBConnectParam);
        }
        if (source.SQLServerConnectParam != null) {
            this.SQLServerConnectParam = new SQLServerModifyConnectParam(source.SQLServerConnectParam);
        }
        if (source.CtsdbConnectParam != null) {
            this.CtsdbConnectParam = new CtsdbModifyConnectParam(source.CtsdbConnectParam);
        }
        if (source.DorisConnectParam != null) {
            this.DorisConnectParam = new DorisModifyConnectParam(source.DorisConnectParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "DtsConnectParam.", this.DtsConnectParam);
        this.setParamObj(map, prefix + "MongoDBConnectParam.", this.MongoDBConnectParam);
        this.setParamObj(map, prefix + "EsConnectParam.", this.EsConnectParam);
        this.setParamObj(map, prefix + "ClickHouseConnectParam.", this.ClickHouseConnectParam);
        this.setParamObj(map, prefix + "MySQLConnectParam.", this.MySQLConnectParam);
        this.setParamObj(map, prefix + "PostgreSQLConnectParam.", this.PostgreSQLConnectParam);
        this.setParamObj(map, prefix + "MariaDBConnectParam.", this.MariaDBConnectParam);
        this.setParamObj(map, prefix + "SQLServerConnectParam.", this.SQLServerConnectParam);
        this.setParamObj(map, prefix + "CtsdbConnectParam.", this.CtsdbConnectParam);
        this.setParamObj(map, prefix + "DorisConnectParam.", this.DorisConnectParam);

    }
}

