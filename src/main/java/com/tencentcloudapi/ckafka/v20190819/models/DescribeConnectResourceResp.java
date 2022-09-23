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

public class DescribeConnectResourceResp extends AbstractModel{

    /**
    * 连接源的Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 连接源名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 连接源描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 连接源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 连接源的状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 连接源的创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 连接源的异常信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * 连接源的当前所处步骤
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentStep")
    @Expose
    private String CurrentStep;

    /**
    * 步骤列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StepList")
    @Expose
    private String [] StepList;

    /**
    * MySQL配置，Type为MYSQL或TDSQL_C_MYSQL时返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MySQLConnectParam")
    @Expose
    private MySQLConnectParam MySQLConnectParam;

    /**
    * PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PostgreSQLConnectParam")
    @Expose
    private PostgreSQLConnectParam PostgreSQLConnectParam;

    /**
    * Dts配置，Type为DTS时返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DtsConnectParam")
    @Expose
    private DtsConnectParam DtsConnectParam;

    /**
    * MongoDB配置，Type为MONGODB时返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MongoDBConnectParam")
    @Expose
    private MongoDBConnectParam MongoDBConnectParam;

    /**
    * Es配置，Type为ES时返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EsConnectParam")
    @Expose
    private EsConnectParam EsConnectParam;

    /**
    * ClickHouse配置，Type为CLICKHOUSE时返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClickHouseConnectParam")
    @Expose
    private ClickHouseConnectParam ClickHouseConnectParam;

    /**
    * MariaDB配置，Type为MARIADB时返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MariaDBConnectParam")
    @Expose
    private MariaDBConnectParam MariaDBConnectParam;

    /**
    * SQLServer配置，Type为SQLSERVER时返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SQLServerConnectParam")
    @Expose
    private SQLServerConnectParam SQLServerConnectParam;

    /**
    * Ctsdb配置，Type为CTSDB时返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CtsdbConnectParam")
    @Expose
    private CtsdbConnectParam CtsdbConnectParam;

    /**
    * Doris 配置，Type 为 DORIS 时返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DorisConnectParam")
    @Expose
    private DorisConnectParam DorisConnectParam;

    /**
     * Get 连接源的Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceId 连接源的Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 连接源的Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceId 连接源的Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 连接源名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceName 连接源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 连接源名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceName 连接源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 连接源描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 连接源描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 连接源描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 连接源描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 连接源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 连接源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 连接源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 连接源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 连接源的状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 连接源的状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 连接源的状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 连接源的状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 连接源的创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 连接源的创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 连接源的创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 连接源的创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 连接源的异常信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMessage 连接源的异常信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 连接源的异常信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMessage 连接源的异常信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get 连接源的当前所处步骤
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentStep 连接源的当前所处步骤
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCurrentStep() {
        return this.CurrentStep;
    }

    /**
     * Set 连接源的当前所处步骤
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentStep 连接源的当前所处步骤
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentStep(String CurrentStep) {
        this.CurrentStep = CurrentStep;
    }

    /**
     * Get 步骤列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StepList 步骤列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getStepList() {
        return this.StepList;
    }

    /**
     * Set 步骤列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param StepList 步骤列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStepList(String [] StepList) {
        this.StepList = StepList;
    }

    /**
     * Get MySQL配置，Type为MYSQL或TDSQL_C_MYSQL时返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MySQLConnectParam MySQL配置，Type为MYSQL或TDSQL_C_MYSQL时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MySQLConnectParam getMySQLConnectParam() {
        return this.MySQLConnectParam;
    }

    /**
     * Set MySQL配置，Type为MYSQL或TDSQL_C_MYSQL时返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param MySQLConnectParam MySQL配置，Type为MYSQL或TDSQL_C_MYSQL时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMySQLConnectParam(MySQLConnectParam MySQLConnectParam) {
        this.MySQLConnectParam = MySQLConnectParam;
    }

    /**
     * Get PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PostgreSQLConnectParam PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PostgreSQLConnectParam getPostgreSQLConnectParam() {
        return this.PostgreSQLConnectParam;
    }

    /**
     * Set PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param PostgreSQLConnectParam PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPostgreSQLConnectParam(PostgreSQLConnectParam PostgreSQLConnectParam) {
        this.PostgreSQLConnectParam = PostgreSQLConnectParam;
    }

    /**
     * Get Dts配置，Type为DTS时返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DtsConnectParam Dts配置，Type为DTS时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DtsConnectParam getDtsConnectParam() {
        return this.DtsConnectParam;
    }

    /**
     * Set Dts配置，Type为DTS时返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param DtsConnectParam Dts配置，Type为DTS时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDtsConnectParam(DtsConnectParam DtsConnectParam) {
        this.DtsConnectParam = DtsConnectParam;
    }

    /**
     * Get MongoDB配置，Type为MONGODB时返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MongoDBConnectParam MongoDB配置，Type为MONGODB时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MongoDBConnectParam getMongoDBConnectParam() {
        return this.MongoDBConnectParam;
    }

    /**
     * Set MongoDB配置，Type为MONGODB时返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param MongoDBConnectParam MongoDB配置，Type为MONGODB时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMongoDBConnectParam(MongoDBConnectParam MongoDBConnectParam) {
        this.MongoDBConnectParam = MongoDBConnectParam;
    }

    /**
     * Get Es配置，Type为ES时返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EsConnectParam Es配置，Type为ES时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EsConnectParam getEsConnectParam() {
        return this.EsConnectParam;
    }

    /**
     * Set Es配置，Type为ES时返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param EsConnectParam Es配置，Type为ES时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEsConnectParam(EsConnectParam EsConnectParam) {
        this.EsConnectParam = EsConnectParam;
    }

    /**
     * Get ClickHouse配置，Type为CLICKHOUSE时返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClickHouseConnectParam ClickHouse配置，Type为CLICKHOUSE时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClickHouseConnectParam getClickHouseConnectParam() {
        return this.ClickHouseConnectParam;
    }

    /**
     * Set ClickHouse配置，Type为CLICKHOUSE时返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClickHouseConnectParam ClickHouse配置，Type为CLICKHOUSE时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClickHouseConnectParam(ClickHouseConnectParam ClickHouseConnectParam) {
        this.ClickHouseConnectParam = ClickHouseConnectParam;
    }

    /**
     * Get MariaDB配置，Type为MARIADB时返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MariaDBConnectParam MariaDB配置，Type为MARIADB时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MariaDBConnectParam getMariaDBConnectParam() {
        return this.MariaDBConnectParam;
    }

    /**
     * Set MariaDB配置，Type为MARIADB时返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param MariaDBConnectParam MariaDB配置，Type为MARIADB时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMariaDBConnectParam(MariaDBConnectParam MariaDBConnectParam) {
        this.MariaDBConnectParam = MariaDBConnectParam;
    }

    /**
     * Get SQLServer配置，Type为SQLSERVER时返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SQLServerConnectParam SQLServer配置，Type为SQLSERVER时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SQLServerConnectParam getSQLServerConnectParam() {
        return this.SQLServerConnectParam;
    }

    /**
     * Set SQLServer配置，Type为SQLSERVER时返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param SQLServerConnectParam SQLServer配置，Type为SQLSERVER时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSQLServerConnectParam(SQLServerConnectParam SQLServerConnectParam) {
        this.SQLServerConnectParam = SQLServerConnectParam;
    }

    /**
     * Get Ctsdb配置，Type为CTSDB时返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CtsdbConnectParam Ctsdb配置，Type为CTSDB时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CtsdbConnectParam getCtsdbConnectParam() {
        return this.CtsdbConnectParam;
    }

    /**
     * Set Ctsdb配置，Type为CTSDB时返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param CtsdbConnectParam Ctsdb配置，Type为CTSDB时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCtsdbConnectParam(CtsdbConnectParam CtsdbConnectParam) {
        this.CtsdbConnectParam = CtsdbConnectParam;
    }

    /**
     * Get Doris 配置，Type 为 DORIS 时返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DorisConnectParam Doris 配置，Type 为 DORIS 时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DorisConnectParam getDorisConnectParam() {
        return this.DorisConnectParam;
    }

    /**
     * Set Doris 配置，Type 为 DORIS 时返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param DorisConnectParam Doris 配置，Type 为 DORIS 时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDorisConnectParam(DorisConnectParam DorisConnectParam) {
        this.DorisConnectParam = DorisConnectParam;
    }

    public DescribeConnectResourceResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConnectResourceResp(DescribeConnectResourceResp source) {
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
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.CurrentStep != null) {
            this.CurrentStep = new String(source.CurrentStep);
        }
        if (source.StepList != null) {
            this.StepList = new String[source.StepList.length];
            for (int i = 0; i < source.StepList.length; i++) {
                this.StepList[i] = new String(source.StepList[i]);
            }
        }
        if (source.MySQLConnectParam != null) {
            this.MySQLConnectParam = new MySQLConnectParam(source.MySQLConnectParam);
        }
        if (source.PostgreSQLConnectParam != null) {
            this.PostgreSQLConnectParam = new PostgreSQLConnectParam(source.PostgreSQLConnectParam);
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
        if (source.MariaDBConnectParam != null) {
            this.MariaDBConnectParam = new MariaDBConnectParam(source.MariaDBConnectParam);
        }
        if (source.SQLServerConnectParam != null) {
            this.SQLServerConnectParam = new SQLServerConnectParam(source.SQLServerConnectParam);
        }
        if (source.CtsdbConnectParam != null) {
            this.CtsdbConnectParam = new CtsdbConnectParam(source.CtsdbConnectParam);
        }
        if (source.DorisConnectParam != null) {
            this.DorisConnectParam = new DorisConnectParam(source.DorisConnectParam);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "CurrentStep", this.CurrentStep);
        this.setParamArraySimple(map, prefix + "StepList.", this.StepList);
        this.setParamObj(map, prefix + "MySQLConnectParam.", this.MySQLConnectParam);
        this.setParamObj(map, prefix + "PostgreSQLConnectParam.", this.PostgreSQLConnectParam);
        this.setParamObj(map, prefix + "DtsConnectParam.", this.DtsConnectParam);
        this.setParamObj(map, prefix + "MongoDBConnectParam.", this.MongoDBConnectParam);
        this.setParamObj(map, prefix + "EsConnectParam.", this.EsConnectParam);
        this.setParamObj(map, prefix + "ClickHouseConnectParam.", this.ClickHouseConnectParam);
        this.setParamObj(map, prefix + "MariaDBConnectParam.", this.MariaDBConnectParam);
        this.setParamObj(map, prefix + "SQLServerConnectParam.", this.SQLServerConnectParam);
        this.setParamObj(map, prefix + "CtsdbConnectParam.", this.CtsdbConnectParam);
        this.setParamObj(map, prefix + "DorisConnectParam.", this.DorisConnectParam);

    }
}

