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

public class AuditLog extends AbstractModel {

    /**
    * <p>日志时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * <p>影响行数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AffectRows")
    @Expose
    private Long AffectRows;

    /**
    * <p>数据库</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DBName")
    @Expose
    private String DBName;

    /**
    * <p>错误码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrCode")
    @Expose
    private String ErrCode;

    /**
    * <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * <p>执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecTime")
    @Expose
    private Long ExecTime;

    /**
    * <p>访问来源</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>实例Id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>对象名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectName")
    @Expose
    private String ObjectName;

    /**
    * <p>对象类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectType")
    @Expose
    private String ObjectType;

    /**
    * <p>sql</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sql")
    @Expose
    private String Sql;

    /**
    * <p>sql类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlType")
    @Expose
    private String SqlType;

    /**
    * <p>线程ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ThreadId")
    @Expose
    private String ThreadId;

    /**
    * <p>用户</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
     * Get <p>日志时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timestamp <p>日志时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set <p>日志时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timestamp <p>日志时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get <p>影响行数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AffectRows <p>影响行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAffectRows() {
        return this.AffectRows;
    }

    /**
     * Set <p>影响行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AffectRows <p>影响行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAffectRows(Long AffectRows) {
        this.AffectRows = AffectRows;
    }

    /**
     * Get <p>数据库</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DBName <p>数据库</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * Set <p>数据库</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DBName <p>数据库</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDBName(String DBName) {
        this.DBName = DBName;
    }

    /**
     * Get <p>错误码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrCode <p>错误码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>错误码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrCode <p>错误码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrCode(String ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMessage <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMessage <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get <p>执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecTime <p>执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExecTime() {
        return this.ExecTime;
    }

    /**
     * Set <p>执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecTime <p>执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecTime(Long ExecTime) {
        this.ExecTime = ExecTime;
    }

    /**
     * Get <p>访问来源</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Host <p>访问来源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>访问来源</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Host <p>访问来源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>实例Id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId <p>实例Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId <p>实例Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>对象名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectName <p>对象名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getObjectName() {
        return this.ObjectName;
    }

    /**
     * Set <p>对象名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectName <p>对象名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectName(String ObjectName) {
        this.ObjectName = ObjectName;
    }

    /**
     * Get <p>对象类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectType <p>对象类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getObjectType() {
        return this.ObjectType;
    }

    /**
     * Set <p>对象类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectType <p>对象类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectType(String ObjectType) {
        this.ObjectType = ObjectType;
    }

    /**
     * Get <p>sql</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sql <p>sql</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSql() {
        return this.Sql;
    }

    /**
     * Set <p>sql</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sql <p>sql</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSql(String Sql) {
        this.Sql = Sql;
    }

    /**
     * Get <p>sql类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlType <p>sql类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSqlType() {
        return this.SqlType;
    }

    /**
     * Set <p>sql类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlType <p>sql类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlType(String SqlType) {
        this.SqlType = SqlType;
    }

    /**
     * Get <p>线程ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ThreadId <p>线程ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getThreadId() {
        return this.ThreadId;
    }

    /**
     * Set <p>线程ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ThreadId <p>线程ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThreadId(String ThreadId) {
        this.ThreadId = ThreadId;
    }

    /**
     * Get <p>用户</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return User <p>用户</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set <p>用户</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param User <p>用户</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUser(String User) {
        this.User = User;
    }

    public AuditLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditLog(AuditLog source) {
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.AffectRows != null) {
            this.AffectRows = new Long(source.AffectRows);
        }
        if (source.DBName != null) {
            this.DBName = new String(source.DBName);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new String(source.ErrCode);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.ExecTime != null) {
            this.ExecTime = new Long(source.ExecTime);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ObjectName != null) {
            this.ObjectName = new String(source.ObjectName);
        }
        if (source.ObjectType != null) {
            this.ObjectType = new String(source.ObjectType);
        }
        if (source.Sql != null) {
            this.Sql = new String(source.Sql);
        }
        if (source.SqlType != null) {
            this.SqlType = new String(source.SqlType);
        }
        if (source.ThreadId != null) {
            this.ThreadId = new String(source.ThreadId);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "AffectRows", this.AffectRows);
        this.setParamSimple(map, prefix + "DBName", this.DBName);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "ExecTime", this.ExecTime);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ObjectName", this.ObjectName);
        this.setParamSimple(map, prefix + "ObjectType", this.ObjectType);
        this.setParamSimple(map, prefix + "Sql", this.Sql);
        this.setParamSimple(map, prefix + "SqlType", this.SqlType);
        this.setParamSimple(map, prefix + "ThreadId", this.ThreadId);
        this.setParamSimple(map, prefix + "User", this.User);

    }
}

