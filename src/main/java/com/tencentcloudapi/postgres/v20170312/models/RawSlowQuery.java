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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RawSlowQuery extends AbstractModel{

    /**
    * 慢SQL 语句
    */
    @SerializedName("RawQuery")
    @Expose
    private String RawQuery;

    /**
    * 慢SQL 查询的数据库
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 慢SQL执行 耗时
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * 执行慢SQL的客户端
    */
    @SerializedName("ClientAddr")
    @Expose
    private String ClientAddr;

    /**
    * 执行慢SQL的用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 慢SQL执行的开始时间
    */
    @SerializedName("SessionStartTime")
    @Expose
    private String SessionStartTime;

    /**
     * Get 慢SQL 语句 
     * @return RawQuery 慢SQL 语句
     */
    public String getRawQuery() {
        return this.RawQuery;
    }

    /**
     * Set 慢SQL 语句
     * @param RawQuery 慢SQL 语句
     */
    public void setRawQuery(String RawQuery) {
        this.RawQuery = RawQuery;
    }

    /**
     * Get 慢SQL 查询的数据库 
     * @return DatabaseName 慢SQL 查询的数据库
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 慢SQL 查询的数据库
     * @param DatabaseName 慢SQL 查询的数据库
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 慢SQL执行 耗时 
     * @return Duration 慢SQL执行 耗时
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set 慢SQL执行 耗时
     * @param Duration 慢SQL执行 耗时
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 执行慢SQL的客户端 
     * @return ClientAddr 执行慢SQL的客户端
     */
    public String getClientAddr() {
        return this.ClientAddr;
    }

    /**
     * Set 执行慢SQL的客户端
     * @param ClientAddr 执行慢SQL的客户端
     */
    public void setClientAddr(String ClientAddr) {
        this.ClientAddr = ClientAddr;
    }

    /**
     * Get 执行慢SQL的用户名 
     * @return UserName 执行慢SQL的用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 执行慢SQL的用户名
     * @param UserName 执行慢SQL的用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 慢SQL执行的开始时间 
     * @return SessionStartTime 慢SQL执行的开始时间
     */
    public String getSessionStartTime() {
        return this.SessionStartTime;
    }

    /**
     * Set 慢SQL执行的开始时间
     * @param SessionStartTime 慢SQL执行的开始时间
     */
    public void setSessionStartTime(String SessionStartTime) {
        this.SessionStartTime = SessionStartTime;
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

    }
}

