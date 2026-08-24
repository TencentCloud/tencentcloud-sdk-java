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

public class DspmAuditSessionInfo extends AbstractModel {

    /**
    * <p>审计日志数</p>
    */
    @SerializedName("SqlCount")
    @Expose
    private Long SqlCount;

    /**
    * <p>登出时间</p>
    */
    @SerializedName("LogoutTime")
    @Expose
    private Long LogoutTime;

    /**
    * <p>客户端 IP</p>
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * <p>客户端端口</p>
    */
    @SerializedName("ClientPort")
    @Expose
    private Long ClientPort;

    /**
    * <p>数据库 IP</p>
    */
    @SerializedName("DbIp")
    @Expose
    private String DbIp;

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
    * <p>数据库用户</p>
    */
    @SerializedName("DbUser")
    @Expose
    private String DbUser;

    /**
    * <p>审计单元 ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private Long InstanceId;

    /**
    * <p>操作时间(时间)</p>
    */
    @SerializedName("OpTime")
    @Expose
    private Long OpTime;

    /**
    * <p>返回码</p>
    */
    @SerializedName("RetNo")
    @Expose
    private Long RetNo;

    /**
    * <p>会话Id</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>登录时间</p>
    */
    @SerializedName("LoginTime")
    @Expose
    private Long LoginTime;

    /**
    * <p>数据资产名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>数据资产名称</p>
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * <p>流量来源</p>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * <p>流量来源英文</p>
    */
    @SerializedName("SourceTypeEn")
    @Expose
    private String SourceTypeEn;

    /**
    * <p>资产所属账号app id</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>流量来源</p>
    */
    @SerializedName("SourceTypeEnDisplayName")
    @Expose
    private String SourceTypeEnDisplayName;

    /**
    * <p>昵称</p>
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * <p>用户ID</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>数据库类型</p><p>枚举值：</p><ul><li>MongoDB： mongodb</li></ul>
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * <p>资产类型</p><p>枚举值：</p><ul><li>cdb： mysql</li><li>mongodb： mongodb</li></ul>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
     * Get <p>审计日志数</p> 
     * @return SqlCount <p>审计日志数</p>
     */
    public Long getSqlCount() {
        return this.SqlCount;
    }

    /**
     * Set <p>审计日志数</p>
     * @param SqlCount <p>审计日志数</p>
     */
    public void setSqlCount(Long SqlCount) {
        this.SqlCount = SqlCount;
    }

    /**
     * Get <p>登出时间</p> 
     * @return LogoutTime <p>登出时间</p>
     */
    public Long getLogoutTime() {
        return this.LogoutTime;
    }

    /**
     * Set <p>登出时间</p>
     * @param LogoutTime <p>登出时间</p>
     */
    public void setLogoutTime(Long LogoutTime) {
        this.LogoutTime = LogoutTime;
    }

    /**
     * Get <p>客户端 IP</p> 
     * @return ClientIp <p>客户端 IP</p>
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set <p>客户端 IP</p>
     * @param ClientIp <p>客户端 IP</p>
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
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
     * Get <p>数据库用户</p> 
     * @return DbUser <p>数据库用户</p>
     */
    public String getDbUser() {
        return this.DbUser;
    }

    /**
     * Set <p>数据库用户</p>
     * @param DbUser <p>数据库用户</p>
     */
    public void setDbUser(String DbUser) {
        this.DbUser = DbUser;
    }

    /**
     * Get <p>审计单元 ID</p> 
     * @return InstanceId <p>审计单元 ID</p>
     */
    public Long getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>审计单元 ID</p>
     * @param InstanceId <p>审计单元 ID</p>
     */
    public void setInstanceId(Long InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>操作时间(时间)</p> 
     * @return OpTime <p>操作时间(时间)</p>
     */
    public Long getOpTime() {
        return this.OpTime;
    }

    /**
     * Set <p>操作时间(时间)</p>
     * @param OpTime <p>操作时间(时间)</p>
     */
    public void setOpTime(Long OpTime) {
        this.OpTime = OpTime;
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
     * Get <p>会话Id</p> 
     * @return SessionId <p>会话Id</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>会话Id</p>
     * @param SessionId <p>会话Id</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>登录时间</p> 
     * @return LoginTime <p>登录时间</p>
     */
    public Long getLoginTime() {
        return this.LoginTime;
    }

    /**
     * Set <p>登录时间</p>
     * @param LoginTime <p>登录时间</p>
     */
    public void setLoginTime(Long LoginTime) {
        this.LoginTime = LoginTime;
    }

    /**
     * Get <p>数据资产名称</p> 
     * @return InstanceName <p>数据资产名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>数据资产名称</p>
     * @param InstanceName <p>数据资产名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>数据资产名称</p> 
     * @return AssetName <p>数据资产名称</p>
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set <p>数据资产名称</p>
     * @param AssetName <p>数据资产名称</p>
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get <p>流量来源</p> 
     * @return SourceType <p>流量来源</p>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>流量来源</p>
     * @param SourceType <p>流量来源</p>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>流量来源英文</p> 
     * @return SourceTypeEn <p>流量来源英文</p>
     */
    public String getSourceTypeEn() {
        return this.SourceTypeEn;
    }

    /**
     * Set <p>流量来源英文</p>
     * @param SourceTypeEn <p>流量来源英文</p>
     */
    public void setSourceTypeEn(String SourceTypeEn) {
        this.SourceTypeEn = SourceTypeEn;
    }

    /**
     * Get <p>资产所属账号app id</p> 
     * @return AppId <p>资产所属账号app id</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>资产所属账号app id</p>
     * @param AppId <p>资产所属账号app id</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>流量来源</p> 
     * @return SourceTypeEnDisplayName <p>流量来源</p>
     */
    public String getSourceTypeEnDisplayName() {
        return this.SourceTypeEnDisplayName;
    }

    /**
     * Set <p>流量来源</p>
     * @param SourceTypeEnDisplayName <p>流量来源</p>
     */
    public void setSourceTypeEnDisplayName(String SourceTypeEnDisplayName) {
        this.SourceTypeEnDisplayName = SourceTypeEnDisplayName;
    }

    /**
     * Get <p>昵称</p> 
     * @return NickName <p>昵称</p>
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set <p>昵称</p>
     * @param NickName <p>昵称</p>
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get <p>用户ID</p> 
     * @return Uin <p>用户ID</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>用户ID</p>
     * @param Uin <p>用户ID</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>数据库类型</p><p>枚举值：</p><ul><li>MongoDB： mongodb</li></ul> 
     * @return DbType <p>数据库类型</p><p>枚举值：</p><ul><li>MongoDB： mongodb</li></ul>
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set <p>数据库类型</p><p>枚举值：</p><ul><li>MongoDB： mongodb</li></ul>
     * @param DbType <p>数据库类型</p><p>枚举值：</p><ul><li>MongoDB： mongodb</li></ul>
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get <p>资产类型</p><p>枚举值：</p><ul><li>cdb： mysql</li><li>mongodb： mongodb</li></ul> 
     * @return AssetType <p>资产类型</p><p>枚举值：</p><ul><li>cdb： mysql</li><li>mongodb： mongodb</li></ul>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>资产类型</p><p>枚举值：</p><ul><li>cdb： mysql</li><li>mongodb： mongodb</li></ul>
     * @param AssetType <p>资产类型</p><p>枚举值：</p><ul><li>cdb： mysql</li><li>mongodb： mongodb</li></ul>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    public DspmAuditSessionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmAuditSessionInfo(DspmAuditSessionInfo source) {
        if (source.SqlCount != null) {
            this.SqlCount = new Long(source.SqlCount);
        }
        if (source.LogoutTime != null) {
            this.LogoutTime = new Long(source.LogoutTime);
        }
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
        if (source.ClientPort != null) {
            this.ClientPort = new Long(source.ClientPort);
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
        if (source.InstanceId != null) {
            this.InstanceId = new Long(source.InstanceId);
        }
        if (source.OpTime != null) {
            this.OpTime = new Long(source.OpTime);
        }
        if (source.RetNo != null) {
            this.RetNo = new Long(source.RetNo);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.LoginTime != null) {
            this.LoginTime = new Long(source.LoginTime);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.SourceTypeEn != null) {
            this.SourceTypeEn = new String(source.SourceTypeEn);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.SourceTypeEnDisplayName != null) {
            this.SourceTypeEnDisplayName = new String(source.SourceTypeEnDisplayName);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SqlCount", this.SqlCount);
        this.setParamSimple(map, prefix + "LogoutTime", this.LogoutTime);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "ClientPort", this.ClientPort);
        this.setParamSimple(map, prefix + "DbIp", this.DbIp);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "DbPort", this.DbPort);
        this.setParamSimple(map, prefix + "DbUser", this.DbUser);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "OpTime", this.OpTime);
        this.setParamSimple(map, prefix + "RetNo", this.RetNo);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "LoginTime", this.LoginTime);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SourceTypeEn", this.SourceTypeEn);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "SourceTypeEnDisplayName", this.SourceTypeEnDisplayName);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);

    }
}

