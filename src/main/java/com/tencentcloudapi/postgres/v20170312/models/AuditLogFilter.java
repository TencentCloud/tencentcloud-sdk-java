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

public class AuditLogFilter extends AbstractModel {

    /**
    * <p>影响函数</p>
    */
    @SerializedName("AffectRows")
    @Expose
    private Long AffectRows;

    /**
    * <p>数据库名字</p>
    */
    @SerializedName("DBName")
    @Expose
    private String [] DBName;

    /**
    * <p>执行时间</p>
    */
    @SerializedName("ExecTime")
    @Expose
    private Long ExecTime;

    /**
    * <p>主机Host</p>
    */
    @SerializedName("Host")
    @Expose
    private String [] Host;

    /**
    * <p>sql语句</p>
    */
    @SerializedName("Sql")
    @Expose
    private String Sql;

    /**
    * <p>登录名</p>
    */
    @SerializedName("User")
    @Expose
    private String [] User;

    /**
    * <p>审计类型</p>
    */
    @SerializedName("SqlType")
    @Expose
    private String [] SqlType;

    /**
     * Get <p>影响函数</p> 
     * @return AffectRows <p>影响函数</p>
     */
    public Long getAffectRows() {
        return this.AffectRows;
    }

    /**
     * Set <p>影响函数</p>
     * @param AffectRows <p>影响函数</p>
     */
    public void setAffectRows(Long AffectRows) {
        this.AffectRows = AffectRows;
    }

    /**
     * Get <p>数据库名字</p> 
     * @return DBName <p>数据库名字</p>
     */
    public String [] getDBName() {
        return this.DBName;
    }

    /**
     * Set <p>数据库名字</p>
     * @param DBName <p>数据库名字</p>
     */
    public void setDBName(String [] DBName) {
        this.DBName = DBName;
    }

    /**
     * Get <p>执行时间</p> 
     * @return ExecTime <p>执行时间</p>
     */
    public Long getExecTime() {
        return this.ExecTime;
    }

    /**
     * Set <p>执行时间</p>
     * @param ExecTime <p>执行时间</p>
     */
    public void setExecTime(Long ExecTime) {
        this.ExecTime = ExecTime;
    }

    /**
     * Get <p>主机Host</p> 
     * @return Host <p>主机Host</p>
     */
    public String [] getHost() {
        return this.Host;
    }

    /**
     * Set <p>主机Host</p>
     * @param Host <p>主机Host</p>
     */
    public void setHost(String [] Host) {
        this.Host = Host;
    }

    /**
     * Get <p>sql语句</p> 
     * @return Sql <p>sql语句</p>
     */
    public String getSql() {
        return this.Sql;
    }

    /**
     * Set <p>sql语句</p>
     * @param Sql <p>sql语句</p>
     */
    public void setSql(String Sql) {
        this.Sql = Sql;
    }

    /**
     * Get <p>登录名</p> 
     * @return User <p>登录名</p>
     */
    public String [] getUser() {
        return this.User;
    }

    /**
     * Set <p>登录名</p>
     * @param User <p>登录名</p>
     */
    public void setUser(String [] User) {
        this.User = User;
    }

    /**
     * Get <p>审计类型</p> 
     * @return SqlType <p>审计类型</p>
     */
    public String [] getSqlType() {
        return this.SqlType;
    }

    /**
     * Set <p>审计类型</p>
     * @param SqlType <p>审计类型</p>
     */
    public void setSqlType(String [] SqlType) {
        this.SqlType = SqlType;
    }

    public AuditLogFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditLogFilter(AuditLogFilter source) {
        if (source.AffectRows != null) {
            this.AffectRows = new Long(source.AffectRows);
        }
        if (source.DBName != null) {
            this.DBName = new String[source.DBName.length];
            for (int i = 0; i < source.DBName.length; i++) {
                this.DBName[i] = new String(source.DBName[i]);
            }
        }
        if (source.ExecTime != null) {
            this.ExecTime = new Long(source.ExecTime);
        }
        if (source.Host != null) {
            this.Host = new String[source.Host.length];
            for (int i = 0; i < source.Host.length; i++) {
                this.Host[i] = new String(source.Host[i]);
            }
        }
        if (source.Sql != null) {
            this.Sql = new String(source.Sql);
        }
        if (source.User != null) {
            this.User = new String[source.User.length];
            for (int i = 0; i < source.User.length; i++) {
                this.User[i] = new String(source.User[i]);
            }
        }
        if (source.SqlType != null) {
            this.SqlType = new String[source.SqlType.length];
            for (int i = 0; i < source.SqlType.length; i++) {
                this.SqlType[i] = new String(source.SqlType[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AffectRows", this.AffectRows);
        this.setParamArraySimple(map, prefix + "DBName.", this.DBName);
        this.setParamSimple(map, prefix + "ExecTime", this.ExecTime);
        this.setParamArraySimple(map, prefix + "Host.", this.Host);
        this.setParamSimple(map, prefix + "Sql", this.Sql);
        this.setParamArraySimple(map, prefix + "User.", this.User);
        this.setParamArraySimple(map, prefix + "SqlType.", this.SqlType);

    }
}

