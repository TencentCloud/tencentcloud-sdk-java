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

public class DifferenceItem extends AbstractModel {

    /**
    * <p>数据库名</p>
    */
    @SerializedName("Db")
    @Expose
    private String Db;

    /**
    * <p>schema</p>
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
    * <p>分块号</p>
    */
    @SerializedName("Chunk")
    @Expose
    private Long Chunk;

    /**
    * <p>源库数值</p>
    */
    @SerializedName("SrcItem")
    @Expose
    private String SrcItem;

    /**
    * <p>目标库数值</p>
    */
    @SerializedName("DstItem")
    @Expose
    private String DstItem;

    /**
    * <p>索引名称</p>
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * <p>索引下边界</p>
    */
    @SerializedName("LowerBoundary")
    @Expose
    private String LowerBoundary;

    /**
    * <p>索引上边界</p>
    */
    @SerializedName("UpperBoundary")
    @Expose
    private String UpperBoundary;

    /**
    * <p>对比消耗时间,单位为 ms</p>
    */
    @SerializedName("CostTime")
    @Expose
    private Float CostTime;

    /**
    * <p>完成时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
    */
    @SerializedName("FinishedAt")
    @Expose
    private String FinishedAt;

    /**
     * Get <p>数据库名</p> 
     * @return Db <p>数据库名</p>
     */
    public String getDb() {
        return this.Db;
    }

    /**
     * Set <p>数据库名</p>
     * @param Db <p>数据库名</p>
     */
    public void setDb(String Db) {
        this.Db = Db;
    }

    /**
     * Get <p>schema</p> 
     * @return Schema <p>schema</p>
     */
    public String getSchema() {
        return this.Schema;
    }

    /**
     * Set <p>schema</p>
     * @param Schema <p>schema</p>
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
     * Get <p>分块号</p> 
     * @return Chunk <p>分块号</p>
     */
    public Long getChunk() {
        return this.Chunk;
    }

    /**
     * Set <p>分块号</p>
     * @param Chunk <p>分块号</p>
     */
    public void setChunk(Long Chunk) {
        this.Chunk = Chunk;
    }

    /**
     * Get <p>源库数值</p> 
     * @return SrcItem <p>源库数值</p>
     */
    public String getSrcItem() {
        return this.SrcItem;
    }

    /**
     * Set <p>源库数值</p>
     * @param SrcItem <p>源库数值</p>
     */
    public void setSrcItem(String SrcItem) {
        this.SrcItem = SrcItem;
    }

    /**
     * Get <p>目标库数值</p> 
     * @return DstItem <p>目标库数值</p>
     */
    public String getDstItem() {
        return this.DstItem;
    }

    /**
     * Set <p>目标库数值</p>
     * @param DstItem <p>目标库数值</p>
     */
    public void setDstItem(String DstItem) {
        this.DstItem = DstItem;
    }

    /**
     * Get <p>索引名称</p> 
     * @return IndexName <p>索引名称</p>
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set <p>索引名称</p>
     * @param IndexName <p>索引名称</p>
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get <p>索引下边界</p> 
     * @return LowerBoundary <p>索引下边界</p>
     */
    public String getLowerBoundary() {
        return this.LowerBoundary;
    }

    /**
     * Set <p>索引下边界</p>
     * @param LowerBoundary <p>索引下边界</p>
     */
    public void setLowerBoundary(String LowerBoundary) {
        this.LowerBoundary = LowerBoundary;
    }

    /**
     * Get <p>索引上边界</p> 
     * @return UpperBoundary <p>索引上边界</p>
     */
    public String getUpperBoundary() {
        return this.UpperBoundary;
    }

    /**
     * Set <p>索引上边界</p>
     * @param UpperBoundary <p>索引上边界</p>
     */
    public void setUpperBoundary(String UpperBoundary) {
        this.UpperBoundary = UpperBoundary;
    }

    /**
     * Get <p>对比消耗时间,单位为 ms</p> 
     * @return CostTime <p>对比消耗时间,单位为 ms</p>
     */
    public Float getCostTime() {
        return this.CostTime;
    }

    /**
     * Set <p>对比消耗时间,单位为 ms</p>
     * @param CostTime <p>对比消耗时间,单位为 ms</p>
     */
    public void setCostTime(Float CostTime) {
        this.CostTime = CostTime;
    }

    /**
     * Get <p>完成时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p> 
     * @return FinishedAt <p>完成时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public String getFinishedAt() {
        return this.FinishedAt;
    }

    /**
     * Set <p>完成时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     * @param FinishedAt <p>完成时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>yyyy-mm-dd hh:mm:ss</code>（北京时间）</p>
     */
    public void setFinishedAt(String FinishedAt) {
        this.FinishedAt = FinishedAt;
    }

    public DifferenceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DifferenceItem(DifferenceItem source) {
        if (source.Db != null) {
            this.Db = new String(source.Db);
        }
        if (source.Schema != null) {
            this.Schema = new String(source.Schema);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.Chunk != null) {
            this.Chunk = new Long(source.Chunk);
        }
        if (source.SrcItem != null) {
            this.SrcItem = new String(source.SrcItem);
        }
        if (source.DstItem != null) {
            this.DstItem = new String(source.DstItem);
        }
        if (source.IndexName != null) {
            this.IndexName = new String(source.IndexName);
        }
        if (source.LowerBoundary != null) {
            this.LowerBoundary = new String(source.LowerBoundary);
        }
        if (source.UpperBoundary != null) {
            this.UpperBoundary = new String(source.UpperBoundary);
        }
        if (source.CostTime != null) {
            this.CostTime = new Float(source.CostTime);
        }
        if (source.FinishedAt != null) {
            this.FinishedAt = new String(source.FinishedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Db", this.Db);
        this.setParamSimple(map, prefix + "Schema", this.Schema);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "Chunk", this.Chunk);
        this.setParamSimple(map, prefix + "SrcItem", this.SrcItem);
        this.setParamSimple(map, prefix + "DstItem", this.DstItem);
        this.setParamSimple(map, prefix + "IndexName", this.IndexName);
        this.setParamSimple(map, prefix + "LowerBoundary", this.LowerBoundary);
        this.setParamSimple(map, prefix + "UpperBoundary", this.UpperBoundary);
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);
        this.setParamSimple(map, prefix + "FinishedAt", this.FinishedAt);

    }
}

