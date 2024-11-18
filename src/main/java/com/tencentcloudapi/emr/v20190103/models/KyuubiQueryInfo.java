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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KyuubiQueryInfo extends AbstractModel {

    /**
    * 提交IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientIP")
    @Expose
    private String ClientIP;

    /**
    * 执行时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Engine Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineID")
    @Expose
    private String EngineID;

    /**
    * 计算引擎
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Session Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionID")
    @Expose
    private String SessionID;

    /**
    * 开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * 执行状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionState")
    @Expose
    private String ExecutionState;

    /**
    * 执行语句
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionStatement")
    @Expose
    private String ExecutionStatement;

    /**
    * Statement Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatementID")
    @Expose
    private String StatementID;

    /**
    * 提交用户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
     * Get 提交IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientIP 提交IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClientIP() {
        return this.ClientIP;
    }

    /**
     * Set 提交IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientIP 提交IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientIP(String ClientIP) {
        this.ClientIP = ClientIP;
    }

    /**
     * Get 执行时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 执行时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 执行时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 执行时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Engine Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineID Engine Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineID() {
        return this.EngineID;
    }

    /**
     * Set Engine Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineID Engine Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineID(String EngineID) {
        this.EngineID = EngineID;
    }

    /**
     * Get 计算引擎
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineType 计算引擎
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set 计算引擎
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineType 计算引擎
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Session Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionID Session Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionID() {
        return this.SessionID;
    }

    /**
     * Set Session Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionID Session Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionID(String SessionID) {
        this.SessionID = SessionID;
    }

    /**
     * Get 开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BeginTime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param BeginTime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 执行状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionState 执行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionState() {
        return this.ExecutionState;
    }

    /**
     * Set 执行状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionState 执行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionState(String ExecutionState) {
        this.ExecutionState = ExecutionState;
    }

    /**
     * Get 执行语句
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionStatement 执行语句
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionStatement() {
        return this.ExecutionStatement;
    }

    /**
     * Set 执行语句
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionStatement 执行语句
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionStatement(String ExecutionStatement) {
        this.ExecutionStatement = ExecutionStatement;
    }

    /**
     * Get Statement Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatementID Statement Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatementID() {
        return this.StatementID;
    }

    /**
     * Set Statement Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatementID Statement Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatementID(String StatementID) {
        this.StatementID = StatementID;
    }

    /**
     * Get 提交用户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return User 提交用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 提交用户
注意：此字段可能返回 null，表示取不到有效值。
     * @param User 提交用户
注意：此字段可能返回 null，表示取不到有效值。
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

