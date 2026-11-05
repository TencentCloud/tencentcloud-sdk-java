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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScheduledTaskLogListRequest extends AbstractModel {

    /**
    * <p>任务 ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>偏移量，从 0 开始</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回数量，缺省为 20，最大 100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>是否返回聚合统计（Stats）</p>
    */
    @SerializedName("WithStats")
    @Expose
    private Boolean WithStats;

    /**
    * <p>过滤条件数组，多个 Filter 之间为 AND 关系，同一 Filter 内多个 Values 为 OR 关系</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get <p>任务 ID</p> 
     * @return TaskId <p>任务 ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务 ID</p>
     * @param TaskId <p>任务 ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>偏移量，从 0 开始</p> 
     * @return Offset <p>偏移量，从 0 开始</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，从 0 开始</p>
     * @param Offset <p>偏移量，从 0 开始</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>返回数量，缺省为 20，最大 100</p> 
     * @return Limit <p>返回数量，缺省为 20，最大 100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，缺省为 20，最大 100</p>
     * @param Limit <p>返回数量，缺省为 20，最大 100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>是否返回聚合统计（Stats）</p> 
     * @return WithStats <p>是否返回聚合统计（Stats）</p>
     */
    public Boolean getWithStats() {
        return this.WithStats;
    }

    /**
     * Set <p>是否返回聚合统计（Stats）</p>
     * @param WithStats <p>是否返回聚合统计（Stats）</p>
     */
    public void setWithStats(Boolean WithStats) {
        this.WithStats = WithStats;
    }

    /**
     * Get <p>过滤条件数组，多个 Filter 之间为 AND 关系，同一 Filter 内多个 Values 为 OR 关系</p> 
     * @return Filters <p>过滤条件数组，多个 Filter 之间为 AND 关系，同一 Filter 内多个 Values 为 OR 关系</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件数组，多个 Filter 之间为 AND 关系，同一 Filter 内多个 Values 为 OR 关系</p>
     * @param Filters <p>过滤条件数组，多个 Filter 之间为 AND 关系，同一 Filter 内多个 Values 为 OR 关系</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeScheduledTaskLogListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScheduledTaskLogListRequest(DescribeScheduledTaskLogListRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.WithStats != null) {
            this.WithStats = new Boolean(source.WithStats);
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
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "WithStats", this.WithStats);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

