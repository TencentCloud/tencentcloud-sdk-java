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

public class AuditProxyLogItem extends AbstractModel {

    /**
    * <p>SQL 执行时间点（格式化字符串，yyyy-MM-dd HH:mm:ss）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * <p>集群 ID（dcdb/mariadb 集群标识，与 InstanceId 相同）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>影响行数。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AffectRows")
    @Expose
    private Long AffectRows;

    /**
    * <p>是否自动提交。1 表示开启，0 表示关闭。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Autocommit")
    @Expose
    private String Autocommit;

    /**
    * <p>MySQL 网络协议命令类型（如 COM_QUERY、COM_CONNECT 等）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComType")
    @Expose
    private String ComType;

    /**
    * <p>新建连接耗时。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConnTc")
    @Expose
    private Long ConnTc;

    /**
    * <p>后端 DB 实例地址（多个用英文逗号分隔）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DBHost")
    @Expose
    private String DBHost;

    /**
    * <p>SQL 执行所在的数据库名。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DBName")
    @Expose
    private String DBName;

    /**
    * <p>SQL 执行返回的错误码，0 表示成功。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrCode")
    @Expose
    private String ErrCode;

    /**
    * <p>错误信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrInfo")
    @Expose
    private String ErrInfo;

    /**
    * <p>SQL 执行耗时（微秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecTime")
    @Expose
    private Long ExecTime;

    /**
    * <p>请求结束后仍占用的连接数（非事务请求通常为 0）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HoldConns")
    @Expose
    private String HoldConns;

    /**
    * <p>客户端来源 IP。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>是否开启全局一致性读（0 否、1 是）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mc")
    @Expose
    private String Mc;

    /**
    * <p>SQL 开始时间（微秒精度中的微秒部分）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlStartTimeUs")
    @Expose
    private Long SqlStartTimeUs;

    /**
    * <p>本次请求新建的连接数。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NewConnNum")
    @Expose
    private Long NewConnNum;

    /**
    * <p>Proxy 代理节点地址。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyHost")
    @Expose
    private String ProxyHost;

    /**
    * <p>Proxy ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * <p>查询 ID（用于关联查询）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueryId")
    @Expose
    private String QueryId;

    /**
    * <p>返回行数（扫描结果集行数）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SentRows")
    @Expose
    private Long SentRows;

    /**
    * <p>是否为 Proxy 改写后的查询：0 原始查询，1 改写后查询。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Splited")
    @Expose
    private Long Splited;

    /**
    * <p>执行的 SQL 语句原文。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sql")
    @Expose
    private String Sql;

    /**
    * <p>SQL 模板。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlTemplate")
    @Expose
    private String SqlTemplate;

    /**
    * <p>SQL 模板 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlTemplateId")
    @Expose
    private String SqlTemplateId;

    /**
    * <p>SQL 类型（如 Select、Insert、Create、Login、Set 等）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlType")
    @Expose
    private String SqlType;

    /**
    * <p>涉及的表（多表以英文逗号分隔）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tables")
    @Expose
    private String Tables;

    /**
    * <p>线程 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ThreadId")
    @Expose
    private String ThreadId;

    /**
    * <p>SQL 开始时间（毫秒级时间戳）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlStartTime")
    @Expose
    private Long SqlStartTime;

    /**
    * <p>执行 SQL 的数据库用户名。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * <p>客户端连接的 HostPort。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostPort")
    @Expose
    private String HostPort;

    /**
    * <p>Proxy 节点处理线程 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyThread")
    @Expose
    private String ProxyThread;

    /**
    * <p>后端 DB Host 数量。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbHostNum")
    @Expose
    private String DbHostNum;

    /**
    * <p>业务码（由业务侧 SQL 注释中 i/o/p 等 KV 提取）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * <p>业务标签（根据业务码后置补齐）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessTag")
    @Expose
    private String BusinessTag;

    /**
     * Get <p>SQL 执行时间点（格式化字符串，yyyy-MM-dd HH:mm:ss）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timestamp <p>SQL 执行时间点（格式化字符串，yyyy-MM-dd HH:mm:ss）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set <p>SQL 执行时间点（格式化字符串，yyyy-MM-dd HH:mm:ss）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timestamp <p>SQL 执行时间点（格式化字符串，yyyy-MM-dd HH:mm:ss）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get <p>集群 ID（dcdb/mariadb 集群标识，与 InstanceId 相同）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId <p>集群 ID（dcdb/mariadb 集群标识，与 InstanceId 相同）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群 ID（dcdb/mariadb 集群标识，与 InstanceId 相同）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId <p>集群 ID（dcdb/mariadb 集群标识，与 InstanceId 相同）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>影响行数。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AffectRows <p>影响行数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAffectRows() {
        return this.AffectRows;
    }

    /**
     * Set <p>影响行数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AffectRows <p>影响行数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAffectRows(Long AffectRows) {
        this.AffectRows = AffectRows;
    }

    /**
     * Get <p>是否自动提交。1 表示开启，0 表示关闭。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Autocommit <p>是否自动提交。1 表示开启，0 表示关闭。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAutocommit() {
        return this.Autocommit;
    }

    /**
     * Set <p>是否自动提交。1 表示开启，0 表示关闭。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Autocommit <p>是否自动提交。1 表示开启，0 表示关闭。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutocommit(String Autocommit) {
        this.Autocommit = Autocommit;
    }

    /**
     * Get <p>MySQL 网络协议命令类型（如 COM_QUERY、COM_CONNECT 等）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComType <p>MySQL 网络协议命令类型（如 COM_QUERY、COM_CONNECT 等）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComType() {
        return this.ComType;
    }

    /**
     * Set <p>MySQL 网络协议命令类型（如 COM_QUERY、COM_CONNECT 等）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComType <p>MySQL 网络协议命令类型（如 COM_QUERY、COM_CONNECT 等）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComType(String ComType) {
        this.ComType = ComType;
    }

    /**
     * Get <p>新建连接耗时。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConnTc <p>新建连接耗时。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConnTc() {
        return this.ConnTc;
    }

    /**
     * Set <p>新建连接耗时。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConnTc <p>新建连接耗时。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConnTc(Long ConnTc) {
        this.ConnTc = ConnTc;
    }

    /**
     * Get <p>后端 DB 实例地址（多个用英文逗号分隔）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DBHost <p>后端 DB 实例地址（多个用英文逗号分隔）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDBHost() {
        return this.DBHost;
    }

    /**
     * Set <p>后端 DB 实例地址（多个用英文逗号分隔）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DBHost <p>后端 DB 实例地址（多个用英文逗号分隔）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDBHost(String DBHost) {
        this.DBHost = DBHost;
    }

    /**
     * Get <p>SQL 执行所在的数据库名。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DBName <p>SQL 执行所在的数据库名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * Set <p>SQL 执行所在的数据库名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DBName <p>SQL 执行所在的数据库名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDBName(String DBName) {
        this.DBName = DBName;
    }

    /**
     * Get <p>SQL 执行返回的错误码，0 表示成功。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrCode <p>SQL 执行返回的错误码，0 表示成功。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>SQL 执行返回的错误码，0 表示成功。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrCode <p>SQL 执行返回的错误码，0 表示成功。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrCode(String ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get <p>错误信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrInfo <p>错误信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrInfo() {
        return this.ErrInfo;
    }

    /**
     * Set <p>错误信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrInfo <p>错误信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrInfo(String ErrInfo) {
        this.ErrInfo = ErrInfo;
    }

    /**
     * Get <p>SQL 执行耗时（微秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecTime <p>SQL 执行耗时（微秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExecTime() {
        return this.ExecTime;
    }

    /**
     * Set <p>SQL 执行耗时（微秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecTime <p>SQL 执行耗时（微秒）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecTime(Long ExecTime) {
        this.ExecTime = ExecTime;
    }

    /**
     * Get <p>请求结束后仍占用的连接数（非事务请求通常为 0）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HoldConns <p>请求结束后仍占用的连接数（非事务请求通常为 0）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHoldConns() {
        return this.HoldConns;
    }

    /**
     * Set <p>请求结束后仍占用的连接数（非事务请求通常为 0）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HoldConns <p>请求结束后仍占用的连接数（非事务请求通常为 0）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHoldConns(String HoldConns) {
        this.HoldConns = HoldConns;
    }

    /**
     * Get <p>客户端来源 IP。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Host <p>客户端来源 IP。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>客户端来源 IP。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Host <p>客户端来源 IP。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>是否开启全局一致性读（0 否、1 是）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mc <p>是否开启全局一致性读（0 否、1 是）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMc() {
        return this.Mc;
    }

    /**
     * Set <p>是否开启全局一致性读（0 否、1 是）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mc <p>是否开启全局一致性读（0 否、1 是）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMc(String Mc) {
        this.Mc = Mc;
    }

    /**
     * Get <p>SQL 开始时间（微秒精度中的微秒部分）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlStartTimeUs <p>SQL 开始时间（微秒精度中的微秒部分）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSqlStartTimeUs() {
        return this.SqlStartTimeUs;
    }

    /**
     * Set <p>SQL 开始时间（微秒精度中的微秒部分）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlStartTimeUs <p>SQL 开始时间（微秒精度中的微秒部分）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlStartTimeUs(Long SqlStartTimeUs) {
        this.SqlStartTimeUs = SqlStartTimeUs;
    }

    /**
     * Get <p>本次请求新建的连接数。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NewConnNum <p>本次请求新建的连接数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNewConnNum() {
        return this.NewConnNum;
    }

    /**
     * Set <p>本次请求新建的连接数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NewConnNum <p>本次请求新建的连接数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNewConnNum(Long NewConnNum) {
        this.NewConnNum = NewConnNum;
    }

    /**
     * Get <p>Proxy 代理节点地址。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyHost <p>Proxy 代理节点地址。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProxyHost() {
        return this.ProxyHost;
    }

    /**
     * Set <p>Proxy 代理节点地址。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyHost <p>Proxy 代理节点地址。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyHost(String ProxyHost) {
        this.ProxyHost = ProxyHost;
    }

    /**
     * Get <p>Proxy ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyId <p>Proxy ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set <p>Proxy ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyId <p>Proxy ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get <p>查询 ID（用于关联查询）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueryId <p>查询 ID（用于关联查询）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueryId() {
        return this.QueryId;
    }

    /**
     * Set <p>查询 ID（用于关联查询）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueryId <p>查询 ID（用于关联查询）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueryId(String QueryId) {
        this.QueryId = QueryId;
    }

    /**
     * Get <p>返回行数（扫描结果集行数）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SentRows <p>返回行数（扫描结果集行数）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSentRows() {
        return this.SentRows;
    }

    /**
     * Set <p>返回行数（扫描结果集行数）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SentRows <p>返回行数（扫描结果集行数）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSentRows(Long SentRows) {
        this.SentRows = SentRows;
    }

    /**
     * Get <p>是否为 Proxy 改写后的查询：0 原始查询，1 改写后查询。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Splited <p>是否为 Proxy 改写后的查询：0 原始查询，1 改写后查询。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSplited() {
        return this.Splited;
    }

    /**
     * Set <p>是否为 Proxy 改写后的查询：0 原始查询，1 改写后查询。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Splited <p>是否为 Proxy 改写后的查询：0 原始查询，1 改写后查询。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSplited(Long Splited) {
        this.Splited = Splited;
    }

    /**
     * Get <p>执行的 SQL 语句原文。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sql <p>执行的 SQL 语句原文。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSql() {
        return this.Sql;
    }

    /**
     * Set <p>执行的 SQL 语句原文。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sql <p>执行的 SQL 语句原文。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSql(String Sql) {
        this.Sql = Sql;
    }

    /**
     * Get <p>SQL 模板。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlTemplate <p>SQL 模板。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSqlTemplate() {
        return this.SqlTemplate;
    }

    /**
     * Set <p>SQL 模板。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlTemplate <p>SQL 模板。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlTemplate(String SqlTemplate) {
        this.SqlTemplate = SqlTemplate;
    }

    /**
     * Get <p>SQL 模板 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlTemplateId <p>SQL 模板 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSqlTemplateId() {
        return this.SqlTemplateId;
    }

    /**
     * Set <p>SQL 模板 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlTemplateId <p>SQL 模板 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlTemplateId(String SqlTemplateId) {
        this.SqlTemplateId = SqlTemplateId;
    }

    /**
     * Get <p>SQL 类型（如 Select、Insert、Create、Login、Set 等）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlType <p>SQL 类型（如 Select、Insert、Create、Login、Set 等）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSqlType() {
        return this.SqlType;
    }

    /**
     * Set <p>SQL 类型（如 Select、Insert、Create、Login、Set 等）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlType <p>SQL 类型（如 Select、Insert、Create、Login、Set 等）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlType(String SqlType) {
        this.SqlType = SqlType;
    }

    /**
     * Get <p>涉及的表（多表以英文逗号分隔）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tables <p>涉及的表（多表以英文逗号分隔）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTables() {
        return this.Tables;
    }

    /**
     * Set <p>涉及的表（多表以英文逗号分隔）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tables <p>涉及的表（多表以英文逗号分隔）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTables(String Tables) {
        this.Tables = Tables;
    }

    /**
     * Get <p>线程 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ThreadId <p>线程 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getThreadId() {
        return this.ThreadId;
    }

    /**
     * Set <p>线程 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ThreadId <p>线程 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThreadId(String ThreadId) {
        this.ThreadId = ThreadId;
    }

    /**
     * Get <p>SQL 开始时间（毫秒级时间戳）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlStartTime <p>SQL 开始时间（毫秒级时间戳）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSqlStartTime() {
        return this.SqlStartTime;
    }

    /**
     * Set <p>SQL 开始时间（毫秒级时间戳）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlStartTime <p>SQL 开始时间（毫秒级时间戳）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlStartTime(Long SqlStartTime) {
        this.SqlStartTime = SqlStartTime;
    }

    /**
     * Get <p>执行 SQL 的数据库用户名。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return User <p>执行 SQL 的数据库用户名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set <p>执行 SQL 的数据库用户名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param User <p>执行 SQL 的数据库用户名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get <p>客户端连接的 HostPort。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostPort <p>客户端连接的 HostPort。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostPort() {
        return this.HostPort;
    }

    /**
     * Set <p>客户端连接的 HostPort。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostPort <p>客户端连接的 HostPort。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostPort(String HostPort) {
        this.HostPort = HostPort;
    }

    /**
     * Get <p>Proxy 节点处理线程 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyThread <p>Proxy 节点处理线程 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProxyThread() {
        return this.ProxyThread;
    }

    /**
     * Set <p>Proxy 节点处理线程 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyThread <p>Proxy 节点处理线程 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyThread(String ProxyThread) {
        this.ProxyThread = ProxyThread;
    }

    /**
     * Get <p>后端 DB Host 数量。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbHostNum <p>后端 DB Host 数量。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbHostNum() {
        return this.DbHostNum;
    }

    /**
     * Set <p>后端 DB Host 数量。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbHostNum <p>后端 DB Host 数量。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbHostNum(String DbHostNum) {
        this.DbHostNum = DbHostNum;
    }

    /**
     * Get <p>业务码（由业务侧 SQL 注释中 i/o/p 等 KV 提取）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessCode <p>业务码（由业务侧 SQL 注释中 i/o/p 等 KV 提取）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set <p>业务码（由业务侧 SQL 注释中 i/o/p 等 KV 提取）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessCode <p>业务码（由业务侧 SQL 注释中 i/o/p 等 KV 提取）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get <p>业务标签（根据业务码后置补齐）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessTag <p>业务标签（根据业务码后置补齐）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessTag() {
        return this.BusinessTag;
    }

    /**
     * Set <p>业务标签（根据业务码后置补齐）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessTag <p>业务标签（根据业务码后置补齐）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessTag(String BusinessTag) {
        this.BusinessTag = BusinessTag;
    }

    public AuditProxyLogItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditProxyLogItem(AuditProxyLogItem source) {
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AffectRows != null) {
            this.AffectRows = new Long(source.AffectRows);
        }
        if (source.Autocommit != null) {
            this.Autocommit = new String(source.Autocommit);
        }
        if (source.ComType != null) {
            this.ComType = new String(source.ComType);
        }
        if (source.ConnTc != null) {
            this.ConnTc = new Long(source.ConnTc);
        }
        if (source.DBHost != null) {
            this.DBHost = new String(source.DBHost);
        }
        if (source.DBName != null) {
            this.DBName = new String(source.DBName);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new String(source.ErrCode);
        }
        if (source.ErrInfo != null) {
            this.ErrInfo = new String(source.ErrInfo);
        }
        if (source.ExecTime != null) {
            this.ExecTime = new Long(source.ExecTime);
        }
        if (source.HoldConns != null) {
            this.HoldConns = new String(source.HoldConns);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Mc != null) {
            this.Mc = new String(source.Mc);
        }
        if (source.SqlStartTimeUs != null) {
            this.SqlStartTimeUs = new Long(source.SqlStartTimeUs);
        }
        if (source.NewConnNum != null) {
            this.NewConnNum = new Long(source.NewConnNum);
        }
        if (source.ProxyHost != null) {
            this.ProxyHost = new String(source.ProxyHost);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.QueryId != null) {
            this.QueryId = new String(source.QueryId);
        }
        if (source.SentRows != null) {
            this.SentRows = new Long(source.SentRows);
        }
        if (source.Splited != null) {
            this.Splited = new Long(source.Splited);
        }
        if (source.Sql != null) {
            this.Sql = new String(source.Sql);
        }
        if (source.SqlTemplate != null) {
            this.SqlTemplate = new String(source.SqlTemplate);
        }
        if (source.SqlTemplateId != null) {
            this.SqlTemplateId = new String(source.SqlTemplateId);
        }
        if (source.SqlType != null) {
            this.SqlType = new String(source.SqlType);
        }
        if (source.Tables != null) {
            this.Tables = new String(source.Tables);
        }
        if (source.ThreadId != null) {
            this.ThreadId = new String(source.ThreadId);
        }
        if (source.SqlStartTime != null) {
            this.SqlStartTime = new Long(source.SqlStartTime);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.HostPort != null) {
            this.HostPort = new String(source.HostPort);
        }
        if (source.ProxyThread != null) {
            this.ProxyThread = new String(source.ProxyThread);
        }
        if (source.DbHostNum != null) {
            this.DbHostNum = new String(source.DbHostNum);
        }
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
        if (source.BusinessTag != null) {
            this.BusinessTag = new String(source.BusinessTag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "AffectRows", this.AffectRows);
        this.setParamSimple(map, prefix + "Autocommit", this.Autocommit);
        this.setParamSimple(map, prefix + "ComType", this.ComType);
        this.setParamSimple(map, prefix + "ConnTc", this.ConnTc);
        this.setParamSimple(map, prefix + "DBHost", this.DBHost);
        this.setParamSimple(map, prefix + "DBName", this.DBName);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrInfo", this.ErrInfo);
        this.setParamSimple(map, prefix + "ExecTime", this.ExecTime);
        this.setParamSimple(map, prefix + "HoldConns", this.HoldConns);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Mc", this.Mc);
        this.setParamSimple(map, prefix + "SqlStartTimeUs", this.SqlStartTimeUs);
        this.setParamSimple(map, prefix + "NewConnNum", this.NewConnNum);
        this.setParamSimple(map, prefix + "ProxyHost", this.ProxyHost);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "QueryId", this.QueryId);
        this.setParamSimple(map, prefix + "SentRows", this.SentRows);
        this.setParamSimple(map, prefix + "Splited", this.Splited);
        this.setParamSimple(map, prefix + "Sql", this.Sql);
        this.setParamSimple(map, prefix + "SqlTemplate", this.SqlTemplate);
        this.setParamSimple(map, prefix + "SqlTemplateId", this.SqlTemplateId);
        this.setParamSimple(map, prefix + "SqlType", this.SqlType);
        this.setParamSimple(map, prefix + "Tables", this.Tables);
        this.setParamSimple(map, prefix + "ThreadId", this.ThreadId);
        this.setParamSimple(map, prefix + "SqlStartTime", this.SqlStartTime);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "HostPort", this.HostPort);
        this.setParamSimple(map, prefix + "ProxyThread", this.ProxyThread);
        this.setParamSimple(map, prefix + "DbHostNum", this.DbHostNum);
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "BusinessTag", this.BusinessTag);

    }
}

