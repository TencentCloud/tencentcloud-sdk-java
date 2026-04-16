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

public class DescribeSyncCompareDiffItemsRequest extends AbstractModel {

    /**
    * 迁移任务 Id
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 校验任务 Id
    */
    @SerializedName("CompareTaskId")
    @Expose
    private String CompareTaskId;

    /**
    * 数据库名
    */
    @SerializedName("DBName")
    @Expose
    private String DBName;

    /**
    * schema名
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 数据表名
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 数据分块号
    */
    @SerializedName("ChunkId")
    @Expose
    private Long ChunkId;

    /**
    * 分页条件，查询结果返回条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页条件，查询的起始位置
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 迁移任务 Id 
     * @return JobId 迁移任务 Id
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 迁移任务 Id
     * @param JobId 迁移任务 Id
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 校验任务 Id 
     * @return CompareTaskId 校验任务 Id
     */
    public String getCompareTaskId() {
        return this.CompareTaskId;
    }

    /**
     * Set 校验任务 Id
     * @param CompareTaskId 校验任务 Id
     */
    public void setCompareTaskId(String CompareTaskId) {
        this.CompareTaskId = CompareTaskId;
    }

    /**
     * Get 数据库名 
     * @return DBName 数据库名
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * Set 数据库名
     * @param DBName 数据库名
     */
    public void setDBName(String DBName) {
        this.DBName = DBName;
    }

    /**
     * Get schema名 
     * @return SchemaName schema名
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set schema名
     * @param SchemaName schema名
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get 数据表名 
     * @return TableName 数据表名
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 数据表名
     * @param TableName 数据表名
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 数据分块号 
     * @return ChunkId 数据分块号
     */
    public Long getChunkId() {
        return this.ChunkId;
    }

    /**
     * Set 数据分块号
     * @param ChunkId 数据分块号
     */
    public void setChunkId(Long ChunkId) {
        this.ChunkId = ChunkId;
    }

    /**
     * Get 分页条件，查询结果返回条数 
     * @return Limit 分页条件，查询结果返回条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页条件，查询结果返回条数
     * @param Limit 分页条件，查询结果返回条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页条件，查询的起始位置 
     * @return Offset 分页条件，查询的起始位置
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页条件，查询的起始位置
     * @param Offset 分页条件，查询的起始位置
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeSyncCompareDiffItemsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSyncCompareDiffItemsRequest(DescribeSyncCompareDiffItemsRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.CompareTaskId != null) {
            this.CompareTaskId = new String(source.CompareTaskId);
        }
        if (source.DBName != null) {
            this.DBName = new String(source.DBName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.ChunkId != null) {
            this.ChunkId = new Long(source.ChunkId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "CompareTaskId", this.CompareTaskId);
        this.setParamSimple(map, prefix + "DBName", this.DBName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "ChunkId", this.ChunkId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

