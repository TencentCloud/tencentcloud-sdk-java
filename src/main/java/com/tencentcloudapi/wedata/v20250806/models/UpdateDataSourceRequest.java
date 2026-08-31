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

public class UpdateDataSourceRequest extends AbstractModel {

    /**
    * <p>数据源id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>项目id</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>数据源的配置信息，以JSON KV存储，根据每个数据源类型不同，而KV存储信息不同</p><blockquote><p>deployType:<br>CONNSTR_PUBLICDB(公网实例)<br>CONNSTR_CVMDB(自建实例)<br>INSTANCE(云实例)</p></blockquote><p><pre><code>mysql: 自建实例{    &quot;deployType&quot;: &quot;CONNSTR_CVMDB&quot;,    &quot;url&quot;: &quot;jdbc:mysql://&lt;host&gt;:&lt;port&gt;/&lt;database&gt;&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;vpcId&quot;: &quot;&lt;vpcId&gt;&quot;,    &quot;type&quot;: &quot;MYSQL&quot;}mysql: 云实例{    &quot;instanceid&quot;: &quot;&lt;instanceId&gt;&quot;,    &quot;db&quot;: &quot;&lt;database&gt;&quot;,    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;deployType&quot;: &quot;INSTANCE&quot;,    &quot;type&quot;: &quot;TENCENT_MYSQL&quot;}sql_server:{    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;url&quot;: &quot;jdbc:sqlserver://&lt;host&gt;:&lt;port&gt;;DatabaseName=&lt;database&gt;&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;type&quot;: &quot;SQLSERVER&quot;}redis:    redisType:    -NO_ACCOUT(免账号)    -SELF_ACCOUNT(自定义账号){    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;ip&quot;: &quot;&lt;host&gt;&quot;,    &quot;port&quot;: &quot;&lt;port&gt;&quot;,    &quot;redisType&quot;: &quot;NO_ACCOUT&quot;,    &quot;type&quot;: &quot;REDIS&quot;}oracle:{    &quot;deployType&quot;: &quot;CONNSTR_CVMDB&quot;,    &quot;url&quot;: &quot;jdbc:oracle:thin:@&lt;host&gt;:&lt;port&gt;:&lt;sid&gt;&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;vpcId&quot;: &quot;&lt;vpcId&gt;&quot;,    &quot;type&quot;: &quot;ORACLE&quot;}mongodb:    advanceParams(自定义参数，会拼接至url后){    &quot;advanceParams&quot;: [        {            &quot;key&quot;: &quot;authSource&quot;,            &quot;value&quot;: &quot;admin&quot;        }    ],    &quot;db&quot;: &quot;&lt;database&gt;&quot;,    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;type&quot;: &quot;MONGODB&quot;,    &quot;host&quot;: &quot;&lt;host&gt;:&lt;port&gt;&quot;}postgresql:{    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;url&quot;: &quot;jdbc:postgresql://&lt;host&gt;:&lt;port&gt;/&lt;database&gt;&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;type&quot;: &quot;POSTGRE&quot;}kafka:    authType:    - sasl    - jaas    - sasl_plaintext    - sasl_ssl    - GSSAPI    ssl:    -PLAIN    -GSSAPI{    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;host&quot;: &quot;&lt;host&gt;:&lt;port&gt;&quot;,    &quot;ssl&quot;: &quot;GSSAPI&quot;,    &quot;authType&quot;: &quot;sasl&quot;,    &quot;type&quot;: &quot;KAFKA&quot;,    &quot;principal&quot;: &quot;&lt;principal&gt;&quot;,    &quot;serviceName&quot;: &quot;kafka&quot;}cos:{    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;deployType&quot;: &quot;INSTANCE&quot;,    &quot;secretId&quot;: &quot;&lt;secretId&gt;&quot;,    &quot;secretKey&quot;: &quot;&lt;secretKey&gt;&quot;,    &quot;bucket&quot;: &quot;&lt;bucket&gt;&quot;,    &quot;type&quot;: &quot;COS&quot;}</code></pre></p>
    */
    @SerializedName("ProdConProperties")
    @Expose
    private String ProdConProperties;

    /**
    * <p>若项目为标准模式，则此字段必填</p>
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
     * Get <p>数据源id</p> 
     * @return Id <p>数据源id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>数据源id</p>
     * @param Id <p>数据源id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

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
     * Get <p>数据源的配置信息，以JSON KV存储，根据每个数据源类型不同，而KV存储信息不同</p><blockquote><p>deployType:<br>CONNSTR_PUBLICDB(公网实例)<br>CONNSTR_CVMDB(自建实例)<br>INSTANCE(云实例)</p></blockquote><p><pre><code>mysql: 自建实例{    &quot;deployType&quot;: &quot;CONNSTR_CVMDB&quot;,    &quot;url&quot;: &quot;jdbc:mysql://&lt;host&gt;:&lt;port&gt;/&lt;database&gt;&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;vpcId&quot;: &quot;&lt;vpcId&gt;&quot;,    &quot;type&quot;: &quot;MYSQL&quot;}mysql: 云实例{    &quot;instanceid&quot;: &quot;&lt;instanceId&gt;&quot;,    &quot;db&quot;: &quot;&lt;database&gt;&quot;,    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;deployType&quot;: &quot;INSTANCE&quot;,    &quot;type&quot;: &quot;TENCENT_MYSQL&quot;}sql_server:{    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;url&quot;: &quot;jdbc:sqlserver://&lt;host&gt;:&lt;port&gt;;DatabaseName=&lt;database&gt;&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;type&quot;: &quot;SQLSERVER&quot;}redis:    redisType:    -NO_ACCOUT(免账号)    -SELF_ACCOUNT(自定义账号){    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;ip&quot;: &quot;&lt;host&gt;&quot;,    &quot;port&quot;: &quot;&lt;port&gt;&quot;,    &quot;redisType&quot;: &quot;NO_ACCOUT&quot;,    &quot;type&quot;: &quot;REDIS&quot;}oracle:{    &quot;deployType&quot;: &quot;CONNSTR_CVMDB&quot;,    &quot;url&quot;: &quot;jdbc:oracle:thin:@&lt;host&gt;:&lt;port&gt;:&lt;sid&gt;&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;vpcId&quot;: &quot;&lt;vpcId&gt;&quot;,    &quot;type&quot;: &quot;ORACLE&quot;}mongodb:    advanceParams(自定义参数，会拼接至url后){    &quot;advanceParams&quot;: [        {            &quot;key&quot;: &quot;authSource&quot;,            &quot;value&quot;: &quot;admin&quot;        }    ],    &quot;db&quot;: &quot;&lt;database&gt;&quot;,    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;type&quot;: &quot;MONGODB&quot;,    &quot;host&quot;: &quot;&lt;host&gt;:&lt;port&gt;&quot;}postgresql:{    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;url&quot;: &quot;jdbc:postgresql://&lt;host&gt;:&lt;port&gt;/&lt;database&gt;&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;type&quot;: &quot;POSTGRE&quot;}kafka:    authType:    - sasl    - jaas    - sasl_plaintext    - sasl_ssl    - GSSAPI    ssl:    -PLAIN    -GSSAPI{    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;host&quot;: &quot;&lt;host&gt;:&lt;port&gt;&quot;,    &quot;ssl&quot;: &quot;GSSAPI&quot;,    &quot;authType&quot;: &quot;sasl&quot;,    &quot;type&quot;: &quot;KAFKA&quot;,    &quot;principal&quot;: &quot;&lt;principal&gt;&quot;,    &quot;serviceName&quot;: &quot;kafka&quot;}cos:{    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;deployType&quot;: &quot;INSTANCE&quot;,    &quot;secretId&quot;: &quot;&lt;secretId&gt;&quot;,    &quot;secretKey&quot;: &quot;&lt;secretKey&gt;&quot;,    &quot;bucket&quot;: &quot;&lt;bucket&gt;&quot;,    &quot;type&quot;: &quot;COS&quot;}</code></pre></p> 
     * @return ProdConProperties <p>数据源的配置信息，以JSON KV存储，根据每个数据源类型不同，而KV存储信息不同</p><blockquote><p>deployType:<br>CONNSTR_PUBLICDB(公网实例)<br>CONNSTR_CVMDB(自建实例)<br>INSTANCE(云实例)</p></blockquote><p><pre><code>mysql: 自建实例{    &quot;deployType&quot;: &quot;CONNSTR_CVMDB&quot;,    &quot;url&quot;: &quot;jdbc:mysql://&lt;host&gt;:&lt;port&gt;/&lt;database&gt;&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;vpcId&quot;: &quot;&lt;vpcId&gt;&quot;,    &quot;type&quot;: &quot;MYSQL&quot;}mysql: 云实例{    &quot;instanceid&quot;: &quot;&lt;instanceId&gt;&quot;,    &quot;db&quot;: &quot;&lt;database&gt;&quot;,    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;deployType&quot;: &quot;INSTANCE&quot;,    &quot;type&quot;: &quot;TENCENT_MYSQL&quot;}sql_server:{    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;url&quot;: &quot;jdbc:sqlserver://&lt;host&gt;:&lt;port&gt;;DatabaseName=&lt;database&gt;&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;type&quot;: &quot;SQLSERVER&quot;}redis:    redisType:    -NO_ACCOUT(免账号)    -SELF_ACCOUNT(自定义账号){    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;ip&quot;: &quot;&lt;host&gt;&quot;,    &quot;port&quot;: &quot;&lt;port&gt;&quot;,    &quot;redisType&quot;: &quot;NO_ACCOUT&quot;,    &quot;type&quot;: &quot;REDIS&quot;}oracle:{    &quot;deployType&quot;: &quot;CONNSTR_CVMDB&quot;,    &quot;url&quot;: &quot;jdbc:oracle:thin:@&lt;host&gt;:&lt;port&gt;:&lt;sid&gt;&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;vpcId&quot;: &quot;&lt;vpcId&gt;&quot;,    &quot;type&quot;: &quot;ORACLE&quot;}mongodb:    advanceParams(自定义参数，会拼接至url后){    &quot;advanceParams&quot;: [        {            &quot;key&quot;: &quot;authSource&quot;,            &quot;value&quot;: &quot;admin&quot;        }    ],    &quot;db&quot;: &quot;&lt;database&gt;&quot;,    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;type&quot;: &quot;MONGODB&quot;,    &quot;host&quot;: &quot;&lt;host&gt;:&lt;port&gt;&quot;}postgresql:{    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;url&quot;: &quot;jdbc:postgresql://&lt;host&gt;:&lt;port&gt;/&lt;database&gt;&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;type&quot;: &quot;POSTGRE&quot;}kafka:    authType:    - sasl    - jaas    - sasl_plaintext    - sasl_ssl    - GSSAPI    ssl:    -PLAIN    -GSSAPI{    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;host&quot;: &quot;&lt;host&gt;:&lt;port&gt;&quot;,    &quot;ssl&quot;: &quot;GSSAPI&quot;,    &quot;authType&quot;: &quot;sasl&quot;,    &quot;type&quot;: &quot;KAFKA&quot;,    &quot;principal&quot;: &quot;&lt;principal&gt;&quot;,    &quot;serviceName&quot;: &quot;kafka&quot;}cos:{    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;deployType&quot;: &quot;INSTANCE&quot;,    &quot;secretId&quot;: &quot;&lt;secretId&gt;&quot;,    &quot;secretKey&quot;: &quot;&lt;secretKey&gt;&quot;,    &quot;bucket&quot;: &quot;&lt;bucket&gt;&quot;,    &quot;type&quot;: &quot;COS&quot;}</code></pre></p>
     */
    public String getProdConProperties() {
        return this.ProdConProperties;
    }

    /**
     * Set <p>数据源的配置信息，以JSON KV存储，根据每个数据源类型不同，而KV存储信息不同</p><blockquote><p>deployType:<br>CONNSTR_PUBLICDB(公网实例)<br>CONNSTR_CVMDB(自建实例)<br>INSTANCE(云实例)</p></blockquote><p><pre><code>mysql: 自建实例{    &quot;deployType&quot;: &quot;CONNSTR_CVMDB&quot;,    &quot;url&quot;: &quot;jdbc:mysql://&lt;host&gt;:&lt;port&gt;/&lt;database&gt;&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;vpcId&quot;: &quot;&lt;vpcId&gt;&quot;,    &quot;type&quot;: &quot;MYSQL&quot;}mysql: 云实例{    &quot;instanceid&quot;: &quot;&lt;instanceId&gt;&quot;,    &quot;db&quot;: &quot;&lt;database&gt;&quot;,    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;deployType&quot;: &quot;INSTANCE&quot;,    &quot;type&quot;: &quot;TENCENT_MYSQL&quot;}sql_server:{    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;url&quot;: &quot;jdbc:sqlserver://&lt;host&gt;:&lt;port&gt;;DatabaseName=&lt;database&gt;&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;type&quot;: &quot;SQLSERVER&quot;}redis:    redisType:    -NO_ACCOUT(免账号)    -SELF_ACCOUNT(自定义账号){    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;ip&quot;: &quot;&lt;host&gt;&quot;,    &quot;port&quot;: &quot;&lt;port&gt;&quot;,    &quot;redisType&quot;: &quot;NO_ACCOUT&quot;,    &quot;type&quot;: &quot;REDIS&quot;}oracle:{    &quot;deployType&quot;: &quot;CONNSTR_CVMDB&quot;,    &quot;url&quot;: &quot;jdbc:oracle:thin:@&lt;host&gt;:&lt;port&gt;:&lt;sid&gt;&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;vpcId&quot;: &quot;&lt;vpcId&gt;&quot;,    &quot;type&quot;: &quot;ORACLE&quot;}mongodb:    advanceParams(自定义参数，会拼接至url后){    &quot;advanceParams&quot;: [        {            &quot;key&quot;: &quot;authSource&quot;,            &quot;value&quot;: &quot;admin&quot;        }    ],    &quot;db&quot;: &quot;&lt;database&gt;&quot;,    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;type&quot;: &quot;MONGODB&quot;,    &quot;host&quot;: &quot;&lt;host&gt;:&lt;port&gt;&quot;}postgresql:{    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;url&quot;: &quot;jdbc:postgresql://&lt;host&gt;:&lt;port&gt;/&lt;database&gt;&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;type&quot;: &quot;POSTGRE&quot;}kafka:    authType:    - sasl    - jaas    - sasl_plaintext    - sasl_ssl    - GSSAPI    ssl:    -PLAIN    -GSSAPI{    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;host&quot;: &quot;&lt;host&gt;:&lt;port&gt;&quot;,    &quot;ssl&quot;: &quot;GSSAPI&quot;,    &quot;authType&quot;: &quot;sasl&quot;,    &quot;type&quot;: &quot;KAFKA&quot;,    &quot;principal&quot;: &quot;&lt;principal&gt;&quot;,    &quot;serviceName&quot;: &quot;kafka&quot;}cos:{    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;deployType&quot;: &quot;INSTANCE&quot;,    &quot;secretId&quot;: &quot;&lt;secretId&gt;&quot;,    &quot;secretKey&quot;: &quot;&lt;secretKey&gt;&quot;,    &quot;bucket&quot;: &quot;&lt;bucket&gt;&quot;,    &quot;type&quot;: &quot;COS&quot;}</code></pre></p>
     * @param ProdConProperties <p>数据源的配置信息，以JSON KV存储，根据每个数据源类型不同，而KV存储信息不同</p><blockquote><p>deployType:<br>CONNSTR_PUBLICDB(公网实例)<br>CONNSTR_CVMDB(自建实例)<br>INSTANCE(云实例)</p></blockquote><p><pre><code>mysql: 自建实例{    &quot;deployType&quot;: &quot;CONNSTR_CVMDB&quot;,    &quot;url&quot;: &quot;jdbc:mysql://&lt;host&gt;:&lt;port&gt;/&lt;database&gt;&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;vpcId&quot;: &quot;&lt;vpcId&gt;&quot;,    &quot;type&quot;: &quot;MYSQL&quot;}mysql: 云实例{    &quot;instanceid&quot;: &quot;&lt;instanceId&gt;&quot;,    &quot;db&quot;: &quot;&lt;database&gt;&quot;,    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;deployType&quot;: &quot;INSTANCE&quot;,    &quot;type&quot;: &quot;TENCENT_MYSQL&quot;}sql_server:{    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;url&quot;: &quot;jdbc:sqlserver://&lt;host&gt;:&lt;port&gt;;DatabaseName=&lt;database&gt;&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;type&quot;: &quot;SQLSERVER&quot;}redis:    redisType:    -NO_ACCOUT(免账号)    -SELF_ACCOUNT(自定义账号){    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;ip&quot;: &quot;&lt;host&gt;&quot;,    &quot;port&quot;: &quot;&lt;port&gt;&quot;,    &quot;redisType&quot;: &quot;NO_ACCOUT&quot;,    &quot;type&quot;: &quot;REDIS&quot;}oracle:{    &quot;deployType&quot;: &quot;CONNSTR_CVMDB&quot;,    &quot;url&quot;: &quot;jdbc:oracle:thin:@&lt;host&gt;:&lt;port&gt;:&lt;sid&gt;&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;vpcId&quot;: &quot;&lt;vpcId&gt;&quot;,    &quot;type&quot;: &quot;ORACLE&quot;}mongodb:    advanceParams(自定义参数，会拼接至url后){    &quot;advanceParams&quot;: [        {            &quot;key&quot;: &quot;authSource&quot;,            &quot;value&quot;: &quot;admin&quot;        }    ],    &quot;db&quot;: &quot;&lt;database&gt;&quot;,    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;type&quot;: &quot;MONGODB&quot;,    &quot;host&quot;: &quot;&lt;host&gt;:&lt;port&gt;&quot;}postgresql:{    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;url&quot;: &quot;jdbc:postgresql://&lt;host&gt;:&lt;port&gt;/&lt;database&gt;&quot;,    &quot;username&quot;: &quot;&lt;username&gt;&quot;,    &quot;password&quot;: &quot;&lt;password&gt;&quot;,    &quot;type&quot;: &quot;POSTGRE&quot;}kafka:    authType:    - sasl    - jaas    - sasl_plaintext    - sasl_ssl    - GSSAPI    ssl:    -PLAIN    -GSSAPI{    &quot;deployType&quot;: &quot;CONNSTR_PUBLICDB&quot;,    &quot;host&quot;: &quot;&lt;host&gt;:&lt;port&gt;&quot;,    &quot;ssl&quot;: &quot;GSSAPI&quot;,    &quot;authType&quot;: &quot;sasl&quot;,    &quot;type&quot;: &quot;KAFKA&quot;,    &quot;principal&quot;: &quot;&lt;principal&gt;&quot;,    &quot;serviceName&quot;: &quot;kafka&quot;}cos:{    &quot;region&quot;: &quot;ap-shanghai&quot;,    &quot;deployType&quot;: &quot;INSTANCE&quot;,    &quot;secretId&quot;: &quot;&lt;secretId&gt;&quot;,    &quot;secretKey&quot;: &quot;&lt;secretKey&gt;&quot;,    &quot;bucket&quot;: &quot;&lt;bucket&gt;&quot;,    &quot;type&quot;: &quot;COS&quot;}</code></pre></p>
     */
    public void setProdConProperties(String ProdConProperties) {
        this.ProdConProperties = ProdConProperties;
    }

    /**
     * Get <p>若项目为标准模式，则此字段必填</p> 
     * @return DevConProperties <p>若项目为标准模式，则此字段必填</p>
     */
    public String getDevConProperties() {
        return this.DevConProperties;
    }

    /**
     * Set <p>若项目为标准模式，则此字段必填</p>
     * @param DevConProperties <p>若项目为标准模式，则此字段必填</p>
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

    public UpdateDataSourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateDataSourceRequest(UpdateDataSourceRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
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
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProdConProperties", this.ProdConProperties);
        this.setParamSimple(map, prefix + "DevConProperties", this.DevConProperties);
        this.setParamObj(map, prefix + "ProdFileUpload.", this.ProdFileUpload);
        this.setParamObj(map, prefix + "DevFileUpload.", this.DevFileUpload);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

