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

public class DescribeCompareReportRequest extends AbstractModel {

    /**
    * <p>迁移任务 Id，可通过<a href="https://cloud.tencent.com/document/product/571/82084">DescribeMigrationJobs</a>接口获取。</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>校验任务 Id，可通过<a href="https://cloud.tencent.com/document/product/571/82084">DescribeMigrationJobs</a>接口获取。</p>
    */
    @SerializedName("CompareTaskId")
    @Expose
    private String CompareTaskId;

    /**
    * <p>校验不一致结果的 limit</p>
    */
    @SerializedName("DifferenceLimit")
    @Expose
    private Long DifferenceLimit;

    /**
    * <p>不一致的 Offset</p>
    */
    @SerializedName("DifferenceOffset")
    @Expose
    private Long DifferenceOffset;

    /**
    * <p>搜索条件，不一致的库名</p>
    */
    @SerializedName("DifferenceDB")
    @Expose
    private String DifferenceDB;

    /**
    * <p>搜索条件，不一致的表名</p>
    */
    @SerializedName("DifferenceTable")
    @Expose
    private String DifferenceTable;

    /**
    * <p>未校验的 Limit</p>
    */
    @SerializedName("SkippedLimit")
    @Expose
    private Long SkippedLimit;

    /**
    * <p>未校验的 Offset</p>
    */
    @SerializedName("SkippedOffset")
    @Expose
    private Long SkippedOffset;

    /**
    * <p>搜索条件，未校验的库名</p>
    */
    @SerializedName("SkippedDB")
    @Expose
    private String SkippedDB;

    /**
    * <p>搜索条件，未校验的表名</p>
    */
    @SerializedName("SkippedTable")
    @Expose
    private String SkippedTable;

    /**
     * Get <p>迁移任务 Id，可通过<a href="https://cloud.tencent.com/document/product/571/82084">DescribeMigrationJobs</a>接口获取。</p> 
     * @return JobId <p>迁移任务 Id，可通过<a href="https://cloud.tencent.com/document/product/571/82084">DescribeMigrationJobs</a>接口获取。</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>迁移任务 Id，可通过<a href="https://cloud.tencent.com/document/product/571/82084">DescribeMigrationJobs</a>接口获取。</p>
     * @param JobId <p>迁移任务 Id，可通过<a href="https://cloud.tencent.com/document/product/571/82084">DescribeMigrationJobs</a>接口获取。</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>校验任务 Id，可通过<a href="https://cloud.tencent.com/document/product/571/82084">DescribeMigrationJobs</a>接口获取。</p> 
     * @return CompareTaskId <p>校验任务 Id，可通过<a href="https://cloud.tencent.com/document/product/571/82084">DescribeMigrationJobs</a>接口获取。</p>
     */
    public String getCompareTaskId() {
        return this.CompareTaskId;
    }

    /**
     * Set <p>校验任务 Id，可通过<a href="https://cloud.tencent.com/document/product/571/82084">DescribeMigrationJobs</a>接口获取。</p>
     * @param CompareTaskId <p>校验任务 Id，可通过<a href="https://cloud.tencent.com/document/product/571/82084">DescribeMigrationJobs</a>接口获取。</p>
     */
    public void setCompareTaskId(String CompareTaskId) {
        this.CompareTaskId = CompareTaskId;
    }

    /**
     * Get <p>校验不一致结果的 limit</p> 
     * @return DifferenceLimit <p>校验不一致结果的 limit</p>
     */
    public Long getDifferenceLimit() {
        return this.DifferenceLimit;
    }

    /**
     * Set <p>校验不一致结果的 limit</p>
     * @param DifferenceLimit <p>校验不一致结果的 limit</p>
     */
    public void setDifferenceLimit(Long DifferenceLimit) {
        this.DifferenceLimit = DifferenceLimit;
    }

    /**
     * Get <p>不一致的 Offset</p> 
     * @return DifferenceOffset <p>不一致的 Offset</p>
     */
    public Long getDifferenceOffset() {
        return this.DifferenceOffset;
    }

    /**
     * Set <p>不一致的 Offset</p>
     * @param DifferenceOffset <p>不一致的 Offset</p>
     */
    public void setDifferenceOffset(Long DifferenceOffset) {
        this.DifferenceOffset = DifferenceOffset;
    }

    /**
     * Get <p>搜索条件，不一致的库名</p> 
     * @return DifferenceDB <p>搜索条件，不一致的库名</p>
     */
    public String getDifferenceDB() {
        return this.DifferenceDB;
    }

    /**
     * Set <p>搜索条件，不一致的库名</p>
     * @param DifferenceDB <p>搜索条件，不一致的库名</p>
     */
    public void setDifferenceDB(String DifferenceDB) {
        this.DifferenceDB = DifferenceDB;
    }

    /**
     * Get <p>搜索条件，不一致的表名</p> 
     * @return DifferenceTable <p>搜索条件，不一致的表名</p>
     */
    public String getDifferenceTable() {
        return this.DifferenceTable;
    }

    /**
     * Set <p>搜索条件，不一致的表名</p>
     * @param DifferenceTable <p>搜索条件，不一致的表名</p>
     */
    public void setDifferenceTable(String DifferenceTable) {
        this.DifferenceTable = DifferenceTable;
    }

    /**
     * Get <p>未校验的 Limit</p> 
     * @return SkippedLimit <p>未校验的 Limit</p>
     */
    public Long getSkippedLimit() {
        return this.SkippedLimit;
    }

    /**
     * Set <p>未校验的 Limit</p>
     * @param SkippedLimit <p>未校验的 Limit</p>
     */
    public void setSkippedLimit(Long SkippedLimit) {
        this.SkippedLimit = SkippedLimit;
    }

    /**
     * Get <p>未校验的 Offset</p> 
     * @return SkippedOffset <p>未校验的 Offset</p>
     */
    public Long getSkippedOffset() {
        return this.SkippedOffset;
    }

    /**
     * Set <p>未校验的 Offset</p>
     * @param SkippedOffset <p>未校验的 Offset</p>
     */
    public void setSkippedOffset(Long SkippedOffset) {
        this.SkippedOffset = SkippedOffset;
    }

    /**
     * Get <p>搜索条件，未校验的库名</p> 
     * @return SkippedDB <p>搜索条件，未校验的库名</p>
     */
    public String getSkippedDB() {
        return this.SkippedDB;
    }

    /**
     * Set <p>搜索条件，未校验的库名</p>
     * @param SkippedDB <p>搜索条件，未校验的库名</p>
     */
    public void setSkippedDB(String SkippedDB) {
        this.SkippedDB = SkippedDB;
    }

    /**
     * Get <p>搜索条件，未校验的表名</p> 
     * @return SkippedTable <p>搜索条件，未校验的表名</p>
     */
    public String getSkippedTable() {
        return this.SkippedTable;
    }

    /**
     * Set <p>搜索条件，未校验的表名</p>
     * @param SkippedTable <p>搜索条件，未校验的表名</p>
     */
    public void setSkippedTable(String SkippedTable) {
        this.SkippedTable = SkippedTable;
    }

    public DescribeCompareReportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCompareReportRequest(DescribeCompareReportRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.CompareTaskId != null) {
            this.CompareTaskId = new String(source.CompareTaskId);
        }
        if (source.DifferenceLimit != null) {
            this.DifferenceLimit = new Long(source.DifferenceLimit);
        }
        if (source.DifferenceOffset != null) {
            this.DifferenceOffset = new Long(source.DifferenceOffset);
        }
        if (source.DifferenceDB != null) {
            this.DifferenceDB = new String(source.DifferenceDB);
        }
        if (source.DifferenceTable != null) {
            this.DifferenceTable = new String(source.DifferenceTable);
        }
        if (source.SkippedLimit != null) {
            this.SkippedLimit = new Long(source.SkippedLimit);
        }
        if (source.SkippedOffset != null) {
            this.SkippedOffset = new Long(source.SkippedOffset);
        }
        if (source.SkippedDB != null) {
            this.SkippedDB = new String(source.SkippedDB);
        }
        if (source.SkippedTable != null) {
            this.SkippedTable = new String(source.SkippedTable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "CompareTaskId", this.CompareTaskId);
        this.setParamSimple(map, prefix + "DifferenceLimit", this.DifferenceLimit);
        this.setParamSimple(map, prefix + "DifferenceOffset", this.DifferenceOffset);
        this.setParamSimple(map, prefix + "DifferenceDB", this.DifferenceDB);
        this.setParamSimple(map, prefix + "DifferenceTable", this.DifferenceTable);
        this.setParamSimple(map, prefix + "SkippedLimit", this.SkippedLimit);
        this.setParamSimple(map, prefix + "SkippedOffset", this.SkippedOffset);
        this.setParamSimple(map, prefix + "SkippedDB", this.SkippedDB);
        this.setParamSimple(map, prefix + "SkippedTable", this.SkippedTable);

    }
}

