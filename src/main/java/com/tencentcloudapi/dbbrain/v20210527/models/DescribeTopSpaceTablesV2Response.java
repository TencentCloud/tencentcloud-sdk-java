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

public class DescribeTopSpaceTablesV2Response extends AbstractModel {

    /**
    * <p>MySQL/PG/TDSQL 系列产品表级空间对象列表。当产品为 mysql/cynosdb/tdsql/dcdb/mariadb/postgres 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MysqlObjects")
    @Expose
    private MysqlSpaceObjectItem [] MysqlObjects;

    /**
    * <p>PostgreSQL 产品表级空间对象列表。当产品为 postgres 时返回。字段语义与 MySQL 不同：使用 RelationSize / TableSize / IndexSize / TotalRelationSize / TableBloat 等 PG 特有指标。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PostgresObjects")
    @Expose
    private PostgresSpaceObjectItem [] PostgresObjects;

    /**
    * <p>MongoDB 产品表级（集合级）空间对象列表。当产品为 mongodb 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MongodbObjects")
    @Expose
    private MongoDBTableSpaceItem [] MongodbObjects;

    /**
    * <p>数据采集时间戳（秒）。</p>
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
     * Get <p>MySQL/PG/TDSQL 系列产品表级空间对象列表。当产品为 mysql/cynosdb/tdsql/dcdb/mariadb/postgres 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MysqlObjects <p>MySQL/PG/TDSQL 系列产品表级空间对象列表。当产品为 mysql/cynosdb/tdsql/dcdb/mariadb/postgres 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MysqlSpaceObjectItem [] getMysqlObjects() {
        return this.MysqlObjects;
    }

    /**
     * Set <p>MySQL/PG/TDSQL 系列产品表级空间对象列表。当产品为 mysql/cynosdb/tdsql/dcdb/mariadb/postgres 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MysqlObjects <p>MySQL/PG/TDSQL 系列产品表级空间对象列表。当产品为 mysql/cynosdb/tdsql/dcdb/mariadb/postgres 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMysqlObjects(MysqlSpaceObjectItem [] MysqlObjects) {
        this.MysqlObjects = MysqlObjects;
    }

    /**
     * Get <p>PostgreSQL 产品表级空间对象列表。当产品为 postgres 时返回。字段语义与 MySQL 不同：使用 RelationSize / TableSize / IndexSize / TotalRelationSize / TableBloat 等 PG 特有指标。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PostgresObjects <p>PostgreSQL 产品表级空间对象列表。当产品为 postgres 时返回。字段语义与 MySQL 不同：使用 RelationSize / TableSize / IndexSize / TotalRelationSize / TableBloat 等 PG 特有指标。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PostgresSpaceObjectItem [] getPostgresObjects() {
        return this.PostgresObjects;
    }

    /**
     * Set <p>PostgreSQL 产品表级空间对象列表。当产品为 postgres 时返回。字段语义与 MySQL 不同：使用 RelationSize / TableSize / IndexSize / TotalRelationSize / TableBloat 等 PG 特有指标。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PostgresObjects <p>PostgreSQL 产品表级空间对象列表。当产品为 postgres 时返回。字段语义与 MySQL 不同：使用 RelationSize / TableSize / IndexSize / TotalRelationSize / TableBloat 等 PG 特有指标。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPostgresObjects(PostgresSpaceObjectItem [] PostgresObjects) {
        this.PostgresObjects = PostgresObjects;
    }

    /**
     * Get <p>MongoDB 产品表级（集合级）空间对象列表。当产品为 mongodb 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MongodbObjects <p>MongoDB 产品表级（集合级）空间对象列表。当产品为 mongodb 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MongoDBTableSpaceItem [] getMongodbObjects() {
        return this.MongodbObjects;
    }

    /**
     * Set <p>MongoDB 产品表级（集合级）空间对象列表。当产品为 mongodb 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MongodbObjects <p>MongoDB 产品表级（集合级）空间对象列表。当产品为 mongodb 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMongodbObjects(MongoDBTableSpaceItem [] MongodbObjects) {
        this.MongodbObjects = MongodbObjects;
    }

    /**
     * Get <p>数据采集时间戳（秒）。</p> 
     * @return Timestamp <p>数据采集时间戳（秒）。</p>
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set <p>数据采集时间戳（秒）。</p>
     * @param Timestamp <p>数据采集时间戳（秒）。</p>
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

    public DescribeTopSpaceTablesV2Response() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopSpaceTablesV2Response(DescribeTopSpaceTablesV2Response source) {
        if (source.MysqlObjects != null) {
            this.MysqlObjects = new MysqlSpaceObjectItem[source.MysqlObjects.length];
            for (int i = 0; i < source.MysqlObjects.length; i++) {
                this.MysqlObjects[i] = new MysqlSpaceObjectItem(source.MysqlObjects[i]);
            }
        }
        if (source.PostgresObjects != null) {
            this.PostgresObjects = new PostgresSpaceObjectItem[source.PostgresObjects.length];
            for (int i = 0; i < source.PostgresObjects.length; i++) {
                this.PostgresObjects[i] = new PostgresSpaceObjectItem(source.PostgresObjects[i]);
            }
        }
        if (source.MongodbObjects != null) {
            this.MongodbObjects = new MongoDBTableSpaceItem[source.MongodbObjects.length];
            for (int i = 0; i < source.MongodbObjects.length; i++) {
                this.MongodbObjects[i] = new MongoDBTableSpaceItem(source.MongodbObjects[i]);
            }
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
        this.setParamArrayObj(map, prefix + "MysqlObjects.", this.MysqlObjects);
        this.setParamArrayObj(map, prefix + "PostgresObjects.", this.PostgresObjects);
        this.setParamArrayObj(map, prefix + "MongodbObjects.", this.MongodbObjects);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

