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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompareTableResult extends AbstractModel {

    /**
    * <p>库名</p>
    */
    @SerializedName("Db")
    @Expose
    private String Db;

    /**
    * <p>schema名</p>
    */
    @SerializedName("Schema")
    @Expose
    private String Schema;

    /**
    * <p>表名</p>
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * <p>校验结果</p>
    */
    @SerializedName("Conclusion")
    @Expose
    private String Conclusion;

    /**
    * <p>校验状态。仅全量阶段有意义</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>校验进度。仅全量阶段有意义</p>
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * <p>不一致行数</p>
    */
    @SerializedName("RowCount")
    @Expose
    private Long RowCount;

    /**
    * <p>该表开始校验的时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
    */
    @SerializedName("StartedAt")
    @Expose
    private String StartedAt;

    /**
    * <p>该表校验结束的时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
    */
    @SerializedName("FinishedAt")
    @Expose
    private String FinishedAt;

    /**
    * <p>预计该表校验结束的时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
    */
    @SerializedName("ExpectedAt")
    @Expose
    private String ExpectedAt;

    /**
    * <p>源端行数，如果是行数校验此值有意义</p>
    */
    @SerializedName("SrcItem")
    @Expose
    private String SrcItem;

    /**
    * <p>目标端行数，如果是行数校验此值有意义</p>
    */
    @SerializedName("DstItem")
    @Expose
    private String DstItem;

    /**
     * Get <p>库名</p> 
     * @return Db <p>库名</p>
     */
    public String getDb() {
        return this.Db;
    }

    /**
     * Set <p>库名</p>
     * @param Db <p>库名</p>
     */
    public void setDb(String Db) {
        this.Db = Db;
    }

    /**
     * Get <p>schema名</p> 
     * @return Schema <p>schema名</p>
     */
    public String getSchema() {
        return this.Schema;
    }

    /**
     * Set <p>schema名</p>
     * @param Schema <p>schema名</p>
     */
    public void setSchema(String Schema) {
        this.Schema = Schema;
    }

    /**
     * Get <p>表名</p> 
     * @return Table <p>表名</p>
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set <p>表名</p>
     * @param Table <p>表名</p>
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get <p>校验结果</p> 
     * @return Conclusion <p>校验结果</p>
     */
    public String getConclusion() {
        return this.Conclusion;
    }

    /**
     * Set <p>校验结果</p>
     * @param Conclusion <p>校验结果</p>
     */
    public void setConclusion(String Conclusion) {
        this.Conclusion = Conclusion;
    }

    /**
     * Get <p>校验状态。仅全量阶段有意义</p> 
     * @return Status <p>校验状态。仅全量阶段有意义</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>校验状态。仅全量阶段有意义</p>
     * @param Status <p>校验状态。仅全量阶段有意义</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>校验进度。仅全量阶段有意义</p> 
     * @return Progress <p>校验进度。仅全量阶段有意义</p>
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>校验进度。仅全量阶段有意义</p>
     * @param Progress <p>校验进度。仅全量阶段有意义</p>
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>不一致行数</p> 
     * @return RowCount <p>不一致行数</p>
     */
    public Long getRowCount() {
        return this.RowCount;
    }

    /**
     * Set <p>不一致行数</p>
     * @param RowCount <p>不一致行数</p>
     */
    public void setRowCount(Long RowCount) {
        this.RowCount = RowCount;
    }

    /**
     * Get <p>该表开始校验的时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p> 
     * @return StartedAt <p>该表开始校验的时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public String getStartedAt() {
        return this.StartedAt;
    }

    /**
     * Set <p>该表开始校验的时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     * @param StartedAt <p>该表开始校验的时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public void setStartedAt(String StartedAt) {
        this.StartedAt = StartedAt;
    }

    /**
     * Get <p>该表校验结束的时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p> 
     * @return FinishedAt <p>该表校验结束的时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public String getFinishedAt() {
        return this.FinishedAt;
    }

    /**
     * Set <p>该表校验结束的时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     * @param FinishedAt <p>该表校验结束的时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public void setFinishedAt(String FinishedAt) {
        this.FinishedAt = FinishedAt;
    }

    /**
     * Get <p>预计该表校验结束的时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p> 
     * @return ExpectedAt <p>预计该表校验结束的时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public String getExpectedAt() {
        return this.ExpectedAt;
    }

    /**
     * Set <p>预计该表校验结束的时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     * @param ExpectedAt <p>预计该表校验结束的时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public void setExpectedAt(String ExpectedAt) {
        this.ExpectedAt = ExpectedAt;
    }

    /**
     * Get <p>源端行数，如果是行数校验此值有意义</p> 
     * @return SrcItem <p>源端行数，如果是行数校验此值有意义</p>
     */
    public String getSrcItem() {
        return this.SrcItem;
    }

    /**
     * Set <p>源端行数，如果是行数校验此值有意义</p>
     * @param SrcItem <p>源端行数，如果是行数校验此值有意义</p>
     */
    public void setSrcItem(String SrcItem) {
        this.SrcItem = SrcItem;
    }

    /**
     * Get <p>目标端行数，如果是行数校验此值有意义</p> 
     * @return DstItem <p>目标端行数，如果是行数校验此值有意义</p>
     */
    public String getDstItem() {
        return this.DstItem;
    }

    /**
     * Set <p>目标端行数，如果是行数校验此值有意义</p>
     * @param DstItem <p>目标端行数，如果是行数校验此值有意义</p>
     */
    public void setDstItem(String DstItem) {
        this.DstItem = DstItem;
    }

    public CompareTableResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareTableResult(CompareTableResult source) {
        if (source.Db != null) {
            this.Db = new String(source.Db);
        }
        if (source.Schema != null) {
            this.Schema = new String(source.Schema);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.Conclusion != null) {
            this.Conclusion = new String(source.Conclusion);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.RowCount != null) {
            this.RowCount = new Long(source.RowCount);
        }
        if (source.StartedAt != null) {
            this.StartedAt = new String(source.StartedAt);
        }
        if (source.FinishedAt != null) {
            this.FinishedAt = new String(source.FinishedAt);
        }
        if (source.ExpectedAt != null) {
            this.ExpectedAt = new String(source.ExpectedAt);
        }
        if (source.SrcItem != null) {
            this.SrcItem = new String(source.SrcItem);
        }
        if (source.DstItem != null) {
            this.DstItem = new String(source.DstItem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Db", this.Db);
        this.setParamSimple(map, prefix + "Schema", this.Schema);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "Conclusion", this.Conclusion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "RowCount", this.RowCount);
        this.setParamSimple(map, prefix + "StartedAt", this.StartedAt);
        this.setParamSimple(map, prefix + "FinishedAt", this.FinishedAt);
        this.setParamSimple(map, prefix + "ExpectedAt", this.ExpectedAt);
        this.setParamSimple(map, prefix + "SrcItem", this.SrcItem);
        this.setParamSimple(map, prefix + "DstItem", this.DstItem);

    }
}

