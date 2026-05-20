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

public class CreateDataSourceRequest extends AbstractModel {

    /**
    * <p>数据源项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>数据源名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>数据源类型:枚举值- MYSQL- TENCENT_MYSQL- POSTGRE- ORACLE- SQLSERVER- FTP- HIVE- HUDI- HDFS- ICEBERG- KAFKA- DTS_KAFKA- HBASE- SPARK- TBASE- DB2- DM- GAUSSDB- GBASE- IMPALA- ES- TENCENT_ES- GREENPLUM- SAP_HANA- SFTP- OCEANBASE- CLICKHOUSE- KUDU- VERTICA- REDIS- COS- DLC- DORIS- CKAFKA- S3_DATAINSIGHT- TDSQL- TDSQL_MYSQL- MONGODB- TENCENT_MONGODB- REST_API- TiDB- StarRocks- Trino- Kyuubi- TCHOUSE_X- TCHOUSE_P- TCHOUSE_C- TCHOUSE_D- INFLUXDB- BIG_QUERY- SSH- BLOB- TDSQL_POSTGRE- GDB- TDENGINE- TDSQLC- FileSystem- TCLake- TDSQL_BOUNDLESS</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>数据源的配置信息，以JSON KV存储，根据每个数据源类型不同，而KV存储信息不同</p><blockquote><p>deployType:<br>CONNSTR_PUBLICDB(公网实例)<br>CONNSTR_CVMDB(自建实例)<br>INSTANCE(云实例)</p></blockquote><p><pre><code>mysql: 自建实例{    &quot;deployType&quot;: &quot;CONNSTR_CVMDB&quot;,    &quot;url&quot;: &quot;jdbc:mysql://1.1.1.1:1111/example#test#123456&quot;,    &quot;username&quot;: &quot;root&quot;,    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;vpcId&quot;: &quot;vpc-kprq42yo&quot;,    &quot;type&quot;: &quot;MYSQL&quot;}mysql: 云实例{    &quot;instanceid&quot;: &quot;cdb-12uxdo5e&quot;,    &quot;db&quot;: &quot;db&quot;,    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;username&quot;: &quot;msyql&quot;,    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;deployType&quot;: &quot;INSTANCE&quot;,    &quot;type&quot;: &quot;TENCENT_MYSQL&quot;}sql_server: {    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;url&quot;: &quot;jdbc:sqlserver://1.1.1.1:223;example#test#123456&quot;,    &quot;username&quot;: &quot;user_1&quot;,    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;type&quot;: &quot;SQLSERVER&quot;}redis:    redisType:    -NO_ACCOUT(免账号)    -SELF_ACCOUNT(自定义账号){    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;username&quot;:&quot;&quot;    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;ip&quot;: &quot;1.1.1.1&quot;,    &quot;port&quot;: &quot;6379&quot;,    &quot;redisType&quot;: &quot;NO_ACCOUT&quot;,    &quot;type&quot;: &quot;REDIS&quot;}oracle: {    &quot;deployType&quot;: &quot;CONNSTR_CVMDB&quot;,    &quot;url&quot;: &quot;jdbc:oracle:thin:@1.1.1.1:1521:example#test#123456&quot;,    &quot;username&quot;: &quot;oracle&quot;,    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;vpcId&quot;: &quot;vpc-kprq42yo&quot;,    &quot;type&quot;: &quot;ORACLE&quot;}mongodb:    advanceParams(自定义参数，会拼接至url后){    &quot;advanceParams&quot;: [        {            &quot;key&quot;: &quot;authSource&quot;,            &quot;value&quot;: &quot;auth&quot;        }    ],    &quot;db&quot;: &quot;admin&quot;,    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;username&quot;: &quot;user&quot;,    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;type&quot;: &quot;MONGODB&quot;,    &quot;host&quot;: &quot;1.1.1.1:9200&quot;}postgresql:{    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;url&quot;: &quot;jdbc:postgresql://1.1.1.1:1921/example#test#123456&quot;,    &quot;username&quot;: &quot;user&quot;,    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;type&quot;: &quot;POSTGRE&quot;}kafka:    authType:        - sasl        - jaas        - sasl_plaintext        - sasl_ssl        - GSSAPI    ssl:        -PLAIN        -GSSAPI{    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;host&quot;: &quot;1.1.1.1:9092&quot;,    &quot;ssl&quot;: &quot;GSSAPI&quot;,    &quot;authType&quot;: &quot;sasl&quot;,    &quot;type&quot;: &quot;KAFKA&quot;,    &quot;principal&quot;: &quot;aaaa&quot;,    &quot;serviceName&quot;: &quot;kafka&quot;}cos:{    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;deployType&quot;: &quot;INSTANCE&quot;,    &quot;secretId&quot;: &quot;aaaaa&quot;,    &quot;secretKey&quot;: &quot;example#test#123456&quot;,    &quot;bucket&quot;: &quot;aaa&quot;,    &quot;type&quot;: &quot;COS&quot;}</code></pre></p>
    */
    @SerializedName("ProdConProperties")
    @Expose
    private String ProdConProperties;

    /**
    * <p>开发环境数据源配置信息，若项目为标准模式，则此字段必填</p>
    */
    @SerializedName("DevConProperties")
    @Expose
    private String DevConProperties;

    /**
    * <p>生产环境数据源文件上传</p>
    */
    @SerializedName("ProdFileUpload")
    @Expose
    private DataSourceFileUpload ProdFileUpload;

    /**
    * <p>开发环境数据源文件上传</p>
    */
    @SerializedName("DevFileUpload")
    @Expose
    private DataSourceFileUpload DevFileUpload;

    /**
    * <p>数据源展示名，为了可视化查看</p>
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * <p>数据源描述信息</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>数据源项目ID</p> 
     * @return ProjectId <p>数据源项目ID</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>数据源项目ID</p>
     * @param ProjectId <p>数据源项目ID</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
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
     * Get <p>数据源类型:枚举值- MYSQL- TENCENT_MYSQL- POSTGRE- ORACLE- SQLSERVER- FTP- HIVE- HUDI- HDFS- ICEBERG- KAFKA- DTS_KAFKA- HBASE- SPARK- TBASE- DB2- DM- GAUSSDB- GBASE- IMPALA- ES- TENCENT_ES- GREENPLUM- SAP_HANA- SFTP- OCEANBASE- CLICKHOUSE- KUDU- VERTICA- REDIS- COS- DLC- DORIS- CKAFKA- S3_DATAINSIGHT- TDSQL- TDSQL_MYSQL- MONGODB- TENCENT_MONGODB- REST_API- TiDB- StarRocks- Trino- Kyuubi- TCHOUSE_X- TCHOUSE_P- TCHOUSE_C- TCHOUSE_D- INFLUXDB- BIG_QUERY- SSH- BLOB- TDSQL_POSTGRE- GDB- TDENGINE- TDSQLC- FileSystem- TCLake- TDSQL_BOUNDLESS</p> 
     * @return Type <p>数据源类型:枚举值- MYSQL- TENCENT_MYSQL- POSTGRE- ORACLE- SQLSERVER- FTP- HIVE- HUDI- HDFS- ICEBERG- KAFKA- DTS_KAFKA- HBASE- SPARK- TBASE- DB2- DM- GAUSSDB- GBASE- IMPALA- ES- TENCENT_ES- GREENPLUM- SAP_HANA- SFTP- OCEANBASE- CLICKHOUSE- KUDU- VERTICA- REDIS- COS- DLC- DORIS- CKAFKA- S3_DATAINSIGHT- TDSQL- TDSQL_MYSQL- MONGODB- TENCENT_MONGODB- REST_API- TiDB- StarRocks- Trino- Kyuubi- TCHOUSE_X- TCHOUSE_P- TCHOUSE_C- TCHOUSE_D- INFLUXDB- BIG_QUERY- SSH- BLOB- TDSQL_POSTGRE- GDB- TDENGINE- TDSQLC- FileSystem- TCLake- TDSQL_BOUNDLESS</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>数据源类型:枚举值- MYSQL- TENCENT_MYSQL- POSTGRE- ORACLE- SQLSERVER- FTP- HIVE- HUDI- HDFS- ICEBERG- KAFKA- DTS_KAFKA- HBASE- SPARK- TBASE- DB2- DM- GAUSSDB- GBASE- IMPALA- ES- TENCENT_ES- GREENPLUM- SAP_HANA- SFTP- OCEANBASE- CLICKHOUSE- KUDU- VERTICA- REDIS- COS- DLC- DORIS- CKAFKA- S3_DATAINSIGHT- TDSQL- TDSQL_MYSQL- MONGODB- TENCENT_MONGODB- REST_API- TiDB- StarRocks- Trino- Kyuubi- TCHOUSE_X- TCHOUSE_P- TCHOUSE_C- TCHOUSE_D- INFLUXDB- BIG_QUERY- SSH- BLOB- TDSQL_POSTGRE- GDB- TDENGINE- TDSQLC- FileSystem- TCLake- TDSQL_BOUNDLESS</p>
     * @param Type <p>数据源类型:枚举值- MYSQL- TENCENT_MYSQL- POSTGRE- ORACLE- SQLSERVER- FTP- HIVE- HUDI- HDFS- ICEBERG- KAFKA- DTS_KAFKA- HBASE- SPARK- TBASE- DB2- DM- GAUSSDB- GBASE- IMPALA- ES- TENCENT_ES- GREENPLUM- SAP_HANA- SFTP- OCEANBASE- CLICKHOUSE- KUDU- VERTICA- REDIS- COS- DLC- DORIS- CKAFKA- S3_DATAINSIGHT- TDSQL- TDSQL_MYSQL- MONGODB- TENCENT_MONGODB- REST_API- TiDB- StarRocks- Trino- Kyuubi- TCHOUSE_X- TCHOUSE_P- TCHOUSE_C- TCHOUSE_D- INFLUXDB- BIG_QUERY- SSH- BLOB- TDSQL_POSTGRE- GDB- TDENGINE- TDSQLC- FileSystem- TCLake- TDSQL_BOUNDLESS</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>数据源的配置信息，以JSON KV存储，根据每个数据源类型不同，而KV存储信息不同</p><blockquote><p>deployType:<br>CONNSTR_PUBLICDB(公网实例)<br>CONNSTR_CVMDB(自建实例)<br>INSTANCE(云实例)</p></blockquote><p><pre><code>mysql: 自建实例{    &quot;deployType&quot;: &quot;CONNSTR_CVMDB&quot;,    &quot;url&quot;: &quot;jdbc:mysql://1.1.1.1:1111/example#test#123456&quot;,    &quot;username&quot;: &quot;root&quot;,    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;vpcId&quot;: &quot;vpc-kprq42yo&quot;,    &quot;type&quot;: &quot;MYSQL&quot;}mysql: 云实例{    &quot;instanceid&quot;: &quot;cdb-12uxdo5e&quot;,    &quot;db&quot;: &quot;db&quot;,    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;username&quot;: &quot;msyql&quot;,    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;deployType&quot;: &quot;INSTANCE&quot;,    &quot;type&quot;: &quot;TENCENT_MYSQL&quot;}sql_server: {    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;url&quot;: &quot;jdbc:sqlserver://1.1.1.1:223;example#test#123456&quot;,    &quot;username&quot;: &quot;user_1&quot;,    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;type&quot;: &quot;SQLSERVER&quot;}redis:    redisType:    -NO_ACCOUT(免账号)    -SELF_ACCOUNT(自定义账号){    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;username&quot;:&quot;&quot;    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;ip&quot;: &quot;1.1.1.1&quot;,    &quot;port&quot;: &quot;6379&quot;,    &quot;redisType&quot;: &quot;NO_ACCOUT&quot;,    &quot;type&quot;: &quot;REDIS&quot;}oracle: {    &quot;deployType&quot;: &quot;CONNSTR_CVMDB&quot;,    &quot;url&quot;: &quot;jdbc:oracle:thin:@1.1.1.1:1521:example#test#123456&quot;,    &quot;username&quot;: &quot;oracle&quot;,    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;vpcId&quot;: &quot;vpc-kprq42yo&quot;,    &quot;type&quot;: &quot;ORACLE&quot;}mongodb:    advanceParams(自定义参数，会拼接至url后){    &quot;advanceParams&quot;: [        {            &quot;key&quot;: &quot;authSource&quot;,            &quot;value&quot;: &quot;auth&quot;        }    ],    &quot;db&quot;: &quot;admin&quot;,    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;username&quot;: &quot;user&quot;,    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;type&quot;: &quot;MONGODB&quot;,    &quot;host&quot;: &quot;1.1.1.1:9200&quot;}postgresql:{    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;url&quot;: &quot;jdbc:postgresql://1.1.1.1:1921/example#test#123456&quot;,    &quot;username&quot;: &quot;user&quot;,    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;type&quot;: &quot;POSTGRE&quot;}kafka:    authType:        - sasl        - jaas        - sasl_plaintext        - sasl_ssl        - GSSAPI    ssl:        -PLAIN        -GSSAPI{    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;host&quot;: &quot;1.1.1.1:9092&quot;,    &quot;ssl&quot;: &quot;GSSAPI&quot;,    &quot;authType&quot;: &quot;sasl&quot;,    &quot;type&quot;: &quot;KAFKA&quot;,    &quot;principal&quot;: &quot;aaaa&quot;,    &quot;serviceName&quot;: &quot;kafka&quot;}cos:{    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;deployType&quot;: &quot;INSTANCE&quot;,    &quot;secretId&quot;: &quot;aaaaa&quot;,    &quot;secretKey&quot;: &quot;example#test#123456&quot;,    &quot;bucket&quot;: &quot;aaa&quot;,    &quot;type&quot;: &quot;COS&quot;}</code></pre></p> 
     * @return ProdConProperties <p>数据源的配置信息，以JSON KV存储，根据每个数据源类型不同，而KV存储信息不同</p><blockquote><p>deployType:<br>CONNSTR_PUBLICDB(公网实例)<br>CONNSTR_CVMDB(自建实例)<br>INSTANCE(云实例)</p></blockquote><p><pre><code>mysql: 自建实例{    &quot;deployType&quot;: &quot;CONNSTR_CVMDB&quot;,    &quot;url&quot;: &quot;jdbc:mysql://1.1.1.1:1111/example#test#123456&quot;,    &quot;username&quot;: &quot;root&quot;,    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;vpcId&quot;: &quot;vpc-kprq42yo&quot;,    &quot;type&quot;: &quot;MYSQL&quot;}mysql: 云实例{    &quot;instanceid&quot;: &quot;cdb-12uxdo5e&quot;,    &quot;db&quot;: &quot;db&quot;,    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;username&quot;: &quot;msyql&quot;,    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;deployType&quot;: &quot;INSTANCE&quot;,    &quot;type&quot;: &quot;TENCENT_MYSQL&quot;}sql_server: {    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;url&quot;: &quot;jdbc:sqlserver://1.1.1.1:223;example#test#123456&quot;,    &quot;username&quot;: &quot;user_1&quot;,    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;type&quot;: &quot;SQLSERVER&quot;}redis:    redisType:    -NO_ACCOUT(免账号)    -SELF_ACCOUNT(自定义账号){    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;username&quot;:&quot;&quot;    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;ip&quot;: &quot;1.1.1.1&quot;,    &quot;port&quot;: &quot;6379&quot;,    &quot;redisType&quot;: &quot;NO_ACCOUT&quot;,    &quot;type&quot;: &quot;REDIS&quot;}oracle: {    &quot;deployType&quot;: &quot;CONNSTR_CVMDB&quot;,    &quot;url&quot;: &quot;jdbc:oracle:thin:@1.1.1.1:1521:example#test#123456&quot;,    &quot;username&quot;: &quot;oracle&quot;,    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;vpcId&quot;: &quot;vpc-kprq42yo&quot;,    &quot;type&quot;: &quot;ORACLE&quot;}mongodb:    advanceParams(自定义参数，会拼接至url后){    &quot;advanceParams&quot;: [        {            &quot;key&quot;: &quot;authSource&quot;,            &quot;value&quot;: &quot;auth&quot;        }    ],    &quot;db&quot;: &quot;admin&quot;,    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;username&quot;: &quot;user&quot;,    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;type&quot;: &quot;MONGODB&quot;,    &quot;host&quot;: &quot;1.1.1.1:9200&quot;}postgresql:{    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;url&quot;: &quot;jdbc:postgresql://1.1.1.1:1921/example#test#123456&quot;,    &quot;username&quot;: &quot;user&quot;,    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;type&quot;: &quot;POSTGRE&quot;}kafka:    authType:        - sasl        - jaas        - sasl_plaintext        - sasl_ssl        - GSSAPI    ssl:        -PLAIN        -GSSAPI{    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;host&quot;: &quot;1.1.1.1:9092&quot;,    &quot;ssl&quot;: &quot;GSSAPI&quot;,    &quot;authType&quot;: &quot;sasl&quot;,    &quot;type&quot;: &quot;KAFKA&quot;,    &quot;principal&quot;: &quot;aaaa&quot;,    &quot;serviceName&quot;: &quot;kafka&quot;}cos:{    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;deployType&quot;: &quot;INSTANCE&quot;,    &quot;secretId&quot;: &quot;aaaaa&quot;,    &quot;secretKey&quot;: &quot;example#test#123456&quot;,    &quot;bucket&quot;: &quot;aaa&quot;,    &quot;type&quot;: &quot;COS&quot;}</code></pre></p>
     */
    public String getProdConProperties() {
        return this.ProdConProperties;
    }

    /**
     * Set <p>数据源的配置信息，以JSON KV存储，根据每个数据源类型不同，而KV存储信息不同</p><blockquote><p>deployType:<br>CONNSTR_PUBLICDB(公网实例)<br>CONNSTR_CVMDB(自建实例)<br>INSTANCE(云实例)</p></blockquote><p><pre><code>mysql: 自建实例{    &quot;deployType&quot;: &quot;CONNSTR_CVMDB&quot;,    &quot;url&quot;: &quot;jdbc:mysql://1.1.1.1:1111/example#test#123456&quot;,    &quot;username&quot;: &quot;root&quot;,    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;vpcId&quot;: &quot;vpc-kprq42yo&quot;,    &quot;type&quot;: &quot;MYSQL&quot;}mysql: 云实例{    &quot;instanceid&quot;: &quot;cdb-12uxdo5e&quot;,    &quot;db&quot;: &quot;db&quot;,    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;username&quot;: &quot;msyql&quot;,    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;deployType&quot;: &quot;INSTANCE&quot;,    &quot;type&quot;: &quot;TENCENT_MYSQL&quot;}sql_server: {    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;url&quot;: &quot;jdbc:sqlserver://1.1.1.1:223;example#test#123456&quot;,    &quot;username&quot;: &quot;user_1&quot;,    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;type&quot;: &quot;SQLSERVER&quot;}redis:    redisType:    -NO_ACCOUT(免账号)    -SELF_ACCOUNT(自定义账号){    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;username&quot;:&quot;&quot;    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;ip&quot;: &quot;1.1.1.1&quot;,    &quot;port&quot;: &quot;6379&quot;,    &quot;redisType&quot;: &quot;NO_ACCOUT&quot;,    &quot;type&quot;: &quot;REDIS&quot;}oracle: {    &quot;deployType&quot;: &quot;CONNSTR_CVMDB&quot;,    &quot;url&quot;: &quot;jdbc:oracle:thin:@1.1.1.1:1521:example#test#123456&quot;,    &quot;username&quot;: &quot;oracle&quot;,    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;vpcId&quot;: &quot;vpc-kprq42yo&quot;,    &quot;type&quot;: &quot;ORACLE&quot;}mongodb:    advanceParams(自定义参数，会拼接至url后){    &quot;advanceParams&quot;: [        {            &quot;key&quot;: &quot;authSource&quot;,            &quot;value&quot;: &quot;auth&quot;        }    ],    &quot;db&quot;: &quot;admin&quot;,    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;username&quot;: &quot;user&quot;,    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;type&quot;: &quot;MONGODB&quot;,    &quot;host&quot;: &quot;1.1.1.1:9200&quot;}postgresql:{    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;url&quot;: &quot;jdbc:postgresql://1.1.1.1:1921/example#test#123456&quot;,    &quot;username&quot;: &quot;user&quot;,    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;type&quot;: &quot;POSTGRE&quot;}kafka:    authType:        - sasl        - jaas        - sasl_plaintext        - sasl_ssl        - GSSAPI    ssl:        -PLAIN        -GSSAPI{    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;host&quot;: &quot;1.1.1.1:9092&quot;,    &quot;ssl&quot;: &quot;GSSAPI&quot;,    &quot;authType&quot;: &quot;sasl&quot;,    &quot;type&quot;: &quot;KAFKA&quot;,    &quot;principal&quot;: &quot;aaaa&quot;,    &quot;serviceName&quot;: &quot;kafka&quot;}cos:{    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;deployType&quot;: &quot;INSTANCE&quot;,    &quot;secretId&quot;: &quot;aaaaa&quot;,    &quot;secretKey&quot;: &quot;example#test#123456&quot;,    &quot;bucket&quot;: &quot;aaa&quot;,    &quot;type&quot;: &quot;COS&quot;}</code></pre></p>
     * @param ProdConProperties <p>数据源的配置信息，以JSON KV存储，根据每个数据源类型不同，而KV存储信息不同</p><blockquote><p>deployType:<br>CONNSTR_PUBLICDB(公网实例)<br>CONNSTR_CVMDB(自建实例)<br>INSTANCE(云实例)</p></blockquote><p><pre><code>mysql: 自建实例{    &quot;deployType&quot;: &quot;CONNSTR_CVMDB&quot;,    &quot;url&quot;: &quot;jdbc:mysql://1.1.1.1:1111/example#test#123456&quot;,    &quot;username&quot;: &quot;root&quot;,    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;vpcId&quot;: &quot;vpc-kprq42yo&quot;,    &quot;type&quot;: &quot;MYSQL&quot;}mysql: 云实例{    &quot;instanceid&quot;: &quot;cdb-12uxdo5e&quot;,    &quot;db&quot;: &quot;db&quot;,    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;username&quot;: &quot;msyql&quot;,    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;deployType&quot;: &quot;INSTANCE&quot;,    &quot;type&quot;: &quot;TENCENT_MYSQL&quot;}sql_server: {    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;url&quot;: &quot;jdbc:sqlserver://1.1.1.1:223;example#test#123456&quot;,    &quot;username&quot;: &quot;user_1&quot;,    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;type&quot;: &quot;SQLSERVER&quot;}redis:    redisType:    -NO_ACCOUT(免账号)    -SELF_ACCOUNT(自定义账号){    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;username&quot;:&quot;&quot;    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;ip&quot;: &quot;1.1.1.1&quot;,    &quot;port&quot;: &quot;6379&quot;,    &quot;redisType&quot;: &quot;NO_ACCOUT&quot;,    &quot;type&quot;: &quot;REDIS&quot;}oracle: {    &quot;deployType&quot;: &quot;CONNSTR_CVMDB&quot;,    &quot;url&quot;: &quot;jdbc:oracle:thin:@1.1.1.1:1521:example#test#123456&quot;,    &quot;username&quot;: &quot;oracle&quot;,    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;vpcId&quot;: &quot;vpc-kprq42yo&quot;,    &quot;type&quot;: &quot;ORACLE&quot;}mongodb:    advanceParams(自定义参数，会拼接至url后){    &quot;advanceParams&quot;: [        {            &quot;key&quot;: &quot;authSource&quot;,            &quot;value&quot;: &quot;auth&quot;        }    ],    &quot;db&quot;: &quot;admin&quot;,    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;username&quot;: &quot;user&quot;,    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;type&quot;: &quot;MONGODB&quot;,    &quot;host&quot;: &quot;1.1.1.1:9200&quot;}postgresql:{    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;url&quot;: &quot;jdbc:postgresql://1.1.1.1:1921/example#test#123456&quot;,    &quot;username&quot;: &quot;user&quot;,    &quot;password&quot;: &quot;example#test#123456&quot;,    &quot;type&quot;: &quot;POSTGRE&quot;}kafka:    authType:        - sasl        - jaas        - sasl_plaintext        - sasl_ssl        - GSSAPI    ssl:        -PLAIN        -GSSAPI{    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;host&quot;: &quot;1.1.1.1:9092&quot;,    &quot;ssl&quot;: &quot;GSSAPI&quot;,    &quot;authType&quot;: &quot;sasl&quot;,    &quot;type&quot;: &quot;KAFKA&quot;,    &quot;principal&quot;: &quot;aaaa&quot;,    &quot;serviceName&quot;: &quot;kafka&quot;}cos:{    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;deployType&quot;: &quot;INSTANCE&quot;,    &quot;secretId&quot;: &quot;aaaaa&quot;,    &quot;secretKey&quot;: &quot;example#test#123456&quot;,    &quot;bucket&quot;: &quot;aaa&quot;,    &quot;type&quot;: &quot;COS&quot;}</code></pre></p>
     */
    public void setProdConProperties(String ProdConProperties) {
        this.ProdConProperties = ProdConProperties;
    }

    /**
     * Get <p>开发环境数据源配置信息，若项目为标准模式，则此字段必填</p> 
     * @return DevConProperties <p>开发环境数据源配置信息，若项目为标准模式，则此字段必填</p>
     */
    public String getDevConProperties() {
        return this.DevConProperties;
    }

    /**
     * Set <p>开发环境数据源配置信息，若项目为标准模式，则此字段必填</p>
     * @param DevConProperties <p>开发环境数据源配置信息，若项目为标准模式，则此字段必填</p>
     */
    public void setDevConProperties(String DevConProperties) {
        this.DevConProperties = DevConProperties;
    }

    /**
     * Get <p>生产环境数据源文件上传</p> 
     * @return ProdFileUpload <p>生产环境数据源文件上传</p>
     */
    public DataSourceFileUpload getProdFileUpload() {
        return this.ProdFileUpload;
    }

    /**
     * Set <p>生产环境数据源文件上传</p>
     * @param ProdFileUpload <p>生产环境数据源文件上传</p>
     */
    public void setProdFileUpload(DataSourceFileUpload ProdFileUpload) {
        this.ProdFileUpload = ProdFileUpload;
    }

    /**
     * Get <p>开发环境数据源文件上传</p> 
     * @return DevFileUpload <p>开发环境数据源文件上传</p>
     */
    public DataSourceFileUpload getDevFileUpload() {
        return this.DevFileUpload;
    }

    /**
     * Set <p>开发环境数据源文件上传</p>
     * @param DevFileUpload <p>开发环境数据源文件上传</p>
     */
    public void setDevFileUpload(DataSourceFileUpload DevFileUpload) {
        this.DevFileUpload = DevFileUpload;
    }

    /**
     * Get <p>数据源展示名，为了可视化查看</p> 
     * @return DisplayName <p>数据源展示名，为了可视化查看</p>
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set <p>数据源展示名，为了可视化查看</p>
     * @param DisplayName <p>数据源展示名，为了可视化查看</p>
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get <p>数据源描述信息</p> 
     * @return Description <p>数据源描述信息</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>数据源描述信息</p>
     * @param Description <p>数据源描述信息</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateDataSourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDataSourceRequest(CreateDataSourceRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ProdConProperties != null) {
            this.ProdConProperties = new String(source.ProdConProperties);
        }
        if (source.DevConProperties != null) {
            this.DevConProperties = new String(source.DevConProperties);
        }
        if (source.ProdFileUpload != null) {
            this.ProdFileUpload = new DataSourceFileUpload(source.ProdFileUpload);
        }
        if (source.DevFileUpload != null) {
            this.DevFileUpload = new DataSourceFileUpload(source.DevFileUpload);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ProdConProperties", this.ProdConProperties);
        this.setParamSimple(map, prefix + "DevConProperties", this.DevConProperties);
        this.setParamObj(map, prefix + "ProdFileUpload.", this.ProdFileUpload);
        this.setParamObj(map, prefix + "DevFileUpload.", this.DevFileUpload);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

