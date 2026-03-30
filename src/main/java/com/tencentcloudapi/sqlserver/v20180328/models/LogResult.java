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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogResult extends AbstractModel {

    /**
    * 时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 错误类别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 客户端应用程序名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientAppName")
    @Expose
    private String ClientAppName;

    /**
    * 客户端主机名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientHostName")
    @Expose
    private String ClientHostName;

    /**
    * CPU 时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuTime")
    @Expose
    private Long CpuTime;

    /**
    * 数据库 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseId")
    @Expose
    private Long DatabaseId;

    /**
    * 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 执行时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 错误编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorNumber")
    @Expose
    private Long ErrorNumber;

    /**
    * 是否被拦截
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsIntercepted")
    @Expose
    private String IsIntercepted;

    /**
    * 最后行计数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastRowCount")
    @Expose
    private Long LastRowCount;

    /**
    * 逻辑读取
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogicalReads")
    @Expose
    private Long LogicalReads;

    /**
    * 消息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 对象 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectId")
    @Expose
    private Long ObjectId;

    /**
    * 对象名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectName")
    @Expose
    private String ObjectName;

    /**
    * 对象类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectType")
    @Expose
    private String ObjectType;

    /**
    * 输出参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputParameters")
    @Expose
    private String OutputParameters;

    /**
    * 参数化计划句柄
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParameterizedPlanHandle")
    @Expose
    private String ParameterizedPlanHandle;

    /**
    * 物理读取
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhysicalReads")
    @Expose
    private Long PhysicalReads;

    /**
    * 结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 行计数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RowCount")
    @Expose
    private Long RowCount;

    /**
    * 服务器主体名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServerPrincipalName")
    @Expose
    private String ServerPrincipalName;

    /**
    * 会话服务器主体名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionServerPrincipalName")
    @Expose
    private String SessionServerPrincipalName;

    /**
    * 严重性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Severity")
    @Expose
    private Long Severity;

    /**
    * 源数据库 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceDatabaseId")
    @Expose
    private Long SourceDatabaseId;

    /**
    * SQL 文本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlText")
    @Expose
    private String SqlText;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 语句
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Statement")
    @Expose
    private String Statement;

    /**
    * 系统线程 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SystemThreadId")
    @Expose
    private Long SystemThreadId;

    /**
    * 事务 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransactionId")
    @Expose
    private Long TransactionId;

    /**
    * 用户定义
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserDefined")
    @Expose
    private String UserDefined;

    /**
    * 用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 写入
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Writes")
    @Expose
    private Long Writes;

    /**
    * 目标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Destination")
    @Expose
    private String Destination;

    /**
     * Get 时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timestamp 时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timestamp 时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 错误类别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Category 错误类别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 错误类别
注意：此字段可能返回 null，表示取不到有效值。
     * @param Category 错误类别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 客户端应用程序名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientAppName 客户端应用程序名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClientAppName() {
        return this.ClientAppName;
    }

    /**
     * Set 客户端应用程序名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientAppName 客户端应用程序名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientAppName(String ClientAppName) {
        this.ClientAppName = ClientAppName;
    }

    /**
     * Get 客户端主机名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientHostName 客户端主机名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClientHostName() {
        return this.ClientHostName;
    }

    /**
     * Set 客户端主机名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientHostName 客户端主机名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientHostName(String ClientHostName) {
        this.ClientHostName = ClientHostName;
    }

    /**
     * Get CPU 时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuTime CPU 时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCpuTime() {
        return this.CpuTime;
    }

    /**
     * Set CPU 时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuTime CPU 时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuTime(Long CpuTime) {
        this.CpuTime = CpuTime;
    }

    /**
     * Get 数据库 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseId 数据库 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDatabaseId() {
        return this.DatabaseId;
    }

    /**
     * Set 数据库 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseId 数据库 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseId(Long DatabaseId) {
        this.DatabaseId = DatabaseId;
    }

    /**
     * Get 数据库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseName 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseName 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 执行时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 执行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 错误编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorNumber 错误编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getErrorNumber() {
        return this.ErrorNumber;
    }

    /**
     * Set 错误编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorNumber 错误编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorNumber(Long ErrorNumber) {
        this.ErrorNumber = ErrorNumber;
    }

    /**
     * Get 是否被拦截
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsIntercepted 是否被拦截
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsIntercepted() {
        return this.IsIntercepted;
    }

    /**
     * Set 是否被拦截
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsIntercepted 是否被拦截
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsIntercepted(String IsIntercepted) {
        this.IsIntercepted = IsIntercepted;
    }

    /**
     * Get 最后行计数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastRowCount 最后行计数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastRowCount() {
        return this.LastRowCount;
    }

    /**
     * Set 最后行计数
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastRowCount 最后行计数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastRowCount(Long LastRowCount) {
        this.LastRowCount = LastRowCount;
    }

    /**
     * Get 逻辑读取
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogicalReads 逻辑读取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLogicalReads() {
        return this.LogicalReads;
    }

    /**
     * Set 逻辑读取
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogicalReads 逻辑读取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogicalReads(Long LogicalReads) {
        this.LogicalReads = LogicalReads;
    }

    /**
     * Get 消息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 消息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 消息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 消息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 对象 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectId 对象 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getObjectId() {
        return this.ObjectId;
    }

    /**
     * Set 对象 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectId 对象 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectId(Long ObjectId) {
        this.ObjectId = ObjectId;
    }

    /**
     * Get 对象名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectName 对象名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getObjectName() {
        return this.ObjectName;
    }

    /**
     * Set 对象名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectName 对象名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectName(String ObjectName) {
        this.ObjectName = ObjectName;
    }

    /**
     * Get 对象类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectType 对象类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getObjectType() {
        return this.ObjectType;
    }

    /**
     * Set 对象类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectType 对象类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectType(String ObjectType) {
        this.ObjectType = ObjectType;
    }

    /**
     * Get 输出参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputParameters 输出参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutputParameters() {
        return this.OutputParameters;
    }

    /**
     * Set 输出参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputParameters 输出参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputParameters(String OutputParameters) {
        this.OutputParameters = OutputParameters;
    }

    /**
     * Get 参数化计划句柄
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParameterizedPlanHandle 参数化计划句柄
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParameterizedPlanHandle() {
        return this.ParameterizedPlanHandle;
    }

    /**
     * Set 参数化计划句柄
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParameterizedPlanHandle 参数化计划句柄
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParameterizedPlanHandle(String ParameterizedPlanHandle) {
        this.ParameterizedPlanHandle = ParameterizedPlanHandle;
    }

    /**
     * Get 物理读取
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhysicalReads 物理读取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPhysicalReads() {
        return this.PhysicalReads;
    }

    /**
     * Set 物理读取
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhysicalReads 物理读取
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhysicalReads(Long PhysicalReads) {
        this.PhysicalReads = PhysicalReads;
    }

    /**
     * Get 结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Result 结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param Result 结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 行计数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RowCount 行计数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRowCount() {
        return this.RowCount;
    }

    /**
     * Set 行计数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RowCount 行计数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRowCount(Long RowCount) {
        this.RowCount = RowCount;
    }

    /**
     * Get 服务器主体名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServerPrincipalName 服务器主体名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServerPrincipalName() {
        return this.ServerPrincipalName;
    }

    /**
     * Set 服务器主体名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServerPrincipalName 服务器主体名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServerPrincipalName(String ServerPrincipalName) {
        this.ServerPrincipalName = ServerPrincipalName;
    }

    /**
     * Get 会话服务器主体名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionServerPrincipalName 会话服务器主体名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionServerPrincipalName() {
        return this.SessionServerPrincipalName;
    }

    /**
     * Set 会话服务器主体名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionServerPrincipalName 会话服务器主体名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionServerPrincipalName(String SessionServerPrincipalName) {
        this.SessionServerPrincipalName = SessionServerPrincipalName;
    }

    /**
     * Get 严重性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Severity 严重性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSeverity() {
        return this.Severity;
    }

    /**
     * Set 严重性
注意：此字段可能返回 null，表示取不到有效值。
     * @param Severity 严重性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeverity(Long Severity) {
        this.Severity = Severity;
    }

    /**
     * Get 源数据库 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceDatabaseId 源数据库 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSourceDatabaseId() {
        return this.SourceDatabaseId;
    }

    /**
     * Set 源数据库 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceDatabaseId 源数据库 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceDatabaseId(Long SourceDatabaseId) {
        this.SourceDatabaseId = SourceDatabaseId;
    }

    /**
     * Get SQL 文本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlText SQL 文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSqlText() {
        return this.SqlText;
    }

    /**
     * Set SQL 文本
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlText SQL 文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlText(String SqlText) {
        this.SqlText = SqlText;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param State 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 语句
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Statement 语句
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatement() {
        return this.Statement;
    }

    /**
     * Set 语句
注意：此字段可能返回 null，表示取不到有效值。
     * @param Statement 语句
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatement(String Statement) {
        this.Statement = Statement;
    }

    /**
     * Get 系统线程 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SystemThreadId 系统线程 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSystemThreadId() {
        return this.SystemThreadId;
    }

    /**
     * Set 系统线程 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SystemThreadId 系统线程 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSystemThreadId(Long SystemThreadId) {
        this.SystemThreadId = SystemThreadId;
    }

    /**
     * Get 事务 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransactionId 事务 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTransactionId() {
        return this.TransactionId;
    }

    /**
     * Set 事务 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransactionId 事务 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransactionId(Long TransactionId) {
        this.TransactionId = TransactionId;
    }

    /**
     * Get 用户定义
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserDefined 用户定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserDefined() {
        return this.UserDefined;
    }

    /**
     * Set 用户定义
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserDefined 用户定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserDefined(String UserDefined) {
        this.UserDefined = UserDefined;
    }

    /**
     * Get 用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 写入
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Writes 写入
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWrites() {
        return this.Writes;
    }

    /**
     * Set 写入
注意：此字段可能返回 null，表示取不到有效值。
     * @param Writes 写入
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWrites(Long Writes) {
        this.Writes = Writes;
    }

    /**
     * Get 目标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Destination 目标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDestination() {
        return this.Destination;
    }

    /**
     * Set 目标
注意：此字段可能返回 null，表示取不到有效值。
     * @param Destination 目标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    public LogResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogResult(LogResult source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.ClientAppName != null) {
            this.ClientAppName = new String(source.ClientAppName);
        }
        if (source.ClientHostName != null) {
            this.ClientHostName = new String(source.ClientHostName);
        }
        if (source.CpuTime != null) {
            this.CpuTime = new Long(source.CpuTime);
        }
        if (source.DatabaseId != null) {
            this.DatabaseId = new Long(source.DatabaseId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.ErrorNumber != null) {
            this.ErrorNumber = new Long(source.ErrorNumber);
        }
        if (source.IsIntercepted != null) {
            this.IsIntercepted = new String(source.IsIntercepted);
        }
        if (source.LastRowCount != null) {
            this.LastRowCount = new Long(source.LastRowCount);
        }
        if (source.LogicalReads != null) {
            this.LogicalReads = new Long(source.LogicalReads);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.ObjectId != null) {
            this.ObjectId = new Long(source.ObjectId);
        }
        if (source.ObjectName != null) {
            this.ObjectName = new String(source.ObjectName);
        }
        if (source.ObjectType != null) {
            this.ObjectType = new String(source.ObjectType);
        }
        if (source.OutputParameters != null) {
            this.OutputParameters = new String(source.OutputParameters);
        }
        if (source.ParameterizedPlanHandle != null) {
            this.ParameterizedPlanHandle = new String(source.ParameterizedPlanHandle);
        }
        if (source.PhysicalReads != null) {
            this.PhysicalReads = new Long(source.PhysicalReads);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.RowCount != null) {
            this.RowCount = new Long(source.RowCount);
        }
        if (source.ServerPrincipalName != null) {
            this.ServerPrincipalName = new String(source.ServerPrincipalName);
        }
        if (source.SessionServerPrincipalName != null) {
            this.SessionServerPrincipalName = new String(source.SessionServerPrincipalName);
        }
        if (source.Severity != null) {
            this.Severity = new Long(source.Severity);
        }
        if (source.SourceDatabaseId != null) {
            this.SourceDatabaseId = new Long(source.SourceDatabaseId);
        }
        if (source.SqlText != null) {
            this.SqlText = new String(source.SqlText);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.Statement != null) {
            this.Statement = new String(source.Statement);
        }
        if (source.SystemThreadId != null) {
            this.SystemThreadId = new Long(source.SystemThreadId);
        }
        if (source.TransactionId != null) {
            this.TransactionId = new Long(source.TransactionId);
        }
        if (source.UserDefined != null) {
            this.UserDefined = new String(source.UserDefined);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Writes != null) {
            this.Writes = new Long(source.Writes);
        }
        if (source.Destination != null) {
            this.Destination = new String(source.Destination);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "ClientAppName", this.ClientAppName);
        this.setParamSimple(map, prefix + "ClientHostName", this.ClientHostName);
        this.setParamSimple(map, prefix + "CpuTime", this.CpuTime);
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "ErrorNumber", this.ErrorNumber);
        this.setParamSimple(map, prefix + "IsIntercepted", this.IsIntercepted);
        this.setParamSimple(map, prefix + "LastRowCount", this.LastRowCount);
        this.setParamSimple(map, prefix + "LogicalReads", this.LogicalReads);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "ObjectId", this.ObjectId);
        this.setParamSimple(map, prefix + "ObjectName", this.ObjectName);
        this.setParamSimple(map, prefix + "ObjectType", this.ObjectType);
        this.setParamSimple(map, prefix + "OutputParameters", this.OutputParameters);
        this.setParamSimple(map, prefix + "ParameterizedPlanHandle", this.ParameterizedPlanHandle);
        this.setParamSimple(map, prefix + "PhysicalReads", this.PhysicalReads);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "RowCount", this.RowCount);
        this.setParamSimple(map, prefix + "ServerPrincipalName", this.ServerPrincipalName);
        this.setParamSimple(map, prefix + "SessionServerPrincipalName", this.SessionServerPrincipalName);
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamSimple(map, prefix + "SourceDatabaseId", this.SourceDatabaseId);
        this.setParamSimple(map, prefix + "SqlText", this.SqlText);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Statement", this.Statement);
        this.setParamSimple(map, prefix + "SystemThreadId", this.SystemThreadId);
        this.setParamSimple(map, prefix + "TransactionId", this.TransactionId);
        this.setParamSimple(map, prefix + "UserDefined", this.UserDefined);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Writes", this.Writes);
        this.setParamSimple(map, prefix + "Destination", this.Destination);

    }
}

