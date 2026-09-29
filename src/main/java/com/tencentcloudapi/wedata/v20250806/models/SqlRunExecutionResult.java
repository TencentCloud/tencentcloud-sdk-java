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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SqlRunExecutionResult extends AbstractModel {

    /**
    * 子查询任务运行ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobExecutionId")
    @Expose
    private String JobExecutionId;

    /**
    * 子查询状态：SUCCESS、FAILED、TERMINATED、CANCELED 等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 结果集字段信息；非查询类语句（INSERT/CREATE 等）为空列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Columns")
    @Expose
    private ResultColumnInfo [] Columns;

    /**
    * 结果数据行，每个元素的 Values 顺序与 Columns 一致
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rows")
    @Expose
    private SqlRunResultRow [] Rows;

    /**
    * 本子查询的预览结果行数。预览行数上限遵循「项目管理-数据分析配置-单次运行的预览行数上限」，由执行平台在结果产出阶段截断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 本子查询耗时，单位毫秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CostMs")
    @Expose
    private Long CostMs;

    /**
    * 本子查询结果是否不完整。返回数据总大小超过 10MB、或结果文件已被清理导致读取不完整时为 true
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Truncated")
    @Expose
    private Boolean Truncated;

    /**
     * Get 子查询任务运行ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobExecutionId 子查询任务运行ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobExecutionId() {
        return this.JobExecutionId;
    }

    /**
     * Set 子查询任务运行ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobExecutionId 子查询任务运行ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobExecutionId(String JobExecutionId) {
        this.JobExecutionId = JobExecutionId;
    }

    /**
     * Get 子查询状态：SUCCESS、FAILED、TERMINATED、CANCELED 等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 子查询状态：SUCCESS、FAILED、TERMINATED、CANCELED 等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 子查询状态：SUCCESS、FAILED、TERMINATED、CANCELED 等
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 子查询状态：SUCCESS、FAILED、TERMINATED、CANCELED 等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 结果集字段信息；非查询类语句（INSERT/CREATE 等）为空列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Columns 结果集字段信息；非查询类语句（INSERT/CREATE 等）为空列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResultColumnInfo [] getColumns() {
        return this.Columns;
    }

    /**
     * Set 结果集字段信息；非查询类语句（INSERT/CREATE 等）为空列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Columns 结果集字段信息；非查询类语句（INSERT/CREATE 等）为空列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumns(ResultColumnInfo [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get 结果数据行，每个元素的 Values 顺序与 Columns 一致
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rows 结果数据行，每个元素的 Values 顺序与 Columns 一致
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SqlRunResultRow [] getRows() {
        return this.Rows;
    }

    /**
     * Set 结果数据行，每个元素的 Values 顺序与 Columns 一致
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rows 结果数据行，每个元素的 Values 顺序与 Columns 一致
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRows(SqlRunResultRow [] Rows) {
        this.Rows = Rows;
    }

    /**
     * Get 本子查询的预览结果行数。预览行数上限遵循「项目管理-数据分析配置-单次运行的预览行数上限」，由执行平台在结果产出阶段截断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 本子查询的预览结果行数。预览行数上限遵循「项目管理-数据分析配置-单次运行的预览行数上限」，由执行平台在结果产出阶段截断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 本子查询的预览结果行数。预览行数上限遵循「项目管理-数据分析配置-单次运行的预览行数上限」，由执行平台在结果产出阶段截断
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 本子查询的预览结果行数。预览行数上限遵循「项目管理-数据分析配置-单次运行的预览行数上限」，由执行平台在结果产出阶段截断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 本子查询耗时，单位毫秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CostMs 本子查询耗时，单位毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCostMs() {
        return this.CostMs;
    }

    /**
     * Set 本子查询耗时，单位毫秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param CostMs 本子查询耗时，单位毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCostMs(Long CostMs) {
        this.CostMs = CostMs;
    }

    /**
     * Get 本子查询结果是否不完整。返回数据总大小超过 10MB、或结果文件已被清理导致读取不完整时为 true
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Truncated 本子查询结果是否不完整。返回数据总大小超过 10MB、或结果文件已被清理导致读取不完整时为 true
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getTruncated() {
        return this.Truncated;
    }

    /**
     * Set 本子查询结果是否不完整。返回数据总大小超过 10MB、或结果文件已被清理导致读取不完整时为 true
注意：此字段可能返回 null，表示取不到有效值。
     * @param Truncated 本子查询结果是否不完整。返回数据总大小超过 10MB、或结果文件已被清理导致读取不完整时为 true
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTruncated(Boolean Truncated) {
        this.Truncated = Truncated;
    }

    public SqlRunExecutionResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SqlRunExecutionResult(SqlRunExecutionResult source) {
        if (source.JobExecutionId != null) {
            this.JobExecutionId = new String(source.JobExecutionId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Columns != null) {
            this.Columns = new ResultColumnInfo[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new ResultColumnInfo(source.Columns[i]);
            }
        }
        if (source.Rows != null) {
            this.Rows = new SqlRunResultRow[source.Rows.length];
            for (int i = 0; i < source.Rows.length; i++) {
                this.Rows[i] = new SqlRunResultRow(source.Rows[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.CostMs != null) {
            this.CostMs = new Long(source.CostMs);
        }
        if (source.Truncated != null) {
            this.Truncated = new Boolean(source.Truncated);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobExecutionId", this.JobExecutionId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Columns.", this.Columns);
        this.setParamArrayObj(map, prefix + "Rows.", this.Rows);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "CostMs", this.CostMs);
        this.setParamSimple(map, prefix + "Truncated", this.Truncated);

    }
}

