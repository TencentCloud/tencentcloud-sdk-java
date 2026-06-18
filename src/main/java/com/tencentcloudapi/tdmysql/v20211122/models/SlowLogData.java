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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlowLogData extends AbstractModel {

    /**
    * <p>Sql的执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * <p>Sql的执行时长（秒）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueryTime")
    @Expose
    private Float QueryTime;

    /**
    * <p>Sql语句</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlText")
    @Expose
    private String SqlText;

    /**
    * <p>客户端地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserHost")
    @Expose
    private String UserHost;

    /**
    * <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>数据库名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * <p>锁时长（秒）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LockTime")
    @Expose
    private Float LockTime;

    /**
    * <p>扫描行数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RowsExamined")
    @Expose
    private Long RowsExamined;

    /**
    * <p>结果集行数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RowsSent")
    @Expose
    private Long RowsSent;

    /**
    * <p>事物ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransactionId")
    @Expose
    private String TransactionId;

    /**
    * <p>rpc耗时</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RpcTime")
    @Expose
    private Float RpcTime;

    /**
    * <p>与存储节点交互rpc耗时</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageRpcTime")
    @Expose
    private Float StorageRpcTime;

    /**
    * <p>rpc重试延迟耗时</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RpcRetryDelayTime")
    @Expose
    private Float RpcRetryDelayTime;

    /**
    * <p>node名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * <p>rpc 链路追踪</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RpcTrace")
    @Expose
    private String RpcTrace;

    /**
    * <p>TDStore锁时长</p><p>单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TDStoreLockTime")
    @Expose
    private Float TDStoreLockTime;

    /**
    * <p>全局标识ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TraceId")
    @Expose
    private String TraceId;

    /**
    * <p>执行计划</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Explain")
    @Expose
    private Explain [] Explain;

    /**
     * Get <p>Sql的执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timestamp <p>Sql的执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set <p>Sql的执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timestamp <p>Sql的执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get <p>Sql的执行时长（秒）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueryTime <p>Sql的执行时长（秒）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getQueryTime() {
        return this.QueryTime;
    }

    /**
     * Set <p>Sql的执行时长（秒）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueryTime <p>Sql的执行时长（秒）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueryTime(Float QueryTime) {
        this.QueryTime = QueryTime;
    }

    /**
     * Get <p>Sql语句</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlText <p>Sql语句</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSqlText() {
        return this.SqlText;
    }

    /**
     * Set <p>Sql语句</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlText <p>Sql语句</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlText(String SqlText) {
        this.SqlText = SqlText;
    }

    /**
     * Get <p>客户端地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserHost <p>客户端地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserHost() {
        return this.UserHost;
    }

    /**
     * Set <p>客户端地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserHost <p>客户端地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserHost(String UserHost) {
        this.UserHost = UserHost;
    }

    /**
     * Get <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>数据库名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Database <p>数据库名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set <p>数据库名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Database <p>数据库名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get <p>锁时长（秒）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LockTime <p>锁时长（秒）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getLockTime() {
        return this.LockTime;
    }

    /**
     * Set <p>锁时长（秒）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LockTime <p>锁时长（秒）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLockTime(Float LockTime) {
        this.LockTime = LockTime;
    }

    /**
     * Get <p>扫描行数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RowsExamined <p>扫描行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRowsExamined() {
        return this.RowsExamined;
    }

    /**
     * Set <p>扫描行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RowsExamined <p>扫描行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRowsExamined(Long RowsExamined) {
        this.RowsExamined = RowsExamined;
    }

    /**
     * Get <p>结果集行数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RowsSent <p>结果集行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRowsSent() {
        return this.RowsSent;
    }

    /**
     * Set <p>结果集行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RowsSent <p>结果集行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRowsSent(Long RowsSent) {
        this.RowsSent = RowsSent;
    }

    /**
     * Get <p>事物ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransactionId <p>事物ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTransactionId() {
        return this.TransactionId;
    }

    /**
     * Set <p>事物ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransactionId <p>事物ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransactionId(String TransactionId) {
        this.TransactionId = TransactionId;
    }

    /**
     * Get <p>rpc耗时</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RpcTime <p>rpc耗时</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRpcTime() {
        return this.RpcTime;
    }

    /**
     * Set <p>rpc耗时</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RpcTime <p>rpc耗时</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRpcTime(Float RpcTime) {
        this.RpcTime = RpcTime;
    }

    /**
     * Get <p>与存储节点交互rpc耗时</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageRpcTime <p>与存储节点交互rpc耗时</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getStorageRpcTime() {
        return this.StorageRpcTime;
    }

    /**
     * Set <p>与存储节点交互rpc耗时</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageRpcTime <p>与存储节点交互rpc耗时</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageRpcTime(Float StorageRpcTime) {
        this.StorageRpcTime = StorageRpcTime;
    }

    /**
     * Get <p>rpc重试延迟耗时</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RpcRetryDelayTime <p>rpc重试延迟耗时</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRpcRetryDelayTime() {
        return this.RpcRetryDelayTime;
    }

    /**
     * Set <p>rpc重试延迟耗时</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RpcRetryDelayTime <p>rpc重试延迟耗时</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRpcRetryDelayTime(Float RpcRetryDelayTime) {
        this.RpcRetryDelayTime = RpcRetryDelayTime;
    }

    /**
     * Get <p>node名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeId <p>node名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set <p>node名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeId <p>node名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get <p>rpc 链路追踪</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RpcTrace <p>rpc 链路追踪</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRpcTrace() {
        return this.RpcTrace;
    }

    /**
     * Set <p>rpc 链路追踪</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RpcTrace <p>rpc 链路追踪</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRpcTrace(String RpcTrace) {
        this.RpcTrace = RpcTrace;
    }

    /**
     * Get <p>TDStore锁时长</p><p>单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TDStoreLockTime <p>TDStore锁时长</p><p>单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTDStoreLockTime() {
        return this.TDStoreLockTime;
    }

    /**
     * Set <p>TDStore锁时长</p><p>单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TDStoreLockTime <p>TDStore锁时长</p><p>单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTDStoreLockTime(Float TDStoreLockTime) {
        this.TDStoreLockTime = TDStoreLockTime;
    }

    /**
     * Get <p>全局标识ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TraceId <p>全局标识ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTraceId() {
        return this.TraceId;
    }

    /**
     * Set <p>全局标识ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TraceId <p>全局标识ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTraceId(String TraceId) {
        this.TraceId = TraceId;
    }

    /**
     * Get <p>执行计划</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Explain <p>执行计划</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Explain [] getExplain() {
        return this.Explain;
    }

    /**
     * Set <p>执行计划</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Explain <p>执行计划</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExplain(Explain [] Explain) {
        this.Explain = Explain;
    }

    public SlowLogData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlowLogData(SlowLogData source) {
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.QueryTime != null) {
            this.QueryTime = new Float(source.QueryTime);
        }
        if (source.SqlText != null) {
            this.SqlText = new String(source.SqlText);
        }
        if (source.UserHost != null) {
            this.UserHost = new String(source.UserHost);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.LockTime != null) {
            this.LockTime = new Float(source.LockTime);
        }
        if (source.RowsExamined != null) {
            this.RowsExamined = new Long(source.RowsExamined);
        }
        if (source.RowsSent != null) {
            this.RowsSent = new Long(source.RowsSent);
        }
        if (source.TransactionId != null) {
            this.TransactionId = new String(source.TransactionId);
        }
        if (source.RpcTime != null) {
            this.RpcTime = new Float(source.RpcTime);
        }
        if (source.StorageRpcTime != null) {
            this.StorageRpcTime = new Float(source.StorageRpcTime);
        }
        if (source.RpcRetryDelayTime != null) {
            this.RpcRetryDelayTime = new Float(source.RpcRetryDelayTime);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.RpcTrace != null) {
            this.RpcTrace = new String(source.RpcTrace);
        }
        if (source.TDStoreLockTime != null) {
            this.TDStoreLockTime = new Float(source.TDStoreLockTime);
        }
        if (source.TraceId != null) {
            this.TraceId = new String(source.TraceId);
        }
        if (source.Explain != null) {
            this.Explain = new Explain[source.Explain.length];
            for (int i = 0; i < source.Explain.length; i++) {
                this.Explain[i] = new Explain(source.Explain[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "QueryTime", this.QueryTime);
        this.setParamSimple(map, prefix + "SqlText", this.SqlText);
        this.setParamSimple(map, prefix + "UserHost", this.UserHost);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "LockTime", this.LockTime);
        this.setParamSimple(map, prefix + "RowsExamined", this.RowsExamined);
        this.setParamSimple(map, prefix + "RowsSent", this.RowsSent);
        this.setParamSimple(map, prefix + "TransactionId", this.TransactionId);
        this.setParamSimple(map, prefix + "RpcTime", this.RpcTime);
        this.setParamSimple(map, prefix + "StorageRpcTime", this.StorageRpcTime);
        this.setParamSimple(map, prefix + "RpcRetryDelayTime", this.RpcRetryDelayTime);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "RpcTrace", this.RpcTrace);
        this.setParamSimple(map, prefix + "TDStoreLockTime", this.TDStoreLockTime);
        this.setParamSimple(map, prefix + "TraceId", this.TraceId);
        this.setParamArrayObj(map, prefix + "Explain.", this.Explain);

    }
}

