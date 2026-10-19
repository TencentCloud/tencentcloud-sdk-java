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

public class AuditLogQueryFilter extends AbstractModel {

    /**
    * <p>SQL 类型列表，取值如 SELECT、INSERT、UPDATE、DELETE 等。</p>
    */
    @SerializedName("SqlType")
    @Expose
    private String [] SqlType;

    /**
    * <p>执行耗时范围（毫秒），长度为 2 的数组：[最小值, 最大值]。</p>
    */
    @SerializedName("ExecTime")
    @Expose
    private Long [] ExecTime;

    /**
    * <p>IO 等待耗时范围（毫秒），长度为 2 的数组。</p>
    */
    @SerializedName("IoWaitTime")
    @Expose
    private Long [] IoWaitTime;

    /**
    * <p>CPU 耗时范围（毫秒），长度为 2 的数组。</p>
    */
    @SerializedName("CpuTime")
    @Expose
    private Long [] CpuTime;

    /**
    * <p>锁等待耗时范围（毫秒），长度为 2 的数组。</p>
    */
    @SerializedName("LockWaitTime")
    @Expose
    private Long [] LockWaitTime;

    /**
    * <p>SQL 执行错误码，例如 0 表示成功。</p>
    */
    @SerializedName("ErrCode")
    @Expose
    private String ErrCode;

    /**
    * <p>错误信息。</p>
    */
    @SerializedName("ErrInfo")
    @Expose
    private String ErrInfo;

    /**
    * <p>数据库名列表。</p>
    */
    @SerializedName("DBName")
    @Expose
    private String [] DBName;

    /**
    * <p>用户名列表。</p>
    */
    @SerializedName("User")
    @Expose
    private String [] User;

    /**
    * <p>来源 IP 列表。</p>
    */
    @SerializedName("Host")
    @Expose
    private String [] Host;

    /**
    * <p>线程 ID 列表。</p>
    */
    @SerializedName("ThreadId")
    @Expose
    private String [] ThreadId;

    /**
    * <p>代理节点 Host 列表。</p>
    */
    @SerializedName("ProxyHostList")
    @Expose
    private String [] ProxyHostList;

    /**
    * <p>后端 Set Host 列表。</p>
    */
    @SerializedName("SetHostList")
    @Expose
    private String [] SetHostList;

    /**
    * <p>后端 Set ID 列表。</p>
    */
    @SerializedName("SetIdList")
    @Expose
    private String [] SetIdList;

    /**
    * <p>多 SQL 关键词条件，JSON 字符串，内部为二维数组：第一级为 AND，第二级为 OR。注意云 API 平台不支持二维数组，此处用字符串承载，服务端自动解析。</p>
    */
    @SerializedName("MultiSql")
    @Expose
    private String MultiSql;

    /**
    * <p>排除的多 SQL 关键词条件，JSON 字符串，结构同 MultiSql。</p>
    */
    @SerializedName("ExcludeMultiSql")
    @Expose
    private String ExcludeMultiSql;

    /**
    * <p>SQL 模板 ID。</p>
    */
    @SerializedName("SqlTemplateId")
    @Expose
    private String SqlTemplateId;

    /**
    * <p>SQL 开始时间，示例：2026-10-10 11:05:06.002211</p><p>参数格式：YYYY-MM-DD hh:mm:ss.SSSSSS</p>
    */
    @SerializedName("SqlStartTime")
    @Expose
    private String SqlStartTime;

    /**
    * <p>查询 ID，关联查询时使用（LogType=All 时必填）。</p>
    */
    @SerializedName("QueryId")
    @Expose
    private String QueryId;

    /**
     * Get <p>SQL 类型列表，取值如 SELECT、INSERT、UPDATE、DELETE 等。</p> 
     * @return SqlType <p>SQL 类型列表，取值如 SELECT、INSERT、UPDATE、DELETE 等。</p>
     */
    public String [] getSqlType() {
        return this.SqlType;
    }

    /**
     * Set <p>SQL 类型列表，取值如 SELECT、INSERT、UPDATE、DELETE 等。</p>
     * @param SqlType <p>SQL 类型列表，取值如 SELECT、INSERT、UPDATE、DELETE 等。</p>
     */
    public void setSqlType(String [] SqlType) {
        this.SqlType = SqlType;
    }

    /**
     * Get <p>执行耗时范围（毫秒），长度为 2 的数组：[最小值, 最大值]。</p> 
     * @return ExecTime <p>执行耗时范围（毫秒），长度为 2 的数组：[最小值, 最大值]。</p>
     */
    public Long [] getExecTime() {
        return this.ExecTime;
    }

    /**
     * Set <p>执行耗时范围（毫秒），长度为 2 的数组：[最小值, 最大值]。</p>
     * @param ExecTime <p>执行耗时范围（毫秒），长度为 2 的数组：[最小值, 最大值]。</p>
     */
    public void setExecTime(Long [] ExecTime) {
        this.ExecTime = ExecTime;
    }

    /**
     * Get <p>IO 等待耗时范围（毫秒），长度为 2 的数组。</p> 
     * @return IoWaitTime <p>IO 等待耗时范围（毫秒），长度为 2 的数组。</p>
     */
    public Long [] getIoWaitTime() {
        return this.IoWaitTime;
    }

    /**
     * Set <p>IO 等待耗时范围（毫秒），长度为 2 的数组。</p>
     * @param IoWaitTime <p>IO 等待耗时范围（毫秒），长度为 2 的数组。</p>
     */
    public void setIoWaitTime(Long [] IoWaitTime) {
        this.IoWaitTime = IoWaitTime;
    }

    /**
     * Get <p>CPU 耗时范围（毫秒），长度为 2 的数组。</p> 
     * @return CpuTime <p>CPU 耗时范围（毫秒），长度为 2 的数组。</p>
     */
    public Long [] getCpuTime() {
        return this.CpuTime;
    }

    /**
     * Set <p>CPU 耗时范围（毫秒），长度为 2 的数组。</p>
     * @param CpuTime <p>CPU 耗时范围（毫秒），长度为 2 的数组。</p>
     */
    public void setCpuTime(Long [] CpuTime) {
        this.CpuTime = CpuTime;
    }

    /**
     * Get <p>锁等待耗时范围（毫秒），长度为 2 的数组。</p> 
     * @return LockWaitTime <p>锁等待耗时范围（毫秒），长度为 2 的数组。</p>
     */
    public Long [] getLockWaitTime() {
        return this.LockWaitTime;
    }

    /**
     * Set <p>锁等待耗时范围（毫秒），长度为 2 的数组。</p>
     * @param LockWaitTime <p>锁等待耗时范围（毫秒），长度为 2 的数组。</p>
     */
    public void setLockWaitTime(Long [] LockWaitTime) {
        this.LockWaitTime = LockWaitTime;
    }

    /**
     * Get <p>SQL 执行错误码，例如 0 表示成功。</p> 
     * @return ErrCode <p>SQL 执行错误码，例如 0 表示成功。</p>
     */
    public String getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>SQL 执行错误码，例如 0 表示成功。</p>
     * @param ErrCode <p>SQL 执行错误码，例如 0 表示成功。</p>
     */
    public void setErrCode(String ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get <p>错误信息。</p> 
     * @return ErrInfo <p>错误信息。</p>
     */
    public String getErrInfo() {
        return this.ErrInfo;
    }

    /**
     * Set <p>错误信息。</p>
     * @param ErrInfo <p>错误信息。</p>
     */
    public void setErrInfo(String ErrInfo) {
        this.ErrInfo = ErrInfo;
    }

    /**
     * Get <p>数据库名列表。</p> 
     * @return DBName <p>数据库名列表。</p>
     */
    public String [] getDBName() {
        return this.DBName;
    }

    /**
     * Set <p>数据库名列表。</p>
     * @param DBName <p>数据库名列表。</p>
     */
    public void setDBName(String [] DBName) {
        this.DBName = DBName;
    }

    /**
     * Get <p>用户名列表。</p> 
     * @return User <p>用户名列表。</p>
     */
    public String [] getUser() {
        return this.User;
    }

    /**
     * Set <p>用户名列表。</p>
     * @param User <p>用户名列表。</p>
     */
    public void setUser(String [] User) {
        this.User = User;
    }

    /**
     * Get <p>来源 IP 列表。</p> 
     * @return Host <p>来源 IP 列表。</p>
     */
    public String [] getHost() {
        return this.Host;
    }

    /**
     * Set <p>来源 IP 列表。</p>
     * @param Host <p>来源 IP 列表。</p>
     */
    public void setHost(String [] Host) {
        this.Host = Host;
    }

    /**
     * Get <p>线程 ID 列表。</p> 
     * @return ThreadId <p>线程 ID 列表。</p>
     */
    public String [] getThreadId() {
        return this.ThreadId;
    }

    /**
     * Set <p>线程 ID 列表。</p>
     * @param ThreadId <p>线程 ID 列表。</p>
     */
    public void setThreadId(String [] ThreadId) {
        this.ThreadId = ThreadId;
    }

    /**
     * Get <p>代理节点 Host 列表。</p> 
     * @return ProxyHostList <p>代理节点 Host 列表。</p>
     */
    public String [] getProxyHostList() {
        return this.ProxyHostList;
    }

    /**
     * Set <p>代理节点 Host 列表。</p>
     * @param ProxyHostList <p>代理节点 Host 列表。</p>
     */
    public void setProxyHostList(String [] ProxyHostList) {
        this.ProxyHostList = ProxyHostList;
    }

    /**
     * Get <p>后端 Set Host 列表。</p> 
     * @return SetHostList <p>后端 Set Host 列表。</p>
     */
    public String [] getSetHostList() {
        return this.SetHostList;
    }

    /**
     * Set <p>后端 Set Host 列表。</p>
     * @param SetHostList <p>后端 Set Host 列表。</p>
     */
    public void setSetHostList(String [] SetHostList) {
        this.SetHostList = SetHostList;
    }

    /**
     * Get <p>后端 Set ID 列表。</p> 
     * @return SetIdList <p>后端 Set ID 列表。</p>
     */
    public String [] getSetIdList() {
        return this.SetIdList;
    }

    /**
     * Set <p>后端 Set ID 列表。</p>
     * @param SetIdList <p>后端 Set ID 列表。</p>
     */
    public void setSetIdList(String [] SetIdList) {
        this.SetIdList = SetIdList;
    }

    /**
     * Get <p>多 SQL 关键词条件，JSON 字符串，内部为二维数组：第一级为 AND，第二级为 OR。注意云 API 平台不支持二维数组，此处用字符串承载，服务端自动解析。</p> 
     * @return MultiSql <p>多 SQL 关键词条件，JSON 字符串，内部为二维数组：第一级为 AND，第二级为 OR。注意云 API 平台不支持二维数组，此处用字符串承载，服务端自动解析。</p>
     */
    public String getMultiSql() {
        return this.MultiSql;
    }

    /**
     * Set <p>多 SQL 关键词条件，JSON 字符串，内部为二维数组：第一级为 AND，第二级为 OR。注意云 API 平台不支持二维数组，此处用字符串承载，服务端自动解析。</p>
     * @param MultiSql <p>多 SQL 关键词条件，JSON 字符串，内部为二维数组：第一级为 AND，第二级为 OR。注意云 API 平台不支持二维数组，此处用字符串承载，服务端自动解析。</p>
     */
    public void setMultiSql(String MultiSql) {
        this.MultiSql = MultiSql;
    }

    /**
     * Get <p>排除的多 SQL 关键词条件，JSON 字符串，结构同 MultiSql。</p> 
     * @return ExcludeMultiSql <p>排除的多 SQL 关键词条件，JSON 字符串，结构同 MultiSql。</p>
     */
    public String getExcludeMultiSql() {
        return this.ExcludeMultiSql;
    }

    /**
     * Set <p>排除的多 SQL 关键词条件，JSON 字符串，结构同 MultiSql。</p>
     * @param ExcludeMultiSql <p>排除的多 SQL 关键词条件，JSON 字符串，结构同 MultiSql。</p>
     */
    public void setExcludeMultiSql(String ExcludeMultiSql) {
        this.ExcludeMultiSql = ExcludeMultiSql;
    }

    /**
     * Get <p>SQL 模板 ID。</p> 
     * @return SqlTemplateId <p>SQL 模板 ID。</p>
     */
    public String getSqlTemplateId() {
        return this.SqlTemplateId;
    }

    /**
     * Set <p>SQL 模板 ID。</p>
     * @param SqlTemplateId <p>SQL 模板 ID。</p>
     */
    public void setSqlTemplateId(String SqlTemplateId) {
        this.SqlTemplateId = SqlTemplateId;
    }

    /**
     * Get <p>SQL 开始时间，示例：2026-10-10 11:05:06.002211</p><p>参数格式：YYYY-MM-DD hh:mm:ss.SSSSSS</p> 
     * @return SqlStartTime <p>SQL 开始时间，示例：2026-10-10 11:05:06.002211</p><p>参数格式：YYYY-MM-DD hh:mm:ss.SSSSSS</p>
     */
    public String getSqlStartTime() {
        return this.SqlStartTime;
    }

    /**
     * Set <p>SQL 开始时间，示例：2026-10-10 11:05:06.002211</p><p>参数格式：YYYY-MM-DD hh:mm:ss.SSSSSS</p>
     * @param SqlStartTime <p>SQL 开始时间，示例：2026-10-10 11:05:06.002211</p><p>参数格式：YYYY-MM-DD hh:mm:ss.SSSSSS</p>
     */
    public void setSqlStartTime(String SqlStartTime) {
        this.SqlStartTime = SqlStartTime;
    }

    /**
     * Get <p>查询 ID，关联查询时使用（LogType=All 时必填）。</p> 
     * @return QueryId <p>查询 ID，关联查询时使用（LogType=All 时必填）。</p>
     */
    public String getQueryId() {
        return this.QueryId;
    }

    /**
     * Set <p>查询 ID，关联查询时使用（LogType=All 时必填）。</p>
     * @param QueryId <p>查询 ID，关联查询时使用（LogType=All 时必填）。</p>
     */
    public void setQueryId(String QueryId) {
        this.QueryId = QueryId;
    }

    public AuditLogQueryFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditLogQueryFilter(AuditLogQueryFilter source) {
        if (source.SqlType != null) {
            this.SqlType = new String[source.SqlType.length];
            for (int i = 0; i < source.SqlType.length; i++) {
                this.SqlType[i] = new String(source.SqlType[i]);
            }
        }
        if (source.ExecTime != null) {
            this.ExecTime = new Long[source.ExecTime.length];
            for (int i = 0; i < source.ExecTime.length; i++) {
                this.ExecTime[i] = new Long(source.ExecTime[i]);
            }
        }
        if (source.IoWaitTime != null) {
            this.IoWaitTime = new Long[source.IoWaitTime.length];
            for (int i = 0; i < source.IoWaitTime.length; i++) {
                this.IoWaitTime[i] = new Long(source.IoWaitTime[i]);
            }
        }
        if (source.CpuTime != null) {
            this.CpuTime = new Long[source.CpuTime.length];
            for (int i = 0; i < source.CpuTime.length; i++) {
                this.CpuTime[i] = new Long(source.CpuTime[i]);
            }
        }
        if (source.LockWaitTime != null) {
            this.LockWaitTime = new Long[source.LockWaitTime.length];
            for (int i = 0; i < source.LockWaitTime.length; i++) {
                this.LockWaitTime[i] = new Long(source.LockWaitTime[i]);
            }
        }
        if (source.ErrCode != null) {
            this.ErrCode = new String(source.ErrCode);
        }
        if (source.ErrInfo != null) {
            this.ErrInfo = new String(source.ErrInfo);
        }
        if (source.DBName != null) {
            this.DBName = new String[source.DBName.length];
            for (int i = 0; i < source.DBName.length; i++) {
                this.DBName[i] = new String(source.DBName[i]);
            }
        }
        if (source.User != null) {
            this.User = new String[source.User.length];
            for (int i = 0; i < source.User.length; i++) {
                this.User[i] = new String(source.User[i]);
            }
        }
        if (source.Host != null) {
            this.Host = new String[source.Host.length];
            for (int i = 0; i < source.Host.length; i++) {
                this.Host[i] = new String(source.Host[i]);
            }
        }
        if (source.ThreadId != null) {
            this.ThreadId = new String[source.ThreadId.length];
            for (int i = 0; i < source.ThreadId.length; i++) {
                this.ThreadId[i] = new String(source.ThreadId[i]);
            }
        }
        if (source.ProxyHostList != null) {
            this.ProxyHostList = new String[source.ProxyHostList.length];
            for (int i = 0; i < source.ProxyHostList.length; i++) {
                this.ProxyHostList[i] = new String(source.ProxyHostList[i]);
            }
        }
        if (source.SetHostList != null) {
            this.SetHostList = new String[source.SetHostList.length];
            for (int i = 0; i < source.SetHostList.length; i++) {
                this.SetHostList[i] = new String(source.SetHostList[i]);
            }
        }
        if (source.SetIdList != null) {
            this.SetIdList = new String[source.SetIdList.length];
            for (int i = 0; i < source.SetIdList.length; i++) {
                this.SetIdList[i] = new String(source.SetIdList[i]);
            }
        }
        if (source.MultiSql != null) {
            this.MultiSql = new String(source.MultiSql);
        }
        if (source.ExcludeMultiSql != null) {
            this.ExcludeMultiSql = new String(source.ExcludeMultiSql);
        }
        if (source.SqlTemplateId != null) {
            this.SqlTemplateId = new String(source.SqlTemplateId);
        }
        if (source.SqlStartTime != null) {
            this.SqlStartTime = new String(source.SqlStartTime);
        }
        if (source.QueryId != null) {
            this.QueryId = new String(source.QueryId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SqlType.", this.SqlType);
        this.setParamArraySimple(map, prefix + "ExecTime.", this.ExecTime);
        this.setParamArraySimple(map, prefix + "IoWaitTime.", this.IoWaitTime);
        this.setParamArraySimple(map, prefix + "CpuTime.", this.CpuTime);
        this.setParamArraySimple(map, prefix + "LockWaitTime.", this.LockWaitTime);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrInfo", this.ErrInfo);
        this.setParamArraySimple(map, prefix + "DBName.", this.DBName);
        this.setParamArraySimple(map, prefix + "User.", this.User);
        this.setParamArraySimple(map, prefix + "Host.", this.Host);
        this.setParamArraySimple(map, prefix + "ThreadId.", this.ThreadId);
        this.setParamArraySimple(map, prefix + "ProxyHostList.", this.ProxyHostList);
        this.setParamArraySimple(map, prefix + "SetHostList.", this.SetHostList);
        this.setParamArraySimple(map, prefix + "SetIdList.", this.SetIdList);
        this.setParamSimple(map, prefix + "MultiSql", this.MultiSql);
        this.setParamSimple(map, prefix + "ExcludeMultiSql", this.ExcludeMultiSql);
        this.setParamSimple(map, prefix + "SqlTemplateId", this.SqlTemplateId);
        this.setParamSimple(map, prefix + "SqlStartTime", this.SqlStartTime);
        this.setParamSimple(map, prefix + "QueryId", this.QueryId);

    }
}

