/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditLogFilter extends AbstractModel{

    /**
    * 客户端地址。
    */
    @SerializedName("Host")
    @Expose
    private String [] Host;

    /**
    * 用户名。
    */
    @SerializedName("User")
    @Expose
    private String [] User;

    /**
    * 数据库名称。
    */
    @SerializedName("DBName")
    @Expose
    private String [] DBName;

    /**
    * 表名称。
    */
    @SerializedName("TableName")
    @Expose
    private String [] TableName;

    /**
    * 审计策略名称。
    */
    @SerializedName("PolicyName")
    @Expose
    private String [] PolicyName;

    /**
    * SQL 语句。支持模糊匹配。
    */
    @SerializedName("Sql")
    @Expose
    private String Sql;

    /**
    * SQL 类型。目前支持："SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "ALTER", "SET", "REPLACE", "EXECUTE"。
    */
    @SerializedName("SqlType")
    @Expose
    private String SqlType;

    /**
    * 执行时间。单位为：ms。表示筛选执行时间大于该值的审计日志。
    */
    @SerializedName("ExecTime")
    @Expose
    private Long ExecTime;

    /**
    * 影响行数。表示筛选影响行数大于该值的审计日志。
    */
    @SerializedName("AffectRows")
    @Expose
    private Long AffectRows;

    /**
    * SQL 类型。支持多个类型同时查询。目前支持："SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "ALTER", "SET", "REPLACE", "EXECUTE"。
    */
    @SerializedName("SqlTypes")
    @Expose
    private String [] SqlTypes;

    /**
    * SQL 语句。支持传递多个sql语句。
    */
    @SerializedName("Sqls")
    @Expose
    private String [] Sqls;

    /**
    * 影响行数，格式为M-N，例如：10-200
    */
    @SerializedName("AffectRowsSection")
    @Expose
    private String AffectRowsSection;

    /**
    * 返回行数，格式为M-N，例如：10-200
    */
    @SerializedName("SentRowsSection")
    @Expose
    private String SentRowsSection;

    /**
    * 执行时间，格式为M-N，例如：10-200
    */
    @SerializedName("ExecTimeSection")
    @Expose
    private String ExecTimeSection;

    /**
    * 锁等待时间，格式为M-N，例如：10-200
    */
    @SerializedName("LockWaitTimeSection")
    @Expose
    private String LockWaitTimeSection;

    /**
    * IO等待时间，格式为M-N，例如：10-200
    */
    @SerializedName("IoWaitTimeSection")
    @Expose
    private String IoWaitTimeSection;

    /**
    * 事务持续时间，格式为M-N，例如：10-200
    */
    @SerializedName("TransactionLivingTimeSection")
    @Expose
    private String TransactionLivingTimeSection;

    /**
    * 线程ID
    */
    @SerializedName("ThreadId")
    @Expose
    private String [] ThreadId;

    /**
    * 返回行数。表示筛选返回行数大于该值的审计日志。
    */
    @SerializedName("SentRows")
    @Expose
    private Long SentRows;

    /**
    * mysql错误码
    */
    @SerializedName("ErrCode")
    @Expose
    private Long [] ErrCode;

    /**
     * Get 客户端地址。 
     * @return Host 客户端地址。
     */
    public String [] getHost() {
        return this.Host;
    }

    /**
     * Set 客户端地址。
     * @param Host 客户端地址。
     */
    public void setHost(String [] Host) {
        this.Host = Host;
    }

    /**
     * Get 用户名。 
     * @return User 用户名。
     */
    public String [] getUser() {
        return this.User;
    }

    /**
     * Set 用户名。
     * @param User 用户名。
     */
    public void setUser(String [] User) {
        this.User = User;
    }

    /**
     * Get 数据库名称。 
     * @return DBName 数据库名称。
     */
    public String [] getDBName() {
        return this.DBName;
    }

    /**
     * Set 数据库名称。
     * @param DBName 数据库名称。
     */
    public void setDBName(String [] DBName) {
        this.DBName = DBName;
    }

    /**
     * Get 表名称。 
     * @return TableName 表名称。
     */
    public String [] getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名称。
     * @param TableName 表名称。
     */
    public void setTableName(String [] TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 审计策略名称。 
     * @return PolicyName 审计策略名称。
     */
    public String [] getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 审计策略名称。
     * @param PolicyName 审计策略名称。
     */
    public void setPolicyName(String [] PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get SQL 语句。支持模糊匹配。 
     * @return Sql SQL 语句。支持模糊匹配。
     */
    public String getSql() {
        return this.Sql;
    }

    /**
     * Set SQL 语句。支持模糊匹配。
     * @param Sql SQL 语句。支持模糊匹配。
     */
    public void setSql(String Sql) {
        this.Sql = Sql;
    }

    /**
     * Get SQL 类型。目前支持："SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "ALTER", "SET", "REPLACE", "EXECUTE"。 
     * @return SqlType SQL 类型。目前支持："SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "ALTER", "SET", "REPLACE", "EXECUTE"。
     */
    public String getSqlType() {
        return this.SqlType;
    }

    /**
     * Set SQL 类型。目前支持："SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "ALTER", "SET", "REPLACE", "EXECUTE"。
     * @param SqlType SQL 类型。目前支持："SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "ALTER", "SET", "REPLACE", "EXECUTE"。
     */
    public void setSqlType(String SqlType) {
        this.SqlType = SqlType;
    }

    /**
     * Get 执行时间。单位为：ms。表示筛选执行时间大于该值的审计日志。 
     * @return ExecTime 执行时间。单位为：ms。表示筛选执行时间大于该值的审计日志。
     */
    public Long getExecTime() {
        return this.ExecTime;
    }

    /**
     * Set 执行时间。单位为：ms。表示筛选执行时间大于该值的审计日志。
     * @param ExecTime 执行时间。单位为：ms。表示筛选执行时间大于该值的审计日志。
     */
    public void setExecTime(Long ExecTime) {
        this.ExecTime = ExecTime;
    }

    /**
     * Get 影响行数。表示筛选影响行数大于该值的审计日志。 
     * @return AffectRows 影响行数。表示筛选影响行数大于该值的审计日志。
     */
    public Long getAffectRows() {
        return this.AffectRows;
    }

    /**
     * Set 影响行数。表示筛选影响行数大于该值的审计日志。
     * @param AffectRows 影响行数。表示筛选影响行数大于该值的审计日志。
     */
    public void setAffectRows(Long AffectRows) {
        this.AffectRows = AffectRows;
    }

    /**
     * Get SQL 类型。支持多个类型同时查询。目前支持："SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "ALTER", "SET", "REPLACE", "EXECUTE"。 
     * @return SqlTypes SQL 类型。支持多个类型同时查询。目前支持："SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "ALTER", "SET", "REPLACE", "EXECUTE"。
     */
    public String [] getSqlTypes() {
        return this.SqlTypes;
    }

    /**
     * Set SQL 类型。支持多个类型同时查询。目前支持："SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "ALTER", "SET", "REPLACE", "EXECUTE"。
     * @param SqlTypes SQL 类型。支持多个类型同时查询。目前支持："SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "ALTER", "SET", "REPLACE", "EXECUTE"。
     */
    public void setSqlTypes(String [] SqlTypes) {
        this.SqlTypes = SqlTypes;
    }

    /**
     * Get SQL 语句。支持传递多个sql语句。 
     * @return Sqls SQL 语句。支持传递多个sql语句。
     */
    public String [] getSqls() {
        return this.Sqls;
    }

    /**
     * Set SQL 语句。支持传递多个sql语句。
     * @param Sqls SQL 语句。支持传递多个sql语句。
     */
    public void setSqls(String [] Sqls) {
        this.Sqls = Sqls;
    }

    /**
     * Get 影响行数，格式为M-N，例如：10-200 
     * @return AffectRowsSection 影响行数，格式为M-N，例如：10-200
     */
    public String getAffectRowsSection() {
        return this.AffectRowsSection;
    }

    /**
     * Set 影响行数，格式为M-N，例如：10-200
     * @param AffectRowsSection 影响行数，格式为M-N，例如：10-200
     */
    public void setAffectRowsSection(String AffectRowsSection) {
        this.AffectRowsSection = AffectRowsSection;
    }

    /**
     * Get 返回行数，格式为M-N，例如：10-200 
     * @return SentRowsSection 返回行数，格式为M-N，例如：10-200
     */
    public String getSentRowsSection() {
        return this.SentRowsSection;
    }

    /**
     * Set 返回行数，格式为M-N，例如：10-200
     * @param SentRowsSection 返回行数，格式为M-N，例如：10-200
     */
    public void setSentRowsSection(String SentRowsSection) {
        this.SentRowsSection = SentRowsSection;
    }

    /**
     * Get 执行时间，格式为M-N，例如：10-200 
     * @return ExecTimeSection 执行时间，格式为M-N，例如：10-200
     */
    public String getExecTimeSection() {
        return this.ExecTimeSection;
    }

    /**
     * Set 执行时间，格式为M-N，例如：10-200
     * @param ExecTimeSection 执行时间，格式为M-N，例如：10-200
     */
    public void setExecTimeSection(String ExecTimeSection) {
        this.ExecTimeSection = ExecTimeSection;
    }

    /**
     * Get 锁等待时间，格式为M-N，例如：10-200 
     * @return LockWaitTimeSection 锁等待时间，格式为M-N，例如：10-200
     */
    public String getLockWaitTimeSection() {
        return this.LockWaitTimeSection;
    }

    /**
     * Set 锁等待时间，格式为M-N，例如：10-200
     * @param LockWaitTimeSection 锁等待时间，格式为M-N，例如：10-200
     */
    public void setLockWaitTimeSection(String LockWaitTimeSection) {
        this.LockWaitTimeSection = LockWaitTimeSection;
    }

    /**
     * Get IO等待时间，格式为M-N，例如：10-200 
     * @return IoWaitTimeSection IO等待时间，格式为M-N，例如：10-200
     */
    public String getIoWaitTimeSection() {
        return this.IoWaitTimeSection;
    }

    /**
     * Set IO等待时间，格式为M-N，例如：10-200
     * @param IoWaitTimeSection IO等待时间，格式为M-N，例如：10-200
     */
    public void setIoWaitTimeSection(String IoWaitTimeSection) {
        this.IoWaitTimeSection = IoWaitTimeSection;
    }

    /**
     * Get 事务持续时间，格式为M-N，例如：10-200 
     * @return TransactionLivingTimeSection 事务持续时间，格式为M-N，例如：10-200
     */
    public String getTransactionLivingTimeSection() {
        return this.TransactionLivingTimeSection;
    }

    /**
     * Set 事务持续时间，格式为M-N，例如：10-200
     * @param TransactionLivingTimeSection 事务持续时间，格式为M-N，例如：10-200
     */
    public void setTransactionLivingTimeSection(String TransactionLivingTimeSection) {
        this.TransactionLivingTimeSection = TransactionLivingTimeSection;
    }

    /**
     * Get 线程ID 
     * @return ThreadId 线程ID
     */
    public String [] getThreadId() {
        return this.ThreadId;
    }

    /**
     * Set 线程ID
     * @param ThreadId 线程ID
     */
    public void setThreadId(String [] ThreadId) {
        this.ThreadId = ThreadId;
    }

    /**
     * Get 返回行数。表示筛选返回行数大于该值的审计日志。 
     * @return SentRows 返回行数。表示筛选返回行数大于该值的审计日志。
     */
    public Long getSentRows() {
        return this.SentRows;
    }

    /**
     * Set 返回行数。表示筛选返回行数大于该值的审计日志。
     * @param SentRows 返回行数。表示筛选返回行数大于该值的审计日志。
     */
    public void setSentRows(Long SentRows) {
        this.SentRows = SentRows;
    }

    /**
     * Get mysql错误码 
     * @return ErrCode mysql错误码
     */
    public Long [] getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set mysql错误码
     * @param ErrCode mysql错误码
     */
    public void setErrCode(Long [] ErrCode) {
        this.ErrCode = ErrCode;
    }

    public AuditLogFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditLogFilter(AuditLogFilter source) {
        if (source.Host != null) {
            this.Host = new String[source.Host.length];
            for (int i = 0; i < source.Host.length; i++) {
                this.Host[i] = new String(source.Host[i]);
            }
        }
        if (source.User != null) {
            this.User = new String[source.User.length];
            for (int i = 0; i < source.User.length; i++) {
                this.User[i] = new String(source.User[i]);
            }
        }
        if (source.DBName != null) {
            this.DBName = new String[source.DBName.length];
            for (int i = 0; i < source.DBName.length; i++) {
                this.DBName[i] = new String(source.DBName[i]);
            }
        }
        if (source.TableName != null) {
            this.TableName = new String[source.TableName.length];
            for (int i = 0; i < source.TableName.length; i++) {
                this.TableName[i] = new String(source.TableName[i]);
            }
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String[source.PolicyName.length];
            for (int i = 0; i < source.PolicyName.length; i++) {
                this.PolicyName[i] = new String(source.PolicyName[i]);
            }
        }
        if (source.Sql != null) {
            this.Sql = new String(source.Sql);
        }
        if (source.SqlType != null) {
            this.SqlType = new String(source.SqlType);
        }
        if (source.ExecTime != null) {
            this.ExecTime = new Long(source.ExecTime);
        }
        if (source.AffectRows != null) {
            this.AffectRows = new Long(source.AffectRows);
        }
        if (source.SqlTypes != null) {
            this.SqlTypes = new String[source.SqlTypes.length];
            for (int i = 0; i < source.SqlTypes.length; i++) {
                this.SqlTypes[i] = new String(source.SqlTypes[i]);
            }
        }
        if (source.Sqls != null) {
            this.Sqls = new String[source.Sqls.length];
            for (int i = 0; i < source.Sqls.length; i++) {
                this.Sqls[i] = new String(source.Sqls[i]);
            }
        }
        if (source.AffectRowsSection != null) {
            this.AffectRowsSection = new String(source.AffectRowsSection);
        }
        if (source.SentRowsSection != null) {
            this.SentRowsSection = new String(source.SentRowsSection);
        }
        if (source.ExecTimeSection != null) {
            this.ExecTimeSection = new String(source.ExecTimeSection);
        }
        if (source.LockWaitTimeSection != null) {
            this.LockWaitTimeSection = new String(source.LockWaitTimeSection);
        }
        if (source.IoWaitTimeSection != null) {
            this.IoWaitTimeSection = new String(source.IoWaitTimeSection);
        }
        if (source.TransactionLivingTimeSection != null) {
            this.TransactionLivingTimeSection = new String(source.TransactionLivingTimeSection);
        }
        if (source.ThreadId != null) {
            this.ThreadId = new String[source.ThreadId.length];
            for (int i = 0; i < source.ThreadId.length; i++) {
                this.ThreadId[i] = new String(source.ThreadId[i]);
            }
        }
        if (source.SentRows != null) {
            this.SentRows = new Long(source.SentRows);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long[source.ErrCode.length];
            for (int i = 0; i < source.ErrCode.length; i++) {
                this.ErrCode[i] = new Long(source.ErrCode[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Host.", this.Host);
        this.setParamArraySimple(map, prefix + "User.", this.User);
        this.setParamArraySimple(map, prefix + "DBName.", this.DBName);
        this.setParamArraySimple(map, prefix + "TableName.", this.TableName);
        this.setParamArraySimple(map, prefix + "PolicyName.", this.PolicyName);
        this.setParamSimple(map, prefix + "Sql", this.Sql);
        this.setParamSimple(map, prefix + "SqlType", this.SqlType);
        this.setParamSimple(map, prefix + "ExecTime", this.ExecTime);
        this.setParamSimple(map, prefix + "AffectRows", this.AffectRows);
        this.setParamArraySimple(map, prefix + "SqlTypes.", this.SqlTypes);
        this.setParamArraySimple(map, prefix + "Sqls.", this.Sqls);
        this.setParamSimple(map, prefix + "AffectRowsSection", this.AffectRowsSection);
        this.setParamSimple(map, prefix + "SentRowsSection", this.SentRowsSection);
        this.setParamSimple(map, prefix + "ExecTimeSection", this.ExecTimeSection);
        this.setParamSimple(map, prefix + "LockWaitTimeSection", this.LockWaitTimeSection);
        this.setParamSimple(map, prefix + "IoWaitTimeSection", this.IoWaitTimeSection);
        this.setParamSimple(map, prefix + "TransactionLivingTimeSection", this.TransactionLivingTimeSection);
        this.setParamArraySimple(map, prefix + "ThreadId.", this.ThreadId);
        this.setParamSimple(map, prefix + "SentRows", this.SentRows);
        this.setParamArraySimple(map, prefix + "ErrCode.", this.ErrCode);

    }
}

