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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RawSlowQuery extends AbstractModel {

    /**
    * <p>慢SQL 语句</p>
    */
    @SerializedName("RawQuery")
    @Expose
    private String RawQuery;

    /**
    * <p>慢SQL 查询的数据库</p>
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * <p>慢SQL执行 耗时</p>
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * <p>执行慢SQL的客户端</p>
    */
    @SerializedName("ClientAddr")
    @Expose
    private String ClientAddr;

    /**
    * <p>执行慢SQL的用户名</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>慢SQL执行的开始时间</p>
    */
    @SerializedName("SessionStartTime")
    @Expose
    private String SessionStartTime;

    /**
    * <p>执行慢SQL的进程ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessId")
    @Expose
    private Long ProcessId;

    /**
    * <p>执行慢SQL的会话ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>执行慢SQL的事务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirtualTransactionId")
    @Expose
    private String VirtualTransactionId;

    /**
    * <p>执行慢SQL的状态码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlStateCode")
    @Expose
    private String SqlStateCode;

    /**
    * <p>执行慢SQL的客户端名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
     * Get <p>慢SQL 语句</p> 
     * @return RawQuery <p>慢SQL 语句</p>
     */
    public String getRawQuery() {
        return this.RawQuery;
    }

    /**
     * Set <p>慢SQL 语句</p>
     * @param RawQuery <p>慢SQL 语句</p>
     */
    public void setRawQuery(String RawQuery) {
        this.RawQuery = RawQuery;
    }

    /**
     * Get <p>慢SQL 查询的数据库</p> 
     * @return DatabaseName <p>慢SQL 查询的数据库</p>
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set <p>慢SQL 查询的数据库</p>
     * @param DatabaseName <p>慢SQL 查询的数据库</p>
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get <p>慢SQL执行 耗时</p> 
     * @return Duration <p>慢SQL执行 耗时</p>
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>慢SQL执行 耗时</p>
     * @param Duration <p>慢SQL执行 耗时</p>
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>执行慢SQL的客户端</p> 
     * @return ClientAddr <p>执行慢SQL的客户端</p>
     */
    public String getClientAddr() {
        return this.ClientAddr;
    }

    /**
     * Set <p>执行慢SQL的客户端</p>
     * @param ClientAddr <p>执行慢SQL的客户端</p>
     */
    public void setClientAddr(String ClientAddr) {
        this.ClientAddr = ClientAddr;
    }

    /**
     * Get <p>执行慢SQL的用户名</p> 
     * @return UserName <p>执行慢SQL的用户名</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>执行慢SQL的用户名</p>
     * @param UserName <p>执行慢SQL的用户名</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>慢SQL执行的开始时间</p> 
     * @return SessionStartTime <p>慢SQL执行的开始时间</p>
     */
    public String getSessionStartTime() {
        return this.SessionStartTime;
    }

    /**
     * Set <p>慢SQL执行的开始时间</p>
     * @param SessionStartTime <p>慢SQL执行的开始时间</p>
     */
    public void setSessionStartTime(String SessionStartTime) {
        this.SessionStartTime = SessionStartTime;
    }

    /**
     * Get <p>执行慢SQL的进程ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessId <p>执行慢SQL的进程ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProcessId() {
        return this.ProcessId;
    }

    /**
     * Set <p>执行慢SQL的进程ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessId <p>执行慢SQL的进程ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessId(Long ProcessId) {
        this.ProcessId = ProcessId;
    }

    /**
     * Get <p>执行慢SQL的会话ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionId <p>执行慢SQL的会话ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>执行慢SQL的会话ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionId <p>执行慢SQL的会话ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>执行慢SQL的事务ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirtualTransactionId <p>执行慢SQL的事务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVirtualTransactionId() {
        return this.VirtualTransactionId;
    }

    /**
     * Set <p>执行慢SQL的事务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirtualTransactionId <p>执行慢SQL的事务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirtualTransactionId(String VirtualTransactionId) {
        this.VirtualTransactionId = VirtualTransactionId;
    }

    /**
     * Get <p>执行慢SQL的状态码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlStateCode <p>执行慢SQL的状态码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSqlStateCode() {
        return this.SqlStateCode;
    }

    /**
     * Set <p>执行慢SQL的状态码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlStateCode <p>执行慢SQL的状态码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlStateCode(String SqlStateCode) {
        this.SqlStateCode = SqlStateCode;
    }

    /**
     * Get <p>执行慢SQL的客户端名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationName <p>执行慢SQL的客户端名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set <p>执行慢SQL的客户端名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationName <p>执行慢SQL的客户端名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    public RawSlowQuery() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RawSlowQuery(RawSlowQuery source) {
        if (source.RawQuery != null) {
            this.RawQuery = new String(source.RawQuery);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.ClientAddr != null) {
            this.ClientAddr = new String(source.ClientAddr);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.SessionStartTime != null) {
            this.SessionStartTime = new String(source.SessionStartTime);
        }
        if (source.ProcessId != null) {
            this.ProcessId = new Long(source.ProcessId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.VirtualTransactionId != null) {
            this.VirtualTransactionId = new String(source.VirtualTransactionId);
        }
        if (source.SqlStateCode != null) {
            this.SqlStateCode = new String(source.SqlStateCode);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RawQuery", this.RawQuery);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "ClientAddr", this.ClientAddr);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "SessionStartTime", this.SessionStartTime);
        this.setParamSimple(map, prefix + "ProcessId", this.ProcessId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "VirtualTransactionId", this.VirtualTransactionId);
        this.setParamSimple(map, prefix + "SqlStateCode", this.SqlStateCode);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);

    }
}

