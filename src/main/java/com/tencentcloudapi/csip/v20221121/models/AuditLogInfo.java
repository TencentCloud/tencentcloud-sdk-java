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

public class AuditLogInfo extends AbstractModel {

    /**
    * ai分数
    */
    @SerializedName("AiScore")
    @Expose
    private Float AiScore;

    /**
    * 应用用户
    */
    @SerializedName("AppUser")
    @Expose
    private String AppUser;

    /**
    * 备份数据包
    */
    @SerializedName("BackPacket")
    @Expose
    private String BackPacket;

    /**
    * 客户端 IP
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * 客户端 Mac
    */
    @SerializedName("ClientMac")
    @Expose
    private String ClientMac;

    /**
    * 终端名称，取值Proxy时为casb代理流量，其它为Agent流量
    */
    @SerializedName("ClientName")
    @Expose
    private String ClientName;

    /**
    * 客户端用户
    */
    @SerializedName("ClientUser")
    @Expose
    private String ClientUser;

    /**
    * 客户端端口
    */
    @SerializedName("ClientPort")
    @Expose
    private Long ClientPort;

    /**
    * 风险等级
    */
    @SerializedName("DangerLevel")
    @Expose
    private Long DangerLevel;

    /**
    * 数据库 IP
    */
    @SerializedName("DbIp")
    @Expose
    private String DbIp;

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
    * 数据库用户
    */
    @SerializedName("DbUser")
    @Expose
    private String DbUser;

    /**
    * 影响行数
    */
    @SerializedName("EffectRow")
    @Expose
    private Long EffectRow;

    /**
    * 执行时间
    */
    @SerializedName("ExecTime")
    @Expose
    private Long ExecTime;

    /**
    * 命中规则
    */
    @SerializedName("HitRule")
    @Expose
    private String HitRule;

    /**
    * 日志 ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 数据资产名称
    */
    @SerializedName("InstanceId")
    @Expose
    private Long InstanceId;

    /**
    * 审计单元名
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 操作语句(sql 语句)
    */
    @SerializedName("OpSql")
    @Expose
    private String OpSql;

    /**
    * 操作时间(时间)
    */
    @SerializedName("OpTime")
    @Expose
    private Long OpTime;

    /**
    * 返回消息
    */
    @SerializedName("RetMsg")
    @Expose
    private String RetMsg;

    /**
    * 返回码
    */
    @SerializedName("RetNo")
    @Expose
    private Long RetNo;

    /**
    * 会话ID
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 操作类型
    */
    @SerializedName("SqlType")
    @Expose
    private String SqlType;

    /**
    * 表名
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 数据资产名称
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * 规则集合
    */
    @SerializedName("HitRules")
    @Expose
    private HitRules [] HitRules;

    /**
    * 流量来源
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 单条审计日志id
    */
    @SerializedName("ReqId")
    @Expose
    private String ReqId;

    /**
    * SQL 主要类型，DML/DDL/DCL/TCL
    */
    @SerializedName("SqlMainType")
    @Expose
    private String SqlMainType;

    /**
    * 表名集合
    */
    @SerializedName("TableNames")
    @Expose
    private String [] TableNames;

    /**
    * 字段名集合
    */
    @SerializedName("FieldNames")
    @Expose
    private String [] FieldNames;

    /**
    * 字段名
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
    * 数据库类型
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * 客户端工具
    */
    @SerializedName("ClientDriverName")
    @Expose
    private String ClientDriverName;

    /**
    * 位置信息
    */
    @SerializedName("Location")
    @Expose
    private Location Location;

    /**
    * 字段信息（包含敏感信息）
    */
    @SerializedName("FieldDetails")
    @Expose
    private TableField [] FieldDetails;

    /**
    * 资产所属账号app id
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 账号昵称
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 资产所属账号uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
     * Get ai分数 
     * @return AiScore ai分数
     */
    public Float getAiScore() {
        return this.AiScore;
    }

    /**
     * Set ai分数
     * @param AiScore ai分数
     */
    public void setAiScore(Float AiScore) {
        this.AiScore = AiScore;
    }

    /**
     * Get 应用用户 
     * @return AppUser 应用用户
     */
    public String getAppUser() {
        return this.AppUser;
    }

    /**
     * Set 应用用户
     * @param AppUser 应用用户
     */
    public void setAppUser(String AppUser) {
        this.AppUser = AppUser;
    }

    /**
     * Get 备份数据包 
     * @return BackPacket 备份数据包
     */
    public String getBackPacket() {
        return this.BackPacket;
    }

    /**
     * Set 备份数据包
     * @param BackPacket 备份数据包
     */
    public void setBackPacket(String BackPacket) {
        this.BackPacket = BackPacket;
    }

    /**
     * Get 客户端 IP 
     * @return ClientIp 客户端 IP
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set 客户端 IP
     * @param ClientIp 客户端 IP
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get 客户端 Mac 
     * @return ClientMac 客户端 Mac
     */
    public String getClientMac() {
        return this.ClientMac;
    }

    /**
     * Set 客户端 Mac
     * @param ClientMac 客户端 Mac
     */
    public void setClientMac(String ClientMac) {
        this.ClientMac = ClientMac;
    }

    /**
     * Get 终端名称，取值Proxy时为casb代理流量，其它为Agent流量 
     * @return ClientName 终端名称，取值Proxy时为casb代理流量，其它为Agent流量
     */
    public String getClientName() {
        return this.ClientName;
    }

    /**
     * Set 终端名称，取值Proxy时为casb代理流量，其它为Agent流量
     * @param ClientName 终端名称，取值Proxy时为casb代理流量，其它为Agent流量
     */
    public void setClientName(String ClientName) {
        this.ClientName = ClientName;
    }

    /**
     * Get 客户端用户 
     * @return ClientUser 客户端用户
     */
    public String getClientUser() {
        return this.ClientUser;
    }

    /**
     * Set 客户端用户
     * @param ClientUser 客户端用户
     */
    public void setClientUser(String ClientUser) {
        this.ClientUser = ClientUser;
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
     * Get 风险等级 
     * @return DangerLevel 风险等级
     */
    public Long getDangerLevel() {
        return this.DangerLevel;
    }

    /**
     * Set 风险等级
     * @param DangerLevel 风险等级
     */
    public void setDangerLevel(Long DangerLevel) {
        this.DangerLevel = DangerLevel;
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
     * Get 数据库用户 
     * @return DbUser 数据库用户
     */
    public String getDbUser() {
        return this.DbUser;
    }

    /**
     * Set 数据库用户
     * @param DbUser 数据库用户
     */
    public void setDbUser(String DbUser) {
        this.DbUser = DbUser;
    }

    /**
     * Get 影响行数 
     * @return EffectRow 影响行数
     */
    public Long getEffectRow() {
        return this.EffectRow;
    }

    /**
     * Set 影响行数
     * @param EffectRow 影响行数
     */
    public void setEffectRow(Long EffectRow) {
        this.EffectRow = EffectRow;
    }

    /**
     * Get 执行时间 
     * @return ExecTime 执行时间
     */
    public Long getExecTime() {
        return this.ExecTime;
    }

    /**
     * Set 执行时间
     * @param ExecTime 执行时间
     */
    public void setExecTime(Long ExecTime) {
        this.ExecTime = ExecTime;
    }

    /**
     * Get 命中规则 
     * @return HitRule 命中规则
     */
    public String getHitRule() {
        return this.HitRule;
    }

    /**
     * Set 命中规则
     * @param HitRule 命中规则
     */
    public void setHitRule(String HitRule) {
        this.HitRule = HitRule;
    }

    /**
     * Get 日志 ID 
     * @return Id 日志 ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 日志 ID
     * @param Id 日志 ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 数据资产名称 
     * @return InstanceId 数据资产名称
     */
    public Long getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 数据资产名称
     * @param InstanceId 数据资产名称
     */
    public void setInstanceId(Long InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 审计单元名 
     * @return InstanceName 审计单元名
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 审计单元名
     * @param InstanceName 审计单元名
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 操作语句(sql 语句) 
     * @return OpSql 操作语句(sql 语句)
     */
    public String getOpSql() {
        return this.OpSql;
    }

    /**
     * Set 操作语句(sql 语句)
     * @param OpSql 操作语句(sql 语句)
     */
    public void setOpSql(String OpSql) {
        this.OpSql = OpSql;
    }

    /**
     * Get 操作时间(时间) 
     * @return OpTime 操作时间(时间)
     */
    public Long getOpTime() {
        return this.OpTime;
    }

    /**
     * Set 操作时间(时间)
     * @param OpTime 操作时间(时间)
     */
    public void setOpTime(Long OpTime) {
        this.OpTime = OpTime;
    }

    /**
     * Get 返回消息 
     * @return RetMsg 返回消息
     */
    public String getRetMsg() {
        return this.RetMsg;
    }

    /**
     * Set 返回消息
     * @param RetMsg 返回消息
     */
    public void setRetMsg(String RetMsg) {
        this.RetMsg = RetMsg;
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
     * Get 会话ID 
     * @return SessionId 会话ID
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 会话ID
     * @param SessionId 会话ID
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
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
     * Get 表名 
     * @return TableName 表名
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名
     * @param TableName 表名
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 数据资产名称 
     * @return AssetName 数据资产名称
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set 数据资产名称
     * @param AssetName 数据资产名称
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get 规则集合 
     * @return HitRules 规则集合
     */
    public HitRules [] getHitRules() {
        return this.HitRules;
    }

    /**
     * Set 规则集合
     * @param HitRules 规则集合
     */
    public void setHitRules(HitRules [] HitRules) {
        this.HitRules = HitRules;
    }

    /**
     * Get 流量来源 
     * @return SourceType 流量来源
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 流量来源
     * @param SourceType 流量来源
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 单条审计日志id 
     * @return ReqId 单条审计日志id
     */
    public String getReqId() {
        return this.ReqId;
    }

    /**
     * Set 单条审计日志id
     * @param ReqId 单条审计日志id
     */
    public void setReqId(String ReqId) {
        this.ReqId = ReqId;
    }

    /**
     * Get SQL 主要类型，DML/DDL/DCL/TCL 
     * @return SqlMainType SQL 主要类型，DML/DDL/DCL/TCL
     */
    public String getSqlMainType() {
        return this.SqlMainType;
    }

    /**
     * Set SQL 主要类型，DML/DDL/DCL/TCL
     * @param SqlMainType SQL 主要类型，DML/DDL/DCL/TCL
     */
    public void setSqlMainType(String SqlMainType) {
        this.SqlMainType = SqlMainType;
    }

    /**
     * Get 表名集合 
     * @return TableNames 表名集合
     */
    public String [] getTableNames() {
        return this.TableNames;
    }

    /**
     * Set 表名集合
     * @param TableNames 表名集合
     */
    public void setTableNames(String [] TableNames) {
        this.TableNames = TableNames;
    }

    /**
     * Get 字段名集合 
     * @return FieldNames 字段名集合
     */
    public String [] getFieldNames() {
        return this.FieldNames;
    }

    /**
     * Set 字段名集合
     * @param FieldNames 字段名集合
     */
    public void setFieldNames(String [] FieldNames) {
        this.FieldNames = FieldNames;
    }

    /**
     * Get 字段名 
     * @return FieldName 字段名
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set 字段名
     * @param FieldName 字段名
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    /**
     * Get 数据库类型 
     * @return DbType 数据库类型
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set 数据库类型
     * @param DbType 数据库类型
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
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
     * Get 位置信息 
     * @return Location 位置信息
     */
    public Location getLocation() {
        return this.Location;
    }

    /**
     * Set 位置信息
     * @param Location 位置信息
     */
    public void setLocation(Location Location) {
        this.Location = Location;
    }

    /**
     * Get 字段信息（包含敏感信息） 
     * @return FieldDetails 字段信息（包含敏感信息）
     */
    public TableField [] getFieldDetails() {
        return this.FieldDetails;
    }

    /**
     * Set 字段信息（包含敏感信息）
     * @param FieldDetails 字段信息（包含敏感信息）
     */
    public void setFieldDetails(TableField [] FieldDetails) {
        this.FieldDetails = FieldDetails;
    }

    /**
     * Get 资产所属账号app id 
     * @return AppId 资产所属账号app id
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 资产所属账号app id
     * @param AppId 资产所属账号app id
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 账号昵称 
     * @return NickName 账号昵称
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 账号昵称
     * @param NickName 账号昵称
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get 资产所属账号uin 
     * @return Uin 资产所属账号uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 资产所属账号uin
     * @param Uin 资产所属账号uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    public AuditLogInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditLogInfo(AuditLogInfo source) {
        if (source.AiScore != null) {
            this.AiScore = new Float(source.AiScore);
        }
        if (source.AppUser != null) {
            this.AppUser = new String(source.AppUser);
        }
        if (source.BackPacket != null) {
            this.BackPacket = new String(source.BackPacket);
        }
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
        if (source.ClientMac != null) {
            this.ClientMac = new String(source.ClientMac);
        }
        if (source.ClientName != null) {
            this.ClientName = new String(source.ClientName);
        }
        if (source.ClientUser != null) {
            this.ClientUser = new String(source.ClientUser);
        }
        if (source.ClientPort != null) {
            this.ClientPort = new Long(source.ClientPort);
        }
        if (source.DangerLevel != null) {
            this.DangerLevel = new Long(source.DangerLevel);
        }
        if (source.DbIp != null) {
            this.DbIp = new String(source.DbIp);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.DbPort != null) {
            this.DbPort = new Long(source.DbPort);
        }
        if (source.DbUser != null) {
            this.DbUser = new String(source.DbUser);
        }
        if (source.EffectRow != null) {
            this.EffectRow = new Long(source.EffectRow);
        }
        if (source.ExecTime != null) {
            this.ExecTime = new Long(source.ExecTime);
        }
        if (source.HitRule != null) {
            this.HitRule = new String(source.HitRule);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new Long(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.OpSql != null) {
            this.OpSql = new String(source.OpSql);
        }
        if (source.OpTime != null) {
            this.OpTime = new Long(source.OpTime);
        }
        if (source.RetMsg != null) {
            this.RetMsg = new String(source.RetMsg);
        }
        if (source.RetNo != null) {
            this.RetNo = new Long(source.RetNo);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SqlType != null) {
            this.SqlType = new String(source.SqlType);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.HitRules != null) {
            this.HitRules = new HitRules[source.HitRules.length];
            for (int i = 0; i < source.HitRules.length; i++) {
                this.HitRules[i] = new HitRules(source.HitRules[i]);
            }
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.ReqId != null) {
            this.ReqId = new String(source.ReqId);
        }
        if (source.SqlMainType != null) {
            this.SqlMainType = new String(source.SqlMainType);
        }
        if (source.TableNames != null) {
            this.TableNames = new String[source.TableNames.length];
            for (int i = 0; i < source.TableNames.length; i++) {
                this.TableNames[i] = new String(source.TableNames[i]);
            }
        }
        if (source.FieldNames != null) {
            this.FieldNames = new String[source.FieldNames.length];
            for (int i = 0; i < source.FieldNames.length; i++) {
                this.FieldNames[i] = new String(source.FieldNames[i]);
            }
        }
        if (source.FieldName != null) {
            this.FieldName = new String(source.FieldName);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.ClientDriverName != null) {
            this.ClientDriverName = new String(source.ClientDriverName);
        }
        if (source.Location != null) {
            this.Location = new Location(source.Location);
        }
        if (source.FieldDetails != null) {
            this.FieldDetails = new TableField[source.FieldDetails.length];
            for (int i = 0; i < source.FieldDetails.length; i++) {
                this.FieldDetails[i] = new TableField(source.FieldDetails[i]);
            }
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AiScore", this.AiScore);
        this.setParamSimple(map, prefix + "AppUser", this.AppUser);
        this.setParamSimple(map, prefix + "BackPacket", this.BackPacket);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "ClientMac", this.ClientMac);
        this.setParamSimple(map, prefix + "ClientName", this.ClientName);
        this.setParamSimple(map, prefix + "ClientUser", this.ClientUser);
        this.setParamSimple(map, prefix + "ClientPort", this.ClientPort);
        this.setParamSimple(map, prefix + "DangerLevel", this.DangerLevel);
        this.setParamSimple(map, prefix + "DbIp", this.DbIp);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "DbPort", this.DbPort);
        this.setParamSimple(map, prefix + "DbUser", this.DbUser);
        this.setParamSimple(map, prefix + "EffectRow", this.EffectRow);
        this.setParamSimple(map, prefix + "ExecTime", this.ExecTime);
        this.setParamSimple(map, prefix + "HitRule", this.HitRule);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "OpSql", this.OpSql);
        this.setParamSimple(map, prefix + "OpTime", this.OpTime);
        this.setParamSimple(map, prefix + "RetMsg", this.RetMsg);
        this.setParamSimple(map, prefix + "RetNo", this.RetNo);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SqlType", this.SqlType);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamArrayObj(map, prefix + "HitRules.", this.HitRules);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "ReqId", this.ReqId);
        this.setParamSimple(map, prefix + "SqlMainType", this.SqlMainType);
        this.setParamArraySimple(map, prefix + "TableNames.", this.TableNames);
        this.setParamArraySimple(map, prefix + "FieldNames.", this.FieldNames);
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "ClientDriverName", this.ClientDriverName);
        this.setParamObj(map, prefix + "Location.", this.Location);
        this.setParamArrayObj(map, prefix + "FieldDetails.", this.FieldDetails);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Uin", this.Uin);

    }
}

