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

public class ErrLogDetail extends AbstractModel {

    /**
    * <p>用户名</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>数据库名字</p>
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * <p>错误发生时间</p>
    */
    @SerializedName("ErrTime")
    @Expose
    private String ErrTime;

    /**
    * <p>错误消息</p>
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * <p>进程ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessId")
    @Expose
    private Long ProcessId;

    /**
    * <p>客户端地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientAddr")
    @Expose
    private String ClientAddr;

    /**
    * <p>会话ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>会话开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionStartTime")
    @Expose
    private String SessionStartTime;

    /**
    * <p>虚拟事务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirtualTransactionId")
    @Expose
    private String VirtualTransactionId;

    /**
    * <p>SQLSTATE错误码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlStateCode")
    @Expose
    private String SqlStateCode;

    /**
    * <p>客户端应用名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
     * Get <p>用户名</p> 
     * @return UserName <p>用户名</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>用户名</p>
     * @param UserName <p>用户名</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>数据库名字</p> 
     * @return Database <p>数据库名字</p>
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set <p>数据库名字</p>
     * @param Database <p>数据库名字</p>
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get <p>错误发生时间</p> 
     * @return ErrTime <p>错误发生时间</p>
     */
    public String getErrTime() {
        return this.ErrTime;
    }

    /**
     * Set <p>错误发生时间</p>
     * @param ErrTime <p>错误发生时间</p>
     */
    public void setErrTime(String ErrTime) {
        this.ErrTime = ErrTime;
    }

    /**
     * Get <p>错误消息</p> 
     * @return ErrMsg <p>错误消息</p>
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set <p>错误消息</p>
     * @param ErrMsg <p>错误消息</p>
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get <p>进程ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessId <p>进程ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProcessId() {
        return this.ProcessId;
    }

    /**
     * Set <p>进程ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessId <p>进程ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessId(Long ProcessId) {
        this.ProcessId = ProcessId;
    }

    /**
     * Get <p>客户端地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientAddr <p>客户端地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClientAddr() {
        return this.ClientAddr;
    }

    /**
     * Set <p>客户端地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientAddr <p>客户端地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientAddr(String ClientAddr) {
        this.ClientAddr = ClientAddr;
    }

    /**
     * Get <p>会话ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionId <p>会话ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>会话ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionId <p>会话ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>会话开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionStartTime <p>会话开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionStartTime() {
        return this.SessionStartTime;
    }

    /**
     * Set <p>会话开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionStartTime <p>会话开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionStartTime(String SessionStartTime) {
        this.SessionStartTime = SessionStartTime;
    }

    /**
     * Get <p>虚拟事务ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirtualTransactionId <p>虚拟事务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVirtualTransactionId() {
        return this.VirtualTransactionId;
    }

    /**
     * Set <p>虚拟事务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirtualTransactionId <p>虚拟事务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirtualTransactionId(String VirtualTransactionId) {
        this.VirtualTransactionId = VirtualTransactionId;
    }

    /**
     * Get <p>SQLSTATE错误码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlStateCode <p>SQLSTATE错误码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSqlStateCode() {
        return this.SqlStateCode;
    }

    /**
     * Set <p>SQLSTATE错误码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlStateCode <p>SQLSTATE错误码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlStateCode(String SqlStateCode) {
        this.SqlStateCode = SqlStateCode;
    }

    /**
     * Get <p>客户端应用名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationName <p>客户端应用名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set <p>客户端应用名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationName <p>客户端应用名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    public ErrLogDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ErrLogDetail(ErrLogDetail source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.ErrTime != null) {
            this.ErrTime = new String(source.ErrTime);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.ProcessId != null) {
            this.ProcessId = new Long(source.ProcessId);
        }
        if (source.ClientAddr != null) {
            this.ClientAddr = new String(source.ClientAddr);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionStartTime != null) {
            this.SessionStartTime = new String(source.SessionStartTime);
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
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "ErrTime", this.ErrTime);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "ProcessId", this.ProcessId);
        this.setParamSimple(map, prefix + "ClientAddr", this.ClientAddr);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionStartTime", this.SessionStartTime);
        this.setParamSimple(map, prefix + "VirtualTransactionId", this.VirtualTransactionId);
        this.setParamSimple(map, prefix + "SqlStateCode", this.SqlStateCode);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);

    }
}

