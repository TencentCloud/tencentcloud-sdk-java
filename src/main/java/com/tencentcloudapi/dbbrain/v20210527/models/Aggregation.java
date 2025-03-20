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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Aggregation extends AbstractModel {

    /**
    * 平均执行时间（ms）。
    */
    @SerializedName("AvgExecTime")
    @Expose
    private Long AvgExecTime;

    /**
    * 平均扫描行数。
    */
    @SerializedName("AvgDocsExamined")
    @Expose
    private Long AvgDocsExamined;

    /**
    * 产生慢查次数（/天）。
    */
    @SerializedName("SlowLogCount")
    @Expose
    private Long SlowLogCount;

    /**
    * 内存排序次数。
    */
    @SerializedName("SortCount")
    @Expose
    private Long SortCount;

    /**
    * 慢查模板概览。
    */
    @SerializedName("SlowLogs")
    @Expose
    private String [] SlowLogs;

    /**
     * Get 平均执行时间（ms）。 
     * @return AvgExecTime 平均执行时间（ms）。
     */
    public Long getAvgExecTime() {
        return this.AvgExecTime;
    }

    /**
     * Set 平均执行时间（ms）。
     * @param AvgExecTime 平均执行时间（ms）。
     */
    public void setAvgExecTime(Long AvgExecTime) {
        this.AvgExecTime = AvgExecTime;
    }

    /**
     * Get 平均扫描行数。 
     * @return AvgDocsExamined 平均扫描行数。
     */
    public Long getAvgDocsExamined() {
        return this.AvgDocsExamined;
    }

    /**
     * Set 平均扫描行数。
     * @param AvgDocsExamined 平均扫描行数。
     */
    public void setAvgDocsExamined(Long AvgDocsExamined) {
        this.AvgDocsExamined = AvgDocsExamined;
    }

    /**
     * Get 产生慢查次数（/天）。 
     * @return SlowLogCount 产生慢查次数（/天）。
     */
    public Long getSlowLogCount() {
        return this.SlowLogCount;
    }

    /**
     * Set 产生慢查次数（/天）。
     * @param SlowLogCount 产生慢查次数（/天）。
     */
    public void setSlowLogCount(Long SlowLogCount) {
        this.SlowLogCount = SlowLogCount;
    }

    /**
     * Get 内存排序次数。 
     * @return SortCount 内存排序次数。
     */
    public Long getSortCount() {
        return this.SortCount;
    }

    /**
     * Set 内存排序次数。
     * @param SortCount 内存排序次数。
     */
    public void setSortCount(Long SortCount) {
        this.SortCount = SortCount;
    }

    /**
     * Get 慢查模板概览。 
     * @return SlowLogs 慢查模板概览。
     */
    public String [] getSlowLogs() {
        return this.SlowLogs;
    }

    /**
     * Set 慢查模板概览。
     * @param SlowLogs 慢查模板概览。
     */
    public void setSlowLogs(String [] SlowLogs) {
        this.SlowLogs = SlowLogs;
    }

    public Aggregation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Aggregation(Aggregation source) {
        if (source.AvgExecTime != null) {
            this.AvgExecTime = new Long(source.AvgExecTime);
        }
        if (source.AvgDocsExamined != null) {
            this.AvgDocsExamined = new Long(source.AvgDocsExamined);
        }
        if (source.SlowLogCount != null) {
            this.SlowLogCount = new Long(source.SlowLogCount);
        }
        if (source.SortCount != null) {
            this.SortCount = new Long(source.SortCount);
        }
        if (source.SlowLogs != null) {
            this.SlowLogs = new String[source.SlowLogs.length];
            for (int i = 0; i < source.SlowLogs.length; i++) {
                this.SlowLogs[i] = new String(source.SlowLogs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AvgExecTime", this.AvgExecTime);
        this.setParamSimple(map, prefix + "AvgDocsExamined", this.AvgDocsExamined);
        this.setParamSimple(map, prefix + "SlowLogCount", this.SlowLogCount);
        this.setParamSimple(map, prefix + "SortCount", this.SortCount);
        this.setParamArraySimple(map, prefix + "SlowLogs.", this.SlowLogs);

    }
}

