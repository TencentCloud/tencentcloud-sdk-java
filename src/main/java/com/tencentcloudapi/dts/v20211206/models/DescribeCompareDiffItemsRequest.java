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

public class DescribeCompareDiffItemsRequest extends AbstractModel {

    /**
    * <p>迁移任务 Id</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>校验任务 Id</p>
    */
    @SerializedName("CompareTaskId")
    @Expose
    private String CompareTaskId;

    /**
    * <p>数据库名</p>
    */
    @SerializedName("DBName")
    @Expose
    private String DBName;

    /**
    * <p>schema名</p>
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * <p>数据表名</p>
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * <p>数据分块号</p>
    */
    @SerializedName("ChunkId")
    @Expose
    private Long ChunkId;

    /**
    * <p>分页条件，查询结果返回条数</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页条件，查询的起始位置</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>迁移任务 Id</p> 
     * @return JobId <p>迁移任务 Id</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>迁移任务 Id</p>
     * @param JobId <p>迁移任务 Id</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>校验任务 Id</p> 
     * @return CompareTaskId <p>校验任务 Id</p>
     */
    public String getCompareTaskId() {
        return this.CompareTaskId;
    }

    /**
     * Set <p>校验任务 Id</p>
     * @param CompareTaskId <p>校验任务 Id</p>
     */
    public void setCompareTaskId(String CompareTaskId) {
        this.CompareTaskId = CompareTaskId;
    }

    /**
     * Get <p>数据库名</p> 
     * @return DBName <p>数据库名</p>
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * Set <p>数据库名</p>
     * @param DBName <p>数据库名</p>
     */
    public void setDBName(String DBName) {
        this.DBName = DBName;
    }

    /**
     * Get <p>schema名</p> 
     * @return SchemaName <p>schema名</p>
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set <p>schema名</p>
     * @param SchemaName <p>schema名</p>
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get <p>数据表名</p> 
     * @return TableName <p>数据表名</p>
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set <p>数据表名</p>
     * @param TableName <p>数据表名</p>
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get <p>数据分块号</p> 
     * @return ChunkId <p>数据分块号</p>
     */
    public Long getChunkId() {
        return this.ChunkId;
    }

    /**
     * Set <p>数据分块号</p>
     * @param ChunkId <p>数据分块号</p>
     */
    public void setChunkId(Long ChunkId) {
        this.ChunkId = ChunkId;
    }

    /**
     * Get <p>分页条件，查询结果返回条数</p> 
     * @return Limit <p>分页条件，查询结果返回条数</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页条件，查询结果返回条数</p>
     * @param Limit <p>分页条件，查询结果返回条数</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页条件，查询的起始位置</p> 
     * @return Offset <p>分页条件，查询的起始位置</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页条件，查询的起始位置</p>
     * @param Offset <p>分页条件，查询的起始位置</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeCompareDiffItemsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCompareDiffItemsRequest(DescribeCompareDiffItemsRequest source) {
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

