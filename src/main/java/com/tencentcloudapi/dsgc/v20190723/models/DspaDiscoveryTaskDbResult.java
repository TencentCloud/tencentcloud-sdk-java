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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspaDiscoveryTaskDbResult extends AbstractModel {

    /**
    * 扫描数据库结果ID
    */
    @SerializedName("DbResultId")
    @Expose
    private Long DbResultId;

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 扫描任务最新一次扫描结果ID
    */
    @SerializedName("ResultId")
    @Expose
    private Long ResultId;

    /**
    * 数据源ID
    */
    @SerializedName("DataSourceId")
    @Expose
    private String DataSourceId;

    /**
    * 数据库名称
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 总表数
    */
    @SerializedName("TotalTables")
    @Expose
    private Long TotalTables;

    /**
    * 敏感表数
    */
    @SerializedName("SensitiveTables")
    @Expose
    private Long SensitiveTables;

    /**
    * DB扫描的结束时间，格式如：2006-01-02 15:04:05
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 数据源名称
    */
    @SerializedName("DataSourceName")
    @Expose
    private String DataSourceName;

    /**
    * DB扫描状态，0待扫描 1扫描中 2扫描终止 3扫描成功 4扫描失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * DB扫描结果错误信息
    */
    @SerializedName("ErrorInfo")
    @Expose
    private String ErrorInfo;

    /**
    * 资源所在地域
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * 敏感字段数
    */
    @SerializedName("SensitiveField")
    @Expose
    private Long SensitiveField;

    /**
    * 总的字段数
    */
    @SerializedName("TotalField")
    @Expose
    private Long TotalField;

    /**
    * 任务实例id
    */
    @SerializedName("TaskInstanceId")
    @Expose
    private String TaskInstanceId;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 扫描范围（full:全量扫描 incre：变更扫描）
    */
    @SerializedName("ScanRange")
    @Expose
    private String ScanRange;

    /**
     * Get 扫描数据库结果ID 
     * @return DbResultId 扫描数据库结果ID
     */
    public Long getDbResultId() {
        return this.DbResultId;
    }

    /**
     * Set 扫描数据库结果ID
     * @param DbResultId 扫描数据库结果ID
     */
    public void setDbResultId(Long DbResultId) {
        this.DbResultId = DbResultId;
    }

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务名称 
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 扫描任务最新一次扫描结果ID 
     * @return ResultId 扫描任务最新一次扫描结果ID
     */
    public Long getResultId() {
        return this.ResultId;
    }

    /**
     * Set 扫描任务最新一次扫描结果ID
     * @param ResultId 扫描任务最新一次扫描结果ID
     */
    public void setResultId(Long ResultId) {
        this.ResultId = ResultId;
    }

    /**
     * Get 数据源ID 
     * @return DataSourceId 数据源ID
     */
    public String getDataSourceId() {
        return this.DataSourceId;
    }

    /**
     * Set 数据源ID
     * @param DataSourceId 数据源ID
     */
    public void setDataSourceId(String DataSourceId) {
        this.DataSourceId = DataSourceId;
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
     * Get 总表数 
     * @return TotalTables 总表数
     */
    public Long getTotalTables() {
        return this.TotalTables;
    }

    /**
     * Set 总表数
     * @param TotalTables 总表数
     */
    public void setTotalTables(Long TotalTables) {
        this.TotalTables = TotalTables;
    }

    /**
     * Get 敏感表数 
     * @return SensitiveTables 敏感表数
     */
    public Long getSensitiveTables() {
        return this.SensitiveTables;
    }

    /**
     * Set 敏感表数
     * @param SensitiveTables 敏感表数
     */
    public void setSensitiveTables(Long SensitiveTables) {
        this.SensitiveTables = SensitiveTables;
    }

    /**
     * Get DB扫描的结束时间，格式如：2006-01-02 15:04:05 
     * @return EndTime DB扫描的结束时间，格式如：2006-01-02 15:04:05
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set DB扫描的结束时间，格式如：2006-01-02 15:04:05
     * @param EndTime DB扫描的结束时间，格式如：2006-01-02 15:04:05
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 数据源名称 
     * @return DataSourceName 数据源名称
     */
    public String getDataSourceName() {
        return this.DataSourceName;
    }

    /**
     * Set 数据源名称
     * @param DataSourceName 数据源名称
     */
    public void setDataSourceName(String DataSourceName) {
        this.DataSourceName = DataSourceName;
    }

    /**
     * Get DB扫描状态，0待扫描 1扫描中 2扫描终止 3扫描成功 4扫描失败 
     * @return Status DB扫描状态，0待扫描 1扫描中 2扫描终止 3扫描成功 4扫描失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set DB扫描状态，0待扫描 1扫描中 2扫描终止 3扫描成功 4扫描失败
     * @param Status DB扫描状态，0待扫描 1扫描中 2扫描终止 3扫描成功 4扫描失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get DB扫描结果错误信息 
     * @return ErrorInfo DB扫描结果错误信息
     */
    public String getErrorInfo() {
        return this.ErrorInfo;
    }

    /**
     * Set DB扫描结果错误信息
     * @param ErrorInfo DB扫描结果错误信息
     */
    public void setErrorInfo(String ErrorInfo) {
        this.ErrorInfo = ErrorInfo;
    }

    /**
     * Get 资源所在地域 
     * @return ResourceRegion 资源所在地域
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 资源所在地域
     * @param ResourceRegion 资源所在地域
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get 敏感字段数 
     * @return SensitiveField 敏感字段数
     */
    public Long getSensitiveField() {
        return this.SensitiveField;
    }

    /**
     * Set 敏感字段数
     * @param SensitiveField 敏感字段数
     */
    public void setSensitiveField(Long SensitiveField) {
        this.SensitiveField = SensitiveField;
    }

    /**
     * Get 总的字段数 
     * @return TotalField 总的字段数
     */
    public Long getTotalField() {
        return this.TotalField;
    }

    /**
     * Set 总的字段数
     * @param TotalField 总的字段数
     */
    public void setTotalField(Long TotalField) {
        this.TotalField = TotalField;
    }

    /**
     * Get 任务实例id 
     * @return TaskInstanceId 任务实例id
     */
    public String getTaskInstanceId() {
        return this.TaskInstanceId;
    }

    /**
     * Set 任务实例id
     * @param TaskInstanceId 任务实例id
     */
    public void setTaskInstanceId(String TaskInstanceId) {
        this.TaskInstanceId = TaskInstanceId;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 扫描范围（full:全量扫描 incre：变更扫描） 
     * @return ScanRange 扫描范围（full:全量扫描 incre：变更扫描）
     */
    public String getScanRange() {
        return this.ScanRange;
    }

    /**
     * Set 扫描范围（full:全量扫描 incre：变更扫描）
     * @param ScanRange 扫描范围（full:全量扫描 incre：变更扫描）
     */
    public void setScanRange(String ScanRange) {
        this.ScanRange = ScanRange;
    }

    public DspaDiscoveryTaskDbResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspaDiscoveryTaskDbResult(DspaDiscoveryTaskDbResult source) {
        if (source.DbResultId != null) {
            this.DbResultId = new Long(source.DbResultId);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.ResultId != null) {
            this.ResultId = new Long(source.ResultId);
        }
        if (source.DataSourceId != null) {
            this.DataSourceId = new String(source.DataSourceId);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.TotalTables != null) {
            this.TotalTables = new Long(source.TotalTables);
        }
        if (source.SensitiveTables != null) {
            this.SensitiveTables = new Long(source.SensitiveTables);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.DataSourceName != null) {
            this.DataSourceName = new String(source.DataSourceName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ErrorInfo != null) {
            this.ErrorInfo = new String(source.ErrorInfo);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.SensitiveField != null) {
            this.SensitiveField = new Long(source.SensitiveField);
        }
        if (source.TotalField != null) {
            this.TotalField = new Long(source.TotalField);
        }
        if (source.TaskInstanceId != null) {
            this.TaskInstanceId = new String(source.TaskInstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.ScanRange != null) {
            this.ScanRange = new String(source.ScanRange);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbResultId", this.DbResultId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "ResultId", this.ResultId);
        this.setParamSimple(map, prefix + "DataSourceId", this.DataSourceId);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "TotalTables", this.TotalTables);
        this.setParamSimple(map, prefix + "SensitiveTables", this.SensitiveTables);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "DataSourceName", this.DataSourceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrorInfo", this.ErrorInfo);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "SensitiveField", this.SensitiveField);
        this.setParamSimple(map, prefix + "TotalField", this.TotalField);
        this.setParamSimple(map, prefix + "TaskInstanceId", this.TaskInstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "ScanRange", this.ScanRange);

    }
}

