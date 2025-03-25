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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataBaseAuditRecord extends AbstractModel {

    /**
    * 查询用户
    */
    @SerializedName("OsUser")
    @Expose
    private String OsUser;

    /**
    * 查询ID
    */
    @SerializedName("InitialQueryId")
    @Expose
    private String InitialQueryId;

    /**
    * SQL语句
    */
    @SerializedName("Sql")
    @Expose
    private String Sql;

    /**
    * 开始时间
    */
    @SerializedName("QueryStartTime")
    @Expose
    private String QueryStartTime;

    /**
    * 执行耗时
    */
    @SerializedName("DurationMs")
    @Expose
    private Long DurationMs;

    /**
    * 读取行数
    */
    @SerializedName("ReadRows")
    @Expose
    private Long ReadRows;

    /**
    * 读取字节数
    */
    @SerializedName("ResultRows")
    @Expose
    private Long ResultRows;

    /**
    * 结果字节数
    */
    @SerializedName("ResultBytes")
    @Expose
    private Long ResultBytes;

    /**
    * 内存
    */
    @SerializedName("MemoryUsage")
    @Expose
    private Long MemoryUsage;

    /**
    * 初始查询IP
    */
    @SerializedName("InitialAddress")
    @Expose
    private String InitialAddress;

    /**
    * 数据库
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * sql类型
    */
    @SerializedName("SqlType")
    @Expose
    private String SqlType;

    /**
    * catalog名称
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * 状态
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 是否是查询
    */
    @SerializedName("IsQuery")
    @Expose
    private Boolean IsQuery;

    /**
    * 计算组
    */
    @SerializedName("ComputeGroup")
    @Expose
    private String ComputeGroup;

    /**
     * Get 查询用户 
     * @return OsUser 查询用户
     */
    public String getOsUser() {
        return this.OsUser;
    }

    /**
     * Set 查询用户
     * @param OsUser 查询用户
     */
    public void setOsUser(String OsUser) {
        this.OsUser = OsUser;
    }

    /**
     * Get 查询ID 
     * @return InitialQueryId 查询ID
     */
    public String getInitialQueryId() {
        return this.InitialQueryId;
    }

    /**
     * Set 查询ID
     * @param InitialQueryId 查询ID
     */
    public void setInitialQueryId(String InitialQueryId) {
        this.InitialQueryId = InitialQueryId;
    }

    /**
     * Get SQL语句 
     * @return Sql SQL语句
     */
    public String getSql() {
        return this.Sql;
    }

    /**
     * Set SQL语句
     * @param Sql SQL语句
     */
    public void setSql(String Sql) {
        this.Sql = Sql;
    }

    /**
     * Get 开始时间 
     * @return QueryStartTime 开始时间
     */
    public String getQueryStartTime() {
        return this.QueryStartTime;
    }

    /**
     * Set 开始时间
     * @param QueryStartTime 开始时间
     */
    public void setQueryStartTime(String QueryStartTime) {
        this.QueryStartTime = QueryStartTime;
    }

    /**
     * Get 执行耗时 
     * @return DurationMs 执行耗时
     */
    public Long getDurationMs() {
        return this.DurationMs;
    }

    /**
     * Set 执行耗时
     * @param DurationMs 执行耗时
     */
    public void setDurationMs(Long DurationMs) {
        this.DurationMs = DurationMs;
    }

    /**
     * Get 读取行数 
     * @return ReadRows 读取行数
     */
    public Long getReadRows() {
        return this.ReadRows;
    }

    /**
     * Set 读取行数
     * @param ReadRows 读取行数
     */
    public void setReadRows(Long ReadRows) {
        this.ReadRows = ReadRows;
    }

    /**
     * Get 读取字节数 
     * @return ResultRows 读取字节数
     */
    public Long getResultRows() {
        return this.ResultRows;
    }

    /**
     * Set 读取字节数
     * @param ResultRows 读取字节数
     */
    public void setResultRows(Long ResultRows) {
        this.ResultRows = ResultRows;
    }

    /**
     * Get 结果字节数 
     * @return ResultBytes 结果字节数
     */
    public Long getResultBytes() {
        return this.ResultBytes;
    }

    /**
     * Set 结果字节数
     * @param ResultBytes 结果字节数
     */
    public void setResultBytes(Long ResultBytes) {
        this.ResultBytes = ResultBytes;
    }

    /**
     * Get 内存 
     * @return MemoryUsage 内存
     */
    public Long getMemoryUsage() {
        return this.MemoryUsage;
    }

    /**
     * Set 内存
     * @param MemoryUsage 内存
     */
    public void setMemoryUsage(Long MemoryUsage) {
        this.MemoryUsage = MemoryUsage;
    }

    /**
     * Get 初始查询IP 
     * @return InitialAddress 初始查询IP
     */
    public String getInitialAddress() {
        return this.InitialAddress;
    }

    /**
     * Set 初始查询IP
     * @param InitialAddress 初始查询IP
     */
    public void setInitialAddress(String InitialAddress) {
        this.InitialAddress = InitialAddress;
    }

    /**
     * Get 数据库 
     * @return DbName 数据库
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 数据库
     * @param DbName 数据库
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get sql类型 
     * @return SqlType sql类型
     */
    public String getSqlType() {
        return this.SqlType;
    }

    /**
     * Set sql类型
     * @param SqlType sql类型
     */
    public void setSqlType(String SqlType) {
        this.SqlType = SqlType;
    }

    /**
     * Get catalog名称 
     * @return Catalog catalog名称
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set catalog名称
     * @param Catalog catalog名称
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get 状态 
     * @return State 状态
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 状态
     * @param State 状态
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 是否是查询 
     * @return IsQuery 是否是查询
     */
    public Boolean getIsQuery() {
        return this.IsQuery;
    }

    /**
     * Set 是否是查询
     * @param IsQuery 是否是查询
     */
    public void setIsQuery(Boolean IsQuery) {
        this.IsQuery = IsQuery;
    }

    /**
     * Get 计算组 
     * @return ComputeGroup 计算组
     */
    public String getComputeGroup() {
        return this.ComputeGroup;
    }

    /**
     * Set 计算组
     * @param ComputeGroup 计算组
     */
    public void setComputeGroup(String ComputeGroup) {
        this.ComputeGroup = ComputeGroup;
    }

    public DataBaseAuditRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataBaseAuditRecord(DataBaseAuditRecord source) {
        if (source.OsUser != null) {
            this.OsUser = new String(source.OsUser);
        }
        if (source.InitialQueryId != null) {
            this.InitialQueryId = new String(source.InitialQueryId);
        }
        if (source.Sql != null) {
            this.Sql = new String(source.Sql);
        }
        if (source.QueryStartTime != null) {
            this.QueryStartTime = new String(source.QueryStartTime);
        }
        if (source.DurationMs != null) {
            this.DurationMs = new Long(source.DurationMs);
        }
        if (source.ReadRows != null) {
            this.ReadRows = new Long(source.ReadRows);
        }
        if (source.ResultRows != null) {
            this.ResultRows = new Long(source.ResultRows);
        }
        if (source.ResultBytes != null) {
            this.ResultBytes = new Long(source.ResultBytes);
        }
        if (source.MemoryUsage != null) {
            this.MemoryUsage = new Long(source.MemoryUsage);
        }
        if (source.InitialAddress != null) {
            this.InitialAddress = new String(source.InitialAddress);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.SqlType != null) {
            this.SqlType = new String(source.SqlType);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.IsQuery != null) {
            this.IsQuery = new Boolean(source.IsQuery);
        }
        if (source.ComputeGroup != null) {
            this.ComputeGroup = new String(source.ComputeGroup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OsUser", this.OsUser);
        this.setParamSimple(map, prefix + "InitialQueryId", this.InitialQueryId);
        this.setParamSimple(map, prefix + "Sql", this.Sql);
        this.setParamSimple(map, prefix + "QueryStartTime", this.QueryStartTime);
        this.setParamSimple(map, prefix + "DurationMs", this.DurationMs);
        this.setParamSimple(map, prefix + "ReadRows", this.ReadRows);
        this.setParamSimple(map, prefix + "ResultRows", this.ResultRows);
        this.setParamSimple(map, prefix + "ResultBytes", this.ResultBytes);
        this.setParamSimple(map, prefix + "MemoryUsage", this.MemoryUsage);
        this.setParamSimple(map, prefix + "InitialAddress", this.InitialAddress);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "SqlType", this.SqlType);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "IsQuery", this.IsQuery);
        this.setParamSimple(map, prefix + "ComputeGroup", this.ComputeGroup);

    }
}

