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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDataRetrievalTaskRequest extends AbstractModel {

    /**
    * <p>开始时间。须早于 EndTime ，仅支持查询最近3个月内的任务数据</p><p>参数格式：2024-11-19 10:15:37</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间。须晚于 StartTime ，仅支持查询最近3个月内的任务数据。</p><p>参数格式：2024-10-  19 10:15:37</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>数据检索ID示例值：dataretrieval-123456</p>
    */
    @SerializedName("DataRetrievalId")
    @Expose
    private String DataRetrievalId;

    /**
    * <p>分页的偏移量，默认值为0。 示例值：0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页单页限制数目，默认值为20，最大值100。 示例值：20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>DataRetrievalTaskID按照【数据检索任务id】进行过滤。类型：String</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get <p>开始时间。须早于 EndTime ，仅支持查询最近3个月内的任务数据</p><p>参数格式：2024-11-19 10:15:37</p> 
     * @return StartTime <p>开始时间。须早于 EndTime ，仅支持查询最近3个月内的任务数据</p><p>参数格式：2024-11-19 10:15:37</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间。须早于 EndTime ，仅支持查询最近3个月内的任务数据</p><p>参数格式：2024-11-19 10:15:37</p>
     * @param StartTime <p>开始时间。须早于 EndTime ，仅支持查询最近3个月内的任务数据</p><p>参数格式：2024-11-19 10:15:37</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间。须晚于 StartTime ，仅支持查询最近3个月内的任务数据。</p><p>参数格式：2024-10-  19 10:15:37</p> 
     * @return EndTime <p>结束时间。须晚于 StartTime ，仅支持查询最近3个月内的任务数据。</p><p>参数格式：2024-10-  19 10:15:37</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间。须晚于 StartTime ，仅支持查询最近3个月内的任务数据。</p><p>参数格式：2024-10-  19 10:15:37</p>
     * @param EndTime <p>结束时间。须晚于 StartTime ，仅支持查询最近3个月内的任务数据。</p><p>参数格式：2024-10-  19 10:15:37</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>数据检索ID示例值：dataretrieval-123456</p> 
     * @return DataRetrievalId <p>数据检索ID示例值：dataretrieval-123456</p>
     */
    public String getDataRetrievalId() {
        return this.DataRetrievalId;
    }

    /**
     * Set <p>数据检索ID示例值：dataretrieval-123456</p>
     * @param DataRetrievalId <p>数据检索ID示例值：dataretrieval-123456</p>
     */
    public void setDataRetrievalId(String DataRetrievalId) {
        this.DataRetrievalId = DataRetrievalId;
    }

    /**
     * Get <p>分页的偏移量，默认值为0。 示例值：0</p> 
     * @return Offset <p>分页的偏移量，默认值为0。 示例值：0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页的偏移量，默认值为0。 示例值：0</p>
     * @param Offset <p>分页的偏移量，默认值为0。 示例值：0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页单页限制数目，默认值为20，最大值100。 示例值：20</p> 
     * @return Limit <p>分页单页限制数目，默认值为20，最大值100。 示例值：20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页单页限制数目，默认值为20，最大值100。 示例值：20</p>
     * @param Limit <p>分页单页限制数目，默认值为20，最大值100。 示例值：20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>DataRetrievalTaskID按照【数据检索任务id】进行过滤。类型：String</p> 
     * @return Filters <p>DataRetrievalTaskID按照【数据检索任务id】进行过滤。类型：String</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>DataRetrievalTaskID按照【数据检索任务id】进行过滤。类型：String</p>
     * @param Filters <p>DataRetrievalTaskID按照【数据检索任务id】进行过滤。类型：String</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeDataRetrievalTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataRetrievalTaskRequest(DescribeDataRetrievalTaskRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.DataRetrievalId != null) {
            this.DataRetrievalId = new String(source.DataRetrievalId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "DataRetrievalId", this.DataRetrievalId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

