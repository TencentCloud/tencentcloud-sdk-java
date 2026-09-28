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
    * <p>时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * <p>错误类别</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>客户端应用程序名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientAppName")
    @Expose
    private String ClientAppName;

    /**
    * <p>客户端主机名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientHostName")
    @Expose
    private String ClientHostName;

    /**
    * <p>CPU 时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuTime")
    @Expose
    private Long CpuTime;

    /**
    * <p>数据库 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseId")
    @Expose
    private Long DatabaseId;

    /**
    * <p>数据库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * <p>执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * <p>错误编号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorNumber")
    @Expose
    private Long ErrorNumber;

    /**
    * <p>是否被拦截</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsIntercepted")
    @Expose
    private String IsIntercepted;

    /**
    * <p>最后行计数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastRowCount")
    @Expose
    private Long LastRowCount;

    /**
    * <p>逻辑读取</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogicalReads")
    @Expose
    private Long LogicalReads;

    /**
    * <p>消息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>对象 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectId")
    @Expose
    private Long ObjectId;

    /**
    * <p>对象名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectName")
    @Expose
    private String ObjectName;

    /**
    * <p>对象类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectType")
    @Expose
    private String ObjectType;

    /**
    * <p>输出参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputParameters")
    @Expose
    private String OutputParameters;

    /**
    * <p>参数化计划句柄</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParameterizedPlanHandle")
    @Expose
    private String ParameterizedPlanHandle;

    /**
    * <p>物理读取</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhysicalReads")
    @Expose
    private Long PhysicalReads;

    /**
    * <p>结果</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * <p>行计数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RowCount")
    @Expose
    private Long RowCount;

    /**
    * <p>服务器主体名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServerPrincipalName")
    @Expose
    private String ServerPrincipalName;

    /**
    * <p>会话服务器主体名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionServerPrincipalName")
    @Expose
    private String SessionServerPrincipalName;

    /**
    * <p>严重性</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Severity")
    @Expose
    private Long Severity;

    /**
    * <p>源数据库 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceDatabaseId")
    @Expose
    private Long SourceDatabaseId;

    /**
    * <p>SQL 文本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlText")
    @Expose
    private String SqlText;

    /**
    * <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * <p>语句</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Statement")
    @Expose
    private String Statement;

    /**
    * <p>系统线程 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SystemThreadId")
    @Expose
    private Long SystemThreadId;

    /**
    * <p>事务 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransactionId")
    @Expose
    private Long TransactionId;

    /**
    * <p>用户定义</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserDefined")
    @Expose
    private String UserDefined;

    /**
    * <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>写入</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Writes")
    @Expose
    private Long Writes;

    /**
    * <p>目标</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Destination")
    @Expose
    private String Destination;

    /**
    * <p>事件名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
     * Get <p>时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timestamp <p>时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set <p>时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timestamp <p>时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get <p>错误类别</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Category <p>错误类别</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>错误类别</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Category <p>错误类别</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>客户端应用程序名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientAppName <p>客户端应用程序名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClientAppName() {
        return this.ClientAppName;
    }

    /**
     * Set <p>客户端应用程序名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientAppName <p>客户端应用程序名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientAppName(String ClientAppName) {
        this.ClientAppName = ClientAppName;
    }

    /**
     * Get <p>客户端主机名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientHostName <p>客户端主机名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClientHostName() {
        return this.ClientHostName;
    }

    /**
     * Set <p>客户端主机名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientHostName <p>客户端主机名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientHostName(String ClientHostName) {
        this.ClientHostName = ClientHostName;
    }

    /**
     * Get <p>CPU 时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuTime <p>CPU 时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCpuTime() {
        return this.CpuTime;
    }

    /**
     * Set <p>CPU 时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuTime <p>CPU 时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuTime(Long CpuTime) {
        this.CpuTime = CpuTime;
    }

    /**
     * Get <p>数据库 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseId <p>数据库 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDatabaseId() {
        return this.DatabaseId;
    }

    /**
     * Set <p>数据库 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseId <p>数据库 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseId(Long DatabaseId) {
        this.DatabaseId = DatabaseId;
    }

    /**
     * Get <p>数据库名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseName <p>数据库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set <p>数据库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseName <p>数据库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get <p>执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration <p>执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration <p>执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>错误编号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorNumber <p>错误编号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getErrorNumber() {
        return this.ErrorNumber;
    }

    /**
     * Set <p>错误编号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorNumber <p>错误编号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorNumber(Long ErrorNumber) {
        this.ErrorNumber = ErrorNumber;
    }

    /**
     * Get <p>是否被拦截</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsIntercepted <p>是否被拦截</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsIntercepted() {
        return this.IsIntercepted;
    }

    /**
     * Set <p>是否被拦截</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsIntercepted <p>是否被拦截</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsIntercepted(String IsIntercepted) {
        this.IsIntercepted = IsIntercepted;
    }

    /**
     * Get <p>最后行计数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastRowCount <p>最后行计数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastRowCount() {
        return this.LastRowCount;
    }

    /**
     * Set <p>最后行计数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastRowCount <p>最后行计数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastRowCount(Long LastRowCount) {
        this.LastRowCount = LastRowCount;
    }

    /**
     * Get <p>逻辑读取</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogicalReads <p>逻辑读取</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLogicalReads() {
        return this.LogicalReads;
    }

    /**
     * Set <p>逻辑读取</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogicalReads <p>逻辑读取</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogicalReads(Long LogicalReads) {
        this.LogicalReads = LogicalReads;
    }

    /**
     * Get <p>消息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message <p>消息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>消息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message <p>消息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>对象 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectId <p>对象 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getObjectId() {
        return this.ObjectId;
    }

    /**
     * Set <p>对象 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectId <p>对象 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectId(Long ObjectId) {
        this.ObjectId = ObjectId;
    }

    /**
     * Get <p>对象名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectName <p>对象名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getObjectName() {
        return this.ObjectName;
    }

    /**
     * Set <p>对象名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectName <p>对象名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectName(String ObjectName) {
        this.ObjectName = ObjectName;
    }

    /**
     * Get <p>对象类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectType <p>对象类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getObjectType() {
        return this.ObjectType;
    }

    /**
     * Set <p>对象类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectType <p>对象类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectType(String ObjectType) {
        this.ObjectType = ObjectType;
    }

    /**
     * Get <p>输出参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputParameters <p>输出参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutputParameters() {
        return this.OutputParameters;
    }

    /**
     * Set <p>输出参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputParameters <p>输出参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputParameters(String OutputParameters) {
        this.OutputParameters = OutputParameters;
    }

    /**
     * Get <p>参数化计划句柄</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParameterizedPlanHandle <p>参数化计划句柄</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParameterizedPlanHandle() {
        return this.ParameterizedPlanHandle;
    }

    /**
     * Set <p>参数化计划句柄</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParameterizedPlanHandle <p>参数化计划句柄</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParameterizedPlanHandle(String ParameterizedPlanHandle) {
        this.ParameterizedPlanHandle = ParameterizedPlanHandle;
    }

    /**
     * Get <p>物理读取</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhysicalReads <p>物理读取</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPhysicalReads() {
        return this.PhysicalReads;
    }

    /**
     * Set <p>物理读取</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhysicalReads <p>物理读取</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhysicalReads(Long PhysicalReads) {
        this.PhysicalReads = PhysicalReads;
    }

    /**
     * Get <p>结果</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Result <p>结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set <p>结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Result <p>结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get <p>行计数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RowCount <p>行计数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRowCount() {
        return this.RowCount;
    }

    /**
     * Set <p>行计数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RowCount <p>行计数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRowCount(Long RowCount) {
        this.RowCount = RowCount;
    }

    /**
     * Get <p>服务器主体名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServerPrincipalName <p>服务器主体名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServerPrincipalName() {
        return this.ServerPrincipalName;
    }

    /**
     * Set <p>服务器主体名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServerPrincipalName <p>服务器主体名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServerPrincipalName(String ServerPrincipalName) {
        this.ServerPrincipalName = ServerPrincipalName;
    }

    /**
     * Get <p>会话服务器主体名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionServerPrincipalName <p>会话服务器主体名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionServerPrincipalName() {
        return this.SessionServerPrincipalName;
    }

    /**
     * Set <p>会话服务器主体名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionServerPrincipalName <p>会话服务器主体名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionServerPrincipalName(String SessionServerPrincipalName) {
        this.SessionServerPrincipalName = SessionServerPrincipalName;
    }

    /**
     * Get <p>严重性</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Severity <p>严重性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSeverity() {
        return this.Severity;
    }

    /**
     * Set <p>严重性</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Severity <p>严重性</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeverity(Long Severity) {
        this.Severity = Severity;
    }

    /**
     * Get <p>源数据库 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceDatabaseId <p>源数据库 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSourceDatabaseId() {
        return this.SourceDatabaseId;
    }

    /**
     * Set <p>源数据库 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceDatabaseId <p>源数据库 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceDatabaseId(Long SourceDatabaseId) {
        this.SourceDatabaseId = SourceDatabaseId;
    }

    /**
     * Get <p>SQL 文本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlText <p>SQL 文本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSqlText() {
        return this.SqlText;
    }

    /**
     * Set <p>SQL 文本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlText <p>SQL 文本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlText(String SqlText) {
        this.SqlText = SqlText;
    }

    /**
     * Get <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param State <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get <p>语句</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Statement <p>语句</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatement() {
        return this.Statement;
    }

    /**
     * Set <p>语句</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Statement <p>语句</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatement(String Statement) {
        this.Statement = Statement;
    }

    /**
     * Get <p>系统线程 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SystemThreadId <p>系统线程 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSystemThreadId() {
        return this.SystemThreadId;
    }

    /**
     * Set <p>系统线程 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SystemThreadId <p>系统线程 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSystemThreadId(Long SystemThreadId) {
        this.SystemThreadId = SystemThreadId;
    }

    /**
     * Get <p>事务 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransactionId <p>事务 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTransactionId() {
        return this.TransactionId;
    }

    /**
     * Set <p>事务 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransactionId <p>事务 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransactionId(Long TransactionId) {
        this.TransactionId = TransactionId;
    }

    /**
     * Get <p>用户定义</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserDefined <p>用户定义</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserDefined() {
        return this.UserDefined;
    }

    /**
     * Set <p>用户定义</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserDefined <p>用户定义</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserDefined(String UserDefined) {
        this.UserDefined = UserDefined;
    }

    /**
     * Get <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>写入</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Writes <p>写入</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWrites() {
        return this.Writes;
    }

    /**
     * Set <p>写入</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Writes <p>写入</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWrites(Long Writes) {
        this.Writes = Writes;
    }

    /**
     * Get <p>目标</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Destination <p>目标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDestination() {
        return this.Destination;
    }

    /**
     * Set <p>目标</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Destination <p>目标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    /**
     * Get <p>事件名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventName <p>事件名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set <p>事件名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventName <p>事件名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
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
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
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
        this.setParamSimple(map, prefix + "EventName", this.EventName);

    }
}

