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
    * 数据库名
    */
    @SerializedName("Db")
    @Expose
    private String Db;

    /**
    * 表名
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * 分块号
    */
    @SerializedName("Chunk")
    @Expose
    private Long Chunk;

    /**
    * 源库数值
    */
    @SerializedName("SrcItem")
    @Expose
    private String SrcItem;

    /**
    * 目标库数值
    */
    @SerializedName("DstItem")
    @Expose
    private String DstItem;

    /**
    * 索引名称
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * 索引下边界
    */
    @SerializedName("LowerBoundary")
    @Expose
    private String LowerBoundary;

    /**
    * 索引上边界
    */
    @SerializedName("UpperBoundary")
    @Expose
    private String UpperBoundary;

    /**
    * 对比消耗时间,单位为 ms
    */
    @SerializedName("CostTime")
    @Expose
    private Float CostTime;

    /**
    * 完成时间
    */
    @SerializedName("FinishedAt")
    @Expose
    private String FinishedAt;

    /**
     * Get 数据库名 
     * @return Db 数据库名
     */
    public String getDb() {
        return this.Db;
    }

    /**
     * Set 数据库名
     * @param Db 数据库名
     */
    public void setDb(String Db) {
        this.Db = Db;
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
     * Get 分块号 
     * @return Chunk 分块号
     */
    public Long getChunk() {
        return this.Chunk;
    }

    /**
     * Set 分块号
     * @param Chunk 分块号
     */
    public void setChunk(Long Chunk) {
        this.Chunk = Chunk;
    }

    /**
     * Get 源库数值 
     * @return SrcItem 源库数值
     */
    public String getSrcItem() {
        return this.SrcItem;
    }

    /**
     * Set 源库数值
     * @param SrcItem 源库数值
     */
    public void setSrcItem(String SrcItem) {
        this.SrcItem = SrcItem;
    }

    /**
     * Get 目标库数值 
     * @return DstItem 目标库数值
     */
    public String getDstItem() {
        return this.DstItem;
    }

    /**
     * Set 目标库数值
     * @param DstItem 目标库数值
     */
    public void setDstItem(String DstItem) {
        this.DstItem = DstItem;
    }

    /**
     * Get 索引名称 
     * @return IndexName 索引名称
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set 索引名称
     * @param IndexName 索引名称
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get 索引下边界 
     * @return LowerBoundary 索引下边界
     */
    public String getLowerBoundary() {
        return this.LowerBoundary;
    }

    /**
     * Set 索引下边界
     * @param LowerBoundary 索引下边界
     */
    public void setLowerBoundary(String LowerBoundary) {
        this.LowerBoundary = LowerBoundary;
    }

    /**
     * Get 索引上边界 
     * @return UpperBoundary 索引上边界
     */
    public String getUpperBoundary() {
        return this.UpperBoundary;
    }

    /**
     * Set 索引上边界
     * @param UpperBoundary 索引上边界
     */
    public void setUpperBoundary(String UpperBoundary) {
        this.UpperBoundary = UpperBoundary;
    }

    /**
     * Get 对比消耗时间,单位为 ms 
     * @return CostTime 对比消耗时间,单位为 ms
     */
    public Float getCostTime() {
        return this.CostTime;
    }

    /**
     * Set 对比消耗时间,单位为 ms
     * @param CostTime 对比消耗时间,单位为 ms
     */
    public void setCostTime(Float CostTime) {
        this.CostTime = CostTime;
    }

    /**
     * Get 完成时间 
     * @return FinishedAt 完成时间
     */
    public String getFinishedAt() {
        return this.FinishedAt;
    }

    /**
     * Set 完成时间
     * @param FinishedAt 完成时间
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

