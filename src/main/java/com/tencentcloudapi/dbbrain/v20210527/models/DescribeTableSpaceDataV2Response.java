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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTableSpaceDataV2Response extends AbstractModel {

    /**
    * <p>MySQL 系列产品表空间数据。当产品为 mysql/cynosdb/tdsql/dcdb/mariadb 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MysqlTableSpaceData")
    @Expose
    private MysqlSpaceObjectItem MysqlTableSpaceData;

    /**
    * <p>PostgreSQL 产品表空间数据。当产品为 postgres 时返回。字段语义与 MySQL 不同：使用 RelationSize / TableSize / IndexSize / TotalRelationSize / TableBloat 等 PG 特有指标。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PostgresTableSpaceData")
    @Expose
    private PostgresSpaceObjectItem PostgresTableSpaceData;

    /**
    * <p>MongoDB 产品表空间数据。当产品为 mongodb 时返回。包含集合级明细数组 SpaceSchemas 以及外层采集时间戳 Timestamp（秒级）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MongodbTableSpaceData")
    @Expose
    private MongodbSpaceObjectItem MongodbTableSpaceData;

    /**
    * <p>SQL Server 产品表空间数据。当产品为 sqlserver 时返回。字段结构与 MysqlSpaceObjectItem 同构，无 FragRatio / PhysicalFileSize。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlServerTableSpaceData")
    @Expose
    private SqlServerSpaceObjectItem SqlServerTableSpaceData;

    /**
    * <p>数据采集时间戳（秒）。可能为空（部分产品分支/异常场景下不保证返回），调用方请做空值兼容。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>MySQL 系列产品表空间数据。当产品为 mysql/cynosdb/tdsql/dcdb/mariadb 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MysqlTableSpaceData <p>MySQL 系列产品表空间数据。当产品为 mysql/cynosdb/tdsql/dcdb/mariadb 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MysqlSpaceObjectItem getMysqlTableSpaceData() {
        return this.MysqlTableSpaceData;
    }

    /**
     * Set <p>MySQL 系列产品表空间数据。当产品为 mysql/cynosdb/tdsql/dcdb/mariadb 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MysqlTableSpaceData <p>MySQL 系列产品表空间数据。当产品为 mysql/cynosdb/tdsql/dcdb/mariadb 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMysqlTableSpaceData(MysqlSpaceObjectItem MysqlTableSpaceData) {
        this.MysqlTableSpaceData = MysqlTableSpaceData;
    }

    /**
     * Get <p>PostgreSQL 产品表空间数据。当产品为 postgres 时返回。字段语义与 MySQL 不同：使用 RelationSize / TableSize / IndexSize / TotalRelationSize / TableBloat 等 PG 特有指标。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PostgresTableSpaceData <p>PostgreSQL 产品表空间数据。当产品为 postgres 时返回。字段语义与 MySQL 不同：使用 RelationSize / TableSize / IndexSize / TotalRelationSize / TableBloat 等 PG 特有指标。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PostgresSpaceObjectItem getPostgresTableSpaceData() {
        return this.PostgresTableSpaceData;
    }

    /**
     * Set <p>PostgreSQL 产品表空间数据。当产品为 postgres 时返回。字段语义与 MySQL 不同：使用 RelationSize / TableSize / IndexSize / TotalRelationSize / TableBloat 等 PG 特有指标。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PostgresTableSpaceData <p>PostgreSQL 产品表空间数据。当产品为 postgres 时返回。字段语义与 MySQL 不同：使用 RelationSize / TableSize / IndexSize / TotalRelationSize / TableBloat 等 PG 特有指标。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPostgresTableSpaceData(PostgresSpaceObjectItem PostgresTableSpaceData) {
        this.PostgresTableSpaceData = PostgresTableSpaceData;
    }

    /**
     * Get <p>MongoDB 产品表空间数据。当产品为 mongodb 时返回。包含集合级明细数组 SpaceSchemas 以及外层采集时间戳 Timestamp（秒级）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MongodbTableSpaceData <p>MongoDB 产品表空间数据。当产品为 mongodb 时返回。包含集合级明细数组 SpaceSchemas 以及外层采集时间戳 Timestamp（秒级）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MongodbSpaceObjectItem getMongodbTableSpaceData() {
        return this.MongodbTableSpaceData;
    }

    /**
     * Set <p>MongoDB 产品表空间数据。当产品为 mongodb 时返回。包含集合级明细数组 SpaceSchemas 以及外层采集时间戳 Timestamp（秒级）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MongodbTableSpaceData <p>MongoDB 产品表空间数据。当产品为 mongodb 时返回。包含集合级明细数组 SpaceSchemas 以及外层采集时间戳 Timestamp（秒级）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMongodbTableSpaceData(MongodbSpaceObjectItem MongodbTableSpaceData) {
        this.MongodbTableSpaceData = MongodbTableSpaceData;
    }

    /**
     * Get <p>SQL Server 产品表空间数据。当产品为 sqlserver 时返回。字段结构与 MysqlSpaceObjectItem 同构，无 FragRatio / PhysicalFileSize。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlServerTableSpaceData <p>SQL Server 产品表空间数据。当产品为 sqlserver 时返回。字段结构与 MysqlSpaceObjectItem 同构，无 FragRatio / PhysicalFileSize。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SqlServerSpaceObjectItem getSqlServerTableSpaceData() {
        return this.SqlServerTableSpaceData;
    }

    /**
     * Set <p>SQL Server 产品表空间数据。当产品为 sqlserver 时返回。字段结构与 MysqlSpaceObjectItem 同构，无 FragRatio / PhysicalFileSize。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlServerTableSpaceData <p>SQL Server 产品表空间数据。当产品为 sqlserver 时返回。字段结构与 MysqlSpaceObjectItem 同构，无 FragRatio / PhysicalFileSize。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlServerTableSpaceData(SqlServerSpaceObjectItem SqlServerTableSpaceData) {
        this.SqlServerTableSpaceData = SqlServerTableSpaceData;
    }

    /**
     * Get <p>数据采集时间戳（秒）。可能为空（部分产品分支/异常场景下不保证返回），调用方请做空值兼容。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timestamp <p>数据采集时间戳（秒）。可能为空（部分产品分支/异常场景下不保证返回），调用方请做空值兼容。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set <p>数据采集时间戳（秒）。可能为空（部分产品分支/异常场景下不保证返回），调用方请做空值兼容。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timestamp <p>数据采集时间戳（秒）。可能为空（部分产品分支/异常场景下不保证返回），调用方请做空值兼容。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeTableSpaceDataV2Response() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTableSpaceDataV2Response(DescribeTableSpaceDataV2Response source) {
        if (source.MysqlTableSpaceData != null) {
            this.MysqlTableSpaceData = new MysqlSpaceObjectItem(source.MysqlTableSpaceData);
        }
        if (source.PostgresTableSpaceData != null) {
            this.PostgresTableSpaceData = new PostgresSpaceObjectItem(source.PostgresTableSpaceData);
        }
        if (source.MongodbTableSpaceData != null) {
            this.MongodbTableSpaceData = new MongodbSpaceObjectItem(source.MongodbTableSpaceData);
        }
        if (source.SqlServerTableSpaceData != null) {
            this.SqlServerTableSpaceData = new SqlServerSpaceObjectItem(source.SqlServerTableSpaceData);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "MysqlTableSpaceData.", this.MysqlTableSpaceData);
        this.setParamObj(map, prefix + "PostgresTableSpaceData.", this.PostgresTableSpaceData);
        this.setParamObj(map, prefix + "MongodbTableSpaceData.", this.MongodbTableSpaceData);
        this.setParamObj(map, prefix + "SqlServerTableSpaceData.", this.SqlServerTableSpaceData);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

