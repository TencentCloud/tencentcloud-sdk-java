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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDspmExportTaskRequest extends AbstractModel {

    /**
    * 集团账号的成员id
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * 风险等级(0-安全,1-低风险,2-中风险,3-高风险,-1-全部)
    */
    @SerializedName("DangerLevel")
    @Expose
    private Long DangerLevel;

    /**
    * 数据库名称
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 数据库端口
    */
    @SerializedName("DbPort")
    @Expose
    private Long DbPort;

    /**
    * 数据库 IP
    */
    @SerializedName("DbIp")
    @Expose
    private String DbIp;

    /**
    * 资产 ID
    */
    @SerializedName("AssetsId")
    @Expose
    private Long AssetsId;

    /**
    * 会话 ID
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 客户端 IP
    */
    @SerializedName("ClientSideIp")
    @Expose
    private String ClientSideIp;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 命中规则
    */
    @SerializedName("HitRule")
    @Expose
    private Long HitRule;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 模糊查询
    */
    @SerializedName("FuzzySearch")
    @Expose
    private String FuzzySearch;

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 客户端
    */
    @SerializedName("ClientName")
    @Expose
    private String ClientName;

    /**
    * 流量来源，取值 Agent/Proxy/空；传Agent会返回Agent的日志，传Proxy会返回Proxy日志，两都都传或不传则返回所有
    */
    @SerializedName("SourceTypes")
    @Expose
    private String [] SourceTypes;

    /**
    * 表名，长度限制64，多个表名查询的话可以用空格连接	
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 字段名，长度限制64，多个字段名查询的话可以用空格连接
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
    * SQL 主要类型，DDL, DML, DCL, TCL	
    */
    @SerializedName("SqlMainTypes")
    @Expose
    private String [] SqlMainTypes;

    /**
    * 操作类型	
    */
    @SerializedName("SqlType")
    @Expose
    private String SqlType;

    /**
    * 影响行数最小值	
    */
    @SerializedName("RowNumMin")
    @Expose
    private Long RowNumMin;

    /**
    * 影响行数最大值	
    */
    @SerializedName("RowNumMax")
    @Expose
    private Long RowNumMax;

    /**
    * 数据库类型	
    */
    @SerializedName("DbTypes")
    @Expose
    private String [] DbTypes;

    /**
    * 返回码	
    */
    @SerializedName("RetNo")
    @Expose
    private Long RetNo;

    /**
    * 客户端工具	
    */
    @SerializedName("ClientDriverName")
    @Expose
    private String ClientDriverName;

    /**
    * 客户端端口	
    */
    @SerializedName("ClientPort")
    @Expose
    private Long ClientPort;

    /**
    * 审计日志 ID
    */
    @SerializedName("LogId")
    @Expose
    private String LogId;

    /**
    * 风险等级数组(0-安全,1-低风险,2-中风险,3-高风险), 如果要全部，则需要将所有的值都传入。如果为空，则会参考：DangerLevel 入参
    */
    @SerializedName("DangerLevels")
    @Expose
    private Long [] DangerLevels;

    /**
    * 字段分类
    */
    @SerializedName("SensitiveCategoryRule")
    @Expose
    private String SensitiveCategoryRule;

    /**
    * 字段分级
    */
    @SerializedName("SensitiveLevelRisk")
    @Expose
    private String SensitiveLevelRisk;

    /**
    * 事务Id
    */
    @SerializedName("TrxId")
    @Expose
    private Long TrxId;

    /**
    * clientMac
    */
    @SerializedName("ClientMac")
    @Expose
    private String ClientMac;

    /**
     * Get 集团账号的成员id 
     * @return MemberId 集团账号的成员id
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 集团账号的成员id
     * @param MemberId 集团账号的成员id
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get 风险等级(0-安全,1-低风险,2-中风险,3-高风险,-1-全部) 
     * @return DangerLevel 风险等级(0-安全,1-低风险,2-中风险,3-高风险,-1-全部)
     */
    public Long getDangerLevel() {
        return this.DangerLevel;
    }

    /**
     * Set 风险等级(0-安全,1-低风险,2-中风险,3-高风险,-1-全部)
     * @param DangerLevel 风险等级(0-安全,1-低风险,2-中风险,3-高风险,-1-全部)
     */
    public void setDangerLevel(Long DangerLevel) {
        this.DangerLevel = DangerLevel;
    }

    /**
     * Get 数据库名称 
     * @return DbName 数据库名称
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 数据库名称
     * @param DbName 数据库名称
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get 数据库端口 
     * @return DbPort 数据库端口
     */
    public Long getDbPort() {
        return this.DbPort;
    }

    /**
     * Set 数据库端口
     * @param DbPort 数据库端口
     */
    public void setDbPort(Long DbPort) {
        this.DbPort = DbPort;
    }

    /**
     * Get 数据库 IP 
     * @return DbIp 数据库 IP
     */
    public String getDbIp() {
        return this.DbIp;
    }

    /**
     * Set 数据库 IP
     * @param DbIp 数据库 IP
     */
    public void setDbIp(String DbIp) {
        this.DbIp = DbIp;
    }

    /**
     * Get 资产 ID 
     * @return AssetsId 资产 ID
     */
    public Long getAssetsId() {
        return this.AssetsId;
    }

    /**
     * Set 资产 ID
     * @param AssetsId 资产 ID
     */
    public void setAssetsId(Long AssetsId) {
        this.AssetsId = AssetsId;
    }

    /**
     * Get 会话 ID 
     * @return SessionId 会话 ID
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 会话 ID
     * @param SessionId 会话 ID
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 客户端 IP 
     * @return ClientSideIp 客户端 IP
     */
    public String getClientSideIp() {
        return this.ClientSideIp;
    }

    /**
     * Set 客户端 IP
     * @param ClientSideIp 客户端 IP
     */
    public void setClientSideIp(String ClientSideIp) {
        this.ClientSideIp = ClientSideIp;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 命中规则 
     * @return HitRule 命中规则
     */
    public Long getHitRule() {
        return this.HitRule;
    }

    /**
     * Set 命中规则
     * @param HitRule 命中规则
     */
    public void setHitRule(Long HitRule) {
        this.HitRule = HitRule;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 模糊查询 
     * @return FuzzySearch 模糊查询
     */
    public String getFuzzySearch() {
        return this.FuzzySearch;
    }

    /**
     * Set 模糊查询
     * @param FuzzySearch 模糊查询
     */
    public void setFuzzySearch(String FuzzySearch) {
        this.FuzzySearch = FuzzySearch;
    }

    /**
     * Get 用户名 
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 客户端 
     * @return ClientName 客户端
     */
    public String getClientName() {
        return this.ClientName;
    }

    /**
     * Set 客户端
     * @param ClientName 客户端
     */
    public void setClientName(String ClientName) {
        this.ClientName = ClientName;
    }

    /**
     * Get 流量来源，取值 Agent/Proxy/空；传Agent会返回Agent的日志，传Proxy会返回Proxy日志，两都都传或不传则返回所有 
     * @return SourceTypes 流量来源，取值 Agent/Proxy/空；传Agent会返回Agent的日志，传Proxy会返回Proxy日志，两都都传或不传则返回所有
     */
    public String [] getSourceTypes() {
        return this.SourceTypes;
    }

    /**
     * Set 流量来源，取值 Agent/Proxy/空；传Agent会返回Agent的日志，传Proxy会返回Proxy日志，两都都传或不传则返回所有
     * @param SourceTypes 流量来源，取值 Agent/Proxy/空；传Agent会返回Agent的日志，传Proxy会返回Proxy日志，两都都传或不传则返回所有
     */
    public void setSourceTypes(String [] SourceTypes) {
        this.SourceTypes = SourceTypes;
    }

    /**
     * Get 表名，长度限制64，多个表名查询的话可以用空格连接	 
     * @return TableName 表名，长度限制64，多个表名查询的话可以用空格连接	
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名，长度限制64，多个表名查询的话可以用空格连接	
     * @param TableName 表名，长度限制64，多个表名查询的话可以用空格连接	
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 字段名，长度限制64，多个字段名查询的话可以用空格连接 
     * @return FieldName 字段名，长度限制64，多个字段名查询的话可以用空格连接
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set 字段名，长度限制64，多个字段名查询的话可以用空格连接
     * @param FieldName 字段名，长度限制64，多个字段名查询的话可以用空格连接
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    /**
     * Get SQL 主要类型，DDL, DML, DCL, TCL	 
     * @return SqlMainTypes SQL 主要类型，DDL, DML, DCL, TCL	
     */
    public String [] getSqlMainTypes() {
        return this.SqlMainTypes;
    }

    /**
     * Set SQL 主要类型，DDL, DML, DCL, TCL	
     * @param SqlMainTypes SQL 主要类型，DDL, DML, DCL, TCL	
     */
    public void setSqlMainTypes(String [] SqlMainTypes) {
        this.SqlMainTypes = SqlMainTypes;
    }

    /**
     * Get 操作类型	 
     * @return SqlType 操作类型	
     */
    public String getSqlType() {
        return this.SqlType;
    }

    /**
     * Set 操作类型	
     * @param SqlType 操作类型	
     */
    public void setSqlType(String SqlType) {
        this.SqlType = SqlType;
    }

    /**
     * Get 影响行数最小值	 
     * @return RowNumMin 影响行数最小值	
     */
    public Long getRowNumMin() {
        return this.RowNumMin;
    }

    /**
     * Set 影响行数最小值	
     * @param RowNumMin 影响行数最小值	
     */
    public void setRowNumMin(Long RowNumMin) {
        this.RowNumMin = RowNumMin;
    }

    /**
     * Get 影响行数最大值	 
     * @return RowNumMax 影响行数最大值	
     */
    public Long getRowNumMax() {
        return this.RowNumMax;
    }

    /**
     * Set 影响行数最大值	
     * @param RowNumMax 影响行数最大值	
     */
    public void setRowNumMax(Long RowNumMax) {
        this.RowNumMax = RowNumMax;
    }

    /**
     * Get 数据库类型	 
     * @return DbTypes 数据库类型	
     */
    public String [] getDbTypes() {
        return this.DbTypes;
    }

    /**
     * Set 数据库类型	
     * @param DbTypes 数据库类型	
     */
    public void setDbTypes(String [] DbTypes) {
        this.DbTypes = DbTypes;
    }

    /**
     * Get 返回码	 
     * @return RetNo 返回码	
     */
    public Long getRetNo() {
        return this.RetNo;
    }

    /**
     * Set 返回码	
     * @param RetNo 返回码	
     */
    public void setRetNo(Long RetNo) {
        this.RetNo = RetNo;
    }

    /**
     * Get 客户端工具	 
     * @return ClientDriverName 客户端工具	
     */
    public String getClientDriverName() {
        return this.ClientDriverName;
    }

    /**
     * Set 客户端工具	
     * @param ClientDriverName 客户端工具	
     */
    public void setClientDriverName(String ClientDriverName) {
        this.ClientDriverName = ClientDriverName;
    }

    /**
     * Get 客户端端口	 
     * @return ClientPort 客户端端口	
     */
    public Long getClientPort() {
        return this.ClientPort;
    }

    /**
     * Set 客户端端口	
     * @param ClientPort 客户端端口	
     */
    public void setClientPort(Long ClientPort) {
        this.ClientPort = ClientPort;
    }

    /**
     * Get 审计日志 ID 
     * @return LogId 审计日志 ID
     */
    public String getLogId() {
        return this.LogId;
    }

    /**
     * Set 审计日志 ID
     * @param LogId 审计日志 ID
     */
    public void setLogId(String LogId) {
        this.LogId = LogId;
    }

    /**
     * Get 风险等级数组(0-安全,1-低风险,2-中风险,3-高风险), 如果要全部，则需要将所有的值都传入。如果为空，则会参考：DangerLevel 入参 
     * @return DangerLevels 风险等级数组(0-安全,1-低风险,2-中风险,3-高风险), 如果要全部，则需要将所有的值都传入。如果为空，则会参考：DangerLevel 入参
     */
    public Long [] getDangerLevels() {
        return this.DangerLevels;
    }

    /**
     * Set 风险等级数组(0-安全,1-低风险,2-中风险,3-高风险), 如果要全部，则需要将所有的值都传入。如果为空，则会参考：DangerLevel 入参
     * @param DangerLevels 风险等级数组(0-安全,1-低风险,2-中风险,3-高风险), 如果要全部，则需要将所有的值都传入。如果为空，则会参考：DangerLevel 入参
     */
    public void setDangerLevels(Long [] DangerLevels) {
        this.DangerLevels = DangerLevels;
    }

    /**
     * Get 字段分类 
     * @return SensitiveCategoryRule 字段分类
     */
    public String getSensitiveCategoryRule() {
        return this.SensitiveCategoryRule;
    }

    /**
     * Set 字段分类
     * @param SensitiveCategoryRule 字段分类
     */
    public void setSensitiveCategoryRule(String SensitiveCategoryRule) {
        this.SensitiveCategoryRule = SensitiveCategoryRule;
    }

    /**
     * Get 字段分级 
     * @return SensitiveLevelRisk 字段分级
     */
    public String getSensitiveLevelRisk() {
        return this.SensitiveLevelRisk;
    }

    /**
     * Set 字段分级
     * @param SensitiveLevelRisk 字段分级
     */
    public void setSensitiveLevelRisk(String SensitiveLevelRisk) {
        this.SensitiveLevelRisk = SensitiveLevelRisk;
    }

    /**
     * Get 事务Id 
     * @return TrxId 事务Id
     */
    public Long getTrxId() {
        return this.TrxId;
    }

    /**
     * Set 事务Id
     * @param TrxId 事务Id
     */
    public void setTrxId(Long TrxId) {
        this.TrxId = TrxId;
    }

    /**
     * Get clientMac 
     * @return ClientMac clientMac
     */
    public String getClientMac() {
        return this.ClientMac;
    }

    /**
     * Set clientMac
     * @param ClientMac clientMac
     */
    public void setClientMac(String ClientMac) {
        this.ClientMac = ClientMac;
    }

    public CreateDspmExportTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDspmExportTaskRequest(CreateDspmExportTaskRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.DangerLevel != null) {
            this.DangerLevel = new Long(source.DangerLevel);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.DbPort != null) {
            this.DbPort = new Long(source.DbPort);
        }
        if (source.DbIp != null) {
            this.DbIp = new String(source.DbIp);
        }
        if (source.AssetsId != null) {
            this.AssetsId = new Long(source.AssetsId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.ClientSideIp != null) {
            this.ClientSideIp = new String(source.ClientSideIp);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.HitRule != null) {
            this.HitRule = new Long(source.HitRule);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.FuzzySearch != null) {
            this.FuzzySearch = new String(source.FuzzySearch);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.ClientName != null) {
            this.ClientName = new String(source.ClientName);
        }
        if (source.SourceTypes != null) {
            this.SourceTypes = new String[source.SourceTypes.length];
            for (int i = 0; i < source.SourceTypes.length; i++) {
                this.SourceTypes[i] = new String(source.SourceTypes[i]);
            }
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.FieldName != null) {
            this.FieldName = new String(source.FieldName);
        }
        if (source.SqlMainTypes != null) {
            this.SqlMainTypes = new String[source.SqlMainTypes.length];
            for (int i = 0; i < source.SqlMainTypes.length; i++) {
                this.SqlMainTypes[i] = new String(source.SqlMainTypes[i]);
            }
        }
        if (source.SqlType != null) {
            this.SqlType = new String(source.SqlType);
        }
        if (source.RowNumMin != null) {
            this.RowNumMin = new Long(source.RowNumMin);
        }
        if (source.RowNumMax != null) {
            this.RowNumMax = new Long(source.RowNumMax);
        }
        if (source.DbTypes != null) {
            this.DbTypes = new String[source.DbTypes.length];
            for (int i = 0; i < source.DbTypes.length; i++) {
                this.DbTypes[i] = new String(source.DbTypes[i]);
            }
        }
        if (source.RetNo != null) {
            this.RetNo = new Long(source.RetNo);
        }
        if (source.ClientDriverName != null) {
            this.ClientDriverName = new String(source.ClientDriverName);
        }
        if (source.ClientPort != null) {
            this.ClientPort = new Long(source.ClientPort);
        }
        if (source.LogId != null) {
            this.LogId = new String(source.LogId);
        }
        if (source.DangerLevels != null) {
            this.DangerLevels = new Long[source.DangerLevels.length];
            for (int i = 0; i < source.DangerLevels.length; i++) {
                this.DangerLevels[i] = new Long(source.DangerLevels[i]);
            }
        }
        if (source.SensitiveCategoryRule != null) {
            this.SensitiveCategoryRule = new String(source.SensitiveCategoryRule);
        }
        if (source.SensitiveLevelRisk != null) {
            this.SensitiveLevelRisk = new String(source.SensitiveLevelRisk);
        }
        if (source.TrxId != null) {
            this.TrxId = new Long(source.TrxId);
        }
        if (source.ClientMac != null) {
            this.ClientMac = new String(source.ClientMac);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "DangerLevel", this.DangerLevel);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "DbPort", this.DbPort);
        this.setParamSimple(map, prefix + "DbIp", this.DbIp);
        this.setParamSimple(map, prefix + "AssetsId", this.AssetsId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "ClientSideIp", this.ClientSideIp);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "HitRule", this.HitRule);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "FuzzySearch", this.FuzzySearch);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "ClientName", this.ClientName);
        this.setParamArraySimple(map, prefix + "SourceTypes.", this.SourceTypes);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);
        this.setParamArraySimple(map, prefix + "SqlMainTypes.", this.SqlMainTypes);
        this.setParamSimple(map, prefix + "SqlType", this.SqlType);
        this.setParamSimple(map, prefix + "RowNumMin", this.RowNumMin);
        this.setParamSimple(map, prefix + "RowNumMax", this.RowNumMax);
        this.setParamArraySimple(map, prefix + "DbTypes.", this.DbTypes);
        this.setParamSimple(map, prefix + "RetNo", this.RetNo);
        this.setParamSimple(map, prefix + "ClientDriverName", this.ClientDriverName);
        this.setParamSimple(map, prefix + "ClientPort", this.ClientPort);
        this.setParamSimple(map, prefix + "LogId", this.LogId);
        this.setParamArraySimple(map, prefix + "DangerLevels.", this.DangerLevels);
        this.setParamSimple(map, prefix + "SensitiveCategoryRule", this.SensitiveCategoryRule);
        this.setParamSimple(map, prefix + "SensitiveLevelRisk", this.SensitiveLevelRisk);
        this.setParamSimple(map, prefix + "TrxId", this.TrxId);
        this.setParamSimple(map, prefix + "ClientMac", this.ClientMac);

    }
}

