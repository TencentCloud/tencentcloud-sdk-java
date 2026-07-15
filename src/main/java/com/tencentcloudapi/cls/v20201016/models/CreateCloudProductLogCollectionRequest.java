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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCloudProductLogCollectionRequest extends AbstractModel {

    /**
    * <p>实例ID</p><ul><li>通过各个接入云产品官方文档获取</li></ul>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>云产品标识。支持以下产品</p><ul><li>APIS</li><li>BH</li><li>CDB</li><li>CDS</li><li>CFS</li><li>CLB</li><li>CSIP</li><li>CWP</li><li>DCDB</li><li>DNSPod</li><li>EMR</li><li>HTTPDNS</li><li>KHL</li><li>llmsgw</li><li>MariaDB</li><li>MDP</li><li>MongoDB</li><li>PostgreSQL</li><li>TCSS</li><li>TDSQL-C</li><li>TDStore</li><li>TencentDB-Redis</li><li>TEO</li><li>TokenHub</li><li>TSE</li></ul>
    */
    @SerializedName("AssumerName")
    @Expose
    private String AssumerName;

    /**
    * <p>各云产品支持的日志类型如下：</p><table><thead><tr><th>assumer_name</th><th>支持的 log_type</th></tr></thead><tbody><tr><td>APIS</td><td>APIS-ACCESS</td></tr><tr><td>BH</td><td>BH-COMMANDLOG, BH-FILELOG</td></tr><tr><td>CDB</td><td>CDB-AUDIT</td></tr><tr><td>CDS</td><td>CDS-AUDIT, CDS-RISK</td></tr><tr><td>CFS</td><td>CFS-AUDIT</td></tr><tr><td>CLB</td><td>CMR-SPEND</td></tr><tr><td>CSIP</td><td>CSIP</td></tr><tr><td>CWP</td><td>CWP</td></tr><tr><td>DCDB</td><td>DCDB-AUDIT, DCDB-ERROR, DCDB-SLOW</td></tr><tr><td>DNSPod</td><td>DNSPod-RESOLVELOG</td></tr><tr><td>EMR</td><td>EMR-OPERATION</td></tr><tr><td>HTTPDNS</td><td>HTTPDNS-RESOLVELOG</td></tr><tr><td>MariaDB</td><td>MariaDB-AUDIT, MariaDB-ERROR, MariaDB-SLOW</td></tr><tr><td>MDP</td><td>MDP-SSAI</td></tr><tr><td>MongoDB</td><td>MongoDB-AUDIT, MongoDB-ErrorLog, MongoDB-OperationLog, MongoDB-SlowLog</td></tr><tr><td>PostgreSQL</td><td>PostgreSQL-AUDIT, PostgreSQL-ERROR, PostgreSQL-SLOW</td></tr><tr><td>TCSS</td><td>TCSS</td></tr><tr><td>TDSQL-C</td><td>TDSQL-C-AUDIT</td></tr><tr><td>TDStore</td><td>TDMYSQL-SLOW</td></tr><tr><td>TencentDB-Redis</td><td>Redis-AUDIT, Redis-ERROR, Redis-SLOW</td></tr><tr><td>TEO</td><td>TEO-INEFERENCE</td></tr><tr><td>llmsgw</td><td>llmsgw-mcp-security-alarm</td></tr></tbody></table>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>云产品地域。不同 LogType 入参格式存在差异：</p><p><strong>格式 A：短 region 码</strong>（gz / sh / bj …）</p><ul><li>APIS 全部日志类型：如 <code>gz</code></li><li>CDB-AUDIT</li><li>TDSQL-C-AUDIT</li><li>TDMYSQL-SLOW</li><li>DCDB 全部日志类型</li><li>MariaDB 全部日志类型</li><li>PostgreSQL 全部日志类型</li><li>MongoDB-AUDIT（<strong>注意与 SlowLog/ErrorLog/OperationLog 不同</strong>）</li><li>TencentDB-Redis 全部日志类型</li><li>EMR-OPERATION</li></ul><p><strong>格式 B：长 region 码</strong>（ap-guangzhou / ap-shanghai / ap-singapore …）</p><ul><li>CDS 全部日志类型：如 <code>ap-guangzhou</code></li><li>MongoDB-SlowLog / MongoDB-ErrorLog / MongoDB-OperationLog</li><li>DNSPod-RESOLVELOG</li><li>HTTPDNS-RESOLVELOG</li><li>MDP-SSAI</li><li>CFS-AUDIT</li><li>TEO-INEFERENCE</li><li>TokenHub-ActivityLog / TokenHub-AuditLog</li><li>llmsgw-mcp-security-alarm</li><li>CSIP / TCSS / TSE / CWP / KHL 等</li></ul><p><strong>格式 C：BH 专用 Polaris 名</strong></p><ul><li>BH 全部日志类型：<code>overseas-polaris</code>（中国香港及其他海外）/ <code>fsi-polaris</code>（金融区）/ <code>general-polaris</code>（普通区）/ <code>intl-sg-prod</code>（国际站）</li></ul>
    */
    @SerializedName("CloudProductRegion")
    @Expose
    private String CloudProductRegion;

    /**
    * <p>CLS目标地域</p><ul><li>支持地域参考  <a href="https://cloud.tencent.com/document/api/614/56474#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">地域列表</a> 文档</li></ul>
    */
    @SerializedName("ClsRegion")
    @Expose
    private String ClsRegion;

    /**
    * <p>日志集名称，未填LogsetId时必填。若日志集不存在, 将自动创建</p>
    */
    @SerializedName("LogsetName")
    @Expose
    private String LogsetName;

    /**
    * <p>日志主题名称，在未填TopicId时必填。 若日志主题不存在，将自动创建</p>
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * <p>日志配置扩展信息， 一般用于存储额外的日志投递配置</p>
    */
    @SerializedName("Extend")
    @Expose
    private String Extend;

    /**
    * <p>日志集id</p><ul><li>通过<a href="https://cloud.tencent.com/document/api/614/58624">获取日志集列表</a>获取日志集Id。</li></ul>
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * <p>日志主题id</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>标签描述列表，通过指定该参数可以同时绑定标签到相应的主题。最大支持10个标签键值对，同一个资源只能绑定到同一个标签键下。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get <p>实例ID</p><ul><li>通过各个接入云产品官方文档获取</li></ul> 
     * @return InstanceId <p>实例ID</p><ul><li>通过各个接入云产品官方文档获取</li></ul>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p><ul><li>通过各个接入云产品官方文档获取</li></ul>
     * @param InstanceId <p>实例ID</p><ul><li>通过各个接入云产品官方文档获取</li></ul>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>云产品标识。支持以下产品</p><ul><li>APIS</li><li>BH</li><li>CDB</li><li>CDS</li><li>CFS</li><li>CLB</li><li>CSIP</li><li>CWP</li><li>DCDB</li><li>DNSPod</li><li>EMR</li><li>HTTPDNS</li><li>KHL</li><li>llmsgw</li><li>MariaDB</li><li>MDP</li><li>MongoDB</li><li>PostgreSQL</li><li>TCSS</li><li>TDSQL-C</li><li>TDStore</li><li>TencentDB-Redis</li><li>TEO</li><li>TokenHub</li><li>TSE</li></ul> 
     * @return AssumerName <p>云产品标识。支持以下产品</p><ul><li>APIS</li><li>BH</li><li>CDB</li><li>CDS</li><li>CFS</li><li>CLB</li><li>CSIP</li><li>CWP</li><li>DCDB</li><li>DNSPod</li><li>EMR</li><li>HTTPDNS</li><li>KHL</li><li>llmsgw</li><li>MariaDB</li><li>MDP</li><li>MongoDB</li><li>PostgreSQL</li><li>TCSS</li><li>TDSQL-C</li><li>TDStore</li><li>TencentDB-Redis</li><li>TEO</li><li>TokenHub</li><li>TSE</li></ul>
     */
    public String getAssumerName() {
        return this.AssumerName;
    }

    /**
     * Set <p>云产品标识。支持以下产品</p><ul><li>APIS</li><li>BH</li><li>CDB</li><li>CDS</li><li>CFS</li><li>CLB</li><li>CSIP</li><li>CWP</li><li>DCDB</li><li>DNSPod</li><li>EMR</li><li>HTTPDNS</li><li>KHL</li><li>llmsgw</li><li>MariaDB</li><li>MDP</li><li>MongoDB</li><li>PostgreSQL</li><li>TCSS</li><li>TDSQL-C</li><li>TDStore</li><li>TencentDB-Redis</li><li>TEO</li><li>TokenHub</li><li>TSE</li></ul>
     * @param AssumerName <p>云产品标识。支持以下产品</p><ul><li>APIS</li><li>BH</li><li>CDB</li><li>CDS</li><li>CFS</li><li>CLB</li><li>CSIP</li><li>CWP</li><li>DCDB</li><li>DNSPod</li><li>EMR</li><li>HTTPDNS</li><li>KHL</li><li>llmsgw</li><li>MariaDB</li><li>MDP</li><li>MongoDB</li><li>PostgreSQL</li><li>TCSS</li><li>TDSQL-C</li><li>TDStore</li><li>TencentDB-Redis</li><li>TEO</li><li>TokenHub</li><li>TSE</li></ul>
     */
    public void setAssumerName(String AssumerName) {
        this.AssumerName = AssumerName;
    }

    /**
     * Get <p>各云产品支持的日志类型如下：</p><table><thead><tr><th>assumer_name</th><th>支持的 log_type</th></tr></thead><tbody><tr><td>APIS</td><td>APIS-ACCESS</td></tr><tr><td>BH</td><td>BH-COMMANDLOG, BH-FILELOG</td></tr><tr><td>CDB</td><td>CDB-AUDIT</td></tr><tr><td>CDS</td><td>CDS-AUDIT, CDS-RISK</td></tr><tr><td>CFS</td><td>CFS-AUDIT</td></tr><tr><td>CLB</td><td>CMR-SPEND</td></tr><tr><td>CSIP</td><td>CSIP</td></tr><tr><td>CWP</td><td>CWP</td></tr><tr><td>DCDB</td><td>DCDB-AUDIT, DCDB-ERROR, DCDB-SLOW</td></tr><tr><td>DNSPod</td><td>DNSPod-RESOLVELOG</td></tr><tr><td>EMR</td><td>EMR-OPERATION</td></tr><tr><td>HTTPDNS</td><td>HTTPDNS-RESOLVELOG</td></tr><tr><td>MariaDB</td><td>MariaDB-AUDIT, MariaDB-ERROR, MariaDB-SLOW</td></tr><tr><td>MDP</td><td>MDP-SSAI</td></tr><tr><td>MongoDB</td><td>MongoDB-AUDIT, MongoDB-ErrorLog, MongoDB-OperationLog, MongoDB-SlowLog</td></tr><tr><td>PostgreSQL</td><td>PostgreSQL-AUDIT, PostgreSQL-ERROR, PostgreSQL-SLOW</td></tr><tr><td>TCSS</td><td>TCSS</td></tr><tr><td>TDSQL-C</td><td>TDSQL-C-AUDIT</td></tr><tr><td>TDStore</td><td>TDMYSQL-SLOW</td></tr><tr><td>TencentDB-Redis</td><td>Redis-AUDIT, Redis-ERROR, Redis-SLOW</td></tr><tr><td>TEO</td><td>TEO-INEFERENCE</td></tr><tr><td>llmsgw</td><td>llmsgw-mcp-security-alarm</td></tr></tbody></table> 
     * @return LogType <p>各云产品支持的日志类型如下：</p><table><thead><tr><th>assumer_name</th><th>支持的 log_type</th></tr></thead><tbody><tr><td>APIS</td><td>APIS-ACCESS</td></tr><tr><td>BH</td><td>BH-COMMANDLOG, BH-FILELOG</td></tr><tr><td>CDB</td><td>CDB-AUDIT</td></tr><tr><td>CDS</td><td>CDS-AUDIT, CDS-RISK</td></tr><tr><td>CFS</td><td>CFS-AUDIT</td></tr><tr><td>CLB</td><td>CMR-SPEND</td></tr><tr><td>CSIP</td><td>CSIP</td></tr><tr><td>CWP</td><td>CWP</td></tr><tr><td>DCDB</td><td>DCDB-AUDIT, DCDB-ERROR, DCDB-SLOW</td></tr><tr><td>DNSPod</td><td>DNSPod-RESOLVELOG</td></tr><tr><td>EMR</td><td>EMR-OPERATION</td></tr><tr><td>HTTPDNS</td><td>HTTPDNS-RESOLVELOG</td></tr><tr><td>MariaDB</td><td>MariaDB-AUDIT, MariaDB-ERROR, MariaDB-SLOW</td></tr><tr><td>MDP</td><td>MDP-SSAI</td></tr><tr><td>MongoDB</td><td>MongoDB-AUDIT, MongoDB-ErrorLog, MongoDB-OperationLog, MongoDB-SlowLog</td></tr><tr><td>PostgreSQL</td><td>PostgreSQL-AUDIT, PostgreSQL-ERROR, PostgreSQL-SLOW</td></tr><tr><td>TCSS</td><td>TCSS</td></tr><tr><td>TDSQL-C</td><td>TDSQL-C-AUDIT</td></tr><tr><td>TDStore</td><td>TDMYSQL-SLOW</td></tr><tr><td>TencentDB-Redis</td><td>Redis-AUDIT, Redis-ERROR, Redis-SLOW</td></tr><tr><td>TEO</td><td>TEO-INEFERENCE</td></tr><tr><td>llmsgw</td><td>llmsgw-mcp-security-alarm</td></tr></tbody></table>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>各云产品支持的日志类型如下：</p><table><thead><tr><th>assumer_name</th><th>支持的 log_type</th></tr></thead><tbody><tr><td>APIS</td><td>APIS-ACCESS</td></tr><tr><td>BH</td><td>BH-COMMANDLOG, BH-FILELOG</td></tr><tr><td>CDB</td><td>CDB-AUDIT</td></tr><tr><td>CDS</td><td>CDS-AUDIT, CDS-RISK</td></tr><tr><td>CFS</td><td>CFS-AUDIT</td></tr><tr><td>CLB</td><td>CMR-SPEND</td></tr><tr><td>CSIP</td><td>CSIP</td></tr><tr><td>CWP</td><td>CWP</td></tr><tr><td>DCDB</td><td>DCDB-AUDIT, DCDB-ERROR, DCDB-SLOW</td></tr><tr><td>DNSPod</td><td>DNSPod-RESOLVELOG</td></tr><tr><td>EMR</td><td>EMR-OPERATION</td></tr><tr><td>HTTPDNS</td><td>HTTPDNS-RESOLVELOG</td></tr><tr><td>MariaDB</td><td>MariaDB-AUDIT, MariaDB-ERROR, MariaDB-SLOW</td></tr><tr><td>MDP</td><td>MDP-SSAI</td></tr><tr><td>MongoDB</td><td>MongoDB-AUDIT, MongoDB-ErrorLog, MongoDB-OperationLog, MongoDB-SlowLog</td></tr><tr><td>PostgreSQL</td><td>PostgreSQL-AUDIT, PostgreSQL-ERROR, PostgreSQL-SLOW</td></tr><tr><td>TCSS</td><td>TCSS</td></tr><tr><td>TDSQL-C</td><td>TDSQL-C-AUDIT</td></tr><tr><td>TDStore</td><td>TDMYSQL-SLOW</td></tr><tr><td>TencentDB-Redis</td><td>Redis-AUDIT, Redis-ERROR, Redis-SLOW</td></tr><tr><td>TEO</td><td>TEO-INEFERENCE</td></tr><tr><td>llmsgw</td><td>llmsgw-mcp-security-alarm</td></tr></tbody></table>
     * @param LogType <p>各云产品支持的日志类型如下：</p><table><thead><tr><th>assumer_name</th><th>支持的 log_type</th></tr></thead><tbody><tr><td>APIS</td><td>APIS-ACCESS</td></tr><tr><td>BH</td><td>BH-COMMANDLOG, BH-FILELOG</td></tr><tr><td>CDB</td><td>CDB-AUDIT</td></tr><tr><td>CDS</td><td>CDS-AUDIT, CDS-RISK</td></tr><tr><td>CFS</td><td>CFS-AUDIT</td></tr><tr><td>CLB</td><td>CMR-SPEND</td></tr><tr><td>CSIP</td><td>CSIP</td></tr><tr><td>CWP</td><td>CWP</td></tr><tr><td>DCDB</td><td>DCDB-AUDIT, DCDB-ERROR, DCDB-SLOW</td></tr><tr><td>DNSPod</td><td>DNSPod-RESOLVELOG</td></tr><tr><td>EMR</td><td>EMR-OPERATION</td></tr><tr><td>HTTPDNS</td><td>HTTPDNS-RESOLVELOG</td></tr><tr><td>MariaDB</td><td>MariaDB-AUDIT, MariaDB-ERROR, MariaDB-SLOW</td></tr><tr><td>MDP</td><td>MDP-SSAI</td></tr><tr><td>MongoDB</td><td>MongoDB-AUDIT, MongoDB-ErrorLog, MongoDB-OperationLog, MongoDB-SlowLog</td></tr><tr><td>PostgreSQL</td><td>PostgreSQL-AUDIT, PostgreSQL-ERROR, PostgreSQL-SLOW</td></tr><tr><td>TCSS</td><td>TCSS</td></tr><tr><td>TDSQL-C</td><td>TDSQL-C-AUDIT</td></tr><tr><td>TDStore</td><td>TDMYSQL-SLOW</td></tr><tr><td>TencentDB-Redis</td><td>Redis-AUDIT, Redis-ERROR, Redis-SLOW</td></tr><tr><td>TEO</td><td>TEO-INEFERENCE</td></tr><tr><td>llmsgw</td><td>llmsgw-mcp-security-alarm</td></tr></tbody></table>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>云产品地域。不同 LogType 入参格式存在差异：</p><p><strong>格式 A：短 region 码</strong>（gz / sh / bj …）</p><ul><li>APIS 全部日志类型：如 <code>gz</code></li><li>CDB-AUDIT</li><li>TDSQL-C-AUDIT</li><li>TDMYSQL-SLOW</li><li>DCDB 全部日志类型</li><li>MariaDB 全部日志类型</li><li>PostgreSQL 全部日志类型</li><li>MongoDB-AUDIT（<strong>注意与 SlowLog/ErrorLog/OperationLog 不同</strong>）</li><li>TencentDB-Redis 全部日志类型</li><li>EMR-OPERATION</li></ul><p><strong>格式 B：长 region 码</strong>（ap-guangzhou / ap-shanghai / ap-singapore …）</p><ul><li>CDS 全部日志类型：如 <code>ap-guangzhou</code></li><li>MongoDB-SlowLog / MongoDB-ErrorLog / MongoDB-OperationLog</li><li>DNSPod-RESOLVELOG</li><li>HTTPDNS-RESOLVELOG</li><li>MDP-SSAI</li><li>CFS-AUDIT</li><li>TEO-INEFERENCE</li><li>TokenHub-ActivityLog / TokenHub-AuditLog</li><li>llmsgw-mcp-security-alarm</li><li>CSIP / TCSS / TSE / CWP / KHL 等</li></ul><p><strong>格式 C：BH 专用 Polaris 名</strong></p><ul><li>BH 全部日志类型：<code>overseas-polaris</code>（中国香港及其他海外）/ <code>fsi-polaris</code>（金融区）/ <code>general-polaris</code>（普通区）/ <code>intl-sg-prod</code>（国际站）</li></ul> 
     * @return CloudProductRegion <p>云产品地域。不同 LogType 入参格式存在差异：</p><p><strong>格式 A：短 region 码</strong>（gz / sh / bj …）</p><ul><li>APIS 全部日志类型：如 <code>gz</code></li><li>CDB-AUDIT</li><li>TDSQL-C-AUDIT</li><li>TDMYSQL-SLOW</li><li>DCDB 全部日志类型</li><li>MariaDB 全部日志类型</li><li>PostgreSQL 全部日志类型</li><li>MongoDB-AUDIT（<strong>注意与 SlowLog/ErrorLog/OperationLog 不同</strong>）</li><li>TencentDB-Redis 全部日志类型</li><li>EMR-OPERATION</li></ul><p><strong>格式 B：长 region 码</strong>（ap-guangzhou / ap-shanghai / ap-singapore …）</p><ul><li>CDS 全部日志类型：如 <code>ap-guangzhou</code></li><li>MongoDB-SlowLog / MongoDB-ErrorLog / MongoDB-OperationLog</li><li>DNSPod-RESOLVELOG</li><li>HTTPDNS-RESOLVELOG</li><li>MDP-SSAI</li><li>CFS-AUDIT</li><li>TEO-INEFERENCE</li><li>TokenHub-ActivityLog / TokenHub-AuditLog</li><li>llmsgw-mcp-security-alarm</li><li>CSIP / TCSS / TSE / CWP / KHL 等</li></ul><p><strong>格式 C：BH 专用 Polaris 名</strong></p><ul><li>BH 全部日志类型：<code>overseas-polaris</code>（中国香港及其他海外）/ <code>fsi-polaris</code>（金融区）/ <code>general-polaris</code>（普通区）/ <code>intl-sg-prod</code>（国际站）</li></ul>
     */
    public String getCloudProductRegion() {
        return this.CloudProductRegion;
    }

    /**
     * Set <p>云产品地域。不同 LogType 入参格式存在差异：</p><p><strong>格式 A：短 region 码</strong>（gz / sh / bj …）</p><ul><li>APIS 全部日志类型：如 <code>gz</code></li><li>CDB-AUDIT</li><li>TDSQL-C-AUDIT</li><li>TDMYSQL-SLOW</li><li>DCDB 全部日志类型</li><li>MariaDB 全部日志类型</li><li>PostgreSQL 全部日志类型</li><li>MongoDB-AUDIT（<strong>注意与 SlowLog/ErrorLog/OperationLog 不同</strong>）</li><li>TencentDB-Redis 全部日志类型</li><li>EMR-OPERATION</li></ul><p><strong>格式 B：长 region 码</strong>（ap-guangzhou / ap-shanghai / ap-singapore …）</p><ul><li>CDS 全部日志类型：如 <code>ap-guangzhou</code></li><li>MongoDB-SlowLog / MongoDB-ErrorLog / MongoDB-OperationLog</li><li>DNSPod-RESOLVELOG</li><li>HTTPDNS-RESOLVELOG</li><li>MDP-SSAI</li><li>CFS-AUDIT</li><li>TEO-INEFERENCE</li><li>TokenHub-ActivityLog / TokenHub-AuditLog</li><li>llmsgw-mcp-security-alarm</li><li>CSIP / TCSS / TSE / CWP / KHL 等</li></ul><p><strong>格式 C：BH 专用 Polaris 名</strong></p><ul><li>BH 全部日志类型：<code>overseas-polaris</code>（中国香港及其他海外）/ <code>fsi-polaris</code>（金融区）/ <code>general-polaris</code>（普通区）/ <code>intl-sg-prod</code>（国际站）</li></ul>
     * @param CloudProductRegion <p>云产品地域。不同 LogType 入参格式存在差异：</p><p><strong>格式 A：短 region 码</strong>（gz / sh / bj …）</p><ul><li>APIS 全部日志类型：如 <code>gz</code></li><li>CDB-AUDIT</li><li>TDSQL-C-AUDIT</li><li>TDMYSQL-SLOW</li><li>DCDB 全部日志类型</li><li>MariaDB 全部日志类型</li><li>PostgreSQL 全部日志类型</li><li>MongoDB-AUDIT（<strong>注意与 SlowLog/ErrorLog/OperationLog 不同</strong>）</li><li>TencentDB-Redis 全部日志类型</li><li>EMR-OPERATION</li></ul><p><strong>格式 B：长 region 码</strong>（ap-guangzhou / ap-shanghai / ap-singapore …）</p><ul><li>CDS 全部日志类型：如 <code>ap-guangzhou</code></li><li>MongoDB-SlowLog / MongoDB-ErrorLog / MongoDB-OperationLog</li><li>DNSPod-RESOLVELOG</li><li>HTTPDNS-RESOLVELOG</li><li>MDP-SSAI</li><li>CFS-AUDIT</li><li>TEO-INEFERENCE</li><li>TokenHub-ActivityLog / TokenHub-AuditLog</li><li>llmsgw-mcp-security-alarm</li><li>CSIP / TCSS / TSE / CWP / KHL 等</li></ul><p><strong>格式 C：BH 专用 Polaris 名</strong></p><ul><li>BH 全部日志类型：<code>overseas-polaris</code>（中国香港及其他海外）/ <code>fsi-polaris</code>（金融区）/ <code>general-polaris</code>（普通区）/ <code>intl-sg-prod</code>（国际站）</li></ul>
     */
    public void setCloudProductRegion(String CloudProductRegion) {
        this.CloudProductRegion = CloudProductRegion;
    }

    /**
     * Get <p>CLS目标地域</p><ul><li>支持地域参考  <a href="https://cloud.tencent.com/document/api/614/56474#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">地域列表</a> 文档</li></ul> 
     * @return ClsRegion <p>CLS目标地域</p><ul><li>支持地域参考  <a href="https://cloud.tencent.com/document/api/614/56474#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">地域列表</a> 文档</li></ul>
     */
    public String getClsRegion() {
        return this.ClsRegion;
    }

    /**
     * Set <p>CLS目标地域</p><ul><li>支持地域参考  <a href="https://cloud.tencent.com/document/api/614/56474#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">地域列表</a> 文档</li></ul>
     * @param ClsRegion <p>CLS目标地域</p><ul><li>支持地域参考  <a href="https://cloud.tencent.com/document/api/614/56474#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">地域列表</a> 文档</li></ul>
     */
    public void setClsRegion(String ClsRegion) {
        this.ClsRegion = ClsRegion;
    }

    /**
     * Get <p>日志集名称，未填LogsetId时必填。若日志集不存在, 将自动创建</p> 
     * @return LogsetName <p>日志集名称，未填LogsetId时必填。若日志集不存在, 将自动创建</p>
     */
    public String getLogsetName() {
        return this.LogsetName;
    }

    /**
     * Set <p>日志集名称，未填LogsetId时必填。若日志集不存在, 将自动创建</p>
     * @param LogsetName <p>日志集名称，未填LogsetId时必填。若日志集不存在, 将自动创建</p>
     */
    public void setLogsetName(String LogsetName) {
        this.LogsetName = LogsetName;
    }

    /**
     * Get <p>日志主题名称，在未填TopicId时必填。 若日志主题不存在，将自动创建</p> 
     * @return TopicName <p>日志主题名称，在未填TopicId时必填。 若日志主题不存在，将自动创建</p>
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set <p>日志主题名称，在未填TopicId时必填。 若日志主题不存在，将自动创建</p>
     * @param TopicName <p>日志主题名称，在未填TopicId时必填。 若日志主题不存在，将自动创建</p>
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get <p>日志配置扩展信息， 一般用于存储额外的日志投递配置</p> 
     * @return Extend <p>日志配置扩展信息， 一般用于存储额外的日志投递配置</p>
     */
    public String getExtend() {
        return this.Extend;
    }

    /**
     * Set <p>日志配置扩展信息， 一般用于存储额外的日志投递配置</p>
     * @param Extend <p>日志配置扩展信息， 一般用于存储额外的日志投递配置</p>
     */
    public void setExtend(String Extend) {
        this.Extend = Extend;
    }

    /**
     * Get <p>日志集id</p><ul><li>通过<a href="https://cloud.tencent.com/document/api/614/58624">获取日志集列表</a>获取日志集Id。</li></ul> 
     * @return LogsetId <p>日志集id</p><ul><li>通过<a href="https://cloud.tencent.com/document/api/614/58624">获取日志集列表</a>获取日志集Id。</li></ul>
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set <p>日志集id</p><ul><li>通过<a href="https://cloud.tencent.com/document/api/614/58624">获取日志集列表</a>获取日志集Id。</li></ul>
     * @param LogsetId <p>日志集id</p><ul><li>通过<a href="https://cloud.tencent.com/document/api/614/58624">获取日志集列表</a>获取日志集Id。</li></ul>
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get <p>日志主题id</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul> 
     * @return TopicId <p>日志主题id</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>日志主题id</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul>
     * @param TopicId <p>日志主题id</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>标签描述列表，通过指定该参数可以同时绑定标签到相应的主题。最大支持10个标签键值对，同一个资源只能绑定到同一个标签键下。</p> 
     * @return Tags <p>标签描述列表，通过指定该参数可以同时绑定标签到相应的主题。最大支持10个标签键值对，同一个资源只能绑定到同一个标签键下。</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签描述列表，通过指定该参数可以同时绑定标签到相应的主题。最大支持10个标签键值对，同一个资源只能绑定到同一个标签键下。</p>
     * @param Tags <p>标签描述列表，通过指定该参数可以同时绑定标签到相应的主题。最大支持10个标签键值对，同一个资源只能绑定到同一个标签键下。</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateCloudProductLogCollectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudProductLogCollectionRequest(CreateCloudProductLogCollectionRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AssumerName != null) {
            this.AssumerName = new String(source.AssumerName);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.CloudProductRegion != null) {
            this.CloudProductRegion = new String(source.CloudProductRegion);
        }
        if (source.ClsRegion != null) {
            this.ClsRegion = new String(source.ClsRegion);
        }
        if (source.LogsetName != null) {
            this.LogsetName = new String(source.LogsetName);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Extend != null) {
            this.Extend = new String(source.Extend);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AssumerName", this.AssumerName);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "CloudProductRegion", this.CloudProductRegion);
        this.setParamSimple(map, prefix + "ClsRegion", this.ClsRegion);
        this.setParamSimple(map, prefix + "LogsetName", this.LogsetName);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Extend", this.Extend);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

