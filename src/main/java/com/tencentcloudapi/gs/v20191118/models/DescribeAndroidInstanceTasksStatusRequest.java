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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAndroidInstanceTasksStatusRequest extends AbstractModel {

    /**
    * 任务 ID 列表
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * 条件过滤器
    */
    @SerializedName("Filter")
    @Expose
    private Filter [] Filter;

    /**
    * 偏移量，默认为 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制量，默认为20，最大值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 时间范围限制，以天数为单位
    */
    @SerializedName("RecentDays")
    @Expose
    private Long RecentDays;

    /**
     * Get 任务 ID 列表 
     * @return TaskIds 任务 ID 列表
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set 任务 ID 列表
     * @param TaskIds 任务 ID 列表
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get 条件过滤器 
     * @return Filter 条件过滤器
     */
    public Filter [] getFilter() {
        return this.Filter;
    }

    /**
     * Set 条件过滤器
     * @param Filter 条件过滤器
     */
    public void setFilter(Filter [] Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 偏移量，默认为 0 
     * @return Offset 偏移量，默认为 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为 0
     * @param Offset 偏移量，默认为 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制量，默认为20，最大值为100 
     * @return Limit 限制量，默认为20，最大值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制量，默认为20，最大值为100
     * @param Limit 限制量，默认为20，最大值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 时间范围限制，以天数为单位 
     * @return RecentDays 时间范围限制，以天数为单位
     */
    public Long getRecentDays() {
        return this.RecentDays;
    }

    /**
     * Set 时间范围限制，以天数为单位
     * @param RecentDays 时间范围限制，以天数为单位
     */
    public void setRecentDays(Long RecentDays) {
        this.RecentDays = RecentDays;
    }

    public DescribeAndroidInstanceTasksStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAndroidInstanceTasksStatusRequest(DescribeAndroidInstanceTasksStatusRequest source) {
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.Filter != null) {
            this.Filter = new Filter[source.Filter.length];
            for (int i = 0; i < source.Filter.length; i++) {
                this.Filter[i] = new Filter(source.Filter[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.RecentDays != null) {
            this.RecentDays = new Long(source.RecentDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamArrayObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "RecentDays", this.RecentDays);

    }
}

