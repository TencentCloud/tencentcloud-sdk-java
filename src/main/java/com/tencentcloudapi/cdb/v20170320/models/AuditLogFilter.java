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

    }
}

