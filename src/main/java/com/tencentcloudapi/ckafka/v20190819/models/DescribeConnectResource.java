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

public class DescribeConnectResource extends AbstractModel {

    /**
    * <p>连接源的Id</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>连接源名称</p>
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * <p>连接源描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>连接源类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>连接源的状态</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>连接源的创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>连接源的异常信息</p>
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * <p>该连接源关联的Datahub任务数</p>
    */
    @SerializedName("DatahubTaskCount")
    @Expose
    private Long DatahubTaskCount;

    /**
    * <p>连接源的当前所处步骤</p>
    */
    @SerializedName("CurrentStep")
    @Expose
    private String CurrentStep;

    /**
    * <p>创建进度百分比</p>
    */
    @SerializedName("TaskProgress")
    @Expose
    private Float TaskProgress;

    /**
    * <p>步骤列表</p>
    */
    @SerializedName("StepList")
    @Expose
    private String [] StepList;

    /**
    * <p>Dts配置，Type为DTS时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DtsConnectParam")
    @Expose
    private DtsConnectParam DtsConnectParam;

    /**
    * <p>MongoDB配置，Type为MONGODB时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MongoDBConnectParam")
    @Expose
    private MongoDBConnectParam MongoDBConnectParam;

    /**
    * <p>Es配置，Type为ES时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EsConnectParam")
    @Expose
    private EsConnectParam EsConnectParam;

    /**
    * <p>ClickHouse配置，Type为CLICKHOUSE时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClickHouseConnectParam")
    @Expose
    private ClickHouseConnectParam ClickHouseConnectParam;

    /**
    * <p>MySQL配置，Type为MYSQL或TDSQL_C_MYSQL时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MySQLConnectParam")
    @Expose
    private MySQLConnectParam MySQLConnectParam;

    /**
    * <p>PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PostgreSQLConnectParam")
    @Expose
    private PostgreSQLConnectParam PostgreSQLConnectParam;

    /**
    * <p>MariaDB配置，Type为MARIADB时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MariaDBConnectParam")
    @Expose
    private MariaDBConnectParam MariaDBConnectParam;

    /**
    * <p>SQLServer配置，Type为SQLSERVER时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SQLServerConnectParam")
    @Expose
    private SQLServerConnectParam SQLServerConnectParam;

    /**
    * <p>Ctsdb配置，Type为CTSDB时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CtsdbConnectParam")
    @Expose
    private CtsdbConnectParam CtsdbConnectParam;

    /**
    * <p>Doris 配置，Type 为 DORIS 时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DorisConnectParam")
    @Expose
    private DorisConnectParam DorisConnectParam;

    /**
    * <p>Kafka配置，Type 为 KAFKA 时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KafkaConnectParam")
    @Expose
    private KafkaConnectParam KafkaConnectParam;

    /**
    * <p>MQTT配置，Type 为 MQTT 时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get <p>连接源的Id</p> 
     * @return ResourceId <p>连接源的Id</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>连接源的Id</p>
     * @param ResourceId <p>连接源的Id</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

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
     * Get <p>连接源的状态</p> 
     * @return Status <p>连接源的状态</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>连接源的状态</p>
     * @param Status <p>连接源的状态</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>连接源的创建时间</p> 
     * @return CreateTime <p>连接源的创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>连接源的创建时间</p>
     * @param CreateTime <p>连接源的创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>连接源的异常信息</p> 
     * @return ErrorMessage <p>连接源的异常信息</p>
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>连接源的异常信息</p>
     * @param ErrorMessage <p>连接源的异常信息</p>
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get <p>该连接源关联的Datahub任务数</p> 
     * @return DatahubTaskCount <p>该连接源关联的Datahub任务数</p>
     */
    public Long getDatahubTaskCount() {
        return this.DatahubTaskCount;
    }

    /**
     * Set <p>该连接源关联的Datahub任务数</p>
     * @param DatahubTaskCount <p>该连接源关联的Datahub任务数</p>
     */
    public void setDatahubTaskCount(Long DatahubTaskCount) {
        this.DatahubTaskCount = DatahubTaskCount;
    }

    /**
     * Get <p>连接源的当前所处步骤</p> 
     * @return CurrentStep <p>连接源的当前所处步骤</p>
     */
    public String getCurrentStep() {
        return this.CurrentStep;
    }

    /**
     * Set <p>连接源的当前所处步骤</p>
     * @param CurrentStep <p>连接源的当前所处步骤</p>
     */
    public void setCurrentStep(String CurrentStep) {
        this.CurrentStep = CurrentStep;
    }

    /**
     * Get <p>创建进度百分比</p> 
     * @return TaskProgress <p>创建进度百分比</p>
     */
    public Float getTaskProgress() {
        return this.TaskProgress;
    }

    /**
     * Set <p>创建进度百分比</p>
     * @param TaskProgress <p>创建进度百分比</p>
     */
    public void setTaskProgress(Float TaskProgress) {
        this.TaskProgress = TaskProgress;
    }

    /**
     * Get <p>步骤列表</p> 
     * @return StepList <p>步骤列表</p>
     */
    public String [] getStepList() {
        return this.StepList;
    }

    /**
     * Set <p>步骤列表</p>
     * @param StepList <p>步骤列表</p>
     */
    public void setStepList(String [] StepList) {
        this.StepList = StepList;
    }

    /**
     * Get <p>Dts配置，Type为DTS时返回</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DtsConnectParam <p>Dts配置，Type为DTS时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DtsConnectParam getDtsConnectParam() {
        return this.DtsConnectParam;
    }

    /**
     * Set <p>Dts配置，Type为DTS时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DtsConnectParam <p>Dts配置，Type为DTS时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDtsConnectParam(DtsConnectParam DtsConnectParam) {
        this.DtsConnectParam = DtsConnectParam;
    }

    /**
     * Get <p>MongoDB配置，Type为MONGODB时返回</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MongoDBConnectParam <p>MongoDB配置，Type为MONGODB时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MongoDBConnectParam getMongoDBConnectParam() {
        return this.MongoDBConnectParam;
    }

    /**
     * Set <p>MongoDB配置，Type为MONGODB时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MongoDBConnectParam <p>MongoDB配置，Type为MONGODB时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMongoDBConnectParam(MongoDBConnectParam MongoDBConnectParam) {
        this.MongoDBConnectParam = MongoDBConnectParam;
    }

    /**
     * Get <p>Es配置，Type为ES时返回</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EsConnectParam <p>Es配置，Type为ES时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EsConnectParam getEsConnectParam() {
        return this.EsConnectParam;
    }

    /**
     * Set <p>Es配置，Type为ES时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EsConnectParam <p>Es配置，Type为ES时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEsConnectParam(EsConnectParam EsConnectParam) {
        this.EsConnectParam = EsConnectParam;
    }

    /**
     * Get <p>ClickHouse配置，Type为CLICKHOUSE时返回</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClickHouseConnectParam <p>ClickHouse配置，Type为CLICKHOUSE时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClickHouseConnectParam getClickHouseConnectParam() {
        return this.ClickHouseConnectParam;
    }

    /**
     * Set <p>ClickHouse配置，Type为CLICKHOUSE时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClickHouseConnectParam <p>ClickHouse配置，Type为CLICKHOUSE时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClickHouseConnectParam(ClickHouseConnectParam ClickHouseConnectParam) {
        this.ClickHouseConnectParam = ClickHouseConnectParam;
    }

    /**
     * Get <p>MySQL配置，Type为MYSQL或TDSQL_C_MYSQL时返回</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MySQLConnectParam <p>MySQL配置，Type为MYSQL或TDSQL_C_MYSQL时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MySQLConnectParam getMySQLConnectParam() {
        return this.MySQLConnectParam;
    }

    /**
     * Set <p>MySQL配置，Type为MYSQL或TDSQL_C_MYSQL时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MySQLConnectParam <p>MySQL配置，Type为MYSQL或TDSQL_C_MYSQL时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMySQLConnectParam(MySQLConnectParam MySQLConnectParam) {
        this.MySQLConnectParam = MySQLConnectParam;
    }

    /**
     * Get <p>PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时返回</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PostgreSQLConnectParam <p>PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PostgreSQLConnectParam getPostgreSQLConnectParam() {
        return this.PostgreSQLConnectParam;
    }

    /**
     * Set <p>PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PostgreSQLConnectParam <p>PostgreSQL配置，Type为POSTGRESQL或TDSQL_C_POSTGRESQL时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPostgreSQLConnectParam(PostgreSQLConnectParam PostgreSQLConnectParam) {
        this.PostgreSQLConnectParam = PostgreSQLConnectParam;
    }

    /**
     * Get <p>MariaDB配置，Type为MARIADB时返回</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MariaDBConnectParam <p>MariaDB配置，Type为MARIADB时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MariaDBConnectParam getMariaDBConnectParam() {
        return this.MariaDBConnectParam;
    }

    /**
     * Set <p>MariaDB配置，Type为MARIADB时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MariaDBConnectParam <p>MariaDB配置，Type为MARIADB时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMariaDBConnectParam(MariaDBConnectParam MariaDBConnectParam) {
        this.MariaDBConnectParam = MariaDBConnectParam;
    }

    /**
     * Get <p>SQLServer配置，Type为SQLSERVER时返回</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SQLServerConnectParam <p>SQLServer配置，Type为SQLSERVER时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SQLServerConnectParam getSQLServerConnectParam() {
        return this.SQLServerConnectParam;
    }

    /**
     * Set <p>SQLServer配置，Type为SQLSERVER时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SQLServerConnectParam <p>SQLServer配置，Type为SQLSERVER时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSQLServerConnectParam(SQLServerConnectParam SQLServerConnectParam) {
        this.SQLServerConnectParam = SQLServerConnectParam;
    }

    /**
     * Get <p>Ctsdb配置，Type为CTSDB时返回</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CtsdbConnectParam <p>Ctsdb配置，Type为CTSDB时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CtsdbConnectParam getCtsdbConnectParam() {
        return this.CtsdbConnectParam;
    }

    /**
     * Set <p>Ctsdb配置，Type为CTSDB时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CtsdbConnectParam <p>Ctsdb配置，Type为CTSDB时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCtsdbConnectParam(CtsdbConnectParam CtsdbConnectParam) {
        this.CtsdbConnectParam = CtsdbConnectParam;
    }

    /**
     * Get <p>Doris 配置，Type 为 DORIS 时返回</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DorisConnectParam <p>Doris 配置，Type 为 DORIS 时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DorisConnectParam getDorisConnectParam() {
        return this.DorisConnectParam;
    }

    /**
     * Set <p>Doris 配置，Type 为 DORIS 时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DorisConnectParam <p>Doris 配置，Type 为 DORIS 时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDorisConnectParam(DorisConnectParam DorisConnectParam) {
        this.DorisConnectParam = DorisConnectParam;
    }

    /**
     * Get <p>Kafka配置，Type 为 KAFKA 时返回</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KafkaConnectParam <p>Kafka配置，Type 为 KAFKA 时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KafkaConnectParam getKafkaConnectParam() {
        return this.KafkaConnectParam;
    }

    /**
     * Set <p>Kafka配置，Type 为 KAFKA 时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KafkaConnectParam <p>Kafka配置，Type 为 KAFKA 时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKafkaConnectParam(KafkaConnectParam KafkaConnectParam) {
        this.KafkaConnectParam = KafkaConnectParam;
    }

    /**
     * Get <p>MQTT配置，Type 为 MQTT 时返回</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MqttConnectParam <p>MQTT配置，Type 为 MQTT 时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MqttConnectParam getMqttConnectParam() {
        return this.MqttConnectParam;
    }

    /**
     * Set <p>MQTT配置，Type 为 MQTT 时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MqttConnectParam <p>MQTT配置，Type 为 MQTT 时返回</p>
注意：此字段可能返回 null，表示取不到有效值。
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

    public DescribeConnectResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConnectResource(DescribeConnectResource source) {
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
        if (source.DatahubTaskCount != null) {
            this.DatahubTaskCount = new Long(source.DatahubTaskCount);
        }
        if (source.CurrentStep != null) {
            this.CurrentStep = new String(source.CurrentStep);
        }
        if (source.TaskProgress != null) {
            this.TaskProgress = new Float(source.TaskProgress);
        }
        if (source.StepList != null) {
            this.StepList = new String[source.StepList.length];
            for (int i = 0; i < source.StepList.length; i++) {
                this.StepList[i] = new String(source.StepList[i]);
            }
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
        if (source.CtsdbConnectParam != null) {
            this.CtsdbConnectParam = new CtsdbConnectParam(source.CtsdbConnectParam);
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
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "DatahubTaskCount", this.DatahubTaskCount);
        this.setParamSimple(map, prefix + "CurrentStep", this.CurrentStep);
        this.setParamSimple(map, prefix + "TaskProgress", this.TaskProgress);
        this.setParamArraySimple(map, prefix + "StepList.", this.StepList);
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
        this.setParamObj(map, prefix + "KafkaConnectParam.", this.KafkaConnectParam);
        this.setParamObj(map, prefix + "MqttConnectParam.", this.MqttConnectParam);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

