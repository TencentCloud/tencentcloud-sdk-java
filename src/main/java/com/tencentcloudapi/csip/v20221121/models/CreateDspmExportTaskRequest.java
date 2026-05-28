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
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>风险等级(0-安全,1-低风险,2-中风险,3-高风险,-1-全部)</p>
    */
    @SerializedName("DangerLevel")
    @Expose
    private Long DangerLevel;

    /**
    * <p>数据库名称</p>
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * <p>数据库端口</p>
    */
    @SerializedName("DbPort")
    @Expose
    private Long DbPort;

    /**
    * <p>数据库 IP</p>
    */
    @SerializedName("DbIp")
    @Expose
    private String DbIp;

    /**
    * <p>资产 ID</p>
    */
    @SerializedName("AssetsId")
    @Expose
    private Long AssetsId;

    /**
    * <p>会话 ID</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>客户端 IP</p>
    */
    @SerializedName("ClientSideIp")
    @Expose
    private String ClientSideIp;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>命中规则</p>
    */
    @SerializedName("HitRule")
    @Expose
    private Long HitRule;

    /**
    * <p>开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>模糊查询</p>
    */
    @SerializedName("FuzzySearch")
    @Expose
    private String FuzzySearch;

    /**
    * <p>用户名</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>客户端</p>
    */
    @SerializedName("ClientName")
    @Expose
    private String ClientName;

    /**
    * <p>流量来源，取值 Agent/Proxy/空；传Agent会返回Agent的日志，传Proxy会返回Proxy日志，两都传或不传则返回所有</p>
    */
    @SerializedName("SourceTypes")
    @Expose
    private String [] SourceTypes;

    /**
    * <p>表名，长度限制64，多个表名查询的话可以用空格连接</p>
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * <p>字段名，长度限制64，多个字段名查询的话可以用空格连接</p>
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
    * <p>SQL 主要类型，DDL, DML, DCL, TCL</p>
    */
    @SerializedName("SqlMainTypes")
    @Expose
    private String [] SqlMainTypes;

    /**
    * <p>操作类型</p>
    */
    @SerializedName("SqlType")
    @Expose
    private String SqlType;

    /**
    * <p>影响行数最小值</p>
    */
    @SerializedName("RowNumMin")
    @Expose
    private Long RowNumMin;

    /**
    * <p>影响行数最大值</p>
    */
    @SerializedName("RowNumMax")
    @Expose
    private Long RowNumMax;

    /**
    * <p>数据库类型</p>
    */
    @SerializedName("DbTypes")
    @Expose
    private String [] DbTypes;

    /**
    * <p>返回码</p>
    */
    @SerializedName("RetNo")
    @Expose
    private Long RetNo;

    /**
    * <p>客户端工具</p>
    */
    @SerializedName("ClientDriverName")
    @Expose
    private String ClientDriverName;

    /**
    * <p>客户端端口</p>
    */
    @SerializedName("ClientPort")
    @Expose
    private Long ClientPort;

    /**
    * <p>审计日志 ID</p>
    */
    @SerializedName("LogId")
    @Expose
    private String LogId;

    /**
    * <p>风险等级数组(0-安全,1-低风险,2-中风险,3-高风险), 如果要全部，则需要将所有的值都传入。如果为空，则会参考：DangerLevel 入参</p>
    */
    @SerializedName("DangerLevels")
    @Expose
    private Long [] DangerLevels;

    /**
    * <p>字段分类</p>
    */
    @SerializedName("SensitiveCategoryRule")
    @Expose
    private String SensitiveCategoryRule;

    /**
    * <p>字段分级</p>
    */
    @SerializedName("SensitiveLevelRisk")
    @Expose
    private String SensitiveLevelRisk;

    /**
    * <p>事务Id</p>
    */
    @SerializedName("TrxId")
    @Expose
    private Long TrxId;

    /**
    * <p>clientMac</p>
    */
    @SerializedName("ClientMac")
    @Expose
    private String ClientMac;

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>风险等级(0-安全,1-低风险,2-中风险,3-高风险,-1-全部)</p> 
     * @return DangerLevel <p>风险等级(0-安全,1-低风险,2-中风险,3-高风险,-1-全部)</p>
     */
    public Long getDangerLevel() {
        return this.DangerLevel;
    }

    /**
     * Set <p>风险等级(0-安全,1-低风险,2-中风险,3-高风险,-1-全部)</p>
     * @param DangerLevel <p>风险等级(0-安全,1-低风险,2-中风险,3-高风险,-1-全部)</p>
     */
    public void setDangerLevel(Long DangerLevel) {
        this.DangerLevel = DangerLevel;
    }

    /**
     * Get <p>数据库名称</p> 
     * @return DbName <p>数据库名称</p>
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set <p>数据库名称</p>
     * @param DbName <p>数据库名称</p>
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get <p>数据库端口</p> 
     * @return DbPort <p>数据库端口</p>
     */
    public Long getDbPort() {
        return this.DbPort;
    }

    /**
     * Set <p>数据库端口</p>
     * @param DbPort <p>数据库端口</p>
     */
    public void setDbPort(Long DbPort) {
        this.DbPort = DbPort;
    }

    /**
     * Get <p>数据库 IP</p> 
     * @return DbIp <p>数据库 IP</p>
     */
    public String getDbIp() {
        return this.DbIp;
    }

    /**
     * Set <p>数据库 IP</p>
     * @param DbIp <p>数据库 IP</p>
     */
    public void setDbIp(String DbIp) {
        this.DbIp = DbIp;
    }

    /**
     * Get <p>资产 ID</p> 
     * @return AssetsId <p>资产 ID</p>
     */
    public Long getAssetsId() {
        return this.AssetsId;
    }

    /**
     * Set <p>资产 ID</p>
     * @param AssetsId <p>资产 ID</p>
     */
    public void setAssetsId(Long AssetsId) {
        this.AssetsId = AssetsId;
    }

    /**
     * Get <p>会话 ID</p> 
     * @return SessionId <p>会话 ID</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>会话 ID</p>
     * @param SessionId <p>会话 ID</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>客户端 IP</p> 
     * @return ClientSideIp <p>客户端 IP</p>
     */
    public String getClientSideIp() {
        return this.ClientSideIp;
    }

    /**
     * Set <p>客户端 IP</p>
     * @param ClientSideIp <p>客户端 IP</p>
     */
    public void setClientSideIp(String ClientSideIp) {
        this.ClientSideIp = ClientSideIp;
    }

    /**
     * Get <p>结束时间</p> 
     * @return EndTime <p>结束时间</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
     * @param EndTime <p>结束时间</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>命中规则</p> 
     * @return HitRule <p>命中规则</p>
     */
    public Long getHitRule() {
        return this.HitRule;
    }

    /**
     * Set <p>命中规则</p>
     * @param HitRule <p>命中规则</p>
     */
    public void setHitRule(Long HitRule) {
        this.HitRule = HitRule;
    }

    /**
     * Get <p>开始时间</p> 
     * @return StartTime <p>开始时间</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p>
     * @param StartTime <p>开始时间</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>模糊查询</p> 
     * @return FuzzySearch <p>模糊查询</p>
     */
    public String getFuzzySearch() {
        return this.FuzzySearch;
    }

    /**
     * Set <p>模糊查询</p>
     * @param FuzzySearch <p>模糊查询</p>
     */
    public void setFuzzySearch(String FuzzySearch) {
        this.FuzzySearch = FuzzySearch;
    }

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
     * Get <p>客户端</p> 
     * @return ClientName <p>客户端</p>
     */
    public String getClientName() {
        return this.ClientName;
    }

    /**
     * Set <p>客户端</p>
     * @param ClientName <p>客户端</p>
     */
    public void setClientName(String ClientName) {
        this.ClientName = ClientName;
    }

    /**
     * Get <p>流量来源，取值 Agent/Proxy/空；传Agent会返回Agent的日志，传Proxy会返回Proxy日志，两都传或不传则返回所有</p> 
     * @return SourceTypes <p>流量来源，取值 Agent/Proxy/空；传Agent会返回Agent的日志，传Proxy会返回Proxy日志，两都传或不传则返回所有</p>
     */
    public String [] getSourceTypes() {
        return this.SourceTypes;
    }

    /**
     * Set <p>流量来源，取值 Agent/Proxy/空；传Agent会返回Agent的日志，传Proxy会返回Proxy日志，两都传或不传则返回所有</p>
     * @param SourceTypes <p>流量来源，取值 Agent/Proxy/空；传Agent会返回Agent的日志，传Proxy会返回Proxy日志，两都传或不传则返回所有</p>
     */
    public void setSourceTypes(String [] SourceTypes) {
        this.SourceTypes = SourceTypes;
    }

    /**
     * Get <p>表名，长度限制64，多个表名查询的话可以用空格连接</p> 
     * @return TableName <p>表名，长度限制64，多个表名查询的话可以用空格连接</p>
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set <p>表名，长度限制64，多个表名查询的话可以用空格连接</p>
     * @param TableName <p>表名，长度限制64，多个表名查询的话可以用空格连接</p>
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get <p>字段名，长度限制64，多个字段名查询的话可以用空格连接</p> 
     * @return FieldName <p>字段名，长度限制64，多个字段名查询的话可以用空格连接</p>
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set <p>字段名，长度限制64，多个字段名查询的话可以用空格连接</p>
     * @param FieldName <p>字段名，长度限制64，多个字段名查询的话可以用空格连接</p>
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    /**
     * Get <p>SQL 主要类型，DDL, DML, DCL, TCL</p> 
     * @return SqlMainTypes <p>SQL 主要类型，DDL, DML, DCL, TCL</p>
     */
    public String [] getSqlMainTypes() {
        return this.SqlMainTypes;
    }

    /**
     * Set <p>SQL 主要类型，DDL, DML, DCL, TCL</p>
     * @param SqlMainTypes <p>SQL 主要类型，DDL, DML, DCL, TCL</p>
     */
    public void setSqlMainTypes(String [] SqlMainTypes) {
        this.SqlMainTypes = SqlMainTypes;
    }

    /**
     * Get <p>操作类型</p> 
     * @return SqlType <p>操作类型</p>
     */
    public String getSqlType() {
        return this.SqlType;
    }

    /**
     * Set <p>操作类型</p>
     * @param SqlType <p>操作类型</p>
     */
    public void setSqlType(String SqlType) {
        this.SqlType = SqlType;
    }

    /**
     * Get <p>影响行数最小值</p> 
     * @return RowNumMin <p>影响行数最小值</p>
     */
    public Long getRowNumMin() {
        return this.RowNumMin;
    }

    /**
     * Set <p>影响行数最小值</p>
     * @param RowNumMin <p>影响行数最小值</p>
     */
    public void setRowNumMin(Long RowNumMin) {
        this.RowNumMin = RowNumMin;
    }

    /**
     * Get <p>影响行数最大值</p> 
     * @return RowNumMax <p>影响行数最大值</p>
     */
    public Long getRowNumMax() {
        return this.RowNumMax;
    }

    /**
     * Set <p>影响行数最大值</p>
     * @param RowNumMax <p>影响行数最大值</p>
     */
    public void setRowNumMax(Long RowNumMax) {
        this.RowNumMax = RowNumMax;
    }

    /**
     * Get <p>数据库类型</p> 
     * @return DbTypes <p>数据库类型</p>
     */
    public String [] getDbTypes() {
        return this.DbTypes;
    }

    /**
     * Set <p>数据库类型</p>
     * @param DbTypes <p>数据库类型</p>
     */
    public void setDbTypes(String [] DbTypes) {
        this.DbTypes = DbTypes;
    }

    /**
     * Get <p>返回码</p> 
     * @return RetNo <p>返回码</p>
     */
    public Long getRetNo() {
        return this.RetNo;
    }

    /**
     * Set <p>返回码</p>
     * @param RetNo <p>返回码</p>
     */
    public void setRetNo(Long RetNo) {
        this.RetNo = RetNo;
    }

    /**
     * Get <p>客户端工具</p> 
     * @return ClientDriverName <p>客户端工具</p>
     */
    public String getClientDriverName() {
        return this.ClientDriverName;
    }

    /**
     * Set <p>客户端工具</p>
     * @param ClientDriverName <p>客户端工具</p>
     */
    public void setClientDriverName(String ClientDriverName) {
        this.ClientDriverName = ClientDriverName;
    }

    /**
     * Get <p>客户端端口</p> 
     * @return ClientPort <p>客户端端口</p>
     */
    public Long getClientPort() {
        return this.ClientPort;
    }

    /**
     * Set <p>客户端端口</p>
     * @param ClientPort <p>客户端端口</p>
     */
    public void setClientPort(Long ClientPort) {
        this.ClientPort = ClientPort;
    }

    /**
     * Get <p>审计日志 ID</p> 
     * @return LogId <p>审计日志 ID</p>
     */
    public String getLogId() {
        return this.LogId;
    }

    /**
     * Set <p>审计日志 ID</p>
     * @param LogId <p>审计日志 ID</p>
     */
    public void setLogId(String LogId) {
        this.LogId = LogId;
    }

    /**
     * Get <p>风险等级数组(0-安全,1-低风险,2-中风险,3-高风险), 如果要全部，则需要将所有的值都传入。如果为空，则会参考：DangerLevel 入参</p> 
     * @return DangerLevels <p>风险等级数组(0-安全,1-低风险,2-中风险,3-高风险), 如果要全部，则需要将所有的值都传入。如果为空，则会参考：DangerLevel 入参</p>
     */
    public Long [] getDangerLevels() {
        return this.DangerLevels;
    }

    /**
     * Set <p>风险等级数组(0-安全,1-低风险,2-中风险,3-高风险), 如果要全部，则需要将所有的值都传入。如果为空，则会参考：DangerLevel 入参</p>
     * @param DangerLevels <p>风险等级数组(0-安全,1-低风险,2-中风险,3-高风险), 如果要全部，则需要将所有的值都传入。如果为空，则会参考：DangerLevel 入参</p>
     */
    public void setDangerLevels(Long [] DangerLevels) {
        this.DangerLevels = DangerLevels;
    }

    /**
     * Get <p>字段分类</p> 
     * @return SensitiveCategoryRule <p>字段分类</p>
     */
    public String getSensitiveCategoryRule() {
        return this.SensitiveCategoryRule;
    }

    /**
     * Set <p>字段分类</p>
     * @param SensitiveCategoryRule <p>字段分类</p>
     */
    public void setSensitiveCategoryRule(String SensitiveCategoryRule) {
        this.SensitiveCategoryRule = SensitiveCategoryRule;
    }

    /**
     * Get <p>字段分级</p> 
     * @return SensitiveLevelRisk <p>字段分级</p>
     */
    public String getSensitiveLevelRisk() {
        return this.SensitiveLevelRisk;
    }

    /**
     * Set <p>字段分级</p>
     * @param SensitiveLevelRisk <p>字段分级</p>
     */
    public void setSensitiveLevelRisk(String SensitiveLevelRisk) {
        this.SensitiveLevelRisk = SensitiveLevelRisk;
    }

    /**
     * Get <p>事务Id</p> 
     * @return TrxId <p>事务Id</p>
     */
    public Long getTrxId() {
        return this.TrxId;
    }

    /**
     * Set <p>事务Id</p>
     * @param TrxId <p>事务Id</p>
     */
    public void setTrxId(Long TrxId) {
        this.TrxId = TrxId;
    }

    /**
     * Get <p>clientMac</p> 
     * @return ClientMac <p>clientMac</p>
     */
    public String getClientMac() {
        return this.ClientMac;
    }

    /**
     * Set <p>clientMac</p>
     * @param ClientMac <p>clientMac</p>
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

