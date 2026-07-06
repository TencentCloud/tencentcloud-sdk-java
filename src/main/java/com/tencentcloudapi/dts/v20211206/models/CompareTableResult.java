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
    * 库名
    */
    @SerializedName("Db")
    @Expose
    private String Db;

    /**
    * schema名
    */
    @SerializedName("Schema")
    @Expose
    private String Schema;

    /**
    * 表名
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * 校验结果
    */
    @SerializedName("Conclusion")
    @Expose
    private String Conclusion;

    /**
    * 校验状态。仅全量阶段有意义
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 校验进度。仅全量阶段有意义
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 不一致行数
    */
    @SerializedName("RowCount")
    @Expose
    private Long RowCount;

    /**
    * 该表开始校验的时间
    */
    @SerializedName("StartedAt")
    @Expose
    private String StartedAt;

    /**
    * 该表校验结束的时间
    */
    @SerializedName("FinishedAt")
    @Expose
    private String FinishedAt;

    /**
    * 预计该表校验结束的时间
    */
    @SerializedName("ExpectedAt")
    @Expose
    private String ExpectedAt;

    /**
    * 源端行数，如果是行数校验此值有意义
    */
    @SerializedName("SrcItem")
    @Expose
    private String SrcItem;

    /**
    * 目标端行数，如果是行数校验此值有意义
    */
    @SerializedName("DstItem")
    @Expose
    private String DstItem;

    /**
     * Get 库名 
     * @return Db 库名
     */
    public String getDb() {
        return this.Db;
    }

    /**
     * Set 库名
     * @param Db 库名
     */
    public void setDb(String Db) {
        this.Db = Db;
    }

    /**
     * Get schema名 
     * @return Schema schema名
     */
    public String getSchema() {
        return this.Schema;
    }

    /**
     * Set schema名
     * @param Schema schema名
     */
    public void setSchema(String Schema) {
        this.Schema = Schema;
    }

    /**
     * Get 表名 
     * @return Table 表名
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set 表名
     * @param Table 表名
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get 校验结果 
     * @return Conclusion 校验结果
     */
    public String getConclusion() {
        return this.Conclusion;
    }

    /**
     * Set 校验结果
     * @param Conclusion 校验结果
     */
    public void setConclusion(String Conclusion) {
        this.Conclusion = Conclusion;
    }

    /**
     * Get 校验状态。仅全量阶段有意义 
     * @return Status 校验状态。仅全量阶段有意义
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 校验状态。仅全量阶段有意义
     * @param Status 校验状态。仅全量阶段有意义
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 校验进度。仅全量阶段有意义 
     * @return Progress 校验进度。仅全量阶段有意义
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 校验进度。仅全量阶段有意义
     * @param Progress 校验进度。仅全量阶段有意义
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 不一致行数 
     * @return RowCount 不一致行数
     */
    public Long getRowCount() {
        return this.RowCount;
    }

    /**
     * Set 不一致行数
     * @param RowCount 不一致行数
     */
    public void setRowCount(Long RowCount) {
        this.RowCount = RowCount;
    }

    /**
     * Get 该表开始校验的时间 
     * @return StartedAt 该表开始校验的时间
     */
    public String getStartedAt() {
        return this.StartedAt;
    }

    /**
     * Set 该表开始校验的时间
     * @param StartedAt 该表开始校验的时间
     */
    public void setStartedAt(String StartedAt) {
        this.StartedAt = StartedAt;
    }

    /**
     * Get 该表校验结束的时间 
     * @return FinishedAt 该表校验结束的时间
     */
    public String getFinishedAt() {
        return this.FinishedAt;
    }

    /**
     * Set 该表校验结束的时间
     * @param FinishedAt 该表校验结束的时间
     */
    public void setFinishedAt(String FinishedAt) {
        this.FinishedAt = FinishedAt;
    }

    /**
     * Get 预计该表校验结束的时间 
     * @return ExpectedAt 预计该表校验结束的时间
     */
    public String getExpectedAt() {
        return this.ExpectedAt;
    }

    /**
     * Set 预计该表校验结束的时间
     * @param ExpectedAt 预计该表校验结束的时间
     */
    public void setExpectedAt(String ExpectedAt) {
        this.ExpectedAt = ExpectedAt;
    }

    /**
     * Get 源端行数，如果是行数校验此值有意义 
     * @return SrcItem 源端行数，如果是行数校验此值有意义
     */
    public String getSrcItem() {
        return this.SrcItem;
    }

    /**
     * Set 源端行数，如果是行数校验此值有意义
     * @param SrcItem 源端行数，如果是行数校验此值有意义
     */
    public void setSrcItem(String SrcItem) {
        this.SrcItem = SrcItem;
    }

    /**
     * Get 目标端行数，如果是行数校验此值有意义 
     * @return DstItem 目标端行数，如果是行数校验此值有意义
     */
    public String getDstItem() {
        return this.DstItem;
    }

    /**
     * Set 目标端行数，如果是行数校验此值有意义
     * @param DstItem 目标端行数，如果是行数校验此值有意义
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

