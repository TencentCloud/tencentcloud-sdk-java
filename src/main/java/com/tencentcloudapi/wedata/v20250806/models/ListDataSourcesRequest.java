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
    * <p>项目id</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>返回数量，默认10</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>页码，默认1</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>数据源名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>数据源展示名</p>
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * <p>数据源类型:枚举值</p><ul><li>MYSQL</li><li>TENCENT_MYSQL</li><li>POSTGRE</li><li>ORACLE</li><li>SQLSERVER</li><li>FTP</li><li>HIVE</li><li>HUDI</li><li>HDFS</li><li>ICEBERG</li><li>KAFKA</li><li>HBASE</li><li>SPARK</li><li>VIRTUAL</li><li>TBASE</li><li>DB2</li><li>DM</li><li>GAUSSDB</li><li>GBASE</li><li>IMPALA</li><li>ES</li><li>TENCENT_ES</li><li>GREENPLUM</li><li>PHOENIX</li><li>SAP_HANA</li><li>SFTP</li><li>OCEANBASE</li><li>CLICKHOUSE</li><li>KUDU</li><li>VERTICA</li><li>REDIS</li><li>COS</li><li>DLC</li><li>DORIS</li><li>CKAFKA</li><li>S3</li><li>TDSQL</li><li>TDSQL_MYSQL</li><li>MONGODB</li><li>TENCENT_MONGODB</li><li>REST_API</li><li>SuperSQL</li><li>PRESTO</li><li>TiDB</li><li>StarRocks</li><li>Trino</li><li>Kyuubi</li><li>TCHOUSE_X</li><li>TCHOUSE_P</li><li>TCHOUSE_C</li><li>TCHOUSE_D</li><li>INFLUXDB</li><li>BIG_QUERY</li><li>SSH</li><li>BLOB</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String [] Type;

    /**
    * <p>创建人</p>
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
     * Get <p>项目id</p> 
     * @return ProjectId <p>项目id</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目id</p>
     * @param ProjectId <p>项目id</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>返回数量，默认10</p> 
     * @return PageSize <p>返回数量，默认10</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>返回数量，默认10</p>
     * @param PageSize <p>返回数量，默认10</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>页码，默认1</p> 
     * @return PageNumber <p>页码，默认1</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页码，默认1</p>
     * @param PageNumber <p>页码，默认1</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>数据源名称</p> 
     * @return Name <p>数据源名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>数据源名称</p>
     * @param Name <p>数据源名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>数据源展示名</p> 
     * @return DisplayName <p>数据源展示名</p>
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set <p>数据源展示名</p>
     * @param DisplayName <p>数据源展示名</p>
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get <p>数据源类型:枚举值</p><ul><li>MYSQL</li><li>TENCENT_MYSQL</li><li>POSTGRE</li><li>ORACLE</li><li>SQLSERVER</li><li>FTP</li><li>HIVE</li><li>HUDI</li><li>HDFS</li><li>ICEBERG</li><li>KAFKA</li><li>HBASE</li><li>SPARK</li><li>VIRTUAL</li><li>TBASE</li><li>DB2</li><li>DM</li><li>GAUSSDB</li><li>GBASE</li><li>IMPALA</li><li>ES</li><li>TENCENT_ES</li><li>GREENPLUM</li><li>PHOENIX</li><li>SAP_HANA</li><li>SFTP</li><li>OCEANBASE</li><li>CLICKHOUSE</li><li>KUDU</li><li>VERTICA</li><li>REDIS</li><li>COS</li><li>DLC</li><li>DORIS</li><li>CKAFKA</li><li>S3</li><li>TDSQL</li><li>TDSQL_MYSQL</li><li>MONGODB</li><li>TENCENT_MONGODB</li><li>REST_API</li><li>SuperSQL</li><li>PRESTO</li><li>TiDB</li><li>StarRocks</li><li>Trino</li><li>Kyuubi</li><li>TCHOUSE_X</li><li>TCHOUSE_P</li><li>TCHOUSE_C</li><li>TCHOUSE_D</li><li>INFLUXDB</li><li>BIG_QUERY</li><li>SSH</li><li>BLOB</li></ul> 
     * @return Type <p>数据源类型:枚举值</p><ul><li>MYSQL</li><li>TENCENT_MYSQL</li><li>POSTGRE</li><li>ORACLE</li><li>SQLSERVER</li><li>FTP</li><li>HIVE</li><li>HUDI</li><li>HDFS</li><li>ICEBERG</li><li>KAFKA</li><li>HBASE</li><li>SPARK</li><li>VIRTUAL</li><li>TBASE</li><li>DB2</li><li>DM</li><li>GAUSSDB</li><li>GBASE</li><li>IMPALA</li><li>ES</li><li>TENCENT_ES</li><li>GREENPLUM</li><li>PHOENIX</li><li>SAP_HANA</li><li>SFTP</li><li>OCEANBASE</li><li>CLICKHOUSE</li><li>KUDU</li><li>VERTICA</li><li>REDIS</li><li>COS</li><li>DLC</li><li>DORIS</li><li>CKAFKA</li><li>S3</li><li>TDSQL</li><li>TDSQL_MYSQL</li><li>MONGODB</li><li>TENCENT_MONGODB</li><li>REST_API</li><li>SuperSQL</li><li>PRESTO</li><li>TiDB</li><li>StarRocks</li><li>Trino</li><li>Kyuubi</li><li>TCHOUSE_X</li><li>TCHOUSE_P</li><li>TCHOUSE_C</li><li>TCHOUSE_D</li><li>INFLUXDB</li><li>BIG_QUERY</li><li>SSH</li><li>BLOB</li></ul>
     */
    public String [] getType() {
        return this.Type;
    }

    /**
     * Set <p>数据源类型:枚举值</p><ul><li>MYSQL</li><li>TENCENT_MYSQL</li><li>POSTGRE</li><li>ORACLE</li><li>SQLSERVER</li><li>FTP</li><li>HIVE</li><li>HUDI</li><li>HDFS</li><li>ICEBERG</li><li>KAFKA</li><li>HBASE</li><li>SPARK</li><li>VIRTUAL</li><li>TBASE</li><li>DB2</li><li>DM</li><li>GAUSSDB</li><li>GBASE</li><li>IMPALA</li><li>ES</li><li>TENCENT_ES</li><li>GREENPLUM</li><li>PHOENIX</li><li>SAP_HANA</li><li>SFTP</li><li>OCEANBASE</li><li>CLICKHOUSE</li><li>KUDU</li><li>VERTICA</li><li>REDIS</li><li>COS</li><li>DLC</li><li>DORIS</li><li>CKAFKA</li><li>S3</li><li>TDSQL</li><li>TDSQL_MYSQL</li><li>MONGODB</li><li>TENCENT_MONGODB</li><li>REST_API</li><li>SuperSQL</li><li>PRESTO</li><li>TiDB</li><li>StarRocks</li><li>Trino</li><li>Kyuubi</li><li>TCHOUSE_X</li><li>TCHOUSE_P</li><li>TCHOUSE_C</li><li>TCHOUSE_D</li><li>INFLUXDB</li><li>BIG_QUERY</li><li>SSH</li><li>BLOB</li></ul>
     * @param Type <p>数据源类型:枚举值</p><ul><li>MYSQL</li><li>TENCENT_MYSQL</li><li>POSTGRE</li><li>ORACLE</li><li>SQLSERVER</li><li>FTP</li><li>HIVE</li><li>HUDI</li><li>HDFS</li><li>ICEBERG</li><li>KAFKA</li><li>HBASE</li><li>SPARK</li><li>VIRTUAL</li><li>TBASE</li><li>DB2</li><li>DM</li><li>GAUSSDB</li><li>GBASE</li><li>IMPALA</li><li>ES</li><li>TENCENT_ES</li><li>GREENPLUM</li><li>PHOENIX</li><li>SAP_HANA</li><li>SFTP</li><li>OCEANBASE</li><li>CLICKHOUSE</li><li>KUDU</li><li>VERTICA</li><li>REDIS</li><li>COS</li><li>DLC</li><li>DORIS</li><li>CKAFKA</li><li>S3</li><li>TDSQL</li><li>TDSQL_MYSQL</li><li>MONGODB</li><li>TENCENT_MONGODB</li><li>REST_API</li><li>SuperSQL</li><li>PRESTO</li><li>TiDB</li><li>StarRocks</li><li>Trino</li><li>Kyuubi</li><li>TCHOUSE_X</li><li>TCHOUSE_P</li><li>TCHOUSE_C</li><li>TCHOUSE_D</li><li>INFLUXDB</li><li>BIG_QUERY</li><li>SSH</li><li>BLOB</li></ul>
     */
    public void setType(String [] Type) {
        this.Type = Type;
    }

    /**
     * Get <p>创建人</p> 
     * @return Creator <p>创建人</p>
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>创建人</p>
     * @param Creator <p>创建人</p>
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

