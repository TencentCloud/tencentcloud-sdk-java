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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListDataSourcesRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 返回数量，默认10
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 页码，默认1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 数据源名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 数据源展示名
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 数据源类型:枚举值

- MYSQL
- TENCENT_MYSQL
- POSTGRE
- ORACLE
- SQLSERVER
- FTP
- HIVE
- HUDI
- HDFS
- ICEBERG
- KAFKA
- HBASE
- SPARK
- VIRTUAL
- TBASE
- DB2
- DM
- GAUSSDB
- GBASE
- IMPALA
- ES
- TENCENT_ES
- GREENPLUM
- PHOENIX
- SAP_HANA
- SFTP
- OCEANBASE
- CLICKHOUSE
- KUDU
- VERTICA
- REDIS
- COS
- DLC
- DORIS
- CKAFKA
- S3
- TDSQL
- TDSQL_MYSQL
- MONGODB
- TENCENT_MONGODB
- REST_API
- SuperSQL
- PRESTO
- TiDB
- StarRocks
- Trino
- Kyuubi
- TCHOUSE_X
- TCHOUSE_P
- TCHOUSE_C
- TCHOUSE_D
- INFLUXDB
- BIG_QUERY
- SSH
- BLOB
    */
    @SerializedName("Type")
    @Expose
    private String [] Type;

    /**
    * 创建人
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 返回数量，默认10 
     * @return PageSize 返回数量，默认10
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 返回数量，默认10
     * @param PageSize 返回数量，默认10
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 页码，默认1 
     * @return PageNumber 页码，默认1
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码，默认1
     * @param PageNumber 页码，默认1
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 数据源名称 
     * @return Name 数据源名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 数据源名称
     * @param Name 数据源名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 数据源展示名 
     * @return DisplayName 数据源展示名
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 数据源展示名
     * @param DisplayName 数据源展示名
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 数据源类型:枚举值

- MYSQL
- TENCENT_MYSQL
- POSTGRE
- ORACLE
- SQLSERVER
- FTP
- HIVE
- HUDI
- HDFS
- ICEBERG
- KAFKA
- HBASE
- SPARK
- VIRTUAL
- TBASE
- DB2
- DM
- GAUSSDB
- GBASE
- IMPALA
- ES
- TENCENT_ES
- GREENPLUM
- PHOENIX
- SAP_HANA
- SFTP
- OCEANBASE
- CLICKHOUSE
- KUDU
- VERTICA
- REDIS
- COS
- DLC
- DORIS
- CKAFKA
- S3
- TDSQL
- TDSQL_MYSQL
- MONGODB
- TENCENT_MONGODB
- REST_API
- SuperSQL
- PRESTO
- TiDB
- StarRocks
- Trino
- Kyuubi
- TCHOUSE_X
- TCHOUSE_P
- TCHOUSE_C
- TCHOUSE_D
- INFLUXDB
- BIG_QUERY
- SSH
- BLOB 
     * @return Type 数据源类型:枚举值

- MYSQL
- TENCENT_MYSQL
- POSTGRE
- ORACLE
- SQLSERVER
- FTP
- HIVE
- HUDI
- HDFS
- ICEBERG
- KAFKA
- HBASE
- SPARK
- VIRTUAL
- TBASE
- DB2
- DM
- GAUSSDB
- GBASE
- IMPALA
- ES
- TENCENT_ES
- GREENPLUM
- PHOENIX
- SAP_HANA
- SFTP
- OCEANBASE
- CLICKHOUSE
- KUDU
- VERTICA
- REDIS
- COS
- DLC
- DORIS
- CKAFKA
- S3
- TDSQL
- TDSQL_MYSQL
- MONGODB
- TENCENT_MONGODB
- REST_API
- SuperSQL
- PRESTO
- TiDB
- StarRocks
- Trino
- Kyuubi
- TCHOUSE_X
- TCHOUSE_P
- TCHOUSE_C
- TCHOUSE_D
- INFLUXDB
- BIG_QUERY
- SSH
- BLOB
     */
    public String [] getType() {
        return this.Type;
    }

    /**
     * Set 数据源类型:枚举值

- MYSQL
- TENCENT_MYSQL
- POSTGRE
- ORACLE
- SQLSERVER
- FTP
- HIVE
- HUDI
- HDFS
- ICEBERG
- KAFKA
- HBASE
- SPARK
- VIRTUAL
- TBASE
- DB2
- DM
- GAUSSDB
- GBASE
- IMPALA
- ES
- TENCENT_ES
- GREENPLUM
- PHOENIX
- SAP_HANA
- SFTP
- OCEANBASE
- CLICKHOUSE
- KUDU
- VERTICA
- REDIS
- COS
- DLC
- DORIS
- CKAFKA
- S3
- TDSQL
- TDSQL_MYSQL
- MONGODB
- TENCENT_MONGODB
- REST_API
- SuperSQL
- PRESTO
- TiDB
- StarRocks
- Trino
- Kyuubi
- TCHOUSE_X
- TCHOUSE_P
- TCHOUSE_C
- TCHOUSE_D
- INFLUXDB
- BIG_QUERY
- SSH
- BLOB
     * @param Type 数据源类型:枚举值

- MYSQL
- TENCENT_MYSQL
- POSTGRE
- ORACLE
- SQLSERVER
- FTP
- HIVE
- HUDI
- HDFS
- ICEBERG
- KAFKA
- HBASE
- SPARK
- VIRTUAL
- TBASE
- DB2
- DM
- GAUSSDB
- GBASE
- IMPALA
- ES
- TENCENT_ES
- GREENPLUM
- PHOENIX
- SAP_HANA
- SFTP
- OCEANBASE
- CLICKHOUSE
- KUDU
- VERTICA
- REDIS
- COS
- DLC
- DORIS
- CKAFKA
- S3
- TDSQL
- TDSQL_MYSQL
- MONGODB
- TENCENT_MONGODB
- REST_API
- SuperSQL
- PRESTO
- TiDB
- StarRocks
- Trino
- Kyuubi
- TCHOUSE_X
- TCHOUSE_P
- TCHOUSE_C
- TCHOUSE_D
- INFLUXDB
- BIG_QUERY
- SSH
- BLOB
     */
    public void setType(String [] Type) {
        this.Type = Type;
    }

    /**
     * Get 创建人 
     * @return Creator 创建人
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建人
     * @param Creator 创建人
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    public ListDataSourcesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListDataSourcesRequest(ListDataSourcesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Type != null) {
            this.Type = new String[source.Type.length];
            for (int i = 0; i < source.Type.length; i++) {
                this.Type[i] = new String(source.Type[i]);
            }
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamArraySimple(map, prefix + "Type.", this.Type);
        this.setParamSimple(map, prefix + "Creator", this.Creator);

    }
}

