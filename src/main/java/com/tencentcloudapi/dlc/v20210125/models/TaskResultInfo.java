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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskResultInfo extends AbstractModel{

    /**
    * 任务唯一ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 数据源名称，当前任务执行时候选中的默认数据源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceConnectionName")
    @Expose
    private String DatasourceConnectionName;

    /**
    * 数据库名称，当前任务执行时候选中的默认数据库
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 当前执行的SQL，一个任务包含一个SQL
    */
    @SerializedName("SQL")
    @Expose
    private String SQL;

    /**
    * 执行任务的类型，现在分为DDL、DML、DQL
    */
    @SerializedName("SQLType")
    @Expose
    private String SQLType;

    /**
    * 任务当前的状态，0：初始化 1：任务运行中 2：任务执行成功 -1：任务执行失败 -3：用户手动终止。只有任务执行成功的情况下，才会返回任务执行的结果
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 扫描的数据量，单位byte
    */
    @SerializedName("DataAmount")
    @Expose
    private Long DataAmount;

    /**
    * 任务执行耗时，单位秒
    */
    @SerializedName("UsedTime")
    @Expose
    private Long UsedTime;

    /**
    * 任务结果输出的COS桶地址
    */
    @SerializedName("OutputPath")
    @Expose
    private String OutputPath;

    /**
    * 任务创建时间，时间戳
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务执行信息，成功时返回success，失败时返回失败原因
    */
    @SerializedName("OutputMessage")
    @Expose
    private String OutputMessage;

    /**
    * 被影响的行数
    */
    @SerializedName("RowAffectInfo")
    @Expose
    private String RowAffectInfo;

    /**
    * 结果的schema信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultSchema")
    @Expose
    private Column [] ResultSchema;

    /**
    * 结果信息，反转义后，外层数组的每个元素为一行数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultSet")
    @Expose
    private String ResultSet;

    /**
    * 分页信息，如果没有更多结果数据，nextToken为空
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * 任务执行进度num/100(%)
    */
    @SerializedName("Percentage")
    @Expose
    private Long Percentage;

    /**
    * 任务进度明细
    */
    @SerializedName("ProgressDetail")
    @Expose
    private String ProgressDetail;

    /**
    * 控制台展示格式。table：表格展示 text：文本展示
    */
    @SerializedName("DisplayFormat")
    @Expose
    private String DisplayFormat;

    /**
     * Get 任务唯一ID 
     * @return TaskId 任务唯一ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务唯一ID
     * @param TaskId 任务唯一ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 数据源名称，当前任务执行时候选中的默认数据源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceConnectionName 数据源名称，当前任务执行时候选中的默认数据源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceConnectionName() {
        return this.DatasourceConnectionName;
    }

    /**
     * Set 数据源名称，当前任务执行时候选中的默认数据源
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceConnectionName 数据源名称，当前任务执行时候选中的默认数据源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceConnectionName(String DatasourceConnectionName) {
        this.DatasourceConnectionName = DatasourceConnectionName;
    }

    /**
     * Get 数据库名称，当前任务执行时候选中的默认数据库
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseName 数据库名称，当前任务执行时候选中的默认数据库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名称，当前任务执行时候选中的默认数据库
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseName 数据库名称，当前任务执行时候选中的默认数据库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 当前执行的SQL，一个任务包含一个SQL 
     * @return SQL 当前执行的SQL，一个任务包含一个SQL
     */
    public String getSQL() {
        return this.SQL;
    }

    /**
     * Set 当前执行的SQL，一个任务包含一个SQL
     * @param SQL 当前执行的SQL，一个任务包含一个SQL
     */
    public void setSQL(String SQL) {
        this.SQL = SQL;
    }

    /**
     * Get 执行任务的类型，现在分为DDL、DML、DQL 
     * @return SQLType 执行任务的类型，现在分为DDL、DML、DQL
     */
    public String getSQLType() {
        return this.SQLType;
    }

    /**
     * Set 执行任务的类型，现在分为DDL、DML、DQL
     * @param SQLType 执行任务的类型，现在分为DDL、DML、DQL
     */
    public void setSQLType(String SQLType) {
        this.SQLType = SQLType;
    }

    /**
     * Get 任务当前的状态，0：初始化 1：任务运行中 2：任务执行成功 -1：任务执行失败 -3：用户手动终止。只有任务执行成功的情况下，才会返回任务执行的结果 
     * @return State 任务当前的状态，0：初始化 1：任务运行中 2：任务执行成功 -1：任务执行失败 -3：用户手动终止。只有任务执行成功的情况下，才会返回任务执行的结果
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 任务当前的状态，0：初始化 1：任务运行中 2：任务执行成功 -1：任务执行失败 -3：用户手动终止。只有任务执行成功的情况下，才会返回任务执行的结果
     * @param State 任务当前的状态，0：初始化 1：任务运行中 2：任务执行成功 -1：任务执行失败 -3：用户手动终止。只有任务执行成功的情况下，才会返回任务执行的结果
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 扫描的数据量，单位byte 
     * @return DataAmount 扫描的数据量，单位byte
     */
    public Long getDataAmount() {
        return this.DataAmount;
    }

    /**
     * Set 扫描的数据量，单位byte
     * @param DataAmount 扫描的数据量，单位byte
     */
    public void setDataAmount(Long DataAmount) {
        this.DataAmount = DataAmount;
    }

    /**
     * Get 任务执行耗时，单位秒 
     * @return UsedTime 任务执行耗时，单位秒
     */
    public Long getUsedTime() {
        return this.UsedTime;
    }

    /**
     * Set 任务执行耗时，单位秒
     * @param UsedTime 任务执行耗时，单位秒
     */
    public void setUsedTime(Long UsedTime) {
        this.UsedTime = UsedTime;
    }

    /**
     * Get 任务结果输出的COS桶地址 
     * @return OutputPath 任务结果输出的COS桶地址
     */
    public String getOutputPath() {
        return this.OutputPath;
    }

    /**
     * Set 任务结果输出的COS桶地址
     * @param OutputPath 任务结果输出的COS桶地址
     */
    public void setOutputPath(String OutputPath) {
        this.OutputPath = OutputPath;
    }

    /**
     * Get 任务创建时间，时间戳 
     * @return CreateTime 任务创建时间，时间戳
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建时间，时间戳
     * @param CreateTime 任务创建时间，时间戳
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 任务执行信息，成功时返回success，失败时返回失败原因 
     * @return OutputMessage 任务执行信息，成功时返回success，失败时返回失败原因
     */
    public String getOutputMessage() {
        return this.OutputMessage;
    }

    /**
     * Set 任务执行信息，成功时返回success，失败时返回失败原因
     * @param OutputMessage 任务执行信息，成功时返回success，失败时返回失败原因
     */
    public void setOutputMessage(String OutputMessage) {
        this.OutputMessage = OutputMessage;
    }

    /**
     * Get 被影响的行数 
     * @return RowAffectInfo 被影响的行数
     */
    public String getRowAffectInfo() {
        return this.RowAffectInfo;
    }

    /**
     * Set 被影响的行数
     * @param RowAffectInfo 被影响的行数
     */
    public void setRowAffectInfo(String RowAffectInfo) {
        this.RowAffectInfo = RowAffectInfo;
    }

    /**
     * Get 结果的schema信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultSchema 结果的schema信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Column [] getResultSchema() {
        return this.ResultSchema;
    }

    /**
     * Set 结果的schema信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultSchema 结果的schema信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultSchema(Column [] ResultSchema) {
        this.ResultSchema = ResultSchema;
    }

    /**
     * Get 结果信息，反转义后，外层数组的每个元素为一行数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultSet 结果信息，反转义后，外层数组的每个元素为一行数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResultSet() {
        return this.ResultSet;
    }

    /**
     * Set 结果信息，反转义后，外层数组的每个元素为一行数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultSet 结果信息，反转义后，外层数组的每个元素为一行数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultSet(String ResultSet) {
        this.ResultSet = ResultSet;
    }

    /**
     * Get 分页信息，如果没有更多结果数据，nextToken为空 
     * @return NextToken 分页信息，如果没有更多结果数据，nextToken为空
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set 分页信息，如果没有更多结果数据，nextToken为空
     * @param NextToken 分页信息，如果没有更多结果数据，nextToken为空
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get 任务执行进度num/100(%) 
     * @return Percentage 任务执行进度num/100(%)
     */
    public Long getPercentage() {
        return this.Percentage;
    }

    /**
     * Set 任务执行进度num/100(%)
     * @param Percentage 任务执行进度num/100(%)
     */
    public void setPercentage(Long Percentage) {
        this.Percentage = Percentage;
    }

    /**
     * Get 任务进度明细 
     * @return ProgressDetail 任务进度明细
     */
    public String getProgressDetail() {
        return this.ProgressDetail;
    }

    /**
     * Set 任务进度明细
     * @param ProgressDetail 任务进度明细
     */
    public void setProgressDetail(String ProgressDetail) {
        this.ProgressDetail = ProgressDetail;
    }

    /**
     * Get 控制台展示格式。table：表格展示 text：文本展示 
     * @return DisplayFormat 控制台展示格式。table：表格展示 text：文本展示
     */
    public String getDisplayFormat() {
        return this.DisplayFormat;
    }

    /**
     * Set 控制台展示格式。table：表格展示 text：文本展示
     * @param DisplayFormat 控制台展示格式。table：表格展示 text：文本展示
     */
    public void setDisplayFormat(String DisplayFormat) {
        this.DisplayFormat = DisplayFormat;
    }

    public TaskResultInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskResultInfo(TaskResultInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.DatasourceConnectionName != null) {
            this.DatasourceConnectionName = new String(source.DatasourceConnectionName);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.SQL != null) {
            this.SQL = new String(source.SQL);
        }
        if (source.SQLType != null) {
            this.SQLType = new String(source.SQLType);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.DataAmount != null) {
            this.DataAmount = new Long(source.DataAmount);
        }
        if (source.UsedTime != null) {
            this.UsedTime = new Long(source.UsedTime);
        }
        if (source.OutputPath != null) {
            this.OutputPath = new String(source.OutputPath);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.OutputMessage != null) {
            this.OutputMessage = new String(source.OutputMessage);
        }
        if (source.RowAffectInfo != null) {
            this.RowAffectInfo = new String(source.RowAffectInfo);
        }
        if (source.ResultSchema != null) {
            this.ResultSchema = new Column[source.ResultSchema.length];
            for (int i = 0; i < source.ResultSchema.length; i++) {
                this.ResultSchema[i] = new Column(source.ResultSchema[i]);
            }
        }
        if (source.ResultSet != null) {
            this.ResultSet = new String(source.ResultSet);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.Percentage != null) {
            this.Percentage = new Long(source.Percentage);
        }
        if (source.ProgressDetail != null) {
            this.ProgressDetail = new String(source.ProgressDetail);
        }
        if (source.DisplayFormat != null) {
            this.DisplayFormat = new String(source.DisplayFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "DatasourceConnectionName", this.DatasourceConnectionName);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "SQL", this.SQL);
        this.setParamSimple(map, prefix + "SQLType", this.SQLType);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "DataAmount", this.DataAmount);
        this.setParamSimple(map, prefix + "UsedTime", this.UsedTime);
        this.setParamSimple(map, prefix + "OutputPath", this.OutputPath);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "OutputMessage", this.OutputMessage);
        this.setParamSimple(map, prefix + "RowAffectInfo", this.RowAffectInfo);
        this.setParamArrayObj(map, prefix + "ResultSchema.", this.ResultSchema);
        this.setParamSimple(map, prefix + "ResultSet", this.ResultSet);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "Percentage", this.Percentage);
        this.setParamSimple(map, prefix + "ProgressDetail", this.ProgressDetail);
        this.setParamSimple(map, prefix + "DisplayFormat", this.DisplayFormat);

    }
}

