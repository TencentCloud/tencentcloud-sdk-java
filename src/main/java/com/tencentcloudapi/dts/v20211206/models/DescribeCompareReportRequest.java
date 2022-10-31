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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCompareReportRequest extends AbstractModel{

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
    * 校验不一致结果的 limit
    */
    @SerializedName("DifferenceLimit")
    @Expose
    private Long DifferenceLimit;

    /**
    * 不一致的 Offset
    */
    @SerializedName("DifferenceOffset")
    @Expose
    private Long DifferenceOffset;

    /**
    * 搜索条件，不一致的库名
    */
    @SerializedName("DifferenceDB")
    @Expose
    private String DifferenceDB;

    /**
    * 搜索条件，不一致的表名
    */
    @SerializedName("DifferenceTable")
    @Expose
    private String DifferenceTable;

    /**
    * 未校验的 Limit
    */
    @SerializedName("SkippedLimit")
    @Expose
    private Long SkippedLimit;

    /**
    * 未校验的 Offset
    */
    @SerializedName("SkippedOffset")
    @Expose
    private Long SkippedOffset;

    /**
    * 搜索条件，未校验的库名
    */
    @SerializedName("SkippedDB")
    @Expose
    private String SkippedDB;

    /**
    * 搜索条件，未校验的表名
    */
    @SerializedName("SkippedTable")
    @Expose
    private String SkippedTable;

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
     * Get 校验不一致结果的 limit 
     * @return DifferenceLimit 校验不一致结果的 limit
     */
    public Long getDifferenceLimit() {
        return this.DifferenceLimit;
    }

    /**
     * Set 校验不一致结果的 limit
     * @param DifferenceLimit 校验不一致结果的 limit
     */
    public void setDifferenceLimit(Long DifferenceLimit) {
        this.DifferenceLimit = DifferenceLimit;
    }

    /**
     * Get 不一致的 Offset 
     * @return DifferenceOffset 不一致的 Offset
     */
    public Long getDifferenceOffset() {
        return this.DifferenceOffset;
    }

    /**
     * Set 不一致的 Offset
     * @param DifferenceOffset 不一致的 Offset
     */
    public void setDifferenceOffset(Long DifferenceOffset) {
        this.DifferenceOffset = DifferenceOffset;
    }

    /**
     * Get 搜索条件，不一致的库名 
     * @return DifferenceDB 搜索条件，不一致的库名
     */
    public String getDifferenceDB() {
        return this.DifferenceDB;
    }

    /**
     * Set 搜索条件，不一致的库名
     * @param DifferenceDB 搜索条件，不一致的库名
     */
    public void setDifferenceDB(String DifferenceDB) {
        this.DifferenceDB = DifferenceDB;
    }

    /**
     * Get 搜索条件，不一致的表名 
     * @return DifferenceTable 搜索条件，不一致的表名
     */
    public String getDifferenceTable() {
        return this.DifferenceTable;
    }

    /**
     * Set 搜索条件，不一致的表名
     * @param DifferenceTable 搜索条件，不一致的表名
     */
    public void setDifferenceTable(String DifferenceTable) {
        this.DifferenceTable = DifferenceTable;
    }

    /**
     * Get 未校验的 Limit 
     * @return SkippedLimit 未校验的 Limit
     */
    public Long getSkippedLimit() {
        return this.SkippedLimit;
    }

    /**
     * Set 未校验的 Limit
     * @param SkippedLimit 未校验的 Limit
     */
    public void setSkippedLimit(Long SkippedLimit) {
        this.SkippedLimit = SkippedLimit;
    }

    /**
     * Get 未校验的 Offset 
     * @return SkippedOffset 未校验的 Offset
     */
    public Long getSkippedOffset() {
        return this.SkippedOffset;
    }

    /**
     * Set 未校验的 Offset
     * @param SkippedOffset 未校验的 Offset
     */
    public void setSkippedOffset(Long SkippedOffset) {
        this.SkippedOffset = SkippedOffset;
    }

    /**
     * Get 搜索条件，未校验的库名 
     * @return SkippedDB 搜索条件，未校验的库名
     */
    public String getSkippedDB() {
        return this.SkippedDB;
    }

    /**
     * Set 搜索条件，未校验的库名
     * @param SkippedDB 搜索条件，未校验的库名
     */
    public void setSkippedDB(String SkippedDB) {
        this.SkippedDB = SkippedDB;
    }

    /**
     * Get 搜索条件，未校验的表名 
     * @return SkippedTable 搜索条件，未校验的表名
     */
    public String getSkippedTable() {
        return this.SkippedTable;
    }

    /**
     * Set 搜索条件，未校验的表名
     * @param SkippedTable 搜索条件，未校验的表名
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

