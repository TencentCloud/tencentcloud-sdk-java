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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KyuubiQueryInfo extends AbstractModel {

    /**
    * 提交IP
    */
    @SerializedName("ClientIP")
    @Expose
    private String ClientIP;

    /**
    * 执行时长
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Engine Id
    */
    @SerializedName("EngineID")
    @Expose
    private String EngineID;

    /**
    * 计算引擎
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Session Id
    */
    @SerializedName("SessionID")
    @Expose
    private String SessionID;

    /**
    * 开始时间
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * 执行状态
    */
    @SerializedName("ExecutionState")
    @Expose
    private String ExecutionState;

    /**
    * 执行语句
    */
    @SerializedName("ExecutionStatement")
    @Expose
    private String ExecutionStatement;

    /**
    * Statement Id
    */
    @SerializedName("StatementID")
    @Expose
    private String StatementID;

    /**
    * 提交用户
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
     * Get 提交IP 
     * @return ClientIP 提交IP
     */
    public String getClientIP() {
        return this.ClientIP;
    }

    /**
     * Set 提交IP
     * @param ClientIP 提交IP
     */
    public void setClientIP(String ClientIP) {
        this.ClientIP = ClientIP;
    }

    /**
     * Get 执行时长 
     * @return Duration 执行时长
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 执行时长
     * @param Duration 执行时长
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
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
     * Get Engine Id 
     * @return EngineID Engine Id
     */
    public String getEngineID() {
        return this.EngineID;
    }

    /**
     * Set Engine Id
     * @param EngineID Engine Id
     */
    public void setEngineID(String EngineID) {
        this.EngineID = EngineID;
    }

    /**
     * Get 计算引擎 
     * @return EngineType 计算引擎
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set 计算引擎
     * @param EngineType 计算引擎
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get ID 
     * @return Id ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set ID
     * @param Id ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Session Id 
     * @return SessionID Session Id
     */
    public String getSessionID() {
        return this.SessionID;
    }

    /**
     * Set Session Id
     * @param SessionID Session Id
     */
    public void setSessionID(String SessionID) {
        this.SessionID = SessionID;
    }

    /**
     * Get 开始时间 
     * @return BeginTime 开始时间
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 开始时间
     * @param BeginTime 开始时间
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 执行状态 
     * @return ExecutionState 执行状态
     */
    public String getExecutionState() {
        return this.ExecutionState;
    }

    /**
     * Set 执行状态
     * @param ExecutionState 执行状态
     */
    public void setExecutionState(String ExecutionState) {
        this.ExecutionState = ExecutionState;
    }

    /**
     * Get 执行语句 
     * @return ExecutionStatement 执行语句
     */
    public String getExecutionStatement() {
        return this.ExecutionStatement;
    }

    /**
     * Set 执行语句
     * @param ExecutionStatement 执行语句
     */
    public void setExecutionStatement(String ExecutionStatement) {
        this.ExecutionStatement = ExecutionStatement;
    }

    /**
     * Get Statement Id 
     * @return StatementID Statement Id
     */
    public String getStatementID() {
        return this.StatementID;
    }

    /**
     * Set Statement Id
     * @param StatementID Statement Id
     */
    public void setStatementID(String StatementID) {
        this.StatementID = StatementID;
    }

    /**
     * Get 提交用户 
     * @return User 提交用户
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 提交用户
     * @param User 提交用户
     */
    public void setUser(String User) {
        this.User = User;
    }

    public KyuubiQueryInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KyuubiQueryInfo(KyuubiQueryInfo source) {
        if (source.ClientIP != null) {
            this.ClientIP = new String(source.ClientIP);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.EngineID != null) {
            this.EngineID = new String(source.EngineID);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.SessionID != null) {
            this.SessionID = new String(source.SessionID);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
        }
        if (source.ExecutionState != null) {
            this.ExecutionState = new String(source.ExecutionState);
        }
        if (source.ExecutionStatement != null) {
            this.ExecutionStatement = new String(source.ExecutionStatement);
        }
        if (source.StatementID != null) {
            this.StatementID = new String(source.StatementID);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientIP", this.ClientIP);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "EngineID", this.EngineID);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "SessionID", this.SessionID);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "ExecutionState", this.ExecutionState);
        this.setParamSimple(map, prefix + "ExecutionStatement", this.ExecutionStatement);
        this.setParamSimple(map, prefix + "StatementID", this.StatementID);
        this.setParamSimple(map, prefix + "User", this.User);

    }
}

