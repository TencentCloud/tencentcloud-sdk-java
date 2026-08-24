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

public class DescribeDspmSessionListRequest extends AbstractModel {

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>限制数目</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>登陆状态(0 全部 1 成功 2 失败)</p>
    */
    @SerializedName("LoginType")
    @Expose
    private Long LoginType;

    /**
    * <p>数据库端口</p>
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * <p>数据库名称</p>
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
    * <p>用户名</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>流量来源  取值 Agent/Proxy/空；传Agent会返回Agent的日志，传Proxy会返回Proxy日志，两者都传或不传则返回所有</p>
    */
    @SerializedName("SourceTypes")
    @Expose
    private String [] SourceTypes;

    /**
    * <p>[&quot;MySQL&quot;]</p>
    */
    @SerializedName("DbTypes")
    @Expose
    private String [] DbTypes;

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
     * Get <p>限制数目</p> 
     * @return Limit <p>限制数目</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>限制数目</p>
     * @param Limit <p>限制数目</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量</p> 
     * @return Offset <p>偏移量</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量</p>
     * @param Offset <p>偏移量</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>登陆状态(0 全部 1 成功 2 失败)</p> 
     * @return LoginType <p>登陆状态(0 全部 1 成功 2 失败)</p>
     */
    public Long getLoginType() {
        return this.LoginType;
    }

    /**
     * Set <p>登陆状态(0 全部 1 成功 2 失败)</p>
     * @param LoginType <p>登陆状态(0 全部 1 成功 2 失败)</p>
     */
    public void setLoginType(Long LoginType) {
        this.LoginType = LoginType;
    }

    /**
     * Get <p>数据库端口</p> 
     * @return DbName <p>数据库端口</p>
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set <p>数据库端口</p>
     * @param DbName <p>数据库端口</p>
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get <p>数据库名称</p> 
     * @return DbPort <p>数据库名称</p>
     */
    public Long getDbPort() {
        return this.DbPort;
    }

    /**
     * Set <p>数据库名称</p>
     * @param DbPort <p>数据库名称</p>
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
     * Get <p>流量来源  取值 Agent/Proxy/空；传Agent会返回Agent的日志，传Proxy会返回Proxy日志，两者都传或不传则返回所有</p> 
     * @return SourceTypes <p>流量来源  取值 Agent/Proxy/空；传Agent会返回Agent的日志，传Proxy会返回Proxy日志，两者都传或不传则返回所有</p>
     */
    public String [] getSourceTypes() {
        return this.SourceTypes;
    }

    /**
     * Set <p>流量来源  取值 Agent/Proxy/空；传Agent会返回Agent的日志，传Proxy会返回Proxy日志，两者都传或不传则返回所有</p>
     * @param SourceTypes <p>流量来源  取值 Agent/Proxy/空；传Agent会返回Agent的日志，传Proxy会返回Proxy日志，两者都传或不传则返回所有</p>
     */
    public void setSourceTypes(String [] SourceTypes) {
        this.SourceTypes = SourceTypes;
    }

    /**
     * Get <p>[&quot;MySQL&quot;]</p> 
     * @return DbTypes <p>[&quot;MySQL&quot;]</p>
     */
    public String [] getDbTypes() {
        return this.DbTypes;
    }

    /**
     * Set <p>[&quot;MySQL&quot;]</p>
     * @param DbTypes <p>[&quot;MySQL&quot;]</p>
     */
    public void setDbTypes(String [] DbTypes) {
        this.DbTypes = DbTypes;
    }

    public DescribeDspmSessionListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDspmSessionListRequest(DescribeDspmSessionListRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.LoginType != null) {
            this.LoginType = new Long(source.LoginType);
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
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.SourceTypes != null) {
            this.SourceTypes = new String[source.SourceTypes.length];
            for (int i = 0; i < source.SourceTypes.length; i++) {
                this.SourceTypes[i] = new String(source.SourceTypes[i]);
            }
        }
        if (source.DbTypes != null) {
            this.DbTypes = new String[source.DbTypes.length];
            for (int i = 0; i < source.DbTypes.length; i++) {
                this.DbTypes[i] = new String(source.DbTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "LoginType", this.LoginType);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "DbPort", this.DbPort);
        this.setParamSimple(map, prefix + "DbIp", this.DbIp);
        this.setParamSimple(map, prefix + "AssetsId", this.AssetsId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "ClientSideIp", this.ClientSideIp);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamArraySimple(map, prefix + "SourceTypes.", this.SourceTypes);
        this.setParamArraySimple(map, prefix + "DbTypes.", this.DbTypes);

    }
}

